import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class170 extends class494 {

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lft;")
    public static class4 field2648;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "C")
    public char field2643;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "J")
    public long field2644;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lkg;")
    public class170 field2637;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Z")
    public boolean field2634;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)J")
    public final long method1066(int arg0) {
        field2638++;
        return arg0 == -8934 ? this.field2644 : 30L;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)C")
    public final char method1067(int arg0) {
        field2645++;
        if (arg0 != -1) {
            field2646 = 11;
        }
        return this.field2643;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z")
    public final boolean method1068(boolean arg0) {
        field2649++;
        if (arg0) {
            this.field2640 = 111;
        }
        return this.field2634;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[ILbl;IZI)Ljs;")
    public static final class208 method1069(int arg0, int[] arg1, class442 arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 != 0) {
            return null;
        }
        field2641++;
        if (!arg2.field6727 && (!class110.method789(arg3, 1135345664) || !class110.method789(arg5, 1135345664))) {
            return arg2.field6713 ? new class208(arg2, 34037, arg3, arg5, arg4, arg1) : new class208(arg2, arg3, arg5, class99.method749(arg3, arg0 ^ 0xFFFFA2C6), class99.method749(arg5, -23866), arg1);
        } else {
            return new class208(arg2, 3553, arg3, arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static void method1070(int arg0) {
        field2648 = null;
        if (arg0 != 21695) {
            field2647 = -22;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I")
    public final int method1071(int arg0) {
        field2635++;
        int var2 = 114 % ((-arg0 - 15) / 55);
        return this.field2636;
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V")
    public static final void method1072(int arg0) {
        if (arg0 < 6) {
            field2651 = -73;
        }
        if (class427.field6240 != -1) {
            class65.method450(class427.field6240, false, -1, 70, -1);
            class427.field6240 = -1;
        }
        field2642++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
    public final int method1073(int arg0) {
        if (arg0 >= -38) {
            return -74;
        } else {
            field2639++;
            return this.field2640;
        }
    }

    static {
        new class423("Select", "Auswählen", "Sélectionner", "Selecionar");
        field2648 = new class4();
        new class423("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field2651 = 0;
        field2650 = 0;
        field2653 = 0;
    }
}
