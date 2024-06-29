import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class195 {

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    private static int field2612 = 0;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    private static int field2627 = 0;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "[Lhp;")
    private static class327[] field2631 = new class327[50];

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "[[I")
    private static int[][] field2629 = new int[5][5000];

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "[I")
    private static int[] field2626 = new int[5];

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    private static int field2624 = 0;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "[I")
    private static int[] field2628 = new int[1000];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field2614 = new String[1000];

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2625 = Calendar.getInstance();

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "[I")
    private static int[] field2635 = new int[3];

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field2636 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "Lau;")
    public static class692 field2634 = new class692(4);

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    private static int field2637 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Llea;")
    private static class510 field2621;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Lps;")
    private static class5 field2610;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "Lps;")
    private static class5 field2620;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "[I")
    private static int[] field2611;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field2623;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)V")
    private static final void method1262(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2628[field2624++] = class639.field9183;
                return;
            }
            if (arg0 == 5001) {
                field2624 -= 3;
                class639.field9183 = field2628[field2624];
                class572.field8305 = class367.method2247(-5630, field2628[field2624 + 1]);
                if (class572.field8305 == null) {
                    class572.field8305 = class617.field8894;
                }
                class386.field5769 = field2628[field2624 + 2];
                field2633++;
                class654 var2 = class631.method3628(class614.field8858, (byte) -51, class357.field5280);
                var2.field9358.method3110(class639.field9183, 118);
                var2.field9358.method3110(class572.field8305.field1838, 79);
                var2.field9358.method3110(class386.field5769, 72);
                class444.method2623(116, var2);
                return;
            }
            if (arg0 == 5002) {
                field2612 -= 2;
                String var3 = field2614[field2612];
                String var4 = field2614[field2612 + 1];
                field2624 -= 2;
                int var5 = field2628[field2624];
                int var6 = field2628[field2624 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2622++;
                class654 var7 = class631.method3628(class185.field2518, (byte) -51, class357.field5280);
                var7.field9358.method3110(class420.method2543(1, var3) + class420.method2543(1, var4) + 2, 124);
                var7.field9358.method3132(var3, 3);
                var7.field9358.method3110(var5 - 1, 77);
                var7.field9358.method3110(var6, 122);
                var7.field9358.method3132(var4, 3);
                class444.method2623(124, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2628[--field2624];
                class154 var9 = class129.method921(95, var8);
                String var10 = "";
                if (var9 != null && var9.field2182 != null) {
                    var10 = var9.field2182;
                }
                field2614[field2612++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2628[--field2624];
                class154 var12 = class129.method921(44, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2188;
                }
                field2628[field2624++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class572.field8305 == null) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = class572.field8305.field1838;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2628[--field2624];
                class654 var15 = class631.method3628(class45.field682, (byte) -51, class357.field5280);
                var15.field9358.method3110(var14, 70);
                class444.method2623(121, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2614[--field2612];
                method1269(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2612 -= 2;
                String var17 = field2614[field2612];
                String var18 = field2614[field2612 + 1];
                if (class248.field3272 != 0 || (!class379.field5684 || class621.field8993) && !class398.field6008) {
                    field2632++;
                    class654 var19 = class631.method3628(class401.field6040, (byte) -51, class357.field5280);
                    var19.field9358.method3110(0, 42);
                    int var20 = var19.field9358.field7956;
                    var19.field9358.method3132(var17, 3);
                    class309.method1928((byte) 67, var18, var19.field9358);
                    var19.field9358.method3142(var19.field9358.field7956 - var20, true);
                    class444.method2623(124, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2628[--field2624];
                class154 var22 = class129.method921(55, var21);
                String var23 = "";
                if (var22 != null && var22.field2178 != null) {
                    var23 = var22.field2178;
                }
                field2614[field2612++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2628[--field2624];
                class154 var25 = class129.method921(40, var24);
                String var26 = "";
                if (var25 != null && var25.field2184 != null) {
                    var26 = var25.field2184;
                }
                field2614[field2612++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2628[--field2624];
                class154 var28 = class129.method921(119, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2186;
                }
                field2628[field2624++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class321.field4681 == null || class321.field4681.field1106 == null) {
                    var30 = class11.field278;
                } else {
                    var30 = class321.field4681.method417(true, true);
                }
                field2614[field2612++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2628[field2624++] = class386.field5769;
                return;
            }
            if (arg0 == 5017) {
                field2628[field2624++] = class395.method2462((byte) 9);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2628[--field2624];
                class154 var32 = class129.method921(55, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2183;
                }
                field2628[field2624++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2628[--field2624];
                class154 var35 = class129.method921(51, var34);
                String var36 = "";
                if (var35 != null && var35.field2187 != null) {
                    var36 = var35.field2187;
                }
                field2614[field2612++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class321.field4681 == null || class321.field4681.field1106 == null) {
                    var37 = class11.field278;
                } else {
                    var37 = class321.field4681.method413(false, 0);
                }
                field2614[field2612++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2628[--field2624];
                class154 var39 = class129.method921(68, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2181;
                }
                field2628[field2624++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2628[--field2624];
                class154 var42 = class129.method921(115, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2185;
                }
                field2628[field2624++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2628[--field2624];
                class154 var45 = class129.method921(123, var44);
                String var46 = "";
                if (var45 != null && var45.field2180 != null) {
                    var46 = var45.field2180;
                }
                field2614[field2612++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2628[--field2624];
                field2614[field2612++] = class177.field2474.method821(var47, -32769).field8412;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2628[--field2624];
                class579 var49 = class177.field2474.method821(var48, -32769);
                if (var49.field8408 == null) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = var49.field8408.length;
                return;
            }
            if (arg0 == 5052) {
                field2624 -= 2;
                int var50 = field2628[field2624];
                int var51 = field2628[field2624 + 1];
                class579 var52 = class177.field2474.method821(var50, -32769);
                int var53 = var52.field8408[var51];
                field2628[field2624++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2628[--field2624];
                class579 var55 = class177.field2474.method821(var54, -32769);
                if (var55.field8405 == null) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = var55.field8405.length;
                return;
            }
            if (arg0 == 5054) {
                field2624 -= 2;
                int var56 = field2628[field2624];
                int var57 = field2628[field2624 + 1];
                field2628[field2624++] = class177.field2474.method821(var56, -32769).field8405[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2628[--field2624];
                field2614[field2612++] = class23.field431.method2749(var58, false).method1347((byte) -77);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2628[--field2624];
                class212 var60 = class23.field431.method2749(var59, false);
                if (var60.field2866 == null) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = var60.field2866.length;
                return;
            }
            if (arg0 == 5057) {
                field2624 -= 2;
                int var61 = field2628[field2624];
                int var62 = field2628[field2624 + 1];
                field2628[field2624++] = class23.field431.method2749(var61, false).field2866[var62];
                return;
            }
            if (arg0 == 5058) {
                field2621 = new class510();
                field2621.field7198 = field2628[--field2624];
                field2621.field7195 = class23.field431.method2749(field2621.field7198, false);
                field2621.field7201 = new int[field2621.field7195.method1343(-90)];
                return;
            }
            if (arg0 == 5059) {
                field2616++;
                class654 var63 = class631.method3628(class147.field2094, (byte) -51, class357.field5280);
                var63.field9358.method3110(0, 49);
                int var64 = var63.field9358.field7956;
                var63.field9358.method3110(0, 76);
                var63.field9358.method3162(-2003712696, field2621.field7198);
                field2621.field7195.method1348(var63.field9358, field2621.field7201, (byte) -83);
                var63.field9358.method3142(var63.field9358.field7956 - var64, true);
                class444.method2623(118, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2614[--field2612];
                field2609++;
                class654 var66 = class631.method3628(class80.field1293, (byte) -51, class357.field5280);
                var66.field9358.method3110(0, 53);
                int var67 = var66.field9358.field7956;
                var66.field9358.method3132(var65, 3);
                var66.field9358.method3162(-2003712696, field2621.field7198);
                field2621.field7195.method1348(var66.field9358, field2621.field7201, (byte) -101);
                var66.field9358.method3142(var66.field9358.field7956 - var67, true);
                class444.method2623(124, var66);
                return;
            }
            if (arg0 == 5061) {
                field2616++;
                class654 var68 = class631.method3628(class147.field2094, (byte) -51, class357.field5280);
                var68.field9358.method3110(0, 102);
                int var69 = var68.field9358.field7956;
                var68.field9358.method3110(1, 38);
                var68.field9358.method3162(-2003712696, field2621.field7198);
                field2621.field7195.method1348(var68.field9358, field2621.field7201, (byte) -75);
                var68.field9358.method3142(var68.field9358.field7956 - var69, true);
                class444.method2623(116, var68);
                return;
            }
            if (arg0 == 5062) {
                field2624 -= 2;
                int var70 = field2628[field2624];
                int var71 = field2628[field2624 + 1];
                field2628[field2624++] = class177.field2474.method821(var70, -32769).field8403[var71];
                return;
            }
            if (arg0 == 5063) {
                field2624 -= 2;
                int var72 = field2628[field2624];
                int var73 = field2628[field2624 + 1];
                field2628[field2624++] = class177.field2474.method821(var72, -32769).field8404[var73];
                return;
            }
            if (arg0 == 5064) {
                field2624 -= 2;
                int var74 = field2628[field2624];
                int var75 = field2628[field2624 + 1];
                if (var75 == -1) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = class177.field2474.method821(var74, -32769).method3328((byte) 116, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field2624 -= 2;
                int var76 = field2628[field2624];
                int var77 = field2628[field2624 + 1];
                if (var77 == -1) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = class177.field2474.method821(var76, -32769).method3327(false, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2628[--field2624];
                field2628[field2624++] = class23.field431.method2749(var78, false).method1343(-26);
                return;
            }
            if (arg0 == 5067) {
                field2624 -= 2;
                int var79 = field2628[field2624];
                int var80 = field2628[field2624 + 1];
                int var81 = class23.field431.method2749(var79, false).method1341(var80, (byte) 119).field3559;
                field2628[field2624++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2624 -= 2;
                int var82 = field2628[field2624];
                int var83 = field2628[field2624 + 1];
                field2621.field7201[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2624 -= 2;
                int var84 = field2628[field2624];
                int var85 = field2628[field2624 + 1];
                field2621.field7201[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2624 -= 3;
                int var86 = field2628[field2624];
                int var87 = field2628[field2624 + 1];
                int var88 = field2628[field2624 + 2];
                class212 var89 = class23.field431.method2749(var86, false);
                if (var89.method1341(var87, (byte) 127).field3559 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2628[field2624++] = var89.method1349(6803, var88, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2614[--field2612];
                boolean var91 = field2628[--field2624] == 1;
                class279.method1655(0, var90, var91);
                field2628[field2624++] = class547.field8067;
                return;
            }
            if (arg0 == 5072) {
                if (class274.field3591 != null && class245.field3239 < class547.field8067) {
                    field2628[field2624++] = class274.field3591[class245.field3239++] & 0xFFFF;
                    return;
                }
                field2628[field2624++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class245.field3239 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class18.field362.method1609(86, -27453)) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class18.field362.method1609(82, -27453)) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class18.field362.method1609(81, -27453)) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class111.method840(field2628[--field2624], -91);
                return;
            }
            if (arg0 == 5201) {
                field2628[field2624++] = class170.method1184((byte) 73);
                return;
            }
            if (arg0 == 5205) {
                class63.method390(-1, field2628[--field2624], false, (byte) 11, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field2628[--field2624];
                class604 var93 = class55.method334(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = var93.field8730;
                return;
            }
            if (arg0 == 5207) {
                class604 var94 = class55.method333(field2628[--field2624]);
                if (var94 != null && var94.field8731 != null) {
                    field2614[field2612++] = var94.field8731;
                    return;
                }
                field2614[field2612++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2628[field2624++] = class530.field7814;
                field2628[field2624++] = class583.field8469;
                return;
            }
            if (arg0 == 5209) {
                field2628[field2624++] = class55.field865 + class108.field1617;
                field2628[field2624++] = class55.field866 + class19.field375;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field2628[--field2624];
                class604 var96 = class55.method333(var95);
                if (var96 == null) {
                    field2628[field2624++] = 0;
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = var96.field8732 >> 14 & 0x3FFF;
                field2628[field2624++] = var96.field8732 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field2628[--field2624];
                class604 var98 = class55.method333(var97);
                if (var98 == null) {
                    field2628[field2624++] = 0;
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = var98.field8724 - var98.field8723;
                field2628[field2624++] = var98.field8728 - var98.field8734;
                return;
            }
            if (arg0 == 5212) {
                class415 var99 = class108.method817(-115);
                if (var99 == null) {
                    field2628[field2624++] = -1;
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = var99.field6142;
                int var100 = var99.field6144 << 28 | class55.field865 + var99.field6143 << 14 | class55.field866 + var99.field6145;
                field2628[field2624++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class415 var101 = class175.method1200((byte) -32);
                if (var101 == null) {
                    field2628[field2624++] = -1;
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = var101.field6142;
                int var102 = var101.field6144 << 28 | class55.field865 + var101.field6143 << 14 | class55.field866 + var101.field6145;
                field2628[field2624++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field2628[--field2624];
                class604 var104 = class394.method2452((byte) -62);
                if (var104 != null) {
                    boolean var105 = var104.method3450(var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, (byte) 72, var103 & 0x3FFF, field2635);
                    if (var105) {
                        class660.method3714(10, field2635[1], field2635[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2624 -= 2;
                int var106 = field2628[field2624];
                int var107 = field2628[field2624 + 1];
                class158 var108 = class55.method345(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class604 var110 = (class604) var108.method1126(-125); var110 != null; var110 = (class604) var108.method1128(11)) {
                    if (var110.field8730 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field2628[--field2624];
                class604 var112 = class55.method333(var111);
                if (var112 == null) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = var112.field8736;
                return;
            }
            if (arg0 == 5220) {
                field2628[field2624++] = class87.field1348 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field2628[--field2624];
                class660.method3714(10, var113 >> 14 & 0x3FFF, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class604 var114 = class394.method2452((byte) -87);
                if (var114 != null) {
                    boolean var115 = var114.method3447(field2635, class55.field866 + class19.field375, class55.field865 + class108.field1617, -6038);
                    if (var115) {
                        field2628[field2624++] = field2635[1];
                        field2628[field2624++] = field2635[2];
                        return;
                    }
                    field2628[field2624++] = -1;
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = -1;
                field2628[field2624++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2624 -= 2;
                int var116 = field2628[field2624];
                int var117 = field2628[field2624 + 1];
                class63.method390(var117 & 0x3FFF, var116, false, (byte) 11, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field2628[--field2624];
                class604 var119 = class394.method2452((byte) -76);
                if (var119 != null) {
                    boolean var120 = var119.method3450(var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, (byte) 64, var118 & 0x3FFF, field2635);
                    if (var120) {
                        field2628[field2624++] = field2635[1];
                        field2628[field2624++] = field2635[2];
                        return;
                    }
                    field2628[field2624++] = -1;
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = -1;
                field2628[field2624++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field2628[--field2624];
                class604 var122 = class394.method2452((byte) -107);
                if (var122 != null) {
                    boolean var123 = var122.method3447(field2635, var121 & 0x3FFF, var121 >> 14 & 0x3FFF, -6038);
                    if (var123) {
                        field2628[field2624++] = field2635[1];
                        field2628[field2624++] = field2635[2];
                        return;
                    }
                    field2628[field2624++] = -1;
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = -1;
                field2628[field2624++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class645.method3672(field2628[--field2624], -75);
                return;
            }
            if (arg0 == 5227) {
                field2624 -= 2;
                int var124 = field2628[field2624];
                int var125 = field2628[field2624 + 1];
                class63.method390(var125 & 0x3FFF, var124, true, (byte) 11, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class309.field4555 = field2628[--field2624] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2628[field2624++] = class309.field4555 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field2628[--field2624];
                class504.method2872(var126, -89);
                return;
            }
            if (arg0 == 5231) {
                field2624 -= 2;
                int var127 = field2628[field2624];
                boolean var128 = field2628[field2624 + 1] == 1;
                if (class59.field956 != null) {
                    class381 var129 = class59.field956.method2002((byte) -109, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method2360((byte) 66);
                        return;
                    }
                    if (var129 == null && var128) {
                        class381 var130 = new class381();
                        class59.field956.method2001(60, var130, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field2628[--field2624];
                if (class59.field956 != null) {
                    class381 var132 = class59.field956.method2002((byte) -117, (long) var131);
                    field2628[field2624++] = var132 == null ? 0 : 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2624 -= 2;
                int var133 = field2628[field2624];
                boolean var134 = field2628[field2624 + 1] == 1;
                if (class568.field8272 != null) {
                    class381 var135 = class568.field8272.method2002((byte) -112, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method2360((byte) 66);
                        return;
                    }
                    if (var135 == null && var134) {
                        class381 var136 = new class381();
                        class568.field8272.method2001(77, var136, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field2628[--field2624];
                if (class568.field8272 != null) {
                    class381 var138 = class568.field8272.method2002((byte) -106, (long) var137);
                    field2628[field2624++] = var138 == null ? 0 : 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2628[field2624++] = class55.field833 == null ? -1 : class55.field833.field8730;
                return;
            }
            if (arg0 == 5236) {
                field2624 -= 2;
                int var139 = field2628[field2624];
                int var140 = field2628[field2624 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class622.method3584(var142, var141, var139, (byte) 63);
                if (var143 < 0) {
                    field2628[field2624++] = -1;
                    return;
                }
                field2628[field2624++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class69.method404(-31369);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2624 -= 2;
                int var144 = field2628[field2624];
                int var145 = field2628[field2624 + 1];
                class378.method2336(var145, false, (byte) -115, var144, 3);
                field2628[field2624++] = class348.field5160 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class348.field5160 != null) {
                    class378.method2336(-1, false, (byte) -121, -1, class335.field4872.field9474);
                }
                return;
            }
            if (arg0 == 5302) {
                class432[] var146 = class334.method2052(116);
                field2628[field2624++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field2628[--field2624];
                class432[] var148 = class334.method2052(105);
                field2628[field2624++] = var148[var147].field6273;
                field2628[field2624++] = var148[var147].field6274;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class335.field4872.field9505;
                int var150 = class335.field4872.field9490;
                int var151 = -1;
                class432[] var152 = class334.method2052(127);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class432 var154 = var152[var153];
                    if (var154.field6273 == var149 && var154.field6274 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field2628[field2624++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field2628[field2624++] = class38.method219(-2);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field2628[--field2624];
                if (var155 >= 1 && var155 <= 2) {
                    class378.method2336(-1, false, (byte) -117, -1, var155);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2628[field2624++] = class335.field4872.field9474;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field2628[--field2624];
                if (var156 >= 1 && var156 <= 2) {
                    class335.field4872.field9474 = var156;
                    class335.field4872.method3442(class61.field978, 114);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2612 -= 2;
                String var157 = field2614[field2612];
                String var158 = field2614[field2612 + 1];
                int var159 = field2628[--field2624];
                field2613++;
                class654 var160 = class631.method3628(class508.field7169, (byte) -51, class357.field5280);
                var160.field9358.method3110(class420.method2543(1, var157) + class420.method2543(1, var158) + 1, 123);
                var160.field9358.method3132(var157, 3);
                var160.field9358.method3132(var158, 3);
                var160.field9358.method3110(var159, 76);
                class444.method2623(120, var160);
                return;
            }
            if (arg0 == 5401) {
                field2624 -= 2;
                class488.field6928[field2628[field2624]] = (short) class693.method3908(field2628[field2624 + 1], true);
                class259.field3355.method2383(-1);
                class259.field3355.method2384(-118);
                class563.field8235.method1091(512);
                class12.method83((byte) -53);
                return;
            }
            if (arg0 == 5405) {
                field2624 -= 2;
                int var161 = field2628[field2624];
                int var162 = field2628[field2624 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class705.field9985[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2624 -= 7;
                int var163 = field2628[field2624];
                int var164 = field2628[field2624 + 1] << 1;
                int var165 = field2628[field2624 + 2];
                int var166 = field2628[field2624 + 3];
                int var167 = field2628[field2624 + 4];
                int var168 = field2628[field2624 + 5];
                int var169 = field2628[field2624 + 6];
                if (var163 >= 0 && var163 < 2 && class705.field9985[var163] != null && var164 >= 0 && var164 < class705.field9985[var163].length) {
                    class705.field9985[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class705.field9985[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class705.field9985[field2628[--field2624]].length >> 1;
                field2628[field2624++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class348.field5160 != null) {
                    class378.method2336(-1, false, (byte) -115, -1, class335.field4872.field9474);
                }
                if (class388.field5808 != null) {
                    class177.method1206((byte) -112);
                    System.exit(0);
                    return;
                }
                String var171 = class468.field6738 == null ? class293.method1806(true) : class468.field6738;
                class86.method487(class61.field978, false, 2, var171, class62.field996 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class665.field9442 != null) {
                    if (class665.field9442.field3307 == null) {
                        var172 = class351.method2169(6711, class665.field9442.field3308);
                    } else {
                        var172 = (String) class665.field9442.field3307;
                    }
                }
                field2614[field2612++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field2628[field2624++] = class61.field978.field3004 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class348.field5160 != null) {
                    class378.method2336(-1, false, (byte) -107, -1, class335.field4872.field9474);
                }
                String var173 = field2614[--field2612];
                boolean var174 = field2628[--field2624] == 1;
                String var175 = class293.method1806(true) + var173;
                class86.method487(class61.field978, var174, 2, var175, class62.field996 == 1);
                return;
            }
            if (arg0 == 5422) {
                field2612 -= 2;
                String var176 = field2614[field2612];
                String var177 = field2614[field2612 + 1];
                int var178 = field2628[--field2624];
                if (var176.length() > 0) {
                    if (class160.field2278 == null) {
                        class160.field2278 = new String[class561.field8216[class478.field6840.field5519]];
                    }
                    class160.field2278[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class508.field7175 == null) {
                        class508.field7175 = new String[class561.field8216[class478.field6840.field5519]];
                    }
                    class508.field7175[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2614[--field2612]);
                return;
            }
            if (arg0 == 5424) {
                field2624 -= 11;
                class400.field6029 = field2628[field2624];
                class102.field1537 = field2628[field2624 + 1];
                class74.field1161 = field2628[field2624 + 2];
                class497.field7034 = field2628[field2624 + 3];
                class302.field4474 = field2628[field2624 + 4];
                class578.field8394 = field2628[field2624 + 5];
                class375.field5659 = field2628[field2624 + 6];
                class48.field765 = field2628[field2624 + 7];
                class432.field6275 = field2628[field2624 + 8];
                class675.field9516 = field2628[field2624 + 9];
                class477.field6834 = field2628[field2624 + 10];
                class595.field8616.method1818(class302.field4474, 4);
                class595.field8616.method1818(class578.field8394, 4);
                class595.field8616.method1818(class375.field5659, 4);
                class595.field8616.method1818(class48.field765, 4);
                class595.field8616.method1818(class432.field6275, 4);
                class612.field8821 = null;
                class699.field9837 = null;
                class552.field8120 = null;
                class177.field2473 = null;
                class652.field9332 = null;
                class46.field711 = null;
                class200.field2722 = null;
                class541.field8023 = null;
                class70.field1083 = true;
                return;
            }
            if (arg0 == 5425) {
                class565.method3259(-28871);
                class70.field1083 = false;
                return;
            }
            if (arg0 == 5426) {
                field2624 -= 2;
                class676.field9528 = field2628[field2624];
                class379.field5696 = field2628[field2624 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2624 -= 2;
                class13.field307 = field2628[field2624 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2624 -= 2;
                int var179 = field2628[field2624];
                int var180 = field2628[field2624 + 1];
                field2628[field2624++] = class79.method459(var179, -97, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class640.method3648(false, false, field2614[--field2612], -82);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class101.method727("accountcreated", -110, class551.field8116);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class101.method727("accountcreatestarted", -112, class551.field8116);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class562.field8219 != null) {
                    Transferable var182 = class562.field8219.getContents(null);
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
                field2614[field2612++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2624 -= 4;
                int var183 = field2628[field2624];
                int var184 = field2628[field2624 + 1];
                int var185 = field2628[field2624 + 2];
                int var186 = field2628[field2624 + 3];
                class409.method2508(var186, var184 << 2, (var183 >> 14 & 0x3FFF) - class397.field6005, false, var185, (var183 & 0x3FFF) - class403.field6049, 512);
                return;
            }
            if (arg0 == 5501) {
                field2624 -= 4;
                int var187 = field2628[field2624];
                int var188 = field2628[field2624 + 1];
                int var189 = field2628[field2624 + 2];
                int var190 = field2628[field2624 + 3];
                class653.method3694(var188 << 2, var189, (var187 >> 14 & 0x3FFF) - class397.field6005, (var187 & 0x3FFF) - class403.field6049, 0, var190);
                return;
            }
            if (arg0 == 5502) {
                field2624 -= 6;
                int var191 = field2628[field2624];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class74.field1160 = var191;
                int var192 = field2628[field2624 + 1];
                if (var192 + 1 >= class705.field9985[class74.field1160].length >> 1) {
                    throw new RuntimeException();
                }
                class27.field483 = var192;
                class45.field679 = 0;
                class183.field2516 = field2628[field2624 + 2];
                class343.field5079 = field2628[field2624 + 3];
                int var193 = field2628[field2624 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class426.field6233 = var193;
                int var194 = field2628[field2624 + 5];
                if (var194 + 1 >= class705.field9985[class426.field6233].length >> 1) {
                    throw new RuntimeException();
                }
                class503.field7111 = var194;
                class684.field9659 = 3;
                class150.field2120 = -1;
                class250.field3280 = -1;
                return;
            }
            if (arg0 == 5503) {
                class485.method2772((byte) -81);
                return;
            }
            if (arg0 == 5504) {
                field2624 -= 2;
                class362.method2223(0, field2628[field2624 + 1], field2628[field2624], 1);
                return;
            }
            if (arg0 == 5505) {
                field2628[field2624++] = (int) class528.field7602 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2628[field2624++] = (int) class311.field4589 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class624.method3590((byte) 115);
                return;
            }
            if (arg0 == 5508) {
                class519.method2932(-23775);
                return;
            }
            if (arg0 == 5509) {
                class95.method597((byte) 118);
                return;
            }
            if (arg0 == 5510) {
                class229.method1428(65);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field2628[--field2624];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class397.field6005;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class72.field1144) {
                    var198 = class72.field1144;
                }
                int var199 = var197 - class403.field6049;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class668.field9444) {
                    var199 = class668.field9444;
                }
                class475.field6814 = (var198 << 9) + 256;
                class35.field550 = (var199 << 9) + 256;
                class684.field9659 = 4;
                class150.field2120 = -1;
                class250.field3280 = -1;
                return;
            }
            if (arg0 == 5512) {
                class474.method2727(126);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field2628[--field2624];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class397.field6005;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class72.field1144) {
                        var203 = class72.field1144;
                    }
                    int var204 = var202 - class403.field6049;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class668.field9444) {
                        var204 = class668.field9444;
                    }
                    class250.field3280 = (var203 << 9) + 256;
                    class150.field2120 = (var204 << 9) + 256;
                    return;
                }
                class250.field3280 = -1;
                class150.field2120 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2612 -= 2;
                String var205 = field2614[field2612];
                String var206 = field2614[field2612 + 1];
                int var207 = field2628[--field2624];
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    class11.field278 = var205;
                    class239.field3137 = var206;
                    class642.field9203 = var207;
                    class322.method2003(0, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class11.method77(-36);
                return;
            }
            if (arg0 == 5602) {
                if (class641.field9191 == 0) {
                    class412.field6118 = -2;
                    class687.field9711 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2624 -= 4;
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    class217.method1372(field2628[field2624 + 2], (byte) 98, field2628[field2624 + 1], field2628[field2624 + 3], field2628[field2624]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2612--;
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    class399.method2478(-30499, class583.method3343(-116, field2614[field2612]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2612 -= 2;
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    class341.method2117(1, class583.method3343(-126, field2614[field2612]), false, field2614[field2612 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class175.field2458 == 0) {
                    class43.field622 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2628[field2624++] = class687.field9711;
                return;
            }
            if (arg0 == 5608) {
                field2628[field2624++] = class557.field8180;
                return;
            }
            if (arg0 == 5609) {
                field2628[field2624++] = class43.field622;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field2614[field2612++] = class627.field9098 == null || class627.field9098.length <= var208 ? "" : class538.method3103(7, class627.field9098[var208]);
                }
                class627.field9098 = null;
                return;
            }
            if (arg0 == 5611) {
                field2628[field2624++] = class432.field6269;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field2628[--field2624];
                if (class264.field3451 != 7) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    if (class230.field3051 != null) {
                        class230.field3051.method1362((byte) -106);
                        class230.field3051 = null;
                    }
                    class642.field9203 = var209;
                    class322.method2003(0, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2628[field2624++] = class687.field9711;
                return;
            }
            if (arg0 == 5615) {
                field2612 -= 2;
                String var210 = field2614[field2612];
                String var211 = field2614[field2612 + 1];
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    if (class230.field3051 != null) {
                        class230.field3051.method1362((byte) -121);
                        class230.field3051 = null;
                    }
                    class11.field278 = var210;
                    class239.field3137 = var211;
                    class322.method2003(0, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class65.method395(false, 37);
                return;
            }
            if (arg0 == 5617) {
                field2628[field2624++] = class412.field6118;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field2628[--field2624];
                class133.method946(var212, false, 3);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field2628[--field2624];
                class133.method946(var213, true, 3);
                return;
            }
            if (arg0 == 5620) {
                class600.method3411((byte) 126);
                if (class204.field2784 != "" && class204.field2784 != "") {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2612 -= 2;
                if (class264.field3451 != 3) {
                    return;
                }
                if (class641.field9191 == 0 && class175.field2458 == 0) {
                    class341.method2117(1, class583.method3343(-120, field2614[field2612]), true, field2614[field2612 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class254 var214 = class61.field978.method1416(false, 82, "3");
                while (var214.field3311 == 0) {
                    class687.method3846(1L, 66);
                }
                if (var214.field3311 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class568 var215 = (class568) var214.field3307;
                if (var215.method3270(29822).exists()) {
                    class540 var216 = new class540(50);
                    try {
                        var215.method3273(0, 50, var216.field7952, true);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method3271((byte) -86);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class119.field1771 != null) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2628[field2624++] = (int) (class224.field2970 >> 32);
                field2628[field2624++] = (int) (class224.field2970 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field2628[--field2624];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class335.field4872.field9501 = var217;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 120);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6002) {
                class335.field4872.method3436(field2628[--field2624] == 1, (byte) -94);
                class654.method3700(-1681322014);
                class508.method2889((byte) 0);
                class335.field4872.method3442(class61.field978, 120);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6003) {
                class335.field4872.field9482 = field2628[--field2624] == 1;
                class508.method2889((byte) 0);
                class335.field4872.method3442(class61.field978, 106);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6005) {
                class335.field4872.field9480 = field2628[--field2624] == 1;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 111);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6006) {
                class335.field4872.field9484 = field2628[--field2624] == 1;
                class332.field4821.method612(!class335.field4872.field9484);
                class335.field4872.method3442(class61.field978, 114);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6007) {
                class335.field4872.field9503 = field2628[--field2624];
                class335.field4872.method3442(class61.field978, 119);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6008) {
                class335.field4872.field9467 = field2628[--field2624] == 1;
                class335.field4872.method3442(class61.field978, 114);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6009) {
                class335.field4872.field9497 = field2628[--field2624] == 1;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 104);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6010) {
                class335.field4872.field9506 = field2628[--field2624] == 1;
                class335.field4872.method3442(class61.field978, 115);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field2628[--field2624];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class335.field4872.method3782(class62.field996, (byte) -112, var218);
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 117);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6012) {
                class335.field4872.method3783(26488, field2628[--field2624] == 1, class62.field996);
                class614.method3500(56);
                class456.method2668(255);
                class335.field4872.method3442(class61.field978, 125);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6014) {
                class335.field4872.field9491 = field2628[--field2624] == 1;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 118);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6015) {
                class335.field4872.field9487 = field2628[--field2624] == 1;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 117);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field2628[--field2624];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class335.field4872.field9485 = var219;
                class409.method2509(512, class62.field996);
                class335.field4872.method3442(class61.field978, 114);
                return;
            }
            if (arg0 == 6017) {
                class335.field4872.field9504 = field2628[--field2624] == 1;
                class636.method3639((byte) -53);
                class335.field4872.method3442(class61.field978, 111);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field2628[--field2624];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class335.field4872.field9495 = var220;
                class335.field4872.method3442(class61.field978, 113);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field2628[--field2624];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class335.field4872.field9471 != var221) {
                    if (class335.field4872.field9471 == 0 && class443.field6426 != -1) {
                        class78.method454(0, class443.field6426, class18.field360, -23561, var221, false);
                        class613.method3488(17299);
                        class700.field9845 = false;
                    } else if (var221 == 0) {
                        class624.method3592(-114);
                        class700.field9845 = false;
                    } else {
                        class261.method1576(var221, 32768);
                    }
                    class335.field4872.field9471 = var221;
                }
                class335.field4872.method3442(class61.field978, 121);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field2628[--field2624];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class335.field4872.field9507 = var222;
                class335.field4872.method3442(class61.field978, 111);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6021) {
                class335.field4872.field8693 = field2628[--field2624] == 1;
                class508.method2889((byte) 0);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field2628[--field2624];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class190.field2576 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class403.method2486((byte) 77, var223);
                class335.field4872.method3442(class61.field978, 123);
                class326.field4730 = false;
                field2628[field2624++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field2628[--field2624];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class335.field4872.field9478 = var225;
                class335.field4872.method3442(class61.field978, 126);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field2628[--field2624];
                if (var226 < 0 || var226 > class236.method1450(class190.field2576, 83)) {
                    var226 = 0;
                }
                class335.field4872.field9481 = var226;
                class335.field4872.method3442(class61.field978, 105);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field2628[--field2624];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class379.method2352(var227 == 1, -1);
                return;
            }
            if (arg0 == 6028) {
                class335.field4872.field9508 = field2628[--field2624] != 0;
                class335.field4872.method3442(class61.field978, 127);
                return;
            }
            if (arg0 == 6029) {
                class335.field4872.field9503 = field2628[--field2624];
                class335.field4872.method3442(class61.field978, 107);
                return;
            }
            if (arg0 == 6030) {
                class335.field4872.field9475 = field2628[--field2624] != 0;
                class335.field4872.method3442(class61.field978, 105);
                class654.method3700(-1681322014);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field2628[--field2624];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class409.method2509(512, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field2628[--field2624];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class335.field4872.field9483 = var229;
                class335.field4872.method3442(class61.field978, 110);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field2628[--field2624];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class335.field4872.field9476 = var230;
                class335.field4872.method3442(class61.field978, 122);
                return;
            }
            if (arg0 == 6034) {
                class335.field4872.field9465 = field2628[--field2624] == 1;
                class335.field4872.method3442(class61.field978, 104);
                class614.method3500(-120);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6035) {
                class335.field4872.field8700 = field2628[--field2624] == 1;
                class654.method3700(-1681322014);
                class508.method2889((byte) 0);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field2628[--field2624];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class335.field4872.method3429(1, var231);
                class335.field4872.method3442(class61.field978, 127);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field2628[--field2624];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class335.field4872.field9479 = var232;
                class335.field4872.method3442(class61.field978, 105);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field2628[--field2624];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class335.field4872.field9486 != var233 && class572.field8309 == class443.field6426) {
                    if (class335.field4872.field9486 == 0) {
                        class78.method454(0, class443.field6426, class18.field360, -23561, var233, false);
                        class613.method3488(17299);
                        class700.field9845 = false;
                    } else if (var233 == 0) {
                        class624.method3592(-95);
                        class700.field9845 = false;
                    } else {
                        class261.method1576(var233, 32768);
                    }
                }
                class335.field4872.field9486 = var233;
                class335.field4872.method3442(class61.field978, 107);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field2628[--field2624];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class335.field4872.field9502 != var234) {
                    class335.field4872.field9502 = var234;
                    class335.field4872.method3442(class61.field978, 107);
                    class326.field4730 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2628[field2624++] = class335.field4872.field9501;
                return;
            }
            if (arg0 == 6102) {
                field2628[field2624++] = class335.field4872.method3431((byte) -123, class62.field996) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2628[field2624++] = class335.field4872.field9482 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2628[field2624++] = class335.field4872.field9480 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2628[field2624++] = class335.field4872.field9484 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2628[field2624++] = class335.field4872.field9503;
                return;
            }
            if (arg0 == 6108) {
                field2628[field2624++] = class335.field4872.field9467 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2628[field2624++] = class335.field4872.field9497 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2628[field2624++] = class335.field4872.field9506 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2628[field2624++] = class335.field4872.method3786(class62.field996, false);
                return;
            }
            if (arg0 == 6112) {
                field2628[field2624++] = class335.field4872.method3785(class62.field996, 3) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2628[field2624++] = class335.field4872.field9491 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2628[field2624++] = class335.field4872.field9487 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2628[field2624++] = class335.field4872.field9485;
                return;
            }
            if (arg0 == 6117) {
                field2628[field2624++] = class335.field4872.field9504 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2628[field2624++] = class335.field4872.field9495;
                return;
            }
            if (arg0 == 6119) {
                field2628[field2624++] = class335.field4872.field9471;
                return;
            }
            if (arg0 == 6120) {
                field2628[field2624++] = class335.field4872.field9507;
                return;
            }
            if (arg0 == 6121) {
                field2628[field2624++] = class332.field4821.method630() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2628[field2624++] = class308.method1924(-21558);
                return;
            }
            if (arg0 == 6124) {
                field2628[field2624++] = class335.field4872.field9478;
                return;
            }
            if (arg0 == 6125) {
                field2628[field2624++] = class335.field4872.field9481;
                return;
            }
            if (arg0 == 6126) {
                field2628[field2624++] = class332.field4821.method674() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2628[field2624++] = class335.field4872.field9473 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2628[field2624++] = class335.field4872.field9508 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2628[field2624++] = class335.field4872.field9503;
                return;
            }
            if (arg0 == 6130) {
                field2628[field2624++] = class335.field4872.field9475 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2628[field2624++] = class62.field996;
                return;
            }
            if (arg0 == 6132) {
                field2628[field2624++] = class335.field4872.field9483;
                return;
            }
            if (arg0 == 6133) {
                field2628[field2624++] = class61.field978.field3004 && !class61.field978.field2983 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2628[field2624++] = class236.method1450(class190.field2576, 83);
                return;
            }
            if (arg0 == 6135) {
                field2628[field2624++] = class335.field4872.field9476;
                return;
            }
            if (arg0 == 6136) {
                field2628[field2624++] = class335.field4872.field9465 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field2628[field2624++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2628[field2624++] = class388.method2394(true, 200, class62.field996);
                return;
            }
            if (arg0 == 6139) {
                field2628[field2624++] = class335.field4872.method3437(false, class62.field996);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class500.method2854((byte) 118, class62.field996) && class190.field2576 < 96) {
                    var236 = 1;
                }
                field2628[field2624++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class190.field2576 < 96) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field2628[field2624++] = class335.field4872.field9479;
                return;
            }
            if (arg0 == 6143) {
                field2628[field2624++] = class335.field4872.field9486;
                return;
            }
            if (arg0 == 6144) {
                field2628[field2624++] = class480.field6866 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2628[field2624++] = class335.field4872.field9502;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2624 -= 2;
                class562.field8221 = (short) field2628[field2624];
                if (class562.field8221 <= 0) {
                    class562.field8221 = 256;
                }
                class495.field7011 = (short) field2628[field2624 + 1];
                if (class495.field7011 <= 0) {
                    class495.field7011 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2624 -= 2;
                class97.field1484 = (short) field2628[field2624];
                if (class97.field1484 <= 0) {
                    class97.field1484 = 256;
                }
                class73.field1153 = (short) field2628[field2624 + 1];
                if (class73.field1153 <= 0) {
                    class73.field1153 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2624 -= 4;
                class209.field2841 = (short) field2628[field2624];
                if (class209.field2841 <= 0) {
                    class209.field2841 = 1;
                }
                class235.field3096 = (short) field2628[field2624 + 1];
                if (class235.field3096 <= 0) {
                    class235.field3096 = 32767;
                } else if (class235.field3096 < class209.field2841) {
                    class235.field3096 = class209.field2841;
                }
                class49.field768 = (short) field2628[field2624 + 2];
                if (class49.field768 <= 0) {
                    class49.field768 = 1;
                }
                class592.field8595 = (short) field2628[field2624 + 3];
                if (class592.field8595 <= 0) {
                    class592.field8595 = 32767;
                    return;
                }
                if (class592.field8595 < class49.field768) {
                    class592.field8595 = class49.field768;
                }
                return;
            }
            if (arg0 == 6203) {
                class208.method1330(0, false, class94.field1453.field76, class94.field1453.field202, 0, false);
                field2628[field2624++] = class122.field1816;
                field2628[field2624++] = class85.field1331;
                return;
            }
            if (arg0 == 6204) {
                field2628[field2624++] = class97.field1484;
                field2628[field2624++] = class73.field1153;
                return;
            }
            if (arg0 == 6205) {
                field2628[field2624++] = class562.field8221;
                field2628[field2624++] = class495.field7011;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2628[field2624++] = (int) (class60.method371(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2628[field2624++] = (int) (class60.method371(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2624 -= 3;
                int var237 = field2628[field2624];
                int var238 = field2628[field2624 + 1];
                int var239 = field2628[field2624 + 2];
                field2625.clear();
                field2625.set(11, 12);
                field2625.set(var239, var238, var237);
                int var240 = (int) (field2625.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field2628[field2624++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field2625.clear();
                field2625.setTime(new Date(class60.method371(false)));
                field2628[field2624++] = field2625.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field2628[--field2624];
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
                field2628[field2624++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2628[field2624++] = class502.method2864(false) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2628[field2624++] = class378.method2333(3) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class264.field3451 == 7 && class641.field9191 == 0 && class175.field2458 == 0) {
                    if (class483.field6897) {
                        field2628[field2624++] = 0;
                        return;
                    }
                    if (class5.field112 > class60.method371(false) - 1000L) {
                        field2628[field2624++] = 1;
                        return;
                    }
                    class483.field6897 = true;
                    class654 var243 = class631.method3628(class697.field9814, (byte) -51, class357.field5280);
                    var243.field9358.method3146(class525.field7458, 72);
                    class444.method2623(123, var243);
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class116 var244 = class112.method845(false);
                if (var244 != null) {
                    field2628[field2624++] = var244.field1736;
                    field2628[field2624++] = var244.field5368;
                    field2614[field2612++] = var244.field1735;
                    class259 var245 = var244.method861(-1);
                    field2628[field2624++] = var245.field3353;
                    field2614[field2612++] = var245.field3357;
                    field2628[field2624++] = var244.field5362;
                    field2628[field2624++] = var244.field1734;
                    field2614[field2612++] = var244.field1742;
                    return;
                }
                field2628[field2624++] = -1;
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                return;
            }
            if (arg0 == 6502) {
                class116 var246 = class597.method3401((byte) -36);
                if (var246 != null) {
                    field2628[field2624++] = var246.field1736;
                    field2628[field2624++] = var246.field5368;
                    field2614[field2612++] = var246.field1735;
                    class259 var247 = var246.method861(-1);
                    field2628[field2624++] = var247.field3353;
                    field2614[field2612++] = var247.field3357;
                    field2628[field2624++] = var246.field5362;
                    field2628[field2624++] = var246.field1734;
                    field2614[field2612++] = var246.field1742;
                    return;
                }
                field2628[field2624++] = -1;
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field2628[--field2624];
                String var249 = field2614[--field2612];
                if (class264.field3451 == 7 && class641.field9191 == 0 && class175.field2458 == 0) {
                    field2628[field2624++] = class127.method910(var249, -108, var248) ? 1 : 0;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class335.field4872.field9498 = field2628[--field2624];
                class335.field4872.method3442(class61.field978, 114);
                return;
            }
            if (arg0 == 6505) {
                field2628[field2624++] = class335.field4872.field9498;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field2628[--field2624];
                class116 var251 = class378.method2334(-1, var250);
                if (var251 != null) {
                    field2628[field2624++] = var251.field5368;
                    field2614[field2612++] = var251.field1735;
                    class259 var252 = var251.method861(-1);
                    field2628[field2624++] = var252.field3353;
                    field2614[field2612++] = var252.field3357;
                    field2628[field2624++] = var251.field5362;
                    field2628[field2624++] = var251.field1734;
                    field2614[field2612++] = var251.field1742;
                    return;
                }
                field2628[field2624++] = -1;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                field2628[field2624++] = 0;
                field2628[field2624++] = 0;
                field2614[field2612++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2624 -= 4;
                int var253 = field2628[field2624];
                boolean var254 = field2628[field2624 + 1] == 1;
                int var255 = field2628[field2624 + 2];
                boolean var256 = field2628[field2624 + 3] == 1;
                class9.method68(var255, var254, var256, 0, var253);
                return;
            }
            if (arg0 == 6508) {
                class200.method1301(false);
                return;
            }
            if (arg0 == 6509) {
                if (class264.field3451 != 7) {
                    return;
                }
                class577.field8378 = field2628[--field2624] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2628[field2624++] = class605.field8743;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class335.field4872.field9499 = field2628[--field2624] == 1;
                class335.field4872.method3442(class61.field978, 109);
                return;
            }
            if (arg0 == 6601) {
                field2628[field2624++] = class335.field4872.field9499 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class476.field6820 == class452.field6515) {
            if (arg0 == 6700) {
                int var257 = class318.field4623.method1996((byte) -124);
                if (class567.field8270 != -1) {
                    var257++;
                }
                field2628[field2624++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field2628[--field2624];
                if (class567.field8270 != -1) {
                    if (var258 == 0) {
                        field2628[field2624++] = class567.field8270;
                        return;
                    }
                    var258--;
                }
                class200 var259 = (class200) class318.field4623.method1993(-122);
                while (var258-- > 0) {
                    var259 = (class200) class318.field4623.method1997(9831);
                }
                field2628[field2624++] = var259.field2716;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field2628[--field2624];
                if (class220.field2917[var260] == null) {
                    field2614[field2612++] = "";
                    return;
                }
                String var261 = class220.field2917[var260][0].field78;
                if (var261 == null) {
                    field2614[field2612++] = "";
                    return;
                }
                field2614[field2612++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field2628[--field2624];
                if (class220.field2917[var262] == null) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = class220.field2917[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field2624 -= 2;
                int var263 = field2628[field2624];
                int var264 = field2628[field2624 + 1];
                if (class220.field2917[var263] == null) {
                    field2614[field2612++] = "";
                    return;
                }
                String var265 = class220.field2917[var263][var264].field78;
                if (var265 == null) {
                    field2614[field2612++] = "";
                    return;
                }
                field2614[field2612++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field2624 -= 2;
                int var266 = field2628[field2624];
                int var267 = field2628[field2624 + 1];
                if (class220.field2917[var266] == null) {
                    field2628[field2624++] = 0;
                    return;
                }
                field2628[field2624++] = class220.field2917[var266][var267].field116;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2624 -= 3;
                int var268 = field2628[field2624];
                int var269 = field2628[field2624 + 1];
                int var270 = field2628[field2624 + 2];
                class485.method2771(var268 << 16 | var269, "", 1, 114, var270);
                return;
            }
            if (arg0 == 6708) {
                field2624 -= 3;
                int var271 = field2628[field2624];
                int var272 = field2628[field2624 + 1];
                int var273 = field2628[field2624 + 2];
                class485.method2771(var271 << 16 | var272, "", 2, 122, var273);
                return;
            }
            if (arg0 == 6709) {
                field2624 -= 3;
                int var274 = field2628[field2624];
                int var275 = field2628[field2624 + 1];
                int var276 = field2628[field2624 + 2];
                class485.method2771(var274 << 16 | var275, "", 3, 96, var276);
                return;
            }
            if (arg0 == 6710) {
                field2624 -= 3;
                int var277 = field2628[field2624];
                int var278 = field2628[field2624 + 1];
                int var279 = field2628[field2624 + 2];
                class485.method2771(var277 << 16 | var278, "", 4, 83, var279);
                return;
            }
            if (arg0 == 6711) {
                field2624 -= 3;
                int var280 = field2628[field2624];
                int var281 = field2628[field2624 + 1];
                int var282 = field2628[field2624 + 2];
                class485.method2771(var280 << 16 | var281, "", 5, 86, var282);
                return;
            }
            if (arg0 == 6712) {
                field2624 -= 3;
                int var283 = field2628[field2624];
                int var284 = field2628[field2624 + 1];
                int var285 = field2628[field2624 + 2];
                class485.method2771(var283 << 16 | var284, "", 6, 105, var285);
                return;
            }
            if (arg0 == 6713) {
                field2624 -= 3;
                int var286 = field2628[field2624];
                int var287 = field2628[field2624 + 1];
                int var288 = field2628[field2624 + 2];
                class485.method2771(var286 << 16 | var287, "", 7, 74, var288);
                return;
            }
            if (arg0 == 6714) {
                field2624 -= 3;
                int var289 = field2628[field2624];
                int var290 = field2628[field2624 + 1];
                int var291 = field2628[field2624 + 2];
                class485.method2771(var289 << 16 | var290, "", 8, 73, var291);
                return;
            }
            if (arg0 == 6715) {
                field2624 -= 3;
                int var292 = field2628[field2624];
                int var293 = field2628[field2624 + 1];
                int var294 = field2628[field2624 + 2];
                class485.method2771(var292 << 16 | var293, "", 9, 69, var294);
                return;
            }
            if (arg0 == 6716) {
                field2624 -= 3;
                int var295 = field2628[field2624];
                int var296 = field2628[field2624 + 1];
                int var297 = field2628[field2624 + 2];
                class485.method2771(var295 << 16 | var296, "", 10, 95, var297);
                return;
            }
            if (arg0 == 6717) {
                field2624 -= 3;
                int var298 = field2628[field2624];
                int var299 = field2628[field2624 + 1];
                int var300 = field2628[field2624 + 2];
                class5 var301 = class194.method1261(var298 << 16 | var299, var300, 6);
                class541.method3183(1);
                class78 var302 = client.method564(var301);
                class446.method2638(6, var302.method452(16711680), var301, var302.field1272);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field2628[--field2624];
                class168 var304 = class189.field2572.method2757(var303, (byte) -46);
                if (var304.field2372 == null) {
                    field2614[field2612++] = "";
                    return;
                }
                field2614[field2612++] = var304.field2372;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field2628[--field2624];
                class168 var306 = class189.field2572.method2757(var305, (byte) -46);
                field2628[field2624++] = var306.field2379;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field2628[--field2624];
                class168 var308 = class189.field2572.method2757(var307, (byte) -46);
                field2628[field2624++] = var308.field2370;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field2628[--field2624];
                class168 var310 = class189.field2572.method2757(var309, (byte) -46);
                field2628[field2624++] = var310.field2380;
                return;
            }
            if (arg0 == 6804) {
                field2624 -= 2;
                int var311 = field2628[field2624];
                int var312 = field2628[field2624 + 1];
                class278 var313 = class141.field2041.method1503(true, var312);
                if (var313.method1651((byte) 76)) {
                    field2614[field2612++] = class189.field2572.method2757(var311, (byte) -46).method1172(-116, var312, var313.field3617);
                    return;
                }
                field2628[field2624++] = class189.field2572.method2757(var311, (byte) -46).method1174(var313.field3615, (byte) -85, var312);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field2628[field2624++] = class379.field5684 && !class621.field8993 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field2628[field2624++] = class180.field2493;
                return;
            }
            if (arg0 == 6902) {
                field2628[field2624++] = class173.field2444;
                return;
            }
            if (arg0 == 6903) {
                field2628[field2624++] = class167.field2331;
                return;
            }
            if (arg0 == 6904) {
                field2628[field2624++] = class220.field2927;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class665.field9442 != null) {
                    if (class665.field9442.field3307 == null) {
                        var314 = class351.method2169(6711, class665.field9442.field3308);
                    } else {
                        var314 = (String) class665.field9442.field3307;
                    }
                }
                field2614[field2612++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field2628[field2624++] = class300.field4452;
                return;
            }
            if (arg0 == 6907) {
                field2628[field2624++] = class580.field8449;
                return;
            }
            if (arg0 == 6908) {
                field2628[field2624++] = class697.field9816;
                return;
            }
            if (arg0 == 6909) {
                field2628[field2624++] = class100.field1518 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field2628[field2624++] = class238.field3132;
                return;
            }
            if (arg0 == 6911) {
                field2628[field2624++] = class160.field2277;
                return;
            }
            if (arg0 == 6912) {
                field2628[field2624++] = class169.field2398;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class335.field4872.method3434(1);
                field2628[field2624++] = class335.field4872.field8713 = class62.field996;
                field2628[field2624++] = var315;
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 123);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7001) {
                class335.field4872.method3441((byte) 94);
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 116);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7002) {
                class335.field4872.method3426((byte) 72);
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 114);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7003) {
                class335.field4872.method3425(127);
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 117);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7004) {
                class335.field4872.method3433(19771, true);
                class654.method3700(-1681322014);
                class335.field4872.method3442(class61.field978, 113);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7005) {
                class335.field4872.field9466 = 0;
                class335.field4872.method3442(class61.field978, 120);
                class326.field4730 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class335.field4872.field8713 == 2) {
                    class335.field4872.field8709 = true;
                    return;
                }
                if (class335.field4872.field8713 == 1) {
                    class335.field4872.field8717 = true;
                    return;
                }
                if (class335.field4872.field8713 == 3) {
                    class335.field4872.field8711 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field2628[field2624++] = class335.field4872.field9466;
                return;
            }
            if (arg0 == 7008) {
                if (class62.field996 == 0 && class190.field2576 < 96) {
                    field2628[field2624++] = 1;
                    return;
                }
                field2628[field2624++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lmea;II)V")
    public static final void method1263(class355 arg0, int arg1, int arg2) {
        class653 var3 = class370.method2287(true, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field2611 = new int[var3.field9347];
        field2623 = new String[var3.field9341];
        if (class657.field9383 == var3.field9340 || class236.field3110 == var3.field9340 || class103.field1538 == var3.field9340) {
            int var4 = 0;
            int var5 = 0;
            if (class574.field8343 != null) {
                var4 = class574.field8343.field80;
                var5 = class574.field8343.field150;
            }
            field2611[0] = class315.field4612.method2340(40960) - var4;
            field2611[1] = class315.field4612.method2338((byte) 80) - var5;
        }
        method1268(var3, 200000);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
    public static final void method1264() {
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IZ)V")
    public static final void method1265(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    private static final void method1266(int arg0) {
        class5 var1 = class705.method3944(arg0, (byte) 123);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class5[] var3 = class379.field5710[var2];
        if (var3 == null) {
            class5[] var4 = class220.field2917[var2];
            int var5 = var4.length;
            var3 = class379.field5710[var2] = new class5[var5];
            class667.method3744(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class667.method3744(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IZ)V")
    private static final void method1267(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2624 -= 3;
                int var2 = field2628[field2624];
                int var3 = field2628[field2624 + 1];
                int var4 = field2628[field2624 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class5 var5 = class705.method3944(var2, (byte) 108);
                if (var5.field109 == null) {
                    var5.field109 = new class5[var4 + 1];
                }
                if (var5.field109.length <= var4) {
                    class5[] var6 = new class5[var4 + 1];
                    for (int var7 = 0; var7 < var5.field109.length; var7++) {
                        var6[var7] = var5.field109[var7];
                    }
                    var5.field109 = var6;
                }
                if (var4 > 0 && var5.field109[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class5 var8 = new class5();
                var8.field172 = var3;
                var8.field87 = var8.field65 = var5.field65;
                var8.field53 = var4;
                var5.field109[var4] = var8;
                if (arg1) {
                    field2620 = var8;
                } else {
                    field2610 = var8;
                }
                class284.method1679(var5, -49);
                return;
            }
            if (arg0 == 101) {
                class5 var9 = arg1 ? field2620 : field2610;
                if (var9.field53 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class5 var10 = class705.method3944(var9.field65, (byte) 119);
                var10.field109[var9.field53] = null;
                class284.method1679(var10, -56);
                return;
            }
            if (arg0 == 102) {
                class5 var11 = class705.method3944(field2628[--field2624], (byte) 105);
                var11.field109 = null;
                class284.method1679(var11, -75);
                return;
            }
            if (arg0 == 200) {
                field2624 -= 2;
                int var12 = field2628[field2624];
                int var13 = field2628[field2624 + 1];
                class5 var14 = class194.method1261(var12, var13, 6);
                if (var14 != null && var13 != -1) {
                    field2628[field2624++] = 1;
                    if (arg1) {
                        field2620 = var14;
                        return;
                    }
                    field2610 = var14;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2628[--field2624];
                class5 var16 = class705.method3944(var15, (byte) 109);
                if (var16 != null) {
                    field2628[field2624++] = 1;
                    if (arg1) {
                        field2620 = var16;
                        return;
                    }
                    field2610 = var16;
                    return;
                }
                field2628[field2624++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2628[--field2624];
                method1274(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2628[--field2624];
                method1266(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2624 -= 2;
                int var19 = field2628[field2624];
                int var20 = field2628[field2624 + 1];
                for (int var21 = 0; var21 < class267.field3478.length; var21++) {
                    if (class267.field3478[var21] == var19) {
                        class321.field4681.field1105.method1481(var21, -19579, var20, class177.field2477);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class183.field2514.length; var22++) {
                    if (class183.field2514[var22] == var19) {
                        class321.field4681.field1105.method1481(var22, -19579, var20, class177.field2477);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2624 -= 2;
                int var23 = field2628[field2624];
                int var24 = field2628[field2624 + 1];
                class321.field4681.field1105.method1485(false, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2628[--field2624] != 0;
                class321.field4681.field1105.method1483(var25, 126);
                return;
            }
            if (arg0 == 411) {
                field2624 -= 2;
                int var26 = field2628[field2624];
                int var27 = field2628[field2624 + 1];
                class321.field4681.field1105.method1484(var26, (byte) 78, class259.field3355, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class5 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class705.method3944(field2628[--field2624], (byte) 108);
            } else {
                var28 = arg1 ? field2620 : field2610;
            }
            if (arg0 == 1000) {
                field2624 -= 4;
                var28.field84 = field2628[field2624];
                var28.field122 = field2628[field2624 + 1];
                int var29 = field2628[field2624 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2628[field2624 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field148 = (byte) var29;
                var28.field170 = (byte) var30;
                class284.method1679(var28, -55);
                class518.method2931(-65, var28);
                if (var28.field53 == -1) {
                    class496.method2831(true, var28.field65);
                }
                return;
            }
            if (arg0 == 1001) {
                field2624 -= 4;
                var28.field178 = field2628[field2624];
                var28.field158 = field2628[field2624 + 1];
                var28.field141 = 0;
                var28.field169 = 0;
                int var31 = field2628[field2624 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2628[field2624 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field126 = (byte) var31;
                var28.field161 = (byte) var32;
                class284.method1679(var28, -49);
                class518.method2931(-16, var28);
                if (var28.field172 == 0) {
                    class319.method1976(false, (byte) 79, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2628[--field2624] == 1;
                if (var28.field173 != var33) {
                    var28.field173 = var33;
                    class284.method1679(var28, -94);
                }
                if (var28.field53 == -1) {
                    class369.method2283(7, var28.field65);
                }
                return;
            }
            if (arg0 == 1004) {
                field2624 -= 2;
                var28.field58 = field2628[field2624];
                var28.field64 = field2628[field2624 + 1];
                class284.method1679(var28, -47);
                class518.method2931(-57, var28);
                if (var28.field172 == 0) {
                    class319.method1976(false, (byte) 79, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field91 = field2628[--field2624] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class5 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class705.method3944(field2628[--field2624], (byte) 127);
            } else {
                var34 = arg1 ? field2620 : field2610;
            }
            if (arg0 == 1100) {
                field2624 -= 2;
                var34.field74 = field2628[field2624];
                if (var34.field74 > var34.field152 - var34.field202) {
                    var34.field74 = var34.field152 - var34.field202;
                }
                if (var34.field74 < 0) {
                    var34.field74 = 0;
                }
                var34.field196 = field2628[field2624 + 1];
                if (var34.field196 > var34.field120 - var34.field76) {
                    var34.field196 = var34.field120 - var34.field76;
                }
                if (var34.field196 < 0) {
                    var34.field196 = 0;
                }
                class284.method1679(var34, -93);
                if (var34.field53 == -1) {
                    class164.method1157(true, var34.field65);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field147 = field2628[--field2624];
                class284.method1679(var34, -89);
                if (var34.field53 == -1) {
                    class458.method2678((byte) 1, var34.field65);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field203 = field2628[--field2624] == 1;
                class284.method1679(var34, -95);
                return;
            }
            if (arg0 == 1103) {
                var34.field182 = field2628[--field2624];
                class284.method1679(var34, -18);
                return;
            }
            if (arg0 == 1104) {
                var34.field42 = field2628[--field2624];
                class284.method1679(var34, -123);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2628[--field2624];
                if (var34.field132 != var35) {
                    var34.field132 = var35;
                    class284.method1679(var34, -105);
                }
                if (var34.field53 == -1) {
                    class647.method3682(-6830, var34.field65);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field45 = field2628[--field2624];
                class284.method1679(var34, -122);
                return;
            }
            if (arg0 == 1107) {
                var34.field82 = field2628[--field2624] == 1;
                class284.method1679(var34, -73);
                return;
            }
            if (arg0 == 1108) {
                var34.field142 = 1;
                var34.field105 = field2628[--field2624];
                class284.method1679(var34, -87);
                if (var34.field53 == -1) {
                    class415.method2529(114, var34.field65);
                }
                return;
            }
            if (arg0 == 1109) {
                field2624 -= 6;
                var34.field49 = field2628[field2624];
                var34.field125 = field2628[field2624 + 1];
                var34.field164 = field2628[field2624 + 2];
                var34.field54 = field2628[field2624 + 3];
                var34.field137 = field2628[field2624 + 4];
                var34.field138 = field2628[field2624 + 5];
                class284.method1679(var34, -17);
                if (var34.field53 == -1) {
                    class77.method448(var34.field65, 8);
                    class19.method134(10, var34.field65);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2628[--field2624];
                if (var34.field51 != var36) {
                    var34.field51 = var36;
                    var34.field56 = 0;
                    var34.field115 = 1;
                    var34.field69 = 0;
                    class47 var37 = var34.field51 == -1 ? null : class203.field2769.method2971(-85, var34.field51);
                    if (var37 != null) {
                        class196.method1283(var37, 7, var34.field56);
                    }
                    class284.method1679(var34, -50);
                }
                if (var34.field53 == -1) {
                    class641.method3652((byte) -126, var34.field65);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field183 = field2628[--field2624] == 1;
                class284.method1679(var34, -8);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2614[--field2612];
                if (!var38.equals(var34.field162)) {
                    var34.field162 = var38;
                    class284.method1679(var34, -11);
                }
                if (var34.field53 == -1) {
                    class345.method2142(var34.field65, (byte) 111);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field157 = field2628[--field2624];
                class284.method1679(var34, -37);
                if (var34.field53 == -1) {
                    class501.method2860(62, var34.field65);
                }
                return;
            }
            if (arg0 == 1114) {
                field2624 -= 3;
                var34.field131 = field2628[field2624];
                var34.field168 = field2628[field2624 + 1];
                var34.field61 = field2628[field2624 + 2];
                class284.method1679(var34, -22);
                return;
            }
            if (arg0 == 1115) {
                var34.field189 = field2628[--field2624] == 1;
                class284.method1679(var34, -63);
                return;
            }
            if (arg0 == 1116) {
                var34.field93 = field2628[--field2624];
                class284.method1679(var34, -124);
                return;
            }
            if (arg0 == 1117) {
                var34.field171 = field2628[--field2624];
                class284.method1679(var34, -122);
                return;
            }
            if (arg0 == 1118) {
                var34.field139 = field2628[--field2624] == 1;
                class284.method1679(var34, -118);
                return;
            }
            if (arg0 == 1119) {
                var34.field167 = field2628[--field2624] == 1;
                class284.method1679(var34, -19);
                return;
            }
            if (arg0 == 1120) {
                field2624 -= 2;
                var34.field152 = field2628[field2624];
                var34.field120 = field2628[field2624 + 1];
                class284.method1679(var34, -119);
                if (var34.field172 == 0) {
                    class319.method1976(false, (byte) 79, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field195 = field2628[--field2624] == 1;
                class284.method1679(var34, -113);
                return;
            }
            if (arg0 == 1123) {
                var34.field138 = field2628[--field2624];
                class284.method1679(var34, -117);
                if (var34.field53 == -1) {
                    class77.method448(var34.field65, 8);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2628[--field2624];
                var34.field146 = var39 == 1;
                class284.method1679(var34, -58);
                return;
            }
            if (arg0 == 1125) {
                field2624 -= 2;
                var34.field130 = field2628[field2624];
                var34.field38 = field2628[field2624 + 1];
                class284.method1679(var34, -33);
                return;
            }
            if (arg0 == 1126) {
                var34.field77 = field2628[--field2624];
                class284.method1679(var34, -46);
                return;
            }
            if (arg0 == 1127) {
                field2624 -= 2;
                int var40 = field2628[field2624];
                int var41 = field2628[field2624 + 1];
                class278 var42 = class141.field2041.method1503(true, var40);
                if (var42.field3615 != var41) {
                    var34.method32(var40, -65536, var41);
                    return;
                }
                var34.method27(-56, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2628[--field2624];
                String var44 = field2614[--field2612];
                class278 var45 = class141.field2041.method1503(true, var43);
                if (!var45.field3617.equals(var44)) {
                    var34.method33(var44, var43, 6049);
                    return;
                }
                var34.method27(108, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class5 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class705.method3944(field2628[--field2624], (byte) 116);
            } else {
                var46 = arg1 ? field2620 : field2610;
            }
            class284.method1679(var46, -107);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2624 -= 2;
                int var47 = field2628[field2624];
                int var48 = field2628[field2624 + 1];
                if (var46.field53 == -1) {
                    class175.method1199(var46.field65, (byte) 118);
                    class77.method448(var46.field65, 8);
                    class19.method134(10, var46.field65);
                }
                if (var47 == -1) {
                    var46.field142 = 1;
                    var46.field105 = -1;
                    var46.field59 = -1;
                    return;
                }
                var46.field59 = var47;
                var46.field108 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field86 = true;
                } else {
                    var46.field86 = false;
                }
                class390 var49 = class259.field3355.method2382(var47, (byte) 28);
                var46.field164 = var49.field5898;
                var46.field54 = var49.field5877;
                var46.field137 = var49.field5829;
                var46.field49 = var49.field5891;
                var46.field125 = var49.field5905;
                var46.field138 = var49.field5828;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field75 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field75 = 1;
                } else {
                    var46.field75 = 2;
                }
                if (var46.field141 > 0) {
                    var46.field138 = var46.field138 * 32 / var46.field141;
                    return;
                }
                if (var46.field178 > 0) {
                    var46.field138 = var46.field138 * 32 / var46.field178;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field142 = 2;
                var46.field105 = field2628[--field2624];
                if (var46.field53 == -1) {
                    class415.method2529(-88, var46.field65);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field142 = 3;
                var46.field105 = -1;
                if (var46.field53 == -1) {
                    class415.method2529(-70, var46.field65);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field142 = 6;
                var46.field105 = field2628[--field2624];
                if (var46.field53 == -1) {
                    class415.method2529(-127, var46.field65);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field142 = 5;
                var46.field105 = field2628[--field2624];
                if (var46.field53 == -1) {
                    class415.method2529(81, var46.field65);
                }
                return;
            }
            if (arg0 == 1206) {
                field2624 -= 4;
                var46.field37 = field2628[field2624];
                var46.field143 = field2628[field2624 + 1];
                var46.field100 = field2628[field2624 + 2];
                var46.field145 = field2628[field2624 + 3];
                class284.method1679(var46, -59);
                return;
            }
            if (arg0 == 1207) {
                field2624 -= 2;
                var46.field62 = field2628[field2624];
                var46.field136 = field2628[field2624 + 1];
                class284.method1679(var46, -104);
                return;
            }
            if (arg0 == 1210) {
                field2624 -= 4;
                var46.field105 = field2628[field2624];
                var46.field185 = field2628[field2624 + 1];
                if (field2628[field2624 + 2] == 1) {
                    var46.field142 = 9;
                } else {
                    var46.field142 = 8;
                }
                if (field2628[field2624 + 3] == 1) {
                    var46.field86 = true;
                } else {
                    var46.field86 = false;
                }
                if (var46.field53 == -1) {
                    class415.method2529(106, var46.field65);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field142 = 5;
                var46.field105 = class478.field6850;
                var46.field185 = 0;
                if (var46.field53 == -1) {
                    class415.method2529(-81, var46.field65);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class5 var61;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var61 = class705.method3944(field2628[--field2624], (byte) 103);
                } else {
                    var61 = arg1 ? field2620 : field2610;
                }
                if (arg0 == 1499) {
                    var61.method16(-1);
                    return;
                }
                String var62 = field2614[--field2612];
                int[] var63 = null;
                if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                    int var64 = field2628[--field2624];
                    if (var64 > 0) {
                        var63 = new int[var64];
                        while (var64-- > 0) {
                            var63[var64] = field2628[--field2624];
                        }
                    }
                    var62 = var62.substring(0, var62.length() - 1);
                }
                Object[] var65 = new Object[var62.length() + 1];
                for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                    if (var62.charAt(var66 - 1) == 's') {
                        var65[var66] = field2614[--field2612];
                    } else {
                        var65[var66] = Integer.valueOf(field2628[--field2624]);
                    }
                }
                int var67 = field2628[--field2624];
                if (var67 == -1) {
                    var65 = null;
                } else {
                    var65[0] = Integer.valueOf(var67);
                }
                if (arg0 == 1400) {
                    var61.field67 = var65;
                } else if (arg0 == 1401) {
                    var61.field113 = var65;
                } else if (arg0 == 1402) {
                    var61.field121 = var65;
                } else if (arg0 == 1403) {
                    var61.field123 = var65;
                } else if (arg0 == 1404) {
                    var61.field66 = var65;
                } else if (arg0 == 1405) {
                    var61.field159 = var65;
                } else if (arg0 == 1406) {
                    var61.field46 = var65;
                } else if (arg0 == 1407) {
                    var61.field160 = var65;
                    var61.field114 = var63;
                } else if (arg0 == 1408) {
                    var61.field118 = var65;
                } else if (arg0 == 1409) {
                    var61.field70 = var65;
                } else if (arg0 == 1410) {
                    var61.field55 = var65;
                } else if (arg0 == 1411) {
                    var61.field95 = var65;
                } else if (arg0 == 1412) {
                    var61.field184 = var65;
                } else if (arg0 == 1414) {
                    var61.field205 = var65;
                    var61.field149 = var63;
                } else if (arg0 == 1415) {
                    var61.field129 = var65;
                    var61.field83 = var63;
                } else if (arg0 == 1416) {
                    var61.field106 = var65;
                } else if (arg0 == 1417) {
                    var61.field135 = var65;
                } else if (arg0 == 1418) {
                    var61.field52 = var65;
                } else if (arg0 == 1419) {
                    var61.field179 = var65;
                } else if (arg0 == 1420) {
                    var61.field194 = var65;
                } else if (arg0 == 1421) {
                    var61.field166 = var65;
                } else if (arg0 == 1422) {
                    var61.field199 = var65;
                } else if (arg0 == 1423) {
                    var61.field39 = var65;
                } else if (arg0 == 1424) {
                    var61.field73 = var65;
                } else if (arg0 == 1425) {
                    var61.field101 = var65;
                } else if (arg0 == 1426) {
                    var61.field99 = var65;
                } else if (arg0 == 1427) {
                    var61.field97 = var65;
                } else if (arg0 == 1428) {
                    var61.field68 = var65;
                    var61.field198 = var63;
                } else if (arg0 == 1429) {
                    var61.field85 = var65;
                    var61.field206 = var63;
                } else if (arg0 == 1430) {
                    var61.field193 = var65;
                }
                var61.field71 = true;
                return;
            }
            if (arg0 < 1600) {
                class5 var68 = arg1 ? field2620 : field2610;
                if (arg0 == 1500) {
                    field2628[field2624++] = var68.field80;
                    return;
                }
                if (arg0 == 1501) {
                    field2628[field2624++] = var68.field150;
                    return;
                }
                if (arg0 == 1502) {
                    field2628[field2624++] = var68.field202;
                    return;
                }
                if (arg0 == 1503) {
                    field2628[field2624++] = var68.field76;
                    return;
                }
                if (arg0 == 1504) {
                    field2628[field2624++] = var68.field173 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2628[field2624++] = var68.field87;
                    return;
                }
                if (arg0 == 1506) {
                    class5 var69 = class622.method3587(var68, -1087028336);
                    field2628[field2624++] = var69 == null ? -1 : var69.field65;
                    return;
                }
            } else if (arg0 < 1700) {
                class5 var70 = arg1 ? field2620 : field2610;
                if (arg0 == 1600) {
                    field2628[field2624++] = var70.field74;
                    return;
                }
                if (arg0 == 1601) {
                    field2628[field2624++] = var70.field196;
                    return;
                }
                if (arg0 == 1602) {
                    field2614[field2612++] = var70.field162;
                    return;
                }
                if (arg0 == 1603) {
                    field2628[field2624++] = var70.field152;
                    return;
                }
                if (arg0 == 1604) {
                    field2628[field2624++] = var70.field120;
                    return;
                }
                if (arg0 == 1605) {
                    field2628[field2624++] = var70.field138;
                    return;
                }
                if (arg0 == 1606) {
                    field2628[field2624++] = var70.field164;
                    return;
                }
                if (arg0 == 1607) {
                    field2628[field2624++] = var70.field137;
                    return;
                }
                if (arg0 == 1608) {
                    field2628[field2624++] = var70.field54;
                    return;
                }
                if (arg0 == 1609) {
                    field2628[field2624++] = var70.field182;
                    return;
                }
                if (arg0 == 1610) {
                    field2628[field2624++] = var70.field49;
                    return;
                }
                if (arg0 == 1611) {
                    field2628[field2624++] = var70.field125;
                    return;
                }
                if (arg0 == 1612) {
                    field2628[field2624++] = var70.field132;
                    return;
                }
                if (arg0 == 1613) {
                    int var71 = field2628[--field2624];
                    class278 var72 = class141.field2041.method1503(true, var71);
                    if (var72.method1651((byte) 76)) {
                        field2614[field2612++] = var70.method19(var71, -16201, var72.field3617);
                        return;
                    }
                    field2628[field2624++] = var70.method28(var71, -77, var72.field3615);
                    return;
                }
                if (arg0 == 1614) {
                    field2628[field2624++] = var70.field45;
                    return;
                }
                if (arg0 == 2614) {
                    field2628[field2624++] = var70.field142 == 1 ? var70.field105 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class5 var73 = arg1 ? field2620 : field2610;
                if (arg0 == 1700) {
                    field2628[field2624++] = var73.field59;
                    return;
                }
                if (arg0 == 1701) {
                    if (var73.field59 != -1) {
                        field2628[field2624++] = var73.field108;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2628[field2624++] = var73.field53;
                    return;
                }
            } else if (arg0 < 1900) {
                class5 var74 = arg1 ? field2620 : field2610;
                if (arg0 == 1800) {
                    field2628[field2624++] = client.method564(var74).method452(16711680);
                    return;
                }
                if (arg0 == 1801) {
                    int var75 = field2628[--field2624];
                    int var356 = var75 - 1;
                    if (var74.field102 != null && var356 < var74.field102.length && var74.field102[var356] != null) {
                        field2614[field2612++] = var74.field102[var356];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var74.field119 == null) {
                        field2614[field2612++] = "";
                        return;
                    }
                    field2614[field2612++] = var74.field119;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class5 var354;
                if (arg0 >= 2000) {
                    var354 = class705.method3944(field2628[--field2624], (byte) 105);
                    arg0 -= 1000;
                } else {
                    var354 = arg1 ? field2620 : field2610;
                }
                if (field2637 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var354.field97 == null) {
                        return;
                    }
                    class303 var355 = new class303();
                    var355.field4499 = var354;
                    var355.field4500 = var354.field97;
                    var355.field4496 = field2637 + 1;
                    class625.field9038.method1909(var355, (byte) -81);
                    return;
                }
            } else if (arg0 < 2600) {
                class5 var76 = class705.method3944(field2628[--field2624], (byte) 106);
                if (arg0 == 2500) {
                    field2628[field2624++] = var76.field80;
                    return;
                }
                if (arg0 == 2501) {
                    field2628[field2624++] = var76.field150;
                    return;
                }
                if (arg0 == 2502) {
                    field2628[field2624++] = var76.field202;
                    return;
                }
                if (arg0 == 2503) {
                    field2628[field2624++] = var76.field76;
                    return;
                }
                if (arg0 == 2504) {
                    field2628[field2624++] = var76.field173 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2628[field2624++] = var76.field87;
                    return;
                }
                if (arg0 == 1506) {
                    class5 var77 = class622.method3587(var76, -1087028336);
                    field2628[field2624++] = var77 == null ? -1 : var77.field65;
                    return;
                }
            } else if (arg0 < 2700) {
                class5 var78 = class705.method3944(field2628[--field2624], (byte) 107);
                if (arg0 == 2600) {
                    field2628[field2624++] = var78.field74;
                    return;
                }
                if (arg0 == 2601) {
                    field2628[field2624++] = var78.field196;
                    return;
                }
                if (arg0 == 2602) {
                    field2614[field2612++] = var78.field162;
                    return;
                }
                if (arg0 == 2603) {
                    field2628[field2624++] = var78.field152;
                    return;
                }
                if (arg0 == 2604) {
                    field2628[field2624++] = var78.field120;
                    return;
                }
                if (arg0 == 2605) {
                    field2628[field2624++] = var78.field138;
                    return;
                }
                if (arg0 == 2606) {
                    field2628[field2624++] = var78.field164;
                    return;
                }
                if (arg0 == 2607) {
                    field2628[field2624++] = var78.field137;
                    return;
                }
                if (arg0 == 2608) {
                    field2628[field2624++] = var78.field54;
                    return;
                }
                if (arg0 == 2609) {
                    field2628[field2624++] = var78.field182;
                    return;
                }
                if (arg0 == 2610) {
                    field2628[field2624++] = var78.field49;
                    return;
                }
                if (arg0 == 2611) {
                    field2628[field2624++] = var78.field125;
                    return;
                }
                if (arg0 == 2612) {
                    field2628[field2624++] = var78.field132;
                    return;
                }
                if (arg0 == 2613) {
                    field2628[field2624++] = var78.field45;
                    return;
                }
                if (arg0 == 2614) {
                    field2628[field2624++] = var78.field142 == 1 ? var78.field105 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class5 var79 = class705.method3944(field2628[--field2624], (byte) 121);
                    field2628[field2624++] = var79.field59;
                    return;
                }
                if (arg0 == 2701) {
                    class5 var80 = class705.method3944(field2628[--field2624], (byte) 116);
                    if (var80.field59 != -1) {
                        field2628[field2624++] = var80.field108;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var81 = field2628[--field2624];
                    class200 var82 = (class200) class318.field4623.method2002((byte) -122, (long) var81);
                    if (var82 != null) {
                        field2628[field2624++] = 1;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class5 var83 = class705.method3944(field2628[--field2624], (byte) 107);
                    if (var83.field109 == null) {
                        field2628[field2624++] = 0;
                        return;
                    }
                    int var84 = var83.field109.length;
                    for (int var85 = 0; var85 < var83.field109.length; var85++) {
                        if (var83.field109[var85] == null) {
                            var84 = var85;
                            break;
                        }
                    }
                    field2628[field2624++] = var84;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2624 -= 2;
                    int var86 = field2628[field2624];
                    int var87 = field2628[field2624 + 1];
                    class200 var88 = (class200) class318.field4623.method2002((byte) -106, (long) var86);
                    if (var88 != null && var88.field2716 == var87) {
                        field2628[field2624++] = 1;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class5 var89 = class705.method3944(field2628[--field2624], (byte) 102);
                if (arg0 == 2800) {
                    field2628[field2624++] = client.method564(var89).method452(16711680);
                    return;
                }
                if (arg0 == 2801) {
                    int var90 = field2628[--field2624];
                    int var357 = var90 - 1;
                    if (var89.field102 != null && var357 < var89.field102.length && var89.field102[var357] != null) {
                        field2614[field2612++] = var89.field102[var357];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var89.field119 == null) {
                        field2614[field2612++] = "";
                        return;
                    }
                    field2614[field2612++] = var89.field119;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var91 = field2614[--field2612];
                    class268.method1604((byte) 101, var91);
                    return;
                }
                if (arg0 == 3101) {
                    field2624 -= 2;
                    class406.method2498(class321.field4681, field2628[field2624], field2628[field2624 + 1], -7831);
                    return;
                }
                if (arg0 == 3103) {
                    class205.method1321(true, (byte) -44);
                    return;
                }
                if (arg0 == 3104) {
                    String var92 = field2614[--field2612];
                    int var93 = 0;
                    if (class86.method488((byte) 114, var92)) {
                        var93 = class87.method496(var92, (byte) -84);
                    }
                    field2619++;
                    class654 var94 = class631.method3628(class561.field8215, (byte) -51, class357.field5280);
                    var94.field9358.method3146(var93, -88);
                    class444.method2623(119, var94);
                    return;
                }
                if (arg0 == 3105) {
                    String var95 = field2614[--field2612];
                    field2617++;
                    class654 var96 = class631.method3628(class640.field9184, (byte) -51, class357.field5280);
                    var96.field9358.method3110(var95.length() + 1, 125);
                    var96.field9358.method3132(var95, 3);
                    class444.method2623(119, var96);
                    return;
                }
                if (arg0 == 3106) {
                    String var97 = field2614[--field2612];
                    field2615++;
                    class654 var98 = class631.method3628(class162.field2286, (byte) -51, class357.field5280);
                    var98.field9358.method3110(var97.length() + 1, 52);
                    var98.field9358.method3132(var97, 3);
                    class444.method2623(119, var98);
                    return;
                }
                if (arg0 == 3107) {
                    int var99 = field2628[--field2624];
                    String var100 = field2614[--field2612];
                    class311.method1942(var100, var99, -7);
                    return;
                }
                if (arg0 == 3108) {
                    field2624 -= 3;
                    int var101 = field2628[field2624];
                    int var102 = field2628[field2624 + 1];
                    int var103 = field2628[field2624 + 2];
                    class5 var104 = class705.method3944(var103, (byte) 102);
                    class529.method3070(var104, var101, 50, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field2624 -= 2;
                    int var105 = field2628[field2624];
                    int var106 = field2628[field2624 + 1];
                    class5 var107 = arg1 ? field2620 : field2610;
                    class529.method3070(var107, var105, 36, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var108 = field2628[--field2624];
                    field2618++;
                    class654 var109 = class631.method3628(class283.field3784, (byte) -51, class357.field5280);
                    var109.field9358.method3162(-2003712696, var108);
                    class444.method2623(122, var109);
                    return;
                }
                if (arg0 == 3111) {
                    field2624 -= 2;
                    int var110 = field2628[field2624];
                    int var111 = field2628[field2624 + 1];
                    class200 var112 = (class200) class318.field4623.method2002((byte) -120, (long) var110);
                    if (var112 != null) {
                        class522.method2950(-3223, true, var112, var112.field2716 != var111);
                    }
                    class460.method2681(-1, var110, true, 3, var111);
                    return;
                }
                if (arg0 == 3112) {
                    field2624--;
                    int var113 = field2628[field2624];
                    class200 var114 = (class200) class318.field4623.method2002((byte) -113, (long) var113);
                    if (var114 != null && var114.field2721 == 3) {
                        class522.method2950(-3223, true, var114, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class675.method3788((byte) 9, field2614[--field2612]);
                    return;
                }
                if (arg0 == 3114) {
                    field2624 -= 2;
                    int var115 = field2628[field2624];
                    int var116 = field2628[field2624 + 1];
                    String var117 = field2614[--field2612];
                    class46.method275("", var115, var117, "", 255, "", var116);
                    return;
                }
                if (arg0 == 3115) {
                    field2624 -= 11;
                    class545[] var118 = class9.method64((byte) -118);
                    class305[] var119 = class62.method384(true);
                    class293.method1805(field2628[field2624 + 6], field2628[field2624 + 9], var119[field2628[field2624 + 1]], field2628[field2624 + 8], field2628[field2624 + 3], field2628[field2624 + 10], var118[field2628[field2624]], field2628[field2624 + 2], (byte) 122, field2628[field2624 + 4], field2628[field2624 + 7], field2628[field2624 + 5]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2624 -= 3;
                    class612.method3486(255, field2628[field2624], 256, (byte) -111, field2628[field2624 + 2], field2628[field2624 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class164.method1159((byte) -120, 255, 50, field2628[--field2624]);
                    return;
                }
                if (arg0 == 3202) {
                    field2624 -= 2;
                    class223.method1394(field2628[field2624 + 1], 112, 255, field2628[field2624]);
                    return;
                }
                if (arg0 == 3203) {
                    field2624 -= 4;
                    class612.method3486(field2628[field2624 + 3], field2628[field2624], 256, (byte) -126, field2628[field2624 + 2], field2628[field2624 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field2624 -= 3;
                    class164.method1159((byte) -120, field2628[field2624 + 1], field2628[field2624 + 2], field2628[field2624]);
                    return;
                }
                if (arg0 == 3205) {
                    field2624 -= 3;
                    class223.method1394(field2628[field2624 + 1], 92, field2628[field2624 + 2], field2628[field2624]);
                    return;
                }
                if (arg0 == 3206) {
                    field2624 -= 4;
                    class176.method1201(false, field2628[field2624 + 1], -122, field2628[field2624 + 2], 256, field2628[field2624], field2628[field2624 + 3]);
                    return;
                }
                if (arg0 == 3207) {
                    field2624 -= 4;
                    class176.method1201(true, field2628[field2624 + 1], -126, field2628[field2624 + 2], 256, field2628[field2624], field2628[field2624 + 3]);
                    return;
                }
                if (arg0 == 3208) {
                    field2624 -= 5;
                    class612.method3486(field2628[field2624 + 3], field2628[field2624], field2628[field2624 + 4], (byte) -114, field2628[field2624 + 2], field2628[field2624 + 1]);
                    return;
                }
                if (arg0 == 3209) {
                    field2624 -= 5;
                    class176.method1201(false, field2628[field2624 + 1], -123, field2628[field2624 + 2], field2628[field2624 + 4], field2628[field2624], field2628[field2624 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2628[field2624++] = class45.field685;
                    return;
                }
                if (arg0 == 3301) {
                    field2624 -= 2;
                    int var120 = field2628[field2624];
                    int var121 = field2628[field2624 + 1];
                    field2628[field2624++] = class158.method1133(var120, 23608, false, var121);
                    return;
                }
                if (arg0 == 3302) {
                    field2624 -= 2;
                    int var122 = field2628[field2624];
                    int var123 = field2628[field2624 + 1];
                    field2628[field2624++] = class369.method2281((byte) 122, var122, false, var123);
                    return;
                }
                if (arg0 == 3303) {
                    field2624 -= 2;
                    int var124 = field2628[field2624];
                    int var125 = field2628[field2624 + 1];
                    field2628[field2624++] = class202.method1308(var125, 0, var124, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var126 = field2628[--field2624];
                    field2628[field2624++] = class613.field8826.method3087(25, var126).field5470;
                    return;
                }
                if (arg0 == 3305) {
                    int var127 = field2628[--field2624];
                    field2628[field2624++] = class457.field6606[var127];
                    return;
                }
                if (arg0 == 3306) {
                    int var128 = field2628[--field2624];
                    field2628[field2624++] = class478.field6838[var128];
                    return;
                }
                if (arg0 == 3307) {
                    int var129 = field2628[--field2624];
                    field2628[field2624++] = class573.field8320[var129];
                    return;
                }
                if (arg0 == 3308) {
                    byte var130 = class321.field4681.field7905;
                    int var131 = (class321.field4681.field7895 >> 9) + class397.field6005;
                    int var132 = (class321.field4681.field7896 >> 9) + class403.field6049;
                    field2628[field2624++] = (var130 << 28) + (var131 << 14) + var132;
                    return;
                }
                if (arg0 == 3309) {
                    int var133 = field2628[--field2624];
                    field2628[field2624++] = var133 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var134 = field2628[--field2624];
                    field2628[field2624++] = var134 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var135 = field2628[--field2624];
                    field2628[field2624++] = var135 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2628[field2624++] = class232.field3066 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2624 -= 2;
                    int var136 = field2628[field2624];
                    int var137 = field2628[field2624 + 1];
                    field2628[field2624++] = class158.method1133(var136, 23608, true, var137);
                    return;
                }
                if (arg0 == 3314) {
                    field2624 -= 2;
                    int var138 = field2628[field2624];
                    int var139 = field2628[field2624 + 1];
                    field2628[field2624++] = class369.method2281((byte) 122, var138, true, var139);
                    return;
                }
                if (arg0 == 3315) {
                    field2624 -= 2;
                    int var140 = field2628[field2624];
                    int var141 = field2628[field2624 + 1];
                    field2628[field2624++] = class202.method1308(var141, 0, var140, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class248.field3272 >= 2) {
                        field2628[field2624++] = class248.field3272;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2628[field2624++] = class149.field2111;
                    return;
                }
                if (arg0 == 3318) {
                    field2628[field2624++] = class684.field9654.field1522;
                    return;
                }
                if (arg0 == 3321) {
                    field2628[field2624++] = class346.field5110;
                    return;
                }
                if (arg0 == 3322) {
                    field2628[field2624++] = class215.field2881;
                    return;
                }
                if (arg0 == 3323) {
                    if (class344.field5085 >= 5 && class344.field5085 <= 9) {
                        field2628[field2624++] = 1;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class344.field5085 >= 5 && class344.field5085 <= 9) {
                        field2628[field2624++] = class344.field5085;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2628[field2624++] = class221.field2937 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2628[field2624++] = class321.field4681.field1123;
                    return;
                }
                if (arg0 == 3327) {
                    field2628[field2624++] = class321.field4681.field1105.field3207 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2628[field2624++] = class398.field6008 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var142 = field2628[--field2624];
                    field2628[field2624++] = class621.method3578(false, (byte) 106, var142);
                    return;
                }
                if (arg0 == 3331) {
                    field2624 -= 2;
                    int var143 = field2628[field2624];
                    int var144 = field2628[field2624 + 1];
                    field2628[field2624++] = class377.method2332(var144, var143, false, false, -100);
                    return;
                }
                if (arg0 == 3332) {
                    field2624 -= 2;
                    int var145 = field2628[field2624];
                    int var146 = field2628[field2624 + 1];
                    field2628[field2624++] = class377.method2332(var146, var145, false, true, -97);
                    return;
                }
                if (arg0 == 3333) {
                    field2628[field2624++] = class642.field9203;
                    return;
                }
                if (arg0 == 3335) {
                    field2628[field2624++] = class262.field3401;
                    return;
                }
                if (arg0 == 3336) {
                    field2624 -= 4;
                    int var147 = field2628[field2624];
                    int var148 = field2628[field2624 + 1];
                    int var149 = field2628[field2624 + 2];
                    int var150 = field2628[field2624 + 3];
                    int var151 = (var148 << 14) + var147;
                    int var152 = (var149 << 28) + var151;
                    int var153 = var150 + var152;
                    field2628[field2624++] = var153;
                    return;
                }
                if (arg0 == 3337) {
                    field2628[field2624++] = class122.field1815;
                    return;
                }
                if (arg0 == 3338) {
                    field2628[field2624++] = class658.method3711((byte) -100);
                    return;
                }
                if (arg0 == 3339) {
                    field2628[field2624++] = class413.field6123 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field2628[field2624++] = class696.field9809 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field2628[field2624++] = class59.field960 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field2628[field2624++] = class315.field4612.method2340(40960);
                    return;
                }
                if (arg0 == 3343) {
                    field2628[field2624++] = class315.field4612.method2338((byte) 84);
                    return;
                }
                if (arg0 == 3344) {
                    field2614[field2612++] = class393.method2445((byte) 7);
                    return;
                }
                if (arg0 == 3345) {
                    field2614[field2612++] = class506.method2879(false);
                    return;
                }
                if (arg0 == 3346) {
                    field2628[field2624++] = class211.method1338(5);
                    return;
                }
                if (arg0 == 3347) {
                    field2628[field2624++] = class235.field3093;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2624 -= 2;
                    int var154 = field2628[field2624];
                    int var155 = field2628[field2624 + 1];
                    class237 var156 = class553.field8131.method1797(var154, -14715);
                    field2614[field2612++] = var156.method1461(-119, var155);
                    return;
                }
                if (arg0 == 3408) {
                    field2624 -= 4;
                    int var157 = field2628[field2624];
                    int var158 = field2628[field2624 + 1];
                    int var159 = field2628[field2624 + 2];
                    int var160 = field2628[field2624 + 3];
                    class237 var161 = class553.field8131.method1797(var159, -14715);
                    if (var161.field3113 == var157 && var161.field3119 == var158) {
                        if (var158 == 115) {
                            field2614[field2612++] = var161.method1461(119, var160);
                            return;
                        }
                        field2628[field2624++] = var161.method1466(-29714, var160);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field2624 -= 3;
                    int var162 = field2628[field2624];
                    int var163 = field2628[field2624 + 1];
                    int var164 = field2628[field2624 + 2];
                    if (var163 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class237 var165 = class553.field8131.method1797(var163, -14715);
                    if (var165.field3119 != var162) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2628[field2624++] = var165.method1456((byte) -128, var164) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var166 = field2628[--field2624];
                    String var167 = field2614[--field2612];
                    if (var166 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class237 var168 = class553.field8131.method1797(var166, -14715);
                    if (var168.field3119 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2628[field2624++] = var168.method1460(-1577601832, var167) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var169 = field2628[--field2624];
                    class237 var170 = class553.field8131.method1797(var169, -14715);
                    field2628[field2624++] = var170.field3124.method1996((byte) -84);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class372.field5507 == 0) {
                        field2628[field2624++] = -2;
                        return;
                    }
                    if (class372.field5507 == 1) {
                        field2628[field2624++] = -1;
                        return;
                    }
                    field2628[field2624++] = class356.field5266;
                    return;
                }
                if (arg0 == 3601) {
                    int var171 = field2628[--field2624];
                    if (class372.field5507 == 2 && var171 < class356.field5266) {
                        field2614[field2612++] = class205.field2796[var171];
                        if (class645.field9294[var171] != null) {
                            field2614[field2612++] = class645.field9294[var171];
                            return;
                        }
                        field2614[field2612++] = "";
                        return;
                    }
                    field2614[field2612++] = "";
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var172 = field2628[--field2624];
                    if (class372.field5507 == 2 && var172 < class356.field5266) {
                        field2628[field2624++] = class484.field6902[var172];
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var173 = field2628[--field2624];
                    if (class372.field5507 == 2 && var173 < class356.field5266) {
                        field2628[field2624++] = class571.field8299[var173];
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var174 = field2614[--field2612];
                    int var175 = field2628[--field2624];
                    class448.method2644(17399, var174, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var176 = field2614[--field2612];
                    class620.method3572((byte) -95, var176);
                    return;
                }
                if (arg0 == 3606) {
                    String var177 = field2614[--field2612];
                    class48.method287(var177, 87);
                    return;
                }
                if (arg0 == 3607) {
                    String var178 = field2614[--field2612];
                    class600.method3413(var178, false, (byte) -10);
                    return;
                }
                if (arg0 == 3608) {
                    String var179 = field2614[--field2612];
                    class200.method1298(var179, 1);
                    return;
                }
                if (arg0 == 3609) {
                    String var180 = field2614[--field2612];
                    if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                        var180 = var180.substring(7);
                    }
                    field2628[field2624++] = class451.method2653(var180, -30963) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var181 = field2628[--field2624];
                    if (class372.field5507 == 2 && var181 < class356.field5266) {
                        field2614[field2612++] = class273.field3566[var181];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class642.field9202 != null) {
                        field2614[field2612++] = class538.method3103(7, class642.field9202);
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class642.field9202 != null) {
                        field2628[field2624++] = class587.field8520;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var182 = field2628[--field2624];
                    if (class642.field9202 != null && var182 < class587.field8520) {
                        field2614[field2612++] = class451.field6509[var182].field280;
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var183 = field2628[--field2624];
                    if (class642.field9202 != null && var183 < class587.field8520) {
                        field2628[field2624++] = class451.field6509[var183].field271;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var184 = field2628[--field2624];
                    if (class642.field9202 != null && var184 < class587.field8520) {
                        field2628[field2624++] = class451.field6509[var184].field279;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2628[field2624++] = class281.field3746;
                    return;
                }
                if (arg0 == 3617) {
                    String var185 = field2614[--field2612];
                    class280.method1658(var185, 76);
                    return;
                }
                if (arg0 == 3618) {
                    field2628[field2624++] = class74.field1158;
                    return;
                }
                if (arg0 == 3619) {
                    String var186 = field2614[--field2612];
                    class219.method1377(true, var186);
                    return;
                }
                if (arg0 == 3620) {
                    class1.method5((byte) -68);
                    return;
                }
                if (arg0 == 3621) {
                    if (class372.field5507 == 0) {
                        field2628[field2624++] = -1;
                        return;
                    }
                    field2628[field2624++] = class564.field8248;
                    return;
                }
                if (arg0 == 3622) {
                    int var187 = field2628[--field2624];
                    if (class372.field5507 != 0 && var187 < class564.field8248) {
                        field2614[field2612++] = class115.field1722[var187];
                        if (class203.field2774[var187] != null) {
                            field2614[field2612++] = class203.field2774[var187];
                            return;
                        }
                        field2614[field2612++] = "";
                        return;
                    }
                    field2614[field2612++] = "";
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var188 = field2614[--field2612];
                    if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                        var188 = var188.substring(7);
                    }
                    field2628[field2624++] = class35.method209(var188, 110) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var189 = field2628[--field2624];
                    if (class451.field6509 != null && var189 < class587.field8520 && class451.field6509[var189].field275.equalsIgnoreCase(class321.field4681.field1094)) {
                        field2628[field2624++] = 1;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class205.field2805 != null) {
                        field2614[field2612++] = class205.field2805;
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var190 = field2628[--field2624];
                    if (class642.field9202 != null && var190 < class587.field8520) {
                        field2614[field2612++] = class451.field6509[var190].field274;
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var191 = field2628[--field2624];
                    if (class372.field5507 == 2 && var191 >= 0 && var191 < class356.field5266) {
                        field2628[field2624++] = class238.field3133[var191] ? 1 : 0;
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var192 = field2614[--field2612];
                    if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                        var192 = var192.substring(7);
                    }
                    field2628[field2624++] = class338.method2093(127, var192);
                    return;
                }
                if (arg0 == 3629) {
                    field2628[field2624++] = class661.field9414;
                    return;
                }
                if (arg0 == 3630) {
                    String var193 = field2614[--field2612];
                    class600.method3413(var193, true, (byte) -10);
                    return;
                }
                if (arg0 == 3631) {
                    int var194 = field2628[--field2624];
                    field2628[field2624++] = class185.field2520[var194] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var195 = field2628[--field2624];
                    if (class642.field9202 != null && var195 < class587.field8520) {
                        field2614[field2612++] = class451.field6509[var195].field275;
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var196 = field2628[--field2624];
                    if (class372.field5507 != 0 && var196 < class564.field8248) {
                        field2614[field2612++] = class268.field3501[var196];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var197 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var197].method10((byte) -72);
                    return;
                }
                if (arg0 == 3904) {
                    int var198 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var198].field26;
                    return;
                }
                if (arg0 == 3905) {
                    int var199 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var199].field22;
                    return;
                }
                if (arg0 == 3906) {
                    int var200 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var200].field31;
                    return;
                }
                if (arg0 == 3907) {
                    int var201 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var201].field29;
                    return;
                }
                if (arg0 == 3908) {
                    int var202 = field2628[--field2624];
                    field2628[field2624++] = class362.field5314[var202].field28;
                    return;
                }
                if (arg0 == 3910) {
                    int var203 = field2628[--field2624];
                    int var204 = class362.field5314[var203].method9(114);
                    field2628[field2624++] = var204 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var205 = field2628[--field2624];
                    int var206 = class362.field5314[var205].method9(108);
                    field2628[field2624++] = var206 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var207 = field2628[--field2624];
                    int var208 = class362.field5314[var207].method9(124);
                    field2628[field2624++] = var208 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var209 = field2628[--field2624];
                    int var210 = class362.field5314[var209].method9(106);
                    field2628[field2624++] = var210 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2624 -= 2;
                    int var211 = field2628[field2624];
                    int var212 = field2628[field2624 + 1];
                    field2628[field2624++] = var211 + var212;
                    return;
                }
                if (arg0 == 4001) {
                    field2624 -= 2;
                    int var213 = field2628[field2624];
                    int var214 = field2628[field2624 + 1];
                    field2628[field2624++] = var213 - var214;
                    return;
                }
                if (arg0 == 4002) {
                    field2624 -= 2;
                    int var215 = field2628[field2624];
                    int var216 = field2628[field2624 + 1];
                    field2628[field2624++] = var215 * var216;
                    return;
                }
                if (arg0 == 4003) {
                    field2624 -= 2;
                    int var217 = field2628[field2624];
                    int var218 = field2628[field2624 + 1];
                    field2628[field2624++] = var217 / var218;
                    return;
                }
                if (arg0 == 4004) {
                    int var219 = field2628[--field2624];
                    field2628[field2624++] = (int) (Math.random() * (double) var219);
                    return;
                }
                if (arg0 == 4005) {
                    int var220 = field2628[--field2624];
                    field2628[field2624++] = (int) (Math.random() * (double) (var220 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2624 -= 5;
                    int var221 = field2628[field2624];
                    int var222 = field2628[field2624 + 1];
                    int var223 = field2628[field2624 + 2];
                    int var224 = field2628[field2624 + 3];
                    int var225 = field2628[field2624 + 4];
                    field2628[field2624++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                    return;
                }
                if (arg0 == 4007) {
                    field2624 -= 2;
                    long var226 = (long) field2628[field2624];
                    long var228 = (long) field2628[field2624 + 1];
                    field2628[field2624++] = (int) (var226 * var228 / 100L + var226);
                    return;
                }
                if (arg0 == 4008) {
                    field2624 -= 2;
                    int var230 = field2628[field2624];
                    int var231 = field2628[field2624 + 1];
                    field2628[field2624++] = var230 | 0x1 << var231;
                    return;
                }
                if (arg0 == 4009) {
                    field2624 -= 2;
                    int var232 = field2628[field2624];
                    int var233 = field2628[field2624 + 1];
                    field2628[field2624++] = var232 & -(0x1 << var233) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2624 -= 2;
                    int var234 = field2628[field2624];
                    int var235 = field2628[field2624 + 1];
                    field2628[field2624++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2624 -= 2;
                    int var236 = field2628[field2624];
                    int var237 = field2628[field2624 + 1];
                    field2628[field2624++] = var236 % var237;
                    return;
                }
                if (arg0 == 4012) {
                    field2624 -= 2;
                    int var238 = field2628[field2624];
                    int var239 = field2628[field2624 + 1];
                    if (var238 == 0) {
                        field2628[field2624++] = 0;
                        return;
                    }
                    field2628[field2624++] = (int) Math.pow((double) var238, (double) var239);
                    return;
                }
                if (arg0 == 4013) {
                    field2624 -= 2;
                    int var240 = field2628[field2624];
                    int var241 = field2628[field2624 + 1];
                    if (var240 == 0) {
                        field2628[field2624++] = 0;
                        return;
                    }
                    if (var241 == 0) {
                        field2628[field2624++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2628[field2624++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                    return;
                }
                if (arg0 == 4014) {
                    field2624 -= 2;
                    int var242 = field2628[field2624];
                    int var243 = field2628[field2624 + 1];
                    field2628[field2624++] = var242 & var243;
                    return;
                }
                if (arg0 == 4015) {
                    field2624 -= 2;
                    int var244 = field2628[field2624];
                    int var245 = field2628[field2624 + 1];
                    field2628[field2624++] = var244 | var245;
                    return;
                }
                if (arg0 == 4016) {
                    field2624 -= 2;
                    int var246 = field2628[field2624];
                    int var247 = field2628[field2624 + 1];
                    field2628[field2624++] = var246 < var247 ? var246 : var247;
                    return;
                }
                if (arg0 == 4017) {
                    field2624 -= 2;
                    int var248 = field2628[field2624];
                    int var249 = field2628[field2624 + 1];
                    field2628[field2624++] = var248 > var249 ? var248 : var249;
                    return;
                }
                if (arg0 == 4018) {
                    field2624 -= 3;
                    long var250 = (long) field2628[field2624];
                    long var252 = (long) field2628[field2624 + 1];
                    long var254 = (long) field2628[field2624 + 2];
                    field2628[field2624++] = (int) (var250 * var254 / var252);
                    return;
                }
                if (arg0 == 4019) {
                    field2624 -= 2;
                    int var256 = field2628[field2624];
                    int var257 = field2628[field2624 + 1];
                    if (var256 > 700 || var257 > 700) {
                        field2628[field2624++] = 256;
                    }
                    double var258 = (Math.random() * (double) (var256 + var257) + 800.0D - (double) var256) / 100.0D;
                    field2628[field2624++] = (int) (Math.pow(2.0D, var258) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var260 = field2614[--field2612];
                    int var261 = field2628[--field2624];
                    field2614[field2612++] = var260 + var261;
                    return;
                }
                if (arg0 == 4101) {
                    field2612 -= 2;
                    String var262 = field2614[field2612];
                    String var263 = field2614[field2612 + 1];
                    field2614[field2612++] = var262 + var263;
                    return;
                }
                if (arg0 == 4102) {
                    String var264 = field2614[--field2612];
                    int var265 = field2628[--field2624];
                    field2614[field2612++] = var264 + class606.method3462(true, (byte) -120, var265);
                    return;
                }
                if (arg0 == 4103) {
                    String var266 = field2614[--field2612];
                    field2614[field2612++] = var266.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2614[field2612++] = method1275(field2628[--field2624]);
                    return;
                }
                if (arg0 == 4105) {
                    field2612 -= 2;
                    String var267 = field2614[field2612];
                    String var268 = field2614[field2612 + 1];
                    if (class321.field4681.field1105 != null && class321.field4681.field1105.field3207) {
                        field2614[field2612++] = var268;
                        return;
                    }
                    field2614[field2612++] = var267;
                    return;
                }
                if (arg0 == 4106) {
                    int var269 = field2628[--field2624];
                    field2614[field2612++] = Integer.toString(var269);
                    return;
                }
                if (arg0 == 4107) {
                    field2612 -= 2;
                    field2628[field2624++] = class453.method2660(5992, field2614[field2612 + 1], field2614[field2612], class262.field3401);
                    return;
                }
                if (arg0 == 4108) {
                    String var270 = field2614[--field2612];
                    field2624 -= 2;
                    int var271 = field2628[field2624];
                    int var272 = field2628[field2624 + 1];
                    class606 var273 = class62.method385(0, false, var272, class283.field3785);
                    field2628[field2624++] = var273.method3461(var271, (byte) -126, class97.field1481, var270);
                    return;
                }
                if (arg0 == 4109) {
                    String var274 = field2614[--field2612];
                    field2624 -= 2;
                    int var275 = field2628[field2624];
                    int var276 = field2628[field2624 + 1];
                    class606 var277 = class62.method385(0, false, var276, class283.field3785);
                    field2628[field2624++] = var277.method3460(class97.field1481, true, var275, var274);
                    return;
                }
                if (arg0 == 4110) {
                    field2612 -= 2;
                    String var278 = field2614[field2612];
                    String var279 = field2614[field2612 + 1];
                    if (field2628[--field2624] == 1) {
                        field2614[field2612++] = var278;
                        return;
                    }
                    field2614[field2612++] = var279;
                    return;
                }
                if (arg0 == 4111) {
                    String var280 = field2614[--field2612];
                    field2614[field2612++] = class289.method1787(var280, -49);
                    return;
                }
                if (arg0 == 4112) {
                    String var281 = field2614[--field2612];
                    int var282 = field2628[--field2624];
                    if (var282 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2614[field2612++] = var281 + (char) var282;
                    return;
                }
                if (arg0 == 4113) {
                    int var283 = field2628[--field2624];
                    field2628[field2624++] = class468.method2700(376, (char) var283) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var284 = field2628[--field2624];
                    field2628[field2624++] = class36.method212(-28476, (char) var284) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var285 = field2628[--field2624];
                    field2628[field2624++] = class552.method3218((char) var285, -91) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var286 = field2628[--field2624];
                    field2628[field2624++] = class258.method1545((char) var286, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var287 = field2614[--field2612];
                    if (var287 != null) {
                        field2628[field2624++] = var287.length();
                        return;
                    }
                    field2628[field2624++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var288 = field2614[--field2612];
                    field2624 -= 2;
                    int var289 = field2628[field2624];
                    int var290 = field2628[field2624 + 1];
                    field2614[field2612++] = var288.substring(var289, var290);
                    return;
                }
                if (arg0 == 4119) {
                    String var291 = field2614[--field2612];
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
                    field2614[field2612++] = var292.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var296 = field2614[--field2612];
                    field2624 -= 2;
                    int var297 = field2628[field2624];
                    int var298 = field2628[field2624 + 1];
                    field2628[field2624++] = var296.indexOf(var297, var298);
                    return;
                }
                if (arg0 == 4121) {
                    field2612 -= 2;
                    String var299 = field2614[field2612];
                    String var300 = field2614[field2612 + 1];
                    int var301 = field2628[--field2624];
                    field2628[field2624++] = var299.indexOf(var300, var301);
                    return;
                }
                if (arg0 == 4122) {
                    int var302 = field2628[--field2624];
                    field2628[field2624++] = Character.toLowerCase((char) var302);
                    return;
                }
                if (arg0 == 4123) {
                    int var303 = field2628[--field2624];
                    field2628[field2624++] = Character.toUpperCase((char) var303);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var304 = field2628[--field2624] != 0;
                    int var305 = field2628[--field2624];
                    field2614[field2612++] = class103.method736((long) var305, (byte) -55, 0, class262.field3401, var304);
                    return;
                }
                if (arg0 == 4125) {
                    String var306 = field2614[--field2612];
                    int var307 = field2628[--field2624];
                    class606 var308 = class62.method385(0, false, var307, class283.field3785);
                    field2628[field2624++] = var308.method3456(class97.field1481, var306, 60);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var309 = field2628[--field2624];
                    field2614[field2612++] = class259.field3355.method2382(var309, (byte) 28).field5869;
                    return;
                }
                if (arg0 == 4201) {
                    field2624 -= 2;
                    int var310 = field2628[field2624];
                    int var311 = field2628[field2624 + 1];
                    class390 var312 = class259.field3355.method2382(var310, (byte) 28);
                    if (var311 >= 1 && var311 <= 5 && var312.field5848[var311 - 1] != null) {
                        field2614[field2612++] = var312.field5848[var311 - 1];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2624 -= 2;
                    int var313 = field2628[field2624];
                    int var314 = field2628[field2624 + 1];
                    class390 var315 = class259.field3355.method2382(var313, (byte) 28);
                    if (var314 >= 1 && var314 <= 5 && var315.field5857[var314 - 1] != null) {
                        field2614[field2612++] = var315.field5857[var314 - 1];
                        return;
                    }
                    field2614[field2612++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var316 = field2628[--field2624];
                    field2628[field2624++] = class259.field3355.method2382(var316, (byte) 28).field5835;
                    return;
                }
                if (arg0 == 4204) {
                    int var317 = field2628[--field2624];
                    field2628[field2624++] = class259.field3355.method2382(var317, (byte) 28).field5866 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var318 = field2628[--field2624];
                    class390 var319 = class259.field3355.method2382(var318, (byte) 28);
                    if (var319.field5886 == -1 && var319.field5855 >= 0) {
                        field2628[field2624++] = var319.field5855;
                        return;
                    }
                    field2628[field2624++] = var318;
                    return;
                }
                if (arg0 == 4206) {
                    int var320 = field2628[--field2624];
                    class390 var321 = class259.field3355.method2382(var320, (byte) 28);
                    if (var321.field5886 >= 0 && var321.field5855 >= 0) {
                        field2628[field2624++] = var321.field5855;
                        return;
                    }
                    field2628[field2624++] = var320;
                    return;
                }
                if (arg0 == 4207) {
                    int var322 = field2628[--field2624];
                    field2628[field2624++] = class259.field3355.method2382(var322, (byte) 28).field5882 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2624 -= 2;
                    int var323 = field2628[field2624];
                    int var324 = field2628[field2624 + 1];
                    class278 var325 = class141.field2041.method1503(true, var324);
                    if (var325.method1651((byte) 76)) {
                        field2614[field2612++] = class259.field3355.method2382(var323, (byte) 28).method2419(true, var324, var325.field3617);
                        return;
                    }
                    field2628[field2624++] = class259.field3355.method2382(var323, (byte) 28).method2410(var325.field3615, -15881, var324);
                    return;
                }
                if (arg0 == 4209) {
                    field2624 -= 2;
                    int var326 = field2628[field2624];
                    int var327 = field2628[field2624 + 1] - 1;
                    class390 var328 = class259.field3355.method2382(var326, (byte) 28);
                    if (var328.field5892 == var327) {
                        field2628[field2624++] = var328.field5873;
                        return;
                    }
                    if (var328.field5901 == var327) {
                        field2628[field2624++] = var328.field5836;
                        return;
                    }
                    field2628[field2624++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var329 = field2614[--field2612];
                    int var330 = field2628[--field2624];
                    class239.method1474(123, var329, var330 == 1);
                    field2628[field2624++] = class547.field8067;
                    return;
                }
                if (arg0 == 4211) {
                    if (class274.field3591 != null && class245.field3239 < class547.field8067) {
                        field2628[field2624++] = class274.field3591[class245.field3239++] & 0xFFFF;
                        return;
                    }
                    field2628[field2624++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class245.field3239 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var331 = field2628[--field2624];
                    field2628[field2624++] = class259.field3355.method2382(var331, (byte) 28).field5893;
                    return;
                }
                if (arg0 == 4214) {
                    String var332 = field2614[--field2612];
                    field2624 -= 3;
                    int var333 = field2628[field2624];
                    int var334 = field2628[field2624 + 1];
                    int var335 = field2628[field2624 + 2];
                    class422.method2554(var333 == 1, var334, var335, var332, (byte) 111);
                    field2628[field2624++] = class547.field8067;
                    return;
                }
                if (arg0 == 4215) {
                    field2612 -= 2;
                    field2624 -= 2;
                    String var336 = field2614[field2612];
                    int var337 = field2628[field2624];
                    int var338 = field2628[field2624 + 1];
                    String var339 = field2614[field2612 + 1];
                    class545.method3194(var337 == 1, var339, var338, (byte) 99, var336);
                    field2628[field2624++] = class547.field8067;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2624 -= 2;
                    int var340 = field2628[field2624];
                    int var341 = field2628[field2624 + 1];
                    class278 var342 = class141.field2041.method1503(true, var341);
                    if (var342.method1651((byte) 76)) {
                        field2614[field2612++] = class563.field8235.method1089(var340, false).method447(var342.field3617, 106, var341);
                        return;
                    }
                    field2628[field2624++] = class563.field8235.method1089(var340, false).method445((byte) -114, var341, var342.field3615);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2624 -= 2;
                    int var343 = field2628[field2624];
                    int var344 = field2628[field2624 + 1];
                    class278 var345 = class141.field2041.method1503(true, var344);
                    if (var345.method1651((byte) 76)) {
                        field2614[field2612++] = class60.field965.method2596(0, var343).method1773(-10958, var344, var345.field3617);
                        return;
                    }
                    field2628[field2624++] = class60.field965.method2596(0, var343).method1783(var344, (byte) -98, var345.field3615);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2624 -= 2;
                    int var346 = field2628[field2624];
                    int var347 = field2628[field2624 + 1];
                    class278 var348 = class141.field2041.method1503(true, var347);
                    if (var348.method1651((byte) 76)) {
                        field2614[field2612++] = class503.field7119.method63((byte) 100, var346).method295(var347, var348.field3617, (byte) 116);
                        return;
                    }
                    field2628[field2624++] = class503.field7119.method63((byte) 100, var346).method297(var348.field3615, var347, false);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var349 = field2628[--field2624];
                class589 var350 = class547.field8070.method408(var349, false);
                if (var350.field8566 != null && var350.field8566.length > 0) {
                    int var351 = 0;
                    int var352 = var350.field8545[0];
                    for (int var353 = 1; var353 < var350.field8566.length; var353++) {
                        if (var350.field8545[var353] > var352) {
                            var351 = var353;
                            var352 = var350.field8545[var353];
                        }
                    }
                    field2628[field2624++] = var350.field8566[var351];
                    return;
                }
                field2628[field2624++] = var350.field8559;
                return;
            }
        } else {
            class5 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class705.method3944(field2628[--field2624], (byte) 102);
            } else {
                var50 = arg1 ? field2620 : field2610;
            }
            if (arg0 == 1300) {
                int var51 = field2628[--field2624] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method31(18887, field2614[--field2612], var51);
                    return;
                }
                field2612--;
                return;
            }
            if (arg0 == 1301) {
                field2624 -= 2;
                int var52 = field2628[field2624];
                int var53 = field2628[field2624 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field153 = null;
                    return;
                }
                var50.field153 = class194.method1261(var52, var53, 6);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field2628[--field2624];
                if (class108.field1618 != var54 && class423.field6211 != var54 && class232.field3075 != var54) {
                    return;
                }
                var50.field190 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field187 = field2628[--field2624];
                return;
            }
            if (arg0 == 1304) {
                var50.field107 = field2628[--field2624];
                return;
            }
            if (arg0 == 1305) {
                var50.field119 = field2614[--field2612];
                return;
            }
            if (arg0 == 1306) {
                var50.field44 = field2614[--field2612];
                return;
            }
            if (arg0 == 1307) {
                var50.field102 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field165 = field2628[--field2624];
                var50.field47 = field2628[--field2624];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field2628[--field2624];
                int var56 = field2628[--field2624];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method34(119, var55, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field35 = field2614[--field2612];
                return;
            }
            if (arg0 == 1311) {
                var50.field81 = field2628[--field2624];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field2624 -= 3;
                    var57 = field2628[field2624] - 1;
                    var58 = field2628[field2624 + 1];
                    var59 = field2628[field2624 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2624 -= 2;
                    var57 = 10;
                    var58 = field2628[field2624];
                    var59 = field2628[field2624 + 1];
                }
                if (var50.field72 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field72 = new byte[11];
                    var50.field98 = new byte[11];
                    var50.field94 = new int[11];
                }
                var50.field72[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field50 = false;
                    for (int var60 = 0; var60 < var50.field72.length; var60++) {
                        if (var50.field72[var60] != 0) {
                            var50.field50 = true;
                            break;
                        }
                    }
                } else {
                    var50.field50 = true;
                }
                var50.field98[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field197 = field2628[--field2624];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Llc;I)V")
    private static final void method1268(class653 arg0, int arg1) {
        field2624 = 0;
        field2612 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9344;
        int[] var4 = arg0.field9342;
        byte var5 = -1;
        field2627 = 0;
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
                        method1267(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1262(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2628[field2624++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2628[field2624++] = class308.field4545.field8636[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class308.field4545.method3399(var8, field2628[--field2624], (byte) 64);
                } else if (var43 == 3) {
                    field2614[field2612++] = arg0.field9343[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2624 -= 2;
                    if (field2628[field2624 + 1] != field2628[field2624]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2624 -= 2;
                    if (field2628[field2624 + 1] == field2628[field2624]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2624 -= 2;
                    if (field2628[field2624] < field2628[field2624 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2624 -= 2;
                    if (field2628[field2624] > field2628[field2624 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2627 == 0) {
                        return;
                    }
                    class327 var9 = field2631[--field2627];
                    arg0 = var9.field4738;
                    var3 = arg0.field9344;
                    var4 = arg0.field9342;
                    var2 = var9.field4739;
                    field2611 = var9.field4740;
                    field2623 = var9.field4741;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2628[field2624++] = class308.field4545.method2492(var10, (byte) 53);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class308.field4545.method3398(var11, field2628[--field2624], 0);
                } else if (var43 == 31) {
                    field2624 -= 2;
                    if (field2628[field2624] <= field2628[field2624 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2624 -= 2;
                    if (field2628[field2624] >= field2628[field2624 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2628[field2624++] = field2611[var4[var2]];
                } else if (var43 == 34) {
                    field2611[var4[var2]] = field2628[--field2624];
                } else if (var43 == 35) {
                    field2614[field2612++] = field2623[var4[var2]];
                } else if (var43 == 36) {
                    field2623[var4[var2]] = field2614[--field2612];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2612 -= var12;
                    String var13 = class61.method377(field2614, field2612, 4, var12);
                    field2614[field2612++] = var13;
                } else if (var43 == 38) {
                    field2624--;
                } else if (var43 == 39) {
                    field2612--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class653 var15 = class186.method1235(-109, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9347];
                    String[] var17 = new String[var15.field9341];
                    for (int var18 = 0; var18 < var15.field9338; var18++) {
                        var16[var18] = field2628[field2624 + var18 - var15.field9338];
                    }
                    for (int var19 = 0; var19 < var15.field9337; var19++) {
                        var17[var19] = field2614[field2612 + var19 - var15.field9337];
                    }
                    field2624 -= var15.field9338;
                    field2612 -= var15.field9337;
                    class327 var20 = new class327();
                    var20.field4738 = arg0;
                    var20.field4739 = var2;
                    var20.field4740 = field2611;
                    var20.field4741 = field2623;
                    if (field2627 >= field2631.length) {
                        throw new RuntimeException();
                    }
                    field2631[field2627++] = var20;
                    arg0 = var15;
                    var3 = var15.field9344;
                    var4 = var15.field9342;
                    var2 = -1;
                    field2611 = var16;
                    field2623 = var17;
                } else if (var43 == 42) {
                    field2628[field2624++] = class653.field9351[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class653.field9351[var21] = field2628[--field2624];
                    class173.method1195(var21, 1);
                    class347.field5135 |= class338.field4914[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2628[--field2624];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2626[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2629[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2628[--field2624];
                    if (var28 < 0 || var28 >= field2626[var27]) {
                        throw new RuntimeException();
                    }
                    field2628[field2624++] = field2629[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2624 -= 2;
                    int var30 = field2628[field2624];
                    if (var30 < 0 || var30 >= field2626[var29]) {
                        throw new RuntimeException();
                    }
                    field2629[var29][var30] = field2628[field2624 + 1];
                } else if (var43 == 47) {
                    String var31 = class298.field4380[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2614[field2612++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class298.field4380[var32] = field2614[--field2612];
                    class640.method3650(2, var32);
                } else if (var43 == 51) {
                    class322 var33 = arg0.field9345[var4[var2]];
                    class258 var34 = (class258) var33.method2002((byte) -115, (long) field2628[--field2624]);
                    if (var34 != null) {
                        var2 += var34.field3352;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field9350 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5740).append(" ");
                for (int var41 = field2627 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2631[var41].field4738.field5740).append(" ");
                }
                var40.append("op: ").append(var5);
                class118.method869(var42, (byte) -128, var40.toString());
            } else {
                class36.method213(0, 4, "Clientscript error in: " + arg0.field9350);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9350).append("\n");
                for (int var38 = field2627 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2631[var38].field4738.field9350).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class118.method869(var42, (byte) -128, var37.toString());
                class600.method3415(var37.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1269(String arg0, int arg1) {
        if (class248.field3272 == 0 && !(!class379.field5684 || class621.field8993) || class398.field6008) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class279.field3672.method1654(-72, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class279.field3672.method1654(123, 0).length());
        } else if (var2.startsWith(class279.field3673.method1654(-122, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class279.field3673.method1654(100, 0).length());
        } else if (var2.startsWith(class279.field3674.method1654(-89, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class279.field3674.method1654(127, 0).length());
        } else if (var2.startsWith(class279.field3675.method1654(103, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class279.field3675.method1654(-75, 0).length());
        } else if (var2.startsWith(class279.field3676.method1654(120, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class279.field3676.method1654(-58, 0).length());
        } else if (var2.startsWith(class279.field3677.method1654(-115, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class279.field3677.method1654(124, 0).length());
        } else if (var2.startsWith(class279.field3678.method1654(-110, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class279.field3678.method1654(-45, 0).length());
        } else if (var2.startsWith(class279.field3679.method1654(121, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class279.field3679.method1654(-87, 0).length());
        } else if (var2.startsWith(class279.field3680.method1654(110, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class279.field3680.method1654(125, 0).length());
        } else if (var2.startsWith(class279.field3681.method1654(100, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class279.field3681.method1654(-109, 0).length());
        } else if (var2.startsWith(class279.field3682.method1654(-114, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class279.field3682.method1654(-97, 0).length());
        } else if (var2.startsWith(class279.field3683.method1654(127, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class279.field3683.method1654(-50, 0).length());
        } else if (class262.field3401 != 0) {
            if (var2.startsWith(class279.field3672.method1654(90, class262.field3401))) {
                var3 = 0;
                arg0 = arg0.substring(class279.field3672.method1654(91, class262.field3401).length());
            } else if (var2.startsWith(class279.field3673.method1654(-105, class262.field3401))) {
                var3 = 1;
                arg0 = arg0.substring(class279.field3673.method1654(-119, class262.field3401).length());
            } else if (var2.startsWith(class279.field3674.method1654(125, class262.field3401))) {
                var3 = 2;
                arg0 = arg0.substring(class279.field3674.method1654(123, class262.field3401).length());
            } else if (var2.startsWith(class279.field3675.method1654(103, class262.field3401))) {
                var3 = 3;
                arg0 = arg0.substring(class279.field3675.method1654(118, class262.field3401).length());
            } else if (var2.startsWith(class279.field3676.method1654(113, class262.field3401))) {
                var3 = 4;
                arg0 = arg0.substring(class279.field3676.method1654(-81, class262.field3401).length());
            } else if (var2.startsWith(class279.field3677.method1654(-70, class262.field3401))) {
                var3 = 5;
                arg0 = arg0.substring(class279.field3677.method1654(106, class262.field3401).length());
            } else if (var2.startsWith(class279.field3678.method1654(118, class262.field3401))) {
                var3 = 6;
                arg0 = arg0.substring(class279.field3678.method1654(100, class262.field3401).length());
            } else if (var2.startsWith(class279.field3679.method1654(99, class262.field3401))) {
                var3 = 7;
                arg0 = arg0.substring(class279.field3679.method1654(-93, class262.field3401).length());
            } else if (var2.startsWith(class279.field3680.method1654(-39, class262.field3401))) {
                var3 = 8;
                arg0 = arg0.substring(class279.field3680.method1654(107, class262.field3401).length());
            } else if (var2.startsWith(class279.field3681.method1654(101, class262.field3401))) {
                var3 = 9;
                arg0 = arg0.substring(class279.field3681.method1654(-128, class262.field3401).length());
            } else if (var2.startsWith(class279.field3682.method1654(118, class262.field3401))) {
                var3 = 10;
                arg0 = arg0.substring(class279.field3682.method1654(-108, class262.field3401).length());
            } else if (var2.startsWith(class279.field3683.method1654(-120, class262.field3401))) {
                var3 = 11;
                arg0 = arg0.substring(class279.field3683.method1654(-94, class262.field3401).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class279.field3684.method1654(126, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class279.field3684.method1654(107, 0).length());
        } else if (var4.startsWith(class279.field3685.method1654(-82, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class279.field3685.method1654(100, 0).length());
        } else if (var4.startsWith(class279.field3686.method1654(-114, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class279.field3686.method1654(111, 0).length());
        } else if (var4.startsWith(class279.field3687.method1654(-115, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class279.field3687.method1654(-75, 0).length());
        } else if (var4.startsWith(class279.field3688.method1654(-90, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class279.field3688.method1654(-44, 0).length());
        } else if (class262.field3401 != 0) {
            if (var4.startsWith(class279.field3684.method1654(116, class262.field3401))) {
                var5 = 1;
                arg0 = arg0.substring(class279.field3684.method1654(126, class262.field3401).length());
            } else if (var4.startsWith(class279.field3685.method1654(-37, class262.field3401))) {
                var5 = 2;
                arg0 = arg0.substring(class279.field3685.method1654(108, class262.field3401).length());
            } else if (var4.startsWith(class279.field3686.method1654(-60, class262.field3401))) {
                var5 = 3;
                arg0 = arg0.substring(class279.field3686.method1654(-98, class262.field3401).length());
            } else if (var4.startsWith(class279.field3687.method1654(94, class262.field3401))) {
                var5 = 4;
                arg0 = arg0.substring(class279.field3687.method1654(-104, class262.field3401).length());
            } else if (var4.startsWith(class279.field3688.method1654(-74, class262.field3401))) {
                var5 = 5;
                arg0 = arg0.substring(class279.field3688.method1654(-127, class262.field3401).length());
            }
        }
        field2630++;
        class654 var6 = class631.method3628(class653.field9348, (byte) -51, class357.field5280);
        var6.field9358.method3110(0, 106);
        int var7 = var6.field9358.field7956;
        var6.field9358.method3110(var3, 74);
        var6.field9358.method3110(var5, 104);
        class309.method1928((byte) -87, arg0, var6.field9358);
        var6.field9358.method3142(var6.field9358.field7956 - var7, true);
        class444.method2623(121, var6);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ldea;)V")
    public static final void method1270(class303 arg0) {
        method1272(arg0, 200000);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "()V")
    public static void method1271() {
        field2611 = null;
        field2623 = null;
        field2626 = null;
        field2629 = null;
        field2628 = null;
        field2614 = null;
        field2631 = null;
        field2610 = null;
        field2620 = null;
        field2621 = null;
        field2625 = null;
        field2636 = null;
        field2635 = null;
        field2634 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ldea;I)V")
    private static final void method1272(class303 arg0, int arg1) {
        Object[] var2 = arg0.field4500;
        int var3 = (Integer) var2[0];
        class653 var4 = class186.method1235(-108, var3);
        if (var4 == null) {
            return;
        }
        field2611 = new int[var4.field9347];
        int var5 = 0;
        field2623 = new String[var4.field9341];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4507;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4503;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4499 == null ? -1 : arg0.field4499.field65;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4494;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4499 == null ? -1 : arg0.field4499.field53;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4498 == null ? -1 : arg0.field4498.field65;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4498 == null ? -1 : arg0.field4498.field53;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4502;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4501;
                }
                field2611[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4497;
                }
                field2623[var6++] = var9;
            }
        }
        field2637 = arg0.field4496;
        method1268(var4, arg1);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static final void method1273(int arg0) {
        if (arg0 == -1 || !class233.method1442(false, arg0)) {
            return;
        }
        class5[] var1 = class220.field2917[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class5 var3 = var1[var2];
            if (var3.field181 != null) {
                class303 var4 = new class303();
                var4.field4499 = var3;
                var4.field4500 = var3.field181;
                method1272(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    private static final void method1274(int arg0) {
        class5 var1 = class705.method3944(arg0, (byte) 116);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class5[] var3 = class379.field5710[var2];
        if (var3 == null) {
            class5[] var4 = class220.field2917[var2];
            int var5 = var4.length;
            var3 = class379.field5710[var2] = new class5[var5];
            class667.method3744(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class667.method3744(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method1275(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2625.setTime(new Date(var1));
        int var3 = field2625.get(5);
        int var4 = field2625.get(2);
        int var5 = field2625.get(1);
        return var3 + "-" + field2636[var4] + "-" + var5;
    }
}
