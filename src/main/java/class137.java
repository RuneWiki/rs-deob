import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class137 {

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[B")
    public byte[] field2355 = new byte[256];

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[B")
    public byte[] field2353 = new byte[4096];

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[B")
    public byte[] field2352 = new byte[18002];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public int[] field2348 = new int[6];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field2356 = 0;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "[[I")
    public int[][] field2374 = new int[6][258];

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "[[B")
    public byte[][] field2364 = new byte[6][258];

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public int field2370 = 0;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[Z")
    public boolean[] field2357 = new boolean[16];

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "[[I")
    public int[][] field2382 = new int[6][258];

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "[I")
    public int[] field2367 = new int[257];

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "[I")
    public int[] field2380 = new int[256];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[Z")
    public boolean[] field2349 = new boolean[256];

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "[B")
    public byte[] field2372 = new byte[18002];

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[I")
    public int[] field2381 = new int[16];

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[[I")
    public int[][] field2384 = new int[6][258];

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "Lqk;")
    public static class207 field2379 = class24.method212(255, "Cach-B");

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lqk;")
    public static class207 field2362 = class24.method212(255, ")3");

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "B")
    public byte field2375;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[B")
    public byte[] field2351;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "[B")
    public byte[] field2365;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZIZ)Lqk;")
    public static final class207 method948(int arg0, boolean arg1, int arg2, boolean arg3) {
        field2377++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = arg2 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg0;
        }
        int var6 = var5;
        if (arg2 < 0 || arg1) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        if (!arg3) {
            return null;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg2 % arg0;
            arg2 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class207 var9 = new class207();
        var9.field3663 = var6;
        var9.field3652 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIILdc;IJIIII)Z")
    public static final boolean method949(int arg0, int arg1, int arg2, int arg3, class235 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class72.method520(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method950(boolean arg0) {
        field2379 = null;
        field2362 = null;
        if (!arg0) {
            field2362 = null;
        }
    }
}
