import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class85 extends class62 {

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1993;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1992;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1989;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "[B")
    private byte[] field1991;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
    public final void method432() {
        int var1 = 256;
        if (class83.field1974) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1501[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1991[var2 * 2] = (byte) (var3 >> 8);
            this.field1991[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1989.write(this.field1991, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
    public final int method435() {
        return this.field1990 - (this.field1989.available() >> (class83.field1974 ? 2 : 1));
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
    public final void method431() {
        if (this.field1989 != null) {
            this.field1989.close();
            this.field1989 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method434(Component arg0) {
        this.field1992 = new AudioFormat((float) class87.field2030, 16, class83.field1974 ? 2 : 1, true, false);
        this.field1991 = new byte[0x100 << (class83.field1974 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public final void method436() {
        this.field1989.flush();
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method430(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1993 == null ? (field1993 = method716("javax.sound.sampled.SourceDataLine")) : field1993, this.field1992, arg0 << (class83.field1974 ? 2 : 1));
            this.field1989 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1989.open();
            this.field1989.start();
            this.field1990 = arg0;
        } catch (LineUnavailableException var4) {
            if (class58.method423(1152557602, arg0) == 1) {
                this.field1989 = null;
                throw var4;
            } else {
                this.method430(class7.method36(arg0, -696398748));
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method716(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
