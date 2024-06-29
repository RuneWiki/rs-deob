import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class252 {

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field3493 = 1;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "[[B")
    public static byte[][] field3497 = new byte[50][];

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Lcba;")
    public static class471 field3490 = new class471(27, 0);

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "[B")
    public byte[] field3495;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "[S")
    public short[] field3491;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "[S")
    public short[] field3492;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "[S")
    public short[] field3496;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)I")
    public static final int method1569(boolean arg0, int arg1, int arg2) {
        field3494++;
        if (arg2 == 1 || arg2 == 3) {
            return class132.field2106[arg1 & 0x3];
        } else {
            if (arg0) {
                method1570(14, 124, 105, -54, 116, 78, -12, -62);
            }
            return class224.field3208[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3498++;
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class187.field2626 - class510.field7134) * var8 / 100 + class510.field7134;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class1.field2[var11] * -var10 >> 15;
            var15 = class1.field7[var11] * var10 >> 15;
        }
        if (arg2 < 95) {
            return;
        }
        if (var12 != 0) {
            var13 = class1.field2[var12] * var15 >> 15;
            var15 = class1.field7[var12] * var15 >> 15;
        }
        class160.field2349 = arg3;
        class462.field6488 = arg0 - var15;
        class264.field3688 = 0;
        class88.field1391 = arg5;
        class117.field1930 = arg4 - var14;
        class563.field7794 = arg6 - var13;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method1571(int arg0) {
        field3490 = null;
        field3497 = null;
        if (arg0 != 0) {
            method1571(-69);
        }
    }
}
