import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class67 extends class222 {

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "I")
    private int field1062 = 0;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Z")
    private boolean field1056 = true;

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
    private int field1066 = 4;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "[B")
    private byte[] field1058 = new byte[512];

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    private int field1059 = 4;

    @OriginalMember(owner = "client!ik", name = "jb", descriptor = "I")
    private int field1069 = 1638;

    @OriginalMember(owner = "client!ik", name = "mb", descriptor = "I")
    private int field1072 = 4;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "Lsb;")
    private static class98 field1060 = class47.method368(" has logged in)3", 0);

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "Lsb;")
    public static class98 field1065 = field1060;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!ik", name = "ob", descriptor = "Llb;")
    public static class190 field1074 = new class190(64);

    @OriginalMember(owner = "client!ik", name = "ub", descriptor = "Lsb;")
    public static class98 field1080 = null;

    @OriginalMember(owner = "client!ik", name = "sb", descriptor = "[I")
    public static int[] field1078 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ik", name = "vb", descriptor = "Lsb;")
    private static class98 field1081 = class47.method368(" ", 0);

    @OriginalMember(owner = "client!ik", name = "tb", descriptor = "Lsb;")
    public static class98 field1079 = field1081;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ik", name = "ib", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ik", name = "lb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ik", name = "nb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ik", name = "qb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ik", name = "rb", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ik", name = "pb", descriptor = "[Lnj;")
    public static class82[] field1075;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "[S")
    private short[] field1061;

    @OriginalMember(owner = "client!ik", name = "kb", descriptor = "[S")
    private short[] field1070;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1073;
        if (arg0 < 35) {
            this.method288(-57);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            this.method469(arg1, var3, 5367);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V")
    private final void method467(byte arg0) {
        if (arg0 < 103) {
            method470(-77);
        }
        ++field1067;
        if (this.field1069 <= 0) {
            if (this.field1061 != null && this.field1061.length == this.field1066) {
                this.field1070 = new short[this.field1066];
                for (int var2 = 0; ~var2 > ~this.field1066; ++var2) {
                    this.field1070[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field1061 = new short[this.field1066];
            this.field1070 = new short[this.field1066];
            for (int var3 = 0; ~var3 > ~this.field1066; ++var3) {
                this.field1061[var3] = (short) ((int) (Math.pow((double) ((float) this.field1069 / 4096.0F), (double) var3) * 4096.0D));
                this.field1070[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIZ)I")
    private final int method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field1077;
        if (!arg6) {
            return -76;
        } else {
            int var8 = arg1 >> 12;
            int var9 = var8 + 1;
            int var10 = arg1 & 4095;
            int var11 = var10 + -4096;
            int var12 = var8 & 255;
            if (var9 >= arg5) {
                var9 = 0;
            }
            int var13 = this.field1058[arg3 + var12] & 3;
            int var14 = arg4 + -4096;
            int var15 = class87.field1528[var10];
            int var16 = var9 & 255;
            int var17;
            if (var13 > 1) {
                var17 = var13 != 2 ? -arg4 + -var10 : -arg4 + var10;
            } else {
                var17 = ~var13 != -1 ? -var10 + arg4 : arg4 + var10;
            }
            int var18 = this.field1058[var16 - -arg3] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? arg4 + var11 : -var11 + arg4;
            } else {
                var19 = ~var18 == -3 ? -arg4 + var11 : -var11 - arg4;
            }
            int var20 = ((var19 - var17) * var15 >> 12) + var17;
            int var21 = this.field1058[arg2 + var12] & 3;
            int var22;
            if (~var21 < -2) {
                var22 = var21 != 2 ? -var10 - var14 : var10 - var14;
            } else {
                var22 = ~var21 == -1 ? var10 - -var14 : -var10 + var14;
            }
            int var23 = 3 & this.field1058[var16 - -arg2];
            int var24;
            if (var23 <= 1) {
                var24 = var23 == 0 ? var11 + var14 : -var11 + var14;
            } else {
                var24 = ~var23 != -3 ? -var11 + -var14 : -var14 + var11;
            }
            int var25 = ((var24 - var22) * var15 >> 12) + var22;
            return ((var25 - var20) * arg0 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[II)V")
    private final void method469(int arg0, int[] arg1, int arg2) {
        ++field1068;
        int var4 = class214.field3639[arg0] * this.field1059;
        if (arg2 != 5367) {
            field1060 = null;
        }
        if (this.field1066 != 1) {
            short var5 = this.field1061[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field1070[0] << 12;
                int var7 = this.field1059 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = this.field1072 * var6 >> 12;
                int var11 = 255 & this.field1058[var9 & 255];
                int var12 = var8 & 4095;
                int var13 = var9 + 1;
                if (var7 <= var13) {
                    var13 = 0;
                }
                int var14 = 255 & this.field1058[255 & var13];
                int var15 = class87.field1528[var12];
                for (int var16 = 0; var16 < class13.field253; ++var16) {
                    int var36 = class261.field4577[var16] * this.field1072;
                    int var37 = this.method468(var15, var6 * var36 >> 12, var14, var11, var12, var10, true);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field1066; ++var17) {
                short var18 = this.field1061[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field1070[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field1072 * var19 >> 12;
                    int var22 = this.field1059 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    int var26 = 255 & this.field1058[var23 & 255];
                    if (~var22 >= ~var24) {
                        var24 = 0;
                    }
                    int var27 = 255 & this.field1058[255 & var24];
                    int var28 = class87.field1528[var25];
                    if (this.field1056 && ~(this.field1066 + -1) == ~var17) {
                        for (int var29 = 0; class13.field253 > var29; ++var29) {
                            int var30 = class261.field4577[var29] * this.field1072;
                            int var31 = this.method468(var28, var19 * var30 >> 12, var27, var26, var25, var21, true);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; var33 < class13.field253; ++var33) {
                            int var34 = class261.field4577[var33] * this.field1072;
                            int var35 = this.method468(var28, var19 * var34 >> 12, var27, var26, var25, var21, true);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field1061[0];
            int var39 = this.field1070[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field1072 * var39 >> 12;
            int var42 = this.field1059 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = 255 & this.field1058[var43 & 255];
            int var45 = var40 & 4095;
            int var46 = class87.field1528[var45];
            int var47 = var43 + 1;
            if (var47 >= var42) {
                var47 = 0;
            }
            int var48 = 255 & this.field1058[var47 & 255];
            if (!this.field1056) {
                for (int var49 = 0; ~var49 > ~class13.field253; ++var49) {
                    int var50 = class261.field4577[var49] * this.field1072;
                    int var51 = this.method468(var46, var39 * var50 >> 12, var48, var44, var45, var41, true);
                    arg1[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; class13.field253 > var52; ++var52) {
                    int var53 = class261.field4577[var52] * this.field1072;
                    int var54 = this.method468(var46, var39 * var53 >> 12, var48, var44, var45, var41, true);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = -58 % ((arg0 - 57) / 51);
        ++field1076;
        this.field1058 = class256.method1771(12371, this.field1062);
        this.method467((byte) 110);
        for (int var3 = this.field1066 + -1; var3 >= 1; --var3) {
            short var4 = this.field1061[var3];
            if (~var4 < -9 || var4 < -8) {
                return;
            }
            --this.field1066;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public static void method470(int arg0) {
        field1081 = null;
        field1075 = null;
        field1065 = null;
        field1080 = null;
        field1074 = null;
        field1079 = null;
        field1078 = null;
        if (arg0 < 90) {
            method470(71);
        }
        field1060 = null;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(II)I")
    public static int method471(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1059 = arg0.method1446(5350);
                                }
                            } else {
                                this.field1072 = arg0.method1446(5350);
                            }
                        } else {
                            this.field1062 = arg0.method1446(5350);
                        }
                    } else {
                        this.field1072 = this.field1059 = arg0.method1446(5350);
                    }
                } else {
                    this.field1069 = arg0.method1483(-82);
                    if (~this.field1069 > -1) {
                        this.field1061 = new short[this.field1066];
                        for (int var5 = 0; ~var5 > ~this.field1066; ++var5) {
                            this.field1061[var5] = (short) arg0.method1483(-84);
                        }
                    }
                }
            } else {
                this.field1066 = arg0.method1446(5350);
            }
        } else {
            this.field1056 = ~arg0.method1446(5350) == -2;
        }
        if (arg1) {
            method470(60);
        }
        ++field1071;
    }
}
