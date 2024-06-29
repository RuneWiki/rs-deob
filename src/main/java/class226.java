import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class226 {

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[[I")
    public int[][] field3649 = new int[6][258];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[B")
    public byte[] field3647 = new byte[18002];

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[B")
    public byte[] field3652 = new byte[18002];

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field3656 = 0;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "[[I")
    public int[][] field3659 = new int[6][258];

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field3657 = 0;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[B")
    public byte[] field3654 = new byte[4096];

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "[[B")
    public byte[][] field3665 = new byte[6][258];

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "[I")
    public int[] field3664 = new int[6];

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "[[I")
    public int[][] field3667 = new int[6][258];

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "[B")
    public byte[] field3653 = new byte[256];

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "[Z")
    public boolean[] field3661 = new boolean[256];

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[I")
    public int[] field3662 = new int[16];

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "[I")
    public int[] field3669 = new int[256];

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[I")
    public int[] field3671 = new int[257];

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "[Z")
    public boolean[] field3679 = new boolean[16];

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lkb;")
    public static class80 field3666 = new class80(16);

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field3678 = 1;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Z")
    public static boolean field3677 = false;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "B")
    public byte field3674;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[B")
    public byte[] field3643;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[B")
    public byte[] field3645;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)V", line = 25)
    public static final void method1547(boolean arg0, int arg1, int arg2) {
        field3663++;
        if (arg0 && class48.field593 != 0 && arg1 != -1) {
            class268.method1862((byte) -89, 0, false, class82.field1179, arg1, class48.field593);
            class5.field55 = true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 145)
    public static void method1548(int arg0) {
        if (arg0 != 257) {
            field3677 = false;
        }
        field3666 = null;
    }
}
