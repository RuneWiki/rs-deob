import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class729 extends class298 {

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "Luw;")
    public static class208 field9565 = new class208(51, 8);

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(III)Z", line = 3)
    public static final boolean method3896(int arg0, int arg1, int arg2) {
        ++field9566;
        if (arg0 < 29) {
            method3896(104, 73, -58);
        }
        return (2048 & arg2) != 0;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lwm;Lwm;Ljl;)V", line = 14)
    public class729(class30 arg0, class30 arg1, class621 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIB)V", line = 21)
    public final void method1775(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field9567;
        int var6 = super.field3776.method623();
        int var7 = ((class621) super.field8712).field7862 * class120.method713((byte) 116) / 10 % var6;
        super.field3776.method4198(arg1 + var7 + -var6, arg0, -var7 + var6 + arg2, arg3);
        if (arg4 != 34) {
            field9565 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)V", line = 37)
    public static void method3897(int arg0) {
        if (arg0 > 116) {
            field9565 = null;
        }
    }
}
