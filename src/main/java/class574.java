import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class574 {

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "Lhf;")
    private class413 field8132 = new class413();

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    private int field8115;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    private int field8130;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "Ltga;")
    private class64 field8129;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field8117 = 1338;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "[[B")
    public static byte[][] field8121 = new byte[250][];

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 11)
    public static void method3327(int arg0) {
        int var1 = 79 % ((arg0 + 23) / 43);
        field8121 = null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILvc;)V", line = 20)
    private final void method3328(int arg0, class333 arg1) {
        if (arg0 != 0) {
            return;
        }
        field8125++;
        if (arg1 != null) {
            arg1.method3117((byte) 70);
            arg1.method1512(false);
            this.field8115 += arg1.field4979;
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I", line = 37)
    public final int method3329(int arg0) {
        field8114++;
        int var2 = 55 % ((arg0 - 42) / 52);
        return this.field8130;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V", line = 54)
    public final void method3330(boolean arg0, int arg1) {
        if (!arg0) {
            method3327(49);
        }
        if (class188.field2816 != null) {
            for (class333 var3 = (class333) this.field8132.method2480(381); var3 != null; var3 = (class333) this.field8132.method2476((byte) 18)) {
                if (var3.method2156(21635)) {
                    if (var3.method2157(32768) == null) {
                        var3.method3117((byte) 127);
                        var3.method1512(false);
                        this.field8115 += var3.field4979;
                    }
                } else if ((++var3.field3123) > ((long) arg1)) {
                    class333 var4 = class188.field2816.method1345(var3, false);
                    this.field8129.method384(var3.field7577, var4, false);
                    class649.method3709(var3, var4, -28407);
                    var3.method3117((byte) 20);
                    var3.method1512(false);
                }
            }
        }
        field8131++;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)Z", line = 102)
    public static final boolean method3331(int arg0, int arg1) {
        if (arg1 != 1) {
            method3327(-13);
        }
        field8127++;
        if (arg0 == 6 || arg0 == 59 || arg0 == 20 || arg0 == 53 || arg0 == 1010) {
            return true;
        } else {
            return arg0 == 25 || arg0 == 1007;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lpha;B)Ljava/lang/Object;", line = 121)
    public final Object method3332(class172 arg0, byte arg1) {
        field8122++;
        long var3 = arg0.method1302((byte) 87);
        if (arg1 > -85) {
            field8117 = -46;
        }
        for (class333 var5 = (class333) this.field8129.method380((byte) -3, var3); var5 != null; var5 = (class333) this.field8129.method383(-1)) {
            if (var5.field4980.method1303(87, arg0)) {
                Object var6 = var5.method2157(32768);
                if (var6 != null) {
                    if (var5.method2156(21635)) {
                        class452 var7 = new class452(arg0, var6, var5.field4979);
                        this.field8129.method384(var5.field7577, var7, false);
                        this.field8132.method2475(var7, -19680);
                        var7.field3123 = 0L;
                        var5.method3117((byte) 55);
                        var5.method1512(false);
                    } else {
                        this.field8132.method2475(var5, -19680);
                        var5.field3123 = 0L;
                    }
                    return var6;
                }
                var5.method3117((byte) -86);
                var5.method1512(false);
                this.field8115 += var5.field4979;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V", line = 174)
    public final void method3333(byte arg0) {
        this.field8132.method2477(true);
        field8118++;
        if (arg0 != -67) {
            this.method3334(-77, null, null);
        }
        this.field8129.method387(-21125);
        this.field8115 = this.field8130;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/Object;Lpha;)V", line = 187)
    public final void method3334(int arg0, Object arg1, class172 arg2) {
        field8123++;
        this.method3339(1, 0, arg1, arg2);
        if (arg0 != -23819) {
            method3327(-51);
        }
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V", line = 202)
    public final void method3335(int arg0) {
        if (arg0 != -1) {
            this.method3329(58);
        }
        field8120++;
        for (class333 var2 = (class333) this.field8132.method2480(381); var2 != null; var2 = (class333) this.field8132.method2476((byte) 18)) {
            if (var2.method2156(arg0 + 21636)) {
                var2.method3117((byte) -104);
                var2.method1512(false);
                this.field8115 += var2.field4979;
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lpha;I)V", line = 227)
    private final void method3336(class172 arg0, int arg1) {
        field8128++;
        long var3 = arg0.method1302((byte) 87);
        for (class333 var5 = (class333) this.field8129.method380((byte) -3, var3); var5 != null; var5 = (class333) this.field8129.method383(-1)) {
            if (var5.field4980.method1303(-65, arg0)) {
                this.method3328(0, var5);
                break;
            }
        }
        if (arg1 <= 114) {
            this.method3340(-38);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLwq;II)V", line = 255)
    public static final void method3337(byte arg0, class176 arg1, int arg2, int arg3) {
        field8116++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field2643 != null) {
            class140 var4 = new class140();
            var4.field1802 = arg1;
            var4.field1808 = arg1.field2643;
            class353.method2219(var4);
        }
        int var5 = 54 / ((-arg0 - 6) / 62);
        class26.field382 = true;
        class75.field1013 = arg1.field2556;
        class76.field1018 = arg1.field2612;
        class303.field4540 = arg1.field2576;
        class483.field6863 = arg1.field2588;
        class466.field6628 = arg2;
        class189.field2820 = arg1.field2540;
        class641.field9043 = arg3;
        class288.method1923((byte) -19, arg1);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIBLcb;ZII)V", line = 287)
    public static final void method3338(int arg0, int arg1, byte arg2, class544 arg3, boolean arg4, int arg5, int arg6) {
        field8126++;
        class664.field9319 = arg5;
        class246.field3513 = arg0;
        class611.field8622 = arg4;
        if (arg2 != -34) {
            field8121 = null;
        }
        class733.field10242 = null;
        class368.field5295 = arg3;
        class763.field10505 = arg1;
        class341.field5056 = arg6;
        class420.field5909 = 1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILjava/lang/Object;Lpha;)V", line = 307)
    private final void method3339(int arg0, int arg1, Object arg2, class172 arg3) {
        field8124++;
        if (this.field8130 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method3336(arg3, 121);
        this.field8115 -= arg0;
        while (this.field8115 < 0) {
            class333 var6 = (class333) this.field8132.method2481((byte) 110);
            this.method3328(0, var6);
        }
        class452 var5 = new class452(arg3, arg2, arg0);
        this.field8129.method384(arg3.method1302((byte) 87), var5, false);
        this.field8132.method2475(var5, -19680);
        var5.field3123 = arg1;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I", line = 334)
    public final int method3340(int arg0) {
        int var2 = -20 / ((11 - arg0) / 53);
        field8119++;
        return this.field8115;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I)V", line = 356)
    public class574(int arg0) {
        this.field8115 = arg0;
        this.field8130 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field8129 = new class64(var2);
    }
}
