import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class107 extends class172 {

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Lhl;")
    public class39 field1848;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "[I")
    public static int[] field1844 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "[Lpb;")
    public static class127[] field1851 = new class127[2048];

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field1852 = 1;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "[I")
    public static int[] field1846;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BI)Lmb;")
    public static final class160 method744(byte[] arg0, int arg1) {
        field1850++;
        if (arg0 == null) {
            return null;
        }
        class12 var2 = new class12(arg0, class147.field2651, class18.field259, class283.field5005, class55.field991, class73.field1276);
        if (arg1 != 174) {
            field1852 = -7;
        }
        class103.method731(false);
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public static final void method745(int arg0, int arg1) {
        class98 var2 = class86.field1570;
        synchronized (class86.field1570) {
            class183.field3314 = arg0;
        }
        if (arg1 <= 61) {
            method745(-77, 56);
        }
        field1843++;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1844 = null;
        field1846 = null;
        field1851 = null;
        if (arg0 < 104) {
            method745(60, 62);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lhl;)V")
    public class107(class39 arg0) {
        this.field1848 = arg0;
    }
}
