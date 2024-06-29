import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class681 {

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "Lqe;")
    public static class465 field9585 = new class465(23, -1);

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "Lqe;")
    public static class465 field9587 = new class465(53, 7);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "Ljava/lang/String;")
    public static String field9591;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "[[S")
    public static short[][] field9588;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Loea;[II[III)Lmm;", line = 3)
    public static final class277 method3845(class594 arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 != 7) {
            return null;
        }
        field9584++;
        byte[] var6 = new byte[arg2 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg2 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class277(arg0, arg2, arg4, var6);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 33)
    public static final void method3846(int arg0) throws class701 {
        if (arg0 > -39) {
            field9588 = null;
        }
        if (class435.field6079 == 1) {
            class154.field2309.method554(class591.field8302, class269.field3879);
        } else {
            class154.field2309.method554(0, 0);
        }
        field9589++;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 48)
    public static void method3847(int arg0) {
        field9591 = null;
        field9587 = null;
        field9588 = null;
        field9585 = null;
        if (arg0 != -2) {
            field9590 = -35;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIBIIIII)V", line = 64)
    public static final void method3848(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != -61) {
            field9585 = null;
        }
        if (arg0 == arg1 && arg6 == arg7 && arg2 == arg8 && arg5 == arg9) {
            class458.method2796(arg5, arg7, arg3, arg2, arg4 + 60, arg1);
        } else {
            int var10 = arg1;
            int var11 = arg7;
            int var12 = arg1 * 3;
            int var13 = arg7 * 3;
            int var14 = arg0 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg9 * 3;
            int var18 = arg2 + var14 - arg1 - var16;
            int var19 = arg5 + var15 - arg7 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
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
                int var33 = (var27 + var31 + var29 >> 12) + arg1;
                int var34 = (var30 + var32 + var28 >> 12) + arg7;
                class458.method2796(var34, var11, arg3, var33, arg4 ^ 0x3C, var10);
                var11 = var34;
                var10 = var33;
            }
        }
        field9586++;
    }
}
