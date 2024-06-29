import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class232 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[Lig;")
    public static class674[] field3220;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1490(int arg0) {
        field3222++;
        if (arg0 != 0) {
            method1491((byte) -119);
        }
        class308.field3976.method3210(false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 23)
    public static void method1491(byte arg0) {
        if (arg0 > -59) {
            field3220 = null;
        }
        field3220 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Luea;")
    public abstract class243 method320(int arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z")
    public abstract boolean method315(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public abstract void method319(int arg0);

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public abstract void method322(int arg0);
}
