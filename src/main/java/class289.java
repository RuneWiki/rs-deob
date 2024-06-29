import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class289 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljf;")
    public static class229 field4938 = class212.method1457((byte) 88, "");

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Ljf;")
    public static class229 field4939 = class212.method1457((byte) 114, "(U (X");

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljf;")
    private static class229 field4941 = class212.method1457((byte) 67, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljf;")
    public static class229 field4940 = field4941;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Ljf;")
    public static class229 field4947 = class212.method1457((byte) 124, "Liste der Welten geladen");

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lek;")
    public static class185 field4943;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lek;")
    public static class185 field4945;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2014(int arg0, int arg1, int arg2, int arg3) {
        field4944++;
        if (arg0 == arg2) {
            return arg2;
        }
        if (arg3 != 464919239) {
            method2014(-68, -21, 36, 43);
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var6 = ((arg0 & 0xFF00FF00) >>> 7) * arg1 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        return (var5 >> 7) + var6;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 119)
    public static void method2015(byte arg0) {
        field4945 = null;
        field4939 = null;
        field4940 = null;
        field4943 = null;
        if (arg0 > -113) {
            field4939 = (class229) null;
        }
        field4947 = null;
        field4941 = null;
        field4938 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Loh;", line = 144)
    public static final class16 method2016(int arg0, int arg1) {
        field4946++;
        class16 var2 = (class16) class189.field3290.method643((long) arg0, 1649232044);
        if (arg1 != 128) {
            return (class16) null;
        } else if (var2 == null) {
            byte[] var3 = class282.field4829.method1275(class29.method249(20, arg0), class23.method223(784978120, arg0), arg1 ^ 0xFFFFEB25);
            class16 var4 = new class16();
            if (var3 != null) {
                var4.method162((byte) 67, new class14(var3));
            }
            class189.field3290.method640(var4, (long) arg0, arg1 + 24051);
            return var4;
        } else {
            return var2;
        }
    }
}
