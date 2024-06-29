import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class66 extends class478 {

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "Lad;")
    public static class19 field667 = new class19(8);

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "Lwba;")
    public static class435 field669;

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)Z")
    public static final boolean method351(int arg0) {
        ++field666;
        boolean var1 = true;
        if (class8.field85 == null) {
            if (!class408.field5441.method3849(class397.field5365, false)) {
                var1 = false;
            } else {
                class8.field85 = class550.method3113(class408.field5441, class397.field5365);
            }
        }
        if (arg0 != 0) {
            field667 = null;
        }
        if (class103.field1110 == null) {
            if (class408.field5441.method3849(class124.field1390, false)) {
                class103.field1110 = class550.method3113(class408.field5441, class124.field1390);
            } else {
                var1 = false;
            }
        }
        if (class460.field6530 == null) {
            if (class408.field5441.method3849(class689.field9701, false)) {
                class460.field6530 = class550.method3113(class408.field5441, class689.field9701);
            } else {
                var1 = false;
            }
        }
        if (class537.field7558 == null) {
            if (class573.field8139.method3849(class46.field477, false)) {
                class537.field7558 = class658.method3651(-127, class46.field477, class573.field8139);
            } else {
                var1 = false;
            }
        }
        if (class385.field5195 == null) {
            if (class408.field5441.method3849(class46.field477, false)) {
                class385.field5195 = class550.method3119(class408.field5441, class46.field477);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
    public static void method352(byte arg0) {
        field667 = null;
        if (arg0 < 36) {
            method351(-36);
        }
        field669 = null;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field668;
        int[] var3 = super.field6886.method789(arg0, (byte) 123);
        if (arg1 != -11323) {
            return null;
        } else {
            if (super.field6886.field1592) {
                class567.method3217(var3, 0, class436.field6154, class695.field9740[arg0]);
            }
            return var3;
        }
    }
}
