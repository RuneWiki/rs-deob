import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class373 extends class30 {

    @OriginalMember(owner = "client!go", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field5632 = new String[100];

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field5635 = 0;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "[I")
    public static int[] field5634 = new int[] { 0, 0, 0, 0, 0, 2, 7, 0, 8, 0, 0, 0, 0, 0, 2, 0, 0, 0, 20, 0, 11, 7, -1, 0, 0, 0, 5, 0, 0, 0, 6, 12, 0, 0, 6, 0, 0, -1, 7, 0, -1, 0, 0, 12, -2, 0, 0, 0, -1, 0, -2, 0, 4, -2, 6, 0, 0, 0, -1, 6, 4, 2, 0, 0, 0, 0, 8, 0, 1, 0, 0, 0, 0, 6, 0, 6, 0, 0, 0, 0, 3, 0, 8, 6, 0, 6, 0, 0, 0, 0, 0, 12, -2, 0, -1, 0, -1, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 8, 0, 0, 0, 0, 8, 0, 5, 0, 0, -2, 0, 5, 0, -1, 0, 3, 2, 15, 0, 0, -1, 0, -1, 3, 0, 28, 1, 0, 0, -1, -2, 0, 0, 0, 6, 8, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, -1, -2, 14, 0, 7, 0, 10, 0, 0, 0, 0, -2, 0, 6, -1, -2, 0, 8, 3, 3, 0, 0, 0, 8, 0, 0, 2, 0, -1, 6, 0, 9, 0, 0, 8, 2, 12, 0, 2, -1, 0, 4, -2, 0, 4, 0, 3, 1, 14, 3, 0, 5, 0, 0, 0, 0, 8, 0, 10, -2, 10, 0, 0, 0, 0, 10, 0, 0, 12, 0, -1, 0, 2, 0, 0, 0, 0, 17, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, 1, 6, 0, 0, 0, 15, 0, 0, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 5)
    public class373() {
        super(0, true);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[I", line = 8)
    public final int[] method116(int arg0, byte arg1) {
        ++field5633;
        int[] var3 = super.field371.method2367((byte) -88, arg0);
        if (arg1 <= 49) {
            this.method116(-86, (byte) -22);
        }
        if (super.field371.field5586) {
            int var4 = class132.field2064[arg0];
            for (int var5 = 0; var5 < class369.field5610; ++var5) {
                var3[var5] = this.method2379(class79.field995[var5], var4, 789221) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(III)I", line = 46)
    private final int method2379(int arg0, int arg1, int arg2) {
        if (arg2 != 789221) {
            field5638 = -114;
        }
        ++field5637;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(III)I", line = 65)
    public static final int method2380(int arg0, int arg1, int arg2) {
        ++field5636;
        class33 var3 = (class33) class126.field1937.method1770(-880, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var4 = arg0;
            for (int var5 = 0; ~var3.field412.length < ~var5; ++var5) {
                if (~var3.field417[var5] == ~arg1) {
                    var4 += var3.field412[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZ)Z", line = 99)
    public static boolean method2381(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 107)
    public static void method2382(int arg0) {
        field5634 = null;
        if (arg0 == -8840) {
            field5632 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lwd;", line = 122)
    public static final class148 method2383(boolean arg0, int arg1) {
        ++field5631;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    if ((double) class400.field5957 == 3.0D) {
                        return class21.field260;
                    }
                    if ((double) class400.field5957 == 4.0D) {
                        return class302.field4783;
                    }
                    if ((double) class400.field5957 == 6.0D) {
                        return class57.field725;
                    }
                    if ((double) class400.field5957 >= 8.0D) {
                        return class107.field1496;
                    }
                }
            } else {
                if ((double) class400.field5957 == 3.0D) {
                    return class53.field668;
                }
                if ((double) class400.field5957 == 4.0D) {
                    return class91.field1131;
                }
                if ((double) class400.field5957 == 6.0D) {
                    return class21.field260;
                }
                if ((double) class400.field5957 >= 8.0D) {
                    return class302.field4783;
                }
            }
        } else {
            if ((double) class400.field5957 == 3.0D) {
                return class31.field385;
            }
            if ((double) class400.field5957 == 4.0D) {
                return class257.field4167;
            }
            if ((double) class400.field5957 == 6.0D) {
                return class53.field668;
            }
            if ((double) class400.field5957 >= 8.0D) {
                return class91.field1131;
            }
        }
        if (!arg0) {
            field5635 = 13;
        }
        return null;
    }
}
