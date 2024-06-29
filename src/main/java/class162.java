import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class162 implements Runnable {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lga;")
    private class18 field2654 = new class18();

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field2655 = 0;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
    private boolean field2668 = false;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2657;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[I")
    public static int[] field2651 = new int[32];

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lbe;")
    public static class283 field2659 = class153.method941(-22, "null");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lbe;")
    public static class283 field2653 = class153.method941(-122, "::fps ");

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[I")
    public static int[] field2666 = new int[2048];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "F")
    public static float field2649;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lek;")
    public static class172 field2667;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[[[Lrd;")
    public static class160[][][] field2661;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 4)
    public final void method981(int arg0) {
        this.field2668 = true;
        field2662++;
        class18 var2 = this.field2654;
        synchronized (this.field2654) {
            this.field2654.notifyAll();
        }
        try {
            this.field2657.join();
        } catch (InterruptedException var5) {
        }
        if (arg0 != 1) {
            this.run();
        }
        this.field2657 = null;
    }

    @OriginalMember(owner = "client!hc", name = "run", descriptor = "()V", line = 28)
    public final void run() {
        field2660++;
        while (!this.field2668) {
            class18 var1 = this.field2654;
            class31 var2;
            synchronized (this.field2654) {
                var2 = (class31) this.field2654.method114((byte) 47);
                if (var2 == null) {
                    try {
                        this.field2654.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2655--;
            }
            try {
                if (var2.field474 == 2) {
                    var2.field478.method210(var2.field471.length, (int) var2.field3034, var2.field471, -29303);
                } else if (var2.field474 == 3) {
                    var2.field471 = var2.field478.method208(-32459, (int) var2.field3034);
                }
            } catch (Exception var6) {
                class296.method2011(true, (String) null, var6);
            }
            var2.field602 = false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[BLih;)Lkb;", line = 73)
    public final class31 method982(int arg0, int arg1, byte[] arg2, class30 arg3) {
        field2669++;
        if (arg0 >= -85) {
            return (class31) null;
        }
        class31 var5 = new class31();
        var5.field471 = arg2;
        var5.field474 = 2;
        var5.field3034 = (long) arg1;
        var5.field478 = arg3;
        var5.field600 = false;
        this.method983(var5, 2);
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lkb;I)V", line = 97)
    private final void method983(class31 arg0, int arg1) {
        field2664++;
        if (arg1 != 2) {
            method984(-103);
        }
        class18 var3 = this.field2654;
        synchronized (this.field2654) {
            this.field2654.method111(arg1 + 74, arg0);
            this.field2655++;
            this.field2654.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 189)
    public class162() {
        class310 var1 = class150.field2460.method1691(5, 25, this);
        while (var1.field5293 == 0) {
            class2.method11((byte) -20, 10L);
        }
        if (var1.field5293 == 2) {
            throw new RuntimeException();
        }
        this.field2657 = (Thread) var1.field5296;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 130)
    public static void method984(int arg0) {
        field2667 = null;
        field2661 = (class160[][][]) null;
        field2653 = null;
        if (arg0 < 12) {
            method988((Object[]) null, 99, (long[]) null, false, 63);
        }
        field2659 = null;
        field2666 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Z", line = 166)
    public static final boolean method985(boolean arg0, int arg1) {
        field2665++;
        if (class245.field4173 != arg1) {
            if (!arg0) {
                field2649 = -1.1799226F;
            }
            return false;
        }
        class245.field4173++;
        class286.field4870 = true;
        if (class245.field4173 > 65535) {
            class245.field4173 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lih;II)Lkb;", line = 213)
    public final class31 method986(class30 arg0, int arg1, int arg2) {
        field2656++;
        class31 var4 = new class31();
        var4.field474 = arg1;
        class18 var5 = this.field2654;
        synchronized (this.field2654) {
            class31 var6 = (class31) this.field2654.method106(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field3034 && var6.field478 == arg0 && var6.field474 == 2) {
                    var4.field602 = false;
                    var4.field471 = var6.field471;
                    return var4;
                }
                var6 = (class31) this.field2654.method110((byte) -41);
            }
        }
        var4.field471 = arg0.method208(-32459, arg2);
        var4.field600 = true;
        var4.field602 = false;
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILih;)Lkb;", line = 245)
    public final class31 method987(int arg0, int arg1, class30 arg2) {
        class31 var4 = new class31();
        var4.field474 = 3;
        if (arg1 != 32) {
            return (class31) null;
        }
        var4.field3034 = (long) arg0;
        var4.field478 = arg2;
        field2658++;
        var4.field600 = false;
        this.method983(var4, arg1 - 30);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Ljava/lang/Object;I[JZI)V", line = 265)
    public static final void method988(Object[] arg0, int arg1, long[] arg2, boolean arg3, int arg4) {
        field2652++;
        if (arg4 < arg1) {
            int var5 = arg4;
            int var6 = (arg1 + arg4) / 2;
            long var7 = arg2[var6];
            arg2[var6] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if (arg2[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var5];
                    arg2[var5] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5++] = var13;
                }
            }
            arg2[arg1] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var9;
            method988(arg0, var5 - 1, arg2, true, arg4);
            method988(arg0, arg1, arg2, true, var5 + 1);
        }
        if (!arg3) {
            method988((Object[]) null, 38, (long[]) null, true, -116);
        }
    }
}
