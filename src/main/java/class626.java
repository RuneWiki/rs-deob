import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class626 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lnc;")
    public static class26 field8485 = new class26();

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field8479;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field8481;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field8483;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field8484;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Luq;")
    public static class172 field8486;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lef;")
    public static class513 field8488;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIIII)V", line = 7)
    public static final void method3463(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8482++;
        if (arg0 >= -31) {
            method3463((byte) 91, -25, 7, -52, 31);
        }
        int var5 = class28.field274;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class279.field4041 = arg2;
            class28.field274 = 2;
            class570.field7773 = arg1;
            class429.field6218 = arg3;
            class46.field477 = arg4;
        } else if (var5 == 2) {
            if (class279.field4041 > arg2) {
                class279.field4041 = arg2;
            }
            if (class429.field6218 < arg3) {
                class429.field6218 = arg3;
            }
            if (class46.field477 > arg4) {
                class46.field477 = arg4;
            }
            if (class570.field7773 < arg1) {
                class570.field7773 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 73)
    public static void method3464(boolean arg0) {
        field8485 = null;
        field8486 = null;
        field8488 = null;
        if (arg0) {
            method3463((byte) -11, -4, -109, 47, 33);
        }
    }
}
