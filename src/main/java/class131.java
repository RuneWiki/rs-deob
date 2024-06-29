import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class131 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public int[] field2211 = new int[4];

    @OriginalMember(owner = "client!th", name = "l", descriptor = "B")
    public byte field2216;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "B")
    public byte field2220;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    public int[] field2212;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
    public int[] field2208;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "S")
    public short field2209;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "S")
    public short field2210;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "S")
    public short field2219;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[S")
    public short[] field2217;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[S")
    public short[] field2215;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "S")
    public short field2205;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[S")
    public short[] field2206;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "D")
    public static double field2213;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method1102(int arg0, int arg1, int arg2) {
        field2214++;
        if (arg1 == -3157) {
            return (arg2 & 0x100100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 34)
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2216 = (byte) arg0;
        this.field2220 = (byte) arg1;
        this.field2212 = new int[4];
        this.field2208 = new int[4];
        this.field2212[0] = arg2;
        this.field2212[1] = arg3;
        this.field2212[2] = arg4;
        this.field2212[3] = arg5;
        this.field2208[2] = arg8;
        this.field2208[3] = arg9;
        this.field2208[1] = arg7;
        this.field2208[0] = arg6;
        this.field2211[0] = arg10;
        this.field2211[1] = arg11;
        this.field2209 = (short) (arg2 >> class679.field9600);
        this.field2211[3] = arg13;
        this.field2211[2] = arg12;
        this.field2210 = (short) (arg4 >> class679.field9600);
        this.field2219 = (short) (arg10 >> class679.field9600);
        this.field2217 = new short[4];
        this.field2215 = new short[4];
        this.field2205 = (short) (arg12 >> class679.field9600);
        this.field2206 = new short[4];
    }
}
