import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class50 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lo;")
    public static class332 field725 = new class332("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Lui;")
    public static class451 field727;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lh;I)I")
    public static final int method366(class349 arg0, int arg1) {
        field724++;
        class273 var2 = arg0.field5309;
        if (var2.field4107 != null) {
            var2 = var2.method1781(class315.field4736, true);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != -1) {
            return 97;
        }
        int var3 = var2.field4109;
        class322 var4 = arg0.method1917(0);
        if (arg0.field4663) {
            var3 = var2.field4100;
        } else if (arg0.field4620 == var4.field4806 || arg0.field4620 == var4.field4817 || arg0.field4620 == var4.field4832 || arg0.field4620 == var4.field4812) {
            var3 = var2.field4108;
        } else if (arg0.field4620 == var4.field4834 || arg0.field4620 == var4.field4816 || arg0.field4620 == var4.field4800 || arg0.field4620 == var4.field4825) {
            var3 = var2.field4097;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
    public static void method367(boolean arg0) {
        if (!arg0) {
            method367(true);
        }
        field725 = null;
        field727 = null;
    }
}
