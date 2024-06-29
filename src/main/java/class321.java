import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class321 extends class470 {

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "Z")
    private boolean field4379 = false;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field4380;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4375;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4376;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "[B")
    private byte[] field4377;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 13)
    public final void method2036(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4380 == null ? (field4380 = method2042("javax.sound.sampled.SourceDataLine")) : field4380, this.field4375, arg0 << (class137.field2352 ? 2 : 1));
            this.field4376 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4376.open();
            this.field4376.start();
            this.field4378 = arg0;
        } catch (LineUnavailableException var4) {
            if (class316.method1995(arg0, 58) == 1) {
                this.field4376 = null;
                throw var4;
            } else {
                this.method2036(class241.method1609((byte) -94, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method2042(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "()V", line = 34)
    public final void method2037() throws LineUnavailableException {
        this.field4376.flush();
        if (!this.field4379) {
            return;
        }
        this.field4376.close();
        this.field4376 = null;
        Info var1 = new Info(field4380 == null ? (field4380 = method2042("javax.sound.sampled.SourceDataLine")) : field4380, this.field4375, this.field4378 << (class137.field2352 ? 2 : 1));
        this.field4376 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4376.open();
        this.field4376.start();
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "()I", line = 53)
    public final int method2038() {
        return this.field4378 - (this.field4376.available() >> (class137.field2352 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "()V", line = 63)
    public final void method2039() {
        int var1 = 256;
        if (class137.field2352) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field6358[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4377[var2 * 2] = (byte) (var3 >> 8);
            this.field4377[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4376.write(this.field4377, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 98)
    public final void method2040(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4379 = true;
                    }
                }
            }
        }
        this.field4375 = new AudioFormat((float) class55.field782, 16, class137.field2352 ? 2 : 1, true, false);
        this.field4377 = new byte[0x100 << (class137.field2352 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "()V", line = 142)
    public final void method2041() {
        if (this.field4376 != null) {
            this.field4376.close();
            this.field4376 = null;
        }
    }
}
