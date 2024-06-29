import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class103 extends class35 {

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public static int field1307 = 1;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "Lrb;")
    public static class352 field1308 = new class352(12, 0, 1, 0);

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V")
    public static void method598(byte arg0) {
        if (arg0 <= -85) {
            field1308 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIII)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1306++;
        if (arg2 != -28992) {
            field1308 = null;
        }
        for (class10 var7 = (class10) class413.field5873.method772(0); var7 != null; var7 = (class10) class413.field5873.method775(2)) {
            if (class576.field8505 >= var7.field92) {
                var7.method736((byte) -128);
            } else {
                class435.method2653(3, arg5, arg1 >> 1, arg3 >> 1, (var7.field88 << 7) + 64, var7.field86, arg4, var7.field87 * 2, (var7.field89 << 7) + 64);
                class179.field2757.method1665(var7.field91 | 0xFF000000, class543.field8117[0] + arg6, false, var7.field83, 0, arg0 + class543.field8117[1]);
            }
        }
    }
}
