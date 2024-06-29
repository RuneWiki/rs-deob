import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class399 extends class200 {

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Ljava/lang/String;")
    public static String field5848 = "flash1:";

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5845 = "Allocating memory";

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "[I")
    public static int[] field5850 = new int[2];

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "Lms;")
    public static class274 field5846 = new class274();

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "Luc;")
    public static class51 field5852 = new class51(64);

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "Z")
    public static boolean field5851;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 4)
    public static void method2564(byte arg0) {
        field5852 = null;
        field5850 = null;
        field5846 = null;
        int var1 = -47 / ((arg0 + 5) / 59);
        field5848 = null;
        field5845 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I", line = 24)
    public static final int method2565(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 31826) {
            return 14;
        }
        field5847++;
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return (arg1 >> 2 << 10) + (arg2 >> 5 << 7) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)B", line = 63)
    public static final byte method2566(int arg0, int arg1, int arg2) {
        if (arg0 != -32094) {
            field5848 = null;
        }
        field5849++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
