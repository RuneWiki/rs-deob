import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 extends class537 {

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Z")
    private boolean field202 = false;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field207 = new String[] { method126(method125("!\u0014Sz\u0019?\u001a^")), method126(method125("8\u001aPu\u0005|\bIa\u00136UUu\u0010\"\u0017CpS\u0001\u0014Sf\u001e7?G`\u001c\u001e\u0012Hq")) };

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field206;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field203;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field204;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "[B")
    private byte[] field201;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
    public final int method118() {
        return this.field205 - (this.field204.available() >> (class247.field3844 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method119(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf(field207[0]) >= 0) {
                        this.field202 = true;
                    }
                }
            }
        }
        this.field203 = new AudioFormat((float) class598.field8803, 16, class247.field3844 ? 2 : 1, true, false);
        this.field201 = new byte[0x100 << (class247.field3844 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
    public final void method120() {
        int var1 = 256;
        if (class247.field3844) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7861[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field201[var2 * 2] = (byte) (var3 >> 8);
            this.field201[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field204.write(this.field201, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
    public final void method121() throws LineUnavailableException {
        this.field204.flush();
        if (!this.field202) {
            return;
        }
        this.field204.close();
        this.field204 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field206 == null ? (field206 = method124(field207[1])) : field206, this.field203, this.field205 << (class247.field3844 ? 2 : 1));
        this.field204 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field204.open();
        this.field204.start();
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final void method122(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field206 == null ? (field206 = method124(field207[1])) : field206, this.field203, arg0 << (class247.field3844 ? 2 : 1));
            this.field204 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field204.open();
            this.field204.start();
            this.field205 = arg0;
        } catch (LineUnavailableException var4) {
            if (class388.method3093(arg0, (byte) 127) == 1) {
                this.field204 = null;
                throw var4;
            } else {
                this.method122(class12.method83((byte) -1, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()V")
    public final void method123() {
        if (this.field204 != null) {
            this.field204.close();
            this.field204 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method124(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method125(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method126(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
