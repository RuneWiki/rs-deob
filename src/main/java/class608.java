import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class608 extends class632 {

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "Z")
    private boolean field8511 = false;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    private int field8510;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field8515;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field8512;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field8514;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "[B")
    private byte[] field8513;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method211(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field8511 = true;
                    }
                }
            }
        }
        this.field8512 = new AudioFormat((float) class224.field2776, 16, class60.field614 ? 2 : 1, true, false);
        this.field8513 = new byte[0x100 << (class60.field614 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "()I", line = 49)
    public final int method208() {
        return this.field8510 - (this.field8514.available() >> (class60.field614 ? 2 : 1));
    }

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "()V", line = 60)
    public final void method207() {
        int var1 = 256;
        if (class60.field614) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field8895[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field8513[var2 * 2] = (byte) (var3 >> 8);
            this.field8513[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field8514.write(this.field8513, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "()V", line = 93)
    public final void method209() {
        if (this.field8514 != null) {
            this.field8514.close();
            this.field8514 = null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 110)
    public final void method212(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field8515 == null ? (field8515 = method3388("javax.sound.sampled.SourceDataLine")) : field8515, this.field8512, arg0 << (class60.field614 ? 2 : 1));
            this.field8514 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field8514.open();
            this.field8514.start();
            this.field8510 = arg0;
        } catch (LineUnavailableException var4) {
            if (class333.method1921(-689981592, arg0) == 1) {
                this.field8514 = null;
                throw var4;
            } else {
                this.method212(class553.method3138(1781323777, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 110)
    public static Class method3388(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "()V", line = 131)
    public final void method210() throws LineUnavailableException {
        this.field8514.flush();
        if (!this.field8511) {
            return;
        }
        this.field8514.close();
        this.field8514 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field8515 == null ? (field8515 = method3388("javax.sound.sampled.SourceDataLine")) : field8515, this.field8512, this.field8510 << (class60.field614 ? 2 : 1));
        this.field8514 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field8514.open();
        this.field8514.start();
    }
}
