import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class630 extends class192 {

    @OriginalMember(owner = "client!st", name = "P", descriptor = "Z")
    public static boolean field8788 = true;

    @OriginalMember(owner = "client!st", name = "Q", descriptor = "[I")
    public static int[] field8789 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!st", name = "I", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!st", name = "J", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!st", name = "L", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!st", name = "M", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!st", name = "N", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!st", name = "S", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!st", name = "T", descriptor = "Ljava/lang/Object;")
    public static Object field8792;

    @OriginalMember(owner = "client!st", name = "R", descriptor = "[I")
    public static int[] field8790;

    @OriginalMember(owner = "client!st", name = "O", descriptor = "[Lkba;")
    private class20[] field8787;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Loa;Lcq;III)V")
    public static final void method3492(class43 arg0, class274 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class590.field8010) {
            class530 var5 = class483.field6438[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6878 != null && var5.field6878.method78(0)) {
                arg1.method73(0, 0, arg0, class688.field9414, var5.field6878, true, -107);
            }
        }
        if (arg4 < class590.field8010) {
            class530 var6 = class483.field6438[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6878 != null && var6.field6878.method78(0)) {
                arg1.method73(class688.field9414, 0, arg0, 0, var6.field6878, true, -56);
            }
        }
        if (arg3 < class590.field8010 && arg4 < class151.field1933) {
            class530 var7 = class483.field6438[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6878 != null && var7.field6878.method78(0)) {
                arg1.method73(class688.field9414, 0, arg0, class688.field9414, var7.field6878, true, -114);
            }
        }
        if (arg3 < class590.field8010 && arg4 > 0) {
            class530 var8 = class483.field6438[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6878 != null && var8.field6878.method78(0)) {
                arg1.method73(-class688.field9414, 0, arg0, class688.field9414, var8.field6878, true, -37);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field8782;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            field8790 = null;
        }
        if (super.field2448.field7266) {
            this.method3494(super.field2448.method2974(30455), 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(B)V")
    public static void method3493(byte arg0) {
        field8792 = null;
        field8790 = null;
        if (arg0 >= -102) {
            method3495((byte) -13, -78);
        }
        field8789 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([[II)V")
    private final void method3494(int[][] arg0, int arg1) {
        ++field8784;
        if (arg1 != 1) {
            method3493((byte) 119);
        }
        int var3 = class561.field7319;
        int var4 = class505.field6643;
        class475.method2623(arg0, (byte) 112);
        class656.method3611(true, class337.field4356, 0, 0, class95.field1247);
        if (this.field8787 != null) {
            for (int var5 = 0; var5 < this.field8787.length; ++var5) {
                class20 var6 = this.field8787[var5];
                int var7 = var6.field217;
                int var8 = var6.field222;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method111(var4, var3, 52);
                    }
                } else if (~var8 <= -1) {
                    var6.method115(124, var3, var4);
                } else {
                    var6.method114(-84, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class630() {
        super(0, true);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field8785;
        int var3 = 45 % ((arg1 - -14) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int var5 = class561.field7319;
            int var6 = class505.field6643;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field2467.method2464(-107);
            this.method3494(var7, 1);
            for (int var9 = 0; var9 < class505.field6643; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; class561.field7319 > var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class597.method3238(var16 << 4, 4080);
                    var13[var15] = class597.method3238(var16, 65280) >> 4;
                    var12[var15] = class597.method3238(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)V")
    public static final void method3495(byte arg0, int arg1) {
        if (arg0 < 107) {
            method3493((byte) 75);
        }
        ++field8786;
        class367 var2 = class573.method3057(3, arg1, 2);
        var2.method2113(103);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 == 0) {
            this.field8787 = new class20[arg1.method2396(-5)];
            for (int var4 = 0; this.field8787.length > var4; ++var4) {
                int var5 = arg1.method2396(arg2 ^ -12139);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field8787[var4] = class303.method1778(arg1, -110);
                            }
                        } else {
                            this.field8787[var4] = class557.method2984(arg1, false);
                        }
                    } else {
                        this.field8787[var4] = class658.method3620(-48, arg1);
                    }
                } else {
                    this.field8787[var4] = class110.method842(-25390, arg1);
                }
            }
        } else if (~arg0 == -2) {
            super.field2449 = arg1.method2396(-12) == 1;
        }
        if (arg2 != -12160) {
            this.method118(-30, (byte) 73);
        }
        ++field8783;
    }
}
