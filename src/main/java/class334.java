import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class334 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Lof;")
    private class620 field4309 = new class620(64);

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Loh;")
    private class404 field4316;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public static int[] field4312;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 3)
    public final void method1991(byte arg0) {
        class620 var2 = this.field4309;
        synchronized (this.field4309) {
            if (arg0 >= -26) {
                return;
            }
            this.field4309.method3549(0);
        }
        field4313++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method1992(byte arg0, int arg1) {
        field4311++;
        if (!class650.method3697(0, arg1)) {
            return;
        }
        class532[] var2 = class643.field9209[arg1];
        int var3 = -113 / ((-arg0 - 43) / 58);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class532 var5 = var2[var4];
            if (var5 != null) {
                var5.field7695 = 1;
                var5.field7636 = 0;
                var5.field7547 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(BI)Ltba;", line = 54)
    public final class162 method1993(byte arg0, int arg1) {
        if (arg0 != -81) {
            return null;
        }
        field4308++;
        class620 var3 = this.field4309;
        class162 var4;
        synchronized (this.field4309) {
            var4 = (class162) this.field4309.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field4316;
        byte[] var6;
        synchronized (this.field4316) {
            var6 = this.field4316.method2481(16, arg1, (byte) 125);
        }
        class162 var7 = new class162();
        if (var6 != null) {
            var7.method1005((byte) 24, new class244(var6));
        }
        class620 var8 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3537(72, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 86)
    public final void method1994(int arg0) {
        if (arg0 != 16) {
            this.method1993((byte) -105, -70);
        }
        class620 var2 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3541(-647);
        }
        field4310++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 101)
    public static void method1995(boolean arg0) {
        if (!arg0) {
            field4312 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(BI)V", line = 115)
    public final void method1996(byte arg0, int arg1) {
        if (arg0 <= 64) {
            method1992((byte) 71, 72);
        }
        field4317++;
        class620 var3 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3539((byte) -63, arg1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lrr;)V", line = 128)
    public static final void method1997(class361 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class361 var2 = null;
            for (class361 var3 = class436.field6357[var1]; var3 != null; var3 = var3.field4634) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class436.field6357[var1] = var3.field4634;
                    } else {
                        var2.field4634 = var3.field4634;
                    }
                    class568.field8076 = true;
                    return;
                }
                var2 = var3;
            }
            class361 var4 = null;
            for (class361 var5 = class300.field3729[var1]; var5 != null; var5 = var5.field4634) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class300.field3729[var1] = var5.field4634;
                    } else {
                        var4.field4634 = var5.field4634;
                    }
                    class568.field8076 = true;
                    return;
                }
                var4 = var5;
            }
            class361 var6 = null;
            for (class361 var7 = class228.field2626[var1]; var7 != null; var7 = var7.field4634) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class228.field2626[var1] = var7.field4634;
                    } else {
                        var6.field4634 = var7.field4634;
                    }
                    class568.field8076 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 209)
    public class334(class301 arg0, int arg1, class404 arg2) {
        this.field4316 = arg2;
        if (this.field4316 == null) {
            this.field4314 = 0;
        } else {
            this.field4314 = this.field4316.method2482(0, 16);
        }
    }
}
