import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class420 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lqp;")
    public static class586 field6033 = new class586(97, 16);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2500(int arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            method2501(-124);
        }
        field6035++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 16)
    public static void method2501(int arg0) {
        int var1 = 105 % ((arg0 + 45) / 54);
        field6033 = null;
    }
}
