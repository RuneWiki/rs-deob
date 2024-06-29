import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class272 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "J")
    public static long field4371 = 0L;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public static int[] field4375 = new int[14];

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4374 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lqi;")
    public static class131 field4373;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public static int[] field4377;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lib;")
    public static final class156 method1882(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4532;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([IIIIII)V")
    public static final void method1883(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class286 var6 = class220.field3525[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class135 var7 = var6.field4537;
        if (var7 != null) {
            int var8 = var7.field2213;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class203 var10 = var6.field4527;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3264;
        int var12 = var10.field3254;
        int var13 = var10.field3251;
        int var14 = var10.field3248;
        int[] var15 = class252.field4161[var11];
        int[] var16 = class75.field1087[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
    public static final void method1884(int arg0, int arg1, int arg2) {
        field4372++;
        class201 var3 = class94.method738(-66, arg2, arg1);
        var3.method1477(0);
        var3.field3226 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method1885(int arg0) {
        class21.field232.method1556((byte) 117);
        if (arg0 != 14) {
            method1884(-56, -79, -25);
        }
        field4376++;
        class289.field4583.method1556((byte) 82);
        class268.field4331.method1556((byte) 70);
        class119.field1719.method1556((byte) 78);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method1886(int arg0) {
        field4377 = null;
        field4373 = null;
        field4375 = null;
        if (arg0 != 3) {
            method1885(55);
        }
    }
}
