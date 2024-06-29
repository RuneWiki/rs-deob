import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class189 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lik;")
    public static class410 field2721 = new class410(64);

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[[I")
    public static int[][] field2724 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([[IILpe;IZ)V")
    public static final void method1359(int[][] arg0, int arg1, class391 arg2, int arg3, boolean arg4) {
        if (arg3 != 1) {
            field2724 = null;
        }
        field2725++;
        for (int var5 = 0; var5 < arg1; var5++) {
            int[][] var6;
            if (arg0 == null) {
                var6 = null;
            } else {
                var6 = new int[class116.field1621 + 1][class385.field5425 + 1];
                for (int var7 = 0; var7 <= class385.field5425; var7++) {
                    for (int var11 = 0; var11 <= class116.field1621; var11++) {
                        var6[var11][var7] = class44.field703[var5][var11][var7] - arg0[var11][var7];
                    }
                }
            }
            int var8 = 0;
            int var9 = 0;
            if (!arg4) {
                if (class223.field3086) {
                    var9 |= 0x8;
                }
                if (class385.field5429) {
                    var8 |= 0x2;
                }
                if (class179.field2633 != 0) {
                    var8 |= 0x1;
                    if (var5 == 0 || class297.field4005 >= 96) {
                        var9 |= 0x10;
                    }
                }
            }
            if (class385.field5429) {
                var9 |= 0x7;
            }
            class411 var10 = arg2.method105(class116.field1621, class385.field5425, class44.field703[var5], var6, 128, var8, var9);
            class361.method2265(var5, var10);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILpe;ILac;ILtj;Loo;I)V")
    public static final void method1360(int arg0, class391 arg1, int arg2, class216 arg3, int arg4, class430 arg5, class384 arg6, int arg7) {
        if (arg4 >= -4) {
            field2722 = -68;
        }
        field2726++;
        int var8 = arg5.field6122 - (arg7 / 2) - 5;
        int var9 = arg0 + 2;
        if (arg6.field5379 != 0) {
            arg1.method2414(var9, var8, arg0 + 1 - (-(arg3.method1472() * arg2) + var9), true, arg7 + 10, arg6.field5379);
        }
        if (arg6.field5413 != 0) {
            arg1.method2413(var8, -15084, var9, arg6.field5413, arg3.method1472() * arg2 + arg0 + 1 - var9, arg7 + 10);
        }
        int var10 = arg6.field5385;
        if (arg5.field6117 && arg6.field5394 != -1) {
            var10 = arg6.field5394;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class434.field6157[var11];
            if (var11 < arg2 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method1475(arg1, var12, arg5.field6122, arg0, var10, true);
            arg0 += arg3.method1472();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method1361(byte arg0) {
        field2721 = null;
        field2724 = null;
        if (arg0 < 95) {
            field2722 = 38;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static final void method1362(int arg0) {
        class147.field2264.method2533(0);
        field2723++;
        if (arg0 != 1903) {
            field2722 = 26;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public static final void method1363(int arg0, int arg1) {
        if (arg0 <= 80) {
            field2722 = 84;
        }
        field2720++;
        class450 var2 = class59.method540(12, arg1, 1000);
        var2.method2798(-664528978);
    }
}
