import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class196 extends class75 {

    @OriginalMember(owner = "client!ld", name = "tc", descriptor = "I")
    public int field2780 = -1;

    @OriginalMember(owner = "client!ld", name = "oc", descriptor = "I")
    public int field2775 = -1;

    @OriginalMember(owner = "client!ld", name = "Fc", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!ld", name = "zc", descriptor = "Lmq;")
    public static class104 field2786 = new class104(4);

    @OriginalMember(owner = "client!ld", name = "Lc", descriptor = "Lcs;")
    public static class351 field2798 = new class351(69, 4);

    @OriginalMember(owner = "client!ld", name = "Nc", descriptor = "Lcs;")
    public static class351 field2800 = new class351(47, 8);

    @OriginalMember(owner = "client!ld", name = "Oc", descriptor = "Z")
    public static boolean field2801 = false;

    @OriginalMember(owner = "client!ld", name = "Pc", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!ld", name = "nc", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ld", name = "pc", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ld", name = "qc", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ld", name = "rc", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ld", name = "sc", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ld", name = "uc", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ld", name = "vc", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ld", name = "wc", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ld", name = "xc", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ld", name = "yc", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ld", name = "Ac", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ld", name = "Dc", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ld", name = "Ec", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ld", name = "Gc", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ld", name = "Hc", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ld", name = "Ic", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ld", name = "Kc", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ld", name = "Mc", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Lvl;")
    public class127 field2789;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIII)V")
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2795;
        if (arg1 == arg5) {
            class215.method1357(arg0, 0, arg2, arg1, arg4);
        } else if (arg3 == -125) {
            if (-arg1 + arg2 >= class299.field4121 && class248.field3487 >= arg1 + arg2 && ~class53.field874 >= ~(arg4 - arg5) && class8.field174 >= arg4 + arg5) {
                class367.method2219(arg4, arg1, arg5, arg2, 3287, arg0);
            } else {
                class482.method2831(arg0, arg1, arg5, arg4, arg2, 84);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILkm;IZILkj;B)V")
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 == 59) {
            ++field2793;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(Lkm;I)V")
    public final void method197(class487 arg0, int arg1) {
        ++field2784;
        if (this.field2789 != null) {
            if (super.field1146 || this.method1250(1, 0, arg0)) {
                this.method508(arg0, -22367, super.field1146, super.field1143);
                int var3 = -12 / ((64 - arg1) / 59);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lkm;BII)Z")
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field2783;
        if (this.field2789 != null && this.method1250(1, 65536, arg0)) {
            class250 var5 = arg0.method1105();
            int var6 = super.field1076.method493((byte) 118);
            var5.method1373(var6);
            var5.method1380(super.field6765, super.field6755, super.field6746);
            for (int var7 = 0; ~var7 > ~super.field1143.length; ++var7) {
                if (super.field1143[var7] != null && super.field1143[var7].method75(arg3, arg2, var5, ~this.field2789.field1786 == -2)) {
                    return true;
                }
            }
            if (arg1 <= 123) {
                field2797 = -51;
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
    public final int method515(boolean arg0) {
        if (arg0) {
            return 103;
        } else {
            ++field2791;
            if (this.field2789.field1780 != null) {
                class127 var2 = this.field2789.method767(class320.field4376, (byte) 70);
                if (var2 != null && var2.field1770 != -1) {
                    return var2.field1770;
                }
            }
            return ~this.field2789.field1770 != 0 ? this.field2789.field1770 : super.method515(false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
    public final boolean method1246(int arg0) {
        ++field2782;
        if (this.field2789 == null) {
            return false;
        } else {
            if (arg0 >= -27) {
                this.field2780 = -86;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)I")
    public static final int method1247(int arg0) {
        ++field2774;
        if (arg0 != 6) {
            field2799 = -97;
        }
        return 6;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lvl;I)V")
    public final void method1248(class127 arg0, int arg1) {
        this.field2789 = arg0;
        ++field2778;
        if (arg1 != -2) {
            this.method515(true);
        }
        if (super.field1141 != null) {
            super.field1141.method577();
        }
    }

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field2800 = null;
        field2798 = null;
        field2786 = null;
        if (arg0 > -65) {
            field2786 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public final void method202(byte arg0) {
        ++field2785;
        if (arg0 < 42) {
            this.method1252((byte) 88);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILkm;)Z")
    private final boolean method1250(int arg0, int arg1, class487 arg2) {
        ++field2796;
        int var4 = arg1;
        class318 var5 = this.method517(-125);
        class372 var6 = ~super.field1128 != 0 && super.field1110 == 0 ? class31.field505.method950(true, super.field1128) : null;
        class372 var7 = super.field1089 == -1 || super.field1127 && var6 != null ? null : class31.field505.method950(true, super.field1089);
        int var8 = var5.field4313;
        int var9 = var5.field4328;
        if (var8 != 0 || ~var9 != -1 || var5.field4344 != 0 || var5.field4358 != 0) {
            arg1 |= 7;
        }
        class232 var10 = super.field1143[0] = this.field2789.method774(arg1, super.field1062, super.field1126, super.field1064, super.field1086, class320.field4376, class31.field505, super.field1124, 120, class363.field5161, super.field1080, var7, super.field1088, arg2, var6);
        if (var10 == null) {
            return false;
        } else {
            super.field1081 = var10.method55();
            this.method512(var10, (byte) 97);
            int var11 = super.field1076.method493((byte) 125);
            super.field1083 = 0;
            super.field1103 = 0;
            super.field1093 = 0;
            if (var8 == 0 && ~var9 == -1) {
                this.method513((byte) -98, this.method206(0) << 7, this.method206(0) << 7, var11);
            } else {
                this.method513((byte) -86, var8, var9, var11);
                if (super.field1083 != 0) {
                    super.field1143[0].method62(super.field1083);
                }
                if (super.field1103 != 0) {
                    super.field1143[0].method34(super.field1103);
                }
                if (~super.field1093 != -1) {
                    super.field1143[0].method54(0, super.field1093, 0);
                }
            }
            super.field1143[arg0] = null;
            if (super.field1079 != -1 && ~super.field1091 != 0) {
                class321 var12 = class163.field2348.method548(super.field1079, (byte) -99);
                class232 var13 = var12.method1931(false, class31.field505, arg2, var4 | (!var12.field4383 ? 2 : 7), super.field1091, super.field1074, super.field1125);
                if (var13 != null) {
                    var13.method54(0, -super.field1132, 0);
                    if (var12.field4383 && (var8 != 0 || var9 != 0)) {
                        if (~super.field1083 != -1) {
                            var13.method62(super.field1083);
                        }
                        if (~super.field1103 != -1) {
                            var13.method34(super.field1103);
                        }
                        if (super.field1093 != 0) {
                            var13.method54(0, super.field1093, 0);
                        }
                    }
                    super.field1143[1] = var13;
                }
            }
            super.field1143[2] = null;
            if (super.field1145 != null) {
                if (class356.field4972 >= super.field1145.field3873) {
                    super.field1145 = null;
                } else if (class356.field4972 >= super.field1145.field3875) {
                    class232 var14 = super.field1145.method1753(var4 | 7, true, arg2);
                    if (var14 != null) {
                        var14.method54(-super.field6765 + super.field1145.field3864, -super.field6755 + super.field1145.field3868, -super.field6746 + super.field1145.field3865);
                        if (~var11 != -1) {
                            var14.method48(var11);
                        }
                        super.field1143[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBZI)V")
    public final void method1251(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        ++field2776;
        super.field6766 = (byte) arg2;
        if (~super.field1128 != 0 && class31.field505.method950(true, super.field1128).field5273 == 1) {
            super.field1128 = -1;
        }
        if (~super.field1079 != 0) {
            class321 var7 = class163.field2348.method548(super.field1079, (byte) 9);
            if (var7.field4392 && var7.field4391 != -1 && ~class31.field505.method950(true, var7.field4391).field5273 == -2) {
                super.field1079 = -1;
            }
        }
        if (!arg4) {
            int var8 = -super.field1144[0] + arg5;
            int var9 = -super.field1140[0] + arg1;
            if (~var8 <= 7 && var8 <= 8 && ~var9 <= 7 && ~var9 >= -9) {
                if (super.field1142 < 9) {
                    ++super.field1142;
                }
                for (int var10 = super.field1142; ~var10 < -1; --var10) {
                    super.field1144[var10] = super.field1144[var10 - 1];
                    super.field1140[var10] = super.field1140[var10 + -1];
                    super.field1147[var10] = super.field1147[var10 + -1];
                }
                super.field1144[0] = arg5;
                super.field1147[0] = 1;
                super.field1140[0] = arg1;
                return;
            }
        }
        super.field1144[0] = arg5;
        super.field1138 = 0;
        super.field1137 = 0;
        super.field1142 = 0;
        super.field1140[0] = arg1;
        if (arg3 > 24) {
            super.field6765 = super.field1144[0] * 128 + arg0 * 64;
            super.field6746 = super.field1140[0] * 128 + arg0 * 64;
            if (super.field1141 != null) {
                super.field1141.method577();
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
    public final int method186(int arg0) {
        ++field2777;
        if (this.field2789.field1780 != null) {
            class127 var2 = this.field2789.method767(class320.field4376, (byte) 94);
            if (var2 != null && var2.field1792 != -1) {
                return var2.field1792;
            }
        }
        if (arg0 != -1) {
            field2797 = -49;
        }
        return this.field2789.field1792;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
    public final int method205(byte arg0) {
        ++field2781;
        if (arg0 != 114) {
            this.method1251(89, 75, 6, (byte) 121, false, -123);
        }
        return super.field1081;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Z")
    private final boolean method1252(byte arg0) {
        if (arg0 != 16) {
            field2801 = false;
        }
        ++field2788;
        return this.field2789.field1764;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
    public final boolean method195(int arg0) {
        ++field2779;
        if (arg0 < 91) {
            this.method1252((byte) -49);
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public final void method1253(int arg0, int arg1, int arg2) {
        ++field2794;
        int var4 = super.field1144[0];
        int var5 = super.field1140[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            ++var4;
            --var5;
        }
        if (arg0 > -23) {
            this.method202((byte) -44);
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field1128 != 0 && class31.field505.method950(true, super.field1128).field5273 == 1) {
            super.field1128 = -1;
        }
        if (super.field1079 != -1) {
            class321 var6 = class163.field2348.method548(super.field1079, (byte) -77);
            if (var6.field4392 && ~var6.field4391 != 0 && ~class31.field505.method950(true, var6.field4391).field5273 == -2) {
                super.field1079 = -1;
            }
        }
        if (~super.field1142 > -10) {
            ++super.field1142;
        }
        for (int var7 = super.field1142; ~var7 < -1; --var7) {
            super.field1144[var7] = super.field1144[var7 - 1];
            super.field1140[var7] = super.field1140[var7 - 1];
            super.field1147[var7] = super.field1147[var7 - 1];
        }
        super.field1144[0] = var4;
        super.field1140[0] = var5;
        super.field1147[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)I")
    public final int method204(byte arg0) {
        if (arg0 < 7) {
            this.method202((byte) 54);
        }
        ++field2790;
        if (this.field2789.field1780 != null) {
            class127 var2 = this.field2789.method767(class320.field4376, (byte) 86);
            if (var2 != null && ~var2.field1749 != 0) {
                return var2.field1749;
            }
        }
        return this.field2789.field1749;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(Lkm;I)Lto;")
    public final class370 method193(class487 arg0, int arg1) {
        ++field2787;
        if (this.field2789 != null && this.method1250(1, 1024, arg0)) {
            class250 var3 = arg0.method1105();
            int var4 = super.field1076.method493((byte) 127);
            var3.method1373(var4);
            var3.method1380(super.field6765, super.field6755, super.field6746);
            class318 var5 = this.method517(-111);
            class127 var6 = this.field2789.field1780 != null ? this.field2789.method767(class320.field4376, (byte) 116) : this.field2789;
            if (arg1 >= -6) {
                this.field2780 = 30;
            }
            if (class191.field2723 && var6.field1810 && var5.field4347) {
                class372 var7 = super.field1128 != -1 && ~super.field1110 == -1 ? class31.field505.method950(true, super.field1128) : null;
                class372 var8 = ~super.field1089 == 0 || super.field1127 && var7 != null ? null : class31.field505.method950(true, super.field1089);
                class232 var9 = class58.method434(arg0, this.field2789.field1778 & 255, this.field2789.field1791 & 255, (byte) -1, super.field1103, super.field1083, super.field1065, this.field2789.field1786, this.field2789.field1808 & 65535, var8 == null ? var7 : var8, var8 == null ? super.field1064 : super.field1062, super.field1143[0], super.field1093, var4, this.field2789.field1757 & 65535);
                if (var9 != null) {
                    float var10 = arg0.method1140();
                    float var11 = arg0.method1097();
                    arg0.method1108(false);
                    arg0.method1144(var10, var11 + -150.0F);
                    var9.method41(var3, (class219) null, 0);
                    arg0.method1144(var10, var11);
                    arg0.method1108(true);
                }
            }
            class370 var12 = null;
            if (this.method1252((byte) 16)) {
                var12 = class277.method1737((byte) 28, super.field1143.length);
            }
            if (super.field1141 == null) {
                arg0.method1147(super.field1143, var3, var12 == null ? null : var12.field5233, 0);
            } else {
                class473 var13 = super.field1141.method567();
                arg0.method1093(super.field1143, var13, var3, var12 == null ? null : var12.field5233, 0);
            }
            this.method508(arg0, -22367, false, super.field1143);
            if (super.field1143[2] != null) {
                if (~var4 != -1) {
                    super.field1143[2].method48(var4);
                }
                super.field1143[2].method54(-super.field1145.field3864 + super.field6765, super.field6755 - super.field1145.field3868, -super.field1145.field3865 + super.field6746);
            }
            return var12;
        } else {
            return null;
        }
    }
}
