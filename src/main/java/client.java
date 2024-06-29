import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class21 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
    private static Rectangle[] field7509 = new Rectangle[100];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lcr;")
    public static class362 field7513 = new class362();

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lhb;")
    public static class250 field7520 = new class250(13, 7);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field7521;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3031() {
        class299.field3876 = 0;
        for (int var0 = 0; var0 < class16.field264; var0++) {
            class295 var1 = class527.field7791[class414.field5507[var0]];
            if (var1.field5184 && var1.method1771(56) != -1) {
                int var2 = (var1.method2342(10804) - 1) * 64 + 60;
                int var3 = var1.field6239 - var2 >> 7;
                int var4 = var1.field6241 - var2 >> 7;
                class395 var5 = class151.method1044(var4, (byte) -15, var1.field6220, var3);
                if (var5 != null) {
                    int var6 = var5.field5159;
                    if (var5 instanceof class295) {
                        var6 += 2048;
                    }
                    if (var5.field5169 == 0 && var5.method1771(31) != -1) {
                        class86.field1164[class299.field3876] = var6;
                        class386.field5077[class299.field3876] = var6;
                        class299.field3876++;
                        var5.field5169++;
                    }
                    class86.field1164[class299.field3876] = var6;
                    class386.field5077[class299.field3876] = var1.field5159 + 2048;
                    class299.field3876++;
                    var5.field5169++;
                }
            }
        }
        class499.method2986(class86.field1164, 1, class386.field5077, 0, class299.field3876 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Leo;)Leo;")
    public static final class423 method3032(class423 arg0) {
        int var1 = method3037(arg0).method1625(-28283);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class497.method2965(0, arg0.field5823);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Leo;)Z")
    public static final boolean method3033(class423 arg0) {
        if (class285.field3633) {
            if (method3037(arg0).field3305 != 0) {
                return false;
            }
            if (arg0.field5741 == 0) {
                return false;
            }
        }
        return arg0.field5672;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method146(int arg0) {
        field7514++;
        if (class65.field821 == 1000) {
            return;
        }
        long var2 = class77.method445(113) / 1000000L - class326.field4180;
        class326.field4180 = class77.method445(-116) / 1000000L;
        boolean var4 = class364.method2137(arg0 - 63);
        if (var4 && class265.field3366 && class254.field3207 != null) {
            class254.field3207.method2952(2000);
        }
        if (class65.field821 == 30 || class65.field821 == 10) {
            if (class408.field5462 != 0L && class408.field5462 < class173.method1134(true)) {
                class207.method1348(class421.field5647.field7718, class144.method1008((byte) 109), false, class421.field5647.field7731, 6271);
            } else if (!class512.field7538.method923() && class108.field1481) {
                class517.method3071(-94);
            }
        }
        if (class460.field6432 == null) {
            Container var5;
            if (class516.field7590 == null) {
                var5 = class172.field2221.field6139;
            } else {
                var5 = class516.field7590;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class516.field7590 == var5) {
                Insets var8 = class516.field7590.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class403.field5424 != var6 || class18.field303 != var7) {
                if (class512.field7538 == null || class512.field7538.method834()) {
                    class256.method1599(1024);
                } else {
                    class403.field5424 = var6;
                    class18.field303 = var7;
                }
                class408.field5462 = class173.method1134(true) + 500L;
            }
        }
        if (class460.field6432 != null && !class35.field546 && (class65.field821 == 30 || class65.field821 == 10)) {
            class207.method1348(-1, class421.field5647.field7727, false, -1, 6271);
        }
        boolean var9 = false;
        if (class436.field5982) {
            var9 = true;
            class436.field5982 = false;
        }
        if (var9) {
            class11.method77(-105);
        }
        if (class512.field7538 != null && class512.field7538.method923() || class144.method1008((byte) 109) != 1) {
            class218.method1396((byte) 110);
        }
        if (class65.field821 == arg0) {
            class94.method641(false, class211.field2715[class246.field3150], var9, class311.field4020[class246.field3150], class234.field3042, class349.field4474, class333.field4266[class246.field3150]);
        } else if (class65.field821 == 5) {
            class203.method1336(class311.field4020[class246.field3150].getRGB(), class512.field7538, class333.field4266[class246.field3150].getRGB(), 1, var9 | class512.field7538.method923(), class200.field2590, class211.field2715[class246.field3150].getRGB());
        } else if (class65.field821 == 10) {
            class228.method1443(2);
        } else if (class65.field821 == 25 || class65.field821 == 28) {
            if (class141.field1874 == 1) {
                if (class523.field7755 < class402.field5387) {
                    class523.field7755 = class402.field5387;
                }
                int var11 = (class523.field7755 - class402.field5387) * 50 / class523.field7755;
                class322.method1923(class43.field635, true, class331.field4251.method1127(class379.field4920, false) + "<br>(" + var11 + "%)", -121);
            } else if (class141.field1874 == 2) {
                if (class207.field2691 > class267.field3384) {
                    class267.field3384 = class207.field2691;
                }
                int var10 = (class267.field3384 - class207.field2691) * 50 / class267.field3384 + 50;
                class322.method1923(class43.field635, true, class331.field4251.method1127(class379.field4920, false) + "<br>(" + var10 + "%)", -112);
            } else {
                class322.method1923(class43.field635, true, class331.field4251.method1127(class379.field4920, false), arg0 - 124);
            }
        } else if (class65.field821 == 30) {
            class420.method2464(var2, -97);
        } else if (class65.field821 == 40) {
            class322.method1923(class43.field635, true, class161.field2094.method1127(class379.field4920, false) + "<br>" + class351.field4484.method1127(class379.field4920, false), -105);
        }
        if (class13.field231 == 3) {
            for (int var12 = 0; var12 < class5.field43; var12++) {
                Rectangle var13 = class486.field7058[var12];
                if (class316.field4074[var12]) {
                    class512.field7538.method866(var13.height, arg0 ^ 0xFFFFEBE0, var13.x, var13.width, var13.y, -1996553985);
                } else if (class264.field3343[var12]) {
                    class512.field7538.method866(var13.height, -5152, var13.x, var13.width, var13.y, -1996554240);
                }
            }
        }
        if (class408.method2420(arg0 ^ 0x26A8)) {
            class453.method2689(class512.field7538, (byte) 104);
        }
        if ((class65.field821 == 30 || class65.field821 == 10) && class13.field231 == 0 && class144.method1008((byte) 109) == 1 && !var9 && class441.field6142.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class5.field43; var15++) {
                if (class264.field3343[var15]) {
                    class264.field3343[var15] = false;
                    field7509[var14++] = class486.field7058[var15];
                }
            }
            class512.field7538.method817(field7509, var14);
        } else if (class65.field821 != 0) {
            class512.field7538.method856();
            for (int var16 = 0; var16 < class5.field43; var16++) {
                class264.field3343[var16] = false;
            }
        }
        if (class421.field5647.field7730 == 0) {
            class463.method2773(15L, -107);
        } else if (class421.field5647.field7730 == 1) {
            class463.method2773(10L, arg0 + 55);
        } else if (class421.field5647.field7730 == 2) {
            class463.method2773(5L, 27);
        } else if (class421.field5647.field7730 == 3) {
            class463.method2773(2L, 81);
        }
        if (class335.field4290) {
            class88.method583(false);
        }
        if (class421.field5647.field7703 && class65.field821 == 10 && class282.field3610 != -1) {
            class421.field5647.field7703 = false;
            class421.field5647.method643(true, class172.field2221);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method3034(boolean arg0) {
        class314.field4050++;
        field7511++;
        class235.method1500(null, -1, -1, 57);
        class245.method1535(null, -1, -1, -44);
        class426.method2523(-1344);
        class165.field2140++;
        int var2 = 0;
        if (arg0) {
            method3039();
        }
        while (var2 < 32768) {
            class295 var12 = class527.field7791[var2];
            if (var12 != null) {
                byte var13 = var12.field3831.field147;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method2342(10804);
                    if ((var13 & 0x2) != 0 && var12.field5244 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5246[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class200.field2594 - var14 - 1 < var17) {
                                var17 = class200.field2594 - var14 - 1;
                            }
                            int var18 = var12.field5251[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class118.field1647 - var14 - 1) {
                                var18 = class118.field1647 - var14 - 1;
                            }
                            int var19 = class254.method1584(var14, class85.field1145, true, var17, 7, var12.field5246[0], class157.field2067, class171.field2215[var12.field6220], 0, -1, var12.field5251[0], var14, var14, var18, 0);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5246[var20] = class85.field1145[var19 - var20 - 1];
                                    var12.field5251[var20] = class157.field2067[var19 - var20 - 1];
                                    var12.field5248[var20] = 1;
                                }
                                var12.field5244 = var19;
                            }
                        }
                    }
                    class71.method401(6, true, var12);
                    int var21 = class75.method429(var12, (byte) 8);
                    class333.method1980(var12, var21, class289.field3698, -113, class345.field4396);
                    class319.method1899(-1, var12);
                }
            }
            var2++;
        }
        if (class35.field542 == 0 && class407.field5455 == 0) {
            if (class396.field5271 == 2) {
                class307.method1832(14235);
            } else {
                class6.method34(arg0);
            }
            if (class299.field3885 >> 7 < 14 || class200.field2594 - 14 <= class299.field3885 >> 7 || (class291.field3724 >> 7) < 14 || class291.field3724 >> 7 >= class118.field1647 - 14) {
                class368.method2150(0);
            }
        }
        while (true) {
            class195 var3;
            class423 var4;
            class423 var5;
            do {
                var3 = (class195) class212.field2722.method52((byte) -96);
                if (var3 == null) {
                    while (true) {
                        class195 var6;
                        class423 var7;
                        class423 var8;
                        do {
                            var6 = (class195) class115.field1627.method52((byte) -117);
                            if (var6 == null) {
                                while (true) {
                                    class195 var9;
                                    class423 var10;
                                    class423 var11;
                                    do {
                                        var9 = (class195) class243.field3114.method52((byte) -103);
                                        if (var9 == null) {
                                            if (class465.field6838 != null) {
                                                class510.method3029(-8);
                                            }
                                            if ((class264.field3353 % 1500) == 0) {
                                                class132.method931(true);
                                            }
                                            class27.method186(-1);
                                            if (class374.field4865 && class491.field7173 < (class173.method1134(true) - 60000L)) {
                                                class502.method2997((byte) -24);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2516;
                                        if (var10.field5756 < 0) {
                                            break;
                                        }
                                        var11 = class497.method2965(0, var10.field5823);
                                    } while (var11 == null || var11.field5679 == null || var11.field5679.length <= var10.field5756 || var11.field5679[var10.field5756] != var10);
                                    class490.method2928(var9);
                                }
                            }
                            var7 = var6.field2516;
                            if (var7.field5756 < 0) {
                                break;
                            }
                            var8 = class497.method2965(0, var7.field5823);
                        } while (var8 == null || var8.field5679 == null || var7.field5756 >= var8.field5679.length || var8.field5679[var7.field5756] != var7);
                        class490.method2928(var6);
                    }
                }
                var4 = var3.field2516;
                if (var4.field5756 < 0) {
                    break;
                }
                var5 = class497.method2965(0, var4.field5823);
            } while (var5 == null || var5.field5679 == null || var4.field5756 >= var5.field5679.length || var5.field5679[var4.field5756] != var4);
            class490.method2928(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method3035(int arg0) {
        if (!class421.field5647.field7703) {
            for (int var2 = 0; var2 < class437.field5995; var2++) {
                if (class171.field2216[var2].method1054(false) == 's' || class171.field2216[var2].method1054(false) == 'S') {
                    class421.field5647.field7703 = true;
                    break;
                }
            }
        }
        field7512++;
        if (class252.field3202 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class173.method1134(true);
            if (class161.field2100 == 0L) {
                class161.field2100 = var5;
            }
            if (var4 > 16384 && (var5 - class161.field2100) < 5000L) {
                if (var5 - class299.field3888 > 1000L) {
                    System.gc();
                    class299.field3888 = var5;
                }
                class234.field3042 = class407.field5457.method1127(class379.field4920, false);
                class349.field4474 = 5;
            } else {
                class234.field3042 = class419.field5567.method1127(class379.field4920, false);
                class349.field4474 = 5;
                class252.field3202 = 10;
            }
        } else if (class252.field3202 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class171.field2215[var7] = class116.method751((byte) -50, class200.field2594, class118.field1647);
            }
            class234.field3042 = class482.field7027.method1127(class379.field4920, false);
            class349.field4474 = 10;
            class252.field3202 = 20;
        } else if (class252.field3202 == 20) {
            if (class398.field5292 == null) {
                class398.field5292 = new class440(class187.field2441, class94.field1312);
            }
            if (class398.field5292.method2601((byte) 121)) {
                class65.field823 = class334.method1984(0, 1, 0, true, false);
                class120.field1676 = class334.method1984(0, 1, 1, true, false);
                class523.field7751 = class334.method1984(0, 1, 2, true, false);
                class257.field3251 = class334.method1984(0, 1, 3, true, false);
                class135.field1829 = class334.method1984(0, 1, 4, true, false);
                class354.field4551 = class334.method1984(0, 1, 5, true, true);
                class288.field3685 = class334.method1984(0, 1, 6, false, true);
                class83.field1031 = class334.method1984(0, 1, 7, true, false);
                class391.field5121 = class334.method1984(0, 1, 8, true, false);
                class271.field3430 = class334.method1984(0, 1, 9, true, false);
                class29.field499 = class334.method1984(0, 1, 10, true, false);
                class6.field53 = class334.method1984(0, 1, 11, true, false);
                class491.field7174 = class334.method1984(0, 1, 12, true, false);
                class256.field3245 = class334.method1984(0, 1, 13, true, false);
                class351.field4485 = class334.method1984(0, 1, 14, false, false);
                class235.field3059 = class334.method1984(0, 1, 15, true, false);
                class270.field3423 = class334.method1984(0, 1, 16, true, false);
                class138.field1848 = class334.method1984(0, 1, 17, true, false);
                class197.field2545 = class334.method1984(0, 1, 18, true, false);
                class114.field1565 = class334.method1984(0, 1, 19, true, false);
                class511.field7533 = class334.method1984(0, 1, 20, true, false);
                class11.field179 = class334.method1984(0, 1, 21, true, false);
                class9.field93 = class334.method1984(0, 1, 22, true, false);
                class236.field3075 = class334.method1984(0, 1, 23, true, true);
                class522.field7745 = class334.method1984(0, 1, 24, true, false);
                class221.field2851 = class334.method1984(0, 1, 25, true, false);
                class352.field4500 = class334.method1984(0, 1, 26, true, true);
                class7.field59 = class334.method1984(0, 1, 27, true, false);
                class494.field7224 = class334.method1984(0, 1, 28, true, true);
                class168.field2189 = class334.method1984(0, 1, 29, true, false);
                class234.field3042 = class476.field6961.method1127(class379.field4920, false);
                class252.field3202 = 30;
                class349.field4474 = 15;
            } else {
                class234.field3042 = class402.field5422.method1127(class379.field4920, false);
                class349.field4474 = 12;
            }
        } else if (class252.field3202 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class212.field2718[var9].method2363(100) * class274.field3479[var9] / 100;
            }
            if (var8 == 100) {
                class234.field3042 = class343.field4365.method1127(class379.field4920, false);
                class349.field4474 = 20;
                class315.method1877(class391.field5121, 0);
                class482.method2891(-89, class391.field5121);
                class252.field3202 = 40;
            } else {
                if (var8 != 0) {
                    class234.field3042 = class357.field4581.method1127(class379.field4920, false) + var8 + "%";
                }
                class349.field4474 = 20;
            }
        } else {
            int var10 = -27 % ((32 - arg0) / 45);
            if (class252.field3202 == 40) {
                if (class494.field7224.method1311((byte) -120)) {
                    this.method3040(1, class494.field7224.method1320(1, 1));
                    class234.field3042 = class44.field656.method1127(class379.field4920, false);
                    class252.field3202 = 50;
                    class349.field4474 = 25;
                } else {
                    class234.field3042 = class279.field3581.method1127(class379.field4920, false) + class494.field7224.method1306(0) + "%";
                    class349.field4474 = 25;
                }
            } else if (class252.field3202 == 50) {
                class174.method1135(true);
                class234.field3042 = class415.field5527.method1127(class379.field4920, false);
                class252.field3202 = 60;
                class349.field4474 = 30;
            } else if (class252.field3202 == 60) {
                int var11 = class183.method1206(class391.field5121, class256.field3245, (byte) 73);
                int var12 = class200.method1288(-81);
                if (var11 < var12) {
                    class234.field3042 = class70.field857.method1127(class379.field4920, false) + var11 * 100 / var12 + "%";
                    class349.field4474 = 35;
                } else {
                    class234.field3042 = class477.field6966.method1127(class379.field4920, false);
                    class349.field4474 = 35;
                    class252.field3202 = 70;
                }
            } else if (class252.field3202 == 70) {
                int var13 = class375.method2190((byte) 121, class391.field5121);
                int var14 = class360.method2117(0);
                if (var14 > var13) {
                    class234.field3042 = class338.field4323.method1127(class379.field4920, false) + var13 * 100 / var14 + "%";
                    class349.field4474 = 40;
                } else {
                    class234.field3042 = class308.field3957.method1127(class379.field4920, false);
                    class252.field3202 = 80;
                    class349.field4474 = 40;
                }
            } else if (class252.field3202 == 80) {
                if (class352.field4500.method1311((byte) -107)) {
                    class202.field2653 = new class151(class352.field4500, class271.field3430, class391.field5121);
                    class234.field3042 = class338.field4311.method1127(class379.field4920, false);
                    class349.field4474 = 45;
                    class252.field3202 = 90;
                } else {
                    class234.field3042 = class377.field4899.method1127(class379.field4920, false) + class352.field4500.method1306(0) + "%";
                    class349.field4474 = 45;
                }
            } else if (class252.field3202 == 90) {
                class234.field3042 = class236.field3077.method1127(class379.field4920, false);
                class349.field4474 = 50;
                class252.field3202 = 95;
            } else if (class252.field3202 == 95) {
                if (class421.field5647.field7703) {
                    class421.field5647.field7709 = 0;
                    class421.field5647.field7727 = 1;
                    class421.field5647.field7728 = 0;
                    class421.field5647.field7702 = 0;
                    class421.field5647.field7701 = 0;
                }
                class421.field5647.field7703 = true;
                class421.field5647.method643(true, class172.field2221);
                class222.method1420(class421.field5647.field7702, 121, false);
                class234.field3042 = class461.field6444.method1127(class379.field4920, false);
                class252.field3202 = 100;
                class349.field4474 = 55;
            } else if (class252.field3202 == 100) {
                class285.method1733(0, class512.field7538, class256.field3245, class391.field5121);
                class234.field3042 = class449.field6244.method1127(class379.field4920, false);
                class349.field4474 = 60;
                class294.method1767(5, (byte) -112);
                class252.field3202 = 110;
            } else if (class252.field3202 == 110) {
                class523.field7751.method1311((byte) -115);
                byte var15 = 0;
                int var16 = var15 + class523.field7751.method1306(0);
                class270.field3423.method1311((byte) -113);
                int var17 = var16 + class270.field3423.method1306(0);
                class138.field1848.method1311((byte) -89);
                int var18 = var17 + class138.field1848.method1306(0);
                class197.field2545.method1311((byte) -86);
                int var19 = var18 + class197.field2545.method1306(0);
                class114.field1565.method1311((byte) -91);
                int var20 = var19 + class114.field1565.method1306(0);
                class511.field7533.method1311((byte) -126);
                int var21 = var20 + class511.field7533.method1306(0);
                class11.field179.method1311((byte) -109);
                int var22 = var21 + class11.field179.method1306(0);
                class9.field93.method1311((byte) -72);
                int var23 = var22 + class9.field93.method1306(0);
                class522.field7745.method1311((byte) -91);
                int var24 = var23 + class522.field7745.method1306(0);
                class221.field2851.method1311((byte) -90);
                int var25 = var24 + class221.field2851.method1306(0);
                class7.field59.method1311((byte) -93);
                int var26 = var25 + class7.field59.method1306(0);
                class168.field2189.method1311((byte) -92);
                int var27 = var26 + class168.field2189.method1306(0);
                if (var27 < 1200) {
                    class234.field3042 = class199.field2562.method1127(class379.field4920, false) + var27 / 12 + "%";
                    class349.field4474 = 65;
                } else {
                    class495.field7242 = new class308(class494.field7234, class379.field4920, class523.field7751);
                    class331.field4255 = new class316(class494.field7234, class379.field4920, class523.field7751);
                    class363.field4684 = new class166(class494.field7234, class379.field4920, class523.field7751, class391.field5121);
                    class212.field2724 = new class159(class494.field7234, class379.field4920, class138.field1848);
                    class211.field2717 = new class4(class494.field7234, class379.field4920, class523.field7751);
                    class89.field1245 = new class261(class494.field7234, class379.field4920, class523.field7751);
                    class167.field2161 = new class389(class494.field7234, class379.field4920, class523.field7751, class83.field1031);
                    class31.field516 = new class524(class494.field7234, class379.field4920, class523.field7751);
                    class96.field1342 = new class256(class494.field7234, class379.field4920, class523.field7751);
                    class52.field715 = new class179(class494.field7234, class379.field4920, true, class270.field3423, class83.field1031);
                    class117.field1643 = new class164(class494.field7234, class379.field4920, class523.field7751, class391.field5121);
                    class471.field6882 = new class249(class494.field7234, class379.field4920, class523.field7751, class391.field5121);
                    class192.field2495 = new class314(class494.field7234, class379.field4920, true, class197.field2545, class83.field1031);
                    class89.field1238 = new class18(class494.field7234, class379.field4920, true, class495.field7242, class114.field1565, class83.field1031);
                    class285.field3637 = new class189(class494.field7234, class379.field4920, class523.field7751);
                    class403.field5429 = new class329(class494.field7234, class379.field4920, class511.field7533, class65.field823, class120.field1676);
                    class264.field3355 = new class75(class494.field7234, class379.field4920, class523.field7751);
                    class261.field3316 = new class198(class494.field7234, class379.field4920, class523.field7751);
                    class472.field6897 = new class235(class494.field7234, class379.field4920, class11.field179, class83.field1031);
                    class381.field4967 = new class349(class494.field7234, class379.field4920, class523.field7751);
                    class501.field7373 = new class310(class494.field7234, class379.field4920, class523.field7751);
                    class487.field7072 = new class213(class494.field7234, class379.field4920, class523.field7751);
                    class301.field3898 = new class243(class494.field7234, class379.field4920, class9.field93);
                    class251.field3196 = new class108(class494.field7234, class379.field4920, class523.field7751);
                    class319.method1900(class256.field3245, class257.field3251, 0, class83.field1031, class391.field5121);
                    class354.method2076((byte) -36, class168.field2189);
                    class261.field3314 = new class291(class379.field4920, class522.field7745, class221.field2851);
                    class95.field1325 = new class141(class379.field4920, class522.field7745, class221.field2851, new class24());
                    class234.field3042 = class461.field6447.method1127(class379.field4920, false);
                    class349.field4474 = 65;
                    class394.method2339(0);
                    class52.field715.method1168(!class421.field5647.method648(-112, class520.field7690), 84);
                    class198.field2555 = new class183();
                    class282.method1724(false);
                    class75.method426(class7.field59, 0);
                    class179.method1167(-2, class83.field1031, class202.field2653);
                    class252.field3202 = 120;
                }
            } else if (class252.field3202 == 120) {
                int var28 = class456.method2701(class391.field5121, (byte) -101);
                int var29 = class378.method2206(20293);
                if (var28 < var29) {
                    class234.field3042 = class353.field4529.method1127(class379.field4920, false) + var28 * 100 / var29 + "%";
                    class349.field4474 = 70;
                } else {
                    class105.method701((byte) 122, class512.field7538, class391.field5121);
                    class54.method316(0, class334.field4280);
                    class234.field3042 = class327.field4197.method1127(class379.field4920, false);
                    class349.field4474 = 70;
                    class252.field3202 = 130;
                }
            } else if (class252.field3202 == 130) {
                if (class29.field499.method1316("", 0, "huffman")) {
                    class350 var30 = new class350(class29.field499.method1300("huffman", (byte) 87, ""));
                    class8.method54((byte) 111, var30);
                    class234.field3042 = class429.field5876.method1127(class379.field4920, false);
                    class252.field3202 = 140;
                    class349.field4474 = 75;
                } else {
                    class234.field3042 = class520.field7686.method1127(class379.field4920, false) + "0%";
                    class349.field4474 = 75;
                }
            } else if (class252.field3202 == 140) {
                if (class257.field3251.method1311((byte) -111)) {
                    class234.field3042 = class508.field7457.method1127(class379.field4920, false);
                    class252.field3202 = 150;
                    class349.field4474 = 80;
                } else {
                    class234.field3042 = class290.field3717.method1127(class379.field4920, false) + class257.field3251.method1306(0) + "%";
                    class349.field4474 = 80;
                }
            } else if (class252.field3202 == 150) {
                if (class491.field7174.method1311((byte) -68)) {
                    class234.field3042 = class16.field263.method1127(class379.field4920, false);
                    class252.field3202 = 160;
                    class349.field4474 = 82;
                } else {
                    class234.field3042 = class151.field2029.method1127(class379.field4920, false) + class491.field7174.method1306(0) + "%";
                    class349.field4474 = 82;
                }
            } else if (class252.field3202 == 160) {
                if (class256.field3245.method1311((byte) -104)) {
                    class234.field3042 = class244.field3137.method1127(class379.field4920, false);
                    class252.field3202 = 170;
                    class349.field4474 = 85;
                } else {
                    class234.field3042 = class244.field3137.method1127(class379.field4920, false) + class256.field3245.method1306(0) + "%";
                    class349.field4474 = 85;
                }
            } else if (class252.field3202 == 170) {
                if (class236.field3075.method1303("details", -24051)) {
                    class230.method1456(class236.field3075, class211.field2717, class89.field1245, class52.field715, class117.field1643, class471.field6882, class198.field2555);
                    class234.field3042 = class318.field4095.method1127(class379.field4920, false);
                    class349.field4474 = 89;
                    class252.field3202 = 180;
                } else {
                    class234.field3042 = class217.field2781.method1127(class379.field4920, false) + class236.field3075.method1322("details", -113) + "%";
                    class349.field4474 = 87;
                }
            } else if (class252.field3202 == 180) {
                int var31 = class449.method2661(2);
                if (var31 == -1) {
                    class234.field3042 = class339.field4334.method1127(class379.field4920, false);
                    class349.field4474 = 90;
                } else if (var31 == 7 || var31 == 9) {
                    this.method144("worldlistfull", 11);
                    class294.method1767(1000, (byte) -64);
                } else if (class503.field7399) {
                    class234.field3042 = class225.field2919.method1127(class379.field4920, false);
                    class252.field3202 = 190;
                    class349.field4474 = 90;
                } else {
                    this.method144("worldlistio_" + var31, 11);
                    class294.method1767(1000, (byte) -118);
                }
            } else if (class252.field3202 == 190) {
                class346.field4415 = new boolean[class487.field7072.field2726];
                class276.field3537 = new int[class487.field7072.field2726];
                class340.field4341 = new String[class501.field7373.field4001];
                for (int var32 = 0; var32 < class487.field7072.field2726; var32++) {
                    if (class487.field7072.method1361((byte) 93, var32).field2660 == 0) {
                        class346.field4415[var32] = true;
                        class451.field6277++;
                    }
                    class276.field3537[var32] = -1;
                }
                class299.method1793((byte) 127);
                class422.field5654 = class257.field3251.method1297("loginscreen", -5105);
                class354.field4551.method1307(false, 3664, true);
                class288.field3685.method1307(true, 3664, true);
                class391.field5121.method1307(true, 3664, true);
                class256.field3245.method1307(true, 3664, true);
                class29.field499.method1307(true, 3664, true);
                class257.field3251.method1307(true, 3664, true);
                class523.field7751.field2617 = 2;
                class335.field4290 = true;
                class138.field1848.field2617 = 2;
                class270.field3423.field2617 = 2;
                class197.field2545.field2617 = 2;
                class114.field1565.field2617 = 2;
                class511.field7533.field2617 = 2;
                class11.field179.field2617 = 2;
                class207.method1348(-1, class421.field5647.field7727, false, -1, 6271);
                class234.field3042 = class424.field5834.method1127(class379.field4920, false);
                class349.field4474 = 95;
                class252.field3202 = 200;
            } else if (class252.field3202 == 200) {
                class181.method1189(true, (byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3036() {
        int var0 = class206.field2684;
        int[] var1 = class143.field1892;
        boolean var2 = class421.field5647.field7725 == 1 && var0 > 200 || class421.field5647.field7725 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class518 var12 = class76.field952[var1[var3]];
            if (var12.method3078(-6181)) {
                var12.method1428(31867);
                if (var12.field6238 >= 0 && var12.field6228 >= 0 && var12.field6229 < class200.field2594 && var12.field6221 < class118.field1647) {
                    var12.field7658 = var12.field5196 ? var2 : false;
                    if (class37.field573 == var12) {
                        var12.field5218 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field5184) {
                            var13++;
                        }
                        if (var12.field5151 > class264.field3353) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method2342(10804) << 2);
                        if (var12.field7649) {
                            var14 += 512;
                        } else {
                            if (class337.field4305 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field5218 = var14 + 1;
                    }
                } else {
                    var12.field5218 = -1;
                }
            } else {
                var12.field5218 = -1;
            }
        }
        for (int var4 = 0; var4 < class16.field264; var4++) {
            class295 var9 = class527.field7791[class414.field5507[var4]];
            if (var9.method1772(-6181) && var9.field3831.method62(class198.field2555, 0)) {
                var9.method1428(31867);
                if (var9.field6238 >= 0 && var9.field6228 >= 0 && var9.field6229 < class200.field2594 && var9.field6221 < class118.field1647) {
                    int var10 = 0;
                    if (!var9.field5184) {
                        var10++;
                    }
                    if (var9.field5151 > class264.field3353) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method2342(10804) << 2);
                    if (class337.field4305 == 0) {
                        if (var9.field3831.field119) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class337.field4305 == 1) {
                        if (var9.field3831.field119) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field3831.field107) {
                        var11 += 1024;
                    } else if (!var9.field3831.field146) {
                        var11 += 256;
                    }
                    var9.field5218 = var11 + 1;
                } else {
                    var9.field5218 = -1;
                }
            } else {
                var9.field5218 = -1;
            }
        }
        for (int var5 = 0; var5 < class509.field7472.length; var5++) {
            class208 var6 = class509.field7472[var5];
            if (var6 != null) {
                if (var6.field2697 == 1) {
                    class295 var7 = class527.field7791[var6.field2693];
                    if (var7 != null && var7.field5218 >= 0) {
                        var7.field5218 += 2048;
                    }
                } else if (var6.field2697 == 10) {
                    class518 var8 = class76.field952[var6.field2693];
                    if (var8 != null && class37.field573 != var8 && var8.field5218 >= 0) {
                        var8.field5218 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field7517++;
        if (!this.method141(-120)) {
            return;
        }
        class196.field2542 = Integer.parseInt(this.getParameter("worldid"));
        class222.field2867 = class22.method158(Integer.parseInt(this.getParameter("modewhere")), -113);
        if (!class183.method1211((byte) -128, class222.field2867) && class246.field3151 != class222.field2867) {
            class222.field2867 = class246.field3151;
        }
        class463.field6568 = class272.method1677(Integer.parseInt(this.getParameter("modewhat")), -55);
        if (class463.field6568 != class287.field3664 && class90.field1259 != class463.field6568 && class463.field6568 != class34.field541) {
            class463.field6568 = class34.field541;
        }
        try {
            class379.field4920 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class379.field4920 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class352.field4502 = true;
        } else {
            class352.field4502 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class251.field3199 = true;
        } else {
            class251.field3199 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class470.field6878 = true;
        } else {
            class470.field6878 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class494.field7234 = class10.field134;
        } else {
            class494.field7234 = class276.field3527;
        }
        try {
            class326.field4189 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class326.field4189 = 0;
        }
        class523.field7754 = this.getParameter("quiturl");
        class297.field3851 = this.getParameter("settings");
        if (class297.field3851 == null) {
            class297.field3851 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class204.field2670 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class204.field2670 = 0;
            }
        }
        class246.field3150 = Integer.parseInt(this.getParameter("colourid"));
        if (class246.field3150 < 0 || class311.field4020.length <= class246.field3150) {
            class246.field3150 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class445.field6183 = true;
            class28.field478 = true;
        }
        if (class494.field7234 == class276.field3527) {
            class366.field4716 = 765;
            class312.field4024 = 503;
        } else if (class494.field7234 == class10.field134) {
            class366.field4716 = 640;
            class312.field4024 = 480;
        }
        class396.field5266 = this;
        this.method137(class312.field4024, class463.field6568.method319((byte) -75) + 32, true, class366.field4716, 583);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Leo;)Lkr;")
    public static final class260 method3037(class423 arg0) {
        class260 var1 = (class260) class4.field27.method2085(((long) arg0.field5734 << 32) + (long) arg0.field5756, -5423);
        return var1 == null ? arg0.field5791 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public static void method3038(boolean arg0) {
        field7509 = null;
        field7520 = null;
        if (arg0) {
            field7513 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3039() {
        int var0 = class206.field2684;
        int[] var1 = class143.field1892;
        int var2 = class388.field5106 ? var0 : class16.field264 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class395 var4;
            if (var3 < var0) {
                var4 = class76.field952[var1[var3]];
            } else {
                var4 = class527.field7791[class414.field5507[var3 - var0]];
            }
            if (var4.field5218 >= 0) {
                int var5 = var4.method2342(10804);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6239 & 0x7F) == 0 && (var4.field6241 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6239 & 0x7F) == 64 && (var4.field6241 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class518 && var4.field5250 != null && class264.field3353 >= var4.field5250.field4524 && class264.field3353 < var4.field5250.field4507) {
                    ((class518) var4).field7658 = false;
                }
                var4.field6224 = class366.method2145(var4.field6220, (byte) 26, var4.field6239, var4.field6241);
                class363.method2134(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method145(byte arg0) {
        field7508++;
        if (class65.field821 == 1000) {
            return;
        }
        class264.field3353++;
        if ((class264.field3353 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class53.field727 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class260.field3300.setSeed((long) class53.field727);
        }
        if (class264.field3353 % 50 == 0) {
            class508.field7465 = class117.field1638;
            class396.field5268 = class377.field4900;
            class117.field1638 = 0;
            class377.field4900 = 0;
        }
        this.method3045(100);
        if (class398.field5292 != null) {
            class398.field5292.method2602(255);
        }
        class508.method3022((byte) -105);
        class439.field6113.method1480(-103);
        class268.field3397.method724(2);
        if (class196.field2535 != null) {
            int var3 = class196.field2535.method228(-15720);
            class458.field6411 = var3;
        }
        if (class512.field7538 != null) {
            class512.field7538.method818((int) class173.method1134(true));
        }
        class365.method2140((byte) -63);
        class437.field5995 = 0;
        class156 var4 = class439.field6113.method1481(0);
        int var5 = 3 % ((arg0 + 13) / 43);
        while (var4 != null && class437.field5995 < 128) {
            if (var4.method1052((byte) 51) != 1) {
                char var6 = var4.method1054(false);
                if (!class142.method976(0) || var6 != '`' && var6 != '§') {
                    class171.field2216[class437.field5995] = var4;
                    class437.field5995++;
                } else if (class408.method2420(9896)) {
                    class215.method1376(1);
                } else {
                    class430.method2549(9474);
                }
            }
            var4 = class439.field6113.method1481(0);
        }
        for (class228 var7 = class268.field3397.method715((byte) 19); var7 != null; var7 = class268.field3397.method715((byte) -37)) {
            int var8 = var7.method1439(-122);
            if (var8 == -1) {
                class446.field6205.method42(var7, 0);
            } else if (class39.method248(var8, -27443)) {
                class61.field792.method42(var7, 0);
            }
            if (class61.field792.method45(-15978) > 10) {
                class61.field792.method52((byte) -104);
            }
        }
        if (class408.method2420(9896)) {
            class129.method827(113);
        }
        if (class65.field821 == 0) {
            this.method3035(-39);
            class324.method1927(0);
        } else if (class65.field821 == 5) {
            this.method3035(-97);
            class324.method1927(0);
        } else if (class65.field821 == 25 || class65.field821 == 28) {
            class527.method3117(93);
        }
        if (class65.field821 == 10) {
            this.method3034(false);
            class338.method1996((byte) 117);
            class436.method2571(1000);
            class143.method995(0);
        } else if (class65.field821 == 30) {
            class521.method3103((byte) -113);
        } else if (class65.field821 == 40) {
            class143.method995(0);
            if (class169.field2211 != -3 && class169.field2211 != 2 && class169.field2211 != 15) {
                class450.method2667((byte) -120);
            }
        }
        class487.method2911((byte) 62, class512.field7538);
        class61.field792.method52((byte) -108);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method3040(int arg0, byte[] arg1) {
        field7506++;
        if (arg0 != 1) {
            field7520 = null;
        }
        class88 var3 = new class88(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method617(2);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class314.field4047 = new int[6];
                        var9[0] = var3.method568((byte) 110);
                        var9[1] = var3.method568((byte) 110);
                        var9[2] = var3.method568((byte) 110);
                        var9[3] = var3.method568((byte) 110);
                        var9[4] = var3.method568((byte) 110);
                        var9[5] = var3.method568((byte) 110);
                    } else if (var4 == 4) {
                        int var5 = var3.method617(2);
                        class266.field3371 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class266.field3371[var6] = var3.method568((byte) 110);
                            if (class266.field3371[var6] == 65535) {
                                class266.field3371[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method617(arg0 ^ 0x3);
                        class157.field2073 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class157.field2073[var8] = var3.method568((byte) 110);
                            if (class157.field2073[var8] == 65535) {
                                class157.field2073[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method3041(int arg0) {
        int var1 = class206.field2684;
        int[] var2 = class143.field1892;
        for (int var3 = 0; var3 < class16.field264 + var1; var3++) {
            class395 var4;
            if (var3 < var1) {
                var4 = class76.field952[var2[var3]];
            } else {
                var4 = class527.field7791[class414.field5507[var3 - var1]];
            }
            if (var4.field6220 == arg0 && var4.field5218 >= 0) {
                int var5 = var4.method2342(10804);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6239 & 0x7F) != 0 || (var4.field6241 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6239 & 0x7F) != 64 || (var4.field6241 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6239 >> 7;
                    int var7 = var4.field6241 >> 7;
                    if (var4.field5218 > class484.field7043[var6][var7]) {
                        class484.field7043[var6][var7] = var4.field5218;
                        class497.field7276[var6][var7] = 1;
                    } else if (class484.field7043[var6][var7] == var4.field5218) {
                        var10002 = class497.field7276[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6239 - var8 >> 7;
                    int var10 = var4.field6241 - var8 >> 7;
                    int var11 = var4.field6239 + var8 >> 7;
                    int var12 = var4.field6241 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5218 > class484.field7043[var13][var14]) {
                                class484.field7043[var13][var14] = var4.field5218;
                                class497.field7276[var13][var14] = 1;
                            } else if (class484.field7043[var13][var14] == var4.field5218) {
                                var10002 = class497.field7276[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method3042(byte arg0) {
        field7505++;
        if (class187.field2441.field4628 > class215.field2755) {
            class356.field4570 = (class187.field2441.field4628 - 1) * 250;
            if (class531.field7821 == class116.field1631) {
                class116.field1631 = class385.field5067;
            } else {
                class116.field1631 = class531.field7821;
            }
            if (class356.field4570 > 3000) {
                class356.field4570 = 3000;
            }
            if (class187.field2441.field4628 >= 2 && class187.field2441.field4630 == 6) {
                this.method144("js5connect_outofdate", 11);
                class65.field821 = 1000;
                return;
            }
            if (class187.field2441.field4628 >= 4 && class187.field2441.field4630 == -1) {
                this.method144("js5crc", 11);
                class65.field821 = 1000;
                return;
            }
            if (class187.field2441.field4628 >= 4 && (class65.field821 == 0 || class65.field821 == 5)) {
                if (class187.field2441.field4630 == 7 || class187.field2441.field4630 == 9) {
                    this.method144("js5connect_full", 11);
                } else if (class187.field2441.field4630 <= 0) {
                    this.method144("js5io", 11);
                } else {
                    this.method144("js5connect", 11);
                }
                class65.field821 = 1000;
                return;
            }
        }
        class215.field2755 = class187.field2441.field4628;
        if (class356.field4570 > 0) {
            class356.field4570--;
            return;
        }
        try {
            if (class467.field6868 == 0) {
                class283.field3619 = class172.field2221.method2622(class385.field5066, class116.field1631, -1727);
                class467.field6868++;
            }
            if (arg0 < 58) {
                this.method145((byte) 109);
            }
            if (class467.field6868 == 1) {
                if (class283.field3619.field3542 == 2) {
                    this.method3046(1000, 0);
                    return;
                }
                if (class283.field3619.field3542 == 1) {
                    class467.field6868++;
                }
            }
            if (class467.field6868 == 2) {
                class516.field7577 = new class144((Socket) class283.field3619.field3541, class172.field2221);
                class88 var2 = new class88(5);
                var2.method565(112, class275.field3514.field195);
                var2.method572(-127, 583);
                class516.field7577.method1001(0, (byte) -118, var2.field1223, 5);
                class467.field6868++;
                class265.field3365 = class173.method1134(true);
            }
            if (class467.field6868 == 3) {
                if (class65.field821 == 0 || class65.field821 == 5 || class516.field7577.method1004(3) > 0) {
                    int var3 = class516.field7577.method1000((byte) 29);
                    if (var3 != 0) {
                        this.method3046(var3, 0);
                        return;
                    }
                    class467.field6868++;
                } else if ((class173.method1134(true) - class265.field3365) > 30000L) {
                    this.method3046(1001, 0);
                    return;
                }
            }
            if (class467.field6868 == 4) {
                boolean var4 = class65.field821 == 5 || class65.field821 == 10 || class65.field821 == 28;
                class187.field2441.method2100(!var4, (byte) 5, class516.field7577);
                class467.field6868 = 0;
                class516.field7577 = null;
                class283.field3619 = null;
            }
        } catch (IOException var5) {
            this.method3046(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Leo;IIIIIIIII)V")
    public static final void method3043(class423[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class423 var11 = arg0[var10];
            if (var11 != null && var11.field5823 == arg1) {
                int var12 = var11.field5808 + arg6;
                int var13 = var11.field5802 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5741 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5735 + var12;
                    int var19 = var11.field5726 + var13;
                    if (var11.field5741 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5741 == 0 || var11.field5809 || method3037(var11).field3305 != 0 || class12.field198 == var11 || class22.field415 == var11.field5800) {
                    if (!method3033(var11)) {
                        if (class465.field6838 == var11) {
                            class218.field2785 = true;
                            class89.field1241 = var12;
                            class20.field345 = var13;
                        }
                        if (var11.field5682 || var14 < var16 && var15 < var17) {
                            if (var11.field5818 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class195 var20 = (class195) class243.field3114.method49(13); var20 != null; var20 = (class195) class243.field3114.method46((byte) 43)) {
                                    if (var20.field2524) {
                                        var20.method3021(14);
                                        var20.field2516.field5664 = false;
                                    }
                                }
                                if (class161.field2099 == 0) {
                                    class465.field6838 = null;
                                    class12.field198 = null;
                                }
                                class142.field1882 = 0;
                                class415.field5534 = false;
                                class189.field2477 = false;
                                if (!class450.field6267) {
                                    class57.method326((byte) -104);
                                }
                            }
                            boolean var21;
                            if (class268.field3397.method717((byte) 82) >= var14 && class268.field3397.method721((byte) 74) >= var15 && class268.field3397.method717((byte) 82) < var16 && class268.field3397.method721((byte) 74) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class515.field7573 && var21) {
                                if (var11.field5709 >= 0) {
                                    class501.field7364 = var11.field5709;
                                } else if (var11.field5818) {
                                    class501.field7364 = -1;
                                }
                            }
                            if (!class450.field6267 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class307.method1830(16383, arg9 - var13, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class268.field3397.method727((byte) -103) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class228 var24 = (class228) class61.field792.method49(-8);
                            if (var24 != null && var24.method1439(-110) == 0 && var24.method1444(-97) >= var14 && var24.method1442((byte) 71) >= var15 && var24.method1444(-98) < var16 && var24.method1442((byte) 71) < var17) {
                                var23 = true;
                            }
                            if (var11.field5816 != null) {
                                for (int var25 = 0; var25 < var11.field5816.length; var25++) {
                                    if (class439.field6113.method1488((byte) 66, var11.field5816[var25])) {
                                        if (var11.field5827 == null || class264.field3353 >= var11.field5827[var25]) {
                                            byte var26 = var11.field5775[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class439.field6113.method1488((byte) 68, 86) && !class439.field6113.method1488((byte) 113, 82) && !class439.field6113.method1488((byte) 103, 81)) && ((var26 & 0x2) == 0 || class439.field6113.method1488((byte) 125, 86)) && ((var26 & 0x1) == 0 || class439.field6113.method1488((byte) 80, 82)) && ((var26 & 0x4) == 0 || class439.field6113.method1488((byte) 90, 81))) {
                                                if (var25 < 10) {
                                                    class449.method2663("", var11.field5734, -1, 2, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class356.method2082(-1);
                                                    class260 var27 = method3037(var11);
                                                    class271.method1667(var27.method1628((byte) -126), var27.field3302, var11, (byte) 32);
                                                    class257.field3252 = class517.method3072(97, var11);
                                                    if (class257.field3252 == null) {
                                                        class257.field3252 = "Null";
                                                    }
                                                    class195.field2532 = var11.field5799 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5676[var25];
                                                if (var11.field5827 == null) {
                                                    var11.field5827 = new int[var11.field5816.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5827[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5827[var25] = class264.field3353 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5827 != null) {
                                        var11.field5827[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class236.method1503((byte) -96, var11, var24.method1444(-115) - var12, var24.method1442((byte) 71) - var13);
                            }
                            if (class465.field6838 != null && class465.field6838 != var11 && var21 && method3037(var11).method1627(-28246)) {
                                class502.field7383 = var11;
                            }
                            if (class12.field198 == var11) {
                                class141.field1871 = true;
                                class108.field1480 = var12;
                                class219.field2814 = var13;
                            }
                            if (var11.field5809 || var11.field5800 != 0) {
                                if (var21 && class458.field6411 != 0 && var11.field5743 != null) {
                                    class195 var29 = new class195();
                                    var29.field2524 = true;
                                    var29.field2516 = var11;
                                    var29.field2530 = class458.field6411;
                                    var29.field2523 = var11.field5743;
                                    class243.field3114.method42(var29, 0);
                                }
                                if (class465.field6838 != null || class450.field6267 || class93.field1306 != var11.field5800 && class142.field1882 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5800 != 0) {
                                    if (class181.field2364 == var11.field5800 || class518.field7672 == var11.field5800) {
                                        class495.field7238 = var11;
                                        if (class11.field190 != null) {
                                            class11.field190.method2809(var11.field5726, 0, class512.field7538);
                                        }
                                        if (class181.field2364 == var11.field5800) {
                                            if (!class450.field6267 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class447.method2655(arg9, arg8, 57, class512.field7538);
                                                for (class344 var30 = (class344) class180.field2333.method2122(0); var30 != null; var30 = (class344) class180.field2333.method2129(86)) {
                                                    if (arg8 >= var30.field4372 && arg8 < var30.field4378 && arg9 >= var30.field4373 && arg9 < var30.field4375) {
                                                        class57.method326((byte) -40);
                                                        class447.method2656((byte) 60, var30.field4379);
                                                    }
                                                }
                                            }
                                            class235.method1500(var11, var12, var13, 105);
                                            continue;
                                        }
                                    }
                                    if (class22.field415 == var11.field5800) {
                                        if (var11.method2498(25733, class512.field7538) == null || class461.field6450 != 0 && class461.field6450 != 3 || class450.field6267 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5778[var32];
                                        if (var31 < var33 || var31 > var11.field5817[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5735 / 2;
                                        int var35 = var32 - var11.field5726 / 2;
                                        int var36;
                                        if (class396.field5271 == 4) {
                                            var36 = (int) class244.field3138 & 0x3FFF;
                                        } else {
                                            var36 = (int) class244.field3138 + class446.field6192 & 0x3FFF;
                                        }
                                        int var37 = class21.field385[var36];
                                        int var38 = class21.field397[var36];
                                        if (class396.field5271 != 4) {
                                            var37 = (class364.field4694 + 256) * var37 >> 8;
                                            var38 = (class364.field4694 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class396.field5271 == 4) {
                                            var41 = (class157.field2069 >> 7) + (var39 >> 2);
                                            var42 = (class265.field3369 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class37.field573.method2342(10804) - 1) * 64;
                                            var41 = (class37.field573.field6239 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class37.field573.field6241 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class515.field7573 && (class182.field2380 & 0x40) != 0) {
                                            class423 var44 = class520.method3091(class172.field2229, (byte) 126, class206.field2687);
                                            if (var44 == null) {
                                                class356.method2082(-1);
                                            } else {
                                                class126.method793(var42, 20, 1L, var11.field5763, var41, (byte) -5, false, " ->", true, class257.field3252, class35.field543);
                                            }
                                            continue;
                                        }
                                        if (class494.field7234 == class10.field134) {
                                            class126.method793(var42, 12, 1L, -1, var41, (byte) -5, false, "", true, class388.field5095.method1127(class379.field4920, false), -1);
                                        }
                                        class126.method793(var42, 21, 1L, -1, var41, (byte) -5, false, "", true, class211.field2712, class381.field4965);
                                        continue;
                                    }
                                    if (class93.field1306 == var11.field5800) {
                                        class14.field240 = var11;
                                        if (var21) {
                                            class415.field5534 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1444(-123) - var12 - var11.field5735 / 2) * 2.0D / (double) class230.field2952);
                                            int var46 = (int) (-((double) (var24.method1442((byte) 71) - var13 - var11.field5726 / 2) * 2.0D / (double) class230.field2952));
                                            int var47 = class267.field3389 + var45 + class230.field2983;
                                            int var48 = class346.field4413 + var46 + class230.field2971;
                                            class325 var49 = class8.method57((byte) 110);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1933(var48, var50, (byte) 0, var47);
                                            if (var50 != null) {
                                                if (class439.field6113.method1488((byte) 100, 82) && class363.field4685 > 0) {
                                                    class195.method1264(var50[0], 0, var50[2], var50[1]);
                                                    continue;
                                                }
                                                class189.field2477 = true;
                                                class272.field3457 = var50[0];
                                                class88.field1196 = var50[1];
                                                class426.field5848 = var50[2];
                                            }
                                            class142.field1882 = 1;
                                            class111.field1535 = false;
                                            class108.field1479 = class268.field3397.method717((byte) 82);
                                            class227.field2929 = class268.field3397.method721((byte) 74);
                                            continue;
                                        }
                                        if (var22 && class142.field1882 > 0) {
                                            if (class142.field1882 == 1 && (class108.field1479 != class268.field3397.method717((byte) 82) || class227.field2929 != class268.field3397.method721((byte) 74))) {
                                                class440.field6131 = class267.field3389;
                                                class214.field2738 = class346.field4413;
                                                class142.field1882 = 2;
                                            }
                                            if (class142.field1882 == 2) {
                                                class111.field1535 = true;
                                                class450.method2668(class440.field6131 + (int) ((double) (class108.field1479 - class268.field3397.method717((byte) 82)) * 2.0D / (double) class230.field2954), 1);
                                                class22.method156((byte) 104, class214.field2738 - (int) ((double) (class227.field2929 - class268.field3397.method721((byte) 74)) * 2.0D / (double) class230.field2954));
                                            }
                                            continue;
                                        }
                                        if (class142.field1882 > 0 && !class111.field1535) {
                                            if ((class353.field4531 == 1 || class203.method1331((byte) 93)) && class271.field3433 > 2) {
                                                class179.method1156(class108.field1479, 33, class227.field2929);
                                            } else if (class328.method1951(false)) {
                                                class179.method1156(class108.field1479, 33, class227.field2929);
                                            }
                                        }
                                        class142.field1882 = 0;
                                        continue;
                                    }
                                    if (class51.field702 == var11.field5800) {
                                        if (var22) {
                                            class263.method1646(class268.field3397.method721((byte) 74) - var13, class268.field3397.method717((byte) 82) - var12, false, var11.field5735, var11.field5726);
                                        }
                                        continue;
                                    }
                                    if (class494.field7225 == var11.field5800) {
                                        class245.method1535(var11, var13, var12, -53);
                                        continue;
                                    }
                                }
                                if (!var11.field5786 && var23) {
                                    var11.field5786 = true;
                                    if (var11.field5681 != null) {
                                        class195 var51 = new class195();
                                        var51.field2524 = true;
                                        var51.field2516 = var11;
                                        var51.field2521 = var24.method1444(-125) - var12;
                                        var51.field2530 = var24.method1442((byte) 71) - var13;
                                        var51.field2523 = var11.field5681;
                                        class243.field3114.method42(var51, 0);
                                    }
                                }
                                if (var11.field5786 && var22 && var11.field5826 != null) {
                                    class195 var52 = new class195();
                                    var52.field2524 = true;
                                    var52.field2516 = var11;
                                    var52.field2521 = class268.field3397.method717((byte) 82) - var12;
                                    var52.field2530 = class268.field3397.method721((byte) 74) - var13;
                                    var52.field2523 = var11.field5826;
                                    class243.field3114.method42(var52, 0);
                                }
                                if (var11.field5786 && !var22) {
                                    var11.field5786 = false;
                                    if (var11.field5810 != null) {
                                        class195 var53 = new class195();
                                        var53.field2524 = true;
                                        var53.field2516 = var11;
                                        var53.field2521 = class268.field3397.method717((byte) 82) - var12;
                                        var53.field2530 = class268.field3397.method721((byte) 74) - var13;
                                        var53.field2523 = var11.field5810;
                                        class115.field1627.method42(var53, 0);
                                    }
                                }
                                if (var22 && var11.field5687 != null) {
                                    class195 var54 = new class195();
                                    var54.field2524 = true;
                                    var54.field2516 = var11;
                                    var54.field2521 = class268.field3397.method717((byte) 82) - var12;
                                    var54.field2530 = class268.field3397.method721((byte) 74) - var13;
                                    var54.field2523 = var11.field5687;
                                    class243.field3114.method42(var54, 0);
                                }
                                if (!var11.field5664 && var21) {
                                    var11.field5664 = true;
                                    if (var11.field5721 != null) {
                                        class195 var55 = new class195();
                                        var55.field2524 = true;
                                        var55.field2516 = var11;
                                        var55.field2521 = class268.field3397.method717((byte) 82) - var12;
                                        var55.field2530 = class268.field3397.method721((byte) 74) - var13;
                                        var55.field2523 = var11.field5721;
                                        class243.field3114.method42(var55, 0);
                                    }
                                }
                                if (var11.field5664 && var21 && var11.field5748 != null) {
                                    class195 var56 = new class195();
                                    var56.field2524 = true;
                                    var56.field2516 = var11;
                                    var56.field2521 = class268.field3397.method717((byte) 82) - var12;
                                    var56.field2530 = class268.field3397.method721((byte) 74) - var13;
                                    var56.field2523 = var11.field5748;
                                    class243.field3114.method42(var56, 0);
                                }
                                if (var11.field5664 && !var21) {
                                    var11.field5664 = false;
                                    if (var11.field5708 != null) {
                                        class195 var57 = new class195();
                                        var57.field2524 = true;
                                        var57.field2516 = var11;
                                        var57.field2521 = class268.field3397.method717((byte) 82) - var12;
                                        var57.field2530 = class268.field3397.method721((byte) 74) - var13;
                                        var57.field2523 = var11.field5708;
                                        class115.field1627.method42(var57, 0);
                                    }
                                }
                                if (var11.field5695 != null) {
                                    class195 var58 = new class195();
                                    var58.field2516 = var11;
                                    var58.field2523 = var11.field5695;
                                    class212.field2722.method42(var58, 0);
                                }
                                if (var11.field5732 != null && class316.field4075 > var11.field5707) {
                                    if (var11.field5769 == null || class316.field4075 - var11.field5707 > 32) {
                                        class195 var63 = new class195();
                                        var63.field2516 = var11;
                                        var63.field2523 = var11.field5732;
                                        class243.field3114.method42(var63, 0);
                                    } else {
                                        label691: for (int var59 = var11.field5707; var59 < class316.field4075; var59++) {
                                            int var60 = class30.field500[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5769.length; var61++) {
                                                if (var11.field5769[var61] == var60) {
                                                    class195 var62 = new class195();
                                                    var62.field2516 = var11;
                                                    var62.field2523 = var11.field5732;
                                                    class243.field3114.method42(var62, 0);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5707 = class316.field4075;
                                }
                                if (var11.field5665 != null && class223.field2873 > var11.field5680) {
                                    if (var11.field5772 == null || class223.field2873 - var11.field5680 > 32) {
                                        class195 var68 = new class195();
                                        var68.field2516 = var11;
                                        var68.field2523 = var11.field5665;
                                        class243.field3114.method42(var68, 0);
                                    } else {
                                        label667: for (int var64 = var11.field5680; var64 < class223.field2873; var64++) {
                                            int var65 = class283.field3621[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5772.length; var66++) {
                                                if (var11.field5772[var66] == var65) {
                                                    class195 var67 = new class195();
                                                    var67.field2516 = var11;
                                                    var67.field2523 = var11.field5665;
                                                    class243.field3114.method42(var67, 0);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5680 = class223.field2873;
                                }
                                if (var11.field5688 != null && class14.field238 > var11.field5724) {
                                    if (var11.field5689 == null || class14.field238 - var11.field5724 > 32) {
                                        class195 var73 = new class195();
                                        var73.field2516 = var11;
                                        var73.field2523 = var11.field5688;
                                        class243.field3114.method42(var73, 0);
                                    } else {
                                        label643: for (int var69 = var11.field5724; var69 < class14.field238; var69++) {
                                            int var70 = class328.field4216[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5689.length; var71++) {
                                                if (var11.field5689[var71] == var70) {
                                                    class195 var72 = new class195();
                                                    var72.field2516 = var11;
                                                    var72.field2523 = var11.field5688;
                                                    class243.field3114.method42(var72, 0);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5724 = class14.field238;
                                }
                                if (var11.field5812 != null && class103.field1410 > var11.field5699) {
                                    if (var11.field5684 == null || class103.field1410 - var11.field5699 > 32) {
                                        class195 var78 = new class195();
                                        var78.field2516 = var11;
                                        var78.field2523 = var11.field5812;
                                        class243.field3114.method42(var78, 0);
                                    } else {
                                        label619: for (int var74 = var11.field5699; var74 < class103.field1410; var74++) {
                                            int var75 = class331.field4254[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5684.length; var76++) {
                                                if (var11.field5684[var76] == var75) {
                                                    class195 var77 = new class195();
                                                    var77.field2516 = var11;
                                                    var77.field2523 = var11.field5812;
                                                    class243.field3114.method42(var77, 0);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5699 = class103.field1410;
                                }
                                if (var11.field5780 != null && class276.field3533 > var11.field5706) {
                                    if (var11.field5790 == null || class276.field3533 - var11.field5706 > 32) {
                                        class195 var83 = new class195();
                                        var83.field2516 = var11;
                                        var83.field2523 = var11.field5780;
                                        class243.field3114.method42(var83, 0);
                                    } else {
                                        label595: for (int var79 = var11.field5706; var79 < class276.field3533; var79++) {
                                            int var80 = class426.field5852[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5790.length; var81++) {
                                                if (var11.field5790[var81] == var80) {
                                                    class195 var82 = new class195();
                                                    var82.field2516 = var11;
                                                    var82.field2523 = var11.field5780;
                                                    class243.field3114.method42(var82, 0);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5706 = class276.field3533;
                                }
                                if (class183.field2410 > var11.field5668 && var11.field5717 != null) {
                                    class195 var84 = new class195();
                                    var84.field2516 = var11;
                                    var84.field2523 = var11.field5717;
                                    class243.field3114.method42(var84, 0);
                                }
                                if (class162.field2107 > var11.field5668 && var11.field5712 != null) {
                                    class195 var85 = new class195();
                                    var85.field2516 = var11;
                                    var85.field2523 = var11.field5712;
                                    class243.field3114.method42(var85, 0);
                                }
                                if (class4.field37 > var11.field5668 && var11.field5781 != null) {
                                    class195 var86 = new class195();
                                    var86.field2516 = var11;
                                    var86.field2523 = var11.field5781;
                                    class243.field3114.method42(var86, 0);
                                }
                                if (class104.field1431 > var11.field5668 && var11.field5754 != null) {
                                    class195 var87 = new class195();
                                    var87.field2516 = var11;
                                    var87.field2523 = var11.field5754;
                                    class243.field3114.method42(var87, 0);
                                }
                                if (class259.field3282 > var11.field5668 && var11.field5813 != null) {
                                    class195 var88 = new class195();
                                    var88.field2516 = var11;
                                    var88.field2523 = var11.field5813;
                                    class243.field3114.method42(var88, 0);
                                }
                                var11.field5668 = class165.field2140;
                                if (var11.field5733 != null) {
                                    for (int var89 = 0; var89 < class437.field5995; var89++) {
                                        class195 var90 = new class195();
                                        var90.field2516 = var11;
                                        var90.field2517 = class171.field2216[var89].method1057((byte) -40);
                                        var90.field2522 = class171.field2216[var89].method1054(false);
                                        var90.field2523 = var11.field5733;
                                        class243.field3114.method42(var90, 0);
                                    }
                                }
                                if (class16.field262 && var11.field5722 != null) {
                                    class195 var91 = new class195();
                                    var91.field2516 = var11;
                                    var91.field2523 = var11.field5722;
                                    class243.field3114.method42(var91, 0);
                                }
                            }
                            if (var11.field5741 == 5 && var11.field5694 != -1) {
                                var11.method2506(class264.field3355, 0, class261.field3316).method2809(var11.field5726, 0, class512.field7538);
                            }
                            class366.method2146(false, var11);
                            if (var11.field5741 == 0) {
                                method3043(arg0, var11.field5734, var14, var15, var16, var17, var12 - var11.field5678, var13 - var11.field5686, arg8, arg9);
                                if (var11.field5679 != null) {
                                    method3043(var11.field5679, var11.field5734, var14, var15, var16, var17, var12 - var11.field5678, var13 - var11.field5686, arg8, arg9);
                                }
                                class367 var92 = (class367) class381.field4963.method2085((long) var11.field5734, -5423);
                                if (var92 != null) {
                                    if (class494.field7234 == class276.field3527 && var92.field4721 == 0 && !class450.field6267 && var21 && !class285.field3633) {
                                        class57.method326((byte) -98);
                                    }
                                    class96.method662(var13, var14, var15, arg8, var92.field4719, -1, arg9, var16, var17, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class366.method2146(false, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method149(int arg0) {
        field7519++;
        method3038(true);
        class240.method1518(false);
        class169.method1124(true);
        class432.method2555((byte) -68);
        class472.method2832((byte) 113);
        class210.method1353((byte) 121);
        class221.method1409(-2798);
        class85.method538(1);
        class508.method3020((byte) -94);
        class476.method2857(true);
        class357.method2086(0);
        class21.method147((byte) -61);
        class333.method1981(-6145);
        class55.method318(-2);
        class82.method468((byte) 114);
        class65.method367(34844);
        class142.method989(1);
        class129.method858(40);
        class95.method649(1);
        class208.method1351((byte) 127);
        class183.method1217(true);
        class7.method48(28765);
        class144.method1005(2);
        class391.method2334((byte) -105);
        class440.method2598(-1);
        class396.method2361(-74);
        class201.method1296(-25059);
        class275.method1687(11464);
        class374.method2188((byte) -57);
        class11.method76((byte) -98);
        class316.method1879((byte) 113);
        class166.method1098((byte) 107);
        class159.method1067(-28310);
        class4.method24(42);
        class261.method1634(11141);
        class389.method2321((byte) 113);
        class524.method3109(116);
        class256.method1610((byte) 124);
        class179.method1161(50);
        class164.method1092(64);
        class249.method1563((byte) -114);
        class314.method1865(64);
        class18.method121((byte) -68);
        class308.method1838(8);
        class189.method1241((byte) 89);
        class329.method1955((byte) 119);
        class75.method432(true);
        class198.method1274((byte) 127);
        class235.method1499((byte) 43);
        class349.method2056((byte) -104);
        class310.method1852(123);
        class213.method1360(-69);
        class243.method1522(-41);
        class108.method709(30905);
        class141.method975(true);
        class16.method98((byte) -86);
        class340.method2004((byte) 68);
        class426.method2519(true);
        class246.method1536((byte) -80);
        class215.method1379(-30762);
        class381.method2221(240);
        class325.method1937((byte) -89);
        class67.method383(0);
        class466.method2815(false);
        class362.method2125(true);
        class423.method2494(120);
        class268.method1657((byte) -55);
        class518.method3075(113);
        class111.method731(99999999);
        class321.method1920(-122);
        class88.method595(-1);
        class395.method2348(52);
        class167.method1117(-124);
        class510.method3028(-81);
        class459.method2710((byte) 102);
        class354.method2078(55);
        class9.method60(false);
        class260.method1624(-125);
        class250.method1565((byte) -3);
        class377.method2202((byte) -104);
        class364.method2139((byte) -33);
        class494.method2955(-78);
        class519.method3086((byte) 16);
        class175.method1138((byte) 29);
        class412.method2433(false);
        class512.method3052(121);
        class196.method1267(-89);
        class398.method2372(5024);
        class503.method3002((byte) 96);
        class521.method3098(67);
        class345.method2025((byte) 91);
        class424.method2512((byte) -77);
        class44.method286((byte) -111);
        class507.method3012(-101);
        class478.method2866(1);
        class191.method1247((byte) 31);
        class258.method1614((byte) 44);
        class402.method2384(10);
        class420.method2476(104);
        class445.method2641(2);
        class251.method1569(true);
        class10.method71(true);
        class497.method2970(-1879);
        class212.method1359(-24409);
        class382.method2245((byte) -9);
        class493.method2949(-17377);
        class83.method473((byte) 120);
        class449.method2662(-1);
        class113.method737(false);
        class278.method1714(false);
        class287.method1743(104);
        class182.method1195((byte) -60);
        class152.method1048((byte) -114);
        class293.method1764((byte) 88);
        class63.method358(true);
        class227.method1435(105);
        class415.method2447(-1);
        class312.method1861(-118);
        class40.method251((byte) 105);
        class171.method1130(0);
        class223.method1423(-127);
        class23.method160((byte) -124);
        class480.method2876((byte) 87);
        class232.method1475(-2);
        class252.method1572(false);
        class32.method222(-1363843088);
        class490.method2922();
        class230.method1455();
        class105.method700((byte) -126);
        class343.method2016((byte) 119);
        class455.method2699();
        class81.method467(3);
        class429.method2541((byte) -79);
        class12.method93((byte) -105);
        class419.method2460(-102);
        class151.method1045(9924);
        class98.method673((byte) -52);
        class499.method2988(-109);
        class505.method3007(-46);
        class187.method1233(false);
        class483.method2897(-1804455320);
        class371.method2165(84);
        class274.method1681((byte) 64);
        class127.method809(28935);
        class286.method1738((byte) -118);
        class407.method2419(6);
        class112.method735(-5196);
        class245.method1534(2048);
        class451.method2669((byte) 97);
        class446.method2654(false);
        class348.method2049(113);
        class186.method1231(-98);
        class318.method1894(-6);
        class76.method434((byte) 4);
        class122.method776(99);
        class203.method1329(104);
        class51.method307(false);
        class481.method2884((byte) 86);
        class24.method165(6);
        class408.method2421(false);
        class365.method2143(31585);
        class199.method1277(84);
        class114.method744(101);
        class41.method253();
        class163.method1082((byte) -74);
        class350.method2059((byte) -124);
        class236.method1501(true);
        class225.method1432((byte) -90);
        class92.method634((byte) -109);
        class311.method1857(-21571);
        class248.method1555(-117);
        class174.method1137(2);
        class104.method697((byte) -82);
        class19.method125(8);
        class216.method1388(false);
        class195.method1262((byte) -84);
        class296.method1783(true);
        class457.method2706((byte) -118);
        class448.method2657((byte) -128);
        class242.method1521(10240);
        class465.method2807((byte) 107);
        class58.method332(-2);
        class330.method1975();
        class353.method2073(false);
        class315.method1874((byte) 100);
        class86.method544((byte) -120);
        class338.method1993((byte) 34);
        class270.method1665(true);
        class303.method1816(0);
        class319.method1901((byte) -90);
        class265.method1650(114);
        class254.method1586(4);
        class405.method2410(97);
        class513.method3055(false);
        class378.method2205(-117);
        class25.method168(84);
        class266.method1652((byte) -80);
        class14.method95(3);
        class117.method754((byte) 116);
        class339.method2000(-120);
        class388.method2317(-52);
        class495.method2962((byte) 45);
        class124.method786(5);
        class204.method1337(0);
        class192.method1248(61);
        class344.method2020(-98);
        class52.method311(-22030);
        class328.method1950(false);
        class28.method190(false);
        class237.method1504(1);
        class54.method317(7);
        class73.method420((byte) -85);
        class200.method1289(-117);
        class172.method1132(0);
        class279.method1716(98);
        class347.method2042(0);
        class162.method1078(false);
        class300.method1800(false);
        class509.method3025((byte) -97);
        class15.method97();
        class473.method2835(true);
        class165.method1094(1);
        class376.method2199(-95);
        class234.method1485(0);
        class109.method719((byte) -111);
        class285.method1734(-41);
        class202.method1326(false);
        class406.method2411((byte) -117);
        class326.method1942(true);
        class60.method338(0);
        class238.method1513(94);
        class253.method1582();
        class13.method94((byte) 94);
        class157.method1059(-108);
        class301.method1810((byte) 12);
        class272.method1674(2);
        class491.method2936(-126);
        class121.method768(-36);
        class488.method2918((byte) 25);
        class368.method2151(24931);
        class107.method703(4);
        class188.method1240(false);
        class516.method3065(-125);
        class259.method1622(76);
        class461.method2715(-4222);
        class501.method2990(10);
        class206.method1344((byte) -103);
        class372.method2169(28098);
        class527.method3120(-1410962812);
        class458.method2707(1407);
        class528.method3125();
        class194.method1255((byte) 52);
        class91.method627(-122);
        class309.method1845();
        class145.method1012();
        class435.method2564();
        class217.method1390(false);
        class414.method2436(false);
        class280.method1718();
        class471.method2830((byte) 125);
        class37.method238(-1);
        class342.method2012(-89);
        class427.method2527();
        class34.method224(-1);
        class43.method277((byte) 98);
        class96.method660(false);
        class197.method1269(99);
        class443.method2635(-123);
        class103.method691(99);
        class70.method396(0);
        class294.method1768(-26);
        class257.method1613((byte) -55);
        class118.method756(-1501926136);
        class531.method3143(-9);
        class47.method295((byte) -126);
        class355.method2079(-18139);
        class380.method2213((byte) -120);
        class90.method623((byte) 72);
        class119.method759(true);
        class29.method203((byte) -105);
        class8.method55(false);
        class324.method1925((byte) 113);
        class356.method2083(25718);
        class78.method452(118);
        class115.method749(16);
        class463.method2774(3);
        class161.method1072(-1);
        class71.method408(true);
        class20.method129((byte) -126);
        class487.method2908((byte) -92);
        class271.method1670((byte) -126);
        class452.method2675(true);
        class298.method1787(5889);
        class233.method1477(0);
        class31.method218(9729);
        class346.method2041((byte) 9);
        class486.method2905(52);
        class386.method2302(true);
        class438.method2584((byte) -120);
        class139.method967(86);
        class244.method1530(-117);
        class409.method2427();
        class522.method3104(false);
        class484.method2900((byte) 85);
        class470.method2824(true);
        class370.method2160(118);
        class53.method314((byte) 93);
        class302.method1813((byte) -125);
        class422.method2491(5);
        class421.method2487((byte) 106);
        class283.method1727(-1);
        class69.method392((byte) 62);
        class282.method1725((byte) 70);
        class289.method1750(92);
        class267.method1655(true);
        class93.method638(-114);
        class439.method2596(false);
        class269.method1658(128);
        class131.method926(1);
        class74.method422((byte) -86);
        class6.method33(-20396);
        class281.method1719(94);
        class284.method1730(20613);
        class158.method1063((byte) 126);
        class379.method2209((byte) -127);
        class168.method1121((byte) 7);
        class89.method620(0);
        class264.method1648(-319666452);
        class450.method2666(false);
        class297.method1786(4096);
        class222.method1421(-2);
        class290.method1754(false);
        class276.method1697(false);
        class123.method783();
        class84.method498();
        class64.method363((byte) 102);
        class185.method1227((byte) -103);
        class359.method2113((byte) 57);
        class492.method2942(48);
        class205.method1339((byte) 21);
        class5.method30(true);
        class460.method2713((byte) -22);
        class288.method1746(false);
        class126.method797(-501);
        class477.method2865(2);
        class511.method3049(128);
        class177.method1150((byte) 115);
        class231.method1472(0);
        class299.method1792(-38);
        class520.method3093(125);
        class181.method1192((byte) -106);
        class180.method1184(-25629);
        class133.method939(-128);
        class147.method1017(-8339);
        class211.method1355(true);
        class523.method3107(-1);
        class120.method761((byte) 105);
        class351.method2064(117);
        class102.method686(107);
        class485.method2901(-1);
        class61.method345((byte) 93);
        class417.method2455(2);
        class514.method3057(37);
        class42.method265(127);
        class97.method666(768);
        class363.method2133(0);
        class430.method2548(108);
        class335.method1988(true);
        class99.method675(false);
        class334.method1986((byte) 114);
        class489.method2921(12176);
        class307.method1831(-127);
        class46.method294((byte) -54);
        class332.method1979((byte) -122);
        class193.method1252(false);
        class529.method3139(-121);
        class475.method2854((byte) 99);
        class56.method320(true);
        class207.method1349(-190);
        class138.method963(1);
        class444.method2636(72);
        class375.method2191((byte) -101);
        class331.method1977(2);
        class219.method1398(28036);
        class385.method2301(-111);
        class327.method1947(6);
        class437.method2577((byte) -88);
        class517.method3067(0);
        class352.method2070(68);
        class394.method2340((byte) 74);
        class228.method1441((byte) -112);
        class27.method184(23);
        class94.method642((byte) 47);
        class360.method2118(true);
        class474.method2839((byte) 44);
        class36.method231(100);
        class502.method3000(82);
        if (arg0 > -85) {
            this.method3040(-92, null);
        }
        class431.method2553(106);
        class30.method207((byte) -80);
        class515.method3063(12481);
        class176.method1143(1);
        class403.method2399(false);
        class411.method2432(111);
        class132.method933(-13322);
        class482.method2890(-66);
        class263.method1645(-5327);
        class366.method2148((byte) 106);
        class143.method998((byte) -81);
        class135.method943(false);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method3044(int arg0) {
        int var1 = class206.field2684;
        int[] var2 = class143.field1892;
        int var3 = class388.field5106 ? var1 : class16.field264 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class395 var5;
            if (var4 < var1) {
                var5 = class76.field952[var2[var4]];
            } else {
                var5 = class527.field7791[class414.field5507[var4 - var1]];
            }
            if (var5.field6220 == arg0) {
                var5.field5169 = 0;
                if (var5.field5218 < 0) {
                    var5.field5184 = false;
                } else {
                    int var6 = var5.method2342(10804);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6239 & 0x7F) != 0 || (var5.field6241 & 0x7F) != 0) {
                            var5.field5184 = false;
                            continue;
                        }
                    } else if ((var5.field6239 & 0x7F) != 64 || (var5.field6241 & 0x7F) != 64) {
                        var5.field5184 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6239 >> 7;
                        int var8 = var5.field6241 >> 7;
                        if (class484.field7043[var7][var8] != var5.field5218) {
                            var5.field5184 = true;
                            continue;
                        }
                        if (class497.field7276[var7][var8] > 1) {
                            var10002 = class497.field7276[var7][var8]--;
                            var5.field5184 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6239 - var9 >> 7;
                        int var11 = var5.field6241 - var9 >> 7;
                        int var12 = var5.field6239 + var9 >> 7;
                        int var13 = var5.field6241 + var9 >> 7;
                        if (!class44.method279((byte) -6, var5.field5218, var13, var12, var10, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class484.field7043[var14][var15] == var5.field5218) {
                                        var10002 = class497.field7276[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5184 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class518 && var5.field5250 != null && class264.field3353 >= var5.field5250.field4524 && class264.field3353 < var5.field5250.field4507) {
                        ((class518) var5).field7658 = false;
                    }
                    var5.field5184 = false;
                    var5.field6224 = class366.method2145(var5.field6220, (byte) 111, var5.field6239, var5.field6241);
                    class363.method2134(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method155(int arg0) {
        field7516++;
        if (arg0 != 9) {
            field7513 = null;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class256.method1599(1024);
        class94.field1312 = new class391(class172.field2221);
        class187.field2441 = new class358();
        if (class246.field3151 != class222.field2867) {
            class258.field3264 = new byte[50][];
        }
        class421.field5647 = new class95(class172.field2221);
        if (class246.field3151 == class222.field2867) {
            class512.field7541 = this.getCodeBase().getHost();
            class25.field440 = 443;
            class440.field6122 = 43594;
        } else if (class183.method1211((byte) -126, class222.field2867)) {
            class512.field7541 = this.getCodeBase().getHost();
            class25.field440 = class196.field2542 + 50000;
            class440.field6122 = class196.field2542 + 40000;
        } else if (class222.field2867 == class114.field1562) {
            class25.field440 = class196.field2542 + 50000;
            class512.field7541 = "127.0.0.1";
            class440.field6122 = class196.field2542 + 40000;
        }
        class385.field5066 = class512.field7541;
        class531.field7821 = class440.field6122;
        class385.field5067 = class25.field440;
        class474.field6929 = class440.field6122;
        class116.field1631 = class474.field6929;
        class204.field2668 = class415.field5533 = class495.field7241 = class340.field4344 = new short[256];
        if (class494.field7234 == class10.field134) {
            class354.field4549 = true;
            class352.field4501 = class311.field4018;
            class343.field4370 = 16777215;
            class133.field1814 = class240.field3102;
            class331.field4252 = class216.field2770;
            class233.field3027 = class351.field4488;
            class344.field4380 = 0;
        } else {
            class352.field4501 = class311.field4019;
            class233.field3027 = class521.field7734;
            class133.field1814 = class215.field2749;
            class331.field4252 = class483.field7040;
        }
        if (class441.field6150 == 3) {
            class375.field4875 = class196.field2542;
        }
        class439.field6113 = class449.method2665(class272.field3454, -5);
        class268.field3397 = class286.method1736((byte) -70, class272.field3454, true);
        class196.field2535 = class72.method410(8926);
        if (class196.field2535 != null) {
            class196.field2535.method227(class272.field3454, false);
        }
        class453.field6341 = class441.field6150;
        try {
            if (class172.field2221.field6148 != null) {
                class4.field35 = new class275(class172.field2221.field6148, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class132.field1788[var3] = new class275(class172.field2221.field6152[var3], 6000, 0);
                }
                class303.field3921 = new class275(class172.field2221.field6154, 6000, 0);
                class242.field3113 = new class374(255, class4.field35, class303.field3921, 500000);
                class459.field6418 = new class275(class172.field2221.field6140, 24, 0);
                class172.field2221.field6152 = null;
                class172.field2221.field6148 = null;
                class172.field2221.field6154 = null;
                class172.field2221.field6140 = null;
            }
        } catch (IOException var4) {
            class242.field3113 = null;
            class303.field3921 = null;
            class4.field35 = null;
            class459.field6418 = null;
        }
        if (class246.field3151 != class222.field2867) {
            class232.field2998 = true;
        }
        class82.field1022 = (class494.field7234 == class276.field3527 ? class338.field4321 : class472.field6896).method1127(class379.field4920, false);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method3045(int arg0) {
        field7507++;
        boolean var2 = class187.field2441.method2104(123);
        if (!var2) {
            this.method3042((byte) 117);
        }
        int var3 = -104 % ((arg0 + 5) / 39);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field7510++;
        try {
            if (arg0.length != 4) {
                class176.method1141(1, "argument count");
            }
            class196.field2542 = Integer.parseInt(arg0[0]);
            class222.field2867 = class114.field1562;
            if (arg0[1].equals("live")) {
                class463.field6568 = class34.field541;
            } else if (arg0[1].equals("rc")) {
                class463.field6568 = class90.field1259;
            } else if (arg0[1].equals("wip")) {
                class463.field6568 = class287.field3664;
            } else {
                class176.method1141(1, "modewhat");
            }
            class379.field4920 = class202.method1323(arg0[2], 0);
            if (class379.field4920 == -1) {
                if (arg0[2].equals("english")) {
                    class379.field4920 = 0;
                } else if (arg0[2].equals("german")) {
                    class379.field4920 = 1;
                } else {
                    class176.method1141(1, "language");
                }
            }
            class352.field4502 = false;
            class251.field3199 = false;
            if (arg0[3].equals("game0")) {
                class494.field7234 = class276.field3527;
            } else if (arg0[3].equals("game1")) {
                class494.field7234 = class10.field134;
            } else {
                class176.method1141(1, "game");
            }
            class204.field2670 = 0;
            class445.field6183 = true;
            class28.field478 = true;
            class326.field4189 = 0;
            class297.field3851 = "";
            class246.field3150 = class494.field7234.field828;
            client var1 = new client();
            class396.field5266 = var1;
            var1.method154(class463.field6568.method319((byte) -107) + 32, class494.field7234.field825, false, 583, 1024, 30, 768, (byte) -124);
            class516.field7590.setLocation(40, 40);
        } catch (Exception var3) {
            class375.method2192((byte) -3, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method3046(int arg0, int arg1) {
        field7515++;
        class467.field6868 = arg1;
        class187.field2441.field4630 = arg0;
        class187.field2441.field4628++;
        class516.field7577 = null;
        class283.field3619 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        if (class374.field4865) {
            class502.method2997((byte) -24);
        }
        field7518++;
        if (class512.field7538 != null) {
            class512.field7538.method878((byte) -122);
        }
        if (class460.field6432 != null) {
            class388.method2315(0, class460.field6432, class172.field2221);
            class460.field6432 = null;
        }
        if (class286.field3643 != null) {
            class286.field3643.method1003(1);
            class286.field3643 = null;
        }
        if (class196.field2535 != null) {
            class196.field2535.method230((byte) 78, class272.field3454);
        }
        class196.field2535 = null;
        class159.method1066(128);
        class187.field2441.method2103(0);
        class94.field1312.method2329(arg0);
        if (class339.field4332 != null) {
            class339.field4332.method2521((byte) 9);
            class339.field4332 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3047() {
        for (int var0 = 0; var0 < class200.field2594; var0++) {
            int[] var1 = class484.field7043[var0];
            for (int var2 = 0; var2 < class118.field1647; var2++) {
                var1[var2] = 0;
            }
        }
    }
}
