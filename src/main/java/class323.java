import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class323 extends class199 {

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Z")
    private boolean field5521 = false;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field5517;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5522;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5518;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5520;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[B")
    private byte[] field5519;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method1138(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5521 = true;
                    }
                }
            }
        }
        this.field5518 = new AudioFormat((float) class210.field3755, 16, class10.field126 ? 2 : 1, true, false);
        this.field5519 = new byte[0x100 << (class10.field126 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V", line = 47)
    public final void method1133() {
        if (this.field5520 != null) {
            this.field5520.close();
            this.field5520 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V", line = 62)
    public final void method1134() {
        int var1 = 256;
        if (class10.field126) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3592[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5519[var2 * 2] = (byte) (var3 >> 8);
            this.field5519[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5520.write(this.field5519, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V", line = 97)
    public final void method1136() throws LineUnavailableException {
        this.field5520.flush();
        if (!this.field5521) {
            return;
        }
        this.field5520.close();
        this.field5520 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5522 == null ? (field5522 = method2224("javax.sound.sampled.SourceDataLine")) : field5522, this.field5518, this.field5517 << (class10.field126 ? 2 : 1));
        this.field5520 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5520.open();
        this.field5520.start();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 104)
    public static Class method2224(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 118)
    public final void method1135(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5522 == null ? (field5522 = method2224("javax.sound.sampled.SourceDataLine")) : field5522, this.field5518, arg0 << (class10.field126 ? 2 : 1));
            this.field5520 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5520.open();
            this.field5520.start();
            this.field5517 = arg0;
        } catch (LineUnavailableException var4) {
            if (class316.method2197(arg0, 16333) == 1) {
                this.field5520 = null;
                throw var4;
            } else {
                this.method1135(class117.method832(arg0, (byte) 61));
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I", line = 142)
    public final int method1132() {
        return this.field5517 - (this.field5520.available() >> (class10.field126 ? 2 : 1));
    }
}
