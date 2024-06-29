import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class214 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lwg;")
    private class277 field3385 = new class277();

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field3389 = 0;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Z")
    private boolean field3390 = false;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3392;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3386 = 1;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Z")
    public static boolean field3388 = false;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILch;B)Lhb;", line = 5)
    public final class142 method1428(int arg0, class33 arg1, byte arg2) {
        field3391++;
        class142 var4 = new class142();
        var4.field2258 = 1;
        class277 var5 = this.field3385;
        synchronized (this.field3385) {
            class142 var6 = (class142) this.field3385.method1826(-112);
            if (arg2 < 92) {
                return (class142) null;
            }
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field4938 && var6.field2252 == arg1 && var6.field2258 == 2) {
                    var4.field2254 = var6.field2254;
                    var4.field2528 = false;
                    return var4;
                }
                var6 = (class142) this.field3385.method1823((byte) -128);
            }
        }
        var4.field2254 = arg1.method249(arg0, 6);
        var4.field2528 = false;
        var4.field2523 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(ILch;B)Lhb;", line = 48)
    public final class142 method1429(int arg0, class33 arg1, byte arg2) {
        class142 var4 = new class142();
        var4.field4938 = (long) arg0;
        if (arg2 < 94) {
            this.method1433((class142) null, (byte) -107);
        }
        var4.field2258 = 3;
        var4.field2523 = false;
        var4.field2252 = arg1;
        field3382++;
        this.method1433(var4, (byte) 48);
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 66)
    public final void method1430(int arg0) {
        field3387++;
        this.field3390 = true;
        class277 var2 = this.field3385;
        synchronized (this.field3385) {
            if (arg0 <= 68) {
                this.field3389 = -38;
            }
            this.field3385.notifyAll();
        }
        try {
            this.field3392.join();
        } catch (InterruptedException var5) {
        }
        this.field3392 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIII)V", line = 89)
    public static final void method1431(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class265.field4095.field4679 = 0;
        class265.field4095.method2034(-46, 20);
        class265.field4095.method2034(arg1 - 159, arg0);
        class265.field4095.method2034(-68, arg3);
        if (arg1 != 48) {
            field3388 = false;
        }
        field3384++;
        class265.field4095.method2044(1247686728, arg2);
        class265.field4095.method2044(1247686728, arg4);
        class285.field4375 = -3;
        class286.field4385 = 0;
        class109.field1693 = 0;
        class19.field265 = 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BLch;B)Lhb;", line = 110)
    public final class142 method1432(int arg0, byte[] arg1, class33 arg2, byte arg3) {
        class142 var5 = new class142();
        var5.field2523 = false;
        if (arg3 != 85) {
            return (class142) null;
        }
        var5.field2258 = 2;
        var5.field2252 = arg2;
        var5.field2254 = arg1;
        field3381++;
        var5.field4938 = (long) arg0;
        this.method1433(var5, (byte) 69);
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        field3383++;
        while (!this.field3390) {
            class277 var1 = this.field3385;
            class142 var2;
            synchronized (this.field3385) {
                var2 = (class142) this.field3385.method1825((byte) 86);
                if (var2 == null) {
                    try {
                        this.field3385.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3389--;
            }
            try {
                if (var2.field2258 == 2) {
                    var2.field2252.method246(var2.field2254.length, 26115, var2.field2254, (int) var2.field4938);
                } else if (var2.field2258 == 3) {
                    var2.field2254 = var2.field2252.method249((int) var2.field4938, 6);
                }
            } catch (Exception var6) {
                class291.method1892((String) null, var6, -2);
            }
            var2.field2528 = false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lhb;B)V", line = 173)
    private final void method1433(class142 arg0, byte arg1) {
        field3380++;
        int var3 = 3 % ((arg1 + 91) / 34);
        class277 var4 = this.field3385;
        synchronized (this.field3385) {
            this.field3385.method1824(arg0, (byte) 105);
            this.field3389++;
            this.field3385.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 202)
    public class214() {
        class252 var1 = class89.field1359.method1515(5, (byte) -5, this);
        while (var1.field3931 == 0) {
            class96.method657(10L, (byte) -115);
        }
        if (var1.field3931 == 2) {
            throw new RuntimeException();
        }
        this.field3392 = (Thread) var1.field3929;
    }
}
