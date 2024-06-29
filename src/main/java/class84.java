import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class84 extends class166 {

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    private int field1631 = 4;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "Z")
    private boolean field1634 = true;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private int field1624 = 4;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[B")
    private byte[] field1629 = new byte[512];

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "I")
    private int field1644 = 4;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    private int field1638 = 1638;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lph;")
    public static class76 field1623;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "[S")
    private short[] field1620;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[S")
    private short[] field1625;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method617(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 3) {
            method619((byte) -47);
        }
        ++field1642;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return !arg0 ? var3 : class26.method151(var3, (byte) 72);
        } else if (arg1 instanceof class46) {
            class46 var4 = (class46) arg1;
            return var4.method263((byte) 100);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[I)V")
    private final void method618(int arg0, int arg1, int[] arg2) {
        ++field1622;
        int var4 = class13.field187[arg0] * this.field1631;
        if (this.field1644 == 1) {
            short var5 = this.field1625[0];
            int var6 = this.field1620[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field1631 * var6 >> 12;
            int var9 = this.field1624 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var7 & 4095;
            int var12 = this.field1629[var10 & 255] & 255;
            int var13 = class3.field7[var11];
            int var14 = var10 + 1;
            if (var14 >= var8) {
                var14 = 0;
            }
            int var15 = 255 & this.field1629[var14 & 255];
            if (this.field1634) {
                for (int var16 = 0; ~var16 > ~class253.field4565; ++var16) {
                    int var17 = class24.field347[var16] * this.field1624;
                    int var18 = this.method622(var9, 3, var13, var11, var15, var6 * var17 >> 12, var12);
                    int var19 = var5 * var18 >> 12;
                    arg2[var16] = 2048 - -(var19 >> 1);
                }
            } else {
                for (int var20 = 0; var20 < class253.field4565; ++var20) {
                    int var21 = class24.field347[var20] * this.field1624;
                    int var22 = this.method622(var9, 3, var13, var11, var15, var6 * var21 >> 12, var12);
                    arg2[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field1625[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field1620[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field1631 * var24 >> 12;
                int var27 = this.field1624 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = 255 & this.field1629[var28 & 255];
                int var30 = var25 & 4095;
                int var31 = var28 - -1;
                if (var31 >= var26) {
                    var31 = 0;
                }
                int var32 = class3.field7[var30];
                int var33 = this.field1629[255 & var31] & 255;
                for (int var34 = 0; var34 < class253.field4565; ++var34) {
                    int var54 = class24.field347[var34] * this.field1624;
                    int var55 = this.method622(var27, arg1 + -17065, var32, var30, var33, var24 * var54 >> 12, var29);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field1644 > var35; ++var35) {
                short var36 = this.field1625[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field1620[var35] << 12;
                    int var38 = this.field1631 * var37 >> 12;
                    int var39 = this.field1624 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = this.field1629[255 & var41] & 255;
                    int var43 = var41 - -1;
                    int var44 = var40 & 4095;
                    if (~var43 <= ~var38) {
                        var43 = 0;
                    }
                    int var45 = this.field1629[var43 & 255] & 255;
                    int var46 = class3.field7[var44];
                    if (this.field1634 && ~(this.field1644 + -1) == ~var35) {
                        for (int var47 = 0; ~class253.field4565 < ~var47; ++var47) {
                            int var48 = class24.field347[var47] * this.field1624;
                            int var49 = this.method622(var39, 3, var46, var44, var45, var37 * var48 >> 12, var42);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class253.field4565 < ~var51; ++var51) {
                            int var52 = class24.field347[var51] * this.field1624;
                            int var53 = this.method622(var39, 3, var46, var44, var45, var37 * var52 >> 12, var42);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 != 17068) {
            this.field1638 = -119;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static final void method619(byte arg0) {
        class59.field1072.method1713(-104);
        if (arg0 > -88) {
            field1623 = null;
        }
        ++field1637;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1632;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            this.method618(arg0, arg1 ^ 8371539, var3);
        }
        if (arg1 != 8388607) {
            method620((byte) 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
    public static void method620(byte arg0) {
        field1623 = null;
        int var1 = -80 % ((51 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1630;
        if (arg3 == arg4 && ~arg1 == ~arg2 && arg5 == arg8 && arg6 == arg7) {
            class69.method459((byte) -125, arg9, arg2, arg6, arg8, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg4 * 3;
            int var12 = arg2;
            int var13 = arg2 * 3;
            int var14 = arg3 * 3;
            int var15 = arg1 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 * 3;
            int var18 = -var16 + var14 + arg8 + -arg4;
            int var19 = -var14 + var16 + -var14 - -var11;
            int var20 = -var17 - arg2 + arg6 + var15;
            int var21 = -var15 + var17 - (var15 - var13);
            int var22 = -var13 + var15;
            int var23 = var14 - var11;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var19 * var26;
                int var28 = var24 * var26 >> 12;
                int var29 = var21 * var26;
                int var30 = var18 * var28;
                int var31 = var20 * var28;
                int var32 = var23 * var24;
                int var33 = var22 * var24;
                int var34 = (var29 + var31 + var33 >> 12) + arg2;
                int var35 = (var30 + var32 - -var27 >> 12) + arg4;
                class69.method459((byte) -101, arg9, var12, var34, var35, var10);
                var10 = var35;
                var12 = var34;
            }
        }
        int var25 = 0 % ((82 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)I")
    private final int method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1640;
        int var8 = arg3 + -4096;
        int var9 = arg5 >> 12;
        int var10 = var9 - -1;
        int var11 = var9 & 255;
        int var12 = this.field1629[arg6 + var11] & 3;
        int var13 = arg5 & 4095;
        int var14 = class3.field7[var13];
        if (~arg0 >= ~var10) {
            var10 = 0;
        }
        int var15 = var13 + -4096;
        int var16 = var10 & 255;
        int var17;
        if (var12 > 1) {
            var17 = ~var12 != -3 ? -var13 - arg3 : -arg3 + var13;
        } else {
            var17 = ~var12 == -1 ? arg3 + var13 : arg3 - var13;
        }
        int var18 = 3 & this.field1629[var16 - -arg6];
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? arg3 - var15 : arg3 + var15;
        } else {
            var19 = var18 != 2 ? -arg3 + -var15 : -arg3 + var15;
        }
        int var20 = 3 & this.field1629[arg4 + var11];
        int var21 = ((-var17 + var19) * var14 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = ~var20 == -3 ? var13 - var8 : -var8 + -var13;
        } else {
            var22 = var20 == 0 ? var13 - -var8 : var8 - var13;
        }
        int var23 = this.field1629[var16 - -arg4] & arg1;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 != -3 ? -var8 + -var15 : -var8 + var15;
        } else {
            var24 = var23 == 0 ? var15 - -var8 : -var15 + var8;
        }
        int var25 = var22 - -((var24 - var22) * var14 >> 12);
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field1639;
        this.field1629 = class181.method1320(-27019, this.field1635);
        this.method624(-13645);
        for (int var2 = this.field1644 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1625[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field1644;
        }
        int var4 = -98 / ((58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)I")
    public static final int method623(int arg0, int arg1) {
        if (arg1 != -3) {
            return -98;
        } else {
            ++field1643;
            class209 var2 = class50.method293(1, arg0);
            int var3 = var2.field3815;
            int var4 = var2.field3800;
            int var5 = var2.field3810;
            int var6 = class202.field3647[-var5 + var4];
            return class50.field812[var3] >> var5 & var6;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1631 = arg1.method937(false);
                                }
                            } else {
                                this.field1624 = arg1.method937(false);
                            }
                        } else {
                            this.field1635 = arg1.method937(false);
                        }
                    } else {
                        this.field1624 = this.field1631 = arg1.method937(false);
                    }
                } else {
                    this.field1638 = arg1.method955((byte) -107);
                    if (~this.field1638 > -1) {
                        this.field1625 = new short[this.field1644];
                        for (int var5 = 0; ~this.field1644 < ~var5; ++var5) {
                            this.field1625[var5] = (short) arg1.method955((byte) 79);
                        }
                    }
                }
            } else {
                this.field1644 = arg1.method937(false);
            }
        } else {
            this.field1634 = arg1.method937(false) == 1;
        }
        if (arg0 != 96) {
            this.field1624 = -108;
        }
        ++field1641;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    private final void method624(int arg0) {
        ++field1633;
        if (arg0 != -13645) {
            method617(false, (Object) null, -80);
        }
        if (~this.field1638 < -1) {
            this.field1625 = new short[this.field1644];
            this.field1620 = new short[this.field1644];
            for (int var2 = 0; ~this.field1644 < ~var2; ++var2) {
                this.field1625[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1638 / 4096.0F), (double) var2)));
                this.field1620[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1625 != null && ~this.field1625.length == ~this.field1644) {
            this.field1620 = new short[this.field1644];
            for (int var3 = 0; var3 < this.field1644; ++var3) {
                this.field1620[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLsd;)V")
    public static final void method625(boolean arg0, class42 arg1) {
        ++field1628;
        class150 var2 = null;
        if (!arg0) {
            try {
                class86 var3 = arg1.method233((byte) 126, "runescape");
                while (~var3.field1663 == -1) {
                    class59.method356(false, 1L);
                }
                if (~var3.field1663 == -2) {
                    var2 = (class150) var3.field1666;
                    class128 var4 = class56.method342((byte) -109);
                    var2.method1124(0, -59, var4.field2385, var4.field2379);
                }
            } catch (Exception var6) {
            }
            try {
                if (var2 != null) {
                    var2.method1129(1);
                }
            } catch (Exception var5) {
            }
        }
    }
}
