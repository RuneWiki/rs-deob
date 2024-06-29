import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class416 {

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[[I")
    public int[][] field5907 = new int[6][258];

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[B")
    public byte[] field5910 = new byte[256];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[[B")
    public byte[][] field5909 = new byte[6][258];

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field5903 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[B")
    public byte[] field5905 = new byte[4096];

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[Z")
    public boolean[] field5915 = new boolean[16];

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "[Z")
    public boolean[] field5912 = new boolean[256];

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "[[I")
    public int[][] field5922 = new int[6][258];

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[I")
    public int[] field5927 = new int[256];

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public int field5930 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
    public int[] field5904 = new int[6];

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "[[I")
    public int[][] field5931 = new int[6][258];

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "[B")
    public byte[] field5933 = new byte[18002];

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[I")
    public int[] field5924 = new int[257];

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[B")
    public byte[] field5919 = new byte[18002];

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "[I")
    public int[] field5935 = new int[16];

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "B")
    public byte field5906;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field5902;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field5911;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field5916;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field5917;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field5918;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field5920;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field5925;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public int field5928;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field5929;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[B")
    public byte[] field5913;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "[B")
    public byte[] field5934;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I", line = 33)
    public static final int method2473(int arg0, int arg1, int arg2) {
        field5908++;
        int var3 = 49 / ((arg2 - 77) / 35);
        int var4 = class144.method1116(arg0 + 91923, 4, false, arg1 + 45365) - (128 - (class144.method1116(arg0 + 37821, 2, false, arg1 + 10294) - 128 >> 1) - (class144.method1116(arg0, 1, false, arg1) + -128 >> 2));
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }
}
