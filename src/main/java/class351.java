import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class351 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public int field4648 = 2;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public int field4652 = 127;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public int field4657 = 0;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public int field4650 = 127;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Z")
    public boolean field4658 = false;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public int field4654 = 0;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Z")
    public boolean field4653 = true;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public int field4656 = 0;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "Z")
    public boolean field4669 = true;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "Z")
    public boolean field4670 = true;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
    public boolean field4663 = true;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public int field4660 = 0;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "Z")
    public boolean field4671 = false;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "Z")
    public boolean field4668 = true;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public int field4675 = 2;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public int field4649 = 0;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "Z")
    public boolean field4676 = true;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public int field4667 = 3;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public int field4674 = 0;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public int field4655 = 255;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Z")
    public boolean field4665 = true;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public int field4666 = 1;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public int field4679 = 0;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public int field4680 = 2;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "Z")
    public boolean field4682 = true;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "Z")
    public boolean field4678 = true;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Z")
    public boolean field4659 = true;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "Z")
    public boolean field4684 = true;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
    public boolean field4685 = false;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public int field4686 = 2;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
    public boolean field4687 = true;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Lsr;")
    public static class167 field4683;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
    public boolean field4651;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Z")
    public boolean field4661;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "Z")
    public boolean field4681;

    static {
        new class305("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field4683 = new class167();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 12)
    public static void method2057(int arg0) {
        if (arg0 != 127) {
            field4688 = 57;
        }
        field4683 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I", line = 60)
    public final int method2058(int arg0, int arg1) {
        field4672++;
        if (arg1 != 1) {
            this.field4666 = 38;
        }
        return arg0 == 1 || arg0 == 3 ? this.field4680 : this.field4660;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZB)V", line = 120)
    public final void method2059(int arg0, boolean arg1, byte arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field4681 = arg1;
        } else {
            this.field4661 = arg1;
        }
        field4677++;
        int var4 = -37 % ((62 - arg2) / 40);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIB)V", line = 145)
    public final void method2060(int arg0, int arg1, byte arg2) {
        if (arg2 > -48) {
            this.method2061((byte) -26, 67);
        }
        if (arg0 == 1 || arg0 == 3) {
            this.field4680 = arg1;
        } else {
            this.field4660 = arg1;
        }
        field4664++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)Z", line = 160)
    public final boolean method2061(byte arg0, int arg1) {
        if (arg0 <= 83) {
            this.field4670 = false;
        }
        field4673++;
        return arg1 == 1 || arg1 == 3 ? this.field4681 : this.field4661;
    }
}
