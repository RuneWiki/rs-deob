import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class157 extends class114 {

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3062;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3061;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3059;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "[B")
    private byte[] field3060;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method497(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3062 == null ? (field3062 = method1081("javax.sound.sampled.SourceDataLine")) : field3062, this.field3061, arg0 << (class36.field697 ? 2 : 1));
            this.field3059 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3059.open();
            this.field3059.start();
            this.field3058 = arg0;
        } catch (LineUnavailableException var4) {
            if (class156.method1078(arg0, -1484158736) == 1) {
                this.field3059 = null;
                throw var4;
            } else {
                this.method497(class177.method1185(arg0, (byte) -110));
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
    public final void method501() {
        int var1 = 256;
        if (class36.field697) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2331[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3060[var2 * 2] = (byte) (var3 >> 8);
            this.field3060[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3059.write(this.field3060, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
    public final void method496() {
        if (this.field3059 != null) {
            this.field3059.close();
            this.field3059 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()I")
    public final int method499() {
        return this.field3058 - (this.field3059.available() >> (class36.field697 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method498(Component arg0) {
        this.field3061 = new AudioFormat((float) class110.field2276, 16, class36.field697 ? 2 : 1, true, false);
        this.field3060 = new byte[0x100 << (class36.field697 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public final void method500() {
        this.field3059.flush();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1081(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
