import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class142 {

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "[Lpe;")
    private static class566[] field2376 = new class566[50];

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "[[I")
    private static int[][] field2381 = new int[5][5000];

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "[I")
    private static int[] field2390 = new int[1000];

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
    private static int field2391 = 0;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "[I")
    private static int[] field2382 = new int[5];

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
    private static int field2386 = 0;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    private static int field2387 = 0;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field2392 = new String[1000];

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2383 = Calendar.getInstance();

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "[I")
    private static int[] field2396 = new int[3];

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field2398 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "Lvg;")
    public static class49 field2397 = new class49(4);

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    private static int field2399 = 0;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "Lpca;")
    private static class665 field2375;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Lpca;")
    private static class665 field2380;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "Lmp;")
    private static class706 field2385;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "[I")
    private static int[] field2371;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field2379;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)V")
    private static final void method1200(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2390[field2387++] = class174.field2878;
                return;
            }
            if (arg0 == 5001) {
                field2387 -= 3;
                class174.field2878 = field2390[field2387];
                class476.field7054 = class690.method3910((byte) -99, field2390[field2387 + 1]);
                if (class476.field7054 == null) {
                    class476.field7054 = class147.field2461;
                }
                class112.field1780 = field2390[field2387 + 2];
                field2384++;
                class165 var2 = class271.method1917(class420.field6424, (byte) -127, class121.field1935);
                var2.field2776.method65(class174.field2878, -77);
                var2.field2776.method65(class476.field7054.field1808, -77);
                var2.field2776.method65(class112.field1780, -77);
                class642.method3726(-684096285, var2);
                return;
            }
            if (arg0 == 5002) {
                field2386 -= 2;
                String var3 = field2392[field2386];
                String var4 = field2392[field2386 + 1];
                field2387 -= 2;
                int var5 = field2390[field2387];
                int var6 = field2390[field2387 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2377++;
                class165 var7 = class271.method1917(class420.field6424, (byte) -94, class627.field8858);
                var7.field2776.method65(class516.method3125(101, var3) + class516.method3125(111, var4) + 2, -77);
                var7.field2776.method28(var3, 0);
                var7.field2776.method65(var5 - 1, -77);
                var7.field2776.method65(var6, -77);
                var7.field2776.method28(var4, 0);
                class642.method3726(-684096285, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2390[--field2387];
                class360 var9 = class115.method1037(var8, 100);
                String var10 = "";
                if (var9 != null && var9.field5709 != null) {
                    var10 = var9.field5709;
                }
                field2392[field2386++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2390[--field2387];
                class360 var12 = class115.method1037(var11, 100);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5710;
                }
                field2390[field2387++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class476.field7054 == null) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = class476.field7054.field1808;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2390[--field2387];
                class165 var15 = class271.method1917(class420.field6424, (byte) -114, class369.field5784);
                var15.field2776.method65(var14, -77);
                class642.method3726(-684096285, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2392[--field2386];
                method1206(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2386 -= 2;
                String var17 = field2392[field2386];
                String var18 = field2392[field2386 + 1];
                if (class139.field2342 != 0 || (!class622.field8788 || class193.field3197) && !class519.field7509) {
                    field2389++;
                    class165 var19 = class271.method1917(class420.field6424, (byte) -126, class479.field7079);
                    var19.field2776.method65(0, -77);
                    int var20 = var19.field2776.field57;
                    var19.field2776.method28(var17, 0);
                    class252.method1791(var19.field2776, var18, 13);
                    var19.field2776.method24(var19.field2776.field57 - var20, (byte) 33);
                    class642.method3726(-684096285, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2390[--field2387];
                class360 var22 = class115.method1037(var21, 100);
                String var23 = "";
                if (var22 != null && var22.field5703 != null) {
                    var23 = var22.field5703;
                }
                field2392[field2386++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2390[--field2387];
                class360 var25 = class115.method1037(var24, 100);
                String var26 = "";
                if (var25 != null && var25.field5706 != null) {
                    var26 = var25.field5706;
                }
                field2392[field2386++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2390[--field2387];
                class360 var28 = class115.method1037(var27, 100);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5704;
                }
                field2390[field2387++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class567.field8141 == null || class567.field8141.field4759 == null) {
                    var30 = class63.field808;
                } else {
                    var30 = class567.field8141.method2111(true, 0);
                }
                field2392[field2386++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2390[field2387++] = class112.field1780;
                return;
            }
            if (arg0 == 5017) {
                field2390[field2387++] = class277.method1980((byte) 112);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2390[--field2387];
                class360 var32 = class115.method1037(var31, 100);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5711;
                }
                field2390[field2387++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2390[--field2387];
                class360 var35 = class115.method1037(var34, 100);
                String var36 = "";
                if (var35 != null && var35.field5702 != null) {
                    var36 = var35.field5702;
                }
                field2392[field2386++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class567.field8141 == null || class567.field8141.field4759 == null) {
                    var37 = class63.field808;
                } else {
                    var37 = class567.field8141.method2105(27069, false);
                }
                field2392[field2386++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2390[--field2387];
                class360 var39 = class115.method1037(var38, 100);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5707;
                }
                field2390[field2387++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2390[--field2387];
                class360 var42 = class115.method1037(var41, 100);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5708;
                }
                field2390[field2387++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2390[--field2387];
                class360 var45 = class115.method1037(var44, 100);
                String var46 = "";
                if (var45 != null && var45.field5705 != null) {
                    var46 = var45.field5705;
                }
                field2392[field2386++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2390[--field2387];
                field2392[field2386++] = class502.field7351.method2775(var47, -74).field905;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2390[--field2387];
                class72 var49 = class502.field7351.method2775(var48, -41);
                if (var49.field910 == null) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = var49.field910.length;
                return;
            }
            if (arg0 == 5052) {
                field2387 -= 2;
                int var50 = field2390[field2387];
                int var51 = field2390[field2387 + 1];
                class72 var52 = class502.field7351.method2775(var50, -99);
                int var53 = var52.field910[var51];
                field2390[field2387++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2390[--field2387];
                class72 var55 = class502.field7351.method2775(var54, -82);
                if (var55.field908 == null) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = var55.field908.length;
                return;
            }
            if (arg0 == 5054) {
                field2387 -= 2;
                int var56 = field2390[field2387];
                int var57 = field2390[field2387 + 1];
                field2390[field2387++] = class502.field7351.method2775(var56, -127).field908[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2390[--field2387];
                field2392[field2386++] = class139.field2340.method3968(var58, 0).method1309((byte) -101);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2390[--field2387];
                class159 var60 = class139.field2340.method3968(var59, 0);
                if (var60.field2711 == null) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = var60.field2711.length;
                return;
            }
            if (arg0 == 5057) {
                field2387 -= 2;
                int var61 = field2390[field2387];
                int var62 = field2390[field2387 + 1];
                field2390[field2387++] = class139.field2340.method3968(var61, 0).field2711[var62];
                return;
            }
            if (arg0 == 5058) {
                field2385 = new class706();
                field2385.field9984 = field2390[--field2387];
                field2385.field9989 = class139.field2340.method3968(field2385.field9984, 0);
                field2385.field9987 = new int[field2385.field9989.method1308(-103)];
                return;
            }
            if (arg0 == 5059) {
                field2373++;
                class165 var63 = class271.method1917(class420.field6424, (byte) -109, class538.field7857);
                var63.field2776.method65(0, -77);
                int var64 = var63.field2776.field57;
                var63.field2776.method65(0, -77);
                var63.field2776.method25(true, field2385.field9984);
                field2385.field9989.method1314(var63.field2776, false, field2385.field9987);
                var63.field2776.method24(var63.field2776.field57 - var64, (byte) -48);
                class642.method3726(-684096285, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2392[--field2386];
                field2374++;
                class165 var66 = class271.method1917(class420.field6424, (byte) -101, class290.field4595);
                var66.field2776.method65(0, -77);
                int var67 = var66.field2776.field57;
                var66.field2776.method28(var65, 0);
                var66.field2776.method25(true, field2385.field9984);
                field2385.field9989.method1314(var66.field2776, false, field2385.field9987);
                var66.field2776.method24(var66.field2776.field57 - var67, (byte) -27);
                class642.method3726(-684096285, var66);
                return;
            }
            if (arg0 == 5061) {
                field2373++;
                class165 var68 = class271.method1917(class420.field6424, (byte) -61, class538.field7857);
                var68.field2776.method65(0, -77);
                int var69 = var68.field2776.field57;
                var68.field2776.method65(1, -77);
                var68.field2776.method25(true, field2385.field9984);
                field2385.field9989.method1314(var68.field2776, false, field2385.field9987);
                var68.field2776.method24(var68.field2776.field57 - var69, (byte) 115);
                class642.method3726(-684096285, var68);
                return;
            }
            if (arg0 == 5062) {
                field2387 -= 2;
                int var70 = field2390[field2387];
                int var71 = field2390[field2387 + 1];
                field2390[field2387++] = class502.field7351.method2775(var70, -69).field906[var71];
                return;
            }
            if (arg0 == 5063) {
                field2387 -= 2;
                int var72 = field2390[field2387];
                int var73 = field2390[field2387 + 1];
                field2390[field2387++] = class502.field7351.method2775(var72, -41).field913[var73];
                return;
            }
            if (arg0 == 5064) {
                field2387 -= 2;
                int var74 = field2390[field2387];
                int var75 = field2390[field2387 + 1];
                if (var75 == -1) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = class502.field7351.method2775(var74, -109).method732((char) var75, -1);
                return;
            }
            if (arg0 == 5065) {
                field2387 -= 2;
                int var76 = field2390[field2387];
                int var77 = field2390[field2387 + 1];
                if (var77 == -1) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = class502.field7351.method2775(var76, -56).method733((byte) 121, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2390[--field2387];
                field2390[field2387++] = class139.field2340.method3968(var78, 0).method1308(-110);
                return;
            }
            if (arg0 == 5067) {
                field2387 -= 2;
                int var79 = field2390[field2387];
                int var80 = field2390[field2387 + 1];
                int var81 = class139.field2340.method3968(var79, 0).method1306(var80, -1).field3501;
                field2390[field2387++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2387 -= 2;
                int var82 = field2390[field2387];
                int var83 = field2390[field2387 + 1];
                field2385.field9987[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2387 -= 2;
                int var84 = field2390[field2387];
                int var85 = field2390[field2387 + 1];
                field2385.field9987[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2387 -= 3;
                int var86 = field2390[field2387];
                int var87 = field2390[field2387 + 1];
                int var88 = field2390[field2387 + 2];
                class159 var89 = class139.field2340.method3968(var86, 0);
                if (var89.method1306(var87, -1).field3501 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2390[field2387++] = var89.method1315(var87, var88, 1);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2392[--field2386];
                boolean var91 = field2390[--field2387] == 1;
                class584.method3425((byte) 83, var91, var90);
                field2390[field2387++] = class661.field9221;
                return;
            }
            if (arg0 == 5072) {
                if (class649.field9098 != null && class589.field8379 < class661.field9221) {
                    field2390[field2387++] = class649.field9098[class589.field8379++] & 0xFFFF;
                    return;
                }
                field2390[field2387++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class589.field8379 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class83.field1024.method1515(86, -104)) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class83.field1024.method1515(82, -74)) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class83.field1024.method1515(81, 39)) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class587.method3434(50, field2390[--field2387]);
                return;
            }
            if (arg0 == 5201) {
                field2390[field2387++] = class170.method1407(200);
                return;
            }
            if (arg0 == 5205) {
                class150.method1250(0, false, field2390[--field2387], -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field2390[--field2387];
                class354 var93 = class378.method2479(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = var93.field5635;
                return;
            }
            if (arg0 == 5207) {
                class354 var94 = class378.method2490(field2390[--field2387]);
                if (var94 != null && var94.field5645 != null) {
                    field2392[field2386++] = var94.field5645;
                    return;
                }
                field2392[field2386++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2390[field2387++] = class614.field8727;
                field2390[field2387++] = class531.field7741;
                return;
            }
            if (arg0 == 5209) {
                field2390[field2387++] = class528.field7705 + class378.field5901;
                field2390[field2387++] = class97.field1570 + class378.field5902;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field2390[--field2387];
                class354 var96 = class378.method2490(var95);
                if (var96 == null) {
                    field2390[field2387++] = 0;
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = var96.field5644 >> 14 & 0x3FFF;
                field2390[field2387++] = var96.field5644 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field2390[--field2387];
                class354 var98 = class378.method2490(var97);
                if (var98 == null) {
                    field2390[field2387++] = 0;
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = var98.field5646 - var98.field5647;
                field2390[field2387++] = var98.field5648 - var98.field5655;
                return;
            }
            if (arg0 == 5212) {
                class143 var99 = class362.method2416(255);
                if (var99 == null) {
                    field2390[field2387++] = -1;
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = var99.field2408;
                int var100 = var99.field2404 << 28 | class378.field5901 + var99.field2406 << 14 | class378.field5902 + var99.field2407;
                field2390[field2387++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class143 var101 = class680.method3876((byte) -118);
                if (var101 == null) {
                    field2390[field2387++] = -1;
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = var101.field2408;
                int var102 = var101.field2404 << 28 | class378.field5901 + var101.field2406 << 14 | class378.field5902 + var101.field2407;
                field2390[field2387++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field2390[--field2387];
                class354 var104 = class507.method3083(56);
                if (var104 != null) {
                    boolean var105 = var104.method2377(var103 >> 14 & 0x3FFF, field2396, var103 & 0x3FFF, 12800, var103 >> 28 & 0x3);
                    if (var105) {
                        class583.method3418(field2396[1], (byte) 89, field2396[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2387 -= 2;
                int var106 = field2390[field2387];
                int var107 = field2390[field2387 + 1];
                class283 var108 = class378.method2481(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class354 var110 = (class354) var108.method2008(-3717); var110 != null; var110 = (class354) var108.method2011(35)) {
                    if (var110.field5635 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field2390[--field2387];
                class354 var112 = class378.method2490(var111);
                if (var112 == null) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = var112.field5641;
                return;
            }
            if (arg0 == 5220) {
                field2390[field2387++] = class579.field8251 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field2390[--field2387];
                class583.method3418(var113 >> 14 & 0x3FFF, (byte) 89, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class354 var114 = class507.method3083(98);
                if (var114 != null) {
                    boolean var115 = var114.method2375(class528.field7705 + class378.field5901, 121, field2396, class97.field1570 + class378.field5902);
                    if (var115) {
                        field2390[field2387++] = field2396[1];
                        field2390[field2387++] = field2396[2];
                        return;
                    }
                    field2390[field2387++] = -1;
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = -1;
                field2390[field2387++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2387 -= 2;
                int var116 = field2390[field2387];
                int var117 = field2390[field2387 + 1];
                class150.method1250(0, false, var116, var117 >> 14 & 0x3FFF, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field2390[--field2387];
                class354 var119 = class507.method3083(71);
                if (var119 != null) {
                    boolean var120 = var119.method2377(var118 >> 14 & 0x3FFF, field2396, var118 & 0x3FFF, 12800, var118 >> 28 & 0x3);
                    if (var120) {
                        field2390[field2387++] = field2396[1];
                        field2390[field2387++] = field2396[2];
                        return;
                    }
                    field2390[field2387++] = -1;
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = -1;
                field2390[field2387++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field2390[--field2387];
                class354 var122 = class507.method3083(47);
                if (var122 != null) {
                    boolean var123 = var122.method2375(var121 >> 14 & 0x3FFF, 111, field2396, var121 & 0x3FFF);
                    if (var123) {
                        field2390[field2387++] = field2396[1];
                        field2390[field2387++] = field2396[2];
                        return;
                    }
                    field2390[field2387++] = -1;
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = -1;
                field2390[field2387++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class674.method3858(field2390[--field2387], -1);
                return;
            }
            if (arg0 == 5227) {
                field2387 -= 2;
                int var124 = field2390[field2387];
                int var125 = field2390[field2387 + 1];
                class150.method1250(0, true, var124, var125 >> 14 & 0x3FFF, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class387.field6009 = field2390[--field2387] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2390[field2387++] = class387.field6009 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field2390[--field2387];
                class173.method1414(1, var126);
                return;
            }
            if (arg0 == 5231) {
                field2387 -= 2;
                int var127 = field2390[field2387];
                boolean var128 = field2390[field2387 + 1] == 1;
                if (class236.field3753 != null) {
                    class66 var129 = class236.field3753.method1558((long) var127, (byte) -93);
                    if (var129 != null && !var128) {
                        var129.method707((byte) -18);
                        return;
                    }
                    if (var129 == null && var128) {
                        class66 var130 = new class66();
                        class236.field3753.method1564((long) var127, var130, (byte) 103);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field2390[--field2387];
                if (class236.field3753 != null) {
                    class66 var132 = class236.field3753.method1558((long) var131, (byte) -93);
                    field2390[field2387++] = var132 == null ? 0 : 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2387 -= 2;
                int var133 = field2390[field2387];
                boolean var134 = field2390[field2387 + 1] == 1;
                if (class606.field8620 != null) {
                    class66 var135 = class606.field8620.method1558((long) var133, (byte) -93);
                    if (var135 != null && !var134) {
                        var135.method707((byte) -114);
                        return;
                    }
                    if (var135 == null && var134) {
                        class66 var136 = new class66();
                        class606.field8620.method1564((long) var133, var136, (byte) 86);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field2390[--field2387];
                if (class606.field8620 != null) {
                    class66 var138 = class606.field8620.method1558((long) var137, (byte) -93);
                    field2390[field2387++] = var138 == null ? 0 : 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2390[field2387++] = class378.field5872 == null ? -1 : class378.field5872.field5635;
                return;
            }
            if (arg0 == 5236) {
                field2387 -= 2;
                int var139 = field2390[field2387];
                int var140 = field2390[field2387 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class634.method3682(var142, var141, var139, 0);
                if (var143 < 0) {
                    field2390[field2387++] = -1;
                    return;
                }
                field2390[field2387++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class343.method2335(0);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2387 -= 2;
                int var144 = field2390[field2387];
                int var145 = field2390[field2387 + 1];
                class356.method2392(false, -110, var144, 3, var145);
                field2390[field2387++] = class476.field7061 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class476.field7061 != null) {
                    class356.method2392(false, -90, -1, class17.field282.field4865, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class615[] var146 = class27.method428(0);
                field2390[field2387++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field2390[--field2387];
                class615[] var148 = class27.method428(0);
                field2390[field2387++] = var148[var147].field8738;
                field2390[field2387++] = var148[var147].field8734;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class17.field282.field4896;
                int var150 = class17.field282.field4857;
                int var151 = -1;
                class615[] var152 = class27.method428(0);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class615 var154 = var152[var153];
                    if (var154.field8738 == var149 && var154.field8734 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field2390[field2387++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field2390[field2387++] = class33.method452(2);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field2390[--field2387];
                if (var155 >= 1 && var155 <= 2) {
                    class356.method2392(false, -88, -1, var155, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2390[field2387++] = class17.field282.field4865;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field2390[--field2387];
                if (var156 >= 1 && var156 <= 2) {
                    class17.field282.field4865 = var156;
                    class17.field282.method2094(false, class402.field6207);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2386 -= 2;
                String var157 = field2392[field2386];
                String var158 = field2392[field2386 + 1];
                int var159 = field2390[--field2387];
                field2372++;
                class165 var160 = class271.method1917(class420.field6424, (byte) -96, class524.field7629);
                var160.field2776.method65(class516.method3125(93, var157) + class516.method3125(87, var158) + 1, -77);
                var160.field2776.method28(var157, 0);
                var160.field2776.method28(var158, 0);
                var160.field2776.method65(var159, -77);
                class642.method3726(-684096285, var160);
                return;
            }
            if (arg0 == 5401) {
                field2387 -= 2;
                class565.field8122[field2390[field2387]] = (short) class132.method1150(false, field2390[field2387 + 1]);
                class91.field1083.method2850((byte) -124);
                class91.field1083.method2855((byte) 123);
                class538.field7860.method3228((byte) 44);
                class211.method1601(-20030);
                return;
            }
            if (arg0 == 5405) {
                field2387 -= 2;
                int var161 = field2390[field2387];
                int var162 = field2390[field2387 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class356.field5683[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2387 -= 7;
                int var163 = field2390[field2387];
                int var164 = field2390[field2387 + 1] << 1;
                int var165 = field2390[field2387 + 2];
                int var166 = field2390[field2387 + 3];
                int var167 = field2390[field2387 + 4];
                int var168 = field2390[field2387 + 5];
                int var169 = field2390[field2387 + 6];
                if (var163 >= 0 && var163 < 2 && class356.field5683[var163] != null && var164 >= 0 && var164 < class356.field5683[var163].length) {
                    class356.field5683[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class356.field5683[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class356.field5683[field2390[--field2387]].length >> 1;
                field2390[field2387++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class476.field7061 != null) {
                    class356.method2392(false, -94, -1, class17.field282.field4865, -1);
                }
                if (class598.field8470 != null) {
                    class651.method3757(true);
                    System.exit(0);
                    return;
                }
                String var171 = class371.field5817 == null ? class64.method698(true) : class371.field5817;
                class2.method9(class402.field6207, (byte) 123, class497.field7259 == 1, var171, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class578.field8243 != null) {
                    if (class578.field8243.field9885 == null) {
                        var172 = class320.method2177(1, class578.field8243.field9890);
                    } else {
                        var172 = (String) class578.field8243.field9885;
                    }
                }
                field2392[field2386++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field2390[field2387++] = class402.field6207.field7655 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class476.field7061 != null) {
                    class356.method2392(false, -87, -1, class17.field282.field4865, -1);
                }
                String var173 = field2392[--field2386];
                boolean var174 = field2390[--field2387] == 1;
                String var175 = class64.method698(true) + var173;
                class2.method9(class402.field6207, (byte) 55, class497.field7259 == 1, var175, var174);
                return;
            }
            if (arg0 == 5422) {
                field2386 -= 2;
                String var176 = field2392[field2386];
                String var177 = field2392[field2386 + 1];
                int var178 = field2390[--field2387];
                if (var176.length() > 0) {
                    if (class240.field3792 == null) {
                        class240.field3792 = new String[class266.field4333[class99.field1647.field2742]];
                    }
                    class240.field3792[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class231.field3686 == null) {
                        class231.field3686 = new String[class266.field4333[class99.field1647.field2742]];
                    }
                    class231.field3686[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2392[--field2386]);
                return;
            }
            if (arg0 == 5424) {
                field2387 -= 11;
                class1.field9 = field2390[field2387];
                class236.field3750 = field2390[field2387 + 1];
                class428.field6512 = field2390[field2387 + 2];
                class202.field3272 = field2390[field2387 + 3];
                class167.field2806 = field2390[field2387 + 4];
                class68.field874 = field2390[field2387 + 5];
                class12.field193 = field2390[field2387 + 6];
                class105.field1710 = field2390[field2387 + 7];
                class1.field6 = field2390[field2387 + 8];
                class479.field7081 = field2390[field2387 + 9];
                class365.field5741 = field2390[field2387 + 10];
                class158.field2699.method942(0, class167.field2806);
                class158.field2699.method942(0, class68.field874);
                class158.field2699.method942(0, class12.field193);
                class158.field2699.method942(0, class105.field1710);
                class158.field2699.method942(0, class1.field6);
                class281.field4497 = null;
                class87.field1068 = null;
                class518.field7508 = null;
                class207.field3461 = null;
                class7.field116 = null;
                class267.field4350 = null;
                class452.field6794 = null;
                class259.field4146 = null;
                class374.field5844 = true;
                return;
            }
            if (arg0 == 5425) {
                class487.method2984((byte) 17);
                class374.field5844 = false;
                return;
            }
            if (arg0 == 5426) {
                field2387 -= 2;
                class459.field6864 = field2390[field2387];
                class95.field1486 = field2390[field2387 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2387 -= 2;
                class163.field2751 = field2390[field2387 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2387 -= 2;
                int var179 = field2390[field2387];
                int var180 = field2390[field2387 + 1];
                field2390[field2387++] = class466.method2901(var180, var179, true) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class553.method3319(false, field2392[--field2386], false, (byte) 89);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class358.method2403("accountcreated", class450.field6772, -29103);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class358.method2403("accountcreatestarted", class450.field6772, -29103);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class614.field8723 != null) {
                    Transferable var182 = class614.field8723.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var318) {
                        }
                    }
                }
                field2392[field2386++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2387 -= 4;
                int var183 = field2390[field2387];
                int var184 = field2390[field2387 + 1];
                int var185 = field2390[field2387 + 2];
                int var186 = field2390[field2387 + 3];
                class602.method3512((var183 >> 14 & 0x3FFF) - class612.field8702, false, (var183 & 0x3FFF) - class626.field8855, -19139, var184 << 2, var185, var186);
                return;
            }
            if (arg0 == 5501) {
                field2387 -= 4;
                int var187 = field2390[field2387];
                int var188 = field2390[field2387 + 1];
                int var189 = field2390[field2387 + 2];
                int var190 = field2390[field2387 + 3];
                class149.method1248((var187 & 0x3FFF) - class626.field8855, (var187 >> 14 & 0x3FFF) - class612.field8702, 2, var188 << 2, var190, var189);
                return;
            }
            if (arg0 == 5502) {
                field2387 -= 6;
                int var191 = field2390[field2387];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class24.field402 = var191;
                int var192 = field2390[field2387 + 1];
                if (var192 + 1 >= class356.field5683[class24.field402].length >> 1) {
                    throw new RuntimeException();
                }
                class403.field6221 = var192;
                class535.field7836 = 0;
                class226.field3634 = field2390[field2387 + 2];
                class166.field2786 = field2390[field2387 + 3];
                int var193 = field2390[field2387 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class207.field3456 = var193;
                int var194 = field2390[field2387 + 5];
                if (var194 + 1 >= class356.field5683[class207.field3456].length >> 1) {
                    throw new RuntimeException();
                }
                class219.field3578 = var194;
                class126.field2062 = 3;
                class81.field1005 = -1;
                class664.field9243 = -1;
                return;
            }
            if (arg0 == 5503) {
                class83.method781(96);
                return;
            }
            if (arg0 == 5504) {
                field2387 -= 2;
                class453.method2844(field2390[field2387 + 1], field2390[field2387], true, 0);
                return;
            }
            if (arg0 == 5505) {
                field2390[field2387++] = (int) class162.field2746 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2390[field2387++] = (int) class37.field514 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class706.method3985((byte) 115);
                return;
            }
            if (arg0 == 5508) {
                class243.method1739(-16);
                return;
            }
            if (arg0 == 5509) {
                class197.method1548(false);
                return;
            }
            if (arg0 == 5510) {
                class578.method3383(-120);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field2390[--field2387];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class612.field8702;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class275.field4426) {
                    var198 = class275.field4426;
                }
                int var199 = var197 - class626.field8855;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class417.field6374) {
                    var199 = class417.field6374;
                }
                class664.field9238 = (var198 << 9) + 256;
                class204.field3333 = (var199 << 9) + 256;
                class126.field2062 = 4;
                class81.field1005 = -1;
                class664.field9243 = -1;
                return;
            }
            if (arg0 == 5512) {
                class375.method2467((byte) -126);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field2390[--field2387];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class612.field8702;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class275.field4426) {
                        var203 = class275.field4426;
                    }
                    int var204 = var202 - class626.field8855;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class417.field6374) {
                        var204 = class417.field6374;
                    }
                    class664.field9243 = (var203 << 9) + 256;
                    class81.field1005 = (var204 << 9) + 256;
                    return;
                }
                class664.field9243 = -1;
                class81.field1005 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2386 -= 2;
                String var205 = field2392[field2386];
                String var206 = field2392[field2386 + 1];
                int var207 = field2390[--field2387];
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    class63.field808 = var205;
                    class521.field7550 = var206;
                    class700.field9878 = var207;
                    class68.method715(6, (byte) -81);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class90.method809(87);
                return;
            }
            if (arg0 == 5602) {
                if (class706.field9988 == 0) {
                    class629.field8869 = -2;
                    class538.field7862 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2387 -= 4;
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    class371.method2451(field2390[field2387], field2390[field2387 + 3], field2390[field2387 + 2], field2390[field2387 + 1], (byte) -81);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2386--;
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    class392.method2542(false, class595.method3477(31485, field2392[field2386]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2386 -= 2;
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    class454.method2853(-96, false, class595.method3477(31485, field2392[field2386]), field2392[field2386 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class125.field2054 == 0) {
                    class205.field3403 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2390[field2387++] = class538.field7862;
                return;
            }
            if (arg0 == 5608) {
                field2390[field2387++] = class213.field3539;
                return;
            }
            if (arg0 == 5609) {
                field2390[field2387++] = class205.field3403;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field2392[field2386++] = class395.field6147 == null || class395.field6147.length <= var208 ? "" : class97.method940(27, class395.field6147[var208]);
                }
                class395.field6147 = null;
                return;
            }
            if (arg0 == 5611) {
                field2390[field2387++] = class17.field295;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field2390[--field2387];
                if (class682.field9564 != 7) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    if (class499.field7329 != null) {
                        class499.field7329.method588(24331);
                        class499.field7329 = null;
                    }
                    class700.field9878 = var209;
                    class68.method715(9, (byte) -27);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2390[field2387++] = class538.field7862;
                return;
            }
            if (arg0 == 5615) {
                field2386 -= 2;
                String var210 = field2392[field2386];
                String var211 = field2392[field2386 + 1];
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    if (class499.field7329 != null) {
                        class499.field7329.method588(24331);
                        class499.field7329 = null;
                    }
                    class63.field808 = var210;
                    class521.field7550 = var211;
                    class68.method715(5, (byte) -42);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class6.method63(0, false);
                return;
            }
            if (arg0 == 5617) {
                field2390[field2387++] = class629.field8869;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field2390[--field2387];
                class314.method2147(1, false, var212);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field2390[--field2387];
                class314.method2147(1, true, var213);
                return;
            }
            if (arg0 == 5620) {
                class202.method1569(120);
                if (class650.field9102 != "" && class650.field9102 != "") {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2386 -= 2;
                if (class682.field9564 != 3) {
                    return;
                }
                if (class706.field9988 == 0 && class125.field2054 == 0) {
                    class454.method2853(-94, true, class595.method3477(31485, field2392[field2386]), field2392[field2386 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class701 var214 = class402.field6207.method3169(0, "3", false);
                while (var214.field9884 == 0) {
                    class549.method3313(1L, 126);
                }
                if (var214.field9884 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class441 var215 = (class441) var214.field9885;
                if (var215.method2787((byte) -94).exists()) {
                    class6 var216 = new class6(50);
                    try {
                        var215.method2783(var216.field96, 0, 50, 115);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method2785(-1856);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class234.field3704 != null) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2390[field2387++] = (int) (class73.field920 >> 32);
                field2390[field2387++] = (int) (class73.field920 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field2390[--field2387];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class17.field282.field4861 = var217;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6002) {
                class17.field282.method2101((byte) 24, field2390[--field2387] == 1);
                class329.method2213((byte) -21);
                class412.method2622(1);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6003) {
                class17.field282.field4850 = field2390[--field2387] == 1;
                class412.method2622(1);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6005) {
                class17.field282.field4881 = field2390[--field2387] == 1;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6006) {
                class17.field282.field4873 = field2390[--field2387] == 1;
                class627.field8857.method300(!class17.field282.field4873);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6007) {
                class17.field282.field4849 = field2390[--field2387];
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6008) {
                class17.field282.field4852 = field2390[--field2387] == 1;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6009) {
                class17.field282.field4877 = field2390[--field2387] == 1;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6010) {
                class17.field282.field4887 = field2390[--field2387] == 1;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field2390[--field2387];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class17.field282.method2131(class497.field7259, var218, true);
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6012) {
                class17.field282.method2124(class497.field7259, field2390[--field2387] == 1, 1);
                class49.method574(89);
                class338.method2317(51);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6014) {
                class17.field282.field4853 = field2390[--field2387] == 1;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6015) {
                class17.field282.field4848 = field2390[--field2387] == 1;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field2390[--field2387];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class17.field282.field4846 = var219;
                class265.method1878(class497.field7259, -14473);
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6017) {
                class17.field282.field4862 = field2390[--field2387] == 1;
                class399.method2570(89);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field2390[--field2387];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class17.field282.field4860 = var220;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field2390[--field2387];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class17.field282.field4864 != var221) {
                    if (class17.field282.field4864 == 0 && class187.field3121 != -1) {
                        class143.method1216(0, class663.field9232, var221, (byte) 98, false, class187.field3121);
                        class87.method800((byte) 7);
                        class659.field9185 = false;
                    } else if (var221 == 0) {
                        class599.method3497(1);
                        class659.field9185 = false;
                    } else {
                        class287.method2039(var221, -1);
                    }
                    class17.field282.field4864 = var221;
                }
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field2390[--field2387];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class17.field282.field4847 = var222;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6021) {
                class17.field282.field4711 = field2390[--field2387] == 1;
                class412.method2622(1);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field2390[--field2387];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class204.field3324 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class300.method2074(var223, (byte) 72);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                field2390[field2387++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field2390[--field2387];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class17.field282.field4880 = var225;
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field2390[--field2387];
                if (var226 < 0 || var226 > class258.method1825(class204.field3324, -47)) {
                    var226 = 0;
                }
                class17.field282.field4856 = var226;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field2390[--field2387];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class500.method3050(var227 == 1, -17699);
                return;
            }
            if (arg0 == 6028) {
                class17.field282.field4851 = field2390[--field2387] != 0;
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6029) {
                class17.field282.field4849 = field2390[--field2387];
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6030) {
                class17.field282.field4890 = field2390[--field2387] != 0;
                class17.field282.method2094(false, class402.field6207);
                class329.method2213((byte) -21);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field2390[--field2387];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class265.method1878(var228, -14473);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field2390[--field2387];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class17.field282.field4868 = var229;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field2390[--field2387];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class17.field282.field4854 = var230;
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6034) {
                class17.field282.field4872 = field2390[--field2387] == 1;
                class17.field282.method2094(false, class402.field6207);
                class49.method574(67);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6035) {
                class17.field282.field4717 = field2390[--field2387] == 1;
                class329.method2213((byte) -21);
                class412.method2622(1);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field2390[--field2387];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class17.field282.method2097(2, var231);
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field2390[--field2387];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class17.field282.field4875 = var232;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field2390[--field2387];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class17.field282.field4863 != var233 && class560.field8076 == class187.field3121) {
                    if (class17.field282.field4863 == 0) {
                        class143.method1216(0, class663.field9232, var233, (byte) 117, false, class187.field3121);
                        class87.method800((byte) 7);
                        class659.field9185 = false;
                    } else if (var233 == 0) {
                        class599.method3497(1);
                        class659.field9185 = false;
                    } else {
                        class287.method2039(var233, -1);
                    }
                }
                class17.field282.field4863 = var233;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field2390[--field2387];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class17.field282.field4886 != var234) {
                    class17.field282.field4886 = var234;
                    class17.field282.method2094(false, class402.field6207);
                    class644.field9057 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2390[field2387++] = class17.field282.field4861;
                return;
            }
            if (arg0 == 6102) {
                field2390[field2387++] = class17.field282.method2100(class497.field7259, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2390[field2387++] = class17.field282.field4850 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2390[field2387++] = class17.field282.field4881 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2390[field2387++] = class17.field282.field4873 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2390[field2387++] = class17.field282.field4849;
                return;
            }
            if (arg0 == 6108) {
                field2390[field2387++] = class17.field282.field4852 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2390[field2387++] = class17.field282.field4877 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2390[field2387++] = class17.field282.field4887 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2390[field2387++] = class17.field282.method2133(true, class497.field7259);
                return;
            }
            if (arg0 == 6112) {
                field2390[field2387++] = class17.field282.method2127(7525, class497.field7259) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2390[field2387++] = class17.field282.field4853 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2390[field2387++] = class17.field282.field4848 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2390[field2387++] = class17.field282.field4846;
                return;
            }
            if (arg0 == 6117) {
                field2390[field2387++] = class17.field282.field4862 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2390[field2387++] = class17.field282.field4860;
                return;
            }
            if (arg0 == 6119) {
                field2390[field2387++] = class17.field282.field4864;
                return;
            }
            if (arg0 == 6120) {
                field2390[field2387++] = class17.field282.field4847;
                return;
            }
            if (arg0 == 6121) {
                field2390[field2387++] = class627.field8857.method324() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2390[field2387++] = class528.method3197(1088);
                return;
            }
            if (arg0 == 6124) {
                field2390[field2387++] = class17.field282.field4880;
                return;
            }
            if (arg0 == 6125) {
                field2390[field2387++] = class17.field282.field4856;
                return;
            }
            if (arg0 == 6126) {
                field2390[field2387++] = class627.field8857.method319() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2390[field2387++] = class17.field282.field4891 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2390[field2387++] = class17.field282.field4851 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2390[field2387++] = class17.field282.field4849;
                return;
            }
            if (arg0 == 6130) {
                field2390[field2387++] = class17.field282.field4890 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2390[field2387++] = class497.field7259;
                return;
            }
            if (arg0 == 6132) {
                field2390[field2387++] = class17.field282.field4868;
                return;
            }
            if (arg0 == 6133) {
                field2390[field2387++] = class402.field6207.field7655 && !class402.field6207.field7677 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2390[field2387++] = class258.method1825(class204.field3324, -104);
                return;
            }
            if (arg0 == 6135) {
                field2390[field2387++] = class17.field282.field4854;
                return;
            }
            if (arg0 == 6136) {
                field2390[field2387++] = class17.field282.field4872 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field2390[field2387++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2390[field2387++] = class126.method1106(-2066990686, class497.field7259, 200);
                return;
            }
            if (arg0 == 6139) {
                field2390[field2387++] = class17.field282.method2086(32416, class497.field7259);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class97.method941(class497.field7259, -49) && class204.field3324 < 96) {
                    var236 = 1;
                }
                field2390[field2387++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class204.field3324 < 96) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field2390[field2387++] = class17.field282.field4875;
                return;
            }
            if (arg0 == 6143) {
                field2390[field2387++] = class17.field282.field4863;
                return;
            }
            if (arg0 == 6144) {
                field2390[field2387++] = class1.field5 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2390[field2387++] = class17.field282.field4886;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2387 -= 2;
                class265.field4308 = (short) field2390[field2387];
                if (class265.field4308 <= 0) {
                    class265.field4308 = 256;
                }
                class44.field613 = (short) field2390[field2387 + 1];
                if (class44.field613 <= 0) {
                    class44.field613 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2387 -= 2;
                class599.field8542 = (short) field2390[field2387];
                if (class599.field8542 <= 0) {
                    class599.field8542 = 256;
                }
                class271.field4378 = (short) field2390[field2387 + 1];
                if (class271.field4378 <= 0) {
                    class271.field4378 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2387 -= 4;
                class555.field8031 = (short) field2390[field2387];
                if (class555.field8031 <= 0) {
                    class555.field8031 = 1;
                }
                class235.field3742 = (short) field2390[field2387 + 1];
                if (class235.field3742 <= 0) {
                    class235.field3742 = 32767;
                } else if (class235.field3742 < class555.field8031) {
                    class235.field3742 = class555.field8031;
                }
                class595.field8436 = (short) field2390[field2387 + 2];
                if (class595.field8436 <= 0) {
                    class595.field8436 = 1;
                }
                class659.field9187 = (short) field2390[field2387 + 3];
                if (class659.field9187 <= 0) {
                    class659.field9187 = 32767;
                    return;
                }
                if (class659.field9187 < class595.field8436) {
                    class659.field9187 = class595.field8436;
                }
                return;
            }
            if (arg0 == 6203) {
                class673.method3848(0, false, class107.field1736.field9411, -75, 0, class107.field1736.field9282);
                field2390[field2387++] = class598.field8498;
                field2390[field2387++] = class682.field9560;
                return;
            }
            if (arg0 == 6204) {
                field2390[field2387++] = class599.field8542;
                field2390[field2387++] = class271.field4378;
                return;
            }
            if (arg0 == 6205) {
                field2390[field2387++] = class265.field4308;
                field2390[field2387++] = class44.field613;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2390[field2387++] = (int) (class112.method1033(-11752) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2390[field2387++] = (int) (class112.method1033(-11752) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2387 -= 3;
                int var237 = field2390[field2387];
                int var238 = field2390[field2387 + 1];
                int var239 = field2390[field2387 + 2];
                field2383.clear();
                field2383.set(11, 12);
                field2383.set(var239, var238, var237);
                int var240 = (int) (field2383.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field2390[field2387++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field2383.clear();
                field2383.setTime(new Date(class112.method1033(-11752)));
                field2390[field2387++] = field2383.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field2390[--field2387];
                boolean var242 = true;
                if (var241 < 0) {
                    var242 = (var241 + 1) % 4 == 0;
                } else if (var241 < 1582) {
                    var242 = var241 % 4 == 0;
                } else if (var241 % 4 != 0) {
                    var242 = false;
                } else if (var241 % 100 != 0) {
                    var242 = true;
                } else if (var241 % 400 != 0) {
                    var242 = false;
                }
                field2390[field2387++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2390[field2387++] = class615.method3585(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2390[field2387++] = class407.method2607(105) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class682.field9564 == 7 && class706.field9988 == 0 && class125.field2054 == 0) {
                    if (class685.field9606) {
                        field2390[field2387++] = 0;
                        return;
                    }
                    if (class535.field7835 > class112.method1033(-11752) - 1000L) {
                        field2390[field2387++] = 1;
                        return;
                    }
                    class685.field9606 = true;
                    class165 var243 = class271.method1917(class420.field6424, (byte) -116, class170.field2859);
                    var243.field2776.method82(false, class597.field8460);
                    class642.method3726(-684096285, var243);
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class226 var244 = class7.method93(false);
                if (var244 != null) {
                    field2390[field2387++] = var244.field3637;
                    field2390[field2387++] = var244.field9193;
                    field2392[field2386++] = var244.field3640;
                    class146 var245 = var244.method1658(1612957729);
                    field2390[field2387++] = var245.field2453;
                    field2392[field2386++] = var245.field2451;
                    field2390[field2387++] = var244.field9196;
                    field2390[field2387++] = var244.field3642;
                    field2392[field2386++] = var244.field3635;
                    return;
                }
                field2390[field2387++] = -1;
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                return;
            }
            if (arg0 == 6502) {
                class226 var246 = class598.method3494((byte) 81);
                if (var246 != null) {
                    field2390[field2387++] = var246.field3637;
                    field2390[field2387++] = var246.field9193;
                    field2392[field2386++] = var246.field3640;
                    class146 var247 = var246.method1658(1612957729);
                    field2390[field2387++] = var247.field2453;
                    field2392[field2386++] = var247.field2451;
                    field2390[field2387++] = var246.field9196;
                    field2390[field2387++] = var246.field3642;
                    field2392[field2386++] = var246.field3635;
                    return;
                }
                field2390[field2387++] = -1;
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field2390[--field2387];
                String var249 = field2392[--field2386];
                if (class682.field9564 == 7 && class706.field9988 == 0 && class125.field2054 == 0) {
                    field2390[field2387++] = class463.method2895(var248, var249, -21117) ? 1 : 0;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class17.field282.field4894 = field2390[--field2387];
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6505) {
                field2390[field2387++] = class17.field282.field4894;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field2390[--field2387];
                class226 var251 = class88.method803(-60, var250);
                if (var251 != null) {
                    field2390[field2387++] = var251.field9193;
                    field2392[field2386++] = var251.field3640;
                    class146 var252 = var251.method1658(1612957729);
                    field2390[field2387++] = var252.field2453;
                    field2392[field2386++] = var252.field2451;
                    field2390[field2387++] = var251.field9196;
                    field2390[field2387++] = var251.field3642;
                    field2392[field2386++] = var251.field3635;
                    return;
                }
                field2390[field2387++] = -1;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                field2390[field2387++] = 0;
                field2390[field2387++] = 0;
                field2392[field2386++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2387 -= 4;
                int var253 = field2390[field2387];
                boolean var254 = field2390[field2387 + 1] == 1;
                int var255 = field2390[field2387 + 2];
                boolean var256 = field2390[field2387 + 3] == 1;
                class559.method3330(var254, var255, var253, (byte) -109, var256);
                return;
            }
            if (arg0 == 6508) {
                class184.method1498(true);
                return;
            }
            if (arg0 == 6509) {
                if (class682.field9564 != 7) {
                    return;
                }
                class119.field1921 = field2390[--field2387] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2390[field2387++] = class375.field5855;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class17.field282.field4878 = field2390[--field2387] == 1;
                class17.field282.method2094(false, class402.field6207);
                return;
            }
            if (arg0 == 6601) {
                field2390[field2387++] = class17.field282.field4878 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class66.field858 == class629.field8875) {
            if (arg0 == 6700) {
                int var257 = class486.field7115.method1555(0);
                if (class528.field7706 != -1) {
                    var257++;
                }
                field2390[field2387++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field2390[--field2387];
                if (class528.field7706 != -1) {
                    if (var258 == 0) {
                        field2390[field2387++] = class528.field7706;
                        return;
                    }
                    var258--;
                }
                class102 var259 = (class102) class486.field7115.method1556(111);
                while (var258-- > 0) {
                    var259 = (class102) class486.field7115.method1559(121);
                }
                field2390[field2387++] = var259.field1687;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field2390[--field2387];
                if (class564.field8105[var260] == null) {
                    field2392[field2386++] = "";
                    return;
                }
                String var261 = class564.field8105[var260][0].field9316;
                if (var261 == null) {
                    field2392[field2386++] = "";
                    return;
                }
                field2392[field2386++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field2390[--field2387];
                if (class564.field8105[var262] == null) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = class564.field8105[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field2387 -= 2;
                int var263 = field2390[field2387];
                int var264 = field2390[field2387 + 1];
                if (class564.field8105[var263] == null) {
                    field2392[field2386++] = "";
                    return;
                }
                String var265 = class564.field8105[var263][var264].field9316;
                if (var265 == null) {
                    field2392[field2386++] = "";
                    return;
                }
                field2392[field2386++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field2387 -= 2;
                int var266 = field2390[field2387];
                int var267 = field2390[field2387 + 1];
                if (class564.field8105[var266] == null) {
                    field2390[field2387++] = 0;
                    return;
                }
                field2390[field2387++] = class564.field8105[var266][var267].field9413;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2387 -= 3;
                int var268 = field2390[field2387];
                int var269 = field2390[field2387 + 1];
                int var270 = field2390[field2387 + 2];
                class277.method1981(var270, var268 << 16 | var269, -23301, "", 1);
                return;
            }
            if (arg0 == 6708) {
                field2387 -= 3;
                int var271 = field2390[field2387];
                int var272 = field2390[field2387 + 1];
                int var273 = field2390[field2387 + 2];
                class277.method1981(var273, var271 << 16 | var272, -23301, "", 2);
                return;
            }
            if (arg0 == 6709) {
                field2387 -= 3;
                int var274 = field2390[field2387];
                int var275 = field2390[field2387 + 1];
                int var276 = field2390[field2387 + 2];
                class277.method1981(var276, var274 << 16 | var275, -23301, "", 3);
                return;
            }
            if (arg0 == 6710) {
                field2387 -= 3;
                int var277 = field2390[field2387];
                int var278 = field2390[field2387 + 1];
                int var279 = field2390[field2387 + 2];
                class277.method1981(var279, var277 << 16 | var278, -23301, "", 4);
                return;
            }
            if (arg0 == 6711) {
                field2387 -= 3;
                int var280 = field2390[field2387];
                int var281 = field2390[field2387 + 1];
                int var282 = field2390[field2387 + 2];
                class277.method1981(var282, var280 << 16 | var281, -23301, "", 5);
                return;
            }
            if (arg0 == 6712) {
                field2387 -= 3;
                int var283 = field2390[field2387];
                int var284 = field2390[field2387 + 1];
                int var285 = field2390[field2387 + 2];
                class277.method1981(var285, var283 << 16 | var284, -23301, "", 6);
                return;
            }
            if (arg0 == 6713) {
                field2387 -= 3;
                int var286 = field2390[field2387];
                int var287 = field2390[field2387 + 1];
                int var288 = field2390[field2387 + 2];
                class277.method1981(var288, var286 << 16 | var287, -23301, "", 7);
                return;
            }
            if (arg0 == 6714) {
                field2387 -= 3;
                int var289 = field2390[field2387];
                int var290 = field2390[field2387 + 1];
                int var291 = field2390[field2387 + 2];
                class277.method1981(var291, var289 << 16 | var290, -23301, "", 8);
                return;
            }
            if (arg0 == 6715) {
                field2387 -= 3;
                int var292 = field2390[field2387];
                int var293 = field2390[field2387 + 1];
                int var294 = field2390[field2387 + 2];
                class277.method1981(var294, var292 << 16 | var293, -23301, "", 9);
                return;
            }
            if (arg0 == 6716) {
                field2387 -= 3;
                int var295 = field2390[field2387];
                int var296 = field2390[field2387 + 1];
                int var297 = field2390[field2387 + 2];
                class277.method1981(var297, var295 << 16 | var296, -23301, "", 10);
                return;
            }
            if (arg0 == 6717) {
                field2387 -= 3;
                int var298 = field2390[field2387];
                int var299 = field2390[field2387 + 1];
                int var300 = field2390[field2387 + 2];
                class665 var301 = class626.method3656(28613, var298 << 16 | var299, var300);
                class490.method3001((byte) 54);
                class73 var302 = client.method1955(var301);
                class529.method3205(var301, var302.method740(-25706), -256, var302.field921);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field2390[--field2387];
                class257 var304 = class498.field7303.method3286(29982, var303);
                if (var304.field4088 == null) {
                    field2392[field2386++] = "";
                    return;
                }
                field2392[field2386++] = var304.field4088;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field2390[--field2387];
                class257 var306 = class498.field7303.method3286(29982, var305);
                field2390[field2387++] = var306.field4102;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field2390[--field2387];
                class257 var308 = class498.field7303.method3286(29982, var307);
                field2390[field2387++] = var308.field4103;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field2390[--field2387];
                class257 var310 = class498.field7303.method3286(29982, var309);
                field2390[field2387++] = var310.field4112;
                return;
            }
            if (arg0 == 6804) {
                field2387 -= 2;
                int var311 = field2390[field2387];
                int var312 = field2390[field2387 + 1];
                class638 var313 = class610.field8680.method3566(var312, -14724);
                if (var313.method3707((byte) -121)) {
                    field2392[field2386++] = class498.field7303.method3286(29982, var311).method1821(-25509, var312, var313.field8955);
                    return;
                }
                field2390[field2387++] = class498.field7303.method3286(29982, var311).method1818((byte) -101, var312, var313.field8960);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field2390[field2387++] = class622.field8788 && !class193.field3197 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field2390[field2387++] = class500.field7339;
                return;
            }
            if (arg0 == 6902) {
                field2390[field2387++] = class470.field6973;
                return;
            }
            if (arg0 == 6903) {
                field2390[field2387++] = class312.field4908;
                return;
            }
            if (arg0 == 6904) {
                field2390[field2387++] = class388.field6012;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class578.field8243 != null) {
                    if (class578.field8243.field9885 == null) {
                        var314 = class320.method2177(1, class578.field8243.field9890);
                    } else {
                        var314 = (String) class578.field8243.field9885;
                    }
                }
                field2392[field2386++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field2390[field2387++] = class78.field989;
                return;
            }
            if (arg0 == 6907) {
                field2390[field2387++] = class303.field4732;
                return;
            }
            if (arg0 == 6908) {
                field2390[field2387++] = class112.field1783;
                return;
            }
            if (arg0 == 6909) {
                field2390[field2387++] = class407.field6291 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field2390[field2387++] = class192.field3179;
                return;
            }
            if (arg0 == 6911) {
                field2390[field2387++] = class293.field4613;
                return;
            }
            if (arg0 == 6912) {
                field2390[field2387++] = class559.field8075;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class17.field282.method2085(true);
                field2390[field2387++] = class17.field282.field4734 = class497.field7259;
                field2390[field2387++] = var315;
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7001) {
                class17.field282.method2087(756);
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7002) {
                class17.field282.method2088(0);
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7003) {
                class17.field282.method2099(false);
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7004) {
                class17.field282.method2096(true, 1);
                class329.method2213((byte) -21);
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7005) {
                class17.field282.field4870 = 0;
                class17.field282.method2094(false, class402.field6207);
                class644.field9057 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class17.field282.field4734 == 2) {
                    class17.field282.field4728 = true;
                    return;
                }
                if (class17.field282.field4734 == 1) {
                    class17.field282.field4724 = true;
                    return;
                }
                if (class17.field282.field4734 == 3) {
                    class17.field282.field4716 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field2390[field2387++] = class17.field282.field4870;
                return;
            }
            if (arg0 == 7008) {
                if (class497.field7259 == 0 && class204.field3324 < 96) {
                    field2390[field2387++] = 1;
                    return;
                }
                field2390[field2387++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lnm;)V")
    public static final void method1201(class438 arg0) {
        method1207(arg0, 200000);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method1202(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2383.setTime(new Date(var1));
        int var3 = field2383.get(5);
        int var4 = field2383.get(2);
        int var5 = field2383.get(1);
        return var3 + "-" + field2398[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(IZ)V")
    public static final void method1203(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
    private static final void method1204(int arg0) {
        class665 var1 = class326.method2197(false, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class665[] var3 = class575.field8192[var2];
        if (var3 == null) {
            class665[] var4 = class564.field8105[var2];
            int var5 = var4.length;
            var3 = class575.field8192[var2] = new class665[var5];
            class398.method2564(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class398.method2564(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Luda;I)V")
    private static final void method1205(class417 arg0, int arg1) {
        field2387 = 0;
        field2386 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6375;
        int[] var4 = arg0.field6385;
        byte var5 = -1;
        field2391 = 0;
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
                        method1212(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1200(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2390[field2387++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2390[field2387++] = class539.field7869.field9116[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class539.field7869.method3749(field2390[--field2387], 0, var8);
                } else if (var43 == 3) {
                    field2392[field2386++] = arg0.field6379[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2387 -= 2;
                    if (field2390[field2387 + 1] != field2390[field2387]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2387 -= 2;
                    if (field2390[field2387 + 1] == field2390[field2387]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2387 -= 2;
                    if (field2390[field2387] < field2390[field2387 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2387 -= 2;
                    if (field2390[field2387] > field2390[field2387 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2391 == 0) {
                        return;
                    }
                    class566 var9 = field2376[--field2391];
                    arg0 = var9.field8133;
                    var3 = arg0.field6375;
                    var4 = arg0.field6385;
                    var2 = var9.field8123;
                    field2371 = var9.field8130;
                    field2379 = var9.field8124;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2390[field2387++] = class539.field7869.method2031((byte) 40, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class539.field7869.method3746(var11, field2390[--field2387], (byte) -30);
                } else if (var43 == 31) {
                    field2387 -= 2;
                    if (field2390[field2387] <= field2390[field2387 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2387 -= 2;
                    if (field2390[field2387] >= field2390[field2387 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2390[field2387++] = field2371[var4[var2]];
                } else if (var43 == 34) {
                    field2371[var4[var2]] = field2390[--field2387];
                } else if (var43 == 35) {
                    field2392[field2386++] = field2379[var4[var2]];
                } else if (var43 == 36) {
                    field2379[var4[var2]] = field2392[--field2386];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2386 -= var12;
                    String var13 = class661.method3797((byte) 57, field2386, var12, field2392);
                    field2392[field2386++] = var13;
                } else if (var43 == 38) {
                    field2387--;
                } else if (var43 == 39) {
                    field2386--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class417 var15 = class426.method2697(var14, 1011);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6382];
                    String[] var17 = new String[var15.field6380];
                    for (int var18 = 0; var18 < var15.field6377; var18++) {
                        var16[var18] = field2390[field2387 + var18 - var15.field6377];
                    }
                    for (int var19 = 0; var19 < var15.field6378; var19++) {
                        var17[var19] = field2392[field2386 + var19 - var15.field6378];
                    }
                    field2387 -= var15.field6377;
                    field2386 -= var15.field6378;
                    class566 var20 = new class566();
                    var20.field8133 = arg0;
                    var20.field8123 = var2;
                    var20.field8130 = field2371;
                    var20.field8124 = field2379;
                    if (field2391 >= field2376.length) {
                        throw new RuntimeException();
                    }
                    field2376[field2391++] = var20;
                    arg0 = var15;
                    var3 = var15.field6375;
                    var4 = var15.field6385;
                    var2 = -1;
                    field2371 = var16;
                    field2379 = var17;
                } else if (var43 == 42) {
                    field2390[field2387++] = class52.field702[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class52.field702[var21] = field2390[--field2387];
                    class415.method2644(1, var21);
                    class40.field565 |= class691.field9687[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2390[--field2387];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2382[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2381[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2390[--field2387];
                    if (var28 < 0 || var28 >= field2382[var27]) {
                        throw new RuntimeException();
                    }
                    field2390[field2387++] = field2381[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2387 -= 2;
                    int var30 = field2390[field2387];
                    if (var30 < 0 || var30 >= field2382[var29]) {
                        throw new RuntimeException();
                    }
                    field2381[var29][var30] = field2390[field2387 + 1];
                } else if (var43 == 47) {
                    String var31 = class248.field3955[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2392[field2386++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class248.field3955[var32] = field2392[--field2386];
                    class493.method3011((byte) 44, var32);
                } else if (var43 == 51) {
                    class200 var33 = arg0.field6383[var4[var2]];
                    class160 var34 = (class160) var33.method1558((long) field2390[--field2387], (byte) -93);
                    if (var34 != null) {
                        var2 += var34.field2728;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6376 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field844).append(" ");
                for (int var41 = field2391 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2376[var41].field8133.field844).append(" ");
                }
                var40.append("op: ").append(var5);
                class660.method3790(10216, var42, var40.toString());
            } else {
                class307.method2122(4, "Clientscript error in: " + arg0.field6376, (byte) 108);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6376).append("\n");
                for (int var38 = field2391 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2376[var38].field8133.field6376).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class660.method3790(10216, var42, var37.toString());
                class529.method3200(var37.toString(), -123);
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1206(String arg0, int arg1) {
        if (class139.field2342 == 0 && !(!class622.field8788 || class193.field3197) || class519.field7509) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class122.field2019.method1091(0, 1))) {
            var3 = 0;
            arg0 = arg0.substring(class122.field2019.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2020.method1091(0, 1))) {
            var3 = 1;
            arg0 = arg0.substring(class122.field2020.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2021.method1091(0, 1))) {
            var3 = 2;
            arg0 = arg0.substring(class122.field2021.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2022.method1091(0, 1))) {
            var3 = 3;
            arg0 = arg0.substring(class122.field2022.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2023.method1091(0, 1))) {
            var3 = 4;
            arg0 = arg0.substring(class122.field2023.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2024.method1091(0, 1))) {
            var3 = 5;
            arg0 = arg0.substring(class122.field2024.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2025.method1091(0, 1))) {
            var3 = 6;
            arg0 = arg0.substring(class122.field2025.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2026.method1091(0, 1))) {
            var3 = 7;
            arg0 = arg0.substring(class122.field2026.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2027.method1091(0, 1))) {
            var3 = 8;
            arg0 = arg0.substring(class122.field2027.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2028.method1091(0, 1))) {
            var3 = 9;
            arg0 = arg0.substring(class122.field2028.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2029.method1091(0, 1))) {
            var3 = 10;
            arg0 = arg0.substring(class122.field2029.method1091(0, 1).length());
        } else if (var2.startsWith(class122.field2030.method1091(0, 1))) {
            var3 = 11;
            arg0 = arg0.substring(class122.field2030.method1091(0, 1).length());
        } else if (class135.field2206 != 0) {
            if (var2.startsWith(class122.field2019.method1091(class135.field2206, 1))) {
                var3 = 0;
                arg0 = arg0.substring(class122.field2019.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2020.method1091(class135.field2206, 1))) {
                var3 = 1;
                arg0 = arg0.substring(class122.field2020.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2021.method1091(class135.field2206, 1))) {
                var3 = 2;
                arg0 = arg0.substring(class122.field2021.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2022.method1091(class135.field2206, 1))) {
                var3 = 3;
                arg0 = arg0.substring(class122.field2022.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2023.method1091(class135.field2206, 1))) {
                var3 = 4;
                arg0 = arg0.substring(class122.field2023.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2024.method1091(class135.field2206, 1))) {
                var3 = 5;
                arg0 = arg0.substring(class122.field2024.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2025.method1091(class135.field2206, 1))) {
                var3 = 6;
                arg0 = arg0.substring(class122.field2025.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2026.method1091(class135.field2206, 1))) {
                var3 = 7;
                arg0 = arg0.substring(class122.field2026.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2027.method1091(class135.field2206, 1))) {
                var3 = 8;
                arg0 = arg0.substring(class122.field2027.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2028.method1091(class135.field2206, 1))) {
                var3 = 9;
                arg0 = arg0.substring(class122.field2028.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2029.method1091(class135.field2206, 1))) {
                var3 = 10;
                arg0 = arg0.substring(class122.field2029.method1091(class135.field2206, 1).length());
            } else if (var2.startsWith(class122.field2030.method1091(class135.field2206, 1))) {
                var3 = 11;
                arg0 = arg0.substring(class122.field2030.method1091(class135.field2206, 1).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class122.field2031.method1091(0, 1))) {
            var5 = 1;
            arg0 = arg0.substring(class122.field2031.method1091(0, 1).length());
        } else if (var4.startsWith(class122.field2032.method1091(0, 1))) {
            var5 = 2;
            arg0 = arg0.substring(class122.field2032.method1091(0, 1).length());
        } else if (var4.startsWith(class122.field2033.method1091(0, 1))) {
            var5 = 3;
            arg0 = arg0.substring(class122.field2033.method1091(0, 1).length());
        } else if (var4.startsWith(class122.field2034.method1091(0, 1))) {
            var5 = 4;
            arg0 = arg0.substring(class122.field2034.method1091(0, 1).length());
        } else if (var4.startsWith(class122.field2035.method1091(0, 1))) {
            var5 = 5;
            arg0 = arg0.substring(class122.field2035.method1091(0, 1).length());
        } else if (class135.field2206 != 0) {
            if (var4.startsWith(class122.field2031.method1091(class135.field2206, 1))) {
                var5 = 1;
                arg0 = arg0.substring(class122.field2031.method1091(class135.field2206, 1).length());
            } else if (var4.startsWith(class122.field2032.method1091(class135.field2206, 1))) {
                var5 = 2;
                arg0 = arg0.substring(class122.field2032.method1091(class135.field2206, 1).length());
            } else if (var4.startsWith(class122.field2033.method1091(class135.field2206, 1))) {
                var5 = 3;
                arg0 = arg0.substring(class122.field2033.method1091(class135.field2206, 1).length());
            } else if (var4.startsWith(class122.field2034.method1091(class135.field2206, 1))) {
                var5 = 4;
                arg0 = arg0.substring(class122.field2034.method1091(class135.field2206, 1).length());
            } else if (var4.startsWith(class122.field2035.method1091(class135.field2206, 1))) {
                var5 = 5;
                arg0 = arg0.substring(class122.field2035.method1091(class135.field2206, 1).length());
            }
        }
        field2393++;
        class165 var6 = class271.method1917(class420.field6424, (byte) -69, class409.field6301);
        var6.field2776.method65(0, -77);
        int var7 = var6.field2776.field57;
        var6.field2776.method65(var3, -77);
        var6.field2776.method65(var5, -77);
        class252.method1791(var6.field2776, arg0, 13);
        var6.field2776.method24(var6.field2776.field57 - var7, (byte) 121);
        class642.method3726(-684096285, var6);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lnm;I)V")
    private static final void method1207(class438 arg0, int arg1) {
        Object[] var2 = arg0.field6684;
        int var3 = (Integer) var2[0];
        class417 var4 = class426.method2697(var3, 1011);
        if (var4 == null) {
            return;
        }
        field2371 = new int[var4.field6382];
        int var5 = 0;
        field2379 = new String[var4.field6380];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6670;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6678;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6677 == null ? -1 : arg0.field6677.field9400;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6682;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6677 == null ? -1 : arg0.field6677.field9380;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6676 == null ? -1 : arg0.field6676.field9400;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6676 == null ? -1 : arg0.field6676.field9380;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6680;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6674;
                }
                field2371[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6672;
                }
                field2379[var6++] = var9;
            }
        }
        field2399 = arg0.field6683;
        method1205(var4, arg1);
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        if (arg0 == -1 || !class107.method1016(arg0, (byte) 118)) {
            return;
        }
        class665[] var1 = class564.field8105[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class665 var3 = var1[var2];
            if (var3.field9293 != null) {
                class438 var4 = new class438();
                var4.field6677 = var3;
                var4.field6684 = var3.field9293;
                method1207(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "()V")
    public static void method1209() {
        field2371 = null;
        field2379 = null;
        field2382 = null;
        field2381 = null;
        field2390 = null;
        field2392 = null;
        field2376 = null;
        field2375 = null;
        field2380 = null;
        field2385 = null;
        field2383 = null;
        field2398 = null;
        field2396 = null;
        field2397 = null;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "()V")
    public static final void method1210() {
    }

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)V")
    private static final void method1211(int arg0) {
        class665 var1 = class326.method2197(false, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class665[] var3 = class575.field8192[var2];
        if (var3 == null) {
            class665[] var4 = class564.field8105[var2];
            int var5 = var4.length;
            var3 = class575.field8192[var2] = new class665[var5];
            class398.method2564(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class398.method2564(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(IZ)V")
    private static final void method1212(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2387 -= 3;
                int var2 = field2390[field2387];
                int var3 = field2390[field2387 + 1];
                int var4 = field2390[field2387 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class665 var5 = class326.method2197(false, var2);
                if (var5.field9296 == null) {
                    var5.field9296 = new class665[var4 + 1];
                }
                if (var5.field9296.length <= var4) {
                    class665[] var6 = new class665[var4 + 1];
                    for (int var7 = 0; var7 < var5.field9296.length; var7++) {
                        var6[var7] = var5.field9296[var7];
                    }
                    var5.field9296 = var6;
                }
                if (var4 > 0 && var5.field9296[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class665 var8 = new class665();
                var8.field9309 = var3;
                var8.field9401 = var8.field9400 = var5.field9400;
                var8.field9380 = var4;
                var5.field9296[var4] = var8;
                if (arg1) {
                    field2380 = var8;
                } else {
                    field2375 = var8;
                }
                class362.method2415(-128, var5);
                return;
            }
            if (arg0 == 101) {
                class665 var9 = arg1 ? field2380 : field2375;
                if (var9.field9380 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class665 var10 = class326.method2197(false, var9.field9400);
                var10.field9296[var9.field9380] = null;
                class362.method2415(-119, var10);
                return;
            }
            if (arg0 == 102) {
                class665 var11 = class326.method2197(false, field2390[--field2387]);
                var11.field9296 = null;
                class362.method2415(-128, var11);
                return;
            }
            if (arg0 == 200) {
                field2387 -= 2;
                int var12 = field2390[field2387];
                int var13 = field2390[field2387 + 1];
                class665 var14 = class626.method3656(28613, var12, var13);
                if (var14 != null && var13 != -1) {
                    field2390[field2387++] = 1;
                    if (arg1) {
                        field2380 = var14;
                        return;
                    }
                    field2375 = var14;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2390[--field2387];
                class665 var16 = class326.method2197(false, var15);
                if (var16 != null) {
                    field2390[field2387++] = 1;
                    if (arg1) {
                        field2380 = var16;
                        return;
                    }
                    field2375 = var16;
                    return;
                }
                field2390[field2387++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2390[--field2387];
                method1211(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2390[--field2387];
                method1204(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2387 -= 2;
                int var19 = field2390[field2387];
                int var20 = field2390[field2387 + 1];
                for (int var21 = 0; var21 < class457.field6848.length; var21++) {
                    if (class457.field6848[var21] == var19) {
                        class567.field8141.field4778.method1224(var21, var20, class385.field5985, (byte) -128);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class72.field916.length; var22++) {
                    if (class72.field916[var22] == var19) {
                        class567.field8141.field4778.method1224(var22, var20, class385.field5985, (byte) 86);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2387 -= 2;
                int var23 = field2390[field2387];
                int var24 = field2390[field2387 + 1];
                class567.field8141.field4778.method1220(var23, var24, -1);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2390[--field2387] != 0;
                class567.field8141.field4778.method1223((byte) -70, var25);
                return;
            }
            if (arg0 == 411) {
                field2387 -= 2;
                int var26 = field2390[field2387];
                int var27 = field2390[field2387 + 1];
                class567.field8141.field4778.method1218(class91.field1083, var27, (byte) 52, var26);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class665 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class326.method2197(false, field2390[--field2387]);
            } else {
                var28 = arg1 ? field2380 : field2375;
            }
            if (arg0 == 1000) {
                field2387 -= 4;
                var28.field9288 = field2390[field2387];
                var28.field9415 = field2390[field2387 + 1];
                int var29 = field2390[field2387 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2390[field2387 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field9270 = (byte) var29;
                var28.field9348 = (byte) var30;
                class362.method2415(-121, var28);
                class494.method3014(false, var28);
                if (var28.field9380 == -1) {
                    class434.method2760(-120, var28.field9400);
                }
                return;
            }
            if (arg0 == 1001) {
                field2387 -= 4;
                var28.field9264 = field2390[field2387];
                var28.field9334 = field2390[field2387 + 1];
                var28.field9297 = 0;
                var28.field9366 = 0;
                int var31 = field2390[field2387 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2390[field2387 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field9262 = (byte) var31;
                var28.field9353 = (byte) var32;
                class362.method2415(-125, var28);
                class494.method3014(false, var28);
                if (var28.field9309 == 0) {
                    class318.method2168((byte) 119, var28, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2390[--field2387] == 1;
                if (var28.field9363 != var33) {
                    var28.field9363 = var33;
                    class362.method2415(-128, var28);
                }
                if (var28.field9380 == -1) {
                    class657.method3778(var28.field9400, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field2387 -= 2;
                var28.field9308 = field2390[field2387];
                var28.field9290 = field2390[field2387 + 1];
                class362.method2415(-120, var28);
                class494.method3014(false, var28);
                if (var28.field9309 == 0) {
                    class318.method2168((byte) 127, var28, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field9311 = field2390[--field2387] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class665 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class326.method2197(false, field2390[--field2387]);
            } else {
                var34 = arg1 ? field2380 : field2375;
            }
            if (arg0 == 1100) {
                field2387 -= 2;
                var34.field9393 = field2390[field2387];
                if (var34.field9393 > var34.field9318 - var34.field9411) {
                    var34.field9393 = var34.field9318 - var34.field9411;
                }
                if (var34.field9393 < 0) {
                    var34.field9393 = 0;
                }
                var34.field9394 = field2390[field2387 + 1];
                if (var34.field9394 > var34.field9260 - var34.field9282) {
                    var34.field9394 = var34.field9260 - var34.field9282;
                }
                if (var34.field9394 < 0) {
                    var34.field9394 = 0;
                }
                class362.method2415(-122, var34);
                if (var34.field9380 == -1) {
                    class432.method2746(8, var34.field9400);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field9397 = field2390[--field2387];
                class362.method2415(-125, var34);
                if (var34.field9380 == -1) {
                    class34.method465(var34.field9400, 95);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field9385 = field2390[--field2387] == 1;
                class362.method2415(-119, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field9332 = field2390[--field2387];
                class362.method2415(-123, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field9259 = field2390[--field2387];
                class362.method2415(-126, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2390[--field2387];
                if (var34.field9278 != var35) {
                    var34.field9278 = var35;
                    class362.method2415(-121, var34);
                }
                if (var34.field9380 == -1) {
                    class626.method3644((byte) -128, var34.field9400);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field9356 = field2390[--field2387];
                class362.method2415(-126, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field9426 = field2390[--field2387] == 1;
                class362.method2415(-125, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field9414 = 1;
                var34.field9307 = field2390[--field2387];
                class362.method2415(-121, var34);
                if (var34.field9380 == -1) {
                    class500.method3049(var34.field9400, true);
                }
                return;
            }
            if (arg0 == 1109) {
                field2387 -= 6;
                var34.field9323 = field2390[field2387];
                var34.field9365 = field2390[field2387 + 1];
                var34.field9350 = field2390[field2387 + 2];
                var34.field9381 = field2390[field2387 + 3];
                var34.field9367 = field2390[field2387 + 4];
                var34.field9272 = field2390[field2387 + 5];
                class362.method2415(-124, var34);
                if (var34.field9380 == -1) {
                    class541.method3281(65, var34.field9400);
                    class63.method696((byte) -79, var34.field9400);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2390[--field2387];
                if (var34.field9376 != var36) {
                    var34.field9376 = var36;
                    var34.field9387 = 0;
                    var34.field9383 = 1;
                    var34.field9299 = 0;
                    class428 var37 = var34.field9376 == -1 ? null : class636.field8942.method2872((byte) 11, var34.field9376);
                    if (var37 != null) {
                        class204.method1577(var34.field9387, var37, -83);
                    }
                    class362.method2415(-120, var34);
                }
                if (var34.field9380 == -1) {
                    class246.method1756(7916, var34.field9400);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field9352 = field2390[--field2387] == 1;
                class362.method2415(-126, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2392[--field2386];
                if (!var38.equals(var34.field9427)) {
                    var34.field9427 = var38;
                    class362.method2415(-121, var34);
                }
                if (var34.field9380 == -1) {
                    class243.method1738(var34.field9400, -13924);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field9304 = field2390[--field2387];
                class362.method2415(-127, var34);
                if (var34.field9380 == -1) {
                    class496.method3017(var34.field9400, (byte) 25);
                }
                return;
            }
            if (arg0 == 1114) {
                field2387 -= 3;
                var34.field9361 = field2390[field2387];
                var34.field9302 = field2390[field2387 + 1];
                var34.field9331 = field2390[field2387 + 2];
                class362.method2415(-121, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field9410 = field2390[--field2387] == 1;
                class362.method2415(-122, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field9392 = field2390[--field2387];
                class362.method2415(-120, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field9305 = field2390[--field2387];
                class362.method2415(-122, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field9374 = field2390[--field2387] == 1;
                class362.method2415(-126, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field9389 = field2390[--field2387] == 1;
                class362.method2415(-118, var34);
                return;
            }
            if (arg0 == 1120) {
                field2387 -= 2;
                var34.field9318 = field2390[field2387];
                var34.field9260 = field2390[field2387 + 1];
                class362.method2415(-121, var34);
                if (var34.field9309 == 0) {
                    class318.method2168((byte) 124, var34, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field9375 = field2390[--field2387] == 1;
                class362.method2415(-123, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field9272 = field2390[--field2387];
                class362.method2415(-118, var34);
                if (var34.field9380 == -1) {
                    class541.method3281(-82, var34.field9400);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2390[--field2387];
                var34.field9295 = var39 == 1;
                class362.method2415(-121, var34);
                return;
            }
            if (arg0 == 1125) {
                field2387 -= 2;
                var34.field9263 = field2390[field2387];
                var34.field9284 = field2390[field2387 + 1];
                class362.method2415(-124, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field9306 = field2390[--field2387];
                class362.method2415(-124, var34);
                return;
            }
            if (arg0 == 1127) {
                field2387 -= 2;
                int var40 = field2390[field2387];
                int var41 = field2390[field2387 + 1];
                class638 var42 = class610.field8680.method3566(var40, -14724);
                if (var42.field8960 != var41) {
                    var34.method3811(var41, var40, (byte) -92);
                    return;
                }
                var34.method3818((byte) -10, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2390[--field2387];
                String var44 = field2392[--field2386];
                class638 var45 = class610.field8680.method3566(var43, -14724);
                if (!var45.field8955.equals(var44)) {
                    var34.method3806(var44, -127, var43);
                    return;
                }
                var34.method3818((byte) -10, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class665 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class326.method2197(false, field2390[--field2387]);
            } else {
                var46 = arg1 ? field2380 : field2375;
            }
            class362.method2415(-123, var46);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2387 -= 2;
                int var47 = field2390[field2387];
                int var48 = field2390[field2387 + 1];
                if (var46.field9380 == -1) {
                    class426.method2700(var46.field9400, -1);
                    class541.method3281(92, var46.field9400);
                    class63.method696((byte) -79, var46.field9400);
                }
                if (var47 == -1) {
                    var46.field9414 = 1;
                    var46.field9307 = -1;
                    var46.field9354 = -1;
                    return;
                }
                var46.field9354 = var47;
                var46.field9341 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field9416 = true;
                } else {
                    var46.field9416 = false;
                }
                class117 var49 = class91.field1083.method2859(var47, (byte) 126);
                var46.field9350 = var49.field1813;
                var46.field9381 = var49.field1825;
                var46.field9367 = var49.field1832;
                var46.field9323 = var49.field1874;
                var46.field9365 = var49.field1861;
                var46.field9272 = var49.field1886;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field9351 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field9351 = 1;
                } else {
                    var46.field9351 = 2;
                }
                if (var46.field9297 > 0) {
                    var46.field9272 = var46.field9272 * 32 / var46.field9297;
                    return;
                }
                if (var46.field9264 > 0) {
                    var46.field9272 = var46.field9272 * 32 / var46.field9264;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field9414 = 2;
                var46.field9307 = field2390[--field2387];
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field9414 = 3;
                var46.field9307 = -1;
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field9414 = 6;
                var46.field9307 = field2390[--field2387];
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field9414 = 5;
                var46.field9307 = field2390[--field2387];
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
            if (arg0 == 1206) {
                field2387 -= 4;
                var46.field9396 = field2390[field2387];
                var46.field9338 = field2390[field2387 + 1];
                var46.field9359 = field2390[field2387 + 2];
                var46.field9320 = field2390[field2387 + 3];
                class362.method2415(-123, var46);
                return;
            }
            if (arg0 == 1207) {
                field2387 -= 2;
                var46.field9315 = field2390[field2387];
                var46.field9337 = field2390[field2387 + 1];
                class362.method2415(-123, var46);
                return;
            }
            if (arg0 == 1210) {
                field2387 -= 4;
                var46.field9307 = field2390[field2387];
                var46.field9292 = field2390[field2387 + 1];
                if (field2390[field2387 + 2] == 1) {
                    var46.field9414 = 9;
                } else {
                    var46.field9414 = 8;
                }
                if (field2390[field2387 + 3] == 1) {
                    var46.field9416 = true;
                } else {
                    var46.field9416 = false;
                }
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field9414 = 5;
                var46.field9307 = class114.field1793;
                var46.field9292 = 0;
                if (var46.field9380 == -1) {
                    class500.method3049(var46.field9400, true);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class665 var61;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var61 = class326.method2197(false, field2390[--field2387]);
                } else {
                    var61 = arg1 ? field2380 : field2375;
                }
                if (arg0 == 1499) {
                    var61.method3809(true);
                    return;
                }
                String var62 = field2392[--field2386];
                int[] var63 = null;
                if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                    int var64 = field2390[--field2387];
                    if (var64 > 0) {
                        var63 = new int[var64];
                        while (var64-- > 0) {
                            var63[var64] = field2390[--field2387];
                        }
                    }
                    var62 = var62.substring(0, var62.length() - 1);
                }
                Object[] var65 = new Object[var62.length() + 1];
                for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                    if (var62.charAt(var66 - 1) == 's') {
                        var65[var66] = field2392[--field2386];
                    } else {
                        var65[var66] = Integer.valueOf(field2390[--field2387]);
                    }
                }
                int var67 = field2390[--field2387];
                if (var67 == -1) {
                    var65 = null;
                } else {
                    var65[0] = Integer.valueOf(var67);
                }
                if (arg0 == 1400) {
                    var61.field9398 = var65;
                } else if (arg0 == 1401) {
                    var61.field9360 = var65;
                } else if (arg0 == 1402) {
                    var61.field9333 = var65;
                } else if (arg0 == 1403) {
                    var61.field9283 = var65;
                } else if (arg0 == 1404) {
                    var61.field9425 = var65;
                } else if (arg0 == 1405) {
                    var61.field9279 = var65;
                } else if (arg0 == 1406) {
                    var61.field9276 = var65;
                } else if (arg0 == 1407) {
                    var61.field9326 = var65;
                    var61.field9399 = var63;
                } else if (arg0 == 1408) {
                    var61.field9258 = var65;
                } else if (arg0 == 1409) {
                    var61.field9408 = var65;
                } else if (arg0 == 1410) {
                    var61.field9419 = var65;
                } else if (arg0 == 1411) {
                    var61.field9321 = var65;
                } else if (arg0 == 1412) {
                    var61.field9357 = var65;
                } else if (arg0 == 1414) {
                    var61.field9346 = var65;
                    var61.field9257 = var63;
                } else if (arg0 == 1415) {
                    var61.field9324 = var65;
                    var61.field9314 = var63;
                } else if (arg0 == 1416) {
                    var61.field9285 = var65;
                } else if (arg0 == 1417) {
                    var61.field9291 = var65;
                } else if (arg0 == 1418) {
                    var61.field9368 = var65;
                } else if (arg0 == 1419) {
                    var61.field9277 = var65;
                } else if (arg0 == 1420) {
                    var61.field9294 = var65;
                } else if (arg0 == 1421) {
                    var61.field9345 = var65;
                } else if (arg0 == 1422) {
                    var61.field9384 = var65;
                } else if (arg0 == 1423) {
                    var61.field9310 = var65;
                } else if (arg0 == 1424) {
                    var61.field9378 = var65;
                } else if (arg0 == 1425) {
                    var61.field9372 = var65;
                } else if (arg0 == 1426) {
                    var61.field9286 = var65;
                } else if (arg0 == 1427) {
                    var61.field9329 = var65;
                } else if (arg0 == 1428) {
                    var61.field9404 = var65;
                    var61.field9312 = var63;
                } else if (arg0 == 1429) {
                    var61.field9313 = var65;
                    var61.field9325 = var63;
                } else if (arg0 == 1430) {
                    var61.field9369 = var65;
                }
                var61.field9422 = true;
                return;
            }
            if (arg0 < 1600) {
                class665 var68 = arg1 ? field2380 : field2375;
                if (arg0 == 1500) {
                    field2390[field2387++] = var68.field9301;
                    return;
                }
                if (arg0 == 1501) {
                    field2390[field2387++] = var68.field9402;
                    return;
                }
                if (arg0 == 1502) {
                    field2390[field2387++] = var68.field9411;
                    return;
                }
                if (arg0 == 1503) {
                    field2390[field2387++] = var68.field9282;
                    return;
                }
                if (arg0 == 1504) {
                    field2390[field2387++] = var68.field9363 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2390[field2387++] = var68.field9401;
                    return;
                }
                if (arg0 == 1506) {
                    class665 var69 = class140.method1196(-91, var68);
                    field2390[field2387++] = var69 == null ? -1 : var69.field9400;
                    return;
                }
            } else if (arg0 < 1700) {
                class665 var70 = arg1 ? field2380 : field2375;
                if (arg0 == 1600) {
                    field2390[field2387++] = var70.field9393;
                    return;
                }
                if (arg0 == 1601) {
                    field2390[field2387++] = var70.field9394;
                    return;
                }
                if (arg0 == 1602) {
                    field2392[field2386++] = var70.field9427;
                    return;
                }
                if (arg0 == 1603) {
                    field2390[field2387++] = var70.field9318;
                    return;
                }
                if (arg0 == 1604) {
                    field2390[field2387++] = var70.field9260;
                    return;
                }
                if (arg0 == 1605) {
                    field2390[field2387++] = var70.field9272;
                    return;
                }
                if (arg0 == 1606) {
                    field2390[field2387++] = var70.field9350;
                    return;
                }
                if (arg0 == 1607) {
                    field2390[field2387++] = var70.field9367;
                    return;
                }
                if (arg0 == 1608) {
                    field2390[field2387++] = var70.field9381;
                    return;
                }
                if (arg0 == 1609) {
                    field2390[field2387++] = var70.field9332;
                    return;
                }
                if (arg0 == 1610) {
                    field2390[field2387++] = var70.field9323;
                    return;
                }
                if (arg0 == 1611) {
                    field2390[field2387++] = var70.field9365;
                    return;
                }
                if (arg0 == 1612) {
                    field2390[field2387++] = var70.field9278;
                    return;
                }
                if (arg0 == 1613) {
                    int var71 = field2390[--field2387];
                    class638 var72 = class610.field8680.method3566(var71, -14724);
                    if (var72.method3707((byte) -121)) {
                        field2392[field2386++] = var70.method3821(-118, var71, var72.field8955);
                        return;
                    }
                    field2390[field2387++] = var70.method3824(var71, var72.field8960, 21774);
                    return;
                }
                if (arg0 == 1614) {
                    field2390[field2387++] = var70.field9356;
                    return;
                }
                if (arg0 == 2614) {
                    field2390[field2387++] = var70.field9414 == 1 ? var70.field9307 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class665 var73 = arg1 ? field2380 : field2375;
                if (arg0 == 1700) {
                    field2390[field2387++] = var73.field9354;
                    return;
                }
                if (arg0 == 1701) {
                    if (var73.field9354 != -1) {
                        field2390[field2387++] = var73.field9341;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2390[field2387++] = var73.field9380;
                    return;
                }
            } else if (arg0 < 1900) {
                class665 var74 = arg1 ? field2380 : field2375;
                if (arg0 == 1800) {
                    field2390[field2387++] = client.method1955(var74).method740(-25706);
                    return;
                }
                if (arg0 == 1801) {
                    int var75 = field2390[--field2387];
                    int var356 = var75 - 1;
                    if (var74.field9327 != null && var356 < var74.field9327.length && var74.field9327[var356] != null) {
                        field2392[field2386++] = var74.field9327[var356];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var74.field9342 == null) {
                        field2392[field2386++] = "";
                        return;
                    }
                    field2392[field2386++] = var74.field9342;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class665 var354;
                if (arg0 >= 2000) {
                    var354 = class326.method2197(false, field2390[--field2387]);
                    arg0 -= 1000;
                } else {
                    var354 = arg1 ? field2380 : field2375;
                }
                if (field2399 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var354.field9329 == null) {
                        return;
                    }
                    class438 var355 = new class438();
                    var355.field6677 = var354;
                    var355.field6684 = var354.field9329;
                    var355.field6683 = field2399 + 1;
                    class539.field7865.method3463((byte) -87, var355);
                    return;
                }
            } else if (arg0 < 2600) {
                class665 var76 = class326.method2197(false, field2390[--field2387]);
                if (arg0 == 2500) {
                    field2390[field2387++] = var76.field9301;
                    return;
                }
                if (arg0 == 2501) {
                    field2390[field2387++] = var76.field9402;
                    return;
                }
                if (arg0 == 2502) {
                    field2390[field2387++] = var76.field9411;
                    return;
                }
                if (arg0 == 2503) {
                    field2390[field2387++] = var76.field9282;
                    return;
                }
                if (arg0 == 2504) {
                    field2390[field2387++] = var76.field9363 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2390[field2387++] = var76.field9401;
                    return;
                }
                if (arg0 == 1506) {
                    class665 var77 = class140.method1196(-79, var76);
                    field2390[field2387++] = var77 == null ? -1 : var77.field9400;
                    return;
                }
            } else if (arg0 < 2700) {
                class665 var78 = class326.method2197(false, field2390[--field2387]);
                if (arg0 == 2600) {
                    field2390[field2387++] = var78.field9393;
                    return;
                }
                if (arg0 == 2601) {
                    field2390[field2387++] = var78.field9394;
                    return;
                }
                if (arg0 == 2602) {
                    field2392[field2386++] = var78.field9427;
                    return;
                }
                if (arg0 == 2603) {
                    field2390[field2387++] = var78.field9318;
                    return;
                }
                if (arg0 == 2604) {
                    field2390[field2387++] = var78.field9260;
                    return;
                }
                if (arg0 == 2605) {
                    field2390[field2387++] = var78.field9272;
                    return;
                }
                if (arg0 == 2606) {
                    field2390[field2387++] = var78.field9350;
                    return;
                }
                if (arg0 == 2607) {
                    field2390[field2387++] = var78.field9367;
                    return;
                }
                if (arg0 == 2608) {
                    field2390[field2387++] = var78.field9381;
                    return;
                }
                if (arg0 == 2609) {
                    field2390[field2387++] = var78.field9332;
                    return;
                }
                if (arg0 == 2610) {
                    field2390[field2387++] = var78.field9323;
                    return;
                }
                if (arg0 == 2611) {
                    field2390[field2387++] = var78.field9365;
                    return;
                }
                if (arg0 == 2612) {
                    field2390[field2387++] = var78.field9278;
                    return;
                }
                if (arg0 == 2613) {
                    field2390[field2387++] = var78.field9356;
                    return;
                }
                if (arg0 == 2614) {
                    field2390[field2387++] = var78.field9414 == 1 ? var78.field9307 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class665 var79 = class326.method2197(false, field2390[--field2387]);
                    field2390[field2387++] = var79.field9354;
                    return;
                }
                if (arg0 == 2701) {
                    class665 var80 = class326.method2197(false, field2390[--field2387]);
                    if (var80.field9354 != -1) {
                        field2390[field2387++] = var80.field9341;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var81 = field2390[--field2387];
                    class102 var82 = (class102) class486.field7115.method1558((long) var81, (byte) -93);
                    if (var82 != null) {
                        field2390[field2387++] = 1;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class665 var83 = class326.method2197(false, field2390[--field2387]);
                    if (var83.field9296 == null) {
                        field2390[field2387++] = 0;
                        return;
                    }
                    int var84 = var83.field9296.length;
                    for (int var85 = 0; var85 < var83.field9296.length; var85++) {
                        if (var83.field9296[var85] == null) {
                            var84 = var85;
                            break;
                        }
                    }
                    field2390[field2387++] = var84;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2387 -= 2;
                    int var86 = field2390[field2387];
                    int var87 = field2390[field2387 + 1];
                    class102 var88 = (class102) class486.field7115.method1558((long) var86, (byte) -93);
                    if (var88 != null && var88.field1687 == var87) {
                        field2390[field2387++] = 1;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class665 var89 = class326.method2197(false, field2390[--field2387]);
                if (arg0 == 2800) {
                    field2390[field2387++] = client.method1955(var89).method740(-25706);
                    return;
                }
                if (arg0 == 2801) {
                    int var90 = field2390[--field2387];
                    int var357 = var90 - 1;
                    if (var89.field9327 != null && var357 < var89.field9327.length && var89.field9327[var357] != null) {
                        field2392[field2386++] = var89.field9327[var357];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var89.field9342 == null) {
                        field2392[field2386++] = "";
                        return;
                    }
                    field2392[field2386++] = var89.field9342;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var91 = field2392[--field2386];
                    class114.method1034(var91, 256);
                    return;
                }
                if (arg0 == 3101) {
                    field2387 -= 2;
                    class253.method1798(field2390[field2387 + 1], class567.field8141, false, field2390[field2387]);
                    return;
                }
                if (arg0 == 3103) {
                    class584.method3424(true, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var92 = field2392[--field2386];
                    int var93 = 0;
                    if (class357.method2400(10, var92)) {
                        var93 = class566.method3354((byte) -113, var92);
                    }
                    field2394++;
                    class165 var94 = class271.method1917(class420.field6424, (byte) -109, class558.field8065);
                    var94.field2776.method82(false, var93);
                    class642.method3726(-684096285, var94);
                    return;
                }
                if (arg0 == 3105) {
                    String var95 = field2392[--field2386];
                    field2395++;
                    class165 var96 = class271.method1917(class420.field6424, (byte) -99, class623.field8791);
                    var96.field2776.method65(var95.length() + 1, -77);
                    var96.field2776.method28(var95, 0);
                    class642.method3726(-684096285, var96);
                    return;
                }
                if (arg0 == 3106) {
                    String var97 = field2392[--field2386];
                    field2388++;
                    class165 var98 = class271.method1917(class420.field6424, (byte) -110, class213.field3534);
                    var98.field2776.method65(var97.length() + 1, -77);
                    var98.field2776.method28(var97, 0);
                    class642.method3726(-684096285, var98);
                    return;
                }
                if (arg0 == 3107) {
                    int var99 = field2390[--field2387];
                    String var100 = field2392[--field2386];
                    class159.method1313(32768, var100, var99);
                    return;
                }
                if (arg0 == 3108) {
                    field2387 -= 3;
                    int var101 = field2390[field2387];
                    int var102 = field2390[field2387 + 1];
                    int var103 = field2390[field2387 + 2];
                    class665 var104 = class326.method2197(false, var103);
                    class703.method3966(0, var101, var104, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field2387 -= 2;
                    int var105 = field2390[field2387];
                    int var106 = field2390[field2387 + 1];
                    class665 var107 = arg1 ? field2380 : field2375;
                    class703.method3966(0, var105, var107, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var108 = field2390[--field2387];
                    field2378++;
                    class165 var109 = class271.method1917(class420.field6424, (byte) -98, class293.field4610);
                    var109.field2776.method25(true, var108);
                    class642.method3726(-684096285, var109);
                    return;
                }
                if (arg0 == 3111) {
                    field2387 -= 2;
                    int var110 = field2390[field2387];
                    int var111 = field2390[field2387 + 1];
                    class102 var112 = (class102) class486.field7115.method1558((long) var110, (byte) -93);
                    if (var112 != null) {
                        class353.method2370(var112.field1687 != var111, (byte) 0, true, var112);
                    }
                    class322.method2184(var111, 3, true, var110, 1);
                    return;
                }
                if (arg0 == 3112) {
                    field2387--;
                    int var113 = field2390[field2387];
                    class102 var114 = (class102) class486.field7115.method1558((long) var113, (byte) -93);
                    if (var114 != null && var114.field1689 == 3) {
                        class353.method2370(true, (byte) 0, true, var114);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class349.method2353(24348, field2392[--field2386]);
                    return;
                }
                if (arg0 == 3114) {
                    field2387 -= 2;
                    int var115 = field2390[field2387];
                    int var116 = field2390[field2387 + 1];
                    String var117 = field2392[--field2386];
                    class247.method1763("", "", var117, false, var116, var115, "");
                    return;
                }
                if (arg0 == 3115) {
                    field2387 -= 11;
                    class254[] var118 = class411.method2620(0);
                    class395[] var119 = class129.method1125(0);
                    class156.method1293(field2390[field2387 + 4], field2390[field2387 + 8], field2390[field2387 + 10], field2390[field2387 + 5], field2390[field2387 + 3], field2390[field2387 + 9], field2390[field2387 + 6], var119[field2390[field2387 + 1]], 0, var118[field2390[field2387]], field2390[field2387 + 7], field2390[field2387 + 2]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2387 -= 3;
                    class556.method3322(field2390[field2387], 96, 256, field2390[field2387 + 2], field2390[field2387 + 1], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class260.method1842(false, 50, 255, field2390[--field2387]);
                    return;
                }
                if (arg0 == 3202) {
                    field2387 -= 2;
                    class691.method3914(field2390[field2387], 255, field2390[field2387 + 1], 22662);
                    return;
                }
                if (arg0 == 3203) {
                    field2387 -= 4;
                    class556.method3322(field2390[field2387], -93, 256, field2390[field2387 + 2], field2390[field2387 + 1], field2390[field2387 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field2387 -= 3;
                    class260.method1842(false, field2390[field2387 + 2], field2390[field2387 + 1], field2390[field2387]);
                    return;
                }
                if (arg0 == 3205) {
                    field2387 -= 3;
                    class691.method3914(field2390[field2387], field2390[field2387 + 2], field2390[field2387 + 1], 22662);
                    return;
                }
                if (arg0 == 3206) {
                    field2387 -= 4;
                    class299.method2072(field2390[field2387 + 3], 256, field2390[field2387 + 2], field2390[field2387], 87, field2390[field2387 + 1], false);
                    return;
                }
                if (arg0 == 3207) {
                    field2387 -= 4;
                    class299.method2072(field2390[field2387 + 3], 256, field2390[field2387 + 2], field2390[field2387], 118, field2390[field2387 + 1], true);
                    return;
                }
                if (arg0 == 3208) {
                    field2387 -= 5;
                    class556.method3322(field2390[field2387], -121, field2390[field2387 + 4], field2390[field2387 + 2], field2390[field2387 + 1], field2390[field2387 + 3]);
                    return;
                }
                if (arg0 == 3209) {
                    field2387 -= 5;
                    class299.method2072(field2390[field2387 + 3], field2390[field2387 + 4], field2390[field2387 + 2], field2390[field2387], 91, field2390[field2387 + 1], false);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2390[field2387++] = class562.field8084;
                    return;
                }
                if (arg0 == 3301) {
                    field2387 -= 2;
                    int var120 = field2390[field2387];
                    int var121 = field2390[field2387 + 1];
                    field2390[field2387++] = class252.method1790(var120, false, var121, true);
                    return;
                }
                if (arg0 == 3302) {
                    field2387 -= 2;
                    int var122 = field2390[field2387];
                    int var123 = field2390[field2387 + 1];
                    field2390[field2387++] = class209.method1594(var122, var123, (byte) -89, false);
                    return;
                }
                if (arg0 == 3303) {
                    field2387 -= 2;
                    int var124 = field2390[field2387];
                    int var125 = field2390[field2387 + 1];
                    field2390[field2387++] = class547.method3306(false, var125, -117, var124);
                    return;
                }
                if (arg0 == 3304) {
                    int var126 = field2390[--field2387];
                    field2390[field2387++] = class522.field7578.method2942((byte) -58, var126).field2883;
                    return;
                }
                if (arg0 == 3305) {
                    int var127 = field2390[--field2387];
                    field2390[field2387++] = class49.field651[var127];
                    return;
                }
                if (arg0 == 3306) {
                    int var128 = field2390[--field2387];
                    field2390[field2387++] = class295.field4622[var128];
                    return;
                }
                if (arg0 == 3307) {
                    int var129 = field2390[--field2387];
                    field2390[field2387++] = class475.field7027[var129];
                    return;
                }
                if (arg0 == 3308) {
                    byte var130 = class567.field8141.field9695;
                    int var131 = (class567.field8141.field9696 >> 9) + class612.field8702;
                    int var132 = (class567.field8141.field9705 >> 9) + class626.field8855;
                    field2390[field2387++] = (var130 << 28) + (var131 << 14) + var132;
                    return;
                }
                if (arg0 == 3309) {
                    int var133 = field2390[--field2387];
                    field2390[field2387++] = var133 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var134 = field2390[--field2387];
                    field2390[field2387++] = var134 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var135 = field2390[--field2387];
                    field2390[field2387++] = var135 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2390[field2387++] = class609.field8649 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2387 -= 2;
                    int var136 = field2390[field2387];
                    int var137 = field2390[field2387 + 1];
                    field2390[field2387++] = class252.method1790(var136, true, var137, true);
                    return;
                }
                if (arg0 == 3314) {
                    field2387 -= 2;
                    int var138 = field2390[field2387];
                    int var139 = field2390[field2387 + 1];
                    field2390[field2387++] = class209.method1594(var138, var139, (byte) -97, true);
                    return;
                }
                if (arg0 == 3315) {
                    field2387 -= 2;
                    int var140 = field2390[field2387];
                    int var141 = field2390[field2387 + 1];
                    field2390[field2387++] = class547.method3306(true, var141, -114, var140);
                    return;
                }
                if (arg0 == 3316) {
                    if (class139.field2342 >= 2) {
                        field2390[field2387++] = class139.field2342;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2390[field2387++] = class157.field2688;
                    return;
                }
                if (arg0 == 3318) {
                    field2390[field2387++] = class221.field3591.field6971;
                    return;
                }
                if (arg0 == 3321) {
                    field2390[field2387++] = class669.field9455;
                    return;
                }
                if (arg0 == 3322) {
                    field2390[field2387++] = class218.field3569;
                    return;
                }
                if (arg0 == 3323) {
                    if (class30.field447 >= 5 && class30.field447 <= 9) {
                        field2390[field2387++] = 1;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class30.field447 >= 5 && class30.field447 <= 9) {
                        field2390[field2387++] = class30.field447;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2390[field2387++] = class303.field4715 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2390[field2387++] = class567.field8141.field4777;
                    return;
                }
                if (arg0 == 3327) {
                    field2390[field2387++] = class567.field8141.field4778.field2418 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2390[field2387++] = class519.field7509 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var142 = field2390[--field2387];
                    field2390[field2387++] = class118.method1062(false, 122, var142);
                    return;
                }
                if (arg0 == 3331) {
                    field2387 -= 2;
                    int var143 = field2390[field2387];
                    int var144 = field2390[field2387 + 1];
                    field2390[field2387++] = class490.method3000(var144, false, -4016, false, var143);
                    return;
                }
                if (arg0 == 3332) {
                    field2387 -= 2;
                    int var145 = field2390[field2387];
                    int var146 = field2390[field2387 + 1];
                    field2390[field2387++] = class490.method3000(var146, true, -4016, false, var145);
                    return;
                }
                if (arg0 == 3333) {
                    field2390[field2387++] = class700.field9878;
                    return;
                }
                if (arg0 == 3335) {
                    field2390[field2387++] = class135.field2206;
                    return;
                }
                if (arg0 == 3336) {
                    field2387 -= 4;
                    int var147 = field2390[field2387];
                    int var148 = field2390[field2387 + 1];
                    int var149 = field2390[field2387 + 2];
                    int var150 = field2390[field2387 + 3];
                    int var151 = (var148 << 14) + var147;
                    int var152 = (var149 << 28) + var151;
                    int var153 = var150 + var152;
                    field2390[field2387++] = var153;
                    return;
                }
                if (arg0 == 3337) {
                    field2390[field2387++] = class611.field8698;
                    return;
                }
                if (arg0 == 3338) {
                    field2390[field2387++] = class520.method3132(-127);
                    return;
                }
                if (arg0 == 3339) {
                    field2390[field2387++] = class440.field6707 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field2390[field2387++] = class437.field6669 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field2390[field2387++] = class548.field7976 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field2390[field2387++] = class464.field6929.method451(1196);
                    return;
                }
                if (arg0 == 3343) {
                    field2390[field2387++] = class464.field6929.method454(52);
                    return;
                }
                if (arg0 == 3344) {
                    field2392[field2386++] = class408.method2612(32768);
                    return;
                }
                if (arg0 == 3345) {
                    field2392[field2386++] = class566.method3355(17954);
                    return;
                }
                if (arg0 == 3346) {
                    field2390[field2387++] = class70.method722(-109);
                    return;
                }
                if (arg0 == 3347) {
                    field2390[field2387++] = class70.field890;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2387 -= 2;
                    int var154 = field2390[field2387];
                    int var155 = field2390[field2387 + 1];
                    class57 var156 = class7.field113.method3047(var154, (byte) 126);
                    field2392[field2386++] = var156.method660(-119, var155);
                    return;
                }
                if (arg0 == 3408) {
                    field2387 -= 4;
                    int var157 = field2390[field2387];
                    int var158 = field2390[field2387 + 1];
                    int var159 = field2390[field2387 + 2];
                    int var160 = field2390[field2387 + 3];
                    class57 var161 = class7.field113.method3047(var159, (byte) 120);
                    if (var161.field741 == var157 && var161.field744 == var158) {
                        if (var158 == 115) {
                            field2392[field2386++] = var161.method660(-120, var160);
                            return;
                        }
                        field2390[field2387++] = var161.method659(-2, var160);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field2387 -= 3;
                    int var162 = field2390[field2387];
                    int var163 = field2390[field2387 + 1];
                    int var164 = field2390[field2387 + 2];
                    if (var163 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class57 var165 = class7.field113.method3047(var163, (byte) 120);
                    if (var165.field744 != var162) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2390[field2387++] = var165.method661(3, var164) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var166 = field2390[--field2387];
                    String var167 = field2392[--field2386];
                    if (var166 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class57 var168 = class7.field113.method3047(var166, (byte) 80);
                    if (var168.field744 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2390[field2387++] = var168.method658(true, var167) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var169 = field2390[--field2387];
                    class57 var170 = class7.field113.method3047(var169, (byte) 83);
                    field2390[field2387++] = var170.field735.method1555(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class538.field7861 == 0) {
                        field2390[field2387++] = -2;
                        return;
                    }
                    if (class538.field7861 == 1) {
                        field2390[field2387++] = -1;
                        return;
                    }
                    field2390[field2387++] = class204.field3334;
                    return;
                }
                if (arg0 == 3601) {
                    int var171 = field2390[--field2387];
                    if (class538.field7861 == 2 && var171 < class204.field3334) {
                        field2392[field2386++] = class527.field7700[var171];
                        if (class20.field328[var171] != null) {
                            field2392[field2386++] = class20.field328[var171];
                            return;
                        }
                        field2392[field2386++] = "";
                        return;
                    }
                    field2392[field2386++] = "";
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var172 = field2390[--field2387];
                    if (class538.field7861 == 2 && var172 < class204.field3334) {
                        field2390[field2387++] = class185.field3113[var172];
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var173 = field2390[--field2387];
                    if (class538.field7861 == 2 && var173 < class204.field3334) {
                        field2390[field2387++] = class46.field623[var173];
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var174 = field2392[--field2386];
                    int var175 = field2390[--field2387];
                    class694.method3922(2447, var175, var174);
                    return;
                }
                if (arg0 == 3605) {
                    String var176 = field2392[--field2386];
                    class464.method2898((byte) -98, var176);
                    return;
                }
                if (arg0 == 3606) {
                    String var177 = field2392[--field2386];
                    class286.method2035(1, var177);
                    return;
                }
                if (arg0 == 3607) {
                    String var178 = field2392[--field2386];
                    class626.method3650(false, var178, -110);
                    return;
                }
                if (arg0 == 3608) {
                    String var179 = field2392[--field2386];
                    class440.method2780(var179, true);
                    return;
                }
                if (arg0 == 3609) {
                    String var180 = field2392[--field2386];
                    if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                        var180 = var180.substring(7);
                    }
                    field2390[field2387++] = class503.method3059((byte) -77, var180) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var181 = field2390[--field2387];
                    if (class538.field7861 == 2 && var181 < class204.field3334) {
                        field2392[field2386++] = class124.field2048[var181];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class145.field2442 != null) {
                        field2392[field2386++] = class97.method940(-79, class145.field2442);
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class145.field2442 != null) {
                        field2390[field2387++] = class307.field4836;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var182 = field2390[--field2387];
                    if (class145.field2442 != null && var182 < class307.field4836) {
                        field2392[field2386++] = class92.field1171[var182].field3594;
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var183 = field2390[--field2387];
                    if (class145.field2442 != null && var183 < class307.field4836) {
                        field2390[field2387++] = class92.field1171[var183].field3587;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var184 = field2390[--field2387];
                    if (class145.field2442 != null && var184 < class307.field4836) {
                        field2390[field2387++] = class92.field1171[var184].field3590;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2390[field2387++] = class289.field4585;
                    return;
                }
                if (arg0 == 3617) {
                    String var185 = field2392[--field2386];
                    class145.method1232(var185, false);
                    return;
                }
                if (arg0 == 3618) {
                    field2390[field2387++] = class191.field3164;
                    return;
                }
                if (arg0 == 3619) {
                    String var186 = field2392[--field2386];
                    class402.method2583(var186, 17378);
                    return;
                }
                if (arg0 == 3620) {
                    class299.method2071((byte) -7);
                    return;
                }
                if (arg0 == 3621) {
                    if (class538.field7861 == 0) {
                        field2390[field2387++] = -1;
                        return;
                    }
                    field2390[field2387++] = class51.field691;
                    return;
                }
                if (arg0 == 3622) {
                    int var187 = field2390[--field2387];
                    if (class538.field7861 != 0 && var187 < class51.field691) {
                        field2392[field2386++] = class478.field7077[var187];
                        if (class333.field5455[var187] != null) {
                            field2392[field2386++] = class333.field5455[var187];
                            return;
                        }
                        field2392[field2386++] = "";
                        return;
                    }
                    field2392[field2386++] = "";
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var188 = field2392[--field2386];
                    if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                        var188 = var188.substring(7);
                    }
                    field2390[field2387++] = class661.method3793(var188, (byte) 17) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var189 = field2390[--field2387];
                    if (class92.field1171 != null && var189 < class307.field4836 && class92.field1171[var189].field3588.equalsIgnoreCase(class567.field8141.field4792)) {
                        field2390[field2387++] = 1;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class584.field8306 != null) {
                        field2392[field2386++] = class584.field8306;
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var190 = field2390[--field2387];
                    if (class145.field2442 != null && var190 < class307.field4836) {
                        field2392[field2386++] = class92.field1171[var190].field3596;
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var191 = field2390[--field2387];
                    if (class538.field7861 == 2 && var191 >= 0 && var191 < class204.field3334) {
                        field2390[field2387++] = class322.field5038[var191] ? 1 : 0;
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var192 = field2392[--field2386];
                    if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                        var192 = var192.substring(7);
                    }
                    field2390[field2387++] = class118.method1064(var192, false);
                    return;
                }
                if (arg0 == 3629) {
                    field2390[field2387++] = class464.field6930;
                    return;
                }
                if (arg0 == 3630) {
                    String var193 = field2392[--field2386];
                    class626.method3650(true, var193, 80);
                    return;
                }
                if (arg0 == 3631) {
                    int var194 = field2390[--field2387];
                    field2390[field2387++] = class55.field726[var194] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var195 = field2390[--field2387];
                    if (class145.field2442 != null && var195 < class307.field4836) {
                        field2392[field2386++] = class92.field1171[var195].field3588;
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var196 = field2390[--field2387];
                    if (class538.field7861 != 0 && var196 < class51.field691) {
                        field2392[field2386++] = class299.field4671[var196];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var197 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var197].method780(117);
                    return;
                }
                if (arg0 == 3904) {
                    int var198 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var198].field1023;
                    return;
                }
                if (arg0 == 3905) {
                    int var199 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var199].field1030;
                    return;
                }
                if (arg0 == 3906) {
                    int var200 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var200].field1021;
                    return;
                }
                if (arg0 == 3907) {
                    int var201 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var201].field1028;
                    return;
                }
                if (arg0 == 3908) {
                    int var202 = field2390[--field2387];
                    field2390[field2387++] = class668.field9445[var202].field1029;
                    return;
                }
                if (arg0 == 3910) {
                    int var203 = field2390[--field2387];
                    int var204 = class668.field9445[var203].method779((byte) 105);
                    field2390[field2387++] = var204 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var205 = field2390[--field2387];
                    int var206 = class668.field9445[var205].method779((byte) 105);
                    field2390[field2387++] = var206 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var207 = field2390[--field2387];
                    int var208 = class668.field9445[var207].method779((byte) 105);
                    field2390[field2387++] = var208 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var209 = field2390[--field2387];
                    int var210 = class668.field9445[var209].method779((byte) 105);
                    field2390[field2387++] = var210 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2387 -= 2;
                    int var211 = field2390[field2387];
                    int var212 = field2390[field2387 + 1];
                    field2390[field2387++] = var211 + var212;
                    return;
                }
                if (arg0 == 4001) {
                    field2387 -= 2;
                    int var213 = field2390[field2387];
                    int var214 = field2390[field2387 + 1];
                    field2390[field2387++] = var213 - var214;
                    return;
                }
                if (arg0 == 4002) {
                    field2387 -= 2;
                    int var215 = field2390[field2387];
                    int var216 = field2390[field2387 + 1];
                    field2390[field2387++] = var215 * var216;
                    return;
                }
                if (arg0 == 4003) {
                    field2387 -= 2;
                    int var217 = field2390[field2387];
                    int var218 = field2390[field2387 + 1];
                    field2390[field2387++] = var217 / var218;
                    return;
                }
                if (arg0 == 4004) {
                    int var219 = field2390[--field2387];
                    field2390[field2387++] = (int) (Math.random() * (double) var219);
                    return;
                }
                if (arg0 == 4005) {
                    int var220 = field2390[--field2387];
                    field2390[field2387++] = (int) (Math.random() * (double) (var220 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2387 -= 5;
                    int var221 = field2390[field2387];
                    int var222 = field2390[field2387 + 1];
                    int var223 = field2390[field2387 + 2];
                    int var224 = field2390[field2387 + 3];
                    int var225 = field2390[field2387 + 4];
                    field2390[field2387++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                    return;
                }
                if (arg0 == 4007) {
                    field2387 -= 2;
                    long var226 = (long) field2390[field2387];
                    long var228 = (long) field2390[field2387 + 1];
                    field2390[field2387++] = (int) (var226 * var228 / 100L + var226);
                    return;
                }
                if (arg0 == 4008) {
                    field2387 -= 2;
                    int var230 = field2390[field2387];
                    int var231 = field2390[field2387 + 1];
                    field2390[field2387++] = var230 | 0x1 << var231;
                    return;
                }
                if (arg0 == 4009) {
                    field2387 -= 2;
                    int var232 = field2390[field2387];
                    int var233 = field2390[field2387 + 1];
                    field2390[field2387++] = var232 & -(0x1 << var233) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2387 -= 2;
                    int var234 = field2390[field2387];
                    int var235 = field2390[field2387 + 1];
                    field2390[field2387++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2387 -= 2;
                    int var236 = field2390[field2387];
                    int var237 = field2390[field2387 + 1];
                    field2390[field2387++] = var236 % var237;
                    return;
                }
                if (arg0 == 4012) {
                    field2387 -= 2;
                    int var238 = field2390[field2387];
                    int var239 = field2390[field2387 + 1];
                    if (var238 == 0) {
                        field2390[field2387++] = 0;
                        return;
                    }
                    field2390[field2387++] = (int) Math.pow((double) var238, (double) var239);
                    return;
                }
                if (arg0 == 4013) {
                    field2387 -= 2;
                    int var240 = field2390[field2387];
                    int var241 = field2390[field2387 + 1];
                    if (var240 == 0) {
                        field2390[field2387++] = 0;
                        return;
                    }
                    if (var241 == 0) {
                        field2390[field2387++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2390[field2387++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                    return;
                }
                if (arg0 == 4014) {
                    field2387 -= 2;
                    int var242 = field2390[field2387];
                    int var243 = field2390[field2387 + 1];
                    field2390[field2387++] = var242 & var243;
                    return;
                }
                if (arg0 == 4015) {
                    field2387 -= 2;
                    int var244 = field2390[field2387];
                    int var245 = field2390[field2387 + 1];
                    field2390[field2387++] = var244 | var245;
                    return;
                }
                if (arg0 == 4016) {
                    field2387 -= 2;
                    int var246 = field2390[field2387];
                    int var247 = field2390[field2387 + 1];
                    field2390[field2387++] = var246 < var247 ? var246 : var247;
                    return;
                }
                if (arg0 == 4017) {
                    field2387 -= 2;
                    int var248 = field2390[field2387];
                    int var249 = field2390[field2387 + 1];
                    field2390[field2387++] = var248 > var249 ? var248 : var249;
                    return;
                }
                if (arg0 == 4018) {
                    field2387 -= 3;
                    long var250 = (long) field2390[field2387];
                    long var252 = (long) field2390[field2387 + 1];
                    long var254 = (long) field2390[field2387 + 2];
                    field2390[field2387++] = (int) (var250 * var254 / var252);
                    return;
                }
                if (arg0 == 4019) {
                    field2387 -= 2;
                    int var256 = field2390[field2387];
                    int var257 = field2390[field2387 + 1];
                    if (var256 > 700 || var257 > 700) {
                        field2390[field2387++] = 256;
                    }
                    double var258 = (Math.random() * (double) (var256 + var257) + 800.0D - (double) var256) / 100.0D;
                    field2390[field2387++] = (int) (Math.pow(2.0D, var258) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var260 = field2392[--field2386];
                    int var261 = field2390[--field2387];
                    field2392[field2386++] = var260 + var261;
                    return;
                }
                if (arg0 == 4101) {
                    field2386 -= 2;
                    String var262 = field2392[field2386];
                    String var263 = field2392[field2386 + 1];
                    field2392[field2386++] = var262 + var263;
                    return;
                }
                if (arg0 == 4102) {
                    String var264 = field2392[--field2386];
                    int var265 = field2390[--field2387];
                    field2392[field2386++] = var264 + class415.method2641(true, 121, var265);
                    return;
                }
                if (arg0 == 4103) {
                    String var266 = field2392[--field2386];
                    field2392[field2386++] = var266.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2392[field2386++] = method1202(field2390[--field2387]);
                    return;
                }
                if (arg0 == 4105) {
                    field2386 -= 2;
                    String var267 = field2392[field2386];
                    String var268 = field2392[field2386 + 1];
                    if (class567.field8141.field4778 != null && class567.field8141.field4778.field2418) {
                        field2392[field2386++] = var268;
                        return;
                    }
                    field2392[field2386++] = var267;
                    return;
                }
                if (arg0 == 4106) {
                    int var269 = field2390[--field2387];
                    field2392[field2386++] = Integer.toString(var269);
                    return;
                }
                if (arg0 == 4107) {
                    field2386 -= 2;
                    field2390[field2387++] = class3.method14(field2392[field2386], 123, class135.field2206, field2392[field2386 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var270 = field2392[--field2386];
                    field2387 -= 2;
                    int var271 = field2390[field2387];
                    int var272 = field2390[field2387 + 1];
                    class632 var273 = class613.method3567((byte) 75, 0, class51.field682, var272);
                    field2390[field2387++] = var273.method3674(var271, var270, class220.field3579, (byte) -86);
                    return;
                }
                if (arg0 == 4109) {
                    String var274 = field2392[--field2386];
                    field2387 -= 2;
                    int var275 = field2390[field2387];
                    int var276 = field2390[field2387 + 1];
                    class632 var277 = class613.method3567((byte) 125, 0, class51.field682, var276);
                    field2390[field2387++] = var277.method3669(0, class220.field3579, var274, var275);
                    return;
                }
                if (arg0 == 4110) {
                    field2386 -= 2;
                    String var278 = field2392[field2386];
                    String var279 = field2392[field2386 + 1];
                    if (field2390[--field2387] == 1) {
                        field2392[field2386++] = var278;
                        return;
                    }
                    field2392[field2386++] = var279;
                    return;
                }
                if (arg0 == 4111) {
                    String var280 = field2392[--field2386];
                    field2392[field2386++] = class333.method2311((byte) -82, var280);
                    return;
                }
                if (arg0 == 4112) {
                    String var281 = field2392[--field2386];
                    int var282 = field2390[--field2387];
                    if (var282 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2392[field2386++] = var281 + (char) var282;
                    return;
                }
                if (arg0 == 4113) {
                    int var283 = field2390[--field2387];
                    field2390[field2387++] = class663.method3799((char) var283, 45) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var284 = field2390[--field2387];
                    field2390[field2387++] = class531.method3211(-108, (char) var284) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var285 = field2390[--field2387];
                    field2390[field2387++] = class387.method2519(-91, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var286 = field2390[--field2387];
                    field2390[field2387++] = class508.method3085((char) var286, (byte) 102) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var287 = field2392[--field2386];
                    if (var287 != null) {
                        field2390[field2387++] = var287.length();
                        return;
                    }
                    field2390[field2387++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var288 = field2392[--field2386];
                    field2387 -= 2;
                    int var289 = field2390[field2387];
                    int var290 = field2390[field2387 + 1];
                    field2392[field2386++] = var288.substring(var289, var290);
                    return;
                }
                if (arg0 == 4119) {
                    String var291 = field2392[--field2386];
                    StringBuffer var292 = new StringBuffer(var291.length());
                    boolean var293 = false;
                    for (int var294 = 0; var294 < var291.length(); var294++) {
                        char var295 = var291.charAt(var294);
                        if (var295 == '<') {
                            var293 = true;
                        } else if (var295 == '>') {
                            var293 = false;
                        } else if (!var293) {
                            var292.append(var295);
                        }
                    }
                    field2392[field2386++] = var292.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var296 = field2392[--field2386];
                    field2387 -= 2;
                    int var297 = field2390[field2387];
                    int var298 = field2390[field2387 + 1];
                    field2390[field2387++] = var296.indexOf(var297, var298);
                    return;
                }
                if (arg0 == 4121) {
                    field2386 -= 2;
                    String var299 = field2392[field2386];
                    String var300 = field2392[field2386 + 1];
                    int var301 = field2390[--field2387];
                    field2390[field2387++] = var299.indexOf(var300, var301);
                    return;
                }
                if (arg0 == 4122) {
                    int var302 = field2390[--field2387];
                    field2390[field2387++] = Character.toLowerCase((char) var302);
                    return;
                }
                if (arg0 == 4123) {
                    int var303 = field2390[--field2387];
                    field2390[field2387++] = Character.toUpperCase((char) var303);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var304 = field2390[--field2387] != 0;
                    int var305 = field2390[--field2387];
                    field2392[field2386++] = class255.method1809((long) var305, var304, class135.field2206, 0, (byte) -104);
                    return;
                }
                if (arg0 == 4125) {
                    String var306 = field2392[--field2386];
                    int var307 = field2390[--field2387];
                    class632 var308 = class613.method3567((byte) 119, 0, class51.field682, var307);
                    field2390[field2387++] = var308.method3677(class220.field3579, (byte) -97, var306);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var309 = field2390[--field2387];
                    field2392[field2386++] = class91.field1083.method2859(var309, (byte) 125).field1869;
                    return;
                }
                if (arg0 == 4201) {
                    field2387 -= 2;
                    int var310 = field2390[field2387];
                    int var311 = field2390[field2387 + 1];
                    class117 var312 = class91.field1083.method2859(var310, (byte) 127);
                    if (var311 >= 1 && var311 <= 5 && var312.field1811[var311 - 1] != null) {
                        field2392[field2386++] = var312.field1811[var311 - 1];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2387 -= 2;
                    int var313 = field2390[field2387];
                    int var314 = field2390[field2387 + 1];
                    class117 var315 = class91.field1083.method2859(var313, (byte) 125);
                    if (var314 >= 1 && var314 <= 5 && var315.field1822[var314 - 1] != null) {
                        field2392[field2386++] = var315.field1822[var314 - 1];
                        return;
                    }
                    field2392[field2386++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var316 = field2390[--field2387];
                    field2390[field2387++] = class91.field1083.method2859(var316, (byte) 123).field1828;
                    return;
                }
                if (arg0 == 4204) {
                    int var317 = field2390[--field2387];
                    field2390[field2387++] = class91.field1083.method2859(var317, (byte) 123).field1845 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var318 = field2390[--field2387];
                    class117 var319 = class91.field1083.method2859(var318, (byte) 122);
                    if (var319.field1815 == -1 && var319.field1862 >= 0) {
                        field2390[field2387++] = var319.field1862;
                        return;
                    }
                    field2390[field2387++] = var318;
                    return;
                }
                if (arg0 == 4206) {
                    int var320 = field2390[--field2387];
                    class117 var321 = class91.field1083.method2859(var320, (byte) 126);
                    if (var321.field1815 >= 0 && var321.field1862 >= 0) {
                        field2390[field2387++] = var321.field1862;
                        return;
                    }
                    field2390[field2387++] = var320;
                    return;
                }
                if (arg0 == 4207) {
                    int var322 = field2390[--field2387];
                    field2390[field2387++] = class91.field1083.method2859(var322, (byte) 122).field1872 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2387 -= 2;
                    int var323 = field2390[field2387];
                    int var324 = field2390[field2387 + 1];
                    class638 var325 = class610.field8680.method3566(var324, -14724);
                    if (var325.method3707((byte) -121)) {
                        field2392[field2386++] = class91.field1083.method2859(var323, (byte) 124).method1055(var324, -99, var325.field8955);
                        return;
                    }
                    field2390[field2387++] = class91.field1083.method2859(var323, (byte) 127).method1054(var325.field8960, -2, var324);
                    return;
                }
                if (arg0 == 4209) {
                    field2387 -= 2;
                    int var326 = field2390[field2387];
                    int var327 = field2390[field2387 + 1] - 1;
                    class117 var328 = class91.field1083.method2859(var326, (byte) 122);
                    if (var328.field1856 == var327) {
                        field2390[field2387++] = var328.field1816;
                        return;
                    }
                    if (var328.field1857 == var327) {
                        field2390[field2387++] = var328.field1859;
                        return;
                    }
                    field2390[field2387++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var329 = field2392[--field2386];
                    int var330 = field2390[--field2387];
                    class675.method3866((byte) -75, var330 == 1, var329);
                    field2390[field2387++] = class661.field9221;
                    return;
                }
                if (arg0 == 4211) {
                    if (class649.field9098 != null && class589.field8379 < class661.field9221) {
                        field2390[field2387++] = class649.field9098[class589.field8379++] & 0xFFFF;
                        return;
                    }
                    field2390[field2387++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class589.field8379 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var331 = field2390[--field2387];
                    field2390[field2387++] = class91.field1083.method2859(var331, (byte) 126).field1842;
                    return;
                }
                if (arg0 == 4214) {
                    String var332 = field2392[--field2386];
                    field2387 -= 3;
                    int var333 = field2390[field2387];
                    int var334 = field2390[field2387 + 1];
                    int var335 = field2390[field2387 + 2];
                    class15.method201(var332, 112, var335, var333 == 1, var334);
                    field2390[field2387++] = class661.field9221;
                    return;
                }
                if (arg0 == 4215) {
                    field2386 -= 2;
                    field2387 -= 2;
                    String var336 = field2392[field2386];
                    int var337 = field2390[field2387];
                    int var338 = field2390[field2387 + 1];
                    String var339 = field2392[field2386 + 1];
                    class606.method3530(var339, -29374, var338, var336, var337 == 1);
                    field2390[field2387++] = class661.field9221;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2387 -= 2;
                    int var340 = field2390[field2387];
                    int var341 = field2390[field2387 + 1];
                    class638 var342 = class610.field8680.method3566(var341, -14724);
                    if (var342.method3707((byte) -121)) {
                        field2392[field2386++] = class538.field7860.method3224(var340, 50).method3979(-15061, var341, var342.field8955);
                        return;
                    }
                    field2390[field2387++] = class538.field7860.method3224(var340, 50).method3980(var341, var342.field8960, (byte) 70);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2387 -= 2;
                    int var343 = field2390[field2387];
                    int var344 = field2390[field2387 + 1];
                    class638 var345 = class610.field8680.method3566(var344, -14724);
                    if (var345.method3707((byte) -121)) {
                        field2392[field2386++] = class213.field3537.method94(var343, (byte) -42).method3938(var345.field8955, (byte) 75, var344);
                        return;
                    }
                    field2390[field2387++] = class213.field3537.method94(var343, (byte) -42).method3932(var344, var345.field8960, true);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2387 -= 2;
                    int var346 = field2390[field2387];
                    int var347 = field2390[field2387 + 1];
                    class638 var348 = class610.field8680.method3566(var347, -14724);
                    if (var348.method3707((byte) -121)) {
                        field2392[field2386++] = class243.field3854.method2532(var346, (byte) -124).method725(var348.field8955, var347, (byte) 117);
                        return;
                    }
                    field2390[field2387++] = class243.field3854.method2532(var346, (byte) 98).method730(3, var348.field8960, var347);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var349 = field2390[--field2387];
                class642 var350 = class472.field6988.method2674(-89, var349);
                if (var350.field9039 != null && var350.field9039.length > 0) {
                    int var351 = 0;
                    int var352 = var350.field9014[0];
                    for (int var353 = 1; var353 < var350.field9039.length; var353++) {
                        if (var350.field9014[var353] > var352) {
                            var351 = var353;
                            var352 = var350.field9014[var353];
                        }
                    }
                    field2390[field2387++] = var350.field9039[var351];
                    return;
                }
                field2390[field2387++] = var350.field9045;
                return;
            }
        } else {
            class665 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class326.method2197(false, field2390[--field2387]);
            } else {
                var50 = arg1 ? field2380 : field2375;
            }
            if (arg0 == 1300) {
                int var51 = field2390[--field2387] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method3822((byte) 22, var51, field2392[--field2386]);
                    return;
                }
                field2386--;
                return;
            }
            if (arg0 == 1301) {
                field2387 -= 2;
                int var52 = field2390[field2387];
                int var53 = field2390[field2387 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field9403 = null;
                    return;
                }
                var50.field9403 = class626.method3656(28613, var52, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field2390[--field2387];
                if (class239.field3785 != var54 && class221.field3592 != var54 && class668.field9450 != var54) {
                    return;
                }
                var50.field9265 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field9273 = field2390[--field2387];
                return;
            }
            if (arg0 == 1304) {
                var50.field9364 = field2390[--field2387];
                return;
            }
            if (arg0 == 1305) {
                var50.field9342 = field2392[--field2386];
                return;
            }
            if (arg0 == 1306) {
                var50.field9303 = field2392[--field2386];
                return;
            }
            if (arg0 == 1307) {
                var50.field9327 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field9339 = field2390[--field2387];
                var50.field9340 = field2390[--field2387];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field2390[--field2387];
                int var56 = field2390[--field2387];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method3815(var55, 0, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field9390 = field2392[--field2386];
                return;
            }
            if (arg0 == 1311) {
                var50.field9377 = field2390[--field2387];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field2387 -= 3;
                    var57 = field2390[field2387] - 1;
                    var58 = field2390[field2387 + 1];
                    var59 = field2390[field2387 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2387 -= 2;
                    var57 = 10;
                    var58 = field2390[field2387];
                    var59 = field2390[field2387 + 1];
                }
                if (var50.field9271 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field9271 = new byte[11];
                    var50.field9420 = new byte[11];
                    var50.field9382 = new int[11];
                }
                var50.field9271[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field9330 = false;
                    for (int var60 = 0; var60 < var50.field9271.length; var60++) {
                        if (var50.field9271[var60] != 0) {
                            var50.field9330 = true;
                            break;
                        }
                    }
                } else {
                    var50.field9330 = true;
                }
                var50.field9420[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field9335 = field2390[--field2387];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljo;II)V")
    public static final void method1213(class307 arg0, int arg1, int arg2) {
        class417 var3 = class189.method1522(arg1, arg2, 30, arg0);
        if (var3 == null) {
            return;
        }
        field2371 = new int[var3.field6382];
        field2379 = new String[var3.field6380];
        if (class588.field8353 == var3.field6384 || class574.field8186 == var3.field6384 || class597.field8454 == var3.field6384) {
            int var4 = 0;
            int var5 = 0;
            if (class260.field4160 != null) {
                var4 = class260.field4160.field9301;
                var5 = class260.field4160.field9402;
            }
            field2371[0] = class464.field6929.method451(1196) - var4;
            field2371[1] = class464.field6929.method454(50) - var5;
        }
        method1205(var3, 200000);
    }
}
