import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class431 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lpl;")
    private class612 field5392;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lrga;")
    public static class280 field5393 = new class280(82, 6);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public static int[] field5397 = new int[1];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field5395 = 104;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "F")
    public static float field5396;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZILpl;IIB)V", line = 9)
    public static final void method2275(int arg0, boolean arg1, int arg2, class612 arg3, int arg4, int arg5, byte arg6) {
        field5391++;
        if (arg4 > 0) {
            class531.field7173 = arg1;
            class119.field1527 = arg2;
            class149.field1920 = arg5;
            class436.field5443 = arg0;
            class316.field4061 = arg3;
            class235.field2946 = 1;
            class608.field8547 = class598.field8405.method1343(-128) / arg4;
            if (class608.field8547 < 1) {
                class608.field8547 = 1;
            }
        } else {
            class627.method3447(arg1, arg5, arg0, arg3, (byte) -73, arg2);
        }
        if (arg6 < 103) {
            field5395 = -4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2276(boolean arg0) {
        field5393 = null;
        field5397 = null;
        if (arg0) {
            field5395 = 58;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 73)
    public class431(class112 arg0, int arg1, class612 arg2) {
        new class450(64);
        this.field5392 = arg2;
        this.field5394 = this.field5392.method3349(15, true);
    }
}
