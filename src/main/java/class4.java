import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class351 {

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "Z")
    private boolean field29 = false;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field30;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field27;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field26;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "[B")
    private byte[] field25;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
    public final void method16() {
        if (this.field26 != null) {
            this.field26.close();
            this.field26 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()I")
    public final int method17() {
        return this.field28 - (this.field26.available() >> (class122.field1929 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field30 == null ? (field30 = method22("javax.sound.sampled.SourceDataLine")) : field30, this.field27, arg0 << (class122.field1929 ? 2 : 1));
            this.field26 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field26.open();
            this.field26.start();
            this.field28 = arg0;
        } catch (LineUnavailableException var4) {
            if (class317.method2132(arg0, 255) == 1) {
                this.field26 = null;
                throw var4;
            } else {
                this.method18(class202.method1526(arg0, -2092404400));
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
    public final void method19() throws LineUnavailableException {
        this.field26.flush();
        if (!this.field29) {
            return;
        }
        this.field26.close();
        this.field26 = null;
        Info var1 = new Info(field30 == null ? (field30 = method22("javax.sound.sampled.SourceDataLine")) : field30, this.field27, this.field28 << (class122.field1929 ? 2 : 1));
        this.field26 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field26.open();
        this.field26.start();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method20(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field29 = true;
                    }
                }
            }
        }
        this.field27 = new AudioFormat((float) class326.field4692, 16, class122.field1929 ? 2 : 1, true, false);
        this.field25 = new byte[0x100 << (class122.field1929 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
    public final void method21() {
        int var1 = 256;
        if (class122.field1929) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4997[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field25[var2 * 2] = (byte) (var3 >> 8);
            this.field25[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field26.write(this.field25, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method22(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
