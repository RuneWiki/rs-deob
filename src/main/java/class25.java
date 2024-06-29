import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class25 extends class475 {

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
    public static int[] field322 = new int[13];

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)Lgi;")
    public static final class453 method217(boolean arg0, int arg1) {
        field321++;
        class453 var2 = (class453) class216.field3215.method2393(-128, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class17.field225.method2691(arg1, 1, 0);
        class453 var4 = new class453();
        if (!arg0) {
            return null;
        }
        var4.field6427 = arg1;
        if (var3 != null) {
            var4.method2698(6, new class446(var3));
        }
        var4.method2701(-5);
        if (var4.field6425 == 2 && class233.field3417.method2305((long) arg1, (byte) 63) == null) {
            class233.field3417.method2307((long) arg1, new class145(class263.field3918), (byte) 117);
            class483.field6782[class263.field3918++] = var4;
        }
        class216.field3215.method2395(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public static void method218(boolean arg0) {
        if (!arg0) {
            field322 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)I")
    public static final int method219(int arg0, int arg1, int arg2, int arg3) {
        field326++;
        if (class479.field6745 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || (class379.field5642 - 1) < var4 || (class456.field6477 - 1) < var5) {
            return 0;
        }
        if (arg0 != 48602855) {
            field324 = 27;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class246.field3532[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class479.field6745[var6].method204(arg3, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg9 && arg1 == arg7 && arg2 == arg4 && arg6 == arg8) {
            class58.method450(arg8, -25, arg2, arg1, arg5, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg1;
            int var12 = arg0 * 3;
            int var13 = arg1 * 3;
            int var14 = arg9 * 3;
            int var15 = arg7 * 3;
            int var16 = arg4 * 3;
            int var17 = arg6 * 3;
            int var18 = arg2 + var14 - arg0 - var16;
            int var19 = arg8 + var15 - arg1 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
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
                int var33 = (var27 + var31 + var29 >> 12) + arg0;
                int var34 = (var30 + var32 + var28 >> 12) + arg1;
                class58.method450(var34, -116, var33, var11, arg5, var10);
                var11 = var34;
                var10 = var33;
            }
        }
        field325++;
        if (arg3 != 4483) {
            field322 = null;
        }
    }
}
