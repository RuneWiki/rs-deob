import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class31 extends class372 {

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "Lnj;")
    public static class415 field466 = new class415(24, 2);

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 10)
    public static void method256(int arg0) {
        field466 = null;
        if (arg0 != 0) {
            method257(-58, 70, -71, 112, 71);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg1) {
            class349.method2008(arg3, (byte) 20, class213.field2746[arg4], arg1, arg0);
        } else {
            class349.method2008(arg1, (byte) 92, class213.field2746[arg4], arg3, arg0);
        }
        if (arg2 == -1) {
            field468++;
        }
    }
}
