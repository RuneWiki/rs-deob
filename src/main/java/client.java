import jagex3.jagmisc.jagmisc;
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
public class client extends class319 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljj;")
    public static class398 field2993 = new class398(35, 4);

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[[J")
    public static long[][] field3004 = new long[8][256];

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "[J")
    public static long[] field3003 = new long[11];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lcb;")
    public static class318 field3006;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lcb;")
    public static class318 field3008;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field3010;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Ljava/lang/Class;")
    public static Class field3009;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1423(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field3004[0][var0] = class220.method1359(var14, class220.method1359(var6 << 8, class220.method1359(var10 << 16, class220.method1359(var12 << 24, class220.method1359(var4 << 32, class220.method1359(class220.method1359(var4 << 48, var4 << 56), var8 << 40))))));
            for (int var16 = 1; var16 < 8; var16++) {
                field3004[var16][var0] = class220.method1359(field3004[var16 - 1][var0] << 56, field3004[var16 - 1][var0] >>> 8);
            }
        }
        field3003[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field3003[var1] = class107.method573(class442.method2545(255L, field3004[7][var2 + 7]), class107.method573(class107.method573(class107.method573(class107.method573(class442.method2545(1095216660480L, field3004[3][var2 + 3]), class107.method573(class107.method573(class442.method2545(field3004[0][var2], -72057594037927936L), class442.method2545(71776119061217280L, field3004[1][var2 + 1])), class442.method2545(280375465082880L, field3004[2][var2 + 2]))), class442.method2545(4278190080L, field3004[4][var2 + 4])), class442.method2545(field3004[5][var2 + 5], 16711680L)), class442.method2545(field3004[6][var2 + 6], 65280L)));
        }
        field3006 = new class318(96, 12);
        field3008 = new class318(54, 6);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 5)
    public static final void method1399() {
        for (int var0 = 0; var0 < class85.field1046; var0++) {
            class293 var1 = class438.field6043[var0];
            class559.method3126(var1);
            class438.field6043[var0] = null;
        }
        class85.field1046 = 0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 18)
    private final void method1400(int arg0) {
        field3000++;
        if (class476.field6436 == 14) {
            return;
        }
        class430.field5984++;
        if (class430.field5984 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class24.field230 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class623.field8475.setSeed((long) class24.field230);
        }
        if (class430.field5984 % 50 == 0) {
            class61.field844 = class201.field2637;
            class659.field9295 = class6.field51;
            class201.field2637 = 0;
            class6.field51 = 0;
        }
        this.method1405(-8677);
        if (class240.field3147 != null) {
            class240.field3147.method3399(0);
        }
        class192.method1232(-59);
        class348.field5096.method30(0);
        class592.field8107.method262(-125);
        if (class9.field103 != null) {
            class9.field103.method785((int) class669.method3713(0));
        }
        class291.method1726(-106);
        if (arg0 > -78) {
            method1412();
        }
        class410.field5757 = 0;
        class18.field154 = 0;
        for (class136 var3 = class348.field5096.method31((byte) -60); var3 != null; var3 = class348.field5096.method31((byte) -60)) {
            int var6 = var3.method101(-14901);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method99(17220);
                if (class3.method14(-2) && var7 == '`' || var7 == '§') {
                    if (class547.method3078((byte) -116)) {
                        class383.method2311(31);
                    } else {
                        class77.method440((byte) -126);
                    }
                } else if (class18.field154 < 128) {
                    class143.field1818[class18.field154] = var3;
                    class18.field154++;
                }
            } else if (var6 == 0 && class410.field5757 < 75) {
                class223.field2879[class410.field5757] = var3;
                class410.field5757++;
            }
        }
        class627.field8530 = 0;
        for (class8 var4 = class592.field8107.method271(-22792); var4 != null; var4 = class592.field8107.method271(-22792)) {
            int var5 = var4.method57((byte) 111);
            if (var5 == -1) {
                class443.field6114.method378(var4, 31316);
            } else if (var5 == 6) {
                class627.field8530 += var4.method55((byte) 71);
            } else if (class581.method3261(-118, var5)) {
                class690.field9744.method378(var4, 31316);
                if (class690.field9744.method369(-19133) > 10) {
                    class690.field9744.method368(84);
                }
            }
        }
        if (class547.method3078((byte) -118)) {
            class70.method416(352805641);
        }
        if (class30.method187(124, class476.field6436)) {
            class463.method2618(-5823);
            class471.method2653(100);
        } else if (class213.method1325(false, class476.field6436)) {
            class225.method1379(21236);
        }
        if (class346.method2172((byte) -71, class476.field6436) && !class213.method1325(false, class476.field6436)) {
            this.method1415(1);
            class517.method2944((byte) 25);
            class259.method1624((byte) 28);
        } else if (class20.method113(113, class476.field6436) && !class213.method1325(false, class476.field6436)) {
            this.method1415(1);
            class259.method1624((byte) 28);
        } else if (class476.field6436 == 12) {
            class259.method1624((byte) 28);
        } else if (class90.method500((byte) 107, class476.field6436) && !class213.method1325(false, class476.field6436)) {
            class347.method2175(22190);
        } else if (class476.field6436 == 13) {
            class259.method1624((byte) 28);
            if (class309.field4139 != -3 && class309.field4139 != 2 && class309.field4139 != 15) {
                class511.method2893(1000000, false);
            }
        }
        class5.method33(class9.field103, (byte) 20);
        class690.field9744.method368(83);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 188)
    public final void method1401(int arg0) {
        field2996++;
        if (class161.field2038 == 2) {
            try {
                this.method1416(arg0 ^ 0xFFFFB5D2);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class282.method1694(var5.getMessage() + " (Recovered) " + this.method1421(5), (byte) 47, var5);
                class564.method3180(0, (byte) 31);
            }
        } else {
            this.method1416(23090);
        }
        if (arg0 != -4128) {
            this.method1416(115);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 213)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class35.method208("Argument count", 115);
            }
            class52.field675 = new class675();
            class52.field675.field9558 = Integer.parseInt(arg0[0]);
            class225.field2934 = new class675();
            class225.field2934.field9558 = Integer.parseInt(arg0[1]);
            class535.field7353 = new class675();
            class535.field7353.field9558 = Integer.parseInt(arg0[2]);
            class375.field5396 = class667.field9492;
            if (arg0[3].equals("live")) {
                class343.field5048 = class322.field4720;
            } else if (arg0[3].equals("rc")) {
                class343.field5048 = class664.field9401;
            } else if (arg0[3].equals("wip")) {
                class343.field5048 = class149.field1880;
            } else {
                class35.method208("modewhat", 96);
            }
            class350.field5121 = class609.method3359(arg0[4], 2);
            if (class350.field5121 == -1) {
                if (arg0[4].equals("english")) {
                    class350.field5121 = 0;
                } else if (arg0[4].equals("german")) {
                    class350.field5121 = 1;
                } else {
                    class35.method208("language", 75);
                }
            }
            class549.field7503 = false;
            class497.field6725 = false;
            if (arg0[5].equals("game0")) {
                class33.field322 = class369.field5313;
            } else if (arg0[5].equals("game1")) {
                class33.field322 = class411.field5764;
            } else {
                class35.method208("game", 92);
            }
            class52.field683 = false;
            class613.field8363 = "";
            class636.field8670 = 0L;
            class625.field8511 = 0;
            class474.field6404 = true;
            class575.field7963 = true;
            class624.field8479 = 0;
            class138.field1716 = class33.field322.field6547;
            class267.field3667 = null;
            class365.field5242 = false;
            class201.field2642 = 0;
            client var1 = new client();
            class167.field2083 = var1;
            var1.method2071(false, false, 1024, class343.field5048.method2402(17903) + 32, 34, 768, class33.field322.field6548, 613);
            class250.field3376.setLocation(40, 40);
        } catch (Exception var3) {
            class282.method1694(null, (byte) 47, var3);
        }
        field2998++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 290)
    public final void method1402(boolean arg0) {
        field2992++;
        if (class674.field9548) {
            class72.method426(89);
        }
        if (class9.field103 != null) {
            class9.field103.method3813(false);
        }
        if (class463.field6333 != null) {
            class157.method1050(class495.field6687, class463.field6333, 83);
            class463.field6333 = null;
        }
        if (class80.field1014 != null) {
            class80.field1014.method971(3289650);
            class80.field1014 = null;
        }
        class316.method2038(0);
        class311.field4180.method2839(0);
        class249.field3352.method2818((byte) 121);
        if (class237.field3082 != null) {
            class237.field3082.method1834((byte) -126);
            class237.field3082 = null;
        }
        if (!arg0) {
            field3006 = null;
        }
        try {
            class222.field2875.method1298(0);
            for (int var2 = 0; var2 < 34; var2++) {
                class471.field6372[var2].method1298(0);
            }
            class107.field1287.method1298(0);
            class80.field1011.method1298(0);
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 345)
    public final void method1403(byte arg0) {
        field2989++;
        method1417(7743);
        class164.method1105(-105);
        class19.method103(122);
        class243.method1490(92);
        class5.method34(93);
        class298.method1779((byte) 34);
        class55.method347(15830);
        class516.method2929(-7048);
        class477.method2674(-104);
        class28.method176((byte) -55);
        class487.method2710(11125);
        class436.method2509((byte) -126);
        class319.method2062(-49);
        class284.method1706((byte) -92);
        class409.method2403((byte) 86);
        class484.method2698(49);
        class111.method607(79);
        class689.method3808(false);
        class339.method2151((byte) 116);
        class59.method373(false);
        class52.method295(86);
        class502.method2833((byte) 122);
        class500.method2817((byte) -48);
        class621.method3395((byte) 108);
        class256.method1601(0);
        class159.method1061(100);
        class207.method1292(-119);
        class403.method2375(7);
        class560.method3132((byte) -116);
        class311.method1869(-51);
        class224.method1368(-3500);
        class626.method3421(12341);
        class411.method2409(0);
        class169.method1130(-103);
        class30.method183((byte) -52);
        class615.method3379(5);
        class433.method2489(24);
        class294.method1748(-3);
        class37.method215(36);
        class150.method1014((byte) -94);
        class618.method3388((byte) -92);
        class197.method1257((byte) -93);
        class383.method2316(19775);
        class129.method772(-2);
        class209.method1310(-59);
        class157.method1051((byte) -89);
        class570.method3220((byte) -115);
        class132.method865((byte) -3);
        class29.method179((byte) 65);
        class528.method3005(0);
        class461.method2608(-66);
        class151.method1017(32768);
        class637.method3470((byte) -80);
        class140.method968((byte) -108);
        class318.method2058((byte) 124);
        class306.method1841(43);
        class98.method537(97);
        class245.method1505(-10914);
        class110.method587((byte) 118);
        class250.method1561(0);
        class147.method1002((byte) 116);
        class361.method2217(95);
        class188.method1218(-2843);
        class519.method2961(512);
        class607.method3352(-12480);
        class80.method457(77);
        class33.method196(0);
        class39.method236(86);
        class301.method1808(-33);
        class446.method2561((byte) 120);
        class192.method1231(0);
        class172.method1147(-1);
        class676.method3735(78);
        class524.method2991(104);
        class266.method1643(23599);
        class307.method1843(109);
        class56.method351(20547);
        class643.method3582(19);
        class179.method1175(89);
        class468.method2641(-92);
        class204.method1281(0);
        class669.method3711(16777215);
        class105.method563(true);
        class40.method245(120);
        class106.method565(0);
        class675.method3730(3673);
        class559.method3123(-24836);
        class421.method2442(true);
        class248.method1552(false);
        class16.method85(15969);
        class483.method2697(23411);
        class495.method2793((byte) 97);
        class463.method2619(true);
        class589.method3288((byte) -92);
        class629.method3439(true);
        class208.method1305(32250);
        class108.method579(-15939);
        class258.method1621(116);
        class252.method1569(-13386);
        class238.method1477(-112);
        class72.method427(-2);
        class195.method1248(true);
        class660.method3666(-24546);
        class428.method2462(-9321);
        class276.method1682((byte) -33);
        class352.method2201(34);
        class185.method1188(false);
        class598.method3309((byte) -61);
        class309.method1849((byte) -118);
        class683.method3779(true);
        class54.method343(28021);
        class648.method3601((byte) -123);
        class445.method2557(92);
        class578.method3250((byte) -21);
        class395.method2347((byte) -125);
        class14.method82(24);
        class38.method222(false);
        class155.method1028(-7174);
        class77.method436((byte) 60);
        class104.method560(124);
        class128.method771((byte) -100);
        class292.method1733(2000);
        class268.method1654((byte) -124);
        class465.method2636(2048);
        class609.method3358(false);
        class377.method2290(4);
        class639.method3476(100);
        class332.method2122(false);
        class561.method3158();
        class596.method3304(255);
        class661.method3673((byte) 100);
        class326.method2088(68);
        class501.method2825((byte) 107);
        class267.method1651((byte) -89);
        class66.method396(true);
        class293.method1740(29182);
        class631.method3444(106);
        class95.method524(-103);
        class162.method1096(107);
        class168.method1116(119);
        class117.method709();
        class571.method3226(Integer.MIN_VALUE);
        class296.method1769(-23245);
        class413.method2420(0);
        class511.method2889((byte) -109);
        class557.method3119(15628);
        class317.method2042();
        class645.method3588((byte) -122);
        class70.method417(true);
        class588.method3285(true);
        class540.method3045();
        class679.method3751(true);
        class338.method2150((byte) 53);
        class582.method3267(-1);
        class672.method3720(1528141512);
        class425.method2454((byte) 106);
        class175.method1163(8);
        class92.method508((byte) -85);
        class218.method1344((byte) -10);
        class123.method761(16);
        class331.method2121(116);
        class650.method3608(21918);
        class142.method974((byte) 69);
        class249.method1554(122);
        class82.method464(-32472);
        class255.method1596(Integer.MIN_VALUE);
        class451.method2570(-1);
        class49.method288(-1);
        class642.method3570();
        class594.method3301((byte) -122);
        class190.method1222((byte) 91);
        class552.method3092(true);
        class154.method1027(10716);
        class423.method2444();
        class681.method3761(-23712);
        class328.method2102((byte) 74);
        class137.method893(10527);
        class149.method1007(-3517);
        class9.method60(-1162158679);
        class513.method2901();
        class490.method2723(41447496);
        class283.method1702(-1);
        class235.method1459((byte) -68);
        class186.method1193((byte) -3);
        class677.method3745(1);
        class579.method3257((byte) -64);
        class363.method2233(false);
        class603.method3335((byte) 93);
        class24.method144(-1);
        class315.method2033(1);
        class604.method3339(3143);
        class189.method1219(1297579256);
        class535.method3024((byte) 111);
        class350.method2187((byte) 72);
        class145.method988(-114);
        class125.method763(-121);
        class497.method2801(false);
        class576.method3247(0);
        class241.method1486(false);
        class562.method3171((byte) -112);
        class665.method3695((byte) 12);
        class542.method3058(false);
        class620.method3393(2162);
        class397.method2353(true);
        class431.method2483((byte) 72);
        class68.method407((byte) -2);
        class375.method2285((byte) 19);
        class572.method3234(true);
        class270.method1657(22376);
        class419.method2432(0);
        class452.method2572((byte) -111);
        class156.method1036(true);
        class608.method3353((byte) 112);
        class551.method3091(21268);
        class22.method125(98209161);
        class558.method3122((byte) -70);
        class20.method112(111739425);
        class67.method401(true);
        class44.method260(-61);
        class577.method3248(-127);
        class606.method3351(false);
        class261.method1633(32);
        class314.method2029(10187);
        class448.method2564(true);
        class118.method724((byte) 121);
        class667.method3701(118);
        class316.method2037(26764);
        class194.method1236(0);
        class422.method2443((byte) -126);
        class430.method2477((byte) -23);
        class79.method455(-108);
        class464.method2630(89);
        class34.method206(-1);
        class356.method2211(-16136);
        class240.method1485(false);
        class51.method291((byte) 0);
        class365.method2238(0);
        class449.method2567(-1);
        class462.method2615(true);
        class65.method391((byte) -124);
        class653.method3619((byte) 56);
        class655.method3627();
        class341.method2162((byte) 106);
        class291.method1727((byte) 68);
        class31.method189(5);
        class236.method1462(119);
        class673.method3722(-18269);
        class257.method1619((byte) -115);
        class541.method3051((byte) -126);
        class58.method362(0);
        class304.method1830((byte) 74);
        class592.method3296((byte) 127);
        class613.method3374((byte) -53);
        class46.method280((byte) -76);
        class93.method518((byte) -20);
        class202.method1275(-127);
        class360.method2215((byte) -105);
        class61.method381(-32529);
        class299.method1783(0);
        class554.method3106(4);
        class166.method1108(true);
        class63.method383(1);
        class223.method1364(15284);
        class233.method1433();
        class78.method444((byte) -89);
        class635.method3465((byte) -122);
        class585.method3276();
        class17.method93();
        class191.method1228(0);
        class227.method1392(2048);
        class435.method2498();
        class349.method2179((byte) 69);
        class485.method2703((byte) 86);
        class355.method2208((byte) 100);
        class45.method276((byte) -70);
        class48.method285(2);
        class32.method194(0);
        class277.method1683(-5);
        class550.method3090((byte) 109);
        class144.method985((byte) -78);
        class35.method210(true);
        class380.method2303(false);
        class544.method3062(-1);
        class548.method3083(78);
        class654.method3623(true);
        class508.method2873();
        class47.method281(5);
        class649.method3607(-70);
        class220.method1357(false);
        class327.method2098((byte) 110);
        class237.method1464((byte) 105);
        class109.method581((byte) -46);
        class539.method3039(-1);
        class658.method3641((byte) 37);
        class369.method2265(true);
        class668.method3706(-5);
        class101.method548((byte) 109);
        class587.method3282((byte) 0);
        class211.method1319(117);
        class530.method3013(121);
        class321.method2076(12622);
        class7.method45(false);
        class372.method2277(true);
        class527.method2997(1);
        class641.method3503(120);
        class659.method3646(126);
        class96.method530((byte) -120);
        class442.method2540(0);
        class107.method567(false);
        class506.method2860(false);
        class367.method2264(-71);
        class343.method2168(33985);
        class120.method736(75);
        class254.method1589((byte) -124);
        class379.method2294((byte) 118);
        class690.method3823((byte) -88);
        class459.method2594(48);
        class457.method2583(109);
        class322.method2077(-1);
        class312.method1941(-103);
        class102.method551(false);
        class680.method3756(4);
        class494.method2790(128);
        class492.method2779((byte) 54);
        class488.method2717((byte) 118);
        class537.method3034(-74);
        class143.method979((byte) 121);
        class222.method1361((byte) -102);
        class580.method3260(95);
        class275.method1680(53);
        class547.method3079(3);
        class565.method3197((byte) -101);
        class50.method289(2287);
        class73.method431(-253);
        class401.method2369((byte) 40);
        class417.method2425((byte) -25);
        class381.method2307(false);
        class113.method631();
        class481.method2683(true);
        class597.method3306((byte) 83);
        class563.method3176(409);
        class201.method1269(124);
        class21.method115((byte) -89);
        class533.method3021(0);
        class86.method480(77);
        class2.method12(-13256);
        class453.method2574((byte) 115);
        class187.method1199((byte) 75);
        class652.method3615(0);
        class11.method70(-96);
        class429.method2470((byte) -127);
        class623.method3406(-16777216);
        class340.method2160(-39);
        class3.method16(-2092);
        class671.method3716(1);
        class632.method3447(-1);
        class426.method2456(109);
        class348.method2178(true);
        class251.method1562((byte) 115);
        class161.method1095(58);
        class420.method2440((byte) -11);
        class15.method84(0);
        class353.method2204(true);
        class85.method476(105);
        class244.method1493(-90);
        class666.method3698(-1);
        class480.method2680(2048);
        class505.method2855(124);
        class644.method3583(512);
        class115.method699();
        class628.method3430((byte) 95);
        class36.method214();
        class622.method3403(-89);
        int var2 = 73 % ((-arg0 - 82) / 38);
        class388.method2324(1);
        class471.method2647((byte) -7);
        class486.method2707((byte) -30);
        class60.method380(-1);
        class171.method1141(66);
        class167.method1113((byte) 6);
        class517.method2938((byte) 77);
        class564.method3177(20000);
        class529.method3009((byte) -124);
        class335.method2139(36161);
        class370.method2274(-108);
        class518.method2949(-122);
        class599.method3318(34336);
        class638.method3475(70);
        class441.method2528(false);
        class210.method1317((byte) -97);
        class200.method1268((byte) 58);
        class393.method2335(19);
        class226.method1387(-5);
        class139.method962(-4);
        class288.method1719((byte) -118);
        class333.method2126(40);
        class482.method2688(-1573699607);
        class476.method2668(false);
        class438.method2517((byte) 120);
        class198.method1261(49);
        class100.method547(26792);
        class662.method3674(116);
        class581.method3263(-24537);
        class454.method2578(false);
        class170.method1136(false);
        class216.method1335(-16013);
        class253.method1582((byte) 76);
        class521.method2976(22278);
        class390.method2328(75);
        class691.method3826((byte) 47);
        class323.method2079(109);
        class489.method2719((byte) -94);
        class42.method254(28584);
        class88.method493(true);
        class282.method1699(1);
        class305.method1833(8716);
        class303.method1826(-1);
        class460.method2596(255);
        class273.method1664(1);
        class127.method769(17429);
        class410.method2405(0);
        class357.method2212((byte) -58);
        class386.method2322(-125);
        class320.method2073(-26);
        class4.method24((byte) -77);
        class624.method3411(0);
        class523.method2987((byte) 103);
        class23.method139(true);
        class297.method1774(103);
        class664.method3676((byte) 115);
        class376.method2288(-115);
        class364.method2235(-85);
        class99.method542((byte) -99);
        class536.method3031((byte) -36);
        class234.method1449(85);
        class466.method2639((byte) -52);
        class373.method2279(-113);
        class573.method3240(false);
        class286.method1714((byte) -112);
        class443.method2549(23685);
        class545.method3070(-49);
        class1.method2(-2);
        class396.method2350(36);
        class285.method1711(-12);
        class473.method2657((byte) 38);
        class177.method1167(7);
        class531.method3017(0);
        class575.method3246(-128);
        class612.method3369(16);
        class394.method2344((byte) 103);
        class119.method725(false);
        class121.method740(false);
        class8.method54(-15685);
        class427.method2460((byte) -54);
        class75.method433(true);
        class103.method558((byte) 124);
        class69.method409(16);
        class91.method502(16416);
        class18.method98(5);
        class265.method1638(0);
        class278.method1685((byte) 119);
        class503.method2845(-78);
        class611.method3364(51);
        class627.method3422(-1);
        class640.method3482(-1);
        class12.method72(0);
        class274.method1671(23408);
        class180.method1180(true);
        class199.method1264((byte) -107);
        class228.method1397(-18734);
        class131.method863(-9027);
        class87.method486(22250);
        class165.method1106((byte) 126);
        class141.method972(38);
        class456.method2581(4);
        class630.method3442(-8917);
        class225.method1377((byte) 75);
        class308.method1845(true);
        class41.method250(-14522);
        class440.method2524((byte) 114);
        if (class319.field4690) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfca;IIIIIIIII)V", line = 835)
    public static final void method1404(class188[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class188 var11 = arg0[var10];
            if (var11 != null && var11.field2414 == arg1) {
                int var12 = var11.field2305 + arg6;
                int var13 = var11.field2428 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2304 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2438 + var12;
                    int var19 = var11.field2371 + var13;
                    if (var11.field2304 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2304 == 0 || var11.field2440 || method1411(var11).field3648 != 0 || class278.field3766 == var11 || class327.field4781 == var11.field2412) {
                    if (!method1409(var11)) {
                        if (class377.field5414 == var11 && class506.method2858(-2, class377.field5414) != null) {
                            class648.field9191 = true;
                            class104.field1267 = var12;
                            class384.field5574 = var13;
                        }
                        if (var11.field2426 || var14 < var16 && var15 < var17) {
                            if (var11.field2382 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class425 var20 = (class425) class380.field5450.method374((byte) 48); var20 != null; var20 = (class425) class380.field5450.method372(-20740)) {
                                    if (var20.field5902) {
                                        var20.method175(30604);
                                        var20.field5911.field2393 = false;
                                    }
                                }
                                if (class436.field6020 == 0) {
                                    class377.field5414 = null;
                                    class278.field3766 = null;
                                }
                                class614.field8380 = 0;
                                class85.field1040 = false;
                                class200.field2629 = false;
                                if (!class483.field6542) {
                                    class142.method975((byte) -111);
                                }
                            }
                            boolean var21;
                            if (class592.field8107.method268((byte) -105) >= var14 && class592.field8107.method269((byte) -25) >= var15 && class592.field8107.method268((byte) -109) < var16 && class592.field8107.method269((byte) -25) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class613.field8378 && var21) {
                                if (var11.field2398 >= 0) {
                                    class664.field9413 = var11.field2398;
                                } else if (var11.field2382) {
                                    class664.field9413 = -1;
                                }
                            }
                            if (!class483.field6542 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class645.method3589((byte) -116, arg9 - var13, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class592.field8107.method258(-7) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class8 var24 = (class8) class690.field9744.method374((byte) 51);
                            if (var24 != null && var24.method57((byte) -45) == 0 && var24.method51(1) >= var14 && var24.method49((byte) -31) >= var15 && var24.method51(1) < var16 && var24.method49((byte) -31) < var17) {
                                var23 = true;
                            }
                            if (var11.field2419 != null && !class547.method3078((byte) -124)) {
                                for (int var25 = 0; var25 < var11.field2419.length; var25++) {
                                    if (class348.field5096.method32(var11.field2419[var25], -115)) {
                                        if (var11.field2400 == null || class430.field5984 >= var11.field2400[var25]) {
                                            byte var26 = var11.field2378[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class348.field5096.method32(86, -113) && !class348.field5096.method32(82, -109) && !class348.field5096.method32(81, -112)) && ((var26 & 0x2) == 0 || class348.field5096.method32(86, -116)) && ((var26 & 0x1) == 0 || class348.field5096.method32(82, -111)) && ((var26 & 0x4) == 0 || class348.field5096.method32(81, -108))) {
                                                if (var25 < 10) {
                                                    class296.method1771(var25 + 1, 2, -1, "", var11.field2387);
                                                } else if (var25 == 10) {
                                                    class497.method2800((byte) -100);
                                                    class266 var27 = method1411(var11);
                                                    class208.method1301(var11, var27.field3647, (byte) 93, var27.method1645(false));
                                                    class306.field4114 = class28.method177(var11, 64);
                                                    if (class306.field4114 == null) {
                                                        class306.field4114 = "Null";
                                                    }
                                                    class665.field9444 = var11.field2307 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2325[var25];
                                                if (var11.field2400 == null) {
                                                    var11.field2400 = new int[var11.field2419.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2400[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2400[var25] = class430.field5984 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2400 != null) {
                                        var11.field2400[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class614.method3377(var11, var24.method51(1) - var12, var24.method49((byte) -31) - var13, 128);
                            }
                            if (class377.field5414 != null && class377.field5414 != var11 && var21 && method1411(var11).method1642(-2659)) {
                                class570.field7894 = var11;
                            }
                            if (class278.field3766 == var11) {
                                class172.field2156 = true;
                                class497.field6716 = var12;
                                class632.field8579 = var13;
                            }
                            if (var11.field2440 || var11.field2412 != 0) {
                                if (var21 && class627.field8530 != 0 && var11.field2405 != null) {
                                    class425 var29 = new class425();
                                    var29.field5902 = true;
                                    var29.field5911 = var11;
                                    var29.field5903 = class627.field8530;
                                    var29.field5913 = var11.field2405;
                                    class380.field5450.method378(var29, 31316);
                                }
                                if (class377.field5414 != null || class483.field6542 || class350.field5115 != var11.field2412 && class614.field8380 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2412 != 0) {
                                    if (class668.field9502 == var11.field2412 || class659.field9288 == var11.field2412) {
                                        class166.field2077 = var11;
                                        if (class397.field5668 != null) {
                                            class397.field5668.method996(var11.field2371, (byte) 126, class9.field103);
                                        }
                                        if (class668.field9502 == var11.field2412) {
                                            if (!class483.field6542 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class559.method3127(class9.field103, arg9, -31424, arg8);
                                                for (class184 var30 = (class184) class69.field909.method2224((byte) -112); var30 != null; var30 = (class184) class69.field909.method2222((byte) -128)) {
                                                    if (arg8 >= var30.field2267 && arg8 < var30.field2265 && arg9 >= var30.field2264 && arg9 < var30.field2263) {
                                                        class142.method975((byte) 113);
                                                        class384.method2319(var30.field2268, -30470);
                                                    }
                                                }
                                            }
                                            class519.method2951(-127, var11, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class327.field4781 == var11.field2412) {
                                        if (var11.method1207(class9.field103, 8) == null || class325.field4740 != 0 && class325.field4740 != 3 || class483.field6542 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2381[var32];
                                        if (var31 < var33 || var31 > var11.field2327[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2438 / 2;
                                        int var35 = var32 - var11.field2371 / 2;
                                        int var36;
                                        if (class42.field546 == 4) {
                                            var36 = (int) class620.field8432 & 0x3FFF;
                                        } else {
                                            var36 = (int) class620.field8432 + class254.field3506 & 0x3FFF;
                                        }
                                        int var37 = class654.field9259[var36];
                                        int var38 = class654.field9260[var36];
                                        if (class42.field546 != 4) {
                                            var37 = (class461.field6281 + 256) * var37 >> 8;
                                            var38 = (class461.field6281 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class42.field546 == 4) {
                                            var41 = (class294.field3939 >> 9) + (var39 >> 2);
                                            var42 = (class86.field1068 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class596.field8164.method241(-25747) - 1) * 256;
                                            var41 = (class596.field8164.field3929 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class596.field8164.field3917 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class613.field8378 && (class525.field7268 & 0x40) != 0) {
                                            class188 var44 = class630.method3443(class68.field898, -1, class59.field828);
                                            if (var44 == null) {
                                                class497.method2800((byte) -77);
                                            } else {
                                                class606.method3350(var42, 1L, false, var41, class306.field4114, class413.field5798, 46, " ->", var11.field2324, true, false);
                                            }
                                            continue;
                                        }
                                        if (class411.field5764 == class33.field322) {
                                            class606.method3350(var42, 1L, false, var41, class243.field3238.method1491(class350.field5121, (byte) 127), -1, 19, "", -1, true, false);
                                        }
                                        class606.method3350(var42, 1L, false, var41, class477.field6442, class188.field2422, 58, "", -1, true, false);
                                        continue;
                                    }
                                    if (class350.field5115 == var11.field2412) {
                                        class29.field285 = var11;
                                        if (var21) {
                                            class85.field1040 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method51(1) - var12 - var11.field2438 / 2) * 2.0D / (double) class561.field7651);
                                            int var46 = (int) (-((double) (var24.method49((byte) -31) - var13 - var11.field2371 / 2) * 2.0D / (double) class561.field7651));
                                            int var47 = class52.field677 + var45 + class561.field7661;
                                            int var48 = class351.field5122 + var46 + class561.field7675;
                                            class250 var49 = class198.method1262((byte) 127);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1556(var48, var50, 0, var47);
                                            if (var50 != null) {
                                                if (class348.field5096.method32(82, -117) && class485.field6560 > 0) {
                                                    class282.method1695(var50[0], var50[2], var50[1], (byte) 48);
                                                    continue;
                                                }
                                                class200.field2629 = true;
                                                class593.field8129 = var50[0];
                                                class193.field2507 = var50[1];
                                                class629.field8559 = var50[2];
                                            }
                                            class614.field8380 = 1;
                                            class80.field1013 = false;
                                            class363.field5238 = class592.field8107.method268((byte) -85);
                                            class223.field2895 = class592.field8107.method269((byte) -25);
                                            continue;
                                        }
                                        if (var22 && class614.field8380 > 0) {
                                            if (class614.field8380 == 1 && (class363.field5238 != class592.field8107.method268((byte) -80) || class223.field2895 != class592.field8107.method269((byte) -25))) {
                                                class661.field9380 = class52.field677;
                                                class251.field3383 = class351.field5122;
                                                class614.field8380 = 2;
                                            }
                                            if (class614.field8380 == 2) {
                                                class80.field1013 = true;
                                                class367.method2261(class661.field9380 + (int) ((double) (class363.field5238 - class592.field8107.method268((byte) -89)) * 2.0D / (double) class561.field7650), (byte) 124);
                                                class353.method2203((byte) -32, class251.field3383 - (int) ((double) (class223.field2895 - class592.field8107.method269((byte) -25)) * 2.0D / (double) class561.field7650));
                                            }
                                            continue;
                                        }
                                        if (class614.field8380 > 0 && !class80.field1013) {
                                            if ((class291.field3890 == 1 || class292.method1729(131)) && class179.field2242 > 2) {
                                                class294.method1741(class223.field2895, (byte) -8, class363.field5238);
                                            } else if (class554.method3110(false)) {
                                                class294.method1741(class223.field2895, (byte) -8, class363.field5238);
                                            }
                                        }
                                        class614.field8380 = 0;
                                        continue;
                                    }
                                    if (class9.field87 == var11.field2412) {
                                        if (var22) {
                                            class312.method1921(2, class592.field8107.method269((byte) -25) - var13, var11.field2438, var11.field2371, class592.field8107.method268((byte) -106) - var12);
                                        }
                                        continue;
                                    }
                                    if (class456.field6218 == var11.field2412) {
                                        class497.method2803(var12, var11, var13, true);
                                        continue;
                                    }
                                }
                                if (!var11.field2452 && var23) {
                                    var11.field2452 = true;
                                    if (var11.field2303 != null) {
                                        class425 var51 = new class425();
                                        var51.field5902 = true;
                                        var51.field5911 = var11;
                                        var51.field5904 = var24.method51(1) - var12;
                                        var51.field5903 = var24.method49((byte) -31) - var13;
                                        var51.field5913 = var11.field2303;
                                        class380.field5450.method378(var51, 31316);
                                    }
                                }
                                if (var11.field2452 && var22 && var11.field2377 != null) {
                                    class425 var52 = new class425();
                                    var52.field5902 = true;
                                    var52.field5911 = var11;
                                    var52.field5904 = class592.field8107.method268((byte) -82) - var12;
                                    var52.field5903 = class592.field8107.method269((byte) -25) - var13;
                                    var52.field5913 = var11.field2377;
                                    class380.field5450.method378(var52, 31316);
                                }
                                if (var11.field2452 && !var22) {
                                    var11.field2452 = false;
                                    if (var11.field2435 != null) {
                                        class425 var53 = new class425();
                                        var53.field5902 = true;
                                        var53.field5911 = var11;
                                        var53.field5904 = class592.field8107.method268((byte) -80) - var12;
                                        var53.field5903 = class592.field8107.method269((byte) -25) - var13;
                                        var53.field5913 = var11.field2435;
                                        class560.field7634.method378(var53, 31316);
                                    }
                                }
                                if (var22 && var11.field2388 != null) {
                                    class425 var54 = new class425();
                                    var54.field5902 = true;
                                    var54.field5911 = var11;
                                    var54.field5904 = class592.field8107.method268((byte) -105) - var12;
                                    var54.field5903 = class592.field8107.method269((byte) -25) - var13;
                                    var54.field5913 = var11.field2388;
                                    class380.field5450.method378(var54, 31316);
                                }
                                if (!var11.field2393 && var21) {
                                    var11.field2393 = true;
                                    if (var11.field2384 != null) {
                                        class425 var55 = new class425();
                                        var55.field5902 = true;
                                        var55.field5911 = var11;
                                        var55.field5904 = class592.field8107.method268((byte) -89) - var12;
                                        var55.field5903 = class592.field8107.method269((byte) -25) - var13;
                                        var55.field5913 = var11.field2384;
                                        class380.field5450.method378(var55, 31316);
                                    }
                                }
                                if (var11.field2393 && var21 && var11.field2450 != null) {
                                    class425 var56 = new class425();
                                    var56.field5902 = true;
                                    var56.field5911 = var11;
                                    var56.field5904 = class592.field8107.method268((byte) -122) - var12;
                                    var56.field5903 = class592.field8107.method269((byte) -25) - var13;
                                    var56.field5913 = var11.field2450;
                                    class380.field5450.method378(var56, 31316);
                                }
                                if (var11.field2393 && !var21) {
                                    var11.field2393 = false;
                                    if (var11.field2397 != null) {
                                        class425 var57 = new class425();
                                        var57.field5902 = true;
                                        var57.field5911 = var11;
                                        var57.field5904 = class592.field8107.method268((byte) -109) - var12;
                                        var57.field5903 = class592.field8107.method269((byte) -25) - var13;
                                        var57.field5913 = var11.field2397;
                                        class560.field7634.method378(var57, 31316);
                                    }
                                }
                                if (var11.field2395 != null) {
                                    class425 var58 = new class425();
                                    var58.field5911 = var11;
                                    var58.field5913 = var11.field2395;
                                    class149.field1878.method378(var58, 31316);
                                }
                                if (var11.field2341 != null && class290.field3885 > var11.field2363) {
                                    if (var11.field2442 == null || class290.field3885 - var11.field2363 > 32) {
                                        class425 var63 = new class425();
                                        var63.field5911 = var11;
                                        var63.field5913 = var11.field2341;
                                        class380.field5450.method378(var63, 31316);
                                    } else {
                                        label694: for (int var59 = var11.field2363; var59 < class290.field3885; var59++) {
                                            int var60 = class77.field961[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2442.length; var61++) {
                                                if (var11.field2442[var61] == var60) {
                                                    class425 var62 = new class425();
                                                    var62.field5911 = var11;
                                                    var62.field5913 = var11.field2341;
                                                    class380.field5450.method378(var62, 31316);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2363 = class290.field3885;
                                }
                                if (var11.field2339 != null && class379.field5444 > var11.field2348) {
                                    if (var11.field2407 == null || class379.field5444 - var11.field2348 > 32) {
                                        class425 var68 = new class425();
                                        var68.field5911 = var11;
                                        var68.field5913 = var11.field2339;
                                        class380.field5450.method378(var68, 31316);
                                    } else {
                                        label670: for (int var64 = var11.field2348; var64 < class379.field5444; var64++) {
                                            int var65 = class390.field5613[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field2407.length; var66++) {
                                                if (var11.field2407[var66] == var65) {
                                                    class425 var67 = new class425();
                                                    var67.field5911 = var11;
                                                    var67.field5913 = var11.field2339;
                                                    class380.field5450.method378(var67, 31316);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2348 = class379.field5444;
                                }
                                if (var11.field2354 != null && class341.field5016 > var11.field2356) {
                                    if (var11.field2448 == null || class341.field5016 - var11.field2356 > 32) {
                                        class425 var73 = new class425();
                                        var73.field5911 = var11;
                                        var73.field5913 = var11.field2354;
                                        class380.field5450.method378(var73, 31316);
                                    } else {
                                        label646: for (int var69 = var11.field2356; var69 < class341.field5016; var69++) {
                                            int var70 = class223.field2903[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2448.length; var71++) {
                                                if (var11.field2448[var71] == var70) {
                                                    class425 var72 = new class425();
                                                    var72.field5911 = var11;
                                                    var72.field5913 = var11.field2354;
                                                    class380.field5450.method378(var72, 31316);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2356 = class341.field5016;
                                }
                                if (var11.field2451 != null && class492.field6662 > var11.field2449) {
                                    if (var11.field2337 == null || class492.field6662 - var11.field2449 > 32) {
                                        class425 var78 = new class425();
                                        var78.field5911 = var11;
                                        var78.field5913 = var11.field2451;
                                        class380.field5450.method378(var78, 31316);
                                    } else {
                                        label622: for (int var74 = var11.field2449; var74 < class492.field6662; var74++) {
                                            int var75 = class519.field7186[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2337.length; var76++) {
                                                if (var11.field2337[var76] == var75) {
                                                    class425 var77 = new class425();
                                                    var77.field5911 = var11;
                                                    var77.field5913 = var11.field2451;
                                                    class380.field5450.method378(var77, 31316);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2449 = class492.field6662;
                                }
                                if (var11.field2460 != null && class375.field5399 > var11.field2326) {
                                    if (var11.field2369 == null || class375.field5399 - var11.field2326 > 32) {
                                        class425 var83 = new class425();
                                        var83.field5911 = var11;
                                        var83.field5913 = var11.field2460;
                                        class380.field5450.method378(var83, 31316);
                                    } else {
                                        label598: for (int var79 = var11.field2326; var79 < class375.field5399; var79++) {
                                            int var80 = class283.field3828[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field2369.length; var81++) {
                                                if (var11.field2369[var81] == var80) {
                                                    class425 var82 = new class425();
                                                    var82.field5911 = var11;
                                                    var82.field5913 = var11.field2460;
                                                    class380.field5450.method378(var82, 31316);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2326 = class375.field5399;
                                }
                                if (class265.field3631 > var11.field2385 && var11.field2321 != null) {
                                    class425 var84 = new class425();
                                    var84.field5911 = var11;
                                    var84.field5913 = var11.field2321;
                                    class380.field5450.method378(var84, 31316);
                                }
                                if (class309.field4142 > var11.field2385 && var11.field2465 != null) {
                                    class425 var85 = new class425();
                                    var85.field5911 = var11;
                                    var85.field5913 = var11.field2465;
                                    class380.field5450.method378(var85, 31316);
                                }
                                if (class157.field1971 > var11.field2385 && var11.field2320 != null) {
                                    class425 var86 = new class425();
                                    var86.field5911 = var11;
                                    var86.field5913 = var11.field2320;
                                    class380.field5450.method378(var86, 31316);
                                }
                                if (class319.field4665 > var11.field2385 && var11.field2466 != null) {
                                    class425 var87 = new class425();
                                    var87.field5911 = var11;
                                    var87.field5913 = var11.field2466;
                                    class380.field5450.method378(var87, 31316);
                                }
                                if (class451.field6151 > var11.field2385 && var11.field2342 != null) {
                                    class425 var88 = new class425();
                                    var88.field5911 = var11;
                                    var88.field5913 = var11.field2342;
                                    class380.field5450.method378(var88, 31316);
                                }
                                var11.field2385 = class141.field1800;
                                if (var11.field2425 != null) {
                                    for (int var89 = 0; var89 < class18.field154; var89++) {
                                        class425 var90 = new class425();
                                        var90.field5911 = var11;
                                        var90.field5905 = class143.field1818[var89].method97(false);
                                        var90.field5909 = class143.field1818[var89].method99(17220);
                                        var90.field5913 = var11.field2425;
                                        class380.field5450.method378(var90, 31316);
                                    }
                                }
                                if (class528.field7312 && var11.field2416 != null) {
                                    class425 var91 = new class425();
                                    var91.field5911 = var11;
                                    var91.field5913 = var11.field2416;
                                    class380.field5450.method378(var91, 31316);
                                }
                            }
                            if (var11.field2304 == 5 && var11.field2310 != -1) {
                                var11.method1217(class603.field8243, (byte) -125, class502.field6772).method996(var11.field2371, (byte) 126, class9.field103);
                            }
                            class664.method3687(1640, var11);
                            if (var11.field2304 == 0) {
                                method1404(arg0, var11.field2387, var14, var15, var16, var17, var12 - var11.field2315, var13 - var11.field2431, arg8, arg9);
                                if (var11.field2352 != null) {
                                    method1404(var11.field2352, var11.field2387, var14, var15, var16, var17, var12 - var11.field2315, var13 - var11.field2431, arg8, arg9);
                                }
                                class524 var92 = (class524) class54.field742.method2506(107, (long) var11.field2387);
                                if (var92 != null) {
                                    if (class369.field5313 == class33.field322 && var92.field7255 == 0 && !class483.field6542 && var21 && !class380.field5455) {
                                        class142.method975((byte) -120);
                                    }
                                    class665.method3688(var13, var92.field7256, arg9, var14, var17, var15, var16, (byte) 95, var12, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class664.method3687(1640, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1737)
    private final void method1405(int arg0) {
        if (arg0 != -8677) {
            return;
        }
        field2999++;
        boolean var2 = class311.field4180.method2843(-18);
        if (!var2) {
            this.method1408(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1753)
    public static final void method1406() {
        class335.field4941 = 0;
        for (int var0 = 0; var0 < class306.field4106; var0++) {
            class676 var1 = ((class637) class77.field955.method2506(69, (long) class690.field9742[var0])).field8702;
            if (var1.field487 && var1.method234(false) != -1) {
                int var2 = (var1.method241(-25747) - 1) * 256 + 252;
                int var3 = var1.field3929 - var2 >> 9;
                int var4 = var1.field3917 - var2 >> 9;
                class39 var5 = class88.method499(var3, var1.field3925, -91, var4);
                if (var5 != null) {
                    int var6 = var5.field463;
                    if (var5 instanceof class676) {
                        var6 += 2048;
                    }
                    if (var5.field427 == 0 && var5.method234(false) != -1) {
                        class612.field8354[class335.field4941] = var6;
                        class127.field1611[class335.field4941] = var6;
                        class335.field4941++;
                        var5.field427++;
                    }
                    class612.field8354[class335.field4941] = var6;
                    class127.field1611[class335.field4941] = var1.field463 + 2048;
                    class335.field4941++;
                    var5.field427++;
                }
            }
        }
        class324.method2083(0, class612.field8354, 1, class127.field1611, class335.field4941 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfca;)Lfca;", line = 1803)
    public static final class188 method1407(class188 arg0) {
        int var1 = method1411(arg0).method1644(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class557.method3117(arg0.field2414, (byte) 71);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 1825)
    private final void method1408(boolean arg0) {
        field3001++;
        if (class3.field27 < class311.field4180.field6800) {
            class79.field1002.method3726(123);
            class151.field1901 = (class311.field4180.field6800 - 1) * 5 * 50;
            if (class151.field1901 > 3000) {
                class151.field1901 = 3000;
            }
            if (class311.field4180.field6800 >= 2 && class311.field4180.field6803 == 6) {
                this.method2063(-17312, "js5connect_outofdate");
                class476.field6436 = 14;
                return;
            }
            if (class311.field4180.field6800 >= 4 && class311.field4180.field6803 == -1) {
                this.method2063(-17312, "js5crc");
                class476.field6436 = 14;
                return;
            }
            if (class311.field4180.field6800 >= 4 && class30.method187(126, class476.field6436)) {
                if (class311.field4180.field6803 == 7 || class311.field4180.field6803 == 9) {
                    this.method2063(-17312, "js5connect_full");
                } else if (class311.field4180.field6803 > 0) {
                    this.method2063(-17312, "js5connect");
                } else {
                    this.method2063(-17312, "js5io");
                }
                class476.field6436 = 14;
                return;
            }
        }
        class3.field27 = class311.field4180.field6800;
        if (arg0) {
            return;
        }
        if (class151.field1901 > 0) {
            class151.field1901--;
            return;
        }
        try {
            if (class379.field5446 == 0) {
                class545.field7475 = class79.field1002.method3729(-101, class495.field6687);
                class379.field5446++;
            }
            if (class379.field5446 == 1) {
                if (class545.field7475.field3773 == 2) {
                    this.method1414(0, 1000);
                    return;
                }
                if (class545.field7475.field3773 == 1) {
                    class379.field5446++;
                }
            }
            if (class379.field5446 == 2) {
                class14.field121 = new class52((Socket) class545.field7475.field3772, class495.field6687);
                class138 var2 = new class138(5);
                var2.method951((byte) -82, class393.field5631.field4951);
                var2.method906(-1, 613);
                class14.field121.method298(3, 0, 5, var2.field1712);
                class379.field5446++;
                class556.field7594 = class669.method3713(0);
            }
            if (class379.field5446 == 3) {
                if (class30.method187(127, class476.field6436) || class14.field121.method299(0) > 0) {
                    int var3 = class14.field121.method294((byte) 102);
                    if (var3 != 0) {
                        this.method1414(0, var3);
                        return;
                    }
                    class379.field5446++;
                } else if (class669.method3713(0) - class556.field7594 > 30000L) {
                    this.method1414(0, 1001);
                    return;
                }
            }
            if (class379.field5446 == 4) {
                boolean var4 = class30.method187(121, class476.field6436) || class346.method2172((byte) 127, class476.field6436) || class20.method113(55, class476.field6436);
                class311.field4180.method2831(!var4, class14.field121, -6849);
                class379.field5446 = 0;
                class545.field7475 = null;
                class14.field121 = null;
            }
        } catch (IOException var5) {
            this.method1414(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfca;)Z", line = 1968)
    public static final boolean method1409(class188 arg0) {
        if (class380.field5455) {
            if (method1411(arg0).field3648 != 0) {
                return false;
            }
            if (arg0.field2304 == 0) {
                return false;
            }
        }
        return arg0.field2351;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1982)
    public static final void method1410() {
        int var0 = class654.field9256;
        int[] var1 = class123.field1595;
        int var2 = class360.field5199 ? var0 : class306.field4106 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class39 var4;
            if (var3 < var0) {
                var4 = class292.field3912[var1[var3]];
            } else {
                var4 = ((class637) class77.field955.method2506(33, (long) class690.field9742[var3 - var0])).field8702;
            }
            if (var4.field435 >= 0) {
                int var5 = var4.method241(-25747);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3929 & 0x1FF) == 0 && (var4.field3917 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3929 & 0x1FF) == 256 && (var4.field3917 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class519 && var4.field525 != null && class430.field5984 >= var4.field525.field7905 && class430.field5984 < var4.field525.field7907) {
                    ((class519) var4).field7175 = false;
                }
                var4.field3930 = class394.method2340(var4.field3929, -1, var4.field3925, var4.field3917);
                class621.method3396(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfca;)Lsca;", line = 2027)
    public static final class266 method1411(class188 arg0) {
        class266 var1 = (class266) class363.field5237.method2506(28, ((long) arg0.field2387 << 32) + (long) arg0.field2361);
        return var1 == null ? arg0.field2415 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2033)
    public static final void method1412() {
        int var0 = class654.field9256;
        int[] var1 = class123.field1595;
        boolean var2 = class72.field935.field6503 == 1 && var0 > 200 || class72.field935.field6503 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class519 var13 = class292.field3912[var1[var3]];
            if (var13.method2955((byte) -119)) {
                var13.method233((byte) 123);
                if (var13.field3921 >= 0 && var13.field3920 >= 0 && var13.field3928 < class588.field8082 && var13.field3923 < class12.field113) {
                    var13.field7175 = var13.field456 ? var2 : false;
                    if (class596.field8164 == var13) {
                        var13.field435 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field487) {
                            var14++;
                        }
                        if (var13.field431 > class430.field5984) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method241(-25747) << 2);
                        if (var13.field7158) {
                            var15 += 512;
                        } else {
                            if (class9.field98 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field435 = var15 + 1;
                    }
                } else {
                    var13.field435 = -1;
                }
            } else {
                var13.field435 = -1;
            }
        }
        for (int var4 = 0; var4 < class306.field4106; var4++) {
            class676 var10 = ((class637) class77.field955.method2506(22, (long) class690.field9742[var4])).field8702;
            if (var10.method3733((byte) -119) && var10.field9594.method1247(false, class327.field4771)) {
                var10.method233((byte) -123);
                if (var10.field3921 >= 0 && var10.field3920 >= 0 && var10.field3928 < class588.field8082 && var10.field3923 < class12.field113) {
                    int var11 = 0;
                    if (!var10.field487) {
                        var11++;
                    }
                    if (var10.field431 > class430.field5984) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method241(-25747) << 2);
                    if (class9.field98 == 0) {
                        if (var10.field9594.field2542) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class9.field98 == 1) {
                        if (var10.field9594.field2542) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field9594.field2565) {
                        var12 += 1024;
                    } else if (!var10.field9594.field2551) {
                        var12 += 256;
                    }
                    var10.field435 = var12 + 1;
                } else {
                    var10.field435 = -1;
                }
            } else {
                var10.field435 = -1;
            }
        }
        for (int var5 = 0; var5 < class249.field3357.length; var5++) {
            class90 var6 = class249.field3357[var5];
            if (var6 != null) {
                if (var6.field1099 == 1) {
                    class637 var7 = (class637) class77.field955.method2506(100, (long) var6.field1106);
                    if (var7 != null) {
                        class676 var8 = var7.field8702;
                        if (var8.field435 >= 0) {
                            var8.field435 += 2048;
                        }
                    }
                } else if (var6.field1099 == 10) {
                    class519 var9 = class292.field3912[var6.field1106];
                    if (var9 != null && class596.field8164 != var9 && var9.field435 >= 0) {
                        var9.field435 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 2198)
    public static final void method1413() {
        for (int var0 = 0; var0 < class588.field8082; var0++) {
            int[] var1 = class65.field860[var0];
            for (int var2 = 0; var2 < class12.field113; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2227)
    private final void method1414(int arg0, int arg1) {
        class14.field121 = null;
        class311.field4180.field6803 = arg1;
        class379.field5446 = arg0;
        field2990++;
        class545.field7475 = null;
        class311.field4180.field6800++;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2241)
    private final void method1415(int arg0) {
        if (class476.field6436 == 7 && class243.field3275 == 0) {
            if (class412.field5780 > 1) {
                class451.field6151 = class141.field1800;
                class412.field5780--;
            }
            if (!class483.field6542) {
                class142.method975((byte) -108);
            }
            for (int var2 = 0; var2 < 100 && class110.method589(-32543); var2++) {
            }
        }
        field3002++;
        class323.field4732++;
        class519.method2951(0, null, -1, -1);
        class497.method2803(-1, null, -1, true);
        class669.method3714(-29745);
        class141.field1800++;
        for (int var3 = 0; var3 < class327.field4786; var3++) {
            class676 var4 = class42.field541[var3].field8702;
            if (var4 != null) {
                byte var5 = var4.field9594.field2562;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method241(arg0 - 25748);
                    if ((var5 & 0x2) != 0 && var4.field520 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field526[0] + var7;
                            int var10 = var4.field516[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class588.field8082 - var6 - 1)) {
                                var9 = class588.field8082 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class12.field113 - var6 - 1)) {
                                var10 = class12.field113 - var6 - 1;
                            }
                            int var11 = class25.method146(var9, var4.field516[0], var6, class517.field7136, var10, -1, 0, true, 0, class364.field5239, class624.field8489[var4.field3925], (byte) -55, var6, var6, var4.field526[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field526[var12] = class517.field7136[var11 - var12 - 1];
                                    var4.field516[var12] = class364.field5239[var11 - var12 - 1];
                                    var4.field517[var12] = 1;
                                }
                                var4.field520 = var11;
                            }
                        }
                    }
                    class506.method2865(true, 0, var4);
                    int var13 = class594.method3299(arg0 ^ 0x101, var4);
                    class691.method3827(var13, class660.field9342, class224.field2917, var4, true);
                    class287.method1718((byte) -75, var4);
                }
            }
        }
        if (class243.field3275 == 0 && class335.field4936 == 0) {
            if (class42.field546 == 2) {
                class257.method1618((byte) -69);
            } else {
                class284.method1705(arg0 + 1);
            }
            if (class132.field1679 >> 9 < 14 || class132.field1679 >> 9 >= class588.field8082 - 14 || class471.field6379 >> 9 < 14 || class12.field113 - 14 <= class471.field6379 >> 9) {
                class228.method1396(2024967811);
            }
        }
        while (true) {
            class425 var14;
            class188 var15;
            class188 var16;
            do {
                var14 = (class425) class149.field1878.method368(116);
                if (var14 == null) {
                    while (true) {
                        class425 var17;
                        class188 var18;
                        class188 var19;
                        do {
                            var17 = (class425) class560.field7634.method368(59);
                            if (var17 == null) {
                                while (true) {
                                    class425 var20;
                                    class188 var21;
                                    class188 var22;
                                    do {
                                        var20 = (class425) class380.field5450.method368(arg0 ^ 0x31);
                                        if (var20 == null) {
                                            if (class377.field5414 != null) {
                                                class691.method3825((byte) 5);
                                            }
                                            if (class430.field5984 % 1500 == 0) {
                                                class70.method414(-113);
                                            }
                                            if (class476.field6436 == 7 && class243.field3275 == 0) {
                                                class401.method2365(arg0 - 115);
                                            }
                                            class347.method2176(-124);
                                            if (class674.field9548 && (class669.method3713(0) - 60000L) > class125.field1607) {
                                                class72.method426(81);
                                            }
                                            if (arg0 != 1) {
                                                field3007 = -124;
                                            }
                                            for (class394 var23 = (class394) class245.field3296.method2224((byte) -112); var23 != null; var23 = (class394) class245.field3296.method2222((byte) -79)) {
                                                if (((long) var23.field5651) < (class669.method3713(0) / 1000L - 5L)) {
                                                    if (var23.field5652 > 0) {
                                                        class334.method2133("", 5, "", var23.field5647 + class243.field3230.method1491(class350.field5121, (byte) 126), 0, arg0 ^ 0xFFFFFFA7, "");
                                                    }
                                                    if (var23.field5652 == 0) {
                                                        class334.method2133("", 5, "", var23.field5647 + class243.field3231.method1491(class350.field5121, (byte) 125), 0, -47, "");
                                                    }
                                                    var23.method2357(3553);
                                                }
                                            }
                                            if (class476.field6436 == 7 && class243.field3275 == 0) {
                                                if (class80.field1014 == null) {
                                                    class511.method2893(arg0 ^ 0xF4241, false);
                                                    return;
                                                }
                                                class462.field6305++;
                                                if (class462.field6305 > 50) {
                                                    class460.field6265++;
                                                    class389.method2326((byte) 118, class270.field3681);
                                                }
                                                try {
                                                    if (class80.field1014 != null && class253.field3491.field1745 > 0) {
                                                        class201.field2637 += class253.field3491.field1745;
                                                        class80.field1014.method969(class253.field3491.field1712, 0, -11679, class253.field3491.field1745);
                                                        class462.field6305 = 0;
                                                        class253.field3491.field1745 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class511.method2893(1000000, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5911;
                                        if (var21.field2361 < 0) {
                                            break;
                                        }
                                        var22 = class557.method3117(var21.field2414, (byte) 71);
                                    } while (var22 == null || var22.field2352 == null || var22.field2352.length <= var21.field2361 || var22.field2352[var21.field2361] != var21);
                                    class317.method2051(var20);
                                }
                            }
                            var18 = var17.field5911;
                            if (var18.field2361 < 0) {
                                break;
                            }
                            var19 = class557.method3117(var18.field2414, (byte) 71);
                        } while (var19 == null || var19.field2352 == null || var18.field2361 >= var19.field2352.length || var19.field2352[var18.field2361] != var18);
                        class317.method2051(var17);
                    }
                }
                var15 = var14.field5911;
                if (var15.field2361 < 0) {
                    break;
                }
                var16 = class557.method3117(var15.field2414, (byte) 71);
            } while (var16 == null || var16.field2352 == null || var16.field2352.length <= var15.field2361 || var16.field2352[var15.field2361] != var15);
            class317.method2051(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2525)
    private final void method1416(int arg0) {
        field2995++;
        if (class476.field6436 == 14) {
            return;
        }
        long var2 = class545.method3071(true) / 1000000L - class312.field4372;
        class312.field4372 = class545.method3071(true) / 1000000L;
        if (arg0 != 23090) {
            return;
        }
        boolean var4 = class646.method3593(arg0 - 1979);
        if (var4 && class677.field9606 && class571.field7908 != null) {
            class571.field7908.method3604(1);
        }
        if (class253.method1586(class476.field6436, arg0 - 23101)) {
            if (class204.field2681 != 0L && class204.field2681 < class669.method3713(arg0 ^ 0x5A32)) {
                class587.method3284(class72.field935.field6539, arg0 ^ 0x5540, class72.field935.field6524, class42.method252(-128), false);
            } else if (!class9.field103.method1899() && class309.field4140) {
                class449.method2568(false);
            }
        }
        if (class463.field6333 == null) {
            Container var5;
            if (class250.field3376 != null) {
                var5 = class250.field3376;
            } else if (class372.field5359 == null) {
                var5 = class575.field7958;
            } else {
                var5 = class372.field5359;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class250.field3376 == var5) {
                Insets var8 = class250.field3376.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class227.field2965 != var6 || class649.field9200 != var7 || class327.field4770) {
                if (class9.field103 == null || class9.field103.method1992()) {
                    class304.method1829(-2);
                } else {
                    class227.field2965 = var6;
                    class649.field9200 = var7;
                }
                class204.field2681 = class669.method3713(arg0 ^ 0x5A32) + 500L;
                class327.field4770 = false;
            }
        }
        if (class463.field6333 != null && !class594.field8144 && class253.method1586(class476.field6436, -11)) {
            class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
        }
        boolean var9 = false;
        if (class569.field7877) {
            var9 = true;
            class569.field7877 = false;
        }
        if (var9) {
            class660.method3659(-1);
        }
        if (class9.field103 != null && class9.field103.method1899() || class42.method252(-128) != 1) {
            class578.method3251((byte) 127);
        }
        if (class30.method187(127, class476.field6436)) {
            class211.method1320(var9, arg0 ^ 0xFFFFBD10);
        } else if (class577.method3249(class476.field6436, -7)) {
            class45.method275(-115);
        } else if (class292.method1737(class476.field6436, -120)) {
            class45.method275(arg0 ^ 0xFFFFA5B3);
        } else if (class213.method1325(false, class476.field6436)) {
            if (class690.field9746 == 1) {
                if (class158.field1980 > class3.field24) {
                    class3.field24 = class158.field1980;
                }
                int var11 = (class3.field24 - class158.field1980) * 50 / class3.field24;
                class82.method463(class243.field3176.method1491(class350.field5121, (byte) 125) + "<br>(" + var11 + "%)", class395.field5658, arg0 ^ 0x5A6C, true);
            } else if (class690.field9746 == 2) {
                if (class499.field6742 < class398.field5673) {
                    class499.field6742 = class398.field5673;
                }
                int var10 = (class499.field6742 - class398.field5673) * 50 / class499.field6742 + 50;
                class82.method463(class243.field3176.method1491(class350.field5121, (byte) 125) + "<br>(" + var10 + "%)", class395.field5658, 48, true);
            } else {
                class82.method463(class243.field3176.method1491(class350.field5121, (byte) 125), class395.field5658, arg0 - 23005, true);
            }
        } else if (class476.field6436 == 10) {
            class624.method3412((byte) -9, var2);
        } else if (class476.field6436 == 13) {
            class82.method463(class243.field3178.method1491(class350.field5121, (byte) 125) + "<br>" + class243.field3179.method1491(class350.field5121, (byte) 125), class395.field5658, arg0 ^ 0x5A6B, true);
        }
        if (class664.field9418 == 3) {
            for (int var12 = 0; var12 < class264.field3629; var12++) {
                Rectangle var13 = class121.field1564[var12];
                if (class643.field9112[var12]) {
                    class9.field103.method3811(var13.y, var13.width, var13.height, var13.x, -1996553985, arg0 ^ 0x5A12);
                } else if (class224.field2912[var12]) {
                    class9.field103.method3811(var13.y, var13.width, var13.height, var13.x, -1996554240, arg0 ^ 0x5A77);
                }
            }
        }
        if (class547.method3078((byte) -116)) {
            class71.method421(class9.field103, arg0 - 16800306);
        }
        if (class495.field6687.field1357 && class253.method1586(class476.field6436, arg0 ^ 0xFFFFA5C7) && class664.field9418 == 0 && class42.method252(-128) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class264.field3629; var17++) {
                if (class224.field2912[var17]) {
                    class224.field2912[var17] = false;
                    class535.field7359[var16++] = class121.field1564[var17];
                }
            }
            try {
                class9.field103.method803(class535.field7359, var16);
            } catch (class352 var18) {
            }
        } else if (class476.field6436 != 0) {
            for (int var14 = 0; var14 < class264.field3629; var14++) {
                class224.field2912[var14] = false;
            }
            try {
                class9.field103.method805();
            } catch (class352 var19) {
                class282.method1694(var19.getMessage() + " (Recovered) " + this.method1421(arg0 - 23085), (byte) 47, var19);
                class564.method3180(0, (byte) 120);
            }
        }
        if (class72.field935.field6518 == 0) {
            class660.method3668(arg0 - 23091, 15L);
        } else if (class72.field935.field6518 == 1) {
            class660.method3668(-1, 10L);
        } else if (class72.field935.field6518 == 2) {
            class660.method3668(-1, 5L);
        } else if (class72.field935.field6518 == 3) {
            class660.method3668(-1, 2L);
        }
        if (class525.field7265) {
            class47.method282(2);
        }
        if (class72.field935.field6520 && class476.field6436 == 3 && class316.field4599 != -1) {
            class72.field935.field6520 = false;
            class72.field935.method1856(0, class495.field6687);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2774)
    public static void method1417(int arg0) {
        field3008 = null;
        if (arg0 != 7743) {
            field3007 = -26;
        }
        field2993 = null;
        field3006 = null;
        field3003 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2788)
    public final void method1418(int arg0) {
        int var2 = -126 / ((arg0 + 18) / 34);
        field2997++;
        if (class161.field2038 != 2) {
            this.method1400(-103);
            return;
        }
        try {
            this.method1400(-87);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class282.method1694(var6.getMessage() + " (Recovered) " + this.method1421(5), (byte) 47, var6);
            class564.method3180(0, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2811)
    public final void init() {
        field3005++;
        if (!this.method2059(92)) {
            return;
        }
        class52.field675 = new class675();
        class52.field675.field9558 = Integer.parseInt(this.getParameter("worldid"));
        class225.field2934 = new class675();
        class225.field2934.field9558 = Integer.parseInt(this.getParameter("lobbyid"));
        class225.field2934.field9560 = this.getParameter("lobbyaddress");
        class535.field7353 = new class675();
        class535.field7353.field9558 = Integer.parseInt(this.getParameter("demoid"));
        class535.field7353.field9560 = this.getParameter("demoaddress");
        class375.field5396 = class562.method3169(Integer.parseInt(this.getParameter("modewhere")), 124);
        if (class667.field9492 == class375.field5396) {
            class375.field5396 = class335.field4924;
        } else if (!class123.method754(class375.field5396, -24883) && class375.field5396 != class333.field4859) {
            class375.field5396 = class333.field4859;
        }
        class343.field5048 = class56.method352(Integer.parseInt(this.getParameter("modewhat")), false);
        if (class343.field5048 != class149.field1880 && class664.field9401 != class343.field5048 && class343.field5048 != class322.field4720) {
            class343.field5048 = class322.field4720;
        }
        try {
            class350.field5121 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class350.field5121 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class549.field7503 = true;
        } else {
            class549.field7503 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class497.field6725 = true;
        } else {
            class497.field6725 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class498.field6735 = true;
        } else {
            class498.field6735 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class33.field322 = class369.field5313;
            } else if (var4.equals("1")) {
                class33.field322 = class411.field5764;
            }
        }
        try {
            class625.field8511 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class625.field8511 = 0;
        }
        class50.field667 = this.getParameter("quiturl");
        class613.field8363 = this.getParameter("settings");
        if (class613.field8363 == null) {
            class613.field8363 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class624.field8479 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class624.field8479 = 0;
            }
        }
        class138.field1716 = Integer.parseInt(this.getParameter("colourid"));
        if (class138.field1716 < 0 || class140.field1788.length <= class138.field1716) {
            class138.field1716 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class474.field6404 = true;
            class575.field7963 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class365.field5242 = true;
        }
        class267.field3667 = this.getParameter("sskey");
        if (class267.field3667 != null && class267.field3667.length() < 2) {
            class267.field3667 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class52.field683 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class201.field2642 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class636.field8670 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        if (class369.field5313 == class33.field322) {
            class384.field5582 = 503;
            class432.field5995 = 765;
        } else if (class411.field5764 == class33.field322) {
            class384.field5582 = 480;
            class432.field5995 = 640;
        }
        class167.field2083 = this;
        this.method2064(34, 613, (byte) 68, class343.field5048.method2402(17903) + 32, class432.field5995, class33.field322.field6548, class384.field5582);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2961)
    public static final void method1419(int arg0) {
        int var1 = class654.field9256;
        int[] var2 = class123.field1595;
        int var3 = class360.field5199 ? var1 : class306.field4106 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class39 var5;
            if (var4 < var1) {
                var5 = class292.field3912[var2[var4]];
            } else {
                var5 = ((class637) class77.field955.method2506(73, (long) class690.field9742[var4 - var1])).field8702;
            }
            if (var5.field3925 == arg0) {
                var5.field427 = 0;
                if (var5.field435 < 0) {
                    var5.field487 = false;
                } else {
                    int var6 = var5.method241(-25747);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3929 & 0x1FF) != 0 || (var5.field3917 & 0x1FF) != 0) {
                            var5.field487 = false;
                            continue;
                        }
                    } else if ((var5.field3929 & 0x1FF) != 256 || (var5.field3917 & 0x1FF) != 256) {
                        var5.field487 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3929 >> 9;
                        int var8 = var5.field3917 >> 9;
                        if (class65.field860[var7][var8] != var5.field435) {
                            var5.field487 = true;
                            continue;
                        }
                        if (class38.field418[var7][var8] > 1) {
                            var10002 = class38.field418[var7][var8]--;
                            var5.field487 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3929 - var9 >> 9;
                        int var11 = var5.field3917 - var9 >> 9;
                        int var12 = var5.field3929 + var9 >> 9;
                        int var13 = var5.field3917 + var9 >> 9;
                        if (!class486.method2708((byte) -54, var5.field435, var13, var10, var12, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class65.field860[var14][var15] == var5.field435) {
                                        var10002 = class38.field418[var14][var15]--;
                                    }
                                }
                            }
                            var5.field487 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class519 && var5.field525 != null && class430.field5984 >= var5.field525.field7905 && class430.field5984 < var5.field525.field7907) {
                        ((class519) var5).field7175 = false;
                    }
                    var5.field487 = false;
                    var5.field3930 = class394.method2340(var5.field3929, -1, var5.field3925, var5.field3917);
                    class621.method3396(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3079)
    public final void method1420(boolean arg0) {
        if (class52.field683) {
            class77.field969 = 64;
        }
        field2991++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class304.method1829(-2);
        class249.field3352 = new class500(class495.field6687);
        class311.field4180 = new class502();
        if (class375.field5396 != class333.field4859) {
            class91.field1128 = new byte[50][];
        }
        class72.field935 = new class310(class495.field6687);
        if (class375.field5396 == class333.field4859) {
            class52.field675.field9560 = this.getCodeBase().getHost();
        } else if (class123.method754(class375.field5396, -24883)) {
            class52.field675.field9560 = this.getCodeBase().getHost();
            class52.field675.field9561 = class52.field675.field9558 + 40000;
            class225.field2934.field9561 = class225.field2934.field9558 + 40000;
            class52.field675.field9566 = class52.field675.field9558 + 50000;
            class535.field7353.field9561 = class535.field7353.field9558 + 40000;
            class225.field2934.field9566 = class225.field2934.field9558 + 50000;
            class535.field7353.field9566 = class535.field7353.field9558 + 50000;
        } else if (class667.field9492 == class375.field5396) {
            class52.field675.field9560 = "127.0.0.1";
            class225.field2934.field9560 = "127.0.0.1";
            class535.field7353.field9560 = "127.0.0.1";
            class52.field675.field9561 = class52.field675.field9558 + 40000;
            class225.field2934.field9561 = class225.field2934.field9558 + 40000;
            class535.field7353.field9561 = class535.field7353.field9558 + 40000;
            class52.field675.field9566 = class52.field675.field9558 + 50000;
            class225.field2934.field9566 = class225.field2934.field9558 + 50000;
            class535.field7353.field9566 = class535.field7353.field9558 + 50000;
        }
        if (class369.field5313 == class33.field322) {
            class517.field7122 = false;
        }
        class79.field1002 = class52.field675;
        class490.field6605 = class626.field8521 = class482.field6485 = class661.field9381 = new short[256];
        if (class411.field5764 == class33.field322) {
            class628.field8544 = class560.field7639;
            class428.field5944 = class254.field3508;
            class483.field6541 = true;
            class454.field6199 = class659.field9296;
            class333.field4860 = class473.field6394;
            class679.field9657 = 16777215;
            class4.field41 = 0;
        } else {
            class428.field5944 = class105.field1271;
            class333.field4860 = class675.field9568;
            class628.field8544 = class542.field7446;
            class454.field6199 = class234.field3054;
        }
        class348.field5096 = class462.method2617(class249.field3351, true);
        class592.field8107 = class628.method3429(true, class249.field3351, (byte) -10);
        try {
            if (class495.field6687.field1339 != null) {
                class222.field2875 = new class207(class495.field6687.field1339, 5200, 0);
                for (int var3 = 0; var3 < 34; var3++) {
                    class471.field6372[var3] = new class207(class495.field6687.field1350[var3], 6000, 0);
                }
                class107.field1287 = new class207(class495.field6687.field1344, 6000, 0);
                class356.field5173 = new class403(255, class222.field2875, class107.field1287, 500000);
                class80.field1011 = new class207(class495.field6687.field1361, 24, 0);
                class495.field6687.field1339 = null;
                class495.field6687.field1361 = null;
                class495.field6687.field1350 = null;
                class495.field6687.field1344 = null;
            }
        } catch (IOException var4) {
            class107.field1287 = null;
            class222.field2875 = null;
            class80.field1011 = null;
            class356.field5173 = null;
        }
        if (class375.field5396 != class333.field4859) {
            class150.field1885 = true;
        }
        if (arg0) {
            method1406();
        }
        if (class369.field5313 == class33.field322) {
            class314.field4521 = class243.field3162.method1491(class350.field5121, (byte) 127);
        } else if (class411.field5764 == class33.field322) {
            class314.field4521 = class243.field3165.method1491(class350.field5121, (byte) 126);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;", line = 3204)
    public final String method1421(int arg0) {
        field2994++;
        String var2 = null;
        try {
            var2 = "[1)" + class253.field3490 + "," + class186.field2280 + "," + class588.field8082 + "," + class12.field113 + "|";
            if (class596.field8164 != null) {
                var2 = var2 + "2)" + class432.field5993 + "," + (class596.field8164.field526[0] + class253.field3490) + "," + (class596.field8164.field516[0] + class186.field2280) + "|";
            }
            var2 = var2 + "3)" + class161.field2038 + "|4)" + class72.field935.field6517 + "|5)" + class42.method252(-128) + "|6)" + class303.field4059 + "," + class211.field2763 + "|";
            var2 = var2 + "7)" + class72.field935.method2695(false, class161.field2038) + "|";
            var2 = var2 + "8)" + class72.field935.method2693(class161.field2038, (byte) 91) + "|";
            var2 = var2 + "9)" + class72.field935.field6491 + "|";
            var2 = var2 + "10)" + class72.field935.field6499 + "|";
            var2 = var2 + "11)" + class72.field935.field6534 + "|";
            var2 = var2 + "12)" + class72.field935.method1861(class161.field2038, arg0 ^ 0x41) + "|";
            var2 = var2 + "13)" + class77.field969 + "|";
            var2 = var2 + "14)" + class476.field6436;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
                if (arg0 != 5) {
                    field3004 = null;
                }
            } catch (Throwable var15) {
            }
            try {
                if (class161.field2038 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3009 == null ? (field3009 = method1423("client")) : field3009).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3289)
    public static final void method1422(int arg0) {
        int var1 = class654.field9256;
        int[] var2 = class123.field1595;
        for (int var3 = 0; var3 < class306.field4106 + var1; var3++) {
            class39 var4;
            if (var3 < var1) {
                var4 = class292.field3912[var2[var3]];
            } else {
                var4 = ((class637) class77.field955.method2506(39, (long) class690.field9742[var3 - var1])).field8702;
            }
            if (var4.field3925 == arg0 && var4.field435 >= 0) {
                int var5 = var4.method241(-25747);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3929 & 0x1FF) != 0 || (var4.field3917 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3929 & 0x1FF) != 256 || (var4.field3917 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3929 >> 9;
                    int var7 = var4.field3917 >> 9;
                    if (var4.field435 > class65.field860[var6][var7]) {
                        class65.field860[var6][var7] = var4.field435;
                        class38.field418[var6][var7] = 1;
                    } else if (class65.field860[var6][var7] == var4.field435) {
                        var10002 = class38.field418[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3929 - var8 >> 9;
                    int var10 = var4.field3917 - var8 >> 9;
                    int var11 = var4.field3929 + var8 >> 9;
                    int var12 = var4.field3917 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field435 > class65.field860[var13][var14]) {
                                class65.field860[var13][var14] = var4.field435;
                                class38.field418[var13][var14] = 1;
                            } else if (class65.field860[var13][var14] == var4.field435) {
                                var10002 = class38.field418[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }
}
