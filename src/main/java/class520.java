import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class520 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "[I")
    public static int[] field7660 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Lho;")
    public static class103 field7659 = new class103(4, -1);

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Z")
    public static boolean field7664 = false;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Ljc;")
    public static class305 field7662 = new class305("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 9)
    public static void method3104(int arg0) {
        field7659 = null;
        field7662 = null;
        if (arg0 == -26274) {
            field7660 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method3105(int arg0, int arg1) {
        field7657++;
        if (arg0 != -24668) {
            method3104(-108);
        }
        return arg1 == 6 || arg1 == 8;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1986(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1985(int arg0);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([BZ)V")
    public abstract void method1984(byte[] arg0, boolean arg1);
}
