import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class4 {

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field795;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field791;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field792;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "[B")
    private byte[] field794;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public final void method45() {
        this.field792.flush();
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public final void method41() {
        int var1 = 256;
        if (class35.field772) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field116[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field794[var2 * 2] = (byte) (var3 >> 8);
            this.field794[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field792.write(this.field794, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public final void method36() {
        if (this.field792 != null) {
            this.field792.close();
            this.field792 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public final int method40() {
        return this.field793 - (this.field792.available() >> (class35.field772 ? 2 : 1));
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final void method35(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field795 == null ? (field795 = method359("javax.sound.sampled.SourceDataLine")) : field795, this.field791, arg0 << (class35.field772 ? 2 : 1));
            this.field792 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field792.open();
            this.field792.start();
            this.field793 = arg0;
        } catch (LineUnavailableException var4) {
            if (class127.method1027(64, arg0) == 1) {
                this.field792 = null;
                throw var4;
            } else {
                this.method35(class66.method511((byte) 91, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method44(Component arg0) {
        this.field791 = new AudioFormat((float) class127.field2816, 16, class35.field772 ? 2 : 1, true, false);
        this.field794 = new byte[0x100 << (class35.field772 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method359(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
