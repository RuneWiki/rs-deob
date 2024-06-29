import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class89 {

    @OriginalMember(owner = "client!ba", name = "Vc", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "client!ba", name = "Xc", descriptor = "Lkd;")
    public static class73 field293 = class126.method1070((byte) -66, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ba", name = "cd", descriptor = "Lkd;")
    public static class73 field298 = class126.method1070((byte) -66, "");

    @OriginalMember(owner = "client!ba", name = "dd", descriptor = "Lkd;")
    public static class73 field299 = field298;

    @OriginalMember(owner = "client!ba", name = "Wc", descriptor = "Lkd;")
    private static class73 field292 = class126.method1070((byte) -66, "Loading config )2 ");

    @OriginalMember(owner = "client!ba", name = "bd", descriptor = "Lkd;")
    public static class73 field297 = field292;

    @OriginalMember(owner = "client!ba", name = "qd", descriptor = "Lkd;")
    public static class73 field312 = field298;

    @OriginalMember(owner = "client!ba", name = "ld", descriptor = "Lkd;")
    private static class73 field307 = class126.method1070((byte) -66, "New User");

    @OriginalMember(owner = "client!ba", name = "td", descriptor = "Lkd;")
    public static class73 field315 = field298;

    @OriginalMember(owner = "client!ba", name = "ad", descriptor = "Lkd;")
    public static class73 field296 = field298;

    @OriginalMember(owner = "client!ba", name = "md", descriptor = "I")
    public static int field308 = 1;

    @OriginalMember(owner = "client!ba", name = "rd", descriptor = "Lkd;")
    public static class73 field313 = field307;

    @OriginalMember(owner = "client!ba", name = "Uc", descriptor = "Lkd;")
    public static class73 field290 = field298;

    @OriginalMember(owner = "client!ba", name = "pd", descriptor = "I")
    public static int field311 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!ba", name = "id", descriptor = "Lkd;")
    public static class73 field304 = field298;

    @OriginalMember(owner = "client!ba", name = "nd", descriptor = "Lkd;")
    public static class73 field309 = field298;

    @OriginalMember(owner = "client!ba", name = "ud", descriptor = "Lkd;")
    public static class73 field316 = field298;

    @OriginalMember(owner = "client!ba", name = "Zc", descriptor = "Ljb;")
    public static class64 field295 = new class64(200);

    @OriginalMember(owner = "client!ba", name = "Yc", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ba", name = "ed", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ba", name = "gd", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ba", name = "hd", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ba", name = "jd", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ba", name = "kd", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ba", name = "od", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ba", name = "sd", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ba", name = "vd", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ba", name = "fd", descriptor = "Ldf;")
    public class28 field301;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
    public static final void method85(int arg0) {
        ++field305;
        if (~class80.field2025 != -1) {
            class46 var1 = class109.field2688;
            int var2 = 0;
            if (class53.field1424 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (class76.field1952[var3] != null) {
                    int var4 = class110.field2702[var3];
                    byte var5 = 0;
                    class73 var6 = class18.field530[var3];
                    if (var6 != null && var6.method642(-68, class131.field3284)) {
                        var6 = var6.method638(5, 126);
                        var5 = 1;
                    }
                    if (var6 != null && var6.method642(124, class42.field1122)) {
                        var5 = 2;
                        var6 = var6.method638(5, -70);
                    }
                    if ((var4 == 3 || var4 == 7) && (~var4 == -8 || class25.field711 == 0 || class25.field711 == 1 && class115.method978(108, var6))) {
                        int var7 = 329 - var2 * 13;
                        byte var8 = 4;
                        var1.method355(class133.field3357, var8, var7 + -1, 65535, 0);
                        ++var2;
                        int var9 = var8 + var1.method357(class133.field3357);
                        int var10 = var9 + var1.method363(32);
                        if (~var5 == -2) {
                            class83.field2080[0].method208(var10, var7 + -12);
                            var10 += 14;
                        }
                        if (var5 == 2) {
                            class83.field2080[1].method208(var10, var7 + -12);
                            var10 += 14;
                        }
                        var1.method355(class32.method258(-72, new class73[] { var6, class133.field3355, class76.field1952[var3] }), var10, var7 + -1, 65535, 0);
                        if (~var2 <= -6) {
                            return;
                        }
                    }
                    if (var4 == 5 && ~class25.field711 > -3) {
                        int var11 = -(var2 * 13) + 329;
                        ++var2;
                        var1.method355(class76.field1952[var3], 4, var11 + -1, 65535, 0);
                        if (~var2 <= -6) {
                            return;
                        }
                    }
                    if (~var4 == -7 && class25.field711 < 2) {
                        int var12 = 329 - var2 * 13;
                        var1.method355(class32.method258(-86, new class73[] { class129.field3259, class133.field3334, var6, class133.field3355, class76.field1952[var3] }), 4, var12 + -1, 65535, 0);
                        ++var2;
                        if (~var2 <= -6) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 2) {
                field290 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)Lsb;")
    public static final class126 method86(int arg0, byte arg1) {
        ++field300;
        class126 var2 = (class126) class61.field1597.method538(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -115 % ((arg1 - 29) / 32);
            byte[] var4 = class58.field1550.method898((byte) -60, arg0, 10);
            class126 var5 = new class126();
            var5.field3230 = arg0;
            if (var4 != null) {
                var5.method1075((byte) 127, new class114(var4));
            }
            var5.method1065(95);
            if (var5.field3229 != -1) {
                var5.method1063(method86(var5.field3207, (byte) 83), -128, method86(var5.field3229, (byte) -20));
            }
            if (!class77.field1972 && var5.field3201) {
                var5.field3210 = 0;
                var5.field3220 = class141.field3525;
                var5.field3200 = null;
                var5.field3216 = null;
            }
            class61.field1597.method542(var5, -901, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)Z")
    public final boolean method87(byte arg0) {
        ++field306;
        if (this.field301 == null) {
            return false;
        } else {
            int var2 = 123 / ((arg0 - -85) / 33);
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)I")
    public static final int method88(int arg0, int arg1, int arg2, int arg3) {
        ++field294;
        int var4 = arg0 & 3;
        if (~var4 == arg2) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else {
            return var4 == 2 ? -arg1 + 7 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILa;La;II)La;")
    public static final class1 method89(int arg0, class1 arg1, class1 arg2, int arg3, int arg4) {
        ++field317;
        class1 var5 = class104.method835(0, arg0, class120.field3066[arg2.field45 >> 16], arg4, arg2.field63, 0, arg2.field96, arg1, false, arg2.field73, arg2.field45, arg2.field86);
        if (arg3 > -18) {
            method86(11, (byte) -41);
        }
        if (var5 != null) {
            return var5;
        } else {
            if (arg2.field126 != null) {
                var5 = class104.method835(0, arg0, arg2.field126, arg4, arg2.field63, 0, arg2.field96, arg1, false, arg2.field73, arg2.field45, arg2.field86);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        ++field314;
        if (this.field301 == null) {
            return null;
        } else {
            class36 var2 = super.field2284 != -1 && super.field2241 == 0 ? class94.method782(-24669, super.field2284) : null;
            class36 var3 = super.field2245 == -1 || super.field2258 == super.field2245 && var2 != null ? null : class94.method782(-24669, super.field2245);
            class91 var4 = this.field301.method220(super.field2282, super.field2232, var2, 2, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method755();
                super.field2236 = var4.field514;
                if (~super.field2301 != 0 && super.field2262 != -1) {
                    class91 var5 = class72.method603(super.field2301, arg0 ^ -11801).method1037((byte) -126, super.field2262);
                    if (var5 != null) {
                        var5.method760(0, -super.field2248, 0);
                        class91[] var6 = new class91[] { var4, var5 };
                        var4 = new class91(var6, 2);
                    }
                }
                if (~this.field301.field800 == -2) {
                    var4.field2306 = true;
                }
                if (arg0 != 11800) {
                    this.method87((byte) -101);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)V")
    public static void method91(byte arg0) {
        field299 = null;
        field313 = null;
        field297 = null;
        field293 = null;
        field298 = null;
        field295 = null;
        if (arg0 != -114) {
            field312 = null;
        }
        field315 = null;
        field296 = null;
        field304 = null;
        field290 = null;
        field316 = null;
        field307 = null;
        field292 = null;
        field312 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Lkd;")
    public static final class73 method92(int arg0, int arg1) {
        ++field310;
        if (arg0 != -4628) {
            field307 = null;
        }
        return arg1 < 999999999 ? class78.method676(arg1, -55) : class105.field2623;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIZ)I")
    public static final int method93(int arg0, int arg1, boolean arg2) {
        ++field302;
        if (arg2) {
            method93(75, -12, true);
        }
        int var3 = class82.method696(arg0 + 45365, -17803, 4, arg1 + 91923) - 128 - (-(-128 + class82.method696(arg0 - -10294, -17803, 2, arg1 + 37821) >> 1) - (class82.method696(arg0, -17803, 1, arg1) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) - -35;
        if (var4 < 10) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }
}
