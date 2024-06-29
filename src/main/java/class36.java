import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class75 {

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field833;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field831;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field829;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "[B")
    private byte[] field832;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public final void method275() {
        if (this.field829 != null) {
            this.field829.close();
            this.field829 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public final void method276() {
        this.field829.flush();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public final void method277() {
        int var1 = 256;
        if (class125.field2990) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1748[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field832[var2 * 2] = (byte) (var3 >> 8);
            this.field832[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field829.write(this.field832, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method278(Component arg0) {
        this.field831 = new AudioFormat((float) class138.field3361, 16, class125.field2990 ? 2 : 1, true, false);
        this.field832 = new byte[0x100 << (class125.field2990 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final void method279(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field833 == null ? (field833 = method281("javax.sound.sampled.SourceDataLine")) : field833, this.field831, arg0 << (class125.field2990 ? 2 : 1));
            this.field829 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field829.open();
            this.field829.start();
            this.field830 = arg0;
        } catch (LineUnavailableException var4) {
            if (class43.method328(24516, arg0) == 1) {
                this.field829 = null;
                throw var4;
            } else {
                this.method279(class68.method548(arg0, -21815));
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public final int method280() {
        return this.field830 - (this.field829.available() >> (class125.field2990 ? 2 : 1));
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method281(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
