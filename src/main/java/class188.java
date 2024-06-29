import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class188 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    public int[] field3014 = new int[6];

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "[B")
    public byte[] field3025 = new byte[256];

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[B")
    public byte[] field3023 = new byte[4096];

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
    public int[] field3018 = new int[256];

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "[Z")
    public boolean[] field3032 = new boolean[16];

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "[[I")
    public int[][] field3031 = new int[6][258];

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "[B")
    public byte[] field3029 = new byte[18002];

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
    public int[] field3041 = new int[257];

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[B")
    public byte[] field3016 = new byte[18002];

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "[[B")
    public byte[][] field3052 = new byte[6][258];

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public int field3046 = 0;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "[[I")
    public int[][] field3040 = new int[6][258];

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public int field3044 = 0;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[I")
    public int[] field3035 = new int[16];

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "[Z")
    public boolean[] field3039 = new boolean[256];

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "[[I")
    public int[][] field3058 = new int[6][258];

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lqd;")
    public static class40 field3030 = class147.method1106("::tele ", (byte) -97);

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
    public static int[] field3028 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Lqd;")
    public static class40 field3054 = class147.method1106(" x ", (byte) -108);

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
    public static int[] field3021 = new int[32];

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "B")
    public byte field3020;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
    public static float field3015;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[B")
    public byte[] field3026;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "[B")
    public byte[] field3056;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method1354(int arg0, int arg1, int arg2) {
        int var3 = class185.field2982[arg0][arg1][arg2];
        if (-class81.field1425 == var3) {
            return false;
        } else if (class81.field1425 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class10.method64(var4 + 1, class78.field1316[arg0][arg1][arg2], var5 + 1) && class10.method64(var4 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg2], var5 + 1) && class10.method64(var4 + 128 - 1, class78.field1316[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class10.method64(var4 + 1, class78.field1316[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class185.field2982[arg0][arg1][arg2] = class81.field1425;
                return true;
            } else {
                class185.field2982[arg0][arg1][arg2] = -class81.field1425;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 110)
    public static final void method1355(int arg0) {
        field3036++;
        if (class107.field1885.toLowerCase().indexOf("microsoft") == -1) {
            class41.field776[45] = 26;
            class41.field776[92] = 74;
            class41.field776[91] = 42;
            if (class107.field1888 == null) {
                class41.field776[222] = 59;
                class41.field776[192] = 58;
            } else {
                class41.field776[222] = 58;
                class41.field776[520] = 59;
                class41.field776[192] = 28;
            }
            class41.field776[47] = 73;
            class41.field776[61] = 27;
            class41.field776[44] = 71;
            class41.field776[93] = 43;
            class41.field776[46] = 72;
            class41.field776[59] = 57;
        } else {
            class41.field776[219] = 42;
            class41.field776[186] = 57;
            class41.field776[189] = 26;
            class41.field776[223] = 28;
            class41.field776[187] = 27;
            class41.field776[222] = 59;
            class41.field776[191] = 73;
            class41.field776[188] = 71;
            class41.field776[190] = 72;
            class41.field776[192] = 58;
            class41.field776[220] = 74;
            class41.field776[221] = 43;
        }
        if (arg0 != 43) {
            field3028 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 167)
    public static final void method1356(byte arg0) {
        field3027++;
        if (arg0 == 91) {
            class202.field3206.method597((byte) -50);
            class109.field1913 = null;
            class52.field1017 = 1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lce;II)Lcm;", line = 180)
    public static final class185 method1357(class239 arg0, int arg1, int arg2) {
        field3047++;
        if (arg1 >= -86) {
            method1355(63);
        }
        return class178.method1311(arg2, arg0, (byte) 103) ? class61.method511((byte) -80) : null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 195)
    public static void method1358(int arg0) {
        field3028 = null;
        field3054 = null;
        if (arg0 != 256) {
            method1357((class239) null, -73, 21);
        }
        field3021 = null;
        field3030 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqd;Z)I", line = 226)
    public static final int method1359(class40 arg0, boolean arg1) {
        field3055++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class233.field3844; var2++) {
            if (arg0.method327(class15.field242[var2], -21581)) {
                return var2;
            }
        }
        if (arg1) {
            field3028 = (int[]) null;
        }
        return -1;
    }
}
