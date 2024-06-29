import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class97 extends class131 {

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Z")
    private boolean field1515 = false;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1517;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1513;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1512;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "[B")
    private byte[] field1514;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
    public final void method627() {
        int var1 = 256;
        if (class225.field3868) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2194[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1514[var2 * 2] = (byte) (var3 >> 8);
            this.field1514[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1512.write(this.field1514, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1517 == null ? (field1517 = method633("javax.sound.sampled.SourceDataLine")) : field1517, this.field1513, arg0 << (class225.field3868 ? 2 : 1));
            this.field1512 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1512.open();
            this.field1512.start();
            this.field1516 = arg0;
        } catch (LineUnavailableException var4) {
            if (class60.method431(-13941, arg0) == 1) {
                this.field1512 = null;
                throw var4;
            } else {
                this.method628(class263.method1777(arg0, (byte) 85));
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
    public final void method629() throws LineUnavailableException {
        this.field1512.flush();
        if (!this.field1515) {
            return;
        }
        this.field1512.close();
        this.field1512 = null;
        Info var1 = new Info(field1517 == null ? (field1517 = method633("javax.sound.sampled.SourceDataLine")) : field1517, this.field1513, this.field1516 << (class225.field3868 ? 2 : 1));
        this.field1512 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1512.open();
        this.field1512.start();
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
    public final void method630() {
        if (this.field1512 != null) {
            this.field1512.close();
            this.field1512 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method631(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1515 = true;
                    }
                }
            }
        }
        this.field1513 = new AudioFormat((float) class215.field3720, 16, class225.field3868 ? 2 : 1, true, false);
        this.field1514 = new byte[0x100 << (class225.field3868 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()I")
    public final int method632() {
        return this.field1516 - (this.field1512.available() >> (class225.field3868 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method633(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
