import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class88 extends class218 {

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1331;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1330;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1328;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[B")
    private byte[] field1327;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
    public final int method588() {
        return this.field1329 - (this.field1328.available() >> (class189.field2953 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method589(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1331 == null ? (field1331 = method594("javax.sound.sampled.SourceDataLine")) : field1331, this.field1330, arg0 << (class189.field2953 ? 2 : 1));
            this.field1328 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1328.open();
            this.field1328.start();
            this.field1329 = arg0;
        } catch (LineUnavailableException var4) {
            if (class99.method675(1, arg0) == 1) {
                this.field1328 = null;
                throw var4;
            } else {
                this.method589(class297.method1997(89, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method590(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1326 = true;
                    }
                }
            }
        }
        this.field1330 = new AudioFormat((float) class197.field3105, 16, class189.field2953 ? 2 : 1, true, false);
        this.field1327 = new byte[0x100 << (class189.field2953 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public final void method591() {
        int var1 = 256;
        if (class189.field2953) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3414[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1327[var2 * 2] = (byte) (var3 >> 8);
            this.field1327[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1328.write(this.field1327, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
    public final void method592() {
        if (this.field1328 != null) {
            this.field1328.close();
            this.field1328 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
    public final void method593() throws LineUnavailableException {
        this.field1328.flush();
        if (!this.field1326) {
            return;
        }
        this.field1328.close();
        this.field1328 = null;
        Info var1 = new Info(field1331 == null ? (field1331 = method594("javax.sound.sampled.SourceDataLine")) : field1331, this.field1330, this.field1329 << (class189.field2953 ? 2 : 1));
        this.field1328 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1328.open();
        this.field1328.start();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method594(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
