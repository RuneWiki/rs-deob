import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class453 {

    @OriginalMember(owner = "client!us", name = "r", descriptor = "Lvu;")
    private class677 field6600 = new class677();

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    private int field6592;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Lpl;")
    private class616 field6597;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Leda;")
    public static class14 field6589 = new class14(4);

    @OriginalMember(owner = "client!us", name = "l", descriptor = "Z")
    public static boolean field6594 = false;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "[I")
    public static int[] field6596 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "J")
    public static long field6591;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 12)
    public final void method2773(byte arg0) {
        for (class186 var2 = (class186) this.field6600.method3772(true); var2 != null; var2 = (class186) this.field6600.method3780(23774)) {
            if (var2.method1422(0)) {
                var2.method636((byte) 97);
                var2.method1507(1);
                this.field6592 += var2.field3112;
            }
        }
        if (arg0 > -70) {
            this.field6600 = null;
        }
        field6587++;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 37)
    public final void method2774(byte arg0) {
        field6595++;
        this.field6600.method3773((byte) 81);
        if (arg0 <= 86) {
            this.field6592 = 48;
        }
        this.field6597.method3517(-107);
        this.field6592 = this.field6588;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V", line = 52)
    public static final void method2775(boolean arg0, byte arg1) {
        if (arg0) {
            if (class673.field9523 != -1) {
                class135.method1085((byte) -13, class673.field9523);
            }
            for (class520 var2 = (class520) class36.field340.method3508((byte) -78); var2 != null; var2 = (class520) class36.field340.method3520(-1)) {
                if (!var2.method637((byte) 115)) {
                    var2 = (class520) class36.field340.method3508((byte) -71);
                    if (var2 == null) {
                        break;
                    }
                }
                class197.method1479(true, var2, false, (byte) 37);
            }
            class673.field9523 = -1;
            class36.field340 = new class616(8);
            class735.method4102(-4007);
            class673.field9523 = class706.field9964;
            class173.method1363(false, (byte) 127);
            class353.method2259((byte) -99);
            class464.method2847(class673.field9523);
        }
        field6602++;
        class18.field190 = "";
        class1.field4 = "";
        class195.field3351 = false;
        class510.method3065((byte) -110);
        if (arg1 != -92) {
            return;
        }
        class618.field8708 = -1;
        class106.method860(class472.field6844, true);
        class145.field2251 = new class573();
        class145.field2251.field9475 = class314.field4720 * 512 / 2;
        class145.field2251.field9477 = class191.field3229 * 512 / 2;
        class145.field2251.field1702[0] = class191.field3229 / 2;
        class329.field4857 = 0;
        class497.field7212 = 0;
        class145.field2251.field1704[0] = class314.field4720 / 2;
        if (class639.field8978 == 2) {
            class497.field7212 = class618.field8709 << 9;
            class329.field4857 = class64.field1035 << 9;
        } else {
            class613.method3498((byte) 127);
        }
        class525.method3121(-11701);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 114)
    public static final void method2776(boolean arg0, byte arg1, String arg2) {
        int var3 = 31 % ((-arg1 - 39) / 59);
        class140.method1100(-4689, arg2, -1, -1, arg0);
        field6583++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 124)
    public static void method2777(int arg0) {
        field6596 = null;
        field6589 = null;
        if (arg0 != 512) {
            field6594 = false;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I", line = 135)
    public final int method2778(int arg0) {
        if (arg0 != 19486) {
            this.method2784(-114);
        }
        field6585++;
        return this.field6592;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Leq;Z)Ljava/lang/Object;", line = 147)
    public final Object method2779(class137 arg0, boolean arg1) {
        field6598++;
        long var3 = arg0.method1088(121);
        for (class186 var5 = (class186) this.field6597.method3512(arg1, var3); var5 != null; var5 = (class186) this.field6597.method3513(-1)) {
            if (var5.field3113.method1089(arg0, (byte) -117)) {
                Object var6 = var5.method1420((byte) 122);
                if (var6 != null) {
                    if (var5.method1422(0)) {
                        class246 var7 = new class246(arg0, var6, var5.field3112);
                        this.field6597.method3516(255, var5.field1039, var7);
                        this.field6600.method3779(-14068, var7);
                        var7.field3444 = 0L;
                        var5.method636((byte) 97);
                        var5.method1507(1);
                    } else {
                        this.field6600.method3779(-14068, var5);
                        var5.field3444 = 0L;
                    }
                    return var6;
                }
                var5.method636((byte) 97);
                var5.method1507(1);
                this.field6592 += var5.field3112;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Llia;I)V", line = 199)
    private final void method2780(class186 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method636((byte) 97);
            arg0.method1507(arg1 - 1);
            this.field6592 += arg0.field3112;
        }
        if (arg1 != 2) {
            this.field6592 = -94;
        }
        field6584++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Leq;B)V", line = 221)
    private final void method2781(class137 arg0, byte arg1) {
        field6593++;
        long var3 = arg0.method1088(90);
        if (arg1 != 9) {
            field6596 = null;
        }
        for (class186 var5 = (class186) this.field6597.method3512(true, var3); var5 != null; var5 = (class186) this.field6597.method3513(-1)) {
            if (var5.field3113.method1089(arg0, (byte) -125)) {
                this.method2780(var5, 2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/Object;ILeq;)V", line = 251)
    private final void method2782(int arg0, Object arg1, int arg2, class137 arg3) {
        field6590++;
        if (arg2 > this.field6588) {
            throw new IllegalStateException("s>cs");
        }
        this.method2781(arg3, (byte) 9);
        this.field6592 -= arg2;
        while (this.field6592 < 0) {
            class186 var6 = (class186) this.field6600.method3775(arg0 ^ 0xFFFFE989);
            this.method2780(var6, 2);
        }
        class246 var5 = new class246(arg3, arg1, arg2);
        this.field6597.method3516(255, arg3.method1088(99), var5);
        this.field6600.method3779(arg0 ^ 0x209B, var5);
        var5.field3444 = 0L;
        if (arg0 != -5737) {
            field6591 = -49L;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V", line = 280)
    public final void method2783(int arg0, boolean arg1) {
        if (!arg1) {
            field6596 = null;
        }
        if (class129.field2083 != null) {
            for (class186 var3 = (class186) this.field6600.method3772(true); var3 != null; var3 = (class186) this.field6600.method3780(23774)) {
                if (var3.method1422(0)) {
                    if (var3.method1420((byte) 122) == null) {
                        var3.method636((byte) 97);
                        var3.method1507(1);
                        this.field6592 += var3.field3112;
                    }
                } else if ((++var3.field3444) > ((long) arg0)) {
                    class186 var4 = class129.field2083.method901(var3, -25623);
                    this.field6597.method3516(255, var3.field1039, var4);
                    class379.method2388(var4, 100, var3);
                    var3.method636((byte) 97);
                    var3.method1507(1);
                }
            }
        }
        field6586++;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I", line = 330)
    public final int method2784(int arg0) {
        if (arg0 <= 41) {
            return -114;
        } else {
            field6599++;
            return this.field6588;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Leq;Ljava/lang/Object;I)V", line = 342)
    public final void method2785(class137 arg0, Object arg1, int arg2) {
        field6601++;
        this.method2782(-5737, arg1, 1, arg0);
        if (arg2 < 15) {
            this.field6600 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(I)V", line = 365)
    public class453(int arg0) {
        this.field6588 = arg0;
        this.field6592 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field6597 = new class616(var2);
    }
}
