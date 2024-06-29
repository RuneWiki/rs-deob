import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class412 extends class496 {

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Ljava/lang/String;")
    public String field5865;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "[I")
    public static int[] field5867 = new int[4096];

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 6)
    public static void method2444(int arg0) {
        if (arg0 != 3) {
            field5867 = null;
        }
        field5867 = null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2445(int arg0) {
        field5866++;
        if (arg0 <= 67) {
            field5867 = null;
        }
        class463.method2749(1, 10);
        class554.method3239(17496);
        System.gc();
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 32)
    public class412() {
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIIII)V", line = 36)
    public static final void method2446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == arg9 && arg0 == arg2 && arg7 == arg8 && arg3 == arg4) {
            class171.method1089(arg2, arg1, arg9, 5000, arg4, arg7);
        } else {
            int var10 = arg9;
            int var11 = arg2;
            int var12 = arg9 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg8 * 3;
            int var17 = arg3 * 3;
            int var18 = var14 + arg7 - var16 - arg9;
            int var19 = arg4 + var15 - var17 - arg2;
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
                int var33 = (var27 + var29 + var31 >> 12) + arg9;
                int var34 = (var28 + var32 + var30 >> 12) + arg2;
                class171.method1089(var11, arg1, var10, 5000, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg5 != -6706) {
            method2445(-17);
        }
        field5864++;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 110)
    public class412(String arg0, int arg1) {
        this.field5865 = arg0;
    }
}
