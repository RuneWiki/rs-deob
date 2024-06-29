import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class193 extends class51 {

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
    public static int[] field3804 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "Lea;")
    private static class38 field3803 = class9.method46((byte) 102, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "Lea;")
    private static class38 field3805 = class9.method46((byte) 109, "You have only just left another world)3");

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public static int field3807 = -1;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "Lea;")
    public static class38 field3806 = field3803;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "Lea;")
    public static class38 field3811 = field3805;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "Lea;")
    public static class38 field3810 = class9.method46((byte) 116, " weitere Optionen");

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "Loe;")
    public static class130 field3809;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Lef;")
    public static final class43 method1283(int arg0, byte arg1, int arg2) {
        ++field3812;
        int var3 = 105 % ((63 - arg1) / 52);
        class43 var4 = class98.method813(arg0, 4096);
        if (arg2 == -1) {
            return var4;
        } else {
            return var4 != null && var4.field1061 != null && ~var4.field1061.length < ~arg2 ? var4.field1061[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 > -125) {
            field3804 = null;
        }
        ++field3808;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            class131.method963(var3, 0, class86.field2008, class170.field3490[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3806 = null;
        field3809 = null;
        field3804 = null;
        field3803 = null;
        field3805 = null;
        field3810 = null;
        if (arg0 != -10453) {
            field3805 = null;
        }
        field3811 = null;
    }
}
