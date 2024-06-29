import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class54 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field868 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lsb;")
    public static class98 field869 = class47.method368("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "D")
    public static double field870 = -1.0D;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[Ljd;")
    public static class74[] field872 = new class74[500];

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lvf;")
    public static class48 field871 = new class48();

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lbf;B)V")
    public static final void method398(class185 arg0, byte arg1) {
        field863++;
        class158.method1143(false);
        if (class252.field4416 != null) {
            return;
        }
        if (arg1 <= 6) {
            method399((byte) 30);
        }
        if (!class99.field1744) {
            class156.method1134(28517);
        } else if (class48.field810 == 1) {
            int var2 = class146.field2563 / 5;
            int var3 = class106.field1908 + var2 + 140;
            if (class139.field2471 >= var3 && var3 + 14 >= class139.field2471 && class245.field4256 + 4 <= class250.field4384 && class245.field4256 + 18 >= class250.field4384) {
                class62.method453(0, 0, 0);
                return;
            }
            if (class139.field2471 >= var3 + 15 && class139.field2471 <= var3 + 80 && class245.field4256 + 4 <= class250.field4384 && class250.field4384 <= class245.field4256 + 18) {
                class62.method453(1, 0, 0);
                return;
            }
            int var4 = class106.field1908 + var2 + 250;
            if (var4 <= class139.field2471 && class139.field2471 <= var4 + 14 && class245.field4256 + 4 <= class250.field4384 && (class245.field4256 + 18) >= class250.field4384) {
                class62.method453(0, 1, 0);
                return;
            }
            if (class139.field2471 >= (var4 + 15) && var4 + 80 >= class139.field2471 && class245.field4256 + 4 <= class250.field4384 && class250.field4384 <= class245.field4256 + 18) {
                class62.method453(1, 1, 0);
                return;
            }
            int var5 = var2 + class106.field1908 + 360;
            if (class139.field2471 >= var5 && class139.field2471 <= (var5 + 14) && class250.field4384 >= class245.field4256 + 4 && class250.field4384 <= class245.field4256 + 18) {
                class62.method453(0, 2, 0);
                return;
            }
            if ((var5 + 15) <= class139.field2471 && class139.field2471 <= (var5 + 80) && class250.field4384 >= class245.field4256 + 4 && (class245.field4256 + 18) >= class250.field4384) {
                class62.method453(1, 2, 0);
                return;
            }
            int var6 = class106.field1908 + var2 + 470;
            if (class139.field2471 >= var6 && (var6 + 14) >= class139.field2471 && class250.field4384 >= class245.field4256 + 4 && class250.field4384 <= (class245.field4256 + 18)) {
                class62.method453(0, 3, 0);
                return;
            }
            if (class139.field2471 >= (var6 + 15) && (var6 + 80) >= class139.field2471 && (class245.field4256 + 4) <= class250.field4384 && class250.field4384 <= class245.field4256 + 18) {
                class62.method453(1, 3, 0);
                return;
            }
            if (class10.field219 != -1) {
                class189 var7 = class229.field3947[class10.field219];
                if (class119.field2139 == var7.field3269) {
                    byte[] var8 = class186.method1288(new class98[] { var7.field3273, class216.field3694 }, 31618).method725(false);
                    class85.field1507 = new String(var8, 0, var8.length);
                    class85.field1502 = var7.field3276;
                    if (class132.field2346 != 0) {
                        class188.field3235 = class85.field1502 + 50000;
                        class156.field2848 = class85.field1502 + 40000;
                        class236.field4076 = class156.field2848;
                    }
                    if (class229.field3941 != null) {
                        class229.field3941.field2620 = true;
                        class72.method512(class229.field3941, 2);
                    }
                    return;
                }
                class98 var9 = class68.field1096;
                if (class132.field2346 != 0) {
                    var9 = class186.method1288(new class98[] { class244.field4249, class125.method930(25904, var7.field3276 + 7000) }, 31618);
                }
                class98 var10 = class186.method1288(new class98[] { class202.field3441, var7.field3273, class216.field3694, var9, class79.field1407, class125.method930(25904, class76.field1355), class114.field2035, class125.method930(25904, class184.field3166), class124.field2244, class125.method930(25904, 0), class56.field883, class125.method930(25904, class151.field2777), class242.field4198, class125.method930(25904, class124.field2252) }, 31618);
                try {
                    arg0.getAppletContext().showDocument(var10.method735(true), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method399(byte arg0) {
        field865++;
        class124 var1 = (class124) class64.field1048.method371((byte) 61);
        if (arg0 != 86) {
            field871 = null;
        }
        while (var1 != null) {
            class76 var2 = var1.field2247;
            if (class265.field4640 != var2.field1333 || var2.field1370 < class236.field4071) {
                var1.method1611((byte) 31);
            } else if (var2.field1346 <= class236.field4071) {
                if (var2.field1351 > 0) {
                    class108 var3 = class180.field3109[var2.field1351 - 1];
                    if (var3 != null && var3.field4492 >= 0 && var3.field4492 < 13312 && var3.field4466 >= 0 && var3.field4466 < 13312) {
                        var2.method586(var3.field4492, var3.field4466, -96, class236.field4071, class70.method480(var2.field1333, (byte) 126, var3.field4492, var3.field4466) - var2.field1343);
                    }
                }
                if (var2.field1351 < 0) {
                    int var4 = -var2.field1351 - 1;
                    class192 var5;
                    if (class234.field4046 == var4) {
                        var5 = class163.field2943;
                    } else {
                        var5 = class141.field2499[var4];
                    }
                    if (var5 != null && var5.field4492 >= 0 && var5.field4492 < 13312 && var5.field4466 >= 0 && var5.field4466 < 13312) {
                        var2.method586(var5.field4492, var5.field4466, -97, class236.field4071, class70.method480(var2.field1333, (byte) 126, var5.field4492, var5.field4466) - var2.field1343);
                    }
                }
                var2.method581(class199.field3418, -24318);
                class191.method1319(class265.field4640, (int) var2.field1354, (int) var2.field1350, (int) var2.field1344, 60, var2, var2.field1371, -1L, false);
            }
            var1 = (class124) class64.field1048.method370(true);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        field869 = null;
        field871 = null;
        field872 = null;
        field868 = null;
        if (arg0 != -1) {
            field869 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public static final boolean method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class230.field3970[var12][var31] = 0;
                class115.field2068[var12][var31] = 99999999;
            }
        }
        class230.field3970[arg1][arg5] = 99;
        field862++;
        class115.field2068[arg1][arg5] = 0;
        int var13 = arg1;
        int var14 = arg5;
        byte var15 = 0;
        int var16 = 0;
        boolean var17 = false;
        class205.field3508[var15] = arg1;
        int var32 = var15 + 1;
        class138.field2462[var15] = arg5;
        int[][] var18 = class110.field1961[class265.field4640].field1175;
        while (var32 != var16) {
            var13 = class205.field3508[var16];
            var14 = class138.field2462[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class110.field1961[class265.field4640].method510((byte) 114, var13, arg2, arg8, arg11, var14, 2, arg3 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class110.field1961[class265.field4640].method516(arg3 - 1, var13, var14, arg8, false, arg11, arg2, 2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg10 != 0 && class110.field1961[class265.field4640].method500(arg2, var13, arg0, arg11, arg9 + 6, 2, arg6, var14, arg10)) {
                var17 = true;
                break;
            }
            int var30 = class115.field2068[var13][var14] + 1;
            if (var13 > 0 && class230.field3970[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class205.field3508[var32] = var13 - 1;
                class138.field2462[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class230.field3970[var13 - 1][var14] = 2;
                class115.field2068[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class230.field3970[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class230.field3970[var13 + 1][var14] = 8;
                class115.field2068[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class230.field3970[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class205.field3508[var32] = var13;
                class138.field2462[var32] = var14 - 1;
                class230.field3970[var13][var14 - 1] = 1;
                class115.field2068[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class230.field3970[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class205.field3508[var32] = var13;
                class138.field2462[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class230.field3970[var13][var14 + 1] = 4;
                class115.field2068[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class230.field3970[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class205.field3508[var32] = var13 - 1;
                class138.field2462[var32] = var14 - 1;
                class230.field3970[var13 - 1][var14 - 1] = 3;
                class115.field2068[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class230.field3970[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class230.field3970[var13 + 1][var14 - 1] = 9;
                class115.field2068[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class230.field3970[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class205.field3508[var32] = var13 - 1;
                class138.field2462[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class230.field3970[var13 - 1][var14 + 1] = 6;
                class115.field2068[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class230.field3970[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var14 + 1;
                class230.field3970[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class115.field2068[var13 + 1][var14 + 1] = var30;
            }
        }
        class76.field1334 = 0;
        if (!var17) {
            if (!arg7) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg11 - var21; var22 <= (arg11 + var21); var22++) {
                for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class115.field2068[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg2 > var23) {
                            var24 = arg2 - var23;
                        } else if (var23 > (arg2 + arg10 - 1)) {
                            var24 = var23 - (arg10 - 1) - arg2;
                        }
                        int var25 = 0;
                        if (arg11 > var22) {
                            var25 = arg11 - var22;
                        } else if (arg0 + arg11 - 1 < var22) {
                            var25 = var22 + 1 - arg11 - arg0;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && class115.field2068[var22][var23] < var20) {
                            var19 = var26;
                            var14 = var23;
                            var20 = class115.field2068[var22][var23];
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg5 == var14) {
                return false;
            }
            class76.field1334 = 1;
        }
        byte var27 = 0;
        class205.field3508[var27] = var13;
        int var33 = var27 + 1;
        class138.field2462[var27] = var14;
        int var28;
        int var29 = var28 = class230.field3970[var13][var14];
        while (arg1 != var13 || arg5 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class205.field3508[var33] = var13;
                class138.field2462[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class230.field3970[var13][var14];
        }
        if (arg9 != 2) {
            field866 = -21;
        }
        if (var33 > 0) {
            class194.method1337(var33, arg4, 10615);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLtg;Lsb;)Lih;")
    public static final class252 method402(boolean arg0, class75 arg1, class98 arg2) {
        int var3 = arg1.method564(arg2, -14783);
        field867++;
        if (var3 == -1) {
            return new class252(0);
        }
        int[] var4 = arg1.method554(0, var3);
        class252 var5 = new class252(var4.length);
        for (int var6 = 0; var6 < var5.field4409; var6++) {
            class216 var7 = new class216(arg1.method571(var3, var4[var6], -92));
            var5.field4413[var6] = var7.method1445(-3);
            var5.field4404[var6] = var7.method1472(80);
            var5.field4412[var6] = (short) var7.method1487(56);
            var5.field4403[var6] = (short) var7.method1487(122);
            var5.field4405[var6] = var7.method1442(-1330139880);
        }
        if (arg0) {
            field864 = -80;
        }
        return var5;
    }
}
