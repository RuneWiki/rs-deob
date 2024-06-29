import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 extends class169 {

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Z")
    private boolean field30 = false;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field35;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field31;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field33;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "[B")
    private byte[] field34;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method20(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var4.length > var3) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field30 = true;
                    }
                }
                var3++;
            }
        }
        this.field31 = new AudioFormat((float) class138.field2049, 16, class37.field591 ? 2 : 1, true, false);
        this.field34 = new byte[0x100 << (class37.field591 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V", line = 51)
    public final void method21() {
        if (this.field33 != null) {
            this.field33.close();
            this.field33 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I", line = 64)
    public final int method22() {
        return this.field32 - (this.field33.available() >> (class37.field591 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V", line = 74)
    public final void method23() {
        int var1 = 256;
        if (class37.field591) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2594[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field34[var2 * 2] = (byte) (var3 >> 8);
            this.field34[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field33.write(this.field34, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V", line = 109)
    public final void method24(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field35 == null ? (field35 = method26("javax.sound.sampled.SourceDataLine")) : field35, this.field31, arg0 << (class37.field591 ? 2 : 1));
            this.field33 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field33.open();
            this.field33.start();
            this.field32 = arg0;
        } catch (LineUnavailableException var4) {
            if (class301.method2043(arg0, -13028) == 1) {
                this.field33 = null;
                throw var4;
            } else {
                this.method24(class275.method1871(arg0, 1110164296));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 109)
    public static Class method26(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 133)
    public final void method25() throws LineUnavailableException {
        this.field33.flush();
        if (!this.field30) {
            return;
        }
        this.field33.close();
        this.field33 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field35 == null ? (field35 = method26("javax.sound.sampled.SourceDataLine")) : field35, this.field31, this.field32 << (class37.field591 ? 2 : 1));
        this.field33 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field33.open();
        this.field33.start();
    }
}
