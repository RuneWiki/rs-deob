import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 extends class200 {

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field670 = 32768;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field667 = 255;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Lid;")
    public static class149 field672 = class60.method382("null", (byte) 124);

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field673;

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class44() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Laj;I)Laj;")
    public static final class47 method254(class47 arg0, int arg1) {
        ++field674;
        class47 var2 = client.method1115(arg0);
        if (arg1 != 255) {
            field667 = 101;
        }
        if (var2 == null) {
            var2 = arg0.field852;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static final void method255(int arg0) {
        ++field679;
        try {
            if (arg0 == 10359) {
                if (~class76.field1375 == -2) {
                    int var1 = class189.field3382.method558((byte) 112);
                    if (var1 > 0 && class189.field3382.method575((byte) -119)) {
                        int var2 = var1 - class231.field4070;
                        if (~var2 > -1) {
                            var2 = 0;
                        }
                        class189.field3382.method567(var2, arg0 ^ 10317);
                    } else {
                        class189.field3382.method553(-62);
                        class189.field3382.method566(false);
                        class243.field4276 = null;
                        if (class128.field2254 != null) {
                            class76.field1375 = 2;
                        } else {
                            class76.field1375 = 0;
                        }
                        class230.field4024 = null;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class189.field3382.method553(arg0 + -10486);
            class243.field4276 = null;
            class230.field4024 = null;
            class128.field2254 = null;
            class76.field1375 = 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static void method256(int arg0) {
        field673 = null;
        field672 = null;
        if (arg0 != -2) {
            field678 = 67;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        class124.method871(-104);
        ++field668;
        int var2 = -29 / ((arg0 - -60) / 62);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        ++field669;
        if (!arg0) {
            field673 = null;
        }
        int[][] var3 = super.field3632.method965(arg1, 98);
        if (super.field3632.field2550) {
            int[] var4 = this.method1368(1, arg1, false);
            int[] var5 = this.method1368(2, arg1, false);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; ~var9 > ~class137.field2515; ++var9) {
                int var10 = (1046028 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field670 >> 12;
                int var12 = class106.field1832[var10] * var11 >> 12;
                int var13 = class270.field4860[var10] * var11 >> 12;
                int var14 = class261.field4667 & var9 - -(var12 >> 12);
                int var15 = class191.field3436 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1366(var15, false, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field671;
        if (arg1 != 55) {
            this.method31((class74) null, false, -75);
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(1, arg0, false);
            int[] var5 = this.method1368(2, arg0, false);
            for (int var6 = 0; ~var6 > ~class137.field2515; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field670 >> 12;
                int var9 = class106.field1832[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class261.field4667;
                int var11 = class270.field4860[var7] * var8 >> 12;
                int var12 = class191.field3436 & arg0 - -(var11 >> 12);
                int[] var13 = this.method1368(0, var12, false);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field677;
        for (int var5 = 0; class259.field4538 > var5; ++var5) {
            if (arg4 < class54.field979[var5] + class157.field2887[var5] && arg4 - -arg2 > class54.field979[var5] && class41.field645[var5] - -class259.field4548[var5] > arg0 && ~(arg0 + arg1) < ~class41.field645[var5]) {
                class216.field3819[var5] = true;
            }
        }
        if (arg3 != -356) {
            field675 = -57;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3641 = ~arg0.method489((byte) -53) == -2;
            }
        } else {
            this.field670 = arg0.method485(-2386) << 4;
        }
        if (!arg1) {
            method254((class47) null, -122);
        }
        ++field676;
    }
}
