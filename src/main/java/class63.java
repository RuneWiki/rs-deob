import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class149 {

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1272;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1271;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1268;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "[B")
    private byte[] field1270;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method431(Component arg0) {
        this.field1271 = new AudioFormat((float) class82.field1879, 16, class82.field1873 ? 2 : 1, true, false);
        this.field1270 = new byte[0x100 << (class82.field1873 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final int method432() {
        return this.field1269 - (this.field1268.available() >> (class82.field1873 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
    public final void method433() {
        if (this.field1268 != null) {
            this.field1268.close();
            this.field1268 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
    public final void method434() {
        int var1 = 256;
        if (class82.field1873) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3681[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1270[var2 * 2] = (byte) (var3 >> 8);
            this.field1270[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1268.write(this.field1270, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method435(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1272 == null ? (field1272 = method437("javax.sound.sampled.SourceDataLine")) : field1272, this.field1271, arg0 << (class82.field1873 ? 2 : 1));
            this.field1268 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1268.open();
            this.field1268.start();
            this.field1269 = arg0;
        } catch (LineUnavailableException var4) {
            if (class25.method199((byte) 86, arg0) == 1) {
                this.field1268 = null;
                throw var4;
            } else {
                this.method435(class80.method627(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method436() {
        this.field1268.flush();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method437(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
