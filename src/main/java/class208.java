import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class208 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ldd;")
    public static class35 field4126 = class180.method1196((byte) 127, "<col=80ff00>");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lth;")
    public static class187 field4125 = new class187();

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ldd;")
    public static class35 field4129 = class180.method1196((byte) -27, "Ausw-=hlen");

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ldd;")
    public static class35 field4133 = class180.method1196((byte) 127, "<col=ff9040>");

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ldd;")
    private static class35 field4132 = class180.method1196((byte) -53, "wave:");

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ldd;")
    public static class35 field4134 = field4132;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ldd;")
    public static class35 field4131 = field4132;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lta;")
    public static class180 field4130;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method1371(byte arg0) {
        field4128++;
        if (!class52.field1194) {
            return;
        }
        class3.field42 = null;
        class75.field1800 = null;
        class155.field3191 = null;
        class145.field3075 = null;
        class205.field4074 = null;
        class35.field707 = null;
        class101.field2240 = null;
        class82.field1902 = null;
        class23.field461 = null;
        class206.field4110 = null;
        class132.field2838 = null;
        class72.field1729 = null;
        class9.field186 = null;
        class110.field2437 = null;
        int var1 = -95 / ((arg0 + 62) / 35);
        class40.field873 = null;
        class187.field3806 = null;
        class70.field1687 = null;
        class43.field944 = null;
        class99.field2169 = null;
        class55.field1305 = null;
        class91.field2024 = null;
        class13.field234 = null;
        class166.method1094(2, 0);
        class155.method1045(true, true);
        class52.field1194 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    public static int method1372(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4127++;
        int var7 = arg0 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg6;
        } else {
            if (arg1 != 7) {
                method1373(18, 95, 54, -69, 18, -12, -117);
            }
            return var7 == 2 ? 7 + 1 - arg3 - arg2 : -arg5 - -1 + -arg6 + 7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field4130 = null;
        int var1 = -31 % ((-arg0 - 54) / 58);
        field4126 = null;
        field4134 = null;
        field4132 = null;
        field4133 = null;
        field4131 = null;
        field4129 = null;
        field4125 = null;
    }
}
