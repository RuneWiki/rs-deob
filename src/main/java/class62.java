import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class62 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "J")
    private static long field1046;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "J")
    private static long field1047;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)J")
    public static final synchronized long method472(int arg0) {
        if (arg0 <= 12) {
            return 116L;
        }
        long var1 = System.currentTimeMillis();
        if (field1047 > var1) {
            field1046 += field1047 - var1;
        }
        field1047 = var1;
        return field1046 + var1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    private class62() {
    }
}
