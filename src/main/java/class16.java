import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 {

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[I")
    public static int[] field245 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Z")
    public static boolean field247 = false;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Ld;")
    public static class7 field249;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)J", line = 5)
    public static final synchronized long method115(byte arg0) {
        if (arg0 != 74) {
            field245 = null;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class5.field126) {
            class8.field172 += class5.field126 - var1;
        }
        class5.field126 = var1;
        return class8.field172 + var1;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(B)V", line = 38)
    public static void method116(byte arg0) {
        field245 = null;
        if (arg0 != -110) {
            method118(4, -56, false, 70);
        }
        field249 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II)Ln;", line = 52)
    public static final class26 method117(int arg0, int arg1) {
        int var2 = -38 % ((4 - arg1) / 52);
        return method118(53, arg0, false, 10);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIZI)Ln;", line = 73)
    private static final class26 method118(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var4 = arg1 / arg3;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg3;
            var5++;
        }
        int var6 = var5;
        if (arg1 < 0 || arg2) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg1 % arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg1 /= arg3;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class26 var10 = new class26();
        var10.field347 = var6;
        var10.field354 = var7;
        int var11 = -5 % ((arg0 + 70) / 42);
        return var10;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)I", line = 145)
    public static final int method119(int arg0) {
        if (arg0 != 255) {
            field245 = null;
        }
        if (class26.field348 == null) {
            return 0;
        } else if (class26.field348.field187 == null) {
            return class6.field146[class26.field348.field186 & 0xFF];
        } else {
            return class6.field146[class26.field348.field187[class18.field262] & 0xFF];
        }
    }
}
