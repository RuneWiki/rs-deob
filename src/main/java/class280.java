import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class280 implements Runnable {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ler;")
    private class54 field4481 = new class54();

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public int field4490 = 0;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Z")
    private boolean field4485 = false;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field4492;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    public static int[] field4480 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field4491 = -1;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4486 = null;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field4488 = new int[32];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILug;I)Lpk;")
    public final class108 method1908(int arg0, class333 arg1, int arg2) {
        field4493++;
        class108 var4 = new class108();
        var4.field1514 = 1;
        class54 var5 = this.field4481;
        synchronized (this.field4481) {
            class108 var6 = (class108) this.field4481.method364(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field86 && var6.field1508 == arg1 && var6.field1514 == 2) {
                    var4.field1510 = var6.field1510;
                    var4.field4129 = false;
                    return var4;
                }
                var6 = (class108) this.field4481.method361(50);
            }
        }
        if (arg2 >= -21) {
            return null;
        } else {
            var4.field1510 = arg1.method2206(arg0, 3);
            var4.field4127 = true;
            var4.field4129 = false;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method1909(int arg0) {
        class78 var1 = (class78) class43.field535.method2430(67);
        int var2 = -38 % ((arg0 + 53) / 63);
        while (var1 != null) {
            var1.method493();
            var1 = (class78) class43.field535.method2435(-224);
        }
        field4489++;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public final void method1910(int arg0) {
        this.field4485 = true;
        field4479++;
        class54 var2 = this.field4481;
        synchronized (this.field4481) {
            this.field4481.notifyAll();
        }
        if (arg0 < 21) {
            this.method1911((class108) null, (byte) 53);
        }
        try {
            this.field4492.join();
        } catch (InterruptedException var3) {
        }
        this.field4492 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lpk;B)V")
    private final void method1911(class108 arg0, byte arg1) {
        field4487++;
        class54 var3 = this.field4481;
        synchronized (this.field4481) {
            this.field4481.method363(true, arg0);
            if (arg1 <= 59) {
                this.method1913((class333) null, -108, -105);
            }
            this.field4490++;
            this.field4481.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public static void method1912(int arg0) {
        field4488 = null;
        field4486 = null;
        field4480 = null;
        int var1 = -10 / ((59 - arg0) / 39);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lug;II)Lpk;")
    public final class108 method1913(class333 arg0, int arg1, int arg2) {
        field4483++;
        class108 var4 = new class108();
        if (arg2 != 30384) {
            return null;
        }
        var4.field1508 = arg0;
        var4.field86 = (long) arg1;
        var4.field4127 = false;
        var4.field1514 = 3;
        this.method1911(var4, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
    public final void run() {
        field4482++;
        while (!this.field4485) {
            class54 var1 = this.field4481;
            class108 var2;
            synchronized (this.field4481) {
                var2 = (class108) this.field4481.method358(0);
                if (var2 == null) {
                    try {
                        this.field4481.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4490--;
            }
            try {
                if (var2.field1514 == 2) {
                    var2.field1508.method2204(var2.field1510, 8, (int) var2.field86, var2.field1510.length);
                } else if (var2.field1514 == 3) {
                    var2.field1510 = var2.field1508.method2206((int) var2.field86, 3);
                }
            } catch (Exception var6) {
                class272.method1845(var6, 122, (String) null);
            }
            var2.field4129 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lap;)V")
    public class280(class279 arg0) {
        class26 var2 = arg0.method1897(5, this, 2);
        while (var2.field304 == 0) {
            class84.method517((byte) 126, 10L);
        }
        if (var2.field304 == 2) {
            throw new RuntimeException();
        }
        this.field4492 = (Thread) var2.field305;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BLug;IZ)Lpk;")
    public final class108 method1914(byte[] arg0, class333 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field4491 = -116;
        }
        field4484++;
        class108 var5 = new class108();
        var5.field4127 = false;
        var5.field1508 = arg1;
        var5.field1514 = 2;
        var5.field1510 = arg0;
        var5.field86 = (long) arg2;
        this.method1911(var5, (byte) 105);
        return var5;
    }
}
