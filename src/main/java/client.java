import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class303 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field4194 = null;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4210;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field4211;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
    public static boolean field4212;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1930() {
        class494.field7054 = 0;
        for (int var0 = 0; var0 < class152.field2290; var0++) {
            class84 var1 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var0])).field3885;
            if (var1.field892 && var1.method479(-65) != -1) {
                int var2 = (var1.method482(false) - 1) * 256 + 252;
                int var3 = var1.field644 - var2 >> 9;
                int var4 = var1.field648 - var2 >> 9;
                class52 var5 = class446.method2671((byte) 69, var1.field649, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field931;
                    if (var5 instanceof class84) {
                        var6 += 2048;
                    }
                    if (var5.field952 == 0 && var5.method479(-127) != -1) {
                        class460.field6631[class494.field7054] = var6;
                        class427.field5964[class494.field7054] = var6;
                        class494.field7054++;
                        var5.field952++;
                    }
                    class460.field6631[class494.field7054] = var6;
                    class427.field5964[class494.field7054] = var1.field931 + 2048;
                    class494.field7054++;
                    var5.field952++;
                }
            }
        }
        class720.method4019(class460.field6631, 0, class494.field7054 - 1, 61, class427.field5964);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1931(byte arg0) {
        if (arg0 != 94) {
            field4194 = null;
        }
        field4210++;
        if (class471.field6781.field6684.method1843(arg0 + 27575) != 2) {
            this.method1952(-4);
            return;
        }
        try {
            this.method1952(-4);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class621.method3591(var5.getMessage() + " (Recovered) " + this.method1939(arg0 - 203), var5, (byte) -99);
            class54.method490((byte) -127, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1932(boolean arg0) {
        if (class291.field4082) {
            class217.method1509(121);
        }
        if (arg0) {
            this.method1935(true);
        }
        field4197++;
        class389.method2426(-113);
        if (class359.field5046 != null) {
            class359.field5046.method623(-1);
        }
        if (class330.field4654 != null) {
            class394.method2446(-75, class341.field4796, class330.field4654);
            class330.field4654 = null;
        }
        if (class555.field7776 != null) {
            class555.field7776.method67(-1);
            class555.field7776 = null;
        }
        class530.method3122(true);
        class612.field8856.method3358((byte) 74);
        class262.field3829.method3577(true);
        if (class4.field58 != null) {
            class4.field58.method3394(102);
            class4.field58 = null;
        }
        try {
            class196.field2805.method3017((byte) 4);
            for (int var2 = 0; var2 < 37; var2++) {
                class165.field2441[var2].method3017((byte) 4);
            }
            class749.field10472.method3017((byte) 4);
            class218.field3110.method3017((byte) 4);
            class366.method2275(124);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ldm;)Ldm;")
    public static final class50 method1933(class50 arg0) {
        int var1 = method1943(arg0).method2112(-1);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class545.method3220(65535, arg0.field791);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1934(int arg0) {
        field4205++;
        if (class525.field7463 < class612.field8856.field8209) {
            class67.field1223.method3401(-99);
            class644.field9145 = (class612.field8856.field8209 * 50 - 50) * 5;
            if (class644.field9145 > 3000) {
                class644.field9145 = 3000;
            }
            if (class612.field8856.field8209 >= 2 && class612.field8856.field8207 == 6) {
                this.method1966(0, "js5connect_outofdate");
                class611.field8839 = 14;
                return;
            }
            if (class612.field8856.field8209 >= 4 && class612.field8856.field8207 == -1) {
                this.method1966(0, "js5crc");
                class611.field8839 = 14;
                return;
            }
            if (class612.field8856.field8209 >= 4 && class53.method487(false, class611.field8839)) {
                if (class612.field8856.field8207 == 7 || class612.field8856.field8207 == 9) {
                    this.method1966(arg0, "js5connect_full");
                } else if (class612.field8856.field8207 <= 0) {
                    this.method1966(0, "js5io");
                } else if (class233.field3310 == null) {
                    this.method1966(0, "js5connect");
                } else {
                    this.method1966(0, "js5proxy_" + class233.field3310.trim());
                }
                class611.field8839 = 14;
                return;
            }
        }
        class525.field7463 = class612.field8856.field8209;
        if (class644.field9145 > 0) {
            class644.field9145--;
            return;
        }
        try {
            if (arg0 != 0) {
                this.init();
            }
            if (class308.field4354 == 0) {
                class739.field10385 = class67.field1223.method3402((byte) 110, class341.field4796);
                class308.field4354++;
            }
            if (class308.field4354 == 1) {
                if (class739.field10385.field9091 == 2) {
                    if (class739.field10385.field9093 != null) {
                        class233.field3310 = (String) class739.field10385.field9093;
                    }
                    this.method1953(0, 1000);
                    return;
                }
                if (class739.field10385.field9091 == 1) {
                    class308.field4354++;
                }
            }
            if (class308.field4354 == 2) {
                class490.field6992 = new class76((Socket) class739.field10385.field9093, class341.field4796, 25000);
                class35 var2 = new class35(5);
                var2.method263((byte) 96, class433.field6054.field4035);
                var2.method233(629, arg0 ^ 0xFFFFA586);
                class490.field6992.method765(false, 5, 0, var2.field483);
                class308.field4354++;
                class25.field355 = class742.method4128(1);
            }
            if (class308.field4354 == 3) {
                if (class53.method487(false, class611.field8839) || class490.field6992.method768((byte) 81) > 0) {
                    int var3 = class490.field6992.method767(0);
                    if (var3 != 0) {
                        this.method1953(0, var3);
                        return;
                    }
                    class308.field4354++;
                } else if (class742.method4128(1) - class25.field355 > 30000L) {
                    this.method1953(0, 1001);
                    return;
                }
            }
            if (class308.field4354 == 4) {
                boolean var4 = class53.method487(false, class611.field8839) || class756.method4199(class611.field8839, 0) || class428.method2601(class611.field8839, (byte) -121);
                class259[] var5 = class259.method1765(2371);
                class35 var6 = new class35(var5.length * 4);
                class490.field6992.method761(var6.field483.length, arg0 ^ 0xFFFFFF8E, 0, var6.field483);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1767(var6.method234((byte) -100), arg0 + 100);
                }
                class612.field8856.method3354(class490.field6992, !var4, (byte) 89);
                class490.field6992 = null;
                class308.field4354 = 0;
                class739.field10385 = null;
            }
        } catch (IOException var8) {
            this.method1953(arg0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1935(boolean arg0) {
        field4200++;
        if (!arg0) {
            method1936(54);
        }
        boolean var2 = class612.field8856.method3361(104);
        if (!var2) {
            this.method1934(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method1936(int arg0) {
        int var1 = class206.field2950;
        int[] var2 = class209.field3013;
        for (int var3 = 0; var3 < class152.field2290 + var1; var3++) {
            class52 var4;
            if (var3 < var1) {
                var4 = class165.field2442[var2[var3]];
            } else {
                var4 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var3 - var1])).field3885;
            }
            if (var4.field649 == arg0 && var4.field927 >= 0) {
                int var5 = var4.method482(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field644 & 0x1FF) != 0 || (var4.field648 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field644 & 0x1FF) != 256 || (var4.field648 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field644 >> 9;
                    int var7 = var4.field648 >> 9;
                    if (var4.field927 > class36.field542[var6][var7]) {
                        class36.field542[var6][var7] = var4.field927;
                        class125.field1916[var6][var7] = 1;
                    } else if (class36.field542[var6][var7] == var4.field927) {
                        var10002 = class125.field1916[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field644 - var8 >> 9;
                    int var10 = var4.field648 - var8 >> 9;
                    int var11 = var4.field644 + var8 >> 9;
                    int var12 = var4.field648 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field927 > class36.field542[var13][var14]) {
                                class36.field542[var13][var14] = var4.field927;
                                class125.field1916[var13][var14] = 1;
                            } else if (class36.field542[var13][var14] == var4.field927) {
                                var10002 = class125.field1916[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1937() {
        int var0 = class206.field2950;
        int[] var1 = class209.field3013;
        int var2 = class117.field1848 ? var0 : class152.field2290 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class52 var4;
            if (var3 < var0) {
                var4 = class165.field2442[var1[var3]];
            } else {
                var4 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var3 - var0])).field3885;
            }
            if (var4.field927 >= 0) {
                int var5 = var4.method482(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field644 & 0x1FF) == 0 && (var4.field648 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field644 & 0x1FF) == 256 && (var4.field648 & 0x1FF) == 256) {
                    continue;
                }
                var4.field651 = class534.method3136(1, var4.field649, var4.field644, var4.field648);
                class714.method3977(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1938(int arg0) {
        field4201++;
        method1949(0);
        class722.method4020(false);
        class463.method2812(6779);
        class281.method1837((byte) -66);
        class471.method2855((byte) -70);
        class233.method1594((byte) 52);
        class387.method2420(0);
        class259.method1759(27172);
        class515.method3073(512);
        class306.method1984((byte) 121);
        class224.method1548(90);
        class626.method3619(-81);
        class158.method1201(false);
        class758.method4202(0);
        class303.method1963((byte) 54);
        class474.method2865(0);
        class673.method3808(-7156);
        class280.method1830((byte) 32);
        class58.method543((byte) 117);
        class464.method2814(-29);
        class4.method18((byte) 18);
        class539.method3175(20444);
        class220.method1525(125);
        class76.method759(false);
        class580.method3357(0);
        class142.method1115(124);
        class197.method1383(0);
        class209.method1474(-125);
        class195.method1370(-128);
        class510.method3042(0);
        class169.method1250(113);
        class103.method895(102);
        class388.method2422(27);
        class62.method670((byte) 127);
        class382.method2403(-116);
        class136.method1073(-98);
        class119.method961(64);
        class22.method136(2);
        class440.method2646(false);
        class81.method795(34);
        class508.method3031(50);
        class70.method719(false);
        class497.method2991((byte) 127);
        class121.method966(1745);
        class93.method852(-94);
        class491.method2952(-102);
        class521.method3089((byte) -14);
        class668.method3754((byte) 95);
        class240.method1616((byte) -112);
        class590.method3388(-48);
        class545.method3223(1000);
        class32.method209((byte) 111);
        class377.method2367((byte) -116);
        class272.method1798(-1);
        class633.method3641(-3916);
        class452.method2692(true);
        class465.method2828(14);
        class591.method3395((byte) 63);
        class71.method731(84);
        class166.method1234(115);
        class725.method4035(-4743);
        class752.method4171(4);
        class312.method2019((byte) -103);
        class747.method4156(-89);
        class50.method449(2);
        class349.method2194(false);
        class454.method2779(-13177);
        class496.method2985((byte) -98);
        class35.method250(32767);
        class135.method1067(42);
        class52.method465((byte) 98);
        class416.method2536(-125);
        class559.method3281((byte) 74);
        class226.method1559((byte) -61);
        class332.method2120((byte) -126);
        class548.method3228(false);
        class331.method2113((byte) -57);
        class77.method770(-44);
        class748.method4162(-82);
        class105.method907(-115);
        class337.method2147((byte) -96);
        class740.method4120(-31390);
        class742.method4131((byte) -76);
        class171.method1258((byte) -69);
        class483.method2910((byte) -114);
        class487.method2925(-121);
        class443.method2656(63);
        class143.method1120(-29421);
        class396.method2458(123);
        class283.method1847(-107);
        class120.method962((byte) 101);
        class90.method844((byte) 41);
        class755.method4193((byte) -11);
        class718.method4004(123);
        class154.method1181(87);
        class693.method3897(-3545);
        class678.method3835((byte) -62);
        class729.method4059(6);
        class278.method1824(-1);
        class253.method1727(1);
        class59.method657(-110);
        class42.method381(-95);
        class229.method1577((byte) -66);
        class631.method3631(true);
        class417.method2545((byte) -16);
        class647.method3674(4672);
        class486.method2919((byte) -128);
        class638.method3651((byte) -121);
        class504.method3027(-14536);
        class700.method3932(-7697);
        class322.method2067(127);
        class595.method3490(true);
        class543.method3213((byte) 108);
        class282.method1841((byte) -32);
        class311.method2014(true);
        class581.method3367(384);
        class339.method2156(false);
        class653.method3685(true);
        class44.method410(false);
        class459.method2803(96);
        class404.method2485((byte) 125);
        class533.method3133((byte) -128);
        class68.method712((byte) -96);
        class72.method734(50);
        class701.method3941(-104);
        class484.method2914((byte) -118);
        class411.method2502(true);
        class323.method2073(-122);
        class624.method3609(true);
        class36.method295(21006);
        class643.method3667(27117);
        class43.method398(false);
        class250.method1679(0);
        class41.method369(4584);
        class490.method2948(true);
        class710.method3968(-5408);
        class357.method2225();
        class27.method198((byte) 85);
        class173.method1261(128);
        class566.method3312(-11);
        class167.method1243(0);
        class319.method2053((byte) 26);
        class3.method13(0);
        class493.method2962(1811643552);
        class537.method3143(-1418);
        class248.method1656(21750);
        class561.method3287(0);
        class392.method2442((byte) -42);
        class111.method938((byte) 120);
        class587.method3381((byte) -33);
        class188.method1329(731402113);
        class540.method3179((byte) -41);
        class687.method3861((byte) 33);
        class526.method3116(-7236);
        class345.method2181(69);
        class107.method927((byte) -93);
        class542.method3202();
        class363.method2269(72);
        class409.method2500((byte) 12);
        class422.method2580((byte) -122);
        class399.method2474((byte) 126);
        class24.method148((byte) -126);
        class170.method1255((byte) -80);
        class99.method883(-98);
        class338.method2149((byte) -79);
        class692.method3895((byte) 28);
        class289.method1869(5121);
        class588.method3383((byte) -34);
        class532.method3129(11);
        class397.method2460(65280);
        class498.method2994(2);
        class753.method4186();
        class500.method3009(45);
        class460.method2805(94);
        class656.method3696(85);
        class575.method3338(-113);
        class719.method4013((byte) -97);
        class251.method1708(true);
        int var2 = -58 % ((arg0 + 45) / 39);
        class310.method2010(52);
        class468.method2842(7910);
        class541.method3184(false);
        class524.method3103(-1588);
        class664.method3729();
        class284.method1852(0);
        class98.method877(true);
        class618.method3579(16501);
        class123.method975(-128);
        class604.method3502((byte) -126);
        class745.method4149(1);
        class517.method3077(14);
        class122.method971(125);
        class671.method3791((byte) -88);
        class63.method681((byte) -42);
        class455.method2781(86);
        class535.method3138(true);
        class217.method1510(false);
        class181.method1298((byte) 49);
        class370.method2325();
        class675.method3815((byte) -115);
        class206.method1436(-20846);
        class640.method3658(false);
        class574.method3335();
        class56.method511((byte) -84);
        class199.method1396(true);
        class164.method1219((byte) 2);
        class501.method3013((byte) -127);
        class380.method2380(false);
        class623.method3606(true);
        class5.method24();
        class560.method3284((byte) 105);
        class702.method3945(0);
        class586.method3380((byte) 120);
        class569.method3323(0);
        class406.method2491((byte) -69);
        class8.method46(4104);
        class662.method3723(0);
        class318.method2045(5);
        class720.method4017(1804438800);
        class513.method3065(71);
        class301.method1961(-2);
        class320.method2061((byte) 61);
        class688.method3868((byte) 118);
        class317.method2042(74);
        class705.method3953(14742);
        class567.method3320(85);
        class494.method2978(81);
        class196.method1374(-1229686568);
        class375.method2357(64);
        class351.method2206(83);
        class563.method3291(31592);
        class146.method1136(3);
        class130.method998(false);
        class139.method1104(-1);
        class423.method2583(true);
        class288.method1867((byte) 124);
        class46.method420((byte) 107);
        class676.method3827(false);
        class391.method2439(0);
        class314.method2029(24179);
        class694.method3898(-22760);
        class138.method1099((byte) -128);
        class73.method736(128);
        class372.method2335((byte) -123);
        class115.method945((byte) -48);
        class125.method982(-28);
        class218.method1516(16383);
        class527.method3119(60);
        class187.method1324(-1);
        class344.method2176(true);
        class208.method1448((byte) -104);
        class86.method816(-19292);
        class221.method1543(88);
        class386.method2412(100);
        class677.method3834(-80);
        class402.method2482(-121);
        class525.method3113((byte) -16);
        class267.method1789(-71);
        class434.method2623(-17157);
        class519.method3082((byte) 86);
        class706.method3960(true);
        class577.method3345(14);
        class562.method3288(-28309);
        class109.method931(11416);
        class162.method1215((byte) 18);
        class512.method3061(20);
        class175.method1276((byte) 77);
        class546.method3224((byte) 77);
        class430.method2614(-2129252376);
        class205.method1431(9800);
        class330.method2106(29);
        class433.method2622(127);
        class646.method3672(1);
        class644.method3669((byte) -111);
        class126.method983(false);
        class610.method3519(11455);
        class202.method1411(2);
        class174.method1266(8);
        class683.method3849(-1);
        class145.method1130();
        class684.method3855(256);
        class118.method953((byte) -60);
        class247.method1651(13196);
        class26.method193(-28893);
        class160.method1209(false);
        class313.method2025((byte) -109);
        class249.method1661(65535);
        class485.method2916((byte) -31);
        class601.method3493(-25010);
        class598.method3492(-14);
        class620.method3587(-87);
        class528.method3121((byte) -42);
        class657.method3705((byte) 45);
        class442.method2655(true);
        class368.method2307(85);
        class223.method1545(118);
        class106.method911();
        class307.method1994(1048575);
        class157.method1191(1);
        class627.method3622();
        class75.method755();
        class584.method3376((byte) 118);
        class353.method2213(0);
        class648.method3676();
        class564.method3292(-107);
        class444.method2659(true);
        class478.method2874((byte) 124);
        class667.method3747((byte) -62);
        class514.method3068((byte) -123);
        class54.method495((byte) 73);
        class685.method3856(4);
        class462.method2806(1);
        class274.method1802(0);
        class457.method2789((byte) -98);
        class245.method1629((byte) 86);
        class583.method3371(-122);
        class649.method3677((byte) -98);
        class183.method1311(-58);
        class256.method1741(-123);
        class400.method2476(1);
        class412.method2506(15142);
        class153.method1170((byte) 6);
        class558.method3278(-1);
        class609.method3517(true);
        class134.method1065((byte) -82);
        class207.method1444();
        class246.method1644((byte) -84);
        class242.method1623(85);
        class436.method2633(-118);
        class232.method1585((byte) -126);
        class131.method999((byte) 118);
        class467.method2837((byte) 17);
        class689.method3871(13);
        class389.method2425(false);
        class369.method2311(-17025);
        class421.method2577(0);
        class212.method1487(0);
        class2.method7(-3);
        class13.method70(13);
        class265.method1786((byte) 106);
        class708.method3961(16711680);
        class711.method3974(-1);
        class582.method3369(83);
        class20.method125(0);
        class102.method893(-120);
        class299.method1929(0);
        class594.method3468(260);
        class285.method1861(21600);
        class556.method3260(0);
        class428.method2602(-19863);
        class415.method2531(364532460);
        class724.method4025(7640);
        class292.method1879(-3362);
        class15.method94((byte) 6);
        class419.method2562((byte) 76);
        class87.method825(-7016);
        class159.method1206((byte) -109);
        class189.method1331(102);
        class379.method2377((byte) -115);
        class427.method2595(1);
        class453.method2703(-13389);
        class674.method3812(-9);
        class438.method2635((byte) -113);
        class34.method221(-22805);
        class25.method165(102);
        class628.method3625(8);
        class254.method1733((byte) 13);
        class361.method2249(true);
        class373.method2352(-13);
        class715.method3981(false);
        class750.method4170(-26007);
        class505.method3030(0);
        class342.method2168(-21026);
        class203.method1418(126);
        class557.method3268(-125);
        class82.method798((byte) -119);
        class405.method2487(-26230);
        class328.method2094(20);
        class445.method2662((byte) -94);
        class132.method1037((byte) 49);
        class659.method3708();
        class78.method778(-97);
        class495.method2979(0);
        class592.method3397(false);
        class193.method1353(116);
        class165.method1227(-122);
        class425.method2590(2);
        class736.method4109(-4415);
        class334.method2135(true);
        class395.method2454(-117);
        class92.method849(15731);
        class140.method1105(5);
        class329.method2101(0);
        class612.method3523(-15157);
        class252.method1713((byte) -88);
        class128.method992((byte) 89);
        class190.method1335(false);
        class697.method3915(false);
        class739.method4115(-31606);
        class735.method4106((byte) -113);
        class714.method3979((byte) 43);
        class522.method3095(95);
        class359.method2240(true);
        class611.method3521((byte) -103);
        class19.method118(87);
        class576.method3344((byte) -106);
        class352.method2209(125);
        class407.method2496(false);
        class49.method437((byte) 118);
        class473.method2863();
        class741.method4126(true);
        class756.method4200((byte) -122);
        class385.method2410(109);
        class7.method36((byte) -90);
        class57.method518(1);
        class681.method3847(-2);
        class94.method859((byte) 105);
        class315.method2033((byte) -124);
        class182.method1305(127);
        class744.method4146(true);
        class184.method1317((byte) -82);
        class64.method683((byte) 103);
        class67.method703(-2);
        class79.method785((byte) 127);
        class429.method2605(true);
        class211.method1485(20);
        class89.method835((byte) -109);
        class615.method3534((byte) -109);
        class390.method2435(0);
        class23.method137((byte) -98);
        class28.method203(127);
        class178.method1285(21590);
        class666.method3739(-13);
        class749.method4166((byte) -100);
        class516.method3074((byte) -128);
        class341.method2159(0);
        class348.method2185((byte) 72);
        class686.method3860(0);
        class219.method1519(false);
        class394.method2449(-96);
        class554.method3245(8448);
        class698.method3922((byte) 55);
        class476.method2869((byte) 99);
        class60.method667(true);
        class634.method3648(true);
        class180.method1292(6482);
        class336.method2144((byte) -120);
        class607.method3511(102);
        class104.method905((byte) -79);
        class621.method3589((byte) 126);
        class579.method3349(true);
        class204.method1424(-99);
        class613.method3529((byte) 118);
        class186.method1320((byte) -124);
        class37.method302((byte) -66);
        class291.method1873(1);
        class40.method363((byte) -43);
        class231.method1584(-24973);
        class502.method3014((byte) 118);
        class723.method4022(true);
        class228.method1569(false);
        class603.method3498(-302343604);
        class489.method2944((byte) -112);
        class47.method431(-115);
        class696.method3906(-560294160);
        class321.method2064(21755);
        class754.method4189(-18546);
        class262.method1775(-61);
        class237.method1606((byte) -26);
        class555.method3247((byte) -13);
        class65.method692(-19636);
        class531.method3125(86);
        class446.method2663(false);
        class530.method3123(68);
        class117.method951(118);
        class630.method3628(32250);
        class168.method1245((byte) -60);
        class10.method54((byte) -111);
        class376.method2360(-108);
        class260.method1770(-1);
        class239.method1610(127);
        class717.method4003(42);
        class641.method3661((byte) -119);
        class14.method78(true);
        class152.method1169(false);
        class726.method4039(true);
        class679.method3838((byte) 125);
        class709.method3963(70);
        class236.method1604((byte) 28);
        class435.method2627(false);
        class127.method985(-1);
        class213.method1490(4);
        class201.method1409((byte) -109);
        class371.method2327(9595);
        class241.method1619(-1);
        class66.method695((byte) 83);
        class18.method113(13);
        class309.method2009(8);
        class148.method1145(27663);
        class327.method2087(0);
        class21.method126(-24264);
        class651.method3680((byte) -30);
        class544.method3219(15660);
        class571.method3330((byte) 42);
        class200.method1407(69);
        class432.method2618(-105);
        class305.method1977((byte) -108);
        class6.method34(-1);
        class360.method2245(115);
        class523.method3102(-1);
        class150.method1159((byte) 113);
        class264.method1781(97);
        class680.method3841(17813);
        class316.method2036(-24583);
        class261.method1773(124);
        class458.method2793((byte) -49);
        class155.method1183(true);
        class1.method1(-1);
        class456.method2786(12668);
        class343.method2173(16);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/lang/String;")
    public final String method1939(int arg0) {
        field4198++;
        String var2 = null;
        try {
            var2 = "[1)" + class115.field1845 + "," + class64.field1160 + "," + class174.field2540 + "," + class716.field9999 + "|";
            if (class468.field6748 != null) {
                var2 = var2 + "2)" + class312.field4409 + "," + (class468.field6748.field991[0] + class115.field1845) + "," + (class468.field6748.field995[0] + class64.field1160) + "|";
            }
            var2 = var2 + "3)" + class471.field6781.field6684.method1843(27669) + "|4)" + class471.field6781.field6675.method2961(27669) + "|5)" + class190.method1336((byte) -106) + "|6)" + class206.field2956 + "," + class363.field5105 + "|";
            var2 = var2 + "7)" + class471.field6781.field6688.method3933(27669) + "|";
            var2 = var2 + "8)" + class471.field6781.field6689.method56(27669) + "|";
            var2 = var2 + "9)" + class471.field6781.field6714.method3368(27669) + "|";
            var2 = var2 + "10)" + class471.field6781.field6696.method3214(27669) + "|";
            var2 = var2 + "11)" + class471.field6781.field6676.method1572(27669) + "|";
            var2 = var2 + "12)" + class471.field6781.field6704.method2015(27669) + "|";
            if (arg0 >= -93) {
                field4194 = null;
            }
            var2 = var2 + "13)" + class438.field6123 + "|";
            var2 = var2 + "14)" + class611.field8839;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class471.field6781.field6684.method1843(27669) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4211 == null ? (field4211 = method1956("client")) : field4211).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method1940(int arg0) {
        int var1 = class206.field2950;
        int[] var2 = class209.field3013;
        int var3 = class117.field1848 ? var1 : class152.field2290 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class52 var5;
            if (var4 < var1) {
                var5 = class165.field2442[var2[var4]];
            } else {
                var5 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var4 - var1])).field3885;
            }
            if (var5.field649 == arg0) {
                var5.field952 = 0;
                if (var5.field927 < 0) {
                    var5.field892 = false;
                } else {
                    int var6 = var5.method482(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field644 & 0x1FF) != 0 || (var5.field648 & 0x1FF) != 0) {
                            var5.field892 = false;
                            continue;
                        }
                    } else if ((var5.field644 & 0x1FF) != 256 || (var5.field648 & 0x1FF) != 256) {
                        var5.field892 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field644 >> 9;
                        int var8 = var5.field648 >> 9;
                        if (class36.field542[var7][var8] != var5.field927) {
                            var5.field892 = true;
                            continue;
                        }
                        if (class125.field1916[var7][var8] > 1) {
                            var10002 = class125.field1916[var7][var8]--;
                            var5.field892 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field644 - var9 >> 9;
                        int var11 = var5.field648 - var9 >> 9;
                        int var12 = var5.field644 + var9 >> 9;
                        int var13 = var5.field648 + var9 >> 9;
                        if (!class78.method776((byte) -100, var11, var10, var12, var13, var5.field927)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class36.field542[var14][var15] == var5.field927) {
                                        var10002 = class125.field1916[var14][var15]--;
                                    }
                                }
                            }
                            var5.field892 = true;
                            continue;
                        }
                    }
                    var5.field892 = false;
                    var5.field651 = class534.method3136(1, var5.field649, var5.field644, var5.field648);
                    class714.method3977(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1941(int arg0) {
        field4203++;
        if (class471.field6781.field6684.method1843(27669) == 2) {
            try {
                this.method1950(13);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class621.method3591(var5.getMessage() + " (Recovered) " + this.method1939(-112), var5, (byte) -128);
                class54.method490((byte) 127, false, 0);
            }
        } else {
            this.method1950(13);
        }
        if (arg0 > -86) {
            field4194 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4193++;
        try {
            if (arg0.length != 6) {
                class334.method2136(false, "Argument count");
            }
            class430.field6021 = new class593();
            class430.field6021.field8324 = Integer.parseInt(arg0[0]);
            class232.field3298 = new class593();
            class232.field3298.field8324 = Integer.parseInt(arg0[1]);
            class193.field2782 = new class593();
            class193.field2782.field8324 = Integer.parseInt(arg0[2]);
            class118.field1857 = class611.field8843;
            if (arg0[3].equals("live")) {
                class468.field6752 = class560.field7956;
            } else if (arg0[3].equals("rc")) {
                class468.field6752 = class7.field115;
            } else if (arg0[3].equals("wip")) {
                class468.field6752 = class22.field283;
            } else {
                class334.method2136(false, "modewhat");
            }
            class744.field10426 = class391.method2437(arg0[4], (byte) -66);
            if (class744.field10426 == -1) {
                if (arg0[4].equals("english")) {
                    class744.field10426 = 0;
                } else if (arg0[4].equals("german")) {
                    class744.field10426 = 1;
                } else {
                    class334.method2136(false, "language");
                }
            }
            class255.field3698 = false;
            class561.field7961 = false;
            if (arg0[5].equals("game0")) {
                class649.field9170 = class87.field1576;
            } else if (arg0[5].equals("game1")) {
                class649.field9170 = class696.field9784;
            } else if (arg0[5].equals("game2")) {
                class649.field9170 = class476.field6808;
            } else if (arg0[5].equals("game3")) {
                class649.field9170 = class474.field6794;
            } else {
                class334.method2136(false, "game");
            }
            class417.field5856 = 0;
            class606.field8795 = false;
            class617.field8925 = true;
            class406.field5652 = true;
            class709.field9913 = false;
            class229.field3268 = 0L;
            class443.field6167 = null;
            class205.field2942 = null;
            class66.field1197 = 0;
            class611.field8844 = "";
            class138.field2154 = 0;
            class54.field1035 = class649.field9170.field2572;
            client var1 = new client();
            class345.field4858 = var1;
            var1.method1968(37, 629, class468.field6752.method2866((byte) 123) + 32, 1024, false, 768, 29553, class649.field9170.field2573);
            class754.field10504.setLocation(40, 40);
        } catch (Exception var3) {
            class621.method3591(null, var3, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1942() {
        int var0 = class206.field2950;
        int[] var1 = class209.field3013;
        int var2 = class471.field6781.field6693.method1792(27669);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class349 var14 = class165.field2442[var1[var4]];
            if (!var14.method2191((byte) -121)) {
                var14.field927 = -1;
            } else if (var14.field4929) {
                var14.field927 = -1;
            } else {
                var14.method476(117);
                if (var14.field1814 >= 0 && var14.field1820 >= 0 && var14.field1818 < class174.field2540 && var14.field1810 < class716.field9999) {
                    var14.field4924 = var14.field886 ? var3 : false;
                    if (class468.field6748 == var14) {
                        var14.field927 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field892) {
                            var15++;
                        }
                        if (var14.field954 > class605.field8787) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method482(false) << 2);
                        if (var14.field4926) {
                            var16 += 512;
                        } else {
                            if (class426.field5958 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field927 = var16 + 1;
                    }
                } else {
                    var14.field927 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class152.field2290; var5++) {
            class84 var11 = ((class272) class758.field10539.method4203(true, (long) class323.field4590[var5])).field3885;
            if (var11.method804((byte) -126) && var11.field1523.method2939(true, class742.field10408)) {
                var11.method476(120);
                if (var11.field1814 >= 0 && var11.field1820 >= 0 && var11.field1818 < class174.field2540 && var11.field1810 < class716.field9999) {
                    int var12 = 0;
                    if (!var11.field892) {
                        var12++;
                    }
                    if (var11.field954 > class605.field8787) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method482(false) << 2);
                    if (class426.field5958 == 0) {
                        if (var11.field1523.field6958) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class426.field5958 == 1) {
                        if (var11.field1523.field6958) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field1523.field6965) {
                        var13 += 1024;
                    } else if (!var11.field1523.field6977) {
                        var13 += 256;
                    }
                    var11.field927 = var13 + 1;
                } else {
                    var11.field927 = -1;
                }
            } else {
                var11.field927 = -1;
            }
        }
        for (int var6 = 0; var6 < class220.field3146.length; var6++) {
            class340 var7 = class220.field3146[var6];
            if (var7 != null) {
                if (var7.field4782 == 1) {
                    class272 var8 = (class272) class758.field10539.method4203(true, (long) var7.field4789);
                    if (var8 != null) {
                        class84 var9 = var8.field3885;
                        if (var9.field927 >= 0) {
                            var9.field927 += 2048;
                        }
                    }
                } else if (var7.field4782 == 10) {
                    class349 var10 = class165.field2442[var7.field4789];
                    if (var10 != null && class468.field6748 != var10 && var10.field927 >= 0) {
                        var10.field927 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ldm;)Lpba;")
    public static final class331 method1943(class50 arg0) {
        class331 var1 = (class331) class563.field7972.method4203(true, ((long) arg0.field792 << 32) + (long) arg0.field807);
        return var1 == null ? arg0.field871 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1944() {
        for (int var0 = 0; var0 < class174.field2540; var0++) {
            int[] var1 = class36.field542[var0];
            for (int var2 = 0; var2 < class716.field9999; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final synchronized void method1945(byte arg0) {
        field4207++;
        if (class476.field6812 != null && class567.field8085 == null && !class341.field4796.field5130) {
            try {
                Class var2 = class476.field6812.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class567.field8085 = (Canvas) var3.get(class476.field6812);
                var3.set(class476.field6812, null);
                if (class567.field8085 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1945(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
    public static final int method1946(int arg0, int arg1) {
        if (arg0 != -13926) {
            field4194 = null;
        }
        field4195++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ldm;IIIIIIIIIII)V")
    public static final void method1947(class50[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class50 var13 = arg0[var12];
            if (var13 != null && var13.field791 == arg1) {
                int var14 = var13.field719 + arg6;
                int var15 = var13.field856 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field765 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field783 + var14;
                    int var21 = var13.field830 + var15;
                    if (var13.field765 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field765 == 0 || var13.field715 || method1943(var13).field4679 != 0 || class148.field2266 == var13 || class349.field4934 == var13.field740 || class619.field8936 == var13.field740) {
                    if (!method1948(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class200.field2876) {
                            var22 = class228.method1570((byte) 73);
                            var23 = class252.method1712((byte) 37);
                        }
                        if (class755.field10512 == var13 && class571.method3332((byte) -29, class755.field10512) != null) {
                            class394.field5523 = true;
                            class704.field9862 = var14;
                            class178.field2561 = var15;
                        }
                        if (var13.field777 || var16 < var18 && var17 < var19) {
                            if (var13.field800 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class604 var24 = (class604) class35.field474.method1522(true); var24 != null; var24 = (class604) class35.field474.method1527((byte) 85)) {
                                    if (var24.field8770) {
                                        var24.method3617(1);
                                        var24.field8782.field850 = false;
                                    }
                                }
                                if (class593.field8316 == 0) {
                                    class755.field10512 = null;
                                    class148.field2266 = null;
                                }
                                class513.field7316 = 0;
                                class668.field9365 = false;
                                class26.field376 = false;
                                if (!class34.field450) {
                                    class500.method3006(-26940);
                                }
                            }
                            boolean var25;
                            if (class422.field5917.method1597(121) + var22 >= var16 && class422.field5917.method1592(true) + var23 >= var17 && class422.field5917.method1597(116) + var22 < var18 && class422.field5917.method1592(true) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class737.field10375 && var25) {
                                if (var13.field841 >= 0) {
                                    class458.field6611 = var13.field841;
                                } else if (var13.field800) {
                                    class458.field6611 = -1;
                                }
                            }
                            if (!class34.field450 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class402.method2481(arg11 - var15, arg10 - var14, var13, true);
                            }
                            boolean var26 = false;
                            if (class422.field5917.method1589(8) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class709 var28 = (class709) class119.field1862.method1522(true);
                            if (var28 != null && var28.method2003(-4) == 0 && var28.method2007(-24956) + var22 >= var16 && var28.method2002((byte) -87) + var23 >= var17 && var28.method2007(-24956) + var22 < var18 && var28.method2002((byte) -105) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field848 != null && !class32.method211((byte) -61)) {
                                for (int var29 = 0; var29 < var13.field848.length; var29++) {
                                    if (class167.field2461.method1540(127, var13.field848[var29])) {
                                        if (var13.field716 == null || class605.field8787 >= var13.field716[var29]) {
                                            byte var30 = var13.field774[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class167.field2461.method1540(127, 86) && !class167.field2461.method1540(118, 82) && !class167.field2461.method1540(120, 81)) && ((var30 & 0x2) == 0 || class167.field2461.method1540(120, 86)) && ((var30 & 0x1) == 0 || class167.field2461.method1540(118, 82)) && ((var30 & 0x4) == 0 || class167.field2461.method1540(126, 81))) {
                                                if (var29 < 10) {
                                                    class23.method140(-1, -123, var29 + 1, "", var13.field792);
                                                } else if (var29 == 10) {
                                                    class249.method1662((byte) 122);
                                                    class331 var31 = method1943(var13);
                                                    class438.method2634(64, var31.method2118(true), var31.field4675, var13);
                                                    class322.field4580 = class317.method2041(91, var13);
                                                    if (class322.field4580 == null) {
                                                        class322.field4580 = "Null";
                                                    }
                                                    class623.field8966 = var13.field831 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field766[var29];
                                                if (var13.field716 == null) {
                                                    var13.field716 = new int[var13.field848.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field716[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field716[var29] = class605.field8787 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field716 != null) {
                                        var13.field716[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class62.method677(var13, false, var22 + var28.method2007(-24956) - var14, var23 + var28.method2002((byte) -107) - var15);
                            }
                            if (class755.field10512 != null && class755.field10512 != var13 && var25 && method1943(var13).method2115(1973135573)) {
                                class755.field10515 = var13;
                            }
                            if (class148.field2266 == var13) {
                                class34.field454 = true;
                                class113.field1808 = var14;
                                class274.field3907 = var15;
                            }
                            if (var13.field715 || var13.field740 != 0) {
                                if (var25 && class668.field9367 != 0 && var13.field860 != null) {
                                    class604 var33 = new class604();
                                    var33.field8770 = true;
                                    var33.field8782 = var13;
                                    var33.field8778 = class668.field9367;
                                    var33.field8773 = var13.field860;
                                    class35.field474.method1526(var33, 123);
                                }
                                if (class755.field10512 != null || class34.field450 || class528.field7506 != var13.field740 && class513.field7316 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field740 != 0) {
                                    if (class492.field7007 == var13.field740 || class407.field5674 == var13.field740) {
                                        class532.field7535 = var13;
                                        if (class576.field8161 != null) {
                                            class576.field8161.method2023(var13.field830, class359.field5046, 0);
                                        }
                                        if (class492.field7007 == var13.field740) {
                                            if (class34.field450 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class144.method1125(arg9, -26189, arg8, class359.field5046);
                                            class296 var34 = (class296) class684.field9653.method4159(0);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field4130 && arg10 < var34.field4128 && arg11 >= var34.field4131 && arg11 < var34.field4127) {
                                                    class500.method3006(-26940);
                                                    class153.method1177(-114, var34.field4129);
                                                }
                                                var34 = (class296) class684.field9653.method4151(7);
                                            }
                                        }
                                    }
                                    if (class349.field4934 == var13.field740) {
                                        if (var13.method445((byte) -76, class359.field5046) == null || class255.field3697 != 0 && class255.field3697 != 3 || class34.field450 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field827[var36];
                                        if (var35 < var37 || var35 > var13.field778[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field783 / 2;
                                        int var39 = var36 - var13.field830 / 2;
                                        int var40;
                                        if (class666.field9338 == 4) {
                                            var40 = (int) class321.field4568 & 0x3FFF;
                                        } else {
                                            var40 = (int) class321.field4568 + class440.field6138 & 0x3FFF;
                                        }
                                        int var41 = class316.field4487[var40];
                                        int var42 = class316.field4490[var40];
                                        if (class666.field9338 != 4) {
                                            var41 = (class113.field1812 + 256) * var41 >> 8;
                                            var42 = (class113.field1812 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class666.field9338 == 4) {
                                            var45 = (class218.field3100 >> 9) + (var43 >> 2);
                                            var46 = (class211.field3044 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class468.field6748.method482(false) - 1) * 256;
                                            var45 = (class468.field6748.field644 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class468.field6748.field648 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class737.field10375 && (class464.field6709 & 0x40) != 0) {
                                            class50 var48 = class434.method2624(class31.field415, class40.field590, (byte) -85);
                                            if (var48 == null) {
                                                class249.method1662((byte) 122);
                                            } else {
                                                class673.method3807((long) (var13.field807 << 0 | var13.field792), " ->", var45, (byte) -33, 1L, true, class322.field4580, 21, true, var46, false, class23.field299, var13.field861);
                                            }
                                            continue;
                                        }
                                        if (class696.field9784 == class649.field9170) {
                                            class673.method3807(0L, "", var45, (byte) -74, 1L, true, class281.field3968.method1839((byte) 45, class744.field10426), 19, true, var46, false, -1, -1);
                                        }
                                        class673.method3807(0L, "", var45, (byte) -110, 1L, true, class681.field9591, 16, true, var46, false, class493.field7014, -1);
                                        continue;
                                    }
                                    if (class528.field7506 == var13.field740) {
                                        class512.field7312 = var13;
                                        if (var25) {
                                            class668.field9365 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method2007(-24956) - var14 - var13.field783 / 2) * 2.0D / (double) class542.field7623);
                                            int var50 = (int) (-((double) (var23 + var28.method2002((byte) -91) - var15 - var13.field830 / 2) * 2.0D / (double) class542.field7623));
                                            int var51 = class587.field8271 + var49 + class542.field7632;
                                            int var52 = class590.field8288 + var50 + class542.field7644;
                                            class725 var53 = class79.method780((byte) -110);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method4036(var52, -119, var54, var51);
                                            if (var54 != null) {
                                                if (class167.field2461.method1540(121, 82) && class79.field1485 > 0) {
                                                    class698.method3921(var54[1], var54[0], var54[2], (byte) -126);
                                                    continue;
                                                }
                                                class26.field376 = true;
                                                class462.field6659 = var54[0];
                                                class741.field10397 = var54[1];
                                                class548.field7719 = var54[2];
                                            }
                                            class513.field7316 = 1;
                                            class314.field4436 = false;
                                            class404.field5633 = class422.field5917.method1597(124);
                                            class128.field1933 = class422.field5917.method1592(true);
                                            continue;
                                        }
                                        if (var26 && class513.field7316 > 0) {
                                            if (class513.field7316 == 1 && (class404.field5633 != class422.field5917.method1597(125) || class128.field1933 != class422.field5917.method1592(true))) {
                                                class668.field9379 = class587.field8271;
                                                class385.field5382 = class590.field8288;
                                                class513.field7316 = 2;
                                            }
                                            if (class513.field7316 == 2) {
                                                class314.field4436 = true;
                                                class307.method1997(class668.field9379 + (int) ((double) (class404.field5633 - class422.field5917.method1597(111)) * 2.0D / (double) class542.field7628), true);
                                                class711.method3971(class385.field5382 - (int) ((double) (class128.field1933 - class422.field5917.method1592(true)) * 2.0D / (double) class542.field7628), 124);
                                            }
                                            continue;
                                        }
                                        if (class513.field7316 > 0 && !class314.field4436) {
                                            if ((class552.field7737 == 1 || class98.method878((byte) 123)) && class409.field5682 > 2) {
                                                class256.method1740((byte) 84, class128.field1933, class404.field5633);
                                            } else if (class547.method3227(-126)) {
                                                class256.method1740((byte) 84, class128.field1933, class404.field5633);
                                            }
                                        }
                                        class513.field7316 = 0;
                                        continue;
                                    }
                                    if (class179.field2577 == var13.field740) {
                                        if (var26) {
                                            class391.method2438(-1, var22 + class422.field5917.method1597(116) - var14, var13.field783, var23 + class422.field5917.method1592(true) - var15, var13.field830);
                                        }
                                        continue;
                                    }
                                    if (class619.field8936 == var13.field740) {
                                        class181.method1301(var15, true, var13, var14);
                                        continue;
                                    }
                                }
                                if (!var13.field763 && var27) {
                                    var13.field763 = true;
                                    if (var13.field842 != null) {
                                        class604 var55 = new class604();
                                        var55.field8770 = true;
                                        var55.field8782 = var13;
                                        var55.field8772 = var22 + var28.method2007(-24956) - var14;
                                        var55.field8778 = var23 + var28.method2002((byte) -97) - var15;
                                        var55.field8773 = var13.field842;
                                        class35.field474.method1526(var55, -94);
                                    }
                                }
                                if (var13.field763 && var26 && var13.field713 != null) {
                                    class604 var56 = new class604();
                                    var56.field8770 = true;
                                    var56.field8782 = var13;
                                    var56.field8772 = var22 + class422.field5917.method1597(112) - var14;
                                    var56.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                    var56.field8773 = var13.field713;
                                    class35.field474.method1526(var56, -55);
                                }
                                if (var13.field763 && !var26) {
                                    var13.field763 = false;
                                    if (var13.field828 != null) {
                                        class604 var57 = new class604();
                                        var57.field8770 = true;
                                        var57.field8782 = var13;
                                        var57.field8772 = var22 + class422.field5917.method1597(113) - var14;
                                        var57.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                        var57.field8773 = var13.field828;
                                        class62.field1134.method1526(var57, -97);
                                    }
                                }
                                if (var26 && var13.field739 != null) {
                                    class604 var58 = new class604();
                                    var58.field8770 = true;
                                    var58.field8782 = var13;
                                    var58.field8772 = var22 + class422.field5917.method1597(121) - var14;
                                    var58.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                    var58.field8773 = var13.field739;
                                    class35.field474.method1526(var58, 119);
                                }
                                if (!var13.field850 && var25) {
                                    var13.field850 = true;
                                    if (var13.field726 != null) {
                                        class604 var59 = new class604();
                                        var59.field8770 = true;
                                        var59.field8782 = var13;
                                        var59.field8772 = var22 + class422.field5917.method1597(124) - var14;
                                        var59.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                        var59.field8773 = var13.field726;
                                        class35.field474.method1526(var59, 91);
                                    }
                                }
                                if (var13.field850 && var25 && var13.field849 != null) {
                                    class604 var60 = new class604();
                                    var60.field8770 = true;
                                    var60.field8782 = var13;
                                    var60.field8772 = var22 + class422.field5917.method1597(122) - var14;
                                    var60.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                    var60.field8773 = var13.field849;
                                    class35.field474.method1526(var60, -29);
                                }
                                if (var13.field850 && !var25) {
                                    var13.field850 = false;
                                    if (var13.field843 != null) {
                                        class604 var61 = new class604();
                                        var61.field8770 = true;
                                        var61.field8782 = var13;
                                        var61.field8772 = var22 + class422.field5917.method1597(112) - var14;
                                        var61.field8778 = var23 + class422.field5917.method1592(true) - var15;
                                        var61.field8773 = var13.field843;
                                        class62.field1134.method1526(var61, 110);
                                    }
                                }
                                if (var13.field785 != null) {
                                    class604 var62 = new class604();
                                    var62.field8782 = var13;
                                    var62.field8773 = var13.field785;
                                    class321.field4556.method1526(var62, 117);
                                }
                                if (var13.field817 != null && class206.field2946 > var13.field705) {
                                    if (var13.field858 == null || class206.field2946 - var13.field705 > 32) {
                                        class604 var67 = new class604();
                                        var67.field8782 = var13;
                                        var67.field8773 = var13.field817;
                                        class35.field474.method1526(var67, 79);
                                    } else {
                                        label699: for (int var63 = var13.field705; var63 < class206.field2946; var63++) {
                                            int var64 = class87.field1580[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field858.length; var65++) {
                                                if (var13.field858[var65] == var64) {
                                                    class604 var66 = new class604();
                                                    var66.field8782 = var13;
                                                    var66.field8773 = var13.field817;
                                                    class35.field474.method1526(var66, 86);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field705 = class206.field2946;
                                }
                                if (var13.field857 != null && class605.field8790 > var13.field738) {
                                    if (var13.field810 == null || class605.field8790 - var13.field738 > 32) {
                                        class604 var72 = new class604();
                                        var72.field8782 = var13;
                                        var72.field8773 = var13.field857;
                                        class35.field474.method1526(var72, 78);
                                    } else {
                                        label675: for (int var68 = var13.field738; var68 < class605.field8790; var68++) {
                                            int var69 = class27.field384[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field810.length; var70++) {
                                                if (var13.field810[var70] == var69) {
                                                    class604 var71 = new class604();
                                                    var71.field8782 = var13;
                                                    var71.field8773 = var13.field857;
                                                    class35.field474.method1526(var71, -84);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field738 = class605.field8790;
                                }
                                if (var13.field773 != null && class711.field9940 > var13.field707) {
                                    if (var13.field775 == null || class711.field9940 - var13.field707 > 32) {
                                        class604 var77 = new class604();
                                        var77.field8782 = var13;
                                        var77.field8773 = var13.field773;
                                        class35.field474.method1526(var77, 83);
                                    } else {
                                        label651: for (int var73 = var13.field707; var73 < class711.field9940; var73++) {
                                            int var74 = class338.field4768[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field775.length; var75++) {
                                                if (var13.field775[var75] == var74) {
                                                    class604 var76 = new class604();
                                                    var76.field8782 = var13;
                                                    var76.field8773 = var13.field773;
                                                    class35.field474.method1526(var76, 103);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field707 = class711.field9940;
                                }
                                if (var13.field767 != null && class390.field5451 > var13.field811) {
                                    if (var13.field734 == null || class390.field5451 - var13.field811 > 32) {
                                        class604 var82 = new class604();
                                        var82.field8782 = var13;
                                        var82.field8773 = var13.field767;
                                        class35.field474.method1526(var82, 111);
                                    } else {
                                        label627: for (int var78 = var13.field811; var78 < class390.field5451; var78++) {
                                            int var79 = class99.field1680[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field734.length; var80++) {
                                                if (var13.field734[var80] == var79) {
                                                    class604 var81 = new class604();
                                                    var81.field8782 = var13;
                                                    var81.field8773 = var13.field767;
                                                    class35.field474.method1526(var81, -48);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field811 = class390.field5451;
                                }
                                if (var13.field708 != null && class150.field2272 > var13.field872) {
                                    if (var13.field757 == null || class150.field2272 - var13.field872 > 32) {
                                        class604 var87 = new class604();
                                        var87.field8782 = var13;
                                        var87.field8773 = var13.field708;
                                        class35.field474.method1526(var87, -57);
                                    } else {
                                        label603: for (int var83 = var13.field872; var83 < class150.field2272; var83++) {
                                            int var84 = class164.field2418[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field757.length; var85++) {
                                                if (var13.field757[var85] == var84) {
                                                    class604 var86 = new class604();
                                                    var86.field8782 = var13;
                                                    var86.field8773 = var13.field708;
                                                    class35.field474.method1526(var86, 111);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field872 = class150.field2272;
                                }
                                if (class105.field1751 > var13.field728 && var13.field760 != null) {
                                    class604 var88 = new class604();
                                    var88.field8782 = var13;
                                    var88.field8773 = var13.field760;
                                    class35.field474.method1526(var88, -71);
                                }
                                if (class688.field9702 > var13.field728 && var13.field737 != null) {
                                    class604 var89 = new class604();
                                    var89.field8782 = var13;
                                    var89.field8773 = var13.field737;
                                    class35.field474.method1526(var89, 90);
                                }
                                if (class526.field7475 > var13.field728 && var13.field727 != null) {
                                    class604 var90 = new class604();
                                    var90.field8782 = var13;
                                    var90.field8773 = var13.field727;
                                    class35.field474.method1526(var90, -24);
                                }
                                if (class345.field4861 > var13.field728 && var13.field786 != null) {
                                    class604 var91 = new class604();
                                    var91.field8782 = var13;
                                    var91.field8773 = var13.field786;
                                    class35.field474.method1526(var91, -113);
                                }
                                if (class298.field4135 > var13.field728 && var13.field820 != null) {
                                    class604 var92 = new class604();
                                    var92.field8782 = var13;
                                    var92.field8773 = var13.field820;
                                    class35.field474.method1526(var92, 79);
                                }
                                var13.field728 = class374.field5247;
                                if (var13.field864 != null) {
                                    for (int var93 = 0; var93 < class64.field1165; var93++) {
                                        class604 var94 = new class604();
                                        var94.field8782 = var13;
                                        var94.field8780 = class226.field3232[var93].method114(10721);
                                        var94.field8775 = class226.field3232[var93].method110(29932);
                                        var94.field8773 = var13.field864;
                                        class35.field474.method1526(var94, -74);
                                    }
                                }
                                if (class402.field5621 && var13.field837 != null) {
                                    class604 var95 = new class604();
                                    var95.field8782 = var13;
                                    var95.field8773 = var13.field837;
                                    class35.field474.method1526(var95, 115);
                                }
                            }
                            if (var13.field765 == 5 && var13.field749 != -1) {
                                var13.method454(class206.field2944, (byte) -126, class569.field8108).method2023(var13.field830, class359.field5046, 0);
                            }
                            class354.method2220(var13, 350590048);
                            if (var13.field765 == 0) {
                                method1947(arg0, var13.field792, var16, var17, var18, var19, var14 - var13.field790, var15 - var13.field869, arg8, arg9, arg10, arg11);
                                if (var13.field863 != null) {
                                    method1947(var13.field863, var13.field792, var16, var17, var18, var19, var14 - var13.field790, var15 - var13.field869, arg8, arg9, arg10, arg11);
                                }
                                class548 var96 = (class548) class310.field4383.method4203(true, (long) var13.field792);
                                if (var96 != null) {
                                    if (class87.field1576 == class649.field9170 && var96.field7725 == 0 && !class34.field450 && var25 && !class588.field8274) {
                                        class500.method3006(-26940);
                                    }
                                    class187.method1326(true, arg8, var15, arg10, var19, var17, var16, var96.field7723, arg9, var14, arg11, var18);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class354.method2220(var13, 350590048);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ldm;)Z")
    public static final boolean method1948(class50 arg0) {
        if (class588.field8274) {
            if (method1943(arg0).field4679 != 0) {
                return false;
            }
            if (arg0.field765 == 0) {
                return false;
            }
        }
        return arg0.field725;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static void method1949(int arg0) {
        if (arg0 != 0) {
            field4194 = null;
        }
        field4194 = null;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    private final void method1950(int arg0) {
        field4208++;
        if (class611.field8839 == 14) {
            return;
        }
        class605.field8787++;
        if (class605.field8787 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class581.field8221 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class155.field2330.setSeed((long) class581.field8221);
        }
        if (class605.field8787 % 50 == 0) {
            class252.field3601 = class610.field8830;
            class610.field8830 = 0;
            class186.field2684 = class317.field4504;
            class317.field4504 = 0;
        }
        this.method1935(true);
        if (arg0 != 13) {
            return;
        }
        if (class404.field5632 != null) {
            class404.field5632.method1118((byte) 115);
        }
        class125.method981(arg0 ^ 0xFFFFFF80);
        class236.method1603((byte) 39);
        class167.field2461.method1538((byte) -6);
        class422.field5917.method1588(-116);
        if (class359.field5046 != null) {
            class359.field5046.method566((int) class742.method4128(1));
        }
        class170.method1256(13731);
        class56.field1055 = 0;
        class64.field1165 = 0;
        for (class602 var3 = class167.field2461.method1541(false); var3 != null; var3 = class167.field2461.method1541(false)) {
            int var6 = var3.method109((byte) -128);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method110(arg0 + 29919);
                if (class537.method3144(127) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class32.method211((byte) -61)) {
                        class98.method879(116);
                    } else {
                        class224.method1549(arg0 ^ 0xD);
                    }
                } else if (class64.field1165 < 128) {
                    class226.field3232[class64.field1165] = var3;
                    class64.field1165++;
                }
            } else if (var6 == 0 && class56.field1055 < 75) {
                class15.field193[class56.field1055] = var3;
                class56.field1055++;
            }
        }
        class668.field9367 = 0;
        for (class709 var4 = class422.field5917.method1590(260610); var4 != null; var4 = class422.field5917.method1590(260610)) {
            int var5 = var4.method2003(-4);
            if (var5 == -1) {
                class702.field9854.method1526(var4, 121);
            } else if (var5 == 6) {
                class668.field9367 += var4.method2004(arg0 - 8);
            } else if (class98.method881(-1, var5)) {
                class119.field1862.method1526(var4, -82);
                if (class119.field1862.method1531(0) > 10) {
                    class119.field1862.method1521(116);
                }
            }
        }
        if (class32.method211((byte) -61)) {
            class459.method2799(arg0 ^ 0x5D);
        }
        if (class53.method487(false, class611.field8839)) {
            class281.method1836(arg0 + 97);
            class54.method491(0);
        } else if (class739.method4116(class611.field8839, -125)) {
            class151.method1161(-66);
        }
        if (class756.method4199(class611.field8839, 0) && !class739.method4116(class611.field8839, -128)) {
            this.method1951(arg0 ^ 0x4);
            class189.method1332(true);
            class532.method3127((byte) 60);
        } else if (class428.method2601(class611.field8839, (byte) -121) && !class739.method4116(class611.field8839, arg0 ^ 0xFFFFFF81)) {
            this.method1951(9);
            class532.method3127((byte) 60);
        } else if (class611.field8839 == 12) {
            class532.method3127((byte) 60);
        } else if (class379.method2373(false, class611.field8839) && !class739.method4116(class611.field8839, -128)) {
            class330.method2110(true);
        } else if (class611.field8839 == 13) {
            class532.method3127((byte) 60);
            if (class115.field1839 != -3 && class115.field1839 != 2 && class115.field1839 != 15) {
                class144.method1123(false, (byte) -38);
            }
        }
        class204.method1425(class359.field5046, false);
        class119.field1862.method1521(125);
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method1951(int arg0) {
        if (class611.field8839 == 7 && class363.field5096 == 0) {
            if (class586.field8248 > 1) {
                class298.field4135 = class374.field5247;
                class586.field8248--;
            }
            if (!class34.field450) {
                class500.method3006(-26940);
            }
            for (int var2 = 0; var2 < 100 && class114.method942(arg0 - 9); var2++) {
            }
        }
        field4202++;
        class373.field5232++;
        class62.method671(-1, -1, -111, null);
        if (arg0 != 9) {
            this.method1935(false);
        }
        class181.method1301(-1, true, null, -1);
        class361.method2247((byte) -8);
        class374.field5247++;
        for (int var3 = 0; var3 < class130.field1948; var3++) {
            class84 var4 = class379.field5284[var3].field3885;
            if (var4 != null) {
                byte var5 = var4.field1523.field6928;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method482(false);
                    if ((var5 & 0x2) != 0 && var4.field992 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field991[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class174.field2540 - var6 - 1 < var9) {
                                var9 = class174.field2540 - var6 - 1;
                            }
                            int var10 = var4.field995[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class716.field9999 - var6 - 1 < var10) {
                                var10 = class716.field9999 - var6 - 1;
                            }
                            int var11 = class60.method666(0, -1, var6, var4.field995[0], class595.field8703, true, var6, var9, var6, var10, class630.field9041[var4.field649], true, class63.field1148, 0, var4.field991[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field991[var12] = class63.field1148[var11 - var12 - 1];
                                    var4.field995[var12] = class595.field8703[var11 - var12 - 1];
                                    var4.field986[var12] = 1;
                                }
                                var4.field992 = var11;
                            }
                        }
                    }
                    class204.method1426(true, false, var4);
                    int var13 = class559.method3282((byte) 110, var4);
                    class652.method3683(var4, -2);
                    class11.method57(var13, true, class668.field9381, class21.field266, var4);
                    class162.method1214(var4, 0, class668.field9381);
                    class239.method1609(true, var4);
                }
            }
        }
        if (class363.field5096 == 0 && class611.field8842 == 0) {
            if (class666.field9338 == 2) {
                class368.method2308((byte) -86);
            } else {
                class228.method1567((byte) -54);
            }
            if (class685.field9660 >> 9 < 14 || (class685.field9660 >> 9) >= (class174.field2540 - 14) || class260.field3810 >> 9 < 14 || class716.field9999 - 14 <= class260.field3810 >> 9) {
                class411.method2504(106);
            }
        }
        while (true) {
            class604 var14;
            class50 var15;
            class50 var16;
            do {
                var14 = (class604) class321.field4556.method1521(109);
                if (var14 == null) {
                    while (true) {
                        class604 var17;
                        class50 var18;
                        class50 var19;
                        do {
                            var17 = (class604) class62.field1134.method1521(108);
                            if (var17 == null) {
                                while (true) {
                                    class604 var20;
                                    class50 var21;
                                    class50 var22;
                                    do {
                                        var20 = (class604) class35.field474.method1521(118);
                                        if (var20 == null) {
                                            if (class755.field10512 != null) {
                                                class594.method3467((byte) 69);
                                            }
                                            if (class605.field8787 % 1500 == 0) {
                                                class667.method3741((byte) 93);
                                            }
                                            if (class611.field8839 == 7 && class363.field5096 == 0) {
                                                class202.method1414((byte) 84);
                                            }
                                            class37.method303(-54);
                                            if (class291.field4082 && class363.field5094 < class742.method4128(1) - 60000L) {
                                                class217.method1509(123);
                                            }
                                            for (class426 var23 = (class426) class158.field2358.method4159(0); var23 != null; var23 = (class426) class158.field2358.method4151(7)) {
                                                if ((long) var23.field5960 < class742.method4128(1) / 1000L - 5L) {
                                                    if (var23.field5952 > 0) {
                                                        class541.method3185("", "", var23.field5961 + class281.field3960.method1839((byte) 45, class744.field10426), 0, 5, 6642, "");
                                                    }
                                                    if (var23.field5952 == 0) {
                                                        class541.method3185("", "", var23.field5961 + class281.field3961.method1839((byte) 45, class744.field10426), 0, 5, 6642, "");
                                                    }
                                                    var23.method909(-109);
                                                }
                                            }
                                            if (class611.field8839 == 7 && class363.field5096 == 0) {
                                                if (class555.field7776 == null) {
                                                    class144.method1123(false, (byte) -38);
                                                    return;
                                                }
                                                class373.field5241++;
                                                if (class373.field5241 > 50) {
                                                    class21.field267++;
                                                    class135 var24 = class273.method1801(class459.field6629, class392.field5505, 2);
                                                    class539.method3178(var24, arg0 - 18934);
                                                }
                                                try {
                                                    class464.method2823((byte) 107);
                                                    return;
                                                } catch (IOException var25) {
                                                    class144.method1123(false, (byte) -38);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field8782;
                                        if (var21.field807 < 0) {
                                            break;
                                        }
                                        var22 = class545.method3220(arg0 ^ 0xFFF6, var21.field791);
                                    } while (var22 == null || var22.field863 == null || var21.field807 >= var22.field863.length || var22.field863[var21.field807] != var21);
                                    class357.method2223(var20);
                                }
                            }
                            var18 = var17.field8782;
                            if (var18.field807 < 0) {
                                break;
                            }
                            var19 = class545.method3220(65535, var18.field791);
                        } while (var19 == null || var19.field863 == null || var19.field863.length <= var18.field807 || var19.field863[var18.field807] != var18);
                        class357.method2223(var17);
                    }
                }
                var15 = var14.field8782;
                if (var15.field807 < 0) {
                    break;
                }
                var16 = class545.method3220(arg0 ^ 0xFFF6, var15.field791);
            } while (var16 == null || var16.field863 == null || var16.field863.length <= var15.field807 || var16.field863[var15.field807] != var15);
            class357.method2223(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    private final void method1952(int arg0) {
        if (arg0 != -4) {
            method1948(null);
        }
        field4199++;
        if (class611.field8839 == 14) {
            return;
        }
        long var2 = class134.method1064(-8839) / 1000000L - class330.field4671;
        class330.field4671 = class134.method1064(-8839) / 1000000L;
        boolean var4 = class702.method3944(0);
        if (var4 && class90.field1607 && class443.field6166 != null) {
            class443.field6166.method378(arg0 - 51);
        }
        if (class250.method1666(class611.field8839, false)) {
            if (class404.field5630 != 0L && class404.field5630 < class742.method4128(1)) {
                class492.method2959(class190.method1336((byte) -106), false, class706.field9890, class491.field6996, (byte) 106);
            } else if (!class359.field5046.method635() && class206.field2957) {
                class151.method1162(-16754);
            }
        }
        if (class330.field4654 == null) {
            Container var5;
            if (class754.field10504 != null) {
                var5 = class754.field10504;
            } else if (class476.field6812 == null) {
                var5 = class407.field5670;
            } else {
                var5 = class476.field6812;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class754.field10504 == var5) {
                Insets var8 = class754.field10504.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class556.field7778 != var6 || class194.field2788 != var7 || class291.field4095) {
                if (class359.field5046 == null || class359.field5046.method605()) {
                    class561.method3286(false);
                } else {
                    class194.field2788 = var7;
                    class556.field7778 = var6;
                }
                class404.field5630 = class742.method4128(1) + 500L;
                class291.field4095 = false;
            }
        }
        if (class330.field4654 != null && !class33.field439 && class250.method1666(class611.field8839, false)) {
            class492.method2959(class471.field6781.field6700.method2157(arg0 + 27673), false, -1, -1, (byte) 114);
        }
        boolean var9 = false;
        if (class701.field9847) {
            class701.field9847 = false;
            var9 = true;
        }
        if (var9) {
            class696.method3905(-102);
        }
        if (class359.field5046 != null && class359.field5046.method635() || class190.method1336((byte) -106) != 1) {
            class237.method1608(true);
        }
        if (class53.method487(false, class611.field8839)) {
            class208.method1447(var9, 45);
        } else if (class515.method3071(class611.field8839, (byte) 66)) {
            class348.method2189(63);
        } else if (class564.method3293(class611.field8839, true)) {
            class348.method2189(41);
        } else if (class739.method4116(class611.field8839, -118)) {
            if (class157.field2349 == 1) {
                if (class694.field9761 > class646.field9155) {
                    class646.field9155 = class694.field9761;
                }
                int var11 = (class646.field9155 - class694.field9761) * 50 / class646.field9155;
                class379.method2375(class359.field5046, true, class281.field3953.method1839((byte) 45, class744.field10426) + "<br>(" + var11 + "%)", (byte) 126, class722.field10090, class436.field6100);
            } else if (class157.field2349 == 2) {
                if (class271.field3880 < class32.field435) {
                    class271.field3880 = class32.field435;
                }
                int var10 = (class271.field3880 - class32.field435) * 50 / class271.field3880 + 50;
                class379.method2375(class359.field5046, true, class281.field3953.method1839((byte) 45, class744.field10426) + "<br>(" + var10 + "%)", (byte) 121, class722.field10090, class436.field6100);
            } else {
                class379.method2375(class359.field5046, true, class281.field3953.method1839((byte) 45, class744.field10426), (byte) 126, class722.field10090, class436.field6100);
            }
        } else if (class611.field8839 == 10) {
            class565.method3298(var2, 118);
        } else if (class611.field8839 == 13) {
            class379.method2375(class359.field5046, false, class281.field3955.method1839((byte) 45, class744.field10426) + "<br>" + class281.field3956.method1839((byte) 45, class744.field10426), (byte) 124, class722.field10090, class436.field6100);
        }
        if (class478.field6822 == 3) {
            for (int var12 = 0; var12 < class114.field1830; var12++) {
                Rectangle var13 = class745.field10438[var12];
                if (class280.field3932[var12]) {
                    class359.field5046.method586(-65281, var13.y, arg0 ^ 0xFFFFFFF0, var13.height, var13.width, var13.x);
                } else if (class443.field6170[var12]) {
                    class359.field5046.method586(-65536, var13.y, 12, var13.height, var13.width, var13.x);
                } else {
                    class359.field5046.method586(-16711936, var13.y, 12, var13.height, var13.width, var13.x);
                }
            }
        }
        if (class32.method211((byte) -61)) {
            class521.method3093(10, class359.field5046);
        }
        if (class341.field4796.field5130 && class250.method1666(class611.field8839, false) && class478.field6822 == 0 && class190.method1336((byte) -106) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class114.field1830; var15++) {
                if (class443.field6170[var15]) {
                    class443.field6170[var15] = false;
                    class331.field4680[var14++] = class745.field10438[var15];
                }
            }
            try {
                if (class200.field2876) {
                    class375.method2356(class331.field4680, (byte) -128, var14);
                } else {
                    class359.field5046.method540(class331.field4680, var14, 65);
                }
            } catch (class701 var20) {
            }
        } else if (!class53.method487(false, class611.field8839)) {
            for (int var16 = 0; var16 < class114.field1830; var16++) {
                class443.field6170[var16] = false;
            }
            try {
                if (class200.field2876) {
                    class681.method3846(-60);
                } else {
                    class359.field5046.method582(3593);
                }
            } catch (class701 var19) {
                class621.method3591(var19.getMessage() + " (Recovered) " + this.method1939(arg0 ^ 0x7C), var19, (byte) -84);
                class54.method490((byte) 109, false, 0);
            }
        }
        class82.method800((byte) -115);
        int var18 = class471.field6781.field6720.method409(27669);
        if (var18 == 0) {
            class246.method1639(15L, (byte) -88);
        } else if (var18 == 1) {
            class246.method1639(10L, (byte) -64);
        } else if (var18 == 2) {
            class246.method1639(5L, (byte) -94);
        } else if (var18 == 3) {
            class246.method1639(2L, (byte) -74);
        }
        if (class652.field9188) {
            class85.method812(arg0 - 33);
        }
        if (class471.field6781.field6707.method2484(27669) == 1 && class611.field8839 == 3 && class401.field5610 != -1) {
            class471.field6781.method2826(0, (byte) 84, class471.field6781.field6707);
            class129.method994((byte) 114);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4209++;
        if (!this.method1970(0)) {
            return;
        }
        class430.field6021 = new class593();
        class430.field6021.field8324 = Integer.parseInt(this.getParameter("worldid"));
        class232.field3298 = new class593();
        class232.field3298.field8324 = Integer.parseInt(this.getParameter("lobbyid"));
        class232.field3298.field8321 = this.getParameter("lobbyaddress");
        class193.field2782 = new class593();
        class193.field2782.field8324 = Integer.parseInt(this.getParameter("demoid"));
        class193.field2782.field8321 = this.getParameter("demoaddress");
        class118.field1857 = class630.method3629(Integer.parseInt(this.getParameter("modewhere")), 43);
        if (class611.field8843 == class118.field1857) {
            class118.field1857 = class315.field4464;
        } else if (!class679.method3837((byte) 32, class118.field1857) && class231.field3294 != class118.field1857) {
            class118.field1857 = class231.field3294;
        }
        class468.field6752 = class250.method1700(15, Integer.parseInt(this.getParameter("modewhat")));
        if (class468.field6752 != class22.field283 && class7.field115 != class468.field6752 && class560.field7956 != class468.field6752) {
            class468.field6752 = class560.field7956;
        }
        try {
            class744.field10426 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class744.field10426 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class561.field7961 = true;
        } else {
            class561.field7961 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class255.field3698 = true;
        } else {
            class255.field3698 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class666.field9337 = true;
        } else {
            class666.field9337 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class649.field9170 = class87.field1576;
            } else if (var4.equals("1")) {
                class649.field9170 = class696.field9784;
            } else if (var4.equals("2")) {
                class649.field9170 = class476.field6808;
            } else if (var4.equals("3")) {
                class649.field9170 = class474.field6794;
            }
        }
        try {
            class66.field1197 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class66.field1197 = 0;
        }
        class673.field9443 = this.getParameter("quiturl");
        class611.field8844 = this.getParameter("settings");
        if (class611.field8844 == null) {
            class611.field8844 = "";
        }
        class247.field3472 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class417.field5856 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class417.field5856 = 0;
            }
        }
        class54.field1035 = Integer.parseInt(this.getParameter("colourid"));
        if (class54.field1035 < 0 || class54.field1035 >= class668.field9368.length) {
            class54.field1035 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class617.field8925 = true;
            class406.field5652 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class606.field8795 = true;
        }
        class443.field6167 = this.getParameter("sskey");
        if (class443.field6167 != null && class443.field6167.length() < 2) {
            class443.field6167 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class709.field9913 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class138.field2154 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class229.field3268 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class205.field2942 = this.getParameter("additionalInfo");
        if (class205.field2942 != null && class205.field2942.length() > 50) {
            class205.field2942 = null;
        }
        if (class87.field1576 == class649.field9170) {
            class477.field6814 = 503;
            class57.field1064 = 765;
        } else if (class696.field9784 == class649.field9170) {
            class57.field1064 = 640;
            class477.field6814 = 480;
        }
        class345.field4858 = this;
        this.method1973(629, 37, class477.field6814, 3, class649.field9170.field2573, class468.field6752.method2866((byte) -40) + 32, class57.field1064);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1953(int arg0, int arg1) {
        class612.field8856.field8209++;
        class490.field6992 = null;
        class739.field10385 = null;
        class612.field8856.field8207 = arg1;
        field4196++;
        class308.field4354 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1954(int arg0) {
        if (class709.field9913) {
            class438.field6123 = 64;
        }
        field4206++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        if (arg0 != 0) {
            return;
        }
        var2.dispose();
        class561.method3286(false);
        class262.field3829 = new class617(class341.field4796);
        class612.field8856 = new class580();
        class129.method993(new int[] { 20, 260 }, new int[] { 1000, 100 }, (byte) -15);
        if (class231.field3294 != class118.field1857) {
            class586.field8254 = new byte[50][];
        }
        class471.field6781 = class634.method3646(126);
        if (class231.field3294 == class118.field1857) {
            class430.field6021.field8321 = this.getCodeBase().getHost();
        } else if (class679.method3837((byte) 32, class118.field1857)) {
            class430.field6021.field8321 = this.getCodeBase().getHost();
            class430.field6021.field8317 = class430.field6021.field8324 + 40000;
            class232.field3298.field8317 = class232.field3298.field8324 + 40000;
            class193.field2782.field8317 = class193.field2782.field8324 + 40000;
            class430.field6021.field8323 = class430.field6021.field8324 + 50000;
            class232.field3298.field8323 = class232.field3298.field8324 + 50000;
            class193.field2782.field8323 = class193.field2782.field8324 + 50000;
        } else if (class611.field8843 == class118.field1857) {
            class430.field6021.field8321 = "127.0.0.1";
            class232.field3298.field8321 = "127.0.0.1";
            class193.field2782.field8321 = "127.0.0.1";
            class430.field6021.field8317 = class430.field6021.field8324 + 40000;
            class232.field3298.field8317 = class232.field3298.field8324 + 40000;
            class193.field2782.field8317 = class193.field2782.field8324 + 40000;
            class430.field6021.field8323 = class430.field6021.field8324 + 50000;
            class232.field3298.field8323 = class232.field3298.field8324 + 50000;
            class193.field2782.field8323 = class193.field2782.field8324 + 50000;
        }
        class67.field1223 = class430.field6021;
        if (class87.field1576 == class649.field9170) {
            class696.field9798 = false;
        }
        class87.field1575 = class316.field4489 = class631.field9044 = class262.field3824 = new short[256];
        if (class696.field9784 == class649.field9170) {
            class70.field1248 = 16777215;
            class630.field9043 = true;
            class681.field9588 = class446.field6199;
            class487.field6892 = class405.field5647;
            class509.field7255 = 0;
        } else if (class649.field9170 == class474.field6794) {
            class487.field6892 = class693.field9745;
            class681.field9588 = class272.field3890;
        } else {
            class487.field6892 = class120.field1868;
            class681.field9588 = class736.field10360;
        }
        try {
            class139.field2160 = class345.field4858.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class167.field2461 = class488.method2938(class567.field8085, (byte) -128);
        class422.field5917 = class488.method2933((byte) -76, class567.field8085, true);
        try {
            if (class341.field4796.field5118 != null) {
                class196.field2805 = new class503(class341.field4796.field5118, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class165.field2441[var3] = new class503(class341.field4796.field5131[var3], 6000, 0);
                }
                class749.field10472 = new class503(class341.field4796.field5139, 6000, 0);
                class343.field4827 = new class195(255, class196.field2805, class749.field10472, 500000);
                class218.field3110 = new class503(class341.field4796.field5138, 24, 0);
                class341.field4796.field5139 = null;
                class341.field4796.field5131 = null;
                class341.field4796.field5138 = null;
                class341.field4796.field5118 = null;
            }
        } catch (IOException var5) {
            class749.field10472 = null;
            class218.field3110 = null;
            class196.field2805 = null;
            class343.field4827 = null;
        }
        if (class231.field3294 != class118.field1857) {
            class143.field2194 = true;
        }
        class586.field8251 = class281.field3953.method1839((byte) 45, class744.field10426);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lud;IB)V")
    public static final void method1955(class35 arg0, int arg1, byte arg2) {
        if (arg2 <= 75) {
            field4194 = null;
        }
        if (class218.field3110 != null) {
            try {
                class218.field3110.method3019(0L, 119);
                class218.field3110.method3023(arg1, 92, 24, arg0.field483);
            } catch (Exception var3) {
            }
        }
        field4204++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1956(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
