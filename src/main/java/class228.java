import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class228 {

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "[[B")
    public byte[][] field3390 = new byte[6][258];

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "[B")
    public byte[] field3402 = new byte[18002];

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public int field3404 = 0;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "[B")
    public byte[] field3400 = new byte[18002];

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "[I")
    public int[] field3407 = new int[16];

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public int field3414 = 0;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
    public int[] field3405 = new int[6];

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "[[I")
    public int[][] field3415 = new int[6][258];

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "[[I")
    public int[][] field3389 = new int[6][258];

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "[B")
    public byte[] field3391 = new byte[256];

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "[[I")
    public int[][] field3397 = new int[6][258];

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "[B")
    public byte[] field3417 = new byte[4096];

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "[Z")
    public boolean[] field3420 = new boolean[256];

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "[I")
    public int[] field3421 = new int[256];

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "[I")
    public int[] field3419 = new int[257];

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "[Z")
    public boolean[] field3413 = new boolean[16];

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "Lqfa;")
    public static class85 field3395 = new class85(51, -1);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "B")
    public byte field3386;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "F")
    public static float field3408;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "[B")
    public byte[] field3394;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "[B")
    public byte[] field3403;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "[Lvr;")
    public static class122[] field3422;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILom;)V")
    public static final void method1555(int arg0, class344 arg1) {
        if (arg0 == -15157) {
            field3411++;
            class34.field972 = arg1.method2228("p11_full", 5781);
            class545.field7727 = arg1.method2228("p12_full", 5781);
            class224.field3362 = arg1.method2228("b12_full", 5781);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field3422 = null;
        field3395 = null;
        if (arg0 != 6) {
            field3395 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(CB)Z")
    public static final boolean method1557(char arg0, byte arg1) {
        if (arg1 < 1) {
            field3422 = null;
        }
        field3416++;
        return arg0 >= '0' && arg0 <= '9';
    }
}
