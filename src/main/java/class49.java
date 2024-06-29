import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class49 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Z")
    public boolean field717 = true;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
    public static int[] field726 = new int[8];

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lmq;")
    public static class78 field727 = new class78(0, -2);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "C")
    private char field716;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
    public String field715;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[[[Z")
    public static boolean[][][] field722;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 8)
    public static final void method398(int arg0) {
        field719++;
        class314[] var1 = class162.field2075;
        synchronized (class162.field2075) {
            if (arg0 == 2) {
                for (int var2 = 0; var2 < class162.field2075.length; var2++) {
                    class162.field2075[var2] = new class314();
                    class217.field2738[var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z", line = 30)
    public final boolean method399(int arg0) {
        field724++;
        if (arg0 == 16709) {
            return this.field716 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V", line = 42)
    public static final void method400(byte arg0, int arg1) {
        class691.field9805 = arg1;
        int var2 = 114 % ((arg0 - 76) / 42);
        field725++;
        class721.field10157.method776((byte) 118);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 54)
    public static void method401(int arg0) {
        field722 = null;
        if (arg0 == 17617) {
            field726 = null;
            field727 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILtn;I)V", line = 69)
    private final void method402(int arg0, class179 arg1, int arg2) {
        field721++;
        if (arg0 == 1) {
            this.field716 = class219.method1370(arg1.method1133(8), -124);
        } else if (arg0 == 2) {
            this.field720 = arg1.method1095((byte) 114);
        } else if (arg0 == 4) {
            this.field717 = false;
        } else if (arg0 == 5) {
            this.field715 = arg1.method1106(-1);
        }
        if (arg2 >= -54) {
            this.field716 = (char) 65473;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ltn;I)V", line = 110)
    public final void method403(class179 arg0, int arg1) {
        field718++;
        while (true) {
            int var3 = arg0.method1094(255);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field728 = -84;
                    return;
                }
            }
            this.method402(var3, arg0, -58);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V", line = 137)
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class325.method1917(arg1, arg6 ^ 0x29CA);
        field723++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg6 != -10673) {
            method401(124);
        }
        int var14 = -1;
        int[] var15 = class15.field220[arg5];
        int var16 = arg3 - var8;
        class284.method1709(var15, var16, -8251, arg3 - arg1, arg2);
        int var17 = arg3 + var8;
        class284.method1709(var15, var17, -8251, var16, arg0);
        class284.method1709(var15, arg1 + arg3, -8251, var17, arg2);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class44.field661[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class15.field220[arg5 + var9];
                    int[] var19 = class15.field220[arg5 - var9];
                    int var20 = class44.field661[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class284.method1709(var18, var24, -8251, var22, arg2);
                    class284.method1709(var18, var23, -8251, var24, arg0);
                    class284.method1709(var18, var21, -8251, var23, arg2);
                    class284.method1709(var19, var24, -8251, var22, arg2);
                    class284.method1709(var19, var23, -8251, var24, arg0);
                    class284.method1709(var19, var21, arg6 + 2422, var23, arg2);
                } else {
                    int[] var25 = class15.field220[arg5 + var9];
                    int[] var26 = class15.field220[arg5 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class284.method1709(var25, var27, -8251, var28, arg2);
                    class284.method1709(var26, var27, -8251, var28, arg2);
                }
            }
            int[] var29 = class15.field220[arg5 + var7];
            int[] var30 = class15.field220[arg5 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class44.field661[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class284.method1709(var29, var35, -8251, var32, arg2);
                class284.method1709(var29, var34, -8251, var35, arg0);
                class284.method1709(var29, var31, -8251, var34, arg2);
                class284.method1709(var30, var35, -8251, var32, arg2);
                class284.method1709(var30, var34, -8251, var35, arg0);
                class284.method1709(var30, var31, -8251, var34, arg2);
            } else {
                class284.method1709(var29, var31, -8251, var32, arg2);
                class284.method1709(var30, var31, -8251, var32, arg2);
            }
        }
    }
}
