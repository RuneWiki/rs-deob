import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class9 extends class108 {

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lim;")
    public static class353 field74 = new class353(15, 8);

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "F")
    public static float field80;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Ljq;")
    public class447 field77;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "Ljq;")
    public class447 field79;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "Ljava/lang/String;")
    public String field82;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
    public boolean field73;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field81;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "[S")
    public static short[] field86;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
    public static final boolean method35(int arg0) {
        field78++;
        if (arg0 != 1) {
            field74 = null;
        }
        try {
            return class256.method1540((byte) -53);
        } catch (IOException var4) {
            class2.method5((byte) 70);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class558.field7814 == null ? -1 : class558.field7814.method2202((byte) 16)) + "," + (class501.field6953 == null ? -1 : class501.field6953.method2202((byte) 16)) + "," + (class208.field2708 == null ? -1 : class208.field2708.method2202((byte) 16)) + " - " + class262.field3333 + "," + (class147.field1899.field419[0] + class525.field7310) + "," + (class147.field1899.field417[0] + class58.field786) + " - ";
            for (int var3 = 0; class262.field3333 > var3 && var3 < 50; var3++) {
                var2 = var2 + class342.field4758.field7693[var3] + ",";
            }
            class447.method2602(var5, 107, var2);
            class493.method2772(false, arg0 + 18746);
            return true;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;I)V")
    public static final void method36(class167 arg0, int arg1) {
        field75++;
        int var2 = class431.field5868;
        if (arg1 > -19) {
            method35(-88);
        }
        int var3 = class423.field5739;
        int var4 = class641.field9318;
        int var5 = class81.field1095 - 3;
        byte var6 = 20;
        if (class600.field8678 == null || class646.field9353 == null) {
            if (class24.field433.method2042((byte) -80, class198.field2591) && class24.field433.method2042((byte) -80, class203.field2676)) {
                class600.field8678 = arg0.method916(class295.method1806(class24.field433, class198.field2591, 0), true);
                class295 var7 = class295.method1806(class24.field433, class203.field2676, 0);
                class646.field9353 = arg0.method916(var7, true);
                var7.method1815();
                class604.field8712 = arg0.method916(var7, true);
            } else {
                arg0.method997(var2, var3, var4, var6, 255 - class67.field891 << 24 | class34.field514, 1);
            }
        }
        if (class600.field8678 != null && class646.field9353 != null) {
            int var8 = (var4 - (class646.field9353.method637() * 2)) / class600.field8678.method637();
            for (int var9 = 0; var9 < var8; var9++) {
                class600.field8678.method632(var2 - (-class646.field9353.method637() - var9 * class600.field8678.method637()), var3);
            }
            class646.field9353.method632(var2, var3);
            class604.field8712.method632(var4 + var2 - class604.field8712.method637(), var3);
        }
        class95.field1282.method1626(-1, class245.field3102.method2157(class245.field3103, 4074), class558.field7817 | 0xFF000000, var3 + 14, (byte) -16, var2 + 3);
        arg0.method997(var2, var3 + var6, var4, var5 - var6, class34.field514 | -class67.field891 + 255 << 24, 1);
        int var10 = class343.field4760.method100((byte) -93);
        int var11 = class343.field4760.method92(8);
        int var12 = 0;
        for (class245 var13 = (class245) class57.field760.method3188((byte) -100); var13 != null; var13 = (class245) class57.field760.method3182((byte) -85)) {
            int var31 = (class50.field673 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var10 > var2 && var10 < (var2 + var4) && var31 - 13 < var11 && var11 < (var31 + 4) && var13.field3092) {
                arg0.method997(var2, var31 - 12, var4, 16, class12.field109 | 255 - class110.field1420 << 24, 1);
            }
            var12++;
        }
        if ((class173.field2243 == null || class239.field3057 == null || class480.field6728 == null) && class24.field433.method2042((byte) -80, class581.field8091) && class24.field433.method2042((byte) -80, class135.field1654) && class24.field433.method2042((byte) -80, class342.field4753)) {
            class295 var14 = class295.method1806(class24.field433, class135.field1654, 0);
            class239.field3057 = arg0.method916(var14, true);
            var14.method1815();
            class233.field2980 = arg0.method916(var14, true);
            class173.field2243 = arg0.method916(class295.method1806(class24.field433, class581.field8091, 0), true);
            class295 var15 = class295.method1806(class24.field433, class342.field4753, 0);
            class480.field6728 = arg0.method916(var15, true);
            var15.method1815();
            class387.field5384 = arg0.method916(var15, true);
        }
        int var16 = 0;
        if (class173.field2243 != null && class239.field3057 != null && class480.field6728 != null) {
            int var17 = (var4 - (class480.field6728.method637() * 2)) / class173.field2243.method637();
            for (int var18 = 0; var18 < var17; var18++) {
                class173.field2243.method632(class480.field6728.method637() + var2 + class173.field2243.method637() * var18, -class173.field2243.method630() + var3 + var5);
            }
            int var19 = (var5 - class480.field6728.method630() - var6) / class239.field3057.method630();
            for (int var20 = 0; var20 < var19; var20++) {
                class239.field3057.method632(var2, var6 + var3 + class239.field3057.method630() * var20);
                class233.field2980.method632(var2 + var4 - class233.field2980.method637(), var20 * class239.field3057.method630() + var3 + var6);
            }
            class480.field6728.method632(var2, var5 + (var3 - class480.field6728.method630()));
            class387.field5384.method632(var4 + var2 - class480.field6728.method637(), var3 + var5 - class480.field6728.method630());
        }
        for (class245 var21 = (class245) class57.field760.method3188((byte) -100); var21 != null; var21 = (class245) class57.field760.method3182((byte) -121)) {
            int var22 = (class50.field673 - var16 - 1) * 16 + var6 + var3 + 13;
            int var23 = class558.field7817 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var22 - 13 < var11 && var11 < var22 + 4 && var21.field3092) {
                var23 = class633.field9211 | 0xFF000000;
            }
            int[] var24 = null;
            if (class630.method3645(true, var21.field3094)) {
                var24 = class98.field1307.method3391(0, (int) var21.field3099).field6491;
            } else if (var21.field3100 != -1) {
                var24 = class98.field1307.method3391(0, var21.field3100).field6491;
            } else if (class17.method77(-30195, var21.field3094)) {
                class480 var27 = (class480) class131.field1619.method3476((long) ((int) var21.field3099), (byte) 28);
                if (var27 != null) {
                    class585 var28 = var27.field6729;
                    class626 var29 = var28.field8478;
                    if (var29.field9085 != null) {
                        var29 = var29.method3607(false, class257.field3191);
                    }
                    if (var29 != null) {
                        var24 = var29.field9110;
                    }
                }
            } else if (class318.method1981(15, var21.field3094)) {
                Object var25 = null;
                class137 var26;
                if (var21.field3094 == 1012) {
                    var26 = class626.field9084.method1093(0, (int) var21.field3099);
                } else {
                    var26 = class626.field9084.method1093(0, (int) (var21.field3099 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field1719 != null) {
                    var26 = var26.method722(class257.field3191, -1);
                }
                if (var26 != null) {
                    var24 = var26.field1702;
                }
            }
            String var30 = class247.method1515(-124, var21);
            if (var24 != null) {
                var30 = var30 + class66.method384((byte) 97, var24);
            }
            class95.field1282.method1620(var2 + 3, var22, var23, 20730, class134.field1639, var30, 0, class106.field1370);
            var16++;
            if (var21.field3091) {
                class53.field708.method632(var2 + class627.field9137.method856(0, var30) + 5, var22 + -12);
            }
        }
        class466.method2679(class81.field1095, class431.field5868, class641.field9318, false, class423.field5739);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public static final void method37(int arg0) {
        field84++;
        class408.field5600 = true;
        if (arg0 != 2) {
            field86 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
    public static void method38(int arg0) {
        if (arg0 != -16777216) {
            field86 = null;
        }
        field74 = null;
        field86 = null;
    }
}
