import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class435 {

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field6596 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2646(int arg0, int arg1, byte arg2) {
        if (arg2 >= -26) {
            return true;
        } else {
            field6593++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public static final void method2647(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6595++;
        if (class377.field5760 <= (arg3 - arg2) && class49.field701 >= (arg3 + arg2) && (arg1 - arg2) >= class463.field6924 && (arg1 + arg2) <= class369.field5628) {
            class354.method2272(arg1, arg3, 1869979233, arg4, arg2);
        } else {
            class135.method914(arg3, arg1, arg2, (byte) 90, arg4);
        }
        if (arg0 < 125) {
            method2647(-25, -96, -99, 112, -20);
        }
    }
}
