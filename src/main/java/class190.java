import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class190 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Lud;")
    public static class279 field3421 = class130.method1024("(Z", 255);

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lud;")
    public static class279 field3425 = class130.method1024("Monde de jeu cr-B-B", 255);

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lud;")
    public static class279 field3426 = class130.method1024("huffman", 255);

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "S")
    public static short field3427 = 1;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lok;")
    public static class149 field3429;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 14)
    public static void method1442(byte arg0) {
        field3425 = null;
        if (arg0 != -57) {
            field3429 = (class149) null;
        }
        field3429 = null;
        field3421 = null;
        field3426 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1443(int arg0) {
        field3420++;
        if (arg0 < 31) {
            field3425 = (class279) null;
        }
        if (!class221.method1617((byte) 29) && class287.field5134 != class179.field3245) {
            class72.method629(class287.field5134, class72.field1420.field11[0], -28589, false, class274.field4875, class64.field1312, class72.field1420.field34[0]);
        } else if (class287.field5134 != class123.field2230 && class230.method1663(class287.field5134, -125)) {
            class123.field2230 = class287.field5134;
            class74.method641(-62);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 56)
    public static final void method1444(boolean arg0) {
        class84.field1591.method1338((byte) -118);
        class312.field5519.method1338((byte) -105);
        field3424++;
        if (!arg0) {
            field3427 = 24;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V", line = 69)
    public static final void method1445(boolean arg0, int arg1) {
        class109 var2 = (class109) class103.field1928.method610((long) arg1, -1);
        field3428++;
        if (arg0) {
            field3429 = (class149) null;
        }
        if (var2 != null) {
            var2.method2221(true);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lcg;Lcg;ZZIII)I", line = 95)
    public static final int method1446(class42 arg0, class42 arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3423++;
        int var7 = class133.method1042(arg2, arg0, arg1, -75, arg4);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            if (arg5 > -11) {
                method1445(true, -90);
            }
            int var8 = class133.method1042(arg3, arg0, arg1, -68, arg6);
            return arg3 ? -var8 : var8;
        }
    }
}
