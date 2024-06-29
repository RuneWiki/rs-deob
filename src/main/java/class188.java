import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class188 {

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    private static int field2582 = 0;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    private static int field2576 = 0;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
    private static int field2589 = 0;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "[I")
    private static int[] field2586 = new int[1000];

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "[I")
    private static int[] field2596 = new int[5];

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field2581 = new String[1000];

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "[Lpb;")
    private static class657[] field2598 = new class657[50];

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "[[I")
    private static int[][] field2600 = new int[5][5000];

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2599 = Calendar.getInstance();

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "[I")
    private static int[] field2601 = new int[3];

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "[Ljava/lang/String;")
    private static String[] field2603 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "Lde;")
    public static class534 field2602 = new class534(4);

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
    private static int field2604 = 0;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lria;")
    private static class288 field2577;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lria;")
    private static class288 field2588;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "Lth;")
    private static class598 field2595;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "[I")
    private static int[] field2578;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field2580;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V", line = 4)
    private static final void method1260(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2586[field2582++] = class356.field4574;
                return;
            }
            if (arg0 == 5001) {
                field2582 -= 3;
                class356.field4574 = field2586[field2582];
                class169.field2359 = class435.method2478(0, field2586[field2582 + 1]);
                if (class169.field2359 == null) {
                    class169.field2359 = class742.field10359;
                }
                class587.field8220 = field2586[field2582 + 2];
                field2583++;
                class589 var2 = class514.method2994(-29488, class760.field10605, class195.field2672);
                var2.field8251.method2578(class356.field4574, -1221492240);
                var2.field8251.method2578(class169.field2359.field7094, -1221492240);
                var2.field8251.method2578(class587.field8220, -1221492240);
                class737.method4107(var2, 7);
                return;
            }
            if (arg0 == 5002) {
                field2589 -= 2;
                String var3 = field2581[field2589];
                String var4 = field2581[field2589 + 1];
                field2582 -= 2;
                int var5 = field2586[field2582];
                int var6 = field2586[field2582 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2594++;
                class589 var7 = class514.method2994(-29488, class760.field10605, class655.field9115);
                var7.field8251.method2578(class747.method4155(-1, var3) + class747.method4155(-1, var4) + 2, -1221492240);
                var7.field8251.method2597(var3, (byte) 65);
                var7.field8251.method2578(var5 - 1, -1221492240);
                var7.field8251.method2578(var6, -1221492240);
                var7.field8251.method2597(var4, (byte) 91);
                class737.method4107(var7, 7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2586[--field2582];
                class630 var9 = class121.method930(var8, false);
                String var10 = "";
                if (var9 != null && var9.field8691 != null) {
                    var10 = var9.field8691;
                }
                field2581[field2589++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2586[--field2582];
                class630 var12 = class121.method930(var11, false);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8698;
                }
                field2586[field2582++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class169.field2359 == null) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = class169.field2359.field7094;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2586[--field2582];
                class589 var15 = class514.method2994(-29488, class760.field10605, class681.field9502);
                var15.field8251.method2578(var14, -1221492240);
                class737.method4107(var15, 7);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2581[--field2589];
                method1263(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2589 -= 2;
                String var17 = field2581[field2589];
                String var18 = field2581[field2589 + 1];
                if (class683.field9525 != 0 || (!class81.field1113 || class172.field2381) && !class165.field2314) {
                    field2592++;
                    class589 var19 = class514.method2994(-29488, class760.field10605, class651.field9043);
                    var19.field8251.method2578(0, -1221492240);
                    int var20 = var19.field8251.field6193;
                    var19.field8251.method2597(var17, (byte) 107);
                    class22.method139(var19.field8251, var18, 28108);
                    var19.field8251.method2581(-1, var19.field8251.field6193 - var20);
                    class737.method4107(var19, 7);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2586[--field2582];
                class630 var22 = class121.method930(var21, false);
                String var23 = "";
                if (var22 != null && var22.field8693 != null) {
                    var23 = var22.field8693;
                }
                field2581[field2589++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2586[--field2582];
                class630 var25 = class121.method930(var24, false);
                String var26 = "";
                if (var25 != null && var25.field8703 != null) {
                    var26 = var25.field8703;
                }
                field2581[field2589++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2586[--field2582];
                class630 var28 = class121.method930(var27, false);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8692;
                }
                field2586[field2582++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class380.field4847 == null || class380.field4847.field10064 == null) {
                    var30 = "";
                } else {
                    var30 = class380.field4847.method4038(false, true);
                }
                field2581[field2589++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2586[field2582++] = class587.field8220;
                return;
            }
            if (arg0 == 5017) {
                field2586[field2582++] = class466.method2660(-20139);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2586[--field2582];
                class630 var32 = class121.method930(var31, false);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8705;
                }
                field2586[field2582++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2586[--field2582];
                class630 var35 = class121.method930(var34, false);
                String var36 = "";
                if (var35 != null && var35.field8704 != null) {
                    var36 = var35.field8704;
                }
                field2581[field2589++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class380.field4847 == null || class380.field4847.field10064 == null) {
                    var37 = "";
                } else {
                    var37 = class380.field4847.method4041(-1, false);
                }
                field2581[field2589++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2586[--field2582];
                class630 var39 = class121.method930(var38, false);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8694;
                }
                field2586[field2582++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2586[--field2582];
                class630 var42 = class121.method930(var41, false);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8700;
                }
                field2586[field2582++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2586[--field2582];
                class630 var45 = class121.method930(var44, false);
                String var46 = "";
                if (var45 != null && var45.field8699 != null) {
                    var46 = var45.field8699;
                }
                field2581[field2589++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2586[--field2582];
                field2581[field2589++] = class602.field8368.method1486(var47, 125).field9449;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2586[--field2582];
                class676 var49 = class602.field8368.method1486(var48, 126);
                if (var49.field9441 == null) {
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = var49.field9441.length;
                return;
            }
            if (arg0 == 5052) {
                field2582 -= 2;
                int var50 = field2586[field2582];
                int var51 = field2586[field2582 + 1];
                class676 var52 = class602.field8368.method1486(var50, 123);
                int var53 = var52.field9441[var51];
                field2586[field2582++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2586[--field2582];
                class676 var55 = class602.field8368.method1486(var54, 125);
                if (var55.field9451 == null) {
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = var55.field9451.length;
                return;
            }
            if (arg0 == 5054) {
                field2582 -= 2;
                int var56 = field2586[field2582];
                int var57 = field2586[field2582 + 1];
                field2586[field2582++] = class602.field8368.method1486(var56, 127).field9451[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2586[--field2582];
                field2581[field2589++] = class609.field8450.method227(11041, var58).method1253((byte) -118);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2586[--field2582];
                class187 var60 = class609.field8450.method227(11041, var59);
                if (var60.field2571 == null) {
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = var60.field2571.length;
                return;
            }
            if (arg0 == 5057) {
                field2582 -= 2;
                int var61 = field2586[field2582];
                int var62 = field2586[field2582 + 1];
                field2586[field2582++] = class609.field8450.method227(11041, var61).field2571[var62];
                return;
            }
            if (arg0 == 5058) {
                field2595 = new class598();
                field2595.field8341 = field2586[--field2582];
                field2595.field8342 = class609.field8450.method227(11041, field2595.field8341);
                field2595.field8339 = new int[field2595.field8342.method1250((byte) -50)];
                return;
            }
            if (arg0 == 5059) {
                field2587++;
                class589 var63 = class514.method2994(-29488, class760.field10605, class631.field8715);
                var63.field8251.method2578(0, -1221492240);
                int var64 = var63.field8251.field6193;
                var63.field8251.method2578(0, -1221492240);
                var63.field8251.method2620(field2595.field8341, false);
                field2595.field8342.method1252(field2595.field8339, 32768, var63.field8251);
                var63.field8251.method2581(-1, var63.field8251.field6193 - var64);
                class737.method4107(var63, 7);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2581[--field2589];
                field2584++;
                class589 var66 = class514.method2994(-29488, class760.field10605, class471.field6322);
                var66.field8251.method2578(0, -1221492240);
                int var67 = var66.field8251.field6193;
                var66.field8251.method2597(var65, (byte) 72);
                var66.field8251.method2620(field2595.field8341, false);
                field2595.field8342.method1252(field2595.field8339, 32768, var66.field8251);
                var66.field8251.method2581(-1, var66.field8251.field6193 - var67);
                class737.method4107(var66, 7);
                return;
            }
            if (arg0 == 5061) {
                field2587++;
                class589 var68 = class514.method2994(-29488, class760.field10605, class631.field8715);
                var68.field8251.method2578(0, -1221492240);
                int var69 = var68.field8251.field6193;
                var68.field8251.method2578(1, -1221492240);
                var68.field8251.method2620(field2595.field8341, false);
                field2595.field8342.method1252(field2595.field8339, 32768, var68.field8251);
                var68.field8251.method2581(-1, var68.field8251.field6193 - var69);
                class737.method4107(var68, 7);
                return;
            }
            if (arg0 == 5062) {
                field2582 -= 2;
                int var70 = field2586[field2582];
                int var71 = field2586[field2582 + 1];
                field2586[field2582++] = class602.field8368.method1486(var70, 122).field9450[var71];
                return;
            }
            if (arg0 == 5063) {
                field2582 -= 2;
                int var72 = field2586[field2582];
                int var73 = field2586[field2582 + 1];
                field2586[field2582++] = class602.field8368.method1486(var72, 124).field9452[var73];
                return;
            }
            if (arg0 == 5064) {
                field2582 -= 2;
                int var74 = field2586[field2582];
                int var75 = field2586[field2582 + 1];
                if (var75 == -1) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = class602.field8368.method1486(var74, 122).method3812((byte) 94, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field2582 -= 2;
                int var76 = field2586[field2582];
                int var77 = field2586[field2582 + 1];
                if (var77 == -1) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = class602.field8368.method1486(var76, 122).method3813(5902, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2586[--field2582];
                field2586[field2582++] = class609.field8450.method227(11041, var78).method1250((byte) -50);
                return;
            }
            if (arg0 == 5067) {
                field2582 -= 2;
                int var79 = field2586[field2582];
                int var80 = field2586[field2582 + 1];
                int var81 = class609.field8450.method227(11041, var79).method1258(14, var80).field8096;
                field2586[field2582++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2582 -= 2;
                int var82 = field2586[field2582];
                int var83 = field2586[field2582 + 1];
                field2595.field8339[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2582 -= 2;
                int var84 = field2586[field2582];
                int var85 = field2586[field2582 + 1];
                field2595.field8339[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2582 -= 3;
                int var86 = field2586[field2582];
                int var87 = field2586[field2582 + 1];
                int var88 = field2586[field2582 + 2];
                class187 var89 = class609.field8450.method227(11041, var86);
                if (var89.method1258(24, var87).field8096 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2586[field2582++] = var89.method1256(-1, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2581[--field2589];
                boolean var91 = field2586[--field2582] == 1;
                class678.method3825(16, var91, var90);
                field2586[field2582++] = class677.field9467;
                return;
            }
            if (arg0 == 5072) {
                if (class9.field129 != null && class425.field5710 < class677.field9467) {
                    field2586[field2582++] = class9.field129[class425.field5710++] & 0xFFFF;
                    return;
                }
                field2586[field2582++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class425.field5710 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class349.field4502.method207(86, 20541)) {
                    field2586[field2582++] = 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class349.field4502.method207(82, 20541)) {
                    field2586[field2582++] = 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class349.field4502.method207(81, 20541)) {
                    field2586[field2582++] = 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class743.method4136(field2586[--field2582], 29640);
                return;
            }
            if (arg0 == 5201) {
                field2586[field2582++] = class662.method3724(-1);
                return;
            }
            if (arg0 == 5205) {
                class108.method868(-111, field2586[--field2582], -1, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field2586[--field2582];
                class490 var93 = class73.method653(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = var93.field6965;
                return;
            }
            if (arg0 == 5207) {
                class490 var94 = class73.method666(field2586[--field2582]);
                if (var94 != null && var94.field6958 != null) {
                    field2581[field2589++] = var94.field6958;
                    return;
                }
                field2581[field2589++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2586[field2582++] = class475.field6390;
                field2586[field2582++] = class172.field2372;
                return;
            }
            if (arg0 == 5209) {
                field2586[field2582++] = class756.field10543 + class73.field1041;
                field2586[field2582++] = class73.field1042 + class687.field9571;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field2586[--field2582];
                class490 var96 = class73.method666(var95);
                if (var96 == null) {
                    field2586[field2582++] = 0;
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = var96.field6955 >> 14 & 0x3FFF;
                field2586[field2582++] = var96.field6955 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field2586[--field2582];
                class490 var98 = class73.method666(var97);
                if (var98 == null) {
                    field2586[field2582++] = 0;
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = var98.field6966 - var98.field6954;
                field2586[field2582++] = var98.field6969 - var98.field6971;
                return;
            }
            if (arg0 == 5212) {
                class344 var99 = class180.method1229(-14631);
                if (var99 == null) {
                    field2586[field2582++] = -1;
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = var99.field4349;
                int var100 = var99.field4345 << 28 | class73.field1041 + var99.field4353 << 14 | class73.field1042 + var99.field4347;
                field2586[field2582++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class344 var101 = class429.method2460(27684);
                if (var101 == null) {
                    field2586[field2582++] = -1;
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = var101.field4349;
                int var102 = var101.field4345 << 28 | class73.field1041 + var101.field4353 << 14 | class73.field1042 + var101.field4347;
                field2586[field2582++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field2586[--field2582];
                class490 var104 = class537.method3087((byte) -28);
                if (var104 != null) {
                    boolean var105 = var104.method2895(field2601, (byte) -46, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, var103 & 0x3FFF);
                    if (var105) {
                        class643.method3610(false, field2601[2], field2601[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2582 -= 2;
                int var106 = field2586[field2582];
                int var107 = field2586[field2582 + 1];
                class16 var108 = class73.method669(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class490 var110 = (class490) var108.method118(-30553); var110 != null; var110 = (class490) var108.method111(22548)) {
                    if (var110.field6965 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field2586[field2582++] = 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field2586[--field2582];
                class490 var112 = class73.method666(var111);
                if (var112 == null) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = var112.field6970;
                return;
            }
            if (arg0 == 5220) {
                field2586[field2582++] = class553.field7719 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field2586[--field2582];
                class643.method3610(false, var113 & 0x3FFF, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class490 var114 = class537.method3087((byte) -28);
                if (var114 != null) {
                    boolean var115 = var114.method2892((byte) 125, field2601, class73.field1042 + class687.field9571, class756.field10543 + class73.field1041);
                    if (var115) {
                        field2586[field2582++] = field2601[1];
                        field2586[field2582++] = field2601[2];
                        return;
                    }
                    field2586[field2582++] = -1;
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = -1;
                field2586[field2582++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2582 -= 2;
                int var116 = field2586[field2582];
                int var117 = field2586[field2582 + 1];
                class108.method868(-100, var116, var117 & 0x3FFF, var117 >> 14 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field2586[--field2582];
                class490 var119 = class537.method3087((byte) -28);
                if (var119 != null) {
                    boolean var120 = var119.method2895(field2601, (byte) -46, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, var118 & 0x3FFF);
                    if (var120) {
                        field2586[field2582++] = field2601[1];
                        field2586[field2582++] = field2601[2];
                        return;
                    }
                    field2586[field2582++] = -1;
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = -1;
                field2586[field2582++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field2586[--field2582];
                class490 var122 = class537.method3087((byte) -28);
                if (var122 != null) {
                    boolean var123 = var122.method2892((byte) 74, field2601, var121 & 0x3FFF, var121 >> 14 & 0x3FFF);
                    if (var123) {
                        field2586[field2582++] = field2601[1];
                        field2586[field2582++] = field2601[2];
                        return;
                    }
                    field2586[field2582++] = -1;
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = -1;
                field2586[field2582++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class663.method3741(-73, field2586[--field2582]);
                return;
            }
            if (arg0 == 5227) {
                field2582 -= 2;
                int var124 = field2586[field2582];
                int var125 = field2586[field2582 + 1];
                class108.method868(-73, var124, var125 & 0x3FFF, var125 >> 14 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class264.field3342 = field2586[--field2582] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2586[field2582++] = class264.field3342 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field2586[--field2582];
                class588.method3341(var126, (byte) -15);
                return;
            }
            if (arg0 == 5231) {
                field2582 -= 2;
                int var127 = field2586[field2582];
                boolean var128 = field2586[field2582 + 1] == 1;
                if (class758.field10580 != null) {
                    class168 var129 = class758.field10580.method1160((long) var127, 119);
                    if (var129 != null && !var128) {
                        var129.method1175(-2);
                        return;
                    }
                    if (var129 == null && var128) {
                        class168 var130 = new class168();
                        class758.field10580.method1153(var130, (long) var127, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field2586[--field2582];
                if (class758.field10580 != null) {
                    class168 var132 = class758.field10580.method1160((long) var131, 121);
                    field2586[field2582++] = var132 == null ? 0 : 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2582 -= 2;
                int var133 = field2586[field2582];
                boolean var134 = field2586[field2582 + 1] == 1;
                if (class730.field10159 != null) {
                    class168 var135 = class730.field10159.method1160((long) var133, 122);
                    if (var135 != null && !var134) {
                        var135.method1175(-2);
                        return;
                    }
                    if (var135 == null && var134) {
                        class168 var136 = new class168();
                        class730.field10159.method1153(var136, (long) var133, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field2586[--field2582];
                if (class730.field10159 != null) {
                    class168 var138 = class730.field10159.method1160((long) var137, 119);
                    field2586[field2582++] = var138 == null ? 0 : 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2586[field2582++] = class73.field1020 == null ? -1 : class73.field1020.field6965;
                return;
            }
            if (arg0 == 5236) {
                field2582 -= 2;
                int var139 = field2586[field2582];
                int var140 = field2586[field2582 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class631.method3545(var142, -1, var139, var141);
                if (var143 < 0) {
                    field2586[field2582++] = -1;
                    return;
                }
                field2586[field2582++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class429.method2458(255);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2582 -= 2;
                int var144 = field2586[field2582];
                int var145 = field2586[field2582 + 1];
                class318.method1876(var144, 0, false, 3, var145);
                field2586[field2582++] = class353.field4533 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class353.field4533 != null) {
                    class318.method1876(-1, 0, false, class748.field10451.field10407.method3441((byte) 125), -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class72[] var146 = class596.method3374(-1025);
                field2586[field2582++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field2586[--field2582];
                class72[] var148 = class596.method3374(-1025);
                field2586[field2582++] = var148[var147].field1004;
                field2586[field2582++] = var148[var147].field1009;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class329.field4203;
                int var150 = class506.field7128;
                int var151 = -1;
                class72[] var152 = class596.method3374(-1025);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class72 var154 = var152[var153];
                    if (var154.field1004 == var149 && var154.field1009 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field2586[field2582++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field2586[field2582++] = class120.method926(15492);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field2586[--field2582];
                if (var155 >= 1 && var155 <= 2) {
                    class318.method1876(-1, 0, false, var155, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2586[field2582++] = class748.field10451.field10407.method3441((byte) -101);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field2586[--field2582];
                if (var156 >= 1 && var156 <= 2) {
                    class748.field10451.method4150(class748.field10451.field10407, var156, -5);
                    class748.field10451.method4150(class748.field10451.field10387, var156, -5);
                    class472.method2688(-119);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2589 -= 2;
                String var157 = field2581[field2589];
                String var158 = field2581[field2589 + 1];
                int var159 = field2586[--field2582];
                field2579++;
                class589 var160 = class514.method2994(-29488, class760.field10605, class19.field340);
                var160.field8251.method2578(class747.method4155(-1, var157) + class747.method4155(-1, var158) + 1, -1221492240);
                var160.field8251.method2597(var157, (byte) 61);
                var160.field8251.method2597(var158, (byte) 108);
                var160.field8251.method2578(var159, -1221492240);
                class737.method4107(var160, 7);
                return;
            }
            if (arg0 == 5401) {
                field2582 -= 2;
                class295.field3891[field2586[field2582]] = (short) class551.method3201(256, field2586[field2582 + 1]);
                class21.field381.method1587(-11);
                class21.field381.method1582((byte) -128);
                class300.field3941.method3864(64);
                class433.method2476(102);
                return;
            }
            if (arg0 == 5405) {
                field2582 -= 2;
                int var161 = field2586[field2582];
                int var162 = field2586[field2582 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class622.field8567[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2582 -= 7;
                int var163 = field2586[field2582];
                int var164 = field2586[field2582 + 1] << 1;
                int var165 = field2586[field2582 + 2];
                int var166 = field2586[field2582 + 3];
                int var167 = field2586[field2582 + 4];
                int var168 = field2586[field2582 + 5];
                int var169 = field2586[field2582 + 6];
                if (var163 >= 0 && var163 < 2 && class622.field8567[var163] != null && var164 >= 0 && var164 < class622.field8567[var163].length) {
                    class622.field8567[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class622.field8567[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class622.field8567[field2586[--field2582]].length >> 1;
                field2586[field2582++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class353.field4533 != null) {
                    class318.method1876(-1, 0, false, class748.field10451.field10407.method3441((byte) -90), -1);
                }
                if (class731.field10179 != null) {
                    class548.method3187(true);
                    System.exit(0);
                    return;
                }
                String var171 = class106.field1535 == null ? class114.method895((byte) 58) : class106.field1535;
                class741.method4132(false, var171, class162.field2227, false, class748.field10451.field10399.method1924((byte) 94) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class310.field4084 != null) {
                    if (class310.field4084.field2540 == null) {
                        var172 = class268.method1595((byte) -120, class310.field4084.field2536);
                    } else {
                        var172 = (String) class310.field4084.field2540;
                    }
                }
                field2581[field2589++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field2586[field2582++] = class162.field2227.field6256 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class353.field4533 != null) {
                    class318.method1876(-1, 0, false, class748.field10451.field10407.method3441((byte) 70), -1);
                }
                String var173 = field2581[--field2589];
                boolean var174 = field2586[--field2582] == 1;
                String var175 = class114.method895((byte) 58) + var173;
                class741.method4132(var174, var175, class162.field2227, false, class748.field10451.field10399.method1924((byte) -64) == 1);
                return;
            }
            if (arg0 == 5422) {
                field2589 -= 2;
                String var176 = field2581[field2589];
                String var177 = field2581[field2589 + 1];
                int var178 = field2586[--field2582];
                if (var176.length() > 0) {
                    if (class589.field8253 == null) {
                        class589.field8253 = new String[class141.field2007[class293.field3867.field1416]];
                    }
                    class589.field8253[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class522.field7320 == null) {
                        class522.field7320 = new String[class141.field2007[class293.field3867.field1416]];
                    }
                    class522.field7320[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2581[--field2589]);
                return;
            }
            if (arg0 == 5424) {
                field2582 -= 11;
                class645.field8933 = field2586[field2582];
                class102.field1414 = field2586[field2582 + 1];
                class663.field9345 = field2586[field2582 + 2];
                class353.field4538 = field2586[field2582 + 3];
                class536.field7427 = field2586[field2582 + 4];
                class270.field3405 = field2586[field2582 + 5];
                class353.field4542 = field2586[field2582 + 6];
                class711.field9864 = field2586[field2582 + 7];
                class29.field516 = field2586[field2582 + 8];
                class649.field9014 = field2586[field2582 + 9];
                class87.field1205 = field2586[field2582 + 10];
                class268.field3369.method3154(class536.field7427, (byte) 98);
                class268.field3369.method3154(class270.field3405, (byte) 98);
                class268.field3369.method3154(class353.field4542, (byte) 98);
                class268.field3369.method3154(class711.field9864, (byte) 98);
                class268.field3369.method3154(class29.field516, (byte) 98);
                class450.field5958 = null;
                class724.field10107 = null;
                class209.field2764 = null;
                class590.field8272 = null;
                class180.field2524 = null;
                class584.field8170 = null;
                class402.field5098 = null;
                class744.field10371 = null;
                class697.field9709 = true;
                return;
            }
            if (arg0 == 5425) {
                class532.method3057(-18788);
                class697.field9709 = false;
                return;
            }
            if (arg0 == 5426) {
                field2582 -= 2;
                class603.field8397 = field2586[field2582];
                class75.field1065 = field2586[field2582 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2582 -= 2;
                class38.field594 = field2586[field2582 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2582 -= 2;
                int var179 = field2586[field2582];
                int var180 = field2586[field2582 + 1];
                field2586[field2582++] = class72.method643(var180, -16, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class747.method4158(field2581[--field2589], -21091, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class568.method3263("accountcreated", class64.field900, false);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class568.method3263("accountcreatestarted", class64.field900, false);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (client.field3991 != null) {
                    Transferable var182 = client.field3991.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field2581[field2589++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class354.field4548 = field2586[--field2582];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2582 -= 4;
                int var183 = field2586[field2582];
                int var184 = field2586[field2582 + 1];
                int var185 = field2586[field2582 + 2];
                int var186 = field2586[field2582 + 3];
                class74.method670(var184 << 2, (var183 >> 14 & 0x3FFF) - class332.field4232, -126, false, var185, var186, (var183 & 0x3FFF) - class447.field5936);
                return;
            }
            if (arg0 == 5501) {
                field2582 -= 4;
                int var187 = field2586[field2582];
                int var188 = field2586[field2582 + 1];
                int var189 = field2586[field2582 + 2];
                int var190 = field2586[field2582 + 3];
                class422.method2349(var188 << 2, (var187 & 0x3FFF) - class447.field5936, -1025, (var187 >> 14 & 0x3FFF) - class332.field4232, var189, var190);
                return;
            }
            if (arg0 == 5502) {
                field2582 -= 6;
                int var191 = field2586[field2582];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class85.field1170 = var191;
                int var192 = field2586[field2582 + 1];
                if (var192 + 1 >= class622.field8567[class85.field1170].length >> 1) {
                    throw new RuntimeException();
                }
                class151.field2085 = var192;
                class212.field2800 = 0;
                class571.field8039 = field2586[field2582 + 2];
                class16.field326 = field2586[field2582 + 3];
                int var193 = field2586[field2582 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class459.field6112 = var193;
                int var194 = field2586[field2582 + 5];
                if (var194 + 1 >= class622.field8567[class459.field6112].length >> 1) {
                    throw new RuntimeException();
                }
                class505.field7123 = var194;
                class650.field9023 = 3;
                class35.field560 = -1;
                class746.field10437 = -1;
                return;
            }
            if (arg0 == 5503) {
                class726.method4050((byte) 26);
                return;
            }
            if (arg0 == 5504) {
                field2582 -= 2;
                class177.method1214(0, -5346, field2586[field2582], field2586[field2582 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field2586[field2582++] = (int) class101.field1404 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2586[field2582++] = (int) class521.field7309 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class285.method1698((byte) -106);
                return;
            }
            if (arg0 == 5508) {
                class172.method1189(-4);
                return;
            }
            if (arg0 == 5509) {
                class97.method782(0);
                return;
            }
            if (arg0 == 5510) {
                class601.method3405(1024);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field2586[--field2582];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class332.field4232;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class409.field5183) {
                    var198 = class409.field5183;
                }
                int var199 = var197 - class447.field5936;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class543.field7597) {
                    var199 = class543.field7597;
                }
                class289.field3789 = (var198 << 9) + 256;
                class116.field1724 = (var199 << 9) + 256;
                class650.field9023 = 4;
                class35.field560 = -1;
                class746.field10437 = -1;
                return;
            }
            if (arg0 == 5512) {
                class571.method3278((byte) 105);
                return;
            }
            if (arg0 == 5514) {
                class286.field3598 = field2586[--field2582];
                return;
            }
            if (arg0 == 5516) {
                field2586[field2582++] = class286.field3598;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field2586[--field2582];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class332.field4232;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class409.field5183) {
                        var203 = class409.field5183;
                    }
                    int var204 = var202 - class447.field5936;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class543.field7597) {
                        var204 = class543.field7597;
                    }
                    class746.field10437 = (var203 << 9) + 256;
                    class35.field560 = (var204 << 9) + 256;
                    return;
                }
                class746.field10437 = -1;
                class35.field560 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2589 -= 2;
                String var205 = field2581[field2589];
                String var206 = field2581[field2589 + 1];
                int var207 = field2586[--field2582];
                if (var205.length() > 320) {
                    return;
                }
                if (class27.field484 != 3) {
                    return;
                }
                if (class391.field4978 == 0 && class142.field2011 == 0) {
                    class310.field4085 = var205;
                    class721.field10041 = var206;
                    class622.field8563 = var207;
                    class571.method3275(27461, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class435.method2480(116);
                return;
            }
            if (arg0 == 5602) {
                if (class391.field4978 == 0) {
                    class456.field6076 = -2;
                    class117.field1727 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field2589--;
                if (class27.field484 != 3) {
                    return;
                }
                if (class391.field4978 == 0 && class142.field2011 == 0) {
                    class472.method2689(0, field2581[field2589]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2589 -= 2;
                field2582 -= 2;
                if (class27.field484 != 3) {
                    return;
                }
                if (class391.field4978 == 0 && class142.field2011 == 0) {
                    class7.method42(field2581[field2589], field2586[field2582 + 1] == 1, field2586[field2582], field2581[field2589 + 1], 35632);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class142.field2011 == 0) {
                    class692.field9626 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2586[field2582++] = class117.field1727;
                return;
            }
            if (arg0 == 5608) {
                field2586[field2582++] = class81.field1110;
                return;
            }
            if (arg0 == 5609) {
                field2586[field2582++] = class692.field9626;
                return;
            }
            if (arg0 == 5611) {
                field2586[field2582++] = class3.field27;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field2586[--field2582];
                if (class27.field484 != 7) {
                    return;
                }
                if (class391.field4978 == 0 && class142.field2011 == 0) {
                    if (class12.field143 != null) {
                        class12.field143.method2307(-1884375310);
                        class12.field143 = null;
                    }
                    class622.field8563 = var208;
                    class571.method3275(27461, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2586[field2582++] = class117.field1727;
                return;
            }
            if (arg0 == 5615) {
                field2589 -= 2;
                String var209 = field2581[field2589];
                String var210 = field2581[field2589 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class27.field484 != 3) {
                    return;
                }
                if (class391.field4978 == 0 && class142.field2011 == 0) {
                    if (class12.field143 != null) {
                        class12.field143.method2307(-1884375310);
                        class12.field143 = null;
                    }
                    class310.field4085 = var209;
                    class721.field10041 = var210;
                    class571.method3275(27461, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class98.method785((byte) -118, false);
                return;
            }
            if (arg0 == 5617) {
                field2586[field2582++] = class456.field6076;
                return;
            }
            if (arg0 == 5618) {
                field2582--;
                return;
            }
            if (arg0 == 5619) {
                field2582--;
                return;
            }
            if (arg0 == 5620) {
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2589 -= 2;
                field2582 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class318.field4114 != null) {
                    field2586[field2582++] = 1;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2586[field2582++] = (int) (class721.field10032 >> 32);
                field2586[field2582++] = (int) (class721.field10032 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field2586[field2582++] = class295.field3882 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class295.field3882 = true;
                class160.method1126(127);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field2586[--field2582];
                class748.field10451.method4150(class748.field10451.field10403, var211, -5);
                class540.method3099(3);
                class472.method2688(-121);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field2586[--field2582] == 1;
                class748.field10451.method4150(class748.field10451.field10421, var212 ? 1 : 0, -5);
                class748.field10451.method4150(class748.field10451.field10412, var212 ? 1 : 0, -5);
                class540.method3099(3);
                class582.method3316((byte) -94);
                class472.method2688(20);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field2586[--field2582] == 1;
                class748.field10451.method4150(class748.field10451.field10426, var213 ? 2 : 1, -5);
                class748.field10451.method4150(class748.field10451.field10393, var213 ? 2 : 1, -5);
                class582.method3316((byte) -94);
                class472.method2688(-121);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6005) {
                class748.field10451.method4150(class748.field10451.field10386, field2586[--field2582] == 1 ? 1 : 0, -5);
                class540.method3099(3);
                class472.method2688(-128);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6007) {
                class748.field10451.method4150(class748.field10451.field10392, field2586[--field2582], -5);
                class472.method2688(40);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6008) {
                class748.field10451.method4150(class748.field10451.field10390, field2586[--field2582] == 1 ? 1 : 0, -5);
                class472.method2688(-120);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6010) {
                class748.field10451.method4150(class748.field10451.field10406, field2586[--field2582] == 1 ? 1 : 0, -5);
                class472.method2688(-122);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6011) {
                class748.field10451.method4150(class748.field10451.field10410, field2586[--field2582], -5);
                class540.method3099(3);
                class472.method2688(92);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6012) {
                class748.field10451.method4150(class748.field10451.field10427, field2586[--field2582] == 1 ? 1 : 0, -5);
                class421.method2346(true);
                class421.method2347((byte) -47);
                class472.method2688(16);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6014) {
                class748.field10451.method4150(class748.field10451.field10414, field2586[--field2582] == 1 ? 2 : 0, -5);
                class540.method3099(3);
                class472.method2688(28);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6015) {
                class748.field10451.method4150(class748.field10451.field10418, field2586[--field2582] == 1 ? 1 : 0, -5);
                class540.method3099(3);
                class472.method2688(-126);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6016) {
                class748.field10451.method4150(class748.field10451.field10409, field2586[--field2582], -5);
                class415.method2331(false, class748.field10451.field10399.method1924((byte) 81), -4);
                class472.method2688(32);
                return;
            }
            if (arg0 == 6017) {
                class748.field10451.method4150(class748.field10451.field10408, field2586[--field2582] == 1 ? 1 : 0, -5);
                class442.method2508((byte) -104);
                class472.method2688(117);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6018) {
                class748.field10451.method4150(class748.field10451.field10434, field2586[--field2582], -5);
                class472.method2688(-124);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field2586[--field2582];
                int var215 = class748.field10451.field10402.method4186((byte) 99);
                if (var214 != var215) {
                    if (class102.method816(class27.field484, (byte) 125)) {
                        if (var215 == 0 && class309.field4068 != -1) {
                            class393.method2216(false, 0, class87.field1210, 0, var214, class309.field4068);
                            class638.method3575(-118);
                            class87.field1208 = false;
                        } else if (var214 == 0) {
                            class754.method4194(1);
                            class87.field1208 = false;
                        } else {
                            class729.method4070(var214, (byte) -119);
                        }
                    }
                    class748.field10451.method4150(class748.field10451.field10402, var214, -5);
                    class472.method2688(-115);
                    class332.field4236 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class748.field10451.method4150(class748.field10451.field10394, field2586[--field2582], -5);
                class472.method2688(-124);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class748.field10451.field10426.method1631((byte) -65);
                class748.field10451.method4150(class748.field10451.field10393, field2586[--field2582] == 1 ? 0 : var216, -5);
                class582.method3316((byte) -94);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field2586[--field2582];
                class748.field10451.method4150(class748.field10451.field10436, var217, -5);
                class472.method2688(-116);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6024) {
                class748.field10451.method4150(class748.field10451.field10389, field2586[--field2582], -5);
                class472.method2688(-114);
                return;
            }
            if (arg0 == 6025) {
                class748.field10451.method4150(class748.field10451.field10422, field2586[--field2582], -5);
                class472.method2688(-121);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field2586[--field2582];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class631.method3544(var218 == 1, (byte) 103);
                return;
            }
            if (arg0 == 6028) {
                class748.field10451.method4150(class748.field10451.field10396, field2586[--field2582] == 0 ? 0 : 1, -5);
                class472.method2688(-117);
                return;
            }
            if (arg0 == 6029) {
                class748.field10451.method4150(class748.field10451.field10392, field2586[--field2582], -5);
                class472.method2688(46);
                return;
            }
            if (arg0 == 6030) {
                class748.field10451.method4150(class748.field10451.field10405, field2586[--field2582] == 0 ? 0 : 1, -5);
                class472.method2688(-121);
                class540.method3099(3);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field2586[--field2582];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class415.method2331(false, var219, -4);
                return;
            }
            if (arg0 == 6032) {
                field2582 -= 2;
                int var220 = field2586[field2582];
                boolean var221 = field2586[field2582 + 1] == 1;
                class748.field10451.method4150(class748.field10451.field10400, var220, -5);
                if (!var221) {
                    class748.field10451.method4150(class748.field10451.field10430, 0, -5);
                }
                class472.method2688(53);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6033) {
                class748.field10451.method4150(class748.field10451.field10395, field2586[--field2582], -5);
                class472.method2688(-125);
                return;
            }
            if (arg0 == 6034) {
                class748.field10451.method4150(class748.field10451.field10420, field2586[--field2582] == 1 ? 1 : 0, -5);
                class472.method2688(48);
                class421.method2346(true);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class748.field10451.field10421.method1806((byte) -71);
                class748.field10451.method4150(class748.field10451.field10412, field2586[--field2582] == 1 ? 1 : var222, -5);
                class540.method3099(3);
                class582.method3316((byte) -94);
                return;
            }
            if (arg0 == 6036) {
                class748.field10451.method4150(class748.field10451.field10425, field2586[--field2582], -5);
                class472.method2688(-117);
                class508.field7164 = true;
                return;
            }
            if (arg0 == 6037) {
                class748.field10451.method4150(class748.field10451.field10428, field2586[--field2582], -5);
                class472.method2688(-128);
                class332.field4236 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field2586[--field2582];
                int var224 = class748.field10451.field10398.method4186((byte) 94);
                if (var223 != var224 && class359.field4655 == class309.field4068) {
                    if (!class102.method816(class27.field484, (byte) -121)) {
                        if (var224 == 0) {
                            class393.method2216(false, 0, class87.field1210, 0, var223, class309.field4068);
                            class638.method3575(21);
                            class87.field1208 = false;
                        } else if (var223 == 0) {
                            class754.method4194(1);
                            class87.field1208 = false;
                        } else {
                            class729.method4070(var223, (byte) -77);
                        }
                    }
                    class748.field10451.method4150(class748.field10451.field10398, var223, -5);
                    class472.method2688(63);
                    class332.field4236 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field2586[--field2582];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class748.field10451.field10415.method3188((byte) -123)) {
                    class748.field10451.method4150(class748.field10451.field10415, var225, -5);
                    class472.method2688(-119);
                    class332.field4236 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field2586[--field2582];
                if (var226 != class748.field10451.field10413.method1188((byte) 66)) {
                    class748.field10451.method4150(class748.field10451.field10413, var226, -5);
                    class472.method2688(-124);
                    class332.field4236 = false;
                    class427.method2450(0);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2586[field2582++] = class748.field10451.field10403.method1451((byte) -42);
                return;
            }
            if (arg0 == 6102) {
                field2586[field2582++] = class748.field10451.field10421.method1806((byte) 58) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2586[field2582++] = class748.field10451.field10426.method1631((byte) -78) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2586[field2582++] = class748.field10451.field10386.method3003((byte) 78) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2586[field2582++] = class748.field10451.field10392.method1294((byte) 113);
                return;
            }
            if (arg0 == 6108) {
                field2586[field2582++] = class748.field10451.field10390.method2246((byte) 55) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2586[field2582++] = class748.field10451.field10406.method3611((byte) -40) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2586[field2582++] = class748.field10451.field10410.method3447((byte) 112);
                return;
            }
            if (arg0 == 6112) {
                field2586[field2582++] = class748.field10451.field10427.method4196((byte) -92) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2586[field2582++] = class748.field10451.field10414.method2470((byte) 93) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2586[field2582++] = class748.field10451.field10418.method3928((byte) -75) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2586[field2582++] = class748.field10451.field10409.method3020((byte) 101);
                return;
            }
            if (arg0 == 6117) {
                field2586[field2582++] = class748.field10451.field10408.method1903((byte) -121) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2586[field2582++] = class748.field10451.field10434.method4186((byte) 68);
                return;
            }
            if (arg0 == 6119) {
                field2586[field2582++] = class748.field10451.field10402.method4186((byte) -67);
                return;
            }
            if (arg0 == 6120) {
                field2586[field2582++] = class748.field10451.field10394.method4186((byte) -128);
                return;
            }
            if (arg0 == 6123) {
                field2586[field2582++] = class482.method2772(-1630236671);
                return;
            }
            if (arg0 == 6124) {
                field2586[field2582++] = class748.field10451.field10389.method3020((byte) 72);
                return;
            }
            if (arg0 == 6125) {
                field2586[field2582++] = class748.field10451.field10422.method2332((byte) -82);
                return;
            }
            if (arg0 == 6127) {
                field2586[field2582++] = class748.field10451.field10416.method3100((byte) -81) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2586[field2582++] = class748.field10451.field10396.method3748((byte) -86) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2586[field2582++] = class748.field10451.field10392.method1294((byte) 60);
                return;
            }
            if (arg0 == 6130) {
                field2586[field2582++] = class748.field10451.field10405.method3198((byte) 70) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2586[field2582++] = class748.field10451.field10399.method1924((byte) -91);
                return;
            }
            if (arg0 == 6132) {
                field2586[field2582++] = class748.field10451.field10400.method1924((byte) 65);
                return;
            }
            if (arg0 == 6133) {
                field2586[field2582++] = class162.field2227.field6256 && !class162.field2227.field6235 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field2586[field2582++] = class748.field10451.field10395.method1045((byte) -47);
                return;
            }
            if (arg0 == 6136) {
                field2586[field2582++] = class748.field10451.field10420.method1877((byte) 62) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2586[field2582++] = class103.method819(class748.field10451.field10399.method1924((byte) 103), 200, (byte) -75);
                return;
            }
            if (arg0 == 6139) {
                field2586[field2582++] = class748.field10451.field10425.method4035((byte) 97);
                return;
            }
            if (arg0 == 6142) {
                field2586[field2582++] = class748.field10451.field10428.method4186((byte) 61);
                return;
            }
            if (arg0 == 6143) {
                field2586[field2582++] = class748.field10451.field10398.method4186((byte) -92);
                return;
            }
            if (arg0 == 6144) {
                field2586[field2582++] = class698.field9716 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2586[field2582++] = class748.field10451.field10415.method3188((byte) -39);
                return;
            }
            if (arg0 == 6146) {
                field2586[field2582++] = class748.field10451.field10413.method1188((byte) 87);
                return;
            }
            if (arg0 == 6147) {
                field2586[field2582++] = class323.field4162.field367 < 512 || class698.field9716 || class583.field8154 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field2586[field2582++] = class425.field5711 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2582 -= 2;
                class96.field1336 = (short) field2586[field2582];
                if (class96.field1336 <= 0) {
                    class96.field1336 = 256;
                }
                class292.field3853 = (short) field2586[field2582 + 1];
                if (class292.field3853 <= 0) {
                    class292.field3853 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2582 -= 2;
                class699.field9726 = (short) field2586[field2582];
                if (class699.field9726 <= 0) {
                    class699.field9726 = 256;
                }
                class324.field4171 = (short) field2586[field2582 + 1];
                if (class324.field4171 <= 0) {
                    class324.field4171 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2582 -= 4;
                class83.field1138 = (short) field2586[field2582];
                if (class83.field1138 <= 0) {
                    class83.field1138 = 1;
                }
                class86.field1194 = (short) field2586[field2582 + 1];
                if (class86.field1194 <= 0) {
                    class86.field1194 = 32767;
                } else if (class86.field1194 < class83.field1138) {
                    class86.field1194 = class83.field1138;
                }
                class335.field4257 = (short) field2586[field2582 + 2];
                if (class335.field4257 <= 0) {
                    class335.field4257 = 1;
                }
                class180.field2532 = (short) field2586[field2582 + 3];
                if (class180.field2532 <= 0) {
                    class180.field2532 = 32767;
                    return;
                }
                if (class180.field2532 < class335.field4257) {
                    class180.field2532 = class335.field4257;
                }
                return;
            }
            if (arg0 == 6203) {
                class526.method3042((byte) -110, class223.field2979.field3617, class223.field2979.field3714, 0, 0, false);
                field2586[field2582++] = class173.field2386;
                field2586[field2582++] = class321.field4144;
                return;
            }
            if (arg0 == 6204) {
                field2586[field2582++] = class699.field9726;
                field2586[field2582++] = class324.field4171;
                return;
            }
            if (arg0 == 6205) {
                field2586[field2582++] = class96.field1336;
                field2586[field2582++] = class292.field3853;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2586[field2582++] = (int) (class446.method2525(500) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2586[field2582++] = (int) (class446.method2525(500) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2582 -= 3;
                int var227 = field2586[field2582];
                int var228 = field2586[field2582 + 1];
                int var229 = field2586[field2582 + 2];
                field2599.clear();
                field2599.set(11, 12);
                field2599.set(var229, var228, var227);
                int var230 = (int) (field2599.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field2586[field2582++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field2599.clear();
                field2599.setTime(new Date(class446.method2525(500)));
                field2586[field2582++] = field2599.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field2586[--field2582];
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
                field2586[field2582++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2586[field2582++] = class402.method2243(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2586[field2582++] = class755.method4197((byte) -64) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class27.field484 == 7 && class391.field4978 == 0 && class142.field2011 == 0) {
                    if (class644.field8922) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    if (class76.field1066 > class446.method2525(500) - 1000L) {
                        field2586[field2582++] = 1;
                        return;
                    }
                    class644.field8922 = true;
                    class589 var233 = class514.method2994(-29488, class760.field10605, class321.field4141);
                    var233.field8251.method2568(class167.field2323, -535701016);
                    class737.method4107(var233, 7);
                    field2586[field2582++] = 0;
                    return;
                }
                field2586[field2582++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class138 var234 = class282.method1686(0);
                if (var234 != null) {
                    field2586[field2582++] = var234.field1979;
                    field2586[field2582++] = var234.field2102;
                    field2581[field2589++] = var234.field1975;
                    class761 var235 = var234.method1012(-2);
                    field2586[field2582++] = var235.field10611;
                    field2581[field2589++] = var235.field10617;
                    field2586[field2582++] = var234.field2101;
                    field2586[field2582++] = var234.field1978;
                    field2581[field2589++] = var234.field1977;
                    return;
                }
                field2586[field2582++] = -1;
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                return;
            }
            if (arg0 == 6502) {
                class138 var236 = class294.method1768(-125);
                if (var236 != null) {
                    field2586[field2582++] = var236.field1979;
                    field2586[field2582++] = var236.field2102;
                    field2581[field2589++] = var236.field1975;
                    class761 var237 = var236.method1012(-2);
                    field2586[field2582++] = var237.field10611;
                    field2581[field2589++] = var237.field10617;
                    field2586[field2582++] = var236.field2101;
                    field2586[field2582++] = var236.field1978;
                    field2581[field2589++] = var236.field1977;
                    return;
                }
                field2586[field2582++] = -1;
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field2586[--field2582];
                String var239 = field2581[--field2589];
                if (class27.field484 == 7 && class391.field4978 == 0 && class142.field2011 == 0) {
                    field2586[field2582++] = class657.method3704(var239, var238, -8755) ? 1 : 0;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field2586[--field2582];
                class138 var241 = class760.method4226(-92, var240);
                if (var241 != null) {
                    field2586[field2582++] = var241.field2102;
                    field2581[field2589++] = var241.field1975;
                    class761 var242 = var241.method1012(-2);
                    field2586[field2582++] = var242.field10611;
                    field2581[field2589++] = var242.field10617;
                    field2586[field2582++] = var241.field2101;
                    field2586[field2582++] = var241.field1978;
                    field2581[field2589++] = var241.field1977;
                    return;
                }
                field2586[field2582++] = -1;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                field2586[field2582++] = 0;
                field2586[field2582++] = 0;
                field2581[field2589++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2582 -= 4;
                int var243 = field2586[field2582];
                boolean var244 = field2586[field2582 + 1] == 1;
                int var245 = field2586[field2582 + 2];
                boolean var246 = field2586[field2582 + 3] == 1;
                class506.method2952(var244, var245, false, var243, var246);
                return;
            }
            if (arg0 == 6508) {
                class353.method2062(71);
                return;
            }
            if (arg0 == 6509) {
                if (class27.field484 != 7) {
                    return;
                }
                class193.field2651 = field2586[--field2582] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2586[field2582++] = class555.field7732;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class660.field9195 == class542.field7497) {
                if (arg0 == 6700) {
                    int var247 = class290.field3804.method1159((byte) -106);
                    if (class540.field7482 != -1) {
                        var247++;
                    }
                    field2586[field2582++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field2586[--field2582];
                    if (class540.field7482 != -1) {
                        if (var248 == 0) {
                            field2586[field2582++] = class540.field7482;
                            return;
                        }
                        var248--;
                    }
                    class491 var249 = (class491) class290.field3804.method1156(0);
                    while (var248-- > 0) {
                        var249 = (class491) class290.field3804.method1158(22706);
                    }
                    field2586[field2582++] = var249.field6978;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field2586[--field2582];
                    if (class218.field2938[var250] == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    String var251 = class218.field2938[var250][0].field3725;
                    if (var251 == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field2586[--field2582];
                    if (class218.field2938[var252] == null) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    field2586[field2582++] = class218.field2938[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field2582 -= 2;
                    int var253 = field2586[field2582];
                    int var254 = field2586[field2582 + 1];
                    if (class218.field2938[var253] == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    String var255 = class218.field2938[var253][var254].field3725;
                    if (var255 == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field2582 -= 2;
                    int var256 = field2586[field2582];
                    int var257 = field2586[field2582 + 1];
                    if (class218.field2938[var256] == null) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    field2586[field2582++] = class218.field2938[var256][var257].field3745;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field2582 -= 3;
                    int var258 = field2586[field2582];
                    int var259 = field2586[field2582 + 1];
                    int var260 = field2586[field2582 + 2];
                    class458.method2552(1, "", var258 << 16 | var259, false, var260);
                    return;
                }
                if (arg0 == 6708) {
                    field2582 -= 3;
                    int var261 = field2586[field2582];
                    int var262 = field2586[field2582 + 1];
                    int var263 = field2586[field2582 + 2];
                    class458.method2552(2, "", var261 << 16 | var262, false, var263);
                    return;
                }
                if (arg0 == 6709) {
                    field2582 -= 3;
                    int var264 = field2586[field2582];
                    int var265 = field2586[field2582 + 1];
                    int var266 = field2586[field2582 + 2];
                    class458.method2552(3, "", var264 << 16 | var265, false, var266);
                    return;
                }
                if (arg0 == 6710) {
                    field2582 -= 3;
                    int var267 = field2586[field2582];
                    int var268 = field2586[field2582 + 1];
                    int var269 = field2586[field2582 + 2];
                    class458.method2552(4, "", var267 << 16 | var268, false, var269);
                    return;
                }
                if (arg0 == 6711) {
                    field2582 -= 3;
                    int var270 = field2586[field2582];
                    int var271 = field2586[field2582 + 1];
                    int var272 = field2586[field2582 + 2];
                    class458.method2552(5, "", var270 << 16 | var271, false, var272);
                    return;
                }
                if (arg0 == 6712) {
                    field2582 -= 3;
                    int var273 = field2586[field2582];
                    int var274 = field2586[field2582 + 1];
                    int var275 = field2586[field2582 + 2];
                    class458.method2552(6, "", var273 << 16 | var274, false, var275);
                    return;
                }
                if (arg0 == 6713) {
                    field2582 -= 3;
                    int var276 = field2586[field2582];
                    int var277 = field2586[field2582 + 1];
                    int var278 = field2586[field2582 + 2];
                    class458.method2552(7, "", var276 << 16 | var277, false, var278);
                    return;
                }
                if (arg0 == 6714) {
                    field2582 -= 3;
                    int var279 = field2586[field2582];
                    int var280 = field2586[field2582 + 1];
                    int var281 = field2586[field2582 + 2];
                    class458.method2552(8, "", var279 << 16 | var280, false, var281);
                    return;
                }
                if (arg0 == 6715) {
                    field2582 -= 3;
                    int var282 = field2586[field2582];
                    int var283 = field2586[field2582 + 1];
                    int var284 = field2586[field2582 + 2];
                    class458.method2552(9, "", var282 << 16 | var283, false, var284);
                    return;
                }
                if (arg0 == 6716) {
                    field2582 -= 3;
                    int var285 = field2586[field2582];
                    int var286 = field2586[field2582 + 1];
                    int var287 = field2586[field2582 + 2];
                    class458.method2552(10, "", var285 << 16 | var286, false, var287);
                    return;
                }
                if (arg0 == 6717) {
                    field2582 -= 3;
                    int var288 = field2586[field2582];
                    int var289 = field2586[field2582 + 1];
                    int var290 = field2586[field2582 + 2];
                    class288 var291 = class466.method2658(var290, var288 << 16 | var289, 30639);
                    class522.method3033(34);
                    class262 var292 = client.method1833(var291);
                    class162.method1135(var292.field3297, var292.method1571(false), (byte) -40, var291);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field2586[--field2582];
                    class278 var294 = class424.field5399.method3085((byte) -122, var293);
                    if (var294.field3522 == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = var294.field3522;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field2586[--field2582];
                    class278 var296 = class424.field5399.method3085((byte) -122, var295);
                    field2586[field2582++] = var296.field3530;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field2586[--field2582];
                    class278 var298 = class424.field5399.method3085((byte) -122, var297);
                    field2586[field2582++] = var298.field3500;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field2586[--field2582];
                    class278 var300 = class424.field5399.method3085((byte) -122, var299);
                    field2586[field2582++] = var300.field3503;
                    return;
                }
                if (arg0 == 6804) {
                    field2582 -= 2;
                    int var301 = field2586[field2582];
                    int var302 = field2586[field2582 + 1];
                    class242 var303 = class513.field7206.method791((byte) -120, var302);
                    if (var303.method1515(115)) {
                        field2581[field2589++] = class424.field5399.method3085((byte) -122, var301).method1646(var302, -120, var303.field3131);
                        return;
                    }
                    field2586[field2582++] = class424.field5399.method3085((byte) -122, var301).method1648(var303.field3137, var302, (byte) 8);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field2586[field2582++] = class81.field1113 && !class172.field2381 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field2586[field2582++] = class410.field5227;
                    return;
                }
                if (arg0 == 6902) {
                    field2586[field2582++] = class658.field9160;
                    return;
                }
                if (arg0 == 6903) {
                    field2586[field2582++] = class571.field8043;
                    return;
                }
                if (arg0 == 6904) {
                    field2586[field2582++] = class8.field101;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class310.field4084 != null) {
                        if (class310.field4084.field2540 == null) {
                            var304 = class268.method1595((byte) 103, class310.field4084.field2536);
                        } else {
                            var304 = (String) class310.field4084.field2540;
                        }
                    }
                    field2581[field2589++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field2586[field2582++] = class366.field4711;
                    return;
                }
                if (arg0 == 6907) {
                    field2586[field2582++] = class717.field9984;
                    return;
                }
                if (arg0 == 6908) {
                    field2586[field2582++] = class39.field597;
                    return;
                }
                if (arg0 == 6909) {
                    field2586[field2582++] = class273.field3426 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field2586[field2582++] = class321.field4149;
                    return;
                }
                if (arg0 == 6911) {
                    field2586[field2582++] = class499.field7038;
                    return;
                }
                if (arg0 == 6912) {
                    field2586[field2582++] = class480.field6532;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class537.method3089(3);
                    field2586[field2582++] = class656.field9143 = class748.field10451.field10399.method1924((byte) 57);
                    field2586[field2582++] = var305;
                    class540.method3099(3);
                    class472.method2688(-126);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class109.method873(-92);
                    class540.method3099(3);
                    class472.method2688(109);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class651.method3652(false);
                    class540.method3099(3);
                    class472.method2688(115);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class614.method3437((byte) 66);
                    class540.method3099(3);
                    class472.method2688(7);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class699.method3932(0, true);
                    class540.method3099(3);
                    class472.method2688(121);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class748.field10451.method4150(class748.field10451.field10430, 0, -5);
                    class472.method2688(45);
                    class332.field4236 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class656.field9143 == 2) {
                        class290.field3802 = true;
                        return;
                    }
                    if (class656.field9143 == 1) {
                        class514.field7214 = true;
                        return;
                    }
                    if (class656.field9143 == 3) {
                        class712.field9879 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field2586[field2582++] = class748.field10451.field10430.method392((byte) -119);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field2582 -= 2;
                    int var306 = field2586[field2582];
                    int var307 = field2586[field2582 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class636.method3566(-77, false, var307, var306);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field2586[--field2582];
                    if (var308 != -1) {
                        class386.method2194(var308, 118);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field2586[--field2582];
                    if (var309 != -1) {
                        class257.method1562(var309, (byte) -40);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field2586[field2582++] = class566.method3255((byte) -41, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field2586[field2582++] = class748.field10451.field10386.method3000(97) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field2586[field2582++] = class748.field10451.field10406.method3612(17) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field2586[field2582++] = class748.field10451.field10410.method3448(16) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field2586[field2582++] = class748.field10451.field10414.method2471(65) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field2586[field2582++] = class748.field10451.field10389.method3022(-91) && class386.field4930.method519() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field2586[field2582++] = class748.field10451.field10436.method3327(27) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field2586[field2582++] = class748.field10451.field10422.method2328(103) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field2586[field2582++] = class748.field10451.field10416.method3097(-77) && class386.field4930.method490() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field2586[field2582++] = class748.field10451.field10405.method3197(-117) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field2586[field2582++] = class748.field10451.field10420.method1878(63) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field2586[field2582++] = class748.field10451.field10425.method4033(-88) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field2586[field2582++] = class748.field10451.field10418.method3926(-83) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field2586[field2582++] = class748.field10451.field10413.method1190(-93) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field2586[field2582++] = class748.field10451.field10400.method1921(-107) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10386.method391(3, var310);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10406.method391(3, var311);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10410.method391(3, var312);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10414.method391(3, var313);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field2586[--field2582];
                    if (!class386.field4930.method519()) {
                        field2586[field2582++] = 3;
                        return;
                    }
                    field2586[field2582++] = class748.field10451.field10389.method391(3, var314);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10436.method391(3, var315);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10422.method391(3, var316);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field2586[--field2582];
                    if (!class386.field4930.method490()) {
                        field2586[field2582++] = 3;
                        return;
                    }
                    field2586[field2582++] = class748.field10451.field10416.method391(3, var317);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10405.method391(3, var318);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10420.method391(3, var319);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10425.method391(3, var320);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10418.method391(3, var321);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10413.method391(3, var322);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field2586[--field2582];
                    field2586[field2582++] = class748.field10451.field10400.method391(3, var323);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IZ)V", line = 3737)
    private static final void method1261(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2582 -= 3;
                int var2 = field2586[field2582];
                int var3 = field2586[field2582 + 1];
                int var4 = field2586[field2582 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class288 var5 = class501.method2936(-82, var2);
                if (var5.field3779 == null) {
                    var5.field3779 = new class288[var4 + 1];
                }
                if (var5.field3779.length <= var4) {
                    class288[] var6 = new class288[var4 + 1];
                    for (int var7 = 0; var7 < var5.field3779.length; var7++) {
                        var6[var7] = var5.field3779[var7];
                    }
                    var5.field3779 = var6;
                }
                if (var4 > 0 && var5.field3779[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class288 var8 = new class288();
                var8.field3655 = var3;
                var8.field3743 = var8.field3696 = var5.field3696;
                var8.field3740 = var4;
                var5.field3779[var4] = var8;
                if (arg1) {
                    field2577 = var8;
                } else {
                    field2588 = var8;
                }
                class207.method1332((byte) -119, var5);
                return;
            }
            if (arg0 == 101) {
                class288 var9 = arg1 ? field2577 : field2588;
                if (var9.field3740 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class288 var10 = class501.method2936(-127, var9.field3696);
                var10.field3779[var9.field3740] = null;
                class207.method1332((byte) -119, var10);
                return;
            }
            if (arg0 == 102) {
                class288 var11 = class501.method2936(-49, field2586[--field2582]);
                var11.field3779 = null;
                class207.method1332((byte) -123, var11);
                return;
            }
            if (arg0 == 200) {
                field2582 -= 2;
                int var12 = field2586[field2582];
                int var13 = field2586[field2582 + 1];
                class288 var14 = class466.method2658(var13, var12, 30639);
                if (var14 != null && var13 != -1) {
                    field2586[field2582++] = 1;
                    if (arg1) {
                        field2577 = var14;
                        return;
                    }
                    field2588 = var14;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2586[--field2582];
                class288 var16 = class501.method2936(-106, var15);
                if (var16 != null) {
                    field2586[field2582++] = 1;
                    if (arg1) {
                        field2577 = var16;
                        return;
                    }
                    field2588 = var16;
                    return;
                }
                field2586[field2582++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2586[--field2582];
                method1267(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2586[--field2582];
                method1264(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2582 -= 2;
                int var19 = field2586[field2582];
                int var20 = field2586[field2582 + 1];
                if (class380.field4847.field10081 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class603.field8384.length; var21++) {
                    if (class603.field8384[var21] == var19) {
                        class380.field4847.field10081.method2672(var20, var21, class679.field9486, false);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class760.field10610.length; var22++) {
                    if (class760.field10610[var22] == var19) {
                        class380.field4847.field10081.method2672(var20, var22, class679.field9486, false);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2582 -= 2;
                int var23 = field2586[field2582];
                int var24 = field2586[field2582 + 1];
                if (class380.field4847.field10081 == null) {
                    return;
                }
                class380.field4847.field10081.method2674(var24, var23, (byte) -93);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2586[--field2582] != 0;
                if (class380.field4847.field10081 == null) {
                    return;
                }
                class380.field4847.field10081.method2675(var25, 12);
                return;
            }
            if (arg0 == 411) {
                field2582 -= 2;
                int var26 = field2586[field2582];
                int var27 = field2586[field2582 + 1];
                if (class380.field4847.field10081 == null) {
                    return;
                }
                class380.field4847.field10081.method2673(var26, var27, class21.field381, (byte) -108);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class288 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class501.method2936(-92, field2586[--field2582]);
            } else {
                var28 = arg1 ? field2577 : field2588;
            }
            if (arg0 == 1000) {
                field2582 -= 4;
                var28.field3683 = field2586[field2582];
                var28.field3642 = field2586[field2582 + 1];
                int var29 = field2586[field2582 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2586[field2582 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field3640 = (byte) var29;
                var28.field3697 = (byte) var30;
                class207.method1332((byte) -102, var28);
                class139.method1016(var28, 1);
                if (var28.field3740 == -1) {
                    class394.method2219(var28.field3696, 119);
                }
                return;
            }
            if (arg0 == 1001) {
                field2582 -= 4;
                var28.field3660 = field2586[field2582];
                var28.field3675 = field2586[field2582 + 1];
                var28.field3680 = 0;
                var28.field3690 = 0;
                int var31 = field2586[field2582 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2586[field2582 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field3701 = (byte) var31;
                var28.field3677 = (byte) var32;
                class207.method1332((byte) -115, var28);
                class139.method1016(var28, 1);
                if (var28.field3655 == 0) {
                    class236.method1483(var28, -1, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2586[--field2582] == 1;
                if (var28.field3637 != var33) {
                    var28.field3637 = var33;
                    class207.method1332((byte) -107, var28);
                }
                if (var28.field3740 == -1) {
                    class86.method714(var28.field3696, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field2582 -= 2;
                var28.field3624 = field2586[field2582];
                var28.field3636 = field2586[field2582 + 1];
                class207.method1332((byte) -102, var28);
                class139.method1016(var28, 1);
                if (var28.field3655 == 0) {
                    class236.method1483(var28, -1, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field3615 = field2586[--field2582] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class288 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class501.method2936(-109, field2586[--field2582]);
            } else {
                var34 = arg1 ? field2577 : field2588;
            }
            if (arg0 == 1100) {
                field2582 -= 2;
                var34.field3628 = field2586[field2582];
                if (var34.field3628 > var34.field3666 - var34.field3617) {
                    var34.field3628 = var34.field3666 - var34.field3617;
                }
                if (var34.field3628 < 0) {
                    var34.field3628 = 0;
                }
                var34.field3737 = field2586[field2582 + 1];
                if (var34.field3737 > var34.field3656 - var34.field3714) {
                    var34.field3737 = var34.field3656 - var34.field3714;
                }
                if (var34.field3737 < 0) {
                    var34.field3737 = 0;
                }
                class207.method1332((byte) -111, var34);
                if (var34.field3740 == -1) {
                    class317.method1873(127, var34.field3696);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field3671 = field2586[--field2582];
                class207.method1332((byte) -125, var34);
                if (var34.field3740 == -1) {
                    class515.method2997(var34.field3696, 14128);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field3707 = field2586[--field2582] == 1;
                class207.method1332((byte) -103, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field3734 = field2586[--field2582];
                class207.method1332((byte) -93, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field3718 = field2586[--field2582];
                class207.method1332((byte) -89, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2586[--field2582];
                if (var34.field3676 != var35) {
                    var34.field3676 = var35;
                    class207.method1332((byte) -114, var34);
                }
                if (var34.field3740 == -1) {
                    class521.method3028(var34.field3696, (byte) 109);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field3645 = field2586[--field2582];
                class207.method1332((byte) -85, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field3672 = field2586[--field2582] == 1;
                class207.method1332((byte) -105, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field3689 = 1;
                var34.field3755 = field2586[--field2582];
                class207.method1332((byte) -110, var34);
                if (var34.field3740 == -1) {
                    class187.method1259(var34.field3696, (byte) -111);
                }
                return;
            }
            if (arg0 == 1109) {
                field2582 -= 6;
                var34.field3722 = field2586[field2582];
                var34.field3659 = field2586[field2582 + 1];
                var34.field3765 = field2586[field2582 + 2];
                var34.field3708 = field2586[field2582 + 3];
                var34.field3657 = field2586[field2582 + 4];
                var34.field3693 = field2586[field2582 + 5];
                class207.method1332((byte) -115, var34);
                if (var34.field3740 == -1) {
                    class731.method4079((byte) 66, var34.field3696);
                    class577.method3300(var34.field3696, true);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2586[--field2582];
                if (var34.field3648 != var36) {
                    var34.field3648 = var36;
                    var34.field3776 = 0;
                    var34.field3616 = 1;
                    var34.field3748 = 0;
                    class56 var37 = var34.field3648 == -1 ? null : class66.field941.method1299((byte) -75, var34.field3648);
                    if (var37 != null) {
                        class484.method2857(true, var37, var34.field3776);
                    }
                    class207.method1332((byte) -93, var34);
                }
                if (var34.field3740 == -1) {
                    class757.method4206(17350, var34.field3696);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field3741 = field2586[--field2582] == 1;
                class207.method1332((byte) -89, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2581[--field2589];
                if (!var38.equals(var34.field3732)) {
                    var34.field3732 = var38;
                    class207.method1332((byte) -121, var34);
                }
                if (var34.field3740 == -1) {
                    class395.method2225(var34.field3696, (byte) 34);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field3626 = field2586[--field2582];
                class207.method1332((byte) -100, var34);
                if (var34.field3740 == -1) {
                    class157.method1096((byte) -36, var34.field3696);
                }
                return;
            }
            if (arg0 == 1114) {
                field2582 -= 3;
                var34.field3729 = field2586[field2582];
                var34.field3749 = field2586[field2582 + 1];
                var34.field3658 = field2586[field2582 + 2];
                class207.method1332((byte) -85, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field3713 = field2586[--field2582] == 1;
                class207.method1332((byte) -93, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field3651 = field2586[--field2582];
                class207.method1332((byte) -88, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field3769 = field2586[--field2582];
                class207.method1332((byte) -85, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field3754 = field2586[--field2582] == 1;
                class207.method1332((byte) -90, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field3630 = field2586[--field2582] == 1;
                class207.method1332((byte) -80, var34);
                return;
            }
            if (arg0 == 1120) {
                field2582 -= 2;
                var34.field3666 = field2586[field2582];
                var34.field3656 = field2586[field2582 + 1];
                class207.method1332((byte) -125, var34);
                if (var34.field3655 == 0) {
                    class236.method1483(var34, -1, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field3665 = field2586[--field2582] == 1;
                class207.method1332((byte) -126, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field3693 = field2586[--field2582];
                class207.method1332((byte) -113, var34);
                if (var34.field3740 == -1) {
                    class731.method4079((byte) 66, var34.field3696);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2586[--field2582];
                var34.field3619 = var39 == 1;
                class207.method1332((byte) -125, var34);
                return;
            }
            if (arg0 == 1125) {
                field2582 -= 2;
                var34.field3767 = field2586[field2582];
                var34.field3644 = field2586[field2582 + 1];
                class207.method1332((byte) -122, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field3747 = field2586[--field2582];
                class207.method1332((byte) -97, var34);
                return;
            }
            if (arg0 == 1127) {
                field2582 -= 2;
                int var40 = field2586[field2582];
                int var41 = field2586[field2582 + 1];
                class242 var42 = class513.field7206.method791((byte) -117, var40);
                if (var42.field3137 != var41) {
                    var34.method1714(var41, var40, (byte) 43);
                    return;
                }
                var34.method1725((byte) -88, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2586[--field2582];
                String var44 = field2581[--field2589];
                class242 var45 = class513.field7206.method791((byte) -80, var43);
                if (!var45.field3131.equals(var44)) {
                    var34.method1716(var44, (byte) 113, var43);
                    return;
                }
                var34.method1725((byte) -82, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field2586[--field2582];
                if (var34.field3655 != 5 && arg0 == 1129 || var34.field3655 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field3670 != var46) {
                    var34.field3670 = var46;
                    class207.method1332((byte) -81, var34);
                }
                if (var34.field3740 == -1) {
                    class348.method2043((byte) 72, var34.field3696);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class288 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class501.method2936(-77, field2586[--field2582]);
            } else {
                var47 = arg1 ? field2577 : field2588;
            }
            class207.method1332((byte) -127, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2582 -= 2;
                int var48 = field2586[field2582];
                int var49 = field2586[field2582 + 1];
                if (var47.field3740 == -1) {
                    class536.method3081(64, var47.field3696);
                    class731.method4079((byte) 66, var47.field3696);
                    class577.method3300(var47.field3696, true);
                }
                if (var48 == -1) {
                    var47.field3689 = 1;
                    var47.field3755 = -1;
                    var47.field3700 = -1;
                    return;
                }
                var47.field3700 = var48;
                var47.field3643 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field3726 = true;
                } else {
                    var47.field3726 = false;
                }
                class639 var50 = class21.field381.method1583(-108, var48);
                var47.field3765 = var50.field8828;
                var47.field3708 = var50.field8884;
                var47.field3657 = var50.field8850;
                var47.field3722 = var50.field8829;
                var47.field3659 = var50.field8865;
                var47.field3693 = var50.field8825;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field3634 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field3634 = 1;
                } else {
                    var47.field3634 = 2;
                }
                if (var47.field3680 > 0) {
                    var47.field3693 = var47.field3693 * 32 / var47.field3680;
                    return;
                }
                if (var47.field3660 > 0) {
                    var47.field3693 = var47.field3693 * 32 / var47.field3660;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field3689 = 2;
                var47.field3755 = field2586[--field2582];
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -86);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field3689 = 3;
                var47.field3755 = -1;
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -40);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field3689 = 6;
                var47.field3755 = field2586[--field2582];
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -52);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field3689 = 5;
                var47.field3755 = field2586[--field2582];
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -52);
                }
                return;
            }
            if (arg0 == 1206) {
                field2582 -= 4;
                var47.field3758 = field2586[field2582];
                var47.field3764 = field2586[field2582 + 1];
                var47.field3742 = field2586[field2582 + 2];
                var47.field3625 = field2586[field2582 + 3];
                class207.method1332((byte) -113, var47);
                return;
            }
            if (arg0 == 1207) {
                field2582 -= 2;
                var47.field3698 = field2586[field2582];
                var47.field3694 = field2586[field2582 + 1];
                class207.method1332((byte) -105, var47);
                return;
            }
            if (arg0 == 1210) {
                field2582 -= 4;
                var47.field3755 = field2586[field2582];
                var47.field3668 = field2586[field2582 + 1];
                if (field2586[field2582 + 2] == 1) {
                    var47.field3689 = 9;
                } else {
                    var47.field3689 = 8;
                }
                if (field2586[field2582 + 3] == 1) {
                    var47.field3726 = true;
                } else {
                    var47.field3726 = false;
                }
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -95);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field3689 = 5;
                var47.field3755 = class54.field755;
                var47.field3668 = 0;
                if (var47.field3740 == -1) {
                    class187.method1259(var47.field3696, (byte) -81);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class288 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class501.method2936(-83, field2586[--field2582]);
                } else {
                    var62 = arg1 ? field2577 : field2588;
                }
                if (arg0 == 1499) {
                    var62.method1712(911003588);
                    return;
                }
                String var63 = field2581[--field2589];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field2586[--field2582];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field2586[--field2582];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field2581[--field2589];
                    } else {
                        var66[var67] = Integer.valueOf(field2586[--field2582]);
                    }
                }
                int var68 = field2586[--field2582];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field3750 = var66;
                } else if (arg0 == 1401) {
                    var62.field3752 = var66;
                } else if (arg0 == 1402) {
                    var62.field3727 = var66;
                } else if (arg0 == 1403) {
                    var62.field3652 = var66;
                } else if (arg0 == 1404) {
                    var62.field3780 = var66;
                } else if (arg0 == 1405) {
                    var62.field3614 = var66;
                } else if (arg0 == 1406) {
                    var62.field3661 = var66;
                } else if (arg0 == 1407) {
                    var62.field3759 = var66;
                    var62.field3721 = var64;
                } else if (arg0 == 1408) {
                    var62.field3728 = var66;
                } else if (arg0 == 1409) {
                    var62.field3695 = var66;
                } else if (arg0 == 1410) {
                    var62.field3705 = var66;
                } else if (arg0 == 1411) {
                    var62.field3739 = var66;
                } else if (arg0 == 1412) {
                    var62.field3647 = var66;
                } else if (arg0 == 1414) {
                    var62.field3649 = var66;
                    var62.field3778 = var64;
                } else if (arg0 == 1415) {
                    var62.field3761 = var66;
                    var62.field3631 = var64;
                } else if (arg0 == 1416) {
                    var62.field3735 = var66;
                } else if (arg0 == 1417) {
                    var62.field3629 = var66;
                } else if (arg0 == 1418) {
                    var62.field3704 = var66;
                } else if (arg0 == 1419) {
                    var62.field3638 = var66;
                } else if (arg0 == 1420) {
                    var62.field3678 = var66;
                } else if (arg0 == 1421) {
                    var62.field3710 = var66;
                } else if (arg0 == 1422) {
                    var62.field3760 = var66;
                } else if (arg0 == 1423) {
                    var62.field3622 = var66;
                } else if (arg0 == 1424) {
                    var62.field3706 = var66;
                } else if (arg0 == 1425) {
                    var62.field3641 = var66;
                } else if (arg0 == 1426) {
                    var62.field3688 = var66;
                } else if (arg0 == 1427) {
                    var62.field3770 = var66;
                } else if (arg0 == 1428) {
                    var62.field3730 = var66;
                    var62.field3731 = var64;
                } else if (arg0 == 1429) {
                    var62.field3717 = var66;
                    var62.field3766 = var64;
                } else if (arg0 == 1430) {
                    var62.field3753 = var66;
                }
                var62.field3781 = true;
                return;
            }
            if (arg0 < 1600) {
                class288 var69 = arg1 ? field2577 : field2588;
                if (arg0 == 1500) {
                    field2586[field2582++] = var69.field3635;
                    return;
                }
                if (arg0 == 1501) {
                    field2586[field2582++] = var69.field3687;
                    return;
                }
                if (arg0 == 1502) {
                    field2586[field2582++] = var69.field3617;
                    return;
                }
                if (arg0 == 1503) {
                    field2586[field2582++] = var69.field3714;
                    return;
                }
                if (arg0 == 1504) {
                    field2586[field2582++] = var69.field3637 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2586[field2582++] = var69.field3743;
                    return;
                }
                if (arg0 == 1506) {
                    class288 var70 = class645.method3618(var69, -21);
                    field2586[field2582++] = var70 == null ? -1 : var70.field3696;
                    return;
                }
            } else if (arg0 < 1700) {
                class288 var71 = arg1 ? field2577 : field2588;
                if (arg0 == 1600) {
                    field2586[field2582++] = var71.field3628;
                    return;
                }
                if (arg0 == 1601) {
                    field2586[field2582++] = var71.field3737;
                    return;
                }
                if (arg0 == 1602) {
                    field2581[field2589++] = var71.field3732;
                    return;
                }
                if (arg0 == 1603) {
                    field2586[field2582++] = var71.field3666;
                    return;
                }
                if (arg0 == 1604) {
                    field2586[field2582++] = var71.field3656;
                    return;
                }
                if (arg0 == 1605) {
                    field2586[field2582++] = var71.field3693;
                    return;
                }
                if (arg0 == 1606) {
                    field2586[field2582++] = var71.field3765;
                    return;
                }
                if (arg0 == 1607) {
                    field2586[field2582++] = var71.field3657;
                    return;
                }
                if (arg0 == 1608) {
                    field2586[field2582++] = var71.field3708;
                    return;
                }
                if (arg0 == 1609) {
                    field2586[field2582++] = var71.field3734;
                    return;
                }
                if (arg0 == 1610) {
                    field2586[field2582++] = var71.field3722;
                    return;
                }
                if (arg0 == 1611) {
                    field2586[field2582++] = var71.field3659;
                    return;
                }
                if (arg0 == 1612) {
                    field2586[field2582++] = var71.field3676;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field2586[--field2582];
                    class242 var73 = class513.field7206.method791((byte) -101, var72);
                    if (var73.method1515(115)) {
                        field2581[field2589++] = var71.method1729(var73.field3131, var72, 124);
                        return;
                    }
                    field2586[field2582++] = var71.method1720(var73.field3137, -688386672, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field2586[field2582++] = var71.field3645;
                    return;
                }
                if (arg0 == 2614) {
                    field2586[field2582++] = var71.field3689 == 1 ? var71.field3755 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class288 var74 = arg1 ? field2577 : field2588;
                if (arg0 == 1700) {
                    field2586[field2582++] = var74.field3700;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field3700 != -1) {
                        field2586[field2582++] = var74.field3643;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2586[field2582++] = var74.field3740;
                    return;
                }
            } else if (arg0 < 1900) {
                class288 var75 = arg1 ? field2577 : field2588;
                if (arg0 == 1800) {
                    field2586[field2582++] = client.method1833(var75).method1571(false);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field2586[--field2582];
                    int var357 = var76 - 1;
                    if (var75.field3669 != null && var357 < var75.field3669.length && var75.field3669[var357] != null) {
                        field2581[field2589++] = var75.field3669[var357];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field3699 == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = var75.field3699;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class288 var355;
                if (arg0 >= 2000) {
                    var355 = class501.method2936(-55, field2586[--field2582]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field2577 : field2588;
                }
                if (field2604 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field3770 == null) {
                        return;
                    }
                    class694 var356 = new class694();
                    var356.field9635 = var355;
                    var356.field9645 = var355.field3770;
                    var356.field9646 = field2604 + 1;
                    class129.field1834.method3671(var356, false);
                    return;
                }
            } else if (arg0 < 2600) {
                class288 var77 = class501.method2936(-126, field2586[--field2582]);
                if (arg0 == 2500) {
                    field2586[field2582++] = var77.field3635;
                    return;
                }
                if (arg0 == 2501) {
                    field2586[field2582++] = var77.field3687;
                    return;
                }
                if (arg0 == 2502) {
                    field2586[field2582++] = var77.field3617;
                    return;
                }
                if (arg0 == 2503) {
                    field2586[field2582++] = var77.field3714;
                    return;
                }
                if (arg0 == 2504) {
                    field2586[field2582++] = var77.field3637 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2586[field2582++] = var77.field3743;
                    return;
                }
                if (arg0 == 1506) {
                    class288 var78 = class645.method3618(var77, -37);
                    field2586[field2582++] = var78 == null ? -1 : var78.field3696;
                    return;
                }
            } else if (arg0 < 2700) {
                class288 var79 = class501.method2936(-117, field2586[--field2582]);
                if (arg0 == 2600) {
                    field2586[field2582++] = var79.field3628;
                    return;
                }
                if (arg0 == 2601) {
                    field2586[field2582++] = var79.field3737;
                    return;
                }
                if (arg0 == 2602) {
                    field2581[field2589++] = var79.field3732;
                    return;
                }
                if (arg0 == 2603) {
                    field2586[field2582++] = var79.field3666;
                    return;
                }
                if (arg0 == 2604) {
                    field2586[field2582++] = var79.field3656;
                    return;
                }
                if (arg0 == 2605) {
                    field2586[field2582++] = var79.field3693;
                    return;
                }
                if (arg0 == 2606) {
                    field2586[field2582++] = var79.field3765;
                    return;
                }
                if (arg0 == 2607) {
                    field2586[field2582++] = var79.field3657;
                    return;
                }
                if (arg0 == 2608) {
                    field2586[field2582++] = var79.field3708;
                    return;
                }
                if (arg0 == 2609) {
                    field2586[field2582++] = var79.field3734;
                    return;
                }
                if (arg0 == 2610) {
                    field2586[field2582++] = var79.field3722;
                    return;
                }
                if (arg0 == 2611) {
                    field2586[field2582++] = var79.field3659;
                    return;
                }
                if (arg0 == 2612) {
                    field2586[field2582++] = var79.field3676;
                    return;
                }
                if (arg0 == 2613) {
                    field2586[field2582++] = var79.field3645;
                    return;
                }
                if (arg0 == 2614) {
                    field2586[field2582++] = var79.field3689 == 1 ? var79.field3755 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class288 var80 = class501.method2936(-70, field2586[--field2582]);
                    field2586[field2582++] = var80.field3700;
                    return;
                }
                if (arg0 == 2701) {
                    class288 var81 = class501.method2936(-117, field2586[--field2582]);
                    if (var81.field3700 != -1) {
                        field2586[field2582++] = var81.field3643;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field2586[--field2582];
                    class491 var83 = (class491) class290.field3804.method1160((long) var82, 124);
                    if (var83 != null) {
                        field2586[field2582++] = 1;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class288 var84 = class501.method2936(-83, field2586[--field2582]);
                    if (var84.field3779 == null) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    int var85 = var84.field3779.length;
                    for (int var86 = 0; var86 < var84.field3779.length; var86++) {
                        if (var84.field3779[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field2586[field2582++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2582 -= 2;
                    int var87 = field2586[field2582];
                    int var88 = field2586[field2582 + 1];
                    class491 var89 = (class491) class290.field3804.method1160((long) var87, 123);
                    if (var89 != null && var89.field6978 == var88) {
                        field2586[field2582++] = 1;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class288 var90 = class501.method2936(-61, field2586[--field2582]);
                if (arg0 == 2800) {
                    field2586[field2582++] = client.method1833(var90).method1571(false);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field2586[--field2582];
                    int var358 = var91 - 1;
                    if (var90.field3669 != null && var358 < var90.field3669.length && var90.field3669[var358] != null) {
                        field2581[field2589++] = var90.field3669[var358];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field3699 == null) {
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = var90.field3699;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field2581[--field2589];
                    class586.method3329(-100, var92);
                    return;
                }
                if (arg0 == 3101) {
                    field2582 -= 2;
                    class68.method625((byte) 4, class380.field4847, field2586[field2582 + 1], field2586[field2582]);
                    return;
                }
                if (arg0 == 3103) {
                    class415.method2329((byte) 8, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field2581[--field2589];
                    int var94 = 0;
                    if (class396.method2231(var93, (byte) 106)) {
                        var94 = class160.method1124(var93, 124);
                    }
                    field2591++;
                    class589 var95 = class514.method2994(-29488, class760.field10605, class274.field3446);
                    var95.field8251.method2568(var94, -535701016);
                    class737.method4107(var95, 7);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field2581[--field2589];
                    field2590++;
                    class589 var97 = class514.method2994(-29488, class760.field10605, class365.field4707);
                    var97.field8251.method2578(var96.length() + 1, -1221492240);
                    var97.field8251.method2597(var96, (byte) 108);
                    class737.method4107(var97, 7);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field2581[--field2589];
                    field2593++;
                    class589 var99 = class514.method2994(-29488, class760.field10605, class639.field8854);
                    var99.field8251.method2578(var98.length() + 1, -1221492240);
                    var99.field8251.method2597(var98, (byte) 89);
                    class737.method4107(var99, 7);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field2586[--field2582];
                    String var101 = field2581[--field2589];
                    class298.method1783(var101, var100, true);
                    return;
                }
                if (arg0 == 3108) {
                    field2582 -= 3;
                    int var102 = field2586[field2582];
                    int var103 = field2586[field2582 + 1];
                    int var104 = field2586[field2582 + 2];
                    class288 var105 = class501.method2936(-94, var104);
                    class614.method3439((byte) -99, var102, var103, var105);
                    return;
                }
                if (arg0 == 3109) {
                    field2582 -= 2;
                    int var106 = field2586[field2582];
                    int var107 = field2586[field2582 + 1];
                    class288 var108 = arg1 ? field2577 : field2588;
                    class614.method3439((byte) -55, var106, var107, var108);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field2586[--field2582];
                    field2597++;
                    class589 var110 = class514.method2994(-29488, class760.field10605, class431.field5760);
                    var110.field8251.method2620(var109, false);
                    class737.method4107(var110, 7);
                    return;
                }
                if (arg0 == 3111) {
                    field2582 -= 2;
                    int var111 = field2586[field2582];
                    int var112 = field2586[field2582 + 1];
                    class491 var113 = (class491) class290.field3804.method1160((long) var111, 125);
                    if (var113 != null) {
                        class178.method1218(256, true, var113, var113.field6978 != var112);
                    }
                    class39.method240(var111, true, var112, 3, 127);
                    return;
                }
                if (arg0 == 3112) {
                    field2582--;
                    int var114 = field2586[field2582];
                    class491 var115 = (class491) class290.field3804.method1160((long) var114, 119);
                    if (var115 != null && var115.field6976 == 3) {
                        class178.method1218(256, true, var115, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class761.method4228(-127, field2581[--field2589]);
                    return;
                }
                if (arg0 == 3114) {
                    field2582 -= 2;
                    int var116 = field2586[field2582];
                    int var117 = field2586[field2582 + 1];
                    String var118 = field2581[--field2589];
                    class64.method588(1699767752, var118, var117, "", "", var116, "");
                    return;
                }
                if (arg0 == 3115) {
                    field2582 -= 11;
                    class91[] var119 = class94.method762(1);
                    class599[] var120 = class680.method3832(-17399);
                    class687.method3861(var119[field2586[field2582]], field2586[field2582 + 2], field2586[field2582 + 8], field2586[field2582 + 5], field2586[field2582 + 7], field2586[field2582 + 6], field2586[field2582 + 4], field2586[field2582 + 9], (byte) -10, var120[field2586[field2582 + 1]], field2586[field2582 + 3], field2586[field2582 + 10]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2582 -= 3;
                    class75.method673(field2586[field2582 + 1], 255, field2586[field2582], field2586[field2582 + 2], 256, 0);
                    return;
                }
                if (arg0 == 3201) {
                    class48.method367(50, 255, field2586[--field2582], 124);
                    return;
                }
                if (arg0 == 3202) {
                    field2582 -= 2;
                    class621.method3496(255, field2586[field2582], (byte) -74, field2586[field2582 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field2582 -= 4;
                    class75.method673(field2586[field2582 + 1], field2586[field2582 + 3], field2586[field2582], field2586[field2582 + 2], 256, 0);
                    return;
                }
                if (arg0 == 3204) {
                    field2582 -= 3;
                    class48.method367(field2586[field2582 + 2], field2586[field2582 + 1], field2586[field2582], 59);
                    return;
                }
                if (arg0 == 3205) {
                    field2582 -= 3;
                    class621.method3496(field2586[field2582 + 2], field2586[field2582], (byte) -118, field2586[field2582 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field2582 -= 4;
                    class622.method3499(field2586[field2582], 256, false, true, field2586[field2582 + 1], field2586[field2582 + 2], field2586[field2582 + 3]);
                    return;
                }
                if (arg0 == 3207) {
                    field2582 -= 4;
                    class622.method3499(field2586[field2582], 256, true, true, field2586[field2582 + 1], field2586[field2582 + 2], field2586[field2582 + 3]);
                    return;
                }
                if (arg0 == 3208) {
                    field2582 -= 5;
                    class75.method673(field2586[field2582 + 1], field2586[field2582 + 3], field2586[field2582], field2586[field2582 + 2], field2586[field2582 + 4], 0);
                    return;
                }
                if (arg0 == 3209) {
                    field2582 -= 5;
                    class622.method3499(field2586[field2582], field2586[field2582 + 4], false, true, field2586[field2582 + 1], field2586[field2582 + 2], field2586[field2582 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2586[field2582++] = class463.field6224;
                    return;
                }
                if (arg0 == 3301) {
                    field2582 -= 2;
                    int var121 = field2586[field2582];
                    int var122 = field2586[field2582 + 1];
                    field2586[field2582++] = class313.method1865(var122, 1736144270, var121, false);
                    return;
                }
                if (arg0 == 3302) {
                    field2582 -= 2;
                    int var123 = field2586[field2582];
                    int var124 = field2586[field2582 + 1];
                    field2586[field2582++] = class426.method2446(var124, false, false, var123);
                    return;
                }
                if (arg0 == 3303) {
                    field2582 -= 2;
                    int var125 = field2586[field2582];
                    int var126 = field2586[field2582 + 1];
                    field2586[field2582++] = class137.method1009(-124, false, var126, var125);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field2586[--field2582];
                    field2586[field2582++] = class343.field4343.method1776(var127, (byte) -68).field1746;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field2586[--field2582];
                    field2586[field2582++] = class223.field2981[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field2586[--field2582];
                    field2586[field2582++] = class72.field1000[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field2586[--field2582];
                    field2586[field2582++] = class271.field3408[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class380.field4847.field5796;
                    int var132 = (class380.field4847.field5801 >> 9) + class332.field4232;
                    int var133 = (class380.field4847.field5797 >> 9) + class447.field5936;
                    field2586[field2582++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field2586[--field2582];
                    field2586[field2582++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field2586[--field2582];
                    field2586[field2582++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field2586[--field2582];
                    field2586[field2582++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2586[field2582++] = class258.field3268 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2582 -= 2;
                    int var137 = field2586[field2582];
                    int var138 = field2586[field2582 + 1];
                    field2586[field2582++] = class313.method1865(var138, 1736144270, var137, true);
                    return;
                }
                if (arg0 == 3314) {
                    field2582 -= 2;
                    int var139 = field2586[field2582];
                    int var140 = field2586[field2582 + 1];
                    field2586[field2582++] = class426.method2446(var140, true, false, var139);
                    return;
                }
                if (arg0 == 3315) {
                    field2582 -= 2;
                    int var141 = field2586[field2582];
                    int var142 = field2586[field2582 + 1];
                    field2586[field2582++] = class137.method1009(-127, true, var142, var141);
                    return;
                }
                if (arg0 == 3316) {
                    if (class683.field9525 >= 2) {
                        field2586[field2582++] = class683.field9525;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2586[field2582++] = class705.field9777;
                    return;
                }
                if (arg0 == 3318) {
                    field2586[field2582++] = class292.field3842.field1929;
                    return;
                }
                if (arg0 == 3321) {
                    field2586[field2582++] = class126.field1798;
                    return;
                }
                if (arg0 == 3322) {
                    field2586[field2582++] = class597.field8318;
                    return;
                }
                if (arg0 == 3323) {
                    if (class649.field9012 >= 5 && class649.field9012 <= 9) {
                        field2586[field2582++] = 1;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class649.field9012 >= 5 && class649.field9012 <= 9) {
                        field2586[field2582++] = class649.field9012;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2586[field2582++] = class254.field3244 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2586[field2582++] = class380.field4847.field10070;
                    return;
                }
                if (arg0 == 3327) {
                    field2586[field2582++] = class380.field4847.field10081 != null && class380.field4847.field10081.field6299 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2586[field2582++] = class165.field2314 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field2586[--field2582];
                    field2586[field2582++] = class28.method193(var143, false, false);
                    return;
                }
                if (arg0 == 3331) {
                    field2582 -= 2;
                    int var144 = field2586[field2582];
                    int var145 = field2586[field2582 + 1];
                    field2586[field2582++] = class499.method2913(var145, var144, 19152, false, false);
                    return;
                }
                if (arg0 == 3332) {
                    field2582 -= 2;
                    int var146 = field2586[field2582];
                    int var147 = field2586[field2582 + 1];
                    field2586[field2582++] = class499.method2913(var147, var146, 19152, true, false);
                    return;
                }
                if (arg0 == 3333) {
                    field2586[field2582++] = class622.field8563;
                    return;
                }
                if (arg0 == 3335) {
                    field2586[field2582++] = class243.field3143;
                    return;
                }
                if (arg0 == 3336) {
                    field2582 -= 4;
                    int var148 = field2586[field2582];
                    int var149 = field2586[field2582 + 1];
                    int var150 = field2586[field2582 + 2];
                    int var151 = field2586[field2582 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field2586[field2582++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field2586[field2582++] = class313.field4096;
                    return;
                }
                if (arg0 == 3338) {
                    field2586[field2582++] = class477.method2748((byte) -38);
                    return;
                }
                if (arg0 == 3339) {
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field2586[field2582++] = class430.field5752 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field2586[field2582++] = class517.field7246 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field2586[field2582++] = class680.field9495.method1118((byte) 124);
                    return;
                }
                if (arg0 == 3343) {
                    field2586[field2582++] = class680.field9495.method1115(4);
                    return;
                }
                if (arg0 == 3344) {
                    field2581[field2589++] = class549.method3193((byte) -110);
                    return;
                }
                if (arg0 == 3345) {
                    field2581[field2589++] = class165.method1157((byte) 22);
                    return;
                }
                if (arg0 == 3346) {
                    field2586[field2582++] = class754.method4193(true);
                    return;
                }
                if (arg0 == 3347) {
                    field2586[field2582++] = class23.field427;
                    return;
                }
                if (arg0 == 3349) {
                    field2586[field2582++] = class380.field4847.field256.method1044((byte) 19) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2582 -= 2;
                    int var155 = field2586[field2582];
                    int var156 = field2586[field2582 + 1];
                    class111 var157 = class180.field2529.method4027(-92, var155);
                    field2581[field2589++] = var157.method878((byte) -114, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field2582 -= 4;
                    int var158 = field2586[field2582];
                    int var159 = field2586[field2582 + 1];
                    int var160 = field2586[field2582 + 2];
                    int var161 = field2586[field2582 + 3];
                    class111 var162 = class180.field2529.method4027(-99, var160);
                    if (var162.field1603 == var158 && var162.field1611 == var159) {
                        if (var159 == 115) {
                            field2581[field2589++] = var162.method878((byte) 109, var161);
                            return;
                        }
                        field2586[field2582++] = var162.method884(-5507, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field2582 -= 3;
                    int var163 = field2586[field2582];
                    int var164 = field2586[field2582 + 1];
                    int var165 = field2586[field2582 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class111 var166 = class180.field2529.method4027(-123, var164);
                    if (var166.field1611 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2586[field2582++] = var166.method886(-25653, var165) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field2586[--field2582];
                    String var168 = field2581[--field2589];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class111 var169 = class180.field2529.method4027(-22, var167);
                    if (var169.field1611 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2586[field2582++] = var169.method879(true, var168) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field2586[--field2582];
                    class111 var171 = class180.field2529.method4027(-69, var170);
                    field2586[field2582++] = var171.field1614.method1159((byte) -106);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class101.field1399 == 0) {
                        field2586[field2582++] = -2;
                        return;
                    }
                    if (class101.field1399 == 1) {
                        field2586[field2582++] = -1;
                        return;
                    }
                    field2586[field2582++] = class600.field8359;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field2586[--field2582];
                    if (class101.field1399 == 2 && var172 < class600.field8359) {
                        field2581[field2589++] = class207.field2748[var172];
                        if (class726.field10124[var172] != null) {
                            field2581[field2589++] = class726.field10124[var172];
                            return;
                        }
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = "";
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field2586[--field2582];
                    if (class101.field1399 == 2 && var173 < class600.field8359) {
                        field2586[field2582++] = class698.field9713[var173];
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field2586[--field2582];
                    if (class101.field1399 == 2 && var174 < class600.field8359) {
                        field2586[field2582++] = class61.field851[var174];
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field2581[--field2589];
                    int var176 = field2586[--field2582];
                    class25.method173(-128, var176, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field2581[--field2589];
                    class203.method1316(var177, false);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field2581[--field2589];
                    class22.method153(0, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field2581[--field2589];
                    class217.method1417(false, (byte) 18, var179);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field2581[--field2589];
                    class273.method1612(1, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field2581[--field2589];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field2586[field2582++] = class329.method1907(0, var181) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field2586[--field2582];
                    if (class101.field1399 == 2 && var182 < class600.field8359) {
                        field2581[field2589++] = class524.field7328[var182];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class602.field8365 != null) {
                        field2581[field2589++] = class710.method3972(18665, class602.field8365);
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class602.field8365 != null) {
                        field2586[field2582++] = class194.field2654;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field2586[--field2582];
                    if (class602.field8365 != null && var183 < class194.field2654) {
                        field2581[field2589++] = class306.field4038[var183].field3080;
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field2586[--field2582];
                    if (class602.field8365 != null && var184 < class194.field2654) {
                        field2586[field2582++] = class306.field4038[var184].field3078;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field2586[--field2582];
                    if (class602.field8365 != null && var185 < class194.field2654) {
                        field2586[field2582++] = class306.field4038[var185].field3071;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2586[field2582++] = class244.field3155;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field2581[--field2589];
                    class89.method730(var186, (byte) 96);
                    return;
                }
                if (arg0 == 3618) {
                    field2586[field2582++] = class33.field546;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field2581[--field2589];
                    class690.method3870(var187, 0);
                    return;
                }
                if (arg0 == 3620) {
                    class171.method1185(true);
                    return;
                }
                if (arg0 == 3621) {
                    if (class101.field1399 == 0) {
                        field2586[field2582++] = -1;
                        return;
                    }
                    field2586[field2582++] = class20.field370;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field2586[--field2582];
                    if (class101.field1399 != 0 && var188 < class20.field370) {
                        field2581[field2589++] = class469.field6287[var188];
                        if (class636.field8768[var188] != null) {
                            field2581[field2589++] = class636.field8768[var188];
                            return;
                        }
                        field2581[field2589++] = "";
                        return;
                    }
                    field2581[field2589++] = "";
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field2581[--field2589];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field2586[field2582++] = class176.method1211(80, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field2586[--field2582];
                    if (class306.field4038 != null && var190 < class194.field2654 && class306.field4038[var190].field3072.equalsIgnoreCase(class380.field4847.field10062)) {
                        field2586[field2582++] = 1;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class66.field953 != null) {
                        field2581[field2589++] = class66.field953;
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field2586[--field2582];
                    if (class602.field8365 != null && var191 < class194.field2654) {
                        field2581[field2589++] = class306.field4038[var191].field3082;
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field2586[--field2582];
                    if (class101.field1399 == 2 && var192 >= 0 && var192 < class600.field8359) {
                        field2586[field2582++] = class512.field7202[var192] ? 1 : 0;
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field2581[--field2589];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field2586[field2582++] = class147.method1049(var193, (byte) -108);
                    return;
                }
                if (arg0 == 3629) {
                    field2586[field2582++] = class272.field3419;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field2581[--field2589];
                    class217.method1417(true, (byte) 125, var194);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field2586[--field2582];
                    field2586[field2582++] = class216.field2921[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field2586[--field2582];
                    if (class602.field8365 != null && var196 < class194.field2654) {
                        field2581[field2589++] = class306.field4038[var196].field3072;
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field2586[--field2582];
                    if (class101.field1399 != 0 && var197 < class20.field370) {
                        field2581[field2589++] = class160.field2213[var197];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var198].method906(1);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var199].field1723;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var200].field1721;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var201].field1717;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var202].field1719;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field2586[--field2582];
                    field2586[field2582++] = class258.field3275[var203].field1715;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field2586[--field2582];
                    int var205 = class258.field3275[var204].method908(114);
                    field2586[field2582++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field2586[--field2582];
                    int var207 = class258.field3275[var206].method908(117);
                    field2586[field2582++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field2586[--field2582];
                    int var209 = class258.field3275[var208].method908(117);
                    field2586[field2582++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field2586[--field2582];
                    int var211 = class258.field3275[var210].method908(110);
                    field2586[field2582++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2582 -= 2;
                    int var212 = field2586[field2582];
                    int var213 = field2586[field2582 + 1];
                    field2586[field2582++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field2582 -= 2;
                    int var214 = field2586[field2582];
                    int var215 = field2586[field2582 + 1];
                    field2586[field2582++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field2582 -= 2;
                    int var216 = field2586[field2582];
                    int var217 = field2586[field2582 + 1];
                    field2586[field2582++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field2582 -= 2;
                    int var218 = field2586[field2582];
                    int var219 = field2586[field2582 + 1];
                    field2586[field2582++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field2586[--field2582];
                    field2586[field2582++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field2586[--field2582];
                    field2586[field2582++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2582 -= 5;
                    int var222 = field2586[field2582];
                    int var223 = field2586[field2582 + 1];
                    int var224 = field2586[field2582 + 2];
                    int var225 = field2586[field2582 + 3];
                    int var226 = field2586[field2582 + 4];
                    field2586[field2582++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field2582 -= 2;
                    long var227 = (long) field2586[field2582];
                    long var229 = (long) field2586[field2582 + 1];
                    field2586[field2582++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field2582 -= 2;
                    int var231 = field2586[field2582];
                    int var232 = field2586[field2582 + 1];
                    field2586[field2582++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field2582 -= 2;
                    int var233 = field2586[field2582];
                    int var234 = field2586[field2582 + 1];
                    field2586[field2582++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2582 -= 2;
                    int var235 = field2586[field2582];
                    int var236 = field2586[field2582 + 1];
                    field2586[field2582++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2582 -= 2;
                    int var237 = field2586[field2582];
                    int var238 = field2586[field2582 + 1];
                    field2586[field2582++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field2582 -= 2;
                    int var239 = field2586[field2582];
                    int var240 = field2586[field2582 + 1];
                    if (var239 == 0) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    field2586[field2582++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field2582 -= 2;
                    int var241 = field2586[field2582];
                    int var242 = field2586[field2582 + 1];
                    if (var241 == 0) {
                        field2586[field2582++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field2586[field2582++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2586[field2582++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field2582 -= 2;
                    int var243 = field2586[field2582];
                    int var244 = field2586[field2582 + 1];
                    field2586[field2582++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field2582 -= 2;
                    int var245 = field2586[field2582];
                    int var246 = field2586[field2582 + 1];
                    field2586[field2582++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field2582 -= 2;
                    int var247 = field2586[field2582];
                    int var248 = field2586[field2582 + 1];
                    field2586[field2582++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field2582 -= 2;
                    int var249 = field2586[field2582];
                    int var250 = field2586[field2582 + 1];
                    field2586[field2582++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field2582 -= 3;
                    long var251 = (long) field2586[field2582];
                    long var253 = (long) field2586[field2582 + 1];
                    long var255 = (long) field2586[field2582 + 2];
                    field2586[field2582++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field2582 -= 2;
                    int var257 = field2586[field2582];
                    int var258 = field2586[field2582 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field2586[field2582++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field2586[field2582++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field2581[--field2589];
                    int var262 = field2586[--field2582];
                    field2581[field2589++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field2589 -= 2;
                    String var263 = field2581[field2589];
                    String var264 = field2581[field2589 + 1];
                    field2581[field2589++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field2581[--field2589];
                    int var266 = field2586[--field2582];
                    field2581[field2589++] = var265 + class646.method3624(var266, 0, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field2581[--field2589];
                    field2581[field2589++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2581[field2589++] = method1274(field2586[--field2582]);
                    return;
                }
                if (arg0 == 4105) {
                    field2589 -= 2;
                    String var268 = field2581[field2589];
                    String var269 = field2581[field2589 + 1];
                    if (class380.field4847.field10081 != null && class380.field4847.field10081.field6299) {
                        field2581[field2589++] = var269;
                        return;
                    }
                    field2581[field2589++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field2586[--field2582];
                    field2581[field2589++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field2589 -= 2;
                    field2586[field2582++] = class459.method2560(field2581[field2589 + 1], (byte) 0, class243.field3143, field2581[field2589]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field2581[--field2589];
                    field2582 -= 2;
                    int var272 = field2586[field2582];
                    int var273 = field2586[field2582 + 1];
                    class274 var274 = class739.method4118(var273, 0, class445.field5928, -1072);
                    field2586[field2582++] = var274.method1616(class537.field7454, -1, var272, var271);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field2581[--field2589];
                    field2582 -= 2;
                    int var276 = field2586[field2582];
                    int var277 = field2586[field2582 + 1];
                    class274 var278 = class739.method4118(var277, 0, class445.field5928, -1072);
                    field2586[field2582++] = var278.method1618(var276, class537.field7454, var275, 46);
                    return;
                }
                if (arg0 == 4110) {
                    field2589 -= 2;
                    String var279 = field2581[field2589];
                    String var280 = field2581[field2589 + 1];
                    if (field2586[--field2582] == 1) {
                        field2581[field2589++] = var279;
                        return;
                    }
                    field2581[field2589++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field2581[--field2589];
                    field2581[field2589++] = class417.method2338(3, var281);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field2581[--field2589];
                    int var283 = field2586[--field2582];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2581[field2589++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field2586[--field2582];
                    field2586[field2582++] = method1271((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field2586[--field2582];
                    field2586[field2582++] = class530.method3048((char) var285, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field2586[--field2582];
                    field2586[field2582++] = class407.method2271((char) var286, 979) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field2586[--field2582];
                    field2586[field2582++] = class201.method1312(123, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field2581[--field2589];
                    if (var288 != null) {
                        field2586[field2582++] = var288.length();
                        return;
                    }
                    field2586[field2582++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field2581[--field2589];
                    field2582 -= 2;
                    int var290 = field2586[field2582];
                    int var291 = field2586[field2582 + 1];
                    field2581[field2589++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field2581[--field2589];
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
                    field2581[field2589++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field2581[--field2589];
                    field2582 -= 2;
                    int var298 = field2586[field2582];
                    int var299 = field2586[field2582 + 1];
                    field2586[field2582++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field2589 -= 2;
                    String var300 = field2581[field2589];
                    String var301 = field2581[field2589 + 1];
                    int var302 = field2586[--field2582];
                    field2586[field2582++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field2586[--field2582];
                    field2586[field2582++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field2586[--field2582];
                    field2586[field2582++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field2586[--field2582] != 0;
                    int var306 = field2586[--field2582];
                    field2581[field2589++] = class669.method3759((byte) -116, 0, class243.field3143, (long) var306, var305);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field2581[--field2589];
                    int var308 = field2586[--field2582];
                    class274 var309 = class739.method4118(var308, 0, class445.field5928, -1072);
                    field2586[field2582++] = var309.method1620(var307, class537.field7454, 106);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field2586[--field2582];
                    field2581[field2589++] = class21.field381.method1583(-91, var310).field8881;
                    return;
                }
                if (arg0 == 4201) {
                    field2582 -= 2;
                    int var311 = field2586[field2582];
                    int var312 = field2586[field2582 + 1];
                    class639 var313 = class21.field381.method1583(115, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field8876[var312 - 1] != null) {
                        field2581[field2589++] = var313.field8876[var312 - 1];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2582 -= 2;
                    int var314 = field2586[field2582];
                    int var315 = field2586[field2582 + 1];
                    class639 var316 = class21.field381.method1583(112, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field8823[var315 - 1] != null) {
                        field2581[field2589++] = var316.field8823[var315 - 1];
                        return;
                    }
                    field2581[field2589++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field2586[--field2582];
                    field2586[field2582++] = class21.field381.method1583(-117, var317).field8861;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field2586[--field2582];
                    field2586[field2582++] = class21.field381.method1583(-67, var318).field8873 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field2586[--field2582];
                    class639 var320 = class21.field381.method1583(121, var319);
                    if (var320.field8879 == -1 && var320.field8857 >= 0) {
                        field2586[field2582++] = var320.field8857;
                        return;
                    }
                    field2586[field2582++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field2586[--field2582];
                    class639 var322 = class21.field381.method1583(-76, var321);
                    if (var322.field8879 >= 0 && var322.field8857 >= 0) {
                        field2586[field2582++] = var322.field8857;
                        return;
                    }
                    field2586[field2582++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field2586[--field2582];
                    field2586[field2582++] = class21.field381.method1583(122, var323).field8844 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2582 -= 2;
                    int var324 = field2586[field2582];
                    int var325 = field2586[field2582 + 1];
                    class242 var326 = class513.field7206.method791((byte) -115, var325);
                    if (var326.method1515(115)) {
                        field2581[field2589++] = class21.field381.method1583(127, var324).method3584(var326.field3131, var325, -35);
                        return;
                    }
                    field2586[field2582++] = class21.field381.method1583(122, var324).method3594(125, var325, var326.field3137);
                    return;
                }
                if (arg0 == 4209) {
                    field2582 -= 2;
                    int var327 = field2586[field2582];
                    int var328 = field2586[field2582 + 1] - 1;
                    class639 var329 = class21.field381.method1583(126, var327);
                    if (var329.field8864 == var328) {
                        field2586[field2582++] = var329.field8820;
                        return;
                    }
                    if (var329.field8858 == var328) {
                        field2586[field2582++] = var329.field8845;
                        return;
                    }
                    field2586[field2582++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field2581[--field2589];
                    int var331 = field2586[--field2582];
                    class404.method2248(var331 == 1, var330, true);
                    field2586[field2582++] = class677.field9467;
                    return;
                }
                if (arg0 == 4211) {
                    if (class9.field129 != null && class425.field5710 < class677.field9467) {
                        field2586[field2582++] = class9.field129[class425.field5710++] & 0xFFFF;
                        return;
                    }
                    field2586[field2582++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class425.field5710 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field2586[--field2582];
                    field2586[field2582++] = class21.field381.method1583(124, var332).field8877;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field2581[--field2589];
                    field2582 -= 3;
                    int var334 = field2586[field2582];
                    int var335 = field2586[field2582 + 1];
                    int var336 = field2586[field2582 + 2];
                    class595.method3371(var335, var334 == 1, var333, -1, var336);
                    field2586[field2582++] = class677.field9467;
                    return;
                }
                if (arg0 == 4215) {
                    field2589 -= 2;
                    field2582 -= 2;
                    String var337 = field2581[field2589];
                    int var338 = field2586[field2582];
                    int var339 = field2586[field2582 + 1];
                    String var340 = field2581[field2589 + 1];
                    class511.method2984(var340, var337, var338 == 1, var339, -86);
                    field2586[field2582++] = class677.field9467;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2582 -= 2;
                    int var341 = field2586[field2582];
                    int var342 = field2586[field2582 + 1];
                    class242 var343 = class513.field7206.method791((byte) -107, var342);
                    if (var343.method1515(115)) {
                        field2581[field2589++] = class300.field3941.method3859(var341, (byte) 119).method980((byte) -113, var343.field3131, var342);
                        return;
                    }
                    field2586[field2582++] = class300.field3941.method3859(var341, (byte) -40).method973(false, var343.field3137, var342);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2582 -= 2;
                    int var344 = field2586[field2582];
                    int var345 = field2586[field2582 + 1];
                    class242 var346 = class513.field7206.method791((byte) 67, var345);
                    if (var346.method1515(115)) {
                        field2581[field2589++] = client.field3995.method3384(var344, false).method3113(var346.field3131, var345, -119);
                        return;
                    }
                    field2586[field2582++] = client.field3995.method3384(var344, false).method3123(var346.field3137, (byte) 127, var345);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2582 -= 2;
                    int var347 = field2586[field2582];
                    int var348 = field2586[field2582 + 1];
                    class242 var349 = class513.field7206.method791((byte) 92, var348);
                    if (var349.method1515(115)) {
                        field2581[field2589++] = class305.field4004.method2665(var347, -1026).method1131(var349.field3131, (byte) -125, var348);
                        return;
                    }
                    field2586[field2582++] = class305.field4004.method2665(var347, -1026).method1128(var349.field3137, var348, false);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field2586[--field2582];
                class738 var351 = class729.field10151.method1210(32, var350);
                if (var351.field10253 != null && var351.field10253.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field10278[0];
                    for (int var354 = 1; var354 < var351.field10253.length; var354++) {
                        if (var351.field10278[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field10278[var354];
                        }
                    }
                    field2586[field2582++] = var351.field10253[var352];
                    return;
                }
                field2586[field2582++] = var351.field10261;
                return;
            }
        } else {
            class288 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class501.method2936(-120, field2586[--field2582]);
            } else {
                var51 = arg1 ? field2577 : field2588;
            }
            if (arg0 == 1300) {
                int var52 = field2586[--field2582] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method1722(true, var52, field2581[--field2589]);
                    return;
                }
                field2589--;
                return;
            }
            if (arg0 == 1301) {
                field2582 -= 2;
                int var53 = field2586[field2582];
                int var54 = field2586[field2582 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field3719 = null;
                    return;
                }
                var51.field3719 = class466.method2658(var54, var53, 30639);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field2586[--field2582];
                if (class378.field4836 != var55 && class270.field3404 != var55 && class269.field3390 != var55) {
                    return;
                }
                var51.field3736 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field3613 = field2586[--field2582];
                return;
            }
            if (arg0 == 1304) {
                var51.field3662 = field2586[--field2582];
                return;
            }
            if (arg0 == 1305) {
                var51.field3699 = field2581[--field2589];
                return;
            }
            if (arg0 == 1306) {
                var51.field3633 = field2581[--field2589];
                return;
            }
            if (arg0 == 1307) {
                var51.field3669 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field3723 = field2586[--field2582];
                var51.field3682 = field2586[--field2582];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field2586[--field2582];
                int var57 = field2586[--field2582];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method1713(var57 - 1, 110, var56);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field3618 = field2581[--field2589];
                return;
            }
            if (arg0 == 1311) {
                var51.field3762 = field2586[--field2582];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field2582 -= 3;
                    var58 = field2586[field2582] - 1;
                    var59 = field2586[field2582 + 1];
                    var60 = field2586[field2582 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2582 -= 2;
                    var58 = 10;
                    var59 = field2586[field2582];
                    var60 = field2586[field2582 + 1];
                }
                if (var51.field3650 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field3650 = new byte[11];
                    var51.field3681 = new byte[11];
                    var51.field3623 = new int[11];
                }
                var51.field3650[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field3774 = false;
                    for (int var61 = 0; var61 < var51.field3650.length; var61++) {
                        if (var51.field3650[var61] != 0) {
                            var51.field3774 = true;
                            break;
                        }
                    }
                } else {
                    var51.field3774 = true;
                }
                var51.field3681[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field3768 = field2586[--field2582];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lev;)V", line = 7550)
    public static final void method1262(class694 arg0) {
        method1266(arg0, 200000);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7557)
    private static final void method1263(String arg0, int arg1) {
        if (class683.field9525 == 0 && !(!class81.field1113 || class172.field2381) || class165.field2314) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class454.field6050.method2547(-69, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class454.field6050.method2547(-70, 0).length());
        } else if (var2.startsWith(class454.field6051.method2547(-55, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class454.field6051.method2547(-52, 0).length());
        } else if (var2.startsWith(class454.field6052.method2547(-94, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class454.field6052.method2547(-66, 0).length());
        } else if (var2.startsWith(class454.field6053.method2547(-91, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class454.field6053.method2547(-120, 0).length());
        } else if (var2.startsWith(class454.field6054.method2547(-62, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class454.field6054.method2547(-54, 0).length());
        } else if (var2.startsWith(class454.field6055.method2547(-77, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class454.field6055.method2547(-56, 0).length());
        } else if (var2.startsWith(class454.field6056.method2547(-118, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class454.field6056.method2547(-116, 0).length());
        } else if (var2.startsWith(class454.field6057.method2547(-71, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class454.field6057.method2547(-99, 0).length());
        } else if (var2.startsWith(class454.field6058.method2547(-128, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class454.field6058.method2547(-76, 0).length());
        } else if (var2.startsWith(class454.field6059.method2547(-65, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class454.field6059.method2547(-70, 0).length());
        } else if (var2.startsWith(class454.field6060.method2547(-56, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class454.field6060.method2547(-111, 0).length());
        } else if (var2.startsWith(class454.field6061.method2547(-98, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class454.field6061.method2547(-62, 0).length());
        } else if (class243.field3143 != 0) {
            if (var2.startsWith(class454.field6050.method2547(-56, class243.field3143))) {
                var3 = 0;
                arg0 = arg0.substring(class454.field6050.method2547(-96, class243.field3143).length());
            } else if (var2.startsWith(class454.field6051.method2547(-119, class243.field3143))) {
                var3 = 1;
                arg0 = arg0.substring(class454.field6051.method2547(-111, class243.field3143).length());
            } else if (var2.startsWith(class454.field6052.method2547(-60, class243.field3143))) {
                var3 = 2;
                arg0 = arg0.substring(class454.field6052.method2547(-52, class243.field3143).length());
            } else if (var2.startsWith(class454.field6053.method2547(-91, class243.field3143))) {
                var3 = 3;
                arg0 = arg0.substring(class454.field6053.method2547(-124, class243.field3143).length());
            } else if (var2.startsWith(class454.field6054.method2547(-97, class243.field3143))) {
                var3 = 4;
                arg0 = arg0.substring(class454.field6054.method2547(-58, class243.field3143).length());
            } else if (var2.startsWith(class454.field6055.method2547(-99, class243.field3143))) {
                var3 = 5;
                arg0 = arg0.substring(class454.field6055.method2547(-120, class243.field3143).length());
            } else if (var2.startsWith(class454.field6056.method2547(-90, class243.field3143))) {
                var3 = 6;
                arg0 = arg0.substring(class454.field6056.method2547(-81, class243.field3143).length());
            } else if (var2.startsWith(class454.field6057.method2547(-123, class243.field3143))) {
                var3 = 7;
                arg0 = arg0.substring(class454.field6057.method2547(-123, class243.field3143).length());
            } else if (var2.startsWith(class454.field6058.method2547(-93, class243.field3143))) {
                var3 = 8;
                arg0 = arg0.substring(class454.field6058.method2547(-111, class243.field3143).length());
            } else if (var2.startsWith(class454.field6059.method2547(-63, class243.field3143))) {
                var3 = 9;
                arg0 = arg0.substring(class454.field6059.method2547(-89, class243.field3143).length());
            } else if (var2.startsWith(class454.field6060.method2547(-122, class243.field3143))) {
                var3 = 10;
                arg0 = arg0.substring(class454.field6060.method2547(-118, class243.field3143).length());
            } else if (var2.startsWith(class454.field6061.method2547(-97, class243.field3143))) {
                var3 = 11;
                arg0 = arg0.substring(class454.field6061.method2547(-109, class243.field3143).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class454.field6062.method2547(-90, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class454.field6062.method2547(-102, 0).length());
        } else if (var4.startsWith(class454.field6063.method2547(-118, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class454.field6063.method2547(-61, 0).length());
        } else if (var4.startsWith(class454.field6064.method2547(-96, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class454.field6064.method2547(-89, 0).length());
        } else if (var4.startsWith(class454.field6065.method2547(-118, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class454.field6065.method2547(-95, 0).length());
        } else if (var4.startsWith(class454.field6066.method2547(-68, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class454.field6066.method2547(-76, 0).length());
        } else if (class243.field3143 != 0) {
            if (var4.startsWith(class454.field6062.method2547(-72, class243.field3143))) {
                var5 = 1;
                arg0 = arg0.substring(class454.field6062.method2547(-62, class243.field3143).length());
            } else if (var4.startsWith(class454.field6063.method2547(-79, class243.field3143))) {
                var5 = 2;
                arg0 = arg0.substring(class454.field6063.method2547(-93, class243.field3143).length());
            } else if (var4.startsWith(class454.field6064.method2547(-102, class243.field3143))) {
                var5 = 3;
                arg0 = arg0.substring(class454.field6064.method2547(-94, class243.field3143).length());
            } else if (var4.startsWith(class454.field6065.method2547(-78, class243.field3143))) {
                var5 = 4;
                arg0 = arg0.substring(class454.field6065.method2547(-109, class243.field3143).length());
            } else if (var4.startsWith(class454.field6066.method2547(-111, class243.field3143))) {
                var5 = 5;
                arg0 = arg0.substring(class454.field6066.method2547(-101, class243.field3143).length());
            }
        }
        field2585++;
        class589 var6 = class514.method2994(-29488, class760.field10605, class121.field1759);
        var6.field8251.method2578(0, -1221492240);
        int var7 = var6.field8251.field6193;
        var6.field8251.method2578(var3, -1221492240);
        var6.field8251.method2578(var5, -1221492240);
        class22.method139(var6.field8251, arg0, 28108);
        var6.field8251.method2581(-1, var6.field8251.field6193 - var7);
        class737.method4107(var6, 7);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 7827)
    private static final void method1264(int arg0) {
        class288 var1 = class501.method2936(-103, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class288[] var3 = class416.field5300[var2];
        if (var3 == null) {
            class288[] var4 = class218.field2938[var2];
            int var5 = var4.length;
            var3 = class416.field5300[var2] = new class288[var5];
            class135.method993(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class135.method993(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(IZ)V", line = 7863)
    public static final void method1265(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lev;I)V", line = 7879)
    private static final void method1266(class694 arg0, int arg1) {
        Object[] var2 = arg0.field9645;
        int var3 = (Integer) var2[0];
        class672 var4 = class309.method1856(var3, -2);
        if (var4 == null) {
            return;
        }
        field2578 = new int[var4.field9405];
        int var5 = 0;
        field2580 = new String[var4.field9404];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field9647;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field9643;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field9635 == null ? -1 : arg0.field9635.field3696;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field9639;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field9635 == null ? -1 : arg0.field9635.field3740;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field9640 == null ? -1 : arg0.field9640.field3696;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field9640 == null ? -1 : arg0.field9640.field3740;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field9650;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field9638;
                }
                field2578[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field9633;
                }
                field2580[var6++] = var9;
            }
        }
        field2604 = arg0.field9646;
        method1268(var4, arg1);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 7960)
    private static final void method1267(int arg0) {
        class288 var1 = class501.method2936(-120, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class288[] var3 = class416.field5300[var2];
        if (var3 == null) {
            class288[] var4 = class218.field2938[var2];
            int var5 = var4.length;
            var3 = class416.field5300[var2] = new class288[var5];
            class135.method993(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class135.method993(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lpc;I)V", line = 7997)
    private static final void method1268(class672 arg0, int arg1) {
        field2582 = 0;
        field2589 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9407;
        int[] var4 = arg0.field9406;
        byte var5 = -1;
        field2576 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
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
                        method1261(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1260(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2586[field2582++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2586[field2582++] = class516.field7236.field5190[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class516.field7236.method2282(var8, field2586[--field2582], (byte) -32);
                } else if (var43 == 3) {
                    field2581[field2589++] = arg0.field9412[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2582 -= 2;
                    if (field2586[field2582 + 1] != field2586[field2582]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2582 -= 2;
                    if (field2586[field2582 + 1] == field2586[field2582]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2582 -= 2;
                    if (field2586[field2582] < field2586[field2582 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2582 -= 2;
                    if (field2586[field2582] > field2586[field2582 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2576 == 0) {
                        return;
                    }
                    class657 var9 = field2598[--field2576];
                    arg0 = var9.field9146;
                    var3 = arg0.field9407;
                    var4 = arg0.field9406;
                    var2 = var9.field9150;
                    field2578 = var9.field9149;
                    field2580 = var9.field9151;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2586[field2582++] = class516.field7236.method1524(0, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class516.field7236.method2283(field2586[--field2582], 0, var11);
                } else if (var43 == 31) {
                    field2582 -= 2;
                    if (field2586[field2582] <= field2586[field2582 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2582 -= 2;
                    if (field2586[field2582] >= field2586[field2582 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2586[field2582++] = field2578[var4[var2]];
                } else if (var43 == 34) {
                    field2578[var4[var2]] = field2586[--field2582];
                } else if (var43 == 35) {
                    field2581[field2589++] = field2580[var4[var2]];
                } else if (var43 == 36) {
                    field2580[var4[var2]] = field2581[--field2589];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2589 -= var12;
                    String var13 = class90.method731(field2589, var12, field2581, true);
                    field2581[field2589++] = var13;
                } else if (var43 == 38) {
                    field2582--;
                } else if (var43 == 39) {
                    field2589--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class672 var15 = class309.method1856(var14, -2);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9405];
                    String[] var17 = new String[var15.field9404];
                    for (int var18 = 0; var18 < var15.field9403; var18++) {
                        var16[var18] = field2586[field2582 + var18 - var15.field9403];
                    }
                    for (int var19 = 0; var19 < var15.field9408; var19++) {
                        var17[var19] = field2581[field2589 + var19 - var15.field9408];
                    }
                    field2582 -= var15.field9403;
                    field2589 -= var15.field9408;
                    class657 var20 = new class657();
                    var20.field9146 = arg0;
                    var20.field9150 = var2;
                    var20.field9149 = field2578;
                    var20.field9151 = field2580;
                    if (field2576 >= field2598.length) {
                        throw new RuntimeException();
                    }
                    field2598[field2576++] = var20;
                    arg0 = var15;
                    var3 = var15.field9407;
                    var4 = var15.field9406;
                    var2 = -1;
                    field2578 = var16;
                    field2580 = var17;
                } else if (var43 == 42) {
                    field2586[field2582++] = class564.field7931[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class564.field7931[var21] = field2586[--field2582];
                    class241.method1509(-58, var21);
                    class473.field6353 |= class133.field1924[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2586[--field2582];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2596[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field2600[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2586[--field2582];
                    if (var28 < 0 || var28 >= field2596[var27]) {
                        throw new RuntimeException();
                    }
                    field2586[field2582++] = field2600[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2582 -= 2;
                    int var30 = field2586[field2582];
                    if (var30 < 0 || var30 >= field2596[var29]) {
                        throw new RuntimeException();
                    }
                    field2600[var29][var30] = field2586[field2582 + 1];
                } else if (var43 == 47) {
                    String var31 = class629.field8664[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2581[field2589++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class629.field8664[var32] = field2581[--field2589];
                    class356.method2067(16804, var32);
                } else if (var43 == 51) {
                    class165 var33 = arg0.field9413[var4[var2]];
                    class393 var34 = (class393) var33.method1160((long) field2586[--field2582], 122);
                    if (var34 != null) {
                        var2 += var34.field4992;
                    }
                } else if (var43 == 86) {
                    if (field2586[--field2582] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field2586[--field2582] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field9414 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field2333).append(" ");
                for (int var41 = field2576 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2598[var41].field9146.field2333).append(" ");
                }
                var40.append("op: ").append(var5);
                class684.method3842(1, var42, var40.toString());
            } else {
                class283.method1695(-78, 4, "Clientscript error in: " + arg0.field9414);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9414).append("\n");
                for (int var38 = field2576 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2598[var38].field9146.field9414).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class684.method3842(1, var42, var37.toString());
                class320.method1883((byte) -60, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "()V")
    public static void method1269() {
        field2578 = null;
        field2580 = null;
        field2596 = null;
        field2600 = null;
        field2586 = null;
        field2581 = null;
        field2598 = null;
        field2588 = null;
        field2577 = null;
        field2595 = null;
        field2599 = null;
        field2603 = null;
        field2601 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        if (arg0 == -1 || !class525.method3039(4, arg0)) {
            return;
        }
        class288[] var1 = class218.field2938[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class288 var3 = var1[var2];
            if (var3.field3686 != null) {
                class694 var4 = new class694();
                var4.field9635 = var3;
                var4.field9645 = var3.field3686;
                method1266(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(C)I")
    private static final int method1271(char arg0) {
        return class297.method1779(arg0, -97) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "()V")
    public static final void method1272() {
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lsf;II)V")
    public static final void method1273(class526 arg0, int arg1, int arg2) {
        class672 var3 = class275.method1630(arg1, -73, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field2578 = new int[var3.field9405];
        field2580 = new String[var3.field9404];
        if (class400.field5092 == var3.field9415 || class99.field1372 == var3.field9415 || class68.field966 == var3.field9415) {
            int var4 = 0;
            int var5 = 0;
            if (class190.field2623 != null) {
                var4 = class190.field2623.field3635;
                var5 = class190.field2623.field3687;
            }
            field2578[0] = class680.field9495.method1118((byte) 125) - var4;
            field2578[1] = class680.field9495.method1115(4) - var5;
        }
        method1268(var3, 200000);
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method1274(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2599.setTime(new Date(var1));
        int var3 = field2599.get(5);
        int var4 = field2599.get(2);
        int var5 = field2599.get(1);
        return var3 + "-" + field2603[var4] + "-" + var5;
    }
}
