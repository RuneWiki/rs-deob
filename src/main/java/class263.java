import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class263 extends class509 {

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
    private boolean field3535 = false;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field3537;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3533;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3534;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "[B")
    private byte[] field3532;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
    public final void method961() throws LineUnavailableException {
        this.field3534.flush();
        if (!this.field3535) {
            return;
        }
        this.field3534.close();
        this.field3534 = null;
        Info var1 = new Info(field3537 == null ? (field3537 = method1550("javax.sound.sampled.SourceDataLine")) : field3537, this.field3533, this.field3536 << (class163.field2472 ? 2 : 1));
        this.field3534 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3534.open();
        this.field3534.start();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method957(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3535 = true;
                    }
                }
            }
        }
        this.field3533 = new AudioFormat((float) class506.field7397, 16, class163.field2472 ? 2 : 1, true, false);
        this.field3532 = new byte[0x100 << (class163.field2472 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public final void method959(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3537 == null ? (field3537 = method1550("javax.sound.sampled.SourceDataLine")) : field3537, this.field3533, arg0 << (class163.field2472 ? 2 : 1));
            this.field3534 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3534.open();
            this.field3534.start();
            this.field3536 = arg0;
        } catch (LineUnavailableException var4) {
            if (class342.method2071(arg0, 13549) == 1) {
                this.field3534 = null;
                throw var4;
            } else {
                this.method959(class274.method1604(arg0, (byte) -102));
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()I")
    public final int method956() {
        return this.field3536 - (this.field3534.available() >> (class163.field2472 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
    public final void method962() {
        int var1 = 256;
        if (class163.field2472) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7430[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3532[var2 * 2] = (byte) (var3 >> 8);
            this.field3532[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3534.write(this.field3532, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public final void method960() {
        if (this.field3534 != null) {
            this.field3534.close();
            this.field3534 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1550(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
