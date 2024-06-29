import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class268 extends class137 {

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    public byte[] field4657;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Ltl;")
    public static class59 field4655 = class85.method639("<)4col>", 9588);

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field4659 = 0;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field4656 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4661 = 0;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4658 = 2;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 4)
    public static void method1877(byte arg0) {
        field4656 = null;
        if (arg0 != 14) {
            field4656 = (int[]) null;
        }
        field4655 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B)V", line = 39)
    public class268(byte[] arg0) {
        this.field4657 = arg0;
    }
}
