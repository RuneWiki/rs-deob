import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class40 extends class36 {

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
    public static int field590 = -1;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!vba", name = "C", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "[I")
    public static int[] field592;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        ++field589;
        super.field531 = arg0;
        if (arg3 != -17180) {
            field590 = -28;
        }
        super.field533 = arg1;
        super.field535 = arg2;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(FI)V")
    public final void method138(float arg0, int arg1) {
        if (arg1 != -2) {
            method363((byte) 81);
        }
        ++field588;
        super.field538 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)V")
    public static void method363(byte arg0) {
        if (arg0 >= -30) {
            field591 = 32;
        }
        field592 = null;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(IIIIIF)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
