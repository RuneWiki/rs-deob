import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field433 = 0;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    public int[] field432 = new int[256];

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[[I")
    public int[][] field438 = new int[6][258];

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[Z")
    public boolean[] field443 = new boolean[256];

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field430 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[[I")
    public int[][] field428 = new int[6][258];

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[B")
    public byte[] field441 = new byte[18002];

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[B")
    public byte[] field454 = new byte[4096];

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[B")
    public byte[] field449 = new byte[256];

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[I")
    public int[] field458 = new int[257];

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "[[B")
    public byte[][] field451 = new byte[6][258];

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "[B")
    public byte[] field442 = new byte[18002];

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "[I")
    public int[] field457 = new int[16];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[[I")
    public int[][] field440 = new int[6][258];

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
    public int[] field459 = new int[6];

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[Z")
    public boolean[] field462 = new boolean[16];

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "[I")
    public static int[] field453 = new int[50];

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "B")
    public byte field445;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Laj;")
    public static class333 field431;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[B")
    public byte[] field435;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "[B")
    public byte[] field448;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "[[I")
    public static int[][] field450;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([III[JB)V")
    public static final void method217(int[] arg0, int arg1, int arg2, long[] arg3, byte arg4) {
        field452++;
        if (arg4 <= 4) {
            field464 = 59;
        }
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        int var9 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg2; var11++) {
            if (((long) (var10 & var11) + var7) > arg3[var11]) {
                long var12 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6] = var12;
                int var14 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6++] = var14;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var9;
        method217(arg0, arg1, var6 - 1, arg3, (byte) 24);
        method217(arg0, var6 + 1, arg2, arg3, (byte) 58);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method218(byte arg0) {
        field450 = null;
        field453 = null;
        field431 = null;
        if (arg0 != -75) {
            field453 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
    public static final int method219(byte arg0, int arg1) {
        int var2 = 85 / ((arg0 + 31) / 46);
        field434++;
        return arg1 & 0x7F;
    }
}
