import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class218 extends class196 {

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
    private boolean field3472 = false;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    private int field3471;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3475;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3473;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3470;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[B")
    private byte[] field3474;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()V", line = 14)
    public final void method741() {
        int var1 = 256;
        if (class232.field3855) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3134[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3474[var2 * 2] = (byte) (var3 >> 8);
            this.field3474[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3470.write(this.field3474, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 51)
    public final void method739(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3475 == null ? (field3475 = method1631("javax.sound.sampled.SourceDataLine")) : field3475, this.field3473, arg0 << (class232.field3855 ? 2 : 1));
            this.field3470 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3470.open();
            this.field3470.start();
            this.field3471 = arg0;
        } catch (LineUnavailableException var4) {
            if (class241.method1834(arg0, true) == 1) {
                this.field3470 = null;
                throw var4;
            } else {
                this.method739(class206.method1575(arg0, (byte) 99));
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 51)
    public static Class method1631(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 73)
    public final void method743(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3472 = true;
                    }
                }
            }
        }
        this.field3473 = new AudioFormat((float) class227.field3788, 16, class232.field3855 ? 2 : 1, true, false);
        this.field3474 = new byte[0x100 << (class232.field3855 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()I", line = 110)
    public final int method737() {
        return this.field3471 - (this.field3470.available() >> (class232.field3855 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()V", line = 118)
    public final void method740() {
        if (this.field3470 != null) {
            this.field3470.close();
            this.field3470 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 131)
    public final void method742() throws LineUnavailableException {
        this.field3470.flush();
        if (!this.field3472) {
            return;
        }
        this.field3470.close();
        this.field3470 = null;
        Info var1 = new Info(field3475 == null ? (field3475 = method1631("javax.sound.sampled.SourceDataLine")) : field3475, this.field3473, this.field3471 << (class232.field3855 ? 2 : 1));
        this.field3470 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3470.open();
        this.field3470.start();
    }
}
