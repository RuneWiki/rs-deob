import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class212 extends class147 {

    @OriginalMember(owner = "client!ve", name = "vc", descriptor = "Z")
    public boolean field4096 = false;

    @OriginalMember(owner = "client!ve", name = "Bc", descriptor = "I")
    public int field4102 = -1;

    @OriginalMember(owner = "client!ve", name = "yc", descriptor = "I")
    public int field4099 = 0;

    @OriginalMember(owner = "client!ve", name = "Tc", descriptor = "I")
    public int field4120 = -1;

    @OriginalMember(owner = "client!ve", name = "Oc", descriptor = "I")
    public int field4115 = 0;

    @OriginalMember(owner = "client!ve", name = "Jc", descriptor = "I")
    public int field4110 = 0;

    @OriginalMember(owner = "client!ve", name = "Pc", descriptor = "I")
    public int field4116 = 0;

    @OriginalMember(owner = "client!ve", name = "Fc", descriptor = "S")
    private short field4106 = 0;

    @OriginalMember(owner = "client!ve", name = "Ac", descriptor = "I")
    public int field4101 = 0;

    @OriginalMember(owner = "client!ve", name = "Wc", descriptor = "S")
    private short field4123 = 0;

    @OriginalMember(owner = "client!ve", name = "Vc", descriptor = "Lrd;")
    private static class173 field4122 = class133.method843("Drop", -119);

    @OriginalMember(owner = "client!ve", name = "Sc", descriptor = "Lrd;")
    public static class173 field4119 = class133.method843("Bitte entfernen Sie ", 62);

    @OriginalMember(owner = "client!ve", name = "Ec", descriptor = "Lrd;")
    public static class173 field4105 = field4122;

    @OriginalMember(owner = "client!ve", name = "Cc", descriptor = "I")
    public static int field4103 = 0;

    @OriginalMember(owner = "client!ve", name = "Xc", descriptor = "Lrd;")
    public static class173 field4124 = class133.method843("Wordpack geladen)3", 87);

    @OriginalMember(owner = "client!ve", name = "tc", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ve", name = "uc", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!ve", name = "xc", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!ve", name = "zc", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ve", name = "Dc", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ve", name = "Gc", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!ve", name = "Hc", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ve", name = "Kc", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!ve", name = "Lc", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ve", name = "Mc", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ve", name = "Nc", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!ve", name = "Rc", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ve", name = "Uc", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ve", name = "Zc", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!ve", name = "Ic", descriptor = "Lle;")
    public class114 field4109;

    @OriginalMember(owner = "client!ve", name = "wc", descriptor = "Lrd;")
    public class173 field4097;

    @OriginalMember(owner = "client!ve", name = "Yc", descriptor = "Lvf;")
    public class213 field4125;

    @OriginalMember(owner = "client!ve", name = "Qc", descriptor = "[I")
    public static int[] field4117;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)Z")
    public static final boolean method1389(int arg0, int arg1) {
        ++field4094;
        if (class144.field2689[arg1]) {
            return true;
        } else if (!class120.field2210.method140(arg1, (byte) -97)) {
            return false;
        } else {
            int var2 = class120.field2210.method138(arg1, true);
            if (~var2 == -1) {
                class144.field2689[arg1] = true;
                return true;
            } else {
                if (class63.field1232[arg1] == null) {
                    class63.field1232[arg1] = new class165[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class63.field1232[arg1][var3] == null) {
                        byte[] var4 = class120.field2210.method142(arg1, var3, (byte) 2);
                        if (var4 != null) {
                            class63.field1232[arg1][var3] = new class165();
                            class63.field1232[arg1][var3].field3132 = (arg1 << 16) + var3;
                            if (~var4[0] != 0) {
                                class63.field1232[arg1][var3].method1067(new class121(var4), -21);
                            } else {
                                class63.field1232[arg1][var3].method1073(-5, new class121(var4));
                            }
                        }
                    }
                }
                if (arg0 > -98) {
                    return false;
                } else {
                    class144.field2689[arg1] = true;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        if (arg0 > -118) {
            method1394(118, 29, -43);
        }
        field4124 = null;
        field4105 = null;
        field4122 = null;
        field4117 = null;
        field4119 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field4121;
        if (this.field4109 != null) {
            class178 var11 = ~super.field2809 != 0 && ~super.field2763 == -1 ? class167.method1080(11098, super.field2809) : null;
            class178 var12 = super.field2762 == -1 || this.field4096 || super.field2815 == super.field2762 && var11 != null ? null : class167.method1080(11098, super.field2762);
            class213 var13 = this.field4109.method701(5, super.field2752, var12, super.field2789, var11);
            if (var13 != null) {
                var13.method1404();
                super.field758 = var13.field758;
                if (this.field4123 != 0 && ~this.field4106 != -1) {
                    int var14 = class72.field1396[arg0];
                    int var15 = class72.field1404[arg0];
                    short var16 = this.field4123;
                    short var17 = this.field4106;
                    int var18 = -var16 / 2;
                    int var19 = -var17 / 2;
                    int var20 = var15 * var19 + -(var14 * var18) >> 16;
                    int var21 = var14 * var19 + var15 * var18 >> 16;
                    int var22 = class56.method361(class172.field3347, super.field2801 + var20, (byte) -61, super.field2820 - -var21);
                    int var23 = -var17 / 2;
                    int var24 = var16 / 2;
                    int var25 = var15 * var23 - var14 * var24 >> 16;
                    int var26 = var14 * var23 - -(var15 * var24) >> 16;
                    int var27 = class56.method361(class172.field3347, super.field2801 + var25, (byte) -49, super.field2820 - -var26);
                    int var28 = -var16 / 2;
                    int var29 = var17 / 2;
                    int var30 = var15 * var29 + -(var14 * var28) >> 16;
                    int var31 = var14 * var29 + var15 * var28 >> 16;
                    int var32 = class56.method361(class172.field3347, super.field2801 + var30, (byte) 114, super.field2820 + var31);
                    int var33 = var16 / 2;
                    int var34 = var17 / 2;
                    int var35 = var14 * var34 + var15 * var33 >> 16;
                    int var36 = var15 * var34 + -(var14 * var33) >> 16;
                    int var37 = class56.method361(class172.field3347, super.field2801 + var36, (byte) -126, super.field2820 + var35);
                    int var38 = ~var22 > ~var27 ? var22 : var27;
                    int var39 = ~var32 <= ~var37 ? var37 : var32;
                    int var40 = var27 < var37 ? var27 : var37;
                    int var41 = 2047 & (int) (320.0D * Math.atan2((double) (var38 - var39), (double) var17));
                    var13.method1399(var41);
                    int var42 = var32 <= var22 ? var32 : var22;
                    int var43 = 2047 & (int) (320.0D * Math.atan2((double) (-var40 + var42), (double) var16));
                    var13.method1403(var43);
                    int var44 = (var38 + var39 + var40 + var42) / 4;
                    var13.method1402(0, -super.field2757 + var44, 0);
                }
                class213 var45 = null;
                if (!this.field4096 && super.field2778 != -1 && ~super.field2799 != 0) {
                    var45 = class219.method1427(super.field2778, -122).method790(super.field2799, 117);
                    if (var45 != null) {
                        var45.method1402(0, -super.field2803, 0);
                    }
                }
                class213 var46 = null;
                if (!this.field4096 && this.field4125 != null) {
                    if (~this.field4101 >= ~class217.field4203) {
                        this.field4125 = null;
                    }
                    if (this.field4116 <= class217.field4203 && class217.field4203 < this.field4101) {
                        var46 = this.field4125;
                        var46.method1402(-super.field2820 + this.field4114, -super.field2757 + this.field4111, -super.field2801 + this.field4098);
                        if (~super.field2794 == -513) {
                            var46.method1398();
                            var46.method1398();
                            var46.method1398();
                        } else if (~super.field2794 == -1025) {
                            var46.method1398();
                            var46.method1398();
                        } else if (~super.field2794 == -1537) {
                            var46.method1398();
                        }
                    }
                }
                if (var45 != null) {
                    var13 = ((class102) var13).method627(var45);
                }
                if (var46 != null) {
                    var13 = ((class102) var13).method627(var46);
                }
                var13.field4138 = true;
                var13.method272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var46 != null) {
                    if (~super.field2794 == -513) {
                        var46.method1398();
                    } else if (~super.field2794 != -1025) {
                        if (~super.field2794 == -1537) {
                            var46.method1398();
                            var46.method1398();
                            var46.method1398();
                        }
                    } else {
                        var46.method1398();
                        var46.method1398();
                    }
                    var46.method1402(super.field2820 - this.field4114, -this.field4111 + super.field2757, super.field2801 - this.field4098);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[[[I)V")
    public static final void method1391(int arg0, int arg1, int arg2, int[][][] arg3) {
        class108.field2023 = arg0;
        class71.field1384 = arg1;
        class55.field1093 = arg2;
        class208.field4055 = new class105[arg0][arg1][arg2];
        class108.field2025 = new int[arg0][arg1 + 1][arg2 + 1];
        class124.field2328 = arg3;
        class124.method799();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lmb;I)V")
    public final void method1392(class121 arg0, int arg1) {
        ++field4108;
        arg0.field2222 = 0;
        int var3 = arg0.method751((byte) -83);
        if ((2 & var3) == 2) {
            this.field4123 = (short) (arg0.method751((byte) -40) << 2);
            this.field4106 = (short) (arg0.method751((byte) 125) << 2);
        } else {
            this.field4123 = 0;
            this.field4106 = 0;
        }
        super.field2754 = (var3 >> 3) + 1;
        int var4 = 1 & var3;
        this.field4120 = arg0.method767(arg1 ^ -11469);
        boolean var5 = (var3 & 4) != 0;
        this.field4102 = arg0.method767(-121);
        int var6 = -1;
        this.field4115 = 0;
        int[] var7 = new int[12];
        for (int var8 = 0; ~var8 > -13; ++var8) {
            int var9 = arg0.method751((byte) 125);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg0.method751((byte) -80);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && ~var11 == -65536) {
                    var6 = arg0.method755((byte) -94);
                    break;
                }
                if (~var11 <= -32769) {
                    int var15 = class31.field664[var11 + -32768];
                    var7[var8] = class21.method181(1073741824, var15);
                    int var16 = class195.method1298(1639, var15).field389;
                    if (var16 != 0) {
                        this.field4115 = var16;
                    }
                } else {
                    var7[var8] = class21.method181(Integer.MIN_VALUE, var11 - 256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var14 = arg0.method751((byte) -66);
            if (~var14 > -1 || var14 >= class164.field3043[var13].length) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field2815 = arg0.method755((byte) -35);
        if (super.field2815 == 65535) {
            super.field2815 = -1;
        }
        super.field2804 = arg0.method755((byte) -111);
        if (super.field2804 == 65535) {
            super.field2804 = -1;
        }
        super.field2796 = super.field2804;
        super.field2811 = arg0.method755((byte) -127);
        if (~super.field2811 == -65536) {
            super.field2811 = -1;
        }
        super.field2766 = arg0.method755((byte) -47);
        if (~super.field2766 == -65536) {
            super.field2766 = -1;
        }
        super.field2760 = arg0.method755((byte) -108);
        if (~super.field2760 == -65536) {
            super.field2760 = -1;
        }
        super.field2755 = arg0.method755((byte) -99);
        if (~super.field2755 == -65536) {
            super.field2755 = -1;
        }
        super.field2768 = arg0.method755((byte) -63);
        if (arg1 == 11449) {
            if (super.field2768 == 65535) {
                super.field2768 = -1;
            }
            this.field4097 = class22.method185(-23750, arg0.method759(true)).method1142(-98);
            this.field4110 = arg0.method751((byte) 127);
            if (var5) {
                this.field4099 = arg0.method755((byte) -117);
            } else {
                this.field4099 = 0;
            }
            if (this.field4109 == null) {
                this.field4109 = new class114();
            }
            this.field4109.method703(arg1 ^ -983176975, var6, ~var4 == -2, var12, var7);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILmb;)V")
    public static final void method1393(int arg0, class121 arg1) {
        ++field4100;
        if (class219.field4217 != null) {
            try {
                class219.field4217.method1002(0L, -1837);
                class219.field4217.method1001(arg1.field2218, arg1.field2222, (byte) 108, 24);
            } catch (Exception var3) {
            }
        }
        int var2 = -98 % ((34 - arg0) / 58);
        arg1.field2222 += 24;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
    public final boolean method727(boolean arg0) {
        ++field4118;
        if (this.field4109 == null) {
            return false;
        } else {
            if (!arg0) {
                this.method727(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z")
    public static final boolean method1394(int arg0, int arg1, int arg2) {
        int var3 = class108.field2025[arg0][arg1][arg2];
        if (-class122.field2291 == var3) {
            return false;
        } else if (class122.field2291 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class89.method570(var4 + 1, class124.field2328[arg0][arg1][arg2], var5 + 1) && class89.method570(var4 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg2], var5 + 1) && class89.method570(var4 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class89.method570(var4 + 1, class124.field2328[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class108.field2025[arg0][arg1][arg2] = class122.field2291;
                return true;
            } else {
                class108.field2025[arg0][arg1][arg2] = -class122.field2291;
                return false;
            }
        }
    }
}
