import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class385 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "J")
    private static long field5535;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
    private static long field5536;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 2)
    private class385() {
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method2442(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -6631) {
            method2442(21);
        }
        if (field5536 > var1) {
            field5535 += field5536 - var1;
        }
        field5536 = var1;
        return field5535 + var1;
    }
}
