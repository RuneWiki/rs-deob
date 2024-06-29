import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class498 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lpk;")
    public static class133 field7394 = new class133();

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    public static int[] field7401;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[F")
    public static float[] field7405;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Let;")
    public static class419 field7404;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field7402;

    static {
        new class331("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field7401 = new int[99];
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field7401[var1] = var0 / 4;
        }
        field7405 = new float[4];
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Liv;B)V", line = 11)
    public final void method2989(class65 arg0, byte arg1) {
        field7398++;
        while (true) {
            int var3 = arg0.method577(arg1 ^ 0xFFFFFF18);
            if (var3 == 0) {
                if (arg1 == -25) {
                    return;
                } else {
                    field7402 = null;
                    return;
                }
            }
            this.method2992(var3, arg0, 15902);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Lkf;", line = 33)
    public static final class166 method2990(int arg0, byte arg1) {
        field7399++;
        int var2 = 91 / ((-arg1 - 85) / 36);
        return class194.field2830 && arg0 >= class53.field581 && arg0 <= class425.field6283 ? class291.field4182[arg0 - class53.field581] : null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 46)
    public static void method2991(int arg0) {
        field7405 = null;
        if (arg0 == 1) {
            field7401 = null;
            field7402 = null;
            field7394 = null;
            field7404 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILiv;I)V", line = 65)
    private final void method2992(int arg0, class65 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7395 = arg1.method623((byte) -91);
            this.field7400 = arg1.method577(255);
            this.field7396 = arg1.method577(255);
        }
        field7397++;
        if (arg2 != 15902) {
            field7403 = -77;
        }
    }
}
