import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class76 {

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lff;")
    public static class9 field1131 = new class9(6, 10);

    @OriginalMember(owner = "client!co", name = "h", descriptor = "[Los;")
    public static class305[] field1133;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lff;")
    public static class9 field1134;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "[I")
    public static int[] field1132;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lmd;BI)V")
    private final void method485(class379 arg0, byte arg1, int arg2) {
        field1127++;
        if (arg1 < 36) {
            field1134 = null;
        }
        if (arg2 == 1) {
            this.field1130 = arg0.method2212((byte) 83);
            this.field1128 = arg0.method2238(255);
            this.field1129 = arg0.method2238(255);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lmd;I)V")
    public final void method486(class379 arg0, int arg1) {
        field1126++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2238(arg1 ^ 0xFF);
            if (var3 == 0) {
                return;
            }
            this.method485(arg0, (byte) 62, var3);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1134 = null;
        field1133 = null;
        field1131 = null;
        if (arg0 != -2) {
            method487(85);
        }
        field1132 = null;
    }

    static {
        new class304("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field1133 = new class305[5];
        for (int var0 = 0; var0 < field1133.length; var0++) {
            field1133[var0] = new class305();
        }
        field1134 = new class9(47, 5);
    }
}
