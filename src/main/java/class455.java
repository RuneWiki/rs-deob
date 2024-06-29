import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class455 {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public int field6562;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Lbk;")
    private class106 field6564;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Luq;")
    public static class455 field6559 = new class455(0, 3, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Luq;")
    public static class455 field6566 = new class455(1, 3, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Luq;")
    public static class455 field6567 = new class455(2, 4, class106.field1573);

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "Luq;")
    public static class455 field6568 = new class455(3, 1, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "Luq;")
    public static class455 field6569 = new class455(4, 2, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Luq;")
    public static class455 field6570 = new class455(5, 3, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Luq;")
    public static class455 field6571 = new class455(6, 4, class106.field1577);

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field6572 = class341.method2115(27279, 16);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!uq", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field6561++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 15)
    public static void method2666(int arg0) {
        field6559 = null;
        field6569 = null;
        field6566 = null;
        field6568 = null;
        field6567 = null;
        field6571 = null;
        field6570 = null;
        if (arg0 != 16) {
            field6566 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Luq;", line = 31)
    public static final class455 method2667(int arg0, int arg1) {
        field6563++;
        if (arg0 == 0) {
            return field6559;
        } else if (arg0 == 1) {
            return field6566;
        } else if (arg0 == 2) {
            return field6567;
        } else if (arg0 == 3) {
            return field6568;
        } else if (arg0 == 4) {
            return field6569;
        } else if (arg0 == 5) {
            return field6570;
        } else if (arg0 == 6) {
            return field6571;
        } else if (arg1 == 6) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IILbk;)V", line = 119)
    private class455(int arg0, int arg1, class106 arg2) {
        this.field6560 = arg1;
        this.field6562 = arg0;
        this.field6564 = arg2;
        this.field6565 = this.field6564.field1564 * this.field6560;
        if (this.field6562 >= 16) {
            throw new RuntimeException();
        }
    }
}
