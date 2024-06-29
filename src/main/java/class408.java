import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class408 extends class262 {

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "Z")
    private boolean field6169 = false;

    @OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
    private int field6168;

    @OriginalMember(owner = "client!dw", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field6172;

    @OriginalMember(owner = "client!dw", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6171;

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6170;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "[B")
    private byte[] field6167;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "()V")
    public final void method1791() {
        int var1 = 256;
        if (class309.field4835) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4224[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6167[var2 * 2] = (byte) (var3 >> 8);
            this.field6167[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6170.write(this.field6167, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1796(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6169 = true;
                    }
                }
            }
        }
        this.field6171 = new AudioFormat((float) class221.field3742, 16, class309.field4835 ? 2 : 1, true, false);
        this.field6167 = new byte[0x100 << (class309.field4835 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
    public final void method1790(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field6172 == null ? (field6172 = method2609("javax.sound.sampled.SourceDataLine")) : field6172, this.field6171, arg0 << (class309.field4835 ? 2 : 1));
            this.field6170 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6170.open();
            this.field6170.start();
            this.field6168 = arg0;
        } catch (LineUnavailableException var4) {
            if (class116.method748(arg0, -2024880312) == 1) {
                this.field6170 = null;
                throw var4;
            } else {
                this.method1790(class123.method774(84, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "()V")
    public final void method1785() throws LineUnavailableException {
        this.field6170.flush();
        if (!this.field6169) {
            return;
        }
        this.field6170.close();
        this.field6170 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field6172 == null ? (field6172 = method2609("javax.sound.sampled.SourceDataLine")) : field6172, this.field6171, this.field6168 << (class309.field4835 ? 2 : 1));
        this.field6170 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6170.open();
        this.field6170.start();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
    public final void method1783() {
        if (this.field6170 != null) {
            this.field6170.close();
            this.field6170 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "()I")
    public final int method1792() {
        return this.field6168 - (this.field6170.available() >> (class309.field4835 ? 2 : 1));
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2609(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
