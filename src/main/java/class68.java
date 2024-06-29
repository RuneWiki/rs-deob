import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 extends class127 {

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[B")
    private byte[] field1595 = new byte[512];

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1594 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1597;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1596;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 12)
    public final void method235(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1597 == null ? (field1597 = method538("javax.sound.sampled.SourceDataLine")) : field1597, this.field1594, arg0 * 2);
            this.field1596 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1596.open();
            this.field1596.start();
        } catch (LineUnavailableException var4) {
            this.field1596 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method538(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 25)
    public class68() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 35)
    public final void method236() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field3038[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1595[var1 * 2] = (byte) (var2 >> 8);
            this.field1595[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1596.write(this.field1595, 0, 512);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 57)
    public final void method234() {
        if (this.field1596 != null) {
            this.field1596.close();
            this.field1596 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()I", line = 69)
    public final int method237() {
        return this.field1596.available() >> 1;
    }
}
