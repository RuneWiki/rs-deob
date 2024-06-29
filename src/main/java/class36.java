import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 extends class199 {

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Z")
    private boolean field528 = false;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field529;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field526;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field527;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "[B")
    private byte[] field525;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 15)
    public final void method238() {
        int var1 = 256;
        if (class26.field348) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3359[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field525[var2 * 2] = (byte) (var3 >> 8);
            this.field525[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field527.write(this.field525, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 49)
    public final void method239(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var3 < var4.length) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field528 = true;
                    }
                }
                var3++;
            }
        }
        this.field526 = new AudioFormat((float) class99.field1644, 16, class26.field348 ? 2 : 1, true, false);
        this.field525 = new byte[0x100 << (class26.field348 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 85)
    public final void method240() {
        if (this.field527 != null) {
            this.field527.close();
            this.field527 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I", line = 97)
    public final int method241() {
        return this.field524 - (this.field527.available() >> (class26.field348 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 107)
    public final void method242(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field529 == null ? (field529 = method244("javax.sound.sampled.SourceDataLine")) : field529, this.field526, arg0 << (class26.field348 ? 2 : 1));
            this.field527 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field527.open();
            this.field527.start();
            this.field524 = arg0;
        } catch (LineUnavailableException var4) {
            if (class265.method1887(arg0, 634549986) == 1) {
                this.field527 = null;
                throw var4;
            } else {
                this.method242(class118.method904(1440830960, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 107)
    public static Class method244(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()V", line = 128)
    public final void method243() throws LineUnavailableException {
        this.field527.flush();
        if (!this.field528) {
            return;
        }
        this.field527.close();
        this.field527 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field529 == null ? (field529 = method244("javax.sound.sampled.SourceDataLine")) : field529, this.field526, this.field524 << (class26.field348 ? 2 : 1));
        this.field527 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field527.open();
        this.field527.start();
    }
}
