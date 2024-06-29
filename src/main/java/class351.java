import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class351 extends class400 {

    @OriginalMember(owner = "client!sr", name = "Lc", descriptor = "I")
    public int field5397 = -1;

    @OriginalMember(owner = "client!sr", name = "Nc", descriptor = "I")
    public int field5399 = -1;

    @OriginalMember(owner = "client!sr", name = "Tc", descriptor = "I")
    public static int field5405 = 0;

    @OriginalMember(owner = "client!sr", name = "Rc", descriptor = "F")
    public static float field5403;

    @OriginalMember(owner = "client!sr", name = "Dc", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!sr", name = "Ec", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!sr", name = "Fc", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!sr", name = "Gc", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!sr", name = "Hc", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!sr", name = "Ic", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!sr", name = "Jc", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!sr", name = "Kc", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!sr", name = "Mc", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!sr", name = "Oc", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!sr", name = "Pc", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!sr", name = "Qc", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!sr", name = "Sc", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!sr", name = "Uc", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!sr", name = "Vc", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!sr", name = "Wc", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!sr", name = "Yc", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!sr", name = "Zc", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!sr", name = "ad", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!sr", name = "Xc", descriptor = "Lup;")
    public class277 field5409;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        if (arg0 >= -38) {
            this.method233(38, (class11) null, -99, -111);
        }
        ++field5411;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field5401;
        if (this.field5409 != null && this.method2128(2048, (byte) -96, arg0)) {
            class511 var3 = arg0.method66();
            int var4 = super.field5994.method1496((byte) 116);
            var3.method1298(var4);
            var3.method1309(super.field7681, super.field7689, super.field7671);
            class192 var5 = this.method2415(arg1 ^ arg1);
            class277 var6 = this.field5409.field4148 != null ? this.field5409.method1734((byte) -101, class307.field4619) : this.field5409;
            if (class454.field6661.field996 && var6.field4158 && var5.field2806) {
                class520 var7 = ~super.field5973 != 0 && ~super.field6002 == -1 ? class510.field7490.method575(super.field5973, -89) : null;
                class520 var8 = ~super.field6043 == 0 || super.field5979 && var7 != null ? null : class510.field7490.method575(super.field6043, -79);
                class398 var9 = class123.method917(super.field6063[0], this.field5409.field4128, 255 & this.field5409.field4126, (byte) -100, super.field6018, this.field5409.field4151 & 65535, arg0, var8 == null ? super.field5992 : super.field5999, super.field6000, this.field5409.field4159 & 65535, super.field6055, var8 != null ? var8 : var7, super.field6026, 255 & this.field5409.field4154, var4);
                if (var9 != null) {
                    float var10 = arg0.method157();
                    float var11 = arg0.method82();
                    arg0.method134(false);
                    arg0.method154(var10, var11 + -150.0F);
                    var9.method640(var3, (class518) null, 0);
                    arg0.method154(var10, var11);
                    arg0.method134(true);
                }
            }
            class268 var12 = null;
            if (this.method2120(arg1 + 1)) {
                var12 = class281.method1757(0, super.field6063.length);
            }
            if (super.field6061 != null) {
                class46 var13 = super.field6061.method2316();
                arg0.method119(super.field6063, var13, var3, var12 != null ? var12.field3992 : null, 0);
            } else {
                arg0.method135(super.field6063, var3, var12 == null ? null : var12.field3992, 0);
            }
            this.method2416(1024, super.field6063, false, arg0);
            if (super.field6063[2] != null) {
                if (~var4 != -1) {
                    super.field6063[2].method650(var4);
                }
                super.field6063[2].method601(-super.field6058.field5624 + super.field7681, -super.field6058.field5629 + super.field7689, -super.field6058.field5636 + super.field7671);
            }
            super.field6063[0] = super.field6063[1] = super.field6063[2] = super.field6063[3] = null;
            super.field5972 = class439.field6459;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)I")
    public final int method2119(int arg0) {
        ++field5396;
        if (arg0 != 131072) {
            return 0;
        } else {
            if (this.field5409.field4148 != null) {
                class277 var2 = this.field5409.method1734((byte) -98, class307.field4619);
                if (var2 != null && ~var2.field4176 != 0) {
                    return var2.field4176;
                }
            }
            return ~this.field5409.field4176 != 0 ? this.field5409.field4176 : super.method2119(131072);
        }
    }

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)Z")
    private final boolean method2120(int arg0) {
        ++field5392;
        if (arg0 != 0) {
            this.method2124(true, 121, (byte) -66, 9, 14, -55);
        }
        return this.field5409.field4187;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I")
    public final int method2121(int arg0) {
        ++field5406;
        if (this.field5409.field4148 != null) {
            class277 var2 = this.field5409.method1734((byte) -102, class307.field4619);
            if (var2 != null && ~var2.field4153 != 0) {
                return var2.field4153;
            }
        }
        if (arg0 != 9) {
            field5405 = -61;
        }
        return this.field5409.field4153;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(B)I")
    public final int method2122(byte arg0) {
        ++field5412;
        if (arg0 != -80) {
            return -39;
        } else {
            if (this.field5409.field4148 != null) {
                class277 var2 = this.field5409.method1734((byte) 58, class307.field4619);
                if (var2 != null && ~var2.field4141 != 0) {
                    return var2.field4141;
                }
            }
            return this.field5409.field4141;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLla;Ljava/lang/String;Z)V")
    public static final void method2123(byte arg0, class307 arg1, String arg2, boolean arg3) {
        ++field5390;
        byte var4 = 4;
        int var5 = 6 - -var4;
        int var6 = var4 + 6;
        int var7 = class192.field2837.method2602(250, -121, (class127[]) null, arg2);
        int var8 = 13 * class192.field2837.method2605(250, (class127[]) null, arg2, (byte) 22);
        class407.field6147.method162(-var4 + var5, -var4 + var6, var7 - (-var4 - var4), var4 + var8 + var4, -16777216, 0);
        class407.field6147.method69(-var4 + var5, var6 - var4, var7 - -var4 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1924((class127[]) null, -1, 0, 0, var8, 1, -1, (byte) 115, 0, var6, (int[]) null, var7, 1, (class249) null, var5, arg2);
        class490.method2924(var4 + var4 + var8, -var4 + var6, var7 - -var4 + var4, var5 - var4, 124);
        if (arg3) {
            class407.field6147.method161();
        }
        if (arg0 >= -42) {
            method2123((byte) -57, (class307) null, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIBIII)V")
    public final void method2124(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        super.field7686 = (byte) arg5;
        if (arg2 != 24) {
            this.method236(126);
        }
        ++field5410;
        if (super.field5973 != -1 && class510.field7490.method575(super.field5973, -121).field7611 == 1) {
            super.field5973 = -1;
        }
        if (super.field5998 != -1) {
            class270 var7 = class443.field6509.method2022(30, super.field5998);
            if (var7.field4014 && var7.field4013 != -1 && ~class510.field7490.method575(var7.field4013, -75).field7611 == -2) {
                super.field5998 = -1;
            }
        }
        if (~super.field5997 != 0) {
            class270 var8 = class443.field6509.method2022(30, super.field5997);
            if (var8.field4014 && var8.field4013 != -1 && class510.field7490.method575(var8.field4013, -85).field7611 == 1) {
                super.field5997 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field6065[0] + arg3;
            int var10 = arg1 - super.field6068[0];
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field6066 < 9) {
                    ++super.field6066;
                }
                for (int var11 = super.field6066; var11 > 0; --var11) {
                    super.field6065[var11] = super.field6065[var11 + -1];
                    super.field6068[var11] = super.field6068[var11 + -1];
                    super.field6062[var11] = super.field6062[var11 + -1];
                }
                super.field6065[0] = arg3;
                super.field6062[0] = 1;
                super.field6068[0] = arg1;
                return;
            }
        }
        super.field6065[0] = arg3;
        super.field6064 = 0;
        super.field6059 = 0;
        super.field6066 = 0;
        super.field6068[0] = arg1;
        super.field7671 = (super.field6068[0] << 7) + (arg4 << 6);
        super.field7681 = (super.field6065[0] << 7) + (arg4 << 6);
        if (super.field6061 != null) {
            super.field6061.method2320();
        }
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)I")
    public final int method236(int arg0) {
        if (arg0 != 0) {
            return -28;
        } else {
            ++field5394;
            return super.field6042;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
    public final void method2125(int arg0, int arg1, int arg2) {
        ++field5393;
        int var4 = super.field6065[0];
        int var5 = super.field6068[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (arg1 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field5973 != 0 && class510.field7490.method575(super.field5973, -116).field7611 == 1) {
            super.field5973 = -1;
        }
        if (super.field5998 != -1) {
            class270 var6 = class443.field6509.method2022(30, super.field5998);
            if (var6.field4014 && ~var6.field4013 != 0 && class510.field7490.method575(var6.field4013, -84).field7611 == 1) {
                super.field5998 = -1;
            }
        }
        if (~super.field5997 != 0) {
            class270 var7 = class443.field6509.method2022(arg0 ^ 30, super.field5997);
            if (var7.field4014 && ~var7.field4013 != 0 && class510.field7490.method575(var7.field4013, -92).field7611 == 1) {
                super.field5997 = -1;
            }
        }
        if (super.field6066 < 9) {
            ++super.field6066;
        }
        for (int var8 = super.field6066; var8 > 0; --var8) {
            super.field6065[var8] = super.field6065[var8 + -1];
            super.field6068[var8] = super.field6068[var8 - 1];
            super.field6062[var8] = super.field6062[var8 - 1];
        }
        super.field6065[arg0] = var4;
        super.field6062[0] = (byte) arg2;
        super.field6068[0] = var5;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        ++field5398;
        if (this.field5409 != null) {
            if (super.field6067 || this.method2128(0, (byte) -115, arg0)) {
                this.method2416(arg1 + -26983, super.field6063, super.field6067, arg0);
                super.field6063[0] = super.field6063[1] = super.field6063[2] = super.field6063[3] = null;
                if (arg1 != 28007) {
                    this.method233(107, (class11) null, 111, -111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)Z")
    public final boolean method2126(int arg0) {
        ++field5400;
        if (arg0 != 65535) {
            this.field5397 = 127;
        }
        return this.field5409 != null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field5389;
        if (this.field5409 != null && this.method2128(131072, (byte) -106, arg1)) {
            class511 var5 = arg1.method66();
            int var6 = super.field5994.method1496((byte) 105);
            var5.method1298(var6);
            var5.method1309(super.field7681, super.field7689, super.field7671);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field6063.length; ++var8) {
                if (super.field6063[var8] != null && super.field6063[var8].method655(arg0, arg3, var5, ~this.field5409.field4128 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field6063[0] = super.field6063[1] = super.field6063[arg2] = super.field6063[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        int var8 = -26 / ((24 - arg5) / 62);
        ++field5408;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lup;B)V")
    public final void method2127(class277 arg0, byte arg1) {
        int var3 = 13 / ((arg1 - -10) / 35);
        this.field5409 = arg0;
        ++field5402;
        if (super.field6061 != null) {
            super.field6061.method2320();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBLya;)Z")
    private final boolean method2128(int arg0, byte arg1, class11 arg2) {
        ++field5391;
        int var4 = arg0;
        if (arg1 > -77) {
            this.method224((class11) null, -55, 87, -85, (class419) null, -52, true);
        }
        class192 var5 = this.method2415(0);
        class520 var6 = super.field5973 != -1 && super.field6002 == 0 ? class510.field7490.method575(super.field5973, -113) : null;
        class520 var7 = super.field6043 == -1 || super.field5979 && var6 != null ? null : class510.field7490.method575(super.field6043, -83);
        int var8 = var5.field2830;
        int var9 = var5.field2840;
        if (var8 != 0 || var9 != 0 || ~var5.field2826 != -1 || var5.field2846 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field5984 != -1 && ~super.field5976 >= ~class86.field1350 && ~super.field5982 < ~class86.field1350;
        if (var10) {
            arg0 |= 524288;
        }
        class398 var11 = super.field6063[0] = this.field5409.method1731(class159.field2391, super.field5985, super.field6011, super.field6044, arg0, super.field5999, super.field5992, -1, class510.field7490, arg2, super.field6029, class307.field4619, var6, var7, super.field5977);
        if (var11 == null) {
            return false;
        } else {
            super.field6042 = var11.method635();
            this.method2414(var11, (byte) 88);
            int var12 = super.field5994.method1496((byte) -123);
            if (var8 == 0 && var9 == 0) {
                this.method2421(this.method2419((byte) 112) << 7, 0, (byte) -106, var12, this.method2419((byte) 104) << 7, 0);
            } else {
                this.method2421(var8, var5.field2801, (byte) -89, var12, var9, var5.field2823);
                if (~super.field6055 != -1) {
                    super.field6063[0].method657(super.field6055);
                }
                if (super.field6026 != 0) {
                    super.field6063[0].method595(super.field6026);
                }
                if (~super.field6000 != -1) {
                    super.field6063[0].method601(0, super.field6000, 0);
                }
            }
            if (var10) {
                var11.method608(super.field5963, super.field6022, super.field6008, 255 & super.field5984);
            }
            if (~super.field5998 != 0 && super.field6039 != -1) {
                class270 var13 = class443.field6509.method2022(30, super.field5998);
                boolean var14 = ~var13.field4022 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field6034 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field5974 != -1) {
                        var15 |= 2;
                    }
                }
                class398 var16 = super.field6063[1] = var13.method1682(super.field5969, var15, super.field5986, (byte) 124, super.field6039, arg2, class510.field7490);
                if (var16 != null) {
                    if (super.field5974 != 0) {
                        var16.method601(0, -super.field5974 << 0, 0);
                    }
                    if (~super.field6034 != -1) {
                        var16.method650(super.field6034 * 2048);
                    }
                    if (var14) {
                        if (super.field6055 != 0) {
                            var16.method657(super.field6055);
                        }
                        if (super.field6026 != 0) {
                            var16.method595(super.field6026);
                        }
                        if (~super.field6000 != -1) {
                            var16.method601(0, super.field6000, 0);
                        }
                    }
                }
            } else {
                super.field6063[1] = null;
            }
            if (super.field5997 != -1 && super.field5962 != -1) {
                class270 var17 = class443.field6509.method2022(30, super.field5997);
                boolean var18 = var17.field4022 == 3 && (~var8 != -1 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field6001 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field6017 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class398 var20 = super.field6063[3] = var17.method1687(super.field6006, class510.field7490, var19, super.field5962, super.field5968, true, arg2);
                if (var20 != null) {
                    if (super.field6017 != 0) {
                        var20.method601(0, -super.field6017 << 0, 0);
                    }
                    if (super.field6001 != 0) {
                        var20.method650(super.field6001 * 2048);
                    }
                    if (var18) {
                        if (~super.field6055 != -1) {
                            var20.method657(super.field6055);
                        }
                        if (~super.field6026 != -1) {
                            var20.method595(super.field6026);
                        }
                        if (~super.field6000 != -1) {
                            var20.method601(0, super.field6000, 0);
                        }
                    }
                }
            } else {
                super.field6063[3] = null;
            }
            super.field6063[2] = null;
            if (super.field6058 != null) {
                if (~class86.field1350 > ~super.field6058.field5625) {
                    if (~class86.field1350 <= ~super.field6058.field5631) {
                        class398 var21 = super.field6058.method2214(arg2, 7 | var4, (byte) -88);
                        if (var21 != null) {
                            var21.method601(super.field6058.field5624 - super.field7681, -super.field7689 + super.field6058.field5629, super.field6058.field5636 - super.field7671);
                            if (~var12 != -1) {
                                var21.method650(var12);
                            }
                            super.field6063[2] = var21;
                        }
                    }
                } else {
                    super.field6058 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            return false;
        } else {
            ++field5395;
            return false;
        }
    }
}
