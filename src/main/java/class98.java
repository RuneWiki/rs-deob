import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class98 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lag;")
    public static class97 field1474 = new class97();

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[[[I")
    public static int[][][] field1475;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class234.method1542((byte) -88, arg6);
        field1477++;
        int var7 = arg6;
        int var8 = 0;
        int var9 = arg6 - arg0;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg6;
        int var11 = -var9;
        int var12 = var9;
        int var13 = -1;
        if (arg3 != 1443327457) {
            field1475 = null;
        }
        int[] var14 = class163.field2370[arg5];
        int var15 = -1;
        int var16 = arg1 - var9;
        class183.method1181(arg4, (byte) -69, var16, var14, arg1 - arg6);
        int var17 = arg1 + var9;
        class183.method1181(arg2, (byte) -69, var17, var14, var16);
        class183.method1181(arg4, (byte) -69, arg1 + arg6, var14, var17);
        while (var8 < var7) {
            var13 += 2;
            var10 += var13;
            var15 += 2;
            var11 += var15;
            if (var11 >= 0 && var12 >= 1) {
                class288.field4565[var12] = var8;
                var12--;
                var11 -= var12 << 1;
            }
            var8++;
            if (var10 >= 0) {
                var7--;
                if (var7 < var9) {
                    int[] var18 = class163.field2370[arg5 + var7];
                    int[] var19 = class163.field2370[arg5 - var7];
                    int var20 = class288.field4565[var7];
                    int var21 = arg1 + var8;
                    int var22 = arg1 - var8;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class183.method1181(arg4, (byte) -69, var24, var18, var22);
                    class183.method1181(arg2, (byte) -69, var23, var18, var24);
                    class183.method1181(arg4, (byte) -69, var21, var18, var23);
                    class183.method1181(arg4, (byte) -69, var24, var19, var22);
                    class183.method1181(arg2, (byte) -69, var23, var19, var24);
                    class183.method1181(arg4, (byte) -69, var21, var19, var23);
                } else {
                    int[] var25 = class163.field2370[arg5 + var7];
                    int[] var26 = class163.field2370[arg5 - var7];
                    int var27 = arg1 + var8;
                    int var28 = arg1 - var8;
                    class183.method1181(arg4, (byte) -69, var27, var25, var28);
                    class183.method1181(arg4, (byte) -69, var27, var26, var28);
                }
                var10 -= var7 << 1;
            }
            int[] var29 = class163.field2370[arg5 + var8];
            int[] var30 = class163.field2370[arg5 - var8];
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var8 < var9) {
                int var33 = var8 <= var12 ? var12 : class288.field4565[var8];
                int var34 = arg1 - var33;
                int var35 = arg1 + var33;
                class183.method1181(arg4, (byte) -69, var34, var29, var31);
                class183.method1181(arg2, (byte) -69, var35, var29, var34);
                class183.method1181(arg4, (byte) -69, var32, var29, var35);
                class183.method1181(arg4, (byte) -69, var34, var30, var31);
                class183.method1181(arg2, (byte) -69, var35, var30, var34);
                class183.method1181(arg4, (byte) -69, var32, var30, var35);
            } else {
                class183.method1181(arg4, (byte) -69, var32, var29, var31);
                class183.method1181(arg4, (byte) -69, var32, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public static final void method660(long arg0, int arg1) {
        if (arg1 >= -67) {
            return;
        }
        field1478++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class283.method1906(arg0 - 1L, false);
            class283.method1906(1L, false);
        } else {
            class283.method1906(arg0, false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method661(int arg0) {
        field1475 = null;
        if (arg0 != 0) {
            field1475 = null;
        }
        field1474 = null;
    }
}
