import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class502 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lnf;")
    private class389 field7671 = new class389();

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Z")
    private boolean field7674 = false;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field7675 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field7673;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Liu;")
    public static class390 field7665 = new class390(85, -2);

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lwt;")
    public static class194 field7672 = new class194("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "[[B")
    public static byte[][] field7676;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lwi;B)V")
    private final void method3020(class310 arg0, byte arg1) {
        class389 var3 = this.field7671;
        synchronized (this.field7671) {
            int var4 = 30 / ((arg1 - 50) / 39);
            this.field7671.method2342((byte) 93, arg0);
            this.field7675++;
            this.field7671.notifyAll();
        }
        field7670++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method3021(int arg0) {
        this.field7674 = true;
        field7662++;
        class389 var2 = this.field7671;
        synchronized (this.field7671) {
            this.field7671.notifyAll();
        }
        try {
            this.field7673.join();
            if (arg0 != 11636) {
                this.method3021(-101);
            }
        } catch (InterruptedException var3) {
        }
        this.field7673 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILek;I)Lwi;")
    public final class310 method3022(int arg0, class334 arg1, int arg2) {
        field7669++;
        class310 var4 = new class310();
        var4.field1127 = false;
        var4.field4510 = 3;
        var4.field4518 = arg1;
        var4.field1291 = arg2;
        if (arg0 != 2) {
            this.method3022(101, null, -84);
        }
        this.method3020(var4, (byte) 118);
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILqn;)I")
    public static final int method3023(byte arg0, int arg1, class44 arg2) {
        if (arg0 == 41) {
            field7668++;
            return -1;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lek;II)Lwi;")
    public final class310 method3024(class334 arg0, int arg1, int arg2) {
        field7664++;
        class310 var4 = new class310();
        var4.field4510 = 1;
        class389 var5 = this.field7671;
        synchronized (this.field7671) {
            class310 var6 = (class310) this.field7671.method2347((byte) -111);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1291 && var6.field4518 == arg0 && var6.field4510 == 2) {
                    var4.field4514 = var6.field4514;
                    var4.field1128 = false;
                    return var4;
                }
                var6 = (class310) this.field7671.method2341(123);
            }
        }
        var4.field4514 = arg0.method2019(arg2, arg1);
        var4.field1127 = true;
        var4.field1128 = false;
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method3025(int arg0) {
        if (arg0 >= 113) {
            field7672 = null;
            field7665 = null;
            field7676 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public static final void method3026(int arg0, int arg1) {
        field7666++;
        if (class322.method1928(arg0, 7387)) {
            class225.method1391(arg1, class181.field2591[arg0], (byte) -55);
        }
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
    public final void run() {
        field7667++;
        while (!this.field7674) {
            class389 var1 = this.field7671;
            class310 var2;
            synchronized (this.field7671) {
                var2 = (class310) this.field7671.method2344(1);
                if (var2 == null) {
                    try {
                        this.field7671.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field7675--;
            }
            try {
                if (var2.field4510 == 2) {
                    var2.field4518.method2023((byte) -74, var2.field4514, (int) var2.field1291, var2.field4514.length);
                } else if (var2.field4510 == 3) {
                    var2.field4514 = var2.field4518.method2019(1, (int) var2.field1291);
                }
            } catch (Exception var6) {
                class356.method2169(var6, null, (byte) 34);
            }
            var2.field1128 = false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lek;II[B)Lwi;")
    public final class310 method3027(class334 arg0, int arg1, int arg2, byte[] arg3) {
        field7663++;
        class310 var5 = new class310();
        var5.field4514 = arg3;
        var5.field4510 = arg1;
        var5.field1291 = arg2;
        var5.field4518 = arg0;
        var5.field1127 = false;
        this.method3020(var5, (byte) 123);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lqn;)V")
    public class502(class44 arg0) {
        class439 var2 = arg0.method332(this, 2, 5);
        while (var2.field6417 == 0) {
            class322.method1935(true, 10L);
        }
        if (var2.field6417 == 2) {
            throw new RuntimeException();
        }
        this.field7673 = (Thread) var2.field6416;
    }
}
