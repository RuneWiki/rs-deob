import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class667 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lqk;")
    public static class148 field9395 = new class148(49, -1);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field9397 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[II[II)V")
    public static final void method3821(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if ((var7 + (var10 & var9)) > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method3821(var6 - 1, arg1, 21678, arg3, arg4);
            method3821(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg2 != 21678) {
            method3822(58, -63, -118, 15, -100, -48, 10, 52);
        }
        field9396++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)[B")
    public abstract byte[] method3548(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9394++;
        if (arg2 != Integer.MAX_VALUE) {
            method3821(48, null, 5, null, -124);
        }
        int var8 = class325.method1901(arg3, class675.field9512, class395.field5484, true);
        int var9 = class325.method1901(arg0, class675.field9512, class395.field5484, true);
        int var10 = class325.method1901(arg7, class490.field6592, class116.field1628, true);
        int var11 = class325.method1901(arg6, class490.field6592, class116.field1628, true);
        int var12 = class325.method1901(arg3 + arg4, class675.field9512, class395.field5484, true);
        int var13 = class325.method1901(arg0 - arg4, class675.field9512, class395.field5484, true);
        for (int var14 = var8; var14 < var12; var14++) {
            class721.method4044(class591.field8480[var14], var10, (byte) -123, var11, arg1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class721.method4044(class591.field8480[var15], var10, (byte) -120, var11, arg1);
        }
        int var16 = class325.method1901(arg7 + arg4, class490.field6592, class116.field1628, true);
        int var17 = class325.method1901(arg6 - arg4, class490.field6592, class116.field1628, true);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class591.field8480[var18];
            class721.method4044(var19, var10, (byte) -123, var16, arg1);
            class721.method4044(var19, var16, (byte) -127, var17, arg5);
            class721.method4044(var19, var17, (byte) -124, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B)V")
    public abstract void method3550(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method3823(byte arg0) {
        if (arg0 >= 58) {
            field9395 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[B")
    public abstract byte[] method3549(int arg0, int arg1, int arg2);
}
