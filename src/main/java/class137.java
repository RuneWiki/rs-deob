import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class137 extends class187 {

    @OriginalMember(owner = "client!qo", name = "Ec", descriptor = "I")
    public int field1651 = -1;

    @OriginalMember(owner = "client!qo", name = "Dc", descriptor = "I")
    public int field1650 = -1;

    @OriginalMember(owner = "client!qo", name = "Ic", descriptor = "Lpn;")
    public static class72 field1655 = new class72(56, 3);

    @OriginalMember(owner = "client!qo", name = "Pc", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!qo", name = "tc", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!qo", name = "uc", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!qo", name = "vc", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!qo", name = "xc", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!qo", name = "yc", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!qo", name = "zc", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!qo", name = "Ac", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!qo", name = "Bc", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!qo", name = "Fc", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!qo", name = "Gc", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qo", name = "Hc", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!qo", name = "Jc", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!qo", name = "Kc", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!qo", name = "Lc", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!qo", name = "Mc", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!qo", name = "Nc", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!qo", name = "Oc", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!qo", name = "Qc", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qo", name = "wc", descriptor = "Lqs;")
    public class476 field1643;

    @OriginalMember(owner = "client!qo", name = "Rc", descriptor = "Z")
    public static boolean field1664;

    @OriginalMember(owner = "client!qo", name = "Cc", descriptor = "[Lrg;")
    public static class395[] field1649;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I", line = 5)
    public final int method645(byte arg0) {
        ++field1657;
        if (this.field1643.field6694 != null) {
            class476 var2 = this.field1643.method2812(class75.field909, true);
            if (var2 != null && var2.field6719 != -1) {
                return var2.field6719;
            }
        }
        if (arg0 != -111) {
            field1664 = true;
        }
        return this.field1643.field6719;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)Z", line = 25)
    private final boolean method646(byte arg0) {
        ++field1642;
        return arg0 != 121 ? false : this.field1643.field6740;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V", line = 39)
    public final void method647(int arg0, int arg1, int arg2) {
        ++field1640;
        int var4 = super.field2539[0];
        int var5 = super.field2536[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var5;
            ++var4;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (~super.field2449 != 0 && class175.field2103.method1267(arg2 + -24, super.field2449).field2854 == 1) {
            super.field2449 = -1;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field2485 != 0) {
            class12 var6 = class234.field3258.method2456(super.field2485, 600);
            if (var6.field164 && ~var6.field178 != 0 && ~class175.field2103.method1267(-36, var6.field178).field2854 == -2) {
                super.field2485 = -1;
            }
        }
        if (super.field2538 < 9) {
            ++super.field2538;
        }
        int var7 = super.field2538;
        if (arg2 == 1) {
            while (var7 > 0) {
                super.field2539[var7] = super.field2539[var7 + -1];
                super.field2536[var7] = super.field2536[var7 + -1];
                super.field2531[var7] = super.field2531[var7 + -1];
                --var7;
            }
            super.field2539[0] = var4;
            super.field2536[0] = var5;
            super.field2531[0] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILoj;II)Z", line = 124)
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field1647;
        if (this.field1643 != null && this.method653(65536, -87, arg1)) {
            class327 var5 = arg1.method1456();
            int var6 = super.field2470.method1116((byte) 116);
            var5.method558(var6);
            var5.method550(super.field1008, super.field1001, super.field1005);
            if (arg3 != -6085) {
                this.method647(-107, -121, -93);
            }
            for (int var7 = 0; super.field2529.length > var7; ++var7) {
                if (super.field2529[var7] != null && super.field2529[var7].method1695(arg0, arg2, var5, this.field1643.field6695 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "(I)V", line = 157)
    public static void method648(int arg0) {
        if (arg0 <= 93) {
            method648(33);
        }
        field1649 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V", line = 171)
    public static final void method649(int arg0, boolean arg1) {
        ++field1658;
        if (arg1 && class429.field6185 != null) {
            class50.field653 = class429.field6185.field3155;
        } else {
            class50.field653 = -1;
        }
        class289.field4318 = null;
        class403.field5733 = 0;
        class429.field6185 = null;
        class118.field1467 = null;
        class429.method2555();
        class429.field6197.method813(0);
        class325.field4690 = -1;
        class429.field6193 = null;
        class364.field5224 = null;
        class385.field5496 = null;
        class77.field927 = null;
        class476.field6704 = null;
        class458.field6455 = null;
        class104.field1260 = -1;
        class354.field5088 = null;
        class356.field5114 = null;
        class52.field686 = null;
        class128.field1587 = null;
        class429.field6187.method1892((byte) -19);
        class429.field6186.method1303(64, 64, 64);
        if (arg0 >= 70) {
            class429.field6187.method1893(64, false, 128);
            class429.field6180.method2292(false, 64);
            class269.field3860.method993(0, 64);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIBIII)V", line = 211)
    public final void method650(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        super.field994 = (byte) arg3;
        ++field1648;
        if (~super.field2449 != 0 && ~class175.field2103.method1267(-73, super.field2449).field2854 == -2) {
            super.field2449 = -1;
        }
        if (super.field2485 != -1) {
            class12 var7 = class234.field3258.method2456(super.field2485, 600);
            if (var7.field164 && var7.field178 != -1 && ~class175.field2103.method1267(-122, var7.field178).field2854 == -2) {
                super.field2485 = -1;
            }
        }
        if (!arg0) {
            int var8 = -super.field2539[0] + arg1;
            int var9 = -super.field2536[0] + arg5;
            if (var8 >= -8 && var8 <= 8 && ~var9 <= 7 && var9 <= 8) {
                if (~super.field2538 > -10) {
                    ++super.field2538;
                }
                for (int var10 = super.field2538; ~var10 < -1; --var10) {
                    super.field2539[var10] = super.field2539[var10 + -1];
                    super.field2536[var10] = super.field2536[var10 + -1];
                    super.field2531[var10] = super.field2531[var10 - 1];
                }
                super.field2539[0] = arg1;
                super.field2531[0] = 1;
                super.field2536[0] = arg5;
                return;
            }
        }
        super.field2539[0] = arg1;
        super.field2530 = 0;
        super.field2538 = 0;
        if (arg2 == -89) {
            super.field2537 = 0;
            super.field2536[0] = arg5;
            super.field1005 = super.field2536[0] * 128 + arg4 * 64;
            super.field1008 = super.field2539[0] * 128 + arg4 * 64;
            if (super.field2534 != null) {
                super.field2534.method2276();
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(ILoj;)V", line = 278)
    public final void method27(int arg0, class280 arg1) {
        ++field1659;
        if (this.field1643 != null) {
            if (arg0 != 0) {
                this.field1643 = null;
            }
            if (super.field2535 || this.method653(0, 98, arg1)) {
                this.method1008(super.field2535, arg1, super.field2529, -126);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZLa;IBLoj;)V", line = 301)
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 == -65) {
            ++field1656;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(ILoj;)Lmg;", line = 314)
    public final class451 method19(int arg0, class280 arg1) {
        ++field1645;
        if (this.field1643 != null && this.method653(1024, 109, arg1)) {
            class327 var3 = arg1.method1456();
            int var4 = super.field2470.method1116((byte) 117);
            var3.method558(var4);
            var3.method550(super.field1008, super.field1001, super.field1005);
            class349 var5 = this.method1018(-107);
            class476 var6 = this.field1643.field6694 == null ? this.field1643 : this.field1643.method2812(class75.field909, true);
            if (class22.field305 && var6.field6749 && var5.field4979) {
                class207 var7 = ~super.field2449 != 0 && super.field2495 == 0 ? class175.field2103.method1267(-55, super.field2449) : null;
                class207 var8 = ~super.field2514 == 0 || super.field2497 && var7 != null ? null : class175.field2103.method1267(-30, super.field2514);
                class352 var9 = class369.method2236(super.field2529[0], super.field2448, super.field2513, arg1, 255 & this.field1643.field6742, var8 == null ? var7 : var8, 255 & this.field1643.field6679, 65535 & this.field1643.field6747, super.field2456, this.field1643.field6695, var4, super.field2474, 88, this.field1643.field6692 & 65535, var8 == null ? super.field2498 : super.field2458);
                if (var9 != null) {
                    float var10 = arg1.method1383();
                    float var11 = arg1.method1387();
                    arg1.method1376(false);
                    arg1.method1498(var10, var11 + -150.0F);
                    var9.method1716(var3, (class465) null, 0);
                    arg1.method1498(var10, var11);
                    arg1.method1376(true);
                }
            }
            class451 var12 = null;
            if (this.method646((byte) 121)) {
                var12 = class134.method638(762096108, super.field2529.length);
            }
            if (super.field2534 == null) {
                arg1.method1451(super.field2529, var3, var12 != null ? var12.field6379 : null, 0);
            } else {
                class46 var13 = super.field2534.method2272();
                arg1.method1363(super.field2529, var13, var3, var12 != null ? var12.field6379 : null, 0);
            }
            this.method1008(false, arg1, super.field2529, -117);
            if (super.field2529[2] != null) {
                if (var4 != 0) {
                    super.field2529[2].method1743(var4);
                }
                super.field2529[2].method1700(super.field1008 - super.field2533.field2128, super.field1001 - super.field2533.field2108, -super.field2533.field2120 + super.field1005);
            }
            if (arg0 < 95) {
                this.field1650 = -96;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLqs;)V", line = 390)
    public final void method651(byte arg0, class476 arg1) {
        ++field1665;
        this.field1643 = arg1;
        if (arg0 < 91) {
            field1655 = null;
        }
        if (super.field2534 != null) {
            super.field2534.method2276();
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)I", line = 405)
    public final int method652(byte arg0) {
        ++field1653;
        int var2 = 66 % ((arg0 - 2) / 45);
        if (this.field1643.field6694 != null) {
            class476 var3 = this.field1643.method2812(class75.field909, true);
            if (var3 != null && ~var3.field6706 != 0) {
                return var3.field6706;
            }
        }
        return this.field1643.field6706;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V", line = 424)
    public final void method32(int arg0) {
        if (arg0 != -2) {
            field1655 = null;
        }
        ++field1652;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILoj;)Z", line = 435)
    private final boolean method653(int arg0, int arg1, class280 arg2) {
        ++field1654;
        int var4 = arg0;
        int var5 = -113 % ((arg1 - 42) / 52);
        class349 var6 = this.method1018(-101);
        class207 var7 = ~super.field2449 != 0 && super.field2495 == 0 ? class175.field2103.method1267(-119, super.field2449) : null;
        class207 var8 = ~super.field2514 == 0 || super.field2497 && var7 != null ? null : class175.field2103.method1267(-109, super.field2514);
        int var9 = var6.field4970;
        int var10 = var6.field5002;
        if (~var9 != -1 || var10 != 0 || ~var6.field4994 != -1 || ~var6.field5006 != -1) {
            arg0 |= 7;
        }
        class352 var11 = super.field2529[0] = this.field1643.method2816(class175.field2103, super.field2498, class75.field909, super.field2506, super.field2461, arg2, arg0, super.field2487, var7, super.field2518, var8, super.field2450, super.field2458, class415.field6001, (byte) -114);
        if (var11 == null) {
            return false;
        } else {
            super.field2476 = var11.method1733();
            this.method1017(var11, -22722);
            int var12 = super.field2470.method1116((byte) 119);
            super.field2456 = 0;
            super.field2448 = 0;
            super.field2513 = 0;
            if (var9 == 0 && ~var10 == -1) {
                this.method1011(this.method1012(false) << 7, this.method1012(false) << 7, var12, true);
            } else {
                this.method1011(var9, var10, var12, true);
                if (~super.field2513 != -1) {
                    super.field2529[0].method1750(super.field2513);
                }
                if (~super.field2448 != -1) {
                    super.field2529[0].method1740(super.field2448);
                }
                if (super.field2456 != 0) {
                    super.field2529[0].method1700(0, super.field2456, 0);
                }
            }
            super.field2529[1] = null;
            if (super.field2485 != -1 && super.field2494 != -1) {
                class12 var13 = class234.field3258.method2456(super.field2485, 600);
                class352 var14 = var13.method92(4370, super.field2478, super.field2494, class175.field2103, super.field2447, (var13.field161 ? 7 : 2) | var4, arg2);
                if (var14 != null) {
                    var14.method1700(0, -super.field2516, 0);
                    if (var13.field161 && (~var9 != -1 || var10 != 0)) {
                        if (~super.field2513 != -1) {
                            var14.method1750(super.field2513);
                        }
                        if (super.field2448 != 0) {
                            var14.method1740(super.field2448);
                        }
                        if (super.field2456 != 0) {
                            var14.method1700(0, super.field2456, 0);
                        }
                    }
                    super.field2529[1] = var14;
                }
            }
            super.field2529[2] = null;
            if (super.field2533 != null) {
                if (super.field2533.field2126 <= class204.field2796) {
                    super.field2533 = null;
                } else if (super.field2533.field2114 <= class204.field2796) {
                    class352 var15 = super.field2533.method863(arg2, 101, 7 | var4);
                    if (var15 != null) {
                        var15.method1700(-super.field1008 + super.field2533.field2128, super.field2533.field2108 - super.field1001, -super.field1005 + super.field2533.field2120);
                        if (var12 != 0) {
                            var15.method1743(var12);
                        }
                        super.field2529[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z", line = 555)
    public final boolean method33(int arg0) {
        ++field1644;
        return arg0 != 1957;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I", line = 566)
    public final int method17(int arg0) {
        if (arg0 != -8960) {
            this.method653(-108, 24, (class280) null);
        }
        ++field1660;
        return super.field2476;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(Z)I", line = 580)
    public final int method654(boolean arg0) {
        ++field1646;
        if (arg0) {
            this.method652((byte) -42);
        }
        if (this.field1643.field6694 != null) {
            class476 var2 = this.field1643.method2812(class75.field909, true);
            if (var2 != null && ~var2.field6677 != 0) {
                return var2.field6677;
            }
        }
        return this.field1643.field6677 == -1 ? super.method654(arg0) : this.field1643.field6677;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)Z", line = 606)
    public final boolean method655(byte arg0) {
        ++field1641;
        if (this.field1643 == null) {
            return false;
        } else {
            int var2 = -32 % ((arg0 - 39) / 60);
            return true;
        }
    }
}
