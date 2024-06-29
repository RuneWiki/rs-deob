import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class45 {

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field464;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field461;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field460;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "[B")
    private byte[] field462;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public final void method170() {
        if (this.field460 != null) {
            this.field460.close();
            this.field460 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method171(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field464 == null ? (field464 = method176("javax.sound.sampled.SourceDataLine")) : field464, this.field461, arg0 << (class41.field972 ? 2 : 1));
            this.field460 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field460.open();
            this.field460.start();
            this.field463 = arg0;
        } catch (LineUnavailableException var4) {
            if (class108.method860(252645135, arg0) == 1) {
                this.field460 = null;
                throw var4;
            } else {
                this.method171(class133.method1022(15702, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method172(Component arg0) {
        this.field461 = new AudioFormat((float) class85.field2084, 16, class41.field972 ? 2 : 1, true, false);
        this.field462 = new byte[0x100 << (class41.field972 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    public final void method173() {
        this.field460.flush();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public final void method174() {
        int var1 = 256;
        if (class41.field972) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1060[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field462[var2 * 2] = (byte) (var3 >> 8);
            this.field462[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field460.write(this.field462, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()I")
    public final int method175() {
        return this.field463 - (this.field460.available() >> (class41.field972 ? 2 : 1));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method176(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
