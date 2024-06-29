import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class606 extends class214 {

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    private int field8560 = 4096;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    private int field8567 = 4096;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field8562 = 4096;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Z")
    public static boolean field8565 = false;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "Leha;")
    public static class162 field8566;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != -256) {
            return null;
        } else {
            ++field8564;
            int[][] var3 = super.field3545.method2996((byte) 122, arg0);
            if (super.field3545.field7147) {
                int[][] var4 = this.method1539(true, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class626.field8787; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field8560 * var12 >> 12;
                        var9[var11] = this.field8567 * var13 >> 12;
                        var10[var11] = this.field8562 * var14 >> 12;
                    } else {
                        var8[var11] = this.field8560;
                        var9[var11] = this.field8567;
                        var10[var11] = this.field8562;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIZIIILup;[II[IIII)I")
    public static final int method3475(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class238 arg8, int[] arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class339.field4967[var15][var35] = 0;
                class532.field7661[var15][var35] = 99999999;
            }
        }
        ++field8561;
        boolean var16;
        if (~arg5 == -2) {
            var16 = class372.method2367(arg7, arg1, arg0, arg10, arg13, arg3, arg2, arg6, arg8, false, arg12);
        } else if (arg5 != 2) {
            var16 = class96.method789(arg1, arg8, arg7, arg6, arg13, arg3, arg12, arg10, arg2, arg0, true, arg5);
        } else {
            var16 = class97.method793(arg2, (byte) 15, arg8, arg0, arg13, arg3, arg7, arg1, arg6, arg12, arg10);
        }
        int var17 = arg0 + -64;
        int var18 = arg3 + -64;
        int var19 = class594.field8340;
        int var20 = class689.field9795;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; ++var24) {
                for (int var25 = -var23 + arg1; var25 <= arg1 + var23; ++var25) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && ~var27 <= -1 && var26 < 128 && ~var27 > -129 && ~class532.field7661[var26][var27] > -101) {
                        int var28 = 0;
                        if (arg7 > var24) {
                            var28 = -var24 + arg7;
                        } else if (~var24 < ~(arg7 - 1 + arg2)) {
                            var28 = -arg7 - (arg2 + -1 - var24);
                        }
                        int var29 = 0;
                        if (~var25 > ~arg1) {
                            var29 = -var25 + arg1;
                        } else if (var25 > arg1 + -1 + arg13) {
                            var29 = -arg1 + -arg13 + var25 + 1;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (~var21 < ~var30 || var21 == var30 && var22 > class532.field7661[var26][var27]) {
                            var22 = class532.field7661[var26][var27];
                            var19 = var24;
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg0 == var19 && arg3 == var20) {
            return 0;
        } else {
            class457.field6638[arg14] = var19;
            int var31 = arg14 + 1;
            class707.field9973[arg14] = var20;
            int var32;
            int var33 = var32 = class339.field4967[var19 - var17][-var18 + var20];
            while (arg0 != var19 || ~arg3 != ~var20) {
                if (var32 != var33) {
                    var32 = var33;
                    class457.field6638[var31] = var19;
                    class707.field9973[var31++] = var20;
                }
                if ((2 & var33) == 0) {
                    if (~(8 & var33) != -1) {
                        --var19;
                    }
                } else {
                    ++var19;
                }
                if (~(1 & var33) == -1) {
                    if (~(4 & var33) != -1) {
                        --var20;
                    }
                } else {
                    ++var20;
                }
                var33 = class339.field4967[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (var31-- > 0) {
                arg9[var34] = class457.field6638[var31];
                arg11[var34++] = class707.field9973[var31];
                if (arg9.length <= var34) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class606() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field8562 = arg1.method1989((byte) -64);
                }
            } else {
                this.field8567 = arg1.method1989((byte) -114);
            }
        } else {
            this.field8560 = arg1.method1989((byte) -51);
        }
        ++field8563;
        if (arg0 <= 92) {
            this.field8560 = -61;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
    public static void method3476(byte arg0) {
        field8566 = null;
        if (arg0 >= -71) {
            method3476((byte) -78);
        }
    }
}
