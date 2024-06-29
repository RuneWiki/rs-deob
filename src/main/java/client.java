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
public class client extends class350 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1278;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field1279;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
    public static boolean field1280;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
        field1277++;
        if (class223.field2944.field633.method4191((byte) -122) == 2) {
            try {
                this.method718(0);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class486.method2844((byte) -1, var5.getMessage() + " (Recovered) " + this.method714(20), var5);
                class9.field96 = true;
                class462.method2730(1, false, 0);
            }
        } else {
            this.method718(0);
        }
        if (arg0) {
            method717(63);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    private final void method697(boolean arg0) {
        field1276++;
        if (class668.field9150 == 14) {
            return;
        }
        class266.field3368++;
        if (class266.field3368 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class733.field10239 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class216.field2731.setSeed((long) class733.field10239);
        }
        if ((class266.field3368 % 50) == 0) {
            class595.field8268 = class229.field2994;
            class632.field8772 = class534.field7495;
            class229.field2994 = 0;
            class534.field7495 = 0;
        }
        this.method708((byte) 79);
        if (class424.field6032 != null) {
            class424.field6032.method2875(0);
        }
        class327.method1937(-19164);
        class676.method3633(true);
        class333.field4297.method2919(16956);
        class402.field5566.method2331((byte) 50);
        if (class458.field6407 != null) {
            class458.field6407.method97((int) class97.method654((byte) 85));
        }
        class83.method587((byte) -121);
        class234.field3023 = 0;
        class237.field3068 = 0;
        for (class122 var3 = class333.field4297.method2918(43); var3 != null; var3 = class333.field4297.method2918(43)) {
            int var6 = var3.method799((byte) 112);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method798(-17654);
                if (class550.method3133(122) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class64.method490((byte) 67)) {
                        class615.method3374((byte) -24);
                    } else {
                        class363.method2240((byte) 49);
                    }
                } else if (class234.field3023 < 128) {
                    class753.field10513[class234.field3023] = var3;
                    class234.field3023++;
                }
            } else if (var6 == 0 && class237.field3068 < 75) {
                class208.field2663[class237.field3068] = var3;
                class237.field3068++;
            }
        }
        class8.field90 = 0;
        for (class283 var4 = class402.field5566.method2333(false); var4 != null; var4 = class402.field5566.method2333(false)) {
            int var5 = var4.method1701(-49);
            if (var5 == -1) {
                class386.field5379.method3110(var4, 1);
            } else if (var5 == 6) {
                class8.field90 += var4.method1705(-3668);
            } else if (class518.method2972(var5, 1)) {
                class679.field9210.method3110(var4, 1);
                if (class679.field9210.method3122(667) > 10) {
                    class679.field9210.method3115(1210318848);
                }
            }
        }
        if (class64.method490((byte) 34)) {
            class542.method3086(-98);
        }
        if (class77.method562(class668.field9150, arg0)) {
            class142.method878(1);
            class541.method3081(-95);
        } else if (class41.method340(4, class668.field9150)) {
            class674.method3630(false);
        }
        if (class374.method2276(!arg0, class668.field9150) && !class41.method340(4, class668.field9150)) {
            this.method719(-66);
            class386.method2317(117);
            class573.method3219((byte) -126);
        } else if (class189.method1198(class668.field9150, -123) && !class41.method340(4, class668.field9150)) {
            this.method719(-21);
            class573.method3219((byte) -118);
        } else if (class668.field9150 == 12) {
            class573.method3219((byte) -117);
        } else if (class64.method489((byte) 124, class668.field9150) && !class41.method340(4, class668.field9150)) {
            class685.method3799((byte) 108);
        } else if (class668.field9150 == 13) {
            class573.method3219((byte) -123);
            if (class10.field107 != -3 && class10.field107 != 2 && class10.field107 != 15) {
                class650.method3509(false, (byte) -74);
            }
        }
        class16.method201(class458.field6407, 127);
        class679.field9210.method3115(1210318848);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgaa;)Z")
    public static final boolean method698(class460 arg0) {
        if (class491.field6959) {
            if (method715(arg0).field465 != 0) {
                return false;
            }
            if (arg0.field6483 == 0) {
                return false;
            }
        }
        return arg0.field6611;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        if (class125.field1497) {
            class61.method477(!arg0);
        }
        field1266++;
        class516.method2959(12288);
        if (!arg0) {
            return;
        }
        if (class458.field6407 != null) {
            class458.field6407.method2658(-127);
        }
        if (class627.field8740 != null) {
            class171.method1069(-124, class681.field9312, class627.field8740);
            class627.field8740 = null;
        }
        if (class426.field6057 != null) {
            class426.field6057.method872(-1);
            class426.field6057 = null;
        }
        class700.method3878(13797);
        class101.field1243.method4099(-110);
        class707.field9957.method3289(arg0);
        if (class643.field8881 != null) {
            class643.field8881.method1776(false);
            class643.field8881 = null;
        }
        try {
            class460.field6516.method2823(7);
            for (int var2 = 0; var2 < 37; var2++) {
                class586.field8194[var2].method2823(7);
            }
            class65.field875.method2823(7);
            class444.field6234.method2823(7);
            class746.method4169(!arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1268++;
        if (!this.method2055(17802)) {
            return;
        }
        class750.field10496 = new class187();
        class750.field10496.field2454 = Integer.parseInt(this.getParameter("worldid"));
        class86.field1102 = new class187();
        class86.field1102.field2454 = Integer.parseInt(this.getParameter("lobbyid"));
        class86.field1102.field2460 = this.getParameter("lobbyaddress");
        class718.field10125 = new class187();
        class718.field10125.field2454 = Integer.parseInt(this.getParameter("demoid"));
        class718.field10125.field2460 = this.getParameter("demoaddress");
        class323.field4120 = class38.method330(Integer.parseInt(this.getParameter("modewhere")), 94);
        if (class323.field4120 == class20.field257) {
            class323.field4120 = class462.field6702;
        } else if (!class374.method2275(class323.field4120, 2) && class323.field4120 != class171.field2248) {
            class323.field4120 = class171.field2248;
        }
        class42.field642 = class396.method2358(Integer.parseInt(this.getParameter("modewhat")), (byte) 32);
        if (class42.field642 != class393.field5487 && class42.field642 != class127.field1527 && class462.field6673 != class42.field642) {
            class42.field642 = class462.field6673;
        }
        try {
            class416.field5920 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class416.field5920 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class142.field1688 = true;
        } else {
            class142.field1688 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class536.field7527 = true;
        } else {
            class536.field7527 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class508.field7189 = true;
        } else {
            class508.field7189 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class702.field9902 = class400.field5535;
            } else if (var4.equals("1")) {
                class702.field9902 = class737.field10321;
            } else if (var4.equals("2")) {
                class702.field9902 = class289.field3670;
            } else if (var4.equals("3")) {
                class702.field9902 = class219.field2785;
            }
        }
        try {
            class718.field10135 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class718.field10135 = 0;
        }
        class512.field7224 = this.getParameter("quiturl");
        class371.field5224 = this.getParameter("settings");
        if (class371.field5224 == null) {
            class371.field5224 = "";
        }
        class181.field2382 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class486.field6908 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class486.field6908 = 0;
            }
        }
        class414.field5845 = Integer.parseInt(this.getParameter("colourid"));
        if (class414.field5845 < 0 || class414.field5845 >= class583.field8091.length) {
            class414.field5845 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class682.field9344 = true;
            class737.field10330 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class546.field7682 = true;
        }
        class224.field2948 = this.getParameter("sskey");
        if (class224.field2948 != null && class224.field2948.length() < 2) {
            class224.field2948 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class434.field6122 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class52.field764 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class584.field8114 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class202.field2579 = this.getParameter("additionalInfo");
        if (class202.field2579 != null && class202.field2579.length() > 50) {
            class202.field2579 = null;
        }
        class612.field8463 = this;
        if (class702.field9902 == class400.field5535) {
            class303.field3896 = 765;
            class708.field9966 = 503;
        } else if (class737.field10321 == class702.field9902) {
            class303.field3896 = 640;
            class708.field9966 = 480;
        }
        this.method2053(class42.field642.method865(true) + 32, 16484, class702.field9902.field3631, 636, class303.field3896, 37, class708.field9966);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method700(byte arg0) {
        field1265++;
        if (class223.field2944.field633.method4191((byte) -121) == 2) {
            try {
                this.method697(true);
            } catch (ThreadDeath var5) {
                throw var5;
            } catch (Throwable var6) {
                class486.method2844((byte) -1, var6.getMessage() + " (Recovered) " + this.method714(16), var6);
                class9.field96 = true;
                class462.method2730(1, false, 0);
            }
        } else {
            this.method697(true);
        }
        int var4 = -38 / ((50 - arg0) / 48);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1272++;
        try {
            if (arg0.length != 6) {
                class151.method941(0, "Argument count");
            }
            class750.field10496 = new class187();
            class750.field10496.field2454 = Integer.parseInt(arg0[0]);
            class86.field1102 = new class187();
            class86.field1102.field2454 = Integer.parseInt(arg0[1]);
            class718.field10125 = new class187();
            class718.field10125.field2454 = Integer.parseInt(arg0[2]);
            class323.field4120 = class20.field257;
            if (arg0[3].equals("live")) {
                class42.field642 = class462.field6673;
            } else if (arg0[3].equals("rc")) {
                class42.field642 = class127.field1527;
            } else if (arg0[3].equals("wip")) {
                class42.field642 = class393.field5487;
            } else {
                class151.method941(0, "modewhat");
            }
            class416.field5920 = class326.method1929(arg0[4], (byte) -106);
            if (class416.field5920 == -1) {
                if (arg0[4].equals("english")) {
                    class416.field5920 = 0;
                } else if (arg0[4].equals("german")) {
                    class416.field5920 = 1;
                } else {
                    class151.method941(0, "language");
                }
            }
            class536.field7527 = false;
            class142.field1688 = false;
            if (arg0[5].equals("game0")) {
                class702.field9902 = class400.field5535;
            } else if (arg0[5].equals("game1")) {
                class702.field9902 = class737.field10321;
            } else if (arg0[5].equals("game2")) {
                class702.field9902 = class289.field3670;
            } else if (arg0[5].equals("game3")) {
                class702.field9902 = class219.field2785;
            } else {
                class151.method941(0, "game");
            }
            class202.field2579 = null;
            class371.field5224 = "";
            class682.field9344 = true;
            class737.field10330 = true;
            class434.field6122 = false;
            class546.field7682 = false;
            class718.field10135 = 0;
            class52.field764 = 0;
            class584.field8114 = 0L;
            class414.field5845 = class702.field9902.field3627;
            class224.field2948 = null;
            class486.field6908 = 0;
            client var1 = new client();
            class612.field8463 = var1;
            var1.method2052(37, 1024, false, 636, 768, class702.field9902.field3631, 103, class42.field642.method865(true) + 32);
            class95.field1205.setLocation(40, 40);
        } catch (Exception var3) {
            class486.method2844((byte) -1, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    private final void method701(int arg0, boolean arg1) {
        class704.field9936 = null;
        if (arg1) {
            return;
        }
        class140.field1664 = 0;
        field1263++;
        class70.field951 = null;
        class101.field1243.field10263++;
        class101.field1243.field10265 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method702(byte arg0) {
        class576.method3225((byte) 85);
        field1271++;
        class471.method2775((byte) -125);
        class548.method3125(-125);
        class586.method3262((byte) -127);
        class543.method3089(arg0 ^ 0x32);
        class677.method3639(arg0 + 106);
        class238.method1489((byte) -69);
        class539.method3066(arg0 + 24867);
        class461.method2715(-128);
        class58.method460(true);
        class145.method899((byte) -120);
        class627.method3427((byte) 127);
        class583.method3247(true);
        class350.method2051((byte) 56);
        class457.method2678(0);
        class70.method527(-25864);
        class286.method1712(-31620);
        class376.method2280((byte) -113);
        class454.method2663((byte) 127);
        class41.method348(true);
        class618.method3393(2);
        class547.method3118((byte) 116);
        class5.method26(arg0 ^ 0x76);
        class733.method4101(true);
        class592.method3285(true);
        class494.method2872((byte) 0);
        class536.method3053((byte) -40);
        class687.method3814(1);
        class485.method2822(-7190);
        class98.method655(arg0 ^ 0xF);
        class114.method771(false);
        class487.method2851(true);
        class17.method208(true);
        class106.method728((byte) -22);
        class658.method3575((byte) 81);
        class418.method2486(3);
        class550.method3135(arg0 + 106);
        class143.method884((byte) 20);
        class470.method2771(false);
        class237.method1486((byte) -128);
        class224.method1450((byte) -48);
        class634.method3447(0);
        class200.method1249(64);
        class93.method638((byte) -28);
        class522.method2998((byte) -125);
        class184.method1174(false);
        class668.method3614(6921);
        class166.method1028(2544);
        class132.method838(126);
        class427.method2533(arg0 ^ 0xFFFF8064);
        class348.method2041(60);
        class214.method1301(114);
        class175.method1080(126);
        class179.method1115((byte) 118);
        class395.method2355(-29422);
        class301.method1779(arg0 - 22897);
        class174.method1076((byte) -26);
        class685.method3805(false);
        class460.method2711(-107);
        class434.method2575(3858);
        class635.method3450(false);
        class125.method813((byte) 124);
        class412.method2444((byte) -124);
        class650.method3511(85);
        class24.method267((byte) 70);
        class73.method535((byte) -128);
        class182.method1168(-121);
        class63.method486((byte) -124);
        class11.method55(39);
        class124.method806(0);
        class157.method979(false);
        class28.method287((byte) -116);
        class16.method200(9458);
        class432.method2573(126);
        class696.method3871(-1713569622);
        class1.method1((byte) -112);
        class297.method1767(-88);
        class97.method653((byte) -73);
        class466.method2754(121);
        class215.method1304((byte) -82);
        class266.method1603((byte) -119);
        class708.method3913((byte) 39);
        class187.method1194(0);
        class691.method3860(-1);
        class401.method2379((byte) 65);
        class116.method786(-29431);
        class622.method3406((byte) -122);
        class717.method3982(1);
        class271.method1625(-5001);
        class425.method2529(false);
        class326.method1931(arg0 - 11277);
        class555.method3152(-17165);
        class747.method4174(125);
        class645.method3498((byte) -53);
        class219.method1330(false);
        class225.method1455((byte) 97);
        class662.method3587(-14471);
        class455.method2672(arg0 ^ 0xFFFFFF93);
        class220.method1379((byte) -98);
        class290.method1740(2);
        class415.method2471((byte) -101);
        class239.method1495(0);
        class402.method2380(1);
        class155.method966((byte) 98);
        class423.method2508(arg0 - 24127);
        class42.method354(1);
        class228.method1460(-56);
        class54.method438(-2);
        class160.method988((byte) -75);
        class514.method2954(78);
        class755.method4202(arg0 ^ 0x3E);
        class666.method3607(true);
        class542.method3084(-33);
        class21.method221((byte) -95);
        class280.method1675(1);
        class202.method1255(0);
        class518.method2974(arg0 ^ 0xFFFFFF9A);
        class29.method293(arg0 + 65509);
        class38.method331(true);
        class654.method3529(46);
        class233.method1470(false);
        class404.method2397((byte) -106);
        class750.method4186((byte) -12);
        class55.method443(true);
        class169.method1058(true);
        class582.method3242(arg0 + 161);
        class353.method2101(0);
        class709.method3916(false);
        class250.method1526((byte) -80);
        class665.method3603(arg0 + 208);
        class269.method1615(1);
        class331.method1949(false);
        class633.method3440(false);
        class510.method2937(arg0 ^ 0xFFFFFFA5);
        class702.method3897(arg0 + 102);
        class56.method452(arg0 ^ 0x3E74);
        class603.method3316((byte) -109);
        class621.method3400(-9520);
        class410.method2427(-1);
        class681.method3671(-18);
        class208.method1278(2000);
        class310.method1813(true);
        class445.method2624();
        class328.method1942((byte) -47);
        class148.method925(arg0 + 9707);
        class313.method1828(1);
        class513.method2950((byte) 85);
        class563.method3181(arg0 - 11886);
        class340.method1995(arg0 ^ 0xFFFFFF9B);
        class146.method907(arg0 ^ 0x6E3F);
        class431.method2570(102);
        class556.method3158(32);
        class218.method1318(-26);
        class217.method1313(true);
        class646.method3500((byte) 77);
        class48.method396(25497);
        class637.method3457(95);
        class416.method2479((byte) 81);
        class386.method2315((byte) 116);
        class150.method937(1);
        class47.method383(4);
        class341.method2020();
        class400.method2367(arg0 ^ 0x5125);
        class203.method1260(110);
        class422.method2502((byte) 49);
        class173.method1074(-126);
        class680.method3654(-28511);
        class296.method1765(true);
        class100.method675((byte) 97);
        class497.method2885((byte) -82);
        class761.method4236(58);
        class407.method2414((byte) 103);
        class426.method2532(121);
        class436.method2576(121);
        class616.method3379(false);
        class607.method3329((byte) 97);
        class152.method943(true);
        class512.method2949((byte) 54);
        class428.method2542();
        class459.method2692(-119);
        class595.method3296((byte) 47);
        class347.method2037(true);
        class534.method3040((byte) -128);
        class339.method1988(false);
        class302.method1782(105);
        class700.method3879(-109);
        class371.method2264(113);
        class499.method2893((byte) 112);
        class351.method2060((byte) -66);
        class429.method2561();
        class197.method1238(-111);
        class309.method1807((byte) 27);
        class33.method309((byte) -128);
        class533.method3035(125);
        class575.method3224((byte) 98);
        class236.method1480(-11856);
        class67.method505(Integer.MIN_VALUE);
        class551.method3137(arg0 + 46);
        class615.method3377((byte) 33);
        class323.method1907(112);
        class440.method2596(false);
        class525.method3013((byte) 123);
        class149.method934(arg0 - 23);
        class456.method2674(false);
        class108.method743((byte) 122);
        class478.method2803();
        class183.method1169(arg0 ^ 0xFFFFFF9A);
        class27.method276(-14952);
        class294.method1762((byte) 102);
        class338.method1982();
        class147.method920((byte) 126);
        class701.method3891(24392);
        class716.method3978((byte) 5);
        class383.method2305(false);
        class464.method2747((byte) 31);
        class85.method600(true);
        class389.method2324(105);
        class759.method4225();
        class23.method244((byte) 21);
        class53.method434(-14891);
        class188.method1196(true);
        class424.method2525(true);
        class15.method198(false);
        class438.method2583(0);
        class748.method4185(-48);
        class498.method2891(11209);
        class128.method829(arg0 ^ 0x9);
        class49.method401(arg0 + 17718);
        class572.method3218(arg0 + 99);
        class632.method3436(11);
        class121.method795((byte) -96);
        class530.method3031(0);
        class65.method496(arg0 ^ 0xFFFFF79B);
        class332.method1954(arg0 + 23060);
        class105.method724(255);
        class664.method3594(arg0 ^ 0xFFFFFF99);
        class213.method1299(-127);
        class722.method3995(false);
        class476.method2787(true);
        class421.method2500(arg0 ^ 0xFFFFFFED);
        class177.method1087((byte) 49);
        class2.method5(true);
        class469.method2762(-13741);
        class68.method519(-109);
        class561.method3172((byte) -125);
        class241.method1502(true);
        class211.method1288(0);
        class585.method3259((byte) 32);
        class358.method2198(6762);
        class396.method2359((byte) 1);
        class670.method3620(arg0 + 103);
        class118.method791(false);
        class604.method3323(1201463721);
        class736.method4121(~arg0);
        class107.method733(5);
        class223.method1444(-100);
        class505.method2916(-25690);
        class444.method2612(true);
        class669.method3618(-89);
        class101.method676((byte) 59);
        class190.method1201(arg0 + 100);
        class204.method1264(true);
        class439.method2593(true);
        class569.method3203(63);
        class741.method4159(arg0 ^ 0x6);
        class267.method1606(4);
        class565.method3190(255);
        class663.method3589(arg0 ^ 0xFFFFFFE6);
        class420.method2496(arg0 + 357);
        class86.method602(-16777216);
        class258.method1571(5);
        class568.method3198(124);
        class13.method185(-1);
        class138.method864(arg0 ^ 0xFFFF8DF0);
        class170.method1061(9316);
        class524.method3010(7);
        class36.method319((byte) -10);
        class295.method1764(1000000);
        class87.method609(-1);
        class61.method476((byte) 35);
        class382.method2302(47);
        class288.method1727(118);
        class720.method3991((byte) -9);
        class62.method481((byte) 74);
        class535.method3044();
        class390.method2326(6);
        class364.method2247(1);
        class113.method766(arg0 ^ 0xFFFFE77E);
        class140.method866((byte) 120);
        class703.method3898((byte) -109);
        class598.method3302(arg0 + 28);
        class293.method1755(-10313);
        class694.method3866(-17044);
        class477.method2794(true);
        class394.method2348(107);
        class739.method4141(31285);
        class612.method3343(arg0 + 11750);
        class673.method3628(-84);
        class588.method3269(-1699840479);
        class206.method1273((byte) 111);
        class740.method4157();
        class676.method3635(0);
        class37.method327((byte) 44);
        class474.method2782();
        class732.method4085();
        class6.method28(arg0 ^ 0x64);
        class726.method4026((byte) 76);
        class549.method3131();
        class398.method2362((byte) 67);
        class715.method3969(1812);
        class523.method3007(101);
        class529.method3025((byte) -111);
        class109.method750(-81);
        class95.method649(88);
        class491.method2862((byte) 122);
        class707.method3912(-14041);
        class199.method1243(118);
        class89.method623((byte) -62);
        class619.method3396(false);
        class508.method2935(1);
        class289.method1732(25);
        class374.method2274(true);
        class198.method1242(arg0 - 10589);
        class82.method584(arg0 ^ 0xFFFFC35E);
        class754.method4200(2);
        class212.method1291();
        class22.method233(arg0 + 101);
        class324.method1915((byte) -117);
        class659.method3577(10);
        class593.method3293(-18429);
        class744.method4164((byte) 95);
        class638.method3461(-62);
        class260.method1579(1);
        class560.method3166((byte) 10);
        class44.method365((byte) -101);
        class368.method2263((byte) -56);
        class363.method2243(arg0 + 192);
        class272.method1633((byte) -73);
        class641.method3488(-100);
        class131.method837(3);
        class325.method1920((byte) 121);
        class528.method3023(0);
        class306.method1803(-1);
        class625.method3417((byte) 47);
        class443.method2605(100);
        class737.method4133(false);
        class39.method334(arg0 ^ 0x64);
        class336.method1969(arg0 ^ 0x5C7F);
        class357.method2113((byte) -36);
        class682.method3697(11207);
        class317.method1859(arg0 ^ 0xFFFFFF9B);
        class270.method1619(arg0 ^ 0xFFFFBF9A);
        class688.method3849(-1);
        class172.method1070(arg0 ^ 0xFFFFFFF0);
        class504.method2903((byte) -40);
        class411.method2434((byte) -85);
        class185.method1182((byte) -46);
        class66.method498((byte) -118);
        class77.method561((byte) 100);
        class403.method2391(6988);
        class88.method614(109);
        class552.method3143(-493833480);
        class684.method3768(false);
        class453.method2655((byte) 61);
        class240.method1496((byte) -99);
        class462.method2737(16598);
        class43.method363((byte) 127);
        class354.method2105(1);
        class115.method782((byte) 118);
        class384.method2307((byte) -72);
        class465.method2749(-104);
        class222.method1441((byte) -88);
        class657.method3569(0);
        class613.method3362(-16383);
        class610.method3339(true);
        class506.method2927((byte) -2);
        class580.method3236((byte) -97);
        class734.method4107(arg0 ^ 0xFFFFFF9B);
        class399.method2364((byte) -114);
        class221.method1402(arg0 ^ 0x3B);
        class262.method1585(-126);
        class564.method3183();
        class449.method2646(115);
        class71.method528(true);
        class738.method4136((byte) 99);
        class252.method1532(15887);
        class540.method3076(true);
        class689.method3857((byte) -102);
        class480.method2809(16);
        class503.method2898((byte) 48);
        class274.method1644((byte) -9);
        class437.method2580(2048);
        class14.method187(16384);
        class541.method3078((byte) 13);
        class298.method1769((byte) 85);
        class626.method3421(-21418);
        class537.method3061(4477);
        class335.method1958(false);
        class83.method588(arg0 + 5);
        class589.method3273(-1);
        class706.method3908(0);
        class159.method987((byte) -123);
        class186.method1189(16702);
        class674.method3629(arg0 ^ 0xFFFFAFAD);
        class244.method1514(-1);
        class704.method3903(32767);
        class730.method4077(-44);
        class538.method3063(0);
        class527.method3020(arg0 - 12);
        class516.method2962((byte) -111);
        class488.method2856((byte) 123);
        class20.method218(4);
        class104.method723();
        class276.method1654(true);
        class210.method1286(false);
        class111.method754(0);
        class652.method3518(false);
        class661.method3584((byte) 26);
        class84.method596(-22205);
        class468.method2760(65);
        class714.method3963(-47);
        class679.method3648((byte) 100);
        class584.method3254(arg0 ^ 0xFFFFFF9B);
        class74.method542((byte) -12);
        class636.method3453((byte) -104);
        class489.method2859((byte) -90);
        class137.method852(0);
        class567.method3196((byte) -93);
        class30.method302((byte) 127);
        class8.method36(186874064);
        class479.method2806((byte) -78);
        class553.method3146((byte) -73);
        class458.method2684((byte) 11);
        class327.method1938(7833);
        class643.method3493(arg0 ^ 0x47AC);
        class134.method846(0);
        class570.method3205(-1);
        class406.method2408(-1);
        class268.method1610(-32028);
        class562.method3173((byte) -125);
        class581.method3239(-12398);
        class292.method1752(50);
        class545.method3096((byte) 69);
        class745.method4165((byte) 127);
        class300.method1772(-5975);
        class51.method426((byte) 90);
        class3.method11(false);
        class692.method3861((byte) 127);
        class590.method3279((byte) 102);
        class631.method3433(119);
        class721.method3992(71);
        class495.method2878(arg0 - 3);
        class162.method1004(-118);
        class120.method793(6728);
        class130.method833((byte) 67);
        class507.method2931(arg0 ^ 0xFFFFFFD2);
        class251.method1528(0);
        class154.method962(3);
        class573.method3220((byte) 102);
        class378.method2293(2);
        class441.method2602(-1);
        class571.method3210(1);
        class165.method1016(90);
        class263.method1588((byte) -117);
        class168.method1055((byte) -96);
        class409.method2422(4096);
        class102.method686((byte) -90);
        class229.method1464(arg0 + 109);
        class279.method1673(-29280);
        class304.method1790(-17222);
        if (arg0 != -101) {
            return;
        }
        class46.method382(3314);
        class517.method2967(true);
        class405.method2401(-121);
        class502.method2896((byte) -47);
        class333.method1955((byte) -125);
        class171.method1067(true);
        class127.method817(-1);
        class493.method2870((byte) -104);
        class216.method1306(false);
        class40.method338((byte) 103);
        class743.method4163(-12089);
        class753.method4199((byte) -116);
        class447.method2639(arg0 + 101);
        class397.method2360(arg0 ^ 0x64);
        class205.method1268(arg0 + 356);
        class315.method1850((byte) 118);
        class345.method2024(1);
        class373.method2271((byte) -24);
        class248.method1520(-27444);
        class64.method488((byte) 52);
        class283.method1699(27);
        class303.method1783((byte) 56);
        class463.method2744(0);
        class414.method2455((byte) -123);
        class760.method4229(-16777216);
        class264.method1593(27);
        class189.method1200(21154);
        class110.method751((byte) 102);
        class359.method2203(-20633);
        class718.method3984(30686);
        class261.method1580(false);
        class587.method3268((byte) 24);
        class511.method2938(0);
        class235.method1475((byte) -83);
        class606.method3325(arg0 + 101);
        class557.method3161(false);
        class278.method1664((byte) -117);
        class751.method4197(2);
        class419.method2495(48);
        class7.method33(true);
        class181.method1160((byte) 54);
        class492.method2865(-117);
        class393.method2344(-48);
        class367.method2254(-5);
        class519.method2978((byte) -87);
        class601.method3312(-61440);
        class4.method15(200);
        class273.method1638((byte) 5);
        class756.method4205(-103);
        class379.method2295(16711935);
        class710.method3921(5);
        class322.method1899((byte) 51);
        class728.method4034(0);
        class372.method2270(111);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method703(int arg0) {
        field1270++;
        if (class101.field1243.field10263 > class354.field4734) {
            class575.field8035.method1193((byte) -68);
            class211.field2695 = (class101.field1243.field10263 - 1) * 5 * 50;
            if (class211.field2695 > 3000) {
                class211.field2695 = 3000;
            }
            if (class101.field1243.field10263 >= 2 && class101.field1243.field10265 == 6) {
                this.method2059(false, "js5connect_outofdate");
                class668.field9150 = 14;
                return;
            }
            if (class101.field1243.field10263 >= 4 && class101.field1243.field10265 == -1) {
                this.method2059(false, "js5crc");
                class668.field9150 = 14;
                return;
            }
            if (class101.field1243.field10263 >= 4 && class77.method562(class668.field9150, true)) {
                if (class101.field1243.field10265 == 7 || class101.field1243.field10265 == 9) {
                    this.method2059(false, "js5connect_full");
                } else if (class101.field1243.field10265 <= 0) {
                    this.method2059(false, "js5io");
                } else if (class685.field9704 == null) {
                    this.method2059(false, "js5connect");
                } else {
                    this.method2059(false, "js5proxy_" + class685.field9704.trim());
                }
                class668.field9150 = 14;
                return;
            }
        }
        class354.field4734 = class101.field1243.field10263;
        if (class211.field2695 > 0) {
            class211.field2695--;
            return;
        }
        try {
            if (class140.field1664 == 0) {
                class704.field9936 = class575.field8035.method1192((byte) 101, class681.field9312);
                class140.field1664++;
            }
            if (arg0 == 5) {
                if (class140.field1664 == 1) {
                    if (class704.field9936.field6124 == 2) {
                        if (class704.field9936.field6123 != null) {
                            class685.field9704 = (String) class704.field9936.field6123;
                        }
                        this.method701(1000, false);
                        return;
                    }
                    if (class704.field9936.field6124 == 1) {
                        class140.field1664++;
                    }
                }
                if (class140.field1664 == 2) {
                    class70.field951 = new class5((Socket) class704.field9936.field6123, class681.field9312, 25000);
                    class179 var2 = new class179(5);
                    var2.method1141(class283.field3599.field2536, arg0 + 37);
                    var2.method1112(636, -119);
                    class70.field951.method25(var2.field2325, 5, 0, 0);
                    class140.field1664++;
                    class358.field5110 = class97.method654((byte) 97);
                }
                if (class140.field1664 == 3) {
                    if (class77.method562(class668.field9150, true) || class70.field951.method21(0) > 0) {
                        int var3 = class70.field951.method19(arg0 ^ 0x20E);
                        if (var3 != 0) {
                            this.method701(var3, false);
                            return;
                        }
                        class140.field1664++;
                    } else if (class97.method654((byte) 89) - class358.field5110 > 30000L) {
                        this.method701(1001, false);
                        return;
                    }
                }
                if (class140.field1664 == 4) {
                    boolean var4 = class77.method562(class668.field9150, true) || class374.method2276(false, class668.field9150) || class189.method1198(class668.field9150, -126);
                    class539[] var5 = class539.method3067((byte) 126);
                    class179 var6 = new class179(var5.length * 4);
                    class70.field951.method20(var6.field2325.length, 0, var6.field2325, (byte) -124);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method3070(arg0 ^ 0x5, var6.method1095((byte) 117));
                    }
                    class101.field1243.method4102(!var4, class70.field951, 1022);
                    class140.field1664 = 0;
                    class704.field9936 = null;
                    class70.field951 = null;
                }
            }
        } catch (IOException var8) {
            this.method701(1002, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method704() {
        int var0 = class627.field8745;
        int[] var1 = class274.field3465;
        int var2 = class286.field3630 ? var0 : class443.field6200 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class24 var4;
            if (var3 < var0) {
                var4 = class447.field6287[var1[var3]];
            } else {
                var4 = ((class247) class563.field7875.method3248((long) class61.field832[var3 - var0], 0)).field3158;
            }
            if (var4.field422 >= 0) {
                int var5 = var4.method253((byte) -27);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5790 & 0x1FF) == 0 && (var4.field5784 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field5790 & 0x1FF) == 256 && (var4.field5784 & 0x1FF) == 256) {
                    continue;
                }
                var4.field5791 = class592.method3287(false, var4.field5784, var4.field5779, var4.field5790);
                class264.method1594(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method705(int arg0) {
        int var1 = class627.field8745;
        int[] var2 = class274.field3465;
        int var3 = class286.field3630 ? var1 : class443.field6200 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            if (var4 < var1) {
                var5 = class447.field6287[var2[var4]];
            } else {
                var5 = ((class247) class563.field7875.method3248((long) class61.field832[var4 - var1], 0)).field3158;
            }
            if (var5.field5779 == arg0) {
                var5.field328 = 0;
                if (var5.field422 < 0) {
                    var5.field417 = false;
                } else {
                    int var6 = var5.method253((byte) -27);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5790 & 0x1FF) != 0 || (var5.field5784 & 0x1FF) != 0) {
                            var5.field417 = false;
                            continue;
                        }
                    } else if ((var5.field5790 & 0x1FF) != 256 || (var5.field5784 & 0x1FF) != 256) {
                        var5.field417 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5790 >> 9;
                        int var8 = var5.field5784 >> 9;
                        if (class470.field6753[var7][var8] != var5.field422) {
                            var5.field417 = true;
                            continue;
                        }
                        if (class706.field9951[var7][var8] > 1) {
                            var10002 = class706.field9951[var7][var8]--;
                            var5.field417 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field5790 - var9 >> 9;
                        int var11 = var5.field5784 - var9 >> 9;
                        int var12 = var5.field5790 + var9 >> 9;
                        int var13 = var5.field5784 + var9 >> 9;
                        if (!class241.method1501(var10, var5.field422, (byte) 80, var13, var12, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class470.field6753[var14][var15] == var5.field422) {
                                        var10002 = class706.field9951[var14][var15]--;
                                    }
                                }
                            }
                            var5.field417 = true;
                            continue;
                        }
                    }
                    var5.field417 = false;
                    var5.field5791 = class592.method3287(false, var5.field5784, var5.field5779, var5.field5790);
                    class264.method1594(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method706() {
        class167.field2154 = 0;
        for (int var0 = 0; var0 < class443.field6200; var0++) {
            class124 var1 = ((class247) class563.field7875.method3248((long) class61.field832[var0], 0)).field3158;
            if (var1.field417 && var1.method250((byte) -31) != -1) {
                int var2 = (var1.method253((byte) -27) - 1) * 256 + 252;
                int var3 = var1.field5790 - var2 >> 9;
                int var4 = var1.field5784 - var2 >> 9;
                class24 var5 = class51.method425(var4, var1.field5779, var3, (byte) 90);
                if (var5 != null) {
                    int var6 = var5.field354;
                    if (var5 instanceof class124) {
                        var6 += 2048;
                    }
                    if (var5.field328 == 0 && var5.method250((byte) -79) != -1) {
                        class58.field818[class167.field2154] = var6;
                        class557.field7804[class167.field2154] = var6;
                        class167.field2154++;
                        var5.field328++;
                    }
                    class58.field818[class167.field2154] = var6;
                    class557.field7804[class167.field2154] = var1.field354 + 2048;
                    class167.field2154++;
                    var5.field328++;
                }
            }
        }
        class34.method313(class557.field7804, class167.field2154 - 1, class58.field818, 79, 0);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method707() {
        int var0 = class627.field8745;
        int[] var1 = class274.field3465;
        int var2 = class223.field2944.field620.method225((byte) -123);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class546 var14 = class447.field6287[var1[var4]];
            if (!var14.method3102(-1)) {
                var14.field422 = -1;
            } else if (var14.field7654) {
                var14.field422 = -1;
            } else {
                var14.method246((byte) 121);
                if (var14.field6321 >= 0 && var14.field6328 >= 0 && var14.field6322 < class613.field8591 && var14.field6324 < class1.field3) {
                    var14.field7670 = var14.field313 ? var3 : false;
                    if (class339.field4374 == var14) {
                        var14.field422 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field417) {
                            var15++;
                        }
                        if (var14.field375 > class266.field3368) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method253((byte) -27) << 2);
                        if (var14.field7677) {
                            var16 += 512;
                        } else {
                            if (class460.field6597 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field422 = var16 + 1;
                    }
                } else {
                    var14.field422 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class443.field6200; var5++) {
            class124 var11 = ((class247) class563.field7875.method3248((long) class61.field832[var5], 0)).field3158;
            if (var11.method810(-1) && var11.field1486.method974(class461.field6637, (byte) -49)) {
                var11.method246((byte) 125);
                if (var11.field6321 >= 0 && var11.field6328 >= 0 && var11.field6322 < class613.field8591 && var11.field6324 < class1.field3) {
                    int var12 = 0;
                    if (!var11.field417) {
                        var12++;
                    }
                    if (var11.field375 > class266.field3368) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method253((byte) -27) << 2);
                    if (class460.field6597 == 0) {
                        if (var11.field1486.field1918) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class460.field6597 == 1) {
                        if (var11.field1486.field1918) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field1486.field1896) {
                        var13 += 1024;
                    } else if (!var11.field1486.field1893) {
                        var13 += 256;
                    }
                    var11.field422 = var13 + 1;
                } else {
                    var11.field422 = -1;
                }
            } else {
                var11.field422 = -1;
            }
        }
        for (int var6 = 0; var6 < class498.field7043.length; var6++) {
            class126 var7 = class498.field7043[var6];
            if (var7 != null) {
                if (var7.field1507 == 1) {
                    class247 var8 = (class247) class563.field7875.method3248((long) var7.field1515, 0);
                    if (var8 != null) {
                        class124 var9 = var8.field3158;
                        if (var9.field422 >= 0) {
                            var9.field422 += 2048;
                        }
                    }
                } else if (var7.field1507 == 10) {
                    class546 var10 = class447.field6287[var7.field1515];
                    if (var10 != null && class339.field4374 != var10 && var10.field422 >= 0) {
                        var10.field422 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method708(byte arg0) {
        field1275++;
        if (arg0 != 79) {
            this.method703(75);
        }
        boolean var2 = class101.field1243.method4092(true);
        if (!var2) {
            this.method703(5);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgaa;IIIIIIIIIII)V")
    public static final void method709(class460[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class460 var13 = arg0[var12];
            if (var13 != null && var13.field6528 == arg1) {
                int var14 = var13.field6572 + arg6;
                int var15 = var13.field6543 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field6483 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field6566 + var14;
                    int var21 = var13.field6514 + var15;
                    if (var13.field6483 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field6483 == 0 || var13.field6596 || method715(var13).field465 != 0 || class333.field4299 == var13 || class102.field1259 == var13.field6506 || class37.field552 == var13.field6506) {
                    if (!method698(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class107.field1323) {
                            var22 = class173.method1075(-85);
                            var23 = class203.method1259((byte) 119);
                        }
                        if (class85.field1090 == var13 && class364.method2248(class85.field1090, 1) != null) {
                            class513.field7225 = true;
                            class480.field6853 = var14;
                            class718.field10128 = var15;
                        }
                        if (var13.field6485 || var16 < var18 && var17 < var19) {
                            if (var13.field6570 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class575 var24 = (class575) class278.field3517.method3111(90); var24 != null; var24 = (class575) class278.field3517.method3116(-58)) {
                                    if (var24.field8026) {
                                        var24.method3426((byte) -109);
                                        var24.field8028.field6602 = false;
                                    }
                                }
                                if (class295.field3840 == 0) {
                                    class85.field1090 = null;
                                    class333.field4299 = null;
                                }
                                class598.field8294 = 0;
                                class492.field6969 = false;
                                class130.field1563 = false;
                                if (!class322.field4113) {
                                    class240.method1499(107);
                                }
                            }
                            boolean var25;
                            if (class402.field5566.method2337(-115) + var22 >= var16 && class402.field5566.method2336((byte) 73) + var23 >= var17 && class402.field5566.method2337(-111) + var22 < var18 && class402.field5566.method2336((byte) 110) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class138.field1656 && var25) {
                                if (var13.field6627 >= 0) {
                                    class105.field1289 = var13.field6627;
                                } else if (var13.field6570) {
                                    class105.field1289 = -1;
                                }
                            }
                            if (!class322.field4113 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class85.method599(arg10 - var14, -112, arg11 - var15, var13);
                            }
                            boolean var26 = false;
                            if (class402.field5566.method2338((byte) 92) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class283 var28 = (class283) class679.field9210.method3111(94);
                            if (var28 != null && var28.method1701(12) == 0 && var28.method1702((byte) -116) + var22 >= var16 && var28.method1706(true) + var23 >= var17 && var28.method1702((byte) -119) + var22 < var18 && var28.method1706(true) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field6471 != null && !class64.method490((byte) 42)) {
                                for (int var29 = 0; var29 < var13.field6471.length; var29++) {
                                    if (class333.field4297.method2924(-30303, var13.field6471[var29])) {
                                        if (var13.field6547 == null || class266.field3368 >= var13.field6547[var29]) {
                                            byte var30 = var13.field6555[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class333.field4297.method2924(-30303, 86) && !class333.field4297.method2924(-30303, 82) && !class333.field4297.method2924(-30303, 81)) && ((var30 & 0x2) == 0 || class333.field4297.method2924(-30303, 86)) && ((var30 & 0x1) == 0 || class333.field4297.method2924(-30303, 82)) && ((var30 & 0x4) == 0 || class333.field4297.method2924(-30303, 81))) {
                                                if (var29 < 10) {
                                                    class107.method738(var13.field6524, var29 + 1, -53, "", -1);
                                                } else if (var29 == 10) {
                                                    class463.method2742((byte) 88);
                                                    class28 var31 = method715(var13);
                                                    class758.method4216(var31.field466, -11302, var13, var31.method291(93));
                                                    class556.field7800 = class58.method456(5, var13);
                                                    if (class556.field7800 == null) {
                                                        class556.field7800 = "Null";
                                                    }
                                                    class741.field10370 = var13.field6576 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field6529[var29];
                                                if (var13.field6547 == null) {
                                                    var13.field6547 = new int[var13.field6471.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field6547[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field6547[var29] = class266.field3368 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field6547 != null) {
                                        var13.field6547[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class135.method847(var22 + var28.method1702((byte) -108) - var14, var23 + var28.method1706(true) - var15, var13, 0);
                            }
                            if (class85.field1090 != null && class85.field1090 != var13 && var25 && method715(var13).method290((byte) -113)) {
                                class33.field519 = var13;
                            }
                            if (class333.field4299 == var13) {
                                class424.field6048 = true;
                                class263.field3335 = var14;
                                class374.field5258 = var15;
                            }
                            if (var13.field6596 || var13.field6506 != 0) {
                                if (var25 && class8.field90 != 0 && var13.field6505 != null) {
                                    class575 var33 = new class575();
                                    var33.field8026 = true;
                                    var33.field8028 = var13;
                                    var33.field8022 = class8.field90;
                                    var33.field8027 = var13.field6505;
                                    class278.field3517.method3110(var33, 1);
                                }
                                if (class85.field1090 != null || class322.field4113 || class266.field3376 != var13.field6506 && class598.field8294 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field6506 != 0) {
                                    if (class294.field3836 == var13.field6506 || class187.field2458 == var13.field6506) {
                                        class14.field200 = var13;
                                        if (class219.field2786 != null) {
                                            class219.field2786.method2483(class458.field6407, var13.field6514, (byte) 61);
                                        }
                                        if (class294.field3836 == var13.field6506) {
                                            if (class322.field4113 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class534.method3039(arg9, (byte) 121, arg8, class458.field6407);
                                            class144 var34 = (class144) class488.field6950.method1839(-118);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field1713 && arg10 < var34.field1716 && arg11 >= var34.field1715 && arg11 < var34.field1710) {
                                                    class240.method1499(105);
                                                    class248.method1521(var34.field1714, (byte) 119);
                                                }
                                                var34 = (class144) class488.field6950.method1836((byte) -26);
                                            }
                                        }
                                    }
                                    if (class102.field1259 == var13.field6506) {
                                        if (var13.method2702(class458.field6407, 75) == null || class67.field886 != 0 && class67.field886 != 3 || class322.field4113 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field6511[var36];
                                        if (var35 < var37 || var35 > var13.field6585[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field6566 / 2;
                                        int var39 = var36 - var13.field6514 / 2;
                                        int var40;
                                        if (class276.field3497 == 4) {
                                            var40 = (int) class748.field10471 & 0x3FFF;
                                        } else {
                                            var40 = (int) class748.field10471 + class10.field112 & 0x3FFF;
                                        }
                                        int var41 = class138.field1644[var40];
                                        int var42 = class138.field1645[var40];
                                        if (class276.field3497 != 4) {
                                            var41 = (class3.field16 + 256) * var41 >> 8;
                                            var42 = (class3.field16 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class276.field3497 == 4) {
                                            var45 = (class324.field4135 >> 9) + (var43 >> 2);
                                            var46 = (class418.field5941 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class339.field4374.method253((byte) -27) - 1) * 256;
                                            var45 = (class339.field4374.field5790 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class339.field4374.field5784 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class138.field1656 && (class337.field4352 & 0x40) != 0) {
                                            class460 var48 = class611.method3340(class210.field2693, class545.field7651, -115);
                                            if (var48 == null) {
                                                class463.method2742((byte) 88);
                                            } else {
                                                class425.method2528(10, " ->", var13.field6556, true, 43, (long) (var13.field6601 << 0 | var13.field6524), class556.field7800, 1L, false, var45, var46, true, class586.field8192);
                                            }
                                            continue;
                                        }
                                        if (class737.field10321 == class702.field9902) {
                                            class425.method2528(49, "", -1, true, -120, 0L, class586.field8152.method3261(class416.field5920, (byte) 82), 1L, false, var45, var46, true, -1);
                                        }
                                        class425.method2528(48, "", -1, true, -96, 0L, class364.field5167, 1L, false, var45, var46, true, class548.field7736);
                                        continue;
                                    }
                                    if (class266.field3376 == var13.field6506) {
                                        class412.field5821 = var13;
                                        if (var25) {
                                            class492.field6969 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1702((byte) -67) - var14 - var13.field6566 / 2) * 2.0D / (double) class341.field4413);
                                            int var50 = (int) (-((double) (var23 + var28.method1706(true) - var15 - var13.field6514 / 2) * 2.0D / (double) class341.field4413));
                                            int var51 = class513.field7232 + var49 + class341.field4441;
                                            int var52 = class758.field10552 + var50 + class341.field4442;
                                            class377 var53 = class108.method744((byte) -127);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method2287(var51, var52, var54, (byte) -60);
                                            if (var54 != null) {
                                                if (class333.field4297.method2924(-30303, 82) && class408.field5753 > 0) {
                                                    class311.method1815(var54[1], 63, var54[0], var54[2]);
                                                    continue;
                                                }
                                                class130.field1563 = true;
                                                class480.field6856 = var54[0];
                                                class607.field8421 = var54[1];
                                                class197.field2535 = var54[2];
                                            }
                                            class598.field8294 = 1;
                                            class26.field439 = false;
                                            class175.field2276 = class402.field5566.method2337(-124);
                                            class539.field7595 = class402.field5566.method2336((byte) 40);
                                            continue;
                                        }
                                        if (var26 && class598.field8294 > 0) {
                                            if (class598.field8294 == 1 && (class175.field2276 != class402.field5566.method2337(-127) || class539.field7595 != class402.field5566.method2336((byte) 109))) {
                                                class252.field3191 = class513.field7232;
                                                class486.field6910 = class758.field10552;
                                                class598.field8294 = 2;
                                            }
                                            if (class598.field8294 == 2) {
                                                class26.field439 = true;
                                                class466.method2755(true, class252.field3191 + (int) ((double) (class175.field2276 - class402.field5566.method2337(-121)) * 2.0D / (double) class341.field4414));
                                                class688.method3851(class486.field6910 - (int) ((double) (class539.field7595 - class402.field5566.method2336((byte) 66)) * 2.0D / (double) class341.field4414), (byte) 80);
                                            }
                                            continue;
                                        }
                                        if (class598.field8294 > 0 && !class26.field439) {
                                            if ((class548.field7734 == 1 || class292.method1751((byte) 103)) && class573.field8011 > 2) {
                                                class730.method4080(class175.field2276, class539.field7595, 14284);
                                            } else if (class310.method1809((byte) -46)) {
                                                class730.method4080(class175.field2276, class539.field7595, 14284);
                                            }
                                        }
                                        class598.field8294 = 0;
                                        continue;
                                    }
                                    if (class441.field6187 == var13.field6506) {
                                        if (var26) {
                                            class616.method3384((byte) 126, var13.field6566, var22 + class402.field5566.method2337(-111) - var14, var13.field6514, var23 + class402.field5566.method2336((byte) 85) - var15);
                                        }
                                        continue;
                                    }
                                    if (class37.field552 == var13.field6506) {
                                        class460.method2700(var13, var15, var14, -5);
                                        continue;
                                    }
                                }
                                if (!var13.field6482 && var27) {
                                    var13.field6482 = true;
                                    if (var13.field6607 != null) {
                                        class575 var55 = new class575();
                                        var55.field8026 = true;
                                        var55.field8028 = var13;
                                        var55.field8021 = var22 + var28.method1702((byte) -102) - var14;
                                        var55.field8022 = var23 + var28.method1706(true) - var15;
                                        var55.field8027 = var13.field6607;
                                        class278.field3517.method3110(var55, 1);
                                    }
                                }
                                if (var13.field6482 && var26 && var13.field6595 != null) {
                                    class575 var56 = new class575();
                                    var56.field8026 = true;
                                    var56.field8028 = var13;
                                    var56.field8021 = var22 + class402.field5566.method2337(-111) - var14;
                                    var56.field8022 = var23 + class402.field5566.method2336((byte) 123) - var15;
                                    var56.field8027 = var13.field6595;
                                    class278.field3517.method3110(var56, 1);
                                }
                                if (var13.field6482 && !var26) {
                                    var13.field6482 = false;
                                    if (var13.field6614 != null) {
                                        class575 var57 = new class575();
                                        var57.field8026 = true;
                                        var57.field8028 = var13;
                                        var57.field8021 = var22 + class402.field5566.method2337(-126) - var14;
                                        var57.field8022 = var23 + class402.field5566.method2336((byte) 79) - var15;
                                        var57.field8027 = var13.field6614;
                                        class393.field5486.method3110(var57, 1);
                                    }
                                }
                                if (var26 && var13.field6478 != null) {
                                    class575 var58 = new class575();
                                    var58.field8026 = true;
                                    var58.field8028 = var13;
                                    var58.field8021 = var22 + class402.field5566.method2337(-115) - var14;
                                    var58.field8022 = var23 + class402.field5566.method2336((byte) 78) - var15;
                                    var58.field8027 = var13.field6478;
                                    class278.field3517.method3110(var58, 1);
                                }
                                if (!var13.field6602 && var25) {
                                    var13.field6602 = true;
                                    if (var13.field6467 != null) {
                                        class575 var59 = new class575();
                                        var59.field8026 = true;
                                        var59.field8028 = var13;
                                        var59.field8021 = var22 + class402.field5566.method2337(-115) - var14;
                                        var59.field8022 = var23 + class402.field5566.method2336((byte) 19) - var15;
                                        var59.field8027 = var13.field6467;
                                        class278.field3517.method3110(var59, 1);
                                    }
                                }
                                if (var13.field6602 && var25 && var13.field6517 != null) {
                                    class575 var60 = new class575();
                                    var60.field8026 = true;
                                    var60.field8028 = var13;
                                    var60.field8021 = var22 + class402.field5566.method2337(-119) - var14;
                                    var60.field8022 = var23 + class402.field5566.method2336((byte) 93) - var15;
                                    var60.field8027 = var13.field6517;
                                    class278.field3517.method3110(var60, 1);
                                }
                                if (var13.field6602 && !var25) {
                                    var13.field6602 = false;
                                    if (var13.field6486 != null) {
                                        class575 var61 = new class575();
                                        var61.field8026 = true;
                                        var61.field8028 = var13;
                                        var61.field8021 = var22 + class402.field5566.method2337(-114) - var14;
                                        var61.field8022 = var23 + class402.field5566.method2336((byte) 12) - var15;
                                        var61.field8027 = var13.field6486;
                                        class393.field5486.method3110(var61, 1);
                                    }
                                }
                                if (var13.field6634 != null) {
                                    class575 var62 = new class575();
                                    var62.field8028 = var13;
                                    var62.field8027 = var13.field6634;
                                    class633.field8776.method3110(var62, 1);
                                }
                                if (var13.field6599 != null && class757.field10538 > var13.field6509) {
                                    if (var13.field6578 == null || class757.field10538 - var13.field6509 > 32) {
                                        class575 var67 = new class575();
                                        var67.field8028 = var13;
                                        var67.field8027 = var13.field6599;
                                        class278.field3517.method3110(var67, 1);
                                    } else {
                                        label699: for (int var63 = var13.field6509; var63 < class757.field10538; var63++) {
                                            int var64 = class260.field3303[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field6578.length; var65++) {
                                                if (var13.field6578[var65] == var64) {
                                                    class575 var66 = new class575();
                                                    var66.field8028 = var13;
                                                    var66.field8027 = var13.field6599;
                                                    class278.field3517.method3110(var66, 1);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6509 = class757.field10538;
                                }
                                if (var13.field6465 != null && class610.field8448 > var13.field6582) {
                                    if (var13.field6533 == null || class610.field8448 - var13.field6582 > 32) {
                                        class575 var72 = new class575();
                                        var72.field8028 = var13;
                                        var72.field8027 = var13.field6465;
                                        class278.field3517.method3110(var72, 1);
                                    } else {
                                        label675: for (int var68 = var13.field6582; var68 < class610.field8448; var68++) {
                                            int var69 = class688.field9759[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field6533.length; var70++) {
                                                if (var13.field6533[var70] == var69) {
                                                    class575 var71 = new class575();
                                                    var71.field8028 = var13;
                                                    var71.field8027 = var13.field6465;
                                                    class278.field3517.method3110(var71, 1);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6582 = class610.field8448;
                                }
                                if (var13.field6476 != null && class111.field1369 > var13.field6481) {
                                    if (var13.field6571 == null || class111.field1369 - var13.field6481 > 32) {
                                        class575 var77 = new class575();
                                        var77.field8028 = var13;
                                        var77.field8027 = var13.field6476;
                                        class278.field3517.method3110(var77, 1);
                                    } else {
                                        label651: for (int var73 = var13.field6481; var73 < class111.field1369; var73++) {
                                            int var74 = class13.field187[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field6571.length; var75++) {
                                                if (var13.field6571[var75] == var74) {
                                                    class575 var76 = new class575();
                                                    var76.field8028 = var13;
                                                    var76.field8027 = var13.field6476;
                                                    class278.field3517.method3110(var76, 1);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6481 = class111.field1369;
                                }
                                if (var13.field6626 != null && class416.field5915 > var13.field6518) {
                                    if (var13.field6497 == null || class416.field5915 - var13.field6518 > 32) {
                                        class575 var82 = new class575();
                                        var82.field8028 = var13;
                                        var82.field8027 = var13.field6626;
                                        class278.field3517.method3110(var82, 1);
                                    } else {
                                        label627: for (int var78 = var13.field6518; var78 < class416.field5915; var78++) {
                                            int var79 = class502.field7067[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field6497.length; var80++) {
                                                if (var13.field6497[var80] == var79) {
                                                    class575 var81 = new class575();
                                                    var81.field8028 = var13;
                                                    var81.field8027 = var13.field6626;
                                                    class278.field3517.method3110(var81, 1);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6518 = class416.field5915;
                                }
                                if (var13.field6552 != null && class162.field2066 > var13.field6584) {
                                    if (var13.field6489 == null || class162.field2066 - var13.field6584 > 32) {
                                        class575 var87 = new class575();
                                        var87.field8028 = var13;
                                        var87.field8027 = var13.field6552;
                                        class278.field3517.method3110(var87, 1);
                                    } else {
                                        label603: for (int var83 = var13.field6584; var83 < class162.field2066; var83++) {
                                            int var84 = class739.field10339[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field6489.length; var85++) {
                                                if (var13.field6489[var85] == var84) {
                                                    class575 var86 = new class575();
                                                    var86.field8028 = var13;
                                                    var86.field8027 = var13.field6552;
                                                    class278.field3517.method3110(var86, 1);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field6584 = class162.field2066;
                                }
                                if (class676.field9191 > var13.field6515 && var13.field6548 != null) {
                                    class575 var88 = new class575();
                                    var88.field8028 = var13;
                                    var88.field8027 = var13.field6548;
                                    class278.field3517.method3110(var88, 1);
                                }
                                if (class112.field1379 > var13.field6515 && var13.field6631 != null) {
                                    class575 var89 = new class575();
                                    var89.field8028 = var13;
                                    var89.field8027 = var13.field6631;
                                    class278.field3517.method3110(var89, 1);
                                }
                                if (class363.field5164 > var13.field6515 && var13.field6488 != null) {
                                    class575 var90 = new class575();
                                    var90.field8028 = var13;
                                    var90.field8027 = var13.field6488;
                                    class278.field3517.method3110(var90, 1);
                                }
                                if (class380.field5317 > var13.field6515 && var13.field6594 != null) {
                                    class575 var91 = new class575();
                                    var91.field8028 = var13;
                                    var91.field8027 = var13.field6594;
                                    class278.field3517.method3110(var91, 1);
                                }
                                if (class22.field287 > var13.field6515 && var13.field6574 != null) {
                                    class575 var92 = new class575();
                                    var92.field8028 = var13;
                                    var92.field8027 = var13.field6574;
                                    class278.field3517.method3110(var92, 1);
                                }
                                var13.field6515 = class215.field2727;
                                if (var13.field6553 != null) {
                                    for (int var93 = 0; var93 < class234.field3023; var93++) {
                                        class575 var94 = new class575();
                                        var94.field8028 = var13;
                                        var94.field8029 = class753.field10513[var93].method802(-20069);
                                        var94.field8030 = class753.field10513[var93].method798(-17654);
                                        var94.field8027 = var13.field6553;
                                        class278.field3517.method3110(var94, 1);
                                    }
                                }
                                if (class716.field10094 && var13.field6473 != null) {
                                    class575 var95 = new class575();
                                    var95.field8028 = var13;
                                    var95.field8027 = var13.field6473;
                                    class278.field3517.method3110(var95, 1);
                                }
                            }
                            if (var13.field6483 == 5 && var13.field6559 != -1) {
                                var13.method2696(true, class182.field2384, class696.field9859).method2483(class458.field6407, var13.field6514, (byte) 36);
                            }
                            class108.method742(0, var13);
                            if (var13.field6483 == 0) {
                                method709(arg0, var13.field6524, var16, var17, var18, var19, var14 - var13.field6549, var15 - var13.field6466, arg8, arg9, arg10, arg11);
                                if (var13.field6567 != null) {
                                    method709(var13.field6567, var13.field6524, var16, var17, var18, var19, var14 - var13.field6549, var15 - var13.field6466, arg8, arg9, arg10, arg11);
                                }
                                class157 var96 = (class157) class148.field1802.method3248((long) var13.field6524, 0);
                                if (var96 != null) {
                                    if (class702.field9902 == class400.field5535 && var96.field2027 == 0 && !class322.field4113 && var25 && !class491.field6959) {
                                        class240.method1499(108);
                                    }
                                    class288.method1728(var96.field2028, var16, arg10, (byte) 126, var17, arg9, arg8, var19, arg11, var15, var14, var18);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class108.method742(0, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgaa;)Lgaa;")
    public static final class460 method710(class460 arg0) {
        int var1 = method715(arg0).method285((byte) 113);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class102.method684(5025, arg0.field6528);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method711() {
        for (int var0 = 0; var0 < class613.field8591; var0++) {
            int[] var1 = class470.field6753[var0];
            for (int var2 = 0; var2 < class1.field3; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final synchronized void method712(boolean arg0) {
        field1267++;
        if (class745.field10393 != null && class68.field939 == null && !class681.field9312.field3240) {
            try {
                Class var2 = class745.field10393.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class68.field939 = (Canvas) var3.get(class745.field10393);
                var3.set(class745.field10393, null);
                if (class68.field939 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method712(arg0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        if (class434.field6122) {
            class722.field10162 = 64;
        }
        field1264++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class147.method919((byte) -89);
        class707.field9957 = new class592(class681.field9312);
        class101.field1243 = new class733();
        class166.method1030(arg0 ^ 0x6F85, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (class323.field4120 != class171.field2248) {
            class539.field7597 = new byte[50][];
        }
        class223.field2944 = class23.method243((byte) 38);
        if (class323.field4120 == class171.field2248) {
            class750.field10496.field2460 = this.getCodeBase().getHost();
        } else if (class374.method2275(class323.field4120, 2)) {
            class750.field10496.field2460 = this.getCodeBase().getHost();
            class750.field10496.field2461 = class750.field10496.field2454 + 40000;
            class86.field1102.field2461 = class86.field1102.field2454 + 40000;
            class750.field10496.field2456 = class750.field10496.field2454 + 50000;
            class718.field10125.field2461 = class718.field10125.field2454 + 40000;
            class86.field1102.field2456 = class86.field1102.field2454 + 50000;
            class718.field10125.field2456 = class718.field10125.field2454 + 50000;
        } else if (class323.field4120 == class20.field257) {
            class750.field10496.field2460 = "127.0.0.1";
            class86.field1102.field2460 = "127.0.0.1";
            class750.field10496.field2461 = class750.field10496.field2454 + 40000;
            class718.field10125.field2460 = "127.0.0.1";
            class86.field1102.field2461 = class86.field1102.field2454 + 40000;
            class750.field10496.field2456 = class750.field10496.field2454 + 50000;
            class718.field10125.field2461 = class718.field10125.field2454 + 40000;
            class86.field1102.field2456 = class86.field1102.field2454 + 50000;
            class718.field10125.field2456 = class718.field10125.field2454 + 50000;
        }
        if (class702.field9902 == class400.field5535) {
            class7.field77 = false;
        }
        class575.field8035 = class750.field10496;
        class241.field3110 = class47.field691 = class183.field2407 = class266.field3373 = new short[256];
        if (class737.field10321 == class702.field9902) {
            class20.field259 = true;
            class58.field823 = class498.field7037;
            class205.field2611 = 0;
            class575.field8034 = 16777215;
            class674.field9172 = class431.field6106;
        } else if (class702.field9902 == class219.field2785) {
            class674.field9172 = class443.field6199;
            class58.field823 = class522.field7399;
        } else {
            class674.field9172 = class372.field5236;
            class58.field823 = class657.field9031;
        }
        try {
            class149.field1807 = class612.field8463.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        if (arg0 != 1) {
            this.method714(-75);
        }
        class333.field4297 = class584.method3258(class68.field939, (byte) -120);
        class402.field5566 = class15.method194(true, 107, class68.field939);
        try {
            if (class681.field9312.field3265 != null) {
                class460.field6516 = new class485(class681.field9312.field3265, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class586.field8194[var3] = new class485(class681.field9312.field3248[var3], 6000, 0);
                }
                class65.field875 = new class485(class681.field9312.field3245, 6000, 0);
                class322.field4106 = new class98(255, class460.field6516, class65.field875, 500000);
                class444.field6234 = new class485(class681.field9312.field3253, 24, 0);
                class681.field9312.field3253 = null;
                class681.field9312.field3245 = null;
                class681.field9312.field3248 = null;
                class681.field9312.field3265 = null;
            }
        } catch (IOException var5) {
            class65.field875 = null;
            class322.field4106 = null;
            class460.field6516 = null;
            class444.field6234 = null;
        }
        if (class323.field4120 != class171.field2248) {
            class679.field9225 = true;
        }
        class108.field1330 = class586.field8137.method3261(class416.field5920, (byte) 82);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method714(int arg0) {
        field1278++;
        String var2 = null;
        try {
            var2 = "[1)" + class63.field851 + "," + class753.field10509 + "," + class613.field8591 + "," + class1.field3 + "|";
            if (class339.field4374 != null) {
                var2 = var2 + "2)" + class223.field2946 + "," + (class339.field4374.field435[0] + class63.field851) + "," + (class339.field4374.field426[0] + class753.field10509) + "|";
            }
            var2 = var2 + "3)" + class223.field2944.field633.method4191((byte) -123) + "|4)" + class223.field2944.field618.method1463((byte) -127) + "|5)" + class126.method814((byte) 23) + "|6)" + class599.field8320 + "," + class84.field1083 + "|";
            var2 = var2 + "7)" + class223.field2944.field602.method1676((byte) -128) + "|";
            var2 = var2 + "8)" + class223.field2944.field628.method1256((byte) -126) + "|";
            var2 = var2 + "9)" + class223.field2944.field604.method1060((byte) -120) + "|";
            var2 = var2 + "10)" + class223.field2944.field621.method2399((byte) -122) + "|";
            var2 = var2 + "11)" + class223.field2944.field594.method436((byte) -124) + "|";
            var2 = var2 + "12)" + class223.field2944.field619.method444((byte) -127) + "|";
            var2 = var2 + "13)" + class722.field10162 + "|";
            var2 = var2 + "14)" + class668.field9150;
            if (class241.field3102 != null) {
                var2 = var2 + "|15)" + class241.field3102.field8654;
            }
            try {
                if (arg0 < 15) {
                    return null;
                }
                if (class223.field2944.field633.method4191((byte) -128) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1279 == null ? (field1279 = method720("client")) : field1279).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgaa;)Lbw;")
    public static final class28 method715(class460 arg0) {
        class28 var1 = (class28) class418.field5952.method3248(((long) arg0.field6524 << 32) + (long) arg0.field6601, 0);
        return var1 == null ? arg0.field6617 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
    public static final boolean method716(byte arg0, int arg1, int arg2) {
        field1273++;
        if (arg0 != 112) {
            method710(null);
        }
        if ((class710.method3920(arg1, arg2, -1) | (arg2 & 0x10000) != 0) || class492.method2866(-1, arg1, arg2)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class407.method2411(arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method717(int arg0) {
        int var1 = class627.field8745;
        int[] var2 = class274.field3465;
        for (int var3 = 0; var3 < class443.field6200 + var1; var3++) {
            class24 var4;
            if (var3 < var1) {
                var4 = class447.field6287[var2[var3]];
            } else {
                var4 = ((class247) class563.field7875.method3248((long) class61.field832[var3 - var1], 0)).field3158;
            }
            if (var4.field5779 == arg0 && var4.field422 >= 0) {
                int var5 = var4.method253((byte) -27);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5790 & 0x1FF) != 0 || (var4.field5784 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field5790 & 0x1FF) != 256 || (var4.field5784 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5790 >> 9;
                    int var7 = var4.field5784 >> 9;
                    if (var4.field422 > class470.field6753[var6][var7]) {
                        class470.field6753[var6][var7] = var4.field422;
                        class706.field9951[var6][var7] = 1;
                    } else if (class470.field6753[var6][var7] == var4.field422) {
                        var10002 = class706.field9951[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field5790 - var8 >> 9;
                    int var10 = var4.field5784 - var8 >> 9;
                    int var11 = var4.field5790 + var8 >> 9;
                    int var12 = var4.field5784 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field422 > class470.field6753[var13][var14]) {
                                class470.field6753[var13][var14] = var4.field422;
                                class706.field9951[var13][var14] = 1;
                            } else if (class470.field6753[var13][var14] == var4.field422) {
                                var10002 = class706.field9951[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method718(int arg0) {
        field1274++;
        if (class668.field9150 == 14) {
            return;
        }
        long var2 = class40.method337(true) / 1000000L - class586.field8190;
        class586.field8190 = class40.method337(true) / 1000000L;
        boolean var4 = class48.method388((byte) 70);
        if (var4 && class537.field7549 && class761.field10601 != null) {
            class761.field10601.method1279(-13373);
        }
        if (class327.method1935(-1604, class668.field9150)) {
            if (class728.field10195 != 0L && class97.method654((byte) 110) > class728.field10195) {
                class653.method3523(class81.field1053, class126.method814((byte) 23), -1, class189.field2480, false);
            } else if (!class458.field6407.method152() && class93.field1185) {
                class217.method1315((byte) -101);
            }
        }
        if (class627.field8740 == null) {
            Container var5;
            if (class95.field1205 != null) {
                var5 = class95.field1205;
            } else if (class745.field10393 == null) {
                var5 = class689.field9789;
            } else {
                var5 = class745.field10393;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class95.field1205 == var5) {
                Insets var8 = class95.field1205.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class538.field7556 != var6 || class706.field9947 != var7 || class315.field4051) {
                if (class458.field6407 == null || class458.field6407.method113()) {
                    class147.method919((byte) -74);
                } else {
                    class706.field9947 = var7;
                    class538.field7556 = var6;
                }
                class728.field10195 = class97.method654((byte) 88) + 500L;
                class315.field4051 = false;
            }
        }
        if (class627.field8740 != null && !class758.field10550 && class327.method1935(-1604, class668.field9150)) {
            class653.method3523(-1, class223.field2944.field617.method3243((byte) -127), -1, -1, false);
        }
        boolean var9 = false;
        if (class336.field4342) {
            var9 = true;
            class336.field4342 = false;
        }
        if (var9) {
            class452.method2653(256);
        }
        if (class458.field6407 != null && class458.field6407.method152() || class126.method814((byte) 23) != 1) {
            class728.method4033(-48);
        }
        if (class77.method562(class668.field9150, true)) {
            class465.method2751(true, var9);
        } else if (class536.method3059(class668.field9150, (byte) 49)) {
            class64.method487(0);
        } else if (class711.method3926(9713, class668.field9150)) {
            class64.method487(0);
        } else if (class41.method340(4, class668.field9150)) {
            if (class575.field8033 == 1) {
                if (class455.field6381 < class129.field1558) {
                    class455.field6381 = class129.field1558;
                }
                int var10 = (class455.field6381 - class129.field1558) * 50 / class455.field6381;
                class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82) + "<br>(" + var10 + "%)");
            } else if (class575.field8033 == 2) {
                if (class7.field72 > class496.field7020) {
                    class496.field7020 = class7.field72;
                }
                int var11 = (class496.field7020 - class7.field72) * 50 / class496.field7020 + 50;
                class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82) + "<br>(" + var11 + "%)");
            } else {
                class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82));
            }
        } else if (class668.field9150 == 10) {
            class175.method1081(Integer.MIN_VALUE, var2);
        } else if (class668.field9150 == 13) {
            class760.method4231(false, class619.field8670, class458.field6407, class543.field7644, true, class586.field8139.method3261(class416.field5920, (byte) 82) + "<br>" + class586.field8140.method3261(class416.field5920, (byte) 82));
        }
        if (class286.field3633 == 3) {
            for (int var12 = 0; var12 < class48.field702; var12++) {
                Rectangle var13 = class101.field1238[var12];
                if (class595.field8265[var12]) {
                    class458.field6407.method2659(var13.width, var13.x, var13.height, 0, -65281, var13.y);
                } else if (class6.field69[var12]) {
                    class458.field6407.method2659(var13.width, var13.x, var13.height, arg0, -65536, var13.y);
                } else {
                    class458.field6407.method2659(var13.width, var13.x, var13.height, 0, -16711936, var13.y);
                }
            }
        }
        if (class64.method490((byte) 74)) {
            class23.method245(class458.field6407, 109);
        }
        if (class681.field9312.field3240 && class327.method1935(arg0 - 1604, class668.field9150) && class286.field3633 == 0 && class126.method814((byte) 23) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class48.field702; var17++) {
                if (class6.field69[var17]) {
                    class6.field69[var17] = false;
                    class582.field8084[var16++] = class101.field1238[var17];
                }
            }
            try {
                if (class107.field1323) {
                    class52.method431(var16, -23405, class582.field8084);
                } else {
                    class458.field6407.method2670(class582.field8084, -92, var16);
                }
            } catch (class510 var19) {
            }
        } else if (!class77.method562(class668.field9150, true)) {
            for (int var14 = 0; var14 < class48.field702; var14++) {
                class6.field69[var14] = false;
            }
            try {
                if (class107.field1323) {
                    class11.method54(true);
                } else {
                    class458.field6407.method2662((byte) 127);
                }
            } catch (class510 var20) {
                class486.method2844((byte) -1, var20.getMessage() + " (Recovered) " + this.method714(33), var20);
                class462.method2730(1, false, 0);
            }
        }
        class492.method2868(85);
        int var18 = class223.field2944.field606.method3919((byte) -124);
        if (arg0 == var18) {
            class517.method2965(15L, -107);
        } else if (var18 == 1) {
            class517.method2965(10L, -76);
        } else if (var18 == 2) {
            class517.method2965(5L, -94);
        } else if (var18 == 3) {
            class517.method2965(2L, -90);
        }
        if (class224.field2968) {
            class466.method2756(5);
        }
        if (class223.field2944.field607.method3332((byte) -127) == 1 && class668.field9150 == 3 && class638.field8834 != -1) {
            class223.field2944.method346(class223.field2944.field607, 0, false);
            class252.method1530((byte) 86);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method719(int arg0) {
        field1269++;
        if (class668.field9150 == 7 && class575.field8031 == 0) {
            if (class471.field6763 > 1) {
                class471.field6763--;
                class22.field287 = class215.field2727;
            }
            if (!class322.field4113) {
                class240.method1499(123);
            }
            for (int var2 = 0; var2 < 100 && class100.method674(98); var2++) {
            }
        }
        class591.field8232++;
        class560.method3165(null, 0, -1, -1);
        class460.method2700(null, -1, -1, -5);
        class125.method811(0);
        class215.field2727++;
        for (int var3 = 0; var3 < class676.field9195; var3++) {
            class124 var4 = class38.field559[var3].field3158;
            if (var4 != null) {
                byte var5 = var4.field1486.field1940;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method253((byte) -27);
                    if ((var5 & 0x2) != 0 && var4.field427 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field435[0] + var7;
                            int var10 = var4.field426[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class613.field8591 - var6 - 1) < var9) {
                                var9 = class613.field8591 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class1.field3 - var6 - 1)) {
                                var10 = class1.field3 - var6 - 1;
                            }
                            int var11 = class347.method2036(2, class410.field5786[var4.field5779], var6, var4.field435[0], var6, var6, class2.field9, var4.field426[0], var10, -1, var9, 0, true, class616.field8621, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field435[var12] = class616.field8621[var11 - var12 - 1];
                                    var4.field426[var12] = class2.field9[var11 - var12 - 1];
                                    var4.field428[var12] = 1;
                                }
                                var4.field427 = var11;
                            }
                        }
                    }
                    class572.method3216(true, (byte) -97, var4);
                    int var13 = class515.method2957(var4, (byte) 115);
                    class427.method2534(25342, var4);
                    class92.method635(class363.field5163, class213.field2712, var13, (byte) -11, var4);
                    class612.method3347(class363.field5163, var4, -96);
                    class204.method1262(-81, var4);
                }
            }
        }
        if (class575.field8031 == 0 && class272.field3446 == 0) {
            if (class276.field3497 == 2) {
                class326.method1925((byte) 114);
            } else {
                class603.method3318(true);
            }
            if ((class505.field7134 >> 9) < 14 || class613.field8591 - 14 <= class505.field7134 >> 9 || class407.field5744 >> 9 < 14 || class1.field3 - 14 <= class407.field5744 >> 9) {
                class286.method1711((byte) -100);
            }
        }
        while (true) {
            class575 var14;
            class460 var15;
            class460 var16;
            do {
                var14 = (class575) class633.field8776.method3115(1210318848);
                if (var14 == null) {
                    while (true) {
                        class575 var17;
                        class460 var18;
                        class460 var19;
                        do {
                            var17 = (class575) class393.field5486.method3115(1210318848);
                            if (var17 == null) {
                                while (true) {
                                    class575 var20;
                                    class460 var21;
                                    class460 var22;
                                    do {
                                        var20 = (class575) class278.field3517.method3115(1210318848);
                                        if (var20 == null) {
                                            if (class85.field1090 != null) {
                                                class83.method591(87);
                                            }
                                            if (class266.field3368 % 1500 == 0) {
                                                class609.method3338(101);
                                            }
                                            if (class668.field9150 == 7 && class575.field8031 == 0) {
                                                class160.method989((byte) -36);
                                            }
                                            class540.method3075(31275);
                                            int var23 = -11 / ((44 - arg0) / 32);
                                            if (class125.field1497 && class619.field8676 < (class97.method654((byte) 45) - 60000L)) {
                                                class61.method477(false);
                                            }
                                            for (class248 var24 = (class248) class159.field2044.method1839(41); var24 != null; var24 = (class248) class159.field2044.method1836((byte) -26)) {
                                                if (((long) var24.field3159) < (class97.method654((byte) 127) / 1000L - 5L)) {
                                                    if (var24.field3160 > 0) {
                                                        class673.method3627((byte) -128, "", "", 5, "", 0, var24.field3165 + class586.field8144.method3261(class416.field5920, (byte) 82));
                                                    }
                                                    if (var24.field3160 == 0) {
                                                        class673.method3627((byte) -125, "", "", 5, "", 0, var24.field3165 + class586.field8145.method3261(class416.field5920, (byte) 82));
                                                    }
                                                    var24.method3869(true);
                                                }
                                            }
                                            if (class668.field9150 == 7 && class575.field8031 == 0) {
                                                if (class426.field6057 == null) {
                                                    class650.method3509(false, (byte) -74);
                                                    return;
                                                }
                                                class462.field6704++;
                                                if (class462.field6704 > 50) {
                                                    class696.field9863++;
                                                    class650 var25 = class314.method1837(class572.field7973, true, class625.field8727);
                                                    class108.method745(var25, -36);
                                                }
                                                try {
                                                    class704.method3905((byte) 126);
                                                    return;
                                                } catch (IOException var26) {
                                                    class650.method3509(false, (byte) -74);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field8028;
                                        if (var21.field6601 < 0) {
                                            break;
                                        }
                                        var22 = class102.method684(5025, var21.field6528);
                                    } while (var22 == null || var22.field6567 == null || var22.field6567.length <= var21.field6601 || var22.field6567[var21.field6601] != var21);
                                    class445.method2625(var20);
                                }
                            }
                            var18 = var17.field8028;
                            if (var18.field6601 < 0) {
                                break;
                            }
                            var19 = class102.method684(5025, var18.field6528);
                        } while (var19 == null || var19.field6567 == null || var19.field6567.length <= var18.field6601 || var19.field6567[var18.field6601] != var18);
                        class445.method2625(var17);
                    }
                }
                var15 = var14.field8028;
                if (var15.field6601 < 0) {
                    break;
                }
                var16 = class102.method684(5025, var15.field6528);
            } while (var16 == null || var16.field6567 == null || var16.field6567.length <= var15.field6601 || var16.field6567[var15.field6601] != var15);
            class445.method2625(var14);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method720(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
