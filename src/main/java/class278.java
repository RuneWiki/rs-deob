import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class278 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Z")
    public static boolean field4888 = false;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lcc;")
    public static class209 field4890 = class95.method669(94, ")4a=");

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lsj;I)Z")
    public static final boolean method1881(class49 arg0, int arg1) {
        field4889++;
        if (arg1 != -25799) {
            field4892 = -91;
        }
        return arg0.method351((byte) 111, class223.field4067);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)J")
    public static final long method1882(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2203; var4++) {
            class264 var5 = var3.field2189[var4];
            if ((var5.field4733 >> 29 & 0x3L) == 2L && var5.field4746 == arg1 && var5.field4741 == arg2) {
                return var5.field4733;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1883(boolean arg0) {
        if (!arg0) {
            field4890 = null;
        }
        field4890 = null;
    }
}
