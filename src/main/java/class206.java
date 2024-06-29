import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class206 {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lcm;")
    public static class449 field2917 = new class449(64, 2);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
    public static int[] field2919 = new int[32];

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Z")
    public static boolean field2920;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2918;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2919[var1] = var0 - 1;
            var0 += var0;
        }
        field2920 = false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIIIIII)V", line = 13)
    public static final void method1431(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg6 && arg7 == arg9 && arg0 == arg3 && arg4 == arg5) {
            class84.method544(false, arg8, arg7, arg4, arg6, arg3);
        } else {
            int var10 = arg6;
            int var11 = arg7;
            int var12 = arg6 * 3;
            int var13 = arg7 * 3;
            int var14 = arg1 * 3;
            int var15 = arg9 * 3;
            int var16 = arg0 * 3;
            int var17 = arg5 * 3;
            int var18 = arg3 + var14 - arg6 - var16;
            int var19 = arg4 + var15 - arg7 - var17;
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
                int var33 = (var27 + var31 + var29 >> 12) + arg6;
                int var34 = (var28 + var32 + var30 >> 12) + arg7;
                class84.method544(false, arg8, var11, var34, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg2 != -85) {
            method1432(false, -39, 13, 125);
        }
        field2918++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIII)V", line = 97)
    public static final void method1432(boolean arg0, int arg1, int arg2, int arg3) {
        field2913++;
        class377 var4 = class99.method672(arg1, false, 11);
        var4.method2340((byte) 127);
        var4.field5763 = arg2;
        var4.field5762 = arg3;
        if (!arg0) {
            method1431(19, 87, (byte) 85, -77, -56, -123, -63, 10, 18, -61);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V", line = 116)
    public class206(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2916++;
        }
        this.field2914 = arg1;
        this.field2912 = arg0;
        this.field2915 = 0x1 << this.field2916;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 141)
    public static void method1433(boolean arg0) {
        field2917 = null;
        field2919 = null;
        if (!arg0) {
            field2917 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method850(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method858(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldd;[I)V")
    public abstract void method854(class471 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method855(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method853(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method851();

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class229 method857(int arg0, int arg1, class229 arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method842(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method845(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method847(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method849(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method844(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method848(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
