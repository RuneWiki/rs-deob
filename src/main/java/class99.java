import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class99 extends class161 {

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1328;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1327;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1325;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[B")
    private byte[] field1324;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()I")
    public final int method569() {
        return this.field1323 - (this.field1325.available() >> (class654.field8426 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method570() {
        if (this.field1325 != null) {
            this.field1325.close();
            this.field1325 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method571(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1328 == null ? (field1328 = method575("javax.sound.sampled.SourceDataLine")) : field1328, this.field1327, arg0 << (class654.field8426 ? 2 : 1));
            this.field1325 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1325.open();
            this.field1325.start();
            this.field1323 = arg0;
        } catch (LineUnavailableException var4) {
            if (class381.method2177((byte) -128, arg0) == 1) {
                this.field1325 = null;
                throw var4;
            } else {
                this.method571(class483.method2714(arg0, (byte) -114));
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
    public final void method572() {
        int var1 = 256;
        if (class654.field8426) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2133[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1324[var2 * 2] = (byte) (var3 >> 8);
            this.field1324[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1325.write(this.field1324, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method573(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1326 = true;
                    }
                }
            }
        }
        this.field1327 = new AudioFormat((float) class791.field10837, 16, class654.field8426 ? 2 : 1, true, false);
        this.field1324 = new byte[0x100 << (class654.field8426 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()V")
    public final void method574() throws LineUnavailableException {
        this.field1325.flush();
        if (!this.field1326) {
            return;
        }
        this.field1325.close();
        this.field1325 = null;
        Info var1 = new Info(field1328 == null ? (field1328 = method575("javax.sound.sampled.SourceDataLine")) : field1328, this.field1327, this.field1323 << (class654.field8426 ? 2 : 1));
        this.field1325 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1325.open();
        this.field1325.start();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method575(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
