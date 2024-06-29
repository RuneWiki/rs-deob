import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class170 extends class138 {

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Z")
    private boolean field2754 = false;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2756;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2753;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2752;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "[B")
    private byte[] field2755;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
    public final void method1048() {
        int var1 = 256;
        if (class525.field7704) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2236[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2755[var2 * 2] = (byte) (var3 >> 8);
            this.field2755[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2752.write(this.field2755, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()I")
    public final int method1053() {
        return this.field2751 - (this.field2752.available() >> (class525.field7704 ? 2 : 1));
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1056(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2754 = true;
                    }
                }
            }
        }
        this.field2753 = new AudioFormat((float) class616.field8814, 16, class525.field7704 ? 2 : 1, true, false);
        this.field2755 = new byte[0x100 << (class525.field7704 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()V")
    public final void method1058() throws LineUnavailableException {
        this.field2752.flush();
        if (!this.field2754) {
            return;
        }
        this.field2752.close();
        this.field2752 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2756 == null ? (field2756 = method1266("javax.sound.sampled.SourceDataLine")) : field2756, this.field2753, this.field2751 << (class525.field7704 ? 2 : 1));
        this.field2752 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2752.open();
        this.field2752.start();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public final void method1049(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2756 == null ? (field2756 = method1266("javax.sound.sampled.SourceDataLine")) : field2756, this.field2753, arg0 << (class525.field7704 ? 2 : 1));
            this.field2752 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2752.open();
            this.field2752.start();
            this.field2751 = arg0;
        } catch (LineUnavailableException var4) {
            if (class528.method3103(arg0, (byte) -107) == 1) {
                this.field2752 = null;
                throw var4;
            } else {
                this.method1049(class99.method830(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()V")
    public final void method1050() {
        if (this.field2752 != null) {
            this.field2752.close();
            this.field2752 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1266(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
