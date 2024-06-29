import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class141 {

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field2174;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
    public int[] field2171;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[[I")
    public int[][] field2162;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lkd;")
    public static class73 field2164 = class126.method1070((byte) -66, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[I")
    public static int[] field2166 = new int[99];

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "[[S")
    public static short[][] field2167 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lkd;")
    public static class73 field2165 = class126.method1070((byte) -66, "Sprites geladen)3");

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2169 = -1;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lkd;")
    public static class73 field2170 = class126.method1070((byte) -66, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Lkd;")
    private static class73 field2180;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "[[B")
    public static byte[][] field2187;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "Lkd;")
    public static class73 field2186;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "[I")
    public static int[] field2185;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Lkd;")
    public static class73 field2182;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lkd;")
    public static class73 field2178;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Lkd;")
    private static class73 field2179;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "Lkd;")
    public static class73 field2188;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Lqe;")
    public static class116 field2181;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lde;")
    public static class27 field2184;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "[[[B")
    public static byte[][][] field2163;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method718(int arg0) {
        field2164 = null;
        field2180 = null;
        field2182 = null;
        field2179 = null;
        if (arg0 != 129) {
            return;
        }
        field2165 = null;
        field2181 = null;
        field2163 = null;
        field2170 = null;
        field2187 = null;
        field2166 = null;
        field2186 = null;
        field2188 = null;
        field2167 = null;
        field2185 = null;
        field2184 = null;
        field2178 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
    public static final void method719(byte arg0, int arg1) {
        field2168++;
        if (arg0 != -24) {
            return;
        }
        class2 var2 = (class2) class70.field1768.method1099(97, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field141.length; var3++) {
                var2.field141[var3] = -1;
                var2.field151[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lkd;")
    public static final class73 method720(int arg0, int arg1) {
        if (arg0 <= 6) {
            method721(26);
        }
        field2175++;
        class73 var2 = new class73();
        var2.field1880 = 0;
        var2.field1858 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method721(int arg0) {
        field2172++;
        class30.field849.method534((byte) -89);
        class44.field1171.method534((byte) 121);
        int var1 = 98 % ((arg0 - 66) / 43);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
    public class86(int arg0, byte[] arg1) {
        this.field2173 = arg0;
        class114 var3 = new class114(arg1);
        this.field2174 = var3.method957((byte) 39);
        this.field2171 = new int[this.field2174];
        this.field2162 = new int[this.field2174][];
        for (int var4 = 0; var4 < this.field2174; var4++) {
            this.field2171[var4] = var3.method957((byte) 63);
        }
        for (int var5 = 0; var5 < this.field2174; var5++) {
            this.field2162[var5] = new int[var3.method957((byte) 83)];
        }
        for (int var6 = 0; var6 < this.field2174; var6++) {
            for (int var7 = 0; var7 < this.field2162[var6].length; var7++) {
                this.field2162[var6][var7] = var3.method957((byte) 114);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2166[var1] = var0 / 4;
        }
        field2177 = 0;
        field2180 = class126.method1070((byte) -66, "Examine");
        field2187 = new byte[1000][];
        field2186 = class126.method1070((byte) -66, "mapback");
        field2185 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };
        field2183 = 128;
        field2176 = -1;
        field2182 = class126.method1070((byte) -66, "Okay");
        field2178 = field2180;
        field2179 = class126.method1070((byte) -66, "Malformed login packet)3");
        field2188 = field2179;
    }
}
