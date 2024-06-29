import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class149 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "J")
    private static long field2516;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "J")
    private static long field2517;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    private class149() {
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
    public static final synchronized long method1024(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -14898) {
            field2517 = -4L;
        }
        if (var1 < field2516) {
            field2517 += field2516 - var1;
        }
        field2516 = var1;
        return field2517 + var1;
    }
}
