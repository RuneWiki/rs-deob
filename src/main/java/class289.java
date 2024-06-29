import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class289 extends class59 {

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "Z")
    private boolean field3767 = false;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    private int field3766;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field3770;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3769;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3765;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "[B")
    private byte[] field3768;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method330(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3770 == null ? (field3770 = method1782("javax.sound.sampled.SourceDataLine")) : field3770, this.field3769, arg0 << (class85.field1155 ? 2 : 1));
            this.field3765 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3765.open();
            this.field3765.start();
            this.field3766 = arg0;
        } catch (LineUnavailableException var4) {
            if (class224.method1427(arg0, 100) == 1) {
                this.field3765 = null;
                throw var4;
            } else {
                this.method330(class468.method2685(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
    public final int method331() {
        return this.field3766 - (this.field3765.available() >> (class85.field1155 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method327(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3767 = true;
                    }
                }
            }
        }
        this.field3769 = new AudioFormat((float) class10.field98, 16, class85.field1155 ? 2 : 1, true, false);
        this.field3768 = new byte[0x100 << (class85.field1155 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()V")
    public final void method341() throws LineUnavailableException {
        this.field3765.flush();
        if (!this.field3767) {
            return;
        }
        this.field3765.close();
        this.field3765 = null;
        Info var1 = new Info(field3770 == null ? (field3770 = method1782("javax.sound.sampled.SourceDataLine")) : field3770, this.field3769, this.field3766 << (class85.field1155 ? 2 : 1));
        this.field3765 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3765.open();
        this.field3765.start();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public final void method328() {
        if (this.field3765 != null) {
            this.field3765.close();
            this.field3765 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()V")
    public final void method342() {
        int var1 = 256;
        if (class85.field1155) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field803[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3768[var2 * 2] = (byte) (var3 >> 8);
            this.field3768[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3765.write(this.field3768, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1782(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
