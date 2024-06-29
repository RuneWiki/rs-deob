import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class331 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public int[] field4730 = new int[6];

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[[B")
    public byte[][] field4741 = new byte[6][258];

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[B")
    public byte[] field4737 = new byte[256];

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field4749 = 0;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "[[I")
    public int[][] field4744 = new int[6][258];

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[I")
    public int[] field4748 = new int[16];

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[[I")
    public int[][] field4732 = new int[6][258];

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "[B")
    public byte[] field4753 = new byte[18002];

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[I")
    public int[] field4755 = new int[256];

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "[Z")
    public boolean[] field4743 = new boolean[256];

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "[B")
    public byte[] field4758 = new byte[4096];

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
    public int[] field4742 = new int[257];

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[Z")
    public boolean[] field4757 = new boolean[16];

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "[[I")
    public int[][] field4761 = new int[6][258];

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field4750 = 0;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[B")
    public byte[] field4762 = new byte[18002];

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[C")
    private static char[] field4735 = new char[64];

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Lef;")
    public static class489 field4752;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Llf;")
    public static class238 field4759;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "[I")
    public static int[] field4763;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field4764;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "B")
    public byte field4754;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[B")
    public byte[] field4745;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "[B")
    public byte[] field4760;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method2093(byte arg0) {
        field4764 = null;
        if (arg0 >= 121) {
            field4752 = null;
            field4759 = null;
            field4735 = null;
            field4763 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ID)V")
    public static final void method2094(int arg0, double arg1) {
        class421.field6280.method772(class234.field3411);
        field4729++;
        class421.field6280.method758(arg0, 0, (int) arg1);
        class502.field7152.method534(class421.field6280);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4735[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4735[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4735[var2] = (char) (var2 + 48 - 52);
        }
        field4735[62] = '+';
        field4735[63] = '/';
        field4752 = new class489();
        field4759 = new class238();
        field4763 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field4764 = new String[100];
    }
}
