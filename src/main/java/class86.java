import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class86 extends class167 {

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "Z")
    private boolean field1319 = false;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1324;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1322;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1321;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "[B")
    private byte[] field1320;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public final void method598(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1324 == null ? (field1324 = method604("javax.sound.sampled.SourceDataLine")) : field1324, this.field1322, arg0 << (class55.field899 ? 2 : 1));
            this.field1321 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1321.open();
            this.field1321.start();
            this.field1323 = arg0;
        } catch (LineUnavailableException var4) {
            if (class118.method744(arg0, (byte) -11) == 1) {
                this.field1321 = null;
                throw var4;
            } else {
                this.method598(class406.method2388(arg0, -127));
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
    public final void method599() {
        int var1 = 256;
        if (class55.field899) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2476[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1320[var2 * 2] = (byte) (var3 >> 8);
            this.field1320[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1321.write(this.field1320, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method600(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1319 = true;
                    }
                }
            }
        }
        this.field1322 = new AudioFormat((float) class245.field3463, 16, class55.field899 ? 2 : 1, true, false);
        this.field1320 = new byte[0x100 << (class55.field899 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
    public final void method601() {
        if (this.field1321 != null) {
            this.field1321.close();
            this.field1321 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()I")
    public final int method602() {
        return this.field1323 - (this.field1321.available() >> (class55.field899 ? 2 : 1));
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
    public final void method603() throws LineUnavailableException {
        this.field1321.flush();
        if (!this.field1319) {
            return;
        }
        this.field1321.close();
        this.field1321 = null;
        Info var1 = new Info(field1324 == null ? (field1324 = method604("javax.sound.sampled.SourceDataLine")) : field1324, this.field1322, this.field1323 << (class55.field899 ? 2 : 1));
        this.field1321 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1321.open();
        this.field1321.start();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method604(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
