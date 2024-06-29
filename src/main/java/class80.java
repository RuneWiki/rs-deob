import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class80 extends class208 {

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "Z")
    private boolean field1048 = false;

    @OriginalMember(owner = "client!gw", name = "K", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!gw", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1051;

    @OriginalMember(owner = "client!gw", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1049;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1046;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "[B")
    private byte[] field1047;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method570(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1048 = true;
                    }
                }
            }
        }
        this.field1049 = new AudioFormat((float) class554.field7780, 16, class48.field709 ? 2 : 1, true, false);
        this.field1047 = new byte[0x100 << (class48.field709 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method571(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1051 == null ? (field1051 = method576("javax.sound.sampled.SourceDataLine")) : field1051, this.field1049, arg0 << (class48.field709 ? 2 : 1));
            this.field1046 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1046.open();
            this.field1046.start();
            this.field1050 = arg0;
        } catch (LineUnavailableException var4) {
            if (class551.method3139(arg0, -86) == 1) {
                this.field1046 = null;
                throw var4;
            } else {
                this.method571(class353.method2103(79, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "()I")
    public final int method572() {
        return this.field1050 - (this.field1046.available() >> (class48.field709 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "()V")
    public final void method573() throws LineUnavailableException {
        this.field1046.flush();
        if (!this.field1048) {
            return;
        }
        this.field1046.close();
        this.field1046 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1051 == null ? (field1051 = method576("javax.sound.sampled.SourceDataLine")) : field1051, this.field1049, this.field1050 << (class48.field709 ? 2 : 1));
        this.field1046 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1046.open();
        this.field1046.start();
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "()V")
    public final void method574() {
        int var1 = 256;
        if (class48.field709) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2657[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1047[var2 * 2] = (byte) (var3 >> 8);
            this.field1047[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1046.write(this.field1047, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "()V")
    public final void method575() {
        if (this.field1046 != null) {
            this.field1046.close();
            this.field1046 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method576(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
