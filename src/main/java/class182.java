import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class182 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "J")
    private static long field2921;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "J")
    private static long field2922;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)J")
    public static final synchronized long method1253(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field2921) {
            field2922 += field2921 - var1;
        }
        field2921 = var1;
        return arg0 == 20215 ? field2922 + var1 : -78L;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    private class182() {
    }
}
