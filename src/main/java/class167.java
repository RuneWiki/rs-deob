import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class167 extends class234 {

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "Z")
    private boolean field2591 = false;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2594;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2590;

    @OriginalMember(owner = "client!wp", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2593;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "[B")
    private byte[] field2589;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "()V", line = 11)
    public final void method1139() {
        if (this.field2593 != null) {
            this.field2593.close();
            this.field2593 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()V", line = 25)
    public final void method1140() {
        int var1 = 256;
        if (class79.field1234) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3293[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2589[var2 * 2] = (byte) (var3 >> 8);
            this.field2589[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2593.write(this.field2589, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "()I", line = 60)
    public final int method1141() {
        return this.field2592 - (this.field2593.available() >> (class79.field1234 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V", line = 69)
    public final void method1142(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2594 == null ? (field2594 = method1145("javax.sound.sampled.SourceDataLine")) : field2594, this.field2590, arg0 << (class79.field1234 ? 2 : 1));
            this.field2593 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2593.open();
            this.field2593.start();
            this.field2592 = arg0;
        } catch (LineUnavailableException var4) {
            if (class50.method341(-21515, arg0) == 1) {
                this.field2593 = null;
                throw var4;
            } else {
                this.method1142(class587.method3231(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 69)
    public static Class method1145(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V", line = 90)
    public final void method1143() throws LineUnavailableException {
        this.field2593.flush();
        if (!this.field2591) {
            return;
        }
        this.field2593.close();
        this.field2593 = null;
        Info var1 = new Info(field2594 == null ? (field2594 = method1145("javax.sound.sampled.SourceDataLine")) : field2594, this.field2590, this.field2592 << (class79.field1234 ? 2 : 1));
        this.field2593 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2593.open();
        this.field2593.start();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 112)
    public final void method1144(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2591 = true;
                    }
                }
            }
        }
        this.field2590 = new AudioFormat((float) class443.field6071, 16, class79.field1234 ? 2 : 1, true, false);
        this.field2589 = new byte[0x100 << (class79.field1234 ? 2 : 1)];
    }
}
