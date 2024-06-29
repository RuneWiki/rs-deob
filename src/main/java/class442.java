import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class442 implements Runnable {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lwe;")
    private class24 field6203 = new class24();

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public int field6213 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
    private boolean field6219 = false;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field6209;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6206 = 1;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    public static int[] field6221 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lka;")
    public static class408 field6208 = new class408(64);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLnf;I)Lsb;", line = 3)
    public final class363 method2737(byte arg0, class258 arg1, int arg2) {
        if (arg0 != 19) {
            this.method2746((class258) null, (byte[]) null, 27, false);
        }
        field6211++;
        class363 var4 = new class363();
        var4.field4997 = arg1;
        var4.field486 = false;
        var4.field5004 = 3;
        var4.field2411 = (long) arg2;
        this.method2739(var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "run", descriptor = "()V", line = 23)
    public final void run() {
        field6207++;
        while (!this.field6219) {
            class24 var1 = this.field6203;
            class363 var2;
            synchronized (this.field6203) {
                var2 = (class363) this.field6203.method146((byte) 121);
                if (var2 == null) {
                    try {
                        this.field6203.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6213--;
            }
            try {
                if (var2.field5004 == 2) {
                    var2.field4997.method1662(var2.field5001.length, (int) var2.field2411, var2.field5001, -54);
                } else if (var2.field5004 == 3) {
                    var2.field5001 = var2.field4997.method1663(3, (int) var2.field2411);
                }
            } catch (Exception var6) {
                class48.method399((byte) 86, var6, (String) null);
            }
            var2.field484 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIBIII)V", line = 71)
    public static final void method2738(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -5) {
            field6208 = null;
        }
        if (class80.field1119 <= arg5 && class430.field6003 >= arg0 && class143.field2090 <= arg3 && arg7 <= class42.field543) {
            class402.method2488((byte) 2, arg7, arg2, arg0, arg5, arg3, arg1, arg6);
        } else {
            class149.method1113(arg7, arg6, arg0, arg2, arg1, (byte) 52, arg5, arg3);
        }
        field6217++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsb;I)V", line = 88)
    private final void method2739(class363 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        class24 var3 = this.field6203;
        synchronized (this.field6203) {
            this.field6203.method145(arg0, false);
            this.field6213++;
            this.field6203.notifyAll();
        }
        field6205++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 107)
    public final void method2740(int arg0) {
        this.field6219 = true;
        field6218++;
        class24 var2 = this.field6203;
        synchronized (this.field6203) {
            this.field6203.notifyAll();
        }
        if (arg0 != -24122) {
            this.field6209 = null;
        }
        try {
            this.field6209.join();
        } catch (InterruptedException var3) {
        }
        this.field6209 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lne;)V", line = 253)
    public class442(class76 arg0) {
        class285 var2 = arg0.method586(this, (byte) 103, 5);
        while (var2.field3875 == 0) {
            class328.method1999(0, 10L);
        }
        if (var2.field3875 == 2) {
            throw new RuntimeException();
        }
        this.field6209 = (Thread) var2.field3871;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILnf;I)Lsb;", line = 129)
    public final class363 method2741(int arg0, class258 arg1, int arg2) {
        field6204++;
        class363 var4 = new class363();
        var4.field5004 = 1;
        class24 var5 = this.field6203;
        synchronized (this.field6203) {
            class363 var6 = (class363) this.field6203.method152(70);
            while (true) {
                if (var6 == null) {
                    int var8 = -50 / ((arg0 + 42) / 57);
                    break;
                }
                if (((long) arg2) == var6.field2411 && var6.field4997 == arg1 && var6.field5004 == 2) {
                    var4.field484 = false;
                    var4.field5001 = var6.field5001;
                    return var4;
                }
                var6 = (class363) this.field6203.method148(5);
            }
        }
        var4.field5001 = arg1.method1663(3, arg2);
        var4.field486 = true;
        var4.field484 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZII)V", line = 162)
    public static final void method2742(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 >= arg0) {
            class149.method1112(arg4, arg1, 8, arg0, class83.field1157[arg3]);
        } else {
            class149.method1112(arg4, arg0, 8, arg1, class83.field1157[arg3]);
        }
        field6215++;
        if (arg2) {
            field6216 = -27;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 181)
    public static void method2743(int arg0) {
        if (arg0 == 99) {
            field6208 = null;
            field6221 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 200)
    public static final void method2744(String arg0, int arg1) {
        field6210++;
        if (!arg0.equals("") && arg1 == 2) {
            class88.field1232.method1151(239, (byte) 95);
            class273.field3725++;
            class88.field1232.method2280(class82.method662(12189, arg0), arg1 + 1537846406);
            class88.field1232.method2285(arg0, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 225)
    public static final void method2745(int arg0, int arg1, int arg2) {
        int var3 = -62 % ((57 - arg2) / 54);
        field6220++;
        class141 var4 = class389.field5423[arg0][arg1];
        if (var4 != null) {
            class304.field4141 = var4.field2054;
            class61.field834 = var4.field2061;
            class394.field5473 = var4.field2069;
        }
        class101.method774(73);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnf;[BIZ)Lsb;", line = 279)
    public final class363 method2746(class258 arg0, byte[] arg1, int arg2, boolean arg3) {
        field6212++;
        class363 var5 = new class363();
        var5.field486 = arg3;
        var5.field4997 = arg0;
        var5.field5004 = 2;
        var5.field2411 = (long) arg2;
        var5.field5001 = arg1;
        this.method2739(var5, 1);
        return var5;
    }
}
