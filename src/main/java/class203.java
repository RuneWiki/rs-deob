import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class203 extends class240 {

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    private int field3035;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Z")
    public static boolean field3050 = false;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[B")
    private byte[] field3044;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
    public static int[] field3039;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "[I")
    public static int[] field3051;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[[[I")
    public static int[][][] field3034;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V", line = 7)
    public void method1386(int arg0, byte arg1) {
        this.field3044[arg0] = arg1;
        field3030++;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIFFF)V", line = 18)
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3053 = (int) (arg6 * 4096.0F);
        this.field3038 = (int) (arg7 * 4096.0F);
        this.field3048 = this.field3035 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 29)
    public final void method1387(int arg0, int arg1, int arg2) {
        field3047++;
        if (arg0 == 0) {
            this.field3046 = this.field3053 - (arg1 < 0 ? -arg1 : arg1);
            this.field3049 = 4096;
            this.field3046 = this.field3046 * this.field3046 >> 12;
            this.field3040 = this.field3046;
        } else {
            this.field3049 = this.field3046 * this.field3038 >> 12;
            this.field3046 = this.field3053 - (arg1 < 0 ? -arg1 : arg1);
            this.field3046 = this.field3046 * this.field3046 >> 12;
            if (this.field3049 < 0) {
                this.field3049 = 0;
            } else if (this.field3049 > 4096) {
                this.field3049 = 4096;
            }
            this.field3046 = this.field3049 * this.field3046 >> 12;
            this.field3040 += this.field3048 * this.field3046 >> 12;
            this.field3048 = this.field3048 * this.field3035 >> 12;
        }
        if (arg2 != 0) {
            this.field3038 = 127;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZIIIII)V", line = 63)
    public static final void method1388(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3033++;
        if (arg3) {
            field3052 = -11;
        }
        int var9 = arg1 - arg7;
        int var10 = arg0 - arg4;
        int var11 = (arg2 - arg6 << 16) / var10;
        int var12 = (arg8 - arg5 << 16) / var9;
        class250.method1686(var12, arg7, (byte) 65, 0, arg6, arg4, arg1, arg0, var11, 0, arg5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 84)
    public final void method1389(boolean arg0) {
        field3041++;
        this.field3040 >>= 0x4;
        this.field3048 = this.field3035;
        if (this.field3040 < 0) {
            this.field3040 = 0;
        } else if (this.field3040 > 255) {
            this.field3040 = 255;
        }
        this.method1386(this.field3031++, (byte) this.field3040);
        this.field3040 = 0;
        if (!arg0) {
            field3052 = -29;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIB)V", line = 111)
    public static final void method1390(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field3042++;
        if (class72.method463(-127, arg3)) {
            class290.method2033(arg0, -1, arg2, false, class278.field4231[arg3], arg1);
            if (arg4 != -6) {
                field3034 = (int[][][]) ((int[][][]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)V", line = 127)
    public static final void method1391(int arg0, byte arg1) {
        field3032++;
        if (arg1 < 94) {
            method1393((byte) 93);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class29.method183((byte) 70);
        } else if (arg0 == 2) {
            class225.method1573(1358);
        } else if (arg0 == 3) {
            class141.method1015(21334);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V", line = 156)
    public static final void method1392(byte arg0, int arg1, int arg2) {
        class265.field4058[arg1] = arg2;
        if (arg0 != -9) {
            method1391(59, (byte) 0);
        }
        field3036++;
        class172 var3 = (class172) class285.field4305.method1320((long) arg1, 13002);
        if (var3 == null) {
            class172 var4 = new class172(4611686018427387905L);
            class285.field4305.method1319(arg0 + 107, (long) arg1, var4);
        } else if (var3.field2587 != 4611686018427387905L) {
            var3.field2587 = class231.method1594(-20375) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 186)
    public static final void method1393(byte arg0) {
        field3043++;
        class91.field1364 = null;
        class172.field2579 = null;
        class234.field3523 = null;
        if (arg0 != -118) {
            field3052 = -55;
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 203)
    public static void method1394(int arg0) {
        field3034 = (int[][][]) null;
        field3039 = null;
        field3051 = null;
        if (arg0 != -21819) {
            field3039 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 220)
    public final void method1395(int arg0) {
        field3045++;
        if (arg0 == 4) {
            this.field3031 = 0;
            this.field3040 = 0;
        }
    }
}
