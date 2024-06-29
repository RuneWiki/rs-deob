import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class417 extends class288 {

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Z")
    private boolean field5810 = false;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    private int field5811;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field5815;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5812;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5813;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[B")
    private byte[] field5814;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()V", line = 11)
    public final void method1912() throws LineUnavailableException {
        this.field5813.flush();
        if (!this.field5810) {
            return;
        }
        this.field5813.close();
        this.field5813 = null;
        Info var1 = new Info(field5815 == null ? (field5815 = method2524("javax.sound.sampled.SourceDataLine")) : field5815, this.field5812, this.field5811 << (class568.field8013 ? 2 : 1));
        this.field5813 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5813.open();
        this.field5813.start();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 18)
    public static Class method2524(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V", line = 30)
    public final void method1901() {
        if (this.field5813 != null) {
            this.field5813.close();
            this.field5813 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V", line = 46)
    public final void method1911() {
        int var1 = 256;
        if (class568.field8013) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4218[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5814[var2 * 2] = (byte) (var3 >> 8);
            this.field5814[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5813.write(this.field5814, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 81)
    public final void method1914(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5815 == null ? (field5815 = method2524("javax.sound.sampled.SourceDataLine")) : field5815, this.field5812, arg0 << (class568.field8013 ? 2 : 1));
            this.field5813 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5813.open();
            this.field5813.start();
            this.field5811 = arg0;
        } catch (LineUnavailableException var4) {
            if (class511.method3024(arg0, 30667) == 1) {
                this.field5813 = null;
                throw var4;
            } else {
                this.method1914(class179.method1142(arg0, -32));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I", line = 105)
    public final int method1910() {
        return this.field5811 - (this.field5813.available() >> (class568.field8013 ? 2 : 1));
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 114)
    public final void method1907(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5810 = true;
                    }
                }
            }
        }
        this.field5812 = new AudioFormat((float) class223.field3174, 16, class568.field8013 ? 2 : 1, true, false);
        this.field5814 = new byte[0x100 << (class568.field8013 ? 2 : 1)];
    }
}
