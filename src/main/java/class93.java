import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class93 extends class149 {

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public int field1739 = 0;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "Lsg;")
    private static class169 field1742 = class165.method1060("shake:", 1536);

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Lsg;")
    public static class169 field1736 = class165.method1060("Zu viele Anmelde)2Versuche von Ihrer Adresse", 1536);

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Lsg;")
    public static class169 field1738 = field1742;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Lsg;")
    public static class169 field1743 = field1742;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "[Lqd;")
    public static class148[] field1748 = new class148[256];

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
    public static int[] field1749 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lke;")
    public static class95 field1747;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static void method541(byte arg0) {
        field1743 = null;
        field1736 = null;
        field1749 = null;
        field1738 = null;
        int var1 = 85 / ((-arg0 - 56) / 35);
        field1748 = null;
        field1742 = null;
        field1747 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3) {
        field1740++;
        class150 var4 = class121.method755(arg1, -5207, arg0);
        if (arg2 != 8249) {
            return;
        }
        if (var4 != null && var4.field2793 != null) {
            class200 var5 = new class200();
            var5.field3911 = var4.field2793;
            var5.field3907 = var4;
            class172.method1147(-19955, var5);
        }
        class134.field2517 = arg1;
        class11.field269 = arg3;
        class6.field114 = arg0;
        class17.field380 = true;
        class64.method404(92, var4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Loa;I)V")
    public final void method543(class127 arg0, int arg1) {
        field1744++;
        while (true) {
            int var3 = arg0.method819((byte) 22);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field1743 = null;
                    return;
                }
            }
            this.method545(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Z")
    public static final boolean method544(byte arg0) {
        field1741++;
        if (class201.field3927 == 0) {
            if (arg0 < 46) {
                field1747 = null;
            }
            return class154.field2971.method1096(false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLoa;)V")
    private final void method545(int arg0, boolean arg1, class127 arg2) {
        if (!arg1) {
            method542(-58, 19, 104, -30);
        }
        if (arg0 == 5) {
            this.field1739 = arg2.method785(true);
        }
        field1737++;
    }
}
