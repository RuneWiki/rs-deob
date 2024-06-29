import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class274 extends class444 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lmg;")
    public static class101 field3763;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        if (arg0 != -75) {
            method1627((byte) 43);
        }
        field3763 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lvg;")
    public abstract class39 method1628(int arg0);

    static {
        new class466("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field3764 = 0;
    }
}
