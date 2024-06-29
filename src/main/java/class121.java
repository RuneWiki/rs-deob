import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class121 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field1673;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "F")
    public static float field1672;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field1671;

    static {
        new class332("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field1674 = 0;
        field1673 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 4)
    public static final void method853(int arg0, int arg1) {
        class337 var2 = class170.field2427[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class337 var4 = class170.field2427[var3][arg0][arg1] = class170.field2427[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5064--;
                for (class448 var5 = var4.field5054; var5 != null; var5 = var5.field6340) {
                    class305 var6 = var5.field6343;
                    if (var6.field4542 == arg0 && var6.field4547 == arg1) {
                        var6.field4545--;
                    }
                }
            }
        }
        if (class170.field2427[0][arg0][arg1] == null) {
            class170.field2427[0][arg0][arg1] = new class337(0, arg0, arg1);
            class170.field2427[0][arg0][arg1].field5051 = 1;
        }
        class170.field2427[0][arg0][arg1].field5062 = var2;
        class170.field2427[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 52)
    public static void method854(boolean arg0) {
        if (!arg0) {
            field1672 = -0.38527846F;
        }
        field1673 = null;
    }
}
