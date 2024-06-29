import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class305 extends class89 {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
    private boolean field5091 = false;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field5094;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5089;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5093;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[B")
    private byte[] field5090;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I", line = 10)
    public final int method373() {
        return this.field5092 - (this.field5093.available() >> (class222.field3657 ? 2 : 1));
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 21)
    public final void method377(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5094 == null ? (field5094 = method2057("javax.sound.sampled.SourceDataLine")) : field5094, this.field5089, arg0 << (class222.field3657 ? 2 : 1));
            this.field5093 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5093.open();
            this.field5093.start();
            this.field5092 = arg0;
        } catch (LineUnavailableException var4) {
            if (class323.method2216(arg0, (byte) -71) == 1) {
                this.field5093 = null;
                throw var4;
            } else {
                this.method377(class303.method2049(arg0, 2539));
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 21)
    public static Class method2057(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 44)
    public final void method378() {
        if (this.field5093 != null) {
            this.field5093.close();
            this.field5093 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 59)
    public final void method376() throws LineUnavailableException {
        this.field5093.flush();
        if (!this.field5091) {
            return;
        }
        this.field5093.close();
        this.field5093 = null;
        Info var1 = new Info(field5094 == null ? (field5094 = method2057("javax.sound.sampled.SourceDataLine")) : field5094, this.field5089, this.field5092 << (class222.field3657 ? 2 : 1));
        this.field5093 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5093.open();
        this.field5093.start();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 81)
    public final void method375(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5091 = true;
                    }
                }
                var3++;
            }
        }
        this.field5089 = new AudioFormat((float) class255.field4264, 16, class222.field3657 ? 2 : 1, true, false);
        this.field5090 = new byte[0x100 << (class222.field3657 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 119)
    public final void method374() {
        int var1 = 256;
        if (class222.field3657) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1521[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5090[var2 * 2] = (byte) (var3 >> 8);
            this.field5090[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5093.write(this.field5090, 0, var1 << 1);
    }
}
