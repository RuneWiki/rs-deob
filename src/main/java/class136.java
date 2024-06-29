import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class136 extends class34 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[F")
    public static float[] field2058 = new float[4];

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Z")
    public static boolean field2056 = false;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lg;")
    public static class68 field2059;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[Z")
    public static boolean[] field2057;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 12)
    public static void method1036(byte arg0) {
        field2058 = null;
        if (arg0 != 41) {
            method1036((byte) -123);
        }
        field2059 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLg;Ljd;ILjd;)V", line = 33)
    public static final void method1037(boolean arg0, class68 arg1, class95 arg2, int arg3, class95 arg4) {
        field2061++;
        class278.field4323 = arg0;
        class331.field5112 = arg4;
        class255.field3897 = arg2;
        if (arg3 >= -7) {
            method1037(false, (class68) null, (class95) null, 82, (class95) null);
        }
        int var5 = class255.field3897.method687((byte) 20) - 1;
        class12.field153 = var5 * 256 + class255.field3897.method685((byte) 15, var5);
        class276.field4286 = new String[] { null, null, class51.field693, null, null };
        class134.field2041 = new String[] { null, null, null, null, class108.field1569 };
        field2059 = arg1;
    }
}
