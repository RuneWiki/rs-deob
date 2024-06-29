import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class681 {

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public int field9612 = 0;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field9608 = 0;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "Z")
    public static boolean field9611 = false;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "Ldg;")
    public static class376 field9609 = new class376(47, 3);

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "F")
    public static float field9613;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILmo;I)V", line = 3)
    private final void method3771(int arg0, class695 arg1, int arg2) {
        int var4 = -13 / ((arg2 - 25) / 34);
        field9610++;
        if (arg0 == 5) {
            this.field9612 = arg1.method3847((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V", line = 30)
    public static void method3772(byte arg0) {
        if (arg0 <= 24) {
            field9611 = true;
        }
        field9609 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILmo;)V", line = 49)
    public final void method3773(int arg0, class695 arg1) {
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                if (arg0 != -9879) {
                    return;
                }
                field9607++;
                return;
            }
            this.method3771(var3, arg1, 119);
        }
    }
}
