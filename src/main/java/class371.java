import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class371 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field5343 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    public static final void method2309(byte arg0, int arg1) {
        field5342++;
        class17 var2 = class245.method1634(1, (long) arg1, 2);
        if (arg0 >= -9) {
            method2309((byte) -10, -93);
        }
        var2.method69(13);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Ljg;")
    public static final class770 method2310(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6542;
    }
}
