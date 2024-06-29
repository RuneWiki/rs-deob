import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class472 extends class289 {

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
    public static boolean field6695 = false;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Lhn;")
    public static class720 field6696;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Z")
    public static boolean field6694;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZIII)V", line = 10)
    public static final void method2821(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class305.method2000(128, arg0);
        field6693++;
        int var7 = 0;
        int var8 = arg0 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (!arg3) {
            return;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class143.field2050 && arg1 <= class461.field6495) {
            int[] var14 = class445.field6320[arg1];
            int var15 = class24.method150(arg2 - arg0, class71.field960, false, class549.field7665);
            int var16 = class24.method150(arg0 + arg2, class71.field960, false, class549.field7665);
            int var17 = class24.method150(arg2 - var8, class71.field960, false, class549.field7665);
            int var18 = class24.method150(arg2 + var8, class71.field960, false, class549.field7665);
            class643.method3557(var15, var14, (byte) 69, arg5, var17);
            class643.method3557(var17, var14, (byte) 97, arg6, var18);
            class643.method3557(var18, var14, (byte) 57, arg5, var16);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class739.field10281[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class143.field2050 && var20 <= class461.field6495) {
                    if (var8 <= var9) {
                        int var22 = class24.method150(arg2 + var7, class71.field960, false, class549.field7665);
                        int var23 = class24.method150(arg2 - var7, class71.field960, false, class549.field7665);
                        if (class461.field6495 >= var21) {
                            class643.method3557(var23, class445.field6320[var21], (byte) 50, arg5, var22);
                        }
                        if (var20 >= class143.field2050) {
                            class643.method3557(var23, class445.field6320[var20], (byte) 100, arg5, var22);
                        }
                    } else {
                        int var24 = class739.field10281[var9];
                        int var25 = class24.method150(arg2 + var7, class71.field960, false, class549.field7665);
                        int var26 = class24.method150(arg2 - var7, class71.field960, false, class549.field7665);
                        int var27 = class24.method150(arg2 + var24, class71.field960, false, class549.field7665);
                        int var28 = class24.method150(arg2 - var24, class71.field960, false, class549.field7665);
                        if (class461.field6495 >= var21) {
                            int[] var29 = class445.field6320[var21];
                            class643.method3557(var26, var29, (byte) 66, arg5, var28);
                            class643.method3557(var28, var29, (byte) 69, arg6, var27);
                            class643.method3557(var27, var29, (byte) 80, arg5, var25);
                        }
                        if (class143.field2050 <= var20) {
                            int[] var30 = class445.field6320[var20];
                            class643.method3557(var26, var30, (byte) 89, arg5, var28);
                            class643.method3557(var28, var30, (byte) 57, arg6, var27);
                            class643.method3557(var27, var30, (byte) 120, arg5, var25);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class143.field2050 && var31 <= class461.field6495) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (var33 >= class71.field960 && var34 <= class549.field7665) {
                    int var35 = class24.method150(var33, class71.field960, false, class549.field7665);
                    int var36 = class24.method150(var34, class71.field960, !arg3, class549.field7665);
                    if (var7 < var8) {
                        int var37 = var7 > var11 ? class739.field10281[var7] : var11;
                        int var38 = class24.method150(arg2 + var37, class71.field960, false, class549.field7665);
                        int var39 = class24.method150(arg2 - var37, class71.field960, !arg3, class549.field7665);
                        if (class461.field6495 >= var32) {
                            int[] var40 = class445.field6320[var32];
                            class643.method3557(var36, var40, (byte) 114, arg5, var39);
                            class643.method3557(var39, var40, (byte) 122, arg6, var38);
                            class643.method3557(var38, var40, (byte) 65, arg5, var35);
                        }
                        if (class143.field2050 <= var31) {
                            int[] var41 = class445.field6320[var31];
                            class643.method3557(var36, var41, (byte) 83, arg5, var39);
                            class643.method3557(var39, var41, (byte) 58, arg6, var38);
                            class643.method3557(var38, var41, (byte) 64, arg5, var35);
                        }
                    } else {
                        if (var32 <= class461.field6495) {
                            class643.method3557(var36, class445.field6320[var32], (byte) 117, arg5, var35);
                        }
                        if (var31 >= class143.field2050) {
                            class643.method3557(var36, class445.field6320[var31], (byte) 117, arg5, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 203)
    public static void method2822(byte arg0) {
        field6696 = null;
        if (arg0 != -74) {
            method2822((byte) 10);
        }
    }
}
