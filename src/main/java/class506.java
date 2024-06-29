import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class506 implements Runnable {

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lmc;")
    private class384 field7543 = new class384();

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public int field7544 = 0;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
    private boolean field7547 = false;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field7546;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public static boolean field7545 = false;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Z")
    public static boolean field7536;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLdea;)V", line = 6)
    private final void method3030(byte arg0, class406 arg1) {
        field7541++;
        class384 var3 = this.field7543;
        synchronized (this.field7543) {
            this.field7543.method2331(2, arg1);
            this.field7544++;
            this.field7543.notifyAll();
            if (arg0 != 35) {
                this.field7547 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[BLsaa;I)Ldea;", line = 23)
    public final class406 method3031(int arg0, byte[] arg1, class18 arg2, int arg3) {
        field7537++;
        class406 var5 = new class406();
        var5.field5822 = 2;
        var5.field5824 = arg1;
        var5.field5830 = arg2;
        var5.field8204 = arg0;
        var5.field9006 = false;
        if (arg3 != -3) {
            this.field7544 = -96;
        }
        this.method3030((byte) 35, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lsaa;II)Ldea;", line = 43)
    public final class406 method3032(class18 arg0, int arg1, int arg2) {
        field7539++;
        class406 var4 = new class406();
        if (arg1 != 10) {
            this.method3031(61, null, null, 66);
        }
        var4.field8204 = arg2;
        var4.field5822 = 3;
        var4.field9006 = false;
        var4.field5830 = arg0;
        this.method3030((byte) 35, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lsaa;II)Ldea;", line = 61)
    public final class406 method3033(class18 arg0, int arg1, int arg2) {
        field7540++;
        class406 var4 = new class406();
        var4.field5822 = 1;
        class384 var5 = this.field7543;
        synchronized (this.field7543) {
            class406 var6 = (class406) this.field7543.method2333(-1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field8204 && var6.field5830 == arg0 && var6.field5822 == 2) {
                    var4.field9003 = false;
                    var4.field5824 = var6.field5824;
                    return var4;
                }
                var6 = (class406) this.field7543.method2327(10005);
            }
        }
        var4.field5824 = arg0.method83((byte) -15, arg1);
        var4.field9003 = false;
        var4.field9006 = true;
        return arg2 == -28669 ? var4 : null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 97)
    public final void method3034(int arg0) {
        field7538++;
        this.field7547 = true;
        class384 var2 = this.field7543;
        synchronized (this.field7543) {
            this.field7543.notifyAll();
        }
        try {
            this.field7546.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 0) {
            this.field7547 = true;
        }
        this.field7546 = null;
    }

    @OriginalMember(owner = "client!dk", name = "run", descriptor = "()V", line = 118)
    public final void run() {
        while (!this.field7547) {
            class384 var1 = this.field7543;
            class406 var2;
            synchronized (this.field7543) {
                var2 = (class406) this.field7543.method2332(false);
                if (var2 == null) {
                    try {
                        this.field7543.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field7544--;
            }
            try {
                if (var2.field5822 == 2) {
                    var2.field5830.method86(-17307, var2.field5824.length, (int) var2.field8204, var2.field5824);
                } else if (var2.field5822 == 3) {
                    var2.field5824 = var2.field5830.method83((byte) -48, (int) var2.field8204);
                }
            } catch (Exception var7) {
                class31.method140(null, -111, var7);
            }
            var2.field9003 = false;
        }
        field7542++;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Luf;)V", line = 178)
    public class506(class353 arg0) {
        class286 var2 = arg0.method2159(5, (byte) 26, this);
        while (var2.field4208 == 0) {
            class428.method2624(1, 10L);
        }
        if (var2.field4208 == 2) {
            throw new RuntimeException();
        }
        this.field7546 = (Thread) var2.field4213;
    }
}
