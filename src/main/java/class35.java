import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class35 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Llo;")
    public static class306 field530 = new class306("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)I")
    public abstract int method262(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)J")
    public abstract long method263(int arg0);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
    public abstract void method264(int arg0);

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
    public static void method265(int arg0) {
        if (arg0 <= -32) {
            field530 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
    public static final void method266(int arg0) {
        class29.field467 = 0;
        field531++;
        int var1 = (class302.field4850.field4716 >> 7) + class16.field181;
        int var2 = (class302.field4850.field4714 >> 7) + class455.field6794;
        if (arg0 != -3157) {
            field530 = null;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class29.field467 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class29.field467 = 1;
        }
        if (class29.field467 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class29.field467 = 0;
        }
    }
}
