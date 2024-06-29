import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class47 {

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "[B")
    private byte[] field870 = new byte[512];

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field869 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field872;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field871;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 11)
    public final void method369(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field872 == null ? (field872 = method373("javax.sound.sampled.SourceDataLine")) : field872, this.field869, arg0 * 2);
            this.field871 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field871.open();
            this.field871.start();
        } catch (LineUnavailableException var4) {
            this.field871 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method373(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 26)
    public final void method370() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field996[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field870[var1 * 2] = (byte) (var2 >> 8);
            this.field870[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field871.write(this.field870, 0, 512);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 44)
    public final void method371() {
        if (this.field871 != null) {
            this.field871.close();
            this.field871 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 67)
    public class43() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()I", line = 61)
    public final int method372() {
        return this.field871.available() >> 1;
    }
}
