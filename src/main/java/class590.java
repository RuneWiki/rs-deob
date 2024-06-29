import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class590 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lem;")
    public static class610 field8226 = new class610(1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public static final void method3278(int arg0, int arg1) {
        if (arg0 != 1) {
            field8229 = 109;
        }
        class202.field2576 = 2;
        class643.field8880 = arg1;
        field8225++;
        long var2 = 0L;
        if (class224.field2948 == null) {
            class600.method3307(110, 35);
        } else {
            class179 var4 = new class179(class149.method932(class340.method1991((byte) -34, class224.field2948), 5518));
            long var5 = var4.method1093(215350688);
            class5.field60 = var4.method1093(215350688);
            class406.method2407(-1591, class541.method3079(0, var5), true, "");
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method3279(byte arg0) {
        field8226 = null;
        if (arg0 != 102) {
            method3279((byte) -50);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lgba;Lqca;Lha;B)V")
    public static final void method3280(class499 arg0, class351 arg1, class454 arg2, byte arg3) {
        field8228++;
        class712 var4 = arg1.method2066(arg2, (byte) -76);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1895();
        if (var5 < var4.method1893()) {
            var5 = var4.method1893();
        }
        byte var6 = 10;
        int var7 = arg0.field7050;
        int var8 = arg0.field7046;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg1.field4599 != null) {
            var9 = class324.field4132.method454((byte) -70, null, null, class405.field5714, arg1.field4599);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class405.field5714[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class169.field2234.method2557(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class169.field2234.method2558() + (class169.field2234.method2560() / 2);
        }
        int var15 = var5 / 2 + arg0.field7050;
        if (var7 < (class341.field4428 + var5)) {
            var15 = var5 / 2 + class341.field4428 - (-var6 - (var10 / 2 + 5));
            var7 = class341.field4428;
        } else if (class341.field4444 - var5 < var7) {
            var7 = class341.field4444 - var5;
            var15 = class341.field4444 - (var5 / 2) - var10 / 2 - var6 - 5;
        }
        int var16 = arg0.field7046;
        if ((class341.field4430 + var5) > var8) {
            var16 = class341.field4430 - (-var6 - var5 / 2);
            var8 = class341.field4430;
        } else if (var8 > class341.field4438 - var5) {
            var8 = class341.field4438 - var5;
            var16 = class341.field4438 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field7050), (double) (var8 - arg0.field7046)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3930((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        if (arg3 != 49) {
            method3279((byte) -38);
        }
        int var20 = -2;
        int var21 = -2;
        if (arg1.field4599 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var16 + var9 * class169.field2234.method2558() + 3;
            var20 = var18 + var10 + 10;
            if (arg1.field4583 != 0) {
                arg2.method2668(var16, false, var20 - var18, -var16 + var21, var18, arg1.field4583);
            }
            if (arg1.field4584 != 0) {
                arg2.method2659(var20 - var18, var18, var21 - var16, 0, arg1.field4584, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class405.field5714[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class169.field2234.method2556(arg2, var23, var15, var16, arg1.field4616, true);
                var16 += class169.field2234.method2558();
            }
        }
        if (arg1.field4593 == -1 && arg1.field4599 == null) {
            return;
        }
        class110 var24 = new class110(arg0);
        int var25 = var5 >> 1;
        var24.field1350 = var19;
        var24.field1352 = var21;
        var24.field1347 = var8 - var25;
        var24.field1358 = var7 - var25;
        var24.field1349 = var7 + var25;
        var24.field1353 = var8 + var25;
        var24.field1355 = var18;
        var24.field1348 = var20;
        class419.field5962.method3110(var24, 1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(FBFFFFFI)F")
    public static final float method3281(float arg0, byte arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7) {
        field8227++;
        float var8 = 0.0F;
        float var9 = arg6 - arg4;
        float var10 = arg2 - arg3;
        float var11 = arg5 - arg0;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        int var15 = -60 % ((74 - arg1) / 35);
        while (var8 < 1.1F) {
            float var16 = var8 * var9 + arg4;
            float var17 = var8 * var10 + arg3;
            float var18 = var8 * var11 + arg0;
            int var19 = (int) var16 >> 9;
            int var20 = (int) var18 >> 9;
            if (var19 > 0 && var20 > 0 && var19 < class613.field8591 && class1.field3 > var20) {
                int var21 = class339.field4374.field5779;
                if (var21 < 3 && (class215.field2728[1][var19][var20] & 0x2) != 0) {
                    var21++;
                }
                int var22 = class716.field10106[var21].method2382((byte) 19, (int) var18, (int) var16);
                if (var17 > (float) var22) {
                    if (arg7 >= 2) {
                        return var8 + method3281(var14, (byte) 115, var17, var13, var12, var18, var16, arg7 + -1) * 0.1F - 0.1F;
                    }
                    return var8;
                }
            }
            var14 = var18;
            var8 += 0.1F;
            var13 = var17;
            var12 = var16;
        }
        return -1.0F;
    }
}
