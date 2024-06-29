import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class517 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field7509 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field7512 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field7513 = -1;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lpu;")
    public static class179 field7510 = new class179(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lpu;")
    public static class179 field7514 = new class179("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[J")
    public static long[] field7517 = new long[32];

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field7518 = 2;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lc;")
    public static class517 field7515;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z", line = 19)
    public static final boolean method3055(byte arg0, int arg1, int arg2) {
        field7511++;
        int var3 = 97 / ((-arg0 - 70) / 50);
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 36)
    public static void method3056(int arg0) {
        field7510 = null;
        field7517 = null;
        field7514 = null;
        if (arg0 == 0) {
            field7515 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IC)Z", line = 52)
    public static final boolean method3057(int arg0, char arg1) {
        field7508++;
        if (arg0 >= -126) {
            field7512 = -91;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method962(class517 arg0);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method963(int arg0);

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method958(int[] arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method959(int arg0);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method964();

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method957(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method960(int arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method954(int arg0);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method951(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method961(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method965(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class517 method950();

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method952(int arg0);
}
