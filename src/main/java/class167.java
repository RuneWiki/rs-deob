import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class167 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lml;")
    public static class160 field2967 = new class160(50);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lce;")
    public static class126 field2972 = class206.method1445(-7923, "welle2:");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lcc;")
    public static class313 field2971;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILce;Lce;ILce;)V", line = 70)
    public static final void method1221(int arg0, class126 arg1, class126 arg2, int arg3, class126 arg4) {
        field2968++;
        client.method807(arg1, arg2, arg0 ^ 0x76, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 103)
    public static void method1222(int arg0) {
        field2972 = null;
        field2967 = null;
        if (arg0 == 0) {
            field2971 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V", line = 250)
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 50) {
            method1221(62, (class126) null, (class126) null, -3, (class126) null);
        }
        if (arg1 >= class321.field5489 && arg5 <= class52.field795 && class197.field3372 <= arg0 && class194.field3302 >= arg3) {
            class45.method278(arg5, arg0, arg3, (byte) 127, arg1, arg4);
        } else {
            class251.method1697(false, arg5, arg1, arg3, arg0, arg4);
        }
        field2966++;
    }
}
