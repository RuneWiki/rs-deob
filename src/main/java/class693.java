import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class693 implements class681 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Ljava/lang/String;")
    private String field9818;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[I")
    public static int[] field9820 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Z")
    private boolean field9817;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 7)
    public static final void method3910(int arg0) {
        class243.field3580.method3301(1, 24, class243.field3580.field7964);
        field9813++;
        class243.field3580.method3301(1, arg0 + 22, class243.field3580.field8002);
        class243.field3580.method3301(2, 24, class243.field3580.field7998);
        class243.field3580.method3301(2, 24, class243.field3580.field7986);
        class243.field3580.method3301(1, 24, class243.field3580.field7996);
        class243.field3580.method3301(1, 24, class243.field3580.field7972);
        class243.field3580.method3301(1, 24, class243.field3580.field7966);
        class243.field3580.method3301(1, 24, class243.field3580.field8006);
        class243.field3580.method3301(1, 24, class243.field3580.field7994);
        class243.field3580.method3301(2, 24, class243.field3580.field8007);
        class243.field3580.method3301(1, arg0 ^ 0x1A, class243.field3580.field8008);
        class243.field3580.method3301(1, 24, class243.field3580.field7991);
        class243.field3580.method3301(2, 24, class243.field3580.field8001);
        class243.field3580.method3301(1, 24, class243.field3580.field8005);
        class243.field3580.method3301(0, arg0 ^ 0x1A, class243.field3580.field8015);
        class243.field3580.method3301(0, 24, class243.field3580.field8017);
        class243.field3580.method3301(arg0, arg0 ^ 0x1A, class243.field3580.field7973);
        class243.field3580.method3301(0, 24, class243.field3580.field7974);
        class243.field3580.method3301(0, 24, class243.field3580.field8011);
        class551.method3320(true);
        class243.field3580.method3301(0, 24, class243.field3580.field7983);
        class243.field3580.method3301(4, 24, class243.field3580.field7990);
        class181.method1284(arg0 + 42);
        class728.method4065(-1386);
        class567.field8205 = true;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 41)
    public static void method3911(int arg0) {
        field9820 = null;
        if (arg0 != 19363) {
            field9814 = -96;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Z", line = 53)
    public static final boolean method3912(int arg0, int arg1) {
        if (arg0 == -18935) {
            field9816++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lwea;", line = 67)
    public final class115 method2019(int arg0) {
        if (arg0 == 10251) {
            field9821++;
            return class115.field1602;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 78)
    public class693(String arg0) {
        this.field9818 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Z", line = 92)
    public final boolean method3913(int arg0) {
        int var2 = 118 % ((arg0 - 15) / 54);
        field9815++;
        return this.field9817;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I", line = 102)
    public final int method2020(int arg0) {
        field9819++;
        int var2 = class569.method3390(this.field9818, true);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        this.field9817 = true;
        if (arg0 != 28170) {
            this.field9818 = null;
        }
        return 100;
    }
}
