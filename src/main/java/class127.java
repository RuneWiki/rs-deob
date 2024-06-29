import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class127 extends class173 {

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Z")
    private boolean field2136 = false;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field2137;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2132;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2133;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "[B")
    private byte[] field2134;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V")
    public final void method941() throws LineUnavailableException {
        this.field2133.flush();
        if (!this.field2136) {
            return;
        }
        this.field2133.close();
        this.field2133 = null;
        Info var1 = new Info(field2137 == null ? (field2137 = method947("javax.sound.sampled.SourceDataLine")) : field2137, this.field2132, this.field2135 << (class34.field498 ? 2 : 1));
        this.field2133 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2133.open();
        this.field2133.start();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
    public final void method942() {
        if (this.field2133 != null) {
            this.field2133.close();
            this.field2133 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()I")
    public final int method943() {
        return this.field2135 - (this.field2133.available() >> (class34.field498 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public final void method944(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2137 == null ? (field2137 = method947("javax.sound.sampled.SourceDataLine")) : field2137, this.field2132, arg0 << (class34.field498 ? 2 : 1));
            this.field2133 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2133.open();
            this.field2133.start();
            this.field2135 = arg0;
        } catch (LineUnavailableException var4) {
            if (class147.method1072(arg0, true) == 1) {
                this.field2133 = null;
                throw var4;
            } else {
                this.method944(class184.method1302(arg0, -12820));
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
    public final void method945() {
        int var1 = 256;
        if (class34.field498) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2841[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2134[var2 * 2] = (byte) (var3 >> 8);
            this.field2134[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2133.write(this.field2134, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method946(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2136 = true;
                    }
                }
            }
        }
        this.field2132 = new AudioFormat((float) class156.field2568, 16, class34.field498 ? 2 : 1, true, false);
        this.field2134 = new byte[0x100 << (class34.field498 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
