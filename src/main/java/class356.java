import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class356 {

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lmq;")
    private class358 field5111 = new class358();

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    private int field5112;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lqi;")
    private class406 field5115;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lam;")
    public static class455 field5107 = new class455();

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lkn;")
    public static class530 field5116 = new class530("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field5117;

    static {
        new class530("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 4)
    public final void method2099(int arg0) {
        this.field5111.method2120((byte) 118);
        field5106++;
        int var2 = -2 / ((-arg0 - 88) / 33);
        this.field5115.method2408(78);
        this.field5101 = this.field5112;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I", line = 18)
    public final int method2100(byte arg0) {
        int var2 = 103 / (-arg0 / 59);
        field5109++;
        return this.field5101;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILgo;)V", line = 29)
    private final void method2101(int arg0, class451 arg1) {
        field5114++;
        long var3 = arg1.method139(-79);
        if (arg0 != 0) {
            this.method2100((byte) -127);
        }
        for (class342 var5 = (class342) this.field5115.method2405(var3, arg0 ^ 0xFFFFFF9C); var5 != null; var5 = (class342) this.field5115.method2415(-1)) {
            if (var5.field4968.method140(-31649, arg1)) {
                this.method2107(117, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 61)
    public static final void method2102(byte arg0) {
        field5110++;
        if (arg0 != 34) {
            field5107 = null;
        }
        if (class312.field4540 < 0) {
            return;
        }
        long var1 = class465.method2699((byte) 14);
        class312.field4540 = (int) ((long) class312.field4540 - (var1 - class305.field4442));
        if (class312.field4540 <= 0) {
            class498.field7058 = class307.field4456.field3748;
            class418.field5888 = class307.field4456.field3745;
            class312.field4540 = -1;
            class500.field7069 = class307.field4456.field3736;
            class413.field5843 = class307.field4456.field3747;
            class81.field1053 = class307.field4456.field3734;
            class17.field213 = class307.field4456.field3740;
            class369.field5273 = class307.field4456.field3739;
            class106.field1401 = class307.field4456.field3741;
            class28.field333 = class307.field4456.field3744;
            class105.field1392 = class307.field4456.field3749;
        } else {
            int var3 = (class312.field4540 << 8) / class205.field2970;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class105.field1392 = ((class234.field3408 & 0xFF00) * var3 + ((class307.field4456.field3749 & 0xFF00) * var4) & 0xFF0000) + ((class234.field3408 & 0xFF00FF) * var3 + (class307.field4456.field3749 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class500.field7069 = (class307.field4456.field3736 - class322.field4651) * var6 + class322.field4651;
            class81.field1053 = class258.field3834 * var3 + class307.field4456.field3734 * var4 >> 8;
            class418.field5888 = (class307.field4456.field3745 - class409.field5786) * var6 + class409.field5786;
            class369.field5273 = (class307.field4456.field3739 - class40.field439) * var6 + class40.field439;
            class28.field333 = (class307.field4456.field3744 - class353.field5066) * var6 + class353.field5066;
            class498.field7058 = ((class469.field6554 & 0xFF00) * var3 + (class307.field4456.field3748 & 0xFF00) * var4 & 0xFF0000) + ((class469.field6554 & 0xFF00FF) * var3 + (class307.field4456.field3748 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class413.field5843 = (class307.field4456.field3747 - class383.field5392) * var6 + class383.field5392;
            class106.field1401 = (class307.field4456.field3741 - class168.field2456) * var6 + class168.field2456;
            if (class514.field7587 != class307.field4456.field3740) {
                class17.field213 = class134.field1759.method351(class514.field7587, class307.field4456.field3740, var6, class17.field213);
            }
        }
        class305.field4442 = var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V", line = 119)
    public final void method2103(int arg0, byte arg1) {
        field5113++;
        if (arg1 < 106 || class409.field5784 == null) {
            return;
        }
        for (class342 var3 = (class342) this.field5111.method2119(0); var3 != null; var3 = (class342) this.field5111.method2116((byte) 44)) {
            if (var3.method536(-1)) {
                if (var3.method535(true) == null) {
                    var3.method2891(77);
                    var3.method2132(12);
                    this.field5101 += var3.field4966;
                }
            } else if ((long) arg0 < ++var3.field5164) {
                class342 var4 = class409.field5784.method697(var3, (byte) -70);
                this.field5115.method2413(var3.field7060, var4, -1);
                class280.method1747(var4, -118, var3);
                var3.method2891(104);
                var3.method2132(12);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 167)
    public final void method2104(int arg0) {
        for (class342 var2 = (class342) this.field5111.method2119(0); var2 != null; var2 = (class342) this.field5111.method2116((byte) 44)) {
            if (var2.method536(-1)) {
                var2.method2891(-126);
                var2.method2132(12);
                this.field5101 += var2.field4966;
            }
        }
        if (arg0 != 15981) {
            this.method2103(29, (byte) -19);
        }
        field5104++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I", line = 192)
    public final int method2105(boolean arg0) {
        if (!arg0) {
            this.method2101(-75, null);
        }
        field5103++;
        return this.field5112;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 203)
    public static void method2106(byte arg0) {
        int var1 = -5 / ((-arg0 - 40) / 58);
        field5116 = null;
        field5107 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILef;)V", line = 217)
    private final void method2107(int arg0, class342 arg1) {
        field5117++;
        if (arg1 != null) {
            arg1.method2891(-127);
            arg1.method2132(12);
            this.field5101 += arg1.field4966;
        }
        int var3 = 63 % ((arg0 - 58) / 57);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Object;Lgo;B)V", line = 238)
    public final void method2108(Object arg0, class451 arg1, byte arg2) {
        this.method2109(arg1, 1, (byte) 84, arg0);
        if (arg2 != 91) {
            this.method2101(-125, null);
        }
        field5102++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgo;IBLjava/lang/Object;)V", line = 255)
    private final void method2109(class451 arg0, int arg1, byte arg2, Object arg3) {
        if (arg2 < 7) {
            return;
        }
        field5105++;
        if (this.field5112 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2101(0, arg0);
        this.field5101 -= arg1;
        while (this.field5101 < 0) {
            class342 var6 = (class342) this.field5111.method2115((byte) -103);
            this.method2107(116, var6);
        }
        class161 var5 = new class161(arg0, arg3, arg1);
        this.field5115.method2413(arg0.method139(-100), var5, -1);
        this.field5111.method2118(var5, true);
        var5.field5164 = 0L;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLgo;)Ljava/lang/Object;", line = 285)
    public final Object method2110(boolean arg0, class451 arg1) {
        field5108++;
        long var3 = arg1.method139(-83);
        if (!arg0) {
            return null;
        }
        for (class342 var5 = (class342) this.field5115.method2405(var3, -30); var5 != null; var5 = (class342) this.field5115.method2415(-1)) {
            if (var5.field4968.method140(-31649, arg1)) {
                Object var6 = var5.method535(true);
                if (var6 != null) {
                    if (var5.method536(-1)) {
                        class161 var7 = new class161(arg1, var6, var5.field4966);
                        this.field5115.method2413(var5.field7060, var7, -1);
                        this.field5111.method2118(var7, true);
                        var7.field5164 = 0L;
                        var5.method2891(-121);
                        var5.method2132(12);
                    } else {
                        this.field5111.method2118(var5, arg0);
                        var5.field5164 = 0L;
                    }
                    return var6;
                }
                var5.method2891(-123);
                var5.method2132(12);
                this.field5101 += var5.field4966;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V", line = 340)
    public class356(int arg0) {
        this.field5101 = arg0;
        this.field5112 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5115 = new class406(var2);
    }
}
