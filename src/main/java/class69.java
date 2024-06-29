import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class69 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "J")
    private static long field1255;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "J")
    private static long field1256;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 3)
    private class69() {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)J", line = 8)
    public static final synchronized long method535(boolean arg0) {
        if (!arg0) {
            field1255 = 43L;
        }
        long var1 = System.currentTimeMillis();
        if (field1256 > var1) {
            field1255 += field1256 - var1;
        }
        field1256 = var1;
        return field1255 + var1;
    }
}
