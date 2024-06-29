import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class263 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public static int[] field3648 = new int[1];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Z")
    public static boolean field3653 = true;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
    public static int[] field3652 = new int[25];

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Z")
    public static boolean field3656 = false;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[Lkq;")
    public static class555[] field3647;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Lol;")
    public final class263 method1608(boolean arg0, int arg1) {
        field3654++;
        return arg0 ? new class263(this.field3655, arg1, this.field3649, this.field3650) : null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1609(int arg0) {
        if (arg0 != 25) {
            method1609(94);
        }
        field3648 = null;
        field3652 = null;
        field3647 = null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIII)V")
    public class263(int arg0, int arg1, int arg2, int arg3) {
        this.field3649 = arg2;
        this.field3650 = arg3;
        this.field3651 = arg1;
        this.field3655 = arg0;
    }
}
