import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class2 extends class76 {

    @OriginalMember(owner = "client!ab", name = "Ic", descriptor = "Lae;")
    private static class6 field4 = class64.method474(124, "purple:");

    @OriginalMember(owner = "client!ab", name = "Jc", descriptor = "Lae;")
    public static class6 field5 = class64.method474(111, "redstone1");

    @OriginalMember(owner = "client!ab", name = "Sc", descriptor = "Lae;")
    public static class6 field14 = class64.method474(119, "(U5");

    @OriginalMember(owner = "client!ab", name = "Hc", descriptor = "Lae;")
    public static class6 field3 = class64.method474(107, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ab", name = "Vc", descriptor = "Lae;")
    public static class6 field17 = field4;

    @OriginalMember(owner = "client!ab", name = "Wc", descriptor = "Lae;")
    public static class6 field18 = class64.method474(113, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ab", name = "Nc", descriptor = "Lbd;")
    public static class12 field9 = new class12(64);

    @OriginalMember(owner = "client!ab", name = "bd", descriptor = "[Lde;")
    public static class26[] field23 = new class26[14];

    @OriginalMember(owner = "client!ab", name = "cd", descriptor = "Lae;")
    private static class6 field24 = class64.method474(112, "Accept trade");

    @OriginalMember(owner = "client!ab", name = "ed", descriptor = "Lae;")
    public static class6 field26 = field24;

    @OriginalMember(owner = "client!ab", name = "Yc", descriptor = "Lae;")
    public static class6 field20 = class64.method474(109, " hat sich eingeloggt)3");

    @OriginalMember(owner = "client!ab", name = "Zc", descriptor = "Lje;")
    public static class61 field21 = new class61();

    @OriginalMember(owner = "client!ab", name = "Rc", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ab", name = "Uc", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ab", name = "Xc", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ab", name = "Gc", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ab", name = "fd", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "Kc", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ab", name = "Lc", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ab", name = "Mc", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ab", name = "Pc", descriptor = "Lqc;")
    public class100 field11;

    @OriginalMember(owner = "client!ab", name = "ad", descriptor = "Lva;")
    public static class128 field22;

    @OriginalMember(owner = "client!ab", name = "Qc", descriptor = "Lbd;")
    public static class12 field12;

    @OriginalMember(owner = "client!ab", name = "Oc", descriptor = "Lbf;")
    public static class14 field10;

    @OriginalMember(owner = "client!ab", name = "Tc", descriptor = "Lbb;")
    public static class9 field15;

    @OriginalMember(owner = "client!ab", name = "dd", descriptor = "[I")
    public static int[] field25;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)Lv;", line = 11)
    public final class131 method3(boolean arg0) {
        ++field13;
        if (this.field11 == null) {
            return null;
        } else {
            class85 var2 = super.field1744 != -1 && super.field1787 == 0 ? class35.method314(super.field1744, (byte) 54) : null;
            if (!arg0) {
                method11((byte) -57);
            }
            class85 var3 = super.field1785 == -1 || super.field1800 == super.field1785 && var2 != null ? null : class35.method314(super.field1785, (byte) 54);
            class131 var4 = this.field11.method846(super.field1740, 65535, var3, var2, super.field1788);
            if (var4 == null) {
                return null;
            } else {
                var4.method1062();
                super.field1790 = var4.field954;
                if (~super.field1746 != 0 && super.field1754 != -1) {
                    class131 var5 = class69.method500(0, super.field1746).method1098(180, super.field1754);
                    if (var5 != null) {
                        class131[] var6 = new class131[] { var4, var5 };
                        var5.method1074(0, -super.field1768, 0);
                        var4 = new class131(var6, 2, true);
                    }
                }
                if (this.field11.field2347 == 1) {
                    var4.field3188 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)Lae;", line = 57)
    public static final class6 method4(int arg0, boolean arg1, int arg2) {
        if (arg0 != 10) {
            method8(-15);
        }
        ++field8;
        return class79.method682(arg1, 10, arg0 ^ -67, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field19;
        for (class96 var5 = (class96) class7.field155.method798(false); var5 != null; var5 = (class96) class7.field155.method792((byte) -87)) {
            if (~var5.field2287 != 0 || var5.field2268 != null) {
                int var7 = 0;
                if (~var5.field2292 <= ~arg2) {
                    if (var5.field2286 > arg2) {
                        var7 += -arg2 + var5.field2286;
                    }
                } else {
                    var7 += -var5.field2292 + arg2;
                }
                if (~var5.field2288 <= ~arg3) {
                    if (var5.field2281 > arg3) {
                        var7 += -arg3 + var5.field2281;
                    }
                } else {
                    var7 += -var5.field2288 + arg3;
                }
                if (~(var7 + -64) >= ~var5.field2301 && class14.field301 != 0 && ~var5.field2276 == ~arg4) {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var5.field2301 - var7) * class14.field301 / var5.field2301;
                    if (var5.field2270 != null) {
                        var5.field2270.method820(var8);
                    } else if (var5.field2287 >= 0) {
                        class99 var9 = class99.method833(class68.field1499, var5.field2287, 0);
                        if (var9 != null) {
                            class55 var10 = var9.method834().method422(class32.field776);
                            class97 var11 = class97.method821(var10, 100, var8);
                            var11.method825(-1);
                            class4.field35.method172(var11);
                            var5.field2270 = var11;
                        }
                    }
                    if (var5.field2295 != null) {
                        var5.field2295.method820(var8);
                        if (!var5.field2295.method814()) {
                            var5.field2295 = null;
                        }
                    } else if (var5.field2268 != null && (var5.field2296 -= arg1) <= 0) {
                        int var12 = (int) (Math.random() * (double) var5.field2268.length);
                        class99 var13 = class99.method833(class68.field1499, var5.field2268[var12], 0);
                        if (var13 != null) {
                            class55 var14 = var13.method834().method422(class32.field776);
                            class97 var15 = class97.method821(var14, 100, var8);
                            var15.method825(0);
                            class4.field35.method172(var15);
                            var5.field2295 = var15;
                            var5.field2296 = var5.field2280 + (int) ((double) (-var5.field2280 + var5.field2293) * Math.random());
                        }
                    }
                } else {
                    if (var5.field2270 != null) {
                        class4.field35.method175(var5.field2270);
                        var5.field2270 = null;
                    }
                    if (var5.field2295 != null) {
                        class4.field35.method175(var5.field2295);
                        var5.field2295 = null;
                    }
                }
            }
        }
        int var6 = 39 / ((arg0 - -25) / 33);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Lae;", line = 204)
    public static final class6 method6(int arg0, int arg1) {
        ++field16;
        return arg0 < arg1 ? class114.method942((byte) 71, arg0) : class38.field878;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)I", line = 218)
    public static int method7(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V", line = 227)
    public static void method8(int arg0) {
        field21 = null;
        field24 = null;
        field9 = null;
        field17 = null;
        field4 = null;
        field18 = null;
        field10 = null;
        field5 = null;
        int var1 = 61 / ((arg0 - -37) / 43);
        field26 = null;
        field20 = null;
        field12 = null;
        field22 = null;
        field14 = null;
        field23 = null;
        field25 = null;
        field3 = null;
        field15 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z", line = 257)
    public final boolean method9(byte arg0) {
        ++field27;
        if (arg0 != -77) {
            field23 = null;
        }
        return this.field11 != null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V", line = 274)
    public static final void method10(byte arg0) {
        if (arg0 > -114) {
            method10((byte) 14);
        }
        class82.field2017 = true;
        class71.field1596 = true;
        ++field2;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V", line = 302)
    public static final void method11(byte arg0) {
        if (class95.field2262 != null) {
            class95.field2262.method207(arg0 ^ 2067);
        }
        if (arg0 != -127) {
            method11((byte) 36);
        }
        ++field6;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZI)Z", line = 336)
    public static final boolean method12(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7;
        int var4 = (arg0 & 536870031) >> 14;
        int var5 = class81.field1967.method524(class15.field305, arg1, arg3, arg0);
        if (~var5 == 0) {
            return false;
        } else if (arg2) {
            return false;
        } else {
            int var6 = var5 >> 6 & 3;
            int var7 = 31 & var5;
            if (var7 != 10 && var7 != 11 && ~var7 != -23) {
                class43.method358(24134, var7 + 1, arg3, var6, 2, 0, 0, true, 0, class12.field229.field1796[0], class12.field229.field1726[0], arg1);
            } else {
                class107 var8 = class80.method687(var4, (byte) 60);
                int var9;
                int var10;
                if (~var6 != -1 && ~var6 != -3) {
                    var9 = var8.field2546;
                    var10 = var8.field2516;
                } else {
                    var10 = var8.field2546;
                    var9 = var8.field2516;
                }
                int var11 = var8.field2556;
                if (~var6 != -1) {
                    var11 = (var11 >> -var6 + 4) + (var11 << var6 & 15);
                }
                class43.method358(24134, 0, arg3, 0, 2, var9, var10, true, var11, class12.field229.field1796[0], class12.field229.field1726[0], arg1);
            }
            class75.field1687 = class116.field2728;
            class7.field161 = 2;
            class43.field1003 = 0;
            class35.field827 = class52.field1170;
            return true;
        }
    }
}
