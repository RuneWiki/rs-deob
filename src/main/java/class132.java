import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class132 extends class66 {

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Z")
    private boolean field2372 = false;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2374;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2369;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2373;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "[B")
    private byte[] field2370;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()V", line = 14)
    public final void method470() {
        int var1 = 256;
        if (class15.field233) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1037[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2370[var2 * 2] = (byte) (var3 >> 8);
            this.field2370[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2373.write(this.field2370, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "()V", line = 47)
    public final void method471() throws LineUnavailableException {
        this.field2373.flush();
        if (!this.field2372) {
            return;
        }
        this.field2373.close();
        this.field2373 = null;
        Info var1 = new Info(field2374 == null ? (field2374 = method1049("javax.sound.sampled.SourceDataLine")) : field2374, this.field2369, this.field2371 << (class15.field233 ? 2 : 1));
        this.field2373 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2373.open();
        this.field2373.start();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 54)
    public static Class method1049(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V", line = 69)
    public final void method461() {
        if (this.field2373 != null) {
            this.field2373.close();
            this.field2373 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 83)
    public final void method463(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2372 = true;
                    }
                }
                var3++;
            }
        }
        this.field2369 = new AudioFormat((float) class306.field5146, 16, class15.field233 ? 2 : 1, true, false);
        this.field2370 = new byte[0x100 << (class15.field233 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()I", line = 123)
    public final int method467() {
        return this.field2371 - (this.field2373.available() >> (class15.field233 ? 2 : 1));
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V", line = 133)
    public final void method474(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2374 == null ? (field2374 = method1049("javax.sound.sampled.SourceDataLine")) : field2374, this.field2369, arg0 << (class15.field233 ? 2 : 1));
            this.field2373 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2373.open();
            this.field2373.start();
            this.field2371 = arg0;
        } catch (LineUnavailableException var4) {
            if (class42.method309(arg0, 89) == 1) {
                this.field2373 = null;
                throw var4;
            } else {
                this.method474(class237.method1678(arg0, -31981));
            }
        }
    }
}
