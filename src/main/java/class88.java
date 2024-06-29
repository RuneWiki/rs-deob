import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class88 extends class252 {

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    private int field1641 = 4;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    private int field1638 = 4;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    private int field1648 = 1638;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    private int field1645 = 4;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "[B")
    private byte[] field1654 = new byte[512];

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Z")
    private boolean field1647 = true;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[Ljd;")
    public static class85[] field1650;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[S")
    private short[] field1649;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "[S")
    private short[] field1653;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field1638 = arg0.method1711((byte) -67);
                                }
                            } else {
                                this.field1645 = arg0.method1711((byte) -67);
                            }
                        } else {
                            this.field1636 = arg0.method1711((byte) -67);
                        }
                    } else {
                        this.field1645 = this.field1638 = arg0.method1711((byte) -67);
                    }
                } else {
                    this.field1648 = arg0.method1677(true);
                    if (~this.field1648 > -1) {
                        this.field1649 = new short[this.field1641];
                        for (int var5 = 0; ~this.field1641 < ~var5; ++var5) {
                            this.field1649[var5] = (short) arg0.method1677(true);
                        }
                    }
                }
            } else {
                this.field1641 = arg0.method1711((byte) -67);
            }
        } else {
            this.field1647 = ~arg0.method1711((byte) -67) == -2;
        }
        if (arg2 != -99) {
            this.field1638 = -57;
        }
        ++field1640;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)I")
    private final int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1655;
        int var8 = arg4 + -4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 4095;
        int var11 = arg5 + var9;
        if (~arg0 >= ~var11) {
            var11 = 0;
        }
        int var12 = var11 & 255;
        int var13 = var9 & 255;
        int var14 = var10 - 4096;
        int var15 = class28.field424[var10];
        int var16 = this.field1654[arg1 + var13] & 3;
        int var17;
        if (~var16 >= -2) {
            var17 = ~var16 != -1 ? -var10 + arg4 : var10 - -arg4;
        } else {
            var17 = var16 == 2 ? -arg4 + var10 : -arg4 + -var10;
        }
        int var18 = 3 & this.field1654[arg1 + var12];
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? -arg4 + var14 : -arg4 + -var14;
        } else {
            var19 = var18 == 0 ? var14 - -arg4 : arg4 - var14;
        }
        int var20 = 3 & this.field1654[arg6 + var13];
        int var21 = ((-var17 + var19) * var15 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = ~var20 == -3 ? var10 - var8 : -var10 - var8;
        } else {
            var22 = ~var20 != -1 ? -var10 + var8 : var8 + var10;
        }
        int var23 = this.field1654[arg6 + var12] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? -var14 + var8 : var8 + var14;
        } else {
            var24 = ~var23 == -3 ? -var8 + var14 : -var8 + -var14;
        }
        int var25 = var22 - -((-var22 + var24) * var15 >> 12);
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1650 = null;
        if (arg0 <= 80) {
            field1650 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z[II)V")
    private final void method651(boolean arg0, int[] arg1, int arg2) {
        ++field1652;
        int var4 = class39.field622[arg2] * this.field1638;
        if (arg0) {
            this.field1653 = null;
        }
        if (this.field1641 != 1) {
            short var5 = this.field1649[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field1653[0] << 12;
                int var7 = this.field1645 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field1638 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = 255 & this.field1654[255 & var10];
                int var12 = var10 - -1;
                int var13 = var8 & 4095;
                int var14 = class28.field424[var13];
                if (~var12 <= ~var9) {
                    var12 = 0;
                }
                int var15 = 255 & this.field1654[255 & var12];
                for (int var16 = 0; class5.field63 > var16; ++var16) {
                    int var36 = class105.field1838[var16] * this.field1645;
                    int var37 = this.method649(var7, var11, var14, var6 * var36 >> 12, var13, 1, var15);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field1641 > var17; ++var17) {
                short var18 = this.field1649[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field1653[var17] << 12;
                    int var20 = this.field1638 * var19 >> 12;
                    int var21 = this.field1645 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = this.field1654[var23 & 255] & 255;
                    int var25 = var23 + 1;
                    if (var25 >= var20) {
                        var25 = 0;
                    }
                    int var26 = var22 & 4095;
                    int var27 = class28.field424[var26];
                    int var28 = 255 & this.field1654[255 & var25];
                    if (this.field1647 && this.field1641 - 1 == var17) {
                        for (int var29 = 0; var29 < class5.field63; ++var29) {
                            int var30 = class105.field1838[var29] * this.field1645;
                            int var31 = this.method649(var21, var24, var27, var19 * var30 >> 12, var26, 1, var28);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~class5.field63 < ~var33; ++var33) {
                            int var34 = class105.field1838[var33] * this.field1645;
                            int var35 = this.method649(var21, var24, var27, var19 * var34 >> 12, var26, 1, var28);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field1649[0];
            int var39 = this.field1653[0] << 12;
            int var40 = this.field1645 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field1638 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = this.field1654[255 & var43] & 255;
            int var45 = var43 + 1;
            if (~var45 <= ~var42) {
                var45 = 0;
            }
            int var46 = var41 & 4095;
            int var47 = class28.field424[var46];
            int var48 = this.field1654[255 & var45] & 255;
            if (this.field1647) {
                for (int var49 = 0; var49 < class5.field63; ++var49) {
                    int var50 = class105.field1838[var49] * this.field1645;
                    int var51 = this.method649(var40, var44, var47, var39 * var50 >> 12, var46, 1, var48);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; class5.field63 > var53; ++var53) {
                    int var54 = class105.field1838[var53] * this.field1645;
                    int var55 = this.method649(var40, var44, var47, var39 * var54 >> 12, var46, 1, var48);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZIIIII)V")
    public static final void method652(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class221.field3879 = (short) arg3;
        if (arg5 > -64) {
            method655((byte) -58, 51);
        }
        class168.field2897 = (short) arg1;
        ++field1642;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    private final void method653(boolean arg0) {
        if (arg0) {
            if (~this.field1648 >= -1) {
                if (this.field1649 != null && ~this.field1649.length == ~this.field1641) {
                    this.field1653 = new short[this.field1641];
                    for (int var2 = 0; this.field1641 > var2; ++var2) {
                        this.field1653[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field1649 = new short[this.field1641];
                this.field1653 = new short[this.field1641];
                for (int var3 = 0; ~this.field1641 < ~var3; ++var3) {
                    this.field1649[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1648 / 4096.0F), (double) var3)));
                    this.field1653[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field1646;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([IIIIII)V")
    public static final void method654(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class208 var6 = class99.field1780[arg3][arg4][arg5];
        if (var6 != null) {
            class212 var7 = var6.field3640;
            if (var7 == null) {
                class170 var10 = var6.field3644;
                if (var10 != null) {
                    int var11 = var10.field2941;
                    int var12 = var10.field2923;
                    int var13 = var10.field2931;
                    int var14 = var10.field2928;
                    int[] var15 = class233.field4035[var11];
                    int[] var16 = class19.field269[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field3711;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)V")
    public static final void method655(byte arg0, int arg1) {
        ++field1651;
        class54.field950.method1267(arg1, (byte) -54);
        int var2 = 91 % ((-22 - arg0) / 55);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field1643;
        this.field1654 = class263.method1795(-73, this.field1636);
        this.method653(true);
        if (arg0 == 3906) {
            for (int var2 = this.field1641 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field1649[var2];
                if (var3 > 8 || var3 < -8) {
                    return;
                }
                --this.field1641;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
    public static final void method656(int arg0) {
        int var1 = -83 / ((8 - arg0) / 35);
        class23.field330.method1262(17244);
        ++field1639;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) -112);
            ++field1637;
            if (super.field4356.field2258) {
                this.method651(false, var3, arg0);
            }
            return var3;
        }
    }
}
