import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    public int[] field120 = new int[257];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "[[I")
    public int[][] field121 = new int[6][258];

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[I")
    public int[] field137 = new int[256];

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[B")
    public byte[] field125 = new byte[4096];

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[[I")
    public int[][] field133 = new int[6][258];

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[I")
    public int[] field139 = new int[16];

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public int field122 = 0;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field124 = 0;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[B")
    public byte[] field127 = new byte[256];

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[Z")
    public boolean[] field140 = new boolean[16];

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[[B")
    public byte[][] field129 = new byte[6][258];

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[Z")
    public boolean[] field134 = new boolean[256];

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "[B")
    public byte[] field141 = new byte[18002];

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[B")
    public byte[] field131 = new byte[18002];

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "[[I")
    public int[][] field154 = new int[6][258];

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[I")
    public int[] field150 = new int[6];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field128 = new String[200];

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "B")
    public byte field130;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "Lgi;")
    public static class164 field151;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[B")
    public byte[] field119;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[B")
    public byte[] field135;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        if (arg0 != 19650) {
            field151 = null;
        }
        field128 = null;
        field151 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)I")
    public static final int method66(byte arg0, int arg1) {
        field143++;
        int var2 = 0;
        if (arg0 != 109) {
            method65(-77);
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }
}
