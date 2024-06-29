import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class286 {

    @OriginalMember(owner = "client!fk", name = "rc", descriptor = "I")
    public int field200 = 0;

    @OriginalMember(owner = "client!fk", name = "wc", descriptor = "I")
    public int field205 = 0;

    @OriginalMember(owner = "client!fk", name = "qc", descriptor = "I")
    public int field199 = -1;

    @OriginalMember(owner = "client!fk", name = "Bc", descriptor = "I")
    public int field210 = -1;

    @OriginalMember(owner = "client!fk", name = "Jc", descriptor = "I")
    public int field218 = -1;

    @OriginalMember(owner = "client!fk", name = "Pc", descriptor = "I")
    public int field224 = 0;

    @OriginalMember(owner = "client!fk", name = "Ic", descriptor = "I")
    public int field217 = -1;

    @OriginalMember(owner = "client!fk", name = "Kc", descriptor = "I")
    public int field219 = 0;

    @OriginalMember(owner = "client!fk", name = "Hc", descriptor = "I")
    public int field216 = -1;

    @OriginalMember(owner = "client!fk", name = "zc", descriptor = "I")
    public int field208 = 0;

    @OriginalMember(owner = "client!fk", name = "Cc", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "client!fk", name = "Vc", descriptor = "I")
    public int field230 = -1;

    @OriginalMember(owner = "client!fk", name = "tc", descriptor = "Z")
    public boolean field202 = false;

    @OriginalMember(owner = "client!fk", name = "uc", descriptor = "I")
    public int field203 = -1;

    @OriginalMember(owner = "client!fk", name = "Dc", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!fk", name = "Lc", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!fk", name = "pc", descriptor = "Lqk;")
    public static class207 field198 = class24.method212(255, "k");

    @OriginalMember(owner = "client!fk", name = "Gc", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!fk", name = "Xc", descriptor = "Lbf;")
    public static class199 field232 = new class199(50);

    @OriginalMember(owner = "client!fk", name = "Zc", descriptor = "Ldd;")
    public static class132 field234 = new class132();

    @OriginalMember(owner = "client!fk", name = "sc", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!fk", name = "vc", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!fk", name = "xc", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!fk", name = "yc", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!fk", name = "Ec", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!fk", name = "Fc", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!fk", name = "Mc", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!fk", name = "Nc", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!fk", name = "Oc", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!fk", name = "Qc", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!fk", name = "Rc", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!fk", name = "Sc", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!fk", name = "Tc", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!fk", name = "Wc", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!fk", name = "Yc", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!fk", name = "Ac", descriptor = "Lqk;")
    public class207 field209;

    @OriginalMember(owner = "client!fk", name = "Uc", descriptor = "Lej;")
    public class49 field229;

    @OriginalMember(owner = "client!fk", name = "ad", descriptor = "[I")
    public static int[] field235;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class232.field4262 = arg2;
        class25.field531 = arg4;
        if (arg1 <= -22) {
            ++field214;
            class237.field4373 = arg0;
            class137.field2369 = arg5;
            class55.field1034 = arg3;
            if (class237.field4373 >= 100) {
                int var6 = class25.field531 * 128 - -64;
                int var7 = class55.field1034 * 128 - -64;
                int var8 = class22.method139(var7, var6, 23979, class93.field1645) - class232.field4262;
                int var9 = var7 - class209.field3702;
                int var10 = var8 - class196.field3443;
                int var11 = -class111.field1939 + var6;
                int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                class228.field4186 = 2047 & (int) (325.949D * Math.atan2((double) var10, (double) var12));
                class101.field1819 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 2047;
                if (class228.field4186 < 128) {
                    class228.field4186 = 128;
                }
                if (class228.field4186 > 383) {
                    class228.field4186 = 383;
                }
            }
            class132.field2290 = 2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
    public final int method80() {
        ++field213;
        return super.field5018;
    }

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field221;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field207;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIIII)V")
    public static final void method82(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 116) {
            method86((byte) 46);
        }
        ++field225;
        if (~arg3 == ~arg4) {
            class227.method1620(103, arg2, arg0, arg5, arg3);
        } else if (~class124.field2158 >= ~(-arg3 + arg2) && class88.field1599 >= arg2 + arg3 && ~class204.field3580 >= ~(-arg4 + arg5) && ~class204.field3602 <= ~(arg4 + arg5)) {
            class187.method1302(false, arg3, arg2, arg4, arg5, arg0);
        } else {
            class62.method455(arg3, arg0, arg5, 1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)I")
    public final int method83(boolean arg0) {
        ++field206;
        if (this.field229 != null && this.field229.field966 != -1) {
            return class212.method1513(this.field229.field966, (byte) 10).field1303;
        } else {
            return !arg0 ? -69 : super.method83(true);
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method84(int arg0) {
        ++field228;
        Container var1;
        if (class126.field2189 != null) {
            var1 = class126.field2189;
        } else if (class272.field4794 == null) {
            var1 = class20.field326.field4207;
        } else {
            var1 = class272.field4794;
        }
        class182.field3246 = var1.getSize().width;
        class215.field3821 = var1.getSize().height;
        if (class272.field4794 == var1) {
            Insets var2 = class272.field4794.getInsets();
            class182.field3246 -= var2.right + var2.left;
            class215.field3821 -= var2.top + var2.bottom;
        }
        if (arg0 > 111) {
            if (class262.method1813(7) >= 2) {
                class107.field1906 = 0;
                class244.field4428 = class215.field3821;
                class17.field267 = 0;
                class31.field625 = class182.field3246;
            } else {
                class244.field4428 = 503;
                class107.field1906 = 0;
                class17.field267 = (class182.field3246 + -765) / 2;
                class31.field625 = 765;
            }
            class112.field1949.setSize(class31.field625, class244.field4428);
            if (class272.field4794 != var1) {
                class112.field1949.setLocation(class17.field267, class107.field1906);
            } else {
                Insets var3 = class272.field4794.getInsets();
                class112.field1949.setLocation(class17.field267 + var3.left, class107.field1906 + var3.top);
            }
            if (class165.field2915 != -1) {
                class202.method1404(-19680, true);
            }
            class106.method764((byte) 108);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)I")
    public final int method85(boolean arg0) {
        ++field222;
        if (arg0) {
            field212 = -27;
        }
        return super.field5107;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public static void method86(byte arg0) {
        field234 = null;
        field198 = null;
        if (arg0 != 124) {
            field232 = null;
        }
        field232 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        ++field227;
        if (this.field229 != null) {
            class65 var13 = super.field5052 != -1 && super.field5103 == 0 ? class16.method101((byte) 70, super.field5052) : null;
            class65 var14 = ~super.field5039 == 0 || this.field202 || super.field5039 == this.method1947(9).field3539 && var13 != null ? null : class16.method101((byte) 49, super.field5039);
            class166 var15 = this.field229.method366(super.field5076, super.field5081, true, var14, super.field5077, super.field5065, super.field5047, super.field5069, super.field5026, 202667960, var13);
            int var16 = class1.method5((byte) 95);
            if (~class225.field4107 != -1 && var16 < 50) {
                int var17 = -var16 + 50;
                while (~var17 < ~class191.field3375) {
                    class10.field144[class191.field3375] = new byte[102400];
                    ++class191.field3375;
                }
                while (var17 < class191.field3375) {
                    --class191.field3375;
                    class10.field144[class191.field3375] = null;
                }
            }
            if (var15 != null) {
                super.field5018 = var15.method80();
                if (class230.field4214 && (this.field229.field966 == -1 || class212.method1513(this.field229.field966, (byte) 10).field1289)) {
                    class166 var18 = class135.method942(arg0, super.field5072, 0, (byte) -7, 0, 1, 160, var14 == null ? var13 : var14, super.field5104, super.field5053, var14 == null ? super.field5069 : super.field5077, 240, var15, super.field5037);
                    var18.method87(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class64) null);
                }
                if (class202.field3565 == this) {
                    for (int var19 = class170.field3025.length - 1; ~var19 <= -1; --var19) {
                        class156 var20 = class170.field3025[var19];
                        if (var20 != null && ~var20.field2746 != 0) {
                            if (~var20.field2749 == -2 && var20.field2740 >= 0 && var20.field2740 < class79.field1449.length) {
                                class256 var21 = class79.field1449[var20.field2740];
                                if (var21 != null) {
                                    int var22 = var21.field5104 / 32 + -(class202.field3565.field5104 / 32);
                                    int var23 = var21.field5072 / 32 - class202.field3565.field5072 / 32;
                                    this.method89(arg7, arg9, var23, var15, arg0, (class64) null, var22, arg2, arg3, arg4, var20.field2746, arg6, 0, arg5, arg1);
                                }
                            }
                            if (~var20.field2749 == -3) {
                                int var24 = (-class21.field349 + var20.field2756) * 4 + -(class202.field3565.field5104 / 32) + 2;
                                int var25 = (-class180.field3231 + var20.field2732) * 4 + (2 - class202.field3565.field5072 / 32);
                                this.method89(arg7, arg9, var25, var15, arg0, (class64) null, var24, arg2, arg3, arg4, var20.field2746, arg6, 0, arg5, arg1);
                            }
                            if (~var20.field2749 == -11 && var20.field2740 >= 0 && var20.field2740 < class169.field2953.length) {
                                class14 var26 = class169.field2953[var20.field2740];
                                if (var26 != null) {
                                    int var27 = var26.field5104 / 32 + -(class202.field3565.field5104 / 32);
                                    int var28 = var26.field5072 / 32 + -(class202.field3565.field5072 / 32);
                                    this.method89(arg7, arg9, var28, var15, arg0, (class64) null, var27, arg2, arg3, arg4, var20.field2746, arg6, 0, arg5, arg1);
                                }
                            }
                        }
                    }
                }
                this.method1944(var15, 78);
                this.method1953(arg0, var15, -1);
                class166 var29 = null;
                if (!this.field202 && ~super.field5105 != 0 && ~super.field5080 != 0) {
                    class234 var30 = class165.method1192(super.field5105, -112);
                    var29 = var30.method1673(super.field5080, 45, super.field5012, super.field5088);
                    if (var29 != null) {
                        var29.method274(0, -super.field5096, 0);
                        if (var30.field4322) {
                            if (class212.field3771 != 0) {
                                var29.method281(class212.field3771);
                            }
                            if (~class26.field537 != -1) {
                                var29.method267(class26.field537);
                            }
                            if (~class162.field2865 != -1) {
                                var29.method274(0, class162.field2865, 0);
                            }
                        }
                    }
                }
                class166 var31 = null;
                if (!this.field202 && super.field5068 != null) {
                    if (~super.field5010 >= ~class160.field2844) {
                        super.field5068 = null;
                    }
                    if (~super.field5021 >= ~class160.field2844 && class160.field2844 < super.field5010) {
                        if (super.field5068 instanceof class232) {
                            var31 = (class166) ((class232) super.field5068).method1663(-46);
                        } else {
                            var31 = (class166) super.field5068;
                        }
                        var31.method274(-super.field5104 + super.field5031, super.field5094 - super.field5053, -super.field5072 + super.field5036);
                        if (super.field5098 != 512) {
                            if (~super.field5098 != -1025) {
                                if (~super.field5098 == -1537) {
                                    var31.method285();
                                }
                            } else {
                                var31.method295();
                            }
                        } else {
                            var31.method273();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class37) var15).method297(var29);
                }
                if (var31 != null) {
                    var15 = ((class37) var15).method297(var31);
                }
                var15.field2926 = true;
                var15.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field5093);
                if (var31 != null) {
                    if (super.field5098 == 512) {
                        var31.method285();
                    } else if (super.field5098 != 1024) {
                        if (~super.field5098 == -1537) {
                            var31.method273();
                        }
                    } else {
                        var31.method295();
                    }
                    var31.method274(-super.field5031 + super.field5104, -super.field5094 + super.field5053, super.field5072 - super.field5036);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZII)V")
    public final void method88(byte arg0, boolean arg1, int arg2, int arg3) {
        super.method1951(arg1, this.method83(true), arg2, arg3, 120);
        if (arg0 != -99) {
            this.method87(-21, -113, 91, -39, 109, 59, 7, -117, 83L, -91, (class64) null);
        }
        ++field231;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILba;ILe;IIIIIIIII)V")
    private final void method89(int arg0, int arg1, int arg2, class166 arg3, int arg4, class64 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        ++field233;
        int var16 = arg2 * arg2 + arg6 * arg6;
        if (var16 >= 16 && ~var16 >= -360001) {
            int var17 = (int) (325.949D * Math.atan2((double) arg6, (double) arg2)) & 2047;
            class166 var18 = class73.method530(true, arg3, var17, super.field5053, super.field5072, arg10, super.field5104);
            if (arg12 != 0) {
                method84(-37);
            }
            if (var18 != null) {
                var18.method87(0, arg14, arg7, arg8, arg9, arg13, arg11, arg0, -1L, arg1, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Z")
    public final boolean method90(byte arg0) {
        ++field226;
        int var2 = -127 % ((arg0 - -55) / 40);
        return this.field229 != null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILv;)V")
    public final void method91(int arg0, class149 arg1) {
        arg1.field2593 = 0;
        int var3 = arg1.method1045((byte) 93);
        ++field204;
        boolean var4 = (var3 & 4) != 0;
        int var5 = var3 & arg0;
        int var6 = super.method83(true);
        this.method1948(100, (var3 >> 3 & 7) + 1);
        this.field211 = (var3 & 204) >> 6;
        int[] var7 = new int[12];
        super.field5104 += 64 * (this.method83(true) - var6);
        super.field5072 += (-var6 + this.method83(true)) * 64;
        this.field199 = arg1.method1084((byte) 49);
        this.field216 = arg1.method1084((byte) 49);
        this.field208 = 0;
        int var8 = -1;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method1045((byte) -22);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method1045((byte) 78);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var8 = arg1.method1050(arg0 ^ 1272006569);
                    this.field208 = arg1.method1045((byte) 110);
                    break;
                }
                if (var12 >= 32768) {
                    int var24 = class163.field2884[var12 + -32768];
                    var7[var9] = class281.method1906(var24, 1073741824);
                    int var25 = class117.method829(var24, (byte) 100).field3062;
                    if (var25 != 0) {
                        this.field208 = var25;
                    }
                } else {
                    var7[var9] = class281.method1906(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var23 = arg1.method1045((byte) -116);
            if (var23 < 0 || ~var23 <= ~class106.field1887[var14].length) {
                var23 = 0;
            }
            var13[var14] = var23;
        }
        super.field5107 = arg1.method1050(1272006568);
        long var15 = arg1.method1043(false);
        this.field209 = class21.method125(102, var15).method1423(124);
        this.field224 = arg1.method1045((byte) 99);
        if (var4) {
            this.field200 = arg1.method1050(1272006568);
            this.field205 = this.field224;
            this.field203 = -1;
        } else {
            this.field200 = 0;
            this.field205 = arg1.method1045((byte) -64);
            this.field203 = arg1.method1045((byte) -101);
            if (~this.field203 == -256) {
                this.field203 = -1;
            }
        }
        int var17 = this.field219;
        this.field219 = arg1.method1045((byte) 87);
        if (this.field219 == 0) {
            class149.method1036(this, -69);
        } else {
            int var18 = this.field210;
            int var19 = this.field217;
            int var20 = this.field230;
            int var21 = this.field218;
            this.field217 = arg1.method1050(1272006568);
            this.field210 = arg1.method1050(1272006568);
            this.field230 = arg1.method1050(1272006568);
            this.field218 = arg1.method1050(1272006568);
            if (~this.field219 != ~var17 || ~this.field217 != ~var19 || ~this.field210 != ~var18 || ~this.field230 != ~var20 || this.field218 != var21) {
                class90.method653(-15716, this);
            }
        }
        if (this.field229 == null) {
            this.field229 = new class49();
        }
        int var22 = this.field229.field966;
        this.field229.method365(super.field5107, 10, var13, var7, var5 == 1, var8);
        if (var8 != var22) {
            super.field5104 = super.field5022[0] * 128 + this.method83(true) * 64;
            super.field5072 = super.field5074[0] * 128 - -(this.method83(true) * 64);
        }
        if (super.field5093 != null) {
            super.field5093.method464();
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(Z)Lqk;")
    public final class207 method92(boolean arg0) {
        if (arg0) {
            field215 = 110;
        }
        ++field201;
        class207 var2 = this.field209;
        if (class10.field142 != null) {
            var2 = class105.method757(false, new class207[] { class10.field142[this.field211], var2 });
        }
        if (class128.field2225 != null) {
            var2 = class105.method757(arg0, new class207[] { var2, class128.field2225[this.field211] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
    public static final int method93(int arg0, int arg1) {
        if (arg0 != -15079) {
            field220 = 49;
        }
        ++field223;
        return arg1 & 255;
    }
}
