import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class281 extends class181 {

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field4967 = -1;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lp;")
    public static class82 field4966;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[Lb;")
    public static class49[] field4969;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)Z")
    public abstract boolean method1472(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method1471(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method1917(byte arg0) {
        field4969 = null;
        field4966 = null;
        int var1 = -52 / ((55 - arg0) / 44);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method1918(int arg0, int arg1) {
        class198 var2 = class153.field2896[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class198 var4 = class153.field2896[var3][arg0][arg1] = class153.field2896[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3642--;
                for (int var5 = 0; var5 < var4.field3627; var5++) {
                    class49 var6 = var4.field3646[var5];
                    if ((var6.field802 >> 29 & 0x3L) == 2L && var6.field816 == arg0 && var6.field796 == arg1) {
                        var6.field805--;
                    }
                }
            }
        }
        if (class153.field2896[0][arg0][arg1] == null) {
            class153.field2896[0][arg0][arg1] = new class198(0, arg0, arg1);
        }
        class153.field2896[0][arg0][arg1].field3634 = var2;
        class153.field2896[3][arg0][arg1] = null;
    }
}
