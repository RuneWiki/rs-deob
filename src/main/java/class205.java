import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class205 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lcf;")
    private static class93 field3689 = class147.method1066("Started 3d Library", -48);

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lcf;")
    private static class93 field3693 = class147.method1066("Created gameworld", -48);

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lcf;")
    public static class93 field3698 = field3689;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lcf;")
    public static class93 field3697 = field3693;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "B")
    public static byte field3692;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[Z")
    public static boolean[] field3690;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1451(int arg0) {
        int var1 = 93 % ((66 - arg0) / 45);
        field3689 = null;
        field3693 = null;
        field3690 = null;
        field3697 = null;
        field3698 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class241.method1647(20220, arg3);
        field3688++;
        int var7 = -10 / ((arg4 + 42) / 60);
        int var8 = arg3 - arg0;
        int var9 = arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = 0;
        int var11 = -arg3;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        if (class26.field342 <= arg2 && arg2 <= class271.field4820) {
            int[] var15 = class76.field1406[arg2];
            int var16 = class141.method1027(class277.field4967, arg5 - arg3, false, class147.field2593);
            int var17 = class141.method1027(class277.field4967, arg3 + arg5, false, class147.field2593);
            int var18 = class141.method1027(class277.field4967, arg5 - var8, false, class147.field2593);
            int var19 = class141.method1027(class277.field4967, arg5 + var8, false, class147.field2593);
            class58.method337(var16, var15, arg1, var18, false);
            class58.method337(var18, var15, arg6, var19, false);
            class58.method337(var19, var15, arg1, var17, false);
        }
        int var20 = -1;
        while (var9 > var10) {
            var20 += 2;
            var14 += 2;
            var13 += var20;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                class162.field2867[var12] = var10;
                var13 -= var12 << 1;
            }
            var10++;
            var11 += var14;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                int var21 = arg2 - var9;
                int var22 = arg2 + var9;
                if (var22 >= class26.field342 && var21 <= class271.field4820) {
                    if (var8 <= var9) {
                        int var23 = class141.method1027(class277.field4967, arg5 + var10, false, class147.field2593);
                        int var24 = class141.method1027(class277.field4967, arg5 - var10, false, class147.field2593);
                        if (class271.field4820 >= var22) {
                            class58.method337(var24, class76.field1406[var22], arg1, var23, false);
                        }
                        if (class26.field342 <= var21) {
                            class58.method337(var24, class76.field1406[var21], arg1, var23, false);
                        }
                    } else {
                        int var25 = class162.field2867[var9];
                        int var26 = class141.method1027(class277.field4967, arg5 + var10, false, class147.field2593);
                        int var27 = class141.method1027(class277.field4967, arg5 - var10, false, class147.field2593);
                        int var28 = class141.method1027(class277.field4967, arg5 + var25, false, class147.field2593);
                        int var29 = class141.method1027(class277.field4967, arg5 - var25, false, class147.field2593);
                        if (var22 <= class271.field4820) {
                            int[] var30 = class76.field1406[var22];
                            class58.method337(var27, var30, arg1, var29, false);
                            class58.method337(var29, var30, arg6, var28, false);
                            class58.method337(var28, var30, arg1, var26, false);
                        }
                        if (class26.field342 <= var21) {
                            int[] var31 = class76.field1406[var21];
                            class58.method337(var27, var31, arg1, var29, false);
                            class58.method337(var29, var31, arg6, var28, false);
                            class58.method337(var28, var31, arg1, var26, false);
                        }
                    }
                }
            }
            int var32 = arg2 - var10;
            int var33 = arg2 + var10;
            if (var33 >= class26.field342 && var32 <= class271.field4820) {
                int var34 = arg5 + var9;
                int var35 = arg5 - var9;
                if (class277.field4967 <= var34 && class147.field2593 >= var35) {
                    int var36 = class141.method1027(class277.field4967, var34, false, class147.field2593);
                    int var37 = class141.method1027(class277.field4967, var35, false, class147.field2593);
                    if (var8 > var10) {
                        int var38 = var10 > var12 ? class162.field2867[var10] : var12;
                        int var39 = class141.method1027(class277.field4967, arg5 + var38, false, class147.field2593);
                        int var40 = class141.method1027(class277.field4967, arg5 - var38, false, class147.field2593);
                        if (var33 <= class271.field4820) {
                            int[] var41 = class76.field1406[var33];
                            class58.method337(var37, var41, arg1, var40, false);
                            class58.method337(var40, var41, arg6, var39, false);
                            class58.method337(var39, var41, arg1, var36, false);
                        }
                        if (class26.field342 <= var32) {
                            int[] var42 = class76.field1406[var32];
                            class58.method337(var37, var42, arg1, var40, false);
                            class58.method337(var40, var42, arg6, var39, false);
                            class58.method337(var39, var42, arg1, var36, false);
                        }
                    } else {
                        if (class271.field4820 >= var33) {
                            class58.method337(var37, class76.field1406[var33], arg1, var36, false);
                        }
                        if (var32 >= class26.field342) {
                            class58.method337(var37, class76.field1406[var32], arg1, var36, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static final int method1453(int arg0, int arg1) {
        field3694++;
        if (arg1 != 127) {
            method1454((byte) 9, -73L);
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BJ)Lcf;")
    public static final class93 method1454(byte arg0, long arg1) {
        field3695++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 65 % ((arg0 + 60) / 33);
            long var4 = arg1;
            int var6 = 0;
            while (var4 != 0L) {
                var6++;
                var4 /= 37L;
            }
            byte[] var7 = new byte[var6];
            while (arg1 != 0L) {
                long var9 = arg1;
                arg1 /= 37L;
                var6--;
                var7[var6] = class276.field4937[(int) (var9 - (arg1 * 37L))];
            }
            class93 var8 = new class93();
            var8.field1683 = var7;
            var8.field1629 = var7.length;
            return var8;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class205() {
        new class37();
    }
}
