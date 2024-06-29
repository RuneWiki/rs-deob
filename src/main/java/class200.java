import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class200 extends class235 {

    @OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
    private boolean field2821 = false;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2824;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2820;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2822;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "[B")
    private byte[] field2819;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
    public final void method924() throws LineUnavailableException {
        this.field2822.flush();
        if (!this.field2821) {
            return;
        }
        this.field2822.close();
        this.field2822 = null;
        Info var1 = new Info(field2824 == null ? (field2824 = method1396("javax.sound.sampled.SourceDataLine")) : field2824, this.field2820, this.field2823 << (class40.field620 ? 2 : 1));
        this.field2822 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2822.open();
        this.field2822.start();
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public final void method927(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2824 == null ? (field2824 = method1396("javax.sound.sampled.SourceDataLine")) : field2824, this.field2820, arg0 << (class40.field620 ? 2 : 1));
            this.field2822 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2822.open();
            this.field2822.start();
            this.field2823 = arg0;
        } catch (LineUnavailableException var4) {
            if (class449.method2715(arg0, -95) == 1) {
                this.field2822 = null;
                throw var4;
            } else {
                this.method927(class353.method2231(arg0, (byte) -84));
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method928(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2821 = true;
                    }
                }
            }
        }
        this.field2820 = new AudioFormat((float) class462.field6769, 16, class40.field620 ? 2 : 1, true, false);
        this.field2819 = new byte[0x100 << (class40.field620 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
    public final void method930() {
        int var1 = 256;
        if (class40.field620) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3339[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2819[var2 * 2] = (byte) (var3 >> 8);
            this.field2819[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2822.write(this.field2819, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
    public final void method926() {
        if (this.field2822 != null) {
            this.field2822.close();
            this.field2822 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()I")
    public final int method925() {
        return this.field2823 - (this.field2822.available() >> (class40.field620 ? 2 : 1));
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1396(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
