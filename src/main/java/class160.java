import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ltk;")
    private class53 field2457 = new class53();

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public int field2472 = 0;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
    private boolean field2469 = false;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2470;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[Z")
    public static boolean[] field2459 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public static int[] field2458 = new int[50];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public static int[] field2460 = new int[100];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lrf;")
    public static class289 field2456 = null;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "[[B")
    public static byte[][] field2471;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILll;[B)Lwe;")
    public final class15 method992(int arg0, int arg1, class211 arg2, byte[] arg3) {
        field2464++;
        class15 var5 = new class15();
        var5.field186 = arg1;
        var5.field182 = arg3;
        var5.field184 = arg2;
        var5.field15 = (long) arg0;
        var5.field4094 = false;
        this.method995(var5, arg1 + 13987);
        return var5;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public final void method993(int arg0) {
        this.field2469 = true;
        class53 var2 = this.field2457;
        synchronized (this.field2457) {
            this.field2457.notifyAll();
        }
        int var3 = -3 / ((35 - arg0) / 45);
        field2461++;
        try {
            this.field2470.join();
        } catch (InterruptedException var4) {
        }
        this.field2470 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILll;)Lwe;")
    public final class15 method994(int arg0, int arg1, class211 arg2) {
        field2467++;
        if (arg1 > -110) {
            method996(76);
        }
        class15 var4 = new class15();
        var4.field184 = arg2;
        var4.field4094 = false;
        var4.field186 = 3;
        var4.field15 = (long) arg0;
        this.method995(var4, 13989);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lwe;I)V")
    private final void method995(class15 arg0, int arg1) {
        field2465++;
        class53 var3 = this.field2457;
        synchronized (this.field2457) {
            if (arg1 != 13989) {
                field2460 = null;
            }
            this.field2457.method363(arg0, arg1 - 14094);
            this.field2472++;
            this.field2457.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nf", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2469) {
            class53 var1 = this.field2457;
            class15 var2;
            synchronized (this.field2457) {
                var2 = (class15) this.field2457.method368(0);
                if (var2 == null) {
                    try {
                        this.field2457.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2472--;
            }
            try {
                if (var2.field186 == 2) {
                    var2.field184.method1351((int) var2.field15, 14346, var2.field182, var2.field182.length);
                } else if (var2.field186 == 3) {
                    var2.field182 = var2.field184.method1353((byte) 116, (int) var2.field15);
                }
            } catch (Exception var6) {
                class275.method1822((String) null, (byte) -100, var6);
            }
            var2.field4091 = false;
        }
        field2462++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method996(int arg0) {
        class272.method1805();
        field2468++;
        int var1 = 0;
        if (arg0 != -6910) {
            return;
        }
        while (var1 < 4) {
            class202.field3052[var1].method201(true);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public static final void method997(int arg0, int arg1) {
        field2455++;
        if (arg0 == -1 || !class294.method1943((byte) 117, arg0)) {
            return;
        }
        class289[] var2 = class234.field3532[arg0];
        int var3 = 0;
        if (arg1 != 29283) {
            field2458 = null;
        }
        while (var3 < var2.length) {
            class289 var4 = var2[var3];
            if (var4.field4457 != null) {
                class234 var5 = new class234();
                var5.field3528 = var4;
                var5.field3533 = var4.field4457;
                class199.method1247(var5, 1, 2000000);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method998(int arg0) {
        field2459 = null;
        field2460 = null;
        if (arg0 != 0) {
            field2460 = null;
        }
        field2458 = null;
        field2456 = null;
        field2471 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lji;")
    public static final class43 method999(int arg0, int arg1) {
        field2466++;
        class43 var2 = (class43) class274.field4121.method1777((long) arg0, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field1901.method1973(1, class115.method744(true, arg0), class262.method1751(false, arg0));
        class43 var4 = new class43();
        var4.field680 = arg0;
        if (var3 != null) {
            var4.method285(new class248(var3), 0);
        }
        var4.method283((byte) 63);
        if (var4.field643 != -1) {
            var4.method298((byte) -120, method999(var4.field677, 0), method999(var4.field643, 0));
        }
        if (var4.field666 != -1) {
            var4.method295(method999(var4.field667, 0), (byte) -100, method999(var4.field666, arg1));
        }
        if (!class107.field1669 && var4.field653) {
            var4.field656 = 0;
            var4.field646 = false;
            var4.field682 = class236.field3564;
            var4.field622 = class137.field2002;
            var4.field626 = class77.field1242;
        }
        class274.field4121.method1784((long) arg0, var4, arg1 ^ arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lll;II)Lwe;")
    public final class15 method1000(class211 arg0, int arg1, int arg2) {
        class15 var4 = new class15();
        var4.field186 = arg1;
        field2463++;
        class53 var5 = this.field2457;
        synchronized (this.field2457) {
            class15 var6 = (class15) this.field2457.method367(121);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field15 && var6.field184 == arg0 && var6.field186 == 2) {
                    var4.field4091 = false;
                    var4.field182 = var6.field182;
                    return var4;
                }
                var6 = (class15) this.field2457.method359(-56);
            }
        }
        var4.field182 = arg0.method1353((byte) 125, arg2);
        var4.field4094 = true;
        var4.field4091 = false;
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class160() {
        class78 var1 = class209.field3147.method71(2, 5, this);
        while (var1.field1249 == 0) {
            class250.method1643(1, 10L);
        }
        if (var1.field1249 == 2) {
            throw new RuntimeException();
        }
        this.field2470 = (Thread) var1.field1250;
    }
}
