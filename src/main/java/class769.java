import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class769 extends class159 {

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lqw;")
    public class84 field10592 = new class84();

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lqw;")
    public static class84 field10591 = new class84();

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field10593;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIBI)Z", line = 3)
    public static final boolean method4235(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field10593++;
        if (!class14.field144 || !class717.field9767) {
            return false;
        } else if (class267.field3915 < 100) {
            return false;
        } else if (class482.method2835(-54, arg0, arg1, arg4)) {
            int var5 = arg1 << class478.field6717;
            if (arg3 <= 56) {
                return true;
            }
            int var6 = arg4 << class478.field6717;
            if (class776.method4269(var6, arg2, class645.field8694[arg0].method1898(arg4, arg1, (byte) -7), class30.field299, var5, 132, class30.field299)) {
                class479.field6729++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 35)
    public static void method4236(int arg0) {
        if (arg0 != -29132) {
            field10591 = null;
        }
        field10591 = null;
    }
}
