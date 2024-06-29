import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 implements Runnable {

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Ltn;")
    private class59 field126 = new class59();

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public int field136 = 0;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field133;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "[B")
    public static byte[] field137 = new byte[16384];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lrq;")
    public static class233 field128;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILst;I)Llf;")
    public final class158 method70(int arg0, class297 arg1, int arg2) {
        field123++;
        class158 var4 = new class158();
        var4.field2234 = false;
        var4.field2238 = arg1;
        var4.field2241 = 3;
        var4.field5561 = arg2;
        this.method73(arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lst;II)Llf;")
    public final class158 method71(class297 arg0, int arg1, int arg2) {
        field120++;
        class158 var4 = new class158();
        var4.field2241 = 1;
        class59 var5 = this.field126;
        synchronized (this.field126) {
            class158 var6 = (class158) this.field126.method537((byte) 87);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field5561 && var6.field2238 == arg0 && var6.field2241 == 2) {
                    var4.field2230 = false;
                    var4.field2239 = var6.field2239;
                    return var4;
                }
                var6 = (class158) this.field126.method540(true);
            }
        }
        var4.field2239 = arg0.method1872(407064624, arg2);
        var4.field2234 = true;
        var4.field2230 = false;
        if (arg1 != -20214) {
            this.field135 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public final void method72(int arg0) {
        field121++;
        this.field135 = true;
        class59 var2 = this.field126;
        synchronized (this.field126) {
            this.field126.notifyAll();
        }
        try {
            this.field133.join();
            if (arg0 != -1) {
                method75(-66);
            }
        } catch (InterruptedException var3) {
        }
        this.field133 = null;
    }

    @OriginalMember(owner = "client!vl", name = "run", descriptor = "()V")
    public final void run() {
        field125++;
        while (!this.field135) {
            class59 var1 = this.field126;
            class158 var2;
            synchronized (this.field126) {
                var2 = (class158) this.field126.method539((byte) 93);
                if (var2 == null) {
                    try {
                        this.field126.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field136--;
            }
            try {
                if (var2.field2241 == 2) {
                    var2.field2238.method1873(var2.field2239, false, (int) var2.field5561, var2.field2239.length);
                } else if (var2.field2241 == 3) {
                    var2.field2239 = var2.field2238.method1872(407064624, (int) var2.field5561);
                }
            } catch (Exception var6) {
                class194.method1362(var6, null, 82);
            }
            var2.field2230 = false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILlf;)V")
    private final void method73(int arg0, class158 arg1) {
        class59 var3 = this.field126;
        synchronized (this.field126) {
            this.field126.method536(-122, arg1);
            this.field136++;
            this.field126.notifyAll();
            if (arg0 != -1) {
                this.run();
            }
        }
        field127++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[BLst;)Llf;")
    public final class158 method74(int arg0, int arg1, byte[] arg2, class297 arg3) {
        if (arg0 != 5) {
            method78(75, 35);
        }
        field129++;
        class158 var5 = new class158();
        var5.field5561 = arg1;
        var5.field2241 = 2;
        var5.field2239 = arg2;
        var5.field2238 = arg3;
        var5.field2234 = false;
        this.method73(-1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static void method75(int arg0) {
        int var1 = -123 % ((arg0 + 77) / 44);
        field128 = null;
        field137 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method76(int arg0, byte arg1, int arg2) {
        if (arg1 <= 120) {
            field130 = 53;
        }
        field131++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method77(byte arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, int arg7) {
        field122++;
        for (int var8 = 99; var8 > 0; var8--) {
            class58.field673[var8] = class58.field673[var8 - 1];
            class472.field6966[var8] = class472.field6966[var8 - 1];
            class128.field1855[var8] = class128.field1855[var8 - 1];
            class225.field3301[var8] = class225.field3301[var8 - 1];
            class20.field224[var8] = class20.field224[var8 - 1];
            class87.field1184[var8] = class87.field1184[var8 - 1];
            class344.field4774[var8] = class344.field4774[var8 - 1];
        }
        class58.field673[0] = arg7;
        class128.field1855[0] = arg6;
        class472.field6966[0] = arg5;
        class225.field3301[0] = arg2;
        class20.field224[0] = arg3;
        class311.field4438++;
        if (arg0 >= 68) {
            class428.field6310 = class49.field548;
            class87.field1184[0] = arg4;
            class344.field4774[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method78(int arg0, int arg1) {
        field124++;
        if (!class518.method3081(-88, arg0)) {
            return;
        }
        class188[] var2 = class123.field1803[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class188 var4 = var2[var3];
            if (var4 != null) {
                var4.field2628 = 1;
                var4.field2705 = 0;
                var4.field2686 = 0;
            }
        }
        if (arg1 != 2652) {
            field137 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Z")
    public static final boolean method79(int arg0) {
        if (arg0 > -47) {
            method76(-70, (byte) 57, -8);
        }
        field132++;
        return class228.field3319;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Let;)V")
    public class11(class419 arg0) {
        class449 var2 = arg0.method2564(-90, 5, this);
        while (var2.field6617 == 0) {
            class213.method1462(10L, -5184);
        }
        if (var2.field6617 == 2) {
            throw new RuntimeException();
        }
        this.field133 = (Thread) var2.field6613;
    }
}
