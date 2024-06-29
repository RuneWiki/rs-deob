import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class15 extends class436 {

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    private int field172 = 4;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    private int field187 = 4;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Ljava/lang/String;")
    public static String field176 = "wave2:";

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lrg;")
    public static class383 field173;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "Ljava/awt/Font;")
    public static Font field188;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 3)
    public class15() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V", line = 7)
    private static final void method81(int arg0, byte arg1) {
        class431.field6199 = new int[arg0];
        int var2 = 87 % ((58 - arg1) / 43);
        class434.field6233 = new int[arg0];
        ++field174;
        class326.field4457 = new int[arg0];
        class163.field2281 = new int[arg0];
        class333.field4506 = new int[arg0];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lgp;IZBLgp;)I", line = 21)
    public static final int method82(class31 arg0, int arg1, boolean arg2, byte arg3, class31 arg4) {
        ++field183;
        if (arg3 != -24) {
            field184 = 2;
        }
        if (arg1 == 1) {
            int var5 = arg4.field2522;
            int var6 = arg0.field2522;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (~arg1 == -3) {
            return class401.method2590(class40.field608, (byte) -123, arg0.method239(false).field3461, arg4.method239(false).field3461);
        } else if (arg1 == 3) {
            if (arg4.field475.equals("-")) {
                if (arg0.field475.equals("-")) {
                    return 0;
                } else {
                    return arg2 ? -1 : 1;
                }
            } else if (arg0.field475.equals("-")) {
                return !arg2 ? -1 : 1;
            } else {
                return class401.method2590(class40.field608, (byte) -106, arg0.field475, arg4.field475);
            }
        } else if (~arg1 == -5) {
            if (arg4.method1194((byte) -15)) {
                return arg0.method1194((byte) -15) ? 0 : 1;
            } else {
                return arg0.method1194((byte) -15) ? -1 : 0;
            }
        } else if (~arg1 == -6) {
            if (!arg4.method1193(arg3 + 23)) {
                return !arg0.method1193(-1) ? 0 : -1;
            } else {
                return arg0.method1193(-1) ? 0 : 1;
            }
        } else if (~arg1 == -7) {
            if (!arg4.method1195((byte) 42)) {
                return !arg0.method1195((byte) 42) ? 0 : -1;
            } else {
                return !arg0.method1195((byte) 42) ? 1 : 0;
            }
        } else if (arg1 == 7) {
            if (arg4.method1197(16)) {
                return !arg0.method1197(arg3 ^ -8) ? 1 : 0;
            } else {
                return !arg0.method1197(arg3 + 40) ? 0 : -1;
            }
        } else if (~arg1 == -9) {
            int var7 = arg4.field480;
            int var8 = arg0.field480;
            if (arg2) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (~var8 == -1001) {
                    var8 = -1;
                }
            } else {
                if (~var8 == 0) {
                    var8 = 1000;
                }
                if (~var7 == 0) {
                    var7 = 1000;
                }
            }
            return -var8 + var7;
        } else {
            return -arg0.field481 + arg4.field481;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I", line = 123)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            return null;
        } else {
            ++field177;
            int[] var3 = super.field6258.method2688((byte) -54, arg0);
            if (super.field6258.field6138) {
                int var4 = class43.field653 / this.field172;
                int var5 = class123.field1728 / this.field187;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg0 % var5;
                    var7 = this.method2729(0, 0, class123.field1728 * var6 / var5);
                } else {
                    var7 = this.method2729(0, 0, 0);
                }
                for (int var8 = 0; var8 < class43.field653; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class43.field653 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V", line = 177)
    public static final void method83(int arg0, int arg1) {
        ++field181;
        class399 var2 = class269.method1655(arg0, arg1, arg0 ^ -77);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILeb;)V", line = 189)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field187 = arg2.method2429(0);
            }
        } else {
            this.field172 = arg2.method2429(0);
        }
        if (arg0 != 34) {
            method82((class31) null, 53, true, (byte) 116, (class31) null);
        }
        ++field182;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V", line = 227)
    public static final void method84(byte arg0, int arg1) {
        class190 var2 = class395.field5776;
        synchronized (class395.field5776) {
            class395.field5776.method1249(1);
            class395.field5776 = new class190(arg1);
        }
        ++field180;
        int var3 = -37 % ((arg0 - 8) / 37);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I", line = 242)
    public final int[][] method85(int arg0, int arg1) {
        ++field178;
        if (arg0 != -13348) {
            method83(18, -17);
        }
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int var4 = class43.field653 / this.field172;
            int var5 = class123.field1728 / this.field187;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method2731(0, false, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2731(class123.field1728 * var7 / var5, false, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class43.field653 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class43.field653 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 311)
    public static void method86(int arg0) {
        field188 = null;
        field173 = null;
        if (arg0 != 0) {
            method87(24, -9, true, -48, false, false, -65);
        }
        field176 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZIZZI)V", line = 323)
    public static final void method87(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        ++field175;
        if (!arg5) {
            if (arg0 < arg6) {
                int var7 = (arg0 + arg6) / 2;
                int var8 = arg0;
                class31 var9 = class126.field1775[var7];
                class126.field1775[var7] = class126.field1775[arg6];
                class126.field1775[arg6] = var9;
                for (int var10 = arg0; arg6 > var10; ++var10) {
                    if (~class281.method1734(class126.field1775[var10], var9, arg1, arg3, arg2, 0, arg4) >= -1) {
                        class31 var11 = class126.field1775[var10];
                        class126.field1775[var10] = class126.field1775[var8];
                        class126.field1775[var8++] = var11;
                    }
                }
                class126.field1775[arg6] = class126.field1775[var8];
                class126.field1775[var8] = var9;
                method87(arg0, arg1, arg2, arg3, arg4, false, var8 + -1);
                method87(var8 + 1, arg1, arg2, arg3, arg4, false, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V", line = 370)
    public static final void method88(int arg0) {
        ++field186;
        for (int var1 = arg0; class184.field2571.length > var1; ++var1) {
            for (int var2 = 0; ~class184.field2571[var1].length < ~var2; ++var2) {
                class184.field2571[var1][var2] = class439.field6376;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V", line = 408)
    public static final void method89(int arg0) {
        ++field179;
        int var1 = class383.method2501(1448);
        int var2 = 60 % ((48 - arg0) / 38);
        if (~var1 == -1) {
            class8.field123 = null;
            method81(0, (byte) 103);
        } else if (~var1 != -2) {
            class313.method1985((byte) (255 & class64.field991 - 4), 13594);
            method81(2, (byte) -110);
        } else {
            class313.method1985((byte) 0, 13594);
            method81(512, (byte) 9);
            if (class221.field2910 != null) {
                class113.method750(0);
            }
        }
        class179.field2508 = class265.field3617;
    }
}
