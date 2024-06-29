import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class336 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4731++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V")
    public class336(int arg0, int arg1) {
        this.field4730 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2047(int arg0, int arg1, int arg2, int arg3) {
        if (class186.method1279(arg0, arg1, arg2)) {
            int var4 = arg1 << class192.field2815;
            int var5 = arg2 << class192.field2815;
            return class382.method2333(var4 + 1, class86.field1324[arg0].method201(arg1, arg2) + arg3, var5 + 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1 + 1, arg2) + arg3, var5 + 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1 + 1, arg2 + 1) + arg3, class352.field5398 + var5 - 1) && class382.method2333(var4 + 1, class86.field1324[arg0].method201(arg1, arg2 + 1) + arg3, class352.field5398 + var5 - 1);
        } else {
            return false;
        }
    }
}
