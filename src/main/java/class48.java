import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class48 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[Z")
    public boolean[] field558 = new boolean[16];

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[B")
    public byte[] field569 = new byte[256];

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    public int[] field571 = new int[257];

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "[I")
    public int[] field564 = new int[256];

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public int[] field559 = new int[16];

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[Z")
    public boolean[] field577 = new boolean[256];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[B")
    public byte[] field556 = new byte[18002];

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "[[I")
    public int[][] field581 = new int[6][258];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[B")
    public byte[] field561 = new byte[18002];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[[I")
    public int[][] field560 = new int[6][258];

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "[[I")
    public int[][] field584 = new int[6][258];

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "[I")
    public int[] field587 = new int[6];

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "[B")
    public byte[] field580 = new byte[4096];

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public int field589 = 0;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "[[B")
    public byte[][] field588 = new byte[6][258];

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    public static int[] field575 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field596 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "B")
    public byte field578;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Llc;")
    public static class175 field568;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Llc;")
    public static class175 field582;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[B")
    public byte[] field557;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "[B")
    public byte[] field592;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Lbi;")
    public static class91[] field562;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZBIII)V", line = 7)
    public static final void method281(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -58 % ((22 - arg1) / 48);
        field586++;
        if (class285.method2039(arg4, -32660)) {
            class232.method1633(arg3, arg2, (byte) 0, class175.field2535[arg4], arg0, -1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 31)
    public static void method282(byte arg0) {
        if (arg0 < 4) {
            field575 = (int[]) null;
        }
        field562 = null;
        field582 = null;
        field575 = null;
        field568 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 45)
    public static int method283(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)I", line = 81)
    public static final int method284(byte arg0, int arg1, int arg2) {
        field573++;
        if (arg0 >= -97) {
            field582 = (class175) null;
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)J", line = 158)
    public static final long method285(byte arg0, String arg1) {
        if (arg0 != -90) {
            return 61L;
        }
        field597++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
