import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class61 {

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[Z")
    public static boolean[] field909 = new boolean[100];

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lgn;")
    public static class475 field908 = new class475(41, 3);

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "F")
    public static float field910;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 4)
    public static void method435(int arg0) {
        field908 = null;
        if (arg0 != 100) {
            method436(null, null, (byte) 124);
        }
        field909 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 15)
    public static final void method436(int[] arg0, Object[] arg1, byte arg2) {
        class198.method1235(120, 0, arg0, arg1, arg0.length - 1);
        if (arg2 < -10) {
            field911++;
        }
    }
}
