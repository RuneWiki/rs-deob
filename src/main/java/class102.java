import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class102 extends class225 {

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Z")
    private boolean field1734 = false;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1735;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1732;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1730;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[B")
    private byte[] field1733;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()I", line = 10)
    public final int method366() {
        return this.field1731 - (this.field1730.available() >> (class141.field2355 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 19)
    public final void method363(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1735 == null ? (field1735 = method675("javax.sound.sampled.SourceDataLine")) : field1735, this.field1732, arg0 << (class141.field2355 ? 2 : 1));
            this.field1730 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1730.open();
            this.field1730.start();
            this.field1731 = arg0;
        } catch (LineUnavailableException var4) {
            if (class216.method1428(arg0, -119) == 1) {
                this.field1730 = null;
                throw var4;
            } else {
                this.method363(class53.method336(-1753429918, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 19)
    public static Class method675(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 44)
    public final void method365(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1734 = true;
                    }
                }
            }
        }
        this.field1732 = new AudioFormat((float) class205.field3493, 16, class141.field2355 ? 2 : 1, true, false);
        this.field1733 = new byte[0x100 << (class141.field2355 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V", line = 84)
    public final void method362() {
        int var1 = 256;
        if (class141.field2355) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3771[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1733[var2 * 2] = (byte) (var3 >> 8);
            this.field1733[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1730.write(this.field1733, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V", line = 119)
    public final void method367() {
        if (this.field1730 != null) {
            this.field1730.close();
            this.field1730 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V", line = 132)
    public final void method368() throws LineUnavailableException {
        this.field1730.flush();
        if (!this.field1734) {
            return;
        }
        this.field1730.close();
        this.field1730 = null;
        Info var1 = new Info(field1735 == null ? (field1735 = method675("javax.sound.sampled.SourceDataLine")) : field1735, this.field1732, this.field1731 << (class141.field2355 ? 2 : 1));
        this.field1730 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1730.open();
        this.field1730.start();
    }
}
