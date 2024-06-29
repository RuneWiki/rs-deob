import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class224 {

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "[I")
    public static int[] field2777 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)B")
    public static final byte method1352(int arg0, int arg1, int arg2) {
        field2778++;
        if (arg1 == 9) {
            if (arg2 > -81) {
                method1353(53, 118, 109);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)I")
    public static final int method1353(int arg0, int arg1, int arg2) {
        field2779++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg2 < 13) {
            method1355(26, -113, 115);
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public static void method1354(byte arg0) {
        if (arg0 != 39) {
            field2776 = -3;
        }
        field2777 = null;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(III)V")
    public static final void method1355(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class220.method1274(var3.field7231);
        class220.method1274(var3.field7228);
        if (var3.field7231 != null) {
            var3.field7231 = null;
        }
        if (var3.field7228 != null) {
            var3.field7228 = null;
        }
    }
}
