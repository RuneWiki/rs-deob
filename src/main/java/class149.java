import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class149 extends class177 {

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Z")
    private boolean field2359 = false;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    private int field2356;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field2361;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2358;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2357;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[B")
    private byte[] field2360;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I", line = 10)
    public final int method1050() {
        return this.field2356 - (this.field2357.available() >> (class162.field2508 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V", line = 18)
    public final void method1051() throws LineUnavailableException {
        this.field2357.flush();
        if (!this.field2359) {
            return;
        }
        this.field2357.close();
        this.field2357 = null;
        Info var1 = new Info(field2361 == null ? (field2361 = method1056("javax.sound.sampled.SourceDataLine")) : field2361, this.field2358, this.field2356 << (class162.field2508 ? 2 : 1));
        this.field2357 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2357.open();
        this.field2357.start();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 24)
    public static Class method1056(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V", line = 39)
    public final void method1052() {
        if (this.field2357 != null) {
            this.field2357.close();
            this.field2357 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V", line = 54)
    public final void method1053() {
        int var1 = 256;
        if (class162.field2508) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2707[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2360[var2 * 2] = (byte) (var3 >> 8);
            this.field2360[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2357.write(this.field2360, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 91)
    public final void method1054(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2361 == null ? (field2361 = method1056("javax.sound.sampled.SourceDataLine")) : field2361, this.field2358, arg0 << (class162.field2508 ? 2 : 1));
            this.field2357 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2357.open();
            this.field2357.start();
            this.field2356 = arg0;
        } catch (LineUnavailableException var4) {
            if (class60.method406(arg0, (byte) -118) == 1) {
                this.field2357 = null;
                throw var4;
            } else {
                this.method1054(class47.method330((byte) -108, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 120)
    public final void method1055(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2359 = true;
                    }
                }
            }
        }
        this.field2358 = new AudioFormat((float) class282.field4337, 16, class162.field2508 ? 2 : 1, true, false);
        this.field2360 = new byte[0x100 << (class162.field2508 ? 2 : 1)];
    }
}
