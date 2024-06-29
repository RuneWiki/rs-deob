import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class536 {

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Lut;")
    private class719 field6761;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    private int field6768;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Lrda;")
    private class467 field6753;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field6770 = 0;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field6760 = 0;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "J")
    public static long field6775 = 0L;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
    public static boolean field6762;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 3)
    public final void method2918(long arg0, Object arg1, int arg2) {
        this.method2933(1, (byte) -65, arg0, arg1);
        if (arg2 < 89) {
            field6775 = -83L;
        }
        field6754++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 14)
    public final void method2919(int arg0) {
        field6771++;
        this.field6761.method3860((byte) 92);
        this.field6753.method2617(28812);
        if (arg0 == 0) {
            this.field6768 = this.field6757;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V", line = 28)
    public class536(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(JB)V", line = 35)
    private final void method2920(long arg0, byte arg1) {
        field6774++;
        class242 var4 = (class242) this.field6753.method2616(arg0, (byte) 24);
        this.method2923((byte) 78, var4);
        if (arg1 != 62) {
            this.method2922(5);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 52)
    public final Object method2921(int arg0) {
        field6752++;
        class242 var2 = (class242) this.field6753.method2610((byte) -38);
        while (var2 != null) {
            Object var3 = var2.method1380(false);
            if (var3 != null) {
                return var3;
            }
            class242 var4 = var2;
            var2 = (class242) this.field6753.method2620(arg0 ^ 0x651E);
            var4.method1946(-10364);
            var4.method1084((byte) -120);
            this.field6768 += var4.field3334;
        }
        if (arg0 != 25886) {
            this.field6768 = 25;
        }
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)I", line = 85)
    public final int method2922(int arg0) {
        field6756++;
        int var2 = arg0;
        for (class242 var3 = (class242) this.field6761.method3855(0); var3 != null; var3 = (class242) this.field6761.method3861(true)) {
            if (!var3.method1377((byte) -106)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLpfa;)V", line = 112)
    private final void method2923(byte arg0, class242 arg1) {
        if (arg0 != 78) {
            field6775 = -126L;
        }
        if (arg1 != null) {
            arg1.method1946(-10364);
            arg1.method1084((byte) 61);
            this.field6768 += arg1.field3334;
        }
        field6776++;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)I", line = 131)
    public final int method2924(int arg0) {
        if (arg0 != -1) {
            field6762 = true;
        }
        field6766++;
        return this.field6768;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 142)
    public final Object method2925(int arg0) {
        field6759++;
        class242 var2 = (class242) this.field6753.method2620(0);
        while (var2 != null) {
            Object var3 = var2.method1380(false);
            if (var3 != null) {
                return var3;
            }
            class242 var4 = var2;
            var2 = (class242) this.field6753.method2620(0);
            var4.method1946(-10364);
            var4.method1084((byte) -97);
            this.field6768 += var4.field3334;
        }
        if (arg0 <= 59) {
            this.field6768 = 0;
        }
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)I", line = 175)
    public final int method2926(int arg0) {
        field6769++;
        return arg0 == -14046 ? this.field6757 : 88;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V", line = 186)
    public static final void method2927(int arg0, int arg1) {
        if (arg1 > -56) {
            method2927(-68, -39);
        }
        class299.field3785.method2928(true, arg0);
        field6763++;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(II)V", line = 254)
    public class536(int arg0, int arg1) {
        this.field6761 = new class719();
        this.field6768 = arg0;
        this.field6757 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
        }
        this.field6753 = new class467(var3);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V", line = 205)
    public final void method2928(boolean arg0, int arg1) {
        field6765++;
        if (class290.field3704 != null) {
            for (class242 var3 = (class242) this.field6761.method3855(0); var3 != null; var3 = (class242) this.field6761.method3861(true)) {
                if (var3.method1377((byte) -106)) {
                    if (var3.method1380(false) == null) {
                        var3.method1946(-10364);
                        var3.method1084((byte) -110);
                        this.field6768 += var3.field3334;
                    }
                } else if (++var3.field2278 > (long) arg1) {
                    class242 var4 = class290.field3704.method2249(var3, 121);
                    this.field6753.method2619(var4, var3.field4108, -1);
                    class1.method4(-2, var4, var3);
                    var3.method1946(-10364);
                    var3.method1084((byte) 71);
                }
            }
        }
        if (!arg0) {
            this.field6768 = -17;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V", line = 269)
    public static final void method2929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6772++;
        class56.method342(arg4, arg0 + 24463);
        int var7 = 0;
        if (arg0 != -24464) {
            return;
        }
        int var8 = arg4 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class207.field2840[arg1];
        int var16 = arg5 - var8;
        class54.method333(var16, var15, 7, arg5 - arg4, arg3);
        int var17 = arg5 + var8;
        class54.method333(var17, var15, 7, var16, arg2);
        class54.method333(arg5 + arg4, var15, arg0 ^ 0xFFFFA077, var17, arg3);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class333.field4070[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class207.field2840[arg1 + var9];
                    int[] var19 = class207.field2840[arg1 - var9];
                    int var20 = class333.field4070[var9];
                    int var21 = arg5 + var7;
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var20;
                    int var24 = arg5 - var20;
                    class54.method333(var24, var18, 7, var22, arg3);
                    class54.method333(var23, var18, arg0 + 24471, var24, arg2);
                    class54.method333(var21, var18, 7, var23, arg3);
                    class54.method333(var24, var19, 7, var22, arg3);
                    class54.method333(var23, var19, 7, var24, arg2);
                    class54.method333(var21, var19, 7, var23, arg3);
                } else {
                    int[] var25 = class207.field2840[arg1 + var9];
                    int[] var26 = class207.field2840[arg1 - var9];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class54.method333(var27, var25, 7, var28, arg3);
                    class54.method333(var27, var26, 7, var28, arg3);
                }
            }
            int[] var29 = class207.field2840[arg1 + var7];
            int[] var30 = class207.field2840[arg1 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var8 <= var7) {
                class54.method333(var31, var29, 7, var32, arg3);
                class54.method333(var31, var30, 7, var32, arg3);
            } else {
                int var33 = var7 <= var11 ? var11 : class333.field4070[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class54.method333(var35, var29, 7, var32, arg3);
                class54.method333(var34, var29, 7, var35, arg2);
                class54.method333(var31, var29, arg0 + 24471, var34, arg3);
                class54.method333(var35, var30, 7, var32, arg3);
                class54.method333(var34, var30, 7, var35, arg2);
                class54.method333(var31, var30, 7, var34, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I", line = 402)
    public static final int method2930(String arg0, int arg1, String arg2, int arg3) {
        field6758++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > var7 - var9) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class410.method2382(arg3 ^ 0xFFFFE158, var22);
            var9 = class410.method2382(-7848, var24);
            char var26 = class640.method3454(arg1, 204, var22);
            char var27 = class640.method3454(arg1, 204, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class291.method1759(false, arg1, var28) - class291.method1759(false, arg1, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class291.method1759(false, arg1, var20) - class291.method1759(false, arg1, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = arg3; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class291.method1759(false, arg1, var14) - class291.method1759(false, arg1, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(JB)Ljava/lang/Object;", line = 522)
    public final Object method2931(long arg0, byte arg1) {
        field6773++;
        class242 var4 = (class242) this.field6753.method2616(arg0, (byte) 75);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1380(false);
        if (arg1 >= -68) {
            return null;
        } else if (var5 == null) {
            var4.method1946(-10364);
            var4.method1084((byte) -122);
            this.field6768 += var4.field3334;
            return null;
        } else {
            if (var4.method1377((byte) -106)) {
                class202 var6 = new class202(var5, var4.field3334);
                this.field6753.method2619(var6, var4.field4108, -1);
                this.field6761.method3862(var6, false);
                var6.field2278 = 0L;
                var4.method1946(-10364);
                var4.method1084((byte) -124);
            } else {
                this.field6761.method3862(var4, false);
                var4.field2278 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 567)
    public final void method2932(byte arg0) {
        if (arg0 != 80) {
            return;
        }
        field6764++;
        for (class242 var2 = (class242) this.field6761.method3855(0); var2 != null; var2 = (class242) this.field6761.method3861(true)) {
            if (var2.method1377((byte) -106)) {
                var2.method1946(-10364);
                var2.method1084((byte) -102);
                this.field6768 += var2.field3334;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBJLjava/lang/Object;)V", line = 603)
    public final void method2933(int arg0, byte arg1, long arg2, Object arg3) {
        if (arg1 > -3) {
            this.field6757 = -36;
        }
        field6767++;
        if (this.field6757 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method2920(arg2, (byte) 62);
        this.field6768 -= arg0;
        while (this.field6768 < 0) {
            class242 var7 = (class242) this.field6761.method3859(0);
            this.method2923((byte) 78, var7);
        }
        class202 var6 = new class202(arg3, arg0);
        this.field6753.method2619(var6, arg2, -1);
        this.field6761.method3862(var6, false);
        var6.field2278 = 0L;
    }
}
