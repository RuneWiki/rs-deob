import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class44 extends class651 {

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field648;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field646;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field644;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "[B")
    private byte[] field647;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "()I")
    public final int method310() {
        return this.field645 - (this.field644.available() >> (class360.field4662 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field648 == null ? (field648 = method316("javax.sound.sampled.SourceDataLine")) : field648, this.field646, arg0 << (class360.field4662 ? 2 : 1));
            this.field644 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field644.open();
            this.field644.start();
            this.field645 = arg0;
        } catch (LineUnavailableException var4) {
            if (class579.method3304(arg0, 2040235568) == 1) {
                this.field644 = null;
                throw var4;
            } else {
                this.method311(class565.method3253(69, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "()V")
    public final void method312() {
        int var1 = 256;
        if (class360.field4662) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field9051[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field647[var2 * 2] = (byte) (var3 >> 8);
            this.field647[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field644.write(this.field647, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "()V")
    public final void method313() {
        if (this.field644 != null) {
            this.field644.close();
            this.field644 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()V")
    public final void method314() throws LineUnavailableException {
        this.field644.flush();
        if (!this.field643) {
            return;
        }
        this.field644.close();
        this.field644 = null;
        Info var1 = new Info(field648 == null ? (field648 = method316("javax.sound.sampled.SourceDataLine")) : field648, this.field646, this.field645 << (class360.field4662 ? 2 : 1));
        this.field644 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field644.open();
        this.field644.start();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method315(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field643 = true;
                    }
                }
            }
        }
        this.field646 = new AudioFormat((float) class541.field7490, 16, class360.field4662 ? 2 : 1, true, false);
        this.field647 = new byte[0x100 << (class360.field4662 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method316(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
