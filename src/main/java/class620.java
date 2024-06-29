import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class620 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lsc;")
    private class347 field8874;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private int field8867;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    private int field8881;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lpfa;")
    private class295 field8865;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lpia;")
    public static class94 field8873 = new class94(39, -1);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field8886 = -1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[[I")
    public static int[][] field8883;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method3537(int arg0, long arg1, Object arg2) {
        int var5 = 23 % ((arg0 - 4) / 62);
        field8879++;
        this.method3544(-25317, arg1, arg2, 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method3538(long arg0, int arg1) {
        field8882++;
        if (arg1 != 0) {
            return null;
        }
        class498 var4 = (class498) this.field8865.method1754(false, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1990((byte) -102);
        if (var5 == null) {
            var4.method864(12983);
            var4.method3562((byte) -77);
            this.field8881 += var4.field7027;
            return null;
        }
        if (var4.method1989(393216)) {
            class452 var6 = new class452(var5, var4.field7027);
            this.field8865.method1751(var6, 3970, var4.field1522);
            this.field8874.method2068(-127, var6);
            var6.field8919 = 0L;
            var4.method864(arg1 ^ 0x32B7);
            var4.method3562((byte) -97);
        } else {
            this.field8874.method2068(arg1 - 128, var4);
            var4.field8919 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
    public final void method3539(byte arg0, int arg1) {
        if (class721.field10114 != null) {
            for (class498 var3 = (class498) this.field8874.method2067(22462); var3 != null; var3 = (class498) this.field8874.method2066(0)) {
                if (var3.method1989(393216)) {
                    if (var3.method1990((byte) -102) == null) {
                        var3.method864(12983);
                        var3.method3562((byte) -91);
                        this.field8881 += var3.field7027;
                    }
                } else if ((long) arg1 < ++var3.field8919) {
                    class498 var4 = class721.field10114.method2767((byte) -81, var3);
                    this.field8865.method1751(var4, 3970, var3.field1522);
                    class716.method3996(var4, -4874, var3);
                    var3.method864(12983);
                    var3.method3562((byte) -94);
                }
            }
        }
        int var5 = 82 % ((arg0 - 70) / 44);
        field8870++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public final int method3540(byte arg0) {
        if (arg0 != -50) {
            this.field8881 = -4;
        }
        field8884++;
        return this.field8867;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public final void method3541(int arg0) {
        field8869++;
        if (arg0 != -647) {
            return;
        }
        for (class498 var2 = (class498) this.field8874.method2067(22462); var2 != null; var2 = (class498) this.field8874.method2066(0)) {
            if (var2.method1989(393216)) {
                var2.method864(arg0 + 13630);
                var2.method3562((byte) -126);
                this.field8881 += var2.field7027;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)V")
    private final void method3542(int arg0, long arg1) {
        field8878++;
        class498 var4 = (class498) this.field8865.method1754(false, arg1);
        this.method3548(arg0, var4);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
    public final int method3543(int arg0) {
        field8872++;
        int var2 = 0;
        if (arg0 > -105) {
            return -80;
        }
        for (class498 var3 = (class498) this.field8874.method2067(22462); var3 != null; var3 = (class498) this.field8874.method2066(0)) {
            if (!var3.method1989(393216)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;I)V")
    public final void method3544(int arg0, long arg1, Object arg2, int arg3) {
        field8875++;
        if (arg3 > this.field8867) {
            throw new IllegalStateException("s>cs");
        }
        this.method3542(arg0 + 25317, arg1);
        this.field8881 -= arg3;
        while (this.field8881 < 0) {
            class498 var7 = (class498) this.field8874.method2070(-13418);
            this.method3548(0, var7);
        }
        class452 var6 = new class452(arg2, arg3);
        this.field8865.method1751(var6, 3970, arg1);
        if (arg0 == -25317) {
            this.field8874.method2068(-127, var6);
            var6.field8919 = 0L;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
    public final int method3545(int arg0) {
        field8880++;
        return arg0 == 0 ? this.field8881 : 60;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static void method3546(int arg0) {
        field8883 = null;
        if (arg0 == 0) {
            field8873 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
    public class620(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3547(int arg0) {
        field8871++;
        if (arg0 != 30770) {
            this.field8874 = null;
        }
        class498 var2 = (class498) this.field8865.method1753(0);
        while (var2 != null) {
            Object var3 = var2.method1990((byte) -102);
            if (var3 != null) {
                return var3;
            }
            class498 var4 = var2;
            var2 = (class498) this.field8865.method1755(-57);
            var4.method864(12983);
            var4.method3562((byte) -62);
            this.field8881 += var4.field7027;
        }
        return null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILlm;)V")
    private final void method3548(int arg0, class498 arg1) {
        if (arg1 != null) {
            arg1.method864(12983);
            arg1.method3562((byte) -78);
            this.field8881 += arg1.field7027;
        }
        field8877++;
        if (arg0 != 0) {
            field8886 = -48;
        }
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public final void method3549(int arg0) {
        if (arg0 != 0) {
            field8886 = 122;
        }
        this.field8874.method2062(false);
        field8866++;
        this.field8865.method1758(arg0 ^ 0xFFFFFFFC);
        this.field8881 = this.field8867;
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3550(int arg0) {
        field8876++;
        class498 var2 = (class498) this.field8865.method1755(-66);
        while (var2 != null) {
            Object var4 = var2.method1990((byte) -102);
            if (var4 != null) {
                return var4;
            }
            class498 var5 = var2;
            var2 = (class498) this.field8865.method1755(-87);
            var5.method864(12983);
            var5.method3562((byte) -65);
            this.field8881 += var5.field7027;
        }
        int var3 = 74 % ((-arg0 - 21) / 63);
        return null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V")
    public class620(int arg0, int arg1) {
        this.field8874 = new class347();
        this.field8867 = arg0;
        this.field8881 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field8865 = new class295(var3);
    }
}
