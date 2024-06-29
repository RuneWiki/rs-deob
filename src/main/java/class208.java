import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class208 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[B")
    public byte[] field3556 = new byte[256];

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[B")
    public byte[] field3553 = new byte[4096];

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[I")
    public int[] field3568 = new int[16];

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "[Z")
    public boolean[] field3559 = new boolean[256];

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
    public int[] field3554 = new int[6];

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public int field3572 = 0;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[Z")
    public boolean[] field3574 = new boolean[16];

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[[I")
    public int[][] field3576 = new int[6][258];

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[B")
    public byte[] field3569 = new byte[18002];

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "[I")
    public int[] field3566 = new int[257];

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[[I")
    public int[][] field3571 = new int[6][258];

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[I")
    public int[] field3564 = new int[256];

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "[B")
    public byte[] field3581 = new byte[18002];

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public int field3585 = 0;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "[[I")
    public int[][] field3578 = new int[6][258];

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "[[B")
    public byte[][] field3587 = new byte[6][258];

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lsb;")
    public static class98 field3565 = class47.method368("m", 0);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[Z")
    public static boolean[] field3563 = new boolean[100];

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "B")
    public byte field3560;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[B")
    public byte[] field3577;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "[B")
    public byte[] field3583;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
    public static int[] field3557;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZ)I")
    public static final int method1400(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method1402(-126, 126, -15);
        }
        field3586++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1401(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3555++;
        if (arg6 == arg7) {
            class211.method1415(arg6, arg5, (byte) -70, arg2, arg4, arg3, arg1);
            return;
        }
        if (class229.field3933 <= (arg1 - arg6) && (arg1 + arg6) <= class106.field1899 && arg3 - arg7 >= class116.field2077 && arg3 + arg7 <= class215.field3666) {
            class157.method1136(arg7, arg4, arg6, (byte) 106, arg1, arg5, arg3, arg2);
        } else {
            class225.method1550(arg1, arg4, arg3, 1904512130, arg5, arg7, arg2, arg6);
        }
        if (arg0 <= 124) {
            field3557 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Lbe;")
    public static final class14 method1402(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1149; var4++) {
            class14 var5 = var3.field1140[var4];
            if ((var5.field260 >> 29 & 0x3L) == 2L && var5.field268 == arg1 && var5.field256 == arg2) {
                client.method778(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILtg;II)Lkb;")
    public static final class247 method1403(int arg0, class75 arg1, int arg2, int arg3) {
        field3579++;
        if (arg2 >= -109) {
            field3557 = null;
        }
        return class43.method341(arg1, -1, arg3, arg0) ? class53.method396(-123) : null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3563 = null;
        field3565 = null;
        if (arg0 == 1) {
            field3557 = null;
        }
    }
}
