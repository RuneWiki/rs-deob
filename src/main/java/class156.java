import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class156 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBIIILgf;I)V", line = 5)
    public static final void method1053(int arg0, byte arg1, int arg2, int arg3, int arg4, class395 arg5, int arg6) {
        class270.method1664(true, arg4, arg5.field6241, arg5.field6239, arg5.field6220, arg6, 0, arg0, arg2, arg3);
        if (arg1 == -65) {
            field2063++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
    public abstract int method1052(byte arg0);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)C")
    public abstract char method1054(boolean arg0);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)J")
    public abstract long method1055(int arg0);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z")
    public abstract boolean method1056(byte arg0);

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)I")
    public abstract int method1057(byte arg0);
}
