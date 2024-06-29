import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class534 {

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lqk;")
    private class16 field7410;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    private int field7423;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    private int field7406;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Ltba;")
    private class165 field7420;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7402 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field7407 = -50;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public final void method3064(boolean arg0) {
        for (class745 var2 = (class745) this.field7410.method118(-30553); var2 != null; var2 = (class745) this.field7410.method111(22548)) {
            if (var2.method222((byte) 64)) {
                var2.method1175(-2);
                var2.method3615(63);
                this.field7406 += var2.field10377;
            }
        }
        if (arg0) {
            this.field7406 = 121;
        }
        field7422++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
    public final void method3065(boolean arg0) {
        field7411++;
        this.field7410.method113(47);
        this.field7420.method1161(false);
        this.field7406 = this.field7423;
        if (!arg0) {
            this.method3074(124);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/Object;ZJ)V")
    public final void method3066(int arg0, Object arg1, boolean arg2, long arg3) {
        field7419++;
        if (arg0 > this.field7423) {
            throw new IllegalStateException("s>cs");
        }
        this.method3072(63, arg3);
        this.field7406 -= arg0;
        while (this.field7406 < 0) {
            class745 var7 = (class745) this.field7410.method114(-63);
            this.method3076(-71, var7);
        }
        if (!arg2) {
            field7402 = 19;
        }
        class147 var6 = new class147(arg1, arg0);
        this.field7420.method1153(var6, arg3, -1);
        this.field7410.method116(var6, 1);
        var6.field8924 = 0L;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
    public final int method3067(byte arg0) {
        if (arg0 >= -96) {
            return -61;
        } else {
            field7417++;
            return this.field7406;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3068(byte arg0) {
        field7412++;
        class745 var2 = (class745) this.field7420.method1156(0);
        while (var2 != null) {
            Object var3 = var2.method221((byte) -118);
            if (var3 != null) {
                return var3;
            }
            class745 var4 = var2;
            var2 = (class745) this.field7420.method1158(22706);
            var4.method1175(arg0 - 103);
            var4.method3615(127);
            this.field7406 += var4.field10377;
        }
        return arg0 == 101 ? null : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[BII)V")
    public static final void method3069(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field7405++;
        if (arg1 >= arg4) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg4 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg1 & 0x3;
                if (arg5 != 10330) {
                    return;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public final void method3070(int arg0, int arg1) {
        if (class318.field4118 != null) {
            for (class745 var3 = (class745) this.field7410.method118(-30553); var3 != null; var3 = (class745) this.field7410.method111(22548)) {
                if (var3.method222((byte) 64)) {
                    if (var3.method221((byte) -118) == null) {
                        var3.method1175(-2);
                        var3.method3615(4);
                        this.field7406 += var3.field10377;
                    }
                } else if ((++var3.field8924) > ((long) arg0)) {
                    class745 var4 = class318.field4118.method2241(var3, -120);
                    this.field7420.method1153(var4, var3.field2333, -1);
                    class94.method766(var3, false, var4);
                    var3.method1175(-2);
                    var3.method3615(29);
                }
            }
        }
        if (arg1 <= 118) {
            this.method3064(false);
        }
        field7409++;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)I")
    public final int method3071(byte arg0) {
        int var2 = -63 % ((arg0 - 34) / 44);
        field7404++;
        return this.field7423;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
    private final void method3072(int arg0, long arg1) {
        if (arg0 == 63) {
            field7414++;
            class745 var4 = (class745) this.field7420.method1160(arg1, 127);
            this.method3076(76, var4);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)I")
    public final int method3073(byte arg0) {
        if (arg0 != -66) {
            field7407 = 107;
        }
        field7418++;
        int var2 = 0;
        for (class745 var3 = (class745) this.field7410.method118(arg0 ^ 0x7719); var3 != null; var3 = (class745) this.field7410.method111(22548)) {
            if (!var3.method222((byte) 64)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3074(int arg0) {
        field7415++;
        class745 var2 = (class745) this.field7420.method1158(22706);
        while (var2 != null) {
            Object var3 = var2.method221((byte) -118);
            if (var3 != null) {
                return var3;
            }
            class745 var4 = var2;
            var2 = (class745) this.field7420.method1158(arg0 + 22690);
            var4.method1175(arg0 - 18);
            var4.method3615(69);
            this.field7406 += var4.field10377;
        }
        return arg0 == 16 ? null : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZII)Luca;")
    public static final class515 method3075(boolean arg0, int arg1, int arg2) {
        field7413++;
        if (arg2 > -61) {
            return null;
        } else {
            long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
            return (class515) class310.field4077.method1160(var3, 124);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILqc;)V")
    private final void method3076(int arg0, class745 arg1) {
        if (arg1 != null) {
            arg1.method1175(-2);
            arg1.method3615(30);
            this.field7406 += arg1.field10377;
        }
        int var3 = -44 % ((23 - arg0) / 37);
        field7416++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BJLjava/lang/Object;)V")
    public final void method3077(byte arg0, long arg1, Object arg2) {
        int var5 = 118 / ((37 - arg0) / 50);
        this.method3066(1, arg2, true, arg1);
        field7421++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)C")
    public static final char method3078(int arg0, byte arg1) {
        field7403++;
        int var2 = arg0 & arg1;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class378.field4835[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V")
    public class534(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method3079(long arg0, int arg1) {
        field7408++;
        class745 var4 = (class745) this.field7420.method1160(arg0, 123);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 0) {
            this.method3073((byte) -91);
        }
        Object var5 = var4.method221((byte) -118);
        if (var5 == null) {
            var4.method1175(-2);
            var4.method3615(arg1 ^ 0x50);
            this.field7406 += var4.field10377;
            return null;
        }
        if (var4.method222((byte) 64)) {
            class147 var6 = new class147(var5, var4.field10377);
            this.field7420.method1153(var6, var4.field2333, arg1 - 1);
            this.field7410.method116(var6, arg1 ^ 0x1);
            var6.field8924 = 0L;
            var4.method1175(-2);
            var4.method3615(arg1 ^ 0x5E);
        } else {
            this.field7410.method116(var4, 1);
            var4.field8924 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
    public class534(int arg0, int arg1) {
        this.field7410 = new class16();
        this.field7423 = arg0;
        this.field7406 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
        }
        this.field7420 = new class165(var3);
    }
}
