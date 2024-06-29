import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class542 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lui;")
    public static class210 field7900 = new class210(9, 0, 4, 1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lk;")
    public static class525 field7901;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method3282(byte arg0, int arg1, int arg2) {
        field7899++;
        int var3 = 8 / ((arg0 + 45) / 48);
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 19)
    public static void method3283(int arg0) {
        field7901 = null;
        field7900 = null;
        if (arg0 >= -23) {
            field7901 = null;
        }
    }
}
