import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class152 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "B")
    public byte field2075;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
    public int[] field2084;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[I")
    public int[] field2078;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[I")
    public int[] field2085;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "B")
    public byte field2083;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "S")
    public short field2080;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "S")
    public short field2076;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "S")
    public short field2077;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[S")
    public short[] field2081;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
    public short[] field2086;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[S")
    public short[] field2087;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "S")
    public short field2082;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lwh;")
    public static class546 field2079 = new class546(8);

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[[I")
    public static int[][] field2088 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2089 = new String[100];

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)I")
    public static final int method891(int arg0, byte arg1, int arg2) {
        int var3 = -32 / ((-arg1 - 21) / 35);
        field2093++;
        int var4 = 0;
        while (arg2 > 0) {
            var4 = var4 << 1 | arg0 & 0x1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIII)V")
    public static final void method892(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class199.field2702 = 0L;
        field2091++;
        int var5 = class702.method3945((byte) -104);
        if (arg0 == arg4 || var5 == 3) {
            arg1 = true;
        }
        if (!class146.field1963.method1069()) {
            arg1 = true;
        }
        class659.method3769(arg1, arg3, arg0, var5, arg2, arg4 - 6);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method893(int arg0) {
        field2088 = null;
        field2079 = null;
        if (arg0 != -17655) {
            field2089 = null;
        }
        field2089 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2075 = (byte) arg1;
        this.field2084 = new int[4];
        this.field2078 = new int[4];
        this.field2085 = new int[4];
        this.field2083 = (byte) arg0;
        this.field2078[2] = arg4;
        this.field2078[3] = arg5;
        this.field2078[1] = arg3;
        this.field2078[0] = arg2;
        this.field2084[3] = arg9;
        this.field2084[0] = arg6;
        this.field2084[1] = arg7;
        this.field2084[2] = arg8;
        this.field2080 = (short) (arg2 >> class62.field762);
        this.field2085[0] = arg10;
        this.field2085[3] = arg13;
        this.field2085[1] = arg11;
        this.field2085[2] = arg12;
        this.field2076 = (short) (arg4 >> class62.field762);
        this.field2077 = (short) (arg10 >> class62.field762);
        this.field2081 = new short[4];
        this.field2086 = new short[4];
        this.field2087 = new short[4];
        this.field2082 = (short) (arg12 >> class62.field762);
    }
}
