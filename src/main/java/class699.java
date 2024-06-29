import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class699 extends class330 {

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    private int field9732 = 32768;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "Ljava/lang/String;")
    public static String field9735;

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
    public class699() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = 126 / ((arg2 - -41) / 42);
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4636 = ~arg0.method3013(54) == -2;
            }
        } else {
            this.field9732 = arg0.method3002(-1) << 4;
        }
        ++field9737;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public static void method3944(int arg0) {
        if (arg0 != 1) {
            method3945(-78, 76, -31);
        }
        field9735 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field9734;
        if (arg1) {
            this.field9732 = 4;
        }
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(1, arg0, (byte) 51);
            int[] var5 = this.method2084(2, arg0, (byte) 98);
            for (int var6 = 0; ~class80.field901 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4083) >> 4;
                int var8 = var5[var6] * this.field9732 >> 12;
                int var9 = class654.field9189[var7] * var8 >> 12;
                int var10 = class329.field4620[var7] * var8 >> 12;
                int var11 = class639.field8988 & var6 - -(var9 >> 12);
                int var12 = class385.field5505 & (var10 >> 12) + arg0;
                int[] var13 = this.method2084(0, var12, (byte) -119);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field9736;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int[] var4 = this.method2084(1, arg1, (byte) 113);
            int[] var5 = this.method2084(2, arg1, (byte) -104);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class80.field901 > var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1045157) >> 12;
                int var11 = var5[var9] * this.field9732 >> 12;
                int var12 = class654.field9189[var10] * var11 >> 12;
                int var13 = class329.field4620[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class639.field8988;
                int var15 = arg1 - -(var13 >> 12) & class385.field5505;
                int[][] var16 = this.method2082(var15, 0, 126);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(III)V")
    public static final void method3945(int arg0, int arg1, int arg2) {
        ++field9730;
        class17 var3 = class245.method1634(arg2 ^ 13, (long) arg1, arg2);
        var3.method66((byte) -125);
        var3.field107 = arg0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBIILiaa;)V")
    public static final void method3946(int arg0, byte arg1, int arg2, int arg3, class116 arg4) {
        ++field9729;
        arg4.field1575.method3003(arg3, -23061);
        if (arg1 >= -79) {
            method3946(41, (byte) -99, -19, 33, (class116) null);
        }
        arg4.field1575.method2977(false, arg2);
        arg4.field1575.method3044(arg0, 74);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lsda;Lha;ILhv;)V")
    public static final void method3947(class547 arg0, class473 arg1, int arg2, class226 arg3) {
        ++field9733;
        class318 var4 = arg0.method3239(arg1, false);
        if (var4 != null) {
            int var5 = var4.method737();
            if (var4.method738() > var5) {
                var5 = var4.method738();
            }
            byte var6 = 10;
            int var7 = arg3.field3425;
            int var8 = arg3.field3430;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field7597 != null) {
                var9 = class525.field7226.method1955((class318[]) null, class548.field7648, arg0.field7597, (int[]) null, false);
                for (int var12 = 0; ~var12 > ~var9; ++var12) {
                    String var13 = class548.field7648[var12];
                    if (var9 + -1 > var12) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class531.field7312.method2952(var13);
                    if (~var14 < ~var10) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class531.field7312.method2950() - -(class531.field7312.method2953() / 2);
            }
            int var15 = var5 / 2 + arg3.field3425;
            int var16 = arg3.field3430;
            if (var7 >= class46.field510 + var5) {
                if (var7 > -var5 + class46.field515) {
                    var15 = class46.field515 - (var6 + 5) + -(var5 / 2) + -(var10 / 2);
                    var7 = -var5 + class46.field515;
                }
            } else {
                var7 = class46.field510;
                var15 = var5 / 2 + 5 + var10 / 2 + var6 + class46.field510;
            }
            if (var8 < class46.field499 + var5) {
                var16 = class46.field499 - -var6 - -(var5 / 2);
                var8 = class46.field499;
            } else if (var8 > -var5 + class46.field507) {
                var8 = -var5 + class46.field507;
                var16 = class46.field507 - var5 / 2 + -var6 + -var11;
            }
            int var17 = (int) (Math.atan2((double) (var7 - arg3.field3425), (double) (var8 - arg3.field3430)) / 3.141592653589793D * 32767.0D) & 65535;
            var4.method2024((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg0.field7597 != null) {
                var19 = var16;
                var18 = var15 - var10 / 2 + -5;
                var20 = var10 + var18 + 10;
                var21 = var16 + 3 + var9 * class531.field7312.method2950();
                if (arg0.field7633 != 0) {
                    arg1.method2822(-var16 + var21, var20 - var18, var18, 1, var16, arg0.field7633);
                }
                if (arg0.field7602 != 0) {
                    arg1.method2818(arg0.field7602, var20 - var18, var18, (byte) -34, var16, var21 - var16);
                }
                for (int var22 = 0; var9 > var22; ++var22) {
                    String var23 = class548.field7648[var22];
                    if (var22 < var9 + -1) {
                        var23 = var23.substring(0, var23.length() + -4);
                    }
                    class531.field7312.method2948(arg1, var23, var15, var16, arg0.field7609, true);
                    var16 += class531.field7312.method2950();
                }
            }
            if (arg0.field7634 != arg2 || arg0.field7597 != null) {
                int var24 = var5 >> 1;
                class361 var25 = new class361(arg3);
                var25.field5211 = -var24 + var8;
                var25.field5205 = var21;
                var25.field5210 = var19;
                var25.field5209 = var7 - var24;
                var25.field5203 = var20;
                var25.field5215 = var7 - -var24;
                var25.field5206 = var18;
                var25.field5202 = var8 + var24;
                class94.field1093.method1039(var25, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        ++field9731;
        class393.method2423(true);
        int var2 = -45 / ((50 - arg0) / 41);
    }
}
