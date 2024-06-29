import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 extends class253 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Ljd;")
    public static class85 field270 = class221.method1499(")4l=", (byte) -52);

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[[I")
    public static int[][] field269 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!he", name = "x", descriptor = "S")
    public static short field273 = 256;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Ljd;")
    public static class85 field274 = class221.method1499("Spieler", (byte) -98);

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method134(int arg0) {
        field268++;
        class15.field208.method1270((byte) 107);
        if (arg0 != 5) {
            field270 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method135(byte arg0) {
        field269 = null;
        field270 = null;
        field274 = null;
        if (arg0 != -72) {
            method134(27);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II)V")
    public class19(int arg0, int arg1) {
        this.field271 = arg1;
        this.field272 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILge;II)Lee;")
    public static final class266 method136(int arg0, class68 arg1, int arg2, int arg3) {
        if (arg3 >= -27) {
            method135((byte) 91);
        }
        field277++;
        return class253.method1750(arg0, arg1, (byte) 119, arg2) ? class112.method762(17562) : null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
    public static final int method137(byte arg0, int arg1) {
        field276++;
        if (arg0 != -117) {
            method134(113);
        }
        return arg1 & 0x7F;
    }
}
