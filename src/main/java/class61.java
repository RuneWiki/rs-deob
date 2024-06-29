import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class61 extends class124 {

    @OriginalMember(owner = "client!qh", name = "pd", descriptor = "I")
    public int field686 = -1;

    @OriginalMember(owner = "client!qh", name = "gd", descriptor = "I")
    public int field677 = -1;

    @OriginalMember(owner = "client!qh", name = "xd", descriptor = "Llh;")
    public static class487 field694 = new class487(18, 8);

    @OriginalMember(owner = "client!qh", name = "cd", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!qh", name = "ed", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!qh", name = "fd", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!qh", name = "hd", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!qh", name = "id", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!qh", name = "kd", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!qh", name = "ld", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!qh", name = "md", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!qh", name = "nd", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!qh", name = "od", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!qh", name = "rd", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qh", name = "sd", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!qh", name = "td", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!qh", name = "vd", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!qh", name = "wd", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!qh", name = "yd", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!qh", name = "zd", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!qh", name = "Ad", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!qh", name = "Bd", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qh", name = "Cd", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!qh", name = "Dd", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!qh", name = "Ed", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!qh", name = "jd", descriptor = "Lse;")
    public static class232 field680;

    @OriginalMember(owner = "client!qh", name = "dd", descriptor = "Lwa;")
    public class568 field674;

    @OriginalMember(owner = "client!qh", name = "qd", descriptor = "[Ljava/lang/String;")
    public static String[] field687;

    @OriginalMember(owner = "client!qh", name = "ud", descriptor = "[Ljava/lang/String;")
    public static String[] field691;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        if (arg0 <= -115) {
            ++field700;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)I")
    public static final int method498(int arg0, int arg1) {
        if (arg0 != 0) {
            field687 = null;
        }
        ++field697;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)V")
    public static void method499(int arg0) {
        if (arg0 == 0) {
            field680 = null;
            field687 = null;
            field691 = null;
            field694 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lwa;I)V")
    public final void method500(class568 arg0, int arg1) {
        this.field674 = arg0;
        ++field693;
        if (super.field1805 != null) {
            super.field1805.method3600();
        }
        if (arg1 != -14527) {
            field687 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        ++field689;
        int var3 = 54 % ((81 - arg0) / 43);
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
    public final void method501(int arg0, int arg1, boolean arg2) {
        ++field699;
        int var4 = super.field1807[0];
        int var5 = super.field1801[0];
        if (arg1 == 0) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field1779 != -1 && ~class192.field2727.method3090(30, super.field1779).field5647 == -2) {
            super.field1735 = null;
            super.field1779 = -1;
        }
        if (~super.field1724 != 0) {
            class157 var6 = class430.field5994.method1993(super.field1724, 64);
            if (var6.field2280 && var6.field2290 != -1 && ~class192.field2727.method3090(81, var6.field2290).field5647 == -2) {
                super.field1724 = -1;
            }
        }
        if (super.field1753 != -1) {
            class157 var7 = class430.field5994.method1993(super.field1753, 64);
            if (var7.field2280 && ~var7.field2290 != 0 && ~class192.field2727.method3090(-90, var7.field2290).field5647 == -2) {
                super.field1753 = -1;
            }
        }
        if (super.field1797 < 9) {
            ++super.field1797;
        }
        for (int var8 = super.field1797; ~var8 < -1; --var8) {
            super.field1807[var8] = super.field1807[var8 + -1];
            super.field1801[var8] = super.field1801[var8 + -1];
            super.field1803[var8] = super.field1803[var8 + -1];
        }
        if (arg2) {
            method504((class166) null, (class212) null, 103, -54, 0, -44, -121);
        }
        super.field1807[0] = var4;
        super.field1803[0] = (byte) arg0;
        super.field1801[0] = var5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBIZI)V")
    public final void method502(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        ++field685;
        super.field4053 = super.field4050 = (byte) arg0;
        if (class467.method2640(arg3, arg1, (byte) -67)) {
            ++super.field4050;
        }
        if (~super.field1779 != 0 && ~class192.field2727.method3090(44, super.field1779).field5647 == -2) {
            super.field1735 = null;
            super.field1779 = -1;
        }
        if (super.field1724 != -1) {
            class157 var7 = class430.field5994.method1993(super.field1724, 64);
            if (var7.field2280 && var7.field2290 != -1 && ~class192.field2727.method3090(108, var7.field2290).field5647 == -2) {
                super.field1724 = -1;
            }
        }
        if (super.field1753 != -1) {
            class157 var8 = class430.field5994.method1993(super.field1753, 64);
            if (var8.field2280 && var8.field2290 != -1 && ~class192.field2727.method3090(-75, var8.field2290).field5647 == -2) {
                super.field1753 = -1;
            }
        }
        if (arg2 > 124) {
            if (!arg4) {
                int var9 = -super.field1807[0] + arg3;
                int var10 = arg1 - super.field1801[0];
                if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                    if (~super.field1797 > -10) {
                        ++super.field1797;
                    }
                    for (int var11 = super.field1797; ~var11 < -1; --var11) {
                        super.field1807[var11] = super.field1807[var11 + -1];
                        super.field1801[var11] = super.field1801[var11 + -1];
                        super.field1803[var11] = super.field1803[var11 - 1];
                    }
                    super.field1807[0] = arg3;
                    super.field1803[0] = 1;
                    super.field1801[0] = arg1;
                    return;
                }
            }
            super.field1807[0] = arg3;
            super.field1802 = 0;
            super.field1797 = 0;
            super.field1799 = 0;
            super.field1801[0] = arg1;
            super.field4047 = (super.field1801[0] << 9) + (arg5 << 8);
            super.field4042 = (super.field1807[0] << 9) - -(arg5 << 8);
            if (super.field1805 != null) {
                super.field1805.method3600();
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "(I)V")
    public static final void method503(int arg0) {
        class663 var1 = class457.field6346;
        synchronized (class457.field6346) {
            class457.field6346.method3749(arg0 + 7649);
        }
        if (arg0 != -1) {
            field698 = 20;
        }
        ++field701;
        class663 var2 = class466.field6416;
        synchronized (class466.field6416) {
            class466.field6416.method3749(arg0 ^ -7649);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lr;Lfa;IIIII)V")
    public static final void method504(class166 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class606.field8432 < 100) {
            class224.method1414((byte) -93, arg1, arg0);
        }
        ++field692;
        arg0.method200(arg6, arg5, arg4 + arg6, arg2 + arg5);
        if (~class606.field8432 > -101) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg6;
            arg0.method110(arg6, arg5, arg4, arg2, -16777216, 0);
            int var9 = arg2 / 2 + arg5 - (var7 + 18);
            arg0.method190(var8 + -152, var9, 304, 34, class193.field2742[class52.field607].getRGB(), 0);
            arg0.method110(var8 + -150, var9 - -2, class606.field8432 * 3, 30, class205.field2869[class52.field607].getRGB(), 0);
            class428.field5986.method2418(false, -1, class65.field806.method555(class697.field9900, true), var9 - -var7, class283.field3878[class52.field607].getRGB(), var8);
        } else {
            int var10 = -((int) ((float) arg4 / class510.field6990)) + class266.field3598;
            int var11 = (int) ((float) arg2 / class510.field6990) + class670.field9403;
            int var12 = class266.field3598 - -((int) ((float) arg4 / class510.field6990));
            class495.field6743 = (int) ((float) (arg2 * 2) / class510.field6990);
            int var13 = -((int) ((float) arg2 / class510.field6990)) + class670.field9403;
            class627.field8688 = -((int) ((float) arg2 / class510.field6990)) + class670.field9403;
            if (arg3 != 15053) {
                method498(-66, 96);
            }
            class609.field8460 = (int) ((float) (arg4 * 2) / class510.field6990);
            class250.field3417 = -((int) ((float) arg4 / class510.field6990)) + class266.field3598;
            class510.method2911(var10 - -class510.field7003, class510.field7012 + var11, class510.field7003 + var12, var13 - -class510.field7012, arg6, arg5, arg6 - -arg4, arg2 + arg5 + 1);
            class510.method2918(arg0);
            class227 var14 = class510.method2924(arg0);
            class468.method2644(0, -1532, arg0, 0, var14);
            if (class657.field9137 > 0) {
                --class593.field8304;
                if (class593.field8304 == 0) {
                    --class657.field9137;
                    class593.field8304 = 20;
                }
            }
            if (class109.field1514) {
                int var15 = arg4 + arg6 + -5;
                int var16 = arg2 + arg5 + -8;
                class273.field3741.method2411("Fps:" + class131.field1883, (byte) 59, var15, 16776960, var16, -1);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class273.field3741.method2411("Mem:" + var18 + "k", (byte) 72, var15, var19, var20, -1);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILr;I)Z")
    private final boolean method505(int arg0, class166 arg1, int arg2) {
        ++field681;
        int var4 = arg0;
        if (arg2 != -5) {
            this.method221((class166) null, 94);
        }
        class67 var5 = this.method895(-25227);
        class403 var6 = ~super.field1779 != 0 && super.field1706 == 0 ? class192.field2727.method3090(arg2 ^ -55, super.field1779) : null;
        class403 var7 = ~super.field1761 == 0 || super.field1703 && var6 != null ? null : class192.field2727.method3090(75, super.field1761);
        int var8 = var5.field871;
        int var9 = var5.field905;
        if (var8 != 0 || ~var9 != -1 || var5.field884 != 0 || ~var5.field878 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field1720 != 0 && ~super.field1777 >= ~class186.field2697 && class186.field2697 < super.field1789;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field1738.method2947(arg2 ^ -8725);
        class55 var12 = super.field1806[0] = this.field674.method3246(class578.field8156, super.field1784, var7, super.field1766, var6, super.field1739, super.field1782, arg0, var11, super.field1781, super.field1794, arg1, class198.field2828, super.field1704, super.field1698, class192.field2727, 127);
        if (var12 == null) {
            return false;
        } else {
            super.field1728 = var12.method463();
            super.field1731 = var12.method426();
            this.method884(var12, -87);
            if (var8 == 0 && var9 == 0) {
                this.method887(var11, 0, this.method881(-128) << 9, this.method881(-113) << 9, -123, 0);
            } else {
                this.method887(var11, var5.field901, var9, var8, -87, var5.field904);
                if (super.field1725 != 0) {
                    super.field1806[0].method416(super.field1725);
                }
                if (super.field1693 != 0) {
                    super.field1806[0].method445(super.field1693);
                }
                if (super.field1750 != 0) {
                    super.field1806[0].method446(0, super.field1750, 0);
                }
            }
            if (var10) {
                var12.method458(super.field1775, super.field1743, super.field1736, 255 & super.field1720);
            }
            if (~super.field1724 != 0 && ~super.field1759 != 0) {
                class157 var13 = class430.field5994.method1993(super.field1724, 64);
                boolean var14 = ~var13.field2295 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field1776 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field1742 != 0) {
                        var15 |= 2;
                    }
                }
                class55 var16 = super.field1806[1] = var13.method1110(super.field1758, class192.field2727, super.field1759, arg1, super.field1721, false, var15);
                if (var16 != null) {
                    if (super.field1742 != 0) {
                        var16.method446(0, -super.field1742 << 2, 0);
                    }
                    if (super.field1776 != 0) {
                        var16.method444(super.field1776 * 2048);
                    }
                    if (var14) {
                        if (super.field1725 != 0) {
                            var16.method416(super.field1725);
                        }
                        if (super.field1693 != 0) {
                            var16.method445(super.field1693);
                        }
                        if (~super.field1750 != -1) {
                            var16.method446(0, super.field1750, 0);
                        }
                    }
                }
            } else {
                super.field1806[1] = null;
            }
            if (super.field1753 != -1 && super.field1790 != -1) {
                class157 var17 = class430.field5994.method1993(super.field1753, 64);
                boolean var18 = ~var17.field2295 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (~super.field1710 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field1730 != 0) {
                        var19 |= 2;
                    }
                }
                class55 var20 = super.field1806[2] = var17.method1113(class192.field2727, super.field1790, arg1, super.field1780, super.field1707, var19, 126);
                if (var20 != null) {
                    if (~super.field1730 != -1) {
                        var20.method446(0, -super.field1730 << 2, 0);
                    }
                    if (~super.field1710 != -1) {
                        var20.method444(super.field1710 * 2048);
                    }
                    if (var18) {
                        if (super.field1725 != 0) {
                            var20.method416(super.field1725);
                        }
                        if (~super.field1693 != -1) {
                            var20.method445(super.field1693);
                        }
                        if (~super.field1750 != -1) {
                            var20.method446(0, super.field1750, 0);
                        }
                    }
                }
            } else {
                super.field1806[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field676;
        if (this.field674 != null && this.method505(131072, arg3, -5)) {
            class392 var5 = arg3.method166();
            int var6 = super.field1738.method2947(arg1 ^ 8720);
            var5.method685(var6);
            var5.method687(super.field4042, super.field4052, super.field4047);
            boolean var7 = false;
            for (int var8 = 0; super.field1806.length > var8; ++var8) {
                if (super.field1806[var8] != null) {
                    boolean var9 = ~this.field674.field8072 == 0 ? this.field674.field8041 == 1 : ~this.field674.field8072 == -2;
                    boolean var10;
                    if (class340.field4563) {
                        var10 = super.field1806[var8].method419(arg2, arg0, var5, var9, class22.field250);
                    } else {
                        var10 = super.field1806[var8].method448(arg2, arg0, var5, var9);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field1806[arg1] = super.field1806[1] = super.field1806[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field679;
        if (this.field674 != null && this.method505(2048, arg0, -5)) {
            class392 var3 = arg0.method166();
            int var4 = super.field1738.method2947(arg1 + 8725);
            var3.method685(var4);
            class390 var5 = class295.field4051[super.field4053][super.field4042 >> class588.field8259][super.field4047 >> class588.field8259];
            if (var5 != null && var5.field5524 != null) {
                int var6 = -var5.field5524.field6341 + super.field1699;
                super.field1699 = (int) ((float) super.field1699 - (float) var6 / 10.0F);
            } else {
                super.field1699 = (int) ((float) super.field1699 - (float) super.field1699 / 10.0F);
            }
            var3.method687(super.field4042, super.field4052 + -20 - super.field1699, super.field4047);
            class67 var7 = this.method895(-25227);
            class568 var8 = this.field674.field8079 == null ? this.field674 : this.field674.method3259((byte) 115, class578.field8156);
            super.field1798 = false;
            if (class366.field4875.field9351 && var8.field8055 && var7.field868) {
                class403 var9 = super.field1779 != -1 && ~super.field1706 == -1 ? class192.field2727.method3090(-121, super.field1779) : null;
                class403 var10 = ~super.field1761 == 0 || super.field1703 && var9 != null ? null : class192.field2727.method3090(-112, super.field1761);
                class55 var11 = class474.method2674(super.field1725, super.field1750, this.field674.field8041, var10 != null ? var10 : var9, 12875, 65535 & this.field674.field8005, 255 & this.field674.field8006, this.field674.field8084 & 65535, var10 != null ? super.field1781 : super.field1739, super.field1806[0], arg0, this.field674.field8018 & 255, var4, super.field1693);
                if (var11 != null) {
                    super.field1798 = true;
                    arg0.method202(false);
                    if (!class340.field4563) {
                        var11.method465(var3, (class551) null, 0);
                    } else {
                        var11.method453(var3, (class551) null, class22.field250, 0);
                    }
                    arg0.method202(true);
                }
            }
            var3.method685(var4);
            var3.method687(super.field4042, super.field4052 + arg1 + -super.field1699, super.field4047);
            class614 var12 = null;
            if (this.method509(arg1 + 5)) {
                var12 = class524.method2987(6257, super.field1806.length);
            }
            this.method897(super.field1806, var3, (byte) 120, false, arg0);
            if (!class340.field4563) {
                for (int var13 = 0; super.field1806.length > var13; ++var13) {
                    if (super.field1806[var13] != null) {
                        super.field1806[var13].method465(var3, var12 != null ? var12.field8572[var13] : null, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field1806.length < ~var14; ++var14) {
                    if (super.field1806[var14] != null) {
                        super.field1806[var14].method453(var3, var12 != null ? var12.field8572[var14] : null, class22.field250, 0);
                    }
                }
            }
            if (super.field1805 != null) {
                class472 var15 = super.field1805.method3598();
                if (class340.field4563) {
                    arg0.method167(var15, class22.field250);
                } else {
                    arg0.method163(var15);
                }
            }
            for (int var16 = 0; super.field1806.length > var16; ++var16) {
                if (super.field1806[var16] != null) {
                    super.field1798 |= super.field1806[var16].method430();
                }
            }
            super.field1747 = class241.field3299;
            super.field1806[0] = super.field1806[1] = super.field1806[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(Z)I")
    public final int method506(boolean arg0) {
        ++field675;
        if (this.field674.field8079 != null) {
            class568 var2 = this.field674.method3259((byte) 98, class578.field8156);
            if (var2 != null && ~var2.field8022 != 0) {
                return var2.field8022;
            }
        }
        if (!arg0) {
            field694 = null;
        }
        return this.field674.field8022;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field690;
        if (this.field674 != null) {
            if (super.field1804 || this.method505(0, arg0, -5)) {
                if (arg1) {
                    class392 var3 = arg0.method166();
                    var3.method685(super.field1738.method2947(8720));
                    var3.method687(super.field4042, super.field4052 + -20, super.field4047);
                    this.method897(super.field1806, var3, (byte) -103, super.field1804, arg0);
                    super.field1806[0] = super.field1806[1] = super.field1806[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(B)V")
    public static final void method507(byte arg0) {
        ++field688;
        for (class651 var1 = (class651) class12.field123.method3901(0); var1 != null; var1 = (class651) class12.field123.method3901(0)) {
            class503.method2880(14625, var1);
        }
        if (arg0 <= 84) {
            method498(-21, -63);
        }
        int var2;
        int var3;
        if (!class366.field4875.method537(class503.field6917, 0)) {
            var2 = class540.field7305;
            var3 = class540.field7305;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method1676();
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method1674();
            client.method1690(var4);
            client.method1677(var4);
        }
        client.method1689();
        client.method1681();
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(Z)Z")
    public final boolean method508(boolean arg0) {
        ++field682;
        if (arg0) {
            field691 = null;
        }
        return this.field674 != null;
    }

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "(I)Z")
    private final boolean method509(int arg0) {
        ++field673;
        if (arg0 != 0) {
            this.method221((class166) null, 115);
        }
        return this.field674.field8054;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method510(byte arg0) {
        ++field695;
        if (this.field674.field8079 != null) {
            class568 var2 = this.field674.method3259((byte) 126, class578.field8156);
            if (var2 != null && ~var2.field8026 != 0) {
                return var2.field8026;
            }
        }
        if (arg0 != -17) {
            field698 = -1;
        }
        return this.field674.field8026 != -1 ? this.field674.field8026 : super.method510((byte) -17);
    }

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)I")
    public final int method511(int arg0) {
        ++field678;
        if (arg0 != -1) {
            this.method224(-105, 116, 62, (class166) null);
        }
        if (this.field674.field8079 != null) {
            class568 var2 = this.field674.method3259((byte) 87, class578.field8156);
            if (var2 != null && ~var2.field8046 != 0) {
                return var2.field8046;
            }
        }
        return this.field674.field8046;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        if (arg0 < 49) {
            this.field674 = null;
        }
        ++field683;
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            ++field696;
            throw new IllegalStateException();
        }
    }
}
