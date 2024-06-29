import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class66 extends class39 {

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "Z")
    private boolean field1031 = false;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1032;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1028;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1029;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "[B")
    private byte[] field1027;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 10)
    public final void method299() throws LineUnavailableException {
        this.field1029.flush();
        if (!this.field1031) {
            return;
        }
        this.field1029.close();
        this.field1029 = null;
        Info var1 = new Info(field1032 == null ? (field1032 = method485("javax.sound.sampled.SourceDataLine")) : field1032, this.field1028, this.field1030 << (class55.field887 ? 2 : 1));
        this.field1029 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1029.open();
        this.field1029.start();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 17)
    public static Class method485(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 31)
    public final void method301() {
        if (this.field1029 != null) {
            this.field1029.close();
            this.field1029 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 48)
    public final void method311() {
        int var1 = 256;
        if (class55.field887) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field568[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1027[var2 * 2] = (byte) (var3 >> 8);
            this.field1027[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1029.write(this.field1027, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 85)
    public final void method298(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1031 = true;
                    }
                }
                var3++;
            }
        }
        this.field1028 = new AudioFormat((float) class230.field3728, 16, class55.field887 ? 2 : 1, true, false);
        this.field1027 = new byte[0x100 << (class55.field887 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 124)
    public final void method312(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1032 == null ? (field1032 = method485("javax.sound.sampled.SourceDataLine")) : field1032, this.field1028, arg0 << (class55.field887 ? 2 : 1));
            this.field1029 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1029.open();
            this.field1029.start();
            this.field1030 = arg0;
        } catch (LineUnavailableException var4) {
            if (class91.method627(arg0, -27468) == 1) {
                this.field1029 = null;
                throw var4;
            } else {
                this.method312(class140.method925(arg0, (byte) 124));
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I", line = 146)
    public final int method302() {
        return this.field1030 - (this.field1029.available() >> (class55.field887 ? 2 : 1));
    }
}
