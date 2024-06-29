import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class54 extends class439 {

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Z")
    private boolean field649 = false;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!aw", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field654;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field651;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field653;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "[B")
    private byte[] field650;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "()V")
    public final void method460() {
        if (this.field653 != null) {
            this.field653.close();
            this.field653 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
    public final void method461(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field654 == null ? (field654 = method466("javax.sound.sampled.SourceDataLine")) : field654, this.field651, arg0 << (class295.field4060 ? 2 : 1));
            this.field653 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field653.open();
            this.field653.start();
            this.field652 = arg0;
        } catch (LineUnavailableException var4) {
            if (class174.method1126(-24425, arg0) == 1) {
                this.field653 = null;
                throw var4;
            } else {
                this.method461(class508.method3034(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "()V")
    public final void method462() {
        int var1 = 256;
        if (class295.field4060) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field6486[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field650[var2 * 2] = (byte) (var3 >> 8);
            this.field650[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field653.write(this.field650, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "()I")
    public final int method463() {
        return this.field652 - (this.field653.available() >> (class295.field4060 ? 2 : 1));
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method464(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field649 = true;
                    }
                }
            }
        }
        this.field651 = new AudioFormat((float) class188.field2724, 16, class295.field4060 ? 2 : 1, true, false);
        this.field650 = new byte[0x100 << (class295.field4060 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "()V")
    public final void method465() throws LineUnavailableException {
        this.field653.flush();
        if (!this.field649) {
            return;
        }
        this.field653.close();
        this.field653 = null;
        Info var1 = new Info(field654 == null ? (field654 = method466("javax.sound.sampled.SourceDataLine")) : field654, this.field651, this.field652 << (class295.field4060 ? 2 : 1));
        this.field653 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field653.open();
        this.field653.start();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method466(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
