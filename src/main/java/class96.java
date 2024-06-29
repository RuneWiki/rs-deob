import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class96 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Lsd;")
    public static class81 field1715;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Ljava/lang/String;")
    public String field1712;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I")
    public static final int method910(int arg0, int arg1) {
        field1711++;
        if (arg1 != -1) {
            method911(null, 116, 52, false, 35, -8, -59, 2, null, -80, (byte) 111, -100, -50, -33, null);
        }
        return arg0 == 16711935 ? -1 : class311.method2030(-124, arg0);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIZIIIILfh;IBIII[I)I")
    public static final int method911(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class605 arg8, int arg9, byte arg10, int arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class78.field1571[var15][var35] = 0;
                class284.field4218[var15][var35] = 99999999;
            }
        }
        field1713++;
        if (arg10 != -55) {
            method910(-54, -17);
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class266.method1738(arg4, arg13, arg12, arg5, arg1, arg7, arg6, arg2, (byte) 77, arg9, arg8);
        } else if (arg11 == 2) {
            var16 = class338.method2173(arg5, arg6, arg9, arg13, (byte) 127, arg2, arg12, arg8, arg7, arg1, arg4);
        } else {
            var16 = class497.method2971(arg13, (byte) 62, arg12, arg2, arg8, arg1, arg7, arg11, arg4, arg6, arg9, arg5);
        }
        int var17 = arg12 - 64;
        int var18 = arg9 - 64;
        int var19 = class399.field5808;
        int var20 = class213.field3254;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= arg13 + var23; var24++) {
                for (int var25 = arg6 - var23; var25 <= (arg6 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class284.field4218[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg13) {
                            var28 = arg13 - var24;
                        } else if (arg13 + arg5 - 1 < var24) {
                            var28 = 1 - (arg13 + arg5 - var24);
                        }
                        int var29 = 0;
                        if (arg6 > var25) {
                            var29 = arg6 - var25;
                        } else if (var25 > (arg6 + arg1 - 1)) {
                            var29 = var25 + 1 - arg6 - arg1;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class284.field4218[var26][var27]) {
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                            var22 = class284.field4218[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg12 == var19 && arg9 == var20) {
            return 0;
        }
        byte var31 = 0;
        class89.field1641[var31] = var19;
        int var37 = var31 + 1;
        class257.field3795[var31] = var20;
        int var32;
        int var33 = var32 = class78.field1571[var19 - var17][var20 - var18];
        while (arg12 != var19 || arg9 != var20) {
            if (var32 != var33) {
                class89.field1641[var37] = var19;
                var32 = var33;
                class257.field3795[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class78.field1571[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg14[var34] = class89.field1641[var37];
            arg0[var34++] = class257.field3795[var37];
            if (var34 >= arg14.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public static void method912(boolean arg0) {
        field1715 = null;
        if (!arg0) {
            method913(66, -32, -76);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
    public static final boolean method913(int arg0, int arg1, int arg2) {
        if (arg0 >= -68) {
            field1715 = null;
        }
        field1714++;
        return (arg1 & 0x580) != 0;
    }
}
