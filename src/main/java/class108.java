import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class108 extends class241 {

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Z")
    private boolean field2110 = false;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2111;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2107;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2106;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "[B")
    private byte[] field2108;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public final int method22() {
        return this.field2109 - (this.field2106.available() >> (class162.field2909 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method23(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var3 < var4.length) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2110 = true;
                    }
                }
                var3++;
            }
        }
        this.field2107 = new AudioFormat((float) class200.field3446, 16, class162.field2909 ? 2 : 1, true, false);
        this.field2108 = new byte[0x100 << (class162.field2909 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()V")
    public final void method24() throws LineUnavailableException {
        this.field2106.flush();
        if (!this.field2110) {
            return;
        }
        this.field2106.close();
        this.field2106 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2111 == null ? (field2111 = method737("javax.sound.sampled.SourceDataLine")) : field2111, this.field2107, this.field2109 << (class162.field2909 ? 2 : 1));
        this.field2106 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2106.open();
        this.field2106.start();
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
    public final void method19() {
        if (this.field2106 != null) {
            this.field2106.close();
            this.field2106 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2111 == null ? (field2111 = method737("javax.sound.sampled.SourceDataLine")) : field2111, this.field2107, arg0 << (class162.field2909 ? 2 : 1));
            this.field2106 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2106.open();
            this.field2106.start();
            this.field2109 = arg0;
        } catch (LineUnavailableException var4) {
            if (class53.method363(arg0, (byte) -73) == 1) {
                this.field2106 = null;
                throw var4;
            } else {
                this.method18(class62.method413(arg0, -21189));
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public final void method20() {
        int var1 = 256;
        if (class162.field2909) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4206[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2108[var2 * 2] = (byte) (var3 >> 8);
            this.field2108[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2106.write(this.field2108, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method737(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
