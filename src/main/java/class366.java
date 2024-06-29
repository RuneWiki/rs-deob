import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class366 {

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4954 = 2;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lcu;")
    public static class206 field4947 = new class206(0, 1);

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Ldb;")
    public static class298 field4955 = new class298(89, 8);

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field4956 = 100;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field4949;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2157(int arg0) {
        if (arg0 < 58) {
            field4956 = -51;
        }
        if (class32.field525 == 3) {
            class472.method2658(19093, 4);
        } else if (class32.field525 == 7) {
            class472.method2658(19093, 8);
        } else if (class32.field525 == 10) {
            class472.method2658(19093, 11);
        }
        field4953++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILeh;I)V", line = 27)
    private final void method2158(int arg0, class335 arg1, int arg2) {
        field4950++;
        if (~arg2 == arg0) {
            this.field4949 = arg1.method2001((byte) -83);
            this.field4951 = arg1.method2034(255);
            this.field4948 = arg1.method2034(255);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 45)
    public static void method2159(int arg0) {
        if (arg0 != 89) {
            field4955 = null;
        }
        field4947 = null;
        field4955 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLeh;)V", line = 56)
    public final void method2160(byte arg0, class335 arg1) {
        if (arg0 <= 52) {
            field4955 = null;
        }
        field4952++;
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                return;
            }
            this.method2158(-2, arg1, var3);
        }
    }
}
