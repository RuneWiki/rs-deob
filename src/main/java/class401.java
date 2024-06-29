import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class401 {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Z")
    public static boolean field5727 = false;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Z)J")
    public static final synchronized long method2440(boolean arg0) {
        field5728++;
        long var1 = System.currentTimeMillis();
        if (arg0) {
            method2440(false);
        }
        if (class480.field6748 > var1) {
            class599.field8169 += class480.field6748 - var1;
        }
        class480.field6748 = var1;
        return class599.field8169 + var1;
    }
}
