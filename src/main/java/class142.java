import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class142 extends class167 {

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Z")
    public static boolean field2367 = false;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lwe;")
    public static class147 field2363 = new class147(50);

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Le;")
    private static class191 field2369 = class54.method368("glow3:", 2047);

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Le;")
    public static class191 field2368 = field2369;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Le;")
    public static class191 field2370 = field2369;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method934(int arg0) {
        field2369 = null;
        int var1 = 85 % ((arg0 - 29) / 50);
        field2363 = null;
        field2368 = null;
        field2370 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
    public static final int method935(byte arg0) {
        field2364++;
        int var1 = 113 % ((arg0 - 19) / 39);
        return ((class126.field2088 ? 1 : 0) << 19) + ((class213.field3772 ? 1 : 0) << 15) + ((class127.field2111 ? 1 : 0) << 8) + ((class209.field3721 ? 1 : 0) << 6) + ((class225.field4029 ? 1 : 0) << 5) + ((class230.field4129 ? 1 : 0) << 3) + (class87.field1421 & 0x7) + ((class183.field3154 ? 1 : 0) << 4) + ((class41.field729 ? 1 : 0) << 7) + ((class226.field4074 ? 1 : 0) << 9) - (-((class252.field4472 ? 1 : 0) << 10) - (class102.field1660 & 0x3 << 11) - (((class75.field1289 ? 1 : 0) << 13) - -((class50.field898 ? 1 : 0) << 16) + ((class56.field1036 & 0x3) << 17)) + (-((class30.field425 == 0 ? 0 : 1) << 20) + -((class255.field4532 == 0 ? 0 : 1) << 21) - ((class173.field2904 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)Z")
    public abstract boolean method936(int arg0);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method937(int arg0);
}
