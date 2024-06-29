import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class137 extends class665 {

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lqs;")
    public class552 field1928;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lnd;")
    public static class500 field1929 = new class500();

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1930 = 16777215;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lqs;)V", line = 4)
    public class137(class552 arg0) {
        this.field1928 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Le;Ljava/awt/Canvas;II)Loa;", line = 12)
    public static final class638 method974(class489 arg0, Canvas arg1, int arg2, int arg3) {
        field1932++;
        return arg3 == 16777215 ? new class289(arg1, arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 24)
    public static void method975(int arg0) {
        if (arg0 != 16777215) {
            field1930 = 62;
        }
        field1929 = null;
    }
}
