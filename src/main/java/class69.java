import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class69 extends class45 {

    @OriginalMember(owner = "client!l", name = "R", descriptor = "[B")
    private byte[] field1784 = new byte[512];

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1783 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1786;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1785;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()V", line = 11)
    public final void method382() {
        if (this.field1785 != null) {
            this.field1785.close();
            this.field1785 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 23)
    public class69() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V", line = 36)
    public final void method387() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field1190[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1784[var1 * 2] = (byte) (var2 >> 8);
            this.field1784[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1785.write(this.field1784, 0, 512);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 55)
    public final void method383(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1786 == null ? (field1786 = method573("javax.sound.sampled.SourceDataLine")) : field1786, this.field1783, arg0 * 2);
            this.field1785 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1785.open();
            this.field1785.start();
        } catch (LineUnavailableException var4) {
            this.field1785 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 55)
    public static Class method573(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I", line = 69)
    public final int method380() {
        return this.field1785.available() >> 1;
    }
}
