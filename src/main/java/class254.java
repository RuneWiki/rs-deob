import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class254 extends class74 {

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3902 = "Ok";

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field3899;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static void method1691(byte arg0) {
        if (arg0 < -18) {
            field3899 = null;
            field3902 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BII)I")
    private final int method1692(byte arg0, int arg1, int arg2) {
        ++field3900;
        if (arg0 >= -108) {
            return 109;
        } else {
            int var4 = arg2 * 57 + arg1;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lag;B)Z")
    public static final boolean method1693(class188 arg0, byte arg1) {
        if (arg1 != 59) {
            method1691((byte) -12);
        }
        ++field3903;
        if (arg0.field2921 == null) {
            return false;
        } else {
            for (int var2 = 0; arg0.field2921.length > var2; ++var2) {
                int var3 = class1.method2(var2, arg0, -114);
                int var4 = arg0.field2994[var2];
                if (arg0.field2921[var2] == 2) {
                    if (~var3 <= ~var4) {
                        return false;
                    }
                } else if (~arg0.field2921[var2] != -4) {
                    if (~arg0.field2921[var2] == -5) {
                        if (~var3 == ~var4) {
                            return false;
                        }
                    } else if (~var3 != ~var4) {
                        return false;
                    }
                } else if (~var3 >= ~var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            method1691((byte) -72);
        }
        ++field3897;
        if (super.field1254.field3118) {
            int var4 = class207.field3212[arg1];
            for (int var5 = 0; var5 < class178.field2662; ++var5) {
                var3[var5] = this.method1692((byte) -127, class224.field3522[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class254() {
        super(0, true);
    }
}
