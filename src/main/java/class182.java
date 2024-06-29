import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class class182 {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "[S")
    public static short[] field2328;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)V")
    public static final void method1135(int arg0, int arg1, int arg2) {
        boolean var3 = class270.field3423[0][arg1][arg2] != null && class270.field3423[0][arg1][arg2].field1023 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class270.field3423[var4][arg1][arg2] == null) {
                class75 var5 = class270.field3423[var4][arg1][arg2] = new class75(var4);
                if (var3) {
                    var5.field1028++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)Z")
    public static final boolean method1136(int arg0, int arg1, int arg2) {
        if (arg0 != 128) {
            field2328 = null;
        }
        field2329++;
        return class346.method1920(arg1, (byte) -93, arg2) & class631.method3531(arg1, arg0 - 128, arg2);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)J")
    public abstract long method784(boolean arg0);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)V")
    public static final void method1137(int arg0, int arg1) {
        field2330++;
        class592 var2 = class61.method371(10, arg0, (byte) 109);
        if (arg1 < 103) {
            field2328 = null;
        }
        var2.method3253(0);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method1138(class119 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class699.field9887 == class491.field6485) {
            return;
        }
        int var5 = class256.field3127[arg1].method1565(arg3, arg2, true);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class272 var7 = class256.field3127[var6];
                if (var7 != null) {
                    var7.method1274(arg0, arg2, var5 - var7.method1565(arg3, arg2, true), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        if (arg0 != 0) {
            field2328 = null;
        }
        field2328 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != 0) {
            method1138(null, 120, 103, -29, null);
        }
        field2331++;
        if (arg3 == arg9 && arg0 == arg1 && arg2 == arg5 && arg7 == arg8) {
            class647.method3622(arg7, arg0, arg4, 9761, arg2, arg9);
            return;
        }
        int var10 = arg9;
        int var11 = arg0;
        int var12 = arg9 * 3;
        int var13 = arg0 * 3;
        int var14 = arg3 * 3;
        int var15 = arg1 * 3;
        int var16 = arg5 * 3;
        int var17 = arg8 * 3;
        int var18 = arg2 + var14 - arg9 - var16;
        int var19 = arg7 + var15 - (var17 - -arg0);
        int var20 = var16 + var12 - var14 - var14;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg9;
            int var34 = arg0 + (var28 + var30 + var32 >> 12);
            class647.method3622(var34, var11, arg4, arg6 ^ 0x2621, var33, var10);
            var11 = var34;
            var10 = var33;
        }
    }
}
