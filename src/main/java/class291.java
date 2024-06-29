import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class291 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    private static int field4317 = 0;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[[I")
    private static int[][] field4319 = new int[5][5000];

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field4315 = new String[1000];

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    private static int field4323 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[Lhr;")
    private static class165[] field4318 = new class165[50];

    @OriginalMember(owner = "client!im", name = "v", descriptor = "[I")
    private static int[] field4335 = new int[5];

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    private static int field4331 = 0;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "[I")
    private static int[] field4338 = new int[1000];

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4324 = Calendar.getInstance();

    @OriginalMember(owner = "client!im", name = "A", descriptor = "[I")
    private static int[] field4340 = new int[3];

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field4341 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!im", name = "z", descriptor = "Ler;")
    public static class157 field4339 = new class157(4);

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    private static int field4342 = 0;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lot;")
    private static class495 field4320;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Ljb;")
    private static class499 field4314;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Ljb;")
    private static class499 field4332;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
    private static int[] field4316;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field4325;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Luk;I)V", line = 4)
    private static final void method1875(class199 arg0, int arg1) {
        Object[] var2 = arg0.field2813;
        int var3 = (Integer) var2[0];
        class479 var4 = class390.method2404(var3, 13696);
        if (var4 == null) {
            return;
        }
        field4316 = new int[var4.field7003];
        int var5 = 0;
        field4325 = new String[var4.field6994];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2803;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2814;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2817 == null ? -1 : arg0.field2817.field7312;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2809;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2817 == null ? -1 : arg0.field2817.field7304;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2810 == null ? -1 : arg0.field2810.field7312;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2810 == null ? -1 : arg0.field2810.field7304;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2815;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2808;
                }
                field4316[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2805;
                }
                field4325[var6++] = var9;
            }
        }
        field4342 = arg0.field2812;
        method1885(var4, arg1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V", line = 86)
    private static final void method1876(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4338[field4317++] = class44.field654;
                return;
            }
            if (arg0 == 5001) {
                field4317 -= 3;
                class44.field654 = field4338[field4317];
                class55.field751 = class208.method1442(field4338[field4317 + 1], false);
                if (class55.field751 == null) {
                    class55.field751 = class170.field2468;
                }
                class48.field676 = field4338[field4317 + 2];
                field4337++;
                class179.method1287(false, class449.field6636);
                class75.field1006.method625(class44.field654, false);
                class75.field1006.method625(class55.field751.field671, false);
                class75.field1006.method625(class48.field676, false);
                return;
            }
            if (arg0 == 5002) {
                field4331 -= 2;
                String var2 = field4315[field4331];
                String var3 = field4315[field4331 + 1];
                field4317 -= 2;
                int var4 = field4338[field4317];
                int var5 = field4338[field4317 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4326++;
                class179.method1287(false, class481.field7015);
                class75.field1006.method625(class142.method951(-30, var2) + class142.method951(-44, var3) + 2, false);
                class75.field1006.method603(-95, var2);
                class75.field1006.method625(var4 - 1, false);
                class75.field1006.method625(var5, false);
                class75.field1006.method603(-109, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4338[--field4317];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class243.field3412[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field4315[field4331++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field4338[--field4317];
                int var9 = -1;
                if (var8 < 100 && class243.field3412[var8] != null) {
                    var9 = class424.field6321[var8];
                }
                field4338[field4317++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class55.field751 == null) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = class55.field751.field671;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field4315[--field4331];
                method1879(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4331 -= 2;
                String var11 = field4315[field4331];
                String var12 = field4315[field4331 + 1];
                if (class528.field7809 != 0 || (!class123.field1760 || class482.field7026) && !class422.field6304) {
                    field4334++;
                    class179.method1287(false, class247.field3444);
                    class75.field1006.method625(0, false);
                    int var13 = class75.field1006.field1292;
                    class75.field1006.method603(64, var11);
                    class327.method2114((byte) 58, var12, class75.field1006);
                    class75.field1006.method596(class75.field1006.field1292 - var13, false);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field4338[--field4317];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class491.field7176[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field4315[field4331++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field4338[--field4317];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class213.field2981[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field4315[field4331++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field4338[--field4317];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class38.field613[var18];
                }
                field4338[field4317++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class339.field5365 == null || class339.field5365.field4957 == null) {
                    var20 = class245.field3429;
                } else {
                    var20 = class339.field5365.method2087(115, true);
                }
                field4315[field4331++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field4338[field4317++] = class48.field676;
                return;
            }
            if (arg0 == 5017) {
                field4338[field4317++] = class326.field5003;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field4338[--field4317];
                int var22 = 0;
                if (var21 < 100 && class243.field3412[var21] != null) {
                    var22 = class424.field6321[var21];
                }
                field4338[field4317++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field4338[--field4317];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class332.field5131[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field4315[field4331++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class339.field5365 == null || class339.field5365.field4957 == null) {
                    var25 = class245.field3429;
                } else {
                    var25 = class339.field5365.method2090(0, false);
                }
                field4315[field4331++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field4338[--field4317];
                field4315[field4331++] = class258.field3604.method2110(var26, 127).field7193;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field4338[--field4317];
                class493 var28 = class258.field3604.method2110(var27, 126);
                if (var28.field7196 == null) {
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = var28.field7196.length;
                return;
            }
            if (arg0 == 5052) {
                field4317 -= 2;
                int var29 = field4338[field4317];
                int var30 = field4338[field4317 + 1];
                class493 var31 = class258.field3604.method2110(var29, 127);
                int var32 = var31.field7196[var30];
                field4338[field4317++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field4338[--field4317];
                class493 var34 = class258.field3604.method2110(var33, 127);
                if (var34.field7205 == null) {
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = var34.field7205.length;
                return;
            }
            if (arg0 == 5054) {
                field4317 -= 2;
                int var35 = field4338[field4317];
                int var36 = field4338[field4317 + 1];
                field4338[field4317++] = class258.field3604.method2110(var35, 126).field7205[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field4338[--field4317];
                field4315[field4331++] = class84.field1147.method3057(64, var37).method367(8);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field4338[--field4317];
                class54 var39 = class84.field1147.method3057(64, var38);
                if (var39.field728 == null) {
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = var39.field728.length;
                return;
            }
            if (arg0 == 5057) {
                field4317 -= 2;
                int var40 = field4338[field4317];
                int var41 = field4338[field4317 + 1];
                field4338[field4317++] = class84.field1147.method3057(64, var40).field728[var41];
                return;
            }
            if (arg0 == 5058) {
                field4320 = new class495();
                field4320.field7235 = field4338[--field4317];
                field4320.field7237 = class84.field1147.method3057(64, field4320.field7235);
                field4320.field7238 = new int[field4320.field7237.method365(-19359)];
                return;
            }
            if (arg0 == 5059) {
                field4327++;
                class179.method1287(false, class23.field353);
                class75.field1006.method625(0, false);
                int var42 = class75.field1006.field1292;
                class75.field1006.method625(0, false);
                class75.field1006.method600(field4320.field7235, -12891);
                field4320.field7237.method370(class75.field1006, field4320.field7238, 5782);
                class75.field1006.method596(class75.field1006.field1292 - var42, false);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field4315[--field4331];
                field4336++;
                class179.method1287(false, class504.field7525);
                class75.field1006.method625(0, false);
                int var44 = class75.field1006.field1292;
                class75.field1006.method603(-69, var43);
                class75.field1006.method600(field4320.field7235, -12891);
                field4320.field7237.method370(class75.field1006, field4320.field7238, 5782);
                class75.field1006.method596(class75.field1006.field1292 - var44, false);
                return;
            }
            if (arg0 == 5061) {
                field4327++;
                class179.method1287(false, class23.field353);
                class75.field1006.method625(0, false);
                int var45 = class75.field1006.field1292;
                class75.field1006.method625(1, false);
                class75.field1006.method600(field4320.field7235, -12891);
                field4320.field7237.method370(class75.field1006, field4320.field7238, 5782);
                class75.field1006.method596(class75.field1006.field1292 - var45, false);
                return;
            }
            if (arg0 == 5062) {
                field4317 -= 2;
                int var46 = field4338[field4317];
                int var47 = field4338[field4317 + 1];
                field4338[field4317++] = class258.field3604.method2110(var46, 126).field7201[var47];
                return;
            }
            if (arg0 == 5063) {
                field4317 -= 2;
                int var48 = field4338[field4317];
                int var49 = field4338[field4317 + 1];
                field4338[field4317++] = class258.field3604.method2110(var48, 126).field7195[var49];
                return;
            }
            if (arg0 == 5064) {
                field4317 -= 2;
                int var50 = field4338[field4317];
                int var51 = field4338[field4317 + 1];
                if (var51 == -1) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = class258.field3604.method2110(var50, 127).method2929(0, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field4317 -= 2;
                int var52 = field4338[field4317];
                int var53 = field4338[field4317 + 1];
                if (var53 == -1) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = class258.field3604.method2110(var52, 127).method2931(0, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field4338[--field4317];
                field4338[field4317++] = class84.field1147.method3057(64, var54).method365(-19359);
                return;
            }
            if (arg0 == 5067) {
                field4317 -= 2;
                int var55 = field4338[field4317];
                int var56 = field4338[field4317 + 1];
                int var57 = class84.field1147.method3057(64, var55).method366(var56, 0).field5375;
                field4338[field4317++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field4317 -= 2;
                int var58 = field4338[field4317];
                int var59 = field4338[field4317 + 1];
                field4320.field7238[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field4317 -= 2;
                int var60 = field4338[field4317];
                int var61 = field4338[field4317 + 1];
                field4320.field7238[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field4317 -= 3;
                int var62 = field4338[field4317];
                int var63 = field4338[field4317 + 1];
                int var64 = field4338[field4317 + 2];
                class54 var65 = class84.field1147.method3057(64, var62);
                if (var65.method366(var63, 0).field5375 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4338[field4317++] = var65.method363(var64, (byte) 19, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field4315[--field4331];
                boolean var67 = field4338[--field4317] == 1;
                class317.method2064((byte) -82, var67, var66);
                field4338[field4317++] = class257.field3596;
                return;
            }
            if (arg0 == 5072) {
                if (class480.field7011 != null && class453.field6648 < class257.field3596) {
                    field4338[field4317++] = class480.field7011[class453.field6648++] & 0xFFFF;
                    return;
                }
                field4338[field4317++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class453.field6648 = 0;
                return;
            }
            if (arg0 == 5074) {
                field4327++;
                class179.method1287(false, class23.field353);
                class75.field1006.method625(0, false);
                int var68 = class75.field1006.field1292;
                class75.field1006.method625(2, false);
                class75.field1006.method600(field4320.field7235, -12891);
                field4320.field7237.method370(class75.field1006, field4320.field7238, 5782);
                class75.field1006.method596(class75.field1006.field1292 - var68, false);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class382.field5821.method705((byte) 43, 86)) {
                    field4338[field4317++] = 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class382.field5821.method705((byte) 43, 82)) {
                    field4338[field4317++] = 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class382.field5821.method705((byte) 43, 81)) {
                    field4338[field4317++] = 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class11.method97(field4338[--field4317], (byte) -112);
                return;
            }
            if (arg0 == 5201) {
                field4338[field4317++] = class486.method2899(256);
                return;
            }
            if (arg0 == 5205) {
                class420.method2532(field4338[--field4317], (byte) -124, -1, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field4338[--field4317];
                class316 var70 = class135.method875(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = var70.field4833;
                return;
            }
            if (arg0 == 5207) {
                class316 var71 = class135.method886(field4338[--field4317]);
                if (var71 != null && var71.field4823 != null) {
                    field4315[field4331++] = var71.field4823;
                    return;
                }
                field4315[field4331++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4338[field4317++] = class288.field4294;
                field4338[field4317++] = class520.field7712;
                return;
            }
            if (arg0 == 5209) {
                field4338[field4317++] = class277.field3839 + class135.field1969;
                field4338[field4317++] = class501.field7487 + class135.field1974;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field4338[--field4317];
                class316 var73 = class135.method886(var72);
                if (var73 == null) {
                    field4338[field4317++] = 0;
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = var73.field4836 >> 14 & 0x3FFF;
                field4338[field4317++] = var73.field4836 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field4338[--field4317];
                class316 var75 = class135.method886(var74);
                if (var75 == null) {
                    field4338[field4317++] = 0;
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = var75.field4819 - var75.field4837;
                field4338[field4317++] = var75.field4817 - var75.field4834;
                return;
            }
            if (arg0 == 5212) {
                class5 var76 = class44.method338(-83);
                if (var76 == null) {
                    field4338[field4317++] = -1;
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = var76.field65;
                int var77 = var76.field70 << 28 | class135.field1969 + var76.field69 << 14 | class135.field1974 + var76.field66;
                field4338[field4317++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class5 var78 = class254.method1655(42);
                if (var78 == null) {
                    field4338[field4317++] = -1;
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = var78.field65;
                int var79 = var78.field70 << 28 | class135.field1969 + var78.field69 << 14 | class135.field1974 + var78.field66;
                field4338[field4317++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field4338[--field4317];
                class316 var81 = class229.method1572(-16777216);
                if (var81 != null) {
                    boolean var82 = var81.method2051(0, var80 >> 14 & 0x3FFF, var80 >> 28 & 0x3, var80 & 0x3FFF, field4340);
                    if (var82) {
                        class172.method1206(field4340[1], 58, field4340[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4317 -= 2;
                int var83 = field4338[field4317];
                int var84 = field4338[field4317 + 1];
                class233 var85 = class135.method882(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class316 var87 = (class316) var85.method1581((byte) 53); var87 != null; var87 = (class316) var85.method1585(-1)) {
                    if (var87.field4833 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field4338[field4317++] = 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field4338[--field4317];
                class316 var89 = class135.method886(var88);
                if (var89 == null) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = var89.field4818;
                return;
            }
            if (arg0 == 5220) {
                field4338[field4317++] = class369.field5668 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field4338[--field4317];
                class172.method1206(var90 >> 14 & 0x3FFF, 47, var90 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class316 var91 = class229.method1572(-16777216);
                if (var91 != null) {
                    boolean var92 = var91.method2050(class277.field3839 + class135.field1969, class501.field7487 + class135.field1974, field4340, (byte) -69);
                    if (var92) {
                        field4338[field4317++] = field4340[1];
                        field4338[field4317++] = field4340[2];
                        return;
                    }
                    field4338[field4317++] = -1;
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = -1;
                field4338[field4317++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4317 -= 2;
                int var93 = field4338[field4317];
                int var94 = field4338[field4317 + 1];
                class420.method2532(var93, (byte) -126, var94 & 0x3FFF, false, var94 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field4338[--field4317];
                class316 var96 = class229.method1572(-16777216);
                if (var96 != null) {
                    boolean var97 = var96.method2051(0, var95 >> 14 & 0x3FFF, var95 >> 28 & 0x3, var95 & 0x3FFF, field4340);
                    if (var97) {
                        field4338[field4317++] = field4340[1];
                        field4338[field4317++] = field4340[2];
                        return;
                    }
                    field4338[field4317++] = -1;
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = -1;
                field4338[field4317++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field4338[--field4317];
                class316 var99 = class229.method1572(-16777216);
                if (var99 != null) {
                    boolean var100 = var99.method2050(var98 >> 14 & 0x3FFF, var98 & 0x3FFF, field4340, (byte) -69);
                    if (var100) {
                        field4338[field4317++] = field4340[1];
                        field4338[field4317++] = field4340[2];
                        return;
                    }
                    field4338[field4317++] = -1;
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = -1;
                field4338[field4317++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class438.method2651((byte) 99, field4338[--field4317]);
                return;
            }
            if (arg0 == 5227) {
                field4317 -= 2;
                int var101 = field4338[field4317];
                int var102 = field4338[field4317 + 1];
                class420.method2532(var101, (byte) -121, var102 & 0x3FFF, true, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class511.field7594 = field4338[--field4317] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4338[field4317++] = class511.field7594 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field4338[--field4317];
                class174.method1211(var103, (byte) -104);
                return;
            }
            if (arg0 == 5231) {
                field4317 -= 2;
                int var104 = field4338[field4317];
                boolean var105 = field4338[field4317 + 1] == 1;
                if (class169.field2459 != null) {
                    class467 var106 = class169.field2459.method943((long) var104, -1);
                    if (var106 != null && !var105) {
                        var106.method2785((byte) -120);
                        return;
                    }
                    if (var106 == null && var105) {
                        class467 var107 = new class467();
                        class169.field2459.method940((long) var104, -107, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field4338[--field4317];
                if (class169.field2459 != null) {
                    class467 var109 = class169.field2459.method943((long) var108, -1);
                    field4338[field4317++] = var109 == null ? 0 : 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4317 -= 2;
                int var110 = field4338[field4317];
                boolean var111 = field4338[field4317 + 1] == 1;
                if (class396.field6016 != null) {
                    class467 var112 = class396.field6016.method943((long) var110, -1);
                    if (var112 != null && !var111) {
                        var112.method2785((byte) -120);
                        return;
                    }
                    if (var112 == null && var111) {
                        class467 var113 = new class467();
                        class396.field6016.method940((long) var110, -76, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field4338[--field4317];
                if (class396.field6016 != null) {
                    class467 var115 = class396.field6016.method943((long) var114, -1);
                    field4338[field4317++] = var115 == null ? 0 : 1;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4338[field4317++] = class135.field1952 == null ? -1 : class135.field1952.field4833;
                return;
            }
            if (arg0 == 5236) {
                field4317 -= 2;
                int var116 = field4338[field4317];
                int var117 = field4338[field4317 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class338.method2188(var118, var116, var119, (byte) -109);
                if (var120 < 0) {
                    field4338[field4317++] = -1;
                    return;
                }
                field4338[field4317++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4317 -= 2;
                int var121 = field4338[field4317];
                int var122 = field4338[field4317 + 1];
                class41.method326(var121, 108, var122, 3, false);
                field4338[field4317++] = class260.field3628 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class260.field3628 != null) {
                    class41.method326(-1, 112, -1, class96.field1399.field5234, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class168[] var123 = class166.method1167(0);
                field4338[field4317++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field4338[--field4317];
                class168[] var125 = class166.method1167(0);
                field4338[field4317++] = var125[var124].field2441;
                field4338[field4317++] = var125[var124].field2437;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class96.field1399.field5228;
                int var127 = class96.field1399.field5207;
                int var128 = -1;
                class168[] var129 = class166.method1167(0);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class168 var131 = var129[var130];
                    if (var131.field2441 == var126 && var131.field2437 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field4338[field4317++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field4338[field4317++] = class320.method2074(-32190);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field4338[--field4317];
                if (var132 >= 1 && var132 <= 2) {
                    class41.method326(-1, 121, -1, var132, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4338[field4317++] = class96.field1399.field5234;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field4338[--field4317];
                if (var133 >= 1 && var133 <= 2) {
                    class96.field1399.field5234 = var133;
                    class96.field1399.method1731(true, class419.field6254);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4331 -= 2;
                String var134 = field4315[field4331];
                String var135 = field4315[field4331 + 1];
                int var136 = field4338[--field4317];
                field4330++;
                class179.method1287(false, class11.field190);
                class75.field1006.method625(class142.method951(-40, var134) + class142.method951(-40, var135) + 1, false);
                class75.field1006.method603(-74, var134);
                class75.field1006.method603(-87, var135);
                class75.field1006.method625(var136, false);
                return;
            }
            if (arg0 == 5401) {
                field4317 -= 2;
                class232.field3300[field4338[field4317]] = (short) class73.method487(-109, field4338[field4317 + 1]);
                class84.field1154.method2447((byte) 53);
                class84.field1154.method2452(-1);
                class410.field6175.method1215(100);
                class268.method1710(true);
                return;
            }
            if (arg0 == 5405) {
                field4317 -= 2;
                int var137 = field4338[field4317];
                int var138 = field4338[field4317 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class336.field5230[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4317 -= 7;
                int var139 = field4338[field4317];
                int var140 = field4338[field4317 + 1] << 1;
                int var141 = field4338[field4317 + 2];
                int var142 = field4338[field4317 + 3];
                int var143 = field4338[field4317 + 4];
                int var144 = field4338[field4317 + 5];
                int var145 = field4338[field4317 + 6];
                if (var139 >= 0 && var139 < 2 && class336.field5230[var139] != null && var140 >= 0 && var140 < class336.field5230[var139].length) {
                    class336.field5230[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class336.field5230[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class336.field5230[field4338[--field4317]].length >> 1;
                field4338[field4317++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class260.field3628 != null) {
                    class41.method326(-1, -96, -1, class96.field1399.field5234, false);
                }
                if (class452.field6646 != null) {
                    class74.method492(16);
                    System.exit(0);
                    return;
                }
                String var147 = class457.field6707 == null ? class74.method493(91) : class457.field6707;
                class216.method1470(true, false, class419.field6254, class441.field6563 == 1, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class93.field1353 != null) {
                    if (class93.field1353.field1793 == null) {
                        var148 = class428.method2567(class93.field1353.field1795, 992180488);
                    } else {
                        var148 = (String) class93.field1353.field1793;
                    }
                }
                field4315[field4331++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field4338[field4317++] = class469.field6854 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class260.field3628 != null) {
                    class41.method326(-1, -26, -1, class96.field1399.field5234, false);
                }
                String var149 = field4315[--field4331];
                boolean var150 = field4338[--field4317] == 1;
                String var151 = class74.method493(-107) + var149;
                class216.method1470(true, var150, class419.field6254, class441.field6563 == 1, var151);
                return;
            }
            if (arg0 == 5422) {
                field4331 -= 2;
                String var152 = field4315[field4331];
                String var153 = field4315[field4331 + 1];
                int var154 = field4338[--field4317];
                if (var152.length() > 0) {
                    if (class100.field1443 == null) {
                        class100.field1443 = new String[class73.field988[class393.field5983.field5120]];
                    }
                    class100.field1443[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class148.field2126 == null) {
                        class148.field2126 = new String[class73.field988[class393.field5983.field5120]];
                    }
                    class148.field2126[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4315[--field4331]);
                return;
            }
            if (arg0 == 5424) {
                field4317 -= 11;
                class367.field5659 = field4338[field4317];
                class13.field208 = field4338[field4317 + 1];
                class194.field2763 = field4338[field4317 + 2];
                class23.field355 = field4338[field4317 + 3];
                class314.field4801 = field4338[field4317 + 4];
                class384.field5870 = field4338[field4317 + 5];
                class518.field7680 = field4338[field4317 + 6];
                class516.field7663 = field4338[field4317 + 7];
                class281.field3877 = field4338[field4317 + 8];
                class20.field319 = field4338[field4317 + 9];
                class110.field1547 = field4338[field4317 + 10];
                class113.field1576.method2624(-110, class314.field4801);
                class113.field1576.method2624(-119, class384.field5870);
                class113.field1576.method2624(-97, class518.field7680);
                class113.field1576.method2624(-92, class516.field7663);
                class113.field1576.method2624(-126, class281.field3877);
                class62.field888 = null;
                class408.field6158 = null;
                class138.field2006 = null;
                class170.field2471 = null;
                class94.field1372 = null;
                class396.field6018 = null;
                class192.field2714 = null;
                class487.field7142 = null;
                class207.field2923 = true;
                return;
            }
            if (arg0 == 5425) {
                class220.method1493(true);
                class207.field2923 = false;
                return;
            }
            if (arg0 == 5426) {
                field4317 -= 2;
                class170.field2470 = field4338[field4317];
                class286.field4260 = field4338[field4317 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4317 -= 2;
                class107.field1517 = field4338[field4317 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4317 -= 2;
                int var155 = field4338[field4317];
                int var156 = field4338[field4317 + 1];
                field4338[field4317++] = class389.method2400(var156, 120, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class507.method3024(field4315[--field4331], -31, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class131.method841(class419.field6254.field6861, -14144, "accountcreated");
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4317 -= 4;
                int var157 = field4338[field4317];
                int var158 = field4338[field4317 + 1];
                int var159 = field4338[field4317 + 2];
                int var160 = field4338[field4317 + 3];
                class231.method1576((var157 >> 14 & 0x3FFF) - class82.field1105, false, -115, var159, var160, var158, (var157 & 0x3FFF) - class437.field6477);
                return;
            }
            if (arg0 == 5501) {
                field4317 -= 4;
                int var161 = field4338[field4317];
                int var162 = field4338[field4317 + 1];
                int var163 = field4338[field4317 + 2];
                int var164 = field4338[field4317 + 3];
                class69.method477((var161 >> 14 & 0x3FFF) - class82.field1105, var162, (var161 & 0x3FFF) - class437.field6477, var164, (byte) 127, var163);
                return;
            }
            if (arg0 == 5502) {
                field4317 -= 6;
                int var165 = field4338[field4317];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class479.field7007 = var165;
                int var166 = field4338[field4317 + 1];
                if (var166 + 1 >= class336.field5230[class479.field7007].length >> 1) {
                    throw new RuntimeException();
                }
                class87.field1195 = var166;
                class21.field331 = 0;
                class194.field2766 = field4338[field4317 + 2];
                class483.field7032 = field4338[field4317 + 3];
                int var167 = field4338[field4317 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class11.field184 = var167;
                int var168 = field4338[field4317 + 5];
                if (var168 + 1 >= class336.field5230[class11.field184].length >> 1) {
                    throw new RuntimeException();
                }
                class85.field1166 = var168;
                class432.field6409 = 3;
                return;
            }
            if (arg0 == 5503) {
                class326.method2107(-6);
                return;
            }
            if (arg0 == 5504) {
                field4317 -= 2;
                class164.method1163(field4338[field4317], field4338[field4317 + 1], 3, 0);
                return;
            }
            if (arg0 == 5505) {
                field4338[field4317++] = (int) class99.field1428 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4338[field4317++] = (int) class482.field7022 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class379.method2350((byte) -48);
                return;
            }
            if (arg0 == 5508) {
                class10.method82((byte) 125);
                return;
            }
            if (arg0 == 5509) {
                class101.method683(-113);
                return;
            }
            if (arg0 == 5510) {
                class226.method1550(-1127);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field4338[--field4317];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class82.field1105;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class96.field1403) {
                    var172 = class96.field1403;
                }
                int var173 = var171 - class437.field6477;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class485.field7122) {
                    var173 = class485.field7122;
                }
                class274.field3815 = (var172 << 7) + 64;
                class209.field2963 = (var173 << 7) + 64;
                class432.field6409 = 4;
                return;
            }
            if (arg0 == 5512) {
                class314.method2039(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4331 -= 2;
                String var174 = field4315[field4331];
                String var175 = field4315[field4331 + 1];
                int var176 = field4338[--field4317];
                if (class144.field2077 != 10) {
                    return;
                }
                if (class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0 && class511.field7590 == 0) {
                    class85.method554(var176, var174, var175, -9413);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class129.method820((byte) 86);
                return;
            }
            if (arg0 == 5602) {
                if (class520.field7708 == 0) {
                    class376.field5748 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4317 -= 4;
                if (class144.field2077 != 10) {
                    return;
                }
                if (class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0 && class511.field7590 == 0) {
                    class23.method187(field4338[field4317], (byte) 91, field4338[field4317 + 1], field4338[field4317 + 2], field4338[field4317 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4331--;
                if (class144.field2077 != 10) {
                    return;
                }
                if (class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0 && class511.field7590 == 0) {
                    class337.method2175(class220.method1486(field4315[field4331], -48), (byte) -123);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4331 -= 3;
                field4317 -= 7;
                if (class144.field2077 != 10) {
                    return;
                }
                if (class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0 && class511.field7590 == 0) {
                    class34.method258(field4315[field4331 + 2], field4338[field4317 + 5] == 1, field4338[field4317 + 4] == 1, field4338[field4317], class220.method1486(field4315[field4331], -48), field4338[field4317 + 2], field4338[field4317 + 3], field4338[field4317 + 1], field4315[field4331 + 1], field4338[field4317 + 6] == 1, (byte) 106);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class16.field266 == 0) {
                    class443.field6602 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4338[field4317++] = class376.field5748;
                return;
            }
            if (arg0 == 5608) {
                field4338[field4317++] = class76.field1033;
                return;
            }
            if (arg0 == 5609) {
                field4338[field4317++] = class443.field6602;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field4315[field4331++] = class64.field899.length > var177 ? class223.method1509(class64.field899[var177], 0) : "";
                }
                class64.field899 = null;
                return;
            }
            if (arg0 == 5611) {
                field4338[field4317++] = class479.field7006;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field4338[--field4317];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class96.field1399.field5195 = var178;
                class349.method2220(111);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6002) {
                class96.field1399.method1737(field4338[--field4317] == 1, (byte) -121);
                class349.method2220(100);
                class151.method988(0);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6003) {
                class96.field1399.field5237 = field4338[--field4317] == 1;
                class151.method988(0);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6005) {
                class96.field1399.field5196 = field4338[--field4317] == 1;
                class349.method2220(120);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6006) {
                class96.field1399.field5200 = field4338[--field4317] == 1;
                class337.field5242.method1067(!class96.field1399.field5200);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6007) {
                class96.field1399.field5223 = field4338[--field4317];
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6008) {
                class96.field1399.field5208 = field4338[--field4317] == 1;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6009) {
                class96.field1399.field5235 = field4338[--field4317] == 1;
                class349.method2220(95);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6010) {
                class96.field1399.field5222 = field4338[--field4317] == 1;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field4338[--field4317];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class96.field1399.method2166(var179, -102, class441.field6563);
                class349.method2220(106);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6012) {
                class96.field1399.method2167(class441.field6563, field4338[--field4317] == 1, (byte) 77);
                class67.method446((byte) -128);
                class459.method2760((byte) -64);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6014) {
                class96.field1399.field5194 = field4338[--field4317] == 1;
                class349.method2220(120);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6015) {
                class96.field1399.field5220 = field4338[--field4317] == 1;
                class349.method2220(119);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field4338[--field4317];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class96.field1399.field5212 = var180;
                class310.method1995(true, class441.field6563);
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6017) {
                class96.field1399.field5198 = field4338[--field4317] == 1;
                class523.method3103(0);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field4338[--field4317];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class96.field1399.field5216 = var181;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field4338[--field4317];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class96.field1399.field5226 != var182) {
                    if (class96.field1399.field5226 == 0 && class102.field1459 != -1) {
                        class76.method503(var182, 0, class102.field1459, 114, class438.field6532, false);
                        class165.field2412 = false;
                    } else if (var182 == 0) {
                        class74.method491(true);
                        class165.field2412 = false;
                    } else {
                        class335.method2152((byte) -24, var182);
                    }
                    class96.field1399.field5226 = var182;
                }
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field4338[--field4317];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class96.field1399.field5221 = var183;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6021) {
                class96.field1399.field3773 = field4338[--field4317] == 1;
                class151.method988(0);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field4338[--field4317];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class455.field6684 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class466.method2784(var184, (byte) -54);
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                field4338[field4317++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field4338[--field4317];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class96.field1399.field5225 = var186;
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field4338[--field4317];
                if (var187 < 0 || var187 > class237.method1602(-90, class455.field6684)) {
                    var187 = 0;
                }
                class96.field1399.field5219 = var187;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field4338[--field4317];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class269.method1717(false, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class96.field1399.field5202 = field4338[--field4317] != 0;
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6029) {
                class96.field1399.field5223 = field4338[--field4317];
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6030) {
                class96.field1399.field5210 = field4338[--field4317] != 0;
                class96.field1399.method1731(true, class419.field6254);
                class349.method2220(118);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field4338[--field4317];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class310.method1995(true, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field4338[--field4317];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class96.field1399.field5239 = var190;
                class96.field1399.method1731(true, class419.field6254);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field4338[--field4317];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class96.field1399.field5204 = var191;
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6034) {
                class96.field1399.field5209 = field4338[--field4317] == 1;
                class96.field1399.method1731(true, class419.field6254);
                class67.method446((byte) -72);
                class406.field6129 = false;
                return;
            }
            if (arg0 == 6035) {
                class96.field1399.field3774 = field4338[--field4317] == 1;
                class349.method2220(82);
                class151.method988(0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4338[field4317++] = class96.field1399.field5195;
                return;
            }
            if (arg0 == 6102) {
                field4338[field4317++] = class96.field1399.method1733(class441.field6563, -121) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4338[field4317++] = class96.field1399.field5237 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4338[field4317++] = class96.field1399.field5196 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4338[field4317++] = class96.field1399.field5200 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4338[field4317++] = class96.field1399.field5223;
                return;
            }
            if (arg0 == 6108) {
                field4338[field4317++] = class96.field1399.field5208 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4338[field4317++] = class96.field1399.field5235 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4338[field4317++] = class96.field1399.field5222 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4338[field4317++] = class96.field1399.method2170(class441.field6563, true);
                return;
            }
            if (arg0 == 6112) {
                field4338[field4317++] = class96.field1399.method2171(class441.field6563, 120) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4338[field4317++] = class96.field1399.field5194 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4338[field4317++] = class96.field1399.field5220 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4338[field4317++] = class96.field1399.field5212;
                return;
            }
            if (arg0 == 6117) {
                field4338[field4317++] = class96.field1399.field5198 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4338[field4317++] = class96.field1399.field5216;
                return;
            }
            if (arg0 == 6119) {
                field4338[field4317++] = class96.field1399.field5226;
                return;
            }
            if (arg0 == 6120) {
                field4338[field4317++] = class96.field1399.field5221;
                return;
            }
            if (arg0 == 6121) {
                field4338[field4317++] = class337.field5242.method1065() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4338[field4317++] = class453.method2728(2);
                return;
            }
            if (arg0 == 6124) {
                field4338[field4317++] = class96.field1399.field5225;
                return;
            }
            if (arg0 == 6125) {
                field4338[field4317++] = class96.field1399.field5219;
                return;
            }
            if (arg0 == 6126) {
                field4338[field4317++] = class337.field5242.method1089() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4338[field4317++] = class96.field1399.field5211 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4338[field4317++] = class96.field1399.field5202 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4338[field4317++] = class96.field1399.field5223;
                return;
            }
            if (arg0 == 6130) {
                field4338[field4317++] = class96.field1399.field5210 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4338[field4317++] = class441.field6563;
                return;
            }
            if (arg0 == 6132) {
                field4338[field4317++] = class96.field1399.field5239;
                return;
            }
            if (arg0 == 6133) {
                field4338[field4317++] = class469.field6854 == 1 || class469.field6854 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4338[field4317++] = class237.method1602(-124, class455.field6684);
                return;
            }
            if (arg0 == 6135) {
                field4338[field4317++] = class96.field1399.field5204;
                return;
            }
            if (arg0 == 6136) {
                field4338[field4317++] = class96.field1399.field5209 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4317 -= 2;
                class381.field5811 = (short) field4338[field4317];
                if (class381.field5811 <= 0) {
                    class381.field5811 = 256;
                }
                class362.field5618 = (short) field4338[field4317 + 1];
                if (class362.field5618 <= 0) {
                    class362.field5618 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4317 -= 2;
                class462.field6767 = (short) field4338[field4317];
                if (class462.field6767 <= 0) {
                    class462.field6767 = 256;
                }
                class208.field2940 = (short) field4338[field4317 + 1];
                if (class208.field2940 <= 0) {
                    class208.field2940 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4317 -= 4;
                class103.field1470 = (short) field4338[field4317];
                if (class103.field1470 <= 0) {
                    class103.field1470 = 1;
                }
                class126.field1797 = (short) field4338[field4317 + 1];
                if (class126.field1797 <= 0) {
                    class126.field1797 = 32767;
                } else if (class126.field1797 < class103.field1470) {
                    class126.field1797 = class103.field1470;
                }
                class259.field3620 = (short) field4338[field4317 + 2];
                if (class259.field3620 <= 0) {
                    class259.field3620 = 1;
                }
                class405.field6123 = (short) field4338[field4317 + 3];
                if (class405.field6123 <= 0) {
                    class405.field6123 = 32767;
                    return;
                }
                if (class405.field6123 < class259.field3620) {
                    class405.field6123 = class259.field3620;
                }
                return;
            }
            if (arg0 == 6203) {
                class282.method1767(class38.field603.field7386, false, -16777216, class38.field603.field7348, 0, 0);
                field4338[field4317++] = class130.field1908;
                field4338[field4317++] = class99.field1429;
                return;
            }
            if (arg0 == 6204) {
                field4338[field4317++] = class462.field6767;
                field4338[field4317++] = class208.field2940;
                return;
            }
            if (arg0 == 6205) {
                field4338[field4317++] = class381.field5811;
                field4338[field4317++] = class362.field5618;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4338[field4317++] = (int) (class264.method1698(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4338[field4317++] = (int) (class264.method1698(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4317 -= 3;
                int var192 = field4338[field4317];
                int var193 = field4338[field4317 + 1];
                int var194 = field4338[field4317 + 2];
                field4324.clear();
                field4324.set(11, 12);
                field4324.set(var194, var193, var192);
                field4338[field4317++] = (int) (field4324.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field4324.clear();
                field4324.setTime(new Date(class264.method1698(true)));
                field4338[field4317++] = field4324.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field4338[--field4317];
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
                field4338[field4317++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4338[field4317++] = class267.method1708((byte) 12) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4338[field4317++] = class142.method949(10680) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class144.field2077 == 10 && class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0) {
                    field4338[field4317++] = class384.method2377(1) == -1 ? 0 : 1;
                    return;
                }
                field4338[field4317++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class349 var197 = class525.method3114((byte) -110);
                if (var197 != null) {
                    field4338[field4317++] = var197.field5438;
                    field4338[field4317++] = var197.field6178;
                    field4315[field4331++] = var197.field5434;
                    class29 var198 = var197.method2219(64);
                    field4338[field4317++] = var198.field453;
                    field4315[field4331++] = var198.field451;
                    field4338[field4317++] = var197.field6184;
                    field4338[field4317++] = var197.field5442;
                    return;
                }
                field4338[field4317++] = -1;
                field4338[field4317++] = 0;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class349 var199 = class219.method1481((byte) 53);
                if (var199 != null) {
                    field4338[field4317++] = var199.field5438;
                    field4338[field4317++] = var199.field6178;
                    field4315[field4331++] = var199.field5434;
                    class29 var200 = var199.method2219(72);
                    field4338[field4317++] = var200.field453;
                    field4315[field4331++] = var200.field451;
                    field4338[field4317++] = var199.field6184;
                    field4338[field4317++] = var199.field5442;
                    return;
                }
                field4338[field4317++] = -1;
                field4338[field4317++] = 0;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field4338[--field4317];
                if (class144.field2077 == 10 && class215.field2993 == 0 && class520.field7708 == 0 && class16.field266 == 0) {
                    field4338[field4317++] = class331.method2138(7000, var201) ? 1 : 0;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class96.field1399.field5215 = field4338[--field4317];
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6505) {
                field4338[field4317++] = class96.field1399.field5215;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field4338[--field4317];
                class349 var203 = class19.method147(-24048, var202);
                if (var203 != null) {
                    field4338[field4317++] = var203.field6178;
                    field4315[field4331++] = var203.field5434;
                    class29 var204 = var203.method2219(120);
                    field4338[field4317++] = var204.field453;
                    field4315[field4331++] = var204.field451;
                    field4338[field4317++] = var203.field6184;
                    field4338[field4317++] = var203.field5442;
                    return;
                }
                field4338[field4317++] = -1;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4315[field4331++] = "";
                field4338[field4317++] = 0;
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field4317 -= 4;
                int var205 = field4338[field4317];
                boolean var206 = field4338[field4317 + 1] == 1;
                int var207 = field4338[field4317 + 2];
                boolean var208 = field4338[field4317 + 3] == 1;
                class145.method963(var207, 12, var206, var208, var205);
                return;
            }
            if (arg0 == 6508) {
                class511.method3044((byte) 114);
                return;
            }
            if (arg0 == 6509) {
                if (class144.field2077 != 10) {
                    return;
                }
                class273.field3786 = field4338[--field4317] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class96.field1399.field5229 = field4338[--field4317] == 1;
                class96.field1399.method1731(true, class419.field6254);
                return;
            }
            if (arg0 == 6601) {
                field4338[field4317++] = class96.field1399.field5229 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class505.field7533 == class243.field3413) {
            if (arg0 == 6700) {
                int var209 = class27.field449.method939((byte) 103);
                if (class329.field5062 != -1) {
                    var209++;
                }
                field4338[field4317++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field4338[--field4317];
                if (class329.field5062 != -1) {
                    if (var210 == 0) {
                        field4338[field4317++] = class329.field5062;
                        return;
                    }
                    var210--;
                }
                class407 var211 = (class407) class27.field449.method948(71);
                while (var210-- > 0) {
                    var211 = (class407) class27.field449.method938(43);
                }
                field4338[field4317++] = var211.field6155;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field4338[--field4317];
                if (class59.field791[var212] == null) {
                    field4315[field4331++] = "";
                    return;
                }
                String var213 = class59.field791[var212][0].field7336;
                if (var213 == null) {
                    field4315[field4331++] = "";
                    return;
                }
                field4315[field4331++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field4338[--field4317];
                if (class59.field791[var214] == null) {
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = class59.field791[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field4317 -= 2;
                int var215 = field4338[field4317];
                int var216 = field4338[field4317 + 1];
                if (class59.field791[var215] == null) {
                    field4315[field4331++] = "";
                    return;
                }
                String var217 = class59.field791[var215][var216].field7336;
                if (var217 == null) {
                    field4315[field4331++] = "";
                    return;
                }
                field4315[field4331++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field4317 -= 2;
                int var218 = field4338[field4317];
                int var219 = field4338[field4317 + 1];
                if (class59.field791[var218] == null) {
                    field4338[field4317++] = 0;
                    return;
                }
                field4338[field4317++] = class59.field791[var218][var219].field7404;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4317 -= 3;
                int var220 = field4338[field4317];
                int var221 = field4338[field4317 + 1];
                int var222 = field4338[field4317 + 2];
                class455.method2742(var222, 1, var220 << 16 | var221, (byte) 35, "");
                return;
            }
            if (arg0 == 6708) {
                field4317 -= 3;
                int var223 = field4338[field4317];
                int var224 = field4338[field4317 + 1];
                int var225 = field4338[field4317 + 2];
                class455.method2742(var225, 2, var223 << 16 | var224, (byte) 35, "");
                return;
            }
            if (arg0 == 6709) {
                field4317 -= 3;
                int var226 = field4338[field4317];
                int var227 = field4338[field4317 + 1];
                int var228 = field4338[field4317 + 2];
                class455.method2742(var228, 3, var226 << 16 | var227, (byte) 35, "");
                return;
            }
            if (arg0 == 6710) {
                field4317 -= 3;
                int var229 = field4338[field4317];
                int var230 = field4338[field4317 + 1];
                int var231 = field4338[field4317 + 2];
                class455.method2742(var231, 4, var229 << 16 | var230, (byte) 35, "");
                return;
            }
            if (arg0 == 6711) {
                field4317 -= 3;
                int var232 = field4338[field4317];
                int var233 = field4338[field4317 + 1];
                int var234 = field4338[field4317 + 2];
                class455.method2742(var234, 5, var232 << 16 | var233, (byte) 35, "");
                return;
            }
            if (arg0 == 6712) {
                field4317 -= 3;
                int var235 = field4338[field4317];
                int var236 = field4338[field4317 + 1];
                int var237 = field4338[field4317 + 2];
                class455.method2742(var237, 6, var235 << 16 | var236, (byte) 35, "");
                return;
            }
            if (arg0 == 6713) {
                field4317 -= 3;
                int var238 = field4338[field4317];
                int var239 = field4338[field4317 + 1];
                int var240 = field4338[field4317 + 2];
                class455.method2742(var240, 7, var238 << 16 | var239, (byte) 35, "");
                return;
            }
            if (arg0 == 6714) {
                field4317 -= 3;
                int var241 = field4338[field4317];
                int var242 = field4338[field4317 + 1];
                int var243 = field4338[field4317 + 2];
                class455.method2742(var243, 8, var241 << 16 | var242, (byte) 35, "");
                return;
            }
            if (arg0 == 6715) {
                field4317 -= 3;
                int var244 = field4338[field4317];
                int var245 = field4338[field4317 + 1];
                int var246 = field4338[field4317 + 2];
                class455.method2742(var246, 9, var244 << 16 | var245, (byte) 35, "");
                return;
            }
            if (arg0 == 6716) {
                field4317 -= 3;
                int var247 = field4338[field4317];
                int var248 = field4338[field4317 + 1];
                int var249 = field4338[field4317 + 2];
                class455.method2742(var249, 10, var247 << 16 | var248, (byte) 35, "");
                return;
            }
            if (arg0 == 6717) {
                field4317 -= 3;
                int var250 = field4338[field4317];
                int var251 = field4338[field4317 + 1];
                int var252 = field4338[field4317 + 2];
                class499 var253 = class458.method2757(var250 << 16 | var251, false, var252);
                class457.method2749(-1);
                class388 var254 = client.method450(var253);
                class234.method1587(var254.method2394(true), var254.field5894, 54, var253);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field4338[--field4317];
                class24 var256 = class237.field3377.method356(-1, var255);
                if (var256.field375 == null) {
                    field4315[field4331++] = "";
                    return;
                }
                field4315[field4331++] = var256.field375;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field4338[--field4317];
                class24 var258 = class237.field3377.method356(-1, var257);
                field4338[field4317++] = var258.field381;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field4338[--field4317];
                class24 var260 = class237.field3377.method356(-1, var259);
                field4338[field4317++] = var260.field389;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field4338[--field4317];
                class24 var262 = class237.field3377.method356(-1, var261);
                field4338[field4317++] = var262.field393;
                return;
            }
            if (arg0 == 6804) {
                field4317 -= 2;
                int var263 = field4338[field4317];
                int var264 = field4338[field4317 + 1];
                class109 var265 = class209.field2960.method3083(var264, 55);
                if (var265.method723(-116)) {
                    field4315[field4331++] = class237.field3377.method356(-1, var263).method191(var265.field1541, var264, (byte) -115);
                    return;
                }
                field4338[field4317++] = class237.field3377.method356(-1, var263).method195(var265.field1532, var264, (byte) 71);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 3081)
    private static final void method1877(int arg0) {
        class499 var1 = class211.method1457(arg0, 6687);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class499[] var3 = class471.field6886[var2];
        if (var3 == null) {
            class499[] var4 = class59.field791[var2];
            int var5 = var4.length;
            var3 = class471.field6886[var2] = new class499[var5];
            class361.method2280(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class361.method2280(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 3122)
    public static final void method1878(int arg0) {
        if (arg0 == -1 || !class109.method719((byte) -118, arg0)) {
            return;
        }
        class499[] var1 = class59.field791[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class499 var3 = var1[var2];
            if (var3.field7384 != null) {
                class199 var4 = new class199();
                var4.field2817 = var3;
                var4.field2813 = var3.field7384;
                method1875(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3152)
    private static final void method1879(String arg0, int arg1) {
        if (class528.field7809 == 0 && !(!class123.field1760 || class482.field7026) || class422.field6304) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class389.field5902.method2335((byte) -100, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class389.field5902.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class81.field1086.method2335((byte) -100, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class81.field1086.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class519.field7699.method2335((byte) -100, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class519.field7699.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class524.field7746.method2335((byte) -100, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class524.field7746.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class208.field2937.method2335((byte) -100, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class208.field2937.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class166.field2416.method2335((byte) -100, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class166.field2416.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class81.field1091.method2335((byte) -100, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class81.field1091.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class328.field5032.method2335((byte) -100, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class328.field5032.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class445.field6616.method2335((byte) -100, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class445.field6616.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class111.field1562.method2335((byte) -100, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class111.field1562.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class430.field6401.method2335((byte) -100, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class430.field6401.method2335((byte) -100, 0).length());
        } else if (var2.startsWith(class151.field2180.method2335((byte) -100, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class151.field2180.method2335((byte) -100, 0).length());
        } else if (class288.field4292 != 0) {
            if (var2.startsWith(class389.field5902.method2335((byte) -100, class288.field4292))) {
                var3 = 0;
                arg0 = arg0.substring(class389.field5902.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class81.field1086.method2335((byte) -100, class288.field4292))) {
                var3 = 1;
                arg0 = arg0.substring(class81.field1086.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class519.field7699.method2335((byte) -100, class288.field4292))) {
                var3 = 2;
                arg0 = arg0.substring(class519.field7699.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class524.field7746.method2335((byte) -100, class288.field4292))) {
                var3 = 3;
                arg0 = arg0.substring(class524.field7746.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class208.field2937.method2335((byte) -100, class288.field4292))) {
                var3 = 4;
                arg0 = arg0.substring(class208.field2937.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class166.field2416.method2335((byte) -100, class288.field4292))) {
                var3 = 5;
                arg0 = arg0.substring(class166.field2416.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class81.field1091.method2335((byte) -100, class288.field4292))) {
                var3 = 6;
                arg0 = arg0.substring(class81.field1091.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class328.field5032.method2335((byte) -100, class288.field4292))) {
                var3 = 7;
                arg0 = arg0.substring(class328.field5032.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class445.field6616.method2335((byte) -100, class288.field4292))) {
                var3 = 8;
                arg0 = arg0.substring(class445.field6616.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class111.field1562.method2335((byte) -100, class288.field4292))) {
                var3 = 9;
                arg0 = arg0.substring(class111.field1562.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class430.field6401.method2335((byte) -100, class288.field4292))) {
                var3 = 10;
                arg0 = arg0.substring(class430.field6401.method2335((byte) -100, class288.field4292).length());
            } else if (var2.startsWith(class151.field2180.method2335((byte) -100, class288.field4292))) {
                var3 = 11;
                arg0 = arg0.substring(class151.field2180.method2335((byte) -100, class288.field4292).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class48.field674.method2335((byte) -100, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class48.field674.method2335((byte) -100, 0).length());
        } else if (var4.startsWith(class209.field2968.method2335((byte) -100, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class209.field2968.method2335((byte) -100, 0).length());
        } else if (var4.startsWith(class500.field7454.method2335((byte) -100, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class500.field7454.method2335((byte) -100, 0).length());
        } else if (var4.startsWith(class300.field4427.method2335((byte) -100, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class300.field4427.method2335((byte) -100, 0).length());
        } else if (var4.startsWith(class367.field5645.method2335((byte) -100, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class367.field5645.method2335((byte) -100, 0).length());
        } else if (class288.field4292 != 0) {
            if (var4.startsWith(class48.field674.method2335((byte) -100, class288.field4292))) {
                var5 = 1;
                arg0 = arg0.substring(class48.field674.method2335((byte) -100, class288.field4292).length());
            } else if (var4.startsWith(class209.field2968.method2335((byte) -100, class288.field4292))) {
                var5 = 2;
                arg0 = arg0.substring(class209.field2968.method2335((byte) -100, class288.field4292).length());
            } else if (var4.startsWith(class500.field7454.method2335((byte) -100, class288.field4292))) {
                var5 = 3;
                arg0 = arg0.substring(class500.field7454.method2335((byte) -100, class288.field4292).length());
            } else if (var4.startsWith(class300.field4427.method2335((byte) -100, class288.field4292))) {
                var5 = 4;
                arg0 = arg0.substring(class300.field4427.method2335((byte) -100, class288.field4292).length());
            } else if (var4.startsWith(class367.field5645.method2335((byte) -100, class288.field4292))) {
                var5 = 5;
                arg0 = arg0.substring(class367.field5645.method2335((byte) -100, class288.field4292).length());
            }
        }
        field4322++;
        class179.method1287(false, class48.field672);
        class75.field1006.method625(0, false);
        int var6 = class75.field1006.field1292;
        if (arg1 == 5021) {
            class75.field1006.method625(1, false);
        } else if (arg1 == 5022) {
            class75.field1006.method625(2, false);
        } else {
            class75.field1006.method625(0, false);
        }
        class75.field1006.method625(var3, false);
        class75.field1006.method625(var5, false);
        class327.method2114((byte) 58, arg0, class75.field1006);
        class75.field1006.method596(class75.field1006.field1292 - var6, false);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 3431)
    private static final void method1880(int arg0) {
        class499 var1 = class211.method1457(arg0, 6687);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class499[] var3 = class471.field6886[var2];
        if (var3 == null) {
            class499[] var4 = class59.field791[var2];
            int var5 = var4.length;
            var3 = class471.field6886[var2] = new class499[var5];
            class361.method2280(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class361.method2280(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 3467)
    public static final void method1881() {
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lgl;II)V", line = 3474)
    public static final void method1882(class432 arg0, int arg1, int arg2) {
        class479 var3 = class2.method20(7035, arg1, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field4316 = new int[var3.field7003];
        field4325 = new String[var3.field6994];
        if (class454.field6669 == var3.field6995 || class368.field5660 == var3.field6995 || class41.field625 == var3.field6995) {
            int var4 = 0;
            int var5 = 0;
            if (class217.field3009 != null) {
                var4 = class217.field3009.field7326;
                var5 = class217.field3009.field7337;
            }
            field4316[0] = class346.field5419.method812(false) - var4;
            field4316[1] = class346.field5419.method811(false) - var5;
        }
        method1885(var3, 200000);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V", line = 3503)
    public static void method1883() {
        field4316 = null;
        field4325 = null;
        field4335 = null;
        field4319 = null;
        field4338 = null;
        field4315 = null;
        field4318 = null;
        field4314 = null;
        field4332 = null;
        field4320 = null;
        field4324 = null;
        field4341 = null;
        field4340 = null;
        field4339 = null;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Ljava/lang/String;", line = 3523)
    private static final String method1884(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4324.setTime(new Date(var1));
        int var3 = field4324.get(5);
        int var4 = field4324.get(2);
        int var5 = field4324.get(1);
        return var3 + "-" + field4341[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lci;I)V", line = 3539)
    private static final void method1885(class479 arg0, int arg1) {
        field4317 = 0;
        field4331 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6998;
        int[] var4 = arg0.field7002;
        byte var5 = -1;
        field4323 = 0;
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
                        method1888(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1876(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4338[field4317++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4338[field4317++] = class36.field583.field2448[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class36.field583.method1191(117, field4338[--field4317], var8);
                } else if (var43 == 3) {
                    field4315[field4331++] = arg0.field6996[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4317 -= 2;
                    if (field4338[field4317 + 1] != field4338[field4317]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4317 -= 2;
                    if (field4338[field4317 + 1] == field4338[field4317]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4317 -= 2;
                    if (field4338[field4317] < field4338[field4317 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4317 -= 2;
                    if (field4338[field4317] > field4338[field4317 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4323 == 0) {
                        return;
                    }
                    class165 var9 = field4318[--field4323];
                    arg0 = var9.field2402;
                    var3 = arg0.field6998;
                    var4 = arg0.field7002;
                    var2 = var9.field2403;
                    field4316 = var9.field2404;
                    field4325 = var9.field2401;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4338[field4317++] = class36.field583.method1187(48, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class36.field583.method1190(true, var11, field4338[--field4317]);
                } else if (var43 == 31) {
                    field4317 -= 2;
                    if (field4338[field4317] <= field4338[field4317 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4317 -= 2;
                    if (field4338[field4317] >= field4338[field4317 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4338[field4317++] = field4316[var4[var2]];
                } else if (var43 == 34) {
                    field4316[var4[var2]] = field4338[--field4317];
                } else if (var43 == 35) {
                    field4315[field4331++] = field4325[var4[var2]];
                } else if (var43 == 36) {
                    field4325[var4[var2]] = field4315[--field4331];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4331 -= var12;
                    String var13 = class164.method1161(var12, field4315, (byte) 74, field4331);
                    field4315[field4331++] = var13;
                } else if (var43 == 38) {
                    field4317--;
                } else if (var43 == 39) {
                    field4331--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class479 var15 = class390.method2404(var14, 13696);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7003];
                    String[] var17 = new String[var15.field6994];
                    for (int var18 = 0; var18 < var15.field6993; var18++) {
                        var16[var18] = field4338[field4317 + var18 - var15.field6993];
                    }
                    for (int var19 = 0; var19 < var15.field6997; var19++) {
                        var17[var19] = field4315[field4331 + var19 - var15.field6997];
                    }
                    field4317 -= var15.field6993;
                    field4331 -= var15.field6997;
                    class165 var20 = new class165();
                    var20.field2402 = arg0;
                    var20.field2403 = var2;
                    var20.field2404 = field4316;
                    var20.field2401 = field4325;
                    if (field4323 >= field4318.length) {
                        throw new RuntimeException();
                    }
                    field4318[field4323++] = var20;
                    arg0 = var15;
                    var3 = var15.field6998;
                    var4 = var15.field7002;
                    var2 = -1;
                    field4316 = var16;
                    field4325 = var17;
                } else if (var43 == 42) {
                    field4338[field4317++] = class129.field1815[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class129.field1815[var21] = field4338[--field4317];
                    class450.method2717(var21, (byte) -22);
                    class292.field4351 |= class397.field6038[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4338[--field4317];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4335[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4319[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4338[--field4317];
                    if (var28 < 0 || var28 >= field4335[var27]) {
                        throw new RuntimeException();
                    }
                    field4338[field4317++] = field4319[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4317 -= 2;
                    int var30 = field4338[field4317];
                    if (var30 < 0 || var30 >= field4335[var29]) {
                        throw new RuntimeException();
                    }
                    field4319[var29][var30] = field4338[field4317 + 1];
                } else if (var43 == 47) {
                    String var31 = class508.field7561[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4315[field4331++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class508.field7561[var32] = field4315[--field4331];
                    class413.method2511(2, var32);
                } else if (var43 == 51) {
                    class141 var33 = arg0.field7000[var4[var2]];
                    class74 var34 = (class74) var33.method943((long) field4338[--field4317], -1);
                    if (var34 != null) {
                        var2 += var34.field998;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6992 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6799).append(" ");
                for (int var41 = field4323 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4318[var41].field2402.field6799).append(" ");
                }
                var40.append("op: ").append(var5);
                class438.method2644(var40.toString(), -1, var42);
            } else {
                class219.method1485((byte) -78, "Clientscript error in: " + arg0.field6992);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6992).append("\n");
                for (int var38 = field4323 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4318[var38].field2402.field6992).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class438.method2644(var37.toString(), -1, var42);
                class290.method1872(var37.toString(), (byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Luk;)V", line = 3970)
    public static final void method1886(class199 arg0) {
        method1875(arg0, 200000);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IZ)V", line = 3972)
    public static final void method1887(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(IZ)V", line = 3977)
    private static final void method1888(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4317 -= 3;
                int var2 = field4338[field4317];
                int var3 = field4338[field4317 + 1];
                int var4 = field4338[field4317 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class499 var5 = class211.method1457(var2, 6687);
                if (var5.field7423 == null) {
                    var5.field7423 = new class499[var4 + 1];
                }
                if (var5.field7423.length <= var4) {
                    class499[] var6 = new class499[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7423.length; var7++) {
                        var6[var7] = var5.field7423[var7];
                    }
                    var5.field7423 = var6;
                }
                if (var4 > 0 && var5.field7423[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class499 var8 = new class499();
                var8.field7355 = var3;
                var8.field7322 = var8.field7312 = var5.field7312;
                var8.field7304 = var4;
                var5.field7423[var4] = var8;
                if (arg1) {
                    field4332 = var8;
                } else {
                    field4314 = var8;
                }
                class338.method2189((byte) 120, var5);
                return;
            }
            if (arg0 == 101) {
                class499 var9 = arg1 ? field4332 : field4314;
                if (var9.field7304 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class499 var10 = class211.method1457(var9.field7312, 6687);
                var10.field7423[var9.field7304] = null;
                class338.method2189((byte) 109, var10);
                return;
            }
            if (arg0 == 102) {
                class499 var11 = class211.method1457(field4338[--field4317], 6687);
                var11.field7423 = null;
                class338.method2189((byte) 115, var11);
                return;
            }
            if (arg0 == 200) {
                field4317 -= 2;
                int var12 = field4338[field4317];
                int var13 = field4338[field4317 + 1];
                class499 var14 = class458.method2757(var12, false, var13);
                if (var14 != null && var13 != -1) {
                    field4338[field4317++] = 1;
                    if (arg1) {
                        field4332 = var14;
                        return;
                    }
                    field4314 = var14;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4338[--field4317];
                class499 var16 = class211.method1457(var15, 6687);
                if (var16 != null) {
                    field4338[field4317++] = 1;
                    if (arg1) {
                        field4332 = var16;
                        return;
                    }
                    field4314 = var16;
                    return;
                }
                field4338[field4317++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4338[--field4317];
                method1880(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4338[--field4317];
                method1877(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4317 -= 2;
                int var19 = field4338[field4317];
                int var20 = field4338[field4317 + 1];
                for (int var21 = 0; var21 < class467.field6806.length; var21++) {
                    if (class467.field6806[var21] == var19) {
                        class339.field5365.field4943.method2432(var20, false, class75.field1012, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class288.field4288.length; var22++) {
                    if (class288.field4288[var22] == var19) {
                        class339.field5365.field4943.method2432(var20, false, class75.field1012, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4317 -= 2;
                int var23 = field4338[field4317];
                int var24 = field4338[field4317 + 1];
                class339.field5365.field4943.method2430(var23, 31145, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4338[--field4317] != 0;
                class339.field5365.field4943.method2428(var25, 101);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class499 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class211.method1457(field4338[--field4317], 6687);
            } else {
                var26 = arg1 ? field4332 : field4314;
            }
            if (arg0 == 1000) {
                field4317 -= 4;
                var26.field7333 = field4338[field4317];
                var26.field7359 = field4338[field4317 + 1];
                int var27 = field4338[field4317 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4338[field4317 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field7436 = (byte) var27;
                var26.field7405 = (byte) var28;
                class338.method2189((byte) 119, var26);
                class140.method933(var26, (byte) -110);
                if (var26.field7304 == -1) {
                    class359.method2263(var26.field7312, 127);
                }
                return;
            }
            if (arg0 == 1001) {
                field4317 -= 4;
                var26.field7319 = field4338[field4317];
                var26.field7342 = field4338[field4317 + 1];
                var26.field7311 = 0;
                var26.field7282 = 0;
                int var29 = field4338[field4317 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4338[field4317 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field7399 = (byte) var29;
                var26.field7289 = (byte) var30;
                class338.method2189((byte) 118, var26);
                class140.method933(var26, (byte) -124);
                if (var26.field7355 == 0) {
                    class57.method387(var26, false, -16180);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4338[--field4317] == 1;
                if (var26.field7356 != var31) {
                    var26.field7356 = var31;
                    class338.method2189((byte) 79, var26);
                }
                if (var26.field7304 == -1) {
                    class256.method1664(var26.field7312, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field4317 -= 2;
                var26.field7371 = field4338[field4317];
                var26.field7390 = field4338[field4317 + 1];
                class338.method2189((byte) 114, var26);
                class140.method933(var26, (byte) -115);
                if (var26.field7355 == 0) {
                    class57.method387(var26, false, -16180);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field7372 = field4338[--field4317] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class499 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class211.method1457(field4338[--field4317], 6687);
            } else {
                var32 = arg1 ? field4332 : field4314;
            }
            if (arg0 == 1100) {
                field4317 -= 2;
                var32.field7418 = field4338[field4317];
                if (var32.field7418 > var32.field7303 - var32.field7348) {
                    var32.field7418 = var32.field7303 - var32.field7348;
                }
                if (var32.field7418 < 0) {
                    var32.field7418 = 0;
                }
                var32.field7389 = field4338[field4317 + 1];
                if (var32.field7389 > var32.field7293 - var32.field7386) {
                    var32.field7389 = var32.field7293 - var32.field7386;
                }
                if (var32.field7389 < 0) {
                    var32.field7389 = 0;
                }
                class338.method2189((byte) 112, var32);
                if (var32.field7304 == -1) {
                    class82.method529(var32.field7312, true);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field7421 = field4338[--field4317];
                class338.method2189((byte) 106, var32);
                if (var32.field7304 == -1) {
                    class285.method1857(var32.field7312, (byte) 112);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field7313 = field4338[--field4317] == 1;
                class338.method2189((byte) 104, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field7349 = field4338[--field4317];
                class338.method2189((byte) 118, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field7316 = field4338[--field4317];
                class338.method2189((byte) 127, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4338[--field4317];
                if (var32.field7308 != var33) {
                    var32.field7308 = var33;
                    class338.method2189((byte) 113, var32);
                }
                if (var32.field7304 == -1) {
                    class349.method2221(var32.field7312, true);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field7350 = field4338[--field4317];
                class338.method2189((byte) 86, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field7374 = field4338[--field4317] == 1;
                class338.method2189((byte) 96, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field7380 = 1;
                var32.field7358 = field4338[--field4317];
                class338.method2189((byte) 81, var32);
                if (var32.field7304 == -1) {
                    class197.method1382((byte) -92, var32.field7312);
                }
                return;
            }
            if (arg0 == 1109) {
                field4317 -= 6;
                var32.field7320 = field4338[field4317];
                var32.field7339 = field4338[field4317 + 1];
                var32.field7306 = field4338[field4317 + 2];
                var32.field7329 = field4338[field4317 + 3];
                var32.field7346 = field4338[field4317 + 4];
                var32.field7424 = field4338[field4317 + 5];
                class338.method2189((byte) 115, var32);
                if (var32.field7304 == -1) {
                    class384.method2383(var32.field7312, (byte) 49);
                    class6.method64(var32.field7312, 10);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4338[--field4317];
                if (var32.field7438 != var34) {
                    var32.field7438 = var34;
                    var32.field7412 = 0;
                    var32.field7335 = 1;
                    var32.field7287 = 0;
                    class338.method2189((byte) 88, var32);
                }
                if (var32.field7304 == -1) {
                    class295.method1900(var32.field7312, true);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field7419 = field4338[--field4317] == 1;
                class338.method2189((byte) 119, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4315[--field4331];
                if (!var35.equals(var32.field7437)) {
                    var32.field7437 = var35;
                    class338.method2189((byte) 90, var32);
                }
                if (var32.field7304 == -1) {
                    class356.method2255(-115, var32.field7312);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field7334 = field4338[--field4317];
                class338.method2189((byte) 93, var32);
                if (var32.field7304 == -1) {
                    class146.method970(var32.field7312, -15581);
                }
                return;
            }
            if (arg0 == 1114) {
                field4317 -= 3;
                var32.field7427 = field4338[field4317];
                var32.field7351 = field4338[field4317 + 1];
                var32.field7327 = field4338[field4317 + 2];
                class338.method2189((byte) 125, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field7403 = field4338[--field4317] == 1;
                class338.method2189((byte) 110, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field7410 = field4338[--field4317];
                class338.method2189((byte) 79, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field7391 = field4338[--field4317];
                class338.method2189((byte) 127, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field7294 = field4338[--field4317] == 1;
                class338.method2189((byte) 83, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field7444 = field4338[--field4317] == 1;
                class338.method2189((byte) 102, var32);
                return;
            }
            if (arg0 == 1120) {
                field4317 -= 2;
                var32.field7303 = field4338[field4317];
                var32.field7293 = field4338[field4317 + 1];
                class338.method2189((byte) 122, var32);
                if (var32.field7355 == 0) {
                    class57.method387(var32, false, -16180);
                }
                return;
            }
            if (arg0 == 1121) {
                field4317 -= 2;
                var32.field7357 = (short) field4338[field4317];
                var32.field7428 = (short) field4338[field4317 + 1];
                class338.method2189((byte) 79, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field7295 = field4338[--field4317] == 1;
                class338.method2189((byte) 99, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field7424 = field4338[--field4317];
                class338.method2189((byte) 92, var32);
                if (var32.field7304 == -1) {
                    class384.method2383(var32.field7312, (byte) 13);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4338[--field4317];
                var32.field7400 = var36 == 1;
                class338.method2189((byte) 94, var32);
                return;
            }
            if (arg0 == 1125) {
                field4317 -= 2;
                var32.field7364 = field4338[field4317];
                var32.field7297 = field4338[field4317 + 1];
                class338.method2189((byte) 107, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field7321 = field4338[--field4317];
                class338.method2189((byte) 121, var32);
                return;
            }
            if (arg0 == 1127) {
                field4317 -= 2;
                int var37 = field4338[field4317];
                int var38 = field4338[field4317 + 1];
                class109 var39 = class209.field2960.method3083(var37, 74);
                if (var39.field1532 != var38) {
                    var32.method2980(var37, (byte) 55, var38);
                    return;
                }
                var32.method2977(true, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field4338[--field4317];
                String var41 = field4315[--field4331];
                class109 var42 = class209.field2960.method3083(var40, 58);
                if (!var42.field1541.equals(var41)) {
                    var32.method2972(-92, var40, var41);
                    return;
                }
                var32.method2977(true, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class499 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class211.method1457(field4338[--field4317], 6687);
            } else {
                var43 = arg1 ? field4332 : field4314;
            }
            class338.method2189((byte) 115, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4317 -= 2;
                int var44 = field4338[field4317];
                int var45 = field4338[field4317 + 1];
                if (var43.field7304 == -1) {
                    client.method455(var43.field7312, 9);
                    class384.method2383(var43.field7312, (byte) 43);
                    class6.method64(var43.field7312, 10);
                }
                if (var44 == -1) {
                    var43.field7380 = 1;
                    var43.field7358 = -1;
                    var43.field7310 = -1;
                    return;
                }
                var43.field7310 = var44;
                var43.field7284 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field7325 = true;
                } else {
                    var43.field7325 = false;
                }
                class61 var46 = class84.field1154.method2451(-1, var44);
                var43.field7306 = var46.field873;
                var43.field7329 = var46.field830;
                var43.field7346 = var46.field837;
                var43.field7320 = var46.field838;
                var43.field7339 = var46.field856;
                var43.field7424 = var46.field875;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field7445 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field7445 = 1;
                } else {
                    var43.field7445 = 2;
                }
                if (var43.field7311 > 0) {
                    var43.field7424 = var43.field7424 * 32 / var43.field7311;
                    return;
                }
                if (var43.field7319 > 0) {
                    var43.field7424 = var43.field7424 * 32 / var43.field7319;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field7380 = 2;
                var43.field7358 = field4338[--field4317];
                if (var43.field7304 == -1) {
                    class197.method1382((byte) 120, var43.field7312);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field7380 = 3;
                var43.field7358 = -1;
                if (var43.field7304 == -1) {
                    class197.method1382((byte) 115, var43.field7312);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field7380 = 6;
                var43.field7358 = field4338[--field4317];
                if (var43.field7304 == -1) {
                    class197.method1382((byte) -5, var43.field7312);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field7380 = 5;
                var43.field7358 = field4338[--field4317];
                if (var43.field7304 == -1) {
                    class197.method1382((byte) -102, var43.field7312);
                }
                return;
            }
            if (arg0 == 1206) {
                field4317 -= 4;
                var43.field7429 = field4338[field4317];
                var43.field7290 = field4338[field4317 + 1];
                var43.field7332 = field4338[field4317 + 2];
                var43.field7387 = field4338[field4317 + 3];
                class338.method2189((byte) 120, var43);
                return;
            }
            if (arg0 == 1207) {
                field4317 -= 2;
                var43.field7396 = field4338[field4317];
                var43.field7441 = field4338[field4317 + 1];
                class338.method2189((byte) 77, var43);
                return;
            }
            if (arg0 == 1210) {
                field4317 -= 4;
                var43.field7358 = field4338[field4317];
                var43.field7317 = field4338[field4317 + 1];
                if (field4338[field4317 + 2] == 1) {
                    var43.field7380 = 9;
                } else {
                    var43.field7380 = 8;
                }
                if (field4338[field4317 + 3] == 1) {
                    var43.field7325 = true;
                } else {
                    var43.field7325 = false;
                }
                if (var43.field7304 == -1) {
                    class197.method1382((byte) -107, var43.field7312);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field7380 = 5;
                var43.field7358 = class452.field6641;
                var43.field7317 = 0;
                if (var43.field7304 == -1) {
                    class197.method1382((byte) 122, var43.field7312);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class499 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class211.method1457(field4338[--field4317], 6687);
                } else {
                    var58 = arg1 ? field4332 : field4314;
                }
                String var59 = field4315[--field4331];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field4338[--field4317];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field4338[--field4317];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field4315[--field4331];
                    } else {
                        var62[var63] = Integer.valueOf(field4338[--field4317]);
                    }
                }
                int var64 = field4338[--field4317];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field7415 = var62;
                } else if (arg0 == 1401) {
                    var58.field7409 = var62;
                } else if (arg0 == 1402) {
                    var58.field7426 = var62;
                } else if (arg0 == 1403) {
                    var58.field7388 = var62;
                } else if (arg0 == 1404) {
                    var58.field7323 = var62;
                } else if (arg0 == 1405) {
                    var58.field7446 = var62;
                } else if (arg0 == 1406) {
                    var58.field7300 = var62;
                } else if (arg0 == 1407) {
                    var58.field7394 = var62;
                    var58.field7442 = var60;
                } else if (arg0 == 1408) {
                    var58.field7411 = var62;
                } else if (arg0 == 1409) {
                    var58.field7381 = var62;
                } else if (arg0 == 1410) {
                    var58.field7407 = var62;
                } else if (arg0 == 1411) {
                    var58.field7354 = var62;
                } else if (arg0 == 1412) {
                    var58.field7286 = var62;
                } else if (arg0 == 1414) {
                    var58.field7338 = var62;
                    var58.field7353 = var60;
                } else if (arg0 == 1415) {
                    var58.field7379 = var62;
                    var58.field7447 = var60;
                } else if (arg0 == 1416) {
                    var58.field7362 = var62;
                } else if (arg0 == 1417) {
                    var58.field7395 = var62;
                } else if (arg0 == 1418) {
                    var58.field7328 = var62;
                } else if (arg0 == 1419) {
                    var58.field7344 = var62;
                } else if (arg0 == 1420) {
                    var58.field7373 = var62;
                } else if (arg0 == 1421) {
                    var58.field7318 = var62;
                } else if (arg0 == 1422) {
                    var58.field7291 = var62;
                } else if (arg0 == 1423) {
                    var58.field7347 = var62;
                } else if (arg0 == 1424) {
                    var58.field7296 = var62;
                } else if (arg0 == 1425) {
                    var58.field7292 = var62;
                } else if (arg0 == 1426) {
                    var58.field7366 = var62;
                } else if (arg0 == 1427) {
                    var58.field7414 = var62;
                } else if (arg0 == 1428) {
                    var58.field7301 = var62;
                    var58.field7422 = var60;
                } else if (arg0 == 1429) {
                    var58.field7345 = var62;
                    var58.field7376 = var60;
                } else if (arg0 == 1430) {
                    var58.field7430 = var62;
                }
                var58.field7309 = true;
                return;
            }
            if (arg0 < 1600) {
                class499 var65 = arg1 ? field4332 : field4314;
                if (arg0 == 1500) {
                    field4338[field4317++] = var65.field7326;
                    return;
                }
                if (arg0 == 1501) {
                    field4338[field4317++] = var65.field7337;
                    return;
                }
                if (arg0 == 1502) {
                    field4338[field4317++] = var65.field7348;
                    return;
                }
                if (arg0 == 1503) {
                    field4338[field4317++] = var65.field7386;
                    return;
                }
                if (arg0 == 1504) {
                    field4338[field4317++] = var65.field7356 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4338[field4317++] = var65.field7322;
                    return;
                }
                if (arg0 == 1506) {
                    class499 var66 = class270.method1724(var65, 325644272);
                    field4338[field4317++] = var66 == null ? -1 : var66.field7312;
                    return;
                }
            } else if (arg0 < 1700) {
                class499 var67 = arg1 ? field4332 : field4314;
                if (arg0 == 1600) {
                    field4338[field4317++] = var67.field7418;
                    return;
                }
                if (arg0 == 1601) {
                    field4338[field4317++] = var67.field7389;
                    return;
                }
                if (arg0 == 1602) {
                    field4315[field4331++] = var67.field7437;
                    return;
                }
                if (arg0 == 1603) {
                    field4338[field4317++] = var67.field7303;
                    return;
                }
                if (arg0 == 1604) {
                    field4338[field4317++] = var67.field7293;
                    return;
                }
                if (arg0 == 1605) {
                    field4338[field4317++] = var67.field7424;
                    return;
                }
                if (arg0 == 1606) {
                    field4338[field4317++] = var67.field7306;
                    return;
                }
                if (arg0 == 1607) {
                    field4338[field4317++] = var67.field7346;
                    return;
                }
                if (arg0 == 1608) {
                    field4338[field4317++] = var67.field7329;
                    return;
                }
                if (arg0 == 1609) {
                    field4338[field4317++] = var67.field7349;
                    return;
                }
                if (arg0 == 1610) {
                    field4338[field4317++] = var67.field7320;
                    return;
                }
                if (arg0 == 1611) {
                    field4338[field4317++] = var67.field7339;
                    return;
                }
                if (arg0 == 1612) {
                    field4338[field4317++] = var67.field7308;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field4338[--field4317];
                    class109 var69 = class209.field2960.method3083(var68, 124);
                    if (var69.method723(-116)) {
                        field4315[field4331++] = var67.method2973(var69.field1541, 120, var68);
                    } else {
                        field4338[field4317++] = var67.method2974((byte) -111, var68, var69.field1532);
                    }
                }
            } else if (arg0 < 1800) {
                class499 var70 = arg1 ? field4332 : field4314;
                if (arg0 == 1700) {
                    field4338[field4317++] = var70.field7310;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field7310 != -1) {
                        field4338[field4317++] = var70.field7284;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4338[field4317++] = var70.field7304;
                    return;
                }
            } else if (arg0 < 1900) {
                class499 var71 = arg1 ? field4332 : field4314;
                if (arg0 == 1800) {
                    field4338[field4317++] = client.method450(var71).method2394(true);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field4338[--field4317];
                    int var334 = var72 - 1;
                    if (var71.field7439 != null && var334 < var71.field7439.length && var71.field7439[var334] != null) {
                        field4315[field4331++] = var71.field7439[var334];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field7307 == null) {
                        field4315[field4331++] = "";
                        return;
                    }
                    field4315[field4331++] = var71.field7307;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class499 var332;
                if (arg0 >= 2000) {
                    var332 = class211.method1457(field4338[--field4317], 6687);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field4332 : field4314;
                }
                if (field4342 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field7414 == null) {
                        return;
                    }
                    class199 var333 = new class199();
                    var333.field2817 = var332;
                    var333.field2813 = var332.field7414;
                    var333.field2812 = field4342 + 1;
                    class296.field4384.method1958(var333, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class499 var73 = class211.method1457(field4338[--field4317], 6687);
                if (arg0 == 2500) {
                    field4338[field4317++] = var73.field7326;
                    return;
                }
                if (arg0 == 2501) {
                    field4338[field4317++] = var73.field7337;
                    return;
                }
                if (arg0 == 2502) {
                    field4338[field4317++] = var73.field7348;
                    return;
                }
                if (arg0 == 2503) {
                    field4338[field4317++] = var73.field7386;
                    return;
                }
                if (arg0 == 2504) {
                    field4338[field4317++] = var73.field7356 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4338[field4317++] = var73.field7322;
                    return;
                }
                if (arg0 == 1506) {
                    class499 var74 = class270.method1724(var73, 325644272);
                    field4338[field4317++] = var74 == null ? -1 : var74.field7312;
                    return;
                }
            } else if (arg0 < 2700) {
                class499 var75 = class211.method1457(field4338[--field4317], 6687);
                if (arg0 == 2600) {
                    field4338[field4317++] = var75.field7418;
                    return;
                }
                if (arg0 == 2601) {
                    field4338[field4317++] = var75.field7389;
                    return;
                }
                if (arg0 == 2602) {
                    field4315[field4331++] = var75.field7437;
                    return;
                }
                if (arg0 == 2603) {
                    field4338[field4317++] = var75.field7303;
                    return;
                }
                if (arg0 == 2604) {
                    field4338[field4317++] = var75.field7293;
                    return;
                }
                if (arg0 == 2605) {
                    field4338[field4317++] = var75.field7424;
                    return;
                }
                if (arg0 == 2606) {
                    field4338[field4317++] = var75.field7306;
                    return;
                }
                if (arg0 == 2607) {
                    field4338[field4317++] = var75.field7346;
                    return;
                }
                if (arg0 == 2608) {
                    field4338[field4317++] = var75.field7329;
                    return;
                }
                if (arg0 == 2609) {
                    field4338[field4317++] = var75.field7349;
                    return;
                }
                if (arg0 == 2610) {
                    field4338[field4317++] = var75.field7320;
                    return;
                }
                if (arg0 == 2611) {
                    field4338[field4317++] = var75.field7339;
                    return;
                }
                if (arg0 == 2612) {
                    field4338[field4317++] = var75.field7308;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class499 var76 = class211.method1457(field4338[--field4317], 6687);
                    field4338[field4317++] = var76.field7310;
                    return;
                }
                if (arg0 == 2701) {
                    class499 var77 = class211.method1457(field4338[--field4317], 6687);
                    if (var77.field7310 == -1) {
                        field4338[field4317++] = 0;
                        return;
                    } else {
                        field4338[field4317++] = var77.field7284;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field4338[--field4317];
                    class407 var79 = (class407) class27.field449.method943((long) var78, -1);
                    if (var79 != null) {
                        field4338[field4317++] = 1;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class499 var80 = class211.method1457(field4338[--field4317], 6687);
                    if (var80.field7423 == null) {
                        field4338[field4317++] = 0;
                        return;
                    }
                    int var81 = var80.field7423.length;
                    for (int var82 = 0; var82 < var80.field7423.length; var82++) {
                        if (var80.field7423[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field4338[field4317++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4317 -= 2;
                    int var83 = field4338[field4317];
                    int var84 = field4338[field4317 + 1];
                    class407 var85 = (class407) class27.field449.method943((long) var83, -1);
                    if (var85 != null && var85.field6155 == var84) {
                        field4338[field4317++] = 1;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class499 var86 = class211.method1457(field4338[--field4317], 6687);
                if (arg0 == 2800) {
                    field4338[field4317++] = client.method450(var86).method2394(true);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field4338[--field4317];
                    int var335 = var87 - 1;
                    if (var86.field7439 != null && var335 < var86.field7439.length && var86.field7439[var335] != null) {
                        field4315[field4331++] = var86.field7439[var335];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field7307 == null) {
                        field4315[field4331++] = "";
                        return;
                    }
                    field4315[field4331++] = var86.field7307;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field4315[--field4331];
                    class219.method1485((byte) 78, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field4317 -= 2;
                    class340.method2193(field4338[field4317 + 1], field4338[field4317], -49, class339.field5365);
                    return;
                }
                if (arg0 == 3103) {
                    class219.method1479((byte) -113, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field4315[--field4331];
                    int var90 = 0;
                    if (class301.method1939((byte) -123, var89)) {
                        var90 = class188.method1320(var89, 15);
                    }
                    field4329++;
                    class179.method1287(false, class55.field750);
                    class75.field1006.method615(28010, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field4315[--field4331];
                    field4321++;
                    class179.method1287(false, class352.field5455);
                    class75.field1006.method625(var91.length() + 1, false);
                    class75.field1006.method603(-118, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field4315[--field4331];
                    field4333++;
                    class179.method1287(false, class52.field706);
                    class75.field1006.method625(var92.length() + 1, false);
                    class75.field1006.method603(-96, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field4338[--field4317];
                    String var94 = field4315[--field4331];
                    class458.method2756(var93, (byte) 93, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field4317 -= 3;
                    int var95 = field4338[field4317];
                    int var96 = field4338[field4317 + 1];
                    int var97 = field4338[field4317 + 2];
                    class499 var98 = class211.method1457(var97, 6687);
                    class154.method1004(false, var96, var95, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field4317 -= 2;
                    int var99 = field4338[field4317];
                    int var100 = field4338[field4317 + 1];
                    class499 var101 = arg1 ? field4332 : field4314;
                    class154.method1004(false, var100, var99, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field4338[--field4317];
                    field4328++;
                    class179.method1287(false, class203.field2858);
                    class75.field1006.method600(var102, -12891);
                    return;
                }
                if (arg0 == 3111) {
                    field4317 -= 2;
                    int var103 = field4338[field4317];
                    int var104 = field4338[field4317 + 1];
                    class407 var105 = (class407) class27.field449.method943((long) var103, -1);
                    if (var105 != null) {
                        class143.method953((byte) -49, true, var105, var105.field6155 != var104);
                    }
                    class370.method2305(3, var104, false, true, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field4317--;
                    int var106 = field4338[field4317];
                    class407 var107 = (class407) class27.field449.method943((long) var106, -1);
                    if (var107 != null && var107.field6156 == 3) {
                        class143.method953((byte) -85, true, var107, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class522.method3100(25460, field4315[--field4331]);
                    return;
                }
                if (arg0 == 3114) {
                    field4317 -= 2;
                    int var108 = field4338[field4317];
                    int var109 = field4338[field4317 + 1];
                    String var110 = field4315[--field4331];
                    class268.method1712(var110, "", var108, var109, "", (byte) 119);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4317 -= 3;
                    class316.method2046(field4338[field4317 + 1], 255, field4338[field4317 + 2], field4338[field4317], (byte) -116);
                    return;
                }
                if (arg0 == 3201) {
                    class377.method2342(field4338[--field4317], 255, (byte) -83, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field4317 -= 2;
                    class51.method353(field4338[field4317 + 1], true, field4338[field4317], 255);
                    return;
                }
                if (arg0 == 3203) {
                    field4317 -= 4;
                    class316.method2046(field4338[field4317 + 1], field4338[field4317 + 3], field4338[field4317 + 2], field4338[field4317], (byte) -103);
                    return;
                }
                if (arg0 == 3204) {
                    field4317 -= 3;
                    class377.method2342(field4338[field4317], field4338[field4317 + 1], (byte) -83, field4338[field4317 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field4317 -= 3;
                    class51.method353(field4338[field4317 + 1], true, field4338[field4317], field4338[field4317 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field4317 -= 4;
                    class491.method2918(field4338[field4317], 56, field4338[field4317 + 3], field4338[field4317 + 1], field4338[field4317 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4338[field4317++] = class405.field6116;
                    return;
                }
                if (arg0 == 3301) {
                    field4317 -= 2;
                    int var111 = field4338[field4317];
                    int var112 = field4338[field4317 + 1];
                    field4338[field4317++] = class391.method2405(26955, false, var112, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field4317 -= 2;
                    int var113 = field4338[field4317];
                    int var114 = field4338[field4317 + 1];
                    field4338[field4317++] = class414.method2513(var114, var113, false, 0);
                    return;
                }
                if (arg0 == 3303) {
                    field4317 -= 2;
                    int var115 = field4338[field4317];
                    int var116 = field4338[field4317 + 1];
                    field4338[field4317++] = class423.method2549(var116, (byte) 127, false, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field4338[--field4317];
                    field4338[field4317++] = class67.field923.method1640(var117, 28560).field3407;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field4338[--field4317];
                    field4338[field4317++] = class261.field3632[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field4338[--field4317];
                    field4338[field4317++] = class500.field7451[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field4338[--field4317];
                    field4338[field4317++] = class471.field6876[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class339.field5365.field2210;
                    int var122 = (class339.field5365.field2217 >> 7) + class82.field1105;
                    int var123 = (class339.field5365.field2215 >> 7) + class437.field6477;
                    field4338[field4317++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field4338[--field4317];
                    field4338[field4317++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field4338[--field4317];
                    field4338[field4317++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field4338[--field4317];
                    field4338[field4317++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4338[field4317++] = class289.field4305 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4317 -= 2;
                    int var127 = field4338[field4317];
                    int var128 = field4338[field4317 + 1];
                    field4338[field4317++] = class391.method2405(26955, true, var128, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field4317 -= 2;
                    int var129 = field4338[field4317];
                    int var130 = field4338[field4317 + 1];
                    field4338[field4317++] = class414.method2513(var130, var129, true, 0);
                    return;
                }
                if (arg0 == 3315) {
                    field4317 -= 2;
                    int var131 = field4338[field4317];
                    int var132 = field4338[field4317 + 1];
                    field4338[field4317++] = class423.method2549(var132, (byte) 127, true, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class528.field7809 >= 2) {
                        field4338[field4317++] = class528.field7809;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4338[field4317++] = class375.field5739;
                    return;
                }
                if (arg0 == 3318) {
                    field4338[field4317++] = class12.field195;
                    return;
                }
                if (arg0 == 3321) {
                    field4338[field4317++] = class433.field6411;
                    return;
                }
                if (arg0 == 3322) {
                    field4338[field4317++] = class31.field471;
                    return;
                }
                if (arg0 == 3323) {
                    if (class103.field1477 >= 5 && class103.field1477 <= 9) {
                        field4338[field4317++] = 1;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class103.field1477 >= 5 && class103.field1477 <= 9) {
                        field4338[field4317++] = class103.field1477;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4338[field4317++] = class329.field5103 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4338[field4317++] = class339.field5365.field4930;
                    return;
                }
                if (arg0 == 3327) {
                    field4338[field4317++] = class339.field5365.field4943.field6011 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field4338[field4317++] = class123.field1760 && !class482.field7026 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4338[field4317++] = class422.field6304 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field4338[--field4317];
                    field4338[field4317++] = class149.method985(7945, false, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field4317 -= 2;
                    int var134 = field4338[field4317];
                    int var135 = field4338[field4317 + 1];
                    field4338[field4317++] = class82.method530(1194896931, false, var134, var135, false);
                    return;
                }
                if (arg0 == 3332) {
                    field4317 -= 2;
                    int var136 = field4338[field4317];
                    int var137 = field4338[field4317 + 1];
                    field4338[field4317++] = class82.method530(1194896931, false, var136, var137, true);
                    return;
                }
                if (arg0 == 3333) {
                    field4338[field4317++] = class329.field5070;
                    return;
                }
                if (arg0 == 3335) {
                    field4338[field4317++] = class288.field4292;
                    return;
                }
                if (arg0 == 3336) {
                    field4317 -= 4;
                    int var138 = field4338[field4317];
                    int var139 = field4338[field4317 + 1];
                    int var140 = field4338[field4317 + 2];
                    int var141 = field4338[field4317 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field4338[field4317++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field4338[field4317++] = class97.field1409;
                    return;
                }
                if (arg0 == 3338) {
                    field4338[field4317++] = class498.method2963((byte) 55);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4317 -= 2;
                    int var145 = field4338[field4317];
                    int var146 = field4338[field4317 + 1];
                    class488 var147 = class96.field1401.method1295(var145, false);
                    field4315[field4331++] = var147.method2907(var146, (byte) 4);
                    return;
                }
                if (arg0 == 3408) {
                    field4317 -= 4;
                    int var148 = field4338[field4317];
                    int var149 = field4338[field4317 + 1];
                    int var150 = field4338[field4317 + 2];
                    int var151 = field4338[field4317 + 3];
                    class488 var152 = class96.field1401.method1295(var150, false);
                    if (var152.field7145 == var148 && var152.field7150 == var149) {
                        if (var149 == 115) {
                            field4315[field4331++] = var152.method2907(var151, (byte) -126);
                            return;
                        }
                        field4338[field4317++] = var152.method2906(-1, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4317 -= 3;
                    int var153 = field4338[field4317];
                    int var154 = field4338[field4317 + 1];
                    int var155 = field4338[field4317 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class488 var156 = class96.field1401.method1295(var154, false);
                    if (var156.field7150 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4338[field4317++] = var156.method2905(0, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field4338[--field4317];
                    String var158 = field4315[--field4331];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class488 var159 = class96.field1401.method1295(var157, false);
                    if (var159.field7150 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4338[field4317++] = var159.method2912(-128, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field4338[--field4317];
                    class488 var161 = class96.field1401.method1295(var160, false);
                    field4338[field4317++] = var161.field7162.method939((byte) 103);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class439.field6542 == 0) {
                        field4338[field4317++] = -2;
                        return;
                    }
                    if (class439.field6542 == 1) {
                        field4338[field4317++] = -1;
                        return;
                    }
                    field4338[field4317++] = class189.field2653;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field4338[--field4317];
                    if (class439.field6542 == 2 && var162 < class189.field2653) {
                        field4315[field4331++] = class397.field6033[var162];
                        if (class442.field6573[var162] != null) {
                            field4315[field4331++] = class442.field6573[var162];
                            return;
                        }
                        field4315[field4331++] = "";
                        return;
                    }
                    field4315[field4331++] = "";
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field4338[--field4317];
                    if (class439.field6542 == 2 && var163 < class189.field2653) {
                        field4338[field4317++] = class323.field4985[var163];
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field4338[--field4317];
                    if (class439.field6542 == 2 && var164 < class189.field2653) {
                        field4338[field4317++] = class344.field5391[var164];
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field4315[--field4331];
                    int var166 = field4338[--field4317];
                    class417.method2521(1, var166, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field4315[--field4331];
                    class257.method1668(4, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field4315[--field4331];
                    class208.method1443((byte) 108, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field4315[--field4331];
                    class417.method2524(-5616, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field4315[--field4331];
                    class307.method1975(var170, 1);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field4315[--field4331];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field4338[field4317++] = class377.method2344(var171, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field4338[--field4317];
                    if (class439.field6542 == 2 && var172 < class189.field2653) {
                        field4315[field4331++] = class300.field4435[var172];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class320.field4913 != null) {
                        field4315[field4331++] = class223.method1509(class320.field4913, 0);
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class320.field4913 != null) {
                        field4338[field4317++] = class81.field1089;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field4338[--field4317];
                    if (class320.field4913 != null && var173 < class81.field1089) {
                        field4315[field4331++] = class56.field758[var173].field952;
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field4338[--field4317];
                    if (class320.field4913 != null && var174 < class81.field1089) {
                        field4338[field4317++] = class56.field758[var174].field959;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field4338[--field4317];
                    if (class320.field4913 != null && var175 < class81.field1089) {
                        field4338[field4317++] = class56.field758[var175].field956;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4338[field4317++] = class496.field7259;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field4315[--field4331];
                    class202.method1409(var176, -1);
                    return;
                }
                if (arg0 == 3618) {
                    field4338[field4317++] = class188.field2644;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field4315[--field4331];
                    class38.method274(var177, 5121);
                    return;
                }
                if (arg0 == 3620) {
                    class366.method2295((byte) 8);
                    return;
                }
                if (arg0 == 3621) {
                    if (class439.field6542 == 0) {
                        field4338[field4317++] = -1;
                        return;
                    }
                    field4338[field4317++] = class204.field2873;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field4338[--field4317];
                    if (class439.field6542 != 0 && var178 < class204.field2873) {
                        field4315[field4331++] = class279.field3853[var178];
                        if (class296.field4382[var178] != null) {
                            field4315[field4331++] = class296.field4382[var178];
                            return;
                        }
                        field4315[field4331++] = "";
                        return;
                    }
                    field4315[field4331++] = "";
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field4315[--field4331];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field4338[field4317++] = class145.method968(var179, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field4338[--field4317];
                    if (class56.field758 != null && var180 < class81.field1089 && class56.field758[var180].field961.equalsIgnoreCase(class339.field5365.field4947)) {
                        field4338[field4317++] = 1;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class300.field4436 != null) {
                        field4315[field4331++] = class300.field4436;
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field4338[--field4317];
                    if (class320.field4913 != null && var181 < class81.field1089) {
                        field4315[field4331++] = class56.field758[var181].field962;
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field4338[--field4317];
                    if (class439.field6542 == 2 && var182 >= 0 && var182 < class189.field2653) {
                        field4338[field4317++] = class26.field433[var182] ? 1 : 0;
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field4315[--field4331];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field4338[field4317++] = class98.method669(var183, (byte) 121);
                    return;
                }
                if (arg0 == 3629) {
                    field4338[field4317++] = class117.field1653;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field4315[--field4331];
                    class417.method2524(-5616, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field4338[--field4317];
                    field4338[field4317++] = class152.field2204[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field4338[--field4317];
                    if (class320.field4913 != null && var186 < class81.field1089) {
                        field4315[field4331++] = class56.field758[var186].field961;
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field4338[--field4317];
                    if (class439.field6542 != 0 && var187 < class204.field2873) {
                        field4315[field4331++] = class42.field640[var187];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var188].method955(1);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var189].field2070;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var190].field2062;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var191].field2064;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var192].field2066;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field4338[--field4317];
                    field4338[field4317++] = class371.field5700[var193].field2071;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field4338[--field4317];
                    int var195 = class371.field5700[var194].method952(-6542);
                    field4338[field4317++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field4338[--field4317];
                    int var197 = class371.field5700[var196].method952(-6542);
                    field4338[field4317++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field4338[--field4317];
                    int var199 = class371.field5700[var198].method952(-6542);
                    field4338[field4317++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field4338[--field4317];
                    int var201 = class371.field5700[var200].method952(-6542);
                    field4338[field4317++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4317 -= 2;
                    int var202 = field4338[field4317];
                    int var203 = field4338[field4317 + 1];
                    field4338[field4317++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field4317 -= 2;
                    int var204 = field4338[field4317];
                    int var205 = field4338[field4317 + 1];
                    field4338[field4317++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field4317 -= 2;
                    int var206 = field4338[field4317];
                    int var207 = field4338[field4317 + 1];
                    field4338[field4317++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field4317 -= 2;
                    int var208 = field4338[field4317];
                    int var209 = field4338[field4317 + 1];
                    field4338[field4317++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field4338[--field4317];
                    field4338[field4317++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field4338[--field4317];
                    field4338[field4317++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4317 -= 5;
                    int var212 = field4338[field4317];
                    int var213 = field4338[field4317 + 1];
                    int var214 = field4338[field4317 + 2];
                    int var215 = field4338[field4317 + 3];
                    int var216 = field4338[field4317 + 4];
                    field4338[field4317++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field4317 -= 2;
                    long var217 = (long) field4338[field4317];
                    long var219 = (long) field4338[field4317 + 1];
                    field4338[field4317++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field4317 -= 2;
                    int var221 = field4338[field4317];
                    int var222 = field4338[field4317 + 1];
                    field4338[field4317++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field4317 -= 2;
                    int var223 = field4338[field4317];
                    int var224 = field4338[field4317 + 1];
                    field4338[field4317++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4317 -= 2;
                    int var225 = field4338[field4317];
                    int var226 = field4338[field4317 + 1];
                    field4338[field4317++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4317 -= 2;
                    int var227 = field4338[field4317];
                    int var228 = field4338[field4317 + 1];
                    field4338[field4317++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field4317 -= 2;
                    int var229 = field4338[field4317];
                    int var230 = field4338[field4317 + 1];
                    if (var229 == 0) {
                        field4338[field4317++] = 0;
                        return;
                    }
                    field4338[field4317++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field4317 -= 2;
                    int var231 = field4338[field4317];
                    int var232 = field4338[field4317 + 1];
                    if (var231 == 0) {
                        field4338[field4317++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field4338[field4317++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4338[field4317++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field4317 -= 2;
                    int var233 = field4338[field4317];
                    int var234 = field4338[field4317 + 1];
                    field4338[field4317++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field4317 -= 2;
                    int var235 = field4338[field4317];
                    int var236 = field4338[field4317 + 1];
                    field4338[field4317++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field4317 -= 2;
                    int var237 = field4338[field4317];
                    int var238 = field4338[field4317 + 1];
                    field4338[field4317++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field4317 -= 2;
                    int var239 = field4338[field4317];
                    int var240 = field4338[field4317 + 1];
                    field4338[field4317++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field4317 -= 3;
                    long var241 = (long) field4338[field4317];
                    long var243 = (long) field4338[field4317 + 1];
                    long var245 = (long) field4338[field4317 + 2];
                    field4338[field4317++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field4315[--field4331];
                    int var248 = field4338[--field4317];
                    field4315[field4331++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field4331 -= 2;
                    String var249 = field4315[field4331];
                    String var250 = field4315[field4331 + 1];
                    field4315[field4331++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field4315[--field4331];
                    int var252 = field4338[--field4317];
                    field4315[field4331++] = var251 + class253.method1653(-1, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field4315[--field4331];
                    field4315[field4331++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field4315[field4331++] = method1884(field4338[--field4317]);
                    return;
                }
                if (arg0 == 4105) {
                    field4331 -= 2;
                    String var254 = field4315[field4331];
                    String var255 = field4315[field4331 + 1];
                    if (class339.field5365.field4943 != null && class339.field5365.field4943.field6011) {
                        field4315[field4331++] = var255;
                        return;
                    }
                    field4315[field4331++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field4338[--field4317];
                    field4315[field4331++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field4331 -= 2;
                    field4338[field4317++] = class34.method256(class288.field4292, field4315[field4331], -115, field4315[field4331 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field4315[--field4331];
                    field4317 -= 2;
                    int var258 = field4338[field4317];
                    int var259 = field4338[field4317 + 1];
                    class4 var260 = class392.method2411(var259, (byte) -96, class119.field1677, 0);
                    field4338[field4317++] = var260.method37((byte) -20, class41.field635, var258, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field4315[--field4331];
                    field4317 -= 2;
                    int var262 = field4338[field4317];
                    int var263 = field4338[field4317 + 1];
                    class4 var264 = class392.method2411(var263, (byte) -69, class119.field1677, 0);
                    field4338[field4317++] = var264.method38(var262, class41.field635, var261, 0);
                    return;
                }
                if (arg0 == 4110) {
                    field4331 -= 2;
                    String var265 = field4315[field4331];
                    String var266 = field4315[field4331 + 1];
                    if (field4338[--field4317] == 1) {
                        field4315[field4331++] = var265;
                        return;
                    }
                    field4315[field4331++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field4315[--field4331];
                    field4315[field4331++] = class227.method1562(var267, 113);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field4315[--field4331];
                    int var269 = field4338[--field4317];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field4315[field4331++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field4338[--field4317];
                    field4338[field4317++] = class354.method2235((char) var270, 26881) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field4338[--field4317];
                    field4338[field4317++] = class92.method646((char) var271, 90) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field4338[--field4317];
                    field4338[field4317++] = class463.method2770((char) var272, (byte) 113) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field4338[--field4317];
                    field4338[field4317++] = class197.method1381(127, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field4315[--field4331];
                    if (var274 != null) {
                        field4338[field4317++] = var274.length();
                        return;
                    }
                    field4338[field4317++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field4315[--field4331];
                    field4317 -= 2;
                    int var276 = field4338[field4317];
                    int var277 = field4338[field4317 + 1];
                    field4315[field4331++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field4315[--field4331];
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
                    field4315[field4331++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field4315[--field4331];
                    field4317 -= 2;
                    int var284 = field4338[field4317];
                    int var285 = field4338[field4317 + 1];
                    field4338[field4317++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field4331 -= 2;
                    String var286 = field4315[field4331];
                    String var287 = field4315[field4331 + 1];
                    int var288 = field4338[--field4317];
                    field4338[field4317++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field4338[--field4317];
                    field4338[field4317++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field4338[--field4317];
                    field4338[field4317++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field4338[--field4317] != 0;
                    int var292 = field4338[--field4317];
                    field4315[field4331++] = class433.method2594(class288.field4292, 0, 0, var291, (long) var292);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field4315[--field4331];
                    int var294 = field4338[--field4317];
                    class4 var295 = class392.method2411(var294, (byte) -125, class119.field1677, 0);
                    field4338[field4317++] = var295.method42((byte) -119, var293, class41.field635);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field4338[--field4317];
                    field4315[field4331++] = class84.field1154.method2451(-1, var296).field827;
                    return;
                }
                if (arg0 == 4201) {
                    field4317 -= 2;
                    int var297 = field4338[field4317];
                    int var298 = field4338[field4317 + 1];
                    class61 var299 = class84.field1154.method2451(-1, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field869[var298 - 1] != null) {
                        field4315[field4331++] = var299.field869[var298 - 1];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4317 -= 2;
                    int var300 = field4338[field4317];
                    int var301 = field4338[field4317 + 1];
                    class61 var302 = class84.field1154.method2451(-1, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field854[var301 - 1] != null) {
                        field4315[field4331++] = var302.field854[var301 - 1];
                        return;
                    }
                    field4315[field4331++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field4338[--field4317];
                    field4338[field4317++] = class84.field1154.method2451(-1, var303).field857;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field4338[--field4317];
                    field4338[field4317++] = class84.field1154.method2451(-1, var304).field861 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field4338[--field4317];
                    class61 var306 = class84.field1154.method2451(-1, var305);
                    if (var306.field829 == -1 && var306.field819 >= 0) {
                        field4338[field4317++] = var306.field819;
                        return;
                    }
                    field4338[field4317++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field4338[--field4317];
                    class61 var308 = class84.field1154.method2451(-1, var307);
                    if (var308.field829 >= 0 && var308.field819 >= 0) {
                        field4338[field4317++] = var308.field819;
                        return;
                    }
                    field4338[field4317++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field4338[--field4317];
                    field4338[field4317++] = class84.field1154.method2451(-1, var309).field855 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4317 -= 2;
                    int var310 = field4338[field4317];
                    int var311 = field4338[field4317 + 1];
                    class109 var312 = class209.field2960.method3083(var311, 51);
                    if (var312.method723(-116)) {
                        field4315[field4331++] = class84.field1154.method2451(-1, var310).method417(var312.field1541, 64, var311);
                        return;
                    }
                    field4338[field4317++] = class84.field1154.method2451(-1, var310).method416(-16777215, var312.field1532, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field4317 -= 2;
                    int var313 = field4338[field4317];
                    int var314 = field4338[field4317 + 1] - 1;
                    class61 var315 = class84.field1154.method2451(-1, var313);
                    if (var315.field858 == var314) {
                        field4338[field4317++] = var315.field834;
                        return;
                    }
                    if (var315.field828 == var314) {
                        field4338[field4317++] = var315.field844;
                        return;
                    }
                    field4338[field4317++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field4315[--field4331];
                    int var317 = field4338[--field4317];
                    class386.method2386(false, var316, var317 == 1);
                    field4338[field4317++] = class257.field3596;
                    return;
                }
                if (arg0 == 4211) {
                    if (class480.field7011 != null && class453.field6648 < class257.field3596) {
                        field4338[field4317++] = class480.field7011[class453.field6648++] & 0xFFFF;
                        return;
                    }
                    field4338[field4317++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class453.field6648 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4317 -= 2;
                    int var318 = field4338[field4317];
                    int var319 = field4338[field4317 + 1];
                    class109 var320 = class209.field2960.method3083(var319, 60);
                    if (var320.method723(-116)) {
                        field4315[field4331++] = class410.field6175.method1216(var318, false).method2124(var319, 0, var320.field1541);
                        return;
                    }
                    field4338[field4317++] = class410.field6175.method1216(var318, false).method2120(-1, var319, var320.field1532);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4317 -= 2;
                    int var321 = field4338[field4317];
                    int var322 = field4338[field4317 + 1];
                    class109 var323 = class209.field2960.method3083(var322, 45);
                    if (var323.method723(-116)) {
                        field4315[field4331++] = class56.field755.method2031(-101, var321).method834((byte) -124, var323.field1541, var322);
                        return;
                    }
                    field4338[field4317++] = class56.field755.method2031(112, var321).method827(var323.field1532, 118, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4317 -= 2;
                    int var324 = field4338[field4317];
                    int var325 = field4338[field4317 + 1];
                    class109 var326 = class209.field2960.method3083(var325, 115);
                    if (var326.method723(-116)) {
                        field4315[field4331++] = class128.field1812.method2666(var324, true).method960(var326.field1541, 2, var325);
                        return;
                    }
                    field4338[field4317++] = class128.field1812.method2666(var324, true).method961(var325, 32309, var326.field1532);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field4338[--field4317];
                class219 var328 = class186.field2620.method2681(-83, var327);
                if (var328.field3033 != null && var328.field3033.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field3040[0];
                    for (int var331 = 1; var331 < var328.field3033.length; var331++) {
                        if (var328.field3040[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field3040[var331];
                        }
                    }
                    field4338[field4317++] = var328.field3033[var329];
                    return;
                }
                field4338[field4317++] = var328.field3062;
                return;
            }
        } else {
            class499 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class211.method1457(field4338[--field4317], 6687);
            } else {
                var47 = arg1 ? field4332 : field4314;
            }
            if (arg0 == 1300) {
                int var48 = field4338[--field4317] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2976(var48, field4315[--field4331], (byte) 7);
                    return;
                }
                field4331--;
                return;
            }
            if (arg0 == 1301) {
                field4317 -= 2;
                int var49 = field4338[field4317];
                int var50 = field4338[field4317 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field7434 = null;
                    return;
                }
                var47.field7434 = class458.method2757(var49, false, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field4338[--field4317];
                if (class518.field7690 != var51 && class224.field3164 != var51 && class113.field1575 != var51) {
                    return;
                }
                var47.field7443 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field7302 = field4338[--field4317];
                return;
            }
            if (arg0 == 1304) {
                var47.field7365 = field4338[--field4317];
                return;
            }
            if (arg0 == 1305) {
                var47.field7307 = field4315[--field4331];
                return;
            }
            if (arg0 == 1306) {
                var47.field7406 = field4315[--field4331];
                return;
            }
            if (arg0 == 1307) {
                var47.field7439 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field7340 = field4338[--field4317];
                var47.field7440 = field4338[--field4317];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field4338[--field4317];
                int var53 = field4338[--field4317];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2979(var53 - 1, (byte) 53, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field7363 = field4315[--field4331];
                return;
            }
            if (arg0 == 1311) {
                var47.field7433 = field4338[--field4317];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field4317 -= 3;
                    var54 = field4338[field4317] - 1;
                    var55 = field4338[field4317 + 1];
                    var56 = field4338[field4317 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4317 -= 2;
                    var54 = 10;
                    var55 = field4338[field4317];
                    var56 = field4338[field4317 + 1];
                }
                if (var47.field7382 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field7382 = new byte[11];
                    var47.field7305 = new byte[11];
                    var47.field7360 = new int[11];
                }
                var47.field7382[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field7285 = false;
                    for (int var57 = 0; var57 < var47.field7382.length; var57++) {
                        if (var47.field7382[var57] != 0) {
                            var47.field7285 = true;
                            break;
                        }
                    }
                } else {
                    var47.field7285 = true;
                }
                var47.field7305[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field7417 = field4338[--field4317];
                return;
            }
        }
        throw new IllegalStateException();
    }
}
