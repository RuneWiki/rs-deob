import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class654 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lpw;")
    public static class656 field9145 = new class656();

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lrl;")
    public static class672 field9148 = new class672(40, 15);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lsv;")
    public static class611 field9147;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
    public static final int method3766(byte arg0, int arg1) {
        if (arg0 > -48) {
            return 25;
        } else {
            field9146++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method3767(int arg0) {
        if (arg0 < 60) {
            method3767(-48);
        }
        field9144++;
        class453.field6805.method569(0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method3768(int arg0) {
        field9147 = null;
        if (arg0 != 777538440) {
            method3766((byte) 113, -87);
        }
        field9145 = null;
        field9148 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method3769(byte arg0) {
        field9143++;
        client.method1939(-103);
        if (arg0 != 42) {
            field9148 = null;
        }
    }
}
