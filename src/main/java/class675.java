import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class675 extends class618 {

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Z")
    public static boolean field9535;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Ltm;")
    public static class334 field9536;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field9534;

    static {
        new class685("", 76);
        field9535 = true;
        field9536 = new class334(107, 0);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3765(boolean arg0) {
        if (arg0) {
            field9536 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)I", line = 13)
    public static final int method3766(int arg0, int arg1) {
        return class487.field7049 == null ? 0 : class487.field7049[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z", line = 16)
    public static final boolean method3767(byte arg0, int arg1, int arg2) {
        field9534++;
        if (arg0 != -18) {
            field9535 = true;
        }
        return class4.method15(arg1, arg2, true) | (arg1 & 0x70000) != 0 || class461.method2827(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V", line = 30)
    public static final void method3768(int arg0, int arg1) {
        field9533++;
        class118 var2 = class86.method755(true, 7, arg1);
        var2.method936(arg0 ^ arg0);
    }
}
