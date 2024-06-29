import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class132 extends class30 {

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field2072 = 500;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Leg;")
    public static class188 field2070 = new class188(64);

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2090 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "[I")
    public static int[] field2087 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Leg;")
    public static class188 field2089 = new class188(16);

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2086;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([FI)[F", line = 4)
    public static final float[] method904(float[] arg0, int arg1) {
        field2081++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class223.method1503(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 21)
    public final void method225(int arg0, int arg1, int arg2) {
        field2080++;
        int var4 = this.field2083 * arg1 >> 12;
        int var5 = this.field2084 * arg0 >> 12;
        int var6 = this.field2075 * arg0 >> 12;
        int var7 = this.field2076 * arg1 >> 12;
        int var8 = this.field2071 * arg0 >> 12;
        int var9 = this.field2085 * arg1 >> 12;
        int var10 = this.field2082 * arg0 >> 12;
        int var11 = this.field2069 * arg1 >> 12;
        class69.method490(var10, var11, var9, this.field370, var4, (byte) 97, var7, var6, var5, var8);
        if (arg2 != 2) {
            method905(113);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 46)
    public static void method905(int arg0) {
        field2086 = null;
        field2090 = null;
        field2089 = null;
        field2070 = null;
        field2087 = null;
        if (arg0 != 2) {
            field2090 = (String) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 66)
    public static final void method906(String arg0, int arg1) {
        field2078++;
        int var2 = class342.method2387(arg0, (byte) -1);
        if (var2 == -1) {
            return;
        }
        if (arg1 >= -53) {
            field2090 = (String) null;
        }
        int[] var3 = class205.field3110.method1352((byte) 77, (class23.field293.field1874[var2] & 0xFFFE150) >> 14, class23.field293.field1874[var2] >> 28 & 0x3, class23.field293.field1874[var2] & 0x3FFF);
        class310.method2126(var3[2], (byte) -128, var3[1]);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 85)
    public static final void method907(int arg0) {
        class247.field3868 = new class227(32);
        if (arg0 != 25323) {
            field2091 = 124;
        }
        field2077++;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 106)
    public class132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2083 = arg1;
        this.field2084 = arg0;
        this.field2085 = arg7;
        this.field2069 = arg3;
        this.field2076 = arg5;
        this.field2082 = arg6;
        this.field2075 = arg2;
        this.field2071 = arg4;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V", line = 133)
    public final void method227(int arg0, int arg1, int arg2) {
        if (arg0 != 1325998625) {
            this.field2069 = -44;
        }
        field2079++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIB)V", line = 144)
    public final void method228(int arg0, int arg1, byte arg2) {
        if (arg2 != -94) {
            field2090 = (String) null;
        }
        field2073++;
    }
}
