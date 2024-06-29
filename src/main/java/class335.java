import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class335 extends class478 {

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Lkn;")
    public static class530 field4849 = new class530("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Lfc;")
    public static class174 field4854 = new class174(4);

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    public static boolean field4856 = false;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "Lrv;")
    public static class73 field4857;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
    public final void method2001(boolean arg0, byte arg1) {
        super.field6649.method2968(this, -126);
        ++field4855;
        OpenGL.glTexParameteri(super.field6667, 10242, !arg0 ? 33071 : 10497);
        if (arg1 >= -20) {
            field4857 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lgq;")
    public static final class362 method2002(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3474;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lih;II[BI)V")
    public class335(class503 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4853 = arg2;
        super.field6649.method2968(this, -108);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6667, 0, super.field6670, this.field4853, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZI)V")
    public static final void method2003(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4852;
        if (arg3 || ~class216.field3128 != ~arg2 || class341.field4945 != arg4 || class320.field4627 != class146.field1941 && !class4.field81.method1791(arg1 + 9, class405.field5737)) {
            class216.field3128 = arg2;
            class146.field1941 = class320.field4627;
            class341.field4945 = arg4;
            if (class4.field81.method1791(-2, class405.field5737)) {
                class146.field1941 = 0;
            }
            class86.method623(arg0, (byte) -59);
            class149.method930(true, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 122), (byte) 123);
            int var5 = class441.field6171;
            class441.field6171 = (-(class43.field494 >> 4) + class216.field3128) * 8;
            int var6 = class367.field5241;
            class367.field5241 = (-(class500.field7068 >> 4) + class341.field4945) * 8;
            class165.field2430 = class245.method1536(class216.field3128 * 8, class341.field4945 * 8);
            class399.field5628 = null;
            int var7 = -var5 + class441.field6171;
            int var8 = -var6 + class367.field5241;
            if (~arg0 == arg1) {
                for (int var9 = 0; ~class481.field6704 < ~var9; ++var9) {
                    class378 var10 = class367.field5245[var9];
                    if (var10 != null) {
                        class429 var11 = var10.field5353;
                        for (int var12 = 0; ~var12 > -11; ++var12) {
                            var11.field3368[var12] -= var7;
                            var11.field3378[var12] -= var8;
                        }
                        var11.field1896 -= var7 * 128;
                        var11.field1899 -= var8 * 128;
                    }
                }
            } else {
                boolean var13 = false;
                class434.field6110 = 0;
                int var14 = (class43.field494 + -1) * 128;
                int var15 = class500.field7068 * 128 + -128;
                for (int var16 = 0; ~var16 > ~class481.field6704; ++var16) {
                    class378 var29 = class367.field5245[var16];
                    if (var29 != null) {
                        class429 var30 = var29.field5353;
                        var30.field1899 -= var8 * 128;
                        var30.field1896 -= var7 * 128;
                        if (var30.field1896 >= 0 && ~var14 <= ~var30.field1896 && ~var30.field1899 <= -1 && ~var15 <= ~var30.field1899) {
                            boolean var31 = true;
                            for (int var32 = 0; var32 < 10; ++var32) {
                                var30.field3368[var32] -= var7;
                                var30.field3378[var32] -= var8;
                                if (var30.field3368[var32] < 0 || class43.field494 <= var30.field3368[var32] || var30.field3378[var32] < 0 || ~class500.field7068 >= ~var30.field3378[var32]) {
                                    var31 = false;
                                }
                            }
                            if (var31) {
                                class488.field6834[class434.field6110++] = var30.field3289;
                            } else {
                                var30.method2541((class322) null, false);
                                var13 = true;
                                var29.method2891(38);
                            }
                        } else {
                            var30.method2541((class322) null, false);
                            var29.method2891(arg1 + -115);
                            var13 = true;
                        }
                    }
                }
                if (var13) {
                    class481.field6704 = class125.field1687.method2406(true);
                    class125.field1687.method2407(class367.field5245, (byte) 84);
                }
            }
            for (int var17 = 0; var17 < 2048; ++var17) {
                class22 var27 = class378.field5355[var17];
                if (var27 != null) {
                    for (int var28 = 0; ~var28 > -11; ++var28) {
                        var27.field3368[var28] -= var7;
                        var27.field3378[var28] -= var8;
                    }
                    var27.field1899 -= var8 * 128;
                    var27.field1896 -= var7 * 128;
                }
            }
            class373[] var18 = class20.field234;
            for (int var19 = 0; ~var18.length < ~var19; ++var19) {
                class373 var26 = var18[var19];
                if (var26 != null) {
                    var26.field5305 -= var8 * 128;
                    var26.field5308 -= var7 * 128;
                }
            }
            for (class408 var20 = (class408) class191.field2730.method2655(arg1 + 15163); var20 != null; var20 = (class408) class191.field2730.method2660((byte) 67)) {
                var20.field5773 -= var8;
                var20.field5770 -= var7;
                if (~class279.field4128 != -5 && (var20.field5770 < 0 || ~var20.field5773 > -1 || ~var20.field5770 <= ~class43.field494 || class500.field7068 <= var20.field5773)) {
                    var20.method2891(58);
                }
            }
            if (~class279.field4128 != -5) {
                for (class176 var21 = (class176) class62.field773.method2414((byte) -128); var21 != null; var21 = (class176) class62.field773.method2410((byte) 85)) {
                    int var22 = (int) (var21.field7060 & 16383L);
                    int var23 = var22 - class441.field6171;
                    int var24 = (int) (16383L & var21.field7060 >> 14);
                    int var25 = var24 - class367.field5241;
                    if (~var23 > -1 || var25 < 0 || ~var23 <= ~class43.field494 || ~class500.field7068 >= ~var25) {
                        var21.method2891(42);
                    }
                }
            }
            if (~class243.field3527 != -1) {
                class243.field3527 -= var7;
                class282.field4153 -= var8;
            }
            class481.method2771(50);
            if (~arg0 != -11) {
                class515.field7596 -= var8 * 128;
                class478.field6654 -= var7 * 128;
                class218.field3160 -= var8;
                class69.field873 -= var7;
                class531.field7779 -= var8;
                class158.field2368 -= var7;
                if (~Math.abs(var7) < ~class43.field494 || ~Math.abs(var8) < ~class500.field7068) {
                    class373.method2185(true);
                }
            } else if (class504.field7461 != 4) {
                class504.field7461 = 1;
            } else {
                class220.field3175 -= var8 * 128;
                class267.field3903 -= var7 * 128;
                class168.field2451 -= var8 * 128;
                class360.field5147 -= var7 * 128;
            }
            class362.method2136((byte) -63);
            class239.method1509(arg1 + -27188);
            class424.field5976.method2656(105);
            class97.field1274.method2656(126);
            class239.field3494.method2754((byte) 25);
            class435.method2561((byte) 105);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 == -1259451258) {
            ++field4850;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lmk;IIII[IZIIIII[IBI)I")
    public static final int method2004(class40 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, byte arg13, int arg14) {
        ++field4851;
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; var35 < 128; ++var35) {
                class316.field4592[var15][var35] = 0;
                class458.field6420[var15][var35] = 99999999;
            }
        }
        if (arg13 != -65) {
            return -126;
        } else {
            boolean var16;
            if (arg4 == 1) {
                var16 = class527.method3111(arg9, arg10, arg7, (byte) -72, arg3, arg11, arg14, arg0, arg1, arg2, arg8);
            } else if (~arg4 == -3) {
                var16 = class518.method3069(arg0, arg14, arg9, arg1, arg7, arg10, arg2, arg3, false, arg8, arg11);
            } else {
                var16 = class57.method471(-8246, arg1, arg10, arg14, arg7, arg0, arg3, arg9, arg2, arg8, arg4, arg11);
            }
            int var17 = arg11 + -64;
            int var18 = arg8 + -64;
            int var19 = class144.field1905;
            int var20 = class204.field2946;
            if (!var16) {
                if (!arg6) {
                    return -1;
                }
                int var21 = Integer.MAX_VALUE;
                int var22 = Integer.MAX_VALUE;
                byte var23 = 10;
                for (int var24 = -var23 + arg3; var24 <= arg3 + var23; ++var24) {
                    for (int var25 = -var23 + arg14; var25 <= arg14 - -var23; ++var25) {
                        int var26 = -var17 + var24;
                        int var27 = -var18 + var25;
                        if (var26 >= 0 && ~var27 <= -1 && var26 < 128 && var27 < 128 && ~class458.field6420[var26][var27] > -101) {
                            int var28 = 0;
                            if (~var24 <= ~arg3) {
                                if (~(arg7 + -1 + arg3) > ~var24) {
                                    var28 = 1 - (arg3 + arg7) + var24;
                                }
                            } else {
                                var28 = -var24 + arg3;
                            }
                            int var29 = 0;
                            if (var25 < arg14) {
                                var29 = -var25 + arg14;
                            } else if (~(arg14 - -arg2 + -1) > ~var25) {
                                var29 = var25 - arg14 - (arg2 - 1);
                            }
                            int var30 = var28 * var28 + var29 * var29;
                            if (~var21 < ~var30 || var21 == var30 && var22 > class458.field6420[var26][var27]) {
                                var20 = var25;
                                var22 = class458.field6420[var26][var27];
                                var21 = var30;
                                var19 = var24;
                            }
                        }
                    }
                }
                if (~var21 == Integer.MIN_VALUE) {
                    return -1;
                }
            }
            if (arg11 == var19 && arg8 == var20) {
                return 0;
            } else {
                byte var31 = 0;
                class153.field2208[var31] = var19;
                int var37 = var31 + 1;
                class160.field2373[var31] = var20;
                int var32;
                int var33 = var32 = class316.field4592[var19 - var17][var20 - var18];
                while (arg11 != var19 || ~arg8 != ~var20) {
                    if (~var32 != ~var33) {
                        class153.field2208[var37] = var19;
                        var32 = var33;
                        class160.field2373[var37++] = var20;
                    }
                    if ((var33 & 1) == 0) {
                        if (~(4 & var33) != -1) {
                            --var20;
                        }
                    } else {
                        ++var20;
                    }
                    if (~(2 & var33) != -1) {
                        ++var19;
                    } else if (~(var33 & 8) != -1) {
                        --var19;
                    }
                    var33 = class316.field4592[var19 - var17][-var18 + var20];
                }
                int var34 = 0;
                while (~(var37--) < -1) {
                    arg12[var34] = class153.field2208[var37];
                    arg5[var34++] = class160.field2373[var37];
                    if (~var34 <= ~arg12.length) {
                        break;
                    }
                }
                return var34;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4849 = null;
        field4857 = null;
        field4854 = null;
        if (arg0 != 128) {
            field4849 = null;
        }
    }
}
