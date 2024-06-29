import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class631 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lrf;")
    public static class749 field8925 = new class749();

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[Lfu;")
    public static class637[] field8927 = new class637[4];

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ldu;")
    public static class418 field8928;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
    public static final boolean method3624(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field8927 = null;
        }
        field8926++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method3625(byte arg0) {
        field8925 = null;
        field8928 = null;
        if (arg0 >= -77) {
            field8927 = null;
        }
        field8927 = null;
    }
}
