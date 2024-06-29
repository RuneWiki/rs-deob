import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class373 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[B")
    public static byte[] field5497 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Luc;")
    public static class51 field5499 = new class51(10);

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field5503 = 0;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5504 = new String[100];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lqb;")
    public class257 field5505;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lc;")
    public class308 field5496;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lrj;ZILtj;IZILos;ILtj;II)Ll;", line = 5)
    public static final class315 method2449(class436 arg0, boolean arg1, int arg2, class298 arg3, int arg4, boolean arg5, int arg6, class129 arg7, int arg8, class298 arg9, int arg10, int arg11) {
        field5502++;
        class315 var12 = class3.method16(arg8, arg2, -66, arg0, arg10, arg3, arg6, arg4);
        if (var12 != null) {
            return var12;
        }
        if (arg11 != 15380) {
            method2453(96, -47);
        }
        class159 var13 = class129.method915(127, arg4);
        if (arg8 > 1 && var13.field2015 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg8 >= var13.field2071[var15] && var13.field2071[var15] != 0) {
                    var14 = var13.field2015[var15];
                }
            }
            if (var14 != -1) {
                var13 = class129.method915(126, var14);
            }
        }
        class9 var16 = class393.method2524(class166.field2250, 0, var13.field2006, (byte) -66);
        if (var16 == null) {
            return null;
        }
        if (var13.field2066 != null) {
            for (int var17 = 0; var17 < var13.field2066.length; var17++) {
                if (var13.field2009 == null || var17 >= var13.field2009.length) {
                    var16.method65(var13.field2076[var17], false, var13.field2066[var17]);
                } else {
                    var16.method65(class237.field3313[var13.field2009[var17] & 0xFF], false, var13.field2066[var17]);
                }
            }
        }
        if (var13.field2064 != null) {
            for (int var18 = 0; var18 < var13.field2064.length; var18++) {
                var16.method62(var13.field2064[var18], var13.field2005[var18], -2);
            }
        }
        if (arg0 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class444.field6408[var19].length > arg0.field6340[var19]) {
                    var16.method65(class444.field6408[var19][arg0.field6340[var19]], false, class452.field6566[var19]);
                }
                if (class71.field1015[var19].length > arg0.field6340[var19]) {
                    var16.method65(class71.field1015[var19][arg0.field6340[var19]], false, class230.field3155[var19]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field2063 != 128 || var13.field2045 != 128 || var13.field2034 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class257 var22 = arg9.method468(var16, var20, 0, var13.field2019 + 64, 768 - -var13.field2057);
        if (var21) {
            var22.method1658(var13.field2063, var13.field2045, var13.field2034);
        }
        class315 var23 = null;
        if (var13.field2062 != -1) {
            var23 = method2449(arg0, true, 0, arg3, var13.field2070, true, 1, arg7, 10, arg9, 0, 15380);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field2004 != -1) {
            var23 = method2449(arg0, false, arg2, arg3, var13.field2002, true, arg6, arg7, arg8, arg9, 0, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field2056;
        arg9.method477(16, 16, 512, 512);
        if (arg1) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg6 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class118 var25 = arg9.method429();
        var25.method264();
        arg9.method478(var25);
        arg9.method473(1.0F);
        arg9.method488(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class118 var26 = arg9.method519();
        var26.method272(-var13.field2013 << 3);
        var26.method277(var13.field2074 << 3);
        var26.method271(var13.field2020, (class240.field3364[var13.field2011 << 3] * var24 >> 15) - (var22.method1688() / 2 - var13.field2023), (class240.field3365[var13.field2011 << 3] * var24 >> 15) + var13.field2023);
        var26.method268(var13.field2011 << 3);
        int var27 = arg9.method451();
        int var28 = arg9.method457();
        arg9.method489(50, Integer.MAX_VALUE);
        arg9.method447();
        arg9.method472();
        arg9.method435(0, 0, 36, 32, 0, 0);
        if (!var22.method1699()) {
            return null;
        }
        var22.method1661(var26, (class137) null, 1);
        arg9.method489(var27, var28);
        int[] var29 = arg9.method490(0, 0, 36, 32);
        if (arg6 >= 1) {
            var29 = class242.method1561(-16777215, var29, 93);
            if (arg6 >= 2) {
                var29 = class242.method1561(-1, var29, 74);
            }
        }
        if (arg2 != 0) {
            class161.method1081(var29, false, arg2);
        }
        arg9.method514(var29, 0, 36, 36, 32).method2070(0, 0);
        if (var13.field2062 != -1) {
            var23.method2070(0, 0);
        } else if (var13.field2004 != -1) {
            var23.method2070(0, 0);
        }
        if (arg10 == 1 || arg10 == 2 && (var13.field2000 == 1 || arg8 != 1) && arg8 != -1) {
            arg7.method907(class85.method692(0, arg8), false, -16777215, 9, -256, 0);
        }
        int[] var30 = arg9.method490(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class258.method1708(var30[var31], -16777216);
            }
        }
        class315 var32;
        if (arg5) {
            var32 = arg9.method514(var30, 0, 36, 36, 32);
        } else {
            var32 = arg3.method514(var30, 0, 36, 36, 32);
        }
        if (!arg5) {
            class382 var33 = new class382();
            var33.field5597 = arg0 != null;
            var33.field5600 = arg2;
            var33.field5592 = arg10;
            var33.field5595 = arg8;
            var33.field5598 = arg6;
            var33.field5602 = arg4;
            var33.field5599 = arg3.field4492;
            class444.field6413.method1421(var33, (byte) 33, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lu;", line = 239)
    public static final class4 method2450(int arg0, int arg1) {
        field5495++;
        class4 var2 = (class4) class399.field5852.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class129.field1685.method1235(1, false, arg1);
        class4 var4 = new class4();
        int var5 = -24 / ((arg0 - 78) / 38);
        var4.field63 = arg1;
        if (var3 != null) {
            var4.method20(-1, new class341(var3));
        }
        var4.method25(true);
        if (var4.field69 == 2 && class204.field2814.method2826(false, (long) arg1) == null) {
            class204.field2814.method2815(-1, (long) arg1, new class17(class60.field928));
            class118.field1539[class60.field928++] = var4;
        }
        class399.field5852.method367((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 278)
    public static void method2451(int arg0) {
        field5497 = null;
        if (arg0 != 1) {
            method2449((class436) null, true, -66, (class298) null, 67, true, 111, (class129) null, 110, (class298) null, -49, 102);
        }
        field5504 = null;
        field5499 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)I", line = 292)
    public static final int method2452(int arg0, int arg1, byte arg2) {
        field5506++;
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (arg2 <= 59) {
            method2449((class436) null, true, -67, (class298) null, 0, true, 110, (class129) null, -97, (class298) null, -15, 65);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)I", line = 312)
    public static final int method2453(int arg0, int arg1) {
        field5501++;
        return arg1 == 255 ? arg0 & 0xFF : 114;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 323)
    public static final void method2454(byte arg0) {
        class402.field5874 = 0;
        field5500++;
        class186.field2547.method1574(-32166);
        if (arg0 != -2) {
            field5498 = 15;
        }
        class165.field2244 = false;
    }
}
