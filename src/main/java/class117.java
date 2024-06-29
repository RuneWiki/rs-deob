import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class57 {

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field2682;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2678;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2679;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[B")
    private byte[] field2681;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method285(Component arg0) {
        this.field2678 = new AudioFormat((float) class144.field3371, 16, class8.field231 ? 2 : 1, true, false);
        this.field2681 = new byte[0x100 << (class8.field231 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
    public final void method287() {
        this.field2679.flush();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method281(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2682 == null ? (field2682 = method944("javax.sound.sampled.SourceDataLine")) : field2682, this.field2678, arg0 << (class8.field231 ? 2 : 1));
            this.field2679 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2679.open();
            this.field2679.start();
            this.field2680 = arg0;
        } catch (LineUnavailableException var4) {
            if (class63.method482(arg0, (byte) -3) == 1) {
                this.field2679 = null;
                throw var4;
            } else {
                this.method281(class59.method426((byte) 122, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
    public final void method283() {
        int var1 = 256;
        if (class8.field231) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1400[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2681[var2 * 2] = (byte) (var3 >> 8);
            this.field2681[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2679.write(this.field2681, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
    public final int method286() {
        return this.field2680 - (this.field2679.available() >> (class8.field231 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V")
    public final void method284() {
        if (this.field2679 != null) {
            this.field2679.close();
            this.field2679 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method944(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
