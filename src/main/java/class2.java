import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "[Lgw;")
    public static class154[] field7;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "[Lqga;")
    public static class168[] field6;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method2(byte arg0) {
        field6 = null;
        if (arg0 <= 101) {
            method2((byte) 113);
        }
        field7 = null;
    }
}
