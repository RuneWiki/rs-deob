import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class490 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lwba;")
    public static class46 field6944 = new class46();

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Ldg;")
    public static class376 field6946 = new class376(63, 0);

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)J")
    public static final synchronized long method2840(boolean arg0) {
        if (!arg0) {
            field6946 = null;
        }
        field6945++;
        long var1 = System.currentTimeMillis();
        if (var1 < class89.field1488) {
            class473.field6761 += class89.field1488 - var1;
        }
        class89.field1488 = var1;
        return var1 + class473.field6761;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2841(int arg0) {
        field6946 = null;
        if (arg0 == 0) {
            field6944 = null;
        }
    }
}
