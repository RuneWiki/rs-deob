import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class73 extends class12 {

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Z")
    public boolean field1391 = false;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lkh;")
    private static class117 field1390 = class224.method1450((byte) -42, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Lkh;")
    public static class117 field1393 = field1390;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    public static int[] field1389 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "Lvb;")
    public static class232 field1395;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[[[B")
    public static byte[][][] field1394;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[I)[I")
    public static final int[] method512(int arg0, int[] arg1) {
        field1396++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class2.method6(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lce;")
    public static final class28 method513(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        return var3 == null || var3.field3074 == null ? null : var3.field3074;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ldd;IIIII)V")
    public static final void method514(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class60.field1208 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class92.field1698) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class170.field3053 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class170 var14 = class109.field2063[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class156.field2839[var11][var12 + 1][var13] + class156.field2839[var11][var12][var13] + class156.field2839[var11][var12][var13 + 1] + class156.field2839[var11][var12 + 1][var13 + 1]) / 4 - (class156.field2839[arg1][arg2 + 1][arg3] + class156.field2839[arg1][arg2][arg3] + class156.field2839[arg1][arg2][arg3 + 1] + class156.field2839[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class90 var16 = var14.field3062;
                                    if (var16 != null) {
                                        if (var16.field1661.method146()) {
                                            arg0.method152(var16.field1661, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1678 != null && var16.field1678.method146()) {
                                            arg0.method152(var16.field1678, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3065; var17++) {
                                        class57 var18 = var14.field3063[var17];
                                        if (var18 != null && var18.field1182.method146() && (var18.field1186 == var12 || var7 == var12) && (var18.field1170 == var13 || var9 == var13)) {
                                            int var19 = var18.field1178 + 1 - var18.field1186;
                                            int var20 = var18.field1179 + 1 - var18.field1170;
                                            arg0.method152(var18.field1182, (var18.field1186 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1170 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V")
    public static final void method515(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -65) {
            field1395 = null;
        }
        field1392++;
        if (class74.field1406 == 0 || arg1 == 0 || class219.field3975 >= 50 || arg0 == -1) {
            return;
        }
        class178.field3226[class219.field3975] = arg0;
        class5.field65[class219.field3975] = arg1;
        class34.field803[class219.field3975] = arg3;
        class80.field1508[class219.field3975] = null;
        class174.field3127[class219.field3975] = 0;
        class219.field3975++;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1389 = null;
        field1394 = null;
        field1395 = null;
        field1390 = null;
        field1393 = null;
        if (arg0 != 2) {
            method515(-66, -15, -20, -50);
        }
    }
}
