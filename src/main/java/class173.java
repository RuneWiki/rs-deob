import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class173 {

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "[I")
    private static int[] field2325 = new int[1000];

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "[[I")
    private static int[][] field2316 = new int[5][5000];

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "[Leha;")
    private static class97[] field2314 = new class97[50];

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    private static int field2304 = 0;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
    private static int field2318 = 0;

    @OriginalMember(owner = "client!tba", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field2327 = new String[1000];

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    private static int field2311 = 0;

    @OriginalMember(owner = "client!tba", name = "A", descriptor = "[I")
    private static int[] field2329 = new int[3];

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "[I")
    private static int[] field2323 = new int[5];

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "[J")
    private static long[] field2328 = new long[1000];

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    private static int field2321 = 0;

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "Ljda;")
    public static class239 field2322 = new class239(4);

    @OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
    private static int field2334 = 0;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!tba", name = "E", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "Lwf;")
    private static class146 field2319;

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "Lhka;")
    private static class56 field2324;

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "Lke;")
    private static class625 field2326;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lor;")
    private static class668 field2305;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "Lor;")
    private static class668 field2308;

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "[I")
    private static int[] field2331;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "[J")
    private static long[] field2307;

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "[Ljava/lang/String;")
    private static String[] field2332;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "()V")
    public static void method1221() {
        field2331 = null;
        field2332 = null;
        field2307 = null;
        field2323 = null;
        field2316 = null;
        field2325 = null;
        field2327 = null;
        field2328 = null;
        field2314 = null;
        field2305 = null;
        field2308 = null;
        field2319 = null;
        field2326 = null;
        field2324 = null;
        field2329 = null;
        field2322 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(C)I")
    private static final int method1222(char arg0) {
        return class668.method3714((byte) 70, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
    private static final void method1223(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field2318 -= 3;
                int var2 = field2325[field2318];
                int var3 = field2325[field2318 + 1];
                int var4 = field2325[field2318 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class668 var5 = class536.method3067(var2, 0);
                if (var5.field9289 == null) {
                    var5.field9289 = new class668[var4 + 1];
                }
                if (var5.field9289.length <= var4) {
                    class668[] var6 = new class668[var4 + 1];
                    for (int var7 = 0; var7 < var5.field9289.length; var7++) {
                        var6[var7] = var5.field9289[var7];
                    }
                    var5.field9289 = var6;
                }
                if (var4 > 0 && var5.field9289[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class668 var8 = new class668();
                var8.field9353 = var3;
                var8.field9336 = var8.field9221 = var5.field9221;
                var8.field9318 = var4;
                var5.field9289[var4] = var8;
                if (arg1) {
                    field2308 = var8;
                } else {
                    field2305 = var8;
                }
                class763.method4242(var5, true);
                return;
            }
            if (arg0 == 151) {
                class668 var9 = arg1 ? field2308 : field2305;
                if (var9.field9318 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class668 var10 = class536.method3067(var9.field9221, 0);
                var10.field9289[var9.field9318] = null;
                class763.method4242(var10, true);
                return;
            }
            if (arg0 == 152) {
                class668 var11 = class536.method3067(field2325[--field2318], 0);
                var11.field9289 = null;
                class763.method4242(var11, true);
                return;
            }
            if (arg0 == 200) {
                field2318 -= 2;
                int var12 = field2325[field2318];
                int var13 = field2325[field2318 + 1];
                class668 var14 = class452.method2690(-4353, var12, var13);
                if (var14 != null && var13 != -1) {
                    field2325[field2318++] = 1;
                    if (arg1) {
                        field2308 = var14;
                        return;
                    }
                    field2305 = var14;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2325[--field2318];
                class668 var16 = class536.method3067(var15, 0);
                if (var16 != null) {
                    field2325[field2318++] = 1;
                    if (arg1) {
                        field2308 = var16;
                        return;
                    }
                    field2305 = var16;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2325[--field2318];
                method1225(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2325[--field2318];
                method1237(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2318 -= 2;
                int var19 = field2325[field2318];
                int var20 = field2325[field2318 + 1];
                if (class551.field7456.field1050 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class415.field5955.length; var21++) {
                    if (class415.field5955[var21] == var19) {
                        class551.field7456.field1050.method3829(var20, class381.field5566, false, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class18.field281.length; var22++) {
                    if (class18.field281[var22] == var19) {
                        class551.field7456.field1050.method3829(var20, class381.field5566, false, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2318 -= 2;
                int var23 = field2325[field2318];
                int var24 = field2325[field2318 + 1];
                if (class551.field7456.field1050 == null) {
                    return;
                }
                class551.field7456.field1050.method3830(var23, (byte) -41, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2325[--field2318] != 0;
                if (class551.field7456.field1050 == null) {
                    return;
                }
                class551.field7456.field1050.method3832(var25, (byte) -54);
                return;
            }
            if (arg0 == 411) {
                field2318 -= 2;
                int var26 = field2325[field2318];
                int var27 = field2325[field2318 + 1];
                if (class551.field7456.field1050 == null) {
                    return;
                }
                class551.field7456.field1050.method3824(class770.field10602, (byte) 65, var26, var27);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class668 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class536.method3067(field2325[--field2318], 0);
            } else {
                var28 = arg1 ? field2308 : field2305;
            }
            if (arg0 == 1000) {
                field2318 -= 4;
                var28.field9225 = field2325[field2318];
                var28.field9328 = field2325[field2318 + 1];
                int var29 = field2325[field2318 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2325[field2318 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field9392 = (byte) var29;
                var28.field9359 = (byte) var30;
                class763.method4242(var28, true);
                class300.method1898(103, var28);
                if (var28.field9318 == -1) {
                    class782.method4330((byte) 72, var28.field9221);
                }
                return;
            }
            if (arg0 == 1001) {
                field2318 -= 4;
                var28.field9223 = field2325[field2318];
                var28.field9270 = field2325[field2318 + 1];
                var28.field9301 = 0;
                var28.field9358 = 0;
                int var31 = field2325[field2318 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2325[field2318 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field9228 = (byte) var31;
                var28.field9286 = (byte) var32;
                class763.method4242(var28, true);
                class300.method1898(122, var28);
                if (var28.field9353 == 0) {
                    class446.method2678(125, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2325[--field2318] == 1;
                if (var28.field9265 != var33) {
                    var28.field9265 = var33;
                    class763.method4242(var28, true);
                }
                if (var28.field9318 == -1) {
                    class572.method3201(var28.field9221, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field2318 -= 2;
                var28.field9366 = field2325[field2318];
                var28.field9219 = field2325[field2318 + 1];
                class763.method4242(var28, true);
                class300.method1898(105, var28);
                if (var28.field9353 == 0) {
                    class446.method2678(123, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field9364 = field2325[--field2318] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class668 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class536.method3067(field2325[--field2318], 0);
            } else {
                var34 = arg1 ? field2308 : field2305;
            }
            if (arg0 == 1100) {
                field2318 -= 2;
                var34.field9374 = field2325[field2318];
                if (var34.field9374 > var34.field9237 - var34.field9282) {
                    var34.field9374 = var34.field9237 - var34.field9282;
                }
                if (var34.field9374 < 0) {
                    var34.field9374 = 0;
                }
                var34.field9247 = field2325[field2318 + 1];
                if (var34.field9247 > var34.field9296 - var34.field9297) {
                    var34.field9247 = var34.field9296 - var34.field9297;
                }
                if (var34.field9247 < 0) {
                    var34.field9247 = 0;
                }
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class10.method82(12, var34.field9221);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field9290 = field2325[--field2318];
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class633.method3547(var34.field9221, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field9330 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1103) {
                var34.field9395 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1104) {
                var34.field9347 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2325[--field2318];
                if (var34.field9277 != var35) {
                    var34.field9277 = var35;
                    class763.method4242(var34, true);
                }
                if (var34.field9318 == -1) {
                    class269.method1754(var34.field9221, 12691);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field9260 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1107) {
                var34.field9281 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1108) {
                var34.field9230 = 1;
                var34.field9348 = field2325[--field2318];
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class602.method3350(var34.field9221, -122);
                }
                return;
            }
            if (arg0 == 1109) {
                field2318 -= 6;
                var34.field9356 = field2325[field2318];
                var34.field9217 = field2325[field2318 + 1];
                var34.field9300 = field2325[field2318 + 2];
                var34.field9299 = field2325[field2318 + 3];
                var34.field9246 = field2325[field2318 + 4];
                var34.field9324 = field2325[field2318 + 5];
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class237.method1538((byte) 116, var34.field9221);
                    class749.method4142(var34.field9221, (byte) 27);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2325[--field2318];
                if (var34.field9218 != var36) {
                    var34.field9218 = var36;
                    var34.field9264 = 0;
                    var34.field9315 = 1;
                    var34.field9323 = 0;
                    class489 var37 = var34.field9218 == -1 ? null : class6.field65.method1034(var34.field9218, 0);
                    if (var37 != null) {
                        class291.method1842(0, var34.field9264, var37);
                    }
                    class763.method4242(var34, true);
                }
                if (var34.field9318 == -1) {
                    class127.method1032(true, var34.field9221);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field9243 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2327[--field2304];
                if (!var38.equals(var34.field9339)) {
                    var34.field9339 = var38;
                    class763.method4242(var34, true);
                }
                if (var34.field9318 == -1) {
                    class229.method1501(3, var34.field9221);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field9302 = field2325[--field2318];
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class606.method3357(var34.field9221, (byte) 81);
                }
                return;
            }
            if (arg0 == 1114) {
                field2318 -= 3;
                var34.field9263 = field2325[field2318];
                var34.field9352 = field2325[field2318 + 1];
                var34.field9321 = field2325[field2318 + 2];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1115) {
                var34.field9254 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1116) {
                var34.field9234 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1117) {
                var34.field9231 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1118) {
                var34.field9354 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1119) {
                var34.field9349 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1120) {
                field2318 -= 2;
                var34.field9237 = field2325[field2318];
                var34.field9296 = field2325[field2318 + 1];
                class763.method4242(var34, true);
                if (var34.field9353 == 0) {
                    class446.method2678(126, false, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field9388 = field2325[--field2318] == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1123) {
                var34.field9324 = field2325[--field2318];
                class763.method4242(var34, true);
                if (var34.field9318 == -1) {
                    class237.method1538((byte) 121, var34.field9221);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2325[--field2318];
                var34.field9284 = var39 == 1;
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1125) {
                field2318 -= 2;
                var34.field9259 = field2325[field2318];
                var34.field9303 = field2325[field2318 + 1];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1126) {
                var34.field9288 = field2325[--field2318];
                class763.method4242(var34, true);
                return;
            }
            if (arg0 == 1127) {
                field2318 -= 2;
                int var40 = field2325[field2318];
                int var41 = field2325[field2318 + 1];
                class486 var42 = class206.field2703.method3905(true, var40);
                if (var42.field6728 != var41) {
                    var34.method3704(var41, (byte) 36, var40);
                    return;
                }
                var34.method3696(false, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2325[--field2318];
                String var44 = field2327[--field2304];
                class486 var45 = class206.field2703.method3905(true, var43);
                if (!var45.field6727.equals(var44)) {
                    var34.method3712(var44, 87, var43);
                    return;
                }
                var34.method3696(false, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field2325[--field2318];
                if ((var34.field9353 == 5 || arg0 != 1129) && (var34.field9353 == 4 || arg0 != 1130)) {
                    if (var34.field9241 != var52) {
                        var34.field9241 = var52;
                        class763.method4242(var34, true);
                    }
                    if (var34.field9318 == -1) {
                        class192.method1320(var34.field9221, (byte) 80);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field2318 -= 3;
                int var46 = field2325[field2318];
                short var47 = (short) field2325[field2318 + 1];
                short var48 = (short) field2325[field2318 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method3698(var46, var48, (byte) -82, var47);
                    class763.method4242(var34, true);
                    if (var34.field9318 == -1) {
                        class305.method1934(var34.field9221, (byte) 125, var46);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field2318 -= 3;
                int var49 = field2325[field2318];
                short var50 = (short) field2325[field2318 + 1];
                short var51 = (short) field2325[field2318 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method3711(var49, var51, false, var50);
                    class763.method4242(var34, true);
                    if (var34.field9318 == -1) {
                        class457.method2708(var34.field9221, var49, (byte) 85);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class668 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class536.method3067(field2325[--field2318], 0);
            } else {
                var53 = arg1 ? field2308 : field2305;
            }
            class763.method4242(var53, true);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2318 -= 2;
                int var54 = field2325[field2318];
                int var55 = field2325[field2318 + 1];
                if (var53.field9318 == -1) {
                    class520.method3007(var53.field9221, (byte) -115);
                    class237.method1538((byte) -102, var53.field9221);
                    class749.method4142(var53.field9221, (byte) 50);
                }
                if (var54 == -1) {
                    var53.field9230 = 1;
                    var53.field9348 = -1;
                    var53.field9283 = -1;
                    return;
                }
                var53.field9283 = var54;
                var53.field9343 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field9275 = true;
                } else {
                    var53.field9275 = false;
                }
                class322 var56 = class770.field10602.method2467(-123, var54);
                var53.field9300 = var56.field4660;
                var53.field9299 = var56.field4623;
                var53.field9246 = var56.field4633;
                var53.field9356 = var56.field4651;
                var53.field9217 = var56.field4684;
                var53.field9324 = var56.field4675;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field9268 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field9268 = 1;
                } else {
                    var53.field9268 = 2;
                }
                if (var53.field9301 > 0) {
                    var53.field9324 = var53.field9324 * 32 / var53.field9301;
                    return;
                }
                if (var53.field9223 > 0) {
                    var53.field9324 = var53.field9324 * 32 / var53.field9223;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field9230 = 2;
                var53.field9348 = field2325[--field2318];
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -124);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field9230 = 3;
                var53.field9348 = -1;
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -127);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field9230 = 6;
                var53.field9348 = field2325[--field2318];
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -126);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field9230 = 5;
                var53.field9348 = field2325[--field2318];
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -127);
                }
                return;
            }
            if (arg0 == 1206) {
                field2318 -= 4;
                var53.field9327 = field2325[field2318];
                var53.field9340 = field2325[field2318 + 1];
                var53.field9279 = field2325[field2318 + 2];
                var53.field9244 = field2325[field2318 + 3];
                class763.method4242(var53, true);
                return;
            }
            if (arg0 == 1207) {
                field2318 -= 2;
                var53.field9278 = field2325[field2318];
                var53.field9253 = field2325[field2318 + 1];
                class763.method4242(var53, true);
                return;
            }
            if (arg0 == 1210) {
                field2318 -= 4;
                var53.field9348 = field2325[field2318];
                var53.field9273 = field2325[field2318 + 1];
                if (field2325[field2318 + 2] == 1) {
                    var53.field9230 = 9;
                } else {
                    var53.field9230 = 8;
                }
                if (field2325[field2318 + 3] == 1) {
                    var53.field9275 = true;
                } else {
                    var53.field9275 = false;
                }
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -127);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field9230 = 5;
                var53.field9348 = class363.field5292;
                var53.field9273 = 0;
                if (var53.field9318 == -1) {
                    class602.method3350(var53.field9221, -122);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class668 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class536.method3067(field2325[--field2318], 0);
            } else {
                var57 = arg1 ? field2308 : field2305;
            }
            if (arg0 == 1300) {
                int var58 = field2325[--field2318] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method3703(field2327[--field2304], (byte) -14, var58);
                    return;
                }
                field2304--;
                return;
            }
            if (arg0 == 1301) {
                field2318 -= 2;
                int var59 = field2325[field2318];
                int var60 = field2325[field2318 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field9369 = null;
                    return;
                }
                var57.field9369 = class452.method2690(-4353, var59, var60);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field2325[--field2318];
                if (class453.field6298 != var61 && class326.field4746 != var61 && class4.field45 != var61) {
                    return;
                }
                var57.field9233 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field9319 = field2325[--field2318];
                return;
            }
            if (arg0 == 1304) {
                var57.field9386 = field2325[--field2318];
                return;
            }
            if (arg0 == 1305) {
                var57.field9397 = field2327[--field2304];
                return;
            }
            if (arg0 == 1306) {
                var57.field9312 = field2327[--field2304];
                return;
            }
            if (arg0 == 1307) {
                var57.field9256 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field9314 = field2325[--field2318];
                var57.field9304 = field2325[--field2318];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field2325[--field2318];
                int var63 = field2325[--field2318];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method3708(var62, var63 - 1, 5964);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field9305 = field2327[--field2304];
                return;
            }
            if (arg0 == 1311) {
                var57.field9370 = field2325[--field2318];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field2318 -= 3;
                    var64 = field2325[field2318] - 1;
                    var65 = field2325[field2318 + 1];
                    var66 = field2325[field2318 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2318 -= 2;
                    var64 = 10;
                    var65 = field2325[field2318];
                    var66 = field2325[field2318 + 1];
                }
                if (var57.field9235 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field9235 = new byte[11];
                    var57.field9394 = new byte[11];
                    var57.field9391 = new int[11];
                }
                var57.field9235[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field9341 = false;
                    for (int var67 = 0; var67 < var57.field9235.length; var67++) {
                        if (var57.field9235[var67] != 0) {
                            var57.field9341 = true;
                            break;
                        }
                    }
                } else {
                    var57.field9341 = true;
                }
                var57.field9394[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field9346 = field2325[--field2318];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class668 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class536.method3067(field2325[--field2318], 0);
            } else {
                var68 = arg1 ? field2308 : field2305;
            }
            if (arg0 == 1499) {
                var68.method3707(-121);
                return;
            }
            String var69 = field2327[--field2304];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field2325[--field2318];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field2325[--field2318];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field2327[--field2304];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field2328[--field2311]);
                } else {
                    var72[var73] = Integer.valueOf(field2325[--field2318]);
                }
            }
            int var74 = field2325[--field2318];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field9344 = var72;
            } else if (arg0 == 1401) {
                var68.field9294 = var72;
            } else if (arg0 == 1402) {
                var68.field9311 = var72;
            } else if (arg0 == 1403) {
                var68.field9240 = var72;
            } else if (arg0 == 1404) {
                var68.field9285 = var72;
            } else if (arg0 == 1405) {
                var68.field9293 = var72;
            } else if (arg0 == 1406) {
                var68.field9236 = var72;
            } else if (arg0 == 1407) {
                var68.field9325 = var72;
                var68.field9258 = var70;
            } else if (arg0 == 1408) {
                var68.field9361 = var72;
            } else if (arg0 == 1409) {
                var68.field9250 = var72;
            } else if (arg0 == 1410) {
                var68.field9248 = var72;
            } else if (arg0 == 1411) {
                var68.field9367 = var72;
            } else if (arg0 == 1412) {
                var68.field9292 = var72;
            } else if (arg0 == 1414) {
                var68.field9355 = var72;
                var68.field9227 = var70;
            } else if (arg0 == 1415) {
                var68.field9332 = var72;
                var68.field9322 = var70;
            } else if (arg0 == 1416) {
                var68.field9222 = var72;
            } else if (arg0 == 1417) {
                var68.field9379 = var72;
            } else if (arg0 == 1418) {
                var68.field9308 = var72;
            } else if (arg0 == 1419) {
                var68.field9384 = var72;
            } else if (arg0 == 1420) {
                var68.field9382 = var72;
            } else if (arg0 == 1421) {
                var68.field9338 = var72;
            } else if (arg0 == 1422) {
                var68.field9376 = var72;
            } else if (arg0 == 1423) {
                var68.field9381 = var72;
            } else if (arg0 == 1424) {
                var68.field9232 = var72;
            } else if (arg0 == 1425) {
                var68.field9266 = var72;
            } else if (arg0 == 1426) {
                var68.field9337 = var72;
            } else if (arg0 == 1427) {
                var68.field9350 = var72;
            } else if (arg0 == 1428) {
                var68.field9267 = var72;
                var68.field9262 = var70;
            } else if (arg0 == 1429) {
                var68.field9375 = var72;
                var68.field9280 = var70;
            } else if (arg0 == 1430) {
                var68.field9239 = var72;
            } else if (arg0 == 1431) {
                var68.field9331 = var72;
            } else if (arg0 == 1432) {
                var68.field9310 = var72;
            }
            var68.field9326 = true;
            return;
        } else if (arg0 < 1600) {
            class668 var75 = arg1 ? field2308 : field2305;
            if (arg0 == 1500) {
                field2325[field2318++] = var75.field9242;
                return;
            }
            if (arg0 == 1501) {
                field2325[field2318++] = var75.field9257;
                return;
            }
            if (arg0 == 1502) {
                field2325[field2318++] = var75.field9282;
                return;
            }
            if (arg0 == 1503) {
                field2325[field2318++] = var75.field9297;
                return;
            }
            if (arg0 == 1504) {
                field2325[field2318++] = var75.field9265 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field2325[field2318++] = var75.field9336;
                return;
            }
            if (arg0 == 1506) {
                class668 var76 = class749.method4140(1, var75);
                field2325[field2318++] = var76 == null ? -1 : var76.field9221;
                return;
            }
        } else if (arg0 < 1700) {
            class668 var77 = arg1 ? field2308 : field2305;
            if (arg0 == 1600) {
                field2325[field2318++] = var77.field9374;
                return;
            }
            if (arg0 == 1601) {
                field2325[field2318++] = var77.field9247;
                return;
            }
            if (arg0 == 1602) {
                field2327[field2304++] = var77.field9339;
                return;
            }
            if (arg0 == 1603) {
                field2325[field2318++] = var77.field9237;
                return;
            }
            if (arg0 == 1604) {
                field2325[field2318++] = var77.field9296;
                return;
            }
            if (arg0 == 1605) {
                field2325[field2318++] = var77.field9324;
                return;
            }
            if (arg0 == 1606) {
                field2325[field2318++] = var77.field9300;
                return;
            }
            if (arg0 == 1607) {
                field2325[field2318++] = var77.field9246;
                return;
            }
            if (arg0 == 1608) {
                field2325[field2318++] = var77.field9299;
                return;
            }
            if (arg0 == 1609) {
                field2325[field2318++] = var77.field9395;
                return;
            }
            if (arg0 == 1610) {
                field2325[field2318++] = var77.field9356;
                return;
            }
            if (arg0 == 1611) {
                field2325[field2318++] = var77.field9217;
                return;
            }
            if (arg0 == 1612) {
                field2325[field2318++] = var77.field9277;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field2325[--field2318];
                class486 var79 = class206.field2703.method3905(true, var78);
                if (var79.method2825(0)) {
                    field2327[field2304++] = var77.method3700(var78, var79.field6727, -96);
                    return;
                }
                field2325[field2318++] = var77.method3695(var79.field6728, var78, (byte) 82);
                return;
            }
            if (arg0 == 1614) {
                field2325[field2318++] = var77.field9260;
                return;
            }
            if (arg0 == 2614) {
                field2325[field2318++] = var77.field9230 == 1 ? var77.field9348 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class668 var80 = arg1 ? field2308 : field2305;
            if (arg0 == 1700) {
                field2325[field2318++] = var80.field9283;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field9283 != -1) {
                    field2325[field2318++] = var80.field9343;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field2325[field2318++] = var80.field9318;
                return;
            }
        } else if (arg0 < 1900) {
            class668 var81 = arg1 ? field2308 : field2305;
            if (arg0 == 1800) {
                field2325[field2318++] = client.method2022(var81).method839(0);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field2325[--field2318];
                int var383 = var82 - 1;
                if (var81.field9256 != null && var383 < var81.field9256.length && var81.field9256[var383] != null) {
                    field2327[field2304++] = var81.field9256[var383];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field9397 == null) {
                    field2327[field2304++] = "";
                    return;
                }
                field2327[field2304++] = var81.field9397;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class668 var381;
            if (arg0 >= 2000) {
                var381 = class536.method3067(field2325[--field2318], 0);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field2308 : field2305;
            }
            if (field2334 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field9350 == null) {
                    return;
                }
                class12 var382 = new class12();
                var382.field190 = var381;
                var382.field186 = var381.field9350;
                var382.field187 = field2334 + 1;
                class374.field5403.method2545(-127, var382);
                return;
            }
        } else if (arg0 < 2600) {
            class668 var83 = class536.method3067(field2325[--field2318], 0);
            if (arg0 == 2500) {
                field2325[field2318++] = var83.field9242;
                return;
            }
            if (arg0 == 2501) {
                field2325[field2318++] = var83.field9257;
                return;
            }
            if (arg0 == 2502) {
                field2325[field2318++] = var83.field9282;
                return;
            }
            if (arg0 == 2503) {
                field2325[field2318++] = var83.field9297;
                return;
            }
            if (arg0 == 2504) {
                field2325[field2318++] = var83.field9265 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field2325[field2318++] = var83.field9336;
                return;
            }
            if (arg0 == 1506) {
                class668 var84 = class749.method4140(1, var83);
                field2325[field2318++] = var84 == null ? -1 : var84.field9221;
                return;
            }
        } else if (arg0 < 2700) {
            class668 var85 = class536.method3067(field2325[--field2318], 0);
            if (arg0 == 2600) {
                field2325[field2318++] = var85.field9374;
                return;
            }
            if (arg0 == 2601) {
                field2325[field2318++] = var85.field9247;
                return;
            }
            if (arg0 == 2602) {
                field2327[field2304++] = var85.field9339;
                return;
            }
            if (arg0 == 2603) {
                field2325[field2318++] = var85.field9237;
                return;
            }
            if (arg0 == 2604) {
                field2325[field2318++] = var85.field9296;
                return;
            }
            if (arg0 == 2605) {
                field2325[field2318++] = var85.field9324;
                return;
            }
            if (arg0 == 2606) {
                field2325[field2318++] = var85.field9300;
                return;
            }
            if (arg0 == 2607) {
                field2325[field2318++] = var85.field9246;
                return;
            }
            if (arg0 == 2608) {
                field2325[field2318++] = var85.field9299;
                return;
            }
            if (arg0 == 2609) {
                field2325[field2318++] = var85.field9395;
                return;
            }
            if (arg0 == 2610) {
                field2325[field2318++] = var85.field9356;
                return;
            }
            if (arg0 == 2611) {
                field2325[field2318++] = var85.field9217;
                return;
            }
            if (arg0 == 2612) {
                field2325[field2318++] = var85.field9277;
                return;
            }
            if (arg0 == 2613) {
                field2325[field2318++] = var85.field9260;
                return;
            }
            if (arg0 == 2614) {
                field2325[field2318++] = var85.field9230 == 1 ? var85.field9348 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class668 var86 = class536.method3067(field2325[--field2318], 0);
                field2325[field2318++] = var86.field9283;
                return;
            }
            if (arg0 == 2701) {
                class668 var87 = class536.method3067(field2325[--field2318], 0);
                if (var87.field9283 != -1) {
                    field2325[field2318++] = var87.field9343;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field2325[--field2318];
                class237 var89 = (class237) class609.field8283.method3953((long) var88, 14);
                if (var89 != null) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class668 var90 = class536.method3067(field2325[--field2318], 0);
                if (var90.field9289 == null) {
                    field2325[field2318++] = 0;
                    return;
                }
                int var91 = var90.field9289.length;
                for (int var92 = 0; var92 < var90.field9289.length; var92++) {
                    if (var90.field9289[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field2325[field2318++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field2318 -= 2;
                int var93 = field2325[field2318];
                int var94 = field2325[field2318 + 1];
                class237 var95 = (class237) class609.field8283.method3953((long) var93, 14);
                if (var95 != null && var95.field3202 == var94) {
                    field2325[field2318++] = 1;
                    return;
                } else {
                    field2325[field2318++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class668 var96 = class536.method3067(field2325[--field2318], 0);
            if (arg0 == 2800) {
                field2325[field2318++] = client.method2022(var96).method839(0);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field2325[--field2318];
                int var384 = var97 - 1;
                if (var96.field9256 != null && var384 < var96.field9256.length && var96.field9256[var384] != null) {
                    field2327[field2304++] = var96.field9256[var384];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field9397 == null) {
                    field2327[field2304++] = "";
                    return;
                }
                field2327[field2304++] = var96.field9397;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field2327[--field2304];
                class494.method2867((byte) 51, var98);
                return;
            }
            if (arg0 == 3101) {
                field2318 -= 2;
                class237.method1530(class551.field7456, field2325[field2318], field2325[field2318 + 1], -1);
                return;
            }
            if (arg0 == 3103) {
                class436.method2632(true, (byte) 81);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field2327[--field2304];
                int var100 = 0;
                if (class732.method4062(var99, 0)) {
                    var100 = class334.method2123(1, var99);
                }
                field2320++;
                class267 var101 = class545.method3099((byte) 106, class269.field3966, class468.field6485);
                var101.field3938.method2354(var100, (byte) 127);
                class617.method3392(var101, true);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field2327[--field2304];
                field2312++;
                class267 var103 = class545.method3099((byte) 104, class269.field3966, class720.field10032);
                var103.field3938.method2380(65280, var102.length() + 1);
                var103.field3938.method2349(107, var102);
                class617.method3392(var103, true);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field2327[--field2304];
                field2317++;
                class267 var105 = class545.method3099((byte) 43, class269.field3966, class555.field7482);
                var105.field3938.method2380(65280, var104.length() + 1);
                var105.field3938.method2349(103, var104);
                class617.method3392(var105, true);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field2325[--field2318];
                String var107 = field2327[--field2304];
                class697.method3845(var106, 89, var107);
                return;
            }
            if (arg0 == 3108) {
                field2318 -= 3;
                int var108 = field2325[field2318];
                int var109 = field2325[field2318 + 1];
                int var110 = field2325[field2318 + 2];
                class668 var111 = class536.method3067(var110, 0);
                class261.method1725(var109, var108, var111, 119);
                return;
            }
            if (arg0 == 3109) {
                field2318 -= 2;
                int var112 = field2325[field2318];
                int var113 = field2325[field2318 + 1];
                class668 var114 = arg1 ? field2308 : field2305;
                class261.method1725(var113, var112, var114, 124);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field2325[--field2318];
                field2330++;
                class267 var116 = class545.method3099((byte) 95, class269.field3966, class210.field2781);
                var116.field3938.method2415(false, var115);
                class617.method3392(var116, true);
                return;
            }
            if (arg0 == 3111) {
                field2318 -= 2;
                int var117 = field2325[field2318];
                int var118 = field2325[field2318 + 1];
                class237 var119 = (class237) class609.field8283.method3953((long) var117, 14);
                if (var119 != null) {
                    class618.method3397(true, var119.field3202 != var118, var119, -86709072);
                }
                class99.method779(var118, var117, true, (byte) 19, 3);
                return;
            }
            if (arg0 == 3112) {
                field2318--;
                int var120 = field2325[field2318];
                class237 var121 = (class237) class609.field8283.method3953((long) var120, 14);
                if (var121 != null && var121.field3196 == 3) {
                    class618.method3397(true, true, var121, -86709072);
                }
                return;
            }
            if (arg0 == 3113) {
                class608.method3367(field2327[--field2304], 24);
                return;
            }
            if (arg0 == 3114) {
                field2318 -= 2;
                int var122 = field2325[field2318];
                int var123 = field2325[field2318 + 1];
                String var124 = field2327[--field2304];
                class746.method4129(var122, "", "", var124, var123, "", 16773);
                return;
            }
            if (arg0 == 3115) {
                field2318 -= 11;
                class564[] var125 = class706.method3954(57);
                class631[] var126 = class709.method3970(-1);
                class304.method1916(field2325[field2318 + 10], field2325[field2318 + 5], field2325[field2318 + 3], field2325[field2318 + 6], field2325[field2318 + 8], field2325[field2318 + 2], field2325[field2318 + 9], field2325[field2318 + 4], field2325[field2318 + 7], var126[field2325[field2318 + 1]], var125[field2325[field2318]], false);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field2325[--field2318];
                field2320++;
                class267 var128 = class545.method3099((byte) 102, class269.field3966, class422.field6038);
                var128.field3938.method2415(false, var127);
                class617.method3392(var128, true);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field2327[--field2304];
                class267 var130 = class545.method3099((byte) 89, class269.field3966, class562.field7546);
                var130.field3938.method2380(65280, var129.length() + 1);
                var130.field3938.method2349(123, var129);
                class617.method3392(var130, true);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field2318 -= 3;
                class87.method715(255, field2325[field2318], field2325[field2318 + 2], field2325[field2318 + 1], 256, 2760);
                return;
            }
            if (arg0 == 3201) {
                class573.method3205(-93, 255, 50, field2325[--field2318]);
                return;
            }
            if (arg0 == 3202) {
                field2318 -= 2;
                class176.method1243(field2325[field2318], 255, (byte) -124, field2325[field2318 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field2318 -= 4;
                class87.method715(field2325[field2318 + 3], field2325[field2318], field2325[field2318 + 2], field2325[field2318 + 1], 256, 2760);
                return;
            }
            if (arg0 == 3204) {
                field2318 -= 3;
                class573.method3205(99, field2325[field2318 + 1], field2325[field2318 + 2], field2325[field2318]);
                return;
            }
            if (arg0 == 3205) {
                field2318 -= 3;
                class176.method1243(field2325[field2318], field2325[field2318 + 2], (byte) -126, field2325[field2318 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field2318 -= 4;
                class642.method3567(false, field2325[field2318 + 2], field2325[field2318 + 1], -107, field2325[field2318], field2325[field2318 + 3], 256);
                return;
            }
            if (arg0 == 3207) {
                field2318 -= 4;
                class642.method3567(true, field2325[field2318 + 2], field2325[field2318 + 1], 99, field2325[field2318], field2325[field2318 + 3], 256);
                return;
            }
            if (arg0 == 3208) {
                field2318 -= 5;
                class87.method715(field2325[field2318 + 3], field2325[field2318], field2325[field2318 + 2], field2325[field2318 + 1], field2325[field2318 + 4], 2760);
                return;
            }
            if (arg0 == 3209) {
                field2318 -= 5;
                class642.method3567(false, field2325[field2318 + 2], field2325[field2318 + 1], -37, field2325[field2318], field2325[field2318 + 3], field2325[field2318 + 4]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field2325[field2318++] = class100.field1401;
                return;
            }
            if (arg0 == 3301) {
                field2318 -= 2;
                int var131 = field2325[field2318];
                int var132 = field2325[field2318 + 1];
                field2325[field2318++] = class682.method3800(false, var132, 13490, var131);
                return;
            }
            if (arg0 == 3302) {
                field2318 -= 2;
                int var133 = field2325[field2318];
                int var134 = field2325[field2318 + 1];
                field2325[field2318++] = class486.method2824(var134, false, 0, var133);
                return;
            }
            if (arg0 == 3303) {
                field2318 -= 2;
                int var135 = field2325[field2318];
                int var136 = field2325[field2318 + 1];
                field2325[field2318++] = class201.method1362(var136, var135, -99, false);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field2325[--field2318];
                field2325[field2318++] = class744.field10278.method2290((byte) 102, var137).field6242;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field2325[--field2318];
                field2325[field2318++] = class287.field4230[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field2325[--field2318];
                field2325[field2318++] = class286.field4219[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field2325[--field2318];
                field2325[field2318++] = class13.field216[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class551.field7456.field2250;
                int var142 = (class551.field7456.field2257 >> 9) + class121.field1765;
                int var143 = (class551.field7456.field2259 >> 9) + class230.field3147;
                field2325[field2318++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field2325[--field2318];
                field2325[field2318++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field2325[--field2318];
                field2325[field2318++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field2325[--field2318];
                field2325[field2318++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field2325[field2318++] = class196.field2619 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field2318 -= 2;
                int var147 = field2325[field2318];
                int var148 = field2325[field2318 + 1];
                field2325[field2318++] = class682.method3800(true, var148, 13490, var147);
                return;
            }
            if (arg0 == 3314) {
                field2318 -= 2;
                int var149 = field2325[field2318];
                int var150 = field2325[field2318 + 1];
                field2325[field2318++] = class486.method2824(var150, true, 0, var149);
                return;
            }
            if (arg0 == 3315) {
                field2318 -= 2;
                int var151 = field2325[field2318];
                int var152 = field2325[field2318 + 1];
                field2325[field2318++] = class201.method1362(var152, var151, -66, true);
                return;
            }
            if (arg0 == 3316) {
                if (class712.field9963 >= 2) {
                    field2325[field2318++] = class712.field9963;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field2325[field2318++] = class385.field5623;
                return;
            }
            if (arg0 == 3318) {
                field2325[field2318++] = class369.field5359.field1148;
                return;
            }
            if (arg0 == 3321) {
                field2325[field2318++] = class343.field5055;
                return;
            }
            if (arg0 == 3322) {
                field2325[field2318++] = class97.field1357;
                return;
            }
            if (arg0 == 3323) {
                if (class546.field7403 >= 5 && class546.field7403 <= 9) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class546.field7403 >= 5 && class546.field7403 <= 9) {
                    field2325[field2318++] = class546.field7403;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field2325[field2318++] = class238.field3212 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field2325[field2318++] = class551.field7456.field1051;
                return;
            }
            if (arg0 == 3327) {
                field2325[field2318++] = class551.field7456.field1050 != null && class551.field7456.field1050.field9686 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field2325[field2318++] = class546.field7401 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field2325[--field2318];
                field2325[field2318++] = class22.method176(125, var153, false);
                return;
            }
            if (arg0 == 3331) {
                field2318 -= 2;
                int var154 = field2325[field2318];
                int var155 = field2325[field2318 + 1];
                field2325[field2318++] = class274.method1783(var155, var154, false, false, 0);
                return;
            }
            if (arg0 == 3332) {
                field2318 -= 2;
                int var156 = field2325[field2318];
                int var157 = field2325[field2318 + 1];
                field2325[field2318++] = class274.method1783(var157, var156, false, true, 0);
                return;
            }
            if (arg0 == 3333) {
                field2325[field2318++] = class548.method3109((byte) 122);
                return;
            }
            if (arg0 == 3335) {
                field2325[field2318++] = class38.field589;
                return;
            }
            if (arg0 == 3336) {
                field2318 -= 4;
                int var158 = field2325[field2318];
                int var159 = field2325[field2318 + 1];
                int var160 = field2325[field2318 + 2];
                int var161 = field2325[field2318 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field2325[field2318++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field2325[field2318++] = class444.field6231;
                return;
            }
            if (arg0 == 3338) {
                field2325[field2318++] = class601.method3347(true);
                return;
            }
            if (arg0 == 3339) {
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field2325[field2318++] = class59.field807 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field2325[field2318++] = class662.field9151 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field2325[field2318++] = class304.field4371.method778(0);
                return;
            }
            if (arg0 == 3343) {
                field2325[field2318++] = class304.field4371.method777((byte) -24);
                return;
            }
            if (arg0 == 3344) {
                field2327[field2304++] = class56.method405(-595);
                return;
            }
            if (arg0 == 3345) {
                field2327[field2304++] = class298.method1893(-24940);
                return;
            }
            if (arg0 == 3346) {
                field2325[field2318++] = class252.method1685(-123);
                return;
            }
            if (arg0 == 3347) {
                field2325[field2318++] = class655.field9073;
                return;
            }
            if (arg0 == 3349) {
                field2325[field2318++] = class551.field7456.field1860.method3980(2) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field2318 -= 2;
                int var165 = field2325[field2318];
                int var166 = field2325[field2318 + 1];
                class373 var167 = class446.field6253.method3005((byte) 120, var165);
                field2327[field2304++] = var167.method2315(25851, var166);
                return;
            }
            if (arg0 == 3408) {
                field2318 -= 4;
                int var168 = field2325[field2318];
                int var169 = field2325[field2318 + 1];
                int var170 = field2325[field2318 + 2];
                int var171 = field2325[field2318 + 3];
                class373 var172 = class446.field6253.method3005((byte) -31, var170);
                if (var172.field5386 == var168 && var172.field5385 == var169) {
                    if (var169 == 115) {
                        field2327[field2304++] = var172.method2315(25851, var171);
                        return;
                    }
                    field2325[field2318++] = var172.method2310(var171, (byte) 124);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field2318 -= 3;
                int var173 = field2325[field2318];
                int var174 = field2325[field2318 + 1];
                int var175 = field2325[field2318 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class373 var176 = class446.field6253.method3005((byte) -8, var174);
                if (var176.field5385 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field2325[field2318++] = var176.method2316(var175, -4) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field2325[--field2318];
                String var178 = field2327[--field2304];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class373 var179 = class446.field6253.method3005((byte) -38, var177);
                if (var179.field5385 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field2325[field2318++] = var179.method2318(var178, 121) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field2325[--field2318];
                class373 var181 = class446.field6253.method3005((byte) 116, var180);
                field2325[field2318++] = var181.field5396.method3963((byte) -64);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class713.field9972 == 0) {
                    field2325[field2318++] = -2;
                    return;
                }
                if (class713.field9972 == 1) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = class671.field9452;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field2325[--field2318];
                if (class713.field9972 == 2 && var182 < class671.field9452) {
                    field2327[field2304++] = class42.field653[var182];
                    if (class246.field3374[var182] != null) {
                        field2327[field2304++] = class246.field3374[var182];
                        return;
                    }
                    field2327[field2304++] = "";
                    return;
                }
                field2327[field2304++] = "";
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field2325[--field2318];
                if (class713.field9972 == 2 && var183 < class671.field9452) {
                    field2325[field2318++] = class65.field924[var183];
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field2325[--field2318];
                if (class713.field9972 == 2 && var184 < class671.field9452) {
                    field2325[field2318++] = class688.field9679[var184];
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field2327[--field2304];
                int var186 = field2325[--field2318];
                class424.method2598(var186, 1706, var185);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field2327[--field2304];
                class777.method4301(122, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field2327[--field2304];
                class354.method2233(var188, -1);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field2327[--field2304];
                class738.method4088(var189, false, (byte) 112);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field2327[--field2304];
                class3.method12(0, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field2327[--field2304];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field2325[field2318++] = class256.method1709(var191, (byte) -96) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field2325[--field2318];
                if (class713.field9972 == 2 && var192 < class671.field9452) {
                    field2327[field2304++] = class176.field2353[var192];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class83.field1166 != null) {
                    field2327[field2304++] = class101.method791((byte) 63, class83.field1166);
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class83.field1166 != null) {
                    field2325[field2318++] = class587.field7825;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field2325[--field2318];
                if (class83.field1166 != null && var193 < class587.field7825) {
                    field2327[field2304++] = class39.field598[var193].field8290;
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field2325[--field2318];
                if (class83.field1166 != null && var194 < class587.field7825) {
                    field2325[field2318++] = class39.field598[var194].field8294;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field2325[--field2318];
                if (class83.field1166 != null && var195 < class587.field7825) {
                    field2325[field2318++] = class39.field598[var195].field8297;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field2325[field2318++] = class503.field6965;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field2327[--field2304];
                class344.method2186(var196, (byte) 112);
                return;
            }
            if (arg0 == 3618) {
                field2325[field2318++] = class515.field7047;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field2327[--field2304];
                class47.method361(var197, -108);
                return;
            }
            if (arg0 == 3620) {
                class303.method1912(0);
                return;
            }
            if (arg0 == 3621) {
                if (class713.field9972 == 0) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = class5.field54;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field2325[--field2318];
                if (class713.field9972 != 0 && var198 < class5.field54) {
                    field2327[field2304++] = class255.field3798[var198];
                    if (class424.field6053[var198] != null) {
                        field2327[field2304++] = class424.field6053[var198];
                        return;
                    }
                    field2327[field2304++] = "";
                    return;
                }
                field2327[field2304++] = "";
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field2327[--field2304];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field2325[field2318++] = class337.method2140(123, var199) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field2325[--field2318];
                if (class39.field598 != null && var200 < class587.field7825 && class39.field598[var200].field8289.equalsIgnoreCase(class551.field7456.field1020)) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class525.field7190 != null) {
                    field2327[field2304++] = class525.field7190;
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field2325[--field2318];
                if (class83.field1166 != null && var201 < class587.field7825) {
                    field2327[field2304++] = class39.field598[var201].field8293;
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field2325[--field2318];
                if (class713.field9972 == 2 && var202 >= 0 && var202 < class671.field9452) {
                    field2325[field2318++] = class281.field4144[var202] ? 1 : 0;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field2327[--field2304];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field2325[field2318++] = class208.method1389(var203, -19496);
                return;
            }
            if (arg0 == 3629) {
                field2325[field2318++] = class500.field6907;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field2327[--field2304];
                class738.method4088(var204, true, (byte) 125);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field2325[--field2318];
                field2325[field2318++] = class749.field10327[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field2325[--field2318];
                if (class83.field1166 != null && var206 < class587.field7825) {
                    field2327[field2304++] = class39.field598[var206].field8289;
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field2325[--field2318];
                if (class713.field9972 != 0 && var207 < class5.field54) {
                    field2327[field2304++] = class602.field8189[var207];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class495.field6848 != null) {
                    field2325[field2318++] = 1;
                    field2326 = class495.field6848;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class181.field2401 != null) {
                    field2325[field2318++] = 1;
                    field2326 = class181.field2401;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field2327[field2304++] = field2326.field8431;
                return;
            }
            if (arg0 == 3703) {
                field2325[field2318++] = field2326.field8412 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field2325[field2318++] = field2326.field8417;
                return;
            }
            if (arg0 == 3705) {
                field2325[field2318++] = field2326.field8414;
                return;
            }
            if (arg0 == 3706) {
                field2325[field2318++] = field2326.field8429;
                return;
            }
            if (arg0 == 3707) {
                field2325[field2318++] = field2326.field8406;
                return;
            }
            if (arg0 == 3709) {
                field2325[field2318++] = field2326.field8408;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field2325[--field2318];
                field2327[field2304++] = field2326.field8404[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field2325[--field2318];
                field2325[field2318++] = field2326.field8421[var209];
                return;
            }
            if (arg0 == 3712) {
                field2325[field2318++] = field2326.field8438;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field2325[--field2318];
                field2327[field2304++] = field2326.field8398[var210];
                return;
            }
            if (arg0 == 3714) {
                field2318 -= 3;
                int var211 = field2325[field2318];
                int var212 = field2325[field2318 + 1];
                int var213 = field2325[field2318 + 2];
                field2325[field2318++] = field2326.method3433(var213, var211, -34, var212);
                return;
            }
            if (arg0 == 3715) {
                field2325[field2318++] = field2326.field8395;
                return;
            }
            if (arg0 == 3716) {
                field2325[field2318++] = field2326.field8434;
                return;
            }
            if (arg0 == 3717) {
                field2325[field2318++] = field2326.method3437((byte) -47, field2327[--field2304]);
                return;
            }
            if (arg0 == 3718) {
                field2325[field2318 - 1] = field2326.method3424(-127)[field2325[field2318 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class285.field4208 != null) {
                    field2325[field2318++] = 1;
                    field2324 = class285.field4208;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class66.field952 != null) {
                    field2325[field2318++] = 1;
                    field2324 = class66.field952;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field2327[field2304++] = field2324.field789;
                return;
            }
            if (arg0 == 3753) {
                field2325[field2318++] = field2324.field790;
                return;
            }
            if (arg0 == 3754) {
                field2325[field2318++] = field2324.field781;
                return;
            }
            if (arg0 == 3755) {
                field2325[field2318++] = field2324.field777;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field2325[--field2318];
                field2327[field2304++] = field2324.field786[var214].field2378;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field2325[--field2318];
                field2325[field2318++] = field2324.field786[var215].field2381;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field2325[--field2318];
                field2325[field2318++] = field2324.field786[var216].field2382;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field2325[--field2318];
                class577.method3222(var217, class66.field952 == field2324, (byte) -73);
                return;
            }
            if (arg0 == 3760) {
                field2325[field2318++] = field2324.method399(field2327[--field2304], 14844);
                return;
            }
            if (arg0 == 3761) {
                field2325[field2318 - 1] = field2324.method398((byte) 46)[field2325[field2318 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var218].method814((byte) 23);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var219].field1477;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var220].field1478;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var221].field1471;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var222].field1474;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field2325[--field2318];
                field2325[field2318++] = class546.field7402[var223].field1472;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field2325[--field2318];
                int var225 = class546.field7402[var224].method813(false);
                field2325[field2318++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field2325[--field2318];
                int var227 = class546.field7402[var226].method813(false);
                field2325[field2318++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field2325[--field2318];
                int var229 = class546.field7402[var228].method813(false);
                field2325[field2318++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field2325[--field2318];
                int var231 = class546.field7402[var230].method813(false);
                field2325[field2318++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field2318 -= 2;
                int var232 = field2325[field2318];
                int var233 = field2325[field2318 + 1];
                field2325[field2318++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field2318 -= 2;
                int var234 = field2325[field2318];
                int var235 = field2325[field2318 + 1];
                field2325[field2318++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field2318 -= 2;
                int var236 = field2325[field2318];
                int var237 = field2325[field2318 + 1];
                field2325[field2318++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field2318 -= 2;
                int var238 = field2325[field2318];
                int var239 = field2325[field2318 + 1];
                field2325[field2318++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field2325[--field2318];
                field2325[field2318++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field2325[--field2318];
                field2325[field2318++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field2318 -= 5;
                int var242 = field2325[field2318];
                int var243 = field2325[field2318 + 1];
                int var244 = field2325[field2318 + 2];
                int var245 = field2325[field2318 + 3];
                int var246 = field2325[field2318 + 4];
                field2325[field2318++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field2318 -= 2;
                long var247 = (long) field2325[field2318];
                long var249 = (long) field2325[field2318 + 1];
                field2325[field2318++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field2318 -= 2;
                int var251 = field2325[field2318];
                int var252 = field2325[field2318 + 1];
                field2325[field2318++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field2318 -= 2;
                int var253 = field2325[field2318];
                int var254 = field2325[field2318 + 1];
                field2325[field2318++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field2318 -= 2;
                int var255 = field2325[field2318];
                int var256 = field2325[field2318 + 1];
                field2325[field2318++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field2318 -= 2;
                int var257 = field2325[field2318];
                int var258 = field2325[field2318 + 1];
                field2325[field2318++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field2318 -= 2;
                int var259 = field2325[field2318];
                int var260 = field2325[field2318 + 1];
                if (var259 == 0) {
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field2318 -= 2;
                int var261 = field2325[field2318];
                int var262 = field2325[field2318 + 1];
                if (var261 == 0) {
                    field2325[field2318++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field2325[field2318++] = Integer.MAX_VALUE;
                    return;
                }
                field2325[field2318++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field2318 -= 2;
                int var263 = field2325[field2318];
                int var264 = field2325[field2318 + 1];
                field2325[field2318++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field2318 -= 2;
                int var265 = field2325[field2318];
                int var266 = field2325[field2318 + 1];
                field2325[field2318++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field2318 -= 2;
                int var267 = field2325[field2318];
                int var268 = field2325[field2318 + 1];
                field2325[field2318++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field2318 -= 2;
                int var269 = field2325[field2318];
                int var270 = field2325[field2318 + 1];
                field2325[field2318++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field2318 -= 3;
                long var271 = (long) field2325[field2318];
                long var273 = (long) field2325[field2318 + 1];
                long var275 = (long) field2325[field2318 + 2];
                field2325[field2318++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field2318 -= 2;
                int var277 = field2325[field2318];
                int var278 = field2325[field2318 + 1];
                if (var277 > 700 || var278 > 700) {
                    field2325[field2318++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field2325[field2318++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field2325[--field2318];
                field2325[field2318++] = class182.field2413[class630.method3539(var281, 2011997347) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field2327[--field2304];
                int var283 = field2325[--field2318];
                field2327[field2304++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field2304 -= 2;
                String var284 = field2327[field2304];
                String var285 = field2327[field2304 + 1];
                field2327[field2304++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field2327[--field2304];
                int var287 = field2325[--field2318];
                field2327[field2304++] = var286 + class544.method3098(var287, 16051, true);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field2327[--field2304];
                field2327[field2304++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field2327[field2304++] = class335.method2131(class38.field589, true, class139.method1074(field2325[--field2318], -96));
                return;
            }
            if (arg0 == 4105) {
                field2304 -= 2;
                String var289 = field2327[field2304];
                String var290 = field2327[field2304 + 1];
                if (class551.field7456.field1050 != null && class551.field7456.field1050.field9686) {
                    field2327[field2304++] = var290;
                    return;
                }
                field2327[field2304++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field2325[--field2318];
                field2327[field2304++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field2304 -= 2;
                field2325[field2318++] = class295.method1875(field2327[field2304], false, field2327[field2304 + 1], class38.field589);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field2327[--field2304];
                field2318 -= 2;
                int var293 = field2325[field2318];
                int var294 = field2325[field2318 + 1];
                class255 var295 = class564.method3157(0, class781.field10716, var294, (byte) 44);
                field2325[field2318++] = var295.method1697(-62, class416.field5975, var292, var293);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field2327[--field2304];
                field2318 -= 2;
                int var297 = field2325[field2318];
                int var298 = field2325[field2318 + 1];
                class255 var299 = class564.method3157(0, class781.field10716, var298, (byte) 44);
                field2325[field2318++] = var299.method1701((byte) -121, var296, var297, class416.field5975);
                return;
            }
            if (arg0 == 4110) {
                field2304 -= 2;
                String var300 = field2327[field2304];
                String var301 = field2327[field2304 + 1];
                if (field2325[--field2318] == 1) {
                    field2327[field2304++] = var300;
                    return;
                }
                field2327[field2304++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field2327[--field2304];
                field2327[field2304++] = class652.method3630((byte) -10, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field2327[--field2304];
                int var304 = field2325[--field2318];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field2327[field2304++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field2325[--field2318];
                field2325[field2318++] = method1222((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field2325[--field2318];
                field2325[field2318++] = class103.method795(64, (char) var306) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field2325[--field2318];
                field2325[field2318++] = class488.method2839((char) var307, -98) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field2325[--field2318];
                field2325[field2318++] = class338.method2145(28855, (char) var308) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field2327[--field2304];
                if (var309 != null) {
                    field2325[field2318++] = var309.length();
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field2327[--field2304];
                field2318 -= 2;
                int var311 = field2325[field2318];
                int var312 = field2325[field2318 + 1];
                field2327[field2304++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field2327[--field2304];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field2327[field2304++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field2327[--field2304];
                field2318 -= 2;
                int var319 = field2325[field2318];
                int var320 = field2325[field2318 + 1];
                field2325[field2318++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field2304 -= 2;
                String var321 = field2327[field2304];
                String var322 = field2327[field2304 + 1];
                int var323 = field2325[--field2318];
                field2325[field2318++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field2325[--field2318];
                field2325[field2318++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field2325[--field2318];
                field2325[field2318++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field2325[--field2318] != 0;
                int var327 = field2325[--field2318];
                field2327[field2304++] = class463.method2743(var326, (long) var327, class38.field589, 0, -1262897456);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field2327[--field2304];
                int var329 = field2325[--field2318];
                class255 var330 = class564.method3157(0, class781.field10716, var329, (byte) 44);
                field2325[field2318++] = var330.method1702(18700, class416.field5975, var328);
                return;
            }
            if (arg0 == 4126) {
                field2327[field2304++] = class755.method4211(true, class38.field589, (long) field2325[--field2318] * 60000L, -116) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field2328[--field2311];
                field2327[field2304++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field2325[--field2318];
                field2327[field2304++] = class770.field10602.method2467(-33, var333).field4668;
                return;
            }
            if (arg0 == 4201) {
                field2318 -= 2;
                int var334 = field2325[field2318];
                int var335 = field2325[field2318 + 1];
                class322 var336 = class770.field10602.method2467(-55, var334);
                if (var335 >= 1 && var335 <= 5 && var336.field4637[var335 - 1] != null) {
                    field2327[field2304++] = var336.field4637[var335 - 1];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 4202) {
                field2318 -= 2;
                int var337 = field2325[field2318];
                int var338 = field2325[field2318 + 1];
                class322 var339 = class770.field10602.method2467(127, var337);
                if (var338 >= 1 && var338 <= 5 && var339.field4647[var338 - 1] != null) {
                    field2327[field2304++] = var339.field4647[var338 - 1];
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field2325[--field2318];
                field2325[field2318++] = class770.field10602.method2467(121, var340).field4630;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field2325[--field2318];
                field2325[field2318++] = class770.field10602.method2467(-4, var341).field4658 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field2325[--field2318];
                class322 var343 = class770.field10602.method2467(121, var342);
                if (var343.field4639 == -1 && var343.field4709 >= 0) {
                    field2325[field2318++] = var343.field4709;
                    return;
                }
                field2325[field2318++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field2325[--field2318];
                class322 var345 = class770.field10602.method2467(-109, var344);
                if (var345.field4639 >= 0 && var345.field4709 >= 0) {
                    field2325[field2318++] = var345.field4709;
                    return;
                }
                field2325[field2318++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field2325[--field2318];
                field2325[field2318++] = class770.field10602.method2467(-2, var346).field4632 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field2318 -= 2;
                int var347 = field2325[field2318];
                int var348 = field2325[field2318 + 1];
                class486 var349 = class206.field2703.method3905(true, var348);
                if (var349.method2825(0)) {
                    field2327[field2304++] = class770.field10602.method2467(126, var347).method2044(var348, var349.field6727, (byte) -107);
                    return;
                }
                field2325[field2318++] = class770.field10602.method2467(-60, var347).method2045(var349.field6728, var348, -1);
                return;
            }
            if (arg0 == 4209) {
                field2318 -= 2;
                int var350 = field2325[field2318];
                int var351 = field2325[field2318 + 1] - 1;
                class322 var352 = class770.field10602.method2467(123, var350);
                if (var352.field4645 == var351) {
                    field2325[field2318++] = var352.field4653;
                    return;
                }
                if (var352.field4640 == var351) {
                    field2325[field2318++] = var352.field4683;
                    return;
                }
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field2327[--field2304];
                int var354 = field2325[--field2318];
                class736.method4079(-1, var354 == 1, var353);
                field2325[field2318++] = class774.field10661;
                return;
            }
            if (arg0 == 4211) {
                if (class356.field5214 != null && class537.field7313 < class774.field10661) {
                    field2325[field2318++] = class356.field5214[class537.field7313++] & 0xFFFF;
                    return;
                }
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class537.field7313 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field2325[--field2318];
                field2325[field2318++] = class770.field10602.method2467(125, var355).field4671;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field2327[--field2304];
                field2318 -= 3;
                int var357 = field2325[field2318];
                int var358 = field2325[field2318 + 1];
                int var359 = field2325[field2318 + 2];
                class129.method1043(var358, 1, var356, var359, var357 == 1);
                field2325[field2318++] = class774.field10661;
                return;
            }
            if (arg0 == 4215) {
                field2304 -= 2;
                field2318 -= 2;
                String var360 = field2327[field2304];
                int var361 = field2325[field2318];
                int var362 = field2325[field2318 + 1];
                String var363 = field2327[field2304 + 1];
                class430.method2621(var360, var363, var362, var361 == 1, (byte) 85);
                field2325[field2318++] = class774.field10661;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field2318 -= 2;
                int var364 = field2325[field2318];
                int var365 = field2325[field2318 + 1];
                class486 var366 = class206.field2703.method3905(true, var365);
                if (var366.method2825(0)) {
                    field2327[field2304++] = class364.field5309.method3338((byte) 93, var364).method1453(var365, var366.field6727, (byte) 100);
                    return;
                }
                field2325[field2318++] = class364.field5309.method3338((byte) -116, var364).method1452(var365, var366.field6728, (byte) 111);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field2318 -= 2;
                int var367 = field2325[field2318];
                int var368 = field2325[field2318 + 1];
                class486 var369 = class206.field2703.method3905(true, var368);
                if (var369.method2825(0)) {
                    field2327[field2304++] = class350.field5132.method3732((byte) 39, var367).method3282(var368, (byte) 120, var369.field6727);
                    return;
                }
                field2325[field2318++] = class350.field5132.method3732((byte) 88, var367).method3280(var368, 1312515360, var369.field6728);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field2318 -= 2;
                int var370 = field2325[field2318];
                int var371 = field2325[field2318 + 1];
                class486 var372 = class206.field2703.method3905(true, var371);
                if (var372.method2825(0)) {
                    field2327[field2304++] = class273.field4057.method2565(var370, -125).method2078(26689, var372.field6727, var371);
                    return;
                }
                field2325[field2318++] = class273.field4057.method2565(var370, 105).method2072(var372.field6728, 97, var371);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field2325[--field2318];
                class208 var374 = class719.field10024.method2128((byte) -75, var373);
                if (var374.field2720 != null && var374.field2720.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field2747[0];
                    for (int var377 = 1; var377 < var374.field2720.length; var377++) {
                        if (var374.field2747[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field2747[var377];
                        }
                    }
                    field2325[field2318++] = var374.field2720[var375];
                    return;
                }
                field2325[field2318++] = var374.field2740;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field2325[field2318++] = class262.field3885 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field2327[--field2304];
                if (class458.field6355 == 7 && !class217.method1433(-1)) {
                    if (var378.length() > 20) {
                        class71.field1007 = -4;
                        return;
                    }
                    class71.field1007 = -1;
                    class267 var379 = class545.method3099((byte) 64, class269.field3966, class118.field1688);
                    var379.field3938.method2380(65280, 0);
                    int var380 = var379.field3938.field5459;
                    var379.field3938.method2349(118, var378);
                    var379.field3938.method2394(71, var379.field3938.field5459 - var380);
                    class617.method3392(var379, true);
                    return;
                }
                class71.field1007 = -5;
                return;
            }
            if (arg0 == 4702) {
                field2325[field2318++] = class71.field1007;
                if (class71.field1007 != -1) {
                    class71.field1007 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ltg;I)V")
    private static final void method1224(class244 arg0, int arg1) {
        field2318 = 0;
        field2304 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3293;
        int[] var4 = arg0.field3298;
        byte var5 = -1;
        field2321 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method1223(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method1233(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field2325[field2318++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field2325[field2318++] = class382.field5602.field5274[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class382.field5602.method2268(var8, field2325[--field2318], (byte) -116);
                } else if (var45 == 3) {
                    field2327[field2304++] = arg0.field3287[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field2318 -= 2;
                    if (field2325[field2318 + 1] != field2325[field2318]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field2318 -= 2;
                    if (field2325[field2318 + 1] == field2325[field2318]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field2318 -= 2;
                    if (field2325[field2318] < field2325[field2318 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field2318 -= 2;
                    if (field2325[field2318] > field2325[field2318 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field2321 == 0) {
                        return;
                    }
                    class97 var9 = field2314[--field2321];
                    arg0 = var9.field1349;
                    var3 = arg0.field3293;
                    var4 = arg0.field3298;
                    var2 = var9.field1356;
                    field2331 = var9.field1348;
                    field2332 = var9.field1350;
                    field2307 = var9.field1352;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field2325[field2318++] = class382.field5602.method2271(var10, 14194);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class382.field5602.method2274(var11, field2325[--field2318], 0);
                } else if (var45 == 31) {
                    field2318 -= 2;
                    if (field2325[field2318] <= field2325[field2318 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field2318 -= 2;
                    if (field2325[field2318] >= field2325[field2318 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field2325[field2318++] = field2331[var4[var2]];
                } else if (var45 == 34) {
                    field2331[var4[var2]] = field2325[--field2318];
                } else if (var45 == 35) {
                    field2327[field2304++] = field2332[var4[var2]];
                } else if (var45 == 36) {
                    field2332[var4[var2]] = field2327[--field2304];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field2304 -= var12;
                    String var13 = class292.method1847((byte) 110, var12, field2327, field2304);
                    field2327[field2304++] = var13;
                } else if (var45 == 38) {
                    field2318--;
                } else if (var45 == 39) {
                    field2304--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class244 var15 = class46.method350(var14, 23899);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3291];
                    String[] var17 = new String[var15.field3292];
                    long[] var18 = new long[var15.field3285];
                    for (int var19 = 0; var19 < var15.field3282; var19++) {
                        var16[var19] = field2325[field2318 + var19 - var15.field3282];
                    }
                    for (int var20 = 0; var20 < var15.field3288; var20++) {
                        var17[var20] = field2327[field2304 + var20 - var15.field3288];
                    }
                    for (int var21 = 0; var21 < var15.field3290; var21++) {
                        var18[var21] = field2328[field2311 + var21 - var15.field3290];
                    }
                    field2318 -= var15.field3282;
                    field2304 -= var15.field3288;
                    field2311 -= var15.field3290;
                    class97 var22 = new class97();
                    var22.field1349 = arg0;
                    var22.field1356 = var2;
                    var22.field1348 = field2331;
                    var22.field1350 = field2332;
                    var22.field1352 = field2307;
                    if (field2321 >= field2314.length) {
                        throw new RuntimeException();
                    }
                    field2314[field2321++] = var22;
                    arg0 = var15;
                    var3 = var15.field3293;
                    var4 = var15.field3298;
                    var2 = -1;
                    field2331 = var16;
                    field2332 = var17;
                    field2307 = var18;
                } else if (var45 == 42) {
                    field2325[field2318++] = class700.field9825[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class700.field9825[var23] = field2325[--field2318];
                    class255.method1703(var23, 1);
                    class79.field1138 |= class197.field2639[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field2325[--field2318];
                    if (var26 >= 0 && var26 <= 5000) {
                        field2323[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field2316[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field2325[--field2318];
                    if (var30 < 0 || var30 >= field2323[var29]) {
                        throw new RuntimeException();
                    }
                    field2325[field2318++] = field2316[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field2318 -= 2;
                    int var32 = field2325[field2318];
                    if (var32 < 0 || var32 >= field2323[var31]) {
                        throw new RuntimeException();
                    }
                    field2316[var31][var32] = field2325[field2318 + 1];
                } else if (var45 == 47) {
                    String var33 = class41.field642[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field2327[field2304++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class41.field642[var34] = field2327[--field2304];
                    class182.method1268(118, var34);
                } else if (var45 == 51) {
                    class706 var35 = arg0.field3286[var4[var2]];
                    class119 var36 = (class119) var35.method3953((long) field2325[--field2318], 14);
                    if (var36 != null) {
                        var2 += var36.field1725;
                    }
                } else if (var45 == 54) {
                    field2328[field2311++] = arg0.field3289[var2];
                } else if (var45 == 55) {
                    field2311--;
                } else if (var45 == 66) {
                    field2328[field2311++] = field2307[var4[var2]];
                } else if (var45 == 67) {
                    field2307[var4[var2]] = field2328[--field2311];
                } else if (var45 == 68) {
                    field2311 -= 2;
                    if (field2328[field2311 + 1] != field2328[field2311]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field2311 -= 2;
                    if (field2328[field2311 + 1] == field2328[field2311]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field2311 -= 2;
                    if (field2328[field2311] < field2328[field2311 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field2311 -= 2;
                    if (field2328[field2311] > field2328[field2311 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field2311 -= 2;
                    if (field2328[field2311] <= field2328[field2311 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field2311 -= 2;
                    if (field2328[field2311] >= field2328[field2311 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field2325[--field2318] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field2325[--field2318] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field2325[field2318++] = method1231(var4[var2]);
                } else if (var45 == 113) {
                    field2325[field2318++] = method1229(var4[var2]);
                } else if (var45 == 114) {
                    field2328[field2311++] = method1230(var4[var2]);
                } else if (var45 == 115) {
                    field2327[field2304++] = method1236(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field3296 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field1409).append(" ");
                for (int var43 = field2321 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field2314[var43].field1349.field1409).append(" ");
                }
                var42.append("op: ").append(var5);
                class664.method3681((byte) -37, var42.toString(), var44);
            } else {
                class780.method4307((byte) 121, "Clientscript error in: " + arg0.field3296, 4);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field3296).append("\n");
                for (int var40 = field2321 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field2314[var40].field1349.field3296).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class664.method3681((byte) 125, var39.toString(), var44);
                class164.method1188((byte) -113, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    private static final void method1225(int arg0) {
        class668 var1 = class536.method3067(arg0, 0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class668[] var3 = class376.field5492[var2];
        if (var3 == null) {
            class668[] var4 = class111.field1528[var2];
            int var5 = var4.length;
            var3 = class376.field5492[var2] = new class668[var5];
            class278.method1799(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class278.method1799(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static final void method1226(int arg0) {
        if (arg0 == -1 || !class768.method4253(-3, arg0)) {
            return;
        }
        class668[] var1 = class111.field1528[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class668 var3 = var1[var2];
            if (var3.field9368 != null) {
                class12 var4 = new class12();
                var4.field190 = var3;
                var4.field186 = var3.field9368;
                method1228(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1227(String arg0, int arg1) {
        if (class712.field9963 == 0 && !(!class739.field10205 || class635.field8858) || class546.field7401) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class474.field6586.method2780(91, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class474.field6586.method2780(102, 0).length());
        } else if (var2.startsWith(class474.field6587.method2780(86, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class474.field6587.method2780(122, 0).length());
        } else if (var2.startsWith(class474.field6588.method2780(124, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class474.field6588.method2780(110, 0).length());
        } else if (var2.startsWith(class474.field6589.method2780(127, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class474.field6589.method2780(97, 0).length());
        } else if (var2.startsWith(class474.field6590.method2780(106, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class474.field6590.method2780(100, 0).length());
        } else if (var2.startsWith(class474.field6591.method2780(94, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class474.field6591.method2780(114, 0).length());
        } else if (var2.startsWith(class474.field6592.method2780(87, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class474.field6592.method2780(92, 0).length());
        } else if (var2.startsWith(class474.field6593.method2780(87, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class474.field6593.method2780(117, 0).length());
        } else if (var2.startsWith(class474.field6594.method2780(106, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class474.field6594.method2780(85, 0).length());
        } else if (var2.startsWith(class474.field6595.method2780(121, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class474.field6595.method2780(96, 0).length());
        } else if (var2.startsWith(class474.field6596.method2780(117, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class474.field6596.method2780(108, 0).length());
        } else if (var2.startsWith(class474.field6597.method2780(115, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class474.field6597.method2780(109, 0).length());
        } else if (class38.field589 != 0) {
            if (var2.startsWith(class474.field6586.method2780(125, class38.field589))) {
                var3 = 0;
                arg0 = arg0.substring(class474.field6586.method2780(101, class38.field589).length());
            } else if (var2.startsWith(class474.field6587.method2780(107, class38.field589))) {
                var3 = 1;
                arg0 = arg0.substring(class474.field6587.method2780(117, class38.field589).length());
            } else if (var2.startsWith(class474.field6588.method2780(121, class38.field589))) {
                var3 = 2;
                arg0 = arg0.substring(class474.field6588.method2780(109, class38.field589).length());
            } else if (var2.startsWith(class474.field6589.method2780(102, class38.field589))) {
                var3 = 3;
                arg0 = arg0.substring(class474.field6589.method2780(109, class38.field589).length());
            } else if (var2.startsWith(class474.field6590.method2780(120, class38.field589))) {
                var3 = 4;
                arg0 = arg0.substring(class474.field6590.method2780(102, class38.field589).length());
            } else if (var2.startsWith(class474.field6591.method2780(94, class38.field589))) {
                var3 = 5;
                arg0 = arg0.substring(class474.field6591.method2780(107, class38.field589).length());
            } else if (var2.startsWith(class474.field6592.method2780(105, class38.field589))) {
                var3 = 6;
                arg0 = arg0.substring(class474.field6592.method2780(122, class38.field589).length());
            } else if (var2.startsWith(class474.field6593.method2780(123, class38.field589))) {
                var3 = 7;
                arg0 = arg0.substring(class474.field6593.method2780(89, class38.field589).length());
            } else if (var2.startsWith(class474.field6594.method2780(87, class38.field589))) {
                var3 = 8;
                arg0 = arg0.substring(class474.field6594.method2780(97, class38.field589).length());
            } else if (var2.startsWith(class474.field6595.method2780(109, class38.field589))) {
                var3 = 9;
                arg0 = arg0.substring(class474.field6595.method2780(117, class38.field589).length());
            } else if (var2.startsWith(class474.field6596.method2780(124, class38.field589))) {
                var3 = 10;
                arg0 = arg0.substring(class474.field6596.method2780(111, class38.field589).length());
            } else if (var2.startsWith(class474.field6597.method2780(97, class38.field589))) {
                var3 = 11;
                arg0 = arg0.substring(class474.field6597.method2780(120, class38.field589).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class474.field6598.method2780(99, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class474.field6598.method2780(113, 0).length());
        } else if (var4.startsWith(class474.field6599.method2780(125, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class474.field6599.method2780(95, 0).length());
        } else if (var4.startsWith(class474.field6600.method2780(93, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class474.field6600.method2780(87, 0).length());
        } else if (var4.startsWith(class474.field6601.method2780(113, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class474.field6601.method2780(87, 0).length());
        } else if (var4.startsWith(class474.field6602.method2780(104, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class474.field6602.method2780(99, 0).length());
        } else if (class38.field589 != 0) {
            if (var4.startsWith(class474.field6598.method2780(124, class38.field589))) {
                var5 = 1;
                arg0 = arg0.substring(class474.field6598.method2780(105, class38.field589).length());
            } else if (var4.startsWith(class474.field6599.method2780(117, class38.field589))) {
                var5 = 2;
                arg0 = arg0.substring(class474.field6599.method2780(112, class38.field589).length());
            } else if (var4.startsWith(class474.field6600.method2780(126, class38.field589))) {
                var5 = 3;
                arg0 = arg0.substring(class474.field6600.method2780(121, class38.field589).length());
            } else if (var4.startsWith(class474.field6601.method2780(91, class38.field589))) {
                var5 = 4;
                arg0 = arg0.substring(class474.field6601.method2780(118, class38.field589).length());
            } else if (var4.startsWith(class474.field6602.method2780(124, class38.field589))) {
                var5 = 5;
                arg0 = arg0.substring(class474.field6602.method2780(104, class38.field589).length());
            }
        }
        field2333++;
        class267 var6 = class545.method3099((byte) 110, class269.field3966, class436.field6150);
        var6.field3938.method2380(65280, 0);
        int var7 = var6.field3938.field5459;
        var6.field3938.method2380(65280, var3);
        var6.field3938.method2380(65280, var5);
        class539.method3077(var6.field3938, arg0, (byte) 17);
        var6.field3938.method2394(87, var6.field3938.field5459 - var7);
        class617.method3392(var6, true);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ldaa;I)V")
    private static final void method1228(class12 arg0, int arg1) {
        Object[] var2 = arg0.field186;
        int var3 = (Integer) var2[0];
        class244 var4 = class46.method350(var3, 23899);
        if (var4 == null) {
            return;
        }
        field2331 = new int[var4.field3291];
        int var5 = 0;
        field2332 = new String[var4.field3292];
        int var6 = 0;
        field2307 = new long[var4.field3285];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field178;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field181;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field190 == null ? -1 : arg0.field190.field9221;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field184;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field190 == null ? -1 : arg0.field190.field9318;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field189 == null ? -1 : arg0.field189.field9221;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field189 == null ? -1 : arg0.field189.field9318;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field191;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field185;
                }
                field2331[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field177;
                }
                field2332[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field2307[var7++] = var11;
            }
        }
        field2334 = arg0.field187;
        method1224(var4, arg1);
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)I")
    private static final int method1229(int arg0) {
        class320 var1 = class89.field1234.method3738(arg0, true);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field2326.method3425(var1.field4611, true, var1.field4613, class21.field332.field4207 << 16 | var1.field4608);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)J")
    private static final long method1230(int arg0) {
        Long var1 = field2326.method3428(class21.field332.field4207 << 16 | arg0, -77);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)I")
    private static final int method1231(int arg0) {
        class320 var1 = class89.field1234.method3738(arg0, true);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field2326.method3420(class21.field332.field4207 << 16 | arg0, 1);
        if (var2 == null) {
            return var1.field4610 == 'i' || var1.field4610 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(IZ)V")
    public static final void method1232(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(IZ)V")
    private static final void method1233(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2325[field2318++] = class515.field7046;
                return;
            }
            if (arg0 == 5001) {
                field2318 -= 3;
                class515.field7046 = field2325[field2318];
                class525.field7184 = class467.method2760(field2325[field2318 + 1], 31);
                if (class525.field7184 == null) {
                    class525.field7184 = class334.field4862;
                }
                class176.field2350 = field2325[field2318 + 2];
                field2313++;
                class267 var2 = class545.method3099((byte) 88, class269.field3966, class788.field10844);
                var2.field3938.method2380(65280, class515.field7046);
                var2.field3938.method2380(65280, class525.field7184.field736);
                var2.field3938.method2380(65280, class176.field2350);
                class617.method3392(var2, true);
                return;
            }
            if (arg0 == 5002) {
                field2304 -= 2;
                String var3 = field2327[field2304];
                String var4 = field2327[field2304 + 1];
                field2318 -= 2;
                int var5 = field2325[field2318];
                int var6 = field2325[field2318 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2315++;
                class267 var7 = class545.method3099((byte) 110, class269.field3966, class687.field9660);
                var7.field3938.method2380(65280, class469.method2769(var3, (byte) 86) + class469.method2769(var4, (byte) 104) + 2);
                var7.field3938.method2349(55, var3);
                var7.field3938.method2380(65280, var5 - 1);
                var7.field3938.method2380(65280, var6);
                var7.field3938.method2349(79, var4);
                class617.method3392(var7, true);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2325[--field2318];
                class764 var9 = class365.method2289(var8, -4847);
                String var10 = "";
                if (var9 != null && var9.field10565 != null) {
                    var10 = var9.field10565;
                }
                field2327[field2304++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2325[--field2318];
                class764 var12 = class365.method2289(var11, -4847);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field10570;
                }
                field2325[field2318++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class525.field7184 == null) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = class525.field7184.field736;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2325[--field2318];
                class267 var15 = class545.method3099((byte) 118, class269.field3966, class522.field7162);
                var15.field3938.method2380(65280, var14);
                class617.method3392(var15, true);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2327[--field2304];
                method1227(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2304 -= 2;
                String var17 = field2327[field2304];
                String var18 = field2327[field2304 + 1];
                if (class712.field9963 != 0 || (!class739.field10205 || class635.field8858) && !class546.field7401) {
                    field2309++;
                    class267 var19 = class545.method3099((byte) 103, class269.field3966, class625.field8435);
                    var19.field3938.method2380(65280, 0);
                    int var20 = var19.field3938.field5459;
                    var19.field3938.method2349(124, var17);
                    class539.method3077(var19.field3938, var18, (byte) 17);
                    var19.field3938.method2394(92, var19.field3938.field5459 - var20);
                    class617.method3392(var19, true);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2325[--field2318];
                class764 var22 = class365.method2289(var21, -4847);
                String var23 = "";
                if (var22 != null && var22.field10556 != null) {
                    var23 = var22.field10556;
                }
                field2327[field2304++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2325[--field2318];
                class764 var25 = class365.method2289(var24, -4847);
                String var26 = "";
                if (var25 != null && var25.field10560 != null) {
                    var26 = var25.field10560;
                }
                field2327[field2304++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2325[--field2318];
                class764 var28 = class365.method2289(var27, -4847);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field10566;
                }
                field2325[field2318++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class551.field7456 == null || class551.field7456.field1038 == null) {
                    var30 = "";
                } else {
                    var30 = class551.field7456.method642(true, -1075074040);
                }
                field2327[field2304++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2325[field2318++] = class176.field2350;
                return;
            }
            if (arg0 == 5017) {
                field2325[field2318++] = class624.method3417(true);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2325[--field2318];
                class764 var32 = class365.method2289(var31, -4847);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field10563;
                }
                field2325[field2318++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2325[--field2318];
                class764 var35 = class365.method2289(var34, -4847);
                String var36 = "";
                if (var35 != null && var35.field10567 != null) {
                    var36 = var35.field10567;
                }
                field2327[field2304++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class551.field7456 == null || class551.field7456.field1038 == null) {
                    var37 = "";
                } else {
                    var37 = class551.field7456.method650(false, -12628);
                }
                field2327[field2304++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2325[--field2318];
                class764 var39 = class365.method2289(var38, -4847);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field10561;
                }
                field2325[field2318++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2325[--field2318];
                class764 var42 = class365.method2289(var41, -4847);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field10564;
                }
                field2325[field2318++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2325[--field2318];
                class764 var45 = class365.method2289(var44, -4847);
                String var46 = "";
                if (var45 != null && var45.field10559 != null) {
                    var46 = var45.field10559;
                }
                field2327[field2304++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2325[--field2318];
                field2327[field2304++] = class191.field2543.method1897((byte) -96, var47).field396;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2325[--field2318];
                class27 var49 = class191.field2543.method1897((byte) -96, var48);
                if (var49.field392 == null) {
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = var49.field392.length;
                return;
            }
            if (arg0 == 5052) {
                field2318 -= 2;
                int var50 = field2325[field2318];
                int var51 = field2325[field2318 + 1];
                class27 var52 = class191.field2543.method1897((byte) -96, var50);
                int var53 = var52.field392[var51];
                field2325[field2318++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2325[--field2318];
                class27 var55 = class191.field2543.method1897((byte) -96, var54);
                if (var55.field403 == null) {
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = var55.field403.length;
                return;
            }
            if (arg0 == 5054) {
                field2318 -= 2;
                int var56 = field2325[field2318];
                int var57 = field2325[field2318 + 1];
                field2325[field2318++] = class191.field2543.method1897((byte) -96, var56).field403[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2325[--field2318];
                field2327[field2304++] = class445.field6245.method609(var58, 17408).method1953(80);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2325[--field2318];
                class311 var60 = class445.field6245.method609(var59, 17408);
                if (var60.field4480 == null) {
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = var60.field4480.length;
                return;
            }
            if (arg0 == 5057) {
                field2318 -= 2;
                int var61 = field2325[field2318];
                int var62 = field2325[field2318 + 1];
                field2325[field2318++] = class445.field6245.method609(var61, 17408).field4480[var62];
                return;
            }
            if (arg0 == 5058) {
                field2319 = new class146();
                field2319.field2075 = field2325[--field2318];
                field2319.field2071 = class445.field6245.method609(field2319.field2075, 17408);
                field2319.field2074 = new int[field2319.field2071.method1951((byte) -26)];
                return;
            }
            if (arg0 == 5059) {
                field2310++;
                class267 var63 = class545.method3099((byte) 89, class269.field3966, class634.field8853);
                var63.field3938.method2380(65280, 0);
                int var64 = var63.field3938.field5459;
                var63.field3938.method2380(65280, 0);
                var63.field3938.method2415(false, field2319.field2075);
                field2319.field2071.method1956(var63.field3938, field2319.field2074, 60);
                var63.field3938.method2394(113, var63.field3938.field5459 - var64);
                class617.method3392(var63, true);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2327[--field2304];
                field2303++;
                class267 var66 = class545.method3099((byte) 108, class269.field3966, class280.field4127);
                var66.field3938.method2380(65280, 0);
                int var67 = var66.field3938.field5459;
                var66.field3938.method2349(85, var65);
                var66.field3938.method2415(false, field2319.field2075);
                field2319.field2071.method1956(var66.field3938, field2319.field2074, 60);
                var66.field3938.method2394(126, var66.field3938.field5459 - var67);
                class617.method3392(var66, true);
                return;
            }
            if (arg0 == 5061) {
                field2310++;
                class267 var68 = class545.method3099((byte) 54, class269.field3966, class634.field8853);
                var68.field3938.method2380(65280, 0);
                int var69 = var68.field3938.field5459;
                var68.field3938.method2380(65280, 1);
                var68.field3938.method2415(false, field2319.field2075);
                field2319.field2071.method1956(var68.field3938, field2319.field2074, 60);
                var68.field3938.method2394(123, var68.field3938.field5459 - var69);
                class617.method3392(var68, true);
                return;
            }
            if (arg0 == 5062) {
                field2318 -= 2;
                int var70 = field2325[field2318];
                int var71 = field2325[field2318 + 1];
                field2325[field2318++] = class191.field2543.method1897((byte) -96, var70).field393[var71];
                return;
            }
            if (arg0 == 5063) {
                field2318 -= 2;
                int var72 = field2325[field2318];
                int var73 = field2325[field2318 + 1];
                field2325[field2318++] = class191.field2543.method1897((byte) -96, var72).field398[var73];
                return;
            }
            if (arg0 == 5064) {
                field2318 -= 2;
                int var74 = field2325[field2318];
                int var75 = field2325[field2318 + 1];
                if (var75 == -1) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = class191.field2543.method1897((byte) -96, var74).method208(-29329, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field2318 -= 2;
                int var76 = field2325[field2318];
                int var77 = field2325[field2318 + 1];
                if (var77 == -1) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = class191.field2543.method1897((byte) -96, var76).method202((char) var77, 95);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2325[--field2318];
                field2325[field2318++] = class445.field6245.method609(var78, 17408).method1951((byte) -26);
                return;
            }
            if (arg0 == 5067) {
                field2318 -= 2;
                int var79 = field2325[field2318];
                int var80 = field2325[field2318 + 1];
                int var81 = class445.field6245.method609(var79, 17408).method1958(0, var80).field6015;
                field2325[field2318++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2318 -= 2;
                int var82 = field2325[field2318];
                int var83 = field2325[field2318 + 1];
                field2319.field2074[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2318 -= 2;
                int var84 = field2325[field2318];
                int var85 = field2325[field2318 + 1];
                field2319.field2074[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2318 -= 3;
                int var86 = field2325[field2318];
                int var87 = field2325[field2318 + 1];
                int var88 = field2325[field2318 + 2];
                class311 var89 = class445.field6245.method609(var86, 17408);
                if (var89.method1958(0, var87).field6015 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2325[field2318++] = var89.method1955(var88, -1, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2327[--field2304];
                boolean var91 = field2325[--field2318] == 1;
                class172.method1219(var90, 18123, var91);
                field2325[field2318++] = class774.field10661;
                return;
            }
            if (arg0 == 5072) {
                if (class356.field5214 != null && class537.field7313 < class774.field10661) {
                    field2325[field2318++] = class356.field5214[class537.field7313++] & 0xFFFF;
                    return;
                }
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class537.field7313 = 0;
                return;
            }
            if (arg0 == 5074) {
                class267 var92 = class545.method3099((byte) 40, class269.field3966, class634.field8853);
                var92.field3938.method2380(65280, 0);
                int var93 = var92.field3938.field5459;
                var92.field3938.method2380(65280, 2);
                var92.field3938.method2415(false, field2319.field2075);
                field2319.field2071.method1956(var92.field3938, field2319.field2074, 60);
                var92.field3938.method2394(89, var92.field3938.field5459 - var93);
                class617.method3392(var92, true);
                return;
            }
            if (arg0 == 5075) {
                class267 var94 = class545.method3099((byte) 36, class269.field3966, class634.field8853);
                var94.field3938.method2380(65280, 0);
                int var95 = var94.field3938.field5459;
                var94.field3938.method2380(65280, 3);
                var94.field3938.method2415(false, field2319.field2075);
                field2319.field2071.method1956(var94.field3938, field2319.field2074, 60);
                var94.field3938.method2394(82, var94.field3938.field5459 - var95);
                class617.method3392(var94, true);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class469.field6507.method828(-2, 86)) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class469.field6507.method828(-2, 82)) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class469.field6507.method828(-2, 81)) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class250.method1677(200, field2325[--field2318]);
                return;
            }
            if (arg0 == 5201) {
                field2325[field2318++] = class360.method2261(65);
                return;
            }
            if (arg0 == 5205) {
                class685.method3806(field2325[--field2318], -1, -1, false, false);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field2325[--field2318];
                class485 var97 = class375.method2326(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = var97.field6712;
                return;
            }
            if (arg0 == 5207) {
                class485 var98 = class375.method2335(field2325[--field2318]);
                if (var98 != null && var98.field6718 != null) {
                    field2327[field2304++] = var98.field6718;
                    return;
                }
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2325[field2318++] = class183.field2452;
                field2325[field2318++] = class64.field907;
                return;
            }
            if (arg0 == 5209) {
                field2325[field2318++] = class375.field5447 + class276.field4092;
                field2325[field2318++] = class66.field947 + class375.field5434;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field2325[--field2318];
                class485 var100 = class375.method2335(var99);
                if (var100 == null) {
                    field2325[field2318++] = 0;
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = var100.field6711 >> 14 & 0x3FFF;
                field2325[field2318++] = var100.field6711 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field2325[--field2318];
                class485 var102 = class375.method2335(var101);
                if (var102 == null) {
                    field2325[field2318++] = 0;
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = var102.field6714 - var102.field6697;
                field2325[field2318++] = var102.field6717 - var102.field6720;
                return;
            }
            if (arg0 == 5212) {
                class57 var103 = class738.method4085(-63);
                if (var103 == null) {
                    field2325[field2318++] = -1;
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = var103.field793;
                int var104 = var103.field795 << 28 | class375.field5447 + var103.field803 << 14 | class375.field5434 + var103.field794;
                field2325[field2318++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class57 var105 = class97.method763(-10100);
                if (var105 == null) {
                    field2325[field2318++] = -1;
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = var105.field793;
                int var106 = var105.field795 << 28 | class375.field5447 + var105.field803 << 14 | class375.field5434 + var105.field794;
                field2325[field2318++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field2325[--field2318];
                class485 var108 = class425.method2605(-101);
                if (var108 != null) {
                    boolean var109 = var108.method2814(-44, var107 & 0x3FFF, var107 >> 14 & 0x3FFF, field2329, var107 >> 28 & 0x3);
                    if (var109) {
                        class429.method2618(112, field2329[2], field2329[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2318 -= 2;
                int var110 = field2325[field2318];
                int var111 = field2325[field2318 + 1];
                class84 var112 = class375.method2347(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class485 var114 = (class485) var112.method697(0); var114 != null; var114 = (class485) var112.method699(true)) {
                    if (var114.field6712 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field2325[--field2318];
                class485 var116 = class375.method2335(var115);
                if (var116 == null) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = var116.field6721;
                return;
            }
            if (arg0 == 5220) {
                field2325[field2318++] = class37.field579 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field2325[--field2318];
                class429.method2618(108, var117 & 0x3FFF, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class485 var118 = class425.method2605(-72);
                if (var118 != null) {
                    boolean var119 = var118.method2822(class66.field947 + class375.field5434, field2329, class375.field5447 + class276.field4092, (byte) 96);
                    if (var119) {
                        field2325[field2318++] = field2329[1];
                        field2325[field2318++] = field2329[2];
                        return;
                    }
                    field2325[field2318++] = -1;
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = -1;
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2318 -= 2;
                int var120 = field2325[field2318];
                int var121 = field2325[field2318 + 1];
                class685.method3806(var120, var121 >> 14 & 0x3FFF, var121 & 0x3FFF, false, false);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field2325[--field2318];
                class485 var123 = class425.method2605(-88);
                if (var123 != null) {
                    boolean var124 = var123.method2814(-110, var122 & 0x3FFF, var122 >> 14 & 0x3FFF, field2329, var122 >> 28 & 0x3);
                    if (var124) {
                        field2325[field2318++] = field2329[1];
                        field2325[field2318++] = field2329[2];
                        return;
                    }
                    field2325[field2318++] = -1;
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = -1;
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field2325[--field2318];
                class485 var126 = class425.method2605(-90);
                if (var126 != null) {
                    boolean var127 = var126.method2822(var125 & 0x3FFF, field2329, var125 >> 14 & 0x3FFF, (byte) -56);
                    if (var127) {
                        field2325[field2318++] = field2329[1];
                        field2325[field2318++] = field2329[2];
                        return;
                    }
                    field2325[field2318++] = -1;
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = -1;
                field2325[field2318++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class730.method4055(field2325[--field2318], (byte) 51);
                return;
            }
            if (arg0 == 5227) {
                field2318 -= 2;
                int var128 = field2325[field2318];
                int var129 = field2325[field2318 + 1];
                class685.method3806(var128, var129 >> 14 & 0x3FFF, var129 & 0x3FFF, true, false);
                return;
            }
            if (arg0 == 5228) {
                class632.field8829 = field2325[--field2318] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2325[field2318++] = class632.field8829 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field2325[--field2318];
                class468.method2764(-108, var130);
                return;
            }
            if (arg0 == 5231) {
                field2318 -= 2;
                int var131 = field2325[field2318];
                boolean var132 = field2325[field2318 + 1] == 1;
                if (class516.field7054 != null) {
                    class101 var133 = class516.field7054.method3953((long) var131, 14);
                    if (var133 != null && !var132) {
                        var133.method792((byte) -100);
                        return;
                    }
                    if (var133 == null && var132) {
                        class101 var134 = new class101();
                        class516.field7054.method3962((long) var131, var134, -121);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field2325[--field2318];
                if (class516.field7054 != null) {
                    class101 var136 = class516.field7054.method3953((long) var135, 14);
                    field2325[field2318++] = var136 == null ? 0 : 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2318 -= 2;
                int var137 = field2325[field2318];
                boolean var138 = field2325[field2318 + 1] == 1;
                if (class504.field6974 != null) {
                    class101 var139 = class504.field6974.method3953((long) var137, 14);
                    if (var139 != null && !var138) {
                        var139.method792((byte) -119);
                        return;
                    }
                    if (var139 == null && var138) {
                        class101 var140 = new class101();
                        class504.field6974.method3962((long) var137, var140, -114);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field2325[--field2318];
                if (class504.field6974 != null) {
                    class101 var142 = class504.field6974.method3953((long) var141, 14);
                    field2325[field2318++] = var142 == null ? 0 : 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2325[field2318++] = class375.field5414 == null ? -1 : class375.field5414.field6712;
                return;
            }
            if (arg0 == 5236) {
                field2318 -= 2;
                int var143 = field2325[field2318];
                int var144 = field2325[field2318 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class357.method2251(var145, var143, var146, 12835);
                if (var147 < 0) {
                    field2325[field2318++] = -1;
                    return;
                }
                field2325[field2318++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class150.method1117(-86);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2318 -= 2;
                int var148 = field2325[field2318];
                int var149 = field2325[field2318 + 1];
                class142.method1090(var148, -352753888, 3, var149, false);
                field2325[field2318++] = class632.field8832 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class632.field8832 != null) {
                    class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(47), -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class103[] var150 = class470.method2770((byte) 108);
                field2325[field2318++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field2325[--field2318];
                class103[] var152 = class470.method2770((byte) 68);
                field2325[field2318++] = var152[var151].field1420;
                field2325[field2318++] = var152[var151].field1419;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class751.field10404;
                int var154 = class148.field2081;
                int var155 = -1;
                class103[] var156 = class470.method2770((byte) 51);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class103 var158 = var156[var157];
                    if (var158.field1420 == var153 && var158.field1419 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field2325[field2318++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field2325[field2318++] = class485.method2816(98);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field2325[--field2318];
                if (var159 >= 1 && var159 <= 2) {
                    class142.method1090(-1, -352753888, var159, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2325[field2318++] = class712.field9959.field1277.method1299(113);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field2325[--field2318];
                if (var160 >= 1 && var160 <= 2) {
                    class712.field9959.method735(var160, class712.field9959.field1277, 93);
                    class712.field9959.method735(var160, class712.field9959.field1279, 87);
                    class617.method3389(false);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2304 -= 2;
                String var161 = field2327[field2304];
                String var162 = field2327[field2304 + 1];
                int var163 = field2325[--field2318];
                field2306++;
                class267 var164 = class545.method3099((byte) 43, class269.field3966, class184.field2462);
                var164.field3938.method2380(65280, class469.method2769(var161, (byte) 91) + class469.method2769(var162, (byte) 73) + 1);
                var164.field3938.method2349(125, var161);
                var164.field3938.method2349(127, var162);
                var164.field3938.method2380(65280, var163);
                class617.method3392(var164, true);
                return;
            }
            if (arg0 == 5401) {
                field2318 -= 2;
                class659.field9120[field2325[field2318]] = (short) class546.method3107(field2325[field2318 + 1], 20973);
                class770.field10602.method2472((byte) 108);
                class770.field10602.method2469(122);
                class364.field5309.method3340((byte) -31);
                class229.method1502(0);
                return;
            }
            if (arg0 == 5405) {
                field2318 -= 2;
                int var165 = field2325[field2318];
                int var166 = field2325[field2318 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class136.field2001[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2318 -= 7;
                int var167 = field2325[field2318];
                int var168 = field2325[field2318 + 1] << 1;
                int var169 = field2325[field2318 + 2];
                int var170 = field2325[field2318 + 3];
                int var171 = field2325[field2318 + 4];
                int var172 = field2325[field2318 + 5];
                int var173 = field2325[field2318 + 6];
                if (var167 >= 0 && var167 < 2 && class136.field2001[var167] != null && var168 >= 0 && var168 < class136.field2001[var167].length) {
                    class136.field2001[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class136.field2001[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class136.field2001[field2325[--field2318]].length >> 1;
                field2325[field2318++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class632.field8832 != null) {
                    class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(57), -1, false);
                }
                if (class388.field5642 != null) {
                    class454.method2696((byte) 9);
                    System.exit(0);
                    return;
                }
                String var175 = class189.field2518 == null ? class777.method4302((byte) 124) : class189.field2518;
                class142.method1088(class712.field9959.field1270.method4293(43) == 1, -22283, false, var175, class730.field10124);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class132.field1949 != null) {
                    if (class132.field1949.field8318 == null) {
                        var176 = class304.method1914(67, class132.field1949.field8323);
                    } else {
                        var176 = (String) class132.field1949.field8318;
                    }
                }
                field2327[field2304++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field2325[field2318++] = class730.field10124.field984 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class632.field8832 != null) {
                    class142.method1090(-1, -352753888, class712.field9959.field1277.method1299(63), -1, false);
                }
                String var177 = field2327[--field2304];
                boolean var178 = field2325[--field2318] == 1;
                String var179 = class777.method4302((byte) 122) + var177;
                class142.method1088(class712.field9959.field1270.method4293(50) == 1, -22283, var178, var179, class730.field10124);
                return;
            }
            if (arg0 == 5422) {
                field2304 -= 2;
                String var180 = field2327[field2304];
                String var181 = field2327[field2304 + 1];
                int var182 = field2325[--field2318];
                if (var180.length() > 0) {
                    if (class556.field7494 == null) {
                        class556.field7494 = new String[class263.field3899[class21.field332.field4207]];
                    }
                    class556.field7494[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class187.field2493 == null) {
                        class187.field2493 = new String[class263.field3899[class21.field332.field4207]];
                    }
                    class187.field2493[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2327[--field2304]);
                return;
            }
            if (arg0 == 5424) {
                field2318 -= 11;
                class108.field1485 = field2325[field2318];
                class775.field10667 = field2325[field2318 + 1];
                class205.field2685 = field2325[field2318 + 2];
                class403.field5854 = field2325[field2318 + 3];
                class303.field4366 = field2325[field2318 + 4];
                class64.field908 = field2325[field2318 + 5];
                class740.field10216 = field2325[field2318 + 6];
                class225.field3082 = field2325[field2318 + 7];
                class446.field6257 = field2325[field2318 + 8];
                class434.field6145 = field2325[field2318 + 9];
                class597.field8130 = field2325[field2318 + 10];
                class643.field8927.method2104(-123, class303.field4366);
                class643.field8927.method2104(121, class64.field908);
                class643.field8927.method2104(25, class740.field10216);
                class643.field8927.method2104(107, class225.field3082);
                class643.field8927.method2104(-105, class446.field6257);
                class351.field5154 = null;
                class718.field10013 = null;
                class705.field9890 = null;
                class162.field2208 = null;
                class648.field9000 = null;
                class391.field5714 = null;
                class648.field9002 = null;
                class106.field1462 = null;
                class38.field591 = true;
                return;
            }
            if (arg0 == 5425) {
                class45.method347((byte) 95);
                class38.field591 = false;
                return;
            }
            if (arg0 == 5426) {
                field2318 -= 2;
                class118.field1724 = field2325[field2318];
                class607.field8248 = field2325[field2318 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2318 -= 2;
                class16.field246 = field2325[field2318 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2318 -= 2;
                int var183 = field2325[field2318];
                int var184 = field2325[field2318 + 1];
                field2325[field2318++] = class77.method671(var184, 28649, var183) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class739.method4093(field2327[--field2304], false, false, -1);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class623.method3414(class735.field10183, "accountcreated", (byte) 117);
                    return;
                } catch (Throwable var336) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class623.method3414(class735.field10183, "accountcreatestarted", (byte) 126);
                    return;
                } catch (Throwable var337) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class599.field8153 != null) {
                    Transferable var186 = class599.field8153.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var338) {
                        }
                    }
                }
                field2327[field2304++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class246.field3494 = field2325[--field2318];
                return;
            }
            if (arg0 == 5435) {
                field2325[field2318++] = class299.field4335 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2318 -= 4;
                int var187 = field2325[field2318];
                int var188 = field2325[field2318 + 1];
                int var189 = field2325[field2318 + 2];
                int var190 = field2325[field2318 + 3];
                class402.method2509(false, (var187 >> 14 & 0x3FFF) - class121.field1765, false, (var187 & 0x3FFF) - class230.field3147, var189, var188 << 2, var190);
                return;
            }
            if (arg0 == 5501) {
                field2318 -= 4;
                int var191 = field2325[field2318];
                int var192 = field2325[field2318 + 1];
                int var193 = field2325[field2318 + 2];
                int var194 = field2325[field2318 + 3];
                class419.method2586(var194, (var191 >> 14 & 0x3FFF) - class121.field1765, (var191 & 0x3FFF) - class230.field3147, var193, var192 << 2, -28384);
                return;
            }
            if (arg0 == 5502) {
                field2318 -= 6;
                int var195 = field2325[field2318];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class421.field6033 = var195;
                int var196 = field2325[field2318 + 1];
                if (var196 + 1 >= class136.field2001[class421.field6033].length >> 1) {
                    throw new RuntimeException();
                }
                class374.field5405 = var196;
                class258.field3854 = 0;
                class468.field6491 = field2325[field2318 + 2];
                class291.field4257 = field2325[field2318 + 3];
                int var197 = field2325[field2318 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class255.field3802 = var197;
                int var198 = field2325[field2318 + 5];
                if (var198 + 1 >= class136.field2001[class255.field3802].length >> 1) {
                    throw new RuntimeException();
                }
                class730.field10126 = var198;
                class502.field6938 = 3;
                class704.field9868 = -1;
                class518.field7072 = -1;
                return;
            }
            if (arg0 == 5503) {
                class574.method3209(27315);
                return;
            }
            if (arg0 == 5504) {
                field2318 -= 2;
                class749.method4137(field2325[field2318], 0, field2325[field2318 + 1], false);
                return;
            }
            if (arg0 == 5505) {
                field2325[field2318++] = (int) class282.field4151 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2325[field2318++] = (int) class135.field1974 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class618.method3396(-1);
                return;
            }
            if (arg0 == 5508) {
                class579.method3230(121);
                return;
            }
            if (arg0 == 5509) {
                class319.method2026(6817);
                return;
            }
            if (arg0 == 5510) {
                class492.method2856(-1);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field2325[--field2318];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class121.field1765;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class597.field8132) {
                    var202 = class597.field8132;
                }
                int var203 = var201 - class230.field3147;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class628.field8800) {
                    var203 = class628.field8800;
                }
                class500.field6902 = (var202 << 9) + 256;
                class734.field10175 = (var203 << 9) + 256;
                class502.field6938 = 4;
                class704.field9868 = -1;
                class518.field7072 = -1;
                return;
            }
            if (arg0 == 5512) {
                class558.method3145((byte) -44);
                return;
            }
            if (arg0 == 5514) {
                class330.field4772 = field2325[--field2318];
                return;
            }
            if (arg0 == 5516) {
                field2325[field2318++] = class330.field4772;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field2325[--field2318];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class121.field1765;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class597.field8132) {
                        var207 = class597.field8132;
                    }
                    int var208 = var206 - class230.field3147;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class628.field8800) {
                        var208 = class628.field8800;
                    }
                    class518.field7072 = (var207 << 9) + 256;
                    class704.field9868 = (var208 << 9) + 256;
                    return;
                }
                class518.field7072 = -1;
                class704.field9868 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2304 -= 2;
                String var209 = field2327[field2304];
                String var210 = field2327[field2304 + 1];
                int var211 = field2325[--field2318];
                class15.method114(var210, var211, 6, var209);
                return;
            }
            if (arg0 == 5601) {
                class446.method2676((byte) -122);
                return;
            }
            if (arg0 == 5602) {
                if (!class217.method1433(-1)) {
                    class608.method3365((byte) -109);
                }
                return;
            }
            if (arg0 == 5604) {
                field2304--;
                if (class458.field6355 != 3) {
                    return;
                }
                if (!class217.method1433(-1) && class268.field3949 == 0) {
                    class775.method4297(field2327[field2304], 28690);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2304 -= 2;
                field2318 -= 2;
                if (class458.field6355 != 3) {
                    return;
                }
                if (!class217.method1433(-1) && class268.field3949 == 0) {
                    class441.method2661(field2325[field2318], field2325[field2318 + 1] == 1, (byte) -91, field2327[field2304 + 1], field2327[field2304]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class268.field3949 == 0) {
                    class275.field4090 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2325[field2318++] = class24.field378;
                return;
            }
            if (arg0 == 5608) {
                field2325[field2318++] = class10.field164;
                return;
            }
            if (arg0 == 5609) {
                field2325[field2318++] = class275.field4090;
                return;
            }
            if (arg0 == 5611) {
                field2325[field2318++] = class624.field8383;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field2325[--field2318];
                class497.method2875(var212, -2030);
                return;
            }
            if (arg0 == 5613) {
                field2325[field2318++] = class24.field378;
                return;
            }
            if (arg0 == 5615) {
                field2304 -= 2;
                String var213 = field2327[field2304];
                String var214 = field2327[field2304 + 1];
                class767.method4250(var214, (byte) 123, var213);
                return;
            }
            if (arg0 == 5616) {
                class631.method3541(92, false);
                return;
            }
            if (arg0 == 5617) {
                field2325[field2318++] = class415.field5957;
                return;
            }
            if (arg0 == 5618) {
                field2318--;
                return;
            }
            if (arg0 == 5619) {
                field2318--;
                return;
            }
            if (arg0 == 5620) {
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2304 -= 2;
                field2318 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class570.field7586 != null) {
                    field2325[field2318++] = 1;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2325[field2318++] = (int) (class287.field4232 >> 32);
                field2325[field2318++] = (int) (class287.field4232 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field2325[field2318++] = class497.field6866 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class497.field6866 = true;
                class636.method3556((byte) -105);
                return;
            }
            if (arg0 == 5628) {
                field2325[field2318++] = class217.method1433(-1) ? 1 : 0;
                return;
            }
            if (arg0 == 5630) {
                class463.method2750((byte) 126);
                return;
            }
            if (arg0 == 5631) {
                field2318 -= 2;
                int var215 = field2325[field2318];
                int var216 = field2325[field2318 + 1];
                class449.method2684(var216, var215, 123);
                return;
            }
            if (arg0 == 5632) {
                int var217 = field2325[--field2318];
                class624.method3418(8, var217);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var218 = field2325[--field2318];
                class712.field9959.method735(var218, class712.field9959.field1278, 97);
                class627.method3531(-77);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var219 = field2325[--field2318] == 1;
                class712.field9959.method735(var219 ? 1 : 0, class712.field9959.field1305, 120);
                class712.field9959.method735(var219 ? 1 : 0, class712.field9959.field1320, 76);
                class627.method3531(-99);
                class652.method3627(-4);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var220 = field2325[--field2318] == 1;
                class712.field9959.method735(var220 ? 2 : 1, class712.field9959.field1291, 73);
                class712.field9959.method735(var220 ? 2 : 1, class712.field9959.field1313, 113);
                class652.method3627(-4);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6005) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1287, 90);
                class627.method3531(-44);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6007) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1276, 92);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6008) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1281, 94);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6010) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1318, 93);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6011) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1319, 113);
                class627.method3531(-37);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6012) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1288, 105);
                class686.method3808(false);
                class596.method3322((byte) 66);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6014) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 2 : 0, class712.field9959.field1322, 76);
                class627.method3531(-115);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6015) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1316, 101);
                class627.method3531(-83);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6016) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1271, 95);
                class793.method4365((byte) -41, false, class712.field9959.field1270.method4293(72));
                class617.method3389(false);
                return;
            }
            if (arg0 == 6017) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1296, 78);
                class503.method2923(1);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6018) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1275, 93);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field2325[--field2318];
                int var222 = class712.field9959.field1303.method3352(115);
                if (var221 != var222) {
                    if (class732.method4059(true, class458.field6355)) {
                        if (var222 == 0 && class757.field10503 != -1) {
                            class543.method3091(false, class757.field10503, var221, 0, class177.field2367, (byte) -65);
                            class237.method1532(0);
                            class645.field8963 = false;
                        } else if (var221 == 0) {
                            class583.method3245(0);
                            class645.field8963 = false;
                        } else {
                            class92.method744(true, var221);
                        }
                    }
                    class712.field9959.method735(var221, class712.field9959.field1303, 119);
                    class617.method3389(false);
                    class747.field10301 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1280, 84);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6021) {
                int var223 = class712.field9959.field1291.method1949(125);
                class712.field9959.method735(field2325[--field2318] == 1 ? 0 : var223, class712.field9959.field1313, 126);
                class652.method3627(-4);
                return;
            }
            if (arg0 == 6023) {
                int var224 = field2325[--field2318];
                class712.field9959.method735(var224, class712.field9959.field1274, 102);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6024) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1300, 101);
                class617.method3389(false);
                return;
            }
            if (arg0 == 6025) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1297, 71);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6027) {
                int var225 = field2325[--field2318];
                if (var225 < 0 || var225 > 1) {
                    var225 = 0;
                }
                class688.method3821((byte) -31, var225 == 1);
                return;
            }
            if (arg0 == 6028) {
                class712.field9959.method735(field2325[--field2318] == 0 ? 0 : 1, class712.field9959.field1285, 74);
                class617.method3389(false);
                return;
            }
            if (arg0 == 6029) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1276, 101);
                class617.method3389(false);
                return;
            }
            if (arg0 == 6030) {
                class712.field9959.method735(field2325[--field2318] == 0 ? 0 : 1, class712.field9959.field1301, 107);
                class617.method3389(false);
                class627.method3531(-65);
                return;
            }
            if (arg0 == 6031) {
                int var226 = field2325[--field2318];
                if (var226 < 0 || var226 > 5) {
                    var226 = 2;
                }
                class793.method4365((byte) -41, false, var226);
                return;
            }
            if (arg0 == 6032) {
                field2318 -= 2;
                int var227 = field2325[field2318];
                boolean var228 = field2325[field2318 + 1] == 1;
                class712.field9959.method735(var227, class712.field9959.field1299, 126);
                if (!var228) {
                    class712.field9959.method735(0, class712.field9959.field1311, 79);
                }
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6033) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1304, 120);
                class617.method3389(false);
                return;
            }
            if (arg0 == 6034) {
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : 0, class712.field9959.field1307, 79);
                class617.method3389(false);
                class686.method3808(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6035) {
                int var229 = class712.field9959.field1305.method4251(85);
                class712.field9959.method735(field2325[--field2318] == 1 ? 1 : var229, class712.field9959.field1320, 86);
                class627.method3531(-68);
                class652.method3627(-4);
                return;
            }
            if (arg0 == 6036) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1293, 98);
                class617.method3389(false);
                class92.field1310 = true;
                return;
            }
            if (arg0 == 6037) {
                class712.field9959.method735(field2325[--field2318], class712.field9959.field1321, 119);
                class617.method3389(false);
                class747.field10301 = false;
                return;
            }
            if (arg0 == 6038) {
                int var230 = field2325[--field2318];
                int var231 = class712.field9959.field1308.method3352(57);
                if (var230 != var231 && class757.field10503 == class544.field7379) {
                    if (!class732.method4059(true, class458.field6355)) {
                        if (var231 == 0) {
                            class543.method3091(false, class757.field10503, var230, 0, class177.field2367, (byte) -65);
                            class237.method1532(0);
                            class645.field8963 = false;
                        } else if (var230 == 0) {
                            class583.method3245(0);
                            class645.field8963 = false;
                        } else {
                            class92.method744(true, var230);
                        }
                    }
                    class712.field9959.method735(var230, class712.field9959.field1308, 100);
                    class617.method3389(false);
                    class747.field10301 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var232 = field2325[--field2318];
                if (var232 > 255 || var232 < 0) {
                    var232 = 0;
                }
                if (var232 != class712.field9959.field1290.method2537(42)) {
                    class712.field9959.method735(var232, class712.field9959.field1290, 94);
                    class617.method3389(false);
                    class747.field10301 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var233 = field2325[--field2318];
                if (var233 != class712.field9959.field1323.method3651(26)) {
                    class712.field9959.method735(var233, class712.field9959.field1323, 105);
                    class617.method3389(false);
                    class747.field10301 = false;
                    class332.method2082(71);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2325[field2318++] = class712.field9959.field1278.method2685(46);
                return;
            }
            if (arg0 == 6102) {
                field2325[field2318++] = class712.field9959.field1305.method4251(87) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2325[field2318++] = class712.field9959.field1291.method1949(73) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2325[field2318++] = class712.field9959.field1287.method1486(85) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2325[field2318++] = class712.field9959.field1276.method1(107);
                return;
            }
            if (arg0 == 6108) {
                field2325[field2318++] = class712.field9959.field1281.method3011(127) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2325[field2318++] = class712.field9959.field1318.method1378(29) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2325[field2318++] = class712.field9959.field1319.method2854(104);
                return;
            }
            if (arg0 == 6112) {
                field2325[field2318++] = class712.field9959.field1288.method3327(124) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2325[field2318++] = class712.field9959.field1322.method1363(11) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2325[field2318++] = class712.field9959.field1316.method1192(69) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2325[field2318++] = class712.field9959.field1271.method2880(32);
                return;
            }
            if (arg0 == 6117) {
                field2325[field2318++] = class712.field9959.field1296.method4127(79) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2325[field2318++] = class712.field9959.field1275.method3352(47);
                return;
            }
            if (arg0 == 6119) {
                field2325[field2318++] = class712.field9959.field1303.method3352(53);
                return;
            }
            if (arg0 == 6120) {
                field2325[field2318++] = class712.field9959.field1280.method3352(42);
                return;
            }
            if (arg0 == 6123) {
                field2325[field2318++] = class472.method2776(113);
                return;
            }
            if (arg0 == 6124) {
                field2325[field2318++] = class712.field9959.field1300.method2880(81);
                return;
            }
            if (arg0 == 6125) {
                field2325[field2318++] = class712.field9959.field1297.method2806(10);
                return;
            }
            if (arg0 == 6127) {
                field2325[field2318++] = class712.field9959.field1312.method2681(13) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2325[field2318++] = class712.field9959.field1285.method800(95) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2325[field2318++] = class712.field9959.field1276.method1(112);
                return;
            }
            if (arg0 == 6130) {
                field2325[field2318++] = class712.field9959.field1301.method2583(47) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2325[field2318++] = class712.field9959.field1270.method4293(71);
                return;
            }
            if (arg0 == 6132) {
                field2325[field2318++] = class712.field9959.field1299.method4293(23);
                return;
            }
            if (arg0 == 6133) {
                field2325[field2318++] = class730.field10124.field984 && !class730.field10124.field977 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field2325[field2318++] = class712.field9959.field1304.method3993(69);
                return;
            }
            if (arg0 == 6136) {
                field2325[field2318++] = class712.field9959.field1307.method1209(112) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2325[field2318++] = class186.method1290(200, (byte) 28, class712.field9959.field1270.method4293(48));
                return;
            }
            if (arg0 == 6139) {
                field2325[field2318++] = class712.field9959.field1293.method1488(112);
                return;
            }
            if (arg0 == 6142) {
                field2325[field2318++] = class712.field9959.field1321.method3352(9);
                return;
            }
            if (arg0 == 6143) {
                field2325[field2318++] = class712.field9959.field1308.method3352(65);
                return;
            }
            if (arg0 == 6144) {
                field2325[field2318++] = class341.field4919 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2325[field2318++] = class712.field9959.field1290.method2537(122);
                return;
            }
            if (arg0 == 6146) {
                field2325[field2318++] = class712.field9959.field1323.method3651(76);
                return;
            }
            if (arg0 == 6147) {
                field2325[field2318++] = class693.field9717.field550 < 512 || class341.field4919 || class648.field9005 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field2325[field2318++] = class430.field6119 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2318 -= 2;
                class549.field7448 = (short) field2325[field2318];
                if (class549.field7448 <= 0) {
                    class549.field7448 = 256;
                }
                class396.field5820 = (short) field2325[field2318 + 1];
                if (class396.field5820 <= 0) {
                    class396.field5820 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2318 -= 2;
                class492.field6820 = (short) field2325[field2318];
                if (class492.field6820 <= 0) {
                    class492.field6820 = 256;
                }
                class10.field166 = (short) field2325[field2318 + 1];
                if (class10.field166 <= 0) {
                    class10.field166 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2318 -= 4;
                class665.field9200 = (short) field2325[field2318];
                if (class665.field9200 <= 0) {
                    class665.field9200 = 1;
                }
                class537.field7311 = (short) field2325[field2318 + 1];
                if (class537.field7311 <= 0) {
                    class537.field7311 = 32767;
                } else if (class537.field7311 < class665.field9200) {
                    class537.field7311 = class665.field9200;
                }
                class551.field7455 = (short) field2325[field2318 + 2];
                if (class551.field7455 <= 0) {
                    class551.field7455 = 1;
                }
                class521.field7158 = (short) field2325[field2318 + 3];
                if (class521.field7158 <= 0) {
                    class521.field7158 = 32767;
                    return;
                }
                if (class521.field7158 < class551.field7455) {
                    class521.field7158 = class551.field7455;
                }
                return;
            }
            if (arg0 == 6203) {
                class89.method722(class249.field3687.field9282, class249.field3687.field9297, 6680, 0, 0, false);
                field2325[field2318++] = class142.field2056;
                field2325[field2318++] = class634.field8854;
                return;
            }
            if (arg0 == 6204) {
                field2325[field2318++] = class492.field6820;
                field2325[field2318++] = class10.field166;
                return;
            }
            if (arg0 == 6205) {
                field2325[field2318++] = class549.field7448;
                field2325[field2318++] = class396.field5820;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2325[field2318++] = (int) (class302.method1910(0) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2325[field2318++] = (int) (class302.method1910(0) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2318 -= 3;
                int var234 = field2325[field2318];
                int var235 = field2325[field2318 + 1];
                int var236 = field2325[field2318 + 2];
                long var237 = class156.method1144(var235, 0, 12, var234, var236, 0, 0);
                int var239 = class545.method3102(var237, (byte) 91);
                if (var236 < 1970) {
                    var239--;
                }
                field2325[field2318++] = var239;
                return;
            }
            if (arg0 == 6303) {
                field2325[field2318++] = class545.method3103(127, class302.method1910(0));
                return;
            }
            if (arg0 == 6304) {
                int var240 = field2325[--field2318];
                boolean var241 = true;
                if (var240 < 0) {
                    var241 = (var240 + 1) % 4 == 0;
                } else if (var240 < 1582) {
                    var241 = var240 % 4 == 0;
                } else if (var240 % 4 != 0) {
                    var241 = false;
                } else if (var240 % 100 != 0) {
                    var241 = true;
                } else if (var240 % 400 != 0) {
                    var241 = false;
                }
                field2325[field2318++] = var241 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var242 = field2325[--field2318];
                int[] var243 = class457.method2707((byte) 92, var242);
                class278.method1798(var243, 0, field2325, field2318, 3);
                field2318 += 3;
                return;
            }
            if (arg0 == 6306) {
                int var244 = field2325[--field2318];
                field2325[field2318++] = (int) (class139.method1074(var244, -80) / 60000L);
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2325[field2318++] = class176.method1245(-28747) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2325[field2318++] = class183.method1270((byte) -58) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class458.field6355 == 7 && !class217.method1433(-1) && class268.field3949 == 0) {
                    if (class750.field10331) {
                        field2325[field2318++] = 0;
                        return;
                    }
                    if (class3.field17 > class302.method1910(0) - 1000L) {
                        field2325[field2318++] = 1;
                        return;
                    }
                    class750.field10331 = true;
                    class267 var245 = class545.method3099((byte) 111, class269.field3966, class689.field9684);
                    var245.field3938.method2354(class133.field1961, (byte) 61);
                    class617.method3392(var245, true);
                    field2325[field2318++] = 0;
                    return;
                }
                field2325[field2318++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class513 var246 = class378.method2417(false);
                if (var246 != null) {
                    field2325[field2318++] = var246.field7034;
                    field2325[field2318++] = var246.field10838;
                    field2327[field2304++] = var246.field7030;
                    class51 var247 = var246.method2985(-1);
                    field2325[field2318++] = var247.field738;
                    field2327[field2304++] = var247.field740;
                    field2325[field2318++] = var246.field10842;
                    field2325[field2318++] = var246.field7032;
                    field2327[field2304++] = var246.field7035;
                    return;
                }
                field2325[field2318++] = -1;
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 6502) {
                class513 var248 = class577.method3219(92);
                if (var248 != null) {
                    field2325[field2318++] = var248.field7034;
                    field2325[field2318++] = var248.field10838;
                    field2327[field2304++] = var248.field7030;
                    class51 var249 = var248.method2985(-1);
                    field2325[field2318++] = var249.field738;
                    field2327[field2304++] = var249.field740;
                    field2325[field2318++] = var248.field10842;
                    field2325[field2318++] = var248.field7032;
                    field2327[field2304++] = var248.field7035;
                    return;
                }
                field2325[field2318++] = -1;
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var250 = field2325[--field2318];
                String var251 = field2327[--field2304];
                if (class458.field6355 == 7 && !class217.method1433(-1) && class268.field3949 == 0) {
                    field2325[field2318++] = class57.method408(var251, var250, false) ? 1 : 0;
                    return;
                }
                field2325[field2318++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var252 = field2325[--field2318];
                class513 var253 = class773.method4286(var252, 46);
                if (var253 != null) {
                    field2325[field2318++] = var253.field10838;
                    field2327[field2304++] = var253.field7030;
                    class51 var254 = var253.method2985(-1);
                    field2325[field2318++] = var254.field738;
                    field2327[field2304++] = var254.field740;
                    field2325[field2318++] = var253.field10842;
                    field2325[field2318++] = var253.field7032;
                    field2327[field2304++] = var253.field7035;
                    return;
                }
                field2325[field2318++] = -1;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                field2325[field2318++] = 0;
                field2325[field2318++] = 0;
                field2327[field2304++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2318 -= 4;
                int var255 = field2325[field2318];
                boolean var256 = field2325[field2318 + 1] == 1;
                int var257 = field2325[field2318 + 2];
                boolean var258 = field2325[field2318 + 3] == 1;
                class619.method3400(-108, var257, var256, var258, var255);
                return;
            }
            if (arg0 == 6508) {
                class627.method3529(37);
                return;
            }
            if (arg0 == 6509) {
                if (class458.field6355 != 7) {
                    return;
                }
                class42.field647 = field2325[--field2318] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2325[field2318++] = class695.field9739;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class432.field6132 == class403.field5855) {
                if (arg0 == 6700) {
                    int var259 = class609.field8283.method3963((byte) 115);
                    if (class69.field968 != -1) {
                        var259++;
                    }
                    field2325[field2318++] = var259;
                    return;
                }
                if (arg0 == 6701) {
                    int var260 = field2325[--field2318];
                    if (class69.field968 != -1) {
                        if (var260 == 0) {
                            field2325[field2318++] = class69.field968;
                            return;
                        }
                        var260--;
                    }
                    class237 var261 = (class237) class609.field8283.method3960(0);
                    while (var260-- > 0) {
                        var261 = (class237) class609.field8283.method3955((byte) -73);
                    }
                    field2325[field2318++] = var261.field3202;
                    return;
                }
                if (arg0 == 6702) {
                    int var262 = field2325[--field2318];
                    if (class111.field1528[var262] == null) {
                        field2327[field2304++] = "";
                        return;
                    }
                    String var263 = class111.field1528[var262][0].field9313;
                    if (var263 == null) {
                        field2327[field2304++] = "";
                        return;
                    }
                    field2327[field2304++] = var263.substring(0, var263.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var264 = field2325[--field2318];
                    if (class111.field1528[var264] == null) {
                        field2325[field2318++] = 0;
                        return;
                    }
                    field2325[field2318++] = class111.field1528[var264].length;
                    return;
                }
                if (arg0 == 6704) {
                    field2318 -= 2;
                    int var265 = field2325[field2318];
                    int var266 = field2325[field2318 + 1];
                    if (class111.field1528[var265] == null) {
                        field2327[field2304++] = "";
                        return;
                    }
                    String var267 = class111.field1528[var265][var266].field9313;
                    if (var267 == null) {
                        field2327[field2304++] = "";
                        return;
                    }
                    field2327[field2304++] = var267;
                    return;
                }
                if (arg0 == 6705) {
                    field2318 -= 2;
                    int var268 = field2325[field2318];
                    int var269 = field2325[field2318 + 1];
                    if (class111.field1528[var268] == null) {
                        field2325[field2318++] = 0;
                        return;
                    }
                    field2325[field2318++] = class111.field1528[var268][var269].field9334;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field2318 -= 3;
                    int var270 = field2325[field2318];
                    int var271 = field2325[field2318 + 1];
                    int var272 = field2325[field2318 + 2];
                    class24.method192(true, var272, var270 << 16 | var271, "", 1);
                    return;
                }
                if (arg0 == 6708) {
                    field2318 -= 3;
                    int var273 = field2325[field2318];
                    int var274 = field2325[field2318 + 1];
                    int var275 = field2325[field2318 + 2];
                    class24.method192(true, var275, var273 << 16 | var274, "", 2);
                    return;
                }
                if (arg0 == 6709) {
                    field2318 -= 3;
                    int var276 = field2325[field2318];
                    int var277 = field2325[field2318 + 1];
                    int var278 = field2325[field2318 + 2];
                    class24.method192(true, var278, var276 << 16 | var277, "", 3);
                    return;
                }
                if (arg0 == 6710) {
                    field2318 -= 3;
                    int var279 = field2325[field2318];
                    int var280 = field2325[field2318 + 1];
                    int var281 = field2325[field2318 + 2];
                    class24.method192(true, var281, var279 << 16 | var280, "", 4);
                    return;
                }
                if (arg0 == 6711) {
                    field2318 -= 3;
                    int var282 = field2325[field2318];
                    int var283 = field2325[field2318 + 1];
                    int var284 = field2325[field2318 + 2];
                    class24.method192(true, var284, var282 << 16 | var283, "", 5);
                    return;
                }
                if (arg0 == 6712) {
                    field2318 -= 3;
                    int var285 = field2325[field2318];
                    int var286 = field2325[field2318 + 1];
                    int var287 = field2325[field2318 + 2];
                    class24.method192(true, var287, var285 << 16 | var286, "", 6);
                    return;
                }
                if (arg0 == 6713) {
                    field2318 -= 3;
                    int var288 = field2325[field2318];
                    int var289 = field2325[field2318 + 1];
                    int var290 = field2325[field2318 + 2];
                    class24.method192(true, var290, var288 << 16 | var289, "", 7);
                    return;
                }
                if (arg0 == 6714) {
                    field2318 -= 3;
                    int var291 = field2325[field2318];
                    int var292 = field2325[field2318 + 1];
                    int var293 = field2325[field2318 + 2];
                    class24.method192(true, var293, var291 << 16 | var292, "", 8);
                    return;
                }
                if (arg0 == 6715) {
                    field2318 -= 3;
                    int var294 = field2325[field2318];
                    int var295 = field2325[field2318 + 1];
                    int var296 = field2325[field2318 + 2];
                    class24.method192(true, var296, var294 << 16 | var295, "", 9);
                    return;
                }
                if (arg0 == 6716) {
                    field2318 -= 3;
                    int var297 = field2325[field2318];
                    int var298 = field2325[field2318 + 1];
                    int var299 = field2325[field2318 + 2];
                    class24.method192(true, var299, var297 << 16 | var298, "", 10);
                    return;
                }
                if (arg0 == 6717) {
                    field2318 -= 3;
                    int var300 = field2325[field2318];
                    int var301 = field2325[field2318 + 1];
                    int var302 = field2325[field2318 + 2];
                    class668 var303 = class452.method2690(-4353, var300 << 16 | var301, var302);
                    class701.method3909(0);
                    class111 var304 = client.method2022(var303);
                    class348.method2196(var304.field1529, var303, -111, var304.method839(0));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var305 = field2325[--field2318];
                    class680 var306 = class495.field6846.method2232(var305, -102);
                    if (var306.field9496 == null) {
                        field2327[field2304++] = "";
                        return;
                    }
                    field2327[field2304++] = var306.field9496;
                    return;
                }
                if (arg0 == 6801) {
                    int var307 = field2325[--field2318];
                    class680 var308 = class495.field6846.method2232(var307, -97);
                    field2325[field2318++] = var308.field9536;
                    return;
                }
                if (arg0 == 6802) {
                    int var309 = field2325[--field2318];
                    class680 var310 = class495.field6846.method2232(var309, -89);
                    field2325[field2318++] = var310.field9541;
                    return;
                }
                if (arg0 == 6803) {
                    int var311 = field2325[--field2318];
                    class680 var312 = class495.field6846.method2232(var311, 105);
                    field2325[field2318++] = var312.field9512;
                    return;
                }
                if (arg0 == 6804) {
                    field2318 -= 2;
                    int var313 = field2325[field2318];
                    int var314 = field2325[field2318 + 1];
                    class486 var315 = class206.field2703.method3905(true, var314);
                    if (var315.method2825(0)) {
                        field2327[field2304++] = class495.field6846.method2232(var313, -41).method3755(var314, (byte) -35, var315.field6727);
                        return;
                    }
                    field2325[field2318++] = class495.field6846.method2232(var313, 82).method3758(var315.field6728, var314, 17110);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field2325[field2318++] = class739.field10205 && !class635.field8858 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field2325[field2318++] = (int) (class737.field10194 / 60000L);
                    field2325[field2318++] = (int) ((class737.field10194 - class302.method1910(0) - class466.field6470) / 60000L);
                    field2325[field2318++] = class158.field2174 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field2325[field2318++] = class432.field6130;
                    return;
                }
                if (arg0 == 6903) {
                    field2325[field2318++] = class20.field288;
                    return;
                }
                if (arg0 == 6904) {
                    field2325[field2318++] = class139.field2036;
                    return;
                }
                if (arg0 == 6905) {
                    String var316 = "";
                    if (class132.field1949 != null) {
                        if (class132.field1949.field8318 == null) {
                            var316 = class304.method1914(52, class132.field1949.field8323);
                        } else {
                            var316 = (String) class132.field1949.field8318;
                        }
                    }
                    field2327[field2304++] = var316;
                    return;
                }
                if (arg0 == 6906) {
                    field2325[field2318++] = class73.field1059;
                    return;
                }
                if (arg0 == 6907) {
                    field2325[field2318++] = class126.field1903;
                    return;
                }
                if (arg0 == 6908) {
                    field2325[field2318++] = class370.field5367;
                    return;
                }
                if (arg0 == 6909) {
                    field2325[field2318++] = class174.field2338 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field2325[field2318++] = class357.field5225;
                    return;
                }
                if (arg0 == 6911) {
                    field2325[field2318++] = class78.field1120;
                    return;
                }
                if (arg0 == 6912) {
                    field2325[field2318++] = class391.field5688;
                    return;
                }
                if (arg0 == 6913) {
                    field2325[field2318++] = class643.field8928;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var317 = class710.method3974((byte) 60);
                    field2325[field2318++] = class342.field4993 = class712.field9959.field1270.method4293(29);
                    field2325[field2318++] = var317;
                    class627.method3531(-57);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class117.method960(-18861);
                    class627.method3531(-92);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class57.method409(0);
                    class627.method3531(-82);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class310.method1948(1);
                    class627.method3531(-52);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class261.method1727(true, (byte) -67);
                    class627.method3531(-29);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class712.field9959.method735(0, class712.field9959.field1311, 111);
                    class617.method3389(false);
                    class747.field10301 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class342.field4993 == 2) {
                        class355.field5207 = true;
                        return;
                    }
                    if (class342.field4993 == 1) {
                        class24.field381 = true;
                        return;
                    }
                    if (class342.field4993 == 3) {
                        class73.field1074 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field2325[field2318++] = class712.field9959.field1311.method1780(111);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field2318 -= 2;
                    int var318 = field2325[field2318];
                    int var319 = field2325[field2318 + 1];
                    if (var318 != -1) {
                        if (var319 > 255) {
                            var319 = 255;
                        } else if (var319 < 0) {
                            var319 = 0;
                        }
                        class237.method1534(false, var318, (byte) -2, var319);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var320 = field2325[--field2318];
                    if (var320 != -1) {
                        class379.method2423(70, var320);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var321 = field2325[--field2318];
                    if (var321 != -1) {
                        class47.method358(51, var321);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field2325[field2318++] = class463.method2749("jagtheora", (byte) -118) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field2325[field2318++] = class712.field9959.field1287.method1483(118) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field2325[field2318++] = class712.field9959.field1318.method1379(113) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field2325[field2318++] = class712.field9959.field1319.method2852(-38) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field2325[field2318++] = class712.field9959.field1322.method1365(-74) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field2325[field2318++] = class712.field9959.field1300.method2882(110) && class379.field5542.method485() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field2325[field2318++] = class712.field9959.field1274.method2442(109) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field2325[field2318++] = class712.field9959.field1297.method2809(-101) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field2325[field2318++] = class712.field9959.field1312.method2675(-81) && class379.field5542.method478() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field2325[field2318++] = class712.field9959.field1301.method2575(125) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field2325[field2318++] = class712.field9959.field1307.method1210(-25) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field2325[field2318++] = class712.field9959.field1293.method1489(-90) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field2325[field2318++] = class712.field9959.field1316.method1193(119) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field2325[field2318++] = class712.field9959.field1323.method3654(2) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field2325[field2318++] = class712.field9959.field1299.method4290(-43) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var322 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1287.method4(var322, (byte) -115);
                    return;
                }
                if (arg0 == 7302) {
                    int var323 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1318.method4(var323, (byte) 21);
                    return;
                }
                if (arg0 == 7303) {
                    int var324 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1319.method4(var324, (byte) 52);
                    return;
                }
                if (arg0 == 7304) {
                    int var325 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1322.method4(var325, (byte) 41);
                    return;
                }
                if (arg0 == 7305) {
                    int var326 = field2325[--field2318];
                    if (!class379.field5542.method485()) {
                        field2325[field2318++] = 3;
                        return;
                    }
                    field2325[field2318++] = class712.field9959.field1300.method4(var326, (byte) -1);
                    return;
                }
                if (arg0 == 7306) {
                    int var327 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1274.method4(var327, (byte) 62);
                    return;
                }
                if (arg0 == 7307) {
                    int var328 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1297.method4(var328, (byte) -116);
                    return;
                }
                if (arg0 == 7308) {
                    int var329 = field2325[--field2318];
                    if (!class379.field5542.method478()) {
                        field2325[field2318++] = 3;
                        return;
                    }
                    field2325[field2318++] = class712.field9959.field1312.method4(var329, (byte) -128);
                    return;
                }
                if (arg0 == 7309) {
                    int var330 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1301.method4(var330, (byte) 79);
                    return;
                }
                if (arg0 == 7310) {
                    int var331 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1307.method4(var331, (byte) -107);
                    return;
                }
                if (arg0 == 7311) {
                    int var332 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1293.method4(var332, (byte) 124);
                    return;
                }
                if (arg0 == 7312) {
                    int var333 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1316.method4(var333, (byte) 61);
                    return;
                }
                if (arg0 == 7313) {
                    int var334 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1323.method4(var334, (byte) 49);
                    return;
                }
                if (arg0 == 7314) {
                    int var335 = field2325[--field2318];
                    field2325[field2318++] = class712.field9959.field1299.method4(var335, (byte) 117);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "()V")
    public static final void method1234() {
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ldaa;)V")
    public static final void method1235(class12 arg0) {
        method1228(arg0, 200000);
    }

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "(I)Ljava/lang/String;")
    private static final String method1236(int arg0) {
        String var1 = field2326.method3435(class21.field332.field4207 << 16 | arg0, (byte) 29);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(I)V")
    private static final void method1237(int arg0) {
        class668 var1 = class536.method3067(arg0, 0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class668[] var3 = class376.field5492[var2];
        if (var3 == null) {
            class668[] var4 = class111.field1528[var2];
            int var5 = var4.length;
            var3 = class376.field5492[var2] = new class668[var5];
            class278.method1799(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class278.method1799(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lml;II)V")
    public static final void method1238(class410 arg0, int arg1, int arg2) {
        class244 var3 = class532.method3049(arg2, arg1, (byte) -124, arg0);
        if (var3 == null) {
            return;
        }
        field2331 = new int[var3.field3291];
        field2332 = new String[var3.field3292];
        if (class245.field3305 == var3.field3294 || class719.field10027 == var3.field3294 || class651.field9030 == var3.field3294) {
            int var4 = 0;
            int var5 = 0;
            if (class474.field6605 != null) {
                var4 = class474.field6605.field9242;
                var5 = class474.field6605.field9257;
            }
            field2331[0] = class304.field4371.method778(0) - var4;
            field2331[1] = class304.field4371.method777((byte) -123) - var5;
        }
        method1224(var3, 200000);
    }
}
