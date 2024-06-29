import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class176 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[[B")
    public byte[][] field3334 = new byte[6][258];

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[[I")
    public int[][] field3344 = new int[6][258];

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[B")
    public byte[] field3354 = new byte[18002];

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Z")
    public boolean[] field3350 = new boolean[16];

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "[I")
    public int[] field3355 = new int[256];

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public int[] field3339 = new int[16];

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[Z")
    public boolean[] field3346 = new boolean[256];

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "[[I")
    public int[][] field3363 = new int[6][258];

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public int field3343 = 0;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public int field3365 = 0;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "[I")
    public int[] field3359 = new int[6];

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "[[I")
    public int[][] field3361 = new int[6][258];

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
    public int[] field3353 = new int[257];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[B")
    public byte[] field3338 = new byte[4096];

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "[B")
    public byte[] field3362 = new byte[256];

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "[B")
    public byte[] field3368 = new byte[18002];

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Ltg;")
    public static class184 field3349 = class135.method812("Unerwartete Antwort vom Anmelde)2Server)3", 3);

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Ltg;")
    public static class184 field3367 = class135.method812("auf einer freien Welt zu spielen)3", 3);

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static volatile int field3351 = 0;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "Lnd;")
    public static class127 field3371 = new class127(30);

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "B")
    public byte field3348;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "J")
    public static long field3336;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "[B")
    public byte[] field3347;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "[B")
    public byte[] field3357;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "[[Z")
    public static boolean[][] field3364;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILsc;)V")
    public static final void method1082(int arg0, class171 arg1) {
        field3331++;
        for (int var2 = 0; var2 < class81.field1449.length; var2++) {
            class81.field1449[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class81.field1449[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg0 < 37) {
            method1083(-112);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class6.field117[var15] = (class81.field1449[var15 - 1] + class81.field1449[var15 + 1] + class81.field1449[var15 - -128] + class81.field1449[var15 - 128]) / 4;
                }
            }
            int[] var13 = class81.field1449;
            class81.field1449 = class6.field117;
            class6.field117 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3250; var7++) {
            for (int var8 = 0; var8 < arg1.field3246; var8++) {
                if (arg1.field3249[var6++] != 0) {
                    int var9 = var8 + arg1.field3252 + 16;
                    int var10 = var7 + arg1.field3253 + 16;
                    int var11 = (var10 << 7) + var9;
                    class81.field1449[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1083(int arg0) {
        field3367 = null;
        field3349 = null;
        field3364 = null;
        int var1 = -1 / ((arg0 - 59) / 48);
        field3371 = null;
    }
}
