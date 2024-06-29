import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class76 {

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1544 = 0;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!fca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1546++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZIILom;JII)V")
    public static final void method813(boolean arg0, int arg1, int arg2, class344 arg3, long arg4, int arg5, int arg6) {
        if (arg2 == 18506) {
            field1543++;
            class71.method788(arg1, 2207, arg0, arg6, arg4, arg5, 10000, arg3);
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(II)V")
    public class76(int arg0, int arg1) {
        this.field1542 = arg0;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)V")
    public static final void method814(int arg0, int arg1) {
        field1545++;
        class19 var2 = class373.method2355(85, arg0, 3);
        if (arg1 == 0) {
            var2.method438(806);
        }
    }
}
