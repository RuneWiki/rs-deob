import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class141 {

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
    private boolean field38 = false;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field42;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field40;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field37;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[B")
    private byte[] field41;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
    public final void method12() throws LineUnavailableException {
        this.field37.flush();
        if (!this.field38) {
            return;
        }
        this.field37.close();
        this.field37 = null;
        Info var1 = new Info(field42 == null ? (field42 = method18("javax.sound.sampled.SourceDataLine")) : field42, this.field40, this.field39 << (client.field533 ? 2 : 1));
        this.field37 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field37.open();
        this.field37.start();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method13(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field42 == null ? (field42 = method18("javax.sound.sampled.SourceDataLine")) : field42, this.field40, arg0 << (client.field533 ? 2 : 1));
            this.field37 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field37.open();
            this.field37.start();
            this.field39 = arg0;
        } catch (LineUnavailableException var4) {
            if (class163.method1052(arg0, false) == 1) {
                this.field37 = null;
                throw var4;
            } else {
                this.method13(class145.method975(1185900324, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()I")
    public final int method14() {
        return this.field39 - (this.field37.available() >> (client.field533 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public final void method15() {
        if (this.field37 != null) {
            this.field37.close();
            this.field37 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method16(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field38 = true;
                    }
                }
            }
        }
        this.field40 = new AudioFormat((float) class96.field1728, 16, client.field533 ? 2 : 1, true, false);
        this.field41 = new byte[0x100 << (client.field533 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
    public final void method17() {
        int var1 = 256;
        if (client.field533) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2651[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field41[var2 * 2] = (byte) (var3 >> 8);
            this.field41[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field37.write(this.field41, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method18(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
