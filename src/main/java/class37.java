import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lje;")
    private static class67 field674 = class85.method592(255, "Unable to find ");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lje;")
    public static class67 field666 = field674;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field669 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lje;")
    private static class67 field673 = class85.method592(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
    public static int[] field670 = new int[1000];

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[J")
    public static long[] field676 = new long[32];

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lje;")
    public static class67 field675 = field673;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lm;")
    public static class83 field667;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
    public static int[] field672;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method233(int arg0) {
        field669 = null;
        field670 = null;
        field675 = null;
        field673 = null;
        if (arg0 != 25655) {
            return;
        }
        field674 = null;
        field676 = null;
        field666 = null;
        field672 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZ)Lje;")
    public static final class67 method234(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        int var5 = arg2 / arg0;
        field671++;
        while (var5 != 0) {
            var4++;
            var5 /= arg0;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        if (arg1 != 135) {
            return null;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg2 /= arg0;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class67 var9 = new class67();
        var9.field1324 = var7;
        var9.field1307 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lje;")
    public static final class67 method235(byte arg0, int arg1) {
        field677++;
        if (arg0 != 1) {
            method233(-22);
        }
        return class31.field543[arg1].method445(false) <= 0 ? class55.field1095[arg1] : class49.method314(new class67[] { class55.field1095[arg1], class117.field2645, class31.field543[arg1] }, arg0 - 1);
    }
}
