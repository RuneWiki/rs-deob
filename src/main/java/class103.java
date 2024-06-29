import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class103 extends class83 {

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field1804 = -1;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field1808 = 0;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[Lpb;")
    public static class167[] field1810 = new class167[14];

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Z")
    public static boolean field1816 = true;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "Lvh;")
    public static class108 field1820;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg0;
        field1805++;
        int var10 = 0;
        int var11 = arg4 - arg6;
        int var12 = arg0 - arg6;
        int var13 = arg4 * arg4;
        int var14 = var11 * var11;
        int var15 = arg0 * arg0;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var12 << 1;
        int var24 = var15 - ((var21 - 1) * var18);
        int var25 = (1 - var23) * var14 + var19;
        int var26 = var16 - (var23 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var17 * 3;
        int var30 = var19 * 3;
        int var31 = var14 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = var16 << 2;
        if (arg2 < 74) {
            method705(-66, 30, -8);
        }
        int var34 = (var23 - 3) * var20;
        int var35 = (arg0 - 1) * var27;
        int var36 = (var12 - 1) * var31;
        int var37 = var33;
        int[] var38 = class167.field2735[arg1];
        int var39 = var28;
        class93.method598(-7, arg7 - var11, -arg4 + arg7, var38, arg5);
        class93.method598(-7, arg7 + var11, -var11 + arg7, var38, arg3);
        class93.method598(-7, arg4 + arg7, arg7 + var11, var38, arg5);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            var9--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var30;
                        var26 += var37;
                        var37 += var33;
                        var10++;
                        var30 += var33;
                    }
                }
                if (var26 < 0) {
                    var25 += var30;
                    var10++;
                    var26 += var37;
                    var30 += var33;
                    var37 += var33;
                }
                var25 += -var36;
                var36 -= var31;
                var26 += -var34;
                var34 -= var31;
            }
            int var41 = arg1 + var9;
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var29;
                    var24 += var39;
                    var39 += var28;
                    var29 += var28;
                }
            }
            int var42 = arg1 - var9;
            if (var24 < 0) {
                var24 += var39;
                var22 += var29;
                var29 += var28;
                var39 += var28;
                var8++;
            }
            var22 += -var35;
            var24 += -var32;
            var32 -= var27;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 - var10;
                int var46 = arg7 + var10;
                class93.method598(-7, var45, var44, class167.field2735[var42], arg5);
                class93.method598(-7, var46, var45, class167.field2735[var42], arg3);
                class93.method598(-7, var43, var46, class167.field2735[var42], arg5);
                class93.method598(-7, var45, var44, class167.field2735[var41], arg5);
                class93.method598(-7, var46, var45, class167.field2735[var41], arg3);
                class93.method598(-7, var43, var46, class167.field2735[var41], arg5);
            } else {
                class93.method598(-7, var43, var44, class167.field2735[var42], arg5);
                class93.method598(-7, var43, var44, class167.field2735[var41], arg5);
            }
            var35 -= var27;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method702(boolean arg0, String arg1) {
        field1809++;
        if (!arg0) {
            method701(92, 77, -69, 108, -2, -76, 95, -78);
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static void method703(int arg0) {
        field1820 = null;
        if (arg0 == 18117) {
            field1810 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILbd;)V")
    public static final void method704(int arg0, class81 arg1) {
        field1807++;
        int var2 = arg1.field1435 - class266.field4301;
        int var3 = arg1.field1409 * 128 + arg1.method528(118) * 64;
        int var4 = arg1.field1452 * 128 + (arg1.method528(arg0 - 243087790) * 64);
        if (arg0 != 243087714) {
            field1818 = -14;
        }
        arg1.field1397 += (var3 - arg1.field1397) / var2;
        arg1.field1419 = 0;
        arg1.field1458 += (var4 - arg1.field1458) / var2;
        if (arg1.field1407 == 0) {
            arg1.field1389 = 1024;
        }
        if (arg1.field1407 == 1) {
            arg1.field1389 = 1536;
        }
        if (arg1.field1407 == 2) {
            arg1.field1389 = 0;
        }
        if (arg1.field1407 == 3) {
            arg1.field1389 = 512;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method705(int arg0, int arg1, int arg2) {
        field1819++;
        class144 var3 = (class144) class53.field923.method779(-111, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg1 >= -84) {
                return 92;
            }
            while (var5 < var3.field2464.length) {
                if (var3.field2461[var5] == arg2) {
                    var4 += var3.field2464[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field1801++;
        int var10 = arg7 - arg2;
        int var11 = arg3 - arg9;
        int var12 = (arg4 - arg5 << 16) / var11;
        int var13 = -75 % ((-arg0 - 33) / 43);
        int var14 = (arg8 - arg1 << 16) / var10;
        class165.method1110(var12, arg6, arg1, arg3, arg5, arg2, 0, arg9, 5, var14, arg7, 0);
    }
}
