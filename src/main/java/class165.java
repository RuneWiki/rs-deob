import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class165 extends class160 {

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "Z")
    private boolean field2889 = false;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    private int field2892;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2894;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2890;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2893;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "[B")
    private byte[] field2891;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()V", line = 15)
    public final void method1184() throws LineUnavailableException {
        this.field2893.flush();
        if (!this.field2889) {
            return;
        }
        this.field2893.close();
        this.field2893 = null;
        Info var1 = new Info(field2894 == null ? (field2894 = method1301("javax.sound.sampled.SourceDataLine")) : field2894, this.field2890, this.field2892 << (class26.field360 ? 2 : 1));
        this.field2893 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2893.open();
        this.field2893.start();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 22)
    public static Class method1301(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 36)
    public final void method1185() {
        int var1 = 256;
        if (class26.field360) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2818[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2891[var2 * 2] = (byte) (var3 >> 8);
            this.field2891[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2893.write(this.field2891, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I", line = 70)
    public final int method1179() {
        return this.field2892 - (this.field2893.available() >> (class26.field360 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 80)
    public final void method1183(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2894 == null ? (field2894 = method1301("javax.sound.sampled.SourceDataLine")) : field2894, this.field2890, arg0 << (class26.field360 ? 2 : 1));
            this.field2893 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2893.open();
            this.field2893.start();
            this.field2892 = arg0;
        } catch (LineUnavailableException var4) {
            if (class51.method471(118, arg0) == 1) {
                this.field2893 = null;
                throw var4;
            } else {
                this.method1183(class168.method1318(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 104)
    public final void method1180(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2889 = true;
                    }
                }
            }
        }
        this.field2890 = new AudioFormat((float) class266.field4291, 16, class26.field360 ? 2 : 1, true, false);
        this.field2891 = new byte[0x100 << (class26.field360 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V", line = 144)
    public final void method1182() {
        if (this.field2893 != null) {
            this.field2893.close();
            this.field2893 = null;
        }
    }
}
