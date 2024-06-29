import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class153 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Luq;")
    private class111 field2341 = new class111();

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lcv;")
    private class398 field2345;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2343 = -1;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqo;I)V", line = 11)
    private final void method1104(class19 arg0, int arg1) {
        field2336++;
        long var3 = arg0.method170(121);
        if (arg1 != -23129) {
            this.method1114(-71);
        }
        for (class163 var5 = (class163) this.field2345.method2485(arg1 ^ 0xFFFFA5FA, var3); var5 != null; var5 = (class163) this.field2345.method2480(-1)) {
            if (var5.field2459.method169(arg0, arg1 + 9435)) {
                this.method1105(var5, -12129);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lae;I)V", line = 37)
    private final void method1105(class163 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2663(-120);
            arg0.method855(51);
            this.field2347 += arg0.field2458;
        }
        field2350++;
        if (arg1 != -12129) {
            method1107(105, 81, -95, -5, -67);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/Object;Lqo;)V", line = 56)
    public final void method1106(int arg0, Object arg1, class19 arg2) {
        if (arg0 == -1) {
            field2344++;
            this.method1111(arg2, arg1, 1, 0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class436.field6338 != null) {
            class436.field6338[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class273.field3951 != null) {
            class273.field3951[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class214.field3090 != null) {
            class214.field3090[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 83)
    public final void method1108(int arg0) {
        this.field2341.method815(1690797447);
        field2349++;
        this.field2345.method2476(arg0);
        this.field2347 = this.field2339;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I", line = 95)
    public final int method1109(byte arg0) {
        field2335++;
        if (arg0 > -101) {
            field2343 = -4;
        }
        return this.field2347;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I", line = 108)
    public final int method1110(byte arg0) {
        if (arg0 > -39) {
            method1107(87, -88, -84, -17, 30);
        }
        field2348++;
        return this.field2339;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V", line = 291)
    public class153(int arg0) {
        this.field2339 = arg0;
        this.field2347 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2345 = new class398(var2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqo;Ljava/lang/Object;II)V", line = 125)
    private final void method1111(class19 arg0, Object arg1, int arg2, int arg3) {
        field2346++;
        if (this.field2339 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method1104(arg0, -23129);
        this.field2347 -= arg2;
        while (this.field2347 < 0) {
            class163 var6 = (class163) this.field2341.method814(arg3);
            this.method1105(var6, -12129);
        }
        class106 var5 = new class106(arg0, arg1, arg2);
        this.field2345.method2486(23, var5, arg0.method170(arg3 + 56));
        this.field2341.method819(var5, 1431655765);
        var5.field1844 = arg3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 154)
    public static final void method1112(int[] arg0, byte arg1, Object[] arg2) {
        if (arg1 != -39) {
            field2343 = -41;
        }
        class108.method804(arg0.length - 1, arg0, arg2, 0, arg1 + 30);
        field2351++;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lqo;I)Ljava/lang/Object;", line = 166)
    public final Object method1113(class19 arg0, int arg1) {
        field2338++;
        long var3 = arg0.method170(85);
        for (class163 var5 = (class163) this.field2345.method2485(46, var3); var5 != null; var5 = (class163) this.field2345.method2480(-1)) {
            if (var5.field2459.method169(arg0, -13694)) {
                Object var6 = var5.method800((byte) 36);
                if (var6 != null) {
                    if (var5.method801(-3201)) {
                        class106 var7 = new class106(arg0, var6, var5.field2458);
                        this.field2345.method2486(-125, var7, var5.field6399);
                        this.field2341.method819(var7, 1431655765);
                        var7.field1844 = 0L;
                        var5.method2663(-120);
                        var5.method855(51);
                    } else {
                        this.field2341.method819(var5, 1431655765);
                        var5.field1844 = 0L;
                    }
                    return var6;
                }
                var5.method2663(-112);
                var5.method855(51);
                this.field2347 += var5.field2458;
            }
        }
        if (arg1 < 121) {
            field2343 = 75;
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 218)
    public final void method1114(int arg0) {
        for (class163 var2 = (class163) this.field2341.method820(true); var2 != null; var2 = (class163) this.field2341.method816(126)) {
            if (var2.method801(-3201)) {
                var2.method2663(-116);
                var2.method855(51);
                this.field2347 += var2.field2458;
            }
        }
        if (arg0 == -7991) {
            field2340++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 243)
    public final void method1115(byte arg0, int arg1) {
        field2337++;
        if (class122.field1903 != null) {
            for (class163 var3 = (class163) this.field2341.method820(true); var3 != null; var3 = (class163) this.field2341.method816(117)) {
                if (var3.method801(-3201)) {
                    if (var3.method800((byte) 36) == null) {
                        var3.method2663(-110);
                        var3.method855(51);
                        this.field2347 += var3.field2458;
                    }
                } else if ((long) arg1 < ++var3.field1844) {
                    class163 var4 = class122.field1903.method1304(var3, -86);
                    this.field2345.method2486(38, var4, var3.field6399);
                    class452.method2719(-3, var4, var3);
                    var3.method2663(-126);
                    var3.method855(51);
                }
            }
        }
        int var5 = 55 % ((64 - arg0) / 56);
    }
}
