import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class148 extends class147 {

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field3700;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3697;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3696;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[B")
    private byte[] field3698;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I", line = 9)
    public final int method780() {
        return this.field3699 - (this.field3696.available() >> (class12.field319 ? 2 : 1));
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V", line = 16)
    public final void method782() {
        if (this.field3696 != null) {
            this.field3696.close();
            this.field3696 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 35)
    public final void method778() {
        int var1 = 256;
        if (class12.field319) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3668[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3698[var2 * 2] = (byte) (var3 >> 8);
            this.field3698[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3696.write(this.field3698, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V", line = 70)
    public final void method779() {
        this.field3696.flush();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 78)
    public final void method783(Component arg0) {
        this.field3697 = new AudioFormat((float) class93.field2181, 16, class12.field319 ? 2 : 1, true, false);
        this.field3698 = new byte[0x100 << (class12.field319 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 88)
    public final void method781(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3700 == null ? (field3700 = method1191("javax.sound.sampled.SourceDataLine")) : field3700, this.field3697, arg0 << (class12.field319 ? 2 : 1));
            this.field3696 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3696.open();
            this.field3696.start();
            this.field3699 = arg0;
        } catch (LineUnavailableException var4) {
            if (class109.method955(252645135, arg0) == 1) {
                this.field3696 = null;
                throw var4;
            } else {
                this.method781(class93.method792(1457791400, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 88)
    public static Class method1191(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
