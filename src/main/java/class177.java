import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class177 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2180 = 0;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "F")
    public static float field2181;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[Lub;")
    public static class20[] field2179;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[[[Lcq;")
    public static class433[][][] field2183;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method1108(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2182++;
            return (arg2 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 20)
    public static void method1109(byte arg0) {
        field2179 = null;
        if (arg0 != -43) {
            field2183 = null;
        }
        field2183 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 32)
    public static final void method1110(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class328.method1909(var3.field6217);
        class328.method1909(var3.field6210);
        if (var3.field6217 != null) {
            var3.field6217 = null;
        }
        if (var3.field6210 != null) {
            var3.field6210 = null;
        }
    }
}
