import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class14 {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[Lwh;")
    public static class40[] field145 = new class40[8];

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!eda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field144++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBI)Z")
    public static final boolean method70(int arg0, byte arg1, int arg2) {
        field142++;
        if (arg1 >= -99) {
            field145 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(IBI)I")
    public final int method71(int arg0, byte arg1, int arg2) {
        field143++;
        int var4 = class68.field1042 > arg0 ? class68.field1042 : arg0;
        if (class424.field6143 == this) {
            return 0;
        } else if (class372.field5401 == this) {
            return var4 - arg2;
        } else {
            if (arg1 <= 52) {
                field145 = null;
            }
            return class588.field8373 == this ? (var4 - arg2) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V")
    public static void method72(boolean arg0) {
        if (arg0) {
            field145 = null;
        }
    }
}
