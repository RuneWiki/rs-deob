import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class424 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[[I")
    public int[][] field6240 = new int[6][258];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field6239 = 0;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "[[I")
    public int[][] field6247 = new int[6][258];

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "[I")
    public int[] field6243 = new int[6];

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
    public byte[] field6242 = new byte[4096];

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "[Z")
    public boolean[] field6249 = new boolean[16];

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "[B")
    public byte[] field6255 = new byte[256];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public int field6246 = 0;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "[[I")
    public int[][] field6264 = new int[6][258];

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "[Z")
    public boolean[] field6261 = new boolean[256];

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "[[B")
    public byte[][] field6273 = new byte[6][258];

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "[B")
    public byte[] field6270 = new byte[18002];

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "[I")
    public int[] field6268 = new int[16];

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "[B")
    public byte[] field6275 = new byte[18002];

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "[I")
    public int[] field6276 = new int[256];

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "[I")
    public int[] field6266 = new int[257];

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6259 = "glow1:";

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "[I")
    public static int[] field6271 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "B")
    public byte field6248;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public int field6241;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public int field6244;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public int field6250;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public int field6252;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public int field6253;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public int field6277;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "[B")
    public byte[] field6256;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "[B")
    public byte[] field6263;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "[I")
    public static int[] field6251;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "[[[B")
    public static byte[][][] field6267;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
    public static final void method2701(int arg0, int arg1) {
        class237.field3160.method1142((byte) -106, arg1);
        if (arg0 != 6) {
            field6267 = null;
        }
        field6254++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)I")
    public static final int method2702(boolean arg0, int arg1) {
        field6245++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFA1) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (arg0) {
            return -67;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method2703(int arg0) {
        field6267 = null;
        if (arg0 > -59) {
            field6267 = null;
        }
        field6271 = null;
        field6259 = null;
        field6251 = null;
    }
}
