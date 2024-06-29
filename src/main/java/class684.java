import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class684 {

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "Lsn;")
    public class630 field9372;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lha;ZLme;)I")
    public static final int method3832(class58 arg0, boolean arg1, class192 arg2) {
        field9373++;
        if (arg2.field2558 != -1) {
            return arg2.field2558;
        }
        if (arg2.field2563 != -1) {
            class502 var3 = arg0.field715.method532((byte) 127, arg2.field2563);
            if (!var3.field7194) {
                return var3.field7191;
            }
        }
        return arg1 ? arg2.field2562 : -87;
    }
}
