import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class143 extends class436 {

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field2062 = 0;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    private int field2068 = 1;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    private int field2063 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "[I")
    public static int[] field2059 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
    public static int[] field2069 = new int[4096];

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field2074;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field2069[var0] = class249.method1549(var0, false);
        }
        field2072 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I", line = 3)
    public static final int method974(int arg0) {
        if (arg0 > -13) {
            field2060 = -75;
        }
        ++field2066;
        return class451.field6572;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V", line = 19)
    public static final void method975(int arg0, int arg1, int arg2) {
        class240.field3335 = new class190(arg1);
        if (arg0 != 0) {
            method975(87, 75, -65);
        }
        ++field2061;
        class167.field2391 = new class190(arg2);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIIIIIIIIIII)V", line = 32)
    public static final void method976(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2073;
        class182 var13 = new class182();
        var13.field2553 = arg12;
        var13.field2544 = arg4;
        var13.field2545 = arg11;
        var13.field2561 = arg10;
        var13.field2554 = arg5;
        var13.field2559 = arg7;
        var13.field2542 = arg8;
        var13.field2560 = arg2;
        if (arg1 < 0) {
            field2069 = null;
        }
        var13.field2552 = arg3;
        var13.field2549 = arg9;
        var13.field2556 = arg0;
        var13.field2550 = arg6;
        class66.field1035.method1301(50, var13);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V", line = 59)
    public static void method977(byte arg0) {
        field2074 = null;
        if (arg0 == -123) {
            field2069 = null;
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZI)I", line = 71)
    public static final int method978(int arg0, boolean arg1, int arg2) {
        ++field2065;
        int var3 = 1;
        while (~arg0 < -2) {
            if ((1 & arg0) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 1;
        }
        if (~arg0 == -2) {
            return arg2 * var3;
        } else if (!arg1) {
            return -103;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 97)
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V", line = 101)
    public static final void method979(int arg0, int arg1) {
        ++field2070;
        class181.field2524.method1254(arg1, -79);
        if (arg0 != 0) {
            method977((byte) -128);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 116)
    public final void method44(int arg0) {
        ++field2071;
        if (arg0 != -14) {
            this.method44(-71);
        }
        class105.method721(false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILeb;)V", line = 132)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field2058;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field2068 = arg2.method2429(arg0 ^ 34);
                }
            } else {
                this.field2062 = arg2.method2429(0);
            }
        } else {
            this.field2063 = arg2.method2429(0);
        }
        if (arg0 != 34) {
            method976(-43, (byte) 119, 9, -121, 124, -94, -121, -126, 44, -87, -98, 116, -71);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I", line = 188)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            field2069 = null;
        }
        ++field2064;
        int[] var3 = super.field6258.method2688((byte) -125, arg0);
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class43.field653; ++var6) {
                int var7 = class249.field3455[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field2063 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field2068 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2068;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field2062 != -1) {
                    if (~this.field2062 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class441.field6396[(var12 & 4083) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
