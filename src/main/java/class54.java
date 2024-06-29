import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class54 extends class190 {

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
    public static int[] field742 = new int[100];

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lhe;")
    public static class47 field744 = new class47();

    @OriginalMember(owner = "client!d", name = "v", descriptor = "B")
    public byte field739;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lqe;")
    public class168 field740;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lqe;")
    public class168 field745;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lwd;")
    public static class67 field741;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
    public static int[] field746;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field742 = null;
        if (arg0 != -55) {
            method382(-55, 5, (byte) -102, -120, 36, -32, 46);
        }
        field744 = null;
        field741 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIIII)V")
    public static final void method382(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field747++;
        int var7 = arg4 - arg5;
        class100.method659(arg4, false);
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = -var7;
        if (class222.field3811 <= arg0 && arg0 <= class196.field3402) {
            int[] var12 = class241.field4117[arg0];
            int var13 = class97.method639(arg1 - arg4, (byte) 12, class174.field3055, class249.field4314);
            int var14 = class97.method639(arg1 + arg4, (byte) 12, class174.field3055, class249.field4314);
            int var15 = class97.method639(arg1 - var7, (byte) 12, class174.field3055, class249.field4314);
            int var16 = class97.method639(arg1 + var7, (byte) 12, class174.field3055, class249.field4314);
            class232.method1501(arg3, var13, (byte) -108, var12, var15);
            class232.method1501(arg6, var15, (byte) -108, var12, var16);
            class232.method1501(arg3, var16, (byte) -108, var12, var14);
        }
        int var17 = var7;
        int var18 = -1;
        int var19 = -1;
        if (arg2 < 59) {
            field742 = null;
        }
        while (var10 > var8) {
            var19 += 2;
            var11 += var19;
            if (var11 >= 0 && var17 >= 1) {
                var17--;
                class238.field4077[var17] = var8;
                var11 -= var17 << 1;
            }
            var18 += 2;
            var9 += var18;
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var20 = arg0 - var10;
                int var21 = arg0 + var10;
                if (var21 >= class222.field3811 && var20 <= class196.field3402) {
                    if (var7 > var10) {
                        int var22 = class238.field4077[var10];
                        int var23 = class97.method639(arg1 + var8, (byte) 12, class174.field3055, class249.field4314);
                        int var24 = class97.method639(arg1 - var8, (byte) 12, class174.field3055, class249.field4314);
                        int var25 = class97.method639(arg1 + var22, (byte) 12, class174.field3055, class249.field4314);
                        int var26 = class97.method639(arg1 - var22, (byte) 12, class174.field3055, class249.field4314);
                        if (var21 <= class196.field3402) {
                            int[] var27 = class241.field4117[var21];
                            class232.method1501(arg3, var24, (byte) -108, var27, var26);
                            class232.method1501(arg6, var26, (byte) -108, var27, var25);
                            class232.method1501(arg3, var25, (byte) -108, var27, var23);
                        }
                        if (class222.field3811 <= var20) {
                            int[] var28 = class241.field4117[var20];
                            class232.method1501(arg3, var24, (byte) -108, var28, var26);
                            class232.method1501(arg6, var26, (byte) -108, var28, var25);
                            class232.method1501(arg3, var25, (byte) -108, var28, var23);
                        }
                    } else {
                        int var29 = class97.method639(arg1 + var8, (byte) 12, class174.field3055, class249.field4314);
                        int var30 = class97.method639(arg1 - var8, (byte) 12, class174.field3055, class249.field4314);
                        if (class196.field3402 >= var21) {
                            class232.method1501(arg3, var30, (byte) -108, class241.field4117[var21], var29);
                        }
                        if (var20 >= class222.field3811) {
                            class232.method1501(arg3, var30, (byte) -108, class241.field4117[var20], var29);
                        }
                    }
                }
            }
            int var31 = arg0 - var8;
            int var32 = arg0 + var8;
            if (var32 >= class222.field3811 && class196.field3402 >= var31) {
                int var33 = arg1 - var10;
                int var34 = arg1 + var10;
                if (var34 >= class174.field3055 && var33 <= class249.field4314) {
                    int var35 = class97.method639(var34, (byte) 12, class174.field3055, class249.field4314);
                    int var36 = class97.method639(var33, (byte) 12, class174.field3055, class249.field4314);
                    if (var8 < var7) {
                        int var37 = var8 > var17 ? class238.field4077[var8] : var17;
                        int var38 = class97.method639(arg1 + var37, (byte) 12, class174.field3055, class249.field4314);
                        int var39 = class97.method639(arg1 - var37, (byte) 12, class174.field3055, class249.field4314);
                        if (class196.field3402 >= var32) {
                            int[] var40 = class241.field4117[var32];
                            class232.method1501(arg3, var36, (byte) -108, var40, var39);
                            class232.method1501(arg6, var39, (byte) -108, var40, var38);
                            class232.method1501(arg3, var38, (byte) -108, var40, var35);
                        }
                        if (class222.field3811 <= var31) {
                            int[] var41 = class241.field4117[var31];
                            class232.method1501(arg3, var36, (byte) -108, var41, var39);
                            class232.method1501(arg6, var39, (byte) -108, var41, var38);
                            class232.method1501(arg3, var38, (byte) -108, var41, var35);
                        }
                    } else {
                        if (class196.field3402 >= var32) {
                            class232.method1501(arg3, var36, (byte) -108, class241.field4117[var32], var35);
                        }
                        if (class222.field3811 <= var31) {
                            class232.method1501(arg3, var36, (byte) -108, class241.field4117[var31], var35);
                        }
                    }
                }
            }
        }
    }
}
