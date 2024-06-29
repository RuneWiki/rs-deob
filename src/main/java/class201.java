import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class201 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class476.field7285 != null) {
            class476.field7285[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class350.field5453 != null) {
            class350.field5453[arg0][arg1] = (short) arg3;
        }
        if (class413.field6247 != null) {
            class413.field6247[arg0][arg1] = (byte) arg4;
        }
    }
}
