import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class301 extends class422 {

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
    private boolean field4295 = false;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field4300;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4299;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4296;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "[B")
    private byte[] field4298;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method1873(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4300 == null ? (field4300 = method1879("javax.sound.sampled.SourceDataLine")) : field4300, this.field4299, arg0 << (class410.field5752 ? 2 : 1));
            this.field4296 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4296.open();
            this.field4296.start();
            this.field4297 = arg0;
        } catch (LineUnavailableException var4) {
            if (class232.method1471(arg0, (byte) 23) == 1) {
                this.field4296 = null;
                throw var4;
            } else {
                this.method1873(class276.method1708(1256978000, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public final void method1874() throws LineUnavailableException {
        this.field4296.flush();
        if (!this.field4295) {
            return;
        }
        this.field4296.close();
        this.field4296 = null;
        Info var1 = new Info(field4300 == null ? (field4300 = method1879("javax.sound.sampled.SourceDataLine")) : field4300, this.field4299, this.field4297 << (class410.field5752 ? 2 : 1));
        this.field4296 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4296.open();
        this.field4296.start();
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
    public final void method1875() {
        if (this.field4296 != null) {
            this.field4296.close();
            this.field4296 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
    public final void method1876() {
        int var1 = 256;
        if (class410.field5752) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5884[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4298[var2 * 2] = (byte) (var3 >> 8);
            this.field4298[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4296.write(this.field4298, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()I")
    public final int method1877() {
        return this.field4297 - (this.field4296.available() >> (class410.field5752 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1878(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4295 = true;
                    }
                }
            }
        }
        this.field4299 = new AudioFormat((float) class31.field409, 16, class410.field5752 ? 2 : 1, true, false);
        this.field4298 = new byte[0x100 << (class410.field5752 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1879(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
