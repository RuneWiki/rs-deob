import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class216 extends class8 {

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    private int field3527 = 0;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field3525 = 0;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    private int field3528 = 2000;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    private int field3537 = 4096;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    private int field3539 = 16;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field3524 = 0;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3523 = "green:";

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field3538 = 0;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lta;")
    public static class255 field3531;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public static final void method1475(byte arg0, int arg1) {
        ++field3535;
        class239 var2 = (class239) class214.field3502.method1400((long) arg1, true);
        if (var2 != null) {
            int var3 = 0;
            int var4 = -40 / ((-60 - arg0) / 46);
            while (~var3 > ~var2.field3880.length) {
                var2.field3880[var3] = -1;
                var2.field3879[var3] = 0;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3523 = null;
        field3531 = null;
        if (arg0 != -112) {
            field3529 = 49;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3526;
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int var4 = this.field3537 >> 1;
            int[][] var5 = super.field110.method1581((byte) 116);
            Random var6 = new Random((long) this.field3527);
            for (int var7 = 0; ~var7 > ~this.field3528; ++var7) {
                int var8 = this.field3537 > 0 ? this.field3525 + class142.method982(-396321952, this.field3537, var6) + -var4 : this.field3525;
                int var9 = var8 >> 4 & 255;
                int var10 = class142.method982(-396321952, class231.field3798, var6);
                int var11 = class142.method982(arg0 ^ -396321949, class259.field4118, var6);
                int var12 = (class212.field3455[var9] * this.field3539 >> 12) + var11;
                int var13 = var10 - -(class84.field1319[var9] * this.field3539 >> 12);
                int var14 = var13 - var10;
                int var15 = var12 - var11;
                if (var14 != 0 || ~var15 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 > ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (~var13 > ~var10) {
                        int var19 = var10;
                        var10 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = -var10 + var13;
                    int var22 = var11;
                    int var23 = var12 - var11;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 1024 - (class142.method982(-396321952, 4096, var6) >> 2);
                    int var26 = var12 > var11 ? 1 : -1;
                    int var27 = 2048 / var21;
                    for (int var28 = var10; var13 > var28; ++var28) {
                        var24 += var23;
                        int var29 = (-var10 + var28) * var27 + var25 + 1024;
                        int var30 = var28 & class287.field4537;
                        int var31 = class92.field1523 & var22;
                        if (~var24 < -1) {
                            var22 += var26;
                            var24 += -var21;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field3534;
        if (arg0 >= 62) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                this.field3537 = arg1.method1521((byte) 113);
                            }
                        } else {
                            this.field3525 = arg1.method1521((byte) 113);
                        }
                    } else {
                        this.field3539 = arg1.method1517((byte) -96);
                    }
                } else {
                    this.field3528 = arg1.method1521((byte) 113);
                }
            } else {
                this.field3527 = arg1.method1517((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg1 == arg5 && arg8 == arg9 && ~arg0 == ~arg7) {
            class170.method1174(5615, arg1, arg2, arg7, arg4, arg9);
        } else {
            int var10 = arg4;
            int var11 = arg1;
            int var12 = arg4 * 3;
            int var13 = arg1 * 3;
            int var14 = arg3 * 3;
            int var15 = arg5 * 3;
            int var16 = arg0 * 3;
            int var17 = arg8 * 3;
            int var18 = arg9 + var14 - arg4 + -var17;
            int var19 = -var15 + var16 + -var15 - -var13;
            int var20 = -arg1 + -var16 + arg7 + var15;
            int var21 = -var12 + var14;
            int var22 = -var13 + var15;
            int var23 = var17 - var14 - -var12 + -var14;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var26;
                int var29 = var23 * var25;
                int var30 = var19 * var25;
                int var31 = var21 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 + var29 - -var31 >> 12) + arg4;
                int var34 = (var30 + var32 + var28 >> 12) + arg1;
                class170.method1174(5615, var11, arg2, var34, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        ++field3532;
        if (arg6 > -73) {
            field3529 = -107;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIIILwd;I)V")
    public static final void method1478(byte arg0, int arg1, int arg2, int arg3, int arg4, class22 arg5, int arg6) {
        ++field3536;
        long var7 = 0L;
        if (arg1 != 0) {
            if (arg1 == 1) {
                var7 = class118.method861(arg6, arg3, arg2);
            } else if (arg1 != 2) {
                if (~arg1 == -4) {
                    var7 = class124.method896(arg6, arg3, arg2);
                }
            } else {
                var7 = class92.method693(arg6, arg3, arg2);
            }
        } else {
            var7 = class132.method928(arg6, arg3, arg2);
        }
        boolean var9 = true;
        boolean var10 = false;
        if (arg0 <= -95) {
            int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
            boolean var12 = false;
            int var13 = 3 & (int) var7 >> 20;
            int var14 = (int) var7 >> 14 & 31;
            class135 var15 = class209.method1447(var11, -6653);
            if (var15.method947((byte) 92)) {
                class126.method900(0, arg3, arg6, var15, arg2);
            }
            if (var7 != 0L) {
                if (~arg1 == -1) {
                    class253.method1721(arg6, arg3, arg2);
                    if (~var15.field2169 != -1) {
                        arg5.method214(var13, -1, var15.field2212, arg2, var14, arg3);
                        return;
                    }
                } else if (~arg1 != -2) {
                    if (arg1 == 2) {
                        class73.method521(arg6, arg3, arg2);
                        if (~var15.field2169 != -1 && var15.field2175 + arg3 < 104 && arg2 - -var15.field2175 < 104 && arg3 - -var15.field2225 < 104 && var15.field2225 + arg2 < 104) {
                            arg5.method211(arg3, var15.field2225, (byte) 110, var13, arg2, var15.field2175, var15.field2212);
                            return;
                        }
                        return;
                    }
                    if (~arg1 == -4) {
                        class266.method1796(arg6, arg3, arg2);
                        if (~var15.field2169 == -2) {
                            arg5.method205(arg3, arg2, -83);
                            return;
                        }
                    }
                } else {
                    class241.method1663(arg6, arg3, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)Ljava/lang/String;")
    public static final String method1479(int arg0) {
        ++field3533;
        String var1 = "";
        String var2 = "www";
        if (class238.field3868 != null) {
            var1 = "/p=" + class238.field3868;
        }
        if (arg0 != 2000) {
            field3524 = -74;
        }
        if (class205.field3287 != 0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class135.field2192 + "/a=" + class54.field926 + var1 + "/";
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        class78.method547(14764);
        if (arg0) {
            this.field3539 = 57;
        }
        ++field3530;
    }
}
