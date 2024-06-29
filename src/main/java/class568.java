import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class568 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    public int[] field8303 = new int[4];

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
    public int[] field8306 = new int[4];

    @OriginalMember(owner = "client!te", name = "r", descriptor = "B")
    public byte field8313;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
    public int[] field8310;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "B")
    public byte field8305;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "S")
    public short field8312;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "S")
    public short field8299;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "S")
    public short field8311;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[S")
    public short[] field8298;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "S")
    public short field8301;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[S")
    public short[] field8302;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[S")
    public short[] field8309;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lwo;")
    public static class690 field8297 = new class690(72, 6);

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field8308 = 0;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field8315 = new String[100];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Ljn;")
    public static class668 field8300;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Ljn;")
    public static class668 field8304;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lf;")
    public static class701 field8314;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)I")
    public static final int method3326(byte arg0, int arg1) {
        field8307++;
        return arg0 == 29 ? arg1 >>> 8 : -35;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8313 = (byte) arg1;
        this.field8310 = new int[4];
        this.field8305 = (byte) arg0;
        this.field8306[0] = arg2;
        this.field8306[3] = arg5;
        this.field8306[2] = arg4;
        this.field8306[1] = arg3;
        this.field8303[1] = arg7;
        this.field8303[3] = arg9;
        this.field8303[2] = arg8;
        this.field8303[0] = arg6;
        this.field8312 = (short) (arg2 >> class295.field3981);
        this.field8310[0] = arg10;
        this.field8310[3] = arg13;
        this.field8310[2] = arg12;
        this.field8310[1] = arg11;
        this.field8299 = (short) (arg4 >> class295.field3981);
        this.field8311 = (short) (arg10 >> class295.field3981);
        this.field8298 = new short[4];
        this.field8301 = (short) (arg12 >> class295.field3981);
        this.field8302 = new short[4];
        this.field8309 = new short[4];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method3327(int arg0) {
        if (arg0 != 3) {
            method3328(null, 123, null, null, -104, -82, -12, null, null);
        }
        field8297 = null;
        field8315 = null;
        field8314 = null;
        field8304 = null;
        field8300 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3328(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5, int arg6, String arg7, String arg8) {
        field8296++;
        class6 var9 = class265.field3643[99];
        int var10 = -50 / ((arg4 + 40) / 45);
        for (int var11 = 99; var11 > 0; var11--) {
            class265.field3643[var11] = class265.field3643[var11 - 1];
        }
        if (var9 == null) {
            var9 = new class6(arg5, arg1, arg0, arg3, arg8, arg2, arg6, arg7);
        } else {
            var9.method37(arg5, arg7, (byte) -68, arg0, arg3, arg2, arg8, arg6, arg1);
        }
        class190.field2320 = class59.field926;
        class265.field3643[0] = var9;
        class288.field3879++;
    }
}
