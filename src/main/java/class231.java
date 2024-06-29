import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class231 {

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lvt;")
    private class516 field4012 = new class516();

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    private int field4015;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lbu;")
    private class407 field4007;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(JI)V")
    private final void method1592(long arg0, int arg1) {
        int var4 = 112 / ((-arg1 - 50) / 48);
        field4019++;
        class441 var5 = (class441) this.field4007.method2516(arg0, -1);
        this.method1602(false, var5);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1593(byte arg0, long arg1) {
        int var4 = 78 % ((arg0 - 67) / 34);
        field4017++;
        class441 var5 = (class441) this.field4007.method2516(arg1, -1);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method1960(50);
        if (var6 == null) {
            var5.method1821((byte) 113);
            var5.method1799((byte) -50);
            this.field4015 += var5.field6572;
            return null;
        }
        if (var5.method1959(6)) {
            class308 var7 = new class308(var6, var5.field6572);
            this.field4007.method2517(var7, var5.field4542, (byte) -121);
            this.field4012.method3050(var7, 2);
            var7.field4496 = 0L;
            var5.method1821((byte) 72);
            var5.method1799((byte) -16);
        } else {
            this.field4012.method3050(var5, 2);
            var5.field4496 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1594(int arg0) {
        field4013++;
        class441 var2 = (class441) this.field4007.method2518(-126);
        while (var2 != null) {
            Object var3 = var2.method1960(50);
            if (var3 != null) {
                return var3;
            }
            class441 var4 = var2;
            var2 = (class441) this.field4007.method2524(0);
            var4.method1821((byte) -114);
            var4.method1799((byte) 85);
            this.field4015 += var2.field6572;
        }
        return arg0 <= 36 ? null : null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
    public final void method1595(Object arg0, long arg1, byte arg2) {
        field4008++;
        this.method1601((byte) 65, arg0, arg1, 1);
        int var5 = -25 / ((-arg2 - 38) / 52);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
    public final int method1596(int arg0) {
        if (arg0 < 99) {
            this.method1604(-93);
        }
        field4010++;
        return this.field4015;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)I")
    public static final int method1597(int arg0, int arg1, int arg2, int arg3) {
        field4018++;
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return arg3 == -27818 ? (arg1 >> 5 << 7) + (((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1)) : -5;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public final void method1598(int arg0) {
        for (class441 var2 = (class441) this.field4012.method3056(127); var2 != null; var2 = (class441) this.field4012.method3053(80)) {
            if (var2.method1959(6)) {
                var2.method1821((byte) 77);
                var2.method1799((byte) 103);
                this.field4015 += var2.field6572;
            }
        }
        int var3 = 113 / ((16 - arg0) / 60);
        field4016++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
    public final int method1599(byte arg0) {
        field4023++;
        int var2 = 0;
        class441 var3 = (class441) this.field4012.method3056(127);
        if (arg0 >= -76) {
            return -54;
        }
        while (var3 != null) {
            if (!var3.method1959(6)) {
                var2++;
            }
            var3 = (class441) this.field4012.method3053(-58);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1600(int arg0) {
        field4006++;
        class441 var2 = (class441) this.field4007.method2524(arg0 ^ arg0);
        while (var2 != null) {
            Object var3 = var2.method1960(50);
            if (var3 != null) {
                return var3;
            }
            class441 var4 = var2;
            var2 = (class441) this.field4007.method2524(0);
            var4.method1821((byte) 95);
            var4.method1799((byte) -75);
            this.field4015 += var2.field6572;
        }
        return null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjava/lang/Object;JI)V")
    private final void method1601(byte arg0, Object arg1, long arg2, int arg3) {
        field4020++;
        if (arg3 > this.field4009) {
            throw new IllegalStateException("s>cs");
        }
        this.method1592(arg2, -112);
        this.field4015 -= arg3;
        while (this.field4015 < 0) {
            class441 var8 = (class441) this.field4012.method3054(-29948);
            this.method1602(false, var8);
        }
        class308 var6 = new class308(arg1, arg3);
        int var7 = -112 % ((arg0 - 18) / 37);
        this.field4007.method2517(var6, arg2, (byte) 125);
        this.field4012.method3050(var6, 2);
        var6.field4496 = 0L;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLns;)V")
    private final void method1602(boolean arg0, class441 arg1) {
        field4021++;
        if (arg1 != null) {
            arg1.method1821((byte) -120);
            arg1.method1799((byte) 115);
            this.field4015 += arg1.field6572;
        }
        if (arg0) {
            this.method1602(false, null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
    public final void method1603(byte arg0, int arg1) {
        if (arg0 > -99) {
            this.field4015 = -44;
        }
        field4014++;
        if (class309.field4907 == null) {
            return;
        }
        for (class441 var3 = (class441) this.field4012.method3056(127); var3 != null; var3 = (class441) this.field4012.method3053(73)) {
            if (var3.method1959(6)) {
                if (var3.method1960(50) == null) {
                    var3.method1821((byte) -112);
                    var3.method1799((byte) 89);
                    this.field4015++;
                }
            } else if ((++var3.field4496) > ((long) arg1)) {
                class441 var4 = class309.field4907.method2591(var3, 127);
                this.field4007.method2517(var4, var3.field4542, (byte) -117);
                class396.method2479(var3, var4, 85);
                var3.method1821((byte) -113);
                var3.method1799((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
    public final void method1604(int arg0) {
        field4022++;
        if (arg0 != 4) {
            this.method1592(62L, -101);
        }
        this.field4012.method3049(arg0 - 2);
        this.field4007.method2525(arg0 - 4);
        this.field4015 = this.field4009;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I")
    public final int method1605(byte arg0) {
        field4011++;
        if (arg0 != 72) {
            this.method1602(true, null);
        }
        return this.field4009;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        this.field4015 = arg0;
        this.field4009 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4007 = new class407(var2);
    }
}
