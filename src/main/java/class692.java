import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class692 implements Runnable {

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Lut;")
    private class136 field9429 = new class136();

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "Z")
    private boolean field9433 = false;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public int field9432 = 0;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field9434;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "Ltja;")
    public static class288 field9424 = new class288(260);

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Lnp;")
    public static class517 field9423;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Los;I)V")
    private final void method3864(class467 arg0, int arg1) {
        class136 var3 = this.field9429;
        synchronized (this.field9429) {
            this.field9429.method1005(-70, arg0);
            this.field9432++;
            this.field9429.notifyAll();
            if (arg1 != 0) {
                this.run();
            }
        }
        field9426++;
    }

    @OriginalMember(owner = "client!rda", name = "run", descriptor = "()V")
    public final void run() {
        field9430++;
        while (!this.field9433) {
            class136 var1 = this.field9429;
            class467 var2;
            synchronized (this.field9429) {
                var2 = (class467) this.field9429.method1006(24360);
                if (var2 == null) {
                    try {
                        this.field9429.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field9432--;
            }
            try {
                if (var2.field6526 == 2) {
                    var2.field6534.method2179(false, (int) var2.field1894, var2.field6525.length, var2.field6525);
                } else if (var2.field6526 == 3) {
                    var2.field6525 = var2.field6534.method2178((byte) -31, (int) var2.field1894);
                }
            } catch (Exception var6) {
                class705.method4008(var6, null, -127);
            }
            var2.field374 = false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public final void method3865(int arg0) {
        field9428++;
        this.field9433 = true;
        class136 var2 = this.field9429;
        synchronized (this.field9429) {
            this.field9429.notifyAll();
        }
        try {
            this.field9434.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 >= -103) {
            this.method3867((byte) 49, null, null, 122);
        }
        this.field9434 = null;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
    public static void method3866(int arg0) {
        field9424 = null;
        field9423 = null;
        if (arg0 > -74) {
            field9424 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLtc;[BI)Los;")
    public final class467 method3867(byte arg0, class372 arg1, byte[] arg2, int arg3) {
        if (arg0 != 31) {
            return null;
        }
        field9425++;
        class467 var5 = new class467();
        var5.field6534 = arg1;
        var5.field6525 = arg2;
        var5.field378 = false;
        var5.field6526 = 2;
        var5.field1894 = arg3;
        this.method3864(var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBLtc;)Los;")
    public final class467 method3868(int arg0, byte arg1, class372 arg2) {
        field9431++;
        class467 var4 = new class467();
        var4.field378 = false;
        var4.field6534 = arg2;
        var4.field6526 = 3;
        if (arg1 == 48) {
            var4.field1894 = arg0;
            this.method3864(var4, 0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ltc;II)Los;")
    public final class467 method3869(class372 arg0, int arg1, int arg2) {
        field9427++;
        class467 var4 = new class467();
        var4.field6526 = arg2;
        class136 var5 = this.field9429;
        synchronized (this.field9429) {
            class467 var6 = (class467) this.field9429.method1003((byte) 53);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1894 && var6.field6534 == arg0 && var6.field6526 == 2) {
                    var4.field374 = false;
                    var4.field6525 = var6.field6525;
                    return var4;
                }
                var6 = (class467) this.field9429.method1004(true);
            }
        }
        var4.field6525 = arg0.method2178((byte) -31, arg1);
        var4.field374 = false;
        var4.field378 = true;
        return var4;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Llc;)V")
    public class692(class675 arg0) {
        class561 var2 = arg0.method3805(5, -115, this);
        while (var2.field7769 == 0) {
            class594.method3405(10L, 16711680);
        }
        if (var2.field7769 == 2) {
            throw new RuntimeException();
        }
        this.field9434 = (Thread) var2.field7768;
    }
}
