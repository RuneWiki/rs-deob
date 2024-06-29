import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class418 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lfca;")
    public static class661 field5515 = new class661();

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
    public static final boolean method2412(int arg0, int arg1, int arg2) {
        field5517++;
        if (arg1 == 0) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method2413(byte arg0) {
        field5515 = null;
        if (arg0 != 23) {
            field5514 = 85;
        }
    }
}
