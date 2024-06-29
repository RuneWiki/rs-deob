import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class466 extends class400 {

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "Z")
    private boolean field6886 = false;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field6891;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6890;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6888;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "[B")
    private byte[] field6889;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
    public final void method2319() {
        int var1 = 256;
        if (class323.field4619) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5992[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6889[var2 * 2] = (byte) (var3 >> 8);
            this.field6889[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6888.write(this.field6889, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "()I")
    public final int method2322() {
        return this.field6887 - (this.field6888.available() >> (class323.field4619 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "()V")
    public final void method2323() {
        if (this.field6888 != null) {
            this.field6888.close();
            this.field6888 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public final void method2320(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6891 == null ? (field6891 = method2793("javax.sound.sampled.SourceDataLine")) : field6891, this.field6890, arg0 << (class323.field4619 ? 2 : 1));
            this.field6888 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6888.open();
            this.field6888.start();
            this.field6887 = arg0;
        } catch (LineUnavailableException var4) {
            if (class109.method673(-8081, arg0) == 1) {
                this.field6888 = null;
                throw var4;
            } else {
                this.method2320(class476.method2841(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "()V")
    public final void method2318() throws LineUnavailableException {
        this.field6888.flush();
        if (!this.field6886) {
            return;
        }
        this.field6888.close();
        this.field6888 = null;
        Info var1 = new Info(field6891 == null ? (field6891 = method2793("javax.sound.sampled.SourceDataLine")) : field6891, this.field6890, this.field6887 << (class323.field4619 ? 2 : 1));
        this.field6888 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6888.open();
        this.field6888.start();
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2324(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6886 = true;
                    }
                }
            }
        }
        this.field6890 = new AudioFormat((float) class366.field5600, 16, class323.field4619 ? 2 : 1, true, false);
        this.field6889 = new byte[0x100 << (class323.field4619 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2793(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
