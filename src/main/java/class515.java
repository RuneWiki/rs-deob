import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class515 extends class552 {

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "Z")
    private boolean field7166 = false;

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
    private int field7162;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field7167;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7164;

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7163;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "[B")
    private byte[] field7165;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "()V")
    public final void method2921() {
        int var1 = 256;
        if (class59.field747) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7528[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7165[var2 * 2] = (byte) (var3 >> 8);
            this.field7165[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7163.write(this.field7165, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "()I")
    public final int method2922() {
        return this.field7162 - (this.field7163.available() >> (class59.field747 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
    public final void method2923(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field7167 == null ? (field7167 = method2927("javax.sound.sampled.SourceDataLine")) : field7167, this.field7164, arg0 << (class59.field747 ? 2 : 1));
            this.field7163 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7163.open();
            this.field7163.start();
            this.field7162 = arg0;
        } catch (LineUnavailableException var4) {
            if (class219.method1384((byte) 110, arg0) == 1) {
                this.field7163 = null;
                throw var4;
            } else {
                this.method2923(class385.method2206(0, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "()V")
    public final void method2924() {
        if (this.field7163 != null) {
            this.field7163.close();
            this.field7163 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "()V")
    public final void method2925() throws LineUnavailableException {
        this.field7163.flush();
        if (!this.field7166) {
            return;
        }
        this.field7163.close();
        this.field7163 = null;
        Info var1 = new Info(field7167 == null ? (field7167 = method2927("javax.sound.sampled.SourceDataLine")) : field7167, this.field7164, this.field7162 << (class59.field747 ? 2 : 1));
        this.field7163 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7163.open();
        this.field7163.start();
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2926(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7166 = true;
                    }
                }
            }
        }
        this.field7164 = new AudioFormat((float) class169.field2422, 16, class59.field747 ? 2 : 1, true, false);
        this.field7165 = new byte[0x100 << (class59.field747 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2927(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
