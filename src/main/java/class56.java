import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public static int[] field1394 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lu;")
    public static class136 field1400 = new class136();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1404 = 1;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1405 = new int[128];

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lfc;")
    private static class39 field1406 = class90.method774("Moderator option: Mute player for 48 hours: <ON>", -116);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lfc;")
    public static class39 field1408 = field1406;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lfc;")
    public static class39 field1403 = class90.method774(" )2> <col=ff9040>", -82);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1410 = -1;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lmf;")
    public static class89 field1407;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 3)
    public static final void method578(int arg0, int arg1) {
        class1 var2 = (class1) class78.field1773.method995(false, (long) arg0);
        if (arg1 != 128) {
            method578(-87, -121);
        }
        field1397++;
        if (var2 != null) {
            var2.method1170(48);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 43)
    public static void method579(int arg0) {
        field1407 = null;
        field1405 = null;
        if (arg0 >= -78) {
            return;
        }
        field1400 = null;
        field1406 = null;
        field1403 = null;
        field1408 = null;
        field1394 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 75)
    public class56() {
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 80)
    public static final void method580(int arg0, int arg1) {
        class1 var2 = (class1) class78.field1773.method995(false, (long) arg1);
        field1401++;
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field25.length; var3++) {
            var2.field25[var3] = -1;
            var2.field29[var3] = 0;
        }
        if (arg0 != 11730) {
            field1410 = -76;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Li;)V", line = 107)
    public class56(class56 arg0) {
        this.field1399 = arg0.field1399;
        this.field1393 = arg0.field1393;
        this.field1395 = arg0.field1395;
        this.field1398 = arg0.field1398;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Z", line = 119)
    public static final boolean method581(byte arg0, int arg1) {
        field1402++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            int var2 = -125 / ((arg0 - 61) / 34);
            return false;
        }
    }
}
