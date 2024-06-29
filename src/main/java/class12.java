import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class12 extends class62 {

    @OriginalMember(owner = "client!hd", name = "tc", descriptor = "I")
    public int field218 = -1;

    @OriginalMember(owner = "client!hd", name = "vc", descriptor = "I")
    public int field220 = -1;

    @OriginalMember(owner = "client!hd", name = "Bc", descriptor = "I")
    public int field226 = -1;

    @OriginalMember(owner = "client!hd", name = "wc", descriptor = "I")
    public int field221 = -1;

    @OriginalMember(owner = "client!hd", name = "Dc", descriptor = "I")
    public int field228 = 255;

    @OriginalMember(owner = "client!hd", name = "qc", descriptor = "I")
    public int field215 = 0;

    @OriginalMember(owner = "client!hd", name = "zc", descriptor = "I")
    public int field224 = 0;

    @OriginalMember(owner = "client!hd", name = "Cc", descriptor = "I")
    public int field227 = -1;

    @OriginalMember(owner = "client!hd", name = "yc", descriptor = "Z")
    public boolean field223 = false;

    @OriginalMember(owner = "client!hd", name = "Nc", descriptor = "I")
    public int field238 = 0;

    @OriginalMember(owner = "client!hd", name = "Uc", descriptor = "B")
    private byte field245 = 0;

    @OriginalMember(owner = "client!hd", name = "Tc", descriptor = "I")
    public int field244 = 0;

    @OriginalMember(owner = "client!hd", name = "Oc", descriptor = "I")
    public int field239 = -1;

    @OriginalMember(owner = "client!hd", name = "Zc", descriptor = "I")
    public int field250 = -1;

    @OriginalMember(owner = "client!hd", name = "Yc", descriptor = "I")
    public int field249 = 0;

    @OriginalMember(owner = "client!hd", name = "sc", descriptor = "[Z")
    public static boolean[] field217 = new boolean[5];

    @OriginalMember(owner = "client!hd", name = "Pc", descriptor = "[Ljava/lang/String;")
    public static String[] field240 = new String[100];

    @OriginalMember(owner = "client!hd", name = "Ec", descriptor = "[I")
    public static int[] field229 = new int[50];

    @OriginalMember(owner = "client!hd", name = "rc", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!hd", name = "uc", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!hd", name = "Ac", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!hd", name = "Gc", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!hd", name = "Ic", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!hd", name = "Jc", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!hd", name = "Kc", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!hd", name = "Lc", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!hd", name = "Mc", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!hd", name = "Rc", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!hd", name = "Sc", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!hd", name = "Vc", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!hd", name = "Wc", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!hd", name = "Xc", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!hd", name = "Hc", descriptor = "Lwa;")
    public class280 field232;

    @OriginalMember(owner = "client!hd", name = "xc", descriptor = "Ljava/lang/String;")
    public String field222;

    @OriginalMember(owner = "client!hd", name = "Fc", descriptor = "Z")
    public static boolean field230;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(Z)V")
    public static final void method92(boolean arg0) {
        if (class226.field3554 < 128.0F) {
            class226.field3554 = 128.0F;
        }
        if (class226.field3554 > 383.0F) {
            class226.field3554 = 383.0F;
        }
        int var1 = class256.field4219 >> 7;
        while (class114.field1742 >= 2048.0F) {
            class114.field1742 -= 2048.0F;
        }
        while (class114.field1742 < 0.0F) {
            class114.field1742 += 2048.0F;
        }
        ++field236;
        int var2 = class288.field4687 >> 7;
        int var3 = class60.method387(-18796, class288.field4687, class256.field4219, class214.field3389);
        int var4 = 0;
        if (~var1 < -4 && ~var2 < -4 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 + -4; ~(var1 + 4) <= ~var5; ++var5) {
                for (int var6 = var2 + -4; var2 - -4 >= var6; ++var6) {
                    int var7 = class214.field3389;
                    if (~var7 > -4 && (class214.field3386[1][var5][var6] & 2) == 2) {
                        ++var7;
                    }
                    int var8 = (class54.field789[var7][var5][var6] & 255) * 8 + -class166.field2746[var7][var5][var6] + var3;
                    if (~var4 > ~var8) {
                        var4 = var8;
                    }
                }
            }
        }
        if (arg0) {
            method93(false);
        }
        int var9 = var4 * 192;
        if (~var9 < -98049) {
            var9 = 98048;
        }
        if (~var9 > -32769) {
            var9 = 32768;
        }
        if (class221.field3477 < var9) {
            class221.field3477 += (-class221.field3477 + var9) / 24;
        } else if (var9 < class221.field3477) {
            class221.field3477 += (-class221.field3477 + var9) / 80;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(Z)V")
    public static void method93(boolean arg0) {
        if (arg0) {
            field217 = null;
            field229 = null;
            field240 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILha;IILga;IIIIIIIIIII)V")
    private final void method94(int arg0, class32 arg1, int arg2, int arg3, class181 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        ++field219;
        int var17 = arg6 * arg6 + arg11 * arg11;
        if (~var17 <= -17 && arg5 >= var17) {
            if (arg7 != 64) {
                this.field220 = -54;
            }
            int var18 = (int) (Math.atan2((double) arg6, (double) arg11) * 325.949D) & 2047;
            class32 var19 = class302.method2062((byte) 55, super.field964, arg15, arg1, var18, super.field994, super.field929);
            if (var19 != null) {
                var19.method27(0, arg14, arg13, arg0, arg3, arg2, arg10, arg8, -1L, arg9, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class181 arg10) {
        ++field234;
        if (this.field232 != null) {
            class91 var13 = super.field900 != -1 && super.field973 == 0 ? class159.method1085((byte) -63, super.field900) : null;
            class254 var14 = this.method403((byte) 82);
            boolean var15 = ~var14.field4181 != -1 || ~var14.field4190 != -1 || var14.field4170 != 0 || ~var14.field4167 != -1;
            class91 var16 = super.field947 == -1 || this.field223 || super.field947 == this.method403((byte) 125).field4180 && var13 != null ? null : class159.method1085((byte) -63, super.field947);
            class32 var17 = this.field232.method1905(super.field992, super.field951, super.field986, super.field984, super.field934, super.field915, var15, var16, var13, -1592297808, true, super.field961);
            int var18 = class83.method597(38);
            if (class215.field3395 != 0 && ~var18 > -51) {
                int var19 = -var18 + 50;
                while (var19 > class62.field991) {
                    class111.field1709[class62.field991] = new byte[102400];
                    ++class62.field991;
                }
                while (~var19 > ~class62.field991) {
                    --class62.field991;
                    class111.field1709[class62.field991] = null;
                }
            }
            if (var17 != null) {
                super.field893 = var17.method22();
                if (class277.field4524 && (this.field232.field4554 == -1 || class206.method1422(this.field232.field4554, (byte) 126).field3776)) {
                    class32 var20 = class25.method199(1, super.field964, 0, 120, 240, super.field994, super.field929, var16 != null ? super.field992 : super.field934, super.field948, arg0, 160, var17, 0, var16 != null ? var16 : var13);
                    var20.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class181) null);
                }
                if (class217.field3408 == this) {
                    for (int var21 = class168.field2768.length + -1; ~var21 <= -1; --var21) {
                        class43 var22 = class168.field2768[var21];
                        if (var22 != null && ~var22.field637 != 0) {
                            if (~var22.field638 == -2 && ~var22.field642 <= -1 && ~var22.field642 > ~class131.field2113.length) {
                                class104 var23 = class131.field2113[var22.field642];
                                if (var23 != null) {
                                    int var24 = var23.field994 / 32 - class217.field3408.field994 / 32;
                                    int var25 = var23.field929 / 32 + -(class217.field3408.field929 / 32);
                                    this.method94(arg3, var17, arg5, arg4, (class181) null, 360000, var24, 64, arg7, arg9, arg6, var25, arg0, arg2, arg1, var22.field637);
                                }
                            }
                            if (var22.field638 == 2) {
                                int var26 = (-class145.field2327 + var22.field644) * 4 + -(class217.field3408.field929 / 32) + 2;
                                int var27 = (-class75.field1211 + var22.field641) * 4 + 2 + -(class217.field3408.field994 / 32);
                                int var28 = var22.field636 * 4;
                                int var29 = var28 * var28;
                                this.method94(arg3, var17, arg5, arg4, (class181) null, var29, var27, 64, arg7, arg9, arg6, var26, arg0, arg2, arg1, var22.field637);
                            }
                            if (~var22.field638 == -11 && ~var22.field642 <= -1 && var22.field642 < class28.field494.length) {
                                class12 var30 = class28.field494[var22.field642];
                                if (var30 != null) {
                                    int var31 = var30.field929 / 32 - class217.field3408.field929 / 32;
                                    int var32 = var30.field994 / 32 + -(class217.field3408.field994 / 32);
                                    this.method94(arg3, var17, arg5, arg4, (class181) null, 360000, var32, 64, arg7, arg9, arg6, var31, arg0, arg2, arg1, var22.field637);
                                }
                            }
                        }
                    }
                }
                this.method407(-30443, var17);
                this.method399(arg0, var17, (byte) 105);
                class32 var33 = null;
                if (!this.field223 && ~super.field995 != 0 && super.field911 != -1) {
                    class156 var34 = class166.method1182(1, super.field995);
                    var33 = var34.method1055(true, super.field911, super.field979, super.field919);
                    if (var33 != null) {
                        var33.method19(0, -super.field901, 0);
                        if (var34.field2481) {
                            if (~class95.field1513 != -1) {
                                var33.method30(class95.field1513);
                            }
                            if (~class55.field812 != -1) {
                                var33.method43(class55.field812);
                            }
                            if (~class97.field1524 != -1) {
                                var33.method19(0, class97.field1524, 0);
                            }
                        }
                    }
                }
                class32 var35 = null;
                if (!this.field223 && super.field910 != null) {
                    if (class274.field4472 >= super.field922) {
                        super.field910 = null;
                    }
                    if (~class274.field4472 <= ~super.field938 && ~super.field922 < ~class274.field4472) {
                        if (!(super.field910 instanceof class234)) {
                            var35 = (class32) super.field910;
                        } else {
                            var35 = (class32) ((class234) super.field910).method1617(1);
                        }
                        var35.method19(-super.field994 + super.field959, -super.field964 + super.field920, super.field952 - super.field929);
                        if (super.field963 != 512) {
                            if (~super.field963 != -1025) {
                                if (~super.field963 == -1537) {
                                    var35.method44();
                                }
                            } else {
                                var35.method53();
                            }
                        } else {
                            var35.method29();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class3) var17).method41(var33);
                }
                if (var35 != null) {
                    var17 = ((class3) var17).method41(var35);
                }
                this.method405(var17, 0, var33);
                var17.field532 = true;
                var17.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field917);
                if (var35 != null) {
                    if (super.field963 == 512) {
                        var35.method44();
                    } else if (~super.field963 != -1025) {
                        if (~super.field963 == -1537) {
                            var35.method29();
                        }
                    } else {
                        var35.method53();
                    }
                    var35.method19(-super.field959 + super.field994, super.field964 - super.field920, -super.field952 + super.field929);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)I")
    public final int method95(boolean arg0) {
        ++field216;
        return arg0 ? 64 : super.field897;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -32403) {
            method99(13, -91);
        }
        ++field243;
        if (~arg1 == ~arg3) {
            class157.method1059(arg2, arg6, true, arg7, arg4, arg5, arg3);
        } else if (~(-arg3 + arg7) <= ~class34.field561 && class148.field2371 >= arg7 - -arg3 && class52.field766 <= -arg1 + arg6 && class191.field3112 >= arg1 + arg6) {
            class253.method1712(arg5, arg4, arg1, arg2, arg6, arg7, (byte) -119, arg3);
        } else {
            class214.method1468(1, arg1, arg3, arg7, arg5, arg4, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIII)V")
    public final void method97(boolean arg0, int arg1, int arg2, int arg3) {
        ++field242;
        if (arg1 != 512) {
            method100(73, 60, -81, 59, 78);
        }
        super.method397(arg1 + -17704, arg2, this.method101(false), arg0, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lfj;B)V")
    public final void method98(class274 arg0, byte arg1) {
        ++field246;
        arg0.field4458 = 0;
        int var3 = arg0.method1849(255);
        int var4 = var3 & 1;
        boolean var5 = ~(4 & var3) != -1;
        int var6 = -1;
        int var7 = super.method101(false);
        int[] var8 = new int[12];
        this.method408(7, (7 & var3 >> 3) - -1);
        this.field245 = (byte) ((203 & var3) >> 6);
        super.field994 += 64 * (this.method101(false) - var7);
        super.field929 += (-var7 + this.method101(false)) * 64;
        this.field221 = arg0.method1830((byte) 76);
        this.field220 = arg0.method1830((byte) -128);
        this.field238 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method1849(255);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1849(255);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && var12 == 65535) {
                    var6 = arg0.method1837(252);
                    this.field238 = arg0.method1849(255);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class178.field2953[var12 + -32768];
                    var8[var9] = class76.method555(1073741824, var25);
                    int var26 = class107.method754(-20563, var25).field2584;
                    if (~var26 != -1) {
                        this.field238 = var26;
                    }
                } else {
                    var8[var9] = class76.method555(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg0.method1849(255);
            if (~var24 > -1 || ~var24 <= ~class182.field3024[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field897 = arg0.method1837(252);
        long var15 = arg0.method1834(3);
        this.field222 = class125.method857(var15, (byte) -103);
        this.field224 = arg0.method1849(255);
        if (var5) {
            this.field244 = arg0.method1837(252);
            this.field226 = -1;
            this.field249 = this.field224;
        } else {
            this.field244 = 0;
            this.field249 = arg0.method1849(255);
            this.field226 = arg0.method1849(255);
            if (~this.field226 == -256) {
                this.field226 = -1;
            }
        }
        int var17 = this.field215;
        this.field215 = arg0.method1849(255);
        if (this.field215 != 0) {
            int var18 = this.field218;
            int var19 = this.field227;
            int var20 = this.field250;
            int var21 = this.field239;
            int var22 = this.field228;
            this.field239 = arg0.method1837(252);
            this.field218 = arg0.method1837(252);
            this.field227 = arg0.method1837(252);
            this.field250 = arg0.method1837(252);
            this.field228 = arg0.method1849(255);
            if (~this.field215 != ~var17 || this.field239 != var21 || this.field218 != var18 || this.field227 != var19 || this.field250 != var20 || ~this.field228 != ~var22) {
                class200.method1374(this, -21717);
            }
        } else {
            class48.method316(this, 92);
        }
        if (this.field232 == null) {
            this.field232 = new class280();
        }
        int var23 = this.field232.field4554;
        this.field232.method1911(var8, -26954, super.field897, var6, var4 == 1, var13);
        if (var6 != var23) {
            super.field994 = super.field965[0] * 128 - -(64 * this.method101(false));
            super.field929 = super.field956[0] * 128 - -(64 * this.method101(false));
        }
        if (arg1 >= -23) {
            this.method95(false);
        }
        if (super.field917 != null) {
            super.field917.method1270();
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
    public static final void method99(int arg0, int arg1) {
        class116 var2 = class307.field4991[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class116 var4 = class307.field4991[var3][arg0][arg1] = class307.field4991[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1778;
                for (int var5 = 0; var5 < var4.field1787; ++var5) {
                    class90 var6 = var4.field1782[var5];
                    if ((var6.field1402 >> 29 & 3L) == 2L && var6.field1405 == arg0 && var6.field1407 == arg1) {
                        --var6.field1422;
                    }
                }
            }
        }
        if (class307.field4991[0][arg0][arg1] == null) {
            class307.field4991[0][arg0][arg1] = new class116(0, arg0, arg1);
        }
        class307.field4991[0][arg0][arg1].field1771 = var2;
        class307.field4991[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field237;
        if (arg0 == 5) {
            if (~arg2 >= ~arg4) {
                class309.method2096(arg3, arg4, (byte) -117, class232.field3629[arg1], arg2);
            } else {
                class309.method2096(arg3, arg2, (byte) -117, class232.field3629[arg1], arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)I")
    public final int method101(boolean arg0) {
        ++field233;
        if (this.field232 != null && ~this.field232.field4554 != 0) {
            return class206.method1422(this.field232.field4554, (byte) 49).field3789;
        } else {
            if (arg0) {
                this.method94(-17, (class32) null, -59, -73, (class181) null, -8, -35, -118, -18, 38, -41, -114, 104, 41, 91, 61);
            }
            return super.method101(arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field247;
        if (!super.field941) {
            if (this.field232 == null) {
                return;
            }
            class91 var6 = super.field900 != -1 && ~super.field973 == -1 ? class159.method1085((byte) -63, super.field900) : null;
            class91 var7 = super.field947 == -1 || this.field223 || ~super.field947 == ~this.method403((byte) 114).field4180 && var6 != null ? null : class159.method1085((byte) -63, super.field947);
            class32 var8 = this.field232.method1905(super.field992, super.field951, super.field986, super.field984, super.field934, super.field915, false, var7, var6, -1592297808, false, super.field961);
            if (var8 == null) {
                return;
            }
            this.method405(var8, 0, (class32) null);
        }
        if (super.field917 != null) {
            super.field917.method1275(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()I")
    public final int method22() {
        ++field241;
        return super.field893;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)I")
    public static final int method103(int arg0) {
        ++field248;
        if (arg0 != 25748) {
            method92(true);
        }
        return 6;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
    public final boolean method104(int arg0) {
        ++field225;
        if (this.field232 == null) {
            return false;
        } else {
            return arg0 != -32447 ? true : true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field231;
        if (super.field917 != null) {
            super.field917.method1269();
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method105(int arg0) {
        if (arg0 != -773) {
            field230 = true;
        }
        String var2 = this.field222;
        ++field235;
        if (class184.field3056 != null) {
            var2 = class184.field3056[this.field245] + var2;
        }
        if (class134.field2173 != null) {
            var2 = var2 + class134.field2173[this.field245];
        }
        return var2;
    }
}
