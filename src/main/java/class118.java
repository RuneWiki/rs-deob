import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class118 extends class140 {

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
    private boolean field1735 = false;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1738;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1734;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1733;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "[B")
    private byte[] field1736;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()V", line = 11)
    public final void method738() {
        if (this.field1733 != null) {
            this.field1733.close();
            this.field1733 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 25)
    public final void method739(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1738 == null ? (field1738 = method744("javax.sound.sampled.SourceDataLine")) : field1738, this.field1734, arg0 << (class267.field3526 ? 2 : 1));
            this.field1733 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1733.open();
            this.field1733.start();
            this.field1737 = arg0;
        } catch (LineUnavailableException var4) {
            if (class66.method441(arg0, 65535) == 1) {
                this.field1733 = null;
                throw var4;
            } else {
                this.method739(class100.method616(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 25)
    public static Class method744(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 47)
    public final void method740(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1735 = true;
                    }
                }
            }
        }
        this.field1734 = new AudioFormat((float) class165.field2290, 16, class267.field3526 ? 2 : 1, true, false);
        this.field1736 = new byte[0x100 << (class267.field3526 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I", line = 84)
    public final int method741() {
        return this.field1737 - (this.field1733.available() >> (class267.field3526 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()V", line = 93)
    public final void method742() {
        int var1 = 256;
        if (class267.field3526) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2017[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1736[var2 * 2] = (byte) (var3 >> 8);
            this.field1736[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1733.write(this.field1736, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()V", line = 126)
    public final void method743() throws LineUnavailableException {
        this.field1733.flush();
        if (!this.field1735) {
            return;
        }
        this.field1733.close();
        this.field1733 = null;
        Info var1 = new Info(field1738 == null ? (field1738 = method744("javax.sound.sampled.SourceDataLine")) : field1738, this.field1734, this.field1737 << (class267.field3526 ? 2 : 1));
        this.field1733 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1733.open();
        this.field1733.start();
    }
}
