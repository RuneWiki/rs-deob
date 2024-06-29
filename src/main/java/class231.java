import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class231 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
    public boolean field3583 = false;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lwm;")
    private class399 field3580 = new class399(64);

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Lwm;")
    public class399 field3586 = new class399(500);

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Lwm;")
    public class399 field3587 = new class399(30);

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Lwm;")
    public class399 field3588 = new class399(50);

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lph;")
    private class459 field3581;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lph;")
    public class459 field3582;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Z")
    public boolean field3579;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "[I")
    public static int[] field3585 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V", line = 3)
    public final void method1522(int arg0, byte arg1) {
        field3584++;
        int var3 = 40 % ((-arg1 - 7) / 57);
        this.field3580 = new class399(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 13)
    public final void method1523(byte arg0) {
        field3574++;
        class399 var2 = this.field3580;
        synchronized (this.field3580) {
            this.field3580.method2477(81);
            if (arg0 >= -10) {
                this.method1528(12, 99);
            }
        }
        class399 var3 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method2477(91);
        }
        class399 var4 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method2477(126);
        }
        class399 var5 = this.field3588;
        synchronized (this.field3588) {
            this.field3588.method2477(-107);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 36)
    public static final String method1524(String arg0, byte arg1) {
        if (arg1 != -84) {
            method1524(null, (byte) 93);
        }
        field3571++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)V", line = 87)
    public final void method1525(boolean arg0, byte arg1) {
        if (arg1 >= -73) {
            return;
        }
        field3575++;
        if (this.field3583 != arg0) {
            this.field3583 = arg0;
            this.method1526(true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 102)
    public final void method1526(boolean arg0) {
        class399 var2 = this.field3580;
        synchronized (this.field3580) {
            this.field3580.method2475((byte) 67);
        }
        field3578++;
        if (!arg0) {
            this.field3589 = 49;
        }
        class399 var3 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method2475((byte) 67);
        }
        class399 var4 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method2475((byte) 67);
        }
        class399 var5 = this.field3588;
        synchronized (this.field3588) {
            this.field3588.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V", line = 127)
    public final void method1527(int arg0, boolean arg1) {
        field3573++;
        if (arg1 == this.field3579) {
            return;
        }
        if (arg0 != 500) {
            this.method1528(109, -49);
        }
        this.field3579 = arg1;
        this.method1526(true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V", line = 143)
    public final void method1528(int arg0, int arg1) {
        class399 var3 = this.field3580;
        synchronized (this.field3580) {
            this.field3580.method2471((byte) 98, arg0);
        }
        field3572++;
        class399 var4 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method2471((byte) 98, arg0);
        }
        class399 var5 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method2471((byte) 98, arg0);
        }
        if (arg1 >= -78) {
            this.field3580 = null;
        }
        class399 var6 = this.field3588;
        synchronized (this.field3588) {
            this.field3588.method2471((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IZ)V", line = 168)
    public final void method1529(int arg0, boolean arg1) {
        this.field3589 = arg0;
        field3577++;
        class399 var3 = this.field3586;
        synchronized (this.field3586) {
            this.field3586.method2475((byte) 67);
        }
        class399 var4 = this.field3587;
        synchronized (this.field3587) {
            this.field3587.method2475((byte) 67);
        }
        if (arg1) {
            this.field3586 = null;
        }
        class399 var5 = this.field3588;
        synchronized (this.field3588) {
            this.field3588.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Ljc;", line = 190)
    public final class306 method1530(byte arg0, int arg1) {
        field3576++;
        if (arg0 > -4) {
            this.field3580 = null;
        }
        class399 var3 = this.field3580;
        class306 var4;
        synchronized (this.field3580) {
            var4 = (class306) this.field3580.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field3581;
        byte[] var6;
        synchronized (this.field3581) {
            var6 = this.field3581.method2757(class460.method2768(arg1, (byte) 101), class475.method2845((byte) 47, arg1), (byte) -128);
        }
        class306 var7 = new class306();
        var7.field4626 = arg1;
        var7.field4616 = this;
        if (var6 != null) {
            var7.method1953(new class289(var6), -1);
        }
        var7.method1961((byte) -71);
        if (var7.field4620) {
            var7.field4609 = false;
            var7.field4614 = 0;
        }
        if (!this.field3579 && var7.field4647) {
            var7.field4605 = null;
            var7.field4644 = null;
        }
        class399 var8 = this.field3580;
        synchronized (this.field3580) {
            this.field3580.method2472(-81, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 236)
    public static void method1531(byte arg0) {
        int var1 = -22 % ((56 - arg0) / 49);
        field3585 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lkp;IZLph;Lph;)V", line = 275)
    public class231(class341 arg0, int arg1, boolean arg2, class459 arg3, class459 arg4) {
        this.field3581 = arg3;
        this.field3582 = arg4;
        this.field3579 = arg2;
        if (this.field3581 != null) {
            int var6 = this.field3581.method2759(16460) - 1;
            this.field3581.method2763(var6, -3);
        }
    }
}
