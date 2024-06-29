import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class323 {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field4875 = -1;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Z")
    public static boolean field4877 = true;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lfe;")
    public static class248 field4870 = new class248(64);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field4876;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method2209(boolean arg0) {
        field4880++;
        class45.field576 = null;
        class72.method464(0, class136.field2071, class251.field3747, class123.field1926, -1, 0, 0, 0, 9608);
        if (arg0 && class45.field576 != null) {
            class266.method1868(class251.field3747, class136.field2071, 0, class270.field4144, class45.field576, class267.field4103, -1412584499, 0, (byte) -23, class189.field2819.field4945);
            class45.field576 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ICI)I", line = 45)
    public static final int method2210(int arg0, char arg1, int arg2) {
        field4879++;
        if (arg2 >= -48) {
            field4877 = false;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 72)
    public static final String method2211(boolean arg0, int arg1, int arg2) {
        field4868++;
        if (arg0 && arg2 >= 0) {
            if (arg1 >= -46) {
                field4870 = (class248) null;
            }
            return class7.method29(arg2, arg0, (byte) 116, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 87)
    public static void method2212(int arg0) {
        if (arg0 != 64) {
            field4877 = true;
        }
        field4870 = null;
    }
}
