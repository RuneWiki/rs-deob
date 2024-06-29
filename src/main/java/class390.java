import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class390 {

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "[[Z")
    public static boolean[][] field5435 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BLvj;)V", line = 3)
    public static final void method2367(byte arg0, class26 arg1) {
        if (arg0 >= -32) {
            return;
        }
        field5434++;
        int var2 = arg1.method190(-27226);
        class157.field2137 = new class17[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class157.field2137[var3] = new class17();
            class157.field2137[var3].field216 = arg1.method190(-27226);
            class157.field2137[var3].field213 = arg1.method166((byte) -125);
        }
        class639.field9087 = arg1.method190(-27226);
        class610.field8681 = arg1.method190(-27226);
        class724.field10198 = arg1.method190(-27226);
        class658.field9293 = new class183[class610.field8681 + 1 - class639.field9087];
        for (int var4 = 0; var4 < class724.field10198; var4++) {
            int var5 = arg1.method190(-27226);
            class183 var6 = class658.field9293[var5] = new class183();
            var6.field5393 = arg1.method194((byte) 119);
            var6.field5394 = arg1.method189(255);
            var6.field2655 = class639.field9087 + var5;
            var6.field2651 = arg1.method166((byte) -125);
            var6.field2659 = arg1.method166((byte) -125);
        }
        class560.field7964 = arg1.method189(255);
        class93.field1266 = true;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method2368(int arg0, int arg1, int arg2) {
        if (arg2 != -1003763703) {
            field5435 = null;
        }
        field5432++;
        return class54.method363((byte) 120, arg1, arg0) | (arg1 & 0x800) != 0 || class164.method1020(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 63)
    public static void method2369(int arg0) {
        if (arg0 != -8867) {
            field5436 = -47;
        }
        field5435 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIIIBII)V", line = 73)
    public static final void method2370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field5431++;
        if (arg8 < 512 || arg3 < 512 || ((class514.field7179 - 2) * 512) < arg8 || ((class456.field6281 - 2) * 512) < arg3) {
            class161.field2235[0] = class161.field2235[1] = -1;
            return;
        }
        int var10 = class438.method2628(arg8, arg2, arg3, (byte) -68) - arg1;
        if (class264.field3595) {
            class712.method3999(true, (byte) 103);
        } else {
            class123.field1685.method851(arg0, 0, 0);
            class96.field1401.method2068(class123.field1685);
        }
        int var11 = 16 / ((60 - arg7) / 61);
        if (class286.field3774) {
            class96.field1401.method2195(arg8, var10, arg3, class527.field7375, class161.field2235);
        } else {
            class96.field1401.method2123(arg8, var10, arg3, class161.field2235);
        }
        if (class264.field3595) {
            class689.method3928((byte) -126);
        } else {
            class123.field1685.method851(-arg0, 0, 0);
            class96.field1401.method2068(class123.field1685);
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(FIFFBFFF)F", line = 112)
    public static final float method2371(float arg0, int arg1, float arg2, float arg3, byte arg4, float arg5, float arg6, float arg7) {
        field5433++;
        float var8 = 0.0F;
        float var9 = arg2 - arg3;
        float var10 = arg5 - arg6;
        int var11 = -3 / ((69 - arg4) / 50);
        float var12 = arg7 - arg0;
        float var13 = 0.0F;
        float var14 = 0.0F;
        float var15 = 0.0F;
        while (var8 < 1.1F) {
            float var16 = var8 * var9 + arg3;
            float var17 = var8 * var10 + arg6;
            float var18 = var8 * var12 + arg0;
            int var19 = (int) var16 >> 9;
            int var20 = (int) var18 >> 9;
            if (var19 > 0 && var20 > 0 && var19 < class514.field7179 && class456.field6281 > var20) {
                int var21 = class473.field6483.field9501;
                if (var21 < 3 && (class429.field5916[1][var19][var20] & 0x2) != 0) {
                    var21++;
                }
                int var22 = class155.field2126[var21].method1960((int) var16, (int) var18, 119);
                if ((float) var22 < var17) {
                    if (arg1 < 2) {
                        return var8;
                    }
                    return method2371(var15, arg1 - 1, var16, var13, (byte) 125, var17, var14, var18) * 0.1F + (var8 - 0.1F);
                }
            }
            var13 = var16;
            var15 = var18;
            var14 = var17;
            var8 += 0.1F;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I", line = 182)
    public static final int method2372(int arg0) {
        field5430++;
        if (arg0 > -85) {
            field5436 = 83;
        }
        return class589.field8461 == 1 ? class647.field9167 : class54.field756;
    }
}
