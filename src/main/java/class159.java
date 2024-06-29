import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class159 extends class67 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public int field3063 = -1;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public int field3056 = 0;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Lwi;")
    public static class248 field3051 = new class248();

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Li;")
    private static class88 field3074 = class208.method1425(105, "K");

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Li;")
    public static class88 field3071 = field3074;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Li;")
    public static class88 field3073 = field3074;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Li;")
    private static class88 field3072 = class208.method1425(105, "Login server offline)3");

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3075 = 0;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Li;")
    public static class88 field3076 = field3072;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "[Lba;")
    public static class13[] field3077 = new class13[500];

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Li;")
    public static class88 field3078 = class208.method1425(105, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
    public static final int method1071(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 < 40) {
            method1074(120, -113);
        }
        field3058++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z")
    public static final boolean method1072(int arg0, byte arg1) {
        field3067++;
        if (arg1 != -52) {
            field3078 = null;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method1073(boolean arg0) {
        field3074 = null;
        field3072 = null;
        field3078 = null;
        field3071 = null;
        field3051 = null;
        field3077 = null;
        if (arg0) {
            method1073(false);
        }
        field3076 = null;
        field3073 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[B")
    public static final byte[] method1074(int arg0, int arg1) {
        field3059++;
        if (arg1 != 374) {
            method1072(36, (byte) 87);
        }
        class189 var2 = (class189) class24.field388.method666((long) arg0, 0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class119.method814(var7, var4, 54210528);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class189(var3);
            class24.field388.method664((long) arg0, var2, false);
        }
        return var2.field3660;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
    public static final void method1075(int arg0, int arg1) {
        if (arg1 != 30594) {
            field3071 = null;
        }
        class165.field3147 = 1000 / arg0;
        field3052++;
    }
}
