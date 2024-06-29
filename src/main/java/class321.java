import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class321 extends class280 {

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Z")
    private boolean field4704 = false;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4705;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4703;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4701;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[B")
    private byte[] field4702;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V", line = 13)
    public final void method1143() {
        if (this.field4701 != null) {
            this.field4701.close();
            this.field4701 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method1147(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4704 = true;
                    }
                }
            }
        }
        this.field4703 = new AudioFormat((float) class266.field3763, 16, class281.field4017 ? 2 : 1, true, false);
        this.field4702 = new byte[0x100 << (class281.field4017 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 65)
    public final void method1145(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4705 == null ? (field4705 = method1926("javax.sound.sampled.SourceDataLine")) : field4705, this.field4703, arg0 << (class281.field4017 ? 2 : 1));
            this.field4701 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4701.open();
            this.field4701.start();
            this.field4700 = arg0;
        } catch (LineUnavailableException var4) {
            if (class4.method30(arg0, false) == 1) {
                this.field4701 = null;
                throw var4;
            } else {
                this.method1145(class340.method2064(-112, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 65)
    public static Class method1926(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 88)
    public final void method1144() {
        int var1 = 256;
        if (class281.field4017) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3981[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4702[var2 * 2] = (byte) (var3 >> 8);
            this.field4702[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4701.write(this.field4702, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I", line = 122)
    public final int method1146() {
        return this.field4700 - (this.field4701.available() >> (class281.field4017 ? 2 : 1));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 129)
    public final void method1141() throws LineUnavailableException {
        this.field4701.flush();
        if (!this.field4704) {
            return;
        }
        this.field4701.close();
        this.field4701 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4705 == null ? (field4705 = method1926("javax.sound.sampled.SourceDataLine")) : field4705, this.field4703, this.field4700 << (class281.field4017 ? 2 : 1));
        this.field4701 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4701.open();
        this.field4701.start();
    }
}
