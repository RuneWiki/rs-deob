import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class515 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lrb;")
    public static class283 field7536 = new class283(57, 6);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lrb;")
    public static class283 field7539 = new class283(52, 2);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7540 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lkc;")
    public static class157 field7541 = new class157("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "D")
    public static double field7543 = -1.0D;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Ldk;")
    public static class421 field7535;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Leq;")
    public static class509 field7534;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[Lo;")
    public static class359[] field7542;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3047(byte arg0, String arg1) {
        field7537++;
        return arg0 > -19 ? 79 : arg1.length() + 1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method3048(int arg0) {
        field7536 = null;
        field7542 = null;
        field7535 = null;
        field7540 = null;
        field7541 = null;
        field7539 = null;
        field7534 = null;
        if (arg0 != -3) {
            method3047((byte) -43, null);
        }
    }
}
