import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class279 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "J")
    public static long field4982 = 0L;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lcf;")
    public static class93 field4986 = class147.method1066("Hidden)2use", -48);

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lcf;")
    public static class93 field4985 = class147.method1066("Atteindre", -48);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    public static int[] field4984 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lcf;")
    public static class93 field4990 = class147.method1066("Polices charg-Bes", -48);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
    public static int[] field4987;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Luf;")
    public static final class173 method1865(byte arg0) {
        field4983++;
        class173 var1 = new class173(class153.field2693, class226.field4044, class169.field2974[0], class67.field1230[0], class246.field4435[0], class42.field663[0], class255.field4614[0], class248.field4475);
        if (arg0 == 117) {
            class50.method276((byte) 120);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
    public static final void method1866(int arg0, int arg1, int arg2, int arg3) {
        field4989++;
        if (~class267.field4756 == arg3 || arg1 == 0 || class272.field4839 >= 50 || arg0 == -1) {
            return;
        }
        class283.field5075[class272.field4839] = arg0;
        class131.field2319[class272.field4839] = arg1;
        class53.field860[class272.field4839] = arg2;
        class212.field3882[class272.field4839] = null;
        class4.field44[class272.field4839] = 0;
        class272.field4839++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIIIIIIIIZ)Z")
    public static final boolean method1867(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class74.field1372[var12][var31] = 0;
                class124.field2202[var12][var31] = 99999999;
            }
        }
        field4988++;
        class74.field1372[arg8][arg10] = 99;
        class124.field2202[arg8][arg10] = 0;
        int var13 = arg8;
        int var14 = arg10;
        int var15 = 0;
        if (arg2 != 89) {
            field4987 = null;
        }
        byte var16 = 0;
        class163.field2878[var16] = arg8;
        boolean var17 = false;
        int var32 = var16 + 1;
        class101.field1759[var16] = arg10;
        int[][] var18 = class148.field2605[class138.field2405].field1769;
        while (var15 != var32) {
            var14 = class101.field1759[var15];
            var13 = class163.field2878[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg4 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class148.field2605[class138.field2405].method744(arg1 - 1, arg4, arg2 + 33, 2, arg3, var13, arg0, var14)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class148.field2605[class138.field2405].method736(arg4, var13, arg1 - 1, 2, arg0, arg3, (byte) 117, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg5 != 0 && class148.field2605[class138.field2405].method737(2, arg4, 124, var13, arg7, arg5, arg9, arg3, var14)) {
                var17 = true;
                break;
            }
            int var30 = class124.field2202[var13][var14] + 1;
            if (var13 > 0 && class74.field1372[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class163.field2878[var32] = var13 - 1;
                class101.field1759[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1372[var13 - 1][var14] = 2;
                class124.field2202[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class74.field1372[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class163.field2878[var32] = var13 + 1;
                class101.field1759[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1372[var13 + 1][var14] = 8;
                class124.field2202[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class74.field1372[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class163.field2878[var32] = var13;
                class101.field1759[var32] = var14 - 1;
                class74.field1372[var13][var14 - 1] = 1;
                class124.field2202[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class74.field1372[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class163.field2878[var32] = var13;
                class101.field1759[var32] = var14 + 1;
                class74.field1372[var13][var14 + 1] = 4;
                class124.field2202[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class74.field1372[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class163.field2878[var32] = var13 - 1;
                class101.field1759[var32] = var14 - 1;
                class74.field1372[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class124.field2202[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class74.field1372[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class163.field2878[var32] = var13 + 1;
                class101.field1759[var32] = var14 - 1;
                class74.field1372[var13 + 1][var14 - 1] = 9;
                class124.field2202[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class74.field1372[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class163.field2878[var32] = var13 - 1;
                class101.field1759[var32] = var14 + 1;
                class74.field1372[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class124.field2202[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class74.field1372[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class163.field2878[var32] = var13 + 1;
                class101.field1759[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1372[var13 + 1][var14 + 1] = 12;
                class124.field2202[var13 + 1][var14 + 1] = var30;
            }
        }
        class147.field2587 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= arg4 + var21; var22++) {
                for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class124.field2202[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg3 > var23) {
                            var25 = arg3 - var23;
                        } else if (var23 > (arg3 + arg5 - 1)) {
                            var25 = var23 + 1 - arg3 - arg5;
                        }
                        if (var22 < arg4) {
                            var24 = arg4 - var22;
                        } else if (arg4 + arg7 - 1 < var22) {
                            var24 = var22 + 1 - arg7 - arg4;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class124.field2202[var22][var23] < var20) {
                            var20 = class124.field2202[var22][var23];
                            var19 = var26;
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg10 == var14) {
                return false;
            }
            class147.field2587 = 1;
        }
        byte var27 = 0;
        class163.field2878[var27] = var13;
        int var33 = var27 + 1;
        class101.field1759[var27] = var14;
        int var28;
        int var29 = var28 = class74.field1372[var13][var14];
        while (arg8 != var13 || arg10 != var14) {
            if (var28 != var29) {
                class163.field2878[var33] = var13;
                class101.field1759[var33++] = var14;
                var28 = var29;
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
            var29 = class74.field1372[var13][var14];
        }
        if (var33 > 0) {
            class41.method232((byte) 63, var33, arg6);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lgl;IIIII)V")
    public static final void method1868(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class170.field3002 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class210.field3821) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class256.field4623 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class41 var14 = class232.field4138[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class233.field4151[var11][var12 + 1][var13] + class233.field4151[var11][var12][var13] + class233.field4151[var11][var12][var13 + 1] + class233.field4151[var11][var12 + 1][var13 + 1]) / 4 - (class233.field4151[arg1][arg2 + 1][arg3] + class233.field4151[arg1][arg2][arg3] + class233.field4151[arg1][arg2][arg3 + 1] + class233.field4151[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class70 var16 = var14.field643;
                                    if (var16 != null) {
                                        if (var16.field1269.method444()) {
                                            arg0.method432(var16.field1269, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1274 != null && var16.field1274.method444()) {
                                            arg0.method432(var16.field1274, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field645; var17++) {
                                        class229 var18 = var14.field637[var17];
                                        if (var18 != null && var18.field4104.method444() && (var18.field4095 == var12 || var7 == var12) && (var18.field4099 == var13 || var9 == var13)) {
                                            int var19 = var18.field4100 + 1 - var18.field4095;
                                            int var20 = var18.field4110 + 1 - var18.field4099;
                                            arg0.method432(var18.field4104, (var18.field4095 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4099 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1869(byte arg0) {
        field4987 = null;
        field4990 = null;
        int var1 = 99 / ((82 - arg0) / 37);
        field4984 = null;
        field4985 = null;
        field4986 = null;
    }
}
