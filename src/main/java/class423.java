import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class423 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "J")
    private static long field6362;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "J")
    private static long field6363;

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 5)
    private class423() {
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method2578(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field6363) {
            field6362 += field6363 - var1;
        }
        if (arg0 != -19698) {
            method2578(122);
        }
        field6363 = var1;
        return var1 + field6362;
    }
}
