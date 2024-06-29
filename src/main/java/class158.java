import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class158 extends class142 {

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    private int field3044 = 0;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    private int field3047 = 1;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    private int field3052 = 0;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "[Lmc;")
    public static class112[] field3046 = new class112[4];

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lai;")
    public static class10 field3042 = class44.method278("Clientscript error in: ", -54);

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "J")
    public static long field3048 = 0L;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "[I")
    public static int[] field3050 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "[I")
    public static int[] field3049 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Lje;")
    public static class87 field3053;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 < -34) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 3) {
                        this.field3047 = arg0.method767(true);
                    }
                } else {
                    this.field3044 = arg0.method767(true);
                }
            } else {
                this.field3052 = arg0.method767(true);
            }
            ++field3040;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field3051;
        class58.method392(97);
        if (arg0 != -1) {
            this.method6(true, 85);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
    public static final int method1058(int arg0, int arg1, byte arg2) {
        int var3 = -59 % ((arg2 - -33) / 53);
        int var4 = 1;
        ++field3041;
        while (arg0 > 1) {
            if ((arg0 & 1) != 0) {
                var4 = arg1 * var4;
            }
            arg0 >>= 1;
            arg1 *= arg1;
        }
        if (~arg0 == -2) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        ++field3043;
        if (arg0) {
            this.field3044 = 70;
        }
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class133.field2499; ++var6) {
                int var7 = class79.field1395[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field3052 == -1) {
                    var9 = (-var4 + var7) * this.field3047;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) (var10 / 4096)) * 4096.0D);
                    var9 = (int) ((double) (this.field3047 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field3044 == -1) {
                    var12 = class196.field3709[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field3044 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static void method1059(byte arg0) {
        field3050 = null;
        field3042 = null;
        if (arg0 == -3) {
            field3053 = null;
            field3049 = null;
            field3046 = null;
        }
    }
}
