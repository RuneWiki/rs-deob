import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class117 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public static int[] field1692 = new int[100];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[C")
    public static char[] field1694 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static final void method769(int arg0) {
        if (arg0 == 8) {
            field1696++;
            if (class79.field1198 != class148.field2204 && class140.method883(class148.field2204, (byte) 91)) {
                class79.field1198 = class148.field2204;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1697++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = 2048 - arg2 & 0x7FF;
        int var10 = (class45.field545 - class73.field1080) * var8 / 100 + class73.field1080;
        int var11 = arg0 * var10 >> 8;
        int var12 = 0;
        int var13 = 2048 - arg4 & 0x7FF;
        int var14 = 0;
        int var15 = var11;
        if (var9 != 0) {
            int var16 = class221.field3468[var9];
            int var17 = class221.field3465[var9];
            var14 = -var11 * var16 >> 16;
            var15 = var11 * var17 >> 16;
        }
        if (var13 != 0) {
            int var18 = class221.field3465[var13];
            int var19 = class221.field3468[var13];
            var12 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class56.field817 = arg4;
        class21.field279 = arg7 - var14;
        class255.field4159 = arg5 - var15;
        class99.field1474 = arg6 - var12;
        class147.field2189 = arg2;
        if (arg1 != 8220) {
            field1694 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method771(int arg0) {
        int var1 = 39 % ((arg0 - 62) / 34);
        field1694 = null;
        field1692 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIC)I")
    public static final int method772(int arg0, int arg1, char arg2) {
        int var3 = 46 % ((-arg1 - 40) / 44);
        field1693++;
        int var4 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var4 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var4 = 1762;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
    public static final boolean method773(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class283.field4597; var3++) {
            class27 var4 = class266.field4330[var3];
            if (var4.field314 == 1) {
                int var5 = var4.field332 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field327 * var5 >> 8) + var4.field321;
                    int var7 = (var4.field333 * var5 >> 8) + var4.field323;
                    int var8 = (var4.field330 * var5 >> 8) + var4.field315;
                    int var9 = (var4.field325 * var5 >> 8) + var4.field312;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field314 == 2) {
                int var10 = arg0 - var4.field332;
                if (var10 > 0) {
                    int var11 = (var4.field327 * var10 >> 8) + var4.field321;
                    int var12 = (var4.field333 * var10 >> 8) + var4.field323;
                    int var13 = (var4.field330 * var10 >> 8) + var4.field315;
                    int var14 = (var4.field325 * var10 >> 8) + var4.field312;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field314 == 3) {
                int var15 = var4.field321 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field308 * var15 >> 8) + var4.field332;
                    int var17 = (var4.field324 * var15 >> 8) + var4.field326;
                    int var18 = (var4.field330 * var15 >> 8) + var4.field315;
                    int var19 = (var4.field325 * var15 >> 8) + var4.field312;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field314 == 4) {
                int var20 = arg2 - var4.field321;
                if (var20 > 0) {
                    int var21 = (var4.field308 * var20 >> 8) + var4.field332;
                    int var22 = (var4.field324 * var20 >> 8) + var4.field326;
                    int var23 = (var4.field330 * var20 >> 8) + var4.field315;
                    int var24 = (var4.field325 * var20 >> 8) + var4.field312;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field314 == 5) {
                int var25 = arg1 - var4.field315;
                if (var25 > 0) {
                    int var26 = (var4.field308 * var25 >> 8) + var4.field332;
                    int var27 = (var4.field324 * var25 >> 8) + var4.field326;
                    int var28 = (var4.field327 * var25 >> 8) + var4.field321;
                    int var29 = (var4.field333 * var25 >> 8) + var4.field323;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method774(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1691++;
        class181 var5 = class95.method652(arg2, (byte) 34, arg0);
        var5.method1285((byte) 64);
        var5.field2847 = arg3;
        var5.field2843 = arg4;
        var5.field2845 = arg1;
    }
}
