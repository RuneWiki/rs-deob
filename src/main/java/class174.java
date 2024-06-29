import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class174 extends class440 {

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Z")
    private boolean field2295 = false;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field2299 = new String[] { method1469(method1468("<@Rho\"N_")), method1469(method1468("%NQgsa\\Hse+\u0001Tgf?CBb%\u001c@Rth*kFrj\u0003FIc")) };

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2298;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2294;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2297;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[B")
    private byte[] field2296;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 13)
    public final void method1461(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2298 == null ? (field2298 = method1467(field2299[1])) : field2298, this.field2294, arg0 << (class375.field5471 ? 2 : 1));
            this.field2297 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2297.open();
            this.field2297.start();
            this.field2293 = arg0;
        } catch (LineUnavailableException var4) {
            if (class76.method771(arg0, -1288490189) == 1) {
                this.field2297 = null;
                throw var4;
            } else {
                this.method1461(class788.method5671(1282334120, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method1467(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 37)
    public final void method1462() {
        int var1 = 256;
        if (class375.field5471) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field6476[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2296[var2 * 2] = (byte) (var3 >> 8);
            this.field2296[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2297.write(this.field2296, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()I", line = 70)
    public final int method1463() {
        return this.field2293 - (this.field2297.available() >> (class375.field5471 ? 2 : 1));
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V", line = 77)
    public final void method1464() {
        if (this.field2297 != null) {
            this.field2297.close();
            this.field2297 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 90)
    public final void method1465() throws LineUnavailableException {
        this.field2297.flush();
        if (!this.field2295) {
            return;
        }
        this.field2297.close();
        this.field2297 = null;
        Info var1 = new Info(field2298 == null ? (field2298 = method1467(field2299[1])) : field2298, this.field2294, this.field2293 << (class375.field5471 ? 2 : 1));
        this.field2297 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2297.open();
        this.field2297.start();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 111)
    public final void method1466(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf(field2299[0]) >= 0) {
                        this.field2295 = true;
                    }
                }
            }
        }
        this.field2294 = new AudioFormat((float) class215.field3148, 16, class375.field5471 ? 2 : 1, true, false);
        this.field2296 = new byte[0x100 << (class375.field5471 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1468(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1469(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
