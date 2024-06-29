import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class94 extends class86 {

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field2229;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2228;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2227;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "[B")
    private byte[] field2226;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 12)
    public final void method322(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2229 == null ? (field2229 = method781("javax.sound.sampled.SourceDataLine")) : field2229, this.field2228, arg0 << (class126.field3090 ? 2 : 1));
            this.field2227 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2227.open();
            this.field2227.start();
        } catch (LineUnavailableException var4) {
            this.field2227 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method781(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()V", line = 30)
    public final void method321() {
        int var1 = 256;
        if (class126.field3090) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = field2072[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2226[var2 * 2] = (byte) (var3 >> 8);
            this.field2226[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2227.write(this.field2226, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;IZ)V", line = 65)
    public final void method319(Component arg0, int arg1, boolean arg2) {
        class24.field603 = arg1;
        class126.field3090 = arg2;
        this.field2228 = new AudioFormat((float) class24.field603, 16, class126.field3090 ? 2 : 1, true, false);
        this.field2226 = new byte[0x100 << (class126.field3090 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()I", line = 76)
    public final int method320() {
        return this.field2227.available() >> (class126.field3090 ? 2 : 1);
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()V", line = 83)
    public final void method323() {
        if (this.field2227 != null) {
            this.field2227.close();
            this.field2227 = null;
        }
    }
}
