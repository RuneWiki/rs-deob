import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class212 extends class117 {

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "Ldm;")
    public class37 field3064;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "Lao;")
    public static class188 field3065 = new class188(66, -2);

    @OriginalMember(owner = "client!vv", name = "B", descriptor = "Ltn;")
    public static class58 field3067 = null;

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILqa;)V", line = 5)
    public static final void method1414(int arg0, class162 arg1) {
        field3066++;
        int var2 = class529.field7806;
        int var3 = class103.field1641;
        int var4 = class365.field5484;
        int var5 = class447.field6548 - 3;
        int var6 = arg0;
        if (class173.field2655 == null || class226.field3302 == null) {
            if (class460.field6798.method682(0, class273.field3950) && class460.field6798.method682(arg0 ^ 0x14, class327.field5063)) {
                class173.field2655 = arg1.method517(class158.method1134(class460.field6798, class273.field3950, 0), true);
                class158 var7 = class158.method1134(class460.field6798, class327.field5063, 0);
                class226.field3302 = arg1.method517(var7, true);
                var7.method1135();
                class492.field7188 = arg1.method517(var7, true);
            } else {
                arg1.method471(var2, var3, var4, arg0, 255 - class438.field6393 << 24 | class131.field2015, 1);
            }
        }
        if (class173.field2655 != null && class226.field3302 != null) {
            int var8 = (var4 - (class226.field3302.method137() * 2)) / class173.field2655.method137();
            for (int var9 = 0; var9 < var8; var9++) {
                class173.field2655.method3129(var2 + class226.field3302.method137() + class173.field2655.method137() * var9, var3);
            }
            class226.field3302.method3129(var2, var3);
            class492.field7188.method3129(var2 + var4 - class492.field7188.method137(), var3);
        }
        class526.field7731.method2912(-1, var3 + 14, class455.field6735 | 0xFF000000, var2 + 3, class229.field3348.method1273(true, class370.field5530), (byte) -61);
        arg1.method471(var2, var3 + arg0, var4, var5 - arg0, -class438.field6393 + 255 << 24 | class131.field2015, 1);
        int var10 = class481.field7063.method713(arg0 + 67);
        int var11 = class481.field7063.method712(arg0 ^ 0xFFFF86D5);
        int var12 = 0;
        for (class231 var13 = (class231) class246.field3563.method2257((byte) 120); var13 != null; var13 = (class231) class246.field3563.method2256(arg0 + 22)) {
            int var30 = (class106.field1669 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > var30 - 13 && var11 < (var30 + 4) && var13.field3360) {
                arg1.method471(var2, var30 - 12, var4, 16, 255 - class7.field105 << 24 | class445.field6532, 1);
            }
        }
        if ((class353.field5343 == null || class111.field1765 == null || class455.field6733 == null) && class460.field6798.method682(0, class204.field2943) && class460.field6798.method682(0, class193.field2822) && class460.field6798.method682(arg0 ^ 0x14, class290.field4162)) {
            class158 var14 = class158.method1134(class460.field6798, class193.field2822, 0);
            class111.field1765 = arg1.method517(var14, true);
            var14.method1135();
            class173.field2654 = arg1.method517(var14, true);
            class353.field5343 = arg1.method517(class158.method1134(class460.field6798, class204.field2943, 0), true);
            class158 var15 = class158.method1134(class460.field6798, class290.field4162, 0);
            class455.field6733 = arg1.method517(var15, true);
            var15.method1135();
            class273.field3947 = arg1.method517(var15, true);
        }
        if (class353.field5343 != null && class111.field1765 != null && class455.field6733 != null) {
            int var16 = (var4 - (class455.field6733.method137() * 2)) / class353.field5343.method137();
            for (int var17 = 0; var17 < var16; var17++) {
                class353.field5343.method3129(var2 + class455.field6733.method137() + var17 * class353.field5343.method137(), var3 + var5 - class353.field5343.method139());
            }
            int var18 = (var5 - class455.field6733.method139() - var6) / class111.field1765.method139();
            for (int var19 = 0; var19 < var18; var19++) {
                class111.field1765.method3129(var2, var3 + var6 + (var19 * class111.field1765.method139()));
                class173.field2654.method3129(var2 + var4 - class173.field2654.method137(), class111.field1765.method139() * var19 + (var3 - -var6));
            }
            class455.field6733.method3129(var2, (var3 + var5) - class455.field6733.method139());
            class273.field3947.method3129(var2 + var4 - class455.field6733.method137(), var3 + var5 + -class455.field6733.method139());
        }
        int var20 = 0;
        for (class231 var21 = (class231) class246.field3563.method2257((byte) 127); var21 != null; var21 = (class231) class246.field3563.method2256(arg0 ^ 0xFFFFFFA0)) {
            int var22 = (class106.field1669 - var20 - 1) * 16 + var6 + var3 + 13;
            int var23 = class455.field6735 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && (var22 - 13) < var11 && (var22 + 4) > var11 && var21.field3360) {
                var23 = class21.field306 | 0xFF000000;
            }
            int[] var24 = null;
            if (class219.method1455(var21.field3368, -30)) {
                var24 = class8.field111.method3077(-125, (int) var21.field3371).field2556;
            } else if (var21.field3365 != -1) {
                var24 = class8.field111.method3077(arg0 - 143, var21.field3365).field2556;
            } else if (class32.method259(var21.field3368, (byte) -42)) {
                class13 var25 = class132.field2030[(int) var21.field3371];
                if (var25 != null) {
                    class148 var26 = var25.field210;
                    if (var26.field2193 != null) {
                        var26 = var26.method1059((byte) -51, class526.field7733);
                    }
                    if (var26 != null) {
                        var24 = var26.field2194;
                    }
                }
            } else if (class358.method2308((byte) -17, var21.field3368)) {
                Object var27 = null;
                class510 var28;
                if (var21.field3368 == 1001) {
                    var28 = class246.field3567.method609(arg0 ^ 0x7F, (int) var21.field3371);
                } else {
                    var28 = class246.field3567.method609(110, (int) (var21.field3371 >>> 32 & 0x7FFFFFFFL));
                }
                if (var28.field7497 != null) {
                    var28 = var28.method3027(class526.field7733, -12889);
                }
                if (var28 != null) {
                    var24 = var28.field7488;
                }
            }
            String var29 = class96.method766((byte) 53, var21);
            if (var24 != null) {
                var29 = var29 + class168.method1193(var24, (byte) -57);
            }
            class526.field7731.method2918(0, var2 + 3, 126, class444.field6515, var29, class147.field2166, var22, var23);
            if (var21.field3363) {
                class507.field7414.method3129(var2 + class476.field6998.method105(var29, 1) + 5, var22 + -12);
            }
            var20++;
        }
        class175.method1256(class365.field5484, true, class103.field1641, class529.field7806, class447.field6548);
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Ldm;)V", line = 201)
    public class212(class37 arg0) {
        this.field3064 = arg0;
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)V", line = 213)
    public static void method1415(int arg0) {
        field3065 = null;
        field3067 = null;
        if (arg0 != 6634) {
            method1415(104);
        }
    }
}
