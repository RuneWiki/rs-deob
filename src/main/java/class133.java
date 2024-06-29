import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 extends class144 {

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Z")
    private boolean field2277 = false;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field2278;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2273;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2275;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "[B")
    private byte[] field2276;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V", line = 12)
    public final void method310() throws LineUnavailableException {
        this.field2275.flush();
        if (!this.field2277) {
            return;
        }
        this.field2275.close();
        this.field2275 = null;
        Info var1 = new Info(field2278 == null ? (field2278 = method921("javax.sound.sampled.SourceDataLine")) : field2278, this.field2273, this.field2274 << (class142.field2572 ? 2 : 1));
        this.field2275 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2275.open();
        this.field2275.start();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 19)
    public static Class method921(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V", line = 33)
    public final void method312() {
        int var1 = 256;
        if (class142.field2572) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2629[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2276[var2 * 2] = (byte) (var3 >> 8);
            this.field2276[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2275.write(this.field2276, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 69)
    public final void method311(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2277 = true;
                    }
                }
            }
        }
        this.field2273 = new AudioFormat((float) class102.field1633, 16, class142.field2572 ? 2 : 1, true, false);
        this.field2276 = new byte[0x100 << (class142.field2572 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 105)
    public final void method315(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2278 == null ? (field2278 = method921("javax.sound.sampled.SourceDataLine")) : field2278, this.field2273, arg0 << (class142.field2572 ? 2 : 1));
            this.field2275 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2275.open();
            this.field2275.start();
            this.field2274 = arg0;
        } catch (LineUnavailableException var4) {
            if (class281.method1884(-2017723576, arg0) == 1) {
                this.field2275 = null;
                throw var4;
            } else {
                this.method315(class301.method2026(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()I", line = 128)
    public final int method314() {
        return this.field2274 - (this.field2275.available() >> (class142.field2572 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V", line = 135)
    public final void method313() {
        if (this.field2275 != null) {
            this.field2275.close();
            this.field2275 = null;
        }
    }
}
