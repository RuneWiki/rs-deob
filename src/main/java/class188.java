import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class188 extends class202 {

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
    private boolean field3325 = false;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3329;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3326;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3324;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "[B")
    private byte[] field3327;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public final void method1176(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3329 == null ? (field3329 = method1287("javax.sound.sampled.SourceDataLine")) : field3329, this.field3326, arg0 << (class85.field1468 ? 2 : 1));
            this.field3324 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3324.open();
            this.field3324.start();
            this.field3328 = arg0;
        } catch (LineUnavailableException var4) {
            if (client.method1064(-116, arg0) == 1) {
                this.field3324 = null;
                throw var4;
            } else {
                this.method1176(class48.method342(1049852161, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V")
    public final void method1177() {
        if (this.field3324 != null) {
            this.field3324.close();
            this.field3324 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1182(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3325 = true;
                    }
                }
            }
        }
        this.field3326 = new AudioFormat((float) class225.field3905, 16, class85.field1468 ? 2 : 1, true, false);
        this.field3327 = new byte[0x100 << (class85.field1468 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()I")
    public final int method1180() {
        return this.field3328 - (this.field3324.available() >> (class85.field1468 ? 2 : 1));
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()V")
    public final void method1179() {
        int var1 = 256;
        if (class85.field1468) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3518[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3327[var2 * 2] = (byte) (var3 >> 8);
            this.field3327[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3324.write(this.field3327, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "()V")
    public final void method1181() throws LineUnavailableException {
        this.field3324.flush();
        if (!this.field3325) {
            return;
        }
        this.field3324.close();
        this.field3324 = null;
        Info var1 = new Info(field3329 == null ? (field3329 = method1287("javax.sound.sampled.SourceDataLine")) : field3329, this.field3326, this.field3328 << (class85.field1468 ? 2 : 1));
        this.field3324 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3324.open();
        this.field3324.start();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1287(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
