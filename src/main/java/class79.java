import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lna;")
    private static class26 field1249 = class69.method505("Ok", (byte) -127);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[[Lli;")
    public static class218[][] field1248 = new class218[13][13];

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lna;")
    public static class26 field1250 = field1249;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 8)
    public static void method566(int arg0) {
        field1248 = (class218[][]) null;
        field1250 = null;
        field1249 = null;
        if (arg0 <= 15) {
            field1249 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 38)
    public static final void method567(byte arg0) {
        if (arg0 > -45) {
            field1248 = (class218[][]) ((class218[][]) null);
        }
        field1251++;
        while (true) {
            class265 var1;
            class241 var3;
            do {
                var1 = (class265) class188.field2962.method262((byte) -3);
                if (var1 == null) {
                    return;
                }
                if (var1.field4345 < 0) {
                    int var2 = -var1.field4345 - 1;
                    if (class327.field5668 == var2) {
                        var3 = class13.field221;
                    } else {
                        var3 = class268.field4427[var2];
                    }
                } else {
                    int var4 = var1.field4345 - 1;
                    var3 = class185.field2877[var4];
                }
            } while (var3 == null);
            class78 var5 = class104.method750(4, var1.field4342);
            if (class279.field4651 < 3) {
            }
            int var6;
            int var7;
            if (var1.field4362 == 1 || var1.field4362 == 3) {
                var7 = var5.field1171;
                var6 = var5.field1178;
            } else {
                var6 = var5.field1171;
                var7 = var5.field1178;
            }
            int var8 = (var6 + 1 >> 1) + var1.field4343;
            int var9 = (var6 >> 1) + var1.field4343;
            int var10 = (var7 >> 1) + var1.field4360;
            int var11 = (var7 + 1 >> 1) + var1.field4360;
            int[][] var12 = class229.field3635[class279.field4651];
            int var13 = var12[var9][var10] + var12[var8][var10] + var12[var8][var11] + var12[var9][var11] >> 2;
            class86 var14 = null;
            int var15 = class222.field3519[var1.field4353];
            if (var15 == 0) {
                class267 var16 = class307.method2149(class279.field4651, var1.field4343, var1.field4360);
                if (var16 != null) {
                    var14 = var16.field4409;
                }
            } else if (var15 == 1) {
                class164 var19 = class229.method1541(class279.field4651, var1.field4343, var1.field4360);
                if (var19 != null) {
                    var14 = var19.field2550;
                }
            } else if (var15 == 2) {
                class39 var17 = class222.method1483(class279.field4651, var1.field4343, var1.field4360);
                if (var17 != null) {
                    var14 = var17.field632;
                }
            } else if (var15 == 3) {
                class137 var18 = class82.method623(class279.field4651, var1.field4343, var1.field4360);
                if (var18 != null) {
                    var14 = var18.field2095;
                }
            }
            if (var14 != null) {
                class246.method1697(class279.field4651, var1.field4360, -96, 0, var1.field4343, var1.field4361 + 1, -1, var15, 0, var1.field4338 + 1);
                var3.field3915 = class229.field3626 + var1.field4361;
                var3.field3977 = var1.field4360 * 128 + var7 * 64;
                var3.field3919 = var1.field4343 * 128 + var6 * 64;
                var3.field3933 = var14;
                int var20 = var1.field4340;
                var3.field3955 = var13;
                var3.field3935 = class229.field3626 + var1.field4338;
                int var21 = var1.field4344;
                int var22 = var1.field4352;
                int var23 = var1.field4355;
                if (var20 > var21) {
                    int var24 = var20;
                    var20 = var21;
                    var21 = var24;
                }
                var3.field3961 = var1.field4343 + var21;
                if (var22 > var23) {
                    int var25 = var22;
                    var22 = var23;
                    var23 = var25;
                }
                var3.field3914 = var1.field4360 + var22;
                var3.field3960 = var1.field4360 + var23;
                var3.field3925 = var1.field4343 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 209)
    public static final void method568(byte arg0) {
        class22.field315.method1986((byte) -112);
        field1247++;
        if (arg0 != -6) {
            method566(-114);
        }
        class295.field4909.method1986((byte) -100);
    }
}
