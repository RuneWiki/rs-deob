import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class class249 {

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lor;")
    public static class668 field3687 = null;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "[[I")
    public static int[][] field3688;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V")
    public abstract void method844(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3692++;
        if (class174.field2335 <= arg2 && arg3 <= class751.field10402 && class523.field7178 <= arg6 && class495.field6845 >= arg0) {
            if (arg4 == 1) {
                class27.method207(arg6, arg2, (byte) -11, arg3, arg1, arg0);
            } else {
                class442.method2663(arg1, arg2, -1, arg3, arg6, arg4, arg0);
            }
        } else if (arg4 == 1) {
            class713.method3984(arg0, arg2, arg1, arg3, arg6, -3145);
        } else {
            class339.method2152(3314, arg0, arg2, arg4, arg6, arg3, arg1);
        }
        if (arg5 >= -80) {
            field3687 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)V")
    public abstract void method843(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field3687 = null;
        if (arg0 < 29) {
            field3687 = null;
        }
        field3688 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1674(int arg0, int arg1, byte arg2) {
        field3691++;
        if (arg2 != -31) {
            field3687 = null;
        }
        return (arg1 & 0x70000) != 0 | class577.method3217(arg1, arg0, 0) || class5.method35(arg1, (byte) -69, arg0);
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(BII)V")
    public abstract void method845(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Loba;III)V")
    public static final void method1675(class275 arg0, int arg1, int arg2, int arg3) {
        field3693++;
        if (arg0 == null || class280.field4138.field5921 == arg0) {
            return;
        }
        int var4 = arg0.field4076;
        int var5 = arg0.field4077;
        int var6 = arg0.field4080;
        int var7 = (int) arg0.field4079;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field4079;
        if (var6 == 17) {
            class452.field6294 = 0;
            class618.field8338++;
            class145.field2068 = arg3;
            class729.field10119 = 2;
            class181.field2402 = arg1;
            class267 var10 = class545.method3099((byte) 38, class269.field3966, class527.field7225);
            var10.field3938.method2362((byte) -115, var5 + class230.field3147);
            var10.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
            var10.field3938.method2415(false, class121.field1765 + var4);
            var10.field3938.method2363(29262, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class617.method3392(var10, true);
            class600.method3334(78, var4, var8, var5);
        }
        if (var6 == 11) {
            class73 var11 = class599.field8149[var7];
            if (var11 != null) {
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class181.field2402 = arg1;
                class729.field10119 = 2;
                class208.field2738++;
                class267 var12 = class545.method3099((byte) 53, class269.field3966, class24.field379);
                var12.field3938.method2415(false, var7);
                var12.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var12, true);
                class77.method672(0, var11.method655(-126), -2, (byte) -26, var11.field1884[0], var11.field1890[0], var11.method655(-128), 0, true);
            }
        }
        if (var6 == 12) {
            class174 var13 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var13 != null) {
                class452.field6294 = 0;
                class145.field2068 = arg3;
                class729.field10119 = 2;
                class59.field813++;
                class192 var14 = var13.field2336;
                class181.field2402 = arg1;
                class267 var15 = class545.method3099((byte) 68, class269.field3966, class704.field9866);
                var15.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
                var15.field3938.method2415(false, var7);
                class617.method3392(var15, true);
                class77.method672(0, var14.method655(-128), -2, (byte) -26, var14.field1884[0], var14.field1890[0], var14.method655(-126), 0, true);
            }
        }
        if (var6 == 45) {
            class174 var16 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var16 != null) {
                class192 var17 = var16.field2336;
                class181.field2402 = arg1;
                class729.field10119 = 2;
                class738.field10199++;
                class452.field6294 = 0;
                class145.field2068 = arg3;
                class267 var18 = class545.method3099((byte) 34, class269.field3966, class206.field2701);
                var18.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
                var18.field3938.method2362((byte) -63, var7);
                class617.method3392(var18, true);
                class77.method672(0, var17.method655(-127), -2, (byte) -26, var17.field1884[0], var17.field1890[0], var17.method655(-127), 0, true);
            }
        }
        if (var6 == 47) {
            class73 var19 = class599.field8149[var7];
            if (var19 != null) {
                class181.field2402 = arg1;
                class452.field6294 = 0;
                class145.field2068 = arg3;
                class356.field5222++;
                class729.field10119 = 2;
                class267 var20 = class545.method3099((byte) 34, class269.field3966, class319.field4589);
                var20.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                var20.field3938.method2415(false, var7);
                class617.method3392(var20, true);
                class77.method672(0, var19.method655(-128), -2, (byte) -26, var19.field1884[0], var19.field1890[0], var19.method655(-128), 0, true);
            }
        }
        if (var6 == 30 || var6 == 1001) {
            class24.method192(true, var4, var5, arg0.field4084, var7);
        }
        if (var6 == 8) {
            class668 var21 = class452.method2690(-4353, var5, var4);
            if (var21 != null) {
                class40.method279(var21, (byte) -97);
            }
        }
        if (var6 == 53) {
            class396.field5824++;
            class729.field10119 = 2;
            class452.field6294 = 0;
            class181.field2402 = arg1;
            class145.field2068 = arg3;
            class267 var22 = class545.method3099((byte) 70, class269.field3966, class655.field9070);
            var22.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
            var22.field3938.method2415(false, class230.field3147 + var5);
            var22.field3938.method2415(false, var7);
            var22.field3938.method2415(false, class121.field1765 + var4);
            class617.method3392(var22, true);
            class298.method1892(var4, (byte) 71, var5);
        }
        if (var6 == 21) {
            class73 var23 = class599.field8149[var7];
            if (var23 != null) {
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class181.field2402 = arg1;
                class356.field5222++;
                class729.field10119 = 2;
                class267 var24 = class545.method3099((byte) 51, class269.field3966, class373.field5391);
                var24.field3938.method2415(false, var7);
                var24.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var24, true);
                class77.method672(0, var23.method655(-125), -2, (byte) -26, var23.field1884[0], var23.field1890[0], var23.method655(-126), 0, true);
            }
        }
        if (var6 == 2) {
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class519.field7097++;
            class729.field10119 = 1;
            class145.field2068 = arg3;
            class267 var25 = class545.method3099((byte) 48, class269.field3966, class234.field3171);
            var25.field3938.method2382(-25724, class121.field1765 + var4);
            var25.field3938.method2363(29262, class167.field2258);
            var25.field3938.method2400(class372.field5384, (byte) 73);
            var25.field3938.method2415(false, class230.field3147 + var5);
            var25.field3938.method2363(29262, class121.field1770);
            class617.method3392(var25, true);
            class77.method672(0, 1, -4, (byte) -26, var5, var4, 1, 0, true);
        }
        if (var6 == 1009) {
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class729.field10119 = 2;
            class452.field6294 = 0;
            class174 var26 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var26 != null) {
                class192 var27 = var26.field2336;
                class220 var28 = var27.field2577;
                if (var28.field2995 != null) {
                    var28 = var28.method1449(class382.field5602, -1);
                }
                if (var28 != null) {
                    class451.field6279++;
                    class267 var29 = class545.method3099((byte) 124, class269.field3966, class177.field2357);
                    var29.field3938.method2415(false, var28.field2996);
                    class617.method3392(var29, true);
                }
            }
        }
        if (var6 == 1010 || var6 == 1002 || var6 == 1011 || var6 == 1006 || var6 == 1007) {
            class104.method803(var4, var7, var6, 2474);
        }
        if (var6 == 5) {
            class174 var30 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var30 != null) {
                class729.field10119 = 2;
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class192 var31 = var30.field2336;
                class167.field2248++;
                class181.field2402 = arg1;
                class267 var32 = class545.method3099((byte) 118, class269.field3966, class412.field5930);
                var32.field3938.method2362((byte) -128, class121.field1770);
                var32.field3938.method2382(-25724, class167.field2258);
                var32.field3938.method2382(-25724, var7);
                var32.field3938.method2354(class372.field5384, (byte) 121);
                var32.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var32, true);
                class77.method672(0, var31.method655(-127), -2, (byte) -26, var31.field1884[0], var31.field1890[0], var31.method655(-125), 0, true);
            }
        }
        if (var6 == 49) {
            class73 var33 = class599.field8149[var7];
            if (var33 != null) {
                class145.field2068 = arg3;
                class301.field4351++;
                class452.field6294 = 0;
                class729.field10119 = 2;
                class181.field2402 = arg1;
                class267 var34 = class545.method3099((byte) 64, class269.field3966, class290.field4249);
                var34.field3938.method2361(-863995992, class372.field5384);
                var34.field3938.method2362((byte) -62, class121.field1770);
                var34.field3938.method2362((byte) -51, var7);
                var34.field3938.method2382(-25724, class167.field2258);
                var34.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var34, true);
                class77.method672(0, var33.method655(-128), -2, (byte) -26, var33.field1884[0], var33.field1890[0], var33.method655(-128), 0, true);
            }
        }
        if (var6 == 10) {
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class729.field10119 = 2;
            class79.field1124++;
            class145.field2068 = arg3;
            class267 var35 = class545.method3099((byte) 109, class269.field3966, class33.field528);
            var35.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
            var35.field3938.method2382(-25724, var7);
            var35.field3938.method2400(class372.field5384, (byte) 68);
            var35.field3938.method2363(29262, class121.field1765 + var4);
            var35.field3938.method2362((byte) -90, var5 + class230.field3147);
            var35.field3938.method2415(false, class167.field2258);
            var35.field3938.method2362((byte) -44, class121.field1770);
            class617.method3392(var35, true);
            class298.method1892(var4, (byte) 83, var5);
        }
        if (var6 == 57) {
            if (class712.field9963 > 0 && class469.field6507.method828(-2, 82) && class469.field6507.method828(-2, 81)) {
                class306.method1941(class551.field7456.field2250, 14328, class230.field3147 + var5, class121.field1765 + var4);
            } else {
                class523.field7167++;
                class145.field2068 = arg3;
                class729.field10119 = 1;
                class452.field6294 = 0;
                class181.field2402 = arg1;
                class267 var36 = class545.method3099((byte) 32, class269.field3966, class594.field8112);
                var36.field3938.method2415(false, class230.field3147 + var5);
                var36.field3938.method2363(29262, class121.field1765 + var4);
                class617.method3392(var36, true);
            }
        }
        if (var6 == 4) {
            class73 var37 = class599.field8149[var7];
            if (var37 != null) {
                class181.field2402 = arg1;
                class145.field2068 = arg3;
                class560.field7526++;
                class729.field10119 = 2;
                class452.field6294 = 0;
                class267 var38 = class545.method3099((byte) 111, class269.field3966, class206.field2691);
                var38.field3938.method2382(-25724, var7);
                var38.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var38, true);
                class77.method672(0, var37.method655(-128), -2, (byte) -26, var37.field1884[0], var37.field1890[0], var37.method655(-127), 0, true);
            }
        }
        if (var6 == 13) {
            class729.field10119 = 2;
            class683.field9615++;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class267 var39 = class545.method3099((byte) 85, class269.field3966, class548.field7410);
            var39.field3938.method2362((byte) -79, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var39.field3938.method2362((byte) -106, var4 + class121.field1765);
            var39.field3938.method2362((byte) -86, class230.field3147 + var5);
            var39.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
            class617.method3392(var39, true);
            class600.method3334(76, var4, var8, var5);
        }
        if (var6 == 25) {
            class174 var40 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var40 != null) {
                class181.field2402 = arg1;
                class192 var41 = var40.field2336;
                class77.field1108++;
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class729.field10119 = 2;
                class267 var42 = class545.method3099((byte) 108, class269.field3966, class320.field4605);
                var42.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                var42.field3938.method2362((byte) -65, var7);
                class617.method3392(var42, true);
                class77.method672(0, var41.method655(-127), -2, (byte) -26, var41.field1884[0], var41.field1890[0], var41.method655(-126), 0, true);
            }
        }
        if (var6 == 3) {
            class181.field2402 = arg1;
            class145.field2068 = arg3;
            class729.field10119 = 2;
            class452.field6294 = 0;
            class342.field4959++;
            class267 var43 = class545.method3099((byte) 66, class269.field3966, class603.field8202);
            var43.field3938.method2363(29262, var7);
            var43.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
            var43.field3938.method2415(false, class121.field1765 + var4);
            var43.field3938.method2415(false, class230.field3147 + var5);
            class617.method3392(var43, true);
            class298.method1892(var4, (byte) 105, var5);
        }
        if (var6 == 59) {
            class73 var44 = class599.field8149[var7];
            if (var44 != null) {
                class684.field9626++;
                class145.field2068 = arg3;
                class729.field10119 = 2;
                class452.field6294 = 0;
                class181.field2402 = arg1;
                class267 var45 = class545.method3099((byte) 88, class269.field3966, class561.field7535);
                var45.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                var45.field3938.method2363(29262, var7);
                class617.method3392(var45, true);
                class77.method672(0, var44.method655(-125), -2, (byte) -26, var44.field1884[0], var44.field1890[0], var44.method655(-128), 0, true);
            }
        }
        if (var6 == 52) {
            class73 var46 = class599.field8149[var7];
            if (var46 != null) {
                class452.field6294 = 0;
                class729.field10119 = 2;
                class709.field9937++;
                class181.field2402 = arg1;
                class145.field2068 = arg3;
                class267 var47 = class545.method3099((byte) 39, class269.field3966, class277.field4111);
                var47.field3938.method2382(-25724, var7);
                var47.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var47, true);
                class77.method672(0, var46.method655(-127), -2, (byte) -26, var46.field1884[0], var46.field1890[0], var46.method655(-126), 0, true);
            }
        }
        if (var6 == 19 && class189.field2524 == null) {
            class177.method1246(1442, var5, var4);
            class189.field2524 = class452.method2690(-4353, var5, var4);
            class763.method4242(class189.field2524, true);
        }
        if (arg2 <= 113) {
            method1674(25, -44, (byte) 75);
        }
        if (var6 == 50) {
            class174 var48 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var48 != null) {
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class729.field10119 = 2;
                class181.field2402 = arg1;
                class192 var49 = var48.field2336;
                class645.field8960++;
                class267 var50 = class545.method3099((byte) 40, class269.field3966, class589.field7950);
                var50.field3938.method2382(-25724, var7);
                var50.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var50, true);
                class77.method672(0, var49.method655(-127), -2, (byte) -26, var49.field1884[0], var49.field1890[0], var49.method655(-125), 0, true);
            }
        }
        if (var6 == 18) {
            class668 var51 = class452.method2690(-4353, var5, var4);
            if (var51 != null) {
                class701.method3909(0);
                class111 var52 = client.method2022(var51);
                class348.method2196(var52.field1529, var51, -114, var52.method839(0));
                class66.field942 = class411.method2536(var51, (byte) -64);
                class341.field4924 = var51.field9397 + "<col=ffffff>";
                if (class66.field942 == null) {
                    class66.field942 = "Null";
                }
            }
            return;
        }
        if (var6 == 9) {
            class174 var53 = (class174) class234.field3169.method3953((long) var7, 14);
            if (var53 != null) {
                class452.field6294 = 0;
                class145.field2068 = arg3;
                class192 var54 = var53.field2336;
                class181.field2402 = arg1;
                class241.field3246++;
                class729.field10119 = 2;
                class267 var55 = class545.method3099((byte) 123, class269.field3966, class165.field2227);
                var55.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
                var55.field3938.method2362((byte) -45, var7);
                class617.method3392(var55, true);
                class77.method672(0, var54.method655(-127), -2, (byte) -26, var54.field1884[0], var54.field1890[0], var54.method655(-126), 0, true);
            }
        }
        if (var6 == 60) {
            class729.field10119 = 2;
            class301.field4351++;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class267 var56 = class545.method3099((byte) 99, class269.field3966, class290.field4249);
            var56.field3938.method2361(-863995992, class372.field5384);
            var56.field3938.method2362((byte) -83, class121.field1770);
            var56.field3938.method2362((byte) -60, class551.field7456.field1812);
            var56.field3938.method2382(-25724, class167.field2258);
            var56.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
            class617.method3392(var56, true);
        }
        if (var6 == 51) {
            if (class712.field9963 > 0 && class469.field6507.method828(-2, 82) && class469.field6507.method828(-2, 81)) {
                class306.method1941(class551.field7456.field2250, 14328, class230.field3147 + var5, class121.field1765 + var4);
            } else {
                class267 var57 = class383.method2439(var4, var7, var5, 255);
                if (var7 == 1) {
                    var57.field3938.method2380(65280, -1);
                    var57.field3938.method2380(65280, -1);
                    var57.field3938.method2415(false, (int) class135.field1974);
                    var57.field3938.method2380(65280, 57);
                    var57.field3938.method2380(65280, class594.field8116);
                    var57.field3938.method2380(65280, class299.field4334);
                    var57.field3938.method2380(65280, 89);
                    var57.field3938.method2415(false, class551.field7456.field2257);
                    var57.field3938.method2415(false, class551.field7456.field2259);
                    var57.field3938.method2380(65280, 63);
                } else {
                    class145.field2068 = arg3;
                    class729.field10119 = 1;
                    class181.field2402 = arg1;
                    class452.field6294 = 0;
                }
                class617.method3392(var57, true);
                class77.method672(0, 1, -4, (byte) -26, var5, var4, 1, 0, true);
            }
        }
        if (var6 == 23) {
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class379.field5539++;
            class729.field10119 = 2;
            class267 var58 = class545.method3099((byte) 125, class269.field3966, class764.field10568);
            var58.field3938.method2363(29262, var5 + class230.field3147);
            var58.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
            var58.field3938.method2363(29262, class121.field1765 + var4);
            var58.field3938.method2363(29262, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class617.method3392(var58, true);
            class600.method3334(106, var4, var8, var5);
        }
        if (var6 == 48) {
            class6.field56++;
            class452.field6294 = 0;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class729.field10119 = 2;
            class267 var59 = class545.method3099((byte) 58, class269.field3966, class765.field10574);
            var59.field3938.method2415(false, class121.field1765 + var4);
            var59.field3938.method2382(-25724, var7);
            var59.field3938.method2362((byte) -98, var5 + class230.field3147);
            var59.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
            class617.method3392(var59, true);
            class298.method1892(var4, (byte) 94, var5);
        }
        if (var6 == 6) {
            class73 var60 = class599.field8149[var7];
            if (var60 != null) {
                class181.field2402 = arg1;
                class145.field2068 = arg3;
                class452.field6294 = 0;
                class605.field8219++;
                class729.field10119 = 2;
                class267 var61 = class545.method3099((byte) 93, class269.field3966, class245.field3311);
                var61.field3938.method2363(29262, var7);
                var61.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var61, true);
                class77.method672(0, var60.method655(-127), -2, (byte) -26, var60.field1884[0], var60.field1890[0], var60.method655(-125), 0, true);
            }
        }
        if (var6 == 20) {
            class73 var62 = class599.field8149[var7];
            if (var62 != null) {
                class247.field3685++;
                class452.field6294 = 0;
                class181.field2402 = arg1;
                class729.field10119 = 2;
                class145.field2068 = arg3;
                class267 var63 = class545.method3099((byte) 39, class269.field3966, class731.field10130);
                var63.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                var63.field3938.method2363(29262, var7);
                class617.method3392(var63, true);
                class77.method672(0, var62.method655(-126), -2, (byte) -26, var62.field1884[0], var62.field1890[0], var62.method655(-128), 0, true);
            }
        }
        if (var6 == 44) {
            class452.field6294 = 0;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class729.field10119 = 2;
            class382.field5577++;
            class267 var64 = class545.method3099((byte) 39, class269.field3966, class322.field4704);
            var64.field3938.method2362((byte) -46, class121.field1765 + var4);
            var64.field3938.method2362((byte) -99, var7);
            var64.field3938.method2363(29262, class230.field3147 + var5);
            var64.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
            class617.method3392(var64, true);
            class298.method1892(var4, (byte) 75, var5);
        }
        if (var6 == 58) {
            class603.field8201++;
            class729.field10119 = 2;
            class181.field2402 = arg1;
            class145.field2068 = arg3;
            class452.field6294 = 0;
            class267 var65 = class545.method3099((byte) 119, class269.field3966, class360.field5258);
            var65.field3938.method2374(128, class469.field6507.method828(-2, 82) ? 1 : 0);
            var65.field3938.method2362((byte) -40, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var65.field3938.method2415(false, class121.field1765 + var4);
            var65.field3938.method2362((byte) -55, class230.field3147 + var5);
            class617.method3392(var65, true);
            class600.method3334(93, var4, var8, var5);
        }
        if (var6 == 46) {
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class452.field6294 = 0;
            class164.field2221++;
            class729.field10119 = 2;
            class267 var66 = class545.method3099((byte) 68, class269.field3966, class411.field5910);
            var66.field3938.method2382(-25724, class230.field3147 + var5);
            var66.field3938.method2364((byte) 101, class469.field6507.method828(-2, 82) ? 1 : 0);
            var66.field3938.method2382(-25724, var7);
            var66.field3938.method2382(-25724, class121.field1765 + var4);
            class617.method3392(var66, true);
            class298.method1892(var4, (byte) 120, var5);
        }
        if (var6 == 1008) {
            class452.field6294 = 0;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class779.field10688++;
            class729.field10119 = 2;
            class267 var67 = class545.method3099((byte) 44, class269.field3966, class275.field4089);
            var67.field3938.method2415(false, var7);
            class617.method3392(var67, true);
        }
        if (var6 == 1003) {
            class729.field10119 = 2;
            class452.field6294 = 0;
            class145.field2068 = arg3;
            class181.field2402 = arg1;
            class693.field9715++;
            class267 var68 = class545.method3099((byte) 90, class269.field3966, class320.field4616);
            var68.field3938.method2415(false, var7);
            class617.method3392(var68, true);
        }
        if (var6 == 16) {
            class73 var69 = class599.field8149[var7];
            if (var69 != null) {
                class198.field2647++;
                class729.field10119 = 2;
                class145.field2068 = arg3;
                class181.field2402 = arg1;
                class452.field6294 = 0;
                class267 var70 = class545.method3099((byte) 52, class269.field3966, class676.field9480);
                var70.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
                var70.field3938.method2415(false, var7);
                class617.method3392(var70, true);
                class77.method672(0, var69.method655(-127), -2, (byte) -26, var69.field1884[0], var69.field1890[0], var69.method655(-125), 0, true);
            }
        }
        if (var6 == 22) {
            class181.field2402 = arg1;
            class300.field4346++;
            class729.field10119 = 2;
            class452.field6294 = 0;
            class145.field2068 = arg3;
            class267 var71 = class545.method3099((byte) 53, class269.field3966, class742.field10241);
            var71.field3938.method2363(29262, class167.field2258);
            var71.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
            var71.field3938.method2362((byte) -96, class121.field1765 + var4);
            var71.field3938.method2415(false, class121.field1770);
            var71.field3938.method2382(-25724, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var71.field3938.method2363(29262, class230.field3147 + var5);
            var71.field3938.method2354(class372.field5384, (byte) 102);
            class617.method3392(var71, true);
            class600.method3334(111, var4, var8, var5);
        }
        if (var6 == 15) {
            class73 var72 = class599.field8149[var7];
            if (var72 != null) {
                class181.field2402 = arg1;
                class729.field10119 = 2;
                class356.field5222++;
                class452.field6294 = 0;
                class145.field2068 = arg3;
                class267 var73 = class545.method3099((byte) 42, class269.field3966, class181.field2397);
                var73.field3938.method2382(-25724, var7);
                var73.field3938.method2352((byte) -52, class469.field6507.method828(-2, 82) ? 1 : 0);
                class617.method3392(var73, true);
                class77.method672(0, var72.method655(-127), -2, (byte) -26, var72.field1884[0], var72.field1890[0], var72.method655(-125), 0, true);
            }
        }
        if (var6 == 1012) {
            class181.field2402 = arg1;
            class145.field2068 = arg3;
            class680.field9529++;
            class729.field10119 = 2;
            class452.field6294 = 0;
            class267 var74 = class545.method3099((byte) 69, class269.field3966, class678.field9484);
            var74.field3938.method2380(65280, class469.field6507.method828(-2, 82) ? 1 : 0);
            var74.field3938.method2415(false, var4 + class121.field1765);
            var74.field3938.method2415(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var74.field3938.method2363(29262, class230.field3147 + var5);
            class617.method3392(var74, true);
            class600.method3334(126, var4, var8, var5);
        }
        if (class497.field6870) {
            class701.method3909(0);
        }
        if (class117.field1686 != null && class441.field6219 == 0) {
            class763.method4242(class117.field1686, true);
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(III)V")
    public class249(int arg0, int arg1, int arg2) {
        this.field3694 = arg0;
        this.field3690 = arg2;
        this.field3689 = arg1;
    }
}
