import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ea")
public class class42 {

    @OriginalMember(owner = "ea", name = "b", descriptor = "Llf;")
    public static class109 field874 = class35.method275(")3", 2);

    @OriginalMember(owner = "ea", name = "a", descriptor = "Llf;")
    public static class109 field873 = class35.method275("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 2);

    @OriginalMember(owner = "ea", name = "g", descriptor = "[I")
    public static int[] field879 = new int[2000];

    @OriginalMember(owner = "ea", name = "e", descriptor = "I")
    public static int field877 = 0;

    @OriginalMember(owner = "ea", name = "j", descriptor = "[I")
    public static int[] field882 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "ea", name = "d", descriptor = "Llf;")
    public static class109 field876 = class35.method275("Bitte geben Sie Ihren Benutzenamen ein)3", 2);

    @OriginalMember(owner = "ea", name = "k", descriptor = "Llf;")
    private static class109 field883 = class35.method275("Loaded input handler", 2);

    @OriginalMember(owner = "ea", name = "m", descriptor = "[I")
    public static int[] field885 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "ea", name = "n", descriptor = "Llf;")
    public static class109 field886 = class35.method275("<br>(X100(U(Y", 2);

    @OriginalMember(owner = "ea", name = "f", descriptor = "Llf;")
    public static class109 field878 = field883;

    @OriginalMember(owner = "ea", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "ea", name = "h", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "ea", name = "l", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "ea", name = "i", descriptor = "Lkf;")
    public static class100 field881;

    @OriginalMember(owner = "ea", name = "a", descriptor = "(I)V")
    public static void method303(int arg0) {
        field876 = null;
        field882 = null;
        field879 = null;
        field883 = null;
        field881 = null;
        field878 = null;
        field886 = null;
        field874 = null;
        field873 = null;
        field885 = null;
        if (arg0 != -11830) {
            field878 = null;
        }
    }

    @OriginalMember(owner = "ea", name = "a", descriptor = "(II)Z")
    public static final boolean method304(int arg0, int arg1) {
        field875++;
        if (arg1 != 2547355) {
            method304(-8, 16);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "ea", name = "a", descriptor = "(ILid;)V")
    public static final void method305(int arg0, class82 arg1) {
        field884++;
        class136.method980(false, arg1, 200000);
        if (arg0 != 24087) {
            field874 = null;
        }
    }

    @OriginalMember(owner = "ea", name = "a", descriptor = "(III)Led;")
    public static final class45 method306(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field13; var4++) {
            class45 var5 = var3.field17[var4];
            if ((var5.field949 >> 29 & 0x3L) == 2L && var5.field947 == arg1 && var5.field932 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
