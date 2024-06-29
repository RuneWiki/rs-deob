import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class131 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lcc;")
    private class252 field2239 = new class252();

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field2246 = 0;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Z")
    private boolean field2249 = false;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field2252;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[B")
    public static byte[] field2243 = new byte[520];

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Z")
    public static boolean field2242 = true;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lsf;")
    private static class108 field2251 = class140.method973(255, "scroll:");

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[J")
    public static long[] field2244 = new long[500];

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lsf;")
    public static class108 field2247 = class140.method973(255, "_");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lsf;")
    public static class108 field2235 = field2251;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lsf;")
    public static class108 field2248 = null;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lsf;")
    public static class108 field2255 = field2251;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        while (!this.field2249) {
            class252 var1 = this.field2239;
            class237 var2;
            synchronized (this.field2239) {
                var2 = (class237) this.field2239.method1786(5807);
                if (var2 == null) {
                    try {
                        this.field2239.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2246--;
            }
            try {
                if (var2.field4153 == 2) {
                    var2.field4158.method1503(6642, (int) var2.field1520, var2.field4156.length, var2.field4156);
                } else if (var2.field4153 == 3) {
                    var2.field4156 = var2.field4158.method1500((int) var2.field1520, true);
                }
            } catch (Exception var7) {
                class171.method1188(64, (String) null, var7);
            }
            var2.field986 = false;
        }
        field2238++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 52)
    public final void method899(int arg0) {
        if (arg0 != 2) {
            return;
        }
        this.field2249 = true;
        class252 var2 = this.field2239;
        synchronized (this.field2239) {
            this.field2239.notifyAll();
        }
        field2236++;
        try {
            this.field2252.join();
        } catch (InterruptedException var5) {
        }
        this.field2252 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Li;II)Lkk;", line = 77)
    public final class237 method900(class218 arg0, int arg1, int arg2) {
        field2250++;
        class237 var4 = new class237();
        var4.field4153 = 3;
        var4.field4158 = arg0;
        var4.field999 = false;
        var4.field1520 = (long) arg1;
        this.method905(var4, 119);
        if (arg2 != 520) {
            this.method899(-108);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 249)
    public class131() {
        class205 var1 = class289.field5052.method954(this, 1, 5);
        while (var1.field3686 == 0) {
            class83.method556(10L, 125);
        }
        if (var1.field3686 == 2) {
            throw new RuntimeException();
        }
        this.field2252 = (Thread) var1.field3685;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 100)
    public static void method901(byte arg0) {
        field2235 = null;
        field2248 = null;
        field2255 = null;
        field2247 = null;
        field2251 = null;
        int var1 = 5 / ((arg0 - 25) / 39);
        field2244 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Li;[BII)Lkk;", line = 115)
    public final class237 method902(class218 arg0, byte[] arg1, int arg2, int arg3) {
        field2241++;
        class237 var5 = new class237();
        var5.field1520 = (long) arg3;
        var5.field4156 = arg1;
        var5.field4158 = arg0;
        var5.field4153 = arg2;
        var5.field999 = false;
        this.method905(var5, 127);
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lqi;", line = 141)
    public static final class306 method903(int arg0, int arg1) {
        field2245++;
        int var2 = 95 % ((arg0 - 43) / 43);
        class306 var3 = (class306) class141.field2483.method642((long) arg1, (byte) -125);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class88.field1388.method1868(12236, 1, arg1);
        class306 var5 = new class306();
        if (var4 != null) {
            var5.method2149(arg1, new class249(var4), false);
        }
        class141.field2483.method643((byte) -49, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Li;II)Lkk;", line = 186)
    public final class237 method904(class218 arg0, int arg1, int arg2) {
        field2253++;
        class237 var4 = new class237();
        if (arg2 != 3) {
            this.method902((class218) null, (byte[]) null, 117, -1);
        }
        var4.field4153 = 1;
        class252 var5 = this.field2239;
        synchronized (this.field2239) {
            class237 var6 = (class237) this.field2239.method1778(31);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field1520 && var6.field4158 == arg0 && var6.field4153 == 2) {
                    var4.field986 = false;
                    var4.field4156 = var6.field4156;
                    return var4;
                }
                var6 = (class237) this.field2239.method1783(-27042);
            }
        }
        var4.field4156 = arg0.method1500(arg1, true);
        var4.field999 = true;
        var4.field986 = false;
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lkk;I)V", line = 220)
    private final void method905(class237 arg0, int arg1) {
        field2240++;
        class252 var3 = this.field2239;
        synchronized (this.field2239) {
            this.field2239.method1784(arg0, true);
            this.field2246++;
            if (arg1 > 117) {
                this.field2239.notifyAll();
            }
        }
    }
}
