import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class587 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    public static final void method3298(String arg0, byte arg1) {
        field7977++;
        if (class245.field3209 == null) {
            return;
        }
        class358.field5217++;
        if (arg1 >= 81) {
            class43 var2 = class492.method2903(class173.field2296, 0, class73.field983);
            var2.field457.method1725(class525.method3045(-125, arg0), 69);
            var2.field457.method1678(arg0, (byte) 112);
            class409.method2457((byte) -100, var2);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lmr;Lmr;IIZIZ)I", line = 31)
    public static final int method3299(class154 arg0, class154 arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field7978++;
        int var7 = class281.method1836((byte) 60, arg3, arg0, arg1, arg6);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else if (arg2 == -28314) {
            int var8 = class281.method1836((byte) 82, arg5, arg0, arg1, arg4);
            return arg4 ? -var8 : var8;
        } else {
            return -38;
        }
    }
}
