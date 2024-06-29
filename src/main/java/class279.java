import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class279 implements Runnable {

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Lad;")
    private class342 field4245 = new class342();

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "Z")
    private boolean field4248 = false;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public int field4249 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4247;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4236 = 1;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
    public static int[] field4237 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field4243 = -1;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 6)
    public static void method2034(byte arg0) {
        if (arg0 >= -107) {
            method2034((byte) -93);
        }
        field4237 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILnm;)Lra;", line = 16)
    public final class189 method2035(int arg0, int arg1, class201 arg2) {
        field4244++;
        if (arg1 != 18538) {
            this.field4249 = 34;
        }
        class189 var4 = new class189();
        var4.field2697 = 1;
        class342 var5 = this.field4245;
        synchronized (this.field4245) {
            class189 var6 = (class189) this.field4245.method2386((byte) -63);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field1122 && var6.field2701 == arg2 && var6.field2697 == 2) {
                    var4.field118 = false;
                    var4.field2699 = var6.field2699;
                    return var4;
                }
                var6 = (class189) this.field4245.method2388((byte) -92);
            }
        }
        var4.field2699 = arg2.method1461(arg0, 97);
        var4.field118 = false;
        var4.field108 = true;
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILra;)V", line = 53)
    private final void method2036(int arg0, class189 arg1) {
        field4238++;
        class342 var3 = this.field4245;
        synchronized (this.field4245) {
            this.field4245.method2385(arg1, 14);
            this.field4249++;
            if (arg0 <= 70) {
                this.field4248 = false;
            }
            this.field4245.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 68)
    public final void method2037(byte arg0) {
        this.field4248 = true;
        class342 var2 = this.field4245;
        synchronized (this.field4245) {
            this.field4245.notifyAll();
        }
        field4242++;
        try {
            this.field4247.join();
            if (arg0 <= 86) {
                method2034((byte) 50);
            }
        } catch (InterruptedException var5) {
        }
        this.field4247 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILnm;[BI)Lra;", line = 97)
    public final class189 method2038(int arg0, class201 arg1, byte[] arg2, int arg3) {
        field4235++;
        if (arg0 < 74) {
            method2039((byte) -117);
        }
        class189 var5 = new class189();
        var5.field2701 = arg1;
        var5.field2697 = 2;
        var5.field108 = false;
        var5.field1122 = (long) arg3;
        var5.field2699 = arg2;
        this.method2036(73, var5);
        return var5;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)V", line = 117)
    public static final void method2039(byte arg0) {
        class357.method2477(false);
        class252.method1845(6);
        client.method357(false);
        class172.method1210(78);
        field4241++;
        class59.method472((byte) -124);
        class77.method632(0);
        class32.method229(23633);
        class94.method732((byte) 63);
        class330.method2286((byte) 28);
        class320.method2227(124);
        class52.method436(64);
        class102.method790(arg0 ^ 0x69);
        class302.method2132((byte) 95);
        client.method341((byte) -52);
        class315.method2198(arg0 + 579);
        class36.method265((byte) 123);
        class335.method2366(false);
        class157.method1134(false);
        class67.method549(8334);
        if (class59.field870 != 0) {
            for (int var1 = 0; var1 < class206.field3017.length; var1++) {
                class206.field3017[var1] = null;
            }
            class200.field2908 = 0;
        }
        class334.method2357(true);
        if (arg0 != 82) {
            method2034((byte) -105);
        }
        class64.method525(true);
        class298.method2119((byte) 1);
        class277.method2023(0);
        class67.field972.method462(arg0 ^ 0x4A);
        if (!class141.field2031) {
            ((class71) class345.field5336).method567(true);
        }
        class119.field1683.method545((byte) -82);
        class197.field2854.method2537((byte) -119);
        class285.field4301.method2537((byte) -123);
        class132.field1935.method2537((byte) -119);
        class253.field3785.method2537((byte) -119);
        class244.field3640.method2537((byte) -119);
        class332.field5085.method2537((byte) -121);
        class307.field4597.method2537((byte) -126);
        class216.field3184.method2537((byte) -127);
        class322.field4851.method2537((byte) -121);
        class19.field307.method2537((byte) -123);
        class290.field4386.method2537((byte) -123);
        class259.field3868.method462(24);
        class360.field5679.method462(24);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILnm;I)Lra;", line = 193)
    public final class189 method2040(int arg0, class201 arg1, int arg2) {
        class189 var4 = new class189();
        var4.field2701 = arg1;
        field4234++;
        var4.field2697 = 3;
        var4.field108 = false;
        var4.field1122 = (long) arg0;
        if (arg2 != -1760) {
            this.field4248 = false;
        }
        this.method2036(112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "run", descriptor = "()V", line = 220)
    public final void run() {
        while (!this.field4248) {
            class342 var1 = this.field4245;
            class189 var2;
            synchronized (this.field4245) {
                var2 = (class189) this.field4245.method2390((byte) 99);
                if (var2 == null) {
                    try {
                        this.field4245.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4249--;
            }
            try {
                if (var2.field2697 == 2) {
                    var2.field2701.method1463(var2.field2699, var2.field2699.length, (int) var2.field1122, true);
                } else if (var2.field2697 == 3) {
                    var2.field2699 = var2.field2701.method1461((int) var2.field1122, -90);
                }
            } catch (Exception var6) {
                class343.method2402((String) null, var6, -2);
            }
            var2.field118 = false;
        }
        field4233++;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 281)
    public class279() {
        class210 var1 = class54.field787.method490(2, 5, this);
        while (var1.field3056 == 0) {
            class184.method1283(10L, 10);
        }
        if (var1.field3056 == 2) {
            throw new RuntimeException();
        }
        this.field4247 = (Thread) var1.field3058;
    }
}
