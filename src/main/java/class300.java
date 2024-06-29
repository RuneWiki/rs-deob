import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class300 implements Runnable {

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lrr;")
    private class199 field4308 = new class199();

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field4314 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
    private boolean field4312 = false;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field4313;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field4310 = 2;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4295 = "K";

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field4309 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lop;")
    public static class353 field4293 = new class353(64);

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field4315 = -1;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lqj;")
    public static class238 field4299;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lj;")
    public static class269 field4316;

    // $FF: synthetic field
    @OriginalMember(owner = "client!je", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field4319;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
    public static int[] field4317;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[[B")
    public static byte[][] field4292;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[[[B")
    public static byte[][][] field4296;

    // $FF: synthetic method
    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1905(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1894(int arg0, byte arg1) {
        class142.field1873 = arg0;
        field4297++;
        if (arg1 >= -56) {
            return;
        }
        class24 var2 = class197.field2822;
        synchronized (class197.field2822) {
            class197.field2822.method212(-126);
        }
        class24 var3 = class104.field1396;
        synchronized (class104.field1396) {
            class104.field1396.method212(-106);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 25)
    public static final void method1895(int arg0) {
        field4298++;
        for (class370 var1 = (class370) class370.field5503.method2649(0); var1 != null; var1 = (class370) class370.field5503.method2656(0)) {
            if (var1.field5494 > 0) {
                var1.field5494--;
            }
            if (var1.field5494 != 0) {
                if (var1.field5502 > 0) {
                    var1.field5502--;
                }
                if (var1.field5502 == 0 && var1.field5498 >= 1 && var1.field5490 >= 1 && (class324.field4652 - 2) >= var1.field5498 && class336.field4964 - 2 >= var1.field5490 && (var1.field5500 < 0 || class336.method2227(var1.field5500, 22693, var1.field5492))) {
                    class417.method2689(var1.field5507, var1.field5505, var1.field5490, -1, var1.field5506, var1.field5498, var1.field5500, var1.field5492, -101);
                    var1.field5502 = -1;
                    if (var1.field5500 == var1.field5493 && var1.field5493 == -1) {
                        var1.method2574((byte) 120);
                    } else if (var1.field5500 == var1.field5493 && var1.field5506 == var1.field5491 && var1.field5497 == var1.field5492) {
                        var1.method2574((byte) 121);
                    }
                }
            } else if (var1.field5493 < 0 || class336.method2227(var1.field5493, arg0 ^ 0xFFFFA758, var1.field5497)) {
                class417.method2689(var1.field5507, var1.field5505, var1.field5490, -1, var1.field5491, var1.field5498, var1.field5493, var1.field5497, 89);
                var1.method2574((byte) 122);
            }
        }
        if (arg0 != -3) {
            field4299 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 93)
    public static final void method1896(int arg0) {
        if (class2.field22 == 2) {
            class160.field2099 = 96;
        } else {
            try {
                Method var1 = (field4319 == null ? (field4319 = method1905("java.lang.Runtime")) : field4319).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class160.field2099 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 == 1) {
            field4311++;
        }
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V", line = 127)
    public final void run() {
        while (!this.field4312) {
            class199 var1 = this.field4308;
            class75 var2;
            synchronized (this.field4308) {
                var2 = (class75) this.field4308.method1243((byte) 67);
                if (var2 == null) {
                    try {
                        this.field4308.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4314--;
            }
            try {
                if (var2.field1007 == 2) {
                    var2.field1012.method2729((int) var2.field3305, var2.field1018.length, var2.field1018, -1);
                } else if (var2.field1007 == 3) {
                    var2.field1018 = var2.field1012.method2732((byte) -4, (int) var2.field3305);
                }
            } catch (Exception var6) {
                class226.method1406((String) null, var6, 0);
            }
            var2.field5481 = false;
        }
        field4300++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I", line = 173)
    public static final int method1897(byte arg0) {
        if (arg0 < 6) {
            return 116;
        } else {
            field4305++;
            return class295.field4256;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 190)
    public static final void method1898(int arg0) {
        field4294++;
        if (arg0 != 1) {
            field4307 = 27;
        }
        if (class137.field1815 == 10) {
            class199.method1251(28, (byte) 9);
        }
        if (class137.field1815 == 30) {
            class199.method1251(25, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 207)
    public final void method1899(int arg0) {
        this.field4312 = true;
        field4303++;
        class199 var2 = this.field4308;
        synchronized (this.field4308) {
            this.field4308.notifyAll();
        }
        try {
            this.field4313.join();
        } catch (InterruptedException var3) {
        }
        this.field4313 = null;
        if (arg0 != -17566) {
            field4292 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjb;I[B)Llq;", line = 228)
    public final class75 method1900(int arg0, class425 arg1, int arg2, byte[] arg3) {
        field4301++;
        class75 var5 = new class75();
        if (arg2 != -31152) {
            method1895(-121);
        }
        var5.field1012 = arg1;
        var5.field1018 = arg3;
        var5.field5480 = false;
        var5.field3305 = (long) arg0;
        var5.field1007 = 2;
        this.method1903((byte) -108, var5);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 249)
    public static void method1901(byte arg0) {
        field4296 = null;
        if (arg0 != -61) {
            method1896(-41);
        }
        field4299 = null;
        field4317 = null;
        field4293 = null;
        field4292 = null;
        field4295 = null;
        field4316 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BILjb;)Llq;", line = 271)
    public final class75 method1902(byte arg0, int arg1, class425 arg2) {
        field4302++;
        class75 var4 = new class75();
        var4.field1007 = 1;
        class199 var5 = this.field4308;
        synchronized (this.field4308) {
            class75 var6 = (class75) this.field4308.method1252(arg0 ^ 0x49);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field3305 && var6.field1012 == arg2 && var6.field1007 == 2) {
                    var4.field1018 = var6.field1018;
                    var4.field5481 = false;
                    return var4;
                }
                var6 = (class75) this.field4308.method1249(arg0 - 15);
            }
        }
        var4.field1018 = arg2.method2732((byte) -4, arg1);
        var4.field5481 = false;
        var4.field5480 = true;
        return arg0 == -49 ? var4 : null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lud;)V", line = 359)
    public class300(class2 arg0) {
        class296 var2 = arg0.method25((byte) 107, this, 5);
        while (var2.field4259 == 0) {
            class404.method2628(-56, 10L);
        }
        if (var2.field4259 == 2) {
            throw new RuntimeException();
        }
        this.field4313 = (Thread) var2.field4262;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLlq;)V", line = 317)
    private final void method1903(byte arg0, class75 arg1) {
        class199 var3 = this.field4308;
        synchronized (this.field4308) {
            this.field4308.method1244(arg1, -26);
            this.field4314++;
            this.field4308.notifyAll();
        }
        field4304++;
        if (arg0 >= -87) {
            field4299 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILjb;)Llq;", line = 332)
    public final class75 method1904(int arg0, int arg1, class425 arg2) {
        field4306++;
        class75 var4 = new class75();
        var4.field3305 = (long) arg1;
        var4.field5480 = false;
        var4.field1012 = arg2;
        var4.field1007 = arg0;
        this.method1903((byte) -102, var4);
        return var4;
    }
}
