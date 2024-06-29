import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class545 {

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "[[I")
    private static int[][] field7909 = new int[5][5000];

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    private static int field7905 = 0;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "[I")
    private static int[] field7914 = new int[1000];

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    private static int field7908 = 0;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    private static int field7902 = 0;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[I")
    private static int[] field7904 = new int[5];

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "[Law;")
    private static class67[] field7918 = new class67[50];

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field7913 = new String[1000];

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7900 = Calendar.getInstance();

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "[I")
    private static int[] field7924 = new int[3];

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field7925 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "Lmq;")
    public static class472 field7926 = new class472(4);

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    private static int field7927 = 0;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Ln;")
    private static class17 field7907;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "Ln;")
    private static class17 field7917;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "Ldga;")
    private static class189 field7912;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[I")
    private static int[] field7899;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field7915;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V")
    private static final void method3192(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7914[field7905++] = class219.field2833;
                return;
            }
            if (arg0 == 5001) {
                field7905 -= 3;
                class219.field2833 = field7914[field7905];
                class280.field3802 = class165.method1041(-20310, field7914[field7905 + 1]);
                if (class280.field3802 == null) {
                    class280.field3802 = class591.field8561;
                }
                class149.field1826 = field7914[field7905 + 2];
                field7906++;
                class543 var2 = class299.method1780(class84.field1196, class697.field9872, 45);
                var2.field7872.method2281((byte) 58, class219.field2833);
                var2.field7872.method2281((byte) 58, class280.field3802.field8644);
                var2.field7872.method2281((byte) 58, class149.field1826);
                class511.method3028(7482, var2);
                return;
            }
            if (arg0 == 5002) {
                field7908 -= 2;
                String var3 = field7913[field7908];
                String var4 = field7913[field7908 + 1];
                field7905 -= 2;
                int var5 = field7914[field7905];
                int var6 = field7914[field7905 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field7923++;
                class543 var7 = class299.method1780(class84.field1196, class400.field5649, 77);
                var7.field7872.method2281((byte) 58, class251.method1534(var3, (byte) 97) + class251.method1534(var4, (byte) 106) + 2);
                var7.field7872.method2269(var3, -84);
                var7.field7872.method2281((byte) 58, var5 - 1);
                var7.field7872.method2281((byte) 58, var6);
                var7.field7872.method2269(var4, -82);
                class511.method3028(7482, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field7914[--field7905];
                class6 var9 = class300.method1785((byte) 47, var8);
                String var10 = "";
                if (var9 != null && var9.field42 != null) {
                    var10 = var9.field42;
                }
                field7913[field7908++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field7914[--field7905];
                class6 var12 = class300.method1785((byte) 47, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field51;
                }
                field7914[field7905++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class280.field3802 == null) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = class280.field3802.field8644;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field7914[--field7905];
                class543 var15 = class299.method1780(class84.field1196, class120.field1536, 81);
                var15.field7872.method2281((byte) 58, var14);
                class511.method3028(7482, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field7913[--field7908];
                method3195(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7908 -= 2;
                String var17 = field7913[field7908];
                String var18 = field7913[field7908 + 1];
                if (class37.field698 != 0 || (!class256.field3481 || class341.field4503) && !class689.field9822) {
                    field7916++;
                    class543 var19 = class299.method1780(class84.field1196, class204.field2449, 43);
                    var19.field7872.method2281((byte) 58, 0);
                    int var20 = var19.field7872.field5195;
                    var19.field7872.method2269(var17, -30);
                    class457.method2714(true, var19.field7872, var18);
                    var19.field7872.method2265(var19.field7872.field5195 - var20, (byte) -49);
                    class511.method3028(7482, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field7914[--field7905];
                class6 var22 = class300.method1785((byte) 47, var21);
                String var23 = "";
                if (var22 != null && var22.field54 != null) {
                    var23 = var22.field54;
                }
                field7913[field7908++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field7914[--field7905];
                class6 var25 = class300.method1785((byte) 47, var24);
                String var26 = "";
                if (var25 != null && var25.field43 != null) {
                    var26 = var25.field43;
                }
                field7913[field7908++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field7914[--field7905];
                class6 var28 = class300.method1785((byte) 47, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field57;
                }
                field7914[field7905++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class206.field2472 == null || class206.field2472.field8786 == null) {
                    var30 = class468.field6540;
                } else {
                    var30 = class206.field2472.method3521(true, (byte) -104);
                }
                field7913[field7908++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field7914[field7905++] = class149.field1826;
                return;
            }
            if (arg0 == 5017) {
                field7914[field7905++] = class482.method2815(false);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field7914[--field7905];
                class6 var32 = class300.method1785((byte) 47, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field50;
                }
                field7914[field7905++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field7914[--field7905];
                class6 var35 = class300.method1785((byte) 47, var34);
                String var36 = "";
                if (var35 != null && var35.field48 != null) {
                    var36 = var35.field48;
                }
                field7913[field7908++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class206.field2472 == null || class206.field2472.field8786 == null) {
                    var37 = class468.field6540;
                } else {
                    var37 = class206.field2472.method3511(-1, false);
                }
                field7913[field7908++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field7914[--field7905];
                class6 var39 = class300.method1785((byte) 47, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field47;
                }
                field7914[field7905++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field7914[--field7905];
                class6 var42 = class300.method1785((byte) 47, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field44;
                }
                field7914[field7905++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field7914[--field7905];
                class6 var45 = class300.method1785((byte) 47, var44);
                String var46 = "";
                if (var45 != null && var45.field52 != null) {
                    var46 = var45.field52;
                }
                field7913[field7908++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field7914[--field7905];
                field7913[field7908++] = class563.field8141.method2563((byte) 127, var47).field7047;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field7914[--field7905];
                class505 var49 = class563.field8141.method2563((byte) 121, var48);
                if (var49.field7048 == null) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = var49.field7048.length;
                return;
            }
            if (arg0 == 5052) {
                field7905 -= 2;
                int var50 = field7914[field7905];
                int var51 = field7914[field7905 + 1];
                class505 var52 = class563.field8141.method2563((byte) 111, var50);
                int var53 = var52.field7048[var51];
                field7914[field7905++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field7914[--field7905];
                class505 var55 = class563.field8141.method2563((byte) 98, var54);
                if (var55.field7045 == null) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = var55.field7045.length;
                return;
            }
            if (arg0 == 5054) {
                field7905 -= 2;
                int var56 = field7914[field7905];
                int var57 = field7914[field7905 + 1];
                field7914[field7905++] = class563.field8141.method2563((byte) 125, var56).field7045[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field7914[--field7905];
                field7913[field7908++] = class188.field2292.method1869(var58, -84).method2464(true);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field7914[--field7905];
                class406 var60 = class188.field2292.method1869(var59, -127);
                if (var60.field5745 == null) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = var60.field5745.length;
                return;
            }
            if (arg0 == 5057) {
                field7905 -= 2;
                int var61 = field7914[field7905];
                int var62 = field7914[field7905 + 1];
                field7914[field7905++] = class188.field2292.method1869(var61, -111).field5745[var62];
                return;
            }
            if (arg0 == 5058) {
                field7912 = new class189();
                field7912.field2311 = field7914[--field7905];
                field7912.field2302 = class188.field2292.method1869(field7912.field2311, -83);
                field7912.field2304 = new int[field7912.field2302.method2456((byte) 24)];
                return;
            }
            if (arg0 == 5059) {
                field7921++;
                class543 var63 = class299.method1780(class84.field1196, class531.field7752, 60);
                var63.field7872.method2281((byte) 58, 0);
                int var64 = var63.field7872.field5195;
                var63.field7872.method2281((byte) 58, 0);
                var63.field7872.method2261((byte) 81, field7912.field2311);
                field7912.field2302.method2457(-1, field7912.field2304, var63.field7872);
                var63.field7872.method2265(var63.field7872.field5195 - var64, (byte) -127);
                class511.method3028(7482, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field7913[--field7908];
                field7911++;
                class543 var66 = class299.method1780(class84.field1196, class188.field2294, 97);
                var66.field7872.method2281((byte) 58, 0);
                int var67 = var66.field7872.field5195;
                var66.field7872.method2269(var65, -32);
                var66.field7872.method2261((byte) 52, field7912.field2311);
                field7912.field2302.method2457(-1, field7912.field2304, var66.field7872);
                var66.field7872.method2265(var66.field7872.field5195 - var67, (byte) 61);
                class511.method3028(7482, var66);
                return;
            }
            if (arg0 == 5061) {
                field7921++;
                class543 var68 = class299.method1780(class84.field1196, class531.field7752, 124);
                var68.field7872.method2281((byte) 58, 0);
                int var69 = var68.field7872.field5195;
                var68.field7872.method2281((byte) 58, 1);
                var68.field7872.method2261((byte) 44, field7912.field2311);
                field7912.field2302.method2457(-1, field7912.field2304, var68.field7872);
                var68.field7872.method2265(var68.field7872.field5195 - var69, (byte) -76);
                class511.method3028(7482, var68);
                return;
            }
            if (arg0 == 5062) {
                field7905 -= 2;
                int var70 = field7914[field7905];
                int var71 = field7914[field7905 + 1];
                field7914[field7905++] = class563.field8141.method2563((byte) 93, var70).field7054[var71];
                return;
            }
            if (arg0 == 5063) {
                field7905 -= 2;
                int var72 = field7914[field7905];
                int var73 = field7914[field7905 + 1];
                field7914[field7905++] = class563.field8141.method2563((byte) 118, var72).field7042[var73];
                return;
            }
            if (arg0 == 5064) {
                field7905 -= 2;
                int var74 = field7914[field7905];
                int var75 = field7914[field7905 + 1];
                if (var75 == -1) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = class563.field8141.method2563((byte) 88, var74).method2924((byte) 123, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field7905 -= 2;
                int var76 = field7914[field7905];
                int var77 = field7914[field7905 + 1];
                if (var77 == -1) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = class563.field8141.method2563((byte) 82, var76).method2926((char) var77, (byte) 55);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field7914[--field7905];
                field7914[field7905++] = class188.field2292.method1869(var78, -124).method2456((byte) 24);
                return;
            }
            if (arg0 == 5067) {
                field7905 -= 2;
                int var79 = field7914[field7905];
                int var80 = field7914[field7905 + 1];
                int var81 = class188.field2292.method1869(var79, -123).method2458((byte) -63, var80).field9863;
                field7914[field7905++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field7905 -= 2;
                int var82 = field7914[field7905];
                int var83 = field7914[field7905 + 1];
                field7912.field2304[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field7905 -= 2;
                int var84 = field7914[field7905];
                int var85 = field7914[field7905 + 1];
                field7912.field2304[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field7905 -= 3;
                int var86 = field7914[field7905];
                int var87 = field7914[field7905 + 1];
                int var88 = field7914[field7905 + 2];
                class406 var89 = class188.field2292.method1869(var86, -94);
                if (var89.method2458((byte) -63, var87).field9863 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7914[field7905++] = var89.method2459((byte) 63, var88, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field7913[--field7908];
                boolean var91 = field7914[--field7905] == 1;
                class652.method3668(0, var91, var90);
                field7914[field7905++] = class596.field8615;
                return;
            }
            if (arg0 == 5072) {
                if (class70.field1071 != null && class285.field3862 < class596.field8615) {
                    field7914[field7905++] = class70.field1071[class285.field3862++] & 0xFFFF;
                    return;
                }
                field7914[field7905++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class285.field3862 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class376.field5043.method1687(-7653, 86)) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class376.field5043.method1687(-7653, 82)) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class376.field5043.method1687(-7653, 81)) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class586.method3401(115, field7914[--field7905]);
                return;
            }
            if (arg0 == 5201) {
                field7914[field7905++] = class484.method2830(-7670);
                return;
            }
            if (arg0 == 5205) {
                class456.method2708(-1, field7914[--field7905], false, (byte) -52, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field7914[--field7905];
                class114 var93 = class550.method3227(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = var93.field1486;
                return;
            }
            if (arg0 == 5207) {
                class114 var94 = class550.method3229(field7914[--field7905]);
                if (var94 != null && var94.field1468 != null) {
                    field7913[field7908++] = var94.field1468;
                    return;
                }
                field7913[field7908++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7914[field7905++] = class620.field8887;
                field7914[field7905++] = class653.field9276;
                return;
            }
            if (arg0 == 5209) {
                field7914[field7905++] = class550.field8007 + class418.field5921;
                field7914[field7905++] = class550.field8009 + class426.field6111;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field7914[--field7905];
                class114 var96 = class550.method3229(var95);
                if (var96 == null) {
                    field7914[field7905++] = 0;
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = var96.field1477 >> 14 & 0x3FFF;
                field7914[field7905++] = var96.field1477 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field7914[--field7905];
                class114 var98 = class550.method3229(var97);
                if (var98 == null) {
                    field7914[field7905++] = 0;
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = var98.field1474 - var98.field1475;
                field7914[field7905++] = var98.field1481 - var98.field1484;
                return;
            }
            if (arg0 == 5212) {
                class9 var99 = class280.method1685((byte) -117);
                if (var99 == null) {
                    field7914[field7905++] = -1;
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = var99.field90;
                int var100 = var99.field88 << 28 | class550.field8007 + var99.field95 << 14 | class550.field8009 + var99.field94;
                field7914[field7905++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class9 var101 = class193.method1183(28);
                if (var101 == null) {
                    field7914[field7905++] = -1;
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = var101.field90;
                int var102 = var101.field88 << 28 | class550.field8007 + var101.field95 << 14 | class550.field8009 + var101.field94;
                field7914[field7905++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field7914[--field7905];
                class114 var104 = class578.method3377(15504);
                if (var104 != null) {
                    boolean var105 = var104.method815(var103 >> 14 & 0x3FFF, var103 >> 28 & 0x3, var103 & 0x3FFF, 20035, field7924);
                    if (var105) {
                        class261.method1591(field7924[1], field7924[2], (byte) 50);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7905 -= 2;
                int var106 = field7914[field7905];
                int var107 = field7914[field7905 + 1];
                class22 var108 = class550.method3221(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class114 var110 = (class114) var108.method347(0); var110 != null; var110 = (class114) var108.method344((byte) 24)) {
                    if (var110.field1486 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field7914[--field7905];
                class114 var112 = class550.method3229(var111);
                if (var112 == null) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = var112.field1488;
                return;
            }
            if (arg0 == 5220) {
                field7914[field7905++] = class411.field5847 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field7914[--field7905];
                class261.method1591(var113 >> 14 & 0x3FFF, var113 & 0x3FFF, (byte) 50);
                return;
            }
            if (arg0 == 5222) {
                class114 var114 = class578.method3377(15504);
                if (var114 != null) {
                    boolean var115 = var114.method819((byte) 64, class550.field8007 + class418.field5921, field7924, class550.field8009 + class426.field6111);
                    if (var115) {
                        field7914[field7905++] = field7924[1];
                        field7914[field7905++] = field7924[2];
                        return;
                    }
                    field7914[field7905++] = -1;
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = -1;
                field7914[field7905++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7905 -= 2;
                int var116 = field7914[field7905];
                int var117 = field7914[field7905 + 1];
                class456.method2708(var117 & 0x3FFF, var116, false, (byte) -52, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field7914[--field7905];
                class114 var119 = class578.method3377(15504);
                if (var119 != null) {
                    boolean var120 = var119.method815(var118 >> 14 & 0x3FFF, var118 >> 28 & 0x3, var118 & 0x3FFF, 20035, field7924);
                    if (var120) {
                        field7914[field7905++] = field7924[1];
                        field7914[field7905++] = field7924[2];
                        return;
                    }
                    field7914[field7905++] = -1;
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = -1;
                field7914[field7905++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field7914[--field7905];
                class114 var122 = class578.method3377(15504);
                if (var122 != null) {
                    boolean var123 = var122.method819((byte) 64, var121 >> 14 & 0x3FFF, field7924, var121 & 0x3FFF);
                    if (var123) {
                        field7914[field7905++] = field7924[1];
                        field7914[field7905++] = field7924[2];
                        return;
                    }
                    field7914[field7905++] = -1;
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = -1;
                field7914[field7905++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class170.method1074(field7914[--field7905], (byte) 87);
                return;
            }
            if (arg0 == 5227) {
                field7905 -= 2;
                int var124 = field7914[field7905];
                int var125 = field7914[field7905 + 1];
                class456.method2708(var125 & 0x3FFF, var124, true, (byte) -52, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class230.field2989 = field7914[--field7905] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7914[field7905++] = class230.field2989 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field7914[--field7905];
                class443.method2626(var126, -122);
                return;
            }
            if (arg0 == 5231) {
                field7905 -= 2;
                int var127 = field7914[field7905];
                boolean var128 = field7914[field7905 + 1] == 1;
                if (class687.field9806 != null) {
                    class513 var129 = class687.field9806.method3678((long) var127, -126);
                    if (var129 != null && !var128) {
                        var129.method3045(true);
                        return;
                    }
                    if (var129 == null && var128) {
                        class513 var130 = new class513();
                        class687.field9806.method3670((long) var127, var130, (byte) 127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field7914[--field7905];
                if (class687.field9806 != null) {
                    class513 var132 = class687.field9806.method3678((long) var131, -126);
                    field7914[field7905++] = var132 == null ? 0 : 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7905 -= 2;
                int var133 = field7914[field7905];
                boolean var134 = field7914[field7905 + 1] == 1;
                if (class207.field2527 != null) {
                    class513 var135 = class207.field2527.method3678((long) var133, -119);
                    if (var135 != null && !var134) {
                        var135.method3045(true);
                        return;
                    }
                    if (var135 == null && var134) {
                        class513 var136 = new class513();
                        class207.field2527.method3670((long) var133, var136, (byte) 127);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field7914[--field7905];
                if (class207.field2527 != null) {
                    class513 var138 = class207.field2527.method3678((long) var137, -123);
                    field7914[field7905++] = var138 == null ? 0 : 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7914[field7905++] = class550.field7975 == null ? -1 : class550.field7975.field1486;
                return;
            }
            if (arg0 == 5236) {
                field7905 -= 2;
                int var139 = field7914[field7905];
                int var140 = field7914[field7905 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class389.method2275(var141, var139, var142, 128);
                if (var143 < 0) {
                    field7914[field7905++] = -1;
                    return;
                }
                field7914[field7905++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class516.method3057((byte) -79);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7905 -= 2;
                int var144 = field7914[field7905];
                int var145 = field7914[field7905 + 1];
                class14.method153(var144, 3, false, var145, (byte) 125);
                field7914[field7905++] = class617.field8851 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class617.field8851 != null) {
                    class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 127);
                }
                return;
            }
            if (arg0 == 5302) {
                class621[] var146 = class467.method2742(80);
                field7914[field7905++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field7914[--field7905];
                class621[] var148 = class467.method2742(127);
                field7914[field7905++] = var148[var147].field8891;
                field7914[field7905++] = var148[var147].field8894;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class221.field2851.field4133;
                int var150 = class221.field2851.field4140;
                int var151 = -1;
                class621[] var152 = class467.method2742(78);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class621 var154 = var152[var153];
                    if (var154.field8891 == var149 && var154.field8894 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field7914[field7905++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field7914[field7905++] = class158.method996(3);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field7914[--field7905];
                if (var155 >= 1 && var155 <= 2) {
                    class14.method153(-1, var155, false, -1, (byte) 109);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7914[field7905++] = class221.field2851.field4148;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field7914[--field7905];
                if (var156 >= 1 && var156 <= 2) {
                    class221.field2851.field4148 = var156;
                    class221.field2851.method1742(class517.field7570, -1);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7908 -= 2;
                String var157 = field7913[field7908];
                String var158 = field7913[field7908 + 1];
                int var159 = field7914[--field7905];
                field7903++;
                class543 var160 = class299.method1780(class84.field1196, class585.field8495, 37);
                var160.field7872.method2281((byte) 58, class251.method1534(var157, (byte) 103) + class251.method1534(var158, (byte) 101) + 1);
                var160.field7872.method2269(var157, -82);
                var160.field7872.method2269(var158, -29);
                var160.field7872.method2281((byte) 58, var159);
                class511.method3028(7482, var160);
                return;
            }
            if (arg0 == 5401) {
                field7905 -= 2;
                class120.field1560[field7914[field7905]] = (short) class90.method703((byte) -101, field7914[field7905 + 1]);
                class65.field1021.method190(6589);
                class65.field1021.method181(-107);
                class206.field2477.method1951((byte) -128);
                class100.method747(false);
                return;
            }
            if (arg0 == 5405) {
                field7905 -= 2;
                int var161 = field7914[field7905];
                int var162 = field7914[field7905 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class420.field5959[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7905 -= 7;
                int var163 = field7914[field7905];
                int var164 = field7914[field7905 + 1] << 1;
                int var165 = field7914[field7905 + 2];
                int var166 = field7914[field7905 + 3];
                int var167 = field7914[field7905 + 4];
                int var168 = field7914[field7905 + 5];
                int var169 = field7914[field7905 + 6];
                if (var163 >= 0 && var163 < 2 && class420.field5959[var163] != null && var164 >= 0 && var164 < class420.field5959[var163].length) {
                    class420.field5959[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class420.field5959[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class420.field5959[field7914[--field7905]].length >> 1;
                field7914[field7905++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class617.field8851 != null) {
                    class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 114);
                }
                if (class646.field9189 != null) {
                    class651.method3664((byte) -115);
                    System.exit(0);
                    return;
                }
                String var171 = class310.field4103 == null ? class587.method3403(86) : class310.field4103;
                class266.method1610((byte) -118, false, var171, class375.field5039 == 1, class517.field7570);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class430.field6163 != null) {
                    if (class430.field6163.field6695 == null) {
                        var172 = class414.method2488(127, class430.field6163.field6697);
                    } else {
                        var172 = (String) class430.field6163.field6695;
                    }
                }
                field7913[field7908++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field7914[field7905++] = class517.field7570.field3404 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class617.field8851 != null) {
                    class14.method153(-1, class221.field2851.field4148, false, -1, (byte) 102);
                }
                String var173 = field7913[--field7908];
                boolean var174 = field7914[--field7905] == 1;
                String var175 = class587.method3403(59) + var173;
                class266.method1610((byte) -118, var174, var175, class375.field5039 == 1, class517.field7570);
                return;
            }
            if (arg0 == 5422) {
                field7908 -= 2;
                String var176 = field7913[field7908];
                String var177 = field7913[field7908 + 1];
                int var178 = field7914[--field7905];
                if (var176.length() > 0) {
                    if (class521.field7646 == null) {
                        class521.field7646 = new String[class596.field8617[class588.field8518.field1256]];
                    }
                    class521.field7646[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class612.field8778 == null) {
                        class612.field8778 = new String[class596.field8617[class588.field8518.field1256]];
                    }
                    class612.field8778[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7913[--field7908]);
                return;
            }
            if (arg0 == 5424) {
                field7905 -= 11;
                class668.field9606 = field7914[field7905];
                class401.field5663 = field7914[field7905 + 1];
                class562.field8126 = field7914[field7905 + 2];
                class514.field7543 = field7914[field7905 + 3];
                class588.field8520 = field7914[field7905 + 4];
                class417.field5904 = field7914[field7905 + 5];
                class116.field1505 = field7914[field7905 + 6];
                class285.field3866 = field7914[field7905 + 7];
                class435.field6236 = field7914[field7905 + 8];
                class227.field2936 = field7914[field7905 + 9];
                class231.field3007 = field7914[field7905 + 10];
                class692.field9847.method3802(class588.field8520, (byte) 104);
                class692.field9847.method3802(class417.field5904, (byte) -47);
                class692.field9847.method3802(class116.field1505, (byte) 101);
                class692.field9847.method3802(class285.field3866, (byte) 1);
                class692.field9847.method3802(class435.field6236, (byte) -82);
                class496.field6934 = null;
                class562.field8119 = null;
                class186.field2282 = null;
                class205.field2454 = null;
                class504.field7035 = null;
                class215.field2735 = null;
                class568.field8314 = null;
                class406.field5747 = null;
                class120.field1561 = true;
                return;
            }
            if (arg0 == 5425) {
                class70.method627((byte) -68);
                class120.field1561 = false;
                return;
            }
            if (arg0 == 5426) {
                field7905 -= 2;
                class208.field2540 = field7914[field7905];
                class660.field9376 = field7914[field7905 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7905 -= 2;
                class427.field6138 = field7914[field7905 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7905 -= 2;
                int var179 = field7914[field7905];
                int var180 = field7914[field7905 + 1];
                field7914[field7905++] = class129.method881(var180, var179, (byte) -71) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class634.method3626(false, false, -97, field7913[--field7908]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class140.method923(class627.field8991, (byte) 71, "accountcreated");
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class140.method923(class627.field8991, (byte) -78, "accountcreatestarted");
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class181.field2220 != null) {
                    Transferable var182 = class181.field2220.getContents(null);
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
                field7913[field7908++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7905 -= 4;
                int var183 = field7914[field7905];
                int var184 = field7914[field7905 + 1];
                int var185 = field7914[field7905 + 2];
                int var186 = field7914[field7905 + 3];
                class409.method2470((var183 & 0x3FFF) - class88.field1239, var184 << 2, false, var186, (var183 >> 14 & 0x3FFF) - class36.field689, false, var185);
                return;
            }
            if (arg0 == 5501) {
                field7905 -= 4;
                int var187 = field7914[field7905];
                int var188 = field7914[field7905 + 1];
                int var189 = field7914[field7905 + 2];
                int var190 = field7914[field7905 + 3];
                class408.method2467((var187 >> 14 & 0x3FFF) - class36.field689, var190, var189, 25000, var188 << 2, (var187 & 0x3FFF) - class88.field1239);
                return;
            }
            if (arg0 == 5502) {
                field7905 -= 6;
                int var191 = field7914[field7905];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class38.field713 = var191;
                int var192 = field7914[field7905 + 1];
                if (var192 + 1 >= class420.field5959[class38.field713].length >> 1) {
                    throw new RuntimeException();
                }
                class118.field1521 = var192;
                class411.field5848 = 0;
                class204.field2448 = field7914[field7905 + 2];
                class604.field8713 = field7914[field7905 + 3];
                int var193 = field7914[field7905 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class40.field752 = var193;
                int var194 = field7914[field7905 + 5];
                if (var194 + 1 >= class420.field5959[class40.field752].length >> 1) {
                    throw new RuntimeException();
                }
                class246.field3381 = var194;
                class586.field8507 = 3;
                class221.field2860 = -1;
                class51.field842 = -1;
                return;
            }
            if (arg0 == 5503) {
                class473.method2783(false);
                return;
            }
            if (arg0 == 5504) {
                field7905 -= 2;
                class603.method3478(field7914[field7905], true, field7914[field7905 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field7914[field7905++] = (int) class393.field5309 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7914[field7905++] = (int) class115.field1495 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class76.method649(true);
                return;
            }
            if (arg0 == 5508) {
                class608.method3496(-114);
                return;
            }
            if (arg0 == 5509) {
                class13.method148(191);
                return;
            }
            if (arg0 == 5510) {
                class406.method2453(-20643);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field7914[--field7905];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class36.field689;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class473.field6604) {
                    var198 = class473.field6604;
                }
                int var199 = var197 - class88.field1239;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class205.field2465) {
                    var199 = class205.field2465;
                }
                class394.field5560 = (var198 << 9) + 256;
                class271.field3695 = (var199 << 9) + 256;
                class586.field8507 = 4;
                class221.field2860 = -1;
                class51.field842 = -1;
                return;
            }
            if (arg0 == 5512) {
                class578.method3378((byte) 115);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field7914[--field7905];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class36.field689;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class473.field6604) {
                        var203 = class473.field6604;
                    }
                    int var204 = var202 - class88.field1239;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class205.field2465) {
                        var204 = class205.field2465;
                    }
                    class51.field842 = (var203 << 9) + 256;
                    class221.field2860 = (var204 << 9) + 256;
                    return;
                }
                class51.field842 = -1;
                class221.field2860 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7908 -= 2;
                String var205 = field7913[field7908];
                String var206 = field7913[field7908 + 1];
                int var207 = field7914[--field7905];
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    class468.field6540 = var205;
                    class422.field6010 = var206;
                    class168.field2054 = var207;
                    class245.method1487(6, -21316);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class78.method657(true);
                return;
            }
            if (arg0 == 5602) {
                if (class690.field9842 == 0) {
                    class323.field4283 = -2;
                    class48.field816 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7905 -= 4;
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    class245.method1488(field7914[field7905 + 1], field7914[field7905], field7914[field7905 + 2], field7914[field7905 + 3], (byte) 122);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7908--;
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    class20.method338(false, class78.method653(field7913[field7908], -3328));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7908 -= 2;
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    class567.method3324(false, field7913[field7908 + 1], class78.method653(field7913[field7908], -3328), 10);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class382.field5103 == 0) {
                    class696.field9865 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7914[field7905++] = class48.field816;
                return;
            }
            if (arg0 == 5608) {
                field7914[field7905++] = class285.field3864;
                return;
            }
            if (arg0 == 5609) {
                field7914[field7905++] = class696.field9865;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field7913[field7908++] = class517.field7569 == null || class517.field7569.length <= var208 ? "" : class202.method1232(false, class517.field7569[var208]);
                }
                class517.field7569 = null;
                return;
            }
            if (arg0 == 5611) {
                field7914[field7905++] = class367.field4942;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field7914[--field7905];
                if (class114.field1485 != 7) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    if (class489.field6835 != null) {
                        class489.field6835.method1853((byte) 11);
                        class489.field6835 = null;
                    }
                    class168.field2054 = var209;
                    class245.method1487(9, -21316);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7914[field7905++] = class48.field816;
                return;
            }
            if (arg0 == 5615) {
                field7908 -= 2;
                String var210 = field7913[field7908];
                String var211 = field7913[field7908 + 1];
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    if (class489.field6835 != null) {
                        class489.field6835.method1853((byte) 11);
                        class489.field6835 = null;
                    }
                    class468.field6540 = var210;
                    class422.field6010 = var211;
                    class245.method1487(5, -21316);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class168.method1061((byte) 41, false);
                return;
            }
            if (arg0 == 5617) {
                field7914[field7905++] = class323.field4283;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field7914[--field7905];
                class378.method2197(62, false, var212);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field7914[--field7905];
                class378.method2197(96, true, var213);
                return;
            }
            if (arg0 == 5620) {
                class496.method2890((byte) 126);
                if (class682.field9753 != "" && class682.field9753 != "") {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7908 -= 2;
                if (class114.field1485 != 3) {
                    return;
                }
                if (class690.field9842 == 0 && class382.field5103 == 0) {
                    class567.method3324(true, field7913[field7908 + 1], class78.method653(field7913[field7908], -3328), 10);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class477 var214 = class517.field7570.method1505("3", -1, false);
                while (var214.field6693 == 0) {
                    class151.method974((byte) -102, 1L);
                }
                if (var214.field6693 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class38 var215 = (class38) var214.field6695;
                if (var215.method444(89).exists()) {
                    class389 var216 = new class389(50);
                    try {
                        var215.method441(0, var216.field5205, 50, 3763);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method442((byte) -72);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class424.field6102 != null) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field7914[field7905++] = (int) (class163.field1995 >> 32);
                field7914[field7905++] = (int) (class163.field1995 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field7914[--field7905];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class221.field2851.field4171 = var217;
                class479.method2811((byte) -33);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6002) {
                class221.field2851.method1743(-26848, field7914[--field7905] == 1);
                class479.method2811((byte) 126);
                class699.method3917(122);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6003) {
                class221.field2851.field4179 = field7914[--field7905] == 1;
                class699.method3917(127);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6005) {
                class221.field2851.field4165 = field7914[--field7905] == 1;
                class479.method2811((byte) -11);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6006) {
                class221.field2851.field4157 = field7914[--field7905] == 1;
                class68.field1045.method295(!class221.field2851.field4157);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6007) {
                class221.field2851.field4137 = field7914[--field7905];
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6008) {
                class221.field2851.field4136 = field7914[--field7905] == 1;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6009) {
                class221.field2851.field4135 = field7914[--field7905] == 1;
                class479.method2811((byte) 127);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6010) {
                class221.field2851.field4132 = field7914[--field7905] == 1;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field7914[--field7905];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class221.field2851.method1842(var218, class375.field5039, 0);
                class479.method2811((byte) 127);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6012) {
                class221.field2851.method1847((byte) 104, field7914[--field7905] == 1, class375.field5039);
                class231.method1399(97693160);
                class221.method1337(4);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6014) {
                class221.field2851.field4159 = field7914[--field7905] == 1;
                class479.method2811((byte) -79);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6015) {
                class221.field2851.field4170 = field7914[--field7905] == 1;
                class479.method2811((byte) 126);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field7914[--field7905];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class221.field2851.field4152 = var219;
                class435.method2608(50, class375.field5039);
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6017) {
                class221.field2851.field4138 = field7914[--field7905] == 1;
                class400.method2421(1678);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field7914[--field7905];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class221.field2851.field4155 = var220;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field7914[--field7905];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class221.field2851.field4158 != var221) {
                    if (class221.field2851.field4158 == 0 && class584.field8487 != -1) {
                        class521.method3088(var221, 120, false, class275.field3764, class584.field8487, 0);
                        class331.method1920(-1);
                        class621.field8895 = false;
                    } else if (var221 == 0) {
                        class88.method700(-114);
                        class621.field8895 = false;
                    } else {
                        class638.method3640(var221, false);
                    }
                    class221.field2851.field4158 = var221;
                }
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field7914[--field7905];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class221.field2851.field4134 = var222;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6021) {
                class221.field2851.field3978 = field7914[--field7905] == 1;
                class699.method3917(115);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field7914[--field7905];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class590.field8558 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class680.method3856(false, var223);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                field7914[field7905++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field7914[--field7905];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class221.field2851.field4147 = var225;
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field7914[--field7905];
                if (var226 < 0 || var226 > class467.method2739(class590.field8558, (byte) 38)) {
                    var226 = 0;
                }
                class221.field2851.field4172 = var226;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field7914[--field7905];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class334.method1933((byte) -110, var227 == 1);
                return;
            }
            if (arg0 == 6028) {
                class221.field2851.field4151 = field7914[--field7905] != 0;
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6029) {
                class221.field2851.field4137 = field7914[--field7905];
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6030) {
                class221.field2851.field4161 = field7914[--field7905] != 0;
                class221.field2851.method1742(class517.field7570, -1);
                class479.method2811((byte) 127);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field7914[--field7905];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class435.method2608(-125, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field7914[--field7905];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class221.field2851.field4154 = var229;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field7914[--field7905];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class221.field2851.field4164 = var230;
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6034) {
                class221.field2851.field4142 = field7914[--field7905] == 1;
                class221.field2851.method1742(class517.field7570, -1);
                class231.method1399(97693160);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6035) {
                class221.field2851.field3987 = field7914[--field7905] == 1;
                class479.method2811((byte) -7);
                class699.method3917(109);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field7914[--field7905];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class221.field2851.method1761(-11817, var231);
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field7914[--field7905];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class221.field2851.field4176 = var232;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field7914[--field7905];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class221.field2851.field4162 != var233 && class631.field9082 == class584.field8487) {
                    if (class221.field2851.field4162 == 0) {
                        class521.method3088(var233, 85, false, class275.field3764, class584.field8487, 0);
                        class331.method1920(-1);
                        class621.field8895 = false;
                    } else if (var233 == 0) {
                        class88.method700(-110);
                        class621.field8895 = false;
                    } else {
                        class638.method3640(var233, false);
                    }
                }
                class221.field2851.field4162 = var233;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field7914[--field7905];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class221.field2851.field4173 != var234) {
                    class221.field2851.field4173 = var234;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7914[field7905++] = class221.field2851.field4171;
                return;
            }
            if (arg0 == 6102) {
                field7914[field7905++] = class221.field2851.method1755((byte) -120, class375.field5039) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7914[field7905++] = class221.field2851.field4179 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7914[field7905++] = class221.field2851.field4165 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7914[field7905++] = class221.field2851.field4157 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7914[field7905++] = class221.field2851.field4137;
                return;
            }
            if (arg0 == 6108) {
                field7914[field7905++] = class221.field2851.field4136 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7914[field7905++] = class221.field2851.field4135 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7914[field7905++] = class221.field2851.field4132 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7914[field7905++] = class221.field2851.method1844(class375.field5039, true);
                return;
            }
            if (arg0 == 6112) {
                field7914[field7905++] = class221.field2851.method1841(class375.field5039, 3) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7914[field7905++] = class221.field2851.field4159 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7914[field7905++] = class221.field2851.field4170 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7914[field7905++] = class221.field2851.field4152;
                return;
            }
            if (arg0 == 6117) {
                field7914[field7905++] = class221.field2851.field4138 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7914[field7905++] = class221.field2851.field4155;
                return;
            }
            if (arg0 == 6119) {
                field7914[field7905++] = class221.field2851.field4158;
                return;
            }
            if (arg0 == 6120) {
                field7914[field7905++] = class221.field2851.field4134;
                return;
            }
            if (arg0 == 6121) {
                field7914[field7905++] = class68.field1045.method317() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7914[field7905++] = class265.method1608(true);
                return;
            }
            if (arg0 == 6124) {
                field7914[field7905++] = class221.field2851.field4147;
                return;
            }
            if (arg0 == 6125) {
                field7914[field7905++] = class221.field2851.field4172;
                return;
            }
            if (arg0 == 6126) {
                field7914[field7905++] = class68.field1045.method218() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7914[field7905++] = class221.field2851.field4149 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7914[field7905++] = class221.field2851.field4151 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7914[field7905++] = class221.field2851.field4137;
                return;
            }
            if (arg0 == 6130) {
                field7914[field7905++] = class221.field2851.field4161 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7914[field7905++] = class375.field5039;
                return;
            }
            if (arg0 == 6132) {
                field7914[field7905++] = class221.field2851.field4154;
                return;
            }
            if (arg0 == 6133) {
                field7914[field7905++] = class517.field7570.field3404 && !class517.field7570.field3401 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7914[field7905++] = class467.method2739(class590.field8558, (byte) -100);
                return;
            }
            if (arg0 == 6135) {
                field7914[field7905++] = class221.field2851.field4164;
                return;
            }
            if (arg0 == 6136) {
                field7914[field7905++] = class221.field2851.field4142 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field7914[field7905++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field7914[field7905++] = class454.method2693(200, class375.field5039, (byte) 103);
                return;
            }
            if (arg0 == 6139) {
                field7914[field7905++] = class221.field2851.method1759(class375.field5039, 120);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class565.method3313((byte) 72, class375.field5039) && class590.field8558 < 96) {
                    var236 = 1;
                }
                field7914[field7905++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class590.field8558 < 96) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field7914[field7905++] = class221.field2851.field4176;
                return;
            }
            if (arg0 == 6143) {
                field7914[field7905++] = class221.field2851.field4162;
                return;
            }
            if (arg0 == 6144) {
                field7914[field7905++] = class700.field9909 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field7914[field7905++] = class221.field2851.field4173;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7905 -= 2;
                class697.field9871 = (short) field7914[field7905];
                if (class697.field9871 <= 0) {
                    class697.field9871 = 256;
                }
                class489.field6841 = (short) field7914[field7905 + 1];
                if (class489.field6841 <= 0) {
                    class489.field6841 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7905 -= 2;
                class127.field1621 = (short) field7914[field7905];
                if (class127.field1621 <= 0) {
                    class127.field1621 = 256;
                }
                class331.field4402 = (short) field7914[field7905 + 1];
                if (class331.field4402 <= 0) {
                    class331.field4402 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7905 -= 4;
                class75.field1113 = (short) field7914[field7905];
                if (class75.field1113 <= 0) {
                    class75.field1113 = 1;
                }
                class611.field8755 = (short) field7914[field7905 + 1];
                if (class611.field8755 <= 0) {
                    class611.field8755 = 32767;
                } else if (class611.field8755 < class75.field1113) {
                    class611.field8755 = class75.field1113;
                }
                class502.field7012 = (short) field7914[field7905 + 2];
                if (class502.field7012 <= 0) {
                    class502.field7012 = 1;
                }
                class230.field2997 = (short) field7914[field7905 + 3];
                if (class230.field2997 <= 0) {
                    class230.field2997 = 32767;
                    return;
                }
                if (class230.field2997 < class502.field7012) {
                    class230.field2997 = class502.field7012;
                }
                return;
            }
            if (arg0 == 6203) {
                class210.method1256(class504.field7030.field414, 0, false, class504.field7030.field402, true, 0);
                field7914[field7905++] = class502.field7011;
                field7914[field7905++] = class112.field1435;
                return;
            }
            if (arg0 == 6204) {
                field7914[field7905++] = class127.field1621;
                field7914[field7905++] = class331.field4402;
                return;
            }
            if (arg0 == 6205) {
                field7914[field7905++] = class697.field9871;
                field7914[field7905++] = class489.field6841;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7914[field7905++] = (int) (class301.method1787((byte) -69) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7914[field7905++] = (int) (class301.method1787((byte) 110) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7905 -= 3;
                int var237 = field7914[field7905];
                int var238 = field7914[field7905 + 1];
                int var239 = field7914[field7905 + 2];
                field7900.clear();
                field7900.set(11, 12);
                field7900.set(var239, var238, var237);
                int var240 = (int) (field7900.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field7914[field7905++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field7900.clear();
                field7900.setTime(new Date(class301.method1787((byte) -69)));
                field7914[field7905++] = field7900.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field7914[--field7905];
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
                field7914[field7905++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7914[field7905++] = class214.method1298((byte) 116) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7914[field7905++] = class394.method2385((byte) 124) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class114.field1485 == 7 && class690.field9842 == 0 && class382.field5103 == 0) {
                    if (class443.field6316) {
                        field7914[field7905++] = 0;
                        return;
                    }
                    if (class664.field9398 > class301.method1787((byte) -43) - 1000L) {
                        field7914[field7905++] = 1;
                        return;
                    }
                    class443.field6316 = true;
                    class543 var243 = class299.method1780(class84.field1196, class643.field9184, 101);
                    var243.field7872.method2233((byte) -99, class263.field3627);
                    class511.method3028(7482, var243);
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class404 var244 = class396.method2395(2);
                if (var244 != null) {
                    field7914[field7905++] = var244.field5698;
                    field7914[field7905++] = var244.field7791;
                    field7913[field7908++] = var244.field5697;
                    class570 var245 = var244.method2435(false);
                    field7914[field7905++] = var245.field8335;
                    field7913[field7908++] = var245.field8339;
                    field7914[field7905++] = var244.field7797;
                    field7914[field7905++] = var244.field5696;
                    field7913[field7908++] = var244.field5703;
                    return;
                }
                field7914[field7905++] = -1;
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                return;
            }
            if (arg0 == 6502) {
                class404 var246 = class519.method3071(-65);
                if (var246 != null) {
                    field7914[field7905++] = var246.field5698;
                    field7914[field7905++] = var246.field7791;
                    field7913[field7908++] = var246.field5697;
                    class570 var247 = var246.method2435(false);
                    field7914[field7905++] = var247.field8335;
                    field7913[field7908++] = var247.field8339;
                    field7914[field7905++] = var246.field7797;
                    field7914[field7905++] = var246.field5696;
                    field7913[field7908++] = var246.field5703;
                    return;
                }
                field7914[field7905++] = -1;
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field7914[--field7905];
                String var249 = field7913[--field7908];
                if (class114.field1485 == 7 && class690.field9842 == 0 && class382.field5103 == 0) {
                    field7914[field7905++] = class426.method2565(var248, true, var249) ? 1 : 0;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class221.field2851.field4168 = field7914[--field7905];
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6505) {
                field7914[field7905++] = class221.field2851.field4168;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field7914[--field7905];
                class404 var251 = class452.method2676(var250, true);
                if (var251 != null) {
                    field7914[field7905++] = var251.field7791;
                    field7913[field7908++] = var251.field5697;
                    class570 var252 = var251.method2435(false);
                    field7914[field7905++] = var252.field8335;
                    field7913[field7908++] = var252.field8339;
                    field7914[field7905++] = var251.field7797;
                    field7914[field7905++] = var251.field5696;
                    field7913[field7908++] = var251.field5703;
                    return;
                }
                field7914[field7905++] = -1;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                field7914[field7905++] = 0;
                field7914[field7905++] = 0;
                field7913[field7908++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7905 -= 4;
                int var253 = field7914[field7905];
                boolean var254 = field7914[field7905 + 1] == 1;
                int var255 = field7914[field7905 + 2];
                boolean var256 = field7914[field7905 + 3] == 1;
                class320.method1864(var256, var253, var254, var255, (byte) 59);
                return;
            }
            if (arg0 == 6508) {
                class614.method3524(0);
                return;
            }
            if (arg0 == 6509) {
                if (class114.field1485 != 7) {
                    return;
                }
                class36.field688 = field7914[--field7905] == 1;
                return;
            }
            if (arg0 == 6510) {
                field7914[field7905++] = class55.field876;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class221.field2851.field4141 = field7914[--field7905] == 1;
                class221.field2851.method1742(class517.field7570, -1);
                return;
            }
            if (arg0 == 6601) {
                field7914[field7905++] = class221.field2851.field4141 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class5.field34 == class377.field5068) {
            if (arg0 == 6700) {
                int var257 = class113.field1442.method3673(17467);
                if (class127.field1619 != -1) {
                    var257++;
                }
                field7914[field7905++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field7914[--field7905];
                if (class127.field1619 != -1) {
                    if (var258 == 0) {
                        field7914[field7905++] = class127.field1619;
                        return;
                    }
                    var258--;
                }
                class21 var259 = (class21) class113.field1442.method3669((byte) 28);
                while (var258-- > 0) {
                    var259 = (class21) class113.field1442.method3676((byte) -12);
                }
                field7914[field7905++] = var259.field540;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field7914[--field7905];
                if (class516.field7555[var260] == null) {
                    field7913[field7908++] = "";
                    return;
                }
                String var261 = class516.field7555[var260][0].field400;
                if (var261 == null) {
                    field7913[field7908++] = "";
                    return;
                }
                field7913[field7908++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field7914[--field7905];
                if (class516.field7555[var262] == null) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = class516.field7555[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field7905 -= 2;
                int var263 = field7914[field7905];
                int var264 = field7914[field7905 + 1];
                if (class516.field7555[var263] == null) {
                    field7913[field7908++] = "";
                    return;
                }
                String var265 = class516.field7555[var263][var264].field400;
                if (var265 == null) {
                    field7913[field7908++] = "";
                    return;
                }
                field7913[field7908++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field7905 -= 2;
                int var266 = field7914[field7905];
                int var267 = field7914[field7905 + 1];
                if (class516.field7555[var266] == null) {
                    field7914[field7905++] = 0;
                    return;
                }
                field7914[field7905++] = class516.field7555[var266][var267].field455;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7905 -= 3;
                int var268 = field7914[field7905];
                int var269 = field7914[field7905 + 1];
                int var270 = field7914[field7905 + 2];
                class469.method2752(var270, (byte) -118, 1, "", var268 << 16 | var269);
                return;
            }
            if (arg0 == 6708) {
                field7905 -= 3;
                int var271 = field7914[field7905];
                int var272 = field7914[field7905 + 1];
                int var273 = field7914[field7905 + 2];
                class469.method2752(var273, (byte) 113, 2, "", var271 << 16 | var272);
                return;
            }
            if (arg0 == 6709) {
                field7905 -= 3;
                int var274 = field7914[field7905];
                int var275 = field7914[field7905 + 1];
                int var276 = field7914[field7905 + 2];
                class469.method2752(var276, (byte) -27, 3, "", var274 << 16 | var275);
                return;
            }
            if (arg0 == 6710) {
                field7905 -= 3;
                int var277 = field7914[field7905];
                int var278 = field7914[field7905 + 1];
                int var279 = field7914[field7905 + 2];
                class469.method2752(var279, (byte) 83, 4, "", var277 << 16 | var278);
                return;
            }
            if (arg0 == 6711) {
                field7905 -= 3;
                int var280 = field7914[field7905];
                int var281 = field7914[field7905 + 1];
                int var282 = field7914[field7905 + 2];
                class469.method2752(var282, (byte) -62, 5, "", var280 << 16 | var281);
                return;
            }
            if (arg0 == 6712) {
                field7905 -= 3;
                int var283 = field7914[field7905];
                int var284 = field7914[field7905 + 1];
                int var285 = field7914[field7905 + 2];
                class469.method2752(var285, (byte) 99, 6, "", var283 << 16 | var284);
                return;
            }
            if (arg0 == 6713) {
                field7905 -= 3;
                int var286 = field7914[field7905];
                int var287 = field7914[field7905 + 1];
                int var288 = field7914[field7905 + 2];
                class469.method2752(var288, (byte) 89, 7, "", var286 << 16 | var287);
                return;
            }
            if (arg0 == 6714) {
                field7905 -= 3;
                int var289 = field7914[field7905];
                int var290 = field7914[field7905 + 1];
                int var291 = field7914[field7905 + 2];
                class469.method2752(var291, (byte) -61, 8, "", var289 << 16 | var290);
                return;
            }
            if (arg0 == 6715) {
                field7905 -= 3;
                int var292 = field7914[field7905];
                int var293 = field7914[field7905 + 1];
                int var294 = field7914[field7905 + 2];
                class469.method2752(var294, (byte) -2, 9, "", var292 << 16 | var293);
                return;
            }
            if (arg0 == 6716) {
                field7905 -= 3;
                int var295 = field7914[field7905];
                int var296 = field7914[field7905 + 1];
                int var297 = field7914[field7905 + 2];
                class469.method2752(var297, (byte) 73, 10, "", var295 << 16 | var296);
                return;
            }
            if (arg0 == 6717) {
                field7905 -= 3;
                int var298 = field7914[field7905];
                int var299 = field7914[field7905 + 1];
                int var300 = field7914[field7905 + 2];
                class17 var301 = class346.method1981(var298 << 16 | var299, var300, (byte) -118);
                class415.method2491(106);
                class158 var302 = client.method1659(var301);
                class566.method3319(var302.method997((byte) 123), 108, var301, var302.field1923);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field7914[--field7905];
                class289 var304 = class455.field6408.method3816(-102, var303);
                if (var304.field3910 == null) {
                    field7913[field7908++] = "";
                    return;
                }
                field7913[field7908++] = var304.field3910;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field7914[--field7905];
                class289 var306 = class455.field6408.method3816(-128, var305);
                field7914[field7905++] = var306.field3904;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field7914[--field7905];
                class289 var308 = class455.field6408.method3816(74, var307);
                field7914[field7905++] = var308.field3913;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field7914[--field7905];
                class289 var310 = class455.field6408.method3816(-2, var309);
                field7914[field7905++] = var310.field3930;
                return;
            }
            if (arg0 == 6804) {
                field7905 -= 2;
                int var311 = field7914[field7905];
                int var312 = field7914[field7905 + 1];
                class184 var313 = class582.field8483.method2536((byte) -117, var312);
                if (var313.method1144(-5)) {
                    field7913[field7908++] = class455.field6408.method3816(-120, var311).method1721(var312, 102, var313.field2249);
                    return;
                }
                field7914[field7905++] = class455.field6408.method3816(-95, var311).method1716(var312, var313.field2253, true);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7914[field7905++] = class256.field3481 && !class341.field4503 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7914[field7905++] = class548.field7960;
                return;
            }
            if (arg0 == 6902) {
                field7914[field7905++] = class633.field9094;
                return;
            }
            if (arg0 == 6903) {
                field7914[field7905++] = class528.field7722;
                return;
            }
            if (arg0 == 6904) {
                field7914[field7905++] = class202.field2440;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class430.field6163 != null) {
                    if (class430.field6163.field6695 == null) {
                        var314 = class414.method2488(86, class430.field6163.field6697);
                    } else {
                        var314 = (String) class430.field6163.field6695;
                    }
                }
                field7913[field7908++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field7914[field7905++] = class4.field20;
                return;
            }
            if (arg0 == 6907) {
                field7914[field7905++] = class322.field4248;
                return;
            }
            if (arg0 == 6908) {
                field7914[field7905++] = class578.field8442;
                return;
            }
            if (arg0 == 6909) {
                field7914[field7905++] = class255.field3464 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7914[field7905++] = class395.field5585;
                return;
            }
            if (arg0 == 6911) {
                field7914[field7905++] = class332.field4416;
                return;
            }
            if (arg0 == 6912) {
                field7914[field7905++] = class673.field9669;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class221.field2851.method1756((byte) -36);
                field7914[field7905++] = class221.field2851.field3990 = class375.field5039;
                field7914[field7905++] = var315;
                class479.method2811((byte) 127);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7001) {
                class221.field2851.method1751(-109);
                class479.method2811((byte) 127);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7002) {
                class221.field2851.method1762(-105);
                class479.method2811((byte) -104);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7003) {
                class221.field2851.method1752((byte) -81);
                class479.method2811((byte) 126);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7004) {
                class221.field2851.method1749(-3660, true);
                class479.method2811((byte) 126);
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7005) {
                class221.field2851.field4153 = 0;
                class221.field2851.method1742(class517.field7570, -1);
                class553.field8029 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class221.field2851.field3990 == 2) {
                    class221.field2851.field3972 = true;
                    return;
                }
                if (class221.field2851.field3990 == 1) {
                    class221.field2851.field3963 = true;
                    return;
                }
                if (class221.field2851.field3990 == 3) {
                    class221.field2851.field3983 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field7914[field7905++] = class221.field2851.field4153;
                return;
            }
            if (arg0 == 7008) {
                if (class375.field5039 == 0 && class590.field8558 < 96) {
                    field7914[field7905++] = 1;
                    return;
                }
                field7914[field7905++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method3193(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7900.setTime(new Date(var1));
        int var3 = field7900.get(5);
        int var4 = field7900.get(2);
        int var5 = field7900.get(1);
        return var3 + "-" + field7925[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lhu;II)V")
    public static final void method3194(class115 arg0, int arg1, int arg2) {
        class537 var3 = class276.method1673(arg1, 2166, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field7899 = new int[var3.field7823];
        field7915 = new String[var3.field7817];
        if (class86.field1217 == var3.field7818 || class346.field4545 == var3.field7818 || class293.field3954 == var3.field7818) {
            int var4 = 0;
            int var5 = 0;
            if (class112.field1431 != null) {
                var4 = class112.field1431.field460;
                var5 = class112.field1431.field351;
            }
            field7899[0] = class478.field6713.method1349(-116) - var4;
            field7899[1] = class478.field6713.method1338(1) - var5;
        }
        method3199(var3, 200000);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3195(String arg0, int arg1) {
        if (class37.field698 == 0 && !(!class256.field3481 || class341.field4503) || class689.field9822) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class424.field6085.method2561(0, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class424.field6085.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6086.method2561(0, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class424.field6086.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6087.method2561(0, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class424.field6087.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6088.method2561(0, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class424.field6088.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6089.method2561(0, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class424.field6089.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6090.method2561(0, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class424.field6090.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6091.method2561(0, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class424.field6091.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6092.method2561(0, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class424.field6092.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6093.method2561(0, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class424.field6093.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6094.method2561(0, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class424.field6094.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6095.method2561(0, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class424.field6095.method2561(0, 0).length());
        } else if (var2.startsWith(class424.field6096.method2561(0, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class424.field6096.method2561(0, 0).length());
        } else if (class370.field4980 != 0) {
            if (var2.startsWith(class424.field6085.method2561(class370.field4980, 0))) {
                var3 = 0;
                arg0 = arg0.substring(class424.field6085.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6086.method2561(class370.field4980, 0))) {
                var3 = 1;
                arg0 = arg0.substring(class424.field6086.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6087.method2561(class370.field4980, 0))) {
                var3 = 2;
                arg0 = arg0.substring(class424.field6087.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6088.method2561(class370.field4980, 0))) {
                var3 = 3;
                arg0 = arg0.substring(class424.field6088.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6089.method2561(class370.field4980, 0))) {
                var3 = 4;
                arg0 = arg0.substring(class424.field6089.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6090.method2561(class370.field4980, 0))) {
                var3 = 5;
                arg0 = arg0.substring(class424.field6090.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6091.method2561(class370.field4980, 0))) {
                var3 = 6;
                arg0 = arg0.substring(class424.field6091.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6092.method2561(class370.field4980, 0))) {
                var3 = 7;
                arg0 = arg0.substring(class424.field6092.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6093.method2561(class370.field4980, 0))) {
                var3 = 8;
                arg0 = arg0.substring(class424.field6093.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6094.method2561(class370.field4980, 0))) {
                var3 = 9;
                arg0 = arg0.substring(class424.field6094.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6095.method2561(class370.field4980, 0))) {
                var3 = 10;
                arg0 = arg0.substring(class424.field6095.method2561(class370.field4980, 0).length());
            } else if (var2.startsWith(class424.field6096.method2561(class370.field4980, 0))) {
                var3 = 11;
                arg0 = arg0.substring(class424.field6096.method2561(class370.field4980, 0).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class424.field6097.method2561(0, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class424.field6097.method2561(0, 0).length());
        } else if (var4.startsWith(class424.field6098.method2561(0, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class424.field6098.method2561(0, 0).length());
        } else if (var4.startsWith(class424.field6099.method2561(0, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class424.field6099.method2561(0, 0).length());
        } else if (var4.startsWith(class424.field6100.method2561(0, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class424.field6100.method2561(0, 0).length());
        } else if (var4.startsWith(class424.field6101.method2561(0, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class424.field6101.method2561(0, 0).length());
        } else if (class370.field4980 != 0) {
            if (var4.startsWith(class424.field6097.method2561(class370.field4980, 0))) {
                var5 = 1;
                arg0 = arg0.substring(class424.field6097.method2561(class370.field4980, 0).length());
            } else if (var4.startsWith(class424.field6098.method2561(class370.field4980, 0))) {
                var5 = 2;
                arg0 = arg0.substring(class424.field6098.method2561(class370.field4980, 0).length());
            } else if (var4.startsWith(class424.field6099.method2561(class370.field4980, 0))) {
                var5 = 3;
                arg0 = arg0.substring(class424.field6099.method2561(class370.field4980, 0).length());
            } else if (var4.startsWith(class424.field6100.method2561(class370.field4980, 0))) {
                var5 = 4;
                arg0 = arg0.substring(class424.field6100.method2561(class370.field4980, 0).length());
            } else if (var4.startsWith(class424.field6101.method2561(class370.field4980, 0))) {
                var5 = 5;
                arg0 = arg0.substring(class424.field6101.method2561(class370.field4980, 0).length());
            }
        }
        field7919++;
        class543 var6 = class299.method1780(class84.field1196, class288.field3884, 76);
        var6.field7872.method2281((byte) 58, 0);
        int var7 = var6.field7872.field5195;
        var6.field7872.method2281((byte) 58, var3);
        var6.field7872.method2281((byte) 58, var5);
        class457.method2714(true, var6.field7872, arg0);
        var6.field7872.method2265(var6.field7872.field5195 - var7, (byte) 95);
        class511.method3028(7482, var6);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(IZ)V")
    private static final void method3196(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7905 -= 3;
                int var2 = field7914[field7905];
                int var3 = field7914[field7905 + 1];
                int var4 = field7914[field7905 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class17 var5 = class400.method2420((byte) -102, var2);
                if (var5.field429 == null) {
                    var5.field429 = new class17[var4 + 1];
                }
                if (var5.field429.length <= var4) {
                    class17[] var6 = new class17[var4 + 1];
                    for (int var7 = 0; var7 < var5.field429.length; var7++) {
                        var6[var7] = var5.field429[var7];
                    }
                    var5.field429 = var6;
                }
                if (var4 > 0 && var5.field429[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class17 var8 = new class17();
                var8.field379 = var3;
                var8.field469 = var8.field465 = var5.field465;
                var8.field485 = var4;
                var5.field429[var4] = var8;
                if (arg1) {
                    field7917 = var8;
                } else {
                    field7907 = var8;
                }
                class314.method1836(var5, false);
                return;
            }
            if (arg0 == 101) {
                class17 var9 = arg1 ? field7917 : field7907;
                if (var9.field485 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class17 var10 = class400.method2420((byte) -112, var9.field465);
                var10.field429[var9.field485] = null;
                class314.method1836(var10, false);
                return;
            }
            if (arg0 == 102) {
                class17 var11 = class400.method2420((byte) -116, field7914[--field7905]);
                var11.field429 = null;
                class314.method1836(var11, false);
                return;
            }
            if (arg0 == 200) {
                field7905 -= 2;
                int var12 = field7914[field7905];
                int var13 = field7914[field7905 + 1];
                class17 var14 = class346.method1981(var12, var13, (byte) -121);
                if (var14 != null && var13 != -1) {
                    field7914[field7905++] = 1;
                    if (arg1) {
                        field7917 = var14;
                        return;
                    }
                    field7907 = var14;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7914[--field7905];
                class17 var16 = class400.method2420((byte) -97, var15);
                if (var16 != null) {
                    field7914[field7905++] = 1;
                    if (arg1) {
                        field7917 = var16;
                        return;
                    }
                    field7907 = var16;
                    return;
                }
                field7914[field7905++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7914[--field7905];
                method3197(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7914[--field7905];
                method3200(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7905 -= 2;
                int var19 = field7914[field7905];
                int var20 = field7914[field7905 + 1];
                for (int var21 = 0; var21 < class497.field6940.length; var21++) {
                    if (class497.field6940[var21] == var19) {
                        class206.field2472.field8824.method3338(var21, -6822, class616.field8848, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class191.field2332.length; var22++) {
                    if (class191.field2332[var22] == var19) {
                        class206.field2472.field8824.method3338(var22, -6822, class616.field8848, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7905 -= 2;
                int var23 = field7914[field7905];
                int var24 = field7914[field7905 + 1];
                class206.field2472.field8824.method3334(var23, -53, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7914[--field7905] != 0;
                class206.field2472.field8824.method3332((byte) 67, var25);
                return;
            }
            if (arg0 == 411) {
                field7905 -= 2;
                int var26 = field7914[field7905];
                int var27 = field7914[field7905 + 1];
                class206.field2472.field8824.method3337(class65.field1021, var27, true, var26);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class17 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class400.method2420((byte) -111, field7914[--field7905]);
            } else {
                var28 = arg1 ? field7917 : field7907;
            }
            if (arg0 == 1000) {
                field7905 -= 4;
                var28.field443 = field7914[field7905];
                var28.field413 = field7914[field7905 + 1];
                int var29 = field7914[field7905 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field7914[field7905 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field403 = (byte) var29;
                var28.field389 = (byte) var30;
                class314.method1836(var28, false);
                class314.method1840(var28, -125);
                if (var28.field485 == -1) {
                    class222.method1351(var28.field465, 11);
                }
                return;
            }
            if (arg0 == 1001) {
                field7905 -= 4;
                var28.field367 = field7914[field7905];
                var28.field405 = field7914[field7905 + 1];
                var28.field399 = 0;
                var28.field329 = 0;
                int var31 = field7914[field7905 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field7914[field7905 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field420 = (byte) var31;
                var28.field441 = (byte) var32;
                class314.method1836(var28, false);
                class314.method1840(var28, -123);
                if (var28.field379 == 0) {
                    class431.method2592(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field7914[--field7905] == 1;
                if (var28.field461 != var33) {
                    var28.field461 = var33;
                    class314.method1836(var28, false);
                }
                if (var28.field485 == -1) {
                    class9.method56(var28.field465, true);
                }
                return;
            }
            if (arg0 == 1004) {
                field7905 -= 2;
                var28.field334 = field7914[field7905];
                var28.field371 = field7914[field7905 + 1];
                class314.method1836(var28, false);
                class314.method1840(var28, -119);
                if (var28.field379 == 0) {
                    class431.method2592(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field482 = field7914[--field7905] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class17 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class400.method2420((byte) -120, field7914[--field7905]);
            } else {
                var34 = arg1 ? field7917 : field7907;
            }
            if (arg0 == 1100) {
                field7905 -= 2;
                var34.field332 = field7914[field7905];
                if (var34.field332 > var34.field375 - var34.field414) {
                    var34.field332 = var34.field375 - var34.field414;
                }
                if (var34.field332 < 0) {
                    var34.field332 = 0;
                }
                var34.field480 = field7914[field7905 + 1];
                if (var34.field480 > var34.field343 - var34.field402) {
                    var34.field480 = var34.field343 - var34.field402;
                }
                if (var34.field480 < 0) {
                    var34.field480 = 0;
                }
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class195.method1196(var34.field465, (byte) 7);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field470 = field7914[--field7905];
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class1.method1(var34.field465, (byte) -50);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field489 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1103) {
                var34.field437 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1104) {
                var34.field352 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field7914[--field7905];
                if (var34.field401 != var35) {
                    var34.field401 = var35;
                    class314.method1836(var34, false);
                }
                if (var34.field485 == -1) {
                    class186.method1157(var34.field465, (byte) -104);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field387 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1107) {
                var34.field368 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1108) {
                var34.field433 = 1;
                var34.field342 = field7914[--field7905];
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class196.method1198((byte) 118, var34.field465);
                }
                return;
            }
            if (arg0 == 1109) {
                field7905 -= 6;
                var34.field380 = field7914[field7905];
                var34.field398 = field7914[field7905 + 1];
                var34.field408 = field7914[field7905 + 2];
                var34.field454 = field7914[field7905 + 3];
                var34.field474 = field7914[field7905 + 4];
                var34.field446 = field7914[field7905 + 5];
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class185.method1155(-108, var34.field465);
                    class393.method2364(var34.field465, (byte) 103);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field7914[--field7905];
                if (var34.field382 != var36) {
                    var34.field382 = var36;
                    var34.field444 = 0;
                    var34.field415 = 1;
                    var34.field385 = 0;
                    class282 var37 = var34.field382 == -1 ? null : class195.field2367.method3273(var34.field382, 0);
                    if (var37 != null) {
                        class32.method402(var34.field444, -1830945624, var37);
                    }
                    class314.method1836(var34, false);
                }
                if (var34.field485 == -1) {
                    class6.method39(true, var34.field465);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field358 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field7913[--field7908];
                if (!var38.equals(var34.field476)) {
                    var34.field476 = var38;
                    class314.method1836(var34, false);
                }
                if (var34.field485 == -1) {
                    class342.method1971(var34.field465, 11);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field348 = field7914[--field7905];
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class397.method2401((byte) 50, var34.field465);
                }
                return;
            }
            if (arg0 == 1114) {
                field7905 -= 3;
                var34.field372 = field7914[field7905];
                var34.field421 = field7914[field7905 + 1];
                var34.field383 = field7914[field7905 + 2];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1115) {
                var34.field354 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1116) {
                var34.field486 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1117) {
                var34.field324 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1118) {
                var34.field422 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1119) {
                var34.field394 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1120) {
                field7905 -= 2;
                var34.field375 = field7914[field7905];
                var34.field343 = field7914[field7905 + 1];
                class314.method1836(var34, false);
                if (var34.field379 == 0) {
                    class431.method2592(false, var34, -1);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field370 = field7914[--field7905] == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1123) {
                var34.field446 = field7914[--field7905];
                class314.method1836(var34, false);
                if (var34.field485 == -1) {
                    class185.method1155(75, var34.field465);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field7914[--field7905];
                var34.field434 = var39 == 1;
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1125) {
                field7905 -= 2;
                var34.field365 = field7914[field7905];
                var34.field457 = field7914[field7905 + 1];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1126) {
                var34.field467 = field7914[--field7905];
                class314.method1836(var34, false);
                return;
            }
            if (arg0 == 1127) {
                field7905 -= 2;
                int var40 = field7914[field7905];
                int var41 = field7914[field7905 + 1];
                class184 var42 = class582.field8483.method2536((byte) -126, var40);
                if (var42.field2253 != var41) {
                    var34.method202(var41, var40, (byte) -122);
                    return;
                }
                var34.method193((byte) -74, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field7914[--field7905];
                String var44 = field7913[--field7908];
                class184 var45 = class582.field8483.method2536((byte) -115, var43);
                if (!var45.field2249.equals(var44)) {
                    var34.method199(114, var43, var44);
                    return;
                }
                var34.method193((byte) -74, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class17 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class400.method2420((byte) -109, field7914[--field7905]);
            } else {
                var46 = arg1 ? field7917 : field7907;
            }
            class314.method1836(var46, false);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7905 -= 2;
                int var47 = field7914[field7905];
                int var48 = field7914[field7905 + 1];
                if (var46.field485 == -1) {
                    class704.method3946((byte) -44, var46.field465);
                    class185.method1155(-110, var46.field465);
                    class393.method2364(var46.field465, (byte) 93);
                }
                if (var47 == -1) {
                    var46.field433 = 1;
                    var46.field342 = -1;
                    var46.field412 = -1;
                    return;
                }
                var46.field412 = var47;
                var46.field361 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field364 = true;
                } else {
                    var46.field364 = false;
                }
                class238 var49 = class65.field1021.method178(false, var47);
                var46.field408 = var49.field3234;
                var46.field454 = var49.field3250;
                var46.field474 = var49.field3264;
                var46.field380 = var49.field3196;
                var46.field398 = var49.field3271;
                var46.field446 = var49.field3215;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field357 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field357 = 1;
                } else {
                    var46.field357 = 2;
                }
                if (var46.field399 > 0) {
                    var46.field446 = var46.field446 * 32 / var46.field399;
                    return;
                }
                if (var46.field367 > 0) {
                    var46.field446 = var46.field446 * 32 / var46.field367;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field433 = 2;
                var46.field342 = field7914[--field7905];
                if (var46.field485 == -1) {
                    class196.method1198((byte) 124, var46.field465);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field433 = 3;
                var46.field342 = -1;
                if (var46.field485 == -1) {
                    class196.method1198((byte) 122, var46.field465);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field433 = 6;
                var46.field342 = field7914[--field7905];
                if (var46.field485 == -1) {
                    class196.method1198((byte) 119, var46.field465);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field433 = 5;
                var46.field342 = field7914[--field7905];
                if (var46.field485 == -1) {
                    class196.method1198((byte) 120, var46.field465);
                }
                return;
            }
            if (arg0 == 1206) {
                field7905 -= 4;
                var46.field483 = field7914[field7905];
                var46.field325 = field7914[field7905 + 1];
                var46.field424 = field7914[field7905 + 2];
                var46.field350 = field7914[field7905 + 3];
                class314.method1836(var46, false);
                return;
            }
            if (arg0 == 1207) {
                field7905 -= 2;
                var46.field478 = field7914[field7905];
                var46.field327 = field7914[field7905 + 1];
                class314.method1836(var46, false);
                return;
            }
            if (arg0 == 1210) {
                field7905 -= 4;
                var46.field342 = field7914[field7905];
                var46.field447 = field7914[field7905 + 1];
                if (field7914[field7905 + 2] == 1) {
                    var46.field433 = 9;
                } else {
                    var46.field433 = 8;
                }
                if (field7914[field7905 + 3] == 1) {
                    var46.field364 = true;
                } else {
                    var46.field364 = false;
                }
                if (var46.field485 == -1) {
                    class196.method1198((byte) 124, var46.field465);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field433 = 5;
                var46.field342 = class63.field1016;
                var46.field447 = 0;
                if (var46.field485 == -1) {
                    class196.method1198((byte) 116, var46.field465);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class17 var61;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var61 = class400.method2420((byte) -105, field7914[--field7905]);
                } else {
                    var61 = arg1 ? field7917 : field7907;
                }
                if (arg0 == 1499) {
                    var61.method195((byte) -110);
                    return;
                }
                String var62 = field7913[--field7908];
                int[] var63 = null;
                if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                    int var64 = field7914[--field7905];
                    if (var64 > 0) {
                        var63 = new int[var64];
                        while (var64-- > 0) {
                            var63[var64] = field7914[--field7905];
                        }
                    }
                    var62 = var62.substring(0, var62.length() - 1);
                }
                Object[] var65 = new Object[var62.length() + 1];
                for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                    if (var62.charAt(var66 - 1) == 's') {
                        var65[var66] = field7913[--field7908];
                    } else {
                        var65[var66] = Integer.valueOf(field7914[--field7905]);
                    }
                }
                int var67 = field7914[--field7905];
                if (var67 == -1) {
                    var65 = null;
                } else {
                    var65[0] = Integer.valueOf(var67);
                }
                if (arg0 == 1400) {
                    var61.field439 = var65;
                } else if (arg0 == 1401) {
                    var61.field458 = var65;
                } else if (arg0 == 1402) {
                    var61.field341 = var65;
                } else if (arg0 == 1403) {
                    var61.field473 = var65;
                } else if (arg0 == 1404) {
                    var61.field471 = var65;
                } else if (arg0 == 1405) {
                    var61.field472 = var65;
                } else if (arg0 == 1406) {
                    var61.field407 = var65;
                } else if (arg0 == 1407) {
                    var61.field336 = var65;
                    var61.field356 = var63;
                } else if (arg0 == 1408) {
                    var61.field363 = var65;
                } else if (arg0 == 1409) {
                    var61.field338 = var65;
                } else if (arg0 == 1410) {
                    var61.field337 = var65;
                } else if (arg0 == 1411) {
                    var61.field418 = var65;
                } else if (arg0 == 1412) {
                    var61.field369 = var65;
                } else if (arg0 == 1414) {
                    var61.field330 = var65;
                    var61.field374 = var63;
                } else if (arg0 == 1415) {
                    var61.field381 = var65;
                    var61.field435 = var63;
                } else if (arg0 == 1416) {
                    var61.field410 = var65;
                } else if (arg0 == 1417) {
                    var61.field442 = var65;
                } else if (arg0 == 1418) {
                    var61.field487 = var65;
                } else if (arg0 == 1419) {
                    var61.field392 = var65;
                } else if (arg0 == 1420) {
                    var61.field427 = var65;
                } else if (arg0 == 1421) {
                    var61.field411 = var65;
                } else if (arg0 == 1422) {
                    var61.field417 = var65;
                } else if (arg0 == 1423) {
                    var61.field462 = var65;
                } else if (arg0 == 1424) {
                    var61.field378 = var65;
                } else if (arg0 == 1425) {
                    var61.field481 = var65;
                } else if (arg0 == 1426) {
                    var61.field395 = var65;
                } else if (arg0 == 1427) {
                    var61.field333 = var65;
                } else if (arg0 == 1428) {
                    var61.field423 = var65;
                    var61.field484 = var63;
                } else if (arg0 == 1429) {
                    var61.field479 = var65;
                    var61.field436 = var63;
                } else if (arg0 == 1430) {
                    var61.field453 = var65;
                }
                var61.field425 = true;
                return;
            }
            if (arg0 < 1600) {
                class17 var68 = arg1 ? field7917 : field7907;
                if (arg0 == 1500) {
                    field7914[field7905++] = var68.field460;
                    return;
                }
                if (arg0 == 1501) {
                    field7914[field7905++] = var68.field351;
                    return;
                }
                if (arg0 == 1502) {
                    field7914[field7905++] = var68.field414;
                    return;
                }
                if (arg0 == 1503) {
                    field7914[field7905++] = var68.field402;
                    return;
                }
                if (arg0 == 1504) {
                    field7914[field7905++] = var68.field461 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7914[field7905++] = var68.field469;
                    return;
                }
                if (arg0 == 1506) {
                    class17 var69 = class532.method3129(var68, 3450);
                    field7914[field7905++] = var69 == null ? -1 : var69.field465;
                    return;
                }
            } else if (arg0 < 1700) {
                class17 var70 = arg1 ? field7917 : field7907;
                if (arg0 == 1600) {
                    field7914[field7905++] = var70.field332;
                    return;
                }
                if (arg0 == 1601) {
                    field7914[field7905++] = var70.field480;
                    return;
                }
                if (arg0 == 1602) {
                    field7913[field7908++] = var70.field476;
                    return;
                }
                if (arg0 == 1603) {
                    field7914[field7905++] = var70.field375;
                    return;
                }
                if (arg0 == 1604) {
                    field7914[field7905++] = var70.field343;
                    return;
                }
                if (arg0 == 1605) {
                    field7914[field7905++] = var70.field446;
                    return;
                }
                if (arg0 == 1606) {
                    field7914[field7905++] = var70.field408;
                    return;
                }
                if (arg0 == 1607) {
                    field7914[field7905++] = var70.field474;
                    return;
                }
                if (arg0 == 1608) {
                    field7914[field7905++] = var70.field454;
                    return;
                }
                if (arg0 == 1609) {
                    field7914[field7905++] = var70.field437;
                    return;
                }
                if (arg0 == 1610) {
                    field7914[field7905++] = var70.field380;
                    return;
                }
                if (arg0 == 1611) {
                    field7914[field7905++] = var70.field398;
                    return;
                }
                if (arg0 == 1612) {
                    field7914[field7905++] = var70.field401;
                    return;
                }
                if (arg0 == 1613) {
                    int var71 = field7914[--field7905];
                    class184 var72 = class582.field8483.method2536((byte) -113, var71);
                    if (var72.method1144(-5)) {
                        field7913[field7908++] = var70.method209(var72.field2249, (byte) -41, var71);
                        return;
                    }
                    field7914[field7905++] = var70.method207(var71, (byte) 96, var72.field2253);
                    return;
                }
                if (arg0 == 1614) {
                    field7914[field7905++] = var70.field387;
                    return;
                }
                if (arg0 == 2614) {
                    field7914[field7905++] = var70.field433 == 1 ? var70.field342 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class17 var73 = arg1 ? field7917 : field7907;
                if (arg0 == 1700) {
                    field7914[field7905++] = var73.field412;
                    return;
                }
                if (arg0 == 1701) {
                    if (var73.field412 != -1) {
                        field7914[field7905++] = var73.field361;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7914[field7905++] = var73.field485;
                    return;
                }
            } else if (arg0 < 1900) {
                class17 var74 = arg1 ? field7917 : field7907;
                if (arg0 == 1800) {
                    field7914[field7905++] = client.method1659(var74).method997((byte) -122);
                    return;
                }
                if (arg0 == 1801) {
                    int var75 = field7914[--field7905];
                    int var356 = var75 - 1;
                    if (var74.field339 != null && var356 < var74.field339.length && var74.field339[var356] != null) {
                        field7913[field7908++] = var74.field339[var356];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var74.field438 == null) {
                        field7913[field7908++] = "";
                        return;
                    }
                    field7913[field7908++] = var74.field438;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class17 var354;
                if (arg0 >= 2000) {
                    var354 = class400.method2420((byte) -127, field7914[--field7905]);
                    arg0 -= 1000;
                } else {
                    var354 = arg1 ? field7917 : field7907;
                }
                if (field7927 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var354.field333 == null) {
                        return;
                    }
                    class143 var355 = new class143();
                    var355.field1789 = var354;
                    var355.field1786 = var354.field333;
                    var355.field1785 = field7927 + 1;
                    class397.field5620.method1129(var355, 262144);
                    return;
                }
            } else if (arg0 < 2600) {
                class17 var76 = class400.method2420((byte) -117, field7914[--field7905]);
                if (arg0 == 2500) {
                    field7914[field7905++] = var76.field460;
                    return;
                }
                if (arg0 == 2501) {
                    field7914[field7905++] = var76.field351;
                    return;
                }
                if (arg0 == 2502) {
                    field7914[field7905++] = var76.field414;
                    return;
                }
                if (arg0 == 2503) {
                    field7914[field7905++] = var76.field402;
                    return;
                }
                if (arg0 == 2504) {
                    field7914[field7905++] = var76.field461 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7914[field7905++] = var76.field469;
                    return;
                }
                if (arg0 == 1506) {
                    class17 var77 = class532.method3129(var76, 3450);
                    field7914[field7905++] = var77 == null ? -1 : var77.field465;
                    return;
                }
            } else if (arg0 < 2700) {
                class17 var78 = class400.method2420((byte) -99, field7914[--field7905]);
                if (arg0 == 2600) {
                    field7914[field7905++] = var78.field332;
                    return;
                }
                if (arg0 == 2601) {
                    field7914[field7905++] = var78.field480;
                    return;
                }
                if (arg0 == 2602) {
                    field7913[field7908++] = var78.field476;
                    return;
                }
                if (arg0 == 2603) {
                    field7914[field7905++] = var78.field375;
                    return;
                }
                if (arg0 == 2604) {
                    field7914[field7905++] = var78.field343;
                    return;
                }
                if (arg0 == 2605) {
                    field7914[field7905++] = var78.field446;
                    return;
                }
                if (arg0 == 2606) {
                    field7914[field7905++] = var78.field408;
                    return;
                }
                if (arg0 == 2607) {
                    field7914[field7905++] = var78.field474;
                    return;
                }
                if (arg0 == 2608) {
                    field7914[field7905++] = var78.field454;
                    return;
                }
                if (arg0 == 2609) {
                    field7914[field7905++] = var78.field437;
                    return;
                }
                if (arg0 == 2610) {
                    field7914[field7905++] = var78.field380;
                    return;
                }
                if (arg0 == 2611) {
                    field7914[field7905++] = var78.field398;
                    return;
                }
                if (arg0 == 2612) {
                    field7914[field7905++] = var78.field401;
                    return;
                }
                if (arg0 == 2613) {
                    field7914[field7905++] = var78.field387;
                    return;
                }
                if (arg0 == 2614) {
                    field7914[field7905++] = var78.field433 == 1 ? var78.field342 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class17 var79 = class400.method2420((byte) -111, field7914[--field7905]);
                    field7914[field7905++] = var79.field412;
                    return;
                }
                if (arg0 == 2701) {
                    class17 var80 = class400.method2420((byte) -126, field7914[--field7905]);
                    if (var80.field412 != -1) {
                        field7914[field7905++] = var80.field361;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var81 = field7914[--field7905];
                    class21 var82 = (class21) class113.field1442.method3678((long) var81, -120);
                    if (var82 != null) {
                        field7914[field7905++] = 1;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class17 var83 = class400.method2420((byte) -120, field7914[--field7905]);
                    if (var83.field429 == null) {
                        field7914[field7905++] = 0;
                        return;
                    }
                    int var84 = var83.field429.length;
                    for (int var85 = 0; var85 < var83.field429.length; var85++) {
                        if (var83.field429[var85] == null) {
                            var84 = var85;
                            break;
                        }
                    }
                    field7914[field7905++] = var84;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field7905 -= 2;
                    int var86 = field7914[field7905];
                    int var87 = field7914[field7905 + 1];
                    class21 var88 = (class21) class113.field1442.method3678((long) var86, -121);
                    if (var88 != null && var88.field540 == var87) {
                        field7914[field7905++] = 1;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class17 var89 = class400.method2420((byte) -128, field7914[--field7905]);
                if (arg0 == 2800) {
                    field7914[field7905++] = client.method1659(var89).method997((byte) -128);
                    return;
                }
                if (arg0 == 2801) {
                    int var90 = field7914[--field7905];
                    int var357 = var90 - 1;
                    if (var89.field339 != null && var357 < var89.field339.length && var89.field339[var357] != null) {
                        field7913[field7908++] = var89.field339[var357];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var89.field438 == null) {
                        field7913[field7908++] = "";
                        return;
                    }
                    field7913[field7908++] = var89.field438;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var91 = field7913[--field7908];
                    class630.method3610(var91, 4);
                    return;
                }
                if (arg0 == 3101) {
                    field7905 -= 2;
                    class219.method1326(true, field7914[field7905], field7914[field7905 + 1], class206.field2472);
                    return;
                }
                if (arg0 == 3103) {
                    class191.method1178((byte) -64, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var92 = field7913[--field7908];
                    int var93 = 0;
                    if (class529.method3110((byte) -119, var92)) {
                        var93 = class79.method663(10, var92);
                    }
                    field7922++;
                    class543 var94 = class299.method1780(class84.field1196, class299.field4034, 71);
                    var94.field7872.method2233((byte) -115, var93);
                    class511.method3028(7482, var94);
                    return;
                }
                if (arg0 == 3105) {
                    String var95 = field7913[--field7908];
                    field7910++;
                    class543 var96 = class299.method1780(class84.field1196, class97.field1316, 85);
                    var96.field7872.method2281((byte) 58, var95.length() + 1);
                    var96.field7872.method2269(var95, -49);
                    class511.method3028(7482, var96);
                    return;
                }
                if (arg0 == 3106) {
                    String var97 = field7913[--field7908];
                    field7901++;
                    class543 var98 = class299.method1780(class84.field1196, class214.field2725, 99);
                    var98.field7872.method2281((byte) 58, var97.length() + 1);
                    var98.field7872.method2269(var97, -115);
                    class511.method3028(7482, var98);
                    return;
                }
                if (arg0 == 3107) {
                    int var99 = field7914[--field7905];
                    String var100 = field7913[--field7908];
                    class242.method1477(0, var100, var99);
                    return;
                }
                if (arg0 == 3108) {
                    field7905 -= 3;
                    int var101 = field7914[field7905];
                    int var102 = field7914[field7905 + 1];
                    int var103 = field7914[field7905 + 2];
                    class17 var104 = class400.method2420((byte) -95, var103);
                    class228.method1383(var102, var104, 23266, var101);
                    return;
                }
                if (arg0 == 3109) {
                    field7905 -= 2;
                    int var105 = field7914[field7905];
                    int var106 = field7914[field7905 + 1];
                    class17 var107 = arg1 ? field7917 : field7907;
                    class228.method1383(var106, var107, 23266, var105);
                    return;
                }
                if (arg0 == 3110) {
                    int var108 = field7914[--field7905];
                    field7920++;
                    class543 var109 = class299.method1780(class84.field1196, class36.field683, 36);
                    var109.field7872.method2261((byte) 76, var108);
                    class511.method3028(7482, var109);
                    return;
                }
                if (arg0 == 3111) {
                    field7905 -= 2;
                    int var110 = field7914[field7905];
                    int var111 = field7914[field7905 + 1];
                    class21 var112 = (class21) class113.field1442.method3678((long) var110, -120);
                    if (var112 != null) {
                        class658.method3727(true, 7070, var112.field540 != var111, var112);
                    }
                    class473.method2781(true, 3, var110, var111, -84);
                    return;
                }
                if (arg0 == 3112) {
                    field7905--;
                    int var113 = field7914[field7905];
                    class21 var114 = (class21) class113.field1442.method3678((long) var113, -127);
                    if (var114 != null && var114.field541 == 3) {
                        class658.method3727(true, 7070, true, var114);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class565.method3304((byte) 103, field7913[--field7908]);
                    return;
                }
                if (arg0 == 3114) {
                    field7905 -= 2;
                    int var115 = field7914[field7905];
                    int var116 = field7914[field7905 + 1];
                    String var117 = field7913[--field7908];
                    class301.method1786("", var117, "", "", -1, var115, var116);
                    return;
                }
                if (arg0 == 3115) {
                    field7905 -= 11;
                    class564[] var118 = class262.method1597((byte) 106);
                    class172[] var119 = class423.method2555((byte) 122);
                    class244.method1482(field7914[field7905 + 2], field7914[field7905 + 3], var118[field7914[field7905]], field7914[field7905 + 7], field7914[field7905 + 10], false, field7914[field7905 + 8], field7914[field7905 + 4], field7914[field7905 + 6], field7914[field7905 + 9], var119[field7914[field7905 + 1]], field7914[field7905 + 5]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field7905 -= 3;
                    class6.method38((byte) 88, field7914[field7905], 255, 256, field7914[field7905 + 2], field7914[field7905 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class231.method1398(50, 255, (byte) 124, field7914[--field7905]);
                    return;
                }
                if (arg0 == 3202) {
                    field7905 -= 2;
                    class34.method411(field7914[field7905 + 1], 255, (byte) -62, field7914[field7905]);
                    return;
                }
                if (arg0 == 3203) {
                    field7905 -= 4;
                    class6.method38((byte) 122, field7914[field7905], field7914[field7905 + 3], 256, field7914[field7905 + 2], field7914[field7905 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field7905 -= 3;
                    class231.method1398(field7914[field7905 + 2], field7914[field7905 + 1], (byte) -70, field7914[field7905]);
                    return;
                }
                if (arg0 == 3205) {
                    field7905 -= 3;
                    class34.method411(field7914[field7905 + 1], field7914[field7905 + 2], (byte) -62, field7914[field7905]);
                    return;
                }
                if (arg0 == 3206) {
                    field7905 -= 4;
                    class188.method1164(field7914[field7905 + 3], field7914[field7905 + 2], field7914[field7905], -1, false, 256, field7914[field7905 + 1]);
                    return;
                }
                if (arg0 == 3207) {
                    field7905 -= 4;
                    class188.method1164(field7914[field7905 + 3], field7914[field7905 + 2], field7914[field7905], -1, true, 256, field7914[field7905 + 1]);
                    return;
                }
                if (arg0 == 3208) {
                    field7905 -= 5;
                    class6.method38((byte) 113, field7914[field7905], field7914[field7905 + 3], field7914[field7905 + 4], field7914[field7905 + 2], field7914[field7905 + 1]);
                    return;
                }
                if (arg0 == 3209) {
                    field7905 -= 5;
                    class188.method1164(field7914[field7905 + 3], field7914[field7905 + 2], field7914[field7905], -1, false, field7914[field7905 + 4], field7914[field7905 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7914[field7905++] = class543.field7882;
                    return;
                }
                if (arg0 == 3301) {
                    field7905 -= 2;
                    int var120 = field7914[field7905];
                    int var121 = field7914[field7905 + 1];
                    field7914[field7905++] = class249.method1528((byte) -114, var120, var121, false);
                    return;
                }
                if (arg0 == 3302) {
                    field7905 -= 2;
                    int var122 = field7914[field7905];
                    int var123 = field7914[field7905 + 1];
                    field7914[field7905++] = class71.method631(0, var123, var122, false);
                    return;
                }
                if (arg0 == 3303) {
                    field7905 -= 2;
                    int var124 = field7914[field7905];
                    int var125 = field7914[field7905 + 1];
                    field7914[field7905++] = class156.method988((byte) 12, var124, var125, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var126 = field7914[--field7905];
                    field7914[field7905++] = class355.field4741.method3457(-93, var126).field4129;
                    return;
                }
                if (arg0 == 3305) {
                    int var127 = field7914[--field7905];
                    field7914[field7905++] = class354.field4730[var127];
                    return;
                }
                if (arg0 == 3306) {
                    int var128 = field7914[--field7905];
                    field7914[field7905++] = class422.field6001[var128];
                    return;
                }
                if (arg0 == 3307) {
                    int var129 = field7914[--field7905];
                    field7914[field7905++] = class232.field3112[var129];
                    return;
                }
                if (arg0 == 3308) {
                    byte var130 = class206.field2472.field532;
                    int var131 = (class206.field2472.field530 >> 9) + class36.field689;
                    int var132 = (class206.field2472.field531 >> 9) + class88.field1239;
                    field7914[field7905++] = (var130 << 28) + (var131 << 14) + var132;
                    return;
                }
                if (arg0 == 3309) {
                    int var133 = field7914[--field7905];
                    field7914[field7905++] = var133 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var134 = field7914[--field7905];
                    field7914[field7905++] = var134 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var135 = field7914[--field7905];
                    field7914[field7905++] = var135 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7914[field7905++] = class646.field9195 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field7905 -= 2;
                    int var136 = field7914[field7905];
                    int var137 = field7914[field7905 + 1];
                    field7914[field7905++] = class249.method1528((byte) -114, var136, var137, true);
                    return;
                }
                if (arg0 == 3314) {
                    field7905 -= 2;
                    int var138 = field7914[field7905];
                    int var139 = field7914[field7905 + 1];
                    field7914[field7905++] = class71.method631(0, var139, var138, true);
                    return;
                }
                if (arg0 == 3315) {
                    field7905 -= 2;
                    int var140 = field7914[field7905];
                    int var141 = field7914[field7905 + 1];
                    field7914[field7905++] = class156.method988((byte) 12, var140, var141, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class37.field698 >= 2) {
                        field7914[field7905++] = class37.field698;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7914[field7905++] = class242.field3323;
                    return;
                }
                if (arg0 == 3318) {
                    field7914[field7905++] = class281.field3813.field4476;
                    return;
                }
                if (arg0 == 3321) {
                    field7914[field7905++] = class512.field7510;
                    return;
                }
                if (arg0 == 3322) {
                    field7914[field7905++] = class33.field667;
                    return;
                }
                if (arg0 == 3323) {
                    if (class460.field6459 >= 5 && class460.field6459 <= 9) {
                        field7914[field7905++] = 1;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class460.field6459 >= 5 && class460.field6459 <= 9) {
                        field7914[field7905++] = class460.field6459;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7914[field7905++] = class626.field8987 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7914[field7905++] = class206.field2472.field8802;
                    return;
                }
                if (arg0 == 3327) {
                    field7914[field7905++] = class206.field2472.field8824.field8330 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7914[field7905++] = class689.field9822 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var142 = field7914[--field7905];
                    field7914[field7905++] = class90.method704(false, (byte) -123, var142);
                    return;
                }
                if (arg0 == 3331) {
                    field7905 -= 2;
                    int var143 = field7914[field7905];
                    int var144 = field7914[field7905 + 1];
                    field7914[field7905++] = class298.method1771(var143, false, 16400, var144, false);
                    return;
                }
                if (arg0 == 3332) {
                    field7905 -= 2;
                    int var145 = field7914[field7905];
                    int var146 = field7914[field7905 + 1];
                    field7914[field7905++] = class298.method1771(var145, true, 16400, var146, false);
                    return;
                }
                if (arg0 == 3333) {
                    field7914[field7905++] = class168.field2054;
                    return;
                }
                if (arg0 == 3335) {
                    field7914[field7905++] = class370.field4980;
                    return;
                }
                if (arg0 == 3336) {
                    field7905 -= 4;
                    int var147 = field7914[field7905];
                    int var148 = field7914[field7905 + 1];
                    int var149 = field7914[field7905 + 2];
                    int var150 = field7914[field7905 + 3];
                    int var151 = (var148 << 14) + var147;
                    int var152 = (var149 << 28) + var151;
                    int var153 = var150 + var152;
                    field7914[field7905++] = var153;
                    return;
                }
                if (arg0 == 3337) {
                    field7914[field7905++] = class171.field2092;
                    return;
                }
                if (arg0 == 3338) {
                    field7914[field7905++] = class200.method1217(45);
                    return;
                }
                if (arg0 == 3339) {
                    field7914[field7905++] = class84.field1193 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field7914[field7905++] = class190.field2319 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field7914[field7905++] = class586.field8503 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field7914[field7905++] = class478.field6713.method1349(34);
                    return;
                }
                if (arg0 == 3343) {
                    field7914[field7905++] = class478.field6713.method1338(1);
                    return;
                }
                if (arg0 == 3344) {
                    field7913[field7908++] = class16.method186(-14084);
                    return;
                }
                if (arg0 == 3345) {
                    field7913[field7908++] = class315.method1843(0);
                    return;
                }
                if (arg0 == 3346) {
                    field7914[field7905++] = class21.method343(true);
                    return;
                }
                if (arg0 == 3347) {
                    field7914[field7905++] = class273.field3728;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field7905 -= 2;
                    int var154 = field7914[field7905];
                    int var155 = field7914[field7905 + 1];
                    class40 var156 = class502.field7010.method1921(2, var154);
                    field7913[field7908++] = var156.method454(0, var155);
                    return;
                }
                if (arg0 == 3408) {
                    field7905 -= 4;
                    int var157 = field7914[field7905];
                    int var158 = field7914[field7905 + 1];
                    int var159 = field7914[field7905 + 2];
                    int var160 = field7914[field7905 + 3];
                    class40 var161 = class502.field7010.method1921(2, var159);
                    if (var161.field749 == var157 && var161.field751 == var158) {
                        if (var158 == 115) {
                            field7913[field7908++] = var161.method454(0, var160);
                            return;
                        }
                        field7914[field7905++] = var161.method455(var160, -55);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field7905 -= 3;
                    int var162 = field7914[field7905];
                    int var163 = field7914[field7905 + 1];
                    int var164 = field7914[field7905 + 2];
                    if (var163 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class40 var165 = class502.field7010.method1921(2, var163);
                    if (var165.field751 != var162) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7914[field7905++] = var165.method450(var164, (byte) 117) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var166 = field7914[--field7905];
                    String var167 = field7913[--field7908];
                    if (var166 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class40 var168 = class502.field7010.method1921(2, var166);
                    if (var168.field751 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7914[field7905++] = var168.method460(2, var167) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var169 = field7914[--field7905];
                    class40 var170 = class502.field7010.method1921(2, var169);
                    field7914[field7905++] = var170.field738.method3673(17467);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class417.field5915 == 0) {
                        field7914[field7905++] = -2;
                        return;
                    }
                    if (class417.field5915 == 1) {
                        field7914[field7905++] = -1;
                        return;
                    }
                    field7914[field7905++] = class700.field9897;
                    return;
                }
                if (arg0 == 3601) {
                    int var171 = field7914[--field7905];
                    if (class417.field5915 == 2 && var171 < class700.field9897) {
                        field7913[field7908++] = class529.field7730[var171];
                        if (class173.field2125[var171] != null) {
                            field7913[field7908++] = class173.field2125[var171];
                            return;
                        }
                        field7913[field7908++] = "";
                        return;
                    }
                    field7913[field7908++] = "";
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var172 = field7914[--field7905];
                    if (class417.field5915 == 2 && var172 < class700.field9897) {
                        field7914[field7905++] = class318.field4208[var172];
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var173 = field7914[--field7905];
                    if (class417.field5915 == 2 && var173 < class700.field9897) {
                        field7914[field7905++] = class290.field3941[var173];
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var174 = field7913[--field7908];
                    int var175 = field7914[--field7905];
                    class311.method1826(var175, true, var174);
                    return;
                }
                if (arg0 == 3605) {
                    String var176 = field7913[--field7908];
                    class510.method3025(var176, 1);
                    return;
                }
                if (arg0 == 3606) {
                    String var177 = field7913[--field7908];
                    class635.method3629(1, var177);
                    return;
                }
                if (arg0 == 3607) {
                    String var178 = field7913[--field7908];
                    class288.method1714((byte) -29, var178, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var179 = field7913[--field7908];
                    class355.method2006(14467, var179);
                    return;
                }
                if (arg0 == 3609) {
                    String var180 = field7913[--field7908];
                    if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                        var180 = var180.substring(7);
                    }
                    field7914[field7905++] = class178.method1113((byte) -82, var180) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var181 = field7914[--field7905];
                    if (class417.field5915 == 2 && var181 < class700.field9897) {
                        field7913[field7908++] = class310.field4102[var181];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class496.field6913 != null) {
                        field7913[field7908++] = class202.method1232(false, class496.field6913);
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class496.field6913 != null) {
                        field7914[field7905++] = class246.field3378;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var182 = field7914[--field7905];
                    if (class496.field6913 != null && var182 < class246.field3378) {
                        field7913[field7908++] = class642.field9171[var182].field1072;
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var183 = field7914[--field7905];
                    if (class496.field6913 != null && var183 < class246.field3378) {
                        field7914[field7905++] = class642.field9171[var183].field1070;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var184 = field7914[--field7905];
                    if (class496.field6913 != null && var184 < class246.field3378) {
                        field7914[field7905++] = class642.field9171[var184].field1073;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7914[field7905++] = class96.field1305;
                    return;
                }
                if (arg0 == 3617) {
                    String var185 = field7913[--field7908];
                    class83.method675(var185, (byte) -125);
                    return;
                }
                if (arg0 == 3618) {
                    field7914[field7905++] = class222.field2888;
                    return;
                }
                if (arg0 == 3619) {
                    String var186 = field7913[--field7908];
                    class142.method931(var186, 41);
                    return;
                }
                if (arg0 == 3620) {
                    class105.method771((byte) -81);
                    return;
                }
                if (arg0 == 3621) {
                    if (class417.field5915 == 0) {
                        field7914[field7905++] = -1;
                        return;
                    }
                    field7914[field7905++] = class230.field3000;
                    return;
                }
                if (arg0 == 3622) {
                    int var187 = field7914[--field7905];
                    if (class417.field5915 != 0 && var187 < class230.field3000) {
                        field7913[field7908++] = class100.field1340[var187];
                        if (class405.field5735[var187] != null) {
                            field7913[field7908++] = class405.field5735[var187];
                            return;
                        }
                        field7913[field7908++] = "";
                        return;
                    }
                    field7913[field7908++] = "";
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var188 = field7913[--field7908];
                    if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                        var188 = var188.substring(7);
                    }
                    field7914[field7905++] = class573.method3360(-76, var188) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var189 = field7914[--field7905];
                    if (class642.field9171 != null && var189 < class246.field3378 && class642.field9171[var189].field1065.equalsIgnoreCase(class206.field2472.field8801)) {
                        field7914[field7905++] = 1;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class234.field3125 != null) {
                        field7913[field7908++] = class234.field3125;
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var190 = field7914[--field7905];
                    if (class496.field6913 != null && var190 < class246.field3378) {
                        field7913[field7908++] = class642.field9171[var190].field1074;
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var191 = field7914[--field7905];
                    if (class417.field5915 == 2 && var191 >= 0 && var191 < class700.field9897) {
                        field7914[field7905++] = class574.field8410[var191] ? 1 : 0;
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var192 = field7913[--field7908];
                    if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                        var192 = var192.substring(7);
                    }
                    field7914[field7905++] = class53.method559(false, var192);
                    return;
                }
                if (arg0 == 3629) {
                    field7914[field7905++] = class353.field4723;
                    return;
                }
                if (arg0 == 3630) {
                    String var193 = field7913[--field7908];
                    class288.method1714((byte) -29, var193, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var194 = field7914[--field7905];
                    field7914[field7905++] = class570.field8337[var194] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var195 = field7914[--field7905];
                    if (class496.field6913 != null && var195 < class246.field3378) {
                        field7913[field7908++] = class642.field9171[var195].field1065;
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var196 = field7914[--field7905];
                    if (class417.field5915 != 0 && var196 < class230.field3000) {
                        field7913[field7908++] = class208.field2541[var196];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var197 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var197].method2595(32238);
                    return;
                }
                if (arg0 == 3904) {
                    int var198 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var198].field6194;
                    return;
                }
                if (arg0 == 3905) {
                    int var199 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var199].field6199;
                    return;
                }
                if (arg0 == 3906) {
                    int var200 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var200].field6193;
                    return;
                }
                if (arg0 == 3907) {
                    int var201 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var201].field6192;
                    return;
                }
                if (arg0 == 3908) {
                    int var202 = field7914[--field7905];
                    field7914[field7905++] = class159.field1942[var202].field6190;
                    return;
                }
                if (arg0 == 3910) {
                    int var203 = field7914[--field7905];
                    int var204 = class159.field1942[var203].method2594(0);
                    field7914[field7905++] = var204 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var205 = field7914[--field7905];
                    int var206 = class159.field1942[var205].method2594(0);
                    field7914[field7905++] = var206 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var207 = field7914[--field7905];
                    int var208 = class159.field1942[var207].method2594(0);
                    field7914[field7905++] = var208 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var209 = field7914[--field7905];
                    int var210 = class159.field1942[var209].method2594(0);
                    field7914[field7905++] = var210 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field7905 -= 2;
                    int var211 = field7914[field7905];
                    int var212 = field7914[field7905 + 1];
                    field7914[field7905++] = var211 + var212;
                    return;
                }
                if (arg0 == 4001) {
                    field7905 -= 2;
                    int var213 = field7914[field7905];
                    int var214 = field7914[field7905 + 1];
                    field7914[field7905++] = var213 - var214;
                    return;
                }
                if (arg0 == 4002) {
                    field7905 -= 2;
                    int var215 = field7914[field7905];
                    int var216 = field7914[field7905 + 1];
                    field7914[field7905++] = var215 * var216;
                    return;
                }
                if (arg0 == 4003) {
                    field7905 -= 2;
                    int var217 = field7914[field7905];
                    int var218 = field7914[field7905 + 1];
                    field7914[field7905++] = var217 / var218;
                    return;
                }
                if (arg0 == 4004) {
                    int var219 = field7914[--field7905];
                    field7914[field7905++] = (int) (Math.random() * (double) var219);
                    return;
                }
                if (arg0 == 4005) {
                    int var220 = field7914[--field7905];
                    field7914[field7905++] = (int) (Math.random() * (double) (var220 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field7905 -= 5;
                    int var221 = field7914[field7905];
                    int var222 = field7914[field7905 + 1];
                    int var223 = field7914[field7905 + 2];
                    int var224 = field7914[field7905 + 3];
                    int var225 = field7914[field7905 + 4];
                    field7914[field7905++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                    return;
                }
                if (arg0 == 4007) {
                    field7905 -= 2;
                    long var226 = (long) field7914[field7905];
                    long var228 = (long) field7914[field7905 + 1];
                    field7914[field7905++] = (int) (var226 * var228 / 100L + var226);
                    return;
                }
                if (arg0 == 4008) {
                    field7905 -= 2;
                    int var230 = field7914[field7905];
                    int var231 = field7914[field7905 + 1];
                    field7914[field7905++] = var230 | 0x1 << var231;
                    return;
                }
                if (arg0 == 4009) {
                    field7905 -= 2;
                    int var232 = field7914[field7905];
                    int var233 = field7914[field7905 + 1];
                    field7914[field7905++] = var232 & -(0x1 << var233) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field7905 -= 2;
                    int var234 = field7914[field7905];
                    int var235 = field7914[field7905 + 1];
                    field7914[field7905++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field7905 -= 2;
                    int var236 = field7914[field7905];
                    int var237 = field7914[field7905 + 1];
                    field7914[field7905++] = var236 % var237;
                    return;
                }
                if (arg0 == 4012) {
                    field7905 -= 2;
                    int var238 = field7914[field7905];
                    int var239 = field7914[field7905 + 1];
                    if (var238 == 0) {
                        field7914[field7905++] = 0;
                        return;
                    }
                    field7914[field7905++] = (int) Math.pow((double) var238, (double) var239);
                    return;
                }
                if (arg0 == 4013) {
                    field7905 -= 2;
                    int var240 = field7914[field7905];
                    int var241 = field7914[field7905 + 1];
                    if (var240 == 0) {
                        field7914[field7905++] = 0;
                        return;
                    }
                    if (var241 == 0) {
                        field7914[field7905++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7914[field7905++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                    return;
                }
                if (arg0 == 4014) {
                    field7905 -= 2;
                    int var242 = field7914[field7905];
                    int var243 = field7914[field7905 + 1];
                    field7914[field7905++] = var242 & var243;
                    return;
                }
                if (arg0 == 4015) {
                    field7905 -= 2;
                    int var244 = field7914[field7905];
                    int var245 = field7914[field7905 + 1];
                    field7914[field7905++] = var244 | var245;
                    return;
                }
                if (arg0 == 4016) {
                    field7905 -= 2;
                    int var246 = field7914[field7905];
                    int var247 = field7914[field7905 + 1];
                    field7914[field7905++] = var246 < var247 ? var246 : var247;
                    return;
                }
                if (arg0 == 4017) {
                    field7905 -= 2;
                    int var248 = field7914[field7905];
                    int var249 = field7914[field7905 + 1];
                    field7914[field7905++] = var248 > var249 ? var248 : var249;
                    return;
                }
                if (arg0 == 4018) {
                    field7905 -= 3;
                    long var250 = (long) field7914[field7905];
                    long var252 = (long) field7914[field7905 + 1];
                    long var254 = (long) field7914[field7905 + 2];
                    field7914[field7905++] = (int) (var250 * var254 / var252);
                    return;
                }
                if (arg0 == 4019) {
                    field7905 -= 2;
                    int var256 = field7914[field7905];
                    int var257 = field7914[field7905 + 1];
                    if (var256 > 700 || var257 > 700) {
                        field7914[field7905++] = 256;
                    }
                    double var258 = (Math.random() * (double) (var256 + var257) + 800.0D - (double) var256) / 100.0D;
                    field7914[field7905++] = (int) (Math.pow(2.0D, var258) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var260 = field7913[--field7908];
                    int var261 = field7914[--field7905];
                    field7913[field7908++] = var260 + var261;
                    return;
                }
                if (arg0 == 4101) {
                    field7908 -= 2;
                    String var262 = field7913[field7908];
                    String var263 = field7913[field7908 + 1];
                    field7913[field7908++] = var262 + var263;
                    return;
                }
                if (arg0 == 4102) {
                    String var264 = field7913[--field7908];
                    int var265 = field7914[--field7905];
                    field7913[field7908++] = var264 + class582.method3390(true, var265, 0);
                    return;
                }
                if (arg0 == 4103) {
                    String var266 = field7913[--field7908];
                    field7913[field7908++] = var266.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7913[field7908++] = method3193(field7914[--field7905]);
                    return;
                }
                if (arg0 == 4105) {
                    field7908 -= 2;
                    String var267 = field7913[field7908];
                    String var268 = field7913[field7908 + 1];
                    if (class206.field2472.field8824 != null && class206.field2472.field8824.field8330) {
                        field7913[field7908++] = var268;
                        return;
                    }
                    field7913[field7908++] = var267;
                    return;
                }
                if (arg0 == 4106) {
                    int var269 = field7914[--field7905];
                    field7913[field7908++] = Integer.toString(var269);
                    return;
                }
                if (arg0 == 4107) {
                    field7908 -= 2;
                    field7914[field7905++] = class657.method3718(-29726, field7913[field7908], class370.field4980, field7913[field7908 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var270 = field7913[--field7908];
                    field7905 -= 2;
                    int var271 = field7914[field7905];
                    int var272 = field7914[field7905 + 1];
                    class50 var273 = class419.method2530(class420.field5953, var272, 0, -70);
                    field7914[field7905++] = var273.method554(var270, 6114, var271, class156.field1902);
                    return;
                }
                if (arg0 == 4109) {
                    String var274 = field7913[--field7908];
                    field7905 -= 2;
                    int var275 = field7914[field7905];
                    int var276 = field7914[field7905 + 1];
                    class50 var277 = class419.method2530(class420.field5953, var276, 0, -47);
                    field7914[field7905++] = var277.method551(var275, class156.field1902, var274, true);
                    return;
                }
                if (arg0 == 4110) {
                    field7908 -= 2;
                    String var278 = field7913[field7908];
                    String var279 = field7913[field7908 + 1];
                    if (field7914[--field7905] == 1) {
                        field7913[field7908++] = var278;
                        return;
                    }
                    field7913[field7908++] = var279;
                    return;
                }
                if (arg0 == 4111) {
                    String var280 = field7913[--field7908];
                    field7913[field7908++] = class42.method462(var280, 1);
                    return;
                }
                if (arg0 == 4112) {
                    String var281 = field7913[--field7908];
                    int var282 = field7914[--field7905];
                    if (var282 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7913[field7908++] = var281 + (char) var282;
                    return;
                }
                if (arg0 == 4113) {
                    int var283 = field7914[--field7905];
                    field7914[field7905++] = class703.method3941((char) var283, -18479) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var284 = field7914[--field7905];
                    field7914[field7905++] = class236.method1432((char) var284, 48) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var285 = field7914[--field7905];
                    field7914[field7905++] = class245.method1492((byte) 49, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var286 = field7914[--field7905];
                    field7914[field7905++] = class575.method3366((char) var286, (byte) -82) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var287 = field7913[--field7908];
                    if (var287 != null) {
                        field7914[field7905++] = var287.length();
                        return;
                    }
                    field7914[field7905++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var288 = field7913[--field7908];
                    field7905 -= 2;
                    int var289 = field7914[field7905];
                    int var290 = field7914[field7905 + 1];
                    field7913[field7908++] = var288.substring(var289, var290);
                    return;
                }
                if (arg0 == 4119) {
                    String var291 = field7913[--field7908];
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
                    field7913[field7908++] = var292.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var296 = field7913[--field7908];
                    field7905 -= 2;
                    int var297 = field7914[field7905];
                    int var298 = field7914[field7905 + 1];
                    field7914[field7905++] = var296.indexOf(var297, var298);
                    return;
                }
                if (arg0 == 4121) {
                    field7908 -= 2;
                    String var299 = field7913[field7908];
                    String var300 = field7913[field7908 + 1];
                    int var301 = field7914[--field7905];
                    field7914[field7905++] = var299.indexOf(var300, var301);
                    return;
                }
                if (arg0 == 4122) {
                    int var302 = field7914[--field7905];
                    field7914[field7905++] = Character.toLowerCase((char) var302);
                    return;
                }
                if (arg0 == 4123) {
                    int var303 = field7914[--field7905];
                    field7914[field7905++] = Character.toUpperCase((char) var303);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var304 = field7914[--field7905] != 0;
                    int var305 = field7914[--field7905];
                    field7913[field7908++] = class321.method1866(-28555, var304, 0, (long) var305, class370.field4980);
                    return;
                }
                if (arg0 == 4125) {
                    String var306 = field7913[--field7908];
                    int var307 = field7914[--field7905];
                    class50 var308 = class419.method2530(class420.field5953, var307, 0, -11);
                    field7914[field7905++] = var308.method552(var306, -1, class156.field1902);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var309 = field7914[--field7905];
                    field7913[field7908++] = class65.field1021.method178(false, var309).field3261;
                    return;
                }
                if (arg0 == 4201) {
                    field7905 -= 2;
                    int var310 = field7914[field7905];
                    int var311 = field7914[field7905 + 1];
                    class238 var312 = class65.field1021.method178(false, var310);
                    if (var311 >= 1 && var311 <= 5 && var312.field3208[var311 - 1] != null) {
                        field7913[field7908++] = var312.field3208[var311 - 1];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field7905 -= 2;
                    int var313 = field7914[field7905];
                    int var314 = field7914[field7905 + 1];
                    class238 var315 = class65.field1021.method178(false, var313);
                    if (var314 >= 1 && var314 <= 5 && var315.field3205[var314 - 1] != null) {
                        field7913[field7908++] = var315.field3205[var314 - 1];
                        return;
                    }
                    field7913[field7908++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var316 = field7914[--field7905];
                    field7914[field7905++] = class65.field1021.method178(false, var316).field3228;
                    return;
                }
                if (arg0 == 4204) {
                    int var317 = field7914[--field7905];
                    field7914[field7905++] = class65.field1021.method178(false, var317).field3268 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var318 = field7914[--field7905];
                    class238 var319 = class65.field1021.method178(false, var318);
                    if (var319.field3203 == -1 && var319.field3238 >= 0) {
                        field7914[field7905++] = var319.field3238;
                        return;
                    }
                    field7914[field7905++] = var318;
                    return;
                }
                if (arg0 == 4206) {
                    int var320 = field7914[--field7905];
                    class238 var321 = class65.field1021.method178(false, var320);
                    if (var321.field3203 >= 0 && var321.field3238 >= 0) {
                        field7914[field7905++] = var321.field3238;
                        return;
                    }
                    field7914[field7905++] = var320;
                    return;
                }
                if (arg0 == 4207) {
                    int var322 = field7914[--field7905];
                    field7914[field7905++] = class65.field1021.method178(false, var322).field3193 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field7905 -= 2;
                    int var323 = field7914[field7905];
                    int var324 = field7914[field7905 + 1];
                    class184 var325 = class582.field8483.method2536((byte) -120, var324);
                    if (var325.method1144(-5)) {
                        field7913[field7908++] = class65.field1021.method178(false, var323).method1458((byte) -80, var324, var325.field2249);
                        return;
                    }
                    field7914[field7905++] = class65.field1021.method178(false, var323).method1459(var325.field2253, -7356, var324);
                    return;
                }
                if (arg0 == 4209) {
                    field7905 -= 2;
                    int var326 = field7914[field7905];
                    int var327 = field7914[field7905 + 1] - 1;
                    class238 var328 = class65.field1021.method178(false, var326);
                    if (var328.field3214 == var327) {
                        field7914[field7905++] = var328.field3198;
                        return;
                    }
                    if (var328.field3254 == var327) {
                        field7914[field7905++] = var328.field3242;
                        return;
                    }
                    field7914[field7905++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var329 = field7913[--field7908];
                    int var330 = field7914[--field7905];
                    class394.method2384(var329, false, var330 == 1);
                    field7914[field7905++] = class596.field8615;
                    return;
                }
                if (arg0 == 4211) {
                    if (class70.field1071 != null && class285.field3862 < class596.field8615) {
                        field7914[field7905++] = class70.field1071[class285.field3862++] & 0xFFFF;
                        return;
                    }
                    field7914[field7905++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class285.field3862 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var331 = field7914[--field7905];
                    field7914[field7905++] = class65.field1021.method178(false, var331).field3230;
                    return;
                }
                if (arg0 == 4214) {
                    String var332 = field7913[--field7908];
                    field7905 -= 3;
                    int var333 = field7914[field7905];
                    int var334 = field7914[field7905 + 1];
                    int var335 = field7914[field7905 + 2];
                    class496.method2889(var334, var335, var333 == 1, var332, -78);
                    field7914[field7905++] = class596.field8615;
                    return;
                }
                if (arg0 == 4215) {
                    field7908 -= 2;
                    field7905 -= 2;
                    String var336 = field7913[field7908];
                    int var337 = field7914[field7905];
                    int var338 = field7914[field7905 + 1];
                    String var339 = field7913[field7908 + 1];
                    class256.method1561(var337 == 1, var338, var339, var336, (byte) -127);
                    field7914[field7905++] = class596.field8615;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field7905 -= 2;
                    int var340 = field7914[field7905];
                    int var341 = field7914[field7905 + 1];
                    class184 var342 = class582.field8483.method2536((byte) -121, var341);
                    if (var342.method1144(-5)) {
                        field7913[field7908++] = class206.field2477.method1949(27, var340).method1886((byte) 102, var341, var342.field2249);
                        return;
                    }
                    field7914[field7905++] = class206.field2477.method1949(23, var340).method1877(var341, var342.field2253, -1);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field7905 -= 2;
                    int var343 = field7914[field7905];
                    int var344 = field7914[field7905 + 1];
                    class184 var345 = class582.field8483.method2536((byte) -125, var344);
                    if (var345.method1144(-5)) {
                        field7913[field7908++] = class37.field703.method807(0, var343).method1414(false, var345.field2249, var344);
                        return;
                    }
                    field7914[field7905++] = class37.field703.method807(0, var343).method1406((byte) 64, var345.field2253, var344);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field7905 -= 2;
                    int var346 = field7914[field7905];
                    int var347 = field7914[field7905 + 1];
                    class184 var348 = class582.field8483.method2536((byte) -119, var347);
                    if (var348.method1144(-5)) {
                        field7913[field7908++] = class468.field6543.method1822(var346, true).method409(var347, 79, var348.field2249);
                        return;
                    }
                    field7914[field7905++] = class468.field6543.method1822(var346, true).method406(var348.field2253, (byte) 100, var347);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var349 = field7914[--field7905];
                class573 var350 = class332.field4418.method727(var349, 64);
                if (var350.field8378 != null && var350.field8378.length > 0) {
                    int var351 = 0;
                    int var352 = var350.field8375[0];
                    for (int var353 = 1; var353 < var350.field8378.length; var353++) {
                        if (var350.field8375[var353] > var352) {
                            var351 = var353;
                            var352 = var350.field8375[var353];
                        }
                    }
                    field7914[field7905++] = var350.field8378[var351];
                    return;
                }
                field7914[field7905++] = var350.field8359;
                return;
            }
        } else {
            class17 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class400.method2420((byte) -124, field7914[--field7905]);
            } else {
                var50 = arg1 ? field7917 : field7907;
            }
            if (arg0 == 1300) {
                int var51 = field7914[--field7905] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method198(var51, (byte) 98, field7913[--field7908]);
                    return;
                }
                field7908--;
                return;
            }
            if (arg0 == 1301) {
                field7905 -= 2;
                int var52 = field7914[field7905];
                int var53 = field7914[field7905 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field384 = null;
                    return;
                }
                var50.field384 = class346.method1981(var52, var53, (byte) -123);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field7914[--field7905];
                if (class28.field616 != var54 && class222.field2890 != var54 && class418.field5925 != var54) {
                    return;
                }
                var50.field488 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field449 = field7914[--field7905];
                return;
            }
            if (arg0 == 1304) {
                var50.field404 = field7914[--field7905];
                return;
            }
            if (arg0 == 1305) {
                var50.field438 = field7913[--field7908];
                return;
            }
            if (arg0 == 1306) {
                var50.field477 = field7913[--field7908];
                return;
            }
            if (arg0 == 1307) {
                var50.field339 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field463 = field7914[--field7905];
                var50.field376 = field7914[--field7905];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field7914[--field7905];
                int var56 = field7914[--field7905];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method200(var55, 16531, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field360 = field7913[--field7908];
                return;
            }
            if (arg0 == 1311) {
                var50.field456 = field7914[--field7905];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field7905 -= 3;
                    var57 = field7914[field7905] - 1;
                    var58 = field7914[field7905 + 1];
                    var59 = field7914[field7905 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7905 -= 2;
                    var57 = 10;
                    var58 = field7914[field7905];
                    var59 = field7914[field7905 + 1];
                }
                if (var50.field347 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field347 = new byte[11];
                    var50.field426 = new byte[11];
                    var50.field393 = new int[11];
                }
                var50.field347[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field328 = false;
                    for (int var60 = 0; var60 < var50.field347.length; var60++) {
                        if (var50.field347[var60] != 0) {
                            var50.field328 = true;
                            break;
                        }
                    }
                } else {
                    var50.field328 = true;
                }
                var50.field426[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field430 = field7914[--field7905];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    private static final void method3197(int arg0) {
        class17 var1 = class400.method2420((byte) -100, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class17[] var3 = class362.field4821[var2];
        if (var3 == null) {
            class17[] var4 = class516.field7555[var2];
            int var5 = var4.length;
            var3 = class362.field4821[var2] = new class17[var5];
            class252.method1540(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class252.method1540(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
    public static final void method3198(int arg0) {
        if (arg0 == -1 || !class62.method607((byte) -106, arg0)) {
            return;
        }
        class17[] var1 = class516.field7555[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class17 var3 = var1[var2];
            if (var3.field366 != null) {
                class143 var4 = new class143();
                var4.field1789 = var3;
                var4.field1786 = var3.field366;
                method3203(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lht;I)V")
    private static final void method3199(class537 arg0, int arg1) {
        field7905 = 0;
        field7908 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7814;
        int[] var4 = arg0.field7825;
        byte var5 = -1;
        field7902 = 0;
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
                        method3196(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3192(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7914[field7905++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7914[field7905++] = class410.field5804.field7894[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class410.field5804.method3188(field7914[--field7905], -1, var8);
                } else if (var43 == 3) {
                    field7913[field7908++] = arg0.field7815[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7905 -= 2;
                    if (field7914[field7905 + 1] != field7914[field7905]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7905 -= 2;
                    if (field7914[field7905 + 1] == field7914[field7905]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7905 -= 2;
                    if (field7914[field7905] < field7914[field7905 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7905 -= 2;
                    if (field7914[field7905] > field7914[field7905 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7902 == 0) {
                        return;
                    }
                    class67 var9 = field7918[--field7902];
                    arg0 = var9.field1037;
                    var3 = arg0.field7814;
                    var4 = arg0.field7825;
                    var2 = var9.field1032;
                    field7899 = var9.field1031;
                    field7915 = var9.field1033;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7914[field7905++] = class410.field5804.method732(121, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class410.field5804.method3183(true, field7914[--field7905], var11);
                } else if (var43 == 31) {
                    field7905 -= 2;
                    if (field7914[field7905] <= field7914[field7905 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7905 -= 2;
                    if (field7914[field7905] >= field7914[field7905 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7914[field7905++] = field7899[var4[var2]];
                } else if (var43 == 34) {
                    field7899[var4[var2]] = field7914[--field7905];
                } else if (var43 == 35) {
                    field7913[field7908++] = field7915[var4[var2]];
                } else if (var43 == 36) {
                    field7915[var4[var2]] = field7913[--field7908];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7908 -= var12;
                    String var13 = class596.method3450(0, field7908, var12, field7913);
                    field7913[field7908++] = var13;
                } else if (var43 == 38) {
                    field7905--;
                } else if (var43 == 39) {
                    field7908--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class537 var15 = class353.method1997(var14, 1756);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7823];
                    String[] var17 = new String[var15.field7817];
                    for (int var18 = 0; var18 < var15.field7821; var18++) {
                        var16[var18] = field7914[field7905 + var18 - var15.field7821];
                    }
                    for (int var19 = 0; var19 < var15.field7822; var19++) {
                        var17[var19] = field7913[field7908 + var19 - var15.field7822];
                    }
                    field7905 -= var15.field7821;
                    field7908 -= var15.field7822;
                    class67 var20 = new class67();
                    var20.field1037 = arg0;
                    var20.field1032 = var2;
                    var20.field1031 = field7899;
                    var20.field1033 = field7915;
                    if (field7902 >= field7918.length) {
                        throw new RuntimeException();
                    }
                    field7918[field7902++] = var20;
                    arg0 = var15;
                    var3 = var15.field7814;
                    var4 = var15.field7825;
                    var2 = -1;
                    field7899 = var16;
                    field7915 = var17;
                } else if (var43 == 42) {
                    field7914[field7905++] = class415.field5874[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class415.field5874[var21] = field7914[--field7905];
                    class588.method3408(var21, (byte) -118);
                    class62.field999 |= class25.field591[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7914[--field7905];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7904[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7909[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7914[--field7905];
                    if (var28 < 0 || var28 >= field7904[var27]) {
                        throw new RuntimeException();
                    }
                    field7914[field7905++] = field7909[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7905 -= 2;
                    int var30 = field7914[field7905];
                    if (var30 < 0 || var30 >= field7904[var29]) {
                        throw new RuntimeException();
                    }
                    field7909[var29][var30] = field7914[field7905 + 1];
                } else if (var43 == 47) {
                    String var31 = class279.field3799[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7913[field7908++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class279.field3799[var32] = field7913[--field7908];
                    class196.method1197(2, var32);
                } else if (var43 == 51) {
                    class652 var33 = arg0.field7820[var4[var2]];
                    class556 var34 = (class556) var33.method3678((long) field7914[--field7905], -128);
                    if (var34 != null) {
                        var2 += var34.field8043;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7819 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7519).append(" ");
                for (int var41 = field7902 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7918[var41].field1037.field7519).append(" ");
                }
                var40.append("op: ").append(var5);
                class544.method3184(23383, var40.toString(), var42);
            } else {
                class175.method1103((byte) 38, 4, "Clientscript error in: " + arg0.field7819);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7819).append("\n");
                for (int var38 = field7902 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7918[var38].field1037.field7819).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class544.method3184(23383, var37.toString(), var42);
                class79.method660((byte) -61, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
    private static final void method3200(int arg0) {
        class17 var1 = class400.method2420((byte) -118, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class17[] var3 = class362.field4821[var2];
        if (var3 == null) {
            class17[] var4 = class516.field7555[var2];
            int var5 = var4.length;
            var3 = class362.field4821[var2] = new class17[var5];
            class252.method1540(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class252.method1540(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "()V")
    public static void method3201() {
        field7899 = null;
        field7915 = null;
        field7904 = null;
        field7909 = null;
        field7914 = null;
        field7913 = null;
        field7918 = null;
        field7907 = null;
        field7917 = null;
        field7912 = null;
        field7900 = null;
        field7925 = null;
        field7924 = null;
        field7926 = null;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "()V")
    public static final void method3202() {
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljh;I)V")
    private static final void method3203(class143 arg0, int arg1) {
        Object[] var2 = arg0.field1786;
        int var3 = (Integer) var2[0];
        class537 var4 = class353.method1997(var3, 1756);
        if (var4 == null) {
            return;
        }
        field7899 = new int[var4.field7823];
        int var5 = 0;
        field7915 = new String[var4.field7817];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1790;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1784;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1789 == null ? -1 : arg0.field1789.field465;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1787;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1789 == null ? -1 : arg0.field1789.field485;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1777 == null ? -1 : arg0.field1777.field465;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1777 == null ? -1 : arg0.field1777.field485;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1779;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1778;
                }
                field7899[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1782;
                }
                field7915[var6++] = var9;
            }
        }
        field7927 = arg0.field1785;
        method3199(var4, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljh;)V")
    public static final void method3204(class143 arg0) {
        method3203(arg0, 200000);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(IZ)V")
    public static final void method3205(int arg0, boolean arg1) {
    }
}
