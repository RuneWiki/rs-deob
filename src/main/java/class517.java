import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class517 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lcb;")
    private class544 field7389;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[[Z")
    public static boolean[][] field7394 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field7393 = 328;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method3011(int arg0) {
        field7394 = null;
        if (arg0 != 328) {
            method3012(127, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class517(class106 arg0, int arg1, class544 arg2) {
        new class387(64);
        this.field7389 = arg2;
        this.field7390 = this.field7389.method3147(15, -65);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
    public static final int method3012(int arg0, byte arg1) {
        field7392++;
        if (arg1 >= -112) {
            field7394 = null;
        }
        return arg0 >> 11 & 0x7F;
    }
}
