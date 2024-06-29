import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class174 extends class149 {

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Z")
    private boolean field2995 = false;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2998;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2993;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2997;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "[B")
    private byte[] field2996;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 13)
    public final void method1052(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2998 == null ? (field2998 = method1222("javax.sound.sampled.SourceDataLine")) : field2998, this.field2993, arg0 << (class188.field3233 ? 2 : 1));
            this.field2997 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2997.open();
            this.field2997.start();
            this.field2994 = arg0;
        } catch (LineUnavailableException var4) {
            if (class165.method1180((byte) 118, arg0) == 1) {
                this.field2997 = null;
                throw var4;
            } else {
                this.method1052(class143.method1013((byte) 45, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method1222(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 35)
    public final void method1054(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2995 = true;
                    }
                }
                var3++;
            }
        }
        this.field2993 = new AudioFormat((float) class63.field1213, 16, class188.field3233 ? 2 : 1, true, false);
        this.field2996 = new byte[0x100 << (class188.field3233 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()V", line = 72)
    public final void method1057() {
        int var1 = 256;
        if (class188.field3233) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2619[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2996[var2 * 2] = (byte) (var3 >> 8);
            this.field2996[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2997.write(this.field2996, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()I", line = 105)
    public final int method1053() {
        return this.field2994 - (this.field2997.available() >> (class188.field3233 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 115)
    public final void method1047() throws LineUnavailableException {
        this.field2997.flush();
        if (!this.field2995) {
            return;
        }
        this.field2997.close();
        this.field2997 = null;
        Info var1 = new Info(field2998 == null ? (field2998 = method1222("javax.sound.sampled.SourceDataLine")) : field2998, this.field2993, this.field2994 << (class188.field3233 ? 2 : 1));
        this.field2997 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2997.open();
        this.field2997.start();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 133)
    public final void method1048() {
        if (this.field2997 != null) {
            this.field2997.close();
            this.field2997 = null;
        }
    }
}
