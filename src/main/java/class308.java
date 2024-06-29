import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class308 {

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4416 = 0;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "[Lmm;")
    public static class293[] field4414;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V", line = 8)
    public static void method1988(byte arg0) {
        if (arg0 > -16) {
            method1989((byte) 2);
        }
        field4414 = null;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)V", line = 22)
    public static final void method1989(byte arg0) {
        class530.field7675 = -1;
        field4415++;
        class760.field10484 = 0;
        class524.field7398 = -1;
        int var1 = -29 % ((29 - arg0) / 39);
        class779.field10695 = -1;
    }
}
