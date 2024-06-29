import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class371 implements Runnable {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lub;")
    private class18 field5345 = new class18();

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public int field5356 = 0;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Z")
    private boolean field5355 = false;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field5354;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public final void method2268(byte arg0) {
        this.field5355 = true;
        field5344++;
        class18 var2 = this.field5345;
        synchronized (this.field5345) {
            if (arg0 != 90) {
                return;
            }
            this.field5345.notifyAll();
        }
        try {
            this.field5354.join();
        } catch (InterruptedException var5) {
        }
        this.field5354 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILwf;)Lvg;")
    public final class38 method2269(int arg0, int arg1, class91 arg2) {
        field5352++;
        class38 var4 = new class38();
        var4.field806 = 1;
        class18 var5 = this.field5345;
        synchronized (this.field5345) {
            if (arg0 <= 29) {
                this.method2274(null, -109, -57, null);
            }
            class38 var6 = (class38) this.field5345.method102(1048575);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field7659 && var6.field810 == arg2 && var6.field806 == 2) {
                    var4.field4248 = false;
                    var4.field805 = var6.field805;
                    return var4;
                }
                var6 = (class38) this.field5345.method105((byte) 43);
            }
        }
        var4.field805 = arg2.method672(995151496, arg1);
        var4.field4253 = true;
        var4.field4248 = false;
        return var4;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lvg;B)V")
    private final void method2270(class38 arg0, byte arg1) {
        field5349++;
        class18 var3 = this.field5345;
        synchronized (this.field5345) {
            if (arg1 > -68) {
                this.field5345 = null;
            }
            this.field5345.method99(arg0, 5604);
            this.field5356++;
            this.field5345.notifyAll();
        }
    }

    @OriginalMember(owner = "client!um", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5355) {
            class18 var1 = this.field5345;
            class38 var2;
            synchronized (this.field5345) {
                var2 = (class38) this.field5345.method103(1048575);
                if (var2 == null) {
                    try {
                        this.field5345.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5356--;
            }
            try {
                if (var2.field806 == 2) {
                    var2.field810.method670((int) var2.field7659, var2.field805, var2.field805.length, (byte) -63);
                } else if (var2.field806 == 3) {
                    var2.field805 = var2.field810.method672(995151496, (int) var2.field7659);
                }
            } catch (Exception var6) {
                class266.method1710((byte) 81, var6, null);
            }
            var2.field4248 = false;
        }
        field5353++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static final void method2271(int arg0) {
        class338.method2147((byte) -119);
        field5347++;
        class57.field1019 = null;
        class287.field4257 = null;
        class544.field7987 = null;
        class157.field2402 = null;
        if (arg0 != -4) {
            method2272(72, -32, -45, 92, -33);
        }
        class340.field5032 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class220.field3371.field2549 != 0 && arg0 != 0 && class215.field3238 < 50 && arg2 != -1) {
            class79.field1281[class215.field3238++] = new class306((byte) 1, arg2, arg0, arg4, arg3, 0);
        }
        field5351++;
        if (arg1 == 9832) {
            ;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwf;II)Lvg;")
    public final class38 method2273(class91 arg0, int arg1, int arg2) {
        int var4 = -50 % ((arg1 - 69) / 54);
        field5348++;
        class38 var5 = new class38();
        var5.field806 = 3;
        var5.field7659 = arg2;
        var5.field810 = arg0;
        var5.field4253 = false;
        this.method2270(var5, (byte) -91);
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lwf;II[B)Lvg;")
    public final class38 method2274(class91 arg0, int arg1, int arg2, byte[] arg3) {
        field5346++;
        class38 var5 = new class38();
        var5.field805 = arg3;
        var5.field806 = arg1;
        var5.field810 = arg0;
        var5.field7659 = arg2;
        var5.field4253 = false;
        this.method2270(var5, (byte) -87);
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lul;)V")
    public class371(class411 arg0) {
        class81 var2 = arg0.method2436(this, 24305, 5);
        while (var2.field1314 == 0) {
            class477.method2826(10L, 0);
        }
        if (var2.field1314 == 2) {
            throw new RuntimeException();
        }
        this.field5354 = (Thread) var2.field1311;
    }
}
