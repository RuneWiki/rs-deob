import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class135 extends class234 {

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Z")
    private boolean field2471 = false;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2472;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2468;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2469;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "[B")
    private byte[] field2470;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final void method544(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2472 == null ? (field2472 = method885("javax.sound.sampled.SourceDataLine")) : field2472, this.field2468, arg0 << (class137.field2526 ? 2 : 1));
            this.field2469 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2469.open();
            this.field2469.start();
            this.field2467 = arg0;
        } catch (LineUnavailableException var4) {
            if (class53.method335(-114, arg0) == 1) {
                this.field2469 = null;
                throw var4;
            } else {
                this.method544(class143.method943(1487780168, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()V")
    public final void method542() {
        if (this.field2469 != null) {
            this.field2469.close();
            this.field2469 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
    public final int method545() {
        return this.field2467 - (this.field2469.available() >> (class137.field2526 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "()V")
    public final void method541() throws LineUnavailableException {
        this.field2469.flush();
        if (!this.field2471) {
            return;
        }
        this.field2469.close();
        this.field2469 = null;
        Info var1 = new Info(field2472 == null ? (field2472 = method885("javax.sound.sampled.SourceDataLine")) : field2472, this.field2468, this.field2467 << (class137.field2526 ? 2 : 1));
        this.field2469 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2469.open();
        this.field2469.start();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method540(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2471 = true;
                    }
                }
            }
        }
        this.field2468 = new AudioFormat((float) class198.field3580, 16, class137.field2526 ? 2 : 1, true, false);
        this.field2470 = new byte[0x100 << (class137.field2526 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()V")
    public final void method546() {
        int var1 = 256;
        if (class137.field2526) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4085[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2470[var2 * 2] = (byte) (var3 >> 8);
            this.field2470[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2469.write(this.field2470, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method885(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
