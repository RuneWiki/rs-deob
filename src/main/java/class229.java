import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class229 extends class14 {

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Lvj;")
    public static class304 field3084 = new class304("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "[I")
    public static int[] field3093 = new int[6];

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lfn;")
    public static class91 field3086;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    private final void method1428(int arg0, int arg1) {
        this.field3091 = arg0 >> 4 & 4080;
        ++field3094;
        if (arg1 >= 81) {
            this.field3087 = arg0 << 4 & 4080;
            this.field3095 = (arg0 & 16711680) >> 12;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static final void method1429(int arg0) {
        ++field3092;
        if (arg0 > -5) {
            method1432(61, -59, 115);
        }
        int var1 = class461.field6368;
        int[] var2 = class461.field6370;
        for (int var3 = 0; var1 > var3; ++var3) {
            class515 var7 = class499.field6901[var2[var3]];
            if (var7 != null && ~var7.field6245 < -1) {
                --var7.field6245;
                if (var7.field6245 == 0) {
                    var7.field6195 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class60.field942; ++var4) {
            int var5 = class162.field2369[var4];
            class117 var6 = class291.field3822[var5];
            if (var6 != null && ~var6.field6245 < -1) {
                --var6.field6245;
                if (var6.field6245 == 0) {
                    var6.field6195 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lus;ILql;Lsq;IIII)V")
    public static final void method1430(class1 arg0, int arg1, class515 arg2, class117 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 30) {
            method1431(123);
        }
        ++field3090;
        class219 var8 = new class219();
        var8.field2950 = arg7 << 7;
        var8.field2953 = arg6;
        var8.field2958 = arg4 << 7;
        if (arg0 == null) {
            if (arg3 != null) {
                var8.field2954 = arg3;
                class506 var11 = arg3.field1661;
                if (var11.field6971 != null) {
                    var8.field2947 = true;
                    var11 = var11.method2885(-103, class301.field3980);
                }
                if (var11 != null) {
                    var8.field2951 = arg4 - -var11.field6956 << 7;
                    var8.field2960 = var11.field6956 + arg7 << 7;
                    var8.field2968 = class302.method1760(-83, arg3);
                    var8.field2967 = var11.field6977;
                    var8.field2962 = var11.field6967 << 7;
                }
                class225.field3039.method1666((byte) 98, var8);
            } else if (arg2 != null) {
                var8.field2964 = arg2;
                var8.field2951 = arg4 - -arg2.method2590(0) << 7;
                var8.field2960 = arg2.method2590(0) + arg7 << 7;
                var8.field2968 = class378.method2182((byte) -59, arg2);
                var8.field2967 = arg2.field7599;
                var8.field2962 = arg2.field7602 << 7;
                class368.field4965.method173((long) arg2.field6170, var8, (byte) 77);
            }
        } else {
            var8.field2956 = arg0;
            int var9 = arg0.field82;
            int var10 = arg0.field16;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg0.field82;
                var9 = arg0.field16;
            }
            var8.field2951 = arg4 + var9 << 7;
            var8.field2952 = arg0.field50;
            var8.field2966 = arg0.field28;
            var8.field2957 = arg0.field8;
            var8.field2968 = arg0.field48;
            var8.field2962 = arg0.field3 << 7;
            var8.field2967 = arg0.field13;
            var8.field2960 = arg7 - -var10 << 7;
            if (arg0.field58 != null) {
                var8.field2947 = true;
                var8.method1389(52);
            }
            if (var8.field2957 != null) {
                var8.field2949 = (int) (Math.random() * (double) (-var8.field2966 + var8.field2952)) + var8.field2966;
            }
            class201.field2786.method1666((byte) 69, var8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field3088;
        if (arg0 != -30909) {
            this.method141(-110, 43);
        }
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class115.field1637 < ~var7; ++var7) {
                var4[var7] = this.field3095;
                var5[var7] = this.field3091;
                var6[var7] = this.field3087;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class229() {
        this(0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (arg0 == 0) {
            this.method1428(arg2.method2249((byte) 113), 94);
        }
        int var5 = 126 / ((-51 - arg1) / 37);
        ++field3096;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    private class229(int arg0) {
        super(0, false);
        this.method1428(arg0, 121);
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public static void method1431(int arg0) {
        field3086 = null;
        if (arg0 < 61) {
            method1429(120);
        }
        field3093 = null;
        field3084 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)I")
    public static final int method1432(int arg0, int arg1, int arg2) {
        ++field3085;
        if (arg2 != 31926) {
            field3086 = null;
        }
        int var3 = 1;
        while (~arg0 < -2) {
            if (~(arg0 & 1) != -1) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 1;
        }
        if (~arg0 == -2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
