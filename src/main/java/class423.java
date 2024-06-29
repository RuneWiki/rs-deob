import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class423 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lap;")
    public static class335 field5987 = new class335("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lap;")
    public static class335 field5988 = new class335("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[Lrh;")
    public static class174[] field5989 = new class174[16];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILqn;)Lmq;", line = 10)
    public static final class353 method2482(int arg0, int arg1, class47 arg2) {
        int var3 = 103 / ((-arg1 - 36) / 56);
        field5986++;
        byte[] var4 = arg2.method457(arg0, -108);
        return var4 == null ? null : new class353(var4);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 25)
    public static void method2483(int arg0) {
        field5988 = null;
        if (arg0 == 0) {
            field5989 = null;
            field5987 = null;
        }
    }
}
