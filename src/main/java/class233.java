import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class233 extends class61 {

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[Lmj;")
    public class111[] field4050 = new class111[5];

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "[I")
    public int[] field4064 = new int[5];

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public int field4062 = 0;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "[I")
    public static int[] field4042 = new int[2048];

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "[I")
    public static int[] field4043 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lfi;")
    public class108 field4056;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Ltg;")
    public class176 field4063;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Lgj;")
    public class224 field4066;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lqf;")
    public class233 field4060;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Lah;")
    public class265 field4065;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lf;")
    public class36 field4051;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Lpd;")
    public class56 field4052;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4046;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Z")
    public boolean field4059;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Z")
    public boolean field4067;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Z")
    public boolean field4068;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)I")
    public static final int method1646(int arg0, boolean arg1) {
        if (!arg1) {
            field4043 = null;
        }
        field4061++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V")
    public class233(int arg0, int arg1, int arg2) {
        this.field4047 = arg1;
        this.field4048 = arg2;
        this.field4053 = this.field4049 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field4046 = null;
        field4042 = null;
        field4043 = null;
        if (arg0 != 156) {
            field4043 = null;
        }
    }
}
