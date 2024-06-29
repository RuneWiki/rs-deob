import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class179 extends class190 {

    @OriginalMember(owner = "client!hp", name = "bb", descriptor = "Z")
    private boolean field2541 = false;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!hp", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field2542;

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2539;

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2537;

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "[B")
    private byte[] field2538;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()V")
    public final void method1285() {
        if (this.field2537 != null) {
            this.field2537.close();
            this.field2537 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "()I")
    public final int method1286() {
        return this.field2540 - (this.field2537.available() >> (class46.field615 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1287(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2541 = true;
                    }
                }
            }
        }
        this.field2539 = new AudioFormat((float) class246.field3671, 16, class46.field615 ? 2 : 1, true, false);
        this.field2538 = new byte[0x100 << (class46.field615 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "()V")
    public final void method1288() throws LineUnavailableException {
        this.field2537.flush();
        if (!this.field2541) {
            return;
        }
        this.field2537.close();
        this.field2537 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2542 == null ? (field2542 = method1291("javax.sound.sampled.SourceDataLine")) : field2542, this.field2539, this.field2540 << (class46.field615 ? 2 : 1));
        this.field2537 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2537.open();
        this.field2537.start();
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "()V")
    public final void method1289() {
        int var1 = 256;
        if (class46.field615) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2727[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2538[var2 * 2] = (byte) (var3 >> 8);
            this.field2538[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2537.write(this.field2538, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method1290(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2542 == null ? (field2542 = method1291("javax.sound.sampled.SourceDataLine")) : field2542, this.field2539, arg0 << (class46.field615 ? 2 : 1));
            this.field2537 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2537.open();
            this.field2537.start();
            this.field2540 = arg0;
        } catch (LineUnavailableException var4) {
            if (class431.method2691((byte) -39, arg0) == 1) {
                this.field2537 = null;
                throw var4;
            } else {
                this.method1290(class258.method1787(-119, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1291(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
