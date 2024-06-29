import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 extends class71 {

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[B")
    private byte[] field1905 = new byte[512];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1907 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1908;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1906;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method561() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field1582[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1905[var1 * 2] = (byte) (var2 >> 8);
            this.field1905[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1906.write(this.field1905, 0, 512);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public final int method560() {
        return this.field1906.available() >> 1;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class85() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public final void method558() {
        this.field1906.close();
        this.field1906 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method553(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1908 == null ? (field1908 = method638("javax.sound.sampled.SourceDataLine")) : field1908, this.field1907, arg0 * 2);
            this.field1906 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1906.open();
            this.field1906.start();
        } catch (LineUnavailableException var4) {
            this.field1906 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method638(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
