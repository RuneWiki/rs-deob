import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class391 implements Runnable {

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lvi;")
    private class476 field5125 = new class476();

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public int field5130 = 0;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
    private boolean field5133 = false;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field5128;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Ldn;")
    public static class201 field5121;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lv;")
    public static class455 field5119;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "[I")
    public static int[] field5131;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "[I")
    public static int[] field5132;

    static {
        new class169("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljb;IB)Lhu;", line = 4)
    public final class398 method2328(class374 arg0, int arg1, byte arg2) {
        field5124++;
        class398 var4 = new class398();
        var4.field5299 = arg0;
        var4.field5296 = 3;
        var4.field5570 = false;
        var4.field1143 = arg1;
        if (arg2 < 38) {
            this.run();
        }
        this.method2333(var4, (byte) 114);
        return var4;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lhs;)V", line = 226)
    public class391(class441 arg0) {
        class277 var2 = arg0.method2620(this, 5, 116);
        while (var2.field3542 == 0) {
            class463.method2773(10L, 19);
        }
        if (var2.field3542 == 2) {
            throw new RuntimeException();
        }
        this.field5128 = (Thread) var2.field3541;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V", line = 38)
    public final void method2329(boolean arg0) {
        this.field5133 = arg0;
        field5129++;
        class476 var2 = this.field5125;
        synchronized (this.field5125) {
            this.field5125.notifyAll();
        }
        try {
            this.field5128.join();
        } catch (InterruptedException var3) {
        }
        this.field5128 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 54)
    public static final void method2330(int arg0) {
        if (arg0 >= -50) {
            field5119 = null;
        }
        for (int var1 = 0; var1 < class8.field76.length; var1++) {
            for (int var2 = 0; var2 < class8.field76[0].length; var2++) {
                for (int var3 = 0; var3 < class8.field76[0][0].length; var3++) {
                    class8.field76[var1][var2][var3] = 0;
                }
            }
        }
        field5120++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILjb;B)Lhu;", line = 90)
    public final class398 method2331(int arg0, class374 arg1, byte arg2) {
        field5134++;
        class398 var4 = new class398();
        var4.field5296 = 1;
        class476 var5 = this.field5125;
        synchronized (this.field5125) {
            if (arg2 >= -27) {
                field5119 = null;
            }
            class398 var6 = (class398) this.field5125.method2860(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field1143 && var6.field5299 == arg1 && var6.field5296 == 2) {
                    var4.field5302 = var6.field5302;
                    var4.field5569 = false;
                    return var4;
                }
                var6 = (class398) this.field5125.method2856(false);
            }
        }
        var4.field5302 = arg1.method2186(arg0, (byte) 70);
        var4.field5569 = false;
        var4.field5570 = true;
        return var4;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([BIBLjb;)Lhu;", line = 125)
    public final class398 method2332(byte[] arg0, int arg1, byte arg2, class374 arg3) {
        field5127++;
        if (arg2 != -81) {
            return null;
        }
        class398 var5 = new class398();
        var5.field5299 = arg3;
        var5.field5570 = false;
        var5.field1143 = arg1;
        var5.field5296 = 2;
        var5.field5302 = arg0;
        this.method2333(var5, (byte) 114);
        return var5;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lhu;B)V", line = 150)
    private final void method2333(class398 arg0, byte arg1) {
        class476 var3 = this.field5125;
        synchronized (this.field5125) {
            this.field5125.method2858(15, arg0);
            this.field5130++;
            this.field5125.notifyAll();
        }
        if (arg1 != 114) {
            this.field5128 = null;
        }
        field5123++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 165)
    public static void method2334(byte arg0) {
        field5132 = null;
        field5119 = null;
        if (arg0 != -105) {
            field5121 = null;
        }
        field5121 = null;
        field5131 = null;
    }

    @OriginalMember(owner = "client!au", name = "run", descriptor = "()V", line = 179)
    public final void run() {
        while (!this.field5133) {
            class476 var1 = this.field5125;
            class398 var2;
            synchronized (this.field5125) {
                var2 = (class398) this.field5125.method2861((byte) -124);
                if (var2 == null) {
                    try {
                        this.field5125.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field5130--;
            }
            try {
                if (var2.field5296 == 2) {
                    var2.field5299.method2187((byte) 111, (int) var2.field1143, var2.field5302, var2.field5302.length);
                } else if (var2.field5296 == 3) {
                    var2.field5302 = var2.field5299.method2186((int) var2.field1143, (byte) 116);
                }
            } catch (Exception var7) {
                class375.method2192((byte) 126, var7, null);
            }
            var2.field5569 = false;
        }
        field5126++;
    }
}
