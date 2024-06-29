import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class356 extends class278 {

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field4865 = -1;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public static int field4866 = 0;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "[B")
    public static byte[] field4868 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "Ljm;")
    public static class485 field4867 = new class485(57, 1);

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "Lf;")
    public static class529 field4873;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)V", line = 5)
    public static void method1976(byte arg0) {
        field4873 = null;
        if (arg0 != 0) {
            field4867 = null;
        }
        field4868 = null;
        field4867 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 18)
    public static final void method1977(boolean arg0, String arg1) {
        ++field4870;
        if (class297.field4101) {
            if (arg0) {
                boolean var2 = false;
                int var3 = class378.field5322;
                int[] var4 = class95.field1321;
                for (int var5 = 0; var5 < var3; ++var5) {
                    class192 var6 = class309.field4234[var4[var5]];
                    if (var6 != null && class75.field1089 != var6 && var6.field2693 != null && var6.field2693.equalsIgnoreCase(arg1)) {
                        ++class501.field7360;
                        method1978((byte) 110, class451.field6502);
                        class244.field3395.method2067(0, 32479);
                        class244.field3395.method2072(-733958872, class455.field6651);
                        class244.field3395.method2072(-733958872, var4[var5]);
                        class244.field3395.method2070(81954016, class20.field202);
                        class244.field3395.method2101((byte) 45, class401.field5585);
                        class173.method1072(var6.field372[0], var6.method167(-1), var6.method167(-1), true, 0, 0, (byte) 126, -2, var6.field362[0]);
                        var2 = true;
                        break;
                    }
                }
                if (!var2) {
                    class99.method662((byte) 41, class350.field4791.method590(class105.field1434, -22602) + arg1);
                }
                if (class297.field4101) {
                    class370.method2145(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[[I", line = 72)
    public final int[][] method324(int arg0, int arg1) {
        ++field4871;
        if (arg0 <= 75) {
            method1976((byte) -51);
        }
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[] var4 = this.method1570(0, 2, arg1);
            int[][] var5 = this.method1568(5426, 0, arg1);
            int[][] var6 = this.method1568(5426, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class507.field7456 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Llh;II)V", line = 151)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field3754 = arg0.method2099(arg1 ^ -30227) == 1;
        }
        ++field4874;
        if (arg1 != -30446) {
            method1976((byte) 11);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 179)
    public class356() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLjm;)V", line = 184)
    public static final void method1978(byte arg0, class485 arg1) {
        if (arg0 >= 15) {
            class244.field3395.method2602(arg1.method2861(-65), (byte) 71);
            ++field4872;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)[I", line = 199)
    public final int[] method208(int arg0, int arg1) {
        ++field4869;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, arg1);
            int[] var5 = this.method1570(0, 1, arg1);
            int[] var6 = this.method1570(0, 2, arg1);
            for (int var7 = 0; class507.field7456 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        if (arg0 != -9) {
            field4868 = null;
        }
        return var3;
    }
}
