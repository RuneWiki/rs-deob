import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class669 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Ljk;")
    public static class179 field9430 = new class179(0, 0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 3)
    public static void method3758(int arg0) {
        field9430 = null;
        if (arg0 != 0) {
            field9430 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)I", line = 15)
    public final int method3759(int arg0, long arg1) {
        field9429++;
        long var4 = this.method639(arg0 - 86);
        if (var4 > 0L) {
            class419.method2233(-28448, var4);
        }
        if (arg0 != -13) {
            this.method641(58);
        }
        return this.method640(arg1, (byte) 121);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Z", line = 37)
    public static final boolean method3760(int arg0, byte arg1) {
        if (arg1 == -62) {
            field9428++;
            return arg0 == 10 || arg0 == 11 || arg0 == 12;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)J")
    public abstract long method643(int arg0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)I")
    public abstract int method640(long arg0, byte arg1);

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)J")
    public abstract long method639(int arg0);

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public abstract void method641(int arg0);
}
