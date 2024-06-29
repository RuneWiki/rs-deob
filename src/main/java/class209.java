import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class209 {

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[[I")
    public int[][] field3807 = new int[6][258];

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field3810 = 0;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[B")
    public byte[] field3808 = new byte[18002];

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[I")
    public int[] field3817 = new int[6];

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[[B")
    public byte[][] field3815 = new byte[6][258];

    @OriginalMember(owner = "client!te", name = "C", descriptor = "[[I")
    public int[][] field3825 = new int[6][258];

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[Z")
    public boolean[] field3826 = new boolean[256];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[B")
    public byte[] field3797 = new byte[256];

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[B")
    public byte[] field3823 = new byte[4096];

    @OriginalMember(owner = "client!te", name = "F", descriptor = "[Z")
    public boolean[] field3828 = new boolean[16];

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[B")
    public byte[] field3812 = new byte[18002];

    @OriginalMember(owner = "client!te", name = "y", descriptor = "[I")
    public int[] field3821 = new int[257];

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[I")
    public int[] field3827 = new int[256];

    @OriginalMember(owner = "client!te", name = "K", descriptor = "[[I")
    public int[][] field3833 = new int[6][258];

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[I")
    public int[] field3829 = new int[16];

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public int field3835 = 0;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
    public static int[] field3809 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lmb;")
    public static class132 field3798 = class166.method1092("Cabbage", 111);

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lmb;")
    public static class132 field3831 = class166.method1092(" ", 115);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "B")
    public byte field3801;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[B")
    public byte[] field3802;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "[B")
    public byte[] field3834;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public static final void method1290(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3100 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3809 = null;
        if (arg0 != 1792) {
            method1292((byte) 93, 24, null);
        }
        field3798 = null;
        field3831 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BILoc;)V")
    public static final void method1292(byte arg0, int arg1, class155 arg2) {
        field3811++;
        if (arg0 != -15) {
            method1292((byte) -90, -19, null);
        }
        if (class183.field3376 == null) {
            class233.method1479(255, 0, -1, (byte) 0, true, 255, null);
            class106.field1979[arg1] = arg2;
        } else {
            class183.field3376.field2133 = arg1 * 8 + 5;
            int var3 = class183.field3376.method759(arg0 ^ 0xFFFFFFA7);
            int var4 = class183.field3376.method759(36);
            arg2.method1016(var4, var3, arg0 + 15);
        }
    }
}
