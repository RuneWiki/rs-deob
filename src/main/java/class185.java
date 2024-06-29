import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class185 {

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Z")
    public boolean field2643 = false;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    public static int[] field2637 = new int[128];

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    public static int[] field2640 = new int[64];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
    public static boolean field2644 = true;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lvd;")
    public final class117 method1195(byte arg0, int arg1) {
        field2646++;
        class117 var3 = (class117) class232.field3468.method263((byte) 116, (long) (this.field2642 | arg1 << 16));
        if (var3 != null) {
            return var3;
        }
        class232.field3466.method1509(false, this.field2642);
        int var4 = 51 % ((arg0 - 3) / 63);
        class117 var5 = class118.method813(this.field2642, class232.field3466, 0, (byte) 124);
        if (var5 != null) {
            var5.method806(class151.field2184, class47.field666, class33.field481);
            var5.field2497 = var5.field2492;
            var5.field2501 = var5.field2499;
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method807();
            }
            class232.field3468.method255((long) (this.field2642 | arg1 << 16), var5, (byte) -128);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lkl;III)V")
    private final void method1196(class114 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 32586) {
            this.method1199((byte) -123, (class114) null, 1);
        }
        field2648++;
        if (arg2 == 1) {
            this.field2642 = arg0.method756(-29901);
        } else if (arg2 == 2) {
            this.field2639 = arg0.method779(16711680);
        } else if (arg2 == 3) {
            this.field2643 = true;
        } else if (arg2 == 4) {
            this.field2642 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1197(int arg0) {
        if (arg0 != 3) {
            method1201((byte) -21, 23, -37);
        }
        field2640 = null;
        field2637 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([BII)I")
    public static final int method1198(byte[] arg0, int arg1, int arg2) {
        if (arg1 == 24426) {
            field2641++;
            return class242.method1574(arg0, arg1 ^ 0x5F95, arg2, 0);
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLkl;I)V")
    public final void method1199(byte arg0, class114 arg1, int arg2) {
        if (arg0 <= 53) {
            method1197(-50);
        }
        while (true) {
            int var4 = arg1.method760(false);
            if (var4 == 0) {
                field2647++;
                return;
            }
            this.method1196(arg1, arg2, var4, 32586);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)I")
    public static final int method1200(byte arg0, int arg1) {
        if (arg0 != -4) {
            method1198((byte[]) null, 48, 56);
        }
        field2649++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BII)Z")
    public static final boolean method1201(byte arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field2638++;
        if (arg0 != 57) {
            return true;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class250 var3 = class91.method618(114, arg2);
        return var3.method1648(arg1, arg0 - 47);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIII)V")
    public static final void method1202(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class131 var6 = class16.field233[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class163 var7 = var6.field1916;
        if (var7 != null) {
            int var8 = var7.field2377;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class139 var10 = var6.field1915;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2017;
        int var12 = var10.field2015;
        int var13 = var10.field2023;
        int var14 = var10.field2018;
        int[] var15 = class38.field569[var11];
        int[] var16 = class220.field3235[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
