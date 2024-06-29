import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class470 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lgn;")
    public static class529 field6783 = new class529("runescape", 0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method2773(int arg0) {
        field6783 = null;
        if (arg0 != -13768) {
            method2774(-26, -63, -61, 83, -65);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2774(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6782++;
        if ((class548.field8052[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class548.field8052[arg4][arg0][arg2] & 0x10) == 0) {
            int var5 = -116 % ((-arg1 - 56) / 59);
            return class251.method1603(arg4, (byte) 111, arg2, arg0) == arg3;
        } else {
            return false;
        }
    }
}
