import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class591 extends class87 {

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "Z")
    public static boolean field7696 = false;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "Lhda;")
    public static class752 field7694 = new class752(83, 10);

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)V", line = 8)
    public static void method3218(int arg0) {
        field7694 = null;
        if (arg0 >= -89) {
            field7696 = true;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Loda;", line = 18)
    public static final class119 method3219(int arg0, int arg1) {
        ++field7693;
        class119 var2 = (class119) class392.field5477.method552(4, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class131.field2142.method2218((byte) 114, arg0, arg1);
            class119 var4 = new class119();
            if (var3 != null) {
                var4.method968(new class677(var3), arg1, arg0);
            }
            class392.field5477.method556((byte) 0, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(IIIIIF)V", line = 40)
    public class591(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIII)V", line = 43)
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        super.field1059 = arg2;
        super.field1054 = arg1;
        super.field1061 = arg0;
        ++field7692;
        if (arg3 != -13470) {
            field7694 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FI)V", line = 57)
    public final void method672(float arg0, int arg1) {
        if (arg1 == 2683) {
            super.field1063 = arg0;
            ++field7697;
        }
    }
}
