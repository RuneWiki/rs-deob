import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class180 extends class304 {

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    private int field2854 = 1;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    private int field2856 = 1;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    private int field2864 = 204;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "[[I")
    public static int[][] field2852 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "[Z")
    public static boolean[] field2860 = new boolean[112];

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lwm;II)V", line = 4)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field2855++;
        if (arg1 == 0) {
            this.field2854 = arg0.method1774((byte) 121);
        } else if (arg1 == 1) {
            this.field2856 = arg0.method1774((byte) 123);
        } else if (arg1 == 2) {
            this.field2864 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            method1348(-39);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIBI)V", line = 46)
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class213.method1527(true, arg1);
        field2859++;
        int var7 = arg1;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg1;
        int var10 = 0;
        int var11 = var8;
        int var12 = -4 / ((arg5 - 7) / 56);
        int var13 = -1;
        int var14 = -var8;
        if (arg4 >= class212.field3261 && arg4 <= class182.field2888) {
            int[] var15 = class79.field1178[arg4];
            int var16 = class335.method2343(-1, class234.field3569, arg6 - arg1, class322.field4965);
            int var17 = class335.method2343(-1, class234.field3569, arg6 + arg1, class322.field4965);
            int var18 = class335.method2343(-1, class234.field3569, arg6 - var8, class322.field4965);
            int var19 = class335.method2343(-1, class234.field3569, arg6 + var8, class322.field4965);
            class7.method72(var18, -7, var16, var15, arg3);
            class7.method72(var19, -7, var18, var15, arg2);
            class7.method72(var17, -7, var19, var15, arg3);
        }
        int var20 = -1;
        while (var10 < var7) {
            var20 += 2;
            var14 += var20;
            var13 += 2;
            var9 += var13;
            if (var14 >= 0 && var11 >= 1) {
                var11--;
                class35.field504[var11] = var10;
                var14 -= var11 << 1;
            }
            var10++;
            if (var9 >= 0) {
                var7--;
                int var21 = arg4 + var7;
                var9 -= var7 << 1;
                int var22 = arg4 - var7;
                if (class212.field3261 <= var21 && class182.field2888 >= var22) {
                    if (var7 < var8) {
                        int var23 = class35.field504[var7];
                        int var24 = class335.method2343(-1, class234.field3569, arg6 + var10, class322.field4965);
                        int var25 = class335.method2343(-1, class234.field3569, arg6 - var10, class322.field4965);
                        int var26 = class335.method2343(-1, class234.field3569, arg6 + var23, class322.field4965);
                        int var27 = class335.method2343(-1, class234.field3569, arg6 - var23, class322.field4965);
                        if (var21 <= class182.field2888) {
                            int[] var28 = class79.field1178[var21];
                            class7.method72(var27, -7, var25, var28, arg3);
                            class7.method72(var26, -7, var27, var28, arg2);
                            class7.method72(var24, -7, var26, var28, arg3);
                        }
                        if (class212.field3261 <= var22) {
                            int[] var29 = class79.field1178[var22];
                            class7.method72(var27, -7, var25, var29, arg3);
                            class7.method72(var26, -7, var27, var29, arg2);
                            class7.method72(var24, -7, var26, var29, arg3);
                        }
                    } else {
                        int var30 = class335.method2343(-1, class234.field3569, arg6 + var10, class322.field4965);
                        int var31 = class335.method2343(-1, class234.field3569, arg6 - var10, class322.field4965);
                        if (var21 <= class182.field2888) {
                            class7.method72(var30, -7, var31, class79.field1178[var21], arg3);
                        }
                        if (class212.field3261 <= var22) {
                            class7.method72(var30, -7, var31, class79.field1178[var22], arg3);
                        }
                    }
                }
            }
            int var32 = arg4 - var10;
            int var33 = arg4 + var10;
            if (class212.field3261 <= var33 && class182.field2888 >= var32) {
                int var34 = arg6 + var7;
                int var35 = arg6 - var7;
                if (class234.field3569 <= var34 && class322.field4965 >= var35) {
                    int var36 = class335.method2343(-1, class234.field3569, var34, class322.field4965);
                    int var37 = class335.method2343(-1, class234.field3569, var35, class322.field4965);
                    if (var10 < var8) {
                        int var38 = var10 > var11 ? class35.field504[var10] : var11;
                        int var39 = class335.method2343(-1, class234.field3569, arg6 + var38, class322.field4965);
                        int var40 = class335.method2343(-1, class234.field3569, arg6 - var38, class322.field4965);
                        if (var33 <= class182.field2888) {
                            int[] var41 = class79.field1178[var33];
                            class7.method72(var40, -7, var37, var41, arg3);
                            class7.method72(var39, -7, var40, var41, arg2);
                            class7.method72(var36, -7, var39, var41, arg3);
                        }
                        if (class212.field3261 <= var32) {
                            int[] var42 = class79.field1178[var32];
                            class7.method72(var40, -7, var37, var42, arg3);
                            class7.method72(var39, -7, var40, var42, arg2);
                            class7.method72(var36, -7, var39, var42, arg3);
                        }
                    } else {
                        if (var33 <= class182.field2888) {
                            class7.method72(var36, -7, var37, class79.field1178[var33], arg3);
                        }
                        if (class212.field3261 <= var32) {
                            class7.method72(var36, -7, var37, class79.field1178[var32], arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 238)
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 252)
    public final int[] method71(int arg0, int arg1) {
        field2863++;
        if (arg0 != 7) {
            field2860 = (boolean[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            for (int var4 = 0; var4 < class218.field3333; var4++) {
                int var5 = class162.field2631[var4];
                int var6 = this.field2854 * var5 >> 12;
                int var7 = class84.field1225[arg1];
                int var8 = this.field2856 * var7 >> 12;
                int var9 = var5 % (4096 / this.field2854) * this.field2854;
                int var10 = var7 % (4096 / this.field2856) * this.field2856;
                if (var10 < this.field2864) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2864) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2864) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIII)V", line = 348)
    public static final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class339 var7 = new class339();
        var7.field5278 = arg1 / 128;
        var7.field5282 = arg2 / 128;
        var7.field5259 = arg3 / 128;
        var7.field5277 = arg4 / 128;
        var7.field5264 = arg0;
        var7.field5276 = arg1;
        var7.field5272 = arg2;
        var7.field5261 = arg3;
        var7.field5274 = arg4;
        var7.field5279 = arg5;
        var7.field5270 = arg6;
        class262.field4047[class298.field4582++] = var7;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V", line = 370)
    public static void method1348(int arg0) {
        field2852 = (int[][]) null;
        field2860 = null;
        if (arg0 != -19357) {
            method1347(-82, -63, 109, 100, 39, -100, 91);
        }
    }
}
