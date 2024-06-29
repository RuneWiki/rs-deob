import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class47 extends class601 {

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public int field540 = 4;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "[B")
    private byte[] field536 = new byte[512];

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public int field542 = 0;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public int field538 = 1638;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public int field541 = 4;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
    public int field543 = 4;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "Z")
    public boolean field544 = true;

    @OriginalMember(owner = "client!bq", name = "V", descriptor = "I")
    public static int field547 = -1;

    @OriginalMember(owner = "client!bq", name = "X", descriptor = "Z")
    public static boolean field549 = false;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!bq", name = "W", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "[S")
    private short[] field545;

    @OriginalMember(owner = "client!bq", name = "Y", descriptor = "[S")
    private short[] field550;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[II)V")
    public final void method289(int arg0, int[] arg1, int arg2) {
        ++field532;
        int var4 = class427.field5623[arg2] * this.field543;
        if (arg0 == 255) {
            if (~this.field540 == -2) {
                int var5 = this.field545[0] << 12;
                short var6 = this.field550[0];
                int var7 = var4 * var5 >> 12;
                int var8 = this.field543 * var5 >> 12;
                int var9 = this.field541 * var5 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 - -1;
                if (~var8 >= ~var11) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = 255 & this.field536[255 & var10];
                int var14 = class340.field4166[var12];
                int var15 = 255 & this.field536[var11 & 255];
                if (!this.field544) {
                    for (int var16 = 0; var16 < class418.field5518; ++var16) {
                        int var17 = class64.field839[var16] * this.field541;
                        int var18 = this.method293(var14, var9, var5 * var17 >> 12, var13, var15, var12, (byte) 65);
                        arg1[var16] = var6 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; ~var19 > ~class418.field5518; ++var19) {
                        int var20 = class64.field839[var19] * this.field541;
                        int var21 = this.method293(var14, var9, var5 * var20 >> 12, var13, var15, var12, (byte) 65);
                        int var22 = var6 * var21 >> 12;
                        arg1[var19] = 2048 - -(var22 >> 1);
                    }
                }
            } else {
                short var23 = this.field550[0];
                if (var23 > 8 || ~var23 > 7) {
                    int var24 = this.field545[0] << 12;
                    int var25 = this.field541 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field543 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = var28 + 1;
                    if (~var27 >= ~var29) {
                        var29 = 0;
                    }
                    int var30 = var26 & 4095;
                    int var31 = 255 & this.field536[var28 & 255];
                    int var32 = 255 & this.field536[255 & var29];
                    int var33 = class340.field4166[var30];
                    for (int var34 = 0; ~class418.field5518 < ~var34; ++var34) {
                        int var54 = class64.field839[var34] * this.field541;
                        int var55 = this.method293(var33, var25, var24 * var54 >> 12, var31, var32, var30, (byte) 65);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~var35 > ~this.field540; ++var35) {
                    short var36 = this.field550[var35];
                    if (~var36 < -9 || var36 < -8) {
                        int var37 = this.field545[var35] << 12;
                        int var38 = var4 * var37 >> 12;
                        int var39 = this.field543 * var37 >> 12;
                        int var40 = this.field541 * var37 >> 12;
                        int var41 = var38 >> 12;
                        int var42 = var41 + 1;
                        int var43 = var38 & 4095;
                        if (~var42 <= ~var39) {
                            var42 = 0;
                        }
                        int var44 = class340.field4166[var43];
                        int var45 = 255 & this.field536[255 & var42];
                        int var46 = 255 & this.field536[255 & var41];
                        if (this.field544 && this.field540 - 1 == var35) {
                            for (int var47 = 0; class418.field5518 > var47; ++var47) {
                                int var48 = class64.field839[var47] * this.field541;
                                int var49 = this.method293(var44, var40, var37 * var48 >> 12, var46, var45, var43, (byte) 65);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; var51 < class418.field5518; ++var51) {
                                int var52 = class64.field839[var51] * this.field541;
                                int var53 = this.method293(var44, var40, var37 * var52 >> 12, var46, var45, var43, (byte) 65);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)V")
    public static final void method290(byte arg0) {
        ++field533;
        if (arg0 < 96) {
            field549 = true;
        }
        if (~class510.field6513 < -1) {
            int var1 = 0;
            for (int var2 = 0; var2 < class210.field2891.length; ++var2) {
                if (class210.field2891[var2].indexOf("--> ") != -1) {
                    ++var1;
                    if (class510.field6513 == var1) {
                        class656.field8466 = class210.field2891[var2].substring(2 + class210.field2891[var2].indexOf(">"));
                        return;
                    }
                }
            }
        } else {
            class656.field8466 = "";
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field534;
        if (arg1 > -76) {
            this.method293(36, 43, -112, -60, -77, -101, (byte) -52);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            this.method289(255, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field546;
        if (arg5 != -180721044) {
            field549 = false;
        }
        if (arg0 == arg8 && arg6 == arg9 && ~arg4 == ~arg7 && arg1 == arg2) {
            class385.method2208(arg0, arg9, 60, arg3, arg1, arg7);
        } else {
            int var10 = arg0;
            int var11 = arg9;
            int var12 = arg0 * 3;
            int var13 = arg9 * 3;
            int var14 = arg8 * 3;
            int var15 = arg6 * 3;
            int var16 = arg4 * 3;
            int var17 = arg2 * 3;
            int var18 = arg7 - arg0 + -var16 + var14;
            int var19 = -var17 - -var15 - arg9 + arg1;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = -var15 - var15 + var13 + var17;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg0;
                int var34 = arg9 - -(var28 + var32 + var30 >> 12);
                class385.method2208(var10, var11, 95, arg3, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
    public final void method292(byte arg0) {
        this.field536 = class777.method4256(this.field542, true);
        ++field537;
        this.method294(16064);
        for (int var2 = this.field540 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field550[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field540;
        }
        if (arg0 < 44) {
            this.method292((byte) 25);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIB)I")
    private final int method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field548;
        if (arg6 != 65) {
            this.field542 = -26;
        }
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg1) {
            var9 = 0;
        }
        int var10 = arg2 & 4095;
        int var11 = var8 & 255;
        int var12 = var10 + -4096;
        int var13 = var9 & 255;
        int var14 = arg5 + -4096;
        int var15 = 3 & this.field536[arg3 + var11];
        int var16 = class340.field4166[var10];
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 == -1 ? arg5 + var10 : -var10 + arg5;
        } else {
            var17 = ~var15 == -3 ? var10 - arg5 : -arg5 + -var10;
        }
        int var18 = 3 & this.field536[arg3 + var13];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg5 + -var12 : -arg5 + var12;
        } else {
            var19 = var18 == 0 ? arg5 + var12 : arg5 - var12;
        }
        int var20 = 3 & this.field536[arg4 + var11];
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = var20 != 2 ? -var10 + -var14 : var10 - var14;
        } else {
            var22 = ~var20 == -1 ? var10 + var14 : -var10 + var14;
        }
        int var23 = 3 & this.field536[arg4 + var13];
        int var24;
        if (~var23 >= -2) {
            var24 = var23 == 0 ? var12 + var14 : -var12 + var14;
        } else {
            var24 = ~var23 != -3 ? -var12 + -var14 : var12 - var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = -72 / ((arg2 - 40) / 52);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field543 = arg0.method1509(true);
                                }
                            } else {
                                this.field541 = arg0.method1509(true);
                            }
                        } else {
                            this.field542 = arg0.method1509(true);
                        }
                    } else {
                        this.field541 = this.field543 = arg0.method1509(true);
                    }
                } else {
                    this.field538 = arg0.method1542(27067);
                    if (~this.field538 > -1) {
                        this.field550 = new short[this.field540];
                        for (int var6 = 0; var6 < this.field540; ++var6) {
                            this.field550[var6] = (short) arg0.method1542(27067);
                        }
                    }
                }
            } else {
                this.field540 = arg0.method1509(true);
            }
        } else {
            this.field544 = ~arg0.method1509(true) == -2;
        }
        ++field535;
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V")
    private final void method294(int arg0) {
        if (arg0 != 16064) {
            this.field538 = -80;
        }
        ++field539;
        if (~this.field538 >= -1) {
            if (this.field550 != null && ~this.field550.length == ~this.field540) {
                this.field545 = new short[this.field540];
                for (int var2 = 0; ~var2 > ~this.field540; ++var2) {
                    this.field545[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field550 = new short[this.field540];
            this.field545 = new short[this.field540];
            for (int var3 = 0; ~this.field540 < ~var3; ++var3) {
                this.field550[var3] = (short) ((int) (Math.pow((double) ((float) this.field538 / 4096.0F), (double) var3) * 4096.0D));
                this.field545[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }
}
