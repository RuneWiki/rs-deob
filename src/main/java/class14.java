import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 extends class113 {

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[B")
    private byte[] field260 = new byte[512];

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field258 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field261;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field259;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 9)
    public class14() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V", line = 18)
    public final void method89() {
        if (this.field259 != null) {
            this.field259.close();
            this.field259 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V", line = 32)
    public final void method90() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2853[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field260[var1 * 2] = (byte) (var2 >> 8);
            this.field260[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field259.write(this.field260, 0, 512);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 52)
    public final void method91(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field261 == null ? (field261 = method93("javax.sound.sampled.SourceDataLine")) : field261, this.field258, arg0 * 2);
            this.field259 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field259.open();
            this.field259.start();
        } catch (LineUnavailableException var4) {
            this.field259 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 52)
    public static Class method93(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()I", line = 66)
    public final int method92() {
        return this.field259.available() >> 1;
    }
}
