import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class170 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lsd;")
    public static class166 field3275 = class135.method935("http:)4)4www)3runescape)3com", 0);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lsc;")
    public static class165 field3274 = new class165();

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lsd;")
    public static class166 field3280 = class135.method935("Konfig geladen)3", 0);

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field3278;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3275 = null;
        field3278 = null;
        if (arg0 != -9122) {
            field3278 = null;
        }
        field3274 = null;
        field3280 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Lqa;")
    public static final class145 method1185(byte arg0, int arg1) {
        field3277++;
        class145 var2 = (class145) class160.field3072.method64((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field508.method353(6, arg1, -92);
        class145 var4 = new class145();
        var4.field2856 = arg1;
        if (var3 != null) {
            var4.method994(29, new class53(var3));
        }
        var4.method998(93);
        if (var4.field2851) {
            var4.field2866 = false;
            var4.field2819 = 0;
        }
        if (arg0 < 43) {
            field3278 = null;
        }
        class160.field3072.method67(var4, 15266, (long) arg1);
        return var4;
    }
}
