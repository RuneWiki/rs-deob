import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class169 extends class19 {

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "Z")
    private boolean field2318 = false;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2321;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2320;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2319;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "[B")
    private byte[] field2317;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V", line = 11)
    public final void method256() throws LineUnavailableException {
        this.field2319.flush();
        if (!this.field2318) {
            return;
        }
        this.field2319.close();
        this.field2319 = null;
        Info var1 = new Info(field2321 == null ? (field2321 = method1118("javax.sound.sampled.SourceDataLine")) : field2321, this.field2320, this.field2316 << (class247.field3492 ? 2 : 1));
        this.field2319 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2319.open();
        this.field2319.start();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 18)
    public static Class method1118(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()I", line = 31)
    public final int method265() {
        return this.field2316 - (this.field2319.available() >> (class247.field3492 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()V", line = 41)
    public final void method257() {
        int var1 = 256;
        if (class247.field3492) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field336[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2317[var2 * 2] = (byte) (var3 >> 8);
            this.field2317[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2319.write(this.field2317, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()V", line = 75)
    public final void method268() {
        if (this.field2319 != null) {
            this.field2319.close();
            this.field2319 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 96)
    public final void method270(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2321 == null ? (field2321 = method1118("javax.sound.sampled.SourceDataLine")) : field2321, this.field2320, arg0 << (class247.field3492 ? 2 : 1));
            this.field2319 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2319.open();
            this.field2319.start();
            this.field2316 = arg0;
        } catch (LineUnavailableException var4) {
            if (class245.method1658(arg0, -94) == 1) {
                this.field2319 = null;
                throw var4;
            } else {
                this.method270(class438.method2748((byte) 121, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 119)
    public final void method261(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2318 = true;
                    }
                }
            }
        }
        this.field2320 = new AudioFormat((float) class76.field1094, 16, class247.field3492 ? 2 : 1, true, false);
        this.field2317 = new byte[0x100 << (class247.field3492 ? 2 : 1)];
    }
}
