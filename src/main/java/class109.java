import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class109 extends class112 {

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "[B")
    private byte[] field2464 = new byte[512];

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2462 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field2465;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2463;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 11)
    public final void method631(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2465 == null ? (field2465 = method804("javax.sound.sampled.SourceDataLine")) : field2465, this.field2462, arg0 * 2);
            this.field2463 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2463.open();
            this.field2463.start();
        } catch (LineUnavailableException var4) {
            this.field2463 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method804(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()I", line = 27)
    public final int method629() {
        return this.field2463.available() >> 1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 33)
    public class109() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 46)
    public final void method630() {
        if (this.field2463 != null) {
            this.field2463.close();
            this.field2463 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V", line = 59)
    public final void method632() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2490[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field2464[var1 * 2] = (byte) (var2 >> 8);
            this.field2464[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field2463.write(this.field2464, 0, 512);
    }
}
