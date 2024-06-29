import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class293 extends class144 {

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "J")
    public static long field4635;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lwj;")
    public static class130 field4640;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[Lnc;")
    public static class243[] field4632;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field2059 = arg1.method1407(arg2 ^ 20719) == 1;
        }
        ++field4633;
        if (arg2 != 20630) {
            field4640 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
    public static void method1962(int arg0) {
        field4632 = null;
        if (arg0 != 10694) {
            method1963(-33, 17, -56, 105, 96);
        }
        field4640 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            return null;
        } else {
            ++field4639;
            int[][] var3 = super.field2053.method1542(106, arg1);
            if (super.field2053.field3408) {
                int[] var4 = this.method934(arg0 ^ -18874, 2, arg1);
                int[][] var5 = this.method927(arg1, true, 0);
                int[][] var6 = this.method927(arg1, true, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var5[0];
                int[] var10 = var3[2];
                int[] var11 = var5[2];
                int[] var12 = var5[1];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class104.field1411 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var9[var16];
                        var8[var16] = var12[var16];
                        var10[var16] = var11[var16];
                    } else if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var9[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                        var10[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var10[var16] = var15[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class293() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field4638;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 0, arg0);
            int[] var5 = this.method934(-18877, 1, arg0);
            int[] var6 = this.method934(arg1 ^ -18756, 2, arg0);
            for (int var7 = 0; var7 < class104.field1411; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        if (arg1 != 255) {
            field4635 = -98L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public static final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4636;
        int var5 = 0;
        class76.method463(-arg2 + arg4, 0, arg0, arg2 + arg4, class268.field3919[arg1]);
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        if (arg3 != 2) {
            field4634 = 22;
        }
        while (~var6 < ~var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
                int var9 = arg4 - -var5;
                int var10 = arg4 - var5;
                --var6;
                int[] var11 = class268.field3919[arg1 + var6];
                var7 -= var6 << 1;
                int[] var12 = class268.field3919[arg1 - var6];
                class76.method463(var10, 0, arg0, var9, var11);
                class76.method463(var10, arg3 + -2, arg0, var9, var12);
            }
            int var13 = arg4 + var6;
            int var14 = -var6 + arg4;
            int[] var15 = class268.field3919[arg1 + var5];
            int[] var16 = class268.field3919[arg1 - var5];
            class76.method463(var14, arg3 + -2, arg0, var13, var15);
            class76.method463(var14, 0, arg0, var13, var16);
        }
    }
}
