import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class297 {

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "[Llm;")
    public static class461[] field4447 = new class461[4];

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "Ldg;")
    public static class376 field4446 = new class376(76, 7);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIZ)Lpu;", line = 3)
    public static final class522 method1920(int arg0, int arg1, int arg2, boolean arg3) {
        field4445++;
        class691 var4 = null;
        if (class356.field5111 != null) {
            var4 = new class691(arg0, class356.field5111, class95.field1503[arg0], 1000000);
        }
        class174.field2480[arg0] = class235.field3641.method1267(-121, arg0, class547.field7692, var4);
        if (arg1 == 1000000) {
            class174.field2480[arg0].method821(true);
            return new class522(class174.field2480[arg0], arg3, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V", line = 27)
    public static void method1921(int arg0) {
        field4446 = null;
        field4447 = null;
        if (arg0 != 7) {
            field4447 = null;
        }
    }
}
