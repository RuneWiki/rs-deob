import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jd")
public class class89 extends class9 {

    @OriginalMember(owner = "jd", name = "N", descriptor = "I")
    private int field1844;

    @OriginalMember(owner = "jd", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1847;

    @OriginalMember(owner = "jd", name = "D", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1843;

    @OriginalMember(owner = "jd", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1845;

    @OriginalMember(owner = "jd", name = "P", descriptor = "[B")
    private byte[] field1846;

    @OriginalMember(owner = "jd", name = "b", descriptor = "(I)V")
    public final void method42(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1847 == null ? (field1847 = method658("javax.sound.sampled.SourceDataLine")) : field1847, this.field1843, arg0 << (class169.field3133 ? 2 : 1));
            this.field1845 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1845.open();
            this.field1845.start();
            this.field1844 = arg0;
        } catch (LineUnavailableException var4) {
            if (class3.method11(1834, arg0) == 1) {
                this.field1845 = null;
                throw var4;
            } else {
                this.method42(class125.method913(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "jd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method54(Component arg0) {
        this.field1843 = new AudioFormat((float) class23.field519, 16, class169.field3133 ? 2 : 1, true, false);
        this.field1846 = new byte[0x100 << (class169.field3133 ? 2 : 1)];
    }

    @OriginalMember(owner = "jd", name = "d", descriptor = "()V")
    public final void method53() {
        this.field1845.flush();
    }

    @OriginalMember(owner = "jd", name = "a", descriptor = "()I")
    public final int method41() {
        return this.field1844 - (this.field1845.available() >> (class169.field3133 ? 2 : 1));
    }

    @OriginalMember(owner = "jd", name = "c", descriptor = "()V")
    public final void method51() {
        int var1 = 256;
        if (class169.field3133) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field136[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1846[var2 * 2] = (byte) (var3 >> 8);
            this.field1846[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1845.write(this.field1846, 0, var1 << 1);
    }

    @OriginalMember(owner = "jd", name = "b", descriptor = "()V")
    public final void method46() {
        if (this.field1845 != null) {
            this.field1845.close();
            this.field1845 = null;
        }
    }

    @OriginalMember(owner = "jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method658(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            try {
                throw (new NoClassDefFoundError()).initCause(var2);
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
