import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class188 extends class169 {

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field3582;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3580;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3579;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[B")
    private byte[] field3581;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
    public final void method49() {
        int var1 = 256;
        if (class139.field2713) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3251[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3581[var2 * 2] = (byte) (var3 >> 8);
            this.field3581[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3579.write(this.field3581, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
    public final void method51() {
        this.field3579.flush();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method48(Component arg0) {
        this.field3580 = new AudioFormat((float) class161.field3075, 16, class139.field2713 ? 2 : 1, true, false);
        this.field3581 = new byte[0x100 << (class139.field2713 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
    public final int method47() {
        return this.field3578 - (this.field3579.available() >> (class139.field2713 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()V")
    public final void method50() {
        if (this.field3579 != null) {
            this.field3579.close();
            this.field3579 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public final void method45(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3582 == null ? (field3582 = method1256("javax.sound.sampled.SourceDataLine")) : field3582, this.field3580, arg0 << (class139.field2713 ? 2 : 1));
            this.field3579 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3579.open();
            this.field3579.start();
            this.field3578 = arg0;
        } catch (LineUnavailableException var4) {
            if (class18.method110(arg0, (byte) -37) == 1) {
                this.field3579 = null;
                throw var4;
            } else {
                this.method45(class56.method459(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1256(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
