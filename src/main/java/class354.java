import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class354 {

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5059 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5058++;
        class305.method2000(128, arg6);
        int var7 = 0;
        int var8 = arg6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class445.field6320[arg3];
        int var16 = arg1 - var8;
        if (arg0 != 2) {
            method2284(-57, 52, 101, -17, -48, -28, 15);
        }
        int var17 = arg1 + var8;
        class643.method3557(arg1 - arg6, var15, (byte) 75, arg4, var16);
        class643.method3557(var16, var15, (byte) 126, arg5, var17);
        class643.method3557(var17, var15, (byte) 104, arg4, arg1 + arg6);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class739.field10281[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class445.field6320[arg3 + var9];
                    int[] var19 = class445.field6320[arg3 - var9];
                    int var20 = class739.field10281[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class643.method3557(var22, var18, (byte) 92, arg4, var24);
                    class643.method3557(var24, var18, (byte) 82, arg5, var23);
                    class643.method3557(var23, var18, (byte) 99, arg4, var21);
                    class643.method3557(var22, var19, (byte) 57, arg4, var24);
                    class643.method3557(var24, var19, (byte) 77, arg5, var23);
                    class643.method3557(var23, var19, (byte) 123, arg4, var21);
                } else {
                    int[] var25 = class445.field6320[arg3 + var9];
                    int[] var26 = class445.field6320[arg3 - var9];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class643.method3557(var28, var25, (byte) 65, arg4, var27);
                    class643.method3557(var28, var26, (byte) 73, arg4, var27);
                }
            }
            int[] var29 = class445.field6320[arg3 + var7];
            int[] var30 = class445.field6320[arg3 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 > var7) {
                int var33 = var11 < var7 ? class739.field10281[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class643.method3557(var32, var29, (byte) 117, arg4, var35);
                class643.method3557(var35, var29, (byte) 122, arg5, var34);
                class643.method3557(var34, var29, (byte) 59, arg4, var31);
                class643.method3557(var32, var30, (byte) 63, arg4, var35);
                class643.method3557(var35, var30, (byte) 49, arg5, var34);
                class643.method3557(var34, var30, (byte) 76, arg4, var31);
            } else {
                class643.method3557(var32, var29, (byte) 98, arg4, var31);
                class643.method3557(var32, var30, (byte) 103, arg4, var31);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method2285(int arg0) {
        class716.method4034(arg0 ^ 0xFFFF9005);
        if (arg0 != -28577) {
            field5059 = 111;
        }
        field5056++;
    }
}
