import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class354 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Lwo;")
    public class746 field4544;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lhg;")
    public static class693 field4547 = new class693(4, 8);

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4548 = -1;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field4550 = -1;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V", line = 3)
    public final void method2063(int arg0, int arg1) {
        if (arg0 != -20521) {
            this.method393((byte) -79);
        }
        if (this.method391(3, arg1) != 3) {
            this.method389(-1, arg1);
        }
        field4546++;
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(II)V", line = 29)
    public static final void method2064(int arg0, int arg1) {
        class557.field7751 = -1;
        field4549++;
        if (arg0 < -25) {
            class687.field9571 = arg1;
            class557.field7751 = -1;
            class358.method2080(-123);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V", line = 44)
    public static void method2065(int arg0) {
        field4547 = null;
        int var1 = -31 % ((arg0 - 52) / 57);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lwo;)V", line = 60)
    public class354(class746 arg0) {
        this.field4544 = arg0;
        this.field4545 = this.method393((byte) 117);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILwo;)V", line = 69)
    public class354(int arg0, class746 arg1) {
        this.field4545 = arg0;
        this.field4544 = arg1;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)I")
    public abstract int method391(int arg0, int arg1);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
    public abstract int method393(byte arg0);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public abstract void method388(int arg0);

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)V")
    public abstract void method389(int arg0, int arg1);
}
