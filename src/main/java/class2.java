import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class176 {

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field26;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field23;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field22;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[B")
    private byte[] field25;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method19(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field26 == null ? (field26 = method25("javax.sound.sampled.SourceDataLine")) : field26, this.field23, arg0 << (class10.field195 ? 2 : 1));
            this.field22 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field22.open();
            this.field22.start();
            this.field24 = arg0;
        } catch (LineUnavailableException var4) {
            if (class210.method1368((byte) 62, arg0) == 1) {
                this.field22 = null;
                throw var4;
            } else {
                this.method19(class200.method1318(-32402, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()I")
    public final int method20() {
        return this.field24 - (this.field22.available() >> (class10.field195 ? 2 : 1));
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
    public final void method21() {
        int var1 = 256;
        if (class10.field195) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3529[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field25[var2 * 2] = (byte) (var3 >> 8);
            this.field25[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field22.write(this.field25, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method22(Component arg0) {
        this.field23 = new AudioFormat((float) class188.field3736, 16, class10.field195 ? 2 : 1, true, false);
        this.field25 = new byte[0x100 << (class10.field195 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
    public final void method23() {
        this.field22.flush();
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public final void method24() {
        if (this.field22 != null) {
            this.field22.close();
            this.field22 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method25(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
