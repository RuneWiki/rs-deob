import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class189 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[[B")
    public byte[][] field2272 = new byte[6][258];

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[B")
    public byte[] field2263 = new byte[18002];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[B")
    public byte[] field2278 = new byte[18002];

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public int field2279 = 0;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public int field2288 = 0;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public int[] field2286 = new int[256];

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[I")
    public int[] field2277 = new int[257];

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
    public int[] field2292 = new int[16];

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "[B")
    public byte[] field2291 = new byte[4096];

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[[I")
    public int[][] field2265 = new int[6][258];

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[Z")
    public boolean[] field2268 = new boolean[16];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[[I")
    public int[][] field2271 = new int[6][258];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[I")
    public int[] field2276 = new int[6];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[B")
    public byte[] field2262 = new byte[256];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[Z")
    public boolean[] field2266 = new boolean[256];

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[[I")
    public int[][] field2287 = new int[6][258];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lrg;")
    public static class548 field2267 = new class548(10, -1);

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
    public static int[] field2273 = new int[14];

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "B")
    public byte field2294;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[B")
    public byte[] field2270;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[B")
    public byte[] field2293;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method1028(boolean arg0) {
        if (!arg0) {
            field2267 = null;
        }
        field2273 = null;
        field2267 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method1029(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field2282++;
        class350 var8 = new class350();
        var8.field4520 = arg0;
        if (arg6 != 0) {
            field2273 = null;
        }
        var8.field4518 = arg2;
        var8.field4517 = arg4;
        var8.field4523 = arg5;
        var8.field4521 = arg1;
        var8.field4525 = class335.field4358 + arg7;
        var8.field4524 = arg3;
        class82.field991.method1991(var8, 94);
    }
}
