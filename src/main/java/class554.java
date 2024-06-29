import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class554 implements Runnable {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lut;")
    private class719 field7056 = new class719();

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field7062 = 0;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
    private boolean field7061 = false;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field7063;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILcr;I[B)Lpq;")
    public final class423 method3009(int arg0, class310 arg1, int arg2, byte[] arg3) {
        field7059++;
        class423 var5 = new class423();
        var5.field2278 = arg2;
        int var6 = 122 % ((17 - arg0) / 61);
        var5.field5568 = arg3;
        var5.field5574 = 2;
        var5.field10776 = false;
        var5.field5573 = arg1;
        this.method3014((byte) -99, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILcr;I)Lpq;")
    public final class423 method3010(int arg0, class310 arg1, int arg2) {
        field7060++;
        class423 var4 = new class423();
        if (arg2 != -1) {
            this.field7061 = true;
        }
        var4.field5574 = 1;
        class719 var5 = this.field7056;
        synchronized (this.field7056) {
            class423 var6 = (class423) this.field7056.method3855(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field2278 && var6.field5573 == arg1 && var6.field5574 == 2) {
                    var4.field5568 = var6.field5568;
                    var4.field10779 = false;
                    return var4;
                }
                var6 = (class423) this.field7056.method3861(true);
            }
        }
        var4.field5568 = arg1.method1826(arg0, 125);
        var4.field10776 = true;
        var4.field10779 = false;
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method3011(int arg0) {
        int var2 = 17 % ((61 - arg0) / 60);
        field7064++;
        this.field7061 = true;
        class719 var3 = this.field7056;
        synchronized (this.field7056) {
            this.field7056.notifyAll();
        }
        try {
            this.field7063.join();
        } catch (InterruptedException var4) {
        }
        this.field7063 = null;
    }

    @OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
    public final void run() {
        field7054++;
        while (!this.field7061) {
            class719 var1 = this.field7056;
            class423 var2;
            synchronized (this.field7056) {
                var2 = (class423) this.field7056.method3859(0);
                if (var2 == null) {
                    try {
                        this.field7056.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field7062--;
            }
            try {
                if (var2.field5574 == 2) {
                    var2.field5573.method1827(var2.field5568.length, (int) var2.field2278, -26844, var2.field5568);
                } else if (var2.field5574 == 3) {
                    var2.field5568 = var2.field5573.method1826((int) var2.field2278, 105);
                }
            } catch (Exception var6) {
                class416.method2401(1, var6, null);
            }
            var2.field10779 = false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
    public static final boolean method3012(int arg0, int arg1) {
        field7057++;
        if (arg0 == -31703) {
            return arg1 == 52 || arg1 == 9 || arg1 == 1012 || arg1 == 45 || arg1 == 18;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILcr;)Lpq;")
    public final class423 method3013(int arg0, int arg1, class310 arg2) {
        field7058++;
        class423 var4 = new class423();
        var4.field10776 = false;
        var4.field5573 = arg2;
        var4.field2278 = arg1;
        var4.field5574 = arg0;
        this.method3014((byte) 114, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLpq;)V")
    private final void method3014(byte arg0, class423 arg1) {
        class719 var3 = this.field7056;
        synchronized (this.field7056) {
            this.field7056.method3862(arg1, false);
            this.field7062++;
            this.field7056.notifyAll();
        }
        field7055++;
        int var4 = -13 / ((arg0 - 53) / 57);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Loq;)V")
    public class554(class775 arg0) {
        class339 var2 = arg0.method4248(this, 0, 5);
        while (var2.field4144 == 0) {
            class591.method3181(10L, 0);
        }
        if (var2.field4144 == 2) {
            throw new RuntimeException();
        }
        this.field7063 = (Thread) var2.field4142;
    }
}
