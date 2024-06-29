import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class19 extends class155 {

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Z")
    private boolean field258 = false;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field263;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field260;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field262;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "[B")
    private byte[] field261;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
    public final void method96() throws LineUnavailableException {
        this.field262.flush();
        if (!this.field258) {
            return;
        }
        this.field262.close();
        this.field262 = null;
        Info var1 = new Info(field263 == null ? (field263 = method102("javax.sound.sampled.SourceDataLine")) : field263, this.field260, this.field259 << (class60.field997 ? 2 : 1));
        this.field262 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field262.open();
        this.field262.start();
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
    public final int method97() {
        return this.field259 - (this.field262.available() >> (class60.field997 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method98(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field258 = true;
                    }
                }
            }
        }
        this.field260 = new AudioFormat((float) class265.field4606, 16, class60.field997 ? 2 : 1, true, false);
        this.field261 = new byte[0x100 << (class60.field997 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public final void method99() {
        if (this.field262 != null) {
            this.field262.close();
            this.field262 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public final void method100() {
        int var1 = 256;
        if (class60.field997) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2754[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field261[var2 * 2] = (byte) (var3 >> 8);
            this.field261[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field262.write(this.field261, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method101(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field263 == null ? (field263 = method102("javax.sound.sampled.SourceDataLine")) : field263, this.field260, arg0 << (class60.field997 ? 2 : 1));
            this.field262 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field262.open();
            this.field262.start();
            this.field259 = arg0;
        } catch (LineUnavailableException var4) {
            if (class93.method721(true, arg0) == 1) {
                this.field262 = null;
                throw var4;
            } else {
                this.method101(class127.method987(arg0, 1868387312));
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method102(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
