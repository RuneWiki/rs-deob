import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class86 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "J")
    private static long field1174;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "J")
    private static long field1175;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
    public static final synchronized long method509(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (field1174 > var1) {
            field1175 += field1174 - var1;
        }
        field1174 = var1;
        return arg0 ? -9L : field1175 + var1;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    private class86() {
    }
}
