import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class233 extends class45 {

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Z")
    private boolean field4042 = false;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field4045;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4044;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4043;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "[B")
    private byte[] field4041;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 10)
    public final void method80() throws LineUnavailableException {
        this.field4043.flush();
        if (!this.field4042) {
            return;
        }
        this.field4043.close();
        this.field4043 = null;
        Info var1 = new Info(field4045 == null ? (field4045 = method1671("javax.sound.sampled.SourceDataLine")) : field4045, this.field4044, this.field4040 << (class128.field2292 ? 2 : 1));
        this.field4043 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4043.open();
        this.field4043.start();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 16)
    public static Class method1671(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method79(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4042 = true;
                    }
                }
            }
        }
        this.field4044 = new AudioFormat((float) class22.field363, 16, class128.field2292 ? 2 : 1, true, false);
        this.field4041 = new byte[0x100 << (class128.field2292 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V", line = 67)
    public final void method78() {
        if (this.field4043 != null) {
            this.field4043.close();
            this.field4043 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 82)
    public final void method81() {
        int var1 = 256;
        if (class128.field2292) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field836[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4041[var2 * 2] = (byte) (var3 >> 8);
            this.field4041[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4043.write(this.field4041, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()I", line = 115)
    public final int method83() {
        return this.field4040 - (this.field4043.available() >> (class128.field2292 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 124)
    public final void method82(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4045 == null ? (field4045 = method1671("javax.sound.sampled.SourceDataLine")) : field4045, this.field4044, arg0 << (class128.field2292 ? 2 : 1));
            this.field4043 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4043.open();
            this.field4043.start();
            this.field4040 = arg0;
        } catch (LineUnavailableException var4) {
            if (class45.method399(arg0, -715827883) == 1) {
                this.field4043 = null;
                throw var4;
            } else {
                this.method82(class5.method28(-124, arg0));
            }
        }
    }
}
