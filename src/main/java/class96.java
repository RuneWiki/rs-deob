import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class96 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lot;")
    private class255 field1368 = new class255();

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
    private boolean field1374 = false;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field1380 = 0;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1377;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lll;")
    public static class248 field1373;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Laq;")
    public static class385 field1369;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Loj;")
    public static class485 field1381;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[Lvq;")
    public static class486[] field1382;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[[[Lui;")
    public static class406[][][] field1366;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method619(boolean arg0) {
        field1366 = null;
        field1382 = null;
        field1381 = null;
        if (!arg0) {
            field1382 = null;
        }
        field1369 = null;
        field1373 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method620(int arg0) {
        field1378++;
        this.field1374 = true;
        class255 var2 = this.field1368;
        synchronized (this.field1368) {
            this.field1368.notifyAll();
        }
        if (arg0 != 5) {
            this.run();
        }
        try {
            this.field1377.join();
        } catch (InterruptedException var3) {
        }
        this.field1377 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLrn;)V")
    private final void method621(boolean arg0, class53 arg1) {
        field1370++;
        class255 var3 = this.field1368;
        synchronized (this.field1368) {
            this.field1368.method1584(113, arg1);
            this.field1380++;
            if (!arg0) {
                method619(true);
            }
            this.field1368.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lnk;II)Lrn;")
    public final class53 method622(class18 arg0, int arg1, int arg2) {
        field1376++;
        class53 var4 = new class53();
        if (arg2 < 89) {
            this.method621(false, (class53) null);
        }
        var4.field1649 = (long) arg1;
        var4.field872 = arg0;
        var4.field3370 = false;
        var4.field870 = 3;
        this.method621(true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILnk;)Lrn;")
    public final class53 method623(byte arg0, int arg1, class18 arg2) {
        field1379++;
        class53 var4 = new class53();
        var4.field870 = 1;
        class255 var5 = this.field1368;
        synchronized (this.field1368) {
            class53 var6 = (class53) this.field1368.method1587(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1649 && var6.field872 == arg2 && var6.field870 == 2) {
                    var4.field873 = var6.field873;
                    var4.field3373 = false;
                    return var4;
                }
                var6 = (class53) this.field1368.method1583((byte) -69);
            }
        }
        var4.field873 = arg2.method154(167754640, arg1);
        var4.field3373 = false;
        var4.field3370 = true;
        if (arg0 <= 72) {
            field1373 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1374) {
            class255 var1 = this.field1368;
            class53 var2;
            synchronized (this.field1368) {
                var2 = (class53) this.field1368.method1589(0);
                if (var2 == null) {
                    try {
                        this.field1368.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1380--;
            }
            try {
                if (var2.field870 == 2) {
                    var2.field872.method160((int) var2.field1649, 118, var2.field873, var2.field873.length);
                } else if (var2.field870 == 3) {
                    var2.field873 = var2.field872.method154(167754640, (int) var2.field1649);
                }
            } catch (Exception var7) {
                class181.method1190((byte) -76, (String) null, var7);
            }
            var2.field3373 = false;
        }
        field1375++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B[BILnk;)Lrn;")
    public final class53 method624(byte arg0, byte[] arg1, int arg2, class18 arg3) {
        field1367++;
        class53 var5 = new class53();
        var5.field873 = arg1;
        var5.field870 = 2;
        if (arg0 < 91) {
            method625((class133) null, (byte) 73);
        }
        var5.field872 = arg3;
        var5.field3370 = false;
        var5.field1649 = (long) arg2;
        this.method621(true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ldq;)V")
    public class96(class14 arg0) {
        class420 var2 = arg0.method115(this, (byte) 76, 5);
        while (var2.field5789 == 0) {
            class258.method1603(-649, 10L);
        }
        if (var2.field5789 == 2) {
            throw new RuntimeException();
        }
        this.field1377 = (Thread) var2.field5791;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpf;B)I")
    public static final int method625(class133 arg0, byte arg1) {
        field1372++;
        int var2 = arg0.method801((byte) -87, 2);
        if (arg1 <= 64) {
            method619(false);
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method801((byte) -87, 5);
        } else if (var2 == 2) {
            var3 = arg0.method801((byte) -87, 8);
        } else {
            var3 = arg0.method801((byte) -87, 11);
        }
        return var3;
    }
}
