import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class119 extends class239 {

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "Z")
    private boolean field1676 = false;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1677;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1674;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1675;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "[B")
    private byte[] field1672;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "()I", line = 10)
    public final int method804() {
        return this.field1673 - (this.field1675.available() >> (class177.field2566 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V", line = 21)
    public final void method805() {
        int var1 = 256;
        if (class177.field2566) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3594[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1672[var2 * 2] = (byte) (var3 >> 8);
            this.field1672[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1675.write(this.field1672, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 56)
    public final void method806(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1677 == null ? (field1677 = method810("javax.sound.sampled.SourceDataLine")) : field1677, this.field1674, arg0 << (class177.field2566 ? 2 : 1));
            this.field1675 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1675.open();
            this.field1675.start();
            this.field1673 = arg0;
        } catch (LineUnavailableException var4) {
            if (class16.method110(arg0, -56) == 1) {
                this.field1675 = null;
                throw var4;
            } else {
                this.method806(class258.method1873(arg0, 832520144));
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 56)
    public static Class method810(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "()V", line = 79)
    public final void method807() {
        if (this.field1675 != null) {
            this.field1675.close();
            this.field1675 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 100)
    public final void method808(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1676 = true;
                    }
                }
            }
        }
        this.field1674 = new AudioFormat((float) class276.field4312, 16, class177.field2566 ? 2 : 1, true, false);
        this.field1672 = new byte[0x100 << (class177.field2566 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "()V", line = 136)
    public final void method809() throws LineUnavailableException {
        this.field1675.flush();
        if (!this.field1676) {
            return;
        }
        this.field1675.close();
        this.field1675 = null;
        Info var1 = new Info(field1677 == null ? (field1677 = method810("javax.sound.sampled.SourceDataLine")) : field1677, this.field1674, this.field1673 << (class177.field2566 ? 2 : 1));
        this.field1675 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1675.open();
        this.field1675.start();
    }
}
