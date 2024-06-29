import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 extends class65 {

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[B")
    private byte[] field2113 = new byte[512];

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2112 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2115;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2114;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 11)
    public final void method485(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2115 == null ? (field2115 = method612("javax.sound.sampled.SourceDataLine")) : field2115, this.field2112, arg0 * 2);
            this.field2114 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2114.open();
            this.field2114.start();
        } catch (LineUnavailableException var4) {
            this.field2114 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method612(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 26)
    public class83() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 36)
    public final void method483() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field1599[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field2113[var1 * 2] = (byte) (var2 >> 8);
            this.field2113[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field2114.write(this.field2113, 0, 512);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 53)
    public final int method488() {
        return this.field2114.available() >> 1;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 63)
    public final void method493() {
        if (this.field2114 != null) {
            this.field2114.close();
            this.field2114 = null;
        }
    }
}
