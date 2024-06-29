import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class449 {

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "[C")
    public static char[] field6538 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lpca;")
    public static class362 field6540 = new class362();

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Lbv;")
    public static class567 field6542 = new class567("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "[Lha;")
    public static class116[] field6543;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILjava/net/Socket;)Lcw;", line = 14)
    public static final class471 method2656(int arg0, int arg1, Socket arg2) throws IOException {
        field6537++;
        return arg1 == 95 ? new class638(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 25)
    public static void method2657(int arg0) {
        field6540 = null;
        if (arg0 > 1) {
            field6543 = null;
            field6538 = null;
            field6542 = null;
        }
    }
}
