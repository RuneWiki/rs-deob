import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class142 implements class509 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Leha;")
    private class601 field1809;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 5)
    public final void method938(int arg0) {
        if (arg0 <= 61) {
            method940(109, -70, -103);
        }
        field1811++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V", line = 15)
    public final void method939(int arg0, boolean arg1) {
        field1808++;
        if (arg1) {
            class111.field1332.method233(0, 0, class742.field10226, class249.field3700, this.field1809.field8405, 0);
        }
        if (arg0 != 7998) {
            this.method938(23);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method940(int arg0, int arg1, int arg2) {
        if (arg2 <= 23) {
            method940(41, 99, 48);
        }
        field1807++;
        return class53.method454(arg0, arg1, 33) | (arg1 & 0x70000) != 0 || class255.method1704(1, arg0, arg1);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z", line = 41)
    public final boolean method941(byte arg0) {
        field1810++;
        if (arg0 != -79) {
            this.method939(117, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Leha;)V", line = 51)
    public class142(class601 arg0) {
        this.field1809 = arg0;
    }
}
