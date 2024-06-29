import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class320 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field4546 = -1;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field4553 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[I")
    public static int[] field4545 = new int[13];

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field4554 = -1;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lqaa;")
    private static class27 field4548 = new class27(13, 3);

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
    public static int[] field4555 = new int[1];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
    public int[] field4544;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILud;)V", line = 5)
    private final void method2059(int arg0, int arg1, class35 arg2) {
        field4547++;
        if (arg1 == 1) {
            this.field4546 = arg2.method253(-13900);
        } else if (arg1 == 2) {
            this.field4544 = new int[arg2.method273(255)];
            for (int var4 = 0; var4 < this.field4544.length; var4++) {
                this.field4544[var4] = arg2.method253(arg0 - 13957);
            }
        } else if (arg1 == 3) {
            this.field4553 = arg2.method273(255);
        }
        if (arg0 != 57) {
            method2063(-48, 68, -62, 37, -20, 15);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lud;I)V", line = 41)
    public final void method2060(class35 arg0, int arg1) {
        if (arg1 != -1) {
            field4545 = null;
        }
        while (true) {
            int var3 = arg0.method273(arg1 + 256);
            if (var3 == 0) {
                field4549++;
                return;
            }
            this.method2059(arg1 + 58, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 63)
    public static void method2061(byte arg0) {
        field4555 = null;
        field4548 = null;
        field4545 = null;
        if (arg0 != 61) {
            method2063(-18, -84, -48, 103, -55, -19);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILwc;BI)V", line = 75)
    public static final void method2062(int arg0, class66 arg1, byte arg2, int arg3) {
        field4550++;
        if (arg1 == null || class288.field4066.field3131 == arg1) {
            return;
        }
        int var4 = arg1.field1200;
        int var5 = arg1.field1189;
        int var6 = arg1.field1198;
        int var7 = (int) arg1.field1194;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field1194;
        if (var6 == 6) {
            class272 var10 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var10 != null) {
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class350.field4949++;
                class369.field5174 = 2;
                class84 var11 = var10.field3885;
                class217.field3092 = 0;
                class135 var12 = class273.method1801(class459.field6629, class683.field9616, 2);
                var12.field2109.method226((byte) -101, var7);
                var12.field2109.method229(arg2 ^ 0x57C8, class167.field2461.method1540(127, 82) ? 1 : 0);
                class539.method3178(var12, arg2 ^ 0x49AB);
                class453.method2713(0, true, var11.method482(false), (byte) -111, -2, var11.method482(false), var11.field991[0], var11.field995[0], 0);
            }
        }
        if (var6 == 45) {
            class217.field3092 = 0;
            class369.field5174 = 2;
            class65.field1177 = arg3;
            class18.field239++;
            class434.field6075 = arg0;
            class135 var13 = class273.method1801(class459.field6629, class747.field10445, 2);
            var13.field2109.method285(-128, var4 + class115.field1845);
            var13.field2109.method223(1493807496, class64.field1160 + var5);
            var13.field2109.method223(1493807496, var7);
            var13.field2109.method263((byte) 62, class167.field2461.method1540(122, 82) ? 1 : 0);
            class539.method3178(var13, arg2 ^ 0x49AB);
            class31.method206(var4, 104, var5);
        }
        if (var6 == 50) {
            class217.field3092 = 0;
            class369.field5174 = 2;
            class32.field430++;
            class434.field6075 = arg0;
            class65.field1177 = arg3;
            class135 var14 = class273.method1801(class459.field6629, class497.field7090, 2);
            var14.field2109.method223(1493807496, class115.field1845 + var4);
            var14.field2109.method238((byte) -71, class31.field415);
            var14.field2109.method226((byte) -95, class64.field1160 + var5);
            var14.field2109.method285(-128, class40.field590);
            var14.field2109.method285(arg2 - 56, class54.field1033);
            var14.field2109.method226((byte) -98, var7);
            var14.field2109.method229(-22416, class167.field2461.method1540(119, 82) ? 1 : 0);
            class539.method3178(var14, arg2 ^ 0x49AB);
            class31.method206(var4, 108, var5);
        }
        if (var6 == 48) {
            class434.field6075 = arg0;
            class217.field3092 = 0;
            class369.field5174 = 2;
            class58.field1082++;
            class65.field1177 = arg3;
            class135 var15 = class273.method1801(class459.field6629, class138.field2151, arg2 + 74);
            var15.field2109.method223(1493807496, var7);
            var15.field2109.method223(1493807496, class115.field1845 + var4);
            var15.field2109.method226((byte) -121, var5 + class64.field1160);
            var15.field2109.method281(-29331, class167.field2461.method1540(arg2 + 188, 82) ? 1 : 0);
            class539.method3178(var15, arg2 ^ 0x49AB);
            class31.method206(var4, arg2 + 192, var5);
        }
        if (var6 == 9) {
            class217.field3092 = 0;
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class369.field5174 = 2;
            class212.field3048++;
            class135 var16 = class273.method1801(class459.field6629, class332.field4682, 2);
            var16.field2109.method226((byte) -95, var7);
            var16.field2109.method266(class167.field2461.method1540(123, 82) ? 1 : 0, arg2 ^ 0xFFFFFF47);
            var16.field2109.method285(-128, class115.field1845 + var4);
            var16.field2109.method269(10543, class64.field1160 + var5);
            class539.method3178(var16, arg2 - 18853);
            class31.method206(var4, arg2 + 180, var5);
        }
        if (var6 == 1002) {
            class434.field6075 = arg0;
            class65.field1177 = arg3;
            class217.field3092 = 0;
            class369.field5174 = 2;
            class46.field668++;
            class135 var17 = class273.method1801(class459.field6629, class292.field4103, 2);
            var17.field2109.method223(1493807496, var7);
            class539.method3178(var17, -18925);
        }
        if (var6 == 44 || var6 == 1001) {
            class23.method140(var4, -118, var7, arg1.field1192, var5);
        }
        if (var6 == 1006) {
            class369.field5174 = 2;
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class217.field3092 = 0;
            class272 var18 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var18 != null) {
                class84 var19 = var18.field3885;
                class488 var20 = var19.field1523;
                if (var20.field6923 != null) {
                    var20 = var20.method2926(8730, class742.field10408);
                }
                if (var20 != null) {
                    class630.field9038++;
                    class135 var21 = class273.method1801(class459.field6629, class497.field7091, 2);
                    var21.field2109.method223(arg2 ^ 0xA6F64E30, var20.field6916);
                    class539.method3178(var21, -18925);
                }
            }
        }
        if (var6 == 25) {
            class349 var22 = class165.field2442[var7];
            if (var22 != null) {
                class369.field5174 = 2;
                class65.field1177 = arg3;
                class348.field4890++;
                class217.field3092 = 0;
                class434.field6075 = arg0;
                class135 var23 = class273.method1801(class459.field6629, class543.field7659, arg2 + 74);
                var23.field2109.method285(-128, class40.field590);
                var23.field2109.method226((byte) 108, class54.field1033);
                var23.field2109.method251(class31.field415, -2072603704);
                var23.field2109.method285(-128, var7);
                var23.field2109.method229(-22416, class167.field2461.method1540(arg2 ^ -60, 82) ? 1 : 0);
                class539.method3178(var23, arg2 ^ 0x49AB);
                class453.method2713(0, true, var22.method482(false), (byte) 70, -2, var22.method482(false), var22.field991[0], var22.field995[0], 0);
            }
        }
        if (var6 == 22) {
            class349 var24 = class165.field2442[var7];
            if (var24 != null) {
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class583.field8231++;
                class217.field3092 = 0;
                class369.field5174 = 2;
                class135 var25 = class273.method1801(class459.field6629, class706.field9896, 2);
                var25.field2109.method281(-29331, class167.field2461.method1540(126, 82) ? 1 : 0);
                var25.field2109.method223(1493807496, var7);
                class539.method3178(var25, -18925);
                class453.method2713(0, true, var24.method482(false), (byte) 67, -2, var24.method482(false), var24.field991[0], var24.field995[0], 0);
            }
        }
        if (var6 == 1009 || var6 == 1004 || var6 == 1003 || var6 == 1007 || var6 == 1010) {
            class81.method793(var6, var7, 1009, var4);
        }
        if (var6 == 18) {
            class349 var26 = class165.field2442[var7];
            if (var26 != null) {
                class434.field6075 = arg0;
                class369.field5174 = 2;
                class65.field1177 = arg3;
                class217.field3092 = 0;
                class69.field1239++;
                class135 var27 = class273.method1801(class459.field6629, class148.field2252, 2);
                var27.field2109.method229(-22416, class167.field2461.method1540(124, 82) ? 1 : 0);
                var27.field2109.method223(1493807496, var7);
                class539.method3178(var27, -18925);
                class453.method2713(0, true, var26.method482(false), (byte) -14, -2, var26.method482(false), var26.field991[0], var26.field995[0], 0);
            }
        }
        if (var6 == 20) {
            class272 var28 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var28 != null) {
                class84 var29 = var28.field3885;
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class217.field3092 = 0;
                class613.field8874++;
                class135 var30 = class273.method1801(class459.field6629, class687.field9691, 2);
                var30.field2109.method269(10543, var7);
                var30.field2109.method266(class167.field2461.method1540(127, 82) ? 1 : 0, 255);
                class539.method3178(var30, arg2 ^ 0x49AB);
                class453.method2713(0, true, var29.method482(false), (byte) 11, -2, var29.method482(false), var29.field991[0], var29.field995[0], 0);
            }
        }
        if (var6 == 15) {
            class434.field6075 = arg0;
            class369.field5174 = 2;
            class526.field7469++;
            class217.field3092 = 0;
            class65.field1177 = arg3;
            class135 var31 = class273.method1801(class459.field6629, class430.field6014, 2);
            var31.field2109.method266(class167.field2461.method1540(116, 82) ? 1 : 0, 255);
            var31.field2109.method223(1493807496, var4 + class115.field1845);
            var31.field2109.method223(1493807496, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var31.field2109.method226((byte) -103, class64.field1160 + var5);
            class539.method3178(var31, -18925);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (var6 == 1012) {
            class434.field6075 = arg0;
            class65.field1177 = arg3;
            class453.field6323++;
            class369.field5174 = 2;
            class217.field3092 = 0;
            class135 var32 = class273.method1801(class459.field6629, class322.field4578, arg2 ^ 0xFFFFFFBA);
            var32.field2109.method223(arg2 + 1493807568, var7);
            class539.method3178(var32, -18925);
        }
        if (var6 == 23) {
            class349 var33 = class165.field2442[var7];
            if (var33 != null) {
                class426.field5953++;
                class434.field6075 = arg0;
                class217.field3092 = 0;
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class135 var34 = class273.method1801(class459.field6629, field4548, arg2 ^ 0xFFFFFFBA);
                var34.field2109.method285(-128, var7);
                var34.field2109.method281(-29331, class167.field2461.method1540(116, 82) ? 1 : 0);
                class539.method3178(var34, -18925);
                class453.method2713(0, true, var33.method482(false), (byte) -98, -2, var33.method482(false), var33.field991[0], var33.field995[0], 0);
            }
        }
        if (var6 == 46) {
            class217.field3092 = 0;
            class348.field4890++;
            class369.field5174 = 2;
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class135 var35 = class273.method1801(class459.field6629, class543.field7659, 2);
            var35.field2109.method285(arg2 ^ 0x38, class40.field590);
            var35.field2109.method226((byte) -116, class54.field1033);
            var35.field2109.method251(class31.field415, -2072603704);
            var35.field2109.method285(arg2 ^ 0x38, class468.field6748.field931);
            var35.field2109.method229(-22416, class167.field2461.method1540(124, 82) ? 1 : 0);
            class539.method3178(var35, -18925);
        }
        if (var6 == 3) {
            class312.field4401++;
            class434.field6075 = arg0;
            class369.field5174 = 2;
            class217.field3092 = 0;
            class65.field1177 = arg3;
            class135 var36 = class273.method1801(class459.field6629, class467.field6742, 2);
            var36.field2109.method269(arg2 + 10615, var5 - -class64.field1160);
            var36.field2109.method269(10543, class115.field1845 + var4);
            var36.field2109.method229(-22416, class167.field2461.method1540(118, 82) ? 1 : 0);
            var36.field2109.method226((byte) 53, var7);
            class539.method3178(var36, -18925);
            class31.method206(var4, 101, var5);
        }
        if (var6 == 30) {
            class349 var37 = class165.field2442[var7];
            if (var37 != null) {
                class217.field3092 = 0;
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class366.field5111++;
                class135 var38 = class273.method1801(class459.field6629, class684.field9652, 2);
                var38.field2109.method285(-128, var7);
                var38.field2109.method281(-29331, class167.field2461.method1540(119, 82) ? 1 : 0);
                class539.method3178(var38, -18925);
                class453.method2713(0, true, var37.method482(false), (byte) -103, -2, var37.method482(false), var37.field991[0], var37.field995[0], 0);
            }
        }
        if (var6 == 1011) {
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class379.field5293++;
            class369.field5174 = 2;
            class217.field3092 = 0;
            class135 var39 = class273.method1801(class459.field6629, class86.field1557, arg2 + 74);
            var39.field2109.method226((byte) 28, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var39.field2109.method281(-29331, class167.field2461.method1540(117, 82) ? 1 : 0);
            var39.field2109.method223(1493807496, class115.field1845 + var4);
            var39.field2109.method223(1493807496, class64.field1160 + var5);
            class539.method3178(var39, -18925);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (var6 == 13) {
            class272 var40 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var40 != null) {
                class50.field826++;
                class434.field6075 = arg0;
                class217.field3092 = 0;
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class84 var41 = var40.field3885;
                class135 var42 = class273.method1801(class459.field6629, class201.field2877, 2);
                var42.field2109.method281(arg2 ^ 0x72D5, class167.field2461.method1540(122, 82) ? 1 : 0);
                var42.field2109.method223(1493807496, var7);
                class539.method3178(var42, -18925);
                class453.method2713(0, true, var41.method482(false), (byte) -96, -2, var41.method482(false), var41.field991[0], var41.field995[0], 0);
            }
        }
        if (var6 == 5) {
            class272 var43 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var43 != null) {
                class182.field2606++;
                class65.field1177 = arg3;
                class84 var44 = var43.field3885;
                class217.field3092 = 0;
                class369.field5174 = 2;
                class434.field6075 = arg0;
                class135 var45 = class273.method1801(class459.field6629, class490.field6989, 2);
                var45.field2109.method229(-22416, class167.field2461.method1540(116, 82) ? 1 : 0);
                var45.field2109.method269(10543, var7);
                class539.method3178(var45, -18925);
                class453.method2713(0, true, var44.method482(false), (byte) -119, -2, var44.method482(false), var44.field991[0], var44.field995[0], 0);
            }
        }
        if (var6 == 59) {
            class191.field2747++;
            class434.field6075 = arg0;
            class65.field1177 = arg3;
            class217.field3092 = 0;
            class369.field5174 = 2;
            class135 var46 = class273.method1801(class459.field6629, class368.field5158, 2);
            var46.field2109.method285(-128, class115.field1845 + var4);
            var46.field2109.method266(class167.field2461.method1540(126, 82) ? 1 : 0, 255);
            var46.field2109.method223(1493807496, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var46.field2109.method285(-128, class64.field1160 + var5);
            class539.method3178(var46, -18925);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (arg2 != -72) {
            field4554 = 95;
        }
        if (var6 == 51) {
            class50 var47 = class434.method2624(var5, var4, (byte) -75);
            if (var47 != null) {
                class368.method2301(var47, -3371);
            }
        }
        if (var6 == 21) {
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class369.field5174 = 1;
            class147.field2244++;
            class217.field3092 = 0;
            class135 var48 = class273.method1801(class459.field6629, class457.field6597, arg2 ^ 0xFFFFFFBA);
            var48.field2109.method233(class31.field415, arg2 ^ 0x5A3E);
            var48.field2109.method226((byte) 70, class54.field1033);
            var48.field2109.method223(arg2 + 1493807568, class115.field1845 + var4);
            var48.field2109.method223(1493807496, class40.field590);
            var48.field2109.method269(10543, class64.field1160 + var5);
            class539.method3178(var48, -18925);
            class453.method2713(0, true, 1, (byte) 51, -4, 1, var4, var5, 0);
        }
        if (var6 == 58) {
            class217.field3092 = 0;
            class369.field5174 = 2;
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class400.field5595++;
            class135 var49 = class273.method1801(class459.field6629, class630.field9035, 2);
            var49.field2109.method285(-128, var7);
            var49.field2109.method229(-22416, class167.field2461.method1540(121, 82) ? 1 : 0);
            var49.field2109.method285(arg2 - 56, class64.field1160 + var5);
            var49.field2109.method223(1493807496, class115.field1845 + var4);
            class539.method3178(var49, -18925);
            class31.method206(var4, 119, var5);
        }
        if (var6 == 17) {
            class349 var50 = class165.field2442[var7];
            if (var50 != null) {
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class577.field8166++;
                class217.field3092 = 0;
                class434.field6075 = arg0;
                class135 var51 = class273.method1801(class459.field6629, class303.field4273, 2);
                var51.field2109.method223(arg2 + 1493807568, var7);
                var51.field2109.method229(arg2 ^ 0x57C8, class167.field2461.method1540(127, 82) ? 1 : 0);
                class539.method3178(var51, -18925);
                class453.method2713(0, true, var50.method482(false), (byte) -13, -2, var50.method482(false), var50.field991[0], var50.field995[0], 0);
            }
        }
        if (var6 == 47) {
            class50 var52 = class434.method2624(var5, var4, (byte) -112);
            if (var52 != null) {
                class249.method1662((byte) 122);
                class331 var53 = client.method1943(var52);
                class438.method2634(64, var53.method2118(true), var53.field4675, var52);
                class322.field4580 = class317.method2041(arg2 + 182, var52);
                if (class322.field4580 == null) {
                    class322.field4580 = "Null";
                }
                class623.field8966 = var52.field831 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 11) {
            class369.field5174 = 2;
            class217.field3092 = 0;
            class604.field8776++;
            class434.field6075 = arg0;
            class65.field1177 = arg3;
            class135 var54 = class273.method1801(class459.field6629, class307.field4336, 2);
            var54.field2109.method285(arg2 ^ 0x38, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var54.field2109.method266(class167.field2461.method1540(121, 82) ? 1 : 0, 255);
            var54.field2109.method226((byte) -118, var5 + class64.field1160);
            var54.field2109.method285(-128, class115.field1845 + var4);
            class539.method3178(var54, -18925);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (var6 == 57) {
            class65.field1177 = arg3;
            class434.field6075 = arg0;
            class700.field9840++;
            class217.field3092 = 0;
            class369.field5174 = 2;
            class135 var55 = class273.method1801(class459.field6629, class301.field4234, 2);
            var55.field2109.method263((byte) -109, class167.field2461.method1540(122, 82) ? 1 : 0);
            var55.field2109.method223(1493807496, class115.field1845 + var4);
            var55.field2109.method269(arg2 + 10615, class40.field590);
            var55.field2109.method269(arg2 + 10615, var5 - -class64.field1160);
            var55.field2109.method223(1493807496, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var55.field2109.method233(class31.field415, -23162);
            var55.field2109.method223(arg2 ^ 0xA6F64E30, class54.field1033);
            class539.method3178(var55, arg2 - 18853);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (var6 == 19) {
            if (class79.field1485 > 0 && class167.field2461.method1540(120, 82) && class167.field2461.method1540(118, 81)) {
                class698.method3921(class115.field1845 + var4, class468.field6748.field649, class64.field1160 + var5, (byte) -121);
            } else {
                class318.field4512++;
                class217.field3092 = 0;
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class369.field5174 = 1;
                class135 var56 = class273.method1801(class459.field6629, class190.field2735, 2);
                var56.field2109.method285(arg2 ^ 0x38, class64.field1160 + var5);
                var56.field2109.method285(-128, class115.field1845 + var4);
                class539.method3178(var56, -18925);
            }
        }
        if (var6 == 8) {
            class349 var57 = class165.field2442[var7];
            if (var57 != null) {
                class434.field6075 = arg0;
                class217.field3092 = 0;
                class369.field5174 = 2;
                class265.field3856++;
                class65.field1177 = arg3;
                class135 var58 = class273.method1801(class459.field6629, class241.field3389, arg2 + 74);
                var58.field2109.method281(-29331, class167.field2461.method1540(126, 82) ? 1 : 0);
                var58.field2109.method226((byte) 38, var7);
                class539.method3178(var58, arg2 ^ 0x49AB);
                class453.method2713(0, true, var57.method482(false), (byte) 16, -2, var57.method482(false), var57.field991[0], var57.field995[0], 0);
            }
        }
        if (var6 == 16) {
            if (class79.field1485 > 0 && class167.field2461.method1540(124, 82) && class167.field2461.method1540(127, 81)) {
                class698.method3921(class115.field1845 + var4, class468.field6748.field649, class64.field1160 + var5, (byte) -77);
            } else {
                class135 var59 = class598.method3491(var7, false, var4, var5);
                if (var7 == 1) {
                    var59.field2109.method263((byte) -92, -1);
                    var59.field2109.method263((byte) -86, -1);
                    var59.field2109.method223(1493807496, (int) class321.field4568);
                    var59.field2109.method263((byte) -88, 57);
                    var59.field2109.method263((byte) -113, class440.field6138);
                    var59.field2109.method263((byte) -115, class113.field1812);
                    var59.field2109.method263((byte) -119, 89);
                    var59.field2109.method223(arg2 + 1493807568, class468.field6748.field644);
                    var59.field2109.method223(arg2 + 1493807568, class468.field6748.field648);
                    var59.field2109.method263((byte) -74, 63);
                } else {
                    class369.field5174 = 1;
                    class217.field3092 = 0;
                    class434.field6075 = arg0;
                    class65.field1177 = arg3;
                }
                class539.method3178(var59, -18925);
                class453.method2713(0, true, 1, (byte) 89, -4, 1, var4, var5, 0);
            }
        }
        if (var6 == 49) {
            class272 var60 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var60 != null) {
                class369.field5174 = 2;
                class217.field3092 = 0;
                class65.field1177 = arg3;
                class434.field6075 = arg0;
                class84 var61 = var60.field3885;
                class464.field6671++;
                class135 var62 = class273.method1801(class459.field6629, class288.field4064, 2);
                var62.field2109.method229(-22416, class167.field2461.method1540(127, 82) ? 1 : 0);
                var62.field2109.method226((byte) 76, var7);
                class539.method3178(var62, -18925);
                class453.method2713(0, true, var61.method482(false), (byte) -102, -2, var61.method482(false), var61.field991[0], var61.field995[0], 0);
            }
        }
        if (var6 == 12) {
            class349 var63 = class165.field2442[var7];
            if (var63 != null) {
                class684.field9622++;
                class434.field6075 = arg0;
                class65.field1177 = arg3;
                class369.field5174 = 2;
                class217.field3092 = 0;
                class135 var64 = class273.method1801(class459.field6629, class620.field8950, 2);
                var64.field2109.method269(10543, var7);
                var64.field2109.method281(-29331, class167.field2461.method1540(127, 82) ? 1 : 0);
                class539.method3178(var64, -18925);
                class453.method2713(0, true, var63.method482(false), (byte) -125, -2, var63.method482(false), var63.field991[0], var63.field995[0], 0);
            }
        }
        if (var6 == 4) {
            class349 var65 = class165.field2442[var7];
            if (var65 != null) {
                class434.field6075 = arg0;
                class232.field3296++;
                class369.field5174 = 2;
                class65.field1177 = arg3;
                class217.field3092 = 0;
                class135 var66 = class273.method1801(class459.field6629, class136.field2125, 2);
                var66.field2109.method226((byte) -124, var7);
                var66.field2109.method263((byte) -81, class167.field2461.method1540(120, 82) ? 1 : 0);
                class539.method3178(var66, -18925);
                class453.method2713(0, true, var65.method482(false), (byte) 23, -2, var65.method482(false), var65.field991[0], var65.field995[0], 0);
            }
        }
        if (var6 == 60 && class508.field7243 == null) {
            class309.method2005(-101, var4, var5);
            class508.field7243 = class434.method2624(var5, var4, (byte) -125);
            class262.method1776(0, class508.field7243);
        }
        if (var6 == 10) {
            class272 var67 = (class272) class758.field10539.method4203(true, (long) var7);
            if (var67 != null) {
                class84 var68 = var67.field3885;
                class434.field6075 = arg0;
                class673.field9448++;
                class369.field5174 = 2;
                class217.field3092 = 0;
                class65.field1177 = arg3;
                class135 var69 = class273.method1801(class459.field6629, class396.field5548, arg2 + 74);
                var69.field2109.method223(1493807496, class54.field1033);
                var69.field2109.method229(-22416, class167.field2461.method1540(122, 82) ? 1 : 0);
                var69.field2109.method269(arg2 + 10615, var7);
                var69.field2109.method269(10543, class40.field590);
                var69.field2109.method233(class31.field415, -23162);
                class539.method3178(var69, -18925);
                class453.method2713(0, true, var68.method482(false), (byte) -103, -2, var68.method482(false), var68.field991[0], var68.field995[0], 0);
            }
        }
        if (var6 == 2) {
            class369.field5174 = 2;
            class628.field9022++;
            class434.field6075 = arg0;
            class217.field3092 = 0;
            class65.field1177 = arg3;
            class135 var70 = class273.method1801(class459.field6629, class246.field3423, 2);
            var70.field2109.method226((byte) -102, class115.field1845 + var4);
            var70.field2109.method269(10543, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var70.field2109.method266(class167.field2461.method1540(118, 82) ? 1 : 0, 255);
            var70.field2109.method223(1493807496, var5 + class64.field1160);
            class539.method3178(var70, -18925);
            class391.method2436(var5, var4, (byte) 112, var8);
        }
        if (class737.field10375) {
            class249.method1662((byte) 122);
        }
        if (class153.field2303 != null && class58.field1072 == 0) {
            class262.method1776(0, class153.field2303);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V", line = 887)
    public static final void method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10 = arg3 + 1;
        class399.method2472(27113, arg4, arg1, arg2, class329.field4651[arg3]);
        field4551++;
        int var9 = arg0 - 1;
        class399.method2472(27113, arg4, arg1, arg2, class329.field4651[arg0]);
        if (arg5 != 2) {
            field4545 = null;
        }
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class329.field4651[var6];
            var7[arg4] = var7[arg1] = arg2;
        }
    }
}
