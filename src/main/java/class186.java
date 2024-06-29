import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class186 extends class115 {

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public int field2532 = 4;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "[B")
    private byte[] field2523 = new byte[512];

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "Z")
    public boolean field2537 = true;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public int field2541 = 0;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public int field2528 = 4;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public int field2534 = 4;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public int field2539 = 1638;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "[[B")
    public static byte[][] field2529 = new byte[250][];

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
    public static boolean field2525 = false;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "[I")
    public static int[] field2531 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[S")
    private short[] field2522;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "[S")
    private short[] field2535;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLbk;I)V", line = 3)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field2526;
        if (arg0 < 83) {
            this.method140(-61);
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2528 = arg1.method1342((byte) -128);
            } else {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field2534 = this.field2532 = arg1.method1342((byte) -128);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field2541 = arg1.method1342((byte) -126);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field2534 = arg1.method1342((byte) -126);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field2532 = arg1.method1342((byte) -127);
                        return;
                    }
                } else {
                    this.field2539 = arg1.method1344((byte) -4);
                    if (this.field2539 < 0) {
                        this.field2522 = new short[this.field2528];
                        for (int var5 = 0; this.field2528 > var5; ++var5) {
                            this.field2522[var5] = (short) arg1.method1344((byte) -4);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2537 = arg1.method1342((byte) -128) == 1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I", line = 98)
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1194((int[]) null, 51, -55);
        }
        ++field2536;
        int[] var3 = super.field1340.method14(53, arg0);
        if (super.field1340.field35) {
            this.method1194(var3, 4095, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZI)I", line = 122)
    private final int method1193(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field2530;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg2) {
            var9 = 0;
        }
        int var10 = arg4 & 4095;
        int var11 = var8 & 255;
        int var12 = arg0 - 4096;
        int var13 = var10 + -4096;
        int var14 = var9 & 255;
        int var15 = this.field2523[arg6 + var11] & 3;
        int var16 = class108.field1246[var10];
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? -arg0 + var10 : -var10 - arg0;
        } else {
            var17 = ~var15 != -1 ? arg0 - var10 : arg0 + var10;
        }
        int var18 = this.field2523[arg6 + var14] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? -var13 + arg0 : arg0 + var13;
        } else {
            var19 = var18 == 2 ? -arg0 + var13 : -arg0 + -var13;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field2523[var11 - -arg3] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 == -1 ? var10 + var12 : -var10 + var12;
        } else {
            var22 = var21 == 2 ? -var12 + var10 : -var10 + -var12;
        }
        int var23 = 3 & this.field2523[arg3 + var14];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 != -1 ? var12 - var13 : var12 + var13;
        } else {
            var24 = var23 != 2 ? -var12 + -var13 : -var12 + var13;
        }
        if (!arg5) {
            field2538 = 52;
        }
        int var25 = var22 - -((-var22 + var24) * var16 >> 12);
        return ((-var20 + var25) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V", line = 199)
    public final void method1194(int[] arg0, int arg1, int arg2) {
        ++field2540;
        int var4 = class193.field2634[arg2] * this.field2532;
        if (arg1 != 4095) {
            field2529 = null;
        }
        if (this.field2528 == 1) {
            int var5 = this.field2535[0] << 12;
            short var6 = this.field2522[0];
            int var7 = this.field2532 * var5 >> 12;
            int var8 = var4 * var5 >> 12;
            int var9 = this.field2534 * var5 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (~var11 <= ~var7) {
                var11 = 0;
            }
            int var12 = var8 & 4095;
            int var13 = 255 & this.field2523[var10 & 255];
            int var14 = class108.field1246[var12];
            int var15 = 255 & this.field2523[var11 & 255];
            if (!this.field2537) {
                for (int var16 = 0; class218.field2979 > var16; ++var16) {
                    int var17 = class43.field530[var16] * this.field2534;
                    int var18 = this.method1193(var12, var14, var9, var15, var5 * var17 >> 12, true, var13);
                    arg0[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; ~var19 > ~class218.field2979; ++var19) {
                    int var20 = class43.field530[var19] * this.field2534;
                    int var21 = this.method1193(var12, var14, var9, var15, var5 * var20 >> 12, true, var13);
                    int var22 = var6 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field2522[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field2535[0] << 12;
                int var25 = this.field2532 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field2534 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = var28 + 1;
                int var30 = var26 & 4095;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var31 = 255 & this.field2523[var28 & 255];
                int var32 = class108.field1246[var30];
                int var33 = 255 & this.field2523[255 & var29];
                for (int var34 = 0; class218.field2979 > var34; ++var34) {
                    int var54 = class43.field530[var34] * this.field2534;
                    int var55 = this.method1193(var30, var32, var27, var33, var24 * var54 >> 12, true, var31);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field2528; ++var35) {
                short var36 = this.field2522[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field2535[var35] << 12;
                    int var38 = this.field2532 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field2534 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var39 & 4095;
                    if (~var42 <= ~var38) {
                        var42 = 0;
                    }
                    int var44 = class108.field1246[var43];
                    int var45 = 255 & this.field2523[var41 & 255];
                    int var46 = 255 & this.field2523[var42 & 255];
                    if (this.field2537 && ~(this.field2528 - 1) == ~var35) {
                        for (int var47 = 0; var47 < class218.field2979; ++var47) {
                            int var48 = class43.field530[var47] * this.field2534;
                            int var49 = this.method1193(var43, var44, var40, var46, var37 * var48 >> 12, true, var45);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; var51 < class218.field2979; ++var51) {
                            int var52 = class43.field530[var51] * this.field2534;
                            int var53 = this.method1193(var43, var44, var40, var46, var37 * var52 >> 12, true, var45);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 379)
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V", line = 388)
    public static void method1195(byte arg0) {
        field2531 = null;
        field2529 = null;
        if (arg0 != 113) {
            field2531 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I", line = 404)
    public static final int method1196(int arg0, int arg1, int arg2, int arg3) {
        ++field2527;
        int var4 = arg3 & arg1;
        if (~var4 == -1) {
            return arg0;
        } else if (~var4 == -2) {
            return -arg2 + 7;
        } else {
            return ~var4 == -3 ? 7 - arg0 : arg2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 435)
    private final void method1197(int arg0) {
        if (this.field2539 <= 0) {
            if (this.field2522 != null && ~this.field2522.length == ~this.field2528) {
                this.field2535 = new short[this.field2528];
                for (int var2 = 0; var2 < this.field2528; ++var2) {
                    this.field2535[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2522 = new short[this.field2528];
            this.field2535 = new short[this.field2528];
            for (int var3 = 0; ~this.field2528 < ~var3; ++var3) {
                this.field2522[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2539 / 4096.0F), (double) var3)));
                this.field2535[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 > -100) {
            this.method1194((int[]) null, 69, 15);
        }
        ++field2524;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 474)
    public final void method140(int arg0) {
        ++field2533;
        if (arg0 != 0) {
            this.method1197(23);
        }
        this.field2523 = class403.method2556(false, this.field2541);
        this.method1197(-123);
        for (int var2 = this.field2528 + -1; var2 >= 1; --var2) {
            short var3 = this.field2522[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field2528;
        }
    }
}
