import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lmm;")
    private class117 field3909 = new class117();

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public int field3913 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Z")
    private boolean field3912 = false;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field3914;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lhi;")
    public static class82 field3904 = class95.method664((byte) -119, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field3915 = 128;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[[S")
    public static short[][] field3919 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lhi;")
    public static class82 field3921 = class95.method664((byte) -61, "<col=00ff80>");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lum;")
    public static class222 field3905;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[Lgg;")
    public static class69[] field3907;

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (!this.field3912) {
            class117 var1 = this.field3909;
            class150 var2;
            synchronized (this.field3909) {
                var2 = (class150) this.field3909.method801(100);
                if (var2 == null) {
                    try {
                        this.field3909.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3913--;
            }
            try {
                if (var2.field2546 == 2) {
                    var2.field2549.method1963((int) var2.field824, -19849, var2.field2547.length, var2.field2547);
                } else if (var2.field2546 == 3) {
                    var2.field2547 = var2.field2549.method1964((byte) -82, (int) var2.field824);
                }
            } catch (Exception var7) {
                class48.method348(-2, (String) null, var7);
            }
            var2.field2433 = false;
        }
        field3911++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvh;B)V", line = 62)
    private final void method1608(class150 arg0, byte arg1) {
        if (arg1 != -34) {
            this.method1615((class282) null, -121, -46);
        }
        class117 var3 = this.field3909;
        synchronized (this.field3909) {
            this.field3909.method800((byte) -87, arg0);
            this.field3913++;
            this.field3909.notifyAll();
        }
        field3910++;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 245)
    public class226() {
        class301 var1 = class55.field881.method821(this, 5, (byte) -34);
        while (var1.field5121 == 0) {
            class290.method2001(10L, false);
        }
        if (var1.field5121 == 2) {
            throw new RuntimeException();
        }
        this.field3914 = (Thread) var1.field5122;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 92)
    public static final void method1609(int arg0, int arg1) {
        class78.field1330 = -1;
        class315.field5426 = arg0;
        field3920++;
        class78.field1330 = -1;
        class141.method963(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILph;)Lvh;", line = 107)
    public final class150 method1610(int arg0, int arg1, class282 arg2) {
        field3906++;
        class150 var4 = new class150();
        var4.field2546 = 1;
        class117 var5 = this.field3909;
        synchronized (this.field3909) {
            if (arg1 < 71) {
                this.method1614(-34);
            }
            class150 var6 = (class150) this.field3909.method803((byte) 97);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field824 && var6.field2549 == arg2 && var6.field2546 == 2) {
                    var4.field2433 = false;
                    var4.field2547 = var6.field2547;
                    return var4;
                }
                var6 = (class150) this.field3909.method802((byte) -71);
            }
        }
        var4.field2547 = arg2.method1964((byte) -64, arg0);
        var4.field2426 = true;
        var4.field2433 = false;
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLbc;)V", line = 145)
    public static final void method1611(boolean arg0, class153 arg1) {
        field3908++;
        if (arg0) {
            method1609(97, -9);
        }
        for (int var2 = 0; var2 < class104.field1849; var2++) {
            int var3 = arg1.method1050(-32768);
            int var4 = arg1.method1090(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class112.field2016[var3] != null) {
                class112.field2016[var3].field3582 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 175)
    public static void method1612(byte arg0) {
        field3907 = null;
        field3921 = null;
        if (arg0 < -60) {
            field3919 = (short[][]) null;
            field3904 = null;
            field3905 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lph;I[BI)Lvh;", line = 198)
    public final class150 method1613(class282 arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 19909) {
            field3916 = -27;
        }
        field3922++;
        class150 var5 = new class150();
        var5.field2547 = arg2;
        var5.field2426 = false;
        var5.field824 = (long) arg1;
        var5.field2549 = arg0;
        var5.field2546 = 2;
        this.method1608(var5, (byte) -34);
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 223)
    public final void method1614(int arg0) {
        this.field3912 = true;
        class117 var2 = this.field3909;
        synchronized (this.field3909) {
            this.field3909.notifyAll();
        }
        field3918++;
        try {
            this.field3914.join();
            if (arg0 != 24094) {
                method1612((byte) 91);
            }
        } catch (InterruptedException var5) {
        }
        this.field3914 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lph;II)Lvh;", line = 268)
    public final class150 method1615(class282 arg0, int arg1, int arg2) {
        field3917++;
        class150 var4 = new class150();
        var4.field2426 = false;
        var4.field824 = (long) arg1;
        var4.field2546 = 3;
        if (arg2 >= -15) {
            field3921 = (class82) null;
        }
        var4.field2549 = arg0;
        this.method1608(var4, (byte) -34);
        return var4;
    }
}
