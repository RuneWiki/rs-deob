import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class216 extends class251 {

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lpu;")
    public class378 field3336;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lsk;")
    public static class423 field3338 = new class423("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[[B")
    public static byte[][] field3335;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method1328(byte arg0) {
        field3339++;
        int var1 = 0;
        if (arg0 != -72) {
            return;
        }
        while (var1 < class152.field2427.length) {
            for (int var2 = 0; var2 < class152.field2427[var1].length; var2++) {
                class152.field2427[var1][var2] = class487.field7412;
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public static void method1329(byte arg0) {
        if (arg0 <= -92) {
            field3338 = null;
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public static final void method1330(boolean arg0) {
        field3337++;
        class279.field4243 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lpu;)V")
    public class216(class378 arg0) {
        this.field3336 = arg0;
    }
}
