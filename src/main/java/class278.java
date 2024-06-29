import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class278 {

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4289 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lpg;")
    public static class320 field4288 = new class320(4);

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lah;")
    public static class126 field4286;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1908(int arg0) {
        class139.field2174 = null;
        class112.field1738 = null;
        class191.field2864 = null;
        if (arg0 < 21) {
            method1910(-22, true, 90, 111);
        }
        field4287++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 19)
    public static void method1909(byte arg0) {
        field4286 = null;
        int var1 = -13 / ((arg0 - 17) / 40);
        field4289 = null;
        field4288 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZII)V", line = 32)
    public static final void method1910(int arg0, boolean arg1, int arg2, int arg3) {
        field4283++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class55.field918 = arg3;
        class220.field3413 = arg0;
        if (arg2 != -28160) {
            method1910(-20, true, 5, 69);
        }
        class156.field2337 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ll;IIZ)[Lin;", line = 48)
    public static final class168[] method1911(class133 arg0, int arg1, int arg2, boolean arg3) {
        field4284++;
        return class181.method1296(arg3, arg0, arg1, arg2) ? class192.method1371(true) : null;
    }
}
