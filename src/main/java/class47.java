import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class47 extends class259 {

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field647 = -1;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
    public static boolean field658 = true;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Llc;")
    public static class270 field653;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method292(int arg0) {
        field653 = null;
        if (arg0 != -2) {
            field653 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -50) {
            method292(37);
        }
        field665++;
        if (arg0 >= class264.field4230 && class273.field4418 >= arg3 && arg1 >= class73.field1156 && arg6 <= class59.field859) {
            if (arg5 == 1) {
                class230.method1599(arg4, arg3, 57, arg0, arg6, arg1);
            } else {
                class120.method899(arg6, arg0, arg1, 22830, arg3, arg5, arg4);
            }
        } else if (arg5 == 1) {
            class192.method1366(arg3, arg0, 124, arg1, arg6, arg4);
        } else {
            class99.method775(arg5, (byte) 14, arg6, arg4, arg0, arg1, arg3);
        }
    }
}
