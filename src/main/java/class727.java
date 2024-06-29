import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class727 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
    public static boolean field10183;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(CB)Z", line = 6)
    public static final boolean method4082(char arg0, byte arg1) {
        field10184++;
        if (arg1 != -20) {
            return false;
        } else if ((arg0 <= '\u0000' || arg0 >= '\u0080') && (arg0 < ' ' || arg0 > 'ÿ')) {
            if (arg0 != '\u0000') {
                char[] var2 = class413.field5839;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method4083(int arg0, int arg1, int arg2, int arg3) {
        field10185++;
        class678 var4 = class630.method3597(29636, 9, (long) arg0);
        var4.method3834((byte) -118);
        var4.field9649 = arg3;
        var4.field9639 = arg2;
        if (arg1 != -1) {
            field10183 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method4084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10186++;
        class426.method2536(arg4 ^ 0x16C8, arg5);
        int var7 = 0;
        int var8 = arg5 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg4 != -5833) {
            field10183 = false;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class347.field5087[arg1];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class382.method2347(arg3 - arg5, var15, arg6, 7, var16);
        class382.method2347(var16, var15, arg2, 7, var17);
        class382.method2347(var17, var15, arg6, 7, arg3 + arg5);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class251.field3554[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class347.field5087[arg1 + var9];
                    int[] var19 = class347.field5087[arg1 - var9];
                    int var20 = class251.field3554[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class382.method2347(var22, var18, arg6, 7, var24);
                    class382.method2347(var24, var18, arg2, 7, var23);
                    class382.method2347(var23, var18, arg6, 7, var21);
                    class382.method2347(var22, var19, arg6, 7, var24);
                    class382.method2347(var24, var19, arg2, arg4 ^ 0xFFFFE930, var23);
                    class382.method2347(var23, var19, arg6, 7, var21);
                } else {
                    int[] var25 = class347.field5087[arg1 + var9];
                    int[] var26 = class347.field5087[arg1 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class382.method2347(var28, var25, arg6, 7, var27);
                    class382.method2347(var28, var26, arg6, 7, var27);
                }
            }
            int[] var29 = class347.field5087[arg1 + var7];
            int[] var30 = class347.field5087[arg1 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class382.method2347(var32, var29, arg6, 7, var31);
                class382.method2347(var32, var30, arg6, 7, var31);
            } else {
                int var33 = var11 >= var7 ? var11 : class251.field3554[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class382.method2347(var32, var29, arg6, arg4 ^ 0xFFFFE930, var35);
                class382.method2347(var35, var29, arg2, 7, var34);
                class382.method2347(var34, var29, arg6, 7, var31);
                class382.method2347(var32, var30, arg6, arg4 + 5840, var35);
                class382.method2347(var35, var30, arg2, 7, var34);
                class382.method2347(var34, var30, arg6, 7, var31);
            }
        }
    }
}
