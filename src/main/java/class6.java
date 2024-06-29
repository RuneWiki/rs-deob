import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class185 {

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    private int field87 = 4;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    private int field85 = 1638;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[B")
    private byte[] field90 = new byte[512];

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field96 = 4;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    private int field88 = 0;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "Z")
    private boolean field95 = true;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    private int field89 = 4;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "[I")
    public static int[] field102 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "[Lob;")
    public static class133[] field94 = new class133[50];

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "[S")
    private short[] field86;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "[S")
    private short[] field98;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIZIZ)Lpf;")
    public static final class294 method25(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        ++field101;
        if (arg1 != -29784) {
            return null;
        } else {
            class211 var5 = null;
            if (class205.field3072 != null) {
                var5 = new class211(arg3, class205.field3072, class297.field4700[arg3], 1000000);
            }
            class49.field786[arg3] = class2.field20.method1547(arg1 + 29534, class85.field1359, arg3, var5);
            if (arg4) {
                class49.field786[arg3].method1458((byte) 12);
            }
            return new class294(class49.field786[arg3], arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIZII)I")
    private final int method26(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field97;
        int var8 = arg0 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var9 + 1;
        if (arg6 <= var11) {
            var11 = 0;
        }
        int var12 = class243.field3639[var10];
        int var13 = var9 & 255;
        int var14 = var11 & 255;
        int var15 = var10 + -4096;
        int var16 = this.field90[var13 - -arg1] & 3;
        int var17;
        if (~var16 < -2) {
            var17 = var16 != 2 ? -arg0 + -var10 : -arg0 + var10;
        } else {
            var17 = var16 == 0 ? arg0 + var10 : -var10 + arg0;
        }
        int var18 = 3 & this.field90[arg1 + var14];
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? arg0 + var15 : -var15 + arg0;
        } else {
            var19 = ~var18 != -3 ? -arg0 + -var15 : -arg0 + var15;
        }
        int var20 = this.field90[arg2 + var13] & 3;
        int var21 = ((-var17 + var19) * var12 >> 12) + var17;
        if (arg4) {
            field94 = null;
        }
        int var22;
        if (var20 > 1) {
            var22 = var20 != 2 ? -var8 + -var10 : -var8 + var10;
        } else {
            var22 = ~var20 != -1 ? -var10 + var8 : var8 + var10;
        }
        int var23 = 3 & this.field90[arg2 + var14];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var8 + var15 : -var15 + var8;
        } else {
            var24 = var23 == 2 ? -var8 + var15 : -var15 - var8;
        }
        int var25 = ((-var22 + var24) * var12 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            method33(-126, (byte) -15, -100, 101, 109, -77);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field96 = arg1.method1593((byte) 27);
                                }
                            } else {
                                this.field87 = arg1.method1593((byte) 27);
                            }
                        } else {
                            this.field88 = arg1.method1593((byte) 27);
                        }
                    } else {
                        this.field87 = this.field96 = arg1.method1593((byte) 27);
                    }
                } else {
                    this.field85 = arg1.method1606((byte) 77);
                    if (this.field85 < 0) {
                        this.field98 = new short[this.field89];
                        for (int var5 = 0; var5 < this.field89; ++var5) {
                            this.field98[var5] = (short) arg1.method1606((byte) 77);
                        }
                    }
                }
            } else {
                this.field89 = arg1.method1593((byte) 27);
            }
        } else {
            this.field95 = arg1.method1593((byte) 27) == 1;
        }
        ++field93;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([III)V")
    private final void method28(int[] arg0, int arg1, int arg2) {
        ++field92;
        int var4 = class85.field1356[arg1] * this.field96;
        if (arg2 < 38) {
            this.field88 = 54;
        }
        if (this.field89 == 1) {
            int var5 = this.field86[0] << 12;
            int var6 = var4 * var5 >> 12;
            int var7 = this.field96 * var5 >> 12;
            int var8 = this.field87 * var5 >> 12;
            short var9 = this.field98[0];
            int var10 = var6 >> 12;
            int var11 = var10 + 1;
            int var12 = this.field90[var10 & 255] & 255;
            if (var11 >= var7) {
                var11 = 0;
            }
            int var13 = var6 & 4095;
            int var14 = 255 & this.field90[255 & var11];
            int var15 = class243.field3639[var13];
            if (this.field95) {
                for (int var16 = 0; ~var16 > ~class174.field2648; ++var16) {
                    int var17 = class153.field2304[var16] * this.field87;
                    int var18 = this.method26(var13, var12, var14, var15, false, var5 * var17 >> 12, var8);
                    int var19 = var9 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class174.field2648; ++var20) {
                    int var21 = class153.field2304[var20] * this.field87;
                    int var22 = this.method26(var13, var12, var14, var15, false, var5 * var21 >> 12, var8);
                    arg0[var20] = var9 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field98[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field86[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field96 * var24 >> 12;
                int var27 = var25 >> 12;
                int var28 = var27 + 1;
                if (~var28 <= ~var26) {
                    var28 = 0;
                }
                int var29 = this.field87 * var24 >> 12;
                int var30 = 255 & this.field90[var28 & 255];
                int var31 = 255 & this.field90[var27 & 255];
                int var32 = var25 & 4095;
                int var33 = class243.field3639[var32];
                for (int var34 = 0; var34 < class174.field2648; ++var34) {
                    int var54 = class153.field2304[var34] * this.field87;
                    int var55 = this.method26(var32, var31, var30, var33, false, var24 * var54 >> 12, var29);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field89; ++var35) {
                short var36 = this.field98[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field86[var35] << 12;
                    int var38 = this.field87 * var37 >> 12;
                    int var39 = this.field96 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = 255 & this.field90[255 & var41];
                    int var43 = var41 + 1;
                    if (~var43 <= ~var39) {
                        var43 = 0;
                    }
                    int var44 = var40 & 4095;
                    int var45 = class243.field3639[var44];
                    int var46 = 255 & this.field90[var43 & 255];
                    if (this.field95 && ~(this.field89 - 1) == ~var35) {
                        for (int var47 = 0; var47 < class174.field2648; ++var47) {
                            int var48 = class153.field2304[var47] * this.field87;
                            int var49 = this.method26(var44, var42, var46, var45, false, var37 * var48 >> 12, var38);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class174.field2648 > var51; ++var51) {
                            int var52 = class153.field2304[var51] * this.field87;
                            int var53 = this.method26(var44, var42, var46, var45, false, var37 * var52 >> 12, var38);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BI)V")
    public static final void method29(byte[] arg0, int arg1) {
        class248 var2 = new class248(arg0);
        var2.field3748 = arg0.length + -2;
        ++field91;
        class215.field3224 = var2.method1575(false);
        class220.field3315 = new int[class215.field3224];
        class10.field139 = new int[class215.field3224];
        class101.field1587 = new boolean[class215.field3224];
        class273.field4104 = new int[class215.field3224];
        class198.field3011 = new byte[class215.field3224][];
        class10.field129 = new byte[class215.field3224][];
        class82.field1312 = new int[class215.field3224];
        var2.field3748 = arg0.length + -(class215.field3224 * 8) + -7;
        if (arg1 >= 108) {
            class162.field2494 = var2.method1575(false);
            class256.field3915 = var2.method1575(false);
            int var3 = 1 + (var2.method1593((byte) 27) & 255);
            for (int var4 = 0; ~var4 > ~class215.field3224; ++var4) {
                class10.field139[var4] = var2.method1575(false);
            }
            for (int var5 = 0; class215.field3224 > var5; ++var5) {
                class273.field4104[var5] = var2.method1575(false);
            }
            for (int var6 = 0; ~var6 > ~class215.field3224; ++var6) {
                class220.field3315[var6] = var2.method1575(false);
            }
            for (int var7 = 0; class215.field3224 > var7; ++var7) {
                class82.field1312[var7] = var2.method1575(false);
            }
            var2.field3748 = 3 - (var3 * 3 - (arg0.length + -7 - class215.field3224 * 8));
            class183.field2775 = new int[var3];
            for (int var8 = 1; ~var3 < ~var8; ++var8) {
                class183.field2775[var8] = var2.method1587(-125);
                if (class183.field2775[var8] == 0) {
                    class183.field2775[var8] = 1;
                }
            }
            var2.field3748 = 0;
            for (int var9 = 0; var9 < class215.field3224; ++var9) {
                int var10 = class220.field3315[var9];
                int var11 = class82.field1312[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                byte[] var14 = new byte[var12];
                class10.field129[var9] = var14;
                class198.field3011[var9] = var13;
                int var15 = var2.method1593((byte) 27);
                boolean var16 = false;
                if ((var15 & 1) == 0) {
                    for (int var17 = 0; var17 < var12; ++var17) {
                        var14[var17] = var2.method1604(4);
                    }
                    if ((var15 & 2) != 0) {
                        for (int var18 = 0; var12 > var18; ++var18) {
                            byte var19 = var13[var18] = var2.method1604(4);
                            var16 |= var19 != -1;
                        }
                    }
                } else {
                    int var20 = 0;
                    label101: while (true) {
                        if (~var10 >= ~var20) {
                            if (~(2 & var15) == -1) {
                                break;
                            }
                            int var21 = 0;
                            while (true) {
                                if (var21 >= var10) {
                                    break label101;
                                }
                                for (int var22 = 0; ~var11 < ~var22; ++var22) {
                                    byte var23 = var13[var10 * var22 + var21] = var2.method1604(4);
                                    var16 |= var23 != -1;
                                }
                                ++var21;
                            }
                        }
                        for (int var24 = 0; var24 < var11; ++var24) {
                            var14[var10 * var24 + var20] = var2.method1604(4);
                        }
                        ++var20;
                    }
                }
                class101.field1587[var9] = var16;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        this.field90 = class129.method807(arg0 + 9, this.field88);
        this.method31((byte) 88);
        if (arg0 != -9) {
            this.method28((int[]) null, -69, 8);
        }
        for (int var2 = this.field89 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field98[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field89;
        }
        ++field104;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V")
    private final void method31(byte arg0) {
        ++field99;
        if (~this.field85 < -1) {
            this.field86 = new short[this.field89];
            this.field98 = new short[this.field89];
            for (int var2 = 0; ~var2 > ~this.field89; ++var2) {
                this.field98[var2] = (short) ((int) (Math.pow((double) ((float) this.field85 / 4096.0F), (double) var2) * 4096.0D));
                this.field86[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field98 != null && ~this.field98.length == ~this.field89) {
            this.field86 = new short[this.field89];
            for (int var3 = 0; ~var3 > ~this.field89; ++var3) {
                this.field86[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = -42 % ((arg0 - -13) / 51);
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(Z)V")
    public static void method32(boolean arg0) {
        field94 = null;
        if (!arg0) {
            field102 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBIIII)V")
    public static final void method33(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field100;
        if (arg1 != -67) {
            method32(false);
        }
        int var8 = arg3 + 1;
        class64.method429(class23.field284[arg3], arg0, (byte) 94, arg5, arg2);
        int var9 = arg4 - 1;
        class64.method429(class23.field284[arg4], arg0, (byte) 113, arg5, arg2);
        for (int var6 = var8; ~var9 <= ~var6; ++var6) {
            int[] var7 = class23.field284[var6];
            var7[arg0] = var7[arg2] = arg5;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field103;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            this.method28(var3, arg0, 83);
        }
        if (arg1 <= 70) {
            this.field87 = -115;
        }
        return var3;
    }
}
