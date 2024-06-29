import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class468 extends class428 {

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "Z")
    private boolean field6441 = false;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    private int field6444;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field6446;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6443;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6442;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "[B")
    private byte[] field6445;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "()V", line = 12)
    public final void method2413() throws LineUnavailableException {
        this.field6442.flush();
        if (!this.field6441) {
            return;
        }
        this.field6442.close();
        this.field6442 = null;
        Info var1 = new Info(field6446 == null ? (field6446 = method2653("javax.sound.sampled.SourceDataLine")) : field6446, this.field6443, this.field6444 << (class202.field2798 ? 2 : 1));
        this.field6442 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6442.open();
        this.field6442.start();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 19)
    public static Class method2653(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 32)
    public final void method2415(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6441 = true;
                    }
                }
            }
        }
        this.field6443 = new AudioFormat((float) class296.field3877, 16, class202.field2798 ? 2 : 1, true, false);
        this.field6445 = new byte[0x100 << (class202.field2798 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V", line = 69)
    public final void method2409(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6446 == null ? (field6446 = method2653("javax.sound.sampled.SourceDataLine")) : field6446, this.field6443, arg0 << (class202.field2798 ? 2 : 1));
            this.field6442 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6442.open();
            this.field6442.start();
            this.field6444 = arg0;
        } catch (LineUnavailableException var4) {
            if (class437.method2511((byte) 78, arg0) == 1) {
                this.field6442 = null;
                throw var4;
            } else {
                this.method2409(class321.method1857((byte) 113, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()V", line = 90)
    public final void method2411() {
        if (this.field6442 != null) {
            this.field6442.close();
            this.field6442 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "()I", line = 108)
    public final int method2410() {
        return this.field6444 - (this.field6442.available() >> (class202.field2798 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()V", line = 118)
    public final void method2414() {
        int var1 = 256;
        if (class202.field2798) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5858[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6445[var2 * 2] = (byte) (var3 >> 8);
            this.field6445[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6442.write(this.field6445, 0, var1 << 1);
    }
}
