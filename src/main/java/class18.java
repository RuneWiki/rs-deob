import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class18 extends class267 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "Z")
    private boolean field205 = false;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field210;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field209;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field208;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "[B")
    private byte[] field207;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 12)
    public final void method126(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field210 == null ? (field210 = method132("javax.sound.sampled.SourceDataLine")) : field210, this.field209, arg0 << (class196.field3112 ? 2 : 1));
            this.field208 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field208.open();
            this.field208.start();
            this.field206 = arg0;
        } catch (LineUnavailableException var4) {
            if (class279.method1961(arg0, 252645135) == 1) {
                this.field208 = null;
                throw var4;
            } else {
                this.method126(class230.method1638((byte) 111, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method132(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 35)
    public final void method127(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field205 = true;
                    }
                }
            }
        }
        this.field209 = new AudioFormat((float) class41.field607, 16, class196.field3112 ? 2 : 1, true, false);
        this.field207 = new byte[0x100 << (class196.field3112 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "()I", line = 71)
    public final int method128() {
        return this.field206 - (this.field208.available() >> (class196.field3112 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 78)
    public final void method129() throws LineUnavailableException {
        this.field208.flush();
        if (!this.field205) {
            return;
        }
        this.field208.close();
        this.field208 = null;
        Info var1 = new Info(field210 == null ? (field210 = method132("javax.sound.sampled.SourceDataLine")) : field210, this.field209, this.field206 << (class196.field3112 ? 2 : 1));
        this.field208 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field208.open();
        this.field208.start();
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "()V", line = 102)
    public final void method130() {
        int var1 = 256;
        if (class196.field3112) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3996[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field207[var2 * 2] = (byte) (var3 >> 8);
            this.field207[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field208.write(this.field207, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()V", line = 135)
    public final void method131() {
        if (this.field208 != null) {
            this.field208.close();
            this.field208 = null;
        }
    }
}
