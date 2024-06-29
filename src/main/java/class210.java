import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class210 extends class257 {

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "Z")
    private boolean field3043 = false;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field3048;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3045;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3044;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "[B")
    private byte[] field3046;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public final void method1451(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3048 == null ? (field3048 = method1457("javax.sound.sampled.SourceDataLine")) : field3048, this.field3045, arg0 << (class241.field3572 ? 2 : 1));
            this.field3044 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3044.open();
            this.field3044.start();
            this.field3047 = arg0;
        } catch (LineUnavailableException var4) {
            if (class6.method44(arg0, 115) == 1) {
                this.field3044 = null;
                throw var4;
            } else {
                this.method1451(class118.method934(arg0, 269173057));
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
    public final void method1452() {
        int var1 = 256;
        if (class241.field3572) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3777[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3046[var2 * 2] = (byte) (var3 >> 8);
            this.field3046[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3044.write(this.field3046, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()I")
    public final int method1453() {
        return this.field3047 - (this.field3044.available() >> (class241.field3572 ? 2 : 1));
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1454(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3043 = true;
                    }
                }
            }
        }
        this.field3045 = new AudioFormat((float) class405.field6017, 16, class241.field3572 ? 2 : 1, true, false);
        this.field3046 = new byte[0x100 << (class241.field3572 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()V")
    public final void method1455() throws LineUnavailableException {
        this.field3044.flush();
        if (!this.field3043) {
            return;
        }
        this.field3044.close();
        this.field3044 = null;
        Info var1 = new Info(field3048 == null ? (field3048 = method1457("javax.sound.sampled.SourceDataLine")) : field3048, this.field3045, this.field3047 << (class241.field3572 ? 2 : 1));
        this.field3044 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3044.open();
        this.field3044.start();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
    public final void method1456() {
        if (this.field3044 != null) {
            this.field3044.close();
            this.field3044 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1457(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
