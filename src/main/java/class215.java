import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class215 extends class241 {

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Z")
    private boolean field3448 = false;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3451;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3447;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3446;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "[B")
    private byte[] field3450;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method1424(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3451 == null ? (field3451 = method1430("javax.sound.sampled.SourceDataLine")) : field3451, this.field3447, arg0 << (class116.field1955 ? 2 : 1));
            this.field3446 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3446.open();
            this.field3446.start();
            this.field3449 = arg0;
        } catch (LineUnavailableException var4) {
            if (class193.method1325(arg0, 3) == 1) {
                this.field3446 = null;
                throw var4;
            } else {
                this.method1424(class14.method101(arg0, -18851));
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public final void method1425() {
        int var1 = 256;
        if (class116.field1955) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3817[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3450[var2 * 2] = (byte) (var3 >> 8);
            this.field3450[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3446.write(this.field3450, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
    public final void method1426() {
        if (this.field3446 != null) {
            this.field3446.close();
            this.field3446 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
    public final int method1427() {
        return this.field3449 - (this.field3446.available() >> (class116.field1955 ? 2 : 1));
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1428(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3448 = true;
                    }
                }
            }
        }
        this.field3447 = new AudioFormat((float) class23.field359, 16, class116.field1955 ? 2 : 1, true, false);
        this.field3450 = new byte[0x100 << (class116.field1955 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
    public final void method1429() throws LineUnavailableException {
        this.field3446.flush();
        if (!this.field3448) {
            return;
        }
        this.field3446.close();
        this.field3446 = null;
        Info var1 = new Info(field3451 == null ? (field3451 = method1430("javax.sound.sampled.SourceDataLine")) : field3451, this.field3447, this.field3449 << (class116.field1955 ? 2 : 1));
        this.field3446 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3446.open();
        this.field3446.start();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1430(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
