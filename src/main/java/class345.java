import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class345 extends class223 {

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
    private boolean field5154 = false;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private int field5150;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field5155;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5151;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5152;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "[B")
    private byte[] field5153;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1488(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5154 = true;
                    }
                }
            }
        }
        this.field5151 = new AudioFormat((float) class200.field3254, 16, class315.field4754 ? 2 : 1, true, false);
        this.field5153 = new byte[0x100 << (class315.field4754 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V")
    public final void method1495() {
        int var1 = 256;
        if (class315.field4754) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3481[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5153[var2 * 2] = (byte) (var3 >> 8);
            this.field5153[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5152.write(this.field5153, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public final void method1487() {
        if (this.field5152 != null) {
            this.field5152.close();
            this.field5152 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method1497(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5155 == null ? (field5155 = method2164("javax.sound.sampled.SourceDataLine")) : field5155, this.field5151, arg0 << (class315.field4754 ? 2 : 1));
            this.field5152 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5152.open();
            this.field5152.start();
            this.field5150 = arg0;
        } catch (LineUnavailableException var4) {
            if (class504.method3029(arg0, -81) == 1) {
                this.field5152 = null;
                throw var4;
            } else {
                this.method1497(class184.method1256(arg0, (byte) 81));
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()V")
    public final void method1489() throws LineUnavailableException {
        this.field5152.flush();
        if (!this.field5154) {
            return;
        }
        this.field5152.close();
        this.field5152 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5155 == null ? (field5155 = method2164("javax.sound.sampled.SourceDataLine")) : field5155, this.field5151, this.field5150 << (class315.field4754 ? 2 : 1));
        this.field5152 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5152.open();
        this.field5152.start();
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
    public final int method1490() {
        return this.field5150 - (this.field5152.available() >> (class315.field4754 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2164(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
