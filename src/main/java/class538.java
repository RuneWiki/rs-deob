import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class538 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Ldm;")
    private class98 field7515;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    private int field7531;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lgca;")
    private class209 field7516;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field7526 = 1400;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field7530 = -1;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[Lji;")
    public static class83[] field7533;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/Object;J)V", line = 4)
    public final void method3199(byte arg0, Object arg1, long arg2) {
        this.method3209(arg2, arg1, -16777216, 1);
        if (arg0 != 78) {
            field7526 = 113;
        }
        field7535++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 17)
    public final Object method3200(long arg0, int arg1) {
        field7534++;
        class409 var4 = (class409) this.field7516.method1381(true, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2496(4);
        if (var5 == null) {
            var4.method3065(-17363);
            var4.method1706((byte) 79);
            this.field7520 += var4.field5688;
            return null;
        } else if (arg1 == -19983) {
            if (var4.method2495((byte) 65)) {
                class745 var6 = new class745(var5, var4.field5688);
                this.field7516.method1387(var6, var4.field7166, (byte) -114);
                this.field7515.method666(8192, var6);
                var6.field3778 = 0L;
                var4.method3065(-17363);
                var4.method1706((byte) 79);
            } else {
                this.field7515.method666(arg1 + 28175, var4);
                var4.field3778 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)V", line = 65)
    private final void method3201(int arg0, long arg1) {
        field7532++;
        class409 var4 = (class409) this.field7516.method1381(true, arg1);
        this.method3208(var4, 512);
        if (arg0 > -100) {
            this.method3204((byte) -24, -70);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 79)
    public final void method3202(byte arg0) {
        if (arg0 < 126) {
            this.method3199((byte) 46, null, 83L);
        }
        for (class409 var2 = (class409) this.field7515.method667(true); var2 != null; var2 = (class409) this.field7515.method662((byte) -17)) {
            if (var2.method2495((byte) 65)) {
                var2.method3065(-17363);
                var2.method1706((byte) 79);
                this.field7520 += var2.field5688;
            }
        }
        field7527++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 107)
    public static void method3203(int arg0) {
        if (arg0 != -334) {
            field7530 = 96;
        }
        field7533 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V", line = 120)
    public final void method3204(byte arg0, int arg1) {
        field7528++;
        int var3 = -64 % ((arg0 + 10) / 58);
        if (class7.field62 == null) {
            return;
        }
        for (class409 var4 = (class409) this.field7515.method667(true); var4 != null; var4 = (class409) this.field7515.method662((byte) 127)) {
            if (var4.method2495((byte) 65)) {
                if (var4.method2496(4) == null) {
                    var4.method3065(-17363);
                    var4.method1706((byte) 79);
                    this.field7520 += var4.field5688;
                }
            } else if (((long) arg1) < (++var4.field3778)) {
                class409 var5 = class7.field62.method2850(var4, 0);
                this.field7516.method1387(var5, var4.field7166, (byte) -103);
                class679.method3891((byte) 65, var4, var5);
                var4.method3065(-17363);
                var4.method1706((byte) 79);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 168)
    public final Object method3205(int arg0) {
        field7525++;
        if (arg0 != 512) {
            this.method3210(true);
        }
        class409 var2 = (class409) this.field7516.method1383(false);
        while (var2 != null) {
            Object var3 = var2.method2496(4);
            if (var3 != null) {
                return var3;
            }
            class409 var4 = var2;
            var2 = (class409) this.field7516.method1383(false);
            var4.method3065(-17363);
            var4.method1706((byte) 79);
            this.field7520 += var4.field5688;
        }
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I", line = 199)
    public final int method3206(int arg0) {
        if (arg0 != 334) {
            this.method3212(-23);
        }
        field7521++;
        return this.field7520;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 211)
    public final Object method3207(boolean arg0) {
        field7519++;
        class409 var2 = (class409) this.field7516.method1382(27901);
        if (arg0) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method2496(4);
            if (var3 != null) {
                return var3;
            }
            class409 var4 = var2;
            var2 = (class409) this.field7516.method1383(false);
            var4.method3065(-17363);
            var4.method1706((byte) 79);
            this.field7520 += var4.field5688;
        }
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lbia;I)V", line = 242)
    private final void method3208(class409 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method3065(arg1 - 17875);
            arg0.method1706((byte) 79);
            this.field7520 += arg0.field5688;
        }
        if (arg1 != 512) {
            this.method3209(-126L, null, 67, 23);
        }
        field7514++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JLjava/lang/Object;II)V", line = 262)
    public final void method3209(long arg0, Object arg1, int arg2, int arg3) {
        field7536++;
        if (this.field7531 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method3201(arg2 + 16777103, arg0);
        this.field7520 -= arg3;
        if (arg2 != -16777216) {
            this.method3200(-98L, 53);
        }
        while (this.field7520 < 0) {
            class409 var7 = (class409) this.field7515.method665((byte) -55);
            this.method3208(var7, 512);
        }
        class745 var6 = new class745(arg1, arg3);
        this.field7516.method1387(var6, arg0, (byte) -103);
        this.field7515.method666(8192, var6);
        var6.field3778 = 0L;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V", line = 295)
    public final void method3210(boolean arg0) {
        field7518++;
        this.field7515.method661(arg0);
        this.field7516.method1385((byte) -97);
        this.field7520 = this.field7531;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V", line = 305)
    public class538(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)I", line = 310)
    public final int method3211(byte arg0) {
        field7517++;
        int var2 = 0;
        int var3 = 65 % ((12 - arg0) / 42);
        for (class409 var4 = (class409) this.field7515.method667(true); var4 != null; var4 = (class409) this.field7515.method662((byte) -21)) {
            if (!var4.method2495((byte) 65)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)I", line = 337)
    public final int method3212(int arg0) {
        int var2 = -27 / ((arg0 + 81) / 39);
        field7522++;
        return this.field7531;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Lrea;", line = 349)
    public static final class120 method3213(int arg0) {
        field7523++;
        if (arg0 != 334) {
            field7524 = -6;
        }
        return class631.field8990 == 0 ? new class120() : class663.field9345[--class631.field8990];
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIZI)V", line = 364)
    public static final void method3214(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field7529++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg1 >= -119) {
            method3213(-40);
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class510.field7113 - class160.field2200) * var6 / 100 + class160.field2200;
        if (class125.field1702 > var7) {
            var7 = class125.field1702;
        } else if (class624.field8917 < var7) {
            var7 = class624.field8917;
        }
        int var8 = var7 * 512 * arg0 / (arg5 * 334);
        if (var8 < class554.field7823) {
            short var12 = class554.field7823;
            var7 = var12 * 334 * arg5 / (arg0 * 512);
            if (var7 > class624.field8917) {
                var7 = class624.field8917;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (arg5 - var13) / 2;
                if (arg4) {
                    class96.field1401.method2198();
                    class96.field1401.method3255(arg0, var14, arg2, -16777216, (byte) -16, arg3);
                    class96.field1401.method3255(arg0, var14, arg5 + arg2 - var14, -16777216, (byte) -105, arg3);
                }
                arg5 -= var14 * 2;
                arg2 += var14;
            }
        } else if (var8 > class651.field9201) {
            short var9 = class651.field9201;
            var7 = arg5 * var9 * 334 / (arg0 * 512);
            if (var7 < class125.field1702) {
                var7 = class125.field1702;
                int var10 = arg5 * var9 * 334 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg4) {
                    class96.field1401.method2198();
                    class96.field1401.method3255(var11, arg5, arg2, -16777216, (byte) -90, arg3);
                    class96.field1401.method3255(var11, arg5, arg2, -16777216, (byte) 108, arg0 + arg3 - var11);
                }
                arg3 += var11;
                arg0 -= var11 * 2;
            }
        }
        class602.field8611 = arg0 * var7 / 334;
        class159.field2150 = arg3;
        class729.field10213 = (short) arg5;
        class304.field3957 = arg2;
        class355.field4566 = (short) arg0;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V", line = 465)
    public class538(int arg0, int arg1) {
        this.field7515 = new class98();
        this.field7531 = arg0;
        this.field7520 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field7516 = new class209(var3);
    }
}
