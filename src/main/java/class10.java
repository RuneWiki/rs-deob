import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 extends class121 {

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Lqp;")
    public static class586 field82 = new class586(87, 5);

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "[Ljc;")
    public static class585[] field94;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "[[Z")
    public static boolean[][] field93;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "Ldda;")
    public static class597 field95;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Ljava/lang/String;")
    public String field83;

    static {
        new class487("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field94 = new class585[50];
        field93 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 7)
    public static void method48(int arg0) {
        field93 = null;
        field82 = null;
        field94 = null;
        if (arg0 != 50) {
            method48(30);
        }
        field95 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method49(boolean arg0) {
        field84++;
        class293.field4302 = null;
        if (!arg0) {
            method49(true);
        }
        class117.field1529 = -1;
    }
}
