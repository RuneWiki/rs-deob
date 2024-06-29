import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field17 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[[I")
    public int[][] field16 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[Z")
    public boolean[] field30 = new boolean[16];

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    public int[] field18 = new int[6];

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Z")
    public boolean[] field27 = new boolean[256];

    @OriginalMember(owner = "client!il", name = "t", descriptor = "[B")
    public byte[] field35 = new byte[256];

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[I")
    public int[] field28 = new int[16];

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field34 = 0;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[[I")
    public int[][] field26 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[B")
    public byte[] field20 = new byte[4096];

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[B")
    public byte[] field24 = new byte[18002];

    @OriginalMember(owner = "client!il", name = "y", descriptor = "[[B")
    public byte[][] field40 = new byte[6][258];

    @OriginalMember(owner = "client!il", name = "u", descriptor = "[[I")
    public int[][] field36 = new int[6][258];

    @OriginalMember(owner = "client!il", name = "I", descriptor = "[B")
    public byte[] field50 = new byte[18002];

    @OriginalMember(owner = "client!il", name = "J", descriptor = "[I")
    public int[] field51 = new int[257];

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
    public int[] field19 = new int[256];

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Lte;")
    public static class244 field29 = new class244(64);

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
    public static boolean field45 = false;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "B")
    public byte field37;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[B")
    public byte[] field41;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[B")
    public byte[] field42;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        int var1 = -35 % ((arg0 - 9) / 58);
        field29 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public static final void method15(int arg0, int arg1, int arg2) {
        class233 var3 = class114.method746(arg2, arg1 ^ 0xB6CC64D2, 12);
        var3.method1651((byte) 121);
        if (arg1 != -9166) {
            field29 = null;
        }
        field53++;
        var3.field3855 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BZ)V")
    public static final void method16(byte arg0, boolean arg1) {
        field52++;
        int var2 = 31 / ((arg0 + 68) / 39);
        if (arg1 != class263.field4251) {
            class263.field4251 = arg1;
            class30.method172(-94);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        class19.field243.method1701((byte) 101);
        if (arg0 < 51) {
            field46 = -94;
        }
        field47++;
    }
}
