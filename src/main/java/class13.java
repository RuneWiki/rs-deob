import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class13 {

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "[I")
    public int[] field97 = new int[16];

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "[B")
    public byte[] field106 = new byte[4096];

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "I")
    public int field98 = 0;

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "[B")
    public byte[] field105 = new byte[256];

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "I")
    public int field103 = 0;

    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "[Z")
    public boolean[] field109 = new boolean[16];

    @OriginalMember(owner = "mapview!h", name = "z", descriptor = "[[I")
    public int[][] field121 = new int[6][258];

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "[Z")
    public boolean[] field104 = new boolean[256];

    @OriginalMember(owner = "mapview!h", name = "v", descriptor = "[I")
    public int[] field117 = new int[257];

    @OriginalMember(owner = "mapview!h", name = "t", descriptor = "[[I")
    public int[][] field115 = new int[6][258];

    @OriginalMember(owner = "mapview!h", name = "E", descriptor = "[[I")
    public int[][] field126 = new int[6][258];

    @OriginalMember(owner = "mapview!h", name = "w", descriptor = "[B")
    public byte[] field118 = new byte[18002];

    @OriginalMember(owner = "mapview!h", name = "F", descriptor = "[I")
    public int[] field127 = new int[256];

    @OriginalMember(owner = "mapview!h", name = "I", descriptor = "[I")
    public int[] field130 = new int[6];

    @OriginalMember(owner = "mapview!h", name = "A", descriptor = "[B")
    public byte[] field122 = new byte[18002];

    @OriginalMember(owner = "mapview!h", name = "K", descriptor = "[[B")
    public byte[][] field132 = new byte[6][258];

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "mapview!h", name = "x", descriptor = "Ll;")
    public static class21 field119 = class28.method185(-20839, "Dungeon");

    @OriginalMember(owner = "mapview!h", name = "u", descriptor = "Ll;")
    public static class21 field116 = class28.method185(-20839, "Gem Shop");

    @OriginalMember(owner = "mapview!h", name = "H", descriptor = "Ll;")
    public static class21 field129 = class28.method185(-20839, "Silk Trader");

    @OriginalMember(owner = "mapview!h", name = "J", descriptor = "I")
    public static int field131 = 1;

    @OriginalMember(owner = "mapview!h", name = "o", descriptor = "B")
    public byte field110;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "mapview!h", name = "r", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "mapview!h", name = "s", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "mapview!h", name = "y", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "mapview!h", name = "B", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "mapview!h", name = "C", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "mapview!h", name = "D", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "mapview!h", name = "G", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "[B")
    public byte[] field111;

    @OriginalMember(owner = "mapview!h", name = "q", descriptor = "[B")
    public byte[] field112;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 20)
    public static void method40(byte arg0) {
        field119 = null;
        if (arg0 <= 26) {
            method41(-100, (byte) 42, null, 25);
        }
        field116 = null;
        field129 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IB[BI)Ll;", line = 38)
    public static final class21 method41(int arg0, byte arg1, byte[] arg2, int arg3) {
        class21 var4 = new class21();
        var4.field197 = new byte[arg0];
        var4.field204 = 0;
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field197[var4.field204++] = arg2[var5];
            }
        }
        if (arg1 != -95) {
            field119 = null;
        }
        return var4;
    }
}
