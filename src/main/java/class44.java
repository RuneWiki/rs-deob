import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lgd;")
    private class346 field596 = new class346();

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "Z")
    private boolean field599 = false;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public int field600 = 0;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field598;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "[C")
    public static char[] field595 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[Lf;")
    public static class257[] field593;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BC)Z", line = 3)
    public static final boolean method351(byte arg0, char arg1) {
        field590++;
        if (arg0 != -108) {
            method351((byte) -100, (char) 65528);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 15)
    public final void method352(int arg0) {
        this.field599 = true;
        field589++;
        class346 var2 = this.field596;
        synchronized (this.field596) {
            this.field596.notifyAll();
            if (arg0 != 108) {
                this.method354(null, 98);
            }
        }
        try {
            this.field598.join();
        } catch (InterruptedException var3) {
        }
        this.field598 = null;
    }

    @OriginalMember(owner = "client!ms", name = "run", descriptor = "()V", line = 34)
    public final void run() {
        field592++;
        while (!this.field599) {
            class346 var1 = this.field596;
            class603 var2;
            synchronized (this.field596) {
                var2 = (class603) this.field596.method2105(-4488);
                if (var2 == null) {
                    try {
                        this.field596.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field600--;
            }
            try {
                if (var2.field8662 == 2) {
                    var2.field8663.method1378((int) var2.field2469, var2.field8665, (byte) -54, var2.field8665.length);
                } else if (var2.field8662 == 3) {
                    var2.field8665 = var2.field8663.method1381(true, (int) var2.field2469);
                }
            } catch (Exception var6) {
                class18.method200(null, var6, 10296);
            }
            var2.field3107 = false;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 78)
    public static void method353(byte arg0) {
        int var1 = -17 % ((-arg0 - 69) / 55);
        field593 = null;
        field595 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lrn;I)V", line = 89)
    private final void method354(class603 arg0, int arg1) {
        field588++;
        int var3 = 80 / ((arg1 + 65) / 51);
        class346 var4 = this.field596;
        synchronized (this.field596) {
            this.field596.method2107(true, arg0);
            this.field600++;
            this.field596.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([BILvm;I)Lrn;", line = 107)
    public final class603 method355(byte[] arg0, int arg1, class195 arg2, int arg3) {
        field594++;
        class603 var5 = new class603();
        var5.field3100 = false;
        var5.field8662 = arg1;
        var5.field8663 = arg2;
        var5.field8665 = arg0;
        var5.field2469 = arg3;
        this.method354(var5, arg1 + 79);
        return var5;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILvm;)Lrn;", line = 129)
    public final class603 method356(int arg0, int arg1, class195 arg2) {
        field597++;
        class603 var4 = new class603();
        var4.field8662 = 1;
        class346 var5 = this.field596;
        synchronized (this.field596) {
            class603 var6 = (class603) this.field596.method2112((byte) 32);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field2469 && var6.field8663 == arg2 && var6.field8662 == 2) {
                    var4.field3107 = false;
                    var4.field8665 = var6.field8665;
                    return var4;
                }
                var6 = (class603) this.field596.method2109(-78);
            }
        }
        var4.field8665 = arg2.method1381(true, arg1);
        var4.field3100 = true;
        if (arg0 == 20682) {
            var4.field3107 = false;
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lwv;)V", line = 196)
    public class44(class705 arg0) {
        class614 var2 = arg0.method3968(this, 5, (byte) 13);
        while (var2.field8787 == 0) {
            class564.method3300((byte) 126, 10L);
        }
        if (var2.field8787 == 2) {
            throw new RuntimeException();
        }
        this.field598 = (Thread) var2.field8785;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lvm;BI)Lrn;", line = 172)
    public final class603 method357(class195 arg0, byte arg1, int arg2) {
        field591++;
        class603 var4 = new class603();
        var4.field3100 = false;
        var4.field8662 = 3;
        var4.field2469 = arg2;
        var4.field8663 = arg0;
        if (arg1 > -8) {
            return null;
        } else {
            this.method354(var4, 22);
            return var4;
        }
    }
}
