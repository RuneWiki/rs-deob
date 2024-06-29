import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class195 extends class173 {

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "Z")
    private boolean field3396 = false;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field3397;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3394;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3392;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "[B")
    private byte[] field3395;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
    public final int method1145() {
        return this.field3393 - (this.field3392.available() >> (class247.field4280 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public final void method1142(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3397 == null ? (field3397 = method1260("javax.sound.sampled.SourceDataLine")) : field3397, this.field3394, arg0 << (class247.field4280 ? 2 : 1));
            this.field3392 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3392.open();
            this.field3392.start();
            this.field3393 = arg0;
        } catch (LineUnavailableException var4) {
            if (class251.method1651(255, arg0) == 1) {
                this.field3392 = null;
                throw var4;
            } else {
                this.method1142(class98.method644((byte) 120, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public final void method1140() {
        int var1 = 256;
        if (class247.field4280) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3006[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3395[var2 * 2] = (byte) (var3 >> 8);
            this.field3395[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3392.write(this.field3395, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
    public final void method1152() {
        if (this.field3392 != null) {
            this.field3392.close();
            this.field3392 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()V")
    public final void method1154() throws LineUnavailableException {
        this.field3392.flush();
        if (!this.field3396) {
            return;
        }
        this.field3392.close();
        this.field3392 = null;
        Info var1 = new Info(field3397 == null ? (field3397 = method1260("javax.sound.sampled.SourceDataLine")) : field3397, this.field3394, this.field3393 << (class247.field4280 ? 2 : 1));
        this.field3392 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3392.open();
        this.field3392.start();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1150(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3396 = true;
                    }
                }
            }
        }
        this.field3394 = new AudioFormat((float) class87.field1357, 16, class247.field4280 ? 2 : 1, true, false);
        this.field3395 = new byte[0x100 << (class247.field4280 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1260(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
