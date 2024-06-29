import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class312 extends class455 {

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Lee;")
    public static class480 field4691 = null;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "[I")
    public static int[] field4694;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V", line = 3)
    public static void method1994(int arg0) {
        field4694 = null;
        if (arg0 != -25335) {
            field4696 = -40;
        }
        field4691 = null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIII)V", line = 27)
    public class312(int arg0, int arg1, int arg2, int arg3) {
        this.field4693 = arg0;
        this.field4695 = arg2;
        this.field4697 = arg1;
        this.field4692 = arg3;
    }
}
