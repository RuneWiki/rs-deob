import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lfk;")
    private class393 field2067 = new class393();

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Z")
    private boolean field2074 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field2076 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2073;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    public static int[] field2064 = new int[50];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!cl", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2074) {
            class393 var1 = this.field2067;
            class392 var2;
            synchronized (this.field2067) {
                var2 = (class392) this.field2067.method2481((byte) -78);
                if (var2 == null) {
                    try {
                        this.field2067.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2076--;
            }
            try {
                if (var2.field5613 == 2) {
                    var2.field5608.method713((int) var2.field6253, var2.field5616.length, var2.field5616, 105);
                } else if (var2.field5613 == 3) {
                    var2.field5616 = var2.field5608.method712((int) var2.field6253, (byte) 121);
                }
            } catch (Exception var6) {
                class271.method1776(-2296, var6, (String) null);
            }
            var2.field2254 = false;
        }
        field2068++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lr;II)Lrs;")
    public final class392 method989(class99 arg0, int arg1, int arg2) {
        field2072++;
        class392 var4 = new class392();
        var4.field2257 = false;
        var4.field6253 = (long) arg1;
        var4.field5613 = 3;
        var4.field5608 = arg0;
        if (arg2 != 0) {
            this.run();
        }
        this.method991(var4, arg2 ^ 0x77);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILr;B)Lrs;")
    public final class392 method990(int arg0, class99 arg1, byte arg2) {
        field2075++;
        class392 var4 = new class392();
        var4.field5613 = 1;
        class393 var5 = this.field2067;
        synchronized (this.field2067) {
            class392 var6 = (class392) this.field2067.method2482(-102);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field6253 && var6.field5608 == arg1 && var6.field5613 == 2) {
                    var4.field5616 = var6.field5616;
                    var4.field2254 = false;
                    return var4;
                }
                var6 = (class392) this.field2067.method2476(1);
            }
        }
        var4.field5616 = arg1.method712(arg0, (byte) 124);
        var4.field2257 = true;
        var4.field2254 = false;
        return arg2 >= -70 ? null : var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lrs;I)V")
    private final void method991(class392 arg0, int arg1) {
        class393 var3 = this.field2067;
        synchronized (this.field2067) {
            this.field2067.method2478(arg0, false);
            this.field2076++;
            this.field2067.notifyAll();
        }
        if (arg1 > 79) {
            field2069++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        field2064 = null;
        if (arg0 != 3) {
            method992(107);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public final void method993(int arg0) {
        field2070++;
        this.field2074 = true;
        class393 var2 = this.field2067;
        synchronized (this.field2067) {
            this.field2067.notifyAll();
        }
        try {
            this.field2073.join();
            if (arg0 != -4422) {
                this.method989((class99) null, 120, -38);
            }
        } catch (InterruptedException var3) {
        }
        this.field2073 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lko;)V")
    public class145(class294 arg0) {
        class283 var2 = arg0.method1916((byte) -63, 5, this);
        while (var2.field3998 == 0) {
            class349.method2219(10L, -46);
        }
        if (var2.field3998 == 2) {
            throw new RuntimeException();
        }
        this.field2073 = (Thread) var2.field3999;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[BLr;I)Lrs;")
    public final class392 method994(int arg0, byte[] arg1, class99 arg2, int arg3) {
        field2071++;
        class392 var5 = new class392();
        var5.field2257 = false;
        if (arg0 != 7383) {
            this.field2074 = true;
        }
        var5.field5616 = arg1;
        var5.field5613 = 2;
        var5.field6253 = (long) arg3;
        var5.field5608 = arg2;
        this.method991(var5, 118);
        return var5;
    }
}
