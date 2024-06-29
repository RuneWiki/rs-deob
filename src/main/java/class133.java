import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class133 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    private static int[] field1491 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field1496 = new String[1000];

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private static int field1490 = 0;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private static int field1501 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lpu;")
    private static class560[] field1488 = new class560[50];

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "[[I")
    private static int[][] field1509 = new int[5][5000];

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
    private static int[] field1499 = new int[5];

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    private static int field1510 = 0;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1497 = Calendar.getInstance();

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "[I")
    private static int[] field1512 = new int[3];

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field1511 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lof;")
    public static class620 field1513 = new class620(4);

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    private static int field1514 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lwu;")
    private static class371 field1498;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Ltp;")
    private static class532 field1492;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Ltp;")
    private static class532 field1494;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    private static int[] field1489;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field1500;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 7)
    private static final void method847(int arg0) {
        class532 var1 = class269.method1608((byte) -72, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class532[] var3 = class286.field3496[var2];
        if (var3 == null) {
            class532[] var4 = class643.field9209[var2];
            int var5 = var4.length;
            var3 = class286.field3496[var2] = new class532[var5];
            class143.method892(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class143.method892(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V", line = 46)
    private static final void method848(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1491[field1490++] = class740.field10346;
                return;
            }
            if (arg0 == 5001) {
                field1490 -= 3;
                class740.field10346 = field1491[field1490];
                class621.field8891 = class225.method1306(field1491[field1490 + 1], 0);
                if (class621.field8891 == null) {
                    class621.field8891 = class340.field4391;
                }
                class630.field9058 = field1491[field1490 + 2];
                field1502++;
                class249 var2 = class289.method1715(class720.field10093, 91, class41.field470);
                var2.field3016.method1460(class740.field10346, 24710);
                var2.field3016.method1460(class621.field8891.field10122, 24710);
                var2.field3016.method1460(class630.field9058, 24710);
                class510.method3017(var2, 66);
                return;
            }
            if (arg0 == 5002) {
                field1501 -= 2;
                String var3 = field1496[field1501];
                String var4 = field1496[field1501 + 1];
                field1490 -= 2;
                int var5 = field1491[field1490];
                int var6 = field1491[field1490 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field1487++;
                class249 var7 = class289.method1715(class678.field9606, 104, class41.field470);
                var7.field3016.method1460(class729.method4063(-1, var3) + class729.method4063(-1, var4) + 2, 24710);
                var7.field3016.method1480(var3, false);
                var7.field3016.method1460(var5 - 1, 24710);
                var7.field3016.method1460(var6, 24710);
                var7.field3016.method1480(var4, false);
                class510.method3017(var7, 72);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field1491[--field1490];
                class265 var9 = class309.method1842(19, var8);
                String var10 = "";
                if (var9 != null && var9.field3298 != null) {
                    var10 = var9.field3298;
                }
                field1496[field1501++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field1491[--field1490];
                class265 var12 = class309.method1842(19, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field3294;
                }
                field1491[field1490++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class621.field8891 == null) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = class621.field8891.field10122;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field1491[--field1490];
                class249 var15 = class289.method1715(class224.field2569, 66, class41.field470);
                var15.field3016.method1460(var14, 24710);
                class510.method3017(var15, 120);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field1496[--field1501];
                method849(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1501 -= 2;
                String var17 = field1496[field1501];
                String var18 = field1496[field1501 + 1];
                if (class58.field594 != 0 || (!class603.field8592 || class85.field900) && !class550.field7899) {
                    field1506++;
                    class249 var19 = class289.method1715(class6.field41, 116, class41.field470);
                    var19.field3016.method1460(0, 24710);
                    int var20 = var19.field3016.field2903;
                    var19.field3016.method1480(var17, false);
                    class122.method783(0, var19.field3016, var18);
                    var19.field3016.method1434(127, var19.field3016.field2903 - var20);
                    class510.method3017(var19, 58);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field1491[--field1490];
                class265 var22 = class309.method1842(19, var21);
                String var23 = "";
                if (var22 != null && var22.field3296 != null) {
                    var23 = var22.field3296;
                }
                field1496[field1501++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field1491[--field1490];
                class265 var25 = class309.method1842(19, var24);
                String var26 = "";
                if (var25 != null && var25.field3293 != null) {
                    var26 = var25.field3293;
                }
                field1496[field1501++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field1491[--field1490];
                class265 var28 = class309.method1842(19, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field3290;
                }
                field1491[field1490++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class90.field937 == null || class90.field937.field2161 == null) {
                    var30 = "";
                } else {
                    var30 = class90.field937.method1129(true, -2);
                }
                field1496[field1501++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field1491[field1490++] = class630.field9058;
                return;
            }
            if (arg0 == 5017) {
                field1491[field1490++] = class751.method4185(3617364);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field1491[--field1490];
                class265 var32 = class309.method1842(19, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field3295;
                }
                field1491[field1490++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field1491[--field1490];
                class265 var35 = class309.method1842(19, var34);
                String var36 = "";
                if (var35 != null && var35.field3288 != null) {
                    var36 = var35.field3288;
                }
                field1496[field1501++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class90.field937 == null || class90.field937.field2161 == null) {
                    var37 = "";
                } else {
                    var37 = class90.field937.method1133(false, 0);
                }
                field1496[field1501++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field1491[--field1490];
                class265 var39 = class309.method1842(19, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field3291;
                }
                field1491[field1490++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field1491[--field1490];
                class265 var42 = class309.method1842(19, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field3299;
                }
                field1491[field1490++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field1491[--field1490];
                class265 var45 = class309.method1842(19, var44);
                String var46 = "";
                if (var45 != null && var45.field3302 != null) {
                    var46 = var45.field3302;
                }
                field1496[field1501++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field1491[--field1490];
                field1496[field1501++] = class314.field3922.method2392(32768, var47).field7411;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field1491[--field1490];
                class521 var49 = class314.field3922.method2392(32768, var48);
                if (var49.field7421 == null) {
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = var49.field7421.length;
                return;
            }
            if (arg0 == 5052) {
                field1490 -= 2;
                int var50 = field1491[field1490];
                int var51 = field1491[field1490 + 1];
                class521 var52 = class314.field3922.method2392(32768, var50);
                int var53 = var52.field7421[var51];
                field1491[field1490++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field1491[--field1490];
                class521 var55 = class314.field3922.method2392(32768, var54);
                if (var55.field7416 == null) {
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = var55.field7416.length;
                return;
            }
            if (arg0 == 5054) {
                field1490 -= 2;
                int var56 = field1491[field1490];
                int var57 = field1491[field1490 + 1];
                field1491[field1490++] = class314.field3922.method2392(32768, var56).field7416[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field1491[--field1490];
                field1496[field1501++] = class3.field18.method4058(var58, (byte) 82).method2040(84);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field1491[--field1490];
                class343 var60 = class3.field18.method4058(var59, (byte) 82);
                if (var60.field4451 == null) {
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = var60.field4451.length;
                return;
            }
            if (arg0 == 5057) {
                field1490 -= 2;
                int var61 = field1491[field1490];
                int var62 = field1491[field1490 + 1];
                field1491[field1490++] = class3.field18.method4058(var61, (byte) 82).field4451[var62];
                return;
            }
            if (arg0 == 5058) {
                field1498 = new class371();
                field1498.field4748 = field1491[--field1490];
                field1498.field4750 = class3.field18.method4058(field1498.field4748, (byte) 82);
                field1498.field4749 = new int[field1498.field4750.method2042(47)];
                return;
            }
            if (arg0 == 5059) {
                field1505++;
                class249 var63 = class289.method1715(class341.field4410, 79, class41.field470);
                var63.field3016.method1460(0, 24710);
                int var64 = var63.field3016.field2903;
                var63.field3016.method1460(0, 24710);
                var63.field3016.method1446(field1498.field4748, true);
                field1498.field4750.method2041(var63.field3016, -32, field1498.field4749);
                var63.field3016.method1434(112, var63.field3016.field2903 - var64);
                class510.method3017(var63, 70);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field1496[--field1501];
                field1486++;
                class249 var66 = class289.method1715(class35.field381, 122, class41.field470);
                var66.field3016.method1460(0, 24710);
                int var67 = var66.field3016.field2903;
                var66.field3016.method1480(var65, false);
                var66.field3016.method1446(field1498.field4748, true);
                field1498.field4750.method2041(var66.field3016, -74, field1498.field4749);
                var66.field3016.method1434(116, var66.field3016.field2903 - var67);
                class510.method3017(var66, 78);
                return;
            }
            if (arg0 == 5061) {
                field1505++;
                class249 var68 = class289.method1715(class341.field4410, 48, class41.field470);
                var68.field3016.method1460(0, 24710);
                int var69 = var68.field3016.field2903;
                var68.field3016.method1460(1, 24710);
                var68.field3016.method1446(field1498.field4748, true);
                field1498.field4750.method2041(var68.field3016, -94, field1498.field4749);
                var68.field3016.method1434(121, var68.field3016.field2903 - var69);
                class510.method3017(var68, 123);
                return;
            }
            if (arg0 == 5062) {
                field1490 -= 2;
                int var70 = field1491[field1490];
                int var71 = field1491[field1490 + 1];
                field1491[field1490++] = class314.field3922.method2392(32768, var70).field7412[var71];
                return;
            }
            if (arg0 == 5063) {
                field1490 -= 2;
                int var72 = field1491[field1490];
                int var73 = field1491[field1490 + 1];
                field1491[field1490++] = class314.field3922.method2392(32768, var72).field7413[var73];
                return;
            }
            if (arg0 == 5064) {
                field1490 -= 2;
                int var74 = field1491[field1490];
                int var75 = field1491[field1490 + 1];
                if (var75 == -1) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = class314.field3922.method2392(32768, var74).method3063((char) var75, -18817);
                return;
            }
            if (arg0 == 5065) {
                field1490 -= 2;
                int var76 = field1491[field1490];
                int var77 = field1491[field1490 + 1];
                if (var77 == -1) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = class314.field3922.method2392(32768, var76).method3059((byte) -104, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field1491[--field1490];
                field1491[field1490++] = class3.field18.method4058(var78, (byte) 82).method2042(50);
                return;
            }
            if (arg0 == 5067) {
                field1490 -= 2;
                int var79 = field1491[field1490];
                int var80 = field1491[field1490 + 1];
                int var81 = class3.field18.method4058(var79, (byte) 82).method2048(var80, -31814).field2093;
                field1491[field1490++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field1490 -= 2;
                int var82 = field1491[field1490];
                int var83 = field1491[field1490 + 1];
                field1498.field4749[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field1490 -= 2;
                int var84 = field1491[field1490];
                int var85 = field1491[field1490 + 1];
                field1498.field4749[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field1490 -= 3;
                int var86 = field1491[field1490];
                int var87 = field1491[field1490 + 1];
                int var88 = field1491[field1490 + 2];
                class343 var89 = class3.field18.method4058(var86, (byte) 82);
                if (var89.method2048(var87, -31814).field2093 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1491[field1490++] = var89.method2046(0, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field1496[--field1501];
                boolean var91 = field1491[--field1490] == 1;
                class263.method1585(var91, var90, -76);
                field1491[field1490++] = class605.field8607;
                return;
            }
            if (arg0 == 5072) {
                if (class406.field5552 != null && class707.field9972 < class605.field8607) {
                    field1491[field1490++] = class406.field5552[class707.field9972++] & 0xFFFF;
                    return;
                }
                field1491[field1490++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class707.field9972 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class375.field4818.method1657(86, (byte) -40)) {
                    field1491[field1490++] = 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class375.field4818.method1657(82, (byte) -40)) {
                    field1491[field1490++] = 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class375.field4818.method1657(81, (byte) -40)) {
                    field1491[field1490++] = 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class413.method2526(field1491[--field1490], -34);
                return;
            }
            if (arg0 == 5201) {
                field1491[field1490++] = class353.method2087(-22528);
                return;
            }
            if (arg0 == 5205) {
                class714.method3994(-1, 87, field1491[--field1490], -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field1491[--field1490];
                class92 var93 = class656.method3739(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = var93.field957;
                return;
            }
            if (arg0 == 5207) {
                class92 var94 = class656.method3732(field1491[--field1490]);
                if (var94 != null && var94.field964 != null) {
                    field1496[field1501++] = var94.field964;
                    return;
                }
                field1496[field1501++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1491[field1490++] = class588.field8300;
                field1491[field1490++] = class706.field9956;
                return;
            }
            if (arg0 == 5209) {
                field1491[field1490++] = class656.field9386 + class30.field352;
                field1491[field1490++] = class656.field9374 + class116.field1211;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field1491[--field1490];
                class92 var96 = class656.method3732(var95);
                if (var96 == null) {
                    field1491[field1490++] = 0;
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = var96.field949 >> 14 & 0x3FFF;
                field1491[field1490++] = var96.field949 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field1491[--field1490];
                class92 var98 = class656.method3732(var97);
                if (var98 == null) {
                    field1491[field1490++] = 0;
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = var98.field950 - var98.field961;
                field1491[field1490++] = var98.field963 - var98.field953;
                return;
            }
            if (arg0 == 5212) {
                class191 var99 = class593.method3392(83);
                if (var99 == null) {
                    field1491[field1490++] = -1;
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = var99.field2252;
                int var100 = var99.field2254 << 28 | class656.field9386 + var99.field2251 << 14 | class656.field9374 + var99.field2256;
                field1491[field1490++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class191 var101 = class584.method3355(1);
                if (var101 == null) {
                    field1491[field1490++] = -1;
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = var101.field2252;
                int var102 = var101.field2254 << 28 | class656.field9386 + var101.field2251 << 14 | class656.field9374 + var101.field2256;
                field1491[field1490++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field1491[--field1490];
                class92 var104 = class469.method2835(124);
                if (var104 != null) {
                    boolean var105 = var104.method624(var103 >> 28 & 0x3, 8, var103 >> 14 & 0x3FFF, var103 & 0x3FFF, field1512);
                    if (var105) {
                        class697.method3921(false, field1512[1], field1512[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1490 -= 2;
                int var106 = field1491[field1490];
                int var107 = field1491[field1490 + 1];
                class347 var108 = class656.method3730(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class92 var110 = (class92) var108.method2067(22462); var110 != null; var110 = (class92) var108.method2066(0)) {
                    if (var110.field957 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field1491[field1490++] = 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field1491[--field1490];
                class92 var112 = class656.method3732(var111);
                if (var112 == null) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = var112.field946;
                return;
            }
            if (arg0 == 5220) {
                field1491[field1490++] = class284.field3471 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field1491[--field1490];
                class697.method3921(false, var113 >> 14 & 0x3FFF, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class92 var114 = class469.method2835(112);
                if (var114 != null) {
                    boolean var115 = var114.method620(class656.field9374 + class116.field1211, field1512, class656.field9386 + class30.field352, true);
                    if (var115) {
                        field1491[field1490++] = field1512[1];
                        field1491[field1490++] = field1512[2];
                        return;
                    }
                    field1491[field1490++] = -1;
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = -1;
                field1491[field1490++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1490 -= 2;
                int var116 = field1491[field1490];
                int var117 = field1491[field1490 + 1];
                class714.method3994(var117 >> 14 & 0x3FFF, 50, var116, var117 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field1491[--field1490];
                class92 var119 = class469.method2835(127);
                if (var119 != null) {
                    boolean var120 = var119.method624(var118 >> 28 & 0x3, 8, var118 >> 14 & 0x3FFF, var118 & 0x3FFF, field1512);
                    if (var120) {
                        field1491[field1490++] = field1512[1];
                        field1491[field1490++] = field1512[2];
                        return;
                    }
                    field1491[field1490++] = -1;
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = -1;
                field1491[field1490++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field1491[--field1490];
                class92 var122 = class469.method2835(126);
                if (var122 != null) {
                    boolean var123 = var122.method620(var121 & 0x3FFF, field1512, var121 >> 14 & 0x3FFF, true);
                    if (var123) {
                        field1491[field1490++] = field1512[1];
                        field1491[field1490++] = field1512[2];
                        return;
                    }
                    field1491[field1490++] = -1;
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = -1;
                field1491[field1490++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class626.method3591(false, field1491[--field1490]);
                return;
            }
            if (arg0 == 5227) {
                field1490 -= 2;
                int var124 = field1491[field1490];
                int var125 = field1491[field1490 + 1];
                class714.method3994(var125 >> 14 & 0x3FFF, 127, var124, var125 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class484.field6881 = field1491[--field1490] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1491[field1490++] = class484.field6881 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field1491[--field1490];
                class100.method696(100, var126);
                return;
            }
            if (arg0 == 5231) {
                field1490 -= 2;
                int var127 = field1491[field1490];
                boolean var128 = field1491[field1490 + 1] == 1;
                if (class101.field1046 != null) {
                    class134 var129 = class101.field1046.method1754(false, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method864(12983);
                        return;
                    }
                    if (var129 == null && var128) {
                        class134 var130 = new class134();
                        class101.field1046.method1751(var130, 3970, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field1491[--field1490];
                if (class101.field1046 != null) {
                    class134 var132 = class101.field1046.method1754(false, (long) var131);
                    field1491[field1490++] = var132 == null ? 0 : 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1490 -= 2;
                int var133 = field1491[field1490];
                boolean var134 = field1491[field1490 + 1] == 1;
                if (class541.field7782 != null) {
                    class134 var135 = class541.field7782.method1754(false, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method864(12983);
                        return;
                    }
                    if (var135 == null && var134) {
                        class134 var136 = new class134();
                        class541.field7782.method1751(var136, 3970, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field1491[--field1490];
                if (class541.field7782 != null) {
                    class134 var138 = class541.field7782.method1754(false, (long) var137);
                    field1491[field1490++] = var138 == null ? 0 : 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1491[field1490++] = class656.field9357 == null ? -1 : class656.field9357.field957;
                return;
            }
            if (arg0 == 5236) {
                field1490 -= 2;
                int var139 = field1491[field1490];
                int var140 = field1491[field1490 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class180.method1111(var139, var142, (byte) 76, var141);
                if (var143 < 0) {
                    field1491[field1490++] = -1;
                    return;
                }
                field1491[field1490++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class372.method2164(11);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1490 -= 2;
                int var144 = field1491[field1490];
                int var145 = field1491[field1490 + 1];
                class191.method1162(var144, var145, (byte) 126, 3, false);
                field1491[field1490++] = class370.field4740 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class370.field4740 != null) {
                    class191.method1162(-1, -1, (byte) 124, class654.field9334.field9843.method2453(58), false);
                }
                return;
            }
            if (arg0 == 5302) {
                class440[] var146 = class699.method3934(false);
                field1491[field1490++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field1491[--field1490];
                class440[] var148 = class699.method3934(false);
                field1491[field1490++] = var148[var147].field6388;
                field1491[field1490++] = var148[var147].field6382;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class97.field1019;
                int var150 = class249.field3017;
                int var151 = -1;
                class440[] var152 = class699.method3934(false);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class440 var154 = var152[var153];
                    if (var154.field6388 == var149 && var154.field6382 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field1491[field1490++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field1491[field1490++] = class735.method4098(false);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field1491[--field1490];
                if (var155 >= 1 && var155 <= 2) {
                    class191.method1162(-1, -1, (byte) 125, var155, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1491[field1490++] = class654.field9334.field9843.method2453(5);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field1491[--field1490];
                if (var156 >= 1 && var156 <= 2) {
                    class654.field9334.method3924(true, class654.field9334.field9843, var156);
                    class654.field9334.method3924(true, class654.field9334.field9846, var156);
                    class37.method168((byte) 114);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1501 -= 2;
                String var157 = field1496[field1501];
                String var158 = field1496[field1501 + 1];
                int var159 = field1491[--field1490];
                field1504++;
                class249 var160 = class289.method1715(class376.field4833, 113, class41.field470);
                var160.field3016.method1460(class729.method4063(-1, var157) + class729.method4063(-1, var158) + 1, 24710);
                var160.field3016.method1480(var157, false);
                var160.field3016.method1480(var158, false);
                var160.field3016.method1460(var159, 24710);
                class510.method3017(var160, 68);
                return;
            }
            if (arg0 == 5401) {
                field1490 -= 2;
                class221.field2547[field1491[field1490]] = (short) class301.method1802(field1491[field1490 + 1], (byte) -6);
                class361.field4643.method906(16246);
                class361.field4643.method909(0);
                class451.field6506.method137(true);
                class486.method2933(true);
                return;
            }
            if (arg0 == 5405) {
                field1490 -= 2;
                int var161 = field1491[field1490];
                int var162 = field1491[field1490 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class622.field8916[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1490 -= 7;
                int var163 = field1491[field1490];
                int var164 = field1491[field1490 + 1] << 1;
                int var165 = field1491[field1490 + 2];
                int var166 = field1491[field1490 + 3];
                int var167 = field1491[field1490 + 4];
                int var168 = field1491[field1490 + 5];
                int var169 = field1491[field1490 + 6];
                if (var163 >= 0 && var163 < 2 && class622.field8916[var163] != null && var164 >= 0 && var164 < class622.field8916[var163].length) {
                    class622.field8916[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class622.field8916[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class622.field8916[field1491[--field1490]].length >> 1;
                field1491[field1490++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class370.field4740 != null) {
                    class191.method1162(-1, -1, (byte) 126, class654.field9334.field9843.method2453(-125), false);
                }
                if (class537.field7761 != null) {
                    class523.method3074(false);
                    System.exit(0);
                    return;
                }
                String var171 = class115.field1204 == null ? class743.method4135(-47) : class115.field1204;
                class461.method2810(class289.field3549, -9, var171, false, class654.field9334.field9850.method1512(105) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class348.field4495 != null) {
                    if (class348.field4495.field3577 == null) {
                        var172 = class604.method3430(-22671, class348.field4495.field3578);
                    } else {
                        var172 = (String) class348.field4495.field3577;
                    }
                }
                field1496[field1501++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field1491[field1490++] = class289.field3549.field7851 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class370.field4740 != null) {
                    class191.method1162(-1, -1, (byte) 124, class654.field9334.field9843.method2453(-124), false);
                }
                String var173 = field1496[--field1501];
                boolean var174 = field1491[--field1490] == 1;
                String var175 = class743.method4135(-87) + var173;
                class461.method2810(class289.field3549, -9, var175, var174, class654.field9334.field9850.method1512(119) == 1);
                return;
            }
            if (arg0 == 5422) {
                field1501 -= 2;
                String var176 = field1496[field1501];
                String var177 = field1496[field1501 + 1];
                int var178 = field1491[--field1490];
                if (var176.length() > 0) {
                    if (class359.field4593 == null) {
                        class359.field4593 = new String[class262.field3258[class99.field1034.field3752]];
                    }
                    class359.field4593[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class556.field7968 == null) {
                        class556.field7968 = new String[class262.field3258[class99.field1034.field3752]];
                    }
                    class556.field7968[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1496[--field1501]);
                return;
            }
            if (arg0 == 5424) {
                field1490 -= 11;
                class275.field3369 = field1491[field1490];
                class738.field10316 = field1491[field1490 + 1];
                class578.field8173 = field1491[field1490 + 2];
                class331.field4297 = field1491[field1490 + 3];
                class261.field3242 = field1491[field1490 + 4];
                class608.field8641 = field1491[field1490 + 5];
                class222.field2549 = field1491[field1490 + 6];
                class660.field9426 = field1491[field1490 + 7];
                class22.field204 = field1491[field1490 + 8];
                class697.field9813 = field1491[field1490 + 9];
                class12.field98 = field1491[field1490 + 10];
                class394.field5410.method2463((byte) 97, class261.field3242);
                class394.field5410.method2463((byte) 102, class608.field8641);
                class394.field5410.method2463((byte) 120, class222.field2549);
                class394.field5410.method2463((byte) 120, class660.field9426);
                class394.field5410.method2463((byte) 93, class22.field204);
                class557.field7978 = null;
                class22.field200 = null;
                class525.field7490 = null;
                class286.field3511 = null;
                class743.field10379 = null;
                class309.field3842 = null;
                class327.field4243 = null;
                class675.field9564 = null;
                class644.field9214 = true;
                return;
            }
            if (arg0 == 5425) {
                class300.method1773(-9);
                class644.field9214 = false;
                return;
            }
            if (arg0 == 5426) {
                field1490 -= 2;
                class627.field9012 = field1491[field1490];
                class472.field6761 = field1491[field1490 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1490 -= 2;
                class634.field9125 = field1491[field1490 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1490 -= 2;
                int var179 = field1491[field1490];
                int var180 = field1491[field1490 + 1];
                field1491[field1490++] = class110.method748(var179, var180, 48) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class132.method827(false, false, (byte) 52, field1496[--field1501]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class393.method2415("accountcreated", 105, class255.field3123);
                    return;
                } catch (Throwable var323) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class393.method2415("accountcreatestarted", 99, class255.field3123);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class667.field9489 != null) {
                    Transferable var182 = class667.field9489.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var325) {
                        }
                    }
                }
                field1496[field1501++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class689.field9718 = field1491[--field1490];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1490 -= 4;
                int var183 = field1491[field1490];
                int var184 = field1491[field1490 + 1];
                int var185 = field1491[field1490 + 2];
                int var186 = field1491[field1490 + 3];
                class313.method1859(var185, var186, (var183 & 0x3FFF) - class181.field2144, true, var184 << 2, false, (var183 >> 14 & 0x3FFF) - class464.field6624);
                return;
            }
            if (arg0 == 5501) {
                field1490 -= 4;
                int var187 = field1491[field1490];
                int var188 = field1491[field1490 + 1];
                int var189 = field1491[field1490 + 2];
                int var190 = field1491[field1490 + 3];
                class465.method2825(var188 << 2, 2, var189, (var187 >> 14 & 0x3FFF) - class464.field6624, (var187 & 0x3FFF) - class181.field2144, var190);
                return;
            }
            if (arg0 == 5502) {
                field1490 -= 6;
                int var191 = field1491[field1490];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class242.field2882 = var191;
                int var192 = field1491[field1490 + 1];
                if (var192 + 1 >= class622.field8916[class242.field2882].length >> 1) {
                    throw new RuntimeException();
                }
                class535.field7742 = var192;
                class102.field1059 = 0;
                class624.field8956 = field1491[field1490 + 2];
                class34.field365 = field1491[field1490 + 3];
                int var193 = field1491[field1490 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class125.field1312 = var193;
                int var194 = field1491[field1490 + 5];
                if (var194 + 1 >= class622.field8916[class125.field1312].length >> 1) {
                    throw new RuntimeException();
                }
                class407.field5572 = var194;
                class496.field7014 = 3;
                class406.field5556 = -1;
                class16.field147 = -1;
                return;
            }
            if (arg0 == 5503) {
                class608.method3445(-63);
                return;
            }
            if (arg0 == 5504) {
                field1490 -= 2;
                class655.method3718(-12688, field1491[field1490 + 1], field1491[field1490], 0);
                return;
            }
            if (arg0 == 5505) {
                field1491[field1490++] = (int) class308.field3835 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1491[field1490++] = (int) class227.field2590 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class604.method3433(false);
                return;
            }
            if (arg0 == 5508) {
                class356.method2096(0);
                return;
            }
            if (arg0 == 5509) {
                class117.method767((byte) 1);
                return;
            }
            if (arg0 == 5510) {
                class231.method1342(8221);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field1491[--field1490];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class464.field6624;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class489.field6976) {
                    var198 = class489.field6976;
                }
                int var199 = var197 - class181.field2144;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class153.field1677) {
                    var199 = class153.field1677;
                }
                class175.field2062 = (var198 << 9) + 256;
                class246.field2994 = (var199 << 9) + 256;
                class496.field7014 = 4;
                class406.field5556 = -1;
                class16.field147 = -1;
                return;
            }
            if (arg0 == 5512) {
                class416.method2542((byte) 79);
                return;
            }
            if (arg0 == 5514) {
                class586.field8269 = field1491[--field1490];
                return;
            }
            if (arg0 == 5516) {
                field1491[field1490++] = class586.field8269;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field1491[--field1490];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class464.field6624;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class489.field6976) {
                        var203 = class489.field6976;
                    }
                    int var204 = var202 - class181.field2144;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class153.field1677) {
                        var204 = class153.field1677;
                    }
                    class16.field147 = (var203 << 9) + 256;
                    class406.field5556 = (var204 << 9) + 256;
                    return;
                }
                class16.field147 = -1;
                class406.field5556 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1501 -= 2;
                String var205 = field1496[field1501];
                String var206 = field1496[field1501 + 1];
                int var207 = field1491[--field1490];
                if (var205.length() > 320) {
                    return;
                }
                if (class392.field5397 != 3) {
                    return;
                }
                if (class461.field6567 == 0 && class71.field746 == 0) {
                    class411.field5619 = var205;
                    class80.field835 = var206;
                    class126.field1328 = var207;
                    class313.method1860(true, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class514.method3035((byte) -118);
                return;
            }
            if (arg0 == 5602) {
                if (class461.field6567 == 0) {
                    class676.field9567 = -2;
                    class122.field1266 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field1501--;
                if (class392.field5397 != 3) {
                    return;
                }
                if (class461.field6567 == 0 && class71.field746 == 0) {
                    class331.method1981(field1496[field1501], (byte) 124);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1501 -= 2;
                field1490 -= 2;
                if (class392.field5397 != 3) {
                    return;
                }
                if (class461.field6567 == 0 && class71.field746 == 0) {
                    class371.method2162(field1496[field1501 + 1], field1491[field1490], (byte) 45, field1491[field1490 + 1] == 1, field1496[field1501]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class71.field746 == 0) {
                    class77.field812 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1491[field1490++] = class122.field1266;
                return;
            }
            if (arg0 == 5608) {
                field1491[field1490++] = class729.field10198;
                return;
            }
            if (arg0 == 5609) {
                field1491[field1490++] = class77.field812;
                return;
            }
            if (arg0 == 5611) {
                field1491[field1490++] = class434.field6339;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field1491[--field1490];
                if (class392.field5397 != 7) {
                    return;
                }
                if (class461.field6567 == 0 && class71.field746 == 0) {
                    if (class751.field10504 != null) {
                        class751.field10504.method1691(101);
                        class751.field10504 = null;
                    }
                    class126.field1328 = var208;
                    class313.method1860(true, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1491[field1490++] = class122.field1266;
                return;
            }
            if (arg0 == 5615) {
                field1501 -= 2;
                String var209 = field1496[field1501];
                String var210 = field1496[field1501 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class392.field5397 != 3) {
                    return;
                }
                if (class461.field6567 == 0 && class71.field746 == 0) {
                    if (class751.field10504 != null) {
                        class751.field10504.method1691(43);
                        class751.field10504 = null;
                    }
                    class411.field5619 = var209;
                    class80.field835 = var210;
                    class313.method1860(true, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class7.method25(false, (byte) 106);
                return;
            }
            if (arg0 == 5617) {
                field1491[field1490++] = class676.field9567;
                return;
            }
            if (arg0 == 5618) {
                field1490--;
                return;
            }
            if (arg0 == 5619) {
                field1490--;
                return;
            }
            if (arg0 == 5620) {
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1501 -= 2;
                field1490 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class10.field79 != null) {
                    field1491[field1490++] = 1;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field1491[field1490++] = (int) (class553.field7927 >> 32);
                field1491[field1490++] = (int) (class553.field7927 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field1491[field1490++] = class217.field2519 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class217.field2519 = true;
                class193.method1174(false);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field1491[--field1490];
                class654.field9334.method3924(true, class654.field9334.field9832, var211);
                class60.method461(-1);
                class37.method168((byte) 117);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field1491[--field1490] == 1;
                class654.field9334.method3924(true, class654.field9334.field9870, var212 ? 1 : 0);
                class654.field9334.method3924(true, class654.field9334.field9858, var212 ? 1 : 0);
                class60.method461(-1);
                class154.method944(true);
                class37.method168((byte) 121);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field1491[--field1490] == 1;
                class654.field9334.method3924(true, class654.field9334.field9833, var213 ? 2 : 1);
                class654.field9334.method3924(true, class654.field9334.field9834, var213 ? 2 : 1);
                class154.method944(true);
                class37.method168((byte) 122);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6005) {
                class654.field9334.method3924(true, class654.field9334.field9855, field1491[--field1490] == 1 ? 1 : 0);
                class60.method461(-1);
                class37.method168((byte) 127);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6007) {
                class654.field9334.method3924(true, class654.field9334.field9878, field1491[--field1490]);
                class37.method168((byte) 112);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6008) {
                class654.field9334.method3924(true, class654.field9334.field9847, field1491[--field1490] == 1 ? 1 : 0);
                class37.method168((byte) 111);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6010) {
                class654.field9334.method3924(true, class654.field9334.field9869, field1491[--field1490] == 1 ? 1 : 0);
                class37.method168((byte) 124);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6011) {
                class654.field9334.method3924(true, class654.field9334.field9856, field1491[--field1490]);
                class60.method461(-1);
                class37.method168((byte) 108);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6012) {
                class654.field9334.method3924(true, class654.field9334.field9844, field1491[--field1490] == 1 ? 1 : 0);
                class598.method3406((byte) 120);
                class341.method2026(9349);
                class37.method168((byte) 127);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6014) {
                class654.field9334.method3924(true, class654.field9334.field9837, field1491[--field1490] == 1 ? 2 : 0);
                class60.method461(-1);
                class37.method168((byte) 115);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6015) {
                class654.field9334.method3924(true, class654.field9334.field9848, field1491[--field1490] == 1 ? 1 : 0);
                class60.method461(-1);
                class37.method168((byte) 117);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6016) {
                class654.field9334.method3924(true, class654.field9334.field9852, field1491[--field1490]);
                class627.method3597(false, class654.field9334.field9850.method1512(-122), -31618);
                class37.method168((byte) 117);
                return;
            }
            if (arg0 == 6017) {
                class654.field9334.method3924(true, class654.field9334.field9879, field1491[--field1490] == 1 ? 1 : 0);
                class219.method1281(true);
                class37.method168((byte) 114);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6018) {
                class654.field9334.method3924(true, class654.field9334.field9828, field1491[--field1490]);
                class37.method168((byte) 107);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field1491[--field1490];
                int var215 = class654.field9334.field9831.method1500(-122);
                if (var214 != var215) {
                    if (class28.method135(-752, class392.field5397)) {
                        if (var215 == 0 && class326.field4223 != -1) {
                            class294.method1748(15251, var214, false, class464.field6622, 0, class326.field4223);
                            class703.method3949(80);
                            class533.field7714 = false;
                        } else if (var214 == 0) {
                            class703.method3944(115);
                            class533.field7714 = false;
                        } else {
                            class374.method2179(116, var214);
                        }
                    }
                    class654.field9334.method3924(true, class654.field9334.field9831, var214);
                    class37.method168((byte) 108);
                    class361.field4632 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class654.field9334.method3924(true, class654.field9334.field9861, field1491[--field1490]);
                class37.method168((byte) 125);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class654.field9334.field9833.method549(15);
                class654.field9334.method3924(true, class654.field9334.field9834, field1491[--field1490] == 1 ? 0 : var216);
                class154.method944(true);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field1491[--field1490];
                class654.field9334.method3924(true, class654.field9334.field9851, var217);
                class37.method168((byte) 118);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6024) {
                class654.field9334.method3924(true, class654.field9334.field9866, field1491[--field1490]);
                class37.method168((byte) 113);
                return;
            }
            if (arg0 == 6025) {
                class654.field9334.method3924(true, class654.field9334.field9863, field1491[--field1490]);
                class37.method168((byte) 108);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field1491[--field1490];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class463.method2820(1, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class654.field9334.method3924(true, class654.field9334.field9864, field1491[--field1490] == 0 ? 0 : 1);
                class37.method168((byte) 121);
                return;
            }
            if (arg0 == 6029) {
                class654.field9334.method3924(true, class654.field9334.field9878, field1491[--field1490]);
                class37.method168((byte) 109);
                return;
            }
            if (arg0 == 6030) {
                class654.field9334.method3924(true, class654.field9334.field9845, field1491[--field1490] == 0 ? 0 : 1);
                class37.method168((byte) 113);
                class60.method461(-1);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field1491[--field1490];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class627.method3597(false, var219, -31618);
                return;
            }
            if (arg0 == 6032) {
                field1490 -= 2;
                int var220 = field1491[field1490];
                boolean var221 = field1491[field1490 + 1] == 1;
                class654.field9334.method3924(true, class654.field9334.field9835, var220);
                if (!var221) {
                    class654.field9334.method3924(true, class654.field9334.field9875, 0);
                }
                class37.method168((byte) 111);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6033) {
                class654.field9334.method3924(true, class654.field9334.field9876, field1491[--field1490]);
                class37.method168((byte) 123);
                return;
            }
            if (arg0 == 6034) {
                class654.field9334.method3924(true, class654.field9334.field9836, field1491[--field1490] == 1 ? 1 : 0);
                class37.method168((byte) 116);
                class598.method3406((byte) 9);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class654.field9334.field9870.method2982(35);
                class654.field9334.method3924(true, class654.field9334.field9858, field1491[--field1490] == 1 ? 1 : var222);
                class60.method461(-1);
                class154.method944(true);
                return;
            }
            if (arg0 == 6036) {
                class654.field9334.method3924(true, class654.field9334.field9849, field1491[--field1490]);
                class37.method168((byte) 120);
                class698.field9825 = true;
                return;
            }
            if (arg0 == 6037) {
                class654.field9334.method3924(true, class654.field9334.field9860, field1491[--field1490]);
                class37.method168((byte) 120);
                class361.field4632 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field1491[--field1490];
                int var224 = class654.field9334.field9853.method1500(16);
                if (var223 != var224 && class581.field8216 == class326.field4223) {
                    if (!class28.method135(-752, class392.field5397)) {
                        if (var224 == 0) {
                            class294.method1748(15251, var223, false, class464.field6622, 0, class326.field4223);
                            class703.method3949(80);
                            class533.field7714 = false;
                        } else if (var223 == 0) {
                            class703.method3944(115);
                            class533.field7714 = false;
                        } else {
                            class374.method2179(120, var223);
                        }
                    }
                    class654.field9334.method3924(true, class654.field9334.field9853, var223);
                    class37.method168((byte) 117);
                    class361.field4632 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field1491[--field1490];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class654.field9334.field9842.method3077(-123)) {
                    class654.field9334.method3924(true, class654.field9334.field9842, var225);
                    class37.method168((byte) 122);
                    class361.field4632 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field1491[--field1490];
                if (var226 != class654.field9334.field9872.method2432(-126)) {
                    class654.field9334.method3924(true, class654.field9334.field9872, var226);
                    class37.method168((byte) 125);
                    class361.field4632 = false;
                    class161.method998(false);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1491[field1490++] = class654.field9334.field9832.method2441(66);
                return;
            }
            if (arg0 == 6102) {
                field1491[field1490++] = class654.field9334.field9870.method2982(53) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1491[field1490++] = class654.field9334.field9833.method549(110) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1491[field1490++] = class654.field9334.field9855.method2962(103) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1491[field1490++] = class654.field9334.field9878.method3748(-122);
                return;
            }
            if (arg0 == 6108) {
                field1491[field1490++] = class654.field9334.field9847.method999(53) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1491[field1490++] = class654.field9334.field9869.method37(-122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1491[field1490++] = class654.field9334.field9856.method2185(-121);
                return;
            }
            if (arg0 == 6112) {
                field1491[field1490++] = class654.field9334.field9844.method900(-121) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1491[field1490++] = class654.field9334.field9837.method1829(76) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1491[field1490++] = class654.field9334.field9848.method3892(-127) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1491[field1490++] = class654.field9334.field9852.method3133(-124);
                return;
            }
            if (arg0 == 6117) {
                field1491[field1490++] = class654.field9334.field9879.method3007(-124) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1491[field1490++] = class654.field9334.field9828.method1500(22);
                return;
            }
            if (arg0 == 6119) {
                field1491[field1490++] = class654.field9334.field9831.method1500(-124);
                return;
            }
            if (arg0 == 6120) {
                field1491[field1490++] = class654.field9334.field9861.method1500(-124);
                return;
            }
            if (arg0 == 6123) {
                field1491[field1490++] = class178.method1096(-2);
                return;
            }
            if (arg0 == 6124) {
                field1491[field1490++] = class654.field9334.field9866.method3133(82);
                return;
            }
            if (arg0 == 6125) {
                field1491[field1490++] = class654.field9334.field9863.method565(-126);
                return;
            }
            if (arg0 == 6127) {
                field1491[field1490++] = class654.field9334.field9826.method4205(-125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1491[field1490++] = class654.field9334.field9864.method4034(-120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1491[field1490++] = class654.field9334.field9878.method3748(24);
                return;
            }
            if (arg0 == 6130) {
                field1491[field1490++] = class654.field9334.field9845.method3265(-120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1491[field1490++] = class654.field9334.field9850.method1512(-128);
                return;
            }
            if (arg0 == 6132) {
                field1491[field1490++] = class654.field9334.field9835.method1512(22);
                return;
            }
            if (arg0 == 6133) {
                field1491[field1490++] = class289.field3549.field7851 && !class289.field3549.field7847 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field1491[field1490++] = class654.field9334.field9876.method42(107);
                return;
            }
            if (arg0 == 6136) {
                field1491[field1490++] = class654.field9334.field9836.method466(42) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field1491[field1490++] = class411.method2519(0, 200, class654.field9334.field9850.method1512(60));
                return;
            }
            if (arg0 == 6139) {
                field1491[field1490++] = class654.field9334.field9849.method3465(-127);
                return;
            }
            if (arg0 == 6142) {
                field1491[field1490++] = class654.field9334.field9860.method1500(113);
                return;
            }
            if (arg0 == 6143) {
                field1491[field1490++] = class654.field9334.field9853.method1500(-122);
                return;
            }
            if (arg0 == 6144) {
                field1491[field1490++] = class579.field8199 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field1491[field1490++] = class654.field9334.field9842.method3077(-126);
                return;
            }
            if (arg0 == 6146) {
                field1491[field1490++] = class654.field9334.field9872.method2432(-123);
                return;
            }
            if (arg0 == 6147) {
                field1491[field1490++] = class463.field6618.field2979 < 512 || class579.field8199 || class38.field432 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field1491[field1490++] = class179.field2101 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1490 -= 2;
                class176.field2069 = (short) field1491[field1490];
                if (class176.field2069 <= 0) {
                    class176.field2069 = 256;
                }
                class703.field9911 = (short) field1491[field1490 + 1];
                if (class703.field9911 <= 0) {
                    class703.field9911 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1490 -= 2;
                class480.field6868 = (short) field1491[field1490];
                if (class480.field6868 <= 0) {
                    class480.field6868 = 256;
                }
                class489.field6977 = (short) field1491[field1490 + 1];
                if (class489.field6977 <= 0) {
                    class489.field6977 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1490 -= 4;
                class556.field7976 = (short) field1491[field1490];
                if (class556.field7976 <= 0) {
                    class556.field7976 = 1;
                }
                class510.field7271 = (short) field1491[field1490 + 1];
                if (class510.field7271 <= 0) {
                    class510.field7271 = 32767;
                } else if (class510.field7271 < class556.field7976) {
                    class510.field7271 = class556.field7976;
                }
                class102.field1060 = (short) field1491[field1490 + 2];
                if (class102.field1060 <= 0) {
                    class102.field1060 = 1;
                }
                class310.field3855 = (short) field1491[field1490 + 3];
                if (class310.field3855 <= 0) {
                    class310.field3855 = 32767;
                    return;
                }
                if (class310.field3855 < class102.field1060) {
                    class310.field3855 = class102.field1060;
                }
                return;
            }
            if (arg0 == 6203) {
                class96.method683(0, false, 334, 0, class477.field6800.field7658, class477.field6800.field7573);
                field1491[field1490++] = class429.field6240;
                field1491[field1490++] = class183.field2159;
                return;
            }
            if (arg0 == 6204) {
                field1491[field1490++] = class480.field6868;
                field1491[field1490++] = class489.field6977;
                return;
            }
            if (arg0 == 6205) {
                field1491[field1490++] = class176.field2069;
                field1491[field1490++] = class703.field9911;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1491[field1490++] = (int) (class652.method3700(-1) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1491[field1490++] = (int) (class652.method3700(-1) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1490 -= 3;
                int var227 = field1491[field1490];
                int var228 = field1491[field1490 + 1];
                int var229 = field1491[field1490 + 2];
                field1497.clear();
                field1497.set(11, 12);
                field1497.set(var229, var228, var227);
                int var230 = (int) (field1497.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field1491[field1490++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field1497.clear();
                field1497.setTime(new Date(class652.method3700(-1)));
                field1491[field1490++] = field1497.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field1491[--field1490];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field1491[field1490++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1491[field1490++] = class201.method1213((byte) 50) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1491[field1490++] = class246.method1490(true) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class392.field5397 == 7 && class461.field6567 == 0 && class71.field746 == 0) {
                    if (class553.field7923) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    if (class344.field4461 > class652.method3700(-1) - 1000L) {
                        field1491[field1490++] = 1;
                        return;
                    }
                    class553.field7923 = true;
                    class249 var233 = class289.method1715(class537.field7760, 120, class41.field470);
                    var233.field3016.method1421(class585.field8267, -20798);
                    class510.method3017(var233, 111);
                    field1491[field1490++] = 0;
                    return;
                }
                field1491[field1490++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class526 var234 = class600.method3413(8557);
                if (var234 != null) {
                    field1491[field1490++] = var234.field7497;
                    field1491[field1490++] = var234.field9076;
                    field1496[field1501++] = var234.field7496;
                    class96 var235 = var234.method3081((byte) 62);
                    field1491[field1490++] = var235.field1013;
                    field1496[field1501++] = var235.field1017;
                    field1491[field1490++] = var234.field9071;
                    field1491[field1490++] = var234.field7495;
                    field1496[field1501++] = var234.field7493;
                    return;
                }
                field1491[field1490++] = -1;
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                return;
            }
            if (arg0 == 6502) {
                class526 var236 = class342.method2036((byte) 55);
                if (var236 != null) {
                    field1491[field1490++] = var236.field7497;
                    field1491[field1490++] = var236.field9076;
                    field1496[field1501++] = var236.field7496;
                    class96 var237 = var236.method3081((byte) 62);
                    field1491[field1490++] = var237.field1013;
                    field1496[field1501++] = var237.field1017;
                    field1491[field1490++] = var236.field9071;
                    field1491[field1490++] = var236.field7495;
                    field1496[field1501++] = var236.field7493;
                    return;
                }
                field1491[field1490++] = -1;
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field1491[--field1490];
                String var239 = field1496[--field1501];
                if (class392.field5397 == 7 && class461.field6567 == 0 && class71.field746 == 0) {
                    field1491[field1490++] = class55.method306(var239, var238, 40000) ? 1 : 0;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field1491[--field1490];
                class526 var241 = class710.method3969(var240, 0);
                if (var241 != null) {
                    field1491[field1490++] = var241.field9076;
                    field1496[field1501++] = var241.field7496;
                    class96 var242 = var241.method3081((byte) 62);
                    field1491[field1490++] = var242.field1013;
                    field1496[field1501++] = var242.field1017;
                    field1491[field1490++] = var241.field9071;
                    field1491[field1490++] = var241.field7495;
                    field1496[field1501++] = var241.field7493;
                    return;
                }
                field1491[field1490++] = -1;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                field1491[field1490++] = 0;
                field1491[field1490++] = 0;
                field1496[field1501++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1490 -= 4;
                int var243 = field1491[field1490];
                boolean var244 = field1491[field1490 + 1] == 1;
                int var245 = field1491[field1490 + 2];
                boolean var246 = field1491[field1490 + 3] == 1;
                class47.method270(var244, var243, (byte) -127, var245, var246);
                return;
            }
            if (arg0 == 6508) {
                class486.method2931(76);
                return;
            }
            if (arg0 == 6509) {
                if (class392.field5397 != 7) {
                    return;
                }
                class219.field2535 = field1491[--field1490] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1491[field1490++] = class757.field10552;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class289.field3567 == class202.field2398) {
                if (arg0 == 6700) {
                    int var247 = class153.field1688.method1752(0);
                    if (class327.field4245 != -1) {
                        var247++;
                    }
                    field1491[field1490++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field1491[--field1490];
                    if (class327.field4245 != -1) {
                        if (var248 == 0) {
                            field1491[field1490++] = class327.field4245;
                            return;
                        }
                        var248--;
                    }
                    class424 var249 = (class424) class153.field1688.method1753(0);
                    while (var248-- > 0) {
                        var249 = (class424) class153.field1688.method1755(-100);
                    }
                    field1491[field1490++] = var249.field6159;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field1491[--field1490];
                    if (class643.field9209[var250] == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    String var251 = class643.field9209[var250][0].field7584;
                    if (var251 == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field1491[--field1490];
                    if (class643.field9209[var252] == null) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    field1491[field1490++] = class643.field9209[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field1490 -= 2;
                    int var253 = field1491[field1490];
                    int var254 = field1491[field1490 + 1];
                    if (class643.field9209[var253] == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    String var255 = class643.field9209[var253][var254].field7584;
                    if (var255 == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field1490 -= 2;
                    int var256 = field1491[field1490];
                    int var257 = field1491[field1490 + 1];
                    if (class643.field9209[var256] == null) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    field1491[field1490++] = class643.field9209[var256][var257].field7690;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field1490 -= 3;
                    int var258 = field1491[field1490];
                    int var259 = field1491[field1490 + 1];
                    int var260 = field1491[field1490 + 2];
                    class79.method557(var258 << 16 | var259, -125, 1, "", var260);
                    return;
                }
                if (arg0 == 6708) {
                    field1490 -= 3;
                    int var261 = field1491[field1490];
                    int var262 = field1491[field1490 + 1];
                    int var263 = field1491[field1490 + 2];
                    class79.method557(var261 << 16 | var262, -126, 2, "", var263);
                    return;
                }
                if (arg0 == 6709) {
                    field1490 -= 3;
                    int var264 = field1491[field1490];
                    int var265 = field1491[field1490 + 1];
                    int var266 = field1491[field1490 + 2];
                    class79.method557(var264 << 16 | var265, -127, 3, "", var266);
                    return;
                }
                if (arg0 == 6710) {
                    field1490 -= 3;
                    int var267 = field1491[field1490];
                    int var268 = field1491[field1490 + 1];
                    int var269 = field1491[field1490 + 2];
                    class79.method557(var267 << 16 | var268, -121, 4, "", var269);
                    return;
                }
                if (arg0 == 6711) {
                    field1490 -= 3;
                    int var270 = field1491[field1490];
                    int var271 = field1491[field1490 + 1];
                    int var272 = field1491[field1490 + 2];
                    class79.method557(var270 << 16 | var271, -120, 5, "", var272);
                    return;
                }
                if (arg0 == 6712) {
                    field1490 -= 3;
                    int var273 = field1491[field1490];
                    int var274 = field1491[field1490 + 1];
                    int var275 = field1491[field1490 + 2];
                    class79.method557(var273 << 16 | var274, -122, 6, "", var275);
                    return;
                }
                if (arg0 == 6713) {
                    field1490 -= 3;
                    int var276 = field1491[field1490];
                    int var277 = field1491[field1490 + 1];
                    int var278 = field1491[field1490 + 2];
                    class79.method557(var276 << 16 | var277, -119, 7, "", var278);
                    return;
                }
                if (arg0 == 6714) {
                    field1490 -= 3;
                    int var279 = field1491[field1490];
                    int var280 = field1491[field1490 + 1];
                    int var281 = field1491[field1490 + 2];
                    class79.method557(var279 << 16 | var280, -119, 8, "", var281);
                    return;
                }
                if (arg0 == 6715) {
                    field1490 -= 3;
                    int var282 = field1491[field1490];
                    int var283 = field1491[field1490 + 1];
                    int var284 = field1491[field1490 + 2];
                    class79.method557(var282 << 16 | var283, -121, 9, "", var284);
                    return;
                }
                if (arg0 == 6716) {
                    field1490 -= 3;
                    int var285 = field1491[field1490];
                    int var286 = field1491[field1490 + 1];
                    int var287 = field1491[field1490 + 2];
                    class79.method557(var285 << 16 | var286, -124, 10, "", var287);
                    return;
                }
                if (arg0 == 6717) {
                    field1490 -= 3;
                    int var288 = field1491[field1490];
                    int var289 = field1491[field1490 + 1];
                    int var290 = field1491[field1490 + 2];
                    class532 var291 = class689.method3895((byte) 123, var288 << 16 | var289, var290);
                    class251.method1503((byte) 92);
                    class751 var292 = client.method1779(var291);
                    class76.method545(var291, var292.field10507, var292.method4186(false), 30011);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field1491[--field1490];
                    class228 var294 = class337.field4323.method2054(36, var293);
                    if (var294.field2646 == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = var294.field2646;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field1491[--field1490];
                    class228 var296 = class337.field4323.method2054(36, var295);
                    field1491[field1490++] = var296.field2605;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field1491[--field1490];
                    class228 var298 = class337.field4323.method2054(36, var297);
                    field1491[field1490++] = var298.field2628;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field1491[--field1490];
                    class228 var300 = class337.field4323.method2054(36, var299);
                    field1491[field1490++] = var300.field2640;
                    return;
                }
                if (arg0 == 6804) {
                    field1490 -= 2;
                    int var301 = field1491[field1490];
                    int var302 = field1491[field1490 + 1];
                    class703 var303 = class84.field884.method98(true, var302);
                    if (var303.method3946((byte) -100)) {
                        field1496[field1501++] = class337.field4323.method2054(36, var301).method1320(var303.field9901, -383252931, var302);
                        return;
                    }
                    field1491[field1490++] = class337.field4323.method2054(36, var301).method1312(var303.field9906, 27696, var302);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field1491[field1490++] = class603.field8592 && !class85.field900 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field1491[field1490++] = class244.field2924;
                    return;
                }
                if (arg0 == 6902) {
                    field1491[field1490++] = class123.field1290;
                    return;
                }
                if (arg0 == 6903) {
                    field1491[field1490++] = class291.field3583;
                    return;
                }
                if (arg0 == 6904) {
                    field1491[field1490++] = class348.field4499;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class348.field4495 != null) {
                        if (class348.field4495.field3577 == null) {
                            var304 = class604.method3430(-22671, class348.field4495.field3578);
                        } else {
                            var304 = (String) class348.field4495.field3577;
                        }
                    }
                    field1496[field1501++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field1491[field1490++] = class440.field6386;
                    return;
                }
                if (arg0 == 6907) {
                    field1491[field1490++] = class182.field2145;
                    return;
                }
                if (arg0 == 6908) {
                    field1491[field1490++] = class592.field8345;
                    return;
                }
                if (arg0 == 6909) {
                    field1491[field1490++] = class302.field3762 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field1491[field1490++] = class306.field3817;
                    return;
                }
                if (arg0 == 6911) {
                    field1491[field1490++] = class157.field1729;
                    return;
                }
                if (arg0 == 6912) {
                    field1491[field1490++] = class312.field3875;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class305.method1832(-1);
                    field1491[field1490++] = class728.field10188 = class654.field9334.field9850.method1512(71);
                    field1491[field1490++] = var305;
                    class60.method461(-1);
                    class37.method168((byte) 119);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class164.method1016(75);
                    class60.method461(-1);
                    class37.method168((byte) 117);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class234.method1390(false);
                    class60.method461(-1);
                    class37.method168((byte) 117);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class177.method1091((byte) 92);
                    class60.method461(-1);
                    class37.method168((byte) 110);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class707.method3960(-40, true);
                    class60.method461(-1);
                    class37.method168((byte) 118);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class654.field9334.method3924(true, class654.field9334.field9875, 0);
                    class37.method168((byte) 122);
                    class361.field4632 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class728.field10188 == 2) {
                        class237.field2827 = true;
                        return;
                    }
                    if (class728.field10188 == 1) {
                        class209.field2466 = true;
                        return;
                    }
                    if (class728.field10188 == 3) {
                        class540.field7776 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field1491[field1490++] = class654.field9334.field9875.method3836(82);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field1490 -= 2;
                    int var306 = field1491[field1490];
                    int var307 = field1491[field1490 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class308.method1836(var306, false, var307, (byte) 42);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field1491[--field1490];
                    if (var308 != -1) {
                        class459.method2805(var308, 106);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field1491[--field1490];
                    if (var309 != -1) {
                        class682.method3866((byte) 79, var309);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field1491[field1490++] = class54.method303("jagtheora", (byte) -127) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field1491[field1490++] = class654.field9334.field9855.method2961(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field1491[field1490++] = class654.field9334.field9869.method38(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field1491[field1490++] = class654.field9334.field9856.method2187(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field1491[field1490++] = class654.field9334.field9837.method1830(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field1491[field1490++] = class654.field9334.field9866.method3134(-9242) && class275.field3370.method440() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field1491[field1490++] = class654.field9334.field9851.method927(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field1491[field1490++] = class654.field9334.field9863.method564(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field1491[field1490++] = class654.field9334.field9826.method4204(-9242) && class275.field3370.method353() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field1491[field1490++] = class654.field9334.field9845.method3264(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field1491[field1490++] = class654.field9334.field9836.method465(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field1491[field1490++] = class654.field9334.field9849.method3464(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field1491[field1490++] = class654.field9334.field9848.method3890(-9242) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field1491[field1490++] = class654.field9334.field9872.method2434(-9242) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9855.method34(var310, 15706);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9869.method34(var311, 15706);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9856.method34(var312, 15706);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9837.method34(var313, 15706);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field1491[--field1490];
                    if (!class275.field3370.method440()) {
                        field1491[field1490++] = 3;
                        return;
                    }
                    field1491[field1490++] = class654.field9334.field9866.method34(var314, 15706);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9851.method34(var315, 15706);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9863.method34(var316, 15706);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field1491[--field1490];
                    if (!class275.field3370.method353()) {
                        field1491[field1490++] = 3;
                        return;
                    }
                    field1491[field1490++] = class654.field9334.field9826.method34(var317, 15706);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9845.method34(var318, 15706);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9836.method34(var319, 15706);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9849.method34(var320, 15706);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9848.method34(var321, 15706);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field1491[--field1490];
                    field1491[field1490++] = class654.field9334.field9872.method34(var322, 15706);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3761)
    private static final void method849(String arg0, int arg1) {
        if (class58.field594 == 0 && !(!class603.field8592 || class85.field900) || class550.field7899) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class486.field6951.method2936(0, 106))) {
            var3 = 0;
            arg0 = arg0.substring(class486.field6951.method2936(0, 92).length());
        } else if (var2.startsWith(class486.field6952.method2936(0, 53))) {
            var3 = 1;
            arg0 = arg0.substring(class486.field6952.method2936(0, -120).length());
        } else if (var2.startsWith(class486.field6953.method2936(0, -58))) {
            var3 = 2;
            arg0 = arg0.substring(class486.field6953.method2936(0, 80).length());
        } else if (var2.startsWith(class486.field6954.method2936(0, 114))) {
            var3 = 3;
            arg0 = arg0.substring(class486.field6954.method2936(0, -116).length());
        } else if (var2.startsWith(class486.field6955.method2936(0, 94))) {
            var3 = 4;
            arg0 = arg0.substring(class486.field6955.method2936(0, 117).length());
        } else if (var2.startsWith(class486.field6956.method2936(0, -116))) {
            var3 = 5;
            arg0 = arg0.substring(class486.field6956.method2936(0, -114).length());
        } else if (var2.startsWith(class486.field6957.method2936(0, -85))) {
            var3 = 6;
            arg0 = arg0.substring(class486.field6957.method2936(0, 99).length());
        } else if (var2.startsWith(class486.field6958.method2936(0, 113))) {
            var3 = 7;
            arg0 = arg0.substring(class486.field6958.method2936(0, -104).length());
        } else if (var2.startsWith(class486.field6959.method2936(0, 71))) {
            var3 = 8;
            arg0 = arg0.substring(class486.field6959.method2936(0, 74).length());
        } else if (var2.startsWith(class486.field6960.method2936(0, 107))) {
            var3 = 9;
            arg0 = arg0.substring(class486.field6960.method2936(0, 124).length());
        } else if (var2.startsWith(class486.field6961.method2936(0, -98))) {
            var3 = 10;
            arg0 = arg0.substring(class486.field6961.method2936(0, 98).length());
        } else if (var2.startsWith(class486.field6962.method2936(0, -95))) {
            var3 = 11;
            arg0 = arg0.substring(class486.field6962.method2936(0, 126).length());
        } else if (class489.field6978 != 0) {
            if (var2.startsWith(class486.field6951.method2936(class489.field6978, -114))) {
                var3 = 0;
                arg0 = arg0.substring(class486.field6951.method2936(class489.field6978, 124).length());
            } else if (var2.startsWith(class486.field6952.method2936(class489.field6978, -70))) {
                var3 = 1;
                arg0 = arg0.substring(class486.field6952.method2936(class489.field6978, -78).length());
            } else if (var2.startsWith(class486.field6953.method2936(class489.field6978, -116))) {
                var3 = 2;
                arg0 = arg0.substring(class486.field6953.method2936(class489.field6978, -123).length());
            } else if (var2.startsWith(class486.field6954.method2936(class489.field6978, 55))) {
                var3 = 3;
                arg0 = arg0.substring(class486.field6954.method2936(class489.field6978, 87).length());
            } else if (var2.startsWith(class486.field6955.method2936(class489.field6978, 127))) {
                var3 = 4;
                arg0 = arg0.substring(class486.field6955.method2936(class489.field6978, 56).length());
            } else if (var2.startsWith(class486.field6956.method2936(class489.field6978, -71))) {
                var3 = 5;
                arg0 = arg0.substring(class486.field6956.method2936(class489.field6978, 112).length());
            } else if (var2.startsWith(class486.field6957.method2936(class489.field6978, 81))) {
                var3 = 6;
                arg0 = arg0.substring(class486.field6957.method2936(class489.field6978, 71).length());
            } else if (var2.startsWith(class486.field6958.method2936(class489.field6978, 102))) {
                var3 = 7;
                arg0 = arg0.substring(class486.field6958.method2936(class489.field6978, -56).length());
            } else if (var2.startsWith(class486.field6959.method2936(class489.field6978, -120))) {
                var3 = 8;
                arg0 = arg0.substring(class486.field6959.method2936(class489.field6978, -58).length());
            } else if (var2.startsWith(class486.field6960.method2936(class489.field6978, -105))) {
                var3 = 9;
                arg0 = arg0.substring(class486.field6960.method2936(class489.field6978, -72).length());
            } else if (var2.startsWith(class486.field6961.method2936(class489.field6978, -117))) {
                var3 = 10;
                arg0 = arg0.substring(class486.field6961.method2936(class489.field6978, -79).length());
            } else if (var2.startsWith(class486.field6962.method2936(class489.field6978, -124))) {
                var3 = 11;
                arg0 = arg0.substring(class486.field6962.method2936(class489.field6978, -66).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class486.field6963.method2936(0, -117))) {
            var5 = 1;
            arg0 = arg0.substring(class486.field6963.method2936(0, 59).length());
        } else if (var4.startsWith(class486.field6964.method2936(0, -73))) {
            var5 = 2;
            arg0 = arg0.substring(class486.field6964.method2936(0, -86).length());
        } else if (var4.startsWith(class486.field6965.method2936(0, -93))) {
            var5 = 3;
            arg0 = arg0.substring(class486.field6965.method2936(0, 61).length());
        } else if (var4.startsWith(class486.field6966.method2936(0, 76))) {
            var5 = 4;
            arg0 = arg0.substring(class486.field6966.method2936(0, 119).length());
        } else if (var4.startsWith(class486.field6967.method2936(0, -103))) {
            var5 = 5;
            arg0 = arg0.substring(class486.field6967.method2936(0, -66).length());
        } else if (class489.field6978 != 0) {
            if (var4.startsWith(class486.field6963.method2936(class489.field6978, 100))) {
                var5 = 1;
                arg0 = arg0.substring(class486.field6963.method2936(class489.field6978, -93).length());
            } else if (var4.startsWith(class486.field6964.method2936(class489.field6978, -91))) {
                var5 = 2;
                arg0 = arg0.substring(class486.field6964.method2936(class489.field6978, 90).length());
            } else if (var4.startsWith(class486.field6965.method2936(class489.field6978, 120))) {
                var5 = 3;
                arg0 = arg0.substring(class486.field6965.method2936(class489.field6978, -101).length());
            } else if (var4.startsWith(class486.field6966.method2936(class489.field6978, 112))) {
                var5 = 4;
                arg0 = arg0.substring(class486.field6966.method2936(class489.field6978, 80).length());
            } else if (var4.startsWith(class486.field6967.method2936(class489.field6978, -85))) {
                var5 = 5;
                arg0 = arg0.substring(class486.field6967.method2936(class489.field6978, 97).length());
            }
        }
        field1493++;
        class249 var6 = class289.method1715(class388.field5380, 111, class41.field470);
        var6.field3016.method1460(0, 24710);
        int var7 = var6.field3016.field2903;
        var6.field3016.method1460(var3, 24710);
        var6.field3016.method1460(var5, 24710);
        class122.method783(0, var6.field3016, arg0);
        var6.field3016.method1434(126, var6.field3016.field2903 - var7);
        class510.method3017(var6, 67);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvga;I)V", line = 4028)
    private static final void method850(class85 arg0, int arg1) {
        field1490 = 0;
        field1501 = 0;
        int var2 = -1;
        int[] var3 = arg0.field894;
        int[] var4 = arg0.field898;
        byte var5 = -1;
        field1510 = 0;
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
                        method856(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method848(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1491[field1490++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1491[field1490++] = class722.field10125.field10073[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class722.field10125.method4008(var8, field1491[--field1490], -83);
                } else if (var43 == 3) {
                    field1496[field1501++] = arg0.field902[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1490 -= 2;
                    if (field1491[field1490 + 1] != field1491[field1490]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1490 -= 2;
                    if (field1491[field1490 + 1] == field1491[field1490]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1490 -= 2;
                    if (field1491[field1490] < field1491[field1490 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1490 -= 2;
                    if (field1491[field1490] > field1491[field1490 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1510 == 0) {
                        return;
                    }
                    class560 var9 = field1488[--field1510];
                    arg0 = var9.field7992;
                    var3 = arg0.field894;
                    var4 = arg0.field898;
                    var2 = var9.field7995;
                    field1489 = var9.field7990;
                    field1500 = var9.field7999;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1491[field1490++] = class722.field10125.method3329((byte) -48, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class722.field10125.method4006(var11, field1491[--field1490], (byte) 127);
                } else if (var43 == 31) {
                    field1490 -= 2;
                    if (field1491[field1490] <= field1491[field1490 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1490 -= 2;
                    if (field1491[field1490] >= field1491[field1490 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1491[field1490++] = field1489[var4[var2]];
                } else if (var43 == 34) {
                    field1489[var4[var2]] = field1491[--field1490];
                } else if (var43 == 35) {
                    field1496[field1501++] = field1500[var4[var2]];
                } else if (var43 == 36) {
                    field1500[var4[var2]] = field1496[--field1501];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1501 -= var12;
                    String var13 = class125.method800(field1496, field1501, var12, (byte) -39);
                    field1496[field1501++] = var13;
                } else if (var43 == 38) {
                    field1490--;
                } else if (var43 == 39) {
                    field1501--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class85 var15 = class417.method2584((byte) -97, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field890];
                    String[] var17 = new String[var15.field891];
                    for (int var18 = 0; var18 < var15.field889; var18++) {
                        var16[var18] = field1491[field1490 + var18 - var15.field889];
                    }
                    for (int var19 = 0; var19 < var15.field895; var19++) {
                        var17[var19] = field1496[field1501 + var19 - var15.field895];
                    }
                    field1490 -= var15.field889;
                    field1501 -= var15.field895;
                    class560 var20 = new class560();
                    var20.field7992 = arg0;
                    var20.field7995 = var2;
                    var20.field7990 = field1489;
                    var20.field7999 = field1500;
                    if (field1510 >= field1488.length) {
                        throw new RuntimeException();
                    }
                    field1488[field1510++] = var20;
                    arg0 = var15;
                    var3 = var15.field894;
                    var4 = var15.field898;
                    var2 = -1;
                    field1489 = var16;
                    field1500 = var17;
                } else if (var43 == 42) {
                    field1491[field1490++] = class217.field2518[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class217.field2518[var21] = field1491[--field1490];
                    class332.method1988((byte) -37, var21);
                    class542.field7815 |= class417.field5905[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1491[--field1490];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1499[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1509[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1491[--field1490];
                    if (var28 < 0 || var28 >= field1499[var27]) {
                        throw new RuntimeException();
                    }
                    field1491[field1490++] = field1509[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1490 -= 2;
                    int var30 = field1491[field1490];
                    if (var30 < 0 || var30 >= field1499[var29]) {
                        throw new RuntimeException();
                    }
                    field1509[var29][var30] = field1491[field1490 + 1];
                } else if (var43 == 47) {
                    String var31 = class615.field8823[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1496[field1501++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class615.field8823[var32] = field1496[--field1501];
                    class217.method1266(var32, (byte) 65);
                } else if (var43 == 51) {
                    class295 var33 = arg0.field896[var4[var2]];
                    class716 var34 = (class716) var33.method1754(false, (long) field1491[--field1490]);
                    if (var34 != null) {
                        var2 += var34.field10054;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field901 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1522).append(" ");
                for (int var41 = field1510 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1488[var41].field7992.field1522).append(" ");
                }
                var40.append("op: ").append(var5);
                class151.method936(var40.toString(), var42, 116);
            } else {
                class490.method2948((byte) -55, "Clientscript error in: " + arg0.field901, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field901).append("\n");
                for (int var38 = field1510 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1488[var38].field7992.field901).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class151.method936(var37.toString(), var42, 105);
                class599.method3408(var37.toString(), (byte) -36);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 4457)
    public static void method851() {
        field1489 = null;
        field1500 = null;
        field1499 = null;
        field1509 = null;
        field1491 = null;
        field1496 = null;
        field1488 = null;
        field1492 = null;
        field1494 = null;
        field1498 = null;
        field1497 = null;
        field1511 = null;
        field1512 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 4488)
    public static final void method852(int arg0) {
        if (arg0 == -1 || !class650.method3697(0, arg0)) {
            return;
        }
        class532[] var1 = class643.field9209[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class532 var3 = var1[var2];
            if (var3.field7635 != null) {
                class622 var4 = new class622();
                var4.field8908 = var3;
                var4.field8904 = var3.field7635;
                method857(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljt;II)V", line = 4519)
    public static final void method853(class104 arg0, int arg1, int arg2) {
        class85 var3 = class552.method3237(arg2, arg0, arg1, true);
        if (var3 == null) {
            return;
        }
        field1489 = new int[var3.field890];
        field1500 = new String[var3.field891];
        if (class15.field137 == var3.field899 || class451.field6503 == var3.field899 || class4.field29 == var3.field899) {
            int var4 = 0;
            int var5 = 0;
            if (class354.field4540 != null) {
                var4 = class354.field4540.field7615;
                var5 = class354.field4540.field7641;
            }
            field1489[0] = class353.field4537.method694((byte) 83) - var4;
            field1489[1] = class353.field4537.method691((byte) -113) - var5;
        }
        method850(var3, 200000);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Ljava/lang/String;", line = 4546)
    private static final String method854(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1497.setTime(new Date(var1));
        int var3 = field1497.get(5);
        int var4 = field1497.get(2);
        int var5 = field1497.get(1);
        return var3 + "-" + field1511[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IZ)V", line = 4563)
    public static final void method855(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(IZ)V", line = 4569)
    private static final void method856(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1490 -= 3;
                int var2 = field1491[field1490];
                int var3 = field1491[field1490 + 1];
                int var4 = field1491[field1490 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class532 var5 = class269.method1608((byte) -72, var2);
                if (var5.field7632 == null) {
                    var5.field7632 = new class532[var4 + 1];
                }
                if (var5.field7632.length <= var4) {
                    class532[] var6 = new class532[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7632.length; var7++) {
                        var6[var7] = var5.field7632[var7];
                    }
                    var5.field7632 = var6;
                }
                if (var4 > 0 && var5.field7632[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class532 var8 = new class532();
                var8.field7543 = var3;
                var8.field7580 = var8.field7704 = var5.field7704;
                var8.field7628 = var4;
                var5.field7632[var4] = var8;
                if (arg1) {
                    field1494 = var8;
                } else {
                    field1492 = var8;
                }
                class11.method50(var5, (byte) -96);
                return;
            }
            if (arg0 == 101) {
                class532 var9 = arg1 ? field1494 : field1492;
                if (var9.field7628 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class532 var10 = class269.method1608((byte) -72, var9.field7704);
                var10.field7632[var9.field7628] = null;
                class11.method50(var10, (byte) -127);
                return;
            }
            if (arg0 == 102) {
                class532 var11 = class269.method1608((byte) -72, field1491[--field1490]);
                var11.field7632 = null;
                class11.method50(var11, (byte) -120);
                return;
            }
            if (arg0 == 200) {
                field1490 -= 2;
                int var12 = field1491[field1490];
                int var13 = field1491[field1490 + 1];
                class532 var14 = class689.method3895((byte) 125, var12, var13);
                if (var14 != null && var13 != -1) {
                    field1491[field1490++] = 1;
                    if (arg1) {
                        field1494 = var14;
                        return;
                    }
                    field1492 = var14;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1491[--field1490];
                class532 var16 = class269.method1608((byte) -72, var15);
                if (var16 != null) {
                    field1491[field1490++] = 1;
                    if (arg1) {
                        field1494 = var16;
                        return;
                    }
                    field1492 = var16;
                    return;
                }
                field1491[field1490++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1491[--field1490];
                method860(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1491[--field1490];
                method847(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1490 -= 2;
                int var19 = field1491[field1490];
                int var20 = field1491[field1490 + 1];
                for (int var21 = 0; var21 < class274.field3364.length; var21++) {
                    if (class274.field3364[var21] == var19) {
                        class90.field937.field2201.method2683((byte) 26, class606.field8619, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class226.field2582.length; var22++) {
                    if (class226.field2582[var22] == var19) {
                        class90.field937.field2201.method2683((byte) 26, class606.field8619, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1490 -= 2;
                int var23 = field1491[field1490];
                int var24 = field1491[field1490 + 1];
                class90.field937.field2201.method2686(var23, var24, -23047);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1491[--field1490] != 0;
                class90.field937.field2201.method2690(var25, 12134);
                return;
            }
            if (arg0 == 411) {
                field1490 -= 2;
                int var26 = field1491[field1490];
                int var27 = field1491[field1490 + 1];
                class90.field937.field2201.method2684(class361.field4643, -1, var26, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class532 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class269.method1608((byte) -72, field1491[--field1490]);
            } else {
                var28 = arg1 ? field1494 : field1492;
            }
            if (arg0 == 1000) {
                field1490 -= 4;
                var28.field7622 = field1491[field1490];
                var28.field7583 = field1491[field1490 + 1];
                int var29 = field1491[field1490 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field1491[field1490 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field7582 = (byte) var29;
                var28.field7693 = (byte) var30;
                class11.method50(var28, (byte) -108);
                class80.method566((byte) 124, var28);
                if (var28.field7628 == -1) {
                    class721.method4023(var28.field7704, 11);
                }
                return;
            }
            if (arg0 == 1001) {
                field1490 -= 4;
                var28.field7572 = field1491[field1490];
                var28.field7692 = field1491[field1490 + 1];
                var28.field7653 = 0;
                var28.field7619 = 0;
                int var31 = field1491[field1490 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field1491[field1490 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field7633 = (byte) var31;
                var28.field7614 = (byte) var32;
                class11.method50(var28, (byte) -96);
                class80.method566((byte) 127, var28);
                if (var28.field7543 == 0) {
                    class600.method3414(false, var28, 116);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field1491[--field1490] == 1;
                if (var28.field7648 != var33) {
                    var28.field7648 = var33;
                    class11.method50(var28, (byte) -115);
                }
                if (var28.field7628 == -1) {
                    class679.method3854(var28.field7704, -124);
                }
                return;
            }
            if (arg0 == 1004) {
                field1490 -= 2;
                var28.field7643 = field1491[field1490];
                var28.field7601 = field1491[field1490 + 1];
                class11.method50(var28, (byte) -127);
                class80.method566((byte) 123, var28);
                if (var28.field7543 == 0) {
                    class600.method3414(false, var28, 116);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field7626 = field1491[--field1490] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class532 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class269.method1608((byte) -72, field1491[--field1490]);
            } else {
                var34 = arg1 ? field1494 : field1492;
            }
            if (arg0 == 1100) {
                field1490 -= 2;
                var34.field7567 = field1491[field1490];
                if (var34.field7567 > var34.field7608 - var34.field7658) {
                    var34.field7567 = var34.field7608 - var34.field7658;
                }
                if (var34.field7567 < 0) {
                    var34.field7567 = 0;
                }
                var34.field7571 = field1491[field1490 + 1];
                if (var34.field7571 > var34.field7699 - var34.field7573) {
                    var34.field7571 = var34.field7699 - var34.field7573;
                }
                if (var34.field7571 < 0) {
                    var34.field7571 = 0;
                }
                class11.method50(var34, (byte) -110);
                if (var34.field7628 == -1) {
                    class5.method21((byte) 14, var34.field7704);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field7694 = field1491[--field1490];
                class11.method50(var34, (byte) -98);
                if (var34.field7628 == -1) {
                    class91.method619(var34.field7704, -100);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field7548 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -97);
                return;
            }
            if (arg0 == 1103) {
                var34.field7682 = field1491[--field1490];
                class11.method50(var34, (byte) -108);
                return;
            }
            if (arg0 == 1104) {
                var34.field7618 = field1491[--field1490];
                class11.method50(var34, (byte) -97);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field1491[--field1490];
                if (var34.field7703 != var35) {
                    var34.field7703 = var35;
                    class11.method50(var34, (byte) -116);
                }
                if (var34.field7628 == -1) {
                    class294.method1745(14, var34.field7704);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field7706 = field1491[--field1490];
                class11.method50(var34, (byte) -99);
                return;
            }
            if (arg0 == 1107) {
                var34.field7562 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -125);
                return;
            }
            if (arg0 == 1108) {
                var34.field7685 = 1;
                var34.field7596 = field1491[--field1490];
                class11.method50(var34, (byte) -120);
                if (var34.field7628 == -1) {
                    class629.method3605(-74, var34.field7704);
                }
                return;
            }
            if (arg0 == 1109) {
                field1490 -= 6;
                var34.field7563 = field1491[field1490];
                var34.field7607 = field1491[field1490 + 1];
                var34.field7594 = field1491[field1490 + 2];
                var34.field7654 = field1491[field1490 + 3];
                var34.field7546 = field1491[field1490 + 4];
                var34.field7657 = field1491[field1490 + 5];
                class11.method50(var34, (byte) -110);
                if (var34.field7628 == -1) {
                    class388.method2397(var34.field7704, (byte) -100);
                    class228.method1311(-68, var34.field7704);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field1491[--field1490];
                if (var34.field7705 != var36) {
                    var34.field7705 = var36;
                    var34.field7547 = 0;
                    var34.field7695 = 1;
                    var34.field7636 = 0;
                    class25 var37 = var34.field7705 == -1 ? null : class637.field9158.method1905(82, var34.field7705);
                    if (var37 != null) {
                        class339.method2014(var37, 5271, var34.field7547);
                    }
                    class11.method50(var34, (byte) -120);
                }
                if (var34.field7628 == -1) {
                    class704.method3952((byte) 60, var34.field7704);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field7670 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -104);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field1496[--field1501];
                if (!var38.equals(var34.field7620)) {
                    var34.field7620 = var38;
                    class11.method50(var34, (byte) -108);
                }
                if (var34.field7628 == -1) {
                    class176.method1086(var34.field7704, true);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field7604 = field1491[--field1490];
                class11.method50(var34, (byte) -125);
                if (var34.field7628 == -1) {
                    class526.method3080((byte) -119, var34.field7704);
                }
                return;
            }
            if (arg0 == 1114) {
                field1490 -= 3;
                var34.field7678 = field1491[field1490];
                var34.field7652 = field1491[field1490 + 1];
                var34.field7689 = field1491[field1490 + 2];
                class11.method50(var34, (byte) -113);
                return;
            }
            if (arg0 == 1115) {
                var34.field7609 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -126);
                return;
            }
            if (arg0 == 1116) {
                var34.field7649 = field1491[--field1490];
                class11.method50(var34, (byte) -109);
                return;
            }
            if (arg0 == 1117) {
                var34.field7579 = field1491[--field1490];
                class11.method50(var34, (byte) -116);
                return;
            }
            if (arg0 == 1118) {
                var34.field7581 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -124);
                return;
            }
            if (arg0 == 1119) {
                var34.field7554 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -99);
                return;
            }
            if (arg0 == 1120) {
                field1490 -= 2;
                var34.field7608 = field1491[field1490];
                var34.field7699 = field1491[field1490 + 1];
                class11.method50(var34, (byte) -127);
                if (var34.field7543 == 0) {
                    class600.method3414(false, var34, 126);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field7663 = field1491[--field1490] == 1;
                class11.method50(var34, (byte) -110);
                return;
            }
            if (arg0 == 1123) {
                var34.field7657 = field1491[--field1490];
                class11.method50(var34, (byte) -111);
                if (var34.field7628 == -1) {
                    class388.method2397(var34.field7704, (byte) -106);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field1491[--field1490];
                var34.field7598 = var39 == 1;
                class11.method50(var34, (byte) -108);
                return;
            }
            if (arg0 == 1125) {
                field1490 -= 2;
                var34.field7700 = field1491[field1490];
                var34.field7669 = field1491[field1490 + 1];
                class11.method50(var34, (byte) -99);
                return;
            }
            if (arg0 == 1126) {
                var34.field7557 = field1491[--field1490];
                class11.method50(var34, (byte) -110);
                return;
            }
            if (arg0 == 1127) {
                field1490 -= 2;
                int var40 = field1491[field1490];
                int var41 = field1491[field1490 + 1];
                class703 var42 = class84.field884.method98(true, var40);
                if (var42.field9906 != var41) {
                    var34.method3116((byte) -77, var41, var40);
                    return;
                }
                var34.method3115(255, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field1491[--field1490];
                String var44 = field1496[--field1501];
                class703 var45 = class84.field884.method98(true, var43);
                if (!var45.field9901.equals(var44)) {
                    var34.method3120(var43, 26680, var44);
                    return;
                }
                var34.method3115(255, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field1491[--field1490];
                if (var34.field7543 != 5 && arg0 == 1129 || var34.field7543 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field7687 != var46) {
                    var34.field7687 = var46;
                    class11.method50(var34, (byte) -113);
                }
                if (var34.field7628 == -1) {
                    class641.method3656(var34.field7704, 64);
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class532 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class269.method1608((byte) -72, field1491[--field1490]);
            } else {
                var47 = arg1 ? field1494 : field1492;
            }
            class11.method50(var47, (byte) -104);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1490 -= 2;
                int var48 = field1491[field1490];
                int var49 = field1491[field1490 + 1];
                if (var47.field7628 == -1) {
                    class440.method2744(9, var47.field7704);
                    class388.method2397(var47.field7704, (byte) -100);
                    class228.method1311(-104, var47.field7704);
                }
                if (var48 == -1) {
                    var47.field7685 = 1;
                    var47.field7596 = -1;
                    var47.field7691 = -1;
                    return;
                }
                var47.field7691 = var48;
                var47.field7593 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field7686 = true;
                } else {
                    var47.field7686 = false;
                }
                class431 var50 = class361.field4643.method912((byte) 1, var48);
                var47.field7594 = var50.field6260;
                var47.field7654 = var50.field6328;
                var47.field7546 = var50.field6296;
                var47.field7563 = var50.field6329;
                var47.field7607 = var50.field6325;
                var47.field7657 = var50.field6314;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field7600 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field7600 = 1;
                } else {
                    var47.field7600 = 2;
                }
                if (var47.field7653 > 0) {
                    var47.field7657 = var47.field7657 * 32 / var47.field7653;
                    return;
                }
                if (var47.field7572 > 0) {
                    var47.field7657 = var47.field7657 * 32 / var47.field7572;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field7685 = 2;
                var47.field7596 = field1491[--field1490];
                if (var47.field7628 == -1) {
                    class629.method3605(87, var47.field7704);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field7685 = 3;
                var47.field7596 = -1;
                if (var47.field7628 == -1) {
                    class629.method3605(-113, var47.field7704);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field7685 = 6;
                var47.field7596 = field1491[--field1490];
                if (var47.field7628 == -1) {
                    class629.method3605(65, var47.field7704);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field7685 = 5;
                var47.field7596 = field1491[--field1490];
                if (var47.field7628 == -1) {
                    class629.method3605(-120, var47.field7704);
                }
                return;
            }
            if (arg0 == 1206) {
                field1490 -= 4;
                var47.field7616 = field1491[field1490];
                var47.field7637 = field1491[field1490 + 1];
                var47.field7671 = field1491[field1490 + 2];
                var47.field7647 = field1491[field1490 + 3];
                class11.method50(var47, (byte) -111);
                return;
            }
            if (arg0 == 1207) {
                field1490 -= 2;
                var47.field7710 = field1491[field1490];
                var47.field7621 = field1491[field1490 + 1];
                class11.method50(var47, (byte) -118);
                return;
            }
            if (arg0 == 1210) {
                field1490 -= 4;
                var47.field7596 = field1491[field1490];
                var47.field7555 = field1491[field1490 + 1];
                if (field1491[field1490 + 2] == 1) {
                    var47.field7685 = 9;
                } else {
                    var47.field7685 = 8;
                }
                if (field1491[field1490 + 3] == 1) {
                    var47.field7686 = true;
                } else {
                    var47.field7686 = false;
                }
                if (var47.field7628 == -1) {
                    class629.method3605(-97, var47.field7704);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field7685 = 5;
                var47.field7596 = class701.field9893;
                var47.field7555 = 0;
                if (var47.field7628 == -1) {
                    class629.method3605(-105, var47.field7704);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class532 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class269.method1608((byte) -72, field1491[--field1490]);
                } else {
                    var62 = arg1 ? field1494 : field1492;
                }
                if (arg0 == 1499) {
                    var62.method3113(0);
                    return;
                }
                String var63 = field1496[--field1501];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field1491[--field1490];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field1491[--field1490];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field1496[--field1501];
                    } else {
                        var66[var67] = Integer.valueOf(field1491[--field1490]);
                    }
                }
                int var68 = field1491[--field1490];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field7569 = var66;
                } else if (arg0 == 1401) {
                    var62.field7701 = var66;
                } else if (arg0 == 1402) {
                    var62.field7613 = var66;
                } else if (arg0 == 1403) {
                    var62.field7595 = var66;
                } else if (arg0 == 1404) {
                    var62.field7662 = var66;
                } else if (arg0 == 1405) {
                    var62.field7552 = var66;
                } else if (arg0 == 1406) {
                    var62.field7708 = var66;
                } else if (arg0 == 1407) {
                    var62.field7644 = var66;
                    var62.field7673 = var64;
                } else if (arg0 == 1408) {
                    var62.field7702 = var66;
                } else if (arg0 == 1409) {
                    var62.field7588 = var66;
                } else if (arg0 == 1410) {
                    var62.field7631 = var66;
                } else if (arg0 == 1411) {
                    var62.field7549 = var66;
                } else if (arg0 == 1412) {
                    var62.field7586 = var66;
                } else if (arg0 == 1414) {
                    var62.field7610 = var66;
                    var62.field7577 = var64;
                } else if (arg0 == 1415) {
                    var62.field7697 = var66;
                    var62.field7681 = var64;
                } else if (arg0 == 1416) {
                    var62.field7642 = var66;
                } else if (arg0 == 1417) {
                    var62.field7650 = var66;
                } else if (arg0 == 1418) {
                    var62.field7638 = var66;
                } else if (arg0 == 1419) {
                    var62.field7560 = var66;
                } else if (arg0 == 1420) {
                    var62.field7606 = var66;
                } else if (arg0 == 1421) {
                    var62.field7672 = var66;
                } else if (arg0 == 1422) {
                    var62.field7709 = var66;
                } else if (arg0 == 1423) {
                    var62.field7574 = var66;
                } else if (arg0 == 1424) {
                    var62.field7623 = var66;
                } else if (arg0 == 1425) {
                    var62.field7675 = var66;
                } else if (arg0 == 1426) {
                    var62.field7680 = var66;
                } else if (arg0 == 1427) {
                    var62.field7605 = var66;
                } else if (arg0 == 1428) {
                    var62.field7629 = var66;
                    var62.field7674 = var64;
                } else if (arg0 == 1429) {
                    var62.field7656 = var66;
                    var62.field7564 = var64;
                } else if (arg0 == 1430) {
                    var62.field7576 = var66;
                }
                var62.field7570 = true;
                return;
            }
            if (arg0 < 1600) {
                class532 var69 = arg1 ? field1494 : field1492;
                if (arg0 == 1500) {
                    field1491[field1490++] = var69.field7615;
                    return;
                }
                if (arg0 == 1501) {
                    field1491[field1490++] = var69.field7641;
                    return;
                }
                if (arg0 == 1502) {
                    field1491[field1490++] = var69.field7658;
                    return;
                }
                if (arg0 == 1503) {
                    field1491[field1490++] = var69.field7573;
                    return;
                }
                if (arg0 == 1504) {
                    field1491[field1490++] = var69.field7648 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1491[field1490++] = var69.field7580;
                    return;
                }
                if (arg0 == 1506) {
                    class532 var70 = class235.method1393((byte) -76, var69);
                    field1491[field1490++] = var70 == null ? -1 : var70.field7704;
                    return;
                }
            } else if (arg0 < 1700) {
                class532 var71 = arg1 ? field1494 : field1492;
                if (arg0 == 1600) {
                    field1491[field1490++] = var71.field7567;
                    return;
                }
                if (arg0 == 1601) {
                    field1491[field1490++] = var71.field7571;
                    return;
                }
                if (arg0 == 1602) {
                    field1496[field1501++] = var71.field7620;
                    return;
                }
                if (arg0 == 1603) {
                    field1491[field1490++] = var71.field7608;
                    return;
                }
                if (arg0 == 1604) {
                    field1491[field1490++] = var71.field7699;
                    return;
                }
                if (arg0 == 1605) {
                    field1491[field1490++] = var71.field7657;
                    return;
                }
                if (arg0 == 1606) {
                    field1491[field1490++] = var71.field7594;
                    return;
                }
                if (arg0 == 1607) {
                    field1491[field1490++] = var71.field7546;
                    return;
                }
                if (arg0 == 1608) {
                    field1491[field1490++] = var71.field7654;
                    return;
                }
                if (arg0 == 1609) {
                    field1491[field1490++] = var71.field7682;
                    return;
                }
                if (arg0 == 1610) {
                    field1491[field1490++] = var71.field7563;
                    return;
                }
                if (arg0 == 1611) {
                    field1491[field1490++] = var71.field7607;
                    return;
                }
                if (arg0 == 1612) {
                    field1491[field1490++] = var71.field7703;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field1491[--field1490];
                    class703 var73 = class84.field884.method98(true, var72);
                    if (var73.method3946((byte) -100)) {
                        field1496[field1501++] = var71.method3128(var73.field9901, var72, (byte) 127);
                        return;
                    }
                    field1491[field1490++] = var71.method3111((byte) -106, var73.field9906, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field1491[field1490++] = var71.field7706;
                    return;
                }
                if (arg0 == 2614) {
                    field1491[field1490++] = var71.field7685 == 1 ? var71.field7596 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class532 var74 = arg1 ? field1494 : field1492;
                if (arg0 == 1700) {
                    field1491[field1490++] = var74.field7691;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field7691 != -1) {
                        field1491[field1490++] = var74.field7593;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1491[field1490++] = var74.field7628;
                    return;
                }
            } else if (arg0 < 1900) {
                class532 var75 = arg1 ? field1494 : field1492;
                if (arg0 == 1800) {
                    field1491[field1490++] = client.method1779(var75).method4186(false);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field1491[--field1490];
                    int var357 = var76 - 1;
                    if (var75.field7545 != null && var357 < var75.field7545.length && var75.field7545[var357] != null) {
                        field1496[field1501++] = var75.field7545[var357];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field7666 == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = var75.field7666;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class532 var355;
                if (arg0 >= 2000) {
                    var355 = class269.method1608((byte) -72, field1491[--field1490]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field1494 : field1492;
                }
                if (field1514 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field7605 == null) {
                        return;
                    }
                    class622 var356 = new class622();
                    var356.field8908 = var355;
                    var356.field8904 = var355.field7605;
                    var356.field8905 = field1514 + 1;
                    class518.field7374.method1721((byte) -40, var356);
                    return;
                }
            } else if (arg0 < 2600) {
                class532 var77 = class269.method1608((byte) -72, field1491[--field1490]);
                if (arg0 == 2500) {
                    field1491[field1490++] = var77.field7615;
                    return;
                }
                if (arg0 == 2501) {
                    field1491[field1490++] = var77.field7641;
                    return;
                }
                if (arg0 == 2502) {
                    field1491[field1490++] = var77.field7658;
                    return;
                }
                if (arg0 == 2503) {
                    field1491[field1490++] = var77.field7573;
                    return;
                }
                if (arg0 == 2504) {
                    field1491[field1490++] = var77.field7648 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1491[field1490++] = var77.field7580;
                    return;
                }
                if (arg0 == 1506) {
                    class532 var78 = class235.method1393((byte) -79, var77);
                    field1491[field1490++] = var78 == null ? -1 : var78.field7704;
                    return;
                }
            } else if (arg0 < 2700) {
                class532 var79 = class269.method1608((byte) -72, field1491[--field1490]);
                if (arg0 == 2600) {
                    field1491[field1490++] = var79.field7567;
                    return;
                }
                if (arg0 == 2601) {
                    field1491[field1490++] = var79.field7571;
                    return;
                }
                if (arg0 == 2602) {
                    field1496[field1501++] = var79.field7620;
                    return;
                }
                if (arg0 == 2603) {
                    field1491[field1490++] = var79.field7608;
                    return;
                }
                if (arg0 == 2604) {
                    field1491[field1490++] = var79.field7699;
                    return;
                }
                if (arg0 == 2605) {
                    field1491[field1490++] = var79.field7657;
                    return;
                }
                if (arg0 == 2606) {
                    field1491[field1490++] = var79.field7594;
                    return;
                }
                if (arg0 == 2607) {
                    field1491[field1490++] = var79.field7546;
                    return;
                }
                if (arg0 == 2608) {
                    field1491[field1490++] = var79.field7654;
                    return;
                }
                if (arg0 == 2609) {
                    field1491[field1490++] = var79.field7682;
                    return;
                }
                if (arg0 == 2610) {
                    field1491[field1490++] = var79.field7563;
                    return;
                }
                if (arg0 == 2611) {
                    field1491[field1490++] = var79.field7607;
                    return;
                }
                if (arg0 == 2612) {
                    field1491[field1490++] = var79.field7703;
                    return;
                }
                if (arg0 == 2613) {
                    field1491[field1490++] = var79.field7706;
                    return;
                }
                if (arg0 == 2614) {
                    field1491[field1490++] = var79.field7685 == 1 ? var79.field7596 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class532 var80 = class269.method1608((byte) -72, field1491[--field1490]);
                    field1491[field1490++] = var80.field7691;
                    return;
                }
                if (arg0 == 2701) {
                    class532 var81 = class269.method1608((byte) -72, field1491[--field1490]);
                    if (var81.field7691 != -1) {
                        field1491[field1490++] = var81.field7593;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field1491[--field1490];
                    class424 var83 = (class424) class153.field1688.method1754(false, (long) var82);
                    if (var83 != null) {
                        field1491[field1490++] = 1;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class532 var84 = class269.method1608((byte) -72, field1491[--field1490]);
                    if (var84.field7632 == null) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    int var85 = var84.field7632.length;
                    for (int var86 = 0; var86 < var84.field7632.length; var86++) {
                        if (var84.field7632[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field1491[field1490++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1490 -= 2;
                    int var87 = field1491[field1490];
                    int var88 = field1491[field1490 + 1];
                    class424 var89 = (class424) class153.field1688.method1754(false, (long) var87);
                    if (var89 != null && var89.field6159 == var88) {
                        field1491[field1490++] = 1;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class532 var90 = class269.method1608((byte) -72, field1491[--field1490]);
                if (arg0 == 2800) {
                    field1491[field1490++] = client.method1779(var90).method4186(false);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field1491[--field1490];
                    int var358 = var91 - 1;
                    if (var90.field7545 != null && var358 < var90.field7545.length && var90.field7545[var358] != null) {
                        field1496[field1501++] = var90.field7545[var358];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field7666 == null) {
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = var90.field7666;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field1496[--field1501];
                    class284.method1699((byte) 126, var92);
                    return;
                }
                if (arg0 == 3101) {
                    field1490 -= 2;
                    class317.method1908(109, field1491[field1490 + 1], class90.field937, field1491[field1490]);
                    return;
                }
                if (arg0 == 3103) {
                    class64.method483((byte) 108, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field1496[--field1501];
                    int var94 = 0;
                    if (class260.method1567((byte) -87, var93)) {
                        var94 = class219.method1282((byte) -110, var93);
                    }
                    field1507++;
                    class249 var95 = class289.method1715(class458.field6551, 48, class41.field470);
                    var95.field3016.method1421(var94, -20798);
                    class510.method3017(var95, 72);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field1496[--field1501];
                    field1508++;
                    class249 var97 = class289.method1715(class620.field8873, 122, class41.field470);
                    var97.field3016.method1460(var96.length() + 1, 24710);
                    var97.field3016.method1480(var96, false);
                    class510.method3017(var97, 104);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field1496[--field1501];
                    field1503++;
                    class249 var99 = class289.method1715(class537.field7752, 126, class41.field470);
                    var99.field3016.method1460(var98.length() + 1, 24710);
                    var99.field3016.method1480(var98, false);
                    class510.method3017(var99, 126);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field1491[--field1490];
                    String var101 = field1496[--field1501];
                    class387.method2393(var101, true, var100);
                    return;
                }
                if (arg0 == 3108) {
                    field1490 -= 3;
                    int var102 = field1491[field1490];
                    int var103 = field1491[field1490 + 1];
                    int var104 = field1491[field1490 + 2];
                    class532 var105 = class269.method1608((byte) -72, var104);
                    class581.method3347(var103, false, var105, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field1490 -= 2;
                    int var106 = field1491[field1490];
                    int var107 = field1491[field1490 + 1];
                    class532 var108 = arg1 ? field1494 : field1492;
                    class581.method3347(var107, false, var108, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field1491[--field1490];
                    field1495++;
                    class249 var110 = class289.method1715(class443.field6426, 56, class41.field470);
                    var110.field3016.method1446(var109, true);
                    class510.method3017(var110, 82);
                    return;
                }
                if (arg0 == 3111) {
                    field1490 -= 2;
                    int var111 = field1491[field1490];
                    int var112 = field1491[field1490 + 1];
                    class424 var113 = (class424) class153.field1688.method1754(false, (long) var111);
                    if (var113 != null) {
                        class441.method2749(0, var113.field6159 != var112, var113, true);
                    }
                    class223.method1298((byte) -65, true, var111, 3, var112);
                    return;
                }
                if (arg0 == 3112) {
                    field1490--;
                    int var114 = field1491[field1490];
                    class424 var115 = (class424) class153.field1688.method1754(false, (long) var114);
                    if (var115 != null && var115.field6158 == 3) {
                        class441.method2749(0, true, var115, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class234.method1386(field1496[--field1501], false);
                    return;
                }
                if (arg0 == 3114) {
                    field1490 -= 2;
                    int var116 = field1491[field1490];
                    int var117 = field1491[field1490 + 1];
                    String var118 = field1496[--field1501];
                    class74.method536(var118, "", var116, var117, (byte) -20, "", "");
                    return;
                }
                if (arg0 == 3115) {
                    field1490 -= 11;
                    class388[] var119 = class141.method888((byte) 115);
                    class219[] var120 = class38.method181(122);
                    class663.method3769(field1491[field1490 + 4], field1491[field1490 + 3], field1491[field1490 + 8], field1491[field1490 + 7], 28670, field1491[field1490 + 9], field1491[field1490 + 6], field1491[field1490 + 10], field1491[field1490 + 5], field1491[field1490 + 2], var120[field1491[field1490 + 1]], var119[field1491[field1490]]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1490 -= 3;
                    class259.method1549(256, (byte) -46, field1491[field1490 + 1], field1491[field1490], 255, field1491[field1490 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class50.method291(-6666, 50, field1491[--field1490], 255);
                    return;
                }
                if (arg0 == 3202) {
                    field1490 -= 2;
                    class390.method2403(255, field1491[field1490 + 1], field1491[field1490], (byte) 77);
                    return;
                }
                if (arg0 == 3203) {
                    field1490 -= 4;
                    class259.method1549(256, (byte) -46, field1491[field1490 + 1], field1491[field1490], field1491[field1490 + 3], field1491[field1490 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field1490 -= 3;
                    class50.method291(-6666, field1491[field1490 + 2], field1491[field1490], field1491[field1490 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field1490 -= 3;
                    class390.method2403(field1491[field1490 + 2], field1491[field1490 + 1], field1491[field1490], (byte) 77);
                    return;
                }
                if (arg0 == 3206) {
                    field1490 -= 4;
                    class54.method305(field1491[field1490 + 2], false, field1491[field1490 + 1], true, 256, field1491[field1490], field1491[field1490 + 3]);
                    return;
                }
                if (arg0 == 3207) {
                    field1490 -= 4;
                    class54.method305(field1491[field1490 + 2], true, field1491[field1490 + 1], true, 256, field1491[field1490], field1491[field1490 + 3]);
                    return;
                }
                if (arg0 == 3208) {
                    field1490 -= 5;
                    class259.method1549(field1491[field1490 + 4], (byte) -46, field1491[field1490 + 1], field1491[field1490], field1491[field1490 + 3], field1491[field1490 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field1490 -= 5;
                    class54.method305(field1491[field1490 + 2], false, field1491[field1490 + 1], true, field1491[field1490 + 4], field1491[field1490], field1491[field1490 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1491[field1490++] = class392.field5398;
                    return;
                }
                if (arg0 == 3301) {
                    field1490 -= 2;
                    int var121 = field1491[field1490];
                    int var122 = field1491[field1490 + 1];
                    field1491[field1490++] = class756.method4206(var122, true, false, var121);
                    return;
                }
                if (arg0 == 3302) {
                    field1490 -= 2;
                    int var123 = field1491[field1490];
                    int var124 = field1491[field1490 + 1];
                    field1491[field1490++] = class398.method2440(var123, false, var124, 0);
                    return;
                }
                if (arg0 == 3303) {
                    field1490 -= 2;
                    int var125 = field1491[field1490];
                    int var126 = field1491[field1490 + 1];
                    field1491[field1490++] = class567.method3300(false, var125, 4730, var126);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field1491[--field1490];
                    field1491[field1490++] = class740.field10336.method2876((byte) -54, var127).field2204;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field1491[--field1490];
                    field1491[field1490++] = class479.field6841[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field1491[--field1490];
                    field1491[field1490++] = class126.field1321[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field1491[--field1490];
                    field1491[field1490++] = class663.field9439[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class90.field937.field4628;
                    int var132 = (class90.field937.field4635 >> 9) + class464.field6624;
                    int var133 = (class90.field937.field4629 >> 9) + class181.field2144;
                    field1491[field1490++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field1491[--field1490];
                    field1491[field1490++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field1491[--field1490];
                    field1491[field1490++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field1491[--field1490];
                    field1491[field1490++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1491[field1490++] = class511.field7290 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1490 -= 2;
                    int var137 = field1491[field1490];
                    int var138 = field1491[field1490 + 1];
                    field1491[field1490++] = class756.method4206(var138, true, true, var137);
                    return;
                }
                if (arg0 == 3314) {
                    field1490 -= 2;
                    int var139 = field1491[field1490];
                    int var140 = field1491[field1490 + 1];
                    field1491[field1490++] = class398.method2440(var139, true, var140, 0);
                    return;
                }
                if (arg0 == 3315) {
                    field1490 -= 2;
                    int var141 = field1491[field1490];
                    int var142 = field1491[field1490 + 1];
                    field1491[field1490++] = class567.method3300(true, var141, 4730, var142);
                    return;
                }
                if (arg0 == 3316) {
                    if (class58.field594 >= 2) {
                        field1491[field1490++] = class58.field594;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1491[field1490++] = class122.field1276;
                    return;
                }
                if (arg0 == 3318) {
                    field1491[field1490++] = class76.field802.field6435;
                    return;
                }
                if (arg0 == 3321) {
                    field1491[field1490++] = class345.field4478;
                    return;
                }
                if (arg0 == 3322) {
                    field1491[field1490++] = class198.field2305;
                    return;
                }
                if (arg0 == 3323) {
                    if (class153.field1678 >= 5 && class153.field1678 <= 9) {
                        field1491[field1490++] = 1;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class153.field1678 >= 5 && class153.field1678 <= 9) {
                        field1491[field1490++] = class153.field1678;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1491[field1490++] = class722.field10120 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1491[field1490++] = class90.field937.field2174;
                    return;
                }
                if (arg0 == 3327) {
                    field1491[field1490++] = class90.field937.field2201.field6235 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1491[field1490++] = class550.field7899 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field1491[--field1490];
                    field1491[field1490++] = class154.method942(false, var143, 0);
                    return;
                }
                if (arg0 == 3331) {
                    field1490 -= 2;
                    int var144 = field1491[field1490];
                    int var145 = field1491[field1490 + 1];
                    field1491[field1490++] = class375.method2183(0, false, false, var145, var144);
                    return;
                }
                if (arg0 == 3332) {
                    field1490 -= 2;
                    int var146 = field1491[field1490];
                    int var147 = field1491[field1490 + 1];
                    field1491[field1490++] = class375.method2183(0, false, true, var147, var146);
                    return;
                }
                if (arg0 == 3333) {
                    field1491[field1490++] = class126.field1328;
                    return;
                }
                if (arg0 == 3335) {
                    field1491[field1490++] = class489.field6978;
                    return;
                }
                if (arg0 == 3336) {
                    field1490 -= 4;
                    int var148 = field1491[field1490];
                    int var149 = field1491[field1490 + 1];
                    int var150 = field1491[field1490 + 2];
                    int var151 = field1491[field1490 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field1491[field1490++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field1491[field1490++] = class519.field7378;
                    return;
                }
                if (arg0 == 3338) {
                    field1491[field1490++] = class61.method467(-65536);
                    return;
                }
                if (arg0 == 3339) {
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field1491[field1490++] = class579.field8197 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field1491[field1490++] = class185.field2211 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field1491[field1490++] = class353.field4537.method694((byte) -73);
                    return;
                }
                if (arg0 == 3343) {
                    field1491[field1490++] = class353.field4537.method691((byte) -105);
                    return;
                }
                if (arg0 == 3344) {
                    field1496[field1501++] = class82.method574((byte) -63);
                    return;
                }
                if (arg0 == 3345) {
                    field1496[field1501++] = class230.method1332(18693);
                    return;
                }
                if (arg0 == 3346) {
                    field1491[field1490++] = class663.method3771(0);
                    return;
                }
                if (arg0 == 3347) {
                    field1491[field1490++] = class683.field9667;
                    return;
                }
                if (arg0 == 3349) {
                    field1491[field1490++] = class90.field937.field7166.method4141(-2117887806) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1490 -= 2;
                    int var155 = field1491[field1490];
                    int var156 = field1491[field1490 + 1];
                    class633 var157 = class279.field3429.method1388(var155, 1);
                    field1496[field1501++] = var157.method3631(var156, false);
                    return;
                }
                if (arg0 == 3408) {
                    field1490 -= 4;
                    int var158 = field1491[field1490];
                    int var159 = field1491[field1490 + 1];
                    int var160 = field1491[field1490 + 2];
                    int var161 = field1491[field1490 + 3];
                    class633 var162 = class279.field3429.method1388(var160, 1);
                    if (var162.field9104 == var158 && var162.field9100 == var159) {
                        if (var159 == 115) {
                            field1496[field1501++] = var162.method3631(var161, false);
                            return;
                        }
                        field1491[field1490++] = var162.method3629((byte) 83, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field1490 -= 3;
                    int var163 = field1491[field1490];
                    int var164 = field1491[field1490 + 1];
                    int var165 = field1491[field1490 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class633 var166 = class279.field3429.method1388(var164, 1);
                    if (var166.field9100 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1491[field1490++] = var166.method3630(var165, -83) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field1491[--field1490];
                    String var168 = field1496[--field1501];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class633 var169 = class279.field3429.method1388(var167, 1);
                    if (var169.field9100 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1491[field1490++] = var169.method3634(var168, -6) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field1491[--field1490];
                    class633 var171 = class279.field3429.method1388(var170, 1);
                    field1491[field1490++] = var171.field9097.method1752(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class96.field1011 == 0) {
                        field1491[field1490++] = -2;
                        return;
                    }
                    if (class96.field1011 == 1) {
                        field1491[field1490++] = -1;
                        return;
                    }
                    field1491[field1490++] = class752.field10524;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field1491[--field1490];
                    if (class96.field1011 == 2 && var172 < class752.field10524) {
                        field1496[field1501++] = class19.field175[var172];
                        if (class161.field1799[var172] != null) {
                            field1496[field1501++] = class161.field1799[var172];
                            return;
                        }
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = "";
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field1491[--field1490];
                    if (class96.field1011 == 2 && var173 < class752.field10524) {
                        field1491[field1490++] = class272.field3356[var173];
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field1491[--field1490];
                    if (class96.field1011 == 2 && var174 < class752.field10524) {
                        field1491[field1490++] = class342.field4440[var174];
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field1496[--field1501];
                    int var176 = field1491[--field1490];
                    class645.method3670(var175, var176, -2);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field1496[--field1501];
                    class40.method239(28, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field1496[--field1501];
                    class427.method2667(var178, true);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field1496[--field1501];
                    class295.method1756(false, (byte) 126, var179);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field1496[--field1501];
                    class364.method2125(var180, (byte) -83);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field1496[--field1501];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field1491[field1490++] = class177.method1095(var181, -32705) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field1491[--field1490];
                    if (class96.field1011 == 2 && var182 < class752.field10524) {
                        field1496[field1501++] = class667.field9492[var182];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class697.field9812 != null) {
                        field1496[field1501++] = class621.method3552(class697.field9812, -92);
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class697.field9812 != null) {
                        field1491[field1490++] = class422.field6150;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field1491[--field1490];
                    if (class697.field9812 != null && var183 < class422.field6150) {
                        field1496[field1501++] = class75.field795[var183].field9502;
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field1491[--field1490];
                    if (class697.field9812 != null && var184 < class422.field6150) {
                        field1491[field1490++] = class75.field795[var184].field9496;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field1491[--field1490];
                    if (class697.field9812 != null && var185 < class422.field6150) {
                        field1491[field1490++] = class75.field795[var185].field9506;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1491[field1490++] = class456.field6539;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field1496[--field1501];
                    class329.method1970(31, var186);
                    return;
                }
                if (arg0 == 3618) {
                    field1491[field1490++] = class23.field208;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field1496[--field1501];
                    class540.method3178(var187, 2317);
                    return;
                }
                if (arg0 == 3620) {
                    class582.method3351(28398);
                    return;
                }
                if (arg0 == 3621) {
                    if (class96.field1011 == 0) {
                        field1491[field1490++] = -1;
                        return;
                    }
                    field1491[field1490++] = class293.field3610;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field1491[--field1490];
                    if (class96.field1011 != 0 && var188 < class293.field3610) {
                        field1496[field1501++] = class178.field2089[var188];
                        if (class484.field6891[var188] != null) {
                            field1496[field1501++] = class484.field6891[var188];
                            return;
                        }
                        field1496[field1501++] = "";
                        return;
                    }
                    field1496[field1501++] = "";
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field1496[--field1501];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field1491[field1490++] = class652.method3698(0, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field1491[--field1490];
                    if (class75.field795 != null && var190 < class422.field6150 && class75.field795[var190].field9495.equalsIgnoreCase(class90.field937.field2157)) {
                        field1491[field1490++] = 1;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class494.field7000 != null) {
                        field1496[field1501++] = class494.field7000;
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field1491[--field1490];
                    if (class697.field9812 != null && var191 < class422.field6150) {
                        field1496[field1501++] = class75.field795[var191].field9501;
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field1491[--field1490];
                    if (class96.field1011 == 2 && var192 >= 0 && var192 < class752.field10524) {
                        field1491[field1490++] = class62.field632[var192] ? 1 : 0;
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field1496[--field1501];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field1491[field1490++] = class557.method3269((byte) 24, var193);
                    return;
                }
                if (arg0 == 3629) {
                    field1491[field1490++] = class389.field5383;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field1496[--field1501];
                    class295.method1756(true, (byte) 127, var194);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field1491[--field1490];
                    field1491[field1490++] = class730.field10211[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field1491[--field1490];
                    if (class697.field9812 != null && var196 < class422.field6150) {
                        field1496[field1501++] = class75.field795[var196].field9495;
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field1491[--field1490];
                    if (class96.field1011 != 0 && var197 < class293.field3610) {
                        field1496[field1501++] = class522.field7422[var197];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var198].method1547(8);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var199].field3158;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var200].field3152;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var201].field3155;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var202].field3151;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field1491[--field1490];
                    field1491[field1490++] = class637.field9153[var203].field3154;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field1491[--field1490];
                    int var205 = class637.field9153[var204].method1548((byte) -104);
                    field1491[field1490++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field1491[--field1490];
                    int var207 = class637.field9153[var206].method1548((byte) 109);
                    field1491[field1490++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field1491[--field1490];
                    int var209 = class637.field9153[var208].method1548((byte) -102);
                    field1491[field1490++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field1491[--field1490];
                    int var211 = class637.field9153[var210].method1548((byte) -95);
                    field1491[field1490++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1490 -= 2;
                    int var212 = field1491[field1490];
                    int var213 = field1491[field1490 + 1];
                    field1491[field1490++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field1490 -= 2;
                    int var214 = field1491[field1490];
                    int var215 = field1491[field1490 + 1];
                    field1491[field1490++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field1490 -= 2;
                    int var216 = field1491[field1490];
                    int var217 = field1491[field1490 + 1];
                    field1491[field1490++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field1490 -= 2;
                    int var218 = field1491[field1490];
                    int var219 = field1491[field1490 + 1];
                    field1491[field1490++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field1491[--field1490];
                    field1491[field1490++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field1491[--field1490];
                    field1491[field1490++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1490 -= 5;
                    int var222 = field1491[field1490];
                    int var223 = field1491[field1490 + 1];
                    int var224 = field1491[field1490 + 2];
                    int var225 = field1491[field1490 + 3];
                    int var226 = field1491[field1490 + 4];
                    field1491[field1490++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field1490 -= 2;
                    long var227 = (long) field1491[field1490];
                    long var229 = (long) field1491[field1490 + 1];
                    field1491[field1490++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field1490 -= 2;
                    int var231 = field1491[field1490];
                    int var232 = field1491[field1490 + 1];
                    field1491[field1490++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field1490 -= 2;
                    int var233 = field1491[field1490];
                    int var234 = field1491[field1490 + 1];
                    field1491[field1490++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1490 -= 2;
                    int var235 = field1491[field1490];
                    int var236 = field1491[field1490 + 1];
                    field1491[field1490++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1490 -= 2;
                    int var237 = field1491[field1490];
                    int var238 = field1491[field1490 + 1];
                    field1491[field1490++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field1490 -= 2;
                    int var239 = field1491[field1490];
                    int var240 = field1491[field1490 + 1];
                    if (var239 == 0) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    field1491[field1490++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field1490 -= 2;
                    int var241 = field1491[field1490];
                    int var242 = field1491[field1490 + 1];
                    if (var241 == 0) {
                        field1491[field1490++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field1491[field1490++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1491[field1490++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field1490 -= 2;
                    int var243 = field1491[field1490];
                    int var244 = field1491[field1490 + 1];
                    field1491[field1490++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field1490 -= 2;
                    int var245 = field1491[field1490];
                    int var246 = field1491[field1490 + 1];
                    field1491[field1490++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field1490 -= 2;
                    int var247 = field1491[field1490];
                    int var248 = field1491[field1490 + 1];
                    field1491[field1490++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field1490 -= 2;
                    int var249 = field1491[field1490];
                    int var250 = field1491[field1490 + 1];
                    field1491[field1490++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field1490 -= 3;
                    long var251 = (long) field1491[field1490];
                    long var253 = (long) field1491[field1490 + 1];
                    long var255 = (long) field1491[field1490 + 2];
                    field1491[field1490++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field1490 -= 2;
                    int var257 = field1491[field1490];
                    int var258 = field1491[field1490 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field1491[field1490++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field1491[field1490++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field1496[--field1501];
                    int var262 = field1491[--field1490];
                    field1496[field1501++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field1501 -= 2;
                    String var263 = field1496[field1501];
                    String var264 = field1496[field1501 + 1];
                    field1496[field1501++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field1496[--field1501];
                    int var266 = field1491[--field1490];
                    field1496[field1501++] = var265 + class421.method2640(var266, true, (byte) -48);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field1496[--field1501];
                    field1496[field1501++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1496[field1501++] = method854(field1491[--field1490]);
                    return;
                }
                if (arg0 == 4105) {
                    field1501 -= 2;
                    String var268 = field1496[field1501];
                    String var269 = field1496[field1501 + 1];
                    if (class90.field937.field2201 != null && class90.field937.field2201.field6235) {
                        field1496[field1501++] = var269;
                        return;
                    }
                    field1496[field1501++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field1491[--field1490];
                    field1496[field1501++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field1501 -= 2;
                    field1491[field1490++] = class37.method175(field1496[field1501 + 1], 2, class489.field6978, field1496[field1501]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field1496[--field1501];
                    field1490 -= 2;
                    int var272 = field1491[field1490];
                    int var273 = field1491[field1490 + 1];
                    class535 var274 = class353.method2088(class330.field4275, var273, 0, -77);
                    field1491[field1490++] = var274.method3136(class323.field4118, var271, 68, var272);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field1496[--field1501];
                    field1490 -= 2;
                    int var276 = field1491[field1490];
                    int var277 = field1491[field1490 + 1];
                    class535 var278 = class353.method2088(class330.field4275, var277, 0, -104);
                    field1491[field1490++] = var278.method3141(class323.field4118, (byte) -59, var275, var276);
                    return;
                }
                if (arg0 == 4110) {
                    field1501 -= 2;
                    String var279 = field1496[field1501];
                    String var280 = field1496[field1501 + 1];
                    if (field1491[--field1490] == 1) {
                        field1496[field1501++] = var279;
                        return;
                    }
                    field1496[field1501++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field1496[--field1501];
                    field1496[field1501++] = class417.method2555(-1317272632, var281);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field1496[--field1501];
                    int var283 = field1491[--field1490];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1496[field1501++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field1491[--field1490];
                    field1491[field1490++] = method861((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field1491[--field1490];
                    field1491[field1490++] = class412.method2524(48, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field1491[--field1490];
                    field1491[field1490++] = class208.method1242((char) var286, -128) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field1491[--field1490];
                    field1491[field1490++] = class730.method4070(-126, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field1496[--field1501];
                    if (var288 != null) {
                        field1491[field1490++] = var288.length();
                        return;
                    }
                    field1491[field1490++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field1496[--field1501];
                    field1490 -= 2;
                    int var290 = field1491[field1490];
                    int var291 = field1491[field1490 + 1];
                    field1496[field1501++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field1496[--field1501];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field1496[field1501++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field1496[--field1501];
                    field1490 -= 2;
                    int var298 = field1491[field1490];
                    int var299 = field1491[field1490 + 1];
                    field1491[field1490++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field1501 -= 2;
                    String var300 = field1496[field1501];
                    String var301 = field1496[field1501 + 1];
                    int var302 = field1491[--field1490];
                    field1491[field1490++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field1491[--field1490];
                    field1491[field1490++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field1491[--field1490];
                    field1491[field1490++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field1491[--field1490] != 0;
                    int var306 = field1491[--field1490];
                    field1496[field1501++] = class347.method2065(class489.field6978, 0, (byte) 12, var305, (long) var306);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field1496[--field1501];
                    int var308 = field1491[--field1490];
                    class535 var309 = class353.method2088(class330.field4275, var308, 0, -100);
                    field1491[field1490++] = var309.method3139(49, var307, class323.field4118);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field1491[--field1490];
                    field1496[field1501++] = class361.field4643.method912((byte) 1, var310).field6294;
                    return;
                }
                if (arg0 == 4201) {
                    field1490 -= 2;
                    int var311 = field1491[field1490];
                    int var312 = field1491[field1490 + 1];
                    class431 var313 = class361.field4643.method912((byte) 1, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field6281[var312 - 1] != null) {
                        field1496[field1501++] = var313.field6281[var312 - 1];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1490 -= 2;
                    int var314 = field1491[field1490];
                    int var315 = field1491[field1490 + 1];
                    class431 var316 = class361.field4643.method912((byte) 1, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field6253[var315 - 1] != null) {
                        field1496[field1501++] = var316.field6253[var315 - 1];
                        return;
                    }
                    field1496[field1501++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field1491[--field1490];
                    field1491[field1490++] = class361.field4643.method912((byte) 1, var317).field6251;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field1491[--field1490];
                    field1491[field1490++] = class361.field4643.method912((byte) 1, var318).field6297 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field1491[--field1490];
                    class431 var320 = class361.field4643.method912((byte) 1, var319);
                    if (var320.field6319 == -1 && var320.field6313 >= 0) {
                        field1491[field1490++] = var320.field6313;
                        return;
                    }
                    field1491[field1490++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field1491[--field1490];
                    class431 var322 = class361.field4643.method912((byte) 1, var321);
                    if (var322.field6319 >= 0 && var322.field6313 >= 0) {
                        field1491[field1490++] = var322.field6313;
                        return;
                    }
                    field1491[field1490++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field1491[--field1490];
                    field1491[field1490++] = class361.field4643.method912((byte) 1, var323).field6277 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1490 -= 2;
                    int var324 = field1491[field1490];
                    int var325 = field1491[field1490 + 1];
                    class703 var326 = class84.field884.method98(true, var325);
                    if (var326.method3946((byte) -100)) {
                        field1496[field1501++] = class361.field4643.method912((byte) 1, var324).method2708(var326.field9901, (byte) 126, var325);
                        return;
                    }
                    field1491[field1490++] = class361.field4643.method912((byte) 1, var324).method2710(0, var325, var326.field9906);
                    return;
                }
                if (arg0 == 4209) {
                    field1490 -= 2;
                    int var327 = field1491[field1490];
                    int var328 = field1491[field1490 + 1] - 1;
                    class431 var329 = class361.field4643.method912((byte) 1, var327);
                    if (var329.field6330 == var328) {
                        field1491[field1490++] = var329.field6252;
                        return;
                    }
                    if (var329.field6298 == var328) {
                        field1491[field1490++] = var329.field6278;
                        return;
                    }
                    field1491[field1490++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field1496[--field1501];
                    int var331 = field1491[--field1490];
                    class413.method2528((byte) 89, var330, var331 == 1);
                    field1491[field1490++] = class605.field8607;
                    return;
                }
                if (arg0 == 4211) {
                    if (class406.field5552 != null && class707.field9972 < class605.field8607) {
                        field1491[field1490++] = class406.field5552[class707.field9972++] & 0xFFFF;
                        return;
                    }
                    field1491[field1490++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class707.field9972 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field1491[--field1490];
                    field1491[field1490++] = class361.field4643.method912((byte) 1, var332).field6264;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field1496[--field1501];
                    field1490 -= 3;
                    int var334 = field1491[field1490];
                    int var335 = field1491[field1490 + 1];
                    int var336 = field1491[field1490 + 2];
                    class484.method2926(var336, var334 == 1, var335, true, var333);
                    field1491[field1490++] = class605.field8607;
                    return;
                }
                if (arg0 == 4215) {
                    field1501 -= 2;
                    field1490 -= 2;
                    String var337 = field1496[field1501];
                    int var338 = field1491[field1490];
                    int var339 = field1491[field1490 + 1];
                    String var340 = field1496[field1501 + 1];
                    class350.method2077(var339, var340, var338 == 1, -121, var337);
                    field1491[field1490++] = class605.field8607;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1490 -= 2;
                    int var341 = field1491[field1490];
                    int var342 = field1491[field1490 + 1];
                    class703 var343 = class84.field884.method98(true, var342);
                    if (var343.method3946((byte) -100)) {
                        field1496[field1501++] = class451.field6506.method136(245, var341).method1940(12045, var342, var343.field9901);
                        return;
                    }
                    field1491[field1490++] = class451.field6506.method136(245, var341).method1946(var343.field9906, var342, (byte) -124);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1490 -= 2;
                    int var344 = field1491[field1490];
                    int var345 = field1491[field1490 + 1];
                    class703 var346 = class84.field884.method98(true, var345);
                    if (var346.method3946((byte) -100)) {
                        field1496[field1501++] = class445.field6442.method3972((byte) 121, var344).method1883((byte) 73, var345, var346.field9901);
                        return;
                    }
                    field1491[field1490++] = class445.field6442.method3972((byte) 108, var344).method1899(var346.field9906, var345, -117);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1490 -= 2;
                    int var347 = field1491[field1490];
                    int var348 = field1491[field1490 + 1];
                    class703 var349 = class84.field884.method98(true, var348);
                    if (var349.method3946((byte) -100)) {
                        field1496[field1501++] = class724.field10140.method4099(26, var347).method2944(81, var348, var349.field9901);
                        return;
                    }
                    field1491[field1490++] = class724.field10140.method4099(26, var347).method2946(var349.field9906, var348, -12214);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field1491[--field1490];
                class255 var351 = class182.field2148.method2676(var350, 70);
                if (var351.field3112 != null && var351.field3112.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field3075[0];
                    for (int var354 = 1; var354 < var351.field3112.length; var354++) {
                        if (var351.field3075[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field3075[var354];
                        }
                    }
                    field1491[field1490++] = var351.field3112[var352];
                    return;
                }
                field1491[field1490++] = var351.field3074;
                return;
            }
        } else {
            class532 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class269.method1608((byte) -72, field1491[--field1490]);
            } else {
                var51 = arg1 ? field1494 : field1492;
            }
            if (arg0 == 1300) {
                int var52 = field1491[--field1490] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method3126(29548, var52, field1496[--field1501]);
                    return;
                }
                field1501--;
                return;
            }
            if (arg0 == 1301) {
                field1490 -= 2;
                int var53 = field1491[field1490];
                int var54 = field1491[field1490 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field7698 = null;
                    return;
                }
                var51.field7698 = class689.method3895((byte) 126, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field1491[--field1490];
                if (class411.field5617 != var55 && class62.field641 != var55 && class98.field1028 != var55) {
                    return;
                }
                var51.field7556 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field7660 = field1491[--field1490];
                return;
            }
            if (arg0 == 1304) {
                var51.field7589 = field1491[--field1490];
                return;
            }
            if (arg0 == 1305) {
                var51.field7666 = field1496[--field1501];
                return;
            }
            if (arg0 == 1306) {
                var51.field7566 = field1496[--field1501];
                return;
            }
            if (arg0 == 1307) {
                var51.field7545 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field7599 = field1491[--field1490];
                var51.field7550 = field1491[--field1490];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field1491[--field1490];
                int var57 = field1491[--field1490];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method3121(var57 - 1, var56, 57);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field7602 = field1496[--field1501];
                return;
            }
            if (arg0 == 1311) {
                var51.field7651 = field1491[--field1490];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field1490 -= 3;
                    var58 = field1491[field1490] - 1;
                    var59 = field1491[field1490 + 1];
                    var60 = field1491[field1490 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1490 -= 2;
                    var58 = 10;
                    var59 = field1491[field1490];
                    var60 = field1491[field1490 + 1];
                }
                if (var51.field7553 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field7553 = new byte[11];
                    var51.field7684 = new byte[11];
                    var51.field7625 = new int[11];
                }
                var51.field7553[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field7558 = false;
                    for (int var61 = 0; var61 < var51.field7553.length; var61++) {
                        if (var51.field7553[var61] != 0) {
                            var51.field7558 = true;
                            break;
                        }
                    }
                } else {
                    var51.field7558 = true;
                }
                var51.field7684[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field7590 = field1491[--field1490];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lpaa;I)V")
    private static final void method857(class622 arg0, int arg1) {
        Object[] var2 = arg0.field8904;
        int var3 = (Integer) var2[0];
        class85 var4 = class417.method2584((byte) -97, var3);
        if (var4 == null) {
            return;
        }
        field1489 = new int[var4.field890];
        int var5 = 0;
        field1500 = new String[var4.field891];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field8910;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field8914;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field8908 == null ? -1 : arg0.field8908.field7704;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field8913;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field8908 == null ? -1 : arg0.field8908.field7628;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field8907 == null ? -1 : arg0.field8907.field7704;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field8907 == null ? -1 : arg0.field8907.field7628;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field8909;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field8906;
                }
                field1489[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field8915;
                }
                field1500[var6++] = var9;
            }
        }
        field1514 = arg0.field8905;
        method850(var4, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public static final void method858() {
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lpaa;)V")
    public static final void method859(class622 arg0) {
        method857(arg0, 200000);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    private static final void method860(int arg0) {
        class532 var1 = class269.method1608((byte) -72, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class532[] var3 = class286.field3496[var2];
        if (var3 == null) {
            class532[] var4 = class643.field9209[var2];
            int var5 = var4.length;
            var3 = class286.field3496[var2] = new class532[var5];
            class143.method892(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class143.method892(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(C)I")
    private static final int method861(char arg0) {
        return class555.method3255(2, arg0) ? 1 : 0;
    }
}
