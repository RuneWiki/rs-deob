import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class47 {

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field332;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field329;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field328;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "[B")
    private byte[] field330;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
    public final void method120() {
        if (this.field328 != null) {
            this.field328.close();
            this.field328 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method121(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field332 == null ? (field332 = method126("javax.sound.sampled.SourceDataLine")) : field332, this.field329, arg0 << (class3.field46 ? 2 : 1));
            this.field328 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field328.open();
            this.field328.start();
            this.field331 = arg0;
        } catch (LineUnavailableException var4) {
            if (class100.method557(arg0, false) == 1) {
                this.field328 = null;
                throw var4;
            } else {
                this.method121(class195.method1255(arg0, (byte) -1));
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()V")
    public final void method122() {
        this.field328.flush();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()I")
    public final int method123() {
        return this.field331 - (this.field328.available() >> (class3.field46 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method124(Component arg0) {
        this.field329 = new AudioFormat((float) class170.field3385, 16, class3.field46 ? 2 : 1, true, false);
        this.field330 = new byte[0x100 << (class3.field46 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()V")
    public final void method125() {
        int var1 = 256;
        if (class3.field46) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field748[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field330[var2 * 2] = (byte) (var3 >> 8);
            this.field330[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field328.write(this.field330, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method126(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
