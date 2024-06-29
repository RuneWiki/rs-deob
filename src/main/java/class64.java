import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class64 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    private static int field841 = 0;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private static int field851 = 0;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
    private static int[] field845 = new int[5];

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[Lcf;")
    private static class282[] field843 = new class282[50];

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[[I")
    private static int[][] field857 = new int[5][5000];

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    private static int field863 = 0;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "[I")
    private static int[] field864 = new int[1000];

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field855 = new String[1000];

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/util/Calendar;")
    private static Calendar field852 = Calendar.getInstance();

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "[I")
    private static int[] field866 = new int[3];

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field867 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "Ljo;")
    public static class382 field868 = new class382(4);

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    private static int field869 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Lol;")
    private static class196 field856;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lgo;")
    private static class310 field847;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "Lgo;")
    private static class310 field859;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[I")
    private static int[] field854;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field849;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method440(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IZ)V", line = 10)
    private static final void method441(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field864[field841++] = class338.field5213;
                return;
            }
            if (arg0 == 5001) {
                field841 -= 3;
                class338.field5213 = field864[field841];
                class482.field7126 = class514.method3023(field864[field841 + 1], 0);
                if (class482.field7126 == null) {
                    class482.field7126 = class51.field651;
                }
                class293.field4385 = field864[field841 + 2];
                field842++;
                class97.method758(class466.field6786, false);
                class43.field559.method2754(class338.field5213, 5574);
                class43.field559.method2754(class482.field7126.field836, 5574);
                class43.field559.method2754(class293.field4385, 5574);
                return;
            }
            if (arg0 == 5002) {
                field863 -= 2;
                String var2 = field855[field863];
                String var3 = field855[field863 + 1];
                field841 -= 2;
                int var4 = field864[field841];
                int var5 = field864[field841 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field850++;
                class97.method758(class452.field6646, false);
                class43.field559.method2754(class521.method3084(var2, 74) + class521.method3084(var3, 120) + 2, 5574);
                class43.field559.method2731(var2, (byte) -59);
                class43.field559.method2754(var4 - 1, 5574);
                class43.field559.method2754(var5, 5574);
                class43.field559.method2731(var3, (byte) -28);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field864[--field841];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class330.field5142[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field855[field863++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field864[--field841];
                int var9 = -1;
                if (var8 < 100 && class330.field5142[var8] != null) {
                    var9 = class283.field4271[var8];
                }
                field864[field841++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class482.field7126 == null) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = class482.field7126.field836;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field855[--field863];
                method448(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field863 -= 2;
                String var11 = field855[field863];
                String var12 = field855[field863 + 1];
                if (class234.field3291 != 0 || (!class252.field3437 || class488.field7284) && !class502.field7405) {
                    field853++;
                    class97.method758(class517.field7589, false);
                    class43.field559.method2754(0, 5574);
                    int var13 = class43.field559.field6830;
                    class43.field559.method2731(var11, (byte) -41);
                    class452.method2635(class43.field559, var12, 13);
                    class43.field559.method2744(class43.field559.field6830 - var13, true);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field864[--field841];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class93.field1446[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field855[field863++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field864[--field841];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class187.field2748[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field855[field863++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field864[--field841];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class113.field1721[var18];
                }
                field864[field841++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class410.field6198 == null || class410.field6198.field7064 == null) {
                    var20 = class368.field5603;
                } else {
                    var20 = class410.field6198.method2864(-9476, true);
                }
                field855[field863++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field864[field841++] = class293.field4385;
                return;
            }
            if (arg0 == 5017) {
                field864[field841++] = class159.field2396;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field864[--field841];
                int var22 = 0;
                if (var21 < 100 && class330.field5142[var21] != null) {
                    var22 = class88.field1379[var21];
                }
                field864[field841++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field864[--field841];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class125.field1893[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field855[field863++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class410.field6198 == null || class410.field6198.field7064 == null) {
                    var25 = class368.field5603;
                } else {
                    var25 = class410.field6198.method2866(false, -114);
                }
                field855[field863++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field864[--field841];
                field855[field863++] = class117.field1757.method1659((byte) -29, var26).field3325;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field864[--field841];
                class238 var28 = class117.field1757.method1659((byte) -77, var27);
                if (var28.field3322 == null) {
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = var28.field3322.length;
                return;
            }
            if (arg0 == 5052) {
                field841 -= 2;
                int var29 = field864[field841];
                int var30 = field864[field841 + 1];
                class238 var31 = class117.field1757.method1659((byte) -12, var29);
                int var32 = var31.field3322[var30];
                field864[field841++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field864[--field841];
                class238 var34 = class117.field1757.method1659((byte) -77, var33);
                if (var34.field3320 == null) {
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = var34.field3320.length;
                return;
            }
            if (arg0 == 5054) {
                field841 -= 2;
                int var35 = field864[field841];
                int var36 = field864[field841 + 1];
                field864[field841++] = class117.field1757.method1659((byte) -107, var35).field3320[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field864[--field841];
                field855[field863++] = class40.field530.method1433(false, var37).method1050((byte) -23);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field864[--field841];
                class145 var39 = class40.field530.method1433(false, var38);
                if (var39.field2162 == null) {
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = var39.field2162.length;
                return;
            }
            if (arg0 == 5057) {
                field841 -= 2;
                int var40 = field864[field841];
                int var41 = field864[field841 + 1];
                field864[field841++] = class40.field530.method1433(false, var40).field2162[var41];
                return;
            }
            if (arg0 == 5058) {
                field856 = new class196();
                field856.field2882 = field864[--field841];
                field856.field2878 = class40.field530.method1433(false, field856.field2882);
                field856.field2879 = new int[field856.field2878.method1051(119)];
                return;
            }
            if (arg0 == 5059) {
                field862++;
                class97.method758(class407.field6148, false);
                class43.field559.method2754(0, 5574);
                int var42 = class43.field559.field6830;
                class43.field559.method2754(0, 5574);
                class43.field559.method2777((byte) 74, field856.field2882);
                field856.field2878.method1054(false, field856.field2879, class43.field559);
                class43.field559.method2744(class43.field559.field6830 - var42, true);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field855[--field863];
                field844++;
                class97.method758(class224.field3167, false);
                class43.field559.method2754(0, 5574);
                int var44 = class43.field559.field6830;
                class43.field559.method2731(var43, (byte) -107);
                class43.field559.method2777((byte) 74, field856.field2882);
                field856.field2878.method1054(false, field856.field2879, class43.field559);
                class43.field559.method2744(class43.field559.field6830 - var44, true);
                return;
            }
            if (arg0 == 5061) {
                field862++;
                class97.method758(class407.field6148, false);
                class43.field559.method2754(0, 5574);
                int var45 = class43.field559.field6830;
                class43.field559.method2754(1, 5574);
                class43.field559.method2777((byte) 74, field856.field2882);
                field856.field2878.method1054(false, field856.field2879, class43.field559);
                class43.field559.method2744(class43.field559.field6830 - var45, true);
                return;
            }
            if (arg0 == 5062) {
                field841 -= 2;
                int var46 = field864[field841];
                int var47 = field864[field841 + 1];
                field864[field841++] = class117.field1757.method1659((byte) -79, var46).field3328[var47];
                return;
            }
            if (arg0 == 5063) {
                field841 -= 2;
                int var48 = field864[field841];
                int var49 = field864[field841 + 1];
                field864[field841++] = class117.field1757.method1659((byte) -60, var48).field3318[var49];
                return;
            }
            if (arg0 == 5064) {
                field841 -= 2;
                int var50 = field864[field841];
                int var51 = field864[field841 + 1];
                if (var51 == -1) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = class117.field1757.method1659((byte) -45, var50).method1465((byte) -124, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field841 -= 2;
                int var52 = field864[field841];
                int var53 = field864[field841 + 1];
                if (var53 == -1) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = class117.field1757.method1659((byte) -92, var52).method1463(0, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field864[--field841];
                field864[field841++] = class40.field530.method1433(false, var54).method1051(83);
                return;
            }
            if (arg0 == 5067) {
                field841 -= 2;
                int var55 = field864[field841];
                int var56 = field864[field841 + 1];
                int var57 = class40.field530.method1433(false, var55).method1055(var56, 32715).field6443;
                field864[field841++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field841 -= 2;
                int var58 = field864[field841];
                int var59 = field864[field841 + 1];
                field856.field2879[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field841 -= 2;
                int var60 = field864[field841];
                int var61 = field864[field841 + 1];
                field856.field2879[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field841 -= 3;
                int var62 = field864[field841];
                int var63 = field864[field841 + 1];
                int var64 = field864[field841 + 2];
                class145 var65 = class40.field530.method1433(false, var62);
                if (var65.method1055(var63, 32715).field6443 != 0) {
                    throw new RuntimeException("bad command");
                }
                field864[field841++] = var65.method1058(var64, var63, (byte) 75);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field855[--field863];
                boolean var67 = field864[--field841] == 1;
                class201.method1328(var66, (byte) 79, var67);
                field864[field841++] = class6.field57;
                return;
            }
            if (arg0 == 5072) {
                if (class182.field2706 != null && class153.field2322 < class6.field57) {
                    field864[field841++] = class182.field2706[class153.field2322++] & 0xFFFF;
                    return;
                }
                field864[field841++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class153.field2322 = 0;
                return;
            }
            if (arg0 == 5074) {
                field862++;
                class97.method758(class407.field6148, false);
                class43.field559.method2754(0, 5574);
                int var68 = class43.field559.field6830;
                class43.field559.method2754(2, 5574);
                class43.field559.method2777((byte) 74, field856.field2882);
                field856.field2878.method1054(false, field856.field2879, class43.field559);
                class43.field559.method2744(class43.field559.field6830 - var68, true);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class49.field630.method1879(86, true)) {
                    field864[field841++] = 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class49.field630.method1879(82, true)) {
                    field864[field841++] = 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class49.field630.method1879(81, true)) {
                    field864[field841++] = 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class60.method434(field864[--field841], (byte) 103);
                return;
            }
            if (arg0 == 5201) {
                field864[field841++] = class378.method2233((byte) 37);
                return;
            }
            if (arg0 == 5205) {
                class257.method1530(0, field864[--field841], -1, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field864[--field841];
                class149 var70 = class137.method992(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = var70.field2254;
                return;
            }
            if (arg0 == 5207) {
                class149 var71 = class137.method1001(field864[--field841]);
                if (var71 != null && var71.field2267 != null) {
                    field855[field863++] = var71.field2267;
                    return;
                }
                field855[field863++] = "";
                return;
            }
            if (arg0 == 5208) {
                field864[field841++] = class519.field7608;
                field864[field841++] = class504.field7418;
                return;
            }
            if (arg0 == 5209) {
                field864[field841++] = class170.field2508 + class137.field2035;
                field864[field841++] = class473.field6977 + class137.field2036;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field864[--field841];
                class149 var73 = class137.method1001(var72);
                if (var73 == null) {
                    field864[field841++] = 0;
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = var73.field2261 >> 14 & 0x3FFF;
                field864[field841++] = var73.field2261 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field864[--field841];
                class149 var75 = class137.method1001(var74);
                if (var75 == null) {
                    field864[field841++] = 0;
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = var75.field2257 - var75.field2265;
                field864[field841++] = var75.field2251 - var75.field2258;
                return;
            }
            if (arg0 == 5212) {
                class219 var76 = class457.method2656(-1);
                if (var76 == null) {
                    field864[field841++] = -1;
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = var76.field3137;
                int var77 = var76.field3144 << 28 | class137.field2035 + var76.field3134 << 14 | class137.field2036 + var76.field3132;
                field864[field841++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class219 var78 = class267.method1666(0);
                if (var78 == null) {
                    field864[field841++] = -1;
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = var78.field3137;
                int var79 = var78.field3144 << 28 | class137.field2035 + var78.field3134 << 14 | class137.field2036 + var78.field3132;
                field864[field841++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field864[--field841];
                class149 var81 = class32.method279((byte) 123);
                if (var81 != null) {
                    boolean var82 = var81.method1079(var80 >> 28 & 0x3, false, var80 >> 14 & 0x3FFF, var80 & 0x3FFF, field866);
                    if (var82) {
                        class424.method2523(-104, field866[2], field866[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field841 -= 2;
                int var83 = field864[field841];
                int var84 = field864[field841 + 1];
                class275 var85 = class137.method1003(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class149 var87 = (class149) var85.method1713(105); var87 != null; var87 = (class149) var85.method1711(112)) {
                    if (var87.field2254 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field864[field841++] = 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field864[--field841];
                class149 var89 = class137.method1001(var88);
                if (var89 == null) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = var89.field2252;
                return;
            }
            if (arg0 == 5220) {
                field864[field841++] = class507.field7449 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field864[--field841];
                class424.method2523(-95, var90 & 0x3FFF, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class149 var91 = class32.method279((byte) 126);
                if (var91 != null) {
                    boolean var92 = var91.method1082((byte) 80, class473.field6977 + class137.field2036, class170.field2508 + class137.field2035, field866);
                    if (var92) {
                        field864[field841++] = field866[1];
                        field864[field841++] = field866[2];
                        return;
                    }
                    field864[field841++] = -1;
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = -1;
                field864[field841++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field841 -= 2;
                int var93 = field864[field841];
                int var94 = field864[field841 + 1];
                class257.method1530(0, var93, var94 >> 14 & 0x3FFF, var94 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field864[--field841];
                class149 var96 = class32.method279((byte) 121);
                if (var96 != null) {
                    boolean var97 = var96.method1079(var95 >> 28 & 0x3, false, var95 >> 14 & 0x3FFF, var95 & 0x3FFF, field866);
                    if (var97) {
                        field864[field841++] = field866[1];
                        field864[field841++] = field866[2];
                        return;
                    }
                    field864[field841++] = -1;
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = -1;
                field864[field841++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field864[--field841];
                class149 var99 = class32.method279((byte) 121);
                if (var99 != null) {
                    boolean var100 = var99.method1082((byte) 80, var98 & 0x3FFF, var98 >> 14 & 0x3FFF, field866);
                    if (var100) {
                        field864[field841++] = field866[1];
                        field864[field841++] = field866[2];
                        return;
                    }
                    field864[field841++] = -1;
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = -1;
                field864[field841++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class295.method1835((byte) 124, field864[--field841]);
                return;
            }
            if (arg0 == 5227) {
                field841 -= 2;
                int var101 = field864[field841];
                int var102 = field864[field841 + 1];
                class257.method1530(0, var101, var102 >> 14 & 0x3FFF, var102 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class241.field3357 = field864[--field841] == 1;
                return;
            }
            if (arg0 == 5229) {
                field864[field841++] = class241.field3357 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field864[--field841];
                class71.method503(true, var103);
                return;
            }
            if (arg0 == 5231) {
                field841 -= 2;
                int var104 = field864[field841];
                boolean var105 = field864[field841 + 1] == 1;
                if (class285.field4286 != null) {
                    class115 var106 = class285.field4286.method3059(83, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method876((byte) -96);
                        return;
                    }
                    if (var106 == null && var105) {
                        class115 var107 = new class115();
                        class285.field4286.method3055(0, (long) var104, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field864[--field841];
                if (class285.field4286 != null) {
                    class115 var109 = class285.field4286.method3059(98, (long) var108);
                    field864[field841++] = var109 == null ? 0 : 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field841 -= 2;
                int var110 = field864[field841];
                boolean var111 = field864[field841 + 1] == 1;
                if (class261.field3901 != null) {
                    class115 var112 = class261.field3901.method3059(78, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method876((byte) -96);
                        return;
                    }
                    if (var112 == null && var111) {
                        class115 var113 = new class115();
                        class261.field3901.method3055(0, (long) var110, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field864[--field841];
                if (class261.field3901 != null) {
                    class115 var115 = class261.field3901.method3059(56, (long) var114);
                    field864[field841++] = var115 == null ? 0 : 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field864[field841++] = class137.field2018 == null ? -1 : class137.field2018.field2254;
                return;
            }
            if (arg0 == 5236) {
                field841 -= 2;
                int var116 = field864[field841];
                int var117 = field864[field841 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class316.method1977(var116, var119, var118, (byte) 90);
                if (var120 < 0) {
                    field864[field841++] = -1;
                    return;
                }
                field864[field841++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class466.method2704(10);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field841 -= 2;
                int var121 = field864[field841];
                int var122 = field864[field841 + 1];
                class295.method1837(3, 19, var122, false, var121);
                field864[field841++] = class237.field3314 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class237.field3314 != null) {
                    class295.method1837(class454.field6661.field970, 19, -1, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class330[] var123 = class508.method2999(800);
                field864[field841++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field864[--field841];
                class330[] var125 = class508.method2999(800);
                field864[field841++] = var125[var124].field5140;
                field864[field841++] = var125[var124].field5137;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class454.field6661.field982;
                int var127 = class454.field6661.field979;
                int var128 = -1;
                class330[] var129 = class508.method2999(800);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class330 var131 = var129[var130];
                    if (var131.field5140 == var126 && var131.field5137 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field864[field841++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field864[field841++] = class437.method2568(-128);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field864[--field841];
                if (var132 >= 1 && var132 <= 2) {
                    class295.method1837(var132, 19, -1, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field864[field841++] = class454.field6661.field970;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field864[--field841];
                if (var133 >= 1 && var133 <= 2) {
                    class454.field6661.field970 = var133;
                    class454.field6661.method1532(class25.field375, 2);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field863 -= 2;
                String var134 = field855[field863];
                String var135 = field855[field863 + 1];
                int var136 = field864[--field841];
                field848++;
                class97.method758(class250.field3414, false);
                class43.field559.method2754(class521.method3084(var134, 99) + class521.method3084(var135, 68) + 1, 5574);
                class43.field559.method2731(var134, (byte) -111);
                class43.field559.method2731(var135, (byte) -90);
                class43.field559.method2754(var136, 5574);
                return;
            }
            if (arg0 == 5401) {
                field841 -= 2;
                class20.field298[field864[field841]] = (short) class418.method2492(field864[field841 + 1], (byte) 118);
                class164.field2437.method1747(79);
                class164.field2437.method1754(-14403);
                class373.field5641.method773(109);
                class134.method988(-28945);
                return;
            }
            if (arg0 == 5405) {
                field841 -= 2;
                int var137 = field864[field841];
                int var138 = field864[field841 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class277.field4142[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field841 -= 7;
                int var139 = field864[field841];
                int var140 = field864[field841 + 1] << 1;
                int var141 = field864[field841 + 2];
                int var142 = field864[field841 + 3];
                int var143 = field864[field841 + 4];
                int var144 = field864[field841 + 5];
                int var145 = field864[field841 + 6];
                if (var139 >= 0 && var139 < 2 && class277.field4142[var139] != null && var140 >= 0 && var140 < class277.field4142[var139].length) {
                    class277.field4142[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class277.field4142[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class277.field4142[field864[--field841]].length >> 1;
                field864[field841++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class237.field3314 != null) {
                    class295.method1837(class454.field6661.field970, 19, -1, false, -1);
                }
                if (class176.field2596 != null) {
                    class234.method1445(6);
                    System.exit(0);
                    return;
                }
                String var147 = class17.field278 == null ? class118.method890(true) : class17.field278;
                class157.method1121(false, class113.field1723 == 1, class25.field375, 65, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class291.field4361 != null) {
                    if (class291.field4361.field7849 == null) {
                        var148 = class269.method1678(class291.field4361.field7852, 12904);
                    } else {
                        var148 = (String) class291.field4361.field7849;
                    }
                }
                field855[field863++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field864[field841++] = class109.field1613 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class237.field3314 != null) {
                    class295.method1837(class454.field6661.field970, 19, -1, false, -1);
                }
                String var149 = field855[--field863];
                boolean var150 = field864[--field841] == 1;
                String var151 = class118.method890(true) + var149;
                class157.method1121(var150, class113.field1723 == 1, class25.field375, -83, var151);
                return;
            }
            if (arg0 == 5422) {
                field863 -= 2;
                String var152 = field855[field863];
                String var153 = field855[field863 + 1];
                int var154 = field864[--field841];
                if (var152.length() > 0) {
                    if (class40.field531 == null) {
                        class40.field531 = new String[class87.field1366[class251.field3433.field3910]];
                    }
                    class40.field531[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class46.field599 == null) {
                        class46.field599 = new String[class87.field1366[class251.field3433.field3910]];
                    }
                    class46.field599[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field855[--field863]);
                return;
            }
            if (arg0 == 5424) {
                field841 -= 11;
                class506.field7440 = field864[field841];
                class164.field2439 = field864[field841 + 1];
                class480.field7072 = field864[field841 + 2];
                class12.field121 = field864[field841 + 3];
                class193.field2848 = field864[field841 + 4];
                class338.field5221 = field864[field841 + 5];
                class145.field2186 = field864[field841 + 6];
                class351.field5407 = field864[field841 + 7];
                class23.field341 = field864[field841 + 8];
                class42.field551 = field864[field841 + 9];
                class292.field4380 = field864[field841 + 10];
                class142.field2146.method551(-5, class193.field2848);
                class142.field2146.method551(123, class338.field5221);
                class142.field2146.method551(-25, class145.field2186);
                class142.field2146.method551(120, class351.field5407);
                class142.field2146.method551(-27, class23.field341);
                class78.field1087 = null;
                class225.field3177 = null;
                class297.field4431 = null;
                class473.field6950 = null;
                class456.field6687 = null;
                class41.field535 = null;
                class73.field1011 = null;
                class230.field3235 = null;
                class56.field774 = true;
                return;
            }
            if (arg0 == 5425) {
                class31.method276(true);
                class56.field774 = false;
                return;
            }
            if (arg0 == 5426) {
                field841 -= 2;
                class52.field675 = field864[field841];
                class224.field3171 = field864[field841 + 1];
                return;
            }
            if (arg0 == 5427) {
                field841 -= 2;
                class449.field6614 = field864[field841 + 1];
                return;
            }
            if (arg0 == 5428) {
                field841 -= 2;
                int var155 = field864[field841];
                int var156 = field864[field841 + 1];
                field864[field841++] = class232.method1440(var155, var156, -13007) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class149.method1084(field855[--field863], 117, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class331.method2049(class25.field375.field1611, "accountcreated", -3460);
                    return;
                } catch (Throwable var277) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field841 -= 4;
                int var157 = field864[field841];
                int var158 = field864[field841 + 1];
                int var159 = field864[field841 + 2];
                int var160 = field864[field841 + 3];
                class373.method2216(var160, (var157 & 0x3FFF) - class241.field3358, false, (var157 >> 14 & 0x3FFF) - class267.field3979, var159, 128, var158);
                return;
            }
            if (arg0 == 5501) {
                field841 -= 4;
                int var161 = field864[field841];
                int var162 = field864[field841 + 1];
                int var163 = field864[field841 + 2];
                int var164 = field864[field841 + 3];
                class126.method926(var162, (var161 >> 14 & 0x3FFF) - class267.field3979, true, var163, var164, (var161 & 0x3FFF) - class241.field3358);
                return;
            }
            if (arg0 == 5502) {
                field841 -= 6;
                int var165 = field864[field841];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class96.field1501 = var165;
                int var166 = field864[field841 + 1];
                if (var166 + 1 >= class277.field4142[class96.field1501].length >> 1) {
                    throw new RuntimeException();
                }
                class443.field6517 = var166;
                class173.field2528 = 0;
                class438.field6447 = field864[field841 + 2];
                class147.field2224 = field864[field841 + 3];
                int var167 = field864[field841 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class39.field520 = var167;
                int var168 = field864[field841 + 5];
                if (var168 + 1 >= class277.field4142[class39.field520].length >> 1) {
                    throw new RuntimeException();
                }
                class276.field4121 = var168;
                class350.field5388 = 3;
                return;
            }
            if (arg0 == 5503) {
                class457.method2653(-80);
                return;
            }
            if (arg0 == 5504) {
                field841 -= 2;
                class179.method1224(0, (byte) 3, field864[field841], field864[field841 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field864[field841++] = (int) class254.field3443 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field864[field841++] = (int) class311.field4836 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class83.method660(-12778);
                return;
            }
            if (arg0 == 5508) {
                class72.method507(false);
                return;
            }
            if (arg0 == 5509) {
                class102.method776(-10714);
                return;
            }
            if (arg0 == 5510) {
                class59.method424((byte) -74);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field864[--field841];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class267.field3979;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class50.field640) {
                    var172 = class50.field640;
                }
                int var173 = var171 - class241.field3358;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class448.field6611) {
                    var173 = class448.field6611;
                }
                class382.field5746 = (var172 << 7) + 64;
                class444.field6528 = (var173 << 7) + 64;
                class350.field5388 = 4;
                return;
            }
            if (arg0 == 5512) {
                class267.method1669(true);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field863 -= 2;
                String var174 = field855[field863];
                String var175 = field855[field863 + 1];
                int var176 = field864[--field841];
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    class368.field5603 = var174;
                    class462.field6730 = var175;
                    class42.field553 = var176;
                    class526.method3137(5, 2270);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class482.method2879(false);
                return;
            }
            if (arg0 == 5602) {
                if (class130.field1926 == 0) {
                    class112.field1709 = -2;
                    class33.field455 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field841 -= 4;
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    class513.method3019(field864[field841], field864[field841 + 2], field864[field841 + 1], field864[field841 + 3], (byte) 105);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field863--;
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    class300.method1864(class123.method915(field855[field863], (byte) 46), 102);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field863 -= 3;
                field841 -= 7;
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    class361.method2158(field864[field841 + 5] == 1, 1, false, field864[field841 + 3], field864[field841 + 2], field855[field863 + 1], class123.method915(field855[field863], (byte) 46), field864[field841 + 1], field864[field841 + 4] == 1, field864[field841 + 6] == 1, field855[field863 + 2], field864[field841]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class409.field6167 == 0) {
                    class151.field2288 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field864[field841++] = class33.field455;
                return;
            }
            if (arg0 == 5608) {
                field864[field841++] = class263.field3916;
                return;
            }
            if (arg0 == 5609) {
                field864[field841++] = class151.field2288;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field855[field863++] = class524.field7705.length > var177 ? class436.method2567(3, class524.field7705[var177]) : "";
                }
                class524.field7705 = null;
                return;
            }
            if (arg0 == 5611) {
                field864[field841++] = class446.field6587;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field864[--field841];
                if (class411.field6213 != 6) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    if (class232.field3269 != null) {
                        class232.field3269.method669((byte) 40);
                        class232.field3269 = null;
                    }
                    class42.field553 = var178;
                    class526.method3137(8, 2270);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field864[field841++] = class33.field455;
                return;
            }
            if (arg0 == 5615) {
                field863 -= 2;
                String var179 = field855[field863];
                String var180 = field855[field863 + 1];
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    if (class232.field3269 != null) {
                        class232.field3269.method669((byte) 116);
                        class232.field3269 = null;
                    }
                    class368.field5603 = var179;
                    class462.field6730 = var180;
                    class526.method3137(4, 2270);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class457.method2654(false, 107);
                return;
            }
            if (arg0 == 5617) {
                field864[field841++] = class112.field1709;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field864[--field841];
                class474.method2819(var181, false, (byte) 104);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field864[--field841];
                class474.method2819(var182, true, (byte) 98);
                return;
            }
            if (arg0 == 5620) {
                class394.method2366(13773);
                if (class269.field4001 != "" && class269.field4001 != "") {
                    field864[field841++] = 1;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field863 -= 3;
                field841 -= 7;
                if (class411.field6213 != 2) {
                    return;
                }
                if (class130.field1926 == 0 && class409.field6167 == 0) {
                    class361.method2158(field864[field841 + 5] == 1, 1, true, field864[field841 + 3], field864[field841 + 2], field855[field863 + 1], class123.method915(field855[field863], (byte) 46), field864[field841 + 1], field864[field841 + 4] == 1, field864[field841 + 6] == 1, field855[field863 + 2], field864[field841]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class533 var183 = class25.field375.method825(0, "3", false);
                while (var183.field7848 == 0) {
                    class389.method2332(54, 1L);
                }
                if (var183.field7848 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class415 var184 = (class415) var183.field7849;
                if (var184.method2486(0).exists()) {
                    class468 var185 = new class468(50);
                    try {
                        var184.method2489(0, 0, 50, var185.field6868);
                    } catch (IOException var279) {
                    }
                }
                try {
                    var184.method2485(127);
                    return;
                } catch (Exception var278) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field864[--field841];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class454.field6661.field1006 = var186;
                class237.method1458(-108);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6002) {
                class454.field6661.method1535(field864[--field841] == 1, -5);
                class237.method1458(-109);
                class440.method2586(-2);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6003) {
                class454.field6661.field994 = field864[--field841] == 1;
                class440.method2586(-2);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6005) {
                class454.field6661.field991 = field864[--field841] == 1;
                class237.method1458(-114);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6006) {
                class454.field6661.field981 = field864[--field841] == 1;
                class407.field6147.method57(!class454.field6661.field981);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6007) {
                class454.field6661.field978 = field864[--field841];
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6008) {
                class454.field6661.field1005 = field864[--field841] == 1;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6009) {
                class454.field6661.field995 = field864[--field841] == 1;
                class237.method1458(-118);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6010) {
                class454.field6661.field996 = field864[--field841] == 1;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field864[--field841];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class454.field6661.method512(8998, class113.field1723, var187);
                class237.method1458(-95);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6012) {
                class454.field6661.method511(class113.field1723, 63, field864[--field841] == 1);
                class169.method1174((byte) -111);
                class398.method2388((byte) 53);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6014) {
                class454.field6661.field983 = field864[--field841] == 1;
                class237.method1458(-121);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6015) {
                class454.field6661.field985 = field864[--field841] == 1;
                class237.method1458(-103);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field864[--field841];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class454.field6661.field993 = var188;
                class264.method1650(class113.field1723, -104);
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6017) {
                class454.field6661.field986 = field864[--field841] == 1;
                class270.method1686(-127);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field864[--field841];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class454.field6661.field976 = var189;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field864[--field841];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class454.field6661.field980 != var190) {
                    if (class454.field6661.field980 == 0 && class120.field1840 != -1) {
                        class428.method2537((byte) -77, class120.field1840, 0, class497.field7381, false, var190);
                        class520.field7641 = false;
                    } else if (var190 == 0) {
                        class18.method202(4);
                        class520.field7641 = false;
                    } else {
                        class172.method1184(true, var190);
                    }
                    class454.field6661.field980 = var190;
                }
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field864[--field841];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class454.field6661.field1000 = var191;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6021) {
                class454.field6661.field3482 = field864[--field841] == 1;
                class440.method2586(-2);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field864[--field841];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class521.field7648 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class146.method1059(var192, (byte) -123);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                field864[field841++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field864[--field841];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class454.field6661.field989 = var194;
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field864[--field841];
                if (var195 < 0 || var195 > class188.method1262(29293, class521.field7648)) {
                    var195 = 0;
                }
                class454.field6661.field971 = var195;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field864[--field841];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class439.method2574(var196 == 1, 110);
                return;
            }
            if (arg0 == 6028) {
                class454.field6661.field1004 = field864[--field841] != 0;
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6029) {
                class454.field6661.field978 = field864[--field841];
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6030) {
                class454.field6661.field992 = field864[--field841] != 0;
                class454.field6661.method1532(class25.field375, 2);
                class237.method1458(-96);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field864[--field841];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class264.method1650(var197, -121);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field864[--field841];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class454.field6661.field999 = var198;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field864[--field841];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class454.field6661.field966 = var199;
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6034) {
                class454.field6661.field975 = field864[--field841] == 1;
                class454.field6661.method1532(class25.field375, 2);
                class169.method1174((byte) -111);
                class273.field4068 = false;
                return;
            }
            if (arg0 == 6035) {
                class454.field6661.field3481 = field864[--field841] == 1;
                class237.method1458(-94);
                class440.method2586(-2);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field864[field841++] = class454.field6661.field1006;
                return;
            }
            if (arg0 == 6102) {
                field864[field841++] = class454.field6661.method1531(-126, class113.field1723) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field864[field841++] = class454.field6661.field994 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field864[field841++] = class454.field6661.field991 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field864[field841++] = class454.field6661.field981 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field864[field841++] = class454.field6661.field978;
                return;
            }
            if (arg0 == 6108) {
                field864[field841++] = class454.field6661.field1005 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field864[field841++] = class454.field6661.field995 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field864[field841++] = class454.field6661.field996 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field864[field841++] = class454.field6661.method509(class113.field1723, -2);
                return;
            }
            if (arg0 == 6112) {
                field864[field841++] = class454.field6661.method510(15479, class113.field1723) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field864[field841++] = class454.field6661.field983 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field864[field841++] = class454.field6661.field985 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field864[field841++] = class454.field6661.field993;
                return;
            }
            if (arg0 == 6117) {
                field864[field841++] = class454.field6661.field986 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field864[field841++] = class454.field6661.field976;
                return;
            }
            if (arg0 == 6119) {
                field864[field841++] = class454.field6661.field980;
                return;
            }
            if (arg0 == 6120) {
                field864[field841++] = class454.field6661.field1000;
                return;
            }
            if (arg0 == 6121) {
                field864[field841++] = class407.field6147.method118() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field864[field841++] = class342.method2085(-128);
                return;
            }
            if (arg0 == 6124) {
                field864[field841++] = class454.field6661.field989;
                return;
            }
            if (arg0 == 6125) {
                field864[field841++] = class454.field6661.field971;
                return;
            }
            if (arg0 == 6126) {
                field864[field841++] = class407.field6147.method125() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field864[field841++] = class454.field6661.field997 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field864[field841++] = class454.field6661.field1004 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field864[field841++] = class454.field6661.field978;
                return;
            }
            if (arg0 == 6130) {
                field864[field841++] = class454.field6661.field992 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field864[field841++] = class113.field1723;
                return;
            }
            if (arg0 == 6132) {
                field864[field841++] = class454.field6661.field999;
                return;
            }
            if (arg0 == 6133) {
                field864[field841++] = class109.field1613 == 1 || class109.field1613 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field864[field841++] = class188.method1262(29293, class521.field7648);
                return;
            }
            if (arg0 == 6135) {
                field864[field841++] = class454.field6661.field966;
                return;
            }
            if (arg0 == 6136) {
                field864[field841++] = class454.field6661.field975 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var280) {
                }
                field864[field841++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field841 -= 2;
                class32.field452 = (short) field864[field841];
                if (class32.field452 <= 0) {
                    class32.field452 = 256;
                }
                class122.field1856 = (short) field864[field841 + 1];
                if (class122.field1856 <= 0) {
                    class122.field1856 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field841 -= 2;
                class245.field3397 = (short) field864[field841];
                if (class245.field3397 <= 0) {
                    class245.field3397 = 256;
                }
                class70.field934 = (short) field864[field841 + 1];
                if (class70.field934 <= 0) {
                    class70.field934 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field841 -= 4;
                class293.field4391 = (short) field864[field841];
                if (class293.field4391 <= 0) {
                    class293.field4391 = 1;
                }
                class282.field4268 = (short) field864[field841 + 1];
                if (class282.field4268 <= 0) {
                    class282.field4268 = 32767;
                } else if (class282.field4268 < class293.field4391) {
                    class282.field4268 = class293.field4391;
                }
                class200.field2919 = (short) field864[field841 + 2];
                if (class200.field2919 <= 0) {
                    class200.field2919 = 1;
                }
                class150.field2284 = (short) field864[field841 + 3];
                if (class150.field2284 <= 0) {
                    class150.field2284 = 32767;
                    return;
                }
                if (class150.field2284 < class200.field2919) {
                    class150.field2284 = class200.field2919;
                }
                return;
            }
            if (arg0 == 6203) {
                class182.method1238(class15.field198.field4661, 0, false, class15.field198.field4736, 0, -200);
                field864[field841++] = class407.field6145;
                field864[field841++] = class20.field306;
                return;
            }
            if (arg0 == 6204) {
                field864[field841++] = class245.field3397;
                field864[field841++] = class70.field934;
                return;
            }
            if (arg0 == 6205) {
                field864[field841++] = class32.field452;
                field864[field841++] = class122.field1856;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field864[field841++] = (int) (class381.method2281((byte) 111) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field864[field841++] = (int) (class381.method2281((byte) -119) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field841 -= 3;
                int var201 = field864[field841];
                int var202 = field864[field841 + 1];
                int var203 = field864[field841 + 2];
                field852.clear();
                field852.set(11, 12);
                field852.set(var203, var202, var201);
                field864[field841++] = (int) (field852.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field852.clear();
                field852.setTime(new Date(class381.method2281((byte) -125)));
                field864[field841++] = field852.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var204 = field864[--field841];
                boolean var205 = true;
                if (var204 < 0) {
                    var205 = (var204 + 1) % 4 == 0;
                } else if (var204 < 1582) {
                    var205 = var204 % 4 == 0;
                } else if (var204 % 4 != 0) {
                    var205 = false;
                } else if (var204 % 100 != 0) {
                    var205 = true;
                } else if (var204 % 400 != 0) {
                    var205 = false;
                }
                field864[field841++] = var205 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field864[field841++] = class404.method2436((byte) 76) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field864[field841++] = class166.method1161((byte) -32) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class411.field6213 == 6 && class130.field1926 == 0 && class409.field6167 == 0) {
                    if (class408.field6157) {
                        field864[field841++] = 0;
                        return;
                    }
                    if (class519.field7610 > class381.method2281((byte) 75) - 1000L) {
                        field864[field841++] = 1;
                        return;
                    }
                    class408.field6157 = true;
                    class97.method758(class87.field1364, false);
                    class43.field559.method2717(class169.field2485, 496598568);
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class152 var206 = class397.method2382(43);
                if (var206 != null) {
                    field864[field841++] = var206.field2311;
                    field864[field841++] = var206.field7473;
                    field855[field863++] = var206.field2307;
                    class439 var207 = var206.method1098(16);
                    field864[field841++] = var207.field6455;
                    field855[field863++] = var207.field6450;
                    field864[field841++] = var206.field7480;
                    field864[field841++] = var206.field2314;
                    field855[field863++] = var206.field2305;
                    return;
                }
                field864[field841++] = -1;
                field864[field841++] = 0;
                field855[field863++] = "";
                field864[field841++] = 0;
                field855[field863++] = "";
                field864[field841++] = 0;
                field864[field841++] = 0;
                field855[field863++] = "";
                return;
            }
            if (arg0 == 6502) {
                class152 var208 = class210.method1357((byte) -70);
                if (var208 != null) {
                    field864[field841++] = var208.field2311;
                    field864[field841++] = var208.field7473;
                    field855[field863++] = var208.field2307;
                    class439 var209 = var208.method1098(84);
                    field864[field841++] = var209.field6455;
                    field855[field863++] = var209.field6450;
                    field864[field841++] = var208.field7480;
                    field864[field841++] = var208.field2314;
                    field855[field863++] = var208.field2305;
                    return;
                }
                field864[field841++] = -1;
                field864[field841++] = 0;
                field855[field863++] = "";
                field864[field841++] = 0;
                field855[field863++] = "";
                field864[field841++] = 0;
                field864[field841++] = 0;
                field855[field863++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var210 = field864[--field841];
                String var211 = field855[--field863];
                if (class411.field6213 == 6 && class130.field1926 == 0 && class409.field6167 == 0) {
                    field864[field841++] = class83.method667(var211, 28637, var210) ? 1 : 0;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class454.field6661.field967 = field864[--field841];
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6505) {
                field864[field841++] = class454.field6661.field967;
                return;
            }
            if (arg0 == 6506) {
                int var212 = field864[--field841];
                class152 var213 = class50.method371(var212, 2);
                if (var213 != null) {
                    field864[field841++] = var213.field7473;
                    field855[field863++] = var213.field2307;
                    class439 var214 = var213.method1098(114);
                    field864[field841++] = var214.field6455;
                    field855[field863++] = var214.field6450;
                    field864[field841++] = var213.field7480;
                    field864[field841++] = var213.field2314;
                    field855[field863++] = var213.field2305;
                    return;
                }
                field864[field841++] = -1;
                field855[field863++] = "";
                field864[field841++] = 0;
                field855[field863++] = "";
                field864[field841++] = 0;
                field864[field841++] = 0;
                field855[field863++] = "";
                return;
            }
            if (arg0 == 6507) {
                field841 -= 4;
                int var215 = field864[field841];
                boolean var216 = field864[field841 + 1] == 1;
                int var217 = field864[field841 + 2];
                boolean var218 = field864[field841 + 3] == 1;
                class166.method1158(var217, var218, var216, var215, false);
                return;
            }
            if (arg0 == 6508) {
                class509.method3006(-85);
                return;
            }
            if (arg0 == 6509) {
                if (class411.field6213 != 6) {
                    return;
                }
                class118.field1819 = field864[--field841] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class454.field6661.field969 = field864[--field841] == 1;
                class454.field6661.method1532(class25.field375, 2);
                return;
            }
            if (arg0 == 6601) {
                field864[field841++] = class454.field6661.field969 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class59.field818 == class478.field7043) {
            if (arg0 == 6700) {
                int var219 = class312.field4840.method3062(0);
                if (class256.field3477 != -1) {
                    var219++;
                }
                field864[field841++] = var219;
                return;
            }
            if (arg0 == 6701) {
                int var220 = field864[--field841];
                if (class256.field3477 != -1) {
                    if (var220 == 0) {
                        field864[field841++] = class256.field3477;
                        return;
                    }
                    var220--;
                }
                class313 var221 = (class313) class312.field4840.method3061(-16817);
                while (var220-- > 0) {
                    var221 = (class313) class312.field4840.method3066((byte) 124);
                }
                field864[field841++] = var221.field4852;
                return;
            }
            if (arg0 == 6702) {
                int var222 = field864[--field841];
                if (class174.field2549[var222] == null) {
                    field855[field863++] = "";
                    return;
                }
                String var223 = class174.field2549[var222][0].field4638;
                if (var223 == null) {
                    field855[field863++] = "";
                    return;
                }
                field855[field863++] = var223.substring(0, var223.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var224 = field864[--field841];
                if (class174.field2549[var224] == null) {
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = class174.field2549[var224].length;
                return;
            }
            if (arg0 == 6704) {
                field841 -= 2;
                int var225 = field864[field841];
                int var226 = field864[field841 + 1];
                if (class174.field2549[var225] == null) {
                    field855[field863++] = "";
                    return;
                }
                String var227 = class174.field2549[var225][var226].field4638;
                if (var227 == null) {
                    field855[field863++] = "";
                    return;
                }
                field855[field863++] = var227;
                return;
            }
            if (arg0 == 6705) {
                field841 -= 2;
                int var228 = field864[field841];
                int var229 = field864[field841 + 1];
                if (class174.field2549[var228] == null) {
                    field864[field841++] = 0;
                    return;
                }
                field864[field841++] = class174.field2549[var228][var229].field4769;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field841 -= 3;
                int var230 = field864[field841];
                int var231 = field864[field841 + 1];
                int var232 = field864[field841 + 2];
                class221.method1401(var230 << 16 | var231, "", var232, (byte) -115, 1);
                return;
            }
            if (arg0 == 6708) {
                field841 -= 3;
                int var233 = field864[field841];
                int var234 = field864[field841 + 1];
                int var235 = field864[field841 + 2];
                class221.method1401(var233 << 16 | var234, "", var235, (byte) -115, 2);
                return;
            }
            if (arg0 == 6709) {
                field841 -= 3;
                int var236 = field864[field841];
                int var237 = field864[field841 + 1];
                int var238 = field864[field841 + 2];
                class221.method1401(var236 << 16 | var237, "", var238, (byte) -115, 3);
                return;
            }
            if (arg0 == 6710) {
                field841 -= 3;
                int var239 = field864[field841];
                int var240 = field864[field841 + 1];
                int var241 = field864[field841 + 2];
                class221.method1401(var239 << 16 | var240, "", var241, (byte) -115, 4);
                return;
            }
            if (arg0 == 6711) {
                field841 -= 3;
                int var242 = field864[field841];
                int var243 = field864[field841 + 1];
                int var244 = field864[field841 + 2];
                class221.method1401(var242 << 16 | var243, "", var244, (byte) -115, 5);
                return;
            }
            if (arg0 == 6712) {
                field841 -= 3;
                int var245 = field864[field841];
                int var246 = field864[field841 + 1];
                int var247 = field864[field841 + 2];
                class221.method1401(var245 << 16 | var246, "", var247, (byte) -115, 6);
                return;
            }
            if (arg0 == 6713) {
                field841 -= 3;
                int var248 = field864[field841];
                int var249 = field864[field841 + 1];
                int var250 = field864[field841 + 2];
                class221.method1401(var248 << 16 | var249, "", var250, (byte) -115, 7);
                return;
            }
            if (arg0 == 6714) {
                field841 -= 3;
                int var251 = field864[field841];
                int var252 = field864[field841 + 1];
                int var253 = field864[field841 + 2];
                class221.method1401(var251 << 16 | var252, "", var253, (byte) -115, 8);
                return;
            }
            if (arg0 == 6715) {
                field841 -= 3;
                int var254 = field864[field841];
                int var255 = field864[field841 + 1];
                int var256 = field864[field841 + 2];
                class221.method1401(var254 << 16 | var255, "", var256, (byte) -115, 9);
                return;
            }
            if (arg0 == 6716) {
                field841 -= 3;
                int var257 = field864[field841];
                int var258 = field864[field841 + 1];
                int var259 = field864[field841 + 2];
                class221.method1401(var257 << 16 | var258, "", var259, (byte) -115, 10);
                return;
            }
            if (arg0 == 6717) {
                field841 -= 3;
                int var260 = field864[field841];
                int var261 = field864[field841 + 1];
                int var262 = field864[field841 + 2];
                class310 var263 = class406.method2442((byte) -87, var260 << 16 | var261, var262);
                class312.method1967(-127);
                class399 var264 = client.method3039(var263);
                class195.method1290(var264.method2402(20992), var263, var264.field5961, (byte) -55);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var265 = field864[--field841];
                class473 var266 = class36.field497.method699(var265, 123);
                if (var266.field6938 == null) {
                    field855[field863++] = "";
                    return;
                }
                field855[field863++] = var266.field6938;
                return;
            }
            if (arg0 == 6801) {
                int var267 = field864[--field841];
                class473 var268 = class36.field497.method699(var267, 121);
                field864[field841++] = var268.field6937;
                return;
            }
            if (arg0 == 6802) {
                int var269 = field864[--field841];
                class473 var270 = class36.field497.method699(var269, 121);
                field864[field841++] = var270.field6929;
                return;
            }
            if (arg0 == 6803) {
                int var271 = field864[--field841];
                class473 var272 = class36.field497.method699(var271, 124);
                field864[field841++] = var272.field6967;
                return;
            }
            if (arg0 == 6804) {
                field841 -= 2;
                int var273 = field864[field841];
                int var274 = field864[field841 + 1];
                class184 var275 = class260.field3873.method2676(var274, (byte) -14);
                if (var275.method1251(-1)) {
                    field855[field863++] = class36.field497.method699(var273, 117).method2807(117, var275.field2714, var274);
                    return;
                }
                field864[field841++] = class36.field497.method699(var273, 127).method2814(var274, var275.field2717, -13438);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field864[field841++] = class252.field3437 && !class488.field7284 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field864[field841++] = class123.field1871;
                return;
            }
            if (arg0 == 6902) {
                field864[field841++] = class411.field6207;
                return;
            }
            if (arg0 == 6903) {
                field864[field841++] = class161.field2401;
                return;
            }
            if (arg0 == 6904) {
                field864[field841++] = class378.field5694;
                return;
            }
            if (arg0 == 6905) {
                String var276 = "";
                if (class291.field4361 != null) {
                    if (class291.field4361.field7849 == null) {
                        var276 = class269.method1678(class291.field4361.field7852, 12904);
                    } else {
                        var276 = (String) class291.field4361.field7849;
                    }
                }
                field855[field863++] = var276;
                return;
            }
            if (arg0 == 6906) {
                field864[field841++] = class372.field5619;
                return;
            }
            if (arg0 == 6907) {
                field864[field841++] = class22.field329;
                return;
            }
            if (arg0 == 6908) {
                field864[field841++] = class478.field7044;
                return;
            }
            if (arg0 == 6909) {
                field864[field841++] = class211.field3036 ? 1 : 0;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lgb;I)V", line = 3247)
    private static final void method442(class120 arg0, int arg1) {
        Object[] var2 = arg0.field1832;
        int var3 = (Integer) var2[0];
        class68 var4 = class299.method1855(-90, var3);
        if (var4 == null) {
            return;
        }
        field854 = new int[var4.field894];
        int var5 = 0;
        field849 = new String[var4.field898];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1826;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1837;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1833 == null ? -1 : arg0.field1833.field4643;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1835;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1833 == null ? -1 : arg0.field1833.field4675;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1830 == null ? -1 : arg0.field1830.field4643;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1830 == null ? -1 : arg0.field1830.field4675;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1838;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1836;
                }
                field854[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1829;
                }
                field849[var6++] = var9;
            }
        }
        field869 = arg0.field1831;
        method443(var4, arg1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ltq;I)V", line = 3326)
    private static final void method443(class68 arg0, int arg1) {
        field841 = 0;
        field863 = 0;
        int var2 = -1;
        int[] var3 = arg0.field893;
        int[] var4 = arg0.field897;
        byte var5 = -1;
        field851 = 0;
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
                        method452(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method441(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field864[field841++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field864[field841++] = class307.field4619.field2120[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class307.field4619.method1027(-111, field864[--field841], var8);
                } else if (var43 == 3) {
                    field855[field863++] = arg0.field892[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field841 -= 2;
                    if (field864[field841 + 1] != field864[field841]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field841 -= 2;
                    if (field864[field841 + 1] == field864[field841]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field841 -= 2;
                    if (field864[field841] < field864[field841 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field841 -= 2;
                    if (field864[field841] > field864[field841 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field851 == 0) {
                        return;
                    }
                    class282 var9 = field843[--field851];
                    arg0 = var9.field4267;
                    var3 = arg0.field893;
                    var4 = arg0.field897;
                    var2 = var9.field4262;
                    field854 = var9.field4270;
                    field849 = var9.field4260;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field864[field841++] = class307.field4619.method1030(var10, (byte) -114);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class307.field4619.method1031(field864[--field841], (byte) 96, var11);
                } else if (var43 == 31) {
                    field841 -= 2;
                    if (field864[field841] <= field864[field841 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field841 -= 2;
                    if (field864[field841] >= field864[field841 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field864[field841++] = field854[var4[var2]];
                } else if (var43 == 34) {
                    field854[var4[var2]] = field864[--field841];
                } else if (var43 == 35) {
                    field855[field863++] = field849[var4[var2]];
                } else if (var43 == 36) {
                    field849[var4[var2]] = field855[--field863];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field863 -= var12;
                    String var13 = class505.method2982(field855, true, var12, field863);
                    field855[field863++] = var13;
                } else if (var43 == 38) {
                    field841--;
                } else if (var43 == 39) {
                    field863--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class68 var15 = class299.method1855(-39, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field894];
                    String[] var17 = new String[var15.field898];
                    for (int var18 = 0; var18 < var15.field890; var18++) {
                        var16[var18] = field864[field841 + var18 - var15.field890];
                    }
                    for (int var19 = 0; var19 < var15.field900; var19++) {
                        var17[var19] = field855[field863 + var19 - var15.field900];
                    }
                    field841 -= var15.field890;
                    field863 -= var15.field900;
                    class282 var20 = new class282();
                    var20.field4267 = arg0;
                    var20.field4262 = var2;
                    var20.field4270 = field854;
                    var20.field4260 = field849;
                    if (field851 >= field843.length) {
                        throw new RuntimeException();
                    }
                    field843[field851++] = var20;
                    arg0 = var15;
                    var3 = var15.field893;
                    var4 = var15.field897;
                    var2 = -1;
                    field854 = var16;
                    field849 = var17;
                } else if (var43 == 42) {
                    field864[field841++] = class466.field6795[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class466.field6795[var21] = field864[--field841];
                    class283.method1764((byte) -120, var21);
                    class274.field4089 |= class409.field6170[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field864[--field841];
                    if (var24 >= 0 && var24 <= 5000) {
                        field845[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field857[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field864[--field841];
                    if (var28 < 0 || var28 >= field845[var27]) {
                        throw new RuntimeException();
                    }
                    field864[field841++] = field857[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field841 -= 2;
                    int var30 = field864[field841];
                    if (var30 < 0 || var30 >= field845[var29]) {
                        throw new RuntimeException();
                    }
                    field857[var29][var30] = field864[field841 + 1];
                } else if (var43 == 47) {
                    String var31 = class359.field5515[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field855[field863++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class359.field5515[var32] = field855[--field863];
                    class179.method1223((byte) 20, var32);
                } else if (var43 == 51) {
                    class517 var33 = arg0.field899[var4[var2]];
                    class221 var34 = (class221) var33.method3059(40, (long) field864[--field841]);
                    if (var34 != null) {
                        var2 += var34.field3155;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field901 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1739).append(" ");
                for (int var41 = field851 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field843[var41].field4267.field1739).append(" ");
                }
                var40.append("op: ").append(var5);
                class488.method2913(0, var42, var40.toString());
            } else {
                class264.method1653((byte) 124, "Clientscript error in: " + arg0.field901);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field901).append("\n");
                for (int var38 = field851 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field843[var38].field4267.field901).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class488.method2913(0, var42, var37.toString());
                class407.method2447(-98, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()V", line = 3757)
    public static void method444() {
        field854 = null;
        field849 = null;
        field845 = null;
        field857 = null;
        field864 = null;
        field855 = null;
        field843 = null;
        field859 = null;
        field847 = null;
        field856 = null;
        field852 = null;
        field867 = null;
        field866 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 3773)
    public static final void method445(int arg0) {
        if (arg0 == -1 || !class250.method1495(true, arg0)) {
            return;
        }
        class310[] var1 = class174.field2549[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field4640 != null) {
                class120 var4 = new class120();
                var4.field1833 = var3;
                var4.field1832 = var3.field4640;
                method442(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Ljava/lang/String;", line = 3806)
    private static final String method446(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field852.setTime(new Date(var1));
        int var3 = field852.get(5);
        int var4 = field852.get(2);
        int var5 = field852.get(1);
        return var3 + "-" + field867[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()V", line = 3820)
    public static final void method447() {
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3831)
    private static final void method448(String arg0, int arg1) {
        if (class234.field3291 == 0 && !(!class252.field3437 || class488.field7284) || class502.field7405) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class503.field7415.method2103(0, (byte) 34))) {
            var3 = 0;
            arg0 = arg0.substring(class503.field7415.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class15.field195.method2103(0, (byte) 34))) {
            var3 = 1;
            arg0 = arg0.substring(class15.field195.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class149.field2266.method2103(0, (byte) 34))) {
            var3 = 2;
            arg0 = arg0.substring(class149.field2266.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class274.field4092.method2103(0, (byte) 34))) {
            var3 = 3;
            arg0 = arg0.substring(class274.field4092.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class8.field72.method2103(0, (byte) 34))) {
            var3 = 4;
            arg0 = arg0.substring(class8.field72.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class12.field118.method2103(0, (byte) 34))) {
            var3 = 5;
            arg0 = arg0.substring(class12.field118.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class245.field3394.method2103(0, (byte) 34))) {
            var3 = 6;
            arg0 = arg0.substring(class245.field3394.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class225.field3180.method2103(0, (byte) 34))) {
            var3 = 7;
            arg0 = arg0.substring(class225.field3180.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class258.field3698.method2103(0, (byte) 34))) {
            var3 = 8;
            arg0 = arg0.substring(class258.field3698.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class345.field5327.method2103(0, (byte) 34))) {
            var3 = 9;
            arg0 = arg0.substring(class345.field5327.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class77.field1080.method2103(0, (byte) 34))) {
            var3 = 10;
            arg0 = arg0.substring(class77.field1080.method2103(0, (byte) 34).length());
        } else if (var2.startsWith(class58.field798.method2103(0, (byte) 34))) {
            var3 = 11;
            arg0 = arg0.substring(class58.field798.method2103(0, (byte) 34).length());
        } else if (class30.field430 != 0) {
            if (var2.startsWith(class503.field7415.method2103(class30.field430, (byte) 34))) {
                var3 = 0;
                arg0 = arg0.substring(class503.field7415.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class15.field195.method2103(class30.field430, (byte) 34))) {
                var3 = 1;
                arg0 = arg0.substring(class15.field195.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class149.field2266.method2103(class30.field430, (byte) 34))) {
                var3 = 2;
                arg0 = arg0.substring(class149.field2266.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class274.field4092.method2103(class30.field430, (byte) 34))) {
                var3 = 3;
                arg0 = arg0.substring(class274.field4092.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class8.field72.method2103(class30.field430, (byte) 34))) {
                var3 = 4;
                arg0 = arg0.substring(class8.field72.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class12.field118.method2103(class30.field430, (byte) 34))) {
                var3 = 5;
                arg0 = arg0.substring(class12.field118.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class245.field3394.method2103(class30.field430, (byte) 34))) {
                var3 = 6;
                arg0 = arg0.substring(class245.field3394.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class225.field3180.method2103(class30.field430, (byte) 34))) {
                var3 = 7;
                arg0 = arg0.substring(class225.field3180.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class258.field3698.method2103(class30.field430, (byte) 34))) {
                var3 = 8;
                arg0 = arg0.substring(class258.field3698.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class345.field5327.method2103(class30.field430, (byte) 34))) {
                var3 = 9;
                arg0 = arg0.substring(class345.field5327.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class77.field1080.method2103(class30.field430, (byte) 34))) {
                var3 = 10;
                arg0 = arg0.substring(class77.field1080.method2103(class30.field430, (byte) 34).length());
            } else if (var2.startsWith(class58.field798.method2103(class30.field430, (byte) 34))) {
                var3 = 11;
                arg0 = arg0.substring(class58.field798.method2103(class30.field430, (byte) 34).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class277.field4139.method2103(0, (byte) 34))) {
            var5 = 1;
            arg0 = arg0.substring(class277.field4139.method2103(0, (byte) 34).length());
        } else if (var4.startsWith(class488.field7282.method2103(0, (byte) 34))) {
            var5 = 2;
            arg0 = arg0.substring(class488.field7282.method2103(0, (byte) 34).length());
        } else if (var4.startsWith(class530.field7806.method2103(0, (byte) 34))) {
            var5 = 3;
            arg0 = arg0.substring(class530.field7806.method2103(0, (byte) 34).length());
        } else if (var4.startsWith(class33.field454.method2103(0, (byte) 34))) {
            var5 = 4;
            arg0 = arg0.substring(class33.field454.method2103(0, (byte) 34).length());
        } else if (var4.startsWith(class434.field6416.method2103(0, (byte) 34))) {
            var5 = 5;
            arg0 = arg0.substring(class434.field6416.method2103(0, (byte) 34).length());
        } else if (class30.field430 != 0) {
            if (var4.startsWith(class277.field4139.method2103(class30.field430, (byte) 34))) {
                var5 = 1;
                arg0 = arg0.substring(class277.field4139.method2103(class30.field430, (byte) 34).length());
            } else if (var4.startsWith(class488.field7282.method2103(class30.field430, (byte) 34))) {
                var5 = 2;
                arg0 = arg0.substring(class488.field7282.method2103(class30.field430, (byte) 34).length());
            } else if (var4.startsWith(class530.field7806.method2103(class30.field430, (byte) 34))) {
                var5 = 3;
                arg0 = arg0.substring(class530.field7806.method2103(class30.field430, (byte) 34).length());
            } else if (var4.startsWith(class33.field454.method2103(class30.field430, (byte) 34))) {
                var5 = 4;
                arg0 = arg0.substring(class33.field454.method2103(class30.field430, (byte) 34).length());
            } else if (var4.startsWith(class434.field6416.method2103(class30.field430, (byte) 34))) {
                var5 = 5;
                arg0 = arg0.substring(class434.field6416.method2103(class30.field430, (byte) 34).length());
            }
        }
        field865++;
        class97.method758(class496.field7355, false);
        class43.field559.method2754(0, 5574);
        int var6 = class43.field559.field6830;
        if (arg1 == 5021) {
            class43.field559.method2754(1, 5574);
        } else if (arg1 == 5022) {
            class43.field559.method2754(2, 5574);
        } else {
            class43.field559.method2754(0, 5574);
        }
        class43.field559.method2754(var3, 5574);
        class43.field559.method2754(var5, 5574);
        class452.method2635(class43.field559, arg0, 13);
        class43.field559.method2744(class43.field559.field6830 - var6, true);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lgb;)V", line = 4107)
    public static final void method449(class120 arg0) {
        method442(arg0, 200000);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 4115)
    private static final void method450(int arg0) {
        class310 var1 = class52.method386(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class310[] var3 = class376.field5673[var2];
        if (var3 == null) {
            class310[] var4 = class174.field2549[var2];
            int var5 = var4.length;
            var3 = class376.field5673[var2] = new class310[var5];
            class442.method2594(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class442.method2594(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 4158)
    private static final void method451(int arg0) {
        class310 var1 = class52.method386(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class310[] var3 = class376.field5673[var2];
        if (var3 == null) {
            class310[] var4 = class174.field2549[var2];
            int var5 = var4.length;
            var3 = class376.field5673[var2] = new class310[var5];
            class442.method2594(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class442.method2594(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(IZ)V", line = 4198)
    private static final void method452(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field841 -= 3;
                int var2 = field864[field841];
                int var3 = field864[field841 + 1];
                int var4 = field864[field841 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class310 var5 = class52.method386(0, var2);
                if (var5.field4788 == null) {
                    var5.field4788 = new class310[var4 + 1];
                }
                if (var5.field4788.length <= var4) {
                    class310[] var6 = new class310[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4788.length; var7++) {
                        var6[var7] = var5.field4788[var7];
                    }
                    var5.field4788 = var6;
                }
                if (var4 > 0 && var5.field4788[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class310 var8 = new class310();
                var8.field4703 = var3;
                var8.field4753 = var8.field4643 = var5.field4643;
                var8.field4675 = var4;
                var5.field4788[var4] = var8;
                if (arg1) {
                    field847 = var8;
                } else {
                    field859 = var8;
                }
                class292.method1812(-14307, var5);
                return;
            }
            if (arg0 == 101) {
                class310 var9 = arg1 ? field847 : field859;
                if (var9.field4675 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class310 var10 = class52.method386(0, var9.field4643);
                var10.field4788[var9.field4675] = null;
                class292.method1812(-14307, var10);
                return;
            }
            if (arg0 == 102) {
                class310 var11 = class52.method386(0, field864[--field841]);
                var11.field4788 = null;
                class292.method1812(-14307, var11);
                return;
            }
            if (arg0 == 200) {
                field841 -= 2;
                int var12 = field864[field841];
                int var13 = field864[field841 + 1];
                class310 var14 = class406.method2442((byte) -40, var12, var13);
                if (var14 != null && var13 != -1) {
                    field864[field841++] = 1;
                    if (arg1) {
                        field847 = var14;
                        return;
                    }
                    field859 = var14;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field864[--field841];
                class310 var16 = class52.method386(0, var15);
                if (var16 != null) {
                    field864[field841++] = 1;
                    if (arg1) {
                        field847 = var16;
                        return;
                    }
                    field859 = var16;
                    return;
                }
                field864[field841++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field864[--field841];
                method450(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field864[--field841];
                method451(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field841 -= 2;
                int var19 = field864[field841];
                int var20 = field864[field841 + 1];
                for (int var21 = 0; var21 < class78.field1082.length; var21++) {
                    if (class78.field1082[var21] == var19) {
                        class410.field6198.field7104.method307(class239.field3348, var21, (byte) 10, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class473.field6974.length; var22++) {
                    if (class473.field6974[var22] == var19) {
                        class410.field6198.field7104.method307(class239.field3348, var22, (byte) 10, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field841 -= 2;
                int var23 = field864[field841];
                int var24 = field864[field841 + 1];
                class410.field6198.field7104.method310(var23, var24, (byte) 99);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field864[--field841] != 0;
                class410.field6198.field7104.method302(32201, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class310 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class52.method386(0, field864[--field841]);
            } else {
                var26 = arg1 ? field847 : field859;
            }
            if (arg0 == 1000) {
                field841 -= 4;
                var26.field4805 = field864[field841];
                var26.field4646 = field864[field841 + 1];
                int var27 = field864[field841 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field864[field841 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field4798 = (byte) var27;
                var26.field4734 = (byte) var28;
                class292.method1812(-14307, var26);
                class289.method1795(51, var26);
                if (var26.field4675 == -1) {
                    class338.method2067(var26.field4643, false);
                }
                return;
            }
            if (arg0 == 1001) {
                field841 -= 4;
                var26.field4664 = field864[field841];
                var26.field4730 = field864[field841 + 1];
                var26.field4732 = 0;
                var26.field4650 = 0;
                int var29 = field864[field841 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field864[field841 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field4690 = (byte) var29;
                var26.field4654 = (byte) var30;
                class292.method1812(-14307, var26);
                class289.method1795(95, var26);
                if (var26.field4703 == 0) {
                    class211.method1363(false, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field864[--field841] == 1;
                if (var26.field4783 != var31) {
                    var26.field4783 = var31;
                    class292.method1812(-14307, var26);
                }
                if (var26.field4675 == -1) {
                    class411.method2467(var26.field4643, 65535);
                }
                return;
            }
            if (arg0 == 1004) {
                field841 -= 2;
                var26.field4666 = field864[field841];
                var26.field4768 = field864[field841 + 1];
                class292.method1812(-14307, var26);
                class289.method1795(65, var26);
                if (var26.field4703 == 0) {
                    class211.method1363(false, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field4776 = field864[--field841] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class310 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class52.method386(0, field864[--field841]);
            } else {
                var32 = arg1 ? field847 : field859;
            }
            if (arg0 == 1100) {
                field841 -= 2;
                var32.field4719 = field864[field841];
                if (var32.field4719 > var32.field4637 - var32.field4661) {
                    var32.field4719 = var32.field4637 - var32.field4661;
                }
                if (var32.field4719 < 0) {
                    var32.field4719 = 0;
                }
                var32.field4645 = field864[field841 + 1];
                if (var32.field4645 > var32.field4749 - var32.field4736) {
                    var32.field4645 = var32.field4749 - var32.field4736;
                }
                if (var32.field4645 < 0) {
                    var32.field4645 = 0;
                }
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    class449.method2623(false, var32.field4643);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field4764 = field864[--field841];
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    client.method3045(var32.field4643, -87);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field4740 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field4794 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field4766 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field864[--field841];
                if (var32.field4733 != var33) {
                    var32.field4733 = var33;
                    class292.method1812(-14307, var32);
                }
                if (var32.field4675 == -1) {
                    class428.method2535(-14381, var32.field4643);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field4699 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field4796 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field4802 = 1;
                var32.field4782 = field864[--field841];
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    class274.method1707((byte) -112, var32.field4643);
                }
                return;
            }
            if (arg0 == 1109) {
                field841 -= 6;
                var32.field4760 = field864[field841];
                var32.field4728 = field864[field841 + 1];
                var32.field4797 = field864[field841 + 2];
                var32.field4705 = field864[field841 + 3];
                var32.field4716 = field864[field841 + 4];
                var32.field4787 = field864[field841 + 5];
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    class53.method395((byte) -2, var32.field4643);
                    class307.method1914(var32.field4643, 95);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field864[--field841];
                if (var32.field4772 != var34) {
                    var32.field4772 = var34;
                    var32.field4710 = 0;
                    var32.field4739 = 1;
                    var32.field4641 = 0;
                    class292.method1812(-14307, var32);
                }
                if (var32.field4675 == -1) {
                    class293.method1817((byte) -92, var32.field4643);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field4741 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field855[--field863];
                if (!var35.equals(var32.field4651)) {
                    var32.field4651 = var35;
                    class292.method1812(-14307, var32);
                }
                if (var32.field4675 == -1) {
                    class365.method2179(-22799, var32.field4643);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field4759 = field864[--field841];
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    class522.method3097(var32.field4643, (byte) -126);
                }
                return;
            }
            if (arg0 == 1114) {
                field841 -= 3;
                var32.field4663 = field864[field841];
                var32.field4722 = field864[field841 + 1];
                var32.field4767 = field864[field841 + 2];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field4702 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field4758 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field4662 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field4712 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field4647 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1120) {
                field841 -= 2;
                var32.field4637 = field864[field841];
                var32.field4749 = field864[field841 + 1];
                class292.method1812(-14307, var32);
                if (var32.field4703 == 0) {
                    class211.method1363(false, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field841 -= 2;
                var32.field4660 = (short) field864[field841];
                var32.field4757 = (short) field864[field841 + 1];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field4737 = field864[--field841] == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field4787 = field864[--field841];
                class292.method1812(-14307, var32);
                if (var32.field4675 == -1) {
                    class53.method395((byte) -123, var32.field4643);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field864[--field841];
                var32.field4718 = var36 == 1;
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1125) {
                field841 -= 2;
                var32.field4748 = field864[field841];
                var32.field4775 = field864[field841 + 1];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field4747 = field864[--field841];
                class292.method1812(-14307, var32);
                return;
            }
            if (arg0 == 1127) {
                field841 -= 2;
                int var37 = field864[field841];
                int var38 = field864[field841 + 1];
                class184 var39 = class260.field3873.method2676(var37, (byte) -14);
                if (var39.field2717 != var38) {
                    var32.method1939((byte) 51, var37, var38);
                    return;
                }
                var32.method1941(var37, (byte) -69);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field864[--field841];
                String var41 = field855[--field863];
                class184 var42 = class260.field3873.method2676(var40, (byte) -14);
                if (!var42.field2714.equals(var41)) {
                    var32.method1938(var40, var41, -106);
                    return;
                }
                var32.method1941(var40, (byte) -26);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class310 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class52.method386(0, field864[--field841]);
            } else {
                var43 = arg1 ? field847 : field859;
            }
            class292.method1812(-14307, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field841 -= 2;
                int var44 = field864[field841];
                int var45 = field864[field841 + 1];
                if (var43.field4675 == -1) {
                    class482.method2873(var43.field4643, true);
                    class53.method395((byte) -97, var43.field4643);
                    class307.method1914(var43.field4643, 125);
                }
                if (var44 == -1) {
                    var43.field4802 = 1;
                    var43.field4782 = -1;
                    var43.field4665 = -1;
                    return;
                }
                var43.field4665 = var44;
                var43.field4677 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field4652 = true;
                } else {
                    var43.field4652 = false;
                }
                class81 var46 = class164.field2437.method1749(var44, -20230);
                var43.field4797 = var46.field1170;
                var43.field4705 = var46.field1161;
                var43.field4716 = var46.field1172;
                var43.field4760 = var46.field1165;
                var43.field4728 = var46.field1181;
                var43.field4787 = var46.field1125;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field4685 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field4685 = 1;
                } else {
                    var43.field4685 = 2;
                }
                if (var43.field4732 > 0) {
                    var43.field4787 = var43.field4787 * 32 / var43.field4732;
                    return;
                }
                if (var43.field4664 > 0) {
                    var43.field4787 = var43.field4787 * 32 / var43.field4664;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field4802 = 2;
                var43.field4782 = field864[--field841];
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -116, var43.field4643);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field4802 = 3;
                var43.field4782 = -1;
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -109, var43.field4643);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field4802 = 6;
                var43.field4782 = field864[--field841];
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -98, var43.field4643);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field4802 = 5;
                var43.field4782 = field864[--field841];
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -85, var43.field4643);
                }
                return;
            }
            if (arg0 == 1206) {
                field841 -= 4;
                var43.field4777 = field864[field841];
                var43.field4698 = field864[field841 + 1];
                var43.field4678 = field864[field841 + 2];
                var43.field4726 = field864[field841 + 3];
                class292.method1812(-14307, var43);
                return;
            }
            if (arg0 == 1207) {
                field841 -= 2;
                var43.field4657 = field864[field841];
                var43.field4679 = field864[field841 + 1];
                class292.method1812(-14307, var43);
                return;
            }
            if (arg0 == 1210) {
                field841 -= 4;
                var43.field4782 = field864[field841];
                var43.field4717 = field864[field841 + 1];
                if (field864[field841 + 2] == 1) {
                    var43.field4802 = 9;
                } else {
                    var43.field4802 = 8;
                }
                if (field864[field841 + 3] == 1) {
                    var43.field4652 = true;
                } else {
                    var43.field4652 = false;
                }
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -102, var43.field4643);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field4802 = 5;
                var43.field4782 = class449.field6615;
                var43.field4717 = 0;
                if (var43.field4675 == -1) {
                    class274.method1707((byte) -84, var43.field4643);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class310 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class52.method386(0, field864[--field841]);
                } else {
                    var58 = arg1 ? field847 : field859;
                }
                String var59 = field855[--field863];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field864[--field841];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field864[--field841];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field855[--field863];
                    } else {
                        var62[var63] = Integer.valueOf(field864[--field841]);
                    }
                }
                int var64 = field864[--field841];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field4801 = var62;
                } else if (arg0 == 1401) {
                    var58.field4686 = var62;
                } else if (arg0 == 1402) {
                    var58.field4727 = var62;
                } else if (arg0 == 1403) {
                    var58.field4672 = var62;
                } else if (arg0 == 1404) {
                    var58.field4807 = var62;
                } else if (arg0 == 1405) {
                    var58.field4751 = var62;
                } else if (arg0 == 1406) {
                    var58.field4803 = var62;
                } else if (arg0 == 1407) {
                    var58.field4649 = var62;
                    var58.field4770 = var60;
                } else if (arg0 == 1408) {
                    var58.field4754 = var62;
                } else if (arg0 == 1409) {
                    var58.field4790 = var62;
                } else if (arg0 == 1410) {
                    var58.field4752 = var62;
                } else if (arg0 == 1411) {
                    var58.field4693 = var62;
                } else if (arg0 == 1412) {
                    var58.field4778 = var62;
                } else if (arg0 == 1414) {
                    var58.field4780 = var62;
                    var58.field4793 = var60;
                } else if (arg0 == 1415) {
                    var58.field4721 = var62;
                    var58.field4642 = var60;
                } else if (arg0 == 1416) {
                    var58.field4725 = var62;
                } else if (arg0 == 1417) {
                    var58.field4724 = var62;
                } else if (arg0 == 1418) {
                    var58.field4692 = var62;
                } else if (arg0 == 1419) {
                    var58.field4670 = var62;
                } else if (arg0 == 1420) {
                    var58.field4746 = var62;
                } else if (arg0 == 1421) {
                    var58.field4711 = var62;
                } else if (arg0 == 1422) {
                    var58.field4681 = var62;
                } else if (arg0 == 1423) {
                    var58.field4656 = var62;
                } else if (arg0 == 1424) {
                    var58.field4706 = var62;
                } else if (arg0 == 1425) {
                    var58.field4674 = var62;
                } else if (arg0 == 1426) {
                    var58.field4762 = var62;
                } else if (arg0 == 1427) {
                    var58.field4789 = var62;
                } else if (arg0 == 1428) {
                    var58.field4795 = var62;
                    var58.field4668 = var60;
                } else if (arg0 == 1429) {
                    var58.field4744 = var62;
                    var58.field4808 = var60;
                } else if (arg0 == 1430) {
                    var58.field4785 = var62;
                }
                var58.field4765 = true;
                return;
            }
            if (arg0 < 1600) {
                class310 var65 = arg1 ? field847 : field859;
                if (arg0 == 1500) {
                    field864[field841++] = var65.field4671;
                    return;
                }
                if (arg0 == 1501) {
                    field864[field841++] = var65.field4644;
                    return;
                }
                if (arg0 == 1502) {
                    field864[field841++] = var65.field4661;
                    return;
                }
                if (arg0 == 1503) {
                    field864[field841++] = var65.field4736;
                    return;
                }
                if (arg0 == 1504) {
                    field864[field841++] = var65.field4783 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field864[field841++] = var65.field4753;
                    return;
                }
                if (arg0 == 1506) {
                    class310 var66 = class367.method2185(var65, (byte) -2);
                    field864[field841++] = var66 == null ? -1 : var66.field4643;
                    return;
                }
            } else if (arg0 < 1700) {
                class310 var67 = arg1 ? field847 : field859;
                if (arg0 == 1600) {
                    field864[field841++] = var67.field4719;
                    return;
                }
                if (arg0 == 1601) {
                    field864[field841++] = var67.field4645;
                    return;
                }
                if (arg0 == 1602) {
                    field855[field863++] = var67.field4651;
                    return;
                }
                if (arg0 == 1603) {
                    field864[field841++] = var67.field4637;
                    return;
                }
                if (arg0 == 1604) {
                    field864[field841++] = var67.field4749;
                    return;
                }
                if (arg0 == 1605) {
                    field864[field841++] = var67.field4787;
                    return;
                }
                if (arg0 == 1606) {
                    field864[field841++] = var67.field4797;
                    return;
                }
                if (arg0 == 1607) {
                    field864[field841++] = var67.field4716;
                    return;
                }
                if (arg0 == 1608) {
                    field864[field841++] = var67.field4705;
                    return;
                }
                if (arg0 == 1609) {
                    field864[field841++] = var67.field4794;
                    return;
                }
                if (arg0 == 1610) {
                    field864[field841++] = var67.field4760;
                    return;
                }
                if (arg0 == 1611) {
                    field864[field841++] = var67.field4728;
                    return;
                }
                if (arg0 == 1612) {
                    field864[field841++] = var67.field4733;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field864[--field841];
                    class184 var69 = class260.field3873.method2676(var68, (byte) -14);
                    if (var69.method1251(-1)) {
                        field855[field863++] = var67.method1945(11086, var68, var69.field2714);
                    } else {
                        field864[field841++] = var67.method1934(16711935, var68, var69.field2717);
                    }
                }
            } else if (arg0 < 1800) {
                class310 var70 = arg1 ? field847 : field859;
                if (arg0 == 1700) {
                    field864[field841++] = var70.field4665;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field4665 != -1) {
                        field864[field841++] = var70.field4677;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field864[field841++] = var70.field4675;
                    return;
                }
            } else if (arg0 < 1900) {
                class310 var71 = arg1 ? field847 : field859;
                if (arg0 == 1800) {
                    field864[field841++] = client.method3039(var71).method2402(20992);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field864[--field841];
                    int var334 = var72 - 1;
                    if (var71.field4701 != null && var334 < var71.field4701.length && var71.field4701[var334] != null) {
                        field855[field863++] = var71.field4701[var334];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field4738 == null) {
                        field855[field863++] = "";
                        return;
                    }
                    field855[field863++] = var71.field4738;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class310 var332;
                if (arg0 >= 2000) {
                    var332 = class52.method386(0, field864[--field841]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field847 : field859;
                }
                if (field869 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field4789 == null) {
                        return;
                    }
                    class120 var333 = new class120();
                    var333.field1833 = var332;
                    var333.field1832 = var332.field4789;
                    var333.field1831 = field869 + 1;
                    class478.field7041.method2958(var333, (byte) 96);
                    return;
                }
            } else if (arg0 < 2600) {
                class310 var73 = class52.method386(0, field864[--field841]);
                if (arg0 == 2500) {
                    field864[field841++] = var73.field4671;
                    return;
                }
                if (arg0 == 2501) {
                    field864[field841++] = var73.field4644;
                    return;
                }
                if (arg0 == 2502) {
                    field864[field841++] = var73.field4661;
                    return;
                }
                if (arg0 == 2503) {
                    field864[field841++] = var73.field4736;
                    return;
                }
                if (arg0 == 2504) {
                    field864[field841++] = var73.field4783 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field864[field841++] = var73.field4753;
                    return;
                }
                if (arg0 == 1506) {
                    class310 var74 = class367.method2185(var73, (byte) -2);
                    field864[field841++] = var74 == null ? -1 : var74.field4643;
                    return;
                }
            } else if (arg0 < 2700) {
                class310 var75 = class52.method386(0, field864[--field841]);
                if (arg0 == 2600) {
                    field864[field841++] = var75.field4719;
                    return;
                }
                if (arg0 == 2601) {
                    field864[field841++] = var75.field4645;
                    return;
                }
                if (arg0 == 2602) {
                    field855[field863++] = var75.field4651;
                    return;
                }
                if (arg0 == 2603) {
                    field864[field841++] = var75.field4637;
                    return;
                }
                if (arg0 == 2604) {
                    field864[field841++] = var75.field4749;
                    return;
                }
                if (arg0 == 2605) {
                    field864[field841++] = var75.field4787;
                    return;
                }
                if (arg0 == 2606) {
                    field864[field841++] = var75.field4797;
                    return;
                }
                if (arg0 == 2607) {
                    field864[field841++] = var75.field4716;
                    return;
                }
                if (arg0 == 2608) {
                    field864[field841++] = var75.field4705;
                    return;
                }
                if (arg0 == 2609) {
                    field864[field841++] = var75.field4794;
                    return;
                }
                if (arg0 == 2610) {
                    field864[field841++] = var75.field4760;
                    return;
                }
                if (arg0 == 2611) {
                    field864[field841++] = var75.field4728;
                    return;
                }
                if (arg0 == 2612) {
                    field864[field841++] = var75.field4733;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class310 var76 = class52.method386(0, field864[--field841]);
                    field864[field841++] = var76.field4665;
                    return;
                }
                if (arg0 == 2701) {
                    class310 var77 = class52.method386(0, field864[--field841]);
                    if (var77.field4665 != -1) {
                        field864[field841++] = var77.field4677;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field864[--field841];
                    class313 var79 = (class313) class312.field4840.method3059(51, (long) var78);
                    if (var79 != null) {
                        field864[field841++] = 1;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class310 var80 = class52.method386(0, field864[--field841]);
                    if (var80.field4788 == null) {
                        field864[field841++] = 0;
                        return;
                    }
                    int var81 = var80.field4788.length;
                    for (int var82 = 0; var82 < var80.field4788.length; var82++) {
                        if (var80.field4788[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field864[field841++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field841 -= 2;
                    int var83 = field864[field841];
                    int var84 = field864[field841 + 1];
                    class313 var85 = (class313) class312.field4840.method3059(125, (long) var83);
                    if (var85 != null && var85.field4852 == var84) {
                        field864[field841++] = 1;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class310 var86 = class52.method386(0, field864[--field841]);
                if (arg0 == 2800) {
                    field864[field841++] = client.method3039(var86).method2402(20992);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field864[--field841];
                    int var335 = var87 - 1;
                    if (var86.field4701 != null && var335 < var86.field4701.length && var86.field4701[var335] != null) {
                        field855[field863++] = var86.field4701[var335];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field4738 == null) {
                        field855[field863++] = "";
                        return;
                    }
                    field855[field863++] = var86.field4738;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field855[--field863];
                    class264.method1653((byte) 120, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field841 -= 2;
                    class330.method2042(-58, class410.field6198, field864[field841], field864[field841 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class108.method811(-21032, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field855[--field863];
                    int var90 = 0;
                    if (class36.method300(var89, (byte) 0)) {
                        var90 = class164.method1153(var89, 10);
                    }
                    field860++;
                    class97.method758(class206.field2994, false);
                    class43.field559.method2717(var90, 496598568);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field855[--field863];
                    field858++;
                    class97.method758(class250.field3417, false);
                    class43.field559.method2754(var91.length() + 1, 5574);
                    class43.field559.method2731(var91, (byte) -95);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field855[--field863];
                    field861++;
                    class97.method758(class69.field918, false);
                    class43.field559.method2754(var92.length() + 1, 5574);
                    class43.field559.method2731(var92, (byte) -89);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field864[--field841];
                    String var94 = field855[--field863];
                    class398.method2394(var94, (byte) -8, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field841 -= 3;
                    int var95 = field864[field841];
                    int var96 = field864[field841 + 1];
                    int var97 = field864[field841 + 2];
                    class310 var98 = class52.method386(0, var97);
                    class283.method1762((byte) -58, var96, var98, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field841 -= 2;
                    int var99 = field864[field841];
                    int var100 = field864[field841 + 1];
                    class310 var101 = arg1 ? field847 : field859;
                    class283.method1762((byte) -73, var100, var101, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field864[--field841];
                    field846++;
                    class97.method758(class143.field2159, false);
                    class43.field559.method2777((byte) 74, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field841 -= 2;
                    int var103 = field864[field841];
                    int var104 = field864[field841 + 1];
                    class313 var105 = (class313) class312.field4840.method3059(116, (long) var103);
                    if (var105 != null) {
                        class43.method336(var105.field4852 != var104, var105, false, true);
                    }
                    class469.method2780(-29720, 3, var103, var104, true);
                    return;
                }
                if (arg0 == 3112) {
                    field841--;
                    int var106 = field864[field841];
                    class313 var107 = (class313) class312.field4840.method3059(62, (long) var106);
                    if (var107 != null && var107.field4851 == 3) {
                        class43.method336(true, var107, false, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class230.method1427(field855[--field863], 0);
                    return;
                }
                if (arg0 == 3114) {
                    field841 -= 2;
                    int var108 = field864[field841];
                    int var109 = field864[field841 + 1];
                    String var110 = field855[--field863];
                    class73.method515(126, var108, var109, "", var110, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field841 -= 3;
                    class264.method1651(field864[field841 + 2], 255, field864[field841], field864[field841 + 1], (byte) 1);
                    return;
                }
                if (arg0 == 3201) {
                    class68.method476(255, 50, field864[--field841], false);
                    return;
                }
                if (arg0 == 3202) {
                    field841 -= 2;
                    class152.method1099(255, field864[field841 + 1], field864[field841], true);
                    return;
                }
                if (arg0 == 3203) {
                    field841 -= 4;
                    class264.method1651(field864[field841 + 2], field864[field841 + 3], field864[field841], field864[field841 + 1], (byte) 1);
                    return;
                }
                if (arg0 == 3204) {
                    field841 -= 3;
                    class68.method476(field864[field841 + 1], field864[field841 + 2], field864[field841], false);
                    return;
                }
                if (arg0 == 3205) {
                    field841 -= 3;
                    class152.method1099(field864[field841 + 2], field864[field841 + 1], field864[field841], true);
                    return;
                }
                if (arg0 == 3206) {
                    field841 -= 4;
                    class84.method672(29314, field864[field841 + 1], field864[field841 + 3], field864[field841], field864[field841 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field864[field841++] = class86.field1350;
                    return;
                }
                if (arg0 == 3301) {
                    field841 -= 2;
                    int var111 = field864[field841];
                    int var112 = field864[field841 + 1];
                    field864[field841++] = class117.method880(true, false, var112, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field841 -= 2;
                    int var113 = field864[field841];
                    int var114 = field864[field841 + 1];
                    field864[field841++] = class368.method2197(var113, 124, var114, false);
                    return;
                }
                if (arg0 == 3303) {
                    field841 -= 2;
                    int var115 = field864[field841];
                    int var116 = field864[field841 + 1];
                    field864[field841++] = class330.method2044(var115, (byte) -38, false, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field864[--field841];
                    field864[field841++] = class245.field3399.method2566(var117, (byte) 116).field2009;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field864[--field841];
                    field864[field841++] = class386.field5807[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field864[--field841];
                    field864[field841++] = class419.field6272[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field864[--field841];
                    field864[field841++] = class41.field536[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class410.field6198.field7686;
                    int var122 = (class410.field6198.field7681 >> 7) + class267.field3979;
                    int var123 = (class410.field6198.field7671 >> 7) + class241.field3358;
                    field864[field841++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field864[--field841];
                    field864[field841++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field864[--field841];
                    field864[field841++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field864[--field841];
                    field864[field841++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field864[field841++] = class125.field1884 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field841 -= 2;
                    int var127 = field864[field841];
                    int var128 = field864[field841 + 1];
                    field864[field841++] = class117.method880(true, true, var128, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field841 -= 2;
                    int var129 = field864[field841];
                    int var130 = field864[field841 + 1];
                    field864[field841++] = class368.method2197(var129, 127, var130, true);
                    return;
                }
                if (arg0 == 3315) {
                    field841 -= 2;
                    int var131 = field864[field841];
                    int var132 = field864[field841 + 1];
                    field864[field841++] = class330.method2044(var131, (byte) -38, true, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class234.field3291 >= 2) {
                        field864[field841++] = class234.field3291;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field864[field841++] = class89.field1392;
                    return;
                }
                if (arg0 == 3318) {
                    field864[field841++] = class141.field2122.field3023;
                    return;
                }
                if (arg0 == 3321) {
                    field864[field841++] = class260.field3865;
                    return;
                }
                if (arg0 == 3322) {
                    field864[field841++] = class489.field7288;
                    return;
                }
                if (arg0 == 3323) {
                    if (class337.field5195 >= 5 && class337.field5195 <= 9) {
                        field864[field841++] = 1;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class337.field5195 >= 5 && class337.field5195 <= 9) {
                        field864[field841++] = class337.field5195;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field864[field841++] = class226.field3195 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field864[field841++] = class410.field6198.field7091;
                    return;
                }
                if (arg0 == 3327) {
                    field864[field841++] = class410.field6198.field7104.field491 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field864[field841++] = class502.field7405 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field864[--field841];
                    field864[field841++] = class179.method1225(var133, 30332, false);
                    return;
                }
                if (arg0 == 3331) {
                    field841 -= 2;
                    int var134 = field864[field841];
                    int var135 = field864[field841 + 1];
                    field864[field841++] = class126.method930(false, var134, -24554, false, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field841 -= 2;
                    int var136 = field864[field841];
                    int var137 = field864[field841 + 1];
                    field864[field841++] = class126.method930(true, var136, -24554, false, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field864[field841++] = class42.field553;
                    return;
                }
                if (arg0 == 3335) {
                    field864[field841++] = class30.field430;
                    return;
                }
                if (arg0 == 3336) {
                    field841 -= 4;
                    int var138 = field864[field841];
                    int var139 = field864[field841 + 1];
                    int var140 = field864[field841 + 2];
                    int var141 = field864[field841 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field864[field841++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field864[field841++] = class86.field1357;
                    return;
                }
                if (arg0 == 3338) {
                    field864[field841++] = class74.method548(0);
                    return;
                }
                if (arg0 == 3339) {
                    field864[field841++] = class483.field7133 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field864[field841++] = class394.field5908 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field841 -= 2;
                    int var145 = field864[field841];
                    int var146 = field864[field841 + 1];
                    class491 var147 = class59.field817.method2984(var145, -14850);
                    field855[field863++] = var147.method2933(114, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field841 -= 4;
                    int var148 = field864[field841];
                    int var149 = field864[field841 + 1];
                    int var150 = field864[field841 + 2];
                    int var151 = field864[field841 + 3];
                    class491 var152 = class59.field817.method2984(var150, -14850);
                    if (var152.field7315 == var148 && var152.field7314 == var149) {
                        if (var149 == 115) {
                            field855[field863++] = var152.method2933(75, var151);
                            return;
                        }
                        field864[field841++] = var152.method2931((byte) -2, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field841 -= 3;
                    int var153 = field864[field841];
                    int var154 = field864[field841 + 1];
                    int var155 = field864[field841 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class491 var156 = class59.field817.method2984(var154, -14850);
                    if (var156.field7314 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field864[field841++] = var156.method2928(var155, (byte) -117) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field864[--field841];
                    String var158 = field855[--field863];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class491 var159 = class59.field817.method2984(var157, -14850);
                    if (var159.field7314 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field864[field841++] = var159.method2927(-6, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field864[--field841];
                    class491 var161 = class59.field817.method2984(var160, -14850);
                    field864[field841++] = var161.field7312.method3062(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class318.field4913 == 0) {
                        field864[field841++] = -2;
                        return;
                    }
                    if (class318.field4913 == 1) {
                        field864[field841++] = -1;
                        return;
                    }
                    field864[field841++] = class222.field3162;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field864[--field841];
                    if (class318.field4913 == 2 && var162 < class222.field3162) {
                        field855[field863++] = class134.field1996[var162];
                        if (class227.field3207[var162] != null) {
                            field855[field863++] = class227.field3207[var162];
                            return;
                        }
                        field855[field863++] = "";
                        return;
                    }
                    field855[field863++] = "";
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field864[--field841];
                    if (class318.field4913 == 2 && var163 < class222.field3162) {
                        field864[field841++] = class89.field1388[var163];
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field864[--field841];
                    if (class318.field4913 == 2 && var164 < class222.field3162) {
                        field864[field841++] = class288.field4299[var164];
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field855[--field863];
                    int var166 = field864[--field841];
                    client.method3041(var165, 95, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field855[--field863];
                    class23.method237((byte) 80, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field855[--field863];
                    class110.method858(var168, 1);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field855[--field863];
                    class374.method2218(var169, false, (byte) 98);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field855[--field863];
                    class133.method982(var170, -1);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field855[--field863];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field864[field841++] = class23.method228(35, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field864[--field841];
                    if (class318.field4913 == 2 && var172 < class222.field3162) {
                        field855[field863++] = class422.field6307[var172];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class510.field7492 != null) {
                        field855[field863++] = class436.method2567(3, class510.field7492);
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class510.field7492 != null) {
                        field864[field841++] = class516.field7572;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field864[--field841];
                    if (class510.field7492 != null && var173 < class516.field7572) {
                        field855[field863++] = class293.field4399[var173].field2501;
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field864[--field841];
                    if (class510.field7492 != null && var174 < class516.field7572) {
                        field864[field841++] = class293.field4399[var174].field2506;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field864[--field841];
                    if (class510.field7492 != null && var175 < class516.field7572) {
                        field864[field841++] = class293.field4399[var175].field2504;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field864[field841++] = class51.field650;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field855[--field863];
                    class459.method2664(true, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field864[field841++] = class117.field1762;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field855[--field863];
                    class261.method1642(var177, (byte) -108);
                    return;
                }
                if (arg0 == 3620) {
                    class267.method1668((byte) 105);
                    return;
                }
                if (arg0 == 3621) {
                    if (class318.field4913 == 0) {
                        field864[field841++] = -1;
                        return;
                    }
                    field864[field841++] = class411.field6211;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field864[--field841];
                    if (class318.field4913 != 0 && var178 < class411.field6211) {
                        field855[field863++] = class60.field827[var178];
                        if (class505.field7431[var178] != null) {
                            field855[field863++] = class505.field7431[var178];
                            return;
                        }
                        field855[field863++] = "";
                        return;
                    }
                    field855[field863++] = "";
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field855[--field863];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field864[field841++] = class473.method2811(8, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field864[--field841];
                    if (class293.field4399 != null && var180 < class516.field7572 && class293.field4399[var180].field2496.equalsIgnoreCase(class410.field6198.field7063)) {
                        field864[field841++] = 1;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class65.field886 != null) {
                        field855[field863++] = class65.field886;
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field864[--field841];
                    if (class510.field7492 != null && var181 < class516.field7572) {
                        field855[field863++] = class293.field4399[var181].field2502;
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field864[--field841];
                    if (class318.field4913 == 2 && var182 >= 0 && var182 < class222.field3162) {
                        field864[field841++] = class34.field473[var182] ? 1 : 0;
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field855[--field863];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field864[field841++] = class126.method931(3032, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field864[field841++] = class251.field3432;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field855[--field863];
                    class374.method2218(var184, true, (byte) 102);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field864[--field841];
                    field864[field841++] = class328.field5132[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field864[--field841];
                    if (class510.field7492 != null && var186 < class516.field7572) {
                        field855[field863++] = class293.field4399[var186].field2496;
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field864[--field841];
                    if (class318.field4913 != 0 && var187 < class411.field6211) {
                        field855[field863++] = class51.field660[var187];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field864[--field841];
                    field864[field841++] = class413.field6240[var188].method2626(true);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field864[--field841];
                    field864[field841++] = class413.field6240[var189].field6634;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field864[--field841];
                    field864[field841++] = class413.field6240[var190].field6628;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field864[--field841];
                    field864[field841++] = class413.field6240[var191].field6629;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field864[--field841];
                    field864[field841++] = class413.field6240[var192].field6636;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field864[--field841];
                    field864[field841++] = class413.field6240[var193].field6627;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field864[--field841];
                    int var195 = class413.field6240[var194].method2628((byte) -126);
                    field864[field841++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field864[--field841];
                    int var197 = class413.field6240[var196].method2628((byte) -108);
                    field864[field841++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field864[--field841];
                    int var199 = class413.field6240[var198].method2628((byte) -124);
                    field864[field841++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field864[--field841];
                    int var201 = class413.field6240[var200].method2628((byte) -119);
                    field864[field841++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field841 -= 2;
                    int var202 = field864[field841];
                    int var203 = field864[field841 + 1];
                    field864[field841++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field841 -= 2;
                    int var204 = field864[field841];
                    int var205 = field864[field841 + 1];
                    field864[field841++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field841 -= 2;
                    int var206 = field864[field841];
                    int var207 = field864[field841 + 1];
                    field864[field841++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field841 -= 2;
                    int var208 = field864[field841];
                    int var209 = field864[field841 + 1];
                    field864[field841++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field864[--field841];
                    field864[field841++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field864[--field841];
                    field864[field841++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field841 -= 5;
                    int var212 = field864[field841];
                    int var213 = field864[field841 + 1];
                    int var214 = field864[field841 + 2];
                    int var215 = field864[field841 + 3];
                    int var216 = field864[field841 + 4];
                    field864[field841++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field841 -= 2;
                    long var217 = (long) field864[field841];
                    long var219 = (long) field864[field841 + 1];
                    field864[field841++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field841 -= 2;
                    int var221 = field864[field841];
                    int var222 = field864[field841 + 1];
                    field864[field841++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field841 -= 2;
                    int var223 = field864[field841];
                    int var224 = field864[field841 + 1];
                    field864[field841++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field841 -= 2;
                    int var225 = field864[field841];
                    int var226 = field864[field841 + 1];
                    field864[field841++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field841 -= 2;
                    int var227 = field864[field841];
                    int var228 = field864[field841 + 1];
                    field864[field841++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field841 -= 2;
                    int var229 = field864[field841];
                    int var230 = field864[field841 + 1];
                    if (var229 == 0) {
                        field864[field841++] = 0;
                        return;
                    }
                    field864[field841++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field841 -= 2;
                    int var231 = field864[field841];
                    int var232 = field864[field841 + 1];
                    if (var231 == 0) {
                        field864[field841++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field864[field841++] = Integer.MAX_VALUE;
                        return;
                    }
                    field864[field841++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field841 -= 2;
                    int var233 = field864[field841];
                    int var234 = field864[field841 + 1];
                    field864[field841++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field841 -= 2;
                    int var235 = field864[field841];
                    int var236 = field864[field841 + 1];
                    field864[field841++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field841 -= 2;
                    int var237 = field864[field841];
                    int var238 = field864[field841 + 1];
                    field864[field841++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field841 -= 2;
                    int var239 = field864[field841];
                    int var240 = field864[field841 + 1];
                    field864[field841++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field841 -= 3;
                    long var241 = (long) field864[field841];
                    long var243 = (long) field864[field841 + 1];
                    long var245 = (long) field864[field841 + 2];
                    field864[field841++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field855[--field863];
                    int var248 = field864[--field841];
                    field855[field863++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field863 -= 2;
                    String var249 = field855[field863];
                    String var250 = field855[field863 + 1];
                    field855[field863++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field855[--field863];
                    int var252 = field864[--field841];
                    field855[field863++] = var251 + class92.method725(true, (byte) -55, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field855[--field863];
                    field855[field863++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field855[field863++] = method446(field864[--field841]);
                    return;
                }
                if (arg0 == 4105) {
                    field863 -= 2;
                    String var254 = field855[field863];
                    String var255 = field855[field863 + 1];
                    if (class410.field6198.field7104 != null && class410.field6198.field7104.field491) {
                        field855[field863++] = var255;
                        return;
                    }
                    field855[field863++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field864[--field841];
                    field855[field863++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field863 -= 2;
                    field864[field841++] = class196.method1294(field855[field863 + 1], true, class30.field430, field855[field863]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field855[--field863];
                    field841 -= 2;
                    int var258 = field864[field841];
                    int var259 = field864[field841 + 1];
                    class443 var260 = class19.method210(class529.field7795, 0, var259, (byte) 80);
                    field864[field841++] = var260.method2605(var258, class279.field4217, var257, (byte) 22);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field855[--field863];
                    field841 -= 2;
                    int var262 = field864[field841];
                    int var263 = field864[field841 + 1];
                    class443 var264 = class19.method210(class529.field7795, 0, var263, (byte) 94);
                    field864[field841++] = var264.method2602(var262, -100, class279.field4217, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field863 -= 2;
                    String var265 = field855[field863];
                    String var266 = field855[field863 + 1];
                    if (field864[--field841] == 1) {
                        field855[field863++] = var265;
                        return;
                    }
                    field855[field863++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field855[--field863];
                    field855[field863++] = class352.method2133(-78, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field855[--field863];
                    int var269 = field864[--field841];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field855[field863++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field864[--field841];
                    field864[field841++] = class338.method2068((char) var270, -8213) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field864[--field841];
                    field864[field841++] = class72.method506((char) var271, (byte) 75) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field864[--field841];
                    field864[field841++] = class476.method2835((byte) 107, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field864[--field841];
                    field864[field841++] = class305.method1904((char) var273, (byte) 112) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field855[--field863];
                    if (var274 != null) {
                        field864[field841++] = var274.length();
                        return;
                    }
                    field864[field841++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field855[--field863];
                    field841 -= 2;
                    int var276 = field864[field841];
                    int var277 = field864[field841 + 1];
                    field855[field863++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field855[--field863];
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
                    field855[field863++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field855[--field863];
                    field841 -= 2;
                    int var284 = field864[field841];
                    int var285 = field864[field841 + 1];
                    field864[field841++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field863 -= 2;
                    String var286 = field855[field863];
                    String var287 = field855[field863 + 1];
                    int var288 = field864[--field841];
                    field864[field841++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field864[--field841];
                    field864[field841++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field864[--field841];
                    field864[field841++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field864[--field841] != 0;
                    int var292 = field864[--field841];
                    field855[field863++] = class126.method927((long) var292, 0, class30.field430, (byte) -26, var291);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field855[--field863];
                    int var294 = field864[--field841];
                    class443 var295 = class19.method210(class529.field7795, 0, var294, (byte) 68);
                    field864[field841++] = var295.method2596((byte) 125, class279.field4217, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field864[--field841];
                    field855[field863++] = class164.field2437.method1749(var296, -20230).field1131;
                    return;
                }
                if (arg0 == 4201) {
                    field841 -= 2;
                    int var297 = field864[field841];
                    int var298 = field864[field841 + 1];
                    class81 var299 = class164.field2437.method1749(var297, -20230);
                    if (var298 >= 1 && var298 <= 5 && var299.field1169[var298 - 1] != null) {
                        field855[field863++] = var299.field1169[var298 - 1];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field841 -= 2;
                    int var300 = field864[field841];
                    int var301 = field864[field841 + 1];
                    class81 var302 = class164.field2437.method1749(var300, -20230);
                    if (var301 >= 1 && var301 <= 5 && var302.field1183[var301 - 1] != null) {
                        field855[field863++] = var302.field1183[var301 - 1];
                        return;
                    }
                    field855[field863++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field864[--field841];
                    field864[field841++] = class164.field2437.method1749(var303, -20230).field1177;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field864[--field841];
                    field864[field841++] = class164.field2437.method1749(var304, -20230).field1132 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field864[--field841];
                    class81 var306 = class164.field2437.method1749(var305, -20230);
                    if (var306.field1123 == -1 && var306.field1133 >= 0) {
                        field864[field841++] = var306.field1133;
                        return;
                    }
                    field864[field841++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field864[--field841];
                    class81 var308 = class164.field2437.method1749(var307, -20230);
                    if (var308.field1123 >= 0 && var308.field1133 >= 0) {
                        field864[field841++] = var308.field1133;
                        return;
                    }
                    field864[field841++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field864[--field841];
                    field864[field841++] = class164.field2437.method1749(var309, -20230).field1146 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field841 -= 2;
                    int var310 = field864[field841];
                    int var311 = field864[field841 + 1];
                    class184 var312 = class260.field3873.method2676(var311, (byte) -14);
                    if (var312.method1251(-1)) {
                        field855[field863++] = class164.field2437.method1749(var310, -20230).method580(var311, var312.field2714, 0);
                        return;
                    }
                    field864[field841++] = class164.field2437.method1749(var310, -20230).method586(var311, -92, var312.field2717);
                    return;
                }
                if (arg0 == 4209) {
                    field841 -= 2;
                    int var313 = field864[field841];
                    int var314 = field864[field841 + 1] - 1;
                    class81 var315 = class164.field2437.method1749(var313, -20230);
                    if (var315.field1166 == var314) {
                        field864[field841++] = var315.field1117;
                        return;
                    }
                    if (var315.field1129 == var314) {
                        field864[field841++] = var315.field1174;
                        return;
                    }
                    field864[field841++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field855[--field863];
                    int var317 = field864[--field841];
                    class84.method674(var317 == 1, -17916, var316);
                    field864[field841++] = class6.field57;
                    return;
                }
                if (arg0 == 4211) {
                    if (class182.field2706 != null && class153.field2322 < class6.field57) {
                        field864[field841++] = class182.field2706[class153.field2322++] & 0xFFFF;
                        return;
                    }
                    field864[field841++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class153.field2322 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field841 -= 2;
                    int var318 = field864[field841];
                    int var319 = field864[field841 + 1];
                    class184 var320 = class260.field3873.method2676(var319, (byte) -14);
                    if (var320.method1251(-1)) {
                        field855[field863++] = class373.field5641.method774(var318, 98).method1732(var320.field2714, var319, true);
                        return;
                    }
                    field864[field841++] = class373.field5641.method774(var318, -56).method1735(var319, 0, var320.field2717);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field841 -= 2;
                    int var321 = field864[field841];
                    int var322 = field864[field841 + 1];
                    class184 var323 = class260.field3873.method2676(var322, (byte) -14);
                    if (var323.method1251(-1)) {
                        field855[field863++] = class119.field1824.method248(var321, 30).method2899(var322, var323.field2714, -90);
                        return;
                    }
                    field864[field841++] = class119.field1824.method248(var321, 30).method2889(var323.field2717, var322, 0);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field841 -= 2;
                    int var324 = field864[field841];
                    int var325 = field864[field841 + 1];
                    class184 var326 = class260.field3873.method2676(var325, (byte) -14);
                    if (var326.method1251(-1)) {
                        field855[field863++] = class152.field2317.method1453(var324, -11772).method1269(var326.field2714, -57, var325);
                        return;
                    }
                    field864[field841++] = class152.field2317.method1453(var324, -11772).method1274((byte) 46, var325, var326.field2717);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field864[--field841];
                class192 var328 = class159.field2391.method383(var327, 32);
                if (var328.field2842 != null && var328.field2842.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field2838[0];
                    for (int var331 = 1; var331 < var328.field2842.length; var331++) {
                        if (var328.field2838[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field2838[var331];
                        }
                    }
                    field864[field841++] = var328.field2842[var329];
                    return;
                }
                field864[field841++] = var328.field2808;
                return;
            }
        } else {
            class310 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class52.method386(0, field864[--field841]);
            } else {
                var47 = arg1 ? field847 : field859;
            }
            if (arg0 == 1300) {
                int var48 = field864[--field841] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1932(field855[--field863], var48, -56);
                    return;
                }
                field863--;
                return;
            }
            if (arg0 == 1301) {
                field841 -= 2;
                int var49 = field864[field841];
                int var50 = field864[field841 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field4696 = null;
                    return;
                }
                var47.field4696 = class406.method2442((byte) -45, var49, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field864[--field841];
                if (class39.field522 != var51 && class136.field2012 != var51 && class504.field7420 != var51) {
                    return;
                }
                var47.field4653 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field4655 = field864[--field841];
                return;
            }
            if (arg0 == 1304) {
                var47.field4676 = field864[--field841];
                return;
            }
            if (arg0 == 1305) {
                var47.field4738 = field855[--field863];
                return;
            }
            if (arg0 == 1306) {
                var47.field4689 = field855[--field863];
                return;
            }
            if (arg0 == 1307) {
                var47.field4701 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field4792 = field864[--field841];
                var47.field4729 = field864[--field841];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field864[--field841];
                int var53 = field864[--field841];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1935(124, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field4756 = field855[--field863];
                return;
            }
            if (arg0 == 1311) {
                var47.field4691 = field864[--field841];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field841 -= 3;
                    var54 = field864[field841] - 1;
                    var55 = field864[field841 + 1];
                    var56 = field864[field841 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field841 -= 2;
                    var54 = 10;
                    var55 = field864[field841];
                    var56 = field864[field841 + 1];
                }
                if (var47.field4708 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field4708 = new byte[11];
                    var47.field4697 = new byte[11];
                    var47.field4667 = new int[11];
                }
                var47.field4708[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field4682 = false;
                    for (int var57 = 0; var57 < var47.field4708.length; var57++) {
                        if (var47.field4708[var57] != 0) {
                            var47.field4682 = true;
                            break;
                        }
                    }
                } else {
                    var47.field4682 = true;
                }
                var47.field4697[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field4743 = field864[--field841];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lsl;II)V", line = 7817)
    public static final void method453(class456 arg0, int arg1, int arg2) {
        class68 var3 = class272.method1698((byte) -113, arg2, arg0, arg1);
        if (var3 == null) {
            return;
        }
        field854 = new int[var3.field894];
        field849 = new String[var3.field898];
        if (class228.field3214 == var3.field902 || class140.field2114 == var3.field902 || class328.field5129 == var3.field902) {
            int var4 = 0;
            int var5 = 0;
            if (class316.field4886 != null) {
                var4 = class316.field4886.field4671;
                var5 = class316.field4886.field4644;
            }
            field854[0] = class45.field591.method44((byte) 65) - var4;
            field854[1] = class45.field591.method54(28455) - var5;
        }
        method443(var3, 200000);
    }
}
