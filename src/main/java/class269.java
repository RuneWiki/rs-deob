import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class269 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3655 = "flash3:";

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[Z")
    public static boolean[] field3654 = new boolean[100];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lar;")
    public static class47 field3657 = new class47(128);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
    public static short[] field3658 = new short[] { 47, 11, 25, 3, 14, 19, 21, 46 };

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
    public static final int method1495(byte arg0, int arg1) {
        field3653++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 != 111) {
            field3655 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        if (arg0 != 8) {
            field3657 = null;
        }
        field3654 = null;
        field3658 = null;
        field3655 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)I")
    public static final int method1497(byte arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field3656++;
        if (arg0 > -125) {
            field3655 = null;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }
}
