import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class170 extends class12 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "J")
    public long field3069;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lvf;")
    private static class265 field3074 = class87.method582(-46, "Starting 3d Library");

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "[I")
    public static int[] field3070 = new int[500];

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Lvf;")
    public static class265 field3071 = field3074;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = -15 % ((69 - arg6) / 54);
        field3078++;
        if (arg1 == arg3) {
            class110.method731(arg7, arg1, arg5, 106, arg2, arg4, arg0);
        } else if ((arg0 - arg1) >= class107.field1890 && class79.field1510 >= (arg0 + arg1) && class81.field1521 <= (arg4 - arg3) && class205.field3681 >= (arg3 + arg4)) {
            class279.method1903((byte) -98, arg5, arg0, arg7, arg4, arg1, arg3, arg2);
        } else {
            class146.method1010(false, arg5, arg0, arg7, arg2, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static final void method1123(int arg0) {
        class54.field1112.method1888((byte) 120);
        if (arg0 != 0) {
            method1126((byte[]) null, 73, -22, -60);
        }
        field3073++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
    public static final void method1124(boolean arg0, int arg1) {
        field3072++;
        byte var2 = 4;
        byte[][] var3 = class254.field4372;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class111.field1953[var5] >> 8) * 64 - class64.field1248;
            byte[] var12 = var3[var5];
            int var13 = (class111.field1953[var5] & 0xFF) * 64 - class231.field4073;
            if (var12 != null) {
                class44.method369(true);
                class211.method1447(arg0, class130.field2279, class105.field1850 * 8 - 48, class45.field1006 * 8 + -48, var12, var13, var11, false);
            }
        }
        if (arg1 != 64) {
            field3075 = 97;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class111.field1953[var6] >> 8) * 64 - class64.field1248;
            byte[] var8 = var3[var6];
            int var9 = (class111.field1953[var6] & 0xFF) * 64 - class231.field4073;
            if (var8 == null && class105.field1850 < 800) {
                class44.method369(true);
                for (int var10 = 0; var10 < var2; var10++) {
                    class252.method1669(var10, var7, -17939, var9, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
    public static void method1125(int arg0) {
        if (arg0 != 255) {
            method1122(-14, 8, -127, -83, 104, 114, (byte) -85, 25);
        }
        field3071 = null;
        field3074 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class170() {
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(J)V")
    public class170(long arg0) {
        this.field3069 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIII)I")
    public static final int method1126(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -54) {
            field3075 = -41;
        }
        field3076++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = class198.field3534[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }
}
