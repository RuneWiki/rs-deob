import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class186 extends class37 {

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2777;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1227(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2776++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg0;
        int var12 = arg7 - arg0;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        if (arg4) {
            return;
        }
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg3 >= class310.field4279 && class442.field6058 >= arg3) {
            int[] var39 = class236.field3325[arg3];
            int var40 = class300.method1829(class600.field7959, arg1 - arg2, -45, class366.field4956);
            int var41 = class300.method1829(class600.field7959, arg1 + arg2, 115, class366.field4956);
            int var42 = class300.method1829(class600.field7959, arg1 - var11, -70, class366.field4956);
            int var43 = class300.method1829(class600.field7959, arg1 + var11, -49, class366.field4956);
            class475.method2668(arg5, var42, 7, var39, var40);
            class475.method2668(arg6, var43, 7, var39, var42);
            class475.method2668(arg5, var41, 7, var39, var43);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg3 - var9;
            int var46 = arg3 + var9;
            if (class310.field4279 <= var46 && class442.field6058 >= var45) {
                int var47 = class300.method1829(class600.field7959, arg1 + var8, -94, class366.field4956);
                int var48 = class300.method1829(class600.field7959, arg1 - var8, 118, class366.field4956);
                if (var44) {
                    int var49 = class300.method1829(class600.field7959, arg1 + var10, 123, class366.field4956);
                    int var50 = class300.method1829(class600.field7959, arg1 - var10, 120, class366.field4956);
                    if (var45 >= class310.field4279) {
                        int[] var51 = class236.field3325[var45];
                        class475.method2668(arg5, var50, 7, var51, var48);
                        class475.method2668(arg6, var49, 7, var51, var50);
                        class475.method2668(arg5, var47, 7, var51, var49);
                    }
                    if (var46 <= class442.field6058) {
                        int[] var52 = class236.field3325[var46];
                        class475.method2668(arg5, var50, 7, var52, var48);
                        class475.method2668(arg6, var49, 7, var52, var50);
                        class475.method2668(arg5, var47, 7, var52, var49);
                    }
                } else {
                    if (var45 >= class310.field4279) {
                        class475.method2668(arg5, var47, 7, class236.field3325[var45], var48);
                    }
                    if (var46 <= class442.field6058) {
                        class475.method2668(arg5, var47, 7, class236.field3325[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
    public final void method1228(int arg0) {
        if (arg0 != -3) {
            this.method1228(-113);
        }
        field2778++;
        this.field2777.method3468();
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        this.field2777 = new NativeHeap(arg0);
    }
}
