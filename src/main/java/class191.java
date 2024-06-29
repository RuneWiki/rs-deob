import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class191 extends class145 {

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "Z")
    private boolean field3099 = false;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3101;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3097;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3096;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "[B")
    private byte[] field3100;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V", line = 13)
    public final void method1000() {
        int var1 = 256;
        if (class218.field3549) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2249[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3100[var2 * 2] = (byte) (var3 >> 8);
            this.field3100[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3096.write(this.field3100, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V", line = 47)
    public final void method999() {
        if (this.field3096 != null) {
            this.field3096.close();
            this.field3096 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 61)
    public final void method1003(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3101 == null ? (field3101 = method1352("javax.sound.sampled.SourceDataLine")) : field3101, this.field3097, arg0 << (class218.field3549 ? 2 : 1));
            this.field3096 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3096.open();
            this.field3096.start();
            this.field3098 = arg0;
        } catch (LineUnavailableException var4) {
            if (class157.method1114(arg0, (byte) -91) == 1) {
                this.field3096 = null;
                throw var4;
            } else {
                this.method1003(class180.method1294(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 61)
    public static Class method1352(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()I", line = 83)
    public final int method989() {
        return this.field3098 - (this.field3096.available() >> (class218.field3549 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 94)
    public final void method990(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3099 = true;
                    }
                }
            }
        }
        this.field3097 = new AudioFormat((float) class62.field820, 16, class218.field3549 ? 2 : 1, true, false);
        this.field3100 = new byte[0x100 << (class218.field3549 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 131)
    public final void method988() throws LineUnavailableException {
        this.field3096.flush();
        if (!this.field3099) {
            return;
        }
        this.field3096.close();
        this.field3096 = null;
        Info var1 = new Info(field3101 == null ? (field3101 = method1352("javax.sound.sampled.SourceDataLine")) : field3101, this.field3097, this.field3098 << (class218.field3549 ? 2 : 1));
        this.field3096 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3096.open();
        this.field3096.start();
    }
}
