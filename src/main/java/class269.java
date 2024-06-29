import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class269 extends class637 {

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "Z")
    private boolean field3639 = false;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    private int field3638;

    @OriginalMember(owner = "client!gaa", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field3643;

    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3642;

    @OriginalMember(owner = "client!gaa", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3640;

    @OriginalMember(owner = "client!gaa", name = "I", descriptor = "[B")
    private byte[] field3641;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)V", line = 14)
    public final void method836(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3643 == null ? (field3643 = method1635("javax.sound.sampled.SourceDataLine")) : field3643, this.field3642, arg0 << (class506.field6945 ? 2 : 1));
            this.field3640 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3640.open();
            this.field3640.start();
            this.field3638 = arg0;
        } catch (LineUnavailableException var4) {
            if (class118.method840(287490690, arg0) == 1) {
                this.field3640 = null;
                throw var4;
            } else {
                this.method836(class206.method1334(-1, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 14)
    public static Class method1635(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "()I", line = 35)
    public final int method831() {
        return this.field3638 - (this.field3640.available() >> (class506.field6945 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "()V", line = 42)
    public final void method830() {
        if (this.field3640 != null) {
            this.field3640.close();
            this.field3640 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "()V", line = 55)
    public final void method833() throws LineUnavailableException {
        this.field3640.flush();
        if (!this.field3639) {
            return;
        }
        this.field3640.close();
        this.field3640 = null;
        Info var1 = new Info(field3643 == null ? (field3643 = method1635("javax.sound.sampled.SourceDataLine")) : field3643, this.field3642, this.field3638 << (class506.field6945 ? 2 : 1));
        this.field3640 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3640.open();
        this.field3640.start();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 76)
    public final void method834(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3639 = true;
                    }
                }
            }
        }
        this.field3642 = new AudioFormat((float) class357.field4736, 16, class506.field6945 ? 2 : 1, true, false);
        this.field3641 = new byte[0x100 << (class506.field6945 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V", line = 120)
    public final void method835() {
        int var1 = 256;
        if (class506.field6945) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field8821[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3641[var2 * 2] = (byte) (var3 >> 8);
            this.field3641[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3640.write(this.field3641, 0, var1 << 1);
    }
}
