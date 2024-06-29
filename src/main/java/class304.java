import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class304 extends class110 {

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
    private boolean field5163 = false;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    private int field5165;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field5166;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5162;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5161;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "[B")
    private byte[] field5164;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 10)
    public final void method759() throws LineUnavailableException {
        this.field5161.flush();
        if (!this.field5163) {
            return;
        }
        this.field5161.close();
        this.field5161 = null;
        Info var1 = new Info(field5166 == null ? (field5166 = method2106("javax.sound.sampled.SourceDataLine")) : field5166, this.field5162, this.field5165 << (class219.field3799 ? 2 : 1));
        this.field5161 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5161.open();
        this.field5161.start();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 16)
    public static Class method2106(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 31)
    public final void method762(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5166 == null ? (field5166 = method2106("javax.sound.sampled.SourceDataLine")) : field5166, this.field5162, arg0 << (class219.field3799 ? 2 : 1));
            this.field5161 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5161.open();
            this.field5161.start();
            this.field5165 = arg0;
        } catch (LineUnavailableException var4) {
            if (class201.method1411(arg0, true) == 1) {
                this.field5161 = null;
                throw var4;
            } else {
                this.method762(class135.method922(21793, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 52)
    public final void method766() {
        if (this.field5161 != null) {
            this.field5161.close();
            this.field5161 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I", line = 67)
    public final int method761() {
        return this.field5165 - (this.field5161.available() >> (class219.field3799 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V", line = 81)
    public final void method757() {
        int var1 = 256;
        if (class219.field3799) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1971[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5164[var2 * 2] = (byte) (var3 >> 8);
            this.field5164[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5161.write(this.field5164, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 115)
    public final void method755(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5163 = true;
                    }
                }
            }
        }
        this.field5162 = new AudioFormat((float) class307.field5236, 16, class219.field3799 ? 2 : 1, true, false);
        this.field5164 = new byte[0x100 << (class219.field3799 ? 2 : 1)];
    }
}
