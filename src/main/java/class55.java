import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class55 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lwj;")
    public static class270 field659 = new class270(19, -2);

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Z")
    public static boolean field663;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[[F")
    public static float[][] field664;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lrs;")
    public static class461 field661;

    @OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field658++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field661 = null;
        field659 = null;
        field664 = null;
        if (arg0 != 91) {
            method467((byte) 6);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZILef;IB[BII)Ltq;")
    public static final class442 method468(boolean arg0, int arg1, class338 arg2, int arg3, byte arg4, byte[] arg5, int arg6, int arg7) {
        if (arg4 != 38) {
            field663 = true;
        }
        field656++;
        if (!arg2.field4864 && (!class226.method1402(arg3, (byte) -116) || !class226.method1402(arg1, (byte) -114))) {
            return arg2.field4842 ? new class442(arg2, 34037, arg7, arg3, arg1, arg0, arg5, arg6) : new class442(arg2, arg7, arg3, arg1, class508.method3034(arg3, true), class508.method3034(arg1, true), arg5, arg6);
        } else {
            return new class442(arg2, 3553, arg7, arg3, arg1, arg0, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIII)V")
    public class55(int arg0, int arg1, int arg2, int arg3) {
        this.field655 = arg0;
        this.field662 = arg3;
        this.field660 = arg1;
        this.field657 = arg2;
    }

    static {
        new class466("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field663 = false;
        field664 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
    }
}
