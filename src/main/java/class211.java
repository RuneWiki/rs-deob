import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class211 {

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[Z")
    public boolean[] field4008 = new boolean[256];

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
    public int[] field4012 = new int[16];

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[[I")
    public int[][] field4002 = new int[6][258];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field4003 = 0;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
    public byte[] field4006 = new byte[18002];

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field4019 = 0;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[B")
    public byte[] field4018 = new byte[256];

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[[I")
    public int[][] field4024 = new int[6][258];

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[Z")
    public boolean[] field4015 = new boolean[16];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
    public int[] field4000 = new int[6];

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[B")
    public byte[] field4001 = new byte[4096];

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
    public int[] field4030 = new int[257];

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "[[I")
    public int[][] field4029 = new int[6][258];

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[B")
    public byte[] field4022 = new byte[18002];

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "[[B")
    public byte[][] field4033 = new byte[6][258];

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "[I")
    public int[] field4039 = new int[256];

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lob;")
    private static class141 field4009 = class175.method1195(40, "Walk here");

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lob;")
    public static class141 field3999 = class175.method1195(40, "Wordpack geladen)3");

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Lob;")
    public static class141 field4035 = class175.method1195(40, "::gc");

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lob;")
    public static class141 field3998 = class175.method1195(40, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lob;")
    public static class141 field4025 = field4009;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "B")
    public byte field4036;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[B")
    public byte[] field4013;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[B")
    public byte[] field4021;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    public static int[] field4014;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[Lkc;")
    public static class102[] field4004;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        field4004 = null;
        field4014 = null;
        field4025 = null;
        if (arg0 <= -122) {
            field3999 = null;
            field3998 = null;
            field4009 = null;
            field4035 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lob;")
    public static final class141 method1374(int arg0, int arg1) {
        field4007++;
        if (arg1 != 256) {
            field4004 = null;
        }
        class141 var2 = new class141();
        var2.field2701 = new byte[arg0];
        var2.field2705 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BJ)V")
    public static final void method1375(byte arg0, long arg1) {
        field4032++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class96.field1912; var3++) {
            if (class154.field2999[var3] == arg1) {
                class96.field1912--;
                class118.field2298++;
                for (int var4 = var3; var4 < class96.field1912; var4++) {
                    class154.field2999[var4] = class154.field2999[var4 + 1];
                    class166.field3217[var4] = class166.field3217[var4 + 1];
                }
                class1.field11 = class174.field3461;
                class7.field120.method32(73, 12885);
                class7.field120.method978(-101, arg1);
                break;
            }
        }
        if (arg0 < 60) {
            field4035 = null;
        }
    }
}
