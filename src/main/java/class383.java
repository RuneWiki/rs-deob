import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class383 extends class86 {

    @OriginalMember(owner = "client!lk", name = "Lc", descriptor = "I")
    public int field5603 = -1;

    @OriginalMember(owner = "client!lk", name = "wc", descriptor = "I")
    public int field5588 = -1;

    @OriginalMember(owner = "client!lk", name = "Hc", descriptor = "[I")
    public static int[] field5599 = new int[32];

    @OriginalMember(owner = "client!lk", name = "Ic", descriptor = "[I")
    public static int[] field5600 = new int[8];

    @OriginalMember(owner = "client!lk", name = "Mc", descriptor = "[Lhca;")
    public static class179[] field5604 = new class179[2048];

    @OriginalMember(owner = "client!lk", name = "Qc", descriptor = "Z")
    public static boolean field5608 = false;

    @OriginalMember(owner = "client!lk", name = "vc", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!lk", name = "xc", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!lk", name = "yc", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!lk", name = "zc", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!lk", name = "Ac", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!lk", name = "Bc", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!lk", name = "Cc", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!lk", name = "Dc", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!lk", name = "Ec", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!lk", name = "Fc", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!lk", name = "Gc", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!lk", name = "Kc", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!lk", name = "Nc", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!lk", name = "Oc", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!lk", name = "Pc", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!lk", name = "Rc", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!lk", name = "Sc", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!lk", name = "Tc", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!lk", name = "Uc", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!lk", name = "Vc", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!lk", name = "Jc", descriptor = "Lai;")
    public class429 field5601;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)I")
    public final int method159(int arg0) {
        ++field5602;
        int var2 = -25 % ((arg0 - -30) / 50);
        return super.field1017;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(CI)I")
    public static final int method2317(char arg0, int arg1) {
        ++field5596;
        if (arg1 > -21) {
            method2317((char) 65442, -43);
        }
        return arg0 >= 0 && class221.field3261.length > arg0 ? class221.field3261[arg0] : -1;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)V")
    public final void method2318(int arg0, int arg1, int arg2) {
        ++field5605;
        int var4 = super.field1090[0];
        int var5 = super.field1089[0];
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
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (~super.field1024 != 0 && class470.field7205.method3498(false, super.field1024).field3304 == 1) {
            super.field1024 = -1;
        }
        if (~arg0 == -8) {
            --var4;
            ++var5;
        }
        if (super.field1082 != -1) {
            class465 var6 = class138.field1821.method2251(super.field1082, false);
            if (var6.field6723 && ~var6.field6708 != 0 && class470.field7205.method3498(false, var6.field6708).field3304 == 1) {
                super.field1082 = -1;
            }
        }
        if (~super.field1035 != 0) {
            class465 var7 = class138.field1821.method2251(super.field1035, false);
            if (var7.field6723 && var7.field6708 != -1 && ~class470.field7205.method3498(false, var7.field6708).field3304 == -2) {
                super.field1035 = -1;
            }
        }
        if (super.field1091 < 9) {
            ++super.field1091;
        }
        for (int var8 = super.field1091; ~var8 < -1; --var8) {
            super.field1090[var8] = super.field1090[var8 + -1];
            super.field1089[var8] = super.field1089[var8 + -1];
            super.field1093[var8] = super.field1093[var8 + -1];
        }
        super.field1090[0] = var4;
        if (arg1 >= -39) {
            this.field5603 = 96;
        }
        super.field1089[0] = var5;
        super.field1093[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        ++field5610;
        if (this.field5601 != null && this.method2319(2048, 9, arg1)) {
            class105 var3 = arg1.method1038();
            int var4 = super.field1067.method1378(-89);
            var3.method622(var4);
            var3.method619(super.field3464, super.field3460, super.field3463);
            class229 var5 = this.method513(0);
            class429 var6 = this.field5601.field6238 != null ? this.field5601.method2629(class406.field5823, (byte) 114) : this.field5601;
            if (class94.field1158.field284 && var6.field6259 && var5.field3399) {
                class224 var7 = ~super.field1024 != 0 && super.field1079 == 0 ? class470.field7205.method3498(false, super.field1024) : null;
                class224 var8 = super.field1039 == -1 || super.field1065 && var7 != null ? null : class470.field7205.method3498(false, super.field1039);
                int var9 = 0;
                if (~super.field996 != -1) {
                    var9 = this.method512(false);
                }
                class520 var10 = class271.method1719(super.field1047, super.field1061, this.field5601.field6232 & 255, var4, 65535 & this.field5601.field6294, arg1, super.field1099[0], var8 != null ? super.field1003 : super.field1057, 255 & this.field5601.field6255, var8 != null ? var8 : var7, this.field5601.field6234, 0, super.field1049, 65535 & this.field5601.field6251, var9);
                if (var10 != null) {
                    float var11 = arg1.method957();
                    float var12 = arg1.method1041();
                    arg1.method992(false);
                    arg1.method1009(var11, var12 - 150.0F);
                    var10.method1965(var3, (class525) null, 0);
                    arg1.method1009(var11, var12);
                    arg1.method992(true);
                }
            }
            class239 var13 = null;
            if (arg0 != -911932384) {
                this.field5603 = -64;
            }
            if (this.method2325(false)) {
                var13 = class210.method1365(false, super.field1099.length);
            }
            if (super.field1092 != null) {
                class510 var14 = super.field1092.method550();
                arg1.method958(super.field1099, var14, var3, var13 != null ? var13.field3503 : null, 0);
            } else {
                arg1.method967(super.field1099, var3, var13 == null ? null : var13.field3503, 0);
            }
            this.method511(super.field1099, false, 0, arg1);
            super.field1099[0] = super.field1099[1] = super.field1099[2] = super.field1099[3] = null;
            super.field1041 = class614.field9000;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        ++field5597;
        return !arg0;
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(B)I")
    public final int method515(byte arg0) {
        ++field5613;
        int var2 = 32 % ((arg0 - -29) / 50);
        if (this.field5601.field6238 != null) {
            class429 var3 = this.field5601.method2629(class406.field5823, (byte) 95);
            if (var3 != null && var3.field6247 != -1) {
                return var3.field6247;
            }
        }
        return this.field5601.field6247;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        ++field5591;
        int var3 = 34 % ((14 - arg0) / 48);
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        ++field5594;
        if (arg2 != -4) {
            method2323(-100, (String) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILqa;)Z")
    private final boolean method2319(int arg0, int arg1, class167 arg2) {
        ++field5593;
        int var4 = arg0;
        class229 var5 = this.method513(arg1 ^ arg1);
        class224 var6 = ~super.field1024 != 0 && super.field1079 == 0 ? class470.field7205.method3498(false, super.field1024) : null;
        class224 var7 = ~super.field1039 == 0 || super.field1065 && var6 != null ? null : class470.field7205.method3498(false, super.field1039);
        int var8 = var5.field3359;
        int var9 = var5.field3383;
        if (var8 != 0 || var9 != 0 || var5.field3357 != 0 || var5.field3364 != 0) {
            arg0 |= 7;
        }
        boolean var10 = super.field1063 != 0 && ~super.field1075 >= ~class576.field8505 && ~class576.field8505 > ~super.field1080;
        if (var10) {
            arg0 |= 524288;
        }
        class520 var11 = super.field1099[0] = this.field5601.method2632(super.field1048, super.field1000, super.field999, arg2, var7, class470.field7205, super.field1057, class406.field5823, super.field1074, (byte) -42, var6, class345.field5023, super.field1003, arg0, super.field1008);
        if (var11 == null) {
            return false;
        } else {
            super.field1017 = var11.method1954();
            this.method509(var11, false);
            int var12 = super.field1067.method1378(arg1 + -104);
            if (~var8 == -1 && ~var9 == -1) {
                this.method506((byte) 89, var12, 0, this.method514(arg1 + -9) << 7, 0, this.method514(0) << 7);
            } else {
                this.method506((byte) 89, var12, var5.field3387, var9, var5.field3368, var8);
                if (~super.field1047 != -1) {
                    super.field1099[0].method1966(super.field1047);
                }
                if (~super.field1049 != -1) {
                    super.field1099[0].method1972(super.field1049);
                }
                if (~super.field1061 != -1) {
                    super.field1099[0].method1984(0, super.field1061, 0);
                }
            }
            if (var10) {
                var11.method1949(super.field1011, super.field1073, super.field1001, super.field1063 & 255);
            }
            if (~super.field1082 != 0 && ~super.field1002 != 0) {
                class465 var13 = class138.field1821.method2251(super.field1082, false);
                boolean var14 = ~var13.field6731 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field1054 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field1051 != -1) {
                        var15 |= 2;
                    }
                }
                class520 var16 = super.field1099[1] = var13.method2760(arg2, var15, super.field1023, class470.field7205, super.field1002, (byte) -60, super.field1058);
                if (var16 != null) {
                    if (super.field1051 != 0) {
                        var16.method1984(0, -super.field1051 << 0, 0);
                    }
                    if (super.field1054 != 0) {
                        var16.method1979(super.field1054 * 2048);
                    }
                    if (var14) {
                        if (super.field1047 != 0) {
                            var16.method1966(super.field1047);
                        }
                        if (super.field1049 != 0) {
                            var16.method1972(super.field1049);
                        }
                        if (super.field1061 != 0) {
                            var16.method1984(0, super.field1061, 0);
                        }
                    }
                }
            } else {
                super.field1099[1] = null;
            }
            if (super.field1035 != -1 && ~super.field1005 != 0) {
                class465 var17 = class138.field1821.method2251(super.field1035, false);
                boolean var18 = ~var17.field6731 == -4 && (~var8 != -1 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (~super.field1084 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field1044 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class520 var20 = super.field1099[3] = var17.method2758(super.field1005, arg2, super.field1013, super.field1086, 8, var19, class470.field7205);
                if (var20 != null) {
                    if (super.field1044 != 0) {
                        var20.method1984(0, -super.field1044 << 0, 0);
                    }
                    if (~super.field1084 != -1) {
                        var20.method1979(super.field1084 * 2048);
                    }
                    if (var18) {
                        if (super.field1047 != 0) {
                            var20.method1966(super.field1047);
                        }
                        if (super.field1049 != 0) {
                            var20.method1972(super.field1049);
                        }
                        if (super.field1061 != 0) {
                            var20.method1984(0, super.field1061, 0);
                        }
                    }
                }
            } else {
                super.field1099[3] = null;
            }
            super.field1099[2] = null;
            if (super.field1095 != null) {
                if (~super.field1095.field6608 >= ~class576.field8505) {
                    super.field1095 = null;
                } else if (super.field1095.field6598 <= class576.field8505) {
                    class520 var21 = super.field1095.method2722((byte) -102, arg2, var4 | 7);
                    if (var21 != null) {
                        var21.method1984(super.field1095.field6599 - super.field3464, -super.field3460 + super.field1095.field6606, -super.field3463 + super.field1095.field6603);
                        if (~var12 != -1) {
                            var21.method1979(var12);
                        }
                        super.field1099[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)Z")
    public final boolean method2320(int arg0) {
        ++field5587;
        if (arg0 != 7772) {
            this.method2325(false);
        }
        return this.field5601 != null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZ)V")
    public final void method2321(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field3457 = (byte) arg0;
        ++field5607;
        if (~super.field1024 != arg4 && ~class470.field7205.method3498(false, super.field1024).field3304 == -2) {
            super.field1024 = -1;
        }
        if (~super.field1082 != 0) {
            class465 var7 = class138.field1821.method2251(super.field1082, false);
            if (var7.field6723 && var7.field6708 != -1 && class470.field7205.method3498(false, var7.field6708).field3304 == 1) {
                super.field1082 = -1;
            }
        }
        if (super.field1035 != -1) {
            class465 var8 = class138.field1821.method2251(super.field1035, false);
            if (var8.field6723 && var8.field6708 != -1 && ~class470.field7205.method3498(false, var8.field6708).field3304 == -2) {
                super.field1035 = -1;
            }
        }
        if (!arg5) {
            int var9 = -super.field1090[0] + arg2;
            int var10 = arg1 - super.field1089[0];
            if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && ~var10 >= -9) {
                if (super.field1091 < 9) {
                    ++super.field1091;
                }
                for (int var11 = super.field1091; var11 > 0; --var11) {
                    super.field1090[var11] = super.field1090[var11 + -1];
                    super.field1089[var11] = super.field1089[var11 + -1];
                    super.field1093[var11] = super.field1093[var11 + -1];
                }
                super.field1090[0] = arg2;
                super.field1093[0] = 1;
                super.field1089[0] = arg1;
                return;
            }
        }
        super.field1090[0] = arg2;
        super.field1091 = 0;
        super.field1096 = 0;
        super.field1097 = 0;
        super.field1089[0] = arg1;
        super.field3464 = (super.field1090[0] << 7) + (arg3 << 6);
        super.field3463 = (super.field1089[0] << 7) + (arg3 << 6);
        if (super.field1092 != null) {
            super.field1092.method546();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lai;I)V")
    public final void method2322(class429 arg0, int arg1) {
        this.field5601 = arg0;
        if (arg1 != -31902) {
            this.method2322((class429) null, -82);
        }
        ++field5595;
        if (super.field1092 != null) {
            super.field1092.method546();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field5612;
        if (!arg1) {
            this.method2320(-127);
        }
        if (this.field5601 != null) {
            if (super.field1098 || this.method2319(0, 9, arg0)) {
                this.method511(super.field1099, super.field1098, 0, arg0);
                super.field1099[0] = super.field1099[1] = super.field1099[2] = super.field1099[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2323(int arg0, String arg1) {
        ++field5589;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; class156.field1993 > var2; ++var2) {
                if (arg1.equalsIgnoreCase(class417.field5994[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class239.field3493.field2718);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I")
    public final int method503(int arg0) {
        ++field5609;
        if (this.field5601.field6238 != null) {
            class429 var2 = this.field5601.method2629(class406.field5823, (byte) 121);
            if (var2 != null && var2.field6266 != -1) {
                return var2.field6266;
            }
        }
        if (arg0 != -1) {
            this.method503(-46);
        }
        return this.field5601.field6266;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (arg0 != -33) {
            this.method166((class167) null, false);
        }
        ++field5606;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
    public final int method498(byte arg0) {
        ++field5611;
        if (arg0 <= 44) {
            this.method160(104, (class167) null, 47, -113, false, (class198) null, 75);
        }
        if (this.field5601.field6238 != null) {
            class429 var2 = this.field5601.method2629(class406.field5823, (byte) 122);
            if (var2 != null && var2.field6268 != -1) {
                return var2.field6268;
            }
        }
        return this.field5601.field6268 == -1 ? super.method498((byte) 63) : this.field5601.field6268;
    }

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "(I)V")
    public static void method2324(int arg0) {
        field5599 = null;
        field5604 = null;
        if (arg0 == 3) {
            field5600 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)Z")
    private final boolean method2325(boolean arg0) {
        if (arg0) {
            field5590 = 95;
        }
        ++field5598;
        return this.field5601.field6296;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field5592;
        if (this.field5601 != null && this.method2319(131072, arg3 ^ 68, arg1)) {
            if (arg3 != 77) {
                this.method165((byte) 121);
            }
            class105 var5 = arg1.method1038();
            int var6 = super.field1067.method1378(-94);
            var5.method622(var6);
            var5.method619(super.field3464, super.field3460, super.field3463);
            boolean var7 = false;
            for (int var8 = 0; super.field1099.length > var8; ++var8) {
                if (super.field1099[var8] != null && super.field1099[var8].method1963(arg0, arg2, var5, this.field5601.field6234 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field1099[0] = super.field1099[1] = super.field1099[2] = super.field1099[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field5599[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
