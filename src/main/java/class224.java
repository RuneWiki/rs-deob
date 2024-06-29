import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class224 extends class39 {

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Z")
    private boolean field3918 = false;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3919;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3917;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3916;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "[B")
    private byte[] field3915;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method259(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3919 == null ? (field3919 = method1517("javax.sound.sampled.SourceDataLine")) : field3919, this.field3917, arg0 << (class256.field4568 ? 2 : 1));
            this.field3916 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3916.open();
            this.field3916.start();
            this.field3914 = arg0;
        } catch (LineUnavailableException var4) {
            if (class232.method1560(arg0, false) == 1) {
                this.field3916 = null;
                throw var4;
            } else {
                this.method259(class113.method804(arg0, -100));
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()I")
    public final int method266() {
        return this.field3914 - (this.field3916.available() >> (class256.field4568 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "()V")
    public final void method267() {
        int var1 = 256;
        if (class256.field4568) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field611[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3915[var2 * 2] = (byte) (var3 >> 8);
            this.field3915[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3916.write(this.field3915, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V")
    public final void method256() {
        if (this.field3916 != null) {
            this.field3916.close();
            this.field3916 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method258(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3918 = true;
                    }
                }
                var3++;
            }
        }
        this.field3917 = new AudioFormat((float) class159.field2706, 16, class256.field4568 ? 2 : 1, true, false);
        this.field3915 = new byte[0x100 << (class256.field4568 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V")
    public final void method261() throws LineUnavailableException {
        this.field3916.flush();
        if (!this.field3918) {
            return;
        }
        this.field3916.close();
        this.field3916 = null;
        Info var1 = new Info(field3919 == null ? (field3919 = method1517("javax.sound.sampled.SourceDataLine")) : field3919, this.field3917, this.field3914 << (class256.field4568 ? 2 : 1));
        this.field3916 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3916.open();
        this.field3916.start();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1517(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
