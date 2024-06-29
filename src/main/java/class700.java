import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class700 {

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    private static int field9746 = 0;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "[I")
    private static int[] field9738 = new int[5];

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "[[I")
    private static int[][] field9750 = new int[5][5000];

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    private static int field9745 = 0;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "[I")
    private static int[] field9752 = new int[3];

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "[Loi;")
    private static class68[] field9744 = new class68[50];

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    private static int field9749 = 0;

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "[J")
    private static long[] field9757 = new long[1000];

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field9761 = new String[1000];

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    private static int field9754 = 0;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "[I")
    private static int[] field9763 = new int[1000];

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Laf;")
    public static class39 field9741 = new class39(4);

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
    private static int field9769 = 0;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lsha;")
    private static class115 field9739;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "Lsha;")
    private static class115 field9759;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lhga;")
    private static class195 field9753;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lag;")
    private static class459 field9765;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "Lhia;")
    private static class48 field9755;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "[I")
    private static int[] field9747;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "[J")
    private static long[] field9740;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "[Ljava/lang/String;")
    private static String[] field9768;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)V", line = 7)
    private static final void method3948(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9763[field9749++] = class626.field8766;
                return;
            }
            if (arg0 == 5001) {
                field9749 -= 3;
                class626.field8766 = field9763[field9749];
                class701.field9780 = class778.method4288(-98, field9763[field9749 + 1]);
                if (class701.field9780 == null) {
                    class701.field9780 = class718.field9940;
                }
                class189.field2368 = field9763[field9749 + 2];
                field9762++;
                class116 var2 = class248.method1672(class84.field1023, class56.field662, -20647);
                var2.field1575.method3005(255, class626.field8766);
                var2.field1575.method3005(255, class701.field9780.field1646);
                var2.field1575.method3005(255, class189.field2368);
                class443.method2655(0, var2);
                return;
            }
            if (arg0 == 5002) {
                field9745 -= 2;
                String var3 = field9761[field9745];
                String var4 = field9761[field9745 + 1];
                field9749 -= 2;
                int var5 = field9763[field9749];
                int var6 = field9763[field9749 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9748++;
                class116 var7 = class248.method1672(class84.field1023, class412.field5776, -20647);
                var7.field1575.method3005(255, class395.method2435(var3, 1) + class395.method2435(var4, 1) + 2);
                var7.field1575.method3037(0, var3);
                var7.field1575.method3005(255, var5 - 1);
                var7.field1575.method3005(255, var6);
                var7.field1575.method3037(0, var4);
                class443.method2655(0, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9763[--field9749];
                class598 var9 = class289.method1920(var8, 0);
                String var10 = "";
                if (var9 != null && var9.field8375 != null) {
                    var10 = var9.field8375;
                }
                field9761[field9745++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9763[--field9749];
                class598 var12 = class289.method1920(var11, 0);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8380;
                }
                field9763[field9749++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class701.field9780 == null) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = class701.field9780.field1646;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9763[--field9749];
                class116 var15 = class248.method1672(class84.field1023, class625.field8756, -20647);
                var15.field1575.method3005(255, var14);
                class443.method2655(0, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9761[--field9745];
                method3962(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9745 -= 2;
                String var17 = field9761[field9745];
                String var18 = field9761[field9745 + 1];
                if (class597.field8370 != 0 || (!class19.field127 || class84.field1021) && !class780.field10724) {
                    field9764++;
                    class116 var19 = class248.method1672(class84.field1023, class85.field1030, -20647);
                    var19.field1575.method3005(255, 0);
                    int var20 = var19.field1575.field6962;
                    var19.field1575.method3037(0, var17);
                    class382.method2381(var19.field1575, true, var18);
                    var19.field1575.method2985((byte) -57, var19.field1575.field6962 - var20);
                    class443.method2655(0, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9763[--field9749];
                class598 var22 = class289.method1920(var21, 0);
                String var23 = "";
                if (var22 != null && var22.field8372 != null) {
                    var23 = var22.field8372;
                }
                field9761[field9745++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9763[--field9749];
                class598 var25 = class289.method1920(var24, 0);
                String var26 = "";
                if (var25 != null && var25.field8373 != null) {
                    var26 = var25.field8373;
                }
                field9761[field9745++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9763[--field9749];
                class598 var28 = class289.method1920(var27, 0);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8374;
                }
                field9763[field9749++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class724.field10031 == null || class724.field10031.field9973 == null) {
                    var30 = "";
                } else {
                    var30 = class724.field10031.method4030(true, (byte) 10);
                }
                field9761[field9745++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9763[field9749++] = class189.field2368;
                return;
            }
            if (arg0 == 5017) {
                field9763[field9749++] = class424.method2552(-2);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9763[--field9749];
                class598 var32 = class289.method1920(var31, 0);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8379;
                }
                field9763[field9749++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9763[--field9749];
                class598 var35 = class289.method1920(var34, 0);
                String var36 = "";
                if (var35 != null && var35.field8382 != null) {
                    var36 = var35.field8382;
                }
                field9761[field9745++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class724.field10031 == null || class724.field10031.field9973 == null) {
                    var37 = "";
                } else {
                    var37 = class724.field10031.method4025(-56, false);
                }
                field9761[field9745++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9763[--field9749];
                class598 var39 = class289.method1920(var38, 0);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8376;
                }
                field9763[field9749++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9763[--field9749];
                class598 var42 = class289.method1920(var41, 0);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8378;
                }
                field9763[field9749++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9763[--field9749];
                class598 var45 = class289.method1920(var44, 0);
                String var46 = "";
                if (var45 != null && var45.field8377 != null) {
                    var46 = var45.field8377;
                }
                field9761[field9745++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9763[--field9749];
                field9761[field9745++] = class353.field5116.method3442(32768, var47).field9460;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9763[--field9749];
                class675 var49 = class353.field5116.method3442(32768, var48);
                if (var49.field9461 == null) {
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = var49.field9461.length;
                return;
            }
            if (arg0 == 5052) {
                field9749 -= 2;
                int var50 = field9763[field9749];
                int var51 = field9763[field9749 + 1];
                class675 var52 = class353.field5116.method3442(32768, var50);
                int var53 = var52.field9461[var51];
                field9763[field9749++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9763[--field9749];
                class675 var55 = class353.field5116.method3442(32768, var54);
                if (var55.field9469 == null) {
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = var55.field9469.length;
                return;
            }
            if (arg0 == 5054) {
                field9749 -= 2;
                int var56 = field9763[field9749];
                int var57 = field9763[field9749 + 1];
                field9763[field9749++] = class353.field5116.method3442(32768, var56).field9469[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9763[--field9749];
                field9761[field9745++] = class475.field6591.method2375((byte) -107, var58).method3705((byte) -107);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9763[--field9749];
                class647 var60 = class475.field6591.method2375((byte) -106, var59);
                if (var60.field9044 == null) {
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = var60.field9044.length;
                return;
            }
            if (arg0 == 5057) {
                field9749 -= 2;
                int var61 = field9763[field9749];
                int var62 = field9763[field9749 + 1];
                field9763[field9749++] = class475.field6591.method2375((byte) -118, var61).field9044[var62];
                return;
            }
            if (arg0 == 5058) {
                field9753 = new class195();
                field9753.field2768 = field9763[--field9749];
                field9753.field2764 = class475.field6591.method2375((byte) -120, field9753.field2768);
                field9753.field2769 = new int[field9753.field2764.method3702(0)];
                return;
            }
            if (arg0 == 5059) {
                field9766++;
                class116 var63 = class248.method1672(class84.field1023, class470.field6510, -20647);
                var63.field1575.method3005(255, 0);
                int var64 = var63.field1575.field6962;
                var63.field1575.method3005(255, 0);
                var63.field1575.method2986(field9753.field2768, -11);
                field9753.field2764.method3709(field9753.field2769, var63.field1575, 0);
                var63.field1575.method2985((byte) -57, var63.field1575.field6962 - var64);
                class443.method2655(0, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9761[--field9745];
                field9742++;
                class116 var66 = class248.method1672(class84.field1023, class214.field2961, -20647);
                var66.field1575.method3005(255, 0);
                int var67 = var66.field1575.field6962;
                var66.field1575.method3037(0, var65);
                var66.field1575.method2986(field9753.field2768, 114);
                field9753.field2764.method3709(field9753.field2769, var66.field1575, 0);
                var66.field1575.method2985((byte) -57, var66.field1575.field6962 - var67);
                class443.method2655(0, var66);
                return;
            }
            if (arg0 == 5061) {
                field9766++;
                class116 var68 = class248.method1672(class84.field1023, class470.field6510, -20647);
                var68.field1575.method3005(255, 0);
                int var69 = var68.field1575.field6962;
                var68.field1575.method3005(255, 1);
                var68.field1575.method2986(field9753.field2768, 98);
                field9753.field2764.method3709(field9753.field2769, var68.field1575, 0);
                var68.field1575.method2985((byte) -57, var68.field1575.field6962 - var69);
                class443.method2655(0, var68);
                return;
            }
            if (arg0 == 5062) {
                field9749 -= 2;
                int var70 = field9763[field9749];
                int var71 = field9763[field9749 + 1];
                field9763[field9749++] = class353.field5116.method3442(32768, var70).field9464[var71];
                return;
            }
            if (arg0 == 5063) {
                field9749 -= 2;
                int var72 = field9763[field9749];
                int var73 = field9763[field9749 + 1];
                field9763[field9749++] = class353.field5116.method3442(32768, var72).field9470[var73];
                return;
            }
            if (arg0 == 5064) {
                field9749 -= 2;
                int var74 = field9763[field9749];
                int var75 = field9763[field9749 + 1];
                if (var75 == -1) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = class353.field5116.method3442(32768, var74).method3847((byte) 105, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field9749 -= 2;
                int var76 = field9763[field9749];
                int var77 = field9763[field9749 + 1];
                if (var77 == -1) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = class353.field5116.method3442(32768, var76).method3842(121, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9763[--field9749];
                field9763[field9749++] = class475.field6591.method2375((byte) -127, var78).method3702(0);
                return;
            }
            if (arg0 == 5067) {
                field9749 -= 2;
                int var79 = field9763[field9749];
                int var80 = field9763[field9749 + 1];
                int var81 = class475.field6591.method2375((byte) -83, var79).method3711(var80, (byte) 22).field2905;
                field9763[field9749++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9749 -= 2;
                int var82 = field9763[field9749];
                int var83 = field9763[field9749 + 1];
                field9753.field2769[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9749 -= 2;
                int var84 = field9763[field9749];
                int var85 = field9763[field9749 + 1];
                field9753.field2769[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9749 -= 3;
                int var86 = field9763[field9749];
                int var87 = field9763[field9749 + 1];
                int var88 = field9763[field9749 + 2];
                class647 var89 = class475.field6591.method2375((byte) -113, var86);
                if (var89.method3711(var87, (byte) 22).field2905 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9763[field9749++] = var89.method3706((byte) 79, var87, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9761[--field9745];
                boolean var91 = field9763[--field9749] == 1;
                class323.method2048(-59, var91, var90);
                field9763[field9749++] = class22.field205;
                return;
            }
            if (arg0 == 5072) {
                if (class133.field1706 != null && class263.field3848 < class22.field205) {
                    field9763[field9749++] = class133.field1706[class263.field3848++] & 0xFFFF;
                    return;
                }
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class263.field3848 = 0;
                return;
            }
            if (arg0 == 5074) {
                class116 var92 = class248.method1672(class84.field1023, class470.field6510, -20647);
                var92.field1575.method3005(255, 0);
                int var93 = var92.field1575.field6962;
                var92.field1575.method3005(255, 2);
                var92.field1575.method2986(field9753.field2768, 127);
                field9753.field2764.method3709(field9753.field2769, var92.field1575, 0);
                var92.field1575.method2985((byte) -57, var92.field1575.field6962 - var93);
                class443.method2655(0, var92);
                return;
            }
            if (arg0 == 5075) {
                class116 var94 = class248.method1672(class84.field1023, class470.field6510, -20647);
                var94.field1575.method3005(255, 0);
                int var95 = var94.field1575.field6962;
                var94.field1575.method3005(255, 3);
                var94.field1575.method2986(field9753.field2768, -14);
                field9753.field2764.method3709(field9753.field2769, var94.field1575, 0);
                var94.field1575.method2985((byte) -57, var94.field1575.field6962 - var95);
                class443.method2655(0, var94);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class479.field6647.method273(86, Integer.MAX_VALUE)) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class479.field6647.method273(82, Integer.MAX_VALUE)) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class479.field6647.method273(81, Integer.MAX_VALUE)) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class603.method3483((byte) 117, field9763[--field9749]);
                return;
            }
            if (arg0 == 5201) {
                field9763[field9749++] = class639.method3676(111);
                return;
            }
            if (arg0 == 5205) {
                class447.method2714((byte) 2, false, -1, field9763[--field9749], -1);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field9763[--field9749];
                class305 var97 = class46.method374(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = var97.field4427;
                return;
            }
            if (arg0 == 5207) {
                class305 var98 = class46.method382(field9763[--field9749]);
                if (var98 != null && var98.field4430 != null) {
                    field9761[field9745++] = var98.field4430;
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9763[field9749++] = class35.field362;
                field9763[field9749++] = class100.field1177;
                return;
            }
            if (arg0 == 5209) {
                field9763[field9749++] = class612.field8623 + class46.field503;
                field9763[field9749++] = class744.field10276 + class46.field511;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field9763[--field9749];
                class305 var100 = class46.method382(var99);
                if (var100 == null) {
                    field9763[field9749++] = 0;
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = var100.field4420 >> 14 & 0x3FFF;
                field9763[field9749++] = var100.field4420 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field9763[--field9749];
                class305 var102 = class46.method382(var101);
                if (var102 == null) {
                    field9763[field9749++] = 0;
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = var102.field4432 - var102.field4425;
                field9763[field9749++] = var102.field4436 - var102.field4423;
                return;
            }
            if (arg0 == 5212) {
                class226 var103 = class404.method2476(-103);
                if (var103 == null) {
                    field9763[field9749++] = -1;
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = var103.field3433;
                int var104 = var103.field3431 << 28 | class46.field503 + var103.field3424 << 14 | class46.field511 + var103.field3434;
                field9763[field9749++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class226 var105 = class298.method1948(-10618);
                if (var105 == null) {
                    field9763[field9749++] = -1;
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = var105.field3433;
                int var106 = var105.field3431 << 28 | class46.field503 + var105.field3424 << 14 | class46.field511 + var105.field3434;
                field9763[field9749++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field9763[--field9749];
                class305 var108 = class591.method3457(-23350);
                if (var108 != null) {
                    boolean var109 = var108.method1987(var107 >> 28 & 0x3, var107 >> 14 & 0x3FFF, field9752, -795484448, var107 & 0x3FFF);
                    if (var109) {
                        class201.method1296(127, field9752[2], field9752[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9749 -= 2;
                int var110 = field9763[field9749];
                int var111 = field9763[field9749 + 1];
                class179 var112 = class46.method377(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class305 var114 = (class305) var112.method1140(-86); var114 != null; var114 = (class305) var112.method1138(111)) {
                    if (var114.field4427 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field9763[--field9749];
                class305 var116 = class46.method382(var115);
                if (var116 == null) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = var116.field4418;
                return;
            }
            if (arg0 == 5220) {
                field9763[field9749++] = class130.field1678 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field9763[--field9749];
                class201.method1296(124, var117 & 0x3FFF, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class305 var118 = class591.method3457(-23350);
                if (var118 != null) {
                    boolean var119 = var118.method1991(-256, field9752, class744.field10276 + class46.field511, class612.field8623 + class46.field503);
                    if (var119) {
                        field9763[field9749++] = field9752[1];
                        field9763[field9749++] = field9752[2];
                        return;
                    }
                    field9763[field9749++] = -1;
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = -1;
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9749 -= 2;
                int var120 = field9763[field9749];
                int var121 = field9763[field9749 + 1];
                class447.method2714((byte) 2, false, var121 >> 14 & 0x3FFF, var120, var121 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field9763[--field9749];
                class305 var123 = class591.method3457(-23350);
                if (var123 != null) {
                    boolean var124 = var123.method1987(var122 >> 28 & 0x3, var122 >> 14 & 0x3FFF, field9752, -795484448, var122 & 0x3FFF);
                    if (var124) {
                        field9763[field9749++] = field9752[1];
                        field9763[field9749++] = field9752[2];
                        return;
                    }
                    field9763[field9749++] = -1;
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = -1;
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field9763[--field9749];
                class305 var126 = class591.method3457(-23350);
                if (var126 != null) {
                    boolean var127 = var126.method1991(-256, field9752, var125 & 0x3FFF, var125 >> 14 & 0x3FFF);
                    if (var127) {
                        field9763[field9749++] = field9752[1];
                        field9763[field9749++] = field9752[2];
                        return;
                    }
                    field9763[field9749++] = -1;
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = -1;
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class268.method1753(false, field9763[--field9749]);
                return;
            }
            if (arg0 == 5227) {
                field9749 -= 2;
                int var128 = field9763[field9749];
                int var129 = field9763[field9749 + 1];
                class447.method2714((byte) 2, true, var129 >> 14 & 0x3FFF, var128, var129 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class702.field9782 = field9763[--field9749] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9763[field9749++] = class702.field9782 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field9763[--field9749];
                class464.method2785(var130, (byte) -120);
                return;
            }
            if (arg0 == 5231) {
                field9749 -= 2;
                int var131 = field9763[field9749];
                boolean var132 = field9763[field9749 + 1] == 1;
                if (class604.field8477 != null) {
                    class69 var133 = class604.field8477.method3669(false, (long) var131);
                    if (var133 != null && !var132) {
                        var133.method527(-11229);
                        return;
                    }
                    if (var133 == null && var132) {
                        class69 var134 = new class69();
                        class604.field8477.method3666((byte) 65, (long) var131, var134);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field9763[--field9749];
                if (class604.field8477 != null) {
                    class69 var136 = class604.field8477.method3669(false, (long) var135);
                    field9763[field9749++] = var136 == null ? 0 : 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9749 -= 2;
                int var137 = field9763[field9749];
                boolean var138 = field9763[field9749 + 1] == 1;
                if (class453.field6317 != null) {
                    class69 var139 = class453.field6317.method3669(false, (long) var137);
                    if (var139 != null && !var138) {
                        var139.method527(-11229);
                        return;
                    }
                    if (var139 == null && var138) {
                        class69 var140 = new class69();
                        class453.field6317.method3666((byte) 65, (long) var137, var140);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field9763[--field9749];
                if (class453.field6317 != null) {
                    class69 var142 = class453.field6317.method3669(false, (long) var141);
                    field9763[field9749++] = var142 == null ? 0 : 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9763[field9749++] = class46.field483 == null ? -1 : class46.field483.field4427;
                return;
            }
            if (arg0 == 5236) {
                field9749 -= 2;
                int var143 = field9763[field9749];
                int var144 = field9763[field9749 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class261.method1719(var146, var143, -2, var145);
                if (var147 < 0) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class68.method524((byte) -24);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9749 -= 2;
                int var148 = field9763[field9749];
                int var149 = field9763[field9749 + 1];
                class234.method1602(3, false, var149, 16367, var148);
                field9763[field9749++] = class661.field9305 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class661.field9305 != null) {
                    class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class577[] var150 = class177.method1129(5);
                field9763[field9749++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field9763[--field9749];
                class577[] var152 = class177.method1129(5);
                field9763[field9749++] = var152[var151].field8111;
                field9763[field9749++] = var152[var151].field8107;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class631.field8824;
                int var154 = class201.field2825;
                int var155 = -1;
                class577[] var156 = class177.method1129(5);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class577 var158 = var156[var157];
                    if (var158.field8111 == var153 && var158.field8107 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field9763[field9749++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field9763[field9749++] = class647.method3714(-121);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field9763[--field9749];
                if (var159 >= 1 && var159 <= 2) {
                    class234.method1602(var159, false, -1, 16367, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9763[field9749++] = class688.field9602.field8518.method3732((byte) -98);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field9763[--field9749];
                if (var160 >= 1 && var160 <= 2) {
                    class688.field9602.method3503(class688.field9602.field8518, -122, var160);
                    class688.field9602.method3503(class688.field9602.field8498, -125, var160);
                    class266.method1738(-99);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9745 -= 2;
                String var161 = field9761[field9745];
                String var162 = field9761[field9745 + 1];
                int var163 = field9763[--field9749];
                field9743++;
                class116 var164 = class248.method1672(class84.field1023, class180.field2277, -20647);
                var164.field1575.method3005(255, class395.method2435(var161, 1) + class395.method2435(var162, 1) + 1);
                var164.field1575.method3037(0, var161);
                var164.field1575.method3037(0, var162);
                var164.field1575.method3005(255, var163);
                class443.method2655(0, var164);
                return;
            }
            if (arg0 == 5401) {
                field9749 -= 2;
                class45.field476[field9763[field9749]] = (short) class703.method3973(field9763[field9749 + 1], 113);
                class35.field367.method3048(-31816);
                class35.field367.method3045(64);
                class104.field1201.method4322(5);
                class23.method99(100);
                return;
            }
            if (arg0 == 5405) {
                field9749 -= 2;
                int var165 = field9763[field9749];
                int var166 = field9763[field9749 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class706.field9816[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9749 -= 7;
                int var167 = field9763[field9749];
                int var168 = field9763[field9749 + 1] << 1;
                int var169 = field9763[field9749 + 2];
                int var170 = field9763[field9749 + 3];
                int var171 = field9763[field9749 + 4];
                int var172 = field9763[field9749 + 5];
                int var173 = field9763[field9749 + 6];
                if (var167 >= 0 && var167 < 2 && class706.field9816[var167] != null && var168 >= 0 && var168 < class706.field9816[var167].length) {
                    class706.field9816[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class706.field9816[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class706.field9816[field9763[--field9749]].length >> 1;
                field9763[field9749++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class661.field9305 != null) {
                    class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
                }
                if (class43.field453 != null) {
                    class775.method4276((byte) -21);
                    System.exit(0);
                    return;
                }
                String var175 = class25.field232 == null ? class72.method534(0) : class25.field232;
                class407.method2491(class688.field9602.field8517.method2604((byte) -98) == 1, 35, false, class129.field1674, var175);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class531.field7317 != null) {
                    if (class531.field7317.field4975 == null) {
                        var176 = class632.method3623(class531.field7317.field4969, true);
                    } else {
                        var176 = (String) class531.field7317.field4975;
                    }
                }
                field9761[field9745++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field9763[field9749++] = class129.field1674.field10576 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class661.field9305 != null) {
                    class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
                }
                String var177 = field9761[--field9745];
                boolean var178 = field9763[--field9749] == 1;
                String var179 = class72.method534(0) + var177;
                class407.method2491(class688.field9602.field8517.method2604((byte) -98) == 1, 35, var178, class129.field1674, var179);
                return;
            }
            if (arg0 == 5422) {
                field9745 -= 2;
                String var180 = field9761[field9745];
                String var181 = field9761[field9745 + 1];
                int var182 = field9763[--field9749];
                if (var180.length() > 0) {
                    if (class582.field8249 == null) {
                        class582.field8249 = new String[class156.field2029[class327.field4603.field10814]];
                    }
                    class582.field8249[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class656.field9259 == null) {
                        class656.field9259 = new String[class156.field2029[class327.field4603.field10814]];
                    }
                    class656.field9259[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9761[--field9745]);
                return;
            }
            if (arg0 == 5424) {
                field9749 -= 11;
                class456.field6379 = field9763[field9749];
                class726.field10050 = field9763[field9749 + 1];
                class79.field889 = field9763[field9749 + 2];
                class373.field5357 = field9763[field9749 + 3];
                class722.field9955 = field9763[field9749 + 4];
                class702.field9787 = field9763[field9749 + 5];
                class153.field1999 = field9763[field9749 + 6];
                class362.field5226 = field9763[field9749 + 7];
                class116.field1582 = field9763[field9749 + 8];
                class773.field10643 = field9763[field9749 + 9];
                class378.field5425 = field9763[field9749 + 10];
                class149.field1968.method1860(class722.field9955, (byte) 124);
                class149.field1968.method1860(class702.field9787, (byte) 124);
                class149.field1968.method1860(class153.field1999, (byte) 124);
                class149.field1968.method1860(class362.field5226, (byte) 124);
                class149.field1968.method1860(class116.field1582, (byte) 124);
                class353.field5119 = null;
                class93.field1090 = null;
                class785.field10771 = null;
                class436.field6056 = null;
                class595.field8361 = null;
                class382.field5481 = null;
                class534.field7396 = null;
                class465.field6478 = null;
                class474.field6578 = true;
                return;
            }
            if (arg0 == 5425) {
                class523.method3120(true);
                class474.field6578 = false;
                return;
            }
            if (arg0 == 5426) {
                field9749 -= 2;
                class574.field8082 = field9763[field9749];
                class233.field3500 = field9763[field9749 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9749 -= 2;
                class538.field7439 = field9763[field9749 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9749 -= 2;
                int var183 = field9763[field9749];
                int var184 = field9763[field9749 + 1];
                field9763[field9749++] = class12.method35(var183, true, var184) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class416.method2522(false, field9761[--field9745], false, 0);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class552.method3253(class511.field7007, 106, "accountcreated");
                    return;
                } catch (Throwable var332) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class552.method3253(class511.field7007, -123, "accountcreatestarted");
                    return;
                } catch (Throwable var333) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class734.field10127 != null) {
                    Transferable var186 = class734.field10127.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var334) {
                        }
                    }
                }
                field9761[field9745++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class400.field5649 = field9763[--field9749];
                return;
            }
            if (arg0 == 5435) {
                field9763[field9749++] = class359.field5181 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9749 -= 4;
                int var187 = field9763[field9749];
                int var188 = field9763[field9749 + 1];
                int var189 = field9763[field9749 + 2];
                int var190 = field9763[field9749 + 3];
                class535.method3178(var190, -39, var188 << 2, var189, (var187 >> 14 & 0x3FFF) - class444.field6151, false, (var187 & 0x3FFF) - class236.field3535);
                return;
            }
            if (arg0 == 5501) {
                field9749 -= 4;
                int var191 = field9763[field9749];
                int var192 = field9763[field9749 + 1];
                int var193 = field9763[field9749 + 2];
                int var194 = field9763[field9749 + 3];
                class477.method2841((var191 & 0x3FFF) - class236.field3535, var194, var193, (var191 >> 14 & 0x3FFF) - class444.field6151, -103, var192 << 2);
                return;
            }
            if (arg0 == 5502) {
                field9749 -= 6;
                int var195 = field9763[field9749];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class377.field5409 = var195;
                int var196 = field9763[field9749 + 1];
                if (var196 + 1 >= class706.field9816[class377.field5409].length >> 1) {
                    throw new RuntimeException();
                }
                class501.field6857 = var196;
                class553.field7663 = 0;
                class773.field10653 = field9763[field9749 + 2];
                class439.field6072 = field9763[field9749 + 3];
                int var197 = field9763[field9749 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class70.field769 = var197;
                int var198 = field9763[field9749 + 5];
                if (var198 + 1 >= class706.field9816[class70.field769].length >> 1) {
                    throw new RuntimeException();
                }
                class310.field4469 = var198;
                class695.field9691 = 3;
                class362.field5225 = -1;
                class5.field30 = -1;
                return;
            }
            if (arg0 == 5503) {
                class180.method1147(false);
                return;
            }
            if (arg0 == 5504) {
                field9749 -= 2;
                class156.method1010(30512, 0, field9763[field9749], field9763[field9749 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field9763[field9749++] = (int) class514.field7053 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9763[field9749++] = (int) class702.field9790 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class395.method2434((byte) -60);
                return;
            }
            if (arg0 == 5508) {
                class370.method2308((byte) 11);
                return;
            }
            if (arg0 == 5509) {
                class501.method2934(0);
                return;
            }
            if (arg0 == 5510) {
                class399.method2455(false);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field9763[--field9749];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class444.field6151;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class741.field10208) {
                    var202 = class741.field10208;
                }
                int var203 = var201 - class236.field3535;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class525.field7224) {
                    var203 = class525.field7224;
                }
                class568.field8011 = (var202 << 9) + 256;
                class177.field2234 = (var203 << 9) + 256;
                class695.field9691 = 4;
                class362.field5225 = -1;
                class5.field30 = -1;
                return;
            }
            if (arg0 == 5512) {
                class351.method2214(false);
                return;
            }
            if (arg0 == 5514) {
                class775.field10669 = field9763[--field9749];
                return;
            }
            if (arg0 == 5516) {
                field9763[field9749++] = class775.field10669;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field9763[--field9749];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class444.field6151;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class741.field10208) {
                        var207 = class741.field10208;
                    }
                    int var208 = var206 - class236.field3535;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class525.field7224) {
                        var208 = class525.field7224;
                    }
                    class5.field30 = (var207 << 9) + 256;
                    class362.field5225 = (var208 << 9) + 256;
                    return;
                }
                class5.field30 = -1;
                class362.field5225 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9745 -= 2;
                String var209 = field9761[field9745];
                String var210 = field9761[field9745 + 1];
                int var211 = field9763[--field9749];
                if (var209.length() > 320) {
                    return;
                }
                if (class664.field9331 != 3) {
                    return;
                }
                if (class567.field7992 == 0 && class785.field10773 == 0) {
                    class671.field9423 = var209;
                    class266.field3866 = var210;
                    class284.field4094 = var211;
                    class285.method1884(true, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class113.method818((byte) -123);
                return;
            }
            if (arg0 == 5602) {
                if (class567.field7992 == 0) {
                    class153.field2007 = -2;
                    class687.field9591 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field9745--;
                if (class664.field9331 != 3) {
                    return;
                }
                if (class567.field7992 == 0 && class785.field10773 == 0) {
                    class470.method2805(field9761[field9745], false);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9745 -= 2;
                field9749 -= 2;
                if (class664.field9331 != 3) {
                    return;
                }
                if (class567.field7992 == 0 && class785.field10773 == 0) {
                    class260.method1715(field9761[field9745], field9763[field9749 + 1] == 1, field9761[field9745 + 1], false, field9763[field9749]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class785.field10773 == 0) {
                    class383.field5492 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9763[field9749++] = class687.field9591;
                return;
            }
            if (arg0 == 5608) {
                field9763[field9749++] = class486.field6712;
                return;
            }
            if (arg0 == 5609) {
                field9763[field9749++] = class383.field5492;
                return;
            }
            if (arg0 == 5611) {
                field9763[field9749++] = class47.field524;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field9763[--field9749];
                if (class664.field9331 != 7) {
                    return;
                }
                if (class567.field7992 == 0 && class785.field10773 == 0) {
                    if (class679.field9490 != null) {
                        class679.field9490.method3634(22654);
                        class679.field9490 = null;
                    }
                    class284.field4094 = var212;
                    class285.method1884(true, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9763[field9749++] = class687.field9591;
                return;
            }
            if (arg0 == 5615) {
                field9745 -= 2;
                String var213 = field9761[field9745];
                String var214 = field9761[field9745 + 1];
                if (var213.length() > 320) {
                    return;
                }
                if (class664.field9331 != 3) {
                    return;
                }
                if (class567.field7992 == 0 && class785.field10773 == 0) {
                    if (class679.field9490 != null) {
                        class679.field9490.method3634(22654);
                        class679.field9490 = null;
                    }
                    class671.field9423 = var213;
                    class266.field3866 = var214;
                    class285.method1884(true, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class570.method3355((byte) -73, false);
                return;
            }
            if (arg0 == 5617) {
                field9763[field9749++] = class153.field2007;
                return;
            }
            if (arg0 == 5618) {
                field9749--;
                return;
            }
            if (arg0 == 5619) {
                field9749--;
                return;
            }
            if (arg0 == 5620) {
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9745 -= 2;
                field9749 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class766.field10546 != null) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9763[field9749++] = (int) (class44.field467 >> 32);
                field9763[field9749++] = (int) (class44.field467 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field9763[field9749++] = class629.field8814 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class629.field8814 = true;
                class359.method2254(true);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var215 = field9763[--field9749];
                class688.field9602.method3503(class688.field9602.field8543, -126, var215);
                class351.method2213(3);
                class266.method1738(76);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var216 = field9763[--field9749] == 1;
                class688.field9602.method3503(class688.field9602.field8539, -127, var216 ? 1 : 0);
                class688.field9602.method3503(class688.field9602.field8542, -126, var216 ? 1 : 0);
                class351.method2213(3);
                class421.method2540((byte) -67);
                class266.method1738(-80);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var217 = field9763[--field9749] == 1;
                class688.field9602.method3503(class688.field9602.field8530, -127, var217 ? 2 : 1);
                class688.field9602.method3503(class688.field9602.field8532, -124, var217 ? 2 : 1);
                class421.method2540((byte) -67);
                class266.method1738(82);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6005) {
                class688.field9602.method3503(class688.field9602.field8508, -126, field9763[--field9749] == 1 ? 1 : 0);
                class351.method2213(3);
                class266.method1738(-99);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6007) {
                class688.field9602.method3503(class688.field9602.field8501, -122, field9763[--field9749]);
                class266.method1738(-125);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6008) {
                class688.field9602.method3503(class688.field9602.field8512, -128, field9763[--field9749] == 1 ? 1 : 0);
                class266.method1738(-93);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6010) {
                class688.field9602.method3503(class688.field9602.field8547, -125, field9763[--field9749] == 1 ? 1 : 0);
                class266.method1738(82);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6011) {
                class688.field9602.method3503(class688.field9602.field8538, -127, field9763[--field9749]);
                class351.method2213(3);
                class266.method1738(-79);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6012) {
                class688.field9602.method3503(class688.field9602.field8528, -125, field9763[--field9749] == 1 ? 1 : 0);
                class511.method3009(-14603);
                class271.method1768((byte) -70);
                class266.method1738(115);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6014) {
                class688.field9602.method3503(class688.field9602.field8507, -127, field9763[--field9749] == 1 ? 2 : 0);
                class351.method2213(3);
                class266.method1738(96);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6015) {
                class688.field9602.method3503(class688.field9602.field8499, -126, field9763[--field9749] == 1 ? 1 : 0);
                class351.method2213(3);
                class266.method1738(-127);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6016) {
                class688.field9602.method3503(class688.field9602.field8529, -122, field9763[--field9749]);
                class532.method3154(class688.field9602.field8517.method2604((byte) -98), false, 1);
                class266.method1738(-111);
                return;
            }
            if (arg0 == 6017) {
                class688.field9602.method3503(class688.field9602.field8531, -123, field9763[--field9749] == 1 ? 1 : 0);
                class153.method1005((byte) -91);
                class266.method1738(-76);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6018) {
                class688.field9602.method3503(class688.field9602.field8548, -123, field9763[--field9749]);
                class266.method1738(-103);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6019) {
                int var218 = field9763[--field9749];
                int var219 = class688.field9602.field8505.method1981((byte) -98);
                if (var218 != var219) {
                    if (class203.method1303(class664.field9331, true)) {
                        if (var219 == 0 && class4.field22 != -1) {
                            class707.method3988(0, (byte) -98, var218, class4.field22, false, class456.field6372);
                            class644.method3690(108);
                            class15.field90 = false;
                        } else if (var218 == 0) {
                            class480.method2854(93);
                            class15.field90 = false;
                        } else {
                            class124.method870(var218, 0);
                        }
                    }
                    class688.field9602.method3503(class688.field9602.field8505, -128, var218);
                    class266.method1738(126);
                    class106.field1247 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class688.field9602.method3503(class688.field9602.field8496, -127, field9763[--field9749]);
                class266.method1738(-97);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6021) {
                int var220 = class688.field9602.field8530.method4280((byte) -98);
                class688.field9602.method3503(class688.field9602.field8532, -123, field9763[--field9749] == 1 ? 0 : var220);
                class421.method2540((byte) -67);
                return;
            }
            if (arg0 == 6023) {
                int var221 = field9763[--field9749];
                class688.field9602.method3503(class688.field9602.field8541, -126, var221);
                class266.method1738(79);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6024) {
                class688.field9602.method3503(class688.field9602.field8540, -122, field9763[--field9749]);
                class266.method1738(100);
                return;
            }
            if (arg0 == 6025) {
                class688.field9602.method3503(class688.field9602.field8516, -124, field9763[--field9749]);
                class266.method1738(-109);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6027) {
                int var222 = field9763[--field9749];
                if (var222 < 0 || var222 > 1) {
                    var222 = 0;
                }
                class282.method1835(var222 == 1, (byte) 83);
                return;
            }
            if (arg0 == 6028) {
                class688.field9602.method3503(class688.field9602.field8504, -122, field9763[--field9749] == 0 ? 0 : 1);
                class266.method1738(-109);
                return;
            }
            if (arg0 == 6029) {
                class688.field9602.method3503(class688.field9602.field8501, -127, field9763[--field9749]);
                class266.method1738(-88);
                return;
            }
            if (arg0 == 6030) {
                class688.field9602.method3503(class688.field9602.field8551, -125, field9763[--field9749] == 0 ? 0 : 1);
                class266.method1738(81);
                class351.method2213(3);
                return;
            }
            if (arg0 == 6031) {
                int var223 = field9763[--field9749];
                if (var223 < 0 || var223 > 5) {
                    var223 = 2;
                }
                class532.method3154(var223, false, 1);
                return;
            }
            if (arg0 == 6032) {
                field9749 -= 2;
                int var224 = field9763[field9749];
                boolean var225 = field9763[field9749 + 1] == 1;
                class688.field9602.method3503(class688.field9602.field8510, -125, var224);
                if (!var225) {
                    class688.field9602.method3503(class688.field9602.field8553, -127, 0);
                }
                class266.method1738(-126);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6033) {
                class688.field9602.method3503(class688.field9602.field8502, -123, field9763[--field9749]);
                class266.method1738(-84);
                return;
            }
            if (arg0 == 6034) {
                class688.field9602.method3503(class688.field9602.field8506, -127, field9763[--field9749] == 1 ? 1 : 0);
                class266.method1738(-61);
                class511.method3009(-14603);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6035) {
                int var226 = class688.field9602.field8539.method1756((byte) -98);
                class688.field9602.method3503(class688.field9602.field8542, -126, field9763[--field9749] == 1 ? 1 : var226);
                class351.method2213(3);
                class421.method2540((byte) -67);
                return;
            }
            if (arg0 == 6036) {
                class688.field9602.method3503(class688.field9602.field8523, -122, field9763[--field9749]);
                class266.method1738(110);
                class501.field6854 = true;
                return;
            }
            if (arg0 == 6037) {
                class688.field9602.method3503(class688.field9602.field8535, -122, field9763[--field9749]);
                class266.method1738(-125);
                class106.field1247 = false;
                return;
            }
            if (arg0 == 6038) {
                int var227 = field9763[--field9749];
                int var228 = class688.field9602.field8521.method1981((byte) -98);
                if (var227 != var228 && class442.field6102 == class4.field22) {
                    if (!class203.method1303(class664.field9331, true)) {
                        if (var228 == 0) {
                            class707.method3988(0, (byte) -98, var227, class4.field22, false, class456.field6372);
                            class644.method3690(99);
                            class15.field90 = false;
                        } else if (var227 == 0) {
                            class480.method2854(127);
                            class15.field90 = false;
                        } else {
                            class124.method870(var227, 0);
                        }
                    }
                    class688.field9602.method3503(class688.field9602.field8521, -125, var227);
                    class266.method1738(91);
                    class106.field1247 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var229 = field9763[--field9749];
                if (var229 > 255 || var229 < 0) {
                    var229 = 0;
                }
                if (var229 != class688.field9602.field8537.method1330((byte) -98)) {
                    class688.field9602.method3503(class688.field9602.field8537, -127, var229);
                    class266.method1738(126);
                    class106.field1247 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var230 = field9763[--field9749];
                if (var230 != class688.field9602.field8545.method4143((byte) -98)) {
                    class688.field9602.method3503(class688.field9602.field8545, -128, var230);
                    class266.method1738(113);
                    class106.field1247 = false;
                    class122.method861(98);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9763[field9749++] = class688.field9602.field8543.method1947((byte) -98);
                return;
            }
            if (arg0 == 6102) {
                field9763[field9749++] = class688.field9602.field8539.method1756((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9763[field9749++] = class688.field9602.field8530.method4280((byte) -98) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9763[field9749++] = class688.field9602.field8508.method491((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9763[field9749++] = class688.field9602.field8501.method3773((byte) -98);
                return;
            }
            if (arg0 == 6108) {
                field9763[field9749++] = class688.field9602.field8512.method2542((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9763[field9749++] = class688.field9602.field8547.method3388((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9763[field9749++] = class688.field9602.field8538.method2315((byte) -98);
                return;
            }
            if (arg0 == 6112) {
                field9763[field9749++] = class688.field9602.field8528.method677((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9763[field9749++] = class688.field9602.field8507.method1714((byte) -98) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9763[field9749++] = class688.field9602.field8499.method2227((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9763[field9749++] = class688.field9602.field8529.method4329((byte) -98);
                return;
            }
            if (arg0 == 6117) {
                field9763[field9749++] = class688.field9602.field8531.method2857((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9763[field9749++] = class688.field9602.field8548.method1981((byte) -98);
                return;
            }
            if (arg0 == 6119) {
                field9763[field9749++] = class688.field9602.field8505.method1981((byte) -98);
                return;
            }
            if (arg0 == 6120) {
                field9763[field9749++] = class688.field9602.field8496.method1981((byte) -98);
                return;
            }
            if (arg0 == 6123) {
                field9763[field9749++] = class400.method2458((byte) -12);
                return;
            }
            if (arg0 == 6124) {
                field9763[field9749++] = class688.field9602.field8540.method4329((byte) -98);
                return;
            }
            if (arg0 == 6125) {
                field9763[field9749++] = class688.field9602.field8516.method1707((byte) -98);
                return;
            }
            if (arg0 == 6127) {
                field9763[field9749++] = class688.field9602.field8544.method3925((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9763[field9749++] = class688.field9602.field8504.method1300((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9763[field9749++] = class688.field9602.field8501.method3773((byte) -98);
                return;
            }
            if (arg0 == 6130) {
                field9763[field9749++] = class688.field9602.field8551.method3429((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9763[field9749++] = class688.field9602.field8517.method2604((byte) -98);
                return;
            }
            if (arg0 == 6132) {
                field9763[field9749++] = class688.field9602.field8510.method2604((byte) -98);
                return;
            }
            if (arg0 == 6133) {
                field9763[field9749++] = class129.field1674.field10576 && !class129.field1674.field10561 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field9763[field9749++] = class688.field9602.field8502.method1189((byte) -98);
                return;
            }
            if (arg0 == 6136) {
                field9763[field9749++] = class688.field9602.field8506.method1732((byte) -98) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9763[field9749++] = class778.method4286(200, (byte) 97, class688.field9602.field8517.method2604((byte) -98));
                return;
            }
            if (arg0 == 6139) {
                field9763[field9749++] = class688.field9602.field8523.method1283((byte) -98);
                return;
            }
            if (arg0 == 6142) {
                field9763[field9749++] = class688.field9602.field8535.method1981((byte) -98);
                return;
            }
            if (arg0 == 6143) {
                field9763[field9749++] = class688.field9602.field8521.method1981((byte) -98);
                return;
            }
            if (arg0 == 6144) {
                field9763[field9749++] = class6.field38 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9763[field9749++] = class688.field9602.field8537.method1330((byte) -98);
                return;
            }
            if (arg0 == 6146) {
                field9763[field9749++] = class688.field9602.field8545.method4143((byte) -98);
                return;
            }
            if (arg0 == 6147) {
                field9763[field9749++] = class495.field6813.field6744 < 512 || class6.field38 || class365.field5257 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field9763[field9749++] = class45.field475 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9749 -= 2;
                class13.field76 = (short) field9763[field9749];
                if (class13.field76 <= 0) {
                    class13.field76 = 256;
                }
                class640.field9003 = (short) field9763[field9749 + 1];
                if (class640.field9003 <= 0) {
                    class640.field9003 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9749 -= 2;
                class542.field7490 = (short) field9763[field9749];
                if (class542.field7490 <= 0) {
                    class542.field7490 = 256;
                }
                class183.field2294 = (short) field9763[field9749 + 1];
                if (class183.field2294 <= 0) {
                    class183.field2294 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9749 -= 4;
                class309.field4456 = (short) field9763[field9749];
                if (class309.field4456 <= 0) {
                    class309.field4456 = 1;
                }
                class559.field7863 = (short) field9763[field9749 + 1];
                if (class559.field7863 <= 0) {
                    class559.field7863 = 32767;
                } else if (class559.field7863 < class309.field4456) {
                    class559.field7863 = class309.field4456;
                }
                class146.field1885 = (short) field9763[field9749 + 2];
                if (class146.field1885 <= 0) {
                    class146.field1885 = 1;
                }
                class357.field5144 = (short) field9763[field9749 + 3];
                if (class357.field5144 <= 0) {
                    class357.field5144 = 32767;
                    return;
                }
                if (class357.field5144 < class146.field1885) {
                    class357.field5144 = class146.field1885;
                }
                return;
            }
            if (arg0 == 6203) {
                class235.method1606((byte) -113, false, class53.field643.field1560, 0, class53.field643.field1517, 0);
                field9763[field9749++] = class492.field6786;
                field9763[field9749++] = class576.field8099;
                return;
            }
            if (arg0 == 6204) {
                field9763[field9749++] = class542.field7490;
                field9763[field9749++] = class183.field2294;
                return;
            }
            if (arg0 == 6205) {
                field9763[field9749++] = class13.field76;
                field9763[field9749++] = class640.field9003;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9763[field9749++] = (int) (class683.method3903((byte) 4) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9763[field9749++] = (int) (class683.method3903((byte) 4) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9749 -= 3;
                int var231 = field9763[field9749];
                int var232 = field9763[field9749 + 1];
                int var233 = field9763[field9749 + 2];
                long var234 = class50.method423(var233, 12, 0, var231, var232, 0, 0);
                int var236 = class332.method2107((byte) -113, var234);
                if (var233 < 1970) {
                    var236--;
                }
                field9763[field9749++] = var236;
                return;
            }
            if (arg0 == 6303) {
                field9763[field9749++] = class33.method278(class683.method3903((byte) 4), false);
                return;
            }
            if (arg0 == 6304) {
                int var237 = field9763[--field9749];
                boolean var238 = true;
                if (var237 < 0) {
                    var238 = (var237 + 1) % 4 == 0;
                } else if (var237 < 1582) {
                    var238 = var237 % 4 == 0;
                } else if (var237 % 4 != 0) {
                    var238 = false;
                } else if (var237 % 100 != 0) {
                    var238 = true;
                } else if (var237 % 400 != 0) {
                    var238 = false;
                }
                field9763[field9749++] = var238 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var239 = field9763[--field9749];
                int[] var240 = class657.method3766(var239, (byte) -127);
                class335.method2124(var240, 0, field9763, field9749, 3);
                field9749 += 3;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9763[field9749++] = class615.method3551(1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9763[field9749++] = class309.method2000(1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class664.field9331 == 7 && class567.field7992 == 0 && class785.field10773 == 0) {
                    if (class77.field860) {
                        field9763[field9749++] = 0;
                        return;
                    }
                    if (class400.field5648 > class683.method3903((byte) 4) - 1000L) {
                        field9763[field9749++] = 1;
                        return;
                    }
                    class77.field860 = true;
                    class116 var241 = class248.method1672(class84.field1023, class261.field3822, -20647);
                    var241.field1575.method3003(class187.field2337, -23061);
                    class443.method2655(0, var241);
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class138 var242 = class542.method3212(-1);
                if (var242 != null) {
                    field9763[field9749++] = var242.field1767;
                    field9763[field9749++] = var242.field2275;
                    field9761[field9745++] = var242.field1765;
                    class410 var243 = var242.method925(120);
                    field9763[field9749++] = var243.field5757;
                    field9761[field9745++] = var243.field5756;
                    field9763[field9749++] = var242.field2280;
                    field9763[field9749++] = var242.field1763;
                    field9761[field9745++] = var242.field1768;
                    return;
                }
                field9763[field9749++] = -1;
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 6502) {
                class138 var244 = class688.method3911(110);
                if (var244 != null) {
                    field9763[field9749++] = var244.field1767;
                    field9763[field9749++] = var244.field2275;
                    field9761[field9745++] = var244.field1765;
                    class410 var245 = var244.method925(-84);
                    field9763[field9749++] = var245.field5757;
                    field9761[field9745++] = var245.field5756;
                    field9763[field9749++] = var244.field2280;
                    field9763[field9749++] = var244.field1763;
                    field9761[field9745++] = var244.field1768;
                    return;
                }
                field9763[field9749++] = -1;
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var246 = field9763[--field9749];
                String var247 = field9761[--field9745];
                if (class664.field9331 == 7 && class567.field7992 == 0 && class785.field10773 == 0) {
                    field9763[field9749++] = class535.method3180(var247, -101, var246) ? 1 : 0;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var248 = field9763[--field9749];
                class138 var249 = class719.method4016(var248, 2570);
                if (var249 != null) {
                    field9763[field9749++] = var249.field2275;
                    field9761[field9745++] = var249.field1765;
                    class410 var250 = var249.method925(118);
                    field9763[field9749++] = var250.field5757;
                    field9761[field9745++] = var250.field5756;
                    field9763[field9749++] = var249.field2280;
                    field9763[field9749++] = var249.field1763;
                    field9761[field9745++] = var249.field1768;
                    return;
                }
                field9763[field9749++] = -1;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                field9763[field9749++] = 0;
                field9763[field9749++] = 0;
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9749 -= 4;
                int var251 = field9763[field9749];
                boolean var252 = field9763[field9749 + 1] == 1;
                int var253 = field9763[field9749 + 2];
                boolean var254 = field9763[field9749 + 3] == 1;
                class295.method1940(var254, var252, var251, var253, (byte) -52);
                return;
            }
            if (arg0 == 6508) {
                class631.method3621((byte) 108);
                return;
            }
            if (arg0 == 6509) {
                if (class664.field9331 != 7) {
                    return;
                }
                class201.field2824 = field9763[--field9749] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9763[field9749++] = class291.field4283;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class53.field644 == class521.field7192) {
                if (arg0 == 6700) {
                    int var255 = class278.field3993.method3664(0);
                    if (class610.field8597 != -1) {
                        var255++;
                    }
                    field9763[field9749++] = var255;
                    return;
                }
                if (arg0 == 6701) {
                    int var256 = field9763[--field9749];
                    if (class610.field8597 != -1) {
                        if (var256 == 0) {
                            field9763[field9749++] = class610.field8597;
                            return;
                        }
                        var256--;
                    }
                    class610 var257 = (class610) class278.field3993.method3668(-97);
                    while (var256-- > 0) {
                        var257 = (class610) class278.field3993.method3667((byte) -126);
                    }
                    field9763[field9749++] = var257.field8600;
                    return;
                }
                if (arg0 == 6702) {
                    int var258 = field9763[--field9749];
                    if (class609.field8594[var258] == null) {
                        field9761[field9745++] = "";
                        return;
                    }
                    String var259 = class609.field8594[var258][0].field1533;
                    if (var259 == null) {
                        field9761[field9745++] = "";
                        return;
                    }
                    field9761[field9745++] = var259.substring(0, var259.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var260 = field9763[--field9749];
                    if (class609.field8594[var260] == null) {
                        field9763[field9749++] = 0;
                        return;
                    }
                    field9763[field9749++] = class609.field8594[var260].length;
                    return;
                }
                if (arg0 == 6704) {
                    field9749 -= 2;
                    int var261 = field9763[field9749];
                    int var262 = field9763[field9749 + 1];
                    if (class609.field8594[var261] == null) {
                        field9761[field9745++] = "";
                        return;
                    }
                    String var263 = class609.field8594[var261][var262].field1533;
                    if (var263 == null) {
                        field9761[field9745++] = "";
                        return;
                    }
                    field9761[field9745++] = var263;
                    return;
                }
                if (arg0 == 6705) {
                    field9749 -= 2;
                    int var264 = field9763[field9749];
                    int var265 = field9763[field9749 + 1];
                    if (class609.field8594[var264] == null) {
                        field9763[field9749++] = 0;
                        return;
                    }
                    field9763[field9749++] = class609.field8594[var264][var265].field1464;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field9749 -= 3;
                    int var266 = field9763[field9749];
                    int var267 = field9763[field9749 + 1];
                    int var268 = field9763[field9749 + 2];
                    class212.method1331(var268, var266 << 16 | var267, "", -99, 1);
                    return;
                }
                if (arg0 == 6708) {
                    field9749 -= 3;
                    int var269 = field9763[field9749];
                    int var270 = field9763[field9749 + 1];
                    int var271 = field9763[field9749 + 2];
                    class212.method1331(var271, var269 << 16 | var270, "", -99, 2);
                    return;
                }
                if (arg0 == 6709) {
                    field9749 -= 3;
                    int var272 = field9763[field9749];
                    int var273 = field9763[field9749 + 1];
                    int var274 = field9763[field9749 + 2];
                    class212.method1331(var274, var272 << 16 | var273, "", -99, 3);
                    return;
                }
                if (arg0 == 6710) {
                    field9749 -= 3;
                    int var275 = field9763[field9749];
                    int var276 = field9763[field9749 + 1];
                    int var277 = field9763[field9749 + 2];
                    class212.method1331(var277, var275 << 16 | var276, "", -99, 4);
                    return;
                }
                if (arg0 == 6711) {
                    field9749 -= 3;
                    int var278 = field9763[field9749];
                    int var279 = field9763[field9749 + 1];
                    int var280 = field9763[field9749 + 2];
                    class212.method1331(var280, var278 << 16 | var279, "", -99, 5);
                    return;
                }
                if (arg0 == 6712) {
                    field9749 -= 3;
                    int var281 = field9763[field9749];
                    int var282 = field9763[field9749 + 1];
                    int var283 = field9763[field9749 + 2];
                    class212.method1331(var283, var281 << 16 | var282, "", -99, 6);
                    return;
                }
                if (arg0 == 6713) {
                    field9749 -= 3;
                    int var284 = field9763[field9749];
                    int var285 = field9763[field9749 + 1];
                    int var286 = field9763[field9749 + 2];
                    class212.method1331(var286, var284 << 16 | var285, "", -99, 7);
                    return;
                }
                if (arg0 == 6714) {
                    field9749 -= 3;
                    int var287 = field9763[field9749];
                    int var288 = field9763[field9749 + 1];
                    int var289 = field9763[field9749 + 2];
                    class212.method1331(var289, var287 << 16 | var288, "", -99, 8);
                    return;
                }
                if (arg0 == 6715) {
                    field9749 -= 3;
                    int var290 = field9763[field9749];
                    int var291 = field9763[field9749 + 1];
                    int var292 = field9763[field9749 + 2];
                    class212.method1331(var292, var290 << 16 | var291, "", -99, 9);
                    return;
                }
                if (arg0 == 6716) {
                    field9749 -= 3;
                    int var293 = field9763[field9749];
                    int var294 = field9763[field9749 + 1];
                    int var295 = field9763[field9749 + 2];
                    class212.method1331(var295, var293 << 16 | var294, "", -99, 10);
                    return;
                }
                if (arg0 == 6717) {
                    field9749 -= 3;
                    int var296 = field9763[field9749];
                    int var297 = field9763[field9749 + 1];
                    int var298 = field9763[field9749 + 2];
                    class115 var299 = class446.method2705(var296 << 16 | var297, -104, var298);
                    class76.method561(-1);
                    class174 var300 = client.method779(var299);
                    class646.method3700(5, var299, var300.field2203, var300.method1112((byte) 102));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var301 = field9763[--field9749];
                    class547 var302 = class657.field9274.method514(var301, (byte) 68);
                    if (var302.field7597 == null) {
                        field9761[field9745++] = "";
                        return;
                    }
                    field9761[field9745++] = var302.field7597;
                    return;
                }
                if (arg0 == 6801) {
                    int var303 = field9763[--field9749];
                    class547 var304 = class657.field9274.method514(var303, (byte) 87);
                    field9763[field9749++] = var304.field7634;
                    return;
                }
                if (arg0 == 6802) {
                    int var305 = field9763[--field9749];
                    class547 var306 = class657.field9274.method514(var305, (byte) -47);
                    field9763[field9749++] = var306.field7631;
                    return;
                }
                if (arg0 == 6803) {
                    int var307 = field9763[--field9749];
                    class547 var308 = class657.field9274.method514(var307, (byte) 112);
                    field9763[field9749++] = var308.field7604;
                    return;
                }
                if (arg0 == 6804) {
                    field9749 -= 2;
                    int var309 = field9763[field9749];
                    int var310 = field9763[field9749 + 1];
                    class771 var311 = class734.field10126.method709((byte) 119, var310);
                    if (var311.method4253((byte) -83)) {
                        field9761[field9745++] = class657.field9274.method514(var309, (byte) 101).method3240(var310, var311.field10604, (byte) 86);
                        return;
                    }
                    field9763[field9749++] = class657.field9274.method514(var309, (byte) 73).method3243(var310, -2, var311.field10602);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field9763[field9749++] = class19.field127 && !class84.field1021 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field9763[field9749++] = (int) (class703.field9794 / 60000L);
                    field9763[field9749++] = (int) ((class703.field9794 - class683.method3903((byte) 4) - class777.field10691) / 60000L);
                    field9763[field9749++] = class345.field5011 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field9763[field9749++] = class134.field1720;
                    return;
                }
                if (arg0 == 6903) {
                    field9763[field9749++] = class108.field1283;
                    return;
                }
                if (arg0 == 6904) {
                    field9763[field9749++] = class223.field3146;
                    return;
                }
                if (arg0 == 6905) {
                    String var312 = "";
                    if (class531.field7317 != null) {
                        if (class531.field7317.field4975 == null) {
                            var312 = class632.method3623(class531.field7317.field4969, true);
                        } else {
                            var312 = (String) class531.field7317.field4975;
                        }
                    }
                    field9761[field9745++] = var312;
                    return;
                }
                if (arg0 == 6906) {
                    field9763[field9749++] = class397.field5629;
                    return;
                }
                if (arg0 == 6907) {
                    field9763[field9749++] = class271.field3916;
                    return;
                }
                if (arg0 == 6908) {
                    field9763[field9749++] = class456.field6382;
                    return;
                }
                if (arg0 == 6909) {
                    field9763[field9749++] = class747.field10316 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field9763[field9749++] = class531.field7313;
                    return;
                }
                if (arg0 == 6911) {
                    field9763[field9749++] = class507.field6885;
                    return;
                }
                if (arg0 == 6912) {
                    field9763[field9749++] = class187.field2335;
                    return;
                }
                if (arg0 == 6913) {
                    field9763[field9749++] = class537.field7425;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var313 = class216.method1345(24722);
                    field9763[field9749++] = class590.field8314 = class688.field9602.field8517.method2604((byte) -98);
                    field9763[field9749++] = var313;
                    class351.method2213(3);
                    class266.method1738(73);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class464.method2786(-87);
                    class351.method2213(3);
                    class266.method1738(98);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class50.method418((byte) -28);
                    class351.method2213(3);
                    class266.method1738(77);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class637.method3660(-48);
                    class351.method2213(3);
                    class266.method1738(-61);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class81.method582(true, (byte) 117);
                    class351.method2213(3);
                    class266.method1738(-119);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class688.field9602.method3503(class688.field9602.field8553, -124, 0);
                    class266.method1738(127);
                    class106.field1247 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class590.field8314 == 2) {
                        class695.field9696 = true;
                        return;
                    }
                    if (class590.field8314 == 1) {
                        class292.field4299 = true;
                        return;
                    }
                    if (class590.field8314 == 3) {
                        class559.field7878 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field9763[field9749++] = class688.field9602.field8553.method2538((byte) -98);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field9749 -= 2;
                    int var314 = field9763[field9749];
                    int var315 = field9763[field9749 + 1];
                    if (var314 != -1) {
                        if (var315 > 255) {
                            var315 = 255;
                        } else if (var315 < 0) {
                            var315 = 0;
                        }
                        class328.method2069(var314, false, -95, var315);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var316 = field9763[--field9749];
                    if (var316 != -1) {
                        class128.method878(var316, -1805);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var317 = field9763[--field9749];
                    if (var317 != -1) {
                        class464.method2788(2324, var317);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field9763[field9749++] = class492.method2907(true, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field9763[field9749++] = class688.field9602.field8508.method485(-108) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field9763[field9749++] = class688.field9602.field8547.method3387(35) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field9763[field9749++] = class688.field9602.field8538.method2311(-100) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field9763[field9749++] = class688.field9602.field8507.method1713(-84) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field9763[field9749++] = class688.field9602.field8540.method4327(73) && class111.field1332.method161() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field9763[field9749++] = class688.field9602.field8541.method2385(-100) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field9763[field9749++] = class688.field9602.field8516.method1708(-127) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field9763[field9749++] = class688.field9602.field8544.method3923(62) && class111.field1332.method223() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field9763[field9749++] = class688.field9602.field8551.method3428(89) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field9763[field9749++] = class688.field9602.field8506.method1728(82) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field9763[field9749++] = class688.field9602.field8523.method1282(-117) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field9763[field9749++] = class688.field9602.field8499.method2228(86) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field9763[field9749++] = class688.field9602.field8545.method4142(54) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field9763[field9749++] = class688.field9602.field8510.method2606(-93) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var318 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8508.method487(var318, -120);
                    return;
                }
                if (arg0 == 7302) {
                    int var319 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8547.method487(var319, 43);
                    return;
                }
                if (arg0 == 7303) {
                    int var320 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8538.method487(var320, -127);
                    return;
                }
                if (arg0 == 7304) {
                    int var321 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8507.method487(var321, 21);
                    return;
                }
                if (arg0 == 7305) {
                    int var322 = field9763[--field9749];
                    if (!class111.field1332.method161()) {
                        field9763[field9749++] = 3;
                        return;
                    }
                    field9763[field9749++] = class688.field9602.field8540.method487(var322, 90);
                    return;
                }
                if (arg0 == 7306) {
                    int var323 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8541.method487(var323, -118);
                    return;
                }
                if (arg0 == 7307) {
                    int var324 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8516.method487(var324, 120);
                    return;
                }
                if (arg0 == 7308) {
                    int var325 = field9763[--field9749];
                    if (!class111.field1332.method223()) {
                        field9763[field9749++] = 3;
                        return;
                    }
                    field9763[field9749++] = class688.field9602.field8544.method487(var325, -123);
                    return;
                }
                if (arg0 == 7309) {
                    int var326 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8551.method487(var326, 109);
                    return;
                }
                if (arg0 == 7310) {
                    int var327 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8506.method487(var327, -125);
                    return;
                }
                if (arg0 == 7311) {
                    int var328 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8523.method487(var328, 98);
                    return;
                }
                if (arg0 == 7312) {
                    int var329 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8499.method487(var329, 6);
                    return;
                }
                if (arg0 == 7313) {
                    int var330 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8545.method487(var330, -121);
                    return;
                }
                if (arg0 == 7314) {
                    int var331 = field9763[--field9749];
                    field9763[field9749++] = class688.field9602.field8510.method487(var331, -128);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)J", line = 3790)
    private static final long method3949(int arg0) {
        Long var1 = field9755.method402(1, class327.field4603.field10814 << 16 | arg0);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "()V", line = 3801)
    public static void method3950() {
        field9747 = null;
        field9768 = null;
        field9740 = null;
        field9738 = null;
        field9750 = null;
        field9763 = null;
        field9761 = null;
        field9757 = null;
        field9744 = null;
        field9739 = null;
        field9759 = null;
        field9753 = null;
        field9755 = null;
        field9765 = null;
        field9752 = null;
        field9741 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I", line = 3821)
    private static final int method3951(int arg0) {
        class268 var1 = class326.field4583.method1350(54, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field9755.method391(124, class327.field4603.field10814 << 16 | arg0);
        if (var2 == null) {
            return var1.field3880 == 'i' || var1.field3880 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V", line = 3846)
    public static final void method3952(int arg0) {
        if (arg0 == -1 || !class718.method4015(arg0, 104)) {
            return;
        }
        class115[] var1 = class609.field8594[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class115 var3 = var1[var2];
            if (var3.field1426 != null) {
                class114 var4 = new class114();
                var4.field1378 = var3;
                var4.field1384 = var3.field1426;
                method3956(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V", line = 3879)
    private static final void method3953(int arg0) {
        class115 var1 = class384.method2387(false, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class115[] var3 = class558.field7840[var2];
        if (var3 == null) {
            class115[] var4 = class609.field8594[var2];
            int var5 = var4.length;
            var3 = class558.field7840[var2] = new class115[var5];
            class335.method2123(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class335.method2123(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lraa;I)V", line = 3921)
    private static final void method3954(class508 arg0, int arg1) {
        field9749 = 0;
        field9745 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6888;
        int[] var4 = arg0.field6889;
        byte var5 = -1;
        field9754 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method3963(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method3948(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field9763[field9749++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field9763[field9749++] = class173.field2192.field8128[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class173.field2192.method3390(field9763[--field9749], var8, -17823);
                } else if (var45 == 3) {
                    field9761[field9745++] = arg0.field6890[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field9749 -= 2;
                    if (field9763[field9749 + 1] != field9763[field9749]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field9749 -= 2;
                    if (field9763[field9749 + 1] == field9763[field9749]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field9749 -= 2;
                    if (field9763[field9749] < field9763[field9749 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field9749 -= 2;
                    if (field9763[field9749] > field9763[field9749 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field9754 == 0) {
                        return;
                    }
                    class68 var9 = field9744[--field9754];
                    arg0 = var9.field746;
                    var3 = arg0.field6888;
                    var4 = arg0.field6889;
                    var2 = var9.field758;
                    field9747 = var9.field745;
                    field9768 = var9.field747;
                    field9740 = var9.field749;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field9763[field9749++] = class173.field2192.method3398(var10, 0);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class173.field2192.method3395(field9763[--field9749], var11, true);
                } else if (var45 == 31) {
                    field9749 -= 2;
                    if (field9763[field9749] <= field9763[field9749 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field9749 -= 2;
                    if (field9763[field9749] >= field9763[field9749 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field9763[field9749++] = field9747[var4[var2]];
                } else if (var45 == 34) {
                    field9747[var4[var2]] = field9763[--field9749];
                } else if (var45 == 35) {
                    field9761[field9745++] = field9768[var4[var2]];
                } else if (var45 == 36) {
                    field9768[var4[var2]] = field9761[--field9745];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field9745 -= var12;
                    String var13 = class1.method2(field9761, field9745, var12, (byte) -13);
                    field9761[field9745++] = var13;
                } else if (var45 == 38) {
                    field9749--;
                } else if (var45 == 39) {
                    field9745--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class508 var15 = class537.method3191(-2, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6896];
                    String[] var17 = new String[var15.field6895];
                    long[] var18 = new long[var15.field6899];
                    for (int var19 = 0; var19 < var15.field6894; var19++) {
                        var16[var19] = field9763[field9749 + var19 - var15.field6894];
                    }
                    for (int var20 = 0; var20 < var15.field6891; var20++) {
                        var17[var20] = field9761[field9745 + var20 - var15.field6891];
                    }
                    for (int var21 = 0; var21 < var15.field6892; var21++) {
                        var18[var21] = field9757[field9746 + var21 - var15.field6892];
                    }
                    field9749 -= var15.field6894;
                    field9745 -= var15.field6891;
                    field9746 -= var15.field6892;
                    class68 var22 = new class68();
                    var22.field746 = arg0;
                    var22.field758 = var2;
                    var22.field745 = field9747;
                    var22.field747 = field9768;
                    var22.field749 = field9740;
                    if (field9754 >= field9744.length) {
                        throw new RuntimeException();
                    }
                    field9744[field9754++] = var22;
                    arg0 = var15;
                    var3 = var15.field6888;
                    var4 = var15.field6889;
                    var2 = -1;
                    field9747 = var16;
                    field9768 = var17;
                    field9740 = var18;
                } else if (var45 == 42) {
                    field9763[field9749++] = class170.field2162[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class170.field2162[var23] = field9763[--field9749];
                    class202.method1302(var23, false);
                    class489.field6728 |= class583.field8250[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field9763[--field9749];
                    if (var26 >= 0 && var26 <= 5000) {
                        field9738[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field9750[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field9763[--field9749];
                    if (var30 < 0 || var30 >= field9738[var29]) {
                        throw new RuntimeException();
                    }
                    field9763[field9749++] = field9750[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field9749 -= 2;
                    int var32 = field9763[field9749];
                    if (var32 < 0 || var32 >= field9738[var31]) {
                        throw new RuntimeException();
                    }
                    field9750[var31][var32] = field9763[field9749 + 1];
                } else if (var45 == 47) {
                    String var33 = class616.field8646[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field9761[field9745++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class616.field8646[var34] = field9761[--field9745];
                    class371.method2309((byte) -117, var34);
                } else if (var45 == 51) {
                    class638 var35 = arg0.field6893[var4[var2]];
                    class324 var36 = (class324) var35.method3669(false, (long) field9763[--field9749]);
                    if (var36 != null) {
                        var2 += var36.field4575;
                    }
                } else if (var45 == 54) {
                    field9757[field9746++] = arg0.field6898[var2];
                } else if (var45 == 55) {
                    field9746--;
                } else if (var45 == 66) {
                    field9757[field9746++] = field9740[var4[var2]];
                } else if (var45 == 67) {
                    field9740[var4[var2]] = field9757[--field9746];
                } else if (var45 == 68) {
                    field9746 -= 2;
                    if (field9757[field9746 + 1] != field9757[field9746]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field9746 -= 2;
                    if (field9757[field9746 + 1] == field9757[field9746]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field9746 -= 2;
                    if (field9757[field9746] < field9757[field9746 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field9746 -= 2;
                    if (field9757[field9746] > field9757[field9746 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field9746 -= 2;
                    if (field9757[field9746] <= field9757[field9746 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field9746 -= 2;
                    if (field9757[field9746] >= field9757[field9746 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field9763[--field9749] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field9763[--field9749] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field9763[field9749++] = method3951(var4[var2]);
                } else if (var45 == 113) {
                    field9763[field9749++] = method3964(var4[var2]);
                } else if (var45 == 114) {
                    field9757[field9746++] = method3949(var4[var2]);
                } else if (var45 == 115) {
                    field9761[field9745++] = method3960(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field6897 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field762).append(" ");
                for (int var43 = field9754 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field9744[var43].field746.field762).append(" ");
                }
                var42.append("op: ").append(var5);
                class502.method2937(var44, (byte) 70, var42.toString());
            } else {
                class128.method876(4, (byte) 118, "Clientscript error in: " + arg0.field6897);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field6897).append("\n");
                for (int var40 = field9754 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field9744[var40].field746.field6897).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class502.method2937(var44, (byte) -117, var39.toString());
                class629.method3616(false, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(C)I", line = 4496)
    private static final int method3955(char arg0) {
        return class260.method1716(arg0, (byte) 127) ? 1 : 0;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lso;I)V", line = 4500)
    private static final void method3956(class114 arg0, int arg1) {
        Object[] var2 = arg0.field1384;
        int var3 = (Integer) var2[0];
        class508 var4 = class537.method3191(-2, var3);
        if (var4 == null) {
            return;
        }
        field9747 = new int[var4.field6896];
        int var5 = 0;
        field9768 = new String[var4.field6895];
        int var6 = 0;
        field9740 = new long[var4.field6899];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field1383;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field1372;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field1378 == null ? -1 : arg0.field1378.field1446;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field1374;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field1378 == null ? -1 : arg0.field1378.field1482;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field1376 == null ? -1 : arg0.field1376.field1446;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field1376 == null ? -1 : arg0.field1376.field1482;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field1379;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field1380;
                }
                field9747[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field1381;
                }
                field9768[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field9740[var7++] = var11;
            }
        }
        field9769 = arg0.field1377;
        method3954(var4, arg1);
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(IZ)V", line = 4597)
    public static final void method3957(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lul;II)V", line = 4604)
    public static final void method3958(class486 arg0, int arg1, int arg2) {
        class508 var3 = class174.method1111(arg0, arg2, false, arg1);
        if (var3 == null) {
            return;
        }
        field9747 = new int[var3.field6896];
        field9768 = new String[var3.field6895];
        if (class253.field3760 == var3.field6900 || class708.field9831 == var3.field6900 || class423.field5877 == var3.field6900) {
            int var4 = 0;
            int var5 = 0;
            if (class378.field5431 != null) {
                var4 = class378.field5431.field1408;
                var5 = class378.field5431.field1503;
            }
            field9747[0] = class205.field2881.method354((byte) -20) - var4;
            field9747[1] = class205.field2881.method351(-25269) - var5;
        }
        method3954(var3, 200000);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lso;)V", line = 4632)
    public static final void method3959(class114 arg0) {
        method3956(arg0, 200000);
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)Ljava/lang/String;", line = 4637)
    private static final String method3960(int arg0) {
        String var1 = field9755.method409(class327.field4603.field10814 << 16 | arg0, (byte) 20);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "()V", line = 4645)
    public static final void method3961() {
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4650)
    private static final void method3962(String arg0, int arg1) {
        if (class597.field8370 == 0 && !(!class19.field127 || class84.field1021) || class780.field10724) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class712.field9900.method3999(0, (byte) -53))) {
            var3 = 0;
            arg0 = arg0.substring(class712.field9900.method3999(0, (byte) -23).length());
        } else if (var2.startsWith(class712.field9901.method3999(0, (byte) -65))) {
            var3 = 1;
            arg0 = arg0.substring(class712.field9901.method3999(0, (byte) -28).length());
        } else if (var2.startsWith(class712.field9902.method3999(0, (byte) -121))) {
            var3 = 2;
            arg0 = arg0.substring(class712.field9902.method3999(0, (byte) -54).length());
        } else if (var2.startsWith(class712.field9903.method3999(0, (byte) -22))) {
            var3 = 3;
            arg0 = arg0.substring(class712.field9903.method3999(0, (byte) -73).length());
        } else if (var2.startsWith(class712.field9904.method3999(0, (byte) -65))) {
            var3 = 4;
            arg0 = arg0.substring(class712.field9904.method3999(0, (byte) -61).length());
        } else if (var2.startsWith(class712.field9905.method3999(0, (byte) -69))) {
            var3 = 5;
            arg0 = arg0.substring(class712.field9905.method3999(0, (byte) -98).length());
        } else if (var2.startsWith(class712.field9906.method3999(0, (byte) -56))) {
            var3 = 6;
            arg0 = arg0.substring(class712.field9906.method3999(0, (byte) -43).length());
        } else if (var2.startsWith(class712.field9907.method3999(0, (byte) -102))) {
            var3 = 7;
            arg0 = arg0.substring(class712.field9907.method3999(0, (byte) -125).length());
        } else if (var2.startsWith(class712.field9908.method3999(0, (byte) -40))) {
            var3 = 8;
            arg0 = arg0.substring(class712.field9908.method3999(0, (byte) -64).length());
        } else if (var2.startsWith(class712.field9909.method3999(0, (byte) -17))) {
            var3 = 9;
            arg0 = arg0.substring(class712.field9909.method3999(0, (byte) -106).length());
        } else if (var2.startsWith(class712.field9910.method3999(0, (byte) -60))) {
            var3 = 10;
            arg0 = arg0.substring(class712.field9910.method3999(0, (byte) -61).length());
        } else if (var2.startsWith(class712.field9911.method3999(0, (byte) -53))) {
            var3 = 11;
            arg0 = arg0.substring(class712.field9911.method3999(0, (byte) -116).length());
        } else if (class553.field7667 != 0) {
            if (var2.startsWith(class712.field9900.method3999(class553.field7667, (byte) -74))) {
                var3 = 0;
                arg0 = arg0.substring(class712.field9900.method3999(class553.field7667, (byte) -87).length());
            } else if (var2.startsWith(class712.field9901.method3999(class553.field7667, (byte) -56))) {
                var3 = 1;
                arg0 = arg0.substring(class712.field9901.method3999(class553.field7667, (byte) -39).length());
            } else if (var2.startsWith(class712.field9902.method3999(class553.field7667, (byte) -127))) {
                var3 = 2;
                arg0 = arg0.substring(class712.field9902.method3999(class553.field7667, (byte) -128).length());
            } else if (var2.startsWith(class712.field9903.method3999(class553.field7667, (byte) -31))) {
                var3 = 3;
                arg0 = arg0.substring(class712.field9903.method3999(class553.field7667, (byte) -82).length());
            } else if (var2.startsWith(class712.field9904.method3999(class553.field7667, (byte) -27))) {
                var3 = 4;
                arg0 = arg0.substring(class712.field9904.method3999(class553.field7667, (byte) -24).length());
            } else if (var2.startsWith(class712.field9905.method3999(class553.field7667, (byte) -47))) {
                var3 = 5;
                arg0 = arg0.substring(class712.field9905.method3999(class553.field7667, (byte) -61).length());
            } else if (var2.startsWith(class712.field9906.method3999(class553.field7667, (byte) -111))) {
                var3 = 6;
                arg0 = arg0.substring(class712.field9906.method3999(class553.field7667, (byte) -111).length());
            } else if (var2.startsWith(class712.field9907.method3999(class553.field7667, (byte) -99))) {
                var3 = 7;
                arg0 = arg0.substring(class712.field9907.method3999(class553.field7667, (byte) -61).length());
            } else if (var2.startsWith(class712.field9908.method3999(class553.field7667, (byte) -21))) {
                var3 = 8;
                arg0 = arg0.substring(class712.field9908.method3999(class553.field7667, (byte) -63).length());
            } else if (var2.startsWith(class712.field9909.method3999(class553.field7667, (byte) -47))) {
                var3 = 9;
                arg0 = arg0.substring(class712.field9909.method3999(class553.field7667, (byte) -118).length());
            } else if (var2.startsWith(class712.field9910.method3999(class553.field7667, (byte) -96))) {
                var3 = 10;
                arg0 = arg0.substring(class712.field9910.method3999(class553.field7667, (byte) -121).length());
            } else if (var2.startsWith(class712.field9911.method3999(class553.field7667, (byte) -53))) {
                var3 = 11;
                arg0 = arg0.substring(class712.field9911.method3999(class553.field7667, (byte) -33).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class712.field9912.method3999(0, (byte) -20))) {
            var5 = 1;
            arg0 = arg0.substring(class712.field9912.method3999(0, (byte) -78).length());
        } else if (var4.startsWith(class712.field9913.method3999(0, (byte) -102))) {
            var5 = 2;
            arg0 = arg0.substring(class712.field9913.method3999(0, (byte) -94).length());
        } else if (var4.startsWith(class712.field9914.method3999(0, (byte) -119))) {
            var5 = 3;
            arg0 = arg0.substring(class712.field9914.method3999(0, (byte) -80).length());
        } else if (var4.startsWith(class712.field9915.method3999(0, (byte) -76))) {
            var5 = 4;
            arg0 = arg0.substring(class712.field9915.method3999(0, (byte) -108).length());
        } else if (var4.startsWith(class712.field9916.method3999(0, (byte) -88))) {
            var5 = 5;
            arg0 = arg0.substring(class712.field9916.method3999(0, (byte) -23).length());
        } else if (class553.field7667 != 0) {
            if (var4.startsWith(class712.field9912.method3999(class553.field7667, (byte) -87))) {
                var5 = 1;
                arg0 = arg0.substring(class712.field9912.method3999(class553.field7667, (byte) -119).length());
            } else if (var4.startsWith(class712.field9913.method3999(class553.field7667, (byte) -79))) {
                var5 = 2;
                arg0 = arg0.substring(class712.field9913.method3999(class553.field7667, (byte) -121).length());
            } else if (var4.startsWith(class712.field9914.method3999(class553.field7667, (byte) -84))) {
                var5 = 3;
                arg0 = arg0.substring(class712.field9914.method3999(class553.field7667, (byte) -98).length());
            } else if (var4.startsWith(class712.field9915.method3999(class553.field7667, (byte) -38))) {
                var5 = 4;
                arg0 = arg0.substring(class712.field9915.method3999(class553.field7667, (byte) -36).length());
            } else if (var4.startsWith(class712.field9916.method3999(class553.field7667, (byte) -69))) {
                var5 = 5;
                arg0 = arg0.substring(class712.field9916.method3999(class553.field7667, (byte) -54).length());
            }
        }
        field9756++;
        class116 var6 = class248.method1672(class84.field1023, class666.field9361, -20647);
        var6.field1575.method3005(255, 0);
        int var7 = var6.field1575.field6962;
        var6.field1575.method3005(255, var3);
        var6.field1575.method3005(255, var5);
        class382.method2381(var6.field1575, true, arg0);
        var6.field1575.method2985((byte) -57, var6.field1575.field6962 - var7);
        class443.method2655(0, var6);
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(IZ)V", line = 4920)
    private static final void method3963(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field9749 -= 3;
                int var2 = field9763[field9749];
                int var3 = field9763[field9749 + 1];
                int var4 = field9763[field9749 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class115 var5 = class384.method2387(false, var2);
                if (var5.field1394 == null) {
                    var5.field1394 = new class115[var4 + 1];
                }
                if (var5.field1394.length <= var4) {
                    class115[] var6 = new class115[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1394.length; var7++) {
                        var6[var7] = var5.field1394[var7];
                    }
                    var5.field1394 = var6;
                }
                if (var4 > 0 && var5.field1394[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class115 var8 = new class115();
                var8.field1564 = var3;
                var8.field1436 = var8.field1446 = var5.field1446;
                var8.field1482 = var4;
                var5.field1394[var4] = var8;
                if (arg1) {
                    field9759 = var8;
                } else {
                    field9739 = var8;
                }
                class43.method336(-1, var5);
                return;
            }
            if (arg0 == 151) {
                class115 var9 = arg1 ? field9759 : field9739;
                if (var9.field1482 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class115 var10 = class384.method2387(false, var9.field1446);
                var10.field1394[var9.field1482] = null;
                class43.method336(-1, var10);
                return;
            }
            if (arg0 == 152) {
                class115 var11 = class384.method2387(false, field9763[--field9749]);
                var11.field1394 = null;
                class43.method336(-1, var11);
                return;
            }
            if (arg0 == 200) {
                field9749 -= 2;
                int var12 = field9763[field9749];
                int var13 = field9763[field9749 + 1];
                class115 var14 = class446.method2705(var12, 112, var13);
                if (var14 != null && var13 != -1) {
                    field9763[field9749++] = 1;
                    if (arg1) {
                        field9759 = var14;
                        return;
                    }
                    field9739 = var14;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9763[--field9749];
                class115 var16 = class384.method2387(false, var15);
                if (var16 != null) {
                    field9763[field9749++] = 1;
                    if (arg1) {
                        field9759 = var16;
                        return;
                    }
                    field9739 = var16;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9763[--field9749];
                method3965(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9763[--field9749];
                method3953(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9749 -= 2;
                int var19 = field9763[field9749];
                int var20 = field9763[field9749 + 1];
                if (class724.field10031.field9993 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class295.field4322.length; var21++) {
                    if (class295.field4322[var21] == var19) {
                        class724.field10031.field9993.method1669(var20, false, var21, class15.field91);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class505.field6875.length; var22++) {
                    if (class505.field6875[var22] == var19) {
                        class724.field10031.field9993.method1669(var20, false, var22, class15.field91);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9749 -= 2;
                int var23 = field9763[field9749];
                int var24 = field9763[field9749 + 1];
                if (class724.field10031.field9993 == null) {
                    return;
                }
                class724.field10031.field9993.method1668(var23, var24, -127);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9763[--field9749] != 0;
                if (class724.field10031.field9993 == null) {
                    return;
                }
                class724.field10031.field9993.method1664((byte) 99, var25);
                return;
            }
            if (arg0 == 411) {
                field9749 -= 2;
                int var26 = field9763[field9749];
                int var27 = field9763[field9749 + 1];
                if (class724.field10031.field9993 == null) {
                    return;
                }
                class724.field10031.field9993.method1662((byte) 104, var27, class35.field367, var26);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class115 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class384.method2387(false, field9763[--field9749]);
            } else {
                var28 = arg1 ? field9759 : field9739;
            }
            if (arg0 == 1000) {
                field9749 -= 4;
                var28.field1432 = field9763[field9749];
                var28.field1493 = field9763[field9749 + 1];
                int var29 = field9763[field9749 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9763[field9749 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field1534 = (byte) var29;
                var28.field1540 = (byte) var30;
                class43.method336(-1, var28);
                class636.method3645(var28, (byte) 121);
                if (var28.field1482 == -1) {
                    class736.method4083(false, var28.field1446);
                }
                return;
            }
            if (arg0 == 1001) {
                field9749 -= 4;
                var28.field1532 = field9763[field9749];
                var28.field1470 = field9763[field9749 + 1];
                var28.field1508 = 0;
                var28.field1566 = 0;
                int var31 = field9763[field9749 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9763[field9749 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field1513 = (byte) var31;
                var28.field1568 = (byte) var32;
                class43.method336(-1, var28);
                class636.method3645(var28, (byte) 104);
                if (var28.field1564 == 0) {
                    class324.method2053((byte) -54, var28, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9763[--field9749] == 1;
                if (var28.field1489 != var33) {
                    var28.field1489 = var33;
                    class43.method336(-1, var28);
                }
                if (var28.field1482 == -1) {
                    class586.method3437(var28.field1446, (byte) 88);
                }
                return;
            }
            if (arg0 == 1004) {
                field9749 -= 2;
                var28.field1467 = field9763[field9749];
                var28.field1415 = field9763[field9749 + 1];
                class43.method336(-1, var28);
                class636.method3645(var28, (byte) 100);
                if (var28.field1564 == 0) {
                    class324.method2053((byte) 104, var28, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field1406 = field9763[--field9749] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class115 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class384.method2387(false, field9763[--field9749]);
            } else {
                var34 = arg1 ? field9759 : field9739;
            }
            if (arg0 == 1100) {
                field9749 -= 2;
                var34.field1559 = field9763[field9749];
                if (var34.field1559 > var34.field1511 - var34.field1560) {
                    var34.field1559 = var34.field1511 - var34.field1560;
                }
                if (var34.field1559 < 0) {
                    var34.field1559 = 0;
                }
                var34.field1495 = field9763[field9749 + 1];
                if (var34.field1495 > var34.field1422 - var34.field1517) {
                    var34.field1495 = var34.field1422 - var34.field1517;
                }
                if (var34.field1495 < 0) {
                    var34.field1495 = 0;
                }
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class779.method4291(var34.field1446, 0);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field1548 = field9763[--field9749];
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class692.method3924(var34.field1446, -40);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field1474 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field1431 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field1544 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9763[--field9749];
                if (var34.field1410 != var35) {
                    var34.field1410 = var35;
                    class43.method336(-1, var34);
                }
                if (var34.field1482 == -1) {
                    class230.method1532(117, var34.field1446);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field1457 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field1468 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field1479 = 1;
                var34.field1404 = field9763[--field9749];
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class576.method3374((byte) 87, var34.field1446);
                }
                return;
            }
            if (arg0 == 1109) {
                field9749 -= 6;
                var34.field1417 = field9763[field9749];
                var34.field1483 = field9763[field9749 + 1];
                var34.field1469 = field9763[field9749 + 2];
                var34.field1449 = field9763[field9749 + 3];
                var34.field1535 = field9763[field9749 + 4];
                var34.field1536 = field9763[field9749 + 5];
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class568.method3345(var34.field1446, -62);
                    class419.method2537(30, var34.field1446);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9763[--field9749];
                if (var34.field1411 != var36) {
                    var34.field1411 = var36;
                    var34.field1392 = 0;
                    var34.field1554 = 1;
                    var34.field1390 = 0;
                    class73 var37 = var34.field1411 == -1 ? null : class571.field8029.method3695(var34.field1411, (byte) -117);
                    if (var37 != null) {
                        class704.method3976(var34.field1392, var37, 1);
                    }
                    class43.method336(-1, var34);
                }
                if (var34.field1482 == -1) {
                    class329.method2073(29824, var34.field1446);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field1501 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9761[--field9745];
                if (!var38.equals(var34.field1546)) {
                    var34.field1546 = var38;
                    class43.method336(-1, var34);
                }
                if (var34.field1482 == -1) {
                    class731.method4069(var34.field1446, 54);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field1480 = field9763[--field9749];
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class170.method1094((byte) 114, var34.field1446);
                }
                return;
            }
            if (arg0 == 1114) {
                field9749 -= 3;
                var34.field1434 = field9763[field9749];
                var34.field1505 = field9763[field9749 + 1];
                var34.field1459 = field9763[field9749 + 2];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field1555 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field1557 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field1497 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field1552 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field1543 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1120) {
                field9749 -= 2;
                var34.field1511 = field9763[field9749];
                var34.field1422 = field9763[field9749 + 1];
                class43.method336(-1, var34);
                if (var34.field1564 == 0) {
                    class324.method2053((byte) 110, var34, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field1393 = field9763[--field9749] == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field1536 = field9763[--field9749];
                class43.method336(-1, var34);
                if (var34.field1482 == -1) {
                    class568.method3345(var34.field1446, -96);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9763[--field9749];
                var34.field1389 = var39 == 1;
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1125) {
                field9749 -= 2;
                var34.field1516 = field9763[field9749];
                var34.field1561 = field9763[field9749 + 1];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field1448 = field9763[--field9749];
                class43.method336(-1, var34);
                return;
            }
            if (arg0 == 1127) {
                field9749 -= 2;
                int var40 = field9763[field9749];
                int var41 = field9763[field9749 + 1];
                class771 var42 = class734.field10126.method709((byte) 127, var40);
                if (var42.field10602 != var41) {
                    var34.method823(var40, -1, var41);
                    return;
                }
                var34.method832(var40, 32499);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9763[--field9749];
                String var44 = field9761[--field9745];
                class771 var45 = class734.field10126.method709((byte) 100, var43);
                if (!var45.field10604.equals(var44)) {
                    var34.method831(var44, 23243, var43);
                    return;
                }
                var34.method832(var43, 32499);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field9763[--field9749];
                if ((var34.field1564 == 5 || arg0 != 1129) && (var34.field1564 == 4 || arg0 != 1130)) {
                    if (var34.field1455 != var52) {
                        var34.field1455 = var52;
                        class43.method336(-1, var34);
                    }
                    if (var34.field1482 == -1) {
                        class346.method2184(var34.field1446, 17);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field9749 -= 3;
                int var46 = field9763[field9749];
                short var47 = (short) field9763[field9749 + 1];
                short var48 = (short) field9763[field9749 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method840(var46, var48, 21829, var47);
                    class43.method336(-1, var34);
                    if (var34.field1482 == -1) {
                        class305.method1982(var46, (byte) 54, var34.field1446);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field9749 -= 3;
                int var49 = field9763[field9749];
                short var50 = (short) field9763[field9749 + 1];
                short var51 = (short) field9763[field9749 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method827(-117, var51, var49, var50);
                    class43.method336(-1, var34);
                    if (var34.field1482 == -1) {
                        class135.method904((byte) 48, var49, var34.field1446);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class115 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class384.method2387(false, field9763[--field9749]);
            } else {
                var53 = arg1 ? field9759 : field9739;
            }
            class43.method336(-1, var53);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9749 -= 2;
                int var54 = field9763[field9749];
                int var55 = field9763[field9749 + 1];
                if (var53.field1482 == -1) {
                    client.method785(9, var53.field1446);
                    class568.method3345(var53.field1446, -66);
                    class419.method2537(-82, var53.field1446);
                }
                if (var54 == -1) {
                    var53.field1479 = 1;
                    var53.field1404 = -1;
                    var53.field1458 = -1;
                    return;
                }
                var53.field1458 = var54;
                var53.field1435 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field1539 = true;
                } else {
                    var53.field1539 = false;
                }
                class581 var56 = class35.field367.method3051((byte) -20, var54);
                var53.field1469 = var56.field8196;
                var53.field1449 = var56.field8204;
                var53.field1535 = var56.field8205;
                var53.field1417 = var56.field8208;
                var53.field1483 = var56.field8155;
                var53.field1536 = var56.field8168;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field1496 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field1496 = 1;
                } else {
                    var53.field1496 = 2;
                }
                if (var53.field1508 > 0) {
                    var53.field1536 = var53.field1536 * 32 / var53.field1508;
                    return;
                }
                if (var53.field1532 > 0) {
                    var53.field1536 = var53.field1536 * 32 / var53.field1532;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field1479 = 2;
                var53.field1404 = field9763[--field9749];
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field1479 = 3;
                var53.field1404 = -1;
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field1479 = 6;
                var53.field1404 = field9763[--field9749];
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field1479 = 5;
                var53.field1404 = field9763[--field9749];
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
            if (arg0 == 1206) {
                field9749 -= 4;
                var53.field1502 = field9763[field9749];
                var53.field1439 = field9763[field9749 + 1];
                var53.field1444 = field9763[field9749 + 2];
                var53.field1391 = field9763[field9749 + 3];
                class43.method336(-1, var53);
                return;
            }
            if (arg0 == 1207) {
                field9749 -= 2;
                var53.field1490 = field9763[field9749];
                var53.field1424 = field9763[field9749 + 1];
                class43.method336(-1, var53);
                return;
            }
            if (arg0 == 1210) {
                field9749 -= 4;
                var53.field1404 = field9763[field9749];
                var53.field1456 = field9763[field9749 + 1];
                if (field9763[field9749 + 2] == 1) {
                    var53.field1479 = 9;
                } else {
                    var53.field1479 = 8;
                }
                if (field9763[field9749 + 3] == 1) {
                    var53.field1539 = true;
                } else {
                    var53.field1539 = false;
                }
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field1479 = 5;
                var53.field1404 = class173.field2193;
                var53.field1456 = 0;
                if (var53.field1482 == -1) {
                    class576.method3374((byte) 87, var53.field1446);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class115 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class384.method2387(false, field9763[--field9749]);
            } else {
                var57 = arg1 ? field9759 : field9739;
            }
            if (arg0 == 1300) {
                int var58 = field9763[--field9749] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method824(1801, field9761[--field9745], var58);
                    return;
                }
                field9745--;
                return;
            }
            if (arg0 == 1301) {
                field9749 -= 2;
                int var59 = field9763[field9749];
                int var60 = field9763[field9749 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field1510 = null;
                    return;
                }
                var57.field1510 = class446.method2705(var59, 5, var60);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field9763[--field9749];
                if (class76.field854 != var61 && class180.field2283 != var61 && class722.field9961 != var61) {
                    return;
                }
                var57.field1481 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field1545 = field9763[--field9749];
                return;
            }
            if (arg0 == 1304) {
                var57.field1565 = field9763[--field9749];
                return;
            }
            if (arg0 == 1305) {
                var57.field1504 = field9761[--field9745];
                return;
            }
            if (arg0 == 1306) {
                var57.field1451 = field9761[--field9745];
                return;
            }
            if (arg0 == 1307) {
                var57.field1421 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field1526 = field9763[--field9749];
                var57.field1427 = field9763[--field9749];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field9763[--field9749];
                int var63 = field9763[--field9749];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method828(0, var62, var63 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field1528 = field9761[--field9745];
                return;
            }
            if (arg0 == 1311) {
                var57.field1413 = field9763[--field9749];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field9749 -= 3;
                    var64 = field9763[field9749] - 1;
                    var65 = field9763[field9749 + 1];
                    var66 = field9763[field9749 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9749 -= 2;
                    var64 = 10;
                    var65 = field9763[field9749];
                    var66 = field9763[field9749 + 1];
                }
                if (var57.field1430 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field1430 = new byte[11];
                    var57.field1400 = new byte[11];
                    var57.field1485 = new int[11];
                }
                var57.field1430[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field1512 = false;
                    for (int var67 = 0; var67 < var57.field1430.length; var67++) {
                        if (var57.field1430[var67] != 0) {
                            var57.field1512 = true;
                            break;
                        }
                    }
                } else {
                    var57.field1512 = true;
                }
                var57.field1400[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field1412 = field9763[--field9749];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class115 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class384.method2387(false, field9763[--field9749]);
            } else {
                var68 = arg1 ? field9759 : field9739;
            }
            if (arg0 == 1499) {
                var68.method844(true);
                return;
            }
            String var69 = field9761[--field9745];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field9763[--field9749];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field9763[--field9749];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field9761[--field9745];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field9757[--field9746]);
                } else {
                    var72[var73] = Integer.valueOf(field9763[--field9749]);
                }
            }
            int var74 = field9763[--field9749];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field1507 = var72;
            } else if (arg0 == 1401) {
                var68.field1438 = var72;
            } else if (arg0 == 1402) {
                var68.field1465 = var72;
            } else if (arg0 == 1403) {
                var68.field1437 = var72;
            } else if (arg0 == 1404) {
                var68.field1519 = var72;
            } else if (arg0 == 1405) {
                var68.field1514 = var72;
            } else if (arg0 == 1406) {
                var68.field1387 = var72;
            } else if (arg0 == 1407) {
                var68.field1486 = var72;
                var68.field1453 = var70;
            } else if (arg0 == 1408) {
                var68.field1471 = var72;
            } else if (arg0 == 1409) {
                var68.field1477 = var72;
            } else if (arg0 == 1410) {
                var68.field1509 = var72;
            } else if (arg0 == 1411) {
                var68.field1397 = var72;
            } else if (arg0 == 1412) {
                var68.field1409 = var72;
            } else if (arg0 == 1414) {
                var68.field1418 = var72;
                var68.field1405 = var70;
            } else if (arg0 == 1415) {
                var68.field1388 = var72;
                var68.field1460 = var70;
            } else if (arg0 == 1416) {
                var68.field1538 = var72;
            } else if (arg0 == 1417) {
                var68.field1419 = var72;
            } else if (arg0 == 1418) {
                var68.field1537 = var72;
            } else if (arg0 == 1419) {
                var68.field1525 = var72;
            } else if (arg0 == 1420) {
                var68.field1425 = var72;
            } else if (arg0 == 1421) {
                var68.field1402 = var72;
            } else if (arg0 == 1422) {
                var68.field1520 = var72;
            } else if (arg0 == 1423) {
                var68.field1447 = var72;
            } else if (arg0 == 1424) {
                var68.field1491 = var72;
            } else if (arg0 == 1425) {
                var68.field1441 = var72;
            } else if (arg0 == 1426) {
                var68.field1466 = var72;
            } else if (arg0 == 1427) {
                var68.field1492 = var72;
            } else if (arg0 == 1428) {
                var68.field1416 = var72;
                var68.field1395 = var70;
            } else if (arg0 == 1429) {
                var68.field1396 = var72;
                var68.field1487 = var70;
            } else if (arg0 == 1430) {
                var68.field1428 = var72;
            } else if (arg0 == 1431) {
                var68.field1461 = var72;
            } else if (arg0 == 1432) {
                var68.field1515 = var72;
            }
            var68.field1476 = true;
            return;
        } else if (arg0 < 1600) {
            class115 var75 = arg1 ? field9759 : field9739;
            if (arg0 == 1500) {
                field9763[field9749++] = var75.field1408;
                return;
            }
            if (arg0 == 1501) {
                field9763[field9749++] = var75.field1503;
                return;
            }
            if (arg0 == 1502) {
                field9763[field9749++] = var75.field1560;
                return;
            }
            if (arg0 == 1503) {
                field9763[field9749++] = var75.field1517;
                return;
            }
            if (arg0 == 1504) {
                field9763[field9749++] = var75.field1489 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field9763[field9749++] = var75.field1436;
                return;
            }
            if (arg0 == 1506) {
                class115 var76 = class708.method3991(var75, 2);
                field9763[field9749++] = var76 == null ? -1 : var76.field1446;
                return;
            }
        } else if (arg0 < 1700) {
            class115 var77 = arg1 ? field9759 : field9739;
            if (arg0 == 1600) {
                field9763[field9749++] = var77.field1559;
                return;
            }
            if (arg0 == 1601) {
                field9763[field9749++] = var77.field1495;
                return;
            }
            if (arg0 == 1602) {
                field9761[field9745++] = var77.field1546;
                return;
            }
            if (arg0 == 1603) {
                field9763[field9749++] = var77.field1511;
                return;
            }
            if (arg0 == 1604) {
                field9763[field9749++] = var77.field1422;
                return;
            }
            if (arg0 == 1605) {
                field9763[field9749++] = var77.field1536;
                return;
            }
            if (arg0 == 1606) {
                field9763[field9749++] = var77.field1469;
                return;
            }
            if (arg0 == 1607) {
                field9763[field9749++] = var77.field1535;
                return;
            }
            if (arg0 == 1608) {
                field9763[field9749++] = var77.field1449;
                return;
            }
            if (arg0 == 1609) {
                field9763[field9749++] = var77.field1431;
                return;
            }
            if (arg0 == 1610) {
                field9763[field9749++] = var77.field1417;
                return;
            }
            if (arg0 == 1611) {
                field9763[field9749++] = var77.field1483;
                return;
            }
            if (arg0 == 1612) {
                field9763[field9749++] = var77.field1410;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field9763[--field9749];
                class771 var79 = class734.field10126.method709((byte) 118, var78);
                if (var79.method4253((byte) -54)) {
                    field9761[field9745++] = var77.method822((byte) -63, var78, var79.field10604);
                    return;
                }
                field9763[field9749++] = var77.method841(var79.field10602, var78, 2);
                return;
            }
            if (arg0 == 1614) {
                field9763[field9749++] = var77.field1457;
                return;
            }
            if (arg0 == 2614) {
                field9763[field9749++] = var77.field1479 == 1 ? var77.field1404 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class115 var80 = arg1 ? field9759 : field9739;
            if (arg0 == 1700) {
                field9763[field9749++] = var80.field1458;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field1458 != -1) {
                    field9763[field9749++] = var80.field1435;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field9763[field9749++] = var80.field1482;
                return;
            }
        } else if (arg0 < 1900) {
            class115 var81 = arg1 ? field9759 : field9739;
            if (arg0 == 1800) {
                field9763[field9749++] = client.method779(var81).method1112((byte) 59);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field9763[--field9749];
                int var383 = var82 - 1;
                if (var81.field1421 != null && var383 < var81.field1421.length && var81.field1421[var383] != null) {
                    field9761[field9745++] = var81.field1421[var383];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field1504 == null) {
                    field9761[field9745++] = "";
                    return;
                }
                field9761[field9745++] = var81.field1504;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class115 var381;
            if (arg0 >= 2000) {
                var381 = class384.method2387(false, field9763[--field9749]);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field9759 : field9739;
            }
            if (field9769 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field1492 == null) {
                    return;
                }
                class114 var382 = new class114();
                var382.field1378 = var381;
                var382.field1384 = var381.field1492;
                var382.field1377 = field9769 + 1;
                class495.field6812.method1039(var382, 0);
                return;
            }
        } else if (arg0 < 2600) {
            class115 var83 = class384.method2387(false, field9763[--field9749]);
            if (arg0 == 2500) {
                field9763[field9749++] = var83.field1408;
                return;
            }
            if (arg0 == 2501) {
                field9763[field9749++] = var83.field1503;
                return;
            }
            if (arg0 == 2502) {
                field9763[field9749++] = var83.field1560;
                return;
            }
            if (arg0 == 2503) {
                field9763[field9749++] = var83.field1517;
                return;
            }
            if (arg0 == 2504) {
                field9763[field9749++] = var83.field1489 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field9763[field9749++] = var83.field1436;
                return;
            }
            if (arg0 == 1506) {
                class115 var84 = class708.method3991(var83, 2);
                field9763[field9749++] = var84 == null ? -1 : var84.field1446;
                return;
            }
        } else if (arg0 < 2700) {
            class115 var85 = class384.method2387(false, field9763[--field9749]);
            if (arg0 == 2600) {
                field9763[field9749++] = var85.field1559;
                return;
            }
            if (arg0 == 2601) {
                field9763[field9749++] = var85.field1495;
                return;
            }
            if (arg0 == 2602) {
                field9761[field9745++] = var85.field1546;
                return;
            }
            if (arg0 == 2603) {
                field9763[field9749++] = var85.field1511;
                return;
            }
            if (arg0 == 2604) {
                field9763[field9749++] = var85.field1422;
                return;
            }
            if (arg0 == 2605) {
                field9763[field9749++] = var85.field1536;
                return;
            }
            if (arg0 == 2606) {
                field9763[field9749++] = var85.field1469;
                return;
            }
            if (arg0 == 2607) {
                field9763[field9749++] = var85.field1535;
                return;
            }
            if (arg0 == 2608) {
                field9763[field9749++] = var85.field1449;
                return;
            }
            if (arg0 == 2609) {
                field9763[field9749++] = var85.field1431;
                return;
            }
            if (arg0 == 2610) {
                field9763[field9749++] = var85.field1417;
                return;
            }
            if (arg0 == 2611) {
                field9763[field9749++] = var85.field1483;
                return;
            }
            if (arg0 == 2612) {
                field9763[field9749++] = var85.field1410;
                return;
            }
            if (arg0 == 2613) {
                field9763[field9749++] = var85.field1457;
                return;
            }
            if (arg0 == 2614) {
                field9763[field9749++] = var85.field1479 == 1 ? var85.field1404 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class115 var86 = class384.method2387(false, field9763[--field9749]);
                field9763[field9749++] = var86.field1458;
                return;
            }
            if (arg0 == 2701) {
                class115 var87 = class384.method2387(false, field9763[--field9749]);
                if (var87.field1458 != -1) {
                    field9763[field9749++] = var87.field1435;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field9763[--field9749];
                class610 var89 = (class610) class278.field3993.method3669(false, (long) var88);
                if (var89 != null) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class115 var90 = class384.method2387(false, field9763[--field9749]);
                if (var90.field1394 == null) {
                    field9763[field9749++] = 0;
                    return;
                }
                int var91 = var90.field1394.length;
                for (int var92 = 0; var92 < var90.field1394.length; var92++) {
                    if (var90.field1394[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field9763[field9749++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field9749 -= 2;
                int var93 = field9763[field9749];
                int var94 = field9763[field9749 + 1];
                class610 var95 = (class610) class278.field3993.method3669(false, (long) var93);
                if (var95 != null && var95.field8600 == var94) {
                    field9763[field9749++] = 1;
                    return;
                } else {
                    field9763[field9749++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class115 var96 = class384.method2387(false, field9763[--field9749]);
            if (arg0 == 2800) {
                field9763[field9749++] = client.method779(var96).method1112((byte) 119);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field9763[--field9749];
                int var384 = var97 - 1;
                if (var96.field1421 != null && var384 < var96.field1421.length && var96.field1421[var384] != null) {
                    field9761[field9745++] = var96.field1421[var384];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field1504 == null) {
                    field9761[field9745++] = "";
                    return;
                }
                field9761[field9745++] = var96.field1504;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field9761[--field9745];
                class423.method2545(var98, -118);
                return;
            }
            if (arg0 == 3101) {
                field9749 -= 2;
                class663.method3784(class724.field10031, field9763[field9749], 116, field9763[field9749 + 1]);
                return;
            }
            if (arg0 == 3103) {
                class705.method3983(true, -1);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field9761[--field9745];
                int var100 = 0;
                if (class623.method3585(0, var99)) {
                    var100 = class157.method1014(var99, -14534);
                }
                field9767++;
                class116 var101 = class248.method1672(class84.field1023, class247.field3669, -20647);
                var101.field1575.method3003(var100, -23061);
                class443.method2655(0, var101);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field9761[--field9745];
                field9758++;
                class116 var103 = class248.method1672(class84.field1023, class370.field5335, -20647);
                var103.field1575.method3005(255, var102.length() + 1);
                var103.field1575.method3037(0, var102);
                class443.method2655(0, var103);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field9761[--field9745];
                field9760++;
                class116 var105 = class248.method1672(class84.field1023, class16.field93, -20647);
                var105.field1575.method3005(255, var104.length() + 1);
                var105.field1575.method3037(0, var104);
                class443.method2655(0, var105);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field9763[--field9749];
                String var107 = field9761[--field9745];
                class178.method1134(var107, (byte) 17, var106);
                return;
            }
            if (arg0 == 3108) {
                field9749 -= 3;
                int var108 = field9763[field9749];
                int var109 = field9763[field9749 + 1];
                int var110 = field9763[field9749 + 2];
                class115 var111 = class384.method2387(false, var110);
                class558.method3287(var111, var109, var108, 45);
                return;
            }
            if (arg0 == 3109) {
                field9749 -= 2;
                int var112 = field9763[field9749];
                int var113 = field9763[field9749 + 1];
                class115 var114 = arg1 ? field9759 : field9739;
                class558.method3287(var114, var113, var112, 105);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field9763[--field9749];
                field9751++;
                class116 var116 = class248.method1672(class84.field1023, class483.field6682, -20647);
                var116.field1575.method2986(var115, -124);
                class443.method2655(0, var116);
                return;
            }
            if (arg0 == 3111) {
                field9749 -= 2;
                int var117 = field9763[field9749];
                int var118 = field9763[field9749 + 1];
                class610 var119 = (class610) class278.field3993.method3669(false, (long) var117);
                if (var119 != null) {
                    class47.method387(var119.field8600 != var118, (byte) 125, true, var119);
                }
                class475.method2833(true, var118, var117, false, 3);
                return;
            }
            if (arg0 == 3112) {
                field9749--;
                int var120 = field9763[field9749];
                class610 var121 = (class610) class278.field3993.method3669(false, (long) var120);
                if (var121 != null && var121.field8598 == 3) {
                    class47.method387(true, (byte) 125, true, var121);
                }
                return;
            }
            if (arg0 == 3113) {
                class662.method3780(0, field9761[--field9745]);
                return;
            }
            if (arg0 == 3114) {
                field9749 -= 2;
                int var122 = field9763[field9749];
                int var123 = field9763[field9749 + 1];
                String var124 = field9761[--field9745];
                class727.method4042("", "", (byte) -51, "", var122, var123, var124);
                return;
            }
            if (arg0 == 3115) {
                field9749 -= 11;
                class267[] var125 = class278.method1807(4);
                class15[] var126 = class282.method1834(0);
                class219.method1354(field9763[field9749 + 2], field9763[field9749 + 6], field9763[field9749 + 3], field9763[field9749 + 9], field9763[field9749 + 7], field9763[field9749 + 4], var126[field9763[field9749 + 1]], field9763[field9749 + 5], var125[field9763[field9749]], field9763[field9749 + 8], field9763[field9749 + 10], (byte) -115);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field9763[--field9749];
                field9767++;
                class116 var128 = class248.method1672(class84.field1023, class788.field10816, -20647);
                var128.field1575.method2986(var127, -63);
                class443.method2655(0, var128);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field9761[--field9745];
                class116 var130 = class248.method1672(class84.field1023, class135.field1721, -20647);
                var130.field1575.method3005(255, var129.length() + 1);
                var130.field1575.method3037(0, var129);
                class443.method2655(0, var130);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field9749 -= 3;
                class68.method522(field9763[field9749], field9763[field9749 + 1], 256, field9763[field9749 + 2], (byte) 102, 255);
                return;
            }
            if (arg0 == 3201) {
                class255.method1703(field9763[--field9749], -3798, 255, 50);
                return;
            }
            if (arg0 == 3202) {
                field9749 -= 2;
                class702.method3972(255, -1, field9763[field9749], field9763[field9749 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field9749 -= 4;
                class68.method522(field9763[field9749], field9763[field9749 + 1], 256, field9763[field9749 + 2], (byte) 102, field9763[field9749 + 3]);
                return;
            }
            if (arg0 == 3204) {
                field9749 -= 3;
                class255.method1703(field9763[field9749], -3798, field9763[field9749 + 1], field9763[field9749 + 2]);
                return;
            }
            if (arg0 == 3205) {
                field9749 -= 3;
                class702.method3972(field9763[field9749 + 2], -1, field9763[field9749], field9763[field9749 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field9749 -= 4;
                class324.method2056(field9763[field9749 + 1], 0, field9763[field9749 + 3], false, field9763[field9749 + 2], field9763[field9749], 256);
                return;
            }
            if (arg0 == 3207) {
                field9749 -= 4;
                class324.method2056(field9763[field9749 + 1], 0, field9763[field9749 + 3], true, field9763[field9749 + 2], field9763[field9749], 256);
                return;
            }
            if (arg0 == 3208) {
                field9749 -= 5;
                class68.method522(field9763[field9749], field9763[field9749 + 1], field9763[field9749 + 4], field9763[field9749 + 2], (byte) 112, field9763[field9749 + 3]);
                return;
            }
            if (arg0 == 3209) {
                field9749 -= 5;
                class324.method2056(field9763[field9749 + 1], 0, field9763[field9749 + 3], false, field9763[field9749 + 2], field9763[field9749], field9763[field9749 + 4]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field9763[field9749++] = class533.field7336;
                return;
            }
            if (arg0 == 3301) {
                field9749 -= 2;
                int var131 = field9763[field9749];
                int var132 = field9763[field9749 + 1];
                field9763[field9749++] = class672.method3833(var132, (byte) -68, var131, false);
                return;
            }
            if (arg0 == 3302) {
                field9749 -= 2;
                int var133 = field9763[field9749];
                int var134 = field9763[field9749 + 1];
                field9763[field9749++] = class381.method2379(var134, false, var133, 1);
                return;
            }
            if (arg0 == 3303) {
                field9749 -= 2;
                int var135 = field9763[field9749];
                int var136 = field9763[field9749 + 1];
                field9763[field9749++] = class489.method2895(var136, false, var135, (byte) 106);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field9763[--field9749];
                field9763[field9749++] = class532.field7331.method3619(var137, 99).field6870;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field9763[--field9749];
                field9763[field9749++] = class650.field9085[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field9763[--field9749];
                field9763[field9749++] = class626.field8772[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field9763[--field9749];
                field9763[field9749++] = class141.field1796[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class724.field10031.field3467;
                int var142 = (class724.field10031.field3470 >> 9) + class444.field6151;
                int var143 = (class724.field10031.field3460 >> 9) + class236.field3535;
                field9763[field9749++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field9763[--field9749];
                field9763[field9749++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field9763[--field9749];
                field9763[field9749++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field9763[--field9749];
                field9763[field9749++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field9763[field9749++] = class14.field78 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field9749 -= 2;
                int var147 = field9763[field9749];
                int var148 = field9763[field9749 + 1];
                field9763[field9749++] = class672.method3833(var148, (byte) -76, var147, true);
                return;
            }
            if (arg0 == 3314) {
                field9749 -= 2;
                int var149 = field9763[field9749];
                int var150 = field9763[field9749 + 1];
                field9763[field9749++] = class381.method2379(var150, true, var149, 1);
                return;
            }
            if (arg0 == 3315) {
                field9749 -= 2;
                int var151 = field9763[field9749];
                int var152 = field9763[field9749 + 1];
                field9763[field9749++] = class489.method2895(var152, true, var151, (byte) 43);
                return;
            }
            if (arg0 == 3316) {
                if (class597.field8370 >= 2) {
                    field9763[field9749++] = class597.field8370;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field9763[field9749++] = class637.field8958;
                return;
            }
            if (arg0 == 3318) {
                field9763[field9749++] = class735.field10134.field8306;
                return;
            }
            if (arg0 == 3321) {
                field9763[field9749++] = class723.field9979;
                return;
            }
            if (arg0 == 3322) {
                field9763[field9749++] = class53.field641;
                return;
            }
            if (arg0 == 3323) {
                if (class664.field9332 >= 5 && class664.field9332 <= 9) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class664.field9332 >= 5 && class664.field9332 <= 9) {
                    field9763[field9749++] = class664.field9332;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field9763[field9749++] = class161.field2078 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field9763[field9749++] = class724.field10031.field9980;
                return;
            }
            if (arg0 == 3327) {
                field9763[field9749++] = class724.field10031.field9993 != null && class724.field10031.field9993.field3683 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field9763[field9749++] = class780.field10724 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field9763[--field9749];
                field9763[field9749++] = class379.method2370(false, var153, -111);
                return;
            }
            if (arg0 == 3331) {
                field9749 -= 2;
                int var154 = field9763[field9749];
                int var155 = field9763[field9749 + 1];
                field9763[field9749++] = class582.method3424(var154, false, false, -8651, var155);
                return;
            }
            if (arg0 == 3332) {
                field9749 -= 2;
                int var156 = field9763[field9749];
                int var157 = field9763[field9749 + 1];
                field9763[field9749++] = class582.method3424(var156, false, true, -8651, var157);
                return;
            }
            if (arg0 == 3333) {
                field9763[field9749++] = class284.field4094;
                return;
            }
            if (arg0 == 3335) {
                field9763[field9749++] = class553.field7667;
                return;
            }
            if (arg0 == 3336) {
                field9749 -= 4;
                int var158 = field9763[field9749];
                int var159 = field9763[field9749 + 1];
                int var160 = field9763[field9749 + 2];
                int var161 = field9763[field9749 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field9763[field9749++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field9763[field9749++] = class718.field9946;
                return;
            }
            if (arg0 == 3338) {
                field9763[field9749++] = class595.method3470(false);
                return;
            }
            if (arg0 == 3339) {
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field9763[field9749++] = class536.field7412 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field9763[field9749++] = class457.field6392 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field9763[field9749++] = class205.field2881.method354((byte) -20);
                return;
            }
            if (arg0 == 3343) {
                field9763[field9749++] = class205.field2881.method351(-25269);
                return;
            }
            if (arg0 == 3344) {
                field9761[field9745++] = class703.method3974(1);
                return;
            }
            if (arg0 == 3345) {
                field9761[field9745++] = class214.method1342((byte) -42);
                return;
            }
            if (arg0 == 3346) {
                field9763[field9749++] = class53.method456(101);
                return;
            }
            if (arg0 == 3347) {
                field9763[field9749++] = class392.field5586;
                return;
            }
            if (arg0 == 3349) {
                field9763[field9749++] = class724.field10031.field9128.method3257(-25113) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field9749 -= 2;
                int var165 = field9763[field9749];
                int var166 = field9763[field9749 + 1];
                class559 var167 = class281.field4027.method3538(-116, var165);
                field9761[field9745++] = var167.method3290(var166, (byte) -121);
                return;
            }
            if (arg0 == 3408) {
                field9749 -= 4;
                int var168 = field9763[field9749];
                int var169 = field9763[field9749 + 1];
                int var170 = field9763[field9749 + 2];
                int var171 = field9763[field9749 + 3];
                class559 var172 = class281.field4027.method3538(-126, var170);
                if (var172.field7868 == var168 && var172.field7864 == var169) {
                    if (var169 == 115) {
                        field9761[field9745++] = var172.method3290(var171, (byte) -121);
                        return;
                    }
                    field9763[field9749++] = var172.method3297(var171, -19759);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field9749 -= 3;
                int var173 = field9763[field9749];
                int var174 = field9763[field9749 + 1];
                int var175 = field9763[field9749 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class559 var176 = class281.field4027.method3538(-128, var174);
                if (var176.field7864 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field9763[field9749++] = var176.method3292(var175, 31298) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field9763[--field9749];
                String var178 = field9761[--field9745];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class559 var179 = class281.field4027.method3538(-117, var177);
                if (var179.field7864 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field9763[field9749++] = var179.method3295(var178, 10768) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field9763[--field9749];
                class559 var181 = class281.field4027.method3538(-114, var180);
                field9763[field9749++] = var181.field7877.method3664(0);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class45.field474 == 0) {
                    field9763[field9749++] = -2;
                    return;
                }
                if (class45.field474 == 1) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = class688.field9600;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field9763[--field9749];
                if (class45.field474 == 2 && var182 < class688.field9600) {
                    field9761[field9745++] = class396.field5622[var182];
                    if (class715.field9932[var182] != null) {
                        field9761[field9745++] = class715.field9932[var182];
                        return;
                    }
                    field9761[field9745++] = "";
                    return;
                }
                field9761[field9745++] = "";
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field9763[--field9749];
                if (class45.field474 == 2 && var183 < class688.field9600) {
                    field9763[field9749++] = class617.field8669[var183];
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field9763[--field9749];
                if (class45.field474 == 2 && var184 < class688.field9600) {
                    field9763[field9749++] = class665.field9349[var184];
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field9761[--field9745];
                int var186 = field9763[--field9749];
                class793.method4338(var185, 55, var186);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field9761[--field9745];
                class152.method1001((byte) 75, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field9761[--field9745];
                class16.method63(false, var188);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field9761[--field9745];
                class741.method4110(false, 112, var189);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field9761[--field9745];
                class41.method333(1, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field9761[--field9745];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field9763[field9749++] = class261.method1718(-28054, var191) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field9763[--field9749];
                if (class45.field474 == 2 && var192 < class688.field9600) {
                    field9761[field9745++] = class712.field9918[var192];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class471.field6533 != null) {
                    field9761[field9745++] = class6.method16(class471.field6533, -96);
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class471.field6533 != null) {
                    field9763[field9749++] = class165.field2117;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field9763[--field9749];
                if (class471.field6533 != null && var193 < class165.field2117) {
                    field9761[field9745++] = class456.field6371[var193].field3573;
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field9763[--field9749];
                if (class471.field6533 != null && var194 < class165.field2117) {
                    field9763[field9749++] = class456.field6371[var194].field3570;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field9763[--field9749];
                if (class471.field6533 != null && var195 < class165.field2117) {
                    field9763[field9749++] = class456.field6371[var195].field3571;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field9763[field9749++] = class224.field3410;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field9761[--field9745];
                class403.method2471(2, var196);
                return;
            }
            if (arg0 == 3618) {
                field9763[field9749++] = class23.field212;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field9761[--field9745];
                class558.method3286(var197, 127);
                return;
            }
            if (arg0 == 3620) {
                class658.method3768(0);
                return;
            }
            if (arg0 == 3621) {
                if (class45.field474 == 0) {
                    field9763[field9749++] = -1;
                    return;
                }
                field9763[field9749++] = class302.field4404;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field9763[--field9749];
                if (class45.field474 != 0 && var198 < class302.field4404) {
                    field9761[field9745++] = class17.field100[var198];
                    if (class554.field7679[var198] != null) {
                        field9761[field9745++] = class554.field7679[var198];
                        return;
                    }
                    field9761[field9745++] = "";
                    return;
                }
                field9761[field9745++] = "";
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field9761[--field9745];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field9763[field9749++] = class57.method475(false, var199) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field9763[--field9749];
                if (class456.field6371 != null && var200 < class165.field2117 && class456.field6371[var200].field3572.equalsIgnoreCase(class724.field10031.field9965)) {
                    field9763[field9749++] = 1;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class461.field6454 != null) {
                    field9761[field9745++] = class461.field6454;
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field9763[--field9749];
                if (class471.field6533 != null && var201 < class165.field2117) {
                    field9761[field9745++] = class456.field6371[var201].field3574;
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field9763[--field9749];
                if (class45.field474 == 2 && var202 >= 0 && var202 < class688.field9600) {
                    field9763[field9749++] = class253.field3744[var202] ? 1 : 0;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field9761[--field9745];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field9763[field9749++] = class216.method1346(var203, -111);
                return;
            }
            if (arg0 == 3629) {
                field9763[field9749++] = class570.field8016;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field9761[--field9745];
                class741.method4110(true, 91, var204);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field9763[--field9749];
                field9763[field9749++] = class319.field4522[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field9763[--field9749];
                if (class471.field6533 != null && var206 < class165.field2117) {
                    field9761[field9745++] = class456.field6371[var206].field3572;
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field9763[--field9749];
                if (class45.field474 != 0 && var207 < class302.field4404) {
                    field9761[field9745++] = class538.field7433[var207];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class706.field9819 != null) {
                    field9763[field9749++] = 1;
                    field9755 = class706.field9819;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class706.field9820 != null) {
                    field9763[field9749++] = 1;
                    field9755 = class706.field9820;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field9761[field9745++] = field9755.field553;
                return;
            }
            if (arg0 == 3703) {
                field9763[field9749++] = field9755.field555 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field9763[field9749++] = field9755.field559;
                return;
            }
            if (arg0 == 3705) {
                field9763[field9749++] = field9755.field571;
                return;
            }
            if (arg0 == 3706) {
                field9763[field9749++] = field9755.field542;
                return;
            }
            if (arg0 == 3707) {
                field9763[field9749++] = field9755.field535;
                return;
            }
            if (arg0 == 3709) {
                field9763[field9749++] = field9755.field561;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field9763[--field9749];
                field9761[field9745++] = field9755.field537[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field9763[--field9749];
                field9763[field9749++] = field9755.field564[var209];
                return;
            }
            if (arg0 == 3712) {
                field9763[field9749++] = field9755.field539;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field9763[--field9749];
                field9761[field9745++] = field9755.field558[var210];
                return;
            }
            if (arg0 == 3714) {
                field9749 -= 3;
                int var211 = field9763[field9749];
                int var212 = field9763[field9749 + 1];
                int var213 = field9763[field9749 + 2];
                field9763[field9749++] = field9755.method399(true, var212, var211, var213);
                return;
            }
            if (arg0 == 3715) {
                field9763[field9749++] = field9755.field575;
                return;
            }
            if (arg0 == 3716) {
                field9763[field9749++] = field9755.field544;
                return;
            }
            if (arg0 == 3717) {
                field9763[field9749++] = field9755.method406(-1, field9761[--field9745]);
                return;
            }
            if (arg0 == 3718) {
                field9763[field9749 - 1] = field9755.method393(-118)[field9763[field9749 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class499.field6843 != null) {
                    field9763[field9749++] = 1;
                    field9765 = class499.field6843;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class314.field4511 != null) {
                    field9763[field9749++] = 1;
                    field9765 = class314.field4511;
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field9761[field9745++] = field9765.field6418;
                return;
            }
            if (arg0 == 3753) {
                field9763[field9749++] = field9765.field6429;
                return;
            }
            if (arg0 == 3754) {
                field9763[field9749++] = field9765.field6412;
                return;
            }
            if (arg0 == 3755) {
                field9763[field9749++] = field9765.field6419;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field9763[--field9749];
                field9761[field9745++] = field9765.field6422[var214].field828;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field9763[--field9749];
                field9763[field9749++] = field9765.field6422[var215].field831;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field9763[--field9749];
                field9763[field9749++] = field9765.field6422[var216].field830;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field9763[--field9749];
                class231.method1551(16383, field9765 == class314.field4511, var217);
                return;
            }
            if (arg0 == 3760) {
                field9763[field9749++] = field9765.method2758(field9761[--field9745], true);
                return;
            }
            if (arg0 == 3761) {
                field9763[field9749 - 1] = field9765.method2764(0)[field9763[field9749 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var218].method3532((byte) -40);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var219].field8585;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var220].field8591;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var221].field8592;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var222].field8586;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field9763[--field9749];
                field9763[field9749++] = class744.field10274[var223].field8588;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field9763[--field9749];
                int var225 = class744.field10274[var224].method3530((byte) 91);
                field9763[field9749++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field9763[--field9749];
                int var227 = class744.field10274[var226].method3530((byte) 91);
                field9763[field9749++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field9763[--field9749];
                int var229 = class744.field10274[var228].method3530((byte) 91);
                field9763[field9749++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field9763[--field9749];
                int var231 = class744.field10274[var230].method3530((byte) 91);
                field9763[field9749++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field9749 -= 2;
                int var232 = field9763[field9749];
                int var233 = field9763[field9749 + 1];
                field9763[field9749++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field9749 -= 2;
                int var234 = field9763[field9749];
                int var235 = field9763[field9749 + 1];
                field9763[field9749++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field9749 -= 2;
                int var236 = field9763[field9749];
                int var237 = field9763[field9749 + 1];
                field9763[field9749++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field9749 -= 2;
                int var238 = field9763[field9749];
                int var239 = field9763[field9749 + 1];
                field9763[field9749++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field9763[--field9749];
                field9763[field9749++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field9763[--field9749];
                field9763[field9749++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field9749 -= 5;
                int var242 = field9763[field9749];
                int var243 = field9763[field9749 + 1];
                int var244 = field9763[field9749 + 2];
                int var245 = field9763[field9749 + 3];
                int var246 = field9763[field9749 + 4];
                field9763[field9749++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field9749 -= 2;
                long var247 = (long) field9763[field9749];
                long var249 = (long) field9763[field9749 + 1];
                field9763[field9749++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field9749 -= 2;
                int var251 = field9763[field9749];
                int var252 = field9763[field9749 + 1];
                field9763[field9749++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field9749 -= 2;
                int var253 = field9763[field9749];
                int var254 = field9763[field9749 + 1];
                field9763[field9749++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field9749 -= 2;
                int var255 = field9763[field9749];
                int var256 = field9763[field9749 + 1];
                field9763[field9749++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field9749 -= 2;
                int var257 = field9763[field9749];
                int var258 = field9763[field9749 + 1];
                field9763[field9749++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field9749 -= 2;
                int var259 = field9763[field9749];
                int var260 = field9763[field9749 + 1];
                if (var259 == 0) {
                    field9763[field9749++] = 0;
                    return;
                }
                field9763[field9749++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field9749 -= 2;
                int var261 = field9763[field9749];
                int var262 = field9763[field9749 + 1];
                if (var261 == 0) {
                    field9763[field9749++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field9763[field9749++] = Integer.MAX_VALUE;
                    return;
                }
                field9763[field9749++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field9749 -= 2;
                int var263 = field9763[field9749];
                int var264 = field9763[field9749 + 1];
                field9763[field9749++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field9749 -= 2;
                int var265 = field9763[field9749];
                int var266 = field9763[field9749 + 1];
                field9763[field9749++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field9749 -= 2;
                int var267 = field9763[field9749];
                int var268 = field9763[field9749 + 1];
                field9763[field9749++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field9749 -= 2;
                int var269 = field9763[field9749];
                int var270 = field9763[field9749 + 1];
                field9763[field9749++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field9749 -= 3;
                long var271 = (long) field9763[field9749];
                long var273 = (long) field9763[field9749 + 1];
                long var275 = (long) field9763[field9749 + 2];
                field9763[field9749++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field9749 -= 2;
                int var277 = field9763[field9749];
                int var278 = field9763[field9749 + 1];
                if (var277 > 700 || var278 > 700) {
                    field9763[field9749++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field9763[field9749++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field9763[--field9749];
                field9763[field9749++] = class372.field5346[class357.method2236(var281, (byte) 107) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field9761[--field9745];
                int var283 = field9763[--field9749];
                field9761[field9745++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field9745 -= 2;
                String var284 = field9761[field9745];
                String var285 = field9761[field9745 + 1];
                field9761[field9745++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field9761[--field9745];
                int var287 = field9763[--field9749];
                field9761[field9745++] = var286 + class634.method3636(var287, true, 10);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field9761[--field9745];
                field9761[field9745++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field9761[field9745++] = class475.method2832(class116.method849(field9763[--field9749], -11745), (byte) 54, class553.field7667);
                return;
            }
            if (arg0 == 4105) {
                field9745 -= 2;
                String var289 = field9761[field9745];
                String var290 = field9761[field9745 + 1];
                if (class724.field10031.field9993 != null && class724.field10031.field9993.field3683) {
                    field9761[field9745++] = var290;
                    return;
                }
                field9761[field9745++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field9763[--field9749];
                field9761[field9745++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field9745 -= 2;
                field9763[field9749++] = class368.method2295(105, class553.field7667, field9761[field9745 + 1], field9761[field9745]);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field9761[--field9745];
                field9749 -= 2;
                int var293 = field9763[field9749];
                int var294 = field9763[field9749 + 1];
                class300 var295 = class582.method3425(class170.field2160, 0, false, var294);
                field9763[field9749++] = var295.method1960(var293, var292, -121, class475.field6585);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field9761[--field9745];
                field9749 -= 2;
                int var297 = field9763[field9749];
                int var298 = field9763[field9749 + 1];
                class300 var299 = class582.method3425(class170.field2160, 0, false, var298);
                field9763[field9749++] = var299.method1957(0, var297, class475.field6585, var296);
                return;
            }
            if (arg0 == 4110) {
                field9745 -= 2;
                String var300 = field9761[field9745];
                String var301 = field9761[field9745 + 1];
                if (field9763[--field9749] == 1) {
                    field9761[field9745++] = var300;
                    return;
                }
                field9761[field9745++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field9761[--field9745];
                field9761[field9745++] = class224.method1516(var302, 126);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field9761[--field9745];
                int var304 = field9763[--field9749];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field9761[field9745++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field9763[--field9749];
                field9763[field9749++] = method3955((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field9763[--field9749];
                field9763[field9749++] = class475.method2831((char) var306, (byte) -19) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field9763[--field9749];
                field9763[field9749++] = class732.method4073((char) var307, (byte) -51) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field9763[--field9749];
                field9763[field9749++] = class634.method3638((char) var308, -92) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field9761[--field9745];
                if (var309 != null) {
                    field9763[field9749++] = var309.length();
                    return;
                }
                field9763[field9749++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field9761[--field9745];
                field9749 -= 2;
                int var311 = field9763[field9749];
                int var312 = field9763[field9749 + 1];
                field9761[field9745++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field9761[--field9745];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field9761[field9745++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field9761[--field9745];
                field9749 -= 2;
                int var319 = field9763[field9749];
                int var320 = field9763[field9749 + 1];
                field9763[field9749++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field9745 -= 2;
                String var321 = field9761[field9745];
                String var322 = field9761[field9745 + 1];
                int var323 = field9763[--field9749];
                field9763[field9749++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field9763[--field9749];
                field9763[field9749++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field9763[--field9749];
                field9763[field9749++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field9763[--field9749] != 0;
                int var327 = field9763[--field9749];
                field9761[field9745++] = class84.method640(30, var326, 0, class553.field7667, (long) var327);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field9761[--field9745];
                int var329 = field9763[--field9749];
                class300 var330 = class582.method3425(class170.field2160, 0, false, var329);
                field9763[field9749++] = var330.method1956(class475.field6585, var328, false);
                return;
            }
            if (arg0 == 4126) {
                field9761[field9745++] = class248.method1670(-549643391, class553.field7667, true, (long) field9763[--field9749] * 60000L) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field9757[--field9746];
                field9761[field9745++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field9763[--field9749];
                field9761[field9745++] = class35.field367.method3051((byte) -20, var333).field8230;
                return;
            }
            if (arg0 == 4201) {
                field9749 -= 2;
                int var334 = field9763[field9749];
                int var335 = field9763[field9749 + 1];
                class581 var336 = class35.field367.method3051((byte) -20, var334);
                if (var335 >= 1 && var335 <= 5 && var336.field8191[var335 - 1] != null) {
                    field9761[field9745++] = var336.field8191[var335 - 1];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 4202) {
                field9749 -= 2;
                int var337 = field9763[field9749];
                int var338 = field9763[field9749 + 1];
                class581 var339 = class35.field367.method3051((byte) -20, var337);
                if (var338 >= 1 && var338 <= 5 && var339.field8198[var338 - 1] != null) {
                    field9761[field9745++] = var339.field8198[var338 - 1];
                    return;
                }
                field9761[field9745++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field9763[--field9749];
                field9763[field9749++] = class35.field367.method3051((byte) -20, var340).field8201;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field9763[--field9749];
                field9763[field9749++] = class35.field367.method3051((byte) -20, var341).field8156 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field9763[--field9749];
                class581 var343 = class35.field367.method3051((byte) -20, var342);
                if (var343.field8215 == -1 && var343.field8161 >= 0) {
                    field9763[field9749++] = var343.field8161;
                    return;
                }
                field9763[field9749++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field9763[--field9749];
                class581 var345 = class35.field367.method3051((byte) -20, var344);
                if (var345.field8215 >= 0 && var345.field8161 >= 0) {
                    field9763[field9749++] = var345.field8161;
                    return;
                }
                field9763[field9749++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field9763[--field9749];
                field9763[field9749++] = class35.field367.method3051((byte) -20, var346).field8207 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field9749 -= 2;
                int var347 = field9763[field9749];
                int var348 = field9763[field9749 + 1];
                class771 var349 = class734.field10126.method709((byte) 100, var348);
                if (var349.method4253((byte) -80)) {
                    field9761[field9745++] = class35.field367.method3051((byte) -20, var347).method3406(var348, -110, var349.field10604);
                    return;
                }
                field9763[field9749++] = class35.field367.method3051((byte) -20, var347).method3412(var349.field10602, var348, 1000);
                return;
            }
            if (arg0 == 4209) {
                field9749 -= 2;
                int var350 = field9763[field9749];
                int var351 = field9763[field9749 + 1] - 1;
                class581 var352 = class35.field367.method3051((byte) -20, var350);
                if (var352.field8206 == var351) {
                    field9763[field9749++] = var352.field8221;
                    return;
                }
                if (var352.field8169 == var351) {
                    field9763[field9749++] = var352.field8189;
                    return;
                }
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field9761[--field9745];
                int var354 = field9763[--field9749];
                class601.method3479(var353, var354 == 1, -126);
                field9763[field9749++] = class22.field205;
                return;
            }
            if (arg0 == 4211) {
                if (class133.field1706 != null && class263.field3848 < class22.field205) {
                    field9763[field9749++] = class133.field1706[class263.field3848++] & 0xFFFF;
                    return;
                }
                field9763[field9749++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class263.field3848 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field9763[--field9749];
                field9763[field9749++] = class35.field367.method3051((byte) -20, var355).field8216;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field9761[--field9745];
                field9749 -= 3;
                int var357 = field9763[field9749];
                int var358 = field9763[field9749 + 1];
                int var359 = field9763[field9749 + 2];
                class637.method3661(var359, (byte) 125, var356, var357 == 1, var358);
                field9763[field9749++] = class22.field205;
                return;
            }
            if (arg0 == 4215) {
                field9745 -= 2;
                field9749 -= 2;
                String var360 = field9761[field9745];
                int var361 = field9763[field9749];
                int var362 = field9763[field9749 + 1];
                String var363 = field9761[field9745 + 1];
                class781.method4298((byte) -73, var360, var363, var361 == 1, var362);
                field9763[field9749++] = class22.field205;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field9749 -= 2;
                int var364 = field9763[field9749];
                int var365 = field9763[field9749 + 1];
                class771 var366 = class734.field10126.method709((byte) 100, var365);
                if (var366.method4253((byte) -116)) {
                    field9761[field9745++] = class104.field1201.method4318(var364, -197).method3651(var365, -3725, var366.field10604);
                    return;
                }
                field9763[field9749++] = class104.field1201.method4318(var364, -197).method3653(var366.field10602, 26, var365);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field9749 -= 2;
                int var367 = field9763[field9749];
                int var368 = field9763[field9749 + 1];
                class771 var369 = class734.field10126.method709((byte) 126, var368);
                if (var369.method4253((byte) -92)) {
                    field9761[field9745++] = class390.field5558.method3065(41, var367).method1888(var368, var369.field10604, 40);
                    return;
                }
                field9763[field9749++] = class390.field5558.method3065(-124, var367).method1894(var368, (byte) -81, var369.field10602);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field9749 -= 2;
                int var370 = field9763[field9749];
                int var371 = field9763[field9749 + 1];
                class771 var372 = class734.field10126.method709((byte) 124, var371);
                if (var372.method4253((byte) -105)) {
                    field9761[field9745++] = class616.field8649.method2429(var370, 98).method569(var371, var372.field10604, (byte) 121);
                    return;
                }
                field9763[field9749++] = class616.field8649.method2429(var370, 123).method570((byte) -65, var372.field10602, var371);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field9763[--field9749];
                class148 var374 = class671.field9419.method2879((byte) 77, var373);
                if (var374.field1898 != null && var374.field1898.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field1900[0];
                    for (int var377 = 1; var377 < var374.field1898.length; var377++) {
                        if (var374.field1900[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field1900[var377];
                        }
                    }
                    field9763[field9749++] = var374.field1898[var375];
                    return;
                }
                field9763[field9749++] = var374.field1892;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field9763[field9749++] = class199.field2812 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field9761[--field9745];
                if (class664.field9331 == 7 && class567.field7992 == 0) {
                    if (var378.length() > 20) {
                        class308.field4452 = -4;
                        return;
                    }
                    class308.field4452 = -1;
                    class116 var379 = class248.method1672(class84.field1023, class514.field7057, -20647);
                    var379.field1575.method3005(255, 0);
                    int var380 = var379.field1575.field6962;
                    var379.field1575.method3037(0, var378);
                    var379.field1575.method2985((byte) -57, var379.field1575.field6962 - var380);
                    class443.method2655(0, var379);
                    return;
                }
                class308.field4452 = -5;
                return;
            }
            if (arg0 == 4702) {
                field9763[field9749++] = class308.field4452;
                if (class308.field4452 != -1) {
                    class308.field4452 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)I")
    private static final int method3964(int arg0) {
        class268 var1 = class326.field4583.method1350(54, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field9755.method400(var1.field3890, 7222, var1.field3888, class327.field4603.field10814 << 16 | var1.field3883);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(I)V")
    private static final void method3965(int arg0) {
        class115 var1 = class384.method2387(false, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class115[] var3 = class558.field7840[var2];
        if (var3 == null) {
            class115[] var4 = class609.field8594[var2];
            int var5 = var4.length;
            var3 = class558.field7840[var2] = new class115[var5];
            class335.method2123(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class335.method2123(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
