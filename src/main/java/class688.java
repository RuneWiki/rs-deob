import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class688 extends class665 {

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public int field9673 = 0;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Llaa;")
    public static class106 field9670 = new class106(4, 1, 1, 1);

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "Z")
    public static boolean field9678 = true;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Luj;")
    public static class349 field9676 = new class349();

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Lpj;")
    public static class132 field9672;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method3785(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 15) {
            method3789(-25, false);
        }
        field9679++;
        if (arg3 >= class92.field1219 && class631.field8829 >= arg3) {
            int var5 = class355.method2104(class144.field2148, arg4, -115, class482.field6703);
            int var6 = class355.method2104(class144.field2148, arg2, -108, class482.field6703);
            class140.method998(var5, arg1, arg3, 0, var6);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 23)
    public static void method3786(int arg0) {
        field9670 = null;
        if (arg0 >= -31) {
            method3788(-33, 31, 59);
        }
        field9672 = null;
        field9676 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjr;)V", line = 41)
    public final void method3787(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method718(-123);
            if (var3 == 0) {
                field9671++;
                if (arg0 != -25378) {
                    method3788(-36, 98, -20);
                    return;
                }
                return;
            }
            this.method3790(arg1, 2, var3);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Z", line = 68)
    public static final boolean method3788(int arg0, int arg1, int arg2) {
        field9677++;
        if (arg1 == -19244) {
            return class45.method250(540800, arg2, arg0) || class298.method1859(arg2, 19308, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V", line = 88)
    public static final void method3789(int arg0, boolean arg1) {
        field9674++;
        class679 var2 = class669.method3708(2, arg0, 1403048928);
        var2.method3749(-124);
        if (arg1) {
            field9670 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljr;II)V", line = 104)
    private final void method3790(class96 arg0, int arg1, int arg2) {
        field9675++;
        if (arg1 == arg2) {
            this.field9673 = arg0.method743((byte) -47);
        }
    }
}
