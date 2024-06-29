import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class346 implements Runnable {

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Loga;")
    private class158 field5115 = new class158();

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field5121 = 0;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Z")
    private boolean field5120 = false;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field5119;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5110 = 0;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5108 = 1;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2145(int arg0, int arg1) {
        if (arg0 != -1) {
            field5110 = 23;
        }
        field5116++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!jq", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        field5118++;
        while (!this.field5120) {
            class158 var1 = this.field5115;
            class564 var2;
            synchronized (this.field5115) {
                var2 = (class564) this.field5115.method1132(-1);
                if (var2 == null) {
                    try {
                        this.field5115.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5121--;
            }
            try {
                if (var2.field8242 == 2) {
                    var2.field8244.method132(var2.field8241, var2.field8241.length, false, (int) var2.field4679);
                } else if (var2.field8242 == 3) {
                    var2.field8241 = var2.field8244.method127(-123, (int) var2.field4679);
                }
            } catch (Exception var6) {
                class118.method869(var6, (byte) -128, null);
            }
            var2.field8640 = false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 65)
    public final void method2146(byte arg0) {
        field5109++;
        this.field5120 = true;
        class158 var2 = this.field5115;
        synchronized (this.field5115) {
            if (arg0 > -93) {
                this.method2147(-4, 24, null, null);
            }
            this.field5115.notifyAll();
        }
        try {
            this.field5119.join();
        } catch (InterruptedException var3) {
        }
        this.field5119 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II[BLnr;)Lie;", line = 92)
    public final class564 method2147(int arg0, int arg1, byte[] arg2, class19 arg3) {
        if (arg0 != 1442) {
            return null;
        }
        field5113++;
        class564 var5 = new class564();
        var5.field4679 = arg1;
        var5.field8241 = arg2;
        var5.field8244 = arg3;
        var5.field8641 = false;
        var5.field8242 = 2;
        this.method2150(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lnr;II)Lie;", line = 115)
    public final class564 method2148(class19 arg0, int arg1, int arg2) {
        field5114++;
        class564 var4 = new class564();
        var4.field8641 = false;
        var4.field4679 = arg1;
        var4.field8244 = arg0;
        var4.field8242 = arg2;
        this.method2150(false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lnr;BI)Lie;", line = 130)
    public final class564 method2149(class19 arg0, byte arg1, int arg2) {
        field5117++;
        class564 var4 = new class564();
        var4.field8242 = 1;
        class158 var5 = this.field5115;
        synchronized (this.field5115) {
            int var6 = 65 % ((arg1 - 7) / 44);
            class564 var7 = (class564) this.field5115.method1126(37);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg2) == var7.field4679 && var7.field8244 == arg0 && var7.field8242 == 2) {
                    var4.field8640 = false;
                    var4.field8241 = var7.field8241;
                    return var4;
                }
                var7 = (class564) this.field5115.method1128(11);
            }
        }
        var4.field8241 = arg0.method127(-126, arg2);
        var4.field8640 = false;
        var4.field8641 = true;
        return var4;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLie;)V", line = 164)
    private final void method2150(boolean arg0, class564 arg1) {
        class158 var3 = this.field5115;
        synchronized (this.field5115) {
            this.field5115.method1134(arg1, -1);
            this.field5121++;
            this.field5115.notifyAll();
            if (arg0) {
                this.field5120 = false;
            }
        }
        field5111++;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lew;)V", line = 191)
    public class346(class226 arg0) {
        class254 var2 = arg0.method1414(16, this, 5);
        while (var2.field3311 == 0) {
            class687.method3846(10L, 94);
        }
        if (var2.field3311 == 2) {
            throw new RuntimeException();
        }
        this.field5119 = (Thread) var2.field3307;
    }
}
