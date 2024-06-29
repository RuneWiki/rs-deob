import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class256 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lcf;")
    public static class93 field4624 = class147.method1066(":", -48);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4621 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lcf;")
    private static class93 field4619 = class147.method1066("Loaded interfaces", -48);

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4627 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lcf;")
    public static class93 field4618 = field4619;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4626++;
        class212 var5 = class123.method905(-1205364448, 4, arg0);
        int var6 = 68 / ((64 - arg2) / 53);
        var5.method1493(13);
        var5.field3883 = arg4;
        var5.field3892 = arg1;
        var5.field3889 = arg3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
    public static final int method1736(int arg0, int arg1) {
        if (arg0 != 4413) {
            method1737((byte) 38);
        }
        field4620++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        field4618 = null;
        if (arg0 > -111) {
            method1735(-111, 108, -93, 117, 70);
        }
        field4619 = null;
        field4624 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static final void method1738(boolean arg0) {
        field4625++;
        if (class213.field3908 > 0) {
            class121.method895(91);
        } else {
            class127.field2243 = class92.field1625;
            class92.field1625 = null;
            class19.method88(40, arg0);
        }
    }
}
