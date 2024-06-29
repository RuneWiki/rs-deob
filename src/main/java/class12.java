import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class20 {

    @OriginalMember(owner = "client!bd", name = "Ob", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!bd", name = "Qb", descriptor = "Ljava/lang/Class;")
    public static Class field247;

    @OriginalMember(owner = "client!bd", name = "Nb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field244;

    @OriginalMember(owner = "client!bd", name = "Mb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field243;

    @OriginalMember(owner = "client!bd", name = "Pb", descriptor = "[B")
    private byte[] field246;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
    public final void method97() {
        if (this.field243 != null) {
            this.field243.close();
            this.field243 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method98() {
        return this.field245 - (this.field243.available() >> (class59.field1633 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method99(Component arg0) {
        this.field244 = new AudioFormat((float) class85.field2224, 16, class59.field1633 ? 2 : 1, true, false);
        this.field246 = new byte[0x100 << (class59.field1633 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public final void method100() {
        this.field243.flush();
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public final void method101(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field247 == null ? (field247 = method103("javax.sound.sampled.SourceDataLine")) : field247, this.field244, arg0 << (class59.field1633 ? 2 : 1));
            this.field243 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field243.open();
            this.field243.start();
            this.field245 = arg0;
        } catch (LineUnavailableException var4) {
            if (class101.method851(101, arg0) == 1) {
                this.field243 = null;
                throw var4;
            } else {
                this.method101(class144.method1153(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
    public final void method102() {
        int var1 = 256;
        if (class59.field1633) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field508[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field246[var2 * 2] = (byte) (var3 >> 8);
            this.field246[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field243.write(this.field246, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method103(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
