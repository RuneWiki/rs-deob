import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class72 extends class36 {

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "[B")
    private byte[] field1702 = new byte[512];

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1701 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1704;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1703;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 11)
    public final void method224(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1704 == null ? (field1704 = method493("javax.sound.sampled.SourceDataLine")) : field1704, this.field1701, arg0 * 2);
            this.field1703 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1703.open();
            this.field1703.start();
        } catch (LineUnavailableException var4) {
            this.field1703 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method493(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 26)
    public final void method226() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field908[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1702[var1 * 2] = (byte) (var2 >> 8);
            this.field1702[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1703.write(this.field1702, 0, 512);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I", line = 43)
    public final int method230() {
        return this.field1703.available() >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V", line = 52)
    public final void method227() {
        if (this.field1703 != null) {
            this.field1703.close();
            this.field1703 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 68)
    public class72() throws Exception {
        super(22050);
    }
}
