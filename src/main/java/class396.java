import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class396 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[[I")
    private static int[][] field5821 = new int[5][5000];

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private static int field5817 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    private static int[] field5814 = new int[1000];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    private static int[] field5827 = new int[5];

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[Lcv;")
    private static class382[] field5832 = new class382[50];

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field5824 = new String[1000];

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private static int field5833 = 0;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    private static int field5836 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5819 = Calendar.getInstance();

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    private static int[] field5839 = new int[3];

    @OriginalMember(owner = "client!id", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field5840 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Ldc;")
    public static class5 field5841 = new class5(4);

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    private static int field5842 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lp;")
    private static class138 field5835;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lts;")
    private static class356 field5826;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lts;")
    private static class356 field5829;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[I")
    private static int[] field5830;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field5838;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lvf;)V")
    public static final void method2358(class99 arg0) {
        method2363(arg0, 200000);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
    private static final void method2359(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5814[field5836++] = class31.field522;
                return;
            }
            if (arg0 == 5001) {
                field5836 -= 3;
                class31.field522 = field5814[field5836];
                class145.field1876 = class495.method2975(-114, field5814[field5836 + 1]);
                if (class145.field1876 == null) {
                    class145.field1876 = class324.field4738;
                }
                class398.field5874 = field5814[field5836 + 2];
                field5828++;
                class386.method2321(true, class408.field5984);
                class79.field1108.method947(-68, class31.field522);
                class79.field1108.method947(-126, class145.field1876.field1264);
                class79.field1108.method947(-127, class398.field5874);
                return;
            }
            if (arg0 == 5002) {
                field5817 -= 2;
                String var2 = field5824[field5817];
                String var3 = field5824[field5817 + 1];
                field5836 -= 2;
                int var4 = field5814[field5836];
                int var5 = field5814[field5836 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field5837++;
                class386.method2321(true, class231.field3229);
                class79.field1108.method947(-71, class100.method604((byte) 125, var2) + class100.method604((byte) 124, var3) + 2);
                class79.field1108.method956(true, var2);
                class79.field1108.method947(-60, var4 - 1);
                class79.field1108.method947(-102, var5);
                class79.field1108.method956(true, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field5814[--field5836];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class121.field1590[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field5824[field5817++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field5814[--field5836];
                int var9 = -1;
                if (var8 < 100 && class121.field1590[var8] != null) {
                    var9 = class201.field2794[var8];
                }
                field5814[field5836++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class145.field1876 == null) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = class145.field1876.field1264;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var68 = field5824[--field5817];
                method2365(var68, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5817 -= 2;
                String var10 = field5824[field5817];
                String var11 = field5824[field5817 + 1];
                if (class118.field1535 != 0 || (!class434.field6368 || class110.field1445) && !class360.field5350) {
                    field5818++;
                    class386.method2321(true, class195.field2759);
                    class79.field1108.method947(-110, 0);
                    int var12 = class79.field1108.field2018;
                    class79.field1108.method956(true, var10);
                    class483.method2812((byte) 82, var11, class79.field1108);
                    class79.field1108.method966((byte) -60, class79.field1108.field2018 - var12);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var13 = field5814[--field5836];
                String var14 = null;
                if (var13 < 100) {
                    var14 = class90.field1225[var13];
                }
                if (var14 == null) {
                    var14 = "";
                }
                field5824[field5817++] = var14;
                return;
            }
            if (arg0 == 5011) {
                int var15 = field5814[--field5836];
                String var16 = null;
                if (var15 < 100) {
                    var16 = class270.field3779[var15];
                }
                if (var16 == null) {
                    var16 = "";
                }
                field5824[field5817++] = var16;
                return;
            }
            if (arg0 == 5012) {
                int var17 = field5814[--field5836];
                int var18 = -1;
                if (var17 < 100) {
                    var18 = class282.field4032[var17];
                }
                field5814[field5836++] = var18;
                return;
            }
            if (arg0 == 5015) {
                String var19;
                if (class415.field6145 == null || class415.field6145.field4574 == null) {
                    var19 = class219.field3091;
                } else {
                    var19 = class415.field6145.method1885(28166, true);
                }
                field5824[field5817++] = var19;
                return;
            }
            if (arg0 == 5016) {
                field5814[field5836++] = class398.field5874;
                return;
            }
            if (arg0 == 5017) {
                field5814[field5836++] = class362.field5443;
                return;
            }
            if (arg0 == 5018) {
                int var20 = field5814[--field5836];
                int var21 = 0;
                if (var20 < 100 && class121.field1590[var20] != null) {
                    var21 = class201.field2794[var20];
                }
                field5814[field5836++] = var21;
                return;
            }
            if (arg0 == 5019) {
                int var22 = field5814[--field5836];
                String var23 = null;
                if (var22 < 100) {
                    var23 = class49.field754[var22];
                }
                if (var23 == null) {
                    var23 = "";
                }
                field5824[field5817++] = var23;
                return;
            }
            if (arg0 == 5020) {
                String var24;
                if (class415.field6145 == null || class415.field6145.field4574 == null) {
                    var24 = class219.field3091;
                } else {
                    var24 = class415.field6145.method1881(113, false);
                }
                field5824[field5817++] = var24;
                return;
            }
            if (arg0 == 5050) {
                int var25 = field5814[--field5836];
                field5824[field5817++] = class199.field2776.method2149(var25, (byte) -91).field1082;
                return;
            }
            if (arg0 == 5051) {
                int var26 = field5814[--field5836];
                class76 var27 = class199.field2776.method2149(var26, (byte) -123);
                if (var27.field1083 == null) {
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = var27.field1083.length;
                return;
            }
            if (arg0 == 5052) {
                field5836 -= 2;
                int var28 = field5814[field5836];
                int var29 = field5814[field5836 + 1];
                class76 var30 = class199.field2776.method2149(var28, (byte) -93);
                int var31 = var30.field1083[var29];
                field5814[field5836++] = var31;
                return;
            }
            if (arg0 == 5053) {
                int var32 = field5814[--field5836];
                class76 var33 = class199.field2776.method2149(var32, (byte) -125);
                if (var33.field1077 == null) {
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = var33.field1077.length;
                return;
            }
            if (arg0 == 5054) {
                field5836 -= 2;
                int var34 = field5814[field5836];
                int var35 = field5814[field5836 + 1];
                field5814[field5836++] = class199.field2776.method2149(var34, (byte) -113).field1077[var35];
                return;
            }
            if (arg0 == 5055) {
                int var36 = field5814[--field5836];
                field5824[field5817++] = class195.field2749.method2212(var36, -455528836).method1304((byte) 100);
                return;
            }
            if (arg0 == 5056) {
                int var37 = field5814[--field5836];
                class211 var38 = class195.field2749.method2212(var37, -455528836);
                if (var38.field2990 == null) {
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = var38.field2990.length;
                return;
            }
            if (arg0 == 5057) {
                field5836 -= 2;
                int var39 = field5814[field5836];
                int var40 = field5814[field5836 + 1];
                field5814[field5836++] = class195.field2749.method2212(var39, -455528836).field2990[var40];
                return;
            }
            if (arg0 == 5058) {
                field5835 = new class138();
                field5835.field1805 = field5814[--field5836];
                field5835.field1803 = class195.field2749.method2212(field5835.field1805, -455528836);
                field5835.field1804 = new int[field5835.field1803.method1308(-125)];
                return;
            }
            if (arg0 == 5059) {
                field5815++;
                class386.method2321(true, class146.field1894);
                class79.field1108.method947(-116, 0);
                int var41 = class79.field1108.field2018;
                class79.field1108.method947(-105, 0);
                class79.field1108.method961(field5835.field1805, 1608339368);
                field5835.field1803.method1313(class79.field1108, 76, field5835.field1804);
                class79.field1108.method966((byte) -78, class79.field1108.field2018 - var41);
                return;
            }
            if (arg0 == 5060) {
                String var42 = field5824[--field5817];
                field5816++;
                class386.method2321(true, class342.field4964);
                class79.field1108.method947(-30, 0);
                int var43 = class79.field1108.field2018;
                class79.field1108.method956(true, var42);
                class79.field1108.method961(field5835.field1805, 1608339368);
                field5835.field1803.method1313(class79.field1108, -97, field5835.field1804);
                class79.field1108.method966((byte) -115, class79.field1108.field2018 - var43);
                return;
            }
            if (arg0 == 5061) {
                field5815++;
                class386.method2321(true, class146.field1894);
                class79.field1108.method947(-66, 0);
                int var44 = class79.field1108.field2018;
                class79.field1108.method947(-122, 1);
                class79.field1108.method961(field5835.field1805, 1608339368);
                field5835.field1803.method1313(class79.field1108, 58, field5835.field1804);
                class79.field1108.method966((byte) -88, class79.field1108.field2018 - var44);
                return;
            }
            if (arg0 == 5062) {
                field5836 -= 2;
                int var45 = field5814[field5836];
                int var46 = field5814[field5836 + 1];
                field5814[field5836++] = class199.field2776.method2149(var45, (byte) -121).field1085[var46];
                return;
            }
            if (arg0 == 5063) {
                field5836 -= 2;
                int var47 = field5814[field5836];
                int var48 = field5814[field5836 + 1];
                field5814[field5836++] = class199.field2776.method2149(var47, (byte) -128).field1086[var48];
                return;
            }
            if (arg0 == 5064) {
                field5836 -= 2;
                int var49 = field5814[field5836];
                int var50 = field5814[field5836 + 1];
                if (var50 == -1) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = class199.field2776.method2149(var49, (byte) -124).method502((byte) -43, (char) var50);
                return;
            }
            if (arg0 == 5065) {
                field5836 -= 2;
                int var51 = field5814[field5836];
                int var52 = field5814[field5836 + 1];
                if (var52 == -1) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = class199.field2776.method2149(var51, (byte) -125).method499(false, (char) var52);
                return;
            }
            if (arg0 == 5066) {
                int var53 = field5814[--field5836];
                field5814[field5836++] = class195.field2749.method2212(var53, -455528836).method1308(-80);
                return;
            }
            if (arg0 == 5067) {
                field5836 -= 2;
                int var54 = field5814[field5836];
                int var55 = field5814[field5836 + 1];
                int var56 = class195.field2749.method2212(var54, -455528836).method1309(var55, -1).field3142;
                field5814[field5836++] = var56;
                return;
            }
            if (arg0 == 5068) {
                field5836 -= 2;
                int var57 = field5814[field5836];
                int var58 = field5814[field5836 + 1];
                field5835.field1804[var57] = var58;
                return;
            }
            if (arg0 == 5069) {
                field5836 -= 2;
                int var59 = field5814[field5836];
                int var60 = field5814[field5836 + 1];
                field5835.field1804[var59] = var60;
                return;
            }
            if (arg0 == 5070) {
                field5836 -= 3;
                int var61 = field5814[field5836];
                int var62 = field5814[field5836 + 1];
                int var63 = field5814[field5836 + 2];
                class211 var64 = class195.field2749.method2212(var61, -455528836);
                if (var64.method1309(var62, -1).field3142 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5814[field5836++] = var64.method1314(var63, var62, false);
                return;
            }
            if (arg0 == 5071) {
                String var65 = field5824[--field5817];
                boolean var66 = field5814[--field5836] == 1;
                class408.method2442(var66, (byte) 108, var65);
                field5814[field5836++] = class459.field6681;
                return;
            }
            if (arg0 == 5072) {
                if (class142.field1854 != null && class116.field1491 < class459.field6681) {
                    field5814[field5836++] = class142.field1854[class116.field1491++] & 0xFFFF;
                    return;
                }
                field5814[field5836++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class116.field1491 = 0;
                return;
            }
            if (arg0 == 5074) {
                field5815++;
                class386.method2321(true, class146.field1894);
                class79.field1108.method947(-113, 0);
                int var67 = class79.field1108.field2018;
                class79.field1108.method947(-30, 2);
                class79.field1108.method961(field5835.field1805, 1608339368);
                field5835.field1803.method1313(class79.field1108, 106, field5835.field1804);
                class79.field1108.method966((byte) -103, class79.field1108.field2018 - var67);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class489.field7484.method1877(8, 86)) {
                    field5814[field5836++] = 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class489.field7484.method1877(127, 82)) {
                    field5814[field5836++] = 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class489.field7484.method1877(-42, 81)) {
                    field5814[field5836++] = 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class369.method2251(field5814[--field5836], (byte) -80);
                return;
            }
            if (arg0 == 5201) {
                field5814[field5836++] = class297.method1802((byte) -94);
                return;
            }
            if (arg0 == 5205) {
                class308.method1852(106, -1, -1, field5814[--field5836], false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field5814[--field5836];
                class248 var70 = class249.method1554(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = var70.field3543;
                return;
            }
            if (arg0 == 5207) {
                class248 var71 = class249.method1549(field5814[--field5836]);
                if (var71 != null && var71.field3558 != null) {
                    field5824[field5817++] = var71.field3558;
                    return;
                }
                field5824[field5817++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5814[field5836++] = class107.field1434;
                field5814[field5836++] = class334.field4851;
                return;
            }
            if (arg0 == 5209) {
                field5814[field5836++] = class249.field3584 + class192.field2715;
                field5814[field5836++] = class364.field5477 + class249.field3604;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field5814[--field5836];
                class248 var73 = class249.method1549(var72);
                if (var73 == null) {
                    field5814[field5836++] = 0;
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = var73.field3554 >> 14 & 0x3FFF;
                field5814[field5836++] = var73.field3554 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field5814[--field5836];
                class248 var75 = class249.method1549(var74);
                if (var75 == null) {
                    field5814[field5836++] = 0;
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = var75.field3560 - var75.field3556;
                field5814[field5836++] = var75.field3545 - var75.field3553;
                return;
            }
            if (arg0 == 5212) {
                class410 var76 = class505.method3038((byte) 91);
                if (var76 == null) {
                    field5814[field5836++] = -1;
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = var76.field6017;
                int var77 = var76.field6008 << 28 | class249.field3584 + var76.field6009 << 14 | class249.field3604 + var76.field6014;
                field5814[field5836++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class410 var78 = class508.method3059((byte) 86);
                if (var78 == null) {
                    field5814[field5836++] = -1;
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = var78.field6017;
                int var79 = var78.field6008 << 28 | class249.field3584 + var78.field6009 << 14 | class249.field3604 + var78.field6014;
                field5814[field5836++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field5814[--field5836];
                class248 var81 = class375.method2277(30);
                if (var81 != null) {
                    boolean var82 = var81.method1544(var80 >> 14 & 0x3FFF, field5839, var80 >> 28 & 0x3, -15842, var80 & 0x3FFF);
                    if (var82) {
                        class221.method1355((byte) 30, field5839[2], field5839[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5836 -= 2;
                int var83 = field5814[field5836];
                int var84 = field5814[field5836 + 1];
                class389 var85 = class249.method1570(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class248 var87 = (class248) var85.method2347((byte) -120); var87 != null; var87 = (class248) var85.method2341(124)) {
                    if (var87.field3543 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field5814[field5836++] = 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field5814[--field5836];
                class248 var89 = class249.method1549(var88);
                if (var89 == null) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = var89.field3549;
                return;
            }
            if (arg0 == 5220) {
                field5814[field5836++] = class389.field5768 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field5814[--field5836];
                class221.method1355((byte) 30, var90 & 0x3FFF, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class248 var91 = class375.method2277(30);
                if (var91 != null) {
                    boolean var92 = var91.method1543(field5839, class364.field5477 + class249.field3604, class249.field3584 + class192.field2715, -21161);
                    if (var92) {
                        field5814[field5836++] = field5839[1];
                        field5814[field5836++] = field5839[2];
                        return;
                    }
                    field5814[field5836++] = -1;
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = -1;
                field5814[field5836++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5836 -= 2;
                int var93 = field5814[field5836];
                int var94 = field5814[field5836 + 1];
                class308.method1852(108, var94 >> 14 & 0x3FFF, var94 & 0x3FFF, var93, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field5814[--field5836];
                class248 var96 = class375.method2277(30);
                if (var96 != null) {
                    boolean var97 = var96.method1544(var95 >> 14 & 0x3FFF, field5839, var95 >> 28 & 0x3, -15842, var95 & 0x3FFF);
                    if (var97) {
                        field5814[field5836++] = field5839[1];
                        field5814[field5836++] = field5839[2];
                        return;
                    }
                    field5814[field5836++] = -1;
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = -1;
                field5814[field5836++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field5814[--field5836];
                class248 var99 = class375.method2277(30);
                if (var99 != null) {
                    boolean var100 = var99.method1543(field5839, var98 & 0x3FFF, var98 >> 14 & 0x3FFF, -21161);
                    if (var100) {
                        field5814[field5836++] = field5839[1];
                        field5814[field5836++] = field5839[2];
                        return;
                    }
                    field5814[field5836++] = -1;
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = -1;
                field5814[field5836++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class473.method2768(field5814[--field5836], 3);
                return;
            }
            if (arg0 == 5227) {
                field5836 -= 2;
                int var101 = field5814[field5836];
                int var102 = field5814[field5836 + 1];
                class308.method1852(123, var102 >> 14 & 0x3FFF, var102 & 0x3FFF, var101, true);
                return;
            }
            if (arg0 == 5228) {
                class428.field6308 = field5814[--field5836] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5814[field5836++] = class428.field6308 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field5814[--field5836];
                class230.method1403(false, var103);
                return;
            }
            if (arg0 == 5231) {
                field5836 -= 2;
                int var104 = field5814[field5836];
                boolean var105 = field5814[field5836 + 1] == 1;
                if (class55.field854 != null) {
                    class86 var106 = class55.field854.method2310((byte) -107, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method536(false);
                        return;
                    }
                    if (var106 == null && var105) {
                        class86 var107 = new class86();
                        class55.field854.method2317(-1, (long) var104, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field5814[--field5836];
                if (class55.field854 != null) {
                    class86 var109 = class55.field854.method2310((byte) -78, (long) var108);
                    field5814[field5836++] = var109 == null ? 0 : 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5836 -= 2;
                int var110 = field5814[field5836];
                boolean var111 = field5814[field5836 + 1] == 1;
                if (class230.field3213 != null) {
                    class86 var112 = class230.field3213.method2310((byte) -70, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method536(false);
                        return;
                    }
                    if (var112 == null && var111) {
                        class86 var113 = new class86();
                        class230.field3213.method2317(-1, (long) var110, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field5814[--field5836];
                if (class230.field3213 != null) {
                    class86 var115 = class230.field3213.method2310((byte) -60, (long) var114);
                    field5814[field5836++] = var115 == null ? 0 : 1;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5814[field5836++] = class249.field3567 == null ? -1 : class249.field3567.field3543;
                return;
            }
            if (arg0 == 5236) {
                field5836 -= 2;
                int var116 = field5814[field5836];
                int var117 = field5814[field5836 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class224.method1381(var116, -2, var119, var118);
                if (var120 < 0) {
                    field5814[field5836++] = -1;
                    return;
                }
                field5814[field5836++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5836 -= 2;
                int var121 = field5814[field5836];
                int var122 = field5814[field5836 + 1];
                class208.method1284(3, var121, var122, false, -118);
                field5814[field5836++] = class217.field3043 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class217.field3043 != null) {
                    class208.method1284(class118.field1533.field6877, -1, -1, false, 103);
                }
                return;
            }
            if (arg0 == 5302) {
                class7[] var123 = class99.method599(0);
                field5814[field5836++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field5814[--field5836];
                class7[] var125 = class99.method599(0);
                field5814[field5836++] = var125[var124].field127;
                field5814[field5836++] = var125[var124].field125;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class118.field1533.field6893;
                int var127 = class118.field1533.field6878;
                int var128 = -1;
                class7[] var129 = class99.method599(0);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class7 var131 = var129[var130];
                    if (var131.field127 == var126 && var131.field125 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field5814[field5836++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field5814[field5836++] = class262.method1618(-29489);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field5814[--field5836];
                if (var132 >= 1 && var132 <= 2) {
                    class208.method1284(var132, -1, -1, false, 108);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5814[field5836++] = class118.field1533.field6877;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field5814[--field5836];
                if (var133 >= 1 && var133 <= 2) {
                    class118.field1533.field6877 = var133;
                    class118.field1533.method2960(111, class86.field1182);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5817 -= 2;
                String var134 = field5824[field5817];
                String var135 = field5824[field5817 + 1];
                int var136 = field5814[--field5836];
                field5823++;
                class386.method2321(true, class500.field7651);
                class79.field1108.method947(-44, class100.method604((byte) 124, var134) + class100.method604((byte) 124, var135) + 1);
                class79.field1108.method956(true, var134);
                class79.field1108.method956(true, var135);
                class79.field1108.method947(-95, var136);
                return;
            }
            if (arg0 == 5401) {
                field5836 -= 2;
                class161.field2088[field5814[field5836]] = (short) class127.method708(field5814[field5836 + 1], 116);
                class405.field5947.method1151(-1);
                class405.field5947.method1158(0);
                class508.field7744.method562((byte) 101);
                class176.method1103(0);
                return;
            }
            if (arg0 == 5405) {
                field5836 -= 2;
                int var137 = field5814[field5836];
                int var138 = field5814[field5836 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class167.field2192[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5836 -= 7;
                int var139 = field5814[field5836];
                int var140 = field5814[field5836 + 1] << 1;
                int var141 = field5814[field5836 + 2];
                int var142 = field5814[field5836 + 3];
                int var143 = field5814[field5836 + 4];
                int var144 = field5814[field5836 + 5];
                int var145 = field5814[field5836 + 6];
                if (var139 >= 0 && var139 < 2 && class167.field2192[var139] != null && var140 >= 0 && var140 < class167.field2192[var139].length) {
                    class167.field2192[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class167.field2192[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class167.field2192[field5814[--field5836]].length >> 1;
                field5814[field5836++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class217.field3043 != null) {
                    class208.method1284(class118.field1533.field6877, -1, -1, false, 81);
                }
                if (class75.field1066 != null) {
                    class450.method2624(7479);
                    System.exit(0);
                    return;
                }
                String var147 = class422.field6234 == null ? class426.method2543(14055) : class422.field6234;
                class423.method2523(class86.field1182, class293.field4174 == 1, false, var147, true);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class428.field6307 != null) {
                    if (class428.field6307.field6416 == null) {
                        var148 = class380.method2295(109, class428.field6307.field6414);
                    } else {
                        var148 = (String) class428.field6307.field6416;
                    }
                }
                field5824[field5817++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field5814[field5836++] = class44.field670 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class217.field3043 != null) {
                    class208.method1284(class118.field1533.field6877, -1, -1, false, -78);
                }
                String var149 = field5824[--field5817];
                boolean var150 = field5814[--field5836] == 1;
                String var151 = class426.method2543(14055) + var149;
                class423.method2523(class86.field1182, class293.field4174 == 1, var150, var151, true);
                return;
            }
            if (arg0 == 5422) {
                field5817 -= 2;
                String var152 = field5824[field5817];
                String var153 = field5824[field5817 + 1];
                int var154 = field5814[--field5836];
                if (var152.length() > 0) {
                    if (class8.field140 == null) {
                        class8.field140 = new String[class463.field6721[class156.field1996.field4337]];
                    }
                    class8.field140[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class72.field1053 == null) {
                        class72.field1053 = new String[class463.field6721[class156.field1996.field4337]];
                    }
                    class72.field1053[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5824[--field5817]);
                return;
            }
            if (arg0 == 5424) {
                field5836 -= 11;
                class378.field5655 = field5814[field5836];
                class191.field2713 = field5814[field5836 + 1];
                class107.field1430 = field5814[field5836 + 2];
                class208.field2929 = field5814[field5836 + 3];
                class91.field1247 = field5814[field5836 + 4];
                class310.field4519 = field5814[field5836 + 5];
                class437.field6389 = field5814[field5836 + 6];
                class435.field6373 = field5814[field5836 + 7];
                class413.field6114 = field5814[field5836 + 8];
                class465.field6734 = field5814[field5836 + 9];
                class207.field2868 = field5814[field5836 + 10];
                class445.field6482.method1442(class91.field1247, (byte) -107);
                class445.field6482.method1442(class310.field4519, (byte) -117);
                class445.field6482.method1442(class437.field6389, (byte) -127);
                class445.field6482.method1442(class435.field6373, (byte) -113);
                class445.field6482.method1442(class413.field6114, (byte) -125);
                class503.field7683 = null;
                class8.field135 = null;
                class370.field5560 = null;
                class410.field6010 = null;
                class146.field1893 = null;
                class126.field1622 = null;
                class319.field4687 = null;
                class212.field3004 = null;
                class500.field7650 = true;
                return;
            }
            if (arg0 == 5425) {
                class77.method508((byte) -6);
                class500.field7650 = false;
                return;
            }
            if (arg0 == 5426) {
                field5836 -= 2;
                class152.field1954 = field5814[field5836];
                class187.field2656 = field5814[field5836 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5836 -= 2;
                class232.field3237 = field5814[field5836 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5836 -= 2;
                int var155 = field5814[field5836];
                int var156 = field5814[field5836 + 1];
                field5814[field5836++] = class38.method297(var155, var156, 15377) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class400.method2384(8308, false, field5824[--field5817]);
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5836 -= 4;
                int var157 = field5814[field5836];
                int var158 = field5814[field5836 + 1];
                int var159 = field5814[field5836 + 2];
                int var160 = field5814[field5836 + 3];
                class327.method1965((byte) 72, (var157 & 0x3FFF) - class223.field3158, false, (var157 >> 14 & 0x3FFF) - class455.field6637, var160, var158, var159);
                return;
            }
            if (arg0 == 5501) {
                field5836 -= 4;
                int var161 = field5814[field5836];
                int var162 = field5814[field5836 + 1];
                int var163 = field5814[field5836 + 2];
                int var164 = field5814[field5836 + 3];
                class420.method2487((var161 >> 14 & 0x3FFF) - class455.field6637, (var161 & 0x3FFF) - class223.field3158, 120, var163, var162, var164);
                return;
            }
            if (arg0 == 5502) {
                field5836 -= 6;
                int var165 = field5814[field5836];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class362.field5446 = var165;
                int var166 = field5814[field5836 + 1];
                if (var166 + 1 >= class167.field2192[class362.field5446].length >> 1) {
                    throw new RuntimeException();
                }
                class318.field4676 = var166;
                class449.field6548 = 0;
                class17.field243 = field5814[field5836 + 2];
                class485.field7025 = field5814[field5836 + 3];
                int var167 = field5814[field5836 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class72.field1058 = var167;
                int var168 = field5814[field5836 + 5];
                if (var168 + 1 >= class167.field2192[class72.field1058].length >> 1) {
                    throw new RuntimeException();
                }
                class444.field6477 = var168;
                class306.field4454 = 3;
                return;
            }
            if (arg0 == 5503) {
                class193.method1216((byte) 125);
                return;
            }
            if (arg0 == 5504) {
                field5836 -= 2;
                class390.method2351(0, field5814[field5836 + 1], field5814[field5836], (byte) -108);
                return;
            }
            if (arg0 == 5505) {
                field5814[field5836++] = (int) class473.field6841 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5814[field5836++] = (int) class506.field7722 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class198.method1233(false);
                return;
            }
            if (arg0 == 5508) {
                class100.method603(39);
                return;
            }
            if (arg0 == 5509) {
                class342.method2070((byte) -27);
                return;
            }
            if (arg0 == 5510) {
                class7.method60((byte) -88);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field5814[--field5836];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class455.field6637;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class362.field5442) {
                    var172 = class362.field5442;
                }
                int var173 = var171 - class223.field3158;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class203.field2813) {
                    var173 = class203.field2813;
                }
                class365.field5493 = (var172 << 7) + 64;
                class52.field780 = (var173 << 7) + 64;
                class306.field4454 = 4;
                return;
            }
            if (arg0 == 5512) {
                class484.method2828(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5817 -= 2;
                String var174 = field5824[field5817];
                String var175 = field5824[field5817 + 1];
                int var176 = field5814[--field5836];
                if (class323.field4729 != 10) {
                    return;
                }
                if (class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0 && class286.field4090 == 0) {
                    class187.method1173(var175, var174, 128, var176);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                client.method1179(90);
                return;
            }
            if (arg0 == 5602) {
                if (class468.field6755 == 0) {
                    class384.field5705 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field5836 -= 4;
                if (class323.field4729 != 10) {
                    return;
                }
                if (class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0 && class286.field4090 == 0) {
                    class211.method1307(field5814[field5836 + 2], field5814[field5836 + 3], field5814[field5836], 0, field5814[field5836 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field5817--;
                if (class323.field4729 != 10) {
                    return;
                }
                if (class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0 && class286.field4090 == 0) {
                    class497.method2985(class422.method2505(65, field5824[field5817]), (byte) 82);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5817 -= 3;
                field5836 -= 7;
                if (class323.field4729 != 10) {
                    return;
                }
                if (class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0 && class286.field4090 == 0) {
                    class309.method1855(field5814[field5836 + 3], field5814[field5836 + 4] == 1, (byte) 104, field5824[field5817 + 1], field5814[field5836 + 2], field5824[field5817 + 2], field5814[field5836 + 5] == 1, class422.method2505(65, field5824[field5817]), field5814[field5836 + 6] == 1, field5814[field5836 + 1], field5814[field5836]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class497.field7577 == 0) {
                    class379.field5660 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5814[field5836++] = class384.field5705;
                return;
            }
            if (arg0 == 5608) {
                field5814[field5836++] = class398.field5866;
                return;
            }
            if (arg0 == 5609) {
                field5814[field5836++] = class379.field5660;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field5824[field5817++] = class97.field1312.length > var177 ? class338.method2049(class97.field1312[var177], -105) : "";
                }
                class97.field1312 = null;
                return;
            }
            if (arg0 == 5611) {
                field5814[field5836++] = class297.field4328;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field5814[--field5836];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class118.field1533.field6913 = var178;
                class242.method1510(10);
                class118.field1533.method2960(123, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6002) {
                class118.field1533.method2963(field5814[--field5836] == 1, -112);
                class242.method1510(10);
                class2.method9((byte) -48);
                class118.field1533.method2960(112, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6003) {
                class118.field1533.field6880 = field5814[--field5836] == 1;
                class2.method9((byte) -48);
                class118.field1533.method2960(78, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6005) {
                class118.field1533.field6892 = field5814[--field5836] == 1;
                class242.method1510(10);
                class118.field1533.method2960(102, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6006) {
                class118.field1533.field6875 = field5814[--field5836] == 1;
                class481.field6937.method733(!class118.field1533.field6875);
                class118.field1533.method2960(80, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6007) {
                class118.field1533.field6909 = field5814[--field5836];
                class118.field1533.method2960(69, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6008) {
                class118.field1533.field6896 = field5814[--field5836] == 1;
                class118.field1533.method2960(108, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6009) {
                class118.field1533.field6900 = field5814[--field5836] == 1;
                class242.method1510(10);
                class118.field1533.method2960(96, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6010) {
                class118.field1533.field6890 = field5814[--field5836] == 1;
                class118.field1533.method2960(109, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field5814[--field5836];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class242.method1510(10);
                class118.field1533.field6901 = var179;
                class118.field1533.method2960(78, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6012) {
                class118.field1533.field6886 = field5814[--field5836] == 1;
                class489.method2945(25095);
                class428.method2551(-55);
                class118.field1533.method2960(118, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6014) {
                class118.field1533.field6911 = field5814[--field5836] == 1;
                class242.method1510(10);
                class118.field1533.method2960(82, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6015) {
                class118.field1533.field6907 = field5814[--field5836] == 1;
                class242.method1510(10);
                class118.field1533.method2960(90, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field5814[--field5836];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class118.field1533.field6905 = var180;
                class46.method353(class293.field4174, true);
                class118.field1533.method2960(104, class86.field1182);
                return;
            }
            if (arg0 == 6017) {
                class118.field1533.field6884 = field5814[--field5836] == 1;
                class349.method2119(2);
                class118.field1533.method2960(124, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field5814[--field5836];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class118.field1533.field6912 = var181;
                class118.field1533.method2960(106, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field5814[--field5836];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class118.field1533.field6899 != var182) {
                    if (class118.field1533.field6899 == 0 && class153.field1966 != -1) {
                        class13.method99(false, var182, 0, 10083, class153.field1966, class389.field5781);
                        class286.field4089 = false;
                    } else if (var182 == 0) {
                        class213.method1318(0);
                        class286.field4089 = false;
                    } else {
                        class62.method437((byte) -104, var182);
                    }
                    class118.field1533.field6899 = var182;
                }
                class118.field1533.method2960(102, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field5814[--field5836];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class118.field1533.field6903 = var183;
                class118.field1533.method2960(118, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6021) {
                class118.field1533.field7513 = field5814[--field5836] == 1;
                class2.method9((byte) -48);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field5814[--field5836];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class315.field4620 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class322.method1932(var184, 255);
                class118.field1533.method2960(107, class86.field1182);
                class17.field241 = false;
                field5814[field5836++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field5814[--field5836];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class118.field1533.field6902 = var186;
                class118.field1533.method2960(74, class86.field1182);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field5814[--field5836];
                if (var187 < 0 || var187 > class71.method482(22730, class315.field4620)) {
                    var187 = 0;
                }
                class118.field1533.field6904 = var187;
                class118.field1533.method2960(69, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field5814[--field5836];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class222.method1375(var188 == 1, (byte) -93);
                return;
            }
            if (arg0 == 6028) {
                class118.field1533.field6897 = field5814[--field5836] != 0;
                class118.field1533.method2960(97, class86.field1182);
                return;
            }
            if (arg0 == 6029) {
                class118.field1533.field6909 = field5814[--field5836];
                class118.field1533.method2960(85, class86.field1182);
                return;
            }
            if (arg0 == 6030) {
                class118.field1533.field6888 = field5814[--field5836] != 0;
                class118.field1533.method2960(111, class86.field1182);
                class242.method1510(10);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field5814[--field5836];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class46.method353(var189, true);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field5814[--field5836];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class118.field1533.field6895 = var190;
                class118.field1533.method2960(115, class86.field1182);
                class17.field241 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field5814[--field5836];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class118.field1533.field6881 = var191;
                class118.field1533.method2960(78, class86.field1182);
                return;
            }
            if (arg0 == 6035) {
                class118.field1533.field7511 = field5814[--field5836] == 1;
                class242.method1510(10);
                class2.method9((byte) -48);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5814[field5836++] = class118.field1533.field6913;
                return;
            }
            if (arg0 == 6102) {
                field5814[field5836++] = class118.field1533.method2957(class293.field4174, -1) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5814[field5836++] = class118.field1533.field6880 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5814[field5836++] = class118.field1533.field6892 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field5814[field5836++] = class118.field1533.field6875 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5814[field5836++] = class118.field1533.field6909;
                return;
            }
            if (arg0 == 6108) {
                field5814[field5836++] = class118.field1533.field6896 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field5814[field5836++] = class118.field1533.field6900 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5814[field5836++] = class118.field1533.field6890 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5814[field5836++] = class118.field1533.field6901;
                return;
            }
            if (arg0 == 6112) {
                field5814[field5836++] = class118.field1533.field6886 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5814[field5836++] = class118.field1533.field6911 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5814[field5836++] = class118.field1533.field6907 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5814[field5836++] = class118.field1533.field6905;
                return;
            }
            if (arg0 == 6117) {
                field5814[field5836++] = class118.field1533.field6884 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5814[field5836++] = class118.field1533.field6912;
                return;
            }
            if (arg0 == 6119) {
                field5814[field5836++] = class118.field1533.field6899;
                return;
            }
            if (arg0 == 6120) {
                field5814[field5836++] = class118.field1533.field6903;
                return;
            }
            if (arg0 == 6121) {
                field5814[field5836++] = class481.field6937.method840() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field5814[field5836++] = class466.method2727(100);
                return;
            }
            if (arg0 == 6124) {
                field5814[field5836++] = class118.field1533.field6902;
                return;
            }
            if (arg0 == 6125) {
                field5814[field5836++] = class118.field1533.field6904;
                return;
            }
            if (arg0 == 6126) {
                field5814[field5836++] = class481.field6937.method815() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field5814[field5836++] = class118.field1533.field6898 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5814[field5836++] = class118.field1533.field6897 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5814[field5836++] = class118.field1533.field6909;
                return;
            }
            if (arg0 == 6130) {
                field5814[field5836++] = class118.field1533.field6888 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5814[field5836++] = class293.field4174;
                return;
            }
            if (arg0 == 6132) {
                field5814[field5836++] = class118.field1533.field6895;
                return;
            }
            if (arg0 == 6133) {
                field5814[field5836++] = class44.field670 == 1 || class44.field670 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field5814[field5836++] = class71.method482(22730, class315.field4620);
                return;
            }
            if (arg0 == 6135) {
                field5814[field5836++] = class118.field1533.field6881;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5836 -= 2;
                class112.field1469 = (short) field5814[field5836];
                if (class112.field1469 <= 0) {
                    class112.field1469 = 256;
                }
                class42.field638 = (short) field5814[field5836 + 1];
                if (class42.field638 <= 0) {
                    class42.field638 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5836 -= 2;
                class146.field1892 = (short) field5814[field5836];
                if (class146.field1892 <= 0) {
                    class146.field1892 = 256;
                }
                class27.field445 = (short) field5814[field5836 + 1];
                if (class27.field445 <= 0) {
                    class27.field445 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5836 -= 4;
                class267.field3767 = (short) field5814[field5836];
                if (class267.field3767 <= 0) {
                    class267.field3767 = 1;
                }
                class286.field4087 = (short) field5814[field5836 + 1];
                if (class286.field4087 <= 0) {
                    class286.field4087 = 32767;
                } else if (class286.field4087 < class267.field3767) {
                    class286.field4087 = class267.field3767;
                }
                class441.field6439 = (short) field5814[field5836 + 2];
                if (class441.field6439 <= 0) {
                    class441.field6439 = 1;
                }
                class315.field4623 = (short) field5814[field5836 + 3];
                if (class315.field4623 <= 0) {
                    class315.field4623 = 32767;
                    return;
                }
                if (class315.field4623 < class441.field6439) {
                    class315.field4623 = class441.field6439;
                }
                return;
            }
            if (arg0 == 6203) {
                class463.method2717(0, false, 0, 114, class186.field2642.field5168, class186.field2642.field5169);
                field5814[field5836++] = class115.field1483;
                field5814[field5836++] = class87.field1201;
                return;
            }
            if (arg0 == 6204) {
                field5814[field5836++] = class146.field1892;
                field5814[field5836++] = class27.field445;
                return;
            }
            if (arg0 == 6205) {
                field5814[field5836++] = class112.field1469;
                field5814[field5836++] = class42.field638;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5814[field5836++] = (int) (class109.method653(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5814[field5836++] = (int) (class109.method653(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5836 -= 3;
                int var192 = field5814[field5836];
                int var193 = field5814[field5836 + 1];
                int var194 = field5814[field5836 + 2];
                field5819.clear();
                field5819.set(11, 12);
                field5819.set(var194, var193, var192);
                field5814[field5836++] = (int) (field5819.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field5819.clear();
                field5819.setTime(new Date(class109.method653(false)));
                field5814[field5836++] = field5819.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field5814[--field5836];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field5814[field5836++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5814[field5836++] = class317.method1912(-29) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5814[field5836++] = class442.method2582((byte) -76) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class323.field4729 == 10 && class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0) {
                    field5814[field5836++] = class263.method1620(2) == -1 ? 0 : 1;
                    return;
                }
                field5814[field5836++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class450 var197 = class383.method2304(125);
                if (var197 != null) {
                    field5814[field5836++] = var197.field6560;
                    field5814[field5836++] = var197.field2718;
                    field5824[field5817++] = var197.field6561;
                    class452 var198 = var197.method2622(-2040516573);
                    field5814[field5836++] = var198.field6580;
                    field5824[field5817++] = var198.field6579;
                    field5814[field5836++] = var197.field2721;
                    field5814[field5836++] = var197.field6564;
                    return;
                }
                field5814[field5836++] = -1;
                field5814[field5836++] = 0;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class450 var199 = class225.method1392((byte) -92);
                if (var199 != null) {
                    field5814[field5836++] = var199.field6560;
                    field5814[field5836++] = var199.field2718;
                    field5824[field5817++] = var199.field6561;
                    class452 var200 = var199.method2622(-2040516573);
                    field5814[field5836++] = var200.field6580;
                    field5824[field5817++] = var200.field6579;
                    field5814[field5836++] = var199.field2721;
                    field5814[field5836++] = var199.field6564;
                    return;
                }
                field5814[field5836++] = -1;
                field5814[field5836++] = 0;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field5814[--field5836];
                if (class323.field4729 == 10 && class327.field4765 == 0 && class468.field6755 == 0 && class497.field7577 == 0) {
                    field5814[field5836++] = class355.method2150((byte) 67, var201) ? 1 : 0;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class118.field1533.field6876 = field5814[--field5836];
                class118.field1533.method2960(69, class86.field1182);
                return;
            }
            if (arg0 == 6505) {
                field5814[field5836++] = class118.field1533.field6876;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field5814[--field5836];
                class450 var203 = class469.method2749(var202, (byte) 19);
                if (var203 != null) {
                    field5814[field5836++] = var203.field2718;
                    field5824[field5817++] = var203.field6561;
                    class452 var204 = var203.method2622(-2040516573);
                    field5814[field5836++] = var204.field6580;
                    field5824[field5817++] = var204.field6579;
                    field5814[field5836++] = var203.field2721;
                    field5814[field5836++] = var203.field6564;
                    return;
                }
                field5814[field5836++] = -1;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5824[field5817++] = "";
                field5814[field5836++] = 0;
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field5836 -= 4;
                int var205 = field5814[field5836];
                boolean var206 = field5814[field5836 + 1] == 1;
                int var207 = field5814[field5836 + 2];
                boolean var208 = field5814[field5836 + 3] == 1;
                class66.method466(27402, var206, var205, var207, var208);
                return;
            }
            if (arg0 == 6508) {
                class141.method890((byte) -125);
                return;
            }
            if (arg0 == 6509) {
                if (class323.field4729 != 10) {
                    return;
                }
                class444.field6475 = field5814[--field5836] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class118.field1533.field6908 = field5814[--field5836] == 1;
                class118.field1533.method2960(109, class86.field1182);
                return;
            }
            if (arg0 == 6601) {
                field5814[field5836++] = class118.field1533.field6908 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class507.field7729 == class373.field5581) {
            if (arg0 == 6700) {
                int var209 = class213.field3010.method2314(false);
                if (class465.field6737 != -1) {
                    var209++;
                }
                field5814[field5836++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field5814[--field5836];
                if (class465.field6737 != -1) {
                    if (var210 == 0) {
                        field5814[field5836++] = class465.field6737;
                        return;
                    }
                    var210--;
                }
                class311 var211 = (class311) class213.field3010.method2316(4999);
                while (var210-- > 0) {
                    var211 = (class311) class213.field3010.method2308((byte) 28);
                }
                field5814[field5836++] = var211.field4525;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field5814[--field5836];
                if (class181.field2591[var212] == null) {
                    field5824[field5817++] = "";
                    return;
                }
                String var213 = class181.field2591[var212][0].field5267;
                if (var213 == null) {
                    field5824[field5817++] = "";
                    return;
                }
                field5824[field5817++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field5814[--field5836];
                if (class181.field2591[var214] == null) {
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = class181.field2591[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field5836 -= 2;
                int var215 = field5814[field5836];
                int var216 = field5814[field5836 + 1];
                if (class181.field2591[var215] == null) {
                    field5824[field5817++] = "";
                    return;
                }
                String var217 = class181.field2591[var215][var216].field5267;
                if (var217 == null) {
                    field5824[field5817++] = "";
                    return;
                }
                field5824[field5817++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field5836 -= 2;
                int var218 = field5814[field5836];
                int var219 = field5814[field5836 + 1];
                if (class181.field2591[var218] == null) {
                    field5814[field5836++] = 0;
                    return;
                }
                field5814[field5836++] = class181.field2591[var218][var219].field5195;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field5836 -= 3;
                int var220 = field5814[field5836];
                int var221 = field5814[field5836 + 1];
                int var222 = field5814[field5836 + 2];
                class87.method547(var222, var220 << 16 | var221, "", 101, 1);
                return;
            }
            if (arg0 == 6708) {
                field5836 -= 3;
                int var223 = field5814[field5836];
                int var224 = field5814[field5836 + 1];
                int var225 = field5814[field5836 + 2];
                class87.method547(var225, var223 << 16 | var224, "", -46, 2);
                return;
            }
            if (arg0 == 6709) {
                field5836 -= 3;
                int var226 = field5814[field5836];
                int var227 = field5814[field5836 + 1];
                int var228 = field5814[field5836 + 2];
                class87.method547(var228, var226 << 16 | var227, "", -117, 3);
                return;
            }
            if (arg0 == 6710) {
                field5836 -= 3;
                int var229 = field5814[field5836];
                int var230 = field5814[field5836 + 1];
                int var231 = field5814[field5836 + 2];
                class87.method547(var231, var229 << 16 | var230, "", -95, 4);
                return;
            }
            if (arg0 == 6711) {
                field5836 -= 3;
                int var232 = field5814[field5836];
                int var233 = field5814[field5836 + 1];
                int var234 = field5814[field5836 + 2];
                class87.method547(var234, var232 << 16 | var233, "", -29, 5);
                return;
            }
            if (arg0 == 6712) {
                field5836 -= 3;
                int var235 = field5814[field5836];
                int var236 = field5814[field5836 + 1];
                int var237 = field5814[field5836 + 2];
                class87.method547(var237, var235 << 16 | var236, "", -106, 6);
                return;
            }
            if (arg0 == 6713) {
                field5836 -= 3;
                int var238 = field5814[field5836];
                int var239 = field5814[field5836 + 1];
                int var240 = field5814[field5836 + 2];
                class87.method547(var240, var238 << 16 | var239, "", 70, 7);
                return;
            }
            if (arg0 == 6714) {
                field5836 -= 3;
                int var241 = field5814[field5836];
                int var242 = field5814[field5836 + 1];
                int var243 = field5814[field5836 + 2];
                class87.method547(var243, var241 << 16 | var242, "", -103, 8);
                return;
            }
            if (arg0 == 6715) {
                field5836 -= 3;
                int var244 = field5814[field5836];
                int var245 = field5814[field5836 + 1];
                int var246 = field5814[field5836 + 2];
                class87.method547(var246, var244 << 16 | var245, "", 79, 9);
                return;
            }
            if (arg0 == 6716) {
                field5836 -= 3;
                int var247 = field5814[field5836];
                int var248 = field5814[field5836 + 1];
                int var249 = field5814[field5836 + 2];
                class87.method547(var249, var247 << 16 | var248, "", -48, 10);
                return;
            }
            if (arg0 == 6717) {
                field5836 -= 3;
                int var250 = field5814[field5836];
                int var251 = field5814[field5836 + 1];
                int var252 = field5814[field5836 + 2];
                class356 var253 = class236.method1433(var252, var250 << 16 | var251, (byte) 101);
                class489.method2941(-1);
                class489 var254 = client.method1188(var253);
                class179.method1137(-1, var253, var254.field7482, var254.method2933(2015625216));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field5814[--field5836];
                class170 var256 = class96.field1295.method282(var255, 34);
                if (var256.field2273 == null) {
                    field5824[field5817++] = "";
                    return;
                }
                field5824[field5817++] = var256.field2273;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field5814[--field5836];
                class170 var258 = class96.field1295.method282(var257, 83);
                field5814[field5836++] = var258.field2258;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field5814[--field5836];
                class170 var260 = class96.field1295.method282(var259, 29);
                field5814[field5836++] = var260.field2266;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field5814[--field5836];
                class170 var262 = class96.field1295.method282(var261, 55);
                field5814[field5836++] = var262.field2242;
                return;
            }
            if (arg0 == 6804) {
                field5836 -= 2;
                int var263 = field5814[field5836];
                int var264 = field5814[field5836 + 1];
                class483 var265 = class228.field3209.method1536((byte) -123, var264);
                if (var265.method2817(-1381)) {
                    field5824[field5817++] = class96.field1295.method282(var263, 117).method1067(var265.field6997, var264, (byte) -32);
                    return;
                }
                field5814[field5836++] = class96.field1295.method282(var263, 43).method1069(-114, var264, var265.field7000);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method2360(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5819.setTime(new Date(var1));
        int var3 = field5819.get(5);
        int var4 = field5819.get(2);
        int var5 = field5819.get(1);
        return var3 + "-" + field5840[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)V")
    public static final void method2361(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public static final void method2362() {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lvf;I)V")
    private static final void method2363(class99 arg0, int arg1) {
        Object[] var2 = arg0.field1346;
        int var3 = (Integer) var2[0];
        class37 var4 = class298.method1808(26504, var3);
        if (var4 == null) {
            return;
        }
        field5830 = new int[var4.field571];
        int var5 = 0;
        field5838 = new String[var4.field577];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1345;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1351;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1343 == null ? -1 : arg0.field1343.field5185;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1348;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1343 == null ? -1 : arg0.field1343.field5184;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1350 == null ? -1 : arg0.field1350.field5185;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1350 == null ? -1 : arg0.field1350.field5184;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1355;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1342;
                }
                field5830[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1352;
                }
                field5838[var6++] = var9;
            }
        }
        field5842 = arg0.field1349;
        method2369(var4, arg1);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method2364(int arg0) {
        if (arg0 == -1 || !class322.method1928(arg0, 7387)) {
            return;
        }
        class356[] var1 = class181.field2591[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class356 var3 = var1[var2];
            if (var3.field5253 != null) {
                class99 var4 = new class99();
                var4.field1343 = var3;
                var4.field1346 = var3.field5253;
                method2363(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2365(String arg0, int arg1) {
        if (class118.field1535 == 0 && !(!class434.field6368 || class110.field1445) || class360.field5350) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class498.field7579.method1220(2969, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class498.field7579.method1220(2969, 0).length());
        } else if (var2.startsWith(class231.field3225.method1220(2969, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class231.field3225.method1220(2969, 0).length());
        } else if (var2.startsWith(class33.field537.method1220(2969, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class33.field537.method1220(2969, 0).length());
        } else if (var2.startsWith(class205.field2838.method1220(2969, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class205.field2838.method1220(2969, 0).length());
        } else if (var2.startsWith(class102.field1378.method1220(2969, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class102.field1378.method1220(2969, 0).length());
        } else if (var2.startsWith(class202.field2806.method1220(2969, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class202.field2806.method1220(2969, 0).length());
        } else if (var2.startsWith(class481.field6938.method1220(2969, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class481.field6938.method1220(2969, 0).length());
        } else if (var2.startsWith(class145.field1883.method1220(2969, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class145.field1883.method1220(2969, 0).length());
        } else if (var2.startsWith(class434.field6370.method1220(2969, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class434.field6370.method1220(2969, 0).length());
        } else if (var2.startsWith(class267.field3769.method1220(2969, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class267.field3769.method1220(2969, 0).length());
        } else if (var2.startsWith(class337.field4902.method1220(2969, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class337.field4902.method1220(2969, 0).length());
        } else if (var2.startsWith(class336.field4870.method1220(2969, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class336.field4870.method1220(2969, 0).length());
        } else if (class81.field1122 != 0) {
            if (var2.startsWith(class498.field7579.method1220(2969, class81.field1122))) {
                var3 = 0;
                arg0 = arg0.substring(class498.field7579.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class231.field3225.method1220(2969, class81.field1122))) {
                var3 = 1;
                arg0 = arg0.substring(class231.field3225.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class33.field537.method1220(2969, class81.field1122))) {
                var3 = 2;
                arg0 = arg0.substring(class33.field537.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class205.field2838.method1220(2969, class81.field1122))) {
                var3 = 3;
                arg0 = arg0.substring(class205.field2838.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class102.field1378.method1220(2969, class81.field1122))) {
                var3 = 4;
                arg0 = arg0.substring(class102.field1378.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class202.field2806.method1220(2969, class81.field1122))) {
                var3 = 5;
                arg0 = arg0.substring(class202.field2806.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class481.field6938.method1220(2969, class81.field1122))) {
                var3 = 6;
                arg0 = arg0.substring(class481.field6938.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class145.field1883.method1220(2969, class81.field1122))) {
                var3 = 7;
                arg0 = arg0.substring(class145.field1883.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class434.field6370.method1220(2969, class81.field1122))) {
                var3 = 8;
                arg0 = arg0.substring(class434.field6370.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class267.field3769.method1220(2969, class81.field1122))) {
                var3 = 9;
                arg0 = arg0.substring(class267.field3769.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class337.field4902.method1220(2969, class81.field1122))) {
                var3 = 10;
                arg0 = arg0.substring(class337.field4902.method1220(2969, class81.field1122).length());
            } else if (var2.startsWith(class336.field4870.method1220(2969, class81.field1122))) {
                var3 = 11;
                arg0 = arg0.substring(class336.field4870.method1220(2969, class81.field1122).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class233.field3262.method1220(2969, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class233.field3262.method1220(2969, 0).length());
        } else if (var4.startsWith(class14.field214.method1220(2969, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class14.field214.method1220(2969, 0).length());
        } else if (var4.startsWith(class175.field2399.method1220(2969, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class175.field2399.method1220(2969, 0).length());
        } else if (var4.startsWith(class43.field649.method1220(2969, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class43.field649.method1220(2969, 0).length());
        } else if (var4.startsWith(class359.field5320.method1220(2969, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class359.field5320.method1220(2969, 0).length());
        } else if (class81.field1122 != 0) {
            if (var4.startsWith(class233.field3262.method1220(2969, class81.field1122))) {
                var5 = 1;
                arg0 = arg0.substring(class233.field3262.method1220(2969, class81.field1122).length());
            } else if (var4.startsWith(class14.field214.method1220(2969, class81.field1122))) {
                var5 = 2;
                arg0 = arg0.substring(class14.field214.method1220(2969, class81.field1122).length());
            } else if (var4.startsWith(class175.field2399.method1220(2969, class81.field1122))) {
                var5 = 3;
                arg0 = arg0.substring(class175.field2399.method1220(2969, class81.field1122).length());
            } else if (var4.startsWith(class43.field649.method1220(2969, class81.field1122))) {
                var5 = 4;
                arg0 = arg0.substring(class43.field649.method1220(2969, class81.field1122).length());
            } else if (var4.startsWith(class359.field5320.method1220(2969, class81.field1122))) {
                var5 = 5;
                arg0 = arg0.substring(class359.field5320.method1220(2969, class81.field1122).length());
            }
        }
        field5834++;
        class386.method2321(true, class490.field7492);
        class79.field1108.method947(-92, 0);
        int var6 = class79.field1108.field2018;
        if (arg1 == 5021) {
            class79.field1108.method947(-66, 1);
        } else if (arg1 == 5022) {
            class79.field1108.method947(-91, 2);
        } else {
            class79.field1108.method947(-54, 0);
        }
        class79.field1108.method947(-110, var3);
        class79.field1108.method947(-70, var5);
        class483.method2812((byte) 111, arg0, class79.field1108);
        class79.field1108.method966((byte) -95, class79.field1108.field2018 - var6);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    private static final void method2366(int arg0) {
        class356 var1 = class4.method25(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class356[] var3 = class135.field1730[var2];
        if (var3 == null) {
            class356[] var4 = class181.field2591[var2];
            int var5 = var4.length;
            var3 = class135.field1730[var2] = new class356[var5];
            class268.method1642(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class268.method1642(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpp;II)V")
    public static final void method2367(class256 arg0, int arg1, int arg2) {
        class37 var3 = class363.method2213(926723216, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field5830 = new int[var3.field571];
        field5838 = new String[var3.field577];
        if (class317.field4654 == var3.field572 || class352.field5105 == var3.field572 || class114.field1470 == var3.field572) {
            int var4 = 0;
            int var5 = 0;
            if (class26.field431 != null) {
                var4 = class26.field431.field5209;
                var5 = class26.field431.field5179;
            }
            field5830[0] = class137.field1797.method2038(9) - var4;
            field5830[1] = class137.field1797.method2044((byte) -24) - var5;
        }
        method2369(var3, 200000);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    public static void method2368() {
        field5830 = null;
        field5838 = null;
        field5827 = null;
        field5821 = null;
        field5814 = null;
        field5824 = null;
        field5832 = null;
        field5826 = null;
        field5829 = null;
        field5835 = null;
        field5819 = null;
        field5840 = null;
        field5839 = null;
        field5841 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lvg;I)V")
    private static final void method2369(class37 arg0, int arg1) {
        field5836 = 0;
        field5817 = 0;
        int var2 = -1;
        int[] var3 = arg0.field578;
        int[] var4 = arg0.field568;
        byte var5 = -1;
        field5833 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method2371(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2359(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field5814[field5836++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field5814[field5836++] = class453.field6591.field209[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class453.field6591.method102((byte) -32, field5814[--field5836], var8);
                } else if (var43 == 3) {
                    field5824[field5817++] = arg0.field576[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field5836 -= 2;
                    if (field5814[field5836 + 1] != field5814[field5836]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field5836 -= 2;
                    if (field5814[field5836 + 1] == field5814[field5836]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field5836 -= 2;
                    if (field5814[field5836] < field5814[field5836 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field5836 -= 2;
                    if (field5814[field5836] > field5814[field5836 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5833 == 0) {
                        return;
                    }
                    class382 var9 = field5832[--field5833];
                    arg0 = var9.field5684;
                    var3 = arg0.field578;
                    var4 = arg0.field568;
                    var2 = var9.field5683;
                    field5830 = var9.field5685;
                    field5838 = var9.field5686;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field5814[field5836++] = class453.field6591.method109(var10, 5687);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class453.field6591.method107(-26935, var11, field5814[--field5836]);
                } else if (var43 == 31) {
                    field5836 -= 2;
                    if (field5814[field5836] <= field5814[field5836 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field5836 -= 2;
                    if (field5814[field5836] >= field5814[field5836 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field5814[field5836++] = field5830[var4[var2]];
                } else if (var43 == 34) {
                    field5830[var4[var2]] = field5814[--field5836];
                } else if (var43 == 35) {
                    field5824[field5817++] = field5838[var4[var2]];
                } else if (var43 == 36) {
                    field5838[var4[var2]] = field5824[--field5817];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field5817 -= var12;
                    String var13 = class277.method1697(7184, field5824, var12, field5817);
                    field5824[field5817++] = var13;
                } else if (var43 == 38) {
                    field5836--;
                } else if (var43 == 39) {
                    field5817--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class37 var15 = class298.method1808(26504, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field571];
                    String[] var17 = new String[var15.field577];
                    for (int var18 = 0; var18 < var15.field573; var18++) {
                        var16[var18] = field5814[field5836 + var18 - var15.field573];
                    }
                    for (int var19 = 0; var19 < var15.field570; var19++) {
                        var17[var19] = field5824[field5817 + var19 - var15.field570];
                    }
                    field5836 -= var15.field573;
                    field5817 -= var15.field570;
                    class382 var20 = new class382();
                    var20.field5684 = arg0;
                    var20.field5683 = var2;
                    var20.field5685 = field5830;
                    var20.field5686 = field5838;
                    if (field5833 >= field5832.length) {
                        throw new RuntimeException();
                    }
                    field5832[field5833++] = var20;
                    arg0 = var15;
                    var3 = var15.field578;
                    var4 = var15.field568;
                    var2 = -1;
                    field5830 = var16;
                    field5838 = var17;
                } else if (var43 == 42) {
                    field5814[field5836++] = class115.field1486[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class115.field1486[var21] = field5814[--field5836];
                    class25.method214((byte) -100, var21);
                    class438.field6406 |= class420.field6208[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field5814[--field5836];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5827[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5821[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field5814[--field5836];
                    if (var28 < 0 || var28 >= field5827[var27]) {
                        throw new RuntimeException();
                    }
                    field5814[field5836++] = field5821[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field5836 -= 2;
                    int var30 = field5814[field5836];
                    if (var30 < 0 || var30 >= field5827[var29]) {
                        throw new RuntimeException();
                    }
                    field5821[var29][var30] = field5814[field5836 + 1];
                } else if (var43 == 47) {
                    String var31 = class7.field129[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5824[field5817++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class7.field129[var32] = field5824[--field5817];
                    class338.method2050(115, var32);
                } else if (var43 == 51) {
                    class384 var33 = arg0.field574[var4[var2]];
                    class304 var34 = (class304) var33.method2310((byte) 116, (long) field5814[--field5836]);
                    if (var34 != null) {
                        var2 += var34.field4412;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field575 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1177).append(" ");
                for (int var41 = field5833 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field5832[var41].field5684.field1177).append(" ");
                }
                var40.append("op: ").append(var5);
                class356.method2169(var42, var40.toString(), (byte) 34);
            } else {
                class98.method597(29315, "Clientscript error in: " + arg0.field575);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field575).append("\n");
                for (int var38 = field5833 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field5832[var38].field5684.field575).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class356.method2169(var42, var37.toString(), (byte) 34);
                class465.method2724(-26334, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    private static final void method2370(int arg0) {
        class356 var1 = class4.method25(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class356[] var3 = class135.field1730[var2];
        if (var3 == null) {
            class356[] var4 = class181.field2591[var2];
            int var5 = var4.length;
            var3 = class135.field1730[var2] = new class356[var5];
            class268.method1642(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class268.method1642(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(IZ)V")
    private static final void method2371(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field5836 -= 3;
                int var2 = field5814[field5836];
                int var3 = field5814[field5836 + 1];
                int var4 = field5814[field5836 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class356 var5 = class4.method25(var2, false);
                if (var5.field5151 == null) {
                    var5.field5151 = new class356[var4 + 1];
                }
                if (var5.field5151.length <= var4) {
                    class356[] var6 = new class356[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5151.length; var7++) {
                        var6[var7] = var5.field5151[var7];
                    }
                    var5.field5151 = var6;
                }
                if (var4 > 0 && var5.field5151[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class356 var8 = new class356();
                var8.field5170 = var3;
                var8.field5160 = var8.field5185 = var5.field5185;
                var8.field5184 = var4;
                var5.field5151[var4] = var8;
                if (arg1) {
                    field5829 = var8;
                } else {
                    field5826 = var8;
                }
                class170.method1068(-78, var5);
                return;
            }
            if (arg0 == 101) {
                class356 var9 = arg1 ? field5829 : field5826;
                if (var9.field5184 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class356 var10 = class4.method25(var9.field5185, false);
                var10.field5151[var9.field5184] = null;
                class170.method1068(-122, var10);
                return;
            }
            if (arg0 == 102) {
                class356 var11 = class4.method25(field5814[--field5836], false);
                var11.field5151 = null;
                class170.method1068(-87, var11);
                return;
            }
            if (arg0 == 200) {
                field5836 -= 2;
                int var12 = field5814[field5836];
                int var13 = field5814[field5836 + 1];
                class356 var14 = class236.method1433(var13, var12, (byte) 120);
                if (var14 != null && var13 != -1) {
                    field5814[field5836++] = 1;
                    if (arg1) {
                        field5829 = var14;
                        return;
                    }
                    field5826 = var14;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5814[--field5836];
                class356 var16 = class4.method25(var15, false);
                if (var16 != null) {
                    field5814[field5836++] = 1;
                    if (arg1) {
                        field5829 = var16;
                        return;
                    }
                    field5826 = var16;
                    return;
                }
                field5814[field5836++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5814[--field5836];
                method2370(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5814[--field5836];
                method2366(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5836 -= 2;
                int var19 = field5814[field5836];
                int var20 = field5814[field5836 + 1];
                for (int var21 = 0; var21 < class285.field4075.length; var21++) {
                    if (class285.field4075[var21] == var19) {
                        class415.field6145.field4599.method1276(var20, true, var21, class315.field4621);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class360.field5348.length; var22++) {
                    if (class360.field5348[var22] == var19) {
                        class415.field6145.field4599.method1276(var20, true, var22, class315.field4621);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5836 -= 2;
                int var23 = field5814[field5836];
                int var24 = field5814[field5836 + 1];
                class415.field6145.field4599.method1277(-683537784, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5814[--field5836] != 0;
                class415.field6145.field4599.method1272(var25, -32);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class356 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class4.method25(field5814[--field5836], false);
            } else {
                var26 = arg1 ? field5829 : field5826;
            }
            if (arg0 == 1000) {
                field5836 -= 4;
                var26.field5251 = field5814[field5836];
                var26.field5201 = field5814[field5836 + 1];
                int var27 = field5814[field5836 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field5814[field5836 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5161 = (byte) var27;
                var26.field5282 = (byte) var28;
                class170.method1068(-86, var26);
                class28.method233(var26, (byte) -119);
                if (var26.field5184 == -1) {
                    class58.method423((byte) -97, var26.field5185);
                }
                return;
            }
            if (arg0 == 1001) {
                field5836 -= 4;
                var26.field5162 = field5814[field5836];
                var26.field5232 = field5814[field5836 + 1];
                var26.field5211 = 0;
                var26.field5213 = 0;
                int var29 = field5814[field5836 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field5814[field5836 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field5163 = (byte) var29;
                var26.field5148 = (byte) var30;
                class170.method1068(-42, var26);
                class28.method233(var26, (byte) -128);
                if (var26.field5170 == 0) {
                    class53.method393(false, var26, (byte) -81);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field5814[--field5836] == 1;
                if (var26.field5159 != var31) {
                    var26.field5159 = var31;
                    class170.method1068(-37, var26);
                }
                if (var26.field5184 == -1) {
                    class483.method2814(var26.field5185, 116);
                }
                return;
            }
            if (arg0 == 1004) {
                field5836 -= 2;
                var26.field5238 = field5814[field5836];
                var26.field5276 = field5814[field5836 + 1];
                class170.method1068(-48, var26);
                class28.method233(var26, (byte) -125);
                if (var26.field5170 == 0) {
                    class53.method393(false, var26, (byte) -81);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5230 = field5814[--field5836] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class356 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class4.method25(field5814[--field5836], false);
            } else {
                var32 = arg1 ? field5829 : field5826;
            }
            if (arg0 == 1100) {
                field5836 -= 2;
                var32.field5219 = field5814[field5836];
                if (var32.field5219 > var32.field5147 - var32.field5168) {
                    var32.field5219 = var32.field5147 - var32.field5168;
                }
                if (var32.field5219 < 0) {
                    var32.field5219 = 0;
                }
                var32.field5144 = field5814[field5836 + 1];
                if (var32.field5144 > var32.field5235 - var32.field5169) {
                    var32.field5144 = var32.field5235 - var32.field5169;
                }
                if (var32.field5144 < 0) {
                    var32.field5144 = 0;
                }
                class170.method1068(-128, var32);
                if (var32.field5184 == -1) {
                    class406.method2431(false, var32.field5185);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5193 = field5814[--field5836];
                class170.method1068(-45, var32);
                if (var32.field5184 == -1) {
                    class64.method449(var32.field5185, 92);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5255 = field5814[--field5836] == 1;
                class170.method1068(-120, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field5196 = field5814[--field5836];
                class170.method1068(-63, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field5171 = field5814[--field5836];
                class170.method1068(-78, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field5814[--field5836];
                if (var32.field5205 != var33) {
                    var32.field5205 = var33;
                    class170.method1068(-50, var32);
                }
                if (var32.field5184 == -1) {
                    class378.method2287(var32.field5185, -7261);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5137 = field5814[--field5836];
                class170.method1068(-113, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field5206 = field5814[--field5836] == 1;
                class170.method1068(-109, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field5141 = 1;
                var32.field5191 = field5814[--field5836];
                class170.method1068(-74, var32);
                if (var32.field5184 == -1) {
                    class18.method125(var32.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1109) {
                field5836 -= 6;
                var32.field5285 = field5814[field5836];
                var32.field5273 = field5814[field5836 + 1];
                var32.field5139 = field5814[field5836 + 2];
                var32.field5225 = field5814[field5836 + 3];
                var32.field5146 = field5814[field5836 + 4];
                var32.field5240 = field5814[field5836 + 5];
                class170.method1068(-48, var32);
                if (var32.field5184 == -1) {
                    class114.method663(8, var32.field5185);
                    class222.method1376(var32.field5185, (byte) 50);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field5814[--field5836];
                if (var32.field5212 != var34) {
                    var32.field5212 = var34;
                    var32.field5221 = 0;
                    var32.field5217 = 1;
                    var32.field5224 = 0;
                    class170.method1068(-91, var32);
                }
                if (var32.field5184 == -1) {
                    class201.method1243((byte) 35, var32.field5185);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field5208 = field5814[--field5836] == 1;
                class170.method1068(-71, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field5824[--field5817];
                if (!var35.equals(var32.field5246)) {
                    var32.field5246 = var35;
                    class170.method1068(-50, var32);
                }
                if (var32.field5184 == -1) {
                    class84.method530(var32.field5185, 38);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5156 = field5814[--field5836];
                class170.method1068(-81, var32);
                if (var32.field5184 == -1) {
                    class151.method927(var32.field5185, 119);
                }
                return;
            }
            if (arg0 == 1114) {
                field5836 -= 3;
                var32.field5134 = field5814[field5836];
                var32.field5256 = field5814[field5836 + 1];
                var32.field5204 = field5814[field5836 + 2];
                class170.method1068(-50, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field5180 = field5814[--field5836] == 1;
                class170.method1068(-82, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field5216 = field5814[--field5836];
                class170.method1068(-104, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field5132 = field5814[--field5836];
                class170.method1068(-104, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field5155 = field5814[--field5836] == 1;
                class170.method1068(-42, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field5154 = field5814[--field5836] == 1;
                class170.method1068(-68, var32);
                return;
            }
            if (arg0 == 1120) {
                field5836 -= 2;
                var32.field5147 = field5814[field5836];
                var32.field5235 = field5814[field5836 + 1];
                class170.method1068(-72, var32);
                if (var32.field5170 == 0) {
                    class53.method393(false, var32, (byte) -81);
                }
                return;
            }
            if (arg0 == 1121) {
                field5836 -= 2;
                var32.field5187 = (short) field5814[field5836];
                var32.field5284 = (short) field5814[field5836 + 1];
                class170.method1068(-96, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field5270 = field5814[--field5836] == 1;
                class170.method1068(-90, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field5240 = field5814[--field5836];
                class170.method1068(-74, var32);
                if (var32.field5184 == -1) {
                    class114.method663(8, var32.field5185);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field5814[--field5836];
                var32.field5265 = var36 == 1;
                class170.method1068(-51, var32);
                return;
            }
            if (arg0 == 1125) {
                field5836 -= 2;
                var32.field5243 = field5814[field5836];
                var32.field5197 = field5814[field5836 + 1];
                class170.method1068(-105, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field5268 = field5814[--field5836];
                class170.method1068(-110, var32);
                return;
            }
            if (arg0 == 1127) {
                field5836 -= 2;
                int var37 = field5814[field5836];
                int var38 = field5814[field5836 + 1];
                class483 var39 = class228.field3209.method1536((byte) -122, var37);
                if (var39.field7000 != var38) {
                    var32.method2155(var38, 23149, var37);
                    return;
                }
                var32.method2156(20667, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field5814[--field5836];
                String var41 = field5824[--field5817];
                class483 var42 = class228.field3209.method1536((byte) -123, var40);
                if (!var42.field6997.equals(var41)) {
                    var32.method2157(var40, 16, var41);
                    return;
                }
                var32.method2156(20667, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class356 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class4.method25(field5814[--field5836], false);
            } else {
                var43 = arg1 ? field5829 : field5826;
            }
            class170.method1068(-123, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5836 -= 2;
                int var44 = field5814[field5836];
                int var45 = field5814[field5836 + 1];
                if (var43.field5184 == -1) {
                    class286.method1731(var43.field5185, true);
                    class114.method663(8, var43.field5185);
                    class222.method1376(var43.field5185, (byte) 50);
                }
                if (var44 == -1) {
                    var43.field5141 = 1;
                    var43.field5191 = -1;
                    var43.field5174 = -1;
                    return;
                }
                var43.field5174 = var44;
                var43.field5222 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field5286 = true;
                } else {
                    var43.field5286 = false;
                }
                class361 var46 = class405.field5947.method1162(var44, 0);
                var43.field5139 = var46.field5413;
                var43.field5225 = var46.field5376;
                var43.field5146 = var46.field5400;
                var43.field5285 = var46.field5417;
                var43.field5273 = var46.field5364;
                var43.field5240 = var46.field5370;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field5173 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field5173 = 1;
                } else {
                    var43.field5173 = 2;
                }
                if (var43.field5211 > 0) {
                    var43.field5240 = var43.field5240 * 32 / var43.field5211;
                    return;
                }
                if (var43.field5162 > 0) {
                    var43.field5240 = var43.field5240 * 32 / var43.field5162;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5141 = 2;
                var43.field5191 = field5814[--field5836];
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5141 = 3;
                var43.field5191 = -1;
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5141 = 6;
                var43.field5191 = field5814[--field5836];
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5141 = 5;
                var43.field5191 = field5814[--field5836];
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1206) {
                field5836 -= 4;
                var43.field5231 = field5814[field5836];
                var43.field5289 = field5814[field5836 + 1];
                var43.field5269 = field5814[field5836 + 2];
                var43.field5244 = field5814[field5836 + 3];
                class170.method1068(-85, var43);
                return;
            }
            if (arg0 == 1207) {
                field5836 -= 2;
                var43.field5207 = field5814[field5836];
                var43.field5233 = field5814[field5836 + 1];
                class170.method1068(-61, var43);
                return;
            }
            if (arg0 == 1210) {
                field5836 -= 4;
                var43.field5191 = field5814[field5836];
                var43.field5218 = field5814[field5836 + 1];
                if (field5814[field5836 + 2] == 1) {
                    var43.field5141 = 9;
                } else {
                    var43.field5141 = 8;
                }
                if (field5814[field5836 + 3] == 1) {
                    var43.field5286 = true;
                } else {
                    var43.field5286 = false;
                }
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5141 = 5;
                var43.field5191 = class156.field2047;
                var43.field5218 = 0;
                if (var43.field5184 == -1) {
                    class18.method125(var43.field5185, -22330);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class356 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class4.method25(field5814[--field5836], false);
                } else {
                    var58 = arg1 ? field5829 : field5826;
                }
                String var59 = field5824[--field5817];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field5814[--field5836];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field5814[--field5836];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field5824[--field5817];
                    } else {
                        var62[var63] = Integer.valueOf(field5814[--field5836]);
                    }
                }
                int var64 = field5814[--field5836];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field5167 = var62;
                } else if (arg0 == 1401) {
                    var58.field5220 = var62;
                } else if (arg0 == 1402) {
                    var58.field5228 = var62;
                } else if (arg0 == 1403) {
                    var58.field5292 = var62;
                } else if (arg0 == 1404) {
                    var58.field5203 = var62;
                } else if (arg0 == 1405) {
                    var58.field5242 = var62;
                } else if (arg0 == 1406) {
                    var58.field5175 = var62;
                } else if (arg0 == 1407) {
                    var58.field5227 = var62;
                    var58.field5149 = var60;
                } else if (arg0 == 1408) {
                    var58.field5186 = var62;
                } else if (arg0 == 1409) {
                    var58.field5288 = var62;
                } else if (arg0 == 1410) {
                    var58.field5297 = var62;
                } else if (arg0 == 1411) {
                    var58.field5142 = var62;
                } else if (arg0 == 1412) {
                    var58.field5133 = var62;
                } else if (arg0 == 1414) {
                    var58.field5131 = var62;
                    var58.field5181 = var60;
                } else if (arg0 == 1415) {
                    var58.field5199 = var62;
                    var58.field5274 = var60;
                } else if (arg0 == 1416) {
                    var58.field5176 = var62;
                } else if (arg0 == 1417) {
                    var58.field5189 = var62;
                } else if (arg0 == 1418) {
                    var58.field5249 = var62;
                } else if (arg0 == 1419) {
                    var58.field5237 = var62;
                } else if (arg0 == 1420) {
                    var58.field5210 = var62;
                } else if (arg0 == 1421) {
                    var58.field5138 = var62;
                } else if (arg0 == 1422) {
                    var58.field5140 = var62;
                } else if (arg0 == 1423) {
                    var58.field5143 = var62;
                } else if (arg0 == 1424) {
                    var58.field5239 = var62;
                } else if (arg0 == 1425) {
                    var58.field5254 = var62;
                } else if (arg0 == 1426) {
                    var58.field5261 = var62;
                } else if (arg0 == 1427) {
                    var58.field5283 = var62;
                } else if (arg0 == 1428) {
                    var58.field5136 = var62;
                    var58.field5266 = var60;
                } else if (arg0 == 1429) {
                    var58.field5223 = var62;
                    var58.field5236 = var60;
                } else if (arg0 == 1430) {
                    var58.field5152 = var62;
                }
                var58.field5135 = true;
                return;
            }
            if (arg0 < 1600) {
                class356 var65 = arg1 ? field5829 : field5826;
                if (arg0 == 1500) {
                    field5814[field5836++] = var65.field5209;
                    return;
                }
                if (arg0 == 1501) {
                    field5814[field5836++] = var65.field5179;
                    return;
                }
                if (arg0 == 1502) {
                    field5814[field5836++] = var65.field5168;
                    return;
                }
                if (arg0 == 1503) {
                    field5814[field5836++] = var65.field5169;
                    return;
                }
                if (arg0 == 1504) {
                    field5814[field5836++] = var65.field5159 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field5814[field5836++] = var65.field5160;
                    return;
                }
                if (arg0 == 1506) {
                    class356 var66 = class480.method2801(896298960, var65);
                    field5814[field5836++] = var66 == null ? -1 : var66.field5185;
                    return;
                }
            } else if (arg0 < 1700) {
                class356 var67 = arg1 ? field5829 : field5826;
                if (arg0 == 1600) {
                    field5814[field5836++] = var67.field5219;
                    return;
                }
                if (arg0 == 1601) {
                    field5814[field5836++] = var67.field5144;
                    return;
                }
                if (arg0 == 1602) {
                    field5824[field5817++] = var67.field5246;
                    return;
                }
                if (arg0 == 1603) {
                    field5814[field5836++] = var67.field5147;
                    return;
                }
                if (arg0 == 1604) {
                    field5814[field5836++] = var67.field5235;
                    return;
                }
                if (arg0 == 1605) {
                    field5814[field5836++] = var67.field5240;
                    return;
                }
                if (arg0 == 1606) {
                    field5814[field5836++] = var67.field5139;
                    return;
                }
                if (arg0 == 1607) {
                    field5814[field5836++] = var67.field5146;
                    return;
                }
                if (arg0 == 1608) {
                    field5814[field5836++] = var67.field5225;
                    return;
                }
                if (arg0 == 1609) {
                    field5814[field5836++] = var67.field5196;
                    return;
                }
                if (arg0 == 1610) {
                    field5814[field5836++] = var67.field5285;
                    return;
                }
                if (arg0 == 1611) {
                    field5814[field5836++] = var67.field5273;
                    return;
                }
                if (arg0 == 1612) {
                    field5814[field5836++] = var67.field5205;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field5814[--field5836];
                    class483 var69 = class228.field3209.method1536((byte) -119, var68);
                    if (var69.method2817(-1381)) {
                        field5824[field5817++] = var67.method2163(-1, var68, var69.field6997);
                    } else {
                        field5814[field5836++] = var67.method2165(var68, true, var69.field7000);
                    }
                }
            } else if (arg0 < 1800) {
                class356 var70 = arg1 ? field5829 : field5826;
                if (arg0 == 1700) {
                    field5814[field5836++] = var70.field5174;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field5174 != -1) {
                        field5814[field5836++] = var70.field5222;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field5814[field5836++] = var70.field5184;
                    return;
                }
            } else if (arg0 < 1900) {
                class356 var71 = arg1 ? field5829 : field5826;
                if (arg0 == 1800) {
                    field5814[field5836++] = client.method1188(var71).method2933(2015625216);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field5814[--field5836];
                    int var334 = var72 - 1;
                    if (var71.field5177 != null && var334 < var71.field5177.length && var71.field5177[var334] != null) {
                        field5824[field5817++] = var71.field5177[var334];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field5183 == null) {
                        field5824[field5817++] = "";
                        return;
                    }
                    field5824[field5817++] = var71.field5183;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class356 var332;
                if (arg0 >= 2000) {
                    var332 = class4.method25(field5814[--field5836], false);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field5829 : field5826;
                }
                if (field5842 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field5283 == null) {
                        return;
                    }
                    class99 var333 = new class99();
                    var333.field1343 = var332;
                    var333.field1346 = var332.field5283;
                    var333.field1349 = field5842 + 1;
                    class300.field4355.method2086((byte) -119, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class356 var73 = class4.method25(field5814[--field5836], false);
                if (arg0 == 2500) {
                    field5814[field5836++] = var73.field5209;
                    return;
                }
                if (arg0 == 2501) {
                    field5814[field5836++] = var73.field5179;
                    return;
                }
                if (arg0 == 2502) {
                    field5814[field5836++] = var73.field5168;
                    return;
                }
                if (arg0 == 2503) {
                    field5814[field5836++] = var73.field5169;
                    return;
                }
                if (arg0 == 2504) {
                    field5814[field5836++] = var73.field5159 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field5814[field5836++] = var73.field5160;
                    return;
                }
                if (arg0 == 1506) {
                    class356 var74 = class480.method2801(896298960, var73);
                    field5814[field5836++] = var74 == null ? -1 : var74.field5185;
                    return;
                }
            } else if (arg0 < 2700) {
                class356 var75 = class4.method25(field5814[--field5836], false);
                if (arg0 == 2600) {
                    field5814[field5836++] = var75.field5219;
                    return;
                }
                if (arg0 == 2601) {
                    field5814[field5836++] = var75.field5144;
                    return;
                }
                if (arg0 == 2602) {
                    field5824[field5817++] = var75.field5246;
                    return;
                }
                if (arg0 == 2603) {
                    field5814[field5836++] = var75.field5147;
                    return;
                }
                if (arg0 == 2604) {
                    field5814[field5836++] = var75.field5235;
                    return;
                }
                if (arg0 == 2605) {
                    field5814[field5836++] = var75.field5240;
                    return;
                }
                if (arg0 == 2606) {
                    field5814[field5836++] = var75.field5139;
                    return;
                }
                if (arg0 == 2607) {
                    field5814[field5836++] = var75.field5146;
                    return;
                }
                if (arg0 == 2608) {
                    field5814[field5836++] = var75.field5225;
                    return;
                }
                if (arg0 == 2609) {
                    field5814[field5836++] = var75.field5196;
                    return;
                }
                if (arg0 == 2610) {
                    field5814[field5836++] = var75.field5285;
                    return;
                }
                if (arg0 == 2611) {
                    field5814[field5836++] = var75.field5273;
                    return;
                }
                if (arg0 == 2612) {
                    field5814[field5836++] = var75.field5205;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class356 var76 = class4.method25(field5814[--field5836], false);
                    field5814[field5836++] = var76.field5174;
                    return;
                }
                if (arg0 == 2701) {
                    class356 var77 = class4.method25(field5814[--field5836], false);
                    if (var77.field5174 == -1) {
                        field5814[field5836++] = 0;
                        return;
                    } else {
                        field5814[field5836++] = var77.field5222;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field5814[--field5836];
                    class311 var79 = (class311) class213.field3010.method2310((byte) 79, (long) var78);
                    if (var79 != null) {
                        field5814[field5836++] = 1;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class356 var80 = class4.method25(field5814[--field5836], false);
                    if (var80.field5151 == null) {
                        field5814[field5836++] = 0;
                        return;
                    }
                    int var81 = var80.field5151.length;
                    for (int var82 = 0; var82 < var80.field5151.length; var82++) {
                        if (var80.field5151[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field5814[field5836++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field5836 -= 2;
                    int var83 = field5814[field5836];
                    int var84 = field5814[field5836 + 1];
                    class311 var85 = (class311) class213.field3010.method2310((byte) 61, (long) var83);
                    if (var85 != null && var85.field4525 == var84) {
                        field5814[field5836++] = 1;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class356 var86 = class4.method25(field5814[--field5836], false);
                if (arg0 == 2800) {
                    field5814[field5836++] = client.method1188(var86).method2933(2015625216);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field5814[--field5836];
                    int var335 = var87 - 1;
                    if (var86.field5177 != null && var335 < var86.field5177.length && var86.field5177[var335] != null) {
                        field5824[field5817++] = var86.field5177[var335];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field5183 == null) {
                        field5824[field5817++] = "";
                        return;
                    }
                    field5824[field5817++] = var86.field5183;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field5824[--field5817];
                    class98.method597(29315, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field5836 -= 2;
                    class445.method2600(field5814[field5836 + 1], 26, field5814[field5836], class415.field6145);
                    return;
                }
                if (arg0 == 3103) {
                    class435.method2568(true, 124);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field5824[--field5817];
                    int var90 = 0;
                    if (class216.method1332((byte) 107, var89)) {
                        var90 = class103.method622(var89, 0);
                    }
                    field5825++;
                    class386.method2321(true, class1.field4);
                    class79.field1108.method969(19869, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field5824[--field5817];
                    field5822++;
                    class386.method2321(true, class126.field1619);
                    class79.field1108.method947(-31, var91.length() + 1);
                    class79.field1108.method956(true, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field5824[--field5817];
                    field5831++;
                    class386.method2321(true, class370.field5546);
                    class79.field1108.method947(-46, var92.length() + 1);
                    class79.field1108.method956(true, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field5814[--field5836];
                    String var94 = field5824[--field5817];
                    class31.method255(var94, var93, -100);
                    return;
                }
                if (arg0 == 3108) {
                    field5836 -= 3;
                    int var95 = field5814[field5836];
                    int var96 = field5814[field5836 + 1];
                    int var97 = field5814[field5836 + 2];
                    class356 var98 = class4.method25(var97, false);
                    class508.method3058(var96, var98, var95, -78);
                    return;
                }
                if (arg0 == 3109) {
                    field5836 -= 2;
                    int var99 = field5814[field5836];
                    int var100 = field5814[field5836 + 1];
                    class356 var101 = arg1 ? field5829 : field5826;
                    class508.method3058(var100, var101, var99, -128);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field5814[--field5836];
                    field5820++;
                    class386.method2321(true, class285.field4072);
                    class79.field1108.method961(var102, 1608339368);
                    return;
                }
                if (arg0 == 3111) {
                    field5836 -= 2;
                    int var103 = field5814[field5836];
                    int var104 = field5814[field5836 + 1];
                    class311 var105 = (class311) class213.field3010.method2310((byte) -78, (long) var103);
                    if (var105 != null) {
                        class32.method264(var105.field4525 != var104, -16318928, true, var105);
                    }
                    class75.method496(true, var104, (byte) 104, 3, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field5836--;
                    int var106 = field5814[field5836];
                    class311 var107 = (class311) class213.field3010.method2310((byte) 113, (long) var106);
                    if (var107 != null && var107.field4526 == 3) {
                        class32.method264(true, -16318928, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class209.method1291(24, field5824[--field5817]);
                    return;
                }
                if (arg0 == 3114) {
                    field5836 -= 2;
                    int var108 = field5814[field5836];
                    int var109 = field5814[field5836 + 1];
                    String var110 = field5824[--field5817];
                    class447.method2609(var110, var109, "", 103, var108, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field5836 -= 3;
                    class508.method3061(255, field5814[field5836 + 1], -105, field5814[field5836 + 2], field5814[field5836]);
                    return;
                }
                if (arg0 == 3201) {
                    class198.method1234(255, 50, 0, field5814[--field5836]);
                    return;
                }
                if (arg0 == 3202) {
                    field5836 -= 2;
                    class191.method1201(field5814[field5836], 255, 29899, field5814[field5836 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field5836 -= 4;
                    class508.method3061(field5814[field5836 + 3], field5814[field5836 + 1], -84, field5814[field5836 + 2], field5814[field5836]);
                    return;
                }
                if (arg0 == 3204) {
                    field5836 -= 3;
                    class198.method1234(field5814[field5836 + 1], field5814[field5836 + 2], 0, field5814[field5836]);
                    return;
                }
                if (arg0 == 3205) {
                    field5836 -= 3;
                    class191.method1201(field5814[field5836], field5814[field5836 + 2], 29899, field5814[field5836 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field5836 -= 4;
                    class66.method464(field5814[field5836 + 2], field5814[field5836 + 3], field5814[field5836], field5814[field5836 + 1], (byte) 2);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field5814[field5836++] = class263.field3748;
                    return;
                }
                if (arg0 == 3301) {
                    field5836 -= 2;
                    int var111 = field5814[field5836];
                    int var112 = field5814[field5836 + 1];
                    field5814[field5836++] = class455.method2655(var112, 18474, false, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field5836 -= 2;
                    int var113 = field5814[field5836];
                    int var114 = field5814[field5836 + 1];
                    field5814[field5836++] = class191.method1202(var113, var114, (byte) 126, false);
                    return;
                }
                if (arg0 == 3303) {
                    field5836 -= 2;
                    int var115 = field5814[field5836];
                    int var116 = field5814[field5836 + 1];
                    field5814[field5836++] = class478.method2796(var116, var115, false, (byte) -98);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field5814[--field5836];
                    field5814[field5836++] = class456.field6646.method2546(5, var117).field1164;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field5814[--field5836];
                    field5814[field5836++] = class187.field2648[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field5814[--field5836];
                    field5814[field5836++] = class230.field3218[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field5814[--field5836];
                    field5814[field5836++] = class218.field3051[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class415.field6145.field2956;
                    int var122 = (class415.field6145.field2959 >> 7) + class455.field6637;
                    int var123 = (class415.field6145.field2966 >> 7) + class223.field3158;
                    field5814[field5836++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field5814[--field5836];
                    field5814[field5836++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field5814[--field5836];
                    field5814[field5836++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field5814[--field5836];
                    field5814[field5836++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field5814[field5836++] = class470.field6790 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field5836 -= 2;
                    int var127 = field5814[field5836];
                    int var128 = field5814[field5836 + 1];
                    field5814[field5836++] = class455.method2655(var128, 18474, true, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field5836 -= 2;
                    int var129 = field5814[field5836];
                    int var130 = field5814[field5836 + 1];
                    field5814[field5836++] = class191.method1202(var129, var130, (byte) 120, true);
                    return;
                }
                if (arg0 == 3315) {
                    field5836 -= 2;
                    int var131 = field5814[field5836];
                    int var132 = field5814[field5836 + 1];
                    field5814[field5836++] = class478.method2796(var132, var131, true, (byte) -98);
                    return;
                }
                if (arg0 == 3316) {
                    if (class118.field1535 >= 2) {
                        field5814[field5836++] = class118.field1535;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field5814[field5836++] = class291.field4160;
                    return;
                }
                if (arg0 == 3318) {
                    field5814[field5836++] = class128.field1631;
                    return;
                }
                if (arg0 == 3321) {
                    field5814[field5836++] = class470.field6793;
                    return;
                }
                if (arg0 == 3322) {
                    field5814[field5836++] = class117.field1503;
                    return;
                }
                if (arg0 == 3323) {
                    if (class420.field6206 >= 5 && class420.field6206 <= 9) {
                        field5814[field5836++] = 1;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class420.field6206 >= 5 && class420.field6206 <= 9) {
                        field5814[field5836++] = class420.field6206;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field5814[field5836++] = class460.field6686 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field5814[field5836++] = class415.field6145.field4576;
                    return;
                }
                if (arg0 == 3327) {
                    field5814[field5836++] = class415.field6145.field4599.field2844 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field5814[field5836++] = class434.field6368 && !class110.field1445 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field5814[field5836++] = class360.field5350 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field5814[--field5836];
                    field5814[field5836++] = class57.method422((byte) 125, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field5836 -= 2;
                    int var134 = field5814[field5836];
                    int var135 = field5814[field5836 + 1];
                    field5814[field5836++] = class166.method1047(-7045, false, var135, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field5836 -= 2;
                    int var136 = field5814[field5836];
                    int var137 = field5814[field5836 + 1];
                    field5814[field5836++] = class166.method1047(-7045, true, var137, false, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field5814[field5836++] = class46.field693;
                    return;
                }
                if (arg0 == 3335) {
                    field5814[field5836++] = class81.field1122;
                    return;
                }
                if (arg0 == 3336) {
                    field5836 -= 4;
                    int var138 = field5814[field5836];
                    int var139 = field5814[field5836 + 1];
                    int var140 = field5814[field5836 + 2];
                    int var141 = field5814[field5836 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field5814[field5836++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field5814[field5836++] = class111.field1456;
                    return;
                }
                if (arg0 == 3338) {
                    field5814[field5836++] = class391.method2355(3);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field5836 -= 2;
                    int var145 = field5814[field5836];
                    int var146 = field5814[field5836 + 1];
                    class87 var147 = class413.field6132.method2969((byte) -74, var145);
                    field5824[field5817++] = var147.method550(var146, false);
                    return;
                }
                if (arg0 == 3408) {
                    field5836 -= 4;
                    int var148 = field5814[field5836];
                    int var149 = field5814[field5836 + 1];
                    int var150 = field5814[field5836 + 2];
                    int var151 = field5814[field5836 + 3];
                    class87 var152 = class413.field6132.method2969((byte) -74, var150);
                    if (var152.field1191 == var148 && var152.field1192 == var149) {
                        if (var149 == 115) {
                            field5824[field5817++] = var152.method550(var151, false);
                            return;
                        }
                        field5814[field5836++] = var152.method544((byte) 99, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field5836 -= 3;
                    int var153 = field5814[field5836];
                    int var154 = field5814[field5836 + 1];
                    int var155 = field5814[field5836 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class87 var156 = class413.field6132.method2969((byte) -74, var154);
                    if (var156.field1192 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field5814[field5836++] = var156.method548(var155, (byte) -128) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field5814[--field5836];
                    String var158 = field5824[--field5817];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class87 var159 = class413.field6132.method2969((byte) -74, var157);
                    if (var159.field1192 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field5814[field5836++] = var159.method546(var158, 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field5814[--field5836];
                    class87 var161 = class413.field6132.method2969((byte) -74, var160);
                    field5814[field5836++] = var161.field1197.method2314(false);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class192.field2722 == 0) {
                        field5814[field5836++] = -2;
                        return;
                    }
                    if (class192.field2722 == 1) {
                        field5814[field5836++] = -1;
                        return;
                    }
                    field5814[field5836++] = class296.field4317;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field5814[--field5836];
                    if (class192.field2722 == 2 && var162 < class296.field4317) {
                        field5824[field5817++] = class281.field4019[var162];
                        if (class145.field1885[var162] != null) {
                            field5824[field5817++] = class145.field1885[var162];
                            return;
                        }
                        field5824[field5817++] = "";
                        return;
                    }
                    field5824[field5817++] = "";
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field5814[--field5836];
                    if (class192.field2722 == 2 && var163 < class296.field4317) {
                        field5814[field5836++] = class285.field4076[var163];
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field5814[--field5836];
                    if (class192.field2722 == 2 && var164 < class296.field4317) {
                        field5814[field5836++] = class68.field1009[var164];
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field5824[--field5817];
                    int var166 = field5814[--field5836];
                    class258.method1604(var166, var165, 29094);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field5824[--field5817];
                    class258.method1600(var167, -201);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field5824[--field5817];
                    class242.method1488((byte) -119, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field5824[--field5817];
                    class258.method1598(var169, 1768, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field5824[--field5817];
                    class460.method2674(29637, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field5824[--field5817];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field5814[field5836++] = class35.method290(var171, 4877) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field5814[--field5836];
                    if (class192.field2722 == 2 && var172 < class296.field4317) {
                        field5824[field5817++] = class322.field4706[var172];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class205.field2842 != null) {
                        field5824[field5817++] = class338.method2049(class205.field2842, -111);
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class205.field2842 != null) {
                        field5814[field5836++] = class437.field6402;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field5814[--field5836];
                    if (class205.field2842 != null && var173 < class437.field6402) {
                        field5824[field5817++] = class216.field3033[var173].field1796;
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field5814[--field5836];
                    if (class205.field2842 != null && var174 < class437.field6402) {
                        field5814[field5836++] = class216.field3033[var174].field1790;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field5814[--field5836];
                    if (class205.field2842 != null && var175 < class437.field6402) {
                        field5814[field5836++] = class216.field3033[var175].field1791;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field5814[field5836++] = class41.field631;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field5824[--field5817];
                    class407.method2437(var176, true);
                    return;
                }
                if (arg0 == 3618) {
                    field5814[field5836++] = class48.field741;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field5824[--field5817];
                    class505.method3039(4, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class238.method1439(true);
                    return;
                }
                if (arg0 == 3621) {
                    if (class192.field2722 == 0) {
                        field5814[field5836++] = -1;
                        return;
                    }
                    field5814[field5836++] = class136.field1754;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field5814[--field5836];
                    if (class192.field2722 != 0 && var178 < class136.field1754) {
                        field5824[field5817++] = class137.field1787[var178];
                        if (class149.field1932[var178] != null) {
                            field5824[field5817++] = class149.field1932[var178];
                            return;
                        }
                        field5824[field5817++] = "";
                        return;
                    }
                    field5824[field5817++] = "";
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field5824[--field5817];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field5814[field5836++] = class17.method124(true, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field5814[--field5836];
                    if (class216.field3033 != null && var180 < class437.field6402 && class216.field3033[var180].field1793.equalsIgnoreCase(class415.field6145.field4592)) {
                        field5814[field5836++] = 1;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class311.field4528 != null) {
                        field5824[field5817++] = class311.field4528;
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field5814[--field5836];
                    if (class205.field2842 != null && var181 < class437.field6402) {
                        field5824[field5817++] = class216.field3033[var181].field1795;
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field5814[--field5836];
                    if (class192.field2722 == 2 && var182 >= 0 && var182 < class296.field4317) {
                        field5814[field5836++] = class97.field1307[var182] ? 1 : 0;
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field5824[--field5817];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field5814[field5836++] = class151.method926(var183, 7622);
                    return;
                }
                if (arg0 == 3629) {
                    field5814[field5836++] = class359.field5332;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field5824[--field5817];
                    class258.method1598(var184, 1768, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field5814[--field5836];
                    field5814[field5836++] = class246.field3538[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field5814[--field5836];
                    if (class205.field2842 != null && var186 < class437.field6402) {
                        field5824[field5817++] = class216.field3033[var186].field1793;
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field5814[--field5836];
                    if (class192.field2722 != 0 && var187 < class136.field1754) {
                        field5824[field5817++] = class235.field3307[var187];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var188].method637(1246);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var189].field1422;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var190].field1418;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var191].field1420;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var192].field1426;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field5814[--field5836];
                    field5814[field5836++] = class419.field6200[var193].field1419;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field5814[--field5836];
                    int var195 = class419.field6200[var194].method632(7);
                    field5814[field5836++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field5814[--field5836];
                    int var197 = class419.field6200[var196].method632(7);
                    field5814[field5836++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field5814[--field5836];
                    int var199 = class419.field6200[var198].method632(7);
                    field5814[field5836++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field5814[--field5836];
                    int var201 = class419.field6200[var200].method632(7);
                    field5814[field5836++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field5836 -= 2;
                    int var202 = field5814[field5836];
                    int var203 = field5814[field5836 + 1];
                    field5814[field5836++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field5836 -= 2;
                    int var204 = field5814[field5836];
                    int var205 = field5814[field5836 + 1];
                    field5814[field5836++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field5836 -= 2;
                    int var206 = field5814[field5836];
                    int var207 = field5814[field5836 + 1];
                    field5814[field5836++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field5836 -= 2;
                    int var208 = field5814[field5836];
                    int var209 = field5814[field5836 + 1];
                    field5814[field5836++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field5814[--field5836];
                    field5814[field5836++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field5814[--field5836];
                    field5814[field5836++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field5836 -= 5;
                    int var212 = field5814[field5836];
                    int var213 = field5814[field5836 + 1];
                    int var214 = field5814[field5836 + 2];
                    int var215 = field5814[field5836 + 3];
                    int var216 = field5814[field5836 + 4];
                    field5814[field5836++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field5836 -= 2;
                    long var217 = (long) field5814[field5836];
                    long var219 = (long) field5814[field5836 + 1];
                    field5814[field5836++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field5836 -= 2;
                    int var221 = field5814[field5836];
                    int var222 = field5814[field5836 + 1];
                    field5814[field5836++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field5836 -= 2;
                    int var223 = field5814[field5836];
                    int var224 = field5814[field5836 + 1];
                    field5814[field5836++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field5836 -= 2;
                    int var225 = field5814[field5836];
                    int var226 = field5814[field5836 + 1];
                    field5814[field5836++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field5836 -= 2;
                    int var227 = field5814[field5836];
                    int var228 = field5814[field5836 + 1];
                    field5814[field5836++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field5836 -= 2;
                    int var229 = field5814[field5836];
                    int var230 = field5814[field5836 + 1];
                    if (var229 == 0) {
                        field5814[field5836++] = 0;
                        return;
                    }
                    field5814[field5836++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field5836 -= 2;
                    int var231 = field5814[field5836];
                    int var232 = field5814[field5836 + 1];
                    if (var231 == 0) {
                        field5814[field5836++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field5814[field5836++] = Integer.MAX_VALUE;
                        return;
                    }
                    field5814[field5836++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field5836 -= 2;
                    int var233 = field5814[field5836];
                    int var234 = field5814[field5836 + 1];
                    field5814[field5836++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field5836 -= 2;
                    int var235 = field5814[field5836];
                    int var236 = field5814[field5836 + 1];
                    field5814[field5836++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field5836 -= 2;
                    int var237 = field5814[field5836];
                    int var238 = field5814[field5836 + 1];
                    field5814[field5836++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field5836 -= 2;
                    int var239 = field5814[field5836];
                    int var240 = field5814[field5836 + 1];
                    field5814[field5836++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field5836 -= 3;
                    long var241 = (long) field5814[field5836];
                    long var243 = (long) field5814[field5836 + 1];
                    long var245 = (long) field5814[field5836 + 2];
                    field5814[field5836++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field5824[--field5817];
                    int var248 = field5814[--field5836];
                    field5824[field5817++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field5817 -= 2;
                    String var249 = field5824[field5817];
                    String var250 = field5824[field5817 + 1];
                    field5824[field5817++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field5824[--field5817];
                    int var252 = field5814[--field5836];
                    field5824[field5817++] = var251 + class28.method234(var252, 122, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field5824[--field5817];
                    field5824[field5817++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5824[field5817++] = method2360(field5814[--field5836]);
                    return;
                }
                if (arg0 == 4105) {
                    field5817 -= 2;
                    String var254 = field5824[field5817];
                    String var255 = field5824[field5817 + 1];
                    if (class415.field6145.field4599 != null && class415.field6145.field4599.field2844) {
                        field5824[field5817++] = var255;
                        return;
                    }
                    field5824[field5817++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field5814[--field5836];
                    field5824[field5817++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field5817 -= 2;
                    field5814[field5836++] = class483.method2813(-94, field5824[field5817], field5824[field5817 + 1], class81.field1122);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field5824[--field5817];
                    field5836 -= 2;
                    int var258 = field5814[field5836];
                    int var259 = field5814[field5836 + 1];
                    class507 var260 = class442.method2588((byte) -119, 0, var259, class1.field1);
                    field5814[field5836++] = var260.method3052((byte) -128, var257, class106.field1421, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field5824[--field5817];
                    field5836 -= 2;
                    int var262 = field5814[field5836];
                    int var263 = field5814[field5836 + 1];
                    class507 var264 = class442.method2588((byte) -125, 0, var263, class1.field1);
                    field5814[field5836++] = var264.method3050(var262, var261, class106.field1421, false);
                    return;
                }
                if (arg0 == 4110) {
                    field5817 -= 2;
                    String var265 = field5824[field5817];
                    String var266 = field5824[field5817 + 1];
                    if (field5814[--field5836] == 1) {
                        field5824[field5817++] = var265;
                        return;
                    }
                    field5824[field5817++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field5824[--field5817];
                    field5824[field5817++] = class210.method1301((byte) -44, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field5824[--field5817];
                    int var269 = field5814[--field5836];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5824[field5817++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field5814[--field5836];
                    field5814[field5836++] = class223.method1378((char) var270, (byte) -1) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field5814[--field5836];
                    field5814[field5836++] = class456.method2659(123, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field5814[--field5836];
                    field5814[field5836++] = class292.method1763(14947, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field5814[--field5836];
                    field5814[field5836++] = class156.method984((byte) 79, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field5824[--field5817];
                    if (var274 != null) {
                        field5814[field5836++] = var274.length();
                        return;
                    }
                    field5814[field5836++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field5824[--field5817];
                    field5836 -= 2;
                    int var276 = field5814[field5836];
                    int var277 = field5814[field5836 + 1];
                    field5824[field5817++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field5824[--field5817];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field5824[field5817++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field5824[--field5817];
                    field5836 -= 2;
                    int var284 = field5814[field5836];
                    int var285 = field5814[field5836 + 1];
                    field5814[field5836++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field5817 -= 2;
                    String var286 = field5824[field5817];
                    String var287 = field5824[field5817 + 1];
                    int var288 = field5814[--field5836];
                    field5814[field5836++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field5814[--field5836];
                    field5814[field5836++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field5814[--field5836];
                    field5814[field5836++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field5814[--field5836] != 0;
                    int var292 = field5814[--field5836];
                    field5824[field5817++] = class452.method2631(class81.field1122, 0, (long) var292, (byte) -66, var291);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field5824[--field5817];
                    int var294 = field5814[--field5836];
                    class507 var295 = class442.method2588((byte) 95, 0, var294, class1.field1);
                    field5814[field5836++] = var295.method3047(var293, -11538, class106.field1421);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field5814[--field5836];
                    field5824[field5817++] = class405.field5947.method1162(var296, 0).field5353;
                    return;
                }
                if (arg0 == 4201) {
                    field5836 -= 2;
                    int var297 = field5814[field5836];
                    int var298 = field5814[field5836 + 1];
                    class361 var299 = class405.field5947.method1162(var297, 0);
                    if (var298 >= 1 && var298 <= 5 && var299.field5355[var298 - 1] != null) {
                        field5824[field5817++] = var299.field5355[var298 - 1];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field5836 -= 2;
                    int var300 = field5814[field5836];
                    int var301 = field5814[field5836 + 1];
                    class361 var302 = class405.field5947.method1162(var300, 0);
                    if (var301 >= 1 && var301 <= 5 && var302.field5381[var301 - 1] != null) {
                        field5824[field5817++] = var302.field5381[var301 - 1];
                        return;
                    }
                    field5824[field5817++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field5814[--field5836];
                    field5814[field5836++] = class405.field5947.method1162(var303, 0).field5352;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field5814[--field5836];
                    field5814[field5836++] = class405.field5947.method1162(var304, 0).field5401 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field5814[--field5836];
                    class361 var306 = class405.field5947.method1162(var305, 0);
                    if (var306.field5431 == -1 && var306.field5358 >= 0) {
                        field5814[field5836++] = var306.field5358;
                        return;
                    }
                    field5814[field5836++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field5814[--field5836];
                    class361 var308 = class405.field5947.method1162(var307, 0);
                    if (var308.field5431 >= 0 && var308.field5358 >= 0) {
                        field5814[field5836++] = var308.field5358;
                        return;
                    }
                    field5814[field5836++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field5814[--field5836];
                    field5814[field5836++] = class405.field5947.method1162(var309, 0).field5382 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field5836 -= 2;
                    int var310 = field5814[field5836];
                    int var311 = field5814[field5836 + 1];
                    class483 var312 = class228.field3209.method1536((byte) -120, var311);
                    if (var312.method2817(-1381)) {
                        field5824[field5817++] = class405.field5947.method1162(var310, 0).method2206(666, var311, var312.field6997);
                        return;
                    }
                    field5814[field5836++] = class405.field5947.method1162(var310, 0).method2195((byte) 88, var311, var312.field7000);
                    return;
                }
                if (arg0 == 4209) {
                    field5836 -= 2;
                    int var313 = field5814[field5836];
                    int var314 = field5814[field5836 + 1] - 1;
                    class361 var315 = class405.field5947.method1162(var313, 0);
                    if (var315.field5422 == var314) {
                        field5814[field5836++] = var315.field5380;
                        return;
                    }
                    if (var315.field5421 == var314) {
                        field5814[field5836++] = var315.field5433;
                        return;
                    }
                    field5814[field5836++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field5824[--field5817];
                    int var317 = field5814[--field5836];
                    class207.method1278(var316, var317 == 1, false);
                    field5814[field5836++] = class459.field6681;
                    return;
                }
                if (arg0 == 4211) {
                    if (class142.field1854 != null && class116.field1491 < class459.field6681) {
                        field5814[field5836++] = class142.field1854[class116.field1491++] & 0xFFFF;
                        return;
                    }
                    field5814[field5836++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class116.field1491 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field5836 -= 2;
                    int var318 = field5814[field5836];
                    int var319 = field5814[field5836 + 1];
                    class483 var320 = class228.field3209.method1536((byte) -123, var319);
                    if (var320.method2817(-1381)) {
                        field5824[field5817++] = class508.field7744.method565(27114, var318).method1664(var320.field6997, (byte) 21, var319);
                        return;
                    }
                    field5814[field5836++] = class508.field7744.method565(27114, var318).method1658(-119, var320.field7000, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field5836 -= 2;
                    int var321 = field5814[field5836];
                    int var322 = field5814[field5836 + 1];
                    class483 var323 = class228.field3209.method1536((byte) -119, var322);
                    if (var323.method2817(-1381)) {
                        field5824[field5817++] = class114.field1471.method2132((byte) 125, var321).method2846(-56, var323.field6997, var322);
                        return;
                    }
                    field5814[field5836++] = class114.field1471.method2132((byte) 120, var321).method2833(20410, var323.field7000, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field5836 -= 2;
                    int var324 = field5814[field5836];
                    int var325 = field5814[field5836 + 1];
                    class483 var326 = class228.field3209.method1536((byte) -121, var325);
                    if (var326.method2817(-1381)) {
                        field5824[field5817++] = class66.field989.method1383(-10795, var324).method2633(81, var326.field6997, var325);
                        return;
                    }
                    field5814[field5836++] = class66.field989.method1383(-10795, var324).method2634(var326.field7000, var325, -10776);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field5814[--field5836];
                class171 var328 = class89.field1220.method473(var327, (byte) -89);
                if (var328.field2298 != null && var328.field2298.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field2330[0];
                    for (int var331 = 1; var331 < var328.field2298.length; var331++) {
                        if (var328.field2330[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field2330[var331];
                        }
                    }
                    field5814[field5836++] = var328.field2298[var329];
                    return;
                }
                field5814[field5836++] = var328.field2305;
                return;
            }
        } else {
            class356 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class4.method25(field5814[--field5836], false);
            } else {
                var47 = arg1 ? field5829 : field5826;
            }
            if (arg0 == 1300) {
                int var48 = field5814[--field5836] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2166(114, var48, field5824[--field5817]);
                    return;
                }
                field5817--;
                return;
            }
            if (arg0 == 1301) {
                field5836 -= 2;
                int var49 = field5814[field5836];
                int var50 = field5814[field5836 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5166 = null;
                    return;
                }
                var47.field5166 = class236.method1433(var50, var49, (byte) 43);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field5814[--field5836];
                if (class431.field6330 != var51 && class78.field1104 != var51 && class53.field795 != var51) {
                    return;
                }
                var47.field5260 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5247 = field5814[--field5836];
                return;
            }
            if (arg0 == 1304) {
                var47.field5200 = field5814[--field5836];
                return;
            }
            if (arg0 == 1305) {
                var47.field5183 = field5824[--field5817];
                return;
            }
            if (arg0 == 1306) {
                var47.field5229 = field5824[--field5817];
                return;
            }
            if (arg0 == 1307) {
                var47.field5177 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field5263 = field5814[--field5836];
                var47.field5248 = field5814[--field5836];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field5814[--field5836];
                int var53 = field5814[--field5836];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2161(var53 - 1, -1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5164 = field5824[--field5817];
                return;
            }
            if (arg0 == 1311) {
                var47.field5264 = field5814[--field5836];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field5836 -= 3;
                    var54 = field5814[field5836] - 1;
                    var55 = field5814[field5836 + 1];
                    var56 = field5814[field5836 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5836 -= 2;
                    var54 = 10;
                    var55 = field5814[field5836];
                    var56 = field5814[field5836 + 1];
                }
                if (var47.field5188 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5188 = new byte[11];
                    var47.field5252 = new byte[11];
                    var47.field5172 = new int[11];
                }
                var47.field5188[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field5278 = false;
                    for (int var57 = 0; var57 < var47.field5188.length; var57++) {
                        if (var47.field5188[var57] != 0) {
                            var47.field5278 = true;
                            break;
                        }
                    }
                } else {
                    var47.field5278 = true;
                }
                var47.field5252[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5215 = field5814[--field5836];
                return;
            }
        }
        throw new IllegalStateException();
    }
}
