import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class470 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Z")
    public static boolean field6790 = false;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field6793 = 0;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[[Z")
    public static boolean[][] field6796 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field6791;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field6797;

    static {
        new class194("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 16)
    public static void method2750(boolean arg0) {
        field6796 = null;
        if (arg0) {
            field6796 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILae;)V", line = 27)
    private final void method2751(int arg0, int arg1, class156 arg2) {
        field6797++;
        if (arg0 == arg1) {
            this.field6794 = arg2.method993((byte) -44);
            this.field6791 = arg2.method941((byte) 127);
            this.field6795 = arg2.method941((byte) 123);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILae;)V", line = 48)
    public final void method2752(int arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 127);
            if (var3 == 0) {
                if (arg0 >= -54) {
                    field6793 = 118;
                }
                field6792++;
                return;
            }
            this.method2751(1, var3, arg1);
        }
    }
}
