import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class665 {

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field9442 = 0;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Lpl;")
    public static class616 field9441 = new class616(64);

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Lnha;")
    public static class686 field9444 = new class686();

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "Ljava/lang/String;")
    public static String field9445 = "";

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 3)
    public static void method3730(byte arg0) {
        field9444 = null;
        field9445 = null;
        if (arg0 != -28) {
            field9442 = -67;
        }
        field9441 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 32)
    public static final void method3731(int arg0) {
        class582.method3359((byte) -128, class654.field9289.field5451.method1749(3) == 1, 2, 22050);
        field9443++;
        class109.field1694 = class490.method2974(class706.field9962, class400.field5941, -77, 0, 22050);
        int var1 = 81 % ((arg0 + 81) / 39);
        class378.method2386(1, true, class411.method2533(101, null));
        class159.field2473 = class490.method2974(class706.field9962, class400.field5941, -92, 1, 2048);
        class324.field4793 = new class349();
        class159.field2473.method868(false, class324.field4793);
        class703.field9941 = new class68(22050, class608.field8585);
        class384.method2409(false);
    }
}
