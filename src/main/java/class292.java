import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class292 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lme;")
    private class668 field3777 = new class668(64);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lpe;")
    private class615 field3775;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -61 % ((-arg4 - 46) / 59);
        if (arg0 == arg2 && arg6 == arg8 && arg7 == arg9 && arg1 == arg5) {
            class288.method1713(arg0, arg6, 1902406796, arg1, arg3, arg9);
        } else {
            int var11 = arg0;
            int var12 = arg6;
            int var13 = arg0 * 3;
            int var14 = arg6 * 3;
            int var15 = arg2 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = arg5 * 3;
            int var19 = arg9 + var15 - var17 - arg0;
            int var20 = var16 + arg1 - var18 - arg6;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 + var18 - (var16 - -var16);
            int var23 = var15 - var13;
            int var24 = var16 - var14;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var20 * var27;
                int var30 = var21 * var26;
                int var31 = var22 * var26;
                int var32 = var23 * var25;
                int var33 = var24 * var25;
                int var34 = (var28 + var32 + var30 >> 12) + arg0;
                int var35 = (var29 + var31 + var33 >> 12) + arg6;
                class288.method1713(var11, var12, 1902406796, var35, arg3, var34);
                var11 = var34;
                var12 = var35;
            }
        }
        field3776++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JJ)J")
    public static long method1731(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Ljc;")
    public final class470 method1732(boolean arg0, int arg1) {
        field3779++;
        class668 var3 = this.field3777;
        class470 var4;
        synchronized (this.field3777) {
            var4 = (class470) this.field3777.method3655(-113, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field3775;
        byte[] var6;
        synchronized (this.field3775) {
            var6 = this.field3775.method3346(-1, 19, arg1);
        }
        if (!arg0) {
            this.method1732(true, 93);
        }
        class470 var7 = new class470();
        if (var6 != null) {
            var7.method2609(0, new class418(var6));
        }
        class668 var8 = this.field3777;
        synchronized (this.field3777) {
            this.field3777.method3650((long) arg1, -116, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class292(class635 arg0, int arg1, class615 arg2) {
        this.field3775 = arg2;
        this.field3778 = this.field3775.method3341(19, -19046);
    }
}
