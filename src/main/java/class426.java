import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class426 extends class145 {

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field6017 = 4;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public int field6019 = 0;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public int field6026 = 4;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Z")
    public boolean field6016 = true;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public int field6034 = 4;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "[B")
    private byte[] field6033 = new byte[512];

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public int field6036 = 1638;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
    public static boolean field6023 = false;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Z")
    public static volatile boolean field6025 = true;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
    public static int[] field6030 = new int[25];

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lrk;")
    public static class427 field6029;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[S")
    private short[] field6020;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "[S")
    private short[] field6037;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)I", line = 9)
    public static final int method2619(int arg0, int arg1) {
        if (arg1 < 36) {
            method2623((byte) 36);
        }
        ++field6024;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 99)
    public class426() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V", line = 26)
    private final void method2620(byte arg0) {
        if (arg0 == 27) {
            if (this.field6036 > 0) {
                this.field6037 = new short[this.field6034];
                this.field6020 = new short[this.field6034];
                for (int var2 = 0; this.field6034 > var2; ++var2) {
                    this.field6037[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6036 / 4096.0F), (double) var2)));
                    this.field6020[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field6037 != null && this.field6037.length == this.field6034) {
                this.field6020 = new short[this.field6034];
                for (int var3 = 0; ~var3 > ~this.field6034; ++var3) {
                    this.field6020[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field6027;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLbi;)Z", line = 69)
    public static final boolean method2621(boolean arg0, class139 arg1) {
        ++field6035;
        if (~arg1.field2108 == -206) {
            class177.field2613 = 250;
            return true;
        } else {
            if (arg0) {
                method2625(-25, 0, -7, -3);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIBIII)I", line = 102)
    private final int method2622(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field6018;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = arg6 & 4095;
        if (~arg1 >= ~var9) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = var10 - 4096;
        int var14 = arg0 - 4096;
        int var15 = -82 % ((-71 - arg3) / 36);
        int var16 = 3 & this.field6033[arg2 + var11];
        int var17 = class115.field1617[var10];
        int var18;
        if (var16 <= 1) {
            var18 = ~var16 == -1 ? arg0 + var10 : -var10 + arg0;
        } else {
            var18 = var16 != 2 ? -var10 - arg0 : -arg0 + var10;
        }
        int var19 = 3 & this.field6033[var12 - -arg2];
        int var20;
        if (~var19 < -2) {
            var20 = ~var19 == -3 ? -arg0 + var13 : -var13 - arg0;
        } else {
            var20 = ~var19 == -1 ? arg0 + var13 : -var13 + arg0;
        }
        int var21 = ((-var18 + var20) * var17 >> 12) + var18;
        int var22 = this.field6033[var11 - -arg4] & 3;
        int var23;
        if (~var22 >= -2) {
            var23 = ~var22 == -1 ? var10 + var14 : -var10 + var14;
        } else {
            var23 = var22 != 2 ? -var10 - var14 : var10 - var14;
        }
        int var24 = this.field6033[arg4 + var12] & 3;
        int var25;
        if (~var24 >= -2) {
            var25 = ~var24 == -1 ? var13 - -var14 : var14 - var13;
        } else {
            var25 = var24 != 2 ? -var13 + -var14 : -var14 + var13;
        }
        int var26 = ((var25 - var23) * var17 >> 12) + var23;
        return ((-var21 + var26) * arg5 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lap;BI)V", line = 182)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = -26 % ((arg1 - 11) / 52);
        ++field6021;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field6034 = arg0.method1861((byte) -72);
            } else {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field6017 = this.field6026 = arg0.method1861((byte) -72);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field6019 = arg0.method1861((byte) -72);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field6017 = arg0.method1861((byte) -72);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field6026 = arg0.method1861((byte) -72);
                        return;
                    }
                } else {
                    this.field6036 = arg0.method1833(30);
                    if (this.field6036 < 0) {
                        this.field6037 = new short[this.field6034];
                        for (int var6 = 0; var6 < this.field6034; ++var6) {
                            this.field6037[var6] = (short) arg0.method1833(64);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field6016 = ~arg0.method1861((byte) -72) == -2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V", line = 276)
    public final void method87(byte arg0) {
        this.field6033 = class267.method1723((byte) 99, this.field6019);
        ++field6031;
        this.method2620((byte) 27);
        for (int var2 = this.field6034 + -1; var2 >= 1; --var2) {
            short var3 = this.field6037[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field6034;
        }
        if (arg0 != 77) {
            this.method2622(-65, 48, -99, (byte) 5, -122, -1, -76);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)V", line = 305)
    public static void method2623(byte arg0) {
        field6030 = null;
        if (arg0 == -77) {
            field6029 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I", line = 319)
    public final int[] method3(int arg0, int arg1) {
        ++field6032;
        int[] var3 = super.field2218.method1614(58, arg0);
        int var4 = 1 / ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            this.method2624(-124, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[I)V", line = 342)
    public final void method2624(int arg0, int arg1, int[] arg2) {
        ++field6028;
        int var4 = class134.field1902[arg1] * this.field6026;
        int var5 = 14 / ((arg0 - -59) / 36);
        if (this.field6034 != 1) {
            short var6 = this.field6037[0];
            if (~var6 < -9 || ~var6 > 7) {
                int var7 = this.field6020[0] << 12;
                int var8 = this.field6017 * var7 >> 12;
                int var9 = this.field6026 * var7 >> 12;
                int var10 = var4 * var7 >> 12;
                int var11 = var10 >> 12;
                int var12 = var11 + 1;
                int var13 = var10 & 4095;
                if (~var12 <= ~var9) {
                    var12 = 0;
                }
                int var14 = 255 & this.field6033[var11 & 255];
                int var15 = this.field6033[var12 & 255] & 255;
                int var16 = class115.field1617[var13];
                for (int var17 = 0; ~var17 > ~class156.field2364; ++var17) {
                    int var37 = class229.field3181[var17] * this.field6017;
                    int var38 = this.method2622(var13, var8, var14, (byte) -109, var15, var16, var7 * var37 >> 12);
                    arg2[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; ~var18 > ~this.field6034; ++var18) {
                short var19 = this.field6037[var18];
                if (var19 > 8 || var19 < -8) {
                    int var20 = this.field6020[var18] << 12;
                    int var21 = var4 * var20 >> 12;
                    int var22 = this.field6026 * var20 >> 12;
                    int var23 = this.field6017 * var20 >> 12;
                    int var24 = var21 >> 12;
                    int var25 = var24 + 1;
                    if (~var25 <= ~var22) {
                        var25 = 0;
                    }
                    int var26 = var21 & 4095;
                    int var27 = class115.field1617[var26];
                    int var28 = this.field6033[255 & var25] & 255;
                    int var29 = this.field6033[255 & var24] & 255;
                    if (this.field6016 && ~(this.field6034 - 1) == ~var18) {
                        for (int var30 = 0; class156.field2364 > var30; ++var30) {
                            int var31 = class229.field3181[var30] * this.field6017;
                            int var32 = this.method2622(var26, var23, var29, (byte) -112, var28, var27, var20 * var31 >> 12);
                            int var33 = (var19 * var32 >> 12) + arg2[var30];
                            arg2[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; ~class156.field2364 < ~var34; ++var34) {
                            int var35 = class229.field3181[var34] * this.field6017;
                            int var36 = this.method2622(var26, var23, var29, (byte) -107, var28, var27, var20 * var35 >> 12);
                            arg2[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            short var39 = this.field6037[0];
            int var40 = this.field6020[0] << 12;
            int var41 = var4 * var40 >> 12;
            int var42 = this.field6026 * var40 >> 12;
            int var43 = this.field6017 * var40 >> 12;
            int var44 = var41 >> 12;
            int var45 = var44 + 1;
            int var46 = var41 & 4095;
            if (~var45 <= ~var42) {
                var45 = 0;
            }
            int var47 = class115.field1617[var46];
            int var48 = this.field6033[255 & var44] & 255;
            int var49 = 255 & this.field6033[var45 & 255];
            if (!this.field6016) {
                for (int var50 = 0; var50 < class156.field2364; ++var50) {
                    int var51 = class229.field3181[var50] * this.field6017;
                    int var52 = this.method2622(var46, var43, var48, (byte) -28, var49, var47, var40 * var51 >> 12);
                    arg2[var50] = var39 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; ~var53 > ~class156.field2364; ++var53) {
                    int var54 = class229.field3181[var53] * this.field6017;
                    int var55 = this.method2622(var46, var43, var48, (byte) -7, var49, var47, var40 * var54 >> 12);
                    int var56 = var39 * var55 >> 12;
                    arg2[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 509)
    public static final void method2625(int arg0, int arg1, int arg2, int arg3) {
        ++field6022;
        if (arg0 == 0) {
            ++class26.field465;
            class355.field4828.method1801(47, (byte) -99);
        }
        if (~arg0 == -2) {
            class355.field4828.method1801(182, (byte) -116);
            ++class321.field4328;
        }
        class355.field4828.method1872((byte) 54, class234.field3242[82] ? 1 : 0);
        if (arg3 == 30153) {
            class355.field4828.method1877(true, arg1 - -class283.field3794);
            class355.field4828.method1834(class296.field3988 + arg2, (byte) -125);
            class338.field4605 = arg1;
            class335.field4543 = arg2;
            class338.field4615 = false;
            class184.method1347(false);
        }
    }
}
