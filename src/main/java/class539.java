import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class539 {

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public int field7530 = -1;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public int field7528;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public int field7529;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public int field7533;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public int field7534;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public int field7535;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public int field7536;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public int field7537;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field7539;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Lmo;")
    public static class695 field7531;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method3112(boolean arg0) {
        if (!arg0) {
            field7531 = null;
        }
        field7531 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILr;)V")
    public static final void method3113(int arg0, class167 arg1) {
        if (arg0 != -91) {
            field7531 = null;
        }
        field7538++;
        if (class163.field2740) {
            class562.method3189(-8059, arg1);
        } else {
            class492.method2950(arg1, 16);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(CZ)Z")
    public static final boolean method3114(char arg0, boolean arg1) {
        field7532++;
        if (arg1) {
            method3112(false);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
