import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class502 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Z")
    public static boolean field6440 = false;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Z")
    public static boolean field6439 = false;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)J", line = 18)
    public static final synchronized long method2786(int arg0) {
        field6438++;
        long var1 = System.currentTimeMillis();
        if (var1 < class53.field693) {
            class26.field227 += class53.field693 - var1;
        }
        if (arg0 != -7114) {
            method2786(121);
        }
        class53.field693 = var1;
        return class26.field227 + var1;
    }
}
