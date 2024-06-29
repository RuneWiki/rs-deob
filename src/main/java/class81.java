import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class81 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "J")
    private static long field1493;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "J")
    private static long field1494;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    private class81() {
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)J")
    public static final synchronized long method608(int arg0) {
        if (arg0 != 19644) {
            method608(-96);
        }
        long var1 = System.currentTimeMillis();
        if (field1493 > var1) {
            field1494 += field1493 - var1;
        }
        field1493 = var1;
        return field1494 + var1;
    }
}
