import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class311 extends class295 {

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Z")
    private boolean field4987 = false;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4991;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4990;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4986;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "[B")
    private byte[] field4988;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    public final void method1793() {
        if (this.field4986 != null) {
            this.field4986.close();
            this.field4986 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1797(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4987 = true;
                    }
                }
            }
        }
        this.field4990 = new AudioFormat((float) class91.field1459, 16, class11.field128 ? 2 : 1, true, false);
        this.field4988 = new byte[0x100 << (class11.field128 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
    public final void method1794() throws LineUnavailableException {
        this.field4986.flush();
        if (!this.field4987) {
            return;
        }
        this.field4986.close();
        this.field4986 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4991 == null ? (field4991 = method2098("javax.sound.sampled.SourceDataLine")) : field4991, this.field4990, this.field4989 << (class11.field128 ? 2 : 1));
        this.field4986 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4986.open();
        this.field4986.start();
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method1799(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4991 == null ? (field4991 = method2098("javax.sound.sampled.SourceDataLine")) : field4991, this.field4990, arg0 << (class11.field128 ? 2 : 1));
            this.field4986 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4986.open();
            this.field4986.start();
            this.field4989 = arg0;
        } catch (LineUnavailableException var4) {
            if (class17.method123(858993459, arg0) == 1) {
                this.field4986 = null;
                throw var4;
            } else {
                this.method1799(class172.method1224(arg0, -45054224));
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
    public final int method1796() {
        return this.field4989 - (this.field4986.available() >> (class11.field128 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public final void method1798() {
        int var1 = 256;
        if (class11.field128) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4727[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4988[var2 * 2] = (byte) (var3 >> 8);
            this.field4988[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4986.write(this.field4988, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2098(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
