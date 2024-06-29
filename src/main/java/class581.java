import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class581 extends class414 {

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "Z")
    private boolean field7902 = false;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
    private int field7906;

    @OriginalMember(owner = "client!fs", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field7907;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7904;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7905;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "[B")
    private byte[] field7903;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method2292(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field7907 == null ? (field7907 = method3279("javax.sound.sampled.SourceDataLine")) : field7907, this.field7904, arg0 << (class177.field2341 ? 2 : 1));
            this.field7905 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7905.open();
            this.field7905.start();
            this.field7906 = arg0;
        } catch (LineUnavailableException var4) {
            if (class434.method2603(-124, arg0) == 1) {
                this.field7905 = null;
                throw var4;
            } else {
                this.method2292(class8.method45(23714, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2297(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7902 = true;
                    }
                }
            }
        }
        this.field7904 = new AudioFormat((float) class624.field8419, 16, class177.field2341 ? 2 : 1, true, false);
        this.field7903 = new byte[0x100 << (class177.field2341 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "()V")
    public final void method2294() {
        int var1 = 256;
        if (class177.field2341) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5949[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7903[var2 * 2] = (byte) (var3 >> 8);
            this.field7903[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7905.write(this.field7903, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "()V")
    public final void method2295() {
        if (this.field7905 != null) {
            this.field7905.close();
            this.field7905 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
    public final int method2293() {
        return this.field7906 - (this.field7905.available() >> (class177.field2341 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "()V")
    public final void method2296() throws LineUnavailableException {
        this.field7905.flush();
        if (!this.field7902) {
            return;
        }
        this.field7905.close();
        this.field7905 = null;
        Info var1 = new Info(field7907 == null ? (field7907 = method3279("javax.sound.sampled.SourceDataLine")) : field7907, this.field7904, this.field7906 << (class177.field2341 ? 2 : 1));
        this.field7905 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7905.open();
        this.field7905.start();
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3279(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
