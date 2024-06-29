import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class162 extends class161 {

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[Lfn;")
    public static class72[] field2547 = new class72[4];

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Lgl;")
    public class356 field2545;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
    public boolean field2550;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
    public static final void method1126(byte arg0, int arg1) {
        class388.field5858 = arg1;
        if (arg0 >= -31) {
            method1126((byte) 18, 116);
        }
        field2548++;
        class338.field5247.method335((byte) -117);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIII)V")
    public static final void method1127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2546++;
        int var6 = (arg3 - 32) * arg3 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg0 / (arg2 - arg3);
        class388.field5850[0].method2327(arg1, arg5);
        class388.field5850[1].method2327(arg1, arg3 + arg5 - 16);
        class284.field4547.method2086(16, arg1, arg3 + arg4, class258.field4183, -765, arg5 + 16);
        class284.field4547.method2086(16, arg1, var6, class50.field620, arg4 ^ 0x2E3, arg5 - (-var7 - 16));
        class284.field4547.method2085(arg1, (byte) -71, var6, arg5 + var7 + 16, class263.field4246);
        class284.field4547.method2085(arg1 + 1, (byte) -96, var6, var7 + arg5 + 16, class263.field4246);
        class284.field4547.method2087(class263.field4246, true, arg5 - (-var7 - 16), arg1, 16);
        class284.field4547.method2087(class263.field4246, true, var7 + arg5 + 17, arg1, 16);
        class284.field4547.method2085(arg1 + 15, (byte) 92, var6, arg5 + var7 + 16, class369.field5606);
        class284.field4547.method2085(arg1 + 14, (byte) 75, var6 - 1, arg5 + var7 - -17, class369.field5606);
        class284.field4547.method2087(class369.field5606, true, arg5 + var6 + var7 + 15, arg1, 16);
        class284.field4547.method2087(class369.field5606, true, arg5 + var7 + var6 + 14, arg1 + 1, 15);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1128(String arg0, int arg1) {
        if (arg1 <= 100) {
            method1129((byte) 110);
        }
        field2549++;
        return class235.method1663(-2, 10, arg0, true);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        if (arg0 != 105) {
            method1128((String) null, -119);
        }
        field2547 = null;
    }
}
