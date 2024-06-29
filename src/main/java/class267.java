import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class267 extends class45 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field4463 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field4466 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public int field4465 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public int field4469 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field4473 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public int field4475 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field4474 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public int field4484 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Ljn;")
    public class59 field4464;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "[C")
    public static char[] field4472 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "Lvj;")
    public static class105 field4467 = new class105(0, -1);

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field4477 = 2;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4478 = "glow2:";

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "J")
    public static long field4481 = 0L;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "[S")
    public static short[] field4480 = new short[256];

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field4482 = 0;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "[S")
    public static short[] field4483 = new short[] { 39, 19, 8, 3, 15, 1, 26, 51 };

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Luf;")
    public static class241 field4470;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "[[[I")
    public static int[][][] field4476;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)Z", line = 11)
    public final boolean method2025(byte arg0, int arg1, int arg2) {
        field4468++;
        if (this.field4475 <= arg1 && arg1 <= this.field4473 && this.field4474 <= arg2 && this.field4465 >= arg2) {
            return true;
        } else if (this.field4463 <= arg1 && arg1 <= this.field4466 && this.field4484 <= arg2 && arg2 <= this.field4469) {
            return true;
        } else {
            if (arg0 >= -112) {
                this.field4474 = -109;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljn;)V", line = 252)
    public class267(class59 arg0) {
        this.field4464 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 42)
    public static final String method2026(String arg0, String arg1, String arg2, int arg3) {
        field4471++;
        if (arg3 == 2206) {
            for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, arg0.length() + var4)) {
                arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(var4 + arg1.length());
            }
            return arg2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FILfn;[[II[[F[III[[FLwb;)V", line = 63)
    public static final void method2027(float[][] arg0, int arg1, class314 arg2, int[][] arg3, int arg4, float[][] arg5, int[] arg6, int arg7, int arg8, float[][] arg9, class266 arg10) {
        if (arg8 != 110) {
            method2026((String) null, (String) null, (String) null, 15);
        }
        int[] var11 = new int[arg6.length / 2];
        field4461++;
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg6[var12 + var12];
            int var14 = arg6[var12 + var12 + 1];
            if (arg1 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg1 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg1 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg7][arg4];
                var18 = arg0[arg7][arg4];
                var19 = arg5[arg7][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg9[arg7 + 1][arg4];
                var18 = arg0[arg7 + 1][arg4];
                var19 = arg5[arg7 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg0[arg7 + 1][arg4 + 1];
                var19 = arg5[arg7 + 1][arg4 + 1];
                var17 = arg9[arg7 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg5[arg7][arg4 + 1];
                var18 = arg0[arg7][arg4 + 1];
                var17 = arg9[arg7][arg4 + 1];
            } else {
                float var20 = arg0[arg7][arg4];
                float var21 = arg9[arg7][arg4];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg5[arg7][arg4];
                float var24 = (arg9[arg7 + 1][arg4] - var21) * var22 + var21;
                float var25 = (arg0[arg7 + 1][arg4] - var20) * var22 + var20;
                float var26 = (float) var14 / 128.0F;
                float var27 = arg0[arg7][arg4 + 1];
                float var28 = (arg0[arg7 + 1][arg4 + 1] - var27) * var22 + var27;
                float var29 = (arg5[arg7 + 1][arg4] - var23) * var22 + var23;
                var18 = (var28 - var25) * var26 + var25;
                float var30 = arg5[arg7][arg4 + 1];
                float var31 = arg9[arg7][arg4 + 1];
                float var32 = (arg5[arg7 + 1][arg4 + 1] - var30) * var22 + var30;
                var19 = (var32 - var29) * var26 + var29;
                float var33 = (arg9[arg7 + 1][arg4 + 1] - var31) * var22 + var31;
                var17 = (var33 - var24) * var26 + var24;
            }
            int var34 = (arg7 << 7) + var13;
            int var35 = class151.method1168(arg4, arg3, (byte) 54, var13, var14, arg7);
            int var36 = (arg4 << 7) + var14;
            var11[var12] = arg10.method2024(arg2, var34, var35, var36, var18, var17, var19);
        }
        arg10.method2022(var11);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 185)
    public static void method2028(int arg0) {
        field4483 = null;
        field4476 = (int[][][]) null;
        if (arg0 > -14) {
            return;
        }
        field4478 = null;
        field4470 = null;
        field4472 = null;
        field4467 = null;
        field4480 = null;
    }
}
