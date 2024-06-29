import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class443 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field6673;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[[[Lsn;")
    public static class452[][][] field6672;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ[BI)V")
    public abstract void method1936(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BIII)I")
    public abstract int method1931(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public abstract void method1934(byte arg0);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method2691(byte arg0) {
        field6672 = null;
        field6673 = null;
        if (arg0 <= 0) {
            field6673 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILkr;Lkr;)V")
    public static final void method2692(int arg0, int arg1, int arg2, class535 arg3, class535 arg4) {
        class452 var5 = class2.method8(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6812 = arg3;
            var5.field6797 = arg4;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public abstract void method1935(int arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1929(byte arg0, int arg1) throws IOException;

    static {
        new class446("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        new class446("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6673 = new int[32];
    }
}
