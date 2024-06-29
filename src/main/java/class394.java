import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class394 extends class529 {

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Z")
    private boolean field5482 = false;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5483;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5480;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5478;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[B")
    private byte[] field5481;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V", line = 11)
    public final void method2398() {
        if (this.field5478 != null) {
            this.field5478.close();
            this.field5478 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 28)
    public final void method2399() {
        int var1 = 256;
        if (class379.field5336) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7387[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5481[var2 * 2] = (byte) (var3 >> 8);
            this.field5481[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5478.write(this.field5481, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 62)
    public final void method2400(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5482 = true;
                    }
                }
            }
        }
        this.field5480 = new AudioFormat((float) class757.field10509, 16, class379.field5336 ? 2 : 1, true, false);
        this.field5481 = new byte[0x100 << (class379.field5336 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V", line = 100)
    public final void method2401() throws LineUnavailableException {
        this.field5478.flush();
        if (!this.field5482) {
            return;
        }
        this.field5478.close();
        this.field5478 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5483 == null ? (field5483 = method2404("javax.sound.sampled.SourceDataLine")) : field5483, this.field5480, this.field5479 << (class379.field5336 ? 2 : 1));
        this.field5478 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5478.open();
        this.field5478.start();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 107)
    public static Class method2404(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 121)
    public final void method2402(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5483 == null ? (field5483 = method2404("javax.sound.sampled.SourceDataLine")) : field5483, this.field5480, arg0 << (class379.field5336 ? 2 : 1));
            this.field5478 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5478.open();
            this.field5478.start();
            this.field5479 = arg0;
        } catch (LineUnavailableException var4) {
            if (class275.method1668(-1706255295, arg0) == 1) {
                this.field5478 = null;
                throw var4;
            } else {
                this.method2402(class670.method3834(arg0, 23538));
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()I", line = 148)
    public final int method2403() {
        return this.field5479 - (this.field5478.available() >> (class379.field5336 ? 2 : 1));
    }
}
