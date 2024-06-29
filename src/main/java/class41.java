import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field596 = -1;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lwm;")
    public class529 field598;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "[I")
    public int[] field599;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field597;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
    public static final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field600++;
        class287.method1782(arg2, -13805);
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = arg3;
        int[] var15 = class236.field3325[arg0];
        int var16 = arg6 - var8;
        class475.method2668(arg5, var16, 7, var15, arg6 - arg2);
        int var17 = arg6 + var8;
        class475.method2668(arg1, var17, 7, var15, var16);
        class475.method2668(arg5, arg2 + arg6, 7, var15, var17);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class661.field9394[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class236.field3325[arg0 + var9];
                    int[] var19 = class236.field3325[arg0 - var9];
                    int var20 = arg6 + var7;
                    int var21 = arg6 - var7;
                    class475.method2668(arg5, var20, 7, var18, var21);
                    class475.method2668(arg5, var20, 7, var19, var21);
                } else {
                    int[] var22 = class236.field3325[arg0 + var9];
                    int[] var23 = class236.field3325[arg0 - var9];
                    int var24 = class661.field9394[var9];
                    int var25 = arg6 + var7;
                    int var26 = arg6 - var7;
                    int var27 = arg6 + var24;
                    int var28 = arg6 - var24;
                    class475.method2668(arg5, var28, 7, var22, var26);
                    class475.method2668(arg1, var27, 7, var22, var28);
                    class475.method2668(arg5, var25, 7, var22, var27);
                    class475.method2668(arg5, var28, 7, var23, var26);
                    class475.method2668(arg1, var27, arg3 ^ 0xFFFFFFF8, var23, var28);
                    class475.method2668(arg5, var25, 7, var23, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class236.field3325[arg0 + var7];
            int[] var30 = class236.field3325[arg0 - var7];
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (var7 >= var8) {
                class475.method2668(arg5, var31, 7, var29, var32);
                class475.method2668(arg5, var31, arg3 + 8, var30, var32);
            } else {
                int var33 = var7 > var11 ? class661.field9394[var7] : var11;
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class475.method2668(arg5, var35, 7, var29, var32);
                class475.method2668(arg1, var34, 7, var29, var35);
                class475.method2668(arg5, var31, arg3 + 8, var29, var34);
                class475.method2668(arg5, var35, 7, var30, var32);
                class475.method2668(arg1, var34, 7, var30, var35);
                class475.method2668(arg5, var31, 7, var30, var34);
            }
        }
    }
}
