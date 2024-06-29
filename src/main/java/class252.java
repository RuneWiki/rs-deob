import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class252 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lkda;")
    public static class328 field3643;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 5)
    public static void method1626(int arg0) {
        field3643 = null;
        int var1 = 37 % ((arg0 + 5) / 63);
    }
}
