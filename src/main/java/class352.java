import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class352 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lpp;")
    public static class256 field5105 = new class256("", 17);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[Lkt;")
    public static class103[] field5107;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5106;

    static {
        new class194("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field5107 = new class103[14];
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2137(int arg0, int arg1, int arg2) {
        field5106++;
        if ((class379.field5661[1][arg2][arg0] & 0x2) == 0) {
            if (arg1 < 35) {
                method2137(-114, -85, 19);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 20)
    public static void method2138(int arg0) {
        field5107 = null;
        if (arg0 <= -9) {
            field5105 = null;
        }
    }
}
