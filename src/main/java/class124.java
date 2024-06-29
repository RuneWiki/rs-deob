import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class124 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lse;")
    public static class211 field1748;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method813(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1741++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg6 * arg6;
        int var13 = arg7 * arg7;
        int var14 = arg7 - arg5;
        int var15 = var11 * var11;
        int var16 = var14 * var14;
        int var17 = var13 << 1;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg7 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = (1 - var22) * var15 + var20;
        int var25 = var16 - ((var22 - 1) * var19);
        int var26 = var12 << 2;
        int var27 = var13 - ((var21 - 1) * var18);
        int var28 = var15 << 2;
        int var29 = var17 * 3;
        int var30 = var13 << 2;
        int var31 = var16 << 2;
        int var32 = (var22 - 3) * var19;
        if (arg1 != 84) {
            field1743 = -85;
        }
        int var33 = (var21 - 3) * var18;
        int var34 = var30;
        int var35 = var20 * 3;
        int var36 = (arg7 - 1) * var26;
        int var37 = var31;
        int var38 = (var14 - 1) * var28;
        if (arg0 >= class273.field4228 && class127.field1782 >= arg0) {
            int[] var39 = class216.field3264[arg0];
            int var40 = class148.method996(class93.field1294, arg3 - arg6, 7585, class296.field4668);
            int var41 = class148.method996(class93.field1294, arg3 + arg6, 7585, class296.field4668);
            int var42 = class148.method996(class93.field1294, arg3 - var11, 7585, class296.field4668);
            int var43 = class148.method996(class93.field1294, arg3 + var11, arg1 + 7501, class296.field4668);
            class154.method1028(-353, var39, arg2, var40, var42);
            class154.method1028(arg1 - 437, var39, arg4, var42, var43);
            class154.method1028(-353, var39, arg2, var43, var41);
        }
        while (var9 > 0) {
            boolean var44 = var14 >= var9;
            var9--;
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var27 += var34;
                    var23 += var29;
                    var34 += var30;
                    var29 += var30;
                }
            }
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var37;
                        var10++;
                        var37 += var31;
                        var24 += var35;
                        var35 += var31;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var24 += var35;
                    var10++;
                    var35 += var31;
                    var37 += var31;
                }
                var24 += -var38;
                var25 += -var32;
                var32 -= var28;
                var38 -= var28;
            }
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var27 < 0) {
                var8++;
                var23 += var29;
                var29 += var30;
                var27 += var34;
                var34 += var30;
            }
            var27 += -var33;
            if (class273.field4228 <= var46 && var45 <= class127.field1782) {
                int var47 = class148.method996(class93.field1294, arg3 + var8, 7585, class296.field4668);
                int var48 = class148.method996(class93.field1294, arg3 - var8, 7585, class296.field4668);
                if (var44) {
                    int var49 = class148.method996(class93.field1294, arg3 + var10, 7585, class296.field4668);
                    int var50 = class148.method996(class93.field1294, arg3 - var10, 7585, class296.field4668);
                    if (var45 >= class273.field4228) {
                        int[] var51 = class216.field3264[var45];
                        class154.method1028(-353, var51, arg2, var48, var50);
                        class154.method1028(arg1 - 437, var51, arg4, var50, var49);
                        class154.method1028(-353, var51, arg2, var49, var47);
                    }
                    if (class127.field1782 >= var46) {
                        int[] var52 = class216.field3264[var46];
                        class154.method1028(-353, var52, arg2, var48, var50);
                        class154.method1028(-353, var52, arg4, var50, var49);
                        class154.method1028(-353, var52, arg2, var49, var47);
                    }
                } else {
                    if (class273.field4228 <= var45) {
                        class154.method1028(-353, class216.field3264[var45], arg2, var48, var47);
                    }
                    if (var46 <= class127.field1782) {
                        class154.method1028(-353, class216.field3264[var46], arg2, var48, var47);
                    }
                }
            }
            var23 += -var36;
            var33 -= var26;
            var36 -= var26;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)[Lq;")
    public static final class128[] method814(int arg0) {
        field1739++;
        class128[] var1 = new class128[class175.field2465];
        if (arg0 != 3) {
            method813(122, (byte) 61, 60, -46, 45, -97, 117, 78);
        }
        for (int var2 = 0; var2 < class175.field2465; var2++) {
            int var3 = class50.field729[var2] * class39.field576[var2];
            byte[] var4 = class140.field1956[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class9.field79[class235.method1572(var4[var6], 255)];
            }
            var1[var2] = new class128(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], var5);
        }
        class15.method88(arg0 ^ 0xFFFFC19E);
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIB)Ljava/lang/String;")
    public static final String method815(boolean arg0, int arg1, int arg2, byte arg3) {
        field1744++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - arg1 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg3 < 56) {
                field1745 = -73;
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method816(int arg0) {
        field1748 = null;
        if (arg0 != -8781) {
            field1745 = -107;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILhc;)Lke;")
    public static final class110 method817(int arg0, int arg1, class235 arg2) {
        field1742++;
        if (arg1 != 24502) {
            method813(92, (byte) -37, 93, 93, -21, 79, 112, 70);
        }
        return class294.method1972(arg2, -47, arg0) ? class246.method1654((byte) -6) : null;
    }
}
