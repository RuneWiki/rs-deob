import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class291 extends class112 {

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "[I")
    public static int[] field4634 = new int[32];

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method953(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILkj;IIB)V")
    public static final void method1951(int arg0, class114 arg1, int arg2, int arg3, byte arg4) {
        field4633++;
        if (class151.field2474 >= 3) {
            class63.method479(arg2, arg0, 0, arg1.field1782, arg1.field1872);
        } else {
            ((class17) class252.field4002).method117(arg2, arg0, arg1.field1790, arg1.field1919, class252.field4002.field1564 / 2, class252.field4002.field1560 / 2, (int) class1.field1, 256, arg1.field1782, arg1.field1872);
        }
        class229.field3659[arg3] = true;
        if (arg4 != 40) {
            field4634 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method1952(int arg0) {
        field4634 = null;
        if (arg0 != -4050) {
            field4632 = 23;
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)Z")
    public abstract boolean method954(byte arg0);
}
