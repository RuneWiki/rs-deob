import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class166 extends class160 {

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Z")
    private boolean field2499 = false;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2502;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2497;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2498;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "[B")
    private byte[] field2501;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V", line = 11)
    public final void method1158() throws LineUnavailableException {
        this.field2498.flush();
        if (!this.field2499) {
            return;
        }
        this.field2498.close();
        this.field2498 = null;
        Info var1 = new Info(field2502 == null ? (field2502 = method1188("javax.sound.sampled.SourceDataLine")) : field2502, this.field2497, this.field2500 << (class275.field3991 ? 2 : 1));
        this.field2498 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2498.open();
        this.field2498.start();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 17)
    public static Class method1188(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V", line = 31)
    public final void method1161(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2502 == null ? (field2502 = method1188("javax.sound.sampled.SourceDataLine")) : field2502, this.field2497, arg0 << (class275.field3991 ? 2 : 1));
            this.field2498 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2498.open();
            this.field2498.start();
            this.field2500 = arg0;
        } catch (LineUnavailableException var4) {
            if (class111.method817(arg0, 12562) == 1) {
                this.field2498 = null;
                throw var4;
            } else {
                this.method1161(class159.method1146(false, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()I", line = 54)
    public final int method1152() {
        return this.field2500 - (this.field2498.available() >> (class275.field3991 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 63)
    public final void method1163(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2499 = true;
                    }
                }
            }
        }
        this.field2497 = new AudioFormat((float) class471.field6941, 16, class275.field3991 ? 2 : 1, true, false);
        this.field2501 = new byte[0x100 << (class275.field3991 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 104)
    public final void method1151() {
        int var1 = 256;
        if (class275.field3991) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2416[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2501[var2 * 2] = (byte) (var3 >> 8);
            this.field2501[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2498.write(this.field2501, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 140)
    public final void method1148() {
        if (this.field2498 != null) {
            this.field2498.close();
            this.field2498 = null;
        }
    }
}
