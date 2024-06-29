import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class290 extends class11 {

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "Z")
    private boolean field4417 = false;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field4419;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4415;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4416;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "[B")
    private byte[] field4414;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method100(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4417 = true;
                    }
                }
            }
        }
        this.field4415 = new AudioFormat((float) class213.field3404, 16, class141.field2238 ? 2 : 1, true, false);
        this.field4414 = new byte[0x100 << (class141.field2238 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()V", line = 46)
    public final void method103() throws LineUnavailableException {
        this.field4416.flush();
        if (!this.field4417) {
            return;
        }
        this.field4416.close();
        this.field4416 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4419 == null ? (field4419 = method2034("javax.sound.sampled.SourceDataLine")) : field4419, this.field4415, this.field4418 << (class141.field2238 ? 2 : 1));
        this.field4416 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4416.open();
        this.field4416.start();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 53)
    public static Class method2034(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 68)
    public final void method84() {
        int var1 = 256;
        if (class141.field2238) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field201[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4414[var2 * 2] = (byte) (var3 >> 8);
            this.field4414[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4416.write(this.field4414, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V", line = 104)
    public final void method88() {
        if (this.field4416 != null) {
            this.field4416.close();
            this.field4416 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I", line = 118)
    public final int method94() {
        return this.field4418 - (this.field4416.available() >> (class141.field2238 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 128)
    public final void method98(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4419 == null ? (field4419 = method2034("javax.sound.sampled.SourceDataLine")) : field4419, this.field4415, arg0 << (class141.field2238 ? 2 : 1));
            this.field4416 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4416.open();
            this.field4416.start();
            this.field4418 = arg0;
        } catch (LineUnavailableException var4) {
            if (class210.method1530(-7, arg0) == 1) {
                this.field4416 = null;
                throw var4;
            } else {
                this.method98(class210.method1532(-1429694904, arg0));
            }
        }
    }
}
