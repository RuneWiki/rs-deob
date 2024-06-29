import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class176 {

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Ldh;")
    public static class320 field2066 = new class320(112, 0);

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2067 = 500;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "S")
    public static short field2069 = 256;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V", line = 6)
    public static void method1085(byte arg0) {
        field2066 = null;
        if (arg0 != 72) {
            field2069 = -5;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V", line = 22)
    public static final void method1086(int arg0, boolean arg1) {
        field2073++;
        if (arg1) {
            class47 var2 = class258.method1546(3, arg0, (byte) 121);
            var2.method274(!arg1);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V", line = 44)
    public static final void method1087(int arg0, int arg1) {
        field2071++;
        if (arg1 == 3) {
            class90.field936 = 1000000000L / (long) arg0;
        }
    }
}
