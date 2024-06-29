import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class150 extends class114 {

    @OriginalMember(owner = "client!wb", name = "kc", descriptor = "Lkd;")
    public static class73 field3717 = class126.method1070((byte) -66, "Side panel redrawn");

    @OriginalMember(owner = "client!wb", name = "dc", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!wb", name = "pc", descriptor = "Lkd;")
    public static class73 field3722 = class126.method1070((byte) -66, "null");

    @OriginalMember(owner = "client!wb", name = "qc", descriptor = "Lkd;")
    private static class73 field3723 = class126.method1070((byte) -66, " seconds)3");

    @OriginalMember(owner = "client!wb", name = "bc", descriptor = "[I")
    public static int[] field3708 = new int[50];

    @OriginalMember(owner = "client!wb", name = "Yb", descriptor = "Lkd;")
    public static class73 field3705 = field3723;

    @OriginalMember(owner = "client!wb", name = "lc", descriptor = "Lkd;")
    public static class73 field3718 = class126.method1070((byte) -66, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!wb", name = "uc", descriptor = "Lkd;")
    public static class73 field3727 = class126.method1070((byte) -66, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!wb", name = "ic", descriptor = "Lkd;")
    public static class73 field3715 = class126.method1070((byte) -66, "blaugr-Un:");

    @OriginalMember(owner = "client!wb", name = "Xb", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wb", name = "Zb", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!wb", name = "ac", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wb", name = "cc", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!wb", name = "ec", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!wb", name = "fc", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!wb", name = "gc", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!wb", name = "mc", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wb", name = "oc", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wb", name = "rc", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!wb", name = "sc", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wb", name = "tc", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wb", name = "vc", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!wb", name = "wc", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!wb", name = "xc", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!wb", name = "hc", descriptor = "La;")
    public static class1 field3714;

    @OriginalMember(owner = "client!wb", name = "jc", descriptor = "Lg;")
    public static class43 field3716;

    @OriginalMember(owner = "client!wb", name = "nc", descriptor = "Llb;")
    private class78 field3720;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IB)Lff;")
    public static final class42 method1202(int arg0, byte arg1) {
        int var2 = -68 % ((arg1 - -38) / 57);
        ++field3719;
        class42 var3 = (class42) class63.field1647.method538(0, (long) arg0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class118.field3007.method898((byte) -18, arg0, 8);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method313(6741, new class114(var4));
            }
            class63.field1647.method542(var5, -901, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "(II)I")
    public final int method1203(int arg0, int arg1) {
        ++field3725;
        if (arg1 != 27943) {
            field3718 = null;
        }
        return arg0 * 8 - this.field3706;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmf;Z)V")
    public static final void method1204(class89 arg0, boolean arg1) {
        ++field3728;
        arg0.field2245 = arg0.field2258;
        if (arg0.field2286 == 0) {
            arg0.field2237 = 0;
        } else if (!arg1) {
            if (arg0.field2284 != -1 && arg0.field2241 == 0) {
                class36 var2 = class94.method782(-24669, arg0.field2284);
                if (arg0.field2228 > 0 && ~var2.field972 == -1) {
                    ++arg0.field2237;
                    return;
                }
                if (~arg0.field2228 >= -1 && ~var2.field997 == -1) {
                    ++arg0.field2237;
                    return;
                }
            }
            int var3 = arg0.field2277;
            int var4 = arg0.field2304[arg0.field2286 - 1] * 128 + arg0.field2233 * 64;
            int var5 = arg0.field2264;
            int var6 = arg0.field2280[arg0.field2286 - 1] * 128 - -(arg0.field2233 * 64);
            if (-var3 + var4 <= 256 && -var3 + var4 >= -256 && ~(-var5 + var6) >= -257 && ~(var6 - var5) <= 255) {
                int var7 = arg0.field2260;
                if (~var4 < ~var3) {
                    if (var6 <= var5) {
                        if (var6 < var5) {
                            arg0.field2293 = 1792;
                        } else {
                            arg0.field2293 = 1536;
                        }
                    } else {
                        arg0.field2293 = 1280;
                    }
                } else if (var3 <= var4) {
                    if (var6 <= var5) {
                        if (var6 < var5) {
                            arg0.field2293 = 0;
                        }
                    } else {
                        arg0.field2293 = 1024;
                    }
                } else if (var6 > var5) {
                    arg0.field2293 = 768;
                } else if (~var5 < ~var6) {
                    arg0.field2293 = 256;
                } else {
                    arg0.field2293 = 512;
                }
                int var8 = 2047 & -arg0.field2265 + arg0.field2293;
                boolean var9 = true;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var10 = 4;
                if (~var8 <= 255 && ~var8 >= -257) {
                    var7 = arg0.field2276;
                } else if (~var8 <= -257 && ~var8 > -769) {
                    var7 = arg0.field2261;
                } else if (var8 >= -768 && ~var8 >= 255) {
                    var7 = arg0.field2247;
                }
                if (var7 == -1) {
                    var7 = arg0.field2276;
                }
                arg0.field2245 = var7;
                if (arg0 instanceof class9) {
                    var9 = ((class9) arg0).field301.field827;
                }
                if (var9) {
                    if (~arg0.field2293 != ~arg0.field2265 && arg0.field2266 == -1 && ~arg0.field2223 != -1) {
                        var10 = 2;
                    }
                    if (arg0.field2286 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field2286 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field2237 > 0 && ~arg0.field2286 < -2) {
                        --arg0.field2237;
                        var10 = 8;
                    }
                } else {
                    if (~arg0.field2286 < -2) {
                        var10 = 6;
                    }
                    if (~arg0.field2286 < -3) {
                        var10 = 8;
                    }
                    if (~arg0.field2237 < -1 && ~arg0.field2286 < -2) {
                        --arg0.field2237;
                        var10 = 8;
                    }
                }
                if (arg0.field2231[arg0.field2286 - 1]) {
                    var10 <<= 1;
                }
                if (~var5 <= ~var6) {
                    if (var5 > var6) {
                        arg0.field2264 -= var10;
                        if (~arg0.field2264 > ~var6) {
                            arg0.field2264 = var6;
                        }
                    }
                } else {
                    arg0.field2264 += var10;
                    if (~arg0.field2264 < ~var6) {
                        arg0.field2264 = var6;
                    }
                }
                if (var4 <= var3) {
                    if (~var3 < ~var4) {
                        arg0.field2277 -= var10;
                        if (~arg0.field2277 > ~var4) {
                            arg0.field2277 = var4;
                        }
                    }
                } else {
                    arg0.field2277 += var10;
                    if (var4 < arg0.field2277) {
                        arg0.field2277 = var4;
                    }
                }
                if (~arg0.field2277 == ~var4 && arg0.field2264 == var6) {
                    if (~arg0.field2228 < -1) {
                        --arg0.field2228;
                    }
                    --arg0.field2286;
                }
                if (var10 >= 8 && arg0.field2276 == arg0.field2245 && ~arg0.field2273 != 0) {
                    arg0.field2245 = arg0.field2273;
                }
            } else {
                arg0.field2264 = var6;
                arg0.field2277 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class150(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)V")
    public final void method1205(int arg0) {
        ++field3707;
        this.field3706 = super.field2816 * arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[I)V")
    public final void method1206(int arg0, int[] arg1) {
        this.field3720 = new class78(arg1);
        if (arg0 < 42) {
            this.method1203(60, 108);
        }
        ++field3712;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lq;B)V")
    public static final void method1207(class111 arg0, byte arg1) {
        if (arg1 != -92) {
            field3708 = null;
        }
        class153.field3754 = arg0;
        ++field3704;
    }

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "(B)V")
    public static final void method1208(byte arg0) {
        class31.field864.method247(61);
        if (arg0 <= -89) {
            ++field3729;
            for (int var1 = 0; var1 < 32; ++var1) {
                class47.field1239[var1] = 0L;
            }
            for (int var2 = 0; ~var2 > -33; ++var2) {
                class142.field3550[var2] = 0L;
            }
            class31.field871 = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "(I)V")
    public static final void method1209(int arg0) {
        if (arg0 != 18) {
            method1208((byte) -45);
        }
        class8.field243 = true;
        ++field3730;
        class77.field1971 = true;
    }

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "(B)V")
    public final void method1210(byte arg0) {
        ++field3711;
        if (arg0 != -127) {
            field3710 = -17;
        }
        super.field2816 = (this.field3706 - -7) / 8;
    }

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "(II)I")
    public final int method1211(int arg0, int arg1) {
        ++field3713;
        int var3 = this.field3706 >> 3;
        int var4 = -(this.field3706 & arg1) + 8;
        int var5 = 0;
        this.field3706 += arg0;
        while (var4 < arg0) {
            var5 += (class19.field535[var4] & super.field2880[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field2880[var3] >> var4 - arg0 & class19.field535[arg0]) + var5;
        } else {
            var6 = (class19.field535[var4] & super.field2880[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;ILq;Lq;)V")
    public static final void method1212(Component arg0, int arg1, class111 arg2, class111 arg3) {
        ++field3724;
        if (!class116.field2972) {
            class89.field2297 = class72.method600(arg0, 765, 503, arg1 ^ -30723);
            class89.field2297.method100(true);
            class17.method140();
            byte[] var4 = arg2.method903(-14869, class42.field1131, class84.field2135);
            class77.field1964 = new class106(var4, arg0);
            class111.field2760 = class77.field1964.method849();
            class82.field2061 = class119.method1027(class42.field1131, arg3, class115.field2890, 0);
            class34.field955 = class119.method1027(class42.field1131, arg3, class13.field408, arg1);
            class63.field1656 = class119.method1027(class42.field1131, arg3, class83.field2100, 0);
            class57.field1531 = class3.method20(40, arg3, class62.field1634, class42.field1131);
            class33.field907 = class3.method20(40, arg3, class1.field31, class42.field1131);
            class45.field1186 = new int[256];
            for (int var5 = 0; ~var5 > -65; ++var5) {
                class45.field1186[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                class45.field1186[var6 + 64] = 16711680 - -(var6 * 1024);
            }
            for (int var7 = 0; ~var7 > -65; ++var7) {
                class45.field1186[var7 - -128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                class45.field1186[var8 + 192] = 16777215;
            }
            class53.field1404 = new int[256];
            for (int var9 = 0; ~var9 > -65; ++var9) {
                class53.field1404[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                class53.field1404[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                class53.field1404[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; ~var12 > -65; ++var12) {
                class53.field1404[var12 + 192] = 16777215;
            }
            class52.field1389 = new int[256];
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class52.field1389[var13] = var13 * 4;
            }
            for (int var14 = 0; ~var14 > -65; ++var14) {
                class52.field1389[var14 + 64] = 255 - -(var14 * 262144);
            }
            for (int var15 = 0; ~var15 > -65; ++var15) {
                class52.field1389[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; ~var16 > -65; ++var16) {
                class52.field1389[var16 - -192] = 16777215;
            }
            class119.field3056 = new int[256];
            class70.field1779 = new int[32768];
            class119.field3031 = new int[32768];
            class36.method288(true, (class27) null);
            class34.field945 = false;
            class71.field1816 = 0;
            class42.field1142 = class42.field1131;
            if (~class104.field2600 != -1) {
                class21.field580 = false;
            } else {
                class21.field580 = true;
            }
            class42.field1125 = class42.field1131;
            class119.field3057 = new int[32768];
            class55.field1487 = new int[32768];
            if (class21.field580) {
                class115.method980(2, (byte) -45);
            } else {
                class66.method549(class114.field2876, 2, class87.field2193, arg1 ^ 80, class42.field1131, 255, false);
            }
            class111.method892(-2, false);
            class140.field3479 = true;
            class116.field2972 = true;
            class77.field1964.method841(0, arg1);
            class111.field2760.method841(382, 0);
            class82.field2061.method208(-(class82.field2061.field772 / 2) + 382, 18);
        }
    }

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "(I)I")
    public final int method1213(int arg0) {
        int var2 = 59 % ((6 - arg0) / 45);
        ++field3721;
        return 255 & super.field2880[super.field2816++] + -this.field3720.method674((byte) -110);
    }

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        field3716 = null;
        field3714 = null;
        field3727 = null;
        field3718 = null;
        field3717 = null;
        field3705 = null;
        if (arg0 != 122) {
            method1212((Component) null, 24, (class111) null, (class111) null);
        }
        field3723 = null;
        field3715 = null;
        field3722 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "(II)V")
    public final void method1215(int arg0, int arg1) {
        int var3 = 74 % ((arg0 - 34) / 60);
        super.field2880[super.field2816++] = (byte) (this.field3720.method674((byte) -65) + arg1);
        ++field3709;
    }
}
