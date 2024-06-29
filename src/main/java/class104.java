import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class104 {

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Lpw;")
    public static class104 field1510 = new class104();

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Lpw;")
    public static class104 field1511 = new class104();

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "Lpw;")
    public static class104 field1512 = new class104();

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "Lpw;")
    public static class104 field1513 = new class104();

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "Lss;")
    public static class307 field1514 = new class307("", 12);

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "Lhl;")
    public static class353 field1515 = new class353(2, 2);

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field1516 = -1;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "Lgga;")
    public static class513 field1517;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method850(int arg0, int arg1, int arg2) {
        field1508++;
        if (arg2 == 32) {
            return (arg0 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(III)Z", line = 17)
    public static final boolean method851(int arg0, int arg1, int arg2) {
        field1509++;
        if (arg2 != -1) {
            field1513 = null;
        }
        return (arg0 & 0x800) != 0 | class464.method2707(arg1, (byte) -93, arg0) || class518.method3033(arg0, -102, arg1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 30)
    public static void method852(int arg0) {
        if (arg0 != 2) {
            method850(-16, 31, -97);
        }
        field1514 = null;
        field1512 = null;
        field1517 = null;
        field1511 = null;
        field1515 = null;
        field1510 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;", line = 49)
    public final String toString() {
        field1507++;
        throw new IllegalStateException();
    }
}
