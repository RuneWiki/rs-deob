import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class37 extends class224 {

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Z")
    private boolean field531 = false;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field532;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field529;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field528;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[B")
    private byte[] field530;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public final void method286() {
        if (this.field528 != null) {
            this.field528.close();
            this.field528 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public final int method287() {
        return this.field527 - (this.field528.available() >> (class216.field3439 ? 2 : 1));
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method288(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field531 = true;
                    }
                }
            }
        }
        this.field529 = new AudioFormat((float) class28.field329, 16, class216.field3439 ? 2 : 1, true, false);
        this.field530 = new byte[0x100 << (class216.field3439 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final void method289(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field532 == null ? (field532 = method292("javax.sound.sampled.SourceDataLine")) : field532, this.field529, arg0 << (class216.field3439 ? 2 : 1));
            this.field528 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field528.open();
            this.field528.start();
            this.field527 = arg0;
        } catch (LineUnavailableException var4) {
            if (class235.method1664(58, arg0) == 1) {
                this.field528 = null;
                throw var4;
            } else {
                this.method289(class254.method1801(arg0, (byte) 65));
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public final void method290() throws LineUnavailableException {
        this.field528.flush();
        if (!this.field531) {
            return;
        }
        this.field528.close();
        this.field528 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field532 == null ? (field532 = method292("javax.sound.sampled.SourceDataLine")) : field532, this.field529, this.field527 << (class216.field3439 ? 2 : 1));
        this.field528 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field528.open();
        this.field528.start();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public final void method291() {
        int var1 = 256;
        if (class216.field3439) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3588[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field530[var2 * 2] = (byte) (var3 >> 8);
            this.field530[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field528.write(this.field530, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method292(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
