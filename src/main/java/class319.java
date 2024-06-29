import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class319 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[Lha;")
    public static class116[] field4756;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method2001(int arg0) {
        field4756 = null;
        int var1 = 99 % ((-arg0 - 68) / 41);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method2002(int arg0, int arg1, int arg2) {
        field4755++;
        if (arg2 < 48) {
            field4756 = null;
        }
        return (arg1 & 0x400) != 0;
    }
}
