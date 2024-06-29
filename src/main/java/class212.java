import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class212 extends class322 {

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Z")
    private boolean field2953 = false;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field2954;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2951;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2949;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "[B")
    private byte[] field2952;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()V", line = 14)
    public final void method1395() {
        int var1 = 256;
        if (class22.field297) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4737[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2952[var2 * 2] = (byte) (var3 >> 8);
            this.field2952[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2949.write(this.field2952, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()I", line = 49)
    public final int method1396() {
        return this.field2950 - (this.field2949.available() >> (class22.field297 ? 2 : 1));
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "()V", line = 56)
    public final void method1397() {
        if (this.field2949 != null) {
            this.field2949.close();
            this.field2949 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()V", line = 68)
    public final void method1398() throws LineUnavailableException {
        this.field2949.flush();
        if (!this.field2953) {
            return;
        }
        this.field2949.close();
        this.field2949 = null;
        Info var1 = new Info(field2954 == null ? (field2954 = method1401("javax.sound.sampled.SourceDataLine")) : field2954, this.field2951, this.field2950 << (class22.field297 ? 2 : 1));
        this.field2949 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2949.open();
        this.field2949.start();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 75)
    public static Class method1401(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 95)
    public final void method1399(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2953 = true;
                    }
                }
            }
        }
        this.field2951 = new AudioFormat((float) class465.field6683, 16, class22.field297 ? 2 : 1, true, false);
        this.field2952 = new byte[0x100 << (class22.field297 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 132)
    public final void method1400(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2954 == null ? (field2954 = method1401("javax.sound.sampled.SourceDataLine")) : field2954, this.field2951, arg0 << (class22.field297 ? 2 : 1));
            this.field2949 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2949.open();
            this.field2949.start();
            this.field2950 = arg0;
        } catch (LineUnavailableException var4) {
            if (class180.method1218(arg0, -124) == 1) {
                this.field2949 = null;
                throw var4;
            } else {
                this.method1400(class2.method9(arg0, -51));
            }
        }
    }
}
