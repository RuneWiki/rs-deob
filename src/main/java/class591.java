import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class591 extends class201 {

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field8330 = 0;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    public static int field8338 = 0;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "Lpia;")
    public static class94 field8335 = new class94(84, 3);

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "Z")
    public static volatile boolean field8340 = true;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "F")
    public static float field8328;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Lkm;")
    public static class353 field8336;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "[I")
    public static int[] field8332;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V")
    public static void method3382(int arg0) {
        field8336 = null;
        field8332 = null;
        field8335 = null;
        if (arg0 != -15080) {
            method3386(-128, 75, -82, -97, (int[]) null, 106, -35, 40, (int[]) null, (byte) 107, (float[]) null, (float[]) null, -41);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BC)I")
    public static final int method3383(byte arg0, char arg1) {
        ++field8334;
        if (arg0 != -7) {
            return -96;
        } else {
            return arg1 >= 0 && ~arg1 > ~class375.field4823.length ? class375.field4823[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIZ)V")
    public final void method867(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field8337;
        if (!arg3) {
            this.method869(true, 33, -108, -115);
        }
        int var5 = this.method1212(100) * super.field2375.field1249 / 10000;
        class275.field3370.method370(arg1, arg2 + 2, var5, super.field2375.field1250 + -2, ((class724) super.field2375).field10136, 0);
        class275.field3370.method370(arg1 - -var5, arg2 + 2, -var5 + super.field2375.field1249, super.field2375.field1250 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BZ)V")
    public static final void method3384(byte arg0, boolean arg1) {
        for (class376 var2 = (class376) class1.field6.method1719(65280); var2 != null; var2 = (class376) class1.field6.method1723(-20665)) {
            if (var2.field4859 != null) {
                class597.field8470.method1690(var2.field4859);
                var2.field4859 = null;
            }
            if (var2.field4848 != null) {
                class597.field8470.method1690(var2.field4848);
                var2.field4848 = null;
            }
            var2.method864(12983);
        }
        ++field8333;
        int var3 = -68 / ((arg0 - -13) / 54);
        if (arg1) {
            for (class376 var4 = (class376) class375.field4815.method1719(65280); var4 != null; var4 = (class376) class375.field4815.method1723(-20665)) {
                if (var4.field4859 != null) {
                    class597.field8470.method1690(var4.field4859);
                    var4.field4859 = null;
                }
                var4.method864(12983);
            }
            for (class376 var5 = (class376) class653.field9319.method1753(0); var5 != null; var5 = (class376) class653.field9319.method1755(-67)) {
                if (var5.field4859 != null) {
                    class597.field8470.method1690(var5.field4859);
                    var5.field4859 = null;
                }
                var5.method864(12983);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method3385(byte arg0, int arg1) {
        ++field8331;
        if (arg0 != 88) {
            method3384((byte) 118, false);
        }
        class456 var2 = (class456) class228.field2651.method1754(false, (long) arg1);
        if (var2 != null) {
            class501 var3 = var2.field6543.method3489((byte) 115);
            if (var3 != null) {
                double var4 = var2.field6543.method3483((byte) -63);
                if ((double) var3.method2975(-7132) <= var4 && (double) var3.method2974(false) >= var4) {
                    return var3.method2976(true);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Loh;Loh;Laca;)V")
    public class591(class404 arg0, class404 arg1, class724 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIII)V")
    public final void method869(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8339;
        class275.field3370.method399(arg2 + -2, arg1, super.field2375.field1249 - -4, super.field2375.field1250 + 2, ((class724) super.field2375).field10138, 0);
        int var5 = 27 % ((-69 - arg3) / 42);
        class275.field3370.method399(arg2 + -1, arg1 + 1, super.field2375.field1249 + 2, super.field2375.field1250, 0, 0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII[IIII[IB[F[FI)V")
    public static final void method3386(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, byte arg9, float[] arg10, float[] arg11, int arg12) {
        ++field8329;
        if (arg9 == -120) {
            int var13 = arg0 * arg3 + arg2;
            int var14 = arg6 * arg7 - -arg5;
            int var15 = -arg12 + arg0;
            int var16 = -arg12 + arg7;
            if (arg4 != null) {
                if (arg10 != null) {
                    for (int var17 = 0; var17 < arg1; ++var17) {
                        int var18 = arg12 + var13;
                        while (~var13 > ~var18) {
                            arg8[var14] = arg4[var13];
                            arg11[var14++] = arg10[var13++];
                        }
                        var13 += var15;
                        var14 += var16;
                    }
                } else {
                    for (int var19 = 0; ~var19 > ~arg1; ++var19) {
                        int var20 = arg12 + var13;
                        while (~var13 > ~var20) {
                            arg8[var14++] = arg4[var13++];
                        }
                        var13 += var15;
                        var14 += var16;
                    }
                }
            } else {
                for (int var21 = 0; arg1 > var21; ++var21) {
                    int var22 = arg12 + var13;
                    while (var13 < var22) {
                        arg11[var14++] = arg10[var13++];
                    }
                    var13 += var15;
                    var14 += var16;
                }
            }
        }
    }
}
