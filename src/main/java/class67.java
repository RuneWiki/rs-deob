import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
    public static int[] field1668 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lja;")
    private static class62 field1669 = class30.method243(43, "Prepared sound engine");

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lja;")
    public static class62 field1667 = field1669;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lqa;")
    public static class111 field1670 = new class111();

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Z")
    public static volatile boolean field1672 = true;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lja;")
    public static class62 field1673 = class30.method243(43, "headicons_pk");

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lja;")
    private static class62 field1671 = class30.method243(43, "Loading fonts )2 ");

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lja;")
    public static class62 field1677 = class30.method243(43, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lja;")
    private static class62 field1679 = class30.method243(43, "Loaded textures");

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
    public static int[] field1676 = new int[4000];

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lja;")
    public static class62 field1678 = field1671;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lja;")
    public static class62 field1680 = field1679;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lja;")
    public static class62 field1681 = class30.method243(43, "::noclip");

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lja;")
    public static class62 field1675 = class30.method243(43, "runes");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[Lq;")
    public static class114[] field1674;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)I")
    public static final int method527(byte arg0, int arg1, int arg2) {
        if (arg0 != 127) {
            field1670 = null;
        }
        field1665++;
        long var3 = (long) ((arg2 << 16) + arg1);
        return class9.field242 != null && class9.field242.field3493 == var3 ? class146.field3438.field2873 * 99 / (class146.field3438.field2874.length - class9.field242.field1166) + 1 : 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1676 = null;
        field1667 = null;
        field1675 = null;
        field1677 = null;
        field1669 = null;
        int var1 = -108 % ((arg0 - 2) / 47);
        field1680 = null;
        field1671 = null;
        field1679 = null;
        field1673 = null;
        field1668 = null;
        field1678 = null;
        field1670 = null;
        field1674 = null;
        field1681 = null;
    }
}
