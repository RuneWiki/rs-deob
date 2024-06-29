import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class13 extends class214 {

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    private int field126 = 32768;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field121 = -1;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Llw;")
    public static class233 field129 = new class233(2);

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Lha;")
    public static class544 field119;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "[Lbia;")
    public static class409[] field130;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method58(String arg0, int arg1) {
        ++field123;
        if (class552.field7867 && ~(24 & class553.field7869) != -1) {
            if (arg1 != 16) {
                field129 = null;
            }
            boolean var2 = false;
            int var3 = class472.field6857;
            int[] var4 = class96.field1419;
            for (int var5 = 0; ~var3 < ~var5; ++var5) {
                class573 var6 = class279.field4271[var4[var5]];
                if (var6.field8146 != null && var6.field8146.equalsIgnoreCase(arg0) && (class145.field2251 == var6 && (class553.field7869 & 16) != 0 || var6 != null && (class553.field7869 & 8) != 0)) {
                    ++class602.field8512;
                    class540 var7 = class257.method1732(true, class328.field4834, class655.field9332);
                    var7.field7707.method1925(class436.field6364, (byte) 88);
                    var7.field7707.method1939(var4[var5], 1134947720);
                    var7.field7707.method1970((byte) 29, class711.field10004);
                    var7.field7707.method1925(class289.field4444, (byte) -127);
                    var7.field7707.method1959(-98, 0);
                    class756.method4211(var7, 126);
                    var2 = true;
                    class490.method2973(var6.field1702[0], var6.method878(-5740), arg1 + -30542, true, var6.method878(-5740), 0, -2, var6.field1704[0], 0);
                    break;
                }
            }
            if (!var2) {
                class564.method3268(class641.field9014.method3621(119, class467.field6804) + arg0, 17137, 4);
            }
            if (class552.field7867) {
                class531.method3143((byte) -65);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 57)
    public class13() {
        super(3, false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILofa;I)V", line = 63)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field122;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field3540 = arg1.method1987(-36) == 1;
            }
        } else {
            this.field126 = arg1.method1989((byte) -105) << 4;
        }
        if (arg0 <= 92) {
            field119 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V", line = 105)
    public static void method60(int arg0) {
        field130 = null;
        if (arg0 == 8) {
            field119 = null;
            field129 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lha;Z)V", line = 118)
    public static final void method61(class544 arg0, boolean arg1) {
        ++field127;
        if (!arg1) {
            method60(18);
        }
        int var2 = 0;
        int var3 = 0;
        if (class250.field3989) {
            var2 = class499.method3028(0);
            var3 = class545.method3197(36);
        }
        arg0.method240(var2, var3, class660.field9408 + var2, 350 - -var3);
        arg0.method410(var2, var3, class660.field9408, 350, class138.field2172 << 24 | 3351159, 1);
        class438.method2696(var3, var3 + 350, var2 - -class660.field9408, (byte) 91, var2);
        int var4 = 350 / class293.field4499;
        if (~class336.field4920 < -1) {
            int var5 = -class293.field4499 + -4 + 346;
            int var6 = var4 * var5 / (class336.field4920 + var4 + -1);
            int var7 = 4;
            if (class336.field4920 > 1) {
                var7 += (var5 - var6) * (class336.field4920 + -1 + -class92.field1373) / (class336.field4920 - 1);
            }
            arg0.method410(var2 - 16 + class660.field9408, var3 - -var7, 12, var6, 3351159 | class138.field2172 << 24, 2);
            for (int var8 = class92.field1373; ~var8 > ~(class92.field1373 - -var4) && ~var8 > ~class336.field4920; ++var8) {
                String[] var9 = class750.method4181((byte) -20, class8.field84[var8], '\b');
                int var10 = (class660.field9408 + -16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; ++var11) {
                    int var12 = 8 - -(var10 * var11);
                    arg0.method240(var2 + var12, var3, var10 + -8 + var12 + var2, var3 + 350);
                    class74.field1105.method2483(-1, var2 + var12, class711.method3940((byte) -125, var9[var11]), -class594.field8343.field861 + 350 + var3 - class432.field6335 + -((-class92.field1373 + var8) * class293.field4499) - 2, -103, -16777216);
                }
            }
        }
        class236.field3788.method2482("Build: 635", -16777216, var2 - 25 + class660.field9408, 0, -1, var3 + -20 + 350);
        arg0.method240(var2, var3, class660.field9408 + var2, var3 + 350);
        arg0.method3188(class660.field9408, -1, -class432.field6335 + 350 + var3, (byte) -65, var2);
        class257.field4034.method2483(-1, var2 - -10, "--> " + class711.method3940((byte) -124, class665.field9445), var3 - class632.field8881.field861 + 350 + -1, -91, -16777216);
        if (class261.field4065) {
            int var13 = -1;
            if (class199.field3403 % 30 > 15) {
                var13 = 16777215;
            }
            arg0.method3194(-21151, var3 - 11 + 350 + -class632.field8881.field861, var2 + 10 + class632.field8881.method510("--> " + class711.method3940((byte) -125, class665.field9445).substring(0, class174.field2996), 174), var13, 12);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[[I", line = 198)
    public final int[][] method62(int arg0, int arg1) {
        ++field120;
        int[][] var3 = super.field3545.method2996((byte) 119, arg0);
        if (arg1 != -256) {
            return null;
        } else {
            if (super.field3545.field7147) {
                int[] var4 = this.method1545(arg0, 1, arg1 + 255);
                int[] var5 = this.method1545(arg0, 2, arg1 + 255);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class626.field8787; ++var9) {
                    int var10 = (var4[var9] * 255 & 1045057) >> 12;
                    int var11 = var5[var9] * this.field126 >> 12;
                    int var12 = class3.field18[var10] * var11 >> 12;
                    int var13 = class55.field885[var10] * var11 >> 12;
                    int var14 = class245.field3948 & (var12 >> 12) + var9;
                    int var15 = class580.field8203 & (var13 >> 12) + arg0;
                    int[][] var16 = this.method1539(true, 0, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILraa;BILaa;IIJI)V", line = 258)
    public static final void method63(int arg0, class353 arg1, byte arg2, int arg3, class570 arg4, int arg5, int arg6, long arg7, int arg8) {
        ++field128;
        int var10 = arg3 * arg3 - -(arg5 * arg5);
        if ((long) var10 <= arg7) {
            int var11 = Math.min(arg1.field5230 / 2, arg1.field5280 / 2);
            if (~(var11 * var11) > ~var10) {
                var11 -= 10;
                int var12;
                if (~class639.field8978 != -5) {
                    var12 = 16383 & (int) class261.field4064 + class25.field252;
                } else {
                    var12 = 16383 & (int) class261.field4064;
                }
                int var13 = class582.field8226[var12];
                int var14 = class582.field8230[var12];
                if (class639.field8978 != 4) {
                    var13 = var13 * 256 / (class754.field10516 + 256);
                    var14 = var14 * 256 / (class754.field10516 + 256);
                }
                int var15 = arg5 * var13 - -(arg3 * var14) >> 14;
                int var16 = arg5 * var14 + -(arg3 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class315.field4732[arg6].method176((float) arg1.field5230 / 2.0F + (float) arg0 + (float) var19, (float) arg1.field5280 / 2.0F + (float) arg8 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class478.method2907(arg4, true, arg1, arg0, arg3, class611.field8619[arg6], arg8, arg5);
            }
            if (arg2 != -67) {
                field129 = null;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I", line = 312)
    public final int[] method64(int arg0, byte arg1) {
        ++field125;
        int[] var3 = super.field3544.method3869(arg0, -116);
        if (arg1 != 5) {
            method58((String) null, -15);
        }
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 1, -1);
            int[] var5 = this.method1545(arg0, 2, -1);
            for (int var6 = 0; class626.field8787 > var6; ++var6) {
                int var7 = (4093 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field126 >> 12;
                int var9 = class3.field18[var7] * var8 >> 12;
                int var10 = class55.field885[var7] * var8 >> 12;
                int var11 = class245.field3948 & (var9 >> 12) + var6;
                int var12 = class580.field8203 & (var10 >> 12) + arg0;
                int[] var13 = this.method1545(var12, 0, -1);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 365)
    public final void method65(int arg0) {
        if (arg0 > 48) {
            ++field124;
            class465.method2853(256);
        }
    }
}
