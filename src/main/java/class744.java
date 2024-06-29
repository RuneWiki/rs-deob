import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class744 {

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "[I")
    public static int[] field10273 = new int[1024];

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "F")
    public static float field10274;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Lir;")
    public static class28 field10271;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "Lgj;")
    public static class662 field10270;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "()V", line = 6)
    public static final void method4128() {
        class286.method1829(1, class62.field856);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 9)
    public static void method4129(int arg0) {
        field10271 = null;
        field10273 = null;
        field10270 = null;
        if (arg0 != 1) {
            method4129(84);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V", line = 25)
    public static final void method4130(byte arg0) {
        if (arg0 != 22) {
            field10273 = null;
        }
        field10272++;
        if (class215.field3195 == 1 || class215.field3195 == 3 || class712.field9804 != class215.field3195 && (class215.field3195 == 0 || class712.field9804 == 0)) {
            class406.field5583 = 0;
            class610.field8520 = 0;
            class664.field9216.method338((byte) -71);
        }
        class712.field9804 = class215.field3195;
    }
}
