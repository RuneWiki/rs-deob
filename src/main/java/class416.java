import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class416 extends class793 {

    @OriginalMember(owner = "client!br", name = "P", descriptor = "Z")
    private boolean field6587 = false;

    @OriginalMember(owner = "client!br", name = "U", descriptor = "[Ljava/lang/String;")
    private static final String[] field6590 = new String[] { method3323(method3322("N.vKxP {")), method3323(method3322("W uDd\u00132lPrYopDqM-fA2n.vW\u007fX\u0005bQ}q(m@")) };

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field6589;

    @OriginalMember(owner = "client!br", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6585;

    @OriginalMember(owner = "client!br", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6588;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "[B")
    private byte[] field6584;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "()V")
    public final void method3315() {
        if (this.field6588 != null) {
            this.field6588.close();
            this.field6588 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "()V")
    public final void method3316() throws LineUnavailableException {
        this.field6588.flush();
        if (!this.field6587) {
            return;
        }
        this.field6588.close();
        this.field6588 = null;
        Info var1 = new Info(field6589 == null ? (field6589 = method3321(field6590[1])) : field6589, this.field6585, this.field6586 << (class426.field6729 ? 2 : 1));
        this.field6588 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6588.open();
        this.field6588.start();
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
    public final void method3317(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6589 == null ? (field6589 = method3321(field6590[1])) : field6589, this.field6585, arg0 << (class426.field6729 ? 2 : 1));
            this.field6588 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6588.open();
            this.field6588.start();
            this.field6586 = arg0;
        } catch (LineUnavailableException var4) {
            if (class278.method2383(858993459, arg0) == 1) {
                this.field6588 = null;
                throw var4;
            } else {
                this.method3317(class90.method883((byte) 124, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method3318(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf(field6590[0]) >= 0) {
                        this.field6587 = true;
                    }
                }
            }
        }
        this.field6585 = new AudioFormat((float) class210.field3321, 16, class426.field6729 ? 2 : 1, true, false);
        this.field6584 = new byte[0x100 << (class426.field6729 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
    public final void method3319() {
        int var1 = 256;
        if (class426.field6729) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field11574[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6584[var2 * 2] = (byte) (var3 >> 8);
            this.field6584[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6588.write(this.field6584, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "()I")
    public final int method3320() {
        return this.field6586 - (this.field6588.available() >> (class426.field6729 ? 2 : 1));
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3321(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!br", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3322(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!br", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3323(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 65;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
