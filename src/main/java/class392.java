import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class392 extends class204 {

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5801 = 0;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
    public static int[] field5804 = new int[1000];

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lcv;")
    public static class398 field5803 = new class398(512);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lmd;")
    public static class379 field5805;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5802++;
        class117.method856(arg4, 51);
        int var7 = 0;
        int var8 = arg4 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class436.field6332[arg5];
        if (arg0 > -55) {
            method2454(-40, -100, -122, 39, 123, 51, 15);
        }
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class217.method1448(var15, arg3 - arg4, arg6, 4, var16);
        class217.method1448(var15, var16, arg1, 4, var17);
        class217.method1448(var15, var17, arg6, 4, arg3 + arg4);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class453.field6716[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class436.field6332[arg5 + var9];
                    int[] var19 = class436.field6332[arg5 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class217.method1448(var18, var21, arg6, 4, var20);
                    class217.method1448(var19, var21, arg6, 4, var20);
                } else {
                    int[] var22 = class436.field6332[arg5 + var9];
                    int[] var23 = class436.field6332[arg5 - var9];
                    int var24 = class453.field6716[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class217.method1448(var22, var26, arg6, 4, var28);
                    class217.method1448(var22, var28, arg1, 4, var27);
                    class217.method1448(var22, var27, arg6, 4, var25);
                    class217.method1448(var23, var26, arg6, 4, var28);
                    class217.method1448(var23, var28, arg1, 4, var27);
                    class217.method1448(var23, var27, arg6, 4, var25);
                }
            }
            int[] var29 = class436.field6332[arg5 + var7];
            int[] var30 = class436.field6332[arg5 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 > var7) {
                int var33 = var11 >= var7 ? var11 : class453.field6716[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class217.method1448(var29, var32, arg6, 4, var35);
                class217.method1448(var29, var35, arg1, 4, var34);
                class217.method1448(var29, var34, arg6, 4, var31);
                class217.method1448(var30, var32, arg6, 4, var35);
                class217.method1448(var30, var35, arg1, 4, var34);
                class217.method1448(var30, var34, arg6, 4, var31);
            } else {
                class217.method1448(var29, var32, arg6, 4, var31);
                class217.method1448(var30, var32, arg6, 4, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 153)
    public static void method2455(int arg0) {
        if (arg0 != 2) {
            method2454(96, 30, 50, 74, 6, 12, -13);
        }
        field5805 = null;
        field5804 = null;
        field5803 = null;
    }
}
