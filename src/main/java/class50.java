import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class50 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lfa;")
    public static class524 field504;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lf;")
    public static class534 field508;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[Lf;")
    public static class534[] field505;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[Lru;")
    public static class499[][][] field506;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        field506 = null;
        field508 = null;
        if (arg0 == -20360) {
            field505 = null;
            field504 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lwp;I)Lwp;")
    public static final class452 method262(class452 arg0, int arg1) {
        field509++;
        class452 var2 = client.method3760(arg0);
        int var3 = -101 % ((4 - arg1) / 40);
        if (var2 == null) {
            var2 = arg0.field6343;
        }
        return var2;
    }
}
