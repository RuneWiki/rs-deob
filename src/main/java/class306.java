import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class306 extends RuntimeException {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4171;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Ljava/lang/String;")
    public String field4172;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Ldi;")
    public static class83 field4170 = new class83(61, 8);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1778(byte arg0) {
        if (arg0 != 33) {
            field4170 = null;
        }
        field4170 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1779(int arg0) {
        field4173++;
        if (~class459.field6727 == arg0) {
            class459.field6727 = 6;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 35)
    public class306(Throwable arg0, String arg1) {
        this.field4171 = arg0;
        this.field4172 = arg1;
    }
}
