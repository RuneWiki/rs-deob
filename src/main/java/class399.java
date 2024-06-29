import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class399 implements Runnable {

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lgfa;")
    private class150 field5291 = new class150();

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Z")
    private boolean field5298 = false;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public int field5299 = 0;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field5302;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field5293 = 503;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "[I")
    public static int[] field5289 = new int[32];

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "Lla;")
    public static class409 field5300;

    @OriginalMember(owner = "client!qt", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5298) {
            class150 var1 = this.field5291;
            class82 var2;
            synchronized (this.field5291) {
                var2 = (class82) this.field5291.method885((byte) -84);
                if (var2 == null) {
                    try {
                        this.field5291.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5299--;
            }
            try {
                if (var2.field952 == 2) {
                    var2.field955.method2786(var2.field957.length, (int) var2.field4564, 86, var2.field957);
                } else if (var2.field952 == 3) {
                    var2.field957 = var2.field955.method2790((byte) -46, (int) var2.field4564);
                }
            } catch (Exception var6) {
                class91.method499(null, var6, (byte) 3);
            }
            var2.field2536 = false;
        }
        field5296++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public final void method2278(int arg0) {
        field5287++;
        this.field5298 = true;
        class150 var2 = this.field5291;
        synchronized (this.field5291) {
            this.field5291.notifyAll();
            if (arg0 <= 19) {
                this.method2278(2);
            }
        }
        try {
            this.field5302.join();
        } catch (InterruptedException var3) {
        }
        this.field5302 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2279(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 != -1623128409) {
            field5300 = null;
        }
        field5286++;
        for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, arg0.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg1.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lga;B)V")
    public static final void method2280(class332 arg0, byte arg1) {
        field5294++;
        class570.field7766 = arg0.method1959(5743, "hitmarks");
        class324.field4371 = arg0.method1959(5743, "hitbar_default");
        class598.field8231 = arg0.method1959(5743, "timerbar_default");
        class10.field105 = arg0.method1959(5743, "headicons_pk");
        class259.field3390 = arg0.method1959(5743, "headicons_prayer");
        class119.field1513 = arg0.method1959(5743, "hint_headicons");
        if (arg1 < 119) {
            return;
        }
        class608.field8457 = arg0.method1959(5743, "hint_mapmarkers");
        class15.field208 = arg0.method1959(5743, "mapflag");
        class335.field4523 = arg0.method1959(5743, "cross");
        class601.field8395 = arg0.method1959(5743, "mapdots");
        class324.field4376 = arg0.method1959(5743, "scrollbar");
        class87.field1059 = arg0.method1959(5743, "name_icons");
        class565.field7709 = arg0.method1959(5743, "floorshadows");
        class312.field4203 = arg0.method1959(5743, "compass");
        class527.field7292 = arg0.method1959(5743, "otherlevel");
        class600.field8348 = arg0.method1959(5743, "hint_mapedge");
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILcr;)Lmq;")
    public final class82 method2281(int arg0, int arg1, class485 arg2) {
        if (arg0 > -76) {
            field5301 = 109;
        }
        field5297++;
        class82 var4 = new class82();
        var4.field952 = 1;
        class150 var5 = this.field5291;
        synchronized (this.field5291) {
            class82 var6 = (class82) this.field5291.method878(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field4564 && var6.field955 == arg2 && var6.field952 == 2) {
                    var4.field2536 = false;
                    var4.field957 = var6.field957;
                    return var4;
                }
                var6 = (class82) this.field5291.method880(-11278);
            }
        }
        var4.field957 = arg2.method2790((byte) -37, arg1);
        var4.field2538 = true;
        var4.field2536 = false;
        return var4;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILcr;)Lmq;")
    public final class82 method2282(boolean arg0, int arg1, class485 arg2) {
        field5284++;
        class82 var4 = new class82();
        var4.field955 = arg2;
        var4.field2538 = false;
        var4.field952 = 3;
        var4.field4564 = arg1;
        if (!arg0) {
            this.field5298 = true;
        }
        this.method2283(var4, (byte) -102);
        return var4;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lmq;B)V")
    private final void method2283(class82 arg0, byte arg1) {
        field5290++;
        class150 var3 = this.field5291;
        synchronized (this.field5291) {
            this.field5291.method879((byte) -127, arg0);
            this.field5299++;
            if (arg1 < -94) {
                this.field5291.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBLcr;[B)Lmq;")
    public final class82 method2284(int arg0, byte arg1, class485 arg2, byte[] arg3) {
        field5295++;
        class82 var5 = new class82();
        if (arg1 != -48) {
            field5289 = null;
        }
        var5.field955 = arg2;
        var5.field952 = 2;
        var5.field957 = arg3;
        var5.field4564 = arg0;
        var5.field2538 = false;
        this.method2283(var5, (byte) -119);
        return var5;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
    public static final int method2285(int arg0, int arg1) {
        field5285++;
        if (arg0 != -1623128409) {
            field5292 = 118;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public static void method2286(int arg0) {
        field5300 = null;
        if (arg0 == 29722) {
            field5289 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lgba;)V")
    public class399(class388 arg0) {
        class661 var2 = arg0.method2220(this, 5, (byte) 123);
        while (var2.field9420 == 0) {
            class588.method3253(0, 10L);
        }
        if (var2.field9420 == 2) {
            throw new RuntimeException();
        }
        this.field5302 = (Thread) var2.field9421;
    }
}
