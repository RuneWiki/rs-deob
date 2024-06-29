import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class418 {

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Lbs;")
    public static class215 field5588 = new class215();

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field5590 = 0;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2346(int arg0, int arg1, int arg2) {
        field5589++;
        if (arg0 >= -95) {
            return false;
        } else if ((class600.method3366(arg1, arg2, -1) | (arg2 & 0x10000) != 0) || class496.method2866(-93, arg2, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class102.method555(-108, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 29)
    public static void method2347(int arg0) {
        field5588 = null;
        if (arg0 != -24924) {
            field5590 = -105;
        }
    }
}
