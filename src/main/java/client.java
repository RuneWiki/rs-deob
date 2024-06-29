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
public class client extends class355 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4219 = 0;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Luh;")
    public static class168 field4233 = new class168();

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field4238;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field4237;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
    public static int[] field4224;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1992(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 4)
    private final void method1968(byte arg0) {
        field4227++;
        if (class235.field3411.field4148 > class656.field9008) {
            class678.field9207.method3761(0);
            class236.field3437 = (class235.field3411.field4148 * 50 - 50) * 5;
            if (class236.field3437 > 3000) {
                class236.field3437 = 3000;
            }
            if (class235.field3411.field4148 >= 2 && class235.field3411.field4149 == 6) {
                this.method2220(-80, "js5connect_outofdate");
                class214.field3036 = 14;
                return;
            }
            if (class235.field3411.field4148 >= 4 && class235.field3411.field4149 == -1) {
                this.method2220(81, "js5crc");
                class214.field3036 = 14;
                return;
            }
            if (class235.field3411.field4148 >= 4 && class263.method1763(class214.field3036, (byte) -81)) {
                if (class235.field3411.field4149 == 7 || class235.field3411.field4149 == 9) {
                    this.method2220(-93, "js5connect_full");
                } else if (class235.field3411.field4149 <= 0) {
                    this.method2220(72, "js5io");
                } else if (class498.field6969 == null) {
                    this.method2220(-116, "js5connect");
                } else {
                    this.method2220(113, "js5proxy_" + class498.field6969.trim());
                }
                class214.field3036 = 14;
                return;
            }
        }
        class656.field9008 = class235.field3411.field4148;
        if (class236.field3437 > 0) {
            class236.field3437--;
            return;
        }
        try {
            if (class439.field6257 == 0) {
                class487.field6751 = class678.field9207.method3764(class689.field9299, (byte) 36);
                class439.field6257++;
            }
            if (class439.field6257 == 1) {
                if (class487.field6751.field8462 == 2) {
                    if (class487.field6751.field8463 != null) {
                        class498.field6969 = (String) class487.field6751.field8463;
                    }
                    this.method1972(1000, (byte) 100);
                    return;
                }
                if (class487.field6751.field8462 == 1) {
                    class439.field6257++;
                }
            }
            if (class439.field6257 == 2) {
                class65.field1251 = new class601((Socket) class487.field6751.field8463, class689.field9299, 25000);
                class215 var2 = new class215(5);
                var2.method1526(false, class250.field3609.field7212);
                var2.method1539((byte) 103, 634);
                class65.field1251.method3419(var2.field3066, 5, 0, -1);
                class439.field6257++;
                class91.field1625 = class554.method3190(-70);
            }
            if (class439.field6257 == 3) {
                if (class263.method1763(class214.field3036, (byte) -100) || class65.field1251.method3416((byte) 83) > 0) {
                    int var3 = class65.field1251.method3422(0);
                    if (var3 != 0) {
                        this.method1972(var3, (byte) 111);
                        return;
                    }
                    class439.field6257++;
                } else if ((class554.method3190(-63) - class91.field1625) > 30000L) {
                    this.method1972(1001, (byte) 85);
                    return;
                }
            }
            if (class439.field6257 == 4) {
                boolean var4 = class263.method1763(class214.field3036, (byte) -100) || class21.method168(class214.field3036, -87) || class626.method3575(class214.field3036, -127);
                class277[] var5 = class277.method1825(105);
                class215 var6 = new class215(var5.length * 4);
                class65.field1251.method3423(var6.field3066, 0, (byte) -72, var6.field3066.length);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1826(1, var6.method1533((byte) -126));
                }
                class235.field3411.method1937(false, !var4, class65.field1251);
                class439.field6257 = 0;
                class487.field6751 = null;
                class65.field1251 = null;
            }
            int var8 = 127 / ((1 - arg0) / 60);
        } catch (IOException var9) {
            this.method1972(1002, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 169)
    public final void method1969(int arg0) {
        if (class670.field9148) {
            class69.field1286 = 64;
        }
        field4225++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class641.method3638(false);
        class428.field6145 = new class724(class689.field9299);
        class235.field3411 = new class295();
        class324.method2073(new int[] { 20, 260 }, new int[] { 1000, 100 }, arg0 ^ arg0);
        if (class740.field9967 != class436.field6234) {
            class373.field5296 = new byte[50][];
        }
        class693.field9368 = class407.method2531(24916);
        if (class740.field9967 == class436.field6234) {
            class47.field992.field9144 = this.getCodeBase().getHost();
        } else if (class613.method3472(class436.field6234, arg0 ^ 0xFFFF8FBB)) {
            class47.field992.field9144 = this.getCodeBase().getHost();
            class47.field992.field9145 = class47.field992.field9140 + 40000;
            class20.field316.field9145 = class20.field316.field9140 + 40000;
            class47.field992.field9135 = class47.field992.field9140 + 50000;
            class383.field5556.field9145 = class383.field5556.field9140 + 40000;
            class20.field316.field9135 = class20.field316.field9140 + 50000;
            class383.field5556.field9135 = class383.field5556.field9140 + 50000;
        } else if (class440.field6259 == class436.field6234) {
            class47.field992.field9144 = "127.0.0.1";
            class20.field316.field9144 = "127.0.0.1";
            class47.field992.field9145 = class47.field992.field9140 + 40000;
            class383.field5556.field9144 = "127.0.0.1";
            class20.field316.field9145 = class20.field316.field9140 + 40000;
            class383.field5556.field9145 = class383.field5556.field9140 + 40000;
            class47.field992.field9135 = class47.field992.field9140 + 50000;
            class20.field316.field9135 = class20.field316.field9140 + 50000;
            class383.field5556.field9135 = class383.field5556.field9140 + 50000;
        }
        class733.field9895 = class655.field8995 = class587.field8006 = class242.field3532 = new short[256];
        if (class582.field7970 == class456.field6431) {
            class274.field3853 = false;
        }
        if (class582.field7970 == class204.field2938) {
            class304.field4240 = true;
            class419.field6060 = class272.field3832;
            class521.field7233 = 16777215;
            class189.field2818 = class322.field4459;
            class521.field7238 = 0;
        } else if (class582.field7970 == class280.field3931) {
            class419.field6060 = class521.field7237;
            class189.field2818 = class390.field5679;
        } else {
            class419.field6060 = class466.field6536;
            class189.field2818 = class682.field9232;
        }
        class678.field9207 = class47.field992;
        try {
            class364.field5213 = class334.field4684.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class117.field1992 = class480.method2818(class458.field6458, (byte) -124);
        class284.field3963 = class340.method2152(class458.field6458, 0, true);
        try {
            if (class689.field9299.field2533 != null) {
                class319.field4397 = new class18(class689.field9299.field2533, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class431.field6163[var3] = new class18(class689.field9299.field2543[var3], 6000, 0);
                }
                class309.field4302 = new class18(class689.field9299.field2527, 6000, 0);
                class39.field954 = new class586(255, class319.field4397, class309.field4302, 500000);
                class252.field3638 = new class18(class689.field9299.field2536, 24, 0);
                class689.field9299.field2527 = null;
                class689.field9299.field2533 = null;
                class689.field9299.field2543 = null;
                class689.field9299.field2536 = null;
            }
        } catch (IOException var5) {
            class319.field4397 = null;
            class309.field4302 = null;
            class252.field3638 = null;
            class39.field954 = null;
        }
        if (class740.field9967 != class436.field6234) {
            class137.field2298 = true;
        }
        class187.field2809 = class497.field6903.method2936(class607.field8336, 544);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 290)
    public final void method1970(byte arg0) {
        field4229++;
        method1981(31);
        class201.method1411(16384);
        class680.method3816((byte) 125);
        class594.method3379(-74);
        class497.method2932(arg0 ^ 0xFFFFFFE0);
        class44.method544(false);
        class277.method1822(23377);
        class589.method3361(arg0 ^ 0x6C);
        class293.method1922(11868);
        class244.method1678(-83);
        class13.method114(0);
        class362.method2312(0);
        class368.method2337((byte) 16);
        class213.method1463(false);
        class355.method2232(arg0 + 32609);
        class401.method2504((byte) -89);
        class623.method3546((byte) 85);
        class661.method3718(-31777);
        class59.method625(-24016);
        class322.method2066(false);
        class235.method1639(-86);
        class96.method899(true);
        class168.method1268(-13722);
        class601.method3420((byte) 124);
        class295.method1931((byte) 119);
        class724.method4014((byte) -124);
        class626.method3574(0);
        class32.method426(arg0 - 108);
        class91.method843((byte) 10);
        class18.method136((byte) 0);
        class112.method993((byte) 116);
        class210.method1440(arg0 ^ 0xE);
        class730.method4035(-21165);
        class521.method3034((byte) 121);
        class468.method2751(14);
        class738.method4061(55);
        class126.method1062((byte) 62);
        class681.method3822((byte) 82);
        class245.method1686((byte) -71);
        class119.method1041((byte) -124);
        class20.method153(true);
        class186.method1353((byte) 124);
        class645.method3667(arg0 - 204);
        class160.method1230((byte) 79);
        class516.method3018(true);
        class690.method3857(arg0 - 106);
        class549.method3161((byte) -123);
        class318.method2048((byte) -15);
        class603.method3430((byte) 18);
        class111.method978(-1);
        class69.method681(28962);
        class382.method2413(12949);
        class433.method2632((byte) -95);
        class377.method2383(1);
        class665.method3737(21515);
        class166.method1248((byte) -128);
        class655.method3699((byte) -35);
        class570.method3306(2);
        class469.method2766(1);
        class167.method1254((byte) 42);
        class350.method2194(40960);
        class458.method2718(126);
        class174.method1302((byte) -120);
        class378.method2402((byte) -84);
        class335.method2123(14);
        class598.method3406(true);
        class70.method684((byte) 116);
        class207.method1429((byte) 51);
        class452.method2691(1);
        class215.method1524(arg0 ^ 0xFFFFFF92);
        class564.method3270(-44);
        class390.method2450(-123);
        class384.method2418(-65);
        class737.method4054((byte) 115);
        class55.method606(0);
        class38.method475(true);
        class432.method2625(arg0 - 113);
        class21.method171(arg0 ^ 0x70);
        class660.method3713(-14603);
        class675.method3805(-76);
        class726.method4019((byte) -125);
        class542.method3135(true);
        class554.method3188((byte) -122);
        class514.method3006(true);
        class633.method3612((byte) 57);
        class420.method2581(arg0 + 404);
        class137.method1115(16711680);
        class670.method3763((byte) 108);
        class359.method2304((byte) -128);
        class274.method1808(-3);
        class196.method1402((byte) 66);
        class68.method677((byte) -24);
        class584.method3340(-128);
        class627.method3588((byte) 7);
        class172.method1289(true);
        class691.method3862(false);
        class117.method1029(5616);
        class472.method2781((byte) -52);
        class585.method3345(arg0 + 4189);
        class387.method2443(25165);
        class149.method1173(arg0 ^ 0xFFFFC640);
        class278.method1828(64);
        class99.method931(-123);
        class37.method462(arg0 ^ 0x11);
        class351.method2197((byte) 72);
        class281.method1854(arg0 - 182);
        class334.method2120(-3752);
        class352.method2211(104);
        class60.method635((byte) 23);
        class470.method2771((byte) -71);
        class538.method3100((byte) 112);
        class282.method1856((byte) -121);
        class640.method3633((byte) 120);
        class507.method2979(-15596);
        class621.method3542(-15628);
        class315.method2043((byte) 119);
        class280.method1848(-16211);
        class107.method967(arg0 + 21813);
        class448.method2680(arg0 ^ 0x64);
        class394.method2475(arg0 - 48);
        class339.method2144((byte) -70);
        class294.method1923(-4);
        class94.method889((byte) 110);
        class134.method1102(1);
        class518.method3023(16878);
        class620.method3535(124);
        class616.method3499(arg0 - 107);
        class677.method3810(1);
        class442.method2658(63);
        class656.method3703(100);
        class85.method817(arg0 - 28702);
        class212.method1456(103);
        class367.method2332(6);
        class575.method3318(arg0 ^ 0x34);
        class721.method4005((byte) -126);
        class487.method2868((byte) -67);
        class415.method2561((byte) 59);
        class597.method3386((byte) -76);
        class266.method1768(96);
        class669.method3754(11339);
        class494.method2907(true);
        class404.method2522(1);
        class12.method104(-65);
        class609.method3468(arg0 - 199);
        class456.method2713((byte) 119);
        class83.method796();
        class124.method1060(true);
        class418.method2575(1);
        class535.method3087((byte) 125);
        class740.method4065(119);
        class72.method687(1);
        class689.method3847((byte) -116);
        class30.method408(arg0 ^ 0x6C);
        class257.method1745(124);
        class425.method2602(6725);
        class66.method671(51);
        class120.method1043(85);
        class242.method1675((byte) 124);
        class313.method2036((byte) -120);
        class638.method3624(arg0 - 221);
        class639.method3627(arg0 - 76);
        class461.method2728((byte) -98);
        class62.method656(21745);
        class133.method1094(122);
        class398.method2493(1);
        class371.method2360((byte) 62);
        class489.method2874();
        class253.method1710((byte) 79);
        class173.method1296(1);
        class205.method1422(false);
        class530.method3060(1);
        class327.method2078(true);
        class391.method2463(0);
        class343.method2163((byte) 121);
        class58.method612(3);
        class236.method1642(arg0 ^ 0x33);
        class406.method2529(false);
        class27.method392((byte) -43);
        class440.method2651((byte) -113);
        class132.method1091(1);
        class231.method1610(0);
        class385.method2421();
        class399.method2496((byte) 108);
        class581.method3334((byte) -94);
        class307.method2002((byte) 63);
        class286.method1872((byte) -97);
        class181.method1330(114);
        class666.method3743(arg0 - 16777324);
        class482.method2828(true);
        class710.method3949((byte) 53);
        class342.method2159();
        class239.method1663(13569);
        class129.method1070(true);
        class88.method830(0);
        class33.method439(126);
        class634.method3617(1);
        class445.method2674(-1);
        class187.method1357(353);
        class439.method2648(arg0 ^ 0x6E);
        class2.method7(-4524);
        class177.method1316((byte) 50);
        class380.method2406(arg0 ^ 0xFFFFFFED);
        class100.method938(arg0 + 19316);
        class424.method2598(0);
        class474.method2791(1010);
        class184.method1344(88);
        class250.method1701(-108);
        class707.method3935();
        class417.method2574(32);
        class755.method4212(arg0 ^ 0x29);
        class259.method1748((byte) 85);
        class607.method3450(-100);
        class475.method2793();
        class260.method1750((byte) -121);
        class195.method1397((byte) -121);
        class654.method3692(-13);
        class304.method1993((byte) 35);
        class746.method4161((byte) 114);
        class329.method2088();
        class753.method4203(1);
        class423.method2592((byte) 113);
        class39.method480(-128);
        class103.method948((byte) -83);
        class699.method3912(80);
        class499.method2946(10);
        class754.method4208(-1966608624);
        class118.method1032(-127);
        class467.method2746((byte) -85);
        class506.method2970((byte) 44);
        class226.method1591((byte) 2);
        class558.method3206((byte) -110);
        class375.method2372(16711680);
        class373.method2368((byte) -90);
        class632.method3609(false);
        class276.method1818((byte) 77);
        class86.method823((byte) 68);
        class649.method3675((byte) 127);
        class430.method2617(126);
        class591.method3371(0);
        class191.method1373((byte) -110);
        class455.method2711((byte) 25);
        class733.method4046((byte) -46);
        class238.method1659(true);
        class344.method2167(true);
        class471.method2776(3);
        class531.method3061((byte) -102);
        class454.method2708((byte) 61);
        class290.method1897((byte) -52);
        class509.method2986(false);
        class309.method2017(arg0 ^ 0xFFFFFF8A);
        class705.method3930(1);
        class328.method2085((byte) -83);
        class34.method440(255);
        class671.method3772(arg0 + 14537);
        class61.method654((byte) 48);
        class426.method2605((byte) -9);
        class190.method1368((byte) -72);
        class637.method3621(arg0 ^ 0x20);
        class684.method3829(arg0 - 216);
        class524.method3039(arg0 ^ 0x4C47);
        class323.method2068((byte) -22);
        class427.method2610(true);
        class605.method3444(1000000);
        class138.method1117(2);
        class590.method3369(true);
        class501.method2950(arg0 ^ 0x6F);
        class749.method4180((byte) -52);
        class544.method3137(-3);
        class510.method2990((byte) -85);
        class561.method3219((byte) 102);
        if (arg0 != 108) {
            field4219 = -60;
        }
        class734.method4048(-31055);
        class513.method3004(1);
        class546.method3151(4);
        class53.method599(false);
        class211.method1451(67);
        class288.method1877(1);
        class82.method782(arg0 - 100);
        class234.method1633(arg0 - 108);
        class464.method2735(false);
        class477.method2799((byte) -99);
        class678.method3812(-1);
        class693.method3874(true);
        class386.method2436(-124);
        class687.method3842();
        class246.method1692(true);
        class582.method3338((byte) 79);
        class308.method2005(4908);
        class338.method2138(-112);
        class512.method3000(arg0 + 13607);
        class576.method3319((byte) 3);
        class51.method586(61);
        class478.method2804((byte) 44);
        class121.method1048(4);
        class340.method2147((byte) -25);
        class113.method1001(-11677);
        class568.method3286(114);
        class145.method1138(-24);
        class361.method2306((byte) 74);
        class326.method2077(0);
        class84.method812();
        class225.method1585(arg0 - 108);
        class217.method1552((byte) -87);
        class122.method1052();
        class411.method2549();
        class272.method1797((byte) -127);
        class64.method664();
        class614.method3481(25365);
        class199.method1408(false);
        class405.method2524(2767);
        class297.method1949(true);
        class604.method3439((byte) 69);
        class302.method1964(-17902);
        class192.method1375((byte) -128);
        class419.method2578((byte) 112);
        class562.method3229((byte) -22);
        class214.method1472((byte) 48);
        class551.method3176(105);
        class422.method2589(1);
        class608.method3454(arg0 - 78);
        class600.method3413(-19960);
        class140.method1120(arg0 ^ 0xFFFFFFDB);
        class311.method2029((byte) 121);
        class283.method1858(1);
        class262.method1760((byte) -78);
        class729.method4033((byte) 32);
        class67.method675(arg0 ^ 0x5);
        class545.method3148(true);
        class402.method2509();
        class49.method559(0);
        class473.method2789(-1);
        class252.method1707(true);
        class336.method2126(-109);
        class441.method2655(137);
        class434.method2634(arg0 ^ 0x7F93);
        class444.method2669(30114);
        class42.method535((byte) 113);
        class197.method1404(31913);
        class356.method2240(10);
        class346.method2178((byte) 28);
        class16.method125(0);
        class147.method1166((byte) -120);
        class488.method2871(3);
        class333.method2107(0);
        class148.method1171(true);
        class410.method2538((byte) -80);
        class498.method2939(-1316);
        class647.method3672(-2001);
        class515.method3011(0);
        class534.method3075(1);
        class22.method185((byte) 100);
        class299.method1957(-1401);
        class431.method2620(16);
        class131.method1082((byte) 115);
        class662.method3720(2048);
        class631.method3606(arg0 + 1489574628);
        class495.method2910(47);
        class567.method3279(true);
        class643.method3645(arg0 - 235);
        class3.method11((byte) -122);
        class624.method3552(arg0 - 14);
        class744.method4072(-9341);
        class548.method3160(84);
        class429.method2614(-1);
        class745.method4110(113);
        class11.method65(-27327);
        class523.method3037((byte) 72);
        class537.method3093((byte) -67);
        class81.method762(arg0 - 6105);
        class296.method1941(8549);
        class732.method4044(-11);
        class319.method2051(-24054);
        class742.method4069(4);
        class504.method2966(88);
        class491.method2897(5125);
        class750.method4198(126);
        class255.method1734(16384);
        class536.method3089(true);
        class569.method3289((byte) 119);
        class358.method2257(15);
        class90.method840();
        class104.method953(arg0 ^ 0x7EA2);
        class98.method916((byte) -121);
        class528.method3054((byte) -54);
        class459.method2722(-1633784916);
        class527.method3053(true);
        class556.method3198(104);
        class630.method3599(false);
        class618.method3503(-1);
        class76.method710((byte) -98);
        class449.method2683((byte) 127);
        class517.method3020(0);
        class270.method1791(false);
        class265.method1765(false);
        class719.method3999(-120);
        class341.method2155(4);
        class268.method1784(-1);
        class525.method3040(true);
        class364.method2322((byte) 104);
        class466.method2741((byte) -109);
        class396.method2481((byte) -115);
        class73.method696((byte) 111);
        class230.method1604(true);
        class435.method2640(-114);
        class728.method4032((byte) -123);
        class4.method14(255);
        class593.method3376(arg0 ^ 0x6C);
        class57.method611(109);
        class383.method2415((byte) 119);
        class170.method1283(0);
        class566.method3276((byte) 59);
        class438.method2645((byte) 97);
        class579.method3328(arg0 - 108);
        class150.method1176();
        class194.method1385((byte) -64);
        class301.method1960(19612);
        class628.method3594((byte) 0);
        class135.method1104(65280);
        class208.method1435((byte) -23);
        class10.method62(0);
        class285.method1866(121);
        class416.method2564((byte) 9);
        class704.method3926(arg0 ^ 0x216C);
        class716.method3986(true);
        class635.method3619(-112);
        class25.method389(108);
        class369.method2345(0);
        class648.method3674(false);
        class23.method367((byte) -126);
        class712.method3952((byte) 17);
        class606.method3445((byte) -16);
        class28.method396(arg0 - 109);
        class599.method3411(1);
        class683.method3826(114);
        class717.method3994(71);
        class651.method3683((byte) -28);
        class465.method2739((byte) 9);
        class105.method958(-10794);
        class47.method549((byte) -125);
        class481.method2821(99);
        class106.method963((byte) 11);
        class227.method1597(-86);
        class87.method826(arg0 ^ 0x18AC);
        class284.method1862(24885);
        class700.method3915(0);
        class128.method1067(arg0 ^ 0xFFFFFF93);
        class365.method2324(arg0 - 108);
        class269.method1788(true);
        class108.method970(77);
        class164.method1243(0);
        class559.method3210((byte) 54);
        class287.method1875(true);
        class221.method1573(arg0 - 198);
        class321.method2056(-30094);
        class511.method2998(-6896);
        class261.method1755((byte) 74);
        class130.method1075(4);
        class453.method2696(arg0 - 107);
        class393.method2469((byte) -112);
        class146.method1152(-43);
        class480.method2813((byte) 82);
        class413.method2556(127);
        class271.method1795(88);
        class240.method1666((byte) -32);
        class376.method2373((byte) 23);
        class79.method732((byte) -122);
        class171.method1285(arg0 - 107);
        class241.method1671(0);
        class233.method1630((byte) -54);
        class463.method2733(25);
        class198.method1406((byte) 49);
        class114.method1012(true);
        class747.method4173(false);
        class204.method1417((byte) 2);
        class641.method3639(true);
        class65.method670(-127);
        class189.method1364(arg0 ^ 0x864C);
        class505.method2969(arg0 ^ 0x3B);
        class625.method3566(arg0 - 107);
        class539.method3107(0);
        class492.method2901(-125);
        class162.method1236(96);
        class219.method1561(true);
        class731.method4042(-123);
        class720.method4004((byte) 93);
        class718.method3998(arg0 ^ 0x4D);
        class222.method1576(-1);
        class89.method834(-4587);
        class77.method716((byte) -64);
        class697.method3900(1);
        class428.method2612(-15833);
        class692.method3870((byte) 4);
        class161.method1232(true);
        class715.method3985(false);
        class19.method149(5);
        class7.method26((byte) 79);
        class547.method3153(arg0 + 2564);
        class696.method3895((byte) 118);
        class345.method2174(88);
        class646.method3669(1);
        class493.method2902(64);
        class500.method2948((byte) 2);
        class54.method604(0);
        class682.method3823(122);
        class324.method2071(75);
        class663.method3723((byte) 104);
        class223.method1577((byte) 4);
        class349.method2192((byte) -41);
        class508.method2983(arg0 ^ 0x6E);
        class685.method3834(0);
        class141.method1125((byte) 50);
        class667.method3745(3);
        class587.method3352(true);
        class109.method972(false);
        class436.method2642((byte) -106);
        class1.method1(true);
        class275.method1812(105);
        class476.method2798(-120);
        class565.method3275((byte) -85);
        class256.method1737(arg0 - 51);
        class578.method3325(-14487);
        class29.method401(arg0 ^ 0xFFFF8AE3);
        class142.method1131((byte) -62);
        class216.method1546(arg0 ^ 0x6E);
        class659.method3710(120);
        class78.method724(true);
        if (class355.field5028) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 825)
    private final void method1971(byte arg0) {
        if (arg0 != 61) {
            method1976();
        }
        field4232++;
        boolean var2 = class235.field3411.method1927((byte) 99);
        if (!var2) {
            this.method1968((byte) -112);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 841)
    private final void method1972(int arg0, byte arg1) {
        field4230++;
        class235.field3411.field4148++;
        class487.field6751 = null;
        class235.field3411.field4149 = arg0;
        if (arg1 > 74) {
            class439.field6257 = 0;
            class65.field1251 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 857)
    public final void method1973(int arg0) {
        if (class129.field2172) {
            class380.method2405(arg0 - 110);
        }
        field4218++;
        class520.method3024(false);
        if (class272.field3822 != null) {
            class272.field3822.method614((byte) 89);
        }
        if (class699.field9455 != null) {
            class120.method1044(class699.field9455, class689.field9299, false);
            class699.field9455 = null;
        }
        if (class512.field7137 != null) {
            class512.field7137.method706((byte) 36);
            class512.field7137 = null;
        }
        class259.method1746(16);
        class235.field3411.method1935(arg0 ^ 0xFFFFFFBB);
        class428.field6145.method4013(true);
        if (class440.field6266 != null) {
            class440.field6266.method1251((byte) 16);
            class440.field6266 = null;
        }
        try {
            class319.field4397.method140((byte) -62);
            for (int var2 = arg0; var2 < 37; var2++) {
                class431.field6163[var2].method140((byte) 118);
            }
            class309.field4302.method140((byte) -84);
            class252.field3638.method140((byte) 80);
            class410.method2537((byte) -53);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 911)
    public static final void method1974(int arg0) {
        int var1 = class219.field3167;
        int[] var2 = class87.field1561;
        int var3 = class61.field1214 ? var1 : class738.field9939 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class390 var5;
            if (var4 < var1) {
                var5 = class49.field1040[var2[var4]];
            } else {
                var5 = ((class751) class86.field1546.method1465((long) class737.field9925[var4 - var1], -6008)).field10510;
            }
            if (var5.field5926 == arg0) {
                var5.field5687 = 0;
                if (var5.field5711 < 0) {
                    var5.field5735 = false;
                } else {
                    int var6 = var5.method2457((byte) 71);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5922 & 0x1FF) != 0 || (var5.field5933 & 0x1FF) != 0) {
                            var5.field5735 = false;
                            continue;
                        }
                    } else if ((var5.field5922 & 0x1FF) != 256 || (var5.field5933 & 0x1FF) != 256) {
                        var5.field5735 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5922 >> 9;
                        int var8 = var5.field5933 >> 9;
                        if (class172.field2683[var7][var8] != var5.field5711) {
                            var5.field5735 = true;
                            continue;
                        }
                        if (class616.field8415[var7][var8] > 1) {
                            var10002 = class616.field8415[var7][var8]--;
                            var5.field5735 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field5922 - var9 >> 9;
                        int var11 = var5.field5933 - var9 >> 9;
                        int var12 = var5.field5922 + var9 >> 9;
                        int var13 = var5.field5933 + var9 >> 9;
                        if (!class632.method3610(var11, var12, var5.field5711, (byte) 124, var10, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class172.field2683[var14][var15] == var5.field5711) {
                                        var10002 = class616.field8415[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5735 = true;
                            continue;
                        }
                    }
                    var5.field5735 = false;
                    var5.field5927 = class197.method1403(var5.field5922, var5.field5926, 11219, var5.field5933);
                    class625.method3565(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lat;)Lwb;", line = 1026)
    public static final class331 method1975(class378 arg0) {
        class331 var1 = (class331) class69.field1281.method1465(((long) arg0.field5506 << 32) + (long) arg0.field5380, -6008);
        return var1 == null ? arg0.field5424 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1030)
    public static final void method1976() {
        class91.field1627 = 0;
        for (int var0 = 0; var0 < class738.field9939; var0++) {
            class9 var1 = ((class751) class86.field1546.method1465((long) class737.field9925[var0], -6008)).field10510;
            if (var1.field5735 && var1.method57(-1) != -1) {
                int var2 = (var1.method2457((byte) 119) - 1) * 256 + 252;
                int var3 = var1.field5922 - var2 >> 9;
                int var4 = var1.field5933 - var2 >> 9;
                class390 var5 = class645.method3659(252, var3, var1.field5926, var4);
                if (var5 != null) {
                    int var6 = var5.field5716;
                    if (var5 instanceof class9) {
                        var6 += 2048;
                    }
                    if (var5.field5687 == 0 && var5.method57(-1) != -1) {
                        class284.field3968[class91.field1627] = var6;
                        class521.field7226[class91.field1627] = var6;
                        class91.field1627++;
                        var5.field5687++;
                    }
                    class284.field3968[class91.field1627] = var6;
                    class521.field7226[class91.field1627] = var1.field5716 + 2048;
                    class91.field1627++;
                    var5.field5687++;
                }
            }
        }
        class699.method3908(class521.field7226, class284.field3968, 0, -22222, class91.field1627 - 1);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1082)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class291.method1912("Argument count", (byte) 44);
            }
            class47.field992 = new class670();
            class47.field992.field9140 = Integer.parseInt(arg0[0]);
            class20.field316 = new class670();
            class20.field316.field9140 = Integer.parseInt(arg0[1]);
            class383.field5556 = new class670();
            class383.field5556.field9140 = Integer.parseInt(arg0[2]);
            class436.field6234 = class440.field6259;
            if (arg0[3].equals("live")) {
                class10.field140 = class523.field7255;
            } else if (arg0[3].equals("rc")) {
                class10.field140 = class270.field3806;
            } else if (arg0[3].equals("wip")) {
                class10.field140 = class138.field2302;
            } else {
                class291.method1912("modewhat", (byte) 41);
            }
            class607.field8336 = class581.method3333((byte) 103, arg0[4]);
            if (class607.field8336 == -1) {
                if (arg0[4].equals("english")) {
                    class607.field8336 = 0;
                } else if (arg0[4].equals("german")) {
                    class607.field8336 = 1;
                } else {
                    class291.method1912("language", (byte) -128);
                }
            }
            class206.field2960 = false;
            class591.field8067 = false;
            if (arg0[5].equals("game0")) {
                class582.field7970 = class456.field6431;
            } else if (arg0[5].equals("game1")) {
                class582.field7970 = class204.field2938;
            } else if (arg0[5].equals("game2")) {
                class582.field7970 = class269.field3789;
            } else if (arg0[5].equals("game3")) {
                class582.field7970 = class280.field3931;
            } else {
                class291.method1912("game", (byte) -124);
            }
            class670.field9148 = false;
            class640.field8796 = "";
            class638.field8767 = 0L;
            class199.field2906 = null;
            class601.field8259 = 0;
            class191.field2839 = true;
            class643.field8857 = true;
            class278.field3918 = false;
            class296.field4156 = 0;
            class260.field3724 = class582.field7970.field6488;
            class59.field1174 = 0;
            class114.field1952 = null;
            client var1 = new client();
            class334.field4684 = var1;
            var1.method2230(class10.field140.method3545(0) + 32, 1024, false, 634, 37, class582.field7970.field6486, 23499, 768);
            class684.field9263.setLocation(40, 40);
        } catch (Exception var3) {
            class444.method2672(null, var3, 15004);
        }
        field4226++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1170)
    public final void method1977(byte arg0) {
        if (arg0 != 93) {
            field4224 = null;
        }
        field4231++;
        if (class693.field9368.field4468.method1099(-32350) != 2) {
            this.method1986(123);
            return;
        }
        try {
            this.method1986(arg0 ^ 0x66);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class444.method2672(var5.getMessage() + " (Recovered) " + this.method1991((byte) 115), var5, 15004);
            class263.field3761 = true;
            class171.method1284(false, (byte) 102, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1195)
    public final void init() {
        field4228++;
        if (!this.method2226(48)) {
            return;
        }
        class47.field992 = new class670();
        class47.field992.field9140 = Integer.parseInt(this.getParameter("worldid"));
        class20.field316 = new class670();
        class20.field316.field9140 = Integer.parseInt(this.getParameter("lobbyid"));
        class20.field316.field9144 = this.getParameter("lobbyaddress");
        class383.field5556 = new class670();
        class383.field5556.field9140 = Integer.parseInt(this.getParameter("demoid"));
        class383.field5556.field9144 = this.getParameter("demoaddress");
        class436.field6234 = class272.method1798((byte) -93, Integer.parseInt(this.getParameter("modewhere")));
        if (class440.field6259 == class436.field6234) {
            class436.field6234 = class746.field10327;
        } else if (!class613.method3472(class436.field6234, -1) && class740.field9967 != class436.field6234) {
            class436.field6234 = class740.field9967;
        }
        class10.field140 = class254.method1722(-121, Integer.parseInt(this.getParameter("modewhat")));
        if (class138.field2302 != class10.field140 && class270.field3806 != class10.field140 && class523.field7255 != class10.field140) {
            class10.field140 = class523.field7255;
        }
        try {
            class607.field8336 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class607.field8336 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class206.field2960 = true;
        } else {
            class206.field2960 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class591.field8067 = true;
        } else {
            class591.field8067 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class424.field6112 = true;
        } else {
            class424.field6112 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class582.field7970 = class456.field6431;
            } else if (var4.equals("1")) {
                class582.field7970 = class204.field2938;
            } else if (var4.equals("2")) {
                class582.field7970 = class269.field3789;
            } else if (var4.equals("3")) {
                class582.field7970 = class280.field3931;
            }
        }
        try {
            class601.field8259 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class601.field8259 = 0;
        }
        class304.field4242 = this.getParameter("quiturl");
        class640.field8796 = this.getParameter("settings");
        if (class640.field8796 == null) {
            class640.field8796 = "";
        }
        class413.field6004 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class59.field1174 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class59.field1174 = 0;
            }
        }
        class260.field3724 = Integer.parseInt(this.getParameter("colourid"));
        if (class260.field3724 < 0 || class481.field6715.length <= class260.field3724) {
            class260.field3724 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class191.field2839 = true;
            class643.field8857 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class278.field3918 = true;
        }
        class199.field2906 = this.getParameter("sskey");
        if (class199.field2906 != null && class199.field2906.length() < 2) {
            class199.field2906 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class670.field9148 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class296.field4156 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class638.field8767 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class114.field1952 = this.getParameter("additionalInfo");
        if (class114.field1952 != null && class114.field1952.length() > 50) {
            class114.field1952 = null;
        }
        if (class582.field7970 == class456.field6431) {
            class22.field488 = 503;
            class478.field6661 = 765;
        } else if (class582.field7970 == class204.field2938) {
            class478.field6661 = 640;
            class22.field488 = 480;
        }
        class334.field4684 = this;
        this.method2229(class478.field6661, 634, class22.field488, class10.field140.method3545(0) + 32, 37, class582.field7970.field6486, 50);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lat;IIIIIIIIIII)V", line = 1371)
    public static final void method1978(class378[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class378 var13 = arg0[var12];
            if (var13 != null && var13.field5510 == arg1) {
                int var14 = var13.field5476 + arg6;
                int var15 = var13.field5426 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field5450 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field5385 + var14;
                    int var21 = var13.field5465 + var15;
                    if (var13.field5450 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field5450 == 0 || var13.field5358 || method1975(var13).field4628 != 0 || class234.field3393 == var13 || class316.field4377 == var13.field5441 || class564.field7787 == var13.field5441) {
                    if (!method1982(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class241.field3529) {
                            var22 = class146.method1163((byte) -128);
                            var23 = class313.method2035(false);
                        }
                        if (class591.field8071 == var13 && class721.method4006(class591.field8071, (byte) 125) != null) {
                            class216.field3134 = true;
                            class745.field10115 = var14;
                            class73.field1333 = var15;
                        }
                        if (var13.field5352 || var16 < var18 && var17 < var19) {
                            if (var13.field5452 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class33 var24 = (class33) class208.field2975.method1269(4); var24 != null; var24 = (class33) class208.field2975.method1264((byte) 71)) {
                                    if (var24.field851) {
                                        var24.method2314((byte) 65);
                                        var24.field847.field5413 = false;
                                    }
                                }
                                if (class404.field5937 == 0) {
                                    class591.field8071 = null;
                                    class234.field3393 = null;
                                }
                                class13.field237 = 0;
                                class308.field4271 = false;
                                class254.field3665 = false;
                                if (!class311.field4321) {
                                    class750.method4183((byte) 111);
                                }
                            }
                            boolean var25;
                            if (class284.field3963.method574(true) + var22 >= var16 && class284.field3963.method571((byte) 89) + var23 >= var17 && class284.field3963.method574(true) + var22 < var18 && class284.field3963.method571((byte) 74) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class184.field2785 && var25) {
                                if (var13.field5395 >= 0) {
                                    class130.field2184 = var13.field5395;
                                } else if (var13.field5452) {
                                    class130.field2184 = -1;
                                }
                            }
                            if (!class311.field4321 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class442.method2661(arg11 - var15, arg10 - var14, var13, (byte) -95);
                            }
                            boolean var26 = false;
                            if (class284.field3963.method576(-91) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class19 var28 = (class19) class494.field6832.method1269(4);
                            if (var28 != null && var28.method145(109) == 0 && var28.method143((byte) -128) + var22 >= var16 && var28.method146(33) + var23 >= var17 && var28.method143((byte) -127) + var22 < var18 && var28.method146(8) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field5422 != null && !class68.method676(true)) {
                                for (int var29 = 0; var29 < var13.field5422.length; var29++) {
                                    if (class117.field1992.method1346(var13.field5422[var29], -122)) {
                                        if (var13.field5477 == null || class641.field8810 >= var13.field5477[var29]) {
                                            byte var30 = var13.field5508[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class117.field1992.method1346(86, -124) && !class117.field1992.method1346(82, -123) && !class117.field1992.method1346(81, -122)) && ((var30 & 0x2) == 0 || class117.field1992.method1346(86, -127)) && ((var30 & 0x1) == 0 || class117.field1992.method1346(82, -124)) && ((var30 & 0x4) == 0 || class117.field1992.method1346(81, -126))) {
                                                if (var29 < 10) {
                                                    class397.method2485(-1, "", (byte) 122, var29 + 1, var13.field5506);
                                                } else if (var29 == 10) {
                                                    class236.method1643(-2049);
                                                    class331 var31 = method1975(var13);
                                                    class501.method2952(var31.field4623, var31.method2105(110), var13, (byte) 21);
                                                    class133.field2242 = class616.method3497(0, var13);
                                                    if (class133.field2242 == null) {
                                                        class133.field2242 = "Null";
                                                    }
                                                    class133.field2241 = var13.field5428 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field5383[var29];
                                                if (var13.field5477 == null) {
                                                    var13.field5477 = new int[var13.field5422.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field5477[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field5477[var29] = class641.field8810 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field5477 != null) {
                                        var13.field5477[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class431.method2621(var13, var22 + var28.method143((byte) -127) - var14, var23 + var28.method146(-114) - var15, Integer.MAX_VALUE);
                            }
                            if (class591.field8071 != null && class591.field8071 != var13 && var25 && method1975(var13).method2100(17356)) {
                                class238.field3455 = var13;
                            }
                            if (class234.field3393 == var13) {
                                class422.field6093 = true;
                                class527.field7294 = var14;
                                class246.field3594 = var15;
                            }
                            if (var13.field5358 || var13.field5441 != 0) {
                                if (var25 && class266.field3770 != 0 && var13.field5479 != null) {
                                    class33 var33 = new class33();
                                    var33.field851 = true;
                                    var33.field847 = var13;
                                    var33.field853 = class266.field3770;
                                    var33.field845 = var13.field5479;
                                    class208.field2975.method1273(var33, -20180);
                                }
                                if (class591.field8071 != null || class311.field4321 || class19.field289 != var13.field5441 && class13.field237 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field5441 != 0) {
                                    if (class507.field7055 == var13.field5441 || class482.field6728 == var13.field5441) {
                                        class669.field9132 = var13;
                                        if (class318.field4390 != null) {
                                            class318.field4390.method2716(123, class272.field3822, var13.field5465);
                                        }
                                        if (class507.field7055 == var13.field5441) {
                                            if (class311.field4321 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class94.method890(class272.field3822, arg8, arg9, (byte) -50);
                                            class733 var34 = (class733) class696.field9402.method1301(8);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field9896 && arg10 < var34.field9893 && arg11 >= var34.field9894 && arg11 < var34.field9892) {
                                                    class750.method4183((byte) 107);
                                                    class644.method3657(-3, var34.field9898);
                                                }
                                                var34 = (class733) class696.field9402.method1307((byte) -67);
                                            }
                                        }
                                    }
                                    if (class316.field4377 == var13.field5441) {
                                        if (var13.method2385(class272.field3822, (byte) 3) == null || class318.field4392 != 0 && class318.field4392 != 3 || class311.field4321 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field5353[var36];
                                        if (var35 < var37 || var35 > var13.field5448[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field5385 / 2;
                                        int var39 = var36 - var13.field5465 / 2;
                                        int var40;
                                        if (class438.field6252 == 4) {
                                            var40 = (int) class451.field6366 & 0x3FFF;
                                        } else {
                                            var40 = (int) class451.field6366 + class28.field748 & 0x3FFF;
                                        }
                                        int var41 = class255.field3698[var40];
                                        int var42 = class255.field3695[var40];
                                        if (class438.field6252 != 4) {
                                            var41 = (class548.field7552 + 256) * var41 >> 8;
                                            var42 = (class548.field7552 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class438.field6252 == 4) {
                                            var45 = (class667.field9105 >> 9) + (var43 >> 2);
                                            var46 = (class54.field1111 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class58.field1147.method2457((byte) 51) - 1) * 256;
                                            var45 = (class58.field1147.field5922 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class58.field1147.field5933 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class184.field2785 && (class479.field6669 & 0x40) != 0) {
                                            class378 var48 = class751.method4199(class44.field980, (byte) -54, class406.field5949);
                                            if (var48 == null) {
                                                class236.method1643(-2049);
                                            } else {
                                                class142.method1128(false, " ->", var46, (byte) -109, true, var45, var13.field5488, true, 15, (long) (var13.field5380 << 0 | var13.field5506), class133.field2242, 1L, class548.field7549);
                                            }
                                            continue;
                                        }
                                        if (class582.field7970 == class204.field2938) {
                                            class142.method1128(false, "", var46, (byte) -116, true, var45, -1, true, 12, 0L, class497.field6918.method2936(class607.field8336, 544), 1L, -1);
                                        }
                                        class142.method1128(false, "", var46, (byte) -93, true, var45, -1, true, 19, 0L, class107.field1881, 1L, class666.field9095);
                                        continue;
                                    }
                                    if (class19.field289 == var13.field5441) {
                                        class445.field6321 = var13;
                                        if (var25) {
                                            class308.field4271 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method143((byte) -127) - var14 - var13.field5385 / 2) * 2.0D / (double) class489.field6769);
                                            int var50 = (int) (-((double) (var23 + var28.method146(-111) - var15 - var13.field5465 / 2) * 2.0D / (double) class489.field6769));
                                            int var51 = class33.field850 + var49 + class489.field6788;
                                            int var52 = class614.field8388 + var50 + class489.field6785;
                                            class167 var53 = class609.method3461(-17096);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1256(true, var52, var51, var54);
                                            if (var54 != null) {
                                                if (class117.field1992.method1346(82, -128) && class476.field6653 > 0) {
                                                    class570.method3300(var54[2], 2, var54[0], var54[1]);
                                                    continue;
                                                }
                                                class254.field3665 = true;
                                                class449.field6348 = var54[0];
                                                class696.field9404 = var54[1];
                                                class334.field4721 = var54[2];
                                            }
                                            class13.field237 = 1;
                                            class217.field3140 = false;
                                            class228.field3310 = class284.field3963.method574(true);
                                            class293.field4109 = class284.field3963.method571((byte) 72);
                                            continue;
                                        }
                                        if (var26 && class13.field237 > 0) {
                                            if (class13.field237 == 1 && (class228.field3310 != class284.field3963.method574(true) || class293.field4109 != class284.field3963.method571((byte) 117))) {
                                                class468.field6567 = class33.field850;
                                                class704.field9494 = class614.field8388;
                                                class13.field237 = 2;
                                            }
                                            if (class13.field237 == 2) {
                                                class217.field3140 = true;
                                                class624.method3560((byte) -59, class468.field6567 + (int) ((double) (class228.field3310 - class284.field3963.method574(true)) * 2.0D / (double) class489.field6771));
                                                class365.method2323(class704.field9494 - (int) ((double) (class293.field4109 - class284.field3963.method571((byte) 83)) * 2.0D / (double) class489.field6771), (byte) 3);
                                            }
                                            continue;
                                        }
                                        if (class13.field237 > 0 && !class217.field3140) {
                                            if ((class424.field6109 == 1 || class424.method2599(-124)) && class192.field2844 > 2) {
                                                class608.method3452(true, class228.field3310, class293.field4109);
                                            } else if (class515.method3013((byte) 117)) {
                                                class608.method3452(true, class228.field3310, class293.field4109);
                                            }
                                        }
                                        class13.field237 = 0;
                                        continue;
                                    }
                                    if (class754.field10534 == var13.field5441) {
                                        if (var26) {
                                            class236.method1641(var13.field5385, var13.field5465, var22 + class284.field3963.method574(true) - var14, (byte) 58, var23 + class284.field3963.method571((byte) 111) - var15);
                                        }
                                        continue;
                                    }
                                    if (class564.field7787 == var13.field5441) {
                                        class195.method1391(var15, var13, 1, var14);
                                        continue;
                                    }
                                }
                                if (!var13.field5469 && var27) {
                                    var13.field5469 = true;
                                    if (var13.field5439 != null) {
                                        class33 var55 = new class33();
                                        var55.field851 = true;
                                        var55.field847 = var13;
                                        var55.field842 = var22 + var28.method143((byte) -128) - var14;
                                        var55.field853 = var23 + var28.method146(-123) - var15;
                                        var55.field845 = var13.field5439;
                                        class208.field2975.method1273(var55, -20180);
                                    }
                                }
                                if (var13.field5469 && var26 && var13.field5461 != null) {
                                    class33 var56 = new class33();
                                    var56.field851 = true;
                                    var56.field847 = var13;
                                    var56.field842 = var22 + class284.field3963.method574(true) - var14;
                                    var56.field853 = var23 + class284.field3963.method571((byte) 98) - var15;
                                    var56.field845 = var13.field5461;
                                    class208.field2975.method1273(var56, -20180);
                                }
                                if (var13.field5469 && !var26) {
                                    var13.field5469 = false;
                                    if (var13.field5418 != null) {
                                        class33 var57 = new class33();
                                        var57.field851 = true;
                                        var57.field847 = var13;
                                        var57.field842 = var22 + class284.field3963.method574(true) - var14;
                                        var57.field853 = var23 + class284.field3963.method571((byte) 75) - var15;
                                        var57.field845 = var13.field5418;
                                        class575.field7892.method1273(var57, -20180);
                                    }
                                }
                                if (var26 && var13.field5481 != null) {
                                    class33 var58 = new class33();
                                    var58.field851 = true;
                                    var58.field847 = var13;
                                    var58.field842 = var22 + class284.field3963.method574(true) - var14;
                                    var58.field853 = var23 + class284.field3963.method571((byte) 80) - var15;
                                    var58.field845 = var13.field5481;
                                    class208.field2975.method1273(var58, -20180);
                                }
                                if (!var13.field5413 && var25) {
                                    var13.field5413 = true;
                                    if (var13.field5487 != null) {
                                        class33 var59 = new class33();
                                        var59.field851 = true;
                                        var59.field847 = var13;
                                        var59.field842 = var22 + class284.field3963.method574(true) - var14;
                                        var59.field853 = var23 + class284.field3963.method571((byte) 112) - var15;
                                        var59.field845 = var13.field5487;
                                        class208.field2975.method1273(var59, -20180);
                                    }
                                }
                                if (var13.field5413 && var25 && var13.field5515 != null) {
                                    class33 var60 = new class33();
                                    var60.field851 = true;
                                    var60.field847 = var13;
                                    var60.field842 = var22 + class284.field3963.method574(true) - var14;
                                    var60.field853 = var23 + class284.field3963.method571((byte) 95) - var15;
                                    var60.field845 = var13.field5515;
                                    class208.field2975.method1273(var60, -20180);
                                }
                                if (var13.field5413 && !var25) {
                                    var13.field5413 = false;
                                    if (var13.field5359 != null) {
                                        class33 var61 = new class33();
                                        var61.field851 = true;
                                        var61.field847 = var13;
                                        var61.field842 = var22 + class284.field3963.method574(true) - var14;
                                        var61.field853 = var23 + class284.field3963.method571((byte) 90) - var15;
                                        var61.field845 = var13.field5359;
                                        class575.field7892.method1273(var61, -20180);
                                    }
                                }
                                if (var13.field5440 != null) {
                                    class33 var62 = new class33();
                                    var62.field847 = var13;
                                    var62.field845 = var13.field5440;
                                    class223.field3188.method1273(var62, -20180);
                                }
                                if (var13.field5361 != null && class311.field4338 > var13.field5414) {
                                    if (var13.field5494 == null || class311.field4338 - var13.field5414 > 32) {
                                        class33 var67 = new class33();
                                        var67.field847 = var13;
                                        var67.field845 = var13.field5361;
                                        class208.field2975.method1273(var67, -20180);
                                    } else {
                                        label699: for (int var63 = var13.field5414; var63 < class311.field4338; var63++) {
                                            int var64 = class655.field8996[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field5494.length; var65++) {
                                                if (var13.field5494[var65] == var64) {
                                                    class33 var66 = new class33();
                                                    var66.field847 = var13;
                                                    var66.field845 = var13.field5361;
                                                    class208.field2975.method1273(var66, -20180);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5414 = class311.field4338;
                                }
                                if (var13.field5384 != null && class443.field6291 > var13.field5490) {
                                    if (var13.field5507 == null || class443.field6291 - var13.field5490 > 32) {
                                        class33 var72 = new class33();
                                        var72.field847 = var13;
                                        var72.field845 = var13.field5384;
                                        class208.field2975.method1273(var72, -20180);
                                    } else {
                                        label675: for (int var68 = var13.field5490; var68 < class443.field6291; var68++) {
                                            int var69 = class339.field4767[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field5507.length; var70++) {
                                                if (var13.field5507[var70] == var69) {
                                                    class33 var71 = new class33();
                                                    var71.field847 = var13;
                                                    var71.field845 = var13.field5384;
                                                    class208.field2975.method1273(var71, -20180);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5490 = class443.field6291;
                                }
                                if (var13.field5453 != null && class190.field2836 > var13.field5401) {
                                    if (var13.field5362 == null || class190.field2836 - var13.field5401 > 32) {
                                        class33 var77 = new class33();
                                        var77.field847 = var13;
                                        var77.field845 = var13.field5453;
                                        class208.field2975.method1273(var77, -20180);
                                    } else {
                                        label651: for (int var73 = var13.field5401; var73 < class190.field2836; var73++) {
                                            int var74 = class531.field7323[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field5362.length; var75++) {
                                                if (var13.field5362[var75] == var74) {
                                                    class33 var76 = new class33();
                                                    var76.field847 = var13;
                                                    var76.field845 = var13.field5453;
                                                    class208.field2975.method1273(var76, -20180);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5401 = class190.field2836;
                                }
                                if (var13.field5427 != null && class62.field1230 > var13.field5399) {
                                    if (var13.field5447 == null || class62.field1230 - var13.field5399 > 32) {
                                        class33 var82 = new class33();
                                        var82.field847 = var13;
                                        var82.field845 = var13.field5427;
                                        class208.field2975.method1273(var82, -20180);
                                    } else {
                                        label627: for (int var78 = var13.field5399; var78 < class62.field1230; var78++) {
                                            int var79 = class538.field7442[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field5447.length; var80++) {
                                                if (var13.field5447[var80] == var79) {
                                                    class33 var81 = new class33();
                                                    var81.field847 = var13;
                                                    var81.field845 = var13.field5427;
                                                    class208.field2975.method1273(var81, -20180);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5399 = class62.field1230;
                                }
                                if (var13.field5347 != null && class5.field37 > var13.field5391) {
                                    if (var13.field5407 == null || class5.field37 - var13.field5391 > 32) {
                                        class33 var87 = new class33();
                                        var87.field847 = var13;
                                        var87.field845 = var13.field5347;
                                        class208.field2975.method1273(var87, -20180);
                                    } else {
                                        label603: for (int var83 = var13.field5391; var83 < class5.field37; var83++) {
                                            int var84 = class538.field7441[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field5407.length; var85++) {
                                                if (var13.field5407[var85] == var84) {
                                                    class33 var86 = new class33();
                                                    var86.field847 = var13;
                                                    var86.field845 = var13.field5347;
                                                    class208.field2975.method1273(var86, -20180);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field5391 = class5.field37;
                                }
                                if (class587.field8005 > var13.field5402 && var13.field5496 != null) {
                                    class33 var88 = new class33();
                                    var88.field847 = var13;
                                    var88.field845 = var13.field5496;
                                    class208.field2975.method1273(var88, -20180);
                                }
                                if (class646.field8887 > var13.field5402 && var13.field5410 != null) {
                                    class33 var89 = new class33();
                                    var89.field847 = var13;
                                    var89.field845 = var13.field5410;
                                    class208.field2975.method1273(var89, -20180);
                                }
                                if (class460.field6487 > var13.field5402 && var13.field5437 != null) {
                                    class33 var90 = new class33();
                                    var90.field847 = var13;
                                    var90.field845 = var13.field5437;
                                    class208.field2975.method1273(var90, -20180);
                                }
                                if (class510.field7093 > var13.field5402 && var13.field5483 != null) {
                                    class33 var91 = new class33();
                                    var91.field847 = var13;
                                    var91.field845 = var13.field5483;
                                    class208.field2975.method1273(var91, -20180);
                                }
                                if (class728.field9854 > var13.field5402 && var13.field5512 != null) {
                                    class33 var92 = new class33();
                                    var92.field847 = var13;
                                    var92.field845 = var13.field5512;
                                    class208.field2975.method1273(var92, -20180);
                                }
                                var13.field5402 = class253.field3660;
                                if (var13.field5498 != null) {
                                    for (int var93 = 0; var93 < class634.field8719; var93++) {
                                        class33 var94 = new class33();
                                        var94.field847 = var13;
                                        var94.field849 = class749.field10381[var93].method2331(false);
                                        var94.field840 = class749.field10381[var93].method2329((byte) 39);
                                        var94.field845 = var13.field5498;
                                        class208.field2975.method1273(var94, -20180);
                                    }
                                }
                                if (class109.field1903 && var13.field5363 != null) {
                                    class33 var95 = new class33();
                                    var95.field847 = var13;
                                    var95.field845 = var13.field5363;
                                    class208.field2975.method1273(var95, -20180);
                                }
                            }
                            if (var13.field5450 == 5 && var13.field5381 != -1) {
                                var13.method2404(false, class744.field9996, class132.field2230).method2716(84, class272.field3822, var13.field5465);
                            }
                            class131.method1078(var13, -2835);
                            if (var13.field5450 == 0) {
                                method1978(arg0, var13.field5506, var16, var17, var18, var19, var14 - var13.field5423, var15 - var13.field5431, arg8, arg9, arg10, arg11);
                                if (var13.field5474 != null) {
                                    method1978(var13.field5474, var13.field5506, var16, var17, var18, var19, var14 - var13.field5423, var15 - var13.field5431, arg8, arg9, arg10, arg11);
                                }
                                class432 var96 = (class432) class323.field4473.method1465((long) var13.field5506, -6008);
                                if (var96 != null) {
                                    if (class582.field7970 == class456.field6431 && var96.field6184 == 0 && !class311.field4321 && var25 && !class319.field4396) {
                                        class750.method4183((byte) 105);
                                    }
                                    class117.method1027(var96.field6181, var14, var16, var18, arg9, arg8, -1391, arg10, var19, var15, arg11, var17);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class131.method1078(var13, -2835);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lat;)Lat;", line = 2282)
    public static final class378 method1979(class378 arg0) {
        int var1 = method1975(arg0).method2102((byte) 125);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class60.method633(1512932720, arg0.field5510);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2303)
    public static final void method1980() {
        for (int var0 = 0; var0 < class376.field5325; var0++) {
            int[] var1 = class172.field2683[var0];
            for (int var2 = 0; var2 < class175.field2711; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2321)
    public static void method1981(int arg0) {
        field4233 = null;
        if (arg0 == 31) {
            field4224 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lat;)Z", line = 2335)
    public static final boolean method1982(class378 arg0) {
        if (class319.field4396) {
            if (method1975(arg0).field4628 != 0) {
                return false;
            }
            if (arg0.field5450 == 0) {
                return false;
            }
        }
        return arg0.field5489;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2348)
    public final void method1983(int arg0) {
        if (arg0 != -11018) {
            this.method1973(9);
        }
        field4234++;
        if (class693.field9368.field4468.method1099(-32350) != 2) {
            this.method1989(true);
            return;
        }
        try {
            this.method1989(true);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class444.method2672(var5.getMessage() + " (Recovered) " + this.method1991((byte) 52), var5, 15004);
            class263.field3761 = true;
            class171.method1284(false, (byte) 123, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2376)
    public static final void method1984() {
        int var0 = class219.field3167;
        int[] var1 = class87.field1561;
        int var2 = class61.field1214 ? var0 : class738.field9939 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class390 var4;
            if (var3 < var0) {
                var4 = class49.field1040[var1[var3]];
            } else {
                var4 = ((class751) class86.field1546.method1465((long) class737.field9925[var3 - var0], -6008)).field10510;
            }
            if (var4.field5711 >= 0) {
                int var5 = var4.method2457((byte) 74);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5922 & 0x1FF) == 0 && (var4.field5933 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field5922 & 0x1FF) == 256 && (var4.field5933 & 0x1FF) == 256) {
                    continue;
                }
                var4.field5927 = class197.method1403(var4.field5922, var4.field5926, 11219, var4.field5933);
                class625.method3565(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2423)
    private final void method1985(byte arg0) {
        if (class214.field3036 == 7 && class399.field5899 == 0) {
            if (class591.field8069 > 1) {
                class728.field9854 = class253.field3660;
                class591.field8069--;
            }
            if (!class311.field4321) {
                class750.method4183((byte) 111);
            }
            for (int var2 = 0; var2 < 100 && class302.method1965((byte) -85); var2++) {
            }
        }
        field4222++;
        class322.field4464++;
        class608.method3459(null, false, -1, -1);
        class195.method1391(-1, null, 1, -1);
        class194.method1384((byte) -73);
        class253.field3660++;
        for (int var3 = 0; var3 < class77.field1375; var3++) {
            class9 var4 = class728.field9860[var3].field10510;
            if (var4 != null) {
                byte var5 = var4.field126.field4642;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2457((byte) 117);
                    if ((var5 & 0x2) != 0 && var4.field5745 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field5746[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class376.field5325 - var6 - 1) < var9) {
                                var9 = class376.field5325 - var6 - 1;
                            }
                            int var10 = var4.field5743[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class175.field2711 - var6 - 1)) {
                                var10 = class175.field2711 - var6 - 1;
                            }
                            int var11 = class275.method1816(var9, var6, var6, class265.field3765, true, (byte) 120, -1, var4.field5746[0], var4.field5743[0], class167.field2611, var10, class19.field295[var4.field5926], var6, 0, 0);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field5746[var12] = class167.field2611[var11 - var12 - 1];
                                    var4.field5743[var12] = class265.field3765[var11 - var12 - 1];
                                    var4.field5747[var12] = 1;
                                }
                                var4.field5745 = var11;
                            }
                        }
                    }
                    class293.method1918(true, 0, var4);
                    int var13 = class272.method1796((byte) 108, var4);
                    class221.method1572(true, var4);
                    class545.method3149(class309.field4289, var13, (byte) 122, var4, class422.field6094);
                    class147.method1167(var4, class309.field4289, -84);
                    class460.method2725(-106, var4);
                }
            }
        }
        if (class399.field5899 == 0 && class189.field2825 == 0) {
            if (class438.field6252 == 2) {
                class114.method1006((byte) 127);
            } else {
                class710.method3947((byte) -127);
            }
            if ((class108.field1896 >> 9) < 14 || class108.field1896 >> 9 >= class376.field5325 - 14 || (class275.field3870 >> 9) < 14 || (class275.field3870 >> 9) >= (class175.field2711 - 14)) {
                class661.method3715((byte) -49);
            }
        }
        if (arg0 != 112) {
            field4219 = 22;
        }
        while (true) {
            class33 var14;
            class378 var15;
            class378 var16;
            do {
                var14 = (class33) class223.field3188.method1271(8);
                if (var14 == null) {
                    while (true) {
                        class33 var17;
                        class378 var18;
                        class378 var19;
                        do {
                            var17 = (class33) class575.field7892.method1271(arg0 - 104);
                            if (var17 == null) {
                                while (true) {
                                    class33 var20;
                                    class378 var21;
                                    class378 var22;
                                    do {
                                        var20 = (class33) class208.field2975.method1271(arg0 ^ 0x78);
                                        if (var20 == null) {
                                            if (class591.field8071 != null) {
                                                class109.method973(-30206);
                                            }
                                            if (class641.field8810 % 1500 == 0) {
                                                class630.method3600(9);
                                            }
                                            if (class214.field3036 == 7 && class399.field5899 == 0) {
                                                class210.method1447(-124);
                                            }
                                            class661.method3719(3553);
                                            if (class129.field2172 && (class554.method3190(-107) - 60000L) > class699.field9461) {
                                                class380.method2405(41);
                                            }
                                            for (class692 var23 = (class692) class167.field2627.method1301(8); var23 != null; var23 = (class692) class167.field2627.method1307((byte) -43)) {
                                                if ((class554.method3190(-80) / 1000L - 5L) > ((long) var23.field9365)) {
                                                    if (var23.field9364 > 0) {
                                                        class128.method1064("", 5, (byte) -91, 0, var23.field9361 + class497.field6910.method2936(class607.field8336, 544), "", "");
                                                    }
                                                    if (var23.field9364 == 0) {
                                                        class128.method1064("", 5, (byte) -105, 0, var23.field9361 + class497.field6911.method2936(class607.field8336, arg0 ^ 0x250), "", "");
                                                    }
                                                    var23.method4018(false);
                                                }
                                            }
                                            if (class214.field3036 == 7 && class399.field5899 == 0) {
                                                if (class512.field7137 == null) {
                                                    class170.method1282(false, (byte) 11);
                                                    return;
                                                }
                                                class10.field137++;
                                                if (class10.field137 > 50) {
                                                    class82.field1488++;
                                                    class564 var24 = class227.method1594(class507.field7050, class72.field1320, -104);
                                                    class167.method1260(-49, var24);
                                                }
                                                try {
                                                    class620.method3538(0);
                                                    return;
                                                } catch (IOException var25) {
                                                    class170.method1282(false, (byte) 11);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field847;
                                        if (var21.field5380 < 0) {
                                            break;
                                        }
                                        var22 = class60.method633(1512932720, var21.field5510);
                                    } while (var22 == null || var22.field5474 == null || var22.field5474.length <= var21.field5380 || var22.field5474[var21.field5380] != var21);
                                    class83.method788(var20);
                                }
                            }
                            var18 = var17.field847;
                            if (var18.field5380 < 0) {
                                break;
                            }
                            var19 = class60.method633(1512932720, var18.field5510);
                        } while (var19 == null || var19.field5474 == null || var19.field5474.length <= var18.field5380 || var19.field5474[var18.field5380] != var18);
                        class83.method788(var17);
                    }
                }
                var15 = var14.field847;
                if (var15.field5380 < 0) {
                    break;
                }
                var16 = class60.method633(arg0 ^ 0x5A2D8500, var15.field5510);
            } while (var16 == null || var16.field5474 == null || var15.field5380 >= var16.field5474.length || var16.field5474[var15.field5380] != var15);
            class83.method788(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2706)
    private final void method1986(int arg0) {
        field4236++;
        if (class214.field3036 == 14) {
            return;
        }
        class641.field8810++;
        if (class641.field8810 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class213.field3025 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class349.field4872.setSeed((long) class213.field3025);
        }
        if (class641.field8810 % 50 == 0) {
            class688.field9293 = class542.field7486;
            class542.field7486 = 0;
            class231.field3340 = class633.field8703;
            class633.field8703 = 0;
        }
        this.method1971((byte) 61);
        if (class195.field2886 != null) {
            class195.field2886.method3573(0);
        }
        class639.method3630(0);
        class421.method2584(66);
        class117.field1992.method1345(67);
        class284.field3963.method579(0);
        if (class272.field3822 != null) {
            class272.field3822.method233((int) class554.method3190(-74));
        }
        class96.method905(93);
        class74.field1337 = 0;
        class634.field8719 = 0;
        for (class366 var3 = class117.field1992.method1347(0); var3 != null; var3 = class117.field1992.method1347(0)) {
            int var6 = var3.method2328(26276);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2329((byte) 96);
                if (class197.method1405((byte) 116) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class68.method676(true)) {
                        class376.method2375((byte) -89);
                    } else {
                        class693.method3871(-84);
                    }
                } else if (class634.field8719 < 128) {
                    class749.field10381[class634.field8719] = var3;
                    class634.field8719++;
                }
            } else if (var6 == 0 && class74.field1337 < 75) {
                class373.field5298[class74.field1337] = var3;
                class74.field1337++;
            }
        }
        class266.field3770 = 0;
        for (class19 var4 = class284.field3963.method577(0); var4 != null; var4 = class284.field3963.method577(0)) {
            int var5 = var4.method145(86);
            if (var5 == -1) {
                class261.field3746.method1273(var4, -20180);
            } else if (var5 == 6) {
                class266.field3770 += var4.method150(0);
            } else if (class412.method2552(var5, 1)) {
                class494.field6832.method1273(var4, -20180);
                if (class494.field6832.method1272(0) > 10) {
                    class494.field6832.method1271(8);
                }
            }
        }
        if (class68.method676(true)) {
            class479.method2808(125);
        }
        if (class263.method1763(class214.field3036, (byte) -51)) {
            class684.method3830(true);
            class660.method3714(true);
        } else if (class576.method3321(class214.field3036, (byte) -120)) {
            class53.method602(0);
        }
        if (arg0 < 32) {
            field4233 = null;
        }
        if (class21.method168(class214.field3036, -74) && !class576.method3321(class214.field3036, (byte) -55)) {
            this.method1985((byte) 112);
            class25.method384(110);
            class526.method3045((byte) 102);
        } else if (class626.method3575(class214.field3036, -123) && !class576.method3321(class214.field3036, (byte) -115)) {
            this.method1985((byte) 112);
            class526.method3045((byte) 67);
        } else if (class214.field3036 == 12) {
            class526.method3045((byte) 113);
        } else if (class511.method2997(true, class214.field3036) && !class576.method3321(class214.field3036, (byte) -86)) {
            class141.method1123(11432);
        } else if (class214.field3036 == 13) {
            class526.method3045((byte) -75);
            if (class667.field9106 != -3 && class667.field9106 != 2 && class667.field9106 != 15) {
                class170.method1282(false, (byte) 11);
            }
        }
        class103.method949(class272.field3822, 0);
        class494.field6832.method1271(8);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2873)
    public static final void method1987() {
        int var0 = class219.field3167;
        int[] var1 = class87.field1561;
        int var2 = class693.field9368.field4433.method3656(-32350);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class598 var14 = class49.field1040[var1[var4]];
            if (!var14.method3405((byte) -90)) {
                var14.field5711 = -1;
            } else if (var14.field8196) {
                var14.field5711 = -1;
            } else {
                var14.method46((byte) -126);
                if (var14.field6831 >= 0 && var14.field6838 >= 0 && var14.field6839 < class376.field5325 && var14.field6835 < class175.field2711) {
                    var14.field8166 = var14.field5639 ? var3 : false;
                    if (class58.field1147 == var14) {
                        var14.field5711 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field5735) {
                            var15++;
                        }
                        if (var14.field5649 > class641.field8810) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2457((byte) 101) << 2);
                        if (var14.field8199) {
                            var16 += 512;
                        } else {
                            if (class237.field3445 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field5711 = var16 + 1;
                    }
                } else {
                    var14.field5711 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class738.field9939; var5++) {
            class9 var11 = ((class751) class86.field1546.method1465((long) class737.field9925[var5], -6008)).field10510;
            if (var11.method56((byte) -4) && var11.field126.method2112(class390.field5635, 18627)) {
                var11.method46((byte) -118);
                if (var11.field6831 >= 0 && var11.field6838 >= 0 && var11.field6839 < class376.field5325 && var11.field6835 < class175.field2711) {
                    int var12 = 0;
                    if (!var11.field5735) {
                        var12++;
                    }
                    if (var11.field5649 > class641.field8810) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2457((byte) 82) << 2);
                    if (class237.field3445 == 0) {
                        if (var11.field126.field4679) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class237.field3445 == 1) {
                        if (var11.field126.field4679) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field126.field4662) {
                        var13 += 1024;
                    } else if (!var11.field126.field4698) {
                        var13 += 256;
                    }
                    var11.field5711 = var13 + 1;
                } else {
                    var11.field5711 = -1;
                }
            } else {
                var11.field5711 = -1;
            }
        }
        for (int var6 = 0; var6 < class55.field1118.length; var6++) {
            class741 var7 = class55.field1118[var6];
            if (var7 != null) {
                if (var7.field9982 == 1) {
                    class751 var8 = (class751) class86.field1546.method1465((long) var7.field9975, -6008);
                    if (var8 != null) {
                        class9 var9 = var8.field10510;
                        if (var9.field5711 >= 0) {
                            var9.field5711 += 2048;
                        }
                    }
                } else if (var7.field9982 == 10) {
                    class598 var10 = class49.field1040[var7.field9975];
                    if (var10 != null && class58.field1147 != var10 && var10.field5711 >= 0) {
                        var10.field5711 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3046)
    public final synchronized void method1988(byte arg0) {
        if (arg0 > -11) {
            field4233 = null;
        }
        field4221++;
        if (class675.field9193 != null && class458.field6458 == null && !class689.field9299.field2542) {
            try {
                Class var2 = class675.field9193.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class458.field6458 = (Canvas) var3.get(class675.field9193);
                var3.set(class675.field9193, null);
                if (class458.field6458 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1988((byte) -28);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3077)
    private final void method1989(boolean arg0) {
        field4220++;
        if (class214.field3036 == 14) {
            return;
        }
        long var2 = class401.method2503((byte) -45) / 1000000L - class251.field3635;
        class251.field3635 = class401.method2503((byte) -45) / 1000000L;
        boolean var4 = class269.method1787(!arg0);
        if (var4 && class737.field9928 && class297.field4175 != null) {
            class297.field4175.method3168(-115);
        }
        if (class680.method3814((byte) -79, class214.field3036)) {
            if (class30.field774 != 0L && class554.method3190(-98) > class30.field774) {
                class486.method2864(class324.method2072(-128), class467.field6547, (byte) 102, false, class57.field1136);
            } else if (!class272.field3822.method199() && class209.field2985) {
                class564.method3274(1406);
            }
        }
        if (class699.field9455 == null) {
            Container var5;
            if (class684.field9263 != null) {
                var5 = class684.field9263;
            } else if (class675.field9193 == null) {
                var5 = class566.field7798;
            } else {
                var5 = class675.field9193;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class684.field9263 == var5) {
                Insets var8 = class684.field9263.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class288.field4004 != var6 || class751.field10508 != var7 || class274.field3858) {
                if (class272.field3822 == null || class272.field3822.method238()) {
                    class641.method3638(false);
                } else {
                    class751.field10508 = var7;
                    class288.field4004 = var6;
                }
                class30.field774 = class554.method3190(-66) + 500L;
                class274.field3858 = false;
            }
        }
        if (class699.field9455 != null && !class195.field2888 && class680.method3814((byte) -79, class214.field3036)) {
            class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
        }
        boolean var9 = false;
        if (class647.field8905) {
            var9 = true;
            class647.field8905 = false;
        }
        if (var9) {
            class205.method1423((byte) -116);
        }
        if (class272.field3822 != null && class272.field3822.method199() || class324.method2072(-91) != 1) {
            class299.method1955(-77);
        }
        if (class263.method1763(class214.field3036, (byte) -113)) {
            class96.method898(var9, 117);
        } else if (class361.method2307(class214.field3036, arg0)) {
            class507.method2977(85);
        } else if (class21.method169(class214.field3036, (byte) 56)) {
            class507.method2977(85);
        } else if (class576.method3321(class214.field3036, (byte) -78)) {
            if (class585.field7992 == 1) {
                if (class521.field7235 > class410.field5968) {
                    class410.field5968 = class521.field7235;
                }
                int var10 = (class410.field5968 - class521.field7235) * 50 / class410.field5968;
                class130.method1074(true, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544) + "<br>(" + var10 + "%)", 2, class272.field3822);
            } else if (class585.field7992 == 2) {
                if (class589.field8043 < class627.field8634) {
                    class589.field8043 = class627.field8634;
                }
                int var11 = (class589.field8043 - class627.field8634) * 50 / class589.field8043 + 50;
                class130.method1074(true, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544) + "<br>(" + var11 + "%)", 2, class272.field3822);
            } else {
                class130.method1074(true, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544), 2, class272.field3822);
            }
        } else if (class214.field3036 == 10) {
            class741.method4068((byte) -43, var2);
        } else if (class214.field3036 == 13) {
            class130.method1074(false, class355.field5007, class308.field4276, class497.field6905.method2936(class607.field8336, 544) + "<br>" + class497.field6906.method2936(class607.field8336, 544), 2, class272.field3822);
        }
        if (class745.field10159 == 3) {
            for (int var12 = 0; var12 < class697.field9413; var12++) {
                Rectangle var13 = class27.field743[var12];
                if (class195.field2885[var12]) {
                    class272.field3822.method623(var13.width, var13.y, -65281, var13.x, var13.height, 46);
                } else if (class521.field7232[var12]) {
                    class272.field3822.method623(var13.width, var13.y, -65536, var13.x, var13.height, 40);
                } else {
                    class272.field3822.method623(var13.width, var13.y, -16711936, var13.x, var13.height, 66);
                }
            }
        }
        if (class68.method676(arg0)) {
            class628.method3593(class272.field3822, (byte) 124);
        }
        if (class689.field9299.field2542 && class680.method3814((byte) -79, class214.field3036) && class745.field10159 == 0 && class324.method2072(-85) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class697.field9413; var15++) {
                if (class521.field7232[var15]) {
                    class521.field7232[var15] = false;
                    class387.field5623[var14++] = class27.field743[var15];
                }
            }
            try {
                if (class241.field3529) {
                    class205.method1421(var14, 0, class387.field5623);
                } else {
                    class272.field3822.method619(class387.field5623, var14, 66);
                }
            } catch (class721 var20) {
            }
        } else if (!class263.method1763(class214.field3036, (byte) -59)) {
            for (int var16 = 0; var16 < class697.field9413; var16++) {
                class521.field7232[var16] = false;
            }
            try {
                if (class241.field3529) {
                    class91.method848(107);
                } else {
                    class272.field3822.method627((byte) 104);
                }
            } catch (class721 var19) {
                class444.method2672(var19.getMessage() + " (Recovered) " + this.method1991((byte) 79), var19, 15004);
                class171.method1284(false, (byte) 113, 0);
            }
        }
        class554.method3189(9013);
        int var18 = class693.field9368.field4460.method2662(-32350);
        if (var18 == 0) {
            class700.method3916((byte) -127, 15L);
        } else if (var18 == 1) {
            class700.method3916((byte) -104, 10L);
        } else if (var18 == 2) {
            class700.method3916((byte) -97, 5L);
        } else if (var18 == 3) {
            class700.method3916((byte) -102, 2L);
        }
        if (class516.field7194) {
            class567.method3284(5);
        }
        if (class693.field9368.field4462.method3702(-32350) == 1 && class214.field3036 == 3 && class184.field2784 != -1) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4462, 0);
            class310.method2019(37);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3336)
    public static final void method1990(int arg0) {
        int var1 = class219.field3167;
        int[] var2 = class87.field1561;
        for (int var3 = 0; var3 < class738.field9939 + var1; var3++) {
            class390 var4;
            if (var3 < var1) {
                var4 = class49.field1040[var2[var3]];
            } else {
                var4 = ((class751) class86.field1546.method1465((long) class737.field9925[var3 - var1], -6008)).field10510;
            }
            if (var4.field5926 == arg0 && var4.field5711 >= 0) {
                int var5 = var4.method2457((byte) 114);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5922 & 0x1FF) != 0 || (var4.field5933 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field5922 & 0x1FF) != 256 || (var4.field5933 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5922 >> 9;
                    int var7 = var4.field5933 >> 9;
                    if (var4.field5711 > class172.field2683[var6][var7]) {
                        class172.field2683[var6][var7] = var4.field5711;
                        class616.field8415[var6][var7] = 1;
                    } else if (class172.field2683[var6][var7] == var4.field5711) {
                        var10002 = class616.field8415[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field5922 - var8 >> 9;
                    int var10 = var4.field5933 - var8 >> 9;
                    int var11 = var4.field5922 + var8 >> 9;
                    int var12 = var4.field5933 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5711 > class172.field2683[var13][var14]) {
                                class172.field2683[var13][var14] = var4.field5711;
                                class616.field8415[var13][var14] = 1;
                            } else if (class172.field2683[var13][var14] == var4.field5711) {
                                var10002 = class616.field8415[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;", line = 3433)
    public final String method1991(byte arg0) {
        field4223++;
        String var2 = null;
        try {
            var2 = "[1)" + class221.field3177 + "," + class367.field5236 + "," + class376.field5325 + "," + class175.field2711 + "|";
            if (arg0 < 40) {
                field4233 = null;
            }
            if (class58.field1147 != null) {
                var2 = var2 + "2)" + class382.field5551 + "," + (class58.field1147.field5746[0] + class221.field3177) + "," + (class58.field1147.field5743[0] + class367.field5236) + "|";
            }
            var2 = var2 + "3)" + class693.field9368.field4468.method1099(-32350) + "|4)" + class693.field9368.field4413.method1857(-32350) + "|5)" + class324.method2072(-65) + "|6)" + class467.field6559 + "," + class582.field7968 + "|";
            var2 = var2 + "7)" + class693.field9368.field4427.method3195(-32350) + "|";
            var2 = var2 + "8)" + class693.field9368.field4435.method421(-32350) + "|";
            var2 = var2 + "9)" + class693.field9368.field4456.method3536(-32350) + "|";
            var2 = var2 + "10)" + class693.field9368.field4432.method887(-32350) + "|";
            var2 = var2 + "11)" + class693.field9368.field4440.method3631(-32350) + "|";
            var2 = var2 + "12)" + class693.field9368.field4458.method3022(-32350) + "|";
            var2 = var2 + "13)" + class69.field1286 + "|";
            var2 = var2 + "14)" + class214.field3036;
            if (class270.field3807 != null) {
                var2 = var2 + "|15)" + class270.field3807.field3419;
            }
            try {
                if (class693.field9368.field4468.method1099(-32350) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4237 == null ? (field4237 = method1992("client")) : field4237).getClassLoader());
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
}
