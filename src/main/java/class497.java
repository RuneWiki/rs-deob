import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class497 implements Runnable {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lrda;")
    private class620 field6669 = new class620();

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field6673 = 0;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    private boolean field6679 = false;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field6678;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    public static boolean field6672 = false;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field6676 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field6671++;
        while (!this.field6679) {
            class620 var1 = this.field6669;
            class515 var2;
            synchronized (this.field6669) {
                var2 = (class515) this.field6669.method3392((byte) 54);
                if (var2 == null) {
                    try {
                        this.field6669.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6673--;
            }
            try {
                if (var2.field6875 == 2) {
                    var2.field6874.method3811(5, var2.field6880.length, (int) var2.field207, var2.field6880);
                } else if (var2.field6875 == 3) {
                    var2.field6880 = var2.field6874.method3814(true, (int) var2.field207);
                }
            } catch (Exception var6) {
                class259.method1586(var6, null, (byte) 8);
            }
            var2.field6415 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lii;)V", line = 190)
    public class497(class519 arg0) {
        class192 var2 = arg0.method2904(this, 5, (byte) 108);
        while (var2.field2816 == 0) {
            class486.method2722(0, 10L);
        }
        if (var2.field2816 == 2) {
            throw new RuntimeException();
        }
        this.field6678 = (Thread) var2.field2820;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILcc;I)Llba;", line = 58)
    public final class515 method2753(int arg0, class685 arg1, int arg2) {
        field6675++;
        class515 var4 = new class515();
        var4.field6416 = false;
        var4.field6875 = arg0;
        var4.field207 = arg2;
        var4.field6874 = arg1;
        this.method2755(arg0 - 12066, var4);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(ILcc;I)Llba;", line = 75)
    public final class515 method2754(int arg0, class685 arg1, int arg2) {
        field6677++;
        class515 var4 = new class515();
        var4.field6875 = 1;
        class620 var5 = this.field6669;
        synchronized (this.field6669) {
            class515 var6 = (class515) this.field6669.method3390((byte) 104);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field207 && var6.field6874 == arg1 && var6.field6875 == 2) {
                    var4.field6415 = false;
                    var4.field6880 = var6.field6880;
                    return var4;
                }
                var6 = (class515) this.field6669.method3401(-10265);
            }
        }
        var4.field6880 = arg1.method3814(true, arg2);
        int var8 = 70 % ((arg0 - 58) / 44);
        var4.field6416 = true;
        var4.field6415 = false;
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILlba;)V", line = 110)
    private final void method2755(int arg0, class515 arg1) {
        if (arg0 != -12063) {
            this.field6679 = false;
        }
        class620 var3 = this.field6669;
        synchronized (this.field6669) {
            this.field6669.method3396(arg1, -1);
            this.field6673++;
            this.field6669.notifyAll();
        }
        field6670++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 125)
    public final void method2756(boolean arg0) {
        field6680++;
        this.field6679 = true;
        class620 var2 = this.field6669;
        synchronized (this.field6669) {
            this.field6669.notifyAll();
            if (arg0) {
                this.field6678 = null;
            }
        }
        try {
            this.field6678.join();
        } catch (InterruptedException var3) {
        }
        this.field6678 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 146)
    public static void method2757(int arg0) {
        if (arg0 == 24508) {
            field6676 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lcc;I[BI)Llba;", line = 171)
    public final class515 method2758(class685 arg0, int arg1, byte[] arg2, int arg3) {
        field6674++;
        class515 var5 = new class515();
        var5.field6875 = arg3;
        var5.field207 = arg1;
        var5.field6880 = arg2;
        var5.field6416 = false;
        var5.field6874 = arg0;
        this.method2755(-12063, var5);
        return var5;
    }
}
