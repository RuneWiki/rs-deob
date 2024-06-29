import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class180 {

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[[I")
    public int[][] field3267 = new int[6][258];

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[I")
    public int[] field3276 = new int[257];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[Z")
    public boolean[] field3262 = new boolean[16];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[B")
    public byte[] field3260 = new byte[4096];

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "[B")
    public byte[] field3289 = new byte[18002];

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[[B")
    public byte[][] field3261 = new byte[6][258];

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public int field3292 = 0;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    public int[] field3257 = new int[6];

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[[I")
    public int[][] field3279 = new int[6][258];

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[I")
    public int[] field3265 = new int[256];

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "[B")
    public byte[] field3291 = new byte[256];

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[Z")
    public boolean[] field3278 = new boolean[256];

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    public int[] field3271 = new int[16];

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "[[I")
    public int[][] field3288 = new int[6][258];

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "[B")
    public byte[] field3293 = new byte[18002];

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public int field3295 = 0;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[I")
    public static int[] field3274 = new int[32];

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lud;")
    public static class279 field3275 = class130.method1024("welle2:", 255);

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Lud;")
    public static class279 field3285 = class130.method1024("welle:", 255);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "B")
    public byte field3269;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "J")
    public static long field3290;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lda;")
    public static class120 field3255;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[B")
    public byte[] field3258;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "[B")
    public byte[] field3282;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lrj;")
    public static class18[] field3264;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V", line = 31)
    public static final void method1399(int arg0, byte arg1) {
        if (class50.field1042 == null) {
            class50.field1042 = new byte[4][104][104];
        }
        field3287++;
        int var2 = 95 / ((arg0 + 11) / 50);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class50.field1042[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 126)
    public static void method1400(int arg0) {
        field3264 = null;
        field3285 = null;
        field3274 = null;
        if (arg0 != 20525) {
            method1399(-48, (byte) -33);
        }
        field3255 = null;
        field3275 = null;
    }
}
