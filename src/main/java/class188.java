import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class188 extends class393 {

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field2555 = 0;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "[I")
    public static int[] field2557 = new int[1000];

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Lwi;")
    public static class214 field2556;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lqa;")
    public class243 field2548;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Z")
    public boolean field2550;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[I")
    public static int[] field2546;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "[Lqa;")
    public static class243[] field2553;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
    public static final void method1169(boolean arg0) {
        field2552++;
        class24 var1 = class258.field3761;
        synchronized (class258.field3761) {
            if (!arg0) {
                field2546 = null;
            }
            class258.field3761.method212(-64);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLai;)V")
    public static final void method1170(boolean arg0, class129 arg1) {
        field2547++;
        if (!arg0) {
            field2551 = -45;
        }
        for (class166 var2 = (class166) class54.field805.method2649(0); var2 != null; var2 = (class166) class54.field805.method2656(0)) {
            if (var2.field2179 == arg1) {
                if (var2.field2162 != null) {
                    class405.field6092.method166(var2.field2162);
                    var2.field2162 = null;
                }
                var2.method2574((byte) 115);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILde;Lde;)V")
    public static final void method1171(int arg0, int arg1, int arg2, class164 arg3, class164 arg4) {
        if (class343.field5032[arg0][arg1][arg2] == null) {
            class433.method2749(arg0, arg1, arg2);
        }
        class343.field5032[arg0][arg1][arg2].field123 = arg3;
        class343.field5032[arg0][arg1][arg2].field102 = arg4;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2557 = null;
        if (arg0 >= 95) {
            field2553 = null;
            field2546 = null;
            field2556 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 <= 110) {
            field2553 = null;
        }
        field2549++;
        if (arg1 == arg5 && arg0 == arg2 && arg4 == arg9 && arg3 == arg7) {
            class100.method678(arg8, arg1, arg4, false, arg2, arg3);
            return;
        }
        int var10 = arg1;
        int var11 = arg2;
        int var12 = arg1 * 3;
        int var13 = arg2 * 3;
        int var14 = arg5 * 3;
        int var15 = arg0 * 3;
        int var16 = arg9 * 3;
        int var17 = arg7 * 3;
        int var18 = var14 + (arg4 - var16) - arg1;
        int var19 = arg3 + var15 - arg2 - var17;
        int var20 = var16 - var14 - (var14 - var12);
        int var21 = var13 + (var17 - var15) - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg1 + (var27 + var31 + var29 >> 12);
            int var34 = (var28 + var30 + var32 >> 12) + arg2;
            class100.method678(arg8, var10, var33, false, var11, var34);
            var10 = var33;
            var11 = var34;
        }
    }
}
