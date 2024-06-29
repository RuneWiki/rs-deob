import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class63 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Ldj;")
    private static class44 field1178 = class89.method650(255, "Could not complete login)3");

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ldj;")
    public static class44 field1173 = class89.method650(255, ")1 ");

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ldj;")
    public static class44 field1179 = class89.method650(255, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ldj;")
    public static class44 field1171 = class89.method650(255, "headicons_pk");

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ldj;")
    public static class44 field1170 = class89.method650(255, "scape main");

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ldj;")
    public static class44 field1175 = field1178;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method470(int arg0) {
        field1171 = null;
        field1175 = null;
        field1178 = null;
        field1173 = null;
        if (arg0 != -2455) {
            field1173 = null;
        }
        field1179 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
    public static final int method471(int arg0, int arg1, int arg2) {
        field1177++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & arg1) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Ldj;")
    public static final class44 method472(int arg0, int arg1) {
        if (arg1 < 84) {
            method472(-111, -32);
        }
        field1169++;
        return class70.method555(new class44[] { class199.method1287(arg0 >> 24 & 0xFF, -1), class147.field2589, class199.method1287(arg0 >> 16 & 0xFF, -1), class147.field2589, class199.method1287(arg0 >> 8 & 0xFF, -1), class147.field2589, class199.method1287(arg0 & 0xFF, -1) }, -3);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Lfa;")
    public static final class57 method473(byte arg0, int arg1) {
        class57 var2 = (class57) class122.field2159.method1178((long) arg1, 14176);
        field1176++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -44) {
            field1172 = 75;
        }
        byte[] var3 = class102.field1859.method1466(27, arg1, (byte) -123);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method435(new class66(var3), (byte) 123);
        }
        class122.field2159.method1183((byte) 110, var4, (long) arg1);
        return var4;
    }
}
