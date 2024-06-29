import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class524 {

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "Lmia;")
    public static class63 field7487 = new class63(33, 18);

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lqe;")
    public static class469 field7488 = new class469(81, 8);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lfga;")
    public static class257 field7489;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 4)
    public static void method3074(byte arg0) {
        field7487 = null;
        if (arg0 >= 116) {
            field7488 = null;
            field7489 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)J", line = 16)
    public static final synchronized long method3075(int arg0) {
        field7486++;
        if (arg0 != 18) {
            field7487 = null;
        }
        long var1 = System.currentTimeMillis();
        if (class263.field3722 > var1) {
            class181.field2783 += class263.field3722 - var1;
        }
        class263.field3722 = var1;
        return class181.field2783 + var1;
    }
}
