import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Z")
    public static boolean field434 = true;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lcc;")
    public static class209 field432 = class95.method669(85, ":duelstake:");

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lib;")
    public static class153 field435 = null;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lsj;")
    public static class49 field428;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public static int[] field426;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLsj;I)[Lsb;")
    public static final class224[] method192(int arg0, boolean arg1, class49 arg2, int arg3) {
        if (arg1) {
            method193(83, -58, -49, 18, 45, -114, -113, -53, (class126) null, -69, false, 78L);
        }
        field436++;
        return class117.method833(arg3, arg2, 896, arg0) ? class102.method703(-111) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIILpb;IZJ)Z")
    public static final boolean method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class126 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class284.field4996 == class271.field4803;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class56.field1154 || var24 >= class277.field4879) {
                    return false;
                }
                class109 var25 = class106.field2089[arg0][var15][var24];
                if (var25 != null && var25.field2203 >= 5) {
                    return false;
                }
            }
        }
        class264 var16 = new class264();
        var16.field4733 = arg11;
        var16.field4749 = arg0;
        var16.field4734 = arg5;
        var16.field4740 = arg6;
        var16.field4743 = arg7;
        var16.field4735 = arg8;
        var16.field4736 = arg9;
        var16.field4746 = arg1;
        var16.field4741 = arg2;
        var16.field4747 = arg1 + arg3 - 1;
        var16.field4731 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class106.field2089[var22][var17][var20] == null) {
                        class106.field2089[var22][var17][var20] = new class109(var22, var17, var20);
                    }
                }
                class109 var23 = class106.field2089[arg0][var17][var20];
                var23.field2189[var23.field2203] = var16;
                var23.field2194[var23.field2203] = var21;
                var23.field2199 |= var21;
                var23.field2203++;
                if (var13 && class90.field1802[var17][var20] != 0) {
                    var14 = class90.field1802[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class90.field1802[var18][var19] == 0) {
                        class90.field1802[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class122.field2410[class228.field4159++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method194(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field430++;
        for (int var9 = 0; var9 < class134.field2548.field3036; var9++) {
            int var10 = class134.field2548.field3031[var9] - class38.field654;
            int var11 = (arg4 - arg3) * (var10 - arg8) / (arg0 - arg8) + arg3;
            int var12 = class224.field4082 + class98.field1921 - class134.field2548.field3035[var9] - 1;
            int var13 = class134.field2548.method1154(var9, 3);
            int var14 = (var12 - arg5) * (arg7 - arg2) / (arg6 - arg5) + arg2;
            class139 var15 = null;
            if (var13 == 0) {
                if ((double) class116.field2324 == 3.0D) {
                    var15 = class197.field3538;
                }
                if ((double) class116.field2324 == 4.0D) {
                    var15 = class115.field2320;
                }
                if ((double) class116.field2324 == 6.0D) {
                    var15 = class69.field1314;
                }
                if ((double) class116.field2324 == 8.0D) {
                    var15 = class172.field3143;
                }
            }
            if (var13 == 1) {
                if ((double) class116.field2324 == 3.0D) {
                    var15 = class69.field1314;
                }
                if ((double) class116.field2324 == 4.0D) {
                    var15 = class172.field3143;
                }
                if ((double) class116.field2324 == 6.0D) {
                    var15 = class155.field2842;
                }
                if ((double) class116.field2324 == 8.0D) {
                    var15 = class145.field2672;
                }
            }
            int var16 = 16777215;
            if (var13 == 2) {
                var16 = 16755200;
                if ((double) class116.field2324 == 3.0D) {
                    var15 = class155.field2842;
                }
                if ((double) class116.field2324 == 4.0D) {
                    var15 = class145.field2672;
                }
                if ((double) class116.field2324 == 6.0D) {
                    var15 = class108.field2173;
                }
                if ((double) class116.field2324 == 8.0D) {
                    var15 = class237.field4281;
                }
            }
            if (class134.field2548.field3029[var9] != -1) {
                var16 = class134.field2548.field3029[var9];
            }
            if (var15 != null) {
                class209[] var17 = new class209[class134.field2548.field3032[var9].method1481(60, 32381) + 1];
                class66.field1270.method1287(class134.field2548.field3032[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 - 1) * var15.method967() / 2;
                int var20 = var19 + var15.method970() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class209 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1466(124, var17[var21].method1486(5) - 4, 0);
                    var15.method972(var22, var11, var20, var16, true);
                    var20 += var15.method967();
                }
            }
        }
        if (arg1) {
            method193(-110, -26, 48, 97, 43, -113, -41, 13, (class126) null, -92, true, 71L);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZ)V")
    public static final void method195(boolean arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class10.field202;
        int var4 = var3.length;
        field433++;
        if (arg1) {
            method198(114, 109, 94, -38, (class126) null, (class126) null, 55, -33, 112, -71, -38L);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class47.field913[var5] >> 8) * 64 - class174.field3178;
            byte[] var12 = var3[var5];
            int var13 = (class47.field913[var5] & 0xFF) * 64 - class245.field4444;
            if (var12 != null) {
                class117.method831(-413981948);
                class229.method1603((class220.field4005 - 6) * 8, class122.field2404, 0, var12, class31.field568 * 8 - 48, var11, arg0, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class47.field913[var6] >> 8) * 64 - class174.field3178;
            int var8 = (class47.field913[var6] & 0xFF) * 64 - class245.field4444;
            byte[] var9 = var3[var6];
            if (var9 == null && class31.field568 < 800) {
                class117.method831(-413981948);
                for (int var10 = 0; var10 < var2; var10++) {
                    class80.method565(0, 64, 64, var10, var7, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILtf;)Lvk;")
    public static final class35 method196(int arg0, class106 arg1) {
        field429++;
        return arg0 >= -54 ? null : new class35(arg1.method738(255), arg1.method738(255), arg1.method738(255), arg1.method738(255), arg1.method776(125), arg1.method776(125), arg1.method774((byte) 88));
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method197(byte arg0) {
        field432 = null;
        if (arg0 <= 26) {
            method198(-64, 98, -7, -127, (class126) null, (class126) null, -112, 54, -82, -7, 4L);
        }
        field428 = null;
        field426 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILpb;Lpb;IIIIJ)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3, class126 arg4, class126 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class181 var12 = new class181();
        var12.field3270 = arg10;
        var12.field3266 = arg1 * 128 + 64;
        var12.field3280 = arg2 * 128 + 64;
        var12.field3274 = arg3;
        var12.field3269 = arg4;
        var12.field3265 = arg5;
        var12.field3275 = arg6;
        var12.field3277 = arg7;
        var12.field3281 = arg8;
        var12.field3262 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class106.field2089[var13][arg1][arg2] == null) {
                class106.field2089[var13][arg1][arg2] = new class109(var13, arg1, arg2);
            }
        }
        class106.field2089[arg0][arg1][arg2].field2218 = var12;
    }
}
