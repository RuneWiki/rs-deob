import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class129 extends class314 {

    @OriginalMember(owner = "client!mr", name = "N", descriptor = "I")
    private int field2118 = 4;

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "I")
    private int field2124 = 4;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2116 = "";

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "Z")
    public static boolean field2120 = true;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!mr", name = "O", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!mr", name = "Q", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!mr", name = "R", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!mr", name = "S", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!mr", name = "U", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLie;I)V", line = 3)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field2121;
        if (arg0 < -1) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field2118 = arg1.method70(-9059);
                }
            } else {
                this.field2124 = arg1.method70(-9059);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 39)
    public class129() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(I)V", line = 45)
    public static void method1124(int arg0) {
        field2116 = null;
        if (arg0 != 0) {
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "(I)[Lmea;", line = 55)
    public static final class395[] method1125(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2117;
            return new class395[] { class203.field3293, class561.field8082, class565.field8119 };
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;", line = 67)
    public static final Object method1126(boolean arg0, byte arg1, byte[] arg2) {
        ++field2122;
        if (arg2 == null) {
            return null;
        } else {
            int var3 = 76 / ((10 - arg1) / 46);
            if (arg2.length > 136 && !class87.field1061) {
                try {
                    class56 var4 = (class56) Class.forName("et").newInstance();
                    var4.method653(arg2, -13854);
                    return var4;
                } catch (Throwable var5) {
                    class87.field1061 = true;
                }
            }
            return arg0 ? class368.method2436(0, arg2) : arg2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)[[I", line = 99)
    public final int[][] method4(int arg0, byte arg1) {
        ++field2119;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int var4 = class81.field1009 / this.field2124;
            int var5 = class246.field3926 / this.field2118;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method2143(0, 0, (byte) -4);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2143(0, class246.field3926 * var7 / var5, (byte) -4);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class81.field1009; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class81.field1009 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return arg1 <= 68 ? null : var3;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I", line = 172)
    public final int[] method6(int arg0, int arg1) {
        ++field2123;
        int[] var3 = super.field4928.method534((byte) -60, arg0);
        if (super.field4928.field618) {
            int var4 = class81.field1009 / this.field2124;
            int var5 = class246.field3926 / this.field2118;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2140(0, class246.field3926 * var6 / var5, -124);
            } else {
                var7 = this.method2140(0, 0, -125);
            }
            for (int var8 = 0; class81.field1009 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class81.field1009 * var9 / var4];
                }
            }
        }
        if (arg1 <= 109) {
            method1127((byte) -107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z", line = 230)
    public static final boolean method1127(byte arg0) {
        ++field2125;
        boolean var1 = true;
        if (class189.field3155 == null) {
            if (class158.field2699.method942(0, class253.field4039)) {
                class189.field3155 = class284.method2029(class158.field2699, class253.field4039);
            } else {
                var1 = false;
            }
        }
        if (class144.field2416 == null) {
            if (class158.field2699.method942(0, class283.field4527)) {
                class144.field2416 = class284.method2029(class158.field2699, class283.field4527);
            } else {
                var1 = false;
            }
        }
        if (class582.field8280 == null) {
            if (!class158.field2699.method942(arg0 ^ 30, class392.field6132)) {
                var1 = false;
            } else {
                class582.field8280 = class284.method2029(class158.field2699, class392.field6132);
            }
        }
        if (class121.field1950 == null) {
            if (class51.field682.method942(0, class520.field7518)) {
                class121.field1950 = class597.method3482(32, class520.field7518, class51.field682);
            } else {
                var1 = false;
            }
        }
        if (arg0 != 30) {
            field2120 = false;
        }
        if (class680.field9540 == null) {
            if (!class158.field2699.method942(arg0 + -30, class520.field7518)) {
                var1 = false;
            } else {
                class680.field9540 = class284.method2028(class158.field2699, class520.field7518);
            }
        }
        return var1;
    }
}
