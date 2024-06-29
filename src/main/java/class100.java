import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class100 extends class366 {

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field1462;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method656(int arg0) {
        int var2 = 26 % ((25 - arg0) / 62);
        field1461++;
        return this.field1462;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lsv;Ljava/lang/Object;I)V")
    public class100(class477 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1462 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)Z")
    public final boolean method657(int arg0) {
        if (arg0 == 16) {
            field1460++;
            return false;
        } else {
            return true;
        }
    }

    static {
        new class446(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }
}
