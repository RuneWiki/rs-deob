import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class619 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public int field9138 = 2048;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public int field9141 = 2048;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public int field9144 = 0;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public int field9142 = 0;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Lpw;")
    public static class606 field9140 = new class606();

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "[I")
    public static int[] field9146;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "[I")
    public static int[] field9145;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field9147;

    static {
        new class572("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field9146 = new int[32];
        field9145 = new int[8];
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 6)
    public static void method3623(int arg0) {
        field9140 = null;
        if (arg0 == -2) {
            field9145 = null;
            field9146 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILgw;B)V", line = 21)
    private final void method3624(int arg0, class148 arg1, byte arg2) {
        if (arg2 != 37) {
            this.field9144 = 65;
        }
        if (arg0 == 1) {
            this.field9144 = arg1.method1032((byte) -33);
        } else if (arg0 == 2) {
            this.field9138 = arg1.method1045(true);
        } else if (arg0 == 3) {
            this.field9141 = arg1.method1045(true);
        } else if (arg0 == 4) {
            this.field9142 = arg1.method1047(0);
        }
        field9143++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLgw;)V", line = 57)
    public final void method3625(byte arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                field9147++;
                if (arg0 != -111) {
                    field9146 = null;
                    return;
                }
                return;
            }
            this.method3624(var3, arg1, (byte) 37);
        }
    }
}
