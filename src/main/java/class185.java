import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class185 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[B")
    public byte[] field2409 = new byte[18002];

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[I")
    public int[] field2418 = new int[16];

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "[B")
    public byte[] field2422 = new byte[18002];

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[B")
    public byte[] field2429 = new byte[4096];

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "[B")
    public byte[] field2421 = new byte[256];

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "[[I")
    public int[][] field2414 = new int[6][258];

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[[B")
    public byte[][] field2424 = new byte[6][258];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[[I")
    public int[][] field2412 = new int[6][258];

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field2415 = 0;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "[I")
    public int[] field2432 = new int[256];

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    public int[] field2427 = new int[6];

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "[I")
    public int[] field2436 = new int[257];

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[Z")
    public boolean[] field2434 = new boolean[16];

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[[I")
    public int[][] field2431 = new int[6][258];

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public int field2441 = 0;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "[Z")
    public boolean[] field2439 = new boolean[256];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lpn;")
    public static class72 field2426 = new class72(46, 0);

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[C")
    public static char[] field2430 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "B")
    public byte field2406;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "F")
    public static float field2442;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lj;")
    public static class292 field2435;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "Lpq;")
    public static class369 field2437;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[B")
    public byte[] field2416;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[B")
    public byte[] field2433;

    static {
        new class40((String) null, "geschickt werden.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1004(boolean arg0) {
        if (!arg0) {
            field2426 = null;
        }
        field2435 = null;
        field2426 = null;
        field2437 = null;
        field2430 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)I", line = 27)
    public static final int method1005(int arg0, int arg1, int arg2, int arg3) {
        field2417++;
        int var4 = arg2 / arg3;
        if (arg0 > -99) {
            return -84;
        }
        int var5 = arg2 & arg3 - 1;
        int var6 = arg1 / arg3;
        int var7 = arg1 & arg3 - 1;
        int var8 = class68.method348(var6, 111, var4);
        int var9 = class68.method348(var6, 116, var4 + 1);
        int var10 = class68.method348(var6 + 1, 82, var4);
        int var11 = class68.method348(var6 + 1, 120, var4 + 1);
        int var12 = class44.method229(var5, var8, var9, arg3, false);
        int var13 = class44.method229(var5, var10, var11, arg3, false);
        return class44.method229(var7, var12, var13, arg3, false);
    }
}
