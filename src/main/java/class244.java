import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class244 extends class173 {

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Z")
    private boolean field3869 = false;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    private int field3872;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3874;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3871;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3873;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "[B")
    private byte[] field3870;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()V")
    public final void method913() {
        int var1 = 256;
        if (class287.field4787) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2695[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3870[var2 * 2] = (byte) (var3 >> 8);
            this.field3870[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3873.write(this.field3870, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
    public final void method912() throws LineUnavailableException {
        this.field3873.flush();
        if (!this.field3869) {
            return;
        }
        this.field3873.close();
        this.field3873 = null;
        Info var1 = new Info(field3874 == null ? (field3874 = method1709("javax.sound.sampled.SourceDataLine")) : field3874, this.field3871, this.field3872 << (class287.field4787 ? 2 : 1));
        this.field3873 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3873.open();
        this.field3873.start();
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
    public final void method911() {
        if (this.field3873 != null) {
            this.field3873.close();
            this.field3873 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method907(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3869 = true;
                    }
                }
                var3++;
            }
        }
        this.field3871 = new AudioFormat((float) class131.field2018, 16, class287.field4787 ? 2 : 1, true, false);
        this.field3870 = new byte[0x100 << (class287.field4787 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method910(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3874 == null ? (field3874 = method1709("javax.sound.sampled.SourceDataLine")) : field3874, this.field3871, arg0 << (class287.field4787 ? 2 : 1));
            this.field3873 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3873.open();
            this.field3873.start();
            this.field3872 = arg0;
        } catch (LineUnavailableException var4) {
            if (class217.method1519(arg0, 255) == 1) {
                this.field3873 = null;
                throw var4;
            } else {
                this.method910(class257.method1792(arg0, (byte) 0));
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
    public final int method909() {
        return this.field3872 - (this.field3873.available() >> (class287.field4787 ? 2 : 1));
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1709(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
