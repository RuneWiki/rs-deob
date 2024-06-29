import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class79 {

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[B")
    private byte[] field58 = new byte[512];

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field59 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field61;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field60;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 11)
    public final void method44(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field61 == null ? (field61 = method48("javax.sound.sampled.SourceDataLine")) : field61, this.field59, arg0 * 2);
            this.field60 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field60.open();
            this.field60.start();
        } catch (LineUnavailableException var4) {
            this.field60 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method48(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()I", line = 25)
    public final int method45() {
        return this.field60.available() >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 36)
    public class5() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()V", line = 45)
    public final void method46() {
        if (this.field60 != null) {
            this.field60.close();
            this.field60 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V", line = 60)
    public final void method47() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field1774[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field58[var1 * 2] = (byte) (var2 >> 8);
            this.field58[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field60.write(this.field58, 0, 512);
    }
}
