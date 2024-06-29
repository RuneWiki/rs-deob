import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class674 extends class504 {

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public int field9530;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
    public boolean field9532;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public int field9533;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public int field9539;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field9531;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field9536;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Lgj;")
    public static class593 field9534 = new class593();

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "Z")
    public static boolean field9538 = false;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "Lgr;")
    public static class404 field9537;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static void method3769(byte arg0) {
        field9534 = null;
        if (arg0 < 49) {
            field9534 = null;
        }
        field9537 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class674(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field9530 = arg4;
        this.field9532 = arg5;
        this.field9533 = arg2;
        this.field9539 = arg0;
        this.field9531 = arg3;
        this.field9536 = arg1;
    }
}
