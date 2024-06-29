import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class177 extends class145 {

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Z")
    private boolean field3175 = false;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field3177;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3172;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3174;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "[B")
    private byte[] field3176;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 13)
    public final void method1005() {
        int var1 = 256;
        if (class125.field2227) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2442[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3176[var2 * 2] = (byte) (var3 >> 8);
            this.field3176[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3174.write(this.field3176, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 50)
    public final void method1008(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3177 == null ? (field3177 = method1215("javax.sound.sampled.SourceDataLine")) : field3177, this.field3172, arg0 << (class125.field2227 ? 2 : 1));
            this.field3174 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3174.open();
            this.field3174.start();
            this.field3173 = arg0;
        } catch (LineUnavailableException var4) {
            if (class311.method2158(arg0, -1161) == 1) {
                this.field3174 = null;
                throw var4;
            } else {
                this.method1008(class286.method2014(arg0, 783135696));
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 50)
    public static Class method1215(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()I", line = 73)
    public final int method993() {
        return this.field3173 - (this.field3174.available() >> (class125.field2227 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 81)
    public final void method992() throws LineUnavailableException {
        this.field3174.flush();
        if (!this.field3175) {
            return;
        }
        this.field3174.close();
        this.field3174 = null;
        Info var1 = new Info(field3177 == null ? (field3177 = method1215("javax.sound.sampled.SourceDataLine")) : field3177, this.field3172, this.field3173 << (class125.field2227 ? 2 : 1));
        this.field3174 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3174.open();
        this.field3174.start();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 101)
    public final void method997(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3175 = true;
                    }
                }
            }
        }
        this.field3172 = new AudioFormat((float) class83.field1408, 16, class125.field2227 ? 2 : 1, true, false);
        this.field3176 = new byte[0x100 << (class125.field2227 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 141)
    public final void method1001() {
        if (this.field3174 != null) {
            this.field3174.close();
            this.field3174 = null;
        }
    }
}
