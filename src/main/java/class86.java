import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 extends class140 {

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "Z")
    private boolean field1513 = false;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1515;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1514;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1512;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "[B")
    private byte[] field1510;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public final void method685(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1515 == null ? (field1515 = method691("javax.sound.sampled.SourceDataLine")) : field1515, this.field1514, arg0 << (class157.field2804 ? 2 : 1));
            this.field1512 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1512.open();
            this.field1512.start();
            this.field1511 = arg0;
        } catch (LineUnavailableException var4) {
            if (class61.method522(-5153, arg0) == 1) {
                this.field1512 = null;
                throw var4;
            } else {
                this.method685(class52.method415(-13538, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V")
    public final void method686() {
        if (this.field1512 != null) {
            this.field1512.close();
            this.field1512 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()V")
    public final void method687() throws LineUnavailableException {
        this.field1512.flush();
        if (!this.field1513) {
            return;
        }
        this.field1512.close();
        this.field1512 = null;
        Info var1 = new Info(field1515 == null ? (field1515 = method691("javax.sound.sampled.SourceDataLine")) : field1515, this.field1514, this.field1511 << (class157.field2804 ? 2 : 1));
        this.field1512 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1512.open();
        this.field1512.start();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public final void method688() {
        int var1 = 256;
        if (class157.field2804) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2493[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1510[var2 * 2] = (byte) (var3 >> 8);
            this.field1510[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1512.write(this.field1510, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method689(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1513 = true;
                    }
                }
            }
        }
        this.field1514 = new AudioFormat((float) class55.field1011, 16, class157.field2804 ? 2 : 1, true, false);
        this.field1510 = new byte[0x100 << (class157.field2804 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
    public final int method690() {
        return this.field1511 - (this.field1512.available() >> (class157.field2804 ? 2 : 1));
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method691(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
