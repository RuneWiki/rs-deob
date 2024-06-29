import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class525 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field7400 = -1;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lcb;")
    public static class483 field7399 = new class483();

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)J")
    public static final synchronized long method3074(byte arg0) {
        if (arg0 != -101) {
            method3075(24);
        }
        field7401++;
        long var1 = System.currentTimeMillis();
        if (class471.field6678 > var1) {
            class512.field7235 += class471.field6678 - var1;
        }
        class471.field6678 = var1;
        return class512.field7235 + var1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method3075(int arg0) {
        int var1 = -127 / ((60 - arg0) / 43);
        field7399 = null;
    }
}
