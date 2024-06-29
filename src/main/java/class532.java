import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class532 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Let;")
    private class428 field7820 = new class428();

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field7826 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
    private boolean field7828 = false;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field7825;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lni;")
    public static class367 field7827 = new class367(51, -1);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field7830 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Luu;")
    public static class191 field7829;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLvc;)Lsp;", line = 3)
    public final class457 method3143(int arg0, byte arg1, class211 arg2) {
        field7818++;
        class457 var4 = new class457();
        var4.field6854 = 1;
        class428 var5 = this.field7820;
        synchronized (this.field7820) {
            class457 var6 = (class457) this.field7820.method2611((byte) 78);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field1579 && var6.field6850 == arg2 && var6.field6854 == 2) {
                    var4.field6853 = var6.field6853;
                    var4.field2342 = false;
                    return var4;
                }
                var6 = (class457) this.field7820.method2615(-13153);
            }
        }
        var4.field6853 = arg2.method1452(arg0, 65280);
        var4.field2344 = true;
        var4.field2342 = false;
        if (arg1 != 90) {
            field7827 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BLvc;ZI)Lsp;", line = 37)
    public final class457 method3144(byte[] arg0, class211 arg1, boolean arg2, int arg3) {
        field7819++;
        class457 var5 = new class457();
        var5.field1579 = arg3;
        var5.field6853 = arg0;
        var5.field6854 = 2;
        var5.field2344 = arg2;
        var5.field6850 = arg1;
        this.method3148(123, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 55)
    public static final void method3145(byte arg0) {
        class381.field5814 = null;
        field7817++;
        class264.field3700 = null;
        class35.field514 = null;
        class281.field3975 = null;
        class213.field3022 = false;
        if (arg0 != 29) {
            field7829 = null;
        }
        class492.field7263 = null;
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V", line = 72)
    public final void run() {
        while (!this.field7828) {
            class428 var1 = this.field7820;
            class457 var2;
            synchronized (this.field7820) {
                var2 = (class457) this.field7820.method2612(-6261);
                if (var2 == null) {
                    try {
                        this.field7820.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field7826--;
            }
            try {
                if (var2.field6854 == 2) {
                    var2.field6850.method1457(5805, (int) var2.field1579, var2.field6853.length, var2.field6853);
                } else if (var2.field6854 == 3) {
                    var2.field6853 = var2.field6850.method1452((int) var2.field1579, 65280);
                }
            } catch (Exception var7) {
                class395.method2457(null, var7, 1);
            }
            var2.field2342 = false;
        }
        field7821++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILvc;)Lsp;", line = 118)
    public final class457 method3146(boolean arg0, int arg1, class211 arg2) {
        field7823++;
        class457 var4 = new class457();
        if (!arg0) {
            this.method3143(-19, (byte) 4, null);
        }
        var4.field6854 = 3;
        var4.field2344 = false;
        var4.field1579 = arg1;
        var4.field6850 = arg2;
        this.method3148(-87, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 138)
    public static void method3147(byte arg0) {
        if (arg0 != 29) {
            method3145((byte) 119);
        }
        field7829 = null;
        field7827 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILsp;)V", line = 150)
    private final void method3148(int arg0, class457 arg1) {
        class428 var3 = this.field7820;
        synchronized (this.field7820) {
            int var4 = -90 % ((arg0 - 59) / 59);
            this.field7820.method2613(3, arg1);
            this.field7826++;
            this.field7820.notifyAll();
        }
        field7824++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ldq;)V", line = 199)
    public class532(class500 arg0) {
        class234 var2 = arg0.method3001(5, this, 0);
        while (var2.field3322 == 0) {
            class388.method2433(10L, 69);
        }
        if (var2.field3322 == 2) {
            throw new RuntimeException();
        }
        this.field7825 = (Thread) var2.field3324;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V", line = 178)
    public final void method3149(byte arg0) {
        field7822++;
        this.field7828 = true;
        class428 var2 = this.field7820;
        synchronized (this.field7820) {
            this.field7820.notifyAll();
        }
        if (arg0 != 60) {
            this.field7820 = null;
        }
        try {
            this.field7825.join();
        } catch (InterruptedException var3) {
        }
        this.field7825 = null;
    }
}
