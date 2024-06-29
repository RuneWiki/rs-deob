import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class186 extends class233 {

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
    private boolean field2593 = false;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2598;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2596;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2594;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "[B")
    private byte[] field2595;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public final void method1215(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2593 = true;
                    }
                }
            }
        }
        this.field2596 = new AudioFormat((float) class327.field4473, 16, class31.field488 ? 2 : 1, true, false);
        this.field2595 = new byte[0x100 << (class31.field488 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V", line = 50)
    public final void method1216() throws LineUnavailableException {
        this.field2594.flush();
        if (!this.field2593) {
            return;
        }
        this.field2594.close();
        this.field2594 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2598 == null ? (field2598 = method1221("javax.sound.sampled.SourceDataLine")) : field2598, this.field2596, this.field2597 << (class31.field488 ? 2 : 1));
        this.field2594 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2594.open();
        this.field2594.start();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 56)
    public static Class method1221(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 71)
    public final void method1217(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2598 == null ? (field2598 = method1221("javax.sound.sampled.SourceDataLine")) : field2598, this.field2596, arg0 << (class31.field488 ? 2 : 1));
            this.field2594 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2594.open();
            this.field2594.start();
            this.field2597 = arg0;
        } catch (LineUnavailableException var4) {
            if (class445.method2778(false, arg0) == 1) {
                this.field2594 = null;
                throw var4;
            } else {
                this.method1217(class164.method1089(arg0, (byte) -103));
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 99)
    public final void method1218() {
        if (this.field2594 != null) {
            this.field2594.close();
            this.field2594 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()I", line = 113)
    public final int method1219() {
        return this.field2597 - (this.field2594.available() >> (class31.field488 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 125)
    public final void method1220() {
        int var1 = 256;
        if (class31.field488) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3165[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2595[var2 * 2] = (byte) (var3 >> 8);
            this.field2595[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2594.write(this.field2595, 0, var1 << 1);
    }
}
