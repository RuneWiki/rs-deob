import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class271 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[J")
    public static long[] field4161 = new long[500];

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field4162 = 0;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lng;")
    public static class245 field4164;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Ljava/lang/String;")
    public String field4160;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[Ln;")
    public static class178[] field4165;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BC)Z", line = 15)
    public static final boolean method1786(byte arg0, char arg1) {
        field4163++;
        if (arg0 > -24) {
            method1787(1);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 38)
    public static void method1787(int arg0) {
        field4161 = null;
        field4165 = null;
        if (arg0 != 97) {
            method1787(81);
        }
        field4164 = null;
    }
}
