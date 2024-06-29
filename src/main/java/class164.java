import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class164 extends class208 {

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "Z")
    private boolean field2759 = false;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2762;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2760;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2758;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "[B")
    private byte[] field2761;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public final void method182() {
        int var1 = 256;
        if (class216.field3641) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3539[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2761[var2 * 2] = (byte) (var3 >> 8);
            this.field2761[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2758.write(this.field2761, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()I")
    public final int method186() {
        return this.field2757 - (this.field2758.available() >> (class216.field3641 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method185(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var3 < var4.length) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2759 = true;
                    }
                }
                var3++;
            }
        }
        this.field2760 = new AudioFormat((float) class195.field3316, 16, class216.field3641 ? 2 : 1, true, false);
        this.field2761 = new byte[0x100 << (class216.field3641 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
    public final void method184() {
        if (this.field2758 != null) {
            this.field2758.close();
            this.field2758 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method183(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2762 == null ? (field2762 = method1017("javax.sound.sampled.SourceDataLine")) : field2762, this.field2760, arg0 << (class216.field3641 ? 2 : 1));
            this.field2758 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2758.open();
            this.field2758.start();
            this.field2757 = arg0;
        } catch (LineUnavailableException var4) {
            if (class232.method1561(255, arg0) == 1) {
                this.field2758 = null;
                throw var4;
            } else {
                this.method183(class45.method239(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V")
    public final void method187() throws LineUnavailableException {
        this.field2758.flush();
        if (!this.field2759) {
            return;
        }
        this.field2758.close();
        this.field2758 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2762 == null ? (field2762 = method1017("javax.sound.sampled.SourceDataLine")) : field2762, this.field2760, this.field2757 << (class216.field3641 ? 2 : 1));
        this.field2758 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2758.open();
        this.field2758.start();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1017(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
