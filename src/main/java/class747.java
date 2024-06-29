import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class747 {

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Z")
    public static boolean field10301 = true;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field10302 = 0;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "[[[Ljd;")
    public static class243[][][] field10304;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "([[IB)V")
    public static final void method4130(int[][] arg0, byte arg1) {
        class785.field10808 = arg0;
        int var2 = -89 % ((26 - arg1) / 38);
        field10303++;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
    public static void method4131(int arg0) {
        if (arg0 != 0) {
            field10301 = true;
        }
        field10304 = null;
    }
}
