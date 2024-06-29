import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class529 extends class286 {

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    public static final void method3136(int arg0, int arg1) {
        field7753++;
        if (arg0 == -32339) {
            class184 var2 = class277.method1682(arg1, 9, -95);
            var2.method1075((byte) 108);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Luj;")
    public static final class262 method3137(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7257;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method3138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -72) {
            return;
        }
        field7752++;
        if (arg3 == arg5) {
            class451.method2799(arg1, arg2, arg3, (byte) -57, arg0);
        } else if (class307.field4111 <= arg2 - arg3 && (arg2 + arg3) <= class91.field1086 && (arg0 - arg5) >= class169.field2184 && class386.field5620 >= (arg0 + arg5)) {
            class412.method2513(arg2, arg3, arg5, (byte) -103, arg1, arg0);
        } else {
            class324.method1914(arg5, arg0, (byte) -120, arg3, arg1, arg2);
        }
    }
}
