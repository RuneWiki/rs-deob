import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class183 {

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "S")
    public static short field2294 = 320;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "[J")
    public static long[] field2296;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 4)
    public static void method1154(int arg0) {
        int var1 = 75 % ((58 - arg0) / 42);
        field2296 = null;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IBI)Z", line = 24)
    public static final boolean method1155(int arg0, byte arg1, int arg2) {
        field2295++;
        if (arg1 != -117) {
            method1155(-34, (byte) 75, -58);
        }
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }
}
