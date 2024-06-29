import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class265 extends class195 {

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Z")
    private boolean field4545 = false;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4547;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4544;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4543;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "[B")
    private byte[] field4546;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method226(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4545 = true;
                    }
                }
            }
        }
        this.field4544 = new AudioFormat((float) class175.field3109, 16, class305.field5277 ? 2 : 1, true, false);
        this.field4546 = new byte[0x100 << (class305.field5277 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I", line = 47)
    public final int method229() {
        return this.field4542 - (this.field4543.available() >> (class305.field5277 ? 2 : 1));
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()V", line = 56)
    public final void method230() {
        int var1 = 256;
        if (class305.field5277) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3570[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4546[var2 * 2] = (byte) (var3 >> 8);
            this.field4546[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4543.write(this.field4546, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 92)
    public final void method232(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4547 == null ? (field4547 = method1849("javax.sound.sampled.SourceDataLine")) : field4547, this.field4544, arg0 << (class305.field5277 ? 2 : 1));
            this.field4543 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4543.open();
            this.field4543.start();
            this.field4542 = arg0;
        } catch (LineUnavailableException var4) {
            if (class254.method1754(arg0, -16635) == 1) {
                this.field4543 = null;
                throw var4;
            } else {
                this.method232(class124.method859((byte) -95, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 92)
    public static Class method1849(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V", line = 117)
    public final void method231() {
        if (this.field4543 != null) {
            this.field4543.close();
            this.field4543 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 130)
    public final void method227() throws LineUnavailableException {
        this.field4543.flush();
        if (!this.field4545) {
            return;
        }
        this.field4543.close();
        this.field4543 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4547 == null ? (field4547 = method1849("javax.sound.sampled.SourceDataLine")) : field4547, this.field4544, this.field4542 << (class305.field5277 ? 2 : 1));
        this.field4543 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4543.open();
        this.field4543.start();
    }
}
