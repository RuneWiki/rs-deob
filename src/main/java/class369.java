import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class369 {

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lcba;")
    private class513 field5476 = new class513();

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lsl;")
    private class427 field5465;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lqf;")
    public static class635 field5463 = null;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method2328(int arg0) {
        this.field5476.method3021(arg0 ^ 0xFFFF8F10);
        field5480++;
        if (arg0 != 0) {
            this.field5479 = -59;
        }
        this.field5465.method2600((byte) -114);
        this.field5479 = this.field5468;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public final void method2329(byte arg0) {
        field5464++;
        class437 var2 = (class437) this.field5476.method3024(5572);
        int var3 = -103 / ((-arg0 - 44) / 43);
        while (var2 != null) {
            if (var2.method2650(-1)) {
                var2.method2588(300);
                var2.method3813(87);
                this.field5479 += var2.field6307;
            }
            var2 = (class437) this.field5476.method3026(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
    public final int method2330(int arg0) {
        field5481++;
        if (arg0 != 1) {
            this.method2334(null, -53);
        }
        return this.field5468;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbga;Ljava/lang/Object;II)V")
    private final void method2331(class329 arg0, Object arg1, int arg2, int arg3) {
        field5467++;
        if (arg3 > this.field5468) {
            throw new IllegalStateException("s>cs");
        }
        this.method2337(arg0, (byte) 73);
        this.field5479 -= arg3;
        while (this.field5479 < 0) {
            class437 var6 = (class437) this.field5476.method3027(0);
            this.method2338(var6, 50);
        }
        class606 var5 = new class606(arg0, arg1, arg3);
        this.field5465.method2598(var5, arg0.method2112(false), (byte) 8);
        if (arg2 != 32706) {
            this.method2332((byte) -114, 64);
        }
        this.field5476.method3023((byte) 69, var5);
        var5.field9628 = 0L;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)V")
    public final void method2332(byte arg0, int arg1) {
        field5470++;
        if (arg0 > -34) {
            this.field5465 = null;
        }
        if (class443.field6376 == null) {
            return;
        }
        for (class437 var3 = (class437) this.field5476.method3024(5572); var3 != null; var3 = (class437) this.field5476.method3026(0)) {
            if (var3.method2650(-1)) {
                if (var3.method2649(-128) == null) {
                    var3.method2588(300);
                    var3.method3813(-126);
                    this.field5479 += var3.field6307;
                }
            } else if (((long) arg1) < (++var3.field9628)) {
                class437 var4 = class443.field6376.method830(3553, var3);
                this.field5465.method2598(var4, var3.field6132, (byte) 8);
                class216.method1503(var4, (byte) -73, var3);
                var3.method2588(300);
                var3.method3813(-114);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method2333(int arg0, byte arg1, String arg2) {
        if (arg1 != -14) {
            method2333(1, (byte) 121, null);
        }
        if (arg0 == 0) {
            class623.field9017 = class167.method1260(class527.field7429.field2671 * 2, 0, class513.field7240, 0, class252.field3751, class699.field9853);
            if (arg2 != null) {
                class623.field9017.method42(0);
                class11 var10 = class620.method3545(0, class545.field7727, class95.field1708, (byte) -119);
                class421 var11 = class623.field9017.method160(var10, class279.method1844(class632.field9092, class545.field7727, 0), true);
                class278.method1836(true);
                class341.method2191(class623.field9017, arg2, true, var11, var10, (byte) -84);
            }
        } else {
            class167 var3 = null;
            if (arg2 != null) {
                var3 = class167.method1260(0, arg1 + 14, class513.field7240, 0, class252.field3751, class699.field9853);
                var3.method42(0);
                class11 var4 = class620.method3545(0, class545.field7727, class95.field1708, (byte) 79);
                class421 var5 = var3.method160(var4, class279.method1844(class632.field9092, class545.field7727, 0), true);
                class278.method1836(true);
                class341.method2191(var3, arg2, true, var5, var4, (byte) -107);
            }
            try {
                class623.field9017 = class167.method1260(class527.field7429.field2671 * 2, 0, class513.field7240, arg0, class252.field3751, class699.field9853);
                if (arg2 != null) {
                    var3.method42(0);
                    class11 var6 = class620.method3545(0, class545.field7727, class95.field1708, (byte) 32);
                    class421 var7 = var3.method160(var6, class279.method1844(class632.field9092, class545.field7727, 0), true);
                    class278.method1836(true);
                    class341.method2191(var3, arg2, true, var7, var6, (byte) -97);
                }
                if (class623.field9017.method114()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class495 var9;
                    if (var8) {
                        var9 = class623.field9017.method32(146800640);
                    } else {
                        var9 = class623.field9017.method32(104857600);
                    }
                    class623.field9017.method84(var9);
                }
            } catch (Throwable var14) {
                arg0 = 0;
                class623.field9017 = class167.method1260(0, 0, class513.field7240, 0, class252.field3751, class699.field9853);
            }
            if (var3 != null) {
                try {
                    var3.method1265((byte) -67);
                } catch (Throwable var12) {
                }
            }
        }
        field5466++;
        class90.field1654 = arg0;
        class706.method3942(arg1 ^ 0xFFFFFFF3);
        class623.field9017.method48(32);
        class608.field8854 = class623.field9017.method168();
        class241.field3647 = class623.field9017.method168();
        class89.method875(-127);
        class623.field9017.method163(!class527.field7429.field2654);
        if (class623.field9017.method173()) {
            class213.method1489(123, class527.field7429.field2652);
        }
        class597.method3400(class218.field3316 >> 3, class623.field9017, class675.field9604 >> 3, 5);
        class593.method3382(-1);
        class155.field2619 = null;
        class620.field9000 = true;
        class33.field966 = false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbga;I)Ljava/lang/Object;")
    public final Object method2334(class329 arg0, int arg1) {
        int var3 = -126 % ((arg1 + 50) / 59);
        field5471++;
        long var4 = arg0.method2112(false);
        for (class437 var6 = (class437) this.field5465.method2596(var4, 105); var6 != null; var6 = (class437) this.field5465.method2595(27126)) {
            if (var6.field6309.method2113(arg0, (byte) 116)) {
                Object var7 = var6.method2649(-125);
                if (var7 != null) {
                    if (var6.method2650(-1)) {
                        class606 var8 = new class606(arg0, var7, var6.field6307);
                        this.field5465.method2598(var8, var6.field6132, (byte) 8);
                        this.field5476.method3023((byte) 49, var8);
                        var8.field9628 = 0L;
                        var6.method2588(300);
                        var6.method3813(-109);
                    } else {
                        this.field5476.method3023((byte) 96, var6);
                        var6.field9628 = 0L;
                    }
                    return var7;
                }
                var6.method2588(300);
                var6.method3813(-112);
                this.field5479 += var6.field6307;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbga;BLjava/lang/Object;)V")
    public final void method2335(class329 arg0, byte arg1, Object arg2) {
        field5473++;
        this.method2331(arg0, arg2, 32706, 1);
        if (arg1 < 57) {
            method2333(-40, (byte) 125, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
    public final int method2336(int arg0) {
        field5472++;
        return arg0 == 0 ? this.field5479 : -24;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbga;B)V")
    private final void method2337(class329 arg0, byte arg1) {
        field5477++;
        int var3 = -92 % ((arg1 + 19) / 58);
        long var4 = arg0.method2112(false);
        for (class437 var6 = (class437) this.field5465.method2596(var4, 124); var6 != null; var6 = (class437) this.field5465.method2595(27126)) {
            if (var6.field6309.method2113(arg0, (byte) -68)) {
                this.method2338(var6, 80);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lvaa;I)V")
    private final void method2338(class437 arg0, int arg1) {
        field5469++;
        if (arg0 != null) {
            arg0.method2588(300);
            arg0.method3813(-92);
            this.field5479 += arg0.field6307;
        }
        if (arg1 <= 6) {
            this.field5479 = -115;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
    public class369(int arg0) {
        this.field5468 = arg0;
        this.field5479 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5465 = new class427(var2);
    }
}
