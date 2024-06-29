import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class28 {

    @OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
    private boolean field66 = false;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field70;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field68;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field67;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "[B")
    private byte[] field69;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
    public final void method40() {
        if (this.field67 != null) {
            this.field67.close();
            this.field67 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    public final void method41(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field70 == null ? (field70 = method46("javax.sound.sampled.SourceDataLine")) : field70, this.field68, arg0 << (class325.field4696 ? 2 : 1));
            this.field67 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field67.open();
            this.field67.start();
            this.field65 = arg0;
        } catch (LineUnavailableException var4) {
            if (class643.method3657(4, arg0) == 1) {
                this.field67 = null;
                throw var4;
            } else {
                this.method41(class367.method2354(-224121456, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method42(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field66 = true;
                    }
                }
            }
        }
        this.field68 = new AudioFormat((float) class292.field4050, 16, class325.field4696 ? 2 : 1, true, false);
        this.field69 = new byte[0x100 << (class325.field4696 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()I")
    public final int method43() {
        return this.field65 - (this.field67.available() >> (class325.field4696 ? 2 : 1));
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
    public final void method44() {
        int var1 = 256;
        if (class325.field4696) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field304[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field69[var2 * 2] = (byte) (var3 >> 8);
            this.field69[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field67.write(this.field69, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
    public final void method45() throws LineUnavailableException {
        this.field67.flush();
        if (!this.field66) {
            return;
        }
        this.field67.close();
        this.field67 = null;
        Info var1 = new Info(field70 == null ? (field70 = method46("javax.sound.sampled.SourceDataLine")) : field70, this.field68, this.field65 << (class325.field4696 ? 2 : 1));
        this.field67 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field67.open();
        this.field67.start();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method46(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
