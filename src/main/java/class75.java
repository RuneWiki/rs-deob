import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class75 extends class149 {

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public int field1013 = 4;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field1003 = 1638;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "Z")
    public boolean field1005 = true;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public int field1015 = 4;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "[B")
    private byte[] field1009 = new byte[512];

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public int field1014 = 0;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public int field1010 = 4;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "Lof;")
    public static class321 field1006 = new class321(5000);

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Ldm;")
    public static class508 field1012;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
    private short[] field1004;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "[S")
    private short[] field1008;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 4)
    public static final void method494(int arg0) {
        class479.field7009 = -1;
        class112.field1573 = arg0;
        ++field1017;
        class93.field1352 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 15)
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLtl;)V", line = 19)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1015 = arg2.method618((byte) 100);
                                }
                            } else {
                                this.field1010 = arg2.method618((byte) 100);
                            }
                        } else {
                            this.field1014 = arg2.method618((byte) 100);
                        }
                    } else {
                        this.field1010 = this.field1015 = arg2.method618((byte) 100);
                    }
                } else {
                    this.field1003 = arg2.method643((byte) 123);
                    if (this.field1003 < 0) {
                        this.field1008 = new short[this.field1013];
                        for (int var5 = 0; this.field1013 > var5; ++var5) {
                            this.field1008[var5] = (short) arg2.method643((byte) 125);
                        }
                    }
                }
            } else {
                this.field1013 = arg2.method618((byte) 100);
            }
        } else {
            this.field1005 = ~arg2.method618((byte) 100) == -2;
        }
        if (arg1 != 35) {
            field1020 = -11;
        }
        ++field1001;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIZ)I", line = 112)
    private final int method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field1019;
        if (arg6) {
            method498(43);
        }
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg4 & 4095;
        if (arg0 <= var9) {
            var9 = 0;
        }
        int var12 = var11 - 4096;
        int var13 = var9 & 255;
        int var14 = arg5 + -4096;
        int var15 = this.field1009[var10 - -arg3] & 3;
        int var16 = class328.field5033[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 == -1 ? arg5 + var11 : -var11 + arg5;
        } else {
            var17 = var15 != 2 ? -arg5 + -var11 : -arg5 + var11;
        }
        int var18 = this.field1009[arg3 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? arg5 - var12 : arg5 + var12;
        } else {
            var19 = var18 != 2 ? -var12 - arg5 : -arg5 + var12;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field1009[arg1 + var10] & 3;
        int var22;
        if (var21 > 1) {
            var22 = ~var21 == -3 ? var11 - var14 : -var11 + -var14;
        } else {
            var22 = ~var21 == -1 ? var11 + var14 : -var11 + var14;
        }
        int var23 = this.field1009[var13 - -arg1] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var12 - -var14 : var14 - var12;
        } else {
            var24 = var23 != 2 ? -var12 + -var14 : -var14 + var12;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)I", line = 187)
    public static final int method496(int arg0, int arg1) {
        if (arg0 != 261573) {
            method498(117);
        }
        ++field1007;
        return (arg1 & 261573) >> 11;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V", line = 200)
    private final void method497(int arg0) {
        if (~this.field1003 >= -1) {
            if (this.field1008 != null && this.field1008.length == this.field1013) {
                this.field1004 = new short[this.field1013];
                for (int var2 = 0; ~this.field1013 < ~var2; ++var2) {
                    this.field1004[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1004 = new short[this.field1013];
            this.field1008 = new short[this.field1013];
            for (int var3 = 0; ~this.field1013 < ~var3; ++var3) {
                this.field1008[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1003 / 4096.0F), (double) var3)));
                this.field1004[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field1016;
        int var4 = -53 / ((-54 - arg0) / 63);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I", line = 242)
    public final int[] method92(int arg0, int arg1) {
        ++field1011;
        if (arg0 != -10835) {
            method494(125);
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 92);
        if (super.field2152.field7051) {
            this.method499(arg1, (byte) 25, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 268)
    public final void method99(int arg0) {
        ++field1002;
        this.field1009 = class275.method1744(-126, this.field1014);
        if (arg0 >= -86) {
            this.method92(118, 96);
        }
        this.method497(-120);
        for (int var2 = this.field1013 + -1; var2 >= 1; --var2) {
            short var3 = this.field1008[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1013;
        }
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V", line = 313)
    public static void method498(int arg0) {
        field1006 = null;
        if (arg0 == 9863) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB[I)V", line = 331)
    public final void method499(int arg0, byte arg1, int[] arg2) {
        ++field1018;
        int var4 = class185.field2613[arg0] * this.field1015;
        int var5 = 81 % ((arg1 - 65) / 33);
        if (~this.field1013 == -2) {
            int var6 = this.field1004[0] << 12;
            short var7 = this.field1008[0];
            int var8 = this.field1010 * var6 >> 12;
            int var9 = this.field1015 * var6 >> 12;
            int var10 = var4 * var6 >> 12;
            int var11 = var10 >> 12;
            int var12 = var11 + 1;
            int var13 = var10 & 4095;
            if (~var9 >= ~var12) {
                var12 = 0;
            }
            int var14 = this.field1009[var11 & 255] & 255;
            int var15 = class328.field5033[var13];
            int var16 = 255 & this.field1009[255 & var12];
            if (!this.field1005) {
                for (int var17 = 0; class316.field4838 > var17; ++var17) {
                    int var18 = class197.field2791[var17] * this.field1010;
                    int var19 = this.method495(var8, var16, var15, var14, var6 * var18 >> 12, var13, false);
                    arg2[var17] = var7 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; ~class316.field4838 < ~var20; ++var20) {
                    int var21 = class197.field2791[var20] * this.field1010;
                    int var22 = this.method495(var8, var16, var15, var14, var6 * var21 >> 12, var13, false);
                    int var23 = var7 * var22 >> 12;
                    arg2[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field1008[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field1004[0] << 12;
                int var26 = this.field1015 * var25 >> 12;
                int var27 = this.field1010 * var25 >> 12;
                int var28 = var4 * var25 >> 12;
                int var29 = var28 >> 12;
                int var30 = var29 + 1;
                if (~var26 >= ~var30) {
                    var30 = 0;
                }
                int var31 = var28 & 4095;
                int var32 = 255 & this.field1009[255 & var29];
                int var33 = this.field1009[255 & var30] & 255;
                int var34 = class328.field5033[var31];
                for (int var35 = 0; ~class316.field4838 < ~var35; ++var35) {
                    int var55 = class197.field2791[var35] * this.field1010;
                    int var56 = this.method495(var27, var33, var34, var32, var25 * var55 >> 12, var31, false);
                    arg2[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field1013 < ~var36; ++var36) {
                short var37 = this.field1008[var36];
                if (var37 > 8 || ~var37 > 7) {
                    int var38 = this.field1004[var36] << 12;
                    int var39 = this.field1010 * var38 >> 12;
                    int var40 = this.field1015 * var38 >> 12;
                    int var41 = var4 * var38 >> 12;
                    int var42 = var41 >> 12;
                    int var43 = var42 + 1;
                    if (~var40 >= ~var43) {
                        var43 = 0;
                    }
                    int var44 = var41 & 4095;
                    int var45 = 255 & this.field1009[var42 & 255];
                    int var46 = class328.field5033[var44];
                    int var47 = 255 & this.field1009[var43 & 255];
                    if (this.field1005 && this.field1013 + -1 == var36) {
                        for (int var48 = 0; var48 < class316.field4838; ++var48) {
                            int var49 = class197.field2791[var48] * this.field1010;
                            int var50 = this.method495(var39, var47, var46, var45, var38 * var49 >> 12, var44, false);
                            int var51 = (var37 * var50 >> 12) + arg2[var48];
                            arg2[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; ~class316.field4838 < ~var52; ++var52) {
                            int var53 = class197.field2791[var52] * this.field1010;
                            int var54 = this.method495(var39, var47, var46, var45, var38 * var53 >> 12, var44, false);
                            arg2[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }
}
