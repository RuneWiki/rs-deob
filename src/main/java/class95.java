import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class95 {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1405 = "";

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lwm;")
    public static class364 field1404;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "[I")
    public static int[] field1400;

    static {
        new class206("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class206("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 8)
    public static void method595(int arg0) {
        field1405 = null;
        field1400 = null;
        field1404 = null;
        if (arg0 != 0) {
            method595(-77);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([II[J)V", line = 24)
    public static final void method596(int[] arg0, int arg1, long[] arg2) {
        field1402++;
        class209.method1191((byte) -101, arg2, arg2.length - 1, arg0, arg1);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
    public abstract long method134(int arg0);

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public abstract void method135(int arg0);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)I")
    public abstract int method136(boolean arg0, int arg1);
}
