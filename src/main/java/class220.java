import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class220 {

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    private static int field3068 = 0;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "[Liv;")
    private static class83[] field3069 = new class83[50];

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    private static int field3082 = 0;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "[I")
    private static int[] field3083 = new int[5];

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "[Ljava/lang/String;")
    private static String[] field3075 = new String[1000];

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "[[I")
    private static int[][] field3084 = new int[5][5000];

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "[I")
    private static int[] field3087 = new int[1000];

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
    private static int field3090 = 0;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3073 = Calendar.getInstance();

    @OriginalMember(owner = "client!dea", name = "A", descriptor = "[I")
    private static int[] field3092 = new int[3];

    @OriginalMember(owner = "client!dea", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field3093 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "Lmf;")
    public static class382 field3091 = new class382(4);

    @OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
    private static int field3094 = 0;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "Lfc;")
    private static class233 field3081;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Lvg;")
    private static class49 field3077;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "Lvg;")
    private static class49 field3085;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "[I")
    private static int[] field3076;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field3074;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 9)
    private static final void method1438(int arg0) {
        class49 var1 = class534.method3038(-94, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class49[] var3 = class277.field4197[var2];
        if (var3 == null) {
            class49[] var4 = class181.field2558[var2];
            int var5 = var4.length;
            var3 = class277.field4197[var2] = new class49[var5];
            class476.method2794(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class476.method2794(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)V", line = 47)
    private static final void method1439(int arg0) {
        class49 var1 = class534.method3038(-89, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class49[] var3 = class277.field4197[var2];
        if (var3 == null) {
            class49[] var4 = class181.field2558[var2];
            int var5 = var4.length;
            var3 = class277.field4197[var2] = new class49[var5];
            class476.method2794(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class476.method2794(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lds;I)V", line = 87)
    private static final void method1440(class14 arg0, int arg1) {
        Object[] var2 = arg0.field122;
        int var3 = (Integer) var2[0];
        class706 var4 = class91.method770(var3, 21768);
        if (var4 == null) {
            return;
        }
        field3076 = new int[var4.field9926];
        int var5 = 0;
        field3074 = new String[var4.field9929];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field126;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field125;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field129 == null ? -1 : arg0.field129.field977;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field130;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field129 == null ? -1 : arg0.field129.field914;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field127 == null ? -1 : arg0.field127.field977;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field127 == null ? -1 : arg0.field127.field914;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field124;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field118;
                }
                field3076[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field117;
                }
                field3074[var6++] = var9;
            }
        }
        field3094 = arg0.field121;
        method1449(var4, arg1);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)V", line = 168)
    private static final void method1441(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field3087[field3090++] = class310.field4595;
                return;
            }
            if (arg0 == 5001) {
                field3090 -= 3;
                class310.field4595 = field3087[field3090];
                class391.field5794 = class177.method1203(field3087[field3090 + 1], (byte) -2);
                if (class391.field5794 == null) {
                    class391.field5794 = class623.field8741;
                }
                class399.field5900 = field3087[field3090 + 2];
                field3089++;
                class135 var2 = class688.method3794(class467.field6712, class583.field8198, (byte) 38);
                var2.field1978.method3853((byte) 51, class310.field4595);
                var2.field1978.method3853((byte) 51, class391.field5794.field5069);
                var2.field1978.method3853((byte) 51, class399.field5900);
                class19.method223(var2, 0);
                return;
            }
            if (arg0 == 5002) {
                field3082 -= 2;
                String var3 = field3075[field3082];
                String var4 = field3075[field3082 + 1];
                field3090 -= 2;
                int var5 = field3087[field3090];
                int var6 = field3087[field3090 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field3067++;
                class135 var7 = class688.method3794(class599.field8467, class583.field8198, (byte) 38);
                var7.field1978.method3853((byte) 51, class652.method3606(12351, var3) + class652.method3606(12351, var4) + 2);
                var7.field1978.method3837(4102, var3);
                var7.field1978.method3853((byte) 51, var5 - 1);
                var7.field1978.method3853((byte) 51, var6);
                var7.field1978.method3837(4102, var4);
                class19.method223(var7, 0);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field3087[--field3090];
                class576 var9 = class546.method3092((byte) -70, var8);
                String var10 = "";
                if (var9 != null && var9.field8104 != null) {
                    var10 = var9.field8104;
                }
                field3075[field3082++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field3087[--field3090];
                class576 var12 = class546.method3092((byte) -90, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8100;
                }
                field3087[field3090++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class391.field5794 == null) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = class391.field5794.field5069;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field3087[--field3090];
                class135 var15 = class688.method3794(class287.field4276, class583.field8198, (byte) 38);
                var15.field1978.method3853((byte) 51, var14);
                class19.method223(var15, 0);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field3075[--field3082];
                method1448(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field3082 -= 2;
                String var17 = field3075[field3082];
                String var18 = field3075[field3082 + 1];
                if (class558.field7877 != 0 || (!class70.field1249 || class379.field5373) && !class100.field1554) {
                    field3066++;
                    class135 var19 = class688.method3794(class395.field5864, class583.field8198, (byte) 38);
                    var19.field1978.method3853((byte) 51, 0);
                    int var20 = var19.field1978.field9761;
                    var19.field1978.method3837(4102, var17);
                    class37.method435(var19.field1978, var18, 123);
                    var19.field1978.method3867(var19.field1978.field9761 - var20, (byte) -92);
                    class19.method223(var19, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field3087[--field3090];
                class576 var22 = class546.method3092((byte) -72, var21);
                String var23 = "";
                if (var22 != null && var22.field8094 != null) {
                    var23 = var22.field8094;
                }
                field3075[field3082++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field3087[--field3090];
                class576 var25 = class546.method3092((byte) -51, var24);
                String var26 = "";
                if (var25 != null && var25.field8106 != null) {
                    var26 = var25.field8106;
                }
                field3075[field3082++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field3087[--field3090];
                class576 var28 = class546.method3092((byte) 30, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8097;
                }
                field3087[field3090++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class648.field9106 == null || class648.field9106.field6949 == null) {
                    var30 = class224.field3152;
                } else {
                    var30 = class648.field9106.method2845(true, -14345);
                }
                field3075[field3082++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field3087[field3090++] = class399.field5900;
                return;
            }
            if (arg0 == 5017) {
                field3087[field3090++] = class107.method844(2);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field3087[--field3090];
                class576 var32 = class546.method3092((byte) -90, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8098;
                }
                field3087[field3090++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field3087[--field3090];
                class576 var35 = class546.method3092((byte) 36, var34);
                String var36 = "";
                if (var35 != null && var35.field8099 != null) {
                    var36 = var35.field8099;
                }
                field3075[field3082++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class648.field9106 == null || class648.field9106.field6949 == null) {
                    var37 = class224.field3152;
                } else {
                    var37 = class648.field9106.method2848(false, (byte) 42);
                }
                field3075[field3082++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field3087[--field3090];
                class576 var39 = class546.method3092((byte) -93, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8096;
                }
                field3087[field3090++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field3087[--field3090];
                class576 var42 = class546.method3092((byte) 117, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8101;
                }
                field3087[field3090++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field3087[--field3090];
                class576 var45 = class546.method3092((byte) -62, var44);
                String var46 = "";
                if (var45 != null && var45.field8102 != null) {
                    var46 = var45.field8102;
                }
                field3075[field3082++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field3087[--field3090];
                field3075[field3082++] = class600.field8483.method3782(var47, 109).field9330;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field3087[--field3090];
                class660 var49 = class600.field8483.method3782(var48, -66);
                if (var49.field9329 == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = var49.field9329.length;
                return;
            }
            if (arg0 == 5052) {
                field3090 -= 2;
                int var50 = field3087[field3090];
                int var51 = field3087[field3090 + 1];
                class660 var52 = class600.field8483.method3782(var50, -52);
                int var53 = var52.field9329[var51];
                field3087[field3090++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field3087[--field3090];
                class660 var55 = class600.field8483.method3782(var54, 102);
                if (var55.field9337 == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = var55.field9337.length;
                return;
            }
            if (arg0 == 5054) {
                field3090 -= 2;
                int var56 = field3087[field3090];
                int var57 = field3087[field3090 + 1];
                field3087[field3090++] = class600.field8483.method3782(var56, 121).field9337[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field3087[--field3090];
                field3075[field3082++] = class452.field6508.method361(-115, var58).method1629(-9598);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field3087[--field3090];
                class239 var60 = class452.field6508.method361(-108, var59);
                if (var60.field3745 == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = var60.field3745.length;
                return;
            }
            if (arg0 == 5057) {
                field3090 -= 2;
                int var61 = field3087[field3090];
                int var62 = field3087[field3090 + 1];
                field3087[field3090++] = class452.field6508.method361(-126, var61).field3745[var62];
                return;
            }
            if (arg0 == 5058) {
                field3081 = new class233();
                field3081.field3623 = field3087[--field3090];
                field3081.field3622 = class452.field6508.method361(-117, field3081.field3623);
                field3081.field3621 = new int[field3081.field3622.method1636(9702)];
                return;
            }
            if (arg0 == 5059) {
                field3086++;
                class135 var63 = class688.method3794(class7.field62, class583.field8198, (byte) 38);
                var63.field1978.method3853((byte) 51, 0);
                int var64 = var63.field1978.field9761;
                var63.field1978.method3853((byte) 51, 0);
                var63.field1978.method3852(false, field3081.field3623);
                field3081.field3622.method1635(field3081.field3621, var63.field1978, (byte) -51);
                var63.field1978.method3867(var63.field1978.field9761 - var64, (byte) -118);
                class19.method223(var63, 0);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field3075[--field3082];
                field3079++;
                class135 var66 = class688.method3794(class264.field4012, class583.field8198, (byte) 38);
                var66.field1978.method3853((byte) 51, 0);
                int var67 = var66.field1978.field9761;
                var66.field1978.method3837(4102, var65);
                var66.field1978.method3852(false, field3081.field3623);
                field3081.field3622.method1635(field3081.field3621, var66.field1978, (byte) -51);
                var66.field1978.method3867(var66.field1978.field9761 - var67, (byte) -43);
                class19.method223(var66, 0);
                return;
            }
            if (arg0 == 5061) {
                field3086++;
                class135 var68 = class688.method3794(class7.field62, class583.field8198, (byte) 38);
                var68.field1978.method3853((byte) 51, 0);
                int var69 = var68.field1978.field9761;
                var68.field1978.method3853((byte) 51, 1);
                var68.field1978.method3852(false, field3081.field3623);
                field3081.field3622.method1635(field3081.field3621, var68.field1978, (byte) -51);
                var68.field1978.method3867(var68.field1978.field9761 - var69, (byte) -70);
                class19.method223(var68, 0);
                return;
            }
            if (arg0 == 5062) {
                field3090 -= 2;
                int var70 = field3087[field3090];
                int var71 = field3087[field3090 + 1];
                field3087[field3090++] = class600.field8483.method3782(var70, 122).field9340[var71];
                return;
            }
            if (arg0 == 5063) {
                field3090 -= 2;
                int var72 = field3087[field3090];
                int var73 = field3087[field3090 + 1];
                field3087[field3090++] = class600.field8483.method3782(var72, -111).field9335[var73];
                return;
            }
            if (arg0 == 5064) {
                field3090 -= 2;
                int var74 = field3087[field3090];
                int var75 = field3087[field3090 + 1];
                if (var75 == -1) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = class600.field8483.method3782(var74, 127).method3659(-1, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field3090 -= 2;
                int var76 = field3087[field3090];
                int var77 = field3087[field3090 + 1];
                if (var77 == -1) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = class600.field8483.method3782(var76, 118).method3661(102, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field3087[--field3090];
                field3087[field3090++] = class452.field6508.method361(-110, var78).method1636(9702);
                return;
            }
            if (arg0 == 5067) {
                field3090 -= 2;
                int var79 = field3087[field3090];
                int var80 = field3087[field3090 + 1];
                int var81 = class452.field6508.method361(-116, var79).method1639(var80, 1).field91;
                field3087[field3090++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field3090 -= 2;
                int var82 = field3087[field3090];
                int var83 = field3087[field3090 + 1];
                field3081.field3621[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field3090 -= 2;
                int var84 = field3087[field3090];
                int var85 = field3087[field3090 + 1];
                field3081.field3621[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field3090 -= 3;
                int var86 = field3087[field3090];
                int var87 = field3087[field3090 + 1];
                int var88 = field3087[field3090 + 2];
                class239 var89 = class452.field6508.method361(-125, var86);
                if (var89.method1639(var87, 1).field91 != 0) {
                    throw new RuntimeException("bad command");
                }
                field3087[field3090++] = var89.method1633(var88, -109, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field3075[--field3082];
                boolean var91 = field3087[--field3090] == 1;
                class228.method1545(var91, var90, false);
                field3087[field3090++] = class111.field1687;
                return;
            }
            if (arg0 == 5072) {
                if (class462.field6664 != null && class35.field615 < class111.field1687) {
                    field3087[field3090++] = class462.field6664[class35.field615++] & 0xFFFF;
                    return;
                }
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class35.field615 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class603.field8514.method1364(true, 86)) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class603.field8514.method1364(true, 82)) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class603.field8514.method1364(true, 81)) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class200.method1334(field3087[--field3090], -18088);
                return;
            }
            if (arg0 == 5201) {
                field3087[field3090++] = class264.method1736(-31485);
                return;
            }
            if (arg0 == 5205) {
                class77.method708(-1, (byte) -5, false, field3087[--field3090], -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field3087[--field3090];
                class326 var93 = class25.method301(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = var93.field4830;
                return;
            }
            if (arg0 == 5207) {
                class326 var94 = class25.method296(field3087[--field3090]);
                if (var94 != null && var94.field4833 != null) {
                    field3075[field3082++] = var94.field4833;
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 5208) {
                field3087[field3090++] = class540.field7557;
                field3087[field3090++] = class47.field728;
                return;
            }
            if (arg0 == 5209) {
                field3087[field3090++] = class25.field365 + class199.field2808;
                field3087[field3090++] = class671.field9481 + class25.field366;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field3087[--field3090];
                class326 var96 = class25.method296(var95);
                if (var96 == null) {
                    field3087[field3090++] = 0;
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = var96.field4814 >> 14 & 0x3FFF;
                field3087[field3090++] = var96.field4814 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field3087[--field3090];
                class326 var98 = class25.method296(var97);
                if (var98 == null) {
                    field3087[field3090++] = 0;
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = var98.field4811 - var98.field4825;
                field3087[field3090++] = var98.field4820 - var98.field4819;
                return;
            }
            if (arg0 == 5212) {
                class627 var99 = class535.method3044(true);
                if (var99 == null) {
                    field3087[field3090++] = -1;
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = var99.field8781;
                int var100 = var99.field8774 << 28 | class25.field365 + var99.field8782 << 14 | class25.field366 + var99.field8777;
                field3087[field3090++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class627 var101 = class655.method3611((byte) 82);
                if (var101 == null) {
                    field3087[field3090++] = -1;
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = var101.field8781;
                int var102 = var101.field8774 << 28 | class25.field365 + var101.field8782 << 14 | class25.field366 + var101.field8777;
                field3087[field3090++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field3087[--field3090];
                class326 var104 = class370.method2239((byte) -92);
                if (var104 != null) {
                    boolean var105 = var104.method2054(var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, 0, var103 & 0x3FFF, field3092);
                    if (var105) {
                        class307.method1952(field3092[2], 6, field3092[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field3090 -= 2;
                int var106 = field3087[field3090];
                int var107 = field3087[field3090 + 1];
                class108 var108 = class25.method293(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class326 var110 = (class326) var108.method849((byte) -128); var110 != null; var110 = (class326) var108.method854((byte) 112)) {
                    if (var110.field4830 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field3087[--field3090];
                class326 var112 = class25.method296(var111);
                if (var112 == null) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = var112.field4816;
                return;
            }
            if (arg0 == 5220) {
                field3087[field3090++] = class658.field9235 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field3087[--field3090];
                class307.method1952(var113 & 0x3FFF, 6, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class326 var114 = class370.method2239((byte) -92);
                if (var114 != null) {
                    boolean var115 = var114.method2051(class671.field9481 + class25.field366, -1, class25.field365 + class199.field2808, field3092);
                    if (var115) {
                        field3087[field3090++] = field3092[1];
                        field3087[field3090++] = field3092[2];
                        return;
                    }
                    field3087[field3090++] = -1;
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = -1;
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field3090 -= 2;
                int var116 = field3087[field3090];
                int var117 = field3087[field3090 + 1];
                class77.method708(var117 >> 14 & 0x3FFF, (byte) -5, false, var116, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field3087[--field3090];
                class326 var119 = class370.method2239((byte) -92);
                if (var119 != null) {
                    boolean var120 = var119.method2054(var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, 0, var118 & 0x3FFF, field3092);
                    if (var120) {
                        field3087[field3090++] = field3092[1];
                        field3087[field3090++] = field3092[2];
                        return;
                    }
                    field3087[field3090++] = -1;
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = -1;
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field3087[--field3090];
                class326 var122 = class370.method2239((byte) -92);
                if (var122 != null) {
                    boolean var123 = var122.method2051(var121 & 0x3FFF, -1, var121 >> 14 & 0x3FFF, field3092);
                    if (var123) {
                        field3087[field3090++] = field3092[1];
                        field3087[field3090++] = field3092[2];
                        return;
                    }
                    field3087[field3090++] = -1;
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = -1;
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class87.method757(-122, field3087[--field3090]);
                return;
            }
            if (arg0 == 5227) {
                field3090 -= 2;
                int var124 = field3087[field3090];
                int var125 = field3087[field3090 + 1];
                class77.method708(var125 >> 14 & 0x3FFF, (byte) -5, true, var124, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class706.field9930 = field3087[--field3090] == 1;
                return;
            }
            if (arg0 == 5229) {
                field3087[field3090++] = class706.field9930 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field3087[--field3090];
                class527.method3021(-2, var126);
                return;
            }
            if (arg0 == 5231) {
                field3090 -= 2;
                int var127 = field3087[field3090];
                boolean var128 = field3087[field3090 + 1] == 1;
                if (class592.field8363 != null) {
                    class665 var129 = class592.field8363.method1405((long) var127, (byte) -22);
                    if (var129 != null && !var128) {
                        var129.method3678(-1);
                        return;
                    }
                    if (var129 == null && var128) {
                        class665 var130 = new class665();
                        class592.field8363.method1403((byte) -18, var130, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field3087[--field3090];
                if (class592.field8363 != null) {
                    class665 var132 = class592.field8363.method1405((long) var131, (byte) -91);
                    field3087[field3090++] = var132 == null ? 0 : 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field3090 -= 2;
                int var133 = field3087[field3090];
                boolean var134 = field3087[field3090 + 1] == 1;
                if (class177.field2527 != null) {
                    class665 var135 = class177.field2527.method1405((long) var133, (byte) -114);
                    if (var135 != null && !var134) {
                        var135.method3678(-1);
                        return;
                    }
                    if (var135 == null && var134) {
                        class665 var136 = new class665();
                        class177.field2527.method1403((byte) -18, var136, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field3087[--field3090];
                if (class177.field2527 != null) {
                    class665 var138 = class177.field2527.method1405((long) var137, (byte) -108);
                    field3087[field3090++] = var138 == null ? 0 : 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field3087[field3090++] = class25.field336 == null ? -1 : class25.field336.field4830;
                return;
            }
            if (arg0 == 5236) {
                field3090 -= 2;
                int var139 = field3087[field3090];
                int var140 = field3087[field3090 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class332.method2086(true, var142, var139, var141);
                if (var143 < 0) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class528.method3025((byte) 3);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field3090 -= 2;
                int var144 = field3087[field3090];
                int var145 = field3087[field3090 + 1];
                class134.method983(3, var144, false, var145, false);
                field3087[field3090++] = class554.field7847 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class554.field7847 != null) {
                    class134.method983(class287.field4270.field3718, -1, false, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class373[] var146 = class578.method3287(true);
                field3087[field3090++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field3087[--field3090];
                class373[] var148 = class578.method3287(true);
                field3087[field3090++] = var148[var147].field5319;
                field3087[field3090++] = var148[var147].field5318;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class287.field4270.field3710;
                int var150 = class287.field4270.field3690;
                int var151 = -1;
                class373[] var152 = class578.method3287(true);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class373 var154 = var152[var153];
                    if (var154.field5319 == var149 && var154.field5318 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field3087[field3090++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field3087[field3090++] = class488.method2836(3);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field3087[--field3090];
                if (var155 >= 1 && var155 <= 2) {
                    class134.method983(var155, -1, false, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field3087[field3090++] = class287.field4270.field3718;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field3087[--field3090];
                if (var156 >= 1 && var156 <= 2) {
                    class287.field4270.field3718 = var156;
                    class287.field4270.method2753(false, class368.field5267);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field3082 -= 2;
                String var157 = field3075[field3082];
                String var158 = field3075[field3082 + 1];
                int var159 = field3087[--field3090];
                field3072++;
                class135 var160 = class688.method3794(class692.field9727, class583.field8198, (byte) 38);
                var160.field1978.method3853((byte) 51, class652.method3606(12351, var157) + class652.method3606(12351, var158) + 1);
                var160.field1978.method3837(4102, var157);
                var160.field1978.method3837(4102, var158);
                var160.field1978.method3853((byte) 51, var159);
                class19.method223(var160, 0);
                return;
            }
            if (arg0 == 5401) {
                field3090 -= 2;
                class58.field1119[field3087[field3090]] = (short) class647.method3591(field3087[field3090 + 1], -30824);
                class41.field682.method2226(36);
                class41.field682.method2229(-14400);
                class393.field5824.method371((byte) -116);
                class158.method1100(100);
                return;
            }
            if (arg0 == 5405) {
                field3090 -= 2;
                int var161 = field3087[field3090];
                int var162 = field3087[field3090 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class131.field1940[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field3090 -= 7;
                int var163 = field3087[field3090];
                int var164 = field3087[field3090 + 1] << 1;
                int var165 = field3087[field3090 + 2];
                int var166 = field3087[field3090 + 3];
                int var167 = field3087[field3090 + 4];
                int var168 = field3087[field3090 + 5];
                int var169 = field3087[field3090 + 6];
                if (var163 >= 0 && var163 < 2 && class131.field1940[var163] != null && var164 >= 0 && var164 < class131.field1940[var163].length) {
                    class131.field1940[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class131.field1940[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class131.field1940[field3087[--field3090]].length >> 1;
                field3087[field3090++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class554.field7847 != null) {
                    class134.method983(class287.field4270.field3718, -1, false, -1, false);
                }
                if (class683.field9634 != null) {
                    class436.method2598(-112);
                    System.exit(0);
                    return;
                }
                String var171 = class28.field408 == null ? class202.method1342(86) : class28.field408;
                class255.method1703(class368.field5267, 2, var171, class328.field4859 == 1, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class573.field8063 != null) {
                    if (class573.field8063.field7019 == null) {
                        var172 = class633.method3535(class573.field8063.field7022, (byte) 54);
                    } else {
                        var172 = (String) class573.field8063.field7019;
                    }
                }
                field3075[field3082++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field3087[field3090++] = class368.field5267.field49 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class554.field7847 != null) {
                    class134.method983(class287.field4270.field3718, -1, false, -1, false);
                }
                String var173 = field3075[--field3082];
                boolean var174 = field3087[--field3090] == 1;
                String var175 = class202.method1342(69) + var173;
                class255.method1703(class368.field5267, 2, var175, class328.field4859 == 1, var174);
                return;
            }
            if (arg0 == 5422) {
                field3082 -= 2;
                String var176 = field3075[field3082];
                String var177 = field3075[field3082 + 1];
                int var178 = field3087[--field3090];
                if (var176.length() > 0) {
                    if (class460.field6589 == null) {
                        class460.field6589 = new String[class351.field5071[class586.field8208.field9738]];
                    }
                    class460.field6589[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class67.field1232 == null) {
                        class67.field1232 = new String[class351.field5071[class586.field8208.field9738]];
                    }
                    class67.field1232[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field3075[--field3082]);
                return;
            }
            if (arg0 == 5424) {
                field3090 -= 11;
                class377.field5361 = field3087[field3090];
                class596.field8426 = field3087[field3090 + 1];
                class55.field1075 = field3087[field3090 + 2];
                class142.field2109 = field3087[field3090 + 3];
                class106.field1639 = field3087[field3090 + 4];
                class630.field8807 = field3087[field3090 + 5];
                class592.field8338 = field3087[field3090 + 6];
                class683.field9633 = field3087[field3090 + 7];
                class640.field9037 = field3087[field3090 + 8];
                class272.field4098 = field3087[field3090 + 9];
                class492.field7006 = field3087[field3090 + 10];
                class703.field9909.method2997((byte) -95, class106.field1639);
                class703.field9909.method2997((byte) -95, class630.field8807);
                class703.field9909.method2997((byte) -95, class592.field8338);
                class703.field9909.method2997((byte) -95, class683.field9633);
                class703.field9909.method2997((byte) -95, class640.field9037);
                class7.field66 = null;
                class641.field9045 = null;
                class296.field4352 = null;
                class44.field706 = null;
                class70.field1252 = null;
                class123.field1862 = null;
                class554.field7854 = null;
                class307.field4549 = null;
                class566.field7979 = true;
                return;
            }
            if (arg0 == 5425) {
                class271.method1787(7);
                class566.field7979 = false;
                return;
            }
            if (arg0 == 5426) {
                field3090 -= 2;
                class200.field2826 = field3087[field3090];
                class102.field1607 = field3087[field3090 + 1];
                return;
            }
            if (arg0 == 5427) {
                field3090 -= 2;
                class231.field3602 = field3087[field3090 + 1];
                return;
            }
            if (arg0 == 5428) {
                field3090 -= 2;
                int var179 = field3087[field3090];
                int var180 = field3087[field3090 + 1];
                field3087[field3090++] = class671.method3720(var180, var179, (byte) 113) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class78.method715(false, 118, field3075[--field3082], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class556.method3150(-21295, class421.field6129, "accountcreated");
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class556.method3150(-21295, class421.field6129, "accountcreatestarted");
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class434.field6342 != null) {
                    Transferable var182 = class434.field6342.getContents(null);
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
                field3075[field3082++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field3090 -= 4;
                int var183 = field3087[field3090];
                int var184 = field3087[field3090 + 1];
                int var185 = field3087[field3090 + 2];
                int var186 = field3087[field3090 + 3];
                class529.method3026(512, (var183 & 0x3FFF) - class203.field2874, var185, var184 << 2, var186, false, (var183 >> 14 & 0x3FFF) - class109.field1672);
                return;
            }
            if (arg0 == 5501) {
                field3090 -= 4;
                int var187 = field3087[field3090];
                int var188 = field3087[field3090 + 1];
                int var189 = field3087[field3090 + 2];
                int var190 = field3087[field3090 + 3];
                class226.method1486(var190, var189, -14208, var188 << 2, (var187 >> 14 & 0x3FFF) - class109.field1672, (var187 & 0x3FFF) - class203.field2874);
                return;
            }
            if (arg0 == 5502) {
                field3090 -= 6;
                int var191 = field3087[field3090];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class450.field6492 = var191;
                int var192 = field3087[field3090 + 1];
                if (var192 + 1 >= class131.field1940[class450.field6492].length >> 1) {
                    throw new RuntimeException();
                }
                class321.field4719 = var192;
                class311.field4612 = 0;
                class279.field4217 = field3087[field3090 + 2];
                class668.field9446 = field3087[field3090 + 3];
                int var193 = field3087[field3090 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class200.field2825 = var193;
                int var194 = field3087[field3090 + 5];
                if (var194 + 1 >= class131.field1940[class200.field2825].length >> 1) {
                    throw new RuntimeException();
                }
                class389.field5775 = var194;
                class43.field700 = 3;
                class666.field9399 = -1;
                class563.field7927 = -1;
                return;
            }
            if (arg0 == 5503) {
                class112.method872((byte) -107);
                return;
            }
            if (arg0 == 5504) {
                field3090 -= 2;
                class59.method631(3, field3087[field3090], 0, field3087[field3090 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field3087[field3090++] = (int) class105.field1635 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field3087[field3090++] = (int) class630.field8811 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class64.method655(true);
                return;
            }
            if (arg0 == 5508) {
                class24.method282(-17);
                return;
            }
            if (arg0 == 5509) {
                class197.method1324(-191);
                return;
            }
            if (arg0 == 5510) {
                class289.method1848(-125);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field3087[--field3090];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class109.field1672;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class199.field2812) {
                    var198 = class199.field2812;
                }
                int var199 = var197 - class203.field2874;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class232.field3611) {
                    var199 = class232.field3611;
                }
                class72.field1267 = (var198 << 9) + 256;
                class124.field1866 = (var199 << 9) + 256;
                class43.field700 = 4;
                class666.field9399 = -1;
                class563.field7927 = -1;
                return;
            }
            if (arg0 == 5512) {
                class374.method2257((byte) 124);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field3087[--field3090];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class109.field1672;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class199.field2812) {
                        var203 = class199.field2812;
                    }
                    int var204 = var202 - class203.field2874;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class232.field3611) {
                        var204 = class232.field3611;
                    }
                    class563.field7927 = (var203 << 9) + 256;
                    class666.field9399 = (var204 << 9) + 256;
                    return;
                }
                class563.field7927 = -1;
                class666.field9399 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field3082 -= 2;
                String var205 = field3075[field3082];
                String var206 = field3075[field3082 + 1];
                int var207 = field3087[--field3090];
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    class224.field3152 = var205;
                    class565.field7973 = var206;
                    class689.field9707 = var207;
                    class112.method868(6, (byte) 12);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class328.method2065(-7);
                return;
            }
            if (arg0 == 5602) {
                if (class676.field9555 == 0) {
                    class227.field3187 = -2;
                    class508.field7174 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field3090 -= 4;
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    class71.method686(field3087[field3090 + 3], field3087[field3090 + 1], 1, field3087[field3090 + 2], field3087[field3090]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field3082--;
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    class524.method3015((byte) -59, class273.method1801(field3075[field3082], -69));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field3082 -= 2;
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    class413.method2485(false, field3075[field3082 + 1], false, class273.method1801(field3075[field3082], -28));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class594.field8391 == 0) {
                    class513.field7244 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field3087[field3090++] = class508.field7174;
                return;
            }
            if (arg0 == 5608) {
                field3087[field3090++] = class59.field1134;
                return;
            }
            if (arg0 == 5609) {
                field3087[field3090++] = class513.field7244;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field3075[field3082++] = class703.field9912 == null || class703.field9912.length <= var208 ? "" : class157.method1093(class703.field9912[var208], (byte) -117);
                }
                class703.field9912 = null;
                return;
            }
            if (arg0 == 5611) {
                field3087[field3090++] = class109.field1675;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field3087[--field3090];
                if (class420.field6113 != 7) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    if (class274.field4181 != null) {
                        class274.field4181.method2234(false);
                        class274.field4181 = null;
                    }
                    class689.field9707 = var209;
                    class112.method868(9, (byte) -112);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field3087[field3090++] = class508.field7174;
                return;
            }
            if (arg0 == 5615) {
                field3082 -= 2;
                String var210 = field3075[field3082];
                String var211 = field3075[field3082 + 1];
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    if (class274.field4181 != null) {
                        class274.field4181.method2234(false);
                        class274.field4181 = null;
                    }
                    class224.field3152 = var210;
                    class565.field7973 = var211;
                    class112.method868(5, (byte) -118);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class88.method764(0, false);
                return;
            }
            if (arg0 == 5617) {
                field3087[field3090++] = class227.field3187;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field3087[--field3090];
                class284.method1834((byte) 68, var212, false);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field3087[--field3090];
                class284.method1834((byte) -124, var213, true);
                return;
            }
            if (arg0 == 5620) {
                class7.method40((byte) -22);
                if (class103.field1615 != "" && class103.field1615 != "") {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field3082 -= 2;
                if (class420.field6113 != 3) {
                    return;
                }
                if (class676.field9555 == 0 && class594.field8391 == 0) {
                    class413.method2485(false, field3075[field3082 + 1], true, class273.method1801(field3075[field3082], 120));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class494 var214 = class368.field5267.method14(false, "3", 113);
                while (var214.field7024 == 0) {
                    class561.method3202(1L, (byte) -86);
                }
                if (var214.field7024 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class203 var215 = (class203) var214.field7019;
                if (var215.method1348(13427).exists()) {
                    class695 var216 = new class695(50);
                    try {
                        var215.method1345(50, 0, var216.field9796, -4290);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method1344((byte) 124);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class87.field1469 != null) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field3087[field3090++] = (int) (class254.field3901 >> 32);
                field3087[field3090++] = (int) (class254.field3901 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field3087[--field3090];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class287.field4270.field3725 = var217;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6002) {
                class287.field4270.method2752(field3087[--field3090] == 1, 115);
                class705.method3923(4);
                class315.method1987((byte) -27);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6003) {
                class287.field4270.field3684 = field3087[--field3090] == 1;
                class315.method1987((byte) -98);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6005) {
                class287.field4270.field3714 = field3087[--field3090] == 1;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6006) {
                class287.field4270.field3694 = field3087[--field3090] == 1;
                class282.field4228.method125(!class287.field4270.field3694);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6007) {
                class287.field4270.field3711 = field3087[--field3090];
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6008) {
                class287.field4270.field3723 = field3087[--field3090] == 1;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6009) {
                class287.field4270.field3688 = field3087[--field3090] == 1;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6010) {
                class287.field4270.field3721 = field3087[--field3090] == 1;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field3087[--field3090];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class287.field4270.method1626(-7152, class328.field4859, var218);
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6012) {
                class287.field4270.method1623(class328.field4859, field3087[--field3090] == 1, 1);
                class496.method2869(126);
                class646.method3587((byte) -115);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6014) {
                class287.field4270.field3705 = field3087[--field3090] == 1;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6015) {
                class287.field4270.field3681 = field3087[--field3090] == 1;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field3087[--field3090];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class287.field4270.field3706 = var219;
                class33.method363(-30052, class328.field4859);
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6017) {
                class287.field4270.field3716 = field3087[--field3090] == 1;
                class184.method1234((byte) 39);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field3087[--field3090];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class287.field4270.field3697 = var220;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field3087[--field3090];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class287.field4270.field3701 != var221) {
                    if (class287.field4270.field3701 == 0 && class392.field5800 != -1) {
                        class345.method2142(var221, 0, 0, class652.field9171, false, class392.field5800);
                        class43.field701 = false;
                    } else if (var221 == 0) {
                        class691.method3804(true);
                        class43.field701 = false;
                    } else {
                        class457.method2687(var221, (byte) 116);
                    }
                    class287.field4270.field3701 = var221;
                }
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field3087[--field3090];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class287.field4270.field3687 = var222;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6021) {
                class287.field4270.field6680 = field3087[--field3090] == 1;
                class315.method1987((byte) -36);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field3087[--field3090];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class266.field4022 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class197.method1325(true, var223);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                field3087[field3090++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field3087[--field3090];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class287.field4270.field3707 = var225;
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field3087[--field3090];
                if (var226 < 0 || var226 > class569.method3242(class266.field4022, 128)) {
                    var226 = 0;
                }
                class287.field4270.field3699 = var226;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field3087[--field3090];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class224.method1479(var227 == 1, 17016);
                return;
            }
            if (arg0 == 6028) {
                class287.field4270.field3698 = field3087[--field3090] != 0;
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6029) {
                class287.field4270.field3711 = field3087[--field3090];
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6030) {
                class287.field4270.field3683 = field3087[--field3090] != 0;
                class287.field4270.method2753(false, class368.field5267);
                class705.method3923(4);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field3087[--field3090];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class33.method363(-30052, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field3087[--field3090];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class287.field4270.field3722 = var229;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field3087[--field3090];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class287.field4270.field3682 = var230;
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6034) {
                class287.field4270.field3724 = field3087[--field3090] == 1;
                class287.field4270.method2753(false, class368.field5267);
                class496.method2869(124);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6035) {
                class287.field4270.field6679 = field3087[--field3090] == 1;
                class705.method3923(4);
                class315.method1987((byte) 114);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field3087[--field3090];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class287.field4270.method2748(var231, 2);
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field3087[--field3090];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class287.field4270.field3691 = var232;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field3087[--field3090];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class287.field4270.field3704 != var233 && class392.field5800 == class150.field2178) {
                    if (class287.field4270.field3704 == 0) {
                        class345.method2142(var233, 0, 0, class652.field9171, false, class392.field5800);
                        class43.field701 = false;
                    } else if (var233 == 0) {
                        class691.method3804(true);
                        class43.field701 = false;
                    } else {
                        class457.method2687(var233, (byte) 113);
                    }
                }
                class287.field4270.field3704 = var233;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field3087[--field3090];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class287.field4270.field3703 != var234) {
                    class287.field4270.field3703 = var234;
                    class287.field4270.method2753(false, class368.field5267);
                    class227.field3189 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field3087[field3090++] = class287.field4270.field3725;
                return;
            }
            if (arg0 == 6102) {
                field3087[field3090++] = class287.field4270.method2742(false, class328.field4859) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field3087[field3090++] = class287.field4270.field3684 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field3087[field3090++] = class287.field4270.field3714 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field3087[field3090++] = class287.field4270.field3694 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field3087[field3090++] = class287.field4270.field3711;
                return;
            }
            if (arg0 == 6108) {
                field3087[field3090++] = class287.field4270.field3723 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field3087[field3090++] = class287.field4270.field3688 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field3087[field3090++] = class287.field4270.field3721 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field3087[field3090++] = class287.field4270.method1625(-119, class328.field4859);
                return;
            }
            if (arg0 == 6112) {
                field3087[field3090++] = class287.field4270.method1624(10814, class328.field4859) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field3087[field3090++] = class287.field4270.field3705 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field3087[field3090++] = class287.field4270.field3681 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field3087[field3090++] = class287.field4270.field3706;
                return;
            }
            if (arg0 == 6117) {
                field3087[field3090++] = class287.field4270.field3716 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field3087[field3090++] = class287.field4270.field3697;
                return;
            }
            if (arg0 == 6119) {
                field3087[field3090++] = class287.field4270.field3701;
                return;
            }
            if (arg0 == 6120) {
                field3087[field3090++] = class287.field4270.field3687;
                return;
            }
            if (arg0 == 6121) {
                field3087[field3090++] = class282.field4228.method106() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field3087[field3090++] = class333.method2100((byte) 124);
                return;
            }
            if (arg0 == 6124) {
                field3087[field3090++] = class287.field4270.field3707;
                return;
            }
            if (arg0 == 6125) {
                field3087[field3090++] = class287.field4270.field3699;
                return;
            }
            if (arg0 == 6126) {
                field3087[field3090++] = class282.field4228.method216() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field3087[field3090++] = class287.field4270.field3700 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field3087[field3090++] = class287.field4270.field3698 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field3087[field3090++] = class287.field4270.field3711;
                return;
            }
            if (arg0 == 6130) {
                field3087[field3090++] = class287.field4270.field3683 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field3087[field3090++] = class328.field4859;
                return;
            }
            if (arg0 == 6132) {
                field3087[field3090++] = class287.field4270.field3722;
                return;
            }
            if (arg0 == 6133) {
                field3087[field3090++] = class368.field5267.field49 && !class368.field5267.field47 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field3087[field3090++] = class569.method3242(class266.field4022, 128);
                return;
            }
            if (arg0 == 6135) {
                field3087[field3090++] = class287.field4270.field3682;
                return;
            }
            if (arg0 == 6136) {
                field3087[field3090++] = class287.field4270.field3724 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field3087[field3090++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field3087[field3090++] = class416.method2496(-45, 200, class328.field4859);
                return;
            }
            if (arg0 == 6139) {
                field3087[field3090++] = class287.field4270.method2749((byte) 4, class328.field4859);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class619.method3446(class328.field4859, 2) && class266.field4022 < 96) {
                    var236 = 1;
                }
                field3087[field3090++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class266.field4022 < 96) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field3087[field3090++] = class287.field4270.field3691;
                return;
            }
            if (arg0 == 6143) {
                field3087[field3090++] = class287.field4270.field3704;
                return;
            }
            if (arg0 == 6144) {
                field3087[field3090++] = class88.field1482 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field3087[field3090++] = class287.field4270.field3703;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field3090 -= 2;
                class139.field2031 = (short) field3087[field3090];
                if (class139.field2031 <= 0) {
                    class139.field2031 = 256;
                }
                class416.field6044 = (short) field3087[field3090 + 1];
                if (class416.field6044 <= 0) {
                    class416.field6044 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field3090 -= 2;
                class352.field5074 = (short) field3087[field3090];
                if (class352.field5074 <= 0) {
                    class352.field5074 = 256;
                }
                class141.field2081 = (short) field3087[field3090 + 1];
                if (class141.field2081 <= 0) {
                    class141.field2081 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field3090 -= 4;
                class690.field9708 = (short) field3087[field3090];
                if (class690.field9708 <= 0) {
                    class690.field9708 = 1;
                }
                class413.field6012 = (short) field3087[field3090 + 1];
                if (class413.field6012 <= 0) {
                    class413.field6012 = 32767;
                } else if (class413.field6012 < class690.field9708) {
                    class413.field6012 = class690.field9708;
                }
                class55.field1076 = (short) field3087[field3090 + 2];
                if (class55.field1076 <= 0) {
                    class55.field1076 = 1;
                }
                class296.field4367 = (short) field3087[field3090 + 3];
                if (class296.field4367 <= 0) {
                    class296.field4367 = 32767;
                    return;
                }
                if (class296.field4367 < class55.field1076) {
                    class296.field4367 = class55.field1076;
                }
                return;
            }
            if (arg0 == 6203) {
                class124.method945(false, 0, class575.field8091.field877, -16777216, class575.field8091.field967, 0);
                field3087[field3090++] = class626.field8769;
                field3087[field3090++] = class56.field1094;
                return;
            }
            if (arg0 == 6204) {
                field3087[field3090++] = class352.field5074;
                field3087[field3090++] = class141.field2081;
                return;
            }
            if (arg0 == 6205) {
                field3087[field3090++] = class139.field2031;
                field3087[field3090++] = class416.field6044;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field3087[field3090++] = (int) (class490.method2840(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field3087[field3090++] = (int) (class490.method2840(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field3090 -= 3;
                int var237 = field3087[field3090];
                int var238 = field3087[field3090 + 1];
                int var239 = field3087[field3090 + 2];
                field3073.clear();
                field3073.set(11, 12);
                field3073.set(var239, var238, var237);
                int var240 = (int) (field3073.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field3087[field3090++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field3073.clear();
                field3073.setTime(new Date(class490.method2840(true)));
                field3087[field3090++] = field3073.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field3087[--field3090];
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
                field3087[field3090++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field3087[field3090++] = class668.method3703(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field3087[field3090++] = class388.method2391((byte) 3) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class420.field6113 == 7 && class676.field9555 == 0 && class594.field8391 == 0) {
                    if (class236.field3663) {
                        field3087[field3090++] = 0;
                        return;
                    }
                    if (class182.field2582 > class490.method2840(true) - 1000L) {
                        field3087[field3090++] = 1;
                        return;
                    }
                    class236.field3663 = true;
                    class135 var243 = class688.method3794(class600.field8479, class583.field8198, (byte) 38);
                    var243.field1978.method3868(class124.field1871, -318419336);
                    class19.method223(var243, 0);
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class178 var244 = class130.method968(true);
                if (var244 != null) {
                    field3087[field3090++] = var244.field2535;
                    field3087[field3090++] = var244.field2920;
                    field3075[field3082++] = var244.field2539;
                    class386 var245 = var244.method1208(-62);
                    field3087[field3090++] = var245.field5438;
                    field3075[field3082++] = var245.field5434;
                    field3087[field3090++] = var244.field2928;
                    field3087[field3090++] = var244.field2540;
                    field3075[field3082++] = var244.field2532;
                    return;
                }
                field3087[field3090++] = -1;
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 6502) {
                class178 var246 = class467.method2761(-16192);
                if (var246 != null) {
                    field3087[field3090++] = var246.field2535;
                    field3087[field3090++] = var246.field2920;
                    field3075[field3082++] = var246.field2539;
                    class386 var247 = var246.method1208(-62);
                    field3087[field3090++] = var247.field5438;
                    field3075[field3082++] = var247.field5434;
                    field3087[field3090++] = var246.field2928;
                    field3087[field3090++] = var246.field2540;
                    field3075[field3082++] = var246.field2532;
                    return;
                }
                field3087[field3090++] = -1;
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field3087[--field3090];
                String var249 = field3075[--field3082];
                if (class420.field6113 == 7 && class676.field9555 == 0 && class594.field8391 == 0) {
                    field3087[field3090++] = class669.method3710((byte) 112, var248, var249) ? 1 : 0;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class287.field4270.field3695 = field3087[--field3090];
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6505) {
                field3087[field3090++] = class287.field4270.field3695;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field3087[--field3090];
                class178 var251 = class508.method2918(100, var250);
                if (var251 != null) {
                    field3087[field3090++] = var251.field2920;
                    field3075[field3082++] = var251.field2539;
                    class386 var252 = var251.method1208(-119);
                    field3087[field3090++] = var252.field5438;
                    field3075[field3082++] = var252.field5434;
                    field3087[field3090++] = var251.field2928;
                    field3087[field3090++] = var251.field2540;
                    field3075[field3082++] = var251.field2532;
                    return;
                }
                field3087[field3090++] = -1;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                field3087[field3090++] = 0;
                field3087[field3090++] = 0;
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 6507) {
                field3090 -= 4;
                int var253 = field3087[field3090];
                boolean var254 = field3087[field3090 + 1] == 1;
                int var255 = field3087[field3090 + 2];
                boolean var256 = field3087[field3090 + 3] == 1;
                class641.method3572(var253, var255, var254, var256, true);
                return;
            }
            if (arg0 == 6508) {
                class701.method3906((byte) 120);
                return;
            }
            if (arg0 == 6509) {
                if (class420.field6113 != 7) {
                    return;
                }
                class571.field8038 = field3087[--field3090] == 1;
                return;
            }
            if (arg0 == 6510) {
                field3087[field3090++] = class143.field2113;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class287.field4270.field3685 = field3087[--field3090] == 1;
                class287.field4270.method2753(false, class368.field5267);
                return;
            }
            if (arg0 == 6601) {
                field3087[field3090++] = class287.field4270.field3685 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class205.field2892 == class103.field1617) {
            if (arg0 == 6700) {
                int var257 = class654.field9178.method1404((byte) -93);
                if (class100.field1556 != -1) {
                    var257++;
                }
                field3087[field3090++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field3087[--field3090];
                if (class100.field1556 != -1) {
                    if (var258 == 0) {
                        field3087[field3090++] = class100.field1556;
                        return;
                    }
                    var258--;
                }
                class320 var259 = (class320) class654.field9178.method1407(115);
                while (var258-- > 0) {
                    var259 = (class320) class654.field9178.method1413(true);
                }
                field3087[field3090++] = var259.field4703;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field3087[--field3090];
                if (class181.field2558[var260] == null) {
                    field3075[field3082++] = "";
                    return;
                }
                String var261 = class181.field2558[var260][0].field872;
                if (var261 == null) {
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field3087[--field3090];
                if (class181.field2558[var262] == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = class181.field2558[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field3090 -= 2;
                int var263 = field3087[field3090];
                int var264 = field3087[field3090 + 1];
                if (class181.field2558[var263] == null) {
                    field3075[field3082++] = "";
                    return;
                }
                String var265 = class181.field2558[var263][var264].field872;
                if (var265 == null) {
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field3090 -= 2;
                int var266 = field3087[field3090];
                int var267 = field3087[field3090 + 1];
                if (class181.field2558[var266] == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = class181.field2558[var266][var267].field956;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field3090 -= 3;
                int var268 = field3087[field3090];
                int var269 = field3087[field3090 + 1];
                int var270 = field3087[field3090 + 2];
                class53.method585(1, var268 << 16 | var269, var270, -2, "");
                return;
            }
            if (arg0 == 6708) {
                field3090 -= 3;
                int var271 = field3087[field3090];
                int var272 = field3087[field3090 + 1];
                int var273 = field3087[field3090 + 2];
                class53.method585(2, var271 << 16 | var272, var273, -2, "");
                return;
            }
            if (arg0 == 6709) {
                field3090 -= 3;
                int var274 = field3087[field3090];
                int var275 = field3087[field3090 + 1];
                int var276 = field3087[field3090 + 2];
                class53.method585(3, var274 << 16 | var275, var276, -2, "");
                return;
            }
            if (arg0 == 6710) {
                field3090 -= 3;
                int var277 = field3087[field3090];
                int var278 = field3087[field3090 + 1];
                int var279 = field3087[field3090 + 2];
                class53.method585(4, var277 << 16 | var278, var279, -2, "");
                return;
            }
            if (arg0 == 6711) {
                field3090 -= 3;
                int var280 = field3087[field3090];
                int var281 = field3087[field3090 + 1];
                int var282 = field3087[field3090 + 2];
                class53.method585(5, var280 << 16 | var281, var282, -2, "");
                return;
            }
            if (arg0 == 6712) {
                field3090 -= 3;
                int var283 = field3087[field3090];
                int var284 = field3087[field3090 + 1];
                int var285 = field3087[field3090 + 2];
                class53.method585(6, var283 << 16 | var284, var285, -2, "");
                return;
            }
            if (arg0 == 6713) {
                field3090 -= 3;
                int var286 = field3087[field3090];
                int var287 = field3087[field3090 + 1];
                int var288 = field3087[field3090 + 2];
                class53.method585(7, var286 << 16 | var287, var288, -2, "");
                return;
            }
            if (arg0 == 6714) {
                field3090 -= 3;
                int var289 = field3087[field3090];
                int var290 = field3087[field3090 + 1];
                int var291 = field3087[field3090 + 2];
                class53.method585(8, var289 << 16 | var290, var291, -2, "");
                return;
            }
            if (arg0 == 6715) {
                field3090 -= 3;
                int var292 = field3087[field3090];
                int var293 = field3087[field3090 + 1];
                int var294 = field3087[field3090 + 2];
                class53.method585(9, var292 << 16 | var293, var294, -2, "");
                return;
            }
            if (arg0 == 6716) {
                field3090 -= 3;
                int var295 = field3087[field3090];
                int var296 = field3087[field3090 + 1];
                int var297 = field3087[field3090 + 2];
                class53.method585(10, var295 << 16 | var296, var297, -2, "");
                return;
            }
            if (arg0 == 6717) {
                field3090 -= 3;
                int var298 = field3087[field3090];
                int var299 = field3087[field3090 + 1];
                int var300 = field3087[field3090 + 2];
                class49 var301 = class639.method3557(var298 << 16 | var299, var300, 1);
                class272.method1794(111);
                class132 var302 = client.method1767(var301);
                class431.method2573(0, var302.field1952, var302.method974(-2090995594), var301);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field3087[--field3090];
                class588 var304 = class255.field3916.method812((byte) -79, var303);
                if (var304.field8265 == null) {
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = var304.field8265;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field3087[--field3090];
                class588 var306 = class255.field3916.method812((byte) -103, var305);
                field3087[field3090++] = var306.field8237;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field3087[--field3090];
                class588 var308 = class255.field3916.method812((byte) 97, var307);
                field3087[field3090++] = var308.field8252;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field3087[--field3090];
                class588 var310 = class255.field3916.method812((byte) 80, var309);
                field3087[field3090++] = var310.field8246;
                return;
            }
            if (arg0 == 6804) {
                field3090 -= 2;
                int var311 = field3087[field3090];
                int var312 = field3087[field3090 + 1];
                class262 var313 = class329.field4869.method3552(var312, -123);
                if (var313.method1719(-120)) {
                    field3075[field3082++] = class255.field3916.method812((byte) -60, var311).method3337(var313.field3981, var312, -118);
                    return;
                }
                field3087[field3090++] = class255.field3916.method812((byte) 88, var311).method3332(var313.field3986, var312, 11211);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field3087[field3090++] = class70.field1249 && !class379.field5373 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field3087[field3090++] = class129.field1900;
                return;
            }
            if (arg0 == 6902) {
                field3087[field3090++] = class356.field5108;
                return;
            }
            if (arg0 == 6903) {
                field3087[field3090++] = class57.field1097;
                return;
            }
            if (arg0 == 6904) {
                field3087[field3090++] = class262.field3978;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class573.field8063 != null) {
                    if (class573.field8063.field7019 == null) {
                        var314 = class633.method3535(class573.field8063.field7022, (byte) 54);
                    } else {
                        var314 = (String) class573.field8063.field7019;
                    }
                }
                field3075[field3082++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field3087[field3090++] = class395.field5868;
                return;
            }
            if (arg0 == 6907) {
                field3087[field3090++] = class16.field173;
                return;
            }
            if (arg0 == 6908) {
                field3087[field3090++] = class531.field7449;
                return;
            }
            if (arg0 == 6909) {
                field3087[field3090++] = class66.field1220 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field3087[field3090++] = class231.field3605;
                return;
            }
            if (arg0 == 6911) {
                field3087[field3090++] = class442.field6445;
                return;
            }
            if (arg0 == 6912) {
                field3087[field3090++] = class686.field9677;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class287.field4270.method2757((byte) 123);
                field3087[field3090++] = class287.field4270.field6685 = class328.field4859;
                field3087[field3090++] = var315;
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7001) {
                class287.field4270.method2744((byte) 94);
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7002) {
                class287.field4270.method2745(-9489);
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7003) {
                class287.field4270.method2743((byte) 78);
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7004) {
                class287.field4270.method2751(94, true);
                class705.method3923(4);
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7005) {
                class287.field4270.field3708 = 0;
                class287.field4270.method2753(false, class368.field5267);
                class227.field3189 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class287.field4270.field6685 == 2) {
                    class287.field4270.field6690 = true;
                    return;
                }
                if (class287.field4270.field6685 == 1) {
                    class287.field4270.field6697 = true;
                    return;
                }
                if (class287.field4270.field6685 == 3) {
                    class287.field4270.field6701 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field3087[field3090++] = class287.field4270.field3708;
                return;
            }
            if (arg0 == 7008) {
                if (class328.field4859 == 0 && class266.field4022 < 96) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(IZ)V", line = 3797)
    public static final void method1442(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lds;)V", line = 3809)
    public static final void method1443(class14 arg0) {
        method1440(arg0, 200000);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "()V", line = 3811)
    public static final void method1444() {
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(IZ)V", line = 3822)
    private static final void method1445(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field3090 -= 3;
                int var2 = field3087[field3090];
                int var3 = field3087[field3090 + 1];
                int var4 = field3087[field3090 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class49 var5 = class534.method3038(-96, var2);
                if (var5.field1014 == null) {
                    var5.field1014 = new class49[var4 + 1];
                }
                if (var5.field1014.length <= var4) {
                    class49[] var6 = new class49[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1014.length; var7++) {
                        var6[var7] = var5.field1014[var7];
                    }
                    var5.field1014 = var6;
                }
                if (var4 > 0 && var5.field1014[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class49 var8 = new class49();
                var8.field980 = var3;
                var8.field885 = var8.field977 = var5.field977;
                var8.field914 = var4;
                var5.field1014[var4] = var8;
                if (arg1) {
                    field3077 = var8;
                } else {
                    field3085 = var8;
                }
                class563.method3215(true, var5);
                return;
            }
            if (arg0 == 101) {
                class49 var9 = arg1 ? field3077 : field3085;
                if (var9.field914 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class49 var10 = class534.method3038(-118, var9.field977);
                var10.field1014[var9.field914] = null;
                class563.method3215(true, var10);
                return;
            }
            if (arg0 == 102) {
                class49 var11 = class534.method3038(-91, field3087[--field3090]);
                var11.field1014 = null;
                class563.method3215(true, var11);
                return;
            }
            if (arg0 == 200) {
                field3090 -= 2;
                int var12 = field3087[field3090];
                int var13 = field3087[field3090 + 1];
                class49 var14 = class639.method3557(var12, var13, 1);
                if (var14 != null && var13 != -1) {
                    field3087[field3090++] = 1;
                    if (arg1) {
                        field3077 = var14;
                        return;
                    }
                    field3085 = var14;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field3087[--field3090];
                class49 var16 = class534.method3038(-110, var15);
                if (var16 != null) {
                    field3087[field3090++] = 1;
                    if (arg1) {
                        field3077 = var16;
                        return;
                    }
                    field3085 = var16;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field3087[--field3090];
                method1438(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field3087[--field3090];
                method1439(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field3090 -= 2;
                int var19 = field3087[field3090];
                int var20 = field3087[field3090 + 1];
                for (int var21 = 0; var21 < class235.field3640.length; var21++) {
                    if (class235.field3640[var21] == var19) {
                        class648.field9106.field6993.method2907(var20, var21, Integer.MIN_VALUE, class145.field2120);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class550.field7754.length; var22++) {
                    if (class550.field7754[var22] == var19) {
                        class648.field9106.field6993.method2907(var20, var22, Integer.MIN_VALUE, class145.field2120);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field3090 -= 2;
                int var23 = field3087[field3090];
                int var24 = field3087[field3090 + 1];
                class648.field9106.field6993.method2901(var23, var24, 72);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field3087[--field3090] != 0;
                class648.field9106.field6993.method2909(12, var25);
                return;
            }
            if (arg0 == 411) {
                field3090 -= 2;
                int var26 = field3087[field3090];
                int var27 = field3087[field3090 + 1];
                class648.field9106.field6993.method2911(var26, var27, class41.field682, -1);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class49 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class534.method3038(-85, field3087[--field3090]);
            } else {
                var28 = arg1 ? field3077 : field3085;
            }
            if (arg0 == 1000) {
                field3090 -= 4;
                var28.field869 = field3087[field3090];
                var28.field926 = field3087[field3090 + 1];
                int var29 = field3087[field3090 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field3087[field3090 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field940 = (byte) var29;
                var28.field873 = (byte) var30;
                class563.method3215(true, var28);
                class282.method1829(-82, var28);
                if (var28.field914 == -1) {
                    class512.method2931(var28.field977, 66);
                }
                return;
            }
            if (arg0 == 1001) {
                field3090 -= 4;
                var28.field975 = field3087[field3090];
                var28.field971 = field3087[field3090 + 1];
                var28.field938 = 0;
                var28.field865 = 0;
                int var31 = field3087[field3090 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field3087[field3090 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field917 = (byte) var31;
                var28.field970 = (byte) var32;
                class563.method3215(true, var28);
                class282.method1829(126, var28);
                if (var28.field980 == 0) {
                    class391.method2407(0, var28, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field3087[--field3090] == 1;
                if (var28.field937 != var33) {
                    var28.field937 = var33;
                    class563.method3215(true, var28);
                }
                if (var28.field914 == -1) {
                    class696.method3883(var28.field977, 0);
                }
                return;
            }
            if (arg0 == 1004) {
                field3090 -= 2;
                var28.field882 = field3087[field3090];
                var28.field997 = field3087[field3090 + 1];
                class563.method3215(true, var28);
                class282.method1829(126, var28);
                if (var28.field980 == 0) {
                    class391.method2407(0, var28, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field899 = field3087[--field3090] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class49 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class534.method3038(-88, field3087[--field3090]);
            } else {
                var34 = arg1 ? field3077 : field3085;
            }
            if (arg0 == 1100) {
                field3090 -= 2;
                var34.field909 = field3087[field3090];
                if (var34.field909 > var34.field1021 - var34.field967) {
                    var34.field909 = var34.field1021 - var34.field967;
                }
                if (var34.field909 < 0) {
                    var34.field909 = 0;
                }
                var34.field891 = field3087[field3090 + 1];
                if (var34.field891 > var34.field921 - var34.field877) {
                    var34.field891 = var34.field921 - var34.field877;
                }
                if (var34.field891 < 0) {
                    var34.field891 = 0;
                }
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class207.method1371(var34.field977, 12);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field972 = field3087[--field3090];
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class56.method608(var34.field977, true);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field955 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field893 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field933 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field3087[--field3090];
                if (var34.field908 != var35) {
                    var34.field908 = var35;
                    class563.method3215(true, var34);
                }
                if (var34.field914 == -1) {
                    class115.method901(-80, var34.field977);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field1001 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field876 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field927 = 1;
                var34.field1004 = field3087[--field3090];
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class363.method2205((byte) -81, var34.field977);
                }
                return;
            }
            if (arg0 == 1109) {
                field3090 -= 6;
                var34.field954 = field3087[field3090];
                var34.field859 = field3087[field3090 + 1];
                var34.field913 = field3087[field3090 + 2];
                var34.field1011 = field3087[field3090 + 3];
                var34.field858 = field3087[field3090 + 4];
                var34.field923 = field3087[field3090 + 5];
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class599.method3390(var34.field977, 8);
                    class705.method3925(10, var34.field977);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field3087[--field3090];
                if (var34.field895 != var36) {
                    var34.field895 = var36;
                    var34.field886 = 0;
                    var34.field942 = 1;
                    var34.field870 = 0;
                    class30 var37 = var34.field895 == -1 ? null : class188.field2708.method2140(var34.field895, 125);
                    if (var37 != null) {
                        class207.method1372(var37, 5121, var34.field886);
                    }
                    class563.method3215(true, var34);
                }
                if (var34.field914 == -1) {
                    class203.method1347(true, var34.field977);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field901 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field3075[--field3082];
                if (!var38.equals(var34.field950)) {
                    var34.field950 = var38;
                    class563.method3215(true, var34);
                }
                if (var34.field914 == -1) {
                    class233.method1599(var34.field977, -14514);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field889 = field3087[--field3090];
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class270.method1759(16, var34.field977);
                }
                return;
            }
            if (arg0 == 1114) {
                field3090 -= 3;
                var34.field860 = field3087[field3090];
                var34.field932 = field3087[field3090 + 1];
                var34.field960 = field3087[field3090 + 2];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field989 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field898 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field995 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field861 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field1024 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1120) {
                field3090 -= 2;
                var34.field1021 = field3087[field3090];
                var34.field921 = field3087[field3090 + 1];
                class563.method3215(true, var34);
                if (var34.field980 == 0) {
                    class391.method2407(0, var34, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field985 = field3087[--field3090] == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field923 = field3087[--field3090];
                class563.method3215(true, var34);
                if (var34.field914 == -1) {
                    class599.method3390(var34.field977, 8);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field3087[--field3090];
                var34.field915 = var39 == 1;
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1125) {
                field3090 -= 2;
                var34.field962 = field3087[field3090];
                var34.field992 = field3087[field3090 + 1];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field964 = field3087[--field3090];
                class563.method3215(true, var34);
                return;
            }
            if (arg0 == 1127) {
                field3090 -= 2;
                int var40 = field3087[field3090];
                int var41 = field3087[field3090 + 1];
                class262 var42 = class329.field4869.method3552(var40, -88);
                if (var42.field3986 != var41) {
                    var34.method551(var41, var40, -5302);
                    return;
                }
                var34.method568(var40, (byte) -108);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field3087[--field3090];
                String var44 = field3075[--field3082];
                class262 var45 = class329.field4869.method3552(var43, -99);
                if (!var45.field3981.equals(var44)) {
                    var34.method567(var44, 654845412, var43);
                    return;
                }
                var34.method568(var43, (byte) -73);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class49 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class534.method3038(-97, field3087[--field3090]);
            } else {
                var46 = arg1 ? field3077 : field3085;
            }
            class563.method3215(true, var46);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field3090 -= 2;
                int var47 = field3087[field3090];
                int var48 = field3087[field3090 + 1];
                if (var46.field914 == -1) {
                    class577.method3276(var46.field977, 100);
                    class599.method3390(var46.field977, 8);
                    class705.method3925(10, var46.field977);
                }
                if (var47 == -1) {
                    var46.field927 = 1;
                    var46.field1004 = -1;
                    var46.field1023 = -1;
                    return;
                }
                var46.field1023 = var47;
                var46.field1017 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field911 = true;
                } else {
                    var46.field911 = false;
                }
                class186 var49 = class41.field682.method2228(var47, 0);
                var46.field913 = var49.field2605;
                var46.field1011 = var49.field2669;
                var46.field858 = var49.field2660;
                var46.field954 = var49.field2666;
                var46.field859 = var49.field2657;
                var46.field923 = var49.field2646;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field924 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field924 = 1;
                } else {
                    var46.field924 = 2;
                }
                if (var46.field938 > 0) {
                    var46.field923 = var46.field923 * 32 / var46.field938;
                    return;
                }
                if (var46.field975 > 0) {
                    var46.field923 = var46.field923 * 32 / var46.field975;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field927 = 2;
                var46.field1004 = field3087[--field3090];
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field927 = 3;
                var46.field1004 = -1;
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field927 = 6;
                var46.field1004 = field3087[--field3090];
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field927 = 5;
                var46.field1004 = field3087[--field3090];
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
            if (arg0 == 1206) {
                field3090 -= 4;
                var46.field979 = field3087[field3090];
                var46.field968 = field3087[field3090 + 1];
                var46.field880 = field3087[field3090 + 2];
                var46.field987 = field3087[field3090 + 3];
                class563.method3215(true, var46);
                return;
            }
            if (arg0 == 1207) {
                field3090 -= 2;
                var46.field906 = field3087[field3090];
                var46.field1003 = field3087[field3090 + 1];
                class563.method3215(true, var46);
                return;
            }
            if (arg0 == 1210) {
                field3090 -= 4;
                var46.field1004 = field3087[field3090];
                var46.field902 = field3087[field3090 + 1];
                if (field3087[field3090 + 2] == 1) {
                    var46.field927 = 9;
                } else {
                    var46.field927 = 8;
                }
                if (field3087[field3090 + 3] == 1) {
                    var46.field911 = true;
                } else {
                    var46.field911 = false;
                }
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field927 = 5;
                var46.field1004 = class99.field1551;
                var46.field902 = 0;
                if (var46.field914 == -1) {
                    class363.method2205((byte) -81, var46.field977);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class49 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class534.method3038(-104, field3087[--field3090]);
            } else {
                var50 = arg1 ? field3077 : field3085;
            }
            if (arg0 == 1300) {
                int var51 = field3087[--field3090] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method558(field3075[--field3082], var51, -100);
                    return;
                }
                field3082--;
                return;
            }
            if (arg0 == 1301) {
                field3090 -= 2;
                int var52 = field3087[field3090];
                int var53 = field3087[field3090 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field949 = null;
                    return;
                }
                var50.field949 = class639.method3557(var52, var53, 1);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field3087[--field3090];
                if (class639.field9019 != var54 && class213.field2966 != var54 && class672.field9495 != var54) {
                    return;
                }
                var50.field978 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field907 = field3087[--field3090];
                return;
            }
            if (arg0 == 1304) {
                var50.field941 = field3087[--field3090];
                return;
            }
            if (arg0 == 1305) {
                var50.field928 = field3075[--field3082];
                return;
            }
            if (arg0 == 1306) {
                var50.field1012 = field3075[--field3082];
                return;
            }
            if (arg0 == 1307) {
                var50.field966 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field925 = field3087[--field3090];
                var50.field903 = field3087[--field3090];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field3087[--field3090];
                int var56 = field3087[--field3090];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method562(var55, var56 - 1, -1402);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field999 = field3075[--field3082];
                return;
            }
            if (arg0 == 1311) {
                var50.field990 = field3087[--field3090];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field3090 -= 3;
                    var57 = field3087[field3090] - 1;
                    var58 = field3087[field3090 + 1];
                    var59 = field3087[field3090 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field3090 -= 2;
                    var57 = 10;
                    var58 = field3087[field3090];
                    var59 = field3087[field3090 + 1];
                }
                if (var50.field1019 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field1019 = new byte[11];
                    var50.field904 = new byte[11];
                    var50.field890 = new int[11];
                }
                var50.field1019[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field984 = false;
                    for (int var60 = 0; var60 < var50.field1019.length; var60++) {
                        if (var50.field1019[var60] != 0) {
                            var50.field984 = true;
                            break;
                        }
                    }
                } else {
                    var50.field984 = true;
                }
                var50.field904[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field986 = field3087[--field3090];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class49 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class534.method3038(-87, field3087[--field3090]);
            } else {
                var61 = arg1 ? field3077 : field3085;
            }
            if (arg0 == 1499) {
                var61.method563(82);
                return;
            }
            String var62 = field3075[--field3082];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field3087[--field3090];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field3087[--field3090];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field3075[--field3082];
                } else {
                    var65[var66] = Integer.valueOf(field3087[--field3090]);
                }
            }
            int var67 = field3087[--field3090];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field945 = var65;
            } else if (arg0 == 1401) {
                var61.field958 = var65;
            } else if (arg0 == 1402) {
                var61.field934 = var65;
            } else if (arg0 == 1403) {
                var61.field991 = var65;
            } else if (arg0 == 1404) {
                var61.field1018 = var65;
            } else if (arg0 == 1405) {
                var61.field900 = var65;
            } else if (arg0 == 1406) {
                var61.field896 = var65;
            } else if (arg0 == 1407) {
                var61.field887 = var65;
                var61.field1005 = var63;
            } else if (arg0 == 1408) {
                var61.field874 = var65;
            } else if (arg0 == 1409) {
                var61.field953 = var65;
            } else if (arg0 == 1410) {
                var61.field951 = var65;
            } else if (arg0 == 1411) {
                var61.field948 = var65;
            } else if (arg0 == 1412) {
                var61.field1010 = var65;
            } else if (arg0 == 1414) {
                var61.field892 = var65;
                var61.field1006 = var63;
            } else if (arg0 == 1415) {
                var61.field988 = var65;
                var61.field930 = var63;
            } else if (arg0 == 1416) {
                var61.field931 = var65;
            } else if (arg0 == 1417) {
                var61.field982 = var65;
            } else if (arg0 == 1418) {
                var61.field947 = var65;
            } else if (arg0 == 1419) {
                var61.field969 = var65;
            } else if (arg0 == 1420) {
                var61.field884 = var65;
            } else if (arg0 == 1421) {
                var61.field973 = var65;
            } else if (arg0 == 1422) {
                var61.field866 = var65;
            } else if (arg0 == 1423) {
                var61.field1007 = var65;
            } else if (arg0 == 1424) {
                var61.field1009 = var65;
            } else if (arg0 == 1425) {
                var61.field1008 = var65;
            } else if (arg0 == 1426) {
                var61.field871 = var65;
            } else if (arg0 == 1427) {
                var61.field1016 = var65;
            } else if (arg0 == 1428) {
                var61.field976 = var65;
                var61.field878 = var63;
            } else if (arg0 == 1429) {
                var61.field1000 = var65;
                var61.field1002 = var63;
            } else if (arg0 == 1430) {
                var61.field959 = var65;
            }
            var61.field952 = true;
            return;
        } else if (arg0 < 1600) {
            class49 var68 = arg1 ? field3077 : field3085;
            if (arg0 == 1500) {
                field3087[field3090++] = var68.field957;
                return;
            }
            if (arg0 == 1501) {
                field3087[field3090++] = var68.field920;
                return;
            }
            if (arg0 == 1502) {
                field3087[field3090++] = var68.field967;
                return;
            }
            if (arg0 == 1503) {
                field3087[field3090++] = var68.field877;
                return;
            }
            if (arg0 == 1504) {
                field3087[field3090++] = var68.field937 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field3087[field3090++] = var68.field885;
                return;
            }
            if (arg0 == 1506) {
                class49 var69 = class224.method1483(var68, 21964);
                field3087[field3090++] = var69 == null ? -1 : var69.field977;
                return;
            }
        } else if (arg0 < 1700) {
            class49 var70 = arg1 ? field3077 : field3085;
            if (arg0 == 1600) {
                field3087[field3090++] = var70.field909;
                return;
            }
            if (arg0 == 1601) {
                field3087[field3090++] = var70.field891;
                return;
            }
            if (arg0 == 1602) {
                field3075[field3082++] = var70.field950;
                return;
            }
            if (arg0 == 1603) {
                field3087[field3090++] = var70.field1021;
                return;
            }
            if (arg0 == 1604) {
                field3087[field3090++] = var70.field921;
                return;
            }
            if (arg0 == 1605) {
                field3087[field3090++] = var70.field923;
                return;
            }
            if (arg0 == 1606) {
                field3087[field3090++] = var70.field913;
                return;
            }
            if (arg0 == 1607) {
                field3087[field3090++] = var70.field858;
                return;
            }
            if (arg0 == 1608) {
                field3087[field3090++] = var70.field1011;
                return;
            }
            if (arg0 == 1609) {
                field3087[field3090++] = var70.field893;
                return;
            }
            if (arg0 == 1610) {
                field3087[field3090++] = var70.field954;
                return;
            }
            if (arg0 == 1611) {
                field3087[field3090++] = var70.field859;
                return;
            }
            if (arg0 == 1612) {
                field3087[field3090++] = var70.field908;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field3087[--field3090];
                class262 var72 = class329.field4869.method3552(var71, -66);
                if (var72.method1719(-103)) {
                    field3075[field3082++] = var70.method566((byte) 94, var71, var72.field3981);
                    return;
                }
                field3087[field3090++] = var70.method559(var71, false, var72.field3986);
                return;
            }
            if (arg0 == 1614) {
                field3087[field3090++] = var70.field1001;
                return;
            }
        } else if (arg0 < 1800) {
            class49 var73 = arg1 ? field3077 : field3085;
            if (arg0 == 1700) {
                field3087[field3090++] = var73.field1023;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field1023 != -1) {
                    field3087[field3090++] = var73.field1017;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field3087[field3090++] = var73.field914;
                return;
            }
        } else if (arg0 < 1900) {
            class49 var74 = arg1 ? field3077 : field3085;
            if (arg0 == 1800) {
                field3087[field3090++] = client.method1767(var74).method974(-2090995594);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field3087[--field3090];
                int var352 = var75 - 1;
                if (var74.field966 != null && var352 < var74.field966.length && var74.field966[var352] != null) {
                    field3075[field3082++] = var74.field966[var352];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field928 == null) {
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = var74.field928;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class49 var350;
            if (arg0 >= 2000) {
                var350 = class534.method3038(-120, field3087[--field3090]);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field3077 : field3085;
            }
            if (field3094 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field1016 == null) {
                    return;
                }
                class14 var351 = new class14();
                var351.field129 = var350;
                var351.field122 = var350.field1016;
                var351.field121 = field3094 + 1;
                class293.field4324.method474(var351, 6);
                return;
            }
        } else if (arg0 < 2600) {
            class49 var76 = class534.method3038(-87, field3087[--field3090]);
            if (arg0 == 2500) {
                field3087[field3090++] = var76.field957;
                return;
            }
            if (arg0 == 2501) {
                field3087[field3090++] = var76.field920;
                return;
            }
            if (arg0 == 2502) {
                field3087[field3090++] = var76.field967;
                return;
            }
            if (arg0 == 2503) {
                field3087[field3090++] = var76.field877;
                return;
            }
            if (arg0 == 2504) {
                field3087[field3090++] = var76.field937 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field3087[field3090++] = var76.field885;
                return;
            }
            if (arg0 == 1506) {
                class49 var77 = class224.method1483(var76, 21964);
                field3087[field3090++] = var77 == null ? -1 : var77.field977;
                return;
            }
        } else if (arg0 < 2700) {
            class49 var78 = class534.method3038(-98, field3087[--field3090]);
            if (arg0 == 2600) {
                field3087[field3090++] = var78.field909;
                return;
            }
            if (arg0 == 2601) {
                field3087[field3090++] = var78.field891;
                return;
            }
            if (arg0 == 2602) {
                field3075[field3082++] = var78.field950;
                return;
            }
            if (arg0 == 2603) {
                field3087[field3090++] = var78.field1021;
                return;
            }
            if (arg0 == 2604) {
                field3087[field3090++] = var78.field921;
                return;
            }
            if (arg0 == 2605) {
                field3087[field3090++] = var78.field923;
                return;
            }
            if (arg0 == 2606) {
                field3087[field3090++] = var78.field913;
                return;
            }
            if (arg0 == 2607) {
                field3087[field3090++] = var78.field858;
                return;
            }
            if (arg0 == 2608) {
                field3087[field3090++] = var78.field1011;
                return;
            }
            if (arg0 == 2609) {
                field3087[field3090++] = var78.field893;
                return;
            }
            if (arg0 == 2610) {
                field3087[field3090++] = var78.field954;
                return;
            }
            if (arg0 == 2611) {
                field3087[field3090++] = var78.field859;
                return;
            }
            if (arg0 == 2612) {
                field3087[field3090++] = var78.field908;
                return;
            }
            if (arg0 == 2613) {
                field3087[field3090++] = var78.field1001;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class49 var79 = class534.method3038(-120, field3087[--field3090]);
                field3087[field3090++] = var79.field1023;
                return;
            }
            if (arg0 == 2701) {
                class49 var80 = class534.method3038(-112, field3087[--field3090]);
                if (var80.field1023 != -1) {
                    field3087[field3090++] = var80.field1017;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field3087[--field3090];
                class320 var82 = (class320) class654.field9178.method1405((long) var81, (byte) -58);
                if (var82 != null) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class49 var83 = class534.method3038(-106, field3087[--field3090]);
                if (var83.field1014 == null) {
                    field3087[field3090++] = 0;
                    return;
                }
                int var84 = var83.field1014.length;
                for (int var85 = 0; var85 < var83.field1014.length; var85++) {
                    if (var83.field1014[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field3087[field3090++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field3090 -= 2;
                int var86 = field3087[field3090];
                int var87 = field3087[field3090 + 1];
                class320 var88 = (class320) class654.field9178.method1405((long) var86, (byte) -34);
                if (var88 != null && var88.field4703 == var87) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class49 var89 = class534.method3038(-97, field3087[--field3090]);
            if (arg0 == 2800) {
                field3087[field3090++] = client.method1767(var89).method974(-2090995594);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field3087[--field3090];
                int var353 = var90 - 1;
                if (var89.field966 != null && var353 < var89.field966.length && var89.field966[var353] != null) {
                    field3075[field3082++] = var89.field966[var353];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field928 == null) {
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = var89.field928;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field3075[--field3082];
                class394.method2434(var91, 1);
                return;
            }
            if (arg0 == 3101) {
                field3090 -= 2;
                class320.method2002(field3087[field3090 + 1], field3087[field3090], 0, class648.field9106);
                return;
            }
            if (arg0 == 3103) {
                class176.method1199(true, -120);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field3075[--field3082];
                int var93 = 0;
                if (class645.method3583(-76, var92)) {
                    var93 = class440.method2607(7330, var92);
                }
                field3080++;
                class135 var94 = class688.method3794(class399.field5896, class583.field8198, (byte) 38);
                var94.field1978.method3868(var93, -318419336);
                class19.method223(var94, 0);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field3075[--field3082];
                field3071++;
                class135 var96 = class688.method3794(class663.field9366, class583.field8198, (byte) 38);
                var96.field1978.method3853((byte) 51, var95.length() + 1);
                var96.field1978.method3837(4102, var95);
                class19.method223(var96, 0);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field3075[--field3082];
                field3070++;
                class135 var98 = class688.method3794(class282.field4242, class583.field8198, (byte) 38);
                var98.field1978.method3853((byte) 51, var97.length() + 1);
                var98.field1978.method3837(4102, var97);
                class19.method223(var98, 0);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field3087[--field3090];
                String var100 = field3075[--field3082];
                class307.method1956(var100, var99, (byte) -79);
                return;
            }
            if (arg0 == 3108) {
                field3090 -= 3;
                int var101 = field3087[field3090];
                int var102 = field3087[field3090 + 1];
                int var103 = field3087[field3090 + 2];
                class49 var104 = class534.method3038(-91, var103);
                class647.method3590(var102, var104, (byte) -127, var101);
                return;
            }
            if (arg0 == 3109) {
                field3090 -= 2;
                int var105 = field3087[field3090];
                int var106 = field3087[field3090 + 1];
                class49 var107 = arg1 ? field3077 : field3085;
                class647.method3590(var106, var107, (byte) -111, var105);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field3087[--field3090];
                field3078++;
                class135 var109 = class688.method3794(class27.field397, class583.field8198, (byte) 38);
                var109.field1978.method3852(false, var108);
                class19.method223(var109, 0);
                return;
            }
            if (arg0 == 3111) {
                field3090 -= 2;
                int var110 = field3087[field3090];
                int var111 = field3087[field3090 + 1];
                class320 var112 = (class320) class654.field9178.method1405((long) var110, (byte) -103);
                if (var112 != null) {
                    class224.method1484(true, var112.field4703 != var111, true, var112);
                }
                class665.method3676(3, 82, var110, true, var111);
                return;
            }
            if (arg0 == 3112) {
                field3090--;
                int var113 = field3087[field3090];
                class320 var114 = (class320) class654.field9178.method1405((long) var113, (byte) -96);
                if (var114 != null && var114.field4704 == 3) {
                    class224.method1484(true, true, true, var114);
                }
                return;
            }
            if (arg0 == 3113) {
                class331.method2078(false, field3075[--field3082]);
                return;
            }
            if (arg0 == 3114) {
                field3090 -= 2;
                int var115 = field3087[field3090];
                int var116 = field3087[field3090 + 1];
                String var117 = field3075[--field3082];
                class376.method2265(var115, var116, "", "", (byte) -121, "", var117);
                return;
            }
            if (arg0 == 3115) {
                field3090 -= 11;
                class109[] var118 = class192.method1294(-11879);
                class630[] var119 = class257.method1709(-91);
                class546.method3090((byte) -104, field3087[field3090 + 4], field3087[field3090 + 7], field3087[field3090 + 10], var118[field3087[field3090]], field3087[field3090 + 8], var119[field3087[field3090 + 1]], field3087[field3090 + 5], field3087[field3090 + 9], field3087[field3090 + 2], field3087[field3090 + 6], field3087[field3090 + 3]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field3090 -= 3;
                class50.method569(field3087[field3090], field3087[field3090 + 1], field3087[field3090 + 2], (byte) -25, 255);
                return;
            }
            if (arg0 == 3201) {
                class236.method1611(255, 50, 30867, field3087[--field3090]);
                return;
            }
            if (arg0 == 3202) {
                field3090 -= 2;
                class228.method1541(field3087[field3090], field3087[field3090 + 1], 64, 255);
                return;
            }
            if (arg0 == 3203) {
                field3090 -= 4;
                class50.method569(field3087[field3090], field3087[field3090 + 1], field3087[field3090 + 2], (byte) 106, field3087[field3090 + 3]);
                return;
            }
            if (arg0 == 3204) {
                field3090 -= 3;
                class236.method1611(field3087[field3090 + 1], field3087[field3090 + 2], 30867, field3087[field3090]);
                return;
            }
            if (arg0 == 3205) {
                field3090 -= 3;
                class228.method1541(field3087[field3090], field3087[field3090 + 1], 35, field3087[field3090 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field3090 -= 4;
                class89.method767(-35, field3087[field3090 + 2], false, field3087[field3090 + 3], field3087[field3090 + 1], field3087[field3090]);
                return;
            }
            if (arg0 == 3207) {
                field3090 -= 4;
                class89.method767(-35, field3087[field3090 + 2], true, field3087[field3090 + 3], field3087[field3090 + 1], field3087[field3090]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field3087[field3090++] = class564.field7962;
                return;
            }
            if (arg0 == 3301) {
                field3090 -= 2;
                int var120 = field3087[field3090];
                int var121 = field3087[field3090 + 1];
                field3087[field3090++] = class442.method2618(false, var120, (byte) -118, var121);
                return;
            }
            if (arg0 == 3302) {
                field3090 -= 2;
                int var122 = field3087[field3090];
                int var123 = field3087[field3090 + 1];
                field3087[field3090++] = class234.method1600(var122, var123, (byte) -59, false);
                return;
            }
            if (arg0 == 3303) {
                field3090 -= 2;
                int var124 = field3087[field3090];
                int var125 = field3087[field3090 + 1];
                field3087[field3090++] = class43.method466(var124, var125, false, 23173);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field3087[--field3090];
                field3087[field3090++] = class78.field1347.method1018(var126, 70).field7031;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field3087[--field3090];
                field3087[field3090++] = class221.field3103[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field3087[--field3090];
                field3087[field3090++] = class415.field6020[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field3087[--field3090];
                field3087[field3090++] = class633.field8945[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class648.field9106.field3019;
                int var131 = (class648.field9106.field3024 >> 9) + class109.field1672;
                int var132 = (class648.field9106.field3029 >> 9) + class203.field2874;
                field3087[field3090++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field3087[--field3090];
                field3087[field3090++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field3087[--field3090];
                field3087[field3090++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field3087[--field3090];
                field3087[field3090++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field3087[field3090++] = class267.field4035 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field3090 -= 2;
                int var136 = field3087[field3090];
                int var137 = field3087[field3090 + 1];
                field3087[field3090++] = class442.method2618(true, var136, (byte) -128, var137);
                return;
            }
            if (arg0 == 3314) {
                field3090 -= 2;
                int var138 = field3087[field3090];
                int var139 = field3087[field3090 + 1];
                field3087[field3090++] = class234.method1600(var138, var139, (byte) -59, true);
                return;
            }
            if (arg0 == 3315) {
                field3090 -= 2;
                int var140 = field3087[field3090];
                int var141 = field3087[field3090 + 1];
                field3087[field3090++] = class43.method466(var140, var141, true, 23173);
                return;
            }
            if (arg0 == 3316) {
                if (class558.field7877 >= 2) {
                    field3087[field3090++] = class558.field7877;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field3087[field3090++] = class593.field8378;
                return;
            }
            if (arg0 == 3318) {
                field3087[field3090++] = class228.field3284.field4938;
                return;
            }
            if (arg0 == 3321) {
                field3087[field3090++] = class213.field2960;
                return;
            }
            if (arg0 == 3322) {
                field3087[field3090++] = class44.field704;
                return;
            }
            if (arg0 == 3323) {
                if (class473.field6751 >= 5 && class473.field6751 <= 9) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class473.field6751 >= 5 && class473.field6751 <= 9) {
                    field3087[field3090++] = class473.field6751;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field3087[field3090++] = class149.field2169 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field3087[field3090++] = class648.field9106.field6971;
                return;
            }
            if (arg0 == 3327) {
                field3087[field3090++] = class648.field9106.field6993.field7150 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field3087[field3090++] = class100.field1554 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field3087[--field3090];
                field3087[field3090++] = class628.method3501(var142, (byte) 85, false);
                return;
            }
            if (arg0 == 3331) {
                field3090 -= 2;
                int var143 = field3087[field3090];
                int var144 = field3087[field3090 + 1];
                field3087[field3090++] = class547.method3095(false, var144, false, var143, false);
                return;
            }
            if (arg0 == 3332) {
                field3090 -= 2;
                int var145 = field3087[field3090];
                int var146 = field3087[field3090 + 1];
                field3087[field3090++] = class547.method3095(false, var146, false, var145, true);
                return;
            }
            if (arg0 == 3333) {
                field3087[field3090++] = class689.field9707;
                return;
            }
            if (arg0 == 3335) {
                field3087[field3090++] = class512.field7203;
                return;
            }
            if (arg0 == 3336) {
                field3090 -= 4;
                int var147 = field3087[field3090];
                int var148 = field3087[field3090 + 1];
                int var149 = field3087[field3090 + 2];
                int var150 = field3087[field3090 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field3087[field3090++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field3087[field3090++] = class40.field657;
                return;
            }
            if (arg0 == 3338) {
                field3087[field3090++] = class229.method1582(true);
                return;
            }
            if (arg0 == 3339) {
                field3087[field3090++] = class182.field2586 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field3087[field3090++] = class67.field1229 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field3087[field3090++] = class145.field2122 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field3087[field3090++] = class508.field7171.method2090(-7249);
                return;
            }
            if (arg0 == 3343) {
                field3087[field3090++] = class508.field7171.method2093(22302);
                return;
            }
            if (arg0 == 3344) {
                field3075[field3082++] = class261.method1717((byte) 64);
                return;
            }
            if (arg0 == 3345) {
                field3075[field3082++] = class248.method1672(true);
                return;
            }
            if (arg0 == 3346) {
                field3087[field3090++] = class176.method1197((byte) 127);
                return;
            }
            if (arg0 == 3347) {
                field3087[field3090++] = class23.field319;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field3090 -= 2;
                int var154 = field3087[field3090];
                int var155 = field3087[field3090 + 1];
                class96 var156 = class666.field9402.method570(-7848, var154);
                field3075[field3082++] = var156.method783(var155, (byte) -71);
                return;
            }
            if (arg0 == 3408) {
                field3090 -= 4;
                int var157 = field3087[field3090];
                int var158 = field3087[field3090 + 1];
                int var159 = field3087[field3090 + 2];
                int var160 = field3087[field3090 + 3];
                class96 var161 = class666.field9402.method570(-7848, var159);
                if (var161.field1505 == var157 && var161.field1508 == var158) {
                    if (var158 == 115) {
                        field3075[field3082++] = var161.method783(var160, (byte) -71);
                        return;
                    }
                    field3087[field3090++] = var161.method781(var160, -91);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field3090 -= 3;
                int var162 = field3087[field3090];
                int var163 = field3087[field3090 + 1];
                int var164 = field3087[field3090 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class96 var165 = class666.field9402.method570(-7848, var163);
                if (var165.field1508 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field3087[field3090++] = var165.method784(var164, -4136) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field3087[--field3090];
                String var167 = field3075[--field3082];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class96 var168 = class666.field9402.method570(-7848, var166);
                if (var168.field1508 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field3087[field3090++] = var168.method787(2, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field3087[--field3090];
                class96 var170 = class666.field9402.method570(-7848, var169);
                field3087[field3090++] = var170.field1507.method1404((byte) 50);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class248.field3862 == 0) {
                    field3087[field3090++] = -2;
                    return;
                }
                if (class248.field3862 == 1) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = class142.field2091;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field3087[--field3090];
                if (class248.field3862 == 2 && var171 < class142.field2091) {
                    field3075[field3082++] = class124.field1865[var171];
                    if (class668.field9444[var171] != null) {
                        field3075[field3082++] = class668.field9444[var171];
                        return;
                    }
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = "";
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field3087[--field3090];
                if (class248.field3862 == 2 && var172 < class142.field2091) {
                    field3087[field3090++] = class182.field2580[var172];
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field3087[--field3090];
                if (class248.field3862 == 2 && var173 < class142.field2091) {
                    field3087[field3090++] = class421.field6139[var173];
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field3075[--field3082];
                int var175 = field3087[--field3090];
                class277.method1813(var174, false, var175);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field3075[--field3082];
                class467.method2760(var176, (byte) -127);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field3075[--field3082];
                class186.method1248(1, var177);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field3075[--field3082];
                class300.method1930(85, var178, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field3075[--field3082];
                class77.method712(var179, 0);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field3075[--field3082];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field3087[field3090++] = class249.method1674(var180, (byte) -64) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field3087[--field3090];
                if (class248.field3862 == 2 && var181 < class142.field2091) {
                    field3075[field3082++] = class303.field4516[var181];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class165.field2366 != null) {
                    field3075[field3082++] = class157.method1093(class165.field2366, (byte) -123);
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class165.field2366 != null) {
                    field3087[field3090++] = class433.field6341;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field3087[--field3090];
                if (class165.field2366 != null && var182 < class433.field6341) {
                    field3075[field3082++] = class564.field7965[var182].field1803;
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field3087[--field3090];
                if (class165.field2366 != null && var183 < class433.field6341) {
                    field3087[field3090++] = class564.field7965[var183].field1798;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field3087[--field3090];
                if (class165.field2366 != null && var184 < class433.field6341) {
                    field3087[field3090++] = class564.field7965[var184].field1806;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field3087[field3090++] = class677.field9578;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field3075[--field3082];
                class701.method3904(var185, 0);
                return;
            }
            if (arg0 == 3618) {
                field3087[field3090++] = class227.field3190;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field3075[--field3082];
                class574.method3257(var186, (byte) 123);
                return;
            }
            if (arg0 == 3620) {
                class486.method2823(0);
                return;
            }
            if (arg0 == 3621) {
                if (class248.field3862 == 0) {
                    field3087[field3090++] = -1;
                    return;
                }
                field3087[field3090++] = class363.field5180;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field3087[--field3090];
                if (class248.field3862 != 0 && var187 < class363.field5180) {
                    field3075[field3082++] = class98.field1547[var187];
                    if (class484.field6879[var187] != null) {
                        field3075[field3082++] = class484.field6879[var187];
                        return;
                    }
                    field3075[field3082++] = "";
                    return;
                }
                field3075[field3082++] = "";
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field3075[--field3082];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field3087[field3090++] = class534.method3041(-15788, var188) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field3087[--field3090];
                if (class564.field7965 != null && var189 < class433.field6341 && class564.field7965[var189].field1800.equalsIgnoreCase(class648.field9106.field6981)) {
                    field3087[field3090++] = 1;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class88.field1480 != null) {
                    field3075[field3082++] = class88.field1480;
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field3087[--field3090];
                if (class165.field2366 != null && var190 < class433.field6341) {
                    field3075[field3082++] = class564.field7965[var190].field1801;
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field3087[--field3090];
                if (class248.field3862 == 2 && var191 >= 0 && var191 < class142.field2091) {
                    field3087[field3090++] = class700.field9895[var191] ? 1 : 0;
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field3075[--field3082];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field3087[field3090++] = class371.method2245(var192, 14960);
                return;
            }
            if (arg0 == 3629) {
                field3087[field3090++] = class421.field6124;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field3075[--field3082];
                class300.method1930(91, var193, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field3087[--field3090];
                field3087[field3090++] = class42.field688[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field3087[--field3090];
                if (class165.field2366 != null && var195 < class433.field6341) {
                    field3075[field3082++] = class564.field7965[var195].field1800;
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field3087[--field3090];
                if (class248.field3862 != 0 && var196 < class363.field5180) {
                    field3075[field3082++] = class172.field2443[var196];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var197].method1327((byte) 81);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var198].field2810;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var199].field2818;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var200].field2819;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var201].field2814;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field3087[--field3090];
                field3087[field3090++] = class145.field2123[var202].field2817;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field3087[--field3090];
                int var204 = class145.field2123[var203].method1326(false);
                field3087[field3090++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field3087[--field3090];
                int var206 = class145.field2123[var205].method1326(false);
                field3087[field3090++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field3087[--field3090];
                int var208 = class145.field2123[var207].method1326(false);
                field3087[field3090++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field3087[--field3090];
                int var210 = class145.field2123[var209].method1326(false);
                field3087[field3090++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field3090 -= 2;
                int var211 = field3087[field3090];
                int var212 = field3087[field3090 + 1];
                field3087[field3090++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field3090 -= 2;
                int var213 = field3087[field3090];
                int var214 = field3087[field3090 + 1];
                field3087[field3090++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field3090 -= 2;
                int var215 = field3087[field3090];
                int var216 = field3087[field3090 + 1];
                field3087[field3090++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field3090 -= 2;
                int var217 = field3087[field3090];
                int var218 = field3087[field3090 + 1];
                field3087[field3090++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field3087[--field3090];
                field3087[field3090++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field3087[--field3090];
                field3087[field3090++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field3090 -= 5;
                int var221 = field3087[field3090];
                int var222 = field3087[field3090 + 1];
                int var223 = field3087[field3090 + 2];
                int var224 = field3087[field3090 + 3];
                int var225 = field3087[field3090 + 4];
                field3087[field3090++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field3090 -= 2;
                long var226 = (long) field3087[field3090];
                long var228 = (long) field3087[field3090 + 1];
                field3087[field3090++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field3090 -= 2;
                int var230 = field3087[field3090];
                int var231 = field3087[field3090 + 1];
                field3087[field3090++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field3090 -= 2;
                int var232 = field3087[field3090];
                int var233 = field3087[field3090 + 1];
                field3087[field3090++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field3090 -= 2;
                int var234 = field3087[field3090];
                int var235 = field3087[field3090 + 1];
                field3087[field3090++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field3090 -= 2;
                int var236 = field3087[field3090];
                int var237 = field3087[field3090 + 1];
                field3087[field3090++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field3090 -= 2;
                int var238 = field3087[field3090];
                int var239 = field3087[field3090 + 1];
                if (var238 == 0) {
                    field3087[field3090++] = 0;
                    return;
                }
                field3087[field3090++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field3090 -= 2;
                int var240 = field3087[field3090];
                int var241 = field3087[field3090 + 1];
                if (var240 == 0) {
                    field3087[field3090++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field3087[field3090++] = Integer.MAX_VALUE;
                    return;
                }
                field3087[field3090++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field3090 -= 2;
                int var242 = field3087[field3090];
                int var243 = field3087[field3090 + 1];
                field3087[field3090++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field3090 -= 2;
                int var244 = field3087[field3090];
                int var245 = field3087[field3090 + 1];
                field3087[field3090++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field3090 -= 2;
                int var246 = field3087[field3090];
                int var247 = field3087[field3090 + 1];
                field3087[field3090++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field3090 -= 2;
                int var248 = field3087[field3090];
                int var249 = field3087[field3090 + 1];
                field3087[field3090++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field3090 -= 3;
                long var250 = (long) field3087[field3090];
                long var252 = (long) field3087[field3090 + 1];
                long var254 = (long) field3087[field3090 + 2];
                field3087[field3090++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field3075[--field3082];
                int var257 = field3087[--field3090];
                field3075[field3082++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field3082 -= 2;
                String var258 = field3075[field3082];
                String var259 = field3075[field3082 + 1];
                field3075[field3082++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field3075[--field3082];
                int var261 = field3087[--field3090];
                field3075[field3082++] = var260 + class561.method3200(true, (byte) -44, var261);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field3075[--field3082];
                field3075[field3082++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field3075[field3082++] = method1447(field3087[--field3090]);
                return;
            }
            if (arg0 == 4105) {
                field3082 -= 2;
                String var263 = field3075[field3082];
                String var264 = field3075[field3082 + 1];
                if (class648.field9106.field6993 != null && class648.field9106.field6993.field7150) {
                    field3075[field3082++] = var264;
                    return;
                }
                field3075[field3082++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field3087[--field3090];
                field3075[field3082++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field3082 -= 2;
                field3087[field3090++] = class278.method1816(field3075[field3082], class512.field7203, 12, field3075[field3082 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field3075[--field3082];
                field3090 -= 2;
                int var267 = field3087[field3090];
                int var268 = field3087[field3090 + 1];
                class146 var269 = class652.method3605(0, (byte) 88, class81.field1363, var268);
                field3087[field3090++] = var269.method1046(var267, -257, class258.field3939, var266);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field3075[--field3082];
                field3090 -= 2;
                int var271 = field3087[field3090];
                int var272 = field3087[field3090 + 1];
                class146 var273 = class652.method3605(0, (byte) 88, class81.field1363, var272);
                field3087[field3090++] = var273.method1037(var270, class258.field3939, var271, true);
                return;
            }
            if (arg0 == 4110) {
                field3082 -= 2;
                String var274 = field3075[field3082];
                String var275 = field3075[field3082 + 1];
                if (field3087[--field3090] == 1) {
                    field3075[field3082++] = var274;
                    return;
                }
                field3075[field3082++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field3075[--field3082];
                field3075[field3082++] = class648.method3595(114, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field3075[--field3082];
                int var278 = field3087[--field3090];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field3075[field3082++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field3087[--field3090];
                field3087[field3090++] = class462.method2726(-161, (char) var279) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field3087[--field3090];
                field3087[field3090++] = class386.method2306(-81, (char) var280) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field3087[--field3090];
                field3087[field3090++] = class664.method3673((char) var281, 108) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field3087[--field3090];
                field3087[field3090++] = class381.method2275((char) var282, (byte) 58) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field3075[--field3082];
                if (var283 != null) {
                    field3087[field3090++] = var283.length();
                    return;
                }
                field3087[field3090++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field3075[--field3082];
                field3090 -= 2;
                int var285 = field3087[field3090];
                int var286 = field3087[field3090 + 1];
                field3075[field3082++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field3075[--field3082];
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
                field3075[field3082++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field3075[--field3082];
                field3090 -= 2;
                int var293 = field3087[field3090];
                int var294 = field3087[field3090 + 1];
                field3087[field3090++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field3082 -= 2;
                String var295 = field3075[field3082];
                String var296 = field3075[field3082 + 1];
                int var297 = field3087[--field3090];
                field3087[field3090++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field3087[--field3090];
                field3087[field3090++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field3087[--field3090];
                field3087[field3090++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field3087[--field3090] != 0;
                int var301 = field3087[--field3090];
                field3075[field3082++] = class150.method1062((long) var301, var300, class512.field7203, -3258, 0);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field3075[--field3082];
                int var303 = field3087[--field3090];
                class146 var304 = class652.method3605(0, (byte) 88, class81.field1363, var303);
                field3087[field3090++] = var304.method1043(16, class258.field3939, var302);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field3087[--field3090];
                field3075[field3082++] = class41.field682.method2228(var305, 0).field2629;
                return;
            }
            if (arg0 == 4201) {
                field3090 -= 2;
                int var306 = field3087[field3090];
                int var307 = field3087[field3090 + 1];
                class186 var308 = class41.field682.method2228(var306, 0);
                if (var307 >= 1 && var307 <= 5 && var308.field2642[var307 - 1] != null) {
                    field3075[field3082++] = var308.field2642[var307 - 1];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 4202) {
                field3090 -= 2;
                int var309 = field3087[field3090];
                int var310 = field3087[field3090 + 1];
                class186 var311 = class41.field682.method2228(var309, 0);
                if (var310 >= 1 && var310 <= 5 && var311.field2661[var310 - 1] != null) {
                    field3075[field3082++] = var311.field2661[var310 - 1];
                    return;
                }
                field3075[field3082++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field3087[--field3090];
                field3087[field3090++] = class41.field682.method2228(var312, 0).field2616;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field3087[--field3090];
                field3087[field3090++] = class41.field682.method2228(var313, 0).field2684 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field3087[--field3090];
                class186 var315 = class41.field682.method2228(var314, 0);
                if (var315.field2683 == -1 && var315.field2617 >= 0) {
                    field3087[field3090++] = var315.field2617;
                    return;
                }
                field3087[field3090++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field3087[--field3090];
                class186 var317 = class41.field682.method2228(var316, 0);
                if (var317.field2683 >= 0 && var317.field2617 >= 0) {
                    field3087[field3090++] = var317.field2617;
                    return;
                }
                field3087[field3090++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field3087[--field3090];
                field3087[field3090++] = class41.field682.method2228(var318, 0).field2680 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field3090 -= 2;
                int var319 = field3087[field3090];
                int var320 = field3087[field3090 + 1];
                class262 var321 = class329.field4869.method3552(var320, -28);
                if (var321.method1719(-104)) {
                    field3075[field3082++] = class41.field682.method2228(var319, 0).method1242(40, var321.field3981, var320);
                    return;
                }
                field3087[field3090++] = class41.field682.method2228(var319, 0).method1246(var320, var321.field3986, (byte) 20);
                return;
            }
            if (arg0 == 4209) {
                field3090 -= 2;
                int var322 = field3087[field3090];
                int var323 = field3087[field3090 + 1] - 1;
                class186 var324 = class41.field682.method2228(var322, 0);
                if (var324.field2643 == var323) {
                    field3087[field3090++] = var324.field2613;
                    return;
                }
                if (var324.field2649 == var323) {
                    field3087[field3090++] = var324.field2685;
                    return;
                }
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field3075[--field3082];
                int var326 = field3087[--field3090];
                class304.method1941(var325, var326 == 1, (byte) -37);
                field3087[field3090++] = class111.field1687;
                return;
            }
            if (arg0 == 4211) {
                if (class462.field6664 != null && class35.field615 < class111.field1687) {
                    field3087[field3090++] = class462.field6664[class35.field615++] & 0xFFFF;
                    return;
                }
                field3087[field3090++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class35.field615 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field3087[--field3090];
                field3087[field3090++] = class41.field682.method2228(var327, 0).field2670;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field3075[--field3082];
                field3090 -= 3;
                int var329 = field3087[field3090];
                int var330 = field3087[field3090 + 1];
                int var331 = field3087[field3090 + 2];
                class512.method2929((byte) -121, var330, var328, var331, var329 == 1);
                field3087[field3090++] = class111.field1687;
                return;
            }
            if (arg0 == 4215) {
                field3082 -= 2;
                field3090 -= 2;
                String var332 = field3075[field3082];
                int var333 = field3087[field3090];
                int var334 = field3087[field3090 + 1];
                String var335 = field3075[field3082 + 1];
                class234.method1603((byte) 45, var334, var332, var333 == 1, var335);
                field3087[field3090++] = class111.field1687;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field3090 -= 2;
                int var336 = field3087[field3090];
                int var337 = field3087[field3090 + 1];
                class262 var338 = class329.field4869.method3552(var337, -48);
                if (var338.method1719(-122)) {
                    field3075[field3082++] = class393.field5824.method362(var336, (byte) 95).method3351(-8585, var338.field3981, var337);
                    return;
                }
                field3087[field3090++] = class393.field5824.method362(var336, (byte) 110).method3348(var338.field3986, var337, (byte) -45);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field3090 -= 2;
                int var339 = field3087[field3090];
                int var340 = field3087[field3090 + 1];
                class262 var341 = class329.field4869.method3552(var340, -106);
                if (var341.method1719(96)) {
                    field3075[field3082++] = class101.field1572.method2617((byte) -89, var339).method3114(true, var341.field3981, var340);
                    return;
                }
                field3087[field3090++] = class101.field1572.method2617((byte) -105, var339).method3116(false, var341.field3986, var340);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field3090 -= 2;
                int var342 = field3087[field3090];
                int var343 = field3087[field3090 + 1];
                class262 var344 = class329.field4869.method3552(var343, -94);
                if (var344.method1719(-119)) {
                    field3075[field3082++] = class61.field1165.method2961((byte) 6, var342).method722(var344.field3981, var343, (byte) -63);
                    return;
                }
                field3087[field3090++] = class61.field1165.method2961((byte) 6, var342).method719(var343, false, var344.field3986);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field3087[--field3090];
            class87 var346 = class339.field4991.method648(var345, 32);
            if (var346.field1455 != null && var346.field1455.length > 0) {
                int var347 = 0;
                int var348 = var346.field1448[0];
                for (int var349 = 1; var349 < var346.field1455.length; var349++) {
                    if (var346.field1448[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field1448[var349];
                    }
                }
                field3087[field3090++] = var346.field1455[var347];
                return;
            }
            field3087[field3090++] = var346.field1436;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "()V", line = 7556)
    public static void method1446() {
        field3076 = null;
        field3074 = null;
        field3083 = null;
        field3084 = null;
        field3087 = null;
        field3075 = null;
        field3069 = null;
        field3085 = null;
        field3077 = null;
        field3081 = null;
        field3073 = null;
        field3093 = null;
        field3092 = null;
        field3091 = null;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)Ljava/lang/String;", line = 7576)
    private static final String method1447(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field3073.setTime(new Date(var1));
        int var3 = field3073.get(5);
        int var4 = field3073.get(2);
        int var5 = field3073.get(1);
        return var3 + "-" + field3093[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7591)
    private static final void method1448(String arg0, int arg1) {
        if (class558.field7877 == 0 && !(!class70.field1249 || class379.field5373) || class100.field1554) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class274.field4163.method1804(7175, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class274.field4163.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4164.method1804(7175, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class274.field4164.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4165.method1804(7175, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class274.field4165.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4166.method1804(7175, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class274.field4166.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4167.method1804(7175, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class274.field4167.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4168.method1804(7175, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class274.field4168.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4169.method1804(7175, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class274.field4169.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4170.method1804(7175, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class274.field4170.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4171.method1804(7175, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class274.field4171.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4172.method1804(7175, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class274.field4172.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4173.method1804(7175, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class274.field4173.method1804(7175, 0).length());
        } else if (var2.startsWith(class274.field4174.method1804(7175, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class274.field4174.method1804(7175, 0).length());
        } else if (class512.field7203 != 0) {
            if (var2.startsWith(class274.field4163.method1804(7175, class512.field7203))) {
                var3 = 0;
                arg0 = arg0.substring(class274.field4163.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4164.method1804(7175, class512.field7203))) {
                var3 = 1;
                arg0 = arg0.substring(class274.field4164.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4165.method1804(7175, class512.field7203))) {
                var3 = 2;
                arg0 = arg0.substring(class274.field4165.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4166.method1804(7175, class512.field7203))) {
                var3 = 3;
                arg0 = arg0.substring(class274.field4166.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4167.method1804(7175, class512.field7203))) {
                var3 = 4;
                arg0 = arg0.substring(class274.field4167.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4168.method1804(7175, class512.field7203))) {
                var3 = 5;
                arg0 = arg0.substring(class274.field4168.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4169.method1804(7175, class512.field7203))) {
                var3 = 6;
                arg0 = arg0.substring(class274.field4169.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4170.method1804(7175, class512.field7203))) {
                var3 = 7;
                arg0 = arg0.substring(class274.field4170.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4171.method1804(7175, class512.field7203))) {
                var3 = 8;
                arg0 = arg0.substring(class274.field4171.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4172.method1804(7175, class512.field7203))) {
                var3 = 9;
                arg0 = arg0.substring(class274.field4172.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4173.method1804(7175, class512.field7203))) {
                var3 = 10;
                arg0 = arg0.substring(class274.field4173.method1804(7175, class512.field7203).length());
            } else if (var2.startsWith(class274.field4174.method1804(7175, class512.field7203))) {
                var3 = 11;
                arg0 = arg0.substring(class274.field4174.method1804(7175, class512.field7203).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class274.field4175.method1804(7175, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class274.field4175.method1804(7175, 0).length());
        } else if (var4.startsWith(class274.field4176.method1804(7175, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class274.field4176.method1804(7175, 0).length());
        } else if (var4.startsWith(class274.field4177.method1804(7175, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class274.field4177.method1804(7175, 0).length());
        } else if (var4.startsWith(class274.field4178.method1804(7175, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class274.field4178.method1804(7175, 0).length());
        } else if (var4.startsWith(class274.field4179.method1804(7175, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class274.field4179.method1804(7175, 0).length());
        } else if (class512.field7203 != 0) {
            if (var4.startsWith(class274.field4175.method1804(7175, class512.field7203))) {
                var5 = 1;
                arg0 = arg0.substring(class274.field4175.method1804(7175, class512.field7203).length());
            } else if (var4.startsWith(class274.field4176.method1804(7175, class512.field7203))) {
                var5 = 2;
                arg0 = arg0.substring(class274.field4176.method1804(7175, class512.field7203).length());
            } else if (var4.startsWith(class274.field4177.method1804(7175, class512.field7203))) {
                var5 = 3;
                arg0 = arg0.substring(class274.field4177.method1804(7175, class512.field7203).length());
            } else if (var4.startsWith(class274.field4178.method1804(7175, class512.field7203))) {
                var5 = 4;
                arg0 = arg0.substring(class274.field4178.method1804(7175, class512.field7203).length());
            } else if (var4.startsWith(class274.field4179.method1804(7175, class512.field7203))) {
                var5 = 5;
                arg0 = arg0.substring(class274.field4179.method1804(7175, class512.field7203).length());
            }
        }
        field3088++;
        class135 var6 = class688.method3794(class115.field1756, class583.field8198, (byte) 38);
        var6.field1978.method3853((byte) 51, 0);
        int var7 = var6.field1978.field9761;
        var6.field1978.method3853((byte) 51, var3);
        var6.field1978.method3853((byte) 51, var5);
        class37.method435(var6.field1978, arg0, -79);
        var6.field1978.method3867(var6.field1978.field9761 - var7, (byte) -13);
        class19.method223(var6, 0);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lmp;I)V", line = 7860)
    private static final void method1449(class706 arg0, int arg1) {
        field3090 = 0;
        field3082 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9928;
        int[] var4 = arg0.field9924;
        byte var5 = -1;
        field3068 = 0;
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
                        method1445(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1441(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field3087[field3090++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field3087[field3090++] = class61.field1163.field4002[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class61.field1163.method1725(var8, 0, field3087[--field3090]);
                } else if (var43 == 3) {
                    field3075[field3082++] = arg0.field9932[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field3090 -= 2;
                    if (field3087[field3090 + 1] != field3087[field3090]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field3090 -= 2;
                    if (field3087[field3090 + 1] == field3087[field3090]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field3090 -= 2;
                    if (field3087[field3090] < field3087[field3090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field3090 -= 2;
                    if (field3087[field3090] > field3087[field3090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field3068 == 0) {
                        return;
                    }
                    class83 var9 = field3069[--field3068];
                    arg0 = var9.field1366;
                    var3 = arg0.field9928;
                    var4 = arg0.field9924;
                    var2 = var9.field1370;
                    field3076 = var9.field1373;
                    field3074 = var9.field1365;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field3087[field3090++] = class61.field1163.method1727(var10, 0);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class61.field1163.method1729(field3087[--field3090], false, var11);
                } else if (var43 == 31) {
                    field3090 -= 2;
                    if (field3087[field3090] <= field3087[field3090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field3090 -= 2;
                    if (field3087[field3090] >= field3087[field3090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field3087[field3090++] = field3076[var4[var2]];
                } else if (var43 == 34) {
                    field3076[var4[var2]] = field3087[--field3090];
                } else if (var43 == 35) {
                    field3075[field3082++] = field3074[var4[var2]];
                } else if (var43 == 36) {
                    field3074[var4[var2]] = field3075[--field3082];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field3082 -= var12;
                    String var13 = class53.method589(field3075, 4, var12, field3082);
                    field3075[field3082++] = var13;
                } else if (var43 == 38) {
                    field3090--;
                } else if (var43 == 39) {
                    field3082--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class706 var15 = class91.method770(var14, 21768);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9926];
                    String[] var17 = new String[var15.field9929];
                    for (int var18 = 0; var18 < var15.field9925; var18++) {
                        var16[var18] = field3087[field3090 + var18 - var15.field9925];
                    }
                    for (int var19 = 0; var19 < var15.field9927; var19++) {
                        var17[var19] = field3075[field3082 + var19 - var15.field9927];
                    }
                    field3090 -= var15.field9925;
                    field3082 -= var15.field9927;
                    class83 var20 = new class83();
                    var20.field1366 = arg0;
                    var20.field1370 = var2;
                    var20.field1373 = field3076;
                    var20.field1365 = field3074;
                    if (field3068 >= field3069.length) {
                        throw new RuntimeException();
                    }
                    field3069[field3068++] = var20;
                    arg0 = var15;
                    var3 = var15.field9928;
                    var4 = var15.field9924;
                    var2 = -1;
                    field3076 = var16;
                    field3074 = var17;
                } else if (var43 == 42) {
                    field3087[field3090++] = class524.field7403[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class524.field7403[var21] = field3087[--field3090];
                    class161.method1110(var21, 1);
                    class52.field1042 |= class591.field8281[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field3087[--field3090];
                    if (var24 >= 0 && var24 <= 5000) {
                        field3083[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field3084[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field3087[--field3090];
                    if (var28 < 0 || var28 >= field3083[var27]) {
                        throw new RuntimeException();
                    }
                    field3087[field3090++] = field3084[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field3090 -= 2;
                    int var30 = field3087[field3090];
                    if (var30 < 0 || var30 >= field3083[var29]) {
                        throw new RuntimeException();
                    }
                    field3084[var29][var30] = field3087[field3090 + 1];
                } else if (var43 == 47) {
                    String var31 = class119.field1807[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field3075[field3082++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class119.field1807[var32] = field3075[--field3082];
                    class546.method3091(0, var32);
                } else if (var43 == 51) {
                    class213 var33 = arg0.field9933[var4[var2]];
                    class111 var34 = (class111) var33.method1405((long) field3087[--field3090], (byte) -28);
                    if (var34 != null) {
                        var2 += var34.field1683;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field9934 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field9386).append(" ");
                for (int var41 = field3068 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field3069[var41].field1366.field9386).append(" ");
                }
                var40.append("op: ").append(var5);
                class699.method3896(83, var42, var40.toString());
            } else {
                class60.method639(4, "Clientscript error in: " + arg0.field9934, 65535);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9934).append("\n");
                for (int var38 = field3068 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field3069[var38].field1366.field9934).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class699.method3896(108, var42, var37.toString());
                class262.method1723(true, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Luc;II)V")
    public static final void method1450(class27 arg0, int arg1, int arg2) {
        class706 var3 = class232.method1596(arg1, 2107503184, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field3076 = new int[var3.field9926];
        field3074 = new String[var3.field9929];
        if (class129.field1904 == var3.field9935 || class132.field1947 == var3.field9935 || class440.field6415 == var3.field9935) {
            int var4 = 0;
            int var5 = 0;
            if (class382.field5392 != null) {
                var4 = class382.field5392.field957;
                var5 = class382.field5392.field920;
            }
            field3076[0] = class508.field7171.method2090(-7249) - var4;
            field3076[1] = class508.field7171.method2093(22302) - var5;
        }
        method1449(var3, 200000);
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)V")
    public static final void method1451(int arg0) {
        if (arg0 == -1 || !class312.method1978(false, arg0)) {
            return;
        }
        class49[] var1 = class181.field2558[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class49 var3 = var1[var2];
            if (var3.field1015 != null) {
                class14 var4 = new class14();
                var4.field129 = var3;
                var4.field122 = var3.field1015;
                method1440(var4, 2000000);
            }
        }
    }
}
