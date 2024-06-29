import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class201 implements Runnable {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lrp;")
    private class369 field2408 = new class369();

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
    private boolean field2412 = false;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public int field2414 = 0;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field2418;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    public static int[] field2407 = new int[32];

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lcea;")
    public static class180 field2417;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "[[Z")
    public static boolean[][] field2419;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2407[var1] = var0 - 1;
            var0 += var0;
        }
        field2417 = new class180("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILes;)Ldm;", line = 3)
    public final class46 method1080(int arg0, int arg1, class320 arg2) {
        field2410++;
        class46 var4 = new class46();
        var4.field397 = 1;
        class369 var5 = this.field2408;
        synchronized (this.field2408) {
            class46 var6 = (class46) this.field2408.method2066((byte) -82);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field67 && var6.field390 == arg2 && var6.field397 == 2) {
                    var4.field8322 = false;
                    var4.field393 = var6.field393;
                    return var4;
                }
                var6 = (class46) this.field2408.method2068(true);
            }
        }
        var4.field393 = arg2.method1766(4, arg1);
        var4.field8321 = true;
        var4.field8322 = false;
        if (arg0 != 32) {
            this.method1080(73, 70, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 41)
    public final void method1081(int arg0) {
        field2406++;
        this.field2412 = true;
        class369 var2 = this.field2408;
        synchronized (this.field2408) {
            this.field2408.notifyAll();
        }
        try {
            if (arg0 != -4) {
                this.method1083(14, null, null, 45);
            }
            this.field2418.join();
        } catch (InterruptedException var3) {
        }
        this.field2418 = null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lpq;)V", line = 201)
    public class201(class165 arg0) {
        class506 var2 = arg0.method901((byte) -121, 5, this);
        while (var2.field7031 == 0) {
            class462.method2688(10L, (byte) 110);
        }
        if (var2.field7031 == 2) {
            throw new RuntimeException();
        }
        this.field2418 = (Thread) var2.field7030;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IILes;)Ldm;", line = 72)
    public final class46 method1082(int arg0, int arg1, class320 arg2) {
        field2413++;
        class46 var4 = new class46();
        var4.field8321 = false;
        var4.field397 = arg1;
        var4.field67 = arg0;
        var4.field390 = arg2;
        this.method1084((byte) 94, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BLes;I)Ldm;", line = 87)
    public final class46 method1083(int arg0, byte[] arg1, class320 arg2, int arg3) {
        field2409++;
        class46 var5 = new class46();
        var5.field67 = arg3;
        var5.field393 = arg1;
        var5.field8321 = false;
        var5.field390 = arg2;
        if (arg0 != -21313) {
            this.method1083(-44, null, null, 126);
        }
        var5.field397 = 2;
        this.method1084((byte) -26, var5);
        return var5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLdm;)V", line = 125)
    private final void method1084(byte arg0, class46 arg1) {
        int var3 = -43 / ((arg0 - 45) / 46);
        field2411++;
        class369 var4 = this.field2408;
        synchronized (this.field2408) {
            this.field2408.method2070(arg1, -54);
            this.field2414++;
            this.field2408.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bj", name = "run", descriptor = "()V", line = 140)
    public final void run() {
        field2416++;
        while (!this.field2412) {
            class369 var1 = this.field2408;
            class46 var2;
            synchronized (this.field2408) {
                var2 = (class46) this.field2408.method2072(false);
                if (var2 == null) {
                    try {
                        this.field2408.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2414--;
            }
            try {
                if (var2.field397 == 2) {
                    var2.field390.method1768(17870, var2.field393, (int) var2.field67, var2.field393.length);
                } else if (var2.field397 == 3) {
                    var2.field393 = var2.field390.method1766(4, (int) var2.field67);
                }
            } catch (Exception var6) {
                class443.method2597(var6, null, (byte) 95);
            }
            var2.field8322 = false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 191)
    public static void method1085(byte arg0) {
        field2407 = null;
        int var1 = 63 % ((-arg0 - 59) / 58);
        field2417 = null;
        field2419 = null;
    }
}
