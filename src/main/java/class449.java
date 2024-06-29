import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class449 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Ltk;")
    private class230 field6416 = new class230();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    private int field6415;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    private int field6419;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lek;")
    private class352 field6414;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Lte;")
    public static class437 field6432;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field6433;

    static {
        new class335("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field6420 = -1;
        field6432 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 9)
    public final void method2635(long arg0, int arg1, Object arg2) {
        field6418++;
        this.method2646(arg2, 1, 0, arg0);
        if (arg1 != -26591) {
            this.method2640(11);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)V", line = 26)
    private final void method2636(long arg0, int arg1) {
        field6427++;
        if (arg1 == 0) {
            class401 var4 = (class401) this.field6414.method2022(-1, arg0);
            this.method2645(var4, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I", line = 40)
    public final int method2637(byte arg0) {
        if (arg0 != -10) {
            this.method2639(true);
        }
        field6423++;
        return this.field6419;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V", line = 310)
    public class449(int arg0) {
        this.field6415 = arg0;
        this.field6419 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6414 = new class352(var2);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 54)
    public final Object method2638(int arg0) {
        field6417++;
        int var2 = 69 / ((arg0 - 77) / 33);
        class401 var3 = (class401) this.field6414.method2017(-94);
        while (var3 != null) {
            Object var4 = var3.method646(-17718);
            if (var4 != null) {
                return var4;
            }
            class401 var5 = var3;
            var3 = (class401) this.field6414.method2017(124);
            var5.method2165(16225);
            var5.method701(113);
            this.field6415 += var3.field5711;
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)I", line = 87)
    public final int method2639(boolean arg0) {
        field6422++;
        int var2 = 0;
        if (arg0) {
            this.method2646(null, -5, -19, -47L);
        }
        for (class401 var3 = (class401) this.field6416.method1399(110); var3 != null; var3 = (class401) this.field6416.method1394((byte) 14)) {
            if (!var3.method645((byte) 6)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 113)
    public final void method2640(int arg0) {
        for (class401 var2 = (class401) this.field6416.method1399(123); var2 != null; var2 = (class401) this.field6416.method1394((byte) 14)) {
            if (var2.method645((byte) 6)) {
                var2.method2165(16225);
                var2.method701(85);
                this.field6415 += var2.field5711;
            }
        }
        if (arg0 <= 78) {
            this.method2641((byte) 109);
        }
        field6426++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 141)
    public final Object method2641(byte arg0) {
        field6424++;
        int var2 = 22 / ((arg0 - 31) / 47);
        class401 var3 = (class401) this.field6414.method2021(99);
        while (var3 != null) {
            Object var4 = var3.method646(-17718);
            if (var4 != null) {
                return var4;
            }
            class401 var5 = var3;
            var3 = (class401) this.field6414.method2017(-37);
            var5.method2165(16225);
            var5.method701(98);
            this.field6415 += var3.field5711;
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 172)
    public final void method2642(int arg0) {
        if (arg0 != 0) {
            this.method2635(-122L, 10, null);
        }
        field6421++;
        this.field6416.method1396(-75);
        this.field6414.method2024(false);
        this.field6415 = this.field6419;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)I", line = 189)
    public static final int method2643(int arg0, String arg1) {
        field6428++;
        if (arg0 != -12098) {
            method2643(-54, null);
        }
        for (int var2 = 0; var2 < class283.field3607.length; var2++) {
            if (class283.field3607[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)I", line = 210)
    public final int method2644(int arg0) {
        if (arg0 != 0) {
            this.method2636(41L, -37);
        }
        field6431++;
        return this.field6415;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcv;B)V", line = 221)
    private final void method2645(class401 arg0, byte arg1) {
        field6425++;
        if (arg0 != null) {
            arg0.method2165(16225);
            arg0.method701(arg1 + 207);
            this.field6415 += arg0.field5711;
        }
        if (arg1 != -93) {
            method2643(-21, null);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V", line = 239)
    private final void method2646(Object arg0, int arg1, int arg2, long arg3) {
        field6433++;
        if (arg1 > this.field6419) {
            throw new IllegalStateException("s>cs");
        }
        this.method2636(arg3, 0);
        this.field6415 -= arg1;
        while (this.field6415 < 0) {
            class401 var7 = (class401) this.field6416.method1393((byte) 127);
            this.method2645(var7, (byte) -93);
        }
        class168 var6 = new class168(arg0, arg1);
        this.field6414.method2019((byte) -69, var6, arg3);
        this.field6416.method1400(false, var6);
        var6.field1098 = arg2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 269)
    public final Object method2647(int arg0, long arg1) {
        field6429++;
        class401 var4 = (class401) this.field6414.method2022(-1, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method646(-17718);
        if (var5 == null) {
            var4.method2165(16225);
            var4.method701(95);
            this.field6415 += var4.field5711;
            return null;
        }
        if (arg0 >= -97) {
            this.method2638(83);
        }
        if (var4.method645((byte) 6)) {
            class168 var6 = new class168(var5, var4.field5711);
            this.field6414.method2019((byte) -41, var6, var4.field5043);
            this.field6416.method1400(false, var6);
            var6.field1098 = 0L;
            var4.method2165(16225);
            var4.method701(107);
        } else {
            this.field6416.method1400(false, var4);
            var4.field1098 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V", line = 331)
    public final void method2648(boolean arg0, int arg1) {
        field6430++;
        if (arg0) {
            this.method2642(74);
        }
        if (class200.field2604 == null) {
            return;
        }
        for (class401 var3 = (class401) this.field6416.method1399(117); var3 != null; var3 = (class401) this.field6416.method1394((byte) 14)) {
            if (var3.method645((byte) 6)) {
                if (var3.method646(-17718) == null) {
                    var3.method2165(16225);
                    var3.method701(68);
                    this.field6415++;
                }
            } else if (((long) arg1) < (++var3.field1098)) {
                class401 var4 = class200.field2604.method216(var3, 66);
                this.field6414.method2019((byte) -93, var4, var3.field5043);
                class145.method975((byte) -22, var3, var4);
                var3.method2165(16225);
                var3.method701(110);
            }
        }
    }
}
