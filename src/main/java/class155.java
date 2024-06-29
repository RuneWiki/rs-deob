import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class155 extends class71 {

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    private int field2801 = 0;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field2797 = 0;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    private int field2802 = 1;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "[I")
    public static int[] field2796 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "Lud;")
    public static class279 field2800 = class130.method1024("::fpsoff", 255);

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field2806 = -1;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "Lom;")
    public static class70 field2805;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)[I", line = 5)
    public final int[] method199(int arg0, byte arg1) {
        field2807++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (arg1 > -69) {
            method1219(-75);
        }
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class215.field3787; var6++) {
                int var7 = class133.field2424[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2801 == 0) {
                    var11 = (var7 - var4) * this.field2802;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2802 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2797 == 0) {
                    var12 = class278.field4909[(var12 & 0xFFD) >> 4] + 4096 >> 1;
                } else if (this.field2797 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 180)
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZLvh;)V", line = 95)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field2798++;
        if (!arg1) {
            field2800 = (class279) null;
        }
        if (arg0 == 0) {
            this.field2801 = arg2.method483(-106);
        } else if (arg0 == 1) {
            this.field2797 = arg2.method483(-127);
        } else if (arg0 == 3) {
            this.field2802 = arg2.method483(-112);
        }
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V", line = 143)
    public static void method1219(int arg0) {
        field2805 = null;
        field2800 = null;
        field2796 = null;
        int var1 = -87 % ((arg0 + 35) / 53);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 164)
    public final void method627(int arg0) {
        if (arg0 != 7) {
            this.method77(13, true, (class53) null);
        }
        field2799++;
        class75.method644(93);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(III)I", line = 186)
    public static final int method1220(int arg0, int arg1, int arg2) {
        class109 var3 = (class109) class103.field1928.method610((long) arg0, -1);
        field2808++;
        if (var3 == null) {
            return 0;
        }
        if (arg1 >= -119) {
            method1219(-97);
        }
        if (arg2 == -1) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2013.length; var5++) {
            if (var3.field2019[var5] == arg2) {
                var4 += var3.field2013[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)V", line = 228)
    public static final void method1221(byte arg0) {
        field2809++;
        if (!class178.field3208) {
            return;
        }
        class287.field5129 = null;
        if (arg0 >= -81) {
            method1219(-10);
        }
        class178.field3224 = null;
        class178.field3208 = false;
    }
}
