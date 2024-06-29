import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class747 {

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Loaa;")
    private class305 field10307 = new class305();

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    private int field10319;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    private int field10306;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "Lcja;")
    private class46 field10313;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "Lvl;")
    public static class15 field10316 = new class15(40, 0);

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "[[[I")
    public static int[][][] field10322 = new int[2][][];

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLria;)V", line = 3)
    private final void method4141(byte arg0, class302 arg1) {
        if (arg1 != null) {
            arg1.method1207(117);
            arg1.method2942(false);
            this.field10319 += arg1.field4149;
        }
        if (arg0 != 1) {
            method4144(115, -85);
        }
        field10317++;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lwf;B)V", line = 24)
    private final void method4142(class147 arg0, byte arg1) {
        field10308++;
        long var3 = arg0.method1181(true);
        class302 var5 = (class302) this.field10313.method337(var3, 1);
        if (arg1 != 126) {
            this.field10307 = null;
        }
        while (var5 != null) {
            if (var5.field4150.method1182(arg0, -70)) {
                this.method4141((byte) 1, var5);
                return;
            }
            var5 = (class302) this.field10313.method344((byte) 120);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 51)
    public static void method4143(byte arg0) {
        field10322 = null;
        field10316 = null;
        int var1 = 118 % ((-arg0 - 37) / 39);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)I", line = 65)
    public static final int method4144(int arg0, int arg1) {
        field10314++;
        int var2 = -21 % ((51 - arg1) / 35);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)I", line = 75)
    public final int method4145(byte arg0) {
        field10315++;
        return arg0 == 8 ? this.field10319 : -22;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILwf;)Ljava/lang/Object;", line = 88)
    public final Object method4146(int arg0, class147 arg1) {
        field10311++;
        long var3 = arg1.method1181(true);
        if (arg0 != 17398) {
            this.method4152(121, -114);
        }
        for (class302 var5 = (class302) this.field10313.method337(var3, 1); var5 != null; var5 = (class302) this.field10313.method344((byte) 94)) {
            if (var5.field4150.method1182(arg1, arg0 ^ 0xFFFFBC76)) {
                Object var6 = var5.method189(0);
                if (var6 != null) {
                    if (var5.method187(0)) {
                        class29 var7 = new class29(arg1, var6, var5.field4149);
                        this.field10313.method341(var5.field2528, var7, (byte) 40);
                        this.field10307.method1953((byte) 83, var7);
                        var7.field7008 = 0L;
                        var5.method1207(96);
                        var5.method2942(false);
                    } else {
                        this.field10307.method1953((byte) 83, var5);
                        var5.field7008 = 0L;
                    }
                    return var6;
                }
                var5.method1207(90);
                var5.method2942(false);
                this.field10319 += var5.field4149;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V", line = 141)
    public final void method4147(int arg0) {
        class302 var2 = (class302) this.field10307.method1951(-723780560);
        int var3 = 110 / ((-arg0 - 31) / 61);
        while (var2 != null) {
            if (var2.method187(0)) {
                var2.method1207(89);
                var2.method2942(false);
                this.field10319 += var2.field4149;
            }
            var2 = (class302) this.field10307.method1946(-6974);
        }
        field10312++;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I", line = 166)
    public final int method4148(int arg0) {
        field10320++;
        if (arg0 >= -36) {
            this.method4145((byte) -42);
        }
        return this.field10306;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V", line = 177)
    public final void method4149(boolean arg0) {
        field10305++;
        if (!arg0) {
            this.field10307.method1950(0);
            this.field10313.method338((byte) -100);
            this.field10319 = this.field10306;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lwf;BLjava/lang/Object;)V", line = 192)
    public final void method4150(class147 arg0, byte arg1, Object arg2) {
        this.method4151(arg0, arg2, 0, 1);
        int var4 = 18 / ((89 - arg1) / 36);
        field10321++;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lwf;Ljava/lang/Object;II)V", line = 210)
    private final void method4151(class147 arg0, Object arg1, int arg2, int arg3) {
        field10309++;
        if (this.field10306 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method4142(arg0, (byte) 126);
        this.field10319 -= arg3;
        while (this.field10319 < 0) {
            class302 var6 = (class302) this.field10307.method1948(true);
            this.method4141((byte) 1, var6);
        }
        class29 var5 = new class29(arg0, arg1, arg3);
        this.field10313.method341(arg0.method1181(true), var5, (byte) 107);
        this.field10307.method1953((byte) 83, var5);
        var5.field7008 = arg2;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(I)V", line = 290)
    public class747(int arg0) {
        this.field10319 = arg0;
        this.field10306 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field10313 = new class46(var2);
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)V", line = 242)
    public final void method4152(int arg0, int arg1) {
        if (class619.field8610 != null) {
            for (class302 var3 = (class302) this.field10307.method1951(-723780560); var3 != null; var3 = (class302) this.field10307.method1946(-6974)) {
                if (var3.method187(0)) {
                    if (var3.method189(0) == null) {
                        var3.method1207(86);
                        var3.method2942(false);
                        this.field10319 += var3.field4149;
                    }
                } else if (++var3.field7008 > (long) arg0) {
                    class302 var4 = class619.field8610.method665(108, var3);
                    this.field10313.method341(var3.field2528, var4, (byte) 68);
                    class21.method139(var3, 128, var4);
                    var3.method1207(99);
                    var3.method2942(false);
                }
            }
        }
        if (arg1 < 70) {
            this.method4147(-46);
        }
        field10310++;
    }
}
