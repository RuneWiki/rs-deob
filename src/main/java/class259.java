import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class259 {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[C")
    private static char[] field3359 = new char[64];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[I")
    public static int[] field3361;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lmv;")
    public static class295 field3360;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lgd;")
    public static class344 field3354;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lgs;")
    public static class387 field3355;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Ljava/lang/String;")
    public String field3357;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[J")
    public static long[] field3358;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3359[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3359[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3359[var2] = (char) (var2 + 48 - 52);
        }
        field3359[63] = '-';
        field3359[62] = '*';
        field3361 = new int[64];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 10)
    public static void method1546(int arg0) {
        field3358 = null;
        field3359 = null;
        field3354 = null;
        field3361 = null;
        field3360 = null;
        field3355 = null;
        if (arg0 > -93) {
            field3359 = null;
        }
    }
}
