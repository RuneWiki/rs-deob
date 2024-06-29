import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class630 {

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "[B")
    public byte[] field9010 = new byte[18002];

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "[[B")
    public byte[][] field9015 = new byte[6][258];

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "[Z")
    public boolean[] field9012 = new boolean[256];

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
    public int field9014 = 0;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "[B")
    public byte[] field9029 = new byte[256];

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "[I")
    public int[] field9036 = new int[16];

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "[[I")
    public int[][] field9042 = new int[6][258];

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public int field9019 = 0;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "[I")
    public int[] field9033 = new int[257];

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "[I")
    public int[] field9035 = new int[6];

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "[Z")
    public boolean[] field9043 = new boolean[16];

    @OriginalMember(owner = "client!nfa", name = "L", descriptor = "[B")
    public byte[] field9046 = new byte[4096];

    @OriginalMember(owner = "client!nfa", name = "M", descriptor = "[I")
    public int[] field9047 = new int[256];

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "[[I")
    public int[][] field9041 = new int[6][258];

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "[B")
    public byte[] field9040 = new byte[18002];

    @OriginalMember(owner = "client!nfa", name = "Q", descriptor = "[[I")
    public int[][] field9051 = new int[6][258];

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "[S")
    public static short[] field9030 = new short[] { 15, 49, 9, 4, 22, 51, 46, 47 };

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "B")
    public byte field9009;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "F")
    public static float field9025;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public int field9011;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public int field9013;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public int field9016;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public int field9018;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public int field9020;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public int field9021;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public int field9022;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public int field9024;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
    public int field9031;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
    public int field9039;

    @OriginalMember(owner = "client!nfa", name = "J", descriptor = "I")
    public int field9044;

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "I")
    public int field9045;

    @OriginalMember(owner = "client!nfa", name = "N", descriptor = "I")
    public int field9048;

    @OriginalMember(owner = "client!nfa", name = "O", descriptor = "Lkb;")
    public static class640 field9049;

    @OriginalMember(owner = "client!nfa", name = "P", descriptor = "Lkb;")
    public static class640 field9050;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "Ljn;")
    public static class668 field9028;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "[B")
    public byte[] field9026;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "[B")
    public byte[] field9038;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 28)
    public static void method3609(int arg0) {
        if (arg0 > 123) {
            field9030 = null;
            field9028 = null;
            field9049 = null;
            field9050 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 56)
    public static final void method3610(String arg0, int arg1) {
        class301.method1786("", arg0, "", "", -1, 0, 0);
        if (arg1 == 4) {
            field9034++;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)Z", line = 77)
    public static final boolean method3611(int arg0, byte arg1, int arg2) {
        if (arg1 != 30) {
            field9049 = null;
        }
        field9032++;
        return class513.method3046(arg0, 2, arg2) & (class215.method1316(arg2, 25782, arg0) | (arg2 & 0x2000) != 0 | class262.method1592(arg0, -101, arg2));
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Z", line = 95)
    public static final boolean method3612(int arg0, int arg1, int arg2) {
        field9027++;
        if (arg2 != -1) {
            method3611(80, (byte) -125, 19);
        }
        return (arg1 & 0x580) != 0;
    }
}
