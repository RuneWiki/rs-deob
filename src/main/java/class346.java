import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class346 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[B")
    public static byte[] field4765;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2132(int arg0) {
        field4766++;
        if (arg0 > class370.field5065) {
            class222.field2959 = -1;
            class304.field4034 = -1;
            class370.field5065 = 0;
        }
        if (class55.field756 < class370.field5065) {
            class222.field2959 = -1;
            class304.field4034 = -1;
            class370.field5065 = class55.field756;
        }
        if (class432.field5889 < 0) {
            class222.field2959 = -1;
            class432.field5889 = 0;
            class304.field4034 = -1;
        }
        if (class432.field5889 > class55.field750) {
            class222.field2959 = -1;
            class432.field5889 = class55.field750;
            class304.field4034 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILnh;)V", line = 46)
    public static final void method2133(int arg0, class487 arg1) {
        field4764++;
        class279 var2 = (class279) class208.field2806.method1528((long) arg1.field1163, 69);
        if (arg0 != -1 || var2 == null) {
            return;
        }
        if (var2.field3706 != null) {
            class181.field2494.method2204(var2.field3706);
            var2.field3706 = null;
        }
        var2.method2614((byte) -71);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 74)
    public static void method2134(byte arg0) {
        if (arg0 != 60) {
            method2134((byte) 0);
        }
        field4765 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z", line = 87)
    public static final boolean method2135(int arg0, int arg1) {
        field4768++;
        if (arg0 == 15 || arg0 == 46 || arg0 == 58 || arg0 == 6 || arg0 == 21) {
            return true;
        } else {
            return ~arg0 == arg1 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLr;I)Lpr;", line = 106)
    public static final class284 method2136(int arg0, boolean arg1, class110 arg2, int arg3) {
        field4763++;
        byte[] var4 = arg2.method702((byte) -98, arg0, arg3);
        if (arg1) {
            method2135(-19, -26);
        }
        return var4 == null ? null : new class284(var4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I", line = 122)
    public static final int method2137(byte arg0, int arg1) {
        if (arg0 <= 106) {
            method2137((byte) 3, 24);
        }
        field4762++;
        return arg1 & 0xFF;
    }
}
