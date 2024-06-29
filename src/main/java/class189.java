import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class189 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field3037 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lci;")
    public static class327 field3039 = new class327();

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
    public static int[] field3035;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lbo;")
    public static class16[] field3036;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 13)
    public static void method1492(int arg0) {
        field3037 = null;
        field3035 = null;
        field3036 = null;
        if (arg0 != 63) {
            method1494(89, -63, 39, -16, 6, 61, -124);
        }
        field3039 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILth;I)[Lem;", line = 43)
    public static final class285[] method1493(int arg0, int arg1, class57 arg2, int arg3) {
        if (arg0 >= -63) {
            field3035 = (int[]) null;
        }
        field3040++;
        return class315.method2233(arg1, (byte) 111, arg2, arg3) ? class106.method823(false) : null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V", line = 65)
    public static final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 65535) {
            return;
        }
        field3038++;
        int var7 = arg1 - arg4;
        int var8 = arg2 - arg4;
        int var9 = arg3 + arg4;
        int var10 = arg5 + arg4;
        for (int var11 = arg3; var11 < var9; var11++) {
            class161.method1253(arg1, class353.field5599[var11], arg0 ^ 0xFFFF0000, arg6, arg5);
        }
        for (int var12 = arg2; var12 > var8; var12--) {
            class161.method1253(arg1, class353.field5599[var12], -1, arg6, arg5);
        }
        for (int var13 = var9; var13 <= var8; var13++) {
            int[] var14 = class353.field5599[var13];
            class161.method1253(var10, var14, -1, arg6, arg5);
            class161.method1253(arg1, var14, arg0 - 65536, arg6, var7);
        }
    }
}
