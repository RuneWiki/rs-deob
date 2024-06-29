import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class655 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lgd;")
    private class346 field9245 = new class346();

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    private int field9261;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    private int field9244;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Lmo;")
    private class482 field9250;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lvh;")
    public static class125 field9257 = new class125(33, 3);

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field9260 = 0;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 5)
    public final void method3689(byte arg0) {
        int var2 = 121 % ((arg0 - 16) / 56);
        this.field9245.method2103((byte) -42);
        field9255++;
        this.field9250.method2821(1);
        this.field9244 = this.field9261;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)I", line = 22)
    public final int method3690(boolean arg0) {
        if (arg0) {
            field9259++;
            return this.field9261;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lhm;I)V", line = 33)
    private final void method3691(class216 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2549((byte) 73);
            arg0.method1113(32730);
            this.field9244 += arg0.field3256;
        }
        field9251++;
        if (arg1 != 5) {
            this.field9244 = 40;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ler;I)Ljava/lang/Object;", line = 52)
    public final Object method3692(class209 arg0, int arg1) {
        field9246++;
        long var3 = arg0.method1442(-32331);
        class216 var5 = (class216) this.field9250.method2818(-22803, var3);
        if (arg1 != 0) {
            this.method3697((byte) 124);
        }
        while (var5 != null) {
            if (var5.field3257.method1443((byte) 37, arg0)) {
                Object var6 = var5.method59(-26235);
                if (var6 != null) {
                    if (var5.method61(arg1 ^ 0x7D)) {
                        class11 var7 = new class11(arg0, var6, var5.field3256);
                        this.field9250.method2816(var7, var5.field6265, false);
                        this.field9245.method2107(true, var7);
                        var7.field2469 = 0L;
                        var5.method2549((byte) 57);
                        var5.method1113(arg1 ^ 0x7FDA);
                    } else {
                        this.field9245.method2107(true, var5);
                        var5.field2469 = 0L;
                    }
                    return var6;
                }
                var5.method2549((byte) -112);
                var5.method1113(32730);
                this.field9244 += var5.field3256;
            }
            var5 = (class216) this.field9250.method2810((byte) -45);
        }
        return null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V", line = 105)
    public static final void method3693(int arg0, int arg1) {
        field9256++;
        class449 var2 = class611.method3463(arg1, (byte) -119, 5);
        if (arg0 == 0) {
            var2.method2614(106);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V", line = 119)
    public final void method3694(int arg0, byte arg1) {
        field9253++;
        if (class128.field2096 != null) {
            for (class216 var3 = (class216) this.field9245.method2112((byte) -94); var3 != null; var3 = (class216) this.field9245.method2109(-76)) {
                if (var3.method61(121)) {
                    if (var3.method59(-26235) == null) {
                        var3.method2549((byte) 94);
                        var3.method1113(32730);
                        this.field9244 += var3.field3256;
                    }
                } else if (++var3.field2469 > (long) arg0) {
                    class216 var4 = class128.field2096.method1488(-31989, var3);
                    this.field9250.method2816(var4, var3.field6265, false);
                    class114.method925(55, var3, var4);
                    var3.method2549((byte) -89);
                    var3.method1113(32730);
                }
            }
        }
        if (arg1 > -50) {
            method3701((byte) -33);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ler;Ljava/lang/Object;II)V", line = 168)
    private final void method3695(class209 arg0, Object arg1, int arg2, int arg3) {
        field9249++;
        if (this.field9261 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method3698(arg0, (byte) 64);
        this.field9244 -= arg2;
        while (this.field9244 < 0) {
            class216 var6 = (class216) this.field9245.method2105(-4488);
            this.method3691(var6, 5);
        }
        class11 var5 = new class11(arg0, arg1, arg2);
        this.field9250.method2816(var5, arg0.method1442(-32331), false);
        this.field9245.method2107(true, var5);
        var5.field2469 = arg3;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ler;BLjava/lang/Object;)V", line = 197)
    public final void method3696(class209 arg0, byte arg1, Object arg2) {
        if (arg1 >= 111) {
            field9247++;
            this.method3695(arg0, arg2, 1, 0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V", line = 209)
    public final void method3697(byte arg0) {
        if (arg0 != 19) {
            this.method3692(null, -22);
        }
        for (class216 var2 = (class216) this.field9245.method2112((byte) 122); var2 != null; var2 = (class216) this.field9245.method2109(arg0 - 125)) {
            if (var2.method61(arg0 + 105)) {
                var2.method2549((byte) -76);
                var2.method1113(arg0 ^ 0x7FC9);
                this.field9244 += var2.field3256;
            }
        }
        field9243++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ler;B)V", line = 236)
    private final void method3698(class209 arg0, byte arg1) {
        field9254++;
        long var3 = arg0.method1442(arg1 ^ 0xFFFF81F5);
        if (arg1 != 64) {
            this.field9261 = -85;
        }
        for (class216 var5 = (class216) this.field9250.method2818(-22803, var3); var5 != null; var5 = (class216) this.field9250.method2810((byte) -45)) {
            if (var5.field3257.method1443((byte) 37, arg0)) {
                this.method3691(var5, 5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I", line = 262)
    public final int method3699(boolean arg0) {
        if (arg0) {
            this.field9245 = null;
        }
        field9242++;
        return this.field9244;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V", line = 274)
    public static final void method3700(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class198.field3084 = arg4;
        if (arg3 == 1) {
            class627.field8931 = arg1;
            class94.field1398 = arg2;
            class512.field7620 = arg0;
            field9248++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V", line = 288)
    public static final void method3701(byte arg0) {
        if (arg0 != 38) {
            field9260 = 35;
        }
        if (class313.field4341 != null) {
            class313.field4341.method1057(7677);
        }
        field9258++;
        if (class183.field2894 != null) {
            class183.field2894.method1057(arg0 ^ 0x1DDB);
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V", line = 308)
    public static void method3702(byte arg0) {
        if (arg0 == 25) {
            field9257 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(I)V", line = 333)
    public class655(int arg0) {
        this.field9261 = arg0;
        this.field9244 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field9250 = new class482(var2);
    }
}
