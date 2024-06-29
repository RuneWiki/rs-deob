import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class630 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8816 = 1337;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
    public static int[] field8819;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 3)
    public static void method3536(byte arg0) {
        if (arg0 == 101) {
            field8819 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Lmt;", line = 15)
    public static final class419[] method3537(int arg0) {
        field8818++;
        if (arg0 != 1807868904) {
            field8816 = -95;
        }
        return new class419[] { class83.field1168, class554.field7475, class416.field5971, class577.field7744, class27.field401, class683.field9612, class791.field10875, class592.field7963, class444.field6237, class758.field10510, class330.field4770, class74.field1093, class473.field6527, class348.field5117 };
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z", line = 29)
    public static final boolean method3538(byte arg0) {
        if (arg0 > -30) {
            return true;
        } else {
            class696.field9755 = true;
            field8815++;
            class599.field8150++;
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)S", line = 50)
    public static final short method3539(int arg0, int arg1) {
        field8817++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x381) >> 3;
        if (arg1 != 2011997347) {
            return 92;
        }
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLit;)Lit;")
    public abstract class674 method1119(byte arg0, class674 arg1);
}
