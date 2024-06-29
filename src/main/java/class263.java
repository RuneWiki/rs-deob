import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class263 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "J")
    private static long field3976;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "J")
    private static long field3977;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)J")
    public static final synchronized long method1754(int arg0) {
        long var1 = System.currentTimeMillis();
        int var3 = -53 / ((arg0 - 73) / 50);
        if (field3977 > var1) {
            field3976 += field3977 - var1;
        }
        field3977 = var1;
        return field3976 + var1;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    private class263() {
    }
}
