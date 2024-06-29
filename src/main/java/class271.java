import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class271 extends class179 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
    private boolean field3618 = false;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field3622;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3620;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3621;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "[B")
    private byte[] field3619;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method53(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3618 = true;
                    }
                }
            }
        }
        this.field3620 = new AudioFormat((float) class286.field3762, 16, class495.field7227 ? 2 : 1, true, false);
        this.field3619 = new byte[0x100 << (class495.field7227 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()V")
    public final void method57() {
        int var1 = 256;
        if (class495.field7227) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2328[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3619[var2 * 2] = (byte) (var3 >> 8);
            this.field3619[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3621.write(this.field3619, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
    public final int method56() {
        return this.field3617 - (this.field3621.available() >> (class495.field7227 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()V")
    public final void method52() throws LineUnavailableException {
        this.field3621.flush();
        if (!this.field3618) {
            return;
        }
        this.field3621.close();
        this.field3621 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3622 == null ? (field3622 = method1645("javax.sound.sampled.SourceDataLine")) : field3622, this.field3620, this.field3617 << (class495.field7227 ? 2 : 1));
        this.field3621 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3621.open();
        this.field3621.start();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method54(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3622 == null ? (field3622 = method1645("javax.sound.sampled.SourceDataLine")) : field3622, this.field3620, arg0 << (class495.field7227 ? 2 : 1));
            this.field3621 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3621.open();
            this.field3621.start();
            this.field3617 = arg0;
        } catch (LineUnavailableException var4) {
            if (class425.method2618(13227, arg0) == 1) {
                this.field3621 = null;
                throw var4;
            } else {
                this.method54(class111.method682(31, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public final void method55() {
        if (this.field3621 != null) {
            this.field3621.close();
            this.field3621 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1645(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
