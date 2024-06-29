import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
    public static boolean[] field6 = new boolean[5];

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field8 = new int[14];

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lld;")
    public static class117 field2;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ldp;")
    public static class174 field7;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 13)
    public static void method1(int arg0) {
        int var1 = 22 % ((-arg0 - 52) / 36);
        field8 = null;
        field7 = null;
        field6 = null;
        field2 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 30)
    public static final void method2(byte arg0) {
        class384.field5499.method106((byte) -123);
        field4++;
        class250.field3610.method106((byte) -125);
        if (arg0 != 4) {
            field2 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lqa;", line = 48)
    public static final class242 method3(int arg0, int arg1) {
        field5++;
        class242 var2 = (class242) class349.field4961.method103(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class311.field4533.method1355(arg0, -12607, 36);
        class242 var4 = new class242();
        var4.field3502 = arg0;
        if (var3 != null) {
            var4.method1774(new class37(var3), arg1 + 90);
        }
        if (arg1 == 36) {
            var4.method1767(arg1 ^ 0x3F2E);
            class349.field4961.method113(var4, 0, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }
}
