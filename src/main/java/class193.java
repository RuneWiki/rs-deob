import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class193 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ldw;")
    private class664 field2620;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "J")
    public long field2622;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lkr;")
    public static class602 field2624 = new class602(66, 12);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2627 = new String[200];

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lmaa;")
    public static class508 field2625 = new class508(5, 3);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lsba;")
    public static class558 field2626;

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field2620.method3693(this.field2622, -25658);
        field2623++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 18)
    public static void method1200(byte arg0) {
        if (arg0 != -25) {
            method1200((byte) 34);
        }
        field2627 = null;
        field2626 = null;
        field2624 = null;
        field2625 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIBI)V", line = 33)
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2621++;
        if (arg4 >= 1 && arg5 >= 1 && arg4 <= class277.field4036 - 2 && arg5 <= class667.field9202 - 2) {
            int var9 = arg2;
            if (arg2 < 3 && class479.method2918(arg5, true, arg4)) {
                var9 = arg2 + 1;
            }
            if (class332.field4707.field4774.method1242(0) == 0 && !class718.method4028((byte) -87, arg5, var9, class622.field8328, arg4)) {
                return;
            }
            if (class137.field1948 == null) {
                return;
            }
            class647.field8683.method1750(arg4, arg2, arg6, class129.field1802, class209.field2735[arg2], -120, arg5);
            if (arg1 >= 0) {
                int var10 = class332.field4707.field4779.method1162(0);
                class332.field4707.method2158(1, class332.field4707.field4779, -15);
                class647.field8683.method1746(arg2, arg4, var9, arg5, class129.field1802, arg3, arg1, class209.field2735[arg2], arg8, (byte) 49, arg0);
                class332.field4707.method2158(var10, class332.field4707.field4779, -15);
            }
        }
        int var11 = 127 / ((75 - arg7) / 37);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ldw;JI)V", line = 73)
    public class193(class664 arg0, long arg1, int arg2) {
        this.field2620 = arg0;
        this.field2622 = arg1;
    }
}
