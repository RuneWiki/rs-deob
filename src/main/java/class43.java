import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class43 {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public int field673 = -1;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lsc;")
    private static class181 field668 = class149.method967(255, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field669 = 1;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lsc;")
    private static class181 field670 = class149.method967(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lsc;")
    public static class181 field666 = field668;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
    public static int[] field681 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lsc;")
    public static class181 field678 = class149.method967(255, "<col=ffffff>");

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lsc;")
    public static class181 field680 = field670;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lsc;")
    public static class181 field672 = class149.method967(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
    public static int[] field682 = new int[1000];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Llc;")
    public class87 field679;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field677;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[Lsc;")
    public class181[] field675;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILaf;Laf;IIIIJ)V")
    public static final void method296(int arg0, int arg1, int arg2, int arg3, class208 arg4, class208 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class106 var12 = new class106();
        var12.field1718 = arg10;
        var12.field1722 = arg1 * 128 + 64;
        var12.field1736 = arg2 * 128 + 64;
        var12.field1723 = arg3;
        var12.field1735 = arg4;
        var12.field1726 = arg5;
        var12.field1719 = arg6;
        var12.field1721 = arg7;
        var12.field1727 = arg8;
        var12.field1733 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class221.field3820[var13][arg1][arg2] == null) {
                class221.field3820[var13][arg1][arg2] = new class220(var13, arg1, arg2);
            }
        }
        class221.field3820[arg0][arg1][arg2].field3810 = var12;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method297(int arg0) {
        field672 = null;
        field678 = null;
        field677 = null;
        field670 = null;
        field668 = null;
        field680 = null;
        field682 = null;
        field666 = null;
        if (arg0 < 117) {
            method297(72);
        }
        field681 = null;
    }
}
