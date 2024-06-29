import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class409 extends class148 {

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
    public int field6159 = 4;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public int field6157 = 4;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "[B")
    private byte[] field6153 = new byte[512];

    @OriginalMember(owner = "client!ht", name = "X", descriptor = "I")
    public int field6165 = 1638;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public int field6155 = 4;

    @OriginalMember(owner = "client!ht", name = "V", descriptor = "Z")
    public boolean field6163 = true;

    @OriginalMember(owner = "client!ht", name = "Y", descriptor = "I")
    public int field6166 = 0;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field6154 = 0;

    @OriginalMember(owner = "client!ht", name = "bb", descriptor = "[Lqv;")
    public static class308[] field6169 = new class308[8];

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!ht", name = "T", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ht", name = "W", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!ht", name = "ab", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!ht", name = "U", descriptor = "[S")
    private short[] field6162;

    @OriginalMember(owner = "client!ht", name = "Z", descriptor = "[S")
    private short[] field6167;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII)I")
    private final int method2466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6161;
        int var8 = -41 / ((arg6 - -84) / 34);
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        int var11 = arg5 & 4095;
        int var12 = var9 & 255;
        if (arg0 <= var10) {
            var10 = 0;
        }
        int var13 = arg1 - 4096;
        int var14 = var10 & 255;
        int var15 = var11 + -4096;
        int var16 = class223.field3286[var11];
        int var17 = 3 & this.field6153[arg4 + var12];
        int var18;
        if (var17 <= 1) {
            var18 = var17 != 0 ? arg1 - var11 : arg1 + var11;
        } else {
            var18 = ~var17 == -3 ? -arg1 + var11 : -arg1 + -var11;
        }
        int var19 = this.field6153[var14 - -arg4] & 3;
        int var20;
        if (~var19 >= -2) {
            var20 = var19 != 0 ? -var15 + arg1 : var15 - -arg1;
        } else {
            var20 = ~var19 == -3 ? -arg1 + var15 : -arg1 + -var15;
        }
        int var21 = 3 & this.field6153[arg3 + var12];
        int var22 = ((-var18 + var20) * var16 >> 12) + var18;
        int var23;
        if (var21 > 1) {
            var23 = var21 == 2 ? -var13 + var11 : -var11 - var13;
        } else {
            var23 = ~var21 != -1 ? -var11 + var13 : var11 - -var13;
        }
        int var24 = this.field6153[arg3 + var14] & 3;
        int var25;
        if (~var24 >= -2) {
            var25 = var24 == 0 ? var15 - -var13 : -var15 + var13;
        } else {
            var25 = ~var24 != -3 ? -var15 - var13 : -var13 + var15;
        }
        int var26 = var23 - -((-var23 + var25) * var16 >> 12);
        return ((var26 - var22) * arg2 >> 12) + var22;
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
    private final void method2467(byte arg0) {
        int var2 = 106 % ((arg0 - 8) / 45);
        ++field6168;
        if (~this.field6165 >= -1) {
            if (this.field6162 != null && this.field6162.length == this.field6155) {
                this.field6167 = new short[this.field6155];
                for (int var3 = 0; ~var3 > ~this.field6155; ++var3) {
                    this.field6167[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field6167 = new short[this.field6155];
            this.field6162 = new short[this.field6155];
            for (int var4 = 0; var4 < this.field6155; ++var4) {
                this.field6162[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6165 / 4096.0F), (double) var4)));
                this.field6167[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
    public class409() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field6164;
        int var4 = 25 / ((arg2 - -88) / 33);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field6155 = arg1.method1428(32122);
            } else {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field6157 = this.field6159 = arg1.method1428(32122);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field6166 = arg1.method1428(32122);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field6157 = arg1.method1428(32122);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field6159 = arg1.method1428(32122);
                        return;
                    }
                } else {
                    this.field6165 = arg1.method1447(29480);
                    if (this.field6165 < 0) {
                        this.field6162 = new short[this.field6155];
                        for (int var6 = 0; ~this.field6155 < ~var6; ++var6) {
                            this.field6162[var6] = (short) arg1.method1447(29480);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field6163 = arg1.method1428(32122) == 1;
        }
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        field6169 = null;
        int var1 = -94 % ((24 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([III)V")
    public final void method2469(int[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method2467((byte) -5);
        }
        ++field6160;
        int var4 = class456.field6752[arg1] * this.field6159;
        if (~this.field6155 != -2) {
            short var5 = this.field6162[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field6167[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field6157 * var6 >> 12;
                int var9 = this.field6159 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                int var12 = var7 & 4095;
                if (var11 >= var9) {
                    var11 = 0;
                }
                int var13 = this.field6153[255 & var10] & 255;
                int var14 = class223.field3286[var12];
                int var15 = 255 & this.field6153[var11 & 255];
                for (int var16 = 0; ~class320.field4579 < ~var16; ++var16) {
                    int var36 = class517.field7539[var16] * this.field6157;
                    int var37 = this.method2466(var8, var12, var14, var15, var13, var6 * var36 >> 12, 116);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field6155; ++var17) {
                short var18 = this.field6162[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field6167[var17] << 12;
                    int var20 = this.field6157 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field6159 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 - -1;
                    int var25 = var21 & 4095;
                    if (~var24 <= ~var22) {
                        var24 = 0;
                    }
                    int var26 = this.field6153[255 & var24] & 255;
                    int var27 = 255 & this.field6153[var23 & 255];
                    int var28 = class223.field3286[var25];
                    if (this.field6163 && ~(this.field6155 + -1) == ~var17) {
                        for (int var29 = 0; var29 < class320.field4579; ++var29) {
                            int var30 = class517.field7539[var29] * this.field6157;
                            int var31 = this.method2466(var20, var25, var28, var26, var27, var19 * var30 >> 12, -119);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class320.field4579; ++var33) {
                            int var34 = class517.field7539[var33] * this.field6157;
                            int var35 = this.method2466(var20, var25, var28, var26, var27, var19 * var34 >> 12, -118);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field6167[0] << 12;
            short var39 = this.field6162[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field6157 * var38 >> 12;
            int var42 = this.field6159 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            if (~var44 <= ~var42) {
                var44 = 0;
            }
            int var45 = var40 & 4095;
            int var46 = this.field6153[var44 & 255] & 255;
            int var47 = this.field6153[255 & var43] & 255;
            int var48 = class223.field3286[var45];
            if (this.field6163) {
                for (int var49 = 0; var49 < class320.field4579; ++var49) {
                    int var50 = class517.field7539[var49] * this.field6157;
                    int var51 = this.method2466(var41, var45, var48, var46, var47, var38 * var50 >> 12, arg2 ^ -120);
                    int var52 = var39 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; class320.field4579 > var53; ++var53) {
                    int var54 = class517.field7539[var53] * this.field6157;
                    int var55 = this.method2466(var41, var45, var48, var46, var47, var38 * var54 >> 12, 122);
                    arg0[var53] = var39 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6158;
        if (arg0 >= -65) {
            return null;
        } else {
            int[] var3 = super.field2193.method497(arg1, false);
            if (super.field2193.field1312) {
                this.method2469(var3, arg1, 0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.field6153 = class297.method1882(70, this.field6166);
        if (arg0 != -1285532468) {
            field6154 = -35;
        }
        ++field6156;
        this.method2467((byte) 71);
        for (int var2 = this.field6155 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field6162[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field6155;
        }
    }
}
