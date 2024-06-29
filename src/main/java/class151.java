import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class151 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Z")
    public static boolean field2418 = false;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2422 = "Loading...";

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Z")
    public static boolean field2424 = true;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2429 = 7759444;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lea;")
    public static class204 field2427 = new class204();

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[I")
    public static int[] field2430 = new int[2];

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
    public static boolean field2431 = true;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "[I")
    public static int[] field2434 = new int[1000];

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[[I")
    public static int[][] field2433 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[[B")
    public static byte[][] field2425;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[[[B")
    public static byte[][][] field2432;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[[[I")
    public static int[][][] field2426;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1155(boolean arg0) {
        if (arg0) {
            class60.field946 = class115.field1885;
            class29.field475 = class150.field2404;
            class300.field4723 = class236.field3706;
        } else {
            class60.field946 = class157.field2500;
            class29.field475 = class298.field4701;
            class300.field4723 = class251.field3864;
        }
        class203.field3189 = class60.field946.length;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZIIIII)V", line = 38)
    public static final void method1156(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2423++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6 - arg3;
        int var11 = arg6 * arg6;
        int var12 = arg5 - arg3;
        int var13 = var10 * var10;
        int var14 = var12 * var12;
        int var15 = var11 << 1;
        int var16 = arg5;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = arg5 * arg5;
        int var20 = var19 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var11 + var20;
        int var24 = (1 - var22) * var13 + var17;
        int var25 = var19 - (var21 - 1) * var15;
        int var26 = var14 - (var22 - 1) * var18;
        int var27 = var11 << 2;
        int var28 = var19 << 2;
        int var29 = var13 << 2;
        int var30 = var14 << 2;
        int var31 = var20 * 3;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var15;
        int var34 = var30;
        if (!arg2) {
            method1160(-40);
        }
        int var35 = var28;
        int var36 = (var22 - 3) * var18;
        int var37 = (arg5 - 1) * var27;
        int[] var38 = class102.field1729[arg4];
        class86.method614(arg0, -24891, arg1 - var10, -arg6 + arg1, var38);
        int var39 = (var12 - 1) * var29;
        class86.method614(arg7, -24891, arg1 + var10, -var10 + arg1, var38);
        class86.method614(arg0, -24891, arg1 + arg6, arg1 + var10, var38);
        while (var16 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var25 += var35;
                    var35 += var28;
                }
            }
            boolean var40 = var12 >= var16;
            var16--;
            if (var25 < 0) {
                var25 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var25 += -var33;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var9++;
                        var26 += var34;
                        var24 += var32;
                        var32 += var30;
                        var34 += var30;
                    }
                }
                if (var26 < 0) {
                    var24 += var32;
                    var9++;
                    var32 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var24 += -var39;
                var26 += -var36;
                var39 -= var29;
                var36 -= var29;
            }
            var33 -= var27;
            var23 += -var37;
            var37 -= var27;
            int var41 = arg4 + var16;
            int var42 = arg4 - var16;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var9;
                int var46 = arg1 - var9;
                class86.method614(arg0, -24891, var46, var44, class102.field1729[var42]);
                class86.method614(arg7, -24891, var45, var46, class102.field1729[var42]);
                class86.method614(arg0, -24891, var43, var45, class102.field1729[var42]);
                class86.method614(arg0, -24891, var46, var44, class102.field1729[var41]);
                class86.method614(arg7, -24891, var45, var46, class102.field1729[var41]);
                class86.method614(arg0, -24891, var43, var45, class102.field1729[var41]);
            } else {
                class86.method614(arg0, -24891, var43, var44, class102.field1729[var42]);
                class86.method614(arg0, -24891, var43, var44, class102.field1729[var41]);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLhk;)I", line = 209)
    public static final int method1157(byte arg0, class305 arg1) {
        field2421++;
        if (arg0 > -20) {
            method1157((byte) -24, (class305) null);
        }
        class208 var2 = arg1.field4778;
        if (var2.field3313 != null) {
            var2 = var2.method1518(-4841);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3301;
        class63 var4 = arg1.method640(-126);
        if (arg1.field1453 == var4.field970) {
            var3 = var2.field3323;
        } else if (arg1.field1453 == var4.field989 || arg1.field1453 == var4.field987 || arg1.field1453 == var4.field1004 || arg1.field1453 == var4.field974) {
            var3 = var2.field3338;
        } else if (arg1.field1453 == var4.field971 || arg1.field1453 == var4.field973 || arg1.field1453 == var4.field980 || arg1.field1453 == var4.field995) {
            var3 = var2.field3286;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZI)V", line = 251)
    public static final void method1158(int arg0, int arg1, boolean arg2, int arg3) {
        if (class191.field3064 != 0 && arg1 != 0 && class293.field4617 < 50 && arg0 != -1) {
            class320.field4991[class293.field4617] = arg0;
            class26.field429[class293.field4617] = arg1;
            class264.field4094[class293.field4617] = arg3;
            class40.field716[class293.field4617] = null;
            class71.field1115[class293.field4617] = 0;
            class293.field4617++;
        }
        if (arg2) {
            field2429 = 81;
        }
        field2420++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lja;Z)V", line = 277)
    public static final void method1159(class64 arg0, boolean arg1) {
        class261.field4048 = arg0.method487(false, "p11_full");
        class147.field2372 = arg0.method487(false, "p12_full");
        class176.field2767 = arg0.method487(false, "b12_full");
        field2428++;
        class62.field964 = arg0.method487(false, "mapfunction");
        class256.field3961 = arg0.method487(!arg1, "hitmarks");
        class278.field4300 = arg0.method487(false, "hitbar_default");
        class294.field4621 = arg0.method487(!arg1, "headicons_pk");
        class211.field3368 = arg0.method487(false, "headicons_prayer");
        class180.field2882 = arg0.method487(false, "hint_headicons");
        class292.field4502 = arg0.method487(false, "hint_mapmarkers");
        class17.field333 = arg0.method487(false, "mapflag");
        class326.field5063 = arg0.method487(false, "cross");
        class314.field4914 = arg0.method487(!arg1, "mapdots");
        class254.field3942 = arg0.method487(!arg1, "scrollbar");
        class256.field3965 = arg0.method487(!arg1, "name_icons");
        class260.field4034 = arg0.method487(false, "floorshadows");
        class217.field3483 = arg0.method487(false, "compass");
        class270.field4200 = arg0.method487(false, "hint_mapedge");
        if (!arg1) {
            method1160(-49);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 307)
    public static void method1160(int arg0) {
        field2426 = (int[][][]) null;
        field2425 = (byte[][]) null;
        field2427 = null;
        if (arg0 != 21197) {
            method1155(true);
        }
        field2434 = null;
        field2433 = (int[][]) null;
        field2430 = null;
        field2422 = null;
        field2432 = (byte[][][]) null;
    }
}
