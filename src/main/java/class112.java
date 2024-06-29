import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class112 extends class168 {

    @OriginalMember(owner = "client!th", name = "U", descriptor = "Z")
    private boolean field1645 = false;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field1649;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1646;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1644;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "[B")
    private byte[] field1647;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()V")
    public final void method677() {
        if (this.field1644 != null) {
            this.field1644.close();
            this.field1644 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method678(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1649 == null ? (field1649 = method683("javax.sound.sampled.SourceDataLine")) : field1649, this.field1646, arg0 << (class165.field2715 ? 2 : 1));
            this.field1644 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1644.open();
            this.field1644.start();
            this.field1648 = arg0;
        } catch (LineUnavailableException var4) {
            if (class197.method1337(-114, arg0) == 1) {
                this.field1644 = null;
                throw var4;
            } else {
                this.method678(class251.method1697(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V")
    public final void method679() throws LineUnavailableException {
        this.field1644.flush();
        if (!this.field1645) {
            return;
        }
        this.field1644.close();
        this.field1644 = null;
        Info var1 = new Info(field1649 == null ? (field1649 = method683("javax.sound.sampled.SourceDataLine")) : field1649, this.field1646, this.field1648 << (class165.field2715 ? 2 : 1));
        this.field1644 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1644.open();
        this.field1644.start();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method680(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1645 = true;
                    }
                }
            }
        }
        this.field1646 = new AudioFormat((float) class216.field3884, 16, class165.field2715 ? 2 : 1, true, false);
        this.field1647 = new byte[0x100 << (class165.field2715 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "()I")
    public final int method681() {
        return this.field1648 - (this.field1644.available() >> (class165.field2715 ? 2 : 1));
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()V")
    public final void method682() {
        int var1 = 256;
        if (class165.field2715) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2826[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1647[var2 * 2] = (byte) (var3 >> 8);
            this.field1647[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1644.write(this.field1647, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method683(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
