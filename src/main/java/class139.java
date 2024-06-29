import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class139 extends class218 {

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Z")
    private boolean field1691 = false;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1695;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1692;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1693;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "[B")
    private byte[] field1694;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "()I", line = 10)
    public final int method772() {
        return this.field1690 - (this.field1693.available() >> (class197.field2383 ? 2 : 1));
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V", line = 19)
    public final void method773(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1695 == null ? (field1695 = method778("javax.sound.sampled.SourceDataLine")) : field1695, this.field1692, arg0 << (class197.field2383 ? 2 : 1));
            this.field1693 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1693.open();
            this.field1693.start();
            this.field1690 = arg0;
        } catch (LineUnavailableException var4) {
            if (class467.method2727((byte) -124, arg0) == 1) {
                this.field1693 = null;
                throw var4;
            } else {
                this.method773(class129.method731(arg0, -27265));
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 19)
    public static Class method778(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "()V", line = 44)
    public final void method774() {
        int var1 = 256;
        if (class197.field2383) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2669[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1694[var2 * 2] = (byte) (var3 >> 8);
            this.field1694[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1693.write(this.field1694, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()V", line = 77)
    public final void method775() {
        if (this.field1693 != null) {
            this.field1693.close();
            this.field1693 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "()V", line = 89)
    public final void method776() throws LineUnavailableException {
        this.field1693.flush();
        if (!this.field1691) {
            return;
        }
        this.field1693.close();
        this.field1693 = null;
        Info var1 = new Info(field1695 == null ? (field1695 = method778("javax.sound.sampled.SourceDataLine")) : field1695, this.field1692, this.field1690 << (class197.field2383 ? 2 : 1));
        this.field1693 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1693.open();
        this.field1693.start();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 109)
    public final void method777(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1691 = true;
                    }
                }
            }
        }
        this.field1692 = new AudioFormat((float) class90.field1101, 16, class197.field2383 ? 2 : 1, true, false);
        this.field1694 = new byte[0x100 << (class197.field2383 ? 2 : 1)];
    }
}
