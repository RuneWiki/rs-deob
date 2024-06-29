import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class281 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    private static int[] field4184 = new int[5];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field4185 = new String[1000];

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    private static int[] field4204 = new int[1000];

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[[I")
    private static int[][] field4203 = new int[5][5000];

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[Lim;")
    private static class410[] field4200 = new class410[50];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    private static int field4193 = 0;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private static int field4196 = 0;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private static int field4205 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4186 = Calendar.getInstance();

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
    private static int[] field4207 = new int[3];

    @OriginalMember(owner = "client!df", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field4209 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lge;")
    public static class511 field4208 = new class511(4);

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    private static int field4210 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ltf;")
    private static class198 field4182;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ltf;")
    private static class198 field4192;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lom;")
    private static class258 field4202;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
    private static int[] field4206;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field4199;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
    public static final void method1804(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldk;)V")
    public static final void method1805(class361 arg0) {
        method1806(arg0, 200000);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldk;I)V")
    private static final void method1806(class361 arg0, int arg1) {
        Object[] var2 = arg0.field5256;
        int var3 = (Integer) var2[0];
        class88 var4 = class394.method2381((byte) -77, var3);
        if (var4 == null) {
            return;
        }
        field4206 = new int[var4.field1415];
        int var5 = 0;
        field4199 = new String[var4.field1425];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5257;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5254;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5252 == null ? -1 : arg0.field5252.field3016;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5253;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5252 == null ? -1 : arg0.field5252.field2969;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5260 == null ? -1 : arg0.field5260.field3016;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5260 == null ? -1 : arg0.field5260.field2969;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5255;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5258;
                }
                field4206[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5251;
                }
                field4199[var6++] = var9;
            }
        }
        field4210 = arg0.field5261;
        method1817(var4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public static final void method1807() {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    private static final void method1808(int arg0) {
        class198 var1 = class154.method1087(arg0, 2);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class198[] var3 = class472.field6869[var2];
        if (var3 == null) {
            class198[] var4 = class283.field4217[var2];
            int var5 = var4.length;
            var3 = class472.field6869[var2] = new class198[var5];
            class282.method1820(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class282.method1820(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkj;II)V")
    public static final void method1809(class405 arg0, int arg1, int arg2) {
        class88 var3 = class392.method2366((byte) 121, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field4206 = new int[var3.field1415];
        field4199 = new String[var3.field1425];
        if (class524.field7656 == var3.field1418 || class394.field5609 == var3.field1418 || class275.field4107 == var3.field1418) {
            int var4 = 0;
            int var5 = 0;
            if (class80.field1302 != null) {
                var4 = class80.field1302.field2924;
                var5 = class80.field1302.field2957;
            }
            field4206[0] = class49.field909.method639((byte) 115) - var4;
            field4206[1] = class49.field909.method644(101) - var5;
        }
        method1817(var3, 200000);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V")
    private static final void method1810(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4204[field4205++] = class414.field5868;
                return;
            }
            if (arg0 == 5001) {
                field4205 -= 3;
                class414.field5868 = field4204[field4205];
                class38.field804 = class118.method857(field4204[field4205 + 1], (byte) 115);
                if (class38.field804 == null) {
                    class38.field804 = class192.field2799;
                }
                class265.field3999 = field4204[field4205 + 2];
                field4189++;
                class228.method1528(true, class126.field1970);
                class276.field4124.method3048(-2034159384, class414.field5868);
                class276.field4124.method3048(-2034159384, class38.field804.field5534);
                class276.field4124.method3048(-2034159384, class265.field3999);
                return;
            }
            if (arg0 == 5002) {
                field4196 -= 2;
                String var2 = field4185[field4196];
                String var3 = field4185[field4196 + 1];
                field4205 -= 2;
                int var4 = field4204[field4205];
                int var5 = field4204[field4205 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4187++;
                class228.method1528(true, class118.field1842);
                class276.field4124.method3048(-2034159384, class132.method966(var2, 10240) + class132.method966(var3, 10240) + 2);
                class276.field4124.method3057((byte) -28, var2);
                class276.field4124.method3048(-2034159384, var4 - 1);
                class276.field4124.method3048(-2034159384, var5);
                class276.field4124.method3057((byte) -28, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4204[--field4205];
                class450 var7 = class274.method1767(var6, 0);
                String var8 = "";
                if (var7 != null && var7.field6565 != null) {
                    var8 = var7.field6565;
                }
                field4185[field4196++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field4204[--field4205];
                class450 var10 = class274.method1767(var9, 0);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field6570;
                }
                field4204[field4205++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class38.field804 == null) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = class38.field804.field5534;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var12 = field4185[--field4196];
                method1816(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4196 -= 2;
                String var13 = field4185[field4196];
                String var14 = field4185[field4196 + 1];
                if (class37.field791 != 0 || (!class10.field88 || class78.field1274) && !class317.field4710) {
                    field4183++;
                    class228.method1528(true, class505.field7300);
                    class276.field4124.method3048(-2034159384, 0);
                    int var15 = class276.field4124.field7558;
                    class276.field4124.method3057((byte) -28, var13);
                    class336.method2132(var14, (byte) 116, class276.field4124);
                    class276.field4124.method3025(class276.field4124.field7558 - var15, 109);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field4204[--field4205];
                class450 var17 = class274.method1767(var16, 0);
                String var18 = "";
                if (var17 != null && var17.field6571 != null) {
                    var18 = var17.field6571;
                }
                field4185[field4196++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field4204[--field4205];
                class450 var20 = class274.method1767(var19, 0);
                String var21 = "";
                if (var20 != null && var20.field6567 != null) {
                    var21 = var20.field6567;
                }
                field4185[field4196++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field4204[--field4205];
                class450 var23 = class274.method1767(var22, 0);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field6569;
                }
                field4204[field4205++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class364.field5293 == null || class364.field5293.field7406 == null) {
                    var25 = class339.field5024;
                } else {
                    var25 = class364.field5293.method2973(true, true);
                }
                field4185[field4196++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field4204[field4205++] = class265.field3999;
                return;
            }
            if (arg0 == 5017) {
                field4204[field4205++] = class263.method1700((byte) -42);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field4204[--field4205];
                class450 var27 = class274.method1767(var26, 0);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field6566;
                }
                field4204[field4205++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field4204[--field4205];
                class450 var30 = class274.method1767(var29, 0);
                String var31 = "";
                if (var30 != null && var30.field6572 != null) {
                    var31 = var30.field6572;
                }
                field4185[field4196++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class364.field5293 == null || class364.field5293.field7406 == null) {
                    var32 = class339.field5024;
                } else {
                    var32 = class364.field5293.method2972(false, 108);
                }
                field4185[field4196++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field4204[--field4205];
                class450 var34 = class274.method1767(var33, 0);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field6568;
                }
                field4204[field4205++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field4204[--field4205];
                class450 var37 = class274.method1767(var36, 0);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field6564;
                }
                field4204[field4205++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field4204[--field4205];
                field4185[field4196++] = class419.field5954.method1514(var39, (byte) -123).field1973;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field4204[--field4205];
                class126 var41 = class419.field5954.method1514(var40, (byte) -128);
                if (var41.field1981 == null) {
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = var41.field1981.length;
                return;
            }
            if (arg0 == 5052) {
                field4205 -= 2;
                int var42 = field4204[field4205];
                int var43 = field4204[field4205 + 1];
                class126 var44 = class419.field5954.method1514(var42, (byte) -122);
                int var45 = var44.field1981[var43];
                field4204[field4205++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field4204[--field4205];
                class126 var47 = class419.field5954.method1514(var46, (byte) -123);
                if (var47.field1975 == null) {
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = var47.field1975.length;
                return;
            }
            if (arg0 == 5054) {
                field4205 -= 2;
                int var48 = field4204[field4205];
                int var49 = field4204[field4205 + 1];
                field4204[field4205++] = class419.field5954.method1514(var48, (byte) -126).field1975[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field4204[--field4205];
                field4185[field4196++] = class363.field5277.method3120(-25, var50).method1728(-1);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field4204[--field4205];
                class268 var52 = class363.field5277.method3120(118, var51);
                if (var52.field4032 == null) {
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = var52.field4032.length;
                return;
            }
            if (arg0 == 5057) {
                field4205 -= 2;
                int var53 = field4204[field4205];
                int var54 = field4204[field4205 + 1];
                field4204[field4205++] = class363.field5277.method3120(110, var53).field4032[var54];
                return;
            }
            if (arg0 == 5058) {
                field4202 = new class258();
                field4202.field3822 = field4204[--field4205];
                field4202.field3824 = class363.field5277.method3120(118, field4202.field3822);
                field4202.field3825 = new int[field4202.field3824.method1727(103)];
                return;
            }
            if (arg0 == 5059) {
                field4195++;
                class228.method1528(true, class314.field4686);
                class276.field4124.method3048(-2034159384, 0);
                int var55 = class276.field4124.field7558;
                class276.field4124.method3048(-2034159384, 0);
                class276.field4124.method3016(field4202.field3822, -107);
                field4202.field3824.method1722(class276.field4124, 0, field4202.field3825);
                class276.field4124.method3025(class276.field4124.field7558 - var55, 63);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field4185[--field4196];
                field4190++;
                class228.method1528(true, class419.field5960);
                class276.field4124.method3048(-2034159384, 0);
                int var57 = class276.field4124.field7558;
                class276.field4124.method3057((byte) -28, var56);
                class276.field4124.method3016(field4202.field3822, -47);
                field4202.field3824.method1722(class276.field4124, 0, field4202.field3825);
                class276.field4124.method3025(class276.field4124.field7558 - var57, 93);
                return;
            }
            if (arg0 == 5061) {
                field4195++;
                class228.method1528(true, class314.field4686);
                class276.field4124.method3048(-2034159384, 0);
                int var58 = class276.field4124.field7558;
                class276.field4124.method3048(-2034159384, 1);
                class276.field4124.method3016(field4202.field3822, -18);
                field4202.field3824.method1722(class276.field4124, 0, field4202.field3825);
                class276.field4124.method3025(class276.field4124.field7558 - var58, 79);
                return;
            }
            if (arg0 == 5062) {
                field4205 -= 2;
                int var59 = field4204[field4205];
                int var60 = field4204[field4205 + 1];
                field4204[field4205++] = class419.field5954.method1514(var59, (byte) -121).field1980[var60];
                return;
            }
            if (arg0 == 5063) {
                field4205 -= 2;
                int var61 = field4204[field4205];
                int var62 = field4204[field4205 + 1];
                field4204[field4205++] = class419.field5954.method1514(var61, (byte) -120).field1974[var62];
                return;
            }
            if (arg0 == 5064) {
                field4205 -= 2;
                int var63 = field4204[field4205];
                int var64 = field4204[field4205 + 1];
                if (var64 == -1) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = class419.field5954.method1514(var63, (byte) -119).method932((char) var64, (byte) 45);
                return;
            }
            if (arg0 == 5065) {
                field4205 -= 2;
                int var65 = field4204[field4205];
                int var66 = field4204[field4205 + 1];
                if (var66 == -1) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = class419.field5954.method1514(var65, (byte) -123).method939(111, (char) var66);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field4204[--field4205];
                field4204[field4205++] = class363.field5277.method3120(92, var67).method1727(124);
                return;
            }
            if (arg0 == 5067) {
                field4205 -= 2;
                int var68 = field4204[field4205];
                int var69 = field4204[field4205 + 1];
                int var70 = class363.field5277.method3120(-71, var68).method1729(var69, -231).field1476;
                field4204[field4205++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field4205 -= 2;
                int var71 = field4204[field4205];
                int var72 = field4204[field4205 + 1];
                field4202.field3825[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field4205 -= 2;
                int var73 = field4204[field4205];
                int var74 = field4204[field4205 + 1];
                field4202.field3825[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field4205 -= 3;
                int var75 = field4204[field4205];
                int var76 = field4204[field4205 + 1];
                int var77 = field4204[field4205 + 2];
                class268 var78 = class363.field5277.method3120(-107, var75);
                if (var78.method1729(var76, -231).field1476 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4204[field4205++] = var78.method1723(var77, var76, 80);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field4185[--field4196];
                boolean var80 = field4204[--field4205] == 1;
                class265.method1707(false, var80, var79);
                field4204[field4205++] = class27.field385;
                return;
            }
            if (arg0 == 5072) {
                if (class86.field1398 != null && class98.field1542 < class27.field385) {
                    field4204[field4205++] = class86.field1398[class98.field1542++] & 0xFFFF;
                    return;
                }
                field4204[field4205++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class98.field1542 = 0;
                return;
            }
            if (arg0 == 5074) {
                field4195++;
                class228.method1528(true, class314.field4686);
                class276.field4124.method3048(-2034159384, 0);
                int var81 = class276.field4124.field7558;
                class276.field4124.method3048(-2034159384, 2);
                class276.field4124.method3016(field4202.field3822, -82);
                field4202.field3824.method1722(class276.field4124, 0, field4202.field3825);
                class276.field4124.method3025(class276.field4124.field7558 - var81, 114);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class218.field3339.method74(86, 64)) {
                    field4204[field4205++] = 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class218.field3339.method74(82, 64)) {
                    field4204[field4205++] = 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class218.field3339.method74(81, 64)) {
                    field4204[field4205++] = 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class158.method1103(field4204[--field4205], -76);
                return;
            }
            if (arg0 == 5201) {
                field4204[field4205++] = class42.method415(false);
                return;
            }
            if (arg0 == 5205) {
                class396.method2388(field4204[--field4205], -1, false, -1, 110);
                return;
            }
            if (arg0 == 5206) {
                int var82 = field4204[--field4205];
                class158 var83 = class382.method2325(var82 >> 14 & 0x3FFF, var82 & 0x3FFF);
                if (var83 == null) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = var83.field2416;
                return;
            }
            if (arg0 == 5207) {
                class158 var84 = class382.method2322(field4204[--field4205]);
                if (var84 != null && var84.field2421 != null) {
                    field4185[field4196++] = var84.field2421;
                    return;
                }
                field4185[field4196++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4204[field4205++] = class446.field6369;
                field4204[field4205++] = class298.field4453;
                return;
            }
            if (arg0 == 5209) {
                field4204[field4205++] = class70.field1149 + class382.field5467;
                field4204[field4205++] = class388.field5514 + class382.field5469;
                return;
            }
            if (arg0 == 5210) {
                int var85 = field4204[--field4205];
                class158 var86 = class382.method2322(var85);
                if (var86 == null) {
                    field4204[field4205++] = 0;
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = var86.field2409 >> 14 & 0x3FFF;
                field4204[field4205++] = var86.field2409 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var87 = field4204[--field4205];
                class158 var88 = class382.method2322(var87);
                if (var88 == null) {
                    field4204[field4205++] = 0;
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = var88.field2404 - var88.field2419;
                field4204[field4205++] = var88.field2412 - var88.field2408;
                return;
            }
            if (arg0 == 5212) {
                class528 var89 = class15.method87((byte) 19);
                if (var89 == null) {
                    field4204[field4205++] = -1;
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = var89.field7723;
                int var90 = var89.field7718 << 28 | class382.field5467 + var89.field7714 << 14 | class382.field5469 + var89.field7719;
                field4204[field4205++] = var90;
                return;
            }
            if (arg0 == 5213) {
                class528 var91 = class506.method2950(false);
                if (var91 == null) {
                    field4204[field4205++] = -1;
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = var91.field7723;
                int var92 = var91.field7718 << 28 | class382.field5467 + var91.field7714 << 14 | class382.field5469 + var91.field7719;
                field4204[field4205++] = var92;
                return;
            }
            if (arg0 == 5214) {
                int var93 = field4204[--field4205];
                class158 var94 = class226.method1519(false);
                if (var94 != null) {
                    boolean var95 = var94.method1104(var93 >> 28 & 0x3, var93 & 0x3FFF, field4207, -1190, var93 >> 14 & 0x3FFF);
                    if (var95) {
                        class33.method267(field4207[1], field4207[2], 78);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4205 -= 2;
                int var96 = field4204[field4205];
                int var97 = field4204[field4205 + 1];
                class18 var98 = class382.method2327(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                boolean var99 = false;
                for (class158 var100 = (class158) var98.method102(1048575); var100 != null; var100 = (class158) var98.method105((byte) 43)) {
                    if (var100.field2416 == var97) {
                        var99 = true;
                        break;
                    }
                }
                if (var99) {
                    field4204[field4205++] = 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var101 = field4204[--field4205];
                class158 var102 = class382.method2322(var101);
                if (var102 == null) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = var102.field2407;
                return;
            }
            if (arg0 == 5220) {
                field4204[field4205++] = class421.field5973 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var103 = field4204[--field4205];
                class33.method267(var103 >> 14 & 0x3FFF, var103 & 0x3FFF, 98);
                return;
            }
            if (arg0 == 5222) {
                class158 var104 = class226.method1519(false);
                if (var104 != null) {
                    boolean var105 = var104.method1107(field4207, -5906, class70.field1149 + class382.field5467, class388.field5514 + class382.field5469);
                    if (var105) {
                        field4204[field4205++] = field4207[1];
                        field4204[field4205++] = field4207[2];
                        return;
                    }
                    field4204[field4205++] = -1;
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = -1;
                field4204[field4205++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4205 -= 2;
                int var106 = field4204[field4205];
                int var107 = field4204[field4205 + 1];
                class396.method2388(var106, var107 >> 14 & 0x3FFF, false, var107 & 0x3FFF, 103);
                return;
            }
            if (arg0 == 5224) {
                int var108 = field4204[--field4205];
                class158 var109 = class226.method1519(false);
                if (var109 != null) {
                    boolean var110 = var109.method1104(var108 >> 28 & 0x3, var108 & 0x3FFF, field4207, -1190, var108 >> 14 & 0x3FFF);
                    if (var110) {
                        field4204[field4205++] = field4207[1];
                        field4204[field4205++] = field4207[2];
                        return;
                    }
                    field4204[field4205++] = -1;
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = -1;
                field4204[field4205++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var111 = field4204[--field4205];
                class158 var112 = class226.method1519(false);
                if (var112 != null) {
                    boolean var113 = var112.method1107(field4207, -5906, var111 >> 14 & 0x3FFF, var111 & 0x3FFF);
                    if (var113) {
                        field4204[field4205++] = field4207[1];
                        field4204[field4205++] = field4207[2];
                        return;
                    }
                    field4204[field4205++] = -1;
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = -1;
                field4204[field4205++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class25.method159(-1, field4204[--field4205]);
                return;
            }
            if (arg0 == 5227) {
                field4205 -= 2;
                int var114 = field4204[field4205];
                int var115 = field4204[field4205 + 1];
                class396.method2388(var114, var115 >> 14 & 0x3FFF, true, var115 & 0x3FFF, 114);
                return;
            }
            if (arg0 == 5228) {
                class138.field2155 = field4204[--field4205] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4204[field4205++] = class138.field2155 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var116 = field4204[--field4205];
                class525.method3110(var116, (byte) -54);
                return;
            }
            if (arg0 == 5231) {
                field4205 -= 2;
                int var117 = field4204[field4205];
                boolean var118 = field4204[field4205 + 1] == 1;
                if (class417.field5927 != null) {
                    class42 var119 = class417.field5927.method2284(true, (long) var117);
                    if (var119 != null && !var118) {
                        var119.method421(22071);
                        return;
                    }
                    if (var119 == null && var118) {
                        class42 var120 = new class42();
                        class417.field5927.method2292((long) var117, var120, (byte) -128);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var121 = field4204[--field4205];
                if (class417.field5927 != null) {
                    class42 var122 = class417.field5927.method2284(true, (long) var121);
                    field4204[field4205++] = var122 == null ? 0 : 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4205 -= 2;
                int var123 = field4204[field4205];
                boolean var124 = field4204[field4205 + 1] == 1;
                if (class517.field7488 != null) {
                    class42 var125 = class517.field7488.method2284(true, (long) var123);
                    if (var125 != null && !var124) {
                        var125.method421(22071);
                        return;
                    }
                    if (var125 == null && var124) {
                        class42 var126 = new class42();
                        class517.field7488.method2292((long) var123, var126, (byte) -127);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var127 = field4204[--field4205];
                if (class517.field7488 != null) {
                    class42 var128 = class517.field7488.method2284(true, (long) var127);
                    field4204[field4205++] = var128 == null ? 0 : 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4204[field4205++] = class382.field5449 == null ? -1 : class382.field5449.field2416;
                return;
            }
            if (arg0 == 5236) {
                field4205 -= 2;
                int var129 = field4204[field4205];
                int var130 = field4204[field4205 + 1];
                int var131 = var130 >> 14 & 0x3FFF;
                int var132 = var130 & 0x3FFF;
                int var133 = class391.method2357((byte) -125, var129, var131, var132);
                if (var133 < 0) {
                    field4204[field4205++] = -1;
                    return;
                }
                field4204[field4205++] = var133;
                return;
            }
            if (arg0 == 5237) {
                class364.method2243(-128);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4205 -= 2;
                int var134 = field4204[field4205];
                int var135 = field4204[field4205 + 1];
                class477.method2825(var134, var135, 3, 3, false);
                field4204[field4205++] = class230.field3443 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class230.field3443 != null) {
                    class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class384[] var136 = class518.method3010(-106);
                field4204[field4205++] = var136.length;
                return;
            }
            if (arg0 == 5303) {
                int var137 = field4204[--field4205];
                class384[] var138 = class518.method3010(-79);
                field4204[field4205++] = var138[var137].field5492;
                field4204[field4205++] = var138[var137].field5491;
                return;
            }
            if (arg0 == 5305) {
                int var139 = class220.field3371.field2584;
                int var140 = class220.field3371.field2588;
                int var141 = -1;
                class384[] var142 = class518.method3010(-110);
                for (int var143 = 0; var143 < var142.length; var143++) {
                    class384 var144 = var142[var143];
                    if (var144.field5492 == var139 && var144.field5491 == var140) {
                        var141 = var143;
                        break;
                    }
                }
                field4204[field4205++] = var141;
                return;
            }
            if (arg0 == 5306) {
                field4204[field4205++] = class360.method2235(32397);
                return;
            }
            if (arg0 == 5307) {
                int var145 = field4204[--field4205];
                if (var145 >= 1 && var145 <= 2) {
                    class477.method2825(-1, -1, 3, var145, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4204[field4205++] = class220.field3371.field2580;
                return;
            }
            if (arg0 == 5309) {
                int var146 = field4204[--field4205];
                if (var146 >= 1 && var146 <= 2) {
                    class220.field3371.field2580 = var146;
                    class220.field3371.method1044(1, class280.field4173);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4196 -= 2;
                String var147 = field4185[field4196];
                String var148 = field4185[field4196 + 1];
                int var149 = field4204[--field4205];
                field4197++;
                class228.method1528(true, class305.field4517);
                class276.field4124.method3048(-2034159384, class132.method966(var147, 10240) + class132.method966(var148, 10240) + 1);
                class276.field4124.method3057((byte) -28, var147);
                class276.field4124.method3057((byte) -28, var148);
                class276.field4124.method3048(-2034159384, var149);
                return;
            }
            if (arg0 == 5401) {
                field4205 -= 2;
                class337.field5001[field4204[field4205]] = (short) class238.method1578(-107, field4204[field4205 + 1]);
                class58.field1052.method1650((byte) -118);
                class58.field1052.method1645(-10920);
                class117.field1812.method2311(2);
                class531.method3148(-30);
                return;
            }
            if (arg0 == 5405) {
                field4205 -= 2;
                int var150 = field4204[field4205];
                int var151 = field4204[field4205 + 1];
                if (var150 >= 0 && var150 < 2) {
                    class25.field359[var150] = new int[var151 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4205 -= 7;
                int var152 = field4204[field4205];
                int var153 = field4204[field4205 + 1] << 1;
                int var154 = field4204[field4205 + 2];
                int var155 = field4204[field4205 + 3];
                int var156 = field4204[field4205 + 4];
                int var157 = field4204[field4205 + 5];
                int var158 = field4204[field4205 + 6];
                if (var152 >= 0 && var152 < 2 && class25.field359[var152] != null && var153 >= 0 && var153 < class25.field359[var152].length) {
                    class25.field359[var152][var153] = new int[] { (var154 >> 14 & 0x3FFF) << 7, var155, (var154 & 0x3FFF) << 7, var158 };
                    class25.field359[var152][var153 + 1] = new int[] { (var156 >> 14 & 0x3FFF) << 7, var157, (var156 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var159 = class25.field359[field4204[--field4205]].length >> 1;
                field4204[field4205++] = var159;
                return;
            }
            if (arg0 == 5411) {
                if (class230.field3443 != null) {
                    class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
                }
                if (class70.field1153 != null) {
                    class478.method2831((byte) 99);
                    System.exit(0);
                    return;
                }
                String var160 = class231.field3469 == null ? class212.method1425(false) : class231.field3469;
                class437.method2575(var160, false, class280.field4173, class74.field1211 == 1, 24991);
                return;
            }
            if (arg0 == 5419) {
                String var161 = "";
                if (class415.field5886 != null) {
                    if (class415.field5886.field1311 == null) {
                        var161 = class433.method2563(class415.field5886.field1309, 63);
                    } else {
                        var161 = (String) class415.field5886.field1311;
                    }
                }
                field4185[field4196++] = var161;
                return;
            }
            if (arg0 == 5420) {
                field4204[field4205++] = class411.field5809 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class230.field3443 != null) {
                    class477.method2825(-1, -1, 3, class220.field3371.field2580, false);
                }
                String var162 = field4185[--field4196];
                boolean var163 = field4204[--field4205] == 1;
                String var164 = class212.method1425(false) + var162;
                class437.method2575(var164, var163, class280.field4173, class74.field1211 == 1, 24991);
                return;
            }
            if (arg0 == 5422) {
                field4196 -= 2;
                String var165 = field4185[field4196];
                String var166 = field4185[field4196 + 1];
                int var167 = field4204[--field4205];
                if (var165.length() > 0) {
                    if (class263.field3973 == null) {
                        class263.field3973 = new String[class332.field4924[class14.field163.field6607]];
                    }
                    class263.field3973[var167] = var165;
                }
                if (var166.length() > 0) {
                    if (class201.field3075 == null) {
                        class201.field3075 = new String[class332.field4924[class14.field163.field6607]];
                    }
                    class201.field3075[var167] = var166;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4185[--field4196]);
                return;
            }
            if (arg0 == 5424) {
                field4205 -= 11;
                class424.field5993 = field4204[field4205];
                class233.field3486 = field4204[field4205 + 1];
                class46.field888 = field4204[field4205 + 2];
                class540.field7949 = field4204[field4205 + 3];
                class479.field6978 = field4204[field4205 + 4];
                class259.field3834 = field4204[field4205 + 5];
                class242.field3625 = field4204[field4205 + 6];
                class73.field1195 = field4204[field4205 + 7];
                class170.field2532 = field4204[field4205 + 8];
                class451.field6583 = field4204[field4205 + 9];
                class302.field4474 = field4204[field4205 + 10];
                class96.field1527.method2035(class479.field6978, (byte) -94);
                class96.field1527.method2035(class259.field3834, (byte) -94);
                class96.field1527.method2035(class242.field3625, (byte) -94);
                class96.field1527.method2035(class73.field1195, (byte) -94);
                class96.field1527.method2035(class170.field2532, (byte) -94);
                class482.field7005 = null;
                class366.field5298 = null;
                class118.field1847 = null;
                class290.field4315 = null;
                class102.field1574 = null;
                class133.field2075 = null;
                class200.field3060 = null;
                class108.field1622 = null;
                class535.field7888 = true;
                return;
            }
            if (arg0 == 5425) {
                class47.method440(14490);
                class535.field7888 = false;
                return;
            }
            if (arg0 == 5426) {
                field4205 -= 2;
                class306.field4543 = field4204[field4205];
                class522.field7638 = field4204[field4205 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4205 -= 2;
                class337.field4998 = field4204[field4205 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4205 -= 2;
                int var168 = field4204[field4205];
                int var169 = field4204[field4205 + 1];
                field4204[field4205++] = class87.method654(-23449, var168, var169) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class162.method1175(312929383, field4185[--field4196], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class325.method2066(class280.field4173.field5824, (byte) -73, "accountcreated");
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class325.method2066(class280.field4173.field5824, (byte) -117, "accountcreatestarted");
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4205 -= 4;
                int var170 = field4204[field4205];
                int var171 = field4204[field4205 + 1];
                int var172 = field4204[field4205 + 2];
                int var173 = field4204[field4205 + 3];
                class44.method427(var172, (var170 >> 14 & 0x3FFF) - class82.field1315, var173, false, -1, var171, (var170 & 0x3FFF) - class501.field7240);
                return;
            }
            if (arg0 == 5501) {
                field4205 -= 4;
                int var174 = field4204[field4205];
                int var175 = field4204[field4205 + 1];
                int var176 = field4204[field4205 + 2];
                int var177 = field4204[field4205 + 3];
                class29.method169(var175, false, (var174 & 0x3FFF) - class501.field7240, (var174 >> 14 & 0x3FFF) - class82.field1315, var177, var176);
                return;
            }
            if (arg0 == 5502) {
                field4205 -= 6;
                int var178 = field4204[field4205];
                if (var178 >= 2) {
                    throw new RuntimeException();
                }
                class86.field1396 = var178;
                int var179 = field4204[field4205 + 1];
                if (var179 + 1 >= class25.field359[class86.field1396].length >> 1) {
                    throw new RuntimeException();
                }
                class89.field1438 = var179;
                class63.field1091 = 0;
                class222.field3396 = field4204[field4205 + 2];
                class518.field7501 = field4204[field4205 + 3];
                int var180 = field4204[field4205 + 4];
                if (var180 >= 2) {
                    throw new RuntimeException();
                }
                class176.field2634 = var180;
                int var181 = field4204[field4205 + 5];
                if (var181 + 1 >= class25.field359[class176.field2634].length >> 1) {
                    throw new RuntimeException();
                }
                class530.field7830 = var181;
                class294.field4381 = 3;
                return;
            }
            if (arg0 == 5503) {
                class38.method397(-1);
                return;
            }
            if (arg0 == 5504) {
                field4205 -= 2;
                class7.method31((byte) 20, field4204[field4205], 0, field4204[field4205 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field4204[field4205++] = (int) class524.field7655 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4204[field4205++] = (int) class508.field7354 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class334.method2122((byte) -7);
                return;
            }
            if (arg0 == 5508) {
                class182.method1262(-16);
                return;
            }
            if (arg0 == 5509) {
                class335.method2125(11970);
                return;
            }
            if (arg0 == 5510) {
                class360.method2234(122);
                return;
            }
            if (arg0 == 5511) {
                int var182 = field4204[--field4205];
                int var183 = var182 >> 14 & 0x3FFF;
                int var184 = var182 & 0x3FFF;
                int var185 = var183 - class82.field1315;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class69.field1139) {
                    var185 = class69.field1139;
                }
                int var186 = var184 - class501.field7240;
                if (var186 < 0) {
                    var186 = 0;
                } else if (var186 >= class255.field3763) {
                    var186 = class255.field3763;
                }
                class385.field5502 = (var185 << 7) + 64;
                class279.field4147 = (var186 << 7) + 64;
                class294.field4381 = 4;
                return;
            }
            if (arg0 == 5512) {
                class190.method1297((byte) 70);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4196 -= 2;
                String var187 = field4185[field4196];
                String var188 = field4185[field4196 + 1];
                int var189 = field4204[--field4205];
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    class339.field5024 = var187;
                    class18.field206 = var188;
                    class84.field1337 = var189;
                    class170.method1206(1, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class263.method1702(-28448);
                return;
            }
            if (arg0 == 5602) {
                if (class193.field2807 == 0) {
                    class208.field3161 = -2;
                    class252.field3741 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4205 -= 4;
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    class276.method1779(field4204[field4205 + 3], field4204[field4205], field4204[field4205 + 1], -79, field4204[field4205 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4196--;
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    class477.method2822(-17585, class512.method2995(field4185[field4196], 0));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4196 -= 2;
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    class253.method1633(field4185[field4196 + 1], (byte) -22, false, class512.method2995(field4185[field4196], 0));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class329.field4840 == 0) {
                    class513.field7457 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4204[field4205++] = class252.field3741;
                return;
            }
            if (arg0 == 5608) {
                field4204[field4205++] = class482.field6999;
                return;
            }
            if (arg0 == 5609) {
                field4204[field4205++] = class513.field7457;
                return;
            }
            if (arg0 == 5610) {
                for (int var190 = 0; var190 < 5; var190++) {
                    field4185[field4196++] = class531.field7841.length > var190 ? class222.method1508(-1, class531.field7841[var190]) : "";
                }
                class531.field7841 = null;
                return;
            }
            if (arg0 == 5611) {
                field4204[field4205++] = class25.field355;
                return;
            }
            if (arg0 == 5612) {
                int var191 = field4204[--field4205];
                if (class37.field799 != 6) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    if (class410.field5802 != null) {
                        class410.field5802.method1291(true);
                        class410.field5802 = null;
                    }
                    class84.field1337 = var191;
                    class170.method1206(1, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4204[field4205++] = class252.field3741;
                return;
            }
            if (arg0 == 5615) {
                field4196 -= 2;
                String var192 = field4185[field4196];
                String var193 = field4185[field4196 + 1];
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    if (class410.field5802 != null) {
                        class410.field5802.method1291(true);
                        class410.field5802 = null;
                    }
                    class339.field5024 = var192;
                    class18.field206 = var193;
                    class170.method1206(1, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class391.method2358(false, -126);
                return;
            }
            if (arg0 == 5617) {
                field4204[field4205++] = class208.field3161;
                return;
            }
            if (arg0 == 5618) {
                int var194 = field4204[--field4205];
                class132.method969((byte) 127, var194, false);
                return;
            }
            if (arg0 == 5619) {
                int var195 = field4204[--field4205];
                class132.method969((byte) 123, var195, true);
                return;
            }
            if (arg0 == 5620) {
                class415.method2484(true);
                if (class315.field4692 != "" && class315.field4692 != "") {
                    field4204[field4205++] = 1;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4196 -= 2;
                if (class37.field799 != 2) {
                    return;
                }
                if (class193.field2807 == 0 && class329.field4840 == 0) {
                    class253.method1633(field4185[field4196 + 1], (byte) -22, true, class512.method2995(field4185[field4196], 0));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class81 var196 = class280.field4173.method2463(false, "3", false);
                while (var196.field1314 == 0) {
                    class477.method2826(1L, 0);
                }
                if (var196.field1314 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class536 var197 = (class536) var196.field1311;
                if (var197.method3164(false).exists()) {
                    class519 var198 = new class519(50);
                    try {
                        var197.method3163(var198.field7545, 50, 0, 0);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var197.method3165(-7527);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var199 = field4204[--field4205];
                if (var199 < 1) {
                    var199 = 1;
                }
                if (var199 > 4) {
                    var199 = 4;
                }
                class220.field3371.field2566 = var199;
                class519.method3046(-58);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6002) {
                class220.field3371.method1043((byte) 122, field4204[--field4205] == 1);
                class519.method3046(-101);
                class311.method1975(255);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6003) {
                class220.field3371.field2590 = field4204[--field4205] == 1;
                class311.method1975(255);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6005) {
                class220.field3371.field2577 = field4204[--field4205] == 1;
                class519.method3046(-101);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6006) {
                class220.field3371.field2585 = field4204[--field4205] == 1;
                class76.field1256.method265(!class220.field3371.field2585);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6007) {
                class220.field3371.field2574 = field4204[--field4205];
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6008) {
                class220.field3371.field2579 = field4204[--field4205] == 1;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6009) {
                class220.field3371.field2582 = field4204[--field4205] == 1;
                class519.method3046(-69);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6010) {
                class220.field3371.field2562 = field4204[--field4205] == 1;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6011) {
                int var200 = field4204[--field4205];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class220.field3371.method1212(false, var200, class74.field1211);
                class519.method3046(-63);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6012) {
                class220.field3371.method1214((byte) 113, class74.field1211, field4204[--field4205] == 1);
                class305.method1949((byte) 51);
                class199.method1355(false);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6014) {
                class220.field3371.field2567 = field4204[--field4205] == 1;
                class519.method3046(-109);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6015) {
                class220.field3371.field2571 = field4204[--field4205] == 1;
                class519.method3046(-63);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6016) {
                int var201 = field4204[--field4205];
                if (var201 < 0 || var201 > 2) {
                    var201 = 0;
                }
                class220.field3371.field2576 = var201;
                class322.method2063(class74.field1211, -127);
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6017) {
                class220.field3371.field2587 = field4204[--field4205] == 1;
                class156.method1096(-16674);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6018) {
                int var202 = field4204[--field4205];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 127) {
                    var202 = 127;
                }
                class220.field3371.field2549 = var202;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6019) {
                int var203 = field4204[--field4205];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 255) {
                    var203 = 255;
                }
                if (class220.field3371.field2569 != var203) {
                    if (class220.field3371.field2569 == 0 && class441.field6285 != -1) {
                        class445.method2628(var203, class441.field6285, false, class425.field6000, 10000, 0);
                        class75.field1240 = false;
                    } else if (var203 == 0) {
                        class219.method1486(0);
                        class75.field1240 = false;
                    } else {
                        class484.method2854(var203, (byte) -113);
                    }
                    class220.field3371.field2569 = var203;
                }
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6020) {
                int var204 = field4204[--field4205];
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 127) {
                    var204 = 127;
                }
                class220.field3371.field2550 = var204;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6021) {
                class220.field3371.field2279 = field4204[--field4205] == 1;
                class311.method1975(255);
                return;
            }
            if (arg0 == 6023) {
                int var205 = field4204[--field4205];
                boolean var206 = false;
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 2) {
                    var205 = 2;
                }
                if (class414.field5859 < 96) {
                    var205 = 0;
                    var206 = true;
                }
                class179.method1248(-80, var205);
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                field4204[field4205++] = var206 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var207 = field4204[--field4205];
                if (var207 < 0 || var207 > 2) {
                    var207 = 0;
                }
                class220.field3371.field2563 = var207;
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6025) {
                int var208 = field4204[--field4205];
                if (var208 < 0 || var208 > class475.method2818(0, class414.field5859)) {
                    var208 = 0;
                }
                class220.field3371.field2564 = var208;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6027) {
                int var209 = field4204[--field4205];
                if (var209 < 0 || var209 > 1) {
                    var209 = 0;
                }
                class390.method2353((byte) 46, var209 == 1);
                return;
            }
            if (arg0 == 6028) {
                class220.field3371.field2581 = field4204[--field4205] != 0;
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6029) {
                class220.field3371.field2574 = field4204[--field4205];
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6030) {
                class220.field3371.field2586 = field4204[--field4205] != 0;
                class220.field3371.method1044(1, class280.field4173);
                class519.method3046(-84);
                return;
            }
            if (arg0 == 6031) {
                int var210 = field4204[--field4205];
                if (var210 < 0 || var210 > 3) {
                    var210 = 2;
                }
                class322.method2063(var210, 16);
                return;
            }
            if (arg0 == 6032) {
                int var211 = field4204[--field4205];
                if (var211 < 0 || var211 > 3) {
                    var211 = 2;
                }
                class220.field3371.field2553 = var211;
                class220.field3371.method1044(1, class280.field4173);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6033) {
                int var212 = field4204[--field4205];
                if (var212 < 0 || var212 > 4) {
                    var212 = 2;
                }
                class220.field3371.field2561 = var212;
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6034) {
                class220.field3371.field2583 = field4204[--field4205] == 1;
                class220.field3371.method1044(1, class280.field4173);
                class305.method1949((byte) 51);
                class132.field2068 = false;
                return;
            }
            if (arg0 == 6035) {
                class220.field3371.field2285 = field4204[--field4205] == 1;
                class519.method3046(-61);
                class311.method1975(255);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4204[field4205++] = class220.field3371.field2566;
                return;
            }
            if (arg0 == 6102) {
                field4204[field4205++] = class220.field3371.method1045(class74.field1211, -1) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4204[field4205++] = class220.field3371.field2590 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4204[field4205++] = class220.field3371.field2577 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4204[field4205++] = class220.field3371.field2585 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4204[field4205++] = class220.field3371.field2574;
                return;
            }
            if (arg0 == 6108) {
                field4204[field4205++] = class220.field3371.field2579 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4204[field4205++] = class220.field3371.field2582 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4204[field4205++] = class220.field3371.field2562 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4204[field4205++] = class220.field3371.method1213((byte) -35, class74.field1211);
                return;
            }
            if (arg0 == 6112) {
                field4204[field4205++] = class220.field3371.method1215(class74.field1211, -4) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4204[field4205++] = class220.field3371.field2567 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4204[field4205++] = class220.field3371.field2571 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4204[field4205++] = class220.field3371.field2576;
                return;
            }
            if (arg0 == 6117) {
                field4204[field4205++] = class220.field3371.field2587 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4204[field4205++] = class220.field3371.field2549;
                return;
            }
            if (arg0 == 6119) {
                field4204[field4205++] = class220.field3371.field2569;
                return;
            }
            if (arg0 == 6120) {
                field4204[field4205++] = class220.field3371.field2550;
                return;
            }
            if (arg0 == 6121) {
                field4204[field4205++] = class76.field1256.method318() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4204[field4205++] = class501.method2925(-44);
                return;
            }
            if (arg0 == 6124) {
                field4204[field4205++] = class220.field3371.field2563;
                return;
            }
            if (arg0 == 6125) {
                field4204[field4205++] = class220.field3371.field2564;
                return;
            }
            if (arg0 == 6126) {
                field4204[field4205++] = class76.field1256.method350() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4204[field4205++] = class220.field3371.field2578 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4204[field4205++] = class220.field3371.field2581 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4204[field4205++] = class220.field3371.field2574;
                return;
            }
            if (arg0 == 6130) {
                field4204[field4205++] = class220.field3371.field2586 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4204[field4205++] = class74.field1211;
                return;
            }
            if (arg0 == 6132) {
                field4204[field4205++] = class220.field3371.field2553;
                return;
            }
            if (arg0 == 6133) {
                field4204[field4205++] = class411.field5809 == 1 || class411.field5809 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4204[field4205++] = class475.method2818(0, class414.field5859);
                return;
            }
            if (arg0 == 6135) {
                field4204[field4205++] = class220.field3371.field2561;
                return;
            }
            if (arg0 == 6136) {
                field4204[field4205++] = class220.field3371.field2583 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var213 = true;
                try {
                    var213 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field4204[field4205++] = var213 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4205 -= 2;
                class228.field3428 = (short) field4204[field4205];
                if (class228.field3428 <= 0) {
                    class228.field3428 = 256;
                }
                class511.field7424 = (short) field4204[field4205 + 1];
                if (class511.field7424 <= 0) {
                    class511.field7424 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4205 -= 2;
                class441.field6277 = (short) field4204[field4205];
                if (class441.field6277 <= 0) {
                    class441.field6277 = 256;
                }
                class275.field4111 = (short) field4204[field4205 + 1];
                if (class275.field4111 <= 0) {
                    class275.field4111 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4205 -= 4;
                class121.field1901 = (short) field4204[field4205];
                if (class121.field1901 <= 0) {
                    class121.field1901 = 1;
                }
                class277.field4133 = (short) field4204[field4205 + 1];
                if (class277.field4133 <= 0) {
                    class277.field4133 = 32767;
                } else if (class277.field4133 < class121.field1901) {
                    class277.field4133 = class121.field1901;
                }
                class132.field2060 = (short) field4204[field4205 + 2];
                if (class132.field2060 <= 0) {
                    class132.field2060 = 1;
                }
                class476.field6936 = (short) field4204[field4205 + 3];
                if (class476.field6936 <= 0) {
                    class476.field6936 = 32767;
                    return;
                }
                if (class476.field6936 < class132.field2060) {
                    class476.field6936 = class132.field2060;
                }
                return;
            }
            if (arg0 == 6203) {
                class468.method2777(class496.field7174.field3008, 0, 0, false, class496.field7174.field2988, (byte) -13);
                field4204[field4205++] = class67.field1122;
                field4204[field4205++] = class497.field7205;
                return;
            }
            if (arg0 == 6204) {
                field4204[field4205++] = class441.field6277;
                field4204[field4205++] = class275.field4111;
                return;
            }
            if (arg0 == 6205) {
                field4204[field4205++] = class228.field3428;
                field4204[field4205++] = class511.field7424;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4204[field4205++] = (int) (class165.method1188((byte) 26) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4204[field4205++] = (int) (class165.method1188((byte) 26) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4205 -= 3;
                int var214 = field4204[field4205];
                int var215 = field4204[field4205 + 1];
                int var216 = field4204[field4205 + 2];
                field4186.clear();
                field4186.set(11, 12);
                field4186.set(var216, var215, var214);
                int var217 = (int) (field4186.getTime().getTime() / 86400000L) - 11745;
                if (var216 < 1970) {
                    var217--;
                }
                field4204[field4205++] = var217;
                return;
            }
            if (arg0 == 6303) {
                field4186.clear();
                field4186.setTime(new Date(class165.method1188((byte) 26)));
                field4204[field4205++] = field4186.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var218 = field4204[--field4205];
                boolean var219 = true;
                if (var218 < 0) {
                    var219 = (var218 + 1) % 4 == 0;
                } else if (var218 < 1582) {
                    var219 = var218 % 4 == 0;
                } else if (var218 % 4 != 0) {
                    var219 = false;
                } else if (var218 % 100 != 0) {
                    var219 = true;
                } else if (var218 % 400 != 0) {
                    var219 = false;
                }
                field4204[field4205++] = var219 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4204[field4205++] = class298.method1913(-7959) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4204[field4205++] = class513.method3000(-119) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class37.field799 == 6 && class193.field2807 == 0 && class329.field4840 == 0) {
                    if (class424.field5995) {
                        field4204[field4205++] = 0;
                        return;
                    }
                    if (class297.field4434 > class165.method1188((byte) 26) - 1000L) {
                        field4204[field4205++] = 1;
                        return;
                    }
                    class424.field5995 = true;
                    class228.method1528(true, class208.field3159);
                    class276.field4124.method3019(class247.field3693, 11648);
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class219 var220 = class12.method62(true);
                if (var220 != null) {
                    field4204[field4205++] = var220.field3347;
                    field4204[field4205++] = var220.field1290;
                    field4185[field4196++] = var220.field3346;
                    class383 var221 = var220.method1488(0);
                    field4204[field4205++] = var221.field5489;
                    field4185[field4196++] = var221.field5487;
                    field4204[field4205++] = var220.field1283;
                    field4204[field4205++] = var220.field3345;
                    field4185[field4196++] = var220.field3343;
                    return;
                }
                field4204[field4205++] = -1;
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                return;
            }
            if (arg0 == 6502) {
                class219 var222 = class433.method2564(true);
                if (var222 != null) {
                    field4204[field4205++] = var222.field3347;
                    field4204[field4205++] = var222.field1290;
                    field4185[field4196++] = var222.field3346;
                    class383 var223 = var222.method1488(0);
                    field4204[field4205++] = var223.field5489;
                    field4185[field4196++] = var223.field5487;
                    field4204[field4205++] = var222.field1283;
                    field4204[field4205++] = var222.field3345;
                    field4185[field4196++] = var222.field3343;
                    return;
                }
                field4204[field4205++] = -1;
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var224 = field4204[--field4205];
                String var225 = field4185[--field4196];
                if (class37.field799 == 6 && class193.field2807 == 0 && class329.field4840 == 0) {
                    field4204[field4205++] = class33.method307(var225, var224, false) ? 1 : 0;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class220.field3371.field2560 = field4204[--field4205];
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6505) {
                field4204[field4205++] = class220.field3371.field2560;
                return;
            }
            if (arg0 == 6506) {
                int var226 = field4204[--field4205];
                class219 var227 = class267.method1717(var226, -82);
                if (var227 != null) {
                    field4204[field4205++] = var227.field1290;
                    field4185[field4196++] = var227.field3346;
                    class383 var228 = var227.method1488(0);
                    field4204[field4205++] = var228.field5489;
                    field4185[field4196++] = var228.field5487;
                    field4204[field4205++] = var227.field1283;
                    field4204[field4205++] = var227.field3345;
                    field4185[field4196++] = var227.field3343;
                    return;
                }
                field4204[field4205++] = -1;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                field4204[field4205++] = 0;
                field4204[field4205++] = 0;
                field4185[field4196++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4205 -= 4;
                int var229 = field4204[field4205];
                boolean var230 = field4204[field4205 + 1] == 1;
                int var231 = field4204[field4205 + 2];
                boolean var232 = field4204[field4205 + 3] == 1;
                class396.method2387(var231, var229, -1, var232, var230);
                return;
            }
            if (arg0 == 6508) {
                class195.method1320(-4097);
                return;
            }
            if (arg0 == 6509) {
                if (class37.field799 != 6) {
                    return;
                }
                class95.field1505 = field4204[--field4205] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class220.field3371.field2554 = field4204[--field4205] == 1;
                class220.field3371.method1044(1, class280.field4173);
                return;
            }
            if (arg0 == 6601) {
                field4204[field4205++] = class220.field3371.field2554 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class439.field6252 == class147.field2270) {
            if (arg0 == 6700) {
                int var233 = class220.field3370.method2294((byte) 76);
                if (class188.field2765 != -1) {
                    var233++;
                }
                field4204[field4205++] = var233;
                return;
            }
            if (arg0 == 6701) {
                int var234 = field4204[--field4205];
                if (class188.field2765 != -1) {
                    if (var234 == 0) {
                        field4204[field4205++] = class188.field2765;
                        return;
                    }
                    var234--;
                }
                class541 var235 = (class541) class220.field3370.method2285(41);
                while (var234-- > 0) {
                    var235 = (class541) class220.field3370.method2283((byte) 11);
                }
                field4204[field4205++] = var235.field7955;
                return;
            }
            if (arg0 == 6702) {
                int var236 = field4204[--field4205];
                if (class283.field4217[var236] == null) {
                    field4185[field4196++] = "";
                    return;
                }
                String var237 = class283.field4217[var236][0].field3027;
                if (var237 == null) {
                    field4185[field4196++] = "";
                    return;
                }
                field4185[field4196++] = var237.substring(0, var237.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var238 = field4204[--field4205];
                if (class283.field4217[var238] == null) {
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = class283.field4217[var238].length;
                return;
            }
            if (arg0 == 6704) {
                field4205 -= 2;
                int var239 = field4204[field4205];
                int var240 = field4204[field4205 + 1];
                if (class283.field4217[var239] == null) {
                    field4185[field4196++] = "";
                    return;
                }
                String var241 = class283.field4217[var239][var240].field3027;
                if (var241 == null) {
                    field4185[field4196++] = "";
                    return;
                }
                field4185[field4196++] = var241;
                return;
            }
            if (arg0 == 6705) {
                field4205 -= 2;
                int var242 = field4204[field4205];
                int var243 = field4204[field4205 + 1];
                if (class283.field4217[var242] == null) {
                    field4204[field4205++] = 0;
                    return;
                }
                field4204[field4205++] = class283.field4217[var242][var243].field2896;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4205 -= 3;
                int var244 = field4204[field4205];
                int var245 = field4204[field4205 + 1];
                int var246 = field4204[field4205 + 2];
                class503.method2942(1, 0, var246, var244 << 16 | var245, "");
                return;
            }
            if (arg0 == 6708) {
                field4205 -= 3;
                int var247 = field4204[field4205];
                int var248 = field4204[field4205 + 1];
                int var249 = field4204[field4205 + 2];
                class503.method2942(2, 0, var249, var247 << 16 | var248, "");
                return;
            }
            if (arg0 == 6709) {
                field4205 -= 3;
                int var250 = field4204[field4205];
                int var251 = field4204[field4205 + 1];
                int var252 = field4204[field4205 + 2];
                class503.method2942(3, 0, var252, var250 << 16 | var251, "");
                return;
            }
            if (arg0 == 6710) {
                field4205 -= 3;
                int var253 = field4204[field4205];
                int var254 = field4204[field4205 + 1];
                int var255 = field4204[field4205 + 2];
                class503.method2942(4, 0, var255, var253 << 16 | var254, "");
                return;
            }
            if (arg0 == 6711) {
                field4205 -= 3;
                int var256 = field4204[field4205];
                int var257 = field4204[field4205 + 1];
                int var258 = field4204[field4205 + 2];
                class503.method2942(5, 0, var258, var256 << 16 | var257, "");
                return;
            }
            if (arg0 == 6712) {
                field4205 -= 3;
                int var259 = field4204[field4205];
                int var260 = field4204[field4205 + 1];
                int var261 = field4204[field4205 + 2];
                class503.method2942(6, 0, var261, var259 << 16 | var260, "");
                return;
            }
            if (arg0 == 6713) {
                field4205 -= 3;
                int var262 = field4204[field4205];
                int var263 = field4204[field4205 + 1];
                int var264 = field4204[field4205 + 2];
                class503.method2942(7, 0, var264, var262 << 16 | var263, "");
                return;
            }
            if (arg0 == 6714) {
                field4205 -= 3;
                int var265 = field4204[field4205];
                int var266 = field4204[field4205 + 1];
                int var267 = field4204[field4205 + 2];
                class503.method2942(8, 0, var267, var265 << 16 | var266, "");
                return;
            }
            if (arg0 == 6715) {
                field4205 -= 3;
                int var268 = field4204[field4205];
                int var269 = field4204[field4205 + 1];
                int var270 = field4204[field4205 + 2];
                class503.method2942(9, 0, var270, var268 << 16 | var269, "");
                return;
            }
            if (arg0 == 6716) {
                field4205 -= 3;
                int var271 = field4204[field4205];
                int var272 = field4204[field4205 + 1];
                int var273 = field4204[field4205 + 2];
                class503.method2942(10, 0, var273, var271 << 16 | var272, "");
                return;
            }
            if (arg0 == 6717) {
                field4205 -= 3;
                int var274 = field4204[field4205];
                int var275 = field4204[field4205 + 1];
                int var276 = field4204[field4205 + 2];
                class198 var277 = class539.method3173(var274 << 16 | var275, 2, var276);
                class461.method2735((byte) -106);
                class293 var278 = client.method1395(var277);
                class192.method1308(var278.method1887(-98), -589291614, var277, var278.field4356);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var279 = field4204[--field4205];
                class463 var280 = class506.field7320.method1429(var279, -3708);
                if (var280.field6700 == null) {
                    field4185[field4196++] = "";
                    return;
                }
                field4185[field4196++] = var280.field6700;
                return;
            }
            if (arg0 == 6801) {
                int var281 = field4204[--field4205];
                class463 var282 = class506.field7320.method1429(var281, -3708);
                field4204[field4205++] = var282.field6711;
                return;
            }
            if (arg0 == 6802) {
                int var283 = field4204[--field4205];
                class463 var284 = class506.field7320.method1429(var283, -3708);
                field4204[field4205++] = var284.field6731;
                return;
            }
            if (arg0 == 6803) {
                int var285 = field4204[--field4205];
                class463 var286 = class506.field7320.method1429(var285, -3708);
                field4204[field4205++] = var286.field6712;
                return;
            }
            if (arg0 == 6804) {
                field4205 -= 2;
                int var287 = field4204[field4205];
                int var288 = field4204[field4205 + 1];
                class284 var289 = class510.field7361.method2011(70, var288);
                if (var289.method1830(-116)) {
                    field4185[field4196++] = class506.field7320.method1429(var287, -3708).method2740(var288, var289.field4228, -16289);
                    return;
                }
                field4204[field4205++] = class506.field7320.method1429(var287, -3708).method2745(var289.field4220, var288, 124);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field4204[field4205++] = class10.field88 && !class78.field1274 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field4204[field4205++] = class178.field2648;
                return;
            }
            if (arg0 == 6902) {
                field4204[field4205++] = class75.field1230;
                return;
            }
            if (arg0 == 6903) {
                field4204[field4205++] = class26.field370;
                return;
            }
            if (arg0 == 6904) {
                field4204[field4205++] = class266.field4005;
                return;
            }
            if (arg0 == 6905) {
                String var290 = "";
                if (class415.field5886 != null) {
                    if (class415.field5886.field1311 == null) {
                        var290 = class433.method2563(class415.field5886.field1309, 104);
                    } else {
                        var290 = (String) class415.field5886.field1311;
                    }
                }
                field4185[field4196++] = var290;
                return;
            }
            if (arg0 == 6906) {
                field4204[field4205++] = class415.field5885;
                return;
            }
            if (arg0 == 6907) {
                field4204[field4205++] = class393.field5586;
                return;
            }
            if (arg0 == 6908) {
                field4204[field4205++] = class272.field4087;
                return;
            }
            if (arg0 == 6909) {
                field4204[field4205++] = class408.field5788 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field4204[field4205++] = class123.field1921;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method1811(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4186.setTime(new Date(var1));
        int var3 = field4186.get(5);
        int var4 = field4186.get(2);
        int var5 = field4186.get(1);
        return var3 + "-" + field4209[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(IZ)V")
    private static final void method1812(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4205 -= 3;
                int var2 = field4204[field4205];
                int var3 = field4204[field4205 + 1];
                int var4 = field4204[field4205 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class198 var5 = class154.method1087(var2, 2);
                if (var5.field3013 == null) {
                    var5.field3013 = new class198[var4 + 1];
                }
                if (var5.field3013.length <= var4) {
                    class198[] var6 = new class198[var4 + 1];
                    for (int var7 = 0; var7 < var5.field3013.length; var7++) {
                        var6[var7] = var5.field3013[var7];
                    }
                    var5.field3013 = var6;
                }
                if (var4 > 0 && var5.field3013[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class198 var8 = new class198();
                var8.field2941 = var3;
                var8.field3033 = var8.field3016 = var5.field3016;
                var8.field2969 = var4;
                var5.field3013[var4] = var8;
                if (arg1) {
                    field4182 = var8;
                } else {
                    field4192 = var8;
                }
                class284.method1832(-17067, var5);
                return;
            }
            if (arg0 == 101) {
                class198 var9 = arg1 ? field4182 : field4192;
                if (var9.field2969 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class198 var10 = class154.method1087(var9.field3016, 2);
                var10.field3013[var9.field2969] = null;
                class284.method1832(-17067, var10);
                return;
            }
            if (arg0 == 102) {
                class198 var11 = class154.method1087(field4204[--field4205], 2);
                var11.field3013 = null;
                class284.method1832(-17067, var11);
                return;
            }
            if (arg0 == 200) {
                field4205 -= 2;
                int var12 = field4204[field4205];
                int var13 = field4204[field4205 + 1];
                class198 var14 = class539.method3173(var12, 2, var13);
                if (var14 != null && var13 != -1) {
                    field4204[field4205++] = 1;
                    if (arg1) {
                        field4182 = var14;
                        return;
                    }
                    field4192 = var14;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4204[--field4205];
                class198 var16 = class154.method1087(var15, 2);
                if (var16 != null) {
                    field4204[field4205++] = 1;
                    if (arg1) {
                        field4182 = var16;
                        return;
                    }
                    field4192 = var16;
                    return;
                }
                field4204[field4205++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4204[--field4205];
                method1814(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4204[--field4205];
                method1808(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4205 -= 2;
                int var19 = field4204[field4205];
                int var20 = field4204[field4205 + 1];
                for (int var21 = 0; var21 < class412.field5838.length; var21++) {
                    if (class412.field5838[var21] == var19) {
                        class364.field5293.field7403.method492(class303.field4490, var21, var20, (byte) -110);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class78.field1276.length; var22++) {
                    if (class78.field1276[var22] == var19) {
                        class364.field5293.field7403.method492(class303.field4490, var22, var20, (byte) -110);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4205 -= 2;
                int var23 = field4204[field4205];
                int var24 = field4204[field4205 + 1];
                class364.field5293.field7403.method494(var24, false, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4204[--field4205] != 0;
                class364.field5293.field7403.method496((byte) 88, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class198 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class154.method1087(field4204[--field4205], 2);
            } else {
                var26 = arg1 ? field4182 : field4192;
            }
            if (arg0 == 1000) {
                field4205 -= 4;
                var26.field3036 = field4204[field4205];
                var26.field3022 = field4204[field4205 + 1];
                int var27 = field4204[field4205 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4204[field4205 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2912 = (byte) var27;
                var26.field2914 = (byte) var28;
                class284.method1832(-17067, var26);
                class182.method1264(18837, var26);
                if (var26.field2969 == -1) {
                    class350.method2204(11, var26.field3016);
                }
                return;
            }
            if (arg0 == 1001) {
                field4205 -= 4;
                var26.field2983 = field4204[field4205];
                var26.field2922 = field4204[field4205 + 1];
                var26.field2892 = 0;
                var26.field2994 = 0;
                int var29 = field4204[field4205 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4204[field4205 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2917 = (byte) var29;
                var26.field3025 = (byte) var30;
                class284.method1832(-17067, var26);
                class182.method1264(18837, var26);
                if (var26.field2941 == 0) {
                    class518.method3011(var26, -100, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4204[--field4205] == 1;
                if (var26.field2977 != var31) {
                    var26.field2977 = var31;
                    class284.method1832(-17067, var26);
                }
                if (var26.field2969 == -1) {
                    class519.method3074(0, var26.field3016);
                }
                return;
            }
            if (arg0 == 1004) {
                field4205 -= 2;
                var26.field3046 = field4204[field4205];
                var26.field2973 = field4204[field4205 + 1];
                class284.method1832(-17067, var26);
                class182.method1264(18837, var26);
                if (var26.field2941 == 0) {
                    class518.method3011(var26, -126, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field3047 = field4204[--field4205] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class198 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class154.method1087(field4204[--field4205], 2);
            } else {
                var32 = arg1 ? field4182 : field4192;
            }
            if (arg0 == 1100) {
                field4205 -= 2;
                var32.field2997 = field4204[field4205];
                if (var32.field2997 > var32.field2889 - var32.field3008) {
                    var32.field2997 = var32.field2889 - var32.field3008;
                }
                if (var32.field2997 < 0) {
                    var32.field2997 = 0;
                }
                var32.field2898 = field4204[field4205 + 1];
                if (var32.field2898 > var32.field3045 - var32.field2988) {
                    var32.field2898 = var32.field3045 - var32.field2988;
                }
                if (var32.field2898 < 0) {
                    var32.field2898 = 0;
                }
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class161.method1174(var32.field3016, (byte) -122);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2967 = field4204[--field4205];
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class95.method726((byte) -98, var32.field3016);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2964 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field2888 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field3003 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4204[--field4205];
                if (var32.field2970 != var33) {
                    var32.field2970 = var33;
                    class284.method1832(-17067, var32);
                }
                if (var32.field2969 == -1) {
                    class316.method1996(4, var32.field3016);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field3050 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field2979 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field2959 = 1;
                var32.field3005 = field4204[--field4205];
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class121.method895(var32.field3016, -1);
                }
                return;
            }
            if (arg0 == 1109) {
                field4205 -= 6;
                var32.field2904 = field4204[field4205];
                var32.field3021 = field4204[field4205 + 1];
                var32.field2948 = field4204[field4205 + 2];
                var32.field2972 = field4204[field4205 + 3];
                var32.field3006 = field4204[field4205 + 4];
                var32.field2906 = field4204[field4205 + 5];
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class395.method2382(var32.field3016, 119);
                    class118.method858(var32.field3016, 10);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4204[--field4205];
                if (var32.field2920 != var34) {
                    var32.field2920 = var34;
                    var32.field2935 = 0;
                    var32.field2900 = 1;
                    var32.field2975 = 0;
                    class284.method1832(-17067, var32);
                }
                if (var32.field2969 == -1) {
                    class453.method2698(var32.field3016, true);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2946 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4185[--field4196];
                if (!var35.equals(var32.field2993)) {
                    var32.field2993 = var35;
                    class284.method1832(-17067, var32);
                }
                if (var32.field2969 == -1) {
                    class5.method12(var32.field3016, (byte) -58);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field3034 = field4204[--field4205];
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class49.method445(19464, var32.field3016);
                }
                return;
            }
            if (arg0 == 1114) {
                field4205 -= 3;
                var32.field2953 = field4204[field4205];
                var32.field3029 = field4204[field4205 + 1];
                var32.field2905 = field4204[field4205 + 2];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field2976 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field2916 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field2910 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field2909 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field3004 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1120) {
                field4205 -= 2;
                var32.field2889 = field4204[field4205];
                var32.field3045 = field4204[field4205 + 1];
                class284.method1832(-17067, var32);
                if (var32.field2941 == 0) {
                    class518.method3011(var32, -106, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field4205 -= 2;
                var32.field2923 = (short) field4204[field4205];
                var32.field2915 = (short) field4204[field4205 + 1];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field3052 = field4204[--field4205] == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field2906 = field4204[--field4205];
                class284.method1832(-17067, var32);
                if (var32.field2969 == -1) {
                    class395.method2382(var32.field3016, 110);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4204[--field4205];
                var32.field2908 = var36 == 1;
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1125) {
                field4205 -= 2;
                var32.field2938 = field4204[field4205];
                var32.field3000 = field4204[field4205 + 1];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field2955 = field4204[--field4205];
                class284.method1832(-17067, var32);
                return;
            }
            if (arg0 == 1127) {
                field4205 -= 2;
                int var37 = field4204[field4205];
                int var38 = field4204[field4205 + 1];
                class284 var39 = class510.field7361.method2011(51, var37);
                if (var39.field4220 != var38) {
                    var32.method1347(-115, var37, var38);
                    return;
                }
                var32.method1344(var37, false);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field4204[--field4205];
                String var41 = field4185[--field4196];
                class284 var42 = class510.field7361.method2011(85, var40);
                if (!var42.field4228.equals(var41)) {
                    var32.method1345(var41, -122761392, var40);
                    return;
                }
                var32.method1344(var40, false);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class198 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class154.method1087(field4204[--field4205], 2);
            } else {
                var43 = arg1 ? field4182 : field4192;
            }
            class284.method1832(-17067, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4205 -= 2;
                int var44 = field4204[field4205];
                int var45 = field4204[field4205 + 1];
                if (var43.field2969 == -1) {
                    class441.method2595(var43.field3016, 9);
                    class395.method2382(var43.field3016, 92);
                    class118.method858(var43.field3016, 10);
                }
                if (var44 == -1) {
                    var43.field2959 = 1;
                    var43.field3005 = -1;
                    var43.field2952 = -1;
                    return;
                }
                var43.field2952 = var44;
                var43.field2961 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2992 = true;
                } else {
                    var43.field2992 = false;
                }
                class116 var46 = class58.field1052.method1646(21708, var44);
                var43.field2948 = var46.field1724;
                var43.field2972 = var46.field1779;
                var43.field3006 = var46.field1732;
                var43.field2904 = var46.field1768;
                var43.field3021 = var46.field1762;
                var43.field2906 = var46.field1734;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field3031 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field3031 = 1;
                } else {
                    var43.field3031 = 2;
                }
                if (var43.field2892 > 0) {
                    var43.field2906 = var43.field2906 * 32 / var43.field2892;
                    return;
                }
                if (var43.field2983 > 0) {
                    var43.field2906 = var43.field2906 * 32 / var43.field2983;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2959 = 2;
                var43.field3005 = field4204[--field4205];
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2959 = 3;
                var43.field3005 = -1;
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2959 = 6;
                var43.field3005 = field4204[--field4205];
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2959 = 5;
                var43.field3005 = field4204[--field4205];
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
            if (arg0 == 1206) {
                field4205 -= 4;
                var43.field3043 = field4204[field4205];
                var43.field2926 = field4204[field4205 + 1];
                var43.field2947 = field4204[field4205 + 2];
                var43.field2927 = field4204[field4205 + 3];
                class284.method1832(-17067, var43);
                return;
            }
            if (arg0 == 1207) {
                field4205 -= 2;
                var43.field3009 = field4204[field4205];
                var43.field2911 = field4204[field4205 + 1];
                class284.method1832(-17067, var43);
                return;
            }
            if (arg0 == 1210) {
                field4205 -= 4;
                var43.field3005 = field4204[field4205];
                var43.field2937 = field4204[field4205 + 1];
                if (field4204[field4205 + 2] == 1) {
                    var43.field2959 = 9;
                } else {
                    var43.field2959 = 8;
                }
                if (field4204[field4205 + 3] == 1) {
                    var43.field2992 = true;
                } else {
                    var43.field2992 = false;
                }
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2959 = 5;
                var43.field3005 = class497.field7188;
                var43.field2937 = 0;
                if (var43.field2969 == -1) {
                    class121.method895(var43.field3016, -1);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class198 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class154.method1087(field4204[--field4205], 2);
                } else {
                    var58 = arg1 ? field4182 : field4192;
                }
                String var59 = field4185[--field4196];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field4204[--field4205];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field4204[--field4205];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field4185[--field4196];
                    } else {
                        var62[var63] = Integer.valueOf(field4204[--field4205]);
                    }
                }
                int var64 = field4204[--field4205];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field2893 = var62;
                } else if (arg0 == 1401) {
                    var58.field2960 = var62;
                } else if (arg0 == 1402) {
                    var58.field2991 = var62;
                } else if (arg0 == 1403) {
                    var58.field2885 = var62;
                } else if (arg0 == 1404) {
                    var58.field2965 = var62;
                } else if (arg0 == 1405) {
                    var58.field2930 = var62;
                } else if (arg0 == 1406) {
                    var58.field2887 = var62;
                } else if (arg0 == 1407) {
                    var58.field3007 = var62;
                    var58.field2929 = var60;
                } else if (arg0 == 1408) {
                    var58.field2897 = var62;
                } else if (arg0 == 1409) {
                    var58.field3020 = var62;
                } else if (arg0 == 1410) {
                    var58.field2958 = var62;
                } else if (arg0 == 1411) {
                    var58.field3010 = var62;
                } else if (arg0 == 1412) {
                    var58.field3049 = var62;
                } else if (arg0 == 1414) {
                    var58.field2944 = var62;
                    var58.field2931 = var60;
                } else if (arg0 == 1415) {
                    var58.field3030 = var62;
                    var58.field3023 = var60;
                } else if (arg0 == 1416) {
                    var58.field2982 = var62;
                } else if (arg0 == 1417) {
                    var58.field3018 = var62;
                } else if (arg0 == 1418) {
                    var58.field2985 = var62;
                } else if (arg0 == 1419) {
                    var58.field3038 = var62;
                } else if (arg0 == 1420) {
                    var58.field2928 = var62;
                } else if (arg0 == 1421) {
                    var58.field2902 = var62;
                } else if (arg0 == 1422) {
                    var58.field2903 = var62;
                } else if (arg0 == 1423) {
                    var58.field2950 = var62;
                } else if (arg0 == 1424) {
                    var58.field2942 = var62;
                } else if (arg0 == 1425) {
                    var58.field2971 = var62;
                } else if (arg0 == 1426) {
                    var58.field2984 = var62;
                } else if (arg0 == 1427) {
                    var58.field2951 = var62;
                } else if (arg0 == 1428) {
                    var58.field3024 = var62;
                    var58.field2918 = var60;
                } else if (arg0 == 1429) {
                    var58.field2989 = var62;
                    var58.field3051 = var60;
                } else if (arg0 == 1430) {
                    var58.field3014 = var62;
                }
                var58.field2996 = true;
                return;
            }
            if (arg0 < 1600) {
                class198 var65 = arg1 ? field4182 : field4192;
                if (arg0 == 1500) {
                    field4204[field4205++] = var65.field2924;
                    return;
                }
                if (arg0 == 1501) {
                    field4204[field4205++] = var65.field2957;
                    return;
                }
                if (arg0 == 1502) {
                    field4204[field4205++] = var65.field3008;
                    return;
                }
                if (arg0 == 1503) {
                    field4204[field4205++] = var65.field2988;
                    return;
                }
                if (arg0 == 1504) {
                    field4204[field4205++] = var65.field2977 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4204[field4205++] = var65.field3033;
                    return;
                }
                if (arg0 == 1506) {
                    class198 var66 = class3.method10(var65, (byte) -34);
                    field4204[field4205++] = var66 == null ? -1 : var66.field3016;
                    return;
                }
            } else if (arg0 < 1700) {
                class198 var67 = arg1 ? field4182 : field4192;
                if (arg0 == 1600) {
                    field4204[field4205++] = var67.field2997;
                    return;
                }
                if (arg0 == 1601) {
                    field4204[field4205++] = var67.field2898;
                    return;
                }
                if (arg0 == 1602) {
                    field4185[field4196++] = var67.field2993;
                    return;
                }
                if (arg0 == 1603) {
                    field4204[field4205++] = var67.field2889;
                    return;
                }
                if (arg0 == 1604) {
                    field4204[field4205++] = var67.field3045;
                    return;
                }
                if (arg0 == 1605) {
                    field4204[field4205++] = var67.field2906;
                    return;
                }
                if (arg0 == 1606) {
                    field4204[field4205++] = var67.field2948;
                    return;
                }
                if (arg0 == 1607) {
                    field4204[field4205++] = var67.field3006;
                    return;
                }
                if (arg0 == 1608) {
                    field4204[field4205++] = var67.field2972;
                    return;
                }
                if (arg0 == 1609) {
                    field4204[field4205++] = var67.field2888;
                    return;
                }
                if (arg0 == 1610) {
                    field4204[field4205++] = var67.field2904;
                    return;
                }
                if (arg0 == 1611) {
                    field4204[field4205++] = var67.field3021;
                    return;
                }
                if (arg0 == 1612) {
                    field4204[field4205++] = var67.field2970;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field4204[--field4205];
                    class284 var69 = class510.field7361.method2011(78, var68);
                    if (var69.method1830(-116)) {
                        field4185[field4196++] = var67.method1333(var68, (byte) 82, var69.field4228);
                        return;
                    }
                    field4204[field4205++] = var67.method1336(var69.field4220, var68, (byte) -1);
                    return;
                }
            } else if (arg0 < 1800) {
                class198 var70 = arg1 ? field4182 : field4192;
                if (arg0 == 1700) {
                    field4204[field4205++] = var70.field2952;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field2952 != -1) {
                        field4204[field4205++] = var70.field2961;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4204[field4205++] = var70.field2969;
                    return;
                }
            } else if (arg0 < 1900) {
                class198 var71 = arg1 ? field4182 : field4192;
                if (arg0 == 1800) {
                    field4204[field4205++] = client.method1395(var71).method1887(-99);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field4204[--field4205];
                    int var334 = var72 - 1;
                    if (var71.field2949 != null && var334 < var71.field2949.length && var71.field2949[var334] != null) {
                        field4185[field4196++] = var71.field2949[var334];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field2954 == null) {
                        field4185[field4196++] = "";
                        return;
                    }
                    field4185[field4196++] = var71.field2954;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class198 var332;
                if (arg0 >= 2000) {
                    var332 = class154.method1087(field4204[--field4205], 2);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field4182 : field4192;
                }
                if (field4210 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field2951 == null) {
                        return;
                    }
                    class361 var333 = new class361();
                    var333.field5252 = var332;
                    var333.field5256 = var332.field2951;
                    var333.field5261 = field4210 + 1;
                    class287.field4256.method866((byte) 10, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class198 var73 = class154.method1087(field4204[--field4205], 2);
                if (arg0 == 2500) {
                    field4204[field4205++] = var73.field2924;
                    return;
                }
                if (arg0 == 2501) {
                    field4204[field4205++] = var73.field2957;
                    return;
                }
                if (arg0 == 2502) {
                    field4204[field4205++] = var73.field3008;
                    return;
                }
                if (arg0 == 2503) {
                    field4204[field4205++] = var73.field2988;
                    return;
                }
                if (arg0 == 2504) {
                    field4204[field4205++] = var73.field2977 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4204[field4205++] = var73.field3033;
                    return;
                }
                if (arg0 == 1506) {
                    class198 var74 = class3.method10(var73, (byte) -34);
                    field4204[field4205++] = var74 == null ? -1 : var74.field3016;
                    return;
                }
            } else if (arg0 < 2700) {
                class198 var75 = class154.method1087(field4204[--field4205], 2);
                if (arg0 == 2600) {
                    field4204[field4205++] = var75.field2997;
                    return;
                }
                if (arg0 == 2601) {
                    field4204[field4205++] = var75.field2898;
                    return;
                }
                if (arg0 == 2602) {
                    field4185[field4196++] = var75.field2993;
                    return;
                }
                if (arg0 == 2603) {
                    field4204[field4205++] = var75.field2889;
                    return;
                }
                if (arg0 == 2604) {
                    field4204[field4205++] = var75.field3045;
                    return;
                }
                if (arg0 == 2605) {
                    field4204[field4205++] = var75.field2906;
                    return;
                }
                if (arg0 == 2606) {
                    field4204[field4205++] = var75.field2948;
                    return;
                }
                if (arg0 == 2607) {
                    field4204[field4205++] = var75.field3006;
                    return;
                }
                if (arg0 == 2608) {
                    field4204[field4205++] = var75.field2972;
                    return;
                }
                if (arg0 == 2609) {
                    field4204[field4205++] = var75.field2888;
                    return;
                }
                if (arg0 == 2610) {
                    field4204[field4205++] = var75.field2904;
                    return;
                }
                if (arg0 == 2611) {
                    field4204[field4205++] = var75.field3021;
                    return;
                }
                if (arg0 == 2612) {
                    field4204[field4205++] = var75.field2970;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class198 var76 = class154.method1087(field4204[--field4205], 2);
                    field4204[field4205++] = var76.field2952;
                    return;
                }
                if (arg0 == 2701) {
                    class198 var77 = class154.method1087(field4204[--field4205], 2);
                    if (var77.field2952 != -1) {
                        field4204[field4205++] = var77.field2961;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field4204[--field4205];
                    class541 var79 = (class541) class220.field3370.method2284(true, (long) var78);
                    if (var79 != null) {
                        field4204[field4205++] = 1;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class198 var80 = class154.method1087(field4204[--field4205], 2);
                    if (var80.field3013 == null) {
                        field4204[field4205++] = 0;
                        return;
                    }
                    int var81 = var80.field3013.length;
                    for (int var82 = 0; var82 < var80.field3013.length; var82++) {
                        if (var80.field3013[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field4204[field4205++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4205 -= 2;
                    int var83 = field4204[field4205];
                    int var84 = field4204[field4205 + 1];
                    class541 var85 = (class541) class220.field3370.method2284(true, (long) var83);
                    if (var85 != null && var85.field7955 == var84) {
                        field4204[field4205++] = 1;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class198 var86 = class154.method1087(field4204[--field4205], 2);
                if (arg0 == 2800) {
                    field4204[field4205++] = client.method1395(var86).method1887(-94);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field4204[--field4205];
                    int var335 = var87 - 1;
                    if (var86.field2949 != null && var335 < var86.field2949.length && var86.field2949[var335] != null) {
                        field4185[field4196++] = var86.field2949[var335];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field2954 == null) {
                        field4185[field4196++] = "";
                        return;
                    }
                    field4185[field4196++] = var86.field2954;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field4185[--field4196];
                    class171.method1208((byte) -115, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field4205 -= 2;
                    class483.method2849(field4204[field4205], class364.field5293, field4204[field4205 + 1], (byte) -109);
                    return;
                }
                if (arg0 == 3103) {
                    class483.method2852(0, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field4185[--field4196];
                    int var90 = 0;
                    if (class238.method1577(var89, 10)) {
                        var90 = class292.method1880(117, var89);
                    }
                    field4194++;
                    class228.method1528(true, class514.field7464);
                    class276.field4124.method3019(var90, 11648);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field4185[--field4196];
                    field4198++;
                    class228.method1528(true, class13.field143);
                    class276.field4124.method3048(-2034159384, var91.length() + 1);
                    class276.field4124.method3057((byte) -28, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field4185[--field4196];
                    field4188++;
                    class228.method1528(true, class319.field4737);
                    class276.field4124.method3048(-2034159384, var92.length() + 1);
                    class276.field4124.method3057((byte) -28, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field4204[--field4205];
                    String var94 = field4185[--field4196];
                    class341.method2160(0, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field4205 -= 3;
                    int var95 = field4204[field4205];
                    int var96 = field4204[field4205 + 1];
                    int var97 = field4204[field4205 + 2];
                    class198 var98 = class154.method1087(var97, 2);
                    class306.method1952(var96, (byte) -113, var95, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field4205 -= 2;
                    int var99 = field4204[field4205];
                    int var100 = field4204[field4205 + 1];
                    class198 var101 = arg1 ? field4182 : field4192;
                    class306.method1952(var100, (byte) -113, var99, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field4204[--field4205];
                    field4191++;
                    class228.method1528(true, class177.field2639);
                    class276.field4124.method3016(var102, -36);
                    return;
                }
                if (arg0 == 3111) {
                    field4205 -= 2;
                    int var103 = field4204[field4205];
                    int var104 = field4204[field4205 + 1];
                    class541 var105 = (class541) class220.field3370.method2284(true, (long) var103);
                    if (var105 != null) {
                        class126.method937(true, var105, var105.field7955 != var104, true);
                    }
                    class269.method1740(true, var104, 3, -1, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field4205--;
                    int var106 = field4204[field4205];
                    class541 var107 = (class541) class220.field3370.method2284(true, (long) var106);
                    if (var107 != null && var107.field7956 == 3) {
                        class126.method937(true, var107, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class221.method1500(field4185[--field4196], 32655);
                    return;
                }
                if (arg0 == 3114) {
                    field4205 -= 2;
                    int var108 = field4204[field4205];
                    int var109 = field4204[field4205 + 1];
                    String var110 = field4185[--field4196];
                    class10.method52("", 32, var108, var110, "", var109);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4205 -= 3;
                    class371.method2272(field4204[field4205 + 1], 9832, field4204[field4205], 255, field4204[field4205 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class180.method1250(field4204[--field4205], 255, (byte) -2, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field4205 -= 2;
                    class491.method2876(-103, 255, field4204[field4205 + 1], field4204[field4205]);
                    return;
                }
                if (arg0 == 3203) {
                    field4205 -= 4;
                    class371.method2272(field4204[field4205 + 1], 9832, field4204[field4205], field4204[field4205 + 3], field4204[field4205 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field4205 -= 3;
                    class180.method1250(field4204[field4205], field4204[field4205 + 1], (byte) -2, field4204[field4205 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field4205 -= 3;
                    class491.method2876(107, field4204[field4205 + 2], field4204[field4205 + 1], field4204[field4205]);
                    return;
                }
                if (arg0 == 3206) {
                    field4205 -= 4;
                    class479.method2834(0, field4204[field4205 + 2], field4204[field4205], field4204[field4205 + 1], field4204[field4205 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4204[field4205++] = class24.field349;
                    return;
                }
                if (arg0 == 3301) {
                    field4205 -= 2;
                    int var111 = field4204[field4205];
                    int var112 = field4204[field4205 + 1];
                    field4204[field4205++] = class311.method1979(var111, var112, 70, false);
                    return;
                }
                if (arg0 == 3302) {
                    field4205 -= 2;
                    int var113 = field4204[field4205];
                    int var114 = field4204[field4205 + 1];
                    field4204[field4205++] = class90.method665(true, var114, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field4205 -= 2;
                    int var115 = field4204[field4205];
                    int var116 = field4204[field4205 + 1];
                    field4204[field4205++] = class458.method2723((byte) -57, false, var115, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field4204[--field4205];
                    field4204[field4205++] = class106.field1598.method1666(1407, var117).field2;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field4204[--field4205];
                    field4204[field4205++] = class460.field6663[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field4204[--field4205];
                    field4204[field4205++] = class485.field7034[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field4204[--field4205];
                    field4204[field4205++] = class111.field1641[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class364.field5293.field6956;
                    int var122 = (class364.field5293.field6961 >> 7) + class82.field1315;
                    int var123 = (class364.field5293.field6965 >> 7) + class501.field7240;
                    field4204[field4205++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field4204[--field4205];
                    field4204[field4205++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field4204[--field4205];
                    field4204[field4205++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field4204[--field4205];
                    field4204[field4205++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4204[field4205++] = class258.field3827 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4205 -= 2;
                    int var127 = field4204[field4205];
                    int var128 = field4204[field4205 + 1];
                    field4204[field4205++] = class311.method1979(var127, var128, 105, true);
                    return;
                }
                if (arg0 == 3314) {
                    field4205 -= 2;
                    int var129 = field4204[field4205];
                    int var130 = field4204[field4205 + 1];
                    field4204[field4205++] = class90.method665(true, var130, var129, true);
                    return;
                }
                if (arg0 == 3315) {
                    field4205 -= 2;
                    int var131 = field4204[field4205];
                    int var132 = field4204[field4205 + 1];
                    field4204[field4205++] = class458.method2723((byte) -121, true, var131, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class37.field791 >= 2) {
                        field4204[field4205++] = class37.field791;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4204[field4205++] = class246.field3680;
                    return;
                }
                if (arg0 == 3318) {
                    field4204[field4205++] = class474.field6918.field4020;
                    return;
                }
                if (arg0 == 3321) {
                    field4204[field4205++] = class244.field3648;
                    return;
                }
                if (arg0 == 3322) {
                    field4204[field4205++] = class127.field1991;
                    return;
                }
                if (arg0 == 3323) {
                    if (class412.field5837 >= 5 && class412.field5837 <= 9) {
                        field4204[field4205++] = 1;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class412.field5837 >= 5 && class412.field5837 <= 9) {
                        field4204[field4205++] = class412.field5837;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4204[field4205++] = class92.field1477 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4204[field4205++] = class364.field5293.field7383;
                    return;
                }
                if (arg0 == 3327) {
                    field4204[field4205++] = class364.field5293.field7403.field1037 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4204[field4205++] = class317.field4710 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field4204[--field4205];
                    field4204[field4205++] = class211.method1423(var133, false, (byte) -68);
                    return;
                }
                if (arg0 == 3331) {
                    field4205 -= 2;
                    int var134 = field4204[field4205];
                    int var135 = field4204[field4205 + 1];
                    field4204[field4205++] = class50.method446(0, var135, false, var134, false);
                    return;
                }
                if (arg0 == 3332) {
                    field4205 -= 2;
                    int var136 = field4204[field4205];
                    int var137 = field4204[field4205 + 1];
                    field4204[field4205++] = class50.method446(0, var137, false, var136, true);
                    return;
                }
                if (arg0 == 3333) {
                    field4204[field4205++] = class84.field1337;
                    return;
                }
                if (arg0 == 3335) {
                    field4204[field4205++] = class503.field7255;
                    return;
                }
                if (arg0 == 3336) {
                    field4205 -= 4;
                    int var138 = field4204[field4205];
                    int var139 = field4204[field4205 + 1];
                    int var140 = field4204[field4205 + 2];
                    int var141 = field4204[field4205 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field4204[field4205++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field4204[field4205++] = class446.field6374;
                    return;
                }
                if (arg0 == 3338) {
                    field4204[field4205++] = class146.method1040(-112);
                    return;
                }
                if (arg0 == 3339) {
                    field4204[field4205++] = class363.field5264 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field4204[field4205++] = class111.field1640 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field4204[field4205++] = class14.field165 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4205 -= 2;
                    int var145 = field4204[field4205];
                    int var146 = field4204[field4205 + 1];
                    class333 var147 = class6.field37.method2697(18782, var145);
                    field4185[field4196++] = var147.method2114((byte) -104, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field4205 -= 4;
                    int var148 = field4204[field4205];
                    int var149 = field4204[field4205 + 1];
                    int var150 = field4204[field4205 + 2];
                    int var151 = field4204[field4205 + 3];
                    class333 var152 = class6.field37.method2697(18782, var150);
                    if (var152.field4930 == var148 && var152.field4927 == var149) {
                        if (var149 == 115) {
                            field4185[field4196++] = var152.method2114((byte) -92, var151);
                            return;
                        }
                        field4204[field4205++] = var152.method2117(var151, (byte) 98);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4205 -= 3;
                    int var153 = field4204[field4205];
                    int var154 = field4204[field4205 + 1];
                    int var155 = field4204[field4205 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class333 var156 = class6.field37.method2697(18782, var154);
                    if (var156.field4927 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4204[field4205++] = var156.method2109((byte) 54, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field4204[--field4205];
                    String var158 = field4185[--field4196];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class333 var159 = class6.field37.method2697(18782, var157);
                    if (var159.field4927 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4204[field4205++] = var159.method2110(-23009, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field4204[--field4205];
                    class333 var161 = class6.field37.method2697(18782, var160);
                    field4204[field4205++] = var161.field4937.method2294((byte) 76);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class491.field7085 == 0) {
                        field4204[field4205++] = -2;
                        return;
                    }
                    if (class491.field7085 == 1) {
                        field4204[field4205++] = -1;
                        return;
                    }
                    field4204[field4205++] = class290.field4314;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field4204[--field4205];
                    if (class491.field7085 == 2 && var162 < class290.field4314) {
                        field4185[field4196++] = class163.field2463[var162];
                        if (class397.field5630[var162] != null) {
                            field4185[field4196++] = class397.field5630[var162];
                            return;
                        }
                        field4185[field4196++] = "";
                        return;
                    }
                    field4185[field4196++] = "";
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field4204[--field4205];
                    if (class491.field7085 == 2 && var163 < class290.field4314) {
                        field4204[field4205++] = class292.field4344[var163];
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field4204[--field4205];
                    if (class491.field7085 == 2 && var164 < class290.field4314) {
                        field4204[field4205++] = class418.field5942[var164];
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field4185[--field4196];
                    int var166 = field4204[--field4205];
                    class24.method142(var165, -1, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field4185[--field4196];
                    class59.method503(true, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field4185[--field4196];
                    class494.method2897(var168, 1);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field4185[--field4196];
                    class106.method781(false, var169, 0);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field4185[--field4196];
                    class403.method2411(0, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field4185[--field4196];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field4204[field4205++] = class375.method2288((byte) 121, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field4204[--field4205];
                    if (class491.field7085 == 2 && var172 < class290.field4314) {
                        field4185[field4196++] = class306.field4540[var172];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class524.field7653 != null) {
                        field4185[field4196++] = class222.method1508(-1, class524.field7653);
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class524.field7653 != null) {
                        field4204[field4205++] = class413.field5842;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field4204[--field4205];
                    if (class524.field7653 != null && var173 < class413.field5842) {
                        field4185[field4196++] = class248.field3713[var173].field7035;
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field4204[--field4205];
                    if (class524.field7653 != null && var174 < class413.field5842) {
                        field4204[field4205++] = class248.field3713[var174].field7038;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field4204[--field4205];
                    if (class524.field7653 != null && var175 < class413.field5842) {
                        field4204[field4205++] = class248.field3713[var175].field7045;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4204[field4205++] = class166.field2493;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field4185[--field4196];
                    class3.method9(var176, 123);
                    return;
                }
                if (arg0 == 3618) {
                    field4204[field4205++] = class77.field1262;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field4185[--field4196];
                    class58.method487(-1, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class89.method659(-31202);
                    return;
                }
                if (arg0 == 3621) {
                    if (class491.field7085 == 0) {
                        field4204[field4205++] = -1;
                        return;
                    }
                    field4204[field4205++] = class8.field71;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field4204[--field4205];
                    if (class491.field7085 != 0 && var178 < class8.field71) {
                        field4185[field4196++] = class440.field6273[var178];
                        if (class350.field5133[var178] != null) {
                            field4185[field4196++] = class350.field5133[var178];
                            return;
                        }
                        field4185[field4196++] = "";
                        return;
                    }
                    field4185[field4196++] = "";
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field4185[--field4196];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field4204[field4205++] = class163.method1179(var179, (byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field4204[--field4205];
                    if (class248.field3713 != null && var180 < class413.field5842 && class248.field3713[var180].field7039.equalsIgnoreCase(class364.field5293.field7363)) {
                        field4204[field4205++] = 1;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class478.field6955 != null) {
                        field4185[field4196++] = class478.field6955;
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field4204[--field4205];
                    if (class524.field7653 != null && var181 < class413.field5842) {
                        field4185[field4196++] = class248.field3713[var181].field7042;
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field4204[--field4205];
                    if (class491.field7085 == 2 && var182 >= 0 && var182 < class290.field4314) {
                        field4204[field4205++] = class79.field1291[var182] ? 1 : 0;
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field4185[--field4196];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field4204[field4205++] = class246.method1614(0, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field4204[field4205++] = class245.field3672;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field4185[--field4196];
                    class106.method781(true, var184, 0);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field4204[--field4205];
                    field4204[field4205++] = class313.field4670[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field4204[--field4205];
                    if (class524.field7653 != null && var186 < class413.field5842) {
                        field4185[field4196++] = class248.field3713[var186].field7039;
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field4204[--field4205];
                    if (class491.field7085 != 0 && var187 < class8.field71) {
                        field4185[field4196++] = class277.field4129[var187];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var188].method669(-119);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var189].field1454;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var190].field1448;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var191].field1446;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var192].field1451;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field4204[--field4205];
                    field4204[field4205++] = class49.field914[var193].field1450;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field4204[--field4205];
                    int var195 = class49.field914[var194].method668(false);
                    field4204[field4205++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field4204[--field4205];
                    int var197 = class49.field914[var196].method668(false);
                    field4204[field4205++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field4204[--field4205];
                    int var199 = class49.field914[var198].method668(false);
                    field4204[field4205++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field4204[--field4205];
                    int var201 = class49.field914[var200].method668(false);
                    field4204[field4205++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4205 -= 2;
                    int var202 = field4204[field4205];
                    int var203 = field4204[field4205 + 1];
                    field4204[field4205++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field4205 -= 2;
                    int var204 = field4204[field4205];
                    int var205 = field4204[field4205 + 1];
                    field4204[field4205++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field4205 -= 2;
                    int var206 = field4204[field4205];
                    int var207 = field4204[field4205 + 1];
                    field4204[field4205++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field4205 -= 2;
                    int var208 = field4204[field4205];
                    int var209 = field4204[field4205 + 1];
                    field4204[field4205++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field4204[--field4205];
                    field4204[field4205++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field4204[--field4205];
                    field4204[field4205++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4205 -= 5;
                    int var212 = field4204[field4205];
                    int var213 = field4204[field4205 + 1];
                    int var214 = field4204[field4205 + 2];
                    int var215 = field4204[field4205 + 3];
                    int var216 = field4204[field4205 + 4];
                    field4204[field4205++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field4205 -= 2;
                    long var217 = (long) field4204[field4205];
                    long var219 = (long) field4204[field4205 + 1];
                    field4204[field4205++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field4205 -= 2;
                    int var221 = field4204[field4205];
                    int var222 = field4204[field4205 + 1];
                    field4204[field4205++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field4205 -= 2;
                    int var223 = field4204[field4205];
                    int var224 = field4204[field4205 + 1];
                    field4204[field4205++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4205 -= 2;
                    int var225 = field4204[field4205];
                    int var226 = field4204[field4205 + 1];
                    field4204[field4205++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4205 -= 2;
                    int var227 = field4204[field4205];
                    int var228 = field4204[field4205 + 1];
                    field4204[field4205++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field4205 -= 2;
                    int var229 = field4204[field4205];
                    int var230 = field4204[field4205 + 1];
                    if (var229 == 0) {
                        field4204[field4205++] = 0;
                        return;
                    }
                    field4204[field4205++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field4205 -= 2;
                    int var231 = field4204[field4205];
                    int var232 = field4204[field4205 + 1];
                    if (var231 == 0) {
                        field4204[field4205++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field4204[field4205++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4204[field4205++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field4205 -= 2;
                    int var233 = field4204[field4205];
                    int var234 = field4204[field4205 + 1];
                    field4204[field4205++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field4205 -= 2;
                    int var235 = field4204[field4205];
                    int var236 = field4204[field4205 + 1];
                    field4204[field4205++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field4205 -= 2;
                    int var237 = field4204[field4205];
                    int var238 = field4204[field4205 + 1];
                    field4204[field4205++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field4205 -= 2;
                    int var239 = field4204[field4205];
                    int var240 = field4204[field4205 + 1];
                    field4204[field4205++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field4205 -= 3;
                    long var241 = (long) field4204[field4205];
                    long var243 = (long) field4204[field4205 + 1];
                    long var245 = (long) field4204[field4205 + 2];
                    field4204[field4205++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field4185[--field4196];
                    int var248 = field4204[--field4205];
                    field4185[field4196++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field4196 -= 2;
                    String var249 = field4185[field4196];
                    String var250 = field4185[field4196 + 1];
                    field4185[field4196++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field4185[--field4196];
                    int var252 = field4204[--field4205];
                    field4185[field4196++] = var251 + class56.method478(var252, true, false);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field4185[--field4196];
                    field4185[field4196++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field4185[field4196++] = method1811(field4204[--field4205]);
                    return;
                }
                if (arg0 == 4105) {
                    field4196 -= 2;
                    String var254 = field4185[field4196];
                    String var255 = field4185[field4196 + 1];
                    if (class364.field5293.field7403 != null && class364.field5293.field7403.field1037) {
                        field4185[field4196++] = var255;
                        return;
                    }
                    field4185[field4196++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field4204[--field4205];
                    field4185[field4196++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field4196 -= 2;
                    field4204[field4205++] = class112.method799(field4185[field4196], field4185[field4196 + 1], class503.field7255, -88);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field4185[--field4196];
                    field4205 -= 2;
                    int var258 = field4204[field4205];
                    int var259 = field4204[field4205 + 1];
                    class119 var260 = class159.method1115(class149.field2287, 0, -4, var259);
                    field4204[field4205++] = var260.method874(58, class525.field7661, var258, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field4185[--field4196];
                    field4205 -= 2;
                    int var262 = field4204[field4205];
                    int var263 = field4204[field4205 + 1];
                    class119 var264 = class159.method1115(class149.field2287, 0, -4, var263);
                    field4204[field4205++] = var264.method869(class525.field7661, -115, var262, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field4196 -= 2;
                    String var265 = field4185[field4196];
                    String var266 = field4185[field4196 + 1];
                    if (field4204[--field4205] == 1) {
                        field4185[field4196++] = var265;
                        return;
                    }
                    field4185[field4196++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field4185[--field4196];
                    field4185[field4196++] = class374.method2280(var267, true);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field4185[--field4196];
                    int var269 = field4204[--field4205];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field4185[field4196++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field4204[--field4205];
                    field4204[field4205++] = class294.method1894(55, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field4204[--field4205];
                    field4204[field4205++] = class388.method2345(-60, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field4204[--field4205];
                    field4204[field4205++] = class498.method2917((byte) 44, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field4204[--field4205];
                    field4204[field4205++] = class545.method3199((byte) 76, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field4185[--field4196];
                    if (var274 != null) {
                        field4204[field4205++] = var274.length();
                        return;
                    }
                    field4204[field4205++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field4185[--field4196];
                    field4205 -= 2;
                    int var276 = field4204[field4205];
                    int var277 = field4204[field4205 + 1];
                    field4185[field4196++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field4185[--field4196];
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
                    field4185[field4196++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field4185[--field4196];
                    field4205 -= 2;
                    int var284 = field4204[field4205];
                    int var285 = field4204[field4205 + 1];
                    field4204[field4205++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field4196 -= 2;
                    String var286 = field4185[field4196];
                    String var287 = field4185[field4196 + 1];
                    int var288 = field4204[--field4205];
                    field4204[field4205++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field4204[--field4205];
                    field4204[field4205++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field4204[--field4205];
                    field4204[field4205++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field4204[--field4205] != 0;
                    int var292 = field4204[--field4205];
                    field4185[field4196++] = class261.method1689(125, 0, (long) var292, var291, class503.field7255);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field4185[--field4196];
                    int var294 = field4204[--field4205];
                    class119 var295 = class159.method1115(class149.field2287, 0, -4, var294);
                    field4204[field4205++] = var295.method877(class525.field7661, (byte) -87, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field4204[--field4205];
                    field4185[field4196++] = class58.field1052.method1646(21708, var296).field1780;
                    return;
                }
                if (arg0 == 4201) {
                    field4205 -= 2;
                    int var297 = field4204[field4205];
                    int var298 = field4204[field4205 + 1];
                    class116 var299 = class58.field1052.method1646(21708, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field1788[var298 - 1] != null) {
                        field4185[field4196++] = var299.field1788[var298 - 1];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4205 -= 2;
                    int var300 = field4204[field4205];
                    int var301 = field4204[field4205 + 1];
                    class116 var302 = class58.field1052.method1646(21708, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field1727[var301 - 1] != null) {
                        field4185[field4196++] = var302.field1727[var301 - 1];
                        return;
                    }
                    field4185[field4196++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field4204[--field4205];
                    field4204[field4205++] = class58.field1052.method1646(21708, var303).field1722;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field4204[--field4205];
                    field4204[field4205++] = class58.field1052.method1646(21708, var304).field1742 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field4204[--field4205];
                    class116 var306 = class58.field1052.method1646(21708, var305);
                    if (var306.field1758 == -1 && var306.field1733 >= 0) {
                        field4204[field4205++] = var306.field1733;
                        return;
                    }
                    field4204[field4205++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field4204[--field4205];
                    class116 var308 = class58.field1052.method1646(21708, var307);
                    if (var308.field1758 >= 0 && var308.field1733 >= 0) {
                        field4204[field4205++] = var308.field1733;
                        return;
                    }
                    field4204[field4205++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field4204[--field4205];
                    field4204[field4205++] = class58.field1052.method1646(21708, var309).field1754 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4205 -= 2;
                    int var310 = field4204[field4205];
                    int var311 = field4204[field4205 + 1];
                    class284 var312 = class510.field7361.method2011(56, var311);
                    if (var312.method1830(-116)) {
                        field4185[field4196++] = class58.field1052.method1646(21708, var310).method828(89, var311, var312.field4228);
                        return;
                    }
                    field4204[field4205++] = class58.field1052.method1646(21708, var310).method823(var311, var312.field4220, false);
                    return;
                }
                if (arg0 == 4209) {
                    field4205 -= 2;
                    int var313 = field4204[field4205];
                    int var314 = field4204[field4205 + 1] - 1;
                    class116 var315 = class58.field1052.method1646(21708, var313);
                    if (var315.field1738 == var314) {
                        field4204[field4205++] = var315.field1769;
                        return;
                    }
                    if (var315.field1774 == var314) {
                        field4204[field4205++] = var315.field1795;
                        return;
                    }
                    field4204[field4205++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field4185[--field4196];
                    int var317 = field4204[--field4205];
                    class94.method722(var316, false, var317 == 1);
                    field4204[field4205++] = class27.field385;
                    return;
                }
                if (arg0 == 4211) {
                    if (class86.field1398 != null && class98.field1542 < class27.field385) {
                        field4204[field4205++] = class86.field1398[class98.field1542++] & 0xFFFF;
                        return;
                    }
                    field4204[field4205++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class98.field1542 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4205 -= 2;
                    int var318 = field4204[field4205];
                    int var319 = field4204[field4205 + 1];
                    class284 var320 = class510.field7361.method2011(70, var319);
                    if (var320.method1830(-116)) {
                        field4185[field4196++] = class117.field1812.method2310(-1, var318).method1969(var319, var320.field4228, (byte) 8);
                        return;
                    }
                    field4204[field4205++] = class117.field1812.method2310(-1, var318).method1974((byte) -87, var319, var320.field4220);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4205 -= 2;
                    int var321 = field4204[field4205];
                    int var322 = field4204[field4205 + 1];
                    class284 var323 = class510.field7361.method2011(77, var322);
                    if (var323.method1830(-116)) {
                        field4185[field4196++] = class277.field4139.method569((byte) 98, var321).method1677(var322, 52, var323.field4228);
                        return;
                    }
                    field4204[field4205++] = class277.field4139.method569((byte) 72, var321).method1684(var322, (byte) -114, var323.field4220);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4205 -= 2;
                    int var324 = field4204[field4205];
                    int var325 = field4204[field4205 + 1];
                    class284 var326 = class510.field7361.method2011(51, var325);
                    if (var326.method1830(-116)) {
                        field4185[field4196++] = class88.field1430.method1243((byte) 106, var324).method1657(var325, 0, var326.field4228);
                        return;
                    }
                    field4204[field4205++] = class88.field1430.method1243((byte) 99, var324).method1658((byte) 115, var325, var326.field4220);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field4204[--field4205];
                class236 var328 = class147.field2266.method1253(var327, -1065652600);
                if (var328.field3545 != null && var328.field3545.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field3535[0];
                    for (int var331 = 1; var331 < var328.field3545.length; var331++) {
                        if (var328.field3535[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field3535[var331];
                        }
                    }
                    field4204[field4205++] = var328.field3545[var329];
                    return;
                }
                field4204[field4205++] = var328.field3530;
                return;
            }
        } else {
            class198 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class154.method1087(field4204[--field4205], 2);
            } else {
                var47 = arg1 ? field4182 : field4192;
            }
            if (arg0 == 1300) {
                int var48 = field4204[--field4205] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1351(0, var48, field4185[--field4196]);
                    return;
                } else {
                    field4196--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field4205 -= 2;
                int var49 = field4204[field4205];
                int var50 = field4204[field4205 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2956 = null;
                    return;
                }
                var47.field2956 = class539.method3173(var49, 2, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field4204[--field4205];
                if (class45.field884 != var51 && class477.field6943 != var51 && class26.field371 != var51) {
                    return;
                }
                var47.field2936 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2999 = field4204[--field4205];
                return;
            }
            if (arg0 == 1304) {
                var47.field2933 = field4204[--field4205];
                return;
            }
            if (arg0 == 1305) {
                var47.field2954 = field4185[--field4196];
                return;
            }
            if (arg0 == 1306) {
                var47.field2963 = field4185[--field4196];
                return;
            }
            if (arg0 == 1307) {
                var47.field2949 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2990 = field4204[--field4205];
                var47.field3026 = field4204[--field4205];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field4204[--field4205];
                int var53 = field4204[--field4205];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1346(true, var52, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field3032 = field4185[--field4196];
                return;
            }
            if (arg0 == 1311) {
                var47.field2921 = field4204[--field4205];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field4205 -= 3;
                    var54 = field4204[field4205] - 1;
                    var55 = field4204[field4205 + 1];
                    var56 = field4204[field4205 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4205 -= 2;
                    var54 = 10;
                    var55 = field4204[field4205];
                    var56 = field4204[field4205 + 1];
                }
                if (var47.field2981 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2981 = new byte[11];
                    var47.field2925 = new byte[11];
                    var47.field2980 = new int[11];
                }
                var47.field2981[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2987 = false;
                    for (int var57 = 0; var57 < var47.field2981.length; var57++) {
                        if (var47.field2981[var57] != 0) {
                            var47.field2987 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2987 = true;
                }
                var47.field2925[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2940 = field4204[--field4205];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public static void method1813() {
        field4206 = null;
        field4199 = null;
        field4184 = null;
        field4203 = null;
        field4204 = null;
        field4185 = null;
        field4200 = null;
        field4192 = null;
        field4182 = null;
        field4202 = null;
        field4186 = null;
        field4209 = null;
        field4207 = null;
        field4208 = null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    private static final void method1814(int arg0) {
        class198 var1 = class154.method1087(arg0, 2);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class198[] var3 = class472.field6869[var2];
        if (var3 == null) {
            class198[] var4 = class283.field4217[var2];
            int var5 = var4.length;
            var3 = class472.field6869[var2] = new class198[var5];
            class282.method1820(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class282.method1820(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static final void method1815(int arg0) {
        if (arg0 == -1 || !class175.method1224(arg0, 7607)) {
            return;
        }
        class198[] var1 = class283.field4217[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class198 var3 = var1[var2];
            if (var3.field2995 != null) {
                class361 var4 = new class361();
                var4.field5252 = var3;
                var4.field5256 = var3.field2995;
                method1806(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1816(String arg0, int arg1) {
        if (class37.field791 == 0 && !(!class10.field88 || class78.field1274) || class317.field4710) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class319.field4734.method426(0, 47))) {
            var3 = 0;
            arg0 = arg0.substring(class319.field4734.method426(0, 65).length());
        } else if (var2.startsWith(class424.field5990.method426(0, 73))) {
            var3 = 1;
            arg0 = arg0.substring(class424.field5990.method426(0, 90).length());
        } else if (var2.startsWith(class62.field1084.method426(0, 83))) {
            var3 = 2;
            arg0 = arg0.substring(class62.field1084.method426(0, 56).length());
        } else if (var2.startsWith(class485.field7033.method426(0, 73))) {
            var3 = 3;
            arg0 = arg0.substring(class485.field7033.method426(0, 48).length());
        } else if (var2.startsWith(class389.field5525.method426(0, 92))) {
            var3 = 4;
            arg0 = arg0.substring(class389.field5525.method426(0, 89).length());
        } else if (var2.startsWith(class288.field4269.method426(0, 103))) {
            var3 = 5;
            arg0 = arg0.substring(class288.field4269.method426(0, 63).length());
        } else if (var2.startsWith(class460.field6662.method426(0, 97))) {
            var3 = 6;
            arg0 = arg0.substring(class460.field6662.method426(0, 55).length());
        } else if (var2.startsWith(class10.field89.method426(0, 77))) {
            var3 = 7;
            arg0 = arg0.substring(class10.field89.method426(0, 102).length());
        } else if (var2.startsWith(class476.field6933.method426(0, 75))) {
            var3 = 8;
            arg0 = arg0.substring(class476.field6933.method426(0, 86).length());
        } else if (var2.startsWith(class141.field2175.method426(0, 118))) {
            var3 = 9;
            arg0 = arg0.substring(class141.field2175.method426(0, 70).length());
        } else if (var2.startsWith(class224.field3401.method426(0, 108))) {
            var3 = 10;
            arg0 = arg0.substring(class224.field3401.method426(0, 77).length());
        } else if (var2.startsWith(class171.field2541.method426(0, 125))) {
            var3 = 11;
            arg0 = arg0.substring(class171.field2541.method426(0, 127).length());
        } else if (class503.field7255 != 0) {
            if (var2.startsWith(class319.field4734.method426(class503.field7255, 64))) {
                var3 = 0;
                arg0 = arg0.substring(class319.field4734.method426(class503.field7255, 52).length());
            } else if (var2.startsWith(class424.field5990.method426(class503.field7255, 81))) {
                var3 = 1;
                arg0 = arg0.substring(class424.field5990.method426(class503.field7255, 65).length());
            } else if (var2.startsWith(class62.field1084.method426(class503.field7255, 82))) {
                var3 = 2;
                arg0 = arg0.substring(class62.field1084.method426(class503.field7255, 120).length());
            } else if (var2.startsWith(class485.field7033.method426(class503.field7255, 57))) {
                var3 = 3;
                arg0 = arg0.substring(class485.field7033.method426(class503.field7255, 75).length());
            } else if (var2.startsWith(class389.field5525.method426(class503.field7255, 46))) {
                var3 = 4;
                arg0 = arg0.substring(class389.field5525.method426(class503.field7255, 106).length());
            } else if (var2.startsWith(class288.field4269.method426(class503.field7255, 43))) {
                var3 = 5;
                arg0 = arg0.substring(class288.field4269.method426(class503.field7255, 79).length());
            } else if (var2.startsWith(class460.field6662.method426(class503.field7255, 75))) {
                var3 = 6;
                arg0 = arg0.substring(class460.field6662.method426(class503.field7255, 119).length());
            } else if (var2.startsWith(class10.field89.method426(class503.field7255, 102))) {
                var3 = 7;
                arg0 = arg0.substring(class10.field89.method426(class503.field7255, 106).length());
            } else if (var2.startsWith(class476.field6933.method426(class503.field7255, 47))) {
                var3 = 8;
                arg0 = arg0.substring(class476.field6933.method426(class503.field7255, 71).length());
            } else if (var2.startsWith(class141.field2175.method426(class503.field7255, 70))) {
                var3 = 9;
                arg0 = arg0.substring(class141.field2175.method426(class503.field7255, 117).length());
            } else if (var2.startsWith(class224.field3401.method426(class503.field7255, 61))) {
                var3 = 10;
                arg0 = arg0.substring(class224.field3401.method426(class503.field7255, 92).length());
            } else if (var2.startsWith(class171.field2541.method426(class503.field7255, 94))) {
                var3 = 11;
                arg0 = arg0.substring(class171.field2541.method426(class503.field7255, 123).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class91.field1465.method426(0, 46))) {
            var5 = 1;
            arg0 = arg0.substring(class91.field1465.method426(0, 102).length());
        } else if (var4.startsWith(class285.field4229.method426(0, 48))) {
            var5 = 2;
            arg0 = arg0.substring(class285.field4229.method426(0, 114).length());
        } else if (var4.startsWith(class478.field6963.method426(0, 63))) {
            var5 = 3;
            arg0 = arg0.substring(class478.field6963.method426(0, 72).length());
        } else if (var4.startsWith(class377.field5419.method426(0, 120))) {
            var5 = 4;
            arg0 = arg0.substring(class377.field5419.method426(0, 44).length());
        } else if (var4.startsWith(class540.field7947.method426(0, 88))) {
            var5 = 5;
            arg0 = arg0.substring(class540.field7947.method426(0, 83).length());
        } else if (class503.field7255 != 0) {
            if (var4.startsWith(class91.field1465.method426(class503.field7255, 113))) {
                var5 = 1;
                arg0 = arg0.substring(class91.field1465.method426(class503.field7255, 106).length());
            } else if (var4.startsWith(class285.field4229.method426(class503.field7255, 125))) {
                var5 = 2;
                arg0 = arg0.substring(class285.field4229.method426(class503.field7255, 127).length());
            } else if (var4.startsWith(class478.field6963.method426(class503.field7255, 96))) {
                var5 = 3;
                arg0 = arg0.substring(class478.field6963.method426(class503.field7255, 89).length());
            } else if (var4.startsWith(class377.field5419.method426(class503.field7255, 90))) {
                var5 = 4;
                arg0 = arg0.substring(class377.field5419.method426(class503.field7255, 73).length());
            } else if (var4.startsWith(class540.field7947.method426(class503.field7255, 73))) {
                var5 = 5;
                arg0 = arg0.substring(class540.field7947.method426(class503.field7255, 103).length());
            }
        }
        field4201++;
        class228.method1528(true, class415.field5883);
        class276.field4124.method3048(-2034159384, 0);
        int var6 = class276.field4124.field7558;
        if (arg1 == 5021) {
            class276.field4124.method3048(-2034159384, 1);
        } else if (arg1 == 5022) {
            class276.field4124.method3048(-2034159384, 2);
        } else {
            class276.field4124.method3048(-2034159384, 0);
        }
        class276.field4124.method3048(-2034159384, var3);
        class276.field4124.method3048(-2034159384, var5);
        class336.method2132(arg0, (byte) 107, class276.field4124);
        class276.field4124.method3025(class276.field4124.field7558 - var6, 108);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhu;I)V")
    private static final void method1817(class88 arg0, int arg1) {
        field4205 = 0;
        field4196 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1427;
        int[] var4 = arg0.field1416;
        byte var5 = -1;
        field4193 = 0;
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
                        method1812(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1810(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4204[field4205++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4204[field4205++] = class84.field1335.field4552[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class84.field1335.method1957(var8, (byte) -36, field4204[--field4205]);
                } else if (var43 == 3) {
                    field4185[field4196++] = arg0.field1417[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4205 -= 2;
                    if (field4204[field4205 + 1] != field4204[field4205]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4205 -= 2;
                    if (field4204[field4205 + 1] == field4204[field4205]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4205 -= 2;
                    if (field4204[field4205] < field4204[field4205 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4205 -= 2;
                    if (field4204[field4205] > field4204[field4205 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4193 == 0) {
                        return;
                    }
                    class410 var9 = field4200[--field4193];
                    arg0 = var9.field5798;
                    var3 = arg0.field1427;
                    var4 = arg0.field1416;
                    var2 = var9.field5799;
                    field4206 = var9.field5796;
                    field4199 = var9.field5797;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4204[field4205++] = class84.field1335.method1958(var10, 0);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class84.field1335.method1959(var11, 12674, field4204[--field4205]);
                } else if (var43 == 31) {
                    field4205 -= 2;
                    if (field4204[field4205] <= field4204[field4205 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4205 -= 2;
                    if (field4204[field4205] >= field4204[field4205 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4204[field4205++] = field4206[var4[var2]];
                } else if (var43 == 34) {
                    field4206[var4[var2]] = field4204[--field4205];
                } else if (var43 == 35) {
                    field4185[field4196++] = field4199[var4[var2]];
                } else if (var43 == 36) {
                    field4199[var4[var2]] = field4185[--field4196];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4196 -= var12;
                    String var13 = class37.method392(-2901, field4185, var12, field4196);
                    field4185[field4196++] = var13;
                } else if (var43 == 38) {
                    field4205--;
                } else if (var43 == 39) {
                    field4196--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class88 var15 = class394.method2381((byte) -98, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1415];
                    String[] var17 = new String[var15.field1425];
                    for (int var18 = 0; var18 < var15.field1420; var18++) {
                        var16[var18] = field4204[field4205 + var18 - var15.field1420];
                    }
                    for (int var19 = 0; var19 < var15.field1423; var19++) {
                        var17[var19] = field4185[field4196 + var19 - var15.field1423];
                    }
                    field4205 -= var15.field1420;
                    field4196 -= var15.field1423;
                    class410 var20 = new class410();
                    var20.field5798 = arg0;
                    var20.field5799 = var2;
                    var20.field5796 = field4206;
                    var20.field5797 = field4199;
                    if (field4193 >= field4200.length) {
                        throw new RuntimeException();
                    }
                    field4200[field4193++] = var20;
                    arg0 = var15;
                    var3 = var15.field1427;
                    var4 = var15.field1416;
                    var2 = -1;
                    field4206 = var16;
                    field4199 = var17;
                } else if (var43 == 42) {
                    field4204[field4205++] = class288.field4270[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class288.field4270[var21] = field4204[--field4205];
                    class198.method1350((byte) -36, var21);
                    class84.field1340 |= class388.field5517[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4204[--field4205];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4184[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4203[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4204[--field4205];
                    if (var28 < 0 || var28 >= field4184[var27]) {
                        throw new RuntimeException();
                    }
                    field4204[field4205++] = field4203[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4205 -= 2;
                    int var30 = field4204[field4205];
                    if (var30 < 0 || var30 >= field4184[var29]) {
                        throw new RuntimeException();
                    }
                    field4203[var29][var30] = field4204[field4205 + 1];
                } else if (var43 == 47) {
                    String var31 = class259.field3838[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4185[field4196++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class259.field3838[var32] = field4185[--field4196];
                    class181.method1256(-126, var32);
                } else if (var43 == 51) {
                    class375 var33 = arg0.field1426[var4[var2]];
                    class175 var34 = (class175) var33.method2284(true, (long) field4204[--field4205]);
                    if (var34 != null) {
                        var2 += var34.field2612;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field1424 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field863).append(" ");
                for (int var41 = field4193 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4200[var41].field5798.field863).append(" ");
                }
                var40.append("op: ").append(var5);
                class266.method1710((byte) 81, var42, var40.toString());
            } else {
                class171.method1208((byte) 40, "Clientscript error in: " + arg0.field1424);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field1424).append("\n");
                for (int var38 = field4193 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4200[var38].field5798.field1424).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class266.method1710((byte) 81, var42, var37.toString());
                class329.method2077(-1, var37.toString());
            }
        }
    }
}
