import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class432 {

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "[I")
    private static int[] field6280 = new int[1000];

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "[[I")
    private static int[][] field6278 = new int[5][5000];

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[Llv;")
    private static class310[] field6283 = new class310[50];

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    private static int field6295 = 0;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    private static int field6282 = 0;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "[I")
    private static int[] field6275 = new int[5];

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "[Ljava/lang/String;")
    private static String[] field6287 = new String[1000];

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    private static int field6290 = 0;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6286 = Calendar.getInstance();

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field6298 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "[I")
    private static int[] field6299 = new int[3];

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "Lhn;")
    public static class509 field6300 = new class509(4);

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    private static int field6301 = 0;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Ljk;")
    private static class450 field6288;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "Ljk;")
    private static class450 field6289;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lic;")
    private static class495 field6276;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "[I")
    private static int[] field6284;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field6274;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loq;II)V")
    public static final void method2650(class242 arg0, int arg1, int arg2) {
        class21 var3 = class335.method1957(arg0, arg2, -1065575868, arg1);
        if (var3 == null) {
            return;
        }
        field6284 = new int[var3.field195];
        field6274 = new String[var3.field192];
        if (class166.field2150 == var3.field201 || class51.field580 == var3.field201 || class59.field688 == var3.field201) {
            int var4 = 0;
            int var5 = 0;
            if (class530.field7772 != null) {
                var4 = class530.field7772.field6601;
                var5 = class530.field7772.field6682;
            }
            field6284[0] = class148.field1951.method349((byte) 111) - var4;
            field6284[1] = class148.field1951.method347(-127) - var5;
        }
        method2652(var3, 200000);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
    private static final void method2651(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6280[field6295++] = class481.field7111;
                return;
            }
            if (arg0 == 5001) {
                field6295 -= 3;
                class481.field7111 = field6280[field6295];
                class81.field986 = class449.method2776(-29410, field6280[field6295 + 1]);
                if (class81.field986 == null) {
                    class81.field986 = class293.field3880;
                }
                class477.field7058 = field6280[field6295 + 2];
                field6292++;
                class492.method2979(class474.field7030, 36);
                class106.field1443.method2449((byte) 120, class481.field7111);
                class106.field1443.method2449((byte) 118, class81.field986.field4389);
                class106.field1443.method2449((byte) 115, class477.field7058);
                return;
            }
            if (arg0 == 5002) {
                field6282 -= 2;
                String var2 = field6287[field6282];
                String var3 = field6287[field6282 + 1];
                field6295 -= 2;
                int var4 = field6280[field6295];
                int var5 = field6280[field6295 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field6296++;
                class492.method2979(class299.field3931, 89);
                class106.field1443.method2449((byte) 121, class424.method2613(1, var2) + class424.method2613(1, var3) + 2);
                class106.field1443.method2415(var2, 21742);
                class106.field1443.method2449((byte) 124, var4 - 1);
                class106.field1443.method2449((byte) 118, var5);
                class106.field1443.method2415(var3, 21742);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field6280[--field6295];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class7.field100[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field6287[field6282++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field6280[--field6295];
                int var9 = -1;
                if (var8 < 100 && class7.field100[var8] != null) {
                    var9 = class394.field5689[var8];
                }
                field6280[field6295++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class81.field986 == null) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = class81.field986.field4389;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field6287[--field6282];
                method2659(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6282 -= 2;
                String var11 = field6287[field6282];
                String var12 = field6287[field6282 + 1];
                if (class509.field7372 != 0 || (!class193.field2495 || class310.field4150) && !class334.field4432) {
                    field6291++;
                    class492.method2979(class49.field550, 86);
                    class106.field1443.method2449((byte) 122, 0);
                    int var13 = class106.field1443.field5729;
                    class106.field1443.method2415(var11, 21742);
                    class168.method987((byte) 46, var12, class106.field1443);
                    class106.field1443.method2403(class106.field1443.field5729 - var13, (byte) -22);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field6280[--field6295];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class127.field1654[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field6287[field6282++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field6280[--field6295];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class115.field1510[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field6287[field6282++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field6280[--field6295];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class317.field4243[var18];
                }
                field6280[field6295++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class96.field1170 == null || class96.field1170.field7832 == null) {
                    var20 = class392.field5663;
                } else {
                    var20 = class96.field1170.method3158(true, 28451);
                }
                field6287[field6282++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field6280[field6295++] = class477.field7058;
                return;
            }
            if (arg0 == 5017) {
                field6280[field6295++] = class140.field1862;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field6280[--field6295];
                int var22 = 0;
                if (var21 < 100 && class7.field100[var21] != null) {
                    var22 = class164.field2146[var21];
                }
                field6280[field6295++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field6280[--field6295];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class440.field6391[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field6287[field6282++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class96.field1170 == null || class96.field1170.field7832 == null) {
                    var25 = class392.field5663;
                } else {
                    var25 = class96.field1170.method3148(false, -1);
                }
                field6287[field6282++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field6280[--field6295];
                field6287[field6282++] = class298.field3924.method1685(0, var26).field3840;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field6280[--field6295];
                class291 var28 = class298.field3924.method1685(0, var27);
                if (var28.field3831 == null) {
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = var28.field3831.length;
                return;
            }
            if (arg0 == 5052) {
                field6295 -= 2;
                int var29 = field6280[field6295];
                int var30 = field6280[field6295 + 1];
                class291 var31 = class298.field3924.method1685(0, var29);
                int var32 = var31.field3831[var30];
                field6280[field6295++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field6280[--field6295];
                class291 var34 = class298.field3924.method1685(0, var33);
                if (var34.field3843 == null) {
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = var34.field3843.length;
                return;
            }
            if (arg0 == 5054) {
                field6295 -= 2;
                int var35 = field6280[field6295];
                int var36 = field6280[field6295 + 1];
                field6280[field6295++] = class298.field3924.method1685(0, var35).field3843[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field6280[--field6295];
                field6287[field6282++] = class253.field3371.method1481(var37, (byte) -128).method2712(-5607);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field6280[--field6295];
                class442 var39 = class253.field3371.method1481(var38, (byte) -94);
                if (var39.field6405 == null) {
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = var39.field6405.length;
                return;
            }
            if (arg0 == 5057) {
                field6295 -= 2;
                int var40 = field6280[field6295];
                int var41 = field6280[field6295 + 1];
                field6280[field6295++] = class253.field3371.method1481(var40, (byte) -118).field6405[var41];
                return;
            }
            if (arg0 == 5058) {
                field6276 = new class495();
                field6276.field7223 = field6280[--field6295];
                field6276.field7229 = class253.field3371.method1481(field6276.field7223, (byte) -128);
                field6276.field7226 = new int[field6276.field7229.method2724(0)];
                return;
            }
            if (arg0 == 5059) {
                field6281++;
                class492.method2979(class22.field205, 28);
                class106.field1443.method2449((byte) 116, 0);
                int var42 = class106.field1443.field5729;
                class106.field1443.method2449((byte) 118, 0);
                class106.field1443.method2444((byte) 65, field6276.field7223);
                field6276.field7229.method2725(field6276.field7226, class106.field1443, (byte) -86);
                class106.field1443.method2403(class106.field1443.field5729 - var42, (byte) -22);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field6287[--field6282];
                field6277++;
                class492.method2979(class205.field2713, 90);
                class106.field1443.method2449((byte) 121, 0);
                int var44 = class106.field1443.field5729;
                class106.field1443.method2415(var43, 21742);
                class106.field1443.method2444((byte) 65, field6276.field7223);
                field6276.field7229.method2725(field6276.field7226, class106.field1443, (byte) -107);
                class106.field1443.method2403(class106.field1443.field5729 - var44, (byte) -22);
                return;
            }
            if (arg0 == 5061) {
                field6281++;
                class492.method2979(class22.field205, 53);
                class106.field1443.method2449((byte) 117, 0);
                int var45 = class106.field1443.field5729;
                class106.field1443.method2449((byte) 116, 1);
                class106.field1443.method2444((byte) 65, field6276.field7223);
                field6276.field7229.method2725(field6276.field7226, class106.field1443, (byte) -88);
                class106.field1443.method2403(class106.field1443.field5729 - var45, (byte) -22);
                return;
            }
            if (arg0 == 5062) {
                field6295 -= 2;
                int var46 = field6280[field6295];
                int var47 = field6280[field6295 + 1];
                field6280[field6295++] = class298.field3924.method1685(0, var46).field3847[var47];
                return;
            }
            if (arg0 == 5063) {
                field6295 -= 2;
                int var48 = field6280[field6295];
                int var49 = field6280[field6295 + 1];
                field6280[field6295++] = class298.field3924.method1685(0, var48).field3834[var49];
                return;
            }
            if (arg0 == 5064) {
                field6295 -= 2;
                int var50 = field6280[field6295];
                int var51 = field6280[field6295 + 1];
                if (var51 == -1) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = class298.field3924.method1685(0, var50).method1744((byte) 32, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field6295 -= 2;
                int var52 = field6280[field6295];
                int var53 = field6280[field6295 + 1];
                if (var53 == -1) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = class298.field3924.method1685(0, var52).method1752((char) var53, 0);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field6280[--field6295];
                field6280[field6295++] = class253.field3371.method1481(var54, (byte) -106).method2724(0);
                return;
            }
            if (arg0 == 5067) {
                field6295 -= 2;
                int var55 = field6280[field6295];
                int var56 = field6280[field6295 + 1];
                int var57 = class253.field3371.method1481(var55, (byte) -124).method2723(var56, 0).field734;
                field6280[field6295++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6295 -= 2;
                int var58 = field6280[field6295];
                int var59 = field6280[field6295 + 1];
                field6276.field7226[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6295 -= 2;
                int var60 = field6280[field6295];
                int var61 = field6280[field6295 + 1];
                field6276.field7226[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6295 -= 3;
                int var62 = field6280[field6295];
                int var63 = field6280[field6295 + 1];
                int var64 = field6280[field6295 + 2];
                class442 var65 = class253.field3371.method1481(var62, (byte) -117);
                if (var65.method2723(var63, 0).field734 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6280[field6295++] = var65.method2726((byte) 55, var64, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field6287[--field6282];
                boolean var67 = field6280[--field6295] == 1;
                class442.method2719(var67, var66, (byte) 58);
                field6280[field6295++] = class530.field7780;
                return;
            }
            if (arg0 == 5072) {
                if (class374.field5076 != null && class474.field7029 < class530.field7780) {
                    field6280[field6295++] = class374.field5076[class474.field7029++] & 0xFFFF;
                    return;
                }
                field6280[field6295++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class474.field7029 = 0;
                return;
            }
            if (arg0 == 5074) {
                field6281++;
                class492.method2979(class22.field205, 43);
                class106.field1443.method2449((byte) 116, 0);
                int var68 = class106.field1443.field5729;
                class106.field1443.method2449((byte) 122, 2);
                class106.field1443.method2444((byte) 65, field6276.field7223);
                field6276.field7229.method2725(field6276.field7226, class106.field1443, (byte) -107);
                class106.field1443.method2403(class106.field1443.field5729 - var68, (byte) -22);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class413.field5893.method1472(28251, 86)) {
                    field6280[field6295++] = 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class413.field5893.method1472(28251, 82)) {
                    field6280[field6295++] = 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class413.field5893.method1472(28251, 81)) {
                    field6280[field6295++] = 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class115.method693(field6280[--field6295], false);
                return;
            }
            if (arg0 == 5201) {
                field6280[field6295++] = class27.method165(-19769);
                return;
            }
            if (arg0 == 5205) {
                class139.method862(4756, field6280[--field6295], -1, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field6280[--field6295];
                class395 var70 = class416.method2574(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = var70.field5698;
                return;
            }
            if (arg0 == 5207) {
                class395 var71 = class416.method2558(field6280[--field6295]);
                if (var71 != null && var71.field5709 != null) {
                    field6287[field6282++] = var71.field5709;
                    return;
                }
                field6287[field6282++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6280[field6295++] = class173.field2222;
                field6280[field6295++] = class139.field1859;
                return;
            }
            if (arg0 == 5209) {
                field6280[field6295++] = class49.field556 + class416.field6009;
                field6280[field6295++] = class416.field6020 + class163.field2133;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field6280[--field6295];
                class395 var73 = class416.method2558(var72);
                if (var73 == null) {
                    field6280[field6295++] = 0;
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = var73.field5708 >> 14 & 0x3FFF;
                field6280[field6295++] = var73.field5708 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field6280[--field6295];
                class395 var75 = class416.method2558(var74);
                if (var75 == null) {
                    field6280[field6295++] = 0;
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = var75.field5712 - var75.field5713;
                field6280[field6295++] = var75.field5711 - var75.field5704;
                return;
            }
            if (arg0 == 5212) {
                class519 var76 = class162.method955(-78);
                if (var76 == null) {
                    field6280[field6295++] = -1;
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = var76.field7646;
                int var77 = var76.field7647 << 28 | class416.field6009 + var76.field7651 << 14 | class416.field6020 + var76.field7648;
                field6280[field6295++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class519 var78 = class316.method1879(false);
                if (var78 == null) {
                    field6280[field6295++] = -1;
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = var78.field7646;
                int var79 = var78.field7647 << 28 | class416.field6009 + var78.field7651 << 14 | class416.field6020 + var78.field7648;
                field6280[field6295++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field6280[--field6295];
                class395 var81 = class292.method1756((byte) -34);
                if (var81 != null) {
                    boolean var82 = var81.method2375(var80 >> 28 & 0x3, 37, var80 & 0x3FFF, field6299, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class484.method2947((byte) 114, field6299[2], field6299[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6295 -= 2;
                int var83 = field6280[field6295];
                int var84 = field6280[field6295 + 1];
                class330 var85 = class416.method2572(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class395 var87 = (class395) var85.method1937(false); var87 != null; var87 = (class395) var85.method1932(-2)) {
                    if (var87.field5698 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field6280[field6295++] = 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field6280[--field6295];
                class395 var89 = class416.method2558(var88);
                if (var89 == null) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = var89.field5703;
                return;
            }
            if (arg0 == 5220) {
                field6280[field6295++] = class181.field2356 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field6280[--field6295];
                class484.method2947((byte) -124, var90 & 0x3FFF, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class395 var91 = class292.method1756((byte) -34);
                if (var91 != null) {
                    boolean var92 = var91.method2378(class416.field6020 + class163.field2133, -30335, field6299, class49.field556 + class416.field6009);
                    if (var92) {
                        field6280[field6295++] = field6299[1];
                        field6280[field6295++] = field6299[2];
                        return;
                    }
                    field6280[field6295++] = -1;
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = -1;
                field6280[field6295++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6295 -= 2;
                int var93 = field6280[field6295];
                int var94 = field6280[field6295 + 1];
                class139.method862(4756, var93, var94 & 0x3FFF, false, var94 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field6280[--field6295];
                class395 var96 = class292.method1756((byte) -34);
                if (var96 != null) {
                    boolean var97 = var96.method2375(var95 >> 28 & 0x3, 30, var95 & 0x3FFF, field6299, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field6280[field6295++] = field6299[1];
                        field6280[field6295++] = field6299[2];
                        return;
                    }
                    field6280[field6295++] = -1;
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = -1;
                field6280[field6295++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field6280[--field6295];
                class395 var99 = class292.method1756((byte) -34);
                if (var99 != null) {
                    boolean var100 = var99.method2378(var98 & 0x3FFF, -30335, field6299, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field6280[field6295++] = field6299[1];
                        field6280[field6295++] = field6299[2];
                        return;
                    }
                    field6280[field6295++] = -1;
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = -1;
                field6280[field6295++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class196.method1123((byte) 105, field6280[--field6295]);
                return;
            }
            if (arg0 == 5227) {
                field6295 -= 2;
                int var101 = field6280[field6295];
                int var102 = field6280[field6295 + 1];
                class139.method862(4756, var101, var102 & 0x3FFF, true, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class533.field7848 = field6280[--field6295] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6280[field6295++] = class533.field7848 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field6280[--field6295];
                class94.method528(var103, -1);
                return;
            }
            if (arg0 == 5231) {
                field6295 -= 2;
                int var104 = field6280[field6295];
                boolean var105 = field6280[field6295 + 1] == 1;
                if (class435.field6351 != null) {
                    class435 var106 = class435.field6351.method295((long) var104, -111);
                    if (var106 != null && !var105) {
                        var106.method2674(true);
                        return;
                    }
                    if (var106 == null && var105) {
                        class435 var107 = new class435();
                        class435.field6351.method291((long) var104, var107, -35);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field6280[--field6295];
                if (class435.field6351 != null) {
                    class435 var109 = class435.field6351.method295((long) var108, -109);
                    field6280[field6295++] = var109 == null ? 0 : 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6295 -= 2;
                int var110 = field6280[field6295];
                boolean var111 = field6280[field6295 + 1] == 1;
                if (class419.field6085 != null) {
                    class435 var112 = class419.field6085.method295((long) var110, -123);
                    if (var112 != null && !var111) {
                        var112.method2674(true);
                        return;
                    }
                    if (var112 == null && var111) {
                        class435 var113 = new class435();
                        class419.field6085.method291((long) var110, var113, -121);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field6280[--field6295];
                if (class419.field6085 != null) {
                    class435 var115 = class419.field6085.method295((long) var114, -128);
                    field6280[field6295++] = var115 == null ? 0 : 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6280[field6295++] = class416.field5983 == null ? -1 : class416.field5983.field5698;
                return;
            }
            if (arg0 == 5236) {
                field6295 -= 2;
                int var116 = field6280[field6295];
                int var117 = field6280[field6295 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class513.method3064(true, var118, var116, var119);
                if (var120 < 0) {
                    field6280[field6295++] = -1;
                    return;
                }
                field6280[field6295++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class91.method505((byte) 123);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6295 -= 2;
                int var121 = field6280[field6295];
                int var122 = field6280[field6295 + 1];
                class163.method957(var121, 3, false, var122, false);
                field6280[field6295++] = class119.field1559 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class119.field1559 != null) {
                    class163.method957(-1, class319.field4256.field4675, false, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class459[] var123 = class357.method2119((byte) -124);
                field6280[field6295++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field6280[--field6295];
                class459[] var125 = class357.method2119((byte) -127);
                field6280[field6295++] = var125[var124].field6842;
                field6280[field6295++] = var125[var124].field6845;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class319.field4256.field4656;
                int var127 = class319.field4256.field4649;
                int var128 = -1;
                class459[] var129 = class357.method2119((byte) -128);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class459 var131 = var129[var130];
                    if (var131.field6842 == var126 && var131.field6845 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field6280[field6295++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field6280[field6295++] = class423.method2612(2);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field6280[--field6295];
                if (var132 >= 1 && var132 <= 2) {
                    class163.method957(-1, var132, false, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6280[field6295++] = class319.field4256.field4675;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field6280[--field6295];
                if (var133 >= 1 && var133 <= 2) {
                    class319.field4256.field4675 = var133;
                    class319.field4256.method1743(class381.field5518, (byte) 119);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6282 -= 2;
                String var134 = field6287[field6282];
                String var135 = field6287[field6282 + 1];
                int var136 = field6280[--field6295];
                field6279++;
                class492.method2979(class153.field2008, 43);
                class106.field1443.method2449((byte) 115, class424.method2613(1, var134) + class424.method2613(1, var135) + 1);
                class106.field1443.method2415(var134, 21742);
                class106.field1443.method2415(var135, 21742);
                class106.field1443.method2449((byte) 120, var136);
                return;
            }
            if (arg0 == 5401) {
                field6295 -= 2;
                class462.field6891[field6280[field6295]] = (short) class227.method1456(field6280[field6295 + 1], -101);
                class237.field3158.method234(126);
                class237.field3158.method232(36);
                class87.field1032.method1674((byte) -128);
                class104.method628(-101);
                return;
            }
            if (arg0 == 5405) {
                field6295 -= 2;
                int var137 = field6280[field6295];
                int var138 = field6280[field6295 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class320.field4271[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6295 -= 7;
                int var139 = field6280[field6295];
                int var140 = field6280[field6295 + 1] << 1;
                int var141 = field6280[field6295 + 2];
                int var142 = field6280[field6295 + 3];
                int var143 = field6280[field6295 + 4];
                int var144 = field6280[field6295 + 5];
                int var145 = field6280[field6295 + 6];
                if (var139 >= 0 && var139 < 2 && class320.field4271[var139] != null && var140 >= 0 && var140 < class320.field4271[var139].length) {
                    class320.field4271[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class320.field4271[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class320.field4271[field6280[--field6295]].length >> 1;
                field6280[field6295++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class119.field1559 != null) {
                    class163.method957(-1, class319.field4256.field4675, false, -1, false);
                }
                if (class173.field2224 != null) {
                    class365.method2173(45);
                    System.exit(0);
                    return;
                }
                String var147 = class373.field5060 == null ? class245.method1522(true) : class373.field5060;
                class58.method346(class20.field183 == 1, var147, false, 3, class381.field5518);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class263.field3525 != null) {
                    if (class263.field3525.field3151 == null) {
                        var148 = class472.method2876(1165, class263.field3525.field3148);
                    } else {
                        var148 = (String) class263.field3525.field3151;
                    }
                }
                field6287[field6282++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field6280[field6295++] = class137.field1839 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class119.field1559 != null) {
                    class163.method957(-1, class319.field4256.field4675, false, -1, false);
                }
                String var149 = field6287[--field6282];
                boolean var150 = field6280[--field6295] == 1;
                String var151 = class245.method1522(true) + var149;
                class58.method346(class20.field183 == 1, var151, var150, 3, class381.field5518);
                return;
            }
            if (arg0 == 5422) {
                field6282 -= 2;
                String var152 = field6287[field6282];
                String var153 = field6287[field6282 + 1];
                int var154 = field6280[--field6295];
                if (var152.length() > 0) {
                    if (class32.field331 == null) {
                        class32.field331 = new String[class386.field5618[class381.field5520.field1407]];
                    }
                    class32.field331[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class131.field1739 == null) {
                        class131.field1739 = new String[class386.field5618[class381.field5520.field1407]];
                    }
                    class131.field1739[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6287[--field6282]);
                return;
            }
            if (arg0 == 5424) {
                field6295 -= 11;
                class394.field5691 = field6280[field6295];
                class364.field4972 = field6280[field6295 + 1];
                class53.field620 = field6280[field6295 + 2];
                class50.field579 = field6280[field6295 + 3];
                class443.field6455 = field6280[field6295 + 4];
                class347.field4631 = field6280[field6295 + 5];
                class374.field5073 = field6280[field6295 + 6];
                class463.field6902 = field6280[field6295 + 7];
                class510.field7422 = field6280[field6295 + 8];
                class502.field7327 = field6280[field6295 + 9];
                class531.field7822 = field6280[field6295 + 10];
                class282.field3733.method2133(0, class443.field6455);
                class282.field3733.method2133(0, class347.field4631);
                class282.field3733.method2133(0, class374.field5073);
                class282.field3733.method2133(0, class463.field6902);
                class282.field3733.method2133(0, class510.field7422);
                class174.field2239 = null;
                class507.field7347 = null;
                class117.field1535 = null;
                class95.field1144 = null;
                class380.field5512 = null;
                class65.field753 = null;
                class34.field343 = null;
                class522.field7672 = null;
                class144.field1922 = true;
                return;
            }
            if (arg0 == 5425) {
                class531.method3157(true);
                class144.field1922 = false;
                return;
            }
            if (arg0 == 5426) {
                field6295 -= 2;
                class176.field2274 = field6280[field6295];
                class105.field1416 = field6280[field6295 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6295 -= 2;
                class300.field3942 = field6280[field6295 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6295 -= 2;
                int var155 = field6280[field6295];
                int var156 = field6280[field6295 + 1];
                field6280[field6295++] = class237.method1491(var156, false, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class74.method431(false, -98, field6287[--field6282], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class400.method2475(class381.field5518.field1828, -89, "accountcreated");
                    return;
                } catch (Throwable var277) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6295 -= 4;
                int var157 = field6280[field6295];
                int var158 = field6280[field6295 + 1];
                int var159 = field6280[field6295 + 2];
                int var160 = field6280[field6295 + 3];
                class217.method1379((var157 & 0x3FFF) - class418.field6074, var159, true, false, (var157 >> 14 & 0x3FFF) - class357.field4867, var160, var158);
                return;
            }
            if (arg0 == 5501) {
                field6295 -= 4;
                int var161 = field6280[field6295];
                int var162 = field6280[field6295 + 1];
                int var163 = field6280[field6295 + 2];
                int var164 = field6280[field6295 + 3];
                class429.method2641((var161 & 0x3FFF) - class418.field6074, var164, (var161 >> 14 & 0x3FFF) - class357.field4867, false, var162, var163);
                return;
            }
            if (arg0 == 5502) {
                field6295 -= 6;
                int var165 = field6280[field6295];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class352.field4700 = var165;
                int var166 = field6280[field6295 + 1];
                if (var166 + 1 >= class320.field4271[class352.field4700].length >> 1) {
                    throw new RuntimeException();
                }
                class328.field4361 = var166;
                class130.field1675 = 0;
                class525.field7731 = field6280[field6295 + 2];
                class319.field4260 = field6280[field6295 + 3];
                int var167 = field6280[field6295 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class117.field1530 = var167;
                int var168 = field6280[field6295 + 5];
                if (var168 + 1 >= class320.field4271[class117.field1530].length >> 1) {
                    throw new RuntimeException();
                }
                class408.field5855 = var168;
                class47.field491 = 3;
                return;
            }
            if (arg0 == 5503) {
                class380.method2322((byte) 126);
                return;
            }
            if (arg0 == 5504) {
                field6295 -= 2;
                class387.method2351(field6280[field6295], field6280[field6295 + 1], 0, -128);
                return;
            }
            if (arg0 == 5505) {
                field6280[field6295++] = (int) class199.field2650 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6280[field6295++] = (int) class143.field1907 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class237.method1492((byte) 116);
                return;
            }
            if (arg0 == 5508) {
                class434.method2670(1);
                return;
            }
            if (arg0 == 5509) {
                class173.method1015((byte) 40);
                return;
            }
            if (arg0 == 5510) {
                class88.method490((byte) 66);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field6280[--field6295];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class357.field4867;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class308.field4128) {
                    var172 = class308.field4128;
                }
                int var173 = var171 - class418.field6074;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class426.field6200) {
                    var173 = class426.field6200;
                }
                class200.field2665 = (var172 << 7) + 64;
                class299.field3936 = (var173 << 7) + 64;
                class47.field491 = 4;
                return;
            }
            if (arg0 == 5512) {
                class398.method2454((byte) -50);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6282 -= 2;
                String var174 = field6287[field6282];
                String var175 = field6287[field6282 + 1];
                int var176 = field6280[--field6295];
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    class392.field5663 = var174;
                    class516.field7509 = var175;
                    class47.field493 = var176;
                    class57.method345(1, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class419.method2592((byte) 57);
                return;
            }
            if (arg0 == 5602) {
                if (class328.field4360 == 0) {
                    class130.field1681 = -2;
                    class254.field3378 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6295 -= 4;
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    class88.method485(field6280[field6295], field6280[field6295 + 3], false, field6280[field6295 + 2], field6280[field6295 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field6282--;
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    class445.method2750(class408.method2501(field6287[field6282], 57), (byte) 127);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6282 -= 2;
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    class443.method2742(false, (byte) 4, class408.method2501(field6287[field6282], 57), field6287[field6282 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class114.field1497 == 0) {
                    class173.field2226 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6280[field6295++] = class254.field3378;
                return;
            }
            if (arg0 == 5608) {
                field6280[field6295++] = class352.field4701;
                return;
            }
            if (arg0 == 5609) {
                field6280[field6295++] = class173.field2226;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field6287[field6282++] = class70.field828.length > var177 ? class207.method1309(true, class70.field828[var177]) : "";
                }
                class70.field828 = null;
                return;
            }
            if (arg0 == 5611) {
                field6280[field6295++] = class33.field341;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field6280[--field6295];
                if (class527.field7734 != 6) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    if (class446.field6499 != null) {
                        class446.field6499.method2625(true);
                        class446.field6499 = null;
                    }
                    class47.field493 = var178;
                    class57.method345(1, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field6280[field6295++] = class254.field3378;
                return;
            }
            if (arg0 == 5615) {
                field6282 -= 2;
                String var179 = field6287[field6282];
                String var180 = field6287[field6282 + 1];
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    if (class446.field6499 != null) {
                        class446.field6499.method2625(true);
                        class446.field6499 = null;
                    }
                    class392.field5663 = var179;
                    class516.field7509 = var180;
                    class57.method345(1, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class321.method1900(false, -20147);
                return;
            }
            if (arg0 == 5617) {
                field6280[field6295++] = class130.field1681;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field6280[--field6295];
                class109.method674(97, var181, false);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field6280[--field6295];
                class109.method674(108, var182, true);
                return;
            }
            if (arg0 == 5620) {
                class442.method2714(true);
                if (class524.field7707 != "" && class524.field7707 != "") {
                    field6280[field6295++] = 1;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field6282 -= 2;
                if (class527.field7734 != 2) {
                    return;
                }
                if (class328.field4360 == 0 && class114.field1497 == 0) {
                    class443.method2742(true, (byte) 4, class408.method2501(field6287[field6282], 57), field6287[field6282 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class236 var183 = class381.field5518.method850("3", false, true);
                while (var183.field3149 == 0) {
                    class316.method1873(1L, false);
                }
                if (var183.field3149 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class86 var184 = (class86) var183.field3151;
                if (var184.method470(-1).exists()) {
                    class396 var185 = new class396(50);
                    try {
                        var184.method469(0, 50, 23609, var185.field5761);
                    } catch (IOException var279) {
                    }
                }
                try {
                    var184.method472(-29827);
                    return;
                } catch (Exception var278) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field6280[--field6295];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class319.field4256.field4667 = var186;
                class235.method1489(119);
                class319.field4256.method1743(class381.field5518, (byte) 94);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6002) {
                class319.field4256.method1740(field6280[--field6295] == 1, 118);
                class235.method1489(106);
                class397.method2452(0);
                class319.field4256.method1743(class381.field5518, (byte) -22);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6003) {
                class319.field4256.field4682 = field6280[--field6295] == 1;
                class397.method2452(0);
                class319.field4256.method1743(class381.field5518, (byte) 93);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6005) {
                class319.field4256.field4687 = field6280[--field6295] == 1;
                class235.method1489(123);
                class319.field4256.method1743(class381.field5518, (byte) -84);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6006) {
                class319.field4256.field4659 = field6280[--field6295] == 1;
                class343.field4596.method1166(!class319.field4256.field4659);
                class319.field4256.method1743(class381.field5518, (byte) -110);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6007) {
                class319.field4256.field4666 = field6280[--field6295];
                class319.field4256.method1743(class381.field5518, (byte) 83);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6008) {
                class319.field4256.field4663 = field6280[--field6295] == 1;
                class319.field4256.method1743(class381.field5518, (byte) -26);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6009) {
                class319.field4256.field4676 = field6280[--field6295] == 1;
                class235.method1489(114);
                class319.field4256.method1743(class381.field5518, (byte) 102);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6010) {
                class319.field4256.field4669 = field6280[--field6295] == 1;
                class319.field4256.method1743(class381.field5518, (byte) -77);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field6280[--field6295];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class319.field4256.method2060(class20.field183, var187, (byte) -113);
                class235.method1489(106);
                class319.field4256.method1743(class381.field5518, (byte) -97);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6012) {
                class319.field4256.method2059(class20.field183, field6280[--field6295] == 1, (byte) 109);
                class245.method1521(16);
                class451.method2797((byte) 47);
                class319.field4256.method1743(class381.field5518, (byte) 110);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6014) {
                class319.field4256.field4665 = field6280[--field6295] == 1;
                class235.method1489(113);
                class319.field4256.method1743(class381.field5518, (byte) 111);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6015) {
                class319.field4256.field4653 = field6280[--field6295] == 1;
                class235.method1489(97);
                class319.field4256.method1743(class381.field5518, (byte) -89);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field6280[--field6295];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class319.field4256.field4654 = var188;
                class142.method874(class20.field183, (byte) -25);
                class319.field4256.method1743(class381.field5518, (byte) 117);
                return;
            }
            if (arg0 == 6017) {
                class319.field4256.field4670 = field6280[--field6295] == 1;
                class110.method677((byte) 94);
                class319.field4256.method1743(class381.field5518, (byte) 106);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field6280[--field6295];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class319.field4256.field4652 = var189;
                class319.field4256.method1743(class381.field5518, (byte) -65);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field6280[--field6295];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class319.field4256.field4655 != var190) {
                    if (class319.field4256.field4655 == 0 && class43.field460 != -1) {
                        class525.method3124(false, 1, class43.field460, 0, class96.field1214, var190);
                        class401.field5809 = false;
                    } else if (var190 == 0) {
                        class462.method2837(1);
                        class401.field5809 = false;
                    } else {
                        class418.method2584(244, var190);
                    }
                    class319.field4256.field4655 = var190;
                }
                class319.field4256.method1743(class381.field5518, (byte) 111);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field6280[--field6295];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class319.field4256.field4650 = var191;
                class319.field4256.method1743(class381.field5518, (byte) -68);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6021) {
                class319.field4256.field3821 = field6280[--field6295] == 1;
                class397.method2452(0);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field6280[--field6295];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class164.field2144 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class468.method2852(-1, var192);
                class319.field4256.method1743(class381.field5518, (byte) 92);
                class435.field6347 = false;
                field6280[field6295++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field6280[--field6295];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class319.field4256.field4674 = var194;
                class319.field4256.method1743(class381.field5518, (byte) 87);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field6280[--field6295];
                if (var195 < 0 || var195 > class387.method2350(class164.field2144, -16900)) {
                    var195 = 0;
                }
                class319.field4256.field4657 = var195;
                class319.field4256.method1743(class381.field5518, (byte) -110);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field6280[--field6295];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class106.method649(var196 == 1, (byte) -112);
                return;
            }
            if (arg0 == 6028) {
                class319.field4256.field4678 = field6280[--field6295] != 0;
                class319.field4256.method1743(class381.field5518, (byte) -127);
                return;
            }
            if (arg0 == 6029) {
                class319.field4256.field4666 = field6280[--field6295];
                class319.field4256.method1743(class381.field5518, (byte) 120);
                return;
            }
            if (arg0 == 6030) {
                class319.field4256.field4684 = field6280[--field6295] != 0;
                class319.field4256.method1743(class381.field5518, (byte) -22);
                class235.method1489(126);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field6280[--field6295];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class142.method874(var197, (byte) -25);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field6280[--field6295];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class319.field4256.field4648 = var198;
                class319.field4256.method1743(class381.field5518, (byte) 94);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field6280[--field6295];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class319.field4256.field4686 = var199;
                class319.field4256.method1743(class381.field5518, (byte) -33);
                return;
            }
            if (arg0 == 6034) {
                class319.field4256.field4671 = field6280[--field6295] == 1;
                class319.field4256.method1743(class381.field5518, (byte) 93);
                class245.method1521(16);
                class435.field6347 = false;
                return;
            }
            if (arg0 == 6035) {
                class319.field4256.field3827 = field6280[--field6295] == 1;
                class235.method1489(101);
                class397.method2452(0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6280[field6295++] = class319.field4256.field4667;
                return;
            }
            if (arg0 == 6102) {
                field6280[field6295++] = class319.field4256.method1742(class20.field183, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6280[field6295++] = class319.field4256.field4682 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6280[field6295++] = class319.field4256.field4687 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field6280[field6295++] = class319.field4256.field4659 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6280[field6295++] = class319.field4256.field4666;
                return;
            }
            if (arg0 == 6108) {
                field6280[field6295++] = class319.field4256.field4663 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field6280[field6295++] = class319.field4256.field4676 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6280[field6295++] = class319.field4256.field4669 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6280[field6295++] = class319.field4256.method2058(class20.field183, 1);
                return;
            }
            if (arg0 == 6112) {
                field6280[field6295++] = class319.field4256.method2061((byte) 124, class20.field183) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6280[field6295++] = class319.field4256.field4665 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6280[field6295++] = class319.field4256.field4653 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6280[field6295++] = class319.field4256.field4654;
                return;
            }
            if (arg0 == 6117) {
                field6280[field6295++] = class319.field4256.field4670 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6280[field6295++] = class319.field4256.field4652;
                return;
            }
            if (arg0 == 6119) {
                field6280[field6295++] = class319.field4256.field4655;
                return;
            }
            if (arg0 == 6120) {
                field6280[field6295++] = class319.field4256.field4650;
                return;
            }
            if (arg0 == 6121) {
                field6280[field6295++] = class343.field4596.method1235() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field6280[field6295++] = class310.method1850(true);
                return;
            }
            if (arg0 == 6124) {
                field6280[field6295++] = class319.field4256.field4674;
                return;
            }
            if (arg0 == 6125) {
                field6280[field6295++] = class319.field4256.field4657;
                return;
            }
            if (arg0 == 6126) {
                field6280[field6295++] = class343.field4596.method1135() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field6280[field6295++] = class319.field4256.field4685 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6280[field6295++] = class319.field4256.field4678 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6280[field6295++] = class319.field4256.field4666;
                return;
            }
            if (arg0 == 6130) {
                field6280[field6295++] = class319.field4256.field4684 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6280[field6295++] = class20.field183;
                return;
            }
            if (arg0 == 6132) {
                field6280[field6295++] = class319.field4256.field4648;
                return;
            }
            if (arg0 == 6133) {
                field6280[field6295++] = class137.field1839 == 1 || class137.field1839 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field6280[field6295++] = class387.method2350(class164.field2144, -16900);
                return;
            }
            if (arg0 == 6135) {
                field6280[field6295++] = class319.field4256.field4686;
                return;
            }
            if (arg0 == 6136) {
                field6280[field6295++] = class319.field4256.field4671 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var280) {
                }
                field6280[field6295++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6295 -= 2;
                class479.field7101 = (short) field6280[field6295];
                if (class479.field7101 <= 0) {
                    class479.field7101 = 256;
                }
                class458.field6835 = (short) field6280[field6295 + 1];
                if (class458.field6835 <= 0) {
                    class458.field6835 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6295 -= 2;
                class337.field4461 = (short) field6280[field6295];
                if (class337.field4461 <= 0) {
                    class337.field4461 = 256;
                }
                class511.field7458 = (short) field6280[field6295 + 1];
                if (class511.field7458 <= 0) {
                    class511.field7458 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6295 -= 4;
                class258.field3449 = (short) field6280[field6295];
                if (class258.field3449 <= 0) {
                    class258.field3449 = 1;
                }
                class470.field6979 = (short) field6280[field6295 + 1];
                if (class470.field6979 <= 0) {
                    class470.field6979 = 32767;
                } else if (class470.field6979 < class258.field3449) {
                    class470.field6979 = class258.field3449;
                }
                class316.field4231 = (short) field6280[field6295 + 2];
                if (class316.field4231 <= 0) {
                    class316.field4231 = 1;
                }
                class365.field4986 = (short) field6280[field6295 + 3];
                if (class365.field4986 <= 0) {
                    class365.field4986 = 32767;
                    return;
                }
                if (class365.field4986 < class316.field4231) {
                    class365.field4986 = class316.field4231;
                }
                return;
            }
            if (arg0 == 6203) {
                class272.method1658(class502.field7324.field6573, false, class502.field7324.field6612, 0, 0, true);
                field6280[field6295++] = class444.field6461;
                field6280[field6295++] = class527.field7739;
                return;
            }
            if (arg0 == 6204) {
                field6280[field6295++] = class337.field4461;
                field6280[field6295++] = class511.field7458;
                return;
            }
            if (arg0 == 6205) {
                field6280[field6295++] = class479.field7101;
                field6280[field6295++] = class458.field6835;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6280[field6295++] = (int) (class45.method252((byte) -8) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6280[field6295++] = (int) (class45.method252((byte) -8) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6295 -= 3;
                int var201 = field6280[field6295];
                int var202 = field6280[field6295 + 1];
                int var203 = field6280[field6295 + 2];
                field6286.clear();
                field6286.set(11, 12);
                field6286.set(var203, var202, var201);
                field6280[field6295++] = (int) (field6286.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field6286.clear();
                field6286.setTime(new Date(class45.method252((byte) -8)));
                field6280[field6295++] = field6286.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var204 = field6280[--field6295];
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
                field6280[field6295++] = var205 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6280[field6295++] = class173.method1016((byte) 122) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6280[field6295++] = class532.method3163(-18) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class527.field7734 == 6 && class328.field4360 == 0 && class114.field1497 == 0) {
                    if (class192.field2468) {
                        field6280[field6295++] = 0;
                        return;
                    }
                    if (class65.field742 > class45.method252((byte) -8) - 1000L) {
                        field6280[field6295++] = 1;
                        return;
                    }
                    class192.field2468 = true;
                    class492.method2979(class216.field2948, 22);
                    class106.field1443.method2398(127, class514.field7480);
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class54 var206 = class97.method560(false);
                if (var206 != null) {
                    field6280[field6295++] = var206.field627;
                    field6280[field6295++] = var206.field7096;
                    field6287[field6282++] = var206.field626;
                    class151 var207 = var206.method321(-26);
                    field6280[field6295++] = var207.field1980;
                    field6287[field6282++] = var207.field1972;
                    field6280[field6295++] = var206.field7100;
                    field6280[field6295++] = var206.field628;
                    field6287[field6282++] = var206.field629;
                    return;
                }
                field6280[field6295++] = -1;
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                return;
            }
            if (arg0 == 6502) {
                class54 var208 = class362.method2159(103);
                if (var208 != null) {
                    field6280[field6295++] = var208.field627;
                    field6280[field6295++] = var208.field7096;
                    field6287[field6282++] = var208.field626;
                    class151 var209 = var208.method321(-37);
                    field6280[field6295++] = var209.field1980;
                    field6287[field6282++] = var209.field1972;
                    field6280[field6295++] = var208.field7100;
                    field6280[field6295++] = var208.field628;
                    field6287[field6282++] = var208.field629;
                    return;
                }
                field6280[field6295++] = -1;
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var210 = field6280[--field6295];
                String var211 = field6287[--field6282];
                if (class527.field7734 == 6 && class328.field4360 == 0 && class114.field1497 == 0) {
                    field6280[field6295++] = class89.method494((byte) -72, var210, var211) ? 1 : 0;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class319.field4256.field4679 = field6280[--field6295];
                class319.field4256.method1743(class381.field5518, (byte) 103);
                return;
            }
            if (arg0 == 6505) {
                field6280[field6295++] = class319.field4256.field4679;
                return;
            }
            if (arg0 == 6506) {
                int var212 = field6280[--field6295];
                class54 var213 = class63.method380(var212, (byte) -52);
                if (var213 != null) {
                    field6280[field6295++] = var213.field7096;
                    field6287[field6282++] = var213.field626;
                    class151 var214 = var213.method321(-49);
                    field6280[field6295++] = var214.field1980;
                    field6287[field6282++] = var214.field1972;
                    field6280[field6295++] = var213.field7100;
                    field6280[field6295++] = var213.field628;
                    field6287[field6282++] = var213.field629;
                    return;
                }
                field6280[field6295++] = -1;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                field6280[field6295++] = 0;
                field6280[field6295++] = 0;
                field6287[field6282++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6295 -= 4;
                int var215 = field6280[field6295];
                boolean var216 = field6280[field6295 + 1] == 1;
                int var217 = field6280[field6295 + 2];
                boolean var218 = field6280[field6295 + 3] == 1;
                class60.method360((byte) -110, var215, var216, var218, var217);
                return;
            }
            if (arg0 == 6508) {
                class1.method2(-71);
                return;
            }
            if (arg0 == 6509) {
                if (class527.field7734 != 6) {
                    return;
                }
                class188.field2430 = field6280[--field6295] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class319.field4256.field4651 = field6280[--field6295] == 1;
                class319.field4256.method1743(class381.field5518, (byte) -27);
                return;
            }
            if (arg0 == 6601) {
                field6280[field6295++] = class319.field4256.field4651 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class512.field7464 == class492.field7204) {
            if (arg0 == 6700) {
                int var219 = class152.field1989.method298(0);
                if (class168.field2174 != -1) {
                    var219++;
                }
                field6280[field6295++] = var219;
                return;
            }
            if (arg0 == 6701) {
                int var220 = field6280[--field6295];
                if (class168.field2174 != -1) {
                    if (var220 == 0) {
                        field6280[field6295++] = class168.field2174;
                        return;
                    }
                    var220--;
                }
                class360 var221 = (class360) class152.field1989.method300((byte) -103);
                while (var220-- > 0) {
                    var221 = (class360) class152.field1989.method301(-113);
                }
                field6280[field6295++] = var221.field4886;
                return;
            }
            if (arg0 == 6702) {
                int var222 = field6280[--field6295];
                if (class339.field4491[var222] == null) {
                    field6287[field6282++] = "";
                    return;
                }
                String var223 = class339.field4491[var222][0].field6566;
                if (var223 == null) {
                    field6287[field6282++] = "";
                    return;
                }
                field6287[field6282++] = var223.substring(0, var223.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var224 = field6280[--field6295];
                if (class339.field4491[var224] == null) {
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = class339.field4491[var224].length;
                return;
            }
            if (arg0 == 6704) {
                field6295 -= 2;
                int var225 = field6280[field6295];
                int var226 = field6280[field6295 + 1];
                if (class339.field4491[var225] == null) {
                    field6287[field6282++] = "";
                    return;
                }
                String var227 = class339.field4491[var225][var226].field6566;
                if (var227 == null) {
                    field6287[field6282++] = "";
                    return;
                }
                field6287[field6282++] = var227;
                return;
            }
            if (arg0 == 6705) {
                field6295 -= 2;
                int var228 = field6280[field6295];
                int var229 = field6280[field6295 + 1];
                if (class339.field4491[var228] == null) {
                    field6280[field6295++] = 0;
                    return;
                }
                field6280[field6295++] = class339.field4491[var228][var229].field6588;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6295 -= 3;
                int var230 = field6280[field6295];
                int var231 = field6280[field6295 + 1];
                int var232 = field6280[field6295 + 2];
                class531.method3147("", 27818, 1, var230 << 16 | var231, var232);
                return;
            }
            if (arg0 == 6708) {
                field6295 -= 3;
                int var233 = field6280[field6295];
                int var234 = field6280[field6295 + 1];
                int var235 = field6280[field6295 + 2];
                class531.method3147("", 27818, 2, var233 << 16 | var234, var235);
                return;
            }
            if (arg0 == 6709) {
                field6295 -= 3;
                int var236 = field6280[field6295];
                int var237 = field6280[field6295 + 1];
                int var238 = field6280[field6295 + 2];
                class531.method3147("", 27818, 3, var236 << 16 | var237, var238);
                return;
            }
            if (arg0 == 6710) {
                field6295 -= 3;
                int var239 = field6280[field6295];
                int var240 = field6280[field6295 + 1];
                int var241 = field6280[field6295 + 2];
                class531.method3147("", 27818, 4, var239 << 16 | var240, var241);
                return;
            }
            if (arg0 == 6711) {
                field6295 -= 3;
                int var242 = field6280[field6295];
                int var243 = field6280[field6295 + 1];
                int var244 = field6280[field6295 + 2];
                class531.method3147("", 27818, 5, var242 << 16 | var243, var244);
                return;
            }
            if (arg0 == 6712) {
                field6295 -= 3;
                int var245 = field6280[field6295];
                int var246 = field6280[field6295 + 1];
                int var247 = field6280[field6295 + 2];
                class531.method3147("", 27818, 6, var245 << 16 | var246, var247);
                return;
            }
            if (arg0 == 6713) {
                field6295 -= 3;
                int var248 = field6280[field6295];
                int var249 = field6280[field6295 + 1];
                int var250 = field6280[field6295 + 2];
                class531.method3147("", 27818, 7, var248 << 16 | var249, var250);
                return;
            }
            if (arg0 == 6714) {
                field6295 -= 3;
                int var251 = field6280[field6295];
                int var252 = field6280[field6295 + 1];
                int var253 = field6280[field6295 + 2];
                class531.method3147("", 27818, 8, var251 << 16 | var252, var253);
                return;
            }
            if (arg0 == 6715) {
                field6295 -= 3;
                int var254 = field6280[field6295];
                int var255 = field6280[field6295 + 1];
                int var256 = field6280[field6295 + 2];
                class531.method3147("", 27818, 9, var254 << 16 | var255, var256);
                return;
            }
            if (arg0 == 6716) {
                field6295 -= 3;
                int var257 = field6280[field6295];
                int var258 = field6280[field6295 + 1];
                int var259 = field6280[field6295 + 2];
                class531.method3147("", 27818, 10, var257 << 16 | var258, var259);
                return;
            }
            if (arg0 == 6717) {
                field6295 -= 3;
                int var260 = field6280[field6295];
                int var261 = field6280[field6295 + 1];
                int var262 = field6280[field6295 + 2];
                class450 var263 = class19.method108(true, var260 << 16 | var261, var262);
                class227.method1451(4226);
                class222 var264 = client.method1253(var263);
                class226.method1448(var263, 124, var264.method1401(-92), var264.field2980);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var265 = field6280[--field6295];
                class48 var266 = class60.field698.method993(var265, -21143);
                if (var266.field520 == null) {
                    field6287[field6282++] = "";
                    return;
                }
                field6287[field6282++] = var266.field520;
                return;
            }
            if (arg0 == 6801) {
                int var267 = field6280[--field6295];
                class48 var268 = class60.field698.method993(var267, -21143);
                field6280[field6295++] = var268.field536;
                return;
            }
            if (arg0 == 6802) {
                int var269 = field6280[--field6295];
                class48 var270 = class60.field698.method993(var269, -21143);
                field6280[field6295++] = var270.field509;
                return;
            }
            if (arg0 == 6803) {
                int var271 = field6280[--field6295];
                class48 var272 = class60.field698.method993(var271, -21143);
                field6280[field6295++] = var272.field512;
                return;
            }
            if (arg0 == 6804) {
                field6295 -= 2;
                int var273 = field6280[field6295];
                int var274 = field6280[field6295 + 1];
                class87 var275 = class104.field1405.method449((byte) 124, var274);
                if (var275.method481(115)) {
                    field6287[field6282++] = class60.field698.method993(var273, -21143).method270((byte) 107, var274, var275.field1033);
                    return;
                }
                field6280[field6295++] = class60.field698.method993(var273, -21143).method276(89, var275.field1031, var274);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field6280[field6295++] = class193.field2495 && !class310.field4150 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field6280[field6295++] = class226.field3041;
                return;
            }
            if (arg0 == 6902) {
                field6280[field6295++] = class130.field1686;
                return;
            }
            if (arg0 == 6903) {
                field6280[field6295++] = class328.field4359;
                return;
            }
            if (arg0 == 6904) {
                field6280[field6295++] = class457.field6818;
                return;
            }
            if (arg0 == 6905) {
                String var276 = "";
                if (class263.field3525 != null) {
                    if (class263.field3525.field3151 == null) {
                        var276 = class472.method2876(1165, class263.field3525.field3148);
                    } else {
                        var276 = (String) class263.field3525.field3151;
                    }
                }
                field6287[field6282++] = var276;
                return;
            }
            if (arg0 == 6906) {
                field6280[field6295++] = class68.field783;
                return;
            }
            if (arg0 == 6907) {
                field6280[field6295++] = class395.field5695;
                return;
            }
            if (arg0 == 6908) {
                field6280[field6295++] = class14.field149;
                return;
            }
            if (arg0 == 6909) {
                field6280[field6295++] = class12.field129 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field6280[field6295++] = class386.field5616;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lnc;I)V")
    private static final void method2652(class21 arg0, int arg1) {
        field6295 = 0;
        field6282 = 0;
        int var2 = -1;
        int[] var3 = arg0.field190;
        int[] var4 = arg0.field203;
        byte var5 = -1;
        field6290 = 0;
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
                        method2660(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2651(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6280[field6295++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6280[field6295++] = class52.field606.field2789[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class52.field606.method1331(var8, -1, field6280[--field6295]);
                } else if (var43 == 3) {
                    field6287[field6282++] = arg0.field193[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6295 -= 2;
                    if (field6280[field6295 + 1] != field6280[field6295]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6295 -= 2;
                    if (field6280[field6295 + 1] == field6280[field6295]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6295 -= 2;
                    if (field6280[field6295] < field6280[field6295 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6295 -= 2;
                    if (field6280[field6295] > field6280[field6295 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6290 == 0) {
                        return;
                    }
                    class310 var9 = field6283[--field6290];
                    arg0 = var9.field4157;
                    var3 = arg0.field190;
                    var4 = arg0.field203;
                    var2 = var9.field4152;
                    field6284 = var9.field4154;
                    field6274 = var9.field4155;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6280[field6295++] = class52.field606.method5(0, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class52.field606.method1334(6838, var11, field6280[--field6295]);
                } else if (var43 == 31) {
                    field6295 -= 2;
                    if (field6280[field6295] <= field6280[field6295 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6295 -= 2;
                    if (field6280[field6295] >= field6280[field6295 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6280[field6295++] = field6284[var4[var2]];
                } else if (var43 == 34) {
                    field6284[var4[var2]] = field6280[--field6295];
                } else if (var43 == 35) {
                    field6287[field6282++] = field6274[var4[var2]];
                } else if (var43 == 36) {
                    field6274[var4[var2]] = field6287[--field6282];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6282 -= var12;
                    String var13 = class103.method626(var12, field6287, -2, field6282);
                    field6287[field6282++] = var13;
                } else if (var43 == 38) {
                    field6295--;
                } else if (var43 == 39) {
                    field6282--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class21 var15 = class23.method134(1707933639, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field195];
                    String[] var17 = new String[var15.field192];
                    for (int var18 = 0; var18 < var15.field200; var18++) {
                        var16[var18] = field6280[field6295 + var18 - var15.field200];
                    }
                    for (int var19 = 0; var19 < var15.field191; var19++) {
                        var17[var19] = field6287[field6282 + var19 - var15.field191];
                    }
                    field6295 -= var15.field200;
                    field6282 -= var15.field191;
                    class310 var20 = new class310();
                    var20.field4157 = arg0;
                    var20.field4152 = var2;
                    var20.field4154 = field6284;
                    var20.field4155 = field6274;
                    if (field6290 >= field6283.length) {
                        throw new RuntimeException();
                    }
                    field6283[field6290++] = var20;
                    arg0 = var15;
                    var3 = var15.field190;
                    var4 = var15.field203;
                    var2 = -1;
                    field6284 = var16;
                    field6274 = var17;
                } else if (var43 == 42) {
                    field6280[field6295++] = class302.field3999[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class302.field3999[var21] = field6280[--field6295];
                    class227.method1457(var21, (byte) -56);
                    class323.field4297 |= class272.field3636[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6280[--field6295];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6275[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6278[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6280[--field6295];
                    if (var28 < 0 || var28 >= field6275[var27]) {
                        throw new RuntimeException();
                    }
                    field6280[field6295++] = field6278[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6295 -= 2;
                    int var30 = field6280[field6295];
                    if (var30 < 0 || var30 >= field6275[var29]) {
                        throw new RuntimeException();
                    }
                    field6278[var29][var30] = field6280[field6295 + 1];
                } else if (var43 == 47) {
                    String var31 = class234.field3131[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6287[field6282++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class234.field3131[var32] = field6287[--field6282];
                    class274.method1664(var32, -5);
                } else if (var43 == 51) {
                    class50 var33 = arg0.field199[var4[var2]];
                    class488 var34 = (class488) var33.method295((long) field6280[--field6295], -110);
                    if (var34 != null) {
                        var2 += var34.field7162;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field186 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6348).append(" ");
                for (int var41 = field6290 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6283[var41].field4157.field6348).append(" ");
                }
                var40.append("op: ").append(var5);
                client.method1256(var42, -2020, var40.toString());
            } else {
                class180.method1053(0, "Clientscript error in: " + arg0.field186);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field186).append("\n");
                for (int var38 = field6290 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6283[var38].field4157.field186).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                client.method1256(var42, -2020, var37.toString());
                class329.method1930(var37.toString(), 25572);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
    public static final void method2653(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static final void method2654(int arg0) {
        if (arg0 == -1 || !class372.method2199(97, arg0)) {
            return;
        }
        class450[] var1 = class339.field4491[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class450 var3 = var1[var2];
            if (var3.field6603 != null) {
                class293 var4 = new class293();
                var4.field3877 = var3;
                var4.field3866 = var3.field6603;
                method2663(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    private static final void method2655(int arg0) {
        class450 var1 = class406.method2490((byte) -116, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class450[] var3 = class363.field4969[var2];
        if (var3 == null) {
            class450[] var4 = class339.field4491[var2];
            int var5 = var4.length;
            var3 = class363.field4969[var2] = new class450[var5];
            class438.method2690(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class438.method2690(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
    public static void method2656() {
        field6284 = null;
        field6274 = null;
        field6275 = null;
        field6278 = null;
        field6280 = null;
        field6287 = null;
        field6283 = null;
        field6288 = null;
        field6289 = null;
        field6276 = null;
        field6286 = null;
        field6298 = null;
        field6299 = null;
        field6300 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lun;)V")
    public static final void method2657(class293 arg0) {
        method2663(arg0, 200000);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
    public static final void method2658() {
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2659(String arg0, int arg1) {
        if (class509.field7372 == 0 && !(!class193.field2495 || class310.field4150) || class334.field4432) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class26.field253.method1823(0, (byte) -88))) {
            var3 = 0;
            arg0 = arg0.substring(class26.field253.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class130.field1670.method1823(0, (byte) -88))) {
            var3 = 1;
            arg0 = arg0.substring(class130.field1670.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class52.field583.method1823(0, (byte) -88))) {
            var3 = 2;
            arg0 = arg0.substring(class52.field583.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class319.field4259.method1823(0, (byte) -88))) {
            var3 = 3;
            arg0 = arg0.substring(class319.field4259.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class169.field2191.method1823(0, (byte) -88))) {
            var3 = 4;
            arg0 = arg0.substring(class169.field2191.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class184.field2396.method1823(0, (byte) -88))) {
            var3 = 5;
            arg0 = arg0.substring(class184.field2396.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class32.field328.method1823(0, (byte) -88))) {
            var3 = 6;
            arg0 = arg0.substring(class32.field328.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class414.field5918.method1823(0, (byte) -88))) {
            var3 = 7;
            arg0 = arg0.substring(class414.field5918.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class418.field6075.method1823(0, (byte) -88))) {
            var3 = 8;
            arg0 = arg0.substring(class418.field6075.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class410.field5868.method1823(0, (byte) -88))) {
            var3 = 9;
            arg0 = arg0.substring(class410.field5868.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class287.field3767.method1823(0, (byte) -88))) {
            var3 = 10;
            arg0 = arg0.substring(class287.field3767.method1823(0, (byte) -88).length());
        } else if (var2.startsWith(class262.field3508.method1823(0, (byte) -88))) {
            var3 = 11;
            arg0 = arg0.substring(class262.field3508.method1823(0, (byte) -88).length());
        } else if (class374.field5072 != 0) {
            if (var2.startsWith(class26.field253.method1823(class374.field5072, (byte) -88))) {
                var3 = 0;
                arg0 = arg0.substring(class26.field253.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class130.field1670.method1823(class374.field5072, (byte) -88))) {
                var3 = 1;
                arg0 = arg0.substring(class130.field1670.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class52.field583.method1823(class374.field5072, (byte) -88))) {
                var3 = 2;
                arg0 = arg0.substring(class52.field583.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class319.field4259.method1823(class374.field5072, (byte) -88))) {
                var3 = 3;
                arg0 = arg0.substring(class319.field4259.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class169.field2191.method1823(class374.field5072, (byte) -88))) {
                var3 = 4;
                arg0 = arg0.substring(class169.field2191.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class184.field2396.method1823(class374.field5072, (byte) -88))) {
                var3 = 5;
                arg0 = arg0.substring(class184.field2396.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class32.field328.method1823(class374.field5072, (byte) -88))) {
                var3 = 6;
                arg0 = arg0.substring(class32.field328.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class414.field5918.method1823(class374.field5072, (byte) -88))) {
                var3 = 7;
                arg0 = arg0.substring(class414.field5918.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class418.field6075.method1823(class374.field5072, (byte) -88))) {
                var3 = 8;
                arg0 = arg0.substring(class418.field6075.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class410.field5868.method1823(class374.field5072, (byte) -88))) {
                var3 = 9;
                arg0 = arg0.substring(class410.field5868.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class287.field3767.method1823(class374.field5072, (byte) -88))) {
                var3 = 10;
                arg0 = arg0.substring(class287.field3767.method1823(class374.field5072, (byte) -88).length());
            } else if (var2.startsWith(class262.field3508.method1823(class374.field5072, (byte) -88))) {
                var3 = 11;
                arg0 = arg0.substring(class262.field3508.method1823(class374.field5072, (byte) -88).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class328.field4355.method1823(0, (byte) -88))) {
            var5 = 1;
            arg0 = arg0.substring(class328.field4355.method1823(0, (byte) -88).length());
        } else if (var4.startsWith(class302.field3998.method1823(0, (byte) -88))) {
            var5 = 2;
            arg0 = arg0.substring(class302.field3998.method1823(0, (byte) -88).length());
        } else if (var4.startsWith(class53.field613.method1823(0, (byte) -88))) {
            var5 = 3;
            arg0 = arg0.substring(class53.field613.method1823(0, (byte) -88).length());
        } else if (var4.startsWith(class106.field1446.method1823(0, (byte) -88))) {
            var5 = 4;
            arg0 = arg0.substring(class106.field1446.method1823(0, (byte) -88).length());
        } else if (var4.startsWith(class213.field2919.method1823(0, (byte) -88))) {
            var5 = 5;
            arg0 = arg0.substring(class213.field2919.method1823(0, (byte) -88).length());
        } else if (class374.field5072 != 0) {
            if (var4.startsWith(class328.field4355.method1823(class374.field5072, (byte) -88))) {
                var5 = 1;
                arg0 = arg0.substring(class328.field4355.method1823(class374.field5072, (byte) -88).length());
            } else if (var4.startsWith(class302.field3998.method1823(class374.field5072, (byte) -88))) {
                var5 = 2;
                arg0 = arg0.substring(class302.field3998.method1823(class374.field5072, (byte) -88).length());
            } else if (var4.startsWith(class53.field613.method1823(class374.field5072, (byte) -88))) {
                var5 = 3;
                arg0 = arg0.substring(class53.field613.method1823(class374.field5072, (byte) -88).length());
            } else if (var4.startsWith(class106.field1446.method1823(class374.field5072, (byte) -88))) {
                var5 = 4;
                arg0 = arg0.substring(class106.field1446.method1823(class374.field5072, (byte) -88).length());
            } else if (var4.startsWith(class213.field2919.method1823(class374.field5072, (byte) -88))) {
                var5 = 5;
                arg0 = arg0.substring(class213.field2919.method1823(class374.field5072, (byte) -88).length());
            }
        }
        field6273++;
        class492.method2979(class402.field5823, 16);
        class106.field1443.method2449((byte) 118, 0);
        int var6 = class106.field1443.field5729;
        if (arg1 == 5021) {
            class106.field1443.method2449((byte) 117, 1);
        } else if (arg1 == 5022) {
            class106.field1443.method2449((byte) 117, 2);
        } else {
            class106.field1443.method2449((byte) 125, 0);
        }
        class106.field1443.method2449((byte) 123, var3);
        class106.field1443.method2449((byte) 123, var5);
        class168.method987((byte) 46, arg0, class106.field1443);
        class106.field1443.method2403(class106.field1443.field5729 - var6, (byte) -22);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(IZ)V")
    private static final void method2660(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6295 -= 3;
                int var2 = field6280[field6295];
                int var3 = field6280[field6295 + 1];
                int var4 = field6280[field6295 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class450 var5 = class406.method2490((byte) -116, var2);
                if (var5.field6643 == null) {
                    var5.field6643 = new class450[var4 + 1];
                }
                if (var5.field6643.length <= var4) {
                    class450[] var6 = new class450[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6643.length; var7++) {
                        var6[var7] = var5.field6643[var7];
                    }
                    var5.field6643 = var6;
                }
                if (var4 > 0 && var5.field6643[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class450 var8 = new class450();
                var8.field6686 = var3;
                var8.field6550 = var8.field6558 = var5.field6558;
                var8.field6703 = var4;
                var5.field6643[var4] = var8;
                if (arg1) {
                    field6289 = var8;
                } else {
                    field6288 = var8;
                }
                class413.method2521(var5, false);
                return;
            }
            if (arg0 == 101) {
                class450 var9 = arg1 ? field6289 : field6288;
                if (var9.field6703 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class450 var10 = class406.method2490((byte) -116, var9.field6558);
                var10.field6643[var9.field6703] = null;
                class413.method2521(var10, false);
                return;
            }
            if (arg0 == 102) {
                class450 var11 = class406.method2490((byte) -116, field6280[--field6295]);
                var11.field6643 = null;
                class413.method2521(var11, false);
                return;
            }
            if (arg0 == 200) {
                field6295 -= 2;
                int var12 = field6280[field6295];
                int var13 = field6280[field6295 + 1];
                class450 var14 = class19.method108(true, var12, var13);
                if (var14 != null && var13 != -1) {
                    field6280[field6295++] = 1;
                    if (arg1) {
                        field6289 = var14;
                        return;
                    }
                    field6288 = var14;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6280[--field6295];
                class450 var16 = class406.method2490((byte) -116, var15);
                if (var16 != null) {
                    field6280[field6295++] = 1;
                    if (arg1) {
                        field6289 = var16;
                        return;
                    }
                    field6288 = var16;
                    return;
                }
                field6280[field6295++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6280[--field6295];
                method2655(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6280[--field6295];
                method2661(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6295 -= 2;
                int var19 = field6280[field6295];
                int var20 = field6280[field6295 + 1];
                for (int var21 = 0; var21 < class256.field3402.length; var21++) {
                    if (class256.field3402[var21] == var19) {
                        class96.field1170.field7833.method817(class453.field6782, (byte) -41, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class110.field1477.length; var22++) {
                    if (class110.field1477[var22] == var19) {
                        class96.field1170.field7833.method817(class453.field6782, (byte) -41, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6295 -= 2;
                int var23 = field6280[field6295];
                int var24 = field6280[field6295 + 1];
                class96.field1170.field7833.method821(var23, var24, 25);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6280[--field6295] != 0;
                class96.field1170.field7833.method823((byte) 39, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class450 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class406.method2490((byte) -116, field6280[--field6295]);
            } else {
                var26 = arg1 ? field6289 : field6288;
            }
            if (arg0 == 1000) {
                field6295 -= 4;
                var26.field6645 = field6280[field6295];
                var26.field6624 = field6280[field6295 + 1];
                int var27 = field6280[field6295 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field6280[field6295 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6551 = (byte) var27;
                var26.field6683 = (byte) var28;
                class413.method2521(var26, false);
                class449.method2774((byte) 99, var26);
                if (var26.field6703 == -1) {
                    class144.method880(var26.field6558, (byte) 109);
                }
                return;
            }
            if (arg0 == 1001) {
                field6295 -= 4;
                var26.field6613 = field6280[field6295];
                var26.field6555 = field6280[field6295 + 1];
                var26.field6567 = 0;
                var26.field6618 = 0;
                int var29 = field6280[field6295 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field6280[field6295 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6671 = (byte) var29;
                var26.field6553 = (byte) var30;
                class413.method2521(var26, false);
                class449.method2774((byte) 51, var26);
                if (var26.field6686 == 0) {
                    class433.method2667(0, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field6280[--field6295] == 1;
                if (var26.field6665 != var31) {
                    var26.field6665 = var31;
                    class413.method2521(var26, false);
                }
                if (var26.field6703 == -1) {
                    class13.method72(var26.field6558, 12335);
                }
                return;
            }
            if (arg0 == 1004) {
                field6295 -= 2;
                var26.field6605 = field6280[field6295];
                var26.field6586 = field6280[field6295 + 1];
                class413.method2521(var26, false);
                class449.method2774((byte) 44, var26);
                if (var26.field6686 == 0) {
                    class433.method2667(0, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6545 = field6280[--field6295] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class450 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class406.method2490((byte) -116, field6280[--field6295]);
            } else {
                var32 = arg1 ? field6289 : field6288;
            }
            if (arg0 == 1100) {
                field6295 -= 2;
                var32.field6634 = field6280[field6295];
                if (var32.field6634 > var32.field6632 - var32.field6612) {
                    var32.field6634 = var32.field6632 - var32.field6612;
                }
                if (var32.field6634 < 0) {
                    var32.field6634 = 0;
                }
                var32.field6687 = field6280[field6295 + 1];
                if (var32.field6687 > var32.field6684 - var32.field6573) {
                    var32.field6687 = var32.field6684 - var32.field6573;
                }
                if (var32.field6687 < 0) {
                    var32.field6687 = 0;
                }
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class89.method493(var32.field6558, (byte) 99);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6649 = field6280[--field6295];
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class99.method609(19, var32.field6558);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6662 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1103) {
                var32.field6548 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1104) {
                var32.field6617 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field6280[--field6295];
                if (var32.field6560 != var33) {
                    var32.field6560 = var33;
                    class413.method2521(var32, false);
                }
                if (var32.field6703 == -1) {
                    class51.method303(var32.field6558, -14342);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6579 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1107) {
                var32.field6576 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1108) {
                var32.field6652 = 1;
                var32.field6692 = field6280[--field6295];
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class276.method1680(var32.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1109) {
                field6295 -= 6;
                var32.field6571 = field6280[field6295];
                var32.field6597 = field6280[field6295 + 1];
                var32.field6615 = field6280[field6295 + 2];
                var32.field6701 = field6280[field6295 + 3];
                var32.field6604 = field6280[field6295 + 4];
                var32.field6663 = field6280[field6295 + 5];
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class336.method1962(0, var32.field6558);
                    class210.method1339(var32.field6558, -122);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field6280[--field6295];
                if (var32.field6702 != var34) {
                    var32.field6702 = var34;
                    var32.field6575 = 0;
                    var32.field6577 = 1;
                    var32.field6590 = 0;
                    class413.method2521(var32, false);
                }
                if (var32.field6703 == -1) {
                    class118.method705((byte) -115, var32.field6558);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6563 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field6287[--field6282];
                if (!var35.equals(var32.field6594)) {
                    var32.field6594 = var35;
                    class413.method2521(var32, false);
                }
                if (var32.field6703 == -1) {
                    class9.method60(var32.field6558, (byte) 24);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6656 = field6280[--field6295];
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class415.method2543(var32.field6558, -7460);
                }
                return;
            }
            if (arg0 == 1114) {
                field6295 -= 3;
                var32.field6691 = field6280[field6295];
                var32.field6557 = field6280[field6295 + 1];
                var32.field6668 = field6280[field6295 + 2];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1115) {
                var32.field6578 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1116) {
                var32.field6672 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1117) {
                var32.field6677 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1118) {
                var32.field6564 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1119) {
                var32.field6569 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1120) {
                field6295 -= 2;
                var32.field6632 = field6280[field6295];
                var32.field6684 = field6280[field6295 + 1];
                class413.method2521(var32, false);
                if (var32.field6686 == 0) {
                    class433.method2667(0, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field6295 -= 2;
                var32.field6654 = (short) field6280[field6295];
                var32.field6570 = (short) field6280[field6295 + 1];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1122) {
                var32.field6640 = field6280[--field6295] == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1123) {
                var32.field6663 = field6280[--field6295];
                class413.method2521(var32, false);
                if (var32.field6703 == -1) {
                    class336.method1962(0, var32.field6558);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field6280[--field6295];
                var32.field6629 = var36 == 1;
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1125) {
                field6295 -= 2;
                var32.field6699 = field6280[field6295];
                var32.field6602 = field6280[field6295 + 1];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1126) {
                var32.field6688 = field6280[--field6295];
                class413.method2521(var32, false);
                return;
            }
            if (arg0 == 1127) {
                field6295 -= 2;
                int var37 = field6280[field6295];
                int var38 = field6280[field6295 + 1];
                class87 var39 = class104.field1405.method449((byte) 126, var37);
                if (var39.field1031 != var38) {
                    var32.method2782(var37, var38, 11);
                    return;
                }
                var32.method2781(5311, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field6280[--field6295];
                String var41 = field6287[--field6282];
                class87 var42 = class104.field1405.method449((byte) 2, var40);
                if (!var42.field1033.equals(var41)) {
                    var32.method2785(16, var40, var41);
                    return;
                }
                var32.method2781(5311, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class450 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class406.method2490((byte) -116, field6280[--field6295]);
            } else {
                var43 = arg1 ? field6289 : field6288;
            }
            class413.method2521(var43, false);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6295 -= 2;
                int var44 = field6280[field6295];
                int var45 = field6280[field6295 + 1];
                if (var43.field6703 == -1) {
                    class529.method3136(-32339, var43.field6558);
                    class336.method1962(0, var43.field6558);
                    class210.method1339(var43.field6558, -113);
                }
                if (var44 == -1) {
                    var43.field6652 = 1;
                    var43.field6692 = -1;
                    var43.field6661 = -1;
                    return;
                }
                var43.field6661 = var44;
                var43.field6561 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field6572 = true;
                } else {
                    var43.field6572 = false;
                }
                class199 var46 = class237.field3158.method236(-18315, var44);
                var43.field6615 = var46.field2621;
                var43.field6701 = var46.field2585;
                var43.field6604 = var46.field2638;
                var43.field6571 = var46.field2589;
                var43.field6597 = var46.field2609;
                var43.field6663 = var46.field2599;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field6689 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field6689 = 1;
                } else {
                    var43.field6689 = 2;
                }
                if (var43.field6567 > 0) {
                    var43.field6663 = var43.field6663 * 32 / var43.field6567;
                    return;
                }
                if (var43.field6613 > 0) {
                    var43.field6663 = var43.field6663 * 32 / var43.field6613;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field6652 = 2;
                var43.field6692 = field6280[--field6295];
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field6652 = 3;
                var43.field6692 = -1;
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field6652 = 6;
                var43.field6692 = field6280[--field6295];
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field6652 = 5;
                var43.field6692 = field6280[--field6295];
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1206) {
                field6295 -= 4;
                var43.field6584 = field6280[field6295];
                var43.field6693 = field6280[field6295 + 1];
                var43.field6549 = field6280[field6295 + 2];
                var43.field6646 = field6280[field6295 + 3];
                class413.method2521(var43, false);
                return;
            }
            if (arg0 == 1207) {
                field6295 -= 2;
                var43.field6574 = field6280[field6295];
                var43.field6554 = field6280[field6295 + 1];
                class413.method2521(var43, false);
                return;
            }
            if (arg0 == 1210) {
                field6295 -= 4;
                var43.field6692 = field6280[field6295];
                var43.field6587 = field6280[field6295 + 1];
                if (field6280[field6295 + 2] == 1) {
                    var43.field6652 = 9;
                } else {
                    var43.field6652 = 8;
                }
                if (field6280[field6295 + 3] == 1) {
                    var43.field6572 = true;
                } else {
                    var43.field6572 = false;
                }
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field6652 = 5;
                var43.field6692 = class308.field4121;
                var43.field6587 = 0;
                if (var43.field6703 == -1) {
                    class276.method1680(var43.field6558, 17162);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class450 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class406.method2490((byte) -116, field6280[--field6295]);
                } else {
                    var58 = arg1 ? field6289 : field6288;
                }
                String var59 = field6287[--field6282];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field6280[--field6295];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field6280[--field6295];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field6287[--field6282];
                    } else {
                        var62[var63] = Integer.valueOf(field6280[--field6295]);
                    }
                }
                int var64 = field6280[--field6295];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field6706 = var62;
                } else if (arg0 == 1401) {
                    var58.field6680 = var62;
                } else if (arg0 == 1402) {
                    var58.field6669 = var62;
                } else if (arg0 == 1403) {
                    var58.field6657 = var62;
                } else if (arg0 == 1404) {
                    var58.field6562 = var62;
                } else if (arg0 == 1405) {
                    var58.field6678 = var62;
                } else if (arg0 == 1406) {
                    var58.field6681 = var62;
                } else if (arg0 == 1407) {
                    var58.field6664 = var62;
                    var58.field6695 = var60;
                } else if (arg0 == 1408) {
                    var58.field6644 = var62;
                } else if (arg0 == 1409) {
                    var58.field6675 = var62;
                } else if (arg0 == 1410) {
                    var58.field6600 = var62;
                } else if (arg0 == 1411) {
                    var58.field6598 = var62;
                } else if (arg0 == 1412) {
                    var58.field6658 = var62;
                } else if (arg0 == 1414) {
                    var58.field6542 = var62;
                    var58.field6620 = var60;
                } else if (arg0 == 1415) {
                    var58.field6546 = var62;
                    var58.field6651 = var60;
                } else if (arg0 == 1416) {
                    var58.field6593 = var62;
                } else if (arg0 == 1417) {
                    var58.field6648 = var62;
                } else if (arg0 == 1418) {
                    var58.field6660 = var62;
                } else if (arg0 == 1419) {
                    var58.field6556 = var62;
                } else if (arg0 == 1420) {
                    var58.field6628 = var62;
                } else if (arg0 == 1421) {
                    var58.field6670 = var62;
                } else if (arg0 == 1422) {
                    var58.field6580 = var62;
                } else if (arg0 == 1423) {
                    var58.field6611 = var62;
                } else if (arg0 == 1424) {
                    var58.field6589 = var62;
                } else if (arg0 == 1425) {
                    var58.field6676 = var62;
                } else if (arg0 == 1426) {
                    var58.field6608 = var62;
                } else if (arg0 == 1427) {
                    var58.field6544 = var62;
                } else if (arg0 == 1428) {
                    var58.field6705 = var62;
                    var58.field6633 = var60;
                } else if (arg0 == 1429) {
                    var58.field6638 = var62;
                    var58.field6565 = var60;
                } else if (arg0 == 1430) {
                    var58.field6626 = var62;
                }
                var58.field6585 = true;
                return;
            }
            if (arg0 < 1600) {
                class450 var65 = arg1 ? field6289 : field6288;
                if (arg0 == 1500) {
                    field6280[field6295++] = var65.field6601;
                    return;
                }
                if (arg0 == 1501) {
                    field6280[field6295++] = var65.field6682;
                    return;
                }
                if (arg0 == 1502) {
                    field6280[field6295++] = var65.field6612;
                    return;
                }
                if (arg0 == 1503) {
                    field6280[field6295++] = var65.field6573;
                    return;
                }
                if (arg0 == 1504) {
                    field6280[field6295++] = var65.field6665 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6280[field6295++] = var65.field6550;
                    return;
                }
                if (arg0 == 1506) {
                    class450 var66 = class274.method1666(var65, (byte) -124);
                    field6280[field6295++] = var66 == null ? -1 : var66.field6558;
                    return;
                }
            } else if (arg0 < 1700) {
                class450 var67 = arg1 ? field6289 : field6288;
                if (arg0 == 1600) {
                    field6280[field6295++] = var67.field6634;
                    return;
                }
                if (arg0 == 1601) {
                    field6280[field6295++] = var67.field6687;
                    return;
                }
                if (arg0 == 1602) {
                    field6287[field6282++] = var67.field6594;
                    return;
                }
                if (arg0 == 1603) {
                    field6280[field6295++] = var67.field6632;
                    return;
                }
                if (arg0 == 1604) {
                    field6280[field6295++] = var67.field6684;
                    return;
                }
                if (arg0 == 1605) {
                    field6280[field6295++] = var67.field6663;
                    return;
                }
                if (arg0 == 1606) {
                    field6280[field6295++] = var67.field6615;
                    return;
                }
                if (arg0 == 1607) {
                    field6280[field6295++] = var67.field6604;
                    return;
                }
                if (arg0 == 1608) {
                    field6280[field6295++] = var67.field6701;
                    return;
                }
                if (arg0 == 1609) {
                    field6280[field6295++] = var67.field6548;
                    return;
                }
                if (arg0 == 1610) {
                    field6280[field6295++] = var67.field6571;
                    return;
                }
                if (arg0 == 1611) {
                    field6280[field6295++] = var67.field6597;
                    return;
                }
                if (arg0 == 1612) {
                    field6280[field6295++] = var67.field6560;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field6280[--field6295];
                    class87 var69 = class104.field1405.method449((byte) -50, var68);
                    if (var69.method481(115)) {
                        field6287[field6282++] = var67.method2779(-10556, var69.field1033, var68);
                    } else {
                        field6280[field6295++] = var67.method2794(0, var68, var69.field1031);
                    }
                }
            } else if (arg0 < 1800) {
                class450 var70 = arg1 ? field6289 : field6288;
                if (arg0 == 1700) {
                    field6280[field6295++] = var70.field6661;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field6661 != -1) {
                        field6280[field6295++] = var70.field6561;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6280[field6295++] = var70.field6703;
                    return;
                }
            } else if (arg0 < 1900) {
                class450 var71 = arg1 ? field6289 : field6288;
                if (arg0 == 1800) {
                    field6280[field6295++] = client.method1253(var71).method1401(-104);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field6280[--field6295];
                    int var334 = var72 - 1;
                    if (var71.field6622 != null && var334 < var71.field6622.length && var71.field6622[var334] != null) {
                        field6287[field6282++] = var71.field6622[var334];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field6631 == null) {
                        field6287[field6282++] = "";
                        return;
                    }
                    field6287[field6282++] = var71.field6631;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class450 var332;
                if (arg0 >= 2000) {
                    var332 = class406.method2490((byte) -116, field6280[--field6295]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field6289 : field6288;
                }
                if (field6301 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field6544 == null) {
                        return;
                    }
                    class293 var333 = new class293();
                    var333.field3877 = var332;
                    var333.field3866 = var332.field6544;
                    var333.field3865 = field6301 + 1;
                    class354.field4735.method975(0, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class450 var73 = class406.method2490((byte) -116, field6280[--field6295]);
                if (arg0 == 2500) {
                    field6280[field6295++] = var73.field6601;
                    return;
                }
                if (arg0 == 2501) {
                    field6280[field6295++] = var73.field6682;
                    return;
                }
                if (arg0 == 2502) {
                    field6280[field6295++] = var73.field6612;
                    return;
                }
                if (arg0 == 2503) {
                    field6280[field6295++] = var73.field6573;
                    return;
                }
                if (arg0 == 2504) {
                    field6280[field6295++] = var73.field6665 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6280[field6295++] = var73.field6550;
                    return;
                }
                if (arg0 == 1506) {
                    class450 var74 = class274.method1666(var73, (byte) -115);
                    field6280[field6295++] = var74 == null ? -1 : var74.field6558;
                    return;
                }
            } else if (arg0 < 2700) {
                class450 var75 = class406.method2490((byte) -116, field6280[--field6295]);
                if (arg0 == 2600) {
                    field6280[field6295++] = var75.field6634;
                    return;
                }
                if (arg0 == 2601) {
                    field6280[field6295++] = var75.field6687;
                    return;
                }
                if (arg0 == 2602) {
                    field6287[field6282++] = var75.field6594;
                    return;
                }
                if (arg0 == 2603) {
                    field6280[field6295++] = var75.field6632;
                    return;
                }
                if (arg0 == 2604) {
                    field6280[field6295++] = var75.field6684;
                    return;
                }
                if (arg0 == 2605) {
                    field6280[field6295++] = var75.field6663;
                    return;
                }
                if (arg0 == 2606) {
                    field6280[field6295++] = var75.field6615;
                    return;
                }
                if (arg0 == 2607) {
                    field6280[field6295++] = var75.field6604;
                    return;
                }
                if (arg0 == 2608) {
                    field6280[field6295++] = var75.field6701;
                    return;
                }
                if (arg0 == 2609) {
                    field6280[field6295++] = var75.field6548;
                    return;
                }
                if (arg0 == 2610) {
                    field6280[field6295++] = var75.field6571;
                    return;
                }
                if (arg0 == 2611) {
                    field6280[field6295++] = var75.field6597;
                    return;
                }
                if (arg0 == 2612) {
                    field6280[field6295++] = var75.field6560;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class450 var76 = class406.method2490((byte) -116, field6280[--field6295]);
                    field6280[field6295++] = var76.field6661;
                    return;
                }
                if (arg0 == 2701) {
                    class450 var77 = class406.method2490((byte) -116, field6280[--field6295]);
                    if (var77.field6661 != -1) {
                        field6280[field6295++] = var77.field6561;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field6280[--field6295];
                    class360 var79 = (class360) class152.field1989.method295((long) var78, -128);
                    if (var79 != null) {
                        field6280[field6295++] = 1;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class450 var80 = class406.method2490((byte) -116, field6280[--field6295]);
                    if (var80.field6643 == null) {
                        field6280[field6295++] = 0;
                        return;
                    }
                    int var81 = var80.field6643.length;
                    for (int var82 = 0; var82 < var80.field6643.length; var82++) {
                        if (var80.field6643[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field6280[field6295++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6295 -= 2;
                    int var83 = field6280[field6295];
                    int var84 = field6280[field6295 + 1];
                    class360 var85 = (class360) class152.field1989.method295((long) var83, -123);
                    if (var85 != null && var85.field4886 == var84) {
                        field6280[field6295++] = 1;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class450 var86 = class406.method2490((byte) -116, field6280[--field6295]);
                if (arg0 == 2800) {
                    field6280[field6295++] = client.method1253(var86).method1401(-73);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field6280[--field6295];
                    int var335 = var87 - 1;
                    if (var86.field6622 != null && var335 < var86.field6622.length && var86.field6622[var335] != null) {
                        field6287[field6282++] = var86.field6622[var335];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field6631 == null) {
                        field6287[field6282++] = "";
                        return;
                    }
                    field6287[field6282++] = var86.field6631;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field6287[--field6282];
                    class180.method1053(0, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field6295 -= 2;
                    class388.method2356(field6280[field6295 + 1], field6280[field6295], (byte) -58, class96.field1170);
                    return;
                }
                if (arg0 == 3103) {
                    class266.method1627(true, -102);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field6287[--field6282];
                    int var90 = 0;
                    if (class204.method1301((byte) 43, var89)) {
                        var90 = class304.method1819((byte) -69, var89);
                    }
                    field6294++;
                    class492.method2979(class309.field4146, 15);
                    class106.field1443.method2398(115, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field6287[--field6282];
                    field6285++;
                    class492.method2979(class373.field5062, 40);
                    class106.field1443.method2449((byte) 120, var91.length() + 1);
                    class106.field1443.method2415(var91, 21742);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field6287[--field6282];
                    field6297++;
                    class492.method2979(class92.field1099, 48);
                    class106.field1443.method2449((byte) 116, var92.length() + 1);
                    class106.field1443.method2415(var92, 21742);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field6280[--field6295];
                    String var94 = field6287[--field6282];
                    class430.method2643(var93, var94, 104);
                    return;
                }
                if (arg0 == 3108) {
                    field6295 -= 3;
                    int var95 = field6280[field6295];
                    int var96 = field6280[field6295 + 1];
                    int var97 = field6280[field6295 + 2];
                    class450 var98 = class406.method2490((byte) -116, var97);
                    class307.method1833(-28373, var96, var98, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field6295 -= 2;
                    int var99 = field6280[field6295];
                    int var100 = field6280[field6295 + 1];
                    class450 var101 = arg1 ? field6289 : field6288;
                    class307.method1833(-28373, var100, var101, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field6280[--field6295];
                    field6293++;
                    class492.method2979(class422.field6148, 45);
                    class106.field1443.method2444((byte) 65, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field6295 -= 2;
                    int var103 = field6280[field6295];
                    int var104 = field6280[field6295 + 1];
                    class360 var105 = (class360) class152.field1989.method295((long) var103, -93);
                    if (var105 != null) {
                        class115.method696(true, 117, var105.field4886 != var104, var105);
                    }
                    class256.method1582(-1, var104, 3, true, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field6295--;
                    int var106 = field6280[field6295];
                    class360 var107 = (class360) class152.field1989.method295((long) var106, -93);
                    if (var107 != null && var107.field4888 == 3) {
                        class115.method696(true, 68, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class58.method354(2, field6287[--field6282]);
                    return;
                }
                if (arg0 == 3114) {
                    field6295 -= 2;
                    int var108 = field6280[field6295];
                    int var109 = field6280[field6295 + 1];
                    String var110 = field6287[--field6282];
                    class119.method714(var110, "", var108, (byte) 102, "", var109);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6295 -= 3;
                    class379.method2313(62, 255, field6280[field6295 + 1], field6280[field6295 + 2], field6280[field6295]);
                    return;
                }
                if (arg0 == 3201) {
                    class422.method2603(field6280[--field6295], -127, 255, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field6295 -= 2;
                    class21.method122(field6280[field6295 + 1], 0, 255, field6280[field6295]);
                    return;
                }
                if (arg0 == 3203) {
                    field6295 -= 4;
                    class379.method2313(44, field6280[field6295 + 3], field6280[field6295 + 1], field6280[field6295 + 2], field6280[field6295]);
                    return;
                }
                if (arg0 == 3204) {
                    field6295 -= 3;
                    class422.method2603(field6280[field6295], 59, field6280[field6295 + 1], field6280[field6295 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field6295 -= 3;
                    class21.method122(field6280[field6295 + 1], 0, field6280[field6295 + 2], field6280[field6295]);
                    return;
                }
                if (arg0 == 3206) {
                    field6295 -= 4;
                    class370.method2196(-1094, field6280[field6295], field6280[field6295 + 2], field6280[field6295 + 3], field6280[field6295 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6280[field6295++] = class532.field7836;
                    return;
                }
                if (arg0 == 3301) {
                    field6295 -= 2;
                    int var111 = field6280[field6295];
                    int var112 = field6280[field6295 + 1];
                    field6280[field6295++] = class474.method2892(false, (byte) -116, var111, var112);
                    return;
                }
                if (arg0 == 3302) {
                    field6295 -= 2;
                    int var113 = field6280[field6295];
                    int var114 = field6280[field6295 + 1];
                    field6280[field6295++] = class407.method2494(var113, true, var114, false);
                    return;
                }
                if (arg0 == 3303) {
                    field6295 -= 2;
                    int var115 = field6280[field6295];
                    int var116 = field6280[field6295 + 1];
                    field6280[field6295++] = class479.method2924(var115, (byte) -92, var116, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field6280[--field6295];
                    field6280[field6295++] = class263.field3536.method1054(0, var117).field1017;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field6280[--field6295];
                    field6280[field6295++] = class81.field985[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field6280[--field6295];
                    field6280[field6295++] = class456.field6807[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field6280[--field6295];
                    field6280[field6295++] = class173.field2225[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class96.field1170.field3695;
                    int var122 = (class96.field1170.field3704 >> 7) + class357.field4867;
                    int var123 = (class96.field1170.field3694 >> 7) + class418.field6074;
                    field6280[field6295++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field6280[--field6295];
                    field6280[field6295++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field6280[--field6295];
                    field6280[field6295++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field6280[--field6295];
                    field6280[field6295++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6280[field6295++] = class48.field508 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6295 -= 2;
                    int var127 = field6280[field6295];
                    int var128 = field6280[field6295 + 1];
                    field6280[field6295++] = class474.method2892(true, (byte) -116, var127, var128);
                    return;
                }
                if (arg0 == 3314) {
                    field6295 -= 2;
                    int var129 = field6280[field6295];
                    int var130 = field6280[field6295 + 1];
                    field6280[field6295++] = class407.method2494(var129, true, var130, true);
                    return;
                }
                if (arg0 == 3315) {
                    field6295 -= 2;
                    int var131 = field6280[field6295];
                    int var132 = field6280[field6295 + 1];
                    field6280[field6295++] = class479.method2924(var131, (byte) -92, var132, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class509.field7372 >= 2) {
                        field6280[field6295++] = class509.field7372;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6280[field6295++] = class430.field6246;
                    return;
                }
                if (arg0 == 3318) {
                    field6280[field6295++] = class255.field3395.field3559;
                    return;
                }
                if (arg0 == 3321) {
                    field6280[field6295++] = class530.field7766;
                    return;
                }
                if (arg0 == 3322) {
                    field6280[field6295++] = class167.field2171;
                    return;
                }
                if (arg0 == 3323) {
                    if (class402.field5822 >= 5 && class402.field5822 <= 9) {
                        field6280[field6295++] = 1;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class402.field5822 >= 5 && class402.field5822 <= 9) {
                        field6280[field6295++] = class402.field5822;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6280[field6295++] = class19.field166 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6280[field6295++] = class96.field1170.field7793;
                    return;
                }
                if (arg0 == 3327) {
                    field6280[field6295++] = class96.field1170.field7833.field1814 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6280[field6295++] = class334.field4432 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field6280[--field6295];
                    field6280[field6295++] = class118.method708(var133, false, (byte) 104);
                    return;
                }
                if (arg0 == 3331) {
                    field6295 -= 2;
                    int var134 = field6280[field6295];
                    int var135 = field6280[field6295 + 1];
                    field6280[field6295++] = class357.method2120(var134, (byte) 116, var135, false, false);
                    return;
                }
                if (arg0 == 3332) {
                    field6295 -= 2;
                    int var136 = field6280[field6295];
                    int var137 = field6280[field6295 + 1];
                    field6280[field6295++] = class357.method2120(var136, (byte) 50, var137, true, false);
                    return;
                }
                if (arg0 == 3333) {
                    field6280[field6295++] = class47.field493;
                    return;
                }
                if (arg0 == 3335) {
                    field6280[field6295++] = class374.field5072;
                    return;
                }
                if (arg0 == 3336) {
                    field6295 -= 4;
                    int var138 = field6280[field6295];
                    int var139 = field6280[field6295 + 1];
                    int var140 = field6280[field6295 + 2];
                    int var141 = field6280[field6295 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field6280[field6295++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field6280[field6295++] = class385.field5601;
                    return;
                }
                if (arg0 == 3338) {
                    field6280[field6295++] = class472.method2886(50);
                    return;
                }
                if (arg0 == 3339) {
                    field6280[field6295++] = class449.field6536 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field6280[field6295++] = class34.field346 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field6280[field6295++] = class310.field4151 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6295 -= 2;
                    int var145 = field6280[field6295];
                    int var146 = field6280[field6295 + 1];
                    class368 var147 = class106.field1449.method3068((byte) -31, var145);
                    field6287[field6282++] = var147.method2184(var146, 123);
                    return;
                }
                if (arg0 == 3408) {
                    field6295 -= 4;
                    int var148 = field6280[field6295];
                    int var149 = field6280[field6295 + 1];
                    int var150 = field6280[field6295 + 2];
                    int var151 = field6280[field6295 + 3];
                    class368 var152 = class106.field1449.method3068((byte) -53, var150);
                    if (var152.field5028 == var148 && var152.field5015 == var149) {
                        if (var149 == 115) {
                            field6287[field6282++] = var152.method2184(var151, 13);
                            return;
                        }
                        field6280[field6295++] = var152.method2183((byte) 120, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6295 -= 3;
                    int var153 = field6280[field6295];
                    int var154 = field6280[field6295 + 1];
                    int var155 = field6280[field6295 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class368 var156 = class106.field1449.method3068((byte) -114, var154);
                    if (var156.field5015 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6280[field6295++] = var156.method2188(var155, (byte) -123) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field6280[--field6295];
                    String var158 = field6287[--field6282];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class368 var159 = class106.field1449.method3068((byte) -46, var157);
                    if (var159.field5015 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6280[field6295++] = var159.method2189((byte) -127, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field6280[--field6295];
                    class368 var161 = class106.field1449.method3068((byte) -110, var160);
                    field6280[field6295++] = var161.field5019.method298(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class479.field7092 == 0) {
                        field6280[field6295++] = -2;
                        return;
                    }
                    if (class479.field7092 == 1) {
                        field6280[field6295++] = -1;
                        return;
                    }
                    field6280[field6295++] = class85.field1014;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field6280[--field6295];
                    if (class479.field7092 == 2 && var162 < class85.field1014) {
                        field6287[field6282++] = class52.field611[var162];
                        if (class465.field6912[var162] != null) {
                            field6287[field6282++] = class465.field6912[var162];
                            return;
                        }
                        field6287[field6282++] = "";
                        return;
                    }
                    field6287[field6282++] = "";
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field6280[--field6295];
                    if (class479.field7092 == 2 && var163 < class85.field1014) {
                        field6280[field6295++] = class91.field1090[var163];
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field6280[--field6295];
                    if (class479.field7092 == 2 && var164 < class85.field1014) {
                        field6280[field6295++] = class285.field3756[var164];
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field6287[--field6282];
                    int var166 = field6280[--field6295];
                    class367.method2181(var165, (byte) 107, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field6287[--field6282];
                    class260.method1603((byte) -126, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field6287[--field6282];
                    class395.method2380(12800, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field6287[--field6282];
                    class94.method526(false, 19, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field6287[--field6282];
                    class277.method1686(-22608, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field6287[--field6282];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field6280[field6295++] = class299.method1789(var171, 93) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field6280[--field6295];
                    if (class479.field7092 == 2 && var172 < class85.field1014) {
                        field6287[field6282++] = class380.field5506[var172];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class436.field6359 != null) {
                        field6287[field6282++] = class207.method1309(true, class436.field6359);
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class436.field6359 != null) {
                        field6280[field6295++] = class198.field2557;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field6280[--field6295];
                    if (class436.field6359 != null && var173 < class198.field2557) {
                        field6287[field6282++] = class54.field623[var173].field6794;
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field6280[--field6295];
                    if (class436.field6359 != null && var174 < class198.field2557) {
                        field6280[field6295++] = class54.field623[var174].field6797;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field6280[--field6295];
                    if (class436.field6359 != null && var175 < class198.field2557) {
                        field6280[field6295++] = class54.field623[var175].field6792;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6280[field6295++] = class265.field3556;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field6287[--field6282];
                    class283.method1711(var176, (byte) -110);
                    return;
                }
                if (arg0 == 3618) {
                    field6280[field6295++] = class317.field4242;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field6287[--field6282];
                    class485.method2952(var177, (byte) 83);
                    return;
                }
                if (arg0 == 3620) {
                    class511.method3055(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class479.field7092 == 0) {
                        field6280[field6295++] = -1;
                        return;
                    }
                    field6280[field6295++] = class327.field4351;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field6280[--field6295];
                    if (class479.field7092 != 0 && var178 < class327.field4351) {
                        field6287[field6282++] = class384.field5591[var178];
                        if (class161.field2091[var178] != null) {
                            field6287[field6282++] = class161.field2091[var178];
                            return;
                        }
                        field6287[field6282++] = "";
                        return;
                    }
                    field6287[field6282++] = "";
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field6287[--field6282];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field6280[field6295++] = class313.method1863((byte) -9, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field6280[--field6295];
                    if (class54.field623 != null && var180 < class198.field2557 && class54.field623[var180].field6796.equalsIgnoreCase(class96.field1170.field7783)) {
                        field6280[field6295++] = 1;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class357.field4868 != null) {
                        field6287[field6282++] = class357.field4868;
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field6280[--field6295];
                    if (class436.field6359 != null && var181 < class198.field2557) {
                        field6287[field6282++] = class54.field623[var181].field6789;
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field6280[--field6295];
                    if (class479.field7092 == 2 && var182 >= 0 && var182 < class85.field1014) {
                        field6280[field6295++] = class122.field1589[var182] ? 1 : 0;
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field6287[--field6282];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field6280[field6295++] = class264.method1618(4, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field6280[field6295++] = class293.field3876;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field6287[--field6282];
                    class94.method526(true, 26, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field6280[--field6295];
                    field6280[field6295++] = class127.field1646[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field6280[--field6295];
                    if (class436.field6359 != null && var186 < class198.field2557) {
                        field6287[field6282++] = class54.field623[var186].field6796;
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field6280[--field6295];
                    if (class479.field7092 != 0 && var187 < class327.field4351) {
                        field6287[field6282++] = class428.field6226[var187];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var188].method1084((byte) -116);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var189].field2443;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var190].field2446;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var191].field2448;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var192].field2449;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field6280[--field6295];
                    field6280[field6295++] = class88.field1060[var193].field2442;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field6280[--field6295];
                    int var195 = class88.field1060[var194].method1087(-21877);
                    field6280[field6295++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field6280[--field6295];
                    int var197 = class88.field1060[var196].method1087(-21877);
                    field6280[field6295++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field6280[--field6295];
                    int var199 = class88.field1060[var198].method1087(-21877);
                    field6280[field6295++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field6280[--field6295];
                    int var201 = class88.field1060[var200].method1087(-21877);
                    field6280[field6295++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6295 -= 2;
                    int var202 = field6280[field6295];
                    int var203 = field6280[field6295 + 1];
                    field6280[field6295++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6295 -= 2;
                    int var204 = field6280[field6295];
                    int var205 = field6280[field6295 + 1];
                    field6280[field6295++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6295 -= 2;
                    int var206 = field6280[field6295];
                    int var207 = field6280[field6295 + 1];
                    field6280[field6295++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6295 -= 2;
                    int var208 = field6280[field6295];
                    int var209 = field6280[field6295 + 1];
                    field6280[field6295++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field6280[--field6295];
                    field6280[field6295++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field6280[--field6295];
                    field6280[field6295++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6295 -= 5;
                    int var212 = field6280[field6295];
                    int var213 = field6280[field6295 + 1];
                    int var214 = field6280[field6295 + 2];
                    int var215 = field6280[field6295 + 3];
                    int var216 = field6280[field6295 + 4];
                    field6280[field6295++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6295 -= 2;
                    long var217 = (long) field6280[field6295];
                    long var219 = (long) field6280[field6295 + 1];
                    field6280[field6295++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6295 -= 2;
                    int var221 = field6280[field6295];
                    int var222 = field6280[field6295 + 1];
                    field6280[field6295++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6295 -= 2;
                    int var223 = field6280[field6295];
                    int var224 = field6280[field6295 + 1];
                    field6280[field6295++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6295 -= 2;
                    int var225 = field6280[field6295];
                    int var226 = field6280[field6295 + 1];
                    field6280[field6295++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6295 -= 2;
                    int var227 = field6280[field6295];
                    int var228 = field6280[field6295 + 1];
                    field6280[field6295++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6295 -= 2;
                    int var229 = field6280[field6295];
                    int var230 = field6280[field6295 + 1];
                    if (var229 == 0) {
                        field6280[field6295++] = 0;
                        return;
                    }
                    field6280[field6295++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6295 -= 2;
                    int var231 = field6280[field6295];
                    int var232 = field6280[field6295 + 1];
                    if (var231 == 0) {
                        field6280[field6295++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field6280[field6295++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6280[field6295++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6295 -= 2;
                    int var233 = field6280[field6295];
                    int var234 = field6280[field6295 + 1];
                    field6280[field6295++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6295 -= 2;
                    int var235 = field6280[field6295];
                    int var236 = field6280[field6295 + 1];
                    field6280[field6295++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6295 -= 2;
                    int var237 = field6280[field6295];
                    int var238 = field6280[field6295 + 1];
                    field6280[field6295++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6295 -= 2;
                    int var239 = field6280[field6295];
                    int var240 = field6280[field6295 + 1];
                    field6280[field6295++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6295 -= 3;
                    long var241 = (long) field6280[field6295];
                    long var243 = (long) field6280[field6295 + 1];
                    long var245 = (long) field6280[field6295 + 2];
                    field6280[field6295++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field6287[--field6282];
                    int var248 = field6280[--field6295];
                    field6287[field6282++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field6282 -= 2;
                    String var249 = field6287[field6282];
                    String var250 = field6287[field6282 + 1];
                    field6287[field6282++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field6287[--field6282];
                    int var252 = field6280[--field6295];
                    field6287[field6282++] = var251 + class470.method2869(var252, true, (byte) -51);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field6287[--field6282];
                    field6287[field6282++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6287[field6282++] = method2662(field6280[--field6295]);
                    return;
                }
                if (arg0 == 4105) {
                    field6282 -= 2;
                    String var254 = field6287[field6282];
                    String var255 = field6287[field6282 + 1];
                    if (class96.field1170.field7833 != null && class96.field1170.field7833.field1814) {
                        field6287[field6282++] = var255;
                        return;
                    }
                    field6287[field6282++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field6280[--field6295];
                    field6287[field6282++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field6282 -= 2;
                    field6280[field6295++] = class444.method2745((byte) -41, field6287[field6282], field6287[field6282 + 1], class374.field5072);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field6287[--field6282];
                    field6295 -= 2;
                    int var258 = field6280[field6295];
                    int var259 = field6280[field6295 + 1];
                    class183 var260 = class123.method733(0, var259, -101, class98.field1309);
                    field6280[field6295++] = var260.method1056(var257, 169, class302.field3996, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field6287[--field6282];
                    field6295 -= 2;
                    int var262 = field6280[field6295];
                    int var263 = field6280[field6295 + 1];
                    class183 var264 = class123.method733(0, var263, -107, class98.field1309);
                    field6280[field6295++] = var264.method1068(var261, (byte) -46, var262, class302.field3996);
                    return;
                }
                if (arg0 == 4110) {
                    field6282 -= 2;
                    String var265 = field6287[field6282];
                    String var266 = field6287[field6282 + 1];
                    if (field6280[--field6295] == 1) {
                        field6287[field6282++] = var265;
                        return;
                    }
                    field6287[field6282++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field6287[--field6282];
                    field6287[field6282++] = class401.method2476(var267, false);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field6287[--field6282];
                    int var269 = field6280[--field6295];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6287[field6282++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field6280[--field6295];
                    field6280[field6295++] = class203.method1300(false, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field6280[--field6295];
                    field6280[field6295++] = class273.method1663((char) var271, (byte) 110) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field6280[--field6295];
                    field6280[field6295++] = class291.method1747((char) var272, 30987) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field6280[--field6295];
                    field6280[field6295++] = class40.method237((byte) 19, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field6287[--field6282];
                    if (var274 != null) {
                        field6280[field6295++] = var274.length();
                        return;
                    }
                    field6280[field6295++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field6287[--field6282];
                    field6295 -= 2;
                    int var276 = field6280[field6295];
                    int var277 = field6280[field6295 + 1];
                    field6287[field6282++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field6287[--field6282];
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
                    field6287[field6282++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field6287[--field6282];
                    field6295 -= 2;
                    int var284 = field6280[field6295];
                    int var285 = field6280[field6295 + 1];
                    field6280[field6295++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field6282 -= 2;
                    String var286 = field6287[field6282];
                    String var287 = field6287[field6282 + 1];
                    int var288 = field6280[--field6295];
                    field6280[field6295++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field6280[--field6295];
                    field6280[field6295++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field6280[--field6295];
                    field6280[field6295++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field6280[--field6295] != 0;
                    int var292 = field6280[--field6295];
                    field6287[field6282++] = class433.method2665((long) var292, var291, 0, class374.field5072, 10);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field6287[--field6282];
                    int var294 = field6280[--field6295];
                    class183 var295 = class123.method733(0, var294, -96, class98.field1309);
                    field6280[field6295++] = var295.method1058(-1, var293, class302.field3996);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field6280[--field6295];
                    field6287[field6282++] = class237.field3158.method236(-18315, var296).field2623;
                    return;
                }
                if (arg0 == 4201) {
                    field6295 -= 2;
                    int var297 = field6280[field6295];
                    int var298 = field6280[field6295 + 1];
                    class199 var299 = class237.field3158.method236(-18315, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field2655[var298 - 1] != null) {
                        field6287[field6282++] = var299.field2655[var298 - 1];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6295 -= 2;
                    int var300 = field6280[field6295];
                    int var301 = field6280[field6295 + 1];
                    class199 var302 = class237.field3158.method236(-18315, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field2653[var301 - 1] != null) {
                        field6287[field6282++] = var302.field2653[var301 - 1];
                        return;
                    }
                    field6287[field6282++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field6280[--field6295];
                    field6280[field6295++] = class237.field3158.method236(-18315, var303).field2642;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field6280[--field6295];
                    field6280[field6295++] = class237.field3158.method236(-18315, var304).field2606 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field6280[--field6295];
                    class199 var306 = class237.field3158.method236(-18315, var305);
                    if (var306.field2601 == -1 && var306.field2641 >= 0) {
                        field6280[field6295++] = var306.field2641;
                        return;
                    }
                    field6280[field6295++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field6280[--field6295];
                    class199 var308 = class237.field3158.method236(-18315, var307);
                    if (var308.field2601 >= 0 && var308.field2641 >= 0) {
                        field6280[field6295++] = var308.field2641;
                        return;
                    }
                    field6280[field6295++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field6280[--field6295];
                    field6280[field6295++] = class237.field3158.method236(-18315, var309).field2598 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6295 -= 2;
                    int var310 = field6280[field6295];
                    int var311 = field6280[field6295 + 1];
                    class87 var312 = class104.field1405.method449((byte) -57, var311);
                    if (var312.method481(115)) {
                        field6287[field6282++] = class237.field3158.method236(-18315, var310).method1278(var312.field1033, false, var311);
                        return;
                    }
                    field6280[field6295++] = class237.field3158.method236(-18315, var310).method1285(477, var312.field1031, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field6295 -= 2;
                    int var313 = field6280[field6295];
                    int var314 = field6280[field6295 + 1] - 1;
                    class199 var315 = class237.field3158.method236(-18315, var313);
                    if (var315.field2587 == var314) {
                        field6280[field6295++] = var315.field2588;
                        return;
                    }
                    if (var315.field2620 == var314) {
                        field6280[field6295++] = var315.field2649;
                        return;
                    }
                    field6280[field6295++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field6287[--field6282];
                    int var317 = field6280[--field6295];
                    class227.method1461(88, var317 == 1, var316);
                    field6280[field6295++] = class530.field7780;
                    return;
                }
                if (arg0 == 4211) {
                    if (class374.field5076 != null && class474.field7029 < class530.field7780) {
                        field6280[field6295++] = class374.field5076[class474.field7029++] & 0xFFFF;
                        return;
                    }
                    field6280[field6295++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class474.field7029 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6295 -= 2;
                    int var318 = field6280[field6295];
                    int var319 = field6280[field6295 + 1];
                    class87 var320 = class104.field1405.method449((byte) 119, var319);
                    if (var320.method481(115)) {
                        field6287[field6282++] = class87.field1032.method1670((byte) -128, var318).method1359(var319, var320.field1033, -26180);
                        return;
                    }
                    field6280[field6295++] = class87.field1032.method1670((byte) -63, var318).method1354((byte) 49, var320.field1031, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6295 -= 2;
                    int var321 = field6280[field6295];
                    int var322 = field6280[field6295 + 1];
                    class87 var323 = class104.field1405.method449((byte) 7, var322);
                    if (var323.method481(115)) {
                        field6287[field6282++] = class123.field1593.method2920(var321, 19219).method407(true, var322, var323.field1033);
                        return;
                    }
                    field6280[field6295++] = class123.field1593.method2920(var321, 19219).method419(-29295, var323.field1031, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6295 -= 2;
                    int var324 = field6280[field6295];
                    int var325 = field6280[field6295 + 1];
                    class87 var326 = class104.field1405.method449((byte) 118, var325);
                    if (var326.method481(115)) {
                        field6287[field6282++] = class505.field7341.method1571(var324, 1).method1795(var325, var326.field1033, -15331);
                        return;
                    }
                    field6280[field6295++] = class505.field7341.method1571(var324, 1).method1796(1, var326.field1031, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field6280[--field6295];
                class306 var328 = class254.field3381.method1921(var327, (byte) 111);
                if (var328.field4091 != null && var328.field4091.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field4086[0];
                    for (int var331 = 1; var331 < var328.field4091.length; var331++) {
                        if (var328.field4086[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field4086[var331];
                        }
                    }
                    field6280[field6295++] = var328.field4091[var329];
                    return;
                }
                field6280[field6295++] = var328.field4059;
                return;
            }
        } else {
            class450 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class406.method2490((byte) -116, field6280[--field6295]);
            } else {
                var47 = arg1 ? field6289 : field6288;
            }
            if (arg0 == 1300) {
                int var48 = field6280[--field6295] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2789(field6287[--field6282], var48, 63);
                    return;
                } else {
                    field6282--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field6295 -= 2;
                int var49 = field6280[field6295];
                int var50 = field6280[field6295 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field6616 = null;
                    return;
                }
                var47.field6616 = class19.method108(true, var49, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field6280[--field6295];
                if (class342.field4588 != var51 && class509.field7387 != var51 && class429.field6240 != var51) {
                    return;
                }
                var47.field6592 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field6639 = field6280[--field6295];
                return;
            }
            if (arg0 == 1304) {
                var47.field6591 = field6280[--field6295];
                return;
            }
            if (arg0 == 1305) {
                var47.field6631 = field6287[--field6282];
                return;
            }
            if (arg0 == 1306) {
                var47.field6647 = field6287[--field6282];
                return;
            }
            if (arg0 == 1307) {
                var47.field6622 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field6650 = field6280[--field6295];
                var47.field6614 = field6280[--field6295];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field6280[--field6295];
                int var53 = field6280[--field6295];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2783(var52, (byte) -94, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field6547 = field6287[--field6282];
                return;
            }
            if (arg0 == 1311) {
                var47.field6700 = field6280[--field6295];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6295 -= 3;
                    var54 = field6280[field6295] - 1;
                    var55 = field6280[field6295 + 1];
                    var56 = field6280[field6295 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6295 -= 2;
                    var54 = 10;
                    var55 = field6280[field6295];
                    var56 = field6280[field6295 + 1];
                }
                if (var47.field6581 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field6581 = new byte[11];
                    var47.field6582 = new byte[11];
                    var47.field6596 = new int[11];
                }
                var47.field6581[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field6653 = false;
                    for (int var57 = 0; var57 < var47.field6581.length; var57++) {
                        if (var47.field6581[var57] != 0) {
                            var47.field6653 = true;
                            break;
                        }
                    }
                } else {
                    var47.field6653 = true;
                }
                var47.field6582[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field6637 = field6280[--field6295];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    private static final void method2661(int arg0) {
        class450 var1 = class406.method2490((byte) -116, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class450[] var3 = class363.field4969[var2];
        if (var3 == null) {
            class450[] var4 = class339.field4491[var2];
            int var5 = var4.length;
            var3 = class363.field4969[var2] = new class450[var5];
            class438.method2690(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class438.method2690(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2662(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6286.setTime(new Date(var1));
        int var3 = field6286.get(5);
        int var4 = field6286.get(2);
        int var5 = field6286.get(1);
        return var3 + "-" + field6298[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lun;I)V")
    private static final void method2663(class293 arg0, int arg1) {
        Object[] var2 = arg0.field3866;
        int var3 = (Integer) var2[0];
        class21 var4 = class23.method134(1707933639, var3);
        if (var4 == null) {
            return;
        }
        field6284 = new int[var4.field195];
        int var5 = 0;
        field6274 = new String[var4.field192];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3868;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3874;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3877 == null ? -1 : arg0.field3877.field6558;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3873;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3877 == null ? -1 : arg0.field3877.field6703;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3875 == null ? -1 : arg0.field3875.field6558;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3875 == null ? -1 : arg0.field3875.field6703;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3871;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3872;
                }
                field6284[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3878;
                }
                field6274[var6++] = var9;
            }
        }
        field6301 = arg0.field3865;
        method2652(var4, arg1);
    }
}
