import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class47 extends class316 {

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field648;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field645;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field647;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "[B")
    private byte[] field646;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V", line = 12)
    public final void method296() throws LineUnavailableException {
        this.field647.flush();
        if (!this.field643) {
            return;
        }
        this.field647.close();
        this.field647 = null;
        Info var1 = new Info(field648 == null ? (field648 = method302("javax.sound.sampled.SourceDataLine")) : field648, this.field645, this.field644 << (class44.field553 ? 2 : 1));
        this.field647 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field647.open();
        this.field647.start();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 19)
    public static Class method302(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 35)
    public final void method297() {
        int var1 = 256;
        if (class44.field553) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4905[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field646[var2 * 2] = (byte) (var3 >> 8);
            this.field646[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field647.write(this.field646, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()I", line = 68)
    public final int method298() {
        return this.field644 - (this.field647.available() >> (class44.field553 ? 2 : 1));
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 77)
    public final void method299(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field648 == null ? (field648 = method302("javax.sound.sampled.SourceDataLine")) : field648, this.field645, arg0 << (class44.field553 ? 2 : 1));
            this.field647 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field647.open();
            this.field647.start();
            this.field644 = arg0;
        } catch (LineUnavailableException var4) {
            if (class24.method134(arg0, 1431655765) == 1) {
                this.field647 = null;
                throw var4;
            } else {
                this.method299(class120.method843(-75, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 101)
    public final void method300(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field643 = true;
                    }
                }
            }
        }
        this.field645 = new AudioFormat((float) class338.field5275, 16, class44.field553 ? 2 : 1, true, false);
        this.field646 = new byte[0x100 << (class44.field553 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()V", line = 138)
    public final void method301() {
        if (this.field647 != null) {
            this.field647.close();
            this.field647 = null;
        }
    }
}
