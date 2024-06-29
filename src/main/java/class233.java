import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class233 extends class64 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    private final int field3908;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    private final int field3904;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    private final int field3902;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    private final int field3906;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lij;")
    public static class50 field3901 = class78.method578(127, "rot:");

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lij;")
    public static class50 field3909 = class78.method578(122, "(U(Y");

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lij;")
    public static class50 field3914 = class78.method578(124, "T");

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field3915 = -2;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "J")
    public static long field3907 = 0L;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Ln;")
    public static class138 field3910;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "Lkf;")
    public static class38 field3921;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJ)V")
    public static final void method1582(int arg0, long arg1) {
        class190.field3141.field3581 = 0;
        class190.field3141.method1471(191, (byte) 24);
        if (arg0 < 93) {
            method1583(107);
        }
        ++field3922;
        class190.field3141.method1464(arg1, 867341416);
        class162.field2769 = 0;
        class167.field2834 = 1;
        class224.field3765 = 0;
        field3915 = -3;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field3909 = null;
        field3910 = null;
        if (arg0 < -28) {
            field3914 = null;
            field3901 = null;
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLij;)V")
    public static final void method1584(byte arg0, class50 arg1) {
        ++field3917;
        if (~class18.field397 <= -3) {
            if (arg1.method387(class189.field3126, true)) {
                class74.method555(110);
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class54.method431(class80.method589(new class50[] { class231.field3881, class78.method579(var4, -26225), class189.field3124 }, 28743), 0, 0, (class50) null);
            }
            if (arg1.method387(class172.field2879, true)) {
                class26.method244((byte) -93);
            }
            if (arg1.method387(class65.field1238, true)) {
                class120.method868(106, 25);
            }
            if (arg1.method387(class154.field2690, true)) {
                class244.field4253 = true;
            }
            if (arg1.method387(class179.field2987, true)) {
                class244.field4253 = false;
            }
            if (arg1.method387(class250.field4342, true)) {
                for (int var5 = 0; var5 < 4; ++var5) {
                    for (int var6 = 1; var6 < 103; ++var6) {
                        for (int var7 = 1; var7 < 103; ++var7) {
                            class45.field826[var5].field814[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method371(-124, class137.field2386) && class40.field737 != 0) {
                class10.method57(-66, arg1.method397(64, 6).method384(10));
            }
            if (arg1.method387(class159.field2733, true) && class40.field737 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method371(-121, class8.field125)) {
                class54.field967 = arg1.method397(64, 12).method399(false).method384(10);
                class54.method431(class80.method589(new class50[] { class99.field1826, class78.method579(class54.field967, -26225) }, 28743), 0, 0, (class50) null);
            }
            if (arg1.method387(class39.field724, true)) {
                class126.field2206 = true;
            }
        }
        int var8 = 98 / ((arg0 - -87) / 38);
        ++class34.field673;
        class190.field3141.method1598((byte) -100, 60);
        class190.field3141.method1471(-1 + arg1.method396(1), (byte) 24);
        class190.field3141.method1482(arg1.method397(64, 2), -29586);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1585(Throwable arg0, int arg1) throws IOException {
        ++field3918;
        String var3;
        if (arg0 instanceof class6) {
            class6 var2 = (class6) arg0;
            var3 = var2.field81 + " | ";
            arg0 = var2.field84;
        } else {
            var3 = "";
        }
        int var4 = 32 % ((-22 - arg1) / 43);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 - -1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 - -5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(1 + var17.lastIndexOf(9));
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field3916;
        int var4 = -22 / ((-5 - arg2) / 54);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIII)V")
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3908 = arg1;
        this.field3904 = arg3;
        this.field3902 = arg2;
        this.field3906 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V")
    public final void method276(int arg0, byte arg1, int arg2) {
        ++field3919;
        int var4 = this.field3906 * arg2 >> 12;
        int var5 = this.field3902 * arg2 >> 12;
        int var6 = 96 % ((-70 - arg1) / 37);
        int var7 = this.field3908 * arg0 >> 12;
        int var8 = this.field3904 * arg0 >> 12;
        class2.method14(var7, var5, -3063, var4, var8, super.field1224);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        ++field3920;
        if (arg1 > 52) {
            int var4 = this.field3906 * arg0 >> 12;
            int var5 = this.field3902 * arg0 >> 12;
            int var6 = this.field3908 * arg2 >> 12;
            int var7 = this.field3904 * arg2 >> 12;
            class204.method1378(super.field1224, var5, super.field1219, var7, var6, var4, super.field1223, 29736);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BIIIZI)V")
    public static final void method1586(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++class6.field79;
        if (!arg4) {
            class114.method823(true, true);
            class66.method508(true, true);
            class114.method823(true, false);
        }
        ++field3913;
        class66.method508(false, true);
        if (!arg4) {
            class8.method53((byte) 51);
        }
        class210.method1409(10786);
        if (class130.field2291 == 1) {
            int var6 = 2047 & class160.field2758 + class123.field2163;
            int var7 = class19.field406;
            if (~var7 > ~(class186.field3048 / 256)) {
                var7 = class186.field3048 / 256;
            }
            if (class144.field2515[4] && ~(class192.field3190[4] + 128) < ~var7) {
                var7 = class192.field3190[4] + 128;
            }
            class146.method1027(class187.method1260((byte) 51, class239.field4067.field3990, class239.field4067.field4027, class201.field3312) + -50, (byte) 77, var7 * 3 + 600, class17.field376, var7, arg1, var6, class161.field2768);
        }
        int var8 = class129.field2268;
        int var9 = class32.field644;
        int var10 = class221.field3723;
        int var11 = class1.field15;
        int var12 = class68.field1286;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class144.field2515[var13]) {
                int var39 = (int) ((double) (-class126.field2214[var13]) + Math.random() * (double) (class126.field2214[var13] * 2 + 1) + Math.sin((double) class49.field877[var13] / 100.0D * (double) class85.field1644[var13]) * (double) class192.field3190[var13]);
                if (var13 == 4) {
                    class221.field3723 += var39;
                    if (class221.field3723 < 128) {
                        class221.field3723 = 128;
                    }
                    if (class221.field3723 > 383) {
                        class221.field3723 = 383;
                    }
                }
                if (~var13 == -4) {
                    class68.field1286 = 2047 & class68.field1286 + var39;
                }
                if (~var13 == -1) {
                    class32.field644 += var39;
                }
                if (~var13 == -2) {
                    class129.field2268 += var39;
                }
                if (var13 == 2) {
                    class1.field15 += var39;
                }
            }
        }
        int var14 = 3;
        if (!class193.field3211 && !class194.field3216) {
            var14 = class201.field3312;
        }
        if (class174.method1198(0) && class193.field3211 && !class194.field3216) {
            if (class115.field2016 == null) {
                class115.field2016 = new byte[4][104][104];
            }
            int var15 = class6.field79 % 104;
            byte var16 = (byte) (255 & class6.field79 + -4);
            for (int var17 = 0; var17 < 4; ++var17) {
                for (int var18 = 0; ~var18 > -105; ++var18) {
                    class115.field2016[var17][var15][var18] = var16;
                }
            }
        }
        boolean var19 = false;
        if (class174.method1198(0) && class193.field3211 && !class194.field3216 && class201.field3312 != 3) {
            for (int var20 = 0; ~var20 > -3; ++var20) {
                class142.field2494[var20] = -1000000;
                class1.field7[var20] = 1000000;
                class22.field467[var20] = 0;
                class216.field3568[var20] = 1000000;
                class197.field3259[var20] = 0;
            }
            if (class130.field2291 == 1) {
                if ((4 & class210.field3495[class201.field3312][class239.field4067.field3990 >> 7][class239.field4067.field4027 >> 7]) != 0) {
                    class19.method147(class239.field4067.field3990 >> 7, class239.field4067.field4027 >> 7, class59.field1089, true, 0);
                    var19 = true;
                }
                if (~class221.field3723 > -311) {
                    int var21 = class32.field644 >> 7;
                    int var22 = class1.field15 >> 7;
                    int var23 = class239.field4067.field3990 >> 7;
                    int var24;
                    if (var23 > var21) {
                        var24 = -var21 + var23;
                    } else {
                        var24 = -var23 + var21;
                    }
                    int var25 = class239.field4067.field4027 >> 7;
                    int var26;
                    if (~var22 <= ~var25) {
                        var26 = var22 - var25;
                    } else {
                        var26 = var25 - var22;
                    }
                    if (var26 >= var24) {
                        int var27 = var24 * 65536 / var26;
                        int var28 = 32768;
                        while (var22 != var25) {
                            if (~var22 > ~var25) {
                                ++var22;
                            } else if (~var22 < ~var25) {
                                --var22;
                            }
                            if ((class210.field3495[class201.field3312][var21][var22] & 4) != 0) {
                                class19.method147(var21, var22, class59.field1089, true, 1);
                                var19 = true;
                                break;
                            }
                            var28 += var27;
                            if (~var28 <= -65537) {
                                if (~var23 >= ~var21) {
                                    if (~var23 > ~var21) {
                                        --var21;
                                    }
                                } else {
                                    ++var21;
                                }
                                var28 -= 65536;
                                if (~(class210.field3495[class201.field3312][var21][var22] & 4) != -1) {
                                    class19.method147(var21, var22, class59.field1089, true, 1);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        int var29 = 32768;
                        int var30 = var26 * 65536 / var24;
                        while (var21 != var23) {
                            if (~var21 <= ~var23) {
                                if (var21 > var23) {
                                    --var21;
                                }
                            } else {
                                ++var21;
                            }
                            if ((4 & class210.field3495[class201.field3312][var21][var22]) != 0) {
                                class19.method147(var21, var22, class59.field1089, true, 1);
                                var19 = true;
                                break;
                            }
                            var29 += var30;
                            if (~var29 <= -65537) {
                                var29 -= 65536;
                                if (~var22 > ~var25) {
                                    ++var22;
                                } else if (var25 < var22) {
                                    --var22;
                                }
                                if ((4 & class210.field3495[class201.field3312][var21][var22]) != 0) {
                                    var19 = true;
                                    class19.method147(var21, var22, class59.field1089, true, 1);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                int var31 = class187.method1260((byte) 49, class32.field644, class1.field15, class201.field3312);
                if (~(-class129.field2268 + var31) > -801 && ~(class210.field3495[class201.field3312][class32.field644 >> 7][class1.field15 >> 7] & 4) != -1) {
                    class19.method147(class32.field644 >> 7, class1.field15 >> 7, class59.field1089, true, 1);
                    var19 = true;
                }
            }
        }
        class158.method1105(arg2, arg3, arg2 + arg5, arg1 + arg3);
        class13.method90();
        int var32 = class69.field1297;
        int var33 = class173.field2904;
        if (~arg2 >= ~var32 && ~(arg2 + arg5) < ~var32 && ~var33 <= ~arg3 && ~var33 > ~(arg1 + arg3)) {
            class109.field1960 = 0;
            class114.field1997 = true;
            int var34 = class26.field554;
            int var35 = class136.field2369;
            int var36 = class33.field649;
            int var37 = class160.field2760;
            class163.field2794 = (class69.field1297 - arg2) * (-var37 + var34) / arg5 + var37;
            class210.field3479 = (-arg3 + class173.field2904) * (-var36 + var35) / arg1 + var36;
        } else {
            class114.field1997 = false;
            class109.field1960 = 0;
        }
        class244.method1665(0);
        class158.method1104(arg2, arg3, arg5, arg1, 0);
        if (!var19) {
            class24.method234(class32.field644, class129.field2268, class1.field15, class221.field3723, class68.field1286, var14, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 0, (byte) 0, class239.field4067.field3990 >> 7, class239.field4067.field4027 >> 7);
        } else {
            class24.method234(class32.field644, class129.field2268, class1.field15, class221.field3723, class68.field1286, var14, class115.field2016, class142.field2494, class1.field7, class22.field467, class197.field3259, class216.field3568, class201.field3312 + 1, (byte) class6.field79, class239.field4067.field3990 >> 7, class239.field4067.field4027 >> 7);
        }
        class244.method1665(0);
        class24.method238();
        class48.method357(256, 256, (byte) -38, arg2, arg3, arg1, arg5);
        class235.method1591(256, arg1, arg3, 120, 256, arg2, arg5);
        ((class220) class13.field309).method1505(25239, class55.field988);
        class261.method1756(-66, arg1, arg5, arg3, arg2);
        int var38 = 63 % ((3 - arg0) / 44);
        class129.field2268 = var8;
        class1.field15 = var11;
        class32.field644 = var9;
        class68.field1286 = var12;
        class221.field3723 = var10;
        if (class29.field604 && ~class144.method1008((byte) -117, true, false) == -1) {
            class29.field604 = false;
        }
        if (class29.field604) {
            class158.method1104(arg2, arg3, arg5, arg1, 0);
            class75.method564(-9117, false, class188.field3115);
        }
        if (!arg4 && !class29.field604 && !class205.field3406 && var32 >= arg2 && ~var32 > ~(arg2 + arg5) && ~var33 <= ~arg3 && arg1 + arg3 > var33) {
            class62.method480(arg2, 1170, var33, arg5, arg3, arg1, var32);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)Lij;")
    public static final class50 method1587(int arg0, byte arg1) {
        if (arg1 < 10) {
            method1584((byte) 90, (class50) null);
        }
        ++field3912;
        return class80.method589(new class50[] { class78.method579(255 & arg0 >> 24, -26225), class100.field1852, class78.method579(arg0 >> 16 & 255, -26225), class100.field1852, class78.method579(255 & arg0 >> 8, -26225), class100.field1852, class78.method579(arg0 & 255, -26225) }, 28743);
    }
}
