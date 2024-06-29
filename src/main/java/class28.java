import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class81 {

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field672;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field670;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field669;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[B")
    private byte[] field671;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
    public final void method286() {
        int var1 = 256;
        if (class32.field782) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1804[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field671[var2 * 2] = (byte) (var3 >> 8);
            this.field671[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field669.write(this.field671, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public final void method287() {
        if (this.field669 != null) {
            this.field669.close();
            this.field669 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method288() {
        this.field669.flush();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
    public final int method289() {
        return this.field668 - (this.field669.available() >> (class32.field782 ? 2 : 1));
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method290(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field672 == null ? (field672 = method292("javax.sound.sampled.SourceDataLine")) : field672, this.field670, arg0 << (class32.field782 ? 2 : 1));
            this.field669 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field669.open();
            this.field669.start();
            this.field668 = arg0;
        } catch (LineUnavailableException var4) {
            if (class26.method276(arg0, 1021849956) == 1) {
                this.field669 = null;
                throw var4;
            } else {
                this.method290(class63.method521(9860, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method291(Component arg0) {
        this.field670 = new AudioFormat((float) class8.field194, 16, class32.field782 ? 2 : 1, true, false);
        this.field671 = new byte[0x100 << (class32.field782 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method292(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
