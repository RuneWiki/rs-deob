import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class659 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lpw;")
    public static class661 field8943 = new class661("", 15);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lhm;")
    public static class208 field8944 = new class208(64);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lws;")
    public static class333 field8945 = new class333();

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 9)
    public static void method3676(int arg0) {
        if (arg0 != 128) {
            field8945 = null;
        }
        field8944 = null;
        field8945 = null;
        field8943 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V", line = 25)
    public static final void method3677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class352 var7 = new class352();
        var7.field4556 = arg1 >> class480.field5972;
        var7.field4546 = arg2 >> class480.field5972;
        var7.field4563 = arg3 >> class480.field5972;
        var7.field4544 = arg4 >> class480.field5972;
        var7.field4555 = arg0;
        var7.field4553 = arg1;
        var7.field4561 = arg2;
        var7.field4552 = arg3;
        var7.field4551 = arg4;
        var7.field4541 = arg5;
        var7.field4558 = arg6;
        class290.field3670[class370.field4782++] = var7;
    }
}
