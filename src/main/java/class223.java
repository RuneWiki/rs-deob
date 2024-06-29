import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class223 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Ldb;")
    public static class102 field3561 = new class102(64);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3562 = -1;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    public static int[] field3565 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILle;II)Z", line = 18)
    public static final boolean method1584(int arg0, int arg1, int arg2, int arg3, class97 arg4, int arg5, int arg6) {
        field3564++;
        class317 var7 = class246.method1757(2313, arg4.field1317);
        if (var7.field4927 == -1) {
            return true;
        }
        int var8;
        if (arg4.field1366) {
            int var9 = arg4.field1312 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class326 var10 = var7.method2232(var8, arg4.field1305, (byte) 115);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field1343;
        int var12 = var10.field4154;
        int var13 = arg4.field1337;
        if ((var8 & 0x1) == 1) {
            var13 = arg4.field1343;
            var11 = arg4.field1337;
        }
        int var14 = var10.field4158;
        if (arg6 != 19) {
            method1586(120, 82);
        }
        if (var7.field4933) {
            var12 = var13 * 4;
            var14 = var11 * 4;
        }
        if (var7.field4925 == 0) {
            var10.method2279((arg2 * 4) + 48, (104 - arg3 + -var11) * 4 + 48, var12, var14);
        } else {
            var10.method2282((arg2 * 4) + 48, (-var11 + 104 + -arg3) * 4 + 48, var12, var14, var7.field4925);
        }
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 72)
    public static void method1585(byte arg0) {
        if (arg0 == 4) {
            field3565 = null;
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 86)
    public static final void method1586(int arg0, int arg1) {
        field3566++;
        class227.field3621.method708(arg0, true);
        if (arg1 == 48) {
            class302.field4750.method708(arg0, true);
            class5.field76.method708(arg0, true);
        }
    }
}
