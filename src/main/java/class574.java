import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class574 extends class550 {

    @OriginalMember(owner = "client!bha", name = "I", descriptor = "Z")
    private boolean field7886 = false;

    @OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!bha", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field7888;

    @OriginalMember(owner = "client!bha", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7887;

    @OriginalMember(owner = "client!bha", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7885;

    @OriginalMember(owner = "client!bha", name = "G", descriptor = "[B")
    private byte[] field7884;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "()V", line = 10)
    public final void method665() {
        if (this.field7885 != null) {
            this.field7885.close();
            this.field7885 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V", line = 26)
    public final void method668(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field7888 == null ? (field7888 = method3317("javax.sound.sampled.SourceDataLine")) : field7888, this.field7887, arg0 << (class86.field1544 ? 2 : 1));
            this.field7885 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7885.open();
            this.field7885.start();
            this.field7883 = arg0;
        } catch (LineUnavailableException var4) {
            if (class108.method969(arg0, (byte) 43) == 1) {
                this.field7885 = null;
                throw var4;
            } else {
                this.method668(class529.method3059(arg0, (byte) 108));
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 26)
    public static Class method3317(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 51)
    public final void method666(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7886 = true;
                    }
                }
            }
        }
        this.field7887 = new AudioFormat((float) class103.field1834, 16, class86.field1544 ? 2 : 1, true, false);
        this.field7884 = new byte[0x100 << (class86.field1544 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "()I", line = 87)
    public final int method663() {
        return this.field7883 - (this.field7885.available() >> (class86.field1544 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "()V", line = 94)
    public final void method662() throws LineUnavailableException {
        this.field7885.flush();
        if (!this.field7886) {
            return;
        }
        this.field7885.close();
        this.field7885 = null;
        Info var1 = new Info(field7888 == null ? (field7888 = method3317("javax.sound.sampled.SourceDataLine")) : field7888, this.field7887, this.field7883 << (class86.field1544 ? 2 : 1));
        this.field7885 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7885.open();
        this.field7885.start();
    }

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "()V", line = 116)
    public final void method667() {
        int var1 = 256;
        if (class86.field1544) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7569[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7884[var2 * 2] = (byte) (var3 >> 8);
            this.field7884[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7885.write(this.field7884, 0, var1 << 1);
    }
}
