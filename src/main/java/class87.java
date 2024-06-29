import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class114 {

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field2029;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2026;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2027;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[B")
    private byte[] field2025;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method141(Component arg0) {
        this.field2026 = new AudioFormat((float) class139.field3213, 16, class56.field1311 ? 2 : 1, true, false);
        this.field2025 = new byte[0x100 << (class56.field1311 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method143(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2029 == null ? (field2029 = method670("javax.sound.sampled.SourceDataLine")) : field2029, this.field2026, arg0 << (class56.field1311 ? 2 : 1));
            this.field2027 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2027.open();
            this.field2027.start();
            this.field2028 = arg0;
        } catch (LineUnavailableException var4) {
            if (class121.method961(-125, arg0) == 1) {
                this.field2027 = null;
                throw var4;
            } else {
                this.method143(class44.method343(arg0, -30310));
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public final int method138() {
        return this.field2028 - (this.field2027.available() >> (class56.field1311 ? 2 : 1));
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
    public final void method142() {
        this.field2027.flush();
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
    public final void method144() {
        if (this.field2027 != null) {
            this.field2027.close();
            this.field2027 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public final void method139() {
        int var1 = 256;
        if (class56.field1311) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2658[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2025[var2 * 2] = (byte) (var3 >> 8);
            this.field2025[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2027.write(this.field2025, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method670(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
