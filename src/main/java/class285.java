import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class285 extends class244 {

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "Z")
    private boolean field4837 = false;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field4841;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4839;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4838;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "[B")
    private byte[] field4840;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()I", line = 10)
    public final int method1672() {
        return this.field4836 - (this.field4838.available() >> (class314.field5440 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 17)
    public final void method1670() {
        if (this.field4838 != null) {
            this.field4838.close();
            this.field4838 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 31)
    public final void method1675(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4841 == null ? (field4841 = method1926("javax.sound.sampled.SourceDataLine")) : field4841, this.field4839, arg0 << (class314.field5440 ? 2 : 1));
            this.field4838 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4838.open();
            this.field4838.start();
            this.field4836 = arg0;
        } catch (LineUnavailableException var4) {
            if (class254.method1771(arg0, (byte) -49) == 1) {
                this.field4838 = null;
                throw var4;
            } else {
                this.method1675(class270.method1847(arg0, 96));
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 31)
    public static Class method1926(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V", line = 64)
    public final void method1685() {
        int var1 = 256;
        if (class314.field5440) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4053[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4840[var2 * 2] = (byte) (var3 >> 8);
            this.field4840[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4838.write(this.field4840, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 99)
    public final void method1679(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4837 = true;
                    }
                }
            }
        }
        this.field4839 = new AudioFormat((float) class252.field4337, 16, class314.field5440 ? 2 : 1, true, false);
        this.field4840 = new byte[0x100 << (class314.field5440 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 135)
    public final void method1678() throws LineUnavailableException {
        this.field4838.flush();
        if (!this.field4837) {
            return;
        }
        this.field4838.close();
        this.field4838 = null;
        Info var1 = new Info(field4841 == null ? (field4841 = method1926("javax.sound.sampled.SourceDataLine")) : field4841, this.field4839, this.field4836 << (class314.field5440 ? 2 : 1));
        this.field4838 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4838.open();
        this.field4838.start();
    }
}
