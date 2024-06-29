import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class419 {

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "Lnc;")
    private class26 field6034 = new class26();

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    private int field6031;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    private int field6027;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "Ltca;")
    private class184 field6023;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[I")
    public static int[] field6018 = new int[3];

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field6024 = 0;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6022 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "[[Lofa;")
    public static class347[][] field6032;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public final void method2512(int arg0) {
        if (arg0 != 28157) {
            this.method2518(false);
        }
        for (class24 var2 = (class24) this.field6034.method152((byte) -13); var2 != null; var2 = (class24) this.field6034.method146((byte) 97)) {
            if (var2.method144((byte) 30)) {
                var2.method1102((byte) 116);
                var2.method3659(1);
                this.field6027 += var2.field244;
            }
        }
        field6038++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lha;IBILqw;)V")
    public static final void method2513(class66 arg0, int arg1, byte arg2, int arg3, class84 arg4) {
        if (arg2 != 112) {
            field6021 = -80;
        }
        field6028++;
        class735.field9966.method690(20134);
        if (class145.field1964) {
            return;
        }
        for (class223 var5 = (class223) arg4.method679((byte) -86); var5 != null; var5 = (class223) arg4.method681(-77)) {
            class349 var6 = class752.field10153.method2074(109, var5.field2885);
            if (class763.method4205(var6, arg2 ^ 0x71)) {
                boolean var7 = class647.method3589(var6, arg1, arg3, var5, arg0, arg2 ^ 0xFFFFAD03);
                if (var7) {
                    class539.method3123(var5, 2, var6, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
    public final void method2514(int arg0, int arg1) {
        field6036++;
        if (class135.field1830 != null) {
            for (class24 var3 = (class24) this.field6034.method152((byte) -13); var3 != null; var3 = (class24) this.field6034.method146((byte) 97)) {
                if (var3.method144((byte) 30)) {
                    if (var3.method141((byte) -8) == null) {
                        var3.method1102((byte) 118);
                        var3.method3659(1);
                        this.field6027 += var3.field244;
                    }
                } else if ((long) arg0 < ++var3.field8883) {
                    class24 var4 = class135.field1830.method161(var3, 107);
                    this.field6023.method1247(4070, var3.field2146, var4);
                    class564.method3214(-30251, var3, var4);
                    var3.method1102((byte) 103);
                    var3.method3659(1);
                }
            }
        }
        if (arg1 != 914) {
            field6022 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
    public static void method2515(int arg0) {
        field6032 = null;
        field6022 = null;
        if (arg0 == 0) {
            field6018 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/Object;BLst;)V")
    public final void method2516(Object arg0, byte arg1, class457 arg2) {
        field6029++;
        this.method2517(arg2, arg0, 0, 1);
        if (arg1 != 51) {
            this.method2524(-120, null);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lst;Ljava/lang/Object;II)V")
    private final void method2517(class457 arg0, Object arg1, int arg2, int arg3) {
        field6037++;
        if (this.field6031 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2524(-14604, arg0);
        this.field6027 -= arg3;
        while (this.field6027 < 0) {
            class24 var6 = (class24) this.field6034.method155(119);
            this.method2522(var6, 26307);
        }
        class100 var5 = new class100(arg0, arg1, arg3);
        this.field6023.method1247(4070, arg0.method168((byte) 126), var5);
        this.field6034.method150(0, var5);
        var5.field8883 = arg2;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
    public final void method2518(boolean arg0) {
        field6026++;
        this.field6034.method153(119);
        if (!arg0) {
            this.field6023.method1244(30407);
            this.field6027 = this.field6031;
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)I")
    public final int method2519(int arg0) {
        if (arg0 >= -121) {
            this.method2524(18, null);
        }
        field6019++;
        return this.field6027;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILst;)Ljava/lang/Object;")
    public final Object method2520(int arg0, class457 arg1) {
        field6033++;
        long var3 = arg1.method168((byte) 85);
        class24 var5 = (class24) this.field6023.method1248(126, var3);
        if (arg0 != 0) {
            return null;
        }
        while (var5 != null) {
            if (var5.field245.method167(arg1, arg0 ^ 0x34)) {
                Object var6 = var5.method141((byte) -8);
                if (var6 != null) {
                    if (var5.method144((byte) 30)) {
                        class100 var7 = new class100(arg1, var6, var5.field244);
                        this.field6023.method1247(4070, var5.field2146, var7);
                        this.field6034.method150(0, var7);
                        var7.field8883 = 0L;
                        var5.method1102((byte) 126);
                        var5.method3659(arg0 + 1);
                    } else {
                        this.field6034.method150(arg0, var5);
                        var5.field8883 = 0L;
                    }
                    return var6;
                }
                var5.method1102((byte) 69);
                var5.method3659(arg0 ^ 0x1);
                this.field6027 += var5.field244;
            }
            var5 = (class24) this.field6023.method1243(arg0 ^ 0x6D);
        }
        return null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZIZI)Luq;")
    public static final class172 method2521(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method2515(12);
        }
        field6035++;
        class79 var4 = null;
        if (class482.field6761 != null) {
            var4 = new class79(arg1, class482.field6761, class485.field6777[arg1], 1000000);
        }
        class186.field2442[arg1] = class454.field6507.method2548(arg1, var4, 255, class95.field1331);
        class186.field2442[arg1].method2609(19602);
        return new class172(class186.field2442[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lqo;I)V")
    private final void method2522(class24 arg0, int arg1) {
        field6039++;
        if (arg1 == 26307 && arg0 != null) {
            arg0.method1102((byte) 67);
            arg0.method3659(1);
            this.field6027 += arg0.field244;
        }
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)I")
    public final int method2523(int arg0) {
        if (arg0 != 1) {
            method2521(true, -53, true, 72);
        }
        field6020++;
        return this.field6031;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V")
    public class419(int arg0) {
        this.field6031 = arg0;
        this.field6027 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6023 = new class184(var2);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(ILst;)V")
    private final void method2524(int arg0, class457 arg1) {
        field6030++;
        long var3 = arg1.method168((byte) 112);
        for (class24 var5 = (class24) this.field6023.method1248(125, var3); var5 != null; var5 = (class24) this.field6023.method1243(97)) {
            if (var5.field245.method167(arg1, 52)) {
                this.method2522(var5, 26307);
                break;
            }
        }
        if (arg0 != -14604) {
            method2515(76);
        }
    }
}
