import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class15 extends class427 {

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field160 = -1;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    private int field154 = -1;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lbi;")
    public static class104 field158 = new class104(59, 0);

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field163 = 0;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "F")
    public static float field161;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Ljava/lang/Object;")
    public static Object field162;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        ++field159;
        if (arg0 <= 16) {
            this.field160 = -8;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field154, this.field160, 3553, 0, 0);
        this.field160 = -1;
        this.field154 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lna;II)V")
    public class15(class211 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field156 = arg2;
        super.field6451.method1540(35, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field6449, arg2, arg2, 0, class531.method3157(6406, super.field6449), 5121, (byte[]) null, 0);
        }
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZLwq;)V")
    public static final void method83(boolean arg0, boolean arg1, class378 arg2) {
        ++field155;
        if (~class501.field7514 > -401) {
            if (!arg0) {
                field161 = -2.351933F;
            }
            class191 var3 = arg2.field5809;
            if (var3.field2798 != null) {
                var3 = var3.method1190(-1, class96.field1394);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field2813) {
                String var4 = var3.field2805;
                if (var3.field2791 != 0) {
                    String var5 = class516.field7674 != class261.field4216 ? class9.field97.method1583(115, class12.field131) : class516.field7672.method1583(106, class12.field131);
                    var4 = var4 + class385.method2481(class358.field5565.field5450, (byte) -44, var3.field2791) + " (" + var5 + var3.field2791 + ")";
                }
                if (!class128.field1732) {
                    if (!arg1) {
                        String[] var6 = var3.field2818;
                        if (class184.field2668) {
                            var6 = class100.method679(var6, -1);
                        }
                        if (var6 != null) {
                            for (int var7 = 4; ~var7 <= -1; --var7) {
                                if (var6[var7] != null && (var3.field2838 == 0 || !var6[var7].equalsIgnoreCase(class228.field3802.method1583(101, class12.field131)))) {
                                    byte var8 = 0;
                                    if (var7 == 0) {
                                        var8 = 20;
                                    }
                                    int var9 = class460.field7099;
                                    if (~var7 == -2) {
                                        var8 = 19;
                                    }
                                    if (var7 == 2) {
                                        var8 = 17;
                                    }
                                    if (var7 == 3) {
                                        var8 = 11;
                                    }
                                    if (var3.field2803 == var7) {
                                        var9 = var3.field2770;
                                    }
                                    if (~var7 == -5) {
                                        var8 = 6;
                                    }
                                    if (~var3.field2812 == ~var7) {
                                        var9 = var3.field2794;
                                    }
                                    ++class539.field7884;
                                    class279.method1875((long) arg2.field847, 0, true, false, "<col=ffff00>" + var4, -1, 0, var6[var7], -85, var8, var6[var7].equalsIgnoreCase(class228.field3802.method1583(105, class12.field131)) ? var3.field2821 : var9);
                                }
                            }
                        }
                        if (var3.field2838 == 1 && var6 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class228.field3802.method1583(111, class12.field131))) {
                                    short var11 = 0;
                                    if (~class358.field5565.field5450 > ~var3.field2791) {
                                        var11 = 2000;
                                    }
                                    short var12 = 0;
                                    if (var10 == 0) {
                                        var12 = 20;
                                    }
                                    if (~var10 == -2) {
                                        var12 = 19;
                                    }
                                    if (var10 == 2) {
                                        var12 = 17;
                                    }
                                    if (~var10 == -4) {
                                        var12 = 11;
                                    }
                                    if (~var10 == -5) {
                                        var12 = 6;
                                    }
                                    if (var12 != 0) {
                                        var12 += var11;
                                    }
                                    class279.method1875((long) arg2.field847, 0, true, false, "<col=ffff00>" + var4, -1, 0, var6[var10], -60, var12, var3.field2821);
                                    ++class242.field3932;
                                }
                            }
                        }
                    }
                    class279.method1875((long) arg2.field847, 0, true, arg1, "<col=ffff00>" + var4, -1, 0, class385.field5896.method1583(124, class12.field131), -97, 1004, class511.field7604);
                    ++class417.field6335;
                } else {
                    if (!arg1) {
                        class442 var13 = ~class231.field3822 != 0 ? class274.field4353.method1171((byte) 82, class231.field3822) : null;
                        if ((2 & class535.field7838) != 0) {
                            if (var13 == null || var3.method1192(class231.field3822, true, var13.field6872) != var13.field6872) {
                                ++class272.field4337;
                                class279.method1875((long) arg2.field847, 0, true, false, class283.field4459 + " -> <col=ffff00>" + var4, -1, 0, class427.field6450, -116, 48, class186.field2716);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static final void method84(int arg0) {
        ++field153;
        class310.field4844.method521(-94);
        class32.field333.method1134(arg0);
        class17.field178.method1033(true);
        class454.field7029.method3003(true);
        class6.field72.method2972((byte) 116);
        class337.field5262.method2075((byte) -23);
        class388.field5915.method1697(-71);
        class85.field1242.method1976((byte) -104);
        class197.field3037.method762((byte) -20);
        class322.field5027.method598(0);
        class19.field199.method2293(-1);
        class453.field7020.method2741(64);
        class457.field7049.method660(-120);
        class360.field5583.method129(28569);
        class274.field4353.method1169((byte) -106);
        class93.field1361.method841(arg0 + 124);
        class187.field2727.method771((byte) -101);
        class525.field7743.method551(-106);
        class359.field5569.method1764(27);
        class436.field6588.method350(113);
        class280.method1889(false);
        class457.method2865(0);
        class116.method742(true);
        class388.method2491((byte) -112);
        class121.field1653.method2187(-1);
        class122.field1660.method2187(-1);
        class174.field2538.method2187(-1);
        class316.field4933.method2187(-1);
        class420.field6380.method2187(-1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
    public final void method85(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field157;
        OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg0, super.field6471, arg1);
        int var6 = 50 % ((-65 - arg3) / 59);
        this.field154 = arg4;
        this.field160 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lna;IIZ[[BI)V")
    public class15(class211 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field156 = arg2;
        super.field6451.method1540(43, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6449, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public static void method86(int arg0) {
        field162 = null;
        field158 = null;
        if (arg0 != 8264) {
            method83(true, true, (class378) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lna;IIZ[[I)V")
    public class15(class211 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field156 = arg2;
        super.field6451.method1540(45, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field6449, arg2, arg2, 0, 32993, super.field6451.field3609, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class225.method1625(34069 - -var7, 32993, arg4[var7], arg2, arg2, super.field6451.field3609, 32993, super.field6449);
            }
        }
        this.method2703(0, true);
    }
}
