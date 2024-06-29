import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class117 {

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field1727 = -2;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "[I")
    public static int[] field1730 = new int[4];

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lnd;")
    public static class547 field1725;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBIIIII)Lmda;", line = 3)
    public static final class267 method909(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1728++;
        long var7 = (long) arg3 * 67481L ^ (long) arg6 * 97549L ^ (long) arg2 * 475427L ^ (long) arg4 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg5 * 76724863L;
        class267 var9 = (class267) class589.field8255.method3079(var7, 0);
        if (var9 != null) {
            return var9;
        }
        if (arg1 >= -7) {
            method909(41, (byte) 74, -110, -124, -16, -31, -63);
        }
        class267 var10 = class739.field10303.method520(arg3, arg6, arg2, arg4, arg0, arg5);
        class589.field8255.method3077((byte) 125, var7, var10);
        return var10;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V", line = 24)
    public static void method910(byte arg0) {
        field1725 = null;
        field1730 = null;
        if (arg0 < 101) {
            field1730 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 42)
    public static final void method911(int arg0) {
        int var1 = 0;
        int var2 = -53 / ((-arg0 - 74) / 37);
        while (var1 < 100) {
            class669.field9390[var1] = null;
            var1++;
        }
        field1726++;
        class156.field2139 = 0;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lha;I)V", line = 59)
    public static final void method912(class60 arg0, int arg1) {
        field1729++;
        int var2 = 0;
        int var3 = 0;
        if (class676.field9448) {
            var2 = class209.method1347(0);
            var3 = class453.method2540(-106);
        }
        int var4 = class652.field9070 + var2;
        int var5 = class648.field8969 + var3;
        int var6 = class91.field1249;
        int var7 = class424.field5496 - 3;
        byte var8 = 20;
        if (arg1 != -16777216) {
            method912(null, -109);
        }
        class625.method3505(var8, class91.field1249, class652.field9070 + var2, arg0, class424.field5496, (byte) -51, class648.field8969 + var3, class454.field6027.method2547(-103, class243.field3143));
        int var9 = var2 + class680.field9495.method1118((byte) 122);
        int var10 = class680.field9495.method1115(4) + var3;
        if (class517.field7240) {
            int var14 = 0;
            for (class184 var15 = (class184) class330.field4215.method118(-30553); var15 != null; var15 = (class184) class330.field4215.method111(22548)) {
                int var28 = var14 * 16 + var5 + var8 + 13;
                if (var9 > class652.field9070 + var2 && (class91.field1249 + class652.field9070 + var2) > var9 && var10 > (var28 - 13) && var10 < var28 + 4 && (var15.field2555 > 1 || ((class277) var15.field2556.field313.field8921).field3476)) {
                    arg0.method528(class652.field9070 + var2, var28 + -12, class91.field1249, 16, 255 - class353.field4538 << 24 | class663.field9345, 1);
                }
                var14++;
            }
            if (class717.field9982 != null) {
                int var16 = 0;
                class625.method3505(var8, class161.field2218, class175.field2455, arg0, class238.field3097, (byte) -51, class454.field6068, class717.field9982.field2552);
                for (class277 var17 = (class277) class717.field9982.field2556.method118(-30553); var17 != null; var17 = (class277) class717.field9982.field2556.method111(22548)) {
                    int var18 = var16 * 16 + var8 + class454.field6068 + 13;
                    if (class175.field2455 < var9 && var9 < class175.field2455 + class161.field2218 && var10 > (var18 - 13) && var10 < (var18 + 4) && var17.field3476) {
                        arg0.method528(class175.field2455, var18 - 12, class161.field2218, 16, class663.field9345 | 255 - class353.field4538 << 24, 1);
                    }
                    var16++;
                }
                class648.method3631(class238.field3097, var8, class161.field2218, class175.field2455, class454.field6068, 57, arg0);
            }
        } else {
            int var11 = 0;
            for (class277 var12 = (class277) class343.field4334.method3672(arg1 + 16777215); var12 != null; var12 = (class277) class343.field4334.method3662(-1)) {
                int var13 = (class159.field2181 - var11 - 1) * 16 + var5 + var8 + 13;
                if (var9 > (class652.field9070 + var2) && class652.field9070 + var2 + class91.field1249 > var9 && var10 > (var13 - 13) && var10 < (var13 + 4) && var12.field3476) {
                    arg0.method528(class652.field9070 + var2, var13 + -12, class91.field1249, 16, class663.field9345 | 255 - class353.field4538 << 24, 1);
                }
                var11++;
            }
        }
        class648.method3631(class424.field5496, var8, class91.field1249, class652.field9070 + var2, class648.field8969 - -var3, 118, arg0);
        if (class517.field7240) {
            int var22 = 0;
            for (class184 var23 = (class184) class330.field4215.method118(-30553); var23 != null; var23 = (class184) class330.field4215.method111(22548)) {
                int var27 = class648.field8969 + var3 + 13 - (-(var22 * 16) + -var8);
                if (var23.field2555 == 1) {
                    class569.method3267(class648.field8969 + var3, (class277) var23.field2556.field313.field8921, class649.field9014 | 0xFF000000, var9, class424.field5496, arg0, var10, class652.field9070 + var2, (byte) -113, var27, class91.field1249, class87.field1205 | 0xFF000000);
                } else {
                    class758.method4220(57, var10, var27, class87.field1205 | 0xFF000000, arg0, class648.field8969 + var3, var9, class424.field5496, class652.field9070 + var2, var23, class649.field9014 | 0xFF000000, class91.field1249);
                }
                var22++;
            }
            if (class717.field9982 != null) {
                int var24 = 0;
                for (class277 var25 = (class277) class717.field9982.field2556.method118(arg1 + 16746663); var25 != null; var25 = (class277) class717.field9982.field2556.method111(arg1 ^ 0xFF005814)) {
                    int var26 = var24 * 16 + class454.field6068 + var8 + 13;
                    class569.method3267(class454.field6068, var25, class649.field9014 | 0xFF000000, var9, class238.field3097, arg0, var10, class175.field2455, (byte) -123, var26, class161.field2218, class87.field1205 | 0xFF000000);
                    var24++;
                }
                class597.method3393(class454.field6068, false, class238.field3097, class175.field2455, class161.field2218);
            }
        } else {
            int var19 = 0;
            for (class277 var20 = (class277) class343.field4334.method3672(-1); var20 != null; var20 = (class277) class343.field4334.method3662(arg1 + 16777215)) {
                int var21 = (class159.field2181 - var19 - 1) * 16 + var5 + var8 + 13;
                var19++;
                class569.method3267(var5, var20, class649.field9014 | 0xFF000000, var9, var7, arg0, var10, var4, (byte) -116, var21, var6, class87.field1205 | 0xFF000000);
            }
        }
        class597.method3393(class648.field8969 + var3, false, class424.field5496, class652.field9070 + var2, class91.field1249);
    }
}
