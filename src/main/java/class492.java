import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class492 {

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[Liq;")
    public static class438[] field7261 = new class438[128];

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
    public static boolean field7257 = false;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "[[I")
    public static int[][] field7264 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Lvc;")
    public static class211 field7255;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public static int[] field7256;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
    public static int[] field7263;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIB)I")
    public static final int method2934(int arg0, int arg1, byte arg2) {
        field7262++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -90 / ((arg2 + 32) / 44);
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method2935(int arg0) {
        field7261 = null;
        field7255 = null;
        if (arg0 < 116) {
            method2936(-79, -60);
        }
        field7264 = null;
        field7256 = null;
        field7263 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
    public static final void method2936(int arg0, int arg1) {
        field7260++;
        class177 var2 = class344.method2229(arg0, arg1, (byte) 96);
        var2.method1194(arg0 ^ 0xFFFFFFD6);
    }
}
