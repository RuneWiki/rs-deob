import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class323 extends class460 {

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "Z")
    private boolean field4903 = false;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    private int field4904;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field4908;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4907;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4906;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "[B")
    private byte[] field4905;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()V")
    public final void method917() {
        if (this.field4906 != null) {
            this.field4906.close();
            this.field4906 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
    public final void method912() throws LineUnavailableException {
        this.field4906.flush();
        if (!this.field4903) {
            return;
        }
        this.field4906.close();
        this.field4906 = null;
        Info var1 = new Info(field4908 == null ? (field4908 = method2127("javax.sound.sampled.SourceDataLine")) : field4908, this.field4907, this.field4904 << (class162.field2453 ? 2 : 1));
        this.field4906 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4906.open();
        this.field4906.start();
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public final void method916(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4908 == null ? (field4908 = method2127("javax.sound.sampled.SourceDataLine")) : field4908, this.field4907, arg0 << (class162.field2453 ? 2 : 1));
            this.field4906 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4906.open();
            this.field4906.start();
            this.field4904 = arg0;
        } catch (LineUnavailableException var4) {
            if (class314.method2086(88, arg0) == 1) {
                this.field4906 = null;
                throw var4;
            } else {
                this.method916(class46.method307((byte) 119, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "()I")
    public final int method913() {
        return this.field4904 - (this.field4906.available() >> (class162.field2453 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method911(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4903 = true;
                    }
                }
            }
        }
        this.field4907 = new AudioFormat((float) class193.field2961, 16, class162.field2453 ? 2 : 1, true, false);
        this.field4905 = new byte[0x100 << (class162.field2453 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
    public final void method915() {
        int var1 = 256;
        if (class162.field2453) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field6823[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4905[var2 * 2] = (byte) (var3 >> 8);
            this.field4905[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4906.write(this.field4905, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2127(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
