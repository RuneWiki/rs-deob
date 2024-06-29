import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class242 extends class82 {

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Z")
    private boolean field4166 = false;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field4171;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4168;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4169;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "[B")
    private byte[] field4170;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public final int method25() {
        return this.field4167 - (this.field4169.available() >> (class106.field1920 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
    public final void method28() {
        if (this.field4169 != null) {
            this.field4169.close();
            this.field4169 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4171 == null ? (field4171 = method1644("javax.sound.sampled.SourceDataLine")) : field4171, this.field4168, arg0 << (class106.field1920 ? 2 : 1));
            this.field4169 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4169.open();
            this.field4169.start();
            this.field4167 = arg0;
        } catch (LineUnavailableException var4) {
            if (class63.method493(arg0, 816860964) == 1) {
                this.field4169 = null;
                throw var4;
            } else {
                this.method22(class41.method311(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
    public final void method27() {
        int var1 = 256;
        if (class106.field1920) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1488[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4170[var2 * 2] = (byte) (var3 >> 8);
            this.field4170[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4169.write(this.field4170, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
    public final void method24() throws LineUnavailableException {
        this.field4169.flush();
        if (!this.field4166) {
            return;
        }
        this.field4169.close();
        this.field4169 = null;
        Info var1 = new Info(field4171 == null ? (field4171 = method1644("javax.sound.sampled.SourceDataLine")) : field4171, this.field4168, this.field4167 << (class106.field1920 ? 2 : 1));
        this.field4169 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4169.open();
        this.field4169.start();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method23(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4166 = true;
                    }
                }
            }
        }
        this.field4168 = new AudioFormat((float) class160.field2755, 16, class106.field1920 ? 2 : 1, true, false);
        this.field4170 = new byte[0x100 << (class106.field1920 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1644(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
