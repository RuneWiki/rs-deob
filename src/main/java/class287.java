import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class287 implements Runnable {

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lmt;")
    private class249 field4189 = new class249();

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
    private boolean field4193 = false;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public int field4194 = 0;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4192;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4181 = 104;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ldk;")
    public static class326 field4182 = new class326("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "B")
    public static byte field4187;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "[I")
    public static int[] field4195;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method1791(int arg0) {
        field4191++;
        this.field4193 = true;
        class249 var2 = this.field4189;
        synchronized (this.field4189) {
            this.field4189.notifyAll();
        }
        try {
            if (arg0 != 17141) {
                this.method1794((byte) -11, (class43) null);
            }
            this.field4192.join();
        } catch (InterruptedException var3) {
        }
        this.field4192 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lrg;IB)Ldl;")
    public final class43 method1792(class420 arg0, int arg1, byte arg2) {
        field4184++;
        class43 var4 = new class43();
        var4.field630 = 1;
        if (arg2 != 8) {
            this.method1797((byte) 0, 51, (class420) null);
        }
        class249 var5 = this.field4189;
        synchronized (this.field4189) {
            class43 var6 = (class43) this.field4189.method1558(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field3960 && var6.field627 == arg0 && var6.field630 == 2) {
                    var4.field3393 = false;
                    var4.field625 = var6.field625;
                    return var4;
                }
                var6 = (class43) this.field4189.method1554(-11541);
            }
        }
        var4.field625 = arg0.method2468(21574, arg1);
        var4.field3397 = true;
        var4.field3393 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
    public final void run() {
        field4190++;
        while (!this.field4193) {
            class249 var1 = this.field4189;
            class43 var2;
            synchronized (this.field4189) {
                var2 = (class43) this.field4189.method1559(false);
                if (var2 == null) {
                    try {
                        this.field4189.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4194--;
            }
            try {
                if (var2.field630 == 2) {
                    var2.field627.method2467(var2.field625.length, var2.field625, 24704, (int) var2.field3960);
                } else if (var2.field630 == 3) {
                    var2.field625 = var2.field627.method2468(21574, (int) var2.field3960);
                }
            } catch (Exception var6) {
                class267.method1641((String) null, var6, (byte) -87);
            }
            var2.field3393 = false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static void method1793(boolean arg0) {
        if (!arg0) {
            field4182 = null;
            field4195 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLdl;)V")
    private final void method1794(byte arg0, class43 arg1) {
        field4185++;
        int var3 = 2 % ((-arg0 - 1) / 61);
        class249 var4 = this.field4189;
        synchronized (this.field4189) {
            this.field4189.method1553(-84, arg1);
            this.field4194++;
            this.field4189.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[BLrg;Z)Ldl;")
    public final class43 method1795(int arg0, byte[] arg1, class420 arg2, boolean arg3) {
        field4188++;
        class43 var5 = new class43();
        var5.field3960 = (long) arg0;
        var5.field3397 = arg3;
        var5.field627 = arg2;
        var5.field630 = 2;
        var5.field625 = arg1;
        this.method1794((byte) -92, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 88) {
            field4195 = null;
        }
        if ((arg3 - arg5) >= class168.field2449 && (arg3 + arg5) <= class94.field1209 && class345.field5011 <= arg2 - arg5 && class485.field6827 >= (arg2 + arg5)) {
            class374.method2279(arg5, arg0, 0, arg3, arg1, arg2, arg4);
        } else {
            class170.method1056(8553, arg1, arg5, arg0, arg3, arg4, arg2);
        }
        field4180++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILrg;)Ldl;")
    public final class43 method1797(byte arg0, int arg1, class420 arg2) {
        field4183++;
        int var4 = -71 / ((arg0 + 19) / 49);
        class43 var5 = new class43();
        var5.field3397 = false;
        var5.field630 = 3;
        var5.field627 = arg2;
        var5.field3960 = (long) arg1;
        this.method1794((byte) -84, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lmj;)V")
    public class287(class430 arg0) {
        class366 var2 = arg0.method2543(this, 5, (byte) 124);
        while (var2.field5253 == 0) {
            class111.method713(17, 10L);
        }
        if (var2.field5253 == 2) {
            throw new RuntimeException();
        }
        this.field4192 = (Thread) var2.field5255;
    }
}
