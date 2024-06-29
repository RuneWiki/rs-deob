import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class447 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] field6336 = new int[8];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lo;")
    public static class332 field6333 = new class332("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[Lf;")
    public static class379[] field6338 = new class379[6];

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lns;")
    public class57 field6334;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lfq;")
    public class87 field6337;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2644(int arg0) {
        if (arg0 != 8) {
            method2645((class446) null, (byte) 100);
        }
        field6336 = null;
        field6333 = null;
        field6338 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lre;B)Lie;")
    public static final class82 method2645(class446 arg0, byte arg1) {
        if (arg1 != -18) {
            method2644(-118);
        }
        field6335++;
        return new class82(arg0.method2634(-65), arg0.method2634(113), arg0.method2634(113), arg0.method2634(123), arg0.method2613(-25778), arg0.method2613(arg1 - 25760), arg0.method2628(arg1 ^ 0xFFFF3FEE));
    }
}
