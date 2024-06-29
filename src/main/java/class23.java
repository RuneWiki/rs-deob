import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "J")
    public static long field398 = 0L;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field401 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "F")
    public static float field400;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[I")
    public static int[] field403;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 16)
    public static void method162(int arg0) {
        if (arg0 == 1) {
            field401 = null;
            field403 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V", line = 32)
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class55.method405(arg4, 20333);
        int var7 = 0;
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        field402++;
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = -var8;
        int var12 = -1;
        int var13 = var8;
        int var14 = -1;
        int[] var15 = class102.field1729[arg6];
        int var16 = arg3 - var8;
        if (arg1 >= -100) {
            return;
        }
        int var17 = arg3 + var8;
        class86.method614(arg2, -24891, var16, arg3 - arg4, var15);
        class86.method614(arg0, -24891, var17, var16, var15);
        class86.method614(arg2, -24891, arg3 + arg4, var17, var15);
        while (var7 < var9) {
            var14 += 2;
            var12 += 2;
            var11 += var14;
            if (var11 >= 0 && var13 >= 1) {
                class26.field427[var13] = var7;
                var13--;
                var11 -= var13 << 1;
            }
            var7++;
            var10 += var12;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class102.field1729[arg6 + var9];
                    int var19 = arg3 + var7;
                    int var20 = arg3 - var7;
                    int[] var21 = class102.field1729[arg6 - var9];
                    class86.method614(arg2, -24891, var19, var20, var18);
                    class86.method614(arg2, -24891, var19, var20, var21);
                } else {
                    int[] var22 = class102.field1729[arg6 + var9];
                    int var23 = class26.field427[var9];
                    int var24 = arg3 + var7;
                    int[] var25 = class102.field1729[arg6 - var9];
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var23;
                    int var28 = arg3 - var23;
                    class86.method614(arg2, -24891, var28, var26, var22);
                    class86.method614(arg0, -24891, var27, var28, var22);
                    class86.method614(arg2, -24891, var24, var27, var22);
                    class86.method614(arg2, -24891, var28, var26, var25);
                    class86.method614(arg0, -24891, var27, var28, var25);
                    class86.method614(arg2, -24891, var24, var27, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class102.field1729[arg6 + var7];
            int[] var30 = class102.field1729[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var13 ? var13 : class26.field427[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class86.method614(arg2, -24891, var35, var32, var29);
                class86.method614(arg0, -24891, var34, var35, var29);
                class86.method614(arg2, -24891, var31, var34, var29);
                class86.method614(arg2, -24891, var35, var32, var30);
                class86.method614(arg0, -24891, var34, var35, var30);
                class86.method614(arg2, -24891, var31, var34, var30);
            } else {
                class86.method614(arg2, -24891, var31, var32, var29);
                class86.method614(arg2, -24891, var31, var32, var30);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 167)
    public static final String method164(boolean arg0) {
        String var1;
        if (class152.field2451 == 1 && class65.field1062 < 2) {
            var1 = class57.field917 + class26.field433 + class258.field3979 + " ->";
        } else if (class219.field3514 && class65.field1062 < 2) {
            var1 = class239.field3722 + class26.field433 + class82.field1232 + " ->";
        } else if (class277.field4288 && class108.field1795[81] && class65.field1062 > 2) {
            var1 = class215.method1559(false, class65.field1062 - 2);
        } else {
            var1 = class215.method1559(!arg0, class65.field1062 - 1);
        }
        if (class65.field1062 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class65.field1062 - 2) + class102.field1726;
        }
        if (!arg0) {
            method163(-25, -56, 5, 123, 99, 101, -68);
        }
        field399++;
        return var1;
    }
}
