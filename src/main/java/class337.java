import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class337 extends class354 {

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Z")
    private boolean field5259 = false;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    private int field5261;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5264;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5262;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5260;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[B")
    private byte[] field5263;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 11)
    public final void method32() {
        if (this.field5260 != null) {
            this.field5260.close();
            this.field5260 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 31)
    public final void method27(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5264 == null ? (field5264 = method2351("javax.sound.sampled.SourceDataLine")) : field5264, this.field5262, arg0 << (class82.field1059 ? 2 : 1));
            this.field5260 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5260.open();
            this.field5260.start();
            this.field5261 = arg0;
        } catch (LineUnavailableException var4) {
            if (class335.method2342(-31511, arg0) == 1) {
                this.field5260 = null;
                throw var4;
            } else {
                this.method27(class262.method1805(arg0, (byte) -39));
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 31)
    public static Class method2351(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I", line = 53)
    public final int method31() {
        return this.field5261 - (this.field5260.available() >> (class82.field1059 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 60)
    public final void method28() throws LineUnavailableException {
        this.field5260.flush();
        if (!this.field5259) {
            return;
        }
        this.field5260.close();
        this.field5260 = null;
        Info var1 = new Info(field5264 == null ? (field5264 = method2351("javax.sound.sampled.SourceDataLine")) : field5264, this.field5262, this.field5261 << (class82.field1059 ? 2 : 1));
        this.field5260 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5260.open();
        this.field5260.start();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 84)
    public final void method29(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5259 = true;
                    }
                }
            }
        }
        this.field5262 = new AudioFormat((float) class85.field1091, 16, class82.field1059 ? 2 : 1, true, false);
        this.field5263 = new byte[0x100 << (class82.field1059 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()V", line = 121)
    public final void method33() {
        int var1 = 256;
        if (class82.field1059) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5530[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5263[var2 * 2] = (byte) (var3 >> 8);
            this.field5263[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5260.write(this.field5263, 0, var1 << 1);
    }
}
