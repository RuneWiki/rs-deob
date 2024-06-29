import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class262 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[Lfk;")
    public static class393[] field3740 = new class393[5];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lwq;")
    public static class92 field3741;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ltq;")
    public static class376 field3742;

    static {
        for (int var0 = 0; var0 < field3740.length; var0++) {
            field3740[var0] = new class393();
        }
        field3741 = new class92();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 3)
    public static void method1750(byte arg0) {
        field3741 = null;
        field3742 = null;
        if (arg0 > -107) {
            field3741 = null;
        }
        field3740 = null;
    }
}
