import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class50 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[Lq;")
    public static class193[] field645 = new class193[14];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lma;")
    public static class5 field644 = new class5();

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[Luj;")
    public static class169[] field642;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 4)
    public static final void method373(byte arg0) {
        field643++;
        if (class26.field388 != null) {
            class26.field388.method1770(16384);
        }
        if (class97.field1278 != null) {
            class97.field1278.method1770(16384);
        }
        if (arg0 <= 90) {
            field642 = (class169[]) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 22)
    public static void method374(int arg0) {
        if (arg0 != 1251492294) {
            field642 = (class169[]) null;
        }
        field645 = null;
        field644 = null;
        field642 = null;
    }
}
