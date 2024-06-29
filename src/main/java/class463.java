import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class463 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[[Ldm;")
    public static class50[][] field6662;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 4)
    public static void method2812(int arg0) {
        field6662 = null;
        if (arg0 != 6779) {
            field6662 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIBII)V", line = 17)
    public static final void method2813(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class432.method2619(arg5, 95);
        field6663++;
        if (arg4 <= 119) {
            method2813(-78, -23, -108, -122, (byte) -39, 29, 11);
        }
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class558.field7940 && arg1 <= class748.field10458) {
            int[] var14 = class329.field4651[arg1];
            int var15 = class498.method3000(false, class612.field8854, arg0 - arg5, class156.field2337);
            int var16 = class498.method3000(false, class612.field8854, arg0 + arg5, class156.field2337);
            int var17 = class498.method3000(false, class612.field8854, arg0 - var8, class156.field2337);
            int var18 = class498.method3000(false, class612.field8854, arg0 + var8, class156.field2337);
            class399.method2472(27113, var15, var17, arg3, var14);
            class399.method2472(27113, var17, var18, arg6, var14);
            class399.method2472(27113, var18, var16, arg3, var14);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class332.field4684[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class558.field7940 <= var21 && var20 <= class748.field10458) {
                    if (var8 <= var9) {
                        int var22 = class498.method3000(false, class612.field8854, arg0 + var7, class156.field2337);
                        int var23 = class498.method3000(false, class612.field8854, arg0 - var7, class156.field2337);
                        if (class748.field10458 >= var21) {
                            class399.method2472(27113, var23, var22, arg3, class329.field4651[var21]);
                        }
                        if (var20 >= class558.field7940) {
                            class399.method2472(27113, var23, var22, arg3, class329.field4651[var20]);
                        }
                    } else {
                        int var24 = class332.field4684[var9];
                        int var25 = class498.method3000(false, class612.field8854, arg0 + var7, class156.field2337);
                        int var26 = class498.method3000(false, class612.field8854, arg0 - var7, class156.field2337);
                        int var27 = class498.method3000(false, class612.field8854, arg0 + var24, class156.field2337);
                        int var28 = class498.method3000(false, class612.field8854, arg0 - var24, class156.field2337);
                        if (class748.field10458 >= var21) {
                            int[] var29 = class329.field4651[var21];
                            class399.method2472(27113, var26, var28, arg3, var29);
                            class399.method2472(27113, var28, var27, arg6, var29);
                            class399.method2472(27113, var27, var25, arg3, var29);
                        }
                        if (class558.field7940 <= var20) {
                            int[] var30 = class329.field4651[var20];
                            class399.method2472(27113, var26, var28, arg3, var30);
                            class399.method2472(27113, var28, var27, arg6, var30);
                            class399.method2472(27113, var27, var25, arg3, var30);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class558.field7940 && var31 <= class748.field10458) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (var33 >= class156.field2337 && class612.field8854 >= var34) {
                    int var35 = class498.method3000(false, class612.field8854, var33, class156.field2337);
                    int var36 = class498.method3000(false, class612.field8854, var34, class156.field2337);
                    if (var8 <= var7) {
                        if (var32 <= class748.field10458) {
                            class399.method2472(27113, var36, var35, arg3, class329.field4651[var32]);
                        }
                        if (class558.field7940 <= var31) {
                            class399.method2472(27113, var36, var35, arg3, class329.field4651[var31]);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class332.field4684[var7];
                        int var38 = class498.method3000(false, class612.field8854, arg0 + var37, class156.field2337);
                        int var39 = class498.method3000(false, class612.field8854, arg0 - var37, class156.field2337);
                        if (var32 <= class748.field10458) {
                            int[] var40 = class329.field4651[var32];
                            class399.method2472(27113, var36, var39, arg3, var40);
                            class399.method2472(27113, var39, var38, arg6, var40);
                            class399.method2472(27113, var38, var35, arg3, var40);
                        }
                        if (class558.field7940 <= var31) {
                            int[] var41 = class329.field4651[var31];
                            class399.method2472(27113, var36, var39, arg3, var41);
                            class399.method2472(27113, var39, var38, arg6, var41);
                            class399.method2472(27113, var38, var35, arg3, var41);
                        }
                    }
                }
            }
        }
    }
}
