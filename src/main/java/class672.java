import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class672 extends class531 {

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Z")
    private boolean field9353 = false;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field9357;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field9358;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field9354;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field9356;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "[B")
    private byte[] field9355;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V", line = 10)
    public final void method199() throws LineUnavailableException {
        this.field9356.flush();
        if (!this.field9353) {
            return;
        }
        this.field9356.close();
        this.field9356 = null;
        Info var1 = new Info(field9358 == null ? (field9358 = method3802("javax.sound.sampled.SourceDataLine")) : field9358, this.field9354, this.field9357 << (class644.field8627 ? 2 : 1));
        this.field9356 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field9356.open();
        this.field9356.start();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 16)
    public static Class method3802(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()I", line = 29)
    public final int method198() {
        return this.field9357 - (this.field9356.available() >> (class644.field8627 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V", line = 37)
    public final void method196() {
        if (this.field9356 != null) {
            this.field9356.close();
            this.field9356 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 54)
    public final void method195(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field9358 == null ? (field9358 = method3802("javax.sound.sampled.SourceDataLine")) : field9358, this.field9354, arg0 << (class644.field8627 ? 2 : 1));
            this.field9356 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field9356.open();
            this.field9356.start();
            this.field9357 = arg0;
        } catch (LineUnavailableException var4) {
            if (class134.method853(true, arg0) == 1) {
                this.field9356 = null;
                throw var4;
            } else {
                this.method195(class606.method3450(arg0, (byte) -25));
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 79)
    public final void method194() {
        int var1 = 256;
        if (class644.field8627) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7360[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field9355[var2 * 2] = (byte) (var3 >> 8);
            this.field9355[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field9356.write(this.field9355, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 116)
    public final void method197(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field9353 = true;
                    }
                }
            }
        }
        this.field9354 = new AudioFormat((float) class718.field9998, 16, class644.field8627 ? 2 : 1, true, false);
        this.field9355 = new byte[0x100 << (class644.field8627 ? 2 : 1)];
    }
}
