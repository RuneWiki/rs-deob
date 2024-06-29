import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class380 extends class390 {

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field5416 = -1;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field5418 = 0;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[Lph;")
    public static class386[] field5425 = new class386[14];

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lkn;")
    public static class442 field5428 = new class442("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Lkn;")
    public static class442 field5429 = new class442("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "F")
    public static float field5430;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field5414;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field5419;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field5422;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method2423(boolean arg0) {
        field5415++;
        class131 var1 = class366.field5155;
        synchronized (class366.field5155) {
            class366.field5155.method900(0);
        }
        if (arg0) {
            return;
        }
        class131 var2 = class99.field1365;
        synchronized (class99.field1365) {
            class99.field1365.method900(0);
        }
        class416 var3 = class63.field867;
        synchronized (class63.field867) {
            class63.field867.method2616(13711);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 31)
    public static void method2424(int arg0) {
        if (arg0 != -7201) {
            field5429 = null;
        }
        field5428 = null;
        field5425 = null;
        field5429 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIBI)V", line = 50)
    public static final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field5421++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg1 - arg7;
        int var12 = arg0 - arg7;
        int var13 = arg1 * arg1;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = -81 % ((arg6 - 59) / 60);
        int var17 = var12 * var12;
        int var18 = var14 << 1;
        int var19 = var13 << 1;
        int var20 = var17 << 1;
        int var21 = var15 << 1;
        int var22 = arg0 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var22) * var13 + var18;
        int var25 = var14 - ((var22 - 1) * var19);
        int var26 = (1 - var23) * var15 + var20;
        int var27 = var17 - ((var23 - 1) * var21);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var17 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg0 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        if (arg2 >= class290.field4058 && arg2 <= class442.field6212) {
            int[] var40 = class296.field4138[arg2];
            int var41 = class302.method1951(class154.field2161, 0, arg4 - arg1, class233.field3350);
            int var42 = class302.method1951(class154.field2161, 0, arg4 + arg1, class233.field3350);
            int var43 = class302.method1951(class154.field2161, 0, arg4 - var11, class233.field3350);
            int var44 = class302.method1951(class154.field2161, 0, arg4 + var11, class233.field3350);
            class295.method1924(3289650, var40, var43, arg3, var41);
            class295.method1924(3289650, var40, var44, arg5, var43);
            class295.method1924(3289650, var40, var42, arg3, var44);
        }
        while (var9 > 0) {
            boolean var45 = var12 >= var9;
            if (var24 < 0) {
                while (var24 < 0) {
                    var25 += var36;
                    var24 += var32;
                    var36 += var29;
                    var32 += var29;
                    var8++;
                }
            }
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var38;
                        var26 += var34;
                        var38 += var31;
                        var34 += var31;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var27 += var38;
                    var26 += var34;
                    var38 += var31;
                    var10++;
                    var34 += var31;
                }
                var26 += -var39;
                var27 += -var35;
                var35 -= var30;
                var39 -= var30;
            }
            if (var25 < 0) {
                var24 += var32;
                var25 += var36;
                var32 += var29;
                var36 += var29;
                var8++;
            }
            var25 += -var33;
            var24 += -var37;
            var9--;
            var37 -= var28;
            var33 -= var28;
            int var46 = arg2 - var9;
            int var47 = arg2 + var9;
            if (var47 >= class290.field4058 && var46 <= class442.field6212) {
                int var48 = class302.method1951(class154.field2161, 0, arg4 + var8, class233.field3350);
                int var49 = class302.method1951(class154.field2161, 0, arg4 - var8, class233.field3350);
                if (var45) {
                    int var50 = class302.method1951(class154.field2161, 0, arg4 + var10, class233.field3350);
                    int var51 = class302.method1951(class154.field2161, 0, arg4 - var10, class233.field3350);
                    if (class290.field4058 <= var46) {
                        int[] var52 = class296.field4138[var46];
                        class295.method1924(3289650, var52, var51, arg3, var49);
                        class295.method1924(3289650, var52, var50, arg5, var51);
                        class295.method1924(3289650, var52, var48, arg3, var50);
                    }
                    if (var47 <= class442.field6212) {
                        int[] var53 = class296.field4138[var47];
                        class295.method1924(3289650, var53, var51, arg3, var49);
                        class295.method1924(3289650, var53, var50, arg5, var51);
                        class295.method1924(3289650, var53, var48, arg3, var50);
                    }
                } else {
                    if (class290.field4058 <= var46) {
                        class295.method1924(3289650, class296.field4138[var46], var48, arg3, var49);
                    }
                    if (class442.field6212 >= var47) {
                        class295.method1924(3289650, class296.field4138[var47], var48, arg3, var49);
                    }
                }
            }
        }
    }
}
