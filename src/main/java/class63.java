import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class63 extends class615 {

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public int field967 = 4;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public int field972 = 1638;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public int field971 = 0;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public int field975 = 4;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public int field963 = 4;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[B")
    private byte[] field968 = new byte[512];

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "Z")
    public boolean field976 = true;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[S")
    private short[] field970;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "[S")
    private short[] field977;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[[B")
    public static byte[][] field965;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)V", line = 8)
    public final void method506(int[] arg0, int arg1, int arg2) {
        ++field978;
        int var4 = class402.field5353[arg2] * this.field963;
        if (arg1 == -31063) {
            if (~this.field967 == -2) {
                short var5 = this.field970[0];
                int var6 = this.field977[0] << 12;
                int var7 = this.field963 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field975 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = class75.field1186[var12];
                int var14 = this.field968[255 & var10] & 255;
                int var15 = this.field968[255 & var11] & 255;
                if (!this.field976) {
                    for (int var16 = 0; class505.field6740 > var16; ++var16) {
                        int var17 = class168.field2599[var16] * this.field975;
                        int var18 = this.method509(var12, var13, var9, var6 * var17 >> 12, var15, (byte) 6, var14);
                        arg0[var16] = var5 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; class505.field6740 > var19; ++var19) {
                        int var20 = class168.field2599[var19] * this.field975;
                        int var21 = this.method509(var12, var13, var9, var6 * var20 >> 12, var15, (byte) 6, var14);
                        int var22 = var5 * var21 >> 12;
                        arg0[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field970[0];
                if (var23 > 8 || var23 < -8) {
                    int var24 = this.field977[0] << 12;
                    int var25 = this.field963 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field975 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = var28 + 1;
                    if (~var25 >= ~var29) {
                        var29 = 0;
                    }
                    int var30 = var26 & 4095;
                    int var31 = this.field968[255 & var29] & 255;
                    int var32 = class75.field1186[var30];
                    int var33 = this.field968[var28 & 255] & 255;
                    for (int var34 = 0; class505.field6740 > var34; ++var34) {
                        int var54 = class168.field2599[var34] * this.field975;
                        int var55 = this.method509(var30, var32, var27, var24 * var54 >> 12, var31, (byte) 6, var33);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; var35 < this.field967; ++var35) {
                    short var36 = this.field970[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field977[var35] << 12;
                        int var38 = this.field963 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field975 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var41 + 1;
                        if (var42 >= var38) {
                            var42 = 0;
                        }
                        int var43 = var39 & 4095;
                        int var44 = 255 & this.field968[var42 & 255];
                        int var45 = class75.field1186[var43];
                        int var46 = this.field968[var41 & 255] & 255;
                        if (this.field976 && this.field967 - 1 == var35) {
                            for (int var47 = 0; var47 < class505.field6740; ++var47) {
                                int var48 = class168.field2599[var47] * this.field975;
                                int var49 = this.method509(var43, var45, var40, var37 * var48 >> 12, var44, (byte) 6, var46);
                                int var50 = arg0[var47] - -(var36 * var49 >> 12);
                                arg0[var47] = 2048 - -(var50 >> 1);
                            }
                        } else {
                            for (int var51 = 0; ~class505.field6740 < ~var51; ++var51) {
                                int var52 = class168.field2599[var51] * this.field975;
                                int var53 = this.method509(var43, var45, var40, var37 * var52 >> 12, var44, (byte) 6, var46);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILeh;)V", line = 168)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field963 = arg2.method2034(255);
                                }
                            } else {
                                this.field975 = arg2.method2034(255);
                            }
                        } else {
                            this.field971 = arg2.method2034(255);
                        }
                    } else {
                        this.field975 = this.field963 = arg2.method2034(255);
                    }
                } else {
                    this.field972 = arg2.method2022(-29089);
                    if (~this.field972 > -1) {
                        this.field970 = new short[this.field967];
                        for (int var5 = 0; this.field967 > var5; ++var5) {
                            this.field970[var5] = (short) arg2.method2022(-29089);
                        }
                    }
                }
            } else {
                this.field967 = arg2.method2034(255);
            }
        } else {
            this.field976 = arg2.method2034(255) == 1;
        }
        ++field964;
        if (arg0 <= 44) {
            this.field976 = false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 260)
    private final void method507(byte arg0) {
        ++field966;
        if (arg0 == 3) {
            if (this.field972 > 0) {
                this.field977 = new short[this.field967];
                this.field970 = new short[this.field967];
                for (int var2 = 0; ~var2 > ~this.field967; ++var2) {
                    this.field970[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field972 / 4096.0F), (double) var2)));
                    this.field977[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field970 != null && ~this.field970.length == ~this.field967) {
                this.field977 = new short[this.field967];
                for (int var3 = 0; this.field967 > var3; ++var3) {
                    this.field977[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 333)
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I", line = 307)
    public final int[] method8(int arg0, byte arg1) {
        ++field969;
        if (arg1 != -18) {
            return null;
        } else {
            int[] var3 = super.field8125.method298(arg0, -125);
            if (super.field8125.field579) {
                this.method506(var3, -31063, arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 341)
    public final void method10(int arg0) {
        ++field974;
        this.field968 = class187.method1231((byte) -51, this.field971);
        this.method507((byte) 3);
        if (arg0 == 12404) {
            for (int var2 = this.field967 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field970[var2];
                if (~var3 < -9 || ~var3 > 7) {
                    return;
                }
                --this.field967;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 371)
    public static void method508(int arg0) {
        field965 = null;
        if (arg0 > -19) {
            method508(41);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBI)I", line = 391)
    private final int method509(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field962;
        int var8 = arg3 >> 12;
        int var9 = var8 - -1;
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        if (~arg2 >= ~var9) {
            var9 = 0;
        }
        int var12 = var11 - 4096;
        int var13 = arg0 - 4096;
        int var14 = var9 & 255;
        if (arg5 != 6) {
            this.method509(-111, 45, -50, -15, -78, (byte) 33, 119);
        }
        int var15 = this.field968[arg6 + var10] & 3;
        int var16 = class75.field1186[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 != -1 ? -var11 + arg0 : arg0 + var11;
        } else {
            var17 = ~var15 != -3 ? -arg0 + -var11 : -arg0 + var11;
        }
        int var18 = this.field968[arg6 + var14] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var12 - -arg0 : -var12 + arg0;
        } else {
            var19 = ~var18 != -3 ? -var12 - arg0 : var12 - arg0;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field968[arg4 + var10] & 3;
        int var22;
        if (var21 > 1) {
            var22 = var21 != 2 ? -var11 + -var13 : -var13 + var11;
        } else {
            var22 = ~var21 == -1 ? var11 - -var13 : -var11 + var13;
        }
        int var23 = this.field968[arg4 + var14] & 3;
        int var24;
        if (var23 > 1) {
            var24 = var23 != 2 ? -var12 + -var13 : -var13 + var12;
        } else {
            var24 = var23 == 0 ? var12 + var13 : -var12 + var13;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 470)
    public static final void method510(int arg0, int arg1) {
        ++field973;
        int var2 = class642.field8626 - class328.field4520;
        if (var2 >= 100) {
            class173.field2668 = -1;
            class376.field5068 = -1;
            class140.field2254 = 1;
        } else {
            int var3 = (int) class463.field6263;
            if (arg0 == -3) {
                if (~var3 > ~(class619.field8214 >> 8)) {
                    var3 = class619.field8214 >> 8;
                }
                if (class141.field2262[4] && var3 < class198.field2883[4] + 128) {
                    var3 = class198.field2883[4] + 128;
                }
                int var4 = (int) class42.field602 + class256.field3549 & 16383;
                class295.method1813(var4, var3, (var3 >> 3) * 3 + 600 << 2, 121, arg1, class338.field4683, class193.field2827, -200 + class315.method1878(class199.field2897.field8620, 2921, class29.field476, class199.field2897.field8612));
                float var5 = 1.0F - (float) ((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                class259.field3563 = (int) ((float) (-class124.field2082 + class259.field3563) * var5 + (float) class124.field2082);
                class553.field7350 = (int) ((float) (class553.field7350 - class353.field4814) * var5 + (float) class353.field4814);
                class510.field6806 = (int) ((float) (-class62.field961 + class510.field6806) * var5 + (float) class62.field961);
                class643.field8632 = (int) ((float) (class643.field8632 - class696.field9775) * var5 + (float) class696.field9775);
                int var6 = -class251.field3462 + class331.field4539;
                if (~var6 >= -8193) {
                    if (var6 < -8192) {
                        var6 += 16384;
                    }
                } else {
                    var6 -= 16384;
                }
                class331.field4539 = (int) ((float) var6 * var5 + (float) class251.field3462);
                class331.field4539 &= 16383;
            }
        }
    }
}
