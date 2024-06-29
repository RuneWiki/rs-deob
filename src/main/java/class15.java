import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class15 extends class76 {

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    private int field329 = 409;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "[I")
    private int[] field333 = new int[3];

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    private int field337 = 4096;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    private int field336 = 4096;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
    private int field339 = 4096;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "Z")
    public static boolean field335 = false;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
    public static int field341 = 20;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "D")
    public static double field332;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)V")
    public static final void method155(int arg0) {
        ++field340;
        if (arg0 > -37) {
            method155(-28);
        }
        for (class34 var1 = (class34) class72.field1413.method288(26111); var1 != null; var1 = (class34) class72.field1413.method277(1)) {
            if (var1.field672 > 0) {
                --var1.field672;
            }
            if (var1.field672 == 0) {
                if (~var1.field671 > -1 || class2.method20(var1.field667, var1.field671, 1)) {
                    class174.method1183(var1.field671, var1.field668, var1.field661, var1.field667, 29, var1.field665, var1.field658, var1.field662);
                    var1.method254(1);
                }
            } else {
                if (~var1.field656 < -1) {
                    --var1.field656;
                }
                if (var1.field656 == 0 && ~var1.field661 <= -2 && ~var1.field662 <= -2 && ~var1.field661 >= -103 && var1.field662 <= 102 && (var1.field654 < 0 || class2.method20(var1.field655, var1.field654, 1))) {
                    class174.method1183(var1.field654, var1.field668, var1.field661, var1.field655, 102, var1.field673, var1.field658, var1.field662);
                    var1.field656 = -1;
                    if (var1.field671 == var1.field654 && var1.field671 == -1) {
                        var1.method254(1);
                    } else if (~var1.field671 == ~var1.field654 && var1.field673 == var1.field665 && ~var1.field667 == ~var1.field655) {
                        var1.method254(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZI)I")
    public static final int method156(int arg0, int arg1, boolean arg2, int arg3) {
        ++field342;
        int var4 = arg1 + -1 & arg3;
        int var5 = arg3 / arg1;
        int var6 = arg0 / arg1;
        int var7 = class59.method446(var6, 69, var5);
        int var8 = class59.method446(var6, 28, var5 + 1);
        if (!arg2) {
            field328 = 30;
        }
        int var9 = arg1 + -1 & arg0;
        int var10 = class59.method446(var6 + 1, 78, var5);
        int var11 = class59.method446(var6 - -1, 113, var5 + 1);
        int var12 = class181.method1239(var4, var7, arg1, (byte) 72, var8);
        int var13 = class181.method1239(var4, var10, arg1, (byte) 72, var11);
        return class181.method1239(var9, var12, arg1, (byte) 72, var13);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field334;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (arg1 < 2) {
            this.method157(-27, (byte) 44);
        }
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class96.field1807 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = -this.field333[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field329 < var13) {
                    var9[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field333[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field329) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field333[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field329 < var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field339 * var12 >> 12;
                            var8[var11] = this.field336 * var14 >> 12;
                            var10[var11] = this.field337 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class15() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field330;
        if (arg1 <= -86) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                int var5 = arg0.method1064((byte) -126);
                                this.field333[0] = class30.method252(var5, 16711680) << 4;
                                this.field333[1] = class30.method252(65280, var5) >> 4;
                                this.field333[2] = class30.method252(var5 >> 12, 0);
                            }
                        } else {
                            this.field339 = arg0.method1063(-17162);
                        }
                    } else {
                        this.field336 = arg0.method1063(-17162);
                    }
                } else {
                    this.field337 = arg0.method1063(-17162);
                }
            } else {
                this.field329 = arg0.method1063(-17162);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Z")
    public static final boolean method159(byte arg0, int arg1) {
        ++field338;
        if (arg0 >= -100) {
            return true;
        } else {
            return ~(arg1 & -arg1) == ~arg1;
        }
    }
}
