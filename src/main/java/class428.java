import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class428 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field6074 = 0;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field6080 = -1;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lap;")
    public static class335 field6076 = new class335(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 4)
    public static void method2506(int arg0) {
        int var1 = 79 % ((45 - arg0) / 56);
        field6076 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BJ)V", line = 18)
    public static final void method2507(byte arg0, long arg1) {
        field6079++;
        class40.field511.field6631 = 0;
        class40.field511.method2729(class266.field3365.field1865, false);
        class40.field511.method2760(arg1, -10);
        class40.field511.method2729(class11.field177, false);
        class456.field6562 = 0;
        class45.field539 = -3;
        class533.field7846 = 1;
        if (arg0 <= 50) {
            method2508(76, -0.46514145F, -1.4289843F, 0.14293325F);
        }
        class312.field3984 = 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IFFF)F", line = 38)
    public static final float method2508(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 < 118) {
            method2506(-92);
        }
        field6075++;
        return (arg1 - arg3) * arg2 + arg3;
    }
}
