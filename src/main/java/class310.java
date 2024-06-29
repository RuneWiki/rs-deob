import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class310 implements Runnable {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lvv;")
    private class531 field4211 = new class531();

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
    private boolean field4219 = false;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public int field4221 = 0;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field4217;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "[I")
    public static int[] field4215 = new int[256];

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Ldk;")
    public static class421 field4218;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILro;[BB)Lmu;", line = 3)
    public final class342 method1789(int arg0, class126 arg1, byte[] arg2, byte arg3) {
        field4220++;
        class342 var5 = new class342();
        var5.field4125 = false;
        var5.field4946 = arg1;
        if (arg3 != 94) {
            return null;
        }
        var5.field4944 = arg2;
        var5.field4945 = 2;
        var5.field3883 = arg0;
        this.method1791(5, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ep", name = "run", descriptor = "()V", line = 26)
    public final void run() {
        while (!this.field4219) {
            class531 var1 = this.field4211;
            class342 var2;
            synchronized (this.field4211) {
                var2 = (class342) this.field4211.method3148(true);
                if (var2 == null) {
                    try {
                        this.field4211.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field4221--;
            }
            try {
                if (var2.field4945 == 2) {
                    var2.field4946.method912(var2.field4944.length, 65280, (int) var2.field3883, var2.field4944);
                } else if (var2.field4945 == 3) {
                    var2.field4944 = var2.field4946.method910((int) var2.field3883, -76);
                }
            } catch (Exception var7) {
                class187.method1255(var7, null, -121);
            }
            var2.field4123 = false;
        }
        field4216++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILro;I)Lmu;", line = 70)
    public final class342 method1790(int arg0, class126 arg1, int arg2) {
        field4212++;
        class342 var4 = new class342();
        var4.field4946 = arg1;
        var4.field4125 = false;
        var4.field4945 = 3;
        var4.field3883 = arg2;
        this.method1791(5, var4);
        if (arg0 != 1120) {
            field4218 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lor;)V", line = 185)
    public class310(class173 arg0) {
        class464 var2 = arg0.method1182(this, (byte) -121, 5);
        while (var2.field6699 == 0) {
            class334.method2047(10L, 0);
        }
        if (var2.field6699 == 2) {
            throw new RuntimeException();
        }
        this.field4217 = (Thread) var2.field6695;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILmu;)V", line = 98)
    private final void method1791(int arg0, class342 arg1) {
        field4213++;
        class531 var3 = this.field4211;
        synchronized (this.field4211) {
            this.field4211.method3150(16711680, arg1);
            this.field4221++;
            if (arg0 != 5) {
                method1793(22);
            }
            this.field4211.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILro;)Lmu;", line = 113)
    public final class342 method1792(int arg0, int arg1, class126 arg2) {
        field4210++;
        class342 var4 = new class342();
        var4.field4945 = 1;
        class531 var5 = this.field4211;
        synchronized (this.field4211) {
            class342 var6 = (class342) this.field4211.method3152(false);
            while (true) {
                if (var6 == null) {
                    int var8 = -21 / ((arg0 - 32) / 41);
                    break;
                }
                if (((long) arg1) == var6.field3883 && var6.field4946 == arg2 && var6.field4945 == 2) {
                    var4.field4944 = var6.field4944;
                    var4.field4123 = false;
                    return var4;
                }
                var6 = (class342) this.field4211.method3153((byte) -80);
            }
        }
        var4.field4944 = arg2.method910(arg1, -22);
        var4.field4123 = false;
        var4.field4125 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 146)
    public static void method1793(int arg0) {
        field4215 = null;
        field4218 = null;
        if (arg0 < 118) {
            method1793(0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 167)
    public final void method1794(boolean arg0) {
        this.field4219 = arg0;
        field4214++;
        class531 var2 = this.field4211;
        synchronized (this.field4211) {
            this.field4211.notifyAll();
        }
        try {
            this.field4217.join();
        } catch (InterruptedException var3) {
        }
        this.field4217 = null;
    }
}
