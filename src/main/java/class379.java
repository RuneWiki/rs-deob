import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class379 implements Runnable {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lsc;")
    private class347 field5192 = new class347();

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
    private boolean field5196 = false;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public int field5198 = 0;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field5197;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ldh;")
    public static class320 field5191 = new class320(59, -2);

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Ldh;")
    public static class320 field5195 = new class320(82, 5);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "D")
    public static double field5186;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILrfa;)Lsa;", line = 5)
    public final class204 method2328(int arg0, int arg1, class199 arg2) {
        field5187++;
        class204 var4 = new class204();
        var4.field2412 = 1;
        class347 var5 = this.field5192;
        synchronized (this.field5192) {
            if (arg0 != 3) {
                method2334(-84);
            }
            class204 var6 = (class204) this.field5192.method2067(22462);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field8919 && var6.field2408 == arg2 && var6.field2412 == 2) {
                    var4.field2411 = var6.field2411;
                    var4.field6563 = false;
                    return var4;
                }
                var6 = (class204) this.field5192.method2066(arg0 ^ 0x3);
            }
        }
        var4.field2411 = arg2.method1202(arg1, arg0 ^ 0x1);
        var4.field6563 = false;
        var4.field6561 = true;
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BLrfa;Z)Lsa;", line = 41)
    public final class204 method2329(int arg0, byte[] arg1, class199 arg2, boolean arg3) {
        field5188++;
        class204 var5 = new class204();
        var5.field2408 = arg2;
        var5.field2411 = arg1;
        var5.field8919 = arg0;
        var5.field2412 = 2;
        var5.field6561 = arg3;
        this.method2331(var5, -19179);
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 57)
    public final void method2330(int arg0) {
        field5190++;
        this.field5196 = true;
        class347 var2 = this.field5192;
        synchronized (this.field5192) {
            this.field5192.notifyAll();
        }
        try {
            int var3 = -85 / ((arg0 + 30) / 43);
            this.field5197.join();
        } catch (InterruptedException var4) {
        }
        this.field5197 = null;
    }

    @OriginalMember(owner = "client!oj", name = "run", descriptor = "()V", line = 76)
    public final void run() {
        field5193++;
        while (!this.field5196) {
            class347 var1 = this.field5192;
            class204 var2;
            synchronized (this.field5192) {
                var2 = (class204) this.field5192.method2070(-13418);
                if (var2 == null) {
                    try {
                        this.field5192.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5198--;
            }
            try {
                if (var2.field2412 == 2) {
                    var2.field2408.method1203((int) var2.field8919, 1, var2.field2411, var2.field2411.length);
                } else if (var2.field2412 == 3) {
                    var2.field2411 = var2.field2408.method1202((int) var2.field8919, 2);
                }
            } catch (Exception var6) {
                class151.method936(null, var6, 67);
            }
            var2.field6563 = false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lsa;I)V", line = 121)
    private final void method2331(class204 arg0, int arg1) {
        field5194++;
        class347 var3 = this.field5192;
        synchronized (this.field5192) {
            if (arg1 != -19179) {
                field5191 = null;
            }
            this.field5192.method2068(arg1 + 19051, arg0);
            this.field5198++;
            this.field5192.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lnr;", line = 137)
    public static final class57 method2332(int arg0) {
        field5185++;
        if (arg0 != -1) {
            field5186 = -0.4875939265897158D;
        }
        try {
            return new class121();
        } catch (Throwable var2) {
            try {
                return (class57) Class.forName("hv").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class129();
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lrfa;II)Lsa;", line = 161)
    public final class204 method2333(class199 arg0, int arg1, int arg2) {
        field5189++;
        if (arg2 != 28276) {
            this.method2328(-1, -61, null);
        }
        class204 var4 = new class204();
        var4.field2412 = 3;
        var4.field2408 = arg0;
        var4.field8919 = arg1;
        var4.field6561 = false;
        this.method2331(var4, -19179);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 188)
    public static void method2334(int arg0) {
        if (arg0 < -64) {
            field5191 = null;
            field5195 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lgh;)V", line = 214)
    public class379(class546 arg0) {
        class290 var2 = arg0.method3215(5, this, 2);
        while (var2.field3573 == 0) {
            class524.method3076(1, 10L);
        }
        if (var2.field3573 == 2) {
            throw new RuntimeException();
        }
        this.field5197 = (Thread) var2.field3577;
    }
}
