import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class172 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public int field2301 = 0;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Z")
    public static boolean field2303 = true;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLnj;)V")
    private final void method1064(int arg0, byte arg1, class228 arg2) {
        if (arg0 == 5) {
            this.field2301 = arg2.method1343(255);
        }
        field2302++;
        if (arg1 >= -118) {
            this.method1066((class228) null, -34);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public static final int method1065(int arg0, int arg1) {
        return class282.field4111 == null ? 0 : class282.field4111[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lnj;I)V")
    public final void method1066(class228 arg0, int arg1) {
        if (arg1 >= -2) {
            return;
        }
        field2304++;
        while (true) {
            int var3 = arg0.method1348(-115);
            if (var3 == 0) {
                return;
            }
            this.method1064(var3, (byte) -126, arg0);
        }
    }
}
