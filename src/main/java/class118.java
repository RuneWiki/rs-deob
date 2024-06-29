import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class118 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lrd;")
    public static class173 field2183 = class133.method843("M", 125);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lrd;")
    private static class173 field2184 = class133.method843("Error connecting to server)3", -123);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lrd;")
    public static class173 field2178 = field2184;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method715(int arg0) {
        field2183 = null;
        field2178 = null;
        if (arg0 == -1) {
            field2184 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Lrd;)[Lrd;")
    public static final class173[] method716(int arg0, class173[] arg1) {
        class173[] var2 = new class173[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = class173.method1158(arg0 - 3, new class173[] { class93.method588(var3, true), class43.field877 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class173.method1158(arg0 - 3, new class173[] { var2[var3], arg1[var3] });
            }
        }
        field2179++;
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
    public static final void method717(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 73) {
            method719(34, (byte) 125);
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class46.field975[arg1][arg3 + var4][arg2 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class46.field975[arg1][arg3][arg2 + var5] = class46.field975[arg1][arg3 - 1][arg2 + var5];
            }
        }
        field2180++;
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class46.field975[arg1][arg3 + var6][arg2] = class46.field975[arg1][arg3 + var6][arg2 - 1];
            }
        }
        if (arg3 > 0 && class46.field975[arg1][arg3 - 1][arg2] != 0) {
            class46.field975[arg1][arg3][arg2] = class46.field975[arg1][arg3 - 1][arg2];
        } else if (arg2 > 0 && class46.field975[arg1][arg3][arg2 - 1] != 0) {
            class46.field975[arg1][arg3][arg2] = class46.field975[arg1][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class46.field975[arg1][arg3 - 1][arg2 - 1] != 0) {
            class46.field975[arg1][arg3][arg2] = class46.field975[arg1][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLmb;)Lrd;")
    public static final class173 method718(int arg0, boolean arg1, class121 arg2) {
        field2181++;
        try {
            class173 var3 = new class173();
            var3.field3379 = arg2.method734(-1);
            if (arg0 < var3.field3379) {
                var3.field3379 = arg0;
            }
            if (!arg1) {
                field2184 = null;
            }
            var3.field3415 = new byte[var3.field3379];
            arg2.field2222 += class25.field534.method280(var3.field3379, 0, arg2.field2222, 0, arg2.field2218, var3.field3415);
            return var3;
        } catch (Exception var4) {
            return class126.field2379;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method719(int arg0, byte arg1) {
        field2182++;
        if (arg0 == 100 && class93.field1744 > 0) {
            byte[] var2 = class9.field163[--class93.field1744];
            class9.field163[class93.field1744] = null;
            return var2;
        } else if (arg0 == 5000 && class144.field2691 > 0) {
            byte[] var3 = class26.field553[--class144.field2691];
            class26.field553[class144.field2691] = null;
            return var3;
        } else if (arg0 == 30000 && class166.field3210 > 0) {
            byte[] var4 = class23.field508[--class166.field3210];
            class23.field508[class166.field3210] = null;
            return var4;
        } else if (arg1 <= 76) {
            return null;
        } else {
            return new byte[arg0];
        }
    }
}
