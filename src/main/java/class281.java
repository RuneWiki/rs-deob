import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class281 {

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field3493 = new String[1000];

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    private static int field3497 = 0;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
    private static int[] field3492 = new int[1000];

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    private static int field3503 = 0;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "[I")
    private static int[] field3509 = new int[5];

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "[[I")
    private static int[][] field3510 = new int[5][5000];

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "[Luh;")
    private static class528[] field3496 = new class528[50];

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    private static int field3515 = 0;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3512 = Calendar.getInstance();

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field3517 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "[I")
    private static int[] field3518 = new int[3];

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Lad;")
    public static class19 field3516 = new class19(4);

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    private static int field3519 = 0;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Lqt;")
    private static class403 field3494;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lwp;")
    private static class452 field3500;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lwp;")
    private static class452 field3505;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "[I")
    private static int[] field3495;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field3507;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1637(int arg0) {
        if (arg0 == -1 || !class255.method1506(arg0, (byte) 113)) {
            return;
        }
        class452[] var1 = class102.field1106[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class452 var3 = var1[var2];
            if (var3.field6391 != null) {
                class213 var4 = new class213();
                var4.field2592 = var3;
                var4.field2587 = var3.field6391;
                method1643(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V", line = 32)
    public static final void method1638(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(IZ)V", line = 40)
    private static final void method1639(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field3492[field3515++] = class593.field8376;
                return;
            }
            if (arg0 == 5001) {
                field3515 -= 3;
                class593.field8376 = field3492[field3515];
                class571.field8109 = class415.method2337(10, field3492[field3515 + 1]);
                if (class571.field8109 == null) {
                    class571.field8109 = class412.field5525;
                }
                class182.field2050 = field3492[field3515 + 2];
                field3504++;
                class653 var2 = class699.method3845((byte) 45, class39.field395, class359.field4805);
                var2.field9158.method658(class593.field8376, (byte) 69);
                var2.field9158.method658(class571.field8109.field4651, (byte) 122);
                var2.field9158.method658(class182.field2050, (byte) 62);
                class568.method3220(var2, (byte) 74);
                return;
            }
            if (arg0 == 5002) {
                field3503 -= 2;
                String var3 = field3493[field3503];
                String var4 = field3493[field3503 + 1];
                field3515 -= 2;
                int var5 = field3492[field3515];
                int var6 = field3492[field3515 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field3514++;
                class653 var7 = class699.method3845((byte) 45, class39.field395, class106.field1143);
                var7.field9158.method658(class72.method382(2018672392, var3) + class72.method382(2018672392, var4) + 2, (byte) 103);
                var7.field9158.method672((byte) 104, var3);
                var7.field9158.method658(var5 - 1, (byte) 51);
                var7.field9158.method658(var6, (byte) 65);
                var7.field9158.method672((byte) -106, var4);
                class568.method3220(var7, (byte) 47);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field3492[--field3515];
                class192 var9 = class645.method3616(false, var8);
                String var10 = "";
                if (var9 != null && var9.field2223 != null) {
                    var10 = var9.field2223;
                }
                field3493[field3503++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field3492[--field3515];
                class192 var12 = class645.method3616(false, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2220;
                }
                field3492[field3515++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class571.field8109 == null) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = class571.field8109.field4651;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field3492[--field3515];
                class653 var15 = class699.method3845((byte) 45, class39.field395, class459.field6519);
                var15.field9158.method658(var14, (byte) 87);
                class568.method3220(var15, (byte) 100);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field3493[--field3503];
                method1640(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field3503 -= 2;
                String var17 = field3493[field3503];
                String var18 = field3493[field3503 + 1];
                if (class296.field3704 != 0 || (!class443.field6260 || class329.field4036) && !class383.field5175) {
                    field3511++;
                    class653 var19 = class699.method3845((byte) 45, class39.field395, class222.field2759);
                    var19.field9158.method658(0, (byte) 91);
                    int var20 = var19.field9158.field1218;
                    var19.field9158.method672((byte) 57, var17);
                    class365.method2130(var18, var19.field9158, 4);
                    var19.field9158.method642(var19.field9158.field1218 - var20, true);
                    class568.method3220(var19, (byte) 102);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field3492[--field3515];
                class192 var22 = class645.method3616(false, var21);
                String var23 = "";
                if (var22 != null && var22.field2230 != null) {
                    var23 = var22.field2230;
                }
                field3493[field3503++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field3492[--field3515];
                class192 var25 = class645.method3616(false, var24);
                String var26 = "";
                if (var25 != null && var25.field2231 != null) {
                    var26 = var25.field2231;
                }
                field3493[field3503++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field3492[--field3515];
                class192 var28 = class645.method3616(false, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2224;
                }
                field3492[field3515++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class362.field4859 == null || class362.field4859.field2927 == null) {
                    var30 = class465.field6648;
                } else {
                    var30 = class362.field4859.method1418(-26900, true);
                }
                field3493[field3503++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field3492[field3515++] = class182.field2050;
                return;
            }
            if (arg0 == 5017) {
                field3492[field3515++] = class103.method559(false);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field3492[--field3515];
                class192 var32 = class645.method3616(false, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2233;
                }
                field3492[field3515++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field3492[--field3515];
                class192 var35 = class645.method3616(false, var34);
                String var36 = "";
                if (var35 != null && var35.field2228 != null) {
                    var36 = var35.field2228;
                }
                field3493[field3503++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class362.field4859 == null || class362.field4859.field2927 == null) {
                    var37 = class465.field6648;
                } else {
                    var37 = class362.field4859.method1412(false, 131072);
                }
                field3493[field3503++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field3492[--field3515];
                class192 var39 = class645.method3616(false, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2222;
                }
                field3492[field3515++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field3492[--field3515];
                class192 var42 = class645.method3616(false, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2225;
                }
                field3492[field3515++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field3492[--field3515];
                class192 var45 = class645.method3616(false, var44);
                String var46 = "";
                if (var45 != null && var45.field2227 != null) {
                    var46 = var45.field2227;
                }
                field3493[field3503++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field3492[--field3515];
                field3493[field3503++] = class598.field8428.method2572(true, var47).field3248;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field3492[--field3515];
                class258 var49 = class598.field8428.method2572(true, var48);
                if (var49.field3246 == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = var49.field3246.length;
                return;
            }
            if (arg0 == 5052) {
                field3515 -= 2;
                int var50 = field3492[field3515];
                int var51 = field3492[field3515 + 1];
                class258 var52 = class598.field8428.method2572(true, var50);
                int var53 = var52.field3246[var51];
                field3492[field3515++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field3492[--field3515];
                class258 var55 = class598.field8428.method2572(true, var54);
                if (var55.field3242 == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = var55.field3242.length;
                return;
            }
            if (arg0 == 5054) {
                field3515 -= 2;
                int var56 = field3492[field3515];
                int var57 = field3492[field3515 + 1];
                field3492[field3515++] = class598.field8428.method2572(true, var56).field3242[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field3492[--field3515];
                field3493[field3503++] = class83.field859.method2211(var58, -27582).method1689(0);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field3492[--field3515];
                class290 var60 = class83.field859.method2211(var59, -27582);
                if (var60.field3624 == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = var60.field3624.length;
                return;
            }
            if (arg0 == 5057) {
                field3515 -= 2;
                int var61 = field3492[field3515];
                int var62 = field3492[field3515 + 1];
                field3492[field3515++] = class83.field859.method2211(var61, -27582).field3624[var62];
                return;
            }
            if (arg0 == 5058) {
                field3494 = new class403();
                field3494.field5400 = field3492[--field3515];
                field3494.field5396 = class83.field859.method2211(field3494.field5400, -27582);
                field3494.field5398 = new int[field3494.field5396.method1687((byte) 6)];
                return;
            }
            if (arg0 == 5059) {
                field3491++;
                class653 var63 = class699.method3845((byte) 45, class39.field395, class138.field1522);
                var63.field9158.method658(0, (byte) 59);
                int var64 = var63.field9158.field1218;
                var63.field9158.method658(0, (byte) 104);
                var63.field9158.method645(-672168216, field3494.field5400);
                field3494.field5396.method1693(field3494.field5398, var63.field9158, 0);
                var63.field9158.method642(var63.field9158.field1218 - var64, true);
                class568.method3220(var63, (byte) 83);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field3493[--field3503];
                field3502++;
                class653 var66 = class699.method3845((byte) 45, class39.field395, class435.field6144);
                var66.field9158.method658(0, (byte) 53);
                int var67 = var66.field9158.field1218;
                var66.field9158.method672((byte) -108, var65);
                var66.field9158.method645(-672168216, field3494.field5400);
                field3494.field5396.method1693(field3494.field5398, var66.field9158, 0);
                var66.field9158.method642(var66.field9158.field1218 - var67, true);
                class568.method3220(var66, (byte) 96);
                return;
            }
            if (arg0 == 5061) {
                field3491++;
                class653 var68 = class699.method3845((byte) 45, class39.field395, class138.field1522);
                var68.field9158.method658(0, (byte) 54);
                int var69 = var68.field9158.field1218;
                var68.field9158.method658(1, (byte) 100);
                var68.field9158.method645(-672168216, field3494.field5400);
                field3494.field5396.method1693(field3494.field5398, var68.field9158, 0);
                var68.field9158.method642(var68.field9158.field1218 - var69, true);
                class568.method3220(var68, (byte) 89);
                return;
            }
            if (arg0 == 5062) {
                field3515 -= 2;
                int var70 = field3492[field3515];
                int var71 = field3492[field3515 + 1];
                field3492[field3515++] = class598.field8428.method2572(true, var70).field3250[var71];
                return;
            }
            if (arg0 == 5063) {
                field3515 -= 2;
                int var72 = field3492[field3515];
                int var73 = field3492[field3515 + 1];
                field3492[field3515++] = class598.field8428.method2572(true, var72).field3243[var73];
                return;
            }
            if (arg0 == 5064) {
                field3515 -= 2;
                int var74 = field3492[field3515];
                int var75 = field3492[field3515 + 1];
                if (var75 == -1) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = class598.field8428.method2572(true, var74).method1527((char) var75, -1);
                return;
            }
            if (arg0 == 5065) {
                field3515 -= 2;
                int var76 = field3492[field3515];
                int var77 = field3492[field3515 + 1];
                if (var77 == -1) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = class598.field8428.method2572(true, var76).method1531((char) var77, (byte) 99);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field3492[--field3515];
                field3492[field3515++] = class83.field859.method2211(var78, -27582).method1687((byte) -96);
                return;
            }
            if (arg0 == 5067) {
                field3515 -= 2;
                int var79 = field3492[field3515];
                int var80 = field3492[field3515 + 1];
                int var81 = class83.field859.method2211(var79, -27582).method1688(var80, 111).field4792;
                field3492[field3515++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field3515 -= 2;
                int var82 = field3492[field3515];
                int var83 = field3492[field3515 + 1];
                field3494.field5398[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field3515 -= 2;
                int var84 = field3492[field3515];
                int var85 = field3492[field3515 + 1];
                field3494.field5398[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field3515 -= 3;
                int var86 = field3492[field3515];
                int var87 = field3492[field3515 + 1];
                int var88 = field3492[field3515 + 2];
                class290 var89 = class83.field859.method2211(var86, -27582);
                if (var89.method1688(var87, 118).field4792 != 0) {
                    throw new RuntimeException("bad command");
                }
                field3492[field3515++] = var89.method1696(var88, false, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field3493[--field3503];
                boolean var91 = field3492[--field3515] == 1;
                class133.method748(var90, -31961, var91);
                field3492[field3515++] = class613.field8624;
                return;
            }
            if (arg0 == 5072) {
                if (class578.field8185 != null && class220.field2625 < class613.field8624) {
                    field3492[field3515++] = class578.field8185[class220.field2625++] & 0xFFFF;
                    return;
                }
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class220.field2625 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class140.field1549.method1945(86, false)) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class140.field1549.method1945(82, false)) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class140.field1549.method1945(81, false)) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class8.method51(-113, field3492[--field3515]);
                return;
            }
            if (arg0 == 5201) {
                field3492[field3515++] = class146.method805(-4569);
                return;
            }
            if (arg0 == 5205) {
                class185.method1124(-1, field3492[--field3515], -1, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field3492[--field3515];
                class440 var93 = class482.method2776(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = var93.field6178;
                return;
            }
            if (arg0 == 5207) {
                class440 var94 = class482.method2775(field3492[--field3515]);
                if (var94 != null && var94.field6180 != null) {
                    field3493[field3503++] = var94.field6180;
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 5208) {
                field3492[field3515++] = class554.field7914;
                field3492[field3515++] = class100.field1079;
                return;
            }
            if (arg0 == 5209) {
                field3492[field3515++] = class81.field838 + class482.field6943;
                field3492[field3515++] = class482.field6951 + class36.field373;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field3492[--field3515];
                class440 var96 = class482.method2775(var95);
                if (var96 == null) {
                    field3492[field3515++] = 0;
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = var96.field6169 >> 14 & 0x3FFF;
                field3492[field3515++] = var96.field6169 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field3492[--field3515];
                class440 var98 = class482.method2775(var97);
                if (var98 == null) {
                    field3492[field3515++] = 0;
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = var98.field6175 - var98.field6176;
                field3492[field3515++] = var98.field6182 - var98.field6168;
                return;
            }
            if (arg0 == 5212) {
                class679 var99 = class205.method1233(28458);
                if (var99 == null) {
                    field3492[field3515++] = -1;
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = var99.field9562;
                int var100 = var99.field9568 << 28 | class482.field6943 + var99.field9572 << 14 | class482.field6951 + var99.field9563;
                field3492[field3515++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class679 var101 = class651.method3631((byte) -89);
                if (var101 == null) {
                    field3492[field3515++] = -1;
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = var101.field9562;
                int var102 = var101.field9568 << 28 | class482.field6943 + var101.field9572 << 14 | class482.field6951 + var101.field9563;
                field3492[field3515++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field3492[--field3515];
                class440 var104 = class221.method1303((byte) 127);
                if (var104 != null) {
                    boolean var105 = var104.method2540(-25551, var103 >> 14 & 0x3FFF, var103 & 0x3FFF, field3518, var103 >> 28 & 0x3);
                    if (var105) {
                        class122.method701(field3518[1], (byte) -82, field3518[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field3515 -= 2;
                int var106 = field3492[field3515];
                int var107 = field3492[field3515 + 1];
                class288 var108 = class482.method2789(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class440 var110 = (class440) var108.method1677(-93); var110 != null; var110 = (class440) var108.method1681(75)) {
                    if (var110.field6178 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field3492[--field3515];
                class440 var112 = class482.method2775(var111);
                if (var112 == null) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = var112.field6170;
                return;
            }
            if (arg0 == 5220) {
                field3492[field3515++] = class96.field1028 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field3492[--field3515];
                class122.method701(var113 >> 14 & 0x3FFF, (byte) -53, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class440 var114 = class221.method1303((byte) 123);
                if (var114 != null) {
                    boolean var115 = var114.method2543(class81.field838 + class482.field6943, field3518, class482.field6951 + class36.field373, (byte) -4);
                    if (var115) {
                        field3492[field3515++] = field3518[1];
                        field3492[field3515++] = field3518[2];
                        return;
                    }
                    field3492[field3515++] = -1;
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = -1;
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field3515 -= 2;
                int var116 = field3492[field3515];
                int var117 = field3492[field3515 + 1];
                class185.method1124(var117 >> 14 & 0x3FFF, var116, var117 & 0x3FFF, -1, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field3492[--field3515];
                class440 var119 = class221.method1303((byte) 126);
                if (var119 != null) {
                    boolean var120 = var119.method2540(-25551, var118 >> 14 & 0x3FFF, var118 & 0x3FFF, field3518, var118 >> 28 & 0x3);
                    if (var120) {
                        field3492[field3515++] = field3518[1];
                        field3492[field3515++] = field3518[2];
                        return;
                    }
                    field3492[field3515++] = -1;
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = -1;
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field3492[--field3515];
                class440 var122 = class221.method1303((byte) 126);
                if (var122 != null) {
                    boolean var123 = var122.method2543(var121 >> 14 & 0x3FFF, field3518, var121 & 0x3FFF, (byte) 124);
                    if (var123) {
                        field3492[field3515++] = field3518[1];
                        field3492[field3515++] = field3518[2];
                        return;
                    }
                    field3492[field3515++] = -1;
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = -1;
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class212.method1258((byte) -61, field3492[--field3515]);
                return;
            }
            if (arg0 == 5227) {
                field3515 -= 2;
                int var124 = field3492[field3515];
                int var125 = field3492[field3515 + 1];
                class185.method1124(var125 >> 14 & 0x3FFF, var124, var125 & 0x3FFF, -1, true);
                return;
            }
            if (arg0 == 5228) {
                class156.field1747 = field3492[--field3515] == 1;
                return;
            }
            if (arg0 == 5229) {
                field3492[field3515++] = class156.field1747 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field3492[--field3515];
                class240.method1428(8, var126);
                return;
            }
            if (arg0 == 5231) {
                field3515 -= 2;
                int var127 = field3492[field3515];
                boolean var128 = field3492[field3515 + 1] == 1;
                if (class407.field5438 != null) {
                    class333 var129 = class407.field5438.method3669((long) var127, -1);
                    if (var129 != null && !var128) {
                        var129.method1922(101);
                        return;
                    }
                    if (var129 == null && var128) {
                        class333 var130 = new class333();
                        class407.field5438.method3671(false, var130, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field3492[--field3515];
                if (class407.field5438 != null) {
                    class333 var132 = class407.field5438.method3669((long) var131, -1);
                    field3492[field3515++] = var132 == null ? 0 : 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field3515 -= 2;
                int var133 = field3492[field3515];
                boolean var134 = field3492[field3515 + 1] == 1;
                if (class692.field9718 != null) {
                    class333 var135 = class692.field9718.method3669((long) var133, -1);
                    if (var135 != null && !var134) {
                        var135.method1922(77);
                        return;
                    }
                    if (var135 == null && var134) {
                        class333 var136 = new class333();
                        class692.field9718.method3671(false, var136, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field3492[--field3515];
                if (class692.field9718 != null) {
                    class333 var138 = class692.field9718.method3669((long) var137, -1);
                    field3492[field3515++] = var138 == null ? 0 : 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field3492[field3515++] = class482.field6929 == null ? -1 : class482.field6929.field6178;
                return;
            }
            if (arg0 == 5236) {
                field3515 -= 2;
                int var139 = field3492[field3515];
                int var140 = field3492[field3515 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class497.method2871(var142, var139, var141, (byte) -87);
                if (var143 < 0) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class352.method2086((byte) 90);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field3515 -= 2;
                int var144 = field3492[field3515];
                int var145 = field3492[field3515 + 1];
                class103.method561(false, (byte) 15, var144, var145, 3);
                field3492[field3515++] = class619.field8759 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class619.field8759 != null) {
                    class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
                }
                return;
            }
            if (arg0 == 5302) {
                class7[] var146 = class387.method2212((byte) -117);
                field3492[field3515++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field3492[--field3515];
                class7[] var148 = class387.method2212((byte) -126);
                field3492[field3515++] = var148[var147].field82;
                field3492[field3515++] = var148[var147].field80;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class639.field9075.field6790;
                int var150 = class639.field9075.field6774;
                int var151 = -1;
                class7[] var152 = class387.method2212((byte) -93);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class7 var154 = var152[var153];
                    if (var154.field82 == var149 && var154.field80 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field3492[field3515++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field3492[field3515++] = class201.method1206(102);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field3492[--field3515];
                if (var155 >= 1 && var155 <= 2) {
                    class103.method561(false, (byte) 15, -1, -1, var155);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field3492[field3515++] = class639.field9075.field6791;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field3492[--field3515];
                if (var156 >= 1 && var156 <= 2) {
                    class639.field9075.field6791 = var156;
                    class639.field9075.method2642(-2, class353.field4757);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field3503 -= 2;
                String var157 = field3493[field3503];
                String var158 = field3493[field3503 + 1];
                int var159 = field3492[--field3515];
                field3498++;
                class653 var160 = class699.method3845((byte) 45, class39.field395, class376.field5115);
                var160.field9158.method658(class72.method382(2018672392, var157) + class72.method382(2018672392, var158) + 1, (byte) 114);
                var160.field9158.method672((byte) 101, var157);
                var160.field9158.method672((byte) -127, var158);
                var160.field9158.method658(var159, (byte) 78);
                class568.method3220(var160, (byte) 31);
                return;
            }
            if (arg0 == 5401) {
                field3515 -= 2;
                class45.field472[field3492[field3515]] = (short) class672.method3714(field3492[field3515 + 1], (byte) 31);
                class19.field153.method281(118);
                class19.field153.method273(false);
                class369.field5055.method337(5);
                class64.method346(8);
                return;
            }
            if (arg0 == 5405) {
                field3515 -= 2;
                int var161 = field3492[field3515];
                int var162 = field3492[field3515 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class394.field5342[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field3515 -= 7;
                int var163 = field3492[field3515];
                int var164 = field3492[field3515 + 1] << 1;
                int var165 = field3492[field3515 + 2];
                int var166 = field3492[field3515 + 3];
                int var167 = field3492[field3515 + 4];
                int var168 = field3492[field3515 + 5];
                int var169 = field3492[field3515 + 6];
                if (var163 >= 0 && var163 < 2 && class394.field5342[var163] != null && var164 >= 0 && var164 < class394.field5342[var163].length) {
                    class394.field5342[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class394.field5342[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class394.field5342[field3492[--field3515]].length >> 1;
                field3492[field3515++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class619.field8759 != null) {
                    class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
                }
                if (class503.field7242 != null) {
                    class355.method2097((byte) -121);
                    System.exit(0);
                    return;
                }
                String var171 = class443.field6259 == null ? class141.method783(0) : class443.field6259;
                class94.method482(false, (byte) -56, class353.field4757, var171, class430.field6109 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class100.field1077 != null) {
                    if (class100.field1077.field886 == null) {
                        var172 = class260.method1537(false, class100.field1077.field881);
                    } else {
                        var172 = (String) class100.field1077.field886;
                    }
                }
                field3493[field3503++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field3492[field3515++] = class353.field4757.field6614 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class619.field8759 != null) {
                    class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
                }
                String var173 = field3493[--field3503];
                boolean var174 = field3492[--field3515] == 1;
                String var175 = class141.method783(0) + var173;
                class94.method482(var174, (byte) -23, class353.field4757, var175, class430.field6109 == 1);
                return;
            }
            if (arg0 == 5422) {
                field3503 -= 2;
                String var176 = field3493[field3503];
                String var177 = field3493[field3503 + 1];
                int var178 = field3492[--field3515];
                if (var176.length() > 0) {
                    if (class460.field6555 == null) {
                        class460.field6555 = new String[class688.field9676[class246.field3031.field3943]];
                    }
                    class460.field6555[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class210.field2550 == null) {
                        class210.field2550 = new String[class688.field9676[class246.field3031.field3943]];
                    }
                    class210.field2550[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field3493[--field3503]);
                return;
            }
            if (arg0 == 5424) {
                field3515 -= 11;
                class688.field9687 = field3492[field3515];
                class647.field9126 = field3492[field3515 + 1];
                class693.field9724 = field3492[field3515 + 2];
                class129.field1441 = field3492[field3515 + 3];
                class416.field5577 = field3492[field3515 + 4];
                class373.field5084 = field3492[field3515 + 5];
                class597.field8413 = field3492[field3515 + 6];
                class425.field5988 = field3492[field3515 + 7];
                class311.field3847 = field3492[field3515 + 8];
                class596.field8392 = field3492[field3515 + 9];
                class31.field298 = field3492[field3515 + 10];
                class408.field5441.method3849(class416.field5577, false);
                class408.field5441.method3849(class373.field5084, false);
                class408.field5441.method3849(class597.field8413, false);
                class408.field5441.method3849(class425.field5988, false);
                class408.field5441.method3849(class311.field3847, false);
                class169.field1887 = null;
                class262.field3268 = null;
                class674.field9378 = null;
                class8.field88 = null;
                class128.field1438 = null;
                class699.field9807 = null;
                class430.field6107 = null;
                class563.field8047 = null;
                class213.field2597 = true;
                return;
            }
            if (arg0 == 5425) {
                class479.method2757((byte) -118);
                class213.field2597 = false;
                return;
            }
            if (arg0 == 5426) {
                field3515 -= 2;
                class176.field1966 = field3492[field3515];
                class329.field4032 = field3492[field3515 + 1];
                return;
            }
            if (arg0 == 5427) {
                field3515 -= 2;
                class469.field6707 = field3492[field3515 + 1];
                return;
            }
            if (arg0 == 5428) {
                field3515 -= 2;
                int var179 = field3492[field3515];
                int var180 = field3492[field3515 + 1];
                field3492[field3515++] = class51.method266((byte) 103, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class353.method2088(false, false, field3493[--field3503], -1);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class627.method3524("accountcreated", class591.field8347, 23421);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class627.method3524("accountcreatestarted", class591.field8347, 23421);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class128.field1437 != null) {
                    Transferable var182 = class128.field1437.getContents(null);
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
                field3493[field3503++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field3515 -= 4;
                int var183 = field3492[field3515];
                int var184 = field3492[field3515 + 1];
                int var185 = field3492[field3515 + 2];
                int var186 = field3492[field3515 + 3];
                class236.method1406((var183 & 0x3FFF) - class231.field2860, var186, -18279, false, var185, var184 << 2, (var183 >> 14 & 0x3FFF) - class26.field245);
                return;
            }
            if (arg0 == 5501) {
                field3515 -= 4;
                int var187 = field3492[field3515];
                int var188 = field3492[field3515 + 1];
                int var189 = field3492[field3515 + 2];
                int var190 = field3492[field3515 + 3];
                class552.method3131(var189, var188 << 2, var190, 3072, (var187 & 0x3FFF) - class231.field2860, (var187 >> 14 & 0x3FFF) - class26.field245);
                return;
            }
            if (arg0 == 5502) {
                field3515 -= 6;
                int var191 = field3492[field3515];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class597.field8414 = var191;
                int var192 = field3492[field3515 + 1];
                if (var192 + 1 >= class394.field5342[class597.field8414].length >> 1) {
                    throw new RuntimeException();
                }
                class147.field1629 = var192;
                class268.field3339 = 0;
                class122.field1356 = field3492[field3515 + 2];
                class254.field3182 = field3492[field3515 + 3];
                int var193 = field3492[field3515 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class358.field4797 = var193;
                int var194 = field3492[field3515 + 5];
                if (var194 + 1 >= class394.field5342[class358.field4797].length >> 1) {
                    throw new RuntimeException();
                }
                class487.field7048 = var194;
                class538.field7572 = 3;
                class510.field7319 = -1;
                class307.field3791 = -1;
                return;
            }
            if (arg0 == 5503) {
                class573.method3235(-97);
                return;
            }
            if (arg0 == 5504) {
                field3515 -= 2;
                class700.method3847((byte) -109, field3492[field3515], 0, field3492[field3515 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field3492[field3515++] = (int) class654.field9173 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field3492[field3515++] = (int) class508.field7300 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class341.method1968(-19);
                return;
            }
            if (arg0 == 5508) {
                class353.method2087(-1152722743);
                return;
            }
            if (arg0 == 5509) {
                class432.method2484(true);
                return;
            }
            if (arg0 == 5510) {
                class217.method1267(true);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field3492[--field3515];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class26.field245;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class142.field1574) {
                    var198 = class142.field1574;
                }
                int var199 = var197 - class231.field2860;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class140.field1550) {
                    var199 = class140.field1550;
                }
                class672.field9356 = (var198 << 9) + 256;
                class436.field6158 = (var199 << 9) + 256;
                class538.field7572 = 4;
                class510.field7319 = -1;
                class307.field3791 = -1;
                return;
            }
            if (arg0 == 5512) {
                class269.method1585(false);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field3492[--field3515];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class26.field245;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class142.field1574) {
                        var203 = class142.field1574;
                    }
                    int var204 = var202 - class231.field2860;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class140.field1550) {
                        var204 = class140.field1550;
                    }
                    class307.field3791 = (var203 << 9) + 256;
                    class510.field7319 = (var204 << 9) + 256;
                    return;
                }
                class307.field3791 = -1;
                class510.field7319 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field3503 -= 2;
                String var205 = field3493[field3503];
                String var206 = field3493[field3503 + 1];
                int var207 = field3492[--field3515];
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    class465.field6648 = var205;
                    class79.field803 = var206;
                    class445.field6273 = var207;
                    class585.method3308(6, 22731);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class296.method1728((byte) -28);
                return;
            }
            if (arg0 == 5602) {
                if (class579.field8191 == 0) {
                    class475.field6853 = -2;
                    class89.field890 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field3515 -= 4;
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    class151.method819(field3492[field3515 + 1], field3492[field3515], field3492[field3515 + 3], 22, field3492[field3515 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field3503--;
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    class192.method1169(class266.method1569(field3493[field3503], (byte) 52), false);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field3503 -= 2;
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    class81.method432(class266.method1569(field3493[field3503], (byte) 22), field3493[field3503 + 1], false, -16289);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class654.field9183 == 0) {
                    class239.field2965 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field3492[field3515++] = class89.field890;
                return;
            }
            if (arg0 == 5608) {
                field3492[field3515++] = class365.field4908;
                return;
            }
            if (arg0 == 5609) {
                field3492[field3515++] = class239.field2965;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field3493[field3503++] = class678.field9538 == null || class678.field9538.length <= var208 ? "" : class469.method2710(-70, class678.field9538[var208]);
                }
                class678.field9538 = null;
                return;
            }
            if (arg0 == 5611) {
                field3492[field3515++] = class48.field503;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field3492[--field3515];
                if (class421.field5601 != 7) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    if (class99.field1061 != null) {
                        class99.field1061.method1509(0);
                        class99.field1061 = null;
                    }
                    class445.field6273 = var209;
                    class585.method3308(9, 22731);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field3492[field3515++] = class89.field890;
                return;
            }
            if (arg0 == 5615) {
                field3503 -= 2;
                String var210 = field3493[field3503];
                String var211 = field3493[field3503 + 1];
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    if (class99.field1061 != null) {
                        class99.field1061.method1509(0);
                        class99.field1061 = null;
                    }
                    class465.field6648 = var210;
                    class79.field803 = var211;
                    class585.method3308(5, 22731);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class73.method394(0, false);
                return;
            }
            if (arg0 == 5617) {
                field3492[field3515++] = class475.field6853;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field3492[--field3515];
                class229.method1376(false, false, var212);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field3492[--field3515];
                class229.method1376(true, false, var213);
                return;
            }
            if (arg0 == 5620) {
                class194.method1176((byte) 45);
                if (class705.field9907 != "" && class705.field9907 != "") {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field3503 -= 2;
                if (class421.field5601 != 3) {
                    return;
                }
                if (class579.field8191 == 0 && class654.field9183 == 0) {
                    class81.method432(class266.method1569(field3493[field3503], (byte) 65), field3493[field3503 + 1], true, -16289);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class88 var214 = class353.field4757.method2682("3", false, (byte) -16);
                while (var214.field884 == 0) {
                    class452.method2602(1L, (byte) -97);
                }
                if (var214.field884 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class5 var215 = (class5) var214.field886;
                if (var215.method40(-47).exists()) {
                    class115 var216 = new class115(50);
                    try {
                        var215.method38(79, 50, 0, var216.field1269);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method37(-1);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class463.field6589 != null) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field3492[field3515++] = (int) (class658.field9243 >> 32);
                field3492[field3515++] = (int) (class658.field9243 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field3492[--field3515];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class639.field9075.field6763 = var217;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6002) {
                class639.field9075.method2650(false, field3492[--field3515] == 1);
                class403.method2266((byte) 80);
                class359.method2109((byte) -114);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6003) {
                class639.field9075.field6783 = field3492[--field3515] == 1;
                class359.method2109((byte) -123);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6005) {
                class639.field9075.field6796 = field3492[--field3515] == 1;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6006) {
                class639.field9075.field6775 = field3492[--field3515] == 1;
                class701.field9813.method1015(!class639.field9075.field6775);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6007) {
                class639.field9075.field6803 = field3492[--field3515];
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6008) {
                class639.field9075.field6780 = field3492[--field3515] == 1;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6009) {
                class639.field9075.field6795 = field3492[--field3515] == 1;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6010) {
                class639.field9075.field6760 = field3492[--field3515] == 1;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field3492[--field3515];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class639.field9075.method2719(var218, (byte) 55, class430.field6109);
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6012) {
                class639.field9075.method2716(class430.field6109, (byte) 36, field3492[--field3515] == 1);
                class114.method609(117);
                class173.method1055(1678);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6014) {
                class639.field9075.field6794 = field3492[--field3515] == 1;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6015) {
                class639.field9075.field6781 = field3492[--field3515] == 1;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field3492[--field3515];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class639.field9075.field6769 = var219;
                class434.method2489(class430.field6109, (byte) -107);
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6017) {
                class639.field9075.field6784 = field3492[--field3515] == 1;
                class446.method2587(-111);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field3492[--field3515];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class639.field9075.field6773 = var220;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field3492[--field3515];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class639.field9075.field6764 != var221) {
                    if (class639.field9075.field6764 == 0 && class331.field4169 != -1) {
                        class193.method1175(0, class331.field4169, class536.field7504, 0, var221, false);
                        class19.field151 = false;
                    } else if (var221 == 0) {
                        class279.method1629(true);
                        class19.field151 = false;
                    } else {
                        class234.method1391(var221, 0);
                    }
                    class639.field9075.field6764 = var221;
                }
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field3492[--field3515];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class639.field9075.field6809 = var222;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6021) {
                class639.field9075.field6542 = field3492[--field3515] == 1;
                class359.method2109((byte) -105);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field3492[--field3515];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class689.field9702 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class274.method1609(120, var223);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                field3492[field3515++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field3492[--field3515];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class639.field9075.field6786 = var225;
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field3492[--field3515];
                if (var226 < 0 || var226 > class118.method691(class689.field9702, (byte) -128)) {
                    var226 = 0;
                }
                class639.field9075.field6797 = var226;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field3492[--field3515];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class700.method3848(var227 == 1, 114);
                return;
            }
            if (arg0 == 6028) {
                class639.field9075.field6785 = field3492[--field3515] != 0;
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6029) {
                class639.field9075.field6803 = field3492[--field3515];
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6030) {
                class639.field9075.field6792 = field3492[--field3515] != 0;
                class639.field9075.method2642(-2, class353.field4757);
                class403.method2266((byte) 80);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field3492[--field3515];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class434.method2489(var228, (byte) -118);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field3492[--field3515];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class639.field9075.field6777 = var229;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field3492[--field3515];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class639.field9075.field6789 = var230;
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6034) {
                class639.field9075.field6770 = field3492[--field3515] == 1;
                class639.field9075.method2642(-2, class353.field4757);
                class114.method609(-111);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6035) {
                class639.field9075.field6536 = field3492[--field3515] == 1;
                class403.method2266((byte) 80);
                class359.method2109((byte) -120);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field3492[--field3515];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class639.field9075.method2632(-31628, var231);
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field3492[--field3515];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class639.field9075.field6776 = var232;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field3492[--field3515];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class639.field9075.field6767 != var233 && class699.field9802 == class331.field4169) {
                    if (class639.field9075.field6767 == 0) {
                        class193.method1175(0, class331.field4169, class536.field7504, 0, var233, false);
                        class19.field151 = false;
                    } else if (var233 == 0) {
                        class279.method1629(true);
                        class19.field151 = false;
                    } else {
                        class234.method1391(var233, 0);
                    }
                }
                class639.field9075.field6767 = var233;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field3492[--field3515];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class639.field9075.field6761 != var234) {
                    class639.field9075.field6761 = var234;
                    class639.field9075.method2642(-2, class353.field4757);
                    class389.field5269 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field3492[field3515++] = class639.field9075.field6763;
                return;
            }
            if (arg0 == 6102) {
                field3492[field3515++] = class639.field9075.method2644(class430.field6109, (byte) -92) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field3492[field3515++] = class639.field9075.field6783 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field3492[field3515++] = class639.field9075.field6796 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field3492[field3515++] = class639.field9075.field6775 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field3492[field3515++] = class639.field9075.field6803;
                return;
            }
            if (arg0 == 6108) {
                field3492[field3515++] = class639.field9075.field6780 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field3492[field3515++] = class639.field9075.field6795 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field3492[field3515++] = class639.field9075.field6760 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field3492[field3515++] = class639.field9075.method2720((byte) -104, class430.field6109);
                return;
            }
            if (arg0 == 6112) {
                field3492[field3515++] = class639.field9075.method2718(class430.field6109, (byte) 76) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field3492[field3515++] = class639.field9075.field6794 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field3492[field3515++] = class639.field9075.field6781 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field3492[field3515++] = class639.field9075.field6769;
                return;
            }
            if (arg0 == 6117) {
                field3492[field3515++] = class639.field9075.field6784 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field3492[field3515++] = class639.field9075.field6773;
                return;
            }
            if (arg0 == 6119) {
                field3492[field3515++] = class639.field9075.field6764;
                return;
            }
            if (arg0 == 6120) {
                field3492[field3515++] = class639.field9075.field6809;
                return;
            }
            if (arg0 == 6121) {
                field3492[field3515++] = class701.field9813.method1008() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field3492[field3515++] = class475.method2737(2);
                return;
            }
            if (arg0 == 6124) {
                field3492[field3515++] = class639.field9075.field6786;
                return;
            }
            if (arg0 == 6125) {
                field3492[field3515++] = class639.field9075.field6797;
                return;
            }
            if (arg0 == 6126) {
                field3492[field3515++] = class701.field9813.method994() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field3492[field3515++] = class639.field9075.field6771 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field3492[field3515++] = class639.field9075.field6785 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field3492[field3515++] = class639.field9075.field6803;
                return;
            }
            if (arg0 == 6130) {
                field3492[field3515++] = class639.field9075.field6792 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field3492[field3515++] = class430.field6109;
                return;
            }
            if (arg0 == 6132) {
                field3492[field3515++] = class639.field9075.field6777;
                return;
            }
            if (arg0 == 6133) {
                field3492[field3515++] = class353.field4757.field6614 && !class353.field4757.field6611 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field3492[field3515++] = class118.method691(class689.field9702, (byte) -126);
                return;
            }
            if (arg0 == 6135) {
                field3492[field3515++] = class639.field9075.field6789;
                return;
            }
            if (arg0 == 6136) {
                field3492[field3515++] = class639.field9075.field6770 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field3492[field3515++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field3492[field3515++] = class9.method55(200, class430.field6109, true);
                return;
            }
            if (arg0 == 6139) {
                field3492[field3515++] = class639.field9075.method2639(class430.field6109, 31285);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class649.method3628(-91, class430.field6109) && class689.field9702 < 96) {
                    var236 = 1;
                }
                field3492[field3515++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class689.field9702 < 96) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field3492[field3515++] = class639.field9075.field6776;
                return;
            }
            if (arg0 == 6143) {
                field3492[field3515++] = class639.field9075.field6767;
                return;
            }
            if (arg0 == 6144) {
                field3492[field3515++] = class499.field7219 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field3492[field3515++] = class639.field9075.field6761;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field3515 -= 2;
                class461.field6561 = (short) field3492[field3515];
                if (class461.field6561 <= 0) {
                    class461.field6561 = 256;
                }
                class644.field9097 = (short) field3492[field3515 + 1];
                if (class644.field9097 <= 0) {
                    class644.field9097 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field3515 -= 2;
                class124.field1389 = (short) field3492[field3515];
                if (class124.field1389 <= 0) {
                    class124.field1389 = 256;
                }
                class176.field1963 = (short) field3492[field3515 + 1];
                if (class176.field1963 <= 0) {
                    class176.field1963 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field3515 -= 4;
                class558.field7965 = (short) field3492[field3515];
                if (class558.field7965 <= 0) {
                    class558.field7965 = 1;
                }
                class659.field9246 = (short) field3492[field3515 + 1];
                if (class659.field9246 <= 0) {
                    class659.field9246 = 32767;
                } else if (class659.field9246 < class558.field7965) {
                    class659.field9246 = class558.field7965;
                }
                class225.field2782 = (short) field3492[field3515 + 2];
                if (class225.field2782 <= 0) {
                    class225.field2782 = 1;
                }
                class383.field5171 = (short) field3492[field3515 + 3];
                if (class383.field5171 <= 0) {
                    class383.field5171 = 32767;
                    return;
                }
                if (class383.field5171 < class225.field2782) {
                    class383.field5171 = class225.field2782;
                }
                return;
            }
            if (arg0 == 6203) {
                class80.method422(0, false, class492.field7138.field6443, (byte) 14, 0, class492.field7138.field6483);
                field3492[field3515++] = class83.field858;
                field3492[field3515++] = class698.field9793;
                return;
            }
            if (arg0 == 6204) {
                field3492[field3515++] = class124.field1389;
                field3492[field3515++] = class176.field1963;
                return;
            }
            if (arg0 == 6205) {
                field3492[field3515++] = class461.field6561;
                field3492[field3515++] = class644.field9097;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field3492[field3515++] = (int) (class557.method3157(-55) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field3492[field3515++] = (int) (class557.method3157(-77) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field3515 -= 3;
                int var237 = field3492[field3515];
                int var238 = field3492[field3515 + 1];
                int var239 = field3492[field3515 + 2];
                field3512.clear();
                field3512.set(11, 12);
                field3512.set(var239, var238, var237);
                int var240 = (int) (field3512.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field3492[field3515++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field3512.clear();
                field3512.setTime(new Date(class557.method3157(-113)));
                field3492[field3515++] = field3512.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field3492[--field3515];
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
                field3492[field3515++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field3492[field3515++] = class92.method468(65535) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field3492[field3515++] = class507.method2901((byte) 112) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class421.field5601 == 7 && class579.field8191 == 0 && class654.field9183 == 0) {
                    if (class607.field8507) {
                        field3492[field3515++] = 0;
                        return;
                    }
                    if (class458.field6503 > class557.method3157(-123) - 1000L) {
                        field3492[field3515++] = 1;
                        return;
                    }
                    class607.field8507 = true;
                    class653 var243 = class699.method3845((byte) 45, class39.field395, class72.field723);
                    var243.field9158.method660((byte) 49, class647.field9125);
                    class568.method3220(var243, (byte) 79);
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class130 var244 = class24.method117((byte) -119);
                if (var244 != null) {
                    field3492[field3515++] = var244.field1468;
                    field3492[field3515++] = var244.field9794;
                    field3493[field3503++] = var244.field1466;
                    class504 var245 = var244.method739((byte) 96);
                    field3492[field3515++] = var245.field7265;
                    field3493[field3503++] = var245.field7264;
                    field3492[field3515++] = var244.field9795;
                    field3492[field3515++] = var244.field1467;
                    field3493[field3503++] = var244.field1461;
                    return;
                }
                field3492[field3515++] = -1;
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 6502) {
                class130 var246 = class282.method1652(0);
                if (var246 != null) {
                    field3492[field3515++] = var246.field1468;
                    field3492[field3515++] = var246.field9794;
                    field3493[field3503++] = var246.field1466;
                    class504 var247 = var246.method739((byte) 96);
                    field3492[field3515++] = var247.field7265;
                    field3493[field3503++] = var247.field7264;
                    field3492[field3515++] = var246.field9795;
                    field3492[field3515++] = var246.field1467;
                    field3493[field3503++] = var246.field1461;
                    return;
                }
                field3492[field3515++] = -1;
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field3492[--field3515];
                String var249 = field3493[--field3503];
                if (class421.field5601 == 7 && class579.field8191 == 0 && class654.field9183 == 0) {
                    field3492[field3515++] = class291.method1699(var248, var249, 32506) ? 1 : 0;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class639.field9075.field6801 = field3492[--field3515];
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6505) {
                field3492[field3515++] = class639.field9075.field6801;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field3492[--field3515];
                class130 var251 = class63.method345(3, var250);
                if (var251 != null) {
                    field3492[field3515++] = var251.field9794;
                    field3493[field3503++] = var251.field1466;
                    class504 var252 = var251.method739((byte) 96);
                    field3492[field3515++] = var252.field7265;
                    field3493[field3503++] = var252.field7264;
                    field3492[field3515++] = var251.field9795;
                    field3492[field3515++] = var251.field1467;
                    field3493[field3503++] = var251.field1461;
                    return;
                }
                field3492[field3515++] = -1;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                field3492[field3515++] = 0;
                field3492[field3515++] = 0;
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 6507) {
                field3515 -= 4;
                int var253 = field3492[field3515];
                boolean var254 = field3492[field3515 + 1] == 1;
                int var255 = field3492[field3515 + 2];
                boolean var256 = field3492[field3515 + 3] == 1;
                class193.method1174(var255, var256, var254, -116, var253);
                return;
            }
            if (arg0 == 6508) {
                class669.method3701(-121);
                return;
            }
            if (arg0 == 6509) {
                if (class421.field5601 != 7) {
                    return;
                }
                class257.field3237 = field3492[--field3515] == 1;
                return;
            }
            if (arg0 == 6510) {
                field3492[field3515++] = class16.field135;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class639.field9075.field6762 = field3492[--field3515] == 1;
                class639.field9075.method2642(-2, class353.field4757);
                return;
            }
            if (arg0 == 6601) {
                field3492[field3515++] = class639.field9075.field6762 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class416.field5582 == class223.field2771) {
            if (arg0 == 6700) {
                int var257 = class14.field117.method3668(false);
                if (class209.field2466 != -1) {
                    var257++;
                }
                field3492[field3515++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field3492[--field3515];
                if (class209.field2466 != -1) {
                    if (var258 == 0) {
                        field3492[field3515++] = class209.field2466;
                        return;
                    }
                    var258--;
                }
                class633 var259 = (class633) class14.field117.method3674(126);
                while (var258-- > 0) {
                    var259 = (class633) class14.field117.method3672(-1);
                }
                field3492[field3515++] = var259.field8920;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field3492[--field3515];
                if (class102.field1106[var260] == null) {
                    field3493[field3503++] = "";
                    return;
                }
                String var261 = class102.field1106[var260][0].field6426;
                if (var261 == null) {
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field3492[--field3515];
                if (class102.field1106[var262] == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = class102.field1106[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field3515 -= 2;
                int var263 = field3492[field3515];
                int var264 = field3492[field3515 + 1];
                if (class102.field1106[var263] == null) {
                    field3493[field3503++] = "";
                    return;
                }
                String var265 = class102.field1106[var263][var264].field6426;
                if (var265 == null) {
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field3515 -= 2;
                int var266 = field3492[field3515];
                int var267 = field3492[field3515 + 1];
                if (class102.field1106[var266] == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = class102.field1106[var266][var267].field6450;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field3515 -= 3;
                int var268 = field3492[field3515];
                int var269 = field3492[field3515 + 1];
                int var270 = field3492[field3515 + 2];
                class301.method1748(var268 << 16 | var269, 1, 8, "", var270);
                return;
            }
            if (arg0 == 6708) {
                field3515 -= 3;
                int var271 = field3492[field3515];
                int var272 = field3492[field3515 + 1];
                int var273 = field3492[field3515 + 2];
                class301.method1748(var271 << 16 | var272, 2, 8, "", var273);
                return;
            }
            if (arg0 == 6709) {
                field3515 -= 3;
                int var274 = field3492[field3515];
                int var275 = field3492[field3515 + 1];
                int var276 = field3492[field3515 + 2];
                class301.method1748(var274 << 16 | var275, 3, 8, "", var276);
                return;
            }
            if (arg0 == 6710) {
                field3515 -= 3;
                int var277 = field3492[field3515];
                int var278 = field3492[field3515 + 1];
                int var279 = field3492[field3515 + 2];
                class301.method1748(var277 << 16 | var278, 4, 8, "", var279);
                return;
            }
            if (arg0 == 6711) {
                field3515 -= 3;
                int var280 = field3492[field3515];
                int var281 = field3492[field3515 + 1];
                int var282 = field3492[field3515 + 2];
                class301.method1748(var280 << 16 | var281, 5, 8, "", var282);
                return;
            }
            if (arg0 == 6712) {
                field3515 -= 3;
                int var283 = field3492[field3515];
                int var284 = field3492[field3515 + 1];
                int var285 = field3492[field3515 + 2];
                class301.method1748(var283 << 16 | var284, 6, 8, "", var285);
                return;
            }
            if (arg0 == 6713) {
                field3515 -= 3;
                int var286 = field3492[field3515];
                int var287 = field3492[field3515 + 1];
                int var288 = field3492[field3515 + 2];
                class301.method1748(var286 << 16 | var287, 7, 8, "", var288);
                return;
            }
            if (arg0 == 6714) {
                field3515 -= 3;
                int var289 = field3492[field3515];
                int var290 = field3492[field3515 + 1];
                int var291 = field3492[field3515 + 2];
                class301.method1748(var289 << 16 | var290, 8, 8, "", var291);
                return;
            }
            if (arg0 == 6715) {
                field3515 -= 3;
                int var292 = field3492[field3515];
                int var293 = field3492[field3515 + 1];
                int var294 = field3492[field3515 + 2];
                class301.method1748(var292 << 16 | var293, 9, 8, "", var294);
                return;
            }
            if (arg0 == 6716) {
                field3515 -= 3;
                int var295 = field3492[field3515];
                int var296 = field3492[field3515 + 1];
                int var297 = field3492[field3515 + 2];
                class301.method1748(var295 << 16 | var296, 10, 8, "", var297);
                return;
            }
            if (arg0 == 6717) {
                field3515 -= 3;
                int var298 = field3492[field3515];
                int var299 = field3492[field3515 + 1];
                int var300 = field3492[field3515 + 2];
                class452 var301 = class633.method3558(var298 << 16 | var299, -1, var300);
                class204.method1218(79);
                class314 var302 = client.method3750(var301);
                class646.method3618(var301, 0, var302.method1802(1), var302.field3897);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field3492[--field3515];
                class655 var304 = class247.field3060.method705(var303, -124);
                if (var304.field9214 == null) {
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = var304.field9214;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field3492[--field3515];
                class655 var306 = class247.field3060.method705(var305, -128);
                field3492[field3515++] = var306.field9206;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field3492[--field3515];
                class655 var308 = class247.field3060.method705(var307, -124);
                field3492[field3515++] = var308.field9230;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field3492[--field3515];
                class655 var310 = class247.field3060.method705(var309, -125);
                field3492[field3515++] = var310.field9193;
                return;
            }
            if (arg0 == 6804) {
                field3515 -= 2;
                int var311 = field3492[field3515];
                int var312 = field3492[field3515 + 1];
                class166 var313 = class53.field531.method1562(var312, (byte) 43);
                if (var313.method910((byte) 68)) {
                    field3493[field3503++] = class247.field3060.method705(var311, -125).method3640(var312, var313.field1865, false);
                    return;
                }
                field3492[field3515++] = class247.field3060.method705(var311, -128).method3642(var312, 1, var313.field1859);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field3492[field3515++] = class443.field6260 && !class329.field4036 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field3492[field3515++] = class340.field4299;
                return;
            }
            if (arg0 == 6902) {
                field3492[field3515++] = class441.field6217;
                return;
            }
            if (arg0 == 6903) {
                field3492[field3515++] = class646.field9123;
                return;
            }
            if (arg0 == 6904) {
                field3492[field3515++] = class300.field3734;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class100.field1077 != null) {
                    if (class100.field1077.field886 == null) {
                        var314 = class260.method1537(false, class100.field1077.field881);
                    } else {
                        var314 = (String) class100.field1077.field886;
                    }
                }
                field3493[field3503++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field3492[field3515++] = class575.field8164;
                return;
            }
            if (arg0 == 6907) {
                field3492[field3515++] = class599.field8436;
                return;
            }
            if (arg0 == 6908) {
                field3492[field3515++] = class699.field9805;
                return;
            }
            if (arg0 == 6909) {
                field3492[field3515++] = class148.field1632 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field3492[field3515++] = class136.field1496;
                return;
            }
            if (arg0 == 6911) {
                field3492[field3515++] = class575.field8161;
                return;
            }
            if (arg0 == 6912) {
                field3492[field3515++] = class499.field7227;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class639.field9075.method2634(127);
                field3492[field3515++] = class639.field9075.field6547 = class430.field6109;
                field3492[field3515++] = var315;
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7001) {
                class639.field9075.method2648(22106);
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7002) {
                class639.field9075.method2635(false);
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7003) {
                class639.field9075.method2636(0);
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7004) {
                class639.field9075.method2643(true, 0);
                class403.method2266((byte) 80);
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7005) {
                class639.field9075.field6798 = 0;
                class639.field9075.method2642(-2, class353.field4757);
                class389.field5269 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class639.field9075.field6547 == 2) {
                    class639.field9075.field6526 = true;
                    return;
                }
                if (class639.field9075.field6547 == 1) {
                    class639.field9075.field6531 = true;
                    return;
                }
                if (class639.field9075.field6547 == 3) {
                    class639.field9075.field6529 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field3492[field3515++] = class639.field9075.field6798;
                return;
            }
            if (arg0 == 7008) {
                if (class430.field6109 == 0 && class689.field9702 < 96) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3671)
    private static final void method1640(String arg0, int arg1) {
        if (class296.field3704 == 0 && !(!class443.field6260 || class329.field4036) || class383.field5175) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class198.field2332.method1195((byte) 62, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class198.field2332.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2333.method1195((byte) 62, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class198.field2333.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2334.method1195((byte) 62, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class198.field2334.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2335.method1195((byte) 62, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class198.field2335.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2336.method1195((byte) 62, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class198.field2336.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2337.method1195((byte) 62, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class198.field2337.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2338.method1195((byte) 62, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class198.field2338.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2339.method1195((byte) 62, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class198.field2339.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2340.method1195((byte) 62, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class198.field2340.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2341.method1195((byte) 62, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class198.field2341.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2342.method1195((byte) 62, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class198.field2342.method1195((byte) 62, 0).length());
        } else if (var2.startsWith(class198.field2343.method1195((byte) 62, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class198.field2343.method1195((byte) 62, 0).length());
        } else if (class504.field7267 != 0) {
            if (var2.startsWith(class198.field2332.method1195((byte) 62, class504.field7267))) {
                var3 = 0;
                arg0 = arg0.substring(class198.field2332.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2333.method1195((byte) 62, class504.field7267))) {
                var3 = 1;
                arg0 = arg0.substring(class198.field2333.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2334.method1195((byte) 62, class504.field7267))) {
                var3 = 2;
                arg0 = arg0.substring(class198.field2334.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2335.method1195((byte) 62, class504.field7267))) {
                var3 = 3;
                arg0 = arg0.substring(class198.field2335.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2336.method1195((byte) 62, class504.field7267))) {
                var3 = 4;
                arg0 = arg0.substring(class198.field2336.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2337.method1195((byte) 62, class504.field7267))) {
                var3 = 5;
                arg0 = arg0.substring(class198.field2337.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2338.method1195((byte) 62, class504.field7267))) {
                var3 = 6;
                arg0 = arg0.substring(class198.field2338.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2339.method1195((byte) 62, class504.field7267))) {
                var3 = 7;
                arg0 = arg0.substring(class198.field2339.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2340.method1195((byte) 62, class504.field7267))) {
                var3 = 8;
                arg0 = arg0.substring(class198.field2340.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2341.method1195((byte) 62, class504.field7267))) {
                var3 = 9;
                arg0 = arg0.substring(class198.field2341.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2342.method1195((byte) 62, class504.field7267))) {
                var3 = 10;
                arg0 = arg0.substring(class198.field2342.method1195((byte) 62, class504.field7267).length());
            } else if (var2.startsWith(class198.field2343.method1195((byte) 62, class504.field7267))) {
                var3 = 11;
                arg0 = arg0.substring(class198.field2343.method1195((byte) 62, class504.field7267).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class198.field2344.method1195((byte) 62, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class198.field2344.method1195((byte) 62, 0).length());
        } else if (var4.startsWith(class198.field2345.method1195((byte) 62, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class198.field2345.method1195((byte) 62, 0).length());
        } else if (var4.startsWith(class198.field2346.method1195((byte) 62, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class198.field2346.method1195((byte) 62, 0).length());
        } else if (var4.startsWith(class198.field2347.method1195((byte) 62, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class198.field2347.method1195((byte) 62, 0).length());
        } else if (var4.startsWith(class198.field2348.method1195((byte) 62, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class198.field2348.method1195((byte) 62, 0).length());
        } else if (class504.field7267 != 0) {
            if (var4.startsWith(class198.field2344.method1195((byte) 62, class504.field7267))) {
                var5 = 1;
                arg0 = arg0.substring(class198.field2344.method1195((byte) 62, class504.field7267).length());
            } else if (var4.startsWith(class198.field2345.method1195((byte) 62, class504.field7267))) {
                var5 = 2;
                arg0 = arg0.substring(class198.field2345.method1195((byte) 62, class504.field7267).length());
            } else if (var4.startsWith(class198.field2346.method1195((byte) 62, class504.field7267))) {
                var5 = 3;
                arg0 = arg0.substring(class198.field2346.method1195((byte) 62, class504.field7267).length());
            } else if (var4.startsWith(class198.field2347.method1195((byte) 62, class504.field7267))) {
                var5 = 4;
                arg0 = arg0.substring(class198.field2347.method1195((byte) 62, class504.field7267).length());
            } else if (var4.startsWith(class198.field2348.method1195((byte) 62, class504.field7267))) {
                var5 = 5;
                arg0 = arg0.substring(class198.field2348.method1195((byte) 62, class504.field7267).length());
            }
        }
        field3506++;
        class653 var6 = class699.method3845((byte) 45, class39.field395, class462.field6574);
        var6.field9158.method658(0, (byte) 106);
        int var7 = var6.field9158.field1218;
        var6.field9158.method658(var3, (byte) 108);
        var6.field9158.method658(var5, (byte) 116);
        class365.method2130(arg0, var6.field9158, 4);
        var6.field9158.method642(var6.field9158.field1218 - var7, true);
        class568.method3220(var6, (byte) 42);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 3943)
    private static final void method1641(int arg0) {
        class452 var1 = class92.method464(arg0, -167823504);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class452[] var3 = class483.field6965[var2];
        if (var3 == null) {
            class452[] var4 = class102.field1106[var2];
            int var5 = var4.length;
            var3 = class483.field6965[var2] = new class452[var5];
            class567.method3216(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class567.method3216(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkc;)V", line = 3984)
    public static final void method1642(class213 arg0) {
        method1643(arg0, 200000);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkc;I)V", line = 3988)
    private static final void method1643(class213 arg0, int arg1) {
        Object[] var2 = arg0.field2587;
        int var3 = (Integer) var2[0];
        class142 var4 = class556.method3153(var3, 30428);
        if (var4 == null) {
            return;
        }
        field3495 = new int[var4.field1565];
        int var5 = 0;
        field3507 = new String[var4.field1564];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2584;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2586;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2592 == null ? -1 : arg0.field2592.field6339;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2594;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2592 == null ? -1 : arg0.field2592.field6360;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2593 == null ? -1 : arg0.field2593.field6339;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2593 == null ? -1 : arg0.field2593.field6360;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2591;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2585;
                }
                field3495[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2599;
                }
                field3507[var6++] = var9;
            }
        }
        field3519 = arg0.field2595;
        method1645(var4, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V", line = 4074)
    public static final void method1644() {
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lbu;I)V", line = 4085)
    private static final void method1645(class142 arg0, int arg1) {
        field3515 = 0;
        field3503 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1563;
        int[] var4 = arg0.field1562;
        byte var5 = -1;
        field3497 = 0;
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
                        method1648(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1639(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field3492[field3515++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field3492[field3515++] = class628.field8859.field3693[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class628.field8859.method1729((byte) -68, var8, field3492[--field3515]);
                } else if (var43 == 3) {
                    field3493[field3503++] = arg0.field1560[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field3515 -= 2;
                    if (field3492[field3515 + 1] != field3492[field3515]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field3515 -= 2;
                    if (field3492[field3515 + 1] == field3492[field3515]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field3515 -= 2;
                    if (field3492[field3515] < field3492[field3515 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field3515 -= 2;
                    if (field3492[field3515] > field3492[field3515 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field3497 == 0) {
                        return;
                    }
                    class528 var9 = field3496[--field3497];
                    arg0 = var9.field7445;
                    var3 = arg0.field1563;
                    var4 = arg0.field1562;
                    var2 = var9.field7446;
                    field3495 = var9.field7441;
                    field3507 = var9.field7442;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field3492[field3515++] = class628.field8859.method160(-726, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class628.field8859.method1732(-119, field3492[--field3515], var11);
                } else if (var43 == 31) {
                    field3515 -= 2;
                    if (field3492[field3515] <= field3492[field3515 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field3515 -= 2;
                    if (field3492[field3515] >= field3492[field3515 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field3492[field3515++] = field3495[var4[var2]];
                } else if (var43 == 34) {
                    field3495[var4[var2]] = field3492[--field3515];
                } else if (var43 == 35) {
                    field3493[field3503++] = field3507[var4[var2]];
                } else if (var43 == 36) {
                    field3507[var4[var2]] = field3493[--field3503];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field3503 -= var12;
                    String var13 = class56.method296(field3503, var12, field3493, (byte) 33);
                    field3493[field3503++] = var13;
                } else if (var43 == 38) {
                    field3515--;
                } else if (var43 == 39) {
                    field3503--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class142 var15 = class556.method3153(var14, 30428);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1565];
                    String[] var17 = new String[var15.field1564];
                    for (int var18 = 0; var18 < var15.field1569; var18++) {
                        var16[var18] = field3492[field3515 + var18 - var15.field1569];
                    }
                    for (int var19 = 0; var19 < var15.field1573; var19++) {
                        var17[var19] = field3493[field3503 + var19 - var15.field1573];
                    }
                    field3515 -= var15.field1569;
                    field3503 -= var15.field1573;
                    class528 var20 = new class528();
                    var20.field7445 = arg0;
                    var20.field7446 = var2;
                    var20.field7441 = field3495;
                    var20.field7442 = field3507;
                    if (field3497 >= field3496.length) {
                        throw new RuntimeException();
                    }
                    field3496[field3497++] = var20;
                    arg0 = var15;
                    var3 = var15.field1563;
                    var4 = var15.field1562;
                    var2 = -1;
                    field3495 = var16;
                    field3507 = var17;
                } else if (var43 == 42) {
                    field3492[field3515++] = class371.field5066[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class371.field5066[var21] = field3492[--field3515];
                    class171.method929(1, var21);
                    class537.field7555 |= class588.field8319[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field3492[--field3515];
                    if (var24 >= 0 && var24 <= 5000) {
                        field3509[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field3510[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field3492[--field3515];
                    if (var28 < 0 || var28 >= field3509[var27]) {
                        throw new RuntimeException();
                    }
                    field3492[field3515++] = field3510[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field3515 -= 2;
                    int var30 = field3492[field3515];
                    if (var30 < 0 || var30 >= field3509[var29]) {
                        throw new RuntimeException();
                    }
                    field3510[var29][var30] = field3492[field3515 + 1];
                } else if (var43 == 47) {
                    String var31 = class53.field535[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field3493[field3503++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class53.field535[var32] = field3493[--field3503];
                    class414.method2331((byte) 81, var32);
                } else if (var43 == 51) {
                    class661 var33 = arg0.field1571[var4[var2]];
                    class22 var34 = (class22) var33.method3669((long) field3492[--field3515], -1);
                    if (var34 != null) {
                        var2 += var34.field168;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field1561 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4176).append(" ");
                for (int var41 = field3497 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field3496[var41].field7445.field4176).append(" ");
                }
                var40.append("op: ").append(var5);
                class333.method1923(var42, true, var40.toString());
            } else {
                class340.method1964(4, "Clientscript error in: " + arg0.field1561, 103);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field1561).append("\n");
                for (int var38 = field3497 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field3496[var38].field7445.field1561).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class333.method1923(var42, true, var37.toString());
                class415.method2335(var37.toString(), 11);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V", line = 4514)
    private static final void method1646(int arg0) {
        class452 var1 = class92.method464(arg0, -167823504);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class452[] var3 = class483.field6965[var2];
        if (var3 == null) {
            class452[] var4 = class102.field1106[var2];
            int var5 = var4.length;
            var3 = class483.field6965[var2] = new class452[var5];
            class567.method3216(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class567.method3216(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()V", line = 4551)
    public static void method1647() {
        field3495 = null;
        field3507 = null;
        field3509 = null;
        field3510 = null;
        field3492 = null;
        field3493 = null;
        field3496 = null;
        field3505 = null;
        field3500 = null;
        field3494 = null;
        field3512 = null;
        field3517 = null;
        field3518 = null;
        field3516 = null;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(IZ)V", line = 4571)
    private static final void method1648(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field3515 -= 3;
                int var2 = field3492[field3515];
                int var3 = field3492[field3515 + 1];
                int var4 = field3492[field3515 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class452 var5 = class92.method464(var2, -167823504);
                if (var5.field6399 == null) {
                    var5.field6399 = new class452[var4 + 1];
                }
                if (var5.field6399.length <= var4) {
                    class452[] var6 = new class452[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6399.length; var7++) {
                        var6[var7] = var5.field6399[var7];
                    }
                    var5.field6399 = var6;
                }
                if (var4 > 0 && var5.field6399[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class452 var8 = new class452();
                var8.field6471 = var3;
                var8.field6467 = var8.field6339 = var5.field6339;
                var8.field6360 = var4;
                var5.field6399[var4] = var8;
                if (arg1) {
                    field3500 = var8;
                } else {
                    field3505 = var8;
                }
                class130.method741(var5, 26034);
                return;
            }
            if (arg0 == 101) {
                class452 var9 = arg1 ? field3500 : field3505;
                if (var9.field6360 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class452 var10 = class92.method464(var9.field6339, -167823504);
                var10.field6399[var9.field6360] = null;
                class130.method741(var10, 26034);
                return;
            }
            if (arg0 == 102) {
                class452 var11 = class92.method464(field3492[--field3515], -167823504);
                var11.field6399 = null;
                class130.method741(var11, 26034);
                return;
            }
            if (arg0 == 200) {
                field3515 -= 2;
                int var12 = field3492[field3515];
                int var13 = field3492[field3515 + 1];
                class452 var14 = class633.method3558(var12, -1, var13);
                if (var14 != null && var13 != -1) {
                    field3492[field3515++] = 1;
                    if (arg1) {
                        field3500 = var14;
                        return;
                    }
                    field3505 = var14;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field3492[--field3515];
                class452 var16 = class92.method464(var15, -167823504);
                if (var16 != null) {
                    field3492[field3515++] = 1;
                    if (arg1) {
                        field3500 = var16;
                        return;
                    }
                    field3505 = var16;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field3492[--field3515];
                method1646(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field3492[--field3515];
                method1641(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field3515 -= 2;
                int var19 = field3492[field3515];
                int var20 = field3492[field3515 + 1];
                for (int var21 = 0; var21 < class352.field4746.length; var21++) {
                    if (class352.field4746[var21] == var19) {
                        class362.field4859.field2897.method852(var20, class508.field7303, false, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class612.field8621.length; var22++) {
                    if (class612.field8621[var22] == var19) {
                        class362.field4859.field2897.method852(var20, class508.field7303, false, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field3515 -= 2;
                int var23 = field3492[field3515];
                int var24 = field3492[field3515 + 1];
                class362.field4859.field2897.method859(true, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field3492[--field3515] != 0;
                class362.field4859.field2897.method863(var25, (byte) 113);
                return;
            }
            if (arg0 == 411) {
                field3515 -= 2;
                int var26 = field3492[field3515];
                int var27 = field3492[field3515 + 1];
                class362.field4859.field2897.method854(var27, var26, class19.field153, 24842);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class452 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class92.method464(field3492[--field3515], -167823504);
            } else {
                var28 = arg1 ? field3500 : field3505;
            }
            if (arg0 == 1000) {
                field3515 -= 4;
                var28.field6329 = field3492[field3515];
                var28.field6348 = field3492[field3515 + 1];
                int var29 = field3492[field3515 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field3492[field3515 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6440 = (byte) var29;
                var28.field6469 = (byte) var30;
                class130.method741(var28, 26034);
                class68.method359((byte) -128, var28);
                if (var28.field6360 == -1) {
                    class321.method1824(-120, var28.field6339);
                }
                return;
            }
            if (arg0 == 1001) {
                field3515 -= 4;
                var28.field6463 = field3492[field3515];
                var28.field6356 = field3492[field3515 + 1];
                var28.field6355 = 0;
                var28.field6457 = 0;
                int var31 = field3492[field3515 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field3492[field3515 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6452 = (byte) var31;
                var28.field6477 = (byte) var32;
                class130.method741(var28, 26034);
                class68.method359((byte) -112, var28);
                if (var28.field6471 == 0) {
                    class8.method50(false, var28, -17006);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field3492[--field3515] == 1;
                if (var28.field6455 != var33) {
                    var28.field6455 = var33;
                    class130.method741(var28, 26034);
                }
                if (var28.field6360 == -1) {
                    class542.method3052(var28.field6339, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field3515 -= 2;
                var28.field6367 = field3492[field3515];
                var28.field6326 = field3492[field3515 + 1];
                class130.method741(var28, 26034);
                class68.method359((byte) -126, var28);
                if (var28.field6471 == 0) {
                    class8.method50(false, var28, -17006);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6416 = field3492[--field3515] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class452 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class92.method464(field3492[--field3515], -167823504);
            } else {
                var34 = arg1 ? field3500 : field3505;
            }
            if (arg0 == 1100) {
                field3515 -= 2;
                var34.field6414 = field3492[field3515];
                if (var34.field6414 > var34.field6340 - var34.field6483) {
                    var34.field6414 = var34.field6340 - var34.field6483;
                }
                if (var34.field6414 < 0) {
                    var34.field6414 = 0;
                }
                var34.field6451 = field3492[field3515 + 1];
                if (var34.field6451 > var34.field6444 - var34.field6443) {
                    var34.field6451 = var34.field6444 - var34.field6443;
                }
                if (var34.field6451 < 0) {
                    var34.field6451 = 0;
                }
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class216.method1265(var34.field6339, false);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field6338 = field3492[--field3515];
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class154.method837(-7163, var34.field6339);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field6424 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1103) {
                var34.field6400 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1104) {
                var34.field6423 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field3492[--field3515];
                if (var34.field6418 != var35) {
                    var34.field6418 = var35;
                    class130.method741(var34, 26034);
                }
                if (var34.field6360 == -1) {
                    class487.method2822(var34.field6339, 22461);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field6344 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1107) {
                var34.field6408 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1108) {
                var34.field6322 = 1;
                var34.field6402 = field3492[--field3515];
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class260.method1540(var34.field6339, -1);
                }
                return;
            }
            if (arg0 == 1109) {
                field3515 -= 6;
                var34.field6419 = field3492[field3515];
                var34.field6393 = field3492[field3515 + 1];
                var34.field6473 = field3492[field3515 + 2];
                var34.field6422 = field3492[field3515 + 3];
                var34.field6331 = field3492[field3515 + 4];
                var34.field6374 = field3492[field3515 + 5];
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class556.method3154(var34.field6339, true);
                    class364.method2129(10, var34.field6339);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field3492[--field3515];
                if (var34.field6378 != var36) {
                    var34.field6378 = var36;
                    var34.field6433 = 0;
                    var34.field6470 = 1;
                    var34.field6341 = 0;
                    class257 var37 = var34.field6378 == -1 ? null : class265.field3301.method3043(var34.field6378, -8191);
                    if (var37 != null) {
                        class579.method3274(var37, var34.field6433, (byte) -106);
                    }
                    class130.method741(var34, 26034);
                }
                if (var34.field6360 == -1) {
                    class703.method3893(var34.field6339, -110);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field6404 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field3493[--field3503];
                if (!var38.equals(var34.field6438)) {
                    var34.field6438 = var38;
                    class130.method741(var34, 26034);
                }
                if (var34.field6360 == -1) {
                    class226.method1360(-78, var34.field6339);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6441 = field3492[--field3515];
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class108.method586(var34.field6339, -16883);
                }
                return;
            }
            if (arg0 == 1114) {
                field3515 -= 3;
                var34.field6352 = field3492[field3515];
                var34.field6336 = field3492[field3515 + 1];
                var34.field6407 = field3492[field3515 + 2];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1115) {
                var34.field6430 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1116) {
                var34.field6394 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1117) {
                var34.field6449 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1118) {
                var34.field6476 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1119) {
                var34.field6395 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1120) {
                field3515 -= 2;
                var34.field6340 = field3492[field3515];
                var34.field6444 = field3492[field3515 + 1];
                class130.method741(var34, 26034);
                if (var34.field6471 == 0) {
                    class8.method50(false, var34, -17006);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field6380 = field3492[--field3515] == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1123) {
                var34.field6374 = field3492[--field3515];
                class130.method741(var34, 26034);
                if (var34.field6360 == -1) {
                    class556.method3154(var34.field6339, true);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field3492[--field3515];
                var34.field6464 = var39 == 1;
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1125) {
                field3515 -= 2;
                var34.field6321 = field3492[field3515];
                var34.field6397 = field3492[field3515 + 1];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1126) {
                var34.field6346 = field3492[--field3515];
                class130.method741(var34, 26034);
                return;
            }
            if (arg0 == 1127) {
                field3515 -= 2;
                int var40 = field3492[field3515];
                int var41 = field3492[field3515 + 1];
                class166 var42 = class53.field531.method1562(var40, (byte) 52);
                if (var42.field1859 != var41) {
                    var34.method2608(var40, var41, (byte) -91);
                    return;
                }
                var34.method2599(var40, -76);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field3492[--field3515];
                String var44 = field3493[--field3503];
                class166 var45 = class53.field531.method1562(var43, (byte) 84);
                if (!var45.field1865.equals(var44)) {
                    var34.method2603(var43, (byte) -128, var44);
                    return;
                }
                var34.method2599(var43, -117);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class452 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class92.method464(field3492[--field3515], -167823504);
            } else {
                var46 = arg1 ? field3500 : field3505;
            }
            class130.method741(var46, 26034);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field3515 -= 2;
                int var47 = field3492[field3515];
                int var48 = field3492[field3515 + 1];
                if (var46.field6360 == -1) {
                    class329.method1849((byte) -31, var46.field6339);
                    class556.method3154(var46.field6339, true);
                    class364.method2129(10, var46.field6339);
                }
                if (var47 == -1) {
                    var46.field6322 = 1;
                    var46.field6402 = -1;
                    var46.field6434 = -1;
                    return;
                }
                var46.field6434 = var47;
                var46.field6358 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field6382 = true;
                } else {
                    var46.field6382 = false;
                }
                class487 var49 = class19.field153.method272(var47, -11824);
                var46.field6473 = var49.field7067;
                var46.field6422 = var49.field7072;
                var46.field6331 = var49.field7006;
                var46.field6419 = var49.field7046;
                var46.field6393 = var49.field7040;
                var46.field6374 = var49.field7029;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field6401 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field6401 = 1;
                } else {
                    var46.field6401 = 2;
                }
                if (var46.field6355 > 0) {
                    var46.field6374 = var46.field6374 * 32 / var46.field6355;
                    return;
                }
                if (var46.field6463 > 0) {
                    var46.field6374 = var46.field6374 * 32 / var46.field6463;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field6322 = 2;
                var46.field6402 = field3492[--field3515];
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field6322 = 3;
                var46.field6402 = -1;
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field6322 = 6;
                var46.field6402 = field3492[--field3515];
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field6322 = 5;
                var46.field6402 = field3492[--field3515];
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
            if (arg0 == 1206) {
                field3515 -= 4;
                var46.field6381 = field3492[field3515];
                var46.field6328 = field3492[field3515 + 1];
                var46.field6323 = field3492[field3515 + 2];
                var46.field6375 = field3492[field3515 + 3];
                class130.method741(var46, 26034);
                return;
            }
            if (arg0 == 1207) {
                field3515 -= 2;
                var46.field6427 = field3492[field3515];
                var46.field6417 = field3492[field3515 + 1];
                class130.method741(var46, 26034);
                return;
            }
            if (arg0 == 1210) {
                field3515 -= 4;
                var46.field6402 = field3492[field3515];
                var46.field6406 = field3492[field3515 + 1];
                if (field3492[field3515 + 2] == 1) {
                    var46.field6322 = 9;
                } else {
                    var46.field6322 = 8;
                }
                if (field3492[field3515 + 3] == 1) {
                    var46.field6382 = true;
                } else {
                    var46.field6382 = false;
                }
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field6322 = 5;
                var46.field6402 = class392.field5314;
                var46.field6406 = 0;
                if (var46.field6360 == -1) {
                    class260.method1540(var46.field6339, -1);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class452 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class92.method464(field3492[--field3515], -167823504);
            } else {
                var50 = arg1 ? field3500 : field3505;
            }
            if (arg0 == 1300) {
                int var51 = field3492[--field3515] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method2598((byte) 117, var51, field3493[--field3503]);
                    return;
                }
                field3503--;
                return;
            }
            if (arg0 == 1301) {
                field3515 -= 2;
                int var52 = field3492[field3515];
                int var53 = field3492[field3515 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field6343 = null;
                    return;
                }
                var50.field6343 = class633.method3558(var52, -1, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field3492[--field3515];
                if (class556.field7939 != var54 && class56.field567 != var54 && class314.field3908 != var54) {
                    return;
                }
                var50.field6370 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field6385 = field3492[--field3515];
                return;
            }
            if (arg0 == 1304) {
                var50.field6453 = field3492[--field3515];
                return;
            }
            if (arg0 == 1305) {
                var50.field6428 = field3493[--field3503];
                return;
            }
            if (arg0 == 1306) {
                var50.field6412 = field3493[--field3503];
                return;
            }
            if (arg0 == 1307) {
                var50.field6376 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field6411 = field3492[--field3515];
                var50.field6372 = field3492[--field3515];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field3492[--field3515];
                int var56 = field3492[--field3515];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method2611(false, var55, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field6465 = field3493[--field3503];
                return;
            }
            if (arg0 == 1311) {
                var50.field6333 = field3492[--field3515];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field3515 -= 3;
                    var57 = field3492[field3515] - 1;
                    var58 = field3492[field3515 + 1];
                    var59 = field3492[field3515 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field3515 -= 2;
                    var57 = 10;
                    var58 = field3492[field3515];
                    var59 = field3492[field3515 + 1];
                }
                if (var50.field6458 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field6458 = new byte[11];
                    var50.field6362 = new byte[11];
                    var50.field6480 = new int[11];
                }
                var50.field6458[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field6332 = false;
                    for (int var60 = 0; var60 < var50.field6458.length; var60++) {
                        if (var50.field6458[var60] != 0) {
                            var50.field6332 = true;
                            break;
                        }
                    }
                } else {
                    var50.field6332 = true;
                }
                var50.field6362[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field6364 = field3492[--field3515];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class452 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class92.method464(field3492[--field3515], -167823504);
            } else {
                var61 = arg1 ? field3500 : field3505;
            }
            if (arg0 == 1499) {
                var61.method2600((byte) 113);
                return;
            }
            String var62 = field3493[--field3503];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field3492[--field3515];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field3492[--field3515];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field3493[--field3503];
                } else {
                    var65[var66] = Integer.valueOf(field3492[--field3515]);
                }
            }
            int var67 = field3492[--field3515];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field6446 = var65;
            } else if (arg0 == 1401) {
                var61.field6460 = var65;
            } else if (arg0 == 1402) {
                var61.field6481 = var65;
            } else if (arg0 == 1403) {
                var61.field6392 = var65;
            } else if (arg0 == 1404) {
                var61.field6349 = var65;
            } else if (arg0 == 1405) {
                var61.field6478 = var65;
            } else if (arg0 == 1406) {
                var61.field6369 = var65;
            } else if (arg0 == 1407) {
                var61.field6365 = var65;
                var61.field6405 = var63;
            } else if (arg0 == 1408) {
                var61.field6342 = var65;
            } else if (arg0 == 1409) {
                var61.field6320 = var65;
            } else if (arg0 == 1410) {
                var61.field6429 = var65;
            } else if (arg0 == 1411) {
                var61.field6454 = var65;
            } else if (arg0 == 1412) {
                var61.field6368 = var65;
            } else if (arg0 == 1414) {
                var61.field6354 = var65;
                var61.field6371 = var63;
            } else if (arg0 == 1415) {
                var61.field6410 = var65;
                var61.field6389 = var63;
            } else if (arg0 == 1416) {
                var61.field6377 = var65;
            } else if (arg0 == 1417) {
                var61.field6345 = var65;
            } else if (arg0 == 1418) {
                var61.field6466 = var65;
            } else if (arg0 == 1419) {
                var61.field6316 = var65;
            } else if (arg0 == 1420) {
                var61.field6324 = var65;
            } else if (arg0 == 1421) {
                var61.field6351 = var65;
            } else if (arg0 == 1422) {
                var61.field6363 = var65;
            } else if (arg0 == 1423) {
                var61.field6475 = var65;
            } else if (arg0 == 1424) {
                var61.field6425 = var65;
            } else if (arg0 == 1425) {
                var61.field6468 = var65;
            } else if (arg0 == 1426) {
                var61.field6398 = var65;
            } else if (arg0 == 1427) {
                var61.field6325 = var65;
            } else if (arg0 == 1428) {
                var61.field6439 = var65;
                var61.field6390 = var63;
            } else if (arg0 == 1429) {
                var61.field6445 = var65;
                var61.field6383 = var63;
            } else if (arg0 == 1430) {
                var61.field6384 = var65;
            }
            var61.field6479 = true;
            return;
        } else if (arg0 < 1600) {
            class452 var68 = arg1 ? field3500 : field3505;
            if (arg0 == 1500) {
                field3492[field3515++] = var68.field6357;
                return;
            }
            if (arg0 == 1501) {
                field3492[field3515++] = var68.field6459;
                return;
            }
            if (arg0 == 1502) {
                field3492[field3515++] = var68.field6483;
                return;
            }
            if (arg0 == 1503) {
                field3492[field3515++] = var68.field6443;
                return;
            }
            if (arg0 == 1504) {
                field3492[field3515++] = var68.field6455 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field3492[field3515++] = var68.field6467;
                return;
            }
            if (arg0 == 1506) {
                class452 var69 = class411.method2304(var68, false);
                field3492[field3515++] = var69 == null ? -1 : var69.field6339;
                return;
            }
        } else if (arg0 < 1700) {
            class452 var70 = arg1 ? field3500 : field3505;
            if (arg0 == 1600) {
                field3492[field3515++] = var70.field6414;
                return;
            }
            if (arg0 == 1601) {
                field3492[field3515++] = var70.field6451;
                return;
            }
            if (arg0 == 1602) {
                field3493[field3503++] = var70.field6438;
                return;
            }
            if (arg0 == 1603) {
                field3492[field3515++] = var70.field6340;
                return;
            }
            if (arg0 == 1604) {
                field3492[field3515++] = var70.field6444;
                return;
            }
            if (arg0 == 1605) {
                field3492[field3515++] = var70.field6374;
                return;
            }
            if (arg0 == 1606) {
                field3492[field3515++] = var70.field6473;
                return;
            }
            if (arg0 == 1607) {
                field3492[field3515++] = var70.field6331;
                return;
            }
            if (arg0 == 1608) {
                field3492[field3515++] = var70.field6422;
                return;
            }
            if (arg0 == 1609) {
                field3492[field3515++] = var70.field6400;
                return;
            }
            if (arg0 == 1610) {
                field3492[field3515++] = var70.field6419;
                return;
            }
            if (arg0 == 1611) {
                field3492[field3515++] = var70.field6393;
                return;
            }
            if (arg0 == 1612) {
                field3492[field3515++] = var70.field6418;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field3492[--field3515];
                class166 var72 = class53.field531.method1562(var71, (byte) -106);
                if (var72.method910((byte) 68)) {
                    field3493[field3503++] = var70.method2597(true, var71, var72.field1865);
                    return;
                }
                field3492[field3515++] = var70.method2606(var71, (byte) 88, var72.field1859);
                return;
            }
            if (arg0 == 1614) {
                field3492[field3515++] = var70.field6344;
                return;
            }
            if (arg0 == 2614) {
                field3492[field3515++] = var70.field6322 == 1 ? var70.field6402 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class452 var73 = arg1 ? field3500 : field3505;
            if (arg0 == 1700) {
                field3492[field3515++] = var73.field6434;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field6434 != -1) {
                    field3492[field3515++] = var73.field6358;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field3492[field3515++] = var73.field6360;
                return;
            }
        } else if (arg0 < 1900) {
            class452 var74 = arg1 ? field3500 : field3505;
            if (arg0 == 1800) {
                field3492[field3515++] = client.method3750(var74).method1802(1);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field3492[--field3515];
                int var352 = var75 - 1;
                if (var74.field6376 != null && var352 < var74.field6376.length && var74.field6376[var352] != null) {
                    field3493[field3503++] = var74.field6376[var352];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field6428 == null) {
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = var74.field6428;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class452 var350;
            if (arg0 >= 2000) {
                var350 = class92.method464(field3492[--field3515], -167823504);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field3500 : field3505;
            }
            if (field3519 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field6325 == null) {
                    return;
                }
                class213 var351 = new class213();
                var351.field2592 = var350;
                var351.field2587 = var350.field6325;
                var351.field2595 = field3519 + 1;
                class472.field6793.method3425(var351, false);
                return;
            }
        } else if (arg0 < 2600) {
            class452 var76 = class92.method464(field3492[--field3515], -167823504);
            if (arg0 == 2500) {
                field3492[field3515++] = var76.field6357;
                return;
            }
            if (arg0 == 2501) {
                field3492[field3515++] = var76.field6459;
                return;
            }
            if (arg0 == 2502) {
                field3492[field3515++] = var76.field6483;
                return;
            }
            if (arg0 == 2503) {
                field3492[field3515++] = var76.field6443;
                return;
            }
            if (arg0 == 2504) {
                field3492[field3515++] = var76.field6455 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field3492[field3515++] = var76.field6467;
                return;
            }
            if (arg0 == 1506) {
                class452 var77 = class411.method2304(var76, false);
                field3492[field3515++] = var77 == null ? -1 : var77.field6339;
                return;
            }
        } else if (arg0 < 2700) {
            class452 var78 = class92.method464(field3492[--field3515], -167823504);
            if (arg0 == 2600) {
                field3492[field3515++] = var78.field6414;
                return;
            }
            if (arg0 == 2601) {
                field3492[field3515++] = var78.field6451;
                return;
            }
            if (arg0 == 2602) {
                field3493[field3503++] = var78.field6438;
                return;
            }
            if (arg0 == 2603) {
                field3492[field3515++] = var78.field6340;
                return;
            }
            if (arg0 == 2604) {
                field3492[field3515++] = var78.field6444;
                return;
            }
            if (arg0 == 2605) {
                field3492[field3515++] = var78.field6374;
                return;
            }
            if (arg0 == 2606) {
                field3492[field3515++] = var78.field6473;
                return;
            }
            if (arg0 == 2607) {
                field3492[field3515++] = var78.field6331;
                return;
            }
            if (arg0 == 2608) {
                field3492[field3515++] = var78.field6422;
                return;
            }
            if (arg0 == 2609) {
                field3492[field3515++] = var78.field6400;
                return;
            }
            if (arg0 == 2610) {
                field3492[field3515++] = var78.field6419;
                return;
            }
            if (arg0 == 2611) {
                field3492[field3515++] = var78.field6393;
                return;
            }
            if (arg0 == 2612) {
                field3492[field3515++] = var78.field6418;
                return;
            }
            if (arg0 == 2613) {
                field3492[field3515++] = var78.field6344;
                return;
            }
            if (arg0 == 2614) {
                field3492[field3515++] = var78.field6322 == 1 ? var78.field6402 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class452 var79 = class92.method464(field3492[--field3515], -167823504);
                field3492[field3515++] = var79.field6434;
                return;
            }
            if (arg0 == 2701) {
                class452 var80 = class92.method464(field3492[--field3515], -167823504);
                if (var80.field6434 != -1) {
                    field3492[field3515++] = var80.field6358;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field3492[--field3515];
                class633 var82 = (class633) class14.field117.method3669((long) var81, -1);
                if (var82 != null) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class452 var83 = class92.method464(field3492[--field3515], -167823504);
                if (var83.field6399 == null) {
                    field3492[field3515++] = 0;
                    return;
                }
                int var84 = var83.field6399.length;
                for (int var85 = 0; var85 < var83.field6399.length; var85++) {
                    if (var83.field6399[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field3492[field3515++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field3515 -= 2;
                int var86 = field3492[field3515];
                int var87 = field3492[field3515 + 1];
                class633 var88 = (class633) class14.field117.method3669((long) var86, -1);
                if (var88 != null && var88.field8920 == var87) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class452 var89 = class92.method464(field3492[--field3515], -167823504);
            if (arg0 == 2800) {
                field3492[field3515++] = client.method3750(var89).method1802(1);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field3492[--field3515];
                int var353 = var90 - 1;
                if (var89.field6376 != null && var353 < var89.field6376.length && var89.field6376[var353] != null) {
                    field3493[field3503++] = var89.field6376[var353];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field6428 == null) {
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = var89.field6428;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field3493[--field3503];
                class200.method1198(var91, -102);
                return;
            }
            if (arg0 == 3101) {
                field3515 -= 2;
                class463.method2658(255, field3492[field3515], field3492[field3515 + 1], class362.field4859);
                return;
            }
            if (arg0 == 3103) {
                class359.method2110(true, (byte) 96);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field3493[--field3503];
                int var93 = 0;
                if (class63.method334(9394, var92)) {
                    var93 = class274.method1607(var92, 1);
                }
                field3508++;
                class653 var94 = class699.method3845((byte) 45, class39.field395, class20.field159);
                var94.field9158.method660((byte) 110, var93);
                class568.method3220(var94, (byte) 88);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field3493[--field3503];
                field3513++;
                class653 var96 = class699.method3845((byte) 45, class39.field395, class594.field8379);
                var96.field9158.method658(var95.length() + 1, (byte) 122);
                var96.field9158.method672((byte) 50, var95);
                class568.method3220(var96, (byte) 17);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field3493[--field3503];
                field3501++;
                class653 var98 = class699.method3845((byte) 45, class39.field395, class223.field2774);
                var98.field9158.method658(var97.length() + 1, (byte) 65);
                var98.field9158.method672((byte) 94, var97);
                class568.method3220(var98, (byte) 86);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field3492[--field3515];
                String var100 = field3493[--field3503];
                class200.method1197(var100, false, var99);
                return;
            }
            if (arg0 == 3108) {
                field3515 -= 3;
                int var101 = field3492[field3515];
                int var102 = field3492[field3515 + 1];
                int var103 = field3492[field3515 + 2];
                class452 var104 = class92.method464(var103, -167823504);
                class406.method2275(var102, var104, var101, (byte) 101);
                return;
            }
            if (arg0 == 3109) {
                field3515 -= 2;
                int var105 = field3492[field3515];
                int var106 = field3492[field3515 + 1];
                class452 var107 = arg1 ? field3500 : field3505;
                class406.method2275(var106, var107, var105, (byte) 101);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field3492[--field3515];
                field3499++;
                class653 var109 = class699.method3845((byte) 45, class39.field395, class417.field5586);
                var109.field9158.method645(-672168216, var108);
                class568.method3220(var109, (byte) 94);
                return;
            }
            if (arg0 == 3111) {
                field3515 -= 2;
                int var110 = field3492[field3515];
                int var111 = field3492[field3515 + 1];
                class633 var112 = (class633) class14.field117.method3669((long) var110, -1);
                if (var112 != null) {
                    class604.method3377((byte) -90, var112, true, var112.field8920 != var111);
                }
                class453.method2613(1, var111, true, 3, var110);
                return;
            }
            if (arg0 == 3112) {
                field3515--;
                int var113 = field3492[field3515];
                class633 var114 = (class633) class14.field117.method3669((long) var113, -1);
                if (var114 != null && var114.field8921 == 3) {
                    class604.method3377((byte) -59, var114, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class357.method2102(-63, field3493[--field3503]);
                return;
            }
            if (arg0 == 3114) {
                field3515 -= 2;
                int var115 = field3492[field3515];
                int var116 = field3492[field3515 + 1];
                String var117 = field3493[--field3503];
                class416.method2341(0, var117, "", "", var116, var115, "");
                return;
            }
            if (arg0 == 3115) {
                field3515 -= 11;
                class240[] var118 = class579.method3275(0);
                class648[] var119 = class564.method3198(25624);
                class557.method3156(field3492[field3515 + 7], field3492[field3515 + 5], field3492[field3515 + 10], field3492[field3515 + 2], var118[field3492[field3515]], var119[field3492[field3515 + 1]], field3492[field3515 + 3], field3492[field3515 + 9], field3492[field3515 + 8], field3492[field3515 + 4], field3492[field3515 + 6], 1);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field3515 -= 3;
                class421.method2355(-71, 255, field3492[field3515], field3492[field3515 + 2], field3492[field3515 + 1]);
                return;
            }
            if (arg0 == 3201) {
                class693.method3816(-116, 255, 50, field3492[--field3515]);
                return;
            }
            if (arg0 == 3202) {
                field3515 -= 2;
                class59.method319(true, field3492[field3515 + 1], field3492[field3515], 255);
                return;
            }
            if (arg0 == 3203) {
                field3515 -= 4;
                class421.method2355(-96, field3492[field3515 + 3], field3492[field3515], field3492[field3515 + 2], field3492[field3515 + 1]);
                return;
            }
            if (arg0 == 3204) {
                field3515 -= 3;
                class693.method3816(-119, field3492[field3515 + 1], field3492[field3515 + 2], field3492[field3515]);
                return;
            }
            if (arg0 == 3205) {
                field3515 -= 3;
                class59.method319(true, field3492[field3515 + 1], field3492[field3515], field3492[field3515 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field3515 -= 4;
                class247.method1454(field3492[field3515 + 3], field3492[field3515 + 2], field3492[field3515], field3492[field3515 + 1], -23, false);
                return;
            }
            if (arg0 == 3207) {
                field3515 -= 4;
                class247.method1454(field3492[field3515 + 3], field3492[field3515 + 2], field3492[field3515], field3492[field3515 + 1], -23, true);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field3492[field3515++] = class678.field9539;
                return;
            }
            if (arg0 == 3301) {
                field3515 -= 2;
                int var120 = field3492[field3515];
                int var121 = field3492[field3515 + 1];
                field3492[field3515++] = class60.method321(var121, false, var120, 3);
                return;
            }
            if (arg0 == 3302) {
                field3515 -= 2;
                int var122 = field3492[field3515];
                int var123 = field3492[field3515 + 1];
                field3492[field3515++] = class652.method3634(var122, (byte) 99, false, var123);
                return;
            }
            if (arg0 == 3303) {
                field3515 -= 2;
                int var124 = field3492[field3515];
                int var125 = field3492[field3515 + 1];
                field3492[field3515++] = class395.method2237(var125, 0, false, var124);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field3492[--field3515];
                field3492[field3515++] = class552.field7888.method2886(var126, -57).field2431;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field3492[--field3515];
                field3492[field3515++] = class368.field5034[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field3492[--field3515];
                field3492[field3515++] = class217.field2616[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field3492[--field3515];
                field3492[field3515++] = class203.field2403[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class362.field4859.field5166;
                int var131 = (class362.field4859.field5179 >> 9) + class26.field245;
                int var132 = (class362.field4859.field5176 >> 9) + class231.field2860;
                field3492[field3515++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field3492[--field3515];
                field3492[field3515++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field3492[--field3515];
                field3492[field3515++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field3492[--field3515];
                field3492[field3515++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field3492[field3515++] = class190.field2181 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field3515 -= 2;
                int var136 = field3492[field3515];
                int var137 = field3492[field3515 + 1];
                field3492[field3515++] = class60.method321(var137, true, var136, 3);
                return;
            }
            if (arg0 == 3314) {
                field3515 -= 2;
                int var138 = field3492[field3515];
                int var139 = field3492[field3515 + 1];
                field3492[field3515++] = class652.method3634(var138, (byte) 99, true, var139);
                return;
            }
            if (arg0 == 3315) {
                field3515 -= 2;
                int var140 = field3492[field3515];
                int var141 = field3492[field3515 + 1];
                field3492[field3515++] = class395.method2237(var141, 0, true, var140);
                return;
            }
            if (arg0 == 3316) {
                if (class296.field3704 >= 2) {
                    field3492[field3515++] = class296.field3704;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field3492[field3515++] = class311.field3842;
                return;
            }
            if (arg0 == 3318) {
                field3492[field3515++] = class117.field1294.field2001;
                return;
            }
            if (arg0 == 3321) {
                field3492[field3515++] = class8.field87;
                return;
            }
            if (arg0 == 3322) {
                field3492[field3515++] = class36.field369;
                return;
            }
            if (arg0 == 3323) {
                if (class142.field1575 >= 5 && class142.field1575 <= 9) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class142.field1575 >= 5 && class142.field1575 <= 9) {
                    field3492[field3515++] = class142.field1575;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field3492[field3515++] = class599.field8435 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field3492[field3515++] = class362.field4859.field2935;
                return;
            }
            if (arg0 == 3327) {
                field3492[field3515++] = class362.field4859.field2897.field1770 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field3492[field3515++] = class383.field5175 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field3492[--field3515];
                field3492[field3515++] = class325.method1833(false, var142, (byte) 14);
                return;
            }
            if (arg0 == 3331) {
                field3515 -= 2;
                int var143 = field3492[field3515];
                int var144 = field3492[field3515 + 1];
                field3492[field3515++] = class435.method2497((byte) -103, false, var143, var144, false);
                return;
            }
            if (arg0 == 3332) {
                field3515 -= 2;
                int var145 = field3492[field3515];
                int var146 = field3492[field3515 + 1];
                field3492[field3515++] = class435.method2497((byte) -65, true, var145, var146, false);
                return;
            }
            if (arg0 == 3333) {
                field3492[field3515++] = class445.field6273;
                return;
            }
            if (arg0 == 3335) {
                field3492[field3515++] = class504.field7267;
                return;
            }
            if (arg0 == 3336) {
                field3515 -= 4;
                int var147 = field3492[field3515];
                int var148 = field3492[field3515 + 1];
                int var149 = field3492[field3515 + 2];
                int var150 = field3492[field3515 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field3492[field3515++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field3492[field3515++] = class112.field1186;
                return;
            }
            if (arg0 == 3338) {
                field3492[field3515++] = class115.method614(87);
                return;
            }
            if (arg0 == 3339) {
                field3492[field3515++] = class213.field2600 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field3492[field3515++] = class32.field310 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field3492[field3515++] = class35.field350 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field3492[field3515++] = class108.field1166.method253(true);
                return;
            }
            if (arg0 == 3343) {
                field3492[field3515++] = class108.field1166.method252(7);
                return;
            }
            if (arg0 == 3344) {
                field3493[field3503++] = class158.method862(0);
                return;
            }
            if (arg0 == 3345) {
                field3493[field3503++] = class393.method2230((byte) -38);
                return;
            }
            if (arg0 == 3346) {
                field3492[field3515++] = class198.method1192(-1);
                return;
            }
            if (arg0 == 3347) {
                field3492[field3515++] = class5.field58;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field3515 -= 2;
                int var154 = field3492[field3515];
                int var155 = field3492[field3515 + 1];
                class553 var156 = class442.field6236.method2963(var154, 114);
                field3493[field3503++] = var156.method3140(true, var155);
                return;
            }
            if (arg0 == 3408) {
                field3515 -= 4;
                int var157 = field3492[field3515];
                int var158 = field3492[field3515 + 1];
                int var159 = field3492[field3515 + 2];
                int var160 = field3492[field3515 + 3];
                class553 var161 = class442.field6236.method2963(var159, -24);
                if (var161.field7895 == var157 && var161.field7910 == var158) {
                    if (var158 == 115) {
                        field3493[field3503++] = var161.method3140(true, var160);
                        return;
                    }
                    field3492[field3515++] = var161.method3137(-116, var160);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field3515 -= 3;
                int var162 = field3492[field3515];
                int var163 = field3492[field3515 + 1];
                int var164 = field3492[field3515 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class553 var165 = class442.field6236.method2963(var163, -38);
                if (var165.field7910 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field3492[field3515++] = var165.method3132(false, var164) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field3492[--field3515];
                String var167 = field3493[--field3503];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class553 var168 = class442.field6236.method2963(var166, -49);
                if (var168.field7910 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field3492[field3515++] = var168.method3141(var167, 14087) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field3492[--field3515];
                class553 var170 = class442.field6236.method2963(var169, 114);
                field3492[field3515++] = var170.field7901.method3668(false);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class471.field6759 == 0) {
                    field3492[field3515++] = -2;
                    return;
                }
                if (class471.field6759 == 1) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = class699.field9804;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field3492[--field3515];
                if (class471.field6759 == 2 && var171 < class699.field9804) {
                    field3493[field3503++] = class703.field9867[var171];
                    if (class597.field8405[var171] != null) {
                        field3493[field3503++] = class597.field8405[var171];
                        return;
                    }
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = "";
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field3492[--field3515];
                if (class471.field6759 == 2 && var172 < class699.field9804) {
                    field3492[field3515++] = class380.field5151[var172];
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field3492[--field3515];
                if (class471.field6759 == 2 && var173 < class699.field9804) {
                    field3492[field3515++] = class486.field7001[var173];
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field3493[--field3503];
                int var175 = field3492[--field3515];
                class184.method1115(1, var174, var175);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field3493[--field3503];
                class647.method3623((byte) 125, var176);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field3493[--field3503];
                class363.method2124((byte) 108, var177);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field3493[--field3503];
                class144.method794(false, var178, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field3493[--field3503];
                class411.method2300(1, var179);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field3493[--field3503];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field3492[field3515++] = class573.method3236(var180, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field3492[--field3515];
                if (class471.field6759 == 2 && var181 < class699.field9804) {
                    field3493[field3503++] = class164.field1823[var181];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class563.field8045 != null) {
                    field3493[field3503++] = class469.method2710(-49, class563.field8045);
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class563.field8045 != null) {
                    field3492[field3515++] = class288.field3603;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field3492[--field3515];
                if (class563.field8045 != null && var182 < class288.field3603) {
                    field3493[field3503++] = class145.field1611[var182].field9242;
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field3492[--field3515];
                if (class563.field8045 != null && var183 < class288.field3603) {
                    field3492[field3515++] = class145.field1611[var183].field9236;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field3492[--field3515];
                if (class563.field8045 != null && var184 < class288.field3603) {
                    field3492[field3515++] = class145.field1611[var184].field9240;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field3492[field3515++] = class278.field3454;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field3493[--field3503];
                class370.method2158((byte) 113, var185);
                return;
            }
            if (arg0 == 3618) {
                field3492[field3515++] = class285.field3565;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field3493[--field3503];
                class188.method1144(var186, 0);
                return;
            }
            if (arg0 == 3620) {
                class279.method1626(115);
                return;
            }
            if (arg0 == 3621) {
                if (class471.field6759 == 0) {
                    field3492[field3515++] = -1;
                    return;
                }
                field3492[field3515++] = class46.field482;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field3492[--field3515];
                if (class471.field6759 != 0 && var187 < class46.field482) {
                    field3493[field3503++] = class319.field3937[var187];
                    if (class551.field7876[var187] != null) {
                        field3493[field3503++] = class551.field7876[var187];
                        return;
                    }
                    field3493[field3503++] = "";
                    return;
                }
                field3493[field3503++] = "";
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field3493[--field3503];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field3492[field3515++] = class16.method67((byte) 119, var188) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field3492[--field3515];
                if (class145.field1611 != null && var189 < class288.field3603 && class145.field1611[var189].field9239.equalsIgnoreCase(class362.field4859.field2893)) {
                    field3492[field3515++] = 1;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class126.field1422 != null) {
                    field3493[field3503++] = class126.field1422;
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field3492[--field3515];
                if (class563.field8045 != null && var190 < class288.field3603) {
                    field3493[field3503++] = class145.field1611[var190].field9234;
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field3492[--field3515];
                if (class471.field6759 == 2 && var191 >= 0 && var191 < class699.field9804) {
                    field3492[field3515++] = class392.field5325[var191] ? 1 : 0;
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field3493[--field3503];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field3492[field3515++] = class80.method424(var192, -111);
                return;
            }
            if (arg0 == 3629) {
                field3492[field3515++] = class671.field9348;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field3493[--field3503];
                class144.method794(false, var193, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field3492[--field3515];
                field3492[field3515++] = class692.field9720[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field3492[--field3515];
                if (class563.field8045 != null && var195 < class288.field3603) {
                    field3493[field3503++] = class145.field1611[var195].field9239;
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field3492[--field3515];
                if (class471.field6759 != 0 && var196 < class46.field482) {
                    field3493[field3503++] = class80.field832[var196];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var197].method325(-12581);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var198].field622;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var199].field626;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var200].field629;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var201].field619;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field3492[--field3515];
                field3492[field3515++] = class383.field5170[var202].field627;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field3492[--field3515];
                int var204 = class383.field5170[var203].method324(786432);
                field3492[field3515++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field3492[--field3515];
                int var206 = class383.field5170[var205].method324(786432);
                field3492[field3515++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field3492[--field3515];
                int var208 = class383.field5170[var207].method324(786432);
                field3492[field3515++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field3492[--field3515];
                int var210 = class383.field5170[var209].method324(786432);
                field3492[field3515++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field3515 -= 2;
                int var211 = field3492[field3515];
                int var212 = field3492[field3515 + 1];
                field3492[field3515++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field3515 -= 2;
                int var213 = field3492[field3515];
                int var214 = field3492[field3515 + 1];
                field3492[field3515++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field3515 -= 2;
                int var215 = field3492[field3515];
                int var216 = field3492[field3515 + 1];
                field3492[field3515++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field3515 -= 2;
                int var217 = field3492[field3515];
                int var218 = field3492[field3515 + 1];
                field3492[field3515++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field3492[--field3515];
                field3492[field3515++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field3492[--field3515];
                field3492[field3515++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field3515 -= 5;
                int var221 = field3492[field3515];
                int var222 = field3492[field3515 + 1];
                int var223 = field3492[field3515 + 2];
                int var224 = field3492[field3515 + 3];
                int var225 = field3492[field3515 + 4];
                field3492[field3515++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field3515 -= 2;
                long var226 = (long) field3492[field3515];
                long var228 = (long) field3492[field3515 + 1];
                field3492[field3515++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field3515 -= 2;
                int var230 = field3492[field3515];
                int var231 = field3492[field3515 + 1];
                field3492[field3515++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field3515 -= 2;
                int var232 = field3492[field3515];
                int var233 = field3492[field3515 + 1];
                field3492[field3515++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field3515 -= 2;
                int var234 = field3492[field3515];
                int var235 = field3492[field3515 + 1];
                field3492[field3515++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field3515 -= 2;
                int var236 = field3492[field3515];
                int var237 = field3492[field3515 + 1];
                field3492[field3515++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field3515 -= 2;
                int var238 = field3492[field3515];
                int var239 = field3492[field3515 + 1];
                if (var238 == 0) {
                    field3492[field3515++] = 0;
                    return;
                }
                field3492[field3515++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field3515 -= 2;
                int var240 = field3492[field3515];
                int var241 = field3492[field3515 + 1];
                if (var240 == 0) {
                    field3492[field3515++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field3492[field3515++] = Integer.MAX_VALUE;
                    return;
                }
                field3492[field3515++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field3515 -= 2;
                int var242 = field3492[field3515];
                int var243 = field3492[field3515 + 1];
                field3492[field3515++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field3515 -= 2;
                int var244 = field3492[field3515];
                int var245 = field3492[field3515 + 1];
                field3492[field3515++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field3515 -= 2;
                int var246 = field3492[field3515];
                int var247 = field3492[field3515 + 1];
                field3492[field3515++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field3515 -= 2;
                int var248 = field3492[field3515];
                int var249 = field3492[field3515 + 1];
                field3492[field3515++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field3515 -= 3;
                long var250 = (long) field3492[field3515];
                long var252 = (long) field3492[field3515 + 1];
                long var254 = (long) field3492[field3515 + 2];
                field3492[field3515++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field3493[--field3503];
                int var257 = field3492[--field3515];
                field3493[field3503++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field3503 -= 2;
                String var258 = field3493[field3503];
                String var259 = field3493[field3503 + 1];
                field3493[field3503++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field3493[--field3503];
                int var261 = field3492[--field3515];
                field3493[field3503++] = var260 + class356.method2099((byte) 77, true, var261);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field3493[--field3503];
                field3493[field3503++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field3493[field3503++] = method1650(field3492[--field3515]);
                return;
            }
            if (arg0 == 4105) {
                field3503 -= 2;
                String var263 = field3493[field3503];
                String var264 = field3493[field3503 + 1];
                if (class362.field4859.field2897 != null && class362.field4859.field2897.field1770) {
                    field3493[field3503++] = var264;
                    return;
                }
                field3493[field3503++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field3492[--field3515];
                field3493[field3503++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field3503 -= 2;
                field3492[field3515++] = class674.method3725((byte) 64, field3493[field3503], class504.field7267, field3493[field3503 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field3493[--field3503];
                field3515 -= 2;
                int var267 = field3492[field3515];
                int var268 = field3492[field3515 + 1];
                class463 var269 = class306.method1764(class573.field8139, 0, var268, -77);
                field3492[field3515++] = var269.method2661(class485.field6988, 106, var267, var266);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field3493[--field3503];
                field3515 -= 2;
                int var271 = field3492[field3515];
                int var272 = field3492[field3515 + 1];
                class463 var273 = class306.method1764(class573.field8139, 0, var272, -70);
                field3492[field3515++] = var273.method2664(var270, class485.field6988, var271, (byte) 21);
                return;
            }
            if (arg0 == 4110) {
                field3503 -= 2;
                String var274 = field3493[field3503];
                String var275 = field3493[field3503 + 1];
                if (field3492[--field3515] == 1) {
                    field3493[field3503++] = var274;
                    return;
                }
                field3493[field3503++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field3493[--field3503];
                field3493[field3503++] = class531.method2982((byte) 113, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field3493[--field3503];
                int var278 = field3492[--field3515];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field3493[field3503++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field3492[--field3515];
                field3492[field3515++] = class330.method1908((char) var279, 255) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field3492[--field3515];
                field3492[field3515++] = class103.method563(68, (char) var280) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field3492[--field3515];
                field3492[field3515++] = class390.method2222(true, (char) var281) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field3492[--field3515];
                field3492[field3515++] = class203.method1212(false, (char) var282) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field3493[--field3503];
                if (var283 != null) {
                    field3492[field3515++] = var283.length();
                    return;
                }
                field3492[field3515++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field3493[--field3503];
                field3515 -= 2;
                int var285 = field3492[field3515];
                int var286 = field3492[field3515 + 1];
                field3493[field3503++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field3493[--field3503];
                StringBuffer var288 = new StringBuffer(var287.length());
                boolean var289 = false;
                for (int var290 = 0; var290 < var287.length(); var290++) {
                    char var291 = var287.charAt(var290);
                    if (var291 == '<') {
                        var289 = true;
                    } else if (var291 == '>') {
                        var289 = false;
                    } else if (!var289) {
                        var288.append(var291);
                    }
                }
                field3493[field3503++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field3493[--field3503];
                field3515 -= 2;
                int var293 = field3492[field3515];
                int var294 = field3492[field3515 + 1];
                field3492[field3515++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field3503 -= 2;
                String var295 = field3493[field3503];
                String var296 = field3493[field3503 + 1];
                int var297 = field3492[--field3515];
                field3492[field3515++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field3492[--field3515];
                field3492[field3515++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field3492[--field3515];
                field3492[field3515++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field3492[--field3515] != 0;
                int var301 = field3492[--field3515];
                field3493[field3503++] = class71.method373(class504.field7267, 0, -28863, (long) var301, var300);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field3493[--field3503];
                int var303 = field3492[--field3515];
                class463 var304 = class306.method1764(class573.field8139, 0, var303, -104);
                field3492[field3515++] = var304.method2656(var302, 55, class485.field6988);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field3492[--field3515];
                field3493[field3503++] = class19.field153.method272(var305, -11824).field7027;
                return;
            }
            if (arg0 == 4201) {
                field3515 -= 2;
                int var306 = field3492[field3515];
                int var307 = field3492[field3515 + 1];
                class487 var308 = class19.field153.method272(var306, -11824);
                if (var307 >= 1 && var307 <= 5 && var308.field7063[var307 - 1] != null) {
                    field3493[field3503++] = var308.field7063[var307 - 1];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 4202) {
                field3515 -= 2;
                int var309 = field3492[field3515];
                int var310 = field3492[field3515 + 1];
                class487 var311 = class19.field153.method272(var309, -11824);
                if (var310 >= 1 && var310 <= 5 && var311.field7047[var310 - 1] != null) {
                    field3493[field3503++] = var311.field7047[var310 - 1];
                    return;
                }
                field3493[field3503++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field3492[--field3515];
                field3492[field3515++] = class19.field153.method272(var312, -11824).field7062;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field3492[--field3515];
                field3492[field3515++] = class19.field153.method272(var313, -11824).field7064 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field3492[--field3515];
                class487 var315 = class19.field153.method272(var314, -11824);
                if (var315.field7034 == -1 && var315.field7017 >= 0) {
                    field3492[field3515++] = var315.field7017;
                    return;
                }
                field3492[field3515++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field3492[--field3515];
                class487 var317 = class19.field153.method272(var316, -11824);
                if (var317.field7034 >= 0 && var317.field7017 >= 0) {
                    field3492[field3515++] = var317.field7017;
                    return;
                }
                field3492[field3515++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field3492[--field3515];
                field3492[field3515++] = class19.field153.method272(var318, -11824).field7068 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field3515 -= 2;
                int var319 = field3492[field3515];
                int var320 = field3492[field3515 + 1];
                class166 var321 = class53.field531.method1562(var320, (byte) -77);
                if (var321.method910((byte) 68)) {
                    field3493[field3503++] = class19.field153.method272(var319, -11824).method2828(var320, -106, var321.field1865);
                    return;
                }
                field3492[field3515++] = class19.field153.method272(var319, -11824).method2827(var321.field1859, var320, 0);
                return;
            }
            if (arg0 == 4209) {
                field3515 -= 2;
                int var322 = field3492[field3515];
                int var323 = field3492[field3515 + 1] - 1;
                class487 var324 = class19.field153.method272(var322, -11824);
                if (var324.field7080 == var323) {
                    field3492[field3515++] = var324.field7037;
                    return;
                }
                if (var324.field7049 == var323) {
                    field3492[field3515++] = var324.field7032;
                    return;
                }
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field3493[--field3503];
                int var326 = field3492[--field3515];
                class171.method931(-57, var326 == 1, var325);
                field3492[field3515++] = class613.field8624;
                return;
            }
            if (arg0 == 4211) {
                if (class578.field8185 != null && class220.field2625 < class613.field8624) {
                    field3492[field3515++] = class578.field8185[class220.field2625++] & 0xFFFF;
                    return;
                }
                field3492[field3515++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class220.field2625 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field3492[--field3515];
                field3492[field3515++] = class19.field153.method272(var327, -11824).field7056;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field3493[--field3503];
                field3515 -= 3;
                int var329 = field3492[field3515];
                int var330 = field3492[field3515 + 1];
                int var331 = field3492[field3515 + 2];
                class538.method3032(var328, var329 == 1, 256, var331, var330);
                field3492[field3515++] = class613.field8624;
                return;
            }
            if (arg0 == 4215) {
                field3503 -= 2;
                field3515 -= 2;
                String var332 = field3493[field3503];
                int var333 = field3492[field3515];
                int var334 = field3492[field3515 + 1];
                String var335 = field3493[field3503 + 1];
                class237.method1420(var332, var333 == 1, -1, var334, var335);
                field3492[field3515++] = class613.field8624;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field3515 -= 2;
                int var336 = field3492[field3515];
                int var337 = field3492[field3515 + 1];
                class166 var338 = class53.field531.method1562(var337, (byte) -93);
                if (var338.method910((byte) 68)) {
                    field3493[field3503++] = class369.field5055.method342(-14190, var336).method1246(var338.field1865, -29516, var337);
                    return;
                }
                field3492[field3515++] = class369.field5055.method342(-14190, var336).method1248(255, var338.field1859, var337);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field3515 -= 2;
                int var339 = field3492[field3515];
                int var340 = field3492[field3515 + 1];
                class166 var341 = class53.field531.method1562(var340, (byte) 122);
                if (var341.method910((byte) 68)) {
                    field3493[field3503++] = class364.field4891.method2134(var339, true).method3590(var340, 22230, var341.field1865);
                    return;
                }
                field3492[field3515++] = class364.field4891.method2134(var339, true).method3586(var341.field1859, var340, 17882);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field3515 -= 2;
                int var342 = field3492[field3515];
                int var343 = field3492[field3515 + 1];
                class166 var344 = class53.field531.method1562(var343, (byte) 113);
                if (var344.method910((byte) 68)) {
                    field3493[field3503++] = class304.field3768.method1108((byte) 34, var342).method888(var343, var344.field1865, true);
                    return;
                }
                field3492[field3515++] = class304.field3768.method1108((byte) 34, var342).method886(var344.field1859, 17420, var343);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field3492[--field3515];
            class543 var346 = class400.field5381.method2168(var345, 24449);
            if (var346.field7674 != null && var346.field7674.length > 0) {
                int var347 = 0;
                int var348 = var346.field7672[0];
                for (int var349 = 1; var349 < var346.field7674.length; var349++) {
                    if (var346.field7672[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field7672[var349];
                    }
                }
                field3492[field3515++] = var346.field7674[var347];
                return;
            }
            field3492[field3515++] = var346.field7656;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lht;II)V")
    public static final void method1649(class607 arg0, int arg1, int arg2) {
        class142 var3 = class118.method686(arg1, arg2, (byte) -43, arg0);
        if (var3 == null) {
            return;
        }
        field3495 = new int[var3.field1565];
        field3507 = new String[var3.field1564];
        if (class547.field7808 == var3.field1566 || class6.field74 == var3.field1566 || class90.field909 == var3.field1566) {
            int var4 = 0;
            int var5 = 0;
            if (class677.field9478 != null) {
                var4 = class677.field9478.field6357;
                var5 = class677.field9478.field6459;
            }
            field3495[0] = class108.field1166.method253(true) - var4;
            field3495[1] = class108.field1166.method252(7) - var5;
        }
        method1645(var3, 200000);
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method1650(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field3512.setTime(new Date(var1));
        int var3 = field3512.get(5);
        int var4 = field3512.get(2);
        int var5 = field3512.get(1);
        return var3 + "-" + field3517[var4] + "-" + var5;
    }
}
