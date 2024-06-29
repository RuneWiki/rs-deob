import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class213 extends class509 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "[I")
    public static int[] field3245 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Lnl;")
    public static class445 field3243 = new class445();

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[[I")
    public static int[][] field3247 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "J")
    public static long field3242;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method124(int arg0) {
        ++field3246;
        return arg0 == -32170;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method122(boolean arg0, int arg1) {
        ++field3244;
        if (arg1 != 64) {
            field3243 = null;
        }
        super.field7409.method1738(true, 255);
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 33)
    public static void method1465(int arg0) {
        field3247 = null;
        field3245 = null;
        field3243 = null;
        if (arg0 != -20765) {
            method1465(-65);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ltt;)V", line = 45)
    public class213(class249 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BILin;)V", line = 50)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        ++field3237;
        if (arg0 < 9) {
            field3236 = -33;
        }
        super.field7409.method1749(25752, arg2);
        super.field7409.method1734(-77, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 62)
    public final void method121(byte arg0) {
        ++field3240;
        super.field7409.method1738(false, 255);
        if (arg0 != 38) {
            field3243 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Ldk;", line = 77)
    public static final class424 method1466(int arg0) {
        if (arg0 != -9543) {
            field3236 = -30;
        }
        class191.field2927 = 0;
        ++field3238;
        return class317.method2107(-80);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IFZIIIFI[FFIII)V", line = 92)
    public static final void method1467(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, float arg9, int arg10, int arg11, int arg12) {
        int var13 = arg4 - arg12;
        ++field3239;
        int var14 = arg10 - arg7;
        int var15 = arg0 - arg11;
        float var16 = arg8[2] * (float) var14 + arg8[1] * (float) var15 + arg8[0] * (float) var13;
        float var17 = arg8[5] * (float) var14 + arg8[3] * (float) var13 + arg8[4] * (float) var15;
        float var18 = arg8[8] * (float) var14 + arg8[7] * (float) var15 + arg8[6] * (float) var13;
        float var19;
        float var20;
        if (~arg3 == -1) {
            var19 = -var18 + arg6 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg3 != 1) {
            if (~arg3 == -3) {
                var19 = -var17 + arg9 + 0.5F;
                var20 = -var16 + arg1 + 0.5F;
            } else if (~arg3 == -4) {
                var20 = arg1 + var16 + 0.5F;
                var19 = -var17 + arg9 + 0.5F;
            } else if (arg3 == 4) {
                var20 = arg6 + var18 + 0.5F;
                var19 = -var17 + arg9 + 0.5F;
            } else {
                var20 = -var18 + arg6 + 0.5F;
                var19 = -var17 + arg9 + 0.5F;
            }
        } else {
            var19 = arg6 + var18 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        }
        if (~arg5 == -2) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (~arg5 == -3) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg5 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class105.field1617 = var20;
        if (!arg2) {
            field3245 = null;
        }
        class367.field5415 = var19;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZ)V", line = 184)
    public final void method123(int arg0, int arg1, boolean arg2) {
        ++field3241;
        if (arg2) {
            method1467(125, 1.9388021F, true, 99, -22, 117, -0.861895F, 106, (float[]) null, 0.13336463F, -48, 103, 50);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BZ)V", line = 201)
    public final void method128(byte arg0, boolean arg1) {
        if (arg0 > 44) {
            ++field3235;
        }
    }
}
