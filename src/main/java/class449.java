import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class449 extends class550 {

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field6572;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field6570;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    private int field6578;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[Z")
    public static boolean[] field6575 = new boolean[8];

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lqu;")
    public static class364 field6571 = new class364(67, -1);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lnj;")
    public static class487 field6579 = new class487(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field6577;

    static {
        new class487("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIII)V", line = 7)
    public class449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6569 = arg1;
        this.field6572 = arg3;
        this.field6570 = arg0;
        this.field6578 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 19)
    public static void method2717(byte arg0) {
        field6575 = null;
        field6571 = null;
        int var1 = -120 / ((37 - arg0) / 36);
        field6579 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZII)V", line = 32)
    public final void method647(boolean arg0, int arg1, int arg2) {
        ++field6577;
        if (arg0) {
            field6579 = null;
        }
        int var4 = this.field6570 * arg1 >> 12;
        int var5 = this.field6578 * arg1 >> 12;
        int var6 = this.field6569 * arg2 >> 12;
        int var7 = this.field6572 * arg2 >> 12;
        class171.method1089(var6, super.field8195, var4, 5000, var7, var5);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 52)
    public static final void method2718(boolean arg0) {
        class347.field5057 = new class548(class264.field3923.method2953(3181, class77.field889), "", class362.field5233, 1012, -1, 0L, 0, 0, arg0, false);
        ++field6573;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IBI)V", line = 62)
    public final void method646(int arg0, byte arg1, int arg2) {
        ++field6574;
        int var4 = 67 % ((62 - arg1) / 38);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V", line = 80)
    public final void method648(int arg0, byte arg1, int arg2) {
        ++field6576;
        if (arg1 > -25) {
            this.method648(-70, (byte) 93, -60);
        }
    }
}
