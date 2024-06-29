import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class614 extends class756 {

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "Ljw;")
    public static class581 field8315 = new class581(120, 6);

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method3385(byte arg0) {
        field8315 = null;
        if (arg0 >= -73) {
            field8315 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Laj;Laj;Lfl;)V")
    public class614(class333 arg0, class333 arg1, class770 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIII)V")
    public final void method3386(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field8316;
        int var6 = super.field10492.method1096();
        int var7 = ((class770) super.field10222).field10600 * class438.method2638(13363) / 10 % var6;
        if (!arg1) {
            field8315 = null;
        }
        super.field10492.method1111(-var6 + arg3 - -var7, arg2, arg0 + var6 + -var7, arg4);
    }
}
