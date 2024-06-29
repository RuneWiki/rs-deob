import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class229 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "[B")
    public byte[] field3626 = new byte[256];

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
    public int[] field3632 = new int[16];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[B")
    public byte[] field3620 = new byte[4096];

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[[I")
    public int[][] field3623 = new int[6][258];

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "[[B")
    public byte[][] field3640 = new byte[6][258];

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[Z")
    public boolean[] field3633 = new boolean[16];

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
    public int[] field3631 = new int[6];

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[I")
    public int[] field3641 = new int[256];

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field3622 = 0;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "[[I")
    public int[][] field3647 = new int[6][258];

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[[I")
    public int[][] field3650 = new int[6][258];

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "[I")
    public int[] field3659 = new int[257];

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "[B")
    public byte[] field3636 = new byte[18002];

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "[B")
    public byte[] field3657 = new byte[18002];

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[Z")
    public boolean[] field3655 = new boolean[256];

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public int field3656 = 0;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Z")
    public static boolean field3628 = false;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
    public static int[] field3661 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "B")
    public byte field3642;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "[B")
    public byte[] field3639;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[B")
    public byte[] field3645;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "[I")
    public static int[] field3652;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 15)
    public static void method1658(byte arg0) {
        if (arg0 <= -45) {
            field3652 = null;
            field3661 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIBI)V", line = 66)
    public static final void method1659(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3638++;
        if (arg3 != -78) {
            field3652 = (int[]) null;
        }
        class227 var5 = (class227) class164.field2664.method1743((long) arg2, (byte) 121);
        if (var5 == null) {
            var5 = new class227();
            class164.field2664.method1750(var5, (byte) 127, (long) arg2);
        }
        if (var5.field3606.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field3606.length; var8++) {
                var6[var8] = var5.field3606[var8];
                var7[var8] = var5.field3604[var8];
            }
            for (int var9 = var5.field3606.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3606 = var6;
            var5.field3604 = var7;
        }
        var5.field3606[arg1] = arg0;
        var5.field3604[arg1] = arg4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIIZ)Ljava/lang/String;", line = 122)
    public static final String method1660(byte[] arg0, int arg1, int arg2, boolean arg3) {
        char[] var4 = new char[arg1];
        field3630++;
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg0[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class246.field3917[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (!arg3) {
            method1658((byte) -37);
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V", line = 205)
    public static final void method1661(byte arg0) {
        field3646++;
        if (arg0 != 107) {
            method1661((byte) -86);
        }
        class138.field2067.method1623(1);
    }
}
