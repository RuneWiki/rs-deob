import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class289 extends class330 {

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "Z")
    private boolean field4462 = false;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4463;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4459;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4458;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "[B")
    private byte[] field4461;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V", line = 11)
    public final void method1996() {
        if (this.field4458 != null) {
            this.field4458.close();
            this.field4458 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "()I", line = 24)
    public final int method1997() {
        return this.field4460 - (this.field4458.available() >> (class325.field5020 ? 2 : 1));
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "()V", line = 31)
    public final void method1998() throws LineUnavailableException {
        this.field4458.flush();
        if (!this.field4462) {
            return;
        }
        this.field4458.close();
        this.field4458 = null;
        Info var1 = new Info(field4463 == null ? (field4463 = method2002("javax.sound.sampled.SourceDataLine")) : field4463, this.field4459, this.field4460 << (class325.field5020 ? 2 : 1));
        this.field4458 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4458.open();
        this.field4458.start();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 38)
    public static Class method2002(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 52)
    public final void method1999(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4462 = true;
                    }
                }
            }
        }
        this.field4459 = new AudioFormat((float) class260.field4009, 16, class325.field5020 ? 2 : 1, true, false);
        this.field4461 = new byte[0x100 << (class325.field5020 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()V", line = 93)
    public final void method2000() {
        int var1 = 256;
        if (class325.field5020) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5077[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4461[var2 * 2] = (byte) (var3 >> 8);
            this.field4461[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4458.write(this.field4461, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 128)
    public final void method2001(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4463 == null ? (field4463 = method2002("javax.sound.sampled.SourceDataLine")) : field4463, this.field4459, arg0 << (class325.field5020 ? 2 : 1));
            this.field4458 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4458.open();
            this.field4458.start();
            this.field4460 = arg0;
        } catch (LineUnavailableException var4) {
            if (class220.method1567(-1260216222, arg0) == 1) {
                this.field4458 = null;
                throw var4;
            } else {
                this.method2001(class312.method2135(984942384, arg0));
            }
        }
    }
}
