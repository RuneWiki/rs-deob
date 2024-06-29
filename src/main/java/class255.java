import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class255 extends class55 {

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
    private boolean field3529 = false;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field3534;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3530;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3533;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[B")
    private byte[] field3532;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method405(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3534 == null ? (field3534 = method1648("javax.sound.sampled.SourceDataLine")) : field3534, this.field3530, arg0 << (class103.field1483 ? 2 : 1));
            this.field3533 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3533.open();
            this.field3533.start();
            this.field3531 = arg0;
        } catch (LineUnavailableException var4) {
            if (class214.method1472(arg0, -190648304) == 1) {
                this.field3533 = null;
                throw var4;
            } else {
                this.method405(class475.method2835(arg0, -1));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public final void method399() {
        if (this.field3533 != null) {
            this.field3533.close();
            this.field3533 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public final void method398() {
        int var1 = 256;
        if (class103.field1483) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field785[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3532[var2 * 2] = (byte) (var3 >> 8);
            this.field3532[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3533.write(this.field3532, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method400() throws LineUnavailableException {
        this.field3533.flush();
        if (!this.field3529) {
            return;
        }
        this.field3533.close();
        this.field3533 = null;
        Info var1 = new Info(field3534 == null ? (field3534 = method1648("javax.sound.sampled.SourceDataLine")) : field3534, this.field3530, this.field3531 << (class103.field1483 ? 2 : 1));
        this.field3533 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3533.open();
        this.field3533.start();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
    public final int method411() {
        return this.field3531 - (this.field3533.available() >> (class103.field1483 ? 2 : 1));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method397(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3529 = true;
                    }
                }
            }
        }
        this.field3530 = new AudioFormat((float) class56.field818, 16, class103.field1483 ? 2 : 1, true, false);
        this.field3532 = new byte[0x100 << (class103.field1483 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1648(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
