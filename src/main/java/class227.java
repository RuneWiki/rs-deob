import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class227 extends class386 {

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "[Lub;")
    public static class20[] field2939;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field2937;
        int var3 = -72 / ((13 - arg1) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var5 = class562.field8114[arg0];
            for (int var6 = 0; ~var6 > ~class599.field8643; ++var6) {
                var4[var6] = this.method1382((byte) -125, var5, class152.field1879[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)Z")
    public static final boolean method1380(int arg0) {
        if (arg0 < 83) {
            return true;
        } else {
            ++field2935;
            class77 var1 = (class77) class521.field7637.method1132((byte) 73);
            if (var1 == null) {
                return false;
            } else {
                for (int var2 = 0; var1.field1134 > var2; ++var2) {
                    if (var1.field1135[var2] != null && ~var1.field1135[var2].field6693 == -1) {
                        return false;
                    }
                    if (var1.field1126[var2] != null && var1.field1126[var2].field6693 == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Z)V")
    public static void method1381(boolean arg0) {
        if (arg0) {
            field2933 = 38;
        }
        field2939 = null;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BII)I")
    private final int method1382(byte arg0, int arg1, int arg2) {
        ++field2934;
        int var4 = arg1 * 57 + arg2;
        int var5 = -6 % ((-67 - arg0) / 50);
        int var6 = var4 ^ var4 << 1;
        return -(((var6 * 15731 * var6 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
