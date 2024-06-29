import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class105 extends class95 {

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lac;")
    private final class165 field1827;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lue;")
    public final class15 field1815;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Lwf;")
    public static class59 field1814;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "[[[I")
    public static int[][][] field1819;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLik;)Lwf;", line = 9)
    public static final class59 method719(int arg0, boolean arg1, class262 arg2) {
        field1821++;
        if (!arg1) {
            field1817 = 17;
        }
        return class25.method168(-12, arg2, arg0) ? class156.method1090(false) : null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 39)
    public static void method720(int arg0) {
        field1814 = null;
        if (arg0 == 0) {
            field1819 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 55)
    public static final boolean method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class83.field1280[var12][var13] = 0;
                class324.field5523[var12][var13] = 99999999;
            }
        }
        field1826++;
        class83.field1280[arg4][arg1] = 99;
        class324.field5523[arg4][arg1] = 0;
        int var14 = arg4;
        int var15 = arg1;
        int var16 = 0;
        byte var17 = 0;
        class5.field66[var17] = arg4;
        int var32 = var17 + 1;
        class26.field405[var17] = arg1;
        if (arg8 != -1) {
            field1825 = 96;
        }
        boolean var18 = false;
        int[][] var19 = class330.field5644[class295.field5159].field5605;
        while (var16 != var32) {
            var15 = class26.field405[var16];
            var14 = class5.field66[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var14 && arg5 == var15) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class330.field5644[class295.field5159].method2249(arg5, 1, arg6, arg9, var15, 1, var14, arg2 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class330.field5644[class295.field5159].method2236(arg6, arg5, arg2 - 1, -1, arg9, var15, 1, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg11 != 0 && class330.field5644[class295.field5159].method2237(arg0, var14, arg11, arg6, arg10, var15, (byte) -107, 1, arg5)) {
                var18 = true;
                break;
            }
            int var20 = class324.field5523[var14][var15] + 1;
            if (var14 > 0 && class83.field1280[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class5.field66[var32] = var14 - 1;
                class26.field405[var32] = var15;
                class83.field1280[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class324.field5523[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class83.field1280[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class5.field66[var32] = var14 + 1;
                class26.field405[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var14 + 1][var15] = 8;
                class324.field5523[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class83.field1280[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class5.field66[var32] = var14;
                class26.field405[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var14][var15 - 1] = 1;
                class324.field5523[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class83.field1280[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class5.field66[var32] = var14;
                class26.field405[var32] = var15 + 1;
                class83.field1280[var14][var15 + 1] = 4;
                class324.field5523[var14][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class83.field1280[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class5.field66[var32] = var14 - 1;
                class26.field405[var32] = var15 - 1;
                class83.field1280[var14 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class324.field5523[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class83.field1280[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class5.field66[var32] = var14 + 1;
                class26.field405[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var14 + 1][var15 - 1] = 9;
                class324.field5523[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class83.field1280[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class5.field66[var32] = var14 - 1;
                class26.field405[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class83.field1280[var14 - 1][var15 + 1] = 6;
                class324.field5523[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class83.field1280[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class5.field66[var32] = var14 + 1;
                class26.field405[var32] = var15 + 1;
                class83.field1280[var14 + 1][var15 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class324.field5523[var14 + 1][var15 + 1] = var20;
            }
        }
        class84.field1328 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= arg6 + var23; var24++) {
                for (int var25 = arg5 - var23; var25 <= (arg5 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class324.field5523[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg6 - (1 - arg0)) {
                            var26 = var24 + 1 - arg0 - arg6;
                        }
                        if (var25 < arg5) {
                            var27 = arg5 - var25;
                        } else if ((arg11 + arg5 - 1) < var25) {
                            var27 = var25 + 1 - (arg5 + arg11);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class324.field5523[var24][var25]) {
                            var21 = var28;
                            var22 = class324.field5523[var24][var25];
                            var14 = var24;
                            var15 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg1 == var15) {
                return false;
            }
            class84.field1328 = 1;
        }
        byte var29 = 0;
        class5.field66[var29] = var14;
        int var33 = var29 + 1;
        class26.field405[var29] = var15;
        int var30;
        int var31 = var30 = class83.field1280[var14][var15];
        while (arg4 != var14 || arg1 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class5.field66[var33] = var14;
                class26.field405[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class83.field1280[var14][var15];
        }
        if (var33 > 0) {
            class255.method1798(var33, (byte) 124, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V", line = 344)
    public final void method722(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field1818 = arg0;
            this.field1828 = arg2;
            this.field1816 = arg3;
            field1822++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I", line = 358)
    public static final int method723(int arg0, int arg1) {
        if (arg1 != 6150) {
            method720(-2);
        }
        int var2 = arg0 * 6 - 61440;
        field1823++;
        int var3 = (arg0 * var2 >> 12) + 40960;
        int var4 = (arg0 * arg0 >> 12) * arg0 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lue;Lac;)V", line = 379)
    public class105(class15 arg0, class165 arg1) {
        this.field1827 = arg1;
        this.field1815 = arg0;
    }
}
