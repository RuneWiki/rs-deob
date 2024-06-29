import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class382 {

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Lpf;")
    private class30 field5352 = new class30();

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    private int field5353;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    private int field5356;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lsi;")
    private class769 field5354;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "[I")
    public static int[] field5355 = new int[1];

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
    public final int method2302(int arg0) {
        if (arg0 != 26399) {
            this.method2305(null, (byte) 4);
        }
        field5349++;
        return this.field5356;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqj;I)V")
    private final void method2303(class572 arg0, int arg1) {
        field5358++;
        if (arg1 != 6513) {
            return;
        }
        long var3 = arg0.method1545((byte) 106);
        for (class112 var5 = (class112) this.field5354.method4253(var3, -1); var5 != null; var5 = (class112) this.field5354.method4248(arg1 - 6554)) {
            if (var5.field1622.method1547(arg0, -26325)) {
                this.method2307(-11341, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqj;ILjava/lang/Object;I)V")
    private final void method2304(class572 arg0, int arg1, Object arg2, int arg3) {
        field5357++;
        if (this.field5353 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2303(arg0, 6513);
        this.field5356 -= arg1;
        while (this.field5356 < 0) {
            class112 var6 = (class112) this.field5352.method247(-32331);
            this.method2307(-11341, var6);
        }
        if (arg3 == -6475) {
            class45 var5 = new class45(arg0, arg2, arg1);
            this.field5354.method4252(false, var5, arg0.method1545((byte) 116));
            this.field5352.method248((byte) 88, var5);
            var5.field6209 = 0L;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqj;B)Ljava/lang/Object;")
    public final Object method2305(class572 arg0, byte arg1) {
        field5359++;
        if (arg1 != 73) {
            this.method2306(8);
        }
        long var3 = arg0.method1545((byte) 125);
        for (class112 var5 = (class112) this.field5354.method4253(var3, -1); var5 != null; var5 = (class112) this.field5354.method4248(-82)) {
            if (var5.field1622.method1547(arg0, -26325)) {
                Object var6 = var5.method339((byte) -94);
                if (var6 != null) {
                    if (var5.method340(-32365)) {
                        class45 var7 = new class45(arg0, var6, var5.field1618);
                        this.field5354.method4252(false, var7, var5.field10592);
                        this.field5352.method248((byte) 88, var7);
                        var7.field6209 = 0L;
                        var5.method4237(-1);
                        var5.method2665(24902);
                    } else {
                        this.field5352.method248((byte) 100, var5);
                        var5.field6209 = 0L;
                    }
                    return var6;
                }
                var5.method4237(arg1 ^ 0xFFFFFFB6);
                var5.method2665(24902);
                this.field5356 += var5.field1618;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
    public final void method2306(int arg0) {
        for (class112 var2 = (class112) this.field5352.method249(18371); var2 != null; var2 = (class112) this.field5352.method254((byte) -64)) {
            if (var2.method340(-32365)) {
                var2.method4237(-1);
                var2.method2665(24902);
                this.field5356 += var2.field1618;
            }
        }
        int var3 = -71 / ((arg0 - 80) / 41);
        field5360++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILtk;)V")
    private final void method2307(int arg0, class112 arg1) {
        if (arg1 != null) {
            arg1.method4237(-1);
            arg1.method2665(24902);
            this.field5356 += arg1.field1618;
        }
        field5347++;
        if (arg0 != -11341) {
            this.field5354 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
    public static void method2308(int arg0) {
        if (arg0 != 0) {
            field5355 = null;
        }
        field5355 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public final void method2309(byte arg0) {
        field5345++;
        if (arg0 <= 49) {
            this.field5356 = -19;
        }
        this.field5352.method253((byte) -18);
        this.field5354.method4249((byte) 73);
        this.field5356 = this.field5353;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
    public static final void method2310(byte arg0) {
        int var1 = -15 / ((arg0 + 29) / 45);
        field5344++;
        if (class141.field2306 == 9) {
            class75.method690(true, 5);
        } else if (class141.field2306 == 5 || class141.field2306 == 6) {
            class75.method690(true, 3);
        } else if (class141.field2306 == 12) {
            class75.method690(true, 3);
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
    public static final void method2311(int arg0) {
        if (arg0 != 0) {
            method2308(107);
        }
        field5343++;
        class100.field1486.method2893((byte) 79);
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
    public final int method2312(int arg0) {
        field5348++;
        if (arg0 >= -75) {
            this.method2306(102);
        }
        return this.field5353;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public final void method2313(int arg0, int arg1) {
        field5346++;
        if (arg0 != 31639) {
            this.field5353 = -34;
        }
        if (class338.field4791 == null) {
            return;
        }
        for (class112 var3 = (class112) this.field5352.method249(18371); var3 != null; var3 = (class112) this.field5352.method254((byte) -64)) {
            if (var3.method340(-32365)) {
                if (var3.method339((byte) -94) == null) {
                    var3.method4237(-1);
                    var3.method2665(24902);
                    this.field5356 += var3.field1618;
                }
            } else if (++var3.field6209 > (long) arg1) {
                class112 var4 = class338.field4791.method1108((byte) 82, var3);
                this.field5354.method4252(false, var4, var3.field10592);
                class631.method3600(var3, arg0 - 31639, var4);
                var3.method4237(-1);
                var3.method2665(24902);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/Object;Lqj;)V")
    public final void method2314(int arg0, Object arg1, class572 arg2) {
        this.method2304(arg2, 1, arg1, -6475);
        field5350++;
        if (arg0 != 13783) {
            this.field5352 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
    public class382(int arg0) {
        this.field5353 = arg0;
        this.field5356 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5354 = new class769(var2);
    }
}
