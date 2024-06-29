import jagex3.jagmisc.jagmisc;
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
public class client extends class437 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Ldq;")
    public static class493 field2566 = new class493(46, 4);

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljk;")
    public static class449 field2572 = new class449(200);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ldq;")
    public static class493 field2573 = new class493(28, 6);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ldq;")
    public static class493 field2574 = new class493(78, 3);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[C")
    public static char[] field2575 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 11)
    public static void method1222(byte arg0) {
        field2575 = null;
        if (arg0 != -19) {
            method1223(81);
        }
        field2566 = null;
        field2574 = null;
        field2572 = null;
        field2573 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 26)
    public static final void method1223(int arg0) {
        int var1 = class436.field6234;
        int[] var2 = class12.field218;
        int var3 = class427.field6069 ? var1 : class489.field7114 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class375 var5;
            if (var4 < var1) {
                var5 = class387.field5107[var2[var4]];
            } else {
                var5 = class187.field2446[class403.field5735[var4 - var1]];
            }
            if (var5.field2676 == arg0) {
                var5.field4916 = 0;
                if (var5.field4845 < 0) {
                    var5.field4901 = false;
                } else {
                    int var6 = var5.method1366((byte) -94);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2666 & 0x7F) != 0 || (var5.field2677 & 0x7F) != 0) {
                            var5.field4901 = false;
                            continue;
                        }
                    } else if ((var5.field2666 & 0x7F) != 64 || (var5.field2677 & 0x7F) != 64) {
                        var5.field4901 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2666 >> 7;
                        int var8 = var5.field2677 >> 7;
                        if (class300.field3868[var7][var8] != var5.field4845) {
                            var5.field4901 = true;
                            continue;
                        }
                        if (class23.field341[var7][var8] > 1) {
                            var10002 = class23.field341[var7][var8]--;
                            var5.field4901 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field2666 - var9 >> 7;
                        int var11 = var5.field2677 - var9 >> 7;
                        int var12 = var5.field2666 + var9 >> 7;
                        int var13 = var5.field2677 + var9 >> 7;
                        if (!class273.method1613(var10, var11, var12, var5.field4845, 30608, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class300.field3868[var14][var15] == var5.field4845) {
                                        var10002 = class23.field341[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4901 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class223 && var5.field4939 != null && class163.field2065 >= var5.field4939.field6056 && class163.field2065 < var5.field4939.field6055) {
                        ((class223) var5).field2848 = false;
                    }
                    var5.field4901 = false;
                    var5.field2672 = class151.method991(var5.field2677, false, var5.field2676, var5.field2666);
                    class361.method2076(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 145)
    public static final void method1224() {
        int var0 = class436.field6234;
        int[] var1 = class12.field218;
        int var2 = class427.field6069 ? var0 : class489.field7114 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class375 var4;
            if (var3 < var0) {
                var4 = class387.field5107[var1[var3]];
            } else {
                var4 = class187.field2446[class403.field5735[var3 - var0]];
            }
            if (var4.field4845 >= 0) {
                int var5 = var4.method1366((byte) -103);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2666 & 0x7F) == 0 && (var4.field2677 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field2666 & 0x7F) == 64 && (var4.field2677 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class223 && var4.field4939 != null && class163.field2065 >= var4.field4939.field6056 && class163.field2065 < var4.field4939.field6055) {
                    ((class223) var4).field2848 = false;
                }
                var4.field2672 = class151.method991(var4.field2677, false, var4.field2676, var4.field2666);
                class361.method2076(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 191)
    public final void method1225(int arg0) {
        field2561++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class460.method2715((byte) 83);
        class110.field1481 = new class141(class219.field2794);
        class298.field3825 = new class359();
        if (class324.field4107 != class218.field2784) {
            class225.field2872 = new byte[50][];
        }
        class407.field5817 = new class65(class219.field2794);
        if (class324.field4107 == class218.field2784) {
            class443.field6357.field363 = this.getCodeBase().getHost();
        } else if (class500.method3012((byte) -114, class218.field2784)) {
            class443.field6357.field363 = this.getCodeBase().getHost();
            class443.field6357.field362 = class443.field6357.field355 + 40000;
            class382.field5031.field362 = class382.field5031.field355 + 40000;
            class443.field6357.field360 = class443.field6357.field355 + 50000;
            class267.field3387.field362 = class267.field3387.field355 + 40000;
            class382.field5031.field360 = class382.field5031.field355 + 50000;
            class267.field3387.field360 = class267.field3387.field355 + 50000;
        } else if (class218.field2784 == class128.field1703) {
            class443.field6357.field363 = "127.0.0.1";
            class382.field5031.field363 = "127.0.0.1";
            class267.field3387.field363 = "127.0.0.1";
            class443.field6357.field362 = class443.field6357.field355 + 40000;
            class382.field5031.field362 = class382.field5031.field355 + 40000;
            class443.field6357.field360 = class443.field6357.field355 + 50000;
            class267.field3387.field362 = class267.field3387.field355 + 40000;
            class382.field5031.field360 = class382.field5031.field355 + 50000;
            class267.field3387.field360 = class267.field3387.field355 + 50000;
        }
        if (arg0 != 8216) {
            field2566 = null;
        }
        class64.field834 = class443.field6357;
        if (class530.field7803 == class335.field4230) {
            class75.field970 = class8.field74;
            class343.field4394 = class364.field4736;
            class56.field744 = true;
            class401.field5717 = 0;
            class60.field782 = 16777215;
            class24.field353 = class247.field3178;
            class102.field1241 = class101.field1224;
        } else {
            class102.field1241 = class293.field3758;
            class343.field4394 = class211.field2719;
            class24.field353 = class23.field337;
            class75.field970 = class503.field7270;
        }
        if (class530.field7803 == class123.field1653) {
            class301.field3874 = false;
        }
        class534.field7854 = class169.field2167 = class522.field7554 = class254.field3243 = new short[256];
        class343.field4392 = class198.method1249(arg0 ^ 0x3018, class8.field71);
        class204.field2664 = class248.method1505(class8.field71, (byte) -42, true);
        class339.field4259 = class530.method3145(100);
        if (class339.field4259 != null) {
            class339.field4259.method29(class8.field71, 3587);
        }
        class495.field7195 = class476.field6902;
        try {
            if (class219.field2794.field6903 != null) {
                class264.field3332 = new class56(class219.field2794.field6903, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class414.field5899[var3] = new class56(class219.field2794.field6889[var3], 6000, 0);
                }
                class141.field1832 = new class56(class219.field2794.field6901, 6000, 0);
                class411.field5863 = new class412(255, class264.field3332, class141.field1832, 500000);
                class191.field2485 = new class56(class219.field2794.field6907, 24, 0);
                class219.field2794.field6903 = null;
                class219.field2794.field6901 = null;
                class219.field2794.field6907 = null;
                class219.field2794.field6889 = null;
            }
        } catch (IOException var4) {
            class411.field5863 = null;
            class264.field3332 = null;
            class141.field1832 = null;
            class191.field2485 = null;
        }
        if (class324.field4107 != class218.field2784) {
            class394.field5285 = true;
        }
        if (class530.field7803 == class123.field1653) {
            class135.field1745 = class274.field3439.method1936(-26539, class11.field177);
        } else if (class530.field7803 == class335.field4230) {
            class135.field1745 = class451.field6525.method1936(-26539, class11.field177);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhd;)Ljr;", line = 315)
    public static final class73 method1226(class523 arg0) {
        class73 var1 = (class73) class412.field5876.method2022(-1, ((long) arg0.field7723 << 32) + (long) arg0.field7562);
        return var1 == null ? arg0.field7589 : var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 320)
    public final void init() {
        field2565++;
        if (!this.method2565((byte) 38)) {
            return;
        }
        class443.field6357 = new class25();
        class443.field6357.field355 = Integer.parseInt(this.getParameter("worldid"));
        class382.field5031 = new class25();
        class382.field5031.field355 = Integer.parseInt(this.getParameter("lobbyid"));
        class382.field5031.field363 = this.getParameter("lobbyaddress");
        class267.field3387 = new class25();
        class267.field3387.field355 = Integer.parseInt(this.getParameter("demoid"));
        class267.field3387.field363 = this.getParameter("demoaddress");
        class218.field2784 = class116.method839(Integer.parseInt(this.getParameter("modewhere")), true);
        if (!class500.method3012((byte) -114, class218.field2784) && class324.field4107 != class218.field2784) {
            class218.field2784 = class324.field4107;
        }
        class411.field5865 = class50.method513(-8931, Integer.parseInt(this.getParameter("modewhat")));
        if (class438.field6289 != class411.field5865 && class411.field5865 != class191.field2484 && class411.field5865 != class378.field4979) {
            class411.field5865 = class378.field4979;
        }
        try {
            class11.field177 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class11.field177 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class57.field749 = true;
        } else {
            class57.field749 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class295.field3780 = true;
        } else {
            class295.field3780 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class433.field6152 = true;
        } else {
            class433.field6152 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class530.field7803 = class123.field1653;
            } else if (var4.equals("1")) {
                class530.field7803 = class335.field4230;
            }
        }
        try {
            class18.field276 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class18.field276 = 0;
        }
        class244.field3159 = this.getParameter("quiturl");
        class301.field3873 = this.getParameter("settings");
        if (class301.field3873 == null) {
            class301.field3873 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class122.field1632 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class122.field1632 = 0;
            }
        }
        class288.field3682 = Integer.parseInt(this.getParameter("colourid"));
        if (class288.field3682 < 0 || class288.field3682 >= class64.field833.length) {
            class288.field3682 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class249.field3194 = true;
            class115.field1550 = true;
        }
        if (class530.field7803 == class123.field1653) {
            class345.field4426 = 503;
            class470.field6826 = 765;
        } else if (class530.field7803 == class335.field4230) {
            class470.field6826 = 640;
            class345.field4426 = 480;
        }
        class349.field4492 = this;
        this.method2572(-21734, class345.field4426, class411.field5865.method1596(-126) + 32, 593, class470.field6826);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 430)
    public final void method1227(int arg0) {
        if (arg0 != -29156) {
            field2572 = null;
        }
        field2563++;
        try {
            this.method1247((byte) 90);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class53.method525(119, 0);
            class461.method2719(var3, var3.getMessage() + " (Recovered) " + this.method1235(true), arg0 ^ 0xFFFF8E1D);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 454)
    public static final void method1228(int arg0) {
        class498.field7218.method2642(arg0 ^ arg0);
        field2562++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 462)
    public final void method1229(byte arg0) {
        field2568++;
        if (class40.field514) {
            class144.method966(112);
        }
        if (class33.field416 != null) {
            class33.field416.method275((byte) -126);
        }
        if (class24.field347 != null) {
            class122.method868(class24.field347, class219.field2794, 0);
            class24.field347 = null;
        }
        if (class64.field835 != null) {
            class64.field835.method2473(10228);
            class64.field835 = null;
        }
        if (arg0 != -88) {
            return;
        }
        if (class339.field4259 != null) {
            class339.field4259.method30(class8.field71, arg0 + 103);
        }
        class339.field4259 = null;
        class367.method2104(110);
        class298.field3825.method2063(true);
        class110.field1481.method962((byte) 95);
        if (class361.field4658 != null) {
            class361.field4658.method2980(2);
            class361.field4658 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 507)
    public final void method1230(int arg0) {
        field2555++;
        method1222((byte) -19);
        class534.method3162(false);
        class492.method2987(22239);
        class153.method1001(0);
        class335.method1935(95);
        class472.method2846(12250);
        class374.method2120(-1121067160);
        class218.method1338((byte) -107);
        class75.method647((byte) 119);
        class383.method2168(127);
        class230.method1397(127);
        class352.method2018(0);
        class437.method2570(-117);
        class284.method1676(1);
        class363.method2084(0);
        class165.method1069(100);
        class123.method872((byte) -71);
        class38.method291((byte) -115);
        class65.method582(false);
        class277.method1636(-22609);
        class465.method2806(-1994346078);
        class5.method28(true);
        class421.method2476((byte) -35);
        class359.method2056((byte) -53);
        class141.method957(31866);
        class49.method505((byte) -115);
        class47.method485(0);
        class56.method536((byte) -84);
        class412.method2442(520);
        class438.method2575(-19643);
        class294.method1726(2);
        class1.method4(123);
        class403.method2385(-5597);
        class448.method2633(1);
        class357.method2045(0);
        class347.method1986(3349);
        class340.method1954(15);
        class275.method1622(-127);
        class140.method950((byte) 115);
        class70.method620(1068635073);
        class439.method2581(90);
        class502.method3024(2);
        class100.method753((byte) -116);
        class409.method2427(4);
        class313.method1837(30);
        class163.method1047((byte) 57);
        class63.method572(-769);
        class488.method2958(-107);
        class118.method848(true);
        class295.method1729(0);
        class194.method1195(126);
        class493.method2990(-124);
        class491.method2974(-1);
        class508.method3048((byte) 126);
        class348.method1992((byte) 115);
        class159.method1027(0);
        class66.method587((byte) -85);
        class354.method2032(48);
        class523.method3113((byte) -98);
        class266.method1584(-12092);
        class223.method1367((byte) 123);
        class380.method2158(1354998088);
        class166.method1071(-41);
        class463.method2789(78);
        class375.method2135((byte) 40);
        class316.method1851(-1);
        class490.method2972(122);
        class181.method1154((byte) -58);
        class495.method2996(-102);
        class400.method2372((byte) 98);
        class175.method1120(16);
        class73.method635(31996);
        class179.method1142(false);
        class401.method2375(393216);
        class42.method384((byte) 97);
        class446.method2626((byte) -30);
        class356.method2037(false);
        class282.method1670(-29);
        class68.method606(-1);
        class64.method576(-26);
        class428.method2506(-27);
        class254.method1528(40);
        class360.method2069(100);
        class25.method201((byte) 23);
        class197.method1219(true);
        class315.method1846((byte) 112);
        class183.method1155(67);
        class339.method1949((byte) -123);
        class470.method2838(765);
        class285.method1682(916811041);
        class442.method2611(0);
        class513.method3068((byte) 76);
        class415.method2456((byte) -18);
        class203.method1277((byte) 116);
        class474.method2856(false);
        class249.method1512(-5208);
        class524.method3129((byte) 86);
        class87.method696((byte) 51);
        class225.method1373(-22437);
        class102.method769((byte) 58);
        class173.method1103(0);
        class3.method15(16);
        class143.method964((byte) -90);
        class477.method2911((byte) 10);
        class10.method71(-16711936);
        class53.method522(-3);
        class297.method1752(-4930);
        class517.method3087(353);
        class256.method1535((byte) 12);
        class327.method1907((byte) 64);
        class450.method2658(-2103);
        class11.method73(91);
        class453.method2700(-83);
        class212.method1313(68);
        class187.method1173(64);
        class338.method1948(56);
        class161.method1040(3);
        class350.method2011(0);
        class211.method1309(true);
        class76.method663(10);
        class407.method2403(17394);
        class135.method930(false);
        class251.method1522(10);
        class205.method1283((byte) 65);
        class117.method845(false);
        class531.method3149(16276);
        class6.method34((byte) -22);
        class67.method597();
        class426.method2499((byte) 43);
        class511.method3053((byte) 126);
        class518.method3088(48);
        class532.method3154(0);
        class479.method2925((byte) -85);
        class404.method2389(1);
        class239.method1440();
        class241.method1471();
        class80.method672(6309);
        class160.method1031(-1);
        class302.method1784();
        class50.method511(false);
        class36.method255(-6);
        class147.method977(8);
        class519.method3090(0);
        class370.method2110(-19442);
        class323.method1891(4);
        class139.method947(false);
        class126.method886(-1900);
        class447.method2628(79);
        class172.method1093(80);
        class429.method2511((byte) -4);
        class299.method1764(-3078);
        class196.method1214(true);
        class324.method1895((byte) -112);
        class309.method1806(0);
        class98.method740(-20204);
        class440.method2587(false);
        class250.method1515(26686);
        class478.method2915(false);
        class521.method3100(true);
        class231.method1405(-62);
        class431.method2524((byte) -41);
        class466.method2812(-117);
        class219.method1346(108);
        class92.method715((byte) 92);
        class300.method1774(-120);
        class281.method1667(27558);
        class188.method1174(true);
        class105.method779(true);
        class27.method213((byte) -125);
        class261.method1562((byte) 125);
        class24.method200(64);
        class201.method1267(64);
        class61.method565();
        class99.method743(-126);
        class155.method1010(false);
        class125.method879(27906);
        class229.method1392(1);
        class337.method1945(-18508);
        class483.method2941(-1);
        class170.method1086(18922);
        class328.method1913(0);
        class346.method1984(false);
        class274.method1617(5000);
        class425.method2495((byte) -95);
        class177.method1132((byte) -112);
        class522.method3104(false);
        class262.method1567((byte) -125);
        class314.method1844(false);
        class372.method2118(-125);
        class376.method2138(43);
        class242.method1477(-11786);
        class264.method1571(90);
        class530.method3147(0);
        class392.method2222(5087);
        class529.method3138((byte) 34);
        class423.method2483(0);
        class433.method2535((byte) -31);
        class128.method906((byte) -127);
        class351.method2015(-50);
        class26.method211(false);
        class343.method1970(1);
        class174.method1115(-93);
        class303.method1788(-192537712);
        class130.method914((byte) -74);
        class247.method1503(957);
        class506.method3039(109);
        class505.method3036((byte) 39);
        class176.method1127(6523);
        class97.method736((byte) -118);
        class533.method3157((byte) 19);
        class191.method1186(127);
        class91.method710(-1);
        class434.method2540((byte) 73);
        class469.method2834(false);
        class293.method1718(3673);
        class113.method820(256);
        class238.method1432(-4790);
        class382.method2162(0);
        class509.method3049();
        class390.method2216((byte) 119);
        class116.method832(114);
        class276.method1628((byte) 33);
        class222.method1353(1);
        class290.method1704(23742);
        class291.method1708(true);
        class422.method2480(58);
        class467.method2819(11312);
        class410.method2432((byte) 103);
        class8.method48(-1);
        class406.method2401(8);
        class258.method1548();
        class510.method3051((byte) -128);
        class168.method1082(false);
        class28.method217(123);
        class108.method794(1);
        class481.method2932(-24296);
        class468.method2821(0);
        class371.method2114(0);
        class156.method1018(29983);
        class227.method1380((byte) -92);
        class381.method2160(-126);
        class482.method2938(121);
        class329.method1917((byte) 123);
        class341.method1964(1);
        class85.method685(-15137);
        class46.method446((byte) 79);
        class101.method758((byte) 31);
        class441.method2589((byte) 8);
        class500.method3016((byte) 56);
        class209.method1299(true);
        class20.method172((byte) -75);
        class312.method1833(false);
        class169.method1084((byte) 85);
        class127.method903();
        class334.method1930(99);
        class353.method2029(12887);
        class396.method2352();
        class330.method1919();
        class107.method785();
        class443.method2620(27499);
        class186.method1167(2);
        class112.method817();
        class308.method1799(3);
        class45.method445(36071);
        class106.method783((byte) 81);
        class486.method2950();
        class310.method1811(99);
        class184.method1161(false);
        class226.method1375(0);
        class157.method1020(1);
        class503.method3030((byte) 127);
        class34.method247((byte) 125);
        class59.method546(-109);
        class111.method815(-24622);
        class129.method908((byte) 117);
        class84.method680(true);
        class236.method1413((byte) -93);
        class149.method984(-5753);
        class436.method2559(1724124844);
        class228.method1386(true);
        class362.method2080(true);
        class395.method2341((byte) -71);
        class271.method1610((byte) 15);
        class283.method1675(0);
        class424.method2490((byte) -47);
        class344.method1980(-93);
        class402.method2377(0);
        class387.method2182(true);
        class279.method1655(true);
        class119.method852((byte) -126);
        class265.method1580((byte) -36);
        class384.method2169((byte) -1);
        class322.method1889(26899);
        class109.method795(-111);
        class460.method2713((byte) -41);
        class498.method3005(-11581);
        class288.method1699((byte) -12);
        class13.method105();
        class516.method3078(6);
        class268.method1595(-117);
        class515.method3075((byte) -76);
        class120.method865((byte) 36);
        class54.method527(-111);
        class232.method1407(true);
        class525.method3130(1);
        class90.method705(true);
        class273.method1615(32297);
        class69.method608((byte) -73);
        class133.method922(-14387);
        class451.method2692(true);
        class21.method174(-125);
        class420.method2467(127);
        class115.method827(true);
        class252.method1523((byte) 80);
        class178.method1140((byte) 121);
        class368.method2107((byte) -81);
        class512.method3059((byte) 96);
        class240.method1451(73);
        class414.method2445(1);
        class124.method874(0);
        class248.method1508((byte) -114);
        class397.method2364((byte) -118);
        class2.method12(124);
        class62.method569(-120);
        class23.method196(0);
        class208.method1290(-116);
        class33.method239((byte) 34);
        class189.method1180(2000);
        class30.method221();
        class388.method2193();
        class377.method2140((byte) 84);
        class213.method1316(false);
        class204.method1281(false);
        class391.method2218((byte) 71);
        class385.method2177(-109);
        class507.method3040(1);
        class267.method1588(-12880);
        class405.method2396((byte) -68);
        class131.method917(68);
        class430.method2517(-128);
        class193.method1191(0);
        class462.method2724(0);
        class137.method941(false);
        class78.method668(101);
        class202.method1271(0);
        class473.method2848(false);
        class317.method1869(-5285);
        class17.method151(-12299);
        class180.method1148(-11);
        class452.method2695(22462);
        class296.method1739(1);
        class527.method3135(-31469);
        class145.method970(8);
        class298.method1759((byte) -118);
        class12.method96((byte) 47);
        class364.method2086(false);
        class110.method810((byte) -124);
        class461.method2716(5890);
        class122.method869((byte) -125);
        class233.method1412(19308);
        class320.method1883(25);
        class418.method2464((byte) -114);
        class72.method633(2);
        class325.method1903((byte) 37);
        class151.method993(-126);
        class40.method382(123);
        class48.method492(-79);
        class457.method2709(12371);
        class361.method2075(71);
        class349.method2005(0);
        class280.method1664(-304895391);
        class378.method2144(true);
        int var2 = -95 / ((46 - arg0) / 51);
        class292.method1710(4095);
        class19.method169(false);
        class144.method965(0);
        class215.method1321(true);
        class301.method1778(2);
        class79.method671(256);
        class304.method1792(6435);
        class199.method1252(-39);
        class444.method2621(-74);
        class289.method1703(6);
        class389.method2211(true);
        class52.method520(1336);
        class520.method3092(0);
        class200.method1257(26300);
        class379.method2147(true);
        class489.method2970(17301);
        class528.method3136(-5434);
        class257.method1543(32);
        class411.method2437(true);
        class367.method2105((byte) -99);
        class162.method1043(2);
        class136.method936(82);
        class83.method674(31016);
        class456.method2707((byte) -122);
        class253.method1524(689892780);
        class214.method1320(84);
        class244.method1486(-128);
        class148.method983(2);
        class386.method2178(22407);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lhd;)Lhd;", line = 918)
    public static final class523 method1231(class523 arg0) {
        int var1 = method1226(arg0).method637(1942881);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class310.method1810(arg0.field7673, 1182823664);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 941)
    private final void method1232(byte arg0) {
        if (!class407.field5817.field3628) {
            for (int var2 = 0; var2 < class346.field4439; var2++) {
                if (class389.field5220[var2].method1262(true) == 's' || class389.field5220[var2].method1262(true) == 'S') {
                    class407.field5817.field3628 = true;
                    break;
                }
            }
        }
        field2560++;
        if (class308.field3944 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class504.method3034((byte) -104);
            if (class401.field5713 == 0L) {
                class401.field5713 = var5;
            }
            if (var4 > 16384 && (var5 - class401.field5713) < 5000L) {
                if (var5 - class451.field6519 > 1000L) {
                    System.gc();
                    class451.field6519 = var5;
                }
                class495.field7196 = class344.field4416.method1936(-26539, class11.field177);
                class118.field1587 = 5;
            } else {
                class495.field7196 = class448.field6407.method1936(-26539, class11.field177);
                class308.field3944 = 10;
                class118.field1587 = 5;
            }
        } else if (class308.field3944 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class172.field2185[var7] = class91.method711(class452.field6526, class440.field6307, -5);
            }
            class495.field7196 = class52.field692.method1936(-26539, class11.field177);
            class308.field3944 = 20;
            class118.field1587 = 10;
        } else if (class308.field3944 == 20) {
            if (class3.field25 == null) {
                class3.field25 = new class94(class298.field3825, class110.field1481);
            }
            if (class3.field25.method723((byte) 88)) {
                class183.field2402 = class424.method2493(true, false, (byte) 105, 1, 0);
                class280.field3547 = class424.method2493(true, false, (byte) 48, 1, 1);
                class404.field5750 = class424.method2493(true, false, (byte) 119, 1, 2);
                class191.field2483 = class424.method2493(true, false, (byte) 64, 1, 3);
                class492.field7163 = class424.method2493(true, false, (byte) 123, 1, 4);
                class351.field4507 = class424.method2493(true, true, (byte) 83, 1, 5);
                class530.field7806 = class424.method2493(false, true, (byte) 63, 1, 6);
                class483.field7068 = class424.method2493(true, false, (byte) 77, 1, 7);
                class448.field6413 = class424.method2493(true, false, (byte) 29, 1, 8);
                class303.field3891 = class424.method2493(true, false, (byte) 89, 1, 9);
                class347.field4456 = class424.method2493(true, false, (byte) 120, 1, 10);
                class288.field3675 = class424.method2493(true, false, (byte) 117, 1, 11);
                class379.field4982 = class424.method2493(true, false, (byte) 127, 1, 12);
                class511.field7421 = class424.method2493(true, false, (byte) 42, 1, 13);
                class473.field6858 = class424.method2493(false, false, (byte) 122, 1, 14);
                class426.field6049 = class424.method2493(true, false, (byte) 18, 1, 15);
                class470.field6830 = class424.method2493(true, false, (byte) 96, 1, 16);
                class84.field1055 = class424.method2493(true, false, (byte) 126, 1, 17);
                class233.field2984 = class424.method2493(true, false, (byte) 21, 1, 18);
                class8.field76 = class424.method2493(true, false, (byte) 49, 1, 19);
                class3.field29 = class424.method2493(true, false, (byte) 11, 1, 20);
                class126.field1687 = class424.method2493(true, false, (byte) 120, 1, 21);
                class395.field5425 = class424.method2493(true, false, (byte) 65, 1, 22);
                class231.field2945 = class424.method2493(true, true, (byte) 27, 1, 23);
                class390.field5243 = class424.method2493(true, false, (byte) 109, 1, 24);
                class17.field259 = class424.method2493(true, false, (byte) 92, 1, 25);
                class354.field4558 = class424.method2493(true, true, (byte) 111, 1, 26);
                class123.field1655 = class424.method2493(true, false, (byte) 39, 1, 27);
                class264.field3330 = class424.method2493(true, true, (byte) 44, 1, 28);
                class42.field515 = class424.method2493(true, false, (byte) 83, 1, 29);
                class495.field7196 = class277.field3499.method1936(-26539, class11.field177);
                class118.field1587 = 15;
                class308.field3944 = 30;
            } else {
                class495.field7196 = class418.field5934.method1936(-26539, class11.field177);
                class118.field1587 = 12;
            }
        } else if (class308.field3944 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class122.field1639[var9].method501(255) * class460.field6584[var9] / 100;
            }
            if (var8 == 100) {
                class495.field7196 = class197.field2547.method1936(-26539, class11.field177);
                class118.field1587 = 20;
                class460.method2714(-7267, class448.field6413);
                class261.method1560((byte) -115, class448.field6413);
                class308.field3944 = 40;
            } else {
                if (var8 != 0) {
                    class495.field7196 = class353.field4532.method1936(-26539, class11.field177) + var8 + "%";
                }
                class118.field1587 = 20;
            }
        } else if (class308.field3944 == 40) {
            if (class264.field3330.method464(88)) {
                this.method1233(class264.field3330.method457(1, -81), (byte) -49);
                class495.field7196 = class133.field1728.method1936(-26539, class11.field177);
                class308.field3944 = 50;
                class118.field1587 = 25;
            } else {
                class495.field7196 = class160.field2042.method1936(-26539, class11.field177) + class264.field3330.method463(-81) + "%";
                class118.field1587 = 25;
            }
        } else if (class308.field3944 == 50) {
            class469.method2826(false);
            class495.field7196 = class346.field4436.method1936(-26539, class11.field177);
            class308.field3944 = 60;
            class118.field1587 = 30;
        } else if (class308.field3944 == 60) {
            int var10 = class384.method2170((byte) 96, class511.field7421, class448.field6413);
            int var11 = class248.method1507((byte) -58);
            if (var10 < var11) {
                class495.field7196 = class490.field7148.method1936(-26539, class11.field177) + var10 * 100 / var11 + "%";
                class118.field1587 = 35;
            } else {
                class495.field7196 = class533.field7839.method1936(-26539, class11.field177);
                class118.field1587 = 35;
                class308.field3944 = 70;
            }
        } else if (class308.field3944 == 70) {
            int var12 = class94.method722(class448.field6413, 0);
            int var13 = class495.method2995(-14826);
            if (var13 > var12) {
                class495.field7196 = class527.field7781.method1936(-26539, class11.field177) + var12 * 100 / var13 + "%";
                class118.field1587 = 40;
            } else {
                class495.field7196 = class135.field1743.method1936(-26539, class11.field177);
                class308.field3944 = 80;
                class118.field1587 = 40;
            }
        } else if (class308.field3944 == 80) {
            if (class354.field4558.method464(117)) {
                class79.field1024 = new class370(class354.field4558, class303.field3891, class448.field6413);
                class495.field7196 = class209.field2698.method1936(-26539, class11.field177);
                class118.field1587 = 45;
                class308.field3944 = 90;
            } else {
                class495.field7196 = class488.field7106.method1936(-26539, class11.field177) + class354.field4558.method463(126) + "%";
                class118.field1587 = 45;
            }
        } else if (class308.field3944 == 90) {
            class495.field7196 = class161.field2054.method1936(-26539, class11.field177);
            class308.field3944 = 95;
            class118.field1587 = 50;
        } else if (arg0 > 72) {
            if (class308.field3944 == 95) {
                if (class407.field5817.field3628) {
                    class407.field5817.field3656 = 0;
                    class407.field5817.field3626 = 0;
                    class407.field5817.field3635 = 1;
                    class407.field5817.field3624 = 0;
                    class407.field5817.field3621 = 0;
                }
                class407.field5817.field3628 = true;
                class407.field5817.method578((byte) 70, class219.field2794);
                class73.method634(false, class407.field5817.field3656, 0);
                class495.field7196 = class317.field4049.method1936(-26539, class11.field177);
                class308.field3944 = 100;
                class118.field1587 = 55;
            } else if (class308.field3944 == 100) {
                class197.method1220(class511.field7421, -18577, class33.field416, class448.field6413);
                class495.field7196 = class268.field3394.method1936(-26539, class11.field177);
                class118.field1587 = 60;
                class284.method1677(-20429, 1);
                class308.field3944 = 110;
            } else if (class308.field3944 == 110) {
                byte var14 = 0;
                class404.field5750.method464(-69);
                int var15 = var14 + class404.field5750.method463(120);
                class470.field6830.method464(-85);
                int var16 = var15 + class470.field6830.method463(-75);
                class84.field1055.method464(-31);
                int var17 = var16 + class84.field1055.method463(103);
                class233.field2984.method464(-126);
                int var18 = var17 + class233.field2984.method463(-24);
                class8.field76.method464(96);
                int var19 = var18 + class8.field76.method463(115);
                class3.field29.method464(-38);
                int var20 = var19 + class3.field29.method463(97);
                class126.field1687.method464(106);
                int var21 = var20 + class126.field1687.method463(-37);
                class395.field5425.method464(102);
                int var22 = var21 + class395.field5425.method463(-70);
                class390.field5243.method464(-117);
                int var23 = var22 + class390.field5243.method463(-74);
                class17.field259.method464(-79);
                int var24 = var23 + class17.field259.method463(-103);
                class123.field1655.method464(108);
                int var25 = var24 + class123.field1655.method463(125);
                class42.field515.method464(88);
                int var26 = var25 + class42.field515.method463(-119);
                if (var26 < 1200) {
                    class495.field7196 = class522.field7549.method1936(-26539, class11.field177) + var26 / 12 + "%";
                    class118.field1587 = 65;
                } else {
                    class199.field2592 = new class439(class530.field7803, class11.field177, class404.field5750);
                    class327.field4134 = new class438(class530.field7803, class11.field177, class404.field5750);
                    class72.field927 = new class294(class530.field7803, class11.field177, class404.field5750, class448.field6413);
                    class308.field3940 = new class1(class530.field7803, class11.field177, class84.field1055);
                    class2.field13 = new class403(class530.field7803, class11.field177, class404.field5750);
                    class359.field4633 = new class448(class530.field7803, class11.field177, class404.field5750);
                    class360.field4654 = new class357(class530.field7803, class11.field177, class404.field5750, class483.field7068);
                    class19.field280 = new class347(class530.field7803, class11.field177, class404.field5750);
                    class38.field503 = new class270(class530.field7803, class11.field177, class404.field5750);
                    class315.field4017 = new class340(class530.field7803, class11.field177, true, class470.field6830, class483.field7068);
                    class505.field7281 = new class275(class530.field7803, class11.field177, class404.field5750, class448.field6413);
                    class72.field931 = new class140(class530.field7803, class11.field177, class404.field5750, class448.field6413);
                    class390.field5244 = new class216(class530.field7803, class11.field177, true, class233.field2984, class483.field7068);
                    class376.field4949 = new class70(class530.field7803, class11.field177, true, class199.field2592, class8.field76, class483.field7068);
                    class143.field1839 = new class502(class530.field7803, class11.field177, class404.field5750);
                    class404.field5756 = new class60(class530.field7803, class11.field177, class3.field29, class183.field2402, class280.field3547);
                    class456.field6572 = new class100(class530.field7803, class11.field177, class404.field5750);
                    class375.field4840 = new class409(class530.field7803, class11.field177, class404.field5750);
                    class120.field1624 = new class313(class530.field7803, class11.field177, class126.field1687, class483.field7068);
                    class100.field1217 = new class163(class530.field7803, class11.field177, class404.field5750);
                    class409.field5846 = new class95(class530.field7803, class11.field177, class404.field5750);
                    class359.field4640 = new class63(class530.field7803, class11.field177, class404.field5750);
                    class242.field3132 = new class286(class530.field7803, class11.field177, class395.field5425);
                    class436.field6239 = new class488(class530.field7803, class11.field177, class404.field5750);
                    class418.method2465(class191.field2483, class511.field7421, class483.field7068, 117, class448.field6413);
                    class183.method1156(class42.field515, (byte) 102);
                    class238.field3045 = new class480(class11.field177, class390.field5243, class17.field259);
                    class176.field2307 = new class118(class11.field177, class390.field5243, class17.field259, new class105());
                    class495.field7196 = class436.field6240.method1936(-26539, class11.field177);
                    class118.field1587 = 65;
                    class319.method1880(48);
                    class315.field4017.method1956(!class407.field5817.method580(class377.field4959, (byte) -35), -29111);
                    class491.field7160 = new class465();
                    class237.method1426(1);
                    class186.method1169(class123.field1655, 87);
                    class481.method2934(true, class79.field1024, class483.field7068);
                    class308.field3944 = 120;
                }
            } else if (class308.field3944 == 120) {
                int var27 = class494.method2991(class448.field6413, 62);
                int var28 = class139.method945((byte) 34);
                if (var28 > var27) {
                    class495.field7196 = class339.field4256.method1936(-26539, class11.field177) + var27 * 100 / var28 + "%";
                    class118.field1587 = 70;
                } else {
                    class386.method2181(class448.field6413, class33.field416, (byte) 99);
                    class433.method2538(class6.field61, 10);
                    class495.field7196 = class56.field743.method1936(-26539, class11.field177);
                    class118.field1587 = 70;
                    class308.field3944 = 130;
                }
            } else if (class308.field3944 == 130) {
                if (class347.field4456.method482("huffman", -1, "")) {
                    class155 var29 = new class155(class347.field4456.method466("", "huffman", 102));
                    class434.method2542(var29, true);
                    class495.field7196 = class359.field4641.method1936(-26539, class11.field177);
                    class308.field3944 = 140;
                    class118.field1587 = 75;
                } else {
                    class495.field7196 = class512.field7427.method1936(-26539, class11.field177) + "0%";
                    class118.field1587 = 75;
                }
            } else if (class308.field3944 == 140) {
                if (class191.field2483.method464(106)) {
                    class495.field7196 = class231.field2947.method1936(-26539, class11.field177);
                    class118.field1587 = 80;
                    class308.field3944 = 150;
                } else {
                    class495.field7196 = class141.field1829.method1936(-26539, class11.field177) + class191.field2483.method463(-24) + "%";
                    class118.field1587 = 80;
                }
            } else if (class308.field3944 == 150) {
                if (class379.field4982.method464(-95)) {
                    class495.field7196 = class423.field5988.method1936(-26539, class11.field177);
                    class118.field1587 = 82;
                    class308.field3944 = 160;
                } else {
                    class495.field7196 = class249.field3189.method1936(-26539, class11.field177) + class379.field4982.method463(-54) + "%";
                    class118.field1587 = 82;
                }
            } else if (class308.field3944 == 160) {
                if (class511.field7421.method464(-95)) {
                    class495.field7196 = class533.field7842.method1936(-26539, class11.field177);
                    class308.field3944 = 170;
                    class118.field1587 = 85;
                } else {
                    class495.field7196 = class533.field7842.method1936(-26539, class11.field177) + class511.field7421.method463(-92) + "%";
                    class118.field1587 = 85;
                }
            } else if (class308.field3944 == 170) {
                if (class231.field2945.method480((byte) 22, "details")) {
                    class241.method1461(class231.field2945, class2.field13, class359.field4633, class315.field4017, class505.field7281, class72.field931, class491.field7160);
                    class495.field7196 = class50.field658.method1936(-26539, class11.field177);
                    class118.field1587 = 89;
                    class308.field3944 = 190;
                } else {
                    class495.field7196 = class348.field4487.method1936(-26539, class11.field177) + class231.field2945.method484("details", 0) + "%";
                    class118.field1587 = 87;
                }
            } else if (class308.field3944 == 190) {
                class125.field1668 = new String[class409.field5846.field1155];
                class372.field4824 = new int[class359.field4640.field820];
                class341.field4300 = new boolean[class359.field4640.field820];
                for (int var30 = 0; var30 < class359.field4640.field820; var30++) {
                    if (class359.field4640.method574(var30, (byte) 53).field1127 == 0) {
                        class341.field4300[var30] = true;
                        class289.field3695++;
                    }
                    class372.field4824[var30] = -1;
                }
                class450.method2669(-12308);
                class428.field6077 = class191.field2483.method488("loginscreen", 126);
                class17.field256 = class191.field2483.method488("lobbyscreen", 112);
                class351.field4507.method489(false, 0, true);
                class530.field7806.method489(true, 0, true);
                class448.field6413.method489(true, 0, true);
                class511.field7421.method489(true, 0, true);
                class347.field4456.method489(true, 0, true);
                class191.field2483.method489(true, 0, true);
                class23.field333 = true;
                class404.field5750.field586 = 2;
                class84.field1055.field586 = 2;
                class470.field6830.field586 = 2;
                class233.field2984.field586 = 2;
                class8.field76.field586 = 2;
                class3.field29.field586 = 2;
                class126.field1687.field586 = 2;
                class163.method1052(false, (byte) 81, -1, -1, class407.field5817.field3635);
                class495.field7196 = class38.field499.method1936(-26539, class11.field177);
                class308.field3944 = 200;
                class118.field1587 = 95;
            } else if (class308.field3944 == 200) {
                class284.method1677(-20429, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 1455)
    private final void method1233(byte[] arg0, byte arg1) {
        field2558++;
        if (arg1 >= -43) {
            return;
        }
        class463 var3 = new class463(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method2737(false);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class405.field5796 = new int[6];
                        var9[0] = var3.method2758((byte) 92);
                        var9[1] = var3.method2758((byte) 98);
                        var9[2] = var3.method2758((byte) 90);
                        var9[3] = var3.method2758((byte) 126);
                        var9[4] = var3.method2758((byte) 120);
                        var9[5] = var3.method2758((byte) 110);
                    } else if (var4 == 4) {
                        int var5 = var3.method2737(false);
                        class298.field3837 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class298.field3837[var6] = var3.method2758((byte) 84);
                            if (class298.field3837[var6] == 65535) {
                                class298.field3837[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method2737(false);
                        class126.field1686 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class126.field1686[var8] = var3.method2758((byte) 96);
                            if (class126.field1686[var8] == 65535) {
                                class126.field1686[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLtf;)V", line = 1530)
    public static final void method1234(int arg0, byte arg1, class194 arg2) {
        field2567++;
        boolean var3 = arg2.method1199(arg1 + 30342, 1) == 1;
        if (var3) {
            class479.field7012[class409.field5845++] = arg0;
        }
        if (arg1 != -38) {
            method1224();
        }
        int var4 = arg2.method1199(30304, 2);
        class223 var5 = class387.field5107[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2860 = false;
            } else if (class66.field858 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class26 var6 = class434.field6167[arg0] = new class26();
                var6.field377 = (class320.field4064 + var5.field4936[0] >> 6) + (var5.field4944[0] + class441.field6317 >> 6 << 14) + (var5.field2676 << 28);
                if (var5.field2841 == -1) {
                    var6.field372 = var5.field4896.method33((byte) -48);
                } else {
                    var6.field372 = var5.field2841;
                }
                var6.field375 = var5.field4895;
                var6.field378 = var5.field2820;
                if (var5.field2837 > 0) {
                    class286.method1688(var5, (byte) -82);
                }
                class387.field5107[arg0] = null;
                if (arg2.method1199(30304, 1) != 0) {
                    class119.method854(-126, arg2, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1199(30304, 3);
            int var8 = var5.field4944[0];
            int var9 = var5.field4936[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field2844 = var9;
                var5.field2818 = var8;
                var5.field2860 = true;
            } else {
                var5.method1370(var9, (byte) -72, class191.field2482[arg0], var8);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1199(30304, 4);
            int var11 = var5.field4944[0];
            int var12 = var5.field4936[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field2860 = true;
                var5.field2844 = var12;
                var5.field2818 = var11;
            } else {
                var5.method1370(var12, (byte) -112, class191.field2482[arg0], var11);
            }
        } else {
            int var13 = arg2.method1199(30304, 1);
            if (var13 == 0) {
                int var14 = arg2.method1199(30304, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F1) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field4944[0] + var16;
                int var19 = var5.field4936[0] + var17;
                if (var3) {
                    var5.field2860 = true;
                    var5.field2844 = var19;
                    var5.field2818 = var18;
                } else {
                    var5.method1370(var19, (byte) -128, class191.field2482[arg0], var18);
                }
                var5.field2676 = (byte) (var5.field2676 + var15 & 0x3);
                if (class66.field858 == arg0) {
                    class276.field3488 = var5.field2676;
                }
            } else {
                int var20 = arg2.method1199(arg1 + 30342, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field4944[0] + var22 + class441.field6317 & 0x3FFF) - class441.field6317;
                int var25 = (var5.field4936[0] + var23 + class320.field4064 & 0x3FFF) - class320.field4064;
                if (var3) {
                    var5.field2818 = var24;
                    var5.field2844 = var25;
                    var5.field2860 = true;
                } else {
                    var5.method1370(var25, (byte) -79, class191.field2482[arg0], var24);
                }
                var5.field2676 = (byte) (var5.field2676 + var21 & 0x3);
                if (class66.field858 == arg0) {
                    class276.field3488 = var5.field2676;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 1848)
    public final String method1235(boolean arg0) {
        field2571++;
        String var2 = null;
        try {
            var2 = "[1)" + class441.field6317 + "," + class320.field4064 + "," + class452.field6526 + "," + class440.field6307 + "|";
            if (class23.field336 != null) {
                var2 = var2 + "2)" + class276.field3488 + "," + (class23.field336.field4944[0] + class441.field6317) + "," + (class23.field336.field4936[0] + class320.field4064) + "|";
            }
            var2 = var2 + "3)" + class377.field4959 + "|4)" + class407.field5817.field3621 + "|5)" + class191.method1184(false) + "|6)" + class174.field2262 + "," + class390.field5236 + "|";
            if (!arg0) {
                field2573 = null;
            }
            var2 = var2 + "7)" + class407.field5817.method1684(-2, class377.field4959) + "|";
            var2 = var2 + "8)" + class407.field5817.method1681(class377.field4959, -28198) + "|";
            var2 = var2 + "9)" + class407.field5817.field3623 + "|";
            var2 = var2 + "10)" + class407.field5817.field3625 + "|";
            var2 = var2 + "11)" + class407.field5817.field3640 + "|";
            var2 = var2 + "12)" + class407.field5817.method580(class377.field4959, (byte) -35) + "|";
            var2 = var2 + "13)" + class105.field1333 + "|";
            var2 = var2 + "14)" + class483.field7059;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var3) {
            }
            var2 = var2 + "]";
        } catch (Throwable var4) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1883)
    public static final void method1236() {
        int var0 = class436.field6234;
        int[] var1 = class12.field218;
        boolean var2 = class407.field5817.field3639 == 1 && var0 > 200 || class407.field5817.field3639 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class223 var12 = class387.field5107[var1[var3]];
            if (var12.method1368((byte) -117)) {
                var12.method1129(1);
                if (var12.field2673 >= 0 && var12.field2671 >= 0 && var12.field2681 < class452.field6526 && var12.field2670 < class440.field6307) {
                    var12.field2848 = var12.field4872 ? var2 : false;
                    if (class23.field336 == var12) {
                        var12.field4845 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field4901) {
                            var13++;
                        }
                        if (var12.field4921 > class163.field2065) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method1366((byte) -94) << 2);
                        if (var12.field2820) {
                            var14 += 512;
                        } else {
                            if (class202.field2629 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field4845 = var14 + 1;
                    }
                } else {
                    var12.field4845 = -1;
                }
            } else {
                var12.field4845 = -1;
            }
        }
        for (int var4 = 0; var4 < class489.field7114; var4++) {
            class295 var9 = class187.field2446[class403.field5735[var4]];
            if (var9.method1734((byte) -113) && var9.field3773.method2906((byte) 26, class491.field7160)) {
                var9.method1129(1);
                if (var9.field2673 >= 0 && var9.field2671 >= 0 && var9.field2681 < class452.field6526 && var9.field2670 < class440.field6307) {
                    int var10 = 0;
                    if (!var9.field4901) {
                        var10++;
                    }
                    if (var9.field4921 > class163.field2065) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method1366((byte) -85) << 2);
                    if (class202.field2629 == 0) {
                        if (var9.field3773.field6942) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class202.field2629 == 1) {
                        if (var9.field3773.field6942) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field3773.field6961) {
                        var11 += 1024;
                    } else if (!var9.field3773.field6958) {
                        var11 += 256;
                    }
                    var9.field4845 = var11 + 1;
                } else {
                    var9.field4845 = -1;
                }
            } else {
                var9.field4845 = -1;
            }
        }
        for (int var5 = 0; var5 < class147.field1869.length; var5++) {
            class277 var6 = class147.field1869[var5];
            if (var6 != null) {
                if (var6.field3508 == 1) {
                    class295 var7 = class187.field2446[var6.field3511];
                    if (var7 != null && var7.field4845 >= 0) {
                        var7.field4845 += 2048;
                    }
                } else if (var6.field3508 == 10) {
                    class223 var8 = class387.field5107[var6.field3511];
                    if (var8 != null && class23.field336 != var8 && var8.field4845 >= 0) {
                        var8.field4845 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2046)
    public static final void method1237() {
        class251.field3214 = 0;
        for (int var0 = 0; var0 < class489.field7114; var0++) {
            class295 var1 = class187.field2446[class403.field5735[var0]];
            if (var1.field4901 && var1.method1364((byte) 24) != -1) {
                int var2 = (var1.method1366((byte) -105) - 1) * 64 + 60;
                int var3 = var1.field2666 - var2 >> 7;
                int var4 = var1.field2677 - var2 >> 7;
                class375 var5 = class328.method1911(var1.field2676, var4, 64, var3);
                if (var5 != null) {
                    int var6 = var5.field4890;
                    if (var5 instanceof class295) {
                        var6 += 2048;
                    }
                    if (var5.field4916 == 0 && var5.method1364((byte) 24) != -1) {
                        class173.field2248[class251.field3214] = var6;
                        class400.field5708[class251.field3214] = var6;
                        class251.field3214++;
                        var5.field4916++;
                    }
                    class173.field2248[class251.field3214] = var6;
                    class400.field5708[class251.field3214] = var1.field4890 + 2048;
                    class251.field3214++;
                    var5.field4916++;
                }
            }
        }
        class261.method1565(class400.field5708, class173.field2248, -1, 0, class251.field3214 - 1);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lhd;)Z", line = 2094)
    public static final boolean method1238(class523 arg0) {
        if (class191.field2480) {
            if (method1226(arg0).field942 != 0) {
                return false;
            }
            if (arg0.field7632 == 0) {
                return false;
            }
        }
        return arg0.field7682;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2108)
    public static final void main(String[] arg0) {
        field2570++;
        try {
            if (arg0.length != 6) {
                class19.method166("Argument count", 121);
            }
            class443.field6357 = new class25();
            class443.field6357.field355 = Integer.parseInt(arg0[0]);
            class382.field5031 = new class25();
            class382.field5031.field355 = Integer.parseInt(arg0[1]);
            class267.field3387 = new class25();
            class267.field3387.field355 = Integer.parseInt(arg0[2]);
            class218.field2784 = class128.field1703;
            if (arg0[3].equals("live")) {
                class411.field5865 = class378.field4979;
            } else if (arg0[3].equals("rc")) {
                class411.field5865 = class191.field2484;
            } else if (arg0[3].equals("wip")) {
                class411.field5865 = class438.field6289;
            } else {
                class19.method166("modewhat", 124);
            }
            class11.field177 = class449.method2643(-12098, arg0[4]);
            if (class11.field177 == -1) {
                if (arg0[4].equals("english")) {
                    class11.field177 = 0;
                } else if (arg0[4].equals("german")) {
                    class11.field177 = 1;
                } else {
                    class19.method166("language", 123);
                }
            }
            class57.field749 = false;
            class295.field3780 = false;
            if (arg0[5].equals("game0")) {
                class530.field7803 = class123.field1653;
            } else if (arg0[5].equals("game1")) {
                class530.field7803 = class335.field4230;
            } else {
                class19.method166("game", 113);
            }
            class18.field276 = 0;
            class288.field3682 = class530.field7803.field2104;
            class122.field1632 = 0;
            class249.field3194 = true;
            class115.field1550 = true;
            class301.field3873 = "";
            client var1 = new client();
            class349.field4492 = var1;
            var1.method2568(593, 768, false, (byte) 20, 30, 1024, class411.field5865.method1596(-127) + 32, class530.field7803.field2102);
            class123.field1656.setLocation(40, 40);
        } catch (Exception var3) {
            class461.method2719(var3, null, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2184)
    public final void method1239(int arg0) {
        int var2 = 104 % ((29 - arg0) / 61);
        field2557++;
        try {
            this.method1244(false);
        } catch (OutOfMemoryError var4) {
            if (var4.getMessage() == null || !var4.getMessage().startsWith("native")) {
                throw var4;
            }
            class53.method525(97, 0);
            class461.method2719(var4, var4.getMessage() + " (Recovered) " + this.method1235(true), 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2207)
    public static final void method1240() {
        for (int var0 = 0; var0 < class452.field6526; var0++) {
            int[] var1 = class300.field3868[var0];
            for (int var2 = 0; var2 < class440.field6307; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V", line = 2225)
    private final void method1241(int arg0, boolean arg1) {
        field2569++;
        class298.field3825.field4650++;
        class347.field4458 = 0;
        class528.field7785 = null;
        if (arg1) {
            class298.field3825.field4651 = arg0;
            class113.field1516 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2240)
    private final void method1242(boolean arg0) {
        field2553++;
        boolean var2 = class298.field3825.method2057((byte) 111);
        if (!arg0) {
            method1248(null, 80, -124, -89, -19, -53, -54, 58, 31, -67);
        }
        if (!var2) {
            this.method1243((byte) 120);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2256)
    private final void method1243(byte arg0) {
        field2554++;
        if (class298.field3825.field4650 > class484.field7070) {
            class184.field2420 = (class298.field3825.field4650 * 50 - 50) * 5;
            class64.field834.field367 = !class64.field834.field367;
            if (class184.field2420 > 3000) {
                class184.field2420 = 3000;
            }
            if (class298.field3825.field4650 >= 2 && class298.field3825.field4651 == 6) {
                this.method2571("js5connect_outofdate", 85);
                class483.field7059 = 13;
                return;
            }
            if (class298.field3825.field4650 >= 4 && class298.field3825.field4651 == -1) {
                this.method2571("js5crc", 85);
                class483.field7059 = 13;
                return;
            }
            if (class298.field3825.field4650 >= 4 && class312.method1831(52, class483.field7059)) {
                if (class298.field3825.field4651 == 7 || class298.field3825.field4651 == 9) {
                    this.method2571("js5connect_full", -64);
                } else if (class298.field3825.field4651 <= 0) {
                    this.method2571("js5io", -91);
                } else {
                    this.method2571("js5connect", -121);
                }
                class483.field7059 = 13;
                return;
            }
        }
        class484.field7070 = class298.field3825.field4650;
        if (class184.field2420 > 0) {
            class184.field2420--;
            return;
        }
        try {
            if (arg0 < 96) {
                method1245(73);
            }
            if (class347.field4458 == 0) {
                class113.field1516 = class219.field2794.method2888(class64.field834.field363, class64.field834.method202((byte) -93), (byte) 91);
                class347.field4458++;
            }
            if (class347.field4458 == 1) {
                if (class113.field1516.field1628 == 2) {
                    this.method1241(1000, true);
                    return;
                }
                if (class113.field1516.field1628 == 1) {
                    class347.field4458++;
                }
            }
            if (class347.field4458 == 2) {
                class528.field7785 = new class421((Socket) class113.field1516.field1627, class219.field2794);
                class463 var2 = new class463(5);
                var2.method2729(class266.field3359.field1865, false);
                var2.method2777(593, -11);
                class528.field7785.method2475(0, (byte) 104, 5, var2.field6618);
                class347.field4458++;
                class101.field1223 = class504.method3034((byte) -110);
            }
            if (class347.field4458 == 3) {
                if (class312.method1831(63, class483.field7059) || class528.field7785.method2470((byte) 126) > 0) {
                    int var3 = class528.field7785.method2474(false);
                    if (var3 != 0) {
                        this.method1241(var3, true);
                        return;
                    }
                    class347.field4458++;
                } else if (class504.method3034((byte) -105) - class101.field1223 > 30000L) {
                    this.method1241(1001, true);
                    return;
                }
            }
            if (class347.field4458 == 4) {
                boolean var4 = class483.field7059 == 1 || class500.method3009(class483.field7059, -124) || class395.method2282((byte) 74, class483.field7059);
                class298.field3825.method2055(class528.field7785, 0, !var4);
                class113.field1516 = null;
                class528.field7785 = null;
                class347.field4458 = 0;
            }
        } catch (IOException var5) {
            this.method1241(1002, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2400)
    private final void method1244(boolean arg0) {
        field2564++;
        if (class483.field7059 == 13) {
            return;
        }
        class163.field2065++;
        if ((class163.field2065 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class87.field1081 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class451.field6518.setSeed((long) class87.field1081);
        }
        if (class163.field2065 % 50 == 0) {
            class397.field5698 = class527.field7780;
            class527.field7780 = 0;
            class25.field369 = class525.field7764;
            class525.field7764 = 0;
        }
        this.method1242(true);
        if (class3.field25 != null) {
            class3.field25.method727((byte) 104);
        }
        class507.method3047(63);
        class343.field4392.method838(-1121067160);
        class204.field2664.method1340((byte) 91);
        if (class339.field4259 != null) {
            int var3 = class339.field4259.method32(15);
            class109.field1364 = var3;
        }
        if (class33.field416 != null) {
            class33.field416.method359((int) class504.method3034((byte) -114));
        }
        class238.method1433((byte) 60);
        class346.field4439 = 0;
        for (class304 var4 = class343.field4392.method841(-125); var4 != null && class346.field4439 < 128; var4 = class343.field4392.method841(-115)) {
            if (var4.method1265((byte) -118) != 1) {
                char var5 = var4.method1262(true);
                if (!class292.method1717(arg0) || var5 != '`' && var5 != '§') {
                    class389.field5220[class346.field4439] = var4;
                    class346.field4439++;
                } else if (class367.method2103(-22901)) {
                    class202.method1272(-127);
                } else {
                    class350.method2013(25875);
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class494 var6 = class204.field2664.method1341(102); var6 != null; var6 = class204.field2664.method1341(118)) {
            int var7 = var6.method2152(arg0);
            if (var7 == -1) {
                class508.field7312.method163(var6, 0);
            } else if (class446.method2627((byte) 11, var7)) {
                class53.field706.method163(var6, 0);
            }
            if (class53.field706.method156(-44) > 10) {
                class53.field706.method158(-24557);
            }
        }
        if (class367.method2103(-22901)) {
            class368.method2106((byte) -100);
        }
        if (class483.field7059 == 0) {
            this.method1232((byte) 116);
            class529.method3140(true);
        } else if (class483.field7059 == 1) {
            this.method1232((byte) 76);
            class529.method3140(true);
        } else if (class268.method1594(3, class483.field7059)) {
            class439.method2585((byte) -79);
        }
        if (class500.method3009(class483.field7059, -121) && !class268.method1594(3, class483.field7059)) {
            this.method1246(-26149);
            class106.method781(76);
            class500.method3013((byte) -36);
        } else if (class395.method2282((byte) 74, class483.field7059) && !class268.method1594(3, class483.field7059)) {
            this.method1246(-26149);
            class500.method3013((byte) -36);
        } else if (class483.field7059 == 11) {
            class500.method3013((byte) -36);
        } else if (class480.method2931(class483.field7059, (byte) -84) && !class268.method1594(3, class483.field7059)) {
            class397.method2366(true);
        } else if (class483.field7059 == 12) {
            class500.method3013((byte) -36);
            if (class320.field4062 != -3 && class320.field4062 != 2 && class320.field4062 != 15) {
                class461.method2721((byte) -76, false);
            }
        }
        class193.method1192(class33.field416, -118);
        class53.field706.method158(-24557);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2557)
    public static final void method1245(int arg0) {
        int var1 = class436.field6234;
        int[] var2 = class12.field218;
        for (int var3 = 0; var3 < class489.field7114 + var1; var3++) {
            class375 var4;
            if (var3 < var1) {
                var4 = class387.field5107[var2[var3]];
            } else {
                var4 = class187.field2446[class403.field5735[var3 - var1]];
            }
            if (var4.field2676 == arg0 && var4.field4845 >= 0) {
                int var5 = var4.method1366((byte) -102);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2666 & 0x7F) != 0 || (var4.field2677 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field2666 & 0x7F) != 64 || (var4.field2677 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2666 >> 7;
                    int var7 = var4.field2677 >> 7;
                    if (var4.field4845 > class300.field3868[var6][var7]) {
                        class300.field3868[var6][var7] = var4.field4845;
                        class23.field341[var6][var7] = 1;
                    } else if (class300.field3868[var6][var7] == var4.field4845) {
                        var10002 = class23.field341[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field2666 - var8 >> 7;
                    int var10 = var4.field2677 - var8 >> 7;
                    int var11 = var4.field2666 + var8 >> 7;
                    int var12 = var4.field2677 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4845 > class300.field3868[var13][var14]) {
                                class300.field3868[var13][var14] = var4.field4845;
                                class23.field341[var13][var14] = 1;
                            } else if (class300.field3868[var13][var14] == var4.field4845) {
                                var10002 = class23.field341[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2655)
    private final void method1246(int arg0) {
        if (class483.field7059 == 6 && class495.field7198 == 0) {
            if (class280.field3572 > 0) {
                class280.field3572--;
            }
            if (class306.field3903 > 1) {
                class106.field1342 = class160.field2037;
                class306.field3903--;
            }
            if (!class122.field1646) {
                class243.method1480(4);
            }
            for (int var2 = 0; var2 < 100 && class137.method940((byte) 126); var2++) {
            }
        }
        field2559++;
        class250.field3207++;
        class534.method3160((byte) 121, -1, null, -1);
        class186.method1170(-1, 24, -1, null);
        class6.method36((byte) -92);
        class160.field2037++;
        for (int var3 = 0; var3 < 32768; var3++) {
            class295 var4 = class187.field2446[var3];
            if (var4 != null) {
                byte var5 = var4.field3773.field6913;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1366((byte) -103);
                    if ((var5 & 0x2) != 0 && var4.field4941 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field4944[0] + var7;
                            int var10 = var4.field4936[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class452.field6526 - var6 - 1) {
                                var9 = class452.field6526 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class440.field6307 - var6 - 1) {
                                var10 = class440.field6307 - var6 - 1;
                            }
                            int var11 = class160.method1034(class382.field5038, var4.field4936[0], -1, 0, var6, var6, (byte) 72, class172.field2185[var4.field2676], var6, true, var10, var4.field4944[0], var9, class439.field6296, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field4944[var12] = class439.field6296[var11 - var12 - 1];
                                    var4.field4936[var12] = class382.field5038[var11 - var12 - 1];
                                    var4.field4940[var12] = 1;
                                }
                                var4.field4941 = var11;
                            }
                        }
                    }
                    class384.method2173(true, var4, true);
                    int var13 = class530.method3146(var4, true);
                    class209.method1298(-6145, var4, var13, class50.field659, class55.field716);
                    class108.method793(arg0 + 49351, var4);
                }
            }
        }
        if (class495.field7198 == 0 && class533.field7846 == 0) {
            if (class142.field1835 == 2) {
                class378.method2143((byte) 79);
            } else {
                class57.method540((byte) 91);
            }
            if ((class310.field3971 >> 7) < 14 || (class310.field3971 >> 7) >= (class452.field6526 - 14) || class193.field2500 >> 7 < 14 || (class440.field6307 - 14) <= (class193.field2500 >> 7)) {
                class273.method1614((byte) -126);
            }
        }
        while (true) {
            class170 var14;
            class523 var15;
            class523 var16;
            do {
                var14 = (class170) class170.field2182.method158(-24557);
                if (var14 == null) {
                    while (true) {
                        class170 var17;
                        class523 var18;
                        class523 var19;
                        do {
                            var17 = (class170) class165.field2100.method158(-24557);
                            if (var17 == null) {
                                while (true) {
                                    class170 var20;
                                    class523 var21;
                                    class523 var22;
                                    do {
                                        var20 = (class170) class434.field6164.method158(arg0 ^ 0x39C8);
                                        if (var20 == null) {
                                            if (class233.field2985 != null) {
                                                class439.method2582(-25);
                                            }
                                            if ((class163.field2065 % 1500) == 0) {
                                                class286.method1691(-106);
                                            }
                                            if (class483.field7059 == 6 && class495.field7198 == 0) {
                                                class383.method2164(true);
                                            }
                                            if (arg0 != -26149) {
                                                return;
                                            }
                                            class518.method3089(62);
                                            if (class40.field514 && (class504.method3034((byte) -103) - 60000L) > class53.field710) {
                                                class144.method966(112);
                                            }
                                            if (class483.field7059 == 6 && class495.field7198 == 0) {
                                                if (class64.field835 == null) {
                                                    class461.method2721((byte) -76, false);
                                                    return;
                                                }
                                                class2.field17++;
                                                if (class2.field17 > 50) {
                                                    class386.field5074++;
                                                    class282.method1669(class520.field7510, false);
                                                }
                                                try {
                                                    if (class64.field835 != null && class40.field511.field6631 > 0) {
                                                        class527.field7780 += class40.field511.field6631;
                                                        class64.field835.method2475(0, (byte) 123, class40.field511.field6631, class40.field511.field6618);
                                                        class2.field17 = 0;
                                                        class40.field511.field6631 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var23) {
                                                    class461.method2721((byte) -76, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field2179;
                                        if (var21.field7562 < 0) {
                                            break;
                                        }
                                        var22 = class310.method1810(var21.field7673, 1182823664);
                                    } while (var22 == null || var22.field7717 == null || var22.field7717.length <= var21.field7562 || var22.field7717[var21.field7562] != var21);
                                    class239.method1444(var20);
                                }
                            }
                            var18 = var17.field2179;
                            if (var18.field7562 < 0) {
                                break;
                            }
                            var19 = class310.method1810(var18.field7673, 1182823664);
                        } while (var19 == null || var19.field7717 == null || var19.field7717.length <= var18.field7562 || var19.field7717[var18.field7562] != var18);
                        class239.method1444(var17);
                    }
                }
                var15 = var14.field2179;
                if (var15.field7562 < 0) {
                    break;
                }
                var16 = class310.method1810(var15.field7673, 1182823664);
            } while (var16 == null || var16.field7717 == null || var16.field7717.length <= var15.field7562 || var16.field7717[var15.field7562] != var15);
            class239.method1444(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 2926)
    private final void method1247(byte arg0) {
        field2556++;
        if (class483.field7059 == 13) {
            return;
        }
        long var2 = class101.method759(0) / 1000000L - class495.field7190;
        class495.field7190 = class101.method759(0) / 1000000L;
        boolean var4 = class69.method609((byte) 121);
        if (var4 && class45.field538 && class347.field4463 != null) {
            class347.field4463.method87(0);
        }
        if (class370.method2109((byte) -90, class483.field7059)) {
            if (class356.field4576 != 0L && class504.method3034((byte) -125) > class356.field4576) {
                class163.method1052(false, (byte) 119, class407.field5817.field3644, class407.field5817.field3643, class191.method1184(false));
            } else if (!class33.field416.method362() && class83.field1046) {
                class53.method523(-7340);
            }
        }
        if (class24.field347 == null) {
            Container var5;
            if (class123.field1656 == null) {
                var5 = class219.field2794.field6891;
            } else {
                var5 = class123.field1656;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class123.field1656 == var5) {
                Insets var8 = class123.field1656.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class250.field3209 != var6 || class3.field33 != var7) {
                if (class33.field416 == null || class33.field416.method339()) {
                    class460.method2715((byte) 63);
                } else {
                    class250.field3209 = var6;
                    class3.field33 = var7;
                }
                class356.field4576 = class504.method3034((byte) -118) + 500L;
            }
        }
        if (class24.field347 != null && !class534.field7855 && class370.method2109((byte) -90, class483.field7059)) {
            class163.method1052(false, (byte) 77, -1, -1, class407.field5817.field3635);
        }
        boolean var9 = false;
        if (class140.field1805) {
            var9 = true;
            class140.field1805 = false;
        }
        if (var9) {
            class160.method1032((byte) 75);
        }
        if (class33.field416 != null && class33.field416.method362() || class191.method1184(false) != 1) {
            class68.method604(-9192);
        }
        if (class483.field7059 == 0) {
            class516.method3083(class338.field4246[class288.field3682], class118.field1587, var9, arg0 - 91, class249.field3192[class288.field3682], class64.field833[class288.field3682], class495.field7196);
        } else if (class483.field7059 == 1) {
            class523.method3110(var9 | class33.field416.method362(), 12373, class91.field1116, class249.field3192[class288.field3682].getRGB(), class64.field833[class288.field3682].getRGB(), class338.field4246[class288.field3682].getRGB(), class33.field416);
        } else if (class483.field7059 == 2) {
            class434.method2541(5);
        } else if (class483.field7059 == 6) {
            class434.method2541(arg0 - 85);
        } else if (class268.method1594(3, class483.field7059)) {
            if (class384.field5058 == 1) {
                if (class141.field1833 > class327.field4133) {
                    class327.field4133 = class141.field1833;
                }
                int var11 = (class327.field4133 - class141.field1833) * 50 / class327.field4133;
                class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(-26539, class11.field177) + "<br>(" + var11 + "%)", true);
            } else if (class384.field5058 == 2) {
                if (class466.field6742 < class308.field3948) {
                    class466.field6742 = class308.field3948;
                }
                int var10 = ((class466.field6742 - class308.field3948) * 50 / class466.field6742) + 50;
                class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(-26539, class11.field177) + "<br>(" + var10 + "%)", true);
            } else {
                class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(-26539, class11.field177), true);
            }
        } else if (class483.field7059 == 9) {
            class293.method1721(arg0 + 36, var2);
        } else if (class483.field7059 == 12) {
            class151.method990(class460.field6579, (byte) 42, class141.field1814.method1936(-26539, class11.field177) + "<br>" + class160.field2046.method1936(-26539, class11.field177), true);
        }
        if (arg0 != 90) {
            field2573 = null;
        }
        if (class42.field519 == 3) {
            for (int var12 = 0; var12 < class65.field840; var12++) {
                Rectangle var13 = class463.field6651[var12];
                if (class508.field7311[var12]) {
                    class33.field416.method364(var13.width, var13.x, var13.height, var13.y, (byte) -48, -1996553985);
                } else if (class324.field4108[var12]) {
                    class33.field416.method364(var13.width, var13.x, var13.height, var13.y, (byte) -48, -1996554240);
                }
            }
        }
        if (class367.method2103(-22901)) {
            class310.method1809((byte) -92, class33.field416);
        }
        if (class370.method2109((byte) -90, class483.field7059) && class42.field519 == 0 && class191.method1184(false) == 1 && !var9 && class476.field6899.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class65.field840; var15++) {
                if (class324.field4108[var15]) {
                    class324.field4108[var15] = false;
                    class1.field6[var14++] = class463.field6651[var15];
                }
            }
            class33.field416.method319(class1.field6, var14);
        } else if (class483.field7059 != 0) {
            class33.field416.method288();
            for (int var16 = 0; var16 < class65.field840; var16++) {
                class324.field4108[var16] = false;
            }
        }
        if (class407.field5817.field3648 == 0) {
            class199.method1251(15L, (byte) 2);
        } else if (class407.field5817.field3648 == 1) {
            class199.method1251(10L, (byte) -10);
        } else if (class407.field5817.field3648 == 2) {
            class199.method1251(5L, (byte) 4);
        } else if (class407.field5817.field3648 == 3) {
            class199.method1251(2L, (byte) -63);
        }
        if (class23.field333) {
            class402.method2378(5);
        }
        if (class407.field5817.field3628 && class483.field7059 == 2 && class277.field3510 != -1) {
            class407.field5817.field3628 = false;
            class407.field5817.method578((byte) 102, class219.field2794);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhd;IIIIIIIII)V", line = 3168)
    public static final void method1248(class523[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class523 var11 = arg0[var10];
            if (var11 != null && var11.field7673 == arg1) {
                int var12 = var11.field7623 + arg6;
                int var13 = var11.field7660 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field7632 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field7617 + var12;
                    int var19 = var11.field7574 + var13;
                    if (var11.field7632 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field7632 == 0 || var11.field7634 || method1226(var11).field942 != 0 || class177.field2338 == var11 || class322.field4091 == var11.field7650) {
                    if (!method1238(var11)) {
                        if (class233.field2985 == var11) {
                            class337.field4240 = true;
                            class257.field3268 = var12;
                            class282.field3587 = var13;
                        }
                        if (var11.field7655 || var14 < var16 && var15 < var17) {
                            if (var11.field7711 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class170 var20 = (class170) class434.field6164.method153(0); var20 != null; var20 = (class170) class434.field6164.method161(-88)) {
                                    if (var20.field2176) {
                                        var20.method2165(16225);
                                        var20.field2179.field7727 = false;
                                    }
                                }
                                if (class52.field701 == 0) {
                                    class233.field2985 = null;
                                    class177.field2338 = null;
                                }
                                class446.field6396 = 0;
                                class173.field2250 = false;
                                class242.field3131 = false;
                                if (!class122.field1646) {
                                    class243.method1480(4);
                                }
                            }
                            boolean var21;
                            if (class204.field2664.method1333(7) >= var14 && class204.field2664.method1337(69) >= var15 && class204.field2664.method1333(7) < var16 && class204.field2664.method1337(69) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class211.field2717 && var21) {
                                if (var11.field7611 >= 0) {
                                    class236.field3000 = var11.field7611;
                                } else if (var11.field7711) {
                                    class236.field3000 = -1;
                                }
                            }
                            if (!class122.field1646 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class521.method3094(12, var11, arg9 - var13, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class204.field2664.method1336(7) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class494 var24 = (class494) class53.field706.method153(0);
                            if (var24 != null && var24.method2152(false) == 0 && var24.method2151(-87) >= var14 && var24.method2155((byte) -114) >= var15 && var24.method2151(-123) < var16 && var24.method2155((byte) -91) < var17) {
                                var23 = true;
                            }
                            if (var11.field7577 != null) {
                                for (int var25 = 0; var25 < var11.field7577.length; var25++) {
                                    if (class343.field4392.method834(false, var11.field7577[var25])) {
                                        if (var11.field7652 == null || class163.field2065 >= var11.field7652[var25]) {
                                            byte var26 = var11.field7646[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class343.field4392.method834(false, 86) && !class343.field4392.method834(false, 82) && !class343.field4392.method834(false, 81)) && ((var26 & 0x2) == 0 || class343.field4392.method834(false, 86)) && ((var26 & 0x1) == 0 || class343.field4392.method834(false, 82)) && ((var26 & 0x4) == 0 || class343.field4392.method834(false, 81))) {
                                                if (var25 < 10) {
                                                    class321.method1887(var11.field7723, "", -1, var25 + 1, 101);
                                                } else if (var25 == 10) {
                                                    class379.method2156(true);
                                                    class73 var27 = method1226(var11);
                                                    class40.method380(var11, 0, var27.field937, var27.method644((byte) 51));
                                                    class516.field7480 = class403.method2386(var11, (byte) 84);
                                                    if (class516.field7480 == null) {
                                                        class516.field7480 = "Null";
                                                    }
                                                    class446.field6389 = var11.field7592 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field7573[var25];
                                                if (var11.field7652 == null) {
                                                    var11.field7652 = new int[var11.field7577.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field7652[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field7652[var25] = class163.field2065 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field7652 != null) {
                                        var11.field7652[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class454.method2704(var11, var24.method2155((byte) -72) - var13, (byte) -74, var24.method2151(-82) - var12);
                            }
                            if (class233.field2985 != null && class233.field2985 != var11 && var21 && method1226(var11).method640((byte) -126)) {
                                class401.field5718 = var11;
                            }
                            if (class177.field2338 == var11) {
                                class382.field5029 = true;
                                class368.field4764 = var12;
                                class266.field3371 = var13;
                            }
                            if (var11.field7634 || var11.field7650 != 0) {
                                if (var21 && class109.field1364 != 0 && var11.field7718 != null) {
                                    class170 var29 = new class170();
                                    var29.field2176 = true;
                                    var29.field2179 = var11;
                                    var29.field2177 = class109.field1364;
                                    var29.field2178 = var11.field7718;
                                    class434.field6164.method163(var29, 0);
                                }
                                if (class233.field2985 != null || class122.field1646 || class493.field7170 != var11.field7650 && class446.field6396 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field7650 != 0) {
                                    if (class256.field3257 == var11.field7650 || class214.field2755 == var11.field7650) {
                                        class46.field561 = var11;
                                        if (class521.field7538 != null) {
                                            class521.field7538.method2035(class33.field416, var11.field7574, true);
                                        }
                                        if (class256.field3257 == var11.field7650) {
                                            if (!class122.field1646 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class203.method1275(arg8, arg9, class33.field416, 32597);
                                                for (class413 var30 = (class413) class45.field540.method2097((byte) 86); var30 != null; var30 = (class413) class45.field540.method2091(-1)) {
                                                    if (arg8 >= var30.field5883 && arg8 < var30.field5887 && arg9 >= var30.field5882 && arg9 < var30.field5885) {
                                                        class243.method1480(4);
                                                        class47.method458((byte) -43, var30.field5886);
                                                    }
                                                }
                                            }
                                            class534.method3160((byte) 112, var13, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class322.field4091 == var11.field7650) {
                                        if (var11.method3122(true, class33.field416) == null || class230.field2942 != 0 && class230.field2942 != 3 || class122.field1646 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field7663[var32];
                                        if (var31 < var33 || var31 > var11.field7642[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field7617 / 2;
                                        int var35 = var32 - var11.field7574 / 2;
                                        int var36;
                                        if (class142.field1835 == 4) {
                                            var36 = (int) class463.field6626 & 0x3FFF;
                                        } else {
                                            var36 = (int) class463.field6626 + class309.field3967 & 0x3FFF;
                                        }
                                        int var37 = class36.field443[var36];
                                        int var38 = class36.field478[var36];
                                        if (class142.field1835 != 4) {
                                            var37 = (class317.field4050 + 256) * var37 >> 8;
                                            var38 = (class317.field4050 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class142.field1835 == 4) {
                                            var41 = (class238.field3047 >> 7) + (var39 >> 2);
                                            var42 = (class527.field7783 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class23.field336.method1366((byte) -88) - 1) * 64;
                                            var41 = (class23.field336.field2666 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class23.field336.field2677 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class211.field2717 && (class92.field1125 & 0x40) != 0) {
                                            class523 var44 = class202.method1268(class21.field309, class322.field4090, 0);
                                            if (var44 == null) {
                                                class379.method2156(true);
                                            } else {
                                                class8.method45(22461, 1L, var11.field7567, var42, var41, class468.field6768, " ->", 60, false, class516.field7480, true);
                                            }
                                            continue;
                                        }
                                        if (class530.field7803 == class335.field4230) {
                                            class8.method45(22461, 1L, -1, var42, var41, -1, "", 17, false, class312.field3992.method1936(-26539, class11.field177), true);
                                        }
                                        class8.method45(22461, 1L, -1, var42, var41, class507.field7305, "", 15, false, class83.field1051, true);
                                        continue;
                                    }
                                    if (class493.field7170 == var11.field7650) {
                                        class78.field1021 = var11;
                                        if (var21) {
                                            class173.field2250 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method2151(-114) - var12 - var11.field7617 / 2) * 2.0D / (double) class241.field3107);
                                            int var46 = (int) (-((double) (var24.method2155((byte) -85) - var13 - var11.field7574 / 2) * 2.0D / (double) class241.field3107));
                                            int var47 = class175.field2277 + var45 + class241.field3112;
                                            int var48 = class38.field496 + var46 + class241.field3119;
                                            class159 var49 = class137.method942(-127);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1024(var47, (byte) -88, var50, var48);
                                            if (var50 != null) {
                                                if (class343.field4392.method834(false, 82) && class322.field4086 > 0) {
                                                    class521.method3101(var50[0], var50[2], false, var50[1]);
                                                    continue;
                                                }
                                                class242.field3131 = true;
                                                class201.field2617 = var50[0];
                                                class92.field1126 = var50[1];
                                                class498.field7219 = var50[2];
                                            }
                                            class446.field6396 = 1;
                                            class160.field2032 = false;
                                            class452.field6531 = class204.field2664.method1333(7);
                                            class501.field7242 = class204.field2664.method1337(69);
                                            continue;
                                        }
                                        if (var22 && class446.field6396 > 0) {
                                            if (class446.field6396 == 1 && (class452.field6531 != class204.field2664.method1333(7) || class501.field7242 != class204.field2664.method1337(69))) {
                                                class168.field2163 = class175.field2277;
                                                class233.field2972 = class38.field496;
                                                class446.field6396 = 2;
                                            }
                                            if (class446.field6396 == 2) {
                                                class160.field2032 = true;
                                                class480.method2927(class168.field2163 + (int) ((double) (class452.field6531 - class204.field2664.method1333(7)) * 2.0D / (double) class241.field3106), (byte) -49);
                                                class28.method215(class233.field2972 - (int) ((double) (class501.field7242 - class204.field2664.method1337(69)) * 2.0D / (double) class241.field3106), -1);
                                            }
                                            continue;
                                        }
                                        if (class446.field6396 > 0 && !class160.field2032) {
                                            if ((class295.field3791 == 1 || class52.method518(13)) && class2.field24 > 2) {
                                                class197.method1221(-127, class501.field7242, class452.field6531);
                                            } else if (class517.method3086(1723)) {
                                                class197.method1221(-127, class501.field7242, class452.field6531);
                                            }
                                        }
                                        class446.field6396 = 0;
                                        continue;
                                    }
                                    if (class279.field3518 == var11.field7650) {
                                        if (var22) {
                                            class230.method1395(class204.field2664.method1337(69) - var13, 113, var11.field7574, var11.field7617, class204.field2664.method1333(7) - var12);
                                        }
                                        continue;
                                    }
                                    if (class422.field5979 == var11.field7650) {
                                        class186.method1170(var12, 24, var13, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field7595 && var23) {
                                    var11.field7595 = true;
                                    if (var11.field7677 != null) {
                                        class170 var51 = new class170();
                                        var51.field2176 = true;
                                        var51.field2179 = var11;
                                        var51.field2175 = var24.method2151(-92) - var12;
                                        var51.field2177 = var24.method2155((byte) -19) - var13;
                                        var51.field2178 = var11.field7677;
                                        class434.field6164.method163(var51, 0);
                                    }
                                }
                                if (var11.field7595 && var22 && var11.field7572 != null) {
                                    class170 var52 = new class170();
                                    var52.field2176 = true;
                                    var52.field2179 = var11;
                                    var52.field2175 = class204.field2664.method1333(7) - var12;
                                    var52.field2177 = class204.field2664.method1337(69) - var13;
                                    var52.field2178 = var11.field7572;
                                    class434.field6164.method163(var52, 0);
                                }
                                if (var11.field7595 && !var22) {
                                    var11.field7595 = false;
                                    if (var11.field7641 != null) {
                                        class170 var53 = new class170();
                                        var53.field2176 = true;
                                        var53.field2179 = var11;
                                        var53.field2175 = class204.field2664.method1333(7) - var12;
                                        var53.field2177 = class204.field2664.method1337(69) - var13;
                                        var53.field2178 = var11.field7641;
                                        class165.field2100.method163(var53, 0);
                                    }
                                }
                                if (var22 && var11.field7612 != null) {
                                    class170 var54 = new class170();
                                    var54.field2176 = true;
                                    var54.field2179 = var11;
                                    var54.field2175 = class204.field2664.method1333(7) - var12;
                                    var54.field2177 = class204.field2664.method1337(69) - var13;
                                    var54.field2178 = var11.field7612;
                                    class434.field6164.method163(var54, 0);
                                }
                                if (!var11.field7727 && var21) {
                                    var11.field7727 = true;
                                    if (var11.field7705 != null) {
                                        class170 var55 = new class170();
                                        var55.field2176 = true;
                                        var55.field2179 = var11;
                                        var55.field2175 = class204.field2664.method1333(7) - var12;
                                        var55.field2177 = class204.field2664.method1337(69) - var13;
                                        var55.field2178 = var11.field7705;
                                        class434.field6164.method163(var55, 0);
                                    }
                                }
                                if (var11.field7727 && var21 && var11.field7676 != null) {
                                    class170 var56 = new class170();
                                    var56.field2176 = true;
                                    var56.field2179 = var11;
                                    var56.field2175 = class204.field2664.method1333(7) - var12;
                                    var56.field2177 = class204.field2664.method1337(69) - var13;
                                    var56.field2178 = var11.field7676;
                                    class434.field6164.method163(var56, 0);
                                }
                                if (var11.field7727 && !var21) {
                                    var11.field7727 = false;
                                    if (var11.field7648 != null) {
                                        class170 var57 = new class170();
                                        var57.field2176 = true;
                                        var57.field2179 = var11;
                                        var57.field2175 = class204.field2664.method1333(7) - var12;
                                        var57.field2177 = class204.field2664.method1337(69) - var13;
                                        var57.field2178 = var11.field7648;
                                        class165.field2100.method163(var57, 0);
                                    }
                                }
                                if (var11.field7672 != null) {
                                    class170 var58 = new class170();
                                    var58.field2179 = var11;
                                    var58.field2178 = var11.field7672;
                                    class170.field2182.method163(var58, 0);
                                }
                                if (var11.field7591 != null && class346.field4445 > var11.field7713) {
                                    if (var11.field7687 == null || class346.field4445 - var11.field7713 > 32) {
                                        class170 var63 = new class170();
                                        var63.field2179 = var11;
                                        var63.field2178 = var11.field7591;
                                        class434.field6164.method163(var63, 0);
                                    } else {
                                        label691: for (int var59 = var11.field7713; var59 < class346.field4445; var59++) {
                                            int var60 = class507.field7309[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field7687.length; var61++) {
                                                if (var11.field7687[var61] == var60) {
                                                    class170 var62 = new class170();
                                                    var62.field2179 = var11;
                                                    var62.field2178 = var11.field7591;
                                                    class434.field6164.method163(var62, 0);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7713 = class346.field4445;
                                }
                                if (var11.field7726 != null && class177.field2331 > var11.field7635) {
                                    if (var11.field7720 == null || class177.field2331 - var11.field7635 > 32) {
                                        class170 var68 = new class170();
                                        var68.field2179 = var11;
                                        var68.field2178 = var11.field7726;
                                        class434.field6164.method163(var68, 0);
                                    } else {
                                        label667: for (int var64 = var11.field7635; var64 < class177.field2331; var64++) {
                                            int var65 = class105.field1332[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field7720.length; var66++) {
                                                if (var11.field7720[var66] == var65) {
                                                    class170 var67 = new class170();
                                                    var67.field2179 = var11;
                                                    var67.field2178 = var11.field7726;
                                                    class434.field6164.method163(var67, 0);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7635 = class177.field2331;
                                }
                                if (var11.field7696 != null && class99.field1200 > var11.field7575) {
                                    if (var11.field7709 == null || class99.field1200 - var11.field7575 > 32) {
                                        class170 var73 = new class170();
                                        var73.field2179 = var11;
                                        var73.field2178 = var11.field7696;
                                        class434.field6164.method163(var73, 0);
                                    } else {
                                        label643: for (int var69 = var11.field7575; var69 < class99.field1200; var69++) {
                                            int var70 = class161.field2055[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field7709.length; var71++) {
                                                if (var11.field7709[var71] == var70) {
                                                    class170 var72 = new class170();
                                                    var72.field2179 = var11;
                                                    var72.field2178 = var11.field7696;
                                                    class434.field6164.method163(var72, 0);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7575 = class99.field1200;
                                }
                                if (var11.field7624 != null && class205.field2682 > var11.field7653) {
                                    if (var11.field7724 == null || class205.field2682 - var11.field7653 > 32) {
                                        class170 var78 = new class170();
                                        var78.field2179 = var11;
                                        var78.field2178 = var11.field7624;
                                        class434.field6164.method163(var78, 0);
                                    } else {
                                        label619: for (int var74 = var11.field7653; var74 < class205.field2682; var74++) {
                                            int var75 = class415.field5918[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field7724.length; var76++) {
                                                if (var11.field7724[var76] == var75) {
                                                    class170 var77 = new class170();
                                                    var77.field2179 = var11;
                                                    var77.field2178 = var11.field7624;
                                                    class434.field6164.method163(var77, 0);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7653 = class205.field2682;
                                }
                                if (var11.field7605 != null && class113.field1521 > var11.field7563) {
                                    if (var11.field7656 == null || class113.field1521 - var11.field7563 > 32) {
                                        class170 var83 = new class170();
                                        var83.field2179 = var11;
                                        var83.field2178 = var11.field7605;
                                        class434.field6164.method163(var83, 0);
                                    } else {
                                        label595: for (int var79 = var11.field7563; var79 < class113.field1521; var79++) {
                                            int var80 = class359.field4635[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field7656.length; var81++) {
                                                if (var11.field7656[var81] == var80) {
                                                    class170 var82 = new class170();
                                                    var82.field2179 = var11;
                                                    var82.field2178 = var11.field7605;
                                                    class434.field6164.method163(var82, 0);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7563 = class113.field1521;
                                }
                                if (class218.field2785 > var11.field7704 && var11.field7638 != null) {
                                    class170 var84 = new class170();
                                    var84.field2179 = var11;
                                    var84.field2178 = var11.field7638;
                                    class434.field6164.method163(var84, 0);
                                }
                                if (class72.field932 > var11.field7704 && var11.field7631 != null) {
                                    class170 var85 = new class170();
                                    var85.field2179 = var11;
                                    var85.field2178 = var11.field7631;
                                    class434.field6164.method163(var85, 0);
                                }
                                if (class510.field7368 > var11.field7704 && var11.field7651 != null) {
                                    class170 var86 = new class170();
                                    var86.field2179 = var11;
                                    var86.field2178 = var11.field7651;
                                    class434.field6164.method163(var86, 0);
                                }
                                if (class97.field1188 > var11.field7704 && var11.field7700 != null) {
                                    class170 var87 = new class170();
                                    var87.field2179 = var11;
                                    var87.field2178 = var11.field7700;
                                    class434.field6164.method163(var87, 0);
                                }
                                if (class106.field1342 > var11.field7704 && var11.field7665 != null) {
                                    class170 var88 = new class170();
                                    var88.field2179 = var11;
                                    var88.field2178 = var11.field7665;
                                    class434.field6164.method163(var88, 0);
                                }
                                var11.field7704 = class160.field2037;
                                if (var11.field7602 != null) {
                                    for (int var89 = 0; var89 < class346.field4439; var89++) {
                                        class170 var90 = new class170();
                                        var90.field2179 = var11;
                                        var90.field2181 = class389.field5220[var89].method1263((byte) -97);
                                        var90.field2171 = class389.field5220[var89].method1262(true);
                                        var90.field2178 = var11.field7602;
                                        class434.field6164.method163(var90, 0);
                                    }
                                }
                                if (class229.field2927 && var11.field7684 != null) {
                                    class170 var91 = new class170();
                                    var91.field2179 = var11;
                                    var91.field2178 = var11.field7684;
                                    class434.field6164.method163(var91, 0);
                                }
                            }
                            if (var11.field7632 == 5 && var11.field7730 != -1) {
                                var11.method3112(-128, class456.field6572, class375.field4840).method2035(class33.field416, var11.field7574, true);
                            }
                            class276.method1629(var11, -1);
                            if (var11.field7632 == 0) {
                                method1248(arg0, var11.field7723, var14, var15, var16, var17, var12 - var11.field7636, var13 - var11.field7659, arg8, arg9);
                                if (var11.field7717 != null) {
                                    method1248(var11.field7717, var11.field7723, var14, var15, var16, var17, var12 - var11.field7636, var13 - var11.field7659, arg8, arg9);
                                }
                                class175 var92 = (class175) class397.field5684.method2022(-1, (long) var11.field7723);
                                if (var92 != null) {
                                    if (class530.field7803 == class123.field1653 && var92.field2273 == 0 && !class122.field1646 && var21 && !class191.field2480) {
                                        class243.method1480(4);
                                    }
                                    class303.method1787(arg8, var92.field2279, (byte) 121, var15, var13, var12, var14, var17, var16, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class276.method1629(var11, -1);
                }
            }
        }
    }
}
