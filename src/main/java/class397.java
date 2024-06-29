import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class397 extends class462 {

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Lrn;")
    public static class174 field5999 = new class174(11, -1);

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "Lnj;")
    public static class161 field5996;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BB)Z")
    public static final boolean method2449(byte[] arg0, byte arg1) {
        if (arg1 != -99) {
            field5999 = null;
        }
        ++field5989;
        class145 var2 = new class145(arg0);
        int var3 = var2.method1063((byte) 119);
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = ~var2.method1063((byte) -75) == -2;
            if (var4) {
                class93.method716(-122, var2);
            }
            class348.method2208(var2, arg1 ^ 65437);
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
    public static void method2450(int arg0) {
        if (arg0 != -10138) {
            method2455(104, -1, -120, 37);
        }
        field5999 = null;
        field5996 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBII)V")
    public final void method1413(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -5) {
            this.method1411(-0.42574328F, false);
        }
        ++field5995;
        super.field6920 = arg0;
        super.field6910 = arg2;
        super.field6912 = arg3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2451(String arg0, byte arg1) {
        class66.field1138 = arg0;
        if (arg1 > -48) {
            method2451((String) null, (byte) 92);
        }
        ++field5994;
        if (class368.field5553.field4170 != null) {
            try {
                String var2 = class368.field5553.field4170.getParameter("cookieprefix");
                String var3 = class368.field5553.field4170.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg0.length() == -1) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class140.method1046(class211.method1419(12921) - -94608000000L, 123) + "; Max-Age=" + 94608000L;
                }
                class512.method3063("document.cookie=\"" + var5 + "\"", class368.field5553.field4170, (byte) 77);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Leg;IIIII)V")
    public static final void method2452(class69 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5993;
        if (arg0.field1190 != -1 || arg0.field1200 != null) {
            int var6 = 0;
            int var7 = class443.field6623.field607 * arg0.field1203 >> 8;
            if (~arg0.field1183 <= ~arg3) {
                if (arg3 < arg0.field1187) {
                    var6 += -arg3 + arg0.field1187;
                }
            } else {
                var6 += arg3 - arg0.field1183;
            }
            int var8 = 92 / ((33 - arg1) / 61);
            if (arg2 > arg0.field1202) {
                var6 += arg2 - arg0.field1202;
            } else if (~arg2 > ~arg0.field1198) {
                var6 += -arg2 + arg0.field1198;
            }
            if (arg0.field1204 != 0 && var6 + -64 <= arg0.field1204 && class443.field6623.field607 != 0 && ~arg0.field1182 == ~arg5) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var9 = (arg0.field1204 - var6) * var7 / arg0.field1204;
                if (arg0.field1181 != null) {
                    arg0.field1181.method2946(var9);
                } else if (arg0.field1190 >= 0) {
                    class133 var10 = class133.method990(class209.field3017, arg0.field1190, 0);
                    if (var10 != null) {
                        class189 var11 = var10.method989().method1324(class21.field426);
                        class493 var12 = class493.method2933(var11, 100, var9);
                        var12.method2948(-1);
                        class45.field837.method2039(var12);
                        arg0.field1181 = var12;
                    }
                }
                if (arg0.field1186 == null) {
                    if (arg0.field1200 != null && (arg0.field1180 -= arg4) <= 0) {
                        int var13 = (int) ((double) arg0.field1200.length * Math.random());
                        class133 var14 = class133.method990(class209.field3017, arg0.field1200[var13], 0);
                        if (var14 != null) {
                            class189 var15 = var14.method989().method1324(class21.field426);
                            class493 var16 = class493.method2933(var15, 100, var9);
                            var16.method2948(0);
                            class45.field837.method2039(var16);
                            arg0.field1180 = arg0.field1184 + (int) ((double) (-arg0.field1184 + arg0.field1196) * Math.random());
                            arg0.field1186 = var16;
                            return;
                        }
                    }
                } else {
                    arg0.field1186.method2946(var9);
                    if (arg0.field1186.method2091((byte) -124)) {
                        return;
                    }
                    arg0.field1186 = null;
                }
            } else {
                if (arg0.field1181 != null) {
                    class45.field837.method2035(arg0.field1181);
                    arg0.field1181 = null;
                }
                if (arg0.field1186 != null) {
                    class45.field837.method2035(arg0.field1186);
                    arg0.field1186 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIF)V")
    public class397(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)I")
    public static final int method2453(int arg0, int arg1, int arg2) {
        if (arg1 != -2) {
            return 77;
        } else {
            ++field5990;
            return arg0 != 4 && ~arg0 != -6 ? 256 : class440.field6578[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
    public static final void method2454(int arg0, boolean arg1) {
        ++field5991;
        class452.field6759 = 0;
        class260.field3785 = 0;
        class169.method1237(1);
        int var2 = -28 / ((53 - arg0) / 45);
        class247.method1602((byte) -31, arg1);
        class260.method1681(128);
        for (int var3 = 0; var3 < class260.field3785; ++var3) {
            int var5 = class250.field3586[var3];
            if (class531.field7821 != class34.field668[var5].field7632) {
                if (class34.field668[var5].field3677.method416(-24707)) {
                    class66.method553(class34.field668[var5], -867418649);
                }
                class34.field668[var5].method1648(-96, (class42) null);
                class34.field668[var5] = null;
            }
        }
        if (~class34.field666 != ~class92.field1573.field2289) {
            throw new RuntimeException("gnp1 pos:" + class92.field1573.field2289 + " psize:" + class34.field666);
        } else {
            for (int var4 = 0; class510.field7529 > var4; ++var4) {
                if (class34.field668[class148.field2363[var4]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class510.field7529);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(FZ)V")
    public final void method1411(float arg0, boolean arg1) {
        super.field6916 = arg0;
        if (!arg1) {
            method2455(-110, -28, 80, -59);
        }
        ++field5997;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)I")
    public static final int method2455(int arg0, int arg1, int arg2, int arg3) {
        ++field5998;
        if (~class368.field5569 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class509.field7503 + arg0;
            int var7 = -class509.field7519 + arg3;
            int var8 = 87 % ((58 - arg1) / 46);
            for (class353 var9 = (class353) class509.field7494.method2427(125); var9 != null; var9 = (class353) class509.field7494.method2422(-90)) {
                if (var9.field5397 == arg2) {
                    int var10 = var9.field5402;
                    int var11 = var9.field5396;
                    int var12 = class509.field7503 + var10 << 14 | class509.field7519 + var11;
                    int var13 = (var7 - var11) * (-var11 + var7) + (-var10 + var6) * (-var10 + var6);
                    if (~var4 > -1 || var5 > var13) {
                        var5 = var13;
                        var4 = var12;
                    }
                }
            }
            return var4;
        }
    }
}
