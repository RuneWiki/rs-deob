import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class666 extends RuntimeException {

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "Ljava/lang/String;")
    public String field9432;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field9431;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Lui;")
    public static class210 field9433 = new class210(15, 0, 1, 0);

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 5)
    public static void method3825(byte arg0) {
        if (arg0 != 35) {
            field9433 = null;
        }
        field9433 = null;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method3826(int arg0, int arg1, int arg2) {
        field9429++;
        if (arg1 > -39) {
            field9433 = null;
        }
        return class695.method3926(arg2, 0, arg0) & ((arg2 & 0x2000) != 0 | class71.method727(arg0, arg2, false) | class641.method3716(arg2, arg0, (byte) -117));
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 36)
    public class666(Throwable arg0, String arg1) {
        this.field9432 = arg1;
        this.field9431 = arg0;
    }
}
