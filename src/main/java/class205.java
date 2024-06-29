import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lrg;")
    private class217 field3623 = new class217();

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public int field3625 = 0;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Z")
    private boolean field3627 = false;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field3626;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Leb;")
    public static class230 field3624 = class68.method589(0, ")1a2)1m");

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lv;")
    public static class147 field3613 = new class147(64);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lkk;")
    public static class223 field3628;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lsf;ZB)V")
    public static final void method1435(class93 arg0, boolean arg1, byte arg2) {
        if (arg1) {
            int var3 = class135.field2434;
            int var4 = var3 * 956 / 503;
            class213.field3688.method113((class180.field3155 - var4) / 2, 0, var4, var3);
            class260.field4625.method405(class180.field3155 / 2 - class260.field4625.field861 / 2, 18);
        }
        arg0.method784(class263.field4670, class180.field3155 / 2, class135.field2434 / 2 - 26, 16777215, -1);
        field3612++;
        int var5 = class135.field2434 / 2 - 18;
        class87.method713(class180.field3155 / 2 - 152, var5, 304, 34, 9179409);
        class87.method713(class180.field3155 / 2 - 151, var5 + 1, 302, 32, 0);
        class87.method705(class180.field3155 / 2 - 150, var5 + 2, class84.field1493 * 3, 30, 9179409);
        class87.method705(class84.field1493 * 3 + class180.field3155 / 2 - 150, var5 + 2, 300 - class84.field1493 * 3, 30, 0);
        arg0.method784(class145.field2598, class180.field3155 / 2, class135.field2434 / 2 + 4, 16777215, -1);
        if (arg2 <= 8) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILlh;)Lqe;")
    public final class95 method1436(int arg0, int arg1, class274 arg2) {
        field3615++;
        class95 var4 = new class95();
        var4.field2046 = false;
        if (arg0 != 302) {
            method1440(91, 28, 24, (class223) null);
        }
        var4.field1711 = 3;
        var4.field4534 = (long) arg1;
        var4.field1720 = arg2;
        this.method1439(var4, (byte) 23);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IILlh;)Lqe;")
    public final class95 method1437(int arg0, int arg1, class274 arg2) {
        field3614++;
        class95 var4 = new class95();
        var4.field1711 = 1;
        class217 var5 = this.field3623;
        synchronized (this.field3623) {
            class95 var6 = (class95) this.field3623.method1497(true);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 2) {
                        field3628 = null;
                    }
                    break;
                }
                if ((long) arg1 == var6.field4534 && var6.field1720 == arg2 && var6.field1711 == 2) {
                    var4.field2050 = false;
                    var4.field1724 = var6.field1724;
                    return var4;
                }
                var6 = (class95) this.field3623.method1495((byte) 36);
            }
        }
        var4.field1724 = arg2.method1864(arg1, 8);
        var4.field2046 = true;
        var4.field2050 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI[BLlh;)Lqe;")
    public final class95 method1438(boolean arg0, int arg1, byte[] arg2, class274 arg3) {
        field3616++;
        class95 var5 = new class95();
        var5.field1720 = arg3;
        var5.field2046 = false;
        if (!arg0) {
            return null;
        }
        var5.field4534 = (long) arg1;
        var5.field1724 = arg2;
        var5.field1711 = 2;
        this.method1439(var5, (byte) 23);
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3627) {
            class217 var1 = this.field3623;
            class95 var2;
            synchronized (this.field3623) {
                var2 = (class95) this.field3623.method1498(0);
                if (var2 == null) {
                    try {
                        this.field3623.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3625--;
            }
            try {
                if (var2.field1711 == 2) {
                    var2.field1720.method1865(var2.field1724.length, true, var2.field1724, (int) var2.field4534);
                } else if (var2.field1711 == 3) {
                    var2.field1724 = var2.field1720.method1864((int) var2.field4534, 8);
                }
            } catch (Exception var6) {
                class154.method1177(var6, (byte) -65, (String) null);
            }
            var2.field2050 = false;
        }
        field3619++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lqe;B)V")
    private final void method1439(class95 arg0, byte arg1) {
        if (arg1 != 23) {
            this.method1437(-79, -127, (class274) null);
        }
        field3611++;
        class217 var3 = this.field3623;
        synchronized (this.field3623) {
            this.field3623.method1494(-126, arg0);
            this.field3625++;
            this.field3623.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILkk;)Z")
    public static final boolean method1440(int arg0, int arg1, int arg2, class223 arg3) {
        field3620++;
        byte[] var4 = arg3.method1546(arg0, (byte) -100, arg1);
        if (var4 == null) {
            return false;
        }
        if (arg2 != 2) {
            method1442(-56);
        }
        class150.method1135(var4, (byte) 109);
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        int var1 = 125 % ((49 - arg0) / 60);
        class213.method1477(64);
        class248.method1727(-8429);
        class266.method1841(false);
        field3617++;
        class228.method1572(-111);
        class81.method661(9);
        class160.method1210((byte) -108);
        class249.method1730(120);
        class91.method772(19815);
        class8.method79(false);
        class54.method427(4096);
        class54.method425((byte) 78);
        class23.method246(false);
        class58.method504(true);
        class176.method1282(320);
        class260.field4613.method1122(10);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1442(int arg0) {
        if (arg0 != 150) {
            field3628 = null;
        }
        field3628 = null;
        field3624 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lkk;ILkk;)V")
    public static final void method1443(class223 arg0, int arg1, class223 arg2) {
        class116.field2072 = arg2;
        class13.field265 = arg0;
        if (arg1 != 21146) {
            field3624 = null;
        }
        field3621++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method1444(byte arg0) {
        if (arg0 != -29) {
            return;
        }
        this.field3627 = true;
        class217 var2 = this.field3623;
        synchronized (this.field3623) {
            this.field3623.notifyAll();
        }
        field3610++;
        try {
            this.field3626.join();
        } catch (InterruptedException var3) {
        }
        this.field3626 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class205() {
        class193 var1 = class184.field3228.method1019(this, (byte) -80, 5);
        while (var1.field3421 == 0) {
            class52.method417((byte) -115, 10L);
        }
        if (var1.field3421 == 2) {
            throw new RuntimeException();
        }
        this.field3626 = (Thread) var1.field3423;
    }
}
