import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class354 extends class5 {

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public int field4507 = 0;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "[B")
    private byte[] field4505 = new byte[512];

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public int field4506 = 1638;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public int field4509 = 4;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public int field4513 = 4;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public int field4504 = 4;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Z")
    public boolean field4519 = true;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field4510 = 0;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "[I")
    public static int[] field4521 = new int[2048];

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Lsm;")
    public static class631 field4508;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[S")
    private short[] field4516;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "[S")
    private short[] field4517;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "[[Z")
    public static boolean[][] field4511;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/io/File;I)[B")
    public static final byte[] method1939(byte arg0, File arg1, int arg2) {
        ++field4512;
        try {
            byte[] var3 = new byte[arg2];
            int var4 = -54 / ((arg0 - -56) / 50);
            class595.method3276(arg2, -101, arg1, var3);
            return var3;
        } catch (IOException var5) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class354() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I")
    private final int method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4514;
        int var8 = arg3 >> 12;
        int var9 = var8 - -1;
        if (~arg5 >= ~var9) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        int var12 = var9 & 255;
        int var13 = arg0 + -4096;
        int var14 = var11 + -4096;
        int var15 = class85.field1195[var11];
        int var16 = 3 & this.field4505[arg4 + var10];
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 == -1 ? arg0 + var11 : -var11 + arg0;
        } else {
            var17 = var16 != 2 ? -arg0 + -var11 : -arg0 + var11;
        }
        int var18 = this.field4505[arg4 + var12] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 == -1 ? arg0 + var14 : -var14 + arg0;
        } else {
            var19 = var18 == 2 ? -arg0 + var14 : -arg0 + -var14;
        }
        int var20 = 3 & this.field4505[arg2 + var10];
        int var21 = var17 - -((-var17 + var19) * var15 >> 12);
        int var22;
        if (var20 > 1) {
            var22 = var20 != 2 ? -var11 + -var13 : -var13 + var11;
        } else {
            var22 = var20 != 0 ? var13 - var11 : var11 + var13;
        }
        if (arg1 != 31757) {
            return 32;
        } else {
            int var23 = this.field4505[arg2 + var12] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = ~var23 == -3 ? -var13 + var14 : -var13 + -var14;
            } else {
                var24 = ~var23 != -1 ? -var14 + var13 : var13 + var14;
            }
            int var25 = var22 - -((-var22 + var24) * var15 >> 12);
            return ((var25 - var21) * arg6 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field4513 = arg1.method3501(-9268);
                                }
                            } else {
                                this.field4504 = arg1.method3501(-9268);
                            }
                        } else {
                            this.field4507 = arg1.method3501(-9268);
                        }
                    } else {
                        this.field4504 = this.field4513 = arg1.method3501(-9268);
                    }
                } else {
                    this.field4506 = arg1.method3510(32);
                    if (this.field4506 < 0) {
                        this.field4516 = new short[this.field4509];
                        for (int var5 = 0; ~this.field4509 < ~var5; ++var5) {
                            this.field4516[var5] = (short) arg1.method3510(30);
                        }
                    }
                }
            } else {
                this.field4509 = arg1.method3501(arg0 ^ -9267);
            }
        } else {
            this.field4519 = arg1.method3501(-9268) == 1;
        }
        if (arg0 != 1) {
            this.field4517 = null;
        }
        ++field4523;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field4524;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = 66 / ((81 - arg0) / 36);
        if (super.field126.field8392) {
            this.method1944(arg1, (byte) 31, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
    private final void method1941(int arg0) {
        if (arg0 != 1998) {
            this.method1941(-34);
        }
        if (~this.field4506 < -1) {
            this.field4516 = new short[this.field4509];
            this.field4517 = new short[this.field4509];
            for (int var2 = 0; this.field4509 > var2; ++var2) {
                this.field4516[var2] = (short) ((int) (Math.pow((double) ((float) this.field4506 / 4096.0F), (double) var2) * 4096.0D));
                this.field4517[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4516 != null && ~this.field4516.length == ~this.field4509) {
            this.field4517 = new short[this.field4509];
            for (int var3 = 0; this.field4509 > var3; ++var3) {
                this.field4517[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field4522;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
    public static final boolean method1942(int arg0, int arg1, int arg2) {
        ++field4515;
        if (arg2 >= -6) {
            field4521 = null;
        }
        return ~(arg0 & 458752) != -1 | class58.method365(arg1, arg0, false) || class127.method678(68, arg0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
    public static void method1943(int arg0) {
        if (arg0 != 265391564) {
            method1943(119);
        }
        field4508 = null;
        field4521 = null;
        field4511 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB[I)V")
    public final void method1944(int arg0, byte arg1, int[] arg2) {
        ++field4520;
        int var4 = class272.field3439[arg0] * this.field4513;
        if (arg1 == 31) {
            if (~this.field4509 == -2) {
                int var5 = this.field4517[0] << 12;
                short var6 = this.field4516[0];
                int var7 = this.field4513 * var5 >> 12;
                int var8 = this.field4504 * var5 >> 12;
                int var9 = var4 * var5 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                if (var11 >= var7) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = class85.field1195[var12];
                int var14 = 255 & this.field4505[var11 & 255];
                int var15 = 255 & this.field4505[var10 & 255];
                if (this.field4519) {
                    for (int var16 = 0; ~class657.field9287 < ~var16; ++var16) {
                        int var17 = class269.field3405[var16] * this.field4504;
                        int var18 = this.method1940(var12, 31757, var14, var5 * var17 >> 12, var15, var8, var13);
                        int var19 = var6 * var18 >> 12;
                        arg2[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; var20 < class657.field9287; ++var20) {
                        int var21 = class269.field3405[var20] * this.field4504;
                        int var22 = this.method1940(var12, 31757, var14, var5 * var21 >> 12, var15, var8, var13);
                        arg2[var20] = var6 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field4516[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field4517[0] << 12;
                    int var25 = this.field4504 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field4513 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = var28 + 1;
                    if (~var29 <= ~var27) {
                        var29 = 0;
                    }
                    int var30 = var26 & 4095;
                    int var31 = class85.field1195[var30];
                    int var32 = this.field4505[var29 & 255] & 255;
                    int var33 = this.field4505[var28 & 255] & 255;
                    for (int var34 = 0; class657.field9287 > var34; ++var34) {
                        int var54 = class269.field3405[var34] * this.field4504;
                        int var55 = this.method1940(var30, 31757, var32, var24 * var54 >> 12, var33, var25, var31);
                        arg2[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; this.field4509 > var35; ++var35) {
                    short var36 = this.field4516[var35];
                    if (~var36 < -9 || var36 < -8) {
                        int var37 = this.field4517[var35] << 12;
                        int var38 = this.field4504 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field4513 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var41 + 1;
                        if (~var42 <= ~var40) {
                            var42 = 0;
                        }
                        int var43 = var39 & 4095;
                        int var44 = 255 & this.field4505[255 & var41];
                        int var45 = this.field4505[var42 & 255] & 255;
                        int var46 = class85.field1195[var43];
                        if (this.field4519 && this.field4509 + -1 == var35) {
                            for (int var47 = 0; class657.field9287 > var47; ++var47) {
                                int var48 = class269.field3405[var47] * this.field4504;
                                int var49 = this.method1940(var43, 31757, var45, var37 * var48 >> 12, var44, var38, var46);
                                int var50 = arg2[var47] - -(var36 * var49 >> 12);
                                arg2[var47] = 2048 - -(var50 >> 1);
                            }
                        } else {
                            for (int var51 = 0; ~var51 > ~class657.field9287; ++var51) {
                                int var52 = class269.field3405[var51] * this.field4504;
                                int var53 = this.method1940(var43, 31757, var45, var37 * var52 >> 12, var44, var38, var46);
                                arg2[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field4505 = class253.method1482(this.field4507, (byte) -97);
        ++field4518;
        this.method1941(1998);
        for (int var2 = this.field4509 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4516[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field4509;
        }
        int var4 = 85 / ((arg0 - 64) / 60);
    }
}
