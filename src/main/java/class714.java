import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class714 extends class313 {

    @OriginalMember(owner = "client!lga", name = "P", descriptor = "Z")
    private boolean field10058 = false;

    @OriginalMember(owner = "client!lga", name = "N", descriptor = "I")
    private int field10056;

    @OriginalMember(owner = "client!lga", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field10059;

    @OriginalMember(owner = "client!lga", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field10054;

    @OriginalMember(owner = "client!lga", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field10057;

    @OriginalMember(owner = "client!lga", name = "M", descriptor = "[B")
    private byte[] field10055;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "()I")
    public final int method1391() {
        return this.field10056 - (this.field10057.available() >> (class266.field3798 ? 2 : 1));
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1397(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field10058 = true;
                    }
                }
            }
        }
        this.field10054 = new AudioFormat((float) client.field4279, 16, class266.field3798 ? 2 : 1, true, false);
        this.field10055 = new byte[0x100 << (class266.field3798 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
    public final void method1392(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field10059 == null ? (field10059 = method4066("javax.sound.sampled.SourceDataLine")) : field10059, this.field10054, arg0 << (class266.field3798 ? 2 : 1));
            this.field10057 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field10057.open();
            this.field10057.start();
            this.field10056 = arg0;
        } catch (LineUnavailableException var4) {
            if (class73.method622(-461024383, arg0) == 1) {
                this.field10057 = null;
                throw var4;
            } else {
                this.method1392(class432.method2684(arg0, -21774));
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "()V")
    public final void method1393() {
        if (this.field10057 != null) {
            this.field10057.close();
            this.field10057 = null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "()V")
    public final void method1394() throws LineUnavailableException {
        this.field10057.flush();
        if (!this.field10058) {
            return;
        }
        this.field10057.close();
        this.field10057 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field10059 == null ? (field10059 = method4066("javax.sound.sampled.SourceDataLine")) : field10059, this.field10054, this.field10056 << (class266.field3798 ? 2 : 1));
        this.field10057 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field10057.open();
        this.field10057.start();
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "()V")
    public final void method1395() {
        int var1 = 256;
        if (class266.field3798) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4432[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field10055[var2 * 2] = (byte) (var3 >> 8);
            this.field10055[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field10057.write(this.field10055, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4066(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
