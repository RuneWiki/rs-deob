import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class255 implements Runnable {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lc;")
    private class106 field4045 = new class106();

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
    private boolean field4059 = false;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field4062 = 0;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field4060;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "J")
    public static long field4047 = 0L;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4055 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[B")
    public static byte[] field4056 = new byte[520];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Ld;")
    public static class238 field4046;

    @OriginalMember(owner = "client!ta", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4059) {
            class106 var1 = this.field4045;
            class271 var2;
            synchronized (this.field4045) {
                var2 = (class271) this.field4045.method771(-61);
                if (var2 == null) {
                    try {
                        this.field4045.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4062--;
            }
            try {
                if (var2.field4277 == 2) {
                    var2.field4270.method1000(var2.field4278.length, var2.field4278, (int) var2.field48, -67);
                } else if (var2.field4277 == 3) {
                    var2.field4278 = var2.field4270.method1002((int) var2.field48, 2);
                }
            } catch (Exception var6) {
                class178.method1211((String) null, -126, var6);
            }
            var2.field2781 = false;
        }
        field4044++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public final void method1732(byte arg0) {
        if (arg0 != -47) {
            this.field4060 = null;
        }
        field4049++;
        this.field4059 = true;
        class106 var2 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.notifyAll();
        }
        try {
            this.field4060.join();
        } catch (InterruptedException var3) {
        }
        this.field4060 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1733(int arg0) {
        if (arg0 >= -33) {
            method1739((byte) -42);
        }
        field4061++;
        class115.field1903.method472((byte) -63);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lh;Z)V")
    private final void method1734(class271 arg0, boolean arg1) {
        field4051++;
        class106 var3 = this.field4045;
        synchronized (this.field4045) {
            this.field4045.method774(0, arg0);
            this.field4062++;
            if (arg1) {
                field4048 = 116;
            }
            this.field4045.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1735(boolean arg0) {
        class72.field1185.method481(arg0);
        field4052++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILab;I[B)Lh;")
    public final class271 method1736(int arg0, class146 arg1, int arg2, byte[] arg3) {
        field4054++;
        class271 var5 = new class271();
        var5.field2778 = false;
        var5.field4277 = 2;
        var5.field4278 = arg3;
        var5.field4270 = arg1;
        var5.field48 = (long) arg2;
        if (arg0 < 105) {
            method1739((byte) -96);
        }
        this.method1734(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILab;)Lh;")
    public final class271 method1737(int arg0, int arg1, class146 arg2) {
        class271 var4 = new class271();
        var4.field4277 = 1;
        field4050++;
        class106 var5 = this.field4045;
        synchronized (this.field4045) {
            class271 var6 = (class271) this.field4045.method766((byte) -127);
            if (arg0 != -3) {
                return null;
            }
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field48 && var6.field4270 == arg2 && var6.field4277 == 2) {
                    var4.field2781 = false;
                    var4.field4278 = var6.field4278;
                    return var4;
                }
                var6 = (class271) this.field4045.method764((byte) -82);
            }
        }
        var4.field4278 = arg2.method1002(arg1, 2);
        var4.field2778 = true;
        var4.field2781 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lab;IZ)Lh;")
    public final class271 method1738(class146 arg0, int arg1, boolean arg2) {
        class271 var4 = new class271();
        var4.field4270 = arg0;
        var4.field4277 = 3;
        field4057++;
        var4.field48 = (long) arg1;
        var4.field2778 = false;
        if (!arg2) {
            this.method1738((class146) null, 4, false);
        }
        this.method1734(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        if (arg0 > -118) {
            field4048 = 84;
        }
        field4046 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class255() {
        class163 var1 = class105.field1684.method1133(5, this, (byte) 115);
        while (var1.field2589 == 0) {
            class43.method358(10L, false);
        }
        if (var1.field2589 == 2) {
            throw new RuntimeException();
        }
        this.field4060 = (Thread) var1.field2594;
    }
}
