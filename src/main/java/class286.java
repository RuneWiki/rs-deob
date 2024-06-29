import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class286 extends class14 {

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Z")
    private boolean field4670 = false;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4674;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4671;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4669;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "[B")
    private byte[] field4672;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 12)
    public final void method138(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4674 == null ? (field4674 = method2026("javax.sound.sampled.SourceDataLine")) : field4674, this.field4671, arg0 << (class277.field4510 ? 2 : 1));
            this.field4669 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4669.open();
            this.field4669.start();
            this.field4673 = arg0;
        } catch (LineUnavailableException var4) {
            if (class257.method1799(arg0, false) == 1) {
                this.field4669 = null;
                throw var4;
            } else {
                this.method138(class311.method2264(arg0, (byte) -74));
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method2026(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()V", line = 37)
    public final void method149() {
        int var1 = 256;
        if (class277.field4510) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field413[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4672[var2 * 2] = (byte) (var3 >> 8);
            this.field4672[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4669.write(this.field4672, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 74)
    public final void method144(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4670 = true;
                    }
                }
            }
        }
        this.field4671 = new AudioFormat((float) class194.field3261, 16, class277.field4510 ? 2 : 1, true, false);
        this.field4672 = new byte[0x100 << (class277.field4510 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 111)
    public final void method147() {
        if (this.field4669 != null) {
            this.field4669.close();
            this.field4669 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 127)
    public final int method139() {
        return this.field4673 - (this.field4669.available() >> (class277.field4510 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V", line = 135)
    public final void method143() throws LineUnavailableException {
        this.field4669.flush();
        if (!this.field4670) {
            return;
        }
        this.field4669.close();
        this.field4669 = null;
        Info var1 = new Info(field4674 == null ? (field4674 = method2026("javax.sound.sampled.SourceDataLine")) : field4674, this.field4671, this.field4673 << (class277.field4510 ? 2 : 1));
        this.field4669 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4669.open();
        this.field4669.start();
    }
}
