import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class334 extends class646 {

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public int field4646 = 4;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    public int field4655 = 4;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public int field4647 = 0;

    @OriginalMember(owner = "client!po", name = "V", descriptor = "I")
    public int field4657 = 1638;

    @OriginalMember(owner = "client!po", name = "Z", descriptor = "[B")
    private byte[] field4661 = new byte[512];

    @OriginalMember(owner = "client!po", name = "P", descriptor = "Z")
    public boolean field4651 = true;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public int field4650 = 4;

    @OriginalMember(owner = "client!po", name = "U", descriptor = "Leda;")
    public static class116 field4656 = new class116(5, 1);

    @OriginalMember(owner = "client!po", name = "eb", descriptor = "I")
    public static int field4666 = 0;

    @OriginalMember(owner = "client!po", name = "Y", descriptor = "Lgca;")
    public static class627 field4660 = new class627();

    @OriginalMember(owner = "client!po", name = "gb", descriptor = "I")
    public static int field4668 = 0;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!po", name = "W", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!po", name = "X", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!po", name = "ab", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!po", name = "bb", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!po", name = "cb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!po", name = "fb", descriptor = "Llq;")
    public static class292 field4667;

    @OriginalMember(owner = "client!po", name = "db", descriptor = "[I")
    public static int[] field4665;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "[S")
    private short[] field4648;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "[S")
    private short[] field4649;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IB)[I", line = 5)
    public final int[] method424(int arg0, byte arg1) {
        ++field4658;
        if (arg1 != -120) {
            return null;
        } else {
            int[] var3 = super.field9156.method2193(1269, arg0);
            if (super.field9156.field5075) {
                this.method1990(255, var3, arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 29)
    private final void method1987(int arg0) {
        if (arg0 <= 90) {
            field4665 = null;
        }
        ++field4653;
        if (this.field4657 <= 0) {
            if (this.field4649 != null && this.field4649.length == this.field4655) {
                this.field4648 = new short[this.field4655];
                for (int var2 = 0; var2 < this.field4655; ++var2) {
                    this.field4648[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field4648 = new short[this.field4655];
            this.field4649 = new short[this.field4655];
            for (int var3 = 0; ~var3 > ~this.field4655; ++var3) {
                this.field4649[var3] = (short) ((int) (Math.pow((double) ((float) this.field4657 / 4096.0F), (double) var3) * 4096.0D));
                this.field4648[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZIIIIII)I", line = 70)
    private final int method1988(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4652;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        if (!arg0) {
            return -2;
        } else {
            int var10 = arg3 & 4095;
            if (arg6 <= var9) {
                var9 = 0;
            }
            int var11 = var8 & 255;
            int var12 = var10 + -4096;
            int var13 = arg4 + -4096;
            int var14 = var9 & 255;
            int var15 = class6.field50[var10];
            int var16 = this.field4661[arg1 + var11] & 3;
            int var17;
            if (var16 <= 1) {
                var17 = ~var16 != -1 ? -var10 + arg4 : arg4 + var10;
            } else {
                var17 = ~var16 == -3 ? -arg4 + var10 : -arg4 + -var10;
            }
            int var18 = 3 & this.field4661[var14 - -arg1];
            int var19;
            if (var18 <= 1) {
                var19 = var18 != 0 ? -var12 + arg4 : arg4 + var12;
            } else {
                var19 = ~var18 != -3 ? -arg4 + -var12 : var12 - arg4;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = 3 & this.field4661[arg5 + var11];
            int var22;
            if (var21 > 1) {
                var22 = ~var21 == -3 ? -var13 + var10 : -var10 + -var13;
            } else {
                var22 = var21 == 0 ? var10 + var13 : var13 - var10;
            }
            int var23 = 3 & this.field4661[arg5 + var14];
            int var24;
            if (~var23 < -2) {
                var24 = var23 == 2 ? -var13 + var12 : -var12 + -var13;
            } else {
                var24 = var23 == 0 ? var12 - -var13 : -var12 + var13;
            }
            int var25 = var22 - -((var24 - var22) * var15 >> 12);
            return ((-var20 + var25) * arg2 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 152)
    public final void method422(int arg0) {
        this.field4661 = class153.method1157(arg0 ^ 122, this.field4647);
        ++field4645;
        this.method1987(arg0 ^ -104);
        for (int var2 = this.field4655 + arg0; var2 >= 1; --var2) {
            short var3 = this.field4649[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field4655;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 445)
    public class334() {
        super(0, true);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)V", line = 185)
    public static final void method1989(boolean arg0) {
        class202.field3126 = -1;
        class400.field5777 = -1;
        class472.field6789 = 0;
        if (arg0) {
            ++field4654;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I[II)V", line = 199)
    public final void method1990(int arg0, int[] arg1, int arg2) {
        ++field4663;
        int var4 = class78.field1195[arg2] * this.field4650;
        if (~this.field4655 == -2) {
            short var5 = this.field4649[0];
            int var6 = this.field4648[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field4650 * var6 >> 12;
            int var9 = this.field4646 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var12 = var7 & 4095;
            int var13 = class6.field50[var12];
            int var14 = this.field4661[var11 & 255] & 255;
            int var15 = 255 & this.field4661[var10 & 255];
            if (!this.field4651) {
                for (int var16 = 0; var16 < class89.field1330; ++var16) {
                    int var17 = class518.field7652[var16] * this.field4646;
                    int var18 = this.method1988(true, var15, var13, var6 * var17 >> 12, var12, var14, var9);
                    arg1[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class89.field1330 > var19; ++var19) {
                    int var20 = class518.field7652[var19] * this.field4646;
                    int var21 = this.method1988(true, var15, var13, var6 * var20 >> 12, var12, var14, var9);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field4649[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field4648[0] << 12;
                int var25 = this.field4646 * var24 >> 12;
                int var26 = this.field4650 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (var26 <= var29) {
                    var29 = 0;
                }
                int var31 = this.field4661[var28 & 255] & 255;
                int var32 = 255 & this.field4661[255 & var29];
                int var33 = class6.field50[var30];
                for (int var34 = 0; ~class89.field1330 < ~var34; ++var34) {
                    int var54 = class518.field7652[var34] * this.field4646;
                    int var55 = this.method1988(true, var31, var33, var24 * var54 >> 12, var30, var32, var25);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field4655 > var35; ++var35) {
                short var36 = this.field4649[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field4648[var35] << 12;
                    int var38 = this.field4646 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field4650 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var39 & 4095;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var44 = this.field4661[255 & var42] & 255;
                    int var45 = this.field4661[var41 & 255] & 255;
                    int var46 = class6.field50[var43];
                    if (this.field4651 && ~(this.field4655 + -1) == ~var35) {
                        for (int var47 = 0; ~class89.field1330 < ~var47; ++var47) {
                            int var48 = class518.field7652[var47] * this.field4646;
                            int var49 = this.method1988(true, var45, var46, var37 * var48 >> 12, var43, var44, var38);
                            int var50 = (var36 * var49 >> 12) + arg1[var47];
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class89.field1330; ++var51) {
                            int var52 = class518.field7652[var51] * this.field4646;
                            int var53 = this.method1988(true, var45, var46, var37 * var52 >> 12, var43, var44, var38);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 != 255) {
            this.field4649 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lis;III)V", line = 363)
    public static final void method1991(class101 arg0, int arg1, int arg2, int arg3) {
        if (class41.field555) {
            class349 var4 = class510.field7581 != -1 ? class237.field3504.method1554(false, class510.field7581) : null;
            if (client.method707(arg0).method1953(true) && (32 & class700.field9918) != 0 && (var4 == null || arg0.method845(var4.field4922, class510.field7581, -101) != var4.field4922)) {
                ++class481.field6874;
                class476.method2787(arg0.field1528, 0L, arg0.field1565, arg0.field1577, true, (byte) -26, class584.field8560, 10, class252.field3651 + " -> " + arg0.field1546, false, class25.field346);
            }
        }
        ++field4659;
        if (arg3 == 1) {
            for (int var5 = 9; var5 >= 5; --var5) {
                String var9 = class172.method1273(var5, arg0, arg3 ^ -92);
                if (var9 != null) {
                    class476.method2787(arg0.field1528, (long) (var5 + 1), arg0.field1565, arg0.field1577, true, (byte) -26, var9, 1009, arg0.field1546, false, class666.method3752(-2949, var5, arg0));
                    ++class447.field6462;
                }
            }
            String var6 = class491.method2874(arg0, 0);
            if (var6 != null) {
                class476.method2787(arg0.field1528, 0L, arg0.field1565, arg0.field1577, true, (byte) -26, var6, 23, arg0.field1546, false, arg0.field1588);
                ++class40.field542;
            }
            for (int var7 = 4; var7 >= 0; --var7) {
                String var8 = class172.method1273(var7, arg0, -125);
                if (var8 != null) {
                    ++class447.field6462;
                    class476.method2787(arg0.field1528, (long) (var7 + 1), arg0.field1565, arg0.field1577, true, (byte) -26, var8, 13, arg0.field1546, false, class666.method3752(arg3 ^ -2950, var7, arg0));
                }
            }
            if (client.method707(arg0).method1960(false)) {
                ++class515.field7633;
                if (arg0.field1579 != null) {
                    class476.method2787(arg0.field1528, 0L, arg0.field1565, arg0.field1577, true, (byte) -26, arg0.field1579, 44, "", false, -1);
                } else {
                    class476.method2787(arg0.field1528, 0L, arg0.field1565, arg0.field1577, true, (byte) -26, class343.field4758.method2059(class238.field3511, true), 44, "", false, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V", line = 453)
    public static void method1992(int arg0) {
        field4660 = null;
        field4665 = null;
        field4667 = null;
        field4656 = null;
        if (arg0 != 5599) {
            field4666 = 121;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(III)V", line = 474)
    public static final void method1993(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        if (var3 != null) {
            class443.method2584(var3.field4093);
            class443.method2584(var3.field4090);
            if (var3.field4093 != null) {
                var3.field4093 = null;
            }
            if (var3.field4090 != null) {
                var3.field4090 = null;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lek;IB)V", line = 504)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 <= 7) {
            this.field4649 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4650 = arg0.method2705(-75);
                                }
                            } else {
                                this.field4646 = arg0.method2705(-114);
                            }
                        } else {
                            this.field4647 = arg0.method2705(-77);
                        }
                    } else {
                        this.field4646 = this.field4650 = arg0.method2705(-31);
                    }
                } else {
                    this.field4657 = arg0.method2744(-1);
                    if (this.field4657 < 0) {
                        this.field4649 = new short[this.field4655];
                        for (int var5 = 0; var5 < this.field4655; ++var5) {
                            this.field4649[var5] = (short) arg0.method2744(-1);
                        }
                    }
                }
            } else {
                this.field4655 = arg0.method2705(-24);
            }
        } else {
            this.field4651 = ~arg0.method2705(-105) == -2;
        }
        ++field4662;
    }
}
