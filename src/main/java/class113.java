import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class113 {

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Lwq;")
    public class113 field1793;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "Lia;")
    public class413 field1799;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1786 = 0;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
    public static int[] field1798;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[Lf;")
    public static class528[] field1797;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method834(byte arg0) {
        field1798 = null;
        field1797 = null;
        if (arg0 > -68) {
            field1798 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
    public static final void method835(byte arg0, short[] arg1, String[] arg2) {
        if (arg0 > -63) {
            field1800 = 46;
        }
        field1801++;
        class402.method2498(arg1, 1, arg2, arg2.length - 1, 0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static final void method836(int arg0) {
        if (class17.field266 == arg0) {
            class138.method1022(28, 1);
        }
        field1791++;
        if (class17.field266 == 30) {
            class138.method1022(25, arg0 - 9);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)Lwq;")
    public final class113 method837(int arg0, boolean arg1) {
        field1794++;
        if (!arg1) {
            field1786 = -106;
        }
        return new class113(this.field1795, arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
    public static int method838(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Law;")
    public final class53 method839(byte arg0) {
        if (arg0 != 48) {
            this.method837(-106, false);
        }
        field1789++;
        return class118.method862(arg0 ^ 0xFFFFFFCD, this.field1795);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
    public class113(int arg0, int arg1) {
        this.field1795 = arg0;
        this.field1792 = arg1;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lwq;I)V")
    public class113(class113 arg0, int arg1) {
        this.field1793 = arg0;
        this.field1795 = this.field1793.field1795;
        this.field1799 = this.field1793.field1799;
        this.field1792 = this.field1793.field1792 + arg1;
    }

    static {
        new class180(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field1796 = 0;
        field1798 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        new class180("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
