import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class279 {

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Ljava/lang/String;")
    private String field3669 = "null";

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3671 = "";

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Z")
    public static boolean field3666 = false;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "C")
    public char field3665;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "C")
    public char field3674;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lpt;")
    public class451 field3662;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "Lpt;")
    private class451 field3670;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1581(int arg0, int arg1) {
        field3660++;
        if (arg1 >= -43) {
            return null;
        } else if (this.field3662 == null) {
            return this.field3669;
        } else {
            class646 var3 = (class646) this.field3662.method2645((long) arg0, (byte) -82);
            return var3 == null ? this.field3669 : var3.field9396;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)Z")
    public final boolean method1582(int arg0, int arg1) {
        field3664++;
        if (this.field3662 == null) {
            return false;
        }
        if (arg0 != 7786) {
            method1591(20, -31, null, -9, 63, -42, null, null, 10, -18, 79, -82, -106, -55, false);
        }
        if (this.field3670 == null) {
            this.method1583(arg0 ^ 0xFFFFB9B2);
        }
        class171 var3 = (class171) this.field3670.method2645((long) arg1, (byte) -90);
        return var3 != null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    private final void method1583(int arg0) {
        this.field3670 = new class451(this.field3662.method2643(127));
        field3663++;
        for (class171 var2 = (class171) this.field3662.method2638(false); var2 != null; var2 = (class171) this.field3662.method2641(12089)) {
            class171 var3 = new class171((int) var2.field7967);
            this.field3670.method2640(1, (long) var2.field2081, var3);
        }
        if (arg0 != -22568) {
            method1591(109, -43, null, 71, 21, 54, null, null, 58, -109, -60, -78, 85, 99, true);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    private final void method1584(int arg0) {
        field3659++;
        this.field3670 = new class451(this.field3662.method2643(124));
        if (arg0 >= 120) {
            for (class646 var2 = (class646) this.field3662.method2638(false); var2 != null; var2 = (class646) this.field3662.method2641(12089)) {
                class182 var3 = new class182(var2.field9396, (int) var2.field7967);
                this.field3670.method2640(1, class522.method2973(false, var2.field9396), var3);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1585(String arg0, int arg1) {
        field3668++;
        if (this.field3662 == null) {
            return false;
        } else if (arg1 == 1) {
            if (this.field3670 == null) {
                this.method1584(122);
            }
            for (class182 var3 = (class182) this.field3670.method2645(class522.method2973(false, arg0), (byte) -115); var3 != null; var3 = (class182) this.field3670.method2646((byte) 63)) {
                if (var3.field2213.equals(arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLos;)V")
    public final void method1586(byte arg0, class374 arg1) {
        while (true) {
            int var3 = arg1.method2129(-89);
            if (var3 == 0) {
                field3673++;
                if (arg0 > -46) {
                    method1589(-126);
                    return;
                }
                return;
            }
            this.method1592(-7, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)I")
    public final int method1587(boolean arg0, int arg1) {
        field3676++;
        if (this.field3662 == null) {
            return this.field3677;
        }
        class171 var3 = (class171) this.field3662.method2645((long) arg1, (byte) -101);
        if (arg0) {
            return var3 == null ? this.field3677 : var3.field2081;
        } else {
            return 91;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
    public static void method1588(int arg0) {
        field3671 = null;
        if (arg0 != 11384) {
            method1590(null, 91);
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
    public static final void method1589(int arg0) {
        field3672++;
        class216.field2633.method1315(118);
        class136.field1663.field4966 = 0;
        class323.field4098 = null;
        class532.field7483.field4966 = 0;
        class160.field1937 = null;
        class59.field577 = 0;
        class426.field5483 = 0;
        class312.field3981 = null;
        class378.field5033 = null;
        class622.method3565(0);
        int var1 = -99 / ((arg0 + 45) / 44);
        class204.field2444 = null;
        class449.field6222 = 0;
        class533.field7498 = null;
        class326.field4165 = 0;
        class389.field5147 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lvi;I)V")
    public static final void method1590(class459 arg0, int arg1) {
        field3667++;
        for (class416 var2 = (class416) class542.field7916.method1050((byte) 73); var2 != null; var2 = (class416) class542.field7916.method1047(-7962)) {
            if (var2.field5418 == arg0) {
                if (var2.field5417 != null) {
                    class534.field7500.method803(var2.field5417);
                    var2.field5417 = null;
                }
                var2.method3187(true);
                return;
            }
        }
        if (arg1 != -13416) {
            field3678 = 123;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[IIIILqt;[IIIIIIIZ)I")
    public static final int method1591(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, class542 arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        field3661++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class303.field3871[var15][var35] = 0;
                class585.field8491[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg0 == 1) {
            var16 = class454.method2647(arg13, arg3, arg5, arg1, arg4, arg6, arg12, arg9, arg8, arg11, arg10 + 186);
        } else if (arg0 == 2) {
            var16 = class311.method1724(arg4, 124, arg6, arg1, arg13, arg12, arg3, arg8, arg9, arg5, arg11);
        } else {
            var16 = class391.method2254(arg4, 111, arg11, arg13, arg12, arg1, arg0, arg8, arg6, arg5, arg3, arg9);
        }
        int var17 = arg1 - 64;
        int var18 = arg5 + arg10;
        int var19 = class152.field1855;
        int var20 = class348.field4484;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg8 - var23; var25 <= (arg8 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class585.field8491[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg11 > var24) {
                            var28 = arg11 - var24;
                        } else if (arg9 + arg11 - 1 < var24) {
                            var28 = var24 + 1 - arg9 - arg11;
                        }
                        int var29 = 0;
                        if (var25 < arg8) {
                            var29 = arg8 - var25;
                        } else if (var25 > (arg8 + arg13 - 1)) {
                            var29 = var25 + 1 - arg8 - arg13;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class585.field8491[var26][var27] < var22) {
                            var22 = class585.field8491[var26][var27];
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg5 == var20) {
            return 0;
        }
        byte var31 = 0;
        class104.field1271[var31] = var19;
        int var37 = var31 + 1;
        class468.field6544[var31] = var20;
        int var32;
        int var33 = var32 = class303.field3871[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg5 != var20) {
            if (var32 != var33) {
                class104.field1271[var37] = var19;
                var32 = var33;
                class468.field6544[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class303.field3871[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg7[var34] = class104.field1271[var37];
            arg2[var34++] = class468.field6544[var37];
            if (arg7.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILos;)V")
    private final void method1592(int arg0, int arg1, class374 arg2) {
        field3675++;
        if (arg1 == 1) {
            this.field3665 = class67.method376((byte) -111, arg2.method2124(arg0 + 7));
        } else if (arg1 == 2) {
            this.field3674 = class67.method376((byte) -104, arg2.method2124(arg0 ^ 0xFFFFFF90));
        } else if (arg1 == 3) {
            this.field3669 = arg2.method2133(false);
        } else if (arg1 == 4) {
            this.field3677 = arg2.method2123(false);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2136(false);
            this.field3662 = new class451(class129.method731(var4, -27265));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2123(false);
                class544 var7;
                if (arg1 == 5) {
                    var7 = new class646(arg2.method2133(false));
                } else {
                    var7 = new class171(arg2.method2123(false));
                }
                this.field3662.method2640(1, (long) var6, var7);
            }
        }
        if (arg0 != -7) {
            this.field3662 = null;
        }
    }
}
