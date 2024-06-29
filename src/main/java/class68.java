import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class68 extends class642 {

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public int field1061 = 0;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public int field1067 = 1638;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "[B")
    private byte[] field1065 = new byte[512];

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public int field1073 = 4;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public int field1074 = 4;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public int field1071 = 4;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "Z")
    public boolean field1076 = true;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "Ltca;")
    public static class545 field1068 = new class545();

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "[S")
    private short[] field1066;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "[S")
    private short[] field1072;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILgk;B)V", line = 8)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 < 29) {
            this.field1072 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1071 = arg1.method3115(29871);
                                }
                            } else {
                                this.field1074 = arg1.method3115(29871);
                            }
                        } else {
                            this.field1061 = arg1.method3115(29871);
                        }
                    } else {
                        this.field1074 = this.field1071 = arg1.method3115(29871);
                    }
                } else {
                    this.field1067 = arg1.method3129(117);
                    if (this.field1067 < 0) {
                        this.field1066 = new short[this.field1073];
                        for (int var5 = 0; ~var5 > ~this.field1073; ++var5) {
                            this.field1066[var5] = (short) arg1.method3129(102);
                        }
                    }
                }
            } else {
                this.field1073 = arg1.method3115(29871);
            }
        } else {
            this.field1076 = arg1.method3115(29871) == 1;
        }
        ++field1062;
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V", line = 104)
    public static void method399(int arg0) {
        field1068 = null;
        if (arg0 != 4) {
            field1068 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIIIII)I", line = 114)
    private final int method400(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 113) {
            return 15;
        } else {
            ++field1069;
            int var8 = arg1 >> 12;
            int var9 = var8 - -1;
            int var10 = arg1 & 4095;
            int var11 = var8 & 255;
            if (var9 >= arg6) {
                var9 = 0;
            }
            int var12 = arg3 + -4096;
            int var13 = var10 + -4096;
            int var14 = var9 & 255;
            int var15 = class471.field6785[var10];
            int var16 = this.field1065[arg2 + var11] & 3;
            int var17;
            if (~var16 >= -2) {
                var17 = var16 != 0 ? arg3 - var10 : arg3 + var10;
            } else {
                var17 = var16 == 2 ? -arg3 + var10 : -var10 - arg3;
            }
            int var18 = this.field1065[var14 - -arg2] & 3;
            int var19;
            if (~var18 < -2) {
                var19 = var18 == 2 ? var13 - arg3 : -arg3 + -var13;
            } else {
                var19 = ~var18 != -1 ? arg3 - var13 : arg3 + var13;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = 3 & this.field1065[arg4 + var11];
            int var22;
            if (~var21 >= -2) {
                var22 = ~var21 != -1 ? -var10 + var12 : var10 + var12;
            } else {
                var22 = ~var21 == -3 ? var10 - var12 : -var10 + -var12;
            }
            int var23 = 3 & this.field1065[arg4 + var14];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var13 - -var12 : -var13 + var12;
            } else {
                var24 = var23 == 2 ? -var12 + var13 : -var13 - var12;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return var20 - -((-var20 + var25) * arg5 >> 12);
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V", line = 421)
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[II)V", line = 202)
    public final void method401(int arg0, int[] arg1, int arg2) {
        ++field1070;
        int var4 = class400.field6026[arg0] * this.field1071;
        int var5 = -76 % ((8 - arg2) / 48);
        if (~this.field1073 != -2) {
            short var6 = this.field1066[0];
            if (~var6 < -9 || ~var6 > 7) {
                int var7 = this.field1072[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = this.field1074 * var7 >> 12;
                int var10 = this.field1071 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 + 1;
                if (~var12 <= ~var10) {
                    var12 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = 255 & this.field1065[var12 & 255];
                int var15 = this.field1065[var11 & 255] & 255;
                int var16 = class471.field6785[var13];
                for (int var17 = 0; ~class338.field4909 < ~var17; ++var17) {
                    int var37 = class542.field8026[var17] * this.field1074;
                    int var38 = this.method400((byte) 113, var7 * var37 >> 12, var15, var13, var14, var16, var9);
                    arg1[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; var18 < this.field1073; ++var18) {
                short var19 = this.field1066[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field1072[var18] << 12;
                    int var21 = this.field1074 * var20 >> 12;
                    int var22 = this.field1071 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var24 + 1;
                    if (~var22 >= ~var25) {
                        var25 = 0;
                    }
                    int var26 = var23 & 4095;
                    int var27 = class471.field6785[var26];
                    int var28 = this.field1065[var24 & 255] & 255;
                    int var29 = this.field1065[var25 & 255] & 255;
                    if (this.field1076 && this.field1073 + -1 == var18) {
                        for (int var30 = 0; ~class338.field4909 < ~var30; ++var30) {
                            int var31 = class542.field8026[var30] * this.field1074;
                            int var32 = this.method400((byte) 113, var20 * var31 >> 12, var28, var26, var29, var27, var21);
                            int var33 = (var19 * var32 >> 12) + arg1[var30];
                            arg1[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; ~class338.field4909 < ~var34; ++var34) {
                            int var35 = class542.field8026[var34] * this.field1074;
                            int var36 = this.method400((byte) 113, var20 * var35 >> 12, var28, var26, var29, var27, var21);
                            arg1[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field1072[0] << 12;
            short var40 = this.field1066[0];
            int var41 = this.field1071 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = this.field1074 * var39 >> 12;
            int var44 = var42 >> 12;
            int var45 = var44 - -1;
            int var46 = var42 & 4095;
            if (var45 >= var41) {
                var45 = 0;
            }
            int var47 = 255 & this.field1065[255 & var44];
            int var48 = this.field1065[var45 & 255] & 255;
            int var49 = class471.field6785[var46];
            if (!this.field1076) {
                for (int var50 = 0; ~var50 > ~class338.field4909; ++var50) {
                    int var51 = class542.field8026[var50] * this.field1074;
                    int var52 = this.method400((byte) 113, var39 * var51 >> 12, var47, var46, var48, var49, var43);
                    arg1[var50] = var40 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; class338.field4909 > var53; ++var53) {
                    int var54 = class542.field8026[var53] * this.field1074;
                    int var55 = this.method400((byte) 113, var39 * var54 >> 12, var47, var46, var48, var49, var43);
                    int var56 = var40 * var55 >> 12;
                    arg1[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[I", line = 360)
    public final int[] method3(int arg0, int arg1) {
        ++field1075;
        int[] var3 = super.field9216.method1185(arg0, -99);
        if (super.field9216.field2418) {
            this.method401(arg0, var3, -71);
        }
        if (arg1 != -9) {
            this.method1(-68, (class540) null, (byte) 2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V", line = 388)
    public final void method2(int arg0) {
        this.field1065 = class468.method2706((byte) -56, this.field1061);
        ++field1063;
        this.method402(arg0 + -6351);
        for (int var2 = this.field1073 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1066[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field1073;
        }
        if (arg0 != 6276) {
            this.field1065 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V", line = 427)
    private final void method402(int arg0) {
        ++field1064;
        if (this.field1067 <= 0) {
            if (this.field1066 != null && this.field1066.length == this.field1073) {
                this.field1072 = new short[this.field1073];
                for (int var2 = 0; ~this.field1073 < ~var2; ++var2) {
                    this.field1072[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1066 = new short[this.field1073];
            this.field1072 = new short[this.field1073];
            for (int var3 = 0; ~this.field1073 < ~var3; ++var3) {
                this.field1066[var3] = (short) ((int) (Math.pow((double) ((float) this.field1067 / 4096.0F), (double) var3) * 4096.0D));
                this.field1072[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = 5 % ((arg0 - 68) / 37);
    }
}
