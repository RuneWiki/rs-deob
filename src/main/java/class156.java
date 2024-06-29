import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class156 extends class65 {

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
    private boolean field2334 = false;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2338;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2333;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2335;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "[B")
    private byte[] field2337;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
    public final void method20() throws LineUnavailableException {
        this.field2335.flush();
        if (!this.field2334) {
            return;
        }
        this.field2335.close();
        this.field2335 = null;
        Info var1 = new Info(field2338 == null ? (field2338 = method944("javax.sound.sampled.SourceDataLine")) : field2338, this.field2333, this.field2336 << (class275.field4153 ? 2 : 1));
        this.field2335 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2335.open();
        this.field2335.start();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method21(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2334 = true;
                    }
                }
            }
        }
        this.field2333 = new AudioFormat((float) class248.field3764, 16, class275.field4153 ? 2 : 1, true, false);
        this.field2337 = new byte[0x100 << (class275.field4153 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public final void method24() {
        int var1 = 256;
        if (class275.field4153) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1029[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2337[var2 * 2] = (byte) (var3 >> 8);
            this.field2337[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2335.write(this.field2337, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public final void method18() {
        if (this.field2335 != null) {
            this.field2335.close();
            this.field2335 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public final void method23(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2338 == null ? (field2338 = method944("javax.sound.sampled.SourceDataLine")) : field2338, this.field2333, arg0 << (class275.field4153 ? 2 : 1));
            this.field2335 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2335.open();
            this.field2335.start();
            this.field2336 = arg0;
        } catch (LineUnavailableException var4) {
            if (class143.method877(-26835, arg0) == 1) {
                this.field2335 = null;
                throw var4;
            } else {
                this.method23(class214.method1368(-123, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
    public final int method19() {
        return this.field2336 - (this.field2335.available() >> (class275.field4153 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method944(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
