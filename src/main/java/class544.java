import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class544 {

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    private static int field7190 = 0;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "[Lgs;")
    private static class41[] field7202 = new class41[50];

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "[I")
    private static int[] field7200 = new int[5];

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field7206 = new String[1000];

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    private static int field7205 = 0;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "[I")
    private static int[] field7207 = new int[1000];

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    private static int field7211 = 0;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "[[I")
    private static int[][] field7210 = new int[5][5000];

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7209 = Calendar.getInstance();

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[I")
    private static int[] field7212 = new int[3];

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field7213 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "Lmga;")
    public static class666 field7214 = new class666(4);

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    private static int field7215 = 0;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "Lgba;")
    private static class625 field7197;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "Lgba;")
    private static class625 field7208;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lsd;")
    private static class84 field7199;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "[I")
    private static int[] field7191;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field7203;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
    public static void method3005() {
        field7191 = null;
        field7203 = null;
        field7200 = null;
        field7210 = null;
        field7207 = null;
        field7206 = null;
        field7202 = null;
        field7208 = null;
        field7197 = null;
        field7199 = null;
        field7209 = null;
        field7213 = null;
        field7212 = null;
        field7214 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ldm;I)V")
    private static final void method3006(class48 arg0, int arg1) {
        Object[] var2 = arg0.field681;
        int var3 = (Integer) var2[0];
        class529 var4 = class618.method3383(0, var3);
        if (var4 == null) {
            return;
        }
        field7191 = new int[var4.field7045];
        int var5 = 0;
        field7203 = new String[var4.field7052];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field682;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field691;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field692 == null ? -1 : arg0.field692.field8327;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field687;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field692 == null ? -1 : arg0.field692.field8418;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field688 == null ? -1 : arg0.field688.field8327;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field688 == null ? -1 : arg0.field688.field8418;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field689;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field683;
                }
                field7191[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field685;
                }
                field7203[var6++] = var9;
            }
        }
        field7215 = arg0.field679;
        method3012(var4, arg1);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljv;II)V")
    public static final void method3007(class73 arg0, int arg1, int arg2) {
        class529 var3 = class134.method1007(-2038878256, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field7191 = new int[var3.field7045];
        field7203 = new String[var3.field7052];
        if (class250.field3452 == var3.field7054 || class538.field7103 == var3.field7054 || class409.field5527 == var3.field7054) {
            int var4 = 0;
            int var5 = 0;
            if (class155.field2439 != null) {
                var4 = class155.field2439.field8312;
                var5 = class155.field2439.field8317;
            }
            field7191[0] = class164.field2564.method1110((byte) 91) - var4;
            field7191[1] = class164.field2564.method1113(-6387) - var5;
        }
        method3012(var3, 200000);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
    private static final void method3008(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7207[field7211++] = class605.field8022;
                return;
            }
            if (arg0 == 5001) {
                field7211 -= 3;
                class605.field8022 = field7207[field7211];
                class708.field9924 = class599.method3299((byte) 121, field7207[field7211 + 1]);
                if (class708.field9924 == null) {
                    class708.field9924 = class667.field9475;
                }
                class2.field27 = field7207[field7211 + 2];
                field7196++;
                class402 var2 = class390.method2252(class663.field9417, -81, class262.field3644);
                var2.field5354.method1980(-345277664, class605.field8022);
                var2.field5354.method1980(-345277664, class708.field9924.field194);
                var2.field5354.method1980(-345277664, class2.field27);
                class36.method278(0, var2);
                return;
            }
            if (arg0 == 5002) {
                field7190 -= 2;
                String var3 = field7206[field7190];
                String var4 = field7206[field7190 + 1];
                field7211 -= 2;
                int var5 = field7207[field7211];
                int var6 = field7207[field7211 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field7193++;
                class402 var7 = class390.method2252(class502.field6714, -126, class262.field3644);
                var7.field5354.method1980(-345277664, class580.method3186(113, var3) + class580.method3186(125, var4) + 2);
                var7.field5354.method2019(-116, var3);
                var7.field5354.method1980(-345277664, var5 - 1);
                var7.field5354.method1980(-345277664, var6);
                var7.field5354.method2019(-84, var4);
                class36.method278(0, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field7207[--field7211];
                class393 var9 = class27.method235(123, var8);
                String var10 = "";
                if (var9 != null && var9.field5179 != null) {
                    var10 = var9.field5179;
                }
                field7206[field7190++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field7207[--field7211];
                class393 var12 = class27.method235(122, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5186;
                }
                field7207[field7211++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class708.field9924 == null) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = class708.field9924.field194;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field7207[--field7211];
                class402 var15 = class390.method2252(class357.field4837, -126, class262.field3644);
                var15.field5354.method1980(-345277664, var14);
                class36.method278(0, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field7206[--field7190];
                method3010(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7190 -= 2;
                String var17 = field7206[field7190];
                String var18 = field7206[field7190 + 1];
                if (class150.field2398 != 0 || (!class569.field7560 || class674.field9538) && !class261.field3587) {
                    field7198++;
                    class402 var19 = class390.method2252(class84.field1296, -109, class262.field3644);
                    var19.field5354.method1980(-345277664, 0);
                    int var20 = var19.field5354.field4619;
                    var19.field5354.method2019(-87, var17);
                    class10.method125(var19.field5354, (byte) -113, var18);
                    var19.field5354.method2047(var19.field5354.field4619 - var20, 0);
                    class36.method278(0, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field7207[--field7211];
                class393 var22 = class27.method235(126, var21);
                String var23 = "";
                if (var22 != null && var22.field5178 != null) {
                    var23 = var22.field5178;
                }
                field7206[field7190++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field7207[--field7211];
                class393 var25 = class27.method235(124, var24);
                String var26 = "";
                if (var25 != null && var25.field5176 != null) {
                    var26 = var25.field5176;
                }
                field7206[field7190++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field7207[--field7211];
                class393 var28 = class27.method235(127, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5184;
                }
                field7207[field7211++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class199.field2897 == null || class199.field2897.field5378 == null) {
                    var30 = class449.field6163;
                } else {
                    var30 = class199.field2897.method2316(true, (byte) 122);
                }
                field7206[field7190++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field7207[field7211++] = class2.field27;
                return;
            }
            if (arg0 == 5017) {
                field7207[field7211++] = class371.method2182(-119);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field7207[--field7211];
                class393 var32 = class27.method235(127, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5177;
                }
                field7207[field7211++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field7207[--field7211];
                class393 var35 = class27.method235(124, var34);
                String var36 = "";
                if (var35 != null && var35.field5187 != null) {
                    var36 = var35.field5187;
                }
                field7206[field7190++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class199.field2897 == null || class199.field2897.field5378 == null) {
                    var37 = class449.field6163;
                } else {
                    var37 = class199.field2897.method2311(false, 31596);
                }
                field7206[field7190++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field7207[--field7211];
                class393 var39 = class27.method235(119, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5183;
                }
                field7207[field7211++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field7207[--field7211];
                class393 var42 = class27.method235(119, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5180;
                }
                field7207[field7211++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field7207[--field7211];
                class393 var45 = class27.method235(121, var44);
                String var46 = "";
                if (var45 != null && var45.field5185 != null) {
                    var46 = var45.field5185;
                }
                field7206[field7190++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field7207[--field7211];
                field7206[field7190++] = class505.field6747.method1763(32767, var47).field6320;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field7207[--field7211];
                class472 var49 = class505.field6747.method1763(32767, var48);
                if (var49.field6323 == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = var49.field6323.length;
                return;
            }
            if (arg0 == 5052) {
                field7211 -= 2;
                int var50 = field7207[field7211];
                int var51 = field7207[field7211 + 1];
                class472 var52 = class505.field6747.method1763(32767, var50);
                int var53 = var52.field6323[var51];
                field7207[field7211++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field7207[--field7211];
                class472 var55 = class505.field6747.method1763(32767, var54);
                if (var55.field6325 == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = var55.field6325.length;
                return;
            }
            if (arg0 == 5054) {
                field7211 -= 2;
                int var56 = field7207[field7211];
                int var57 = field7207[field7211 + 1];
                field7207[field7211++] = class505.field6747.method1763(32767, var56).field6325[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field7207[--field7211];
                field7206[field7190++] = class29.field478.method3816(var58, true).method255(22773);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field7207[--field7211];
                class31 var60 = class29.field478.method3816(var59, true);
                if (var60.field499 == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = var60.field499.length;
                return;
            }
            if (arg0 == 5057) {
                field7211 -= 2;
                int var61 = field7207[field7211];
                int var62 = field7207[field7211 + 1];
                field7207[field7211++] = class29.field478.method3816(var61, true).field499[var62];
                return;
            }
            if (arg0 == 5058) {
                field7199 = new class84();
                field7199.field1295 = field7207[--field7211];
                field7199.field1290 = class29.field478.method3816(field7199.field1295, true);
                field7199.field1292 = new int[field7199.field1290.method258(0)];
                return;
            }
            if (arg0 == 5059) {
                field7204++;
                class402 var63 = class390.method2252(class58.field833, -80, class262.field3644);
                var63.field5354.method1980(-345277664, 0);
                int var64 = var63.field5354.field4619;
                var63.field5354.method1980(-345277664, 0);
                var63.field5354.method2031((byte) 54, field7199.field1295);
                field7199.field1290.method254((byte) -99, field7199.field1292, var63.field5354);
                var63.field5354.method2047(var63.field5354.field4619 - var64, 0);
                class36.method278(0, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field7206[--field7190];
                field7187++;
                class402 var66 = class390.method2252(class353.field4813, -82, class262.field3644);
                var66.field5354.method1980(-345277664, 0);
                int var67 = var66.field5354.field4619;
                var66.field5354.method2019(-118, var65);
                var66.field5354.method2031((byte) 54, field7199.field1295);
                field7199.field1290.method254((byte) -109, field7199.field1292, var66.field5354);
                var66.field5354.method2047(var66.field5354.field4619 - var67, 0);
                class36.method278(0, var66);
                return;
            }
            if (arg0 == 5061) {
                field7204++;
                class402 var68 = class390.method2252(class58.field833, -128, class262.field3644);
                var68.field5354.method1980(-345277664, 0);
                int var69 = var68.field5354.field4619;
                var68.field5354.method1980(-345277664, 1);
                var68.field5354.method2031((byte) 54, field7199.field1295);
                field7199.field1290.method254((byte) -127, field7199.field1292, var68.field5354);
                var68.field5354.method2047(var68.field5354.field4619 - var69, 0);
                class36.method278(0, var68);
                return;
            }
            if (arg0 == 5062) {
                field7211 -= 2;
                int var70 = field7207[field7211];
                int var71 = field7207[field7211 + 1];
                field7207[field7211++] = class505.field6747.method1763(32767, var70).field6316[var71];
                return;
            }
            if (arg0 == 5063) {
                field7211 -= 2;
                int var72 = field7207[field7211];
                int var73 = field7207[field7211 + 1];
                field7207[field7211++] = class505.field6747.method1763(32767, var72).field6328[var73];
                return;
            }
            if (arg0 == 5064) {
                field7211 -= 2;
                int var74 = field7207[field7211];
                int var75 = field7207[field7211 + 1];
                if (var75 == -1) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = class505.field6747.method1763(32767, var74).method2655((char) var75, -1);
                return;
            }
            if (arg0 == 5065) {
                field7211 -= 2;
                int var76 = field7207[field7211];
                int var77 = field7207[field7211 + 1];
                if (var77 == -1) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = class505.field6747.method1763(32767, var76).method2662((char) var77, (byte) 120);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field7207[--field7211];
                field7207[field7211++] = class29.field478.method3816(var78, true).method258(0);
                return;
            }
            if (arg0 == 5067) {
                field7211 -= 2;
                int var79 = field7207[field7211];
                int var80 = field7207[field7211 + 1];
                int var81 = class29.field478.method3816(var79, true).method253(-1, var80).field7570;
                field7207[field7211++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field7211 -= 2;
                int var82 = field7207[field7211];
                int var83 = field7207[field7211 + 1];
                field7199.field1292[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field7211 -= 2;
                int var84 = field7207[field7211];
                int var85 = field7207[field7211 + 1];
                field7199.field1292[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field7211 -= 3;
                int var86 = field7207[field7211];
                int var87 = field7207[field7211 + 1];
                int var88 = field7207[field7211 + 2];
                class31 var89 = class29.field478.method3816(var86, true);
                if (var89.method253(-1, var87).field7570 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7207[field7211++] = var89.method257(var88, true, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field7206[--field7190];
                boolean var91 = field7207[--field7211] == 1;
                class625.method3419(var90, 100, var91);
                field7207[field7211++] = class506.field6748;
                return;
            }
            if (arg0 == 5072) {
                if (class629.field8484 != null && class425.field5849 < class506.field6748) {
                    field7207[field7211++] = class629.field8484[class425.field5849++] & 0xFFFF;
                    return;
                }
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class425.field5849 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class561.field7444.method3271(86, 0)) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class561.field7444.method3271(82, 0)) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class561.field7444.method3271(81, 0)) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class108.method806(field7207[--field7211], 27557);
                return;
            }
            if (arg0 == 5201) {
                field7207[field7211++] = class651.method3568(1);
                return;
            }
            if (arg0 == 5205) {
                class111.method886(-1, field7207[--field7211], false, 13, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field7207[--field7211];
                class28 var93 = class567.method3124(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = var93.field466;
                return;
            }
            if (arg0 == 5207) {
                class28 var94 = class567.method3123(field7207[--field7211]);
                if (var94 != null && var94.field465 != null) {
                    field7206[field7190++] = var94.field465;
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7207[field7211++] = class34.field532;
                field7207[field7211++] = class227.field3194;
                return;
            }
            if (arg0 == 5209) {
                field7207[field7211++] = class613.field8098 + class567.field7515;
                field7207[field7211++] = class567.field7529 + class180.field2749;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field7207[--field7211];
                class28 var96 = class567.method3123(var95);
                if (var96 == null) {
                    field7207[field7211++] = 0;
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = var96.field456 >> 14 & 0x3FFF;
                field7207[field7211++] = var96.field456 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field7207[--field7211];
                class28 var98 = class567.method3123(var97);
                if (var98 == null) {
                    field7207[field7211++] = 0;
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = var98.field467 - var98.field462;
                field7207[field7211++] = var98.field450 - var98.field461;
                return;
            }
            if (arg0 == 5212) {
                class20 var99 = class506.method2811(false);
                if (var99 == null) {
                    field7207[field7211++] = -1;
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = var99.field317;
                int var100 = var99.field316 << 28 | class567.field7515 + var99.field319 << 14 | class567.field7529 + var99.field324;
                field7207[field7211++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class20 var101 = class97.method751(-5571);
                if (var101 == null) {
                    field7207[field7211++] = -1;
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = var101.field317;
                int var102 = var101.field316 << 28 | class567.field7515 + var101.field319 << 14 | class567.field7529 + var101.field324;
                field7207[field7211++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field7207[--field7211];
                class28 var104 = class620.method3397(false);
                if (var104 != null) {
                    boolean var105 = var104.method245(115, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, field7212, var103 & 0x3FFF);
                    if (var105) {
                        class525.method2934(field7212[2], field7212[1], 0);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7211 -= 2;
                int var106 = field7207[field7211];
                int var107 = field7207[field7211 + 1];
                class620 var108 = class567.method3120(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class28 var110 = (class28) var108.method3390((byte) 103); var110 != null; var110 = (class28) var108.method3401(-10265)) {
                    if (var110.field466 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field7207[--field7211];
                class28 var112 = class567.method3123(var111);
                if (var112 == null) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = var112.field463;
                return;
            }
            if (arg0 == 5220) {
                field7207[field7211++] = class699.field9827 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field7207[--field7211];
                class525.method2934(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, 0);
                return;
            }
            if (arg0 == 5222) {
                class28 var114 = class620.method3397(false);
                if (var114 != null) {
                    boolean var115 = var114.method241(field7212, (byte) 100, class613.field8098 + class567.field7515, class567.field7529 + class180.field2749);
                    if (var115) {
                        field7207[field7211++] = field7212[1];
                        field7207[field7211++] = field7212[2];
                        return;
                    }
                    field7207[field7211++] = -1;
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = -1;
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7211 -= 2;
                int var116 = field7207[field7211];
                int var117 = field7207[field7211 + 1];
                class111.method886(var117 >> 14 & 0x3FFF, var116, false, 13, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field7207[--field7211];
                class28 var119 = class620.method3397(false);
                if (var119 != null) {
                    boolean var120 = var119.method245(101, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, field7212, var118 & 0x3FFF);
                    if (var120) {
                        field7207[field7211++] = field7212[1];
                        field7207[field7211++] = field7212[2];
                        return;
                    }
                    field7207[field7211++] = -1;
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = -1;
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field7207[--field7211];
                class28 var122 = class620.method3397(false);
                if (var122 != null) {
                    boolean var123 = var122.method241(field7212, (byte) 102, var121 >> 14 & 0x3FFF, var121 & 0x3FFF);
                    if (var123) {
                        field7207[field7211++] = field7212[1];
                        field7207[field7211++] = field7212[2];
                        return;
                    }
                    field7207[field7211++] = -1;
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = -1;
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class93.method735((byte) 114, field7207[--field7211]);
                return;
            }
            if (arg0 == 5227) {
                field7211 -= 2;
                int var124 = field7207[field7211];
                int var125 = field7207[field7211 + 1];
                class111.method886(var125 >> 14 & 0x3FFF, var124, true, 13, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class649.field8744 = field7207[--field7211] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7207[field7211++] = class649.field8744 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field7207[--field7211];
                class685.method3812(var126, (byte) 126);
                return;
            }
            if (arg0 == 5231) {
                field7211 -= 2;
                int var127 = field7207[field7211];
                boolean var128 = field7207[field7211 + 1] == 1;
                if (class375.field5058 != null) {
                    class504 var129 = class375.field5058.method2918((long) var127, (byte) 119);
                    if (var129 != null && !var128) {
                        var129.method2797(-127);
                        return;
                    }
                    if (var129 == null && var128) {
                        class504 var130 = new class504();
                        class375.field5058.method2911((long) var127, var130, (byte) -28);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field7207[--field7211];
                if (class375.field5058 != null) {
                    class504 var132 = class375.field5058.method2918((long) var131, (byte) 72);
                    field7207[field7211++] = var132 == null ? 0 : 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7211 -= 2;
                int var133 = field7207[field7211];
                boolean var134 = field7207[field7211 + 1] == 1;
                if (class169.field2612 != null) {
                    class504 var135 = class169.field2612.method2918((long) var133, (byte) -127);
                    if (var135 != null && !var134) {
                        var135.method2797(63);
                        return;
                    }
                    if (var135 == null && var134) {
                        class504 var136 = new class504();
                        class169.field2612.method2911((long) var133, var136, (byte) -28);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field7207[--field7211];
                if (class169.field2612 != null) {
                    class504 var138 = class169.field2612.method2918((long) var137, (byte) 54);
                    field7207[field7211++] = var138 == null ? 0 : 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7207[field7211++] = class567.field7494 == null ? -1 : class567.field7494.field466;
                return;
            }
            if (arg0 == 5236) {
                field7211 -= 2;
                int var139 = field7207[field7211];
                int var140 = field7207[field7211 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class501.method2785(var141, var139, var142, 100);
                if (var143 < 0) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class529.method2952((byte) 100);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7211 -= 2;
                int var144 = field7207[field7211];
                int var145 = field7207[field7211 + 1];
                class212.method1359(3, true, var145, var144, false);
                field7207[field7211++] = class216.field3087 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class216.field3087 != null) {
                    class212.method1359(class344.field4718.field5439, true, -1, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class480[] var146 = class239.method1479(-125);
                field7207[field7211++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field7207[--field7211];
                class480[] var148 = class239.method1479(-127);
                field7207[field7211++] = var148[var147].field6403;
                field7207[field7211++] = var148[var147].field6410;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class344.field4718.field5462;
                int var150 = class344.field4718.field5447;
                int var151 = -1;
                class480[] var152 = class239.method1479(-126);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class480 var154 = var152[var153];
                    if (var154.field6403 == var149 && var154.field6410 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field7207[field7211++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field7207[field7211++] = class662.method3719(-1);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field7207[--field7211];
                if (var155 >= 1 && var155 <= 2) {
                    class212.method1359(var155, true, -1, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7207[field7211++] = class344.field4718.field5439;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field7207[--field7211];
                if (var156 >= 1 && var156 <= 2) {
                    class344.field4718.field5439 = var156;
                    class344.field4718.method1562(119, class688.field9669);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7190 -= 2;
                String var157 = field7206[field7190];
                String var158 = field7206[field7190 + 1];
                int var159 = field7207[--field7211];
                field7195++;
                class402 var160 = class390.method2252(class376.field5071, -98, class262.field3644);
                var160.field5354.method1980(-345277664, class580.method3186(127, var157) + class580.method3186(109, var158) + 1);
                var160.field5354.method2019(-89, var157);
                var160.field5354.method2019(-118, var158);
                var160.field5354.method1980(-345277664, var159);
                class36.method278(0, var160);
                return;
            }
            if (arg0 == 5401) {
                field7211 -= 2;
                class310.field4267[field7207[field7211]] = (short) class290.method1788(field7207[field7211 + 1], 9);
                class193.field2826.method1046((byte) -16);
                class193.field2826.method1040((byte) 43);
                class239.field3369.method287(91);
                class449.method2540((byte) -66);
                return;
            }
            if (arg0 == 5405) {
                field7211 -= 2;
                int var161 = field7207[field7211];
                int var162 = field7207[field7211 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class303.field4207[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7211 -= 7;
                int var163 = field7207[field7211];
                int var164 = field7207[field7211 + 1] << 1;
                int var165 = field7207[field7211 + 2];
                int var166 = field7207[field7211 + 3];
                int var167 = field7207[field7211 + 4];
                int var168 = field7207[field7211 + 5];
                int var169 = field7207[field7211 + 6];
                if (var163 >= 0 && var163 < 2 && class303.field4207[var163] != null && var164 >= 0 && var164 < class303.field4207[var163].length) {
                    class303.field4207[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class303.field4207[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class303.field4207[field7207[--field7211]].length >> 1;
                field7207[field7211++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class216.field3087 != null) {
                    class212.method1359(class344.field4718.field5439, true, -1, -1, false);
                }
                if (class490.field6611 != null) {
                    class177.method1190(0);
                    System.exit(0);
                    return;
                }
                String var171 = class141.field2272 == null ? class233.method1454(true) : class141.field2272;
                class405.method2332(class688.field9669, var171, false, class571.field7587 == 1, (byte) 23);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class243.field3395 != null) {
                    if (class243.field3395.field2820 == null) {
                        var172 = class164.method1128(class243.field3395.field2819, (byte) -78);
                    } else {
                        var172 = (String) class243.field3395.field2820;
                    }
                }
                field7206[field7190++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field7207[field7211++] = class688.field9669.field6915 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class216.field3087 != null) {
                    class212.method1359(class344.field4718.field5439, true, -1, -1, false);
                }
                String var173 = field7206[--field7190];
                boolean var174 = field7207[--field7211] == 1;
                String var175 = class233.method1454(true) + var173;
                class405.method2332(class688.field9669, var175, var174, class571.field7587 == 1, (byte) 23);
                return;
            }
            if (arg0 == 5422) {
                field7190 -= 2;
                String var176 = field7206[field7190];
                String var177 = field7206[field7190 + 1];
                int var178 = field7207[--field7211];
                if (var176.length() > 0) {
                    if (class199.field2885 == null) {
                        class199.field2885 = new String[class256.field3551[class392.field5166.field9508]];
                    }
                    class199.field2885[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class680.field9593 == null) {
                        class680.field9593 = new String[class256.field3551[class392.field5166.field9508]];
                    }
                    class680.field9593[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7206[--field7190]);
                return;
            }
            if (arg0 == 5424) {
                field7211 -= 11;
                class269.field3756 = field7207[field7211];
                class172.field2658 = field7207[field7211 + 1];
                class157.field2485 = field7207[field7211 + 2];
                class1.field7 = field7207[field7211 + 3];
                class70.field1045 = field7207[field7211 + 4];
                class117.field1998 = field7207[field7211 + 5];
                class335.field4656 = field7207[field7211 + 6];
                class677.field9567 = field7207[field7211 + 7];
                class88.field1329 = field7207[field7211 + 8];
                class96.field1460 = field7207[field7211 + 9];
                class73.field1133 = field7207[field7211 + 10];
                class658.field9155.method2549(class70.field1045, 3015);
                class658.field9155.method2549(class117.field1998, 3015);
                class658.field9155.method2549(class335.field4656, 3015);
                class658.field9155.method2549(class677.field9567, 3015);
                class658.field9155.method2549(class88.field1329, 3015);
                class446.field6100 = null;
                class386.field5133 = null;
                class36.field550 = null;
                class360.field4871 = null;
                class58.field813 = null;
                class52.field726 = null;
                class26.field433 = null;
                class439.field6040 = null;
                class664.field9427 = true;
                return;
            }
            if (arg0 == 5425) {
                class312.method1862(5121);
                class664.field9427 = false;
                return;
            }
            if (arg0 == 5426) {
                field7211 -= 2;
                class587.field7786 = field7207[field7211];
                class294.field4165 = field7207[field7211 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7211 -= 2;
                class383.field5116 = field7207[field7211 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7211 -= 2;
                int var179 = field7207[field7211];
                int var180 = field7207[field7211 + 1];
                field7207[field7211++] = class120.method934(var179, var180, (byte) 75) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class375.method2209(87, field7206[--field7190], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class594.method3267("accountcreated", -17670, class486.field6574);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class594.method3267("accountcreatestarted", -17670, class486.field6574);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class636.field8566 != null) {
                    Transferable var182 = class636.field8566.getContents(null);
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
                field7206[field7190++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7211 -= 4;
                int var183 = field7207[field7211];
                int var184 = field7207[field7211 + 1];
                int var185 = field7207[field7211 + 2];
                int var186 = field7207[field7211 + 3];
                class162.method1124(var186, -101, var184 << 2, false, (var183 >> 14 & 0x3FFF) - class473.field6334, var185, (var183 & 0x3FFF) - class233.field3269);
                return;
            }
            if (arg0 == 5501) {
                field7211 -= 4;
                int var187 = field7207[field7211];
                int var188 = field7207[field7211 + 1];
                int var189 = field7207[field7211 + 2];
                int var190 = field7207[field7211 + 3];
                class97.method752((var187 & 0x3FFF) - class233.field3269, (var187 >> 14 & 0x3FFF) - class473.field6334, var190, true, var188 << 2, var189);
                return;
            }
            if (arg0 == 5502) {
                field7211 -= 6;
                int var191 = field7207[field7211];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class143.field2307 = var191;
                int var192 = field7207[field7211 + 1];
                if (var192 + 1 >= class303.field4207[class143.field2307].length >> 1) {
                    throw new RuntimeException();
                }
                class179.field2741 = var192;
                class669.field9499 = 0;
                class705.field9908 = field7207[field7211 + 2];
                class270.field3759 = field7207[field7211 + 3];
                int var193 = field7207[field7211 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class407.field5480 = var193;
                int var194 = field7207[field7211 + 5];
                if (var194 + 1 >= class303.field4207[class407.field5480].length >> 1) {
                    throw new RuntimeException();
                }
                class313.field4300 = var194;
                class140.field2254 = 3;
                class173.field2668 = -1;
                class376.field5068 = -1;
                return;
            }
            if (arg0 == 5503) {
                class561.method3084(-1);
                return;
            }
            if (arg0 == 5504) {
                field7211 -= 2;
                class11.method127(0, 125, field7207[field7211 + 1], field7207[field7211]);
                return;
            }
            if (arg0 == 5505) {
                field7207[field7211++] = (int) class463.field6263 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7207[field7211++] = (int) class42.field602 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class634.method3502((byte) 93);
                return;
            }
            if (arg0 == 5508) {
                class533.method2966((byte) -53);
                return;
            }
            if (arg0 == 5509) {
                class269.method1638(-128);
                return;
            }
            if (arg0 == 5510) {
                class681.method3804(-201);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field7207[--field7211];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class473.field6334;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class34.field530) {
                    var198 = class34.field530;
                }
                int var199 = var197 - class233.field3269;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class34.field531) {
                    var199 = class34.field531;
                }
                class247.field3443 = (var198 << 9) + 256;
                class412.field5654 = (var199 << 9) + 256;
                class140.field2254 = 4;
                class173.field2668 = -1;
                class376.field5068 = -1;
                return;
            }
            if (arg0 == 5512) {
                class262.method1604((byte) 26);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field7207[--field7211];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class473.field6334;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class34.field530) {
                        var203 = class34.field530;
                    }
                    int var204 = var202 - class233.field3269;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class34.field531) {
                        var204 = class34.field531;
                    }
                    class376.field5068 = (var203 << 9) + 256;
                    class173.field2668 = (var204 << 9) + 256;
                    return;
                }
                class376.field5068 = -1;
                class173.field2668 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7190 -= 2;
                String var205 = field7206[field7190];
                String var206 = field7206[field7190 + 1];
                int var207 = field7207[--field7211];
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    class449.field6163 = var205;
                    class509.field6793 = var206;
                    class126.field2096 = var207;
                    class472.method2658(19093, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class65.method520((byte) 44);
                return;
            }
            if (arg0 == 5602) {
                if (class139.field2251 == 0) {
                    class400.field5307 = -2;
                    class347.field4765 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7211 -= 4;
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    class381.method2224(field7207[field7211 + 1], field7207[field7211 + 2], field7207[field7211 + 3], (byte) 109, field7207[field7211]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7190--;
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    class434.method2464((byte) 116, class36.method285(field7206[field7190], (byte) -120));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7190 -= 2;
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    class419.method2396(field7206[field7190 + 1], false, class36.method285(field7206[field7190], (byte) -120), 0);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class639.field8597 == 0) {
                    class623.field8247 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7207[field7211++] = class347.field4765;
                return;
            }
            if (arg0 == 5608) {
                field7207[field7211++] = class625.field8358;
                return;
            }
            if (arg0 == 5609) {
                field7207[field7211++] = class623.field8247;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field7206[field7190++] = class695.field9760 == null || class695.field9760.length <= var208 ? "" : class104.method794(false, class695.field9760[var208]);
                }
                class695.field9760 = null;
                return;
            }
            if (arg0 == 5611) {
                field7207[field7211++] = class371.field5014;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field7207[--field7211];
                if (class32.field525 != 7) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    if (class370.field4996 != null) {
                        class370.field4996.method633(9);
                        class370.field4996 = null;
                    }
                    class126.field2096 = var209;
                    class472.method2658(19093, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7207[field7211++] = class347.field4765;
                return;
            }
            if (arg0 == 5615) {
                field7190 -= 2;
                String var210 = field7206[field7190];
                String var211 = field7206[field7190 + 1];
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    if (class370.field4996 != null) {
                        class370.field4996.method633(9);
                        class370.field4996 = null;
                    }
                    class449.field6163 = var210;
                    class509.field6793 = var211;
                    class472.method2658(19093, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class55.method365((byte) -108, false);
                return;
            }
            if (arg0 == 5617) {
                field7207[field7211++] = class400.field5307;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field7207[--field7211];
                class692.method3840(false, var212, (byte) -118);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field7207[--field7211];
                class692.method3840(true, var213, (byte) -115);
                return;
            }
            if (arg0 == 5620) {
                class408.method2344(26133);
                if (class225.field3174 != "" && class225.field3174 != "") {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7190 -= 2;
                if (class32.field525 != 3) {
                    return;
                }
                if (class139.field2251 == 0 && class639.field8597 == 0) {
                    class419.method2396(field7206[field7190 + 1], true, class36.method285(field7206[field7190], (byte) -120), 0);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class192 var214 = class688.field9669.method2892("3", true, false);
                while (var214.field2816 == 0) {
                    class486.method2722(0, 1L);
                }
                if (var214.field2816 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class488 var215 = (class488) var214.field2820;
                if (var215.method2727((byte) -76).exists()) {
                    class335 var216 = new class335(50);
                    try {
                        var215.method2730(0, var216.field4600, 50, -1);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method2729((byte) -46);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class592.field7831 != null) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field7207[field7211++] = (int) (class440.field6041 >> 32);
                field7207[field7211++] = (int) (class440.field6041 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field7207[--field7211];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class344.field4718.field5453 = var217;
                class366.method2157(80);
                class344.field4718.method1562(-102, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6002) {
                class344.field4718.method1561(field7207[--field7211] == 1, (byte) -86);
                class366.method2157(71);
                class518.method2887(102);
                class344.field4718.method1562(-96, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6003) {
                class344.field4718.field5418 = field7207[--field7211] == 1;
                class518.method2887(-114);
                class344.field4718.method1562(-9, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6005) {
                class344.field4718.field5446 = field7207[--field7211] == 1;
                class366.method2157(108);
                class344.field4718.method1562(97, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6006) {
                class344.field4718.field5420 = field7207[--field7211] == 1;
                class10.field197.method382(!class344.field4718.field5420);
                class344.field4718.method1562(60, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6007) {
                class344.field4718.field5456 = field7207[--field7211];
                class344.field4718.method1562(-111, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6008) {
                class344.field4718.field5427 = field7207[--field7211] == 1;
                class344.field4718.method1562(-97, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6009) {
                class344.field4718.field5415 = field7207[--field7211] == 1;
                class366.method2157(66);
                class344.field4718.method1562(96, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6010) {
                class344.field4718.field5423 = field7207[--field7211] == 1;
                class344.field4718.method1562(-112, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field7207[--field7211];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class344.field4718.method2333(class571.field7587, false, var218);
                class366.method2157(88);
                class344.field4718.method1562(-113, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6012) {
                class344.field4718.method2328(false, field7207[--field7211] == 1, class571.field7587);
                class511.method2842(true);
                class661.method3704(true);
                class344.field4718.method1562(-14, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6014) {
                class344.field4718.field5422 = field7207[--field7211] == 1;
                class366.method2157(106);
                class344.field4718.method1562(-95, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6015) {
                class344.field4718.field5448 = field7207[--field7211] == 1;
                class366.method2157(112);
                class344.field4718.method1562(-127, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field7207[--field7211];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class344.field4718.field5449 = var219;
                class405.method2326(class571.field7587, -86);
                class344.field4718.method1562(12, class688.field9669);
                return;
            }
            if (arg0 == 6017) {
                class344.field4718.field5424 = field7207[--field7211] == 1;
                class699.method3870((byte) -93);
                class344.field4718.method1562(72, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field7207[--field7211];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class344.field4718.field5450 = var220;
                class344.field4718.method1562(68, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field7207[--field7211];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class344.field4718.field5445 != var221) {
                    if (class344.field4718.field5445 == 0 && class416.field5694 != -1) {
                        class39.method299(class416.field5694, var221, 0, false, class603.field8016, true);
                        class137.field2225 = false;
                    } else if (var221 == 0) {
                        class223.method1397(1);
                        class137.field2225 = false;
                    } else {
                        class258.method1581(-1, var221);
                    }
                    class344.field4718.field5445 = var221;
                }
                class344.field4718.method1562(-20, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field7207[--field7211];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class344.field4718.field5414 = var222;
                class344.field4718.method1562(108, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6021) {
                class344.field4718.field3526 = field7207[--field7211] == 1;
                class518.method2887(-99);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field7207[--field7211];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class660.field9362 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class357.method2108(var223, (byte) 67);
                class344.field4718.method1562(-121, class688.field9669);
                class268.field3740 = false;
                field7207[field7211++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field7207[--field7211];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class344.field4718.field5419 = var225;
                class344.field4718.method1562(19, class688.field9669);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field7207[--field7211];
                if (var226 < 0 || var226 > class689.method3829((byte) 127, class660.field9362)) {
                    var226 = 0;
                }
                class344.field4718.field5434 = var226;
                class344.field4718.method1562(49, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field7207[--field7211];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class138.method1017((byte) -125, var227 == 1);
                return;
            }
            if (arg0 == 6028) {
                class344.field4718.field5458 = field7207[--field7211] != 0;
                class344.field4718.method1562(-104, class688.field9669);
                return;
            }
            if (arg0 == 6029) {
                class344.field4718.field5456 = field7207[--field7211];
                class344.field4718.method1562(111, class688.field9669);
                return;
            }
            if (arg0 == 6030) {
                class344.field4718.field5428 = field7207[--field7211] != 0;
                class344.field4718.method1562(-123, class688.field9669);
                class366.method2157(61);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field7207[--field7211];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class405.method2326(var228, -92);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field7207[--field7211];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class344.field4718.field5433 = var229;
                class344.field4718.method1562(-10, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field7207[--field7211];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class344.field4718.field5454 = var230;
                class344.field4718.method1562(-101, class688.field9669);
                return;
            }
            if (arg0 == 6034) {
                class344.field4718.field5459 = field7207[--field7211] == 1;
                class344.field4718.method1562(-100, class688.field9669);
                class511.method2842(true);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6035) {
                class344.field4718.field3511 = field7207[--field7211] == 1;
                class366.method2157(62);
                class518.method2887(121);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field7207[--field7211];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class344.field4718.method1551(var231, -8);
                class344.field4718.method1562(-119, class688.field9669);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field7207[--field7211];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class344.field4718.field5429 = var232;
                class344.field4718.method1562(-102, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field7207[--field7211];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class344.field4718.field5417 != var233 && class416.field5694 == class403.field5384) {
                    if (class344.field4718.field5417 == 0) {
                        class39.method299(class416.field5694, var233, 0, false, class603.field8016, true);
                        class137.field2225 = false;
                    } else if (var233 == 0) {
                        class223.method1397(1);
                        class137.field2225 = false;
                    } else {
                        class258.method1581(-1, var233);
                    }
                }
                class344.field4718.field5417 = var233;
                class344.field4718.method1562(-8, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field7207[--field7211];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class344.field4718.field5438 != var234) {
                    class344.field4718.field5438 = var234;
                    class344.field4718.method1562(-17, class688.field9669);
                    class268.field3740 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7207[field7211++] = class344.field4718.field5453;
                return;
            }
            if (arg0 == 6102) {
                field7207[field7211++] = class344.field4718.method1549(class571.field7587, -73) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7207[field7211++] = class344.field4718.field5418 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7207[field7211++] = class344.field4718.field5446 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7207[field7211++] = class344.field4718.field5420 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7207[field7211++] = class344.field4718.field5456;
                return;
            }
            if (arg0 == 6108) {
                field7207[field7211++] = class344.field4718.field5427 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7207[field7211++] = class344.field4718.field5415 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7207[field7211++] = class344.field4718.field5423 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7207[field7211++] = class344.field4718.method2329(108, class571.field7587);
                return;
            }
            if (arg0 == 6112) {
                field7207[field7211++] = class344.field4718.method2330(-20622, class571.field7587) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7207[field7211++] = class344.field4718.field5422 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7207[field7211++] = class344.field4718.field5448 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7207[field7211++] = class344.field4718.field5449;
                return;
            }
            if (arg0 == 6117) {
                field7207[field7211++] = class344.field4718.field5424 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7207[field7211++] = class344.field4718.field5450;
                return;
            }
            if (arg0 == 6119) {
                field7207[field7211++] = class344.field4718.field5445;
                return;
            }
            if (arg0 == 6120) {
                field7207[field7211++] = class344.field4718.field5414;
                return;
            }
            if (arg0 == 6121) {
                field7207[field7211++] = class10.field197.method456() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7207[field7211++] = class444.method2505(26329);
                return;
            }
            if (arg0 == 6124) {
                field7207[field7211++] = class344.field4718.field5419;
                return;
            }
            if (arg0 == 6125) {
                field7207[field7211++] = class344.field4718.field5434;
                return;
            }
            if (arg0 == 6126) {
                field7207[field7211++] = class10.field197.method431() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7207[field7211++] = class344.field4718.field5416 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7207[field7211++] = class344.field4718.field5458 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7207[field7211++] = class344.field4718.field5456;
                return;
            }
            if (arg0 == 6130) {
                field7207[field7211++] = class344.field4718.field5428 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7207[field7211++] = class571.field7587;
                return;
            }
            if (arg0 == 6132) {
                field7207[field7211++] = class344.field4718.field5433;
                return;
            }
            if (arg0 == 6133) {
                field7207[field7211++] = class688.field9669.field6915 && !class688.field9669.field6917 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7207[field7211++] = class689.method3829((byte) 127, class660.field9362);
                return;
            }
            if (arg0 == 6135) {
                field7207[field7211++] = class344.field4718.field5454;
                return;
            }
            if (arg0 == 6136) {
                field7207[field7211++] = class344.field4718.field5459 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field7207[field7211++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field7207[field7211++] = class457.method2606((byte) -103, 200, class571.field7587);
                return;
            }
            if (arg0 == 6139) {
                field7207[field7211++] = class344.field4718.method1558((byte) 90, class571.field7587);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class517.method2883(class571.field7587, 4) && class660.field9362 < 96) {
                    var236 = 1;
                }
                field7207[field7211++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class660.field9362 < 96) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field7207[field7211++] = class344.field4718.field5429;
                return;
            }
            if (arg0 == 6143) {
                field7207[field7211++] = class344.field4718.field5417;
                return;
            }
            if (arg0 == 6144) {
                field7207[field7211++] = class528.field7043 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field7207[field7211++] = class344.field4718.field5438;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7211 -= 2;
                class526.field7008 = (short) field7207[field7211];
                if (class526.field7008 <= 0) {
                    class526.field7008 = 256;
                }
                class373.field5047 = (short) field7207[field7211 + 1];
                if (class373.field5047 <= 0) {
                    class373.field5047 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7211 -= 2;
                class338.field4679 = (short) field7207[field7211];
                if (class338.field4679 <= 0) {
                    class338.field4679 = 256;
                }
                class193.field2830 = (short) field7207[field7211 + 1];
                if (class193.field2830 <= 0) {
                    class193.field2830 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7211 -= 4;
                class471.field6299 = (short) field7207[field7211];
                if (class471.field6299 <= 0) {
                    class471.field6299 = 1;
                }
                class326.field4509 = (short) field7207[field7211 + 1];
                if (class326.field4509 <= 0) {
                    class326.field4509 = 32767;
                } else if (class326.field4509 < class471.field6299) {
                    class326.field4509 = class471.field6299;
                }
                class510.field6809 = (short) field7207[field7211 + 2];
                if (class510.field6809 <= 0) {
                    class510.field6809 = 1;
                }
                class256.field3550 = (short) field7207[field7211 + 3];
                if (class256.field3550 <= 0) {
                    class256.field3550 = 32767;
                    return;
                }
                if (class256.field3550 < class510.field6809) {
                    class256.field3550 = class510.field6809;
                }
                return;
            }
            if (arg0 == 6203) {
                class646.method3542(class153.field2412.field8350, 126, 0, 0, class153.field2412.field8361, false);
                field7207[field7211++] = class39.field581;
                field7207[field7211++] = class672.field9516;
                return;
            }
            if (arg0 == 6204) {
                field7207[field7211++] = class338.field4679;
                field7207[field7211++] = class193.field2830;
                return;
            }
            if (arg0 == 6205) {
                field7207[field7211++] = class526.field7008;
                field7207[field7211++] = class373.field5047;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7207[field7211++] = (int) (class681.method3802(-23600) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7207[field7211++] = (int) (class681.method3802(-23600) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7211 -= 3;
                int var237 = field7207[field7211];
                int var238 = field7207[field7211 + 1];
                int var239 = field7207[field7211 + 2];
                field7209.clear();
                field7209.set(11, 12);
                field7209.set(var239, var238, var237);
                int var240 = (int) (field7209.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field7207[field7211++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field7209.clear();
                field7209.setTime(new Date(class681.method3802(-23600)));
                field7207[field7211++] = field7209.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field7207[--field7211];
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
                field7207[field7211++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7207[field7211++] = class329.method1966((byte) -98) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7207[field7211++] = class421.method2419(5) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class32.field525 == 7 && class139.field2251 == 0 && class639.field8597 == 0) {
                    if (class291.field4118) {
                        field7207[field7211++] = 0;
                        return;
                    }
                    if (class71.field1060 > class681.method3802(-23600) - 1000L) {
                        field7207[field7211++] = 1;
                        return;
                    }
                    class291.field4118 = true;
                    class402 var243 = class390.method2252(class61.field920, -128, class262.field3644);
                    var243.field5354.method1982(class444.field6080, (byte) 63);
                    class36.method278(0, var243);
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class233 var244 = class347.method2080(-2);
                if (var244 != null) {
                    field7207[field7211++] = var244.field3262;
                    field7207[field7211++] = var244.field700;
                    field7206[field7190++] = var244.field3264;
                    class427 var245 = var244.method1452(true);
                    field7207[field7211++] = var245.field5863;
                    field7206[field7190++] = var245.field5865;
                    field7207[field7211++] = var244.field697;
                    field7207[field7211++] = var244.field3260;
                    field7206[field7190++] = var244.field3268;
                    return;
                }
                field7207[field7211++] = -1;
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 6502) {
                class233 var246 = class576.method3153(110);
                if (var246 != null) {
                    field7207[field7211++] = var246.field3262;
                    field7207[field7211++] = var246.field700;
                    field7206[field7190++] = var246.field3264;
                    class427 var247 = var246.method1452(true);
                    field7207[field7211++] = var247.field5863;
                    field7206[field7190++] = var247.field5865;
                    field7207[field7211++] = var246.field697;
                    field7207[field7211++] = var246.field3260;
                    field7206[field7190++] = var246.field3268;
                    return;
                }
                field7207[field7211++] = -1;
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field7207[--field7211];
                String var249 = field7206[--field7190];
                if (class32.field525 == 7 && class139.field2251 == 0 && class639.field8597 == 0) {
                    field7207[field7211++] = class649.method3558(var249, var248, (byte) 126) ? 1 : 0;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class344.field4718.field5441 = field7207[--field7211];
                class344.field4718.method1562(-112, class688.field9669);
                return;
            }
            if (arg0 == 6505) {
                field7207[field7211++] = class344.field4718.field5441;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field7207[--field7211];
                class233 var251 = class31.method259(-1, var250);
                if (var251 != null) {
                    field7207[field7211++] = var251.field700;
                    field7206[field7190++] = var251.field3264;
                    class427 var252 = var251.method1452(true);
                    field7207[field7211++] = var252.field5863;
                    field7206[field7190++] = var252.field5865;
                    field7207[field7211++] = var251.field697;
                    field7207[field7211++] = var251.field3260;
                    field7206[field7190++] = var251.field3268;
                    return;
                }
                field7207[field7211++] = -1;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                field7207[field7211++] = 0;
                field7207[field7211++] = 0;
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7211 -= 4;
                int var253 = field7207[field7211];
                boolean var254 = field7207[field7211 + 1] == 1;
                int var255 = field7207[field7211 + 2];
                boolean var256 = field7207[field7211 + 3] == 1;
                class27.method238(var256, 0, var255, var253, var254);
                return;
            }
            if (arg0 == 6508) {
                class350.method2084(-30699);
                return;
            }
            if (arg0 == 6509) {
                if (class32.field525 != 7) {
                    return;
                }
                class556.field7388 = field7207[--field7211] == 1;
                return;
            }
            if (arg0 == 6510) {
                field7207[field7211++] = class331.field4538;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class344.field4718.field5425 = field7207[--field7211] == 1;
                class344.field4718.method1562(-99, class688.field9669);
                return;
            }
            if (arg0 == 6601) {
                field7207[field7211++] = class344.field4718.field5425 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class529.field7048 == class195.field2848) {
            if (arg0 == 6700) {
                int var257 = class264.field3667.method2920(false);
                if (class251.field3463 != -1) {
                    var257++;
                }
                field7207[field7211++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field7207[--field7211];
                if (class251.field3463 != -1) {
                    if (var258 == 0) {
                        field7207[field7211++] = class251.field3463;
                        return;
                    }
                    var258--;
                }
                class140 var259 = (class140) class264.field3667.method2915(87);
                while (var258-- > 0) {
                    var259 = (class140) class264.field3667.method2912((byte) 104);
                }
                field7207[field7211++] = var259.field2256;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field7207[--field7211];
                if (class601.field7977[var260] == null) {
                    field7206[field7190++] = "";
                    return;
                }
                String var261 = class601.field7977[var260][0].field8314;
                if (var261 == null) {
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field7207[--field7211];
                if (class601.field7977[var262] == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = class601.field7977[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field7211 -= 2;
                int var263 = field7207[field7211];
                int var264 = field7207[field7211 + 1];
                if (class601.field7977[var263] == null) {
                    field7206[field7190++] = "";
                    return;
                }
                String var265 = class601.field7977[var263][var264].field8314;
                if (var265 == null) {
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field7211 -= 2;
                int var266 = field7207[field7211];
                int var267 = field7207[field7211 + 1];
                if (class601.field7977[var266] == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = class601.field7977[var266][var267].field8410;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7211 -= 3;
                int var268 = field7207[field7211];
                int var269 = field7207[field7211 + 1];
                int var270 = field7207[field7211 + 2];
                class58.method475(var270, 1, var268 << 16 | var269, (byte) 98, "");
                return;
            }
            if (arg0 == 6708) {
                field7211 -= 3;
                int var271 = field7207[field7211];
                int var272 = field7207[field7211 + 1];
                int var273 = field7207[field7211 + 2];
                class58.method475(var273, 2, var271 << 16 | var272, (byte) 102, "");
                return;
            }
            if (arg0 == 6709) {
                field7211 -= 3;
                int var274 = field7207[field7211];
                int var275 = field7207[field7211 + 1];
                int var276 = field7207[field7211 + 2];
                class58.method475(var276, 3, var274 << 16 | var275, (byte) 116, "");
                return;
            }
            if (arg0 == 6710) {
                field7211 -= 3;
                int var277 = field7207[field7211];
                int var278 = field7207[field7211 + 1];
                int var279 = field7207[field7211 + 2];
                class58.method475(var279, 4, var277 << 16 | var278, (byte) 117, "");
                return;
            }
            if (arg0 == 6711) {
                field7211 -= 3;
                int var280 = field7207[field7211];
                int var281 = field7207[field7211 + 1];
                int var282 = field7207[field7211 + 2];
                class58.method475(var282, 5, var280 << 16 | var281, (byte) 86, "");
                return;
            }
            if (arg0 == 6712) {
                field7211 -= 3;
                int var283 = field7207[field7211];
                int var284 = field7207[field7211 + 1];
                int var285 = field7207[field7211 + 2];
                class58.method475(var285, 6, var283 << 16 | var284, (byte) 96, "");
                return;
            }
            if (arg0 == 6713) {
                field7211 -= 3;
                int var286 = field7207[field7211];
                int var287 = field7207[field7211 + 1];
                int var288 = field7207[field7211 + 2];
                class58.method475(var288, 7, var286 << 16 | var287, (byte) 119, "");
                return;
            }
            if (arg0 == 6714) {
                field7211 -= 3;
                int var289 = field7207[field7211];
                int var290 = field7207[field7211 + 1];
                int var291 = field7207[field7211 + 2];
                class58.method475(var291, 8, var289 << 16 | var290, (byte) 93, "");
                return;
            }
            if (arg0 == 6715) {
                field7211 -= 3;
                int var292 = field7207[field7211];
                int var293 = field7207[field7211 + 1];
                int var294 = field7207[field7211 + 2];
                class58.method475(var294, 9, var292 << 16 | var293, (byte) 121, "");
                return;
            }
            if (arg0 == 6716) {
                field7211 -= 3;
                int var295 = field7207[field7211];
                int var296 = field7207[field7211 + 1];
                int var297 = field7207[field7211 + 2];
                class58.method475(var297, 10, var295 << 16 | var296, (byte) 119, "");
                return;
            }
            if (arg0 == 6717) {
                field7211 -= 3;
                int var298 = field7207[field7211];
                int var299 = field7207[field7211 + 1];
                int var300 = field7207[field7211 + 2];
                class625 var301 = class457.method2609(var298 << 16 | var299, var300, (byte) 25);
                class671.method3761(1);
                class52 var302 = client.method1701(var301);
                class154.method1083(var302.method355((byte) -55), (byte) -41, var302.field729, var301);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field7207[--field7211];
                class634 var304 = class521.field6960.method1487(var303, (byte) 115);
                if (var304.field8541 == null) {
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = var304.field8541;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field7207[--field7211];
                class634 var306 = class521.field6960.method1487(var305, (byte) 115);
                field7207[field7211++] = var306.field8554;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field7207[--field7211];
                class634 var308 = class521.field6960.method1487(var307, (byte) 115);
                field7207[field7211++] = var308.field8547;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field7207[--field7211];
                class634 var310 = class521.field6960.method1487(var309, (byte) 115);
                field7207[field7211++] = var310.field8516;
                return;
            }
            if (arg0 == 6804) {
                field7211 -= 2;
                int var311 = field7207[field7211];
                int var312 = field7207[field7211 + 1];
                class538 var313 = class282.field4001.method3062((byte) -66, var312);
                if (var313.method2974(true)) {
                    field7206[field7190++] = class521.field6960.method1487(var311, (byte) 115).method3500(var313.field7106, var312, false);
                    return;
                }
                field7207[field7211++] = class521.field6960.method1487(var311, (byte) 115).method3509(var313.field7101, var312, false);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7207[field7211++] = class569.field7560 && !class674.field9538 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7207[field7211++] = class446.field6116;
                return;
            }
            if (arg0 == 6902) {
                field7207[field7211++] = class219.field3109;
                return;
            }
            if (arg0 == 6903) {
                field7207[field7211++] = class9.field193;
                return;
            }
            if (arg0 == 6904) {
                field7207[field7211++] = class188.field2789;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class243.field3395 != null) {
                    if (class243.field3395.field2820 == null) {
                        var314 = class164.method1128(class243.field3395.field2819, (byte) -112);
                    } else {
                        var314 = (String) class243.field3395.field2820;
                    }
                }
                field7206[field7190++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field7207[field7211++] = class284.field4016;
                return;
            }
            if (arg0 == 6907) {
                field7207[field7211++] = class561.field7445;
                return;
            }
            if (arg0 == 6908) {
                field7207[field7211++] = class362.field4877;
                return;
            }
            if (arg0 == 6909) {
                field7207[field7211++] = class146.field2338 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7207[field7211++] = class175.field2692;
                return;
            }
            if (arg0 == 6911) {
                field7207[field7211++] = class109.field1596;
                return;
            }
            if (arg0 == 6912) {
                field7207[field7211++] = class436.field5965;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class344.field4718.method1563(true);
                field7207[field7211++] = class344.field4718.field3522 = class571.field7587;
                field7207[field7211++] = var315;
                class366.method2157(103);
                class344.field4718.method1562(-126, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7001) {
                class344.field4718.method1550(true);
                class366.method2157(70);
                class344.field4718.method1562(-123, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7002) {
                class344.field4718.method1560(1);
                class366.method2157(101);
                class344.field4718.method1562(7, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7003) {
                class344.field4718.method1557(16700);
                class366.method2157(66);
                class344.field4718.method1562(-128, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7004) {
                class344.field4718.method1552(76);
                class366.method2157(93);
                class344.field4718.method1562(-101, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7005) {
                class344.field4718.field5430 = 0;
                class344.field4718.method1562(66, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class344.field4718.field3522 == 2) {
                    class344.field4718.field3515 = true;
                    return;
                }
                if (class344.field4718.field3522 == 1) {
                    class344.field4718.field3524 = true;
                    return;
                }
                if (class344.field4718.field3522 == 3) {
                    class344.field4718.field3505 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field7207[field7211++] = class344.field4718.field5430;
                return;
            }
            if (arg0 == 7008) {
                if (class571.field7587 == 0 && class660.field9362 < 96) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    private static final void method3009(int arg0) {
        class625 var1 = class153.method1078(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class625[] var3 = class699.field9814[var2];
        if (var3 == null) {
            class625[] var4 = class601.field7977[var2];
            int var5 = var4.length;
            var3 = class699.field9814[var2] = new class625[var5];
            class83.method685(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class83.method685(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3010(String arg0, int arg1) {
        if (class150.field2398 == 0 && !(!class569.field7560 || class674.field9538) || class261.field3587) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class72.field1111.method546(0, (byte) -35))) {
            var3 = 0;
            arg0 = arg0.substring(class72.field1111.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1112.method546(0, (byte) -35))) {
            var3 = 1;
            arg0 = arg0.substring(class72.field1112.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1113.method546(0, (byte) -35))) {
            var3 = 2;
            arg0 = arg0.substring(class72.field1113.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1114.method546(0, (byte) -35))) {
            var3 = 3;
            arg0 = arg0.substring(class72.field1114.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1115.method546(0, (byte) -35))) {
            var3 = 4;
            arg0 = arg0.substring(class72.field1115.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1116.method546(0, (byte) -35))) {
            var3 = 5;
            arg0 = arg0.substring(class72.field1116.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1117.method546(0, (byte) -35))) {
            var3 = 6;
            arg0 = arg0.substring(class72.field1117.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1118.method546(0, (byte) -35))) {
            var3 = 7;
            arg0 = arg0.substring(class72.field1118.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1119.method546(0, (byte) -35))) {
            var3 = 8;
            arg0 = arg0.substring(class72.field1119.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1120.method546(0, (byte) -35))) {
            var3 = 9;
            arg0 = arg0.substring(class72.field1120.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1121.method546(0, (byte) -35))) {
            var3 = 10;
            arg0 = arg0.substring(class72.field1121.method546(0, (byte) -35).length());
        } else if (var2.startsWith(class72.field1122.method546(0, (byte) -35))) {
            var3 = 11;
            arg0 = arg0.substring(class72.field1122.method546(0, (byte) -35).length());
        } else if (class516.field6892 != 0) {
            if (var2.startsWith(class72.field1111.method546(class516.field6892, (byte) -35))) {
                var3 = 0;
                arg0 = arg0.substring(class72.field1111.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1112.method546(class516.field6892, (byte) -35))) {
                var3 = 1;
                arg0 = arg0.substring(class72.field1112.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1113.method546(class516.field6892, (byte) -35))) {
                var3 = 2;
                arg0 = arg0.substring(class72.field1113.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1114.method546(class516.field6892, (byte) -35))) {
                var3 = 3;
                arg0 = arg0.substring(class72.field1114.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1115.method546(class516.field6892, (byte) -35))) {
                var3 = 4;
                arg0 = arg0.substring(class72.field1115.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1116.method546(class516.field6892, (byte) -35))) {
                var3 = 5;
                arg0 = arg0.substring(class72.field1116.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1117.method546(class516.field6892, (byte) -35))) {
                var3 = 6;
                arg0 = arg0.substring(class72.field1117.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1118.method546(class516.field6892, (byte) -35))) {
                var3 = 7;
                arg0 = arg0.substring(class72.field1118.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1119.method546(class516.field6892, (byte) -35))) {
                var3 = 8;
                arg0 = arg0.substring(class72.field1119.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1120.method546(class516.field6892, (byte) -35))) {
                var3 = 9;
                arg0 = arg0.substring(class72.field1120.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1121.method546(class516.field6892, (byte) -35))) {
                var3 = 10;
                arg0 = arg0.substring(class72.field1121.method546(class516.field6892, (byte) -35).length());
            } else if (var2.startsWith(class72.field1122.method546(class516.field6892, (byte) -35))) {
                var3 = 11;
                arg0 = arg0.substring(class72.field1122.method546(class516.field6892, (byte) -35).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class72.field1123.method546(0, (byte) -35))) {
            var5 = 1;
            arg0 = arg0.substring(class72.field1123.method546(0, (byte) -35).length());
        } else if (var4.startsWith(class72.field1124.method546(0, (byte) -35))) {
            var5 = 2;
            arg0 = arg0.substring(class72.field1124.method546(0, (byte) -35).length());
        } else if (var4.startsWith(class72.field1125.method546(0, (byte) -35))) {
            var5 = 3;
            arg0 = arg0.substring(class72.field1125.method546(0, (byte) -35).length());
        } else if (var4.startsWith(class72.field1126.method546(0, (byte) -35))) {
            var5 = 4;
            arg0 = arg0.substring(class72.field1126.method546(0, (byte) -35).length());
        } else if (var4.startsWith(class72.field1127.method546(0, (byte) -35))) {
            var5 = 5;
            arg0 = arg0.substring(class72.field1127.method546(0, (byte) -35).length());
        } else if (class516.field6892 != 0) {
            if (var4.startsWith(class72.field1123.method546(class516.field6892, (byte) -35))) {
                var5 = 1;
                arg0 = arg0.substring(class72.field1123.method546(class516.field6892, (byte) -35).length());
            } else if (var4.startsWith(class72.field1124.method546(class516.field6892, (byte) -35))) {
                var5 = 2;
                arg0 = arg0.substring(class72.field1124.method546(class516.field6892, (byte) -35).length());
            } else if (var4.startsWith(class72.field1125.method546(class516.field6892, (byte) -35))) {
                var5 = 3;
                arg0 = arg0.substring(class72.field1125.method546(class516.field6892, (byte) -35).length());
            } else if (var4.startsWith(class72.field1126.method546(class516.field6892, (byte) -35))) {
                var5 = 4;
                arg0 = arg0.substring(class72.field1126.method546(class516.field6892, (byte) -35).length());
            } else if (var4.startsWith(class72.field1127.method546(class516.field6892, (byte) -35))) {
                var5 = 5;
                arg0 = arg0.substring(class72.field1127.method546(class516.field6892, (byte) -35).length());
            }
        }
        field7194++;
        class402 var6 = class390.method2252(class286.field4031, -76, class262.field3644);
        var6.field5354.method1980(-345277664, 0);
        int var7 = var6.field5354.field4619;
        var6.field5354.method1980(-345277664, var3);
        var6.field5354.method1980(-345277664, var5);
        class10.method125(var6.field5354, (byte) -76, arg0);
        var6.field5354.method2047(var6.field5354.field4619 - var7, 0);
        class36.method278(0, var6);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "()V")
    public static final void method3011() {
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lwm;I)V")
    private static final void method3012(class529 arg0, int arg1) {
        field7211 = 0;
        field7190 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7046;
        int[] var4 = arg0.field7050;
        byte var5 = -1;
        field7205 = 0;
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
                        method3018(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3008(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7207[field7211++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7207[field7211++] = class80.field1261.field3056[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class80.field1261.method1365(var8, field7207[--field7211], false);
                } else if (var43 == 3) {
                    field7206[field7190++] = arg0.field7051[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7211 -= 2;
                    if (field7207[field7211 + 1] != field7207[field7211]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7211 -= 2;
                    if (field7207[field7211 + 1] == field7207[field7211]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7211 -= 2;
                    if (field7207[field7211] < field7207[field7211 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7211 -= 2;
                    if (field7207[field7211] > field7207[field7211 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7205 == 0) {
                        return;
                    }
                    class41 var9 = field7202[--field7205];
                    arg0 = var9.field598;
                    var3 = arg0.field7046;
                    var4 = arg0.field7050;
                    var2 = var9.field596;
                    field7191 = var9.field599;
                    field7203 = var9.field597;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7207[field7211++] = class80.field1261.method1126(var10, 122);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class80.field1261.method1367((byte) 94, field7207[--field7211], var11);
                } else if (var43 == 31) {
                    field7211 -= 2;
                    if (field7207[field7211] <= field7207[field7211 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7211 -= 2;
                    if (field7207[field7211] >= field7207[field7211 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7207[field7211++] = field7191[var4[var2]];
                } else if (var43 == 34) {
                    field7191[var4[var2]] = field7207[--field7211];
                } else if (var43 == 35) {
                    field7206[field7190++] = field7203[var4[var2]];
                } else if (var43 == 36) {
                    field7203[var4[var2]] = field7206[--field7190];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7190 -= var12;
                    String var13 = class120.method935(0, field7190, var12, field7206);
                    field7206[field7190++] = var13;
                } else if (var43 == 38) {
                    field7211--;
                } else if (var43 == 39) {
                    field7190--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class529 var15 = class618.method3383(0, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7045];
                    String[] var17 = new String[var15.field7052];
                    for (int var18 = 0; var18 < var15.field7059; var18++) {
                        var16[var18] = field7207[field7211 + var18 - var15.field7059];
                    }
                    for (int var19 = 0; var19 < var15.field7044; var19++) {
                        var17[var19] = field7206[field7190 + var19 - var15.field7044];
                    }
                    field7211 -= var15.field7059;
                    field7190 -= var15.field7044;
                    class41 var20 = new class41();
                    var20.field598 = arg0;
                    var20.field596 = var2;
                    var20.field599 = field7191;
                    var20.field597 = field7203;
                    if (field7205 >= field7202.length) {
                        throw new RuntimeException();
                    }
                    field7202[field7205++] = var20;
                    arg0 = var15;
                    var3 = var15.field7046;
                    var4 = var15.field7050;
                    var2 = -1;
                    field7191 = var16;
                    field7203 = var17;
                } else if (var43 == 42) {
                    field7207[field7211++] = class476.field6352[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class476.field6352[var21] = field7207[--field7211];
                    class243.method1493(2110445164, var21);
                    class193.field2825 |= class690.field9711[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7207[--field7211];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7200[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7210[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7207[--field7211];
                    if (var28 < 0 || var28 >= field7200[var27]) {
                        throw new RuntimeException();
                    }
                    field7207[field7211++] = field7210[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7211 -= 2;
                    int var30 = field7207[field7211];
                    if (var30 < 0 || var30 >= field7200[var29]) {
                        throw new RuntimeException();
                    }
                    field7210[var29][var30] = field7207[field7211 + 1];
                } else if (var43 == 47) {
                    String var31 = class138.field2228[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7206[field7190++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class138.field2228[var32] = field7206[--field7190];
                    class399.method2288(2, var32);
                } else if (var43 == 51) {
                    class520 var33 = arg0.field7060[var4[var2]];
                    class704 var34 = (class704) var33.method2918((long) field7207[--field7211], (byte) 33);
                    if (var34 != null) {
                        var2 += var34.field9905;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7047 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6724).append(" ");
                for (int var41 = field7205 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7202[var41].field598.field6724).append(" ");
                }
                var40.append("op: ").append(var5);
                class259.method1586(var42, var40.toString(), (byte) 8);
            } else {
                class315.method1881("Clientscript error in: " + arg0.field7047, 0, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7047).append("\n");
                for (int var38 = field7205 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7202[var38].field598.field7047).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class259.method1586(var42, var37.toString(), (byte) 8);
                class415.method2378(0, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ldm;)V")
    public static final void method3013(class48 arg0) {
        method3006(arg0, 200000);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method3014(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7209.setTime(new Date(var1));
        int var3 = field7209.get(5);
        int var4 = field7209.get(2);
        int var5 = field7209.get(1);
        return var3 + "-" + field7213[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public static final void method3015(int arg0) {
        if (arg0 == -1 || !class269.method1639(arg0, 0)) {
            return;
        }
        class625[] var1 = class601.field7977[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class625 var3 = var1[var2];
            if (var3.field8433 != null) {
                class48 var4 = new class48();
                var4.field692 = var3;
                var4.field681 = var3.field8433;
                method3006(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IZ)V")
    public static final void method3016(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
    private static final void method3017(int arg0) {
        class625 var1 = class153.method1078(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class625[] var3 = class699.field9814[var2];
        if (var3 == null) {
            class625[] var4 = class601.field7977[var2];
            int var5 = var4.length;
            var3 = class699.field9814[var2] = new class625[var5];
            class83.method685(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class83.method685(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(IZ)V")
    private static final void method3018(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7211 -= 3;
                int var2 = field7207[field7211];
                int var3 = field7207[field7211 + 1];
                int var4 = field7207[field7211 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class625 var5 = class153.method1078(65535, var2);
                if (var5.field8420 == null) {
                    var5.field8420 = new class625[var4 + 1];
                }
                if (var5.field8420.length <= var4) {
                    class625[] var6 = new class625[var4 + 1];
                    for (int var7 = 0; var7 < var5.field8420.length; var7++) {
                        var6[var7] = var5.field8420[var7];
                    }
                    var5.field8420 = var6;
                }
                if (var4 > 0 && var5.field8420[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class625 var8 = new class625();
                var8.field8421 = var3;
                var8.field8288 = var8.field8327 = var5.field8327;
                var8.field8418 = var4;
                var5.field8420[var4] = var8;
                if (arg1) {
                    field7197 = var8;
                } else {
                    field7208 = var8;
                }
                class463.method2624(false, var5);
                return;
            }
            if (arg0 == 101) {
                class625 var9 = arg1 ? field7197 : field7208;
                if (var9.field8418 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class625 var10 = class153.method1078(65535, var9.field8327);
                var10.field8420[var9.field8418] = null;
                class463.method2624(false, var10);
                return;
            }
            if (arg0 == 102) {
                class625 var11 = class153.method1078(65535, field7207[--field7211]);
                var11.field8420 = null;
                class463.method2624(false, var11);
                return;
            }
            if (arg0 == 200) {
                field7211 -= 2;
                int var12 = field7207[field7211];
                int var13 = field7207[field7211 + 1];
                class625 var14 = class457.method2609(var12, var13, (byte) 76);
                if (var14 != null && var13 != -1) {
                    field7207[field7211++] = 1;
                    if (arg1) {
                        field7197 = var14;
                        return;
                    }
                    field7208 = var14;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7207[--field7211];
                class625 var16 = class153.method1078(65535, var15);
                if (var16 != null) {
                    field7207[field7211++] = 1;
                    if (arg1) {
                        field7197 = var16;
                        return;
                    }
                    field7208 = var16;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7207[--field7211];
                method3017(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7207[--field7211];
                method3009(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7211 -= 2;
                int var19 = field7207[field7211];
                int var20 = field7207[field7211 + 1];
                for (int var21 = 0; var21 < class390.field5156.length; var21++) {
                    if (class390.field5156[var21] == var19) {
                        class199.field2897.field5362.method2475(-25951, class133.field2174, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class64.field985.length; var22++) {
                    if (class64.field985[var22] == var19) {
                        class199.field2897.field5362.method2475(-25951, class133.field2174, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7211 -= 2;
                int var23 = field7207[field7211];
                int var24 = field7207[field7211 + 1];
                class199.field2897.field5362.method2472(44, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7207[--field7211] != 0;
                class199.field2897.field5362.method2473(var25, 17733);
                return;
            }
            if (arg0 == 411) {
                field7211 -= 2;
                int var26 = field7207[field7211];
                int var27 = field7207[field7211 + 1];
                class199.field2897.field5362.method2471(-117, var26, class193.field2826, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class625 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class153.method1078(65535, field7207[--field7211]);
            } else {
                var28 = arg1 ? field7197 : field7208;
            }
            if (arg0 == 1000) {
                field7211 -= 4;
                var28.field8297 = field7207[field7211];
                var28.field8349 = field7207[field7211 + 1];
                int var29 = field7207[field7211 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field7207[field7211 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field8305 = (byte) var29;
                var28.field8293 = (byte) var30;
                class463.method2624(false, var28);
                class110.method816((byte) 97, var28);
                if (var28.field8418 == -1) {
                    class184.method1218(var28.field8327, true);
                }
                return;
            }
            if (arg0 == 1001) {
                field7211 -= 4;
                var28.field8443 = field7207[field7211];
                var28.field8387 = field7207[field7211 + 1];
                var28.field8411 = 0;
                var28.field8412 = 0;
                int var31 = field7207[field7211 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field7207[field7211 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field8368 = (byte) var31;
                var28.field8379 = (byte) var32;
                class463.method2624(false, var28);
                class110.method816((byte) 95, var28);
                if (var28.field8421 == 0) {
                    class209.method1340(var28, false, -1);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field7207[--field7211] == 1;
                if (var28.field8432 != var33) {
                    var28.field8432 = var33;
                    class463.method2624(false, var28);
                }
                if (var28.field8418 == -1) {
                    class348.method2083(var28.field8327, false);
                }
                return;
            }
            if (arg0 == 1004) {
                field7211 -= 2;
                var28.field8277 = field7207[field7211];
                var28.field8324 = field7207[field7211 + 1];
                class463.method2624(false, var28);
                class110.method816((byte) 105, var28);
                if (var28.field8421 == 0) {
                    class209.method1340(var28, false, -1);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field8339 = field7207[--field7211] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class625 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class153.method1078(65535, field7207[--field7211]);
            } else {
                var34 = arg1 ? field7197 : field7208;
            }
            if (arg0 == 1100) {
                field7211 -= 2;
                var34.field8365 = field7207[field7211];
                if (var34.field8365 > var34.field8325 - var34.field8350) {
                    var34.field8365 = var34.field8325 - var34.field8350;
                }
                if (var34.field8365 < 0) {
                    var34.field8365 = 0;
                }
                var34.field8441 = field7207[field7211 + 1];
                if (var34.field8441 > var34.field8364 - var34.field8361) {
                    var34.field8441 = var34.field8364 - var34.field8361;
                }
                if (var34.field8441 < 0) {
                    var34.field8441 = 0;
                }
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class187.method1233(var34.field8327, 124);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field8392 = field7207[--field7211];
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class22.method196((byte) 121, var34.field8327);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field8340 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field8406 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field8286 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field7207[--field7211];
                if (var34.field8289 != var35) {
                    var34.field8289 = var35;
                    class463.method2624(false, var34);
                }
                if (var34.field8418 == -1) {
                    class251.method1531(var34.field8327, 14);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field8302 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field8400 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field8294 = 1;
                var34.field8401 = field7207[--field7211];
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class234.method1465((byte) 115, var34.field8327);
                }
                return;
            }
            if (arg0 == 1109) {
                field7211 -= 6;
                var34.field8353 = field7207[field7211];
                var34.field8354 = field7207[field7211 + 1];
                var34.field8292 = field7207[field7211 + 2];
                var34.field8373 = field7207[field7211 + 3];
                var34.field8346 = field7207[field7211 + 4];
                var34.field8332 = field7207[field7211 + 5];
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class190.method1242(var34.field8327, (byte) -84);
                    class396.method2274(var34.field8327, 112);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field7207[--field7211];
                if (var34.field8377 != var36) {
                    var34.field8377 = var36;
                    var34.field8321 = 0;
                    var34.field8372 = 1;
                    var34.field8439 = 0;
                    class616 var37 = var34.field8377 == -1 ? null : class636.field8570.method231(var34.field8377, -11764);
                    if (var37 != null) {
                        class595.method3280(var34.field8321, false, var37);
                    }
                    class463.method2624(false, var34);
                }
                if (var34.field8418 == -1) {
                    class709.method3903(103, var34.field8327);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field8405 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field7206[--field7190];
                if (!var38.equals(var34.field8343)) {
                    var34.field8343 = var38;
                    class463.method2624(false, var34);
                }
                if (var34.field8418 == -1) {
                    class303.method1836(0, var34.field8327);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field8356 = field7207[--field7211];
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class403.method2312(25004, var34.field8327);
                }
                return;
            }
            if (arg0 == 1114) {
                field7211 -= 3;
                var34.field8438 = field7207[field7211];
                var34.field8381 = field7207[field7211 + 1];
                var34.field8395 = field7207[field7211 + 2];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field8335 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field8362 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field8440 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field8323 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field8333 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1120) {
                field7211 -= 2;
                var34.field8325 = field7207[field7211];
                var34.field8364 = field7207[field7211 + 1];
                class463.method2624(false, var34);
                if (var34.field8421 == 0) {
                    class209.method1340(var34, false, -1);
                }
                return;
            }
            if (arg0 == 1121) {
                field7211 -= 2;
                var34.field8426 = (short) field7207[field7211];
                var34.field8363 = (short) field7207[field7211 + 1];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1122) {
                var34.field8431 = field7207[--field7211] == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field8332 = field7207[--field7211];
                class463.method2624(false, var34);
                if (var34.field8418 == -1) {
                    class190.method1242(var34.field8327, (byte) -84);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field7207[--field7211];
                var34.field8408 = var39 == 1;
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1125) {
                field7211 -= 2;
                var34.field8320 = field7207[field7211];
                var34.field8382 = field7207[field7211 + 1];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field8444 = field7207[--field7211];
                class463.method2624(false, var34);
                return;
            }
            if (arg0 == 1127) {
                field7211 -= 2;
                int var40 = field7207[field7211];
                int var41 = field7207[field7211 + 1];
                class538 var42 = class282.field4001.method3062((byte) -99, var40);
                if (var42.field7101 != var41) {
                    var34.method3411(var41, var40, true);
                    return;
                }
                var34.method3427((byte) 112, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field7207[--field7211];
                String var44 = field7206[--field7190];
                class538 var45 = class282.field4001.method3062((byte) -65, var43);
                if (!var45.field7106.equals(var44)) {
                    var34.method3418(var44, 16, var43);
                    return;
                }
                var34.method3427((byte) 112, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class625 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class153.method1078(65535, field7207[--field7211]);
            } else {
                var46 = arg1 ? field7197 : field7208;
            }
            class463.method2624(false, var46);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7211 -= 2;
                int var47 = field7207[field7211];
                int var48 = field7207[field7211 + 1];
                if (var46.field8418 == -1) {
                    class73.method550((byte) -11, var46.field8327);
                    class190.method1242(var46.field8327, (byte) -84);
                    class396.method2274(var46.field8327, 127);
                }
                if (var47 == -1) {
                    var46.field8294 = 1;
                    var46.field8401 = -1;
                    var46.field8403 = -1;
                    return;
                }
                var46.field8403 = var47;
                var46.field8367 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field8380 = true;
                } else {
                    var46.field8380 = false;
                }
                class577 var49 = class193.field2826.method1047(var47, -1);
                var46.field8292 = var49.field7619;
                var46.field8373 = var49.field7665;
                var46.field8346 = var49.field7678;
                var46.field8353 = var49.field7632;
                var46.field8354 = var49.field7673;
                var46.field8332 = var49.field7625;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field8409 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field8409 = 1;
                } else {
                    var46.field8409 = 2;
                }
                if (var46.field8411 > 0) {
                    var46.field8332 = var46.field8332 * 32 / var46.field8411;
                    return;
                }
                if (var46.field8443 > 0) {
                    var46.field8332 = var46.field8332 * 32 / var46.field8443;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field8294 = 2;
                var46.field8401 = field7207[--field7211];
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 40, var46.field8327);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field8294 = 3;
                var46.field8401 = -1;
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 65, var46.field8327);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field8294 = 6;
                var46.field8401 = field7207[--field7211];
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 53, var46.field8327);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field8294 = 5;
                var46.field8401 = field7207[--field7211];
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 58, var46.field8327);
                }
                return;
            }
            if (arg0 == 1206) {
                field7211 -= 4;
                var46.field8306 = field7207[field7211];
                var46.field8298 = field7207[field7211 + 1];
                var46.field8397 = field7207[field7211 + 2];
                var46.field8307 = field7207[field7211 + 3];
                class463.method2624(false, var46);
                return;
            }
            if (arg0 == 1207) {
                field7211 -= 2;
                var46.field8311 = field7207[field7211];
                var46.field8383 = field7207[field7211 + 1];
                class463.method2624(false, var46);
                return;
            }
            if (arg0 == 1210) {
                field7211 -= 4;
                var46.field8401 = field7207[field7211];
                var46.field8309 = field7207[field7211 + 1];
                if (field7207[field7211 + 2] == 1) {
                    var46.field8294 = 9;
                } else {
                    var46.field8294 = 8;
                }
                if (field7207[field7211 + 3] == 1) {
                    var46.field8380 = true;
                } else {
                    var46.field8380 = false;
                }
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 99, var46.field8327);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field8294 = 5;
                var46.field8401 = class416.field5693;
                var46.field8309 = 0;
                if (var46.field8418 == -1) {
                    class234.method1465((byte) 46, var46.field8327);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class625 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class153.method1078(65535, field7207[--field7211]);
            } else {
                var50 = arg1 ? field7197 : field7208;
            }
            if (arg0 == 1300) {
                int var51 = field7207[--field7211] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method3432(var51, 123, field7206[--field7190]);
                    return;
                }
                field7190--;
                return;
            }
            if (arg0 == 1301) {
                field7211 -= 2;
                int var52 = field7207[field7211];
                int var53 = field7207[field7211 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field8319 = null;
                    return;
                }
                var50.field8319 = class457.method2609(var52, var53, (byte) 40);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field7207[--field7211];
                if (class315.field4332 != var54 && class458.field6218 != var54 && class187.field2781 != var54) {
                    return;
                }
                var50.field8281 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field8398 = field7207[--field7211];
                return;
            }
            if (arg0 == 1304) {
                var50.field8360 = field7207[--field7211];
                return;
            }
            if (arg0 == 1305) {
                var50.field8357 = field7206[--field7190];
                return;
            }
            if (arg0 == 1306) {
                var50.field8427 = field7206[--field7190];
                return;
            }
            if (arg0 == 1307) {
                var50.field8313 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field8282 = field7207[--field7211];
                var50.field8442 = field7207[--field7211];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field7207[--field7211];
                int var56 = field7207[--field7211];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method3429(var55, (byte) -127, var56 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field8284 = field7206[--field7190];
                return;
            }
            if (arg0 == 1311) {
                var50.field8375 = field7207[--field7211];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field7211 -= 3;
                    var57 = field7207[field7211] - 1;
                    var58 = field7207[field7211 + 1];
                    var59 = field7207[field7211 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7211 -= 2;
                    var57 = 10;
                    var58 = field7207[field7211];
                    var59 = field7207[field7211 + 1];
                }
                if (var50.field8341 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field8341 = new byte[11];
                    var50.field8428 = new byte[11];
                    var50.field8351 = new int[11];
                }
                var50.field8341[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field8355 = false;
                    for (int var60 = 0; var60 < var50.field8341.length; var60++) {
                        if (var50.field8341[var60] != 0) {
                            var50.field8355 = true;
                            break;
                        }
                    }
                } else {
                    var50.field8355 = true;
                }
                var50.field8428[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field8386 = field7207[--field7211];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class625 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class153.method1078(65535, field7207[--field7211]);
            } else {
                var61 = arg1 ? field7197 : field7208;
            }
            if (arg0 == 1499) {
                var61.method3425(-1);
                return;
            }
            String var62 = field7206[--field7190];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field7207[--field7211];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field7207[--field7211];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field7206[--field7190];
                } else {
                    var65[var66] = Integer.valueOf(field7207[--field7211]);
                }
            }
            int var67 = field7207[--field7211];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field8315 = var65;
            } else if (arg0 == 1401) {
                var61.field8396 = var65;
            } else if (arg0 == 1402) {
                var61.field8347 = var65;
            } else if (arg0 == 1403) {
                var61.field8388 = var65;
            } else if (arg0 == 1404) {
                var61.field8295 = var65;
            } else if (arg0 == 1405) {
                var61.field8425 = var65;
            } else if (arg0 == 1406) {
                var61.field8404 = var65;
            } else if (arg0 == 1407) {
                var61.field8359 = var65;
                var61.field8399 = var63;
            } else if (arg0 == 1408) {
                var61.field8376 = var65;
            } else if (arg0 == 1409) {
                var61.field8413 = var65;
            } else if (arg0 == 1410) {
                var61.field8278 = var65;
            } else if (arg0 == 1411) {
                var61.field8308 = var65;
            } else if (arg0 == 1412) {
                var61.field8329 = var65;
            } else if (arg0 == 1414) {
                var61.field8415 = var65;
                var61.field8274 = var63;
            } else if (arg0 == 1415) {
                var61.field8389 = var65;
                var61.field8300 = var63;
            } else if (arg0 == 1416) {
                var61.field8414 = var65;
            } else if (arg0 == 1417) {
                var61.field8429 = var65;
            } else if (arg0 == 1418) {
                var61.field8378 = var65;
            } else if (arg0 == 1419) {
                var61.field8322 = var65;
            } else if (arg0 == 1420) {
                var61.field8391 = var65;
            } else if (arg0 == 1421) {
                var61.field8331 = var65;
            } else if (arg0 == 1422) {
                var61.field8301 = var65;
            } else if (arg0 == 1423) {
                var61.field8436 = var65;
            } else if (arg0 == 1424) {
                var61.field8318 = var65;
            } else if (arg0 == 1425) {
                var61.field8276 = var65;
            } else if (arg0 == 1426) {
                var61.field8424 = var65;
            } else if (arg0 == 1427) {
                var61.field8291 = var65;
            } else if (arg0 == 1428) {
                var61.field8437 = var65;
                var61.field8407 = var63;
            } else if (arg0 == 1429) {
                var61.field8417 = var65;
                var61.field8384 = var63;
            } else if (arg0 == 1430) {
                var61.field8285 = var65;
            }
            var61.field8348 = true;
            return;
        } else if (arg0 < 1600) {
            class625 var68 = arg1 ? field7197 : field7208;
            if (arg0 == 1500) {
                field7207[field7211++] = var68.field8312;
                return;
            }
            if (arg0 == 1501) {
                field7207[field7211++] = var68.field8317;
                return;
            }
            if (arg0 == 1502) {
                field7207[field7211++] = var68.field8350;
                return;
            }
            if (arg0 == 1503) {
                field7207[field7211++] = var68.field8361;
                return;
            }
            if (arg0 == 1504) {
                field7207[field7211++] = var68.field8432 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field7207[field7211++] = var68.field8288;
                return;
            }
            if (arg0 == 1506) {
                class625 var69 = class637.method3519(var68, 2122911660);
                field7207[field7211++] = var69 == null ? -1 : var69.field8327;
                return;
            }
        } else if (arg0 < 1700) {
            class625 var70 = arg1 ? field7197 : field7208;
            if (arg0 == 1600) {
                field7207[field7211++] = var70.field8365;
                return;
            }
            if (arg0 == 1601) {
                field7207[field7211++] = var70.field8441;
                return;
            }
            if (arg0 == 1602) {
                field7206[field7190++] = var70.field8343;
                return;
            }
            if (arg0 == 1603) {
                field7207[field7211++] = var70.field8325;
                return;
            }
            if (arg0 == 1604) {
                field7207[field7211++] = var70.field8364;
                return;
            }
            if (arg0 == 1605) {
                field7207[field7211++] = var70.field8332;
                return;
            }
            if (arg0 == 1606) {
                field7207[field7211++] = var70.field8292;
                return;
            }
            if (arg0 == 1607) {
                field7207[field7211++] = var70.field8346;
                return;
            }
            if (arg0 == 1608) {
                field7207[field7211++] = var70.field8373;
                return;
            }
            if (arg0 == 1609) {
                field7207[field7211++] = var70.field8406;
                return;
            }
            if (arg0 == 1610) {
                field7207[field7211++] = var70.field8353;
                return;
            }
            if (arg0 == 1611) {
                field7207[field7211++] = var70.field8354;
                return;
            }
            if (arg0 == 1612) {
                field7207[field7211++] = var70.field8289;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field7207[--field7211];
                class538 var72 = class282.field4001.method3062((byte) -121, var71);
                if (var72.method2974(true)) {
                    field7206[field7190++] = var70.method3416(var71, -3345, var72.field7106);
                    return;
                }
                field7207[field7211++] = var70.method3417(101, var72.field7101, var71);
                return;
            }
            if (arg0 == 1614) {
                field7207[field7211++] = var70.field8302;
                return;
            }
        } else if (arg0 < 1800) {
            class625 var73 = arg1 ? field7197 : field7208;
            if (arg0 == 1700) {
                field7207[field7211++] = var73.field8403;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field8403 != -1) {
                    field7207[field7211++] = var73.field8367;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field7207[field7211++] = var73.field8418;
                return;
            }
        } else if (arg0 < 1900) {
            class625 var74 = arg1 ? field7197 : field7208;
            if (arg0 == 1800) {
                field7207[field7211++] = client.method1701(var74).method355((byte) -55);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field7207[--field7211];
                int var352 = var75 - 1;
                if (var74.field8313 != null && var352 < var74.field8313.length && var74.field8313[var352] != null) {
                    field7206[field7190++] = var74.field8313[var352];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field8357 == null) {
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = var74.field8357;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class625 var350;
            if (arg0 >= 2000) {
                var350 = class153.method1078(65535, field7207[--field7211]);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field7197 : field7208;
            }
            if (field7215 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field8291 == null) {
                    return;
                }
                class48 var351 = new class48();
                var351.field692 = var350;
                var351.field681 = var350.field8291;
                var351.field679 = field7215 + 1;
                class46.field658.method3265(var351, (byte) -125);
                return;
            }
        } else if (arg0 < 2600) {
            class625 var76 = class153.method1078(65535, field7207[--field7211]);
            if (arg0 == 2500) {
                field7207[field7211++] = var76.field8312;
                return;
            }
            if (arg0 == 2501) {
                field7207[field7211++] = var76.field8317;
                return;
            }
            if (arg0 == 2502) {
                field7207[field7211++] = var76.field8350;
                return;
            }
            if (arg0 == 2503) {
                field7207[field7211++] = var76.field8361;
                return;
            }
            if (arg0 == 2504) {
                field7207[field7211++] = var76.field8432 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field7207[field7211++] = var76.field8288;
                return;
            }
            if (arg0 == 1506) {
                class625 var77 = class637.method3519(var76, 2122911660);
                field7207[field7211++] = var77 == null ? -1 : var77.field8327;
                return;
            }
        } else if (arg0 < 2700) {
            class625 var78 = class153.method1078(65535, field7207[--field7211]);
            if (arg0 == 2600) {
                field7207[field7211++] = var78.field8365;
                return;
            }
            if (arg0 == 2601) {
                field7207[field7211++] = var78.field8441;
                return;
            }
            if (arg0 == 2602) {
                field7206[field7190++] = var78.field8343;
                return;
            }
            if (arg0 == 2603) {
                field7207[field7211++] = var78.field8325;
                return;
            }
            if (arg0 == 2604) {
                field7207[field7211++] = var78.field8364;
                return;
            }
            if (arg0 == 2605) {
                field7207[field7211++] = var78.field8332;
                return;
            }
            if (arg0 == 2606) {
                field7207[field7211++] = var78.field8292;
                return;
            }
            if (arg0 == 2607) {
                field7207[field7211++] = var78.field8346;
                return;
            }
            if (arg0 == 2608) {
                field7207[field7211++] = var78.field8373;
                return;
            }
            if (arg0 == 2609) {
                field7207[field7211++] = var78.field8406;
                return;
            }
            if (arg0 == 2610) {
                field7207[field7211++] = var78.field8353;
                return;
            }
            if (arg0 == 2611) {
                field7207[field7211++] = var78.field8354;
                return;
            }
            if (arg0 == 2612) {
                field7207[field7211++] = var78.field8289;
                return;
            }
            if (arg0 == 2613) {
                field7207[field7211++] = var78.field8302;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class625 var79 = class153.method1078(65535, field7207[--field7211]);
                field7207[field7211++] = var79.field8403;
                return;
            }
            if (arg0 == 2701) {
                class625 var80 = class153.method1078(65535, field7207[--field7211]);
                if (var80.field8403 != -1) {
                    field7207[field7211++] = var80.field8367;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field7207[--field7211];
                class140 var82 = (class140) class264.field3667.method2918((long) var81, (byte) -27);
                if (var82 != null) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class625 var83 = class153.method1078(65535, field7207[--field7211]);
                if (var83.field8420 == null) {
                    field7207[field7211++] = 0;
                    return;
                }
                int var84 = var83.field8420.length;
                for (int var85 = 0; var85 < var83.field8420.length; var85++) {
                    if (var83.field8420[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field7207[field7211++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field7211 -= 2;
                int var86 = field7207[field7211];
                int var87 = field7207[field7211 + 1];
                class140 var88 = (class140) class264.field3667.method2918((long) var86, (byte) 85);
                if (var88 != null && var88.field2256 == var87) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class625 var89 = class153.method1078(65535, field7207[--field7211]);
            if (arg0 == 2800) {
                field7207[field7211++] = client.method1701(var89).method355((byte) -55);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field7207[--field7211];
                int var353 = var90 - 1;
                if (var89.field8313 != null && var353 < var89.field8313.length && var89.field8313[var353] != null) {
                    field7206[field7190++] = var89.field8313[var353];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field8357 == null) {
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = var89.field8357;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field7206[--field7190];
                class480.method2682(var91, true);
                return;
            }
            if (arg0 == 3101) {
                field7211 -= 2;
                class180.method1204(class199.field2897, field7207[field7211 + 1], -89, field7207[field7211]);
                return;
            }
            if (arg0 == 3103) {
                class100.method767(true, (byte) 86);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field7206[--field7190];
                int var93 = 0;
                if (class420.method2406(16036, var92)) {
                    var93 = class664.method3730(var92, 117);
                }
                field7201++;
                class402 var94 = class390.method2252(class244.field3413, -93, class262.field3644);
                var94.field5354.method1982(var93, (byte) 63);
                class36.method278(0, var94);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field7206[--field7190];
                field7188++;
                class402 var96 = class390.method2252(class551.field7339, -127, class262.field3644);
                var96.field5354.method1980(-345277664, var95.length() + 1);
                var96.field5354.method2019(-116, var95);
                class36.method278(0, var96);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field7206[--field7190];
                field7189++;
                class402 var98 = class390.method2252(class267.field3708, -87, class262.field3644);
                var98.field5354.method1980(-345277664, var97.length() + 1);
                var98.field5354.method2019(-118, var97);
                class36.method278(0, var98);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field7207[--field7211];
                String var100 = field7206[--field7190];
                class608.method3340(71, var99, var100);
                return;
            }
            if (arg0 == 3108) {
                field7211 -= 3;
                int var101 = field7207[field7211];
                int var102 = field7207[field7211 + 1];
                int var103 = field7207[field7211 + 2];
                class625 var104 = class153.method1078(65535, var103);
                class413.method2372(var101, var104, var102, 126);
                return;
            }
            if (arg0 == 3109) {
                field7211 -= 2;
                int var105 = field7207[field7211];
                int var106 = field7207[field7211 + 1];
                class625 var107 = arg1 ? field7197 : field7208;
                class413.method2372(var105, var107, var106, -40);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field7207[--field7211];
                field7192++;
                class402 var109 = class390.method2252(class545.field7227, -127, class262.field3644);
                var109.field5354.method2031((byte) 54, var108);
                class36.method278(0, var109);
                return;
            }
            if (arg0 == 3111) {
                field7211 -= 2;
                int var110 = field7207[field7211];
                int var111 = field7207[field7211 + 1];
                class140 var112 = (class140) class264.field3667.method2918((long) var110, (byte) -127);
                if (var112 != null) {
                    class345.method2074(1, var112, true, var112.field2256 != var111);
                }
                class420.method2411(var111, var110, 0, true, 3);
                return;
            }
            if (arg0 == 3112) {
                field7211--;
                int var113 = field7207[field7211];
                class140 var114 = (class140) class264.field3667.method2918((long) var113, (byte) 88);
                if (var114 != null && var114.field2253 == 3) {
                    class345.method2074(1, var114, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class673.method3768((byte) -123, field7206[--field7190]);
                return;
            }
            if (arg0 == 3114) {
                field7211 -= 2;
                int var115 = field7207[field7211];
                int var116 = field7207[field7211 + 1];
                String var117 = field7206[--field7190];
                class135.method1011("", "", var117, var115, "", var116, 116);
                return;
            }
            if (arg0 == 3115) {
                field7211 -= 11;
                class212[] var118 = class287.method1770(true);
                class679[] var119 = class601.method3318(true);
                class443.method2501(field7207[field7211 + 3], field7207[field7211 + 6], var119[field7207[field7211 + 1]], var118[field7207[field7211]], (byte) -92, field7207[field7211 + 4], field7207[field7211 + 2], field7207[field7211 + 5], field7207[field7211 + 8], field7207[field7211 + 10], field7207[field7211 + 7], field7207[field7211 + 9]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field7211 -= 3;
                class506.method2810(field7207[field7211 + 1], -51, 255, field7207[field7211 + 2], field7207[field7211]);
                return;
            }
            if (arg0 == 3201) {
                class425.method2431(255, 0, field7207[--field7211], 50);
                return;
            }
            if (arg0 == 3202) {
                field7211 -= 2;
                class2.method12(-26338, 255, field7207[field7211 + 1], field7207[field7211]);
                return;
            }
            if (arg0 == 3203) {
                field7211 -= 4;
                class506.method2810(field7207[field7211 + 1], -51, field7207[field7211 + 3], field7207[field7211 + 2], field7207[field7211]);
                return;
            }
            if (arg0 == 3204) {
                field7211 -= 3;
                class425.method2431(field7207[field7211 + 1], 0, field7207[field7211], field7207[field7211 + 2]);
                return;
            }
            if (arg0 == 3205) {
                field7211 -= 3;
                class2.method12(-26338, field7207[field7211 + 2], field7207[field7211 + 1], field7207[field7211]);
                return;
            }
            if (arg0 == 3206) {
                field7211 -= 4;
                class505.method2800(field7207[field7211 + 2], field7207[field7211 + 3], true, field7207[field7211], false, field7207[field7211 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field7211 -= 4;
                class505.method2800(field7207[field7211 + 2], field7207[field7211 + 3], true, field7207[field7211], true, field7207[field7211 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field7207[field7211++] = class642.field8626;
                return;
            }
            if (arg0 == 3301) {
                field7211 -= 2;
                int var120 = field7207[field7211];
                int var121 = field7207[field7211 + 1];
                field7207[field7211++] = class708.method3902(var121, false, false, var120);
                return;
            }
            if (arg0 == 3302) {
                field7211 -= 2;
                int var122 = field7207[field7211];
                int var123 = field7207[field7211 + 1];
                field7207[field7211++] = class690.method3833(var122, var123, false, 0);
                return;
            }
            if (arg0 == 3303) {
                field7211 -= 2;
                int var124 = field7207[field7211];
                int var125 = field7207[field7211 + 1];
                field7207[field7211++] = class503.method2791(98, false, var125, var124);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field7207[--field7211];
                field7207[field7211++] = class640.field8606.method2969(5, var126).field488;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field7207[--field7211];
                field7207[field7211++] = class548.field7316[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field7207[--field7211];
                field7207[field7211++] = class263.field3652[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field7207[--field7211];
                field7207[field7211++] = class368.field4978[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class199.field2897.field8609;
                int var131 = (class199.field2897.field8620 >> 9) + class473.field6334;
                int var132 = (class199.field2897.field8612 >> 9) + class233.field3269;
                field7207[field7211++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field7207[--field7211];
                field7207[field7211++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field7207[--field7211];
                field7207[field7211++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field7207[--field7211];
                field7207[field7211++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field7207[field7211++] = class127.field2140 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field7211 -= 2;
                int var136 = field7207[field7211];
                int var137 = field7207[field7211 + 1];
                field7207[field7211++] = class708.method3902(var137, false, true, var136);
                return;
            }
            if (arg0 == 3314) {
                field7211 -= 2;
                int var138 = field7207[field7211];
                int var139 = field7207[field7211 + 1];
                field7207[field7211++] = class690.method3833(var138, var139, true, 0);
                return;
            }
            if (arg0 == 3315) {
                field7211 -= 2;
                int var140 = field7207[field7211];
                int var141 = field7207[field7211 + 1];
                field7207[field7211++] = class503.method2791(98, true, var141, var140);
                return;
            }
            if (arg0 == 3316) {
                if (class150.field2398 >= 2) {
                    field7207[field7211++] = class150.field2398;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field7207[field7211++] = class108.field1587;
                return;
            }
            if (arg0 == 3318) {
                field7207[field7211++] = class214.field3059.field2955;
                return;
            }
            if (arg0 == 3321) {
                field7207[field7211++] = class466.field6279;
                return;
            }
            if (arg0 == 3322) {
                field7207[field7211++] = class335.field4661;
                return;
            }
            if (arg0 == 3323) {
                if (class592.field7836 >= 5 && class592.field7836 <= 9) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class592.field7836 >= 5 && class592.field7836 <= 9) {
                    field7207[field7211++] = class592.field7836;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field7207[field7211++] = class221.field3125 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field7207[field7211++] = class199.field2897.field5401;
                return;
            }
            if (arg0 == 3327) {
                field7207[field7211++] = class199.field2897.field5362.field5947 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field7207[field7211++] = class261.field3587 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field7207[--field7211];
                field7207[field7211++] = class555.method3071(false, var142, (byte) -104);
                return;
            }
            if (arg0 == 3331) {
                field7211 -= 2;
                int var143 = field7207[field7211];
                int var144 = field7207[field7211 + 1];
                field7207[field7211++] = class228.method1423(false, var144, var143, -78, false);
                return;
            }
            if (arg0 == 3332) {
                field7211 -= 2;
                int var145 = field7207[field7211];
                int var146 = field7207[field7211 + 1];
                field7207[field7211++] = class228.method1423(true, var146, var145, -87, false);
                return;
            }
            if (arg0 == 3333) {
                field7207[field7211++] = class126.field2096;
                return;
            }
            if (arg0 == 3335) {
                field7207[field7211++] = class516.field6892;
                return;
            }
            if (arg0 == 3336) {
                field7211 -= 4;
                int var147 = field7207[field7211];
                int var148 = field7207[field7211 + 1];
                int var149 = field7207[field7211 + 2];
                int var150 = field7207[field7211 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field7207[field7211++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field7207[field7211++] = class88.field1330;
                return;
            }
            if (arg0 == 3338) {
                field7207[field7211++] = class689.method3830(0);
                return;
            }
            if (arg0 == 3339) {
                field7207[field7211++] = class119.field2015 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field7207[field7211++] = class277.field3867 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field7207[field7211++] = class559.field7424 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field7207[field7211++] = class164.field2564.method1110((byte) 91);
                return;
            }
            if (arg0 == 3343) {
                field7207[field7211++] = class164.field2564.method1113(-6387);
                return;
            }
            if (arg0 == 3344) {
                field7206[field7190++] = class58.method477(true);
                return;
            }
            if (arg0 == 3345) {
                field7206[field7190++] = class22.method205(false);
                return;
            }
            if (arg0 == 3346) {
                field7207[field7211++] = class72.method547(107);
                return;
            }
            if (arg0 == 3347) {
                field7207[field7211++] = class584.field7753;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field7211 -= 2;
                int var154 = field7207[field7211];
                int var155 = field7207[field7211 + 1];
                class676 var156 = class672.field9519.method3324((byte) 119, var154);
                field7206[field7190++] = var156.method3781(var155, (byte) -101);
                return;
            }
            if (arg0 == 3408) {
                field7211 -= 4;
                int var157 = field7207[field7211];
                int var158 = field7207[field7211 + 1];
                int var159 = field7207[field7211 + 2];
                int var160 = field7207[field7211 + 3];
                class676 var161 = class672.field9519.method3324((byte) 88, var159);
                if (var161.field9557 == var157 && var161.field9552 == var158) {
                    if (var158 == 115) {
                        field7206[field7190++] = var161.method3781(var160, (byte) -117);
                        return;
                    }
                    field7207[field7211++] = var161.method3782(var160, (byte) -50);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field7211 -= 3;
                int var162 = field7207[field7211];
                int var163 = field7207[field7211 + 1];
                int var164 = field7207[field7211 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class676 var165 = class672.field9519.method3324((byte) -105, var163);
                if (var165.field9552 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field7207[field7211++] = var165.method3775(110, var164) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field7207[--field7211];
                String var167 = field7206[--field7190];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class676 var168 = class672.field9519.method3324((byte) -76, var166);
                if (var168.field9552 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field7207[field7211++] = var168.method3780((byte) -65, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field7207[--field7211];
                class676 var170 = class672.field9519.method3324((byte) -48, var169);
                field7207[field7211++] = var170.field9550.method2920(false);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class59.field916 == 0) {
                    field7207[field7211++] = -2;
                    return;
                }
                if (class59.field916 == 1) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = class408.field5515;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field7207[--field7211];
                if (class59.field916 == 2 && var171 < class408.field5515) {
                    field7206[field7190++] = class398.field5296[var171];
                    if (class34.field529[var171] != null) {
                        field7206[field7190++] = class34.field529[var171];
                        return;
                    }
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = "";
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field7207[--field7211];
                if (class59.field916 == 2 && var172 < class408.field5515) {
                    field7207[field7211++] = class358.field4848[var172];
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field7207[--field7211];
                if (class59.field916 == 2 && var173 < class408.field5515) {
                    field7207[field7211++] = class410.field5541[var173];
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field7206[--field7190];
                int var175 = field7207[--field7211];
                class197.method1279(var175, var174, true);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field7206[--field7190];
                class681.method3800(var176, (byte) 127);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field7206[--field7190];
                class647.method3548(var177, 1);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field7206[--field7190];
                class292.method1798((byte) -78, var178, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field7206[--field7190];
                class131.method989(var179, 1);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field7206[--field7190];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field7207[field7211++] = class94.method743(var180, (byte) -50) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field7207[--field7211];
                if (class59.field916 == 2 && var181 < class408.field5515) {
                    field7206[field7190++] = class561.field7436[var181];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class551.field7334 != null) {
                    field7206[field7190++] = class104.method794(false, class551.field7334);
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class551.field7334 != null) {
                    field7207[field7211++] = class156.field2457;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field7207[--field7211];
                if (class551.field7334 != null && var182 < class156.field2457) {
                    field7206[field7190++] = class636.field8571[var182].field3129;
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field7207[--field7211];
                if (class551.field7334 != null && var183 < class156.field2457) {
                    field7207[field7211++] = class636.field8571[var183].field3124;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field7207[--field7211];
                if (class551.field7334 != null && var184 < class156.field2457) {
                    field7207[field7211++] = class636.field8571[var184].field3127;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field7207[field7211++] = class600.field7968;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field7206[--field7190];
                class460.method2618((byte) 110, var185);
                return;
            }
            if (arg0 == 3618) {
                field7207[field7211++] = class355.field4824;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field7206[--field7190];
                class696.method3857((byte) -80, var186);
                return;
            }
            if (arg0 == 3620) {
                class98.method756(false);
                return;
            }
            if (arg0 == 3621) {
                if (class59.field916 == 0) {
                    field7207[field7211++] = -1;
                    return;
                }
                field7207[field7211++] = class18.field311;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field7207[--field7211];
                if (class59.field916 != 0 && var187 < class18.field311) {
                    field7206[field7190++] = class3.field38[var187];
                    if (class260.field3574[var187] != null) {
                        field7206[field7190++] = class260.field3574[var187];
                        return;
                    }
                    field7206[field7190++] = "";
                    return;
                }
                field7206[field7190++] = "";
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field7206[--field7190];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field7207[field7211++] = class591.method3249(var188, 118) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field7207[--field7211];
                if (class636.field8571 != null && var189 < class156.field2457 && class636.field8571[var189].field3128.equalsIgnoreCase(class199.field2897.field5398)) {
                    field7207[field7211++] = 1;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class382.field5102 != null) {
                    field7206[field7190++] = class382.field5102;
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field7207[--field7211];
                if (class551.field7334 != null && var190 < class156.field2457) {
                    field7206[field7190++] = class636.field8571[var190].field3130;
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field7207[--field7211];
                if (class59.field916 == 2 && var191 >= 0 && var191 < class408.field5515) {
                    field7207[field7211++] = class68.field1029[var191] ? 1 : 0;
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field7206[--field7190];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field7207[field7211++] = class244.method1495(var192, 71);
                return;
            }
            if (arg0 == 3629) {
                field7207[field7211++] = class115.field1975;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field7206[--field7190];
                class292.method1798((byte) -78, var193, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field7207[--field7211];
                field7207[field7211++] = class135.field2196[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field7207[--field7211];
                if (class551.field7334 != null && var195 < class156.field2457) {
                    field7206[field7190++] = class636.field8571[var195].field3128;
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field7207[--field7211];
                if (class59.field916 != 0 && var196 < class18.field311) {
                    field7206[field7190++] = class236.field3318[var196];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var197].method1082(8);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var198].field2424;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var199].field2430;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var200].field2429;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var201].field2426;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field7207[--field7211];
                field7207[field7211++] = class656.field8946[var202].field2434;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field7207[--field7211];
                int var204 = class656.field8946[var203].method1080(62);
                field7207[field7211++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field7207[--field7211];
                int var206 = class656.field8946[var205].method1080(126);
                field7207[field7211++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field7207[--field7211];
                int var208 = class656.field8946[var207].method1080(80);
                field7207[field7211++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field7207[--field7211];
                int var210 = class656.field8946[var209].method1080(101);
                field7207[field7211++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field7211 -= 2;
                int var211 = field7207[field7211];
                int var212 = field7207[field7211 + 1];
                field7207[field7211++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field7211 -= 2;
                int var213 = field7207[field7211];
                int var214 = field7207[field7211 + 1];
                field7207[field7211++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field7211 -= 2;
                int var215 = field7207[field7211];
                int var216 = field7207[field7211 + 1];
                field7207[field7211++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field7211 -= 2;
                int var217 = field7207[field7211];
                int var218 = field7207[field7211 + 1];
                field7207[field7211++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field7207[--field7211];
                field7207[field7211++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field7207[--field7211];
                field7207[field7211++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field7211 -= 5;
                int var221 = field7207[field7211];
                int var222 = field7207[field7211 + 1];
                int var223 = field7207[field7211 + 2];
                int var224 = field7207[field7211 + 3];
                int var225 = field7207[field7211 + 4];
                field7207[field7211++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field7211 -= 2;
                long var226 = (long) field7207[field7211];
                long var228 = (long) field7207[field7211 + 1];
                field7207[field7211++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field7211 -= 2;
                int var230 = field7207[field7211];
                int var231 = field7207[field7211 + 1];
                field7207[field7211++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field7211 -= 2;
                int var232 = field7207[field7211];
                int var233 = field7207[field7211 + 1];
                field7207[field7211++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field7211 -= 2;
                int var234 = field7207[field7211];
                int var235 = field7207[field7211 + 1];
                field7207[field7211++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field7211 -= 2;
                int var236 = field7207[field7211];
                int var237 = field7207[field7211 + 1];
                field7207[field7211++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field7211 -= 2;
                int var238 = field7207[field7211];
                int var239 = field7207[field7211 + 1];
                if (var238 == 0) {
                    field7207[field7211++] = 0;
                    return;
                }
                field7207[field7211++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field7211 -= 2;
                int var240 = field7207[field7211];
                int var241 = field7207[field7211 + 1];
                if (var240 == 0) {
                    field7207[field7211++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field7207[field7211++] = Integer.MAX_VALUE;
                    return;
                }
                field7207[field7211++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field7211 -= 2;
                int var242 = field7207[field7211];
                int var243 = field7207[field7211 + 1];
                field7207[field7211++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field7211 -= 2;
                int var244 = field7207[field7211];
                int var245 = field7207[field7211 + 1];
                field7207[field7211++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field7211 -= 2;
                int var246 = field7207[field7211];
                int var247 = field7207[field7211 + 1];
                field7207[field7211++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field7211 -= 2;
                int var248 = field7207[field7211];
                int var249 = field7207[field7211 + 1];
                field7207[field7211++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field7211 -= 3;
                long var250 = (long) field7207[field7211];
                long var252 = (long) field7207[field7211 + 1];
                long var254 = (long) field7207[field7211 + 2];
                field7207[field7211++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field7206[--field7190];
                int var257 = field7207[--field7211];
                field7206[field7190++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field7190 -= 2;
                String var258 = field7206[field7190];
                String var259 = field7206[field7190 + 1];
                field7206[field7190++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field7206[--field7190];
                int var261 = field7207[--field7211];
                field7206[field7190++] = var260 + class660.method3696(var261, true, (byte) 18);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field7206[--field7190];
                field7206[field7190++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field7206[field7190++] = method3014(field7207[--field7211]);
                return;
            }
            if (arg0 == 4105) {
                field7190 -= 2;
                String var263 = field7206[field7190];
                String var264 = field7206[field7190 + 1];
                if (class199.field2897.field5362 != null && class199.field2897.field5362.field5947) {
                    field7206[field7190++] = var264;
                    return;
                }
                field7206[field7190++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field7207[--field7211];
                field7206[field7190++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field7190 -= 2;
                field7207[field7211++] = class119.method930(field7206[field7190 + 1], field7206[field7190], class516.field6892, -1);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field7206[--field7190];
                field7211 -= 2;
                int var267 = field7207[field7211];
                int var268 = field7207[field7211 + 1];
                class511 var269 = class384.method2238(0, var268, (byte) -111, class68.field1035);
                field7207[field7211++] = var269.method2843(80, var266, var267, class391.field5159);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field7206[--field7190];
                field7211 -= 2;
                int var271 = field7207[field7211];
                int var272 = field7207[field7211 + 1];
                class511 var273 = class384.method2238(0, var272, (byte) -107, class68.field1035);
                field7207[field7211++] = var273.method2841(var270, (byte) -94, class391.field5159, var271);
                return;
            }
            if (arg0 == 4110) {
                field7190 -= 2;
                String var274 = field7206[field7190];
                String var275 = field7206[field7190 + 1];
                if (field7207[--field7211] == 1) {
                    field7206[field7190++] = var274;
                    return;
                }
                field7206[field7190++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field7206[--field7190];
                field7206[field7190++] = class115.method917((byte) -124, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field7206[--field7190];
                int var278 = field7207[--field7211];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field7206[field7190++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field7207[--field7211];
                field7207[field7211++] = class697.method3858(8212, (char) var279) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field7207[--field7211];
                field7207[field7211++] = class353.method2102((char) var280, -49) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field7207[--field7211];
                field7207[field7211++] = class154.method1079(7, (char) var281) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field7207[--field7211];
                field7207[field7211++] = class695.method3849(-26, (char) var282) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field7206[--field7190];
                if (var283 != null) {
                    field7207[field7211++] = var283.length();
                    return;
                }
                field7207[field7211++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field7206[--field7190];
                field7211 -= 2;
                int var285 = field7207[field7211];
                int var286 = field7207[field7211 + 1];
                field7206[field7190++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field7206[--field7190];
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
                field7206[field7190++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field7206[--field7190];
                field7211 -= 2;
                int var293 = field7207[field7211];
                int var294 = field7207[field7211 + 1];
                field7207[field7211++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field7190 -= 2;
                String var295 = field7206[field7190];
                String var296 = field7206[field7190 + 1];
                int var297 = field7207[--field7211];
                field7207[field7211++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field7207[--field7211];
                field7207[field7211++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field7207[--field7211];
                field7207[field7211++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field7207[--field7211] != 0;
                int var301 = field7207[--field7211];
                field7206[field7190++] = class411.method2349(0, class516.field6892, (long) var301, 0, var300);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field7206[--field7190];
                int var303 = field7207[--field7211];
                class511 var304 = class384.method2238(0, var303, (byte) -102, class68.field1035);
                field7207[field7211++] = var304.method2838(class391.field5159, var302, (byte) -77);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field7207[--field7211];
                field7206[field7190++] = class193.field2826.method1047(var305, -1).field7679;
                return;
            }
            if (arg0 == 4201) {
                field7211 -= 2;
                int var306 = field7207[field7211];
                int var307 = field7207[field7211 + 1];
                class577 var308 = class193.field2826.method1047(var306, -1);
                if (var307 >= 1 && var307 <= 5 && var308.field7616[var307 - 1] != null) {
                    field7206[field7190++] = var308.field7616[var307 - 1];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 4202) {
                field7211 -= 2;
                int var309 = field7207[field7211];
                int var310 = field7207[field7211 + 1];
                class577 var311 = class193.field2826.method1047(var309, -1);
                if (var310 >= 1 && var310 <= 5 && var311.field7674[var310 - 1] != null) {
                    field7206[field7190++] = var311.field7674[var310 - 1];
                    return;
                }
                field7206[field7190++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field7207[--field7211];
                field7207[field7211++] = class193.field2826.method1047(var312, -1).field7689;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field7207[--field7211];
                field7207[field7211++] = class193.field2826.method1047(var313, -1).field7635 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field7207[--field7211];
                class577 var315 = class193.field2826.method1047(var314, -1);
                if (var315.field7628 == -1 && var315.field7666 >= 0) {
                    field7207[field7211++] = var315.field7666;
                    return;
                }
                field7207[field7211++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field7207[--field7211];
                class577 var317 = class193.field2826.method1047(var316, -1);
                if (var317.field7628 >= 0 && var317.field7666 >= 0) {
                    field7207[field7211++] = var317.field7666;
                    return;
                }
                field7207[field7211++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field7207[--field7211];
                field7207[field7211++] = class193.field2826.method1047(var318, -1).field7636 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field7211 -= 2;
                int var319 = field7207[field7211];
                int var320 = field7207[field7211 + 1];
                class538 var321 = class282.field4001.method3062((byte) -86, var320);
                if (var321.method2974(true)) {
                    field7206[field7190++] = class193.field2826.method1047(var319, -1).method3164(true, var320, var321.field7106);
                    return;
                }
                field7207[field7211++] = class193.field2826.method1047(var319, -1).method3166(var320, (byte) 14, var321.field7101);
                return;
            }
            if (arg0 == 4209) {
                field7211 -= 2;
                int var322 = field7207[field7211];
                int var323 = field7207[field7211 + 1] - 1;
                class577 var324 = class193.field2826.method1047(var322, -1);
                if (var324.field7652 == var323) {
                    field7207[field7211++] = var324.field7637;
                    return;
                }
                if (var324.field7684 == var323) {
                    field7207[field7211++] = var324.field7624;
                    return;
                }
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field7206[--field7190];
                int var326 = field7207[--field7211];
                class457.method2611(true, var325, var326 == 1);
                field7207[field7211++] = class506.field6748;
                return;
            }
            if (arg0 == 4211) {
                if (class629.field8484 != null && class425.field5849 < class506.field6748) {
                    field7207[field7211++] = class629.field8484[class425.field5849++] & 0xFFFF;
                    return;
                }
                field7207[field7211++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class425.field5849 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field7207[--field7211];
                field7207[field7211++] = class193.field2826.method1047(var327, -1).field7659;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field7206[--field7190];
                field7211 -= 3;
                int var329 = field7207[field7211];
                int var330 = field7207[field7211 + 1];
                int var331 = field7207[field7211 + 2];
                class37.method289(0, var331, var330, var328, var329 == 1);
                field7207[field7211++] = class506.field6748;
                return;
            }
            if (arg0 == 4215) {
                field7190 -= 2;
                field7211 -= 2;
                String var332 = field7206[field7190];
                int var333 = field7207[field7211];
                int var334 = field7207[field7211 + 1];
                String var335 = field7206[field7190 + 1];
                class578.method3175(var335, var333 == 1, var332, -1, var334);
                field7207[field7211++] = class506.field6748;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field7211 -= 2;
                int var336 = field7207[field7211];
                int var337 = field7207[field7211 + 1];
                class538 var338 = class282.field4001.method3062((byte) -108, var337);
                if (var338.method2974(true)) {
                    field7206[field7190++] = class239.field3369.method277(var336, (byte) -52).method2394(var337, var338.field7106, (byte) 42);
                    return;
                }
                field7207[field7211++] = class239.field3369.method277(var336, (byte) -52).method2397(0, var338.field7101, var337);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field7211 -= 2;
                int var339 = field7207[field7211];
                int var340 = field7207[field7211 + 1];
                class538 var341 = class282.field4001.method3062((byte) -127, var340);
                if (var341.method2974(true)) {
                    field7206[field7190++] = class470.field6288.method1258(var339, (byte) -37).method484(var341.field7106, var340, (byte) -73);
                    return;
                }
                field7207[field7211++] = class470.field6288.method1258(var339, (byte) -55).method468((byte) 107, var341.field7101, var340);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field7211 -= 2;
                int var342 = field7207[field7211];
                int var343 = field7207[field7211 + 1];
                class538 var344 = class282.field4001.method3062((byte) -106, var343);
                if (var344.method2974(true)) {
                    field7206[field7190++] = class410.field5535.method722(var342, 26).method318(var344.field7106, 1, var343);
                    return;
                }
                field7207[field7211++] = class410.field5535.method722(var342, 26).method320((byte) -33, var343, var344.field7101);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field7207[--field7211];
            class543 var346 = class674.field9537.method2319(var345, (byte) -88);
            if (var346.field7173 != null && var346.field7173.length > 0) {
                int var347 = 0;
                int var348 = var346.field7157[0];
                for (int var349 = 1; var349 < var346.field7173.length; var349++) {
                    if (var346.field7157[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field7157[var349];
                    }
                }
                field7207[field7211++] = var346.field7173[var347];
                return;
            }
            field7207[field7211++] = var346.field7179;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
