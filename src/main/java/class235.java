import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class235 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lfr;")
    private class231 field4070 = new class231(16);

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lqs;")
    private class496 field4071;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4074 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field4076 = 100;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lvv;")
    public static class313 field4079 = new class313(53, 3);

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lvv;")
    public static class313 field4080 = new class313(15, 16);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
    public final void method1613(int arg0, byte arg1) {
        if (arg1 != -115) {
            field4079 = null;
        }
        class231 var3 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method1603((byte) -104, arg0);
        }
        field4069++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method1614(byte arg0) {
        class231 var2 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method1604(4);
        }
        if (arg0 > -51) {
            this.method1614((byte) 38);
        }
        field4068++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        field4080 = null;
        field4079 = null;
        field4074 = null;
        if (arg0 > -102) {
            method1620(null, 80, false);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method1616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field4075++;
        class353.method2266(0, arg7, arg1, arg5, arg0, arg2, arg3, arg8, (byte) 126, arg4);
        if (arg6 != -5) {
            field4076 = -89;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILf;Lf;)V")
    public static final void method1617(int arg0, int arg1, int arg2, class192 arg3, class192 arg4) {
        class465 var5 = class406.method2512(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6904 = arg3;
            var5.field6908 = arg4;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method1618(int arg0) {
        field4067++;
        class231 var2 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method1598(arg0 ^ 0x179F);
            if (arg0 != 6095) {
                method1617(40, -124, -31, null, null);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILce;IIII)Lop;")
    public final class400 method1619(int arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4072++;
        if (arg3 > -96) {
            this.method1621(-107, -79);
        }
        class98[] var7 = null;
        class413 var8 = this.method1621(117, arg0);
        if (var8.field6287 != null) {
            var7 = new class98[var8.field6287.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class188 var10 = arg1.method2501(true, var8.field6287[var9]);
                var7[var9] = new class98(var10.field2949, var10.field2936, var10.field2935, var10.field2939, var10.field2950, var10.field2942, var10.field2940, var10.field2941);
            }
        }
        return new class400(var8.field6280, var7, var8.field6283, arg4, arg5, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/util/Random;IZ)I")
    public static final int method1620(Random arg0, int arg1, boolean arg2) {
        field4073++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class137.method1029(arg1, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class347.method2239(true, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Ltp;")
    private final class413 method1621(int arg0, int arg1) {
        field4077++;
        class231 var3 = this.field4070;
        class413 var4;
        synchronized (this.field4070) {
            var4 = (class413) this.field4070.method1593((byte) 119, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field4071;
        byte[] var6;
        synchronized (this.field4071) {
            var6 = this.field4071.method2926(arg1, -95, 29);
        }
        int var7 = -9 / ((62 - arg0) / 38);
        class413 var8 = new class413();
        if (var6 != null) {
            var8.method2554(new class23(var6), -2135660285);
        }
        class231 var9 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method1595(var8, (long) arg1, (byte) 65);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class235(class535 arg0, int arg1, class496 arg2) {
        this.field4071 = arg2;
        this.field4071.method2940(29, -10511);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        field4078++;
        if (class350.field5480 == 0 || class350.field5480 == 5) {
            return;
        }
        try {
            if (++class325.field5107 > 2000) {
                if (class463.field6886 != null) {
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                }
                if (class23.field250 >= 1) {
                    class350.field5480 = 0;
                    class213.method1398(-5, 0);
                    return;
                }
                if (class150.field2406 == 2 || class150.field2406 == 3) {
                    class244.field4183.field7138 = !class244.field4183.field7138;
                } else {
                    class269.field4484.field7138 = !class269.field4484.field7138;
                }
                class325.field5107 = 0;
                class350.field5480 = 1;
                class23.field250++;
            }
            if (class350.field5480 == 1) {
                if (class150.field2406 == 2 || class150.field2406 == 3) {
                    class359.field5583 = class419.field6342.method2887(class244.field4183.method2847(13101), (byte) 112, class244.field4183.field7133);
                } else {
                    class359.field5583 = class419.field6342.method2887(class269.field4484.method2847(13101), (byte) 112, class269.field4484.field7133);
                }
                class350.field5480 = 2;
            }
            if (class350.field5480 == 2) {
                if (class359.field5583.field2692 == 2) {
                    throw new IOException();
                }
                if (class359.field5583.field2692 != 1) {
                    return;
                }
                class463.field6886 = new class473((Socket) class359.field5583.field2695, class419.field6342);
                class359.field5583 = null;
                long var1 = class257.field4334 = class509.method2991(class68.field1058, (byte) 101);
                class261.field4357.field301 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class261.field4357.method163(class23.field315.field955, (byte) 49);
                class261.field4357.method163(var3, (byte) 49);
                class463.field6886.method2795(0, 2, (byte) 14, class261.field4357.field302);
                class526.method3121((byte) -5);
                int var4 = class463.field6886.method2799((byte) 74);
                class526.method3121((byte) -5);
                if (var4 != 0) {
                    class350.field5480 = 0;
                    class213.method1398(var4, arg0 - 10511);
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    class73.method520(4);
                    return;
                }
                class350.field5480 = 3;
            }
            if (class350.field5480 == 3) {
                if (class463.field6886.method2803((byte) -128) < 8) {
                    return;
                }
                class463.field6886.method2794(arg0 - 10406, 0, class506.field7365.field302, 8);
                class506.field7365.field301 = 0;
                class107.field1906 = class506.field7365.method117(-114);
                class23 var5 = new class23(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class107.field1906 >> 32), (int) class107.field1906 };
                var5.method163(10, (byte) 49);
                var5.method152(var6[0], (byte) -38);
                var5.method152(var6[1], (byte) -38);
                var5.method152(var6[2], (byte) -38);
                var5.method152(var6[3], (byte) -38);
                var5.method135(arg0 ^ 0x17B7, class509.method2991(class68.field1058, (byte) 99));
                var5.method145(class533.field7837, (byte) 0);
                var5.method138(class533.field7840, class477.field7044, -128);
                class340 var7 = class261.field4357;
                var7.field301 = 0;
                if (class150.field2406 == 2 || class150.field2406 == 3) {
                    if (class32.field515 == 12) {
                        var7.method163(class23.field319.field955, (byte) 49);
                    } else {
                        var7.method163(class23.field317.field955, (byte) 49);
                    }
                    var7.method182(0, -124);
                    int var8 = var7.field301;
                    var7.method152(598, (byte) -38);
                    var7.method163(class111.field1965, (byte) 49);
                    var7.method163(class287.method1865((byte) -108), (byte) 49);
                    var7.method182(class358.field5581, 76);
                    var7.method182(class49.field825, 126);
                    var7.method163(class510.field7403.field5093, (byte) 49);
                    class348.method2244(var7, (byte) -69);
                    var7.method145(class60.field917, (byte) 0);
                    var7.method152(class57.field899, (byte) -38);
                    class23 var9 = class510.field7403.method1193((byte) 122);
                    var7.method163(var9.field301, (byte) 49);
                    var7.method136(var9.field302, 866900624, 0, var9.field301);
                    class40.field668 = true;
                    var7.method182(class101.field1668, arg0 - 10631);
                    var7.method182(class524.field7713, arg0 - 10639);
                    class83.method598(-126);
                    var7.method136(var5.field302, 866900624, 0, var5.field301);
                    var7.method151(var7.field301 - var8, 255);
                } else {
                    var7.method163(class23.field320.field955, (byte) 49);
                    var7.method182(0, arg0 ^ 0x2966);
                    int var10 = var7.field301;
                    var7.method152(598, (byte) -38);
                    var7.method163(class271.field4501.field7866, (byte) 49);
                    var7.method163(class300.field4813, (byte) 49);
                    class348.method2244(var7, (byte) -69);
                    var7.method145(class60.field917, (byte) 0);
                    var7.method152(class57.field899, (byte) -38);
                    class83.method598(-117);
                    var7.method136(var5.field302, 866900624, 0, var5.field301);
                    var7.method151(var7.field301 - var10, arg0 ^ 0x29F0);
                }
                class463.field6886.method2795(0, var7.field301, (byte) 14, var7.field302);
                var7.method2148(var6, 1150446497);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class506.field7365.method2148(var6, arg0 ^ 0x449242AE);
                class350.field5480 = 4;
            }
            if (class350.field5480 == 4) {
                if (class463.field6886.method2803((byte) -119) < 1) {
                    return;
                }
                int var12 = class463.field6886.method2799((byte) 74);
                if (var12 == 21) {
                    class350.field5480 = 7;
                } else if (var12 == 29) {
                    class350.field5480 = 13;
                } else if (var12 == 1) {
                    class350.field5480 = 5;
                    class213.method1398(var12, 0);
                    return;
                } else if (var12 == 2) {
                    class350.field5480 = 8;
                } else if (var12 == 15) {
                    class195.field3050 = -2;
                    class350.field5480 = 14;
                } else if (var12 == 23 && class23.field250 < 1) {
                    class325.field5107 = 0;
                    class350.field5480 = 1;
                    class23.field250++;
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    return;
                } else {
                    class350.field5480 = 0;
                    class213.method1398(var12, 0);
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    class73.method520(4);
                    return;
                }
            }
            if (arg0 != 10511) {
                field4074 = null;
            }
            if (class350.field5480 == 6) {
                class261.field4357.field301 = 0;
                class261.field4357.method2156(class23.field318.field955, -3498);
                class463.field6886.method2795(0, class261.field4357.field301, (byte) 14, class261.field4357.field302);
                class350.field5480 = 4;
            } else if (class350.field5480 == 7) {
                if (class463.field6886.method2803((byte) -124) >= 1) {
                    class461.field6857 = class463.field6886.method2799((byte) 74) * 60 + 180;
                    class350.field5480 = 0;
                    class213.method1398(21, 0);
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    class73.method520(arg0 - 10507);
                }
            } else if (class350.field5480 == 13) {
                if (class463.field6886.method2803((byte) -119) >= 1) {
                    class140.field2330 = class463.field6886.method2799((byte) 74);
                    class350.field5480 = 0;
                    class213.method1398(29, 0);
                    class463.field6886.method2804(true);
                    class463.field6886 = null;
                    class73.method520(4);
                }
            } else if (class350.field5480 != 8) {
                if (class350.field5480 == 9) {
                    if (class150.field2406 == 3) {
                        class216.field3763 = true;
                    } else {
                        class216.field3763 = false;
                    }
                    class340 var13 = class506.field7365;
                    if (class150.field2406 == 2 || class150.field2406 == 3) {
                        if (class463.field6886.method2803((byte) -123) < class26.field403) {
                            return;
                        }
                        class463.field6886.method2794(124, 0, var13.field302, class26.field403);
                        var13.field301 = 0;
                        class407.field6189 = var13.method126((byte) -78);
                        class369.field5717 = var13.method126((byte) -78);
                        class447.field6678 = var13.method126((byte) -88) == 1;
                        class14.field161 = var13.method126((byte) -91) == 1;
                        class505.field7361 = var13.method126((byte) -88) == 1;
                        class303.field4857 = var13.method126((byte) -80) == 1;
                        class265.field4432 = var13.method132(63);
                        class348.field5467 = var13.method126((byte) -102) == 1;
                        class471.field6990 = var13.method158((byte) 102);
                        class347.field5452 = var13.method126((byte) -82) == 1;
                        if (class150.field2406 == 3) {
                            boolean var14 = var13.method126((byte) -96) == 1;
                            if (var14) {
                                long var15 = var13.method117(-87);
                                String var17 = class462.method2753(var15, 22585);
                                int var18 = var13.method126((byte) -118);
                                byte[] var19 = new byte[var18];
                                var13.method2150(0, var19, 0, var18);
                                String var20 = class200.method1325(var19, arg0 ^ 0xFFFF9B2A);
                                class62 var21 = null;
                                try {
                                    class169 var22 = class419.field6342.method2890(false, "3", false);
                                    while (var22.field2692 == 0) {
                                        class444.method2667(arg0 ^ 0xFFFFB8C1, 1L);
                                    }
                                    if (var22.field2692 == 1) {
                                        var21 = (class62) var22.field2695;
                                        int var23 = var17.length() + var20.length() + 3 + 2 + 4;
                                        if (var23 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class23 var24 = new class23(var23 + 1);
                                        var24.method163(var23, (byte) 49);
                                        var24.method163(0, (byte) 49);
                                        var24.method149((byte) -109, var17);
                                        var24.method149((byte) -106, var20);
                                        var24.method153(84);
                                        var21.method408(0, var24.field301, 0, var24.field302);
                                    }
                                } catch (Exception var33) {
                                }
                                try {
                                    if (var21 != null) {
                                        var21.method410((byte) 113);
                                    }
                                } catch (Exception var31) {
                                }
                            }
                        }
                        class61.field928.method794(class347.field5452, (byte) 118);
                        class20.field218.method2219((byte) -117, class347.field5452);
                        class22.field239.method1087(class347.field5452, false);
                    } else if (class463.field6886.method2803((byte) -125) >= class26.field403) {
                        class463.field6886.method2794(105, 0, var13.field302, class26.field403);
                        var13.field301 = 0;
                        class407.field6189 = var13.method126((byte) -114);
                        class369.field5717 = var13.method126((byte) -114);
                        class447.field6678 = var13.method126((byte) -116) == 1;
                        class14.field161 = var13.method126((byte) -77) == 1;
                        class505.field7361 = var13.method126((byte) -118) == 1;
                        class135.field2293 = var13.method132(arg0 ^ 0x294C);
                        class348.field5467 = class135.field2293 > 0;
                        class446.field6665 = var13.method132(93);
                        class309.field4913 = var13.method132(40);
                        class16.field186 = var13.method132(arg0 - 10487);
                        class182.field2876 = var13.method143(-3230);
                        class357.field5561 = class419.field6342.method2886(true, class182.field2876);
                        class59.field915 = var13.method126((byte) -111);
                        class268.field4473 = var13.method132(103);
                        class10.field111 = var13.method132(arg0 ^ 0x2953);
                        class264.field4406 = var13.method126((byte) -115) == 1;
                        class302.field4850.field2652 = class302.field4850.field2632 = var13.method133(27482);
                        class291.field4734 = new class487();
                        class291.field4734.field7139 = var13.method132(arg0 ^ 0x295F);
                        if (class291.field4734.field7139 == 65535) {
                            class291.field4734.field7139 = -1;
                        }
                        class291.field4734.field7133 = var13.method133(arg0 + 16971);
                        if (class255.field4320 != class180.field2857) {
                            class291.field4734.field7137 = class291.field4734.field7139 + 40000;
                            class291.field4734.field7136 = class291.field4734.field7139 + 50000;
                        }
                        if (class327.field5150 != class255.field4320 && (class244.field4183.method2849(false, class244.field4180) || class244.field4183.method2849(false, class100.field1657))) {
                            class244.field4183 = class291.field4734;
                        }
                    } else {
                        return;
                    }
                    if ((!class447.field6678 || class505.field7361) && !class348.field5467) {
                        try {
                            class456.method2735(arg0 ^ 0xFFFFBF88, "unzap", class419.field6342.field7203);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class456.method2735(-27001, "zap", class419.field6342.field7203);
                        } catch (Throwable var32) {
                            if (class53.field861) {
                                try {
                                    class419.field6342.field7203.getAppletContext().showDocument(new URL(class419.field6342.field7203.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var29) {
                                }
                            }
                        }
                    }
                    if (class255.field4320 == class180.field2857) {
                        try {
                            class456.method2735(-27001, "loggedin", class419.field6342.field7203);
                        } catch (Throwable var28) {
                        }
                    }
                    if (class150.field2406 != 2 && class150.field2406 != 3) {
                        class350.field5480 = 0;
                        class213.method1398(2, 0);
                        class356.method2286(arg0 - 10508);
                        class75.method540(-7, 6);
                        class339.field5325 = null;
                        return;
                    }
                    class350.field5480 = 11;
                }
                if (class350.field5480 == 11) {
                    if (class463.field6886.method2803((byte) -113) < 3) {
                        return;
                    }
                    class463.field6886.method2794(123, 0, class506.field7365.field302, 3);
                    class350.field5480 = 12;
                }
                if (class350.field5480 == 12) {
                    class340 var25 = class506.field7365;
                    var25.field301 = 0;
                    if (var25.method2151((byte) 4)) {
                        if (class463.field6886.method2803((byte) -125) < 1) {
                            return;
                        }
                        class463.field6886.method2794(arg0 - 10395, 3, var25.field302, 1);
                    }
                    class339.field5325 = class237.method1625(arg0 - 10585)[var25.method2153(15325)];
                    class195.field3050 = var25.method132(arg0 ^ 0x297C);
                    class350.field5480 = 10;
                }
                if (class350.field5480 == 10) {
                    if (class463.field6886.method2803((byte) -127) >= class195.field3050) {
                        class463.field6886.method2794(108, 0, class506.field7365.field302, class195.field3050);
                        class506.field7365.field301 = 0;
                        class350.field5480 = 0;
                        int var26 = class195.field3050;
                        class213.method1398(2, arg0 - 10511);
                        class39.method289(0);
                        class18.method89(118, class506.field7365);
                        class419.field6341 = -1;
                        class283.method1848((byte) -73);
                        if (class506.field7365.field301 != var26) {
                            throw new RuntimeException("lswp pos:" + class506.field7365.field301 + " psize:" + var26);
                        }
                        class339.field5325 = null;
                    }
                } else if (class350.field5480 == 14) {
                    if (class195.field3050 == -2) {
                        if (class463.field6886.method2803((byte) -112) < 2) {
                            return;
                        }
                        class463.field6886.method2794(114, 0, class506.field7365.field302, 2);
                        class506.field7365.field301 = 0;
                        class195.field3050 = class506.field7365.method132(arg0 ^ 0x2959);
                    }
                    if (class463.field6886.method2803((byte) -121) >= class195.field3050) {
                        class463.field6886.method2794(118, 0, class506.field7365.field302, class195.field3050);
                        class506.field7365.field301 = 0;
                        class350.field5480 = 0;
                        int var27 = class195.field3050;
                        class213.method1398(15, 0);
                        class269.method1796(1);
                        class18.method89(arg0 - 10421, class506.field7365);
                        if (class506.field7365.field301 != var27) {
                            throw new RuntimeException("lswpr pos:" + class506.field7365.field301 + " psize:" + var27);
                        }
                        class339.field5325 = null;
                    }
                }
            } else if (class463.field6886.method2803((byte) -126) >= 1) {
                class26.field403 = class463.field6886.method2799((byte) 74);
                class350.field5480 = 9;
            }
        } catch (IOException var34) {
            if (class463.field6886 != null) {
                class463.field6886.method2804(true);
                class463.field6886 = null;
            }
            if (class23.field250 >= 1) {
                class350.field5480 = 0;
                class213.method1398(-4, 0);
                class73.method520(4);
            } else {
                class350.field5480 = 1;
                class325.field5107 = 0;
                if (class150.field2406 == 2 || class150.field2406 == 3) {
                    class244.field4183.field7138 = !class244.field4183.field7138;
                } else {
                    class269.field4484.field7138 = !class269.field4484.field7138;
                }
                class23.field250++;
            }
        }
    }
}
