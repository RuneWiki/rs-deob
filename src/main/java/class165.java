import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class165 extends class176 {

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Z")
    private boolean field1906 = false;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1909;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1905;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1904;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "[B")
    private byte[] field1908;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()I", line = 11)
    public final int method184() {
        return this.field1907 - (this.field1904.available() >> (class255.field3311 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 21)
    public final void method180(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1909 == null ? (field1909 = method1039("javax.sound.sampled.SourceDataLine")) : field1909, this.field1905, arg0 << (class255.field3311 ? 2 : 1));
            this.field1904 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1904.open();
            this.field1904.start();
            this.field1907 = arg0;
        } catch (LineUnavailableException var4) {
            if (class152.method972((byte) 49, arg0) == 1) {
                this.field1904 = null;
                throw var4;
            } else {
                this.method180(class39.method249(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 21)
    public static Class method1039(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 42)
    public final void method182() {
        if (this.field1904 != null) {
            this.field1904.close();
            this.field1904 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()V", line = 55)
    public final void method183() throws LineUnavailableException {
        this.field1904.flush();
        if (!this.field1906) {
            return;
        }
        this.field1904.close();
        this.field1904 = null;
        Info var1 = new Info(field1909 == null ? (field1909 = method1039("javax.sound.sampled.SourceDataLine")) : field1909, this.field1905, this.field1907 << (class255.field3311 ? 2 : 1));
        this.field1904 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1904.open();
        this.field1904.start();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 77)
    public final void method185(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1906 = true;
                    }
                }
            }
        }
        this.field1905 = new AudioFormat((float) class247.field3267, 16, class255.field3311 ? 2 : 1, true, false);
        this.field1908 = new byte[0x100 << (class255.field3311 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 118)
    public final void method179() {
        int var1 = 256;
        if (class255.field3311) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2043[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1908[var2 * 2] = (byte) (var3 >> 8);
            this.field1908[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1904.write(this.field1908, 0, var1 << 1);
    }
}
