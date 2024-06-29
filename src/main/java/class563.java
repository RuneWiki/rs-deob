import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class563 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    public static boolean field7154 = false;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Luw;")
    public static class208 field7155 = null;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)[Lbt;", line = 6)
    public static final class437[] method3047(int arg0) {
        field7159++;
        int var1 = 48 % ((arg0 - 12) / 51);
        return new class437[] { class32.field322, class614.field7744, class746.field10199, class330.field4038, class456.field5975, class317.field3949, class181.field2464, class657.field8520, class101.field1342, class753.field10262, class362.field4406, class391.field5089, class84.field1196, class72.field980, class439.field5766 };
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V", line = 17)
    public static final void method3048(int arg0, int arg1, int arg2) {
        field7158++;
        class614 var3 = class497.method2759(17, 5977, (long) arg1);
        int var4 = -106 / ((-arg0 - 5) / 39);
        var3.method3277(639);
        var3.field7742 = arg2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 37)
    public static void method3049(byte arg0) {
        field7155 = null;
        if (arg0 != -98) {
            field7154 = true;
        }
    }
}
