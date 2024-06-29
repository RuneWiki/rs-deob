import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class300 {

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Lfba;")
    public static class27 field4327 = new class27(45, 3);

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "Lbu;")
    public static class21 field4332 = new class21(68, 6);

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
    public static int field4335 = 0;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4336 = new String[100];

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "Lne;")
    public static class336 field4326;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "[Lkw;")
    public static class261[] field4334;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "[[B")
    public static byte[][] field4333;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class513 var5 = (class513) class488.field6903.method1731((byte) -112); var5 != null; var5 = (class513) class488.field6903.method1724(0)) {
            class297.method1930(arg1, 81, arg0, arg2, arg4, var5);
        }
        field4330++;
        for (class513 var6 = (class513) class376.field5192.method1731((byte) -119); var6 != null; var6 = (class513) class376.field5192.method1724(0)) {
            byte var12 = 1;
            class539 var13 = var6.field7248.method2096(0);
            if (var6.field7248.field4659 == -1 || var6.field7248.field4615) {
                var12 = 0;
            } else if (var6.field7248.field4659 == var13.field7770 || var6.field7248.field4659 == var13.field7776 || var6.field7248.field4659 == var13.field7765 || var6.field7248.field4659 == var13.field7777) {
                var12 = 2;
            } else if (var6.field7248.field4659 == var13.field7783 || var6.field7248.field4659 == var13.field7740 || var6.field7248.field4659 == var13.field7753 || var6.field7248.field4659 == var13.field7769) {
                var12 = 3;
            }
            if (var6.field7237 != var12) {
                int var14 = class48.method339(var6.field7248, true);
                class110 var15 = var6.field7248.field9240;
                if (var15.field1657 != null) {
                    var15 = var15.method840(class537.field7727, -49);
                }
                if (var15 == null || var14 == -1) {
                    var6.field7266 = -1;
                    var6.field7237 = var12;
                    var6.field7244 = false;
                } else if (var6.field7266 == var14 && var6.field7244 == var15.field1625) {
                    var6.field7237 = var12;
                    var6.field7234 = var15.field1647;
                } else {
                    boolean var16 = false;
                    if (var6.field7236 == null) {
                        var16 = true;
                    } else {
                        var6.field7234 -= 512;
                        if (var6.field7234 <= 0) {
                            class184.field2828.method426(var6.field7236);
                            var6.field7236 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field7244 = var15.field1625;
                        var6.field7238 = null;
                        var6.field7237 = var12;
                        var6.field7266 = var14;
                        var6.field7234 = var15.field1647;
                        var6.field7240 = null;
                    }
                }
            }
            var6.field7256 = var6.field7248.field5742;
            var6.field7262 = var6.field7248.field5742 + (var6.field7248.method2102(true) << 8);
            var6.field7264 = var6.field7248.field5746;
            var6.field7258 = var6.field7248.field5746 + (var6.field7248.method2102(true) << 8);
            class297.method1930(arg1, -115, arg0, arg2, arg4, var6);
        }
        if (arg3 != 3) {
            method1942(-111, -126, 85, 79, 107);
        }
        for (class513 var7 = (class513) class585.field8269.method2243((byte) 100); var7 != null; var7 = (class513) class585.field8269.method2248(-15690)) {
            byte var8 = 1;
            class539 var9 = var7.field7257.method2096(0);
            if (var7.field7257.field4659 == -1 || var7.field7257.field4615) {
                var8 = 0;
            } else if (var7.field7257.field4659 == var9.field7770 || var7.field7257.field4659 == var9.field7776 || var7.field7257.field4659 == var9.field7765 || var7.field7257.field4659 == var9.field7777) {
                var8 = 2;
            } else if (var7.field7257.field4659 == var9.field7783 || var7.field7257.field4659 == var9.field7740 || var7.field7257.field4659 == var9.field7753 || var7.field7257.field4659 == var9.field7769) {
                var8 = 3;
            }
            if (var7.field7237 != var8) {
                int var10 = class680.method3854(false, var7.field7257);
                if (var7.field7266 == var10 && var7.field7257.field9759 == var7.field7244) {
                    var7.field7237 = var8;
                    var7.field7234 = var7.field7257.field9782;
                } else {
                    boolean var11 = false;
                    if (var7.field7236 == null) {
                        var11 = true;
                    } else {
                        var7.field7234 -= 512;
                        if (var7.field7234 <= 0) {
                            class184.field2828.method426(var7.field7236);
                            var7.field7236 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field7240 = null;
                        var7.field7234 = var7.field7257.field9782;
                        var7.field7266 = var10;
                        var7.field7237 = var8;
                        var7.field7238 = null;
                        var7.field7244 = var7.field7257.field9759;
                    }
                }
            }
            var7.field7256 = var7.field7257.field5742;
            var7.field7262 = var7.field7257.field5742 + (var7.field7257.method2102(true) << 8);
            var7.field7264 = var7.field7257.field5746;
            var7.field7258 = var7.field7257.field5746 + (var7.field7257.method2102(true) << 8);
            class297.method1930(arg1, arg3 ^ 0x6A, arg0, arg2, arg4, var7);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIB)I", line = 181)
    public static final int method1943(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        field4329++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg2;
        } else {
            int var5 = 88 / ((-arg3 - 25) / 45);
            return var4 == 2 ? 4095 - arg0 : arg2;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILso;)Lgr;", line = 202)
    public static final class457 method1944(int arg0, class494 arg1) {
        if (arg0 < 79) {
            method1944(39, null);
        }
        field4331++;
        int var2 = arg1.method2976(-125);
        return new class457(var2);
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(IIIII)V", line = 216)
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4328++;
        int var5 = class549.field7888;
        int var6 = class82.field905;
        if (class195.field2997) {
            var5 += class493.method2933((byte) -59);
            var6 += class242.method1613(8220);
        }
        if (class548.field7880 == 1) {
            class241 var7 = class652.field9096[class749.field10366 / 100];
            var7.method1604(var5 - 8, var6 + -8);
            class33.method272(var5 - 8, var6 + -8, (var6 + var7.method1505()) - 8, false, var7.method1507() + var5 - 8);
        }
        if (arg3 != 100) {
            return;
        }
        if (class548.field7880 == 2) {
            class241 var8 = class652.field9096[(class749.field10366 / 100) + 4];
            var8.method1604(var5 - 8, var6 - 8);
            class33.method272(var5 - 8, var6 + -8, var8.method1505() + var6 - 8, false, var5 + var8.method1507() - 8);
        }
        class476.method2829(false);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 262)
    public static void method1946(int arg0) {
        field4336 = null;
        field4334 = null;
        field4326 = null;
        field4333 = null;
        field4332 = null;
        field4327 = null;
        if (arg0 != 8) {
            field4336 = null;
        }
    }
}
