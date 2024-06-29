import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class397 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "J")
    public static long field5620;

    static {
        new class530("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhm;I)Lhm;", line = 10)
    public static final class150 method2304(class150 arg0, int arg1) {
        field5619++;
        class150 var2 = client.method1295(arg0);
        if (arg1 != -8896) {
            method2304(null, -2);
        }
        if (var2 == null) {
            var2 = arg0.field2040;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method736(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lvv;")
    public abstract class217 method743(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
    public abstract void method733(int arg0, byte arg1);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)I")
    public abstract int method744(int arg0, byte arg1);
}
