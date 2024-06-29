import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 extends class86 {

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[B")
    private byte[] field1444 = new byte[512];

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1443 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1446;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1445;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V", line = 10)
    public final void method472() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2054[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1444[var1 * 2] = (byte) (var2 >> 8);
            this.field1444[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1445.write(this.field1444, 0, 512);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V", line = 27)
    public final void method473() {
        if (this.field1445 != null) {
            this.field1445.close();
            this.field1445 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 41)
    public final void method474(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1446 == null ? (field1446 = method476("javax.sound.sampled.SourceDataLine")) : field1446, this.field1443, arg0 * 2);
            this.field1445 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1445.open();
            this.field1445.start();
        } catch (LineUnavailableException var4) {
            this.field1445 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 41)
    public static Class method476(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "()I", line = 57)
    public final int method475() {
        return this.field1445.available() >> 1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 63)
    public class57() throws Exception {
        super(22050);
    }
}
