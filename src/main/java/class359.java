import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class359 implements Runnable {

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lkn;")
    private class233 field5562 = new class233();

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field5567 = 0;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
    private boolean field5565 = false;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5563;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lcm;")
    public static class449 field5555 = new class449(24, 8);

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lui;")
    public static class375 field5564 = new class375("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lcm;")
    public static class449 field5566 = new class449(31, 0);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lm;")
    public static class373 field5552;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lns;")
    public static class438 field5553;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BILht;I)Lmk;", line = 4)
    public final class245 method2260(byte[] arg0, int arg1, class80 arg2, int arg3) {
        field5556++;
        if (arg1 >= -72) {
            field5552 = null;
        }
        class245 var5 = new class245();
        var5.field3428 = arg0;
        var5.field3427 = 2;
        var5.field3432 = arg2;
        var5.field1173 = arg3;
        var5.field5539 = false;
        this.method2264(var5, 2);
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 25)
    public final void method2261(int arg0) {
        field5561++;
        this.field5565 = true;
        class233 var2 = this.field5562;
        synchronized (this.field5562) {
            this.field5562.notifyAll();
            if (arg0 != 1) {
                this.field5563 = null;
            }
        }
        try {
            this.field5563.join();
        } catch (InterruptedException var3) {
        }
        this.field5563 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILht;)Lmk;", line = 44)
    public final class245 method2262(int arg0, int arg1, class80 arg2) {
        field5557++;
        class245 var4 = new class245();
        var4.field3427 = 1;
        class233 var5 = this.field5562;
        synchronized (this.field5562) {
            class245 var6 = (class245) this.field5562.method1581((byte) 53);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 27405) {
                        this.field5565 = true;
                    }
                    break;
                }
                if (((long) arg1) == var6.field1173 && var6.field3432 == arg2 && var6.field3427 == 2) {
                    var4.field5535 = false;
                    var4.field3428 = var6.field3428;
                    return var4;
                }
                var6 = (class245) this.field5562.method1585(-1);
            }
        }
        var4.field3428 = arg2.method521(false, arg1);
        var4.field5535 = false;
        var4.field5539 = true;
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "run", descriptor = "()V", line = 83)
    public final void run() {
        field5558++;
        while (!this.field5565) {
            class233 var1 = this.field5562;
            class245 var2;
            synchronized (this.field5562) {
                var2 = (class245) this.field5562.method1583(116);
                if (var2 == null) {
                    try {
                        this.field5562.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5567--;
            }
            try {
                if (var2.field3427 == 2) {
                    var2.field3432.method520((int) var2.field1173, var2.field3428.length, (byte) 55, var2.field3428);
                } else if (var2.field3427 == 3) {
                    var2.field3428 = var2.field3432.method521(false, (int) var2.field1173);
                }
            } catch (Exception var6) {
                class438.method2644(null, -1, var6);
            }
            var2.field5535 = false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 127)
    public static final void method2263(int arg0, int arg1) {
        field5554++;
        class377 var2 = class99.method672(arg0, false, 11);
        var2.method2339(-11688);
        int var3 = 15 / ((arg1 - 79) / 47);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmk;I)V", line = 145)
    private final void method2264(class245 arg0, int arg1) {
        field5559++;
        class233 var3 = this.field5562;
        synchronized (this.field5562) {
            this.field5562.method1582(arg0, -1);
            this.field5567++;
            if (arg1 == 2) {
                this.field5562.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lht;II)Lmk;", line = 161)
    public final class245 method2265(class80 arg0, int arg1, int arg2) {
        field5560++;
        class245 var4 = new class245();
        var4.field5539 = false;
        int var5 = -70 % ((arg1 + 64) / 58);
        var4.field3432 = arg0;
        var4.field3427 = 3;
        var4.field1173 = arg2;
        this.method2264(var4, 2);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lhu;)V", line = 213)
    public class359(class469 arg0) {
        class125 var2 = arg0.method2792(5, this, -10265);
        while (var2.field1791 == 0) {
            class106.method710(10L, (byte) 6);
        }
        if (var2.field1791 == 2) {
            throw new RuntimeException();
        }
        this.field5563 = (Thread) var2.field1793;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 185)
    public static void method2266(byte arg0) {
        field5564 = null;
        field5553 = null;
        field5555 = null;
        if (arg0 >= 66) {
            field5566 = null;
            field5552 = null;
        }
    }
}
