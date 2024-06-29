import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class589 {

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Lkca;")
    public static class73 field8471 = new class73(76, 8);

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lea;")
    public static class474 field8472 = new class474("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public int field8466;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    private int field8467;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public int field8469;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "Lff;")
    public class9 field8470;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lrt;I)V")
    public final void method3438(class194 arg0, int arg1) {
        int var3 = -80 / ((arg1 - 45) / 38);
        while (true) {
            int var4 = arg0.method1177(255);
            if (var4 == 0) {
                field8464++;
                return;
            }
            this.method3439(arg0, var4, true);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lrt;IZ)V")
    private final void method3439(class194 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field8467 = arg0.method1220(-115);
        } else if (arg1 == 2) {
            this.field8466 = arg0.method1177(255);
            this.field8469 = arg0.method1177(255);
        }
        field8468++;
        if (!arg2) {
            field8471 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static void method3440(byte arg0) {
        field8471 = null;
        field8472 = null;
        int var1 = 20 % ((arg0 - 6) / 58);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Laf;")
    public final synchronized class372 method3441(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field8465++;
        class372 var2 = (class372) this.field8470.field79.method1801(0, (long) this.field8467);
        if (var2 != null) {
            return var2;
        }
        class372 var3 = class372.method2398(this.field8470.field73, this.field8467, 0);
        if (var3 != null) {
            this.field8470.field79.method1808((long) this.field8467, var3, (byte) -90);
        }
        return var3;
    }
}
