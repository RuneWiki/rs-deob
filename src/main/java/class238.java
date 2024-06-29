import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class238 implements Runnable {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lnc;")
    public volatile class160[] field3896 = new class160[2];

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Z")
    public volatile boolean field3909 = false;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
    public volatile boolean field3895 = false;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[[Z")
    public static boolean[][] field3899 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lc;")
    public static class331 field3897 = new class331();

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3904 = null;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3908 = 0;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lwe;")
    public class59 field3901;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field3906;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[Lwb;")
    public static class171[] field3902;

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V", line = 9)
    public final void run() {
        this.field3895 = true;
        field3898++;
        try {
            while (!this.field3909) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class160 var2 = this.field3896[var1];
                    if (var2 != null) {
                        var2.method1279(true);
                    }
                }
                class142.method1149(10L, (byte) 127);
                class322.method2215(this.field3901, (Object) null, (byte) -30);
            }
        } catch (Exception var7) {
            class88.method775(var7, (String) null, true);
        } finally {
            this.field3895 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 48)
    public static void method1682(byte arg0) {
        field3902 = null;
        field3906 = null;
        field3899 = (boolean[][]) null;
        field3904 = null;
        if (arg0 != 102) {
            method1682((byte) -34);
        }
        field3897 = null;
    }
}
