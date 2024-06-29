import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class242 extends class258 {

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Z")
    private boolean field3972 = false;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    private int field3975;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3977;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3976;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3973;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "[B")
    private byte[] field3974;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V")
    public final void method1594() {
        int var1 = 256;
        if (class74.field1215) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4207[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3974[var2 * 2] = (byte) (var3 >> 8);
            this.field3974[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3973.write(this.field3974, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V")
    public final void method1595() throws LineUnavailableException {
        this.field3973.flush();
        if (!this.field3972) {
            return;
        }
        this.field3973.close();
        this.field3973 = null;
        Info var1 = new Info(field3977 == null ? (field3977 = method1600("javax.sound.sampled.SourceDataLine")) : field3977, this.field3976, this.field3975 << (class74.field1215 ? 2 : 1));
        this.field3973 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3973.open();
        this.field3973.start();
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()I")
    public final int method1596() {
        return this.field3975 - (this.field3973.available() >> (class74.field1215 ? 2 : 1));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1597(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3972 = true;
                    }
                }
            }
        }
        this.field3976 = new AudioFormat((float) class81.field1478, 16, class74.field1215 ? 2 : 1, true, false);
        this.field3974 = new byte[0x100 << (class74.field1215 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public final void method1598(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3977 == null ? (field3977 = method1600("javax.sound.sampled.SourceDataLine")) : field3977, this.field3976, arg0 << (class74.field1215 ? 2 : 1));
            this.field3973 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3973.open();
            this.field3973.start();
            this.field3975 = arg0;
        } catch (LineUnavailableException var4) {
            if (class66.method414(arg0, 114) == 1) {
                this.field3973 = null;
                throw var4;
            } else {
                this.method1598(class6.method33(arg0, (byte) -95));
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
    public final void method1599() {
        if (this.field3973 != null) {
            this.field3973.close();
            this.field3973 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1600(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
