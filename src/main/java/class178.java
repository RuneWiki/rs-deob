import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class178 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "Z")
    public static boolean field2181 = false;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lea;")
    public static class547 field2184 = new class547(75, 3);

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Llga;")
    public static class712 field2185 = new class712(3, 16);

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1013(int arg0, int arg1, int arg2) {
        field2183++;
        if (arg0 != -19181) {
            method1013(-125, 127, -126);
        }
        if (class639.field8868 == class51.field541) {
            if (!class556.method3152(0, 0, 1, -2, 0, arg1, arg2, false, 1)) {
                class556.method3152(0, 0, 1, -3, arg0 + 19181, arg1, arg2, false, 1);
            }
        } else if (!class556.method3152(0, 0, 1, -3, arg0 ^ -19181, arg1, arg2, false, 1)) {
            class556.method3152(0, 0, 1, -2, 0, arg1, arg2, false, 1);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZZ)Ljava/lang/String;", line = 40)
    public static final String method1014(int arg0, boolean arg1, boolean arg2) {
        field2182++;
        if (arg1) {
            method1015((byte) -9);
        }
        return arg2 && arg0 >= 0 ? class214.method1190(arg0, arg2, 328, 10) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V", line = 54)
    public static void method1015(byte arg0) {
        field2184 = null;
        field2185 = null;
        if (arg0 <= 20) {
            field2184 = null;
        }
    }
}
