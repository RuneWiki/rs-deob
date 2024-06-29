import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class20 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lvf;")
    public static class340 field239;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method145(int arg0, int arg1, int arg2) {
        field238++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class234 var3 = class123.method795(0, arg0);
        if (arg1 != 10) {
            field240 = -80;
        }
        return var3.method1625(-4, arg2);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 42)
    public static void method146(boolean arg0) {
        field239 = null;
        if (arg0) {
            method146(false);
        }
    }
}
