import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class617 implements Runnable {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ljh;")
    private class158 field8914 = new class158();

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public int field8921 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Z")
    private boolean field8918 = false;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field8923;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field8922 = -1;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field8924 = 0;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
    public static boolean field8925 = false;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILpk;Z)Ljba;", line = 5)
    public final class396 method3573(int arg0, class195 arg1, boolean arg2) {
        field8915++;
        class396 var4 = new class396();
        var4.field3211 = arg0;
        var4.field2339 = arg2;
        var4.field5546 = 3;
        var4.field5541 = arg1;
        this.method3575((byte) -107, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLpk;I)Ljba;", line = 20)
    public final class396 method3574(byte arg0, class195 arg1, int arg2) {
        field8916++;
        if (arg0 >= -48) {
            this.method3577(false);
        }
        class396 var4 = new class396();
        var4.field5546 = 1;
        class158 var5 = this.field8914;
        synchronized (this.field8914) {
            class396 var6 = (class396) this.field8914.method1196(-119);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field3211 && var6.field5541 == arg1 && var6.field5546 == 2) {
                    var4.field2336 = false;
                    var4.field5538 = var6.field5538;
                    return var4;
                }
                var6 = (class396) this.field8914.method1204(false);
            }
        }
        var4.field5538 = arg1.method1369((byte) -79, arg2);
        var4.field2336 = false;
        var4.field2339 = true;
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lvk;)V", line = 171)
    public class617(class367 arg0) {
        class637 var2 = arg0.method2295(5, (byte) 55, this);
        while (var2.field9091 == 0) {
            class246.method1639(10L, (byte) -56);
        }
        if (var2.field9091 == 2) {
            throw new RuntimeException();
        }
        this.field8923 = (Thread) var2.field9093;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjba;)V", line = 63)
    private final void method3575(byte arg0, class396 arg1) {
        field8919++;
        class158 var3 = this.field8914;
        synchronized (this.field8914) {
            this.field8914.method1203(arg1, -101);
            this.field8921++;
            if (arg0 < -13) {
                this.field8914.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpk;[BII)Ljba;", line = 78)
    public final class396 method3576(class195 arg0, byte[] arg1, int arg2, int arg3) {
        field8913++;
        class396 var5 = new class396();
        var5.field5541 = arg0;
        var5.field2339 = false;
        var5.field5538 = arg1;
        if (arg2 == -1) {
            var5.field3211 = arg3;
            var5.field5546 = 2;
            this.method3575((byte) -64, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        field8917++;
        while (!this.field8918) {
            class158 var1 = this.field8914;
            class396 var2;
            synchronized (this.field8914) {
                var2 = (class396) this.field8914.method1200(false);
                if (var2 == null) {
                    try {
                        this.field8914.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field8921--;
            }
            try {
                if (var2.field5546 == 2) {
                    var2.field5541.method1367(var2.field5538, (int) var2.field3211, (byte) -14, var2.field5538.length);
                } else if (var2.field5546 == 3) {
                    var2.field5538 = var2.field5541.method1369((byte) -126, (int) var2.field3211);
                }
            } catch (Exception var6) {
                class621.method3591(null, var6, (byte) -110);
            }
            var2.field2336 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 143)
    public final void method3577(boolean arg0) {
        field8920++;
        this.field8918 = arg0;
        class158 var2 = this.field8914;
        synchronized (this.field8914) {
            this.field8914.notifyAll();
        }
        try {
            this.field8923.join();
        } catch (InterruptedException var3) {
        }
        this.field8923 = null;
    }
}
