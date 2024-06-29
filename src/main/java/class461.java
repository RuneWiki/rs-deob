import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class461 extends class109 {

    @OriginalMember(owner = "client!cca", name = "pd", descriptor = "I")
    public int field6690 = -1;

    @OriginalMember(owner = "client!cca", name = "rd", descriptor = "I")
    public int field6692 = -1;

    @OriginalMember(owner = "client!cca", name = "kd", descriptor = "Ltm;")
    public static class334 field6685 = new class334(101, 7);

    @OriginalMember(owner = "client!cca", name = "yd", descriptor = "I")
    public static int field6699 = 100;

    @OriginalMember(owner = "client!cca", name = "ed", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!cca", name = "fd", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!cca", name = "gd", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!cca", name = "hd", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!cca", name = "id", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!cca", name = "jd", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!cca", name = "ld", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!cca", name = "md", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!cca", name = "od", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!cca", name = "qd", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!cca", name = "sd", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!cca", name = "td", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!cca", name = "ud", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!cca", name = "vd", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!cca", name = "wd", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!cca", name = "xd", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!cca", name = "zd", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!cca", name = "Ad", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!cca", name = "Bd", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!cca", name = "nd", descriptor = "Lmaa;")
    public class504 field6688;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I", line = 5)
    public final int method879(int arg0) {
        ++field6701;
        if (this.field6688.field7308 != null) {
            class504 var2 = this.field6688.method3046(-108, class422.field6216);
            if (var2 != null && ~var2.field7338 != 0) {
                return var2.field7338;
            }
        }
        return arg0 != 0 ? 28 : this.field6688.field7338;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lha;I)Lkn;", line = 26)
    public final class516 method93(class544 arg0, int arg1) {
        ++field6696;
        if (arg1 != 1) {
            this.field6692 = -64;
        }
        return null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 40)
    public static final String[] method2822(byte arg0, String[] arg1) {
        ++field6695;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0 >= -53) {
            return null;
        } else {
            while (~var3 > -6) {
                var2[var3] = var3 + ": ";
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = var2[var3] + arg1[var3];
                }
                ++var3;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)Z", line = 65)
    private final boolean method2823(boolean arg0) {
        ++field6697;
        if (arg0) {
            this.method104(true, -95, (class544) null, (class668) null, -28, 73, true);
        }
        return this.field6688.field7334;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V", line = 76)
    public final void method2824(int arg0, int arg1, int arg2) {
        ++field6691;
        int var4 = super.field1702[0];
        int var5 = super.field1704[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg0 != -761903127) {
            this.method2824(107, -17, 42);
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (arg2 == 7) {
            ++var5;
            --var4;
        }
        if (~super.field1695 != 0 && class83.field1219.method2358((byte) 51, super.field1695).field1207 == 1) {
            super.field1695 = -1;
            super.field1591 = null;
        }
        if (super.field1595 != -1) {
            class417 var6 = class41.field718.method1529((byte) 71, super.field1595);
            if (var6.field6123 && var6.field6136 != -1 && class83.field1219.method2358((byte) 92, var6.field6136).field1207 == 1) {
                super.field1595 = -1;
            }
        }
        if (~super.field1693 != 0) {
            class417 var7 = class41.field718.method1529((byte) 14, super.field1693);
            if (var7.field6123 && var7.field6136 != -1 && ~class83.field1219.method2358((byte) -97, var7.field6136).field1207 == -2) {
                super.field1693 = -1;
            }
        }
        if (~super.field1706 > -10) {
            ++super.field1706;
        }
        for (int var8 = super.field1706; ~var8 < -1; --var8) {
            super.field1702[var8] = super.field1702[var8 + -1];
            super.field1704[var8] = super.field1704[var8 + -1];
            super.field1708[var8] = super.field1708[var8 + -1];
        }
        super.field1702[0] = var4;
        super.field1708[0] = (byte) arg1;
        super.field1704[0] = var5;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZIBII)V", line = 177)
    public final void method2825(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field6679;
        if (arg3 == -43) {
            super.field9470 = super.field9469 = (byte) arg0;
            if (class584.method3365(false, arg4, arg2)) {
                ++super.field9469;
            }
            if (super.field1695 != -1 && class83.field1219.method2358((byte) 69, super.field1695).field1207 == 1) {
                super.field1591 = null;
                super.field1695 = -1;
            }
            if (~super.field1595 != 0) {
                class417 var7 = class41.field718.method1529((byte) 45, super.field1595);
                if (var7.field6123 && ~var7.field6136 != 0 && class83.field1219.method2358((byte) 64, var7.field6136).field1207 == 1) {
                    super.field1595 = -1;
                }
            }
            if (super.field1693 != -1) {
                class417 var8 = class41.field718.method1529((byte) 18, super.field1693);
                if (var8.field6123 && var8.field6136 != -1 && ~class83.field1219.method2358((byte) 91, var8.field6136).field1207 == -2) {
                    super.field1693 = -1;
                }
            }
            if (!arg1) {
                int var9 = -super.field1702[0] + arg4;
                int var10 = -super.field1704[0] + arg2;
                if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                    if (~super.field1706 > -10) {
                        ++super.field1706;
                    }
                    for (int var11 = super.field1706; ~var11 < -1; --var11) {
                        super.field1702[var11] = super.field1702[var11 - 1];
                        super.field1704[var11] = super.field1704[var11 - 1];
                        super.field1708[var11] = super.field1708[var11 - 1];
                    }
                    super.field1702[0] = arg4;
                    super.field1704[0] = arg2;
                    super.field1708[0] = 1;
                    return;
                }
            }
            super.field1703 = 0;
            super.field1707 = 0;
            super.field1706 = 0;
            super.field1702[0] = arg4;
            super.field1704[0] = arg2;
            super.field9477 = (super.field1702[0] << 9) + (arg5 << 8);
            super.field9475 = (super.field1704[0] << 9) + (arg5 << 8);
            if (super.field1709 != null) {
                super.field1709.method3548();
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)V", line = 261)
    public final void method102(int arg0) {
        ++field6684;
        if (arg0 != 0) {
            this.method97((class544) null, 85);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(ILha;)Lgh;", line = 275)
    public final class48 method103(int arg0, class544 arg1) {
        ++field6681;
        if (this.field6688 != null && this.method2828(arg1, arg0 ^ 67, 2048)) {
            class73 var3 = arg1.method343();
            int var4 = super.field1636.method3102(-8255);
            var3.method676(var4);
            class114 var5 = class488.field7062[super.field9470][super.field9477 >> class662.field9425][super.field9475 >> class662.field9425];
            if (var5 != null && var5.field1768 != null) {
                int var6 = -var5.field1768.field10024 + super.field1596;
                super.field1596 = (int) ((float) super.field1596 - (float) var6 / 10.0F);
            } else {
                super.field1596 = (int) ((float) super.field1596 - (float) super.field1596 / 10.0F);
            }
            var3.method671(super.field9477, -super.field1596 + super.field9474 - 20, super.field9475);
            class228 var7 = this.method885(-102);
            class504 var8 = this.field6688.field7308 == null ? this.field6688 : this.field6688.method3046(90, class422.field6216);
            super.field1700 = false;
            class48 var9 = null;
            if (~class654.field9289.field5445.method2362(3) == -2 && var8.field7321 && var7.field3682) {
                class82 var10 = ~super.field1695 != 0 && ~super.field1686 == -1 ? class83.field1219.method2358((byte) -91, super.field1695) : null;
                class82 var11 = ~super.field1679 == 0 || super.field1598 && var10 != null ? null : class83.field1219.method2358((byte) 89, super.field1679);
                class282 var12 = class197.method1476(super.field1647, super.field1661, var4, var11 == null ? var10 : var11, arg0 + -68, 255 & this.field6688.field7307, var11 == null ? super.field1626 : super.field1607, super.field1699[0], this.field6688.field7303, arg1, 65535 & this.field6688.field7336, super.field1593, this.field6688.field7319 & 255, 65535 & this.field6688.field7350);
                if (var12 != null) {
                    var9 = class331.method2130(super.field1699.length - -1, (byte) 92, this.method2823(false));
                    super.field1700 = true;
                    arg1.method326(false);
                    if (class141.field2211) {
                        var12.method1026(var3, var9.field795[super.field1699.length], class106.field1553, 0);
                    } else {
                        var12.method1007(var3, var9.field795[super.field1699.length], 0);
                    }
                    arg1.method326(true);
                }
            }
            var3.method676(var4);
            var3.method671(super.field9477, super.field9474 + -5 + -super.field1596, super.field9475);
            if (var9 == null) {
                var9 = class331.method2130(super.field1699.length, (byte) 92, this.method2823(false));
            }
            this.method886(super.field1699, arg1, -37, false, var3);
            if (!class141.field2211) {
                for (int var13 = 0; ~var13 > ~super.field1699.length; ++var13) {
                    if (super.field1699[var13] != null) {
                        super.field1699[var13].method1007(var3, var9.field795[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field1699.length; ++var14) {
                    if (super.field1699[var14] != null) {
                        super.field1699[var14].method1026(var3, var9.field795[var14], class106.field1553, 0);
                    }
                }
            }
            if (super.field1709 != null) {
                class315 var15 = super.field1709.method3556();
                if (class141.field2211) {
                    arg1.method380(var15, class106.field1553);
                } else {
                    arg1.method420(var15);
                }
            }
            for (int var16 = arg0; ~super.field1699.length < ~var16; ++var16) {
                if (super.field1699[var16] != null) {
                    super.field1700 |= super.field1699[var16].method1048();
                }
            }
            super.field1631 = class475.field6901;
            super.field1699[0] = super.field1699[1] = super.field1699[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "(I)I", line = 400)
    public final int method895(int arg0) {
        ++field6694;
        if (this.field6688.field7308 != null) {
            class504 var2 = this.field6688.method3046(arg0 ^ -105, class422.field6216);
            if (var2 != null && ~var2.field7322 != 0) {
                return var2.field7322;
            }
        }
        if (arg0 != -1) {
            field6699 = -65;
        }
        return this.field6688.field7322;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILha;I)Z", line = 426)
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field6687;
        if (this.field6688 != null && this.method2828(arg2, 110, 131072)) {
            class73 var5 = arg2.method343();
            int var6 = super.field1636.method3102(-8255);
            int var7 = 28 % ((-80 - arg3) / 44);
            var5.method676(var6);
            var5.method671(super.field9477, super.field9474, super.field9475);
            boolean var8 = false;
            for (int var9 = 0; ~var9 > ~super.field1699.length; ++var9) {
                if (super.field1699[var9] != null) {
                    boolean var10000;
                    label43: {
                        if (this.field6688.field7317 <= 0) {
                            label41: {
                                if (~this.field6688.field7325 != 0) {
                                    if (~this.field6688.field7325 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field6688.field7303 == 1) {
                                        break label41;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label43;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var10 = var10000;
                    boolean var11;
                    if (!class141.field2211) {
                        var11 = super.field1699[var9].method1010(arg0, arg1, var5, var10, this.field6688.field7317);
                    } else {
                        var11 = super.field1699[var9].method1023(arg0, arg1, var5, var10, this.field6688.field7317, class106.field1553);
                    }
                    if (var11) {
                        var8 = true;
                        break;
                    }
                }
            }
            super.field1699[0] = super.field1699[1] = super.field1699[2] = null;
            return var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "(I)Z", line = 479)
    public final boolean method2826(int arg0) {
        ++field6702;
        int var2 = -26 % ((28 - arg0) / 62);
        return this.field6688 != null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZILha;Lov;IIZ)V", line = 493)
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            this.field6690 = -93;
        }
        ++field6698;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(III)Z", line = 504)
    public static final boolean method2827(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field6699 = 16;
        }
        ++field6686;
        return (class629.method3565(arg2, (byte) 54, arg1) | class502.method3038(arg1, arg2, 124) | class4.method15(arg1, arg2, true)) & class512.method3077(arg2, arg1, 127);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I", line = 516)
    public final int method883(byte arg0) {
        ++field6700;
        int var2 = -96 / ((arg0 - 28) / 41);
        if (this.field6688.field7308 != null) {
            class504 var3 = this.field6688.method3046(-127, class422.field6216);
            if (var3 != null && var3.field7345 != -1) {
                return var3.field7345;
            }
        }
        return ~this.field6688.field7345 != 0 ? this.field6688.field7345 : super.method883((byte) 115);
    }

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)Z", line = 537)
    public final boolean method92(int arg0) {
        ++field6682;
        if (arg0 != 2) {
            field6685 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lha;II)Z", line = 549)
    private final boolean method2828(class544 arg0, int arg1, int arg2) {
        ++field6689;
        if (arg1 <= 66) {
            return true;
        } else {
            int var4 = arg2;
            class228 var5 = this.method885(-12);
            class82 var6 = ~super.field1695 != 0 && ~super.field1686 == -1 ? class83.field1219.method2358((byte) -53, super.field1695) : null;
            class82 var7 = ~super.field1679 == 0 || super.field1598 && var6 != null ? null : class83.field1219.method2358((byte) -101, super.field1679);
            int var8 = var5.field3675;
            int var9 = var5.field3680;
            if (~var8 != -1 || var9 != 0 || ~var5.field3678 != -1 || var5.field3649 != 0) {
                arg2 |= 7;
            }
            boolean var10 = ~super.field1688 != -1 && ~super.field1644 >= ~class199.field3403 && super.field1642 > class199.field3403;
            if (var10) {
                arg2 |= 524288;
            }
            int var11 = super.field1636.method3102(-8255);
            class282 var12 = super.field1699[0] = this.field6688.method3048(class422.field6216, 0, class581.field8222, super.field1663, var11, arg2, super.field1600, super.field1626, var6, class83.field1219, var7, super.field1690, super.field1611, super.field1640, super.field1607, arg0, super.field1629);
            if (var12 == null) {
                return false;
            } else {
                super.field1605 = var12.method1033();
                super.field1671 = var12.method1013();
                this.method888((byte) -125, var12);
                if (var8 == 0 && var9 == 0) {
                    this.method889(0, 110, this.method878(-5740) << 9, this.method878(-5740) << 9, var11, 0);
                } else {
                    this.method889(var5.field3693, 100, var9, var8, var11, var5.field3698);
                    if (super.field1593 != 0) {
                        super.field1699[0].method1042(super.field1593);
                    }
                    if (~super.field1661 != -1) {
                        super.field1699[0].method1049(super.field1661);
                    }
                    if (super.field1647 != 0) {
                        super.field1699[0].method1047(0, super.field1647, 0);
                    }
                }
                if (var10) {
                    var12.method997(super.field1620, super.field1651, super.field1652, 255 & super.field1688);
                }
                if (~super.field1595 != 0 && super.field1662 != -1) {
                    class417 var13 = class41.field718.method1529((byte) 52, super.field1595);
                    boolean var14 = ~var13.field6127 == -4 && (~var8 != -1 || var9 != 0);
                    int var15 = var4;
                    if (!var14) {
                        if (~super.field1639 != -1) {
                            var15 = var4 | 5;
                        }
                        if (super.field1682 != 0) {
                            var15 |= 2;
                        }
                        if (~super.field1599 <= -1) {
                            var15 |= 7;
                        }
                    } else {
                        var15 = var4 | 7;
                    }
                    class282 var16 = super.field1699[1] = var13.method2560(var15, arg0, 0, super.field1601, super.field1662, class83.field1219, super.field1684);
                    if (var16 != null) {
                        if (super.field1599 < 0) {
                            if (super.field1639 != 0) {
                                var16.method1019(super.field1639 * 2048);
                            }
                        } else {
                            int var17 = 0;
                            int var18 = 0;
                            int var19 = 0;
                            if (var5.field3646 != null && var5.field3646[super.field1599] != null) {
                                var17 += var5.field3646[super.field1599][0];
                                var18 += var5.field3646[super.field1599][1];
                                var19 += var5.field3646[super.field1599][2];
                            }
                            if (var5.field3684 != null && var5.field3684[super.field1599] != null) {
                                var19 += var5.field3684[super.field1599][2];
                                var18 += var5.field3684[super.field1599][1];
                                var17 += var5.field3684[super.field1599][0];
                            }
                            if (var19 != 0 || ~var17 != -1) {
                                int var20 = var11;
                                if (super.field1663 != null && super.field1663[super.field1599] != -1) {
                                    var20 = super.field1663[super.field1599];
                                }
                                int var21 = super.field1639 * 2048 + -var11 + var20 & 16383;
                                if (~var21 != -1) {
                                    var16.method1019(var21);
                                }
                                int var22 = class582.field8226[var21];
                                int var23 = class582.field8230[var21];
                                int var24 = var17 * var23 + var19 * var22 >> 14;
                                var19 = var19 * var23 + -(var17 * var22) >> 14;
                                var17 = var24;
                            }
                            var16.method1047(var17, var18, var19);
                        }
                        if (~super.field1682 != -1) {
                            var16.method1047(0, -super.field1682 << 2, 0);
                        }
                        if (var14) {
                            if (~super.field1593 != -1) {
                                var16.method1042(super.field1593);
                            }
                            if (super.field1661 != 0) {
                                var16.method1049(super.field1661);
                            }
                            if (super.field1647 != 0) {
                                var16.method1047(0, super.field1647, 0);
                            }
                        }
                    }
                } else {
                    super.field1699[1] = null;
                }
                if (super.field1693 != -1 && super.field1632 != -1) {
                    class417 var25 = class41.field718.method1529((byte) 29, super.field1693);
                    boolean var26 = ~var25.field6127 == -4 && (var8 != 0 || ~var9 != -1);
                    int var27 = var4;
                    if (!var26) {
                        if (super.field1677 != 0) {
                            var27 = var4 | 5;
                        }
                        if (~super.field1627 != -1) {
                            var27 |= 2;
                        }
                        if (super.field1658 >= 0) {
                            var27 |= 7;
                        }
                    } else {
                        var27 = var4 | 7;
                    }
                    class282 var28 = super.field1699[2] = var25.method2563(class83.field1219, super.field1625, super.field1673, arg0, 0, super.field1632, var27);
                    if (var28 != null) {
                        if (~super.field1658 <= -1 && var5.field3646 != null && var5.field3646[super.field1658] != null) {
                            int var29 = 0;
                            int var30 = 0;
                            int var31 = 0;
                            if (var5.field3646 != null && var5.field3646[super.field1658] != null) {
                                var29 += var5.field3646[super.field1658][0];
                                var31 += var5.field3646[super.field1658][2];
                                var30 += var5.field3646[super.field1658][1];
                            }
                            if (var5.field3684 != null && var5.field3684[super.field1658] != null) {
                                var30 += var5.field3684[super.field1658][1];
                                var31 += var5.field3684[super.field1658][2];
                                var29 += var5.field3684[super.field1658][0];
                            }
                            if (var31 != 0 || var29 != 0) {
                                int var32 = var11;
                                if (super.field1663 != null && super.field1663[super.field1658] != -1) {
                                    var32 = super.field1663[super.field1658];
                                }
                                int var33 = super.field1677 * 2048 + var32 + -var11 & 16383;
                                if (var33 != 0) {
                                    var28.method1019(var33);
                                }
                                int var34 = class582.field8226[var33];
                                int var35 = class582.field8230[var33];
                                int var36 = var29 * var35 + var31 * var34 >> 14;
                                var31 = var31 * var35 + -(var29 * var34) >> 14;
                                var29 = var36;
                            }
                            var28.method1047(var29, var30, var31);
                        } else if (super.field1677 != 0) {
                            var28.method1019(super.field1677 * 2048);
                        }
                        if (~super.field1627 != -1) {
                            var28.method1047(0, -super.field1627 << 2, 0);
                        }
                        if (var26) {
                            if (~super.field1593 != -1) {
                                var28.method1042(super.field1593);
                            }
                            if (super.field1661 != 0) {
                                var28.method1049(super.field1661);
                            }
                            if (super.field1647 != 0) {
                                var28.method1047(0, super.field1647, 0);
                            }
                        }
                    }
                } else {
                    super.field1699[2] = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILmaa;)V", line = 834)
    public final void method2829(int arg0, class504 arg1) {
        this.field6688 = arg1;
        ++field6693;
        if (arg0 != -11847) {
            this.method2826(-101);
        }
        if (super.field1709 != null) {
            super.field1709.method3548();
        }
    }

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)I", line = 850)
    public final int method2830(int arg0) {
        ++field6683;
        if (this.field6688 == null) {
            return 0;
        } else {
            int var2 = 87 / ((arg0 - -25) / 41);
            return this.field6688.field7317;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(Lha;I)V", line = 866)
    public final void method97(class544 arg0, int arg1) {
        ++field6680;
        if (this.field6688 != null) {
            if (super.field1705 || this.method2828(arg0, 71, 0)) {
                if (arg1 == -1) {
                    class73 var3 = arg0.method343();
                    var3.method676(super.field1636.method3102(arg1 ^ 8254));
                    var3.method671(super.field9477, super.field9474 + -20, super.field9475);
                    this.method886(super.field1699, arg0, 123, super.field1705, var3);
                    super.field1699[0] = super.field1699[1] = super.field1699[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "(I)V", line = 893)
    public static void method2831(int arg0) {
        if (arg0 != -27992) {
            method2831(-70);
        }
        field6685 = null;
    }
}
