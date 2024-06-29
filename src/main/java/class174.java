import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class174 {

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Ljf;")
    public static class667 field2285 = new class667();

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBIIIIIIII)V", line = 3)
    public static final void method1087(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -118) {
            method1088(-52, (byte) -81, -97);
        }
        if (arg5 == arg7 && arg3 == arg9 && arg2 == arg8 && arg4 == arg6) {
            class7.method19(arg2, arg7, (byte) -54, arg0, arg4, arg3);
        } else {
            int var10 = arg7;
            int var11 = arg3;
            int var12 = arg7 * 3;
            int var13 = arg3 * 3;
            int var14 = arg5 * 3;
            int var15 = arg9 * 3;
            int var16 = arg8 * 3;
            int var17 = arg6 * 3;
            int var18 = var14 + arg2 - var16 - arg7;
            int var19 = arg4 + var15 - (arg3 + var17);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg7;
                int var34 = (var30 + var32 + var28 >> 12) + arg3;
                class7.method19(var33, var10, (byte) -50, arg0, var34, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field2283++;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)Z", line = 78)
    public static final boolean method1088(int arg0, byte arg1, int arg2) {
        field2284++;
        int var3 = -68 % ((arg1 - 54) / 60);
        return class76.method470(arg0, 125, arg2) || class759.method4131(arg0, arg2, -1);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIZ)V", line = 88)
    public static final void method1089(int arg0, int arg1, boolean arg2) {
        field2286++;
        class614 var3 = class497.method2759(19, 5977, (long) arg0 | (long) arg1 << 32);
        var3.method3279(arg2);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 100)
    public static void method1090(int arg0) {
        field2285 = null;
        if (arg0 != 3) {
            method1090(-22);
        }
    }
}
