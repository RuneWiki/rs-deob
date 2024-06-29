import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class244 implements Runnable {

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "Ldr;")
    private class721 field3406 = new class721();

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "Z")
    private boolean field3413 = false;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public int field3416 = 0;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field3412;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "[Z")
    public static boolean[] field3407;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILmi;I[B)Ljk;", line = 4)
    public final class634 method1517(int arg0, class498 arg1, int arg2, byte[] arg3) {
        field3414++;
        class634 var5 = new class634();
        var5.field8441 = arg3;
        var5.field5747 = arg0;
        var5.field8444 = 2;
        if (arg2 != 1) {
            this.field3416 = -5;
        }
        var5.field7583 = false;
        var5.field8442 = arg1;
        this.method1522(-127, var5);
        return var5;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIZ[IIILrda;)Lqd;", line = 23)
    public static final class452 method1518(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6, class663 arg7) {
        if (arg2 < 70) {
            return null;
        }
        field3410++;
        if (!arg7.field9062 && (!class538.method2993(arg6, -31218) || !class538.method2993(arg0, -31218))) {
            return arg7.field8986 ? new class452(arg7, 34037, arg6, arg0, arg3, arg4, arg1, arg5) : new class452(arg7, arg6, arg0, class737.method4119(arg6, (byte) -128), class737.method4119(arg0, (byte) -128), arg4);
        } else {
            return new class452(arg7, 3553, arg6, arg0, arg3, arg4, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lmi;II)Ljk;", line = 45)
    public final class634 method1519(class498 arg0, int arg1, int arg2) {
        field3405++;
        if (arg1 != -3) {
            field3407 = null;
        }
        class634 var4 = new class634();
        var4.field8444 = 1;
        class721 var5 = this.field3406;
        synchronized (this.field3406) {
            class634 var6 = (class634) this.field3406.method4051(896);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field5747 && var6.field8442 == arg0 && var6.field8444 == 2) {
                    var4.field8441 = var6.field8441;
                    var4.field7580 = false;
                    return var4;
                }
                var6 = (class634) this.field3406.method4049(true);
            }
        }
        var4.field8441 = arg0.method2812(59, arg2);
        var4.field7583 = true;
        var4.field7580 = false;
        return var4;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 81)
    public final void method1520(int arg0) {
        this.field3413 = true;
        field3409++;
        class721 var2 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.notifyAll();
        }
        try {
            this.field3412.join();
            int var3 = 38 / ((arg0 - 11) / 37);
        } catch (InterruptedException var4) {
        }
        this.field3412 = null;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V", line = 100)
    public static void method1521(int arg0) {
        field3407 = null;
        if (arg0 <= 56) {
            method1518(62, 92, 11, true, null, 11, -110, null);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILjk;)V", line = 110)
    private final void method1522(int arg0, class634 arg1) {
        class721 var3 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method4050(arg1, -106);
            this.field3416++;
            this.field3406.notifyAll();
            int var4 = -115 % ((arg0 + 84) / 42);
        }
        field3411++;
    }

    @OriginalMember(owner = "client!eia", name = "run", descriptor = "()V", line = 125)
    public final void run() {
        field3415++;
        while (!this.field3413) {
            class721 var1 = this.field3406;
            class634 var2;
            synchronized (this.field3406) {
                var2 = (class634) this.field3406.method4056(896);
                if (var2 == null) {
                    try {
                        this.field3406.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3416--;
            }
            try {
                if (var2.field8444 == 2) {
                    var2.field8442.method2807(var2.field8441.length, var2.field8441, (int) var2.field5747, -27945);
                } else if (var2.field8444 == 3) {
                    var2.field8441 = var2.field8442.method2812(123, (int) var2.field5747);
                }
            } catch (Exception var6) {
                class135.method1056(null, var6, 1);
            }
            var2.field7580 = false;
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lkk;)V", line = 203)
    public class244(class192 arg0) {
        class198 var2 = arg0.method1311(this, 5, 0);
        while (var2.field2987 == 0) {
            class226.method1447((byte) -124, 10L);
        }
        if (var2.field2987 == 2) {
            throw new RuntimeException();
        }
        this.field3412 = (Thread) var2.field2986;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(BILmi;)Ljk;", line = 174)
    public final class634 method1523(byte arg0, int arg1, class498 arg2) {
        if (arg0 != 127) {
            return null;
        }
        field3408++;
        class634 var4 = new class634();
        var4.field5747 = arg1;
        var4.field7583 = false;
        var4.field8442 = arg2;
        var4.field8444 = 3;
        this.method1522(arg0 - 18, var4);
        return var4;
    }
}
