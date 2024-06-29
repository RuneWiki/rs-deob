import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class310 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[J")
    public static long[] field4027;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[[[B")
    public static byte[][][] field4028;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1806(int arg0) {
        if (class94.field1239 == null) {
            class94.field1239 = class466.method2593((byte) 100);
            class266.field3564 = class94.field1239[0];
            class183.field2345 = class584.method3191(arg0 + 19454);
        }
        if (arg0 != -19453) {
            method1808(18);
        }
        field4029++;
        if (class412.field5313 == null) {
            class66.method540(16384);
        }
        class466 var1 = class266.field3564;
        int var2 = class571.method3050(91);
        if (class266.field3564 == var1) {
            class183.field2347 = class266.field3564.field6072.method3280((byte) -103, class144.field1890);
            if (class266.field3564.field6081) {
                class633.field8824 = (class266.field3564.field6078 - class266.field3564.field6076) * var2 / 100 + class266.field3564.field6076;
            }
            if (class266.field3564.field6080) {
                class183.field2347 = class183.field2347 + class633.field8824 + "%";
            }
        } else if (class466.field6102 == class266.field3564) {
            class412.field5313 = null;
            class442.method2508(3, arg0 + 19454);
        } else {
            class183.field2347 = var1.field6075.method3280((byte) 71, class144.field1890);
            if (class266.field3564.field6080) {
                class183.field2347 = class183.field2347 + var1.field6078 + "%";
            }
            class633.field8824 = var1.field6078;
            if (class266.field3564.field6081 || var1.field6081) {
                class183.field2345 = class584.method3191(1);
            }
        }
        if (class412.field5313 == null) {
            return;
        }
        class412.field5313.method764(class183.field2345, -107, class183.field2347, class633.field8824, class266.field3564);
        if (class379.field4854 == null) {
            return;
        }
        for (int var3 = class94.field1238 + 1; var3 < class379.field4854.length; var3++) {
            if (class379.field4854[var3].method547((byte) -17) >= 100 && (var3 - 1) == class94.field1238 && class566.field7391 >= 1 && class412.field5313.method756((byte) 100)) {
                try {
                    class379.field4854[var3].method546(-369);
                } catch (Exception var4) {
                    class379.field4854 = null;
                    return;
                }
                class412.field5313.method757(class379.field4854[var3], (byte) 126);
                class94.field1238++;
                if ((class379.field4854.length - 1) <= class94.field1238 && class379.field4854.length > 1) {
                    class94.field1238 = class107.field1390.method3477(0) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 103)
    public static final byte[] method1807(byte arg0, boolean arg1, Object arg2) {
        field4030++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class71.method570(-1623, var3) : var3;
        } else if (arg2 instanceof class602) {
            class602 var4 = (class602) arg2;
            return var4.method2681((byte) -49);
        } else {
            if (arg0 >= -6) {
                field4028 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 140)
    public static void method1808(int arg0) {
        field4028 = null;
        field4027 = null;
        int var1 = 84 / ((-arg0 - 39) / 36);
    }
}
