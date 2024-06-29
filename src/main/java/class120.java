import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class120 extends class14 {

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public int field1751 = 0;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public int field1750 = 4;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public int field1747 = 4;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public int field1760 = 1638;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "[B")
    private byte[] field1758 = new byte[512];

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public int field1759 = 4;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "Z")
    public boolean field1762 = true;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "[Lcl;")
    public static class173[] field1754 = new class173[4];

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Lpc;")
    public static class473 field1752;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[S")
    private short[] field1748;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[S")
    private short[] field1755;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V", line = 4)
    public static void method832(boolean arg0) {
        field1752 = null;
        if (arg0) {
            method832(false);
        }
        field1754 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLmd;)V", line = 16)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = -70 / ((arg1 - -51) / 37);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1747 = arg2.method2238(255);
                                }
                            } else {
                                this.field1759 = arg2.method2238(255);
                            }
                        } else {
                            this.field1751 = arg2.method2238(255);
                        }
                    } else {
                        this.field1759 = this.field1747 = arg2.method2238(255);
                    }
                } else {
                    this.field1760 = arg2.method2202(-26372);
                    if (~this.field1760 > -1) {
                        this.field1748 = new short[this.field1750];
                        for (int var6 = 0; ~var6 > ~this.field1750; ++var6) {
                            this.field1748[var6] = (short) arg2.method2202(-26372);
                        }
                    }
                }
            } else {
                this.field1750 = arg2.method2238(255);
            }
        } else {
            this.field1762 = arg2.method2238(255) == 1;
        }
        ++field1753;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 108)
    public final void method142(byte arg0) {
        this.field1758 = class323.method1861(255, this.field1751);
        ++field1757;
        this.method835((byte) 100);
        for (int var2 = this.field1750 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1748[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field1750;
        }
        int var4 = -8 % ((arg0 - 39) / 59);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 138)
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLql;)V", line = 142)
    public static final void method833(byte arg0, class515 arg1) {
        ++field1744;
        if (arg0 < 81) {
            field1754 = null;
        }
        class219 var2 = (class219) class368.field4965.method182((long) arg1.field6170, (byte) 111);
        if (var2 == null) {
            class229.method1430((class1) null, 35, arg1, (class117) null, arg1.field6261[0], 0, arg1.field573, arg1.field6266[0]);
        } else {
            var2.method1389(105);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIIII)I", line = 169)
    private final int method834(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1756;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg2) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg5 & 4095;
        int var12 = arg6 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 - 4096;
        int var15 = class200.field2776[var11];
        int var16 = 3 & this.field1758[var10 - -arg3];
        int var17;
        if (var16 <= 1) {
            var17 = var16 != 0 ? -var11 + arg6 : var11 - -arg6;
        } else {
            var17 = ~var16 == -3 ? var11 - arg6 : -arg6 + -var11;
        }
        int var18 = 3 & this.field1758[arg3 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 == -1 ? var14 - -arg6 : -var14 + arg6;
        } else {
            var19 = ~var18 == -3 ? var14 - arg6 : -var14 - arg6;
        }
        int var20 = -26 % ((arg0 - 80) / 33);
        int var21 = this.field1758[arg4 + var10] & 3;
        int var22 = ((-var17 + var19) * var15 >> 12) + var17;
        int var23;
        if (var21 > 1) {
            var23 = var21 == 2 ? -var12 + var11 : -var11 + -var12;
        } else {
            var23 = var21 != 0 ? -var11 + var12 : var11 + var12;
        }
        int var24 = this.field1758[arg4 + var13] & 3;
        int var25;
        if (var24 <= 1) {
            var25 = ~var24 != -1 ? -var14 + var12 : var14 - -var12;
        } else {
            var25 = var24 == 2 ? -var12 + var14 : -var12 + -var14;
        }
        int var26 = var23 - -((-var23 + var25) * var15 >> 12);
        return ((var26 - var22) * arg1 >> 12) + var22;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V", line = 254)
    private final void method835(byte arg0) {
        if (arg0 < 42) {
            this.field1760 = -58;
        }
        ++field1761;
        if (this.field1760 > 0) {
            this.field1748 = new short[this.field1750];
            this.field1755 = new short[this.field1750];
            for (int var2 = 0; ~this.field1750 < ~var2; ++var2) {
                this.field1748[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1760 / 4096.0F), (double) var2)));
                this.field1755[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1748 != null && ~this.field1748.length == ~this.field1750) {
            this.field1755 = new short[this.field1750];
            for (int var3 = 0; ~var3 > ~this.field1750; ++var3) {
                this.field1755[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I", line = 296)
    public final int[] method140(int arg0, byte arg1) {
        ++field1745;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            this.method836(var3, 4095, arg0);
        }
        if (arg1 >= -2) {
            field1754 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V", line = 318)
    public final void method836(int[] arg0, int arg1, int arg2) {
        ++field1749;
        int var4 = class273.field3590[arg2] * this.field1747;
        if (arg1 == 4095) {
            if (this.field1750 == 1) {
                int var5 = this.field1755[0] << 12;
                short var6 = this.field1748[0];
                int var7 = this.field1759 * var5 >> 12;
                int var8 = this.field1747 * var5 >> 12;
                int var9 = var4 * var5 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                if (~var8 >= ~var11) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = 255 & this.field1758[255 & var11];
                int var14 = this.field1758[var10 & 255] & 255;
                int var15 = class200.field2776[var12];
                if (!this.field1762) {
                    for (int var16 = 0; ~class115.field1637 < ~var16; ++var16) {
                        int var17 = class195.field2715[var16] * this.field1759;
                        int var18 = this.method834((byte) -31, var15, var7, var14, var13, var5 * var17 >> 12, var12);
                        arg0[var16] = var6 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; class115.field1637 > var19; ++var19) {
                        int var20 = class195.field2715[var19] * this.field1759;
                        int var21 = this.method834((byte) -55, var15, var7, var14, var13, var5 * var20 >> 12, var12);
                        int var22 = var6 * var21 >> 12;
                        arg0[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field1748[0];
                if (~var23 < -9 || ~var23 > 7) {
                    int var24 = this.field1755[0] << 12;
                    int var25 = this.field1759 * var24 >> 12;
                    int var26 = this.field1747 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var28 + 1;
                    int var30 = var27 & 4095;
                    if (var29 >= var26) {
                        var29 = 0;
                    }
                    int var31 = class200.field2776[var30];
                    int var32 = this.field1758[255 & var28] & 255;
                    int var33 = this.field1758[var29 & 255] & 255;
                    for (int var34 = 0; ~class115.field1637 < ~var34; ++var34) {
                        int var54 = class195.field2715[var34] * this.field1759;
                        int var55 = this.method834((byte) 47, var31, var25, var32, var33, var24 * var54 >> 12, var30);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~var35 > ~this.field1750; ++var35) {
                    short var36 = this.field1748[var35];
                    if (var36 > 8 || var36 < -8) {
                        int var37 = this.field1755[var35] << 12;
                        int var38 = this.field1747 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field1759 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var41 + 1;
                        int var43 = var39 & 4095;
                        if (~var42 <= ~var38) {
                            var42 = 0;
                        }
                        int var44 = 255 & this.field1758[var42 & 255];
                        int var45 = 255 & this.field1758[255 & var41];
                        int var46 = class200.field2776[var43];
                        if (this.field1762 && this.field1750 + -1 == var35) {
                            for (int var47 = 0; ~var47 > ~class115.field1637; ++var47) {
                                int var48 = class195.field2715[var47] * this.field1759;
                                int var49 = this.method834((byte) 120, var46, var40, var45, var44, var37 * var48 >> 12, var43);
                                int var50 = arg0[var47] - -(var36 * var49 >> 12);
                                arg0[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class115.field1637 > var51; ++var51) {
                                int var52 = class195.field2715[var51] * this.field1759;
                                int var53 = this.method834((byte) -101, var46, var40, var45, var44, var37 * var52 >> 12, var43);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }
}
