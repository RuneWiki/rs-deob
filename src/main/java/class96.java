import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class96 extends class13 {

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Z")
    private boolean field1518 = false;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1520;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1516;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1519;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "[B")
    private byte[] field1517;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
    public final int method123() {
        return this.field1515 - (this.field1519.available() >> (class253.field4144 ? 2 : 1));
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
    public final void method107() {
        if (this.field1519 != null) {
            this.field1519.close();
            this.field1519 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public final void method119(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1520 == null ? (field1520 = method690("javax.sound.sampled.SourceDataLine")) : field1520, this.field1516, arg0 << (class253.field4144 ? 2 : 1));
            this.field1519 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1519.open();
            this.field1519.start();
            this.field1515 = arg0;
        } catch (LineUnavailableException var4) {
            if (class231.method1600(arg0, (byte) -120) == 1) {
                this.field1519 = null;
                throw var4;
            } else {
                this.method119(class128.method873(-17034, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public final void method106() throws LineUnavailableException {
        this.field1519.flush();
        if (!this.field1518) {
            return;
        }
        this.field1519.close();
        this.field1519 = null;
        Info var1 = new Info(field1520 == null ? (field1520 = method690("javax.sound.sampled.SourceDataLine")) : field1520, this.field1516, this.field1515 << (class253.field4144 ? 2 : 1));
        this.field1519 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1519.open();
        this.field1519.start();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method110(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1518 = true;
                    }
                }
            }
        }
        this.field1516 = new AudioFormat((float) class296.field4841, 16, class253.field4144 ? 2 : 1, true, false);
        this.field1517 = new byte[0x100 << (class253.field4144 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
    public final void method116() {
        int var1 = 256;
        if (class253.field4144) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field257[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1517[var2 * 2] = (byte) (var3 >> 8);
            this.field1517[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1519.write(this.field1517, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method690(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
