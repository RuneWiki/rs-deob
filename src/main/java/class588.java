import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class588 extends class56 {

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "I")
    private int field8279 = 0;

    @OriginalMember(owner = "client!eba", name = "N", descriptor = "[S")
    private short[] field8286 = new short[257];

    @OriginalMember(owner = "client!eba", name = "R", descriptor = "I")
    public static int field8290 = 0;

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!eba", name = "I", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!eba", name = "K", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!eba", name = "L", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!eba", name = "M", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!eba", name = "P", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!eba", name = "Q", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!eba", name = "U", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!eba", name = "O", descriptor = "[I")
    private int[] field8287;

    @OriginalMember(owner = "client!eba", name = "S", descriptor = "[I")
    private int[] field8291;

    @OriginalMember(owner = "client!eba", name = "T", descriptor = "[Ls;")
    public static class278[] field8292;

    @OriginalMember(owner = "client!eba", name = "D", descriptor = "[[I")
    private int[][] field8278;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)V")
    private final void method3328(int arg0) {
        ++field8288;
        int[] var2 = this.field8278[0];
        int[] var3 = this.field8278[1];
        int[] var4 = this.field8278[this.field8278.length + -2];
        int[] var5 = this.field8278[this.field8278.length + -1];
        this.field8287 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (-var2[1] - -var3[1]) };
        this.field8291 = new int[] { var4[0] + -var5[0] + var4[0], var4[arg0] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        if (this.field8278 == null) {
            this.field8278 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field8280;
        if (~this.field8278.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field8279 == 2) {
                this.method3328(1);
            }
            class135.method965(false);
            if (arg0 != 7) {
                this.field8278 = null;
            }
            this.method3332(false);
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
    public class588() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            this.method3332(false);
        }
        if (~arg2 == -1) {
            this.field8279 = arg1.method3750((byte) 35);
            this.field8278 = new int[arg1.method3750((byte) 35)][2];
            for (int var4 = 0; ~this.field8278.length < ~var4; ++var4) {
                this.field8278[var4][0] = arg1.method3757((byte) -65);
                this.field8278[var4][1] = arg1.method3757((byte) -65);
            }
        }
        ++field8281;
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)V")
    public static void method3329(byte arg0) {
        field8292 = null;
        if (arg0 != -14) {
            field8293 = -83;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)[I")
    private final int[] method3330(int arg0, byte arg1) {
        ++field8289;
        if (~arg0 > -1) {
            return this.field8287;
        } else if (arg1 <= 125) {
            return null;
        } else {
            return ~arg0 <= ~this.field8278.length ? this.field8291 : this.field8278[arg0];
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILql;[[B)V")
    public static final void method3331(int arg0, class735 arg1, byte[][] arg2) {
        ++field8282;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg1.field6366 < ~var4; ++var4) {
            class485.method2904((byte) -120);
            for (int var9 = 0; ~(class336.field4683 >> 3) < ~var9; ++var9) {
                for (int var10 = 0; var10 < class700.field9768 >> 3; ++var10) {
                    int var11 = class745.field10350[var4][var9][var10];
                    if (~var11 != 0) {
                        int var12 = var11 >> 24 & 3;
                        if (!arg1.field6356 || var12 == 0) {
                            int var13 = var11 >> 1 & 3;
                            int var14 = var11 >> 14 & 1023;
                            int var15 = (var11 & 16383) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; ~var17 > ~class207.field2720.length; ++var17) {
                                if (class207.field2720[var17] == var16 && arg2[var17] != null) {
                                    class675 var18 = new class675(arg2[var17]);
                                    arg1.method2678(var12, var15, var18, var9 * 8, class147.field2114, var13, var14, var4, (byte) -114, var10 * 8);
                                    arg1.method4115(var10 * 8, var12, var13, var18, var15, var3[0] != -1 ? null : var3, arg0 + -43, class268.field3831, var14, var9 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~arg1.field6366; ++var5) {
            class485.method2904((byte) 123);
            for (int var6 = 0; class336.field4683 >> 3 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~(class700.field9768 >> 3); ++var7) {
                    int var8 = class745.field10350[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method2675(8, var7 * 8, var6 * 8, 8, var5, 29274);
                    }
                }
            }
        }
        if (var3[0] != arg0) {
            class745.field10351 = class192.field2556.method1979(var3[1], 4, class6.field64, var3[2], var3[3], var3[0]);
            class175.field2360 = var3[4];
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field8284;
        if (!arg1) {
            this.method364(-39);
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, arg0);
            for (int var5 = 0; var5 < class328.field4576; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field8286[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
    private final void method3332(boolean arg0) {
        int var2 = this.field8279;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field8278.length + -1 && ~this.field8278[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field8278[var5 + -1];
                    int[] var7 = this.field8278[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class97.field1172[(var8 & 8181) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field8286[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field8278.length + -1) < ~var14 && ~var13 <= ~this.field8278[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field8278[var14 + -1];
                    int[] var16 = this.field8278[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field8286[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field8278.length + -1 && var21 >= this.field8278[var22][0]; ++var22) {
                }
                int[] var23 = this.field8278[var22 + -1];
                int[] var24 = this.field8278[var22];
                int var25 = this.method3330(var22 + -2, (byte) 126)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3330(var22 - -1, (byte) 126)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 - -var26 + -var25 + var28;
                int var32 = var25 - var26 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - -var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field8286[var20] = (short) var38;
            }
        }
        if (arg0) {
            this.method3330(-107, (byte) -115);
        }
        ++field8283;
    }
}
