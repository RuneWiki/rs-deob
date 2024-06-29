import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class251 extends class214 {

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    private final int field4432;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    private final int field4438;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private final int field4429;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    private final int field4425;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lqj;")
    public static class196 field4436 = class80.method502("Art", -48);

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lea;")
    public static class243 field4435 = new class243();

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field4439 = 0;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lqj;")
    private static class196 field4437 = class80.method502("Loading fonts )2 ", -48);

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Lqj;")
    public static class196 field4440 = field4437;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lqj;")
    public static class196 field4443 = class80.method502("_", -48);

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lqj;")
    public static class196 field4442 = class80.method502("Lade Schrifts-=tze )2 ", -48);

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "[Lub;")
    public static class43[] field4441;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    public final void method392(int arg0, int arg1, int arg2) {
        ++field4428;
        int var4 = this.field4438 * arg0 >> 12;
        int var5 = this.field4432 * arg1 >> 12;
        int var6 = this.field4425 * arg0 >> 12;
        int var7 = this.field4429 * arg1 >> 12;
        class243.method1657(var5, super.field3827, var6, var4, var7, true);
        if (arg2 != -954688305) {
            field4440 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIII)V")
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4432 = arg1;
        this.field4438 = arg2;
        this.field4429 = arg3;
        this.field4425 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method1693(int arg0) {
        field4443 = null;
        if (arg0 != 1040762640) {
            method1695((class196) null, false, (byte) -68);
        }
        field4441 = null;
        field4440 = null;
        field4435 = null;
        field4442 = null;
        field4437 = null;
        field4436 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILec;IIIIII)V")
    public static final void method1694(int arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4433;
        if (class30.field379) {
            class226.field4043 = 32;
        } else {
            class226.field4043 = 0;
        }
        class30.field379 = false;
        if (~class227.field4052 != -1) {
            if (arg7 <= arg3 && arg7 - -16 > arg3 && arg5 <= arg4 && arg5 + 16 > arg4) {
                arg1.field2998 -= 4;
                class214.method1472(-120, arg1);
            } else if (~arg3 <= ~arg7 && ~arg3 > ~(arg7 + 16) && ~(arg2 + arg5 + -16) >= ~arg4 && ~(arg2 + arg5) < ~arg4) {
                arg1.field2998 += 4;
                class214.method1472(102, arg1);
            } else if (~(-class226.field4043 + arg7) >= ~arg3 && arg3 < arg7 + 16 + class226.field4043 && arg4 >= arg5 + 16 && ~(arg5 + -16 + arg2) < ~arg4) {
                int var8 = (arg2 - 32) * arg2 / arg6;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = -arg5 + arg4 - 16 + -(var8 / 2);
                int var10 = arg2 + -32 + -var8;
                arg1.field2998 = (-arg2 + arg6) * var9 / var10;
                class214.method1472(-111, arg1);
                class30.field379 = true;
            }
        }
        if (class240.field4266 != 0) {
            int var11 = arg1.field3085;
            if (~(-var11 + arg7) >= ~arg3 && ~arg4 <= ~arg5 && ~arg3 > ~(arg7 - -16) && ~arg4 >= ~(arg2 + arg5)) {
                arg1.field2998 += class240.field4266 * 45;
                class214.method1472(-112, arg1);
            }
        }
        int var12 = -116 % ((arg0 - -40) / 62);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        ++field4427;
        if (arg0 <= 35) {
            field4440 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lqj;ZB)V")
    public static final void method1695(class196 arg0, boolean arg1, byte arg2) {
        if (!arg1) {
            try {
                class58.field789.getAppletContext().showDocument(arg0.method1297(0, class58.field789.getCodeBase()), "_top");
            } catch (Exception var4) {
            }
        } else {
            try {
                class58.field789.getAppletContext().showDocument(arg0.method1297(0, class58.field789.getCodeBase()), "_blank");
            } catch (Exception var3) {
            }
        }
        ++field4431;
        if (arg2 <= 66) {
            field4442 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILm;IIIZIILoc;III)Loc;")
    public static final class119 method1696(int arg0, int arg1, int arg2, class149 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12, int arg13) {
        ++field4434;
        long var14 = ((long) arg9 << 48) + ((long) ((arg6 << 24) + arg12 - -(arg13 << 16)) - -((long) arg0 << 32));
        class119 var16 = (class119) class66.field933.method132(var14, 127);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18;
            if (~arg12 != -2) {
                if (~arg12 != -3) {
                    if (~arg12 != -4) {
                        if (~arg12 != -5) {
                            var18 = 21;
                        } else {
                            var18 = 18;
                        }
                    } else {
                        var18 = 15;
                    }
                } else {
                    var18 = 12;
                }
            } else {
                var18 = 9;
            }
            byte var19 = 3;
            class208 var20 = new class208(var18 * var19 + 1, var18 * var19 * 2 - var18, 0);
            int var21 = var20.method1433(0, 0, 0);
            int[][] var22 = new int[var19][var18];
            for (int var23 = 0; var19 > var23; ++var23) {
                int var30 = var17[var23];
                int var31 = var17[var23];
                for (int var32 = 0; ~var18 < ~var32; ++var32) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = arg2 - -(class15.field172[var33] * var30) >> 16;
                    int var35 = class15.field170[var33] * var31 + arg1 >> 16;
                    var22[var23][var32] = var20.method1433(var35, 0, var34);
                }
            }
            for (int var24 = 0; var19 > var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = -var25 + 256;
                short var27 = (short) (((arg0 & 64512) * var26 + (arg9 & 64512) * var25 & 16515072) + ((896 & arg0) * var26 + (896 & arg9) * var25 & 229376) + ((127 & arg0) * var26 + (arg9 & 127) * var25 & 32512) >> 8);
                byte var28 = (byte) (arg6 * var25 + arg13 * var26 >> 8);
                for (int var29 = 0; var29 < var18; ++var29) {
                    if (var24 != 0) {
                        var20.method1418(var22[var24 + -1][var29], var22[var24 + -1][(var29 + 1) % var18], var22[var24][(var29 + 1) % var18], (byte) 1, var27, var28);
                        var20.method1418(var22[var24 + -1][var29], var22[var24][(var29 + 1) % var18], var22[var24][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1418(var21, var22[0][(var29 + 1) % var18], var22[0][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1432(64, 768, -50, -10, -50);
            class66.field933.method129(30972, var14, var16);
        }
        int var36 = arg12 * 64 + -1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg10.method740();
        if (arg7) {
            if (arg5 > 640 && arg5 < 1408) {
                var40 = var36 + 128;
            }
            if (~arg5 < -129 && ~arg5 > -897) {
                var37 -= 128;
            }
            if (~arg5 < -1153 && arg5 < 1920) {
                var39 = var36 + 128;
            }
            if (~arg5 < -1665 || arg5 < 384) {
                var38 -= 128;
            }
        }
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg10.method727();
        if (var42 > var39) {
            var42 = var39;
        }
        int var43 = arg10.method735();
        if (arg8 != 256) {
            method1697(47, true);
        }
        int var44 = arg10.method730();
        if (var44 > var40) {
            var44 = var40;
        }
        if (~var43 > ~var38) {
            var43 = var38;
        }
        class218 var45 = null;
        if (arg3 != null) {
            int var46 = arg3.field2362[arg11];
            var45 = class94.method581(2083334977, var46 >> 16);
            arg11 = var46 & 65535;
        }
        class119 var47;
        if (var45 == null) {
            var47 = var16.method734(true, true);
            var47.method743((-var41 + var42) / 2, 128, (-var43 + var44) / 2);
            var47.method729((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method734(!var45.method1488(arg11, arg8 ^ -7115), true);
            var47.method743((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method729((var41 + var42) / 2, 0, (var43 - -var44) / 2);
            var47.method741(var45, arg11);
        }
        if (~arg5 != -1) {
            var47.method731(arg5);
        }
        class167 var48 = (class167) var47;
        if (~arg4 != ~class74.method470(arg2 + var43, class27.field335, 103, arg1 + var41) || arg4 != class74.method470(arg2 - -var44, class27.field335, 103, arg1 + var42)) {
            for (int var49 = 0; ~var49 > ~var48.field2772; ++var49) {
                var48.field2758[var49] += class74.method470(var48.field2774[var49] + arg2, class27.field335, 103, var48.field2754[var49] + arg1) - arg4;
            }
            var48.field2770 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)V")
    public final void method390(byte arg0, int arg1, int arg2) {
        ++field4426;
        int var4 = -128 / ((arg0 - 48) / 52);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)I")
    public static final int method1697(int arg0, boolean arg1) {
        if (!arg1) {
            method1695((class196) null, false, (byte) -95);
        }
        ++field4430;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
