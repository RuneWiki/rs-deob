import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class512 extends class398 {

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "Z")
    private boolean field7316 = false;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    private int field7317;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field7319;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7318;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7314;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "[B")
    private byte[] field7315;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "()V")
    public final void method2019() {
        if (this.field7314 != null) {
            this.field7314.close();
            this.field7314 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "()I")
    public final int method2017() {
        return this.field7317 - (this.field7314.available() >> (class673.field9127 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2021(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7316 = true;
                    }
                }
            }
        }
        this.field7318 = new AudioFormat((float) class68.field831, 16, class673.field9127 ? 2 : 1, true, false);
        this.field7315 = new byte[0x100 << (class673.field9127 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
    public final void method2020(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field7319 == null ? (field7319 = method3021("javax.sound.sampled.SourceDataLine")) : field7319, this.field7318, arg0 << (class673.field9127 ? 2 : 1));
            this.field7314 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7314.open();
            this.field7314.start();
            this.field7317 = arg0;
        } catch (LineUnavailableException var4) {
            if (class6.method43(arg0, (byte) 116) == 1) {
                this.field7314 = null;
                throw var4;
            } else {
                this.method2020(class123.method837(125, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "()V")
    public final void method2022() throws LineUnavailableException {
        this.field7314.flush();
        if (!this.field7316) {
            return;
        }
        this.field7314.close();
        this.field7314 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field7319 == null ? (field7319 = method3021("javax.sound.sampled.SourceDataLine")) : field7319, this.field7318, this.field7317 << (class673.field9127 ? 2 : 1));
        this.field7314 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7314.open();
        this.field7314.start();
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "()V")
    public final void method2023() {
        int var1 = 256;
        if (class673.field9127) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5603[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7315[var2 * 2] = (byte) (var3 >> 8);
            this.field7315[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7314.write(this.field7315, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3021(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
