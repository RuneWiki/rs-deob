import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[B")
    public byte[] field121 = new byte[256];

    @OriginalMember(owner = "client!il", name = "h", descriptor = "[[I")
    public int[][] field128 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field127 = 0;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field137 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[I")
    public int[] field135 = new int[257];

    @OriginalMember(owner = "client!il", name = "t", descriptor = "[I")
    public int[] field140 = new int[256];

    @OriginalMember(owner = "client!il", name = "x", descriptor = "[Z")
    public boolean[] field144 = new boolean[256];

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[[I")
    public int[][] field130 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[[I")
    public int[][] field142 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[Z")
    public boolean[] field147 = new boolean[16];

    @OriginalMember(owner = "client!il", name = "E", descriptor = "[B")
    public byte[] field151 = new byte[18002];

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
    public int[] field148 = new int[16];

    @OriginalMember(owner = "client!il", name = "G", descriptor = "[I")
    public int[] field153 = new int[6];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[[B")
    public byte[][] field125 = new byte[6][258];

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[B")
    public byte[] field138 = new byte[4096];

    @OriginalMember(owner = "client!il", name = "w", descriptor = "[B")
    public byte[] field143 = new byte[18002];

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Ljia;")
    public static class645 field124 = new class645();

    @OriginalMember(owner = "client!il", name = "l", descriptor = "B")
    public byte field132;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "D")
    public static double field157;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[B")
    public byte[] field131;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[B")
    public byte[] field146;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILha;II)V", line = 14)
    public static final void method49(int arg0, class66 arg1, int arg2, int arg3) {
        class378.field5161 = new class28[arg2][arg0];
        field134++;
        class205.field3095 = arg1;
        int var4 = 106 / ((arg3 - 25) / 58);
        if (class155.field2535 != null) {
            class346.field4666 = class347.method2147(class155.field2535[5], 119, class155.field2535[3], class155.field2535[4], class155.field2535[0], class155.field2535[1], class155.field2535[2]);
        }
        class241.field3435 = new class28();
        class15.method84(0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 44)
    public static void method50(int arg0) {
        field124 = null;
        if (arg0 != 256) {
            field124 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)I", line = 79)
    public static final int method51(boolean arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0) {
            return 105;
        }
        field152++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
