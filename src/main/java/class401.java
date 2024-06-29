import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class401 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field5554 = -1;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lhc;")
    public static class368 field5555 = new class368("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lmc;")
    public class318 field5557;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    public int[] field5556;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field5552;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2485(int arg0, int arg1, int arg2) {
        field5553++;
        class26 var3 = class217.method1445(true, 0, 15);
        var3.method158(28194);
        int var4 = 87 % ((arg0 - 25) / 54);
        var3.field339 = arg1;
        var3.field341 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 20)
    public static void method2486(byte arg0) {
        field5555 = null;
        if (arg0 >= -117) {
            field5555 = null;
        }
    }
}
