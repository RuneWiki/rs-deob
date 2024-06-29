import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class113 extends class83 {

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Z")
    private boolean field2047 = false;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2052;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2048;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2049;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "[B")
    private byte[] field2050;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public final void method621(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2052 == null ? (field2052 = method814("javax.sound.sampled.SourceDataLine")) : field2052, this.field2048, arg0 << (class102.field1899 ? 2 : 1));
            this.field2049 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2049.open();
            this.field2049.start();
            this.field2051 = arg0;
        } catch (LineUnavailableException var4) {
            if (class166.method1133((byte) -127, arg0) == 1) {
                this.field2049 = null;
                throw var4;
            } else {
                this.method621(class105.method760((byte) 121, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()I")
    public final int method632() {
        return this.field2051 - (this.field2049.available() >> (class102.field1899 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V")
    public final void method629() throws LineUnavailableException {
        this.field2049.flush();
        if (!this.field2047) {
            return;
        }
        this.field2049.close();
        this.field2049 = null;
        Info var1 = new Info(field2052 == null ? (field2052 = method814("javax.sound.sampled.SourceDataLine")) : field2052, this.field2048, this.field2051 << (class102.field1899 ? 2 : 1));
        this.field2049 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2049.open();
        this.field2049.start();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public final void method623() {
        if (this.field2049 != null) {
            this.field2049.close();
            this.field2049 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()V")
    public final void method627() {
        int var1 = 256;
        if (class102.field1899) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1610[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2050[var2 * 2] = (byte) (var3 >> 8);
            this.field2050[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2049.write(this.field2050, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method625(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2047 = true;
                    }
                }
            }
        }
        this.field2048 = new AudioFormat((float) class134.field2399, 16, class102.field1899 ? 2 : 1, true, false);
        this.field2050 = new byte[0x100 << (class102.field1899 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method814(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
