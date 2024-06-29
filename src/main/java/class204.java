import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class204 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "F")
    public static float field2593;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field2596;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)[Ltda;", line = 20)
    public static final class16[] method1231(boolean arg0) {
        field2598++;
        if (arg0) {
            method1234(-126);
        }
        return new class16[] { class352.field4493, class270.field3417, class413.field5164 };
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 36)
    public static void method1233(int arg0) {
        field2596 = null;
        if (arg0 != 14828) {
            method1234(-84);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)[Lfh;", line = 46)
    public static final class266[] method1234(int arg0) {
        if (arg0 != 0) {
            method1234(-25);
        }
        field2594++;
        return new class266[] { class400.field5009, class665.field9378, class494.field6537, class511.field6943, class104.field1393, class689.field9767, class325.field4176, class472.field5985, class549.field7640, class386.field4848, class237.field2966, class89.field1249, class199.field2529, class97.field1320, class646.field9088 };
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI[BI)I")
    public abstract int method1228(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public abstract void method1229(int arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BIIB)V")
    public abstract void method1230(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z")
    public abstract boolean method1232(int arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    public abstract void method1235(int arg0);
}
