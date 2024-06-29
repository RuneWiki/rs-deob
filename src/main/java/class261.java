import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class261 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4261 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Lwk;")
    public static class294[] field4263 = new class294[14];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1750(int arg0) {
        field4263 = null;
        if (arg0 <= 34) {
            method1751(19, 10, -68, -78);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
    public static final void method1751(int arg0, int arg1, int arg2, int arg3) {
        field4264++;
        class291 var4 = class61.method389(arg0, arg1, 0);
        var4.method2009(-115);
        var4.field4763 = arg2;
        var4.field4768 = arg3;
    }
}
