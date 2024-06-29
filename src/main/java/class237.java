import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class237 extends class507 {

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "Z")
    private boolean field3558 = false;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field3563;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3562;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3560;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "[B")
    private byte[] field3559;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 17)
    public final void method1567(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3563 == null ? (field3563 = method1573("javax.sound.sampled.SourceDataLine")) : field3563, this.field3562, arg0 << (class385.field5498 ? 2 : 1));
            this.field3560 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3560.open();
            this.field3560.start();
            this.field3561 = arg0;
        } catch (LineUnavailableException var4) {
            if (class101.method746(858993459, arg0) == 1) {
                this.field3560 = null;
                throw var4;
            } else {
                this.method1567(class487.method2869(1366891568, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 17)
    public static Class method1573(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "()V", line = 38)
    public final void method1568() {
        if (this.field3560 != null) {
            this.field3560.close();
            this.field3560 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "()I", line = 51)
    public final int method1569() {
        return this.field3561 - (this.field3560.available() >> (class385.field5498 ? 2 : 1));
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "()V", line = 60)
    public final void method1570() {
        int var1 = 256;
        if (class385.field5498) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7328[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3559[var2 * 2] = (byte) (var3 >> 8);
            this.field3559[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3560.write(this.field3559, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "()V", line = 94)
    public final void method1571() throws LineUnavailableException {
        this.field3560.flush();
        if (!this.field3558) {
            return;
        }
        this.field3560.close();
        this.field3560 = null;
        Info var1 = new Info(field3563 == null ? (field3563 = method1573("javax.sound.sampled.SourceDataLine")) : field3563, this.field3562, this.field3561 << (class385.field5498 ? 2 : 1));
        this.field3560 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3560.open();
        this.field3560.start();
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 120)
    public final void method1572(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3558 = true;
                    }
                }
            }
        }
        this.field3562 = new AudioFormat((float) class120.field1877, 16, class385.field5498 ? 2 : 1, true, false);
        this.field3559 = new byte[0x100 << (class385.field5498 ? 2 : 1)];
    }
}
