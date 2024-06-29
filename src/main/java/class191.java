import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class191 extends class254 {

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lml;")
    public class116 field2715;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Ljd;")
    public class122 field2712;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Le;")
    public class137 field2730;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Loa;")
    public class252 field2724;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
    public static int[] field2727;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Z")
    public static final boolean method1225(int arg0, int arg1, int arg2) {
        int var3 = class280.field4466[arg0][arg1][arg2];
        if (-class242.field3649 == var3) {
            return false;
        } else if (class242.field3649 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (client.method1433(var4 + 1, class107.field1556[arg0][arg1][arg2], var5 + 1) && client.method1433(var4 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg2], var5 + 1) && client.method1433(var4 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && client.method1433(var4 + 1, class107.field1556[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class280.field4466[arg0][arg1][arg2] = class242.field3649;
                return true;
            } else {
                class280.field4466[arg0][arg1][arg2] = -class242.field3649;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method1226(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2734++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class263.field3962[var12][var31] = 0;
                class188.field2670[var12][var31] = 99999999;
            }
        }
        class263.field3962[arg8][arg4] = 99;
        int var13 = arg8;
        byte var14 = 0;
        int var15 = arg4;
        int var16 = 0;
        if (arg2 != 1644) {
            method1228(-68, 127, -66, 29, 73, -73, 8, 96, (class219) null, 91, false, -48L);
        }
        boolean var17 = false;
        class188.field2670[arg8][arg4] = 0;
        class51.field755[var14] = arg8;
        int var32 = var14 + 1;
        class1.field19[var14] = arg4;
        int[][] var18 = class246.field3681[class163.field2364].field1319;
        while (var32 != var16) {
            var13 = class51.field755[var16];
            var15 = class1.field19[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg3 == var13 && arg9 == var15) {
                var17 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class246.field3681[class163.field2364].method574(arg1, arg3, 2, arg9, 19661088, arg7 - 1, var13, var15)) {
                    var17 = true;
                    break;
                }
                if (arg7 < 10 && class246.field3681[class163.field2364].method586(var13, 2, arg1, arg9, var15, arg7 - 1, 7956, arg3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg5 != 0 && class246.field3681[class163.field2364].method591(var15, arg3, 0, var13, arg11, arg9, arg5, arg10, 2)) {
                var17 = true;
                break;
            }
            int var30 = class188.field2670[var13][var15] + 1;
            if (var13 > 0 && class263.field3962[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 1] & 0x12C0138) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class263.field3962[var13 - 1][var15] = 2;
                class188.field2670[var13 - 1][var15] = var30;
            }
            if (var13 < 102 && class263.field3962[var13 + 1][var15] == 0 && (var18[var13 + 2][var15] & 0x12C0183) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class263.field3962[var13 + 1][var15] = 8;
                class188.field2670[var13 + 1][var15] = var30;
            }
            if (var15 > 0 && class263.field3962[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var15 - 1] & 0x12C0183) == 0) {
                class51.field755[var32] = var13;
                class1.field19[var32] = var15 - 1;
                class263.field3962[var13][var15 - 1] = 1;
                class188.field2670[var13][var15 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class263.field3962[var13][var15 + 1] == 0 && (var18[var13][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class51.field755[var32] = var13;
                class1.field19[var32] = var15 + 1;
                class263.field3962[var13][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class188.field2670[var13][var15 + 1] = var30;
            }
            if (var13 > 0 && var15 > 0 && class263.field3962[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15] & 0x12C0138) == 0 && (var18[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13][var15 - 1] & 0x12C0183) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class263.field3962[var13 - 1][var15 - 1] = 3;
                class188.field2670[var13 - 1][var15 - 1] = var30;
            }
            if (var13 < 102 && var15 > 0 && class263.field3962[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var15 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var15] & 0x12C01E0) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var15 - 1;
                class263.field3962[var13 + 1][var15 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class188.field2670[var13 + 1][var15 - 1] = var30;
            }
            if (var13 > 0 && var15 < 102 && class263.field3962[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13][var15 + 2] & 0x12C01E0) == 0) {
                class51.field755[var32] = var13 - 1;
                class1.field19[var32] = var15 + 1;
                class263.field3962[var13 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class188.field2670[var13 - 1][var15 + 1] = var30;
            }
            if (var13 < 102 && var15 < 102 && class263.field3962[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var15 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C0183) == 0) {
                class51.field755[var32] = var13 + 1;
                class1.field19[var32] = var15 + 1;
                class263.field3962[var13 + 1][var15 + 1] = 12;
                class188.field2670[var13 + 1][var15 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class231.field3455 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            byte var20 = 10;
            int var21 = 1000;
            for (int var22 = arg3 - var20; var22 <= arg3 + var20; var22++) {
                for (int var23 = arg9 - var20; var23 <= (arg9 + var20); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class188.field2670[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg3 > var22) {
                            var24 = arg3 - var22;
                        } else if (arg3 + arg11 - 1 < var22) {
                            var24 = var22 + 1 - arg3 - arg11;
                        }
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (var23 > arg9 + arg5 - 1) {
                            var25 = var23 + 1 - (arg5 + arg9);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var21 || var21 == var26 && var19 > class188.field2670[var22][var23]) {
                            var13 = var22;
                            var21 = var26;
                            var19 = class188.field2670[var22][var23];
                            var15 = var23;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg4 == var15) {
                return false;
            }
            class231.field3455 = 1;
        }
        byte var27 = 0;
        class51.field755[var27] = var13;
        int var33 = var27 + 1;
        class1.field19[var27] = var15;
        int var28;
        int var29 = var28 = class263.field3962[var13][var15];
        while (arg8 != var13 || arg4 != var15) {
            if (var28 != var29) {
                var28 = var29;
                class51.field755[var33] = var13;
                class1.field19[var33++] = var15;
            }
            if ((var29 & 0x1) != 0) {
                var15++;
            } else if ((var29 & 0x4) != 0) {
                var15--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class263.field3962[var13][var15];
        }
        if (var33 > 0) {
            class194.method1242(arg6, 25, var33);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field2727 = null;
        int var1 = -84 % ((56 - arg0) / 48);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIILtk;IZJ)Z")
    public static final boolean method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class219 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class110.field1587 == class107.field1556;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class90.field1372 || var24 >= class225.field3383) {
                    return false;
                }
                class131 var25 = class16.field233[arg0][var15][var24];
                if (var25 != null && var25.field1926 >= 5) {
                    return false;
                }
            }
        }
        class162 var16 = new class162();
        var16.field2350 = arg11;
        var16.field2358 = arg0;
        var16.field2351 = arg5;
        var16.field2343 = arg6;
        var16.field2361 = arg7;
        var16.field2348 = arg8;
        var16.field2337 = arg9;
        var16.field2353 = arg1;
        var16.field2357 = arg2;
        var16.field2362 = arg1 + arg3 - 1;
        var16.field2340 = arg2 + arg4 - 1;
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
                    if (class16.field233[var22][var17][var20] == null) {
                        class16.field233[var22][var17][var20] = new class131(var22, var17, var20);
                    }
                }
                class131 var23 = class16.field233[arg0][var17][var20];
                var23.field1908[var23.field1926] = var16;
                var23.field1927[var23.field1926] = var21;
                var23.field1932 |= var21;
                var23.field1926++;
                if (var13 && class86.field1335[var17][var20] != 0) {
                    var14 = class86.field1335[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class86.field1335[var18][var19] == 0) {
                        class86.field1335[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class268.field4197[class158.field2288++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
    public final void method1229(boolean arg0) {
        if (!arg0) {
            this.method1229(true);
        }
        this.field2715 = null;
        this.field2724 = null;
        this.field2712 = null;
        field2710++;
        this.field2730 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLde;)V")
    public static final void method1230(byte arg0, class53 arg1) {
        field2714++;
        class30 var2 = (class30) class124.field1801.method1218(class109.method712((byte) 60, arg1.field766), -111);
        if (var2 == null) {
            class276.method1861((class250) null, 89, arg1, arg1.field50[0], 0, class163.field2364, arg1.field119[0], (class72) null);
        } else {
            var2.method215((byte) -121);
        }
        if (arg0 > -45) {
            method1226(true, 116, -128, -2, -113, -30, -112, -44, 57, -119, -44, -98);
        }
    }
}
