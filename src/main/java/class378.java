import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class378 extends class261 {

    @OriginalMember(owner = "client!go", name = "N", descriptor = "Z")
    private boolean field5551 = false;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5555;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5553;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5550;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "[B")
    private byte[] field5554;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "()V")
    public final void method1655() {
        int var1 = 256;
        if (class614.field9002) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3845[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5554[var2 * 2] = (byte) (var3 >> 8);
            this.field5554[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5550.write(this.field5554, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1657(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5551 = true;
                    }
                }
            }
        }
        this.field5553 = new AudioFormat((float) class36.field419, 16, class614.field9002 ? 2 : 1, true, false);
        this.field5554 = new byte[0x100 << (class614.field9002 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
    public final void method1662(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5555 == null ? (field5555 = method2300("javax.sound.sampled.SourceDataLine")) : field5555, this.field5553, arg0 << (class614.field9002 ? 2 : 1));
            this.field5550 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5550.open();
            this.field5550.start();
            this.field5552 = arg0;
        } catch (LineUnavailableException var4) {
            if (class462.method2744(12, arg0) == 1) {
                this.field5550 = null;
                throw var4;
            } else {
                this.method1662(class479.method2908((byte) -99, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "()V")
    public final void method1663() throws LineUnavailableException {
        this.field5550.flush();
        if (!this.field5551) {
            return;
        }
        this.field5550.close();
        this.field5550 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5555 == null ? (field5555 = method2300("javax.sound.sampled.SourceDataLine")) : field5555, this.field5553, this.field5552 << (class614.field9002 ? 2 : 1));
        this.field5550 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5550.open();
        this.field5550.start();
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
    public final void method1654() {
        if (this.field5550 != null) {
            this.field5550.close();
            this.field5550 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()I")
    public final int method1651() {
        return this.field5552 - (this.field5550.available() >> (class614.field9002 ? 2 : 1));
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2300(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
