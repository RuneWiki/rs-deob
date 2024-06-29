import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "J")
    private static long field1087;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "J")
    private static long field1088;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 4)
    private class76() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J", line = 10)
    public static final synchronized long method507(int arg0) {
        if (arg0 != -30994) {
            field1088 = 68L;
        }
        long var1 = System.currentTimeMillis();
        if (field1088 > var1) {
            field1087 += field1088 - var1;
        }
        field1088 = var1;
        return field1087 + var1;
    }
}
