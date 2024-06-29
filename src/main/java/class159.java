import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class159 extends class114 {

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "Lia;")
    public static class257 field2791 = class28.method234(88, "Benutzen");

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Loa;")
    public static class9 field2790 = class21.method181((byte) 63);

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lia;")
    public class257 field2784;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "[I")
    public int[] field2788;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "[I")
    public int[] field2792;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "[I")
    public int[] field2798;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "[I")
    public int[] field2799;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "[[[I")
    public static int[][][] field2793;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)I")
    public static final int method1105(int arg0, int arg1, int arg2) {
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        if (arg1 >= -25) {
            field2786 = 9;
        }
        field2795++;
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lk;II)V")
    private final void method1106(class152 arg0, int arg1, int arg2) {
        if (arg1 != 16362) {
            return;
        }
        field2785++;
        if (arg2 == 1) {
            this.field2784 = arg0.method1039(1995);
        } else if (arg2 == 2) {
            int var4 = arg0.method1051((byte) -97);
            this.field2799 = new int[var4];
            this.field2798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2799[var5] = arg0.method1063(-17162);
                int var6 = arg0.method1051((byte) 120);
                if (var6 == 0) {
                    this.field2798[var5] = -1;
                } else {
                    this.field2798[var5] = var6;
                }
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg0.method1051((byte) -85);
            this.field2788 = new int[var7];
            this.field2792 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2792[var8] = arg0.method1063(-17162);
                int var9 = arg0.method1051((byte) 105);
                if (var9 == 0) {
                    this.field2788[var8] = -1;
                } else {
                    this.field2788[var8] = var9;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLk;)V")
    public final void method1107(byte arg0, class152 arg1) {
        field2801++;
        while (true) {
            int var3 = arg1.method1051((byte) 105);
            if (var3 == 0) {
                if (arg0 == 106) {
                    return;
                } else {
                    field2791 = null;
                    return;
                }
            }
            this.method1106(arg1, 16362, var3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)I")
    public final int method1108(int arg0, byte arg1) {
        field2787++;
        if (this.field2799 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2799.length; var3++) {
            if (this.field2798[var3] == arg0) {
                return this.field2799[var3];
            }
        }
        if (arg1 != 59) {
            field2789 = -58;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)Lia;")
    public static final class257 method1109(int arg0, int arg1, int arg2) {
        field2800++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class248.field4271;
        } else if (var3 < -6) {
            return class105.field1945;
        } else if (var3 < -3) {
            return class219.field3707;
        } else if (var3 < 0) {
            return class185.field3214;
        } else if (var3 > 9) {
            return class238.field4090;
        } else if (var3 > 6) {
            return class24.field472;
        } else if (arg1 < var3) {
            return class20.field424;
        } else if (var3 > 0) {
            return class62.field1279;
        } else {
            return class79.field1555;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method1110(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class92.field1750[var12][var31] = 0;
                class137.field2443[var12][var31] = 99999999;
            }
        }
        field2802++;
        int var13 = arg9;
        int var14 = arg5;
        class92.field1750[arg9][arg5] = 99;
        int var15 = 0;
        class137.field2443[arg9][arg5] = 0;
        boolean var16 = false;
        byte var17 = 0;
        class36.field718[var17] = arg9;
        int var32 = var17 + 1;
        class80.field1565[var17] = arg5;
        int[][] var18 = class173.field2961[class189.field3261].field4075;
        while (var15 != var32) {
            var14 = class80.field1565[var15];
            var13 = class36.field718[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg6 == var13 && arg2 == var14) {
                var16 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class173.field2961[class189.field3261].method1571(var13, arg2, (byte) 66, arg3 - 1, arg7, 2, var14, arg6)) {
                    var16 = true;
                    break;
                }
                if (arg3 < 10 && class173.field2961[class189.field3261].method1561(var14, arg3 - 1, var13, arg2, arg6, 2, (byte) 122, arg7)) {
                    var16 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg10 != 0 && class173.field2961[class189.field3261].method1562(var14, var13, 2, arg6, arg1, -44, arg2, arg10, arg11)) {
                var16 = true;
                break;
            }
            int var30 = class137.field2443[var13][var14] + 1;
            if (var13 > 0 && class92.field1750[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class36.field718[var32] = var13 - 1;
                class80.field1565[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class92.field1750[var13 - 1][var14] = 2;
                class137.field2443[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class92.field1750[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class36.field718[var32] = var13 + 1;
                class80.field1565[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class92.field1750[var13 + 1][var14] = 8;
                class137.field2443[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class92.field1750[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class36.field718[var32] = var13;
                class80.field1565[var32] = var14 - 1;
                class92.field1750[var13][var14 - 1] = 1;
                class137.field2443[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class92.field1750[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class36.field718[var32] = var13;
                class80.field1565[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class92.field1750[var13][var14 + 1] = 4;
                class137.field2443[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class92.field1750[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class36.field718[var32] = var13 - 1;
                class80.field1565[var32] = var14 - 1;
                class92.field1750[var13 - 1][var14 - 1] = 3;
                class137.field2443[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class92.field1750[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class36.field718[var32] = var13 + 1;
                class80.field1565[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class92.field1750[var13 + 1][var14 - 1] = 9;
                class137.field2443[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class92.field1750[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class36.field718[var32] = var13 - 1;
                class80.field1565[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class92.field1750[var13 - 1][var14 + 1] = 6;
                class137.field2443[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class92.field1750[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class36.field718[var32] = var13 + 1;
                class80.field1565[var32] = var14 + 1;
                class92.field1750[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class137.field2443[var13 + 1][var14 + 1] = var30;
            }
        }
        class71.field1392 = 0;
        if (!var16) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg6 - var21; var22 <= arg6 + var21; var22++) {
                for (int var23 = arg2 - var21; var23 <= arg2 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class137.field2443[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg6 > var22) {
                            var24 = arg6 - var22;
                        } else if (var22 > (arg1 + arg6 - 1)) {
                            var24 = var22 + 1 - arg6 - arg1;
                        }
                        int var25 = 0;
                        if (var23 < arg2) {
                            var25 = arg2 - var23;
                        } else if (var23 > (arg2 + arg10 - 1)) {
                            var25 = var23 + 1 - arg2 - arg10;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var20 || var20 == var26 && class137.field2443[var22][var23] < var19) {
                            var13 = var22;
                            var20 = var26;
                            var19 = class137.field2443[var22][var23];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var13 && arg5 == var14) {
                return false;
            }
            class71.field1392 = 1;
        }
        byte var27 = 0;
        class36.field718[var27] = var13;
        int var33 = var27 + 1;
        class80.field1565[var27] = var14;
        int var28;
        int var29 = var28 = class92.field1750[var13][var14];
        while (arg9 != var13 || arg5 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class36.field718[var33] = var13;
                class80.field1565[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class92.field1750[var13][var14];
        }
        if (arg8 > ~var33) {
            class70.method530(arg4, true, var33);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)I")
    public final int method1111(byte arg0, int arg1) {
        field2796++;
        if (this.field2792 == null) {
            return -1;
        }
        int var3 = -14 % ((arg0 + 28) / 47);
        for (int var4 = 0; var4 < this.field2792.length; var4++) {
            if (this.field2788[var4] == arg1) {
                return this.field2792[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final void method1112(int arg0) {
        if (arg0 > -96) {
            field2789 = 63;
        }
        field2797++;
        if (this.field2792 != null) {
            for (int var2 = 0; var2 < this.field2792.length; var2++) {
                this.field2792[var2] = class198.method1332(this.field2792[var2], 32768);
            }
        }
        if (this.field2799 != null) {
            for (int var3 = 0; var3 < this.field2799.length; var3++) {
                this.field2799[var3] = class198.method1332(this.field2799[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2790 = null;
        if (arg0 <= 104) {
            field2786 = -107;
        }
        field2793 = null;
        field2791 = null;
    }
}
