import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class175 extends class44 {

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Z")
    private boolean field3185 = false;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3187;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3186;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3184;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "[B")
    private byte[] field3182;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method333(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3187 == null ? (field3187 = method1240("javax.sound.sampled.SourceDataLine")) : field3187, this.field3186, arg0 << (class24.field590 ? 2 : 1));
            this.field3184 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3184.open();
            this.field3184.start();
            this.field3183 = arg0;
        } catch (LineUnavailableException var4) {
            if (class78.method553(arg0, 95) == 1) {
                this.field3184 = null;
                throw var4;
            } else {
                this.method333(class156.method1139(arg0, -121));
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public final void method332() {
        if (this.field3184 != null) {
            this.field3184.close();
            this.field3184 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method329(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3185 = true;
                    }
                }
            }
        }
        this.field3186 = new AudioFormat((float) class65.field1277, 16, class24.field590 ? 2 : 1, true, false);
        this.field3182 = new byte[0x100 << (class24.field590 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
    public final void method334() throws LineUnavailableException {
        this.field3184.flush();
        if (!this.field3185) {
            return;
        }
        this.field3184.close();
        this.field3184 = null;
        Info var1 = new Info(field3187 == null ? (field3187 = method1240("javax.sound.sampled.SourceDataLine")) : field3187, this.field3186, this.field3183 << (class24.field590 ? 2 : 1));
        this.field3184 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3184.open();
        this.field3184.start();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()I")
    public final int method328() {
        return this.field3183 - (this.field3184.available() >> (class24.field590 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
    public final void method330() {
        int var1 = 256;
        if (class24.field590) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field971[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3182[var2 * 2] = (byte) (var3 >> 8);
            this.field3182[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3184.write(this.field3182, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1240(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
