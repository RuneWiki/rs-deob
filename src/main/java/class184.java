import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class184 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Z")
    public static boolean field3018 = false;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3016 = "shake:";

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
    public static int[] field3020 = new int[1024];

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[I")
    public static int[] field3019;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method1325(boolean arg0) {
        if (!arg0) {
            method1327(118);
        }
        field3019 = null;
        field3016 = null;
        field3020 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    public static final int method1326(int arg0, int arg1) {
        if (arg0 != 1024) {
            method1325(false);
        }
        field3015++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Ljh;")
    public static final class269 method1327(int arg0) {
        field3017++;
        if (class275.field4411 == null) {
            return null;
        }
        class313.field4985.method782((byte) -101, class275.field4411);
        if (arg0 != 255) {
            field3018 = true;
        }
        class269 var1 = (class269) class313.field4985.method785((byte) 52);
        class50 var2 = class49.method346(var1.field4333, (byte) 100);
        return var2 != null && var2.field857 && var2.method356(arg0 ^ 0x438) ? var1 : class266.method1793((byte) 83);
    }
}
