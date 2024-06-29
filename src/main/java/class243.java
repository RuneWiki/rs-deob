import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class243 implements Runnable {

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Ltr;")
    private class173 field3412 = new class173();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
    private boolean field3413 = false;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field3415 = 0;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3417;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    public static int[] field3410 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lke;")
    public static class295 field3405;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[[B")
    public static byte[][] field3411;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZBLir;Lir;)V", line = 7)
    public static final void method1577(boolean arg0, byte arg1, class185 arg2, class185 arg3) {
        class167.field2272 = arg2;
        if (arg1 == 13) {
            class399.field5851 = arg0;
            class398.field5833 = arg3;
            field3407++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfb;B)V", line = 21)
    public static final void method1578(class341 arg0, byte arg1) {
        field3414++;
        if (arg1 > -85) {
            field3405 = null;
        }
        byte[] var2 = new byte[24];
        if (class136.field1767 != null) {
            try {
                class136.field1767.method2419(0, 0L);
                class136.field1767.method2427(var2, -49);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2252(0, -847501448, 24, var2);
    }

    @OriginalMember(owner = "client!ha", name = "run", descriptor = "()V", line = 67)
    public final void run() {
        field3404++;
        while (!this.field3413) {
            class173 var1 = this.field3412;
            class249 var2;
            synchronized (this.field3412) {
                var2 = (class249) this.field3412.method1149(0);
                if (var2 == null) {
                    try {
                        this.field3412.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3415--;
            }
            try {
                if (var2.field3674 == 2) {
                    var2.field3682.method2161(var2.field3675.length, (byte) -109, (int) var2.field6404, var2.field3675);
                } else if (var2.field3674 == 3) {
                    var2.field3675 = var2.field3682.method2163((int) var2.field6404, 99);
                }
            } catch (Exception var6) {
                class266.method1780(1, (String) null, var6);
            }
            var2.field5227 = false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 114)
    public static void method1579(int arg0) {
        field3411 = null;
        field3405 = null;
        if (arg0 < 59) {
            method1579(39);
        }
        field3410 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[BLeg;)Loo;", line = 126)
    public final class249 method1580(int arg0, int arg1, byte[] arg2, class330 arg3) {
        field3418++;
        class249 var5 = new class249();
        var5.field5226 = false;
        var5.field3675 = arg2;
        var5.field6404 = (long) arg0;
        var5.field3682 = arg3;
        var5.field3674 = arg1;
        this.method1582(-1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILeg;)Loo;", line = 143)
    public final class249 method1581(int arg0, int arg1, class330 arg2) {
        field3416++;
        class249 var4 = new class249();
        var4.field3674 = 1;
        class173 var5 = this.field3412;
        synchronized (this.field3412) {
            class249 var6 = (class249) this.field3412.method1157(100);
            if (arg1 < 61) {
                field3411 = null;
            }
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field6404 && var6.field3682 == arg2 && var6.field3674 == 2) {
                    var4.field3675 = var6.field3675;
                    var4.field5227 = false;
                    return var4;
                }
                var6 = (class249) this.field3412.method1151((byte) 72);
            }
        }
        var4.field3675 = arg2.method2163(arg0, 115);
        var4.field5227 = false;
        var4.field5226 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lde;)V", line = 245)
    public class243(class364 arg0) {
        class225 var2 = arg0.method2397(this, false, 5);
        while (var2.field3104 == 0) {
            class31.method245(10L, 96);
        }
        if (var2.field3104 == 2) {
            throw new RuntimeException();
        }
        this.field3417 = (Thread) var2.field3105;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILoo;)V", line = 181)
    private final void method1582(int arg0, class249 arg1) {
        class173 var3 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1154(arg1, arg0 ^ arg0);
            this.field3415++;
            this.field3412.notifyAll();
        }
        field3406++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IILeg;)Loo;", line = 196)
    public final class249 method1583(int arg0, int arg1, class330 arg2) {
        field3409++;
        if (arg1 >= -8) {
            this.method1584((byte) 60);
        }
        class249 var4 = new class249();
        var4.field6404 = (long) arg0;
        var4.field5226 = false;
        var4.field3682 = arg2;
        var4.field3674 = 3;
        this.method1582(-1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 216)
    public final void method1584(byte arg0) {
        if (arg0 != 32) {
            return;
        }
        field3408++;
        this.field3413 = true;
        class173 var2 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.notifyAll();
        }
        try {
            this.field3417.join();
        } catch (InterruptedException var3) {
        }
        this.field3417 = null;
    }
}
