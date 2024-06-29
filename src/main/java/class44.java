import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class44 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lqe;")
    public static class168 field574 = class66.method448("details)3dat", 49);

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[Lcc;")
    public static class246[] field579 = new class246[4];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field575 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lqe;")
    public static class168 field577 = class66.method448("(Y", 81);

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lfd;")
    public static class11 field580;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method292(int arg0) {
        field575 = null;
        field574 = null;
        if (arg0 != 92) {
            field578 = -2;
        }
        field579 = null;
        field577 = null;
        field580 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIILmj;)V")
    public static final void method293(byte arg0, int arg1, int arg2, int arg3, class129 arg4) {
        field582++;
        if (arg0 >= -39) {
            return;
        }
        if (class242.field4198 >= 3) {
            class216.method1413(arg1, arg3, 0, arg4.field2150, arg4.field2206);
        } else {
            ((class15) class176.field3084).method63(arg1, arg3, arg4.field2175, arg4.field2210, class176.field3084.field914 / 2, class176.field3084.field912 / 2, class103.field1665, 256, arg4.field2150, arg4.field2206);
        }
        class255.field4409[arg2] = true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public static final void method294(int arg0, int arg1) {
        class32.field385.method311((byte) 16, new class172(arg1));
        field581++;
        if (arg0 != 63) {
            field574 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static final void method295(boolean arg0) {
        class133.field2330 = null;
        if (arg0) {
            method294(-109, -51);
        }
        field576++;
        class199.field3432 = null;
        class42.field557 = null;
    }
}
