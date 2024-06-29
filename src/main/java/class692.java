import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class692 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lvw;")
    public static class274 field9745 = new class274();

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "[I")
    public static int[] field9750 = new int[1];

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Lpr;")
    public static class407 field9749 = new class407(89, 2);

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "Lpr;")
    public static class407 field9751 = new class407(5, 12);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Ljo;")
    public static class303 field9747;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Ltb;")
    public static class363 field9748;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)Lvf;")
    public static final class138 method3830(int arg0, byte arg1) {
        field9744++;
        if (arg1 != 23) {
            field9751 = null;
        }
        class138 var2 = (class138) class265.field3347.method3690((byte) -40, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class379.field4917.method1719(arg0, 1, 4);
        class138 var4 = new class138();
        var4.field1577 = arg0;
        if (var3 != null) {
            var4.method772(new class452(var3), false);
        }
        var4.method771(-8508);
        if (var4.field1583 == 2 && class38.field417.method3234((byte) -47, (long) arg0) == null) {
            class38.field417.method3235((long) arg0, arg1 ^ 0xFFFFFFE8, new class337(class437.field6086));
            class286.field3662[class437.field6086++] = var4;
        }
        class265.field3347.method3683(var4, (byte) 104, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Z")
    public static final boolean method3831(int arg0, int arg1, int arg2) {
        field9746++;
        if (arg1 != 2) {
            field9747 = null;
        }
        return class196.method1138(arg2, arg0, arg1 + 21054) & class151.method829(arg0, -26559, arg2);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3832(byte arg0) {
        field9748 = null;
        if (arg0 != -112) {
            method3831(-31, 82, -74);
        }
        field9747 = null;
        field9745 = null;
        field9750 = null;
        field9749 = null;
        field9751 = null;
    }
}
