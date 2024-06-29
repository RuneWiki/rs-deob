import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class144 extends class225 {

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Z")
    private boolean field2368 = false;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2372;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2371;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2370;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "[B")
    private byte[] field2369;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V", line = 12)
    public final void method931() {
        if (this.field2370 != null) {
            this.field2370.close();
            this.field2370 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 27)
    public final void method932(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2372 == null ? (field2372 = method937("javax.sound.sampled.SourceDataLine")) : field2372, this.field2371, arg0 << (class119.field2071 ? 2 : 1));
            this.field2370 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2370.open();
            this.field2370.start();
            this.field2367 = arg0;
        } catch (LineUnavailableException var4) {
            if (class69.method534(arg0, 122) == 1) {
                this.field2370 = null;
                throw var4;
            } else {
                this.method932(class226.method1510(27147, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 27)
    public static Class method937(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 50)
    public final void method933(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2368 = true;
                    }
                }
                var3++;
            }
        }
        this.field2371 = new AudioFormat((float) class303.field4596, 16, class119.field2071 ? 2 : 1, true, false);
        this.field2369 = new byte[0x100 << (class119.field2071 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I", line = 91)
    public final int method934() {
        return this.field2367 - (this.field2370.available() >> (class119.field2071 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V", line = 101)
    public final void method935() throws LineUnavailableException {
        this.field2370.flush();
        if (!this.field2368) {
            return;
        }
        this.field2370.close();
        this.field2370 = null;
        Info var1 = new Info(field2372 == null ? (field2372 = method937("javax.sound.sampled.SourceDataLine")) : field2372, this.field2371, this.field2367 << (class119.field2071 ? 2 : 1));
        this.field2370 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2370.open();
        this.field2370.start();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 122)
    public final void method936() {
        int var1 = 256;
        if (class119.field2071) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3540[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2369[var2 * 2] = (byte) (var3 >> 8);
            this.field2369[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2370.write(this.field2369, 0, var1 << 1);
    }
}
