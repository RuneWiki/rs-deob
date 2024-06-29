import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class360 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    private static int[] field5519 = new int[5];

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    private static int field5520 = 0;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "[I")
    private static int[] field5531 = new int[1000];

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    private static int field5530 = 0;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field5536 = new String[1000];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[[I")
    private static int[][] field5522 = new int[5][5000];

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    private static int field5535 = 0;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[Lgg;")
    private static class115[] field5517 = new class115[50];

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5533 = Calendar.getInstance();

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[I")
    private static int[] field5544 = new int[3];

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field5542 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lng;")
    public static class226 field5543 = new class226(4);

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private static int field5545 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lvg;")
    private static class38 field5525;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lvg;")
    private static class38 field5527;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Ldp;")
    private static class3 field5521;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "[I")
    private static int[] field5532;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field5523;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V", line = 14)
    public static final void method2236(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lpd;I)V", line = 21)
    private static final void method2237(class168 arg0, int arg1) {
        Object[] var2 = arg0.field2484;
        int var3 = (Integer) var2[0];
        class526 var4 = class73.method418(var3, 0);
        if (var4 == null) {
            return;
        }
        field5532 = new int[var4.field7774];
        int var5 = 0;
        field5523 = new String[var4.field7782];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2486;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2481;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2488 == null ? -1 : arg0.field2488.field467;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2489;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2488 == null ? -1 : arg0.field2488.field547;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2491 == null ? -1 : arg0.field2491.field467;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2491 == null ? -1 : arg0.field2491.field547;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2487;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2485;
                }
                field5532[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2479;
                }
                field5523[var6++] = var9;
            }
        }
        field5545 = arg0.field2490;
        method2245(var4, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lpd;)V", line = 99)
    public static final void method2238(class168 arg0) {
        method2237(arg0, 200000);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 105)
    public static final void method2239(int arg0) {
        if (arg0 == -1 || !class525.method3102(arg0, -1)) {
            return;
        }
        class38[] var1 = class185.field2754[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class38 var3 = var1[var2];
            if (var3.field440 != null) {
                class168 var4 = new class168();
                var4.field2488 = var3;
                var4.field2484 = var3.field440;
                method2237(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 138)
    private static final void method2240(int arg0) {
        class38 var1 = class149.method979((byte) -71, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class38[] var3 = class231.field3450[var2];
        if (var3 == null) {
            class38[] var4 = class185.field2754[var2];
            int var5 = var4.length;
            var3 = class231.field3450[var2] = new class38[var5];
            class520.method3075(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class520.method3075(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IZ)V", line = 175)
    private static final void method2241(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5531[field5535++] = class157.field2291;
                return;
            }
            if (arg0 == 5001) {
                field5535 -= 3;
                class157.field2291 = field5531[field5535];
                class64.field972 = class180.method1222(field5531[field5535 + 1], (byte) -92);
                if (class64.field972 == null) {
                    class64.field972 = class227.field3331;
                }
                class454.field6735 = field5531[field5535 + 2];
                field5528++;
                class291.method1861((byte) -104, class98.field1425);
                class356.field5471.method1410(class157.field2291, -27645);
                class356.field5471.method1410(class64.field972.field5649, -27645);
                class356.field5471.method1410(class454.field6735, -27645);
                return;
            }
            if (arg0 == 5002) {
                field5520 -= 2;
                String var2 = field5536[field5520];
                String var3 = field5536[field5520 + 1];
                field5535 -= 2;
                int var4 = field5531[field5535];
                int var5 = field5531[field5535 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field5538++;
                class291.method1861((byte) -104, class465.field6880);
                class356.field5471.method1410(class456.method2739((byte) -60, var2) + class456.method2739((byte) -81, var3) + 2, -27645);
                class356.field5471.method1418(true, var2);
                class356.field5471.method1410(var4 - 1, -27645);
                class356.field5471.method1410(var5, -27645);
                class356.field5471.method1418(true, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field5531[--field5535];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class162.field2365[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field5536[field5520++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field5531[--field5535];
                int var9 = -1;
                if (var8 < 100 && class162.field2365[var8] != null) {
                    var9 = class227.field3365[var8];
                }
                field5531[field5535++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class64.field972 == null) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = class64.field972.field5649;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field5536[--field5520];
                method2249(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5520 -= 2;
                String var11 = field5536[field5520];
                String var12 = field5536[field5520 + 1];
                if (class402.field6053 != 0 || (!class56.field871 || class447.field6665) && !class214.field3124) {
                    field5526++;
                    class291.method1861((byte) -104, class272.field3955);
                    class356.field5471.method1410(0, -27645);
                    int var13 = class356.field5471.field3037;
                    class356.field5471.method1418(true, var11);
                    class30.method178(true, class356.field5471, var12);
                    class356.field5471.method1443(class356.field5471.field3037 - var13, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field5531[--field5535];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class226.field3326[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field5536[field5520++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field5531[--field5535];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class227.field3364[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field5536[field5520++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field5531[--field5535];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class207.field2959[var18];
                }
                field5531[field5535++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class500.field7365 == null || class500.field7365.field3522 == null) {
                    var20 = class474.field6983;
                } else {
                    var20 = class500.field7365.method1619(182029155, true);
                }
                field5536[field5520++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field5531[field5535++] = class454.field6735;
                return;
            }
            if (arg0 == 5017) {
                field5531[field5535++] = class68.field1039;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field5531[--field5535];
                int var22 = 0;
                if (var21 < 100 && class162.field2365[var21] != null) {
                    var22 = class227.field3365[var21];
                }
                field5531[field5535++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field5531[--field5535];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class392.field5898[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field5536[field5520++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class500.field7365 == null || class500.field7365.field3522 == null) {
                    var25 = class474.field6983;
                } else {
                    var25 = class500.field7365.method1610(0, false);
                }
                field5536[field5520++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field5531[--field5535];
                field5536[field5520++] = class105.field1524.method1300(0, var26).field7187;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field5531[--field5535];
                class486 var28 = class105.field1524.method1300(0, var27);
                if (var28.field7189 == null) {
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = var28.field7189.length;
                return;
            }
            if (arg0 == 5052) {
                field5535 -= 2;
                int var29 = field5531[field5535];
                int var30 = field5531[field5535 + 1];
                class486 var31 = class105.field1524.method1300(0, var29);
                int var32 = var31.field7189[var30];
                field5531[field5535++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field5531[--field5535];
                class486 var34 = class105.field1524.method1300(0, var33);
                if (var34.field7190 == null) {
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = var34.field7190.length;
                return;
            }
            if (arg0 == 5054) {
                field5535 -= 2;
                int var35 = field5531[field5535];
                int var36 = field5531[field5535 + 1];
                field5531[field5535++] = class105.field1524.method1300(0, var35).field7190[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field5531[--field5535];
                field5536[field5520++] = class169.field2507.method2821((byte) 77, var37).method472(-23421);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field5531[--field5535];
                class80 var39 = class169.field2507.method2821((byte) 39, var38);
                if (var39.field1207 == null) {
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = var39.field1207.length;
                return;
            }
            if (arg0 == 5057) {
                field5535 -= 2;
                int var40 = field5531[field5535];
                int var41 = field5531[field5535 + 1];
                field5531[field5535++] = class169.field2507.method2821((byte) 74, var40).field1207[var41];
                return;
            }
            if (arg0 == 5058) {
                field5521 = new class3();
                field5521.field37 = field5531[--field5535];
                field5521.field39 = class169.field2507.method2821((byte) 121, field5521.field37);
                field5521.field40 = new int[field5521.field39.method468(-1)];
                return;
            }
            if (arg0 == 5059) {
                field5518++;
                class291.method1861((byte) -104, class119.field1792);
                class356.field5471.method1410(0, -27645);
                int var42 = class356.field5471.field3037;
                class356.field5471.method1410(0, -27645);
                class356.field5471.method1413(-121, field5521.field37);
                field5521.field39.method469(class356.field5471, 0, field5521.field40);
                class356.field5471.method1443(class356.field5471.field3037 - var42, -1);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field5536[--field5520];
                field5534++;
                class291.method1861((byte) -104, class378.field5760);
                class356.field5471.method1410(0, -27645);
                int var44 = class356.field5471.field3037;
                class356.field5471.method1418(true, var43);
                class356.field5471.method1413(-125, field5521.field37);
                field5521.field39.method469(class356.field5471, 0, field5521.field40);
                class356.field5471.method1443(class356.field5471.field3037 - var44, -1);
                return;
            }
            if (arg0 == 5061) {
                field5518++;
                class291.method1861((byte) -104, class119.field1792);
                class356.field5471.method1410(0, -27645);
                int var45 = class356.field5471.field3037;
                class356.field5471.method1410(1, -27645);
                class356.field5471.method1413(-124, field5521.field37);
                field5521.field39.method469(class356.field5471, 0, field5521.field40);
                class356.field5471.method1443(class356.field5471.field3037 - var45, -1);
                return;
            }
            if (arg0 == 5062) {
                field5535 -= 2;
                int var46 = field5531[field5535];
                int var47 = field5531[field5535 + 1];
                field5531[field5535++] = class105.field1524.method1300(0, var46).field7188[var47];
                return;
            }
            if (arg0 == 5063) {
                field5535 -= 2;
                int var48 = field5531[field5535];
                int var49 = field5531[field5535 + 1];
                field5531[field5535++] = class105.field1524.method1300(0, var48).field7186[var49];
                return;
            }
            if (arg0 == 5064) {
                field5535 -= 2;
                int var50 = field5531[field5535];
                int var51 = field5531[field5535 + 1];
                if (var51 == -1) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = class105.field1524.method1300(0, var50).method2883((byte) -100, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field5535 -= 2;
                int var52 = field5531[field5535];
                int var53 = field5531[field5535 + 1];
                if (var53 == -1) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = class105.field1524.method1300(0, var52).method2886((char) var53, 0);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field5531[--field5535];
                field5531[field5535++] = class169.field2507.method2821((byte) 113, var54).method468(-1);
                return;
            }
            if (arg0 == 5067) {
                field5535 -= 2;
                int var55 = field5531[field5535];
                int var56 = field5531[field5535 + 1];
                int var57 = class169.field2507.method2821((byte) 90, var55).method476((byte) 104, var56).field6588;
                field5531[field5535++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field5535 -= 2;
                int var58 = field5531[field5535];
                int var59 = field5531[field5535 + 1];
                field5521.field40[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field5535 -= 2;
                int var60 = field5531[field5535];
                int var61 = field5531[field5535 + 1];
                field5521.field40[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field5535 -= 3;
                int var62 = field5531[field5535];
                int var63 = field5531[field5535 + 1];
                int var64 = field5531[field5535 + 2];
                class80 var65 = class169.field2507.method2821((byte) 121, var62);
                if (var65.method476((byte) 89, var63).field6588 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5531[field5535++] = var65.method471(var64, var63, (byte) 102);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field5536[--field5520];
                boolean var67 = field5531[--field5535] == 1;
                class115.method770((byte) 104, var67, var66);
                field5531[field5535++] = class102.field1471;
                return;
            }
            if (arg0 == 5072) {
                if (class461.field6847 != null && class279.field4022 < class102.field1471) {
                    field5531[field5535++] = class461.field6847[class279.field4022++] & 0xFFFF;
                    return;
                }
                field5531[field5535++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class279.field4022 = 0;
                return;
            }
            if (arg0 == 5074) {
                field5518++;
                class291.method1861((byte) -104, class119.field1792);
                class356.field5471.method1410(0, -27645);
                int var68 = class356.field5471.field3037;
                class356.field5471.method1410(2, -27645);
                class356.field5471.method1413(-124, field5521.field37);
                field5521.field39.method469(class356.field5471, 0, field5521.field40);
                class356.field5471.method1443(class356.field5471.field3037 - var68, -1);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class162.field2368.method1352(86, 91)) {
                    field5531[field5535++] = 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class162.field2368.method1352(82, 98)) {
                    field5531[field5535++] = 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class162.field2368.method1352(81, 119)) {
                    field5531[field5535++] = 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class20.method135(191, field5531[--field5535]);
                return;
            }
            if (arg0 == 5201) {
                field5531[field5535++] = class219.method1517((byte) -128);
                return;
            }
            if (arg0 == 5205) {
                class233.method1588(-1, 0, false, -1, field5531[--field5535]);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field5531[--field5535];
                class111 var70 = class460.method2756(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = var70.field1581;
                return;
            }
            if (arg0 == 5207) {
                class111 var71 = class460.method2752(field5531[--field5535]);
                if (var71 != null && var71.field1579 != null) {
                    field5536[field5520++] = var71.field1579;
                    return;
                }
                field5536[field5520++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5531[field5535++] = class39.field574;
                field5531[field5535++] = class219.field3205;
                return;
            }
            if (arg0 == 5209) {
                field5531[field5535++] = class460.field6818 + class271.field3940;
                field5531[field5535++] = class460.field6825 + class335.field4715;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field5531[--field5535];
                class111 var73 = class460.method2752(var72);
                if (var73 == null) {
                    field5531[field5535++] = 0;
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = var73.field1586 >> 14 & 0x3FFF;
                field5531[field5535++] = var73.field1586 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field5531[--field5535];
                class111 var75 = class460.method2752(var74);
                if (var75 == null) {
                    field5531[field5535++] = 0;
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = var75.field1583 - var75.field1578;
                field5531[field5535++] = var75.field1595 - var75.field1582;
                return;
            }
            if (arg0 == 5212) {
                class355 var76 = class133.method887(125);
                if (var76 == null) {
                    field5531[field5535++] = -1;
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = var76.field5459;
                int var77 = var76.field5460 << 28 | class460.field6818 + var76.field5465 << 14 | class460.field6825 + var76.field5458;
                field5531[field5535++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class355 var78 = class418.method2510(16711935);
                if (var78 == null) {
                    field5531[field5535++] = -1;
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = var78.field5459;
                int var79 = var78.field5460 << 28 | class460.field6818 + var78.field5465 << 14 | class460.field6825 + var78.field5458;
                field5531[field5535++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field5531[--field5535];
                class111 var81 = class264.method1757(86);
                if (var81 != null) {
                    boolean var82 = var81.method682(var80 >> 28 & 0x3, field5544, (byte) 59, var80 >> 14 & 0x3FFF, var80 & 0x3FFF);
                    if (var82) {
                        class307.method1934(field5544[2], -5, field5544[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5535 -= 2;
                int var83 = field5531[field5535];
                int var84 = field5531[field5535 + 1];
                class88 var85 = class460.method2761(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class111 var87 = (class111) var85.method514((byte) 112); var87 != null; var87 = (class111) var85.method517((byte) -119)) {
                    if (var87.field1581 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field5531[field5535++] = 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field5531[--field5535];
                class111 var89 = class460.method2752(var88);
                if (var89 == null) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = var89.field1589;
                return;
            }
            if (arg0 == 5220) {
                field5531[field5535++] = class482.field7062 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field5531[--field5535];
                class307.method1934(var90 & 0x3FFF, -5, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class111 var91 = class264.method1757(100);
                if (var91 != null) {
                    boolean var92 = var91.method684(class460.field6818 + class271.field3940, field5544, class460.field6825 + class335.field4715, false);
                    if (var92) {
                        field5531[field5535++] = field5544[1];
                        field5531[field5535++] = field5544[2];
                        return;
                    }
                    field5531[field5535++] = -1;
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = -1;
                field5531[field5535++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5535 -= 2;
                int var93 = field5531[field5535];
                int var94 = field5531[field5535 + 1];
                class233.method1588(var94 >> 14 & 0x3FFF, 0, false, var94 & 0x3FFF, var93);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field5531[--field5535];
                class111 var96 = class264.method1757(-61);
                if (var96 != null) {
                    boolean var97 = var96.method682(var95 >> 28 & 0x3, field5544, (byte) 61, var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                    if (var97) {
                        field5531[field5535++] = field5544[1];
                        field5531[field5535++] = field5544[2];
                        return;
                    }
                    field5531[field5535++] = -1;
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = -1;
                field5531[field5535++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field5531[--field5535];
                class111 var99 = class264.method1757(-33);
                if (var99 != null) {
                    boolean var100 = var99.method684(var98 >> 14 & 0x3FFF, field5544, var98 & 0x3FFF, false);
                    if (var100) {
                        field5531[field5535++] = field5544[1];
                        field5531[field5535++] = field5544[2];
                        return;
                    }
                    field5531[field5535++] = -1;
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = -1;
                field5531[field5535++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class248.method1665(field5531[--field5535], 2200);
                return;
            }
            if (arg0 == 5227) {
                field5535 -= 2;
                int var101 = field5531[field5535];
                int var102 = field5531[field5535 + 1];
                class233.method1588(var102 >> 14 & 0x3FFF, 0, true, var102 & 0x3FFF, var101);
                return;
            }
            if (arg0 == 5228) {
                class378.field5762 = field5531[--field5535] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5531[field5535++] = class378.field5762 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field5531[--field5535];
                class282.method1824((byte) -115, var103);
                return;
            }
            if (arg0 == 5231) {
                field5535 -= 2;
                int var104 = field5531[field5535];
                boolean var105 = field5531[field5535 + 1] == 1;
                if (class91.field1371 != null) {
                    class337 var106 = class91.field1371.method2605(false, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2049(-128);
                        return;
                    }
                    if (var106 == null && var105) {
                        class337 var107 = new class337();
                        class91.field1371.method2606(var107, (long) var104, 0);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field5531[--field5535];
                if (class91.field1371 != null) {
                    class337 var109 = class91.field1371.method2605(false, (long) var108);
                    field5531[field5535++] = var109 == null ? 0 : 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5535 -= 2;
                int var110 = field5531[field5535];
                boolean var111 = field5531[field5535 + 1] == 1;
                if (class23.field251 != null) {
                    class337 var112 = class23.field251.method2605(false, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2049(-84);
                        return;
                    }
                    if (var112 == null && var111) {
                        class337 var113 = new class337();
                        class23.field251.method2606(var113, (long) var110, 0);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field5531[--field5535];
                if (class23.field251 != null) {
                    class337 var115 = class23.field251.method2605(false, (long) var114);
                    field5531[field5535++] = var115 == null ? 0 : 1;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5531[field5535++] = class460.field6800 == null ? -1 : class460.field6800.field1581;
                return;
            }
            if (arg0 == 5236) {
                field5535 -= 2;
                int var116 = field5531[field5535];
                int var117 = field5531[field5535 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class447.method2689(var116, var119, var118, (byte) 99);
                if (var120 < 0) {
                    field5531[field5535++] = -1;
                    return;
                }
                field5531[field5535++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5535 -= 2;
                int var121 = field5531[field5535];
                int var122 = field5531[field5535 + 1];
                class407.method2447(var122, false, 3, var121, (byte) -49);
                field5531[field5535++] = class82.field1255 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class82.field1255 != null) {
                    class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
                }
                return;
            }
            if (arg0 == 5302) {
                class267[] var123 = class264.method1759((byte) 77);
                field5531[field5535++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field5531[--field5535];
                class267[] var125 = class264.method1759((byte) 27);
                field5531[field5535++] = var125[var124].field3900;
                field5531[field5535++] = var125[var124].field3898;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class426.field6401.field1026;
                int var127 = class426.field6401.field1000;
                int var128 = -1;
                class267[] var129 = class264.method1759((byte) 11);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class267 var131 = var129[var130];
                    if (var131.field3900 == var126 && var131.field3898 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field5531[field5535++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field5531[field5535++] = class14.method89(false);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field5531[--field5535];
                if (var132 >= 1 && var132 <= 2) {
                    class407.method2447(-1, false, var132, -1, (byte) -49);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5531[field5535++] = class426.field6401.field991;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field5531[--field5535];
                if (var133 >= 1 && var133 <= 2) {
                    class426.field6401.field991 = var133;
                    class426.field6401.method2523(class483.field7077, -29);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5520 -= 2;
                String var134 = field5536[field5520];
                String var135 = field5536[field5520 + 1];
                int var136 = field5531[--field5535];
                field5540++;
                class291.method1861((byte) -104, class253.field3769);
                class356.field5471.method1410(class456.method2739((byte) -118, var134) + class456.method2739((byte) -24, var135) + 1, -27645);
                class356.field5471.method1418(true, var134);
                class356.field5471.method1418(true, var135);
                class356.field5471.method1410(var136, -27645);
                return;
            }
            if (arg0 == 5401) {
                field5535 -= 2;
                class210.field3061[field5531[field5535]] = (short) class223.method1527(field5531[field5535 + 1], (byte) -98);
                class294.field4196.method458((byte) 79);
                class294.field4196.method457(false);
                class431.field6451.method1732(-31);
                class377.method2315(false);
                return;
            }
            if (arg0 == 5405) {
                field5535 -= 2;
                int var137 = field5531[field5535];
                int var138 = field5531[field5535 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class435.field6513[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5535 -= 7;
                int var139 = field5531[field5535];
                int var140 = field5531[field5535 + 1] << 1;
                int var141 = field5531[field5535 + 2];
                int var142 = field5531[field5535 + 3];
                int var143 = field5531[field5535 + 4];
                int var144 = field5531[field5535 + 5];
                int var145 = field5531[field5535 + 6];
                if (var139 >= 0 && var139 < 2 && class435.field6513[var139] != null && var140 >= 0 && var140 < class435.field6513[var139].length) {
                    class435.field6513[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class435.field6513[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class435.field6513[field5531[--field5535]].length >> 1;
                field5531[field5535++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class82.field1255 != null) {
                    class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
                }
                if (class214.field3119 != null) {
                    class352.method2206(true);
                    System.exit(0);
                    return;
                }
                String var147 = class177.field2613 == null ? class403.method2429(true) : class177.field2613;
                class36.method210(var147, class170.field2529 == 1, class483.field7077, false, (byte) -127);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class94.field1394 != null) {
                    if (class94.field1394.field4030 == null) {
                        var148 = class149.method980(class94.field1394.field4031, (byte) -125);
                    } else {
                        var148 = (String) class94.field1394.field4030;
                    }
                }
                field5536[field5520++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field5531[field5535++] = class432.field6459 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class82.field1255 != null) {
                    class407.method2447(-1, false, class426.field6401.field991, -1, (byte) -49);
                }
                String var149 = field5536[--field5520];
                boolean var150 = field5531[--field5535] == 1;
                String var151 = class403.method2429(true) + var149;
                class36.method210(var151, class170.field2529 == 1, class483.field7077, var150, (byte) -124);
                return;
            }
            if (arg0 == 5422) {
                field5520 -= 2;
                String var152 = field5536[field5520];
                String var153 = field5536[field5520 + 1];
                int var154 = field5531[--field5535];
                if (var152.length() > 0) {
                    if (class357.field5493 == null) {
                        class357.field5493 = new String[class52.field814[class183.field2707.field6355]];
                    }
                    class357.field5493[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class169.field2498 == null) {
                        class169.field2498 = new String[class52.field814[class183.field2707.field6355]];
                    }
                    class169.field2498[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5536[--field5520]);
                return;
            }
            if (arg0 == 5424) {
                field5535 -= 11;
                class47.field766 = field5531[field5535];
                class159.field2351 = field5531[field5535 + 1];
                class80.field1216 = field5531[field5535 + 2];
                class286.field4102 = field5531[field5535 + 3];
                class238.field3499 = field5531[field5535 + 4];
                class39.field575 = field5531[field5535 + 5];
                class170.field2512 = field5531[field5535 + 6];
                class511.field7484 = field5531[field5535 + 7];
                class60.field902 = field5531[field5535 + 8];
                class359.field5514 = field5531[field5535 + 9];
                class329.field4684 = field5531[field5535 + 10];
                class6.field81.method2924((byte) -128, class238.field3499);
                class6.field81.method2924((byte) -127, class39.field575);
                class6.field81.method2924((byte) -128, class170.field2512);
                class6.field81.method2924((byte) -126, class511.field7484);
                class6.field81.method2924((byte) -127, class60.field902);
                class307.field4412 = null;
                class28.field289 = null;
                class133.field2040 = null;
                class423.field6361 = null;
                class202.field2920 = null;
                class179.field2637 = null;
                class62.field947 = null;
                class8.field114 = null;
                class402.field6034 = true;
                return;
            }
            if (arg0 == 5425) {
                class527.method3114(1999147020);
                class402.field6034 = false;
                return;
            }
            if (arg0 == 5426) {
                field5535 -= 2;
                class202.field2925 = field5531[field5535];
                class413.field6213 = field5531[field5535 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5535 -= 2;
                class122.field1847 = field5531[field5535 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5535 -= 2;
                int var155 = field5531[field5535];
                int var156 = field5531[field5535 + 1];
                field5531[field5535++] = class257.method1710((byte) -117, var156, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class28.method168(false, 29120, field5536[--field5520]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class501.method2995("accountcreated", (byte) -26, class483.field7077.field6462);
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5535 -= 4;
                int var157 = field5531[field5535];
                int var158 = field5531[field5535 + 1];
                int var159 = field5531[field5535 + 2];
                int var160 = field5531[field5535 + 3];
                class155.method997(var158, false, (byte) 109, (var157 >> 14 & 0x3FFF) - class68.field1038, var160, var159, (var157 & 0x3FFF) - class24.field259);
                return;
            }
            if (arg0 == 5501) {
                field5535 -= 4;
                int var161 = field5531[field5535];
                int var162 = field5531[field5535 + 1];
                int var163 = field5531[field5535 + 2];
                int var164 = field5531[field5535 + 3];
                class290.method1860(false, (var161 & 0x3FFF) - class24.field259, var162, var163, var164, (var161 >> 14 & 0x3FFF) - class68.field1038);
                return;
            }
            if (arg0 == 5502) {
                field5535 -= 6;
                int var165 = field5531[field5535];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class438.field6539 = var165;
                int var166 = field5531[field5535 + 1];
                if (var166 + 1 >= class435.field6513[class438.field6539].length >> 1) {
                    throw new RuntimeException();
                }
                class4.field55 = var166;
                class77.field1145 = 0;
                class229.field3413 = field5531[field5535 + 2];
                class495.field7327 = field5531[field5535 + 3];
                int var167 = field5531[field5535 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class337.field4743 = var167;
                int var168 = field5531[field5535 + 5];
                if (var168 + 1 >= class435.field6513[class337.field4743].length >> 1) {
                    throw new RuntimeException();
                }
                class108.field1559 = var168;
                class140.field2103 = 3;
                return;
            }
            if (arg0 == 5503) {
                class375.method2302((byte) 60);
                return;
            }
            if (arg0 == 5504) {
                field5535 -= 2;
                class178.method1215(field5531[field5535], field5531[field5535 + 1], true, 0);
                return;
            }
            if (arg0 == 5505) {
                field5531[field5535++] = (int) class24.field262 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5531[field5535++] = (int) class382.field5792 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class371.method2290(10521);
                return;
            }
            if (arg0 == 5508) {
                class208.method1400(-16);
                return;
            }
            if (arg0 == 5509) {
                class458.method2745((byte) 105);
                return;
            }
            if (arg0 == 5510) {
                class165.method1149(-128);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field5531[--field5535];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class68.field1038;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class30.field323) {
                    var172 = class30.field323;
                }
                int var173 = var171 - class24.field259;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class182.field2661) {
                    var173 = class182.field2661;
                }
                class94.field1398 = (var172 << 7) + 64;
                class367.field5612 = (var173 << 7) + 64;
                class140.field2103 = 4;
                return;
            }
            if (arg0 == 5512) {
                class427.method2559((byte) -116);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5520 -= 2;
                String var174 = field5536[field5520];
                String var175 = field5536[field5520 + 1];
                int var176 = field5531[--field5535];
                if (class193.field2832 != 10) {
                    return;
                }
                if (class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0 && class164.field2420 == 0) {
                    class455.method2735(0, var175, var176, var174);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class94.method547(-20380);
                return;
            }
            if (arg0 == 5602) {
                if (class242.field3573 == 0) {
                    class80.field1217 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field5535 -= 4;
                if (class193.field2832 != 10) {
                    return;
                }
                if (class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0 && class164.field2420 == 0) {
                    class131.method881(field5531[field5535 + 3], field5531[field5535 + 1], field5531[field5535], field5531[field5535 + 2], 114);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field5520--;
                if (class193.field2832 != 10) {
                    return;
                }
                if (class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0 && class164.field2420 == 0) {
                    class88.method516(1, class439.method2649((byte) 102, field5536[field5520]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5520 -= 3;
                field5535 -= 7;
                if (class193.field2832 != 10) {
                    return;
                }
                if (class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0 && class164.field2420 == 0) {
                    class426.method2555((byte) 113, field5531[field5535 + 3], field5531[field5535 + 6] == 1, field5531[field5535], field5531[field5535 + 2], field5531[field5535 + 4] == 1, class439.method2649((byte) 58, field5536[field5520]), field5531[field5535 + 5] == 1, field5536[field5520 + 2], field5536[field5520 + 1], field5531[field5535 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class90.field1360 == 0) {
                    client.field2856 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5531[field5535++] = class80.field1217;
                return;
            }
            if (arg0 == 5608) {
                field5531[field5535++] = class28.field292;
                return;
            }
            if (arg0 == 5609) {
                field5531[field5535++] = client.field2856;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field5536[field5520++] = class264.field3868.length > var177 ? class433.method2607(class264.field3868[var177], -1) : "";
                }
                class264.field3868 = null;
                return;
            }
            if (arg0 == 5611) {
                field5531[field5535++] = class376.field5736;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field5531[--field5535];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class426.field6401.field1024 = var178;
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -43);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6002) {
                class426.field6401.method2529(14110, field5531[--field5535] == 1);
                class525.method3107(-2119782128);
                class147.method969(123);
                class426.field6401.method2523(class483.field7077, -89);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6003) {
                class426.field6401.field988 = field5531[--field5535] == 1;
                class147.method969(88);
                class426.field6401.method2523(class483.field7077, -29);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6005) {
                class426.field6401.field993 = field5531[--field5535] == 1;
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -30);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6006) {
                class426.field6401.field1004 = field5531[--field5535] == 1;
                class348.field5015.method1070(!class426.field6401.field1004);
                class426.field6401.method2523(class483.field7077, -19);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6007) {
                class426.field6401.field987 = field5531[--field5535];
                class426.field6401.method2523(class483.field7077, -117);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6008) {
                class426.field6401.field1014 = field5531[--field5535] == 1;
                class426.field6401.method2523(class483.field7077, -26);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6009) {
                class426.field6401.field1020 = field5531[--field5535] == 1;
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -86);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6010) {
                class426.field6401.field1017 = field5531[--field5535] == 1;
                class426.field6401.method2523(class483.field7077, -54);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field5531[--field5535];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class426.field6401.method395(var179, class170.field2529, (byte) -61);
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -76);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6012) {
                class426.field6401.method387(class170.field2529, field5531[--field5535] == 1, (byte) -119);
                class411.method2475(-106);
                class407.method2449(-115);
                class426.field6401.method2523(class483.field7077, -24);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6014) {
                class426.field6401.field997 = field5531[--field5535] == 1;
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -94);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6015) {
                class426.field6401.field1019 = field5531[--field5535] == 1;
                class525.method3107(-2119782128);
                class426.field6401.method2523(class483.field7077, -83);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field5531[--field5535];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class426.field6401.field982 = var180;
                class14.method91((byte) 86, class170.field2529);
                class426.field6401.method2523(class483.field7077, -29);
                return;
            }
            if (arg0 == 6017) {
                class426.field6401.field1006 = field5531[--field5535] == 1;
                class169.method1169((byte) 108);
                class426.field6401.method2523(class483.field7077, -98);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field5531[--field5535];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class426.field6401.field1022 = var181;
                class426.field6401.method2523(class483.field7077, -42);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field5531[--field5535];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class426.field6401.field1018 != var182) {
                    if (class426.field6401.field1018 == 0 && class386.field5852 != -1) {
                        class122.method799(class465.field6881, false, (byte) -16, 0, var182, class386.field5852);
                        class104.field1515 = false;
                    } else if (var182 == 0) {
                        class190.method1297(true);
                        class104.field1515 = false;
                    } else {
                        class454.method2730(false, var182);
                    }
                    class426.field6401.field1018 = var182;
                }
                class426.field6401.method2523(class483.field7077, -96);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field5531[--field5535];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class426.field6401.field996 = var183;
                class426.field6401.method2523(class483.field7077, -85);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6021) {
                class426.field6401.field6309 = field5531[--field5535] == 1;
                class147.method969(125);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field5531[--field5535];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class34.field363 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class66.method388((byte) -49, var184);
                class426.field6401.method2523(class483.field7077, -88);
                class526.field7788 = false;
                field5531[field5535++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field5531[--field5535];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class426.field6401.field1002 = var186;
                class426.field6401.method2523(class483.field7077, -81);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field5531[--field5535];
                if (var187 < 0 || var187 > class184.method1270(class34.field363, 2)) {
                    var187 = 0;
                }
                class426.field6401.field1001 = var187;
                class426.field6401.method2523(class483.field7077, -74);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field5531[--field5535];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class427.method2560(var188 == 1, (byte) -114);
                return;
            }
            if (arg0 == 6028) {
                class426.field6401.field1016 = field5531[--field5535] != 0;
                class426.field6401.method2523(class483.field7077, -110);
                return;
            }
            if (arg0 == 6029) {
                class426.field6401.field987 = field5531[--field5535];
                class426.field6401.method2523(class483.field7077, -22);
                return;
            }
            if (arg0 == 6030) {
                class426.field6401.field998 = field5531[--field5535] != 0;
                class426.field6401.method2523(class483.field7077, -119);
                class525.method3107(-2119782128);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field5531[--field5535];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class14.method91((byte) 87, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field5531[--field5535];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class426.field6401.field994 = var190;
                class426.field6401.method2523(class483.field7077, -26);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field5531[--field5535];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class426.field6401.field1007 = var191;
                class426.field6401.method2523(class483.field7077, -28);
                return;
            }
            if (arg0 == 6034) {
                class426.field6401.field989 = field5531[--field5535] == 1;
                class426.field6401.method2523(class483.field7077, -96);
                class411.method2475(-54);
                class526.field7788 = false;
                return;
            }
            if (arg0 == 6035) {
                class426.field6401.field6321 = field5531[--field5535] == 1;
                class525.method3107(-2119782128);
                class147.method969(105);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5531[field5535++] = class426.field6401.field1024;
                return;
            }
            if (arg0 == 6102) {
                field5531[field5535++] = class426.field6401.method2530(class170.field2529, -1) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5531[field5535++] = class426.field6401.field988 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5531[field5535++] = class426.field6401.field993 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field5531[field5535++] = class426.field6401.field1004 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5531[field5535++] = class426.field6401.field987;
                return;
            }
            if (arg0 == 6108) {
                field5531[field5535++] = class426.field6401.field1014 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field5531[field5535++] = class426.field6401.field1020 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5531[field5535++] = class426.field6401.field1017 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5531[field5535++] = class426.field6401.method393(class170.field2529, 1);
                return;
            }
            if (arg0 == 6112) {
                field5531[field5535++] = class426.field6401.method392(-2, class170.field2529) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5531[field5535++] = class426.field6401.field997 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5531[field5535++] = class426.field6401.field1019 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5531[field5535++] = class426.field6401.field982;
                return;
            }
            if (arg0 == 6117) {
                field5531[field5535++] = class426.field6401.field1006 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5531[field5535++] = class426.field6401.field1022;
                return;
            }
            if (arg0 == 6119) {
                field5531[field5535++] = class426.field6401.field1018;
                return;
            }
            if (arg0 == 6120) {
                field5531[field5535++] = class426.field6401.field996;
                return;
            }
            if (arg0 == 6121) {
                field5531[field5535++] = class348.field5015.method1088() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field5531[field5535++] = class107.method662((byte) -118);
                return;
            }
            if (arg0 == 6124) {
                field5531[field5535++] = class426.field6401.field1002;
                return;
            }
            if (arg0 == 6125) {
                field5531[field5535++] = class426.field6401.field1001;
                return;
            }
            if (arg0 == 6126) {
                field5531[field5535++] = class348.field5015.method1125() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field5531[field5535++] = class426.field6401.field980 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5531[field5535++] = class426.field6401.field1016 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5531[field5535++] = class426.field6401.field987;
                return;
            }
            if (arg0 == 6130) {
                field5531[field5535++] = class426.field6401.field998 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5531[field5535++] = class170.field2529;
                return;
            }
            if (arg0 == 6132) {
                field5531[field5535++] = class426.field6401.field994;
                return;
            }
            if (arg0 == 6133) {
                field5531[field5535++] = class432.field6459 == 1 || class432.field6459 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field5531[field5535++] = class184.method1270(class34.field363, 2);
                return;
            }
            if (arg0 == 6135) {
                field5531[field5535++] = class426.field6401.field1007;
                return;
            }
            if (arg0 == 6136) {
                field5531[field5535++] = class426.field6401.field989 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5535 -= 2;
                class66.field999 = (short) field5531[field5535];
                if (class66.field999 <= 0) {
                    class66.field999 = 256;
                }
                class402.field6054 = (short) field5531[field5535 + 1];
                if (class402.field6054 <= 0) {
                    class402.field6054 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5535 -= 2;
                class367.field5611 = (short) field5531[field5535];
                if (class367.field5611 <= 0) {
                    class367.field5611 = 256;
                }
                class17.field187 = (short) field5531[field5535 + 1];
                if (class17.field187 <= 0) {
                    class17.field187 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5535 -= 4;
                class484.field7106 = (short) field5531[field5535];
                if (class484.field7106 <= 0) {
                    class484.field7106 = 1;
                }
                class474.field6977 = (short) field5531[field5535 + 1];
                if (class474.field6977 <= 0) {
                    class474.field6977 = 32767;
                } else if (class474.field6977 < class484.field7106) {
                    class474.field6977 = class484.field7106;
                }
                class412.field6197 = (short) field5531[field5535 + 2];
                if (class412.field6197 <= 0) {
                    class412.field6197 = 1;
                }
                class9.field124 = (short) field5531[field5535 + 3];
                if (class9.field124 <= 0) {
                    class9.field124 = 32767;
                    return;
                }
                if (class9.field124 < class412.field6197) {
                    class9.field124 = class412.field6197;
                }
                return;
            }
            if (arg0 == 6203) {
                class387.method2360(2, false, class415.field6234.field472, 0, class415.field6234.field553, 0);
                field5531[field5535++] = class409.field6154;
                field5531[field5535++] = class364.field5576;
                return;
            }
            if (arg0 == 6204) {
                field5531[field5535++] = class367.field5611;
                field5531[field5535++] = class17.field187;
                return;
            }
            if (arg0 == 6205) {
                field5531[field5535++] = class66.field999;
                field5531[field5535++] = class402.field6054;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5531[field5535++] = (int) (class256.method1708((byte) 118) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5531[field5535++] = (int) (class256.method1708((byte) 118) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5535 -= 3;
                int var192 = field5531[field5535];
                int var193 = field5531[field5535 + 1];
                int var194 = field5531[field5535 + 2];
                field5533.clear();
                field5533.set(11, 12);
                field5533.set(var194, var193, var192);
                field5531[field5535++] = (int) (field5533.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field5533.clear();
                field5533.setTime(new Date(class256.method1708((byte) 118)));
                field5531[field5535++] = field5533.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field5531[--field5535];
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
                field5531[field5535++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5531[field5535++] = class512.method3026(-70) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5531[field5535++] = class221.method1525(0) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class193.field2832 == 10 && class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0) {
                    field5531[field5535++] = class419.method2517(1000) == -1 ? 0 : 1;
                    return;
                }
                field5531[field5535++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class412 var197 = class187.method1286(true);
                if (var197 != null) {
                    field5531[field5535++] = var197.field6189;
                    field5531[field5535++] = var197.field880;
                    field5536[field5520++] = var197.field6192;
                    class145 var198 = var197.method2480(23093);
                    field5531[field5535++] = var198.field2152;
                    field5536[field5520++] = var198.field2154;
                    field5531[field5535++] = var197.field888;
                    field5531[field5535++] = var197.field6191;
                    return;
                }
                field5531[field5535++] = -1;
                field5531[field5535++] = 0;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class412 var199 = class185.method1272((byte) -127);
                if (var199 != null) {
                    field5531[field5535++] = var199.field6189;
                    field5531[field5535++] = var199.field880;
                    field5536[field5520++] = var199.field6192;
                    class145 var200 = var199.method2480(23093);
                    field5531[field5535++] = var200.field2152;
                    field5536[field5520++] = var200.field2154;
                    field5531[field5535++] = var199.field888;
                    field5531[field5535++] = var199.field6191;
                    return;
                }
                field5531[field5535++] = -1;
                field5531[field5535++] = 0;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field5531[--field5535];
                if (class193.field2832 == 10 && class34.field357 == 0 && class242.field3573 == 0 && class90.field1360 == 0) {
                    field5531[field5535++] = class307.method1937(var201, (byte) -93) ? 1 : 0;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class426.field6401.field995 = field5531[--field5535];
                class426.field6401.method2523(class483.field7077, -39);
                return;
            }
            if (arg0 == 6505) {
                field5531[field5535++] = class426.field6401.field995;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field5531[--field5535];
                class412 var203 = class450.method2717((byte) 86, var202);
                if (var203 != null) {
                    field5531[field5535++] = var203.field880;
                    field5536[field5520++] = var203.field6192;
                    class145 var204 = var203.method2480(23093);
                    field5531[field5535++] = var204.field2152;
                    field5536[field5520++] = var204.field2154;
                    field5531[field5535++] = var203.field888;
                    field5531[field5535++] = var203.field6191;
                    return;
                }
                field5531[field5535++] = -1;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5536[field5520++] = "";
                field5531[field5535++] = 0;
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field5535 -= 4;
                int var205 = field5531[field5535];
                boolean var206 = field5531[field5535 + 1] == 1;
                int var207 = field5531[field5535 + 2];
                boolean var208 = field5531[field5535 + 3] == 1;
                class483.method2868(var208, 0, var207, var205, var206);
                return;
            }
            if (arg0 == 6508) {
                class260.method1729(-32631);
                return;
            }
            if (arg0 == 6509) {
                if (class193.field2832 != 10) {
                    return;
                }
                class444.field6615 = field5531[--field5535] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class426.field6401.field1013 = field5531[--field5535] == 1;
                class426.field6401.method2523(class483.field7077, -109);
                return;
            }
            if (arg0 == 6601) {
                field5531[field5535++] = class426.field6401.field1013 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class455.field6742 == class266.field3896) {
            if (arg0 == 6700) {
                int var209 = class431.field6450.method2602(0);
                if (class6.field79 != -1) {
                    var209++;
                }
                field5531[field5535++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field5531[--field5535];
                if (class6.field79 != -1) {
                    if (var210 == 0) {
                        field5531[field5535++] = class6.field79;
                        return;
                    }
                    var210--;
                }
                class92 var211 = (class92) class431.field6450.method2608(true);
                while (var210-- > 0) {
                    var211 = (class92) class431.field6450.method2603(46);
                }
                field5531[field5535++] = var211.field1378;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field5531[--field5535];
                if (class185.field2754[var212] == null) {
                    field5536[field5520++] = "";
                    return;
                }
                String var213 = class185.field2754[var212][0].field457;
                if (var213 == null) {
                    field5536[field5520++] = "";
                    return;
                }
                field5536[field5520++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field5531[--field5535];
                if (class185.field2754[var214] == null) {
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = class185.field2754[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field5535 -= 2;
                int var215 = field5531[field5535];
                int var216 = field5531[field5535 + 1];
                if (class185.field2754[var215] == null) {
                    field5536[field5520++] = "";
                    return;
                }
                String var217 = class185.field2754[var215][var216].field457;
                if (var217 == null) {
                    field5536[field5520++] = "";
                    return;
                }
                field5536[field5520++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field5535 -= 2;
                int var218 = field5531[field5535];
                int var219 = field5531[field5535 + 1];
                if (class185.field2754[var218] == null) {
                    field5531[field5535++] = 0;
                    return;
                }
                field5531[field5535++] = class185.field2754[var218][var219].field493;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field5535 -= 3;
                int var220 = field5531[field5535];
                int var221 = field5531[field5535 + 1];
                int var222 = field5531[field5535 + 2];
                class361.method2251("", (byte) 116, 1, var220 << 16 | var221, var222);
                return;
            }
            if (arg0 == 6708) {
                field5535 -= 3;
                int var223 = field5531[field5535];
                int var224 = field5531[field5535 + 1];
                int var225 = field5531[field5535 + 2];
                class361.method2251("", (byte) 123, 2, var223 << 16 | var224, var225);
                return;
            }
            if (arg0 == 6709) {
                field5535 -= 3;
                int var226 = field5531[field5535];
                int var227 = field5531[field5535 + 1];
                int var228 = field5531[field5535 + 2];
                class361.method2251("", (byte) -25, 3, var226 << 16 | var227, var228);
                return;
            }
            if (arg0 == 6710) {
                field5535 -= 3;
                int var229 = field5531[field5535];
                int var230 = field5531[field5535 + 1];
                int var231 = field5531[field5535 + 2];
                class361.method2251("", (byte) -32, 4, var229 << 16 | var230, var231);
                return;
            }
            if (arg0 == 6711) {
                field5535 -= 3;
                int var232 = field5531[field5535];
                int var233 = field5531[field5535 + 1];
                int var234 = field5531[field5535 + 2];
                class361.method2251("", (byte) 110, 5, var232 << 16 | var233, var234);
                return;
            }
            if (arg0 == 6712) {
                field5535 -= 3;
                int var235 = field5531[field5535];
                int var236 = field5531[field5535 + 1];
                int var237 = field5531[field5535 + 2];
                class361.method2251("", (byte) -86, 6, var235 << 16 | var236, var237);
                return;
            }
            if (arg0 == 6713) {
                field5535 -= 3;
                int var238 = field5531[field5535];
                int var239 = field5531[field5535 + 1];
                int var240 = field5531[field5535 + 2];
                class361.method2251("", (byte) -75, 7, var238 << 16 | var239, var240);
                return;
            }
            if (arg0 == 6714) {
                field5535 -= 3;
                int var241 = field5531[field5535];
                int var242 = field5531[field5535 + 1];
                int var243 = field5531[field5535 + 2];
                class361.method2251("", (byte) -63, 8, var241 << 16 | var242, var243);
                return;
            }
            if (arg0 == 6715) {
                field5535 -= 3;
                int var244 = field5531[field5535];
                int var245 = field5531[field5535 + 1];
                int var246 = field5531[field5535 + 2];
                class361.method2251("", (byte) -113, 9, var244 << 16 | var245, var246);
                return;
            }
            if (arg0 == 6716) {
                field5535 -= 3;
                int var247 = field5531[field5535];
                int var248 = field5531[field5535 + 1];
                int var249 = field5531[field5535 + 2];
                class361.method2251("", (byte) 120, 10, var247 << 16 | var248, var249);
                return;
            }
            if (arg0 == 6717) {
                field5535 -= 3;
                int var250 = field5531[field5535];
                int var251 = field5531[field5535 + 1];
                int var252 = field5531[field5535 + 2];
                class38 var253 = class229.method1575(var252, 0, var250 << 16 | var251);
                class138.method920((byte) -43);
                class387 var254 = client.method1328(var253);
                class353.method2211((byte) -97, var254.method2361((byte) 125), var254.field5860, var253);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field5531[--field5535];
                class158 var256 = class14.field176.method539(var255, (byte) 60);
                if (var256.field2339 == null) {
                    field5536[field5520++] = "";
                    return;
                }
                field5536[field5520++] = var256.field2339;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field5531[--field5535];
                class158 var258 = class14.field176.method539(var257, (byte) 60);
                field5531[field5535++] = var258.field2315;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field5531[--field5535];
                class158 var260 = class14.field176.method539(var259, (byte) 60);
                field5531[field5535++] = var260.field2314;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field5531[--field5535];
                class158 var262 = class14.field176.method539(var261, (byte) 60);
                field5531[field5535++] = var262.field2319;
                return;
            }
            if (arg0 == 6804) {
                field5535 -= 2;
                int var263 = field5531[field5535];
                int var264 = field5531[field5535 + 1];
                class83 var265 = class381.field5778.method506(true, var264);
                if (var265.method491(-87)) {
                    field5536[field5520++] = class14.field176.method539(var263, (byte) 60).method1003(var265.field1283, 0, var264);
                    return;
                }
                field5531[field5535++] = class14.field176.method539(var263, (byte) 60).method1002(-69, var264, var265.field1284);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 3147)
    private static final void method2242(int arg0) {
        class38 var1 = class149.method979((byte) -113, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class38[] var3 = class231.field3450[var2];
        if (var3 == null) {
            class38[] var4 = class185.field2754[var2];
            int var5 = var4.length;
            var3 = class231.field3450[var2] = new class38[var5];
            class520.method3075(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class520.method3075(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IZ)V", line = 3184)
    private static final void method2243(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field5535 -= 3;
                int var2 = field5531[field5535];
                int var3 = field5531[field5535 + 1];
                int var4 = field5531[field5535 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class38 var5 = class149.method979((byte) -84, var2);
                if (var5.field452 == null) {
                    var5.field452 = new class38[var4 + 1];
                }
                if (var5.field452.length <= var4) {
                    class38[] var6 = new class38[var4 + 1];
                    for (int var7 = 0; var7 < var5.field452.length; var7++) {
                        var6[var7] = var5.field452[var7];
                    }
                    var5.field452 = var6;
                }
                if (var4 > 0 && var5.field452[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class38 var8 = new class38();
                var8.field492 = var3;
                var8.field480 = var8.field467 = var5.field467;
                var8.field547 = var4;
                var5.field452[var4] = var8;
                if (arg1) {
                    field5525 = var8;
                } else {
                    field5527 = var8;
                }
                class350.method2203((byte) -126, var5);
                return;
            }
            if (arg0 == 101) {
                class38 var9 = arg1 ? field5525 : field5527;
                if (var9.field547 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class38 var10 = class149.method979((byte) -73, var9.field467);
                var10.field452[var9.field547] = null;
                class350.method2203((byte) -124, var10);
                return;
            }
            if (arg0 == 102) {
                class38 var11 = class149.method979((byte) -80, field5531[--field5535]);
                var11.field452 = null;
                class350.method2203((byte) -119, var11);
                return;
            }
            if (arg0 == 200) {
                field5535 -= 2;
                int var12 = field5531[field5535];
                int var13 = field5531[field5535 + 1];
                class38 var14 = class229.method1575(var13, 0, var12);
                if (var14 != null && var13 != -1) {
                    field5531[field5535++] = 1;
                    if (arg1) {
                        field5525 = var14;
                        return;
                    }
                    field5527 = var14;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5531[--field5535];
                class38 var16 = class149.method979((byte) -117, var15);
                if (var16 != null) {
                    field5531[field5535++] = 1;
                    if (arg1) {
                        field5525 = var16;
                        return;
                    }
                    field5527 = var16;
                    return;
                }
                field5531[field5535++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5531[--field5535];
                method2240(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5531[--field5535];
                method2242(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5535 -= 2;
                int var19 = field5531[field5535];
                int var20 = field5531[field5535 + 1];
                for (int var21 = 0; var21 < class177.field2614.length; var21++) {
                    if (class177.field2614[var21] == var19) {
                        class500.field7365.field3532.method256((byte) -128, var20, class456.field6745, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class350.field5390.length; var22++) {
                    if (class350.field5390[var22] == var19) {
                        class500.field7365.field3532.method256((byte) -110, var20, class456.field6745, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5535 -= 2;
                int var23 = field5531[field5535];
                int var24 = field5531[field5535 + 1];
                class500.field7365.field3532.method259(12, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5531[--field5535] != 0;
                class500.field7365.field3532.method255(var25, 126);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class38 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class149.method979((byte) -75, field5531[--field5535]);
            } else {
                var26 = arg1 ? field5525 : field5527;
            }
            if (arg0 == 1000) {
                field5535 -= 4;
                var26.field552 = field5531[field5535];
                var26.field484 = field5531[field5535 + 1];
                int var27 = field5531[field5535 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field5531[field5535 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field488 = (byte) var27;
                var26.field509 = (byte) var28;
                class350.method2203((byte) -123, var26);
                class443.method2669(var26, -26134);
                if (var26.field547 == -1) {
                    class20.method131(25154, var26.field467);
                }
                return;
            }
            if (arg0 == 1001) {
                field5535 -= 4;
                var26.field520 = field5531[field5535];
                var26.field428 = field5531[field5535 + 1];
                var26.field529 = 0;
                var26.field398 = 0;
                int var29 = field5531[field5535 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field5531[field5535 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field508 = (byte) var29;
                var26.field513 = (byte) var30;
                class350.method2203((byte) -116, var26);
                class443.method2669(var26, -26134);
                if (var26.field492 == 0) {
                    class478.method2850(var26, false, true);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field5531[--field5535] == 1;
                if (var26.field459 != var31) {
                    var26.field459 = var31;
                    class350.method2203((byte) -127, var26);
                }
                if (var26.field547 == -1) {
                    class284.method1838(25558, var26.field467);
                }
                return;
            }
            if (arg0 == 1004) {
                field5535 -= 2;
                var26.field542 = field5531[field5535];
                var26.field417 = field5531[field5535 + 1];
                class350.method2203((byte) -124, var26);
                class443.method2669(var26, -26134);
                if (var26.field492 == 0) {
                    class478.method2850(var26, false, true);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field403 = field5531[--field5535] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class38 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class149.method979((byte) -97, field5531[--field5535]);
            } else {
                var32 = arg1 ? field5525 : field5527;
            }
            if (arg0 == 1100) {
                field5535 -= 2;
                var32.field505 = field5531[field5535];
                if (var32.field505 > var32.field546 - var32.field553) {
                    var32.field505 = var32.field546 - var32.field553;
                }
                if (var32.field505 < 0) {
                    var32.field505 = 0;
                }
                var32.field415 = field5531[field5535 + 1];
                if (var32.field415 > var32.field475 - var32.field472) {
                    var32.field415 = var32.field475 - var32.field472;
                }
                if (var32.field415 < 0) {
                    var32.field415 = 0;
                }
                class350.method2203((byte) -124, var32);
                if (var32.field547 == -1) {
                    class16.method113(var32.field467, 27766);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field533 = field5531[--field5535];
                class350.method2203((byte) -118, var32);
                if (var32.field547 == -1) {
                    class257.method1709(var32.field467, (byte) -127);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field500 = field5531[--field5535] == 1;
                class350.method2203((byte) -117, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field545 = field5531[--field5535];
                class350.method2203((byte) -122, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field514 = field5531[--field5535];
                class350.method2203((byte) -116, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field5531[--field5535];
                if (var32.field519 != var33) {
                    var32.field519 = var33;
                    class350.method2203((byte) -117, var32);
                }
                if (var32.field547 == -1) {
                    class482.method2858(-128, var32.field467);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field538 = field5531[--field5535];
                class350.method2203((byte) -125, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field498 = field5531[--field5535] == 1;
                class350.method2203((byte) -127, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field523 = 1;
                var32.field444 = field5531[--field5535];
                class350.method2203((byte) -128, var32);
                if (var32.field547 == -1) {
                    class199.method1355((byte) 106, var32.field467);
                }
                return;
            }
            if (arg0 == 1109) {
                field5535 -= 6;
                var32.field562 = field5531[field5535];
                var32.field466 = field5531[field5535 + 1];
                var32.field485 = field5531[field5535 + 2];
                var32.field408 = field5531[field5535 + 3];
                var32.field482 = field5531[field5535 + 4];
                var32.field426 = field5531[field5535 + 5];
                class350.method2203((byte) -122, var32);
                if (var32.field547 == -1) {
                    class495.method2973(-29, var32.field467);
                    class51.method312(var32.field467, -121);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field5531[--field5535];
                if (var32.field407 != var34) {
                    var32.field407 = var34;
                    var32.field522 = 0;
                    var32.field443 = 1;
                    var32.field455 = 0;
                    class350.method2203((byte) -119, var32);
                }
                if (var32.field547 == -1) {
                    class42.method261(5, var32.field467);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field425 = field5531[--field5535] == 1;
                class350.method2203((byte) -128, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field5536[--field5520];
                if (!var35.equals(var32.field489)) {
                    var32.field489 = var35;
                    class350.method2203((byte) -128, var32);
                }
                if (var32.field547 == -1) {
                    class62.method366(3, var32.field467);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field456 = field5531[--field5535];
                class350.method2203((byte) -127, var32);
                if (var32.field547 == -1) {
                    class46.method291(16, var32.field467);
                }
                return;
            }
            if (arg0 == 1114) {
                field5535 -= 3;
                var32.field427 = field5531[field5535];
                var32.field487 = field5531[field5535 + 1];
                var32.field434 = field5531[field5535 + 2];
                class350.method2203((byte) -122, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field469 = field5531[--field5535] == 1;
                class350.method2203((byte) -117, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field471 = field5531[--field5535];
                class350.method2203((byte) -117, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field454 = field5531[--field5535];
                class350.method2203((byte) -117, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field564 = field5531[--field5535] == 1;
                class350.method2203((byte) -128, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field550 = field5531[--field5535] == 1;
                class350.method2203((byte) -126, var32);
                return;
            }
            if (arg0 == 1120) {
                field5535 -= 2;
                var32.field546 = field5531[field5535];
                var32.field475 = field5531[field5535 + 1];
                class350.method2203((byte) -128, var32);
                if (var32.field492 == 0) {
                    class478.method2850(var32, false, true);
                }
                return;
            }
            if (arg0 == 1121) {
                field5535 -= 2;
                var32.field436 = (short) field5531[field5535];
                var32.field433 = (short) field5531[field5535 + 1];
                class350.method2203((byte) -120, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field491 = field5531[--field5535] == 1;
                class350.method2203((byte) -127, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field426 = field5531[--field5535];
                class350.method2203((byte) -119, var32);
                if (var32.field547 == -1) {
                    class495.method2973(-41, var32.field467);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field5531[--field5535];
                var32.field540 = var36 == 1;
                class350.method2203((byte) -126, var32);
                return;
            }
            if (arg0 == 1125) {
                field5535 -= 2;
                var32.field470 = field5531[field5535];
                var32.field451 = field5531[field5535 + 1];
                class350.method2203((byte) -116, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field549 = field5531[--field5535];
                class350.method2203((byte) -128, var32);
                return;
            }
            if (arg0 == 1127) {
                field5535 -= 2;
                int var37 = field5531[field5535];
                int var38 = field5531[field5535 + 1];
                class83 var39 = class381.field5778.method506(true, var37);
                if (var39.field1284 != var38) {
                    var32.method220(var38, var37, 16);
                    return;
                }
                var32.method227(var37, -52);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field5531[--field5535];
                String var41 = field5536[--field5520];
                class83 var42 = class381.field5778.method506(true, var40);
                if (!var42.field1283.equals(var41)) {
                    var32.method223(var40, -37, var41);
                    return;
                }
                var32.method227(var40, -83);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class38 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class149.method979((byte) -67, field5531[--field5535]);
            } else {
                var43 = arg1 ? field5525 : field5527;
            }
            class350.method2203((byte) -116, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5535 -= 2;
                int var44 = field5531[field5535];
                int var45 = field5531[field5535 + 1];
                if (var43.field547 == -1) {
                    class411.method2478(var43.field467, true);
                    class495.method2973(-60, var43.field467);
                    class51.method312(var43.field467, -119);
                }
                if (var44 == -1) {
                    var43.field523 = 1;
                    var43.field444 = -1;
                    var43.field535 = -1;
                    return;
                }
                var43.field535 = var44;
                var43.field563 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field518 = true;
                } else {
                    var43.field518 = false;
                }
                class339 var46 = class294.field4196.method453(0, var44);
                var43.field485 = var46.field4789;
                var43.field408 = var46.field4786;
                var43.field482 = var46.field4762;
                var43.field562 = var46.field4781;
                var43.field466 = var46.field4807;
                var43.field426 = var46.field4799;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field515 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field515 = 1;
                } else {
                    var43.field515 = 2;
                }
                if (var43.field529 > 0) {
                    var43.field426 = var43.field426 * 32 / var43.field529;
                    return;
                }
                if (var43.field520 > 0) {
                    var43.field426 = var43.field426 * 32 / var43.field520;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field523 = 2;
                var43.field444 = field5531[--field5535];
                if (var43.field547 == -1) {
                    class199.method1355((byte) -98, var43.field467);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field523 = 3;
                var43.field444 = -1;
                if (var43.field547 == -1) {
                    class199.method1355((byte) 114, var43.field467);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field523 = 6;
                var43.field444 = field5531[--field5535];
                if (var43.field547 == -1) {
                    class199.method1355((byte) 112, var43.field467);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field523 = 5;
                var43.field444 = field5531[--field5535];
                if (var43.field547 == -1) {
                    class199.method1355((byte) -3, var43.field467);
                }
                return;
            }
            if (arg0 == 1206) {
                field5535 -= 4;
                var43.field401 = field5531[field5535];
                var43.field559 = field5531[field5535 + 1];
                var43.field532 = field5531[field5535 + 2];
                var43.field567 = field5531[field5535 + 3];
                class350.method2203((byte) -126, var43);
                return;
            }
            if (arg0 == 1207) {
                field5535 -= 2;
                var43.field526 = field5531[field5535];
                var43.field478 = field5531[field5535 + 1];
                class350.method2203((byte) -117, var43);
                return;
            }
            if (arg0 == 1210) {
                field5535 -= 4;
                var43.field444 = field5531[field5535];
                var43.field447 = field5531[field5535 + 1];
                if (field5531[field5535 + 2] == 1) {
                    var43.field523 = 9;
                } else {
                    var43.field523 = 8;
                }
                if (field5531[field5535 + 3] == 1) {
                    var43.field518 = true;
                } else {
                    var43.field518 = false;
                }
                if (var43.field547 == -1) {
                    class199.method1355((byte) -57, var43.field467);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field523 = 5;
                var43.field444 = class172.field2546;
                var43.field447 = 0;
                if (var43.field547 == -1) {
                    class199.method1355((byte) 105, var43.field467);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class38 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class149.method979((byte) -82, field5531[--field5535]);
                } else {
                    var58 = arg1 ? field5525 : field5527;
                }
                String var59 = field5536[--field5520];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field5531[--field5535];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field5531[--field5535];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field5536[--field5520];
                    } else {
                        var62[var63] = Integer.valueOf(field5531[--field5535]);
                    }
                }
                int var64 = field5531[--field5535];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field437 = var62;
                } else if (arg0 == 1401) {
                    var58.field473 = var62;
                } else if (arg0 == 1402) {
                    var58.field516 = var62;
                } else if (arg0 == 1403) {
                    var58.field416 = var62;
                } else if (arg0 == 1404) {
                    var58.field530 = var62;
                } else if (arg0 == 1405) {
                    var58.field421 = var62;
                } else if (arg0 == 1406) {
                    var58.field409 = var62;
                } else if (arg0 == 1407) {
                    var58.field495 = var62;
                    var58.field551 = var60;
                } else if (arg0 == 1408) {
                    var58.field528 = var62;
                } else if (arg0 == 1409) {
                    var58.field504 = var62;
                } else if (arg0 == 1410) {
                    var58.field432 = var62;
                } else if (arg0 == 1411) {
                    var58.field463 = var62;
                } else if (arg0 == 1412) {
                    var58.field477 = var62;
                } else if (arg0 == 1414) {
                    var58.field462 = var62;
                    var58.field424 = var60;
                } else if (arg0 == 1415) {
                    var58.field521 = var62;
                    var58.field507 = var60;
                } else if (arg0 == 1416) {
                    var58.field429 = var62;
                } else if (arg0 == 1417) {
                    var58.field497 = var62;
                } else if (arg0 == 1418) {
                    var58.field453 = var62;
                } else if (arg0 == 1419) {
                    var58.field430 = var62;
                } else if (arg0 == 1420) {
                    var58.field525 = var62;
                } else if (arg0 == 1421) {
                    var58.field537 = var62;
                } else if (arg0 == 1422) {
                    var58.field502 = var62;
                } else if (arg0 == 1423) {
                    var58.field461 = var62;
                } else if (arg0 == 1424) {
                    var58.field431 = var62;
                } else if (arg0 == 1425) {
                    var58.field554 = var62;
                } else if (arg0 == 1426) {
                    var58.field423 = var62;
                } else if (arg0 == 1427) {
                    var58.field560 = var62;
                } else if (arg0 == 1428) {
                    var58.field441 = var62;
                    var58.field544 = var60;
                } else if (arg0 == 1429) {
                    var58.field405 = var62;
                    var58.field510 = var60;
                } else if (arg0 == 1430) {
                    var58.field414 = var62;
                }
                var58.field460 = true;
                return;
            }
            if (arg0 < 1600) {
                class38 var65 = arg1 ? field5525 : field5527;
                if (arg0 == 1500) {
                    field5531[field5535++] = var65.field412;
                    return;
                }
                if (arg0 == 1501) {
                    field5531[field5535++] = var65.field501;
                    return;
                }
                if (arg0 == 1502) {
                    field5531[field5535++] = var65.field553;
                    return;
                }
                if (arg0 == 1503) {
                    field5531[field5535++] = var65.field472;
                    return;
                }
                if (arg0 == 1504) {
                    field5531[field5535++] = var65.field459 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field5531[field5535++] = var65.field480;
                    return;
                }
                if (arg0 == 1506) {
                    class38 var66 = class525.method3105((byte) 125, var65);
                    field5531[field5535++] = var66 == null ? -1 : var66.field467;
                    return;
                }
            } else if (arg0 < 1700) {
                class38 var67 = arg1 ? field5525 : field5527;
                if (arg0 == 1600) {
                    field5531[field5535++] = var67.field505;
                    return;
                }
                if (arg0 == 1601) {
                    field5531[field5535++] = var67.field415;
                    return;
                }
                if (arg0 == 1602) {
                    field5536[field5520++] = var67.field489;
                    return;
                }
                if (arg0 == 1603) {
                    field5531[field5535++] = var67.field546;
                    return;
                }
                if (arg0 == 1604) {
                    field5531[field5535++] = var67.field475;
                    return;
                }
                if (arg0 == 1605) {
                    field5531[field5535++] = var67.field426;
                    return;
                }
                if (arg0 == 1606) {
                    field5531[field5535++] = var67.field485;
                    return;
                }
                if (arg0 == 1607) {
                    field5531[field5535++] = var67.field482;
                    return;
                }
                if (arg0 == 1608) {
                    field5531[field5535++] = var67.field408;
                    return;
                }
                if (arg0 == 1609) {
                    field5531[field5535++] = var67.field545;
                    return;
                }
                if (arg0 == 1610) {
                    field5531[field5535++] = var67.field562;
                    return;
                }
                if (arg0 == 1611) {
                    field5531[field5535++] = var67.field466;
                    return;
                }
                if (arg0 == 1612) {
                    field5531[field5535++] = var67.field519;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field5531[--field5535];
                    class83 var69 = class381.field5778.method506(true, var68);
                    if (var69.method491(-96)) {
                        field5536[field5520++] = var67.method232(var69.field1283, var68, (byte) 116);
                    } else {
                        field5531[field5535++] = var67.method228(var69.field1284, false, var68);
                    }
                }
            } else if (arg0 < 1800) {
                class38 var70 = arg1 ? field5525 : field5527;
                if (arg0 == 1700) {
                    field5531[field5535++] = var70.field535;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field535 != -1) {
                        field5531[field5535++] = var70.field563;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field5531[field5535++] = var70.field547;
                    return;
                }
            } else if (arg0 < 1900) {
                class38 var71 = arg1 ? field5525 : field5527;
                if (arg0 == 1800) {
                    field5531[field5535++] = client.method1328(var71).method2361((byte) 101);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field5531[--field5535];
                    int var334 = var72 - 1;
                    if (var71.field442 != null && var334 < var71.field442.length && var71.field442[var334] != null) {
                        field5536[field5520++] = var71.field442[var334];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field499 == null) {
                        field5536[field5520++] = "";
                        return;
                    }
                    field5536[field5520++] = var71.field499;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class38 var332;
                if (arg0 >= 2000) {
                    var332 = class149.method979((byte) -75, field5531[--field5535]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field5525 : field5527;
                }
                if (field5545 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field560 == null) {
                        return;
                    }
                    class168 var333 = new class168();
                    var333.field2488 = var332;
                    var333.field2484 = var332.field560;
                    var333.field2490 = field5545 + 1;
                    class163.field2396.method809(var333, false);
                    return;
                }
            } else if (arg0 < 2600) {
                class38 var73 = class149.method979((byte) -107, field5531[--field5535]);
                if (arg0 == 2500) {
                    field5531[field5535++] = var73.field412;
                    return;
                }
                if (arg0 == 2501) {
                    field5531[field5535++] = var73.field501;
                    return;
                }
                if (arg0 == 2502) {
                    field5531[field5535++] = var73.field553;
                    return;
                }
                if (arg0 == 2503) {
                    field5531[field5535++] = var73.field472;
                    return;
                }
                if (arg0 == 2504) {
                    field5531[field5535++] = var73.field459 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field5531[field5535++] = var73.field480;
                    return;
                }
                if (arg0 == 1506) {
                    class38 var74 = class525.method3105((byte) 125, var73);
                    field5531[field5535++] = var74 == null ? -1 : var74.field467;
                    return;
                }
            } else if (arg0 < 2700) {
                class38 var75 = class149.method979((byte) -86, field5531[--field5535]);
                if (arg0 == 2600) {
                    field5531[field5535++] = var75.field505;
                    return;
                }
                if (arg0 == 2601) {
                    field5531[field5535++] = var75.field415;
                    return;
                }
                if (arg0 == 2602) {
                    field5536[field5520++] = var75.field489;
                    return;
                }
                if (arg0 == 2603) {
                    field5531[field5535++] = var75.field546;
                    return;
                }
                if (arg0 == 2604) {
                    field5531[field5535++] = var75.field475;
                    return;
                }
                if (arg0 == 2605) {
                    field5531[field5535++] = var75.field426;
                    return;
                }
                if (arg0 == 2606) {
                    field5531[field5535++] = var75.field485;
                    return;
                }
                if (arg0 == 2607) {
                    field5531[field5535++] = var75.field482;
                    return;
                }
                if (arg0 == 2608) {
                    field5531[field5535++] = var75.field408;
                    return;
                }
                if (arg0 == 2609) {
                    field5531[field5535++] = var75.field545;
                    return;
                }
                if (arg0 == 2610) {
                    field5531[field5535++] = var75.field562;
                    return;
                }
                if (arg0 == 2611) {
                    field5531[field5535++] = var75.field466;
                    return;
                }
                if (arg0 == 2612) {
                    field5531[field5535++] = var75.field519;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class38 var76 = class149.method979((byte) -102, field5531[--field5535]);
                    field5531[field5535++] = var76.field535;
                    return;
                }
                if (arg0 == 2701) {
                    class38 var77 = class149.method979((byte) -67, field5531[--field5535]);
                    if (var77.field535 == -1) {
                        field5531[field5535++] = 0;
                        return;
                    } else {
                        field5531[field5535++] = var77.field563;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field5531[--field5535];
                    class92 var79 = (class92) class431.field6450.method2605(false, (long) var78);
                    if (var79 != null) {
                        field5531[field5535++] = 1;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class38 var80 = class149.method979((byte) -82, field5531[--field5535]);
                    if (var80.field452 == null) {
                        field5531[field5535++] = 0;
                        return;
                    }
                    int var81 = var80.field452.length;
                    for (int var82 = 0; var82 < var80.field452.length; var82++) {
                        if (var80.field452[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field5531[field5535++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field5535 -= 2;
                    int var83 = field5531[field5535];
                    int var84 = field5531[field5535 + 1];
                    class92 var85 = (class92) class431.field6450.method2605(false, (long) var83);
                    if (var85 != null && var85.field1378 == var84) {
                        field5531[field5535++] = 1;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class38 var86 = class149.method979((byte) -83, field5531[--field5535]);
                if (arg0 == 2800) {
                    field5531[field5535++] = client.method1328(var86).method2361((byte) 69);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field5531[--field5535];
                    int var335 = var87 - 1;
                    if (var86.field442 != null && var335 < var86.field442.length && var86.field442[var335] != null) {
                        field5536[field5520++] = var86.field442[var335];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field499 == null) {
                        field5536[field5520++] = "";
                        return;
                    }
                    field5536[field5520++] = var86.field499;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field5536[--field5520];
                    class61.method359(var88, (byte) 104);
                    return;
                }
                if (arg0 == 3101) {
                    field5535 -= 2;
                    class34.method193(field5531[field5535], field5531[field5535 + 1], 8, class500.field7365);
                    return;
                }
                if (arg0 == 3103) {
                    class129.method861((byte) -19, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field5536[--field5520];
                    int var90 = 0;
                    if (class48.method302((byte) -30, var89)) {
                        var90 = class92.method532(var89, 10);
                    }
                    field5539++;
                    class291.method1861((byte) -104, class61.field919);
                    class356.field5471.method1415(var90, (byte) -73);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field5536[--field5520];
                    field5537++;
                    class291.method1861((byte) -104, class125.field1888);
                    class356.field5471.method1410(var91.length() + 1, -27645);
                    class356.field5471.method1418(true, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field5536[--field5520];
                    field5541++;
                    class291.method1861((byte) -104, class371.field5668);
                    class356.field5471.method1410(var92.length() + 1, -27645);
                    class356.field5471.method1418(true, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field5531[--field5535];
                    String var94 = field5536[--field5520];
                    class304.method1908(true, var93, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field5535 -= 3;
                    int var95 = field5531[field5535];
                    int var96 = field5531[field5535 + 1];
                    int var97 = field5531[field5535 + 2];
                    class38 var98 = class149.method979((byte) -80, var97);
                    class433.method2604(var98, var96, var95, 0);
                    return;
                }
                if (arg0 == 3109) {
                    field5535 -= 2;
                    int var99 = field5531[field5535];
                    int var100 = field5531[field5535 + 1];
                    class38 var101 = arg1 ? field5525 : field5527;
                    class433.method2604(var101, var100, var99, 0);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field5531[--field5535];
                    field5529++;
                    class291.method1861((byte) -104, class146.field2165);
                    class356.field5471.method1413(-126, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field5535 -= 2;
                    int var103 = field5531[field5535];
                    int var104 = field5531[field5535 + 1];
                    class92 var105 = (class92) class431.field6450.method2605(false, (long) var103);
                    if (var105 != null) {
                        class250.method1671(true, var105.field1378 != var104, var105, false);
                    }
                    class76.method434(var104, 0, true, var103, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field5535--;
                    int var106 = field5531[field5535];
                    class92 var107 = (class92) class431.field6450.method2605(false, (long) var106);
                    if (var107 != null && var107.field1376 == 3) {
                        class250.method1671(true, true, var107, false);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class133.method886(field5536[--field5520], 121);
                    return;
                }
                if (arg0 == 3114) {
                    field5535 -= 2;
                    int var108 = field5531[field5535];
                    int var109 = field5531[field5535 + 1];
                    String var110 = field5536[--field5520];
                    class401.method2418(var108, "", var109, "", var110, false);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field5535 -= 3;
                    class207.method1394(255, 100, field5531[field5535], field5531[field5535 + 1], field5531[field5535 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class334.method2043(field5531[--field5535], true, 50, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field5535 -= 2;
                    class145.method958(255, field5531[field5535], field5531[field5535 + 1], 74);
                    return;
                }
                if (arg0 == 3203) {
                    field5535 -= 4;
                    class207.method1394(field5531[field5535 + 3], 100, field5531[field5535], field5531[field5535 + 1], field5531[field5535 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field5535 -= 3;
                    class334.method2043(field5531[field5535], true, field5531[field5535 + 2], field5531[field5535 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field5535 -= 3;
                    class145.method958(field5531[field5535 + 2], field5531[field5535], field5531[field5535 + 1], 35);
                    return;
                }
                if (arg0 == 3206) {
                    field5535 -= 4;
                    class92.method535(field5531[field5535 + 1], field5531[field5535], field5531[field5535 + 2], 0, field5531[field5535 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field5531[field5535++] = class317.field4559;
                    return;
                }
                if (arg0 == 3301) {
                    field5535 -= 2;
                    int var111 = field5531[field5535];
                    int var112 = field5531[field5535 + 1];
                    field5531[field5535++] = class150.method985(var111, -1, false, var112);
                    return;
                }
                if (arg0 == 3302) {
                    field5535 -= 2;
                    int var113 = field5531[field5535];
                    int var114 = field5531[field5535 + 1];
                    field5531[field5535++] = class220.method1520(-84, false, var113, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field5535 -= 2;
                    int var115 = field5531[field5535];
                    int var116 = field5531[field5535 + 1];
                    field5531[field5535++] = class138.method917(-15337, false, var115, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field5531[--field5535];
                    field5531[field5535++] = class514.field7512.method2798(var117, false).field5606;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field5531[--field5535];
                    field5531[field5535++] = class459.field6793[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field5531[--field5535];
                    field5531[field5535++] = class318.field4569[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field5531[--field5535];
                    field5531[field5535++] = class86.field1323[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class500.field7365.field1768;
                    int var122 = (class500.field7365.field1763 >> 7) + class68.field1038;
                    int var123 = (class500.field7365.field1769 >> 7) + class24.field259;
                    field5531[field5535++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field5531[--field5535];
                    field5531[field5535++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field5531[--field5535];
                    field5531[field5535++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field5531[--field5535];
                    field5531[field5535++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field5531[field5535++] = class410.field6174 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field5535 -= 2;
                    int var127 = field5531[field5535];
                    int var128 = field5531[field5535 + 1];
                    field5531[field5535++] = class150.method985(var127, -1, true, var128);
                    return;
                }
                if (arg0 == 3314) {
                    field5535 -= 2;
                    int var129 = field5531[field5535];
                    int var130 = field5531[field5535 + 1];
                    field5531[field5535++] = class220.method1520(90, true, var129, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field5535 -= 2;
                    int var131 = field5531[field5535];
                    int var132 = field5531[field5535 + 1];
                    field5531[field5535++] = class138.method917(-15337, true, var131, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class402.field6053 >= 2) {
                        field5531[field5535++] = class402.field6053;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field5531[field5535++] = class248.field3645;
                    return;
                }
                if (arg0 == 3318) {
                    field5531[field5535++] = class102.field1474;
                    return;
                }
                if (arg0 == 3321) {
                    field5531[field5535++] = class312.field4468;
                    return;
                }
                if (arg0 == 3322) {
                    field5531[field5535++] = class85.field1306;
                    return;
                }
                if (arg0 == 3323) {
                    if (class435.field6514 >= 5 && class435.field6514 <= 9) {
                        field5531[field5535++] = 1;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class435.field6514 >= 5 && class435.field6514 <= 9) {
                        field5531[field5535++] = class435.field6514;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field5531[field5535++] = class31.field341 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field5531[field5535++] = class500.field7365.field3529;
                    return;
                }
                if (arg0 == 3327) {
                    field5531[field5535++] = class500.field7365.field3532.field620 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field5531[field5535++] = class56.field871 && !class447.field6665 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field5531[field5535++] = class214.field3124 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field5531[--field5535];
                    field5531[field5535++] = class367.method2280(false, false, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field5535 -= 2;
                    int var134 = field5531[field5535];
                    int var135 = field5531[field5535 + 1];
                    field5531[field5535++] = class369.method2283(false, 44, var134, var135, false);
                    return;
                }
                if (arg0 == 3332) {
                    field5535 -= 2;
                    int var136 = field5531[field5535];
                    int var137 = field5531[field5535 + 1];
                    field5531[field5535++] = class369.method2283(true, 83, var136, var137, false);
                    return;
                }
                if (arg0 == 3333) {
                    field5531[field5535++] = class310.field4453;
                    return;
                }
                if (arg0 == 3335) {
                    field5531[field5535++] = class143.field2137;
                    return;
                }
                if (arg0 == 3336) {
                    field5535 -= 4;
                    int var138 = field5531[field5535];
                    int var139 = field5531[field5535 + 1];
                    int var140 = field5531[field5535 + 2];
                    int var141 = field5531[field5535 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field5531[field5535++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field5531[field5535++] = class159.field2357;
                    return;
                }
                if (arg0 == 3338) {
                    field5531[field5535++] = class186.method1280(-27640);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field5535 -= 2;
                    int var145 = field5531[field5535];
                    int var146 = field5531[field5535 + 1];
                    class116 var147 = class463.field6858.method995(16383, var145);
                    field5536[field5520++] = var147.method780(var146, -125);
                    return;
                }
                if (arg0 == 3408) {
                    field5535 -= 4;
                    int var148 = field5531[field5535];
                    int var149 = field5531[field5535 + 1];
                    int var150 = field5531[field5535 + 2];
                    int var151 = field5531[field5535 + 3];
                    class116 var152 = class463.field6858.method995(16383, var150);
                    if (var152.field1749 == var148 && var152.field1748 == var149) {
                        if (var149 == 115) {
                            field5536[field5520++] = var152.method780(var151, -107);
                            return;
                        }
                        field5531[field5535++] = var152.method777(var151, 3461);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field5535 -= 3;
                    int var153 = field5531[field5535];
                    int var154 = field5531[field5535 + 1];
                    int var155 = field5531[field5535 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class116 var156 = class463.field6858.method995(16383, var154);
                    if (var156.field1748 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field5531[field5535++] = var156.method776((byte) 53, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field5531[--field5535];
                    String var158 = field5536[--field5520];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class116 var159 = class463.field6858.method995(16383, var157);
                    if (var159.field1748 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field5531[field5535++] = var159.method775(-123, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field5531[--field5535];
                    class116 var161 = class463.field6858.method995(16383, var160);
                    field5531[field5535++] = var161.field1753.method2602(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class336.field4732 == 0) {
                        field5531[field5535++] = -2;
                        return;
                    }
                    if (class336.field4732 == 1) {
                        field5531[field5535++] = -1;
                        return;
                    }
                    field5531[field5535++] = class315.field4496;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field5531[--field5535];
                    if (class336.field4732 == 2 && var162 < class315.field4496) {
                        field5536[field5520++] = class474.field6980[var162];
                        if (class287.field4106[var162] != null) {
                            field5536[field5520++] = class287.field4106[var162];
                            return;
                        }
                        field5536[field5520++] = "";
                        return;
                    }
                    field5536[field5520++] = "";
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field5531[--field5535];
                    if (class336.field4732 == 2 && var163 < class315.field4496) {
                        field5531[field5535++] = class85.field1296[var163];
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field5531[--field5535];
                    if (class336.field4732 == 2 && var164 < class315.field4496) {
                        field5531[field5535++] = class66.field990[var164];
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field5536[--field5520];
                    int var166 = field5531[--field5535];
                    class342.method2096(var165, (byte) 14, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field5536[--field5520];
                    class115.method769(var167, 0);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field5536[--field5520];
                    class162.method1077((byte) -75, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field5536[--field5520];
                    class56.method345(false, var169, -98);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field5536[--field5520];
                    class363.method2263(var170, (byte) -52);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field5536[--field5520];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field5531[field5535++] = class39.method235((byte) -114, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field5531[--field5535];
                    if (class336.field4732 == 2 && var172 < class315.field4496) {
                        field5536[field5520++] = class364.field5575[var172];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class266.field3895 != null) {
                        field5536[field5520++] = class433.method2607(class266.field3895, -1);
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class266.field3895 != null) {
                        field5531[field5535++] = class44.field690;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field5531[--field5535];
                    if (class266.field3895 != null && var173 < class44.field690) {
                        field5536[field5520++] = class18.field194[var173].field2504;
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field5531[--field5535];
                    if (class266.field3895 != null && var174 < class44.field690) {
                        field5531[field5535++] = class18.field194[var174].field2503;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field5531[--field5535];
                    if (class266.field3895 != null && var175 < class44.field690) {
                        field5531[field5535++] = class18.field194[var175].field2495;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field5531[field5535++] = class443.field6599;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field5536[--field5520];
                    class504.method3001(-112, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field5531[field5535++] = class123.field1873;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field5536[--field5520];
                    class6.method36(false, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class477.method2842(-31255);
                    return;
                }
                if (arg0 == 3621) {
                    if (class336.field4732 == 0) {
                        field5531[field5535++] = -1;
                        return;
                    }
                    field5531[field5535++] = class61.field927;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field5531[--field5535];
                    if (class336.field4732 != 0 && var178 < class61.field927) {
                        field5536[field5520++] = class3.field41[var178];
                        if (class231.field3446[var178] != null) {
                            field5536[field5520++] = class231.field3446[var178];
                            return;
                        }
                        field5536[field5520++] = "";
                        return;
                    }
                    field5536[field5520++] = "";
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field5536[--field5520];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field5531[field5535++] = class135.method898(117, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field5531[--field5535];
                    if (class18.field194 != null && var180 < class44.field690 && class18.field194[var180].field2497.equalsIgnoreCase(class500.field7365.field3548)) {
                        field5531[field5535++] = 1;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class376.field5746 != null) {
                        field5536[field5520++] = class376.field5746;
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field5531[--field5535];
                    if (class266.field3895 != null && var181 < class44.field690) {
                        field5536[field5520++] = class18.field194[var181].field2499;
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field5531[--field5535];
                    if (class336.field4732 == 2 && var182 >= 0 && var182 < class315.field4496) {
                        field5531[field5535++] = class467.field6893[var182] ? 1 : 0;
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field5536[--field5520];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field5531[field5535++] = class413.method2486(var183, 2);
                    return;
                }
                if (arg0 == 3629) {
                    field5531[field5535++] = class363.field5568;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field5536[--field5520];
                    class56.method345(true, var184, -120);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field5531[--field5535];
                    field5531[field5535++] = class431.field6440[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field5531[--field5535];
                    if (class266.field3895 != null && var186 < class44.field690) {
                        field5536[field5520++] = class18.field194[var186].field2497;
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field5531[--field5535];
                    if (class336.field4732 != 0 && var187 < class61.field927) {
                        field5536[field5520++] = class359.field5515[var187];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var188].method1579(127);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var189].field3434;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var190].field3430;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var191].field3436;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var192].field3443;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field5531[--field5535];
                    field5531[field5535++] = class186.field2762[var193].field3435;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field5531[--field5535];
                    int var195 = class186.field2762[var194].method1581(7);
                    field5531[field5535++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field5531[--field5535];
                    int var197 = class186.field2762[var196].method1581(7);
                    field5531[field5535++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field5531[--field5535];
                    int var199 = class186.field2762[var198].method1581(7);
                    field5531[field5535++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field5531[--field5535];
                    int var201 = class186.field2762[var200].method1581(7);
                    field5531[field5535++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field5535 -= 2;
                    int var202 = field5531[field5535];
                    int var203 = field5531[field5535 + 1];
                    field5531[field5535++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field5535 -= 2;
                    int var204 = field5531[field5535];
                    int var205 = field5531[field5535 + 1];
                    field5531[field5535++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field5535 -= 2;
                    int var206 = field5531[field5535];
                    int var207 = field5531[field5535 + 1];
                    field5531[field5535++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field5535 -= 2;
                    int var208 = field5531[field5535];
                    int var209 = field5531[field5535 + 1];
                    field5531[field5535++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field5531[--field5535];
                    field5531[field5535++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field5531[--field5535];
                    field5531[field5535++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field5535 -= 5;
                    int var212 = field5531[field5535];
                    int var213 = field5531[field5535 + 1];
                    int var214 = field5531[field5535 + 2];
                    int var215 = field5531[field5535 + 3];
                    int var216 = field5531[field5535 + 4];
                    field5531[field5535++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field5535 -= 2;
                    long var217 = (long) field5531[field5535];
                    long var219 = (long) field5531[field5535 + 1];
                    field5531[field5535++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field5535 -= 2;
                    int var221 = field5531[field5535];
                    int var222 = field5531[field5535 + 1];
                    field5531[field5535++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field5535 -= 2;
                    int var223 = field5531[field5535];
                    int var224 = field5531[field5535 + 1];
                    field5531[field5535++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field5535 -= 2;
                    int var225 = field5531[field5535];
                    int var226 = field5531[field5535 + 1];
                    field5531[field5535++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field5535 -= 2;
                    int var227 = field5531[field5535];
                    int var228 = field5531[field5535 + 1];
                    field5531[field5535++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field5535 -= 2;
                    int var229 = field5531[field5535];
                    int var230 = field5531[field5535 + 1];
                    if (var229 == 0) {
                        field5531[field5535++] = 0;
                        return;
                    }
                    field5531[field5535++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field5535 -= 2;
                    int var231 = field5531[field5535];
                    int var232 = field5531[field5535 + 1];
                    if (var231 == 0) {
                        field5531[field5535++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field5531[field5535++] = Integer.MAX_VALUE;
                        return;
                    }
                    field5531[field5535++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field5535 -= 2;
                    int var233 = field5531[field5535];
                    int var234 = field5531[field5535 + 1];
                    field5531[field5535++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field5535 -= 2;
                    int var235 = field5531[field5535];
                    int var236 = field5531[field5535 + 1];
                    field5531[field5535++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field5535 -= 2;
                    int var237 = field5531[field5535];
                    int var238 = field5531[field5535 + 1];
                    field5531[field5535++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field5535 -= 2;
                    int var239 = field5531[field5535];
                    int var240 = field5531[field5535 + 1];
                    field5531[field5535++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field5535 -= 3;
                    long var241 = (long) field5531[field5535];
                    long var243 = (long) field5531[field5535 + 1];
                    long var245 = (long) field5531[field5535 + 2];
                    field5531[field5535++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field5536[--field5520];
                    int var248 = field5531[--field5535];
                    field5536[field5520++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field5520 -= 2;
                    String var249 = field5536[field5520];
                    String var250 = field5536[field5520 + 1];
                    field5536[field5520++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field5536[--field5520];
                    int var252 = field5531[--field5535];
                    field5536[field5520++] = var251 + class19.method124(3, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field5536[--field5520];
                    field5536[field5520++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5536[field5520++] = method2246(field5531[--field5535]);
                    return;
                }
                if (arg0 == 4105) {
                    field5520 -= 2;
                    String var254 = field5536[field5520];
                    String var255 = field5536[field5520 + 1];
                    if (class500.field7365.field3532 != null && class500.field7365.field3532.field620) {
                        field5536[field5520++] = var255;
                        return;
                    }
                    field5536[field5520++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field5531[--field5535];
                    field5536[field5520++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field5520 -= 2;
                    field5531[field5535++] = class513.method3030(class143.field2137, (byte) 124, field5536[field5520 + 1], field5536[field5520]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field5536[--field5520];
                    field5535 -= 2;
                    int var258 = field5531[field5535];
                    int var259 = field5531[field5535 + 1];
                    class275 var260 = class483.method2865(112, class105.field1522, var259, 0);
                    field5531[field5535++] = var260.method1804(var257, var258, true, class167.field2476);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field5536[--field5520];
                    field5535 -= 2;
                    int var262 = field5531[field5535];
                    int var263 = field5531[field5535 + 1];
                    class275 var264 = class483.method2865(117, class105.field1522, var263, 0);
                    field5531[field5535++] = var264.method1806(var262, class167.field2476, -1, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field5520 -= 2;
                    String var265 = field5536[field5520];
                    String var266 = field5536[field5520 + 1];
                    if (field5531[--field5535] == 1) {
                        field5536[field5520++] = var265;
                        return;
                    }
                    field5536[field5520++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field5536[--field5520];
                    field5536[field5520++] = class323.method2003(1, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field5536[--field5520];
                    int var269 = field5531[--field5535];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5536[field5520++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field5531[--field5535];
                    field5531[field5535++] = class526.method3109((char) var270, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field5531[--field5535];
                    field5531[field5535++] = class42.method250((char) var271, (byte) -126) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field5531[--field5535];
                    field5531[field5535++] = class212.method1484(-117, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field5531[--field5535];
                    field5531[field5535++] = class444.method2671((char) var273, -119) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field5536[--field5520];
                    if (var274 != null) {
                        field5531[field5535++] = var274.length();
                        return;
                    }
                    field5531[field5535++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field5536[--field5520];
                    field5535 -= 2;
                    int var276 = field5531[field5535];
                    int var277 = field5531[field5535 + 1];
                    field5536[field5520++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field5536[--field5520];
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
                    field5536[field5520++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field5536[--field5520];
                    field5535 -= 2;
                    int var284 = field5531[field5535];
                    int var285 = field5531[field5535 + 1];
                    field5531[field5535++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field5520 -= 2;
                    String var286 = field5536[field5520];
                    String var287 = field5536[field5520 + 1];
                    int var288 = field5531[--field5535];
                    field5531[field5535++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field5531[--field5535];
                    field5531[field5535++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field5531[--field5535];
                    field5531[field5535++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field5531[--field5535] != 0;
                    int var292 = field5531[--field5535];
                    field5536[field5520++] = class228.method1562((long) var292, var291, true, class143.field2137, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field5536[--field5520];
                    int var294 = field5531[--field5535];
                    class275 var295 = class483.method2865(127, class105.field1522, var294, 0);
                    field5531[field5535++] = var295.method1807(var293, 160, class167.field2476);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field5531[--field5535];
                    field5536[field5520++] = class294.field4196.method453(0, var296).field4796;
                    return;
                }
                if (arg0 == 4201) {
                    field5535 -= 2;
                    int var297 = field5531[field5535];
                    int var298 = field5531[field5535 + 1];
                    class339 var299 = class294.field4196.method453(0, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field4810[var298 - 1] != null) {
                        field5536[field5520++] = var299.field4810[var298 - 1];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field5535 -= 2;
                    int var300 = field5531[field5535];
                    int var301 = field5531[field5535 + 1];
                    class339 var302 = class294.field4196.method453(0, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field4831[var301 - 1] != null) {
                        field5536[field5520++] = var302.field4831[var301 - 1];
                        return;
                    }
                    field5536[field5520++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field5531[--field5535];
                    field5531[field5535++] = class294.field4196.method453(0, var303).field4813;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field5531[--field5535];
                    field5531[field5535++] = class294.field4196.method453(0, var304).field4829 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field5531[--field5535];
                    class339 var306 = class294.field4196.method453(0, var305);
                    if (var306.field4771 == -1 && var306.field4782 >= 0) {
                        field5531[field5535++] = var306.field4782;
                        return;
                    }
                    field5531[field5535++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field5531[--field5535];
                    class339 var308 = class294.field4196.method453(0, var307);
                    if (var308.field4771 >= 0 && var308.field4782 >= 0) {
                        field5531[field5535++] = var308.field4782;
                        return;
                    }
                    field5531[field5535++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field5531[--field5535];
                    field5531[field5535++] = class294.field4196.method453(0, var309).field4790 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field5535 -= 2;
                    int var310 = field5531[field5535];
                    int var311 = field5531[field5535 + 1];
                    class83 var312 = class381.field5778.method506(true, var311);
                    if (var312.method491(-94)) {
                        field5536[field5520++] = class294.field4196.method453(0, var310).method2060((byte) 79, var312.field1283, var311);
                        return;
                    }
                    field5531[field5535++] = class294.field4196.method453(0, var310).method2075((byte) -124, var311, var312.field1284);
                    return;
                }
                if (arg0 == 4209) {
                    field5535 -= 2;
                    int var313 = field5531[field5535];
                    int var314 = field5531[field5535 + 1] - 1;
                    class339 var315 = class294.field4196.method453(0, var313);
                    if (var315.field4832 == var314) {
                        field5531[field5535++] = var315.field4834;
                        return;
                    }
                    if (var315.field4836 == var314) {
                        field5531[field5535++] = var315.field4787;
                        return;
                    }
                    field5531[field5535++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field5536[--field5520];
                    int var317 = field5531[--field5535];
                    class323.method2008(var316, -128, var317 == 1);
                    field5531[field5535++] = class102.field1471;
                    return;
                }
                if (arg0 == 4211) {
                    if (class461.field6847 != null && class279.field4022 < class102.field1471) {
                        field5531[field5535++] = class461.field6847[class279.field4022++] & 0xFFFF;
                        return;
                    }
                    field5531[field5535++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class279.field4022 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field5535 -= 2;
                    int var318 = field5531[field5535];
                    int var319 = field5531[field5535 + 1];
                    class83 var320 = class381.field5778.method506(true, var319);
                    if (var320.method491(-106)) {
                        field5536[field5520++] = class431.field6451.method1733(true, var318).method2088(var320.field1283, var319, (byte) -120);
                        return;
                    }
                    field5531[field5535++] = class431.field6451.method1733(true, var318).method2098(var320.field1284, var319, -1);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field5535 -= 2;
                    int var321 = field5531[field5535];
                    int var322 = field5531[field5535 + 1];
                    class83 var323 = class381.field5778.method506(true, var322);
                    if (var323.method491(-90)) {
                        field5536[field5520++] = class252.field3743.method2686(var321, (byte) 114).method3064(0, var322, var323.field1283);
                        return;
                    }
                    field5531[field5535++] = class252.field3743.method2686(var321, (byte) 117).method3063((byte) 75, var323.field1284, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field5535 -= 2;
                    int var324 = field5531[field5535];
                    int var325 = field5531[field5535 + 1];
                    class83 var326 = class381.field5778.method506(true, var325);
                    if (var326.method491(-123)) {
                        field5536[field5520++] = class91.field1368.method1606(var324, 20275).method2002(var326.field1283, 2, var325);
                        return;
                    }
                    field5531[field5535++] = class91.field1368.method1606(var324, 20275).method1999(var326.field1284, false, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field5531[--field5535];
                class82 var328 = class45.field717.method1810(var327, 13787);
                if (var328.field1241 != null && var328.field1241.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field1273[0];
                    for (int var331 = 1; var331 < var328.field1241.length; var331++) {
                        if (var328.field1273[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field1273[var331];
                        }
                    }
                    field5531[field5535++] = var328.field1241[var329];
                    return;
                }
                field5531[field5535++] = var328.field1261;
                return;
            }
        } else {
            class38 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class149.method979((byte) -68, field5531[--field5535]);
            } else {
                var47 = arg1 ? field5525 : field5527;
            }
            if (arg0 == 1300) {
                int var48 = field5531[--field5535] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method226(field5536[--field5520], -1, var48);
                    return;
                }
                field5520--;
                return;
            }
            if (arg0 == 1301) {
                field5535 -= 2;
                int var49 = field5531[field5535];
                int var50 = field5531[field5535 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field512 = null;
                    return;
                }
                var47.field512 = class229.method1575(var50, 0, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field5531[--field5535];
                if (class8.field113 != var51 && class282.field4039 != var51 && class125.field1889 != var51) {
                    return;
                }
                var47.field496 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field404 = field5531[--field5535];
                return;
            }
            if (arg0 == 1304) {
                var47.field483 = field5531[--field5535];
                return;
            }
            if (arg0 == 1305) {
                var47.field499 = field5536[--field5520];
                return;
            }
            if (arg0 == 1306) {
                var47.field439 = field5536[--field5520];
                return;
            }
            if (arg0 == 1307) {
                var47.field442 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field435 = field5531[--field5535];
                var47.field464 = field5531[--field5535];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field5531[--field5535];
                int var53 = field5531[--field5535];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method224(var52, var53 - 1, 0);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field527 = field5536[--field5520];
                return;
            }
            if (arg0 == 1311) {
                var47.field402 = field5531[--field5535];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field5535 -= 3;
                    var54 = field5531[field5535] - 1;
                    var55 = field5531[field5535 + 1];
                    var56 = field5531[field5535 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5535 -= 2;
                    var54 = 10;
                    var55 = field5531[field5535];
                    var56 = field5531[field5535 + 1];
                }
                if (var47.field406 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field406 = new byte[11];
                    var47.field468 = new byte[11];
                    var47.field556 = new int[11];
                }
                var47.field406[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field445 = false;
                    for (int var57 = 0; var57 < var47.field406.length; var57++) {
                        if (var47.field406[var57] != 0) {
                            var47.field445 = true;
                            break;
                        }
                    }
                } else {
                    var47.field445 = true;
                }
                var47.field468[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field420 = field5531[--field5535];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lwt;II)V", line = 6774)
    public static final void method2244(class202 arg0, int arg1, int arg2) {
        class526 var3 = class163.method1136(arg1, -3, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field5532 = new int[var3.field7774];
        field5523 = new String[var3.field7782];
        if (class370.field5662 == var3.field7778 || class363.field5567 == var3.field7778 || class135.field2057 == var3.field7778) {
            int var4 = 0;
            int var5 = 0;
            if (class166.field2455 != null) {
                var4 = class166.field2455.field412;
                var5 = class166.field2455.field501;
            }
            field5532[0] = class54.field838.method1751(32) - var4;
            field5532[1] = class54.field838.method1749((byte) -126) - var5;
        }
        method2245(var3, 200000);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lmo;I)V", line = 6803)
    private static final void method2245(class526 arg0, int arg1) {
        field5535 = 0;
        field5520 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7787;
        int[] var4 = arg0.field7777;
        byte var5 = -1;
        field5530 = 0;
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
                        method2243(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2241(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field5531[field5535++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field5531[field5535++] = class49.field796.field2619[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class49.field796.method1209(var8, field5531[--field5535], 0);
                } else if (var43 == 3) {
                    field5536[field5520++] = arg0.field7781[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field5535 -= 2;
                    if (field5531[field5535 + 1] != field5531[field5535]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field5535 -= 2;
                    if (field5531[field5535 + 1] == field5531[field5535]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field5535 -= 2;
                    if (field5531[field5535] < field5531[field5535 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field5535 -= 2;
                    if (field5531[field5535] > field5531[field5535 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5530 == 0) {
                        return;
                    }
                    class115 var9 = field5517[--field5530];
                    arg0 = var9.field1738;
                    var3 = arg0.field7787;
                    var4 = arg0.field7777;
                    var2 = var9.field1733;
                    field5532 = var9.field1736;
                    field5523 = var9.field1731;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field5531[field5535++] = class49.field796.method349(-123, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class49.field796.method1217(field5531[--field5535], var11, 0);
                } else if (var43 == 31) {
                    field5535 -= 2;
                    if (field5531[field5535] <= field5531[field5535 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field5535 -= 2;
                    if (field5531[field5535] >= field5531[field5535 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field5531[field5535++] = field5532[var4[var2]];
                } else if (var43 == 34) {
                    field5532[var4[var2]] = field5531[--field5535];
                } else if (var43 == 35) {
                    field5536[field5520++] = field5523[var4[var2]];
                } else if (var43 == 36) {
                    field5523[var4[var2]] = field5536[--field5520];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field5520 -= var12;
                    String var13 = class323.method2005(field5520, field5536, var12, (byte) 84);
                    field5536[field5520++] = var13;
                } else if (var43 == 38) {
                    field5535--;
                } else if (var43 == 39) {
                    field5520--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class526 var15 = class73.method418(var14, 0);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7774];
                    String[] var17 = new String[var15.field7782];
                    for (int var18 = 0; var18 < var15.field7775; var18++) {
                        var16[var18] = field5531[field5535 + var18 - var15.field7775];
                    }
                    for (int var19 = 0; var19 < var15.field7783; var19++) {
                        var17[var19] = field5536[field5520 + var19 - var15.field7783];
                    }
                    field5535 -= var15.field7775;
                    field5520 -= var15.field7783;
                    class115 var20 = new class115();
                    var20.field1738 = arg0;
                    var20.field1733 = var2;
                    var20.field1736 = field5532;
                    var20.field1731 = field5523;
                    if (field5530 >= field5517.length) {
                        throw new RuntimeException();
                    }
                    field5517[field5530++] = var20;
                    arg0 = var15;
                    var3 = var15.field7787;
                    var4 = var15.field7777;
                    var2 = -1;
                    field5532 = var16;
                    field5523 = var17;
                } else if (var43 == 42) {
                    field5531[field5535++] = class146.field2173[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class146.field2173[var21] = field5531[--field5535];
                    class212.method1483((byte) -70, var21);
                    class394.field5938 |= class436.field6519[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field5531[--field5535];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5519[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5522[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field5531[--field5535];
                    if (var28 < 0 || var28 >= field5519[var27]) {
                        throw new RuntimeException();
                    }
                    field5531[field5535++] = field5522[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field5535 -= 2;
                    int var30 = field5531[field5535];
                    if (var30 < 0 || var30 >= field5519[var29]) {
                        throw new RuntimeException();
                    }
                    field5522[var29][var30] = field5531[field5535 + 1];
                } else if (var43 == 47) {
                    String var31 = class35.field371[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5536[field5520++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class35.field371[var32] = field5536[--field5520];
                    class318.method1987(var32, (byte) 122);
                } else if (var43 == 51) {
                    class433 var33 = arg0.field7776[var4[var2]];
                    class427 var34 = (class427) var33.method2605(false, (long) field5531[--field5535]);
                    if (var34 != null) {
                        var2 += var34.field6402;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7779 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4736).append(" ");
                for (int var41 = field5530 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field5517[var41].field1738.field4736).append(" ");
                }
                var40.append("op: ").append(var5);
                class235.method1598(var42, var40.toString(), (byte) 107);
            } else {
                class61.method359("Clientscript error in: " + arg0.field7779, (byte) -113);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7779).append("\n");
                for (int var38 = field5530 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field5517[var38].field1738.field7779).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class235.method1598(var42, var37.toString(), (byte) 68);
                class314.method1955(var37.toString(), 14715);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Ljava/lang/String;", line = 7238)
    private static final String method2246(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5533.setTime(new Date(var1));
        int var3 = field5533.get(5);
        int var4 = field5533.get(2);
        int var5 = field5533.get(1);
        return var3 + "-" + field5542[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V", line = 7256)
    public static void method2247() {
        field5532 = null;
        field5523 = null;
        field5519 = null;
        field5522 = null;
        field5531 = null;
        field5536 = null;
        field5517 = null;
        field5527 = null;
        field5525 = null;
        field5521 = null;
        field5533 = null;
        field5542 = null;
        field5544 = null;
        field5543 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V", line = 7271)
    public static final void method2248() {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7296)
    private static final void method2249(String arg0, int arg1) {
        if (class402.field6053 == 0 && !(!class56.field871 || class447.field6665) || class214.field3124) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class480.field7049.method2838(false, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class480.field7049.method2838(false, 0).length());
        } else if (var2.startsWith(class41.field612.method2838(false, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class41.field612.method2838(false, 0).length());
        } else if (var2.startsWith(class462.field6852.method2838(false, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class462.field6852.method2838(false, 0).length());
        } else if (var2.startsWith(class45.field720.method2838(false, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class45.field720.method2838(false, 0).length());
        } else if (var2.startsWith(class114.field1725.method2838(false, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class114.field1725.method2838(false, 0).length());
        } else if (var2.startsWith(class133.field2044.method2838(false, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class133.field2044.method2838(false, 0).length());
        } else if (var2.startsWith(class283.field4076.method2838(false, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class283.field4076.method2838(false, 0).length());
        } else if (var2.startsWith(class382.field5782.method2838(false, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class382.field5782.method2838(false, 0).length());
        } else if (var2.startsWith(class511.field7477.method2838(false, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class511.field7477.method2838(false, 0).length());
        } else if (var2.startsWith(class230.field3437.method2838(false, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class230.field3437.method2838(false, 0).length());
        } else if (var2.startsWith(class299.field4245.method2838(false, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class299.field4245.method2838(false, 0).length());
        } else if (var2.startsWith(class184.field2739.method2838(false, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class184.field2739.method2838(false, 0).length());
        } else if (class143.field2137 != 0) {
            if (var2.startsWith(class480.field7049.method2838(false, class143.field2137))) {
                var3 = 0;
                arg0 = arg0.substring(class480.field7049.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class41.field612.method2838(false, class143.field2137))) {
                var3 = 1;
                arg0 = arg0.substring(class41.field612.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class462.field6852.method2838(false, class143.field2137))) {
                var3 = 2;
                arg0 = arg0.substring(class462.field6852.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class45.field720.method2838(false, class143.field2137))) {
                var3 = 3;
                arg0 = arg0.substring(class45.field720.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class114.field1725.method2838(false, class143.field2137))) {
                var3 = 4;
                arg0 = arg0.substring(class114.field1725.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class133.field2044.method2838(false, class143.field2137))) {
                var3 = 5;
                arg0 = arg0.substring(class133.field2044.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class283.field4076.method2838(false, class143.field2137))) {
                var3 = 6;
                arg0 = arg0.substring(class283.field4076.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class382.field5782.method2838(false, class143.field2137))) {
                var3 = 7;
                arg0 = arg0.substring(class382.field5782.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class511.field7477.method2838(false, class143.field2137))) {
                var3 = 8;
                arg0 = arg0.substring(class511.field7477.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class230.field3437.method2838(false, class143.field2137))) {
                var3 = 9;
                arg0 = arg0.substring(class230.field3437.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class299.field4245.method2838(false, class143.field2137))) {
                var3 = 10;
                arg0 = arg0.substring(class299.field4245.method2838(false, class143.field2137).length());
            } else if (var2.startsWith(class184.field2739.method2838(false, class143.field2137))) {
                var3 = 11;
                arg0 = arg0.substring(class184.field2739.method2838(false, class143.field2137).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class517.field7537.method2838(false, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class517.field7537.method2838(false, 0).length());
        } else if (var4.startsWith(class22.field230.method2838(false, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class22.field230.method2838(false, 0).length());
        } else if (var4.startsWith(class172.field2544.method2838(false, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class172.field2544.method2838(false, 0).length());
        } else if (var4.startsWith(class165.field2433.method2838(false, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class165.field2433.method2838(false, 0).length());
        } else if (var4.startsWith(class388.field5866.method2838(false, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class388.field5866.method2838(false, 0).length());
        } else if (class143.field2137 != 0) {
            if (var4.startsWith(class517.field7537.method2838(false, class143.field2137))) {
                var5 = 1;
                arg0 = arg0.substring(class517.field7537.method2838(false, class143.field2137).length());
            } else if (var4.startsWith(class22.field230.method2838(false, class143.field2137))) {
                var5 = 2;
                arg0 = arg0.substring(class22.field230.method2838(false, class143.field2137).length());
            } else if (var4.startsWith(class172.field2544.method2838(false, class143.field2137))) {
                var5 = 3;
                arg0 = arg0.substring(class172.field2544.method2838(false, class143.field2137).length());
            } else if (var4.startsWith(class165.field2433.method2838(false, class143.field2137))) {
                var5 = 4;
                arg0 = arg0.substring(class165.field2433.method2838(false, class143.field2137).length());
            } else if (var4.startsWith(class388.field5866.method2838(false, class143.field2137))) {
                var5 = 5;
                arg0 = arg0.substring(class388.field5866.method2838(false, class143.field2137).length());
            }
        }
        field5524++;
        class291.method1861((byte) -104, class250.field3710);
        class356.field5471.method1410(0, -27645);
        int var6 = class356.field5471.field3037;
        if (arg1 == 5021) {
            class356.field5471.method1410(1, -27645);
        } else if (arg1 == 5022) {
            class356.field5471.method1410(2, -27645);
        } else {
            class356.field5471.method1410(0, -27645);
        }
        class356.field5471.method1410(var3, -27645);
        class356.field5471.method1410(var5, -27645);
        class30.method178(true, class356.field5471, arg0);
        class356.field5471.method1443(class356.field5471.field3037 - var6, -1);
    }
}
