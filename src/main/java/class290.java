import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class290 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5108 = 1;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field5110 = 0;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Leg;")
    public static class37 field5112 = class174.method1167("Untersuchen", -28);

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field5111 = 0;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ljl;")
    public static class101 field5109;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 93) {
            field5110 = 99;
        }
        for (int var6 = arg5; var6 <= arg1; var6++) {
            class145.method1010(arg4, arg2, -25086, arg3, class210.field3617[var6]);
        }
        field5113++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method1944(int arg0) {
        if (arg0 == 0) {
            field5109 = null;
            field5112 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method1945(int arg0) {
        if (arg0 != 0) {
            field5108 = 108;
        }
        field5114++;
        class232.field4000 = new class237[class30.field444.method676(false)][];
        class40.field638 = new boolean[class30.field444.method676(false)];
    }
}
