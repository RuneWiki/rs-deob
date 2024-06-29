import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class134 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field2242 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2241 = 2;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lok;")
    public static class146 field2246 = class235.method1724(-12908, "0(U");

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field2250 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lok;")
    public static class146 field2249 = class235.method1724(-12908, "Impossible de trouver ");

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 10)
    public static void method990(int arg0) {
        field2249 = null;
        field2246 = null;
        if (arg0 != 227) {
            field2246 = (class146) null;
        }
        field2250 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)[Lan;", line = 28)
    public static final class315[] method991(boolean arg0) {
        class315[] var1 = new class315[class241.field4004];
        if (arg0) {
            method990(3);
        }
        for (int var2 = 0; var2 < class241.field4004; var2++) {
            var1[var2] = new class315(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], class17.field353[var2], class94.field1514);
        }
        field2247++;
        class301.method2122((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lwe;BI)V", line = 54)
    private final void method992(class47 arg0, byte arg1, int arg2) {
        if (arg2 == 5) {
            this.field2242 = arg0.method379(-2);
        }
        if (arg1 != 87) {
            this.method992((class47) null, (byte) -124, 68);
        }
        field2248++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 83)
    public static final void method993(byte arg0) {
        if (arg0 != 29) {
            method993((byte) 115);
        }
        class168.field2833.method793((byte) -79);
        field2244++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILwe;)V", line = 97)
    public final void method994(int arg0, class47 arg1) {
        if (arg0 != 0) {
            this.field2242 = -68;
        }
        field2243++;
        while (true) {
            int var3 = arg1.method368(-124);
            if (var3 == 0) {
                return;
            }
            this.method992(arg1, (byte) 87, var3);
        }
    }
}
