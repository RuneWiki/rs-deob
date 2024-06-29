import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class672 extends class134 {

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field9540;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field9541;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field9538;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public int field9536;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
    public boolean field9535;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field9539;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "J")
    public static long field9537 = -1L;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lsn;")
    public static class629 field9534 = new class629("WTQA", 2);

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[I")
    public static int[] field9543 = new int[1];

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ldfa;")
    public static class165 field9542;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method3835(int arg0) {
        field9542 = null;
        field9543 = null;
        field9534 = null;
        if (arg0 >= -56) {
            field9534 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIZ)V")
    public class672(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field9540 = arg4;
        this.field9541 = arg2;
        this.field9538 = arg3;
        this.field9536 = arg1;
        this.field9535 = arg5;
        this.field9539 = arg0;
    }
}
