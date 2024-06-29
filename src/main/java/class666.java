import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class666 {

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "Lrda;")
    private class620 field9458;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    private int field9443;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    private int field9445;

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "Ljw;")
    private class520 field9457;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "Lgj;")
    public static class593 field9449 = new class593();

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public static int field9456 = 0;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "Lbi;")
    public static class449 field9455;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I", line = 6)
    public final int method3736(int arg0) {
        field9452++;
        int var2 = 0;
        if (arg0 != 4093) {
            this.method3737(-1, 67L, null, (byte) 118);
        }
        for (class10 var3 = (class10) this.field9458.method3390((byte) 104); var3 != null; var3 = (class10) this.field9458.method3401(-10265)) {
            if (!var3.method123((byte) 54)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJLjava/lang/Object;B)V", line = 36)
    public final void method3737(int arg0, long arg1, Object arg2, byte arg3) {
        field9440++;
        if (this.field9445 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method3747(0, arg1);
        this.field9443 -= arg0;
        int var6 = -4 % ((arg3 + 2) / 32);
        while (this.field9443 < 0) {
            class10 var8 = (class10) this.field9458.method3392((byte) 76);
            this.method3746(var8, 0);
        }
        class636 var7 = new class636(arg2, arg0);
        this.field9457.method2911(arg1, var7, (byte) -28);
        this.field9458.method3396(var7, -1);
        var7.field207 = 0L;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 66)
    public final Object method3738(int arg0) {
        if (arg0 != -6) {
            this.method3744((byte) -99);
        }
        field9444++;
        class10 var2 = (class10) this.field9457.method2915(77);
        while (var2 != null) {
            Object var3 = var2.method126(arg0 ^ 0xFFFFFFAD);
            if (var3 != null) {
                return var3;
            }
            class10 var4 = var2;
            var2 = (class10) this.field9457.method2912((byte) 107);
            var4.method2797(-118);
            var4.method131(127);
            this.field9443 += var4.field200;
        }
        return null;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V", line = 98)
    public class666(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V", line = 101)
    public final void method3739(int arg0) {
        if (arg0 != 0) {
            this.method3743(31);
        }
        field9439++;
        this.field9458.method3398(false);
        this.field9457.method2916((byte) 99);
        this.field9443 = this.field9445;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V", line = 116)
    public final void method3740(byte arg0, int arg1) {
        field9446++;
        if (arg0 != 60) {
            this.method3745(52, 107L, null);
        }
        if (class74.field1147 == null) {
            return;
        }
        for (class10 var3 = (class10) this.field9458.method3390((byte) 79); var3 != null; var3 = (class10) this.field9458.method3401(arg0 ^ 0xFFFFD7DB)) {
            if (var3.method123((byte) 54)) {
                if (var3.method126(arg0 - 1) == null) {
                    var3.method2797(93);
                    var3.method131(121);
                    this.field9443++;
                }
            } else if ((++var3.field207) > ((long) arg1)) {
                class10 var4 = class74.field1147.method1369(var3, (byte) 63);
                this.field9457.method2911(var3.field6724, var4, (byte) -28);
                class290.method1791(115, var3, var4);
                var3.method2797(arg0 + 57);
                var3.method131(arg0 + 64);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)Z", line = 166)
    public static final boolean method3741(int arg0, int arg1) {
        int var2 = 38 % ((-arg0 - 21) / 50);
        field9450++;
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 179)
    public static void method3742(byte arg0) {
        if (arg0 != 76) {
            method3741(-42, 66);
        }
        field9455 = null;
        field9449 = null;
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)I", line = 190)
    public final int method3743(int arg0) {
        if (arg0 == 6) {
            field9447++;
            return this.field9445;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I", line = 201)
    public final int method3744(byte arg0) {
        if (arg0 != -16) {
            field9449 = null;
        }
        field9451++;
        return this.field9443;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 214)
    public final void method3745(int arg0, long arg1, Object arg2) {
        field9441++;
        this.method3737(arg0, arg1, arg2, (byte) 127);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lhba;I)V", line = 222)
    private final void method3746(class10 arg0, int arg1) {
        if (arg1 != 0) {
            this.field9458 = null;
        }
        field9453++;
        if (arg0 != null) {
            arg0.method2797(-115);
            arg0.method131(123);
            this.field9443 += arg0.field200;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IJ)V", line = 244)
    private final void method3747(int arg0, long arg1) {
        field9442++;
        class10 var4 = (class10) this.field9457.method2918(arg1, (byte) -128);
        this.method3746(var4, arg0 + arg0);
    }

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)V", line = 256)
    public final void method3748(int arg0) {
        if (arg0 != 6) {
            this.method3740((byte) -29, -99);
        }
        for (class10 var2 = (class10) this.field9458.method3390((byte) 79); var2 != null; var2 = (class10) this.field9458.method3401(-10265)) {
            if (var2.method123((byte) 54)) {
                var2.method2797(arg0 + 28);
                var2.method131(arg0 + 118);
                this.field9443 += var2.field200;
            }
        }
        field9448++;
    }

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 283)
    public final Object method3749(int arg0) {
        field9438++;
        class10 var2 = (class10) this.field9457.method2912((byte) 96);
        if (arg0 != 5144) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method126(49);
            if (var3 != null) {
                return var3;
            }
            class10 var4 = var2;
            var2 = (class10) this.field9457.method2912((byte) 117);
            var4.method2797(72);
            var4.method131(123);
            this.field9443 += var4.field200;
        }
        return null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 318)
    public final Object method3750(long arg0, boolean arg1) {
        if (arg1) {
            this.method3739(84);
        }
        field9454++;
        class10 var4 = (class10) this.field9457.method2918(arg0, (byte) 69);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method126(-88);
        if (var5 == null) {
            var4.method2797(76);
            var4.method131(124);
            this.field9443 += var4.field200;
            return null;
        }
        if (var4.method123((byte) 54)) {
            class636 var6 = new class636(var5, var4.field200);
            this.field9457.method2911(var4.field6724, var6, (byte) -28);
            this.field9458.method3396(var6, -1);
            var6.field207 = 0L;
            var4.method2797(-125);
            var4.method131(127);
        } else {
            this.field9458.method3396(var4, -1);
            var4.field207 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(II)V", line = 362)
    public class666(int arg0, int arg1) {
        this.field9458 = new class620();
        this.field9443 = arg0;
        this.field9445 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field9457 = new class520(var3);
    }
}
