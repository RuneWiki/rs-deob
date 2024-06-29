import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class53 extends class184 {

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field984;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field983;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field981;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "[B")
    private byte[] field982;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method231(Component arg0) {
        this.field983 = new AudioFormat((float) class70.field1313, 16, class51.field931 ? 2 : 1, true, false);
        this.field982 = new byte[0x100 << (class51.field931 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public final void method230() {
        if (this.field981 != null) {
            this.field981.close();
            this.field981 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    public final void method228() {
        this.field981.flush();
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
    public final void method233() {
        int var1 = 256;
        if (class51.field931) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3585[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field982[var2 * 2] = (byte) (var3 >> 8);
            this.field982[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field981.write(this.field982, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field984 == null ? (field984 = method342("javax.sound.sampled.SourceDataLine")) : field984, this.field983, arg0 << (class51.field931 ? 2 : 1));
            this.field981 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field981.open();
            this.field981.start();
            this.field980 = arg0;
        } catch (LineUnavailableException var4) {
            if (class149.method976(true, arg0) == 1) {
                this.field981 = null;
                throw var4;
            } else {
                this.method229(class11.method58(arg0, 23068));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
    public final int method227() {
        return this.field980 - (this.field981.available() >> (class51.field931 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method342(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
