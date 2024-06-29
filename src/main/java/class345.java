import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class345 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[[I")
    public int[][] field4976 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[B")
    public byte[] field4980 = new byte[256];

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[Z")
    public boolean[] field4981 = new boolean[16];

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public int field4993 = 0;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[B")
    public byte[] field4994 = new byte[18002];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[B")
    public byte[] field4986 = new byte[18002];

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[B")
    public byte[] field4992 = new byte[4096];

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[I")
    public int[] field5004 = new int[256];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[Z")
    public boolean[] field4983 = new boolean[256];

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[I")
    public int[] field5003 = new int[6];

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[[I")
    public int[][] field4988 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "[[B")
    public byte[][] field5006 = new byte[6][258];

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
    public int[] field4996 = new int[257];

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[I")
    public int[] field4987 = new int[16];

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[[I")
    public int[][] field5012 = new int[6][258];

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public int field5013 = 0;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lul;")
    public static class486 field4979 = new class486("", 10);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    public static int[] field4990 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field5008 = -1;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Ljn;")
    public static class134 field4982 = new class134(83, -1);

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "B")
    public byte field4991;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public int field4998;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
    public static boolean field5011;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[B")
    public byte[] field5009;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "[B")
    public byte[] field5010;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBII)V")
    public static final void method2178(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -3) {
            return;
        }
        if (arg3 < arg0) {
            class128.method883(arg4, arg3, arg0, class705.field9804[arg1], 7);
        } else {
            class128.method883(arg4, arg0, arg3, class705.field9804[arg1], 7);
        }
        field4985++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method2179(byte arg0) {
        int var1 = -59 % ((arg0 + 28) / 49);
        field4990 = null;
        field4979 = null;
        field4982 = null;
    }
}
