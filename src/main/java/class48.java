import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class48 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "[Z")
    public boolean[] field907 = new boolean[16];

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "[I")
    public int[] field909 = new int[16];

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "[B")
    public byte[] field914 = new byte[4096];

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "[[B")
    public byte[][] field920 = new byte[6][258];

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public int field919 = 0;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "[[I")
    public int[][] field915 = new int[6][258];

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "[I")
    public int[] field918 = new int[256];

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "[[I")
    public int[][] field917 = new int[6][258];

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "[[I")
    public int[][] field923 = new int[6][258];

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "I")
    public int field933 = 0;

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "[Z")
    public boolean[] field931 = new boolean[256];

    @OriginalMember(owner = "client!gda", name = "C", descriptor = "[B")
    public byte[] field935 = new byte[18002];

    @OriginalMember(owner = "client!gda", name = "G", descriptor = "[B")
    public byte[] field939 = new byte[18002];

    @OriginalMember(owner = "client!gda", name = "E", descriptor = "[B")
    public byte[] field937 = new byte[256];

    @OriginalMember(owner = "client!gda", name = "I", descriptor = "[I")
    public int[] field941 = new int[257];

    @OriginalMember(owner = "client!gda", name = "K", descriptor = "[I")
    public int[] field943 = new int[6];

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "Ldv;")
    public static class566 field926 = new class566(34, -1);

    @OriginalMember(owner = "client!gda", name = "F", descriptor = "[[Z")
    public static boolean[][] field938 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!gda", name = "H", descriptor = "[Z")
    public static boolean[] field940 = new boolean[100];

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "B")
    public byte field913;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!gda", name = "J", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "[B")
    public byte[] field932;

    @OriginalMember(owner = "client!gda", name = "D", descriptor = "[B")
    public byte[] field936;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BIII)V")
    public static final void method472(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = -28 % ((-arg0 - 29) / 36);
        field934++;
        int var5 = arg2 << 3;
        int var6 = arg1 << 3;
        int var7 = arg3 << 3;
        class1.field13 = var5;
        if (class107.field1653 == 2) {
            class264.field3688 = var7;
            class160.field2349 = var6;
            class88.field1391 = var5;
        }
        class18.field224 = var6;
        class489.method2839(16384);
        class494.field6921 = true;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method473(int arg0) {
        field940 = null;
        if (arg0 < 96) {
            field926 = null;
        }
        field938 = null;
        field926 = null;
    }
}
