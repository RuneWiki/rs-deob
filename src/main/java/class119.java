import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class119 extends class101 {

    @OriginalMember(owner = "client!jja", name = "n", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!jja", name = "o", descriptor = "[Lbs;")
    public static class717[] field1726 = new class717[14];

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        this.field1725 = arg0;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field1726 = null;
        if (arg0 >= -31) {
            field1726 = null;
        }
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(III)Lie;")
    public static final class6 method988(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        return var3 == null || var3.field3280 == null ? null : var3.field3280;
    }
}
