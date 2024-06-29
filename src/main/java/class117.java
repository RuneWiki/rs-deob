import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class117 extends class134 {

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field2890;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field2892;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2889;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2891;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "[B")
    private byte[] field2888;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
    public final void method549() {
        if (this.field2891 != null) {
            this.field2891.close();
            this.field2891 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method551(Component arg0) {
        this.field2889 = new AudioFormat((float) class33.field792, 16, class130.field3203 ? 2 : 1, true, false);
        this.field2888 = new byte[0x100 << (class130.field3203 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V")
    public final void method550() {
        this.field2891.flush();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public final void method545(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2892 == null ? (field2892 = method991("javax.sound.sampled.SourceDataLine")) : field2892, this.field2889, arg0 << (class130.field3203 ? 2 : 1));
            this.field2891 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2891.open();
            this.field2891.start();
            this.field2890 = arg0;
        } catch (LineUnavailableException var4) {
            if (class53.method443(0, arg0) == 1) {
                this.field2891 = null;
                throw var4;
            } else {
                this.method545(class1.method3(-273565982, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()I")
    public final int method546() {
        return this.field2890 - (this.field2891.available() >> (class130.field3203 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()V")
    public final void method547() {
        int var1 = 256;
        if (class130.field3203) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3265[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2888[var2 * 2] = (byte) (var3 >> 8);
            this.field2888[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2891.write(this.field2888, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method991(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
