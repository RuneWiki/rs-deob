import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class41 extends class109 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field838 = 2;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Z")
    public static boolean field839 = false;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field840 = -1;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lia;")
    public static class257 field843 = class28.method234(-41, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[I")
    public static int[] field844 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        if (arg0) {
            field843 = null;
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIIIZI)V")
    public static final void method331(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var7 = 0 / ((53 - arg0) / 56);
        field845++;
        class231.field3887 = arg3;
        class196.field3313 = arg2;
        class136.field2438 = arg6;
        class64.field1302 = arg1;
        class35.field690 = arg4;
        if (arg5 && class196.field3313 >= 100) {
            class255.field4366 = class64.field1302 * 128 + 64;
            class231.field3885 = class231.field3887 * 128 + 64;
            class55.field1171 = class109.method803(class189.field3261, class231.field3885, (byte) 115, class255.field4366) - class35.field690;
        }
        class224.field3766 = 2;
    }
}
