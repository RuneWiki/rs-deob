import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class338 extends class17 {

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "Z")
    private boolean field4880 = true;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "Z")
    private boolean field4883 = true;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "B")
    public static byte field4879;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ap", name = "P", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ap", name = "Q", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ap", name = "R", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "Lcb;")
    public static class367 field4882;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method89(int arg0, byte arg1) {
        ++field4884;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[][] var4 = this.method91(0, 0, this.field4880 ? -arg0 + class38.field417 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field4883) {
                for (int var11 = 0; class530.field7763 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class530.field7763 < ~var12; ++var12) {
                    var8[var12] = var5[class43.field499 - var12];
                    var9[var12] = var6[-var12 + class43.field499];
                    var10[var12] = var7[-var12 + class43.field499];
                }
            }
        }
        return arg1 != -25 ? null : var3;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Z", line = 72)
    public static final boolean method2014(int arg0, int arg1) {
        if (arg1 != 0) {
            method2015(46);
        }
        ++field4887;
        return arg0 == 0 || ~arg0 == -2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lwm;II)V", line = 84)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field205 = ~arg0.method2357((byte) 127) == -2;
                }
            } else {
                this.field4880 = arg0.method2357((byte) 125) == 1;
            }
        } else {
            this.field4883 = arg0.method2357((byte) 120) == 1;
        }
        if (arg2 == 5159) {
            ++field4877;
        }
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(I)V", line = 130)
    public static void method2015(int arg0) {
        if (arg0 != -14732) {
            method2017(-3, 13, false, 2, 44, -66, 13);
        }
        field4882 = null;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)I", line = 142)
    public static final int method2016(int arg0, int arg1) {
        ++field4889;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 != 6409) {
            if (~arg0 == -32842) {
                return 1;
            } else if (arg0 != 6410) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 == 6408) {
                    return 4;
                } else {
                    if (arg1 != 1) {
                        field4879 = -35;
                    }
                    throw new IllegalArgumentException("");
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 261)
    public class338() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[I", line = 181)
    public final int[] method27(int arg0, int arg1) {
        if (arg1 <= 53) {
            this.field4883 = false;
        }
        ++field4878;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(this.field4880 ? -arg0 + class38.field417 : arg0, -4526, 0);
            if (!this.field4883) {
                class182.method1139(var4, 0, var3, 0, class530.field7763);
            } else {
                for (int var5 = 0; class530.field7763 > var5; ++var5) {
                    var3[var5] = var4[class43.field499 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZIIII)V", line = 223)
    public static final void method2017(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -20073) {
            field4879 = -1;
        }
        ++field4888;
        class158.field2368 = arg0;
        class218.field3160 = arg1;
        class485.field6763 = arg3;
        class254.field3756 = arg6;
        class308.field4478 = arg5;
        if (arg2 && ~class254.field3756 <= -101) {
            class515.field7596 = class218.field3160 * 128 + 64;
            class478.field6654 = class158.field2368 * 128 - -64;
            class51.field619 = class488.method2817(class478.field6654, true, class515.field7596, class320.field4627) - class485.field6763;
        }
        class504.field7461 = 2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)Z", line = 248)
    public static final boolean method2018(boolean arg0, int arg1) {
        if (!arg0) {
            method2014(-74, 36);
        }
        ++field4881;
        return arg1 == 20 || arg1 == 10 || ~arg1 == -1005 || ~arg1 == -12 || ~arg1 == -52;
    }
}
