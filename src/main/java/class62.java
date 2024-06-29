import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class62 extends class137 {

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "Z")
    private boolean field949 = false;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field954;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field950;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field951;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "[B")
    private byte[] field952;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 13)
    public final void method376(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field954 == null ? (field954 = method382("javax.sound.sampled.SourceDataLine")) : field954, this.field950, arg0 << (class88.field1462 ? 2 : 1));
            this.field951 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field951.open();
            this.field951.start();
            this.field953 = arg0;
        } catch (LineUnavailableException var4) {
            if (class222.method1554(126, arg0) == 1) {
                this.field951 = null;
                throw var4;
            } else {
                this.method376(class287.method2033(arg0, -1410546649));
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method382(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I", line = 35)
    public final int method377() {
        return this.field953 - (this.field951.available() >> (class88.field1462 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 42)
    public final void method378() {
        if (this.field951 != null) {
            this.field951.close();
            this.field951 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 59)
    public final void method379(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field949 = true;
                    }
                }
                var3++;
            }
        }
        this.field950 = new AudioFormat((float) class92.field1584, 16, class88.field1462 ? 2 : 1, true, false);
        this.field952 = new byte[0x100 << (class88.field1462 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()V", line = 96)
    public final void method380() throws LineUnavailableException {
        this.field951.flush();
        if (!this.field949) {
            return;
        }
        this.field951.close();
        this.field951 = null;
        Info var1 = new Info(field954 == null ? (field954 = method382("javax.sound.sampled.SourceDataLine")) : field954, this.field950, this.field953 << (class88.field1462 ? 2 : 1));
        this.field951 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field951.open();
        this.field951.start();
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()V", line = 121)
    public final void method381() {
        int var1 = 256;
        if (class88.field1462) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2305[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field952[var2 * 2] = (byte) (var3 >> 8);
            this.field952[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field951.write(this.field952, 0, var1 << 1);
    }
}
