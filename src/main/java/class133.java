import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class24 {

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field2963;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2962;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2961;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "[B")
    private byte[] field2959;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public final int method159() {
        return this.field2960 - (this.field2961.available() >> (class25.field632 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
    public final void method163() {
        int var1 = 256;
        if (class25.field632) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field580[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2959[var2 * 2] = (byte) (var3 >> 8);
            this.field2959[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2961.write(this.field2959, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public final void method162(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2963 == null ? (field2963 = method1030("javax.sound.sampled.SourceDataLine")) : field2963, this.field2962, arg0 << (class25.field632 ? 2 : 1));
            this.field2961 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2961.open();
            this.field2961.start();
            this.field2960 = arg0;
        } catch (LineUnavailableException var4) {
            if (class36.method278(arg0, -9516) == 1) {
                this.field2961 = null;
                throw var4;
            } else {
                this.method162(class94.method780(arg0, (byte) 82));
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method164(Component arg0) {
        this.field2962 = new AudioFormat((float) class25.field626, 16, class25.field632 ? 2 : 1, true, false);
        this.field2959 = new byte[0x100 << (class25.field632 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method150() {
        this.field2961.flush();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method148() {
        if (this.field2961 != null) {
            this.field2961.close();
            this.field2961 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1030(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
