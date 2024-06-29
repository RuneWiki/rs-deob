import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class374 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lqe;")
    public static class469 field5679 = new class469(16, 7);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "[Lvs;")
    public static class593[] field5677;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 10)
    public static void method2426(byte arg0) {
        if (arg0 > 67) {
            field5677 = null;
            field5679 = null;
        }
    }
}
