import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class433 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
    public int[] field6045 = new int[4];

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
    public int[] field6053 = new int[4];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "B")
    public byte field6044;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
    public int[] field6047;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "B")
    public byte field6049;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "S")
    public short field6046;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "S")
    public short field6048;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "S")
    public short field6050;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[S")
    public short[] field6042;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "S")
    public short field6055;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
    public short[] field6052;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[S")
    public short[] field6043;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lria;")
    public static class284 field6041 = new class284(14, 1);

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lria;")
    public static class284 field6054 = new class284(15, 4);

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lria;")
    public static class284 field6056 = new class284(16, -2);

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lria;")
    public static class284 field6057 = new class284(17, 0);

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lria;")
    public static class284 field6058 = new class284(18, -2);

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lria;")
    public static class284 field6059 = new class284(19, -2);

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lria;")
    public static class284 field6060 = new class284(20, 6);

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lria;")
    public static class284 field6061 = new class284(21, 9);

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Lria;")
    public static class284 field6062 = new class284(22, -2);

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lria;")
    public static class284 field6063 = new class284(23, 4);

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Lria;")
    public static class284 field6064 = new class284(24, -1);

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Lria;")
    public static class284 field6065 = new class284(26, 0);

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lria;")
    public static class284 field6066 = new class284(27, 0);

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Lria;")
    public static class284 field6067 = new class284(28, -2);

    @OriginalMember(owner = "client!af", name = "C", descriptor = "[Lria;")
    private static class284[] field6068 = new class284[32];

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[I")
    public static int[] field6069;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field6051;

    static {
        class284[] var0 = class425.method2589(119);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field6068[var0[var1].field4035] = var0[var1];
        }
        field6069 = new int[1];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILeq;)Lhq;", line = 6)
    public static final class157 method2621(int arg0, int arg1, class209 arg2) {
        field6051++;
        byte[] var3 = arg2.method1478((byte) -72, arg0);
        if (arg1 != 1) {
            method2621(118, 49, null);
        }
        return var3 == null ? null : new class157(var3);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 31)
    public static void method2622(int arg0) {
        if (arg0 < 109) {
            field6062 = null;
        }
        field6069 = null;
        field6061 = null;
        field6064 = null;
        field6062 = null;
        field6056 = null;
        field6067 = null;
        field6065 = null;
        field6066 = null;
        field6060 = null;
        field6058 = null;
        field6059 = null;
        field6068 = null;
        field6054 = null;
        field6063 = null;
        field6041 = null;
        field6057 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 67)
    public class433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field6044 = (byte) arg0;
        this.field6047 = new int[4];
        this.field6049 = (byte) arg1;
        this.field6047[1] = arg3;
        this.field6047[3] = arg5;
        this.field6047[2] = arg4;
        this.field6047[0] = arg2;
        this.field6053[0] = arg6;
        this.field6053[1] = arg7;
        this.field6053[2] = arg8;
        this.field6053[3] = arg9;
        this.field6045[0] = arg10;
        this.field6045[3] = arg13;
        this.field6045[1] = arg11;
        this.field6045[2] = arg12;
        this.field6046 = (short) (arg2 >> class440.field6142);
        this.field6048 = (short) (arg4 >> class440.field6142);
        this.field6050 = (short) (arg10 >> class440.field6142);
        this.field6042 = new short[4];
        this.field6055 = (short) (arg12 >> class440.field6142);
        this.field6052 = new short[4];
        this.field6043 = new short[4];
    }
}
