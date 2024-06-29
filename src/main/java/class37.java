import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class37 extends class134 {

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Z")
    private boolean field510 = false;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field515;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field511;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field514;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[B")
    private byte[] field513;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method200(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field515 == null ? (field515 = method206("javax.sound.sampled.SourceDataLine")) : field515, this.field511, arg0 << (class256.field4597 ? 2 : 1));
            this.field514 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field514.open();
            this.field514.start();
            this.field512 = arg0;
        } catch (LineUnavailableException var4) {
            if (class237.method1675(14623, arg0) == 1) {
                this.field514 = null;
                throw var4;
            } else {
                this.method200(class127.method903(98, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
    public final void method201() throws LineUnavailableException {
        this.field514.flush();
        if (!this.field510) {
            return;
        }
        this.field514.close();
        this.field514 = null;
        Info var1 = new Info(field515 == null ? (field515 = method206("javax.sound.sampled.SourceDataLine")) : field515, this.field511, this.field512 << (class256.field4597 ? 2 : 1));
        this.field514 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field514.open();
        this.field514.start();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method202(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field510 = true;
                    }
                }
            }
        }
        this.field511 = new AudioFormat((float) class133.field2473, 16, class256.field4597 ? 2 : 1, true, false);
        this.field513 = new byte[0x100 << (class256.field4597 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public final int method203() {
        return this.field512 - (this.field514.available() >> (class256.field4597 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public final void method204() {
        int var1 = 256;
        if (class256.field4597) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2505[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field513[var2 * 2] = (byte) (var3 >> 8);
            this.field513[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field514.write(this.field513, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public final void method205() {
        if (this.field514 != null) {
            this.field514.close();
            this.field514 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method206(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
