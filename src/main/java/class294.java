import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class294 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[[I")
    public int[][] field4291;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I", line = 9)
    public final int method1904(int arg0, byte arg1, int arg2) {
        int var4 = 46 / ((-arg1 - 67) / 53);
        field4283++;
        return this.field4291[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IFFIII[FIIII[F)V", line = 28)
    public static final void method1910(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9, int arg10, float[] arg11) {
        int var12 = arg9 - arg3;
        field4282++;
        int var13 = arg0 - arg5;
        int var14 = arg4 - arg8;
        float var15 = arg11[2] * (float) var13 + arg11[arg10] * (float) var12 + arg11[1] * (float) var14;
        float var16 = arg11[5] * (float) var13 + arg11[3] * (float) var12 + arg11[4] * (float) var14;
        float var17 = arg11[8] * (float) var13 + arg11[7] * (float) var14 + arg11[6] * (float) var12;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg1 != 1.0F) {
            var18 = arg1 * var18;
        }
        float var19 = var16 + arg2 + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg6[1] = var19;
        arg6[0] = var18;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 78)
    public static final void method1912(int arg0) {
        if (class260.method1691(class266.field3873, 126) || class397.method2450((byte) 92, class266.field3873)) {
            class733.method4095(class614.field8619 >> 12, (byte) 56, 5000, class472.field6622 >> 12);
        } else {
            int var1 = class210.field3250.field4670[0] >> 3;
            int var2 = class210.field3250.field4672[0] >> 3;
            if (var1 >= 0 && class768.field10571 >> 3 > var1 && var2 >= 0 && var2 < class350.field4898 >> 3) {
                class733.method4095(var1, (byte) 56, 5000, var2);
            } else {
                class733.method4095(class768.field10571 >> 4, (byte) 56, 0, class350.field4898 >> 4);
            }
        }
        field4288++;
        class790.method4322((byte) 110);
        class515.method3106(arg0 - 1391686966);
        if (arg0 == 1391655267) {
            class529.method3200((byte) -128);
            class635.method3638(false);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IBI)I", line = 122)
    public final int method1918(int arg0, byte arg1, int arg2) {
        if (arg1 < 124) {
            return 119;
        }
        field4287++;
        int var4 = arg0 >> this.field4285;
        int var5 = arg2 >> this.field4285;
        if (var4 < 0 || var5 < 0 || (this.field4289 - 1) < var4 || var5 > (this.field4290 - 1)) {
            return 0;
        }
        int var6 = this.field4284 - 1 & arg0;
        int var7 = arg2 & this.field4284 - 1;
        int var8 = (this.field4284 - var6) * this.field4291[var4][var5] + this.field4291[var4 + 1][var5] * var6 >> this.field4285;
        int var9 = (this.field4284 - var6) * this.field4291[var4][var5 + 1] + this.field4291[var4 + 1][var5 + 1] * var6 >> this.field4285;
        return (this.field4284 - var7) * var8 + var7 * var9 >> this.field4285;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 147)
    public class294(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4290 = arg1;
        this.field4289 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4284 = 0x1 << var5;
        this.field4285 = var5;
        this.field4291 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class194 method1902(int arg0, int arg1, class194 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1903(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1905(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1906(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqm;[I)V")
    public abstract void method1907(class154 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1908(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1909(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1911(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1913();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1915(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1916(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1917(int arg0, int arg1);
}
