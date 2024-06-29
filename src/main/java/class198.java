import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class198 extends class19 {

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "Z")
    private boolean field3174 = false;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3176;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3172;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3173;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[B")
    private byte[] field3171;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 10)
    public final void method109() throws LineUnavailableException {
        this.field3173.flush();
        if (!this.field3174) {
            return;
        }
        this.field3173.close();
        this.field3173 = null;
        Info var1 = new Info(field3176 == null ? (field3176 = method1394("javax.sound.sampled.SourceDataLine")) : field3176, this.field3172, this.field3175 << (class292.field4890 ? 2 : 1));
        this.field3173 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3173.open();
        this.field3173.start();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 17)
    public static Class method1394(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 30)
    public final void method105() {
        if (this.field3173 != null) {
            this.field3173.close();
            this.field3173 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 45)
    public final void method120() {
        int var1 = 256;
        if (class292.field4890) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field294[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3171[var2 * 2] = (byte) (var3 >> 8);
            this.field3171[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3173.write(this.field3171, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 84)
    public final void method124(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3174 = true;
                    }
                }
            }
        }
        this.field3172 = new AudioFormat((float) class25.field448, 16, class292.field4890 ? 2 : 1, true, false);
        this.field3171 = new byte[0x100 << (class292.field4890 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 127)
    public final void method110(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3176 == null ? (field3176 = method1394("javax.sound.sampled.SourceDataLine")) : field3176, this.field3172, arg0 << (class292.field4890 ? 2 : 1));
            this.field3173 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3173.open();
            this.field3173.start();
            this.field3175 = arg0;
        } catch (LineUnavailableException var4) {
            if (class5.method22(arg0, 110) == 1) {
                this.field3173 = null;
                throw var4;
            } else {
                this.method110(class151.method1130(118, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()I", line = 148)
    public final int method123() {
        return this.field3175 - (this.field3173.available() >> (class292.field4890 ? 2 : 1));
    }
}
