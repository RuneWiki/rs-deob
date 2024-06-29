import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class103 extends class247 {

    @OriginalMember(owner = "client!fi", name = "fc", descriptor = "I")
    public int field1689 = -1;

    @OriginalMember(owner = "client!fi", name = "cc", descriptor = "I")
    public int field1686 = 0;

    @OriginalMember(owner = "client!fi", name = "ic", descriptor = "I")
    public int field1692 = 0;

    @OriginalMember(owner = "client!fi", name = "nc", descriptor = "I")
    public int field1697 = 0;

    @OriginalMember(owner = "client!fi", name = "tc", descriptor = "I")
    public int field1703 = 0;

    @OriginalMember(owner = "client!fi", name = "mc", descriptor = "Z")
    public boolean field1696 = false;

    @OriginalMember(owner = "client!fi", name = "dc", descriptor = "S")
    private short field1687 = 0;

    @OriginalMember(owner = "client!fi", name = "xc", descriptor = "I")
    public int field1707 = -1;

    @OriginalMember(owner = "client!fi", name = "Fc", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "client!fi", name = "vc", descriptor = "S")
    private short field1705 = 0;

    @OriginalMember(owner = "client!fi", name = "jc", descriptor = "I")
    public int field1693 = -1;

    @OriginalMember(owner = "client!fi", name = "Hc", descriptor = "I")
    public int field1717 = 0;

    @OriginalMember(owner = "client!fi", name = "Gc", descriptor = "I")
    public int field1716 = 0;

    @OriginalMember(owner = "client!fi", name = "Kc", descriptor = "I")
    public int field1720 = -1;

    @OriginalMember(owner = "client!fi", name = "Mc", descriptor = "I")
    private int field1722 = 0;

    @OriginalMember(owner = "client!fi", name = "sc", descriptor = "Ldf;")
    private static class51 field1702 = class46.method233("Select a world", 100);

    @OriginalMember(owner = "client!fi", name = "pc", descriptor = "I")
    public static int field1699 = 2;

    @OriginalMember(owner = "client!fi", name = "lc", descriptor = "Ldf;")
    public static class51 field1695 = field1702;

    @OriginalMember(owner = "client!fi", name = "qc", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!fi", name = "bc", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!fi", name = "ec", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!fi", name = "gc", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!fi", name = "hc", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!fi", name = "kc", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!fi", name = "oc", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!fi", name = "rc", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!fi", name = "uc", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!fi", name = "wc", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!fi", name = "zc", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!fi", name = "Ac", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!fi", name = "Cc", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!fi", name = "Dc", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!fi", name = "Ec", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!fi", name = "Ic", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!fi", name = "Lc", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!fi", name = "yc", descriptor = "Lqa;")
    public class142 field1708;

    @OriginalMember(owner = "client!fi", name = "Bc", descriptor = "Ldf;")
    public class51 field1711;

    @OriginalMember(owner = "client!fi", name = "Jc", descriptor = "Ltb;")
    public class65 field1719;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
    public final boolean method646(byte arg0) {
        ++field1709;
        if (this.field1708 == null) {
            return false;
        } else {
            if (arg0 >= -52) {
                method749(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method94() {
        ++field1701;
        return super.field4313;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIILtb;IIIII)V")
    private final void method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class65 arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1704;
        int var14 = arg4 * arg4 + arg10 * arg10;
        if (arg11 != -15902) {
            this.field1698 = 4;
        }
        if (~var14 <= -17 && ~var14 >= -360001) {
            int var15 = 2047 & (int) (325.949D * Math.atan2((double) arg10, (double) arg4));
            class65 var16 = class22.method120(false, super.field4328, arg7, super.field4348, super.field4319, arg5, var15);
            if (var16 != null) {
                var16.method96(0, arg12, arg9, arg8, arg6, arg0, arg2, arg1, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static void method745(int arg0) {
        if (arg0 != 2) {
            field1702 = null;
        }
        field1695 = null;
        field1702 = null;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(B)V")
    public static final void method746(byte arg0) {
        class128.field2142.method1350((byte) 115);
        ++field1706;
        int var1 = 101 / ((arg0 - 48) / 60);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)Ldf;")
    public final class51 method747(boolean arg0) {
        ++field1712;
        class51 var2 = this.field1711;
        if (class210.field3496 != null) {
            var2 = class20.method104(10, new class51[] { class210.field3496[this.field1722], var2 });
        }
        if (class144.field2406 != null) {
            var2 = class20.method104(23, new class51[] { var2, class144.field2406[this.field1722] });
        }
        if (arg0) {
            method749(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLlb;)V")
    public final void method748(boolean arg0, class121 arg1) {
        ++field1688;
        arg1.field2026 = 0;
        int var3 = arg1.method897(-23);
        boolean var4 = ~(4 & var3) != -1;
        int var5 = 1 & var3;
        if ((2 & var3) == 2) {
            this.field1705 = (short) (arg1.method897(-93) << 2);
            this.field1687 = (short) (arg1.method897(107) << 2);
        } else {
            this.field1687 = 0;
            this.field1705 = 0;
        }
        int var6 = super.field4345;
        this.field1722 = (var3 & 195) >> 6;
        super.field4345 = (7 & var3 >> 3) + 1;
        int var7 = -1;
        super.field4319 += (-var6 + super.field4345) * 64;
        if (!arg0) {
            this.method646((byte) -18);
        }
        super.field4348 += (-var6 + super.field4345) * 64;
        int[] var8 = new int[12];
        this.field1715 = arg1.method912((byte) -90);
        this.field1689 = arg1.method912((byte) -90);
        this.field1717 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method897(-103);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method897(-35);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method876(!arg0);
                    break;
                }
                if (var12 >= 32768) {
                    int var20 = class77.field1234[var12 + -32768];
                    var8[var9] = class82.method642(var20, 1073741824);
                    int var21 = class219.method1508(var20, (byte) -111).field3856;
                    if (var21 != 0) {
                        this.field1717 = var21;
                    }
                } else {
                    var8[var9] = class82.method642(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var19 = arg1.method897(123);
            if (var19 < 0 || var19 >= class203.field3399[var14].length) {
                var19 = 0;
            }
            var13[var14] = var19;
        }
        super.field4304 = arg1.method876(!arg0);
        if (~super.field4304 == -65536) {
            super.field4304 = -1;
        }
        super.field4275 = arg1.method876(!arg0);
        if (~super.field4275 == -65536) {
            super.field4275 = -1;
        }
        super.field4297 = super.field4275;
        super.field4298 = arg1.method876(false);
        if (~super.field4298 == -65536) {
            super.field4298 = -1;
        }
        super.field4287 = arg1.method876(false);
        if (super.field4287 == 65535) {
            super.field4287 = -1;
        }
        super.field4312 = arg1.method876(!arg0);
        if (super.field4312 == 65535) {
            super.field4312 = -1;
        }
        super.field4341 = arg1.method876(!arg0);
        if (~super.field4341 == -65536) {
            super.field4341 = -1;
        }
        super.field4354 = arg1.method876(!arg0);
        if (~super.field4354 == -65536) {
            super.field4354 = -1;
        }
        this.field1711 = class63.method422(arg1.method868(-114), -75).method304((byte) -92);
        this.field1697 = arg1.method897(-75);
        if (var4) {
            this.field1692 = arg1.method876(false);
        } else {
            this.field1692 = 0;
        }
        int var15 = this.field1716;
        this.field1716 = arg1.method897(114);
        if (~this.field1716 != -1) {
            int var16 = this.field1720;
            int var17 = this.field1693;
            int var18 = this.field1707;
            this.field1707 = arg1.method876(false);
            this.field1720 = arg1.method876(false);
            this.field1693 = arg1.method876(false);
            if (~this.field1716 != ~var15 || ~this.field1707 != ~var18 || this.field1720 != var16 || this.field1693 != var17) {
                class50.method265(-45, this);
            }
        } else {
            class17.method86(this, 14420);
        }
        if (this.field1708 == null) {
            this.field1708 = new class142();
        }
        this.field1708.method1021(var13, 31695, var8, var7, ~var5 == -2);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public static final void method749(boolean arg0) {
        if (arg0) {
            ++field1721;
            if (!(class79.field1261 < class207.field3454)) {
                if (class207.field3454 < class79.field1261) {
                    class79.field1261 = (float) ((double) class79.field1261 - (double) class79.field1261 / 30.0D);
                    if (class79.field1261 < class207.field3454) {
                        class79.field1261 = class207.field3454;
                    }
                    class120.method863(86);
                }
            } else {
                class79.field1261 = (float) ((double) class79.field1261 / 30.0D + (double) class79.field1261);
                if (class207.field3454 < class79.field1261) {
                    class79.field1261 = class207.field3454;
                }
                class120.method863(115);
            }
            if (class42.field678 != -1 && ~class3.field16 != 0) {
                int var1 = -class44.field701 + class42.field678;
                if (~var1 > -3 || ~var1 < -3) {
                    var1 >>= 4;
                }
                class44.field701 += var1;
                int var2 = class3.field16 - class169.field2758;
                if (var2 < 2 || ~var2 < -3) {
                    var2 >>= 4;
                }
                if (~var1 == -1 && ~var2 == -1) {
                    class3.field16 = -1;
                    class42.field678 = -1;
                }
                class169.field2758 += var2;
                class120.method863(91);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1713;
        if (this.field1708 != null) {
            class151 var11 = ~super.field4344 != 0 && ~super.field4321 == -1 ? class72.method501(super.field4344, (byte) 24) : null;
            class151 var12 = super.field4314 == -1 || this.field1696 || super.field4314 == super.field4304 && var11 != null ? null : class72.method501(super.field4314, (byte) 14);
            class65 var13 = this.field1708.method1031((byte) -5, var11, super.field4301, var12, super.field4277);
            if (var13 != null) {
                super.field4313 = var13.method94();
                if (class174.field2860 && (~this.field1708.field2372 == 0 || class247.method1678((byte) -63, this.field1708.field2372).field129)) {
                    class65 var14 = class72.method506(super.field4282, 0, 240, var12 != null ? super.field4301 : super.field4277, super.field4328, 2, arg0, var12 == null ? var11 : var12, super.field4348, 0, super.field4319, var13, 1, 160);
                    var14.method96(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class44.field706 == this) {
                    for (int var15 = class135.field2250.length + -1; ~var15 <= -1; --var15) {
                        class157 var16 = class135.field2250[var15];
                        if (var16 != null && ~var16.field2589 != 0) {
                            if (~var16.field2592 == -2 && var16.field2596 >= 0 && ~var16.field2596 > ~class34.field512.length) {
                                class83 var17 = class34.field512[var16.field2596];
                                if (var17 != null) {
                                    int var18 = var17.field4319 / 32 - class44.field706.field4319 / 32;
                                    int var19 = var17.field4348 / 32 + -(class44.field706.field4348 / 32);
                                    this.method744(arg5, arg7, arg6, arg0, var19, var16.field2589, arg4, var13, arg3, arg2, var18, -15902, arg1);
                                }
                            }
                            if (~var16.field2592 == -3) {
                                int var20 = (var16.field2586 - class11.field160) * 4 - -2 + -(class44.field706.field4319 / 32);
                                int var21 = (-class241.field4179 + var16.field2590) * 4 + 2 + -(class44.field706.field4348 / 32);
                                this.method744(arg5, arg7, arg6, arg0, var21, var16.field2589, arg4, var13, arg3, arg2, var20, -15902, arg1);
                            }
                            if (~var16.field2592 == -11 && var16.field2596 >= 0 && class66.field1055.length > var16.field2596) {
                                class103 var22 = class66.field1055[var16.field2596];
                                if (var22 != null) {
                                    int var23 = var22.field4319 / 32 - class44.field706.field4319 / 32;
                                    int var24 = var22.field4348 / 32 + -(class44.field706.field4348 / 32);
                                    this.method744(arg5, arg7, arg6, arg0, var24, var16.field2589, arg4, var13, arg3, arg2, var23, -15902, arg1);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field1705 != 0 && ~this.field1687 != -1) {
                    int var28 = class73.field1155[arg0];
                    short var29 = this.field1705;
                    int var30 = class73.field1167[arg0];
                    short var31 = this.field1687;
                    int var32 = -var29 / 2;
                    int var33 = -var31 / 2;
                    int var34 = var28 * var33 + var30 * var32 >> 16;
                    int var35 = var29 / 2;
                    int var36 = var30 * var33 - var28 * var32 >> 16;
                    int var37 = -var31 / 2;
                    int var38 = class207.method1424(class257.field4496, super.field4319 + var34, (byte) 110, super.field4348 + var36);
                    int var39 = var28 * var37 + var30 * var35 >> 16;
                    int var40 = var30 * var37 + -(var28 * var35) >> 16;
                    int var41 = class207.method1424(class257.field4496, super.field4319 - -var39, (byte) 68, super.field4348 + var40);
                    int var42 = -var29 / 2;
                    int var43 = var31 / 2;
                    int var44 = var29 / 2;
                    int var45 = var30 * var43 + -(var28 * var42) >> 16;
                    int var46 = var28 * var43 + var30 * var42 >> 16;
                    int var47 = var31 / 2;
                    int var48 = var28 * var47 - -(var30 * var44) >> 16;
                    int var49 = var30 * var47 + -(var28 * var44) >> 16;
                    int var50 = ~var41 >= ~var38 ? var41 : var38;
                    int var51 = class207.method1424(class257.field4496, super.field4319 + var46, (byte) 11, super.field4348 + var45);
                    int var52 = ~var51 < ~var38 ? var38 : var51;
                    int var53 = class207.method1424(class257.field4496, super.field4319 + var48, (byte) 37, super.field4348 + var49);
                    int var54 = ~var41 > ~var53 ? var41 : var53;
                    int var55 = var38 + var53;
                    if (var41 - -var51 < var55) {
                        var55 = var41 + var51;
                    }
                    int var56 = var53 > var51 ? var51 : var53;
                    var25 = (int) (Math.atan2((double) (-var56 + var50), (double) var31) * 325.95D) & 2047;
                    if (var25 != 0) {
                        var13.method436(var25);
                    }
                    var26 = 2047 & (int) (325.95D * Math.atan2((double) (var52 - var54), (double) var29));
                    if (var26 != 0) {
                        var13.method451(var26);
                    }
                    var27 = (var55 >> 1) + -super.field4328;
                    if (~var27 != -1) {
                        var13.method448(0, var27, 0);
                    }
                }
                class65 var57 = null;
                if (!this.field1696 && ~super.field4334 != 0 && super.field4306 != -1) {
                    class82 var58 = class195.method1384(super.field4334, 0);
                    var57 = var58.method639((byte) -4, super.field4306);
                    if (var57 != null) {
                        var57.method448(0, -super.field4357, 0);
                        if (var58.field1364) {
                            if (var25 != 0) {
                                var57.method436(var25);
                            }
                            if (~var26 != -1) {
                                var57.method451(var26);
                            }
                            if (~var27 != -1) {
                                var57.method448(0, var27, 0);
                            }
                        }
                    }
                }
                class65 var59 = null;
                if (!this.field1696 && this.field1719 != null) {
                    if (~class179.field2960 <= ~this.field1686) {
                        this.field1719 = null;
                    }
                    if (~this.field1703 >= ~class179.field2960 && ~class179.field2960 > ~this.field1686) {
                        var59 = this.field1719;
                        var59.method448(-super.field4319 + this.field1691, -super.field4328 + this.field1710, -super.field4348 + this.field1698);
                        if (super.field4294 != 512) {
                            if (super.field4294 == 1024) {
                                var59.method438();
                            } else if (~super.field4294 == -1537) {
                                var59.method453();
                            }
                        } else {
                            var59.method454();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class137) var13).method994(var57);
                }
                if (var59 != null) {
                    var13 = ((class137) var13).method994(var59);
                }
                var13.field1053 = true;
                var13.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (super.field4294 == 512) {
                        var59.method453();
                    } else if (~super.field4294 != -1025) {
                        if (super.field4294 == 1536) {
                            var59.method454();
                        }
                    } else {
                        var59.method438();
                    }
                    var59.method448(super.field4319 - this.field1691, super.field4328 - this.field1710, -this.field1698 + super.field4348);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIZIIIIIII)V")
    public static final void method750(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1685;
        int var11 = arg10 - arg5;
        int var12 = -arg4 + arg6;
        boolean var13;
        if (class55.field940 > 0 && ~(class55.field940 % 10) > -6) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg1;
        for (int var16 = -var15; ~var16 > ~(var11 + var15); ++var16) {
            int var18 = arg0 - -(arg1 * var16) >> 16;
            int var19 = arg0 - -((var16 + 1) * arg1) >> 16;
            int var20 = var19 - var18;
            if (~var20 < -1) {
                int var21 = arg8 + var18;
                int var10000 = arg8 + var19;
                int var23 = arg5 + var16 >> 6;
                if (~var23 <= -1 && ~(class79.field1266.length + -1) <= ~var23) {
                    int[][] var24 = class79.field1266[var23];
                    for (int var25 = -var14; var12 + var14 > var25; ++var25) {
                        int var26 = (var25 + 1) * arg2 + arg9 >> 16;
                        int var27 = arg2 * var25 + arg9 >> 16;
                        int var28 = -var27 + var26;
                        if (~var28 < -1) {
                            int var29 = arg7 + var27;
                            var10000 = arg7 + var26;
                            int var31 = arg4 + var25 >> 6;
                            if (~var31 <= -1 && ~(var24.length + -1) <= ~var31 && var24[var31] != null) {
                                int var32 = (4032 & arg4 + var25 << 6) - -(63 & var16 - -arg5);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class108 var34 = class41.method210(var33 + -1, (byte) 75);
                                    if (var13 && ~class98.field1645 == ~var34.field1826) {
                                        class76 var35 = new class76();
                                        var35.field1231 = var34.field1826;
                                        var35.field1225 = var29;
                                        var35.field1228 = var21;
                                        class41.field646.method1709(63, var35);
                                    }
                                    class50.field797[var34.field1826].method1103(var21 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class76 var17 = (class76) class41.field646.method1720(true); var17 != null; var17 = (class76) class41.field646.method1712((byte) 112)) {
            class50.field797[var17.field1231].method1103(var17.field1228 + -7, var17.field1225 - 7);
            class59.method377(var17.field1228, var17.field1225, 15, 16776960, 128);
            class59.method377(var17.field1228, var17.field1225, 7, 16777215, 256);
        }
        class41.field646.method1708(2);
        if (arg3) {
            method745(94);
        }
    }
}
