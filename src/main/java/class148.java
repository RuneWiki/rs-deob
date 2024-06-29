import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class148 extends class31 {

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    private int field3417;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field3421;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3418;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3419;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "[B")
    private byte[] field3420;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
    public final void method265() {
        this.field3419.flush();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
    public final void method256() {
        if (this.field3419 != null) {
            this.field3419.close();
            this.field3419 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3421 == null ? (field3421 = method1185("javax.sound.sampled.SourceDataLine")) : field3421, this.field3418, arg0 << (class19.field387 ? 2 : 1));
            this.field3419 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3419.open();
            this.field3419.start();
            this.field3417 = arg0;
        } catch (LineUnavailableException var4) {
            if (class139.method1135(arg0, (byte) 70) == 1) {
                this.field3419 = null;
                throw var4;
            } else {
                this.method262(class3.method20(arg0, 500));
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I")
    public final int method257() {
        return this.field3417 - (this.field3419.available() >> (class19.field387 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
    public final void method272() {
        int var1 = 256;
        if (class19.field387) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field703[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3420[var2 * 2] = (byte) (var3 >> 8);
            this.field3420[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3419.write(this.field3420, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method270(Component arg0) {
        this.field3418 = new AudioFormat((float) class5.field89, 16, class19.field387 ? 2 : 1, true, false);
        this.field3420 = new byte[0x100 << (class19.field387 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1185(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
