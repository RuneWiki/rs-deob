import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class169 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lub;")
    private static class227 field2830 = class257.method1749("Members only world", 17263);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lub;")
    public static class227 field2833 = field2830;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[Z")
    public static boolean[] field2828;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLub;Lub;)V")
    public static final void method1041(boolean arg0, class227 arg1, class227 arg2) {
        class91.field1564 = arg2;
        class109.field2044 = arg0;
        class91.field1546 = arg1;
        field2835++;
        class88.field1519 = 0;
        if (class91.field1546.method1487(127, class91.field1558) || class91.field1564.method1487(126, class91.field1558)) {
            class128.field2259 = 0;
            class37.field623 = 3;
        } else {
            class69.field1222 = 0;
            class37.field623 = -3;
            class128.field2259 = 1;
            class197.field3384 = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        if (arg0 != -1285) {
            method1045(-107, 95);
        }
        field2833 = null;
        field2828 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILta;)Lub;")
    public static final class227 method1043(int arg0, class105 arg1) {
        if (arg0 != 1291001114) {
            field2832 = 50;
        }
        field2836++;
        if (class208.method1320(false, client.method494(arg1)) == 0) {
            return null;
        } else if (arg1.field1836 == null || arg1.field1836.method1519(-19150).method1521((byte) 75) == 0) {
            return class50.field882 ? class237.field4111 : null;
        } else {
            return arg1.field1836;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lta;B)Lta;")
    public static final class105 method1044(class105 arg0, byte arg1) {
        int var2 = 59 / ((arg1 + 69) / 39);
        field2834++;
        class105 var3 = client.method501(arg0);
        if (var3 == null) {
            var3 = arg0.field1924;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
    public static final boolean method1045(int arg0, int arg1) {
        field2829++;
        int var2 = 39 / ((-arg1 - 19) / 49);
        return ((arg0 & 0x4CF31D1A) >> 30) != 0;
    }
}
