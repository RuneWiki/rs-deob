import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class198 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field3900 = new int[256];

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Led;")
    public static class43 field3903;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ltd;")
    public static class176 field3902;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public static int[] field3905;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field3901;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
    public static boolean field3904;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1294(int arg0) {
        if (arg0 != -266) {
            method1294(-27);
        }
        field3901 = null;
        field3900 = null;
        field3903 = null;
        field3905 = null;
        field3902 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var5 = var0;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var5 & 0x1) == 1) {
                    var5 = var5 >>> 1 ^ 0xEDB88320;
                } else {
                    var5 >>>= 0x1;
                }
            }
            field3900[var0] = var5;
        }
        field3903 = class191.method1219("(U3", false);
        field3902 = new class176(64);
        field3905 = new int[99];
        field3906 = 0;
        int var1 = 0;
        for (int var2 = 0; var2 < 99; var2++) {
            int var3 = var2 + 1;
            int var4 = (int) (Math.pow(2.0D, (double) var3 / 7.0D) * 300.0D + (double) var3);
            var1 += var4;
            field3905[var2] = var1 / 4;
        }
    }
}
