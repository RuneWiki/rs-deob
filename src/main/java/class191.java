import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class191 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "J")
    private static long field3082;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "J")
    private static long field3083;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    private class191() {
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)J")
    public static final synchronized long method1350(byte arg0) {
        int var1 = 110 / ((arg0 - 45) / 34);
        long var2 = System.currentTimeMillis();
        if (var2 < field3082) {
            field3083 += field3082 - var2;
        }
        field3082 = var2;
        return field3083 + var2;
    }
}
