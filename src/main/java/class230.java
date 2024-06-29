import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class230 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static volatile int field4002 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lmh;")
    public class128 field3999;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIZIIIIIIII)Z", line = 16)
    public static final boolean method1578(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class128.field2229[var12][var13] = 0;
                class42.field851[var12][var13] = 99999999;
            }
        }
        class128.field2229[arg7][arg8] = 99;
        class42.field851[arg7][arg8] = 0;
        field3997++;
        int var14 = arg7;
        int var15 = arg8;
        int var16 = 0;
        byte var17 = 0;
        if (arg10 <= 27) {
            method1580((byte) -80, (class194) null);
        }
        class103.field1770[var17] = arg7;
        int var32 = var17 + 1;
        class104.field1776[var17] = arg8;
        boolean var18 = false;
        int[][] var19 = class180.field3158[class133.field2315].field4306;
        while (var16 != var32) {
            var14 = class103.field1770[var16];
            var15 = class104.field1776[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg9 == var14 && arg2 == var15) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class180.field3158[class133.field2315].method1744(arg9, (byte) -102, var14, arg5, arg2, var15, arg11 - 1, 2)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class180.field3158[class133.field2315].method1742(var15, arg11 - 1, arg5, arg2, arg9, var14, 2, -16941)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg6 != 0 && class180.field3158[class133.field2315].method1743(arg6, (byte) 109, 2, arg2, arg9, var15, var14, arg4, arg0)) {
                var18 = true;
                break;
            }
            int var20 = class42.field851[var14][var15] + 1;
            if (var14 > 0 && class128.field2229[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class103.field1770[var32] = var14 - 1;
                class104.field1776[var32] = var15;
                class128.field2229[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class42.field851[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class128.field2229[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class103.field1770[var32] = var14 + 1;
                class104.field1776[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14 + 1][var15] = 8;
                class42.field851[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class128.field2229[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class103.field1770[var32] = var14;
                class104.field1776[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14][var15 - 1] = 1;
                class42.field851[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class128.field2229[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class103.field1770[var32] = var14;
                class104.field1776[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14][var15 + 1] = 4;
                class42.field851[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class128.field2229[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class103.field1770[var32] = var14 - 1;
                class104.field1776[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14 - 1][var15 - 1] = 3;
                class42.field851[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class128.field2229[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class103.field1770[var32] = var14 + 1;
                class104.field1776[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14 + 1][var15 - 1] = 9;
                class42.field851[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class128.field2229[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class103.field1770[var32] = var14 - 1;
                class104.field1776[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14 - 1][var15 + 1] = 6;
                class42.field851[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class128.field2229[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class103.field1770[var32] = var14 + 1;
                class104.field1776[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class128.field2229[var14 + 1][var15 + 1] = 12;
                class42.field851[var14 + 1][var15 + 1] = var20;
            }
        }
        class190.field3298 = 0;
        if (!var18) {
            if (!arg3) {
                return false;
            }
            int var21 = 100;
            int var22 = 1000;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg2 - var23; var25 <= (arg2 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class42.field851[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg9 > var24) {
                            var26 = arg9 - var24;
                        } else if ((arg0 + arg9 - 1) < var24) {
                            var26 = var24 - (arg0 + arg9 - 1);
                        }
                        if (var25 < arg2) {
                            var27 = arg2 - var25;
                        } else if (var25 > (arg2 + arg6 - 1)) {
                            var27 = var25 + 1 - arg2 - arg6;
                        }
                        int var28 = var26 * var26 + (var27 * var27);
                        if (var28 < var22 || var22 == var28 && var21 > class42.field851[var24][var25]) {
                            var14 = var24;
                            var15 = var25;
                            var22 = var28;
                            var21 = class42.field851[var24][var25];
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg7 == var14 && arg8 == var15) {
                return false;
            }
            class190.field3298 = 1;
        }
        byte var29 = 0;
        class103.field1770[var29] = var14;
        int var33 = var29 + 1;
        class104.field1776[var29] = var15;
        int var30;
        int var31 = var30 = class128.field2229[var14][var15];
        while (arg7 != var14 || arg8 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class103.field1770[var33] = var14;
                class104.field1776[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class128.field2229[var14][var15];
        }
        if (var33 > 0) {
            class283.method1964((byte) -123, arg1, var33);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Z", line = 420)
    public static final boolean method1579(int arg0, int arg1) {
        field4000++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else if (arg0 == 2) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLbg;)V", line = 451)
    public static final void method1580(byte arg0, class194 arg1) {
        int var2 = arg1.method1345((byte) 123);
        field4001++;
        class3.field60 = new class230[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class3.field60[var3] = new class230();
            class3.field60[var3].field3998 = arg1.method1345((byte) 127);
            class3.field60[var3].field3999 = arg1.method1316((byte) -128);
        }
        if (arg0 != -28) {
            method1579(-85, 92);
        }
        class161.field2754 = arg1.method1345((byte) 100);
        class65.field1253 = arg1.method1345((byte) 77);
        class91.field1556 = arg1.method1345((byte) 106);
        class245.field4178 = new class140[class65.field1253 + 1 - class161.field2754];
        for (int var4 = 0; var4 < class91.field1556; var4++) {
            int var5 = arg1.method1345((byte) 119);
            class140 var6 = class245.field4178[var5] = new class140();
            var6.field2494 = arg1.method1325(7627);
            var6.field2493 = arg1.method1350(false);
            var6.field2397 = var5 + class161.field2754;
            var6.field2407 = arg1.method1316((byte) -123);
            var6.field2401 = arg1.method1316((byte) -123);
        }
        class314.field5328 = arg1.method1350(false);
        class252.field4356 = true;
    }
}
