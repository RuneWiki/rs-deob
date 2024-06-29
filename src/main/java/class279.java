import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class279 {

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Lvca;")
    public static class279 field3420 = new class279();

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "Lvca;")
    public static class279 field3423 = new class279();

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "Lvca;")
    public static class279 field3424 = new class279();

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "Lvca;")
    public static class279 field3425 = new class279();

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3427 = 1339;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "[I")
    public static int[] field3426 = new int[13];

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "D")
    public static double field3428;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "Lfa;")
    public static class234 field3429;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1679(int arg0) {
        if (arg0 < 64) {
            return;
        }
        for (int var1 = 0; var1 < class97.field1020.length; var1++) {
            for (int var2 = 0; var2 < class97.field1020[var1].length; var2++) {
                class97.field1020[var1][var2] = class13.field104;
            }
        }
        field3422++;
    }

    @OriginalMember(owner = "client!vca", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field3421++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 45)
    public static void method1680(int arg0) {
        field3424 = null;
        field3423 = null;
        field3429 = null;
        field3420 = null;
        if (arg0 != 0) {
            field3423 = null;
        }
        field3425 = null;
        field3426 = null;
    }
}
