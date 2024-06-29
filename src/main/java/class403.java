import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class403 extends class304 {

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Z")
    private boolean field5152 = false;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    private int field5150;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5153;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5151;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5149;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "[B")
    private byte[] field5148;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public final void method1788(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5152 = true;
                    }
                }
            }
        }
        this.field5151 = new AudioFormat((float) class66.field901, 16, class669.field9289 ? 2 : 1, true, false);
        this.field5148 = new byte[0x100 << (class669.field9289 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()V", line = 49)
    public final void method1798() throws LineUnavailableException {
        this.field5149.flush();
        if (!this.field5152) {
            return;
        }
        this.field5149.close();
        this.field5149 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5153 == null ? (field5153 = method2294("javax.sound.sampled.SourceDataLine")) : field5153, this.field5151, this.field5150 << (class669.field9289 ? 2 : 1));
        this.field5149 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5149.open();
        this.field5149.start();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 56)
    public static Class method2294(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I", line = 68)
    public final int method1787() {
        return this.field5150 - (this.field5149.available() >> (class669.field9289 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 75)
    public final void method1786() {
        if (this.field5149 != null) {
            this.field5149.close();
            this.field5149 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()V", line = 93)
    public final void method1790() {
        int var1 = 256;
        if (class669.field9289) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3978[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5148[var2 * 2] = (byte) (var3 >> 8);
            this.field5148[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5149.write(this.field5148, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 129)
    public final void method1784(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5153 == null ? (field5153 = method2294("javax.sound.sampled.SourceDataLine")) : field5153, this.field5151, arg0 << (class669.field9289 ? 2 : 1));
            this.field5149 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5149.open();
            this.field5149.start();
            this.field5150 = arg0;
        } catch (LineUnavailableException var4) {
            if (class677.method3722(arg0, 1431655765) == 1) {
                this.field5149 = null;
                throw var4;
            } else {
                this.method1784(class426.method2447(arg0, 250));
            }
        }
    }
}
