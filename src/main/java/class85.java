import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 extends class264 {

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    private int field1529 = 4;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    private int field1534 = 4;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field1528 = 4;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    private int field1536 = 1638;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Z")
    private boolean field1541 = true;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "[B")
    private byte[] field1530 = new byte[512];

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    private int field1546 = 0;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Lmb;")
    public static class160 field1538 = new class160();

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lcf;")
    private static class93 field1542 = class147.method1066("Loaded title screen", -48);

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "Lcf;")
    public static class93 field1543 = class147.method1066("Clientscript error in: ", -48);

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "Lcf;")
    public static class93 field1548 = field1542;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "Lmb;")
    public static class160 field1547 = new class160();

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lcf;")
    public static class93 field1551 = class147.method1066("Shift)2click ENABLED(Q", -48);

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lhg;")
    public static class177 field1550;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "[S")
    private short[] field1535;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[S")
    private short[] field1540;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[II)V")
    private final void method585(int arg0, int[] arg1, int arg2) {
        int var4 = class67.field1220[arg2] * this.field1528;
        if (arg0 != 255) {
            this.field1535 = null;
        }
        ++field1549;
        if (this.field1529 != 1) {
            short var5 = this.field1535[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field1540[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = var7 >> 12;
                int var9 = 255 & this.field1530[var8 & 255];
                int var10 = this.field1528 * var6 >> 12;
                int var11 = this.field1534 * var6 >> 12;
                int var12 = var8 + 1;
                int var13 = var7 & 4095;
                int var14 = class154.field2698[var13];
                if (~var12 <= ~var10) {
                    var12 = 0;
                }
                int var15 = this.field1530[255 & var12] & 255;
                for (int var16 = 0; ~class176.field3060 < ~var16; ++var16) {
                    int var36 = class144.field2497[var16] * this.field1534;
                    int var37 = this.method589(var14, var13, var9, -53, var11, var6 * var36 >> 12, var15);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field1529 < ~var17; ++var17) {
                short var18 = this.field1535[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field1540[var17] << 12;
                    int var20 = this.field1528 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field1534 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = this.field1530[var23 & 255] & 255;
                    int var25 = var21 & 4095;
                    int var26 = class154.field2698[var25];
                    int var27 = var23 - -1;
                    if (var27 >= var20) {
                        var27 = 0;
                    }
                    int var28 = 255 & this.field1530[255 & var27];
                    if (this.field1541 && this.field1529 + -1 == var17) {
                        for (int var29 = 0; class176.field3060 > var29; ++var29) {
                            int var30 = class144.field2497[var29] * this.field1534;
                            int var31 = this.method589(var26, var25, var24, 117, var22, var19 * var30 >> 12, var28);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; ~class176.field3060 < ~var33; ++var33) {
                            int var34 = class144.field2497[var33] * this.field1534;
                            int var35 = this.method589(var26, var25, var24, -62, var22, var19 * var34 >> 12, var28);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1540[0] << 12;
            int var39 = var4 * var38 >> 12;
            int var40 = this.field1534 * var38 >> 12;
            int var41 = var39 >> 12;
            int var42 = var41 - -1;
            short var43 = this.field1535[0];
            int var44 = this.field1528 * var38 >> 12;
            int var45 = 255 & this.field1530[255 & var41];
            int var46 = var39 & 4095;
            if (~var44 >= ~var42) {
                var42 = 0;
            }
            int var47 = this.field1530[var42 & 255] & 255;
            int var48 = class154.field2698[var46];
            if (this.field1541) {
                for (int var49 = 0; ~class176.field3060 < ~var49; ++var49) {
                    int var50 = class144.field2497[var49] * this.field1534;
                    int var51 = this.method589(var48, var46, var45, arg0 + -170, var40, var38 * var50 >> 12, var47);
                    int var52 = var43 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class176.field3060; ++var53) {
                    int var54 = class144.field2497[var53] * this.field1534;
                    int var55 = this.method589(var48, var46, var45, 73, var40, var38 * var54 >> 12, var47);
                    arg1[var53] = var43 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field1530 = class145.method1056(84, this.field1546);
        this.method586((byte) 90);
        ++field1531;
        int var2 = this.field1529 - 1;
        if (arg0 != -3) {
            this.field1530 = null;
        }
        while (~var2 <= -2) {
            short var3 = this.field1535[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1529;
            --var2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
    private final void method586(byte arg0) {
        if (this.field1536 > 0) {
            this.field1535 = new short[this.field1529];
            this.field1540 = new short[this.field1529];
            for (int var2 = 0; ~var2 > ~this.field1529; ++var2) {
                this.field1535[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1536 / 4096.0F), (double) var2)));
                this.field1540[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1535 != null && ~this.field1535.length == ~this.field1529) {
            this.field1540 = new short[this.field1529];
            for (int var3 = 0; this.field1529 > var3; ++var3) {
                this.field1540[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= 84) {
            field1550 = null;
        }
        ++field1533;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg8) {
            field1547 = null;
        }
        if (~arg0 == ~arg6 && arg4 == arg5 && arg3 == arg9 && arg1 == arg2) {
            class287.method1966(arg5, arg3, arg1, (byte) -113, arg7, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg0 * 3;
            int var12 = arg5;
            int var13 = arg6 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg9 * 3;
            int var17 = arg2 * 3;
            int var18 = -var14 + var17 + var15 + -var14;
            int var19 = -var13 + var11 + var16 + -var13;
            int var20 = var14 - var15;
            int var21 = arg1 - var17 - arg5 + var14;
            int var22 = -arg0 + var13 + -var16 + arg3;
            int var23 = -var11 + var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var18 * var25;
                int var29 = var19 * var25;
                int var30 = var23 * var24;
                int var31 = var20 * var24;
                int var32 = (var27 + var29 + var30 >> 12) + arg0;
                int var33 = var21 * var26;
                int var34 = (var28 + var33 - -var31 >> 12) + arg5;
                class287.method1966(var12, var32, var34, (byte) -121, arg7, var10);
                var12 = var34;
                var10 = var32;
            }
        }
        ++field1532;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static void method588(int arg0) {
        field1538 = null;
        field1542 = null;
        field1547 = null;
        if (arg0 > -103) {
            field1543 = null;
        }
        field1550 = null;
        field1543 = null;
        field1548 = null;
        field1551 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)I")
    private final int method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1539;
        int var8 = arg1 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 - -1;
        if (arg4 <= var12) {
            var12 = 0;
        }
        int var13 = var9 & 255;
        int var14 = var12 & 255;
        int var15 = 3 & this.field1530[arg2 + var13];
        int var16 = class154.field2698[var10];
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 != -1 ? -var10 + arg1 : arg1 + var10;
        } else {
            var17 = ~var15 == -3 ? -arg1 + var10 : -var10 - arg1;
        }
        int var18 = this.field1530[arg2 + var14] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg1 + -var11 : -arg1 + var11;
        } else {
            var19 = ~var18 == -1 ? arg1 + var11 : arg1 - var11;
        }
        int var20 = this.field1530[var13 - -arg6] & 3;
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22 = -6 % ((arg3 - 34) / 32);
        int var23;
        if (var20 <= 1) {
            var23 = ~var20 == -1 ? var8 + var10 : -var10 + var8;
        } else {
            var23 = var20 != 2 ? -var8 + -var10 : -var8 + var10;
        }
        int var24 = this.field1530[arg6 + var14] & 3;
        int var25;
        if (var24 <= 1) {
            var25 = ~var24 == -1 ? var8 + var11 : -var11 + var8;
        } else {
            var25 = ~var24 != -3 ? -var8 + -var11 : -var8 + var11;
        }
        int var26 = ((-var23 + var25) * var16 >> 12) + var23;
        return ((-var21 + var26) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)Lwi;")
    public static final class134 method590(int arg0) {
        if (arg0 != 1077250604) {
            return null;
        } else {
            ++field1544;
            try {
                return (class134) Class.forName("ia").newInstance();
            } catch (Throwable var1) {
                return new class140();
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1537;
        int[] var3 = super.field4716.method532((byte) 124, arg0);
        if (arg1 >= -83) {
            this.method585(77, (int[]) null, -50);
        }
        if (super.field4716.field1424) {
            this.method585(255, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field1528 = arg2.method1907(16832);
                                }
                            } else {
                                this.field1534 = arg2.method1907(16832);
                            }
                        } else {
                            this.field1546 = arg2.method1907(16832);
                        }
                    } else {
                        this.field1534 = this.field1528 = arg2.method1907(16832);
                    }
                } else {
                    this.field1536 = arg2.method1914((byte) 62);
                    if (~this.field1536 > -1) {
                        this.field1535 = new short[this.field1529];
                        for (int var5 = 0; var5 < this.field1529; ++var5) {
                            this.field1535[var5] = (short) arg2.method1914((byte) 47);
                        }
                    }
                }
            } else {
                this.field1529 = arg2.method1907(16832);
            }
        } else {
            this.field1541 = ~arg2.method1907(16832) == -2;
        }
        if (arg0 > 11) {
            ++field1545;
        }
    }
}
